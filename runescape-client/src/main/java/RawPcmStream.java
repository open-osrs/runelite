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
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1489 = var1.field1408;
		this.field1488 = var2;
		this.field1480 = var3;
		this.field1482 = var4;
		this.field1479 = 0;
		this.method2608();
	}

	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1489 = var1.field1408;
		this.field1488 = var2;
		this.field1480 = var3;
		this.field1482 = 8192;
		this.field1479 = 0;
		this.method2608();
	}

	@ObfuscatedName("t")
	void method2608() {
		this.field1483 = this.field1480;
		this.field1484 = method2669(this.field1480, this.field1482);
		this.field1485 = method2603(this.field1480, this.field1482);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("p")
	protected int vmethod3927() {
		return this.field1480 == 0 && this.field1490 == 0 ? 0 : 1;
	}

	@ObfuscatedName("l")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1480 == 0 && this.field1490 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field1479 < 0) {
				if (this.field1488 <= 0) {
					this.method2617();
					this.remove();
					return;
				}

				this.field1479 = 0;
			}

			if (this.field1479 >= var7) {
				if (this.field1488 >= 0) {
					this.method2617();
					this.remove();
					return;
				}

				this.field1479 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field1489) {
					if (this.field1488 < 0) {
						var9 = this.method2631(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field1479 >= var5) {
							return;
						}

						this.field1479 = var5 + var5 - 1 - this.field1479;
						this.field1488 = -this.field1488;
					}

					while (true) {
						var9 = this.method2607(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field1479 < var6) {
							return;
						}

						this.field1479 = var6 + var6 - 1 - this.field1479;
						this.field1488 = -this.field1488;
						var9 = this.method2631(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field1479 >= var5) {
							return;
						}

						this.field1479 = var5 + var5 - 1 - this.field1479;
						this.field1488 = -this.field1488;
					}
				} else if (this.field1488 < 0) {
					while (true) {
						var9 = this.method2631(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field1479 >= var5) {
							return;
						}

						this.field1479 = var6 - 1 - (var6 - 1 - this.field1479) % var8;
					}
				} else {
					while (true) {
						var9 = this.method2607(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field1479 < var6) {
							return;
						}

						this.field1479 = var5 + (this.field1479 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field1489) {
						label127: {
							if (this.field1488 < 0) {
								var9 = this.method2631(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field1479 >= var5) {
									return;
								}

								this.field1479 = var5 + var5 - 1 - this.field1479;
								this.field1488 = -this.field1488;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method2607(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field1479 < var6) {
									return;
								}

								this.field1479 = var6 + var6 - 1 - this.field1479;
								this.field1488 = -this.field1488;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method2631(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field1479 >= var5) {
									return;
								}

								this.field1479 = var5 + var5 - 1 - this.field1479;
								this.field1488 = -this.field1488;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field1488 < 0) {
							while (true) {
								var9 = this.method2631(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field1479 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field1479) / var8;
								if (var10 >= this.numLoops) {
									this.field1479 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1479 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method2607(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field1479 < var6) {
									return;
								}

								var10 = (this.field1479 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field1479 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1479 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field1488 < 0) {
					this.method2631(var1, var9, 0, var3, 0);
					if (this.field1479 < 0) {
						this.field1479 = -1;
						this.method2617();
						this.remove();
					}
				} else {
					this.method2607(var1, var9, var7, var3, 0);
					if (this.field1479 >= var7) {
						this.field1479 = var7;
						this.method2617();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("z")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("u")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1490 > 0) {
			if (var1 >= this.field1490) {
				if (this.field1480 == Integer.MIN_VALUE) {
					this.field1480 = 0;
					this.field1485 = 0;
					this.field1484 = 0;
					this.field1483 = 0;
					this.remove();
					var1 = this.field1490;
				}

				this.field1490 = 0;
				this.method2608();
			} else {
				this.field1483 += this.field1491 * var1;
				this.field1484 += this.field1492 * var1;
				this.field1485 += this.field1493 * var1;
				this.field1490 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field1479 < 0) {
			if (this.field1488 <= 0) {
				this.method2617();
				this.remove();
				return;
			}

			this.field1479 = 0;
		}

		if (this.field1479 >= var5) {
			if (this.field1488 >= 0) {
				this.method2617();
				this.remove();
				return;
			}

			this.field1479 = var5 - 1;
		}

		this.field1479 += this.field1488 * var1;
		if (this.numLoops < 0) {
			if (!this.field1489) {
				if (this.field1488 < 0) {
					if (this.field1479 >= var3) {
						return;
					}

					this.field1479 = var4 - 1 - (var4 - 1 - this.field1479) % var6;
				} else {
					if (this.field1479 < var4) {
						return;
					}

					this.field1479 = var3 + (this.field1479 - var3) % var6;
				}

			} else {
				if (this.field1488 < 0) {
					if (this.field1479 >= var3) {
						return;
					}

					this.field1479 = var3 + var3 - 1 - this.field1479;
					this.field1488 = -this.field1488;
				}

				while (this.field1479 >= var4) {
					this.field1479 = var4 + var4 - 1 - this.field1479;
					this.field1488 = -this.field1488;
					if (this.field1479 >= var3) {
						return;
					}

					this.field1479 = var3 + var3 - 1 - this.field1479;
					this.field1488 = -this.field1488;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field1489) {
					label129: {
						if (this.field1488 < 0) {
							if (this.field1479 >= var3) {
								return;
							}

							this.field1479 = var3 + var3 - 1 - this.field1479;
							this.field1488 = -this.field1488;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field1479 < var4) {
								return;
							}

							this.field1479 = var4 + var4 - 1 - this.field1479;
							this.field1488 = -this.field1488;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field1479 >= var3) {
								return;
							}

							this.field1479 = var3 + var3 - 1 - this.field1479;
							this.field1488 = -this.field1488;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field1488 < 0) {
							if (this.field1479 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field1479) / var6;
							if (var7 >= this.numLoops) {
								this.field1479 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field1479 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field1479 < var4) {
								return;
							}

							var7 = (this.field1479 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field1479 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field1479 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field1488 < 0) {
				if (this.field1479 < 0) {
					this.field1479 = -1;
					this.method2617();
					this.remove();
				}
			} else if (this.field1479 >= var5) {
				this.field1479 = var5;
				this.method2617();
				this.remove();
			}

		}
	}

	@ObfuscatedName("e")
	public synchronized void method2610(int var1) {
		this.method2648(var1 << 6, this.method2614());
	}

	@ObfuscatedName("m")
	synchronized void method2611(int var1) {
		this.method2648(var1, this.method2614());
	}

	@ObfuscatedName("c")
	synchronized void method2648(int var1, int var2) {
		this.field1480 = var1;
		this.field1482 = var2;
		this.field1490 = 0;
		this.method2608();
	}

	@ObfuscatedName("i")
	public synchronized int method2613() {
		return this.field1480 == Integer.MIN_VALUE ? 0 : this.field1480;
	}

	@ObfuscatedName("f")
	public synchronized int method2614() {
		return this.field1482 < 0 ? -1 : this.field1482;
	}

	@ObfuscatedName("y")
	public synchronized void method2615(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field1479 = var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method2616() {
		this.field1488 = (this.field1488 ^ this.field1488 >> 31) + (this.field1488 >>> 31);
		this.field1488 = -this.field1488;
	}

	@ObfuscatedName("q")
	void method2617() {
		if (this.field1490 != 0) {
			if (this.field1480 == Integer.MIN_VALUE) {
				this.field1480 = 0;
			}

			this.field1490 = 0;
			this.method2608();
		}

	}

	@ObfuscatedName("g")
	public synchronized void method2707(int var1, int var2) {
		this.method2744(var1, var2, this.method2614());
	}

	@ObfuscatedName("o")
	public synchronized void method2744(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method2648(var2, var3);
		} else {
			int var4 = method2669(var2, var3);
			int var5 = method2603(var2, var3);
			if (var4 == this.field1484 && var5 == this.field1485) {
				this.field1490 = 0;
			} else {
				int var6 = var2 - this.field1483;
				if (this.field1483 - var2 > var6) {
					var6 = this.field1483 - var2;
				}

				if (var4 - this.field1484 > var6) {
					var6 = var4 - this.field1484;
				}

				if (this.field1484 - var4 > var6) {
					var6 = this.field1484 - var4;
				}

				if (var5 - this.field1485 > var6) {
					var6 = var5 - this.field1485;
				}

				if (this.field1485 - var5 > var6) {
					var6 = this.field1485 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field1490 = var1;
				this.field1480 = var2;
				this.field1482 = var3;
				this.field1491 = (var2 - this.field1483) / var1;
				this.field1492 = (var4 - this.field1484) / var1;
				this.field1493 = (var5 - this.field1485) / var1;
			}
		}
	}

	@ObfuscatedName("an")
	public synchronized void method2620(int var1) {
		if (var1 == 0) {
			this.method2611(0);
			this.remove();
		} else if (this.field1484 == 0 && this.field1485 == 0) {
			this.field1490 = 0;
			this.field1480 = 0;
			this.field1483 = 0;
			this.remove();
		} else {
			int var2 = -this.field1483;
			if (this.field1483 > var2) {
				var2 = this.field1483;
			}

			if (-this.field1484 > var2) {
				var2 = -this.field1484;
			}

			if (this.field1484 > var2) {
				var2 = this.field1484;
			}

			if (-this.field1485 > var2) {
				var2 = -this.field1485;
			}

			if (this.field1485 > var2) {
				var2 = this.field1485;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field1490 = var1;
			this.field1480 = Integer.MIN_VALUE;
			this.field1491 = -this.field1483 / var1;
			this.field1492 = -this.field1484 / var1;
			this.field1493 = -this.field1485 / var1;
		}
	}

	@ObfuscatedName("aj")
	public synchronized void method2621(int var1) {
		if (this.field1488 < 0) {
			this.field1488 = -var1;
		} else {
			this.field1488 = var1;
		}

	}

	@ObfuscatedName("aq")
	public synchronized int method2622() {
		return this.field1488 < 0 ? -this.field1488 : this.field1488;
	}

	@ObfuscatedName("ah")
	public boolean method2623() {
		return this.field1479 < 0 || this.field1479 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("am")
	public boolean method2624() {
		return this.field1490 != 0;
	}

	@ObfuscatedName("ad")
	int method2607(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1490 > 0) {
				int var6 = var2 + this.field1490;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1490 += var2;
				if (this.field1488 == 256 && (this.field1479 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method2642(0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, this.field1492, this.field1493, 0, var6, var3, this);
					} else {
						var2 = method2641(((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, this.field1491, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method2646(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, this.field1492, this.field1493, 0, var6, var3, this, this.field1488, var5);
				} else {
					var2 = method2649(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, this.field1491, 0, var6, var3, this, this.field1488, var5);
				}

				this.field1490 -= var2;
				if (this.field1490 != 0) {
					return var2;
				}

				if (!this.method2632()) {
					continue;
				}

				return var4;
			}

			if (this.field1488 == 256 && (this.field1479 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method2765(0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, 0, var4, var3, this);
				}

				return method2626(((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method2638(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, 0, var4, var3, this, this.field1488, var5);
			}

			return method2739(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, 0, var4, var3, this, this.field1488, var5);
		}
	}

	@ObfuscatedName("ai")
	int method2631(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1490 > 0) {
				int var6 = var2 + this.field1490;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1490 += var2;
				if (this.field1488 == -256 && (this.field1479 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method2644(0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, this.field1492, this.field1493, 0, var6, var3, this);
					} else {
						var2 = method2643(((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, this.field1491, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method2663(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, this.field1492, this.field1493, 0, var6, var3, this, this.field1488, var5);
				} else {
					var2 = method2619(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, this.field1491, 0, var6, var3, this, this.field1488, var5);
				}

				this.field1490 -= var2;
				if (this.field1490 != 0) {
					return var2;
				}

				if (!this.method2632()) {
					continue;
				}

				return var4;
			}

			if (this.field1488 == -256 && (this.field1479 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method2636(0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, 0, var4, var3, this);
				}

				return method2605(((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method2640(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1484, this.field1485, 0, var4, var3, this, this.field1488, var5);
			}

			return method2639(0, 0, ((RawSound)super.sound).samples, var1, this.field1479, var2, this.field1483, 0, var4, var3, this, this.field1488, var5);
		}
	}

	@ObfuscatedName("al")
	boolean method2632() {
		int var1 = this.field1480;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method2669(var1, this.field1482);
			var3 = method2603(var1, this.field1482);
		}

		if (var1 == this.field1483 && var2 == this.field1484 && var3 == this.field1485) {
			if (this.field1480 == Integer.MIN_VALUE) {
				this.field1480 = 0;
				this.field1485 = 0;
				this.field1484 = 0;
				this.field1483 = 0;
				this.remove();
				return true;
			} else {
				this.method2608();
				return false;
			}
		} else {
			if (this.field1483 < var1) {
				this.field1491 = 1;
				this.field1490 = var1 - this.field1483;
			} else if (this.field1483 > var1) {
				this.field1491 = -1;
				this.field1490 = this.field1483 - var1;
			} else {
				this.field1491 = 0;
			}

			if (this.field1484 < var2) {
				this.field1492 = 1;
				if (this.field1490 == 0 || this.field1490 > var2 - this.field1484) {
					this.field1490 = var2 - this.field1484;
				}
			} else if (this.field1484 > var2) {
				this.field1492 = -1;
				if (this.field1490 == 0 || this.field1490 > this.field1484 - var2) {
					this.field1490 = this.field1484 - var2;
				}
			} else {
				this.field1492 = 0;
			}

			if (this.field1485 < var3) {
				this.field1493 = 1;
				if (this.field1490 == 0 || this.field1490 > var3 - this.field1485) {
					this.field1490 = var3 - this.field1485;
				}
			} else if (this.field1485 > var3) {
				this.field1493 = -1;
				if (this.field1490 == 0 || this.field1490 > this.field1485 - var3) {
					this.field1490 = this.field1485 - var3;
				}
			} else {
				this.field1493 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ay")
	int vmethod2800() {
		int var1 = this.field1483 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field1479 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("h")
	static int method2669(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("v")
	static int method2603(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)Ldj;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field1443 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldf;III)Ldj;"
	)
	public static RawPcmStream method2630(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILdj;)I"
	)
	static int method2626(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field1479 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILdj;)I"
	)
	static int method2765(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field1479 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILdj;)I"
	)
	static int method2605(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field1479 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILdj;)I"
	)
	static int method2636(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field1479 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILdj;II)I"
	)
	static int method2739(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field1479 = var4;
		return var5;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILdj;II)I"
	)
	static int method2638(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field1479 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILdj;II)I"
	)
	static int method2639(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field1479 = var4;
		return var5;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILdj;II)I"
	)
	static int method2640(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field1479 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILdj;)I"
	)
	static int method2641(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field1484 += var9.field1492 * (var6 - var3);
		var9.field1485 += var9.field1493 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field1483 = var4 >> 2;
		var9.field1479 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILdj;)I"
	)
	static int method2642(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field1483 += var12.field1491 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field1484 = var5 >> 2;
		var12.field1485 = var6 >> 2;
		var12.field1479 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILdj;)I"
	)
	static int method2643(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field1484 += var9.field1492 * (var6 - var3);
		var9.field1485 += var9.field1493 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field1483 = var4 >> 2;
		var9.field1479 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILdj;)I"
	)
	static int method2644(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field1483 += var12.field1491 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field1484 = var5 >> 2;
		var12.field1485 = var6 >> 2;
		var12.field1479 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILdj;II)I"
	)
	static int method2649(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1484 -= var11.field1492 * var5;
		var11.field1485 -= var11.field1493 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field1484 += var11.field1492 * var5;
		var11.field1485 += var11.field1493 * var5;
		var11.field1483 = var6;
		var11.field1479 = var4;
		return var5;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILdj;II)I"
	)
	static int method2646(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1483 -= var5 * var13.field1491;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field1483 += var13.field1491 * var5;
		var13.field1484 = var6;
		var13.field1485 = var7;
		var13.field1479 = var4;
		return var5;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILdj;II)I"
	)
	static int method2619(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1484 -= var11.field1492 * var5;
		var11.field1485 -= var11.field1493 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field1484 += var11.field1492 * var5;
		var11.field1485 += var11.field1493 * var5;
		var11.field1483 = var6;
		var11.field1479 = var4;
		return var5;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILdj;II)I"
	)
	static int method2663(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1483 -= var5 * var13.field1491;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field1483 += var13.field1491 * var5;
		var13.field1484 = var6;
		var13.field1485 = var7;
		var13.field1479 = var4;
		return var5;
	}
}
