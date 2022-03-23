import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class20 implements Callable {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static AbstractArchive field101;
	@ObfuscatedName("r")
	public static short[][] field102;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class10 field100;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lp;Lk;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field100 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field100.method105()) { // L: 53
				GrandExchangeOfferTotalQuantityComparator.method6007(10L); // L: 54
			}
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}

		return this.field100.method91();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-28287593"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return ClanChannelMember.method2850(var0, 10, true); // L: 35
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "441133121"
	)
	static void method327() {
		if (Login.clearLoginScreen) { // L: 299
			AbstractByteArrayCopier.titleboxSprite = null; // L: 300
			class137.titlebuttonSprite = null; // L: 301
			class355.runesSprite = null; // L: 302
			Login.leftTitleSprite = null; // L: 303
			class162.rightTitleSprite = null; // L: 304
			HorizontalAlignment.logoSprite = null; // L: 305
			class114.title_muteSprite = null; // L: 306
			class160.options_buttons_0Sprite = null; // L: 307
			Skeleton.options_buttons_2Sprite = null; // L: 308
			class128.worldSelectBackSprites = null; // L: 309
			class162.worldSelectFlagSprites = null; // L: 310
			Client.worldSelectArrows = null; // L: 311
			class29.worldSelectStars = null; // L: 312
			class19.field96 = null; // L: 313
			Login.loginScreenRunesAnimation.method2230(); // L: 314
			class273.musicPlayerStatus = 1; // L: 316
			class147.musicTrackArchive = null; // L: 317
			ArchiveLoader.musicTrackGroupId = -1; // L: 318
			class273.musicTrackFileId = -1; // L: 319
			DevicePcmPlayerProvider.musicTrackVolume = 0; // L: 320
			class260.musicTrackBoolean = false; // L: 321
			class273.pcmSampleLength = 2; // L: 322
			NPC.method2366(true); // L: 324
			Login.clearLoginScreen = false; // L: 325
		}
	} // L: 326

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	static void method326() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromFriend(); // L: 60
		}

	} // L: 63

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-43"
	)
	static final void method324(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334; // L: 5025
		if (var8 < 0) { // L: 5026
			var8 = 0;
		} else if (var8 > 100) { // L: 5027
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 5028
		int var7 = var5 * var9 / 256; // L: 5029
		var8 = 2048 - var3 & 2047; // L: 5032
		var9 = 2048 - var4 & 2047; // L: 5033
		int var10 = 0; // L: 5034
		int var11 = 0; // L: 5035
		int var12 = var7; // L: 5036
		int var13;
		int var14;
		int var15;
		if (var8 != 0) { // L: 5037
			var13 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5038
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5039
			var15 = var14 * var11 - var13 * var7 >> 16; // L: 5040
			var12 = var7 * var14 + var13 * var11 >> 16; // L: 5041
			var11 = var15; // L: 5042
		}

		if (var9 != 0) { // L: 5044
			var13 = Rasterizer3D.Rasterizer3D_sine[var9]; // L: 5045
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9]; // L: 5046
			var15 = var14 * var10 + var12 * var13 >> 16; // L: 5047
			var12 = var12 * var14 - var13 * var10 >> 16; // L: 5048
			var10 = var15; // L: 5049
		}

		if (Client.isCameraLocked) { // L: 5051
			class175.field1883 = var0 - var10; // L: 5052
			ReflectionCheck.field250 = var1 - var11; // L: 5053
			ModeWhere.field4080 = var2 - var12; // L: 5054
			WorldMapRegion.field2706 = var3; // L: 5055
			class457.field4747 = var4; // L: 5056
		} else {
			EnumComposition.cameraX = var0 - var10; // L: 5059
			FriendSystem.cameraY = var1 - var11; // L: 5060
			CollisionMap.cameraZ = var2 - var12; // L: 5061
			Language.cameraPitch = var3; // L: 5062
			MusicPatchNode2.cameraYaw = var4; // L: 5063
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (Messages.oculusOrbFocalPointX >> 7 != class19.localPlayer.x >> 7 || class115.oculusOrbFocalPointY >> 7 != class19.localPlayer.y >> 7)) { // L: 5065 5066
			var13 = class19.localPlayer.plane; // L: 5067
			var14 = (Messages.oculusOrbFocalPointX >> 7) + ApproximateRouteStrategy.baseX; // L: 5068
			var15 = (class115.oculusOrbFocalPointY >> 7) + class250.baseY; // L: 5069
			class392.method7191(var14, var15, var13, true); // L: 5070
		}

	} // L: 5073

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lcy;ZI)V",
		garbageValue = "-1005084582"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11518
		int var3 = (int)var0.key; // L: 11519
		var0.remove(); // L: 11520
		if (var1) { // L: 11521
			WorldMapID.method5000(var2);
		}

		class19.method318(var2); // L: 11522
		Widget var4 = HorizontalAlignment.getWidget(var3); // L: 11523
		if (var4 != null) { // L: 11524
			class290.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) { // L: 11525
			MouseHandler.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11526
}
