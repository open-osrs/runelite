import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class129 {
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -1804512365
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 6548803859152250067L
	)
	long field1513;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2135269879
	)
	int field1511;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	IterableNodeDeque field1512;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public class129(Buffer var1) {
		this.field1511 = -1; // L: 9
		this.field1512 = new IterableNodeDeque(); // L: 10
		this.method2780(var1); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-65"
	)
	void method2780(Buffer var1) {
		this.field1513 = var1.readLong(); // L: 32
		this.field1511 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class148(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class124(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class141(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class133(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class140(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class125(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class130(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class123(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class127(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class144(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class150(this);
			} else if (var2 == 10) {
				var3 = new class136(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class131(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class135(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class145(this);
			}

			((class126)var3).vmethod3029(var1); // L: 53
			this.field1512.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "1939011884"
	)
	public void method2781(ClanSettings var1) {
		if (this.field1513 == var1.field1562 && this.field1511 == var1.field1563) { // L: 60
			for (class126 var2 = (class126)this.field1512.last(); var2 != null; var2 = (class126)this.field1512.previous()) { // L: 61
				var2.vmethod3028(var1); // L: 62
			}

			++var1.field1563; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lix;",
		garbageValue = "828857412"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3013, ServerPacket.field2931, ServerPacket.field2983, ServerPacket.field2933, ServerPacket.field2934, ServerPacket.field2930, ServerPacket.field2936, ServerPacket.field2937, ServerPacket.field3000, ServerPacket.field3003, ServerPacket.field2940, ServerPacket.field2941, ServerPacket.field2942, ServerPacket.field3006, ServerPacket.field2944, ServerPacket.field2945, ServerPacket.field2946, ServerPacket.field3008, ServerPacket.field2948, ServerPacket.field2949, ServerPacket.field2950, ServerPacket.field2951, ServerPacket.field2961, ServerPacket.field2982, ServerPacket.field2954, ServerPacket.field2955, ServerPacket.field2956, ServerPacket.field2978, ServerPacket.field2958, ServerPacket.field2959, ServerPacket.field3029, ServerPacket.field2938, ServerPacket.field2962, ServerPacket.field2963, ServerPacket.field2964, ServerPacket.field2965, ServerPacket.field3014, ServerPacket.field2986, ServerPacket.field2968, ServerPacket.field3005, ServerPacket.field2997, ServerPacket.field2971, ServerPacket.field2972, ServerPacket.field2932, ServerPacket.field2974, ServerPacket.field2975, ServerPacket.field2976, ServerPacket.field2987, ServerPacket.field2947, ServerPacket.field2979, ServerPacket.field2980, ServerPacket.field2981, ServerPacket.field2957, ServerPacket.field2939, ServerPacket.field2984, ServerPacket.field2985, ServerPacket.field3016, ServerPacket.field3017, ServerPacket.field2943, ServerPacket.field2989, ServerPacket.field2990, ServerPacket.field2991, ServerPacket.field2992, ServerPacket.field2993, ServerPacket.field2994, ServerPacket.field2995, ServerPacket.field2996, ServerPacket.field2952, ServerPacket.field2998, ServerPacket.field2999, ServerPacket.field2953, ServerPacket.field3001, ServerPacket.field3002, ServerPacket.field2960, ServerPacket.field3004, ServerPacket.field2966, ServerPacket.field2988, ServerPacket.field3007, ServerPacket.field2967, ServerPacket.field3009, ServerPacket.field3010, ServerPacket.field3011, ServerPacket.field3012, ServerPacket.field2969, ServerPacket.field2970, ServerPacket.field3015, ServerPacket.field2935, ServerPacket.field3025, ServerPacket.field3018, ServerPacket.field3019, ServerPacket.field3020, ServerPacket.field3021, ServerPacket.field3022, ServerPacket.field3023, ServerPacket.field3024, ServerPacket.field2973, ServerPacket.field3026, ServerPacket.field3027}; // L: 107
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "604899148"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		AbstractWorldMapData.scrollBarSprites[0].drawAt(var0, var1); // L: 11022
		AbstractWorldMapData.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11023
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field693); // L: 11024
		int var5 = var3 * (var3 - 32) / var4; // L: 11025
		if (var5 < 8) { // L: 11026
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11027
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field716); // L: 11028
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field544); // L: 11029
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field544); // L: 11030
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field544); // L: 11031
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field544); // L: 11032
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field509); // L: 11033
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field509); // L: 11034
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field509); // L: 11035
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field509); // L: 11036
	} // L: 11037
}
