import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("musicTrack")
	static MusicTrack musicTrack;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IBB)V",
		garbageValue = "2"
	)
	final void method2254(int var1, byte var2) {
		int var3 = super.pathX[0]; // L: 15
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) { // L: 21
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) { // L: 32
			--var4;
		}

		if (var1 == 7) { // L: 33
			++var3; // L: 34
			--var4;
		}

		if (super.sequence != -1 && Player.SequenceDefinition_get(super.sequence).field1882 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 38
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 39
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 41
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3; // L: 44
		super.pathY[0] = var4; // L: 45
		super.pathTraversed[0] = var2; // L: 46
	} // L: 47

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 77
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? Player.SequenceDefinition_get(super.sequence) : null; // L: 78
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : Player.SequenceDefinition_get(super.movementSequence); // L: 79
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 80
			if (var3 == null) { // L: 81
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 82
				super.defaultHeight = var3.height; // L: 83
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 84
					Model var4 = Friend.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 85
					if (var4 != null) { // L: 86
						var4.offsetBy(0, -super.field1224, 0); // L: 87
						Model[] var5 = new Model[]{var3, var4}; // L: 88
						var3 = new Model(var5, 2); // L: 89
					}
				}

				if (this.definition.size == 1) { // L: 92
					var3.isSingleTile = true;
				}

				return var3; // L: 93
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "137252857"
	)
	final void method2267(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && Player.SequenceDefinition_get(super.sequence).field1882 == 1) { // L: 50
			super.sequence = -1;
		}

		if (!var3) { // L: 51
			int var4 = var1 - super.pathX[0]; // L: 52
			int var5 = var2 - super.pathY[0]; // L: 53
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 54
				if (super.pathLength < 9) { // L: 55
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 56
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 57
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 58
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 59
				}

				super.pathX[0] = var1; // L: 61
				super.pathY[0] = var2; // L: 62
				super.pathTraversed[0] = 1; // L: 63
				return; // L: 64
			}
		}

		super.pathLength = 0; // L: 67
		super.field1215 = 0; // L: 68
		super.field1250 = 0; // L: 69
		super.pathX[0] = var1; // L: 70
		super.pathY[0] = var2; // L: 71
		super.x = super.pathX[0] * 128 + super.field1211 * 64; // L: 72
		super.y = super.field1211 * 64 + super.pathY[0] * 128; // L: 73
	} // L: 74

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1701330496"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 97
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhk;",
		garbageValue = "1337289345"
	)
	static LoginPacket[] method2253() {
		return new LoginPacket[]{LoginPacket.field2803, LoginPacket.field2804, LoginPacket.field2798, LoginPacket.field2800, LoginPacket.field2801, LoginPacket.field2799};
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
		garbageValue = "16"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;B)V",
		garbageValue = "1"
	)
	public static void method2266(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18
}
