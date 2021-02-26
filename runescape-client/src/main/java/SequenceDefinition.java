import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("h")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("z")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("e")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("q")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1919989745
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("s")
	int[] field3552;
	@ObfuscatedName("b")
	public boolean field3559;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 784302735
	)
	public int field3560;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1358417643
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -625225869
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1105922697
	)
	public int field3563;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1806231631
	)
	public int field3564;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1659033173
	)
	public int field3565;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 674051905
	)
	public int field3548;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 15
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 16
	}

	SequenceDefinition() {
		this.frameCount = -1; // L: 21
		this.field3559 = false; // L: 23
		this.field3560 = 5; // L: 24
		this.shield = -1; // L: 25
		this.weapon = -1; // L: 26
		this.field3563 = 99; // L: 27
		this.field3564 = -1; // L: 28
		this.field3565 = -1; // L: 29
		this.field3548 = 2; // L: 30
	} // L: 32

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-1298412871"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 53
			if (var2 == 0) { // L: 54
				return; // L: 57
			}

			this.decodeNext(var1, var2); // L: 55
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "-1464269067"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 60
			var3 = var1.readUnsignedShort(); // L: 61
			this.frameLengths = new int[var3]; // L: 62

			for (var4 = 0; var4 < var3; ++var4) { // L: 63
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 64

			for (var4 = 0; var4 < var3; ++var4) { // L: 65
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 66
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 68
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 69
			var3 = var1.readUnsignedByte(); // L: 70
			this.field3552 = new int[var3 + 1]; // L: 71

			for (var4 = 0; var4 < var3; ++var4) { // L: 72
				this.field3552[var4] = var1.readUnsignedByte();
			}

			this.field3552[var3] = 9999999; // L: 73
		} else if (var2 == 4) { // L: 75
			this.field3559 = true;
		} else if (var2 == 5) { // L: 76
			this.field3560 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 77
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 78
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 79
			this.field3563 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 80
			this.field3564 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 81
			this.field3565 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 82
			this.field3548 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 83
			var3 = var1.readUnsignedByte(); // L: 84
			this.chatFrameIds = new int[var3]; // L: 85

			for (var4 = 0; var4 < var3; ++var4) { // L: 86
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 87
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 89
			var3 = var1.readUnsignedByte(); // L: 90
			this.soundEffects = new int[var3]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.soundEffects[var4] = var1.readMedium();
			}
		}

	} // L: 95

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-49"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3564 == -1) { // L: 98
			if (this.field3552 != null) { // L: 99
				this.field3564 = 2;
			} else {
				this.field3564 = 0; // L: 100
			}
		}

		if (this.field3565 == -1) { // L: 102
			if (this.field3552 != null) { // L: 103
				this.field3565 = 2;
			} else {
				this.field3565 = 0; // L: 104
			}
		}

	} // L: 106

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lef;II)Lef;",
		garbageValue = "2114263360"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 109
		Frames var3 = ClientPreferences.getFrames(var2 >> 16); // L: 110
		var2 &= 65535; // L: 111
		if (var3 == null) { // L: 112
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2)); // L: 113
			var4.animate(var3, var2); // L: 114
			return var4; // L: 115
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lef;IIS)Lef;",
		garbageValue = "-75"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2]; // L: 119
		Frames var4 = ClientPreferences.getFrames(var2 >> 16); // L: 120
		var2 &= 65535; // L: 121
		if (var4 == null) { // L: 122
			return var1.toSharedSequenceModel(true);
		} else {
			Model var5 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var2)); // L: 123
			var3 &= 3; // L: 124
			if (var3 == 1) { // L: 125
				var5.rotateY270Ccw();
			} else if (var3 == 2) { // L: 126
				var5.rotateY180();
			} else if (var3 == 3) { // L: 127
				var5.rotateY90Ccw();
			}

			var5.animate(var4, var2); // L: 128
			if (var3 == 1) { // L: 129
				var5.rotateY90Ccw();
			} else if (var3 == 2) { // L: 130
				var5.rotateY180();
			} else if (var3 == 3) { // L: 131
				var5.rotateY270Ccw();
			}

			return var5; // L: 132
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lef;IB)Lef;",
		garbageValue = "26"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 136
		Frames var3 = ClientPreferences.getFrames(var2 >> 16); // L: 137
		var2 &= 65535; // L: 138
		if (var3 == null) { // L: 139
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2)); // L: 140
			var4.animate(var3, var2); // L: 141
			return var4; // L: 142
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lef;ILjs;II)Lef;",
		garbageValue = "-1897802113"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 146
		Frames var5 = ClientPreferences.getFrames(var2 >> 16); // L: 147
		var2 &= 65535; // L: 148
		if (var5 == null) { // L: 149
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 150
			Frames var6 = ClientPreferences.getFrames(var4 >> 16); // L: 151
			var4 &= 65535; // L: 152
			Model var7;
			if (var6 == null) { // L: 153
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 154
				var7.animate(var5, var2); // L: 155
				return var7; // L: 156
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 158
				var7.animate2(var5, var2, var6, var4, this.field3552); // L: 159
				return var7; // L: 160
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lef;II)Lef;",
		garbageValue = "620650049"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2]; // L: 164
		Frames var4 = ClientPreferences.getFrames(var3 >> 16); // L: 165
		var3 &= 65535; // L: 166
		if (var4 == null) { // L: 167
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null; // L: 168
			int var6 = 0; // L: 169
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 170
				var6 = this.chatFrameIds[var2]; // L: 171
				var5 = ClientPreferences.getFrames(var6 >> 16); // L: 172
				var6 &= 65535; // L: 173
			}

			Model var7;
			if (var5 != null && var6 != 65535) { // L: 175
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 180
				var7.animate(var4, var3); // L: 181
				var7.animate(var5, var6); // L: 182
				return var7; // L: 183
			} else {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 176
				var7.animate(var4, var3); // L: 177
				return var7; // L: 178
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "-109"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					var2 = class238.method4334(var1);
				}

				if (var0 != null) { // L: 35
					if (var1 != null) { // L: 36
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 37
				}

				System.out.println("Error: " + var2); // L: 39
				var2 = var2.replace(':', '.'); // L: 40
				var2 = var2.replace('@', '_'); // L: 41
				var2 = var2.replace('&', '_'); // L: 42
				var2 = var2.replace('#', '_'); // L: 43
				if (RunException.RunException_applet == null) { // L: 44
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + class1.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class217.clientType + "&e=" + var2); // L: 45
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 46
				var4.read(); // L: 47
				var4.close(); // L: 48
			} catch (Exception var5) { // L: 50
			}

		}
	} // L: 51
}
