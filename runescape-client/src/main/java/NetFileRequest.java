import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1816786653
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("f")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-552402310"
	)
	static final void method4912() {
		if (Client.logoutTimer > 0) { // L: 2687
			class7.logOut(); // L: 2688
		} else {
			Client.timer.method5590(); // L: 2691
			class12.updateGameState(40); // L: 2692
			Client.field688 = Client.packetWriter.getSocket(); // L: 2693
			Client.packetWriter.removeSocket(); // L: 2694
		}
	} // L: 2689 2695
}
