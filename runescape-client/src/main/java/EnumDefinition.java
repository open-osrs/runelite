import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("EnumDefinition")
public class EnumDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("s")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("t")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("i")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1401922337
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1452935225
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("w")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("g")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("m")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumDefinition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-2086226438"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;IB)V",
		garbageValue = "57"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-2060894177"
	)
	public static byte[] method4644(CharSequence var0) {
		int var1 = var0.length(); // L: 84
		byte[] var2 = new byte[var1]; // L: 85

		for (int var3 = 0; var3 < var1; ++var3) { // L: 86
			char var4 = var0.charAt(var3); // L: 87
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 88
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 89
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 90
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 91
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 92
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 93
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 94
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 95
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 96
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 97
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118; // L: 98
			} else if (var4 == 8249) { // L: 99
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 100
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 101
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 102
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 103
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 104
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 105
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 106
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 107
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 108
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 109
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 110
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 111
				var2[var3] = -102;
			} else if (var4 == 8250) { // L: 112
				var2[var3] = -101;
			} else if (var4 == 339) { // L: 113
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 114
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 115
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 116
			}
		}

		return var2; // L: 118
	}
}
