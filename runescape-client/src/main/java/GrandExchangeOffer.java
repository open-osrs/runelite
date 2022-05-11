import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("o")
	@Export("state")
	byte state;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1429288873
	)
	@Export("id")
	public int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 708150215
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1969215889
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1702065649
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2023629729
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lpx;Z)V",
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "284680094"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "17"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "585573305"
	)
	void method5823(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1891202738"
	)
	void method5826(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65
}
