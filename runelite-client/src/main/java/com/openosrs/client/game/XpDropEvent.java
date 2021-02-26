package com.openosrs.client.game;

import lombok.Data;
import net.runelite.api.Skill;
import net.runelite.api.events.Event;

@Data
public class XpDropEvent
{
	private Skill skill;
	private int exp;
}