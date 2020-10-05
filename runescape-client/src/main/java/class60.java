import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class60 {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	public static FriendSystem friendSystem;
	@ObfuscatedName("z")
	static Applet applet;
	@ObfuscatedName("k")
	static String field451;
	@ObfuscatedName("a")
	static int[] field453;
	@ObfuscatedName("ah")
	protected static String null_string;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -1192539033
	)
	static int field456;

	static {
		applet = null; // L: 10
		field451 = ""; // L: 11
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-14"
	)
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 164
			if (KeyHandler.field423 == KeyHandler.field399) { // L: 165
				return false;
			} else {
				PlayerAppearance.field2581 = KeyHandler.field420[KeyHandler.field423]; // L: 166
				PacketWriter.field1350 = KeyHandler.field419[KeyHandler.field423]; // L: 167
				KeyHandler.field423 = KeyHandler.field423 + 1 & 127; // L: 168
				return true; // L: 169
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-34"
	)
	static final int method947(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 825
		int var4 = var0 & var2 - 1; // L: 826
		int var5 = var1 / var2; // L: 827
		int var6 = var1 & var2 - 1; // L: 828
		int var7 = TileItem.method2206(var3, var5); // L: 829
		int var8 = TileItem.method2206(var3 + 1, var5); // L: 830
		int var9 = TileItem.method2206(var3, var5 + 1); // L: 831
		int var10 = TileItem.method2206(var3 + 1, var5 + 1); // L: 832
		int var11 = ArchiveDisk.method5991(var7, var8, var4, var2); // L: 833
		int var12 = ArchiveDisk.method5991(var9, var10, var4, var2); // L: 834
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 837
		int var13 = ((65536 - var14) * var11 >> 16) + (var14 * var12 >> 16); // L: 838
		return var13; // L: 840
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IS)V",
		garbageValue = "15262"
	)
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2626 == null) { // L: 934
			throw new RuntimeException(); // L: 935
		} else {
			if (var0.field2661 == null) { // L: 937
				var0.field2661 = new int[var0.field2626.length]; // L: 938
			}

			var0.field2661[var1] = Integer.MAX_VALUE; // L: 940
		}
	} // L: 941

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "877979774"
	)
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 884
			var1 /= 2;
		}

		if (var2 > 192) { // L: 885
			var1 /= 2;
		}

		if (var2 > 217) { // L: 886
			var1 /= 2;
		}

		if (var2 > 243) { // L: 887
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 888
		return var3; // L: 889
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "-1719664383"
	)
	static void method937(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 10815
		if (Client.randomDatData == null) { // L: 10817
			Client.randomDatData = new byte[24];
		}

		class310.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 10818
		if (JagexCache.JagexCache_randomDat != null) { // L: 10821
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 10823
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 10824
			} catch (Exception var4) { // L: 10826
			}
		}

	} // L: 10829
}
