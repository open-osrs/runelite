import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class151 extends class144 {
	@ObfuscatedName("v")
	String field1684;
	@ObfuscatedName("o")
	byte field1682;
	@ObfuscatedName("h")
	byte field1683;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lez;)V"
	)
	class151(class145 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;S)V",
		garbageValue = "3239"
	)
	void vmethod3096(Buffer var1) {
		this.field1684 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1684 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1682 = var1.readByte(); // L: 161
			this.field1683 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ley;B)V",
		garbageValue = "26"
	)
	void vmethod3093(ClanChannel var1) {
		var1.name = this.field1684; // L: 167
		if (this.field1684 != null) { // L: 168
			var1.field1666 = this.field1682; // L: 169
			var1.field1669 = this.field1683; // L: 170
		}

	} // L: 172

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfx;",
		garbageValue = "-73"
	)
	public static FloorUnderlayDefinition method3100(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 27
			var1 = new FloorUnderlayDefinition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 30
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}
}
