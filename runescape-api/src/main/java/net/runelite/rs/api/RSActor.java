/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2020, ThatGamerBlue <thatgamerblue@gmail.com>
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
package net.runelite.rs.api;

import net.runelite.api.Actor;
import net.runelite.mapping.Import;

public interface RSActor extends RSRenderable, Actor
{
	@Import("targetIndex")
	@Override
	int getRSInteracting();

	// Overhead text

	@Import("overheadText")
	@Override
	String getOverheadText();

	@Import("overheadText")
	@Override
	void setOverheadText(String overheadText);

	// Coord stuff

	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("pathX")
	int[] getPathX();

	@Import("pathY")
	int[] getPathY();

	// Animation

	@Import("sequence")
	@Override
	int getAnimation();

	@Import("sequence")
	@Override
	void setAnimation(int animation);

	@Import("sequenceFrame")
	@Override
	int getAnimationFrame();

	@Import("sequenceFrame")
	@Override
	int getActionFrame();

	@Import("sequenceFrame")
	@Override
	void setAnimationFrame(int frame);

	@Import("sequenceFrame")
	@Override
	void setActionFrame(int frame);

	@Import("sequenceFrameCycle")
	@Override
	int getActionFrameCycle();

	// Spot animation (aka graphic)

	@Import("spotAnimation")
	@Override
	int getGraphic();

	@Import("spotAnimation")
	@Override
	void setGraphic(int id);

	@Import("spotAnimationFrame")
	int getSpotAnimFrame();

	@Import("spotAnimationFrame")
	@Override
	void setSpotAnimFrame(int id);

	@Import("spotAnimationFrameCycle")
	int getSpotAnimationFrameCycle();

	// Idle animation

	@Import("idleSequence")
	@Override
	int getIdlePoseAnimation();

	@Import("idleSequence")
	@Override
	void setIdlePoseAnimation(int animation);

	// Movement animation (aka poseAnimation)

	@Import("movementSequence")
	@Override
	int getPoseAnimation();

	@Import("movementSequence")
	@Override
	void setPoseAnimation(int animation);

	@Import("movementFrame")
	int getPoseFrame();

	@Import("movementFrame")
	void setPoseFrame(int frame);

	@Import("movementFrameCycle")
	int getPoseFrameCycle();

	@Import("defaultHeight")
	@Override
	int getLogicalHeight();

	@Import("orientation")
	@Override
	int getOrientation();

	@Import("rotation")
	@Override
	int getCurrentOrientation();

	// Health stuff

	@Import("healthBars")
	RSIterableNodeDeque getHealthBars();

	@Import("hitSplatValues")
	int[] getHitsplatValues();

	@Import("hitSplatTypes")
	int[] getHitsplatTypes();

	@Import("hitSplatCycles")
	int[] getHitsplatCycles();

	@Import("turnLeftSequence")
	@Override
	int getIdleRotateLeft();

	@Import("turnRightSequence")
	@Override
	int getIdleRotateRight();

	@Import("walkSequence")
	@Override
	int getWalkAnimation();

	@Import("walkBackSequence")
	@Override
	int getWalkRotate180();

	@Import("walkLeftSequence")
	@Override
	int getWalkRotateLeft();

	@Import("walkRightSequence")
	@Override
	int getWalkRotateRight();

	@Import("runSequence")
	@Override
	int getRunAnimation();

	void setDead(boolean dead);

	@Import("pathLength")
	int getPathLength();
}
