import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ljp;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljp;"
	)
	NodeDeque field1373;
	@ObfuscatedName("q")
	int field1371;
	@ObfuscatedName("j")
	int field1374;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1373 = new NodeDeque();
		this.field1371 = 0;
		this.field1374 = -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ldf;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ldf;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("q")
	void method2434() {
		if (this.field1371 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1373.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1373.previous()) {
				var1.field1476 -= this.field1371;
			}

			this.field1374 -= this.field1371;
			this.field1371 = 0;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Lgr;Ldb;)V"
	)
	void method2423(Node var1, PcmStreamMixerListener var2) {
		while (this.field1373.sentinel != var1 && ((PcmStreamMixerListener)var1).field1476 <= var2.field1476) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1374 = ((PcmStreamMixerListener)this.field1373.sentinel.previous).field1476;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ldb;)V"
	)
	void method2424(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field1373.sentinel.previous;
		if (var2 == this.field1373.sentinel) {
			this.field1374 = -1;
		} else {
			this.field1374 = ((PcmStreamMixerListener)var2).field1476;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "()Ldf;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "()Ldf;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("u")
	protected int vmethod4037() {
		return 0;
	}

	@ObfuscatedName("a")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1374 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1371 < this.field1374) {
				this.field1371 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1374 - this.field1371;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1371 += var4;
			this.method2434();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1373.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1476 = 0;
					this.method2424(var5);
				} else {
					var5.field1476 = var7;
					this.method2423(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("z")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("w")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1374 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1371 + var1 < this.field1374) {
				this.field1371 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1374 - this.field1371;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1371 += var2;
			this.method2434();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1373.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1476 = 0;
					this.method2424(var3);
				} else {
					var3.field1476 = var5;
					this.method2423(var3.previous, var3);
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
