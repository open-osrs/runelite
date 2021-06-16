import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -543167351
	)
	final int field1943;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -12875383
	)
	final int field1948;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -210309675
	)
	final int field1945;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field1943 = var1; // L: 19
		this.field1948 = var2; // L: 20
		this.field1945 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1269824536"
	)
	boolean method3278(float var1) {
		return var1 >= (float)this.field1945; // L: 25
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfg;",
		garbageValue = "589843549"
	)
	static WorldMapLabelSize[] method3280() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_medium, WorldMapLabelSize_large}; // L: 15
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfg;",
		garbageValue = "2"
	)
	static WorldMapLabelSize method3281(int var0) {
		WorldMapLabelSize[] var1 = method3280(); // L: 30

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 31
			WorldMapLabelSize var3 = var1[var2]; // L: 32
			if (var0 == var3.field1948) { // L: 34
				return var3; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;Ljava/lang/String;I)[Lof;",
		garbageValue = "652881992"
	)
	public static IndexedSprite[] method3268(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 44
		int var4 = var0.getFileId(var3, var2); // L: 45
		IndexedSprite[] var5;
		if (!Message.method1263(var0, var3, var4)) { // L: 48
			var5 = null; // L: 49
		} else {
			IndexedSprite[] var7 = new IndexedSprite[class397.SpriteBuffer_spriteCount]; // L: 54

			for (int var8 = 0; var8 < class397.SpriteBuffer_spriteCount; ++var8) { // L: 55
				IndexedSprite var9 = var7[var8] = new IndexedSprite(); // L: 56
				var9.width = class397.SpriteBuffer_spriteWidth; // L: 57
				var9.height = class244.SpriteBuffer_spriteHeight; // L: 58
				var9.xOffset = class397.SpriteBuffer_xOffsets[var8]; // L: 59
				var9.yOffset = class26.SpriteBuffer_yOffsets[var8]; // L: 60
				var9.subWidth = Canvas.SpriteBuffer_spriteWidths[var8]; // L: 61
				var9.subHeight = Clock.SpriteBuffer_spriteHeights[var8]; // L: 62
				var9.palette = class397.SpriteBuffer_spritePalette; // L: 63
				var9.pixels = class126.SpriteBuffer_pixels[var8]; // L: 64
			}

			ArchiveDisk.method5993(); // L: 66
			var5 = var7; // L: 69
		}

		return var5; // L: 71
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "191984233"
	)
	static final void method3274() {
		int var0 = Players.Players_count; // L: 4078
		int[] var1 = Players.Players_indices; // L: 4079

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4080
			Player var3 = Client.players[var1[var2]]; // L: 4081
			if (var3 != null) { // L: 4082
				World.updateActorSequence(var3, 1); // L: 4083
			}
		}

	} // L: 4086

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V",
		garbageValue = "-2040471803"
	)
	static final void method3279(Actor var0) {
		if (var0.field1269 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > WorldMapScaleHandler.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 4182
			int var1 = var0.field1269 - var0.field1276; // L: 4183
			int var2 = Client.cycle - var0.field1276; // L: 4184
			int var3 = var0.field1225 * 64 + var0.field1264 * 128; // L: 4185
			int var4 = var0.field1225 * 64 + var0.field1268 * 128; // L: 4186
			int var5 = var0.field1225 * 64 + var0.field1265 * 128; // L: 4187
			int var6 = var0.field1225 * 64 + var0.field1267 * 128; // L: 4188
			var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1; // L: 4189
			var0.y = (var2 * var6 + var4 * (var1 - var2)) / var1; // L: 4190
		}

		var0.field1242 = 0; // L: 4192
		var0.orientation = var0.field1270; // L: 4193
		var0.rotation = var0.orientation; // L: 4194
	} // L: 4195

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "([Liv;Liv;ZI)V",
		garbageValue = "-1843640686"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1327325403 * -1727030445 : var1.width * 1476009263 * -527414833; // L: 9936
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * 845859575 * -2062739769 : var1.height * -1001050535 * 25115113; // L: 9937
		DynamicObject.resizeInterface(var0, var1.id, var3, var4, var2); // L: 9938
		if (var1.children != null) { // L: 9939
			DynamicObject.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 9940
		if (var5 != null) { // L: 9941
			JagexCache.method2637(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) { // L: 9942
		}

	} // L: 9943
}
