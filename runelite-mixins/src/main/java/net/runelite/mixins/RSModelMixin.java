/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.model.Jarvis;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.rs.api.RSAnimation;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSSkeleton;

@Mixin(RSModel.class)
public abstract class RSModelMixin implements RSModel
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int rl$sceneId;

	@Inject
	private int rl$bufferOffset;

	@Inject
	private int rl$uvBufferOffset;

	@Inject
	private float[] rl$faceTextureUVCoordinates;

	@Inject
	private int[] rl$vertexNormalsX;

	@Inject
	private int[] rl$vertexNormalsY;

	@Inject
	private int[] rl$vertexNormalsZ;

	@MethodHook(value = "<init>", end = true)
	@Inject
	public void rl$init(RSModel[] models, int length)
	{
		if (getFaceTextures() != null)
		{
			int count = getFaceCount();
			float[] uv = new float[count * 6];
			int idx = 0;

			for (int i = 0; i < length; ++i)
			{
				RSModel model = models[i];
				if (model != null)
				{
					float[] modelUV = model.getFaceTextureUVCoordinates();

					if (modelUV != null)
					{
						System.arraycopy(modelUV, 0, uv, idx, model.getFaceCount() * 6);
					}

					idx += model.getFaceCount() * 6;
				}
			}

			setFaceTextureUVCoordinates(uv);
		}

		vertexNormals();
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

	@Copy("contourGround")
	@Replace("contourGround")
	@SuppressWarnings("InfiniteRecursion")
	public Model copy$contourGround(int[][] tileHeights, int packedX, int height, int packedY, boolean copy, int contouredGround)
	{
		// With contouredGround >= 0 lighted models are countoured, so we need to copy uvs
		Model model = copy$contourGround(tileHeights, packedX, height, packedY, copy, contouredGround);
		if (model != null && model != this)
		{
			RSModel rsModel = (RSModel) model;
			rsModel.setVertexNormalsX(rl$vertexNormalsX);
			rsModel.setVertexNormalsY(rl$vertexNormalsY);
			rsModel.setVertexNormalsZ(rl$vertexNormalsZ);
			rsModel.setFaceTextureUVCoordinates(rl$faceTextureUVCoordinates);
		}
		return model;
	}

	@Copy("drawFace")
	@Replace("drawFace")
	public void copy$drawFace(int face)
	{
		DrawCallbacks callbacks = client.getDrawCallbacks();
		if (callbacks == null || !callbacks.drawFace(this, face))
		{
			copy$drawFace(face);
		}
	}

	@MethodHook("buildSharedModel")
	@Inject
	public void rl$buildSharedModel(boolean refTransparencies, Model sharedModel, byte[] transparencyBuffer)
	{
		// Animated models are usually a shared Model instance that is global
		RSModel rsModel = (RSModel) sharedModel;
		rsModel.setVertexNormalsX(rl$vertexNormalsX);
		rsModel.setVertexNormalsY(rl$vertexNormalsY);
		rsModel.setVertexNormalsZ(rl$vertexNormalsZ);
		rsModel.setFaceTextureUVCoordinates(rl$faceTextureUVCoordinates);
	}

	@Inject
	@Override
	public RSModel rotateY90Ccw()
	{
		this.rs$rotateY90Ccw();

		return this;
	}

	@Inject
	@Override
	public RSModel rotateY180Ccw()
	{
		this.rs$rotateY180Ccw();

		return this;
	}

	@Inject
	@Override
	public RSModel rotateY270Ccw()
	{
		this.rs$rotateY270Ccw();

		return this;
	}

	@Inject
	@Override
	public RSModel scale(int var1, int var2, int var3)
	{
		this.rs$scale(var1, var2, var3);

		return this;
	}

	@Inject
	@Override
	public RSModel translate(int var1, int var2, int var3)
	{
		this.rs$translate(var1, var2, var3);

		return this;
	}

	@Inject
	public void interpolateFrames(RSFrames frames, int frameId, RSFrames nextFrames, int nextFrameId, int interval, int intervalCount)
	{
		if (getVertexGroups() != null)
		{
			if (frameId != -1)
			{
				RSAnimation frame = frames.getFrames()[frameId];
				RSSkeleton skeleton = frame.getSkeleton();
				RSAnimation nextFrame = null;
				if (nextFrames != null)
				{
					nextFrame = nextFrames.getFrames()[nextFrameId];
					if (nextFrame.getSkeleton() != skeleton)
					{
						nextFrame = null;
					}
				}

				client.setAnimOffsetX(0);
				client.setAnimOffsetY(0);
				client.setAnimOffsetZ(0);

				interpolateFrames(skeleton, frame, nextFrame, interval, intervalCount);
				resetBounds();
			}
		}
	}

	@Inject
	public void interpolateFrames(RSSkeleton skin, RSAnimation frame, RSAnimation nextFrame, int interval, int intervalCount)
	{
		if (nextFrame == null || interval == 0)
		{
			// if there is no next frame or interval then animate the model as we normally would
			for (int i = 0; i < frame.getTransformCount(); i++)
			{
				int type = frame.getTransformTypes()[i];
				animate(skin.getTypes()[type], skin.getList()[type], frame.getTranslatorX()[i],
					frame.getTranslatorY()[i], frame.getTranslatorZ()[i]);
			}
		}
		else
		{
			int transformIndex = 0;
			int nextTransformIndex = 0;
			for (int i = 0; i < skin.getCount(); i++)
			{
				boolean frameValid = false;
				if (transformIndex < frame.getTransformCount()
					&& frame.getTransformTypes()[transformIndex] == i)
				{
					frameValid = true;
				}
				boolean nextFrameValid = false;
				if (nextTransformIndex < nextFrame.getTransformCount()
					&& nextFrame.getTransformTypes()[nextTransformIndex] == i)
				{
					nextFrameValid = true;
				}
				if (frameValid || nextFrameValid)
				{
					int staticFrame = 0;
					int type = skin.getTypes()[i];
					if (type == 3 || type == 10)
					{
						staticFrame = 128;
					}
					int currentTranslateX = staticFrame;
					int currentTranslateY = staticFrame;
					int currentTranslateZ = staticFrame;
					if (frameValid)
					{
						currentTranslateX = frame.getTranslatorX()[transformIndex];
						currentTranslateY = frame.getTranslatorY()[transformIndex];
						currentTranslateZ = frame.getTranslatorZ()[transformIndex];
						transformIndex++;
					}
					int nextTranslateX = staticFrame;
					int nextTranslateY = staticFrame;
					int nextTranslateZ = staticFrame;
					if (nextFrameValid)
					{
						nextTranslateX = nextFrame.getTranslatorX()[nextTransformIndex];
						nextTranslateY = nextFrame.getTranslatorY()[nextTransformIndex];
						nextTranslateZ = nextFrame.getTranslatorZ()[nextTransformIndex];
						nextTransformIndex++;
					}
					int translateX;
					int translateY;
					int translateZ;
					if (type == 2)
					{
						int deltaX = nextTranslateX - currentTranslateX & 0xFF;
						int deltaY = nextTranslateY - currentTranslateY & 0xFF;
						int deltaZ = nextTranslateZ - currentTranslateZ & 0xFF;
						if (deltaX >= 128)
						{
							deltaX -= 256;
						}
						if (deltaY >= 128)
						{
							deltaY -= 256;
						}
						if (deltaZ >= 128)
						{
							deltaZ -= 256;
						}
						translateX = currentTranslateX + deltaX * interval / intervalCount & 0xFF;
						translateY = currentTranslateY + deltaY * interval / intervalCount & 0xFF;
						translateZ = currentTranslateZ + deltaZ * interval / intervalCount & 0xFF;
					}
					else if (type == 5)
					{
						// don't interpolate alpha transformations
						// alpha
						translateX = currentTranslateX;
						translateY = 0;
						translateZ = 0;
					}
					else
					{
						translateX = currentTranslateX + (nextTranslateX - currentTranslateX) * interval / intervalCount;
						translateY = currentTranslateY + (nextTranslateY - currentTranslateY) * interval / intervalCount;
						translateZ = currentTranslateZ + (nextTranslateZ - currentTranslateZ) * interval / intervalCount;
					}
					// use interpolated translations to animate
					animate(type, skin.getList()[i], translateX, translateY, translateZ);
				}
			}
		}
	}

	@Override
	@Inject
	public Shape getConvexHull(int localX, int localY, int orientation, int tileHeight)
	{
		int[] x2d = new int[getVerticesCount()];
		int[] y2d = new int[getVerticesCount()];

		Perspective.modelToCanvas(client, getVerticesCount(), localX, localY, tileHeight, orientation, getVerticesX(), getVerticesZ(), getVerticesY(), x2d, y2d);

		return Jarvis.convexHull(x2d, y2d);
	}

	@Inject
	@Override
	public int getSceneId()
	{
		return rl$sceneId;
	}

	@Inject
	@Override
	public void setSceneId(int sceneId)
	{
		rl$sceneId = sceneId;
	}

	@Inject
	@Override
	public int getBufferOffset()
	{
		return rl$bufferOffset;
	}

	@Inject
	@Override
	public void setBufferOffset(int bufferOffset)
	{
		rl$bufferOffset = bufferOffset;
	}

	@Inject
	@Override
	public int getUvBufferOffset()
	{
		return rl$uvBufferOffset;
	}

	@Inject
	@Override
	public void setUvBufferOffset(int bufferOffset)
	{
		rl$uvBufferOffset = bufferOffset;
	}

	@Inject
	@Override
	public float[] getFaceTextureUVCoordinates()
	{
		return rl$faceTextureUVCoordinates;
	}

	@Inject
	@Override
	public void setFaceTextureUVCoordinates(float[] faceTextureUVCoordinates)
	{
		rl$faceTextureUVCoordinates = faceTextureUVCoordinates;
	}

	@Inject
	public void vertexNormals()
	{
		if (rl$vertexNormalsX == null)
		{
			int verticesCount = getVerticesCount();

			rl$vertexNormalsX = new int[verticesCount];
			rl$vertexNormalsY = new int[verticesCount];
			rl$vertexNormalsZ = new int[verticesCount];

			int[] trianglesX = getFaceIndices1();
			int[] trianglesY = getFaceIndices2();
			int[] trianglesZ = getFaceIndices3();
			int[] verticesX = getVerticesX();
			int[] verticesY = getVerticesY();
			int[] verticesZ = getVerticesZ();

			for (int i = 0; i < getFaceCount(); ++i)
			{
				int var9 = trianglesX[i];
				int var10 = trianglesY[i];
				int var11 = trianglesZ[i];

				int var12 = verticesX[var10] - verticesX[var9];
				int var13 = verticesY[var10] - verticesY[var9];
				int var14 = verticesZ[var10] - verticesZ[var9];
				int var15 = verticesX[var11] - verticesX[var9];
				int var16 = verticesY[var11] - verticesY[var9];
				int var17 = verticesZ[var11] - verticesZ[var9];

				int var18 = var13 * var17 - var16 * var14;
				int var19 = var14 * var15 - var17 * var12;

				int var20;
				for (var20 = var12 * var16 - var15 * var13; var18 > 8192 || var19 > 8192 || var20 > 8192 || var18 < -8192 || var19 < -8192 || var20 < -8192; var20 >>= 1)
				{
					var18 >>= 1;
					var19 >>= 1;
				}

				int var21 = (int) Math.sqrt(var18 * var18 + var19 * var19 + var20 * var20);
				if (var21 <= 0)
				{
					var21 = 1;
				}

				var18 = var18 * 256 / var21;
				var19 = var19 * 256 / var21;
				var20 = var20 * 256 / var21;

				rl$vertexNormalsX[var9] += var18;
				rl$vertexNormalsY[var9] += var19;
				rl$vertexNormalsZ[var9] += var20;

				rl$vertexNormalsX[var10] += var18;
				rl$vertexNormalsY[var10] += var19;
				rl$vertexNormalsZ[var10] += var20;

				rl$vertexNormalsX[var11] += var18;
				rl$vertexNormalsY[var11] += var19;
				rl$vertexNormalsZ[var11] += var20;
			}
		}
	}

	@Inject
	@Override
	public int[] getVertexNormalsX()
	{
		return rl$vertexNormalsX;
	}

	@Inject
	@Override
	public void setVertexNormalsX(int[] vertexNormalsX)
	{
		rl$vertexNormalsX = vertexNormalsX;
	}

	@Inject
	@Override
	public int[] getVertexNormalsY()
	{
		return rl$vertexNormalsY;
	}

	@Inject
	@Override
	public void setVertexNormalsY(int[] vertexNormalsY)
	{
		rl$vertexNormalsY = vertexNormalsY;
	}

	@Inject
	@Override
	public int[] getVertexNormalsZ()
	{
		return rl$vertexNormalsZ;
	}

	@Inject
	@Override
	public void setVertexNormalsZ(int[] vertexNormalsZ)
	{
		rl$vertexNormalsZ = vertexNormalsZ;
	}
}