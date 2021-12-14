import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 22213427
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -765662895
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -537478073
	)
	public int field4163;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 580753427
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1919856699
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -643030741
	)
	public int field4166;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -997092261
	)
	public int field4173;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2100757521
	)
	public int field4169;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1795462849
	)
	public int field4168;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1214363223
	)
	public int field4170;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -377568519
	)
	public int field4171;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1238810733
	)
	public int field4172;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field4163 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field4166 = -1;
		this.field4173 = -1;
		this.field4169 = -1;
		this.field4168 = -1;
		this.field4170 = -1;
		this.field4171 = -1;
		this.field4172 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;B)V",
		garbageValue = "-112"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4160.group);
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
				this.compass = var3.method7400();
				this.field4163 = var3.method7400();
				this.mapScenes = var3.method7400();
				this.headIconsPk = var3.method7400();
				this.field4166 = var3.method7400();
				this.field4173 = var3.method7400();
				this.field4169 = var3.method7400();
				this.field4168 = var3.method7400();
				this.field4170 = var3.method7400();
				this.field4171 = var3.method7400();
				this.field4172 = var3.method7400();
			}
		}
	}

	@ObfuscatedName("p")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class332.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}
}
