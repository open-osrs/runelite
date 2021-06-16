import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lv")
@Implements("BufferedSink")
public class BufferedSink implements Runnable {
	@ObfuscatedName("f")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("e")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 992988875
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("y")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1280134095
	)
	@Export("position")
	int position;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1968641393
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("m")
	@Export("exception")
	IOException exception;
	@ObfuscatedName("r")
	@Export("closed")
	boolean closed;

	BufferedSink(OutputStream var1, int var2) {
		this.position = 0; // L: 186
		this.limit = 0; // L: 187
		this.outputStream = var1; // L: 192
		this.capacity = var2 + 1; // L: 193
		this.buffer = new byte[this.capacity]; // L: 194
		this.thread = new Thread(this); // L: 195
		this.thread.setDaemon(true); // L: 196
		this.thread.start(); // L: 197
	} // L: 198

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1288409472"
	)
	@Export("isClosed")
	boolean isClosed() {
		if (this.closed) { // L: 201
			try {
				this.outputStream.close(); // L: 203
				if (this.exception == null) {
					this.exception = new IOException(""); // L: 204
				}
			} catch (IOException var2) { // L: 206
				if (this.exception == null) { // L: 207
					this.exception = new IOException(var2);
				}
			}

			return true; // L: 209
		} else {
			return false; // L: 211
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-765694644"
	)
	@Export("write")
	void write(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 261
			synchronized(this) { // L: 262
				if (this.exception != null) { // L: 263
					throw new IOException(this.exception.toString());
				} else {
					int var5;
					if (this.position <= this.limit) { // L: 265
						var5 = this.capacity - this.limit + this.position - 1;
					} else {
						var5 = this.position - this.limit - 1; // L: 266
					}

					if (var5 < var3) { // L: 267
						throw new IOException("");
					} else {
						if (var3 + this.limit <= this.capacity) { // L: 268
							System.arraycopy(var1, var2, this.buffer, this.limit, var3); // L: 269
						} else {
							int var6 = this.capacity - this.limit; // L: 272
							System.arraycopy(var1, var2, this.buffer, this.limit, var6); // L: 273
							System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6); // L: 274
						}

						this.limit = (var3 + this.limit) % this.capacity; // L: 276
						this.notifyAll(); // L: 277
					}
				}
			}
		} else {
			throw new IOException();
		}
	} // L: 279

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 282
			this.closed = true; // L: 283
			this.notifyAll(); // L: 284
		} // L: 285

		try {
			this.thread.join(); // L: 287
		} catch (InterruptedException var3) { // L: 289
		}

	} // L: 290

	public void run() {
		do {
			int var1;
			synchronized(this) { // L: 217
				while (true) {
					if (this.exception != null) { // L: 219
						return;
					}

					if (this.position <= this.limit) { // L: 220
						var1 = this.limit - this.position;
					} else {
						var1 = this.capacity - this.position + this.limit; // L: 221
					}

					if (var1 > 0) { // L: 222
						break;
					}

					try {
						this.outputStream.flush(); // L: 224
					} catch (IOException var11) { // L: 226
						this.exception = var11; // L: 227
						return; // L: 228
					}

					if (this.isClosed()) { // L: 230
						return;
					}

					try {
						this.wait(); // L: 232
					} catch (InterruptedException var12) { // L: 234
					}
				}
			}

			try {
				if (var1 + this.position <= this.capacity) { // L: 238
					this.outputStream.write(this.buffer, this.position, var1); // L: 239
				} else {
					int var7 = this.capacity - this.position; // L: 242
					this.outputStream.write(this.buffer, this.position, var7); // L: 243
					this.outputStream.write(this.buffer, 0, var1 - var7); // L: 244
				}
			} catch (IOException var10) { // L: 247
				IOException var2 = var10;
				synchronized(this) { // L: 248
					this.exception = var2; // L: 249
					return; // L: 250
				}
			}

			synchronized(this) { // L: 253
				this.position = (var1 + this.position) % this.capacity; // L: 254
			} // L: 255
		} while(!this.isClosed()); // L: 256

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "14"
	)
	static int method5990(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 804
			var0 -= 1000; // L: 805
			var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 806
		} else {
			var3 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 808
		}

		Script.invalidateWidget(var3); // L: 809
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 810
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 830
				var3.modelType = 2; // L: 831
				var3.modelId = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 832
				return 1; // L: 833
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 835
				var3.modelType = 3; // L: 836
				var3.modelId = class262.localPlayer.appearance.getChatHeadId(); // L: 837
				return 1; // L: 838
			} else {
				return 2; // L: 840
			}
		} else {
			ChatChannel.Interpreter_intStackSize -= 2; // L: 811
			int var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 812
			int var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 813
			var3.itemId = var4; // L: 814
			var3.itemQuantity = var5; // L: 815
			ItemComposition var6 = class250.ItemDefinition_get(var4); // L: 816
			var3.modelAngleX = var6.xan2d; // L: 817
			var3.modelAngleY = var6.yan2d; // L: 818
			var3.modelAngleZ = var6.zan2d; // L: 819
			var3.modelOffsetX = var6.offsetX2d; // L: 820
			var3.modelOffsetY = var6.offsetY2d; // L: 821
			var3.modelZoom = var6.zoom2d; // L: 822
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 823
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 824
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 825
			}

			if (var3.field3011 > 0) { // L: 826
				var3.modelZoom = var3.modelZoom * 32 / var3.field3011;
			} else if (var3.rawWidth > 0) { // L: 827
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 828
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-452745506"
	)
	static void method5992() {
		PacketBufferNode var0 = InterfaceParent.getPacketBufferNode(ClientPacket.field2656, Client.packetWriter.isaacCipher); // L: 4412
		var0.packetBuffer.writeByte(class302.getWindowedMode()); // L: 4413
		var0.packetBuffer.writeShort(AttackOption.canvasWidth); // L: 4414
		var0.packetBuffer.writeShort(class0.canvasHeight); // L: 4415
		Client.packetWriter.addNode(var0); // L: 4416
	} // L: 4417
}
