import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	NodeDeque field242;
	@ObfuscatedName("m")
	int field243;
	@ObfuscatedName("k")
	int field244;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field242 = new NodeDeque();
		this.field243 = 0;
		this.field244 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lap;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lap;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("m")
	void method643() {
		if (this.field243 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field242.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field242.previous()) {
				var1.field381 -= this.field243;
			}

			this.field244 -= this.field243;
			this.field243 = 0;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Laz;)V"
	)
	void method615(Node var1, PcmStreamMixerListener var2) {
		while (this.field242.sentinel != var1 && ((PcmStreamMixerListener)var1).field381 <= var2.field381) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field244 = ((PcmStreamMixerListener)this.field242.sentinel.previous).field381;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Laz;)V"
	)
	void method631(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field242.sentinel.previous;
		if (var2 == this.field242.sentinel) {
			this.field244 = -1;
		} else {
			this.field244 = ((PcmStreamMixerListener)var2).field381;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("a")
	protected int vmethod4836() {
		return 0;
	}

	@ObfuscatedName("u")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field244 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field243 < this.field244) {
				this.field243 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field244 - this.field243;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field243 += var4;
			this.method643();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field242.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field381 = 0;
					this.method631(var5);
				} else {
					var5.field381 = var7;
					this.method615(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("e")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("l")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field244 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field243 + var1 < this.field244) {
				this.field243 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field244 - this.field243;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field243 += var2;
			this.method643();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field242.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field381 = 0;
					this.method631(var3);
				} else {
					var3.field381 = var5;
					this.method615(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("y")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
