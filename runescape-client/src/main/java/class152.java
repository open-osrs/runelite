import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class152 extends class128 {
	@ObfuscatedName("bc")
	static String field1686;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -454158867
	)
	int field1687;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -753746234576851427L
	)
	long field1689;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class152(class131 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1687 = var1.readInt(); // L: 310
		this.field1689 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2938(this.field1687, this.field1689); // L: 315
	} // L: 316

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Lgg;IIII)V",
		garbageValue = "-998811857"
	)
	static void method3102(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Interpreter.clientPreferences.method2286() != 0) { // L: 3303
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3304
				HealthBarUpdate.method2210(var0.soundEffects[var1], var2, var3); // L: 3305
			}
		}
	} // L: 3306
}
