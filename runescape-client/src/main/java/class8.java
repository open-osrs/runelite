import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class8 implements Callable {
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 796418753
	)
	static int field43;
	@ObfuscatedName("pv")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	final Buffer field45;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class12 field42;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class9 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;Lkf;Lh;)V"
	)
	class8(class9 var1, Buffer var2, class12 var3) {
		this.this$0 = var1; // L: 47
		this.field45 = var2; // L: 48
		this.field42 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field42.vmethod127(this.field45); // L: 53
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-552632511"
	)
	static void method105() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 119
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 120
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 121
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 122
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 123
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 124
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 125
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 126
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 127
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 128
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 129
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 130
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 131
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 134
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 138
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 139
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 140
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 141
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 142
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 143
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 144
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 145
		}

	} // L: 147
}
