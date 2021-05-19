import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 549299511
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2117222961
	)
	@Export("element")
	int element;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1186749391
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1687767569
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lia;Lia;ILfm;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "168451065"
	)
	@Export("init")
	void init() {
		this.element = AttackOption.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(WorldMapAreaData.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = WorldMapAreaData.WorldMapElement_get(this.getElement()); // L: 26
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
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 39
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Lfl;",
		garbageValue = "-7317"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 43
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 47
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 51
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnk;J)V"
	)
	static void method3181(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1619199647"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class93.pcmPlayer1 != null) { // L: 3677
			class93.pcmPlayer1.run();
		}

		if (WorldMapAreaData.pcmPlayer0 != null) { // L: 3678
			WorldMapAreaData.pcmPlayer0.run();
		}

	} // L: 3679
}
