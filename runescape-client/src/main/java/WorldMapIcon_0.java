import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	public static class248 field148;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2114229287
	)
	static int field146;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("az")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("gk")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 660088057
	)
	@Export("element")
	final int element;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1542772613
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 112630785
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhs;Lhs;ILah;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = UserComparator10.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-359753179"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lah;",
		garbageValue = "1889474780"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 34
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-79"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 38
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1082591682"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 42
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljd;",
		garbageValue = "-1562808952"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition) NPCComposition.NpcDefinition_cached.get((long)var0); // L: 62
		if (var1 != null) { // L: 63
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 64
			var1 = new NPCComposition(); // L: 65
			var1.id = var0; // L: 66
			if (var2 != null) { // L: 67
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 68
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 69
			return var1; // L: 70
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "1525295907"
	)
	public static final void method270(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 49
			PcmPlayer.field1443 = var0; // L: 50
			PcmPlayer.PcmPlayer_stereo = var1; // L: 51
			PcmPlayer.field1424 = var2; // L: 52
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 53
}
