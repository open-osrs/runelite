/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.api.widgets;

import java.awt.Rectangle;
import java.util.Collection;
import net.runelite.api.FontTypeFace;
import net.runelite.api.Point;
import net.runelite.api.Sprite;

/**
 * Represents an on-screen UI element that is drawn on the canvas.
 * <p>
 * It should be noted that most RuneLite-added elements are not Widgets, but are
 * an Overlay. Notable exceptions include bank tag tabs and chatbox inputs
 * <p>
 * Examples of Widgets include:
 * <ul>
 * <li>The fairy ring configuration selector</li>
 * <li>The mini-map</li>
 * <li>The bank inventory</li>
 * </ul>
 * <p>
 * For a more complete idea of what is classified as a widget, see {@link WidgetID}.
 */
public interface Widget
{
	/**
	 * Gets the widgets ID.
	 *
	 * @see WidgetID
	 */
	int getId();

	/**
	 * Gets the type of the widget.
	 *
	 * @see WidgetType
	 */
	int getType();

	/**
	 * Sets the type of the widget.
	 *
	 * @see WidgetType
	 */
	void setType(int type);

	/**
	 * Gets the type of content displayed by the widget.
	 */
	int getContentType();

	/**
	 * Sets the type of content displayed by the widget.
	 */
	void setContentType(int contentType);

	/**
	 * Gets the current click configuration of the widget.
	 * @see WidgetConfig
	 *
	 * @see WidgetConfig
	 */
	int getClickMask();

	/**
	 * Sets the click configuration of the widget.
	 *
	 * @see WidgetConfig
	 */
	void setClickMask(int mask);

	/**
	 * Gets the parent widget, if this widget is a child.
	 *
	 * @return the parent widget, or null
	 */
	Widget getParent();

	/**
	 * Gets the ID of the parent widget.
	 *
	 * @return the parent ID, or -1 if this widget is not a child
	 */
	int getParentId();

	/**
	 * Gets a dynamic child by index
	 *
	 * @throws IndexOutOfBoundsException if the index is outside of the child array
	 */
	Widget getChild(int index);

	/**
	 * Gets the dynamic children of this widget in a sparse array
	 */
	Widget[] getChildren();

	/**
	 * Sets the dynamic children sparse array
	 */
	void setChildren(Widget[] children);

	/**
	 * Gets all dynamic children.
	 *
	 * @return the dynamic children
	 */
	Widget[] getDynamicChildren();

	/**
	 * Gets all static children.
	 *
	 * @return the static children
	 */
	Widget[] getStaticChildren();

	/**
	 * Gets all nested children.
	 *
	 * @return the nested children
	 */
	Widget[] getNestedChildren();

	/**
	 * Gets the relative x-axis coordinate to the widgets parent.
	 *
	 * @return the relative x-axis coordinate
	 */
	int getRelativeX();

	/**
	 * Sets the relative x-axis coordinate to the widgets parent.
	 *
	 * You do not want to use this. Use {@link #setOriginalX(int)}, {@link #setXPositionMode(int)}
	 * and {@link #revalidate()}. Almost any interaction with this widget from a clientscript will
	 * recalculate this value.
	 */
	@Deprecated
	void setRelativeX(int x);

	/**
	 * Gets the relative y-axis coordinate to the widgets parent.
	 *
	 * @return the relative coordinate
	 */
	int getRelativeY();

	/**
	 * Sets the relative y-axis coordinate to the widgets parent.
	 *
	 * You do not want to use this. Use {@link #setOriginalY(int)}, {@link #setYPositionMode(int)}
	 * and {@link #revalidate()}. Almost any interaction with this widget from a clientscript will
	 * recalculate this value.
	 */
	@Deprecated
	void setRelativeY(int y);

	/**
	 * Gets the text displayed on this widget.
	 *
	 * @return the displayed text
	 */
	String getText();

	/**
	 * Sets the text displayed on this widget.
	 *
	 * @param text the text to display
	 */
	void setText(String text);

	/**
	 * Gets the color as an RGB value.
	 *
	 * @return RGB24 color
	 * @see java.awt.Color#getRGB()
	 */
	int getTextColor();

	/**
	 * Sets the RGB color of the displayed text or rectangle.
	 *
	 * @param textColor RGB24 color
	 * @see java.awt.Color#getRGB()
	 */
	void setTextColor(int textColor);

	/**
	 * Gets the transparency of the rectangle
	 *
	 * @return 0 = fully opaque, 255 = fully transparent
	 */
	int getOpacity();

	/**
	 * Sets the transparency of the rectangle
	 *
	 * @param transparency 0 = fully opaque, 255 = fully transparent
	 */
	void setOpacity(int transparency);

	/**
	 * Gets the name "op base" of the widget.
	 * <p>
	 * The name of the widget is used in the tooltip when an action is
	 * available. For example, the widget that activates quick prayers
	 * has the name "Quick-prayers" so when hovering there is a tooltip
	 * that says "Activate Quick-prayers".
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Sets the name of the widget.
	 *
	 * @param name the new name
	 */
	void setName(String name);

	/**
	 * Gets the sprite ID displayed in the widget.
	 *
	 * @return the sprite ID
	 * SpriteID
	 */
	int getSpriteId();

	/**
	 * Sets the sprite ID displayed in the widget.
	 *
	 * @param spriteId the sprite ID
	 * SpriteID
	 */
	void setSpriteId(int spriteId);

	/**
	 * Checks whether this widget or any of its parents are hidden.
	 *
	 * This must be ran on the client thread
	 *
	 * @return true if this widget or any parent is hidden, false otherwise
	 */
	boolean isHidden();

	/**
	 * Checks whether this widget is hidden, not taking into account
	 * any parent hidden states.
	 *
	 * @return true if this widget is hidden, false otherwise
	 */
	boolean isSelfHidden();

	/**
	 * Sets the self-hidden state of this widget.
	 *
	 * @param hidden new hidden state
	 */
	void setHidden(boolean hidden);

	/**
	 * The index of this widget in it's parent's children array
	 */
	int getIndex();

	/**
	 * Gets the model ID displayed in the widget.
	 *
	 * @return the model ID
	 */
	int getModelId();

	/**
	 * Sets the model ID displayed in the widget
	 *
	 * @param modelId the new model ID
	 */
	void setModelId(int modelId);

	/**
	 * Gets the x rotation of the model displayed in the widget
	 *
	 * @return the x rotation
	 */
	int getRotationX();

	/**
	 * Sets the x rotation of the model displayed in the widget
	 *
	 * @param rotationX 0 = no rotation, 2047 = full rotation, outside range = crash
	 */
	void setRotationX(int rotationX);

	/**
	 * Gets the y rotation of the model displayed in the widget
	 *
	 * @return the y rotation
	 */
	int getRotationY();

	/**
	 * Sets the y rotation of the model displayed in the widget
	 *
	 * @param rotationY 0 = no rotation, 2047 = full rotation, outside range = crash
	 */
	void setRotationY(int rotationY);

	/**
	 * Gets the z rotation of the model displayed in the widget
	 *
	 * @return the z rotation
	 */
	int getRotationZ();

	/**
	 * Sets the z rotation of the model displayed in the widget
	 *
	 * @param rotationZ 0 = no rotation, 2047 = full rotation, outside range = crash
	 */
	void setRotationZ(int rotationZ);

	/**
	 * Gets the amount zoomed in on the model displayed in the widget
	 *
	 * @return the amount zoomed in
	 */
	int getModelZoom();

	/**
	 * Sets the amount zoomed in on the model displayed in the widget
	 * 
	 * @param modelZoom the new zoom amount
	 */
	void setModelZoom(int modelZoom);

	/**
	 * Gets the location the widget is being drawn on the canvas.
	 * <p>
	 * This method accounts for the relative coordinates and bounds
	 * of any parent widgets.
	 *
	 * @return the upper-left coordinate of where this widget is drawn
	 */
	Point getCanvasLocation();

	/**
	 * Gets the width of the widget.
	 * <p>
	 * If this widget is storing any {@link // WidgetItem}s, this value is
	 * used to store the number of item slot columns.
	 *
	 * @return the width
	 */
	int getWidth();

	/**
	 * Sets the width of the widget.
	 *
	 * You do not want to use this. Use {@link #setOriginalWidth(int)}, {@link #setWidthMode(int)}
	 * and {@link #revalidate()}. Almost any interaction with this widget from a clientscript will
	 * recalculate this value.
	 */
	@Deprecated
	void setWidth(int width);

	/**
	 * Gets the height of the widget.
	 *
	 * @return the height
	 */
	int getHeight();

	/**
	 * Sets the height of the widget.
	 *
	 * You do not want to use this. Use {@link #setOriginalHeight(int)}, {@link #setHeightMode(int)}
	 * and {@link #revalidate()}. Almost any interaction with this widget from a clientscript will
	 * recalculate this value.
	 */
	@Deprecated
	void setHeight(int height);

	/**
	 * Gets the area where the widget is drawn on the canvas.
	 *
	 * @return the occupied area of the widget
	 */
	Rectangle getBounds();

	/**
	 * Gets any items that are being displayed in the widget.
	 *
	 * @return any items displayed, or null if there are no items
	 */
	Collection<WidgetItem> getWidgetItems();

	/**
	 * Gets a widget item at a specific index.
	 *
	 * @param index index of the item
	 * @return the widget item at index, or null if an item at index
	 * does not exist
	 * @throws IndexOutOfBoundsException if the index is out of bounds
	 */
	WidgetItem getWidgetItem(int index);

	/**
	 * Gets the item ID displayed by the widget.
	 *
	 * @return the item ID
	 */
	int getItemId();

	/**
	 * Sets the item ID displayed by the widget.
	 *
	 * @param itemId the item ID
	 */
	void setItemId(int itemId);

	/**
	 * Gets the quantity of the item displayed by the widget.
	 *
	 * @return the item quantity
	 */
	int getItemQuantity();

	/**
	 * Sets the item quantity displayed by the widget.
	 *
	 * @param quantity the quantity of the item
	 */
	void setItemQuantity(int quantity);

	/**
	 * Checks if the passed canvas points is inside of this widget's
	 * {@link #getBounds() bounds}
	 *
	 * @param point the canvas point
	 * @return true if this widget contains the point, false otherwise
	 */
	boolean contains(Point point);

	/**
	 * Gets the amount of pixels the widget is scrolled in the X axis
	 */
	int getScrollX();

	/**
	 * Sets the amount of pixels the widget is scrolled in the X axis
	 */
	void setScrollX(int scrollX);

	/**
	 * Gets the amount of pixels the widget is scrolled in the Y axis
	 */
	int getScrollY();

	/**
	 * sets the amount of pixels the widget is scrolled in the Y axis
	 */
	void setScrollY(int scrollY);

	/**
	 * Gets the size of the widget's viewport in the X axis
	 */
	int getScrollWidth();

	/**
	 * Sets the size of the widget's viewport in the X axis
	 */
	void setScrollWidth(int width);

	/**
	 * Gets the size of the widget's viewport in the Y axis
	 */
	int getScrollHeight();

	/**
	 * Sets the size of the widget's viewport in the Y axis
	 */
	void setScrollHeight(int height);

	/**
	 * Gets the X coordinate of this widget before being adjusted by
	 * {@link #getXPositionMode()}}.
	 */
	int getOriginalX();

	/**
	 * Sets the X input to the {@link WidgetPositionMode}. {@link #revalidate()} must be
	 * called for the new values to take effect.
	 *
	 * @see #setXPositionMode(int)
	 */
	void setOriginalX(int originalX);

	/**
	 * Gets the Y coordinate of this widget before being adjusted by
	 * {@link #getYPositionMode()}}
	 */
	int getOriginalY();

	/**
	 * Sets the Y input to the {@link WidgetPositionMode}. {@link #revalidate()} must be
	 * called for the new values to take effect.
	 *
	 * @see #setYPositionMode(int)
	 */
	void setOriginalY(int originalY);

	/**
	 * Gets the height coordinate of this widget before being adjusted by
	 * {@link #getHeightMode()}
	 */
	int getOriginalHeight();

	/**
	 * Sets the height input to the {@link WidgetSizeMode}. {@link #revalidate()} must be
	 * called for the new values to take effect.
	 *
	 * @see #setHeightMode(int)
	 */
	void setOriginalHeight(int originalHeight);

	/**
	 * Gets the width coordinate of this widget before being adjusted by
	 * {@link #getWidthMode()}
	 */
	int getOriginalWidth();

	/**
	 * Sets the width input to the {@link WidgetSizeMode}. {@link #revalidate()} must be
	 * called for the new values to take effect.
	 *
	 * @see #setWidthMode(int)
	 */
	void setOriginalWidth(int originalWidth);

	/**
	 * Gets the menu options available on the widget as a sparse array.
	 */
	String[] getActions();

	/**
	 * Creates a dynamic widget child
	 *
	 * @param index the index of the new widget in the children list or -1 to append to the back
	 * @param type  the type of the widget
	 */
	Widget createChild(int index, int type);

	/**
	 * Removes all of this widget's dynamic children
	 */
	void deleteAllChildren();

	/**
	 * Creates a menu option on the widget
	 *
	 * @param index  The index of the menu
	 * @param action The verb to be displayed next to the widget's name in the context menu
	 */
	void setAction(int index, String action);

	/**
	 * Sets a script to be ran when the a menu action is clicked.
	 * hasListener must be true for this to take effect
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnOpListener(Object... args);

	/**
	 * Sets a script to be ran when the dialog is canceled
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnDialogAbortListener(Object... args);

	/**
	 * Sets a script to be ran on key input
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnKeyListener(Object... args);

	/**
	 * Sets a script to be ran when the mouse enters the widget bounds
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnMouseOverListener(Object... args);

	/**
	 * Sets a script to be ran every client tick when the mouse is in the widget bounds
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnMouseRepeatListener(Object... args);

	/**
	 * Sets a script to be ran when the mouse leaves the widget bounds
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnMouseLeaveListener(Object... args);

	/**
	 * Sets a script to be ran every client tick
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnTimerListener(Object... args);

	/**
	 * Sets a script to be ran when the target mode has been activated for this widget
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnTargetEnterListener(Object... args);

	/**
	 * Sets a script to be ran when the target mode has been deactivated for this widget
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnTargetLeaveListener(Object... args);

	/**
	 * If this widget has any listeners on it
	 */
	boolean hasListener();

	/**
	 * Sets if the widget has any listeners. This should be called whenever a setXListener function is called
	 */
	void setHasListener(boolean hasListener);

	/**
	 * This is true if the widget is from an if3 interface, or is dynamically created
	 */
	boolean isIf3();

	/**
	 * Recomputes this widget's x/y/w/h, excluding scroll
	 */
	void revalidate();

	/**
	 * Recomputes this widget's group's x/y/w/h including scroll
	 */
	void revalidateScroll();

	/**
	 * Array of widget key listeners
	 */
	Object[] getOnKeyListener();

	/**
	 * Array of widget load listeners
	 */
	Object[] getOnLoadListener();

	Object[] getOnInvTransmit();

	Object[] getOnOp();

	/**
	 * Returns the archive id of the font used
	 *
	 * @see net.runelite.api.FontID
	 */
	int getFontId();

	/**
	 * Sets the archive id of the font
	 *
	 * @see net.runelite.api.FontID
	 */
	void setFontId(int id);

	/**
	 * Returns the border type of item/sprite on the widget
	 * 0 - No border
	 * 1 - 1px black border
	 * 2 - 1px black under 1px white border (selected item)
	 */
	int getBorderType();

	/**
	 * @see #getBorderType
	 */
	void setBorderType(int thickness);

	/**
	 * Returns if text is shadowed
	 */
	boolean getTextShadowed();

	/**
	 * Sets if text should be shadowed
	 */
	void setTextShadowed(boolean shadowed);

	/**
	 * Returns the widget drag dead zone
	 */
	int getDragDeadZone();

	/**
	 * Sets the widget drag dead zone
	 */
	void setDragDeadZone(int deadZone);

	/**
	 * Returns the widget drag dead time
	 */
	int getDragDeadTime();

	/**
	 * Sets the widget drag dead time
	 */
	void setDragDeadTime(int deadTime);

	/**
	 * Returns widget {@link net.runelite.api.widgets.ItemQuantityMode}.
	 */
	int getItemQuantityMode();

	/**
	 * Sets the widget {@link net.runelite.api.widgets.ItemQuantityMode}
	 */
	void setItemQuantityMode(int itemQuantityMode);

	/**
	 * Gets the mode that the X position is calculated from the original X position
	 *
	 * @see WidgetPositionMode
	 */
	int getXPositionMode();

	/**
	 * Sets the mode that the X position is calculated from the original X position.
	 * {@link #revalidate()} must be called for new values to take effect.
	 *
	 * @see WidgetPositionMode
	 */
	void setXPositionMode(int xpm);

	/**
	 * Gets the mode that the Y position is calculated from the original Y position
	 *
	 * @see WidgetPositionMode
	 */
	int getYPositionMode();

	/**
	 * Sets the mode that the Y position is calculated from the original Y position.
	 * {@link #revalidate()} must be called for new values to take effect.
	 *
	 * @see WidgetPositionMode
	 */
	void setYPositionMode(int ypm);

	/**
	 * Gets the X axis text position mode
	 *
	 * @see WidgetTextAlignment
	 */
	int getXTextAlignment();

	/**
	 * Sets the X axis text position mode
	 *
	 * @see WidgetTextAlignment
	 */
	void setXTextAlignment(int xta);

	/**
	 * Gets the Y axis text position mode
	 *
	 * @see WidgetTextAlignment
	 */
	int getYTextAlignment();

	/**
	 * Sets the Y axis text position mode
	 *
	 * @see WidgetTextAlignment
	 */
	void setYTextAlignment(int yta);

	/**
	 * Gets the mode controlling widget width
	 *
	 * @see WidgetSizeMode
	 */
	int getWidthMode();

	/**
	 * Sets the mode controlling widget width.
	 * {@link #revalidate()} must be called for new values to take effect.
	 *
	 * @see WidgetSizeMode
	 */
	void setWidthMode(int widthMode);

	/**
	 * Gets the mode controlling widget width
	 *
	 * @see WidgetSizeMode
	 */
	int getHeightMode();

	/**
	 * Sets the mode controlling widget width.
	 * {@link #revalidate()} must be called for new values to take effect.
	 *
	 * @see WidgetSizeMode
	 */
	void setHeightMode(int heightMode);

	/**
	 * Gets the font that this widget uses
	 */
	FontTypeFace getFont();

	/**
	 * Gets if the rectangle is filled or just stroked
	 */
	boolean isFilled();

	/**
	 * Sets if the rectangle is filled or just stroked
	 */
	void setFilled(boolean filled);

	/**
	 * Verb for spell targets
	 */
	String getTargetVerb();

	/**
	 * Verb for spell targets
	 */
	void setTargetVerb(String targetVerb);

	/**
	 * Can widgets under this widgets be clicked in this widgets bounding box
	 */
	boolean getNoClickThrough();

	/**
	 * Can widgets under this widgets be clicked in this widgets bounding box
	 */
	void setNoClickThrough(boolean noClickThrough);

	/**
	 * Can widgets under this widgets be scrolled in this widgets bounding box
	 */
	boolean getNoScrollThrough();

	/**
	 * Can widgets under this widgets be scrolled in this widgets bounding box
	 */
	void setNoScrollThrough(boolean noScrollThrough);

	/**
	 * Changes the parent ID for the widget
	 */
	void setParentId(int id);

	/**
	 * Changes the ID of the widget
	 */
	void setId(int id);

	/**
	 * Sets the index of this element
	 */
	void setIndex(int index);

	/**
	 * Seems like this needs to set to true when creating new widgets
	 */
	void setIsIf3(boolean isIf3);

	/**
	 * Returns yes if your mouse pointer is over this widget or any of it's children.
	 */
	boolean containsMouse();

	/**
	 * Gets the image which is (or should be) drawn on this widget
	 */
	Sprite getSprite();

	/**
	 * {@link net.runelite.api.VarPlayer}s that triggers this widgets varTransmitListener
	 */
	void setVarTransmitTrigger(int ...trigger);

	/**
	 * Sets a script to be ran the first client tick the mouse is held ontop of this widget
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnClickListener(Object ...args);

	/**
	 * Sets a script to be ran the every client tick the mouse is held ontop of this widget,
	 * except the first client tick.
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnHoldListener(Object ...args);

	/**
	 * Sets a script to be ran the first client tick the mouse is not held ontop of this widget
	 *
	 * @param args A ScriptID, then the args for the script
	 */
	void setOnReleaseListener(Object ...args);
}
