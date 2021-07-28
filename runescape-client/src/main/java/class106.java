import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class106 {
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1974970037
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -9157907718782179641L
	)
	long field1308;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1464332755
	)
	int field1309;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	IterableNodeDeque field1310;

	@ObfuscatedSignature(
		descriptor = "(Lnv;)V"
	)
	public class106(Buffer var1) {
		this.field1309 = -1;
		this.field1310 = new IterableNodeDeque();
		this.method2274(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "2"
	)
	void method2274(Buffer var1) {
		this.field1308 = var1.readLong();
		this.field1309 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class125(this);
			} else if (var2 == 1) {
				var3 = new class101(this);
			} else if (var2 == 13) {
				var3 = new class118(this);
			} else if (var2 == 4) {
				var3 = new class110(this);
			} else if (var2 == 6) {
				var3 = new class117(this);
			} else if (var2 == 5) {
				var3 = new class102(this);
			} else if (var2 == 2) {
				var3 = new class107(this);
			} else if (var2 == 7) {
				var3 = new class100(this);
			} else if (var2 == 14) {
				var3 = new class104(this);
			} else if (var2 == 8) {
				var3 = new class121(this);
			} else if (var2 == 9) {
				var3 = new class127(this);
			} else if (var2 == 10) {
				var3 = new class113(this);
			} else if (var2 == 11) {
				var3 = new class108(this);
			} else if (var2 == 12) {
				var3 = new class112(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class122(this);
			}

			((class103)var3).vmethod2562(var1);
			this.field1310.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "-901301928"
	)
	public void method2273(ClanSettings var1) {
		if (this.field1308 == var1.field1370 && this.field1309 == var1.field1363) {
			for (class103 var2 = (class103)this.field1310.last(); var2 != null; var2 = (class103)this.field1310.previous()) {
				var2.vmethod2567(var1);
			}

			++var1.field1363;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbj;",
		garbageValue = "-1612775342"
	)
	static final InterfaceParent method2275(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		Timer.Widget_resetModelFrames(var1);
		Widget var4 = UrlRequester.getWidget(var0);
		AttackOption.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			AttackOption.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		for (int var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
			if (SoundSystem.method524(Client.menuOpcodes[var5])) {
				if (var5 < Client.menuOptionsCount - 1) {
					for (int var6 = var5; var6 < Client.menuOptionsCount - 1; ++var6) {
						Client.menuActions[var6] = Client.menuActions[var6 + 1];
						Client.menuTargets[var6] = Client.menuTargets[var6 + 1];
						Client.menuOpcodes[var6] = Client.menuOpcodes[var6 + 1];
						Client.menuIdentifiers[var6] = Client.menuIdentifiers[var6 + 1];
						Client.menuArguments1[var6] = Client.menuArguments1[var6 + 1];
						Client.menuArguments2[var6] = Client.menuArguments2[var6 + 1];
						Client.menuShiftClick[var6] = Client.menuShiftClick[var6 + 1];
					}
				}

				--var5;
				--Client.menuOptionsCount;
			}
		}

		SecureRandomFuture.method1711();
		AttackOption.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		class112.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			WorldMapData_0.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
