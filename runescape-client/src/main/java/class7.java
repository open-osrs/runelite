import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("b")
public class class7 extends class16 {
	@ObfuscatedName("v")
	String field64;
	@ObfuscatedName("n")
	byte field65;
	@ObfuscatedName("f")
	byte field66;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class7(class19 var1) {
		this.this$0 = var1; // L: 154
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		this.field64 = var1.readStringCp1252NullTerminatedOrNull(); // L: 157
		if (this.field64 != null) { // L: 158
			var1.readUnsignedByte(); // L: 159
			this.field65 = var1.readByte(); // L: 160
			this.field66 = var1.readByte(); // L: 161
		}

	} // L: 163

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(ClanChannel var1) {
		var1.name = this.field64; // L: 166
		if (this.field64 != null) { // L: 167
			var1.field32 = this.field65; // L: 168
			var1.field26 = this.field66; // L: 169
		}

	} // L: 171

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Loh;",
		garbageValue = "-1133094232"
	)
	static SpritePixels method76(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1498995212"
	)
	static int method74(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3425
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = SpotAnimationDefinition.getWindowedMode(); // L: 3426
			return 1; // L: 3427
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3429
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3430
				if (var3 == 1 || var3 == 2) { // L: 3431
					CollisionMap.setWindowedMode(var3);
				}

				return 1; // L: 3432
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3434
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ObjectComposition.clientPreferences.windowMode; // L: 3435
				return 1; // L: 3436
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3438
				if (var0 == 5310) { // L: 3446
					--class44.Interpreter_intStackSize; // L: 3447
					return 1; // L: 3448
				} else if (var0 == 5350) { // L: 3450
					Interpreter.Interpreter_stringStackSize -= 2; // L: 3451
					--class44.Interpreter_intStackSize; // L: 3452
					return 1; // L: 3453
				} else if (var0 == 5351) { // L: 3455
					--Interpreter.Interpreter_stringStackSize; // L: 3456
					return 1; // L: 3457
				} else {
					return 2; // L: 3459
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3439
				if (var3 == 1 || var3 == 2) { // L: 3440
					ObjectComposition.clientPreferences.windowMode = var3; // L: 3441
					TileItem.savePreferences(); // L: 3442
				}

				return 1; // L: 3444
			}
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2605
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2608
		class265.method4848(); // L: 2610
		class135.method2601(); // L: 2611
		class24.method259(); // L: 2612
		NPCComposition.NpcDefinition_cached.clear(); // L: 2614
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 2615
		SceneTilePaint.method4259(); // L: 2617
		SecureRandomCallable.method2055(); // L: 2618
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2620
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2621
		HealthBarUpdate.method2197(); // L: 2623
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2625
		GrandExchangeOfferOwnWorldComparator.field634.method6433(); // L: 2627
		ViewportMouse.HitSplatDefinition_cachedSprites.method6433(); // L: 2628
		UserComparator6.method2485(); // L: 2629
		KeyHandler.method378(); // L: 2630
		StructComposition.StructDefinition_cached.clear(); // L: 2632
		FileSystem.method2548(); // L: 2634
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2636
		ChatChannel.method2015(); // L: 2638
		Widget.Widget_cachedSprites.clear(); // L: 2640
		Widget.Widget_cachedModels.clear(); // L: 2641
		Widget.Widget_cachedFonts.clear(); // L: 2642
		Widget.Widget_cachedSpriteMasks.clear(); // L: 2643
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2645
		Script.Script_cached.clear(); // L: 2646
		NetCache.archive0.clearFiles(); // L: 2647
		class27.archive1.clearFiles(); // L: 2648
		ClanChannel.archive3.clearFiles(); // L: 2649
		class32.archive4.clearFiles(); // L: 2650
		class247.archive5.clearFiles(); // L: 2651
		UrlRequest.archive6.clearFiles(); // L: 2652
		Decimator.archive7.clearFiles(); // L: 2653
		GrandExchangeOfferAgeComparator.archive8.clearFiles(); // L: 2654
		CollisionMap.archive9.clearFiles(); // L: 2655
		SoundCache.archive10.clearFiles(); // L: 2656
		WorldMapManager.archive11.clearFiles(); // L: 2657
		UserComparator5.archive12.clearFiles(); // L: 2658
		AbstractSocket.scene.clear(); // L: 2660

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2661
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2662
		class159.method3192(2); // L: 2663
		Client.currentTrackGroupId = -1; // L: 2664
		Client.field881 = false; // L: 2665
		WorldMapSprite.method3631(); // L: 2666
		class12.updateGameState(10); // L: 2667
	} // L: 2668

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Lcy;II)V",
		garbageValue = "-354829421"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1265 >= Client.cycle) { // L: 3611
			int var2 = Math.max(1, var0.field1265 - Client.cycle); // L: 3612
			int var3 = var0.field1239 * 64 + var0.field1278 * 128; // L: 3613
			int var4 = var0.field1239 * 64 + var0.field1280 * 128; // L: 3614
			var0.x += (var3 - var0.x) / var2; // L: 3615
			var0.y += (var4 - var0.y) / var2; // L: 3616
			var0.field1294 = 0; // L: 3617
			var0.orientation = var0.field1284; // L: 3618
		} else if (var0.field1283 >= Client.cycle) { // L: 3620
			class2.method21(var0);
		} else {
			InterfaceParent.method2083(var0); // L: 3621
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3622
			var0.sequence = -1; // L: 3623
			var0.spotAnimation = -1; // L: 3624
			var0.field1265 = 0; // L: 3625
			var0.field1283 = 0; // L: 3626
			var0.x = var0.field1239 * 64 + var0.pathX[0] * 128; // L: 3627
			var0.y = var0.pathY[0] * 128 + var0.field1239 * 64; // L: 3628
			var0.method2171(); // L: 3629
		}

		if (class93.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3631 3632
			var0.sequence = -1; // L: 3633
			var0.spotAnimation = -1; // L: 3634
			var0.field1265 = 0; // L: 3635
			var0.field1283 = 0; // L: 3636
			var0.x = var0.field1239 * 64 + var0.pathX[0] * 128; // L: 3637
			var0.y = var0.pathY[0] * 128 + var0.field1239 * 64; // L: 3638
			var0.method2171(); // L: 3639
		}

		Strings.method4850(var0); // L: 3642
		class44.method449(var0); // L: 3643
	} // L: 3644

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method68() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) { // L: 8823
			int var2 = Client.menuOpcodes[var0]; // L: 8825
			boolean var1 = var2 == 57 || var2 == 58 || var2 == 1007 || var2 == 25 || var2 == 30; // L: 8827
			if (var1) { // L: 8829
				if (var0 < Client.menuOptionsCount - 1) { // L: 8830
					for (int var3 = var0; var3 < Client.menuOptionsCount - 1; ++var3) { // L: 8831
						Client.menuActions[var3] = Client.menuActions[var3 + 1]; // L: 8832
						Client.menuTargets[var3] = Client.menuTargets[var3 + 1]; // L: 8833
						Client.menuOpcodes[var3] = Client.menuOpcodes[var3 + 1]; // L: 8834
						Client.menuIdentifiers[var3] = Client.menuIdentifiers[var3 + 1]; // L: 8835
						Client.menuArguments1[var3] = Client.menuArguments1[var3 + 1]; // L: 8836
						Client.menuArguments2[var3] = Client.menuArguments2[var3 + 1]; // L: 8837
						Client.menuShiftClick[var3] = Client.menuShiftClick[var3 + 1]; // L: 8838
					}
				}

				--var0; // L: 8841
				--Client.menuOptionsCount; // L: 8842
			}
		}

		class15.method196(); // L: 8845
	} // L: 8846
}
