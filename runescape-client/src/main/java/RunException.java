import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qy")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("c")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("l")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -942468637
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("r")
	@Export("message")
	String message;
	@ObfuscatedName("o")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
