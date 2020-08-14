import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, (byte)3);

	@ObfuscatedName("au")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 2013764495
	)
	static int field174;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -870801305
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -159728419
	)
	@Export("type")
	final int type;
	@ObfuscatedName("g")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "267980652"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		UrlRequest.method3426(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILic;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "-2120164920"
	)
	public static void method306(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.getGroupId(var2);
		int var7 = var1.getFileId(var6, var3);
		MenuAction.playMusicTrack(var0, var1, var6, var7, var4, var5);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-230874976"
	)
	public static void method312() {
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

	}
}
