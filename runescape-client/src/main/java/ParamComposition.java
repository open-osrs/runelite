import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("d")
	@Export("type")
	char type;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -551037179
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("y")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("h")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1000046844"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "1362546091"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "1500921565"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			byte var4 = var1.readByte(); // L: 48
			int var5 = var4 & 255; // L: 50
			if (var5 == 0) { // L: 51
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 52
				char var6 = class298.cp1252AsciiExtension[var5 - 128]; // L: 53
				if (var6 == 0) { // L: 54
					var6 = '?';
				}

				var5 = var6; // L: 55
			}

			char var3 = (char)var5; // L: 57
			this.type = var3; // L: 59
		} else if (var2 == 2) { // L: 61
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 62
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 63
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 65

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "31310"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1478943473"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 4883
			int var3 = WorldMapRegion.getTileHeight(var0, var1, class90.Client_plane) - var2; // L: 4888
			var0 -= SecureRandomFuture.cameraX; // L: 4889
			var3 -= ArchiveLoader.cameraY; // L: 4890
			var1 -= ObjectSound.cameraZ; // L: 4891
			int var4 = Rasterizer3D.Rasterizer3D_sine[KeyHandler.cameraPitch]; // L: 4892
			int var5 = Rasterizer3D.Rasterizer3D_cosine[KeyHandler.cameraPitch]; // L: 4893
			int var6 = Rasterizer3D.Rasterizer3D_sine[class39.cameraYaw]; // L: 4894
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class39.cameraYaw]; // L: 4895
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 4896
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 4897
			var0 = var8; // L: 4898
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 4899
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 4900
			if (var1 >= 50) { // L: 4902
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 4903
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 4904
			} else {
				Client.viewportTempX = -1; // L: 4907
				Client.viewportTempY = -1; // L: 4908
			}

		} else {
			Client.viewportTempX = -1; // L: 4884
			Client.viewportTempY = -1; // L: 4885
		}
	} // L: 4886 4910
}
