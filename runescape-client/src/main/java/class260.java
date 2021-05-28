import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class260 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1644040669
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;

	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Leq;",
		garbageValue = "-1090210304"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 84
		if (var1 != null) { // L: 85
			return var1;
		} else {
			byte[] var2 = class341.ItemDefinition_archive.takeFile(10, var0); // L: 86
			var1 = new ItemComposition(); // L: 87
			var1.id = var0; // L: 88
			if (var2 != null) { // L: 89
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 90
			if (var1.noteTemplate != -1) { // L: 91
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 92
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 93
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemContainer.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 94
				var1.name = "Members object"; // L: 95
				var1.isTradable = false; // L: 96
				var1.groundActions = null; // L: 97
				var1.inventoryActions = null; // L: 98
				var1.shiftClickIndex = -1; // L: 99
				var1.team = 0; // L: 100
				if (var1.params != null) { // L: 101
					boolean var3 = false; // L: 102

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 103
						ParamComposition var5 = Varcs.getParamDefinition((int)var4.key); // L: 104
						if (var5.autoDisable) { // L: 105
							var4.remove();
						} else {
							var3 = true; // L: 106
						}
					}

					if (!var3) { // L: 108
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 111
			return var1; // L: 112
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-60"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1525
		Login.Login_response2 = var1; // L: 1526
		Login.Login_response3 = var2; // L: 1527
	} // L: 1528
}
