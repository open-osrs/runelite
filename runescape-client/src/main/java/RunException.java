import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ot")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("h")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("c")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 259723493
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("l")
	@Export("message")
	String message;
	@ObfuscatedName("z")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
