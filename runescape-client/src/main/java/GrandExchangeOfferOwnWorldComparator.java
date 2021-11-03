import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("i")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12097

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;I)I",
		garbageValue = "1561546631"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12100
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12101
				if (Client.worldId == var1.world) { // L: 12102
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12103
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12105
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12113
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12109
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-90"
	)
	public static int method1162(int var0, int var1, int var2) {
		int var3 = class123.method2619(var2 - var1 + 1); // L: 54
		var3 <<= var1; // L: 55
		var0 |= var3; // L: 56
		return var0; // L: 57
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "69"
	)
	static int method1158(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3638
			class14.Interpreter_intStackSize -= 2; // L: 3639
			Client.field464 = (short)class9.method83(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]); // L: 3640
			if (Client.field464 <= 0) { // L: 3641
				Client.field464 = 256;
			}

			Client.field550 = (short)class9.method83(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]); // L: 3642
			if (Client.field550 <= 0) { // L: 3643
				Client.field550 = 256;
			}

			return 1; // L: 3644
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3646
			class14.Interpreter_intStackSize -= 2; // L: 3647
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3648
			if (Client.zoomHeight <= 0) { // L: 3649
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3650
			if (Client.zoomWidth <= 0) { // L: 3651
				Client.zoomWidth = 320;
			}

			return 1; // L: 3652
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3654
			class14.Interpreter_intStackSize -= 4; // L: 3655
			Client.field727 = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3656
			if (Client.field727 <= 0) { // L: 3657
				Client.field727 = 1;
			}

			Client.field600 = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3658
			if (Client.field600 <= 0) { // L: 3659
				Client.field600 = 32767;
			} else if (Client.field600 < Client.field727) { // L: 3660
				Client.field600 = Client.field727;
			}

			Client.field729 = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 3661
			if (Client.field729 <= 0) { // L: 3662
				Client.field729 = 1;
			}

			Client.field730 = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3]; // L: 3663
			if (Client.field730 <= 0) { // L: 3664
				Client.field730 = 32767;
			} else if (Client.field730 < Client.field729) { // L: 3665
				Client.field730 = Client.field729;
			}

			return 1; // L: 3666
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3668
			if (Client.viewportWidget != null) { // L: 3669
				SpriteMask.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3670
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3671
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3672
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3675
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3676
			}

			return 1; // L: 3678
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3680
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3681
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3682
			return 1; // L: 3683
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3685
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = MouseHandler.method626(Client.field464); // L: 3686
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = MouseHandler.method626(Client.field550); // L: 3687
			return 1; // L: 3688
		} else if (var0 == 6220) { // L: 3690
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3691
			return 1; // L: 3692
		} else if (var0 == 6221) { // L: 3694
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3695
			return 1; // L: 3696
		} else if (var0 == 6222) { // L: 3698
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 3699
			return 1; // L: 3700
		} else if (var0 == 6223) { // L: 3702
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = KeyHandler.canvasHeight; // L: 3703
			return 1; // L: 3704
		} else {
			return 2; // L: 3706
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2002863284"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11812
			PacketBufferNode var1 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2758, Client.packetWriter.isaacCipher); // L: 11814
			var1.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var0)); // L: 11815
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11816
			Client.packetWriter.addNode(var1); // L: 11817
		}
	} // L: 11818
}
