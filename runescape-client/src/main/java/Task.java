import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("Task")
public class Task {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("a")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 179289705
	)
	@Export("type")
	int type;
	@ObfuscatedName("p")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("s")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("r")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
