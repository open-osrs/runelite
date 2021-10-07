import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1639675523
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 702136855
	)
	public int field4014;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1524325723
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1995759
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 355364427
	)
	public int field4017;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2123724991
	)
	public int field4015;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2071632403
	)
	public int field4018;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 247766687
	)
	public int field4020;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1327496497
	)
	public int field4019;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1467597659
	)
	public int field4022;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1123526163
	)
	public int field4013;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field4014 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field4017 = -1;
		this.field4015 = -1;
		this.field4018 = -1;
		this.field4020 = -1;
		this.field4019 = -1;
		this.field4022 = -1;
		this.field4013 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;B)V",
		garbageValue = "3"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4011.group);
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
				this.compass = var3.method6977();
				this.field4014 = var3.method6977();
				this.mapScenes = var3.method6977();
				this.headIconsPk = var3.method6977();
				this.field4017 = var3.method6977();
				this.field4015 = var3.method6977();
				this.field4018 = var3.method6977();
				this.field4020 = var3.method6977();
				this.field4019 = var3.method6977();
				this.field4022 = var3.method6977();
				this.field4013 = var3.method6977();
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-953550722"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Players.addChatMessage(var0, var1, var2, (String)null);
	}
}
