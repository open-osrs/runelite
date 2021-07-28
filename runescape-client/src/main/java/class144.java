import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class144 {
	@ObfuscatedName("f")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class232.method4453();
		AbstractByteArrayCopier.method4860();
		MenuAction.method1655();
		class7.method58();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		VarbitComposition.method2898();
		class52.method1651();
		AbstractRasterProvider.method7053();
		VarbitComposition.VarbitDefinition_cached.clear();
		VarpDefinition.VarpDefinition_cached.clear();
		class99.field1271.method6513();
		GrandExchangeOfferUnitPriceComparator.HitSplatDefinition_cachedSprites.method6513();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		MilliClock.method2671();
		ParamComposition.ParamDefinition_cached.clear();
		ScriptFrame.method851();
		UrlRequester.method2126();
		Canvas.method123();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		class120.archive0.clearFiles();
		Language.archive1.clearFiles();
		Decimator.archive3.clearFiles();
		InvDefinition.archive4.clearFiles();
		Skeleton.archive5.clearFiles();
		class108.archive6.clearFiles();
		class74.archive7.clearFiles();
		class270.archive8.clearFiles();
		class126.archive9.clearFiles();
		ClanChannelMember.archive10.clearFiles();
		class339.archive11.clearFiles();
		ApproximateRouteStrategy.archive12.clearFiles();
		WorldMapIcon_1.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		class234.musicPlayerStatus = 1;
		class234.musicTrackArchive = null;
		class234.musicTrackGroupId = -1;
		UserComparator6.musicTrackFileId = -1;
		HorizontalAlignment.musicTrackVolume = 0;
		EnumComposition.musicTrackBoolean = false;
		ClanChannel.pcmSampleLength = 2;
		Client.currentTrackGroupId = -1;
		Client.field647 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				TileItem.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				TileItem.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		class16.updateGameState(10);
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "-17"
	)
	static void method2802(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class308.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "298776696"
	)
	static void method2803(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var1 = InvDefinition.method2698();
			var0.writeBytes(var1, 0, var1.length);
		}
	}
}
