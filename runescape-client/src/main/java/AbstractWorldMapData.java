import java.util.LinkedList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ff")
	static String field2796;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2134162895
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 466431409
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1382300835
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1154191837
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1056941337
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1127387871
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1648265251
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1093905309
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("c")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("j")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("p")
	byte[][][] field2793;
	@ObfuscatedName("s")
	byte[][][] field2792;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[[[[Lij;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("w")
	boolean field2794;
	@ObfuscatedName("a")
	boolean field2795;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2794 = false; // L: 26
		this.field2795 = false; // L: 27
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "1809174469"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2021413302"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2794 && this.field2795; // L: 32
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)V",
		garbageValue = "1505818240"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2794 = true; // L: 40
				this.field2795 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1763355958"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2793 = null; // L: 48
		this.field2792 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2794 = false; // L: 51
		this.field2795 = false; // L: 52
	} // L: 53

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILpd;B)V",
		garbageValue = "-26"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4981(var1, var2, var3, var4);
			} else {
				this.method4960(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILpd;II)V",
		garbageValue = "2062281741"
	)
	void method4981(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILpd;IB)V",
		garbageValue = "-17"
	)
	void method4960(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2793[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2792[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method7742(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1156452481"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1671134455"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lfw;III)Lao;",
		garbageValue = "-558526077"
	)
	public static final PcmPlayer method4986(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) { // L: 57
			if (var2 < 256) { // L: 58
				var2 = 256;
			}

			try {
				PcmPlayer var3 = BuddyRankComparator.pcmPlayerProvider.player(); // L: 60
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 61
				var3.field282 = var2; // L: 62
				var3.init(); // L: 63
				var3.capacity = (var2 & -1024) + 1024; // L: 64
				if (var3.capacity > 16384) { // L: 65
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 66
				if (class33.field237 > 0 && VarpDefinition.soundSystem == null) { // L: 67
					VarpDefinition.soundSystem = new SoundSystem(); // L: 68
					class342.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 69
					class342.soundSystemExecutor.scheduleAtFixedRate(VarpDefinition.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 70
				}

				if (VarpDefinition.soundSystem != null) { // L: 72
					if (VarpDefinition.soundSystem.players[var1] != null) { // L: 73
						throw new IllegalArgumentException();
					}

					VarpDefinition.soundSystem.players[var1] = var3; // L: 74
				}

				return var3; // L: 76
			} catch (Throwable var4) { // L: 78
				return new PcmPlayer(); // L: 79
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
