import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("l")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("k")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("a")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1422398085
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1977259169
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("s")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("r")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("v")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "2"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "2123865922"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1493000853"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 69
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "2111850720"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 82
		int var4 = 0; // L: 83

		for (int var5 = 0; var5 < var2; ++var5) { // L: 84
			int var6 = var0[var5 + var1] & 255; // L: 85
			if (var6 != 0) { // L: 86
				if (var6 >= 128 && var6 < 160) { // L: 87
					char var7 = class341.cp1252AsciiExtension[var6 - 128]; // L: 88
					if (var7 == 0) { // L: 89
						var7 = '?';
					}

					var6 = var7; // L: 90
				}

				var3[var4++] = (char)var6; // L: 92
			}
		}

		return new String(var3, 0, var4); // L: 94
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2023636787"
	)
	public static void method3400() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 96
	} // L: 97
}
