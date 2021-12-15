/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.runelite.api;

import java.util.Arrays;
import java.util.function.Consumer;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A menu entry in a right-click menu.
 */
@Data
@NoArgsConstructor
public class MenuEntry implements Cloneable
{
	/**
	 * The option text added to the menu. (ie. "Walk here", "Use")
	 */
	private String option;
	/**
	 * The target of the action. (ie. Item or Actor name)
	 * <p>
	 * If the option does not apply to any target, this field
	 * will be set to empty string.
	 */
	private String target;
	/**
	 * An identifier value for the target of the action.
	 */
	private int identifier;
	/**
	 * The action the entry will trigger.
	 * {@link MenuAction}
	 */
	private int opcode;
	/**
	 * An additional parameter for the action.
	 */
	private int param0;
	/**
	 * A second additional parameter for the action.
	 */
	private int param1;
	/**
	 * If this field is true and you have single mouse button on and this entry is
	 * the top entry the right click menu will not be opened when you left click
	 *
	 * This is used  for shift click
	 */
	private boolean forceLeftClick;

	public MenuEntry(String option, String target, int type, int opcode, int param0, int param1, boolean forceLeftClick)
	{
		this.option = option;
		this.target = target;
		this.identifier = type;
		this.opcode = opcode;
		this.param0 = param0;
		this.param1 = param1;
		this.forceLeftClick = forceLeftClick;
	}

	@Override
	public MenuEntry clone()
	{
		try
		{
			return (MenuEntry) super.clone();
		}
		catch (CloneNotSupportedException ex)
		{
			throw new RuntimeException(ex);
		}
	}

	public String getOption()
	{
		return option;
	}

	public MenuEntry setOption(String option)
	{
		this.option = option;
		return this;
	}

	public String getTarget()
	{
		return target;
	}

	public MenuEntry setTarget(String target)
	{
		this.target = target;
		return this;
	}

	public int getIdentifier()
	{
		return this.identifier;
	}

	public MenuEntry setIdentifier(int identifier)
	{
		this.identifier = identifier;
		return this;
	}

	public MenuAction getType()
	{
		return MenuAction.of(this.opcode);
	}

	public MenuEntry setType(MenuAction type)
	{
		this.opcode = type.getId();
		return this;
	}

	public int getParam0()
	{
		return this.param0;
	}

	public MenuEntry setParam0(int param0)
	{
		this.param0 = param0;
		return this;
	}

	public int getParam1()
	{
		return this.param1;
	}

	public MenuEntry setParam1(int param1)
	{
		this.param1 = param1;
		return this;
	}

	public boolean isForceLeftClick()
	{
		return this.forceLeftClick;
	}

	public MenuEntry setForceLeftClick(boolean forceLeftClick)
	{
		this.forceLeftClick = forceLeftClick;
		return this;
	}

	public boolean isDeprioritized()
	{
		return opcode >= MenuAction.MENU_ACTION_DEPRIORITIZE_OFFSET;
	}

	public MenuEntry setDeprioritized(boolean deprioritized)
	{
		if (deprioritized)
		{
			if (opcode < MenuAction.MENU_ACTION_DEPRIORITIZE_OFFSET)
			{
				opcode += MenuAction.MENU_ACTION_DEPRIORITIZE_OFFSET;
			}
		}
		else
		{
			if (opcode >= MenuAction.MENU_ACTION_DEPRIORITIZE_OFFSET)
			{
				opcode -= MenuAction.MENU_ACTION_DEPRIORITIZE_OFFSET;
			}
		}

		return this;
	}

	public MenuEntry onClick(Consumer<MenuEntry> callback)
	{
		return this;
	}

	public void setActionParam0(int i)
	{
		this.param0 = i;
	}

	public int getActionParam0()
	{
		return this.param0;
	}

	public void setActionParam1(int i)
	{
		this.param1 = i;
	}

	public int getActionParam1()
	{
		return this.param1;
	}

	public void setType(int i)
	{
		this.opcode = i;
	}

	public void setId(int i)
	{
		this.identifier = i;
	}

	public int getId()
	{
		return this.identifier;
	}

	/**
	 * Get opcode, but as it's enum counterpart
	 */
	public MenuAction getMenuAction()
	{
		return MenuAction.of(getOpcode());
	}

	// TODO: Remove this after properly implementing the menu
	public void add(Client client)
	{
		MenuEntry[] menuEntries = client.getMenuEntries();
		menuEntries = Arrays.copyOf(menuEntries, menuEntries.length + 1);
		MenuEntry menuEntry = menuEntries[menuEntries.length - 1] = new MenuEntry();
		menuEntry.setOption(option);
		menuEntry.setTarget(target);
		menuEntry.setParam0(param0);
		menuEntry.setParam1(param1);
		menuEntry.setIdentifier(identifier);
		menuEntry.setType(MenuAction.of(getOpcode()));
		client.setMenuEntries(menuEntries);
	}
}
