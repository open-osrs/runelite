import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	static GameBuild field4063;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("o")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Lmx;I)Ljava/util/HashMap;",
		garbageValue = "489474"
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
				Font var6 = InvDefinition.method2609(this.spritesArchive, this.fontsArchive, var5.name, ""); // L: 30
				if (var6 != null) { // L: 31
					this.map.put(var5, var6); // L: 32
					var2.put(var5, var6); // L: 33
				}
			}
		}

		return var2; // L: 39
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Lbv;",
		garbageValue = "-2048173545"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}
}
