import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("Node")
public class Node {
	@ObfuscatedName("fa")
	@Export("key")
	public long key;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("ep")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("en")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
