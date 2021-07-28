import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class126 extends class119 {
	@ObfuscatedName("ct")
	public static char field1449;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "[Lom;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("s")
	String field1452;
	@ObfuscatedName("t")
	byte field1454;
	@ObfuscatedName("v")
	byte field1450;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	final class120 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	class126(class120 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "1209873443"
	)
	void vmethod2558(Buffer var1) {
		this.field1452 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1452 != null) {
			var1.readUnsignedByte();
			this.field1454 = var1.readByte();
			this.field1450 = var1.readByte();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-7"
	)
	void vmethod2555(ClanChannel var1) {
		var1.name = this.field1452;
		if (this.field1452 != null) {
			var1.field1430 = this.field1454;
			var1.field1436 = this.field1450;
		}

	}
}
