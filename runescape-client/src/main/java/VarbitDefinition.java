import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("VarbitDefinition")
public class VarbitDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("mapMarkerSprites")
	static Sprite[] mapMarkerSprites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -416955877
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -740697079
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -427959509
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarbitDefinition() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "2006870580"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 30
			if (var2 == 0) { // L: 31
				return; // L: 34
			}

			this.decodeNext(var1, var2); // L: 32
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "1701572620"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 37
			this.baseVar = var1.readUnsignedShort(); // L: 38
			this.startBit = var1.readUnsignedByte(); // L: 39
			this.endBit = var1.readUnsignedByte(); // L: 40
		}

	} // L: 43

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "1125902282"
	)
	public static void method4593(Applet var0, String var1) {
		class60.applet = var0; // L: 22
		if (var1 != null) { // L: 23
			class60.field451 = var1;
		}

	} // L: 24

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-852003243"
	)
	static int method4596(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}
}
