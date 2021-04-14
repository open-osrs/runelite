import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class29 implements Callable {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 254933769
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	final Buffer field216;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class31 field215;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class35 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;Lnu;Lat;)V"
	)
	class29(class35 var1, Buffer var2, class31 var3) {
		this.this$0 = var1; // L: 47
		this.field216 = var2; // L: 48
		this.field215 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field215.vmethod389(this.field216); // L: 53
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)V",
		garbageValue = "1142852074"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field810) { // L: 11035
			Client.field811[var0.rootIndex] = true; // L: 11036
		}

	} // L: 11038
}
