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
		this.position = 0;
		this.limit = 0;
		this.outputStream = var1;
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1810348727"
	)
	@Export("isClosed")
	boolean isClosed() {
		if (this.closed) {
			try {
				this.outputStream.close();
				if (this.exception == null) {
					this.exception = new IOException("");
				}
			} catch (IOException var2) {
				if (this.exception == null) {
					this.exception = new IOException(var2);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "103815641"
	)
	@Export("write")
	void write(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					int var5;
					if (this.position <= this.limit) {
						var5 = this.capacity - this.limit + this.position - 1;
					} else {
						var5 = this.position - this.limit - 1;
					}

					if (var5 < var3) {
						throw new IOException("");
					} else {
						if (var3 + this.limit <= this.capacity) {
							System.arraycopy(var1, var2, this.buffer, this.limit, var3);
						} else {
							int var6 = this.capacity - this.limit;
							System.arraycopy(var1, var2, this.buffer, this.limit, var6);
							System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6);
						}

						this.limit = (var3 + this.limit) % this.capacity;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "784609340"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			this.closed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position <= this.limit) {
						var1 = this.limit - this.position;
					} else {
						var1 = this.capacity - this.position + this.limit;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.outputStream.flush();
					} catch (IOException var11) {
						this.exception = var11;
						return;
					}

					if (this.isClosed()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var12) {
					}
				}
			}

			try {
				if (var1 + this.position <= this.capacity) {
					this.outputStream.write(this.buffer, this.position, var1);
				} else {
					int var7 = this.capacity - this.position;
					this.outputStream.write(this.buffer, this.position, var7);
					this.outputStream.write(this.buffer, 0, var1 - var7);
				}
			} catch (IOException var10) {
				IOException var2 = var10;
				synchronized(this) {
					this.exception = var2;
					return;
				}
			}

			synchronized(this) {
				this.position = (var1 + this.position) % this.capacity;
			}
		} while(!this.isClosed());

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1853043366"
	)
	static int method6551(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 1610) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 1613) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++IsaacCipher.Interpreter_intStackSize;
			return 1;
		}
	}
}
