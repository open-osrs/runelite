import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("f")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("o")
	@Export("lock")
	Object lock;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1900578569
	)
	@Export("index")
	int index;
	@ObfuscatedName("p")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("b")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("e")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; GrandExchangeEvent.sleepExact(50L)) { // L: 17 26
			synchronized(this.lock) { // L: 18
				if (this.index < 500) { // L: 19
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 20
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 21
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 22
					++this.index; // L: 23
				}
			}
		}

	} // L: 28

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lel;I)V",
		garbageValue = "90989095"
	)
	static final void method2108(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 63
			for (var7 = 0; var7 < 64; ++var7) { // L: 64
				for (var8 = 0; var8 < 64; ++var8) { // L: 65
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 66
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 70

		for (var7 = 0; var7 < 4; ++var7) { // L: 71
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) { // L: 73
					WorldMapData_1.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 74
				}
			}
		}

	} // L: 78

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1618150631"
	)
	public static int method2107() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 72
	}

	@ObfuscatedName("js")
	static final void method2109(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 11147
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 11148
		Clock.method2610(); // L: 11149
		Login.clientPreferences.field1304 = var0; // L: 11150
		Message.savePreferences(); // L: 11151
	} // L: 11152
}
