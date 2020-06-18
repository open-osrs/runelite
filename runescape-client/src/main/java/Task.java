import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("Task")
public class Task {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lfa;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("p")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -681465255
	)
	@Export("type")
	int type;
	@ObfuscatedName("n")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("u")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("a")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
