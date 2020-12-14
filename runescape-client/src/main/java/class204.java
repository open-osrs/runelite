import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class204 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static IndexedSprite field2408;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILhs;ZB)V",
		garbageValue = "78"
	)
	static void method3721(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = Actor.getWorldMap().getMapArea(var0); // L: 3917
		int var4 = PlayerComposition.localPlayer.plane; // L: 3918
		int var5 = (PlayerComposition.localPlayer.x >> 7) + NetFileRequest.baseX; // L: 3919
		int var6 = (PlayerComposition.localPlayer.y >> 7) + class41.baseY; // L: 3920
		Coord var7 = new Coord(var4, var5, var6); // L: 3921
		Actor.getWorldMap().method6485(var3, var7, var1, var2); // L: 3922
	} // L: 3923
}
