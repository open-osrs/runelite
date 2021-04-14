import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1232421885
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -702943977
	)
	public int field3898;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -741104371
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 479220981
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1038498691
	)
	public int field3901;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 427046307
	)
	public int field3897;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1679740513
	)
	public int field3903;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1405787829
	)
	public int field3907;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 234020939
	)
	public int field3902;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -646484081
	)
	public int field3906;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 387339011
	)
	public int field3899;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field3898 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field3901 = -1; // L: 11
		this.field3897 = -1; // L: 12
		this.field3903 = -1; // L: 13
		this.field3907 = -1; // L: 14
		this.field3902 = -1; // L: 15
		this.field3906 = -1; // L: 16
		this.field3899 = -1; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;S)V",
		garbageValue = "-3450"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3896.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 28
				break;
			case 2:
				this.compass = var3.method6597(); // L: 33
				this.field3898 = var3.method6597(); // L: 34
				this.mapScenes = var3.method6597(); // L: 35
				this.headIconsPk = var3.method6597(); // L: 36
				this.field3901 = var3.method6597(); // L: 37
				this.field3897 = var3.method6597(); // L: 38
				this.field3903 = var3.method6597(); // L: 39
				this.field3907 = var3.method6597(); // L: 40
				this.field3902 = var3.method6597(); // L: 41
				this.field3906 = var3.method6597(); // L: 42
				this.field3899 = var3.method6597(); // L: 43
			}
		}
	}
}
