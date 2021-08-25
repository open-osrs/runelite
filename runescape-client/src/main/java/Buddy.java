import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 382223653
	)
	@Export("world")
	public int world;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1852682519
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -775599793
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-892218760"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1235616558"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-478268789"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
