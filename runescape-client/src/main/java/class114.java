import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class114 extends class116 {
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 2134701041
	)
	static int field1376;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -935127469
	)
	static int field1372;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -4881453485156331309L
	)
	long field1371;
	@ObfuscatedName("c")
	String field1370;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class114(class119 var1) {
		this.this$0 = var1;
		this.field1371 = -1L;
		this.field1370 = null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1371 = var1.readLong();
		}

		this.field1370 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2559(this.field1371, this.field1370, 0);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lei;III)Lab;",
		garbageValue = "-1383117497"
	)
	public static final PcmPlayer method2487(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class91.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field274 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (PcmPlayer.field268 > 0 && class258.soundSystem == null) {
					class258.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class258.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class258.soundSystem != null) {
					if (class258.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class258.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "859699173"
	)
	static final void method2481() {
		PacketBufferNode.method4564();
		GrandExchangeOfferOwnWorldComparator.method1133();
		KitDefinition.KitDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		EnumComposition.method2940();
		Client.method1330();
		class20.method310();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		ServerPacket.method4567();
		VarpDefinition.VarpDefinition_cached.clear();
		WorldMapLabelSize.field2011.method6674();
		class125.HitSplatDefinition_cachedSprites.method6674();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		StructComposition.StructDefinition_cached.clear();
		ParamComposition.ParamDefinition_cached.clear();
		class20.method314();
		AbstractWorldMapIcon.method3871();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		WorldMapRectangle.archive0.clearFiles();
		MenuAction.archive1.clearFiles();
		class260.archive3.clearFiles();
		ReflectionCheck.archive4.clearFiles();
		ObjectComposition.archive5.clearFiles();
		class276.archive6.clearFiles();
		class135.archive7.clearFiles();
		World.archive8.clearFiles();
		VarcInt.archive9.clearFiles();
		MouseRecorder.archive10.clearFiles();
		class318.archive11.clearFiles();
		SecureRandomCallable.archive12.clearFiles();
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lco;ZI)V",
		garbageValue = "-662067493"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = ClanSettings.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = GraphicsObject.getTileHeight(var0.x, var0.y, class391.Client_plane);
					var0.playerCycle = Client.cycle;
					CollisionMap.scene.addNullableObject(class391.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = GraphicsObject.getTileHeight(var0.x, var0.y, class391.Client_plane);
					var0.playerCycle = Client.cycle;
					CollisionMap.scene.drawEntity(class391.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}
}
