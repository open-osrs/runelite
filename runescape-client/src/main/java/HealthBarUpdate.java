import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -1732657831
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -901271755
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -317308411
	)
	@Export("health")
	int health;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1457157311
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1509184493
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1706471519"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "-125"
	)
	static int method2142(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class87.getWidget(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
		}

		Actor.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class129.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			class240.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class65.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3089 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3089;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "63"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				ArchiveDiskActionHandler.client.method465();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				class135.method2672(0);
				Client.field546 = 0;
				Client.field516 = 0;
				Client.timer.method5827(var0);
				if (var0 != 20) {
					Varcs.method2303(false);
				}
			}

			if (var0 != 20 && var0 != 40 && NetCache.field3738 != null) {
				NetCache.field3738.close();
				NetCache.field3738 = null;
			}

			if (Client.gameState == 25) {
				Client.field545 = 0;
				Client.field639 = 0;
				Client.field656 = 1;
				Client.field641 = 0;
				Client.field544 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class184.method3725(MouseRecorder.archive10, World.archive8, true, var1);
				} else if (var0 == 11) {
					class184.method3725(MouseRecorder.archive10, World.archive8, false, 4);
				} else if (Login.clearLoginScreen) {
					Login.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					Login.runesSprite = null;
					class318.leftTitleSprite = null;
					Login.rightTitleSprite = null;
					class394.logoSprite = null;
					class92.title_muteSprite = null;
					ModelData0.options_buttons_0Sprite = null;
					Client.options_buttons_2Sprite = null;
					DevicePcmPlayerProvider.worldSelectBackSprites = null;
					WorldMapSection1.worldSelectFlagSprites = null;
					World.worldSelectArrows = null;
					class7.worldSelectStars = null;
					class275.field3281 = null;
					Login.loginScreenRunesAnimation.method2151();
					class16.method218(2);
					if (NetCache.NetCache_socket != null) {
						try {
							Buffer var3 = new Buffer(4);
							var3.writeByte(2);
							var3.writeMedium(0);
							NetCache.NetCache_socket.write(var3.array, 0, 4);
						} catch (IOException var5) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var4) {
							}

							++NetCache.NetCache_ioExceptions;
							NetCache.NetCache_socket = null;
						}
					}

					Login.clearLoginScreen = false;
				}
			} else {
				var1 = WorldMapAreaData.method3903() ? 0 : 12;
				class184.method3725(MouseRecorder.archive10, World.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IIII)V",
		garbageValue = "1416325930"
	)
	static void method2148(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && VarbitComposition.clientPreferences.areaSoundEffectsVolume != 0) {
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
