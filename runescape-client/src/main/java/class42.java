import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("as")
public class class42 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "434210577"
	)
	public static void method525(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1); // L: 13
	} // L: 14

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;",
		garbageValue = "-1290742377"
	)
	public static Object method521(Applet var0, String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, (Object[])null); // L: 17
	}
}
