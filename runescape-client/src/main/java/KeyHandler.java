import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cd")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("co")
	public static boolean[] field46;
	@ObfuscatedName("cm")
	public static boolean[] field38;
	@ObfuscatedName("cy")
	public static int[] field48;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 563780521
	)
	public static int field49;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1125438521
	)
	public static int field50;
	@ObfuscatedName("cv")
	static char[] field51;
	@ObfuscatedName("cg")
	static int[] field54;
	@ObfuscatedName("cu")
	public static int[] field53;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 2026317619
	)
	public static int field35;
	@ObfuscatedName("cz")
	public static int[] field55;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1116786775
	)
	public static int field64;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -148325769
	)
	public static int field57;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 2143754103
	)
	public static int field52;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1631007479
	)
	public static int field59;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1607582359
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("df")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -2077496347
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = -1125858877
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field46 = new boolean[112];
		field38 = new boolean[112];
		field48 = new int[128];
		field49 = 0;
		field50 = 0;
		field51 = new char[128];
		field54 = new int[128];
		field53 = new int[128];
		field35 = 0;
		field55 = new int[128];
		field64 = 0;
		field57 = 0;
		field52 = 0;
		field59 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	KeyHandler() {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field50 = -1;
		}

	}

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (field50 >= 0 && var2 >= 0) {
				field48[field50] = var2;
				field50 = field50 + 1 & 127;
				if (field49 == field50) {
					field50 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field52 + 1 & 127;
				if (var3 != field57) {
					field54[field52] = var2;
					field51[field52] = 0;
					field52 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}

			if (field50 >= 0 && var2 >= 0) {
				field48[field50] = ~var2;
				field50 = field50 + 1 & 127;
				if (field50 == field49) {
					field50 = -1;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff' && WallDecoration.method4339(var2)) {
				int var3 = field52 + 1 & 127;
				if (var3 != field57) {
					field54[field52] = -1;
					field51[field52] = var2;
					field52 = var3;
				}
			}
		}

		var1.consume();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "1153605408"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SoundSystem.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!class144.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = PacketBuffer.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IILfg;Lfy;B)Z",
		garbageValue = "-127"
	)
	static final boolean method107(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class161.directions[var6][var7] = 99;
		class161.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class161.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class161.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var18 != var11) {
			var4 = class161.bufferX[var11];
			var5 = class161.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				SoundSystem.field219 = var4;
				class161.field1896 = var5;
				return true;
			}

			int var15 = class161.distances[var16][var17] + 1;
			if (var16 > 0 && class161.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class161.bufferX[var18] = var4 - 1;
				class161.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 - 1][var17] = 2;
				class161.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 126 && class161.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class161.bufferX[var18] = var4 + 1;
				class161.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 + 1][var17] = 8;
				class161.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class161.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class161.bufferX[var18] = var4;
				class161.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16][var17 - 1] = 1;
				class161.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 126 && class161.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class161.bufferX[var18] = var4;
				class161.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16][var17 + 1] = 4;
				class161.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class161.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class161.bufferX[var18] = var4 - 1;
				class161.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 - 1][var17 - 1] = 3;
				class161.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 126 && var17 > 0 && class161.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class161.bufferX[var18] = var4 + 1;
				class161.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 + 1][var17 - 1] = 9;
				class161.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 126 && class161.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class161.bufferX[var18] = var4 - 1;
				class161.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 - 1][var17 + 1] = 6;
				class161.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 126 && var17 < 126 && class161.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class161.bufferX[var18] = var4 + 1;
				class161.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 + 1][var17 + 1] = 12;
				class161.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		SoundSystem.field219 = var4;
		class161.field1896 = var5;
		return false;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-685939623"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class115.method2431();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-193289736"
	)
	static final String method83(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
