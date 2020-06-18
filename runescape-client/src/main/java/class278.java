import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jj")
public class class278 {
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	public static class247 field3585;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(ILcs;ZB)I",
		garbageValue = "73"
	)
	static int method5158(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
