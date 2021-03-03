import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1282105963
	)
	@Export("group")
	int group;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1339179059
	)
	@Export("type")
	int type;
	@ObfuscatedName("d")
	boolean field575;

	InterfaceParent() {
		this.field575 = false; // L: 8
	} // L: 10

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([Lgh;II)Lgh;",
		garbageValue = "1668419242"
	)
	@Export("findEnumerated")
	public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
		Enumerated[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			Enumerated var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljs;",
		garbageValue = "82"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 41
		if (var1 != null) { // L: 42
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 43
			var1 = new SequenceDefinition(); // L: 44
			if (var2 != null) { // L: 45
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 46
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 47
			return var1; // L: 48
		}
	}
}
