import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class92 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1964830275
	)
	int field1228;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -519602209
	)
	int field1226;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 768953131
	)
	int field1227;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1613900699
	)
	int field1225;

	class92(int var1, int var2, int var3, int var4) {
		this.field1228 = var1;
		this.field1226 = var2;
		this.field1227 = var3;
		this.field1225 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1997278841"
	)
	int method2340() {
		return this.field1228;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "953113161"
	)
	int method2339() {
		return this.field1226;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	int method2341() {
		return this.field1227;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-97"
	)
	int method2348() {
		return this.field1225;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-1922947006"
	)
	public static String method2353(CharSequence var0) {
		String var1 = GraphicsDefaults.base37DecodeLong(ChatChannel.method2054(var0));
		if (var1 == null) {
			var1 = "";
		}

		return var1;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "([Ljm;IIIZI)V",
		garbageValue = "1500038171"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				class29.alignWidgetSize(var6, var2, var3, var4);
				MouseHandler.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class115.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
