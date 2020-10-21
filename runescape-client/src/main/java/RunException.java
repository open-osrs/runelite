import java.applet.Applet;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mp")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("f")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 303873541
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("c")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("z")
	@Export("message")
	String message;
	@ObfuscatedName("q")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
