import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class131 {
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -5200207434161239507L
	)
	long field1539;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1578407985
	)
	int field1535;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	IterableNodeDeque field1536;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public class131(Buffer var1) {
		this.field1535 = -1; // L: 9
		this.field1536 = new IterableNodeDeque(); // L: 10
		this.method2872(var1); // L: 28
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-2070939911"
	)
	void method2872(Buffer var1) {
		this.field1539 = var1.readLong(); // L: 32
		this.field1535 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class150(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class126(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class143(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class135(this);
			} else if (var2 == 6) {
				var3 = new class142(this); // L: 41
			} else if (var2 == 5) { // L: 42
				var3 = new class127(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class132(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class125(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class129(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class146(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class152(this);
			} else if (var2 == 10) { // L: 48
				var3 = new class138(this);
			} else if (var2 == 11) { // L: 49
				var3 = new class133(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class137(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class147(this);
			}

			((class128)var3).vmethod3168(var1); // L: 53
			this.field1536.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;I)V",
		garbageValue = "-1644962091"
	)
	public void method2873(ClanSettings var1) {
		if (this.field1539 == var1.field1586 && this.field1535 == var1.field1583) { // L: 60
			for (class128 var2 = (class128)this.field1536.last(); var2 != null; var2 = (class128)this.field1536.previous()) { // L: 61
				var2.vmethod3162(var1); // L: 62
			}

			++var1.field1583; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-583434867"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 146
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1041289778"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field601 = 0L; // L: 4263
		if (var0 >= 2) { // L: 4264
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4265
		}

		if (Client.getWindowedMode() == 1) { // L: 4266
			class127.client.setMaxCanvasSize(765, 503); // L: 4267
		} else {
			class127.client.setMaxCanvasSize(7680, 2160); // L: 4270
		}

		if (Client.gameState >= 25) { // L: 4272
			class4.method17();
		}

	} // L: 4273

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1296688270"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class155.loadInterface(var0)) { // L: 10214
			class307.field3585 = null; // L: 10221
			class268.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10222
			if (class307.field3585 != null) { // L: 10223
				class268.drawInterface(class307.field3585, -1412584499, var1, var2, var3, var4, class93.field1252, ItemContainer.field1013, var7); // L: 10224
				class307.field3585 = null; // L: 10225
			}

		} else {
			if (var7 != -1) { // L: 10215
				Client.field715[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10217
					Client.field715[var8] = true;
				}
			}

		}
	} // L: 10219 10227
}
