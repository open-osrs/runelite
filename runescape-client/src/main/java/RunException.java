import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mr")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("m")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("o")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2064059247
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 810638289
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("p")
	@Export("message")
	String message;
	@ObfuscatedName("g")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
