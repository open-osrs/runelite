import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2113066493
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 468395929
	)
	public int field4367;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2011214473
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1296513059
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -420476393
	)
	public int field4374;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 727709081
	)
	public int field4373;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -279446943
	)
	public int field4372;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1485733839
	)
	public int field4368;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1703298747
	)
	public int field4371;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1305431603
	)
	public int field4375;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1099516571
	)
	public int field4376;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4367 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4374 = -1; // L: 11
		this.field4373 = -1; // L: 12
		this.field4372 = -1; // L: 13
		this.field4368 = -1; // L: 14
		this.field4371 = -1; // L: 15
		this.field4375 = -1; // L: 16
		this.field4376 = -1; // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-1672776628"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4363.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 46
				break;
			case 2:
				this.compass = var3.method7752(); // L: 31
				this.field4367 = var3.method7752(); // L: 32
				this.mapScenes = var3.method7752(); // L: 33
				this.headIconsPk = var3.method7752(); // L: 34
				this.field4374 = var3.method7752(); // L: 35
				this.field4373 = var3.method7752(); // L: 36
				this.field4372 = var3.method7752(); // L: 37
				this.field4368 = var3.method7752(); // L: 38
				this.field4371 = var3.method7752(); // L: 39
				this.field4375 = var3.method7752(); // L: 40
				this.field4376 = var3.method7752(); // L: 41
			}
		}
	}
}
