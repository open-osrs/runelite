import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Players")
public class Players {
	@ObfuscatedName("qc")
	static boolean field1182;
	@ObfuscatedName("v")
	static byte[] field1174;
	@ObfuscatedName("j")
	static byte[] field1170;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lnv;"
	)
	static Buffer[] field1167;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1053067897
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("w")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 298853217
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("o")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("x")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("r")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("p")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -408351623
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("k")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	static Buffer field1181;

	static {
		field1174 = new byte[2048];
		field1170 = new byte[2048];
		field1167 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1181 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IIIZI)V",
		garbageValue = "-1034711419"
	)
	public static void method2022(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class234.musicPlayerStatus = 1;
		class234.musicTrackArchive = var0;
		class234.musicTrackGroupId = var1;
		UserComparator6.musicTrackFileId = var2;
		HorizontalAlignment.musicTrackVolume = var3;
		EnumComposition.musicTrackBoolean = var4;
		ClanChannel.pcmSampleLength = 10000;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-701145156"
	)
	public static boolean method2021(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
