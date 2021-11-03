import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ae")
public class class27 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-1032442444"
	)
	public static void method393(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1); // L: 13
	} // L: 14

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1889226474"
	)
	public static Object method394(Applet var0, String var1, Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2); // L: 17
	}
}
