package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSRenderable;

@Mixin(RSRenderable.class)
public abstract class RSRenderableMixin implements RSRenderable
{
	@Inject
	private boolean hidden = false;

	@Inject
	public void setHidden(boolean hidden)
	{
		this.hidden = hidden;
	}

	@Inject
	public boolean isHidden()
	{
		return hidden;
	}
}
