import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field3919;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -725671069
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 281871837
	)
	public int field3915;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -714909153
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 359740853
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1827053533
	)
	public int field3910;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1525663871
	)
	public int field3912;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1041444647
	)
	public int field3908;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1591959495
	)
	public int field3914;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -262798545
	)
	public int field3913;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1828601193
	)
	public int field3911;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1968587229
	)
	public int field3917;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field3915 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field3910 = -1;
		this.field3912 = -1;
		this.field3908 = -1;
		this.field3914 = -1;
		this.field3913 = -1;
		this.field3911 = -1;
		this.field3917 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;I)V",
		garbageValue = "2124642870"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3904.group);
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
				this.compass = var3.method6674();
				this.field3915 = var3.method6674();
				this.mapScenes = var3.method6674();
				this.headIconsPk = var3.method6674();
				this.field3910 = var3.method6674();
				this.field3912 = var3.method6674();
				this.field3908 = var3.method6674();
				this.field3914 = var3.method6674();
				this.field3913 = var3.method6674();
				this.field3911 = var3.method6674();
				this.field3917 = var3.method6674();
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "315603069"
	)
	static int method6024(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		}
	}
}
