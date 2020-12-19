import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("h")
	int field1479;
	@ObfuscatedName("v")
	int field1488;
	@ObfuscatedName("x")
	int field1480;
	@ObfuscatedName("t")
	int field1482;
	@ObfuscatedName("j")
	int field1483;
	@ObfuscatedName("n")
	int field1484;
	@ObfuscatedName("p")
	int field1485;
	@ObfuscatedName("l")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("z")
	@Export("start")
	int start;
	@ObfuscatedName("u")
	@Export("end")
	int end;
	@ObfuscatedName("e")
	boolean field1489;
	@ObfuscatedName("m")
	int field1490;
	@ObfuscatedName("c")
	int field1491;
	@ObfuscatedName("i")
	int field1492;
	@ObfuscatedName("f")
	int field1493;

	@ObfuscatedSignature(
		descriptor = "(Ldf;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1; // L: 51
		this.start = var1.start; // L: 52
		this.end = var1.end; // L: 53
		this.field1489 = var1.field1408; // L: 54
		this.field1488 = var2; // L: 55
		this.field1480 = var3; // L: 56
		this.field1482 = var4; // L: 57
		this.field1479 = 0; // L: 58
		this.method2608(); // L: 59
	} // L: 60

	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1; // L: 39
		this.start = var1.start; // L: 40
		this.end = var1.end; // L: 41
		this.field1489 = var1.field1408; // L: 42
		this.field1488 = var2; // L: 43
		this.field1480 = var3; // L: 44
		this.field1482 = 8192; // L: 45
		this.field1479 = 0; // L: 46
		this.method2608(); // L: 47
	} // L: 48

	@ObfuscatedName("t")
	void method2608() {
		this.field1483 = this.field1480; // L: 73
		this.field1484 = method2669(this.field1480, this.field1482); // L: 74
		this.field1485 = method2603(this.field1480, this.field1482); // L: 75
	} // L: 76

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null; // L: 200
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null; // L: 204
	}

	@ObfuscatedName("p")
	protected int vmethod3927() {
		return this.field1480 == 0 && this.field1490 == 0 ? 0 : 1; // L: 208 209
	}

	@ObfuscatedName("l")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1480 == 0 && this.field1490 == 0) { // L: 213
			this.skip(var3); // L: 214
		} else {
			RawSound var4 = (RawSound)super.sound; // L: 217
			int var5 = this.start << 8; // L: 218
			int var6 = this.end << 8; // L: 219
			int var7 = var4.samples.length << 8; // L: 220
			int var8 = var6 - var5; // L: 221
			if (var8 <= 0) { // L: 222
				this.numLoops = 0;
			}

			int var9 = var2; // L: 223
			var3 += var2; // L: 224
			if (this.field1479 < 0) { // L: 225
				if (this.field1488 <= 0) { // L: 226
					this.method2617(); // L: 228
					this.remove(); // L: 229
					return; // L: 230
				}

				this.field1479 = 0;
			}

			if (this.field1479 >= var7) { // L: 233
				if (this.field1488 >= 0) { // L: 234
					this.method2617(); // L: 236
					this.remove(); // L: 237
					return; // L: 238
				}

				this.field1479 = var7 - 1;
			}

			if (this.numLoops < 0) { // L: 241
				if (this.field1489) { // L: 242
					if (this.field1488 < 0) { // L: 243
						var9 = this.method2631(var1, var2, var5, var3, var4.samples[this.start]); // L: 244
						if (this.field1479 >= var5) { // L: 245
							return;
						}

						this.field1479 = var5 + var5 - 1 - this.field1479; // L: 246
						this.field1488 = -this.field1488; // L: 247
					}

					while (true) {
						var9 = this.method2607(var1, var9, var6, var3, var4.samples[this.end - 1]); // L: 250
						if (this.field1479 < var6) { // L: 251
							return;
						}

						this.field1479 = var6 + var6 - 1 - this.field1479; // L: 252
						this.field1488 = -this.field1488; // L: 253
						var9 = this.method2631(var1, var9, var5, var3, var4.samples[this.start]); // L: 254
						if (this.field1479 >= var5) { // L: 255
							return;
						}

						this.field1479 = var5 + var5 - 1 - this.field1479; // L: 256
						this.field1488 = -this.field1488; // L: 257
					}
				} else if (this.field1488 < 0) { // L: 260
					while (true) {
						var9 = this.method2631(var1, var9, var5, var3, var4.samples[this.end - 1]); // L: 262
						if (this.field1479 >= var5) { // L: 263
							return;
						}

						this.field1479 = var6 - 1 - (var6 - 1 - this.field1479) % var8; // L: 264
					}
				} else {
					while (true) {
						var9 = this.method2607(var1, var9, var6, var3, var4.samples[this.start]); // L: 269
						if (this.field1479 < var6) { // L: 270
							return;
						}

						this.field1479 = var5 + (this.field1479 - var5) % var8; // L: 271
					}
				}
			} else {
				if (this.numLoops > 0) { // L: 275
					if (this.field1489) { // L: 276
						label127: {
							if (this.field1488 < 0) { // L: 277
								var9 = this.method2631(var1, var2, var5, var3, var4.samples[this.start]); // L: 278
								if (this.field1479 >= var5) { // L: 279
									return;
								}

								this.field1479 = var5 + var5 - 1 - this.field1479; // L: 280
								this.field1488 = -this.field1488; // L: 281
								if (--this.numLoops == 0) { // L: 282
									break label127;
								}
							}

							do {
								var9 = this.method2607(var1, var9, var6, var3, var4.samples[this.end - 1]); // L: 285
								if (this.field1479 < var6) { // L: 286
									return;
								}

								this.field1479 = var6 + var6 - 1 - this.field1479; // L: 287
								this.field1488 = -this.field1488; // L: 288
								if (--this.numLoops == 0) { // L: 289
									break;
								}

								var9 = this.method2631(var1, var9, var5, var3, var4.samples[this.start]); // L: 290
								if (this.field1479 >= var5) { // L: 291
									return;
								}

								this.field1479 = var5 + var5 - 1 - this.field1479; // L: 292
								this.field1488 = -this.field1488; // L: 293
							} while(--this.numLoops != 0); // L: 294
						}
					} else {
						int var10;
						if (this.field1488 < 0) { // L: 297
							while (true) {
								var9 = this.method2631(var1, var9, var5, var3, var4.samples[this.end - 1]); // L: 299
								if (this.field1479 >= var5) { // L: 300
									return;
								}

								var10 = (var6 - 1 - this.field1479) / var8; // L: 301
								if (var10 >= this.numLoops) { // L: 302
									this.field1479 += var8 * this.numLoops; // L: 303
									this.numLoops = 0; // L: 304
									break; // L: 305
								}

								this.field1479 += var8 * var10; // L: 307
								this.numLoops -= var10; // L: 308
							}
						} else {
							while (true) {
								var9 = this.method2607(var1, var9, var6, var3, var4.samples[this.start]); // L: 313
								if (this.field1479 < var6) { // L: 314
									return;
								}

								var10 = (this.field1479 - var5) / var8; // L: 315
								if (var10 >= this.numLoops) { // L: 316
									this.field1479 -= var8 * this.numLoops; // L: 317
									this.numLoops = 0; // L: 318
									break; // L: 319
								}

								this.field1479 -= var8 * var10; // L: 321
								this.numLoops -= var10; // L: 322
							}
						}
					}
				}

				if (this.field1488 < 0) { // L: 326
					this.method2631(var1, var9, 0, var3, 0); // L: 327
					if (this.field1479 < 0) { // L: 328
						this.field1479 = -1; // L: 329
						this.method2617(); // L: 330
						this.remove(); // L: 331
					}
				} else {
					this.method2607(var1, var9, var7, var3, 0); // L: 335
					if (this.field1479 >= var7) { // L: 336
						this.field1479 = var7; // L: 337
						this.method2617(); // L: 338
						this.remove(); // L: 339
					}
				}

			}
		}
	} // L: 215 342

	@ObfuscatedName("z")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1; // L: 79
	} // L: 80

	@ObfuscatedName("u")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1490 > 0) { // L: 345
			if (var1 >= this.field1490) { // L: 346
				if (this.field1480 == Integer.MIN_VALUE) { // L: 347
					this.field1480 = 0; // L: 348
					this.field1485 = 0; // L: 349
					this.field1484 = 0; // L: 350
					this.field1483 = 0; // L: 351
					this.remove(); // L: 352
					var1 = this.field1490; // L: 353
				}

				this.field1490 = 0; // L: 355
				this.method2608(); // L: 356
			} else {
				this.field1483 += this.field1491 * var1; // L: 359
				this.field1484 += this.field1492 * var1; // L: 360
				this.field1485 += this.field1493 * var1; // L: 361
				this.field1490 -= var1; // L: 362
			}
		}

		RawSound var2 = (RawSound)super.sound; // L: 365
		int var3 = this.start << 8; // L: 366
		int var4 = this.end << 8; // L: 367
		int var5 = var2.samples.length << 8; // L: 368
		int var6 = var4 - var3; // L: 369
		if (var6 <= 0) { // L: 370
			this.numLoops = 0;
		}

		if (this.field1479 < 0) { // L: 371
			if (this.field1488 <= 0) { // L: 372
				this.method2617(); // L: 374
				this.remove(); // L: 375
				return; // L: 376
			}

			this.field1479 = 0;
		}

		if (this.field1479 >= var5) { // L: 379
			if (this.field1488 >= 0) { // L: 380
				this.method2617(); // L: 382
				this.remove(); // L: 383
				return; // L: 384
			}

			this.field1479 = var5 - 1;
		}

		this.field1479 += this.field1488 * var1; // L: 387
		if (this.numLoops < 0) { // L: 388
			if (!this.field1489) { // L: 389
				if (this.field1488 < 0) { // L: 404
					if (this.field1479 >= var3) { // L: 405
						return;
					}

					this.field1479 = var4 - 1 - (var4 - 1 - this.field1479) % var6; // L: 406
				} else {
					if (this.field1479 < var4) { // L: 409
						return;
					}

					this.field1479 = var3 + (this.field1479 - var3) % var6; // L: 410
				}

			} else {
				if (this.field1488 < 0) { // L: 390
					if (this.field1479 >= var3) { // L: 391
						return;
					}

					this.field1479 = var3 + var3 - 1 - this.field1479; // L: 392
					this.field1488 = -this.field1488; // L: 393
				}

				while (this.field1479 >= var4) { // L: 396
					this.field1479 = var4 + var4 - 1 - this.field1479; // L: 397
					this.field1488 = -this.field1488; // L: 398
					if (this.field1479 >= var3) { // L: 399
						return;
					}

					this.field1479 = var3 + var3 - 1 - this.field1479; // L: 400
					this.field1488 = -this.field1488; // L: 401
				}

			}
		} else {
			if (this.numLoops > 0) { // L: 414
				if (this.field1489) { // L: 415
					label129: {
						if (this.field1488 < 0) { // L: 416
							if (this.field1479 >= var3) { // L: 417
								return;
							}

							this.field1479 = var3 + var3 - 1 - this.field1479; // L: 418
							this.field1488 = -this.field1488; // L: 419
							if (--this.numLoops == 0) { // L: 420
								break label129;
							}
						}

						do {
							if (this.field1479 < var4) { // L: 423
								return;
							}

							this.field1479 = var4 + var4 - 1 - this.field1479; // L: 424
							this.field1488 = -this.field1488; // L: 425
							if (--this.numLoops == 0) { // L: 426
								break;
							}

							if (this.field1479 >= var3) { // L: 427
								return;
							}

							this.field1479 = var3 + var3 - 1 - this.field1479; // L: 428
							this.field1488 = -this.field1488; // L: 429
						} while(--this.numLoops != 0); // L: 430
					}
				} else {
					label161: {
						int var7;
						if (this.field1488 < 0) { // L: 433
							if (this.field1479 >= var3) { // L: 434
								return;
							}

							var7 = (var4 - 1 - this.field1479) / var6; // L: 435
							if (var7 >= this.numLoops) { // L: 436
								this.field1479 += var6 * this.numLoops; // L: 437
								this.numLoops = 0; // L: 438
								break label161; // L: 439
							}

							this.field1479 += var6 * var7; // L: 441
							this.numLoops -= var7; // L: 442
						} else {
							if (this.field1479 < var4) { // L: 445
								return;
							}

							var7 = (this.field1479 - var3) / var6; // L: 446
							if (var7 >= this.numLoops) { // L: 447
								this.field1479 -= var6 * this.numLoops; // L: 448
								this.numLoops = 0; // L: 449
								break label161; // L: 450
							}

							this.field1479 -= var6 * var7; // L: 452
							this.numLoops -= var7; // L: 453
						}

						return; // L: 455
					}
				}
			}

			if (this.field1488 < 0) { // L: 457
				if (this.field1479 < 0) { // L: 458
					this.field1479 = -1; // L: 459
					this.method2617(); // L: 460
					this.remove(); // L: 461
				}
			} else if (this.field1479 >= var5) { // L: 465
				this.field1479 = var5; // L: 466
				this.method2617(); // L: 467
				this.remove(); // L: 468
			}

		}
	} // L: 412 471

	@ObfuscatedName("e")
	public synchronized void method2610(int var1) {
		this.method2648(var1 << 6, this.method2614()); // L: 83
	} // L: 84

	@ObfuscatedName("m")
	synchronized void method2611(int var1) {
		this.method2648(var1, this.method2614()); // L: 87
	} // L: 88

	@ObfuscatedName("c")
	synchronized void method2648(int var1, int var2) {
		this.field1480 = var1; // L: 91
		this.field1482 = var2; // L: 92
		this.field1490 = 0; // L: 93
		this.method2608(); // L: 94
	} // L: 95

	@ObfuscatedName("i")
	public synchronized int method2613() {
		return this.field1480 == Integer.MIN_VALUE ? 0 : this.field1480; // L: 98
	}

	@ObfuscatedName("f")
	public synchronized int method2614() {
		return this.field1482 < 0 ? -1 : this.field1482; // L: 102
	}

	@ObfuscatedName("y")
	public synchronized void method2615(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8; // L: 106
		if (var1 < -1) { // L: 107
			var1 = -1;
		}

		if (var1 > var2) { // L: 108
			var1 = var2;
		}

		this.field1479 = var1; // L: 109
	} // L: 110

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method2616() {
		this.field1488 = (this.field1488 ^ this.field1488 >> 31) + (this.field1488 >>> 31); // L: 113
		this.field1488 = -this.field1488; // L: 114
	} // L: 115

	@ObfuscatedName("q")
	void method2617() {
		if (this.field1490 != 0) { // L: 118
			if (this.field1480 == Integer.MIN_VALUE) {
				this.field1480 = 0; // L: 119
			}

			this.field1490 = 0; // L: 120
			this.method2608(); // L: 121
		}

	} // L: 123

	@ObfuscatedName("g")
	public synchronized void method2707(int var1, int var2) {
		this.method2744(var1, var2, this.method2614()); // L: 126
	} // L: 127

	@ObfuscatedName("o")
	public synchronized void method2744(int var1, int var2, int var3) {
		if (var1 == 0) { // L: 130
			this.method2648(var2, var3); // L: 131
		} else {
			int var4 = method2669(var2, var3); // L: 134
			int var5 = method2603(var2, var3); // L: 135
			if (var4 == this.field1484 && var5 == this.field1485) { // L: 136
				this.field1490 = 0; // L: 137
			} else {
				int var6 = var2 - this.field1483; // L: 140
				if (this.field1483 - var2 > var6) { // L: 141
					var6 = this.field1483 - var2;
				}

				if (var4 - this.field1484 > var6) { // L: 142
					var6 = var4 - this.field1484;
				}

				if (this.field1484 - var4 > var6) { // L: 143
					var6 = this.field1484 - var4;
				}

				if (var5 - this.field1485 > var6) {
					var6 = var5 - this.field1485; // L: 144
				}

				if (this.field1485 - var5 > var6) { // L: 145
					var6 = this.field1485 - var5;
				}

				if (var1 > var6) { // L: 146
					var1 = var6;
				}

				this.field1490 = var1; // L: 147
				this.field1480 = var2; // L: 148
				this.field1482 = var3; // L: 149
				this.field1491 = (var2 - this.field1483) / var1; // L: 150
				this.field1492 = (var4 - this.field1484) / var1; // L: 151
				this.field1493 = (var5 - this.field1485) / var1; // L: 152
			}
		}
	} // L: 132 138 153

	@ObfuscatedName("an")
	public synchronized void method2620(int var1) {
		if (var1 == 0) { // L: 156
			this.method2611(0); // L: 157
			this.remove(); // L: 158
		} else if (this.field1484 == 0 && this.field1485 == 0) { // L: 161
			this.field1490 = 0; // L: 162
			this.field1480 = 0; // L: 163
			this.field1483 = 0; // L: 164
			this.remove(); // L: 165
		} else {
			int var2 = -this.field1483; // L: 168
			if (this.field1483 > var2) { // L: 169
				var2 = this.field1483;
			}

			if (-this.field1484 > var2) { // L: 170
				var2 = -this.field1484;
			}

			if (this.field1484 > var2) { // L: 171
				var2 = this.field1484;
			}

			if (-this.field1485 > var2) { // L: 172
				var2 = -this.field1485;
			}

			if (this.field1485 > var2) { // L: 173
				var2 = this.field1485;
			}

			if (var1 > var2) { // L: 174
				var1 = var2;
			}

			this.field1490 = var1; // L: 175
			this.field1480 = Integer.MIN_VALUE; // L: 176
			this.field1491 = -this.field1483 / var1; // L: 177
			this.field1492 = -this.field1484 / var1; // L: 178
			this.field1493 = -this.field1485 / var1; // L: 179
		}
	} // L: 159 166 180

	@ObfuscatedName("aj")
	public synchronized void method2621(int var1) {
		if (this.field1488 < 0) { // L: 183
			this.field1488 = -var1;
		} else {
			this.field1488 = var1; // L: 184
		}

	} // L: 185

	@ObfuscatedName("aq")
	public synchronized int method2622() {
		return this.field1488 < 0 ? -this.field1488 : this.field1488; // L: 188
	}

	@ObfuscatedName("ah")
	public boolean method2623() {
		return this.field1479 < 0 || this.field1479 >= ((RawSound)super.sound).samples.length << 8; // L: 192
	}

	@ObfuscatedName("am")
	public boolean method2624() {
		return this.field1490 != 0; // L: 196
	}

	@ObfuscatedName("ad")
	int method2607(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1490 > 0) { // L: 474
				int var6 = var2 + this.field1490; // L: 475
				if (var6 > var4) { // L: 476
					var6 = var4;
				}

				this.field1490 += var2; // L: 477
				if (this.field1488 == 256 && (this.field1479 & 255) == 0) { // L: 478
					if (PcmPlayer.PcmPlayer_stereo) { // L: 479
						var2 = method2642(0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, this.field1492, this.field1493, 0, var6, var3, this);
					} else {
						var2 = method2641(((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, this.field1491, 0, var6, var3, this); // L: 480
					}
				} else if (PcmPlayer.PcmPlayer_stereo) { // L: 483
					var2 = method2646(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, this.field1492, this.field1493, 0, var6, var3, this, this.field1488, var5);
				} else {
					var2 = method2649(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, this.field1491, 0, var6, var3, this, this.field1488, var5); // L: 484
				}

				this.field1490 -= var2; // L: 486
				if (this.field1490 != 0) { // L: 487
					return var2;
				}

				if (!this.method2632()) { // L: 488
					continue;
				}

				return var4;
			}

			if (this.field1488 == 256 && (this.field1479 & 255) == 0) { // L: 490
				if (PcmPlayer.PcmPlayer_stereo) { // L: 491
					return method2765(0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, 0, var4, var3, this);
				}

				return method2626(((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, 0, var4, var3, this); // L: 492
			}

			if (PcmPlayer.PcmPlayer_stereo) { // L: 495
				return method2638(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, 0, var4, var3, this, this.field1488, var5);
			}

			return method2739(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, 0, var4, var3, this, this.field1488, var5); // L: 496
		}
	}

	@ObfuscatedName("ai")
	int method2631(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1490 > 0) { // L: 501
				int var6 = var2 + this.field1490; // L: 502
				if (var6 > var4) { // L: 503
					var6 = var4;
				}

				this.field1490 += var2; // L: 504
				if (this.field1488 == -256 && (this.field1479 & 255) == 0) { // L: 505
					if (PcmPlayer.PcmPlayer_stereo) { // L: 506
						var2 = method2644(0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, this.field1492, this.field1493, 0, var6, var3, this);
					} else {
						var2 = method2643(((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, this.field1491, 0, var6, var3, this); // L: 507
					}
				} else if (PcmPlayer.PcmPlayer_stereo) { // L: 510
					var2 = method2663(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, this.field1492, this.field1493, 0, var6, var3, this, this.field1488, var5);
				} else {
					var2 = method2619(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, this.field1491, 0, var6, var3, this, this.field1488, var5); // L: 511
				}

				this.field1490 -= var2; // L: 513
				if (this.field1490 != 0) { // L: 514
					return var2;
				}

				if (!this.method2632()) { // L: 515
					continue;
				}

				return var4;
			}

			if (this.field1488 == -256 && (this.field1479 & 255) == 0) { // L: 517
				if (PcmPlayer.PcmPlayer_stereo) { // L: 518
					return method2636(0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, 0, var4, var3, this);
				}

				return method2605(((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, 0, var4, var3, this); // L: 519
			}

			if (PcmPlayer.PcmPlayer_stereo) { // L: 522
				return method2640(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, 0, var4, var3, this, this.field1488, var5);
			}

			return method2639(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, 0, var4, var3, this, this.field1488, var5); // L: 523
		}
	}

	@ObfuscatedName("al")
	boolean method2632() {
		int var1 = this.field1480; // L: 528
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) { // L: 531
			var3 = 0; // L: 532
			var2 = 0; // L: 533
			var1 = 0; // L: 534
		} else {
			var2 = method2669(var1, this.field1482); // L: 537
			var3 = method2603(var1, this.field1482); // L: 538
		}

		if (var1 == this.field1483 && var2 == this.field1484 && var3 == this.field1485) { // L: 540
			if (this.field1480 == Integer.MIN_VALUE) { // L: 570
				this.field1480 = 0; // L: 571
				this.field1485 = 0; // L: 572
				this.field1484 = 0; // L: 573
				this.field1483 = 0; // L: 574
				this.remove(); // L: 575
				return true; // L: 576
			} else {
				this.method2608(); // L: 578
				return false; // L: 579
			}
		} else {
			if (this.field1483 < var1) { // L: 541
				this.field1491 = 1; // L: 542
				this.field1490 = var1 - this.field1483; // L: 543
			} else if (this.field1483 > var1) { // L: 545
				this.field1491 = -1; // L: 546
				this.field1490 = this.field1483 - var1; // L: 547
			} else {
				this.field1491 = 0; // L: 549
			}

			if (this.field1484 < var2) { // L: 550
				this.field1492 = 1; // L: 551
				if (this.field1490 == 0 || this.field1490 > var2 - this.field1484) { // L: 552
					this.field1490 = var2 - this.field1484;
				}
			} else if (this.field1484 > var2) { // L: 554
				this.field1492 = -1; // L: 555
				if (this.field1490 == 0 || this.field1490 > this.field1484 - var2) { // L: 556
					this.field1490 = this.field1484 - var2;
				}
			} else {
				this.field1492 = 0; // L: 558
			}

			if (this.field1485 < var3) { // L: 559
				this.field1493 = 1; // L: 560
				if (this.field1490 == 0 || this.field1490 > var3 - this.field1485) { // L: 561
					this.field1490 = var3 - this.field1485;
				}
			} else if (this.field1485 > var3) { // L: 563
				this.field1493 = -1; // L: 564
				if (this.field1490 == 0 || this.field1490 > this.field1485 - var3) { // L: 565
					this.field1490 = this.field1485 - var3;
				}
			} else {
				this.field1493 = 0; // L: 567
			}

			return false; // L: 568
		}
	}

	@ObfuscatedName("ay")
	int vmethod2800() {
		int var1 = this.field1483 * 3 >> 6; // L: 31
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31); // L: 32
		if (this.numLoops == 0) { // L: 33
			var1 -= var1 * this.field1479 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length; // L: 34
		}

		return var1 > 255 ? 255 : var1; // L: 35
	}

	@ObfuscatedName("h")
	static int method2669(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D); // L: 23
	}

	@ObfuscatedName("v")
	static int method2603(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D); // L: 27
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)Ldj;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field1443 * 100)), var2 << 6) : null; // L: 63 64
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldf;III)Ldj;"
	)
	public static RawPcmStream method2630(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null; // L: 68 69
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILdj;)I"
	)
	static int method2626(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8; // L: 583
		var7 >>= 8; // L: 584
		var4 <<= 2; // L: 585
		if ((var5 = var3 + var7 - var2) > var6) { // L: 586
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) { // L: 587 588
			var10001 = var3++; // L: 589
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++; // L: 590
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++; // L: 591
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++; // L: 592
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) { // L: 594 595
			var10001 = var3++; // L: 596
		}

		var8.field1479 = var2 << 8; // L: 598
		return var3; // L: 599
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILdj;)I"
	)
	static int method2765(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8; // L: 603
		var9 >>= 8; // L: 604
		var5 <<= 2; // L: 605
		var6 <<= 2; // L: 606
		if ((var7 = var4 + var9 - var3) > var8) { // L: 607
			var7 = var8;
		}

		var4 <<= 1; // L: 608
		var7 <<= 1; // L: 609

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) { // L: 610 611
			var11 = var1[var3++]; // L: 612
			var10001 = var4++; // L: 613
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 614
			var2[var10001] += var11 * var6;
			var11 = var1[var3++]; // L: 615
			var10001 = var4++; // L: 616
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 617
			var2[var10001] += var11 * var6;
			var11 = var1[var3++]; // L: 618
			var10001 = var4++; // L: 619
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 620
			var2[var10001] += var11 * var6;
			var11 = var1[var3++]; // L: 621
			var10001 = var4++;
			var2[var10001] += var11 * var5; // L: 622
			var10001 = var4++; // L: 623
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) { // L: 625 626 629
			var11 = var1[var3++]; // L: 627
			var10001 = var4++; // L: 628
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field1479 = var3 << 8; // L: 631
		return var4 >> 1; // L: 632
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILdj;)I"
	)
	static int method2605(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8; // L: 636
		var7 >>= 8; // L: 637
		var4 <<= 2; // L: 638
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) { // L: 639
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) { // L: 640 641
			var10001 = var3++; // L: 642
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4; // L: 643
			var10001 = var3++; // L: 644
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++; // L: 645
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) { // L: 647 648
			var10001 = var3++; // L: 649
		}

		var8.field1479 = var2 << 8; // L: 651
		return var3; // L: 652
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILdj;)I"
	)
	static int method2636(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8; // L: 656
		var9 >>= 8; // L: 657
		var5 <<= 2; // L: 658
		var6 <<= 2; // L: 659
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) { // L: 660
			var7 = var8;
		}

		var4 <<= 1; // L: 661
		var7 <<= 1; // L: 662

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) { // L: 663 664
			var11 = var1[var3--]; // L: 665
			var10001 = var4++; // L: 666
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 667
			var2[var10001] += var11 * var6;
			var11 = var1[var3--]; // L: 668
			var10001 = var4++; // L: 669
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 670
			var2[var10001] += var11 * var6;
			var11 = var1[var3--]; // L: 671
			var10001 = var4++; // L: 672
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 673
			var2[var10001] += var11 * var6;
			var11 = var1[var3--]; // L: 674
			var10001 = var4++;
			var2[var10001] += var11 * var5; // L: 675
			var10001 = var4++; // L: 676
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) { // L: 678 679 682
			var11 = var1[var3--]; // L: 680
			var10001 = var4++; // L: 681
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field1479 = var3 << 8; // L: 684
		return var4 >> 1; // L: 685
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILdj;II)I"
	)
	static int method2739(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) { // L: 689
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) { // L: 690
			var1 = var4 >> 8; // L: 691
			var13 = var2[var1]; // L: 692
			var10001 = var5++; // L: 693
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11; // L: 694
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) { // L: 696
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) { // L: 697 698 701
			var13 = var2[var4 >> 8]; // L: 699
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6; // L: 700
		}

		var10.field1479 = var4; // L: 703
		return var5; // L: 704
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILdj;II)I"
	)
	static int method2638(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) { // L: 708
			var8 = var9;
		}

		var5 <<= 1; // L: 709

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) { // L: 710 711 717
			var1 = var4 >> 8; // L: 712
			var14 = var2[var1]; // L: 713
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14); // L: 714
			var10001 = var5++; // L: 715
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++; // L: 716
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) { // L: 719
			var8 = var9;
		}

		var8 <<= 1; // L: 720

		for (var1 = var13; var5 < var8; var4 += var12) { // L: 721 722 727
			var14 = var2[var4 >> 8]; // L: 723
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255); // L: 724
			var10001 = var5++; // L: 725
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++; // L: 726
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field1479 = var4; // L: 729
		return var5 >> 1; // L: 730
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILdj;II)I"
	)
	static int method2639(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) { // L: 734
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) { // L: 735
			var1 = var4 >> 8; // L: 736
			byte var13 = var2[var1 - 1]; // L: 737
			var10001 = var5++; // L: 738
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11; // L: 739
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) { // L: 741
			var7 = var8;
		}

		var0 = var12; // L: 742

		for (var1 = var11; var5 < var7; var4 += var1) { // L: 743 744 746
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6; // L: 745
		}

		var10.field1479 = var4; // L: 748
		return var5; // L: 749
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILdj;II)I"
	)
	static int method2640(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) { // L: 753
			var8 = var9;
		}

		var5 <<= 1; // L: 754

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) { // L: 755 756 762
			var1 = var4 >> 8; // L: 757
			byte var14 = var2[var1 - 1]; // L: 758
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8); // L: 759
			var10001 = var5++; // L: 760
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++; // L: 761
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) { // L: 764
			var8 = var9;
		}

		var8 <<= 1; // L: 765

		for (var1 = var13; var5 < var8; var4 += var12) { // L: 766 767 771
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1); // L: 768
			var10001 = var5++; // L: 769
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++; // L: 770
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field1479 = var4; // L: 773
		return var5 >> 1; // L: 774
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILdj;)I"
	)
	static int method2641(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8; // L: 778
		var8 >>= 8; // L: 779
		var4 <<= 2; // L: 780
		var5 <<= 2; // L: 781
		if ((var6 = var3 + var8 - var2) > var7) { // L: 782
			var6 = var7;
		}

		var9.field1484 += var9.field1492 * (var6 - var3); // L: 783
		var9.field1485 += var9.field1493 * (var6 - var3); // L: 784

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) { // L: 785 786 794
			var10001 = var3++; // L: 787
			var1[var10001] += var0[var2++] * var4;
			var4 += var5; // L: 788
			var10001 = var3++; // L: 789
			var1[var10001] += var0[var2++] * var4;
			var4 += var5; // L: 790
			var10001 = var3++; // L: 791
			var1[var10001] += var0[var2++] * var4;
			var4 += var5; // L: 792
			var10001 = var3++; // L: 793
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) { // L: 796 797 799
			var10001 = var3++; // L: 798
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field1483 = var4 >> 2; // L: 801
		var9.field1479 = var2 << 8; // L: 802
		return var3; // L: 803
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILdj;)I"
	)
	static int method2642(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8; // L: 807
		var11 >>= 8; // L: 808
		var5 <<= 2; // L: 809
		var6 <<= 2; // L: 810
		var7 <<= 2; // L: 811
		var8 <<= 2; // L: 812
		if ((var9 = var11 + var4 - var3) > var10) { // L: 813
			var9 = var10;
		}

		var12.field1483 += var12.field1491 * (var9 - var4); // L: 814
		var4 <<= 1; // L: 815
		var9 <<= 1; // L: 816

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) { // L: 817 818 838
			var13 = var1[var3++]; // L: 819
			var10001 = var4++; // L: 820
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 821
			var10001 = var4++; // L: 822
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 823
			var13 = var1[var3++]; // L: 824
			var10001 = var4++; // L: 825
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 826
			var10001 = var4++; // L: 827
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 828
			var13 = var1[var3++]; // L: 829
			var10001 = var4++; // L: 830
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 831
			var10001 = var4++; // L: 832
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 833
			var13 = var1[var3++]; // L: 834
			var10001 = var4++; // L: 835
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 836
			var10001 = var4++;
			var2[var10001] += var13 * var6; // L: 837
		}

		for (var9 += 6; var4 < var9; var6 += var8) { // L: 840 841 846
			var13 = var1[var3++]; // L: 842
			var10001 = var4++; // L: 843
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 844
			var10001 = var4++; // L: 845
			var2[var10001] += var13 * var6;
		}

		var12.field1484 = var5 >> 2; // L: 848
		var12.field1485 = var6 >> 2; // L: 849
		var12.field1479 = var3 << 8; // L: 850
		return var4 >> 1; // L: 851
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILdj;)I"
	)
	static int method2643(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8; // L: 855
		var8 >>= 8; // L: 856
		var4 <<= 2; // L: 857
		var5 <<= 2; // L: 858
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) { // L: 859
			var6 = var7;
		}

		var9.field1484 += var9.field1492 * (var6 - var3); // L: 860
		var9.field1485 += var9.field1493 * (var6 - var3); // L: 861

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) { // L: 862 863 871
			var10001 = var3++; // L: 864
			var1[var10001] += var0[var2--] * var4;
			var4 += var5; // L: 865
			var10001 = var3++; // L: 866
			var1[var10001] += var0[var2--] * var4;
			var4 += var5; // L: 867
			var10001 = var3++; // L: 868
			var1[var10001] += var0[var2--] * var4;
			var4 += var5; // L: 869
			var10001 = var3++; // L: 870
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) { // L: 873 874 876
			var10001 = var3++; // L: 875
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field1483 = var4 >> 2; // L: 878
		var9.field1479 = var2 << 8; // L: 879
		return var3; // L: 880
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILdj;)I"
	)
	static int method2644(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8; // L: 884
		var11 >>= 8; // L: 885
		var5 <<= 2; // L: 886
		var6 <<= 2; // L: 887
		var7 <<= 2; // L: 888
		var8 <<= 2; // L: 889
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) { // L: 890
			var9 = var10;
		}

		var12.field1483 += var12.field1491 * (var9 - var4); // L: 891
		var4 <<= 1; // L: 892
		var9 <<= 1; // L: 893

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) { // L: 894 895 915
			var13 = var1[var3--]; // L: 896
			var10001 = var4++; // L: 897
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 898
			var10001 = var4++; // L: 899
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 900
			var13 = var1[var3--]; // L: 901
			var10001 = var4++; // L: 902
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 903
			var10001 = var4++; // L: 904
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 905
			var13 = var1[var3--]; // L: 906
			var10001 = var4++; // L: 907
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 908
			var10001 = var4++; // L: 909
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 910
			var13 = var1[var3--]; // L: 911
			var10001 = var4++; // L: 912
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 913
			var10001 = var4++; // L: 914
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) { // L: 917 918 923
			var13 = var1[var3--]; // L: 919
			var10001 = var4++; // L: 920
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 921
			var10001 = var4++; // L: 922
			var2[var10001] += var13 * var6;
		}

		var12.field1484 = var5 >> 2; // L: 925
		var12.field1485 = var6 >> 2; // L: 926
		var12.field1479 = var3 << 8; // L: 927
		return var4 >> 1; // L: 928
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILdj;II)I"
	)
	static int method2649(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1484 -= var11.field1492 * var5; // L: 932
		var11.field1485 -= var11.field1493 * var5; // L: 933
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) { // L: 934
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) { // L: 935
			var1 = var4 >> 8; // L: 936
			var14 = var2[var1]; // L: 937
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6; // L: 938
			var6 += var7; // L: 939
			var4 += var12; // L: 940
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) { // L: 942
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) { // L: 943 944 948
			var14 = var2[var4 >> 8]; // L: 945
			var10001 = var5++; // L: 946
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7; // L: 947
		}

		var11.field1484 += var11.field1492 * var5; // L: 950
		var11.field1485 += var11.field1493 * var5; // L: 951
		var11.field1483 = var6; // L: 952
		var11.field1479 = var4; // L: 953
		return var5; // L: 954
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILdj;II)I"
	)
	static int method2646(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1483 -= var5 * var13.field1491; // L: 958
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) { // L: 959
			var10 = var11;
		}

		var5 <<= 1; // L: 960

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) { // L: 961 962 970
			var1 = var4 >> 8; // L: 963
			var16 = var2[var1]; // L: 964
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16); // L: 965
			var10001 = var5++; // L: 966
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8; // L: 967
			var10001 = var5++; // L: 968
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9; // L: 969
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) { // L: 972
			var10 = var11;
		}

		var10 <<= 1; // L: 973

		for (var1 = var15; var5 < var10; var4 += var14) { // L: 974 975 982
			var16 = var2[var4 >> 8]; // L: 976
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255); // L: 977
			var10001 = var5++; // L: 978
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8; // L: 979
			var10001 = var5++; // L: 980
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9; // L: 981
		}

		var5 >>= 1; // L: 984
		var13.field1483 += var13.field1491 * var5; // L: 985
		var13.field1484 = var6; // L: 986
		var13.field1485 = var7; // L: 987
		var13.field1479 = var4; // L: 988
		return var5; // L: 989
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILdj;II)I"
	)
	static int method2619(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1484 -= var11.field1492 * var5; // L: 993
		var11.field1485 -= var11.field1493 * var5; // L: 994
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) { // L: 995
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) { // L: 996
			var1 = var4 >> 8; // L: 997
			byte var14 = var2[var1 - 1]; // L: 998
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6; // L: 999
			var6 += var7; // L: 1000
			var4 += var12; // L: 1001
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) { // L: 1003
			var8 = var9;
		}

		var0 = var13; // L: 1004

		for (var1 = var12; var5 < var8; var4 += var1) { // L: 1005 1006 1009
			var10001 = var5++; // L: 1007
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7; // L: 1008
		}

		var11.field1484 += var11.field1492 * var5; // L: 1011
		var11.field1485 += var11.field1493 * var5; // L: 1012
		var11.field1483 = var6; // L: 1013
		var11.field1479 = var4; // L: 1014
		return var5; // L: 1015
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILdj;II)I"
	)
	static int method2663(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1483 -= var5 * var13.field1491; // L: 1019
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) { // L: 1020
			var10 = var11;
		}

		var5 <<= 1; // L: 1021

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) { // L: 1022 1023 1031
			var1 = var4 >> 8; // L: 1024
			byte var16 = var2[var1 - 1]; // L: 1025
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8); // L: 1026
			var10001 = var5++; // L: 1027
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8; // L: 1028
			var10001 = var5++; // L: 1029
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9; // L: 1030
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) { // L: 1033
			var10 = var11;
		}

		var10 <<= 1; // L: 1034

		for (var1 = var15; var5 < var10; var4 += var14) { // L: 1035 1036 1042
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1); // L: 1037
			var10001 = var5++; // L: 1038
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8; // L: 1039
			var10001 = var5++; // L: 1040
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9; // L: 1041
		}

		var5 >>= 1; // L: 1044
		var13.field1483 += var13.field1491 * var5; // L: 1045
		var13.field1484 = var6; // L: 1046
		var13.field1485 = var7; // L: 1047
		var13.field1479 = var4; // L: 1048
		return var5; // L: 1049
	}
}
