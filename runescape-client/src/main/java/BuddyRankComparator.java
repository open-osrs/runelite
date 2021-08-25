import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("db")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lmm;Lmm;I)I",
		garbageValue = "1027451516"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "28"
	)
	public static String method2456(CharSequence var0) {
		long var3 = 0L;
		int var5 = var0.length();

		for (int var6 = 0; var6 < var5; ++var6) {
			var3 *= 37L;
			char var7 = var0.charAt(var6);
			if (var7 >= 'A' && var7 <= 'Z') {
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') {
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48);
			}

			if (var3 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var3 % 37L && var3 != 0L) {
			var3 /= 37L;
		}

		String var8 = UserComparator8.base37DecodeLong(var3);
		if (var8 == null) {
			var8 = "";
		}

		return var8;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "5"
	)
	static int method2457(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class240.Interpreter_intStackSize -= 3;
			PcmPlayer.queueSoundEffect(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			FriendSystem.playSong(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			class240.Interpreter_intStackSize -= 2;
			class196.method3819(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					return 2;
				} else {
					var3 = 0;
					var4 = 0;
					if (var0 == 3210) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					} else if (var0 == 3182) {
						var3 = 6;
					} else if (var0 == 3204) {
						var3 = 7;
					} else if (var0 == 3206) {
						var3 = 8;
					} else if (var0 == 3208) {
						var3 = 9;
					}

					if (var3 == 6) {
						float var5 = ((float)VarbitComposition.clientPreferences.field1193 - 0.5F) * 200.0F;
						var4 = 100 - Math.round(var5);
					} else if (var3 == 7) {
						var4 = Math.round((float)VarbitComposition.clientPreferences.musicVolume / 2.55F);
					} else if (var3 == 8) {
						var4 = Math.round((float)VarbitComposition.clientPreferences.soundEffectsVolume / 1.27F);
					} else if (var3 == 9) {
						var4 = Math.round((float)VarbitComposition.clientPreferences.areaSoundEffectsVolume / 1.27F);
					}

					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4;
					return 1;
				}
			} else {
				var3 = 0;
				var4 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (var0 == 3209) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				} else if (var0 == 3181) {
					var3 = 6;
				} else if (var0 == 3203) {
					var3 = 7;
				} else if (var0 == 3205) {
					var3 = 8;
				} else if (var0 == 3207) {
					var3 = 9;
				}

				if (var3 == 6) {
					var4 = 100 - Math.min(Math.max(var4, 0), 100);
					Varps.method4858((double)(0.5F + (float)var4 / 200.0F));
				} else if (var3 == 7) {
					var4 = Math.min(Math.max(var4, 0), 100);
					WorldMapIcon_1.method3406(Math.round(2.55F * (float)var4));
				} else if (var3 == 8) {
					var4 = Math.min(Math.max(var4, 0), 100);
					class17.updateSoundEffectVolume(Math.round((float)var4 * 1.27F));
				} else if (var3 == 9) {
					var4 = Math.min(Math.max(var4, 0), 100);
					WorldMapDecorationType.method5062(Math.round((float)var4 * 1.27F));
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Ljd;III)V",
		garbageValue = "1481509956"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !Script.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var8 * var4 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + class129.localPlayer.x >> 7;
					int var12 = class129.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = FriendSystem.getPacketBufferNode(ClientPacket.field2687, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.method6951(var11 + FloorOverlayDefinition.baseX);
					var13.packetBuffer.method6852(var12 + class320.baseY);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class129.localPlayer.x);
					var13.packetBuffer.writeShort(class129.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
