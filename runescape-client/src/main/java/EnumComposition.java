import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("d")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("c")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("y")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 977907101
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1947625869
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("e")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("q")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("l")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "1374661087"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.decodeNext(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IB)V",
		garbageValue = "112"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 44
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 45
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 46
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 47
				this.outputCount = var1.readUnsignedShort(); // L: 48
				this.keys = new int[this.outputCount]; // L: 49
				this.strVals = new String[this.outputCount]; // L: 50

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 51
					this.keys[var3] = var1.readInt(); // L: 52
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 53
				}
			} else if (var2 == 6) { // L: 56
				this.outputCount = var1.readUnsignedShort(); // L: 57
				this.keys = new int[this.outputCount]; // L: 58
				this.intVals = new int[this.outputCount]; // L: 59

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 60
					this.keys[var3] = var1.readInt(); // L: 61
					this.intVals[var3] = var1.readInt(); // L: 62
				}
			}
		}

	} // L: 66

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2129947174"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 69
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CLgp;B)I",
		garbageValue = "40"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}
}
