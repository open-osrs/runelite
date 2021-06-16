import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lgz;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 35
		int var6 = var1.getGroupFileCount(var3); // L: 36
		this.frames = new Animation[var6]; // L: 37
		int[] var7 = var1.getGroupFileIds(var3); // L: 38

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 39
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1512659835"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9614"
	)
	public static void method4257() {
		try {
			if (class233.musicPlayerStatus == 1) { // L: 76
				int var0 = class233.midiPcmStream.method4660(); // L: 77
				if (var0 > 0 && class233.midiPcmStream.isReady()) { // L: 78
					var0 -= FaceNormal.pcmSampleLength; // L: 79
					if (var0 < 0) { // L: 80
						var0 = 0;
					}

					class233.midiPcmStream.setPcmStreamVolume(var0); // L: 81
					return; // L: 82
				}

				class233.midiPcmStream.clear(); // L: 84
				class233.midiPcmStream.removeAll(); // L: 85
				if (InvDefinition.musicTrackArchive != null) { // L: 86
					class233.musicPlayerStatus = 2;
				} else {
					class233.musicPlayerStatus = 0; // L: 87
				}

				ArchiveLoader.musicTrack = null; // L: 88
				class215.soundCache = null; // L: 89
			}
		} catch (Exception var2) { // L: 92
			var2.printStackTrace(); // L: 93
			class233.midiPcmStream.clear(); // L: 94
			class233.musicPlayerStatus = 0; // L: 95
			ArchiveLoader.musicTrack = null; // L: 96
			class215.soundCache = null; // L: 97
			InvDefinition.musicTrackArchive = null; // L: 98
		}

	} // L: 100
}
