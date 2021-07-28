import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class339 implements class344 {
	@ObfuscatedName("j")
	static byte[][][] field3936;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	public final class364 field3935;

	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	class339(class365 var1) {
		this.field3935 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lmh;)V"
	)
	public class339(class340 var1) {
		this(new class365(var1));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "25"
	)
	public int method6059(int var1) {
		return this.field3935.vmethod6433(var1);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	static void method6057() {
		if (Client.oculusOrbState == 1) {
			Client.field489 = true;
		}

	}
}
