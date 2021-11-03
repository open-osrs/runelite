import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class87 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbp;",
		garbageValue = "-530191706"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 112
		Buffer var2 = new Buffer(var0); // L: 113
		var2.offset = var2.array.length - 2; // L: 114
		int var3 = var2.readUnsignedShort(); // L: 115
		int var4 = var2.array.length - 2 - var3 - 12; // L: 116
		var2.offset = var4; // L: 117
		int var5 = var2.readInt(); // L: 118
		var1.localIntCount = var2.readUnsignedShort(); // L: 119
		var1.localStringCount = var2.readUnsignedShort(); // L: 120
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 121
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 122
		int var6 = var2.readUnsignedByte(); // L: 123
		int var7;
		int var8;
		if (var6 > 0) { // L: 124
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 125

			for (var7 = 0; var7 < var6; ++var7) { // L: 126
				var8 = var2.readUnsignedShort(); // L: 127
				int var9;
				int var11;
				if (var8 > 0) { // L: 129
					var11 = var8 - 1; // L: 133
					var11 |= var11 >>> 1; // L: 134
					var11 |= var11 >>> 2; // L: 135
					var11 |= var11 >>> 4; // L: 136
					var11 |= var11 >>> 8; // L: 137
					var11 |= var11 >>> 16; // L: 138
					int var10 = var11 + 1; // L: 139
					var9 = var10; // L: 141
				} else {
					var9 = 1; // L: 143
				}

				IterableNodeHashTable var13 = new IterableNodeHashTable(var9); // L: 144
				var1.switches[var7] = var13; // L: 145

				while (var8-- > 0) { // L: 146
					var11 = var2.readInt(); // L: 147
					int var12 = var2.readInt(); // L: 148
					var13.put(new IntegerNode(var12), (long)var11); // L: 149
				}
			}
		}

		var2.offset = 0; // L: 153
		var1.field928 = var2.readStringCp1252NullTerminatedOrNull(); // L: 154
		var1.opcodes = new int[var5]; // L: 155
		var1.intOperands = new int[var5]; // L: 156
		var1.stringOperands = new String[var5]; // L: 157

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 158 159 164
			var8 = var2.readUnsignedShort(); // L: 160
			if (var8 == 3) { // L: 161
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 162
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 163
			}
		}

		return var1; // L: 166
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	public static void method2223() {
		KitDefinition.KitDefinition_cached.clear(); // L: 130
	} // L: 131

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-278376430"
	)
	static int method2224() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1993
			int var0 = 0; // L: 1994

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1995
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1996
			}

			return var0 * 10000 / Client.field745; // L: 1998
		} else {
			return 10000;
		}
	}
}
