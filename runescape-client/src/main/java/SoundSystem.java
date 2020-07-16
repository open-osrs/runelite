import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dg")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 140612879
	)
	static int field1466;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "[Llz;"
	)
	@Export("headIconHintSprites")
	static Sprite[] headIconHintSprites;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Ldt;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class197.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "101"
	)
	public static int method2628(int var0) {
		return class279.method5159(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-123"
	)
	public static void method2629() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < WorldMapDecoration.idxCount; ++var0) {
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1398391910"
	)
	static int method2630(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = WorldMapSprite.getWidget(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
		}

		if (var0 == ScriptOpcodes.CC_CALLONRESIZE) {
			if (Interpreter.field1132 >= 10) {
				throw new RuntimeException();
			} else if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var4 = new ScriptEvent();
				var4.widget = var3;
				var4.args = var3.onResize;
				var4.field600 = Interpreter.field1132 + 1;
				Client.scriptEvents.addFirst(var4);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
