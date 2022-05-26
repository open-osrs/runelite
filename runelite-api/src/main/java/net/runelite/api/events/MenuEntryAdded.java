/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api.events;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;

/**
 * An event when a new entry is added to a right-click menu.
 */
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class MenuEntryAdded
{
	// Here for RuneLite compatibility (different parameter order)
	public MenuEntryAdded(MenuEntry menuEntry)
	{
		this.menuEntry = menuEntry;

		this.option = menuEntry.getOption();
		this.target = menuEntry.getTarget();
		this.identifier = menuEntry.getIdentifier();
		this.type = menuEntry.getType().getId();
		this.actionParam0 = menuEntry.getParam0();
		this.actionParam1 = menuEntry.getParam1();
		this.forceLeftClick = false;
	}

	@Getter
	private final MenuEntry menuEntry;

	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@ToString.Include
	private String option;

	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@ToString.Include
	private String target;

	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@ToString.Include
	private int type;

	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@ToString.Include
	private int identifier;

	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@ToString.Include
	private int actionParam0;

	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@ToString.Include
	private int actionParam1;

	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@ToString.Include
	private boolean forceLeftClick;

	/**
	 * If this is set to true client mixin will update
	 * the menu entry with the modified values.
	 *
	 * Checks if count is the same, but doesn't check if there's
	 * been multiple changes
	 */
	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@ToString.Include
	private boolean modified;

	public void setModified()
	{
		this.modified = true;
	}

	@Deprecated
	public int getParam0()
	{
		return actionParam0;
	}

	@Deprecated
	public void setParam0(int param)
	{
		actionParam0 = param;
	}

	@Deprecated
	public int getParam1()
	{
		return actionParam1;
	}

	@Deprecated
	public void setParam1(int param)
	{
		actionParam1 = param;
	}
	@Deprecated
	public int getOpcode()
	{
		return type;
	}

	@Deprecated
	public void setOpcode(int opcode)
	{
		type = opcode;
	}

	@Deprecated
	public MenuAction getMenuAction()
	{
		return MenuAction.of(type);
	}
}