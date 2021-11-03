import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class150 {
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 341290279
	)
	static int field1604;
	@ObfuscatedName("s")
	public short[] field1598;
	@ObfuscatedName("a")
	public short[] field1600;

	class150(int var1) {
		ItemComposition var2 = TaskHandler.ItemDefinition_get(var1); // L: 12
		if (var2.method3368()) { // L: 13
			this.field1598 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1598, 0, this.field1598.length); // L: 15
		}

		if (var2.method3347()) { // L: 17
			this.field1600 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1600, 0, this.field1600.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfg;",
		garbageValue = "-639525716"
	)
	static VerticalAlignment[] method2969() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1744, VerticalAlignment.field1743}; // L: 14
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfy;",
		garbageValue = "5"
	)
	public static VarbitComposition method2965(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 34
			var1 = new VarbitComposition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 37
			return var1; // L: 38
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1306272035"
	)
	static int method2971(int var0, int var1) {
		int var2 = var1 - 334; // L: 5656
		if (var2 < 0) { // L: 5657
			var2 = 0;
		} else if (var2 > 100) { // L: 5658
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5659
		return var0 * var3 / 256; // L: 5660
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "([Ljf;IB)V",
		garbageValue = "-37"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11126
			Widget var3 = var0[var2]; // L: 11127
			if (var3 != null) { // L: 11128
				if (var3.type == 0) { // L: 11129
					if (var3.children != null) { // L: 11130
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11131
					if (var4 != null) { // L: 11132
						ItemComposition.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11134
					var5 = new ScriptEvent(); // L: 11135
					var5.widget = var3; // L: 11136
					var5.args = var3.onDialogAbort; // L: 11137
					Tile.runScriptEvent(var5); // L: 11138
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11140
					if (var3.childIndex >= 0) { // L: 11141
						Widget var6 = UserComparator9.getWidget(var3.id); // L: 11142
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11143
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11147
					var5.widget = var3; // L: 11148
					var5.args = var3.onSubChange; // L: 11149
					Tile.runScriptEvent(var5); // L: 11150
				}
			}
		}

	} // L: 11153
}
