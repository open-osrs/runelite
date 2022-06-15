import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lgl;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6]; // L: 37
		int[] var7 = var1.getGroupFileIds(var3); // L: 38

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 49
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-473814926"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	public static int method4349() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;[II)[Ljava/lang/Object;",
		garbageValue = "746047274"
	)
	static Object[] method4353(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart(); // L: 30
		Object[] var3 = new Object[var1.length * var2]; // L: 31

		for (int var4 = 0; var4 < var2; ++var4) { // L: 32
			for (int var5 = 0; var5 < var1.length; ++var5) { // L: 33
				int var6 = var1.length * var4 + var5; // L: 34
				class432 var7 = MusicPatchNode.method5472(var1[var5]); // L: 35
				var3[var6] = var7.method7565(var0); // L: 36
			}
		}

		return var3; // L: 39
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "20"
	)
	static int method4350(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field845 - 7.0D) * 256.0D); // L: 3851
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Z",
		garbageValue = "-824638040"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12305
	}
}
