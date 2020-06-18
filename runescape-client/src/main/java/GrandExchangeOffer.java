import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("d")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "Llv;"
	)
	static Bounds field87;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("m")
	@Export("state")
	byte state;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1112039617
	)
	@Export("id")
	public int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 416176327
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -981210321
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1341718687
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1366605879
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		signature = "(Lkn;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "271165601"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-2130764898"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-308953741"
	)
	void method172(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "1"
	)
	void method173(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "([Lch;II[I[II)V",
		garbageValue = "-1520869912"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "-2096234716"
	)
	static int method194(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = WorldMapSprite.getWidget(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = WorldMapSprite.getWidget(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-1566307415"
	)
	static int method176(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1931279198"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = WorldMapLabelSize.getWidgetChild(ItemContainer.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				InterfaceParent.runScriptEvent(var1);
			}

			Client.isSpellSelected = false;
			class234.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2119897094"
	)
	static void method189(int var0, int var1) {
		SecureRandomCallable.method1205(class169.tempMenuAction, var0, var1);
		class169.tempMenuAction = null;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		signature = "(IIIILlz;Lhh;B)V",
		garbageValue = "105"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method6408(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1908400826"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = UserComparator4.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		signature = "(IIIZB)V",
		garbageValue = "43"
	)
	public static void method191(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = UserComparator4.getPacketBufferNode(ClientPacket.field2277, Client.packetWriter.isaacCipher);
		var4.packetBuffer.method5753(var1);
		var4.packetBuffer.writeInt(var3 ? Client.field836 * 1500794883 * -1503339861 : 0);
		var4.packetBuffer.method5898(var0);
		var4.packetBuffer.writeIntME(var2);
		Client.packetWriter.addNode(var4);
	}
}
