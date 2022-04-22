import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("v")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("c")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1631784043
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("f")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1349825787
	)
	@Export("position")
	int position;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1219370145
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("s")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0;
		this.limit = 0;
		this.inputStream = var1;
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity]; // L: 66
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	} // L: 70

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.capacity) { // L: 107
			synchronized(this) {
				int var3;
				if (this.position <= this.limit) {
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit; // L: 111
				}

				if (var3 < var1) {
					if (this.exception != null) {
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll();
						return false; // L: 115
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "412570779"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) {
			int var2;
			if (this.position <= this.limit) {
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit;
			}

			if (var2 <= 0 && this.exception != null) { // L: 126
				throw new IOException(this.exception.toString());
			} else {
				this.notifyAll();
				return var2; // L: 130
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1010089751"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) {
			if (this.position == this.limit) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					return -1; // L: 138
				}
			} else {
				int var2 = this.buffer[this.position] & 255;
				this.position = (this.position + 1) % this.capacity;
				this.notifyAll(); // L: 142
				return var2;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-2005340605"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var5;
				if (this.position <= this.limit) { // L: 151
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit;
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) { // L: 155
						System.arraycopy(this.buffer, this.position, var1, var2, var3);
					} else {
						int var6 = this.capacity - this.position; // L: 159
						System.arraycopy(this.buffer, this.position, var1, var2, var6);
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
					}

					this.position = (var3 + this.position) % this.capacity; // L: 163
					this.notifyAll(); // L: 164
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "202162946"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 170
			if (this.exception == null) {
				this.exception = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.thread.join(); // L: 175
		} catch (InterruptedException var3) { // L: 177
		}

	} // L: 178

	public void run() {
		while (true) {
			int var1;
			synchronized(this) { // L: 75
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position == 0) {
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) { // L: 79
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait(); // L: 83
					} catch (InterruptedException var10) {
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1);
				if (var7 == -1) {
					throw new EOFException(); // L: 91
				}
			} catch (IOException var11) {
				IOException var3 = var11;
				synchronized(this) {
					this.exception = var3; // L: 95
					return;
				}
			}

			synchronized(this) { // L: 99
				this.limit = (var7 + this.limit) % this.capacity;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Llo;II)Ljd;",
		garbageValue = "1218587295"
	)
	public static PacketBufferNode method6908(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2918, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0); // L: 18
		int var5 = var4.packetBuffer.offset; // L: 19
		var4.packetBuffer.writeByte(var0); // L: 20
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) { // L: 23
			var7 = 0; // L: 24
			var1 = var1.substring("yellow:".length()); // L: 25
		} else if (var6.startsWith("red:")) { // L: 27
			var7 = 1; // L: 28
			var1 = var1.substring("red:".length()); // L: 29
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2; // L: 32
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) { // L: 35
			var7 = 3; // L: 36
			var1 = var1.substring("cyan:".length()); // L: 37
		} else if (var6.startsWith("purple:")) { // L: 39
			var7 = 4; // L: 40
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) { // L: 43
			var7 = 5; // L: 44
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) { // L: 47
			var7 = 6; // L: 48
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) { // L: 51
			var7 = 7; // L: 52
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) { // L: 55
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length()); // L: 57
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9; // L: 60
			var1 = var1.substring("glow1:".length()); // L: 61
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10; // L: 64
			var1 = var1.substring("glow2:".length()); // L: 65
		} else if (var6.startsWith("glow3:")) { // L: 67
			var7 = 11; // L: 68
			var1 = var1.substring("glow3:".length()); // L: 69
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) { // L: 72
				var7 = 0; // L: 73
				var1 = var1.substring("yellow:".length()); // L: 74
			} else if (var6.startsWith("red:")) { // L: 76
				var7 = 1; // L: 77
				var1 = var1.substring("red:".length()); // L: 78
			} else if (var6.startsWith("green:")) { // L: 80
				var7 = 2; // L: 81
				var1 = var1.substring("green:".length()); // L: 82
			} else if (var6.startsWith("cyan:")) { // L: 84
				var7 = 3; // L: 85
				var1 = var1.substring("cyan:".length()); // L: 86
			} else if (var6.startsWith("purple:")) { // L: 88
				var7 = 4; // L: 89
				var1 = var1.substring("purple:".length()); // L: 90
			} else if (var6.startsWith("white:")) { // L: 92
				var7 = 5; // L: 93
				var1 = var1.substring("white:".length()); // L: 94
			} else if (var6.startsWith("flash1:")) { // L: 96
				var7 = 6; // L: 97
				var1 = var1.substring("flash1:".length()); // L: 98
			} else if (var6.startsWith("flash2:")) { // L: 100
				var7 = 7; // L: 101
				var1 = var1.substring("flash2:".length()); // L: 102
			} else if (var6.startsWith("flash3:")) { // L: 104
				var7 = 8; // L: 105
				var1 = var1.substring("flash3:".length()); // L: 106
			} else if (var6.startsWith("glow1:")) { // L: 108
				var7 = 9; // L: 109
				var1 = var1.substring("glow1:".length()); // L: 110
			} else if (var6.startsWith("glow2:")) { // L: 112
				var7 = 10; // L: 113
				var1 = var1.substring("glow2:".length()); // L: 114
			} else if (var6.startsWith("glow3:")) { // L: 116
				var7 = 11; // L: 117
				var1 = var1.substring("glow3:".length()); // L: 118
			}
		}

		var6 = var1.toLowerCase(); // L: 121
		byte var8 = 0; // L: 122
		if (var6.startsWith("wave:")) { // L: 123
			var8 = 1; // L: 124
			var1 = var1.substring("wave:".length()); // L: 125
		} else if (var6.startsWith("wave2:")) { // L: 127
			var8 = 2; // L: 128
			var1 = var1.substring("wave2:".length()); // L: 129
		} else if (var6.startsWith("shake:")) { // L: 131
			var8 = 3; // L: 132
			var1 = var1.substring("shake:".length()); // L: 133
		} else if (var6.startsWith("scroll:")) { // L: 135
			var8 = 4; // L: 136
			var1 = var1.substring("scroll:".length()); // L: 137
		} else if (var6.startsWith("slide:")) { // L: 139
			var8 = 5; // L: 140
			var1 = var1.substring("slide:".length()); // L: 141
		} else if (var2 != Language.Language_EN) { // L: 143
			if (var6.startsWith("wave:")) { // L: 144
				var8 = 1; // L: 145
				var1 = var1.substring("wave:".length()); // L: 146
			} else if (var6.startsWith("wave2:")) { // L: 148
				var8 = 2; // L: 149
				var1 = var1.substring("wave2:".length()); // L: 150
			} else if (var6.startsWith("shake:")) { // L: 152
				var8 = 3; // L: 153
				var1 = var1.substring("shake:".length()); // L: 154
			} else if (var6.startsWith("scroll:")) { // L: 156
				var8 = 4; // L: 157
				var1 = var1.substring("scroll:".length()); // L: 158
			} else if (var6.startsWith("slide:")) { // L: 160
				var8 = 5; // L: 161
				var1 = var1.substring("slide:".length()); // L: 162
			}
		}

		var4.packetBuffer.writeByte(var7); // L: 165
		var4.packetBuffer.writeByte(var8); // L: 166
		class282.method5489(var4.packetBuffer, var1); // L: 167
		if (var0 == class296.field3492.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.method7774(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lky;II)I",
		garbageValue = "-965040804"
	)
	static final int method6907(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10924
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10926
				int var3 = 0; // L: 10927
				int var4 = 0; // L: 10928
				byte var5 = 0; // L: 10929

				while (true) {
					int var6 = var2[var4++]; // L: 10931
					int var7 = 0; // L: 10932
					byte var8 = 0; // L: 10933
					if (var6 == 0) { // L: 10934
						return var3;
					}

					if (var6 == 1) { // L: 10935
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10936
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10937
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10938
						var9 = var2[var4++] << 16; // L: 10939
						var9 += var2[var4++]; // L: 10940
						var10 = class127.getWidget(var9); // L: 10941
						var11 = var2[var4++]; // L: 10942
						if (var11 != -1 && (!class19.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10943
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10944
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10945
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10949
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10950
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10951
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10952
						var7 = GrandExchangeEvents.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10953
						for (var9 = 0; var9 < 25; ++var9) { // L: 10954
							if (Skills.Skills_enabled[var9]) { // L: 10955
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10958
						var9 = var2[var4++] << 16; // L: 10959
						var9 += var2[var4++]; // L: 10960
						var10 = class127.getWidget(var9); // L: 10961
						var11 = var2[var4++]; // L: 10962
						if (var11 != -1 && (!class19.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10963
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10964
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10965
									var7 = 999999999; // L: 10966
									break; // L: 10967
								}
							}
						}
					}

					if (var6 == 11) { // L: 10972
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10973
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10974
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10975
						int var13 = var2[var4++]; // L: 10976
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10977
					}

					if (var6 == 14) { // L: 10979
						var9 = var2[var4++]; // L: 10980
						var7 = SecureRandomCallable.getVarbit(var9); // L: 10981
					}

					if (var6 == 15) { // L: 10983
						var8 = 1;
					}

					if (var6 == 16) { // L: 10984
						var8 = 2;
					}

					if (var6 == 17) { // L: 10985
						var8 = 3;
					}

					if (var6 == 18) { // L: 10986
						var7 = (GrandExchangeEvents.localPlayer.x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX;
					}

					if (var6 == 19) { // L: 10987
						var7 = (GrandExchangeEvents.localPlayer.y >> 7) + VarcInt.baseY;
					}

					if (var6 == 20) { // L: 10988
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10989
						if (var5 == 0) { // L: 10990
							var3 += var7;
						}

						if (var5 == 1) { // L: 10991
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10992
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10993
							var3 *= var7;
						}

						var5 = 0; // L: 10994
					} else {
						var5 = var8; // L: 10996
					}
				}
			} catch (Exception var14) { // L: 10999
				return -1; // L: 11000
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1931509382"
	)
	static boolean method6889() {
		return class131.clientPreferences.method2249() >= Client.field617; // L: 12661
	}
}
