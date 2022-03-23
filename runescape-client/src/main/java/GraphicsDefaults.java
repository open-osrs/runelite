import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -704834319
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1922444497
	)
	public int field4315;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1875507179
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -353257845
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -275374313
	)
	public int field4318;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1613214609
	)
	public int field4319;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 917016199
	)
	public int field4320;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1746195409
	)
	public int field4321;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1104227617
	)
	public int field4317;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 45523845
	)
	public int field4314;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1959240211
	)
	public int field4324;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4315 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4318 = -1; // L: 11
		this.field4319 = -1; // L: 12
		this.field4320 = -1; // L: 13
		this.field4321 = -1; // L: 14
		this.field4317 = -1; // L: 15
		this.field4314 = -1; // L: 16
		this.field4324 = -1; // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)V",
		garbageValue = "2120567441"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4313.group); // L: 20
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
				this.compass = var3.method7742(); // L: 33
				this.field4315 = var3.method7742(); // L: 34
				this.mapScenes = var3.method7742(); // L: 35
				this.headIconsPk = var3.method7742(); // L: 36
				this.field4318 = var3.method7742(); // L: 37
				this.field4319 = var3.method7742(); // L: 38
				this.field4320 = var3.method7742(); // L: 39
				this.field4321 = var3.method7742(); // L: 40
				this.field4317 = var3.method7742(); // L: 41
				this.field4314 = var3.method7742(); // L: 42
				this.field4324 = var3.method7742(); // L: 43
			}
		}
	}
}
