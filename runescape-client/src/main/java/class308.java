import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class308 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "([Liv;IB)V",
		garbageValue = "-64"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11126
			Widget var3 = var0[var2]; // L: 11127
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class11.isComponentHidden(var3))) { // L: 11128 11129 11130
				int var5;
				if (var3.type == 0) { // L: 11131
					if (!var3.isIf3 && class11.isComponentHidden(var3) && var3 != SpriteMask.mousedOverWidgetIf1) { // L: 11132
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11133
					if (var3.children != null) { // L: 11134
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11135
					if (var4 != null) { // L: 11136
						var5 = var4.group; // L: 11137
						if (UserComparator8.loadInterface(var5)) { // L: 11139
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1); // L: 11140
						}
					}
				}

				if (var3.type == 6) { // L: 11144
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11145
						boolean var7 = class373.runCs1(var3); // L: 11146
						if (var7) { // L: 11148
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11149
						}

						if (var5 != -1) { // L: 11150
							SequenceDefinition var6 = Player.SequenceDefinition_get(var5); // L: 11151

							for (var3.modelFrameCycle += Client.field768; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; VerticalAlignment.invalidateWidget(var3)) { // L: 11152 11153 11160
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11154
								++var3.modelFrame; // L: 11155
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11156
									var3.modelFrame -= var6.frameCount; // L: 11157
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11158
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3020 != 0 && !var3.isIf3) { // L: 11164
						int var8 = var3.field3020 >> 16; // L: 11165
						var5 = var3.field3020 << 16 >> 16; // L: 11166
						var8 *= Client.field768; // L: 11167
						var5 *= Client.field768; // L: 11168
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11169
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11170
						VerticalAlignment.invalidateWidget(var3); // L: 11171
					}
				}
			}
		}

	} // L: 11175
}
