package net.runelite.deob.updater;

import com.google.common.base.Strings;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Named;
import net.runelite.asm.attributes.Annotated;
import net.runelite.deob.Deob;
import net.runelite.deob.DeobAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnnotationAdder
{
	AnnotationAdder(ClassGroup group)
	{
		this.group = group;
	}

	private final ClassGroup group;
	private final Logger log = LoggerFactory.getLogger(AnnotationAdder.class);

	public void run()
	{
		int impl = 0;
		int meth = 0;
		int field = 0;

		for (ClassFile c : group.getClasses())
		{
			if (c.getName().contains("runelite"))
			{
				continue;
			}

			log.debug("Checking {}", c.toString());

			String implementingName = DeobAnnotations.getImplements(c);
			if (!Strings.isNullOrEmpty(implementingName))
			{
				// Still error here cause I don't wanna call classes dumb shit
				assert implementingName.equals(c.getClassName()) : c + " implements " + implementingName + " but is called " + c.getClassName();
			}
			else if (!Deob.isObfuscated(c.getClassName()))
			{
				c.addAnnotation(DeobAnnotations.IMPLEMENTS, c.getClassName());
				impl++;
			}

			for (Field f : c.getFields())
			{
				if (addExport(f))
					field++;
			}

			for (Method m : c.getMethods())
			{
				if (addExport(m))
					meth++;
			}
		}

		log.info("Changed {} classes, {} methods, {} fields", impl, meth, field);
	}

	private <T extends Annotated & Named> boolean addExport(T m)
	{
		String methodName = m.getName();
		String exportedName = DeobAnnotations.getExportedName(m);

		if (exportedName == null && Deob.isObfuscated(methodName)
			|| methodName.equals(DeobAnnotations.getObfuscatedName(m))
			|| DeobAnnotations.getObfuscatedName(m) == null
			|| methodName.equals(exportedName))
		{
			return false;
		}

		log.debug("Changed export from {} to {}", exportedName, methodName);
		m.findAnnotation(DeobAnnotations.EXPORT, true).setElement(methodName);
		return true;
	}
}
