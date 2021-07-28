import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1898626955
	)
	@Export("group")
	int group;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1929991669
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	boolean field947;

	InterfaceParent() {
		this.field947 = false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnv;II)V",
		garbageValue = "-1906984930"
	)
	public static void method1798(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
