import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 2053999609
	)
	static int field284;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1333600085
	)
	public static int field279;
	@ObfuscatedName("k")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("a")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 234394993
	)
	public static int field283;
	@ObfuscatedName("v")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1215690509
	)
	int field269;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 2700493498205354685L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1537731573
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1674723661
	)
	int field272;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1001923267
	)
	int field265;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -2229248515898476515L
	)
	long field274;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 352319831
	)
	int field275;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 998812825
	)
	int field262;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -388583705
	)
	int field277;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = -1357881854631939735L
	)
	long field278;
	@ObfuscatedName("d")
	boolean field266;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 461057869
	)
	int field281;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	PcmStream[] field286;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	PcmStream[] field282;

	protected PcmPlayer() {
		this.field269 = 32;
		this.timeMs = UserComparator4.method2406();
		this.field274 = 0L;
		this.field275 = 0;
		this.field262 = 0;
		this.field277 = 0;
		this.field278 = 0L;
		this.field266 = true;
		this.field281 = 0;
		this.field286 = new PcmStream[8];
		this.field282 = new PcmStream[8];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1783507069"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-625452134"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("j")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1407514911"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lav;I)V",
		garbageValue = "1536652372"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1578748771"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = UserComparator4.method2406();

			try {
				if (0L != this.field274) {
					if (var1 < this.field274) {
						return;
					}

					this.open(this.capacity);
					this.field274 = 0L;
					this.field266 = true;
				}

				int var3 = this.position();
				if (this.field277 - var3 > this.field275) {
					this.field275 = this.field277 - var3;
				}

				int var4 = this.field272 + this.field265;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field266 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field265 = var4 - this.field272;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field278) {
					if (!this.field266) {
						if (this.field275 == 0 && this.field262 == 0) {
							this.close();
							this.field274 = var1 + 2000L;
							return;
						}

						this.field265 = Math.min(this.field262, this.field275);
						this.field262 = this.field275;
					} else {
						this.field266 = false;
					}

					this.field275 = 0;
					this.field278 = var1 + 2000L;
				}

				this.field277 = var3;
			} catch (Exception var7) {
				this.close();
				this.field274 = var1 + 2000L;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field279);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1285587409"
	)
	public final void method696() {
		this.field266 = true;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1511155327"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field266 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field274 = UserComparator4.method2406() + 2000L;
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "25571035"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (Skeleton.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == Skeleton.soundSystem.players[var2]) {
					Skeleton.soundSystem.players[var2] = null;
				}

				if (Skeleton.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				Skeleton.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "4570450"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field281 -= var1;
		if (this.field281 < 0) {
			this.field281 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ad")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class321.clearIntArray(var1, 0, var3);
		this.field281 -= var2;
		if (this.stream != null && this.field281 <= 0) {
			this.field281 += field279 >> 4;
			class12.PcmStream_disable(this.stream);
			this.method711(this.stream, this.stream.vmethod944());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field286[var7];

						label102:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label102;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod4889();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field269) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field335; var14 != null; var14 = var11.nextSubStream()) {
											this.method711(var14, var15 * var14.vmethod944() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field286[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field282[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field286[var6];
				PcmStream[] var17 = this.field286;
				this.field282[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field281 < 0) {
			this.field281 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = UserComparator4.method2406();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lav;II)V",
		garbageValue = "589893178"
	)
	final void method711(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field282[var3];
		if (var4 == null) {
			this.field286[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field282[var3] = var1;
		var1.field335 = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfp;",
		garbageValue = "1715478775"
	)
	static HorizontalAlignment[] method702() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1708, HorizontalAlignment.field1707, HorizontalAlignment.HorizontalAlignment_centered};
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljm;",
		garbageValue = "1452483568"
	)
	public static class283[] method744() {
		return new class283[]{class283.field3648, class283.field3646, class283.field3649, class283.field3647};
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "1564904197"
	)
	static int method697(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = HealthBarUpdate.getWidget(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3168 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3161 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3163 = var8;
		} else if (var0 == 1430) {
			var3.field3157 = var8;
		} else {
			if (var0 != 1431) {
				return 2;
			}

			var3.field3158 = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-856147347"
	)
	static void method741(int var0, int var1) {
		if (WorldMapDecorationType.clientPreferences.musicVolume != 0 && var0 != -1) {
			class67.method1886(class4.archive11, var0, 0, WorldMapDecorationType.clientPreferences.musicVolume, false);
			Client.field663 = true;
		}

	}
}
