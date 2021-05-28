import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ao")
public class class43 {
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcf;",
		garbageValue = "-16"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 45
		Script var5;
		if (var6 != null) { // L: 46
			var5 = var6; // L: 47
		} else {
			String var7 = String.valueOf(var3);
			int var8 = UserComparator5.archive12.getGroupId(var7);
			if (var8 == -1) {
				var5 = null;
			} else {
				label59: {
					byte[] var9 = UserComparator5.archive12.takeFileFlat(var8); // L: 56
					if (var9 != null) { // L: 57
						if (var9.length <= 1) { // L: 58
							var5 = null; // L: 59
							break label59; // L: 60
						}

						var6 = UserList.newScript(var9); // L: 62
						if (var6 != null) { // L: 63
							Script.Script_cached.put(var6, (long)(var3 << 16)); // L: 64
							var5 = var6; // L: 65
							break label59; // L: 66
						}
					}

					var5 = null; // L: 69
				}
			}
		}

		if (var5 != null) { // L: 72
			return var5; // L: 73
		} else {
			int var13 = (-3 - var2 << 8) + var0; // L: 77
			Script var15 = (Script)Script.Script_cached.get((long)(var13 << 16)); // L: 82
			Script var14;
			if (var15 != null) { // L: 83
				var14 = var15; // L: 84
			} else {
				String var10 = String.valueOf(var13); // L: 87
				int var11 = UserComparator5.archive12.getGroupId(var10); // L: 88
				if (var11 == -1) { // L: 89
					var14 = null; // L: 90
				} else {
					byte[] var12 = UserComparator5.archive12.takeFileFlat(var11); // L: 93
					if (var12 != null) { // L: 94
						if (var12.length <= 1) { // L: 95
							var14 = null; // L: 96
							return var14 != null ? var14 : null; // L: 109 112
						}

						var15 = UserList.newScript(var12); // L: 99
						if (var15 != null) { // L: 100
							Script.Script_cached.put(var15, (long)(var13 << 16)); // L: 101
							var14 = var15; // L: 102
							return var14 != null ? var14 : null;
						}
					}

					var14 = null; // L: 106
				}
			}

			return var14 != null ? var14 : null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "100"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 141
		int var4 = 0; // L: 142

		for (int var5 = 0; var5 < var2; ++var5) { // L: 143
			int var6 = var0[var5 + var1] & 255; // L: 144
			if (var6 != 0) { // L: 145
				if (var6 >= 128 && var6 < 160) {
					char var7 = class301.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1726965771"
	)
	static void method437() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1427864151"
	)
	static int method435(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 794
			var0 -= 1000; // L: 795
			var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 796
		} else {
			var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 798
		}

		WorldMapCacheName.invalidateWidget(var3); // L: 799
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 800
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 820
				var3.modelType = 2; // L: 821
				var3.modelId = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 822
				return 1; // L: 823
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 825
				var3.modelType = 3; // L: 826
				var3.modelId = class93.localPlayer.appearance.getChatHeadId(); // L: 827
				return 1; // L: 828
			} else {
				return 2; // L: 830
			}
		} else {
			class44.Interpreter_intStackSize -= 2; // L: 801
			int var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 802
			int var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 803
			var3.itemId = var4; // L: 804
			var3.itemQuantity = var5; // L: 805
			ItemComposition var6 = class260.ItemDefinition_get(var4); // L: 806
			var3.modelAngleX = var6.xan2d; // L: 807
			var3.modelAngleY = var6.yan2d; // L: 808
			var3.modelAngleZ = var6.zan2d; // L: 809
			var3.modelOffsetX = var6.offsetX2d; // L: 810
			var3.modelOffsetY = var6.offsetY2d; // L: 811
			var3.modelZoom = var6.zoom2d; // L: 812
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 813
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 814
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 815
			}

			if (var3.field3013 > 0) { // L: 816
				var3.modelZoom = var3.modelZoom * 32 / var3.field3013;
			} else if (var3.rawWidth > 0) { // L: 817
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 818
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1591980574"
	)
	public static String method433(String var0) {
		int var1 = var0.length(); // L: 146
		char[] var2 = new char[var1]; // L: 147
		byte var3 = 2; // L: 148

		for (int var4 = 0; var4 < var1; ++var4) { // L: 149
			char var5 = var0.charAt(var4); // L: 150
			if (var3 == 0) { // L: 151
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 152
				var5 = Username.method5877(var5);
			}

			if (Character.isLetter(var5)) { // L: 153
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 154
				if (Character.isSpaceChar(var5)) { // L: 155
					if (var3 != 2) { // L: 156
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 158
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 159
		}

		return new String(var2); // L: 161
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "323"
	)
	static int method436(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 3511
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-56748890"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 600
		if (class124.garbageCollector == null || !class124.garbageCollector.isValid()) { // L: 601
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 603

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 604
					if (var2.isValid()) { // L: 606
						class124.garbageCollector = var2; // L: 607
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 608
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 609
					}
				}
			} catch (Throwable var11) { // L: 614
			}
		}

		if (class124.garbageCollector != null) { // L: 616
			long var9 = ObjectComposition.currentTimeMillis(); // L: 617
			long var3 = class124.garbageCollector.getCollectionTime(); // L: 618
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 619
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 620
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 621
				if (0L != var7) { // L: 622
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 624
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 625
		}

		return var0; // L: 627
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1248092260"
	)
	static int method440() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1498
			int var0 = 0; // L: 1499

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1500
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1501
			}

			return var0 * 10000 / Client.field916; // L: 1503
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lcu;ZI)V",
		garbageValue = "-2095467414"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11061
		int var3 = (int)var0.key; // L: 11062
		var0.remove(); // L: 11063
		if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) { // L: 11064 11065 11066
			HealthBarUpdate.Widget_archive.clearFilesGroup(var2); // L: 11067
			if (Widget.Widget_interfaceComponents[var2] != null) { // L: 11068
				boolean var4 = true; // L: 11069

				for (int var5 = 0; var5 < Widget.Widget_interfaceComponents[var2].length; ++var5) { // L: 11070
					if (Widget.Widget_interfaceComponents[var2][var5] != null) { // L: 11071
						if (Widget.Widget_interfaceComponents[var2][var5].type != 2) { // L: 11072
							Widget.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false; // L: 11073
						}
					}
				}

				if (var4) { // L: 11076
					Widget.Widget_interfaceComponents[var2] = null;
				}

				Widget.Widget_loadedInterfaces[var2] = false; // L: 11077
			}
		}

		for (IntegerNode var6 = (IntegerNode)Client.widgetFlags.first(); var6 != null; var6 = (IntegerNode)Client.widgetFlags.next()) { // L: 11080
			if ((var6.key >> 48 & 65535L) == (long)var2) { // L: 11081
				var6.remove(); // L: 11082
			}
		}

		Widget var7 = Frames.getWidget(var3); // L: 11086
		if (var7 != null) { // L: 11087
			WorldMapCacheName.invalidateWidget(var7);
		}

		class7.method68(); // L: 11088
		if (Client.rootInterface != -1) { // L: 11089
			Login.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11090
}
