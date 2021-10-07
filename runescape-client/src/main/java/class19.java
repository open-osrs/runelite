import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("z")
public class class19 {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1814549023
	)
	static int field98;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("l")
	Future field101;
	@ObfuscatedName("q")
	String field99;

	class19(Future var1) {
		this.field101 = var1;
	}

	class19(String var1) {
		this.method283(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-12672"
	)
	void method283(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field99 = var1;
		if (this.field101 != null) {
			this.field101.cancel(true);
			this.field101 = null;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1388329625"
	)
	public final String method295() {
		return this.field99;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2125398132"
	)
	public boolean method285() {
		return this.field99 != null || this.field101 == null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-93162153"
	)
	public final boolean method286() {
		return this.method285() ? true : this.field101.isDone();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Lo;",
		garbageValue = "255"
	)
	public final class21 method287() {
		if (this.method285()) {
			return new class21(this.field99);
		} else if (!this.method286()) {
			return null;
		} else {
			try {
				return (class21)this.field101.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method283(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-556332656"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class274.sortWorlds(class386.World_worlds, 0, class386.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljd;",
		garbageValue = "-2"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_ultimateIronman, PlayerType.field3657, PlayerType.field3654, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3658, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal};
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "2070378051"
	)
	static int method299(int var0, Script var1, boolean var2) {
		Widget var3 = HealthBarUpdate.getWidget(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
