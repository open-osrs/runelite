import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bj")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1758275927
	)
	static int field666;
	@ObfuscatedName("m")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ls;Ls;I)I",
		garbageValue = "646157510"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "987190791"
	)
	static int method1342(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			var4 = WorldMapSprite.getWidget(var3);
		} else {
			var4 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			UrlRequester.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 3];
			class234.invalidateWidget(var4);
			WorldMapSectionType.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				WorldMapIcon_0.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			UrlRequester.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 3];
			class234.invalidateWidget(var4);
			WorldMapSectionType.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				WorldMapIcon_0.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class234.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		signature = "(Ljm;IIII)V",
		garbageValue = "1251688899"
	)
	@Export("addSequenceSoundEffect")
	static void addSequenceSoundEffect(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Client.areaSoundEffectVolume != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var5 = var4 >> 8;
					int var6 = var4 >> 4 & 7;
					int var7 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var5;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var8 = (var2 - 64) / 128;
					int var9 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}
}
