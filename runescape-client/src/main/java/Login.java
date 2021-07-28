import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("Login")
public class Login {
	@ObfuscatedName("t")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -193523491
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1620372095
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -487781845
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("z")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 511787825
	)
	static int field804;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 758198765
	)
	static int field809;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -759003325
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ao")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("az")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ak")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("aj")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("at")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("af")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ad")
	static boolean field829;
	@ObfuscatedName("ac")
	static boolean field819;
	@ObfuscatedName("bk")
	static boolean field820;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1864245365
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bd")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -912713995
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -24412783
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 649815561
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = 2466470242955211503L
	)
	static long field828;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = -8165033679019885075L
	)
	static long field812;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field804 = -1;
		field809 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field829 = false;
		field819 = false;
		field820 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class98();
		field828 = -1L;
		field812 = -1L;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1564253317"
	)
	public static int method1658(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1194021090"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2654, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
