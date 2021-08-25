import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ps")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("n")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("c")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 766573411
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -604740487
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("f")
	static int[] field4410;
	@ObfuscatedName("o")
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
