import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("rs")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -918645963
	)
	@Export("id")
	int id;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1578947539
	)
	@Export("count")
	int count;
	@ObfuscatedName("w")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("v")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	class194 field2295;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2295 = new class194(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2091195590"
	)
	public int method3886() {
		return this.count; // L: 38
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lga;",
		garbageValue = "1994813760"
	)
	public class194 method3887() {
		return this.field2295; // L: 42
	}

	@ObfuscatedName("w")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 80
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "2097151"
	)
	static int method3893(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2118
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2119
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.method2086(var3) ? 1 : 0; // L: 2120
			return 1; // L: 2121
		} else if (var0 == 3501) { // L: 2123
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2124
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SpriteMask.method5325(var3) ? 1 : 0; // L: 2125
			return 1; // L: 2126
		} else if (var0 == 3502) { // L: 2128
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2129
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class148.method3005(var3) ? 1 : 0; // L: 2130
			return 1; // L: 2131
		} else {
			return 2; // L: 2133
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	static boolean method3892() {
		return class424.clientPreferences.field1231 >= Client.field699; // L: 12160
	}
}
