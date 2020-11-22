import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Ler;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 35
		int var6 = var1.getGroupFileCount(var3); // L: 36
		this.frames = new Animation[var6]; // L: 37
		int[] var7 = var1.getGroupFileIds(var3); // L: 38

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 39
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-35"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "([Lht;II)V",
		garbageValue = "-1768141764"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11067
			Widget var3 = var0[var2]; // L: 11068
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !VertexNormal.isComponentHidden(var3))) { // L: 11069 11070 11071
				int var5;
				if (var3.type == 0) { // L: 11072
					if (!var3.isIf3 && VertexNormal.isComponentHidden(var3) && var3 != GrandExchangeEvent.mousedOverWidgetIf1) { // L: 11073
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11074
					if (var3.children != null) { // L: 11075
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11076
					if (var4 != null) { // L: 11077
						var5 = var4.group; // L: 11078
						if (ScriptFrame.loadInterface(var5)) { // L: 11080
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1); // L: 11081
						}
					}
				}

				if (var3.type == 6) { // L: 11085
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11086
						boolean var7 = BufferedNetSocket.runCs1(var3); // L: 11087
						if (var7) { // L: 11089
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11090
						}

						if (var5 != -1) { // L: 11091
							SequenceDefinition var6 = class105.SequenceDefinition_get(var5); // L: 11092

							for (var3.modelFrameCycle += Client.field743; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3)) { // L: 11093 11094 11101
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11095
								++var3.modelFrame; // L: 11096
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11097
									var3.modelFrame -= var6.frameCount; // L: 11098
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11099
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field2734 != 0 && !var3.isIf3) { // L: 11105
						int var8 = var3.field2734 >> 16; // L: 11106
						var5 = var3.field2734 << 16 >> 16; // L: 11107
						var8 *= Client.field743; // L: 11108
						var5 *= Client.field743; // L: 11109
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11110
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11111
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 11112
					}
				}
			}
		}

	} // L: 11116
}
