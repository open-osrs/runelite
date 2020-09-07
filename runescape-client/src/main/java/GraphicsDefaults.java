import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1162804389
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1318347759
	)
	public int field3831;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2062877841
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2100530677
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1982500985
	)
	public int field3839;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1352009329
	)
	public int field3835;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 893846923
	)
	public int field3838;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -27380687
	)
	public int field3837;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 255609423
	)
	public int field3836;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1251414459
	)
	public int field3834;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 733929835
	)
	public int field3840;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field3831 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field3839 = -1; // L: 11
		this.field3835 = -1; // L: 12
		this.field3838 = -1; // L: 13
		this.field3837 = -1; // L: 14
		this.field3836 = -1; // L: 15
		this.field3834 = -1; // L: 16
		this.field3840 = -1; // L: 17
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)V",
		garbageValue = "-2057643179"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3828.group); // L: 20
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
				this.compass = var3.method5634(); // L: 36
				this.field3831 = var3.method5634(); // L: 37
				this.mapScenes = var3.method5634(); // L: 38
				this.headIconsPk = var3.method5634(); // L: 39
				this.field3839 = var3.method5634(); // L: 40
				this.field3835 = var3.method5634(); // L: 41
				this.field3838 = var3.method5634(); // L: 42
				this.field3837 = var3.method5634(); // L: 43
				this.field3836 = var3.method5634(); // L: 44
				this.field3834 = var3.method5634(); // L: 45
				this.field3840 = var3.method5634(); // L: 46
			}
		}
	}
}
