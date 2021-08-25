import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class123 extends class116 {
	@ObfuscatedName("n")
	boolean field1424;
	@ObfuscatedName("c")
	byte field1425;
	@ObfuscatedName("m")
	byte field1426;
	@ObfuscatedName("k")
	byte field1429;
	@ObfuscatedName("o")
	byte field1428;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class123(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1424 = var1.readUnsignedByte() == 1;
		this.field1425 = var1.readByte();
		this.field1426 = var1.readByte();
		this.field1429 = var1.readByte();
		this.field1428 = var1.readByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.allowGuests = this.field1424;
		var1.field1448 = this.field1425;
		var1.field1456 = this.field1426;
		var1.field1457 = this.field1429;
		var1.field1458 = this.field1428;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;Lnz;I)Lnz;",
		garbageValue = "-1477647731"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = ItemContainer.method2041(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "248614721"
	)
	public static long method2536(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "639109208"
	)
	static void method2534() {
		VarbitComposition.clientPreferences.field1192 = Client.field485;
		DevicePcmPlayerProvider.savePreferences();
	}
}
