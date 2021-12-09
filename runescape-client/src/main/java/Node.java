import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("Node")
public class Node {
	@ObfuscatedName("fc")
	@Export("key")
	public long key;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fe")
	@Export("remove")
	public void remove() {
		if (this.next != null) { // L: 9
			this.next.previous = this.previous; // L: 10
			this.previous.next = this.next; // L: 11
			this.previous = null; // L: 12
			this.next = null; // L: 13
		}
	} // L: 14

	@ObfuscatedName("fu")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null; // L: 17
	}
}
