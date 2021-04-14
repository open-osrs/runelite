import java.applet.Applet;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cq")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("f")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("g")
	static byte[][][] field1106;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return class238.method4380(); // L: 45
	}
}
