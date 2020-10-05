import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public final class ObjectSound extends Node {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static NodeDeque objectSounds;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -709307059
	)
	int field1106;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 397681607
	)
	int field1109;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2039655179
	)
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1121925225
	)
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1814534079
	)
	int y;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1874123539
	)
	int field1117;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 159221067
	)
	int field1108;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -34287423
	)
	int soundEffectId;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	RawPcmStream stream1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -793765363
	)
	int field1115;
	@ObfuscatedName("d")
	int[] soundEffectIds;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1493720003
	)
	int field1118;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	RawPcmStream stream2;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	ObjectDefinition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "23141"
	)
	void set() {
		int var1 = this.soundEffectId;
		ObjectDefinition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field1108 = var2.int4 * 128;
			this.field1109 = var2.int5;
			this.field1115 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field1108 = 0;
			this.field1109 = 0;
			this.field1115 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 60
			Players.pcmStreamMixer.removeSubStream(this.stream1); // L: 61
			this.stream1 = null; // L: 62
		}

	} // L: 64

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIILgk;Lft;Z[I[II)I",
		garbageValue = "585346810"
	)
	public static int method1986(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) { // L: 19
			for (var9 = 0; var9 < 128; ++var9) { // L: 20
				class182.directions[var8][var9] = 0; // L: 21
				class182.distances[var8][var9] = 99999999; // L: 22
			}
		}

		boolean var27;
		if (var2 == 1) { // L: 26
			var27 = ObjectDefinition.method4747(var0, var1, var3, var4);
		} else if (var2 == 2) { // L: 27
			var27 = class41.method619(var0, var1, var3, var4);
		} else {
			var27 = FriendSystem.method1976(var0, var1, var2, var3, var4); // L: 28
		}

		var9 = var0 - 64; // L: 29
		int var10 = var1 - 64; // L: 30
		int var11 = class182.field2135; // L: 31
		int var12 = class182.field2136; // L: 32
		int var13;
		int var14;
		int var16;
		if (!var27) { // L: 33
			var13 = Integer.MAX_VALUE; // L: 35
			var14 = Integer.MAX_VALUE; // L: 36
			byte var15 = 10; // L: 37
			var16 = var3.approxDestinationX; // L: 38
			int var17 = var3.approxDestinationY; // L: 39
			int var18 = var3.approxDestinationSizeX; // L: 40
			int var19 = var3.approxDestinationSizeY; // L: 41

			for (int var20 = var16 - var15; var20 <= var15 + var16; ++var20) { // L: 42
				for (int var21 = var17 - var15; var21 <= var17 + var15; ++var21) { // L: 43
					int var22 = var20 - var9; // L: 44
					int var23 = var21 - var10; // L: 45
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class182.distances[var22][var23] < 100) { // L: 46 47
						int var24 = 0; // L: 48
						if (var20 < var16) {
							var24 = var16 - var20; // L: 49
						} else if (var20 > var16 + var18 - 1) { // L: 50
							var24 = var20 - (var18 + var16 - 1);
						}

						int var25 = 0; // L: 51
						if (var21 < var17) { // L: 52
							var25 = var17 - var21;
						} else if (var21 > var17 + var19 - 1) { // L: 53
							var25 = var21 - (var17 + var19 - 1);
						}

						int var26 = var25 * var25 + var24 * var24; // L: 54
						if (var26 < var13 || var26 == var13 && class182.distances[var22][var23] < var14) { // L: 55
							var13 = var26; // L: 56
							var14 = class182.distances[var22][var23]; // L: 57
							var11 = var20; // L: 58
							var12 = var21; // L: 59
						}
					}
				}
			}

			if (var13 == Integer.MAX_VALUE) { // L: 65
				return -1;
			}
		}

		if (var0 == var11 && var12 == var1) { // L: 69
			return 0;
		} else {
			byte var28 = 0; // L: 70
			class182.bufferX[var28] = var11; // L: 73
			var13 = var28 + 1;
			class182.bufferY[var28] = var12; // L: 74

			int var29;
			for (var14 = var29 = class182.directions[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = class182.directions[var11 - var9][var12 - var10]) { // L: 75 76 86
				if (var14 != var29) { // L: 77
					var29 = var14; // L: 78
					class182.bufferX[var13] = var11; // L: 79
					class182.bufferY[var13++] = var12; // L: 80
				}

				if ((var14 & 2) != 0) { // L: 82
					++var11;
				} else if ((var14 & 8) != 0) { // L: 83
					--var11;
				}

				if ((var14 & 1) != 0) { // L: 84
					++var12;
				} else if ((var14 & 4) != 0) { // L: 85
					--var12;
				}
			}

			var16 = 0; // L: 88

			while (var13-- > 0) { // L: 89
				var6[var16] = class182.bufferX[var13]; // L: 90
				var7[var16++] = class182.bufferY[var13]; // L: 91
				if (var16 >= var6.length) { // L: 92
					break;
				}
			}

			return var16; // L: 94
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-62"
	)
	static final void method1987(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 9130
		int var7 = var3 - var1; // L: 9131
		int var8 = var6 >= 0 ? var6 : -var6; // L: 9132
		int var9 = var7 >= 0 ? var7 : -var7; // L: 9133
		int var10 = var8; // L: 9134
		if (var8 < var9) { // L: 9135
			var10 = var9;
		}

		if (var10 != 0) { // L: 9136
			int var11 = (var6 << 16) / var10; // L: 9137
			int var12 = (var7 << 16) / var10; // L: 9138
			if (var12 <= var11) { // L: 9139
				var11 = -var11;
			} else {
				var12 = -var12; // L: 9140
			}

			int var13 = var5 * var12 >> 17; // L: 9141
			int var14 = var5 * var12 + 1 >> 17; // L: 9142
			int var15 = var5 * var11 >> 17; // L: 9143
			int var16 = var5 * var11 + 1 >> 17; // L: 9144
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 9145
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 9146
			int var17 = var0 + var13; // L: 9147
			int var18 = var0 - var14; // L: 9148
			int var19 = var0 + var6 - var14; // L: 9149
			int var20 = var0 + var13 + var6; // L: 9150
			int var21 = var15 + var1; // L: 9151
			int var22 = var1 - var16; // L: 9152
			int var23 = var7 + var1 - var16; // L: 9153
			int var24 = var15 + var7 + var1; // L: 9154
			Rasterizer3D.method3120(var17, var18, var19); // L: 9155
			Rasterizer3D.method3172(var21, var22, var23, var17, var18, var19, var4); // L: 9156
			Rasterizer3D.method3120(var17, var19, var20); // L: 9157
			Rasterizer3D.method3172(var21, var23, var24, var17, var19, var20, var4); // L: 9158
		}
	} // L: 9159

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-457226799"
	)
	static void method1983(int var0) {
		TaskHandler.tempMenuAction = new MenuAction(); // L: 10245
		TaskHandler.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 10246
		TaskHandler.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 10247
		TaskHandler.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 10248
		TaskHandler.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 10249
		TaskHandler.tempMenuAction.action = Client.menuActions[var0]; // L: 10250
	} // L: 10251
}
