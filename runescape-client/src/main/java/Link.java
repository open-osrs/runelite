import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("Link")
public class Link {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("m")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}
