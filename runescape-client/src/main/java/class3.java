import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class3 extends Node {
	@ObfuscatedName("f")
	boolean field32;
	@ObfuscatedName("o")
	boolean field28;
	@ObfuscatedName("u")
	public List field27;
	@ObfuscatedName("p")
	int[] field26;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -1941040478688565745L
	)
	long field29;
	@ObfuscatedName("e")
	public String field25;
	@ObfuscatedName("k")
	public byte field31;
	@ObfuscatedName("g")
	public byte field30;

	static {
		new BitSet(65536); // L: 21
	} // L: 22

	@ObfuscatedSignature(
		descriptor = "(Lnu;)V"
	)
	public class3(Buffer var1) {
		this.field28 = true; // L: 12
		this.field25 = null; // L: 16
		this.method48(var1); // L: 25
	} // L: 26

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "28"
	)
	public int[] method44() {
		if (this.field26 == null) { // L: 29
			String[] var1 = new String[this.field27.size()]; // L: 30
			this.field26 = new int[this.field27.size()]; // L: 31

			for (int var2 = 0; var2 < this.field27.size(); this.field26[var2] = var2++) { // L: 32 34
				var1[var2] = ((class9)this.field27.get(var2)).field65; // L: 33
			}

			int[] var3 = this.field26; // L: 36
			GrandExchangeOffer.method4633(var1, var3, 0, var1.length - 1); // L: 38
		}

		return this.field26; // L: 41
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ln;I)V",
		garbageValue = "-1218707002"
	)
	void method61(class9 var1) {
		this.field27.add(var1);
		this.field26 = null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "525783356"
	)
	void method45(int var1) {
		this.field27.remove(var1);
		this.field26 = null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "77686460"
	)
	public int method46() {
		return this.field27.size();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-59"
	)
	public int method43(String var1) {
		if (!this.field28) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.field27.size(); ++var2) { // L: 60
				if (((class9)this.field27.get(var2)).field65.equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "1242419258"
	)
	void method48(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field32 = true;
		}

		if ((var2 & 2) != 0) { // L: 69
			this.field28 = true;
		}

		int var3 = 2; // L: 70
		if ((var2 & 4) != 0) { // L: 71
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 72
		this.field29 = var1.readLong(); // L: 73
		this.field25 = var1.readStringCp1252NullTerminated(); // L: 74
		var1.readBoolean(); // L: 75
		this.field30 = var1.readByte(); // L: 76
		this.field31 = var1.readByte(); // L: 77
		int var4 = var1.readUnsignedShort(); // L: 78
		if (var4 > 0) { // L: 79
			this.field27 = new ArrayList(var4); // L: 80

			for (int var5 = 0; var5 < var4; ++var5) { // L: 81
				class9 var6 = new class9(); // L: 82
				if (this.field32) { // L: 83
					var1.readLong(); // L: 84
				}

				if (this.field28) { // L: 86
					var6.field65 = var1.readStringCp1252NullTerminated();
				}

				var6.field66 = var1.readByte(); // L: 87
				var6.field64 = var1.readUnsignedShort(); // L: 88
				if (var3 >= 3) { // L: 89
					var1.readBoolean(); // L: 90
				}

				this.field27.add(var5, var6); // L: 93
			}
		}

	} // L: 96

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ldt;III)Lbh;",
		garbageValue = "484099041"
	)
	public static final PcmPlayer method57(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field394 == 0) { // L: 45
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 46
			if (var2 < 256) { // L: 47
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class301.pcmPlayerProvider.player(); // L: 49
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 50
				var3.field395 = var2; // L: 51
				var3.init(); // L: 52
				var3.capacity = (var2 & -1024) + 1024; // L: 53
				if (var3.capacity > 16384) { // L: 54
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 55
				if (Frames.field2007 > 0 && class0.soundSystem == null) { // L: 56
					class0.soundSystem = new SoundSystem(); // L: 57
					class34.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 58
					class34.soundSystemExecutor.scheduleAtFixedRate(class0.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 59
				}

				if (class0.soundSystem != null) { // L: 61
					if (class0.soundSystem.players[var1] != null) { // L: 62
						throw new IllegalArgumentException();
					}

					class0.soundSystem.players[var1] = var3; // L: 63
				}

				return var3; // L: 65
			} catch (Throwable var4) { // L: 67
				return new PcmPlayer(); // L: 68
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2105009881"
	)
	static boolean method63() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1258
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1259
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1260
				if (!var0.isLoaded()) {
					return false; // L: 1261
				}

				++Client.archiveLoadersDone; // L: 1262
			}

			return true; // L: 1264
		} else {
			return true; // L: 1263
		}
	}
}
