import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1350330504"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2026134141"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgc;",
		garbageValue = "1"
	)
	public static FloorOverlayDefinition method3349(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 28
			var1 = new FloorOverlayDefinition(); // L: 29
			if (var2 != null) { // L: 30
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 31
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}
}
