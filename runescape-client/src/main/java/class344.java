import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public final class class344 {
	@ObfuscatedName("c")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("v")
	static long[] field4153;
	@ObfuscatedName("y")
	static int[] field4152;
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4153 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4153.length; ++var0) { // L: 8
			field4153[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)Lbi;",
		garbageValue = "8"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 84
		Buffer var2 = new Buffer(var0); // L: 85
		var2.offset = var2.array.length - 2; // L: 86
		int var3 = var2.readUnsignedShort(); // L: 87
		int var4 = var2.array.length - 2 - var3 - 12; // L: 88
		var2.offset = var4; // L: 89
		int var5 = var2.readInt(); // L: 90
		var1.localIntCount = var2.readUnsignedShort(); // L: 91
		var1.localStringCount = var2.readUnsignedShort(); // L: 92
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 93
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 94
		int var6 = var2.readUnsignedByte(); // L: 95
		int var7;
		int var8;
		if (var6 > 0) { // L: 96
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 97

			for (var7 = 0; var7 < var6; ++var7) { // L: 98
				var8 = var2.readUnsignedShort(); // L: 99
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class135.method2910(var8) : 1); // L: 100
				var1.switches[var7] = var9; // L: 101

				while (var8-- > 0) { // L: 102
					int var10 = var2.readInt(); // L: 103
					int var11 = var2.readInt(); // L: 104
					var9.put(new IntegerNode(var11), (long)var10); // L: 105
				}
			}
		}

		var2.offset = 0; // L: 109
		var1.field967 = var2.readStringCp1252NullTerminatedOrNull(); // L: 110
		var1.opcodes = new int[var5]; // L: 111
		var1.intOperands = new int[var5]; // L: 112
		var1.stringOperands = new String[var5]; // L: 113

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 114 115 120
			var8 = var2.readUnsignedShort(); // L: 116
			if (var8 == 3) { // L: 117
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) { // L: 118
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 119
			}
		}

		return var1; // L: 122
	}
}
