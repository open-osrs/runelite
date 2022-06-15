import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class140 extends class144 {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("c")
	String field1655;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 718016379
	)
	int field1651;
	@ObfuscatedName("q")
	byte field1652;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;)V"
	)
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1655 = null; // L: 55
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "355261812"
	)
	void vmethod3137(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1655 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1651 = var1.readUnsignedShort(); // L: 67
		this.field1652 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lex;I)V",
		garbageValue = "1368590037"
	)
	void vmethod3138(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1655); // L: 74
		var2.world = this.field1651; // L: 75
		var2.rank = this.field1652; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lkb;",
		garbageValue = "1295683453"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 220
		int var2 = var0 & 65535; // L: 221
		if (SoundCache.Widget_interfaceComponents[var1] == null || SoundCache.Widget_interfaceComponents[var1][var2] == null) { // L: 222
			boolean var3 = WorldMapSection2.loadInterface(var1); // L: 223
			if (!var3) { // L: 224
				return null;
			}
		}

		return SoundCache.Widget_interfaceComponents[var1][var2]; // L: 226
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "1221665034"
	)
	static String method3038(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 120
			if (var2 && var0 >= 0) { // L: 121
				int var3 = 2; // L: 122

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 123 124 126
					var4 /= var1; // L: 125
				}

				char[] var5 = new char[var3]; // L: 128
				var5[0] = '+'; // L: 129

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 130
					int var7 = var0; // L: 131
					var0 /= var1; // L: 132
					int var8 = var7 - var0 * var1; // L: 133
					if (var8 >= 10) { // L: 134
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 135
					}
				}

				return new String(var5); // L: 137
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
