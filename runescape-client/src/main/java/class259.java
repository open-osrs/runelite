import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class259 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1157177731"
	)
	public static void method4999() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 116
			if (ArchiveDiskActionHandler.field3869 != 0) { // L: 117
				ArchiveDiskActionHandler.field3869 = 1; // L: 118

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 120
				} catch (InterruptedException var3) { // L: 122
				}
			}

		}
	} // L: 125

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILkq;IIIZI)V",
		garbageValue = "1434577237"
	)
	public static void method4997(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class265.musicPlayerStatus = 1; // L: 49
		class265.musicTrackArchive = var1; // L: 50
		class265.musicTrackGroupId = var2; // L: 51
		class140.musicTrackFileId = var3; // L: 52
		class167.musicTrackVolume = var4; // L: 53
		MusicPatch.musicTrackBoolean = var5; // L: 54
		GrandExchangeOfferNameComparator.pcmSampleLength = var0; // L: 55
	} // L: 56

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public static void method4998(int var0) {
		class265.musicPlayerStatus = 1; // L: 59
		class265.musicTrackArchive = null; // L: 60
		class265.musicTrackGroupId = -1; // L: 61
		class140.musicTrackFileId = -1; // L: 62
		class167.musicTrackVolume = 0; // L: 63
		MusicPatch.musicTrackBoolean = false; // L: 64
		GrandExchangeOfferNameComparator.pcmSampleLength = var0; // L: 65
	} // L: 66
}
