import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("Task")
public class Task {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	Task next;
	@ObfuscatedName("i")
	public volatile int status;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1774016279
	)
	int type;
	@ObfuscatedName("x")
	public int intArgument;
	@ObfuscatedName("w")
	Object objectArgument;
	@ObfuscatedName("g")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
