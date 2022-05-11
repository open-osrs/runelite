import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class120 implements class112 {
	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("f")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfx;",
		garbageValue = "-81"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < class344.WorldMapElement_cached.length && class344.WorldMapElement_cached[var0] != null ? class344.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 62 63
	}
}
