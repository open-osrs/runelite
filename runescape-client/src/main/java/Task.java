import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("Task")
public class Task {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("l")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1479560879
	)
	@Export("type")
	int type;
	@ObfuscatedName("w")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("f")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("o")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
