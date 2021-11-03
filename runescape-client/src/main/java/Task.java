import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("Task")
public class Task {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("o")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1160823875
	)
	@Export("type")
	int type;
	@ObfuscatedName("e")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("p")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("j")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
