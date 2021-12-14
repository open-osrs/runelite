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
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fu")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
