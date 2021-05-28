import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("f")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "-17"
	)
	void method2656(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method2666(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "34"
	)
	void method2666(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IS)Les;",
		garbageValue = "-9783"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1100714076"
	)
	public static void method2673() {
		if (NetCache.NetCache_socket != null) { // L: 120
			NetCache.NetCache_socket.close();
		}

	} // L: 121

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIB)V",
		garbageValue = "8"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 10694
			if (var0 != null && ClanSettings.method125(var0) != null) { // L: 10695
				Client.clickedWidget = var0; // L: 10696
				Client.clickedWidgetParent = ClanSettings.method125(var0); // L: 10697
				Client.widgetClickX = var1; // L: 10698
				Client.widgetClickY = var2; // L: 10699
				Actor.widgetDragDuration = 0; // L: 10700
				Client.isDraggingWidget = false; // L: 10701
				int var3 = MilliClock.method2588(); // L: 10702
				if (var3 != -1) { // L: 10703
					ReflectionCheck.tempMenuAction = new MenuAction(); // L: 10704
					ReflectionCheck.tempMenuAction.param0 = Client.menuArguments1[var3]; // L: 10705
					ReflectionCheck.tempMenuAction.param1 = Client.menuArguments2[var3]; // L: 10706
					ReflectionCheck.tempMenuAction.opcode = Client.menuOpcodes[var3]; // L: 10707
					ReflectionCheck.tempMenuAction.identifier = Client.menuIdentifiers[var3]; // L: 10708
					ReflectionCheck.tempMenuAction.action = Client.menuActions[var3]; // L: 10709
				}

			}
		}
	} // L: 10711
}
