import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("Task")
public class Task {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("l")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1779285699
	)
	@Export("type")
	int type;
	@ObfuscatedName("d")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("f")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("u")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
