import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("Task")
public class Task {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("r")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1152952207
	)
	@Export("type")
	int type;
	@ObfuscatedName("i")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("w")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("v")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
