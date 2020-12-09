import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("Task")
public class Task {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("t")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2137331087
	)
	@Export("type")
	int type;
	@ObfuscatedName("n")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("p")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("l")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
