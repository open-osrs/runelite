package net.runelite.rs.api;

import net.runelite.api.IterableHashTable;
import net.runelite.api.ObjectComposition;
import net.runelite.mapping.Import;

public interface RSObjectComposition extends ObjectComposition
{
	@Import("id")
	@Override
	int getId();

	@Import("name")
	@Override
	String getName();

	@Import("name")
	void setName(String name);

	@Import("actions")
	@Override
	String[] getActions();

	@Import("mapSceneId")
	@Override
	int getMapSceneId();

	@Import("mapIconId")
	@Override
	int getMapIconId();

	@Import("transforms")
	@Override
	int[] getImpostorIds();

	@Import("transform")
	@Override
	RSObjectComposition getImpostor();

	@Import("params")
	RSIterableNodeHashTable getParams();

	@Import("params")
	void setParams(IterableHashTable params);

	@Import("params")
	void setParams(RSIterableNodeHashTable params);

	@Import("decodeNext")
	void decodeNext(RSBuffer buffer, int opcode);

	@Import("modelIds")
	int[] getModelIds();

	@Import("modelIds")
	void setModelIds(int[] modelIds);

	@Import("models")
	int[] getModels();

	@Import("models")
	void setModels(int[] models);

	@Import("ObjectDefinition_isLowDetail")
	boolean getObjectDefinitionIsLowDetail();

	@Import("sizeX")
	int getSizeX();

	@Import("sizeX")
	void setSizeX(int sizeX);

	@Import("sizeY")
	int getSizeY();

	@Import("sizeY")
	void setSizeY(int sizeY);

	@Import("interactType")
	int getInteractType();

	@Import("interactType")
	void setInteractType(int interactType);

	@Import("boolean1")
	boolean getBoolean1();

	@Import("boolean1")
	void setBoolean1(boolean boolean1);

	@Import("int1")
	int getInt1();

	@Import("int1")
	void setInt1(int int1);

	@Import("int2")
	int getInt2();

	@Import("int2")
	void setInt2(int int2);

	@Import("clipType")
	int getClipType();

	@Import("clipType")
	void setClipType(int clipType);

	@Import("nonFlatShading")
	boolean getNonFlatShading();

	@Import("nonFlatShading")
	void setNonFlatShading(boolean nonFlatShading);

	@Import("modelClipped")
	void setModelClipped(boolean modelClipped);

	@Import("modelClipped")
	boolean getModelClipped();

	@Import("animationId")
	int getAnimationId();

	@Import("animationId")
	void setAnimationId(int animationId);

	@Import("ambient")
	int getAmbient();

	@Import("ambient")
	void setAmbient(int ambient);

	@Import("contrast")
	int getContrast();

	@Import("contrast")
	void setContrast(int contrast);

	@Import("recolorFrom")
	short[] getRecolorFrom();

	@Import("recolorFrom")
	void setRecolorFrom(short[] recolorFrom);

	@Import("recolorTo")
	short[] getRecolorTo();

	@Import("recolorTo")
	void setRecolorTo(short[] recolorTo);

	@Import("retextureFrom")
	short[] getRetextureFrom();

	@Import("retextureFrom")
	void setRetextureFrom(short[] retextureFrom);

	@Import("retextureTo")
	short[] getRetextureTo();

	@Import("retextureTo")
	void setRetextureTo(short[] retextureTo);

	@Import("isRotated")
	void setIsRotated(boolean rotated);

	@Import("isRotated")
	boolean getIsRotated();

	@Import("clipped")
	void setClipped(boolean clipped);

	@Import("clipped")
	boolean getClipped();

	@Import("mapSceneId")
	void setMapSceneId(int mapSceneId);

	@Import("modelSizeX")
	void setModelSizeX(int modelSizeX);

	@Import("modelSizeX")
	int getModelSizeX();

	@Import("modelHeight")
	void setModelHeight(int modelHeight);

	@Import("modelSizeY")
	void setModelSizeY(int modelSizeY);

	@Import("offsetX")
	void setOffsetX(int modelSizeY);

	@Import("offsetHeight")
	void setOffsetHeight(int offsetHeight);

	@Import("offsetY")
	void setOffsetY(int offsetY);

	@Import("int3")
	void setInt3(int int3);

	@Import("int5")
	void setInt5(int int5);

	@Import("int6")
	void setInt6(int int6);

	@Import("int7")
	void setInt7(int int7);

	@Import("boolean2")
	void setBoolean2(boolean boolean2);

	@Import("isSolid")
	void setIsSolid(boolean isSolid);

	@Import("ambientSoundId")
	void setAmbientSoundId(int ambientSoundId);

	@Import("soundEffectIds")
	void setSoundEffectIds(int[] soundEffectIds);

	@Import("soundEffectIds")
	int[] getSoundEffectIds();

	@Import("mapIconId")
	void setMapIconId(int mapIconId);

	@Import("boolean3")
	void setBoolean3(boolean boolean3);

	@Import("transformVarbit")
	void setTransformVarbit(int transformVarbit);

	@Import("transformVarbit")
	int getTransformVarbit();

	@Import("transformVarp")
	void setTransformVarp(int transformVarp);

	@Import("transformVarp")
	int getTransformVarp();

	@Import("transforms")
	void setTransforms(int[] transforms);

	@Import("transforms")
	int[] getTransforms();
}
