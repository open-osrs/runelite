import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-973245062"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "904483746"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "1921148390"
	)
	static long method2870(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "932253973"
	)
	static final int method2867(int var0, int var1) {
		int var2 = SoundSystem.method758(var0 - 1, var1 - 1) + SoundSystem.method758(1 + var0, var1 - 1) + SoundSystem.method758(var0 - 1, 1 + var1) + SoundSystem.method758(1 + var0, 1 + var1);
		int var3 = SoundSystem.method758(var0 - 1, var1) + SoundSystem.method758(var0 + 1, var1) + SoundSystem.method758(var0, var1 - 1) + SoundSystem.method758(var0, var1 + 1);
		int var4 = SoundSystem.method758(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "21127071"
	)
	public static void method2864() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}
}
