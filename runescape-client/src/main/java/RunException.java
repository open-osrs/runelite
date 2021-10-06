import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ps")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("l")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("q")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2072562331
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1605520639
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("m")
	@Export("message")
	String message;
	@ObfuscatedName("k")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
