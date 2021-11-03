import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public enum class6 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	field14(0, 0);

	@ObfuscatedName("ql")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1812774783
	)
	public final int field12;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 947219699
	)
	final int field13;

	class6(int var3, int var4) {
		this.field12 = var3; // L: 16
		this.field13 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field13; // L: 21
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1975834785"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}
}
