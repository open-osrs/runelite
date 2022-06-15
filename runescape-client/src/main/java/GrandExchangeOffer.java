import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 274941287
	)
	static int field4070;
	@ObfuscatedName("c")
	@Export("state")
	byte state;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -63078935
	)
	@Export("id")
	public int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1780299269
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 859663365
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -505288903
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1209134593
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lqt;Z)V",
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "132429413"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-535852504"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1607092749"
	)
	void method6007(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1011493078"
	)
	void method6005(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65
}
