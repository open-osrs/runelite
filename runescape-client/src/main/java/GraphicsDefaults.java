import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1044001765
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1859262069
	)
	public int field3845;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1603018569
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1068647141
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1862152703
	)
	public int field3844;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1527226929
	)
	public int field3843;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1238390891
	)
	public int field3846;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1222732897
	)
	public int field3847;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1053374165
	)
	public int field3848;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -295744595
	)
	public int field3849;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -406039943
	)
	public int field3850;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field3845 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field3844 = -1; // L: 11
		this.field3843 = -1; // L: 12
		this.field3846 = -1; // L: 13
		this.field3847 = -1; // L: 14
		this.field3848 = -1; // L: 15
		this.field3849 = -1; // L: 16
		this.field3850 = -1; // L: 17
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V",
		garbageValue = "-1"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3839.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 31
				break; // L: 32
			case 2:
				this.compass = var3.method5559(); // L: 36
				this.field3845 = var3.method5559(); // L: 37
				this.mapScenes = var3.method5559(); // L: 38
				this.headIconsPk = var3.method5559(); // L: 39
				this.field3844 = var3.method5559(); // L: 40
				this.field3843 = var3.method5559(); // L: 41
				this.field3846 = var3.method5559(); // L: 42
				this.field3847 = var3.method5559(); // L: 43
				this.field3848 = var3.method5559(); // L: 44
				this.field3849 = var3.method5559(); // L: 45
				this.field3850 = var3.method5559(); // L: 46
			}
		}
	}
}
