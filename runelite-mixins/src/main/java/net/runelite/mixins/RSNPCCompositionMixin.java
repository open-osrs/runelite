package net.runelite.mixins;

import net.runelite.api.HeadIcon;
import static net.runelite.api.HeadIcon.MAGIC;
import static net.runelite.api.HeadIcon.MELEE;
import static net.runelite.api.HeadIcon.RANGED;
import static net.runelite.api.HeadIcon.RANGE_MAGE;
import static net.runelite.api.HeadIcon.REDEMPTION;
import static net.runelite.api.HeadIcon.RETRIBUTION;
import static net.runelite.api.HeadIcon.SMITE;
import static net.runelite.api.HeadIcon.RANGE_MELEE;
import static net.runelite.api.HeadIcon.MAGE_MELEE;
import static net.runelite.api.HeadIcon.RANGE_MAGE_MELEE;
import static net.runelite.api.HeadIcon.WRATH;
import static net.runelite.api.HeadIcon.SOUL_SPLIT;
import static net.runelite.api.HeadIcon.DEFLECT_MELEE;
import static net.runelite.api.HeadIcon.DEFLECT_RANGE;
import static net.runelite.api.HeadIcon.DEFLECT_MAGE;
import net.runelite.api.events.NpcActionChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNPCComposition;

@Mixin(RSNPCComposition.class)
public abstract class RSNPCCompositionMixin implements RSNPCComposition
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public HeadIcon getOverheadIcon()
	{
		switch (getRsOverheadIcon())
		{
			case 0:
				return MELEE;
			case 1:
				return RANGED;
			case 2:
				return MAGIC;
			case 3:
				return RETRIBUTION;
			case 4:
				return SMITE;
			case 5:
				return REDEMPTION;
			case 6:
				return RANGE_MAGE;
			case 7:
				return RANGE_MELEE;
			case 8:
				return MAGE_MELEE;
			case 9:
				return RANGE_MAGE_MELEE;
			case 10:
				return WRATH;
			case 11:
				return SOUL_SPLIT;
			case 12:
				return DEFLECT_MELEE;
			case 13:
				return DEFLECT_RANGE;
			case 14:
				return DEFLECT_MAGE;
			default:
				return null;
		}
	}

	@FieldHook("actions")
	@Inject
	public void actionsHook(int idx)
	{
		NpcActionChanged npcActionChanged = new NpcActionChanged();
		npcActionChanged.setNpcComposition(this);
		npcActionChanged.setIdx(idx);
		client.getCallbacks().post(npcActionChanged);
	}
}
