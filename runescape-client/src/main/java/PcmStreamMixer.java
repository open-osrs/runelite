import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	NodeDeque field1357;
	@ObfuscatedName("x")
	int field1356;
	@ObfuscatedName("t")
	int field1359;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1357 = new NodeDeque();
		this.field1356 = 0;
		this.field1359 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("x")
	void method2354() {
		if (this.field1356 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1357.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1357.previous()) {
				var1.field1464 -= this.field1356;
			}

			this.field1359 -= this.field1356;
			this.field1356 = 0;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Ldd;)V"
	)
	void method2355(Node var1, PcmStreamMixerListener var2) {
		while (this.field1357.sentinel != var1 && ((PcmStreamMixerListener)var1).field1464 <= var2.field1464) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1359 = ((PcmStreamMixerListener)this.field1357.sentinel.previous).field1464;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldd;)V"
	)
	void method2351(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field1357.sentinel.previous;
		if (var2 == this.field1357.sentinel) {
			this.field1359 = -1;
		} else {
			this.field1359 = ((PcmStreamMixerListener)var2).field1464;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("p")
	protected int vmethod3927() {
		return 0;
	}

	@ObfuscatedName("l")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1359 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1356 < this.field1359) {
				this.field1356 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1359 - this.field1356;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1356 += var4;
			this.method2354();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1357.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1464 = 0;
					this.method2351(var5);
				} else {
					var5.field1464 = var7;
					this.method2355(var5.previous, var5);
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

	@ObfuscatedName("u")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1359 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1356 + var1 < this.field1359) {
				this.field1356 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1359 - this.field1356;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1356 += var2;
			this.method2354();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1357.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1464 = 0;
					this.method2351(var3);
				} else {
					var3.field1464 = var5;
					this.method2355(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("e")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
