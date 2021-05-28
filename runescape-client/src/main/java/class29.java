import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class29 implements Callable {
	@ObfuscatedName("d")
	public static short[] field233;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1498703923
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	final Buffer field238;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class31 field235;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class35 this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;Lnd;Lai;)V"
	)
	class29(class35 var1, Buffer var2, class31 var3) {
		this.this$0 = var1; // L: 47
		this.field238 = var2; // L: 48
		this.field235 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field235.vmethod297(this.field238); // L: 53
	}
}
