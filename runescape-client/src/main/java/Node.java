import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("Node")
public class Node {
	@ObfuscatedName("cm")
	@Export("key")
	public long key;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fx")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fy")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
