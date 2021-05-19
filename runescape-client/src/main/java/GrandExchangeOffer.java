import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_archive")
	static AbstractArchive Widget_archive;
	@ObfuscatedName("h")
	@Export("state")
	byte state;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -60064091
	)
	@Export("id")
	public int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -975130915
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1629352851
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -65467077
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1657421715
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lnk;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-90"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1415242363"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-17191535"
	)
	void method5018(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-704513201"
	)
	void method5019(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-21"
	)
	public static int method5017(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 45

		for (int var4 = var1; var4 < var2; ++var4) { // L: 46
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 47
		}

		var3 = ~var3; // L: 49
		return var3; // L: 50
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-28"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = PacketWriter.getWidgetChild(var0, var1); // L: 8913
		if (var4 != null && var4.onTargetEnter != null) { // L: 8914
			ScriptEvent var5 = new ScriptEvent(); // L: 8915
			var5.widget = var4; // L: 8916
			var5.args = var4.onTargetEnter; // L: 8917
			class259.runScriptEvent(var5); // L: 8918
		}

		Client.field773 = var3; // L: 8920
		Client.isSpellSelected = true; // L: 8921
		class6.selectedSpellWidget = var0; // L: 8922
		Client.selectedSpellChildIndex = var1; // L: 8923
		GrandExchangeOfferUnitPriceComparator.selectedSpellFlags = var2; // L: 8924
		VerticalAlignment.invalidateWidget(var4); // L: 8925
	} // L: 8926
}
