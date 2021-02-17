package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSStructComposition;

@Mixin(RSStructComposition.class)
public abstract class RSStructCompositionMixin implements RSStructComposition
{
	@Inject
	private int id = -1;

	@Inject
	@Override
	public int getId()
	{
		return id;
	}

	@Inject
	@Override
	public void setId(int id)
	{
		this.id = id;
	}
}
