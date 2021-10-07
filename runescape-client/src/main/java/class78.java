import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class class78 {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2075053967
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("fj")
	static int[] field1016;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)[Lji;",
		garbageValue = "-55"
	)
	static GameBuild[] method2060() {
		return new GameBuild[]{GameBuild.RC, GameBuild.LIVE, GameBuild.WIP, GameBuild.BUILDLIVE};
	}

	@ObfuscatedName("q")
	static boolean method2061(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L);
		return var2 == 2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-161476490"
	)
	static String method2062() {
		String var0 = "";

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = var0 + var2.sender + ':' + var2.text + '\n') {
			var2 = (Message)var1.next();
		}

		return var0;
	}
}
