import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("TilePaint")
public final class TilePaint {
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -120739893
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2010588443
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 276331811
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 249410369
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 911673263
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1767061331
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("g")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1091728871
	)
	@Export("rgb")
	int rgb;

	TilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "1631719470"
	)
	public static int method3187(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "215317048"
	)
	public static void method3186() {
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "6"
	)
	static void method3188() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}
}
