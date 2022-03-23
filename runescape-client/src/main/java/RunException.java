import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qe")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("v")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("o")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 261481045
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1885069325
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("d")
	static byte[][][] field4754;
	@ObfuscatedName("l")
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
