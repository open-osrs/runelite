import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("y")
public class class25 extends class16 {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2008748649
	)
	static int field197;
	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2084790717
	)
	int field199;
	@ObfuscatedName("o")
	byte field193;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 181056935
	)
	int field192;
	@ObfuscatedName("p")
	String field195;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class25(class19 var1) {
		this.this$0 = var1;
		this.field199 = -1; // L: 124
	} // L: 129

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		var1.readUnsignedByte(); // L: 132
		this.field199 = var1.readUnsignedShort(); // L: 133
		this.field193 = var1.readByte(); // L: 134
		this.field192 = var1.readUnsignedShort(); // L: 135
		var1.readLong(); // L: 136
		this.field195 = var1.readStringCp1252NullTerminated(); // L: 137
		var1.readUnsignedByte(); // L: 138
	} // L: 139

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		class9 var2 = (class9)var1.field27.get(this.field199); // L: 142
		var2.field66 = this.field193; // L: 143
		var2.field64 = this.field192; // L: 144
		var2.field65 = this.field195; // L: 145
	} // L: 146

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-33"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 683
		Login.Login_response2 = "Enter your username/email & password."; // L: 684
		Login.Login_response3 = ""; // L: 685
		Login.loginIndex = 2; // L: 686
		if (var0) { // L: 687
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 689
			if (Login.clientPreferences.rememberedUsername != null) { // L: 690
				Login.Login_username = Login.clientPreferences.rememberedUsername; // L: 691
				Client.Login_isUsernameRemembered = true; // L: 692
			} else {
				Client.Login_isUsernameRemembered = false; // L: 694
			}
		}

		Canvas.method481(); // L: 696
	} // L: 697

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1554369565"
	)
	static int method350(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3413
			class16.Interpreter_intStackSize -= 2; // L: 3414
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3415
			int var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3416
			if (!Client.isCameraLocked) { // L: 3417
				Client.camAngleX = var3; // L: 3418
				Client.camAngleY = var4; // L: 3419
			}

			return 1; // L: 3421
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3423
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3424
			return 1; // L: 3425
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3427
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3428
			return 1; // L: 3429
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3431
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3432
			if (var3 < 0) { // L: 3433
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3434
			return 1; // L: 3435
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3437
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3438
			return 1; // L: 3439
		} else {
			return 2; // L: 3441
		}
	}
}
