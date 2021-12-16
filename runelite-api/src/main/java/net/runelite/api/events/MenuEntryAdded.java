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

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.MenuAction;

/**
 * An event when a new entry is added to a right-click menu.
 */
public class MenuEntryAdded
{
	// Here for RuneLite compatibility (different parameter order)
	public MenuEntryAdded(String option, String target, int type, int identifier, int actionParam0, int actionParam1)
	{
		this(option, target, identifier, type, actionParam0, actionParam1, false);
	}

	public MenuEntryAdded(String option, String target, int identifier, int type, int param0, int param1, boolean forceLeftClick)
	{
		this.option = option;
		this.target = target;
		this.identifier = identifier;
		this.type = type;
		this.actionParam0 = param0;
		this.actionParam1 = param1;
		this.forceLeftClick = forceLeftClick;
	}

	@Getter
	@Setter
	private String option;

	@Getter
	@Setter
	private String target;

	@Getter
	@Setter
	private int type;

	@Getter
	@Setter
	private int identifier;

	@Getter
	@Setter
	private int actionParam0;

	@Getter
	@Setter
	private int actionParam1;

	@Getter
	@Setter
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
