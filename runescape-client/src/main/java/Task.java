import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("Task")
public class Task {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("z")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1399267459
	)
	@Export("type")
	int type;
	@ObfuscatedName("k")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("c")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("u")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
