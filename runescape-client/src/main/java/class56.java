import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bc")
public class class56 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1898995849"
	)
	public static Object method944(Applet var0, String var1, Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2); // L: 13
	}
}
