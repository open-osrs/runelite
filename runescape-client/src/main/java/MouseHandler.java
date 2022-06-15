import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -383852009
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 241459279
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1768893521
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -89007159
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -4642298123597580975L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -2350153647188660461L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1455272801
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1882994615
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 673527067
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2102199951
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1399413665
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2125601879
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -1006217129422716167L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1415111361
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1792808507
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1987452137
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -814886068230391219L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-987876058"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 49
		if (!var1.isAltDown() && var2 != 2) { // L: 50
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 51 52
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 97
			MouseHandler_idleCycles = 0; // L: 98
			MouseHandler_xVolatile = var1.getX(); // L: 99
			MouseHandler_yVolatile = var1.getY(); // L: 100
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 101
		}

	} // L: 103

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 56
			MouseHandler_idleCycles = 0; // L: 57
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 58
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 59
			MouseHandler_lastPressedTimeMillisVolatile = class115.method2692(); // L: 60
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 61
			if (MouseHandler_lastButtonVolatile != 0) { // L: 62
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 64
			var1.consume();
		}

	} // L: 65

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 76
			var1.consume();
		}

	} // L: 77

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 68
			MouseHandler_idleCycles = 0; // L: 69
			MouseHandler_currentButtonVolatile = 0; // L: 70
		}

		if (var1.isPopupTrigger()) { // L: 72
			var1.consume();
		}

	} // L: 73

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 93
	} // L: 94

	public final void focusGained(FocusEvent var1) {
	} // L: 105

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 108
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 109

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 84
			MouseHandler_idleCycles = 0; // L: 85
			MouseHandler_xVolatile = -1; // L: 86
			MouseHandler_yVolatile = -1; // L: 87
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 88
		}

	} // L: 90

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 80
	} // L: 81

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "1889680041"
	)
	static int method547(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class436 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 4732
			if (var0 != 7501) { // L: 4754
				int var19;
				int var20;
				if (var0 == 7502) { // L: 4763
					class446.Interpreter_intStackSize -= 3; // L: 4764
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4765
					var19 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 4766
					var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 4767
					var20 = class285.method5516(var19); // L: 4768
					var7 = HealthBarUpdate.method2199(var19); // L: 4769
					int var21 = class141.method3048(var19); // L: 4770
					class437 var26 = FriendLoginUpdate.method6631(var3); // L: 4771
					class435 var27 = UserComparator6.method2626(var20); // L: 4772
					int[] var28 = var27.field4668[var7]; // L: 4773
					int var12 = 0; // L: 4774
					int var13 = var28.length; // L: 4775
					if (var21 >= 0) { // L: 4776
						if (var21 >= var13) { // L: 4777
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 4778
						}

						var12 = var21; // L: 4780
						var13 = var21 + 1; // L: 4781
					}

					Object[] var14 = var26.method7625(var7); // L: 4783
					if (var14 == null && var27.field4669 != null) { // L: 4784 4785
						var14 = var27.field4669[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 4787
						for (var15 = var12; var15 < var13; ++var15) { // L: 4788
							var16 = var28[var15]; // L: 4789
							class432 var22 = MusicPatchNode.method5472(var16); // L: 4790
							if (var22 == class432.field4657) { // L: 4791
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ArchiveLoader.method2075(var16); // L: 4792
							}
						}

						return 1; // L: 4794
					} else {
						var15 = var14.length / var28.length; // L: 4796
						if (var5 >= 0 && var5 < var15) { // L: 4797
							for (var16 = var12; var16 < var13; ++var16) { // L: 4800
								int var17 = var16 + var28.length * var5; // L: 4801
								class432 var18 = MusicPatchNode.method5472(var28[var16]); // L: 4802
								if (var18 == class432.field4657) { // L: 4803
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 4804
								}
							}

							return 1; // L: 4806
						} else {
							throw new RuntimeException(); // L: 4798
						}
					}
				} else if (var0 == 7503) { // L: 4808
					class446.Interpreter_intStackSize -= 2; // L: 4809
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4810
					var19 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 4811
					var5 = 0; // L: 4812
					var20 = class285.method5516(var19); // L: 4813
					var7 = HealthBarUpdate.method2199(var19); // L: 4814
					class437 var25 = FriendLoginUpdate.method6631(var3); // L: 4815
					class435 var9 = UserComparator6.method2626(var20); // L: 4816
					int[] var10 = var9.field4668[var7]; // L: 4817
					Object[] var11 = var25.method7625(var7); // L: 4818
					if (var11 == null && var9.field4669 != null) { // L: 4819 4820
						var11 = var9.field4669[var7]; // L: 4821
					}

					if (var11 != null) { // L: 4824
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5; // L: 4825
					return 1; // L: 4826
				} else if (var0 != 7504 && var0 != 7509) { // L: 4828
					if (var0 == 7505) { // L: 4845
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4846
						class437 var24 = FriendLoginUpdate.method6631(var3); // L: 4847
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var24.field4678; // L: 4848
						return 1; // L: 4849
					} else if (var0 == 7506) { // L: 4851
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4852
						var19 = -1; // L: 4853
						if (UrlRequest.field1373 != null && var3 >= 0 && var3 < UrlRequest.field1373.size()) { // L: 4854
							var19 = (Integer)UrlRequest.field1373.get(var3); // L: 4855
						}

						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var19; // L: 4857
						return 1; // L: 4858
					} else if (var0 != 7507 && var0 != 7510) { // L: 4860
						return 2; // L: 4887
					} else {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4861
						var4 = class137.method2937(var3); // L: 4862
						var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4863
						var6 = class123.method2813(var5); // L: 4864
						if (var6 == null) { // L: 4865
							throw new RuntimeException(); // L: 4866
						} else if (class285.method5516(var5) != Client.field588) { // L: 4868
							throw new RuntimeException(); // L: 4869
						} else if (UrlRequest.field1373 == null && UrlRequest.field1373.isEmpty()) { // L: 4871
							throw new RuntimeException(); // L: 4872
						} else {
							var7 = class141.method3048(var5); // L: 4874
							List var8 = var6.method7619(var4, var7); // L: 4875
							UrlRequest.field1373 = new LinkedList(UrlRequest.field1373); // L: 4876
							if (var8 != null) { // L: 4877
								UrlRequest.field1373.retainAll(var8); // L: 4878
							} else {
								UrlRequest.field1373.clear(); // L: 4881
							}

							SoundSystem.field312 = UrlRequest.field1373.iterator(); // L: 4883
							if (var0 == 7507) { // L: 4884
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UrlRequest.field1373.size();
							}

							return 1; // L: 4885
						}
					}
				} else {
					--class446.Interpreter_intStackSize; // L: 4829
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4830
					class436 var23 = WorldMapRectangle.method4988(var3); // L: 4831
					if (var23 == null) { // L: 4832
						throw new RuntimeException(); // L: 4833
					} else {
						UrlRequest.field1373 = var23.method7619(0, 0); // L: 4835
						var5 = 0; // L: 4836
						if (UrlRequest.field1373 != null) { // L: 4837
							Client.field588 = var3; // L: 4838
							SoundSystem.field312 = UrlRequest.field1373.iterator(); // L: 4839
							var5 = UrlRequest.field1373.size(); // L: 4840
						}

						if (var0 == 7504) { // L: 4842
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 4843
					}
				}
			} else {
				if (SoundSystem.field312 != null && SoundSystem.field312.hasNext()) { // L: 4755
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Integer)SoundSystem.field312.next(); // L: 4756
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4759
				}

				return 1; // L: 4761
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4733
			var4 = class137.method2937(var3); // L: 4734
			var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4735
			var6 = class123.method2813(var5); // L: 4736
			if (var6 == null) { // L: 4737
				throw new RuntimeException(); // L: 4738
			} else {
				var7 = class141.method3048(var5); // L: 4740
				UrlRequest.field1373 = var6.method7619(var4, var7); // L: 4741
				if (UrlRequest.field1373 != null) { // L: 4742
					Client.field588 = class285.method5516(var5); // L: 4743
					SoundSystem.field312 = UrlRequest.field1373.iterator(); // L: 4744
					if (var0 == 7500) { // L: 4745
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UrlRequest.field1373.size();
					}
				} else {
					Client.field588 = -1; // L: 4748
					SoundSystem.field312 = null; // L: 4749
					if (var0 == 7500) { // L: 4750
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 4752
			}
		}
	}
}
