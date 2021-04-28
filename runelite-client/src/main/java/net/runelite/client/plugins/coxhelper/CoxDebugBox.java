/*
 * Copyright (c) 2019, lyzrds <https://discord.gg/5eb9Fe>
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
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
package net.runelite.client.plugins.coxhelper;

import com.openosrs.client.ui.overlay.components.table.TableAlignment;
import com.openosrs.client.ui.overlay.components.table.TableComponent;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.PanelComponent;

@Singleton
public class CoxDebugBox extends Overlay
{
	private final Client client;
	private final CoxPlugin plugin;
	private final CoxConfig config;
	private final Olm olm;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	CoxDebugBox(Client client, CoxPlugin plugin, CoxConfig config, Olm olm)
	{
		this.client = client;
		this.plugin = plugin;
		this.config = config;
		this.olm = olm;
		this.setPosition(OverlayPosition.BOTTOM_LEFT);
		this.setPriority(OverlayPriority.HIGH);
		this.panelComponent.setPreferredSize(new Dimension(270, 0));
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!this.config.olmDebug() || !plugin.inRaid())
		{
			return null;
		}

		this.panelComponent.getChildren().clear();
		TableComponent tableComponent = new TableComponent();
		tableComponent.setColumnAlignments(TableAlignment.LEFT, TableAlignment.RIGHT);
		tableComponent.addRow("ticks", String.valueOf(client.getTickCount()));
		tableComponent.addRow("active", String.valueOf(this.olm.isActive()));
		tableComponent.addRow("handAnim", String.valueOf(this.olm.getHandAnimation()));
		tableComponent.addRow("headAnim", String.valueOf(this.olm.getHeadAnimation()));
		tableComponent.addRow("firstPhase", String.valueOf(this.olm.isFirstPhase()));
		tableComponent.addRow("finalPhase", String.valueOf(this.olm.isFinalPhase()));
		tableComponent.addRow("attackTicks", String.valueOf(this.olm.getTicksUntilNextAttack()));
		tableComponent.addRow("attackCycle", String.valueOf(this.olm.getAttackCycle()));
		tableComponent.addRow("specialCycle", String.valueOf(this.olm.getSpecialCycle()));
		tableComponent.addRow("portalTicks", String.valueOf(this.olm.getPortalTicks()));
		tableComponent.addRow("handCrippled", String.valueOf(this.olm.isCrippled()));
		tableComponent.addRow("crippleTicks", String.valueOf(this.olm.getCrippleTicks()));
		this.panelComponent.getChildren().add(tableComponent);

		return this.panelComponent.render(graphics);
	}
}
