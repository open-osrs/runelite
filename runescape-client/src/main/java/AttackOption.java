import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	field1234(2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	field1237(4);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1805660011
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "2066190349"
	)
	public static VarbitComposition method2263(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;B)V",
		garbageValue = "1"
	)
	public static void method2262(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		HealthBarDefinition.HitSplatDefinition_spritesArchive = var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "1817512128"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class386.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1106"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		HealthBarDefinition.method2977();
		PlayerComposition.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		CollisionMap.method3417(2);
		Client.currentTrackGroupId = -1;
		Client.field663 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		UserList.updateGameState(10);
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Ljt;Lfa;IIZI)V",
		garbageValue = "-487179567"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			StructComposition.insertMenuItem(var7, FloorUnderlayDefinition.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}
