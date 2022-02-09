import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	NodeDeque field262;
	@ObfuscatedName("s")
	int field264;
	@ObfuscatedName("e")
	int field265;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque(); // L: 9
		this.field262 = new NodeDeque(); // L: 10
		this.field264 = 0; // L: 11
		this.field265 = -1; // L: 12
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lan;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1); // L: 15
	} // L: 16

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lan;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove(); // L: 19
	} // L: 20

	@ObfuscatedName("s")
	void method635() {
		if (this.field264 > 0) { // L: 23
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field262.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field262.previous()) { // L: 24
				var1.field407 -= this.field264; // L: 25
			}

			this.field265 -= this.field264; // L: 27
			this.field264 = 0; // L: 28
		}

	} // L: 30

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Loe;Lam;)V"
	)
	void method637(Node var1, PcmStreamMixerListener var2) {
		while (this.field262.sentinel != var1 && ((PcmStreamMixerListener)var1).field407 <= var2.field407) { // L: 33
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1); // L: 34
		this.field265 = ((PcmStreamMixerListener)this.field262.sentinel.previous).field407; // L: 35
	} // L: 36

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lam;)V"
	)
	void method632(PcmStreamMixerListener var1) {
		var1.remove(); // L: 39
		var1.remove2(); // L: 40
		Node var2 = this.field262.sentinel.previous; // L: 41
		if (var2 == this.field262.sentinel) {
			this.field265 = -1; // L: 42
		} else {
			this.field265 = ((PcmStreamMixerListener)var2).field407; // L: 43
		}

	} // L: 44

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last(); // L: 47
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous(); // L: 51
	}

	@ObfuscatedName("w")
	protected int vmethod5241() {
		return 0; // L: 55
	}

	@ObfuscatedName("v")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field265 < 0) { // L: 60
				this.updateSubStreams(var1, var2, var3); // L: 61
				return; // L: 62
			}

			if (var3 + this.field264 < this.field265) { // L: 64
				this.field264 += var3; // L: 65
				this.updateSubStreams(var1, var2, var3); // L: 66
				return; // L: 67
			}

			int var4 = this.field265 - this.field264; // L: 69
			this.updateSubStreams(var1, var2, var4); // L: 70
			var2 += var4; // L: 71
			var3 -= var4; // L: 72
			this.field264 += var4; // L: 73
			this.method635(); // L: 74
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field262.last(); // L: 75
			synchronized(var5) { // L: 76
				int var7 = var5.update(); // L: 77
				if (var7 < 0) { // L: 78
					var5.field407 = 0; // L: 79
					this.method632(var5); // L: 80
				} else {
					var5.field407 = var7; // L: 83
					this.method637(var5.previous, var5); // L: 84
				}
			}
		} while(var3 != 0); // L: 87

	}

	@ObfuscatedName("a")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) { // L: 92
			var4.update(var1, var2, var3); // L: 93
		}

	} // L: 95

	@ObfuscatedName("y")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field265 < 0) { // L: 99
				this.skipSubStreams(var1); // L: 100
				return; // L: 101
			}

			if (this.field264 + var1 < this.field265) { // L: 103
				this.field264 += var1; // L: 104
				this.skipSubStreams(var1); // L: 105
				return; // L: 106
			}

			int var2 = this.field265 - this.field264; // L: 108
			this.skipSubStreams(var2); // L: 109
			var1 -= var2; // L: 110
			this.field264 += var2; // L: 111
			this.method635(); // L: 112
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field262.last(); // L: 113
			synchronized(var3) { // L: 114
				int var5 = var3.update(); // L: 115
				if (var5 < 0) { // L: 116
					var3.field407 = 0; // L: 117
					this.method632(var3); // L: 118
				} else {
					var3.field407 = var5; // L: 121
					this.method637(var3.previous, var3); // L: 122
				}
			}
		} while(var1 != 0); // L: 125

	}

	@ObfuscatedName("u")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) { // L: 130
			var2.skip(var1); // L: 131
		}

	} // L: 133
}
