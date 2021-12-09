import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mb")
@Implements("BufferedSink")
public class BufferedSink implements Runnable {
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -719644833
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("c")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("b")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 345474963
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("m")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2075331091
	)
	@Export("position")
	int position;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 154665981
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("j")
	@Export("exception")
	IOException exception;
	@ObfuscatedName("w")
	@Export("closed")
	boolean closed;

	BufferedSink(OutputStream var1, int var2) {
		this.position = 0; // L: 193
		this.limit = 0; // L: 194
		this.outputStream = var1; // L: 199
		this.capacity = var2 + 1; // L: 200
		this.buffer = new byte[this.capacity]; // L: 201
		this.thread = new Thread(this); // L: 202
		this.thread.setDaemon(true); // L: 203
		this.thread.start(); // L: 204
	} // L: 205

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1810348727"
	)
	@Export("isClosed")
	boolean isClosed() {
		if (this.closed) { // L: 208
			try {
				this.outputStream.close(); // L: 210
				if (this.exception == null) {
					this.exception = new IOException(""); // L: 211
				}
			} catch (IOException var2) { // L: 213
				if (this.exception == null) { // L: 214
					this.exception = new IOException(var2);
				}
			}

			return true; // L: 216
		} else {
			return false; // L: 218
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "103815641"
	)
	@Export("write")
	void write(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 268
			synchronized(this) { // L: 269
				if (this.exception != null) { // L: 270
					throw new IOException(this.exception.toString());
				} else {
					int var5;
					if (this.position <= this.limit) { // L: 272
						var5 = this.capacity - this.limit + this.position - 1;
					} else {
						var5 = this.position - this.limit - 1; // L: 273
					}

					if (var5 < var3) {
						throw new IOException(""); // L: 274
					} else {
						if (var3 + this.limit <= this.capacity) { // L: 275
							System.arraycopy(var1, var2, this.buffer, this.limit, var3); // L: 276
						} else {
							int var6 = this.capacity - this.limit; // L: 279
							System.arraycopy(var1, var2, this.buffer, this.limit, var6); // L: 280
							System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6); // L: 281
						}

						this.limit = (var3 + this.limit) % this.capacity; // L: 283
						this.notifyAll(); // L: 284
					}
				}
			}
		} else {
			throw new IOException();
		}
	} // L: 286

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "784609340"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 289
			this.closed = true; // L: 290
			this.notifyAll(); // L: 291
		} // L: 292

		try {
			this.thread.join(); // L: 294
		} catch (InterruptedException var3) { // L: 296
		}

	} // L: 297

	public void run() {
		do {
			int var1;
			synchronized(this) { // L: 224
				while (true) {
					if (this.exception != null) { // L: 226
						return;
					}

					if (this.position <= this.limit) { // L: 227
						var1 = this.limit - this.position;
					} else {
						var1 = this.capacity - this.position + this.limit; // L: 228
					}

					if (var1 > 0) { // L: 229
						break;
					}

					try {
						this.outputStream.flush(); // L: 231
					} catch (IOException var11) { // L: 233
						this.exception = var11; // L: 234
						return; // L: 235
					}

					if (this.isClosed()) { // L: 237
						return;
					}

					try {
						this.wait(); // L: 239
					} catch (InterruptedException var12) { // L: 241
					}
				}
			}

			try {
				if (var1 + this.position <= this.capacity) { // L: 245
					this.outputStream.write(this.buffer, this.position, var1); // L: 246
				} else {
					int var7 = this.capacity - this.position; // L: 249
					this.outputStream.write(this.buffer, this.position, var7); // L: 250
					this.outputStream.write(this.buffer, 0, var1 - var7); // L: 251
				}
			} catch (IOException var10) { // L: 254
				IOException var2 = var10;
				synchronized(this) { // L: 255
					this.exception = var2; // L: 256
					return; // L: 257
				}
			}

			synchronized(this) { // L: 260
				this.position = (var1 + this.position) % this.capacity; // L: 261
			} // L: 262
		} while(!this.isClosed()); // L: 263

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1853043366"
	)
	static int method6551(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 1113
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1114
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1115
			return 1; // L: 1116
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1118
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1119
			return 1; // L: 1120
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1122
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.text; // L: 1123
			return 1; // L: 1124
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1126
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1127
			return 1; // L: 1128
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1130
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1131
			return 1; // L: 1132
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1134
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1135
			return 1; // L: 1136
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1138
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1139
			return 1; // L: 1140
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1142
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1143
			return 1; // L: 1144
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1146
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1147
			return 1; // L: 1148
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1150
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1151
			return 1; // L: 1152
		} else if (var0 == 1610) { // L: 1154
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1155
			return 1; // L: 1156
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1158
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.color; // L: 1159
			return 1; // L: 1160
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1162
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.color2; // L: 1163
			return 1; // L: 1164
		} else if (var0 == 1613) { // L: 1166
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1167
			return 1; // L: 1168
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1170
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1171
			return 1; // L: 1172
		} else if (var0 != 1615 && var0 != 1616) { // L: 1174
			return 2; // L: 1178
		} else {
			++IsaacCipher.Interpreter_intStackSize; // L: 1175
			return 1; // L: 1176
		}
	}
}
