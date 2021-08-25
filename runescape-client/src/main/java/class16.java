import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class16 implements ThreadFactory {
	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	public static class300 field82;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static StudioGame field83;
	@ObfuscatedName("ff")
	static String field84;
	@ObfuscatedName("he")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("n")
	final ThreadGroup field86;
	@ObfuscatedName("c")
	final AtomicInteger field81;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field81 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field86 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field86, var1, this.this$0.field67 + "-rest-request-" + this.field81.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-4"
	)
	public static void method218(int var0) {
		class247.musicPlayerStatus = 1;
		class247.musicTrackArchive = null;
		class247.musicTrackGroupId = -1;
		GrandExchangeOfferOwnWorldComparator.musicTrackFileId = -1;
		class196.musicTrackVolume = 0;
		class20.musicTrackBoolean = false;
		class130.pcmSampleLength = var0;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-601461056"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class114.method2481();
		CollisionMap.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		method218(2);
		Client.currentTrackGroupId = -1;
		Client.field728 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				MusicPatchPcmStream.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				MusicPatchPcmStream.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		HealthBarUpdate.updateGameState(10);
	}
}
