import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public abstract class class128 extends Node {
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -1795055701
	)
	@Export("Client_plane")
	static int Client_plane;

	class128() {
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	abstract void vmethod3040(Buffer var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	abstract void vmethod3041(ClanSettings var1);
}
