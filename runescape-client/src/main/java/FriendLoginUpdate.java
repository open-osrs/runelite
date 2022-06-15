import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 105823237
	)
	public int field4300;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("q")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lqa;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4300 = (int)(class115.method2692() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lpx;",
		garbageValue = "-1096065009"
	)
	public static class437 method6631(int var0) {
		class437 var1 = (class437)class437.Widget_cachedSprites.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class437.field4675.takeFile(38, var0); // L: 26
			var1 = new class437(); // L: 27
			if (var2 != null) { // L: 28
				var1.method7635(new Buffer(var2));
			}

			var1.method7636(); // L: 29
			class437.Widget_cachedSprites.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	static final void method6632(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString(); // L: 135
		class290.addGameMessage(30, "", var1); // L: 137
	} // L: 139
}
