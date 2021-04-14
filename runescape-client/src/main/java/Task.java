import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("Task")
public class Task {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("b")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -576884369
	)
	@Export("type")
	int type;
	@ObfuscatedName("k")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("g")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("h")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
