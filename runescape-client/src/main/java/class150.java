import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class150 {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("f")
	public short[] field1606;
	@ObfuscatedName("j")
	public short[] field1607;

	public class150(int var1) {
		ItemComposition var2 = class87.ItemDefinition_get(var1);
		if (var2.method3297()) {
			this.field1606 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1606, 0, this.field1606.length);
		}

		if (var2.method3272()) {
			this.field1607 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1607, 0, this.field1607.length);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I[BLmm;I)V",
		garbageValue = "-2027548425"
	)
	static void method2873(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3671 == 0) {
				Huffman.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				Huffman.ArchiveDiskActionHandler_thread.setDaemon(true);
				Huffman.ArchiveDiskActionHandler_thread.start();
				Huffman.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3671 = 600;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "893646599"
	)
	static void method2874(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
		if (var4 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var4);
		}
	}
}
