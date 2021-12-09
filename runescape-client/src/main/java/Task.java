import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("Task")
public class Task {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("t")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -610240129
	)
	@Export("type")
	int type;
	@ObfuscatedName("j")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("w")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("n")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
