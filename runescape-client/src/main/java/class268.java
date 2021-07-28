import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
public class class268 {
	static {
		int var0 = 0;
		int var1 = 0;
		class263[] var2 = WorldMapDecorationType.method4892();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class263 var4 = var2[var3];
			if (var4.field3190 > var0) {
				var0 = var4.field3190;
			}

			if (var4.field3192 > var1) {
				var1 = var4.field3192;
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "944915508"
	)
	public static void method4925() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}
}
