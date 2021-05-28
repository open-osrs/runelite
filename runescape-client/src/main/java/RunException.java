import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oz")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("v")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("n")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1454650143
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2094073605
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("p")
	@Export("message")
	String message;
	@ObfuscatedName("j")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
