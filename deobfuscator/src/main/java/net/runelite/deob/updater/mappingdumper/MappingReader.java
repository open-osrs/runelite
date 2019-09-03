package net.runelite.deob.updater.mappingdumper;

import com.google.common.base.Stopwatch;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.asm.pool.Field;
import net.runelite.asm.pool.Method;
import net.runelite.deob.DeobProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MappingReader
{
	private final Logger log = LoggerFactory.getLogger(MappingReader.class);
	private final File file;
	private final int expectedRev;

	public MappingReader(File file)
	{
		this(file, -1);
	}

	public MappingReader(File file, int expectedRev)
	{
		this.file = file;
		this.expectedRev = expectedRev;

		if (expectedRev != -1 && expectedRev > Integer.valueOf(DeobProperties.getRevision()))
		{
			throw new IllegalArgumentException("The dump rev can't be higher than current rev");
		}
	}

	public MappingDump read()
	{
		Stopwatch st = Stopwatch.createStarted();
		final MappingDump dump = new MappingDump();

		try (JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)))
		{
			// Start MappingDump
			reader.beginObject();
			// Reads until we've arrived at the classes
			while (reader.hasNext() && readDumpProperty(reader, dump));

			dump.classes = new ArrayList<>(dump.totalClasses);

			reader.beginArray();

			while (reader.hasNext())
			{
				readClass(reader, dump);
			}

			reader.endArray();
			reader.endObject();
		}
		catch (IOException e)
		{
			log.error("Error reading mapping file", e);
		}

		log.info("Completely read dump in {}", st.toString());
		return dump;
	}

	/**
	 * returns false if we're done reading all fields, and we're onto the array
	 */
	private boolean readDumpProperty(final JsonReader reader, final MappingDump dump) throws IOException
	{
		switch (reader.nextName())
		{
			case "revision":
				dump.revision = reader.nextInt();

				if (this.expectedRev != -1 && dump.revision != expectedRev)
				{
					throw new IllegalArgumentException("Provided file isn't the same rev as was expected");
				}
				return true;
			case "totalClasses":
				dump.totalClasses = reader.nextInt();
				return true;
			case "totalNamedClasses":
				dump.totalNamedClasses = reader.nextInt();
				return true;
			case "totalFields":
				dump.totalFields = reader.nextInt();
				return true;
			case "totalNamedFields":
				dump.totalNamedFields = reader.nextInt();
				return true;
			case "totalNonStaticFields":
				dump.totalNonStaticFields = reader.nextInt();
				return true;
			case "totalNamedNonStaticFields":
				dump.totalNamedNonStaticFields = reader.nextInt();
				return true;
			case "totalStaticFields":
				dump.totalStaticFields = reader.nextInt();
				return true;
			case "totalNamedStaticFields":
				dump.totalNamedStaticFields = reader.nextInt();
				return true;
			case "totalMethods":
				dump.totalMethods = reader.nextInt();
				return true;
			case "totalNamedMethods":
				dump.totalNamedMethods = reader.nextInt();
				return true;
			case "totalNonStaticMethods":
				dump.totalNonStaticMethods = reader.nextInt();
				return true;
			case "totalNamedNonStaticMethods":
				dump.totalNamedNonStaticMethods = reader.nextInt();
				return true;
			case "totalStaticMethods":
				dump.totalStaticMethods = reader.nextInt();
				return true;
			case "totalNamedStaticMethods":
				dump.totalNamedStaticMethods = reader.nextInt();
				return true;
			case "mappedClasses":
				return false;
			default:
				throw new IllegalStateException("Invalid json field in mappingdump object");
		}
	}

	private void readClass(final JsonReader reader, final MappingDump dump) throws IOException
	{
		final MappedClass mc = new MappedClass();

		reader.beginObject();

		while (reader.hasNext())
		{
			switch (reader.nextName())
			{
				case "class":
					mc.implementingName = reader.nextString();
					continue;
				case "name":
					mc.obfuscatedName = reader.nextString();
					continue;
				case "super":
					mc.superClass = reader.nextString();
					continue;
				case "access":
					mc.access = reader.nextInt();
					continue;
				case "interfaces":
					mc.interfaces = new ArrayList<>();

					reader.beginArray();

					while (reader.hasNext())
					{
						mc.interfaces.add(reader.nextString());
					}

					reader.endArray();

					continue;
				case "fields":
					mc.fields = new ArrayList<>();

					readFields(reader, mc);
					continue;
				case "methods":
					mc.methods = new ArrayList<>();

					readMethods(reader, mc);
					continue;
				default:
					throw new IllegalStateException("Invalid json field in mappedclass object");
			}
		}

		reader.endObject();

		dump.classes.add(mc);
	}

	private void readFields(final JsonReader reader, final MappedClass mc) throws IOException
	{
		reader.beginArray();

		while (reader.hasNext())
		{
			final MappedField mf = new MappedField();

			reader.beginObject();
			while (reader.hasNext())
			{
				switch (reader.nextName())
				{
					case "field":
						mf.exportedName = reader.nextString();
						continue;
					case "owner":
						mf.owner = reader.nextString();
						continue;
					case "name":
						mf.obfuscatedName = reader.nextString();
						continue;
					case "access":
						mf.access = reader.nextInt();
						continue;
					case "descriptor":
						mf.descriptor = reader.nextString();
						continue;
					case "decoder":
						long dec = reader.nextLong();
						if (dec > Integer.MAX_VALUE || dec < Integer.MIN_VALUE)
						{
							mf.decoder = dec;
						}
						else
						{
							mf.decoder = (int) dec;
						}
						continue;
					case "puts":
						mf.puts = new HashMap<>();

						readMap(reader, mf.puts, Method.class);
						continue;
					case "gets":
						mf.gets = new HashMap<>();

						readMap(reader, mf.gets, Method.class);
						continue;
					default:
						throw new IllegalStateException("Invalid json field in mappedfield object");
				}
			}
			reader.endObject();

			mc.fields.add(mf);
		}

		reader.endArray();
	}

	private void readMethods(final JsonReader reader, final MappedClass mc) throws IOException
	{
		reader.beginArray();

		while (reader.hasNext())
		{
			final MappedMethod mm = new MappedMethod();

			reader.beginObject();
			while (reader.hasNext())
			{
				switch (reader.nextName())
				{
					case "method":
						mm.exportedName = reader.nextString();
						continue;
					case "owner":
						mm.owner = reader.nextString();
						continue;
					case "name":
						mm.obfuscatedName = reader.nextString();
						continue;
					case "access":
						mm.access = reader.nextInt();
						continue;
					case "parameters":
						mm.parameters = new ArrayList<>();

						reader.beginArray();

						while (reader.hasNext())
						{
							mm.parameters.add(reader.nextString());
						}

						reader.endArray();
						continue;
					case "descriptor":
						mm.descriptor = reader.nextString();
						continue;
					case "garbageValue":
						mm.garbageValue = reader.nextString();
						continue;
					case "lineNumbers":
						mm.lineNumbers = new ArrayList<>();

						reader.beginArray();

						while (reader.hasNext())
						{
							mm.lineNumbers.add(reader.nextInt());
						}

						reader.endArray();
						continue;
					case "fieldGets":
						mm.fieldGets = new HashMap<>();

						readMap(reader, mm.fieldGets, Field.class);
						continue;
					case "fieldPuts":
						mm.fieldPuts = new HashMap<>();

						readMap(reader, mm.fieldPuts, Field.class);
						continue;
					case "dependencies":
						mm.dependencies = new HashMap<>();

						readMap(reader, mm.dependencies, Method.class);
						continue;
					default:
						throw new IllegalStateException("Invalid json field in MappedMethod object");
				}
			}
			reader.endObject();

			mc.methods.add(mm);
		}

		reader.endArray();
	}

	private void readMap(final JsonReader reader, final Map map, final Class<?> keyType) throws IOException
	{
		reader.beginObject();

		while (reader.hasNext())
		{
			final String key = reader.nextName();
			final int val = reader.nextInt();

			if (keyType == Method.class)
			{
				map.put(Method.of(key), val);
			}
			else if (keyType == Field.class)
			{
				map.put(Field.of(key), val);
			}
		}

		reader.endObject();
	}
}
