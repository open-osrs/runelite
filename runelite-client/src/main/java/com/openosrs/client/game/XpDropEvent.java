package com.openosrs.client.game;

import lombok.Data;
import net.runelite.api.Skill;

@Data
public class XpDropEvent
{
	private Skill skill;
	private int exp;
}
