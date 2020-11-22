import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class89 {
	@ObfuscatedName("z")
	static final BigInteger field1166;
	@ObfuscatedName("q")
	static final BigInteger field1167;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static Bounds field1163;

	static {
		field1166 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field1167 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Lbk;",
		garbageValue = "971686415"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "39"
	)
	static void method2163() {
		Players.Players_count = 0; // L: 616

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 617
			Players.field1284[var0] = null; // L: 618
			Players.field1295[var0] = 1; // L: 619
		}

	} // L: 621

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1081555887"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2933
		NetFileRequest.method4292(); // L: 2935
		MidiPcmStream.method3970(); // L: 2936
		KitDefinition.KitDefinition_cached.clear(); // L: 2938
		ObjectDefinition.ObjectDefinition_cached.clear(); // L: 2941
		ObjectDefinition.ObjectDefinition_cachedModelData.clear(); // L: 2942
		ObjectDefinition.ObjectDefinition_cachedEntities.clear(); // L: 2943
		ObjectDefinition.ObjectDefinition_cachedModels.clear(); // L: 2944
		TileItem.method2239(); // L: 2946
		class200.method3803(); // L: 2947
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2949
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2950
		Projectile.method2228(); // L: 2952
		class234.method4261(); // L: 2953
		MouseRecorder.method1283(); // L: 2954
		GrandExchangeOfferAgeComparator.method242(); // L: 2955
		WorldMapIcon_0.method297(); // L: 2956
		StructDefinition.method4699(); // L: 2957
		ParamDefinition.ParamDefinition_cached.clear(); // L: 2959
		class13.method150(); // L: 2961
		WorldMapIcon_1.method398(); // L: 2962
		Widget.Widget_cachedSprites.clear(); // L: 2964
		Widget.Widget_cachedModels.clear(); // L: 2965
		Widget.Widget_cachedFonts.clear(); // L: 2966
		Widget.Widget_cachedSpriteMasks.clear(); // L: 2967
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2969
		Script.Script_cached.clear(); // L: 2970
		MenuAction.archive0.clearFiles(); // L: 2971
		WorldMapManager.archive1.clearFiles(); // L: 2972
		FaceNormal.archive3.clearFiles(); // L: 2973
		Username.archive4.clearFiles(); // L: 2974
		Varcs.archive5.clearFiles(); // L: 2975
		ApproximateRouteStrategy.archive6.clearFiles(); // L: 2976
		class236.archive7.clearFiles(); // L: 2977
		GrandExchangeOffer.archive8.clearFiles(); // L: 2978
		WorldMapData_1.archive9.clearFiles(); // L: 2979
		class281.archive10.clearFiles(); // L: 2980
		AbstractByteArrayCopier.archive11.clearFiles(); // L: 2981
		ViewportMouse.archive12.clearFiles(); // L: 2982
		ModeWhere.scene.clear(); // L: 2984

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2985
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2986
		VertexNormal.method3133(2); // L: 2987
		Client.currentTrackGroupId = -1; // L: 2988
		Client.field916 = false; // L: 2989

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 2991
			if (var1.stream1 != null) { // L: 2992
				GrandExchangeEvents.pcmStreamMixer.removeSubStream(var1.stream1); // L: 2993
				var1.stream1 = null; // L: 2994
			}

			if (var1.stream2 != null) { // L: 2996
				GrandExchangeEvents.pcmStreamMixer.removeSubStream(var1.stream2); // L: 2997
				var1.stream2 = null; // L: 2998
			}
		}

		ObjectSound.objectSounds.clear(); // L: 3001
		BuddyRankComparator.updateGameState(10); // L: 3003
	} // L: 3004
}
