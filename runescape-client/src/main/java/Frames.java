import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static AbstractArchive field2379;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1948507169
	)
	static int field2377;
	@ObfuscatedName("av")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lge;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 11
		int var6 = var1.getGroupFileCount(var3); // L: 12
		this.frames = new Animation[var6]; // L: 13
		int[] var7 = var1.getGroupFileIds(var3); // L: 14

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 15
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 16
			Skeleton var10 = null; // L: 17
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 18

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 19 20 25
				if (var11 == var12.id) { // L: 21
					var10 = var12; // L: 22
					break;
				}
			}

			if (var10 == null) { // L: 27
				byte[] var13 = var2.getFile(var11, 0); // L: 30
				var10 = new Skeleton(var11, var13); // L: 31
				var5.addFirst(var10); // L: 32
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 34
		}

	} // L: 36

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1224868018"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 39
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1045407302"
	)
	static void method4098(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12072
		if (Client.randomDatData == null) { // L: 12074
			Client.randomDatData = new byte[24];
		}

		class338.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12075
		if (JagexCache.JagexCache_randomDat != null) { // L: 12078
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12080
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 12081
			} catch (Exception var4) { // L: 12083
			}
		}

	} // L: 12086
}
