import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class129 extends class132 {
	@ObfuscatedName("hi")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1525021319
	)
	int field1480;
	@ObfuscatedName("q")
	byte field1476;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1440007301
	)
	int field1481;
	@ObfuscatedName("j")
	String field1478;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class129(class133 var1) {
		this.this$0 = var1;
		this.field1480 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "35"
	)
	void vmethod2760(Buffer var1) {
		var1.readUnsignedByte();
		this.field1480 = var1.readUnsignedShort();
		this.field1476 = var1.readByte();
		this.field1481 = var1.readUnsignedShort();
		var1.readLong();
		this.field1478 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "1634989707"
	)
	void vmethod2759(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1480);
		var2.rank = this.field1476;
		var2.world = this.field1481;
		var2.username = new Username(this.field1478);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIILfw;Lfy;I)Z",
		garbageValue = "-1980971747"
	)
	public static final boolean method2673(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0;
		int var6 = var1;
		byte var7 = 64;
		byte var8 = 64;
		int var9 = var0 - var7;
		int var10 = var1 - var8;
		class174.directions[var7][var8] = 99;
		class174.distances[var7][var8] = 0;
		byte var11 = 0;
		int var12 = 0;
		class174.bufferX[var11] = var0;
		int var20 = var11 + 1;
		class174.bufferY[var11] = var1;
		int[][] var13 = var4.flags;

		while (true) {
			label305:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label282:
							do {
								if (var20 == var12) {
									class318.field3870 = var5;
									class174.field1994 = var6;
									return false;
								}

								var5 = class174.bufferX[var12];
								var6 = class174.bufferY[var12];
								var12 = var12 + 1 & 4095;
								var18 = var5 - var9;
								var19 = var6 - var10;
								var14 = var5 - var4.xInset;
								var15 = var6 - var4.yInset;
								if (var3.hasArrived(var2, var5, var6, var4)) {
									class318.field3870 = var5;
									class174.field1994 = var6;
									return true;
								}

								var16 = class174.distances[var18][var19] + 1;
								if (var18 > 0 && class174.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5 - 1;
											class174.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class174.directions[var18 - 1][var19] = 2;
											class174.distances[var18 - 1][var19] = var16;
											break;
										}

										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && class174.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5 + 1;
											class174.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class174.directions[var18 + 1][var19] = 8;
											class174.distances[var18 + 1][var19] = var16;
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 > 0 && class174.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5;
											class174.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class174.directions[var18][var19 - 1] = 1;
											class174.distances[var18][var19 - 1] = var16;
											break;
										}

										if ((var13[var17 + var14][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 < 128 - var2 && class174.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5;
											class174.bufferY[var20] = var6 + 1;
											var20 = var20 + 1 & 4095;
											class174.directions[var18][var19 + 1] = 4;
											class174.distances[var18][var19 + 1] = var16;
											break;
										}

										if ((var13[var14 + var17][var15 + var2] & 19137016) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 > 0 && class174.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class174.bufferX[var20] = var5 - 1;
											class174.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class174.directions[var18 - 1][var19 - 1] = 3;
											class174.distances[var18 - 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class174.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class174.bufferX[var20] = var5 + 1;
											class174.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class174.directions[var18 + 1][var19 - 1] = 9;
											class174.distances[var18 + 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class174.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
									for (var17 = 1; var17 < var2; ++var17) {
										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
											continue label282;
										}
									}

									class174.bufferX[var20] = var5 - 1;
									class174.bufferY[var20] = var6 + 1;
									var20 = var20 + 1 & 4095;
									class174.directions[var18 - 1][var19 + 1] = 6;
									class174.distances[var18 - 1][var19 + 1] = var16;
								}
							} while(var18 >= 128 - var2);
						} while(var19 >= 128 - var2);
					} while(class174.directions[var18 + 1][var19 + 1] != 0);
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

				for (var17 = 1; var17 < var2; ++var17) {
					if ((var13[var14 + var17][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var17 + var15] & 19136995) != 0) {
						continue label305;
					}
				}

				class174.bufferX[var20] = var5 + 1;
				class174.bufferY[var20] = var6 + 1;
				var20 = var20 + 1 & 4095;
				class174.directions[var18 + 1][var19 + 1] = 12;
				class174.distances[var18 + 1][var19 + 1] = var16;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lpa;",
		garbageValue = "2085861748"
	)
	public static PrivateChatMode method2671(int var0) {
		PrivateChatMode[] var1 = Skeleton.method4196();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field4414) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "32"
	)
	public static String method2670(CharSequence var0) {
		return StructComposition.method3152('*', var0.length());
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "942143670"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		WorldMapDecorationType.clientPreferences.soundEffectsVolume = var0;
		ScriptFrame.savePreferences();
	}
}
