import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 62759075
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1009828555
	)
	@Export("y")
	int y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1423374395
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ao")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1160515319
	)
	int field1109;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1147297953
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1048949801
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1606324787
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 715696475
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1052608255
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 513855783
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 930462249
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -964291647
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1974909991
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ap")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("aj")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("am")
	boolean field1121;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1274300065
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1634662763
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1844091037
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("af")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bz")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bt")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bg")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bf")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bj")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1294228425
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bu")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1908710717
	)
	int field1134;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1559878903
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 470210683
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -94469869
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -174294577
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1395712137
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1907492289
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1363443673
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2070977901
	)
	int field1142;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1362318977
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1330353911
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1656933541
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -341495445
	)
	int field1105;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 475790425
	)
	int field1147;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1307254299
	)
	int field1148;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1553617601
	)
	int field1149;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1049240827
	)
	int field1126;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 401025355
	)
	int field1125;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 321143973
	)
	int field1145;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1090012593
	)
	int field1165;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -2139655667
	)
	int field1151;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 492191773
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -2069346077
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1495923269
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1736409391
	)
	int field1158;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -951772859
	)
	int field1146;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -504625235
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cr")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cq")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cs")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1675210125
	)
	int field1164;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 158996051
	)
	int field1129;

	Actor() {
		this.isWalking = false;
		this.field1109 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field1121 = false;
		this.overheadTextCyclesRemaining = 100;
		this.overheadTextColor = 0;
		this.overheadTextEffect = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1134 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1142 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1158 = 0;
		this.field1146 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field1164 = 0;
		this.field1129 = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841514183"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-256199204"
	)
	final void method2137() {
		this.pathLength = 0;
		this.field1129 = 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "1"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = ItemContainer.method2057(var1);
			var10 = var12.field1815;
			var11 = var12.field1806;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1531936528"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field1675 == var8.field1675) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-54"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;III)Llt;",
		garbageValue = "-2030666937"
	)
	public static Font method2153(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!VarbitComposition.method3102(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3);
			Font var4;
			if (var5 == null) {
				var4 = null;
			} else {
				Font var6 = new Font(var5, class135.SpriteBuffer_xOffsets, class131.SpriteBuffer_yOffsets, class414.SpriteBuffer_spriteWidths, class16.SpriteBuffer_spriteHeights, class351.SpriteBuffer_spritePalette, class414.SpriteBuffer_pixels);
				StudioGame.method5130();
				var4 = var6;
			}

			return var4;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lon;",
		garbageValue = "0"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0;
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class87.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = class87.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1);
		if (var19 == null) {
			return null;
		} else {
			SpritePixels var20 = null;
			if (var9.noteTemplate != -1) {
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var20 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var20 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var20 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			int[] var15 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var15);
			var8 = new SpritePixels(36, 32);
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.method4122(16, 16);
			Rasterizer3D.field2348 = false;
			if (var9.placeholderTemplate != -1) {
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d;
			if (var5) {
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) {
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var19.calculateBoundsCylinder();
			var19.method4454(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			if (var9.noteTemplate != -1) {
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				ItemComposition.ItemDefinition_fontPlain11.draw(class16.method212(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2348 = true;
			return var8;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-466966431"
	)
	static final void method2152(String var0) {
		PacketBufferNode var1 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2725, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class113.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
