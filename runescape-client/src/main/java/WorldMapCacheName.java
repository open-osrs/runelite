import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	public static final WorldMapCacheName field322;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	public static final WorldMapCacheName field318;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	public static final WorldMapCacheName field327;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	static final WorldMapCacheName field319;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	public static final WorldMapCacheName field321;
	@ObfuscatedName("o")
	public final String name;

	static {
		field322 = new WorldMapCacheName("details"); // L: 4
		field318 = new WorldMapCacheName("compositemap"); // L: 5
		field327 = new WorldMapCacheName("compositetexture"); // L: 6
		field319 = new WorldMapCacheName("area"); // L: 7
		field321 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbk;",
		garbageValue = "-87"
	)
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1002606295"
	)
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field704) { // L: 3288
			class206.midiPcmStream.clear(); // L: 3290
			class206.musicPlayerStatus = 1; // L: 3291
			class204.musicTrackArchive = null; // L: 3292
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Client.musicVolume != 0 && !Client.field704) { // L: 3295
			Archive var1 = CollisionMap.archive6; // L: 3296
			int var2 = Client.musicVolume; // L: 3297
			class206.musicPlayerStatus = 1; // L: 3299
			class204.musicTrackArchive = var1; // L: 3300
			BuddyRankComparator.musicTrackGroupId = var0; // L: 3301
			class206.musicTrackFileId = 0; // L: 3302
			Tiles.musicTrackVolume = var2; // L: 3303
			class206.musicTrackBoolean = false; // L: 3304
			FaceNormal.pcmSampleLength = 2; // L: 3305
		}

		Client.currentTrackGroupId = var0; // L: 3308
	} // L: 3309
}
