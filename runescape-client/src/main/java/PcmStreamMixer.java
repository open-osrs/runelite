import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	NodeDeque field238;
	@ObfuscatedName("f")
	int field239;
	@ObfuscatedName("j")
	int field240;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field238 = new NodeDeque();
		this.field239 = 0;
		this.field240 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lav;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lav;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("f")
	void method619() {
		if (this.field239 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field238.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field238.previous()) {
				var1.field382 -= this.field239;
			}

			this.field240 -= this.field239;
			this.field239 = 0;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Laz;)V"
	)
	void method645(Node var1, PcmStreamMixerListener var2) {
		while (this.field238.sentinel != var1 && ((PcmStreamMixerListener)var1).field382 <= var2.field382) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field240 = ((PcmStreamMixerListener)this.field238.sentinel.previous).field382;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Laz;)V"
	)
	void method621(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field238.sentinel.previous;
		if (var2 == this.field238.sentinel) {
			this.field240 = -1;
		} else {
			this.field240 = ((PcmStreamMixerListener)var2).field382;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("a")
	protected int vmethod4889() {
		return 0;
	}

	@ObfuscatedName("e")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field240 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field239 < this.field240) {
				this.field239 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field240 - this.field239;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field239 += var4;
			this.method619();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field238.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field382 = 0;
					this.method621(var5);
				} else {
					var5.field382 = var7;
					this.method645(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("i")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("y")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field240 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field239 + var1 < this.field240) {
				this.field239 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field240 - this.field239;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field239 += var2;
			this.method619();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field238.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field382 = 0;
					this.method621(var3);
				} else {
					var3.field382 = var5;
					this.method645(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("w")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
