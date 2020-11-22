import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1272071383
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1816725297
	)
	@Export("element")
	int element;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -29406003
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1922717703
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhw;Lhw;ILax;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 39
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;",
		garbageValue = "-669051823"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 43
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1627026836"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 47
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "190840278"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 51
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1939133514"
	)
	@Export("init")
	void init() {
		this.element = ScriptEvent.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class194.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class194.WorldMapElement_get(this.getElement()); // L: 26
		Sprite var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lcf;Lcf;IZIZI)I",
		garbageValue = "586968313"
	)
	static int method395(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = WorldMapSprite.compareWorlds(var0, var1, var2, var3); // L: 199
		if (var6 != 0) { // L: 200
			return var3 ? -var6 : var6; // L: 201
		} else if (var4 == -1) { // L: 204
			return 0;
		} else {
			int var7 = WorldMapSprite.compareWorlds(var0, var1, var4, var5); // L: 205
			return var5 ? -var7 : var7; // L: 206
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-218709876"
	)
	public static void method398() {
		PlayerAppearance.PlayerAppearance_cachedModels.clear(); // L: 252
	} // L: 253

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIII)V",
		garbageValue = "-630082836"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2670 == null) { // L: 926
			throw new RuntimeException(); // L: 927
		} else {
			var0.field2670[var1] = var2; // L: 929
			var0.field2671[var1] = var3; // L: 930
		}
	} // L: 931

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1198701264"
	)
	static final void method392() {
		int var0 = WorldMapSection2.field225 * 128 + 64; // L: 3711
		int var1 = WorldMapLabelSize.field152 * 128 + 64; // L: 3712
		int var2 = GrandExchangeOfferWorldComparator.getTileHeight(var0, var1, GrandExchangeOfferUnitPriceComparator.Client_plane) - SpriteMask.field2542; // L: 3713
		if (ItemContainer.cameraX < var0) { // L: 3714
			ItemContainer.cameraX = (var0 - ItemContainer.cameraX) * ReflectionCheck.field1364 / 1000 + ItemContainer.cameraX + Player.field674; // L: 3715
			if (ItemContainer.cameraX > var0) { // L: 3716
				ItemContainer.cameraX = var0;
			}
		}

		if (ItemContainer.cameraX > var0) { // L: 3718
			ItemContainer.cameraX -= ReflectionCheck.field1364 * (ItemContainer.cameraX - var0) / 1000 + Player.field674; // L: 3719
			if (ItemContainer.cameraX < var0) { // L: 3720
				ItemContainer.cameraX = var0;
			}
		}

		if (ChatChannel.cameraY < var2) { // L: 3722
			ChatChannel.cameraY = (var2 - ChatChannel.cameraY) * ReflectionCheck.field1364 / 1000 + ChatChannel.cameraY + Player.field674; // L: 3723
			if (ChatChannel.cameraY > var2) { // L: 3724
				ChatChannel.cameraY = var2;
			}
		}

		if (ChatChannel.cameraY > var2) { // L: 3726
			ChatChannel.cameraY -= ReflectionCheck.field1364 * (ChatChannel.cameraY - var2) / 1000 + Player.field674; // L: 3727
			if (ChatChannel.cameraY < var2) { // L: 3728
				ChatChannel.cameraY = var2;
			}
		}

		if (WorldMapManager.cameraZ < var1) { // L: 3730
			WorldMapManager.cameraZ = (var1 - WorldMapManager.cameraZ) * ReflectionCheck.field1364 / 1000 + WorldMapManager.cameraZ + Player.field674; // L: 3731
			if (WorldMapManager.cameraZ > var1) { // L: 3732
				WorldMapManager.cameraZ = var1;
			}
		}

		if (WorldMapManager.cameraZ > var1) { // L: 3734
			WorldMapManager.cameraZ -= ReflectionCheck.field1364 * (WorldMapManager.cameraZ - var1) / 1000 + Player.field674; // L: 3735
			if (WorldMapManager.cameraZ < var1) { // L: 3736
				WorldMapManager.cameraZ = var1;
			}
		}

		var0 = MilliClock.field2048 * 128 + 64; // L: 3738
		var1 = PcmPlayer.field1449 * 128 + 64; // L: 3739
		var2 = GrandExchangeOfferWorldComparator.getTileHeight(var0, var1, GrandExchangeOfferUnitPriceComparator.Client_plane) - AbstractRasterProvider.field3890; // L: 3740
		int var3 = var0 - ItemContainer.cameraX; // L: 3741
		int var4 = var2 - ChatChannel.cameraY; // L: 3742
		int var5 = var1 - WorldMapManager.cameraZ; // L: 3743
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3)); // L: 3744
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047; // L: 3745
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047; // L: 3746
		if (var7 < 128) { // L: 3747
			var7 = 128;
		}

		if (var7 > 383) { // L: 3748
			var7 = 383;
		}

		if (World.cameraPitch < var7) { // L: 3749
			World.cameraPitch = (var7 - World.cameraPitch) * class60.field452 / 1000 + World.cameraPitch + WorldMapCacheName.field326; // L: 3750
			if (World.cameraPitch > var7) { // L: 3751
				World.cameraPitch = var7;
			}
		}

		if (World.cameraPitch > var7) { // L: 3753
			World.cameraPitch -= class60.field452 * (World.cameraPitch - var7) / 1000 + WorldMapCacheName.field326; // L: 3754
			if (World.cameraPitch < var7) { // L: 3755
				World.cameraPitch = var7;
			}
		}

		int var9 = var8 - ViewportMouse.cameraYaw; // L: 3757
		if (var9 > 1024) { // L: 3758
			var9 -= 2048;
		}

		if (var9 < -1024) { // L: 3759
			var9 += 2048;
		}

		if (var9 > 0) { // L: 3760
			ViewportMouse.cameraYaw = var9 * class60.field452 / 1000 + ViewportMouse.cameraYaw + WorldMapCacheName.field326; // L: 3761
			ViewportMouse.cameraYaw &= 2047; // L: 3762
		}

		if (var9 < 0) { // L: 3764
			ViewportMouse.cameraYaw -= -var9 * class60.field452 / 1000 + WorldMapCacheName.field326; // L: 3765
			ViewportMouse.cameraYaw &= 2047; // L: 3766
		}

		int var10 = var8 - ViewportMouse.cameraYaw; // L: 3768
		if (var10 > 1024) { // L: 3769
			var10 -= 2048;
		}

		if (var10 < -1024) { // L: 3770
			var10 += 2048;
		}

		if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) { // L: 3771
			ViewportMouse.cameraYaw = var8;
		}

	} // L: 3772
}
