import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("z")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;B)I",
		garbageValue = "46"
	)
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIB)[Lls;",
		garbageValue = "20"
	)
	public static IndexedSprite[] method3515(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			Occluder.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		return !var3 ? null : class307.method5558(); // L: 33 34
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgd;",
		garbageValue = "-755062190"
	)
	public static class194[] method3518() {
		return new class194[]{class194.field2371, class194.field2362, class194.field2363, class194.field2370, class194.field2365, class194.field2366, class194.field2364, class194.field2368, class194.field2361, class194.field2367}; // L: 17
	}
}
