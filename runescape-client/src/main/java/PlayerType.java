import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jd")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	field3657(6, 22, false, false, true),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	field3658(7, 41, false, false, true),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	field3654(8, 42, false, false, true);

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	static Widget field3661;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1199460545
	)
	@Export("id")
	final int id;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 84538647
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("w")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("g")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "74"
	)
	static int method5153(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
