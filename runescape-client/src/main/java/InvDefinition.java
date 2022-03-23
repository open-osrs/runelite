import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	static IndexedSprite field1814;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 502676217
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-119"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpd;IB)V",
		garbageValue = "3"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "302508640"
	)
	static final int method3334(int var0, int var1) {
		if (var0 == -2) { // L: 1021
			return 12345678;
		} else if (var0 == -1) { // L: 1022
			if (var1 < 2) { // L: 1023
				var1 = 2;
			} else if (var1 > 126) { // L: 1024
				var1 = 126;
			}

			return var1; // L: 1025
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1027
			if (var1 < 2) { // L: 1028
				var1 = 2;
			} else if (var1 > 126) { // L: 1029
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1030
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lkn;S)Ljava/lang/String;",
		garbageValue = "13721"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var0)) == 0) { // L: 11807
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11808 11809 11811
		}
	}
}
