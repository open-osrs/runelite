import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ac")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 285974329
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 998722377
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -226026385
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2108441199
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -351352557
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 754636665
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1785019245
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1849711777
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("q")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("l")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("s")
	byte[][][] field193;
	@ObfuscatedName("b")
	byte[][][] field204;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[[[[Lax;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("w")
	boolean field203;
	@ObfuscatedName("k")
	boolean field207;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field203 = false; // L: 26
		this.field207 = false; // L: 27
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "36"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "16711935"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field203 && this.field207; // L: 32
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lig;B)V",
		garbageValue = "116"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field203 = true;
				this.field207 = true;
			}

		}
	} // L: 43

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field193 = null;
		this.field204 = null;
		this.decorations = null;
		this.field203 = false; // L: 51
		this.field207 = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IILkx;I)V",
		garbageValue = "-1493570847"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method327(var1, var2, var3, var4);
			} else {
				this.method328(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IILkx;IB)V",
		garbageValue = "20"
	)
	void method327(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILkx;II)V",
		garbageValue = "78729378"
	)
	void method328(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field193[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field204[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method5833(); // L: 101
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-75109979"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2014407853"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1967773856"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		PlatformInfo.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1751033687"
	)
	public static int method342() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)V",
		garbageValue = "352611015"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class105.reflectionChecks.last(); // L: 35
		if (var1 != null) { // L: 36
			int var2 = var0.offset; // L: 37
			var0.writeInt(var1.id); // L: 38

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 39
				if (var1.creationErrors[var3] != 0) { // L: 40
					var0.writeByte(var1.creationErrors[var3]); // L: 41
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 45
						Field var5;
						int var6;
						if (var4 == 0) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							var6 = Reflection.getInt(var5, (Object)null); // L: 48
							var0.writeByte(0); // L: 49
							var0.writeInt(var6); // L: 50
						} else if (var4 == 1) { // L: 52
							var5 = var1.fields[var3]; // L: 53
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 54
							var0.writeByte(0); // L: 55
						} else if (var4 == 2) { // L: 57
							var5 = var1.fields[var3]; // L: 58
							var6 = var5.getModifiers(); // L: 59
							var0.writeByte(0); // L: 60
							var0.writeInt(var6); // L: 61
						}

						Method var25;
						if (var4 != 3) { // L: 63
							if (var4 == 4) { // L: 83
								var25 = var1.methods[var3]; // L: 84
								var6 = var25.getModifiers(); // L: 85
								var0.writeByte(0); // L: 86
								var0.writeInt(var6); // L: 87
							}
						} else {
							var25 = var1.methods[var3]; // L: 64
							byte[][] var10 = var1.arguments[var3]; // L: 65
							Object[] var7 = new Object[var10.length]; // L: 66

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 67
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 68
								var7[var8] = var9.readObject(); // L: 69
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 71
							if (var11 == null) { // L: 72
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 73
								var0.writeByte(1); // L: 74
								var0.writeLong(((Number)var11).longValue()); // L: 75
							} else if (var11 instanceof String) { // L: 77
								var0.writeByte(2); // L: 78
								var0.writeStringCp1252NullTerminated((String)var11); // L: 79
							} else {
								var0.writeByte(4); // L: 81
							}
						}
					} catch (ClassNotFoundException var13) { // L: 90
						var0.writeByte(-10); // L: 91
					} catch (InvalidClassException var14) { // L: 93
						var0.writeByte(-11); // L: 94
					} catch (StreamCorruptedException var15) { // L: 96
						var0.writeByte(-12); // L: 97
					} catch (OptionalDataException var16) { // L: 99
						var0.writeByte(-13); // L: 100
					} catch (IllegalAccessException var17) { // L: 102
						var0.writeByte(-14); // L: 103
					} catch (IllegalArgumentException var18) { // L: 105
						var0.writeByte(-15); // L: 106
					} catch (InvocationTargetException var19) { // L: 108
						var0.writeByte(-16); // L: 109
					} catch (SecurityException var20) { // L: 111
						var0.writeByte(-17); // L: 112
					} catch (IOException var21) { // L: 114
						var0.writeByte(-18); // L: 115
					} catch (NullPointerException var22) { // L: 117
						var0.writeByte(-19); // L: 118
					} catch (Exception var23) { // L: 120
						var0.writeByte(-20); // L: 121
					} catch (Throwable var24) { // L: 123
						var0.writeByte(-21); // L: 124
					}
				}
			}

			var0.writeCrc(var2); // L: 127
			var1.remove(); // L: 128
		}
	} // L: 129

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "1250443961"
	)
	static int method350(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 775
		Widget var4;
		if (var0 >= 2000) { // L: 777
			var0 -= 1000; // L: 778
			var4 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 779
			var3 = false; // L: 780
		} else {
			var4 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 782
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 783
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 784
			if (var11 >= 0 && var11 <= 9) { // L: 785
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 789
				return 1; // L: 790
			} else {
				--Interpreter.Interpreter_stringStackSize; // L: 786
				return 1; // L: 787
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 792
				Interpreter.Interpreter_intStackSize -= 2; // L: 793
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 794
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 795
				var4.parent = ArchiveLoader.getWidgetChild(var11, var6); // L: 796
				return 1; // L: 797
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 799
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 800
				return 1; // L: 801
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 803
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 804
				return 1; // L: 805
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 807
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 808
				return 1; // L: 809
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 811
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 812
				return 1; // L: 813
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 815
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 816
				return 1; // L: 817
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 819
				var4.actions = null; // L: 820
				return 1; // L: 821
			} else if (var0 == 1308) { // L: 823
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 824
				return 1; // L: 825
			} else if (var0 == 1309) { // L: 827
				--Interpreter.Interpreter_intStackSize; // L: 828
				return 1; // L: 829
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 831
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 861
						Interpreter.Interpreter_intStackSize -= 2; // L: 862
						var5 = 10; // L: 863
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 864
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 865
						TaskHandler.Widget_setKey(var4, var5, var8, var9); // L: 866
						return 1; // L: 867
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 869
						Interpreter.Interpreter_intStackSize -= 3; // L: 870
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 871
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 872
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 873
						if (var11 >= 0 && var11 <= 9) { // L: 874
							WorldMapRegion.Widget_setKeyRate(var4, var11, var6, var7); // L: 877
							return 1; // L: 878
						} else {
							throw new RuntimeException(); // L: 875
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 880
						var5 = 10; // L: 881
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 882
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 883
						WorldMapRegion.Widget_setKeyRate(var4, var5, var6, var7); // L: 884
						return 1; // L: 885
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 887
						--Interpreter.Interpreter_intStackSize; // L: 888
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 889
						if (var11 >= 0 && var11 <= 9) { // L: 890
							WorldMapIcon_0.Widget_setKeyIgnoreHeld(var4, var11); // L: 893
							return 1; // L: 894
						} else {
							throw new RuntimeException(); // L: 891
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 896
						var5 = 10; // L: 897
						WorldMapIcon_0.Widget_setKeyIgnoreHeld(var4, var5); // L: 898
						return 1; // L: 899
					} else {
						return 2; // L: 901
					}
				} else {
					byte[] var10 = null; // L: 832
					var8 = null; // L: 833
					if (var3) { // L: 834
						Interpreter.Interpreter_intStackSize -= 10; // L: 835

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 837 838
						}

						if (var7 > 0) { // L: 840
							var10 = new byte[var7 / 2]; // L: 841
							var8 = new byte[var7 / 2]; // L: 842

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 843
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 844
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 845
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 850
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 851
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 852
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 854
					if (var7 >= 0 && var7 <= 9) { // L: 855
						TaskHandler.Widget_setKey(var4, var7, var10, var8); // L: 858
						return 1; // L: 859
					} else {
						throw new RuntimeException(); // L: 856
					}
				}
			}
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1407692443"
	)
	static void method352() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) { // L: 9015
			if (AbstractWorldMapIcon.method685(Client.menuOpcodes[var0])) { // L: 9016
				if (var0 < Client.menuOptionsCount - 1) { // L: 9017
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 9018
						Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 9019
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 9020
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 9021
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 9022
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 9023
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 9024
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 9025
					}
				}

				--var0; // L: 9028
				--Client.menuOptionsCount; // L: 9029
			}
		}

		class41.method650(); // L: 9032
	} // L: 9033
}
