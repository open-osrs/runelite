import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("c")
	boolean field4299;
	@ObfuscatedName("v")
	boolean field4298;

	Friend() {
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)I",
		garbageValue = "-1436702085"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4299 && !var1.field4299) { // L: 16
			return -1;
		} else if (!this.field4299 && var1.field4299) { // L: 17
			return 1;
		} else if (this.field4298 && !var1.field4298) { // L: 18
			return -1;
		} else if (!this.field4298 && var1.field4298) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lne;B)I",
		garbageValue = "-81"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "-29"
	)
	static File method6630(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 123
		class267.JagexCache_locationFile = new File(class123.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 124
		String var4 = null; // L: 125
		String var5 = null; // L: 126
		boolean var6 = false; // L: 127
		Buffer var8;
		File var23;
		if (class267.JagexCache_locationFile.exists()) { // L: 128
			try {
				AccessFile var7 = new AccessFile(class267.JagexCache_locationFile, "rw", 10000L); // L: 131

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 132 133 136
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 134
					if (var9 == -1) { // L: 135
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 138
				var9 = var8.readUnsignedByte(); // L: 139
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9); // L: 140
				}

				int var10 = 0; // L: 141
				if (var9 > 1) { // L: 142
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 143
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 144
					if (var10 == 1) { // L: 145
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 148
					if (var10 == 1) { // L: 149
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 151
			} catch (IOException var21) { // L: 153
				var21.printStackTrace(); // L: 154
			}

			if (var4 != null) { // L: 156
				var23 = new File(var4); // L: 157
				if (!var23.exists()) { // L: 158
					var4 = null; // L: 159
				}
			}

			if (var4 != null) { // L: 162
				var23 = new File(var4, "test.dat"); // L: 163
				if (!Varcs.method2474(var23, true)) { // L: 164
					var4 = null; // L: 165
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 169
			label140:
			for (int var15 = 0; var15 < JagexCache.cacheSubPaths.length; ++var15) { // L: 170
				for (int var16 = 0; var16 < Fonts.cacheParentPaths.length; ++var16) { // L: 171
					File var17 = new File(Fonts.cacheParentPaths[var16] + JagexCache.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar); // L: 172
					if (var17.exists() && Varcs.method2474(new File(var17, "test.dat"), true)) { // L: 173 174
						var4 = var17.toString(); // L: 175
						var6 = true; // L: 176
						break label140; // L: 177
					}
				}
			}
		}

		if (var4 == null) { // L: 183
			var4 = class123.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 184
			var6 = true; // L: 185
		}

		File var22;
		if (var5 != null) { // L: 187
			var22 = new File(var5); // L: 188
			var23 = new File(var4); // L: 189

			try {
				File[] var24 = var22.listFiles(); // L: 191
				File[] var18 = var24; // L: 193

				for (int var11 = 0; var11 < var18.length; ++var11) { // L: 194
					File var12 = var18[var11]; // L: 195
					File var13 = new File(var23, var12.getName()); // L: 197
					boolean var14 = var12.renameTo(var13); // L: 198
					if (!var14) { // L: 199
						throw new IOException();
					}
				}
			} catch (Exception var20) { // L: 204
				var20.printStackTrace(); // L: 205
			}

			var6 = true; // L: 207
		}

		if (var6) { // L: 209
			var22 = new File(var4); // L: 210
			var8 = null; // L: 211

			try {
				AccessFile var25 = new AccessFile(class267.JagexCache_locationFile, "rw", 10000L); // L: 215
				Buffer var26 = new Buffer(500); // L: 216
				var26.writeByte(3); // L: 217
				var26.writeByte(var8 != null ? 1 : 0); // L: 218
				var26.writeCESU8(var22.getPath()); // L: 219
				if (var8 != null) { // L: 220
					var26.writeCESU8("");
				}

				var25.write(var26.array, 0, var26.offset); // L: 221
				var25.close(); // L: 222
			} catch (IOException var19) { // L: 224
				var19.printStackTrace(); // L: 225
			}
		}

		return new File(var4); // L: 229
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "44"
	)
	static int method6619(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 435
			return JagexCache.method3271(var0, var1, var2);
		} else if (var0 < 1100) { // L: 436
			return PendingSpawn.method2180(var0, var1, var2);
		} else if (var0 < 1200) { // L: 437
			return Varcs.method2475(var0, var1, var2);
		} else if (var0 < 1300) { // L: 438
			return StructComposition.method3617(var0, var1, var2);
		} else if (var0 < 1400) { // L: 439
			return ChatChannel.method2003(var0, var1, var2);
		} else if (var0 < 1500) { // L: 440
			return ViewportMouse.method4514(var0, var1, var2);
		} else if (var0 < 1600) { // L: 441
			return class125.method2821(var0, var1, var2);
		} else if (var0 < 1700) { // L: 442
			return class1.method7(var0, var1, var2);
		} else if (var0 < 1800) { // L: 443
			return GameObject.method4553(var0, var1, var2);
		} else if (var0 < 1900) { // L: 444
			return FloorOverlayDefinition.method3817(var0, var1, var2);
		} else if (var0 < 2000) { // L: 445
			return ReflectionCheck.method576(var0, var1, var2);
		} else if (var0 < 2100) { // L: 446
			return PendingSpawn.method2180(var0, var1, var2);
		} else if (var0 < 2200) { // L: 447
			return Varcs.method2475(var0, var1, var2);
		} else if (var0 < 2300) { // L: 448
			return StructComposition.method3617(var0, var1, var2);
		} else if (var0 < 2400) { // L: 449
			return ChatChannel.method2003(var0, var1, var2);
		} else if (var0 < 2500) { // L: 450
			return ViewportMouse.method4514(var0, var1, var2);
		} else if (var0 < 2600) { // L: 451
			return WorldMapDecoration.method4992(var0, var1, var2);
		} else if (var0 < 2700) { // L: 452
			return DynamicObject.method1987(var0, var1, var2);
		} else if (var0 < 2800) { // L: 453
			return class353.method6506(var0, var1, var2);
		} else if (var0 < 2900) { // L: 454
			return class238.method5001(var0, var1, var2);
		} else if (var0 < 3000) { // L: 455
			return ReflectionCheck.method576(var0, var1, var2);
		} else if (var0 < 3200) { // L: 456
			return class115.method2682(var0, var1, var2);
		} else if (var0 < 3300) { // L: 457
			return Decimator.method1019(var0, var1, var2);
		} else if (var0 < 3400) { // L: 458
			return UserComparator10.method2605(var0, var1, var2);
		} else if (var0 < 3500) { // L: 459
			return class131.method2875(var0, var1, var2);
		} else if (var0 < 3600) { // L: 460
			return InterfaceParent.method2097(var0, var1, var2);
		} else if (var0 < 3700) { // L: 461
			return JagexCache.method3249(var0, var1, var2);
		} else if (var0 < 3800) { // L: 462
			return ArchiveLoader.method2073(var0, var1, var2);
		} else if (var0 < 3900) { // L: 463
			return Client.method1177(var0, var1, var2);
		} else if (var0 < 4000) { // L: 464
			return WorldMapSectionType.method4953(var0, var1, var2);
		} else if (var0 < 4100) {
			return Language.method6068(var0, var1, var2); // L: 465
		} else if (var0 < 4200) { // L: 466
			return UserComparator3.method2592(var0, var1, var2);
		} else if (var0 < 4300) { // L: 467
			return UserComparator6.method2628(var0, var1, var2);
		} else if (var0 < 5100) { // L: 468
			return class118.method2742(var0, var1, var2);
		} else if (var0 < 5400) { // L: 469
			return VarcInt.method3411(var0, var1, var2);
		} else if (var0 < 5600) { // L: 470
			return class118.method2744(var0, var1, var2);
		} else if (var0 < 5700) { // L: 471
			return class21.method264(var0, var1, var2);
		} else if (var0 < 6300) { // L: 472
			return class387.method7021(var0, var1, var2);
		} else if (var0 < 6600) { // L: 473
			return ParamComposition.method3574(var0, var1, var2);
		} else if (var0 < 6700) { // L: 474
			return UserList.method6754(var0, var1, var2);
		} else if (var0 < 6800) { // L: 475
			return class14.method155(var0, var1, var2);
		} else if (var0 < 6900) { // L: 476
			return class162.method3298(var0, var1, var2);
		} else if (var0 < 7000) { // L: 477
			return MilliClock.method3308(var0, var1, var2);
		} else if (var0 < 7100) { // L: 478
			return SpriteMask.method5524(var0, var1, var2);
		} else if (var0 < 7200) { // L: 479
			return class11.method96(var0, var1, var2);
		} else if (var0 < 7300) { // L: 480
			return WorldMapSectionType.method4948(var0, var1, var2);
		} else if (var0 < 7500) { // L: 481
			return Renderable.method4339(var0, var1, var2);
		} else if (var0 < 7600) { // L: 482
			return MouseHandler.method547(var0, var1, var2);
		} else {
			return var0 < 7700 ? UserComparator3.method2590(var0, var1, var2) : 2; // L: 483 484
		}
	}
}
