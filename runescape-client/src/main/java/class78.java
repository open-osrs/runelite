import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class78 {
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 603715761
	)
	static int field1000;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfj;",
		garbageValue = "-18"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfu;",
		garbageValue = "-1066482349"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 19
			var1 = new InvDefinition(); // L: 20
			if (var2 != null) { // L: 21
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "21"
	)
	public static int[] method2140() {
		int[] var0 = new int[KeyHandler.field140]; // L: 251

		for (int var1 = 0; var1 < KeyHandler.field140; ++var1) { // L: 252
			var0[var1] = KeyHandler.field139[var1]; // L: 253
		}

		return var0; // L: 255
	}
}
