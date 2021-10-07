package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSModelData extends RSRenderable
{
	@Import("faceCount")
	int getTriangleFaceCount();

	@Import("indices1")
	int[] getTrianglePointsX();

	@Import("indices2")
	int[] getTrianglePointsY();

	@Import("indices3")
	int[] getTrianglePointsZ();

	@Import("verticesX")
	int[] getVertexX();

	@Import("verticesY")
	int[] getVertexY();

	@Import("verticesZ")
	int[] getVertexZ();

	@Import("texTriangleX")
	short[] getTexTriangleX();

	@Import("texTriangleY")
	short[] getTexTriangleY();

	@Import("texTriangleZ")
	short[] getTexTriangleZ();

	@Import("faceTextures")
	short[] getFaceTextures();

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
	void recolor(short var1, short var2);

	@Import("toModel")
	RSModel toModel(int var1, int var2, int var3, int var4, int var5);

	@Import("ambient")
	short getAmbient();

	@Import("contrast")
	short getContrast();
}
