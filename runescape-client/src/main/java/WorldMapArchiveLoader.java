import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("m")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1838089259
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("a")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lkl;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1651193306"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2103125458"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2215.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 33;
		}

		if (this.percentLoaded == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field2216.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2216.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 66;
		}

		if (this.percentLoaded == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2218.name)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 100;
			this.loaded = true;
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1263221569"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1014935859"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}
