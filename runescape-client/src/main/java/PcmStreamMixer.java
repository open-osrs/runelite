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
		this.subStreams = new NodeDeque(); // L: 9
		this.field1357 = new NodeDeque(); // L: 10
		this.field1356 = 0; // L: 11
		this.field1359 = -1; // L: 12
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1); // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove(); // L: 19
	} // L: 20

	@ObfuscatedName("x")
	void method2354() {
		if (this.field1356 > 0) { // L: 23
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1357.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1357.previous()) { // L: 24
				var1.field1464 -= this.field1356; // L: 25
			}

			this.field1359 -= this.field1356; // L: 27
			this.field1356 = 0; // L: 28
		}

	} // L: 30

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Ldd;)V"
	)
	void method2355(Node var1, PcmStreamMixerListener var2) {
		while (this.field1357.sentinel != var1 && ((PcmStreamMixerListener)var1).field1464 <= var2.field1464) { // L: 33
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1); // L: 34
		this.field1359 = ((PcmStreamMixerListener)this.field1357.sentinel.previous).field1464; // L: 35
	} // L: 36

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldd;)V"
	)
	void method2351(PcmStreamMixerListener var1) {
		var1.remove(); // L: 39
		var1.remove2(); // L: 40
		Node var2 = this.field1357.sentinel.previous; // L: 41
		if (var2 == this.field1357.sentinel) {
			this.field1359 = -1; // L: 42
		} else {
			this.field1359 = ((PcmStreamMixerListener)var2).field1464; // L: 43
		}

	} // L: 44

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last(); // L: 47
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous(); // L: 51
	}

	@ObfuscatedName("p")
	protected int vmethod3927() {
		return 0; // L: 55
	}

	@ObfuscatedName("l")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1359 < 0) { // L: 60
				this.updateSubStreams(var1, var2, var3); // L: 61
				return; // L: 62
			}

			if (var3 + this.field1356 < this.field1359) { // L: 64
				this.field1356 += var3; // L: 65
				this.updateSubStreams(var1, var2, var3); // L: 66
				return; // L: 67
			}

			int var4 = this.field1359 - this.field1356; // L: 69
			this.updateSubStreams(var1, var2, var4); // L: 70
			var2 += var4; // L: 71
			var3 -= var4; // L: 72
			this.field1356 += var4; // L: 73
			this.method2354(); // L: 74
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1357.last(); // L: 75
			synchronized(var5) { // L: 76
				int var7 = var5.update(); // L: 77
				if (var7 < 0) { // L: 78
					var5.field1464 = 0; // L: 79
					this.method2351(var5); // L: 80
				} else {
					var5.field1464 = var7; // L: 83
					this.method2355(var5.previous, var5); // L: 84
				}
			}
		} while(var3 != 0); // L: 87

	}

	@ObfuscatedName("z")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) { // L: 92
			var4.update(var1, var2, var3); // L: 93
		}

	} // L: 95

	@ObfuscatedName("u")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1359 < 0) { // L: 99
				this.skipSubStreams(var1); // L: 100
				return; // L: 101
			}

			if (this.field1356 + var1 < this.field1359) { // L: 103
				this.field1356 += var1; // L: 104
				this.skipSubStreams(var1); // L: 105
				return; // L: 106
			}

			int var2 = this.field1359 - this.field1356; // L: 108
			this.skipSubStreams(var2); // L: 109
			var1 -= var2; // L: 110
			this.field1356 += var2; // L: 111
			this.method2354(); // L: 112
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1357.last(); // L: 113
			synchronized(var3) { // L: 114
				int var5 = var3.update(); // L: 115
				if (var5 < 0) { // L: 116
					var3.field1464 = 0; // L: 117
					this.method2351(var3); // L: 118
				} else {
					var3.field1464 = var5; // L: 121
					this.method2355(var3.previous, var3); // L: 122
				}
			}
		} while(var1 != 0); // L: 125

	}

	@ObfuscatedName("e")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) { // L: 130
			var2.skip(var1); // L: 131
		}

	} // L: 133
}
