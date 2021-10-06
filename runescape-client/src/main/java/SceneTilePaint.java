import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("y")
	public static short[] field2600;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2030212895
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1181812781
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1463738049
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1957825957
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -435313337
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("k")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1677192307
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (class264.friendsChat != null) {
			class264.friendsChat.invalidateIgnoreds();
		}

	}
}
