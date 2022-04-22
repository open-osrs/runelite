import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 47
		var2.nextInt(); // L: 48
		return var2; // L: 51
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2044012999"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = UserComparator6.method2643(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(CLlo;I)I",
		garbageValue = "522647287"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 169
			if (KeyHandler.field138 == KeyHandler.field141) { // L: 170
				return false;
			} else {
				GameEngine.field218 = KeyHandler.field136[KeyHandler.field141]; // L: 171
				ItemComposition.field2121 = KeyHandler.field135[KeyHandler.field141]; // L: 172
				KeyHandler.field141 = KeyHandler.field141 + 1 & 127; // L: 173
				return true; // L: 174
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lbb;",
		garbageValue = "-771048331"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return class305.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1734362021"
	)
	static final void method2050() {
		Client.field702 = Client.cycleCntr; // L: 12375
		Interpreter.ClanChat_inClanChat = true; // L: 12376
	} // L: 12377
}
