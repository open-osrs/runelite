package net.runelite.deob.deobfuscators.mapping;

import java.io.File;
import java.util.Map;
import static junit.framework.TestCase.assertEquals;
import net.runelite.deob.DeobTestProperties;
import net.runelite.deob.updater.MappingDumper;
import net.runelite.deob.updater.mappingdumper.MappedClass;
import net.runelite.deob.updater.mappingdumper.MappedField;
import net.runelite.deob.updater.mappingdumper.MappedMethod;
import net.runelite.deob.updater.mappingdumper.MappingDump;
import net.runelite.deob.updater.mappingdumper.MappingReader;
import net.runelite.deob.util.JarUtil;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MappingReaderTest
{
	private File tempFile;
	private MappingDump dumped, read;
	private MappingDumper dumper;

	@Rule
	public DeobTestProperties properties = new DeobTestProperties();

	@Before
	public void before() throws Exception
	{
		tempFile = File.createTempFile("mrt-temp-hooks", null, null);
		dumper = new MappingDumper(JarUtil.loadJar(new File(properties.getRsClient())));
		dumped = dumper.dump();
		dumper.writeJson(dumped, tempFile);
	}

	@Test
	public void testReading()
	{
		boolean errored = false;
		try
		{
			MappingReader reader = new MappingReader(tempFile, properties.getRsVersion() + 1);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
			errored = true;
		}

		assert errored;

		errored = false;
		try
		{
			MappingReader reader = new MappingReader(tempFile, 22);
			read = reader.read();
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
			errored = true;
		}

		assert errored;

		final MappingReader reader = new MappingReader(tempFile, dumped.revision);
		read = reader.read();

		assert dumped.revision == read.revision;
		assert dumped.totalClasses == read.totalClasses;
		assert dumped.totalNamedClasses == read.totalNamedClasses;
		assert dumped.totalFields == read.totalFields;
		assert dumped.totalNamedFields == read.totalNamedFields;
		assert dumped.totalNonStaticFields == read.totalNonStaticFields;
		assert dumped.totalNamedNonStaticFields == read.totalNamedNonStaticFields;
		assert dumped.totalStaticFields == read.totalStaticFields;
		assert dumped.totalNamedStaticFields == read.totalNamedStaticFields;
		assert dumped.totalMethods == read.totalMethods;
		assert dumped.totalNamedMethods == read.totalNamedMethods;
		assert dumped.totalNonStaticMethods == read.totalNonStaticMethods;
		assert dumped.totalNamedNonStaticMethods == read.totalNamedNonStaticMethods;
		assert dumped.totalStaticMethods == read.totalStaticMethods;
		assert dumped.totalNamedStaticMethods == read.totalNamedStaticMethods;

		assert dumped.classes.size() == read.classes.size();
		for (int i = 0; i < dumped.classes.size(); i++)
		{
			MappedClass a = dumped.classes.get(i);
			MappedClass b = read.classes.get(i);

			assertEquals(a.implementingName, b.implementingName);
			assertEquals(a.obfuscatedName, b.obfuscatedName);
			assertEquals(a.superClass, b.superClass);

			assert a.access == b.access;
			assert a.interfaces.size() == b.interfaces.size();
			assert a.methods.size() == b.methods.size();
			assert a.fields.size() == b.fields.size();

			for (int i2 = 0; i2 < a.interfaces.size(); i2++)
			{
				assertEquals(a.interfaces.get(i2), b.interfaces.get(i2));
			}

			for (int i2 = 0; i2 < a.fields.size(); i2++)
			{
				MappedField fa = a.fields.get(i2);
				MappedField fb = b.fields.get(i2);

				assert fa.access == fb.access;
				assertEquals(fa.decoder, fb.decoder);

				assertEquals(fa.exportedName, fb.exportedName);
				assertEquals(fa.owner, fb.owner);
				assertEquals(fa.obfuscatedName, fb.obfuscatedName);
				assertEquals(fa.descriptor, fb.descriptor);

				assert fa.gets.size() == fb.gets.size();
				assert fa.puts.size() == fb.puts.size();
				assert fa.gets.entrySet().containsAll(fb.gets.entrySet());
				assert fb.gets.entrySet().containsAll(fa.gets.entrySet());
				assert fa.puts.entrySet().containsAll(fb.puts.entrySet());
				assert fb.puts.entrySet().containsAll(fa.puts.entrySet());
			}

			for (int i2 = 0; i2 < a.methods.size(); i2++)
			{
				MappedMethod ma = a.methods.get(i2);
				MappedMethod mb = b.methods.get(i2);

				assert ma.access == mb.access;
				assertEquals(ma.garbageValue, mb.garbageValue);

				assertEquals(ma.exportedName, mb.exportedName);
				assertEquals(ma.owner, mb.owner);
				assertEquals(ma.obfuscatedName, mb.obfuscatedName);
				assertEquals(ma.descriptor, mb.descriptor);

				assert ma.dependencies.size() == mb.dependencies.size();
				for (Map.Entry e : ma.dependencies.entrySet())
				{
					System.out.println(e.toString());
				}
				for (Map.Entry e : mb.dependencies.entrySet())
				{
					System.out.println(e.toString());
				}


				assert ma.fieldGets.entrySet().containsAll(mb.fieldGets.entrySet());
				assert mb.fieldGets.entrySet().containsAll(ma.fieldGets.entrySet());
				assert ma.fieldPuts.entrySet().containsAll(mb.fieldPuts.entrySet());
				assert mb.fieldPuts.entrySet().containsAll(ma.fieldPuts.entrySet());

				for (int i3 = 0; i3 < ma.parameters.size(); i3++)
				{
					assertEquals(ma.parameters.get(i3), mb.parameters.get(i3));
				}

				if (ma.lineNumbers == null && mb.lineNumbers == null)
				{
					continue;
				}
				for (int i3 = 0; i3 < ma.lineNumbers.size(); i3++)
				{
					if (ma.lineNumbers.get(i3) == null && mb.lineNumbers.get(i3) == null)
					{
						continue;
					}

					assert (ma.lineNumbers.get(i3) != null && mb.lineNumbers.get(i3) != null);
					assert ma.lineNumbers.get(i3).longValue() == mb.lineNumbers.get(i3).longValue();
				}
			}
		}

		tempFile.deleteOnExit();
	}
}
