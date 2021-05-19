import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class10 extends class14 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1208789379
	)
	int field84;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class10(class2 var1) {
		this.this$0 = var1;
		this.field84 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field84 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method121(this.field84); // L: 222
	} // L: 223

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	public static void method109() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 32
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 33
			} // L: 34

			if (var0 == null) {
				return; // L: 35
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 36
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1643037220"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-383042377"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 60
		if (var0 < 0 || var0 >= 65536) { // L: 61
			var0 >>>= 16; // L: 62
			var1 += 16; // L: 63
		}

		if (var0 >= 256) { // L: 65
			var0 >>>= 8; // L: 66
			var1 += 8; // L: 67
		}

		if (var0 >= 16) { // L: 69
			var0 >>>= 4; // L: 70
			var1 += 4; // L: 71
		}

		if (var0 >= 4) { // L: 73
			var0 >>>= 2; // L: 74
			var1 += 2; // L: 75
		}

		if (var0 >= 1) { // L: 77
			var0 >>>= 1; // L: 78
			++var1; // L: 79
		}

		return var0 + var1; // L: 81
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIIILow;Lil;I)V",
		garbageValue = "1938971216"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11490
			int var6 = Client.camAngleY & 2047; // L: 11491
			int var7 = var3 * var3 + var2 * var2; // L: 11492
			if (var7 <= 6400) { // L: 11493
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11494
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11495
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11496
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11497
				if (var7 > 2500) {
					var4.method6891(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11498
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11499
				}

			}
		}
	} // L: 11500

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)V",
		garbageValue = "-29054"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 11682
		short[] var2 = new short[16]; // L: 11683
		int var3 = 0; // L: 11684

		for (int var4 = 0; var4 < class6.ItemDefinition_fileCount; ++var4) { // L: 11685
			ItemComposition var9 = Strings.ItemDefinition_get(var4); // L: 11686
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 11687 11688 11689
				if (var3 >= 250) { // L: 11690
					class135.foundItemIdCount = -1; // L: 11691
					class179.foundItemIds = null; // L: 11692
					return; // L: 11693
				}

				if (var3 >= var2.length) { // L: 11695
					short[] var6 = new short[var2.length * 2]; // L: 11696

					for (int var7 = 0; var7 < var3; ++var7) { // L: 11697
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 11698
				}

				var2[var3++] = (short)var4; // L: 11700
			}
		}

		class179.foundItemIds = var2; // L: 11702
		WorldMapManager.foundItemIndex = 0; // L: 11703
		class135.foundItemIdCount = var3; // L: 11704
		String[] var8 = new String[class135.foundItemIdCount]; // L: 11705

		for (int var5 = 0; var5 < class135.foundItemIdCount; ++var5) { // L: 11706
			var8[var5] = Strings.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class179.foundItemIds; // L: 11707
		class161.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 11709
	} // L: 11711
}
