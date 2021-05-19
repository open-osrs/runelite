import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("Node")
public class Node {
	@ObfuscatedName("fs")
	@Export("key")
	public long key;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("ef")
	@Export("remove")
	public void remove() {
		if (this.next != null) { // L: 9
			this.next.previous = this.previous; // L: 10
			this.previous.next = this.next; // L: 11
			this.previous = null; // L: 12
			this.next = null; // L: 13
		}
	} // L: 14

	@ObfuscatedName("eh")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null; // L: 17
	}
}
