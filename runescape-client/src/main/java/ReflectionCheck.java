import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1538307343
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static Widget field609;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -848582505
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -637285787
	)
	@Export("size")
	int size;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("y")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("p")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("j")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("r")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("b")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-372153509"
	)
	static void method1126(int var0, int var1) {
		int var2 = Widget.fontBold12.stringWidth("Choose Option"); // L: 7744

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 7745
			var4 = Widget.fontBold12.stringWidth(MouseRecorder.method2098(var3)); // L: 7746
			if (var4 > var2) { // L: 7747
				var2 = var4;
			}
		}

		var2 += 8; // L: 7749
		var3 = Client.menuOptionsCount * 15 + 22; // L: 7750
		var4 = var0 - var2 / 2; // L: 7751
		if (var2 + var4 > class32.canvasWidth) { // L: 7752
			var4 = class32.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 7753
			var4 = 0;
		}

		int var5 = var1; // L: 7754
		if (var1 + var3 > canvasHeight) { // L: 7755
			var5 = canvasHeight - var3;
		}

		if (var5 < 0) { // L: 7756
			var5 = 0;
		}

		class14.menuX = var4; // L: 7757
		class243.menuY = var5; // L: 7758
		class29.menuWidth = var2; // L: 7759
		class24.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 7760
	} // L: 7761

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "([Lio;II)V",
		garbageValue = "2064427541"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10664
			Widget var3 = var0[var2]; // L: 10665
			if (var3 != null) { // L: 10666
				if (var3.type == 0) { // L: 10667
					if (var3.children != null) { // L: 10668
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10669
					if (var4 != null) { // L: 10670
						Login.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 10672
					var5 = new ScriptEvent(); // L: 10673
					var5.widget = var3; // L: 10674
					var5.args = var3.onDialogAbort; // L: 10675
					PacketWriter.runScriptEvent(var5); // L: 10676
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 10678
					if (var3.childIndex >= 0) { // L: 10679
						Widget var6 = Frames.getWidget(var3.id); // L: 10680
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 10681
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 10685
					var5.widget = var3; // L: 10686
					var5.args = var3.onSubChange; // L: 10687
					PacketWriter.runScriptEvent(var5); // L: 10688
				}
			}
		}

	} // L: 10691
}
