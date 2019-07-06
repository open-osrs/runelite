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

import net.runelite.api.Client;
import net.runelite.api.Sprite;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import java.util.Map;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

public interface RSClient extends RSGameShell, Client
{
	@Import("cameraX")
	@Override
	int getCameraX();

	@Import("cameraZ") // <--- This is correct!
	@Override
	int getCameraY();

	@Import("cameraY") // <--- This is correct!
	@Override
	int getCameraZ();

	@Import("Scene_cameraX")
	@Override
	int getCameraX2();

	@Import("Scene_cameraY")
	@Override
	int getCameraY2();

	@Import("Scene_cameraZ")
	@Override
	int getCameraZ2();

	@Import("plane")
	@Override
	int getPlane();

	@Import("cameraPitch")
	@Override
	int getCameraPitch();

	@Import("cameraPitch")
	void setCameraPitch(int cameraPitch);

	@Import("cameraYaw")
	@Override
	int getCameraYaw();

	@Import("worldId")
	int getWorld();

	@Import("fps")
	@Override
	int getFPS();

	@Import("minimapOrientation")
	@Override
	int getMapAngle();

	@Import("Tiles_heights")
	@Override
	int[][][] getTileHeights();

	@Import("Tiles_renderFlags")
	@Override
	byte[][][] getTileSettings();

	@Import("Varps_main")
	@Override
	int[] getVarps();

	@Import("varcs")
	RSVarcs getVarcs();

	@Import("runEnergy")
	@Override
	int getEnergy();

	@Import("weight")
	@Override
	int getWeight();

	@Import("baseX")
	@Override
	int getBaseX();

	@Import("baseY")
	@Override
	int getBaseY();

	@Import("currentLevels")
	@Override
	int[] getBoostedSkillLevels();

	@Import("levels")
	@Override
	int[] getRealSkillLevels();

	@Import("experience")
	@Override
	int[] getSkillExperiences();

	@Import("changedSkills")
	int[] getChangedSkills();

	@Import("changedSkillsCount")
	int getChangedSkillsCount();

	@Import("changedSkillsCount")
	void setChangedSkillsCount(int i);

	@Import("gameState")
	int getRSGameState();

	@Import("updateGameState")
	void setGameState(int gameState);

	@Import("checkClick")
	void setCheckClick(boolean checkClick);

	@Import("Scene_selectedScreenX")
	void setMouseCanvasHoverPositionX(int x);

	@Import("Scene_selectedScreenY")
	void setMouseCanvasHoverPositionY(int y);

	@Import("MouseHandler_currentButton")
	@Override
	int getMouseCurrentButton();

	@Import("Scene_selectedX")
	int getSelectedSceneTileX();

	@Import("Scene_selectedX")
	void setSelectedSceneTileX(int selectedSceneTileX);

	@Import("Scene_selectedY")
	int getSelectedSceneTileY();

	@Import("Scene_selectedY")
	void setSelectedSceneTileY(int selectedSceneTileY);

	@Import("isDraggingWidget")
	@Override
	boolean isDraggingWidget();

	@Import("clickedWidget")
	@Override
	RSWidget getDraggedWidget();

	@Import("draggedOnWidget")
	@Override
	RSWidget getDraggedOnWidget();

	@Import("draggedOnWidget")
	@Override
	void setDraggedOnWidget(Widget widget);

	@Import("widgets")
	RSWidget[][] getWidgets();

	/**
	 * Gets an array of widgets that correspond to the passed group ID.
	 *
	 * @param groupId the group ID
	 * @return the widget group
	 * @see net.runelite.api.widgets.WidgetID
	 */
	RSWidget[] getGroup(int groupId);

	@Import("scene")
	@Override
	RSScene getScene();

	@Import("localPlayer")
	@Override
	RSPlayer getLocalPlayer();

	@Import("npcCount")
	int getNpcIndexesCount();

	@Import("npcIndices")
	int[] getNpcIndices();

	@Import("npcs")
	@Override
	RSNPC[] getCachedNPCs();

	@Import("collisionMaps")
	RSCollisionMap[] getCollisionMaps();

	@Import("Players_count")
	int getPlayerIndexesCount();

	@Import("Players_indices")
	int[] getPlayerIndices();

	@Import("players")
	@Override
	RSPlayer[] getCachedPlayers();

	@Import("combatTargetPlayerIndex")
	int getLocalInteractingIndex();

	@Import("groundItems")
	RSNodeDeque[][][] getGroundItemDeque();

	@Import("projectiles")
	RSNodeDeque getProjectilesDeque();

	@Import("graphicsObjects")
	RSNodeDeque getGraphicsObjectDeque();

	@Import("Login_username")
	@Override
	String getUsername();

	@Import("Login_username")
	@Override
	void setUsername(String username);

	@Import("Login_password")
	@Override
	void setPassword(String password);

	@Import("otp")
	@Override
	void setOtp(String otp);

	@Import("currentLoginField")
	@Override
	int getCurrentLoginField();

	@Import("loginIndex")
	@Override
	int getLoginIndex();

	@Import("playerMenuActions")
	@Override
	String[] getPlayerOptions();

	@Import("playerOptionsPriorities")
	@Override
	boolean[] getPlayerOptionsPriorities();

	@Import("playerMenuOpcodes")
	@Override
	int[] getPlayerMenuTypes();

	@Import("MouseHandler_x0")
	int getMouseX();

	@Import("MouseHandler_y0")
	int getMouseY();

	@Import("Scene_selectedScreenX")
	int getMouseX2();

	@Import("Scene_selectedScreenY")
	int getMouseY2();

	@Import("containsBounds")
	boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@Import("checkClick")
	boolean isCheckClick();

	@Import("menuOptionsCount")
	@Override
	int getMenuOptionCount();

	@Import("menuOptionsCount")
	void setMenuOptionCount(int menuOptionCount);

	@Import("menuActions")
	String[] getMenuOptions();

	@Import("menuTargetNames")
	String[] getMenuTargets();

	@Import("menuArguments0")
	int[] getMenuIdentifiers();

	@Import("menuOpcodes")
	int[] getMenuTypes();

	@Import("menuArguments1")
	int[] getMenuActionParams0();

	@Import("menuArguments2")
	int[] getMenuActionParams1();

	@Import("menuShiftClick")
	boolean[] getMenuForceLeftClick();

	@Import("worlds")
	@Override
	RSWorld[] getWorldList();

	@Import("addChatMessage")
	void addChatMessage(int type, String name, String message, String sender);

	@Override
	@Import("getObjectDefinition")
	RSObjectDefinition getObjectDefinition(int objectId);

	@Override
	@Import("getNpcDefinition")
	RSNPCDefinition getNpcDefinition(int npcId);

	@Import("viewportZoom")
	@Override
	int getScale();

	@Import("canvasHeight")
	@Override
	int getCanvasHeight();

	@Import("canvasWidth")
	@Override
	int getCanvasWidth();

	@Import("viewportHeight")
	@Override
	int getViewportHeight();

	@Import("viewportWidth")
	@Override
	int getViewportWidth();

	@Import("viewportOffsetX")
	@Override
	int getViewportXOffset();

	@Import("viewportOffsetY")
	@Override
	int getViewportYOffset();

	@Import("isResizable")
	@Override
	boolean isResized();

	@Import("rootWidgetXs")
	@Override
	int[] getWidgetPositionsX();

	@Import("rootWidgetYs")
	@Override
	int[] getWidgetPositionsY();

	@Import("itemContainers")
	RSNodeHashTable getItemContainers();

	@Import("getItemDefinition")
	@Override
	RSItemDefinition getItemDefinition(int itemId);

	@Import("getItemSprite")
	RSSprite createItemSprite(int itemId, int quantity, int thickness, int borderColor, int stackable, boolean noted);

	@Import("menuAction")
	@Override
	void invokeMenuAction(int n2, int n3, int n4, int n5, String string, String string2, int n6, int n7);

	@Import("decodeSprite")
	void decodeSprite(byte[] data);

	@Import("indexedSpriteCount")
	int getIndexedSpriteCount();

	@Import("indexedSpriteWidth")
	int getIndexedSpriteWidth();

	@Import("indexedSpriteHeight")
	int getIndexedSpriteHeight();

	@Import("indexedSpriteOffsetXs")
	int[] getIndexedSpriteOffsetXs();

	@Import("indexedSpriteOffsetXs")
	void setIndexedSpriteOffsetXs(int[] indexedSpriteOffsetXs);

	@Import("indexedSpriteOffsetYs")
	int[] getIndexedSpriteOffsetYs();

	@Import("indexedSpriteOffsetYs")
	void setIndexedSpriteOffsetYs(int[] indexedSpriteOffsetYs);

	@Import("indexedSpriteWidths")
	int[] getIndexedSpriteWidths();

	@Import("indexedSpriteWidths")
	void setIndexedSpriteWidths(int[] indexedSpriteWidths);

	@Import("indexedSpriteHeights")
	int[] getIndexedSpriteHeights();

	@Import("indexedSpriteHeights")
	void setIndexedSpriteHeights(int[] indexedSpriteHeights);

	@Import("spritePixels")
	byte[][] getSpritePixels();

	@Import("spritePixels")
	void setSpritePixels(byte[][] spritePixels);

	@Import("indexedSpritePalette")
	int[] getIndexedSpritePalette();

	@Import("indexedSpritePalette")
	void setIndexedSpritePalette(int[] indexedSpritePalette);

	@Import("indexCache8")
	@Override
	RSAbstractIndexCache getIndexSprites();

	@Import("indexCache12")
	@Override
	RSAbstractIndexCache getIndexScripts();

	@Import("widgetClickMasks")
	@Override
	RSNodeHashTable getWidgetFlags();

	@Import("widgetGroupParents")
	@Override
	RSNodeHashTable getComponentTable();

	@Import("grandExchangeOffers")
	RSGrandExchangeOffer[] getGrandExchangeOffers();

	@Import("isMenuOpen")
	@Override
	boolean isMenuOpen();

	@Import("cycle")
	@Override
	int getGameCycle();

	// unused
	//@Import("packetHandler")
	//void packetHandler();

	@Import("Messages_channels")
	@Override
	Map getChatLineMap();

	@Import("Messages_hashTable")
	@Override
	RSIterableNodeHashTable getMessages();

	@Import("revision")
	@Override
	int getRevision();

	@Import("regions")
	@Override
	int[] getMapRegions();

	@Import("instanceChunkTemplates")
	@Override
	int[][][] getInstanceTemplateChunks();

	@Import("xteaKeys")
	@Override
	int[][] getXteaKeys();

	@Import("gameDrawingMode")
	@Override
	int getGameDrawingMode();

	@Import("gameDrawingMode")
	@Override
	void setGameDrawingMode(int gameDrawingMode);

	@Import("cycleCntr")
	int getCycleCntr();

	@Import("chatCycle")
	void setChatCycle(int value);

	/**
	 * Get the widget top group. widgets[topGroup] contains widgets with
	 * parentId -1, which are the widget roots.
	 */
	@Import("rootWidgetGroup")
	int getWidgetRoot();

	@Import("WorldMapElement_cached")
	@Override
	RSWorldMapElement[] getMapElementConfigs();

	@Import("mapSceneSprites")
	@Override
	RSIndexedSprite[] getMapScene();

	@Import("mapIcons")
	@Override
	RSSprite[] getMapIcons();

	@Import("mapDotSprites")
	RSSprite[] getMapDots();

	@Import("AbstractFont_modIconSprites")
	@Override
	RSIndexedSprite[] getModIcons();

	@Import("AbstractFont_modIconSprites")
	void setRSModIcons(RSIndexedSprite[] modIcons);

	@Construct
	@Override
	RSIndexedSprite createIndexedSprite();

	@Construct
	@Override
	RSSprite createSprite(int[] pixels, int width, int height);

	@Import("destinationX")
	int getDestinationX();

	@Import("destinationY")
	int getDestinationY();

	@Import("soundEffects")
	RSSoundEffect[] getAudioEffects();

	@Import("soundEffectIds")
	int[] getQueuedSoundEffectIDs();

	@Import("soundLocations")
	int[] getSoundLocations();

	@Import("queuedSoundEffectLoops")
	int[] getQueuedSoundEffectLoops();

	@Import("queuedSoundEffectDelays")
	int[] getQueuedSoundEffectDelays();

	@Import("soundEffectCount")
	int getQueuedSoundEffectCount();

	@Import("soundEffectCount")
	void setQueuedSoundEffectCount(int queuedSoundEffectCount);

	@Import("queueSoundEffect")
	void queueSoundEffect(int id, int numLoops, int delay);

	@Import("rasterProvider")
	@Override
	RSAbstractRasterProvider getBufferProvider();

	@Import("MouseHandler_idleCycles")
	@Override
	int getMouseIdleTicks();

	@Import("MouseHandler_lastPressedTimeMillis")
	@Override
	long getMouseLastPressedMillis();

	@Import("KeyHandler_idleCycles")
	@Override
	int getKeyboardIdleTicks();

	@Import("isLowDetail")
	void setLowMemory(boolean lowMemory);

	@Import("Scene_isLowDetail")
	void setSceneLowMemory(boolean lowMemory);

	@Import("isStereo")
	void setAudioHighMemory(boolean highMemory);

	@Import("ObjectDefinition_isLowDetail")
	void setObjectDefinitionLowDetail(boolean lowDetail);

	@Construct
	RSGroundItem createItem();

	@Import("Interpreter_intStackSize")
	@Override
	int getIntStackSize();

	@Import("Interpreter_intStackSize")
	@Override
	void setIntStackSize(int stackSize);

	@Import("Interpreter_intStack")
	@Override
	int[] getIntStack();

	@Import("Interpreter_stringStackSize")
	@Override
	int getStringStackSize();

	@Import("Interpreter_stringStackSize")
	@Override
	void setStringStackSize(int stackSize);

	@Import("Interpreter_stringStack")
	@Override
	String[] getStringStack();

	@Import("friendSystem")
	RSFriendSystem getFriendManager();

	@Import("clanChat")
	RSClanChat getClanMemberManager();

	@Import("loginType")
	RSLoginType getLoginType();

	@Construct
	RSUsername createName(String name, RSLoginType type);

	@Import("getVarbit")
	int getVarbit(int varbitId);

	@Import("VarbitDefinition_cached")
	RSEvictingDualNodeHashTable getVarbitCache();

	@Import("clientPreferences")
	@Override
	RSClientPreferences getPreferences();

	/**
	 * This is the pitch the user has set the camera to.
	 * It should be between 128 and (pitchUnlimiter?512:383) JAUs(1).
	 * The difference between this and cameraPitch is that cameraPitch has a lower limit, imposed by the surrounding
	 * terrain.
	 *
	 * (1) JAU - Jagex Angle Unit; 1/1024 of a revolution
	 */
	@Import("cameraPitchTarget")
	int getCameraPitchTarget();

	@Import("cameraPitchTarget")
	void setCameraPitchTarget(int pitch);

	@Import("Scene_cameraPitchSine")
	void setPitchSin(int v);

	@Import("Scene_cameraPitchCosine")
	void setPitchCos(int v);

	@Import("Scene_cameraYawSine")
	void setYawSin(int v);

	@Import("Scene_cameraYawCosine")
	void setYawCos(int v);

	@Import("Rasterizer3D_zoom")
	@Override
	int get3dZoom();

	@Import("Rasterizer3D_zoom")
	void set3dZoom(int zoom);

	@Import("Rasterizer3D_clipMidX2")
	@Override
	int getRasterizer3D_clipMidX2();

	@Import("Rasterizer3D_clipNegativeMidX")
	@Override
	int getRasterizer3D_clipNegativeMidX();

	@Import("Rasterizer3D_clipNegativeMidY")
	@Override
	int getRasterizer3D_clipNegativeMidY();

	@Import("Rasterizer3D_clipMidY2")
	@Override
	int getRasterizer3D_clipMidY2();

	@Import("Rasterizer3D_clipMidX")
	@Override
	int getCenterX();

	@Import("Rasterizer3D_clipMidY")
	@Override
	int getCenterY();

	@Import("worldMap0")
	RSWorldMap getRenderOverview();

	@Import("changeWorld")
	@Override
	void changeWorld(World world);

	@Construct
	@Override
	RSWorld createWorld();

	@Import("Model_transformTempX")
	void setAnimOffsetX(int animOffsetX);

	@Import("Model_transformTempY")
	void setAnimOffsetY(int animOffsetY);

	@Import("Model_transformTempZ")
	void setAnimOffsetZ(int animOffsetZ);

	@Import("getFrames")
	RSFrames getFrames(int frameId);

	@Import("sceneMinimapSprite")
	RSSprite getMinimapSprite();

	@Import("sceneMinimapSprite")
	void setMinimapSprite(Sprite spritePixels);

	@Import("drawObject")
	void drawObject(int z, int x, int y, int randomColor1, int randomColor2);

	@Construct
	RSScriptEvent createScriptEvent();

	@Import("runScript0")
	void runScript(RSScriptEvent ev, int ex);

	@Import("hintArrowType")
	void setHintArrowTargetType(int value);

	@Import("hintArrowType")
	int getHintArrowTargetType();

	@Import("hintArrowX")
	void setHintArrowX(int value);

	@Import("hintArrowX")
	int getHintArrowX();

	@Import("hintArrowY")
	void setHintArrowY(int value);

	@Import("hintArrowY")
	int getHintArrowY();

	@Import("hintArrowSubX")
	void setHintArrowOffsetX(int value);

	@Import("hintArrowSubY")
	void setHintArrowOffsetY(int value);

	@Import("hintArrowNpcIndex")
	void setHintArrowNpcTargetIdx(int value);

	@Import("hintArrowNpcIndex")
	int getHintArrowNpcTargetIdx();

	@Import("hintArrowPlayerIndex")
	void setHintArrowPlayerTargetIdx(int value);

	@Import("hintArrowPlayerIndex")
	int getHintArrowPlayerTargetIdx();

	@Import("isInInstance")
	@Override
	boolean isInInstancedRegion();

	@Import("itemDragDuration")
	@Override
	int getItemPressedDuration();

	@Import("itemDragDuration")
	void setItemPressedDuration(int duration);

	@Import("worldProperties")
	int getFlags();

	@Import("compass")
	void setCompass(Sprite spritePixels);

	@Import("widgetSpriteCache")
	@Override
	RSEvictingDualNodeHashTable getWidgetSpriteCache();

	@Import("ItemDefinition_cached")
	@Override
	RSEvictingDualNodeHashTable getItemDefinitionCache();

	@Import("oculusOrbState")
	@Override
	int getOculusOrbState();

	@Import("oculusOrbState")
	@Override
	void setOculusOrbState(int state);

	@Import("oculusOrbNormalSpeed")
	@Override
	void setOculusOrbNormalSpeed(int state);

	@Import("oculusOrbFocalPointX")
	@Override
	int getOculusOrbFocalPointX();

	@Import("oculusOrbFocalPointY")
	@Override
	int getOculusOrbFocalPointY();

	RSGroundItem getLastItemDespawn();

	void setLastItemDespawn(RSGroundItem lastItemDespawn);

	@Construct
	RSWidget createWidget();

	@Import("alignWidget")
	void revalidateWidget(Widget w);

	@Import("revalidateWidgetScroll")
	void revalidateWidgetScroll(Widget[] group, Widget w, boolean postEvent);

	@Import("ViewportMouse_entityCount")
	int getEntitiesAtMouseCount();

	@Import("ViewportMouse_entityCount")
	void setEntitiesAtMouseCount(int i);

	@Import("ViewportMouse_entityTags")
	long[] getEntitiesAtMouse();

	@Import("ViewportMouse_x")
	int getViewportMouseX();

	@Import("ViewportMouse_y")
	int getViewportMouseY();

	@Import("textureProvider")
	@Override
	RSTextureProvider getTextureProvider();

	@Import("tileLastDrawnActor")
	int[][] getOccupiedTilesTick();

	@Import("ObjectDefinition_cachedModels")
	RSEvictingDualNodeHashTable getCachedModels2();

	@Import("Scene_drawnCount")
	int getCycle();

	@Import("Scene_drawnCount")
	void setCycle(int cycle);

	@Import("visibilityMap")
	boolean[][][][] getVisibilityMaps();

	@Import("visibleTiles")
	void setRenderArea(boolean[][] renderArea);

	@Import("Scene_cameraX")
	void setCameraX2(int cameraX2);

	@Import("Scene_cameraY")
	void setCameraY2(int cameraY2);

	@Import("Scene_cameraZ")
	void setCameraZ2(int cameraZ2);

	@Import("Scene_cameraXTile")
	void setScreenCenterX(int screenCenterX);

	@Import("Scene_cameraYTile")
	void setScreenCenterZ(int screenCenterZ); // <-- This is correct!

	@Import("Scene_plane")
	void setScenePlane(int scenePlane);

	@Import("Scene_cameraXTileMin")
	void setMinTileX(int i);

	@Import("Scene_cameraYTileMin")
	void setMinTileZ(int i); // <-- This is correct!

	@Import("Scene_cameraXTileMax")
	void setMaxTileX(int i);

	@Import("Scene_cameraYTileMax")
	void setMaxTileZ(int i); // <-- This is correct!

	@Import("tileUpdateCount")
	int getTileUpdateCount();

	@Import("tileUpdateCount")
	void setTileUpdateCount(int tileUpdateCount);

	@Import("ViewportMouse_isInViewport")
	boolean getViewportContainsMouse();

	@Import("Rasterizer2D_pixels")
	int[] getGraphicsPixels();

	@Import("Rasterizer2D_width")
	int getGraphicsPixelsWidth();

	@Import("Rasterizer2D_height")
	int getGraphicsPixelsHeight();

	@Import("Rasterizer2D_fillRectangle")
	void rasterizerFillRectangle(int x, int y, int w, int h, int rgb);

	@Import("Rasterizer2D_xClipStart")
	int getStartX();

	@Import("Rasterizer2D_yClipStart")
	int getStartY();

	@Import("Rasterizer2D_xClipEnd")
	int getEndX();

	@Import("Rasterizer2D_yClipEnd")
	int getEndY();

	@Import("dragInventoryWidget")
	@Override
	RSWidget getIf1DraggedWidget();

	@Import("dragItemSlotSource")
	@Override
	int getIf1DraggedItemIndex();

	@Import("isSpellSelected")
	@Override
	void setSpellSelected(boolean selected);

	@Import("getEnum")
	RSEnumDefinition getRsEnum(int id);

	@Import("menuX")
	int getMenuX();

	@Import("menuY")
	int getMenuY();

	@Import("menuHeight")
	int getMenuHeight();

	@Import("menuWidth")
	int getMenuWidth();

	@Import("fontBold12")
	RSFont getFontBold12();

	@Import("Rasterizer2D_drawHorizontalLine")
	void rasterizerDrawHorizontalLine(int x, int y, int w, int rgb);

	@Import("Rasterizer2D_drawVerticalLine")
	void rasterizerDrawVerticalLine(int x, int y, int h, int rgb);

	@Import("drawGradient")
	void rasterizerDrawGradient(int x, int y, int w, int h, int rgbTop, int rgbBottom);

	@Import("Rasterizer2D_fillRectangleAlpha")
	void rasterizerFillRectangleAlpha(int x, int y, int w, int h, int rgb, int a);

	@Import("Rasterizer2D_drawRectangle")
	void rasterizerDrawRectangle(int x, int y, int w, int h, int rgb);

	@Import("drawCircle")
	void rasterizerDrawCircle(int x, int y, int r, int rgb);

	@Import("HealthBarDefinition_cached")
	RSEvictingDualNodeHashTable getHealthBarCache();

	@Import("HealthBarDefinition_cachedSprites")
	RSEvictingDualNodeHashTable getHealthBarSpriteCache();

	@Import("renderSelf")
	@Override
	boolean getRenderSelf();

	@Import("renderSelf")
	@Override
	void setRenderSelf(boolean enabled);

	@Import("mouseRecorder")
	RSMouseRecorder getMouseRecorder();

	@Import("selectedSpellName")
	String getSelectedSpellName();

	@Import("isSpellSelected")
	boolean isSpellSelected();

	@Import("readSoundEffect")
	RSSoundEffect getTrack(RSAbstractIndexCache indexData, int id, int var0);

	@Import("createRawPcmStream")
	RSRawPcmStream createRawPcmStream(RSRawSound audioNode, int var0, int volume);

	@Import("pcmStreamMixer")
	RSPcmStreamMixer getSoundEffectAudioQueue();

	@Import("indexCache4")
	RSAbstractIndexCache getIndexCache4();

	@Import("decimator")
	RSDecimator getSoundEffectResampler();

	@Import("soundEffectVolume")
	int getSoundEffectVolume();

	@Import("viewportWalking")
	void setViewportWalking(boolean viewportWalking);

	@Import("crossSprites")
	@Override
	RSSprite[] getCrossSprites();
}
