import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class113 extends class116 {
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("s")
	static int[][][] field1367;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2004132967
	)
	int field1366;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1951092477
	)
	int field1363;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -960522385
	)
	int field1364;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -188053285
	)
	int field1368;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class113(class119 var1) {
		this.this$0 = var1;
		this.field1366 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1366 = var1.readUnsignedShort();
		this.field1363 = var1.readInt();
		this.field1364 = var1.readUnsignedByte();
		this.field1368 = var1.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2614(this.field1366, this.field1363, this.field1364, this.field1368);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-1428729537"
	)
	public static int method2479(CharSequence var0, int var1) {
		return GrandExchangeEvent.method5326(var0, var1, true);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1877025218"
	)
	public static String method2480(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = WorldMapScaleHandler.method3916(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2040835738"
	)
	static final void method2478() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				InterfaceParent.method2044(var0);
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "([Ljd;IB)V",
		garbageValue = "5"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !PcmPlayer.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && PcmPlayer.isComponentHidden(var3) && var3 != class301.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (class317.loadInterface(var5)) {
							drawModelComponents(class139.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = BZip2State.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = class17.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field764; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; Actor.invalidateWidget(var3)) {
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

					if (var3.field3101 != 0 && !var3.isIf3) {
						int var8 = var3.field3101 >> 16;
						var5 = var3.field3101 << 16 >> 16;
						var8 *= Client.field764;
						var5 *= Client.field764;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						Actor.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
