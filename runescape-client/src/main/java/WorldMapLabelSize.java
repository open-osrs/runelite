import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lah;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lah;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lah;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 1573352615
	)
	static int field134;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		signature = "Leh;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 20574645
	)
	final int field130;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1754805069
	)
	final int field132;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 629937619
	)
	final int field133;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field130 = var1;
		this.field132 = var2;
		this.field133 = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(FI)Z",
		garbageValue = "-645861568"
	)
	boolean method246(float var1) {
		return var1 >= (float)this.field133;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(III)Lhd;",
		garbageValue = "-756668004"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = WorldMapSprite.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1950669116"
	)
	public static boolean method251() {
		return class206.field2439 != 0 ? true : WorldMapSprite.midiPcmStream.isReady();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1407102588"
	)
	static final void method249() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own friend list";
		ObjectSound.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2140827250"
	)
	static void method247() {
		if (Client.oculusOrbState == 1) {
			Client.field756 = true;
		}

	}
}
