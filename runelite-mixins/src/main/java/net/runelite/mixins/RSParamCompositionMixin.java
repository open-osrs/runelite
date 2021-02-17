package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSParamComposition;

@Mixin(RSParamComposition.class)
public abstract class RSParamCompositionMixin implements RSParamComposition
{
	@Inject
	@Override
	public boolean isString()
	{
		return getType() == 's';
	}
}
