import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class45 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Laq;",
		garbageValue = "666653269"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "105"
	)
	public static Object method372(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1444491208"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
