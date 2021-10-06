import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class14 {
	@ObfuscatedName("k")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -2083803303
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1296080331
	)
	final int field82;
	@ObfuscatedName("q")
	final String field79;
	@ObfuscatedName("f")
	final ThreadFactory field84;
	@ObfuscatedName("j")
	final ThreadPoolExecutor field81;

	public class14(String var1, int var2, int var3) {
		this.field79 = var1;
		this.field82 = var2;
		this.field84 = new class16(this);
		this.field81 = this.method169(var3);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "1584843166"
	)
	final ThreadPoolExecutor method169(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field82), this.field84);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)Lz;",
		garbageValue = "91554656"
	)
	public class19 method178(class10 var1) {
		if (this.field81.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field81.getCorePoolSize() + " Queue capacity " + this.field82);
			return new class19("Queue full");
		} else {
			class19 var2 = new class19(this.field81.submit(new class20(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1427379154"
	)
	public final void method172() {
		try {
			this.field81.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-1312384098"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2085487227"
	)
	static void method175() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IIIB)Z",
		garbageValue = "-89"
	)
	static final boolean method179(Model var0, int var1, int var2, int var3) {
		if (!GameEngine.method510()) {
			return false;
		} else {
			HealthBarUpdate.method2158();
			int var4 = var0.xMid + var1;
			int var5 = var2 + var0.yMid;
			int var6 = var3 + var0.zMid;
			int var7 = var0.xMidOffset;
			int var8 = var0.yMidOffset;
			int var9 = var0.zMidOffset;
			int var10 = class122.field1426 - var4;
			int var11 = ViewportMouse.field2585 - var5;
			int var12 = DirectByteArrayCopier.field3212 - var6;
			if (Math.abs(var10) > var7 + Interpreter.field829) {
				return false;
			} else if (Math.abs(var11) > var8 + ViewportMouse.field2580) {
				return false;
			} else if (Math.abs(var12) > var9 + class19.field98) {
				return false;
			} else if (Math.abs(var12 * ViewportMouse.field2579 - var11 * class121.field1412) > var8 * class19.field98 + var9 * ViewportMouse.field2580) {
				return false;
			} else if (Math.abs(var10 * class121.field1412 - var12 * MilliClock.field1588) > var7 * class19.field98 + var9 * Interpreter.field829) {
				return false;
			} else {
				return Math.abs(var11 * MilliClock.field1588 - var10 * ViewportMouse.field2579) <= var7 * ViewportMouse.field2580 + var8 * Interpreter.field829;
			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(ZLoy;I)V",
		garbageValue = "2078480474"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field611 = 0;
		Client.field713 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field612[++Client.field611 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = Client.npcIndices[var4];
				NPC var6 = Client.npcs[var5];
				int var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var6.npcCycle = Client.cycle;
				} else {
					int var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var6.npcCycle = Client.cycle;
						Client.field535[++Client.field713 - 1] = var5;
					} else {
						int var9;
						int var10;
						if (var8 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var6.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var6.method2223(var9, (byte)1);
							var10 = var2.readBits(1);
							if (var10 == 1) {
								Client.field535[++Client.field713 - 1] = var5;
							}
						} else if (var8 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var6.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var6.method2223(var9, (byte)2);
							var10 = var2.readBits(3);
							var6.method2223(var10, (byte)2);
							int var11 = var2.readBits(1);
							if (var11 == 1) {
								Client.field535[++Client.field713 - 1] = var5;
							}
						} else if (var8 == 3) {
							Client.field612[++Client.field611 - 1] = var5;
						}
					}
				}
			}

			MidiPcmStream.method4806(var0, var1);
			class318.method5839(var1);

			int var12;
			for (var12 = 0; var12 < Client.field611; ++var12) {
				var3 = Client.field612[var12];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var12 = 0; var12 < Client.npcCount; ++var12) {
					if (Client.npcs[Client.npcIndices[var12]] == null) {
						throw new RuntimeException(var12 + "," + Client.npcCount);
					}
				}

			}
		}
	}
}
