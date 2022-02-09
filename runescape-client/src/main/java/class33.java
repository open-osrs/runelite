import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class33 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -191531185
	)
	static int field243;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1944227841"
	)
	public static void method626() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 81
	} // L: 82

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "([Ljz;II)V",
		garbageValue = "1424565311"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11227
			Widget var3 = var0[var2]; // L: 11228
			if (var3 != null) { // L: 11229
				if (var3.type == 0) { // L: 11230
					if (var3.children != null) { // L: 11231
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11232
					if (var4 != null) { // L: 11233
						DevicePcmPlayerProvider.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11235
					var5 = new ScriptEvent(); // L: 11236
					var5.widget = var3; // L: 11237
					var5.args = var3.onDialogAbort; // L: 11238
					class92.runScriptEvent(var5); // L: 11239
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11241
					if (var3.childIndex >= 0) { // L: 11242
						Widget var6 = class130.getWidget(var3.id); // L: 11243
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11244
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11248
					var5.widget = var3; // L: 11249
					var5.args = var3.onSubChange; // L: 11250
					class92.runScriptEvent(var5); // L: 11251
				}
			}
		}

	} // L: 11254
}
