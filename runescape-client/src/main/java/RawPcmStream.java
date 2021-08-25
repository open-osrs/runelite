import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("n")
	int field323;
	@ObfuscatedName("c")
	int field331;
	@ObfuscatedName("m")
	int field320;
	@ObfuscatedName("k")
	int field319;
	@ObfuscatedName("o")
	int field318;
	@ObfuscatedName("g")
	int field330;
	@ObfuscatedName("z")
	int field324;
	@ObfuscatedName("a")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("u")
	@Export("start")
	int start;
	@ObfuscatedName("e")
	@Export("end")
	int end;
	@ObfuscatedName("l")
	boolean field328;
	@ObfuscatedName("y")
	int field329;
	@ObfuscatedName("v")
	int field322;
	@ObfuscatedName("f")
	int field327;
	@ObfuscatedName("s")
	int field332;

	@ObfuscatedSignature(
		descriptor = "(Lak;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field328 = var1.field250;
		this.field331 = var2;
		this.field320 = var3;
		this.field319 = var4;
		this.field323 = 0;
		this.method809();
	}

	@ObfuscatedSignature(
		descriptor = "(Lak;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field328 = var1.field250;
		this.field331 = var2;
		this.field320 = var3;
		this.field319 = 8192;
		this.field323 = 0;
		this.method809();
	}

	@ObfuscatedName("o")
	void method809() {
		this.field318 = this.field320;
		this.field330 = method953(this.field320, this.field319);
		this.field324 = method795(this.field320, this.field319);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("a")
	protected int vmethod4836() {
		return this.field320 == 0 && this.field329 == 0 ? 0 : 1;
	}

	@ObfuscatedName("u")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field320 == 0 && this.field329 == 0) {
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
			if (this.field323 < 0) {
				if (this.field331 <= 0) {
					this.method808();
					this.remove();
					return;
				}

				this.field323 = 0;
			}

			if (this.field323 >= var7) {
				if (this.field331 >= 0) {
					this.method808();
					this.remove();
					return;
				}

				this.field323 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field328) {
					if (this.field331 < 0) {
						var9 = this.method938(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field323 >= var5) {
							return;
						}

						this.field323 = var5 + var5 - 1 - this.field323;
						this.field331 = -this.field331;
					}

					while (true) {
						var9 = this.method947(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field323 < var6) {
							return;
						}

						this.field323 = var6 + var6 - 1 - this.field323;
						this.field331 = -this.field331;
						var9 = this.method938(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field323 >= var5) {
							return;
						}

						this.field323 = var5 + var5 - 1 - this.field323;
						this.field331 = -this.field331;
					}
				} else if (this.field331 < 0) {
					while (true) {
						var9 = this.method938(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field323 >= var5) {
							return;
						}

						this.field323 = var6 - 1 - (var6 - 1 - this.field323) % var8;
					}
				} else {
					while (true) {
						var9 = this.method947(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field323 < var6) {
							return;
						}

						this.field323 = var5 + (this.field323 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field328) {
						label127: {
							if (this.field331 < 0) {
								var9 = this.method938(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field323 >= var5) {
									return;
								}

								this.field323 = var5 + var5 - 1 - this.field323;
								this.field331 = -this.field331;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method947(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field323 < var6) {
									return;
								}

								this.field323 = var6 + var6 - 1 - this.field323;
								this.field331 = -this.field331;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method938(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field323 >= var5) {
									return;
								}

								this.field323 = var5 + var5 - 1 - this.field323;
								this.field331 = -this.field331;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field331 < 0) {
							while (true) {
								var9 = this.method938(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field323 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field323) / var8;
								if (var10 >= this.numLoops) {
									this.field323 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field323 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method947(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field323 < var6) {
									return;
								}

								var10 = (this.field323 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field323 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field323 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field331 < 0) {
					this.method938(var1, var9, 0, var3, 0);
					if (this.field323 < 0) {
						this.field323 = -1;
						this.method808();
						this.remove();
					}
				} else {
					this.method947(var1, var9, var7, var3, 0);
					if (this.field323 >= var7) {
						this.field323 = var7;
						this.method808();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("e")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("l")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field329 > 0) {
			if (var1 >= this.field329) {
				if (this.field320 == Integer.MIN_VALUE) {
					this.field320 = 0;
					this.field324 = 0;
					this.field330 = 0;
					this.field318 = 0;
					this.remove();
					var1 = this.field329;
				}

				this.field329 = 0;
				this.method809();
			} else {
				this.field318 += this.field322 * var1;
				this.field330 += this.field327 * var1;
				this.field324 += this.field332 * var1;
				this.field329 -= var1;
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

		if (this.field323 < 0) {
			if (this.field331 <= 0) {
				this.method808();
				this.remove();
				return;
			}

			this.field323 = 0;
		}

		if (this.field323 >= var5) {
			if (this.field331 >= 0) {
				this.method808();
				this.remove();
				return;
			}

			this.field323 = var5 - 1;
		}

		this.field323 += this.field331 * var1;
		if (this.numLoops < 0) {
			if (!this.field328) {
				if (this.field331 < 0) {
					if (this.field323 >= var3) {
						return;
					}

					this.field323 = var4 - 1 - (var4 - 1 - this.field323) % var6;
				} else {
					if (this.field323 < var4) {
						return;
					}

					this.field323 = var3 + (this.field323 - var3) % var6;
				}

			} else {
				if (this.field331 < 0) {
					if (this.field323 >= var3) {
						return;
					}

					this.field323 = var3 + var3 - 1 - this.field323;
					this.field331 = -this.field331;
				}

				while (this.field323 >= var4) {
					this.field323 = var4 + var4 - 1 - this.field323;
					this.field331 = -this.field331;
					if (this.field323 >= var3) {
						return;
					}

					this.field323 = var3 + var3 - 1 - this.field323;
					this.field331 = -this.field331;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field328) {
					label129: {
						if (this.field331 < 0) {
							if (this.field323 >= var3) {
								return;
							}

							this.field323 = var3 + var3 - 1 - this.field323;
							this.field331 = -this.field331;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field323 < var4) {
								return;
							}

							this.field323 = var4 + var4 - 1 - this.field323;
							this.field331 = -this.field331;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field323 >= var3) {
								return;
							}

							this.field323 = var3 + var3 - 1 - this.field323;
							this.field331 = -this.field331;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field331 < 0) {
							if (this.field323 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field323) / var6;
							if (var7 >= this.numLoops) {
								this.field323 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field323 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field323 < var4) {
								return;
							}

							var7 = (this.field323 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field323 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field323 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field331 < 0) {
				if (this.field323 < 0) {
					this.field323 = -1;
					this.method808();
					this.remove();
				}
			} else if (this.field323 >= var5) {
				this.field323 = var5;
				this.method808();
				this.remove();
			}

		}
	}

	@ObfuscatedName("y")
	public synchronized void method801(int var1) {
		this.method803(var1 << 6, this.method805());
	}

	@ObfuscatedName("v")
	synchronized void method802(int var1) {
		this.method803(var1, this.method805());
	}

	@ObfuscatedName("f")
	synchronized void method803(int var1, int var2) {
		this.field320 = var1;
		this.field319 = var2;
		this.field329 = 0;
		this.method809();
	}

	@ObfuscatedName("s")
	public synchronized int method804() {
		return this.field320 == Integer.MIN_VALUE ? 0 : this.field320;
	}

	@ObfuscatedName("h")
	public synchronized int method805() {
		return this.field319 < 0 ? -1 : this.field319;
	}

	@ObfuscatedName("d")
	public synchronized void method806(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field323 = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method927() {
		this.field331 = (this.field331 ^ this.field331 >> 31) + (this.field331 >>> 31);
		this.field331 = -this.field331;
	}

	@ObfuscatedName("j")
	void method808() {
		if (this.field329 != 0) {
			if (this.field320 == Integer.MIN_VALUE) {
				this.field320 = 0;
			}

			this.field329 = 0;
			this.method809();
		}

	}

	@ObfuscatedName("x")
	public synchronized void method799(int var1, int var2) {
		this.method810(var1, var2, this.method805());
	}

	@ObfuscatedName("b")
	public synchronized void method810(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method803(var2, var3);
		} else {
			int var4 = method953(var2, var3);
			int var5 = method795(var2, var3);
			if (var4 == this.field330 && var5 == this.field324) {
				this.field329 = 0;
			} else {
				int var6 = var2 - this.field318;
				if (this.field318 - var2 > var6) {
					var6 = this.field318 - var2;
				}

				if (var4 - this.field330 > var6) {
					var6 = var4 - this.field330;
				}

				if (this.field330 - var4 > var6) {
					var6 = this.field330 - var4;
				}

				if (var5 - this.field324 > var6) {
					var6 = var5 - this.field324;
				}

				if (this.field324 - var5 > var6) {
					var6 = this.field324 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field329 = var1;
				this.field320 = var2;
				this.field319 = var3;
				this.field322 = (var2 - this.field318) / var1;
				this.field327 = (var4 - this.field330) / var1;
				this.field332 = (var5 - this.field324) / var1;
			}
		}
	}

	@ObfuscatedName("t")
	public synchronized void method811(int var1) {
		if (var1 == 0) {
			this.method802(0);
			this.remove();
		} else if (this.field330 == 0 && this.field324 == 0) {
			this.field329 = 0;
			this.field320 = 0;
			this.field318 = 0;
			this.remove();
		} else {
			int var2 = -this.field318;
			if (this.field318 > var2) {
				var2 = this.field318;
			}

			if (-this.field330 > var2) {
				var2 = -this.field330;
			}

			if (this.field330 > var2) {
				var2 = this.field330;
			}

			if (-this.field324 > var2) {
				var2 = -this.field324;
			}

			if (this.field324 > var2) {
				var2 = this.field324;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field329 = var1;
			this.field320 = Integer.MIN_VALUE;
			this.field322 = -this.field318 / var1;
			this.field327 = -this.field330 / var1;
			this.field332 = -this.field324 / var1;
		}
	}

	@ObfuscatedName("r")
	public synchronized void method833(int var1) {
		if (this.field331 < 0) {
			this.field331 = -var1;
		} else {
			this.field331 = var1;
		}

	}

	@ObfuscatedName("p")
	public synchronized int method859() {
		return this.field331 < 0 ? -this.field331 : this.field331;
	}

	@ObfuscatedName("w")
	public boolean method860() {
		return this.field323 < 0 || this.field323 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("av")
	public boolean method815() {
		return this.field329 != 0;
	}

	@ObfuscatedName("ak")
	int method947(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field329 > 0) {
				int var6 = var2 + this.field329;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field329 += var2;
				if (this.field331 == 256 && (this.field323 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method794(0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field330, this.field324, this.field327, this.field332, 0, var6, var3, this);
					} else {
						var2 = method832(((RawSound)super.sound).samples, var1, this.field323, var2, this.field318, this.field322, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method837(0, 0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field330, this.field324, this.field327, this.field332, 0, var6, var3, this, this.field331, var5);
				} else {
					var2 = method951(0, 0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field318, this.field322, 0, var6, var3, this, this.field331, var5);
				}

				this.field329 -= var2;
				if (this.field329 != 0) {
					return var2;
				}

				if (!this.method877()) {
					continue;
				}

				return var4;
			}

			if (this.field331 == 256 && (this.field323 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method897(0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field330, this.field324, 0, var4, var3, this);
				}

				return method894(((RawSound)super.sound).samples, var1, this.field323, var2, this.field318, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method829(0, 0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field330, this.field324, 0, var4, var3, this, this.field331, var5);
			}

			return method828(0, 0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field318, 0, var4, var3, this, this.field331, var5);
		}
	}

	@ObfuscatedName("an")
	int method938(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field329 > 0) {
				int var6 = var2 + this.field329;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field329 += var2;
				if (this.field331 == -256 && (this.field323 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method835(0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field330, this.field324, this.field327, this.field332, 0, var6, var3, this);
					} else {
						var2 = method834(((RawSound)super.sound).samples, var1, this.field323, var2, this.field318, this.field322, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method821(0, 0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field330, this.field324, this.field327, this.field332, 0, var6, var3, this, this.field331, var5);
				} else {
					var2 = method838(0, 0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field318, this.field322, 0, var6, var3, this, this.field331, var5);
				}

				this.field329 -= var2;
				if (this.field329 != 0) {
					return var2;
				}

				if (!this.method877()) {
					continue;
				}

				return var4;
			}

			if (this.field331 == -256 && (this.field323 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method827(0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field330, this.field324, 0, var4, var3, this);
				}

				return method826(((RawSound)super.sound).samples, var1, this.field323, var2, this.field318, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method935(0, 0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field330, this.field324, 0, var4, var3, this, this.field331, var5);
			}

			return method830(0, 0, ((RawSound)super.sound).samples, var1, this.field323, var2, this.field318, 0, var4, var3, this, this.field331, var5);
		}
	}

	@ObfuscatedName("ab")
	boolean method877() {
		int var1 = this.field320;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method953(var1, this.field319);
			var3 = method795(var1, this.field319);
		}

		if (var1 == this.field318 && var2 == this.field330 && var3 == this.field324) {
			if (this.field320 == Integer.MIN_VALUE) {
				this.field320 = 0;
				this.field324 = 0;
				this.field330 = 0;
				this.field318 = 0;
				this.remove();
				return true;
			} else {
				this.method809();
				return false;
			}
		} else {
			if (this.field318 < var1) {
				this.field322 = 1;
				this.field329 = var1 - this.field318;
			} else if (this.field318 > var1) {
				this.field322 = -1;
				this.field329 = this.field318 - var1;
			} else {
				this.field322 = 0;
			}

			if (this.field330 < var2) {
				this.field327 = 1;
				if (this.field329 == 0 || this.field329 > var2 - this.field330) {
					this.field329 = var2 - this.field330;
				}
			} else if (this.field330 > var2) {
				this.field327 = -1;
				if (this.field329 == 0 || this.field329 > this.field330 - var2) {
					this.field329 = this.field330 - var2;
				}
			} else {
				this.field327 = 0;
			}

			if (this.field324 < var3) {
				this.field332 = 1;
				if (this.field329 == 0 || this.field329 > var3 - this.field324) {
					this.field329 = var3 - this.field324;
				}
			} else if (this.field324 > var3) {
				this.field332 = -1;
				if (this.field329 == 0 || this.field329 > this.field324 - var3) {
					this.field329 = this.field324 - var3;
				}
			} else {
				this.field332 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ar")
	int vmethod972() {
		int var1 = this.field318 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field323 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("n")
	static int method953(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("c")
	static int method795(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lak;II)Laj;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class276.field3287 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lak;III)Laj;"
	)
	public static RawPcmStream method798(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILaj;)I"
	)
	static int method894(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field323 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILaj;)I"
	)
	static int method897(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field323 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILaj;)I"
	)
	static int method826(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field323 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILaj;)I"
	)
	static int method827(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field323 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILaj;II)I"
	)
	static int method828(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field323 = var4;
		return var5;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILaj;II)I"
	)
	static int method829(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field323 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILaj;II)I"
	)
	static int method830(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field323 = var4;
		return var5;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILaj;II)I"
	)
	static int method935(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field323 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILaj;)I"
	)
	static int method832(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field330 += var9.field327 * (var6 - var3);
		var9.field324 += var9.field332 * (var6 - var3);

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

		var9.field318 = var4 >> 2;
		var9.field323 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILaj;)I"
	)
	static int method794(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field318 += var12.field322 * (var9 - var4);
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

		var12.field330 = var5 >> 2;
		var12.field324 = var6 >> 2;
		var12.field323 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILaj;)I"
	)
	static int method834(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field330 += var9.field327 * (var6 - var3);
		var9.field324 += var9.field332 * (var6 - var3);

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

		var9.field318 = var4 >> 2;
		var9.field323 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILaj;)I"
	)
	static int method835(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field318 += var12.field322 * (var9 - var4);
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

		var12.field330 = var5 >> 2;
		var12.field324 = var6 >> 2;
		var12.field323 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILaj;II)I"
	)
	static int method951(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field330 -= var11.field327 * var5;
		var11.field324 -= var11.field332 * var5;
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

		var11.field330 += var11.field327 * var5;
		var11.field324 += var11.field332 * var5;
		var11.field318 = var6;
		var11.field323 = var4;
		return var5;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILaj;II)I"
	)
	static int method837(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field318 -= var5 * var13.field322;
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
		var13.field318 += var13.field322 * var5;
		var13.field330 = var6;
		var13.field324 = var7;
		var13.field323 = var4;
		return var5;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILaj;II)I"
	)
	static int method838(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field330 -= var11.field327 * var5;
		var11.field324 -= var11.field332 * var5;
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

		var11.field330 += var11.field327 * var5;
		var11.field324 += var11.field332 * var5;
		var11.field318 = var6;
		var11.field323 = var4;
		return var5;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILaj;II)I"
	)
	static int method821(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field318 -= var5 * var13.field322;
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
		var13.field318 += var13.field322 * var5;
		var13.field330 = var6;
		var13.field324 = var7;
		var13.field323 = var4;
		return var5;
	}
}
