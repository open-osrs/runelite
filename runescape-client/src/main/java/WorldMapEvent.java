import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -687726109
	)
	static int field380;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lme;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 477038655
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILhd;Lhd;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-852874949"
	)
	public static void method851() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 117
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 118
	} // L: 119

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	public static void method850() {
		Widget.Widget_cachedSprites.clear(); // L: 720
		Widget.Widget_cachedModels.clear(); // L: 721
		Widget.Widget_cachedFonts.clear(); // L: 722
		Widget.Widget_cachedSpriteMasks.clear(); // L: 723
	} // L: 724

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
		garbageValue = "-21"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9001
			if (Client.menuOptionsCount < 500) { // L: 9002
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9003
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9004
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9005
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9006
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9007
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9008
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9009
				++Client.menuOptionsCount; // L: 9010
			}

		}
	} // L: 9012
}
