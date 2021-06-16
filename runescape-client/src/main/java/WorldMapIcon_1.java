import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1566048417
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -211441443
	)
	@Export("element")
	int element;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1002959697
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 711676767
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;ILfn;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-819350446"
	)
	@Export("init")
	void init() {
		this.element = Tiles.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(Archive.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = Archive.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1717389517"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 39
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lfd;",
		garbageValue = "1736510941"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 43
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 47
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-401407374"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Ljava/lang/String;",
		garbageValue = "242028315"
	)
	public static String method3304(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 67
			if (var2 > 32767) { // L: 68
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 69
			var0.offset += class250.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 70
			String var4 = Actor.decodeStringCp1252(var3, 0, var2); // L: 71
			var1 = var4; // L: 72
		} catch (Exception var6) { // L: 74
			var1 = "Cabbage"; // L: 75
		}

		return var1; // L: 78
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjp;IIIZI)V",
		garbageValue = "-554182310"
	)
	public static void method3300(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class233.musicPlayerStatus = 1; // L: 50
		InvDefinition.musicTrackArchive = var1; // L: 51
		class233.musicTrackGroupId = var2; // L: 52
		class233.musicTrackFileId = var3; // L: 53
		class233.musicTrackVolume = var4; // L: 54
		GrandExchangeOfferUnitPriceComparator.musicTrackBoolean = var5; // L: 55
		FaceNormal.pcmSampleLength = var0; // L: 56
	} // L: 57

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1274785577"
	)
	static void method3305(int var0) {
		class29.tempMenuAction = new MenuAction(); // L: 11004
		class29.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11005
		class29.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11006
		class29.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11007
		class29.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11008
		class29.tempMenuAction.action = Client.menuActions[var0]; // L: 11009
	} // L: 11010
}
