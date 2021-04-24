/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector;

import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injection.InjectTaskHandler;
import com.openosrs.injector.injectors.CreateAnnotations;
import com.openosrs.injector.injectors.InjectConstruct;
import com.openosrs.injector.injectors.InterfaceInjector;
import com.openosrs.injector.injectors.MixinInjector;
import com.openosrs.injector.injectors.RSApiInjector;
import com.openosrs.injector.injectors.raw.AddPlayerToMenu;
import com.openosrs.injector.injectors.raw.ClearColorBuffer;
import com.openosrs.injector.injectors.raw.DrawMenu;
import com.openosrs.injector.injectors.raw.Occluder;
import com.openosrs.injector.injectors.raw.RasterizerAlpha;
import com.openosrs.injector.injectors.raw.RenderDraw;
import com.openosrs.injector.injectors.raw.ScriptVM;
import com.openosrs.injector.rsapi.RSApi;
import com.openosrs.injector.transformers.InjectTransformer;
import com.openosrs.injector.transformers.Java8Ifier;
import com.openosrs.injector.transformers.SourceChanger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Objects;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.util.EnumConverter;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.deob.util.JarUtil;
import static net.runelite.deob.util.JarUtil.load;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;

public class Injector extends InjectData implements InjectTaskHandler
{
	static final Logger log = Logging.getLogger(Injector.class);
	static Injector injector = new Injector();

	public static void main(String[] args)
	{
		OptionParser parser = new OptionParser();

		ArgumentAcceptingOptionSpec<File> vanillaFileOption =
			parser.accepts("vanilla", "Vanilla OSRS gamepack file")
				.withRequiredArg().ofType(File.class);

		ArgumentAcceptingOptionSpec<String> oprsVerOption =
			parser.accepts("version", "OpenOSRS version")
				.withRequiredArg().ofType(String.class);

		ArgumentAcceptingOptionSpec<File> outFileOption =
			parser.accepts("output", "Output file, jar if outmode is jar, folder if outmode is files")
				.withRequiredArg().ofType(File.class);

		ArgumentAcceptingOptionSpec<OutputMode> outModeOption =
			parser.accepts("outmode")
				.withRequiredArg().ofType(OutputMode.class)
				.withValuesConvertedBy(new EnumConverter<>(OutputMode.class)
				{
					@Override
					public OutputMode convert(String value)
					{
						return super.convert(value.toUpperCase());
					}
				});

		OptionSet options = parser.parse(args);
		String oprsVer = options.valueOf(oprsVerOption);

		injector.vanilla = load(options.valueOf(vanillaFileOption));
		injector.deobfuscated = load(
			new File("../runescape-client/build/libs/runescape-client-" + oprsVer + ".jar"));
		injector.rsApi = new RSApi(Objects.requireNonNull(
			new File("../runescape-api/build/classes/java/main/net/runelite/rs/api/")
				.listFiles()));
		injector.mixins = load(
			new File("../runelite-mixins/build/libs/runelite-mixins-" + oprsVer + ".jar"));

		File oldInjected = new File("../runelite-client/src/main/resources/net/runelite/client/injected-client.oprs");
		if (oldInjected.exists())
		{
			oldInjected.delete();
		}

		injector.initToVanilla();
		injector.injectVanilla();
		save(injector.getVanilla(), options.valueOf(outFileOption), options.valueOf(outModeOption));
	}

	public void injectVanilla()
	{
		log.debug("[DEBUG] Starting injection");

		transform(new Java8Ifier(this));

		inject(new CreateAnnotations(this));

		inject(new InterfaceInjector(this));

		inject(new RasterizerAlpha(this));

		inject(new MixinInjector(this));

		// This is where field hooks runs

		// This is where method hooks runs

		inject(new InjectConstruct(this));

		inject(new RSApiInjector(this));

		//inject(new DrawAfterWidgets(this));

		inject(new ScriptVM(this));

		// All GPU raw injectors should probably be combined, especially RenderDraw and Occluder
		inject(new ClearColorBuffer(this));

		inject(new RenderDraw(this));

		inject(new Occluder(this));

		inject(new DrawMenu(this));

		inject(new AddPlayerToMenu(this));

		validate(new InjectorValidator(this));

		transform(new SourceChanger(this));
	}

	private void inject(com.openosrs.injector.injectors.Injector injector)
	{
		final String name = injector.getName();

		log.lifecycle("[INFO] Starting {}", name);

		injector.start();

		injector.inject();

		log.lifecycle("{} {}", name, injector.getCompletionMsg());

		if (injector instanceof Validator)
		{
			validate((Validator) injector);
		}
	}

	private void validate(Validator validator)
	{
		final String name = validator.getName();

		if (!validator.validate())
		{
			throw new InjectException(name + " failed validation");
		}
	}

	private void transform(InjectTransformer transformer)
	{
		final String name = transformer.getName();

		log.info("[INFO] Starting {}", name);

		transformer.transform();

		log.lifecycle("{} {}", name, transformer.getCompletionMsg());
	}

	private static void save(ClassGroup group, File output, OutputMode mode)
	{
		if (output.exists())
		{
			try
			{
				Files.walk(output.toPath()).sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
			}
			catch (IOException e)
			{
				log.info("Failed to delete output directory contents.");
				throw new RuntimeException(e);
			}
		}

		switch (mode)
		{
			case FILES:
				saveFiles(group, output);
				break;
			case JAR:
				output.getParentFile().mkdirs();
				JarUtil.save(group, output);
				break;
		}
	}

	private static void saveFiles(ClassGroup group, File outDir)
	{
		try
		{
			outDir.mkdirs();

			for (ClassFile cf : group.getClasses())
			{
				File f = new File(outDir, cf.getName() + ".class");
				byte[] data = JarUtil.writeClass(group, cf);
				Files.write(f.toPath(), data);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void runChildInjector(com.openosrs.injector.injectors.Injector injector)
	{
		inject(injector);
	}
}
