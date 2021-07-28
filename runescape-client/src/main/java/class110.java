import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class110 extends class103 {
	@ObfuscatedName("s")
	boolean field1342;
	@ObfuscatedName("t")
	byte field1339;
	@ObfuscatedName("v")
	byte field1340;
	@ObfuscatedName("j")
	byte field1341;
	@ObfuscatedName("l")
	byte field1338;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class110(class106 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1342 = var1.readUnsignedByte() == 1;
		this.field1339 = var1.readByte();
		this.field1340 = var1.readByte();
		this.field1341 = var1.readByte();
		this.field1338 = var1.readByte();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.allowGuests = this.field1342;
		var1.field1359 = this.field1339;
		var1.field1368 = this.field1340;
		var1.field1369 = this.field1341;
		var1.field1383 = this.field1338;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;ZB)V",
		garbageValue = "92"
	)
	public static void method2318(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-182277228"
	)
	public static boolean method2322(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZS)I",
		garbageValue = "-13449"
	)
	static int method2324(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						NPCComposition var4 = UserComparator6.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					return 1;
				}
			} else {
				--Interpreter.Interpreter_intStackSize;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2;
			--class1.Interpreter_stringStackSize;
			return 1;
		}
	}
}
