import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qc")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("c")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("v")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -906997917
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 47816443
	)
	public static int field4839;
	@ObfuscatedName("e")
	@Export("message")
	String message;
	@ObfuscatedName("g")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 28
		this.throwable = var1; // L: 29
	} // L: 30
}
