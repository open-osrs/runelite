package net.runelite.client.plugins.gauntlet;

import java.awt.Color;
import java.awt.image.BufferedImage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.client.game.SkillIconManager;

@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class Hunllef
{
	private NPC npc;
	private int bossAttacks;
	private int playerAttacks;
	private BufferedImage mage;
	private BufferedImage range;
	private BossAttackPhase currentPhase;

	Hunllef(NPC npc, SkillIconManager skillIconManager)
	{
		this.npc = npc;
		this.bossAttacks = 0;
		this.playerAttacks = 6;
		this.mage = skillIconManager.getSkillImage(Skill.MAGIC);
		this.range = skillIconManager.getSkillImage(Skill.RANGED);
		this.currentPhase = BossAttackPhase.UNKNOWN;
	}

	void updateAttack(BossAttack style)
	{
		if (style == BossAttack.PRAYER)
		{
			style = BossAttack.MAGIC;
		}

		if (style == BossAttack.LIGHTNING)
		{
			bossAttacks--;
		}
		else if (style == BossAttack.RANGE)
		{
			if (currentPhase != BossAttackPhase.RANGE)
			{
				currentPhase = BossAttackPhase.RANGE;
				bossAttacks = 3;
			}
			else
			{
				bossAttacks--;
			}
		}
		else if (style == BossAttack.MAGIC)
		{
			if (currentPhase != BossAttackPhase.MAGIC)
			{
				currentPhase = BossAttackPhase.MAGIC;
				bossAttacks = 3;
			}
			else
			{
				bossAttacks--;
			}
		}

		if (bossAttacks <= 0)
		{
			BossAttackPhase nextPhase;

			switch (currentPhase)
			{
				case MAGIC:
					bossAttacks = 4;
					nextPhase = BossAttackPhase.RANGE;
					break;
				case RANGE:
					bossAttacks = 4;
					nextPhase = BossAttackPhase.MAGIC;
					break;
				default:
					bossAttacks = 0;
					nextPhase = BossAttackPhase.UNKNOWN;
					break;
			}
			currentPhase = nextPhase;
		}
	}

	@AllArgsConstructor
	@Getter(AccessLevel.PACKAGE)
	enum BossAttackPhase
	{
		MAGIC(Color.CYAN, Prayer.PROTECT_FROM_MISSILES, Color.GREEN),
		RANGE(Color.GREEN, Prayer.PROTECT_FROM_MAGIC, Color.CYAN),
		UNKNOWN(Color.WHITE, null, null);

		private Color color;
		private Prayer prayer;
		private Color prayerColor;
	}

	enum BossAttack
	{
		MAGIC,
		RANGE,
		PRAYER,
		LIGHTNING
	}
}
