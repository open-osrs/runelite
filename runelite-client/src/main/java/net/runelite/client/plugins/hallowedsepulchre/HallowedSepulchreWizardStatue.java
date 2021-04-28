package net.runelite.client.plugins.hallowedsepulchre;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import net.runelite.api.DynamicObject;
import net.runelite.api.GameObject;

@Getter(AccessLevel.PACKAGE)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
class HallowedSepulchreWizardStatue
{
	@NonNull
	@EqualsAndHashCode.Include
	private final GameObject gameObject;

	private int ticksUntilNextAnimation = -1;

	private final int animationId;

	private final int animationTickSpeed;

	void updateTicksUntilNextAnimation()
	{
		if (ticksUntilNextAnimation >= 0)
		{
			ticksUntilNextAnimation--;
		}
		else
		{
			final DynamicObject dynamicObject = (DynamicObject) gameObject.getRenderable();

			if (dynamicObject.getAnimationID() == animationId)
			{
				ticksUntilNextAnimation = animationTickSpeed;
			}
		}
	}
}