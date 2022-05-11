import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class162 {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 415868235
	)
	static int field1810;
	@ObfuscatedName("k")
	public String field1803;
	@ObfuscatedName("a")
	public float[] field1804;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1916139913
	)
	public int field1811;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 311501729
	)
	public int field1806;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1324402861
	)
	public int field1807;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leq;)V"
	)
	class162(class155 var1) {
		this.this$0 = var1;
		this.field1804 = new float[4]; // L: 318
		this.field1811 = 1; // L: 319
		this.field1806 = 1; // L: 320
		this.field1807 = 0; // L: 321
	} // L: 323

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-734766672"
	)
	public static void method3209() {
		if (KeyHandler.KeyHandler_instance != null) { // L: 124
			synchronized(KeyHandler.KeyHandler_instance) { // L: 125
				KeyHandler.KeyHandler_instance = null; // L: 126
			} // L: 127
		}

	} // L: 129

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "124"
	)
	public static PacketBufferNode method3208() {
		PacketBufferNode var0 = FloorOverlayDefinition.method3700();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "-8"
	)
	static boolean method3207(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 39
			boolean var3 = false; // L: 40
			boolean var4 = false; // L: 41
			int var5 = 0; // L: 42
			int var6 = var0.length(); // L: 43

			for (int var7 = 0; var7 < var6; ++var7) { // L: 44
				char var8 = var0.charAt(var7); // L: 45
				if (var7 == 0) { // L: 46
					if (var8 == '-') { // L: 47
						var3 = true; // L: 48
						continue;
					}

					if (var8 == '+') { // L: 51
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 53
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 54
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 55
						return false; // L: 56
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 57
					return false;
				}

				if (var3) { // L: 58
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 59
				if (var9 / var1 != var5) { // L: 60
					return false;
				}

				var5 = var9; // L: 61
				var4 = true; // L: 62
			}

			return var4; // L: 64
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
