/*
 * Copyright (c) 2018, OpenOSRS
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
package net.runelite.mixins;

import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.Sequence;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRuneLiteObject;
import net.runelite.rs.api.RSSequenceDefinition;

@Mixin(RSRuneLiteObject.class)
public abstract class RuneLiteObjectMixin implements RSRuneLiteObject
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private static RSModel model;

	@Inject
	public void setLocation(LocalPoint localPoint, int plane)
	{
		setX(localPoint.getX());
		setY(localPoint.getY());
		setLevel(plane);
		setHeight(Perspective.getTileHeight(client, localPoint, plane));
	}

	@Inject
	public void setAnimation(Sequence var1)
	{
		setFrame(0);
		setFrameCycle(0);
		setSequenceDefinition((RSSequenceDefinition) var1);
	}

	@Inject
	public void advanceRL(int var1)
	{
		if (getSequenceDefinition() != null)
		{
			if (!finished())
			{
				setFrameCycle(getFrameCycle() + var1);

				while (getFrameCycle() > getSequenceDefinition().getFrameLengths()[getFrame()])
				{
					setFrameCycle(getFrameCycle() - getSequenceDefinition().getFrameLengths()[getFrame()]);
					setFrame(getFrame() + 1);
					if (getFrame() >= getSequenceDefinition().getFrameIDs().length)
					{
						setFinished(true);
						break;
					}
				}
			}

			if (isLooping() && finished())
			{
				setFinished(false);
				setFrame(0);
				setFrameCycle(0);
			}
		}
	}

	@Inject
	public void setModel(Model var1)
	{
		model = (RSModel) var1;
	}

	@Inject
	public RSModel getModelRl()
	{
		RSModel model = RuneLiteObjectMixin.model;
		if (getSequenceDefinition() != null)
		{
			model = getSequenceDefinition().transformSpotAnimationModel(model, getFrame());
		}
		else
		{
			model = model.toSharedModel(true);
		}

		return model;
	}
}
