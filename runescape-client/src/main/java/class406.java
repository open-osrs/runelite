import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
final class class406 implements class405 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;I)V",
		garbageValue = "246575309"
	)
	public void vmethod7273(Object var1, Buffer var2) {
		this.method7229((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)Ljava/lang/Object;",
		garbageValue = "3"
	)
	public Object vmethod7271(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lpi;I)V",
		garbageValue = "2131045712"
	)
	void method7229(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13
}
