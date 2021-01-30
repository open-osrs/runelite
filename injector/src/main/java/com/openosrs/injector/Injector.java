/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this source tree.
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
import com.openosrs.injector.transformers.SourceChanger;
import static net.runelite.deob.util.JarUtil.load;
import static net.runelite.deob.util.JarUtil.save;
import java.io.File;
import java.util.Objects;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;

public class Injector extends InjectData implements InjectTaskHandler
{
	static final Logger log = Logging.getLogger(Injector.class);
	static Injector injector = new Injector();
	static File injectedClient =
		new File("./build/libs/injected-client.jar");

	public static void main(String[] args)
	{
		injector.vanilla = load(new File(args[0]));
		injector.deobfuscated = load(
			new File("./lib/runescape-client-mobile.jar"));
		injector.rsApi = new RSApi(Objects.requireNonNull(
			new File("../runescape-api/build/classes/java/main/net/runelite/rs/api/")
				.listFiles()));
		injector.mixins = load(
			new File("../runelite-mixins/build/libs/runelite-mixins-" + args[1] + ".jar"));
		injector.initToVanilla();
		injector.injectVanilla();
		save(injector.getVanilla(), injectedClient);
	}

	public void injectVanilla()
	{
		log.debug("[DEBUG] Starting injection");

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

		log.info("[INFO] Starting {}", name);

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

	public void runChildInjector(com.openosrs.injector.injectors.Injector injector)
	{
		inject(injector);
	}
}
