import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class387 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -866840671
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1931079881
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1125219351
	)
	@Export("element")
	int element;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 866496065
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1835416561
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;ILfx;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-878538128"
	)
	@Export("init")
	void init() {
		this.element = class245.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class13.WorldMapElement_get(this.element));
		WorldMapElement var1 = class13.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1329338621"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Lga;",
		garbageValue = "5309"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1544604408"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "318612621"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Ley;",
		garbageValue = "49"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "273507297"
	)
	static boolean method3461(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}
}
