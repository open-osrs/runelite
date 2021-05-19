import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("Task")
public class Task {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("l")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1573135753
	)
	@Export("type")
	int type;
	@ObfuscatedName("t")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("v")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("b")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 11
	} // L: 23
}
