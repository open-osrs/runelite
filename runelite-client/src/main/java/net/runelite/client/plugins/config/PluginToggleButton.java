/*
 * Copyright (c) 2019 Abex
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

package net.runelite.client.plugins.config;

import java.awt.Dimension;
import java.util.List;
import net.runelite.client.ui.components.ToggleButton;

class PluginToggleButton extends ToggleButton
{
	private String conflictString = "";

	public PluginToggleButton()
	{
		super();
		setPreferredSize(new Dimension(26, 25));

		addItemListener(l -> updateTooltip());
		updateTooltip();
	}

	private void updateTooltip()
	{
		setToolTipText(isSelected() ? "Disable plugin" :  "<html>Enable plugin" + conflictString);
	}

	public void setConflicts(List<String> conflicts)
	{
		if (conflicts != null && !conflicts.isEmpty())
		{
			StringBuilder sb = new StringBuilder("<br>Plugin conflicts: ");
			for (int i = 0; i < conflicts.size() - 2; i++)
			{
				sb.append(conflicts.get(i));
				sb.append(", ");
			}
			if (conflicts.size() >= 2)
			{
				sb.append(conflicts.get(conflicts.size() - 2));
				sb.append(" and ");
			}

			sb.append(conflicts.get(conflicts.size() - 1));
			conflictString = sb.toString();
		}
		else
		{
			conflictString = "";
		}

		updateTooltip();
	}
}
