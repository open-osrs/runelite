import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class12 extends class16 {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1417181599
	)
	static int field111;
	@ObfuscatedName("f")
	String field112;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 667023111
	)
	int field109;
	@ObfuscatedName("v")
	byte field110;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class12(class19 var1) {
		this.this$0 = var1;
		this.field112 = null; // L: 54
	} // L: 58

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 61
			--var1.offset; // L: 62
			var1.readLong(); // L: 63
		}

		this.field112 = var1.readStringCp1252NullTerminatedOrNull(); // L: 65
		this.field109 = var1.readUnsignedShort(); // L: 66
		this.field110 = var1.readByte(); // L: 67
		var1.readLong(); // L: 68
	} // L: 69

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 72
		var2.name = this.field112; // L: 73
		var2.world = this.field109; // L: 74
		var2.rank = this.field110; // L: 75
		var1.addMember(var2); // L: 76
	} // L: 77

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "655976642"
	)
	static void method209(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1727

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1728
			int var4 = var3 * 32 + 15 + 128; // L: 1729
			int var5 = NetSocket.method2676(var4); // L: 1730
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1731
			int var8 = var1 - 334; // L: 1734
			if (var8 < 0) { // L: 1735
				var8 = 0;
			} else if (var8 > 100) { // L: 1736
				var8 = 100;
			}

			int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 1737
			int var7 = var9 * var5 / 256; // L: 1738
			var2[var3] = var7 * var6 >> 16; // L: 1741
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1743
	} // L: 1744
}
