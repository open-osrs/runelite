import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public enum class122 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1494(0, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1498(3, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1495(4, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1496(1, 3),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1497(2, 4);

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 23766765
	)
	public final int field1493;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 477891435
	)
	@Export("id")
	final int id;

	class122(int var3, int var4) {
		this.field1493 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILnb;Lkz;B)V",
		garbageValue = "-19"
	)
	static void method2712(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null; // L: 40
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 41
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 42
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) { // L: 43
					var3 = var5.data; // L: 44
					break; // L: 45
				}
			}
		}

		if (var3 != null) { // L: 49
			var2.load(var1, var0, var3, true); // L: 50
		} else {
			byte[] var4 = var1.read(var0); // L: 53
			var2.load(var1, var0, var4, true); // L: 54
		}
	} // L: 51 55

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (MouseHandler.pcmPlayer1 != null) { // L: 3398
			MouseHandler.pcmPlayer1.run();
		}

		if (PacketBufferNode.pcmPlayer0 != null) { // L: 3399
			PacketBufferNode.pcmPlayer0.run();
		}

	} // L: 3400
}
