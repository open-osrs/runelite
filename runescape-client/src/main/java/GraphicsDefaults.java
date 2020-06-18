import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1290598403
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 569826969
	)
	public int field3825;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2129341785
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -971970549
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 495160215
	)
	public int field3828;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 600923109
	)
	public int field3829;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1832791717
	)
	public int field3830;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1676542437
	)
	public int field3831;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 25471689
	)
	public int field3834;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1227004577
	)
	public int field3824;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -575308385
	)
	public int field3832;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field3825 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field3828 = -1;
		this.field3829 = -1;
		this.field3830 = -1;
		this.field3831 = -1;
		this.field3834 = -1;
		this.field3824 = -1;
		this.field3832 = -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lic;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3822.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.compass = var3.method5843();
				this.field3825 = var3.method5843();
				this.mapScenes = var3.method5843();
				this.headIconsPk = var3.method5843();
				this.field3828 = var3.method5843();
				this.field3829 = var3.method5843();
				this.field3830 = var3.method5843();
				this.field3831 = var3.method5843();
				this.field3834 = var3.method5843();
				this.field3824 = var3.method5843();
				this.field3832 = var3.method5843();
			}
		}
	}
}
