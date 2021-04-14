import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public abstract class class16 extends Node {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2104011211
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 2074784147
	)
	@Export("menuX")
	static int menuX;

	class16() {
	} // L: 48

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	abstract void vmethod356(Buffer var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	abstract void vmethod352(class3 var1);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)Ljava/lang/String;",
		garbageValue = "-1639083149"
	)
	public static String method258(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 67
			if (var2 > 32767) { // L: 68
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 69
			var0.offset += class227.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 70
			String var4 = class303.decodeStringCp1252(var3, 0, var2); // L: 71
			var1 = var4; // L: 72
		} catch (Exception var6) { // L: 74
			var1 = "Cabbage"; // L: 75
		}

		return var1; // L: 78
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2104011211"
	)
	static final void method259() {
		ApproximateRouteStrategy.method1205(); // L: 2384
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2386
		KitDefinition.KitDefinition_cached.clear(); // L: 2389
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 2392
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 2393
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 2394
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 2395
		MusicPatchPcmStream.method4123(); // L: 2397
		WorldMapLabelSize.method2678(); // L: 2398
		class22.method320(); // L: 2399
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2401
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2402
		WorldMapAreaData.method3212(); // L: 2404
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2406
		Clock.method2600(); // L: 2408
		WorldMapLabelSize.method2676(); // L: 2409
		ParamComposition.method5096(); // L: 2410
		ParamComposition.ParamDefinition_cached.clear(); // L: 2412
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2415
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 2418
		ReflectionCheck.method1172(); // L: 2420
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2421
		Script.Script_cached.clear(); // L: 2422
		TriBool.archive0.clearFiles(); // L: 2423
		class367.archive1.clearFiles(); // L: 2424
		class5.archive3.clearFiles(); // L: 2425
		ItemContainer.archive4.clearFiles(); // L: 2426
		class157.archive5.clearFiles(); // L: 2427
		class8.archive6.clearFiles(); // L: 2428
		class12.archive7.clearFiles(); // L: 2429
		SoundSystem.archive8.clearFiles(); // L: 2430
		AbstractWorldMapData.archive9.clearFiles(); // L: 2431
		class373.archive10.clearFiles(); // L: 2432
		class10.archive11.clearFiles(); // L: 2433
		BuddyRankComparator.archive12.clearFiles(); // L: 2434
	} // L: 2435

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "-60"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 6772

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6773 6774 6779
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 6775
				var9 = var10; // L: 6776
				break;
			}
		}

		if (var9 == null) { // L: 6781
			var9 = new PendingSpawn(); // L: 6782
			var9.plane = var0; // L: 6783
			var9.type = var3; // L: 6784
			var9.x = var1; // L: 6785
			var9.y = var2; // L: 6786
			long var11 = 0L; // L: 6788
			int var13 = -1; // L: 6789
			int var14 = 0; // L: 6790
			int var15 = 0; // L: 6791
			if (var9.type == 0) { // L: 6792
				var11 = WorldMapArea.scene.getBoundaryObjectTag(var9.plane, var9.x, var9.y);
			}

			if (var9.type == 1) { // L: 6793
				var11 = WorldMapArea.scene.getWallDecorationTag(var9.plane, var9.x, var9.y);
			}

			if (var9.type == 2) { // L: 6794
				var11 = WorldMapArea.scene.getGameObjectTag(var9.plane, var9.x, var9.y);
			}

			if (var9.type == 3) {
				var11 = WorldMapArea.scene.getFloorDecorationTag(var9.plane, var9.x, var9.y); // L: 6795
			}

			if (0L != var11) { // L: 6796
				int var16 = WorldMapArea.scene.getObjectFlags(var9.plane, var9.x, var9.y, var11); // L: 6797
				var13 = WorldMapSection1.Entity_unpackID(var11); // L: 6798
				var14 = var16 & 31; // L: 6799
				var15 = var16 >> 6 & 3; // L: 6800
			}

			var9.objectId = var13; // L: 6802
			var9.field1203 = var14; // L: 6803
			var9.field1199 = var15; // L: 6804
			Client.pendingSpawns.addFirst(var9); // L: 6806
		}

		var9.id = var4; // L: 6808
		var9.field1196 = var5; // L: 6809
		var9.orientation = var6; // L: 6810
		var9.delay = var7; // L: 6811
		var9.hitpoints = var8; // L: 6812
	} // L: 6813
}
