import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class281 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljj;",
		garbageValue = "-723955175"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 84
		if (var1 != null) { // L: 85
			return var1;
		} else {
			byte[] var2 = class299.ItemDefinition_archive.takeFile(10, var0); // L: 86
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

			if (!Bounds.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 94
				var1.name = "Members object"; // L: 95
				var1.isTradable = false; // L: 96
				var1.groundActions = null; // L: 97
				var1.inventoryActions = null; // L: 98
				var1.shiftClickIndex = -1; // L: 99
				var1.team = 0; // L: 100
				if (var1.params != null) { // L: 101
					boolean var3 = false; // L: 102

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 103
						ParamComposition var5 = AbstractArchive.getParamDefinition((int)var4.key); // L: 104
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-610394630"
	)
	public static final boolean method5194(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 16
	}
}
