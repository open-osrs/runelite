import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bf")
public class class56 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-1802347359"
	)
	public static void method919(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}
}
