import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("u")
public enum class7 implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	field30(0, 0);

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		signature = "Lfv;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("eb")
	static int[] field28;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -372916347
	)
	public final int field26;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 546495013
	)
	final int field27;

	class7(int var3, int var4) {
		this.field26 = var3;
		this.field27 = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field27;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "-89"
	)
	static final void method95(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		ObjectSound.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(IIS)Z",
		garbageValue = "17445"
	)
	static final boolean method97(int var0, int var1) {
		ObjectDefinition var2 = Canvas.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method4786(var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "669918470"
	)
	static int method100(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapID.method617(KeyHandler.getWidgetClickMask(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		signature = "(S)Z",
		garbageValue = "255"
	)
	static boolean method98() {
		return (Client.drawPlayerNames & 4) != 0;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1244259463"
	)
	static final boolean method94(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "9"
	)
	@Export("FriendSystem_invalidateFriends")
	static final void FriendSystem_invalidateFriends() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInClanChat();
		}

	}
}
