package net.runelite.client.plugins.gauntlet;

import java.awt.Color;
import java.awt.image.BufferedImage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.NPC;
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
			this.bossAttacks--;
		}
		else if (style == BossAttack.RANGE)
		{
			if (currentPhase != BossAttackPhase.RANGE)
			{
				currentPhase = BossAttackPhase.RANGE;
				this.bossAttacks = 3;
			}
			else
			{
				this.bossAttacks--;
			}
		}
		else if (style == BossAttack.MAGIC)
		{
			if (currentPhase != BossAttackPhase.MAGIC)
			{
				currentPhase = BossAttackPhase.MAGIC;
				this.bossAttacks = 3;
			}
			else
			{
				this.bossAttacks--;
			}
		}

		if (this.bossAttacks <= 0)
		{
			BossAttackPhase nextPhase;

			switch (currentPhase)
			{
				case MAGIC:
					this.bossAttacks = 4;
					nextPhase = BossAttackPhase.RANGE;
					break;
				case RANGE:
					this.bossAttacks = 4;
					nextPhase = BossAttackPhase.MAGIC;
					break;
				default:
					this.bossAttacks = 0;
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
		MAGIC(Color.CYAN),
		RANGE(Color.GREEN),
		UNKNOWN(Color.WHITE);

		private Color color;
	}

	enum BossAttack
	{
		MAGIC,
		RANGE,
		PRAYER,
		LIGHTNING
	}
}
