import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 4690351
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1083128331
	)
	@Export("health")
	int health;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1681269367
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1073400791
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1606460707"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}
}
