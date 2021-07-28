import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oa")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("s")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("v")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 655178051
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("n")
	@Export("message")
	String message;
	@ObfuscatedName("w")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
