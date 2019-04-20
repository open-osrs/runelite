package net.runelite.client.mixins.transformers;

import org.objectweb.asm.commons.Remapper;

public class ProtectTransformer extends Remapper
{
	
	public String mapFieldName(String owner, String name, String descriptor)
	{
		if (name.startsWith("1protect$"))
		{
			name = name.substring("1protect$".length());
		}
		return super.mapFieldName(owner, name, descriptor);
	}
	
	public String mapMethodName(String owner, String name, String descriptor)
	{
		if (name.startsWith("1protect$"))
		{
			name = name.substring("1protect$".length());
		}
		return super.mapMethodName(owner, name, descriptor);
	}
	
}
