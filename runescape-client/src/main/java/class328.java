import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public class class328 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1400532526"
	)
	public static void method6056(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 45
	} // L: 46
}
