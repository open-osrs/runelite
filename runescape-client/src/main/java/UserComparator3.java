import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dg")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnf;Lnf;B)I",
		garbageValue = "-94"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgs;",
		garbageValue = "127"
	)
	public static HitSplatDefinition method2602(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "105"
	)
	static int method2607(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 858
		Widget var4;
		if (var0 >= 2000) { // L: 860
			var0 -= 1000; // L: 861
			var4 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 862
			var3 = false; // L: 863
		} else {
			var4 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 865
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 866
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 867
			if (var11 >= 0 && var11 <= 9) { // L: 868
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]); // L: 872
				return 1; // L: 873
			} else {
				--class122.Interpreter_stringStackSize; // L: 869
				return 1; // L: 870
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 875
				Interpreter.Interpreter_intStackSize -= 2; // L: 876
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 877
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 878
				var4.parent = ItemComposition.getWidgetChild(var11, var6); // L: 879
				return 1; // L: 880
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 882
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 883
				return 1; // L: 884
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 886
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 887
				return 1; // L: 888
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 890
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 891
				return 1; // L: 892
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 894
				var4.dataText = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 895
				return 1; // L: 896
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 898
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 899
				return 1; // L: 900
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 902
				var4.actions = null; // L: 903
				return 1; // L: 904
			} else if (var0 == 1308) { // L: 906
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 907
				return 1; // L: 908
			} else if (var0 == 1309) { // L: 910
				--Interpreter.Interpreter_intStackSize; // L: 911
				return 1; // L: 912
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 914
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 944
						Interpreter.Interpreter_intStackSize -= 2; // L: 945
						var5 = 10; // L: 946
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 947
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 948
						ArchiveDiskActionHandler.Widget_setKey(var4, var5, var8, var9); // L: 949
						return 1; // L: 950
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 952
						Interpreter.Interpreter_intStackSize -= 3; // L: 953
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 954
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 955
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 956
						if (var11 >= 0 && var11 <= 9) { // L: 957
							EnumComposition.Widget_setKeyRate(var4, var11, var6, var7); // L: 960
							return 1; // L: 961
						} else {
							throw new RuntimeException(); // L: 958
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 963
						var5 = 10; // L: 964
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 965
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 966
						EnumComposition.Widget_setKeyRate(var4, var5, var6, var7); // L: 967
						return 1; // L: 968
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 970
						--Interpreter.Interpreter_intStackSize; // L: 971
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 972
						if (var11 >= 0 && var11 <= 9) { // L: 973
							class67.Widget_setKeyIgnoreHeld(var4, var11); // L: 976
							return 1; // L: 977
						} else {
							throw new RuntimeException(); // L: 974
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 979
						var5 = 10; // L: 980
						class67.Widget_setKeyIgnoreHeld(var4, var5); // L: 981
						return 1; // L: 982
					} else {
						return 2; // L: 984
					}
				} else {
					byte[] var10 = null; // L: 915
					var8 = null; // L: 916
					if (var3) { // L: 917
						Interpreter.Interpreter_intStackSize -= 10; // L: 918

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 920 921
						}

						if (var7 > 0) { // L: 923
							var10 = new byte[var7 / 2]; // L: 924
							var8 = new byte[var7 / 2]; // L: 925

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 926
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 927
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 928
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 933
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 934
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 935
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 937
					if (var7 >= 0 && var7 <= 9) { // L: 938
						ArchiveDiskActionHandler.Widget_setKey(var4, var7, var10, var8); // L: 941
						return 1; // L: 942
					} else {
						throw new RuntimeException(); // L: 939
					}
				}
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "485258649"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class18.Client_plane][var0][var1]; // L: 8007
		if (var2 == null) { // L: 8008
			ArchiveLoader.scene.removeGroundItemPile(class18.Client_plane, var0, var1); // L: 8009
		} else {
			long var3 = -99999999L; // L: 8012
			TileItem var5 = null; // L: 8013

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8014 8015 8023
				ItemComposition var7 = class19.ItemDefinition_get(var6.id); // L: 8016
				long var11 = (long)var7.price; // L: 8017
				if (var7.isStackable == 1) { // L: 8018
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 8019
					var3 = var11; // L: 8020
					var5 = var6; // L: 8021
				}
			}

			if (var5 == null) { // L: 8025
				ArchiveLoader.scene.removeGroundItemPile(class18.Client_plane, var0, var1); // L: 8026
			} else {
				var2.addLast(var5); // L: 8029
				TileItem var13 = null; // L: 8030
				TileItem var8 = null; // L: 8031

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8032 8033 8038
					if (var5.id != var6.id) { // L: 8034
						if (var13 == null) { // L: 8035
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 8036
							var8 = var6;
						}
					}
				}

				long var9 = GameObject.calculateTag(var0, var1, 3, false, 0); // L: 8040
				ArchiveLoader.scene.newGroundItemPile(class18.Client_plane, var0, var1, WorldMapLabel.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class18.Client_plane), var5, var9, var13, var8); // L: 8041
			}
		}
	} // L: 8010 8027 8042
}
