import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class92 {
	@ObfuscatedName("z")
	static final BigInteger field1186;
	@ObfuscatedName("k")
	static final BigInteger field1187;
	@ObfuscatedName("g")
	static byte[][] SpriteBuffer_pixels;

	static {
		field1186 = new BigInteger("10001", 16); // L: 6
		field1187 = new BigInteger("966c96603c214f0c82e83159c85817fafbe6be59656eefede88f4b3d88a54a724b2cf5240c069e8654478ce882c03760ca0e6df1b9aa477f1357a6b74f87019581982517b5ade0af529e696b3b4c0ba5b89b4ff13e051485664f934bfb5cc71851706403454af6668eaa8ffc75f37c1e6f9f7fe62c32dad12e06a330baa04413", 16); // L: 7
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "-1472251746"
	)
	static boolean method2141(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 38
			boolean var3 = false; // L: 39
			boolean var4 = false; // L: 40
			int var5 = 0; // L: 41
			int var6 = var0.length(); // L: 42

			for (int var7 = 0; var7 < var6; ++var7) { // L: 43
				char var8 = var0.charAt(var7); // L: 44
				if (var7 == 0) { // L: 45
					if (var8 == '-') { // L: 46
						var3 = true; // L: 47
						continue;
					}

					if (var8 == '+') { // L: 50
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 52
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7'; // L: 53
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 54
						return false; // L: 55
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 56
					return false;
				}

				if (var3) { // L: 57
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 58
				if (var9 / var1 != var5) { // L: 59
					return false;
				}

				var5 = var9; // L: 60
				var4 = true; // L: 61
			}

			return var4; // L: 63
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1375275397"
	)
	public static final void method2142() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 94
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 95
	} // L: 96

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "0"
	)
	public static void method2143(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = Client.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher); // L: 10863
		var4.packetBuffer.writeShort(var1); // L: 10864
		var4.packetBuffer.method5662(0); // L: 10865
		var4.packetBuffer.writeShort(var0); // L: 10866
		var4.packetBuffer.method5644(var2); // L: 10867
		Client.packetWriter.addNode(var4); // L: 10868
	}
}
