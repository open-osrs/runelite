import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -838217357
	)
	static int field2544;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lhn;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lhj;[IIIIS)V",
		garbageValue = "-24010"
	)
	void method4127(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2516[var1.field2554] & 4) != 0 && var1.field2561 < 0) { // L: 73
			int var6 = this.superStream.field2490[var1.field2554] / PcmPlayer.field394; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2567) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field2567 += var4 * var6; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field2567 += var6 * var7 - 1048576; // L: 81
				int var8 = PcmPlayer.field394 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field2503[var1.field2554] == 0) { // L: 86
					var1.stream = RawPcmStream.method898(var1.rawSound, var10.method981(), var10.method904(), var10.method905()); // L: 87
				} else {
					var1.stream = RawPcmStream.method898(var1.rawSound, var10.method981(), 0, var10.method905()); // L: 90
					this.superStream.method3933(var1, var1.patch.field2533[var1.field2547] < 0); // L: 91
					var1.stream.method909(var8, var10.method904()); // L: 92
				}

				if (var1.patch.field2533[var1.field2547] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method920(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method941()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhj;IB)V",
		garbageValue = "0"
	)
	void method4128(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2516[var1.field2554] & 4) != 0 && var1.field2561 < 0) { // L: 105
			int var3 = this.superStream.field2490[var1.field2554] / PcmPlayer.field394; // L: 106
			int var4 = (var3 + 1048575 - var1.field2567) / var3; // L: 107
			var1.field2567 = var3 * var2 + var1.field2567 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field2503[var1.field2554] == 0) { // L: 110
					var1.stream = RawPcmStream.method898(var1.rawSound, var1.stream.method981(), var1.stream.method904(), var1.stream.method905()); // L: 111
				} else {
					var1.stream = RawPcmStream.method898(var1.rawSound, var1.stream.method981(), 0, var1.stream.method905()); // L: 114
					this.superStream.method3933(var1, var1.patch.field2533[var1.field2547] < 0); // L: 115
				}

				if (var1.patch.field2533[var1.field2547] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2567 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) { // L: 28
				return null;
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("g")
	protected int vmethod4124() {
		return 0; // L: 34
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method3964(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field2566) { // L: 45
						this.method4127(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field2566 -= var5; // L: 52
						break;
					}

					this.method4127(var6, var1, var4, var6.field2566, var5 + var4); // L: 46
					var4 += var6.field2566; // L: 47
					var5 -= var6.field2566; // L: 48
				} while(!this.superStream.method3965(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("l")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method3964(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field2566) { // L: 62
						this.method4128(var3, var2); // L: 67
						var3.field2566 -= var2; // L: 68
						break;
					}

					this.method4128(var3, var3.field2566); // L: 63
					var2 -= var3.field2566; // L: 64
				} while(!this.superStream.method3965(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "918211470"
	)
	static boolean method4150(String var0) {
		if (var0 == null) { // L: 173
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 180
			} catch (MalformedURLException var2) { // L: 177
				return false; // L: 178
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "551121602"
	)
	public static void method4123() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 274
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 275
	} // L: 276

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1879723646"
	)
	static final void method4122() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3179
			var0 = Varcs.localPlayer.x; // L: 3180
			var1 = Varcs.localPlayer.y; // L: 3181
			if (class6.oculusOrbFocalPointX - var0 < -500 || class6.oculusOrbFocalPointX - var0 > 500 || Players.oculusOrbFocalPointY - var1 < -500 || Players.oculusOrbFocalPointY - var1 > 500) { // L: 3182
				class6.oculusOrbFocalPointX = var0; // L: 3183
				Players.oculusOrbFocalPointY = var1; // L: 3184
			}

			if (var0 != class6.oculusOrbFocalPointX) { // L: 3186
				class6.oculusOrbFocalPointX += (var0 - class6.oculusOrbFocalPointX) / 16;
			}

			if (var1 != Players.oculusOrbFocalPointY) { // L: 3187
				Players.oculusOrbFocalPointY += (var1 - Players.oculusOrbFocalPointY) / 16;
			}

			var2 = class6.oculusOrbFocalPointX >> 7; // L: 3188
			var3 = Players.oculusOrbFocalPointY >> 7; // L: 3189
			var4 = UserComparator7.getTileHeight(class6.oculusOrbFocalPointX, Players.oculusOrbFocalPointY, class26.Client_plane); // L: 3190
			var5 = 0; // L: 3191
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3192
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3193
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3194
						int var8 = class26.Client_plane; // L: 3195
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3196
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3197
						if (var9 > var5) { // L: 3198
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3202
			if (var6 > 98048) { // L: 3203
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3204
				var6 = 32768;
			}

			if (var6 > Client.field735) { // L: 3205
				Client.field735 += (var6 - Client.field735) / 24;
			} else if (var6 < Client.field735) { // L: 3206
				Client.field735 += (var6 - Client.field735) / 80;
			}

			VarbitComposition.field3544 = UserComparator7.getTileHeight(Varcs.localPlayer.x, Varcs.localPlayer.y, class26.Client_plane) - Client.camFollowHeight; // L: 3207
		} else if (Client.oculusOrbState == 1) { // L: 3209
			method4149(); // L: 3210
			short var10 = -1; // L: 3211
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3212
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3213
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3214
				if (var10 == 0) { // L: 3215
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3216
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3217
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3219
				if (var10 == 0) { // L: 3220
					var10 = 256;
				} else if (var10 == 1024) { // L: 3221
					var10 = 768;
				} else {
					var10 = 512; // L: 3222
				}
			}

			byte var11 = 0; // L: 3224
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3225
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3226
				var11 = 1;
			}

			var2 = 0; // L: 3227
			if (var10 >= 0 || var11 != 0) { // L: 3228
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * -894225967 * -1126512847 : Client.oculusOrbNormalSpeed * 1800151859 * -1466920965; // L: 3229
				var2 *= 16; // L: 3230
				Client.field702 = var10; // L: 3231
				Client.field681 = var11; // L: 3232
			}

			if (Client.field679 < var2) { // L: 3234
				Client.field679 += var2 / 8; // L: 3235
				if (Client.field679 > var2) { // L: 3236
					Client.field679 = var2;
				}
			} else if (Client.field679 > var2) { // L: 3238
				Client.field679 = Client.field679 * 9 / 10;
			}

			if (Client.field679 > 0) { // L: 3239
				var3 = Client.field679 / 16; // L: 3240
				if (Client.field702 >= 0) { // L: 3241
					var0 = Client.field702 - class69.cameraYaw & 2047; // L: 3242
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3243
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3244
					class6.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 3245
					Players.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 3246
				}

				if (Client.field681 != 0) { // L: 3248
					VarbitComposition.field3544 += var3 * Client.field681; // L: 3249
					if (VarbitComposition.field3544 > 0) { // L: 3250
						VarbitComposition.field3544 = 0;
					}
				}
			} else {
				Client.field702 = -1; // L: 3254
				Client.field681 = -1; // L: 3255
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3257
				Client.packetWriter.addNode(ObjectComposition.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher)); // L: 3259
				Client.oculusOrbState = 0; // L: 3260
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && MouseHandler.mouseCam) { // L: 3264
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3265
			Client.camAngleDX = var0 * 2; // L: 3266
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * 964260245 * 1997230525; // L: 3267
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3268
			Client.camAngleDY = var1 * 2; // L: 3269
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * 77229373 * -1775381995; // L: 3270
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3273
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3274
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 3275
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3276
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3277
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 3278
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3279
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3280
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 3282
		Client.camAngleX += Client.camAngleDX / 2; // L: 3283
		if (Client.camAngleX < 128) { // L: 3284
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3285
			Client.camAngleX = 383;
		}

	} // L: 3286

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lgl;I)V",
		garbageValue = "-1679293239"
	)
	static final void method4148(class203 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 6504
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class203.field2328 == var0) { // L: 6505
			var2 = var1.method6623(); // L: 6506
			var3 = var1.readUnsignedShort(); // L: 6507
			var4 = var1.method6609(); // L: 6508
			var5 = (var4 >> 4 & 7) + class18.field145; // L: 6509
			var6 = (var4 & 7) + ClanChat.field3818; // L: 6510
			var7 = var1.method6623(); // L: 6511
			var8 = var7 >> 4 & 15; // L: 6512
			var9 = var7 & 7; // L: 6513
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 6514
				var10 = var8 + 1; // L: 6515
				if (Varcs.localPlayer.pathX[0] >= var5 - var10 && Varcs.localPlayer.pathX[0] <= var5 + var10 && Varcs.localPlayer.pathY[0] >= var6 - var10 && Varcs.localPlayer.pathY[0] <= var10 + var6 && Login.clientPreferences.areaSoundEffectsVolume != 0 && var9 > 0 && Client.soundEffectCount < 50) { // L: 6516 6517
					Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 6518
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9; // L: 6519
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 6520
					Client.soundEffects[Client.soundEffectCount] = null; // L: 6521
					Client.soundLocations[Client.soundEffectCount] = var8 + (var6 << 8) + (var5 << 16); // L: 6522
					++Client.soundEffectCount; // L: 6523
				}
			}
		}

		if (class203.field2335 == var0) { // L: 6528
			var2 = var1.method6623(); // L: 6529
			var3 = var2 >> 2; // L: 6530
			var4 = var2 & 3; // L: 6531
			var5 = Client.field663[var3]; // L: 6532
			var6 = var1.method6609(); // L: 6533
			var7 = (var6 >> 4 & 7) + class18.field145; // L: 6534
			var8 = (var6 & 7) + ClanChat.field3818; // L: 6535
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 6536
				class16.updatePendingSpawn(class26.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1); // L: 6537
			}

		} else {
			int var40;
			if (class203.field2329 == var0) { // L: 6541
				var2 = var1.method6617(); // L: 6542
				var3 = var1.readUnsignedByte(); // L: 6543
				var4 = var3 >> 2; // L: 6544
				var5 = var3 & 3; // L: 6545
				var6 = Client.field663[var4]; // L: 6546
				var7 = var1.method6609(); // L: 6547
				var8 = (var7 >> 4 & 7) + class18.field145; // L: 6548
				var9 = (var7 & 7) + ClanChat.field3818; // L: 6549
				if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 6550
					if (var6 == 0) { // L: 6551
						BoundaryObject var36 = WorldMapArea.scene.method3457(class26.Client_plane, var8, var9); // L: 6552
						if (var36 != null) { // L: 6553
							var40 = WorldMapSection1.Entity_unpackID(var36.tag); // L: 6554
							if (var4 == 2) { // L: 6555
								var36.renderable1 = new DynamicObject(var40, 2, var5 + 4, class26.Client_plane, var8, var9, var2, false, var36.renderable1); // L: 6556
								var36.renderable2 = new DynamicObject(var40, 2, var5 + 1 & 3, class26.Client_plane, var8, var9, var2, false, var36.renderable2); // L: 6557
							} else {
								var36.renderable1 = new DynamicObject(var40, var4, var5, class26.Client_plane, var8, var9, var2, false, var36.renderable1); // L: 6559
							}
						}
					}

					if (var6 == 1) { // L: 6562
						WallDecoration var44 = WorldMapArea.scene.method3458(class26.Client_plane, var8, var9); // L: 6563
						if (var44 != null) { // L: 6564
							var40 = WorldMapSection1.Entity_unpackID(var44.tag); // L: 6565
							if (var4 != 4 && var4 != 5) { // L: 6566
								if (var4 == 6) { // L: 6567
									var44.renderable1 = new DynamicObject(var40, 4, var5 + 4, class26.Client_plane, var8, var9, var2, false, var44.renderable1);
								} else if (var4 == 7) { // L: 6568
									var44.renderable1 = new DynamicObject(var40, 4, (var5 + 2 & 3) + 4, class26.Client_plane, var8, var9, var2, false, var44.renderable1);
								} else if (var4 == 8) { // L: 6569
									var44.renderable1 = new DynamicObject(var40, 4, var5 + 4, class26.Client_plane, var8, var9, var2, false, var44.renderable1); // L: 6570
									var44.renderable2 = new DynamicObject(var40, 4, (var5 + 2 & 3) + 4, class26.Client_plane, var8, var9, var2, false, var44.renderable2); // L: 6571
								}
							} else {
								var44.renderable1 = new DynamicObject(var40, 4, var5, class26.Client_plane, var8, var9, var2, false, var44.renderable1);
							}
						}
					}

					if (var6 == 2) { // L: 6575
						GameObject var45 = WorldMapArea.scene.method3459(class26.Client_plane, var8, var9); // L: 6576
						if (var4 == 11) { // L: 6577
							var4 = 10;
						}

						if (var45 != null) { // L: 6578
							var45.renderable = new DynamicObject(WorldMapSection1.Entity_unpackID(var45.tag), var4, var5, class26.Client_plane, var8, var9, var2, false, var45.renderable);
						}
					}

					if (var6 == 3) { // L: 6580
						FloorDecoration var46 = WorldMapArea.scene.getFloorDecoration(class26.Client_plane, var8, var9); // L: 6581
						if (var46 != null) { // L: 6582
							var46.renderable = new DynamicObject(WorldMapSection1.Entity_unpackID(var46.tag), 22, var5, class26.Client_plane, var8, var9, var2, false, var46.renderable);
						}
					}
				}

			} else {
				int var13;
				int var14;
				if (class203.field2332 == var0) { // L: 6587
					var2 = var1.method6617(); // L: 6588
					var3 = var1.readUnsignedShort(); // L: 6589
					byte var37 = var1.method6678(); // L: 6590
					var5 = var1.method6617(); // L: 6591
					var6 = var1.readUnsignedByte(); // L: 6592
					var7 = var1.readUnsignedByte(); // L: 6593
					var8 = var1.readUnsignedByte() * 4; // L: 6594
					var9 = var1.method6621(); // L: 6595
					var10 = var1.method6609(); // L: 6596
					var40 = (var10 >> 4 & 7) + class18.field145; // L: 6597
					int var41 = (var10 & 7) + ClanChat.field3818; // L: 6598
					byte var42 = var1.method6612(); // L: 6599
					var14 = var1.method6610() * 4; // L: 6600
					var4 = var37 + var40; // L: 6601
					var13 = var42 + var41; // L: 6602
					if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var4 >= 0 && var13 >= 0 && var4 < 104 && var13 < 104 && var5 != 65535) { // L: 6603
						var40 = var40 * 128 + 64; // L: 6604
						var41 = var41 * 128 + 64; // L: 6605
						var4 = var4 * 128 + 64; // L: 6606
						var13 = var13 * 128 + 64; // L: 6607
						Projectile var35 = new Projectile(var5, class26.Client_plane, var40, var41, UserComparator7.getTileHeight(var40, var41, class26.Client_plane) - var14, var3 + Client.cycle, var2 + Client.cycle, var6, var7, var9, var8); // L: 6608
						var35.setDestination(var4, var13, UserComparator7.getTileHeight(var4, var13, class26.Client_plane) - var8, var3 + Client.cycle); // L: 6609
						Client.projectiles.addFirst(var35); // L: 6610
					}

				} else {
					TileItem var31;
					if (class203.field2331 == var0) { // L: 6614
						var2 = var1.method6610(); // L: 6615
						var3 = (var2 >> 4 & 7) + class18.field145; // L: 6616
						var4 = (var2 & 7) + ClanChat.field3818; // L: 6617
						var5 = var1.readUnsignedShort(); // L: 6618
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 6619
							NodeDeque var34 = Client.groundItems[class26.Client_plane][var3][var4]; // L: 6620
							if (var34 != null) { // L: 6621
								for (var31 = (TileItem)var34.last(); var31 != null; var31 = (TileItem)var34.previous()) { // L: 6622 6623 6628
									if ((var5 & 32767) == var31.id) { // L: 6624
										var31.remove(); // L: 6625
										break;
									}
								}

								if (var34.last() == null) { // L: 6630
									Client.groundItems[class26.Client_plane][var3][var4] = null;
								}

								class225.updateItemPile(var3, var4); // L: 6631
							}
						}

					} else if (class203.field2339 == var0) { // L: 6636
						var2 = var1.readUnsignedByte(); // L: 6637
						var3 = var1.method6748(); // L: 6638
						var4 = var1.readUnsignedShort(); // L: 6639
						var5 = var1.method6623(); // L: 6640
						var6 = (var5 >> 4 & 7) + class18.field145; // L: 6641
						var7 = (var5 & 7) + ClanChat.field3818; // L: 6642
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 6643
							var6 = var6 * 128 + 64; // L: 6644
							var7 = var7 * 128 + 64; // L: 6645
							GraphicsObject var43 = new GraphicsObject(var3, class26.Client_plane, var6, var7, UserComparator7.getTileHeight(var6, var7, class26.Client_plane) - var2, var4, Client.cycle); // L: 6646
							Client.graphicsObjects.addFirst(var43); // L: 6647
						}

					} else if (class203.field2333 == var0) { // L: 6651
						var2 = var1.readUnsignedShort(); // L: 6652
						var3 = var1.readUnsignedShort(); // L: 6653
						var4 = var1.method6617(); // L: 6654
						var5 = var1.readUnsignedByte(); // L: 6655
						var6 = (var5 >> 4 & 7) + class18.field145; // L: 6656
						var7 = (var5 & 7) + ClanChat.field3818; // L: 6657
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 6658
							NodeDeque var32 = Client.groundItems[class26.Client_plane][var6][var7]; // L: 6659
							if (var32 != null) { // L: 6660
								for (TileItem var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) { // L: 6661 6662 6667
									if ((var2 & 32767) == var33.id && var4 == var33.quantity) { // L: 6663
										var33.quantity = var3; // L: 6664
										break;
									}
								}

								class225.updateItemPile(var6, var7); // L: 6669
							}
						}

					} else if (class203.field2334 == var0) { // L: 6674
						var2 = var1.readUnsignedShort(); // L: 6675
						var3 = var1.method6610(); // L: 6676
						var4 = (var3 >> 4 & 7) + class18.field145; // L: 6677
						var5 = (var3 & 7) + ClanChat.field3818; // L: 6678
						var6 = var1.readUnsignedShort(); // L: 6679
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 6680
							var31 = new TileItem(); // L: 6681
							var31.id = var6; // L: 6682
							var31.quantity = var2; // L: 6683
							if (Client.groundItems[class26.Client_plane][var4][var5] == null) { // L: 6684
								Client.groundItems[class26.Client_plane][var4][var5] = new NodeDeque();
							}

							Client.groundItems[class26.Client_plane][var4][var5].addFirst(var31); // L: 6685
							class225.updateItemPile(var4, var5); // L: 6686
						}

					} else {
						if (class203.field2327 == var0) { // L: 6690
							var2 = var1.method6610(); // L: 6691
							var3 = var2 >> 2; // L: 6692
							var4 = var2 & 3; // L: 6693
							var5 = Client.field663[var3]; // L: 6694
							var6 = var1.readUnsignedShort(); // L: 6695
							var7 = var1.method6766(); // L: 6696
							byte var38 = var1.readByte(); // L: 6697
							var9 = var1.method6748(); // L: 6698
							byte var39 = var1.method6612(); // L: 6699
							byte var11 = var1.method6678(); // L: 6700
							byte var12 = var1.method6678(); // L: 6701
							var13 = var1.readUnsignedByte(); // L: 6702
							var14 = (var13 >> 4 & 7) + class18.field145; // L: 6703
							int var15 = (var13 & 7) + ClanChat.field3818; // L: 6704
							int var16 = var1.readUnsignedShort(); // L: 6705
							Player var17;
							if (var7 == Client.localPlayerIndex) { // L: 6707
								var17 = Varcs.localPlayer;
							} else {
								var17 = Client.players[var7]; // L: 6708
							}

							if (var17 != null) { // L: 6709
								ObjectComposition var18 = class19.getObjectDefinition(var16); // L: 6710
								int var19;
								int var20;
								if (var4 != 1 && var4 != 3) { // L: 6713
									var19 = var18.sizeX; // L: 6718
									var20 = var18.sizeY; // L: 6719
								} else {
									var19 = var18.sizeY; // L: 6714
									var20 = var18.sizeX; // L: 6715
								}

								int var21 = var14 + (var19 >> 1); // L: 6721
								int var22 = var14 + (var19 + 1 >> 1); // L: 6722
								int var23 = var15 + (var20 >> 1); // L: 6723
								int var24 = var15 + (var20 + 1 >> 1); // L: 6724
								int[][] var25 = Tiles.Tiles_heights[class26.Client_plane]; // L: 6725
								int var26 = var25[var22][var24] + var25[var21][var24] + var25[var22][var23] + var25[var21][var23] >> 2; // L: 6726
								int var27 = (var14 << 7) + (var19 << 6); // L: 6727
								int var28 = (var15 << 7) + (var20 << 6); // L: 6728
								Model var29 = var18.getModel(var3, var4, var25, var27, var26, var28); // L: 6729
								if (var29 != null) { // L: 6730
									class16.updatePendingSpawn(class26.Client_plane, var14, var15, var5, -1, 0, 0, var6 + 1, var9 + 1); // L: 6731
									var17.animationCycleStart = var6 + Client.cycle; // L: 6732
									var17.animationCycleEnd = var9 + Client.cycle; // L: 6733
									var17.model0 = var29; // L: 6734
									var17.field1175 = var19 * 64 + var14 * 128; // L: 6735
									var17.field1177 = var20 * 64 + var15 * 128; // L: 6736
									var17.tileHeight2 = var26; // L: 6737
									byte var30;
									if (var38 > var39) { // L: 6738
										var30 = var38; // L: 6739
										var38 = var39; // L: 6740
										var39 = var30; // L: 6741
									}

									if (var12 > var11) { // L: 6743
										var30 = var12; // L: 6744
										var12 = var11; // L: 6745
										var11 = var30; // L: 6746
									}

									var17.minX = var38 + var14; // L: 6748
									var17.maxX = var14 + var39; // L: 6749
									var17.minY = var12 + var15; // L: 6750
									var17.maxY = var15 + var11; // L: 6751
								}
							}
						}

						if (class203.field2330 == var0) { // L: 6755
							var2 = var1.method6609(); // L: 6756
							var3 = var2 >> 2; // L: 6757
							var4 = var2 & 3; // L: 6758
							var5 = Client.field663[var3]; // L: 6759
							var6 = var1.method6766(); // L: 6760
							var7 = var1.readUnsignedByte(); // L: 6761
							var8 = (var7 >> 4 & 7) + class18.field145; // L: 6762
							var9 = (var7 & 7) + ClanChat.field3818; // L: 6763
							if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 6764
								class16.updatePendingSpawn(class26.Client_plane, var8, var9, var5, var6, var3, var4, 0, -1); // L: 6765
							}

						}
					}
				}
			}
		}
	} // L: 6539 6585 6612 6634 6649 6672 6688 6767 6769

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1958659772"
	)
	static final void method4126(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11181
		Login.clientPreferences.areaSoundEffectsVolume = var0; // L: 11182
		Message.savePreferences(); // L: 11183
	} // L: 11184

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	static void method4149() {
		if (Client.field685 && Varcs.localPlayer != null) { // L: 11706
			int var0 = Varcs.localPlayer.pathX[0]; // L: 11707
			int var1 = Varcs.localPlayer.pathY[0]; // L: 11708
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 11709
				return;
			}

			class6.oculusOrbFocalPointX = Varcs.localPlayer.x; // L: 11710
			int var2 = UserComparator7.getTileHeight(Varcs.localPlayer.x, Varcs.localPlayer.y, class26.Client_plane) - Client.camFollowHeight; // L: 11711
			if (var2 < VarbitComposition.field3544) { // L: 11712
				VarbitComposition.field3544 = var2;
			}

			Players.oculusOrbFocalPointY = Varcs.localPlayer.y; // L: 11713
			Client.field685 = false; // L: 11714
		}

	} // L: 11716
}
