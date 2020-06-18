import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("g")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("n")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("u")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("a")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1532360493
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("w")
	int[] field3553;
	@ObfuscatedName("y")
	public boolean field3558;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -900038677
	)
	public int field3543;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 202902523
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1507949653
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -294683655
	)
	public int field3562;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 61735455
	)
	public int field3559;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1582527651
	)
	public int field3560;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1066038459
	)
	public int field3561;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field3558 = false;
		this.field3543 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field3562 = 99;
		this.field3559 = -1;
		this.field3560 = -1;
		this.field3561 = 2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkn;I)V",
		garbageValue = "-1837396411"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkn;II)V",
		garbageValue = "-1375281235"
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
			this.field3553 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3553[var4] = var1.readUnsignedByte();
			}

			this.field3553[var3] = 9999999;
		} else if (var2 == 4) {
			this.field3558 = true;
		} else if (var2 == 5) {
			this.field3543 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field3562 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field3559 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field3560 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field3561 = var1.readUnsignedByte();
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
		signature = "(I)V",
		garbageValue = "-1490793911"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3559 == -1) {
			if (this.field3553 != null) {
				this.field3559 = 2;
			} else {
				this.field3559 = 0;
			}
		}

		if (this.field3560 == -1) {
			if (this.field3553 != null) {
				this.field3560 = 2;
			} else {
				this.field3560 = 0;
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lef;II)Lef;",
		garbageValue = "-1881625962"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = NetSocket.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lef;III)Lef;",
		garbageValue = "-1040736484"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = NetSocket.getFrames(var2 >> 16);
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lef;II)Lef;",
		garbageValue = "-277583954"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = NetSocket.getFrames(var2 >> 16);
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
		signature = "(Lef;ILjm;II)Lef;",
		garbageValue = "-864862384"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = NetSocket.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = NetSocket.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field3553);
				return var7;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Lef;IB)Lef;",
		garbageValue = "32"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = NetSocket.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = NetSocket.getFrames(var6 >> 16);
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

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "1779036927"
	)
	static final void method4973(boolean var0) {
		if (var0) {
			Client.field708 = Login.field1223 ? class169.field2023 : class169.field2025;
		} else {
			Client.field708 = NetSocket.clientPreferences.parameters.containsKey(WorldMapAreaData.method759(Login.Login_username)) ? class169.field2028 : class169.field2024;
		}

	}
}
