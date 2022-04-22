import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lhg;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1377781691
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2008251437
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("b")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 24561521
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2; // L: 17
		this.capacity = var3; // L: 18
		this.remaining = this.capacity; // L: 19
		this.brightness = var4; // L: 20
		this.textureSize = var6; // L: 21
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		int var8 = var7.length; // L: 23
		this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 24

		for (int var9 = 0; var9 < var8; ++var9) { // L: 25
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 26
			this.textures[var7[var9]] = new Texture(var10); // L: 27
		}

	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-728191973"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0; // L: 32
		int var2 = 0; // L: 33
		Texture[] var3 = this.textures; // L: 35

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 36
			Texture var5 = var3[var4]; // L: 37
			if (var5 != null && var5.fileIds != null) {
				var1 += var5.fileIds.length;
				int[] var6 = var5.fileIds;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					int var8 = var6[var7];
					if (this.archive.method5864(var8)) {
						++var2;
					}
				}
			}
		}

		if (var1 == 0) {
			return 0;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("c")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	} // L: 62

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1291576532"
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
				var2.isLoaded = true;
				return var2.pixels;
			}
		}

		return null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-200927796"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 88 89
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1510277471"
	)
	public boolean vmethod5096(int var1) {
		return this.textures[var1].field2511; // L: 93
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1828440657"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 97
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-17643"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-115024983"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "-202742127"
	)
	static boolean method4963(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 38
			boolean var3 = false; // L: 39
			boolean var4 = false; // L: 40
			int var5 = 0; // L: 41
			int var6 = var0.length(); // L: 42

			for (int var7 = 0; var7 < var6; ++var7) { // L: 43
				char var8 = var0.charAt(var7); // L: 44
				if (var7 == 0) { // L: 45
					if (var8 == '-') { // L: 46
						var3 = true; // L: 47
						continue;
					}

					if (var8 == '+') { // L: 50
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 52
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 53
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 54
						return false; // L: 55
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 56
					return false;
				}

				if (var3) { // L: 57
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 58
				if (var9 / var1 != var5) { // L: 59
					return false;
				}

				var5 = var9; // L: 60
				var4 = true; // L: 61
			}

			return var4; // L: 63
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "1605"
	)
	static String method4950() {
		StringBuilder var0 = new StringBuilder(); // L: 80

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 81 87
			var2 = (Message)var1.next(); // L: 82
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 84
				var0.append(var2.sender).append(':'); // L: 85
			}
		}

		return var0.toString(); // L: 90
	}
}
