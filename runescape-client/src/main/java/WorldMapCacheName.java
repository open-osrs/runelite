import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final WorldMapCacheName field2128;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final WorldMapCacheName field2123;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final WorldMapCacheName field2124;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static final WorldMapCacheName field2122;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final WorldMapCacheName field2126;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -159166525
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("z")
	@Export("name")
	public final String name;

	static {
		field2128 = new WorldMapCacheName("details"); // L: 4
		field2123 = new WorldMapCacheName("compositemap"); // L: 5
		field2124 = new WorldMapCacheName("compositetexture"); // L: 6
		field2122 = new WorldMapCacheName("area"); // L: 7
		field2126 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "-1988606956"
	)
	static String method3646(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 67
			RunException var2 = (RunException)var0; // L: 68
			var1 = var2.message + " | "; // L: 69
			var0 = var2.throwable; // L: 70
		} else {
			var1 = ""; // L: 72
		}

		StringWriter var12 = new StringWriter(); // L: 73
		PrintWriter var3 = new PrintWriter(var12); // L: 74
		var0.printStackTrace(var3); // L: 75
		var3.close(); // L: 76
		String var4 = var12.toString(); // L: 77
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 78
		String var6 = var5.readLine(); // L: 79

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 81
				if (var7 == null) { // L: 82
					var1 = var1 + "| " + var6; // L: 100
					return var1; // L: 101
				}

				int var8 = var7.indexOf(40); // L: 83
				int var9 = var7.indexOf(41, var8 + 1); // L: 84
				if (var8 >= 0 && var9 >= 0) { // L: 85
					String var10 = var7.substring(var8 + 1, var9); // L: 86
					int var11 = var10.indexOf(".java:"); // L: 87
					if (var11 >= 0) { // L: 88
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 89
						var1 = var1 + var10 + ' '; // L: 90
						continue; // L: 91
					}

					var7 = var7.substring(0, var8); // L: 93
				}

				var7 = var7.trim(); // L: 95
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 96
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 97
				var1 = var1 + var7 + ' '; // L: 98
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	static void method3648() {
		if (PrivateChatMode.loadWorlds()) { // L: 1546
			Login.worldSelectOpen = true; // L: 1547
			Login.worldSelectPage = 0; // L: 1548
			Login.worldSelectPagesCount = 0; // L: 1549
		}

	} // L: 1551

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "-991343714"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3814
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3815
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3816
				if (var3 == null) { // L: 3817
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3818
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3819
				if (var3.contains(var4, var5)) { // L: 3820
					var4 -= var3.width / 2; // L: 3821
					var5 -= var3.height / 2; // L: 3822
					int var6 = Client.camAngleY & 2047; // L: 3823
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3824
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3825
					int var9 = var7 * var5 + var4 * var8 >> 11; // L: 3826
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 3827
					int var11 = var9 + class35.localPlayer.x >> 7; // L: 3828
					int var12 = class35.localPlayer.y - var10 >> 7; // L: 3829
					PacketBufferNode var13 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2582, Client.packetWriter.isaacCipher); // L: 3831
					var13.packetBuffer.writeByte(18); // L: 3832
					var13.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3833
					var13.packetBuffer.writeShort(var12 + Messages.baseY); // L: 3834
					var13.packetBuffer.writeShort(var11 + JagexCache.baseX); // L: 3835
					var13.packetBuffer.writeByte(var4); // L: 3836
					var13.packetBuffer.writeByte(var5); // L: 3837
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3838
					var13.packetBuffer.writeByte(57); // L: 3839
					var13.packetBuffer.writeByte(0); // L: 3840
					var13.packetBuffer.writeByte(0); // L: 3841
					var13.packetBuffer.writeByte(89); // L: 3842
					var13.packetBuffer.writeShort(class35.localPlayer.x); // L: 3843
					var13.packetBuffer.writeShort(class35.localPlayer.y); // L: 3844
					var13.packetBuffer.writeByte(63); // L: 3845
					Client.packetWriter.addNode(var13); // L: 3846
					Client.destinationX = var11; // L: 3847
					Client.destinationY = var12; // L: 3848
				}
			}

		}
	} // L: 3851
}
