import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("g")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("z")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("a")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("u")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -516992757
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("l")
	int[] field1953;
	@ObfuscatedName("y")
	public boolean field1954;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -108403137
	)
	public int field1955;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -883660489
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 433477557
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1559176949
	)
	public int field1958;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 173743593
	)
	public int field1959;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1640024295
	)
	public int field1960;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -264783013
	)
	public int field1961;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field1954 = false;
		this.field1955 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field1958 = 99;
		this.field1959 = -1;
		this.field1960 = -1;
		this.field1961 = 2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1643897394"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-166229684"
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
			this.field1954 = true;
		} else if (var2 == 5) {
			this.field1955 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field1958 = var1.readUnsignedByte();
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lhg;II)Lhg;",
		garbageValue = "508882538"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = class124.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhg;III)Lhg;",
		garbageValue = "-790531787"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = class124.getFrames(var2 >> 16);
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lhg;II)Lhg;",
		garbageValue = "1375824089"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = class124.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lhg;ILfa;II)Lhg;",
		garbageValue = "266592335"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class124.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class124.getFrames(var4 >> 16);
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
		descriptor = "(Lhg;IB)Lhg;",
		garbageValue = "0"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = class124.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = class124.getFrames(var6 >> 16);
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lbh;",
		garbageValue = "-1797701824"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class393.World_worlds[++World.World_listCount - 1] : null;
	}
}
