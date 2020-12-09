import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("Node")
public class Node {
	@ObfuscatedName("cu")
	@Export("key")
	public long key;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fg")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fd")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
