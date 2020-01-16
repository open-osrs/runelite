/*
 * Copyright (c) 2019, dillydill123 <https://github.com/dillydill123>
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
package net.runelite.client.plugins.inventorysetups.ui;

import net.runelite.client.plugins.inventorysetups.InventorySetup;
import net.runelite.client.plugins.inventorysetups.InventorySetupSlotID;
import lombok.Getter;
import lombok.Setter;
import net.runelite.client.util.AsyncBufferedImage;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

public class InventorySetupSlot extends JPanel
{
	@Getter
	private final JLabel imageLabel;

	@Getter
	private final InventorySetupSlotID slotID;

	@Getter
	@Setter
	private InventorySetup parentSetup;

	@Getter
	private int indexInSlot;

	public InventorySetupSlot(Color color, InventorySetupSlotID id, int indexInSlot)
	{
		this.slotID = id;
		this.imageLabel = new JLabel();
		this.parentSetup = null;
		this.indexInSlot = indexInSlot;
		imageLabel.setVerticalAlignment(SwingConstants.CENTER);
		setPreferredSize(new Dimension(46, 42));
		setBackground(color);
		add(imageLabel);
	}

	public void setImageLabel(String toolTip, AsyncBufferedImage itemImage)
	{
		if (itemImage == null || toolTip == null)
		{
			imageLabel.setToolTipText("");
			imageLabel.setIcon(null);
			imageLabel.revalidate();
			return;
		}

		imageLabel.setToolTipText(toolTip);
		itemImage.addTo(imageLabel);

		validate();
		repaint();
	}

}
