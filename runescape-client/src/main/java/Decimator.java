import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = -1699590005
	)
	static int field1475;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 18883239
	)
	static int field1480;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1921433287
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1053329407
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("h")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D)); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = ((double)var11 - var9) * 3.141592653589793D; // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(((double)var11 - var9) * 0.2243994752564138D); // L: 49
					var8[var11] = (int)Math.floor(var17 * 65536.0D + 0.5D); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-153024312"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var9 + var4] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-128"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate); // L: 82
		}

		return var1; // L: 83
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1972966178"
	)
	static void method2704() {
		if (WorldMapData_0.loadWorlds()) { // L: 1569
			Login.worldSelectOpen = true; // L: 1570
			Login.worldSelectPage = 0; // L: 1571
			Login.worldSelectPagesCount = 0; // L: 1572
		}

	} // L: 1574

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "909165860"
	)
	static final void method2708() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 4312 4313 4330
			if (var0.plane == class90.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 4314
				if (Client.cycle >= var0.cycleStart) { // L: 4315
					if (var0.targetIndex > 0) { // L: 4316
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 4317
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 4318
							var0.setDestination(var1.x, var1.y, WorldMapRegion.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 4320
						int var2 = -var0.targetIndex - 1; // L: 4322
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 4323
							var3 = UserComparator9.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 4324
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, WorldMapRegion.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 4325
						}
					}

					var0.advance(Client.field808); // L: 4327
					MilliClock.scene.drawEntity(class90.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 4328
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4332

	@ObfuscatedName("jk")
	static final void method2707(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 11084
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 11085
		WorldMapData_0.method239(); // L: 11086
		WorldMapSectionType.clientPreferences.field1072 = var0; // L: 11087
		class23.savePreferences(); // L: 11088
	} // L: 11089
}
