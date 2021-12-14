import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1041298401
	)
	@Export("id")
	int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -15968409
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -373650937
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("w")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("n")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("r")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("o")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2106085717
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 153752537
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1577811829
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -695708245
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 176094243
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "9"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "99"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgo;",
		garbageValue = "15"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var2 == null) {
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (this.recolorFrom != null) {
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
				}
			}

			if (this.retextureFrom != null) {
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id);
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) {
			var5 = UserComparator5.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true);
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) {
			if (this.orientation == 90) {
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}

			if (this.orientation == 270) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}
		}

		return var5;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkw;",
		garbageValue = "672996916"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_jagexModerator, PlayerType.field3795, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_normal, PlayerType.field3802, PlayerType.field3801, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman};
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "84"
	)
	public static int method3362(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)Ljm;",
		garbageValue = "-123837697"
	)
	static Widget method3340(Widget var0) {
		int var1 = Frames.method4149(class363.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = ChatChannel.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
