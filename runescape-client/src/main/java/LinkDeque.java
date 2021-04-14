import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("LinkDeque")
public class LinkDeque {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("sentinel")
	Link sentinel;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("current")
	Link current;

	public LinkDeque() {
		this.sentinel = new Link(); // L: 6
		this.sentinel.previous = this.sentinel; // L: 10
		this.sentinel.next = this.sentinel; // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lmc;)V"
	)
	@Export("addFirst")
	public void addFirst(Link var1) {
		if (var1.next != null) { // L: 15
			var1.remove();
		}

		var1.next = this.sentinel.next; // L: 16
		var1.previous = this.sentinel; // L: 17
		var1.next.previous = var1; // L: 18
		var1.previous.next = var1; // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lmc;"
	)
	@Export("last")
	public Link last() {
		Link var1 = this.sentinel.previous; // L: 23
		if (var1 == this.sentinel) { // L: 24
			this.current = null; // L: 25
			return null; // L: 26
		} else {
			this.current = var1.previous; // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "()Lmc;"
	)
	@Export("previous")
	public Link previous() {
		Link var1 = this.current; // L: 33
		if (var1 == this.sentinel) { // L: 34
			this.current = null; // L: 35
			return null; // L: 36
		} else {
			this.current = var1.previous; // L: 38
			return var1; // L: 39
		}
	}
}
