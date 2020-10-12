import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class Buddy extends User {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1220284933
	)
	public int world;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -224698591
	)
	public int int2;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -263202513
	)
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-580421822"
	)
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907221261"
	)
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "4837"
	)
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1739727093"
	)
	static boolean method5277(int var0) {
		for (int var1 = 0; var1 < Client.field898; ++var1) { // L: 10103
			if (Client.field900[var1] == var0) { // L: 10104
				return true;
			}
		}

		return false; // L: 10106
	}
}
