import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("m")
	int field1492;
	@ObfuscatedName("o")
	int field1491;
	@ObfuscatedName("q")
	int field1503;
	@ObfuscatedName("j")
	int field1493;
	@ObfuscatedName("p")
	int field1494;
	@ObfuscatedName("g")
	int field1495;
	@ObfuscatedName("n")
	int field1496;
	@ObfuscatedName("u")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("a")
	@Export("start")
	int start;
	@ObfuscatedName("z")
	@Export("end")
	int end;
	@ObfuscatedName("y")
	boolean field1497;
	@ObfuscatedName("c")
	int field1501;
	@ObfuscatedName("h")
	int field1502;
	@ObfuscatedName("k")
	int field1490;
	@ObfuscatedName("r")
	int field1504;

	@ObfuscatedSignature(
		signature = "(Ldp;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1497 = var1.field1423;
		this.field1491 = var2;
		this.field1503 = var3;
		this.field1493 = var4;
		this.field1492 = 0;
		this.method2675();
	}

	@ObfuscatedSignature(
		signature = "(Ldp;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1497 = var1.field1423;
		this.field1491 = var2;
		this.field1503 = var3;
		this.field1493 = 8192;
		this.field1492 = 0;
		this.method2675();
	}

	@ObfuscatedName("p")
	void method2675() {
		this.field1494 = this.field1503;
		this.field1495 = method2814(this.field1503, this.field1493);
		this.field1496 = method2803(this.field1503, this.field1493);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "()Ldf;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "()Ldf;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("u")
	protected int vmethod4037() {
		return this.field1503 == 0 && this.field1501 == 0 ? 0 : 1;
	}

	@ObfuscatedName("a")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1503 == 0 && this.field1501 == 0) {
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
			if (this.field1492 < 0) {
				if (this.field1491 <= 0) {
					this.method2684();
					this.remove();
					return;
				}

				this.field1492 = 0;
			}

			if (this.field1492 >= var7) {
				if (this.field1491 >= 0) {
					this.method2684();
					this.remove();
					return;
				}

				this.field1492 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field1497) {
					if (this.field1491 < 0) {
						var9 = this.method2698(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field1492 >= var5) {
							return;
						}

						this.field1492 = var5 + var5 - 1 - this.field1492;
						this.field1491 = -this.field1491;
					}

					while (true) {
						var9 = this.method2697(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field1492 < var6) {
							return;
						}

						this.field1492 = var6 + var6 - 1 - this.field1492;
						this.field1491 = -this.field1491;
						var9 = this.method2698(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field1492 >= var5) {
							return;
						}

						this.field1492 = var5 + var5 - 1 - this.field1492;
						this.field1491 = -this.field1491;
					}
				} else if (this.field1491 < 0) {
					while (true) {
						var9 = this.method2698(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field1492 >= var5) {
							return;
						}

						this.field1492 = var6 - 1 - (var6 - 1 - this.field1492) % var8;
					}
				} else {
					while (true) {
						var9 = this.method2697(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field1492 < var6) {
							return;
						}

						this.field1492 = var5 + (this.field1492 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field1497) {
						label132: {
							if (this.field1491 < 0) {
								var9 = this.method2698(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field1492 >= var5) {
									return;
								}

								this.field1492 = var5 + var5 - 1 - this.field1492;
								this.field1491 = -this.field1491;
								if (--this.numLoops == 0) {
									break label132;
								}
							}

							do {
								var9 = this.method2697(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field1492 < var6) {
									return;
								}

								this.field1492 = var6 + var6 - 1 - this.field1492;
								this.field1491 = -this.field1491;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method2698(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field1492 >= var5) {
									return;
								}

								this.field1492 = var5 + var5 - 1 - this.field1492;
								this.field1491 = -this.field1491;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field1491 < 0) {
							while (true) {
								var9 = this.method2698(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field1492 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field1492) / var8;
								if (var10 >= this.numLoops) {
									this.field1492 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1492 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method2697(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field1492 < var6) {
									return;
								}

								var10 = (this.field1492 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field1492 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1492 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field1491 < 0) {
					this.method2698(var1, var9, 0, var3, 0);
					if (this.field1492 < 0) {
						this.field1492 = -1;
						this.method2684();
						this.remove();
					}
				} else {
					this.method2697(var1, var9, var7, var3, 0);
					if (this.field1492 >= var7) {
						this.field1492 = var7;
						this.method2684();
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

	@ObfuscatedName("w")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1501 > 0) {
			if (var1 >= this.field1501) {
				if (this.field1503 == Integer.MIN_VALUE) {
					this.field1503 = 0;
					this.field1496 = 0;
					this.field1495 = 0;
					this.field1494 = 0;
					this.remove();
					var1 = this.field1501;
				}

				this.field1501 = 0;
				this.method2675();
			} else {
				this.field1494 += this.field1502 * var1;
				this.field1495 += this.field1490 * var1;
				this.field1496 += this.field1504 * var1;
				this.field1501 -= var1;
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

		if (this.field1492 < 0) {
			if (this.field1491 <= 0) {
				this.method2684();
				this.remove();
				return;
			}

			this.field1492 = 0;
		}

		if (this.field1492 >= var5) {
			if (this.field1491 >= 0) {
				this.method2684();
				this.remove();
				return;
			}

			this.field1492 = var5 - 1;
		}

		this.field1492 += this.field1491 * var1;
		if (this.numLoops < 0) {
			if (!this.field1497) {
				if (this.field1491 < 0) {
					if (this.field1492 >= var3) {
						return;
					}

					this.field1492 = var4 - 1 - (var4 - 1 - this.field1492) % var6;
				} else {
					if (this.field1492 < var4) {
						return;
					}

					this.field1492 = var3 + (this.field1492 - var3) % var6;
				}

			} else {
				if (this.field1491 < 0) {
					if (this.field1492 >= var3) {
						return;
					}

					this.field1492 = var3 + var3 - 1 - this.field1492;
					this.field1491 = -this.field1491;
				}

				while (this.field1492 >= var4) {
					this.field1492 = var4 + var4 - 1 - this.field1492;
					this.field1491 = -this.field1491;
					if (this.field1492 >= var3) {
						return;
					}

					this.field1492 = var3 + var3 - 1 - this.field1492;
					this.field1491 = -this.field1491;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field1497) {
					label124: {
						if (this.field1491 < 0) {
							if (this.field1492 >= var3) {
								return;
							}

							this.field1492 = var3 + var3 - 1 - this.field1492;
							this.field1491 = -this.field1491;
							if (--this.numLoops == 0) {
								break label124;
							}
						}

						do {
							if (this.field1492 < var4) {
								return;
							}

							this.field1492 = var4 + var4 - 1 - this.field1492;
							this.field1491 = -this.field1491;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field1492 >= var3) {
								return;
							}

							this.field1492 = var3 + var3 - 1 - this.field1492;
							this.field1491 = -this.field1491;
						} while(--this.numLoops != 0);
					}
				} else {
					int var7;
					if (this.field1491 < 0) {
						if (this.field1492 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field1492) / var6;
						if (var7 < this.numLoops) {
							this.field1492 += var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1492 += var6 * this.numLoops;
						this.numLoops = 0;
					} else {
						if (this.field1492 < var4) {
							return;
						}

						var7 = (this.field1492 - var3) / var6;
						if (var7 < this.numLoops) {
							this.field1492 -= var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1492 -= var6 * this.numLoops;
						this.numLoops = 0;
					}
				}
			}

			if (this.field1491 < 0) {
				if (this.field1492 < 0) {
					this.field1492 = -1;
					this.method2684();
					this.remove();
				}
			} else if (this.field1492 >= var5) {
				this.field1492 = var5;
				this.method2684();
				this.remove();
			}

		}
	}

	@ObfuscatedName("y")
	public synchronized void method2677(int var1) {
		this.method2679(var1 << 6, this.method2710());
	}

	@ObfuscatedName("c")
	synchronized void method2678(int var1) {
		this.method2679(var1, this.method2710());
	}

	@ObfuscatedName("h")
	synchronized void method2679(int var1, int var2) {
		this.field1503 = var1;
		this.field1493 = var2;
		this.field1501 = 0;
		this.method2675();
	}

	@ObfuscatedName("k")
	public synchronized int method2680() {
		return this.field1503 == Integer.MIN_VALUE ? 0 : this.field1503;
	}

	@ObfuscatedName("r")
	public synchronized int method2710() {
		return this.field1493 < 0 ? -1 : this.field1493;
	}

	@ObfuscatedName("d")
	public synchronized void method2682(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field1492 = var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method2683() {
		this.field1491 = (this.field1491 ^ this.field1491 >> 31) + (this.field1491 >>> 31);
		this.field1491 = -this.field1491;
	}

	@ObfuscatedName("l")
	void method2684() {
		if (this.field1501 != 0) {
			if (this.field1503 == Integer.MIN_VALUE) {
				this.field1503 = 0;
			}

			this.field1501 = 0;
			this.method2675();
		}

	}

	@ObfuscatedName("t")
	public synchronized void method2685(int var1, int var2) {
		this.method2775(var1, var2, this.method2710());
	}

	@ObfuscatedName("x")
	public synchronized void method2775(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method2679(var2, var3);
		} else {
			int var4 = method2814(var2, var3);
			int var5 = method2803(var2, var3);
			if (var4 == this.field1495 && var5 == this.field1496) {
				this.field1501 = 0;
			} else {
				int var6 = var2 - this.field1494;
				if (this.field1494 - var2 > var6) {
					var6 = this.field1494 - var2;
				}

				if (var4 - this.field1495 > var6) {
					var6 = var4 - this.field1495;
				}

				if (this.field1495 - var4 > var6) {
					var6 = this.field1495 - var4;
				}

				if (var5 - this.field1496 > var6) {
					var6 = var5 - this.field1496;
				}

				if (this.field1496 - var5 > var6) {
					var6 = this.field1496 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field1501 = var1;
				this.field1503 = var2;
				this.field1493 = var3;
				this.field1502 = (var2 - this.field1494) / var1;
				this.field1490 = (var4 - this.field1495) / var1;
				this.field1504 = (var5 - this.field1496) / var1;
			}
		}
	}

	@ObfuscatedName("ah")
	public synchronized void method2732(int var1) {
		if (var1 == 0) {
			this.method2678(0);
			this.remove();
		} else if (this.field1495 == 0 && this.field1496 == 0) {
			this.field1501 = 0;
			this.field1503 = 0;
			this.field1494 = 0;
			this.remove();
		} else {
			int var2 = -this.field1494;
			if (this.field1494 > var2) {
				var2 = this.field1494;
			}

			if (-this.field1495 > var2) {
				var2 = -this.field1495;
			}

			if (this.field1495 > var2) {
				var2 = this.field1495;
			}

			if (-this.field1496 > var2) {
				var2 = -this.field1496;
			}

			if (this.field1496 > var2) {
				var2 = this.field1496;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field1501 = var1;
			this.field1503 = Integer.MIN_VALUE;
			this.field1502 = -this.field1494 / var1;
			this.field1490 = -this.field1495 / var1;
			this.field1504 = -this.field1496 / var1;
		}
	}

	@ObfuscatedName("ai")
	public synchronized void method2688(int var1) {
		if (this.field1491 < 0) {
			this.field1491 = -var1;
		} else {
			this.field1491 = var1;
		}

	}

	@ObfuscatedName("ao")
	public synchronized int method2747() {
		return this.field1491 < 0 ? -this.field1491 : this.field1491;
	}

	@ObfuscatedName("ae")
	public boolean method2690() {
		return this.field1492 < 0 || this.field1492 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ax")
	public boolean method2691() {
		return this.field1501 != 0;
	}

	@ObfuscatedName("an")
	int method2697(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1501 > 0) {
				int var6 = var2 + this.field1501;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1501 += var2;
				if (this.field1491 == 256 && (this.field1492 & 255) == 0) {
					if (Messages.PcmPlayer_stereo) {
						var2 = method2781(0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1495, this.field1496, this.field1490, this.field1504, 0, var6, var3, this);
					} else {
						var2 = method2708(((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1494, this.field1502, 0, var6, var3, this);
					}
				} else if (Messages.PcmPlayer_stereo) {
					var2 = method2738(0, 0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1495, this.field1496, this.field1490, this.field1504, 0, var6, var3, this, this.field1491, var5);
				} else {
					var2 = method2712(0, 0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1494, this.field1502, 0, var6, var3, this, this.field1491, var5);
				}

				this.field1501 -= var2;
				if (this.field1501 != 0) {
					return var2;
				}

				if (!this.method2699()) {
					continue;
				}

				return var4;
			}

			if (this.field1491 == 256 && (this.field1492 & 255) == 0) {
				if (Messages.PcmPlayer_stereo) {
					return method2742(0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1495, this.field1496, 0, var4, var3, this);
				}

				return method2723(((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1494, 0, var4, var3, this);
			}

			if (Messages.PcmPlayer_stereo) {
				return method2705(0, 0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1495, this.field1496, 0, var4, var3, this, this.field1491, var5);
			}

			return method2740(0, 0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1494, 0, var4, var3, this, this.field1491, var5);
		}
	}

	@ObfuscatedName("av")
	int method2698(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1501 > 0) {
				int var6 = var2 + this.field1501;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1501 += var2;
				if (this.field1491 == -256 && (this.field1492 & 255) == 0) {
					if (Messages.PcmPlayer_stereo) {
						var2 = method2711(0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1495, this.field1496, this.field1490, this.field1504, 0, var6, var3, this);
					} else {
						var2 = method2695(((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1494, this.field1502, 0, var6, var3, this);
					}
				} else if (Messages.PcmPlayer_stereo) {
					var2 = method2672(0, 0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1495, this.field1496, this.field1490, this.field1504, 0, var6, var3, this, this.field1491, var5);
				} else {
					var2 = method2767(0, 0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1494, this.field1502, 0, var6, var3, this, this.field1491, var5);
				}

				this.field1501 -= var2;
				if (this.field1501 != 0) {
					return var2;
				}

				if (!this.method2699()) {
					continue;
				}

				return var4;
			}

			if (this.field1491 == -256 && (this.field1492 & 255) == 0) {
				if (Messages.PcmPlayer_stereo) {
					return method2783(0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1495, this.field1496, 0, var4, var3, this);
				}

				return method2702(((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1494, 0, var4, var3, this);
			}

			if (Messages.PcmPlayer_stereo) {
				return method2707(0, 0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1495, this.field1496, 0, var4, var3, this, this.field1491, var5);
			}

			return method2706(0, 0, ((RawSound)super.sound).samples, var1, this.field1492, var2, this.field1494, 0, var4, var3, this, this.field1491, var5);
		}
	}

	@ObfuscatedName("af")
	int vmethod2840() {
		int var1 = this.field1494 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field1492 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("at")
	boolean method2699() {
		int var1 = this.field1503;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method2814(var1, this.field1493);
			var3 = method2803(var1, this.field1493);
		}

		if (var1 == this.field1494 && var2 == this.field1495 && var3 == this.field1496) {
			if (this.field1503 == Integer.MIN_VALUE) {
				this.field1503 = 0;
				this.field1496 = 0;
				this.field1495 = 0;
				this.field1494 = 0;
				this.remove();
				return true;
			} else {
				this.method2675();
				return false;
			}
		} else {
			if (this.field1494 < var1) {
				this.field1502 = 1;
				this.field1501 = var1 - this.field1494;
			} else if (this.field1494 > var1) {
				this.field1502 = -1;
				this.field1501 = this.field1494 - var1;
			} else {
				this.field1502 = 0;
			}

			if (this.field1495 < var2) {
				this.field1490 = 1;
				if (this.field1501 == 0 || this.field1501 > var2 - this.field1495) {
					this.field1501 = var2 - this.field1495;
				}
			} else if (this.field1495 > var2) {
				this.field1490 = -1;
				if (this.field1501 == 0 || this.field1501 > this.field1495 - var2) {
					this.field1501 = this.field1495 - var2;
				}
			} else {
				this.field1490 = 0;
			}

			if (this.field1496 < var3) {
				this.field1504 = 1;
				if (this.field1501 == 0 || this.field1501 > var3 - this.field1496) {
					this.field1501 = var3 - this.field1496;
				}
			} else if (this.field1496 > var3) {
				this.field1504 = -1;
				if (this.field1501 == 0 || this.field1501 > this.field1496 - var3) {
					this.field1501 = this.field1496 - var3;
				}
			} else {
				this.field1504 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("m")
	static int method2814(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("o")
	static int method2803(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Ldp;II)Ldk;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class237.field3113 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ldp;III)Ldk;"
	)
	public static RawPcmStream method2674(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIILdk;)I"
	)
	static int method2723(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field1492 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIILdk;)I"
	)
	static int method2742(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field1492 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIILdk;)I"
	)
	static int method2702(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field1492 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIILdk;)I"
	)
	static int method2783(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field1492 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIILdk;II)I"
	)
	static int method2740(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field1492 = var4;
		return var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILdk;II)I"
	)
	static int method2705(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field1492 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIILdk;II)I"
	)
	static int method2706(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field1492 = var4;
		return var5;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILdk;II)I"
	)
	static int method2707(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field1492 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIIILdk;)I"
	)
	static int method2708(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field1495 += var9.field1490 * (var6 - var3);
		var9.field1496 += var9.field1504 * (var6 - var3);

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

		var9.field1494 = var4 >> 2;
		var9.field1492 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIIIILdk;)I"
	)
	static int method2781(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field1494 += var12.field1502 * (var9 - var4);
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

		var12.field1495 = var5 >> 2;
		var12.field1496 = var6 >> 2;
		var12.field1492 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIIILdk;)I"
	)
	static int method2695(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field1495 += var9.field1490 * (var6 - var3);
		var9.field1496 += var9.field1504 * (var6 - var3);

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

		var9.field1494 = var4 >> 2;
		var9.field1492 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIIIILdk;)I"
	)
	static int method2711(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field1494 += var12.field1502 * (var9 - var4);
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

		var12.field1495 = var5 >> 2;
		var12.field1496 = var6 >> 2;
		var12.field1492 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILdk;II)I"
	)
	static int method2712(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1495 -= var11.field1490 * var5;
		var11.field1496 -= var11.field1504 * var5;
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

		var11.field1495 += var11.field1490 * var5;
		var11.field1496 += var11.field1504 * var5;
		var11.field1494 = var6;
		var11.field1492 = var4;
		return var5;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIIIILdk;II)I"
	)
	static int method2738(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1494 -= var5 * var13.field1502;
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
		var13.field1494 += var13.field1502 * var5;
		var13.field1495 = var6;
		var13.field1496 = var7;
		var13.field1492 = var4;
		return var5;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILdk;II)I"
	)
	static int method2767(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1495 -= var11.field1490 * var5;
		var11.field1496 -= var11.field1504 * var5;
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

		var11.field1495 += var11.field1490 * var5;
		var11.field1496 += var11.field1504 * var5;
		var11.field1494 = var6;
		var11.field1492 = var4;
		return var5;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIIIILdk;II)I"
	)
	static int method2672(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1494 -= var5 * var13.field1502;
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
		var13.field1494 += var13.field1502 * var5;
		var13.field1495 = var6;
		var13.field1496 = var7;
		var13.field1492 = var4;
		return var5;
	}
}
