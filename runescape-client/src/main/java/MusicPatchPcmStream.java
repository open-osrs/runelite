import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("t")
	public static short[][] field2516;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lgv;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lhl;[IIIII)V",
		garbageValue = "1431385490"
	)
	void method4046(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2449[var1.field2479] & 4) != 0 && var1.field2473 < 0) {
			int var6 = this.superStream.field2454[var1.field2479] / PcmPlayer.field1442;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2484) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field2484 += var4 * var6; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2484 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field1442 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2452[var1.field2479] == 0) {
					var1.stream = RawPcmStream.method2683(var1.rawSound, var10.method2689(), var10.method2680(), var10.method2681());
				} else {
					var1.stream = RawPcmStream.method2683(var1.rawSound, var10.method2689(), 0, var10.method2681());
					this.superStream.method3867(var1, var1.patch.field2504[var1.field2466] < 0);
					var1.stream.method2721(var8, var10.method2680());
				}

				if (var1.patch.field2504[var1.field2466] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method2687(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method2786()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	} // L: 102

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IB)V",
		garbageValue = "-29"
	)
	void method4047(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2449[var1.field2479] & 4) != 0 && var1.field2473 < 0) {
			int var3 = this.superStream.field2454[var1.field2479] / PcmPlayer.field1442;
			int var4 = (var3 + 1048575 - var1.field2484) / var3; // L: 107
			var1.field2484 = var3 * var2 + var1.field2484 & 1048575; // L: 108
			if (var4 <= var2) {
				if (this.superStream.field2452[var1.field2479] == 0) {
					var1.stream = RawPcmStream.method2683(var1.rawSound, var1.stream.method2689(), var1.stream.method2680(), var1.stream.method2681()); // L: 111
				} else {
					var1.stream = RawPcmStream.method2683(var1.rawSound, var1.stream.method2689(), 0, var1.stream.method2681());
					this.superStream.method3867(var1, var1.patch.field2504[var1.field2466] < 0);
				}

				if (var1.patch.field2504[var1.field2466] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2484 / var3;
			}
		}

		var1.stream.skip(var2);
	} // L: 122

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) {
				return null; // L: 28
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("c")
	protected int vmethod4043() {
		return 0; // L: 34
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3889(var6)) { // L: 42
				int var4 = var2;
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field2483) {
						this.method4046(var6, var1, var4, var5, var4 + var5);
						var6.field2483 -= var5; // L: 52
						break;
					}

					this.method4046(var6, var1, var4, var6.field2483, var5 + var4);
					var4 += var6.field2483; // L: 47
					var5 -= var6.field2483;
				} while(!this.superStream.method3877(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("e")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3889(var3)) { // L: 60
				int var2 = var1;

				do {
					if (var2 <= var3.field2483) { // L: 62
						this.method4047(var3, var2);
						var3.field2483 -= var2; // L: 68
						break;
					}

					this.method4047(var3, var3.field2483);
					var2 -= var3.field2483;
				} while(!this.superStream.method3877(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1711772520"
	)
	public static void method4041(String var0, String var1, int var2, int var3) throws IOException {
		class297.idxCount = var3; // L: 40
		AbstractUserComparator.cacheGamebuild = var2; // L: 41

		try {
			ApproximateRouteStrategy.field642 = System.getProperty("os.name"); // L: 43
		} catch (Exception var32) { // L: 45
			ApproximateRouteStrategy.field642 = "Unknown"; // L: 46
		}

		MouseRecorder.field617 = ApproximateRouteStrategy.field642.toLowerCase(); // L: 48

		try {
			class52.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (class52.userHomeDirectory != null) { // L: 51
				class52.userHomeDirectory = class52.userHomeDirectory + "/";
			}
		} catch (Exception var31) { // L: 53
		}

		try {
			if (MouseRecorder.field617.startsWith("win")) { // L: 55
				if (class52.userHomeDirectory == null) { // L: 56
					class52.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class52.userHomeDirectory == null) { // L: 59
				class52.userHomeDirectory = System.getenv("HOME");
			}

			if (class52.userHomeDirectory != null) { // L: 61
				class52.userHomeDirectory = class52.userHomeDirectory + "/";
			}
		} catch (Exception var30) { // L: 63
		}

		if (class52.userHomeDirectory == null) { // L: 64
			class52.userHomeDirectory = "~/";
		}

		GrandExchangeEvents.field68 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class52.userHomeDirectory, "/tmp/", ""}; // L: 65
		Client.field957 = new String[]{".jagex_cache_" + AbstractUserComparator.cacheGamebuild, ".file_store_" + AbstractUserComparator.cacheGamebuild}; // L: 66
		int var18 = 0;

		label256:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			class277.JagexCache_locationFile = new File(class52.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			int var12;
			int var14;
			File var37;
			if (class277.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(class277.JagexCache_locationFile, "rw", 10000L); // L: 78

					Buffer var11;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) { // L: 79 80 83
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset); // L: 81
						if (var12 == -1) { // L: 82
							throw new IOException();
						}
					}

					var11.offset = 0; // L: 85
					var12 = var11.readUnsignedByte(); // L: 86
					if (var12 < 1 || var12 > 3) { // L: 87
						throw new IOException("" + var12);
					}

					int var13 = 0; // L: 88
					if (var12 > 1) { // L: 89
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) { // L: 90
						var7 = var11.readStringCp1252NullCircumfixed(); // L: 91
						if (var13 == 1) { // L: 92
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8(); // L: 95
						if (var13 == 1) { // L: 96
							var8 = var11.readCESU8();
						}
					}

					var10.close(); // L: 98
				} catch (IOException var34) { // L: 100
					var34.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var37 = new File(var7); // L: 104
					if (!var37.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var37 = new File(var7, "test.dat"); // L: 110

					boolean var40;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var37, "rw"); // L: 114
						var14 = var19.read(); // L: 115
						var19.seek(0L); // L: 116
						var19.write(var14); // L: 117
						var19.seek(0L); // L: 118
						var19.close(); // L: 119
						var37.delete(); // L: 120
						var40 = true; // L: 121
					} catch (Exception var29) { // L: 123
						var40 = false; // L: 124
					}

					if (!var40) { // L: 127
						var7 = null; // L: 128
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 132
				label230:
				for (int var20 = 0; var20 < Client.field957.length; ++var20) { // L: 133
					for (int var21 = 0; var21 < GrandExchangeEvents.field68.length; ++var21) { // L: 134
						File var22 = new File(GrandExchangeEvents.field68[var21] + Client.field957[var20] + File.separatorChar + var0 + File.separatorChar); // L: 135
						if (var22.exists()) { // L: 136
							File var23 = new File(var22, "test.dat"); // L: 138

							boolean var41;
							try {
								RandomAccessFile var15 = new RandomAccessFile(var23, "rw"); // L: 141
								int var16 = var15.read(); // L: 142
								var15.seek(0L); // L: 143
								var15.write(var16); // L: 144
								var15.seek(0L); // L: 145
								var15.close(); // L: 146
								var23.delete(); // L: 147
								var41 = true; // L: 148
							} catch (Exception var28) { // L: 150
								var41 = false; // L: 151
							}

							if (var41) { // L: 154
								var7 = var22.toString(); // L: 155
								var9 = true; // L: 156
								break label230; // L: 157
							}
						}
					}
				}
			}

			if (var7 == null) { // L: 163
				var7 = class52.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 164
				var9 = true; // L: 165
			}

			if (var8 != null) { // L: 167
				File var36 = new File(var8); // L: 168
				var37 = new File(var7); // L: 169

				try {
					File[] var45 = var36.listFiles(); // L: 171
					File[] var43 = var45; // L: 173

					for (var14 = 0; var14 < var43.length; ++var14) { // L: 174
						File var42 = var43[var14]; // L: 175
						File var24 = new File(var37, var42.getName()); // L: 177
						boolean var17 = var42.renameTo(var24); // L: 178
						if (!var17) { // L: 179
							throw new IOException();
						}
					}
				} catch (Exception var33) { // L: 184
					var33.printStackTrace(); // L: 185
				}

				var9 = true; // L: 187
			}

			if (var9) { // L: 189
				SecureRandomCallable.method1237(new File(var7), (File)null);
			}

			File var5 = new File(var7); // L: 190
			JagexCache.cacheDir = var5; // L: 192
			if (!JagexCache.cacheDir.exists()) { // L: 193
				JagexCache.cacheDir.mkdirs();
			}

			File[] var35 = JagexCache.cacheDir.listFiles(); // L: 194
			if (var35 != null) { // L: 195
				File[] var38 = var35; // L: 197

				for (int var25 = 0; var25 < var38.length; ++var25) { // L: 198
					File var26 = var38[var25]; // L: 199

					boolean var44;
					try {
						RandomAccessFile var39 = new RandomAccessFile(var26, "rw"); // L: 204
						var12 = var39.read(); // L: 205
						var39.seek(0L); // L: 206
						var39.write(var12); // L: 207
						var39.seek(0L); // L: 208
						var39.close(); // L: 209
						var44 = true; // L: 211
					} catch (Exception var27) { // L: 213
						var44 = false; // L: 214
					}

					if (!var44) { // L: 217
						++var18; // L: 67
						continue label256;
					}
				}
			}
			break;
		}

		MouseHandler.method1177(JagexCache.cacheDir); // L: 224
		ClientPacket.method3745(); // L: 225
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(BuddyRankComparator.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 226
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(BuddyRankComparator.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 227
		JagexCache.JagexCache_idxFiles = new BufferedFile[class297.idxCount]; // L: 228

		for (var18 = 0; var18 < class297.idxCount; ++var18) { // L: 229
			JagexCache.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(BuddyRankComparator.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0); // L: 230
		}

	} // L: 232
}
