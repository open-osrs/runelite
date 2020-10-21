import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("EnumDefinition")
public class EnumDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("bb")
	@Export("otp")
	static String otp;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Llc;"
	)
	@Export("worldSelectBackSprites")
	static Sprite[] worldSelectBackSprites;
	@ObfuscatedName("l")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("m")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("z")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -25790237
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1613773715
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("c")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("u")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("t")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumDefinition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "729247361"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-2002314807"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1958366010"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "22707007"
	)
	public static int method4714(int var0) {
		if (var0 > 0) { // L: 191
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 192 193
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1488753124"
	)
	static final void method4721(int var0) {
		if (var0 >= 0) { // L: 7935
			int var1 = Client.menuArguments1[var0]; // L: 7936
			int var2 = Client.menuArguments2[var0]; // L: 7937
			int var3 = Client.menuOpcodes[var0]; // L: 7938
			int var4 = Client.menuIdentifiers[var0]; // L: 7939
			String var5 = Client.menuActions[var0]; // L: 7940
			String var6 = Client.menuTargets[var0]; // L: 7941
			Calendar.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7942
		}
	} // L: 7943
}
