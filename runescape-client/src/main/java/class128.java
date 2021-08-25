import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class128 extends class132 {
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 107804773
	)
	static int field1477;
	@ObfuscatedName("n")
	String field1474;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -231777571
	)
	int field1475;
	@ObfuscatedName("m")
	byte field1476;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class128(class133 var1) {
		this.this$0 = var1;
		this.field1474 = null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "3602154"
	)
	void vmethod2703(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1474 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1475 = var1.readUnsignedShort();
		this.field1476 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "66"
	)
	void vmethod2702(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1474);
		var2.world = this.field1475;
		var2.rank = this.field1476;
		var1.addMember(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;B)V",
		garbageValue = "7"
	)
	public static void method2632(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1309972992"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class316.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ljd;III)V",
		garbageValue = "774918140"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
		}

	}
}
