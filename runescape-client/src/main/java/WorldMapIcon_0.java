import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -956371221
	)
	@Export("element")
	final int element;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2031981367
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1919685021
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;ILip;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class120.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "1420245554"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "102"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1663406998"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1424752711"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3800
			ApproximateRouteStrategy.method1110(); // L: 3801
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class12.clientPreferences.method2248() != 0 && !Client.playingJingle) { // L: 3803
			Archive var1 = AbstractUserComparator.archive6; // L: 3804
			int var2 = class12.clientPreferences.method2248(); // L: 3805
			class273.musicPlayerStatus = 1; // L: 3807
			ClanChannelMember.musicTrackArchive = var1; // L: 3808
			StructComposition.musicTrackGroupId = var0; // L: 3809
			FriendsList.musicTrackFileId = 0; // L: 3810
			Clock.musicTrackVolume = var2; // L: 3811
			VertexNormal.musicTrackBoolean = false; // L: 3812
			GrandExchangeEvent.pcmSampleLength = 2; // L: 3813
		}

		Client.currentTrackGroupId = var0; // L: 3816
	} // L: 3817
}
