import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class175 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("scene")
	static Scene scene;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2044568477"
	)
	public static void method3380() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 47
	} // L: 48

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lbo;",
		garbageValue = "-586854513"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-482569171"
	)
	public static void method3379() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 77
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 78
	} // L: 79

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "1857595187"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9911
			if (Client.menuOptionsCount < 500) { // L: 9912
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9913
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9914
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9915
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9916
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9917
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9918
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9919
				++Client.menuOptionsCount; // L: 9920
			}

		}
	} // L: 9922

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (WorldMapDecoration.loadInterface(var0)) { // L: 10200
			BuddyRankComparator.field1408 = null; // L: 10207
			ViewportMouse.drawInterface(NetSocket.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10208
			if (BuddyRankComparator.field1408 != null) { // L: 10209
				ViewportMouse.drawInterface(BuddyRankComparator.field1408, -1412584499, var1, var2, var3, var4, class151.field1729, class162.field1810, var7); // L: 10210
				BuddyRankComparator.field1408 = null; // L: 10211
			}

		} else {
			if (var7 != -1) { // L: 10201
				Client.field652[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10203
					Client.field652[var8] = true;
				}
			}

		}
	} // L: 10205 10213

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1703551260"
	)
	static final void method3373() {
		Client.field691 = Client.cycleCntr; // L: 12434
		Tiles.field997 = true; // L: 12435
	} // L: 12436
}
