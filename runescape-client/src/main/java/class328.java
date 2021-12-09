import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
public class class328 {
	@ObfuscatedName("c")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "([Ljm;IB)V",
		garbageValue = "1"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12075
			Widget var3 = var0[var2]; // L: 12076
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !StudioGame.isComponentHidden(var3))) { // L: 12077 12078 12079
				if (var3.type == 0) { // L: 12080
					if (!var3.isIf3 && StudioGame.isComponentHidden(var3) && var3 != class4.mousedOverWidgetIf1) { // L: 12081
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12082
					if (var3.children != null) { // L: 12083
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12084
					if (var4 != null) { // L: 12085
						GraphicsObject.method1955(var4.group);
					}
				}

				if (var3.type == 6) { // L: 12087
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12088
						boolean var7 = class28.runCs1(var3); // L: 12089
						if (var7) { // L: 12091
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12092
						}

						if (var5 != -1) { // L: 12093
							SequenceDefinition var6 = UserComparator5.SequenceDefinition_get(var5); // L: 12094

							for (var3.modelFrameCycle += Client.field538; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; SecureRandomCallable.invalidateWidget(var3)) { // L: 12095 12096 12103
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12097
								++var3.modelFrame; // L: 12098
								if (var3.modelFrame >= var6.frameIds.length) { // L: 12099
									var3.modelFrame -= var6.frameCount; // L: 12100
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12101
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3260 != 0 && !var3.isIf3) { // L: 12107
						int var8 = var3.field3260 >> 16; // L: 12108
						var5 = var3.field3260 << 16 >> 16; // L: 12109
						var8 *= Client.field538; // L: 12110
						var5 *= Client.field538; // L: 12111
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 12112
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12113
						SecureRandomCallable.invalidateWidget(var3); // L: 12114
					}
				}
			}
		}

	} // L: 12118
}
