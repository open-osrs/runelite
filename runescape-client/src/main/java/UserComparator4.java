import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fr")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)I",
		garbageValue = "-1246089706"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;II)Lhk;",
		garbageValue = "1936937358"
	)
	static MusicPatch method3497(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 21
		return var2 == null ? null : new MusicPatch(var2); // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;I)Z",
		garbageValue = "-301606279"
	)
	public static boolean method3504(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1; // L: 44
		if (!var0.isFullyLoaded()) { // L: 45
			return false; // L: 46
		} else {
			NPC.WorldMapElement_count = var0.getGroupFileCount(35); // L: 48
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[NPC.WorldMapElement_count]; // L: 49

			for (int var2 = 0; var2 < NPC.WorldMapElement_count; ++var2) { // L: 50
				byte[] var3 = var0.takeFile(35, var2); // L: 51
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2); // L: 52
				if (var3 != null) { // L: 53
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3)); // L: 54
					WorldMapElement.WorldMapElement_cached[var2].method4518(); // L: 55
				}
			}

			return true; // L: 58
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lht;",
		garbageValue = "-45"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 195
		int var2 = var0 & 65535; // L: 196
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) { // L: 197
			boolean var3 = ScriptFrame.loadInterface(var1); // L: 198
			if (!var3) { // L: 199
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2]; // L: 201
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-1942076594"
	)
	static int method3506(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 1104
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1105
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.itemId; // L: 1106
			return 1; // L: 1107
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1109
			if (var3.itemId != -1) { // L: 1110
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1111
			}

			return 1; // L: 1112
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1114
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1115
			return 1; // L: 1116
		} else {
			return 2; // L: 1118
		}
	}
}
