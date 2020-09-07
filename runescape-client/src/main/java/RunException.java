import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("me")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("z")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("k")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("o")
	@Export("message")
	String message;
	@ObfuscatedName("x")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
