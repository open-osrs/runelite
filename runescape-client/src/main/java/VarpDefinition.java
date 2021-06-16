import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1436014737
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-383467418"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 == 0) { // L: 35
				return; // L: 38
			}

			this.decodeNext(var1, var2); // L: 36
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "8"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lcn;",
		garbageValue = "1169872264"
	)
	static ClientPreferences method2715() {
		AccessFile var0 = null; // L: 95
		ClientPreferences var1 = new ClientPreferences(); // L: 96

		try {
			var0 = class262.getPreferencesFile("", class182.field2114.name, false); // L: 98
			byte[] var2 = new byte[(int)var0.length()]; // L: 99

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 100 101 104
				var4 = var0.read(var2, var3, var2.length - var3); // L: 102
				if (var4 == -1) {
					throw new IOException(); // L: 103
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 106
		} catch (Exception var6) { // L: 108
		}

		try {
			if (var0 != null) { // L: 110
				var0.close();
			}
		} catch (Exception var5) { // L: 112
		}

		return var1; // L: 113
	}
}
