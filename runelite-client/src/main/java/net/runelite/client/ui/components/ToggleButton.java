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

package net.runelite.client.ui.components;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.SwingUtil;
import net.runelite.client.util.Text;

public class ToggleButton extends JCheckBox
{
	private static final ImageIcon ON_SWITCHER;
	private static final ImageIcon OFF_SWITCHER;
	private static final ImageIcon DISABLED_SWITCHER;

	private final Object object;

	static
	{
		BufferedImage onSwitcher = ImageUtil.loadImageResource(ToggleButton.class, "switcher_on.png");
		ON_SWITCHER = new ImageIcon(ImageUtil.recolorImage(onSwitcher, ColorScheme.BRAND_BLUE));
		OFF_SWITCHER = new ImageIcon(ImageUtil.flipImage(
			ImageUtil.luminanceScale(
				ImageUtil.grayscaleImage(onSwitcher),
				0.61f
			),
			true,
			false
		));
		DISABLED_SWITCHER = new ImageIcon(ImageUtil.flipImage(
			ImageUtil.luminanceScale(
				ImageUtil.grayscaleImage(onSwitcher),
				0.4f
			),
			true,
			false
		));
	}

	public ToggleButton()
	{
		super(OFF_SWITCHER);
		this.object = null;

		setSelectedIcon(ON_SWITCHER);
		setDisabledIcon(DISABLED_SWITCHER);
		SwingUtil.removeButtonDecorations(this);
	}

	public ToggleButton(String text)
	{
		super(text, OFF_SWITCHER, false);
		this.object = null;

		setSelectedIcon(ON_SWITCHER);
		setDisabledIcon(DISABLED_SWITCHER);
		SwingUtil.removeButtonDecorations(this);
	}

	public ToggleButton(Object object)
	{
		super(Text.titleCase((Enum<?>) object), OFF_SWITCHER, false);
		this.object = object;

		setSelectedIcon(ON_SWITCHER);
		setDisabledIcon(DISABLED_SWITCHER);
		SwingUtil.removeButtonDecorations(this);
	}

	public Object getObject()
	{
		return this.object;
	}
}
