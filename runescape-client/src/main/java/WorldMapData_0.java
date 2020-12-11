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
		intValue = 2110783872
	)
	static int field112;
	@ObfuscatedName("ei")
	@Export("secureRandom")
	static SecureRandom secureRandom;

	WorldMapData_0() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-804003183"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field292.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 64;
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.method5559();
			super.fileId = var1.method5559();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1878970684"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field178 = new byte[super.planes][64][64];
		super.field177 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class39.field278.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
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
					if (var0 == var3) {
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
		ReflectionCheck var1 = (ReflectionCheck)class105.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-806912444"
	)
	public static void method237() {
		try {
			File var0 = new File(TileItemPile.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label37:
				for (int var1 = 0; var1 < DynamicObject.field1318.length; ++var1) {
					for (var2 = 0; var2 < GraphicsObject.field1117.length; ++var2) {
						File var3 = new File(GraphicsObject.field1117[var2] + DynamicObject.field1318[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label37;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "2012352771"
	)
	static int method245(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			VarcInt.Interpreter_intStackSize -= 3;
			class232.queueSoundEffect(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize], Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			playSong(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			VarcInt.Interpreter_intStackSize -= 2;
			LoginPacket.method3672(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize], Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			if (var0 == 3203) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize], 0), 100);
				WorldMapEvent.method810(Math.round((float)var3 * 2.55F));
				return 1;
			} else if (var0 == 3204) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Math.round((float)Timer.clientPreferences.musicVolume / 2.55F);
				return 1;
			} else if (var0 == 3205) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize], 0), 100);
				WorldMapCacheName.method662(Math.round((float)var3 * 1.27F));
				return 1;
			} else if (var0 == 3206) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Math.round((float)Timer.clientPreferences.soundEffectsVolume / 1.27F);
				return 1;
			} else if (var0 == 3207) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize], 0), 100);
				class194.method3676(Math.round(1.27F * (float)var3));
				return 1;
			} else if (var0 == 3208) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Math.round((float)Timer.clientPreferences.areaSoundEffectsVolume / 1.27F);
				return 1;
			} else {
				return 2;
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
		if (var0 == -1 && !Client.field883) {
			WorldMapRegion.method588();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Timer.clientPreferences.musicVolume != 0 && !Client.field883) {
			SecureRandomCallable.method1221(2, class217.archive6, var0, 0, Timer.clientPreferences.musicVolume, false);
		}

		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(ZLky;I)V",
		garbageValue = "-1863896009"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field769 = 0;
		Client.field826 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field770[++Client.field769 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = Client.npcIndices[var4];
				NPC var16 = Client.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var16.npcCycle = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						Client.field654[++Client.field826 - 1] = var5;
					} else if (var8 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						var9 = var2.readBits(3);
						var16.method2102(var9, (byte)1);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.field654[++Client.field826 - 1] = var5;
						}
					} else if (var8 == 2) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						var9 = var2.readBits(3);
						var16.method2102(var9, (byte)2);
						var10 = var2.readBits(3);
						var16.method2102(var10, (byte)2);
						var11 = var2.readBits(1);
						if (var11 == 1) {
							Client.field654[++Client.field826 - 1] = var5;
						}
					} else if (var8 == 3) {
						Client.field770[++Client.field769 - 1] = var5;
					}
				}
			}

			ModeWhere.method3714(var0, var1);

			int var14;
			for (var14 = 0; var14 < Client.field826; ++var14) {
				var3 = Client.field654[var14];
				NPC var15 = Client.npcs[var3];
				var5 = var1.readUnsignedByte();
				int var6;
				if ((var5 & 8) != 0) {
					var15.spotAnimation = var1.method5539();
					var6 = var1.readInt();
					var15.field979 = var6 >> 16;
					var15.field978 = (var6 & 65535) + Client.cycle;
					var15.spotAnimationFrame = 0;
					var15.spotAnimationFrameCycle = 0;
					if (var15.field978 > Client.cycle) {
						var15.spotAnimationFrame = -1;
					}

					if (var15.spotAnimation == 65535) {
						var15.spotAnimation = -1;
					}
				}

				if ((var5 & 2) != 0) {
					var6 = var1.method5582();
					var7 = var1.method5539();
					var8 = var15.x - (var6 - NetFileRequest.baseX * 64 - NetFileRequest.baseX * 64) * 64;
					var9 = var15.y - (var7 - class41.baseY * 64 - class41.baseY * 64) * 64;
					if (var8 != 0 || var9 != 0) {
						var15.field959 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
					}
				}

				if ((var5 & 16) != 0) {
					var15.targetIndex = var1.method5580();
					if (var15.targetIndex == 65535) {
						var15.targetIndex = -1;
					}
				}

				if ((var5 & 32) != 0) {
					var15.overheadText = var1.readStringCp1252NullTerminated();
					var15.overheadTextCyclesRemaining = 100;
				}

				if ((var5 & 1) != 0) {
					var15.definition = WorldMapIcon_0.getNpcDefinition(var1.method5580());
					var15.field941 = var15.definition.size * 64;
					var15.field940 = var15.definition.rotation;
					var15.walkSequence = var15.definition.walkSequence;
					var15.walkBackSequence = var15.definition.walkBackSequence;
					var15.walkLeftSequence = var15.definition.walkLeftSequence;
					var15.walkRightSequence = var15.definition.walkRightSequence;
					var15.idleSequence = var15.definition.idleSequence;
					var15.turnLeftSequence = var15.definition.turnLeftSequence;
					var15.turnRightSequence = var15.definition.turnRightSequence;
				}

				if ((var5 & 64) != 0) {
					var6 = var1.method5582();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var1.readUnsignedByte();
					if (var6 == var15.sequence && var6 != -1) {
						var8 = ParamDefinition.SequenceDefinition_get(var6).field3548;
						if (var8 == 1) {
							var15.sequenceFrame = 0;
							var15.sequenceFrameCycle = 0;
							var15.sequenceDelay = var7;
							var15.field974 = 0;
						}

						if (var8 == 2) {
							var15.field974 = 0;
						}
					} else if (var6 == -1 || var15.sequence == -1 || ParamDefinition.SequenceDefinition_get(var6).field3557 >= ParamDefinition.SequenceDefinition_get(var15.sequence).field3557) {
						var15.sequence = var6;
						var15.sequenceFrame = 0;
						var15.sequenceFrameCycle = 0;
						var15.sequenceDelay = var7;
						var15.field974 = 0;
						var15.field996 = var15.pathLength;
					}
				}

				if ((var5 & 4) != 0) {
					var6 = var1.method5571();
					int var12;
					if (var6 > 0) {
						for (var7 = 0; var7 < var6; ++var7) {
							var9 = -1;
							var10 = -1;
							var11 = -1;
							var8 = var1.readUShortSmart();
							if (var8 == 32767) {
								var8 = var1.readUShortSmart();
								var10 = var1.readUShortSmart();
								var9 = var1.readUShortSmart();
								var11 = var1.readUShortSmart();
							} else if (var8 != 32766) {
								var10 = var1.readUShortSmart();
							} else {
								var8 = -1;
							}

							var12 = var1.readUShortSmart();
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
						}
					}

					var7 = var1.readUnsignedByte();
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							if (var10 != 32767) {
								var11 = var1.readUShortSmart();
								var12 = var1.method5572();
								int var13 = var10 > 0 ? var1.method5572() : var12;
								var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
							} else {
								var15.removeHealthBar(var9);
							}
						}
					}
				}

				if ((var5 & 128) != 0) {
					var15.field981 = var1.method5645();
					var15.field982 = var1.method5645();
					var15.field958 = var1.method5645();
					var15.field956 = var1.method5645();
					var15.field984 = var1.readUnsignedShort() + Client.cycle;
					var15.field973 = var1.method5582() + Client.cycle;
					var15.field986 = var1.readUnsignedShort();
					var15.pathLength = 1;
					var15.field996 = 0;
					var15.field981 += var15.pathX[0];
					var15.field982 += var15.pathY[0];
					var15.field958 += var15.pathX[0];
					var15.field956 += var15.pathY[0];
				}
			}

			for (var14 = 0; var14 < Client.field769; ++var14) {
				var3 = Client.field770[var14];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var14 = 0; var14 < Client.npcCount; ++var14) {
					if (Client.npcs[Client.npcIndices[var14]] == null) {
						throw new RuntimeException(var14 + "," + Client.npcCount);
					}
				}

			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "43"
	)
	static final void method243(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = WorldMapSprite.method463();
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = ArchiveLoader.method1230(var2);
				}

				if (Client.menuOptionsCount > 2) {
					var3 = var3 + class23.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				GrandExchangeOfferTotalQuantityComparator.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-51"
	)
	static void method244(String var0) {
		WorldMapSection1.field317 = var0;

		try {
			String var1 = WorldMapIcon_0.client.getParameter(Integer.toString(18));
			String var2 = WorldMapIcon_0.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class3.method40(class298.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			Client var4 = WorldMapIcon_0.client;
			String var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var4).eval(var5);
		} catch (Throwable var6) {
		}

	}
}
