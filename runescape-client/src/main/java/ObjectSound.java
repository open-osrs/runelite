import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 12452185
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1536364883
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1658207689
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1738796741
	)
	int field807;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1807311773
	)
	int field803;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -568523691
	)
	int field804;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -908511827
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -623249431
	)
	int field808;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1245804267
	)
	int field809;
	@ObfuscatedName("w")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2138886061
	)
	int field811;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "926767071"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field804 = var2.int7 * 128;
			this.field808 = var2.int5;
			this.field809 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field804 = 0;
			this.field808 = 0;
			this.field809 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2044677367"
	)
	protected static final void method1719() {
		LoginPacket.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "-2053759056"
	)
	static int method1730(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--class54.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--AbstractByteArrayCopier.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--AbstractByteArrayCopier.Interpreter_intStackSize;
										return 1;
									}
								} else {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--class54.Interpreter_stringStackSize;
								--AbstractByteArrayCopier.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							return 1;
						}
					} else {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 5;
			return 1;
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ljt;B)Z",
		garbageValue = "-105"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
