import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class Link {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	public Link previous;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	public Link next;

	@ObfuscatedName("z")
	public void remove() {
		if (this.next != null) { // L: 8
			this.next.previous = this.previous; // L: 9
			this.previous.next = this.next; // L: 10
			this.previous = null; // L: 11
			this.next = null; // L: 12
		}
	} // L: 13
}
