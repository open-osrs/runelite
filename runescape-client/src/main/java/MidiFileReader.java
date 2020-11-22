import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("MidiFileReader")
public class MidiFileReader {
	@ObfuscatedName("t")
	static final byte[] field2493;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("b")
	@Export("division")
	int division;
	@ObfuscatedName("l")
	@Export("trackStarts")
	int[] trackStarts;
	@ObfuscatedName("m")
	@Export("trackPositions")
	int[] trackPositions;
	@ObfuscatedName("z")
	@Export("trackLengths")
	int[] trackLengths;
	@ObfuscatedName("q")
	int[] field2492;
	@ObfuscatedName("k")
	int field2489;
	@ObfuscatedName("u")
	long field2495;

	static {
		field2493 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // L: 17
	}

	MidiFileReader(byte[] var1) {
		this.buffer = new Buffer((byte[])null);
		this.parse(var1); // L: 26
	} // L: 27

	MidiFileReader() {
		this.buffer = new Buffer((byte[])null); // L: 8
	} // L: 23

	@ObfuscatedName("f")
	@Export("parse")
	void parse(byte[] var1) {
		this.buffer.array = var1; // L: 30
		this.buffer.offset = 10; // L: 33
		int var2 = this.buffer.readUnsignedShort(); // L: 34
		this.division = this.buffer.readUnsignedShort(); // L: 36
		this.field2489 = 500000; // L: 37
		this.trackStarts = new int[var2]; // L: 38

		Buffer var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.offset += var5) { // L: 39
			int var4 = this.buffer.readInt(); // L: 40
			var5 = this.buffer.readInt(); // L: 41
			if (var4 == 1297379947) { // L: 42
				this.trackStarts[var3] = this.buffer.offset; // L: 43
				++var3; // L: 44
			}

			var10000 = this.buffer; // L: 46
		}

		this.field2495 = 0L; // L: 48
		this.trackPositions = new int[var2]; // L: 49

		for (var3 = 0; var3 < var2; ++var3) { // L: 50
			this.trackPositions[var3] = this.trackStarts[var3];
		}

		this.trackLengths = new int[var2]; // L: 51
		this.field2492 = new int[var2]; // L: 52
	} // L: 53

	@ObfuscatedName("b")
	@Export("clear")
	void clear() {
		this.buffer.array = null; // L: 56
		this.trackStarts = null; // L: 57
		this.trackPositions = null; // L: 58
		this.trackLengths = null; // L: 59
		this.field2492 = null; // L: 60
	} // L: 61

	@ObfuscatedName("l")
	@Export("isReady")
	boolean isReady() {
		return this.buffer.array != null; // L: 64
	}

	@ObfuscatedName("m")
	@Export("trackCount")
	int trackCount() {
		return this.trackPositions.length; // L: 68
	}

	@ObfuscatedName("z")
	@Export("gotoTrack")
	void gotoTrack(int var1) {
		this.buffer.offset = this.trackPositions[var1]; // L: 72
	} // L: 73

	@ObfuscatedName("q")
	@Export("markTrackPosition")
	void markTrackPosition(int var1) {
		this.trackPositions[var1] = this.buffer.offset; // L: 76
	} // L: 77

	@ObfuscatedName("k")
	@Export("setTrackDone")
	void setTrackDone() {
		this.buffer.offset = -1; // L: 80
	} // L: 81

	@ObfuscatedName("c")
	@Export("readTrackLength")
	void readTrackLength(int var1) {
		int var2 = this.buffer.readVarInt(); // L: 84
		int[] var10000 = this.trackLengths;
		var10000[var1] += var2; // L: 85
	} // L: 86

	@ObfuscatedName("u")
	@Export("readMessage")
	int readMessage(int var1) {
		int var2 = this.readMessage0(var1); // L: 89
		return var2; // L: 90
	}

	@ObfuscatedName("t")
	@Export("readMessage0")
	int readMessage0(int var1) {
		byte var2 = this.buffer.array[this.buffer.offset]; // L: 94
		int var5;
		if (var2 < 0) { // L: 95
			var5 = var2 & 255; // L: 96
			this.field2492[var1] = var5; // L: 97
			++this.buffer.offset; // L: 98
		} else {
			var5 = this.field2492[var1]; // L: 101
		}

		if (var5 != 240 && var5 != 247) { // L: 103
			return this.method3997(var1, var5); // L: 116
		} else {
			int var3 = this.buffer.readVarInt(); // L: 104
			if (var5 == 247 && var3 > 0) { // L: 105
				int var4 = this.buffer.array[this.buffer.offset] & 255; // L: 106
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) { // L: 107
					++this.buffer.offset; // L: 108
					this.field2492[var1] = var4; // L: 109
					return this.method3997(var1, var4); // L: 110
				}
			}

			Buffer var10000 = this.buffer; // L: 113
			var10000.offset += var3;
			return 0; // L: 114
		}
	}

	@ObfuscatedName("e")
	int method3997(int var1, int var2) {
		int var4;
		if (var2 == 255) { // L: 120
			int var7 = this.buffer.readUnsignedByte(); // L: 121
			var4 = this.buffer.readVarInt(); // L: 122
			Buffer var10000;
			if (var7 == 47) { // L: 123
				var10000 = this.buffer; // L: 124
				var10000.offset += var4;
				return 1; // L: 125
			} else if (var7 == 81) { // L: 127
				int var5 = this.buffer.readMedium(); // L: 128
				var4 -= 3; // L: 129
				int var6 = this.trackLengths[var1]; // L: 130
				this.field2495 += (long)var6 * (long)(this.field2489 - var5); // L: 131
				this.field2489 = var5; // L: 132
				var10000 = this.buffer; // L: 133
				var10000.offset += var4;
				return 2; // L: 134
			} else {
				var10000 = this.buffer; // L: 136
				var10000.offset += var4;
				return 3; // L: 137
			}
		} else {
			byte var3 = field2493[var2 - 128]; // L: 139
			var4 = var2; // L: 140
			if (var3 >= 1) { // L: 141
				var4 = var2 | this.buffer.readUnsignedByte() << 8;
			}

			if (var3 >= 2) { // L: 142
				var4 |= this.buffer.readUnsignedByte() << 16;
			}

			return var4; // L: 143
		}
	}

	@ObfuscatedName("o")
	long method4025(int var1) {
		return this.field2495 + (long)var1 * (long)this.field2489; // L: 147
	}

	@ObfuscatedName("n")
	@Export("getPrioritizedTrack")
	int getPrioritizedTrack() {
		int var1 = this.trackPositions.length; // L: 151
		int var2 = -1; // L: 152
		int var3 = Integer.MAX_VALUE; // L: 153

		for (int var4 = 0; var4 < var1; ++var4) { // L: 154
			if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) { // L: 155 156
				var2 = var4; // L: 157
				var3 = this.trackLengths[var4]; // L: 158
			}
		}

		return var2; // L: 161
	}

	@ObfuscatedName("x")
	@Export("isDone")
	boolean isDone() {
		int var1 = this.trackPositions.length; // L: 165

		for (int var2 = 0; var2 < var1; ++var2) { // L: 166
			if (this.trackPositions[var2] >= 0) {
				return false;
			}
		}

		return true; // L: 167
	}

	@ObfuscatedName("p")
	@Export("reset")
	void reset(long var1) {
		this.field2495 = var1; // L: 171
		int var3 = this.trackPositions.length; // L: 172

		for (int var4 = 0; var4 < var3; ++var4) { // L: 173
			this.trackLengths[var4] = 0; // L: 174
			this.field2492[var4] = 0; // L: 175
			this.buffer.offset = this.trackStarts[var4]; // L: 176
			this.readTrackLength(var4); // L: 177
			this.trackPositions[var4] = this.buffer.offset; // L: 178
		}

	} // L: 180
}
