import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	static ClanChannel field1147;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 605141689
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1897441913
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method4887(var1) || this.archive.method4884(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lei;",
		garbageValue = "598444391"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "1961168244"
	)
	static final boolean method2059(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 156
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 157
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 158
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false; // L: 159
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 160
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 161
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 162
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 163
				}
			}
		}
	}
}
