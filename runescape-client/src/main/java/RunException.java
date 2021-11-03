import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pg")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("i")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("w")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1816654499
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -312845881
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("o")
	@Export("message")
	String message;
	@ObfuscatedName("g")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
