import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("ParamDefinition")
public class ParamDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("s")
	@Export("type")
	char type;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2056477959
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("i")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("o")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamDefinition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "964888854"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 31

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "2"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "-659243660"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			byte var4 = var1.readByte(); // L: 44
			int var5 = var4 & 255; // L: 46
			if (var5 == 0) { // L: 47
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 48
				char var6 = class297.cp1252AsciiExtension[var5 - 128]; // L: 49
				if (var6 == 0) { // L: 50
					var6 = '?';
				}

				var5 = var6; // L: 51
			}

			char var3 = (char)var5; // L: 53
			this.type = var3; // L: 55
		} else if (var2 == 2) { // L: 57
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 58
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 59
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 61

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "937250031"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 64
	}
}
