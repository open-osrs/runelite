import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1564822049
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 396108399
	)
	@Export("health")
	int health;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1574607109
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1966461257
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1017297352"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Lei;",
		garbageValue = "-1737036949"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1474231876"
	)
	public static int method1894(int var0, int var1, int var2) {
		int var3 = class118.method2461(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
