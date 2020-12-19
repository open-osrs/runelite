import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.RandomAccessFile;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@ObfuscatedName("k")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = 1358667779
	)
	static int field112;
	@ObfuscatedName("ei")
	@Export("secureRandom")
	static SecureRandom secureRandom;

	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-804003183"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field292.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort(); // L: 15
			super.regionYLow = var1.readUnsignedShort(); // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method5559(); // L: 19
			super.fileId = var1.method5559(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1878970684"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 24
		super.floorUnderlayIds = new short[1][64][64]; // L: 25
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 26
		super.field178 = new byte[super.planes][64][64]; // L: 27
		super.field177 = new byte[super.planes][64][64]; // L: 28
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 29
		int var2 = var1.readUnsignedByte(); // L: 30
		if (var2 != class39.field278.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) { // L: 39
					for (int var6 = 0; var6 < 64; ++var6) { // L: 40
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 47
			return false;
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return var2.regionX == super.regionX && super.regionY == var2.regionY;
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "69015458"
	)
	public static boolean method247(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class298.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lky;S)V",
		garbageValue = "13892"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class105.reflectionChecks.last(); // L: 31
		if (var1 != null) { // L: 32
			int var2 = var0.offset; // L: 33
			var0.writeInt(var1.id); // L: 34

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 35
				if (var1.creationErrors[var3] != 0) { // L: 36
					var0.writeByte(var1.creationErrors[var3]); // L: 37
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 41
						Field var5;
						int var6;
						if (var4 == 0) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							var6 = Reflection.getInt(var5, (Object)null); // L: 44
							var0.writeByte(0); // L: 45
							var0.writeInt(var6); // L: 46
						} else if (var4 == 1) { // L: 48
							var5 = var1.fields[var3]; // L: 49
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 50
							var0.writeByte(0); // L: 51
						} else if (var4 == 2) { // L: 53
							var5 = var1.fields[var3]; // L: 54
							var6 = var5.getModifiers(); // L: 55
							var0.writeByte(0); // L: 56
							var0.writeInt(var6); // L: 57
						}

						Method var25;
						if (var4 != 3) { // L: 59
							if (var4 == 4) { // L: 79
								var25 = var1.methods[var3]; // L: 80
								var6 = var25.getModifiers(); // L: 81
								var0.writeByte(0); // L: 82
								var0.writeInt(var6); // L: 83
							}
						} else {
							var25 = var1.methods[var3]; // L: 60
							byte[][] var10 = var1.arguments[var3]; // L: 61
							Object[] var7 = new Object[var10.length]; // L: 62

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 63
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 64
								var7[var8] = var9.readObject(); // L: 65
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 67
							if (var11 == null) { // L: 68
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 69
								var0.writeByte(1); // L: 70
								var0.writeLong(((Number)var11).longValue()); // L: 71
							} else if (var11 instanceof String) { // L: 73
								var0.writeByte(2); // L: 74
								var0.writeStringCp1252NullTerminated((String)var11); // L: 75
							} else {
								var0.writeByte(4); // L: 77
							}
						}
					} catch (ClassNotFoundException var13) { // L: 86
						var0.writeByte(-10); // L: 87
					} catch (InvalidClassException var14) { // L: 89
						var0.writeByte(-11); // L: 90
					} catch (StreamCorruptedException var15) { // L: 92
						var0.writeByte(-12); // L: 93
					} catch (OptionalDataException var16) { // L: 95
						var0.writeByte(-13); // L: 96
					} catch (IllegalAccessException var17) { // L: 98
						var0.writeByte(-14); // L: 99
					} catch (IllegalArgumentException var18) { // L: 101
						var0.writeByte(-15); // L: 102
					} catch (InvocationTargetException var19) { // L: 104
						var0.writeByte(-16); // L: 105
					} catch (SecurityException var20) { // L: 107
						var0.writeByte(-17); // L: 108
					} catch (IOException var21) { // L: 110
						var0.writeByte(-18); // L: 111
					} catch (NullPointerException var22) { // L: 113
						var0.writeByte(-19); // L: 114
					} catch (Exception var23) { // L: 116
						var0.writeByte(-20); // L: 117
					} catch (Throwable var24) { // L: 119
						var0.writeByte(-21); // L: 120
					}
				}
			}

			var0.writeCrc(var2); // L: 123
			var1.remove(); // L: 124
		}
	} // L: 125

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-806912444"
	)
	public static void method237() {
		try {
			File var0 = new File(TileItemPile.userHomeDirectory, "random.dat"); // L: 212
			int var2;
			if (var0.exists()) { // L: 213
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 214
			} else {
				label37:
				for (int var1 = 0; var1 < DynamicObject.field1318.length; ++var1) { // L: 217
					for (var2 = 0; var2 < GraphicsObject.field1117.length; ++var2) { // L: 218
						File var3 = new File(GraphicsObject.field1117[var2] + DynamicObject.field1318[var1] + File.separatorChar + "random.dat"); // L: 219
						if (var3.exists()) { // L: 220
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 221
							break label37; // L: 222
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 227
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 228
				var2 = var4.read(); // L: 229
				var4.seek(0L); // L: 230
				var4.write(var2); // L: 231
				var4.seek(0L); // L: 232
				var4.close(); // L: 233
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 234
			}
		} catch (IOException var5) { // L: 237
		}

	} // L: 238

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "2012352771"
	)
	static int method245(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1736
			VarcInt.Interpreter_intStackSize -= 3; // L: 1737
			class232.queueSoundEffect(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize], Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]); // L: 1738
			return 1; // L: 1739
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1741
			playSong(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 1742
			return 1; // L: 1743
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1745
			VarcInt.Interpreter_intStackSize -= 2; // L: 1746
			LoginPacket.method3672(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize], Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]); // L: 1747
			return 1; // L: 1748
		} else {
			int var3;
			if (var0 == 3203) { // L: 1750
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize], 0), 100); // L: 1751
				WorldMapEvent.method810(Math.round((float)var3 * 2.55F)); // L: 1752
				return 1; // L: 1753
			} else if (var0 == 3204) { // L: 1755
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Math.round((float)Timer.clientPreferences.musicVolume / 2.55F); // L: 1756
				return 1; // L: 1757
			} else if (var0 == 3205) { // L: 1759
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize], 0), 100); // L: 1760
				WorldMapCacheName.method662(Math.round((float)var3 * 1.27F)); // L: 1761
				return 1; // L: 1762
			} else if (var0 == 3206) { // L: 1764
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Math.round((float)Timer.clientPreferences.soundEffectsVolume / 1.27F); // L: 1765
				return 1; // L: 1766
			} else if (var0 == 3207) { // L: 1768
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize], 0), 100); // L: 1769
				class194.method3676(Math.round(1.27F * (float)var3)); // L: 1770
				return 1; // L: 1771
			} else if (var0 == 3208) { // L: 1773
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Math.round((float)Timer.clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1774
				return 1; // L: 1775
			} else {
				return 2; // L: 1777
			}
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1507499151"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field883) { // L: 3708
			WorldMapRegion.method588(); // L: 3709
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Timer.clientPreferences.musicVolume != 0 && !Client.field883) { // L: 3711
			SecureRandomCallable.method1221(2, class217.archive6, var0, 0, Timer.clientPreferences.musicVolume, false); // L: 3712
		}

		Client.currentTrackGroupId = var0; // L: 3714
	} // L: 3715

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(ZLky;I)V",
		garbageValue = "-1863896009"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field769 = 0; // L: 7067
		Client.field826 = 0; // L: 7068
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 7070
		var2.importIndex(); // L: 7071
		int var3 = var2.readBits(8); // L: 7072
		int var4;
		if (var3 < Client.npcCount) { // L: 7073
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 7074
				Client.field770[++Client.field769 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 7076
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7077

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			for (var4 = 0; var4 < var3; ++var4) { // L: 7078
				var5 = Client.npcIndices[var4]; // L: 7079
				NPC var16 = Client.npcs[var5]; // L: 7080
				var7 = var2.readBits(1); // L: 7081
				if (var7 == 0) { // L: 7082
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7083
					var16.npcCycle = Client.cycle; // L: 7084
				} else {
					var8 = var2.readBits(2); // L: 7087
					if (var8 == 0) { // L: 7088
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7089
						var16.npcCycle = Client.cycle; // L: 7090
						Client.field654[++Client.field826 - 1] = var5; // L: 7091
					} else if (var8 == 1) { // L: 7094
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7095
						var16.npcCycle = Client.cycle; // L: 7096
						var9 = var2.readBits(3); // L: 7097
						var16.method2102(var9, (byte)1); // L: 7098
						var10 = var2.readBits(1); // L: 7099
						if (var10 == 1) { // L: 7100
							Client.field654[++Client.field826 - 1] = var5;
						}
					} else if (var8 == 2) { // L: 7103
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7104
						var16.npcCycle = Client.cycle; // L: 7105
						var9 = var2.readBits(3); // L: 7106
						var16.method2102(var9, (byte)2); // L: 7107
						var10 = var2.readBits(3); // L: 7108
						var16.method2102(var10, (byte)2); // L: 7109
						var11 = var2.readBits(1); // L: 7110
						if (var11 == 1) { // L: 7111
							Client.field654[++Client.field826 - 1] = var5;
						}
					} else if (var8 == 3) { // L: 7114
						Client.field770[++Client.field769 - 1] = var5; // L: 7115
					}
				}
			}

			ModeWhere.method3714(var0, var1); // L: 7120

			int var14;
			for (var14 = 0; var14 < Client.field826; ++var14) { // L: 7122
				var3 = Client.field654[var14]; // L: 7123
				NPC var15 = Client.npcs[var3]; // L: 7124
				var5 = var1.readUnsignedByte(); // L: 7125
				int var6;
				if ((var5 & 8) != 0) { // L: 7126
					var15.spotAnimation = var1.method5539(); // L: 7127
					var6 = var1.readInt(); // L: 7128
					var15.field979 = var6 >> 16; // L: 7129
					var15.field978 = (var6 & 65535) + Client.cycle; // L: 7130
					var15.spotAnimationFrame = 0; // L: 7131
					var15.spotAnimationFrameCycle = 0; // L: 7132
					if (var15.field978 > Client.cycle) { // L: 7133
						var15.spotAnimationFrame = -1;
					}

					if (var15.spotAnimation == 65535) { // L: 7134
						var15.spotAnimation = -1;
					}
				}

				if ((var5 & 2) != 0) { // L: 7136
					var6 = var1.method5582(); // L: 7137
					var7 = var1.method5539(); // L: 7138
					var8 = var15.x - (var6 - NetFileRequest.baseX - NetFileRequest.baseX) * 64; // L: 7139
					var9 = var15.y - (var7 - class41.baseY - class41.baseY) * 64; // L: 7140
					if (var8 != 0 || var9 != 0) { // L: 7141
						var15.field959 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
					}
				}

				if ((var5 & 16) != 0) { // L: 7143
					var15.targetIndex = var1.method5580(); // L: 7144
					if (var15.targetIndex == 65535) { // L: 7145
						var15.targetIndex = -1;
					}
				}

				if ((var5 & 32) != 0) { // L: 7147
					var15.overheadText = var1.readStringCp1252NullTerminated(); // L: 7148
					var15.overheadTextCyclesRemaining = 100; // L: 7149
				}

				if ((var5 & 1) != 0) { // L: 7151
					var15.definition = WorldMapIcon_0.getNpcDefinition(var1.method5580()); // L: 7152
					var15.field941 = var15.definition.size; // L: 7153
					var15.field940 = var15.definition.rotation; // L: 7154
					var15.walkSequence = var15.definition.walkSequence; // L: 7155
					var15.walkBackSequence = var15.definition.walkBackSequence; // L: 7156
					var15.walkLeftSequence = var15.definition.walkLeftSequence; // L: 7157
					var15.walkRightSequence = var15.definition.walkRightSequence; // L: 7158
					var15.idleSequence = var15.definition.idleSequence; // L: 7159
					var15.turnLeftSequence = var15.definition.turnLeftSequence; // L: 7160
					var15.turnRightSequence = var15.definition.turnRightSequence; // L: 7161
				}

				if ((var5 & 64) != 0) { // L: 7163
					var6 = var1.method5582(); // L: 7164
					if (var6 == 65535) { // L: 7165
						var6 = -1;
					}

					var7 = var1.readUnsignedByte(); // L: 7166
					if (var6 == var15.sequence && var6 != -1) { // L: 7167
						var8 = ParamDefinition.SequenceDefinition_get(var6).field3548; // L: 7168
						if (var8 == 1) { // L: 7169
							var15.sequenceFrame = 0; // L: 7170
							var15.sequenceFrameCycle = 0; // L: 7171
							var15.sequenceDelay = var7; // L: 7172
							var15.field974 = 0; // L: 7173
						}

						if (var8 == 2) { // L: 7175
							var15.field974 = 0; // L: 7176
						}
					} else if (var6 == -1 || var15.sequence == -1 || ParamDefinition.SequenceDefinition_get(var6).field3557 >= ParamDefinition.SequenceDefinition_get(var15.sequence).field3557) { // L: 7179
						var15.sequence = var6; // L: 7180
						var15.sequenceFrame = 0; // L: 7181
						var15.sequenceFrameCycle = 0; // L: 7182
						var15.sequenceDelay = var7; // L: 7183
						var15.field974 = 0; // L: 7184
						var15.field996 = var15.pathLength; // L: 7185
					}
				}

				if ((var5 & 4) != 0) { // L: 7189
					var6 = var1.method5571(); // L: 7190
					int var12;
					if (var6 > 0) { // L: 7191
						for (var7 = 0; var7 < var6; ++var7) { // L: 7192
							var9 = -1; // L: 7194
							var10 = -1; // L: 7195
							var11 = -1; // L: 7196
							var8 = var1.readUShortSmart(); // L: 7197
							if (var8 == 32767) { // L: 7198
								var8 = var1.readUShortSmart(); // L: 7199
								var10 = var1.readUShortSmart(); // L: 7200
								var9 = var1.readUShortSmart(); // L: 7201
								var11 = var1.readUShortSmart(); // L: 7202
							} else if (var8 != 32766) { // L: 7204
								var10 = var1.readUShortSmart(); // L: 7205
							} else {
								var8 = -1; // L: 7207
							}

							var12 = var1.readUShortSmart(); // L: 7208
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12); // L: 7209
						}
					}

					var7 = var1.readUnsignedByte(); // L: 7212
					if (var7 > 0) { // L: 7213
						for (var8 = 0; var8 < var7; ++var8) { // L: 7214
							var9 = var1.readUShortSmart(); // L: 7215
							var10 = var1.readUShortSmart(); // L: 7216
							if (var10 != 32767) { // L: 7217
								var11 = var1.readUShortSmart(); // L: 7218
								var12 = var1.method5572(); // L: 7219
								int var13 = var10 > 0 ? var1.method5572() : var12; // L: 7220
								var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13); // L: 7221
							} else {
								var15.removeHealthBar(var9); // L: 7223
							}
						}
					}
				}

				if ((var5 & 128) != 0) { // L: 7227
					var15.field981 = var1.method5645(); // L: 7228
					var15.field982 = var1.method5645(); // L: 7229
					var15.field958 = var1.method5645(); // L: 7230
					var15.field956 = var1.method5645(); // L: 7231
					var15.field984 = var1.readUnsignedShort() + Client.cycle; // L: 7232
					var15.field973 = var1.method5582() + Client.cycle; // L: 7233
					var15.field986 = var1.readUnsignedShort(); // L: 7234
					var15.pathLength = 1; // L: 7235
					var15.field996 = 0; // L: 7236
					var15.field981 += var15.pathX[0]; // L: 7237
					var15.field982 += var15.pathY[0]; // L: 7238
					var15.field958 += var15.pathX[0]; // L: 7239
					var15.field956 += var15.pathY[0]; // L: 7240
				}
			}

			for (var14 = 0; var14 < Client.field769; ++var14) { // L: 7244
				var3 = Client.field770[var14]; // L: 7245
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 7246
					Client.npcs[var3].definition = null; // L: 7247
					Client.npcs[var3] = null; // L: 7248
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7251
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var14 = 0; var14 < Client.npcCount; ++var14) { // L: 7252
					if (Client.npcs[Client.npcIndices[var14]] == null) { // L: 7253
						throw new RuntimeException(var14 + "," + Client.npcCount); // L: 7254
					}
				}

			}
		}
	} // L: 7257

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "43"
	)
	static final void method243(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 7324
			if (Client.showMouseOverText) { // L: 7325
				int var2 = WorldMapSprite.method463(); // L: 7326
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 7328
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 7329
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = ArchiveLoader.method1230(var2); // L: 7330
				}

				if (Client.menuOptionsCount > 2) { // L: 7331
					var3 = var3 + class23.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				GrandExchangeOfferTotalQuantityComparator.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 7332
			}
		}
	} // L: 7333

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-51"
	)
	static void method244(String var0) {
		WorldMapSection1.field317 = var0; // L: 11084

		try {
			String var1 = WorldMapIcon_0.client.getParameter(Integer.toString(18)); // L: 11086
			String var2 = WorldMapIcon_0.client.getParameter(Integer.toString(13)); // L: 11087
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 11088
			if (var0.length() == 0) { // L: 11089
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class3.method40(class298.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 11090
			}

			Client var4 = WorldMapIcon_0.client; // L: 11091
			String var5 = "document.cookie=\"" + var3 + "\""; // L: 11092
			JSObject.getWindow(var4).eval(var5); // L: 11095
		} catch (Throwable var6) { // L: 11098
		}

	} // L: 11099
}
