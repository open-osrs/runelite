/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Model;
import net.runelite.api.ModelData;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSModelData;
import net.runelite.rs.api.RSVertexNormal;

@Mixin(RSModelData.class)
public abstract class RSModelDataMixin implements RSModelData
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private float[] faceTextureUVCoordinates;

	@Inject
	private int[] vertexNormalsX;

	@Inject
	private int[] vertexNormalsY;

	@Inject
	private int[] vertexNormalsZ;

	@Copy("toModel")
	@Replace("toModel")
	@SuppressWarnings("InfiniteRecursion")
	public Model copy$light(int ambient, int contrast, int var3, int var4, int var5)
	{
		client.getLogger().trace("Lighting model {}", this);

		Model model = copy$light(ambient, contrast, var3, var4, var5);
		if (model == null)
		{
			return null;
		}

		if (faceTextureUVCoordinates == null)
		{
			computeTextureUVCoordinates();
		}

		vertexNormals();

		RSModel rsModel = (RSModel) model;
		rsModel.setVertexNormalsX(vertexNormalsX);
		rsModel.setVertexNormalsY(vertexNormalsY);
		rsModel.setVertexNormalsZ(vertexNormalsZ);
		rsModel.setFaceTextureUVCoordinates(faceTextureUVCoordinates);
		return model;
	}

	@Inject
	public void vertexNormals()
	{
		RSVertexNormal[] vertexNormals = getVertexNormals();
		RSVertexNormal[] vertexVertices = getVertexVertices();

		if (vertexNormals != null && vertexNormalsX == null)
		{
			int verticesCount = getVerticesCount();

			vertexNormalsX = new int[verticesCount];
			vertexNormalsY = new int[verticesCount];
			vertexNormalsZ = new int[verticesCount];

			for (int i = 0; i < verticesCount; ++i)
			{
				RSVertexNormal vertexNormal;

				if (vertexVertices != null && (vertexNormal = vertexVertices[i]) != null)
				{
					vertexNormalsX[i] = vertexNormal.getX();
					vertexNormalsY[i] = vertexNormal.getY();
					vertexNormalsZ[i] = vertexNormal.getZ();
				}
				else if ((vertexNormal = vertexNormals[i]) != null)
				{
					vertexNormalsX[i] = vertexNormal.getX();
					vertexNormalsY[i] = vertexNormal.getY();
					vertexNormalsZ[i] = vertexNormal.getZ();
				}
			}
		}
	}

	@Inject
	public void computeTextureUVCoordinates()
	{
		final short[] faceTextures = getFaceTextures();
		if (faceTextures == null)
		{
			return;
		}

		final int[] vertexPositionsX = getVerticesX();
		final int[] vertexPositionsY = getVerticesY();
		final int[] vertexPositionsZ = getVerticesZ();

		final int[] trianglePointsX = getFaceIndices1();
		final int[] trianglePointsY = getFaceIndices2();
		final int[] trianglePointsZ = getFaceIndices3();

		final short[] texTriangleX = getTexTriangleX();
		final short[] texTriangleY = getTexTriangleY();
		final short[] texTriangleZ = getTexTriangleZ();

		final byte[] textureCoords = getTextureCoords();

		int faceCount = getFaceCount();
		float[] faceTextureUCoordinates = new float[faceCount * 6];

		for (int i = 0; i < faceCount; i++)
		{
			int trianglePointX = trianglePointsX[i];
			int trianglePointY = trianglePointsY[i];
			int trianglePointZ = trianglePointsZ[i];

			short textureIdx = faceTextures[i];

			if (textureIdx != -1)
			{
				int triangleVertexIdx1;
				int triangleVertexIdx2;
				int triangleVertexIdx3;

				if (textureCoords != null && textureCoords[i] != -1)
				{
					int textureCoordinate = textureCoords[i] & 255;
					triangleVertexIdx1 = texTriangleX[textureCoordinate];
					triangleVertexIdx2 = texTriangleY[textureCoordinate];
					triangleVertexIdx3 = texTriangleZ[textureCoordinate];
				}
				else
				{
					triangleVertexIdx1 = trianglePointX;
					triangleVertexIdx2 = trianglePointY;
					triangleVertexIdx3 = trianglePointZ;
				}

				float triangleX = (float) vertexPositionsX[triangleVertexIdx1];
				float triangleY = (float) vertexPositionsY[triangleVertexIdx1];
				float triangleZ = (float) vertexPositionsZ[triangleVertexIdx1];

				float f_882_ = (float) vertexPositionsX[triangleVertexIdx2] - triangleX;
				float f_883_ = (float) vertexPositionsY[triangleVertexIdx2] - triangleY;
				float f_884_ = (float) vertexPositionsZ[triangleVertexIdx2] - triangleZ;
				float f_885_ = (float) vertexPositionsX[triangleVertexIdx3] - triangleX;
				float f_886_ = (float) vertexPositionsY[triangleVertexIdx3] - triangleY;
				float f_887_ = (float) vertexPositionsZ[triangleVertexIdx3] - triangleZ;
				float f_888_ = (float) vertexPositionsX[trianglePointX] - triangleX;
				float f_889_ = (float) vertexPositionsY[trianglePointX] - triangleY;
				float f_890_ = (float) vertexPositionsZ[trianglePointX] - triangleZ;
				float f_891_ = (float) vertexPositionsX[trianglePointY] - triangleX;
				float f_892_ = (float) vertexPositionsY[trianglePointY] - triangleY;
				float f_893_ = (float) vertexPositionsZ[trianglePointY] - triangleZ;
				float f_894_ = (float) vertexPositionsX[trianglePointZ] - triangleX;
				float f_895_ = (float) vertexPositionsY[trianglePointZ] - triangleY;
				float f_896_ = (float) vertexPositionsZ[trianglePointZ] - triangleZ;

				float f_897_ = f_883_ * f_887_ - f_884_ * f_886_;
				float f_898_ = f_884_ * f_885_ - f_882_ * f_887_;
				float f_899_ = f_882_ * f_886_ - f_883_ * f_885_;
				float f_900_ = f_886_ * f_899_ - f_887_ * f_898_;
				float f_901_ = f_887_ * f_897_ - f_885_ * f_899_;
				float f_902_ = f_885_ * f_898_ - f_886_ * f_897_;
				float f_903_ = 1.0F / (f_900_ * f_882_ + f_901_ * f_883_ + f_902_ * f_884_);

				float u0 = (f_900_ * f_888_ + f_901_ * f_889_ + f_902_ * f_890_) * f_903_;
				float u1 = (f_900_ * f_891_ + f_901_ * f_892_ + f_902_ * f_893_) * f_903_;
				float u2 = (f_900_ * f_894_ + f_901_ * f_895_ + f_902_ * f_896_) * f_903_;

				f_900_ = f_883_ * f_899_ - f_884_ * f_898_;
				f_901_ = f_884_ * f_897_ - f_882_ * f_899_;
				f_902_ = f_882_ * f_898_ - f_883_ * f_897_;
				f_903_ = 1.0F / (f_900_ * f_885_ + f_901_ * f_886_ + f_902_ * f_887_);

				float v0 = (f_900_ * f_888_ + f_901_ * f_889_ + f_902_ * f_890_) * f_903_;
				float v1 = (f_900_ * f_891_ + f_901_ * f_892_ + f_902_ * f_893_) * f_903_;
				float v2 = (f_900_ * f_894_ + f_901_ * f_895_ + f_902_ * f_896_) * f_903_;

				int idx = i * 6;
				faceTextureUCoordinates[idx] = u0;
				faceTextureUCoordinates[idx + 1] = v0;
				faceTextureUCoordinates[idx + 2] = u1;
				faceTextureUCoordinates[idx + 3] = v1;
				faceTextureUCoordinates[idx + 4] = u2;
				faceTextureUCoordinates[idx + 5] = v2;
			}
		}

		faceTextureUVCoordinates = faceTextureUCoordinates;
	}

	@Override
	@Inject
	public List<Vertex> getVertices()
	{
		int[] verticesX = getVerticesX();
		int[] verticesY = getVerticesY();
		int[] verticesZ = getVerticesZ();

		List<Vertex> vertices = new ArrayList<Vertex>(getVerticesCount());

		for (int i = 0; i < getVerticesCount(); ++i)
		{
			Vertex v = new Vertex(
				verticesX[i],
				verticesY[i],
				verticesZ[i]
			);
			vertices.add(v);
		}

		return vertices;
	}

	@Override
	@Inject
	public List<Triangle> getTriangles()
	{
		int[] trianglesX = getFaceIndices1();
		int[] trianglesY = getFaceIndices2();
		int[] trianglesZ = getFaceIndices3();

		List<Vertex> vertices = getVertices();
		List<Triangle> triangles = new ArrayList<>(getFaceCount());

		for (int i = 0; i < getFaceCount(); ++i)
		{
			int triangleX = trianglesX[i];
			int triangleY = trianglesY[i];
			int triangleZ = trianglesZ[i];

			Triangle triangle = new Triangle(
				vertices.get(triangleX),
				vertices.get(triangleY),
				vertices.get(triangleZ)
			);
			triangles.add(triangle);
		}

		return triangles;
	}

	@Inject
	@Override
	public RSModel light()
	{
		return this.toModel(ModelData.DEFAULT_AMBIENT, ModelData.DEFAULT_CONTRAST, ModelData.DEFAULT_X, ModelData.DEFAULT_Y, ModelData.DEFAULT_Z);
	}

	@Inject
	@Override
	public RSModel light(int var1, int var2, int var3, int var4, int var5)
	{
		return this.toModel(var1, var2, var3, var4, var5);
	}

	@Inject
	@Override
	public RSModelData recolor(short colorToReplace, short colorToReplaceWith)
	{
		this.rs$recolor(colorToReplace, colorToReplaceWith);

		return this;
	}

	@Inject
	@Override
	public RSModelData retexture(short find, short replace)
	{
		this.rs$retexture(find, replace);

		return this;
	}

	@Inject
	@Override
	public RSModelData cloneVertices()
	{
		int[] newVericesX = Arrays.copyOf(this.getVerticesX(), this.getVerticesX().length);
		int[] newVericesY = Arrays.copyOf(this.getVerticesY(), this.getVerticesX().length);
		int[] newVericesZ = Arrays.copyOf(this.getVerticesZ(), this.getVerticesX().length);

		this.setVerticesX(newVericesX);
		this.setVerticesY(newVericesY);
		this.setVerticesZ(newVericesZ);

		return this;
	}

	@Inject
	@Override
	public RSModelData cloneColors()
	{
		short[] newFaceColor = Arrays.copyOf(this.getFaceColors(), this.getFaceColors().length);
		this.setFaceColors(newFaceColor);

		return this;
	}

	@Inject
	@Override
	public RSModelData cloneTextures()
	{
		short[] newFaceColor = Arrays.copyOf(this.getFaceTextures(), this.getFaceTextures().length);
		this.setFaceTextures(newFaceColor);

		return this;
	}

	@Inject
	@Override
	public RSModelData cloneTransparencies()
	{
		byte[] newFaceColor = Arrays.copyOf(this.getFaceTransparencies(), this.getFaceTransparencies().length);
		this.setFaceTransparencies(newFaceColor);

		return this;
	}

	@Inject
	@Override
	public RSModelData rotateY90Ccw()
	{
		for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
		{
			int var2 = this.getVerticesX()[var1];
			this.getVerticesX()[var1] = this.getVerticesZ()[var1];
			this.getVerticesZ()[var1] = -var2;
		}

		this.invalidate();

		return this;
	}

	@Inject
	@Override
	public RSModelData rotateY180Ccw()
	{
		for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
		{
			this.getVerticesX()[var1] = -this.getVerticesX()[var1];
			this.getVerticesZ()[var1] = -this.getVerticesZ()[var1];
		}

		this.invalidate();

		return this;
	}

	@Inject
	@Override
	public RSModelData rotateY270Ccw()
	{
		for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
		{
			int var2 = this.getVerticesZ()[var1];
			this.getVerticesZ()[var1] = this.getVerticesX()[var1];
			this.getVerticesX()[var1] = -var2;
		}

		this.invalidate();

		return this;
	}

	@Inject
	@Override
	public RSModelData scale(int var1, int var2, int var3)
	{
		for (int i = 0; i < this.getVerticesCount(); ++i)
		{
			this.getVerticesX()[i] = this.getVerticesX()[i] * var1 / 128;
			this.getVerticesY()[i] = this.getVerticesY()[i] * var2 / 128;
			this.getVerticesZ()[i] = this.getVerticesZ()[i] * var3 / 128;
		}

		this.invalidate();

		return this;
	}

	@Inject
	@Override
	public RSModelData translate(int var1, int var2, int var3)
	{
		for (int i = 0; i < this.getVerticesCount(); ++i)
		{
			int[] vertexX = this.getVerticesX();
			int[] vertexY = this.getVerticesY();
			int[] vertexZ = this.getVerticesZ();

			vertexX[i] += var1;
			vertexY[i] += var2;
			vertexZ[i] += var3;
		}

		this.invalidate();

		return this;
	}
}