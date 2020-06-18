import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1985828823
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1983032759
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1818060675
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1999145911
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 386133029
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1588520035
	)
	int field956;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1476403807
	)
	int field957;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1658497211
	)
	@Export("id")
	int id;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1422873381
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1345962763
	)
	int field962;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -577159519
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 790870073
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lic;Ljava/lang/String;Ljava/lang/String;I)[Llh;",
		garbageValue = "574747014"
	)
	public static IndexedSprite[] method1806(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return HealthBar.method2125(var0, var3, var4);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Lhd;I[B[BI)V",
		garbageValue = "-1571904788"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2647 == null) {
			if (var2 == null) {
				return;
			}

			var0.field2647 = new byte[11][];
			var0.field2678 = new byte[11][];
			var0.field2679 = new int[11];
			var0.field2680 = new int[11];
		}

		var0.field2647[var1] = var2;
		if (var2 != null) {
			var0.field2709 = true;
		} else {
			var0.field2709 = false;

			for (int var4 = 0; var4 < var0.field2647.length; ++var4) {
				if (var0.field2647[var4] != null) {
					var0.field2709 = true;
					break;
				}
			}
		}

		var0.field2678[var1] = var3;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "556274205"
	)
	static int method1808(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else {
			return 2;
		}
	}
}
