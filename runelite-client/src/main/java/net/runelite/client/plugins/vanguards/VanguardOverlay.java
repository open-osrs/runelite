/*
 * Copyright (c) 2018, https://runelitepl.us
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
package net.runelite.client.plugins.vanguards;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.util.Text;


public class VanguardOverlay extends Overlay
{

	private final PanelComponent panelComponent = new PanelComponent();

	private static final int MAGE_VANGUARD_ID = 7529;
	private static final int RANGE_VANGUARD_ID = 7528;
	private static final int MELEE_VANGUARD_ID = 7527;

	String right_mage_str, right_range_str, right_melee_str = "";

	@Inject
	private Client client;


	@Inject
	public VanguardOverlay(VanguardPlugin plugin)
	{
		super(plugin);//?

		setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Player p = client.getLocalPlayer();
		Actor opponent = p.getInteracting();

		if (opponent instanceof NPC)
		{
			int id = ((NPC) opponent).getId();

			if (!Text.standardize(opponent.getName()).contains("vanguard"))
			{
				return null;
			}

			if (id == MAGE_VANGUARD_ID)
			{
				float magePercent = (float) opponent.getHealthRatio() / opponent.getHealth() * 100;
				int mageHp = (int) magePercent;
				right_mage_str = Integer.toString(mageHp);
			}
			else if (id == RANGE_VANGUARD_ID)
			{
				float rangePercent = (float) opponent.getHealthRatio() / opponent.getHealth() * 100;
				int rangeHp = (int) rangePercent;
				right_range_str = Integer.toString(rangeHp);
			}
			else if (id == MELEE_VANGUARD_ID)
			{
				float meleePercent = (float) opponent.getHealthRatio() / opponent.getHealth() * 100;
				int meleeHp = (int) meleePercent;
				right_melee_str = Integer.toString(meleeHp);
			}
		}

		panelComponent.getChildren().clear();
		String overlayTitle = "Vanguard HP";

		panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.RED).build());

		panelComponent.setPreferredSize(new Dimension(graphics.getFontMetrics().stringWidth(overlayTitle) + 30, 0));

		panelComponent.getChildren().add(LineComponent.builder().left("Mage:").right(right_mage_str).build());

		panelComponent.getChildren().add(LineComponent.builder().left("Range:").right(right_range_str).build());

		panelComponent.getChildren().add(LineComponent.builder().left("Melee:").right(right_melee_str).build());

		return panelComponent.render(graphics);
	}
}