import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ar")
	protected static String field1301;
	@ObfuscatedName("aw")
	static String field1299;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1688540919
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -895126303
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lhy;",
		garbageValue = "1081110576"
	)
	@Export("getModel")
	protected final Model getModel() {
		return EnumComposition.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1179876648"
	)
	public static int method2414(int var0) {
		return class7.method51(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 73
	}
}
