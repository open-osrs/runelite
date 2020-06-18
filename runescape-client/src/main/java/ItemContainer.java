import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	@Export("rightTitleSprite")
	static Sprite rightTitleSprite;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "Llv;"
	)
	static Bounds field567;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1890638997
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("o")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("q")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Lls;",
		garbageValue = "-1724420240"
	)
	public static PrivateChatMode method1232(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3818, PrivateChatMode.field3820, PrivateChatMode.field3819};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field3817) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "1507611056"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Ljr;",
		garbageValue = "2131303603"
	)
	@Export("getEnum")
	public static EnumDefinition getEnum(int var0) {
		EnumDefinition var1 = (EnumDefinition)EnumDefinition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class349.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumDefinition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lch;Lch;IZIZI)I",
		garbageValue = "-1532099004"
	)
	static int method1225(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = Actor.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = Actor.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}
}
