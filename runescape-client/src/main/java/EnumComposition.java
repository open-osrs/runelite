import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("i")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("f")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("b")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1966559045
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1434238149
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("l")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("q")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("o")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-91"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-2119565699"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lky;IIII)V",
		garbageValue = "-585894477"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3417 == null) { // L: 1012
			throw new RuntimeException(); // L: 1013
		} else {
			var0.field3417[var1] = var2; // L: 1015
			var0.field3418[var1] = var3; // L: 1016
		}
	} // L: 1017
}
