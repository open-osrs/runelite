import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bu")
	public static String field3295;
	@ObfuscatedName("cl")
	public static String field3334;
	@ObfuscatedName("jj")
	public static String field3439;
	@ObfuscatedName("jg")
	public static String field3503;
	@ObfuscatedName("ji")
	public static String field3512;

	static {
		field3295 = "Please visit the support page for assistance."; // L: 60
		field3334 = "Please visit the support page for assistance.";
		field3439 = ""; // L: 275
		field3503 = "Page has opened in a new window."; // L: 276
		field3512 = "(Please check your popup blocker.)"; // L: 277
	} // L: 307

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lez;",
		garbageValue = "1535423962"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 92
		if (var1 != null) { // L: 93
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0); // L: 94
			var1 = new ItemComposition(); // L: 95
			var1.id = var0; // L: 96
			if (var2 != null) { // L: 97
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 98
			if (var1.noteTemplate != -1) { // L: 99
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 100
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 101
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!BufferedNetSocket.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 102
				var1.name = "Members object"; // L: 103
				var1.isTradable = false; // L: 104
				var1.groundActions = null; // L: 105
				var1.inventoryActions = null; // L: 106
				var1.shiftClickIndex = -1; // L: 107
				var1.team = 0; // L: 108
				if (var1.params != null) { // L: 109
					boolean var3 = false; // L: 110

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 111
						ParamComposition var5 = WorldMapElement.getParamDefinition((int)var4.key); // L: 112
						if (var5.autoDisable) { // L: 113
							var4.remove();
						} else {
							var3 = true; // L: 114
						}
					}

					if (!var3) { // L: 116
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 119
			return var1; // L: 120
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1449127026"
	)
	static final void method4801(int var0, int var1, int var2, boolean var3) {
		if (UserComparator8.loadInterface(var0)) { // L: 10051
			Login.resizeInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 10052
		}
	} // L: 10053
}
