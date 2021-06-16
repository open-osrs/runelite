import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class23 extends class14 {
	@ObfuscatedName("c")
	@Export("operatingSystemName")
	public static String operatingSystemName;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 339931933
	)
	int field190;
	@ObfuscatedName("e")
	byte field189;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class23(class2 var1) {
		this.this$0 = var1;
		this.field190 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field190 = var1.readUnsignedShort(); // L: 134
		this.field189 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method131(this.field190, this.field189); // L: 139
	} // L: 140

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ler;",
		garbageValue = "202044265"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 27
		if (var1 != null) { // L: 28
			return var1;
		} else {
			byte[] var2 = class125.KitDefinition_archive.takeFile(3, var0); // L: 29
			var1 = new KitDefinition(); // L: 30
			if (var2 != null) { // L: 31
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhl;",
		garbageValue = "-2126823269"
	)
	static LoginPacket[] method318() {
		return new LoginPacket[]{LoginPacket.field2809, LoginPacket.field2804, LoginPacket.field2802, LoginPacket.field2801, LoginPacket.field2806, LoginPacket.field2803}; // L: 22
	}
}
