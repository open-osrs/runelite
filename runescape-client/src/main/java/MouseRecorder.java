import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("m")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("o")
	@Export("lock")
	Object lock;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1800286553
	)
	@Export("index")
	int index;
	@ObfuscatedName("j")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("p")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("g")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		while (this.isRunning) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}

			SpriteMask.sleepExact(49L);
			SpriteMask.sleepExact(1L);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(DDII)[D",
		garbageValue = "-2077426308"
	)
	public static double[] method1248(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2;
			double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var11 = var13 / var2;
			var6[var8] = var11;
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "([BIII)Ljava/lang/String;",
		garbageValue = "-2086998807"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class297.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-150787474"
	)
	public static void method1251() {
		ItemDefinition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1161280240"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		Entity.method3387();
		ObjectDefinition.ObjectDefinition_cached.clear();
		ObjectDefinition.ObjectDefinition_cachedModelData.clear();
		ObjectDefinition.ObjectDefinition_cachedEntities.clear();
		ObjectDefinition.ObjectDefinition_cachedModels.clear();
		NPCDefinition.NpcDefinition_cached.clear();
		NPCDefinition.NpcDefinition_cachedModels.clear();
		ItemDefinition.ItemDefinition_cached.clear();
		ItemDefinition.ItemDefinition_cachedModels.clear();
		ItemDefinition.ItemDefinition_cachedSprites.clear();
		AttackOption.method2181();
		class60.method972();
		KitDefinition.method4624();
		HealthBar.method2133();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		AbstractWorldMapData.method343();
		StructDefinition.StructDefinition_cached.clear();
		ParamDefinition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		ObjectSound.method2007();
		ObjectSound.method2008();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		MilliClock.archive0.clearFiles();
		Message.archive1.clearFiles();
		class105.archive3.clearFiles();
		GrandExchangeOffer.archive4.clearFiles();
		WorldMapRectangle.archive5.clearFiles();
		UserComparator7.archive6.clearFiles();
		Projectile.archive7.clearFiles();
		GrandExchangeEvent.archive8.clearFiles();
		Tile.archive9.clearFiles();
		GraphicsObject.archive10.clearFiles();
		WorldMapData_0.archive11.clearFiles();
		Message.archive12.clearFiles();
		UserComparator3.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		class206.field2439 = 1;
		Huffman.musicTrackArchive = null;
		class206.musicTrackGroupId = -1;
		MilliClock.musicTrackFileId = -1;
		class206.musicTrackVolume = 0;
		class336.musicTrackBoolean = false;
		class206.field2442 = 2;
		Client.currentTrackGroupId = -1;
		Client.field743 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				class60.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				class60.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		ClientPreferences.updateGameState(10);
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "-126"
	)
	@Export("playSoundJingle")
	static void playSoundJingle(int var0, int var1) {
		if (Client.musicVolume != 0 && var0 != -1) {
			UserComparator9.method3513(WorldMapData_0.archive11, var0, 0, Client.musicVolume, false);
			Client.field743 = true;
		}

	}
}
