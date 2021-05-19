import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("Link")
public class Link {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("h")
	@Export("remove")
	public void remove() {
		if (this.next != null) { // L: 8
			this.next.previous = this.previous; // L: 9
			this.previous.next = this.next; // L: 10
			this.previous = null; // L: 11
			this.next = null; // L: 12
		}
	} // L: 13
}
