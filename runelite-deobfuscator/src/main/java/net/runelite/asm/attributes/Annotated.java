package net.runelite.asm.attributes;

import java.util.Map;
import net.runelite.asm.Annotation;
import net.runelite.asm.Type;

/**
 * Objects implementing this only have to implement getAnnotations.
 */
public interface Annotated
{
	Map<Type, Annotation> getAnnotations();

	default Annotation findAnnotation(Type type, boolean createNew)
	{
		if (createNew)
			return getAnnotations().computeIfAbsent(type, Annotation::new);
		else
			return getAnnotations().get(type);
	}

	default Annotation findAnnotation(Type type)
	{
		return findAnnotation(type, false);
	}

	default void addAnnotation(Annotation annotation)
	{
		if (getAnnotations().put(annotation.getType(), annotation) != null)
			throw new IllegalStateException("Annotation with type " + annotation.getType() + " already exists");
	}

	default void addAnnotation(Type type)
	{
		if (getAnnotations().put(type, new Annotation(type)) != null)
			throw new IllegalStateException("Annotation with type " + type + " already exists");
	}

	default void addAnnotation(Type type, Object val)
	{
		getAnnotations().put(type, new Annotation(type, val));
	}

	default void addAnnotation(Type type, String key, Object val)
	{
		final var a = new Annotation(type);
		a.setElement(key, val);
		if (getAnnotations().put(type, a) != null)
			throw new IllegalStateException("Annotation with type " + type + " already exists");
	}
}
