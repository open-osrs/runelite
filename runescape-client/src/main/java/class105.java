import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class105 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1657910779"
	)
	public static void method2358(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 42
			try {
				Buffer var1 = new Buffer(4); // L: 44
				var1.writeByte(var0 ? 2 : 3); // L: 45
				var1.writeMedium(0); // L: 46
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 47
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 51
				} catch (Exception var3) { // L: 53
				}

				++NetCache.NetCache_ioExceptions; // L: 54
				NetCache.NetCache_socket = null; // L: 55
			}

		}
	} // L: 57

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIIZI)V",
		garbageValue = "1271786262"
	)
	public static void method2357(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class233.musicPlayerStatus = 1; // L: 34
		InvDefinition.musicTrackArchive = var0; // L: 35
		class233.musicTrackGroupId = var1; // L: 36
		class233.musicTrackFileId = var2; // L: 37
		class233.musicTrackVolume = var3; // L: 38
		GrandExchangeOfferUnitPriceComparator.musicTrackBoolean = var4; // L: 39
		FaceNormal.pcmSampleLength = 10000; // L: 40
	} // L: 41

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1162856506"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 162
	}
}
