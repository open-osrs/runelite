/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2019, ThatGamerBlue <thatgamerblue@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.rs.api;

import net.runelite.api.widgets.Widget;
import net.runelite.mapping.Import;

public interface RSWidget extends Widget
{
	@Import("children")
	@Override
	RSWidget[] getChildren();

	@Import("children")
	@Override
	void setChildren(Widget[] children);

	@Import("id")
	@Override
	int getId();

	void setRenderParentId(int parentId);

	void setRenderX(int x);

	void setRenderY(int y);

	@Import("id")
	void setId(int id);

	@Import("parentId")
	int getRSParentId();

	@Import("parentId")
	void setParentId(int id);

	@Import("flags")
	int getClickMask();

	@Import("flags")
	void rs$setClickMask(int mask);

	//@Import("boundsIndex") -- unused for now
	//int getBoundsIndex();

	@Import("modelId")
	@Override
	int getModelId();

	@Import("modelId")
	void rs$setModelId(int modelId);

	@Import("itemIds")
	int[] getItemIds();

	@Import("itemQuantities")
	int[] getItemQuantities();

	@Import("modelType")
	int getModelType();

	@Import("modelType")
	void rs$setModelType(int modelType);

	@Import("sequenceId")
	int getAnimationId();

	@Import("sequenceId")
	void rs$setAnimationId(int animationId);

	@Import("actions")
	@Override
	String[] getActions();

	@Import("itemActions")
	@Override
	String[] getItemActions();

	@Import("spellName")
	String getSpellName();

	@Import("buttonText")
	String getRSButtonText();

	@Import("text")
	String getRSText();

	@Import("dataText")
	String getRSName();

	@Import("dataText")
	void setRSName(String name);

	@Import("text")
	void rs$setText(String text);

	@Import("color")
	@Override
	int getTextColor();

	@Import("color")
	void rs$setTextColor(int textColor);

	@Import("transparencyTop")
	@Override
	int getOpacity();

	@Import("transparencyTop")
	void rs$setOpacity(int opacity);

	@Import("x")
	@Override
	int getRelativeX();

	@Import("x")
	@Override
	void setRelativeX(int x);

	@Import("y")
	@Override
	int getRelativeY();

	@Import("y")
	@Override
	void setRelativeY(int y);

	@Import("width")
	@Override
	int getWidth();

	@Import("width")
	@Override
	void setWidth(int width);

	@Import("height")
	@Override
	int getHeight();

	@Import("height")
	@Override
	void setHeight(int height);

	@Import("isHidden")
	@Override
	boolean isSelfHidden();

	@Import("isHidden")
	void rs$setHidden(boolean hidden);

	@Import("childIndex")
	int getIndex();

	@Import("childIndex")
	void setIndex(int index);

	@Import("modelAngleX")
	@Override
	int getRotationX();

	@Import("modelAngleX")
	void rs$setRotationX(int rotationX);

	@Import("modelAngleZ") // Do not change
	@Override
	int getRotationY();

	@Import("modelAngleZ") // Do not change
	void rs$setRotationY(int rotationY);

	@Import("modelAngleY") // Do not change
	int getRotationZ();

	@Import("modelAngleY") // Do not change
	void rs$setRotationZ(int rotationZ);

	@Import("modelZoom")
	@Override
	int getModelZoom();

	@Import("modelZoom")
	void rs$setModelZoom(int modelZoom);

	@Import("contentType")
	@Override
	int getContentType();

	@Import("contentType")
	void rs$setContentType(int contentType);

	@Import("type")
	@Override
	int getType();

	@Import("type")
	@Override
	void setType(int type);

	@Import("buttonType")
	@Override
	int getButtonType();

	@Import("scrollX")
	@Override
	int getScrollX();

	@Import("scrollX")
	void rs$setScrollX(int scrollX);

	@Import("scrollY")
	@Override
	int getScrollY();

	@Import("scrollY")
	void rs$setScrollY(int scrollY);

	@Import("scrollWidth")
	@Override
	int getScrollWidth();

	@Import("scrollWidth")
	void rs$setScrollWidth(int width);

	@Import("scrollHeight")
	@Override
	int getScrollHeight();

	@Import("scrollHeight")
	void rs$setScrollHeight(int height);

	@Import("spriteId2")
	@Override
	int getSpriteId();

	@Import("spriteId2")
	void rs$setSpriteId(int spriteId);

	@Import("spriteTiling")
	@Override
	boolean getSpriteTiling();

	@Import("spriteTiling")
	void rs$setSpriteTiling(boolean tiling);

	@Import("outline")
	@Override
	int getBorderType();

	@Import("outline")
	@Override
	void setBorderType(int type);

	@Import("itemId")
	@Override
	int getItemId();

	@Import("itemId")
	void rs$setItemId(int itemId);

	@Import("itemQuantity")
	@Override
	int getItemQuantity();

	@Import("itemQuantity")
	void rs$setItemQuantity(int quantity);

	@Import("rawX")
	@Override
	int getOriginalX();

	@Import("rawX")
	void rs$setOriginalX(int originalX);

	@Import("rawY")
	@Override
	int getOriginalY();

	@Import("rawY")
	void rs$setOriginalY(int originalY);

	@Import("rawHeight")
	@Override
	int getOriginalHeight();

	@Import("rawHeight")
	void rs$setOriginalHeight(int originalHeight);

	@Import("rawWidth")
	@Override
	int getOriginalWidth();

	@Import("rawWidth")
	void rs$setOriginalWidth(int originalWidth);

	@Import("paddingX")
	int getPaddingX();

	@Import("paddingY")
	int getPaddingY();

	@Import("paddingX")
	@Override
	void setPaddingX(int paddingX);

	@Import("paddingY")
	@Override
	void setPaddingY(int paddingY);


	@Import("onOp")
	@Override
	void setOnOpListener(Object... args);

	@Import("setAction")
	@Override
	void setAction(int idx, String action);

	@Import("isIf3")
	@Override
	boolean isIf3();

	@Import("isIf3")
	void setIsIf3(boolean isIf3);

	@Import("hasListener")
	@Override
	boolean hasListener();

	@Import("hasListener")
	void rs$setHasListener(boolean hasListener);

	@Import("onKey")
	@Override
	Object[] getOnKeyListener();

	@Import("onLoad")
	@Override
	Object[] getOnLoadListener();

	@Import("onOp")
	@Override
	Object[] getOnOpListener();

	@Import("onDialogAbort")
	@Override
	void setOnDialogAbortListener(Object... args);

	@Import("onKey")
	@Override
	void setOnKeyListener(Object... args);

	@Import("onMouseOver")
	@Override
	void setOnMouseOverListener(Object... args);

	@Import("onMouseRepeat")
	@Override
	void setOnMouseRepeatListener(Object... args);

	@Import("onMouseLeave")
	@Override
	void setOnMouseLeaveListener(Object... args);

	@Import("onTimer")
	@Override
	void setOnTimerListener(Object... args);

	@Import("onTargetEnter")
	@Override
	void setOnTargetEnterListener(Object... args);

	@Import("onTargetLeave")
	@Override
	void setOnTargetLeaveListener(Object... args);

	@Import("fontId")
	@Override
	int getFontId();

	@Import("fontId")
	void rs$setFontId(int id);

	@Import("textShadowed")
	@Override
	boolean getTextShadowed();

	@Import("textShadowed")
	void rs$setTextShadowed(boolean shadowed);

	@Import("dragZoneSize")
	@Override
	int getDragDeadZone();

	@Import("dragZoneSize")
	@Override
	void setDragDeadZone(int deadZone);

	@Import("dragThreshold")
	@Override
	int getDragDeadTime();

	@Import("dragThreshold")
	@Override
	void setDragDeadTime(int deadTime);

	@Import("itemQuantityMode")
	@Override
	int getItemQuantityMode();

	@Import("itemQuantityMode")
	void rs$setItemQuantityMode(int itemQuantityMode);

	@Import("xAlignment")
	@Override
	int getXPositionMode();

	@Import("xAlignment")
	void rs$setXPositionMode(int xpm);

	@Import("yAlignment")
	@Override
	int getYPositionMode();

	@Import("yAlignment")
	void rs$setYPositionMode(int ypm);

	@Import("textXAlignment")
	@Override
	int getXTextAlignment();

	@Import("textXAlignment")
	void rs$setXTextAlignment(int xta);

	@Import("textYAlignment")
	@Override
	int getYTextAlignment();

	@Import("textYAlignment")
	void rs$setYTextAlignment(int yta);

	@Import("widthAlignment")
	@Override
	int getWidthMode();

	@Import("widthAlignment")
	void rs$setWidthMode(int widthMode);

	@Import("heightAlignment")
	@Override
	int getHeightMode();

	@Import("heightAlignment")
	void rs$setHeightMode(int heightMode);

	@Import("getFont")
	@Override
	RSFont getFont();

	@Import("fill")
	@Override
	boolean isFilled();

	@Import("fill")
	void rs$setFilled(boolean filled);

	@Import("spellActionName")
	@Override
	String getTargetVerb();

	@Import("spellActionName")
	@Override
	void setTargetVerb(String targetVerb);

	@Import("noClickThrough")
	@Override
	boolean getNoClickThrough();

	@Import("noClickThrough")
	@Override
	void setNoClickThrough(boolean noClickThrough);

	@Import("noScrollThrough")
	@Override
	boolean getNoScrollThrough();

	@Import("noScrollThrough")
	@Override
	void setNoScrollThrough(boolean noScrollThrough);

	@Import("modelFrame")
	int getModelFrame();

	@Import("modelFrameCycle")
	int getModelFrameCycle();

	@Import("onInvTransmit")
	@Override
	Object[] getOnInvTransmitListener();

	@Import("containsMouse")
	@Override
	boolean containsMouse();

	@Import("getSprite")
	RSSpritePixels getSprite(boolean b);

	@Import("onRelease")
	@Override
	void setOnReleaseListener(Object[] o);

	@Import("varTransmitTriggers")
	@Override
	void setVarTransmitTrigger(int[] i);

	@Import("onHold")
	@Override
	void setOnHoldListener(Object[] o);

	@Import("onClick")
	@Override
	void setOnClickListener(Object[] o);

	@Import("onDragComplete")
	@Override
	void setOnDragCompleteListener(Object[] o);

	@Import("onDrag")
	@Override
	void setOnDragListener(Object[] o);

	@Import("parent")
	@Override
	RSWidget getDragParent();

	@Import("parent")
	void rs$setDragParent(Widget dragParent);

	@Import("onVarTransmit")
	@Override
	Object[] getOnVarTransmitListener();

	@Import("onVarTransmit")
	@Override
	void setOnVarTransmitListener(Object[] o);

	@Import("fillMode")
	RSFillMode getFillMode();

	@Import("textLineHeight")
	int getLineHeight();

	@Import("textLineHeight")
	void rs$setLineHeight(int height);

	void broadcastHidden(boolean hidden);
}