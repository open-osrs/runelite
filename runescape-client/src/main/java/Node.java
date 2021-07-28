import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("Node")
public class Node {
	@ObfuscatedName("fx")
	@Export("key")
	public long key;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fc")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fi")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
