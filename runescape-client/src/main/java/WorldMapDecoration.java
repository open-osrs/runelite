import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -399317437
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 1871379013
	)
	static int field238;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = -169776853
	)
	static int field234;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1201238261
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2100994551
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1800056501
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([Ljava/lang/String;[SI)V",
		garbageValue = "478567291"
	)
	public static void method400(String[] var0, short[] var1) {
		class4.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1441437585"
	)
	public static int method402(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		signature = "([Lhd;IB)V",
		garbageValue = "-69"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !Entity.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && Entity.isComponentHidden(var3) && var3 != WorldMapSection1.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (UserComparator4.loadInterface(var5)) {
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = DevicePcmPlayerProvider.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = NetSocket.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field747; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class234.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field2658 != 0 && !var3.isIf3) {
						int var8 = var3.field2658 >> 16;
						var5 = var3.field2658 << 16 >> 16;
						var8 *= Client.field747;
						var5 *= Client.field747;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class234.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
