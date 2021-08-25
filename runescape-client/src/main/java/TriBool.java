import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1385101768"
	)
	public static int method6080(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
