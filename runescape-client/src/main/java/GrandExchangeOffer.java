import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("v")
	@Export("state")
	byte state;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1898711
	)
	@Export("id")
	public int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1229494071
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -822093809
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1567060795
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 176369301
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lnd;Z)V",
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "184180839"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1399016532"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1177781475"
	)
	void method5092(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	void method5102(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65
}
