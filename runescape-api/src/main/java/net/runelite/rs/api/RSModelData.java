package net.runelite.rs.api;

import net.runelite.api.ModelData;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

public interface RSModelData extends RSRenderable, ModelData
{
	@Import("faceCount")
	int getFaceCount();

	@Import("indices1")
	int[] getFaceIndices1();

	@Import("indices2")
	int[] getFaceIndices2();

	@Import("indices3")
	int[] getFaceIndices3();

	@Import("verticesX")
	int[] getVerticesX();

	@Import("verticesX")
	void setVerticesX(int[] var1);

	@Import("verticesY")
	int[] getVerticesY();

	@Import("verticesY")
	void setVerticesY(int[] var1);

	@Import("verticesZ")
	int[] getVerticesZ();

	@Import("verticesZ")
	void setVerticesZ(int[] var1);

	@Import("texTriangleX")
	short[] getTexTriangleX();

	@Import("texTriangleY")
	short[] getTexTriangleY();

	@Import("texTriangleZ")
	short[] getTexTriangleZ();

	@Import("faceTextures")
	short[] getFaceTextures();

	@Import("faceTextures")
	void setFaceTextures(short[] var1);

	@Import("faceAlphas")
	byte[] getFaceTransparencies();

	@Import("faceAlphas")
	void setFaceTransparencies(byte[] var1);

	@Import("faceColors")
	short[] getFaceColors();

	@Import("faceColors")
	void setFaceColors(short[] var1);

	@Import("textureCoords")
	byte[] getTextureCoords();

	@Import("textureRenderTypes")
	byte[] getTextureRenderTypes();

	@Import("verticesCount")
	int getVerticesCount();

	@Import("vertexNormals")
	RSVertexNormal[] getVertexNormals();

	@Import("vertexVertices")
	RSVertexNormal[] getVertexVertices();

	@Import("recolor")
	void rs$recolor(short var1, short var2);

	@Import("retexture")
	void rs$retexture(short var1, short var2);

	@Import("toModel")
	RSModel toModel(int var1, int var2, int var3, int var4, int var5);

	@Import("ambient")
	short getAmbient();

	@Import("contrast")
	short getContrast();

	@Import("invalidate")
	void invalidate();

	@Import("copyModelData")
	RSModelData shallowCopy();

	@Construct
	RSModelData newModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5);
}
