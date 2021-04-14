import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class105 {
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	public static class263 field1331;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -674832797
	)
	static int field1327;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lme;I)Lme;",
		garbageValue = "1158705779"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			int var4 = var2 - 1; // L: 21
			var4 |= var4 >>> 1; // L: 22
			var4 |= var4 >>> 2; // L: 23
			var4 |= var4 >>> 4; // L: 24
			var4 |= var4 >>> 8; // L: 25
			var4 |= var4 >>> 16; // L: 26
			var3 = var4 + 1; // L: 27
			var1 = new IterableNodeHashTable(var3); // L: 30
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 32
			boolean var7 = var0.readUnsignedByte() == 1; // L: 33
			int var5 = var0.readMedium(); // L: 34
			Object var6;
			if (var7) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 36
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 37
			}

			var1.put((Node)var6, (long)var5); // L: 38
		}

		return var1; // L: 40
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1281510950"
	)
	static void method2255() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11041
			int var1 = var0.group; // L: 11042
			if (class15.loadInterface(var1)) { // L: 11043
				boolean var2 = true; // L: 11044
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 11045

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11046
					if (var3[var4] != null) { // L: 11047
						var2 = var3[var4].isIf3; // L: 11048
						break;
					}
				}

				if (!var2) { // L: 11052
					var4 = (int)var0.key; // L: 11053
					Widget var5 = class139.getWidget(var4); // L: 11054
					if (var5 != null) { // L: 11055
						class29.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11059
}
