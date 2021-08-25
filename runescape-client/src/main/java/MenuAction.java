import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		longValue = 4958938435301166591L
	)
	static long field861;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -637923195
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1711543003
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -699134669
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 208996553
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("o")
	@Export("action")
	String action;

	MenuAction() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1047578495"
	)
	public static void method1875(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-700660843"
	)
	static void method1876(boolean var0) {
		byte var1;
		if (ArchiveDiskActionHandler.client.method1139()) {
			var1 = 10;
		} else {
			var1 = 0;
		}

		Message.method1113(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class274.field3274 = 0;
			AbstractWorldMapIcon.otp = "";
		}

		class131.method2645();
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
