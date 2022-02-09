import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
public class class131 extends class126 {
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1121239491
	)
	int field1547;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -793046413
	)
	int field1544;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1206553225
	)
	int field1549;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 505572307
	)
	int field1545;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class131(class129 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		this.field1547 = var1.readInt(); // L: 292
		this.field1545 = var1.readInt(); // L: 293
		this.field1544 = var1.readUnsignedByte(); // L: 294
		this.field1549 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2862(this.field1547, this.field1545, this.field1544, this.field1549);
	} // L: 300

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkq;IB)V",
		garbageValue = "126"
	)
	static void method2787(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 298
			class28.logoSprite = class91.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 299
		} else if ((var1 & 1073741824) != 0) { // L: 301
			class28.logoSprite = class91.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 302
		} else {
			class28.logoSprite = class91.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 305
		}

	} // L: 307

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "1"
	)
	static int method2795(int var0, Script var1, boolean var2) {
		Widget var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1388
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1389
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class135.Widget_unpackTargetMask(Language.getWidgetFlags(var3)); // L: 1390
			return 1; // L: 1391
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1393
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1400
				if (var3.dataText == null) { // L: 1401
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1402
				}

				return 1; // L: 1403
			} else {
				return 2; // L: 1405
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1394
			--var4; // L: 1395
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1396
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1397
			} else {
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1398
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1492564719"
	)
	static final void method2793() {
		Client.field664 = Client.cycleCntr; // L: 11909
		Skeleton.ClanChat_inClanChat = true; // L: 11910
	} // L: 11911
}
