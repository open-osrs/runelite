import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gb")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("c")
	final String field2386;
	@ObfuscatedName("u")
	@Export("language")
	final String language;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 311704961
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field2400, 0, "GB"); // L: 10
		Language_DE = new Language("DE", "de", "German", ModeWhere.field2400, 1, "DE"); // L: 11
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field2400, 2, "FR"); // L: 12
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field2400, 3, "BR"); // L: 13
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field2398, 4, "NL"); // L: 14
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field2398, 5, "ES"); // L: 15
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field2400, 6, "MX"); // L: 16
		Language[] var0 = new Language[]{Language_ES_MX, Language_PT, Language_FR, Language_EN, Language_NL, Language_ES, Language_DE}; // L: 25
		Language_valuesOrdered = new Language[var0.length]; // L: 28
		Language[] var2 = var0; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			Language var4 = var2[var3]; // L: 32
			if (Language_valuesOrdered[var4.id] != null) { // L: 34
				throw new IllegalStateException(); // L: 35
			}

			Language_valuesOrdered[var4.id] = var4; // L: 37
		}

	} // L: 41

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field2386 = var1; // L: 44
		this.language = var2; // L: 45
		this.id = var5; // L: 46
		if (var6 != null) { // L: 47
			new Locale(var2.substring(0, 2), var6); // L: 48
		} else {
			new Locale(var2.substring(0, 2)); // L: 51
		}

	} // L: 53

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1347438678"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 56
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 60
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 69
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgb;",
		garbageValue = "1"
	)
	public static Language method3800(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 64 65
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "2079407888"
	)
	static int method3802(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 945
			var0 -= 1000; // L: 946
			var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 947
		} else {
			var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 949
		}

		String var4 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 950
		int[] var5 = null; // L: 951
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 952
			int var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 953
			if (var6 > 0) { // L: 954
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]) { // L: 955 956
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 958
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 960

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 961
			if (var4.charAt(var7 - 1) == 's') { // L: 962
				var8[var7] = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 963
			}
		}

		var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 965
		if (var7 != -1) { // L: 966
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 967
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 968
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 969
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 970
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 971
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 972
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 973
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 974
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 975
			var3.onVarTransmit = var8; // L: 976
			var3.varTransmitTriggers = var5; // L: 977
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 979
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 980
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 981
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 982
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 983
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 984
			var3.onInvTransmit = var8; // L: 985
			var3.invTransmitTriggers = var5; // L: 986
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 988
			var3.onStatTransmit = var8; // L: 989
			var3.statTransmitTriggers = var5; // L: 990
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8; // L: 992
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 993
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 994
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 995
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 996
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 997
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 998
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 999
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1000
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1001
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1002
			var3.field2669 = var8;
		} else {
			if (var0 != ScriptOpcodes.CC_SETONRESIZE) { // L: 1003
				return 2; // L: 1004
			}

			var3.onResize = var8;
		}

		var3.hasListener = true; // L: 1005
		return 1; // L: 1006
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-581351950"
	)
	static void method3791() {
		Client.packetWriter.clearBuffer(); // L: 2840
		Client.packetWriter.packetBuffer.offset = 0; // L: 2841
		Client.packetWriter.serverPacket = null; // L: 2842
		Client.packetWriter.field1348 = null; // L: 2843
		Client.packetWriter.field1339 = null; // L: 2844
		Client.packetWriter.field1350 = null; // L: 2845
		Client.packetWriter.serverPacketLength = 0; // L: 2846
		Client.packetWriter.field1337 = 0; // L: 2847
		Client.rebootTimer = 0; // L: 2848
		AbstractWorldMapData.method375(); // L: 2849
		Client.minimapState = 0; // L: 2850
		Client.destinationX = 0; // L: 2851

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2852
			Client.players[var0] = null;
		}

		PlayerType.localPlayer = null; // L: 2853

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2854
			NPC var1 = Client.npcs[var0]; // L: 2855
			if (var1 != null) { // L: 2856
				var1.targetIndex = -1; // L: 2857
				var1.false0 = false; // L: 2858
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2862
		BuddyRankComparator.updateGameState(30); // L: 2864

		for (var0 = 0; var0 < 100; ++var0) { // L: 2865
			Client.field834[var0] = true;
		}

		Actor.method1855(); // L: 2866
	} // L: 2867

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-450810364"
	)
	static void method3801(Buffer var0) {
		if (Client.randomDatData != null) { // L: 11633
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 11634
		} else {
			byte[] var1 = class92.method2172(); // L: 11637
			var0.writeBytes(var1, 0, var1.length); // L: 11638
		}
	} // L: 11635 11639
}
