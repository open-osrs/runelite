import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class9 implements MouseWheel {
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 2032857847
	)
	static int field44;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	static final class9 field46;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	public static final class9 field43;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	static final class9 field42;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	static final class9 field38;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	static final class9 field39;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -517250407
	)
	int field40;
	@ObfuscatedName("t")
	String field41;
	@ObfuscatedName("a")
	boolean field35;
	@ObfuscatedName("e")
	boolean field36;

	static {
		field46 = new class9(0, "POST", true, true);
		field43 = new class9(1, "GET", true, false);
		field42 = new class9(2, "PUT", false, true);
		field38 = new class9(3, "PATCH", false, true);
		field39 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field40 = var1;
		this.field41 = var2;
		this.field35 = var3;
		this.field36 = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field40;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1505605865"
	)
	boolean method74() {
		return this.field35;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-989360372"
	)
	String method85() {
		return this.field41;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-83"
	)
	boolean method76() {
		return this.field36;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "([Ljt;IB)V",
		garbageValue = "1"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !ObjectSound.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && ObjectSound.isComponentHidden(var3) && var3 != VarpDefinition.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (GrandExchangeOfferTotalQuantityComparator.loadInterface(var5)) {
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = BufferedNetSocket.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = KitDefinition.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field536; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class16.invalidateWidget(var3)) {
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

					if (var3.field3038 != 0 && !var3.isIf3) {
						int var8 = var3.field3038 >> 16;
						var5 = var3.field3038 << 16 >> 16;
						var8 *= Client.field536;
						var5 *= Client.field536;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class16.invalidateWidget(var3);
					}
				}
			}
		}

	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ljt;B)V",
		garbageValue = "109"
	)
	static final void method87(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field758 == -1) {
				Client.field758 = var0.spriteId2;
				Client.field759 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field758;
			} else {
				var0.spriteId2 = Client.field759;
			}

		} else if (var1 == 325) {
			if (Client.field758 == -1) {
				Client.field758 = var0.spriteId2;
				Client.field759 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field759;
			} else {
				var0.spriteId2 = Client.field758;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
