import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("s")
	int field242;
	@ObfuscatedName("t")
	int field236;
	@ObfuscatedName("v")
	int field237;
	@ObfuscatedName("j")
	int field238;
	@ObfuscatedName("l")
	int field239;
	@ObfuscatedName("n")
	int field247;
	@ObfuscatedName("f")
	int field241;
	@ObfuscatedName("o")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("x")
	@Export("start")
	int start;
	@ObfuscatedName("r")
	@Export("end")
	int end;
	@ObfuscatedName("p")
	boolean field245;
	@ObfuscatedName("h")
	int field244;
	@ObfuscatedName("k")
	int field243;
	@ObfuscatedName("a")
	int field248;
	@ObfuscatedName("q")
	int field249;

	@ObfuscatedSignature(
		descriptor = "(Lz;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field245 = var1.field167;
		this.field236 = var2;
		this.field237 = var3;
		this.field238 = var4;
		this.field242 = 0;
		this.method555();
	}

	@ObfuscatedSignature(
		descriptor = "(Lz;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field245 = var1.field167;
		this.field236 = var2;
		this.field237 = var3;
		this.field238 = 8192;
		this.field242 = 0;
		this.method555();
	}

	@ObfuscatedName("l")
	void method555() {
		this.field239 = this.field237;
		this.field247 = method660(this.field237, this.field238);
		this.field241 = method634(this.field237, this.field238);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("f")
	protected int vmethod4662() {
		return this.field237 == 0 && this.field244 == 0 ? 0 : 1;
	}

	@ObfuscatedName("o")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field237 == 0 && this.field244 == 0) {
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
			if (this.field242 < 0) {
				if (this.field236 <= 0) {
					this.method610();
					this.remove();
					return;
				}

				this.field242 = 0;
			}

			if (this.field242 >= var7) {
				if (this.field236 >= 0) {
					this.method610();
					this.remove();
					return;
				}

				this.field242 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field245) {
					if (this.field236 < 0) {
						var9 = this.method687(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field242 >= var5) {
							return;
						}

						this.field242 = var5 + var5 - 1 - this.field242;
						this.field236 = -this.field236;
					}

					while (true) {
						var9 = this.method696(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field242 < var6) {
							return;
						}

						this.field242 = var6 + var6 - 1 - this.field242;
						this.field236 = -this.field236;
						var9 = this.method687(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field242 >= var5) {
							return;
						}

						this.field242 = var5 + var5 - 1 - this.field242;
						this.field236 = -this.field236;
					}
				} else if (this.field236 < 0) {
					while (true) {
						var9 = this.method687(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field242 >= var5) {
							return;
						}

						this.field242 = var6 - 1 - (var6 - 1 - this.field242) % var8;
					}
				} else {
					while (true) {
						var9 = this.method696(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field242 < var6) {
							return;
						}

						this.field242 = var5 + (this.field242 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field245) {
						label127: {
							if (this.field236 < 0) {
								var9 = this.method687(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field242 >= var5) {
									return;
								}

								this.field242 = var5 + var5 - 1 - this.field242;
								this.field236 = -this.field236;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method696(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field242 < var6) {
									return;
								}

								this.field242 = var6 + var6 - 1 - this.field242;
								this.field236 = -this.field236;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method687(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field242 >= var5) {
									return;
								}

								this.field242 = var5 + var5 - 1 - this.field242;
								this.field236 = -this.field236;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field236 < 0) {
							while (true) {
								var9 = this.method687(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field242 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field242) / var8;
								if (var10 >= this.numLoops) {
									this.field242 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field242 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method696(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field242 < var6) {
									return;
								}

								var10 = (this.field242 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field242 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field242 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field236 < 0) {
					this.method687(var1, var9, 0, var3, 0);
					if (this.field242 < 0) {
						this.field242 = -1;
						this.method610();
						this.remove();
					}
				} else {
					this.method696(var1, var9, var7, var3, 0);
					if (this.field242 >= var7) {
						this.field242 = var7;
						this.method610();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("x")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("r")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field244 > 0) {
			if (var1 >= this.field244) {
				if (this.field237 == Integer.MIN_VALUE) {
					this.field237 = 0;
					this.field241 = 0;
					this.field247 = 0;
					this.field239 = 0;
					this.remove();
					var1 = this.field244;
				}

				this.field244 = 0;
				this.method555();
			} else {
				this.field239 += this.field243 * var1;
				this.field247 += this.field248 * var1;
				this.field241 += this.field249 * var1;
				this.field244 -= var1;
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

		if (this.field242 < 0) {
			if (this.field236 <= 0) {
				this.method610();
				this.remove();
				return;
			}

			this.field242 = 0;
		}

		if (this.field242 >= var5) {
			if (this.field236 >= 0) {
				this.method610();
				this.remove();
				return;
			}

			this.field242 = var5 - 1;
		}

		this.field242 += this.field236 * var1;
		if (this.numLoops < 0) {
			if (!this.field245) {
				if (this.field236 < 0) {
					if (this.field242 >= var3) {
						return;
					}

					this.field242 = var4 - 1 - (var4 - 1 - this.field242) % var6;
				} else {
					if (this.field242 < var4) {
						return;
					}

					this.field242 = var3 + (this.field242 - var3) % var6;
				}

			} else {
				if (this.field236 < 0) {
					if (this.field242 >= var3) {
						return;
					}

					this.field242 = var3 + var3 - 1 - this.field242;
					this.field236 = -this.field236;
				}

				while (this.field242 >= var4) {
					this.field242 = var4 + var4 - 1 - this.field242;
					this.field236 = -this.field236;
					if (this.field242 >= var3) {
						return;
					}

					this.field242 = var3 + var3 - 1 - this.field242;
					this.field236 = -this.field236;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field245) {
					label129: {
						if (this.field236 < 0) {
							if (this.field242 >= var3) {
								return;
							}

							this.field242 = var3 + var3 - 1 - this.field242;
							this.field236 = -this.field236;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field242 < var4) {
								return;
							}

							this.field242 = var4 + var4 - 1 - this.field242;
							this.field236 = -this.field236;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field242 >= var3) {
								return;
							}

							this.field242 = var3 + var3 - 1 - this.field242;
							this.field236 = -this.field236;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field236 < 0) {
							if (this.field242 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field242) / var6;
							if (var7 >= this.numLoops) {
								this.field242 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field242 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field242 < var4) {
								return;
							}

							var7 = (this.field242 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field242 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field242 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field236 < 0) {
				if (this.field242 < 0) {
					this.field242 = -1;
					this.method610();
					this.remove();
				}
			} else if (this.field242 >= var5) {
				this.field242 = var5;
				this.method610();
				this.remove();
			}

		}
	}

	@ObfuscatedName("p")
	public synchronized void method557(int var1) {
		this.method559(var1 << 6, this.method561());
	}

	@ObfuscatedName("h")
	synchronized void method558(int var1) {
		this.method559(var1, this.method561());
	}

	@ObfuscatedName("k")
	synchronized void method559(int var1, int var2) {
		this.field237 = var1;
		this.field238 = var2;
		this.field244 = 0;
		this.method555();
	}

	@ObfuscatedName("a")
	public synchronized int method560() {
		return this.field237 == Integer.MIN_VALUE ? 0 : this.field237;
	}

	@ObfuscatedName("q")
	public synchronized int method561() {
		return this.field238 < 0 ? -1 : this.field238;
	}

	@ObfuscatedName("u")
	public synchronized void method562(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field242 = var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method563() {
		this.field236 = (this.field236 ^ this.field236 >> 31) + (this.field236 >>> 31);
		this.field236 = -this.field236;
	}

	@ObfuscatedName("c")
	void method610() {
		if (this.field244 != 0) {
			if (this.field237 == Integer.MIN_VALUE) {
				this.field237 = 0;
			}

			this.field244 = 0;
			this.method555();
		}

	}

	@ObfuscatedName("i")
	public synchronized void method565(int var1, int var2) {
		this.method566(var1, var2, this.method561());
	}

	@ObfuscatedName("m")
	public synchronized void method566(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method559(var2, var3);
		} else {
			int var4 = method660(var2, var3);
			int var5 = method634(var2, var3);
			if (var4 == this.field247 && var5 == this.field241) {
				this.field244 = 0;
			} else {
				int var6 = var2 - this.field239;
				if (this.field239 - var2 > var6) {
					var6 = this.field239 - var2;
				}

				if (var4 - this.field247 > var6) {
					var6 = var4 - this.field247;
				}

				if (this.field247 - var4 > var6) {
					var6 = this.field247 - var4;
				}

				if (var5 - this.field241 > var6) {
					var6 = var5 - this.field241;
				}

				if (this.field241 - var5 > var6) {
					var6 = this.field241 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field244 = var1;
				this.field237 = var2;
				this.field238 = var3;
				this.field243 = (var2 - this.field239) / var1;
				this.field248 = (var4 - this.field247) / var1;
				this.field249 = (var5 - this.field241) / var1;
			}
		}
	}

	@ObfuscatedName("b")
	public synchronized void method567(int var1) {
		if (var1 == 0) {
			this.method558(0);
			this.remove();
		} else if (this.field247 == 0 && this.field241 == 0) {
			this.field244 = 0;
			this.field237 = 0;
			this.field239 = 0;
			this.remove();
		} else {
			int var2 = -this.field239;
			if (this.field239 > var2) {
				var2 = this.field239;
			}

			if (-this.field247 > var2) {
				var2 = -this.field247;
			}

			if (this.field247 > var2) {
				var2 = this.field247;
			}

			if (-this.field241 > var2) {
				var2 = -this.field241;
			}

			if (this.field241 > var2) {
				var2 = this.field241;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field244 = var1;
			this.field237 = Integer.MIN_VALUE;
			this.field243 = -this.field239 / var1;
			this.field248 = -this.field247 / var1;
			this.field249 = -this.field241 / var1;
		}
	}

	@ObfuscatedName("z")
	public synchronized void method568(int var1) {
		if (this.field236 < 0) {
			this.field236 = -var1;
		} else {
			this.field236 = var1;
		}

	}

	@ObfuscatedName("d")
	public synchronized int method569() {
		return this.field236 < 0 ? -this.field236 : this.field236;
	}

	@ObfuscatedName("y")
	public boolean method623() {
		return this.field242 < 0 || this.field242 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("av")
	public boolean method571() {
		return this.field244 != 0;
	}

	@ObfuscatedName("az")
	int method696(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field244 > 0) {
				int var6 = var2 + this.field244;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field244 += var2;
				if (this.field236 == 256 && (this.field242 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method589(0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field247, this.field241, this.field248, this.field249, 0, var6, var3, this);
					} else {
						var2 = method588(((RawSound)super.sound).samples, var1, this.field242, var2, this.field239, this.field243, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method593(0, 0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field247, this.field241, this.field248, this.field249, 0, var6, var3, this, this.field236, var5);
				} else {
					var2 = method592(0, 0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field239, this.field243, 0, var6, var3, this, this.field236, var5);
				}

				this.field244 -= var2;
				if (this.field244 != 0) {
					return var2;
				}

				if (!this.method579()) {
					continue;
				}

				return var4;
			}

			if (this.field236 == 256 && (this.field242 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method581(0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field247, this.field241, 0, var4, var3, this);
				}

				return method580(((RawSound)super.sound).samples, var1, this.field242, var2, this.field239, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method585(0, 0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field247, this.field241, 0, var4, var3, this, this.field236, var5);
			}

			return method584(0, 0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field239, 0, var4, var3, this, this.field236, var5);
		}
	}

	@ObfuscatedName("ak")
	int vmethod716() {
		int var1 = this.field239 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field242 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("aj")
	int method687(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field244 > 0) {
				int var6 = var2 + this.field244;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field244 += var2;
				if (this.field236 == -256 && (this.field242 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method591(0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field247, this.field241, this.field248, this.field249, 0, var6, var3, this);
					} else {
						var2 = method590(((RawSound)super.sound).samples, var1, this.field242, var2, this.field239, this.field243, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method553(0, 0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field247, this.field241, this.field248, this.field249, 0, var6, var3, this, this.field236, var5);
				} else {
					var2 = method594(0, 0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field239, this.field243, 0, var6, var3, this, this.field236, var5);
				}

				this.field244 -= var2;
				if (this.field244 != 0) {
					return var2;
				}

				if (!this.method579()) {
					continue;
				}

				return var4;
			}

			if (this.field236 == -256 && (this.field242 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method583(0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field247, this.field241, 0, var4, var3, this);
				}

				return method655(((RawSound)super.sound).samples, var1, this.field242, var2, this.field239, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method587(0, 0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field247, this.field241, 0, var4, var3, this, this.field236, var5);
			}

			return method586(0, 0, ((RawSound)super.sound).samples, var1, this.field242, var2, this.field239, 0, var4, var3, this, this.field236, var5);
		}
	}

	@ObfuscatedName("at")
	boolean method579() {
		int var1 = this.field237;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method660(var1, this.field238);
			var3 = method634(var1, this.field238);
		}

		if (var1 == this.field239 && var2 == this.field247 && var3 == this.field241) {
			if (this.field237 == Integer.MIN_VALUE) {
				this.field237 = 0;
				this.field241 = 0;
				this.field247 = 0;
				this.field239 = 0;
				this.remove();
				return true;
			} else {
				this.method555();
				return false;
			}
		} else {
			if (this.field239 < var1) {
				this.field243 = 1;
				this.field244 = var1 - this.field239;
			} else if (this.field239 > var1) {
				this.field243 = -1;
				this.field244 = this.field239 - var1;
			} else {
				this.field243 = 0;
			}

			if (this.field247 < var2) {
				this.field248 = 1;
				if (this.field244 == 0 || this.field244 > var2 - this.field247) {
					this.field244 = var2 - this.field247;
				}
			} else if (this.field247 > var2) {
				this.field248 = -1;
				if (this.field244 == 0 || this.field244 > this.field247 - var2) {
					this.field244 = this.field247 - var2;
				}
			} else {
				this.field248 = 0;
			}

			if (this.field241 < var3) {
				this.field249 = 1;
				if (this.field244 == 0 || this.field244 > var3 - this.field241) {
					this.field244 = var3 - this.field241;
				}
			} else if (this.field241 > var3) {
				this.field249 = -1;
				if (this.field244 == 0 || this.field244 > this.field241 - var3) {
					this.field244 = this.field241 - var3;
				}
			} else {
				this.field249 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("s")
	static int method660(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("t")
	static int method634(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lz;II)Lal;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(GrandExchangeOfferAgeComparator.field3633 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lz;III)Lal;"
	)
	public static RawPcmStream method554(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILal;)I"
	)
	static int method580(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field242 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILal;)I"
	)
	static int method581(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field242 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILal;)I"
	)
	static int method655(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field242 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILal;)I"
	)
	static int method583(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field242 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILal;II)I"
	)
	static int method584(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field242 = var4;
		return var5;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILal;II)I"
	)
	static int method585(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field242 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILal;II)I"
	)
	static int method586(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field242 = var4;
		return var5;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILal;II)I"
	)
	static int method587(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field242 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILal;)I"
	)
	static int method588(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field247 += var9.field248 * (var6 - var3);
		var9.field241 += var9.field249 * (var6 - var3);

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

		var9.field239 = var4 >> 2;
		var9.field242 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILal;)I"
	)
	static int method589(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field239 += var12.field243 * (var9 - var4);
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

		var12.field247 = var5 >> 2;
		var12.field241 = var6 >> 2;
		var12.field242 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILal;)I"
	)
	static int method590(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field247 += var9.field248 * (var6 - var3);
		var9.field241 += var9.field249 * (var6 - var3);

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

		var9.field239 = var4 >> 2;
		var9.field242 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILal;)I"
	)
	static int method591(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field239 += var12.field243 * (var9 - var4);
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

		var12.field247 = var5 >> 2;
		var12.field241 = var6 >> 2;
		var12.field242 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILal;II)I"
	)
	static int method592(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field247 -= var11.field248 * var5;
		var11.field241 -= var11.field249 * var5;
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

		var11.field247 += var11.field248 * var5;
		var11.field241 += var11.field249 * var5;
		var11.field239 = var6;
		var11.field242 = var4;
		return var5;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILal;II)I"
	)
	static int method593(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field239 -= var5 * var13.field243;
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
		var13.field239 += var13.field243 * var5;
		var13.field247 = var6;
		var13.field241 = var7;
		var13.field242 = var4;
		return var5;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILal;II)I"
	)
	static int method594(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field247 -= var11.field248 * var5;
		var11.field241 -= var11.field249 * var5;
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

		var11.field247 += var11.field248 * var5;
		var11.field241 += var11.field249 * var5;
		var11.field239 = var6;
		var11.field242 = var4;
		return var5;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILal;II)I"
	)
	static int method553(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field239 -= var5 * var13.field243;
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
		var13.field239 += var13.field243 * var5;
		var13.field247 = var6;
		var13.field241 = var7;
		var13.field242 = var4;
		return var5;
	}
}
