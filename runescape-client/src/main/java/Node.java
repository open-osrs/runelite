import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("Node")
public class Node {
	@ObfuscatedName("fy")
	@Export("key")
	public long key;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
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

	@ObfuscatedName("ff")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
