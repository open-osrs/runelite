import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-629"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1172254968"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1662768639"
	)
	public static void method2600() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 177
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 178
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 179
	} // L: 180

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "765268969"
	)
	public static void method2610() {
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 578
	} // L: 579

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([Lhu;II)V",
		garbageValue = "974266875"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10884
			Widget var3 = var0[var2]; // L: 10885
			if (var3 != null) { // L: 10886
				if (var3.type == 0) { // L: 10887
					if (var3.children != null) { // L: 10888
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10889
					if (var4 != null) { // L: 10890
						class379.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 10892
					var5 = new ScriptEvent(); // L: 10893
					var5.widget = var3; // L: 10894
					var5.args = var3.onDialogAbort; // L: 10895
					class19.runScriptEvent(var5); // L: 10896
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 10898
					if (var3.childIndex >= 0) { // L: 10899
						Widget var6 = class139.getWidget(var3.id); // L: 10900
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 10901
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 10905
					var5.widget = var3; // L: 10906
					var5.args = var3.onSubChange; // L: 10907
					class19.runScriptEvent(var5); // L: 10908
				}
			}
		}

	} // L: 10911
}
