import net.runelite.mapping.Export;
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
	@Export("next")
	Task next;
	@ObfuscatedName("i")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1774016279
	)
	@Export("type")
	int type;
	@ObfuscatedName("x")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("w")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("g")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
