/*
 * Copyright (c) 2018, Seth <https://github.com/sethtroll>
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
package net.runelite.client.plugins.devtools;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.Client;
import static net.runelite.api.Constants.CHUNK_SIZE;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.table.TableAlignment;
import net.runelite.client.ui.overlay.components.table.TableComponent;
import net.runelite.client.util.ColorUtil;

public class LocationOverlay extends Overlay
{
	private final Client client;
	private final DevToolsPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	LocationOverlay(Client client, DevToolsPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(150, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!plugin.getLocation().isActive())
		{
			return null;
		}

		panelComponent.getChildren().clear();
		WorldPoint localWorld = client.getLocalPlayer().getWorldLocation();
		LocalPoint localPoint = client.getLocalPlayer().getLocalLocation();

		int regionID = localWorld.getRegionID();

		TableComponent tableComponent = new TableComponent();
		tableComponent.setColumnAlignments(TableAlignment.LEFT, TableAlignment.RIGHT);

		if (client.isInInstancedRegion())
		{
			tableComponent.addRow("Instance", "");

			int[][][] instanceTemplateChunks = client.getInstanceTemplateChunks();
			int z = client.getPlane();
			int chunkData = instanceTemplateChunks[z][localPoint.getSceneX() / CHUNK_SIZE][localPoint.getSceneY() / CHUNK_SIZE];

			int rotation = chunkData >> 1 & 0x3;
			int chunkY = (chunkData >> 3 & 0x7FF) * CHUNK_SIZE;
			int chunkX = (chunkData >> 14 & 0x3FF) * CHUNK_SIZE;

			tableComponent.addRow("Chunk " + localPoint.getSceneX() / CHUNK_SIZE + "," + localPoint.getSceneY() / CHUNK_SIZE, rotation + " " + chunkX + " " + chunkY);
		}

		tableComponent.addRow("Base", client.getBaseX() + ", " + client.getBaseY());
		tableComponent.addRow("Local", localPoint.getX() + ", " + localPoint.getY());
		tableComponent.addRow("Scene", localPoint.getSceneX() + ", " + localPoint.getSceneY());
		tableComponent.addRow("Tile", localWorld.getX() + ", " + localWorld.getY() + ", " + client.getPlane());

		for (int i = 0; i < client.getMapRegions().length; i++)
		{
			int region = client.getMapRegions()[i];

			tableComponent.addRow((i == 0) ? "Map regions" : " ", ColorUtil.prependColorTag(String.valueOf(region), (region == regionID) ? Color.GREEN : Color.WHITE));
		}

		panelComponent.getChildren().add(tableComponent);

		return panelComponent.render(graphics);
	}
}
