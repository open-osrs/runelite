import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class196 {
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-333035229"
	)
	public static byte[] method3888(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? method3889(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbe;",
		garbageValue = "-162700802"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = FaceNormal.method4396(var1, var0);
		Script var4 = Tiles.method2023(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (-3 - var2 << 8) + var0;
			var4 = Tiles.method2023(var5, var0);
			return var4 != null ? var4 : null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-74"
	)
	public static byte[] method3889(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	static final void method3881() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		GraphicsDefaults.addGameMessage(30, "", var0);
	}
}
