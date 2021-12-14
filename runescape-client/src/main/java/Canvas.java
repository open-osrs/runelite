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
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Loz;I)Loz;",
		garbageValue = "278803147"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = SpotAnimationDefinition.method3362(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("c")
	public static double method408(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-48"
	)
	static int method404(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
		}

		SecureRandomCallable.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class340.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			IsaacCipher.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = UserComparator6.ItemDefinition_get(var4);
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

			if (var3.field3280 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3280;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lbw;",
		garbageValue = "1"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class334.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1167859989"
	)
	static int method405(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			Client.field690 = (short)Calendar.method5323(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]);
			if (Client.field690 <= 0) {
				Client.field690 = 256;
			}

			Client.field707 = (short)Calendar.method5323(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]);
			if (Client.field707 <= 0) {
				Client.field707 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			IsaacCipher.Interpreter_intStackSize -= 4;
			Client.field619 = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			if (Client.field619 <= 0) {
				Client.field619 = 1;
			}

			Client.field735 = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			if (Client.field735 <= 0) {
				Client.field735 = 32767;
			} else if (Client.field735 < Client.field619) {
				Client.field735 = Client.field619;
			}

			Client.field736 = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
			if (Client.field736 <= 0) {
				Client.field736 = 1;
			}

			Client.field737 = (short)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3];
			if (Client.field737 <= 0) {
				Client.field737 = 32767;
			} else if (Client.field737 < Client.field736) {
				Client.field737 = Client.field736;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				WorldMapDecoration.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class67.method1962(Client.field690);
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class67.method1962(Client.field707);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class186.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = BoundaryObject.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1717871248"
	)
	static final void method406() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) {
			int var1 = Client.npcIndices[var0];
			NPC var2 = Client.npcs[var1];
			if (var2 != null) {
				ItemLayer.updateActorSequence(var2, var2.definition.size);
			}
		}

	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "([Ljm;IB)V",
		garbageValue = "-55"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						Message.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class285.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = ChatChannel.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class285.runScriptEvent(var5);
				}
			}
		}

	}
}
