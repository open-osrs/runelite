import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class134 extends class142 {
	@ObfuscatedName("l")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -2098238709
	)
	static int field1572;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1109793603
	)
	int field1573;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	class134(class143 var1) {
		this.this$0 = var1;
		this.field1573 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-103"
	)
	void vmethod3014(Buffer var1) {
		this.field1573 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leg;B)V",
		garbageValue = "48"
	)
	void vmethod3015(ClanChannel var1) {
		var1.removeMember(this.field1573); // L: 96
	} // L: 97

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Li;I)Le;",
		garbageValue = "-62373396"
	)
	public static class3 method2824(class6 var0) {
		switch(var0.field22) { // L: 9
		case 0:
			return new class0(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-15"
	)
	public static String method2826(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 58

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 59
			int var5 = var0[var4] & 255; // L: 60
			var3.append(class334.field4052[var5 >>> 2]); // L: 61
			if (var4 < var2 - 1) { // L: 62
				int var6 = var0[var4 + 1] & 255; // L: 63
				var3.append(class334.field4052[(var5 & 3) << 4 | var6 >>> 4]); // L: 64
				if (var4 < var2 - 2) { // L: 65
					int var7 = var0[var4 + 2] & 255; // L: 66
					var3.append(class334.field4052[(var6 & 15) << 2 | var7 >>> 6]).append(class334.field4052[var7 & 63]); // L: 67
				} else {
					var3.append(class334.field4052[(var6 & 15) << 2]).append("="); // L: 69
				}
			} else {
				var3.append(class334.field4052[(var5 & 3) << 4]).append("=="); // L: 71
			}
		}

		return var3.toString(); // L: 73
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "6"
	)
	static int method2825(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 34
	}
}
