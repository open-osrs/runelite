import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 683087729
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1027855045
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 791610257
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1555115433
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("r")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 12200

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkq;IIIZB)V",
		garbageValue = "-93"
	)
	public static void method1894(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class265.musicPlayerStatus = 1; // L: 34
		class265.musicTrackArchive = var0; // L: 35
		class265.musicTrackGroupId = var1; // L: 36
		class140.musicTrackFileId = var2; // L: 37
		class167.musicTrackVolume = var3; // L: 38
		MusicPatch.musicTrackBoolean = var4; // L: 39
		GrandExchangeOfferNameComparator.pcmSampleLength = 10000; // L: 40
	} // L: 41

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1125693830"
	)
	static void method1895() {
		class424.clientPreferences.field1231 = Client.field699; // L: 12164
		GameEngine.savePreferences(); // L: 12165
	} // L: 12166
}
