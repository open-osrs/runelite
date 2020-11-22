import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("f")
	@Export("text")
	String text;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1900229559
	)
	@Export("width")
	int width;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 424685221
	)
	@Export("height")
	int height;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILab;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1774401095"
	)
	protected static final void method519() {
		UserComparator3.clock.mark(); // L: 405

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 406
			GameShell.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 407
			GameShell.clientTickTimes[var0] = 0L;
		}

		GameShell.gameCyclesToDo = 0; // L: 408
	} // L: 409
}
