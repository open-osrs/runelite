import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1395626587
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -489214437
	)
	public int field3915;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1090663559
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -722037607
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1949905153
	)
	public int field3908;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2078884559
	)
	public int field3909;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1596503367
	)
	public int field3910;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -898287369
	)
	public int field3914;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1050617327
	)
	public int field3904;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1817726075
	)
	public int field3913;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 854072411
	)
	public int field3916;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field3915 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field3908 = -1; // L: 11
		this.field3909 = -1; // L: 12
		this.field3910 = -1; // L: 13
		this.field3914 = -1; // L: 14
		this.field3904 = -1; // L: 15
		this.field3913 = -1; // L: 16
		this.field3916 = -1; // L: 17
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "301330792"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3903.group); // L: 20
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
				this.compass = var3.method6464(); // L: 33
				this.field3915 = var3.method6464(); // L: 34
				this.mapScenes = var3.method6464(); // L: 35
				this.headIconsPk = var3.method6464(); // L: 36
				this.field3908 = var3.method6464(); // L: 37
				this.field3909 = var3.method6464(); // L: 38
				this.field3910 = var3.method6464(); // L: 39
				this.field3914 = var3.method6464(); // L: 40
				this.field3904 = var3.method6464(); // L: 41
				this.field3913 = var3.method6464(); // L: 42
				this.field3916 = var3.method6464(); // L: 43
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;I)I",
		garbageValue = "-1709043428"
	)
	static int method5825(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 124
		if (var0.tryLoadFileByNames("title.jpg", "")) { // L: 125
			++var2;
		}

		if (var1.tryLoadFileByNames("logo", "")) { // L: 126
			++var2;
		}

		if (var1.tryLoadFileByNames("logo_deadman_mode", "")) { // L: 127
			++var2;
		}

		if (var1.tryLoadFileByNames("logo_seasonal_mode", "")) { // L: 128
			++var2;
		}

		if (var1.tryLoadFileByNames("titlebox", "")) { // L: 129
			++var2;
		}

		if (var1.tryLoadFileByNames("titlebutton", "")) { // L: 130
			++var2;
		}

		if (var1.tryLoadFileByNames("runes", "")) { // L: 131
			++var2;
		}

		if (var1.tryLoadFileByNames("title_mute", "")) {
			++var2; // L: 132
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,0", "")) { // L: 133
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,2", "")) { // L: 134
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,4", "")) { // L: 135
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,6", "")) { // L: 136
			++var2;
		}

		var1.tryLoadFileByNames("sl_back", ""); // L: 137
		var1.tryLoadFileByNames("sl_flags", ""); // L: 138
		var1.tryLoadFileByNames("sl_arrows", ""); // L: 139
		var1.tryLoadFileByNames("sl_stars", ""); // L: 140
		var1.tryLoadFileByNames("sl_button", ""); // L: 141
		return var2; // L: 142
	}
}
