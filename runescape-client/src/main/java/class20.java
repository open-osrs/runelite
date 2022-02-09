import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("f")
public class class20 implements Callable {
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	final class10 field113;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;Ly;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field113 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field113.method96()) { // L: 53
				Language.method5813(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class21("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field113.method99(); // L: 60
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpy;",
		garbageValue = "147068494"
	)
	static PrivateChatMode[] method287() {
		return new PrivateChatMode[]{PrivateChatMode.field4634, PrivateChatMode.field4632, PrivateChatMode.field4633}; // L: 11
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "-1598638027"
	)
	static int method289(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 802
			var0 -= 1000; // L: 803
			var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 804
		} else {
			var3 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 806
		}

		class112.invalidateWidget(var3); // L: 807
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 808
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 828
				var3.modelType = 2; // L: 829
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 830
				return 1; // L: 831
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 833
				var3.modelType = 3; // L: 834
				var3.modelId = WorldMapSprite.localPlayer.appearance.getChatHeadId(); // L: 835
				return 1; // L: 836
			} else {
				return 2; // L: 838
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 809
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 810
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 811
			var3.itemId = var4; // L: 812
			var3.itemQuantity = var5; // L: 813
			ItemComposition var6 = Client.ItemDefinition_get(var4); // L: 814
			var3.modelAngleX = var6.xan2d; // L: 815
			var3.modelAngleY = var6.yan2d; // L: 816
			var3.modelAngleZ = var6.zan2d; // L: 817
			var3.modelOffsetX = var6.offsetX2d; // L: 818
			var3.modelOffsetY = var6.offsetY2d; // L: 819
			var3.modelZoom = var6.zoom2d; // L: 820
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 821
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 822
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 823
			}

			if (var3.field3310 > 0) { // L: 824
				var3.modelZoom = var3.modelZoom * 32 / var3.field3310;
			} else if (var3.rawWidth > 0) { // L: 825
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 826
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-59"
	)
	static boolean method288(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 1183
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;I)V",
		garbageValue = "1852345170"
	)
	static final void method290(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7641
				int var2 = var1.readBits(15); // L: 7642
				if (var2 != 32767) { // L: 7643
					boolean var3 = false; // L: 7644
					if (Client.npcs[var2] == null) { // L: 7645
						Client.npcs[var2] = new NPC(); // L: 7646
						var3 = true; // L: 7647
					}

					NPC var4 = Client.npcs[var2]; // L: 7649
					Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7650
					var4.npcCycle = Client.cycle; // L: 7651
					int var5;
					int var6;
					int var7;
					int var8;
					int var9;
					boolean var10;
					if (HealthBarUpdate.field1178) { // L: 7655
						if (var0) { // L: 7656
							var6 = var1.readBits(8); // L: 7657
							if (var6 > 127) { // L: 7658
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5); // L: 7661
							if (var6 > 15) { // L: 7662
								var6 -= 32;
							}
						}

						var8 = Client.defaultRotations[var1.readBits(3)]; // L: 7664
						if (var3) { // L: 7665
							var4.orientation = var4.rotation = var8;
						}

						if (var0) { // L: 7666
							var7 = var1.readBits(8); // L: 7667
							if (var7 > 127) { // L: 7668
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5); // L: 7671
							if (var7 > 15) { // L: 7672
								var7 -= 32;
							}
						}

						var9 = var1.readBits(1); // L: 7674
						if (var9 == 1) { // L: 7675
							Client.field549[++Client.field548 - 1] = var2;
						}

						var10 = var1.readBits(1) == 1; // L: 7676
						if (var10) { // L: 7677
							var1.readBits(32); // L: 7678
						}

						var5 = var1.readBits(1); // L: 7680
						var4.definition = UserComparator10.getNpcDefinition(var1.readBits(14)); // L: 7681
					} else {
						var8 = Client.defaultRotations[var1.readBits(3)]; // L: 7684
						if (var3) { // L: 7685
							var4.orientation = var4.rotation = var8;
						}

						if (var0) { // L: 7686
							var7 = var1.readBits(8); // L: 7687
							if (var7 > 127) { // L: 7688
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5); // L: 7691
							if (var7 > 15) { // L: 7692
								var7 -= 32;
							}
						}

						var9 = var1.readBits(1); // L: 7694
						if (var9 == 1) { // L: 7695
							Client.field549[++Client.field548 - 1] = var2;
						}

						var4.definition = UserComparator10.getNpcDefinition(var1.readBits(14)); // L: 7696
						var5 = var1.readBits(1); // L: 7697
						var10 = var1.readBits(1) == 1; // L: 7698
						if (var10) { // L: 7699
							var1.readBits(32); // L: 7700
						}

						if (var0) { // L: 7702
							var6 = var1.readBits(8); // L: 7703
							if (var6 > 127) { // L: 7704
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5); // L: 7707
							if (var6 > 15) { // L: 7708
								var6 -= 32;
							}
						}
					}

					var4.field1113 = var4.definition.size; // L: 7711
					var4.field1170 = var4.definition.rotation; // L: 7712
					if (var4.field1170 == 0) { // L: 7713
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence; // L: 7714
					var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7715
					var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7716
					var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7717
					var4.idleSequence = var4.definition.idleSequence; // L: 7718
					var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7719
					var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7720
					var4.method2260(WorldMapSprite.localPlayer.pathX[0] + var6, WorldMapSprite.localPlayer.pathY[0] + var7, var5 == 1); // L: 7721
					continue; // L: 7722
				}
			}

			var1.exportIndex(); // L: 7723
			return; // L: 7724
		}
	}
}
