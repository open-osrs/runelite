import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("c")
	int field335;
	@ObfuscatedName("b")
	int field334;
	@ObfuscatedName("p")
	int field331;
	@ObfuscatedName("m")
	int field332;
	@ObfuscatedName("t")
	int field333;
	@ObfuscatedName("s")
	int field340;
	@ObfuscatedName("j")
	int field336;
	@ObfuscatedName("n")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("r")
	@Export("start")
	int start;
	@ObfuscatedName("o")
	@Export("end")
	int end;
	@ObfuscatedName("v")
	boolean field339;
	@ObfuscatedName("d")
	int field329;
	@ObfuscatedName("h")
	int field341;
	@ObfuscatedName("g")
	int field342;
	@ObfuscatedName("e")
	int field343;

	@ObfuscatedSignature(
		descriptor = "(Laj;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field339 = var1.field265;
		this.field334 = var2;
		this.field331 = var3;
		this.field332 = var4;
		this.field335 = 0;
		this.method841();
	}

	@ObfuscatedSignature(
		descriptor = "(Laj;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field339 = var1.field265;
		this.field334 = var2;
		this.field331 = var3;
		this.field332 = 8192;
		this.field335 = 0;
		this.method841();
	}

	@ObfuscatedName("t")
	void method841() {
		this.field333 = this.field331;
		this.field340 = method967(this.field331, this.field332);
		this.field336 = method836(this.field331, this.field332);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("w")
	protected int vmethod5260() {
		return this.field331 == 0 && this.field329 == 0 ? 0 : 1;
	}

	@ObfuscatedName("n")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field331 == 0 && this.field329 == 0) {
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
			if (this.field335 < 0) {
				if (this.field334 <= 0) {
					this.method850();
					this.remove();
					return;
				}

				this.field335 = 0;
			}

			if (this.field335 >= var7) {
				if (this.field334 >= 0) {
					this.method850();
					this.remove();
					return;
				}

				this.field335 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field339) {
					if (this.field334 < 0) {
						var9 = this.method864(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field335 >= var5) {
							return;
						}

						this.field335 = var5 + var5 - 1 - this.field335;
						this.field334 = -this.field334;
					}

					while (true) {
						var9 = this.method889(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field335 < var6) {
							return;
						}

						this.field335 = var6 + var6 - 1 - this.field335;
						this.field334 = -this.field334;
						var9 = this.method864(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field335 >= var5) {
							return;
						}

						this.field335 = var5 + var5 - 1 - this.field335;
						this.field334 = -this.field334;
					}
				} else if (this.field334 < 0) {
					while (true) {
						var9 = this.method864(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field335 >= var5) {
							return;
						}

						this.field335 = var6 - 1 - (var6 - 1 - this.field335) % var8;
					}
				} else {
					while (true) {
						var9 = this.method889(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field335 < var6) {
							return;
						}

						this.field335 = var5 + (this.field335 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field339) {
						label127: {
							if (this.field334 < 0) {
								var9 = this.method864(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field335 >= var5) {
									return;
								}

								this.field335 = var5 + var5 - 1 - this.field335;
								this.field334 = -this.field334;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method889(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field335 < var6) {
									return;
								}

								this.field335 = var6 + var6 - 1 - this.field335;
								this.field334 = -this.field334;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method864(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field335 >= var5) {
									return;
								}

								this.field335 = var5 + var5 - 1 - this.field335;
								this.field334 = -this.field334;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field334 < 0) {
							while (true) {
								var9 = this.method864(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field335 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field335) / var8;
								if (var10 >= this.numLoops) {
									this.field335 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field335 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method889(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field335 < var6) {
									return;
								}

								var10 = (this.field335 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field335 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field335 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field334 < 0) {
					this.method864(var1, var9, 0, var3, 0);
					if (this.field335 < 0) {
						this.field335 = -1;
						this.method850();
						this.remove();
					}
				} else {
					this.method889(var1, var9, var7, var3, 0);
					if (this.field335 >= var7) {
						this.field335 = var7;
						this.method850();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("r")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("o")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field329 > 0) {
			if (var1 >= this.field329) {
				if (this.field331 == Integer.MIN_VALUE) {
					this.field331 = 0;
					this.field336 = 0;
					this.field340 = 0;
					this.field333 = 0;
					this.remove();
					var1 = this.field329;
				}

				this.field329 = 0;
				this.method841();
			} else {
				this.field333 += this.field341 * var1;
				this.field340 += this.field342 * var1;
				this.field336 += this.field343 * var1;
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

		if (this.field335 < 0) {
			if (this.field334 <= 0) {
				this.method850();
				this.remove();
				return;
			}

			this.field335 = 0;
		}

		if (this.field335 >= var5) {
			if (this.field334 >= 0) {
				this.method850();
				this.remove();
				return;
			}

			this.field335 = var5 - 1;
		}

		this.field335 += this.field334 * var1;
		if (this.numLoops < 0) {
			if (!this.field339) {
				if (this.field334 < 0) {
					if (this.field335 >= var3) {
						return;
					}

					this.field335 = var4 - 1 - (var4 - 1 - this.field335) % var6;
				} else {
					if (this.field335 < var4) {
						return;
					}

					this.field335 = var3 + (this.field335 - var3) % var6;
				}

			} else {
				if (this.field334 < 0) {
					if (this.field335 >= var3) {
						return;
					}

					this.field335 = var3 + var3 - 1 - this.field335;
					this.field334 = -this.field334;
				}

				while (this.field335 >= var4) {
					this.field335 = var4 + var4 - 1 - this.field335;
					this.field334 = -this.field334;
					if (this.field335 >= var3) {
						return;
					}

					this.field335 = var3 + var3 - 1 - this.field335;
					this.field334 = -this.field334;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field339) {
					label129: {
						if (this.field334 < 0) {
							if (this.field335 >= var3) {
								return;
							}

							this.field335 = var3 + var3 - 1 - this.field335;
							this.field334 = -this.field334;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field335 < var4) {
								return;
							}

							this.field335 = var4 + var4 - 1 - this.field335;
							this.field334 = -this.field334;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field335 >= var3) {
								return;
							}

							this.field335 = var3 + var3 - 1 - this.field335;
							this.field334 = -this.field334;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field334 < 0) {
							if (this.field335 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field335) / var6;
							if (var7 >= this.numLoops) {
								this.field335 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field335 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field335 < var4) {
								return;
							}

							var7 = (this.field335 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field335 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field335 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field334 < 0) {
				if (this.field335 < 0) {
					this.field335 = -1;
					this.method850();
					this.remove();
				}
			} else if (this.field335 >= var5) {
				this.field335 = var5;
				this.method850();
				this.remove();
			}

		}
	}

	@ObfuscatedName("v")
	public synchronized void method843(int var1) {
		this.method899(var1 << 6, this.method847());
	}

	@ObfuscatedName("d")
	synchronized void method837(int var1) {
		this.method899(var1, this.method847());
	}

	@ObfuscatedName("h")
	synchronized void method899(int var1, int var2) {
		this.field331 = var1;
		this.field332 = var2;
		this.field329 = 0;
		this.method841();
	}

	@ObfuscatedName("g")
	public synchronized int method862() {
		return this.field331 == Integer.MIN_VALUE ? 0 : this.field331;
	}

	@ObfuscatedName("e")
	public synchronized int method847() {
		return this.field332 < 0 ? -1 : this.field332;
	}

	@ObfuscatedName("a")
	public synchronized void method848(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field335 = var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method925() {
		this.field334 = (this.field334 ^ this.field334 >> 31) + (this.field334 >>> 31);
		this.field334 = -this.field334;
	}

	@ObfuscatedName("k")
	void method850() {
		if (this.field329 != 0) {
			if (this.field331 == Integer.MIN_VALUE) {
				this.field331 = 0;
			}

			this.field329 = 0;
			this.method841();
		}

	}

	@ObfuscatedName("f")
	public synchronized void method851(int var1, int var2) {
		this.method932(var1, var2, this.method847());
	}

	@ObfuscatedName("l")
	public synchronized void method932(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method899(var2, var3);
		} else {
			int var4 = method967(var2, var3);
			int var5 = method836(var2, var3);
			if (var4 == this.field340 && var5 == this.field336) {
				this.field329 = 0;
			} else {
				int var6 = var2 - this.field333;
				if (this.field333 - var2 > var6) {
					var6 = this.field333 - var2;
				}

				if (var4 - this.field340 > var6) {
					var6 = var4 - this.field340;
				}

				if (this.field340 - var4 > var6) {
					var6 = this.field340 - var4;
				}

				if (var5 - this.field336 > var6) {
					var6 = var5 - this.field336;
				}

				if (this.field336 - var5 > var6) {
					var6 = this.field336 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field329 = var1;
				this.field331 = var2;
				this.field332 = var3;
				this.field341 = (var2 - this.field333) / var1;
				this.field342 = (var4 - this.field340) / var1;
				this.field343 = (var5 - this.field336) / var1;
			}
		}
	}

	@ObfuscatedName("q")
	public synchronized void method954(int var1) {
		if (var1 == 0) {
			this.method837(0);
			this.remove();
		} else if (this.field340 == 0 && this.field336 == 0) {
			this.field329 = 0;
			this.field331 = 0;
			this.field333 = 0;
			this.remove();
		} else {
			int var2 = -this.field333;
			if (this.field333 > var2) {
				var2 = this.field333;
			}

			if (-this.field340 > var2) {
				var2 = -this.field340;
			}

			if (this.field340 > var2) {
				var2 = this.field340;
			}

			if (-this.field336 > var2) {
				var2 = -this.field336;
			}

			if (this.field336 > var2) {
				var2 = this.field336;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field329 = var1;
			this.field331 = Integer.MIN_VALUE;
			this.field341 = -this.field333 / var1;
			this.field342 = -this.field340 / var1;
			this.field343 = -this.field336 / var1;
		}
	}

	@ObfuscatedName("x")
	public synchronized void method963(int var1) {
		if (this.field334 < 0) {
			this.field334 = -var1;
		} else {
			this.field334 = var1;
		}

	}

	@ObfuscatedName("ax")
	public synchronized int method855() {
		return this.field334 < 0 ? -this.field334 : this.field334;
	}

	@ObfuscatedName("am")
	public boolean method854() {
		return this.field335 < 0 || this.field335 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("au")
	public boolean method857() {
		return this.field329 != 0;
	}

	@ObfuscatedName("ac")
	int vmethod991() {
		int var1 = this.field333 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field335 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("aj")
	int method889(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field329 > 0) {
				int var6 = var2 + this.field329;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field329 += var2;
				if (this.field334 == 256 && (this.field335 & 255) == 0) {
					if (SpriteMask.PcmPlayer_stereo) {
						var2 = method875(0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field340, this.field336, this.field342, this.field343, 0, var6, var3, this);
					} else {
						var2 = method874(((RawSound)super.sound).samples, var1, this.field335, var2, this.field333, this.field341, 0, var6, var3, this);
					}
				} else if (SpriteMask.PcmPlayer_stereo) {
					var2 = method879(0, 0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field340, this.field336, this.field342, this.field343, 0, var6, var3, this, this.field334, var5);
				} else {
					var2 = method878(0, 0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field333, this.field341, 0, var6, var3, this, this.field334, var5);
				}

				this.field329 -= var2;
				if (this.field329 != 0) {
					return var2;
				}

				if (!this.method865()) {
					continue;
				}

				return var4;
			}

			if (this.field334 == 256 && (this.field335 & 255) == 0) {
				if (SpriteMask.PcmPlayer_stereo) {
					return method867(0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field340, this.field336, 0, var4, var3, this);
				}

				return method866(((RawSound)super.sound).samples, var1, this.field335, var2, this.field333, 0, var4, var3, this);
			}

			if (SpriteMask.PcmPlayer_stereo) {
				return method871(0, 0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field340, this.field336, 0, var4, var3, this, this.field334, var5);
			}

			return method870(0, 0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field333, 0, var4, var3, this, this.field334, var5);
		}
	}

	@ObfuscatedName("af")
	int method864(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field329 > 0) {
				int var6 = var2 + this.field329;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field329 += var2;
				if (this.field334 == -256 && (this.field335 & 255) == 0) {
					if (SpriteMask.PcmPlayer_stereo) {
						var2 = method877(0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field340, this.field336, this.field342, this.field343, 0, var6, var3, this);
					} else {
						var2 = method876(((RawSound)super.sound).samples, var1, this.field335, var2, this.field333, this.field341, 0, var6, var3, this);
					}
				} else if (SpriteMask.PcmPlayer_stereo) {
					var2 = method881(0, 0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field340, this.field336, this.field342, this.field343, 0, var6, var3, this, this.field334, var5);
				} else {
					var2 = method880(0, 0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field333, this.field341, 0, var6, var3, this, this.field334, var5);
				}

				this.field329 -= var2;
				if (this.field329 != 0) {
					return var2;
				}

				if (!this.method865()) {
					continue;
				}

				return var4;
			}

			if (this.field334 == -256 && (this.field335 & 255) == 0) {
				if (SpriteMask.PcmPlayer_stereo) {
					return method869(0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field340, this.field336, 0, var4, var3, this);
				}

				return method844(((RawSound)super.sound).samples, var1, this.field335, var2, this.field333, 0, var4, var3, this);
			}

			if (SpriteMask.PcmPlayer_stereo) {
				return method885(0, 0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field340, this.field336, 0, var4, var3, this, this.field334, var5);
			}

			return method872(0, 0, ((RawSound)super.sound).samples, var1, this.field335, var2, this.field333, 0, var4, var3, this, this.field334, var5);
		}
	}

	@ObfuscatedName("ar")
	boolean method865() {
		int var1 = this.field331;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method967(var1, this.field332);
			var3 = method836(var1, this.field332);
		}

		if (var1 == this.field333 && var2 == this.field340 && var3 == this.field336) {
			if (this.field331 == Integer.MIN_VALUE) {
				this.field331 = 0;
				this.field336 = 0;
				this.field340 = 0;
				this.field333 = 0;
				this.remove();
				return true;
			} else {
				this.method841();
				return false;
			}
		} else {
			if (this.field333 < var1) {
				this.field341 = 1;
				this.field329 = var1 - this.field333;
			} else if (this.field333 > var1) {
				this.field341 = -1;
				this.field329 = this.field333 - var1;
			} else {
				this.field341 = 0;
			}

			if (this.field340 < var2) {
				this.field342 = 1;
				if (this.field329 == 0 || this.field329 > var2 - this.field340) {
					this.field329 = var2 - this.field340;
				}
			} else if (this.field340 > var2) {
				this.field342 = -1;
				if (this.field329 == 0 || this.field329 > this.field340 - var2) {
					this.field329 = this.field340 - var2;
				}
			} else {
				this.field342 = 0;
			}

			if (this.field336 < var3) {
				this.field343 = 1;
				if (this.field329 == 0 || this.field329 > var3 - this.field336) {
					this.field329 = var3 - this.field336;
				}
			} else if (this.field336 > var3) {
				this.field343 = -1;
				if (this.field329 == 0 || this.field329 > this.field336 - var3) {
					this.field329 = this.field336 - var3;
				}
			} else {
				this.field343 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("c")
	static int method967(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("b")
	static int method836(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Laj;II)Lat;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class339.field4058 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Laj;III)Lat;"
	)
	public static RawPcmStream method943(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILat;)I"
	)
	static int method866(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field335 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILat;)I"
	)
	static int method867(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field335 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILat;)I"
	)
	static int method844(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field335 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILat;)I"
	)
	static int method869(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field335 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILat;II)I"
	)
	static int method870(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field335 = var4;
		return var5;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILat;II)I"
	)
	static int method871(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field335 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILat;II)I"
	)
	static int method872(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field335 = var4;
		return var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILat;II)I"
	)
	static int method885(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field335 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILat;)I"
	)
	static int method874(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field340 += var9.field342 * (var6 - var3);
		var9.field336 += var9.field343 * (var6 - var3);

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

		var9.field333 = var4 >> 2;
		var9.field335 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILat;)I"
	)
	static int method875(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field333 += var12.field341 * (var9 - var4);
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

		var12.field340 = var5 >> 2;
		var12.field336 = var6 >> 2;
		var12.field335 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILat;)I"
	)
	static int method876(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field340 += var9.field342 * (var6 - var3);
		var9.field336 += var9.field343 * (var6 - var3);

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

		var9.field333 = var4 >> 2;
		var9.field335 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILat;)I"
	)
	static int method877(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field333 += var12.field341 * (var9 - var4);
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

		var12.field340 = var5 >> 2;
		var12.field336 = var6 >> 2;
		var12.field335 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILat;II)I"
	)
	static int method878(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field340 -= var11.field342 * var5;
		var11.field336 -= var11.field343 * var5;
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

		var11.field340 += var11.field342 * var5;
		var11.field336 += var11.field343 * var5;
		var11.field333 = var6;
		var11.field335 = var4;
		return var5;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILat;II)I"
	)
	static int method879(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field333 -= var5 * var13.field341;
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
		var13.field333 += var13.field341 * var5;
		var13.field340 = var6;
		var13.field336 = var7;
		var13.field335 = var4;
		return var5;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILat;II)I"
	)
	static int method880(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field340 -= var11.field342 * var5;
		var11.field336 -= var11.field343 * var5;
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

		var11.field340 += var11.field342 * var5;
		var11.field336 += var11.field343 * var5;
		var11.field333 = var6;
		var11.field335 = var4;
		return var5;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILat;II)I"
	)
	static int method881(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field333 -= var5 * var13.field341;
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
		var13.field333 += var13.field341 * var5;
		var13.field340 = var6;
		var13.field336 = var7;
		var13.field335 = var4;
		return var5;
	}
}
