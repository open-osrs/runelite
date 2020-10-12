import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("me")
public class RunException extends RuntimeException {
	@ObfuscatedName("z")
	public static Applet RunException_applet;
	@ObfuscatedName("k")
	public static String localPlayerName;
	@ObfuscatedName("o")
	String message;
	@ObfuscatedName("x")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
