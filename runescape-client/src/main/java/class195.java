import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class195 {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("loginType")
	static LoginType loginType;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-92628097"
	)
	static byte[] method3748(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIILjg;IB)V",
		garbageValue = "-24"
	)
	static void method3747(int var0, int var1, int var2, ObjectDefinition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.field1103 = (var6 + var1) * 128;
		var5.field1104 = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field1105 = var3.int4 * 128;
		var5.field1108 = var3.int5;
		var5.field1115 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field1111 = var5.field1108 + (int)(Math.random() * (double)(var5.field1115 - var5.field1108));
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1529350789"
	)
	public static void method3749() {
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
