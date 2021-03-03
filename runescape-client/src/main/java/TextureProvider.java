import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lep;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1670453341
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1122848717
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("y")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 705511283
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		int var8 = var7.length;
		this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 24

		for (int var9 = 0; var9 < var8; ++var9) {
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
			this.textures[var7[var9]] = new Texture(var10);
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2013656553"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0; // L: 32
		int var2 = 0; // L: 33
		Texture[] var3 = this.textures;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			Texture var5 = var3[var4];
			if (var5 != null && var5.fileIds != null) { // L: 39
				var1 += var5.fileIds.length; // L: 40
				int[] var6 = var5.fileIds; // L: 42

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 43
					int var8 = var6[var7]; // L: 44
					if (this.archive.method4366(var8)) { // L: 46
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

	@ObfuscatedName("v")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 60
		this.clear(); // L: 61
	} // L: 62

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1068759988"
	)
	@Export("getTexturePixels")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1400851651"
	)
	public boolean vmethod3432(int var1) {
		return this.textures[var1].field1639; // L: 93
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1467632569"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 97
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1656047073"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 101
			if (this.textures[var1] != null) { // L: 102
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 104
		this.remaining = this.capacity; // L: 105
	} // L: 106

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-39"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 109
			Texture var3 = this.textures[var2]; // L: 110
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 111
				var3.animate(var1); // L: 112
				var3.isLoaded = false; // L: 113
			}
		}

	} // L: 116

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkx;Llg;I)Llg;",
		garbageValue = "-2095404981"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) {
			var3 = GameObject.method3452(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) { // L: 25
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;Lig;I)V",
		garbageValue = "-729858984"
	)
	public static void method2935(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 35
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 36
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2; // L: 37
	} // L: 38

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "-4181"
	)
	public static int method2914(int var0, int var1, int var2) {
		var2 &= 3; // L: 17
		if (var2 == 0) { // L: 18
			return var1;
		} else if (var2 == 1) { // L: 19
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0; // L: 20
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "-32"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 88
		if (var3) { // L: 89
			var5 |= 65536L;
		}

		return var5; // L: 90
	}
}
