import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("Task")
public class Task {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("m")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 538482785
	)
	@Export("type")
	int type;
	@ObfuscatedName("t")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("a")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("e")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
