import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public abstract class class142 extends Node {
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -843354001
	)
	static int field1615;

	class142() {
	} // L: 49

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	abstract void vmethod3022(Buffer var1);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	abstract void vmethod3021(ClanChannel var1);

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1686144009"
	)
	static int method2958(int var0) {
		return var0 * 3 + 600; // L: 2168
	}
}
