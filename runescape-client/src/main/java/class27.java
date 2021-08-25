import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ad")
public class class27 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-536254708"
	)
	public static void method397(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;",
		garbageValue = "38"
	)
	public static Object method398(Applet var0, String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, (Object[])null);
	}
}
