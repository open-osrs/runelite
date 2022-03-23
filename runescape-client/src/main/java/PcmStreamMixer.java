import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	NodeDeque field254;
	@ObfuscatedName("h")
	int field255;
	@ObfuscatedName("g")
	int field256;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque(); // L: 9
		this.field254 = new NodeDeque(); // L: 10
		this.field255 = 0; // L: 11
		this.field256 = -1; // L: 12
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lal;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1); // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lal;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove(); // L: 19
	} // L: 20

	@ObfuscatedName("h")
	void method641() {
		if (this.field255 > 0) { // L: 23
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field254.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field254.previous()) { // L: 24
				var1.field398 -= this.field255; // L: 25
			}

			this.field256 -= this.field255; // L: 27
			this.field255 = 0; // L: 28
		}

	} // L: 30

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Loz;Lai;)V"
	)
	void method642(Node var1, PcmStreamMixerListener var2) {
		while (this.field254.sentinel != var1 && ((PcmStreamMixerListener)var1).field398 <= var2.field398) { // L: 33
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1); // L: 34
		this.field256 = ((PcmStreamMixerListener)this.field254.sentinel.previous).field398; // L: 35
	} // L: 36

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	void method643(PcmStreamMixerListener var1) {
		var1.remove(); // L: 39
		var1.remove2(); // L: 40
		Node var2 = this.field254.sentinel.previous; // L: 41
		if (var2 == this.field254.sentinel) {
			this.field256 = -1; // L: 42
		} else {
			this.field256 = ((PcmStreamMixerListener)var2).field398; // L: 43
		}

	} // L: 44

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last(); // L: 47
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous(); // L: 51
	}

	@ObfuscatedName("f")
	protected int vmethod5476() {
		return 0; // L: 55
	}

	@ObfuscatedName("u")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field256 < 0) { // L: 60
				this.updateSubStreams(var1, var2, var3); // L: 61
				return; // L: 62
			}

			if (var3 + this.field255 < this.field256) { // L: 64
				this.field255 += var3; // L: 65
				this.updateSubStreams(var1, var2, var3); // L: 66
				return; // L: 67
			}

			int var4 = this.field256 - this.field255; // L: 69
			this.updateSubStreams(var1, var2, var4); // L: 70
			var2 += var4; // L: 71
			var3 -= var4; // L: 72
			this.field255 += var4; // L: 73
			this.method641(); // L: 74
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field254.last(); // L: 75
			synchronized(var5) { // L: 76
				int var7 = var5.update(); // L: 77
				if (var7 < 0) { // L: 78
					var5.field398 = 0; // L: 79
					this.method643(var5); // L: 80
				} else {
					var5.field398 = var7; // L: 83
					this.method642(var5.previous, var5); // L: 84
				}
			}
		} while(var3 != 0); // L: 87

	}

	@ObfuscatedName("r")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) { // L: 92
			var4.update(var1, var2, var3); // L: 93
		}

	} // L: 95

	@ObfuscatedName("k")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field256 < 0) { // L: 99
				this.skipSubStreams(var1); // L: 100
				return; // L: 101
			}

			if (this.field255 + var1 < this.field256) { // L: 103
				this.field255 += var1; // L: 104
				this.skipSubStreams(var1); // L: 105
				return; // L: 106
			}

			int var2 = this.field256 - this.field255; // L: 108
			this.skipSubStreams(var2); // L: 109
			var1 -= var2; // L: 110
			this.field255 += var2; // L: 111
			this.method641(); // L: 112
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field254.last(); // L: 113
			synchronized(var3) { // L: 114
				int var5 = var3.update(); // L: 115
				if (var5 < 0) { // L: 116
					var3.field398 = 0; // L: 117
					this.method643(var3); // L: 118
				} else {
					var3.field398 = var5; // L: 121
					this.method642(var3.previous, var3); // L: 122
				}
			}
		} while(var1 != 0); // L: 125

	}

	@ObfuscatedName("x")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) { // L: 130
			var2.skip(var1); // L: 131
		}

	} // L: 133
}
