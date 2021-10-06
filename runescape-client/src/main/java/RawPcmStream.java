import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("l")
	int field332;
	@ObfuscatedName("q")
	int field326;
	@ObfuscatedName("f")
	int field321;
	@ObfuscatedName("j")
	int field322;
	@ObfuscatedName("m")
	int field323;
	@ObfuscatedName("k")
	int field324;
	@ObfuscatedName("t")
	int field325;
	@ObfuscatedName("a")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("e")
	@Export("start")
	int start;
	@ObfuscatedName("i")
	@Export("end")
	int end;
	@ObfuscatedName("y")
	boolean field329;
	@ObfuscatedName("g")
	int field320;
	@ObfuscatedName("v")
	int field331;
	@ObfuscatedName("s")
	int field330;
	@ObfuscatedName("c")
	int field319;

	@ObfuscatedSignature(
		descriptor = "(Laa;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field329 = var1.field249;
		this.field326 = var2;
		this.field321 = var3;
		this.field322 = var4;
		this.field332 = 0;
		this.method795();
	}

	@ObfuscatedSignature(
		descriptor = "(Laa;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field329 = var1.field249;
		this.field326 = var2;
		this.field321 = var3;
		this.field322 = 8192;
		this.field332 = 0;
		this.method795();
	}

	@ObfuscatedName("m")
	void method795() {
		this.field323 = this.field321;
		this.field324 = method865(this.field321, this.field322);
		this.field325 = method790(this.field321, this.field322);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("a")
	protected int vmethod4889() {
		return this.field321 == 0 && this.field320 == 0 ? 0 : 1;
	}

	@ObfuscatedName("e")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field321 == 0 && this.field320 == 0) {
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
			if (this.field332 < 0) {
				if (this.field326 <= 0) {
					this.method804();
					this.remove();
					return;
				}

				this.field332 = 0;
			}

			if (this.field332 >= var7) {
				if (this.field326 >= 0) {
					this.method804();
					this.remove();
					return;
				}

				this.field332 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field329) {
					if (this.field326 < 0) {
						var9 = this.method818(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field332 >= var5) {
							return;
						}

						this.field332 = var5 + var5 - 1 - this.field332;
						this.field326 = -this.field326;
					}

					while (true) {
						var9 = this.method885(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field332 < var6) {
							return;
						}

						this.field332 = var6 + var6 - 1 - this.field332;
						this.field326 = -this.field326;
						var9 = this.method818(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field332 >= var5) {
							return;
						}

						this.field332 = var5 + var5 - 1 - this.field332;
						this.field326 = -this.field326;
					}
				} else if (this.field326 < 0) {
					while (true) {
						var9 = this.method818(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field332 >= var5) {
							return;
						}

						this.field332 = var6 - 1 - (var6 - 1 - this.field332) % var8;
					}
				} else {
					while (true) {
						var9 = this.method885(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field332 < var6) {
							return;
						}

						this.field332 = var5 + (this.field332 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field329) {
						label127: {
							if (this.field326 < 0) {
								var9 = this.method818(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field332 >= var5) {
									return;
								}

								this.field332 = var5 + var5 - 1 - this.field332;
								this.field326 = -this.field326;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method885(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field332 < var6) {
									return;
								}

								this.field332 = var6 + var6 - 1 - this.field332;
								this.field326 = -this.field326;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method818(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field332 >= var5) {
									return;
								}

								this.field332 = var5 + var5 - 1 - this.field332;
								this.field326 = -this.field326;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field326 < 0) {
							while (true) {
								var9 = this.method818(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field332 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field332) / var8;
								if (var10 >= this.numLoops) {
									this.field332 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field332 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method885(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field332 < var6) {
									return;
								}

								var10 = (this.field332 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field332 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field332 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field326 < 0) {
					this.method818(var1, var9, 0, var3, 0);
					if (this.field332 < 0) {
						this.field332 = -1;
						this.method804();
						this.remove();
					}
				} else {
					this.method885(var1, var9, var7, var3, 0);
					if (this.field332 >= var7) {
						this.field332 = var7;
						this.method804();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("i")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("y")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field320 > 0) {
			if (var1 >= this.field320) {
				if (this.field321 == Integer.MIN_VALUE) {
					this.field321 = 0;
					this.field325 = 0;
					this.field324 = 0;
					this.field323 = 0;
					this.remove();
					var1 = this.field320;
				}

				this.field320 = 0;
				this.method795();
			} else {
				this.field323 += this.field331 * var1;
				this.field324 += this.field330 * var1;
				this.field325 += this.field319 * var1;
				this.field320 -= var1;
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

		if (this.field332 < 0) {
			if (this.field326 <= 0) {
				this.method804();
				this.remove();
				return;
			}

			this.field332 = 0;
		}

		if (this.field332 >= var5) {
			if (this.field326 >= 0) {
				this.method804();
				this.remove();
				return;
			}

			this.field332 = var5 - 1;
		}

		this.field332 += this.field326 * var1;
		if (this.numLoops < 0) {
			if (!this.field329) {
				if (this.field326 < 0) {
					if (this.field332 >= var3) {
						return;
					}

					this.field332 = var4 - 1 - (var4 - 1 - this.field332) % var6;
				} else {
					if (this.field332 < var4) {
						return;
					}

					this.field332 = var3 + (this.field332 - var3) % var6;
				}

			} else {
				if (this.field326 < 0) {
					if (this.field332 >= var3) {
						return;
					}

					this.field332 = var3 + var3 - 1 - this.field332;
					this.field326 = -this.field326;
				}

				while (this.field332 >= var4) {
					this.field332 = var4 + var4 - 1 - this.field332;
					this.field326 = -this.field326;
					if (this.field332 >= var3) {
						return;
					}

					this.field332 = var3 + var3 - 1 - this.field332;
					this.field326 = -this.field326;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field329) {
					label129: {
						if (this.field326 < 0) {
							if (this.field332 >= var3) {
								return;
							}

							this.field332 = var3 + var3 - 1 - this.field332;
							this.field326 = -this.field326;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field332 < var4) {
								return;
							}

							this.field332 = var4 + var4 - 1 - this.field332;
							this.field326 = -this.field326;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field332 >= var3) {
								return;
							}

							this.field332 = var3 + var3 - 1 - this.field332;
							this.field326 = -this.field326;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field326 < 0) {
							if (this.field332 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field332) / var6;
							if (var7 >= this.numLoops) {
								this.field332 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field332 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field332 < var4) {
								return;
							}

							var7 = (this.field332 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field332 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field332 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field326 < 0) {
				if (this.field332 < 0) {
					this.field332 = -1;
					this.method804();
					this.remove();
				}
			} else if (this.field332 >= var5) {
				this.field332 = var5;
				this.method804();
				this.remove();
			}

		}
	}

	@ObfuscatedName("w")
	public synchronized void method891(int var1) {
		this.method799(var1 << 6, this.method801());
	}

	@ObfuscatedName("g")
	synchronized void method884(int var1) {
		this.method799(var1, this.method801());
	}

	@ObfuscatedName("v")
	synchronized void method799(int var1, int var2) {
		this.field321 = var1;
		this.field322 = var2;
		this.field320 = 0;
		this.method795();
	}

	@ObfuscatedName("s")
	public synchronized int method852() {
		return this.field321 == Integer.MIN_VALUE ? 0 : this.field321;
	}

	@ObfuscatedName("c")
	public synchronized int method801() {
		return this.field322 < 0 ? -1 : this.field322;
	}

	@ObfuscatedName("b")
	public synchronized void method839(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field332 = var1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method803() {
		this.field326 = (this.field326 ^ this.field326 >> 31) + (this.field326 >>> 31);
		this.field326 = -this.field326;
	}

	@ObfuscatedName("p")
	void method804() {
		if (this.field320 != 0) {
			if (this.field321 == Integer.MIN_VALUE) {
				this.field321 = 0;
			}

			this.field320 = 0;
			this.method795();
		}

	}

	@ObfuscatedName("z")
	public synchronized void method805(int var1, int var2) {
		this.method806(var1, var2, this.method801());
	}

	@ObfuscatedName("h")
	public synchronized void method806(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method799(var2, var3);
		} else {
			int var4 = method865(var2, var3);
			int var5 = method790(var2, var3);
			if (var4 == this.field324 && var5 == this.field325) {
				this.field320 = 0;
			} else {
				int var6 = var2 - this.field323;
				if (this.field323 - var2 > var6) {
					var6 = this.field323 - var2;
				}

				if (var4 - this.field324 > var6) {
					var6 = var4 - this.field324;
				}

				if (this.field324 - var4 > var6) {
					var6 = this.field324 - var4;
				}

				if (var5 - this.field325 > var6) {
					var6 = var5 - this.field325;
				}

				if (this.field325 - var5 > var6) {
					var6 = this.field325 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field320 = var1;
				this.field321 = var2;
				this.field322 = var3;
				this.field331 = (var2 - this.field323) / var1;
				this.field330 = (var4 - this.field324) / var1;
				this.field319 = (var5 - this.field325) / var1;
			}
		}
	}

	@ObfuscatedName("o")
	public synchronized void method807(int var1) {
		if (var1 == 0) {
			this.method884(0);
			this.remove();
		} else if (this.field324 == 0 && this.field325 == 0) {
			this.field320 = 0;
			this.field321 = 0;
			this.field323 = 0;
			this.remove();
		} else {
			int var2 = -this.field323;
			if (this.field323 > var2) {
				var2 = this.field323;
			}

			if (-this.field324 > var2) {
				var2 = -this.field324;
			}

			if (this.field324 > var2) {
				var2 = this.field324;
			}

			if (-this.field325 > var2) {
				var2 = -this.field325;
			}

			if (this.field325 > var2) {
				var2 = this.field325;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field320 = var1;
			this.field321 = Integer.MIN_VALUE;
			this.field331 = -this.field323 / var1;
			this.field330 = -this.field324 / var1;
			this.field319 = -this.field325 / var1;
		}
	}

	@ObfuscatedName("r")
	public synchronized void method808(int var1) {
		if (this.field326 < 0) {
			this.field326 = -var1;
		} else {
			this.field326 = var1;
		}

	}

	@ObfuscatedName("n")
	public synchronized int method797() {
		return this.field326 < 0 ? -this.field326 : this.field326;
	}

	@ObfuscatedName("u")
	public boolean method810() {
		return this.field332 < 0 || this.field332 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ah")
	public boolean method920() {
		return this.field320 != 0;
	}

	@ObfuscatedName("ay")
	int method885(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field320 > 0) {
				int var6 = var2 + this.field320;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field320 += var2;
				if (this.field326 == 256 && (this.field332 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method829(0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field324, this.field325, this.field330, this.field319, 0, var6, var3, this);
					} else {
						var2 = method867(((RawSound)super.sound).samples, var1, this.field332, var2, this.field323, this.field331, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method833(0, 0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field324, this.field325, this.field330, this.field319, 0, var6, var3, this, this.field326, var5);
				} else {
					var2 = method832(0, 0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field323, this.field331, 0, var6, var3, this, this.field326, var5);
				}

				this.field320 -= var2;
				if (this.field320 != 0) {
					return var2;
				}

				if (!this.method912()) {
					continue;
				}

				return var4;
			}

			if (this.field326 == 256 && (this.field332 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method821(0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field324, this.field325, 0, var4, var3, this);
				}

				return method826(((RawSound)super.sound).samples, var1, this.field332, var2, this.field323, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method825(0, 0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field324, this.field325, 0, var4, var3, this, this.field326, var5);
			}

			return method824(0, 0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field323, 0, var4, var3, this, this.field326, var5);
		}
	}

	@ObfuscatedName("al")
	int method818(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field320 > 0) {
				int var6 = var2 + this.field320;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field320 += var2;
				if (this.field326 == -256 && (this.field332 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method831(0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field324, this.field325, this.field330, this.field319, 0, var6, var3, this);
					} else {
						var2 = method830(((RawSound)super.sound).samples, var1, this.field332, var2, this.field323, this.field331, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method835(0, 0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field324, this.field325, this.field330, this.field319, 0, var6, var3, this, this.field326, var5);
				} else {
					var2 = method834(0, 0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field323, this.field331, 0, var6, var3, this, this.field326, var5);
				}

				this.field320 -= var2;
				if (this.field320 != 0) {
					return var2;
				}

				if (!this.method912()) {
					continue;
				}

				return var4;
			}

			if (this.field326 == -256 && (this.field332 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method823(0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field324, this.field325, 0, var4, var3, this);
				}

				return method909(((RawSound)super.sound).samples, var1, this.field332, var2, this.field323, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method812(0, 0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field324, this.field325, 0, var4, var3, this, this.field326, var5);
			}

			return method907(0, 0, ((RawSound)super.sound).samples, var1, this.field332, var2, this.field323, 0, var4, var3, this, this.field326, var5);
		}
	}

	@ObfuscatedName("au")
	boolean method912() {
		int var1 = this.field321;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method865(var1, this.field322);
			var3 = method790(var1, this.field322);
		}

		if (var1 == this.field323 && var2 == this.field324 && var3 == this.field325) {
			if (this.field321 == Integer.MIN_VALUE) {
				this.field321 = 0;
				this.field325 = 0;
				this.field324 = 0;
				this.field323 = 0;
				this.remove();
				return true;
			} else {
				this.method795();
				return false;
			}
		} else {
			if (this.field323 < var1) {
				this.field331 = 1;
				this.field320 = var1 - this.field323;
			} else if (this.field323 > var1) {
				this.field331 = -1;
				this.field320 = this.field323 - var1;
			} else {
				this.field331 = 0;
			}

			if (this.field324 < var2) {
				this.field330 = 1;
				if (this.field320 == 0 || this.field320 > var2 - this.field324) {
					this.field320 = var2 - this.field324;
				}
			} else if (this.field324 > var2) {
				this.field330 = -1;
				if (this.field320 == 0 || this.field320 > this.field324 - var2) {
					this.field320 = this.field324 - var2;
				}
			} else {
				this.field330 = 0;
			}

			if (this.field325 < var3) {
				this.field319 = 1;
				if (this.field320 == 0 || this.field320 > var3 - this.field325) {
					this.field320 = var3 - this.field325;
				}
			} else if (this.field325 > var3) {
				this.field319 = -1;
				if (this.field320 == 0 || this.field320 > this.field325 - var3) {
					this.field320 = this.field325 - var3;
				}
			} else {
				this.field319 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("aq")
	int vmethod944() {
		int var1 = this.field323 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field332 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("l")
	static int method865(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("q")
	static int method790(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Laa;II)Lan;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field279 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Laa;III)Lan;"
	)
	public static RawPcmStream method794(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILan;)I"
	)
	static int method826(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field332 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILan;)I"
	)
	static int method821(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field332 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILan;)I"
	)
	static int method909(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field332 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILan;)I"
	)
	static int method823(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field332 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILan;II)I"
	)
	static int method824(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field332 = var4;
		return var5;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILan;II)I"
	)
	static int method825(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field332 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILan;II)I"
	)
	static int method907(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field332 = var4;
		return var5;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILan;II)I"
	)
	static int method812(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field332 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILan;)I"
	)
	static int method867(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field324 += var9.field330 * (var6 - var3);
		var9.field325 += var9.field319 * (var6 - var3);

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

		var9.field323 = var4 >> 2;
		var9.field332 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILan;)I"
	)
	static int method829(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field323 += var12.field331 * (var9 - var4);
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

		var12.field324 = var5 >> 2;
		var12.field325 = var6 >> 2;
		var12.field332 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILan;)I"
	)
	static int method830(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field324 += var9.field330 * (var6 - var3);
		var9.field325 += var9.field319 * (var6 - var3);

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

		var9.field323 = var4 >> 2;
		var9.field332 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILan;)I"
	)
	static int method831(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field323 += var12.field331 * (var9 - var4);
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

		var12.field324 = var5 >> 2;
		var12.field325 = var6 >> 2;
		var12.field332 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILan;II)I"
	)
	static int method832(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field324 -= var11.field330 * var5;
		var11.field325 -= var11.field319 * var5;
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

		var11.field324 += var11.field330 * var5;
		var11.field325 += var11.field319 * var5;
		var11.field323 = var6;
		var11.field332 = var4;
		return var5;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILan;II)I"
	)
	static int method833(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field323 -= var5 * var13.field331;
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
		var13.field323 += var13.field331 * var5;
		var13.field324 = var6;
		var13.field325 = var7;
		var13.field332 = var4;
		return var5;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILan;II)I"
	)
	static int method834(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field324 -= var11.field330 * var5;
		var11.field325 -= var11.field319 * var5;
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

		var11.field324 += var11.field330 * var5;
		var11.field325 += var11.field319 * var5;
		var11.field323 = var6;
		var11.field332 = var4;
		return var5;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILan;II)I"
	)
	static int method835(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field323 -= var5 * var13.field331;
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
		var13.field323 += var13.field331 * var5;
		var13.field324 = var6;
		var13.field325 = var7;
		var13.field332 = var4;
		return var5;
	}
}
