import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("io")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("c")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("j")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("p")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lpd;Lpd;IZI)V",
		garbageValue = "-578931105"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) {
				continue;
			}

			this.worldMapData0Set.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.worldMapData1Set.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lpd;ZB)V",
		garbageValue = "110"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.method7742();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpy;I)V",
		garbageValue = "736636997"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 25
		if (var1 != null) { // L: 26
			int var2 = var0.offset; // L: 27
			var0.writeInt(var1.id); // L: 28

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 29
				if (var1.creationErrors[var3] != 0) { // L: 30
					var0.writeByte(var1.creationErrors[var3]); // L: 31
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 35
						Field var5;
						int var6;
						if (var4 == 0) { // L: 36
							var5 = var1.fields[var3]; // L: 37
							var6 = Reflection.getInt(var5, (Object)null); // L: 38
							var0.writeByte(0); // L: 39
							var0.writeInt(var6); // L: 40
						} else if (var4 == 1) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 44
							var0.writeByte(0); // L: 45
						} else if (var4 == 2) { // L: 47
							var5 = var1.fields[var3]; // L: 48
							var6 = var5.getModifiers(); // L: 49
							var0.writeByte(0); // L: 50
							var0.writeInt(var6); // L: 51
						}

						Method var25;
						if (var4 != 3) { // L: 53
							if (var4 == 4) { // L: 73
								var25 = var1.methods[var3]; // L: 74
								var6 = var25.getModifiers(); // L: 75
								var0.writeByte(0); // L: 76
								var0.writeInt(var6); // L: 77
							}
						} else {
							var25 = var1.methods[var3]; // L: 54
							byte[][] var10 = var1.arguments[var3]; // L: 55
							Object[] var7 = new Object[var10.length]; // L: 56

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 57
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 58
								var7[var8] = var9.readObject(); // L: 59
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 61
							if (var11 == null) { // L: 62
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 63
								var0.writeByte(1); // L: 64
								var0.writeLong(((Number)var11).longValue()); // L: 65
							} else if (var11 instanceof String) { // L: 67
								var0.writeByte(2); // L: 68
								var0.writeStringCp1252NullTerminated((String)var11); // L: 69
							} else {
								var0.writeByte(4); // L: 71
							}
						}
					} catch (ClassNotFoundException var13) { // L: 80
						var0.writeByte(-10); // L: 81
					} catch (InvalidClassException var14) { // L: 83
						var0.writeByte(-11); // L: 84
					} catch (StreamCorruptedException var15) { // L: 86
						var0.writeByte(-12); // L: 87
					} catch (OptionalDataException var16) { // L: 89
						var0.writeByte(-13); // L: 90
					} catch (IllegalAccessException var17) { // L: 92
						var0.writeByte(-14); // L: 93
					} catch (IllegalArgumentException var18) { // L: 95
						var0.writeByte(-15); // L: 96
					} catch (InvocationTargetException var19) { // L: 98
						var0.writeByte(-16); // L: 99
					} catch (SecurityException var20) { // L: 101
						var0.writeByte(-17); // L: 102
					} catch (IOException var21) { // L: 104
						var0.writeByte(-18); // L: 105
					} catch (NullPointerException var22) { // L: 107
						var0.writeByte(-19); // L: 108
					} catch (Exception var23) { // L: 110
						var0.writeByte(-20); // L: 111
					} catch (Throwable var24) { // L: 113
						var0.writeByte(-21); // L: 114
					}
				}
			}

			var0.writeCrc(var2); // L: 117
			var1.remove(); // L: 118
		}
	} // L: 119

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)I",
		garbageValue = "781537863"
	)
	static final int method5086(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10294
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10296
				int var3 = 0; // L: 10297
				int var4 = 0; // L: 10298
				byte var5 = 0; // L: 10299

				while (true) {
					int var6 = var2[var4++]; // L: 10301
					int var7 = 0; // L: 10302
					byte var8 = 0; // L: 10303
					if (var6 == 0) { // L: 10304
						return var3;
					}

					if (var6 == 1) { // L: 10305
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10306
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10307
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10308
						var9 = var2[var4++] << 16; // L: 10309
						var9 += var2[var4++]; // L: 10310
						var10 = HorizontalAlignment.getWidget(var9); // L: 10311
						var11 = var2[var4++]; // L: 10312
						if (var11 != -1 && (!class67.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10313
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10314
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10315
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10319
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10320
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10321
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10322
						var7 = class19.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10323
						for (var9 = 0; var9 < 25; ++var9) { // L: 10324
							if (Skills.Skills_enabled[var9]) { // L: 10325
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10328
						var9 = var2[var4++] << 16; // L: 10329
						var9 += var2[var4++]; // L: 10330
						var10 = HorizontalAlignment.getWidget(var9); // L: 10331
						var11 = var2[var4++]; // L: 10332
						if (var11 != -1 && (!class67.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10333
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10334
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10335
									var7 = 999999999; // L: 10336
									break; // L: 10337
								}
							}
						}
					}

					if (var6 == 11) { // L: 10342
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10343
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10344
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10345
						int var13 = var2[var4++]; // L: 10346
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10347
					}

					if (var6 == 14) { // L: 10349
						var9 = var2[var4++]; // L: 10350
						var7 = WorldMapRegion.getVarbit(var9); // L: 10351
					}

					if (var6 == 15) { // L: 10353
						var8 = 1;
					}

					if (var6 == 16) { // L: 10354
						var8 = 2;
					}

					if (var6 == 17) { // L: 10355
						var8 = 3;
					}

					if (var6 == 18) { // L: 10356
						var7 = (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX;
					}

					if (var6 == 19) { // L: 10357
						var7 = (class19.localPlayer.y >> 7) + class250.baseY;
					}

					if (var6 == 20) { // L: 10358
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10359
						if (var5 == 0) { // L: 10360
							var3 += var7;
						}

						if (var5 == 1) { // L: 10361
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10362
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10363
							var3 *= var7;
						}

						var5 = 0; // L: 10364
					} else {
						var5 = var8; // L: 10366
					}
				}
			} catch (Exception var14) { // L: 10369
				return -1; // L: 10370
			}
		} else {
			return -2;
		}
	}
}
