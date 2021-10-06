import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = 1752918559
	)
	static int field1954;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("k")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("t")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("a")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("e")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 500568589
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("y")
	int[] field1953;
	@ObfuscatedName("w")
	public boolean field1945;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 102030039
	)
	public int field1955;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 961941809
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 848725063
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1370198801
	)
	public int field1952;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1801078555
	)
	public int field1959;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1401670869
	)
	public int field1960;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2079014027
	)
	public int field1961;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field1945 = false;
		this.field1955 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field1952 = 99;
		this.field1959 = -1;
		this.field1960 = -1;
		this.field1961 = 2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1628718793"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "2076948132"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field1953 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1953[var4] = var1.readUnsignedByte();
			}

			this.field1953[var3] = 9999999;
		} else if (var2 == 4) {
			this.field1945 = true;
		} else if (var2 == 5) {
			this.field1955 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field1952 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field1959 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field1960 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field1961 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1690125059"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1959 == -1) {
			if (this.field1953 != null) {
				this.field1959 = 2;
			} else {
				this.field1959 = 0;
			}
		}

		if (this.field1960 == -1) {
			if (this.field1953 != null) {
				this.field1960 = 2;
			} else {
				this.field1960 = 0;
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IS)Lhl;",
		garbageValue = "-22376"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = MilliClock.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IIB)Lhl;",
		garbageValue = "-28"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = MilliClock.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var5 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var2));
			var3 &= 3;
			if (var3 == 1) {
				var5.rotateY270Ccw();
			} else if (var3 == 2) {
				var5.rotateY180();
			} else if (var3 == 3) {
				var5.rotateY90Ccw();
			}

			var5.animate(var4, var2);
			if (var3 == 1) {
				var5.rotateY90Ccw();
			} else if (var3 == 2) {
				var5.rotateY180();
			} else if (var3 == 3) {
				var5.rotateY270Ccw();
			}

			return var5;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IB)Lhl;",
		garbageValue = "-58"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = MilliClock.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lhl;ILfe;IS)Lhl;",
		garbageValue = "6680"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = MilliClock.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = MilliClock.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field1953);
				return var7;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IB)Lhl;",
		garbageValue = "0"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = MilliClock.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = MilliClock.getFrames(var6 >> 16);
				var6 &= 65535;
			}

			Model var7;
			if (var5 != null && var6 != 65535) {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
				var7.animate(var4, var3);
				var7.animate(var5, var6);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
				var7.animate(var4, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "870841332"
	)
	static void method3381() {
		if (TileItem.worldMap != null) {
			TileItem.worldMap.method6504(VertexNormal.Client_plane, (class67.localPlayer.x >> 7) + WorldMapSectionType.baseX, (class67.localPlayer.y >> 7) + PlayerComposition.baseY, false);
			TileItem.worldMap.loadCache();
		}

	}
}
