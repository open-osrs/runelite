import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class231 {
	@ObfuscatedName("ej")
	static int[] field2803;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lhu;",
		garbageValue = "-1677453172"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class139.getWidget(var0); // L: 198
		if (var1 == -1) { // L: 199
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 200 201
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1586720207"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 177
			if (KeyHandler.field264 == KeyHandler.field271) { // L: 178
				return false;
			} else {
				class19.field146 = KeyHandler.field256[KeyHandler.field264]; // L: 179
				Message.field591 = KeyHandler.field252[KeyHandler.field264]; // L: 180
				KeyHandler.field264 = KeyHandler.field264 + 1 & 127; // L: 181
				return true; // L: 182
			}
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;I)V",
		garbageValue = "1174652683"
	)
	static void method4356(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1252
		Client.archiveLoaders.add(var2); // L: 1253
		Client.field740 += var2.groupCount; // L: 1254
	} // L: 1255
}
