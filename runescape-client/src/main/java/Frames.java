import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("q")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 35
		int var6 = var1.getGroupFileCount(var3); // L: 36
		this.frames = new Animation[var6]; // L: 37
		int[] var7 = var1.getGroupFileIds(var3); // L: 38

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 39
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2054162856"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FFFF[FB)V",
		garbageValue = "1"
	)
	static void method4316(float var0, float var1, float var2, float var3, float[] var4) {
		float var5 = var1 - var0; // L: 318
		float var6 = var2 - var1; // L: 319
		float var7 = var3 - var2; // L: 320
		float var8 = var6 - var5; // L: 321
		var4[3] = var7 - var6 - var8; // L: 322
		var4[2] = var8 + var8 + var8; // L: 323
		var4[1] = var5 + var5 + var5; // L: 324
		var4[0] = var0; // L: 325
	} // L: 326

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Z",
		garbageValue = "-1456881202"
	)
	static final boolean method4319(Widget var0) {
		int var1 = var0.contentType; // L: 11529
		if (var1 == 205) { // L: 11530
			Client.logoutTimer = 250; // L: 11531
			return true; // L: 11532
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11534
				var2 = (var1 - 300) / 2; // L: 11535
				var3 = var1 & 1; // L: 11536
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11537
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11539
				var2 = (var1 - 314) / 2; // L: 11540
				var3 = var1 & 1; // L: 11541
				Client.playerAppearance.method5610(var2, var3 == 1); // L: 11542
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 11544
			}

			if (var1 == 325) { // L: 11545
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11546
				PacketBufferNode var4 = ItemContainer.getPacketBufferNode(ClientPacket.field2896, Client.packetWriter.isaacCipher); // L: 11548
				Client.playerAppearance.write(var4.packetBuffer); // L: 11549
				Client.packetWriter.addNode(var4); // L: 11550
				return true; // L: 11551
			} else {
				return false; // L: 11553
			}
		}
	}
}
