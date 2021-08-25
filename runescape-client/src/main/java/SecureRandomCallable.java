import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive12")
	static Archive archive12;

	SecureRandomCallable() {
	}

	public Object call() {
		return FloorOverlayDefinition.method3272();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		FriendSystem.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "32"
	)
	static int method2010(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}
}
