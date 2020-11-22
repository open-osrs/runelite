import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("l")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Lko;I)Ljava/util/HashMap;",
		garbageValue = "1654438568"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap(); // L: 20
		FontName[] var3 = var1; // L: 22

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 23
			FontName var5 = var3[var4]; // L: 24
			if (this.map.containsKey(var5)) { // L: 26
				var2.put(var5, this.map.get(var5)); // L: 27
			} else {
				Font var6 = TilePaint.method3210(this.spritesArchive, this.fontsArchive, var5.name, ""); // L: 30
				if (var6 != null) { // L: 31
					this.map.put(var5, var6); // L: 32
					var2.put(var5, var6); // L: 33
				}
			}
		}

		return var2; // L: 39
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1606902213"
	)
	static final void method5463(int var0, int var1, int var2, boolean var3) {
		if (ScriptFrame.loadInterface(var0)) { // L: 9885
			SecureRandomFuture.resizeInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 9886
		}
	} // L: 9887
}
