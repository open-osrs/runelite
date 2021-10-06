import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class128 extends class132 {
	@ObfuscatedName("l")
	String field1474;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1306318707
	)
	int field1471;
	@ObfuscatedName("f")
	byte field1472;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class128(class133 var1) {
		this.this$0 = var1;
		this.field1474 = null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "35"
	)
	void vmethod2760(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1474 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1471 = var1.readUnsignedShort();
		this.field1472 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "1634989707"
	)
	void vmethod2759(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1474);
		var2.world = this.field1471;
		var2.rank = this.field1472;
		var1.addMember(var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([Lku;IB)Lku;",
		garbageValue = "13"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)V",
		garbageValue = "414172214"
	)
	public static void method2662(AbstractArchive var0, AbstractArchive var1) {
		GrandExchangeOfferAgeComparator.NpcDefinition_archive = var0;
		NPCComposition.NpcDefinition_modelArchive = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-236760725"
	)
	static final int method2663(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
