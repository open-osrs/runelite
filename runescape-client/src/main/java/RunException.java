import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mr")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("n")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1196724945
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("y")
	@Export("message")
	String message;
	@ObfuscatedName("h")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
