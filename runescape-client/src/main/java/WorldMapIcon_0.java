import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("r")
	public static short[] field2300;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -500474045
	)
	@Export("element")
	final int element;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1264890287
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1575477647
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lks;Lks;ILho;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = UserComparator7.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "364835409"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 30
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lho;",
		garbageValue = "-32"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 34
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-915724910"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 38
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1982860019"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 42
	}
}
