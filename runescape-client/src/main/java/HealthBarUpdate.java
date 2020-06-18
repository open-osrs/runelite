import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Ldh;"
	)
	@Export("pcmPlayerProvider")
	static PlayerProvider pcmPlayerProvider;
	@ObfuscatedName("k")
	static int[][][] field1031;
	@ObfuscatedName("ak")
	static Image field1033;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -166528229
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1062047839
	)
	@Export("health")
	int health;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -374720445
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 257618229
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "880697270"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}
}
