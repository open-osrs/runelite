import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1383908263
	)
	static int field264;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		longValue = -1209502997974573813L
	)
	static long field261;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = -1316808169
	)
	static int field254;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 2099345905
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("o")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "2081761027"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IB)Lhd;",
		garbageValue = "115"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = UserComparator4.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "2146534283"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		signature = "(Lig;Ljava/lang/String;I)V",
		garbageValue = "2099603799"
	)
	static void method481(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field945 += var2.groupCount;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1835863543"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		TilePaint.method3188();
		if (ClientPreferences.clanChat != null) {
			ClientPreferences.clanChat.invalidateIgnoreds();
		}

	}
}
