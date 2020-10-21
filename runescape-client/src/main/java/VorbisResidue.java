import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dj")
@Implements("VorbisResidue")
public class VorbisResidue {
	@ObfuscatedName("f")
	@Export("residueType")
	int residueType;
	@ObfuscatedName("b")
	@Export("begin")
	int begin;
	@ObfuscatedName("l")
	@Export("end")
	int end;
	@ObfuscatedName("m")
	@Export("partitionSize")
	int partitionSize;
	@ObfuscatedName("z")
	@Export("classifications")
	int classifications;
	@ObfuscatedName("q")
	@Export("classbook")
	int classbook;
	@ObfuscatedName("k")
	@Export("cascade")
	int[] cascade;

	VorbisResidue() {
		this.residueType = VorbisSample.readBits(16); // L: 15
		this.begin = VorbisSample.readBits(24); // L: 16
		this.end = VorbisSample.readBits(24); // L: 17
		this.partitionSize = VorbisSample.readBits(24) + 1; // L: 18
		this.classifications = VorbisSample.readBits(6) + 1; // L: 19
		this.classbook = VorbisSample.readBits(8); // L: 20
		int[] var1 = new int[this.classifications]; // L: 21

		int var2;
		for (var2 = 0; var2 < this.classifications; ++var2) { // L: 22
			int var3 = 0; // L: 23
			int var4 = VorbisSample.readBits(3); // L: 24
			boolean var5 = VorbisSample.readBit() != 0; // L: 25
			if (var5) { // L: 26
				var3 = VorbisSample.readBits(5);
			}

			var1[var2] = var3 << 3 | var4; // L: 27
		}

		this.cascade = new int[this.classifications * 8]; // L: 29

		for (var2 = 0; var2 < this.classifications * 8; ++var2) { // L: 30
			this.cascade[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? VorbisSample.readBits(8) : -1;
		}

	} // L: 31

	@ObfuscatedName("f")
	void method2656(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4) { // L: 34
			var1[var4] = 0.0F;
		}

		if (!var3) { // L: 35
			var4 = VorbisSample.VorbisSample_codebooks[this.classbook].dimensions; // L: 36
			int var5 = this.end - this.begin; // L: 37
			int var6 = var5 / this.partitionSize; // L: 38
			int[] var7 = new int[var6]; // L: 39

			for (int var8 = 0; var8 < 8; ++var8) { // L: 40
				int var9 = 0; // L: 41

				while (var9 < var6) { // L: 42
					int var10;
					int var11;
					if (var8 == 0) { // L: 43
						var10 = VorbisSample.VorbisSample_codebooks[this.classbook].method2472(); // L: 45

						for (var11 = var4 - 1; var11 >= 0; --var11) { // L: 46
							if (var9 + var11 < var6) { // L: 47
								var7[var9 + var11] = var10 % this.classifications;
							}

							var10 /= this.classifications; // L: 48
						}
					}

					for (var10 = 0; var10 < var4; ++var10) { // L: 52
						var11 = var7[var9]; // L: 54
						int var12 = this.cascade[var8 + var11 * 8]; // L: 55
						if (var12 >= 0) { // L: 56
							int var13 = var9 * this.partitionSize + this.begin; // L: 57
							VorbisCodebook var14 = VorbisSample.VorbisSample_codebooks[var12]; // L: 58
							int var15;
							if (this.residueType == 0) { // L: 59
								var15 = this.partitionSize / var14.dimensions; // L: 60

								for (int var19 = 0; var19 < var15; ++var19) { // L: 61
									float[] var20 = var14.method2473(); // L: 62

									for (int var18 = 0; var18 < var14.dimensions; ++var18) { // L: 63
										var1[var13 + var19 + var18 * var15] += var20[var18];
									}
								}
							} else {
								var15 = 0; // L: 67

								while (var15 < this.partitionSize) { // L: 68
									float[] var16 = var14.method2473(); // L: 69

									for (int var17 = 0; var17 < var14.dimensions; ++var17) { // L: 70
										var1[var13 + var15] += var16[var17]; // L: 71
										++var15; // L: 72
									}
								}
							}
						}

						++var9; // L: 78
						if (var9 >= var6) { // L: 79
							break;
						}
					}
				}
			}

		}
	} // L: 83
}
