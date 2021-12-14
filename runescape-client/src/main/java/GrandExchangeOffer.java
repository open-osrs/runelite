import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("c")
	@Export("state")
	byte state;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 449294439
	)
	@Export("id")
	public int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -119875967
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 589510857
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1743574527
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -309462137
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lpi;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-365049139"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2147483647"
	)
	void method5765(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-435429796"
	)
	void method5766(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
