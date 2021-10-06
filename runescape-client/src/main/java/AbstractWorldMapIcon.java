import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gz")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -426351163
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1596897089
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1329338621"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Lga;",
		garbageValue = "5309"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1544604408"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "318612621"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1175914629"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1433310024"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1158967973"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = class13.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
				break;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "358371055"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= var3.height + this.screenY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2018731183"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Len;",
		garbageValue = "1432352072"
	)
	public static Clock method3943() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "1775904885"
	)
	static int method3945(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class12.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class392.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = WorldMapDecorationType.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--AbstractByteArrayCopier.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--AbstractByteArrayCopier.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					class54.Interpreter_stringStackSize -= 2;
					--AbstractByteArrayCopier.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--class54.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					WorldMapDecorationType.clientPreferences.windowMode = var3;
					ScriptFrame.savePreferences();
				}

				return 1;
			}
		}
	}
}
