import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1297483725
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1189696731
	)
	public int field3847;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -189041471
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 326124555
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1371228557
	)
	public int field3838;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1164105375
	)
	public int field3843;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -981893847
	)
	public int field3839;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1322267677
	)
	public int field3845;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 357472757
	)
	public int field3846;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1091910485
	)
	public int field3840;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -20558633
	)
	public int field3848;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field3847 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field3838 = -1; // L: 11
		this.field3843 = -1; // L: 12
		this.field3839 = -1; // L: 13
		this.field3845 = -1; // L: 14
		this.field3846 = -1; // L: 15
		this.field3840 = -1; // L: 16
		this.field3848 = -1; // L: 17
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;I)V",
		garbageValue = "-1311104999"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3837.group); // L: 20
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
				this.compass = var3.method5833(); // L: 31
				this.field3847 = var3.method5833(); // L: 32
				this.mapScenes = var3.method5833(); // L: 33
				this.headIconsPk = var3.method5833(); // L: 34
				this.field3838 = var3.method5833(); // L: 35
				this.field3843 = var3.method5833(); // L: 36
				this.field3839 = var3.method5833(); // L: 37
				this.field3845 = var3.method5833(); // L: 38
				this.field3846 = var3.method5833(); // L: 39
				this.field3840 = var3.method5833(); // L: 40
				this.field3848 = var3.method5833(); // L: 41
			}
		}
	}
}
