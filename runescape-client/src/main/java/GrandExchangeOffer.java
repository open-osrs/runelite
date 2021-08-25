import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("u")
	static int[] field3769;
	@ObfuscatedName("n")
	@Export("state")
	byte state;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1885544773
	)
	@Export("id")
	public int id;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1068501763
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -691773445
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 65758811
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 358624203
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lot;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-165905974"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-29"
	)
	void method5332(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-347764080"
	)
	void method5333(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Len;",
		garbageValue = "3"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "108"
	)
	static int method5345(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++class240.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			Interpreter.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++class240.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++class240.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class258.method4892() ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--class240.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				class240.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				class240.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++class240.Interpreter_intStackSize;
			return 1;
		}
	}
}
