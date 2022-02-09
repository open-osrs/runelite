import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class144 extends class126 {
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1091689105
	)
	int field1649;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1307184813
	)
	int field1647;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class144(class129 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		this.field1649 = var1.readInt(); // L: 274
		this.field1647 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2882(this.field1649, this.field1647); // L: 279
	} // L: 280

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method2969(int var0) {
		if (var0 < 0) { // L: 9383
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 9384 9385
		}
	}
}
