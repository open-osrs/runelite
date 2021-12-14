import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	NodeDeque field256;
	@ObfuscatedName("p")
	int field257;
	@ObfuscatedName("m")
	int field255;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field256 = new NodeDeque();
		this.field257 = 0;
		this.field255 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("p")
	void method691() {
		if (this.field257 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field256.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field256.previous()) {
				var1.field393 -= this.field257;
			}

			this.field255 -= this.field257;
			this.field257 = 0;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lnw;Lad;)V"
	)
	void method670(Node var1, PcmStreamMixerListener var2) {
		while (this.field256.sentinel != var1 && ((PcmStreamMixerListener)var1).field393 <= var2.field393) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field255 = ((PcmStreamMixerListener)this.field256.sentinel.previous).field393;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lad;)V"
	)
	void method671(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field256.sentinel.previous;
		if (var2 == this.field256.sentinel) {
			this.field255 = -1;
		} else {
			this.field255 = ((PcmStreamMixerListener)var2).field393;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("w")
	protected int vmethod5260() {
		return 0;
	}

	@ObfuscatedName("n")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field255 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field257 < this.field255) {
				this.field257 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field255 - this.field257;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field257 += var4;
			this.method691();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field256.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field393 = 0;
					this.method671(var5);
				} else {
					var5.field393 = var7;
					this.method670(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("r")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("o")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field255 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field257 + var1 < this.field255) {
				this.field257 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field255 - this.field257;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field257 += var2;
			this.method691();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field256.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field393 = 0;
					this.method671(var3);
				} else {
					var3.field393 = var5;
					this.method670(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("v")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
