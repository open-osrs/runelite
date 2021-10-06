import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class133 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -7010502631349948943L
	)
	long field1499;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -5422378692858093787L
	)
	long field1494;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	IterableNodeDeque field1493;

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	public class133(Buffer var1) {
		this.field1494 = -1L;
		this.field1493 = new IterableNodeDeque();
		this.method2704(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1667540197"
	)
	void method2704(Buffer var1) {
		this.field1499 = var1.readLong();
		this.field1494 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class128(this);
			} else if (var2 == 4) {
				var3 = new class139(this);
			} else if (var2 == 3) {
				var3 = new class124(this);
			} else if (var2 == 2) {
				var3 = new class122(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class129(this);
			}

			((class132)var3).vmethod2760(var1);
			this.field1493.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "-2050945846"
	)
	public void method2701(ClanChannel var1) {
		if (var1.key == this.field1499 && this.field1494 == var1.field1515) {
			for (class132 var2 = (class132)this.field1493.last(); var2 != null; var2 = (class132)this.field1493.previous()) {
				var2.vmethod2759(var1);
			}

			++var1.field1515;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILmm;Lky;I)V",
		garbageValue = "364111545"
	)
	static void method2707(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1000126094"
	)
	static int method2706(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("a")
	static boolean method2702(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "82"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
