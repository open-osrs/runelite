import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qo")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("v")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("c")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 176570919
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("b")
	@Export("message")
	String message;
	@ObfuscatedName("n")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
