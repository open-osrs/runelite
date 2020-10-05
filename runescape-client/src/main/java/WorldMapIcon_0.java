import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ay")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1560558325
	)
	static int field154;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -68382233
	)
	final int element;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final WorldMapLabel label;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1820517903
	)
	final int subWidth;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 877531577
	)
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhg;Lhg;ILaq;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = WorldMapSection0.WorldMapElement_get(this.getElement()); // L: 17
		Sprite var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1613828162"
	)
	public int getElement() {
		return this.element; // L: 30
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Laq;",
		garbageValue = "499378708"
	)
	WorldMapLabel getLabel() {
		return this.label; // L: 34
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "182515130"
	)
	int getSubWidth() {
		return this.subWidth; // L: 38
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2001682063"
	)
	int getSubHeight() {
		return this.subHeight; // L: 42
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Lhq;B)I",
		garbageValue = "-82"
	)
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 10711
		return var1 != null ? var1.integer : var0.flags; // L: 10712 10713
	}
}
