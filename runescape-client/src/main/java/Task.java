import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("Task")
public class Task {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("f")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -71704813
	)
	@Export("type")
	int type;
	@ObfuscatedName("e")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("g")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("w")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 10
	} // L: 22
}
