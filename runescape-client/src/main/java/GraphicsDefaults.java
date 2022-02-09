import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1608346211
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1264819793
	)
	public int field4210;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 413887657
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1082543119
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 938311187
	)
	public int field4213;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2033581685
	)
	public int field4209;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1828588209
	)
	public int field4215;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1158984145
	)
	public int field4216;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1066607651
	)
	public int field4214;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 879499367
	)
	public int field4218;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 6827919
	)
	public int field4219;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4210 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4213 = -1; // L: 11
		this.field4209 = -1; // L: 12
		this.field4215 = -1; // L: 13
		this.field4216 = -1; // L: 14
		this.field4214 = -1; // L: 15
		this.field4218 = -1; // L: 16
		this.field4219 = -1; // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;I)V",
		garbageValue = "-2008500802"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4206.group); // L: 20
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
				this.compass = var3.method7352(); // L: 36
				this.field4210 = var3.method7352(); // L: 37
				this.mapScenes = var3.method7352(); // L: 38
				this.headIconsPk = var3.method7352(); // L: 39
				this.field4213 = var3.method7352(); // L: 40
				this.field4209 = var3.method7352(); // L: 41
				this.field4215 = var3.method7352(); // L: 42
				this.field4216 = var3.method7352(); // L: 43
				this.field4214 = var3.method7352(); // L: 44
				this.field4218 = var3.method7352(); // L: 45
				this.field4219 = var3.method7352(); // L: 46
			}
		}
	}
}
