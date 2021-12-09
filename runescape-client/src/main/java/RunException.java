import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qg")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("c")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("b")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 70250403
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("s")
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
