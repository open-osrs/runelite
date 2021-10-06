import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -977331453
	)
	@Export("world")
	public int world;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 245467125
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1269948007
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1337027994"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-932484289"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1790941818"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-942544363"
	)
	static SecureRandom method6152() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}
}
