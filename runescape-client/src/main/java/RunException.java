import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("or")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("o")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -495084017
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -809712213
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("b")
	@Export("message")
	String message;
	@ObfuscatedName("e")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 27
		this.throwable = var1; // L: 28
	} // L: 29
}
