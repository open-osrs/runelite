import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("v")
	static String[] field590;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -228767789
	)
	@Export("group")
	int group;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -109575985
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	boolean field587;

	InterfaceParent() {
		this.field587 = false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Llz;",
		garbageValue = "-72"
	)
	static Sprite method1233(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (Sprite)var3.get(var4);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lbu;I)V",
		garbageValue = "-764301386"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		WorldMapLabel.runScript(var0, 500000);
	}
}
