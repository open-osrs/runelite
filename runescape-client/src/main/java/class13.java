import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class13 extends class14 {
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 5109296971613093853L
	)
	long field119;
	@ObfuscatedName("o")
	String field116;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class13(class2 var1) {
		this.this$0 = var1;
		this.field119 = -1L; // L: 194
		this.field116 = null; // L: 195
	} // L: 197

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field119 = var1.readLong(); // L: 202
		}

		this.field116 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method188(this.field119, this.field116); // L: 208
	} // L: 209

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)Lhu;",
		garbageValue = "1854915849"
	)
	static Widget method220(Widget var0) {
		Widget var2 = var0; // L: 11063
		int var3 = AbstractWorldMapData.method3079(DirectByteArrayCopier.getWidgetFlags(var0)); // L: 11065
		Widget var1;
		if (var3 == 0) { // L: 11066
			var1 = null; // L: 11067
		} else {
			int var4 = 0;

			while (true) {
				if (var4 >= var3) {
					var1 = var2; // L: 11077
					break;
				}

				var2 = class139.getWidget(var2.parentId); // L: 11071
				if (var2 == null) { // L: 11072
					var1 = null; // L: 11073
					break; // L: 11074
				}

				++var4; // L: 11070
			}
		}

		Widget var5 = var1; // L: 11079
		if (var1 == null) { // L: 11080
			var5 = var0.parent;
		}

		return var5; // L: 11081
	}
}
