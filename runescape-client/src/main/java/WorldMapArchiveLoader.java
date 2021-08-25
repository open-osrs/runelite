import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("o")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 978412683
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("a")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2042799835"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (var1 != this.cacheName) {
				this.cacheName = var1;
				this.percentLoaded = 0;
				this.loaded = false;
				this.load();
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1193770615"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2203.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 33;
		}

		if (this.percentLoaded == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field2201.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2201.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 66;
		}

		if (this.percentLoaded == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2200.name)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 100;
			this.loaded = true;
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1751001659"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-507892849"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BB)Llu;",
		garbageValue = "-27"
	)
	static Font method6348(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, class413.SpriteBuffer_xOffsets, class413.SpriteBuffer_yOffsets, InvDefinition.SpriteBuffer_spriteWidths, class413.SpriteBuffer_spriteHeights, ItemContainer.SpriteBuffer_spritePalette, class283.SpriteBuffer_pixels);
			class413.SpriteBuffer_xOffsets = null;
			class413.SpriteBuffer_yOffsets = null;
			InvDefinition.SpriteBuffer_spriteWidths = null;
			class413.SpriteBuffer_spriteHeights = null;
			ItemContainer.SpriteBuffer_spritePalette = null;
			class283.SpriteBuffer_pixels = null;
			return var1;
		}
	}
}
