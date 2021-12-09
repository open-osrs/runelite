import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("y")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 2126946355
	)
	static int field163;
	@ObfuscatedName("c")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Loz;I)Loz;",
		garbageValue = "278803147"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = SpotAnimationDefinition.method3362(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("c")
	public static double method408(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-48"
	)
	static int method404(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 802
			var0 -= 1000; // L: 803
			var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 804
		} else {
			var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 806
		}

		SecureRandomCallable.invalidateWidget(var3); // L: 807
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 808
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 828
				var3.modelType = 2; // L: 829
				var3.modelId = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 830
				return 1; // L: 831
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 833
				var3.modelType = 3; // L: 834
				var3.modelId = class340.localPlayer.appearance.getChatHeadId(); // L: 835
				return 1; // L: 836
			} else {
				return 2; // L: 838
			}
		} else {
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 809
			int var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 810
			int var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 811
			var3.itemId = var4; // L: 812
			var3.itemQuantity = var5; // L: 813
			ItemComposition var6 = UserComparator6.ItemDefinition_get(var4); // L: 814
			var3.modelAngleX = var6.xan2d; // L: 815
			var3.modelAngleY = var6.yan2d; // L: 816
			var3.modelAngleZ = var6.zan2d; // L: 817
			var3.modelOffsetX = var6.offsetX2d; // L: 818
			var3.modelOffsetY = var6.offsetY2d; // L: 819
			var3.modelZoom = var6.zoom2d; // L: 820
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 821
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 822
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 823
			}

			if (var3.field3280 > 0) { // L: 824
				var3.modelZoom = var3.modelZoom * 32 / var3.field3280;
			} else if (var3.rawWidth > 0) { // L: 825
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 826
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lbw;",
		garbageValue = "1"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class334.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1167859989"
	)
	static int method405(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3635
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 3636
			Client.field690 = (short)Calendar.method5323(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]); // L: 3637
			if (Client.field690 <= 0) { // L: 3638
				Client.field690 = 256;
			}

			Client.field707 = (short)Calendar.method5323(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]); // L: 3639
			if (Client.field707 <= 0) { // L: 3640
				Client.field707 = 256;
			}

			return 1; // L: 3641
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3643
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 3644
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3645
			if (Client.zoomHeight <= 0) { // L: 3646
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3647
			if (Client.zoomWidth <= 0) { // L: 3648
				Client.zoomWidth = 320;
			}

			return 1; // L: 3649
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3651
			IsaacCipher.Interpreter_intStackSize -= 4; // L: 3652
			Client.field619 = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3653
			if (Client.field619 <= 0) { // L: 3654
				Client.field619 = 1;
			}

			Client.field735 = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3655
			if (Client.field735 <= 0) { // L: 3656
				Client.field735 = 32767;
			} else if (Client.field735 < Client.field619) { // L: 3657
				Client.field735 = Client.field619;
			}

			Client.field736 = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 3658
			if (Client.field736 <= 0) { // L: 3659
				Client.field736 = 1;
			}

			Client.field737 = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3]; // L: 3660
			if (Client.field737 <= 0) { // L: 3661
				Client.field737 = 32767;
			} else if (Client.field737 < Client.field736) { // L: 3662
				Client.field737 = Client.field736;
			}

			return 1; // L: 3663
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3665
			if (Client.viewportWidget != null) { // L: 3666
				WorldMapDecoration.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3667
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3668
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3669
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3672
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3673
			}

			return 1; // L: 3675
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3677
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3678
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3679
			return 1; // L: 3680
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3682
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class67.method1962(Client.field690); // L: 3683
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class67.method1962(Client.field707); // L: 3684
			return 1; // L: 3685
		} else if (var0 == 6220) { // L: 3687
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3688
			return 1; // L: 3689
		} else if (var0 == 6221) { // L: 3691
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3692
			return 1; // L: 3693
		} else if (var0 == 6222) { // L: 3695
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class186.canvasWidth; // L: 3696
			return 1; // L: 3697
		} else if (var0 == 6223) { // L: 3699
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = BoundaryObject.canvasHeight; // L: 3700
			return 1; // L: 3701
		} else {
			return 2; // L: 3703
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1717871248"
	)
	static final void method406() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 4614
			int var1 = Client.npcIndices[var0]; // L: 4615
			NPC var2 = Client.npcs[var1]; // L: 4616
			if (var2 != null) { // L: 4617
				ItemLayer.updateActorSequence(var2, var2.definition.size); // L: 4618
			}
		}

	} // L: 4621

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "([Ljm;IB)V",
		garbageValue = "-55"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11884
			Widget var3 = var0[var2]; // L: 11885
			if (var3 != null) { // L: 11886
				if (var3.type == 0) { // L: 11887
					if (var3.children != null) { // L: 11888
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11889
					if (var4 != null) { // L: 11890
						Message.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11892
					var5 = new ScriptEvent(); // L: 11893
					var5.widget = var3; // L: 11894
					var5.args = var3.onDialogAbort; // L: 11895
					class285.runScriptEvent(var5); // L: 11896
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11898
					if (var3.childIndex >= 0) { // L: 11899
						Widget var6 = ChatChannel.getWidget(var3.id); // L: 11900
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11901
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11905
					var5.widget = var3; // L: 11906
					var5.args = var3.onSubChange; // L: 11907
					class285.runScriptEvent(var5); // L: 11908
				}
			}
		}

	} // L: 11911
}
