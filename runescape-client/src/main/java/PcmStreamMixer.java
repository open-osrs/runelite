import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	NodeDeque field156;
	@ObfuscatedName("v")
	int field155;
	@ObfuscatedName("j")
	int field157;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field156 = new NodeDeque();
		this.field155 = 0;
		this.field157 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Laq;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Laq;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("v")
	void method374() {
		if (this.field155 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field156.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field156.previous()) {
				var1.field298 -= this.field155;
			}

			this.field157 -= this.field155;
			this.field155 = 0;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lml;Lav;)V"
	)
	void method373(Node var1, PcmStreamMixerListener var2) {
		while (this.field156.sentinel != var1 && ((PcmStreamMixerListener)var1).field298 <= var2.field298) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field157 = ((PcmStreamMixerListener)this.field156.sentinel.previous).field298;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lav;)V"
	)
	void method376(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field156.sentinel.previous;
		if (var2 == this.field156.sentinel) {
			this.field157 = -1;
		} else {
			this.field157 = ((PcmStreamMixerListener)var2).field298;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("f")
	protected int vmethod4662() {
		return 0;
	}

	@ObfuscatedName("o")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field157 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field155 < this.field157) {
				this.field155 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field157 - this.field155;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field155 += var4;
			this.method374();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field156.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field298 = 0;
					this.method376(var5);
				} else {
					var5.field298 = var7;
					this.method373(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("x")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("r")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field157 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field155 + var1 < this.field157) {
				this.field155 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field157 - this.field155;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field155 += var2;
			this.method374();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field156.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field298 = 0;
					this.method376(var3);
				} else {
					var3.field298 = var5;
					this.method373(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("p")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
