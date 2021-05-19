import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("j")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("o")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("g")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("l")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1421097463
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1998953015
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("v")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("b")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("q")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "967216263"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IS)V",
		garbageValue = "249"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "713399938"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 69
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lll;",
		garbageValue = "3"
	)
	public static PrivateChatMode method2727(int var0) {
		PrivateChatMode[] var1 = WorldMapRegion.method3351(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field3898) {
				return var3; // L: 24
			}
		}

		return null; // L: 28
	}
}
