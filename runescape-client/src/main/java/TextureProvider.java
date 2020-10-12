import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 1518116289
	)
	static int field1561;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	Texture[] textures;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	NodeDeque deque;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1194513141
	)
	int capacity;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1829748835
	)
	int remaining;
	@ObfuscatedName("i")
	double brightness;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -436241833
	)
	int textureSize;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4; // L: 20
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		int var8 = var7.length;
		this.textures = new Texture[var1.getGroupFileCount(0)];

		for (int var9 = 0; var9 < var8; ++var9) {
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 26
			this.textures[var7[var9]] = new Texture(var10);
		}

	} // L: 29

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "861798052"
	)
	public int getLoadedPercentage() {
		int var1 = 0; // L: 32
		int var2 = 0; // L: 33
		Texture[] var3 = this.textures; // L: 35

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 36
			Texture var5 = var3[var4]; // L: 37
			if (var5 != null && var5.fileIds != null) { // L: 39
				var1 += var5.fileIds.length; // L: 40
				int[] var6 = var5.fileIds;

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 43
					int var8 = var6[var7]; // L: 44
					if (this.archive.method4251(var8)) { // L: 46
						++var2; // L: 47
					}
				}
			}
		}

		if (var1 == 0) { // L: 55
			return 0;
		} else {
			return var2 * 100 / var1; // L: 56
		}
	}

	@ObfuscatedName("k")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 60
		this.clear(); // L: 61
	} // L: 62

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1265290789"
	)
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 65
		if (var2 != null) { // L: 66
			if (var2.pixels != null) { // L: 67
				this.deque.addLast(var2); // L: 68
				var2.isLoaded = true; // L: 69
				return var2.pixels; // L: 70
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive); // L: 72
			if (var3) { // L: 73
				if (this.remaining == 0) { // L: 74
					Texture var4 = (Texture)this.deque.removeFirst(); // L: 75
					var4.reset(); // L: 76
				} else {
					--this.remaining; // L: 78
				}

				this.deque.addLast(var2); // L: 79
				var2.isLoaded = true; // L: 80
				return var2.pixels; // L: 81
			}
		}

		return null; // L: 84
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "260599249"
	)
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 88 89
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "168595235"
	)
	public boolean vmethod3396(int var1) {
		return this.textures[var1].field1647; // L: 93
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "14506"
	)
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 97
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 101
			if (this.textures[var1] != null) { // L: 102
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 104
		this.remaining = this.capacity; // L: 105
	} // L: 106

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-736148510"
	)
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 109
			Texture var3 = this.textures[var2]; // L: 110
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 111
				var3.animate(var1); // L: 112
				var3.isLoaded = false; // L: 113
			}
		}

	} // L: 116

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "194887508"
	)
	public static boolean method2876(int var0) {
		return var0 >= WorldMapDecorationType.field2760.id && var0 <= WorldMapDecorationType.field2757.id || var0 == WorldMapDecorationType.field2761.id; // L: 42
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([Lgq;II)Lgq;",
		garbageValue = "1374231902"
	)
	public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
		Enumerated[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			Enumerated var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Lij;",
		garbageValue = "38"
	)
	public static GameBuild method2863(int var0) {
		GameBuild[] var1 = IgnoreList.method5182(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) {
				return var3; // L: 27
			}
		}

		return null; // L: 31
	}
}
