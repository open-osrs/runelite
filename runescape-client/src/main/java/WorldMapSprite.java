import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gw")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("q")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "214577413"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "523339121"
	)
	static int method3866(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class92 var8 = new class92(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field830.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class92 var6 = new class92(var5, var3, var4, HealthBarUpdate.getWidget(var3).itemId);
					Interpreter.field830.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field818 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = HealthBarUpdate.getWidget(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1037 = Interpreter.field818 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1445604382"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field663) {
			class247.midiPcmStream.clear();
			class247.musicPlayerStatus = 1;
			class113.musicTrackArchive = null;
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && WorldMapDecorationType.clientPreferences.musicVolume != 0 && !Client.field663) {
			VertexNormal.method4560(2, Tiles.archive6, var0, 0, WorldMapDecorationType.clientPreferences.musicVolume, false);
		}

		Client.currentTrackGroupId = var0;
	}
}
