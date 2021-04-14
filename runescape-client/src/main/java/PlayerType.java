import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	field3226(6, 22, false, false, true);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1018159087
	)
	@Export("id")
	final int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 210736671
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("n")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("l")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 24
		this.modIcon = var4; // L: 25
		this.isPrivileged = var6; // L: 26
		this.isUser = var7; // L: 27
	} // L: 28

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 31
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	public static void method4414() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 58
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 59
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 60
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 61
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 62
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 63
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 64
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 65
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 66
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 67
		}
	} // L: 69

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-96"
	)
	static final void method4410() {
		boolean var0 = false; // L: 8967

		while (!var0) { // L: 8968
			var0 = true; // L: 8969

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 8970
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 8971
					String var2 = Client.menuTargets[var1]; // L: 8972
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 8973
					Client.menuTargets[var1 + 1] = var2; // L: 8974
					String var3 = Client.menuActions[var1]; // L: 8975
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 8976
					Client.menuActions[var1 + 1] = var3; // L: 8977
					int var4 = Client.menuOpcodes[var1]; // L: 8978
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 8979
					Client.menuOpcodes[var1 + 1] = var4; // L: 8980
					var4 = Client.menuArguments1[var1]; // L: 8981
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 8982
					Client.menuArguments1[var1 + 1] = var4; // L: 8983
					var4 = Client.menuArguments2[var1]; // L: 8984
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 8985
					Client.menuArguments2[var1 + 1] = var4; // L: 8986
					var4 = Client.menuIdentifiers[var1]; // L: 8987
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 8988
					Client.menuIdentifiers[var1 + 1] = var4; // L: 8989
					boolean var5 = Client.menuShiftClick[var1]; // L: 8990
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 8991
					Client.menuShiftClick[var1 + 1] = var5; // L: 8992
					var0 = false; // L: 8993
				}
			}
		}

	} // L: 8997
}
