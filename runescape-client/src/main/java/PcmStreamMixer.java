import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	NodeDeque subStreams;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	NodeDeque field1365;
	@ObfuscatedName("s")
	int field1366;
	@ObfuscatedName("t")
	int field1368;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque(); // L: 9
		this.field1365 = new NodeDeque(); // L: 10
		this.field1366 = 0; // L: 11
		this.field1368 = -1; // L: 12
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1); // L: 15
	} // L: 16

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove(); // L: 19
	} // L: 20

	@ObfuscatedName("s")
	void method2385() {
		if (this.field1366 > 0) { // L: 23
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1365.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1365.previous()) { // L: 24
				var1.field1476 -= this.field1366; // L: 25
			}

			this.field1368 -= this.field1366; // L: 27
			this.field1366 = 0; // L: 28
		}

	} // L: 30

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lgw;Ldi;)V"
	)
	void method2408(Node var1, PcmStreamMixerListener var2) {
		while (this.field1365.sentinel != var1 && ((PcmStreamMixerListener)var1).field1476 <= var2.field1476) { // L: 33
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1); // L: 34
		this.field1368 = ((PcmStreamMixerListener)this.field1365.sentinel.previous).field1476; // L: 35
	} // L: 36

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	void method2388(PcmStreamMixerListener var1) {
		var1.remove(); // L: 39
		var1.remove2(); // L: 40
		Node var2 = this.field1365.sentinel.previous; // L: 41
		if (var2 == this.field1365.sentinel) {
			this.field1368 = -1; // L: 42
		} else {
			this.field1368 = ((PcmStreamMixerListener)var2).field1476; // L: 43
		}

	} // L: 44

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Ldc;"
	)
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last(); // L: 47
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "()Ldc;"
	)
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous(); // L: 51
	}

	@ObfuscatedName("w")
	protected int vmethod3987() {
		return 0; // L: 55
	}

	@ObfuscatedName("g")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1368 < 0) { // L: 60
				this.updateSubStreams(var1, var2, var3); // L: 61
				return; // L: 62
			}

			if (var3 + this.field1366 < this.field1368) { // L: 64
				this.field1366 += var3; // L: 65
				this.updateSubStreams(var1, var2, var3); // L: 66
				return; // L: 67
			}

			int var4 = this.field1368 - this.field1366; // L: 69
			this.updateSubStreams(var1, var2, var4); // L: 70
			var2 += var4; // L: 71
			var3 -= var4; // L: 72
			this.field1366 += var4; // L: 73
			this.method2385(); // L: 74
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1365.last(); // L: 75
			synchronized(var5) { // L: 76
				int var7 = var5.update(); // L: 77
				if (var7 < 0) { // L: 78
					var5.field1476 = 0; // L: 79
					this.method2388(var5); // L: 80
				} else {
					var5.field1476 = var7; // L: 83
					this.method2408(var5.previous, var5); // L: 84
				}
			}
		} while(var3 != 0); // L: 87

	}

	@ObfuscatedName("m")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) { // L: 92
			var4.update(var1, var2, var3); // L: 93
		}

	} // L: 95

	@ObfuscatedName("n")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1368 < 0) { // L: 99
				this.skipSubStreams(var1); // L: 100
				return; // L: 101
			}

			if (this.field1366 + var1 < this.field1368) { // L: 103
				this.field1366 += var1; // L: 104
				this.skipSubStreams(var1); // L: 105
				return; // L: 106
			}

			int var2 = this.field1368 - this.field1366; // L: 108
			this.skipSubStreams(var2); // L: 109
			var1 -= var2; // L: 110
			this.field1366 += var2; // L: 111
			this.method2385(); // L: 112
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1365.last(); // L: 113
			synchronized(var3) { // L: 114
				int var5 = var3.update(); // L: 115
				if (var5 < 0) { // L: 116
					var3.field1476 = 0; // L: 117
					this.method2388(var3); // L: 118
				} else {
					var3.field1476 = var5; // L: 121
					this.method2408(var3.previous, var3); // L: 122
				}
			}
		} while(var1 != 0); // L: 125

	}

	@ObfuscatedName("d")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) { // L: 130
			var2.skip(var1); // L: 131
		}

	} // L: 133
}
