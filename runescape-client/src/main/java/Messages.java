import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("i")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1495629097
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive18")
	static Archive archive18;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "24"
	)
	static final int method2376(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 552
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 553
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-56186501"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10610
	} // L: 10611

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-63"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class174.loadInterface(var0)) { // L: 10622
			ClanChannel.updateInterface(WorldMapSection1.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10623
		}
	} // L: 10624
}
