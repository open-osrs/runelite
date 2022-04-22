import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("Task")
public class Task {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("b")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 692855731
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("l")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("q")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
