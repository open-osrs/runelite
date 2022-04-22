import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1439678685
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1837597233
	)
	@Export("element")
	int element;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 129612535
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 325263315
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lks;Lks;ILgd;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1679326087"
	)
	@Export("init")
	void init() {
		this.element = class146.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(UserComparator7.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = UserComparator7.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "364835409"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 39
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lho;",
		garbageValue = "-32"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 43
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-915724910"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 47
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1982860019"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 51
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)Ljava/lang/String;",
		garbageValue = "50"
	)
	static String method3933(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart(); // L: 65
			if (var2 > var1) { // L: 66
				var2 = var1;
			}

			byte[] var3 = new byte[var2]; // L: 67
			var0.offset += class282.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 68
			String var4 = class118.decodeStringCp1252(var3, 0, var2); // L: 69
			return var4; // L: 70
		} catch (Exception var6) { // L: 72
			return "Cabbage"; // L: 73
		}
	}
}
