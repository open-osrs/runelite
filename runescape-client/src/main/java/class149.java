import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class149 extends class142 {
	@ObfuscatedName("c")
	String field1677;
	@ObfuscatedName("l")
	byte field1675;
	@ObfuscatedName("s")
	byte field1676;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	class149(class143 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-103"
	)
	void vmethod3014(Buffer var1) {
		this.field1677 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1677 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1675 = var1.readByte(); // L: 161
			this.field1676 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leg;B)V",
		garbageValue = "48"
	)
	void vmethod3015(ClanChannel var1) {
		var1.name = this.field1677; // L: 167
		if (this.field1677 != null) { // L: 168
			var1.field1656 = this.field1675; // L: 169
			var1.field1658 = this.field1676; // L: 170
		}

	} // L: 172

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "-457788454"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 33
		if (var1 != null) { // L: 34
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 35
			var1 = new KitDefinition(); // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}
}
