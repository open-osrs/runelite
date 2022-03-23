import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("jj")
public final class class268 {
	@ObfuscatedName("h")
	static final HashMap field3146;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	static {
		field3146 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3146) {
			TimeZone var2 = (TimeZone)field3146.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3146.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)V",
		garbageValue = "2063025013"
	)
	public static void method5226(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "-1220321256"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = JagexCache.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "628991025"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 123
		var2.size = var0.readUnsignedByte(); // L: 124
		var2.id = var0.readInt(); // L: 125
		var2.operations = new int[var2.size]; // L: 126
		var2.creationErrors = new int[var2.size]; // L: 127
		var2.fields = new Field[var2.size]; // L: 128
		var2.intReplaceValues = new int[var2.size]; // L: 129
		var2.methods = new Method[var2.size]; // L: 130
		var2.arguments = new byte[var2.size][][]; // L: 131

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 132
			try {
				int var4 = var0.readUnsignedByte(); // L: 134
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 135
					if (var4 == 3 || var4 == 4) { // L: 145
						var5 = var0.readStringCp1252NullTerminated(); // L: 146
						var6 = var0.readStringCp1252NullTerminated(); // L: 147
						var7 = var0.readUnsignedByte(); // L: 148
						String[] var8 = new String[var7]; // L: 149

						for (int var9 = 0; var9 < var7; ++var9) { // L: 150
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 151
						byte[][] var10 = new byte[var7][]; // L: 152
						int var12;
						if (var4 == 3) { // L: 153
							for (int var11 = 0; var11 < var7; ++var11) { // L: 154
								var12 = var0.readInt(); // L: 155
								var10[var11] = new byte[var12]; // L: 156
								var0.readBytes(var10[var11], 0, var12); // L: 157
							}
						}

						var2.operations[var3] = var4; // L: 160
						Class[] var21 = new Class[var7]; // L: 161

						for (var12 = 0; var12 < var7; ++var12) { // L: 162
							var21[var12] = class359.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class359.loadClassFromDescriptor(var20); // L: 163
						if (class359.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 164
							throw new SecurityException();
						}

						Method[] var13 = class359.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 165
						Method[] var14 = var13; // L: 167

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 168
							Method var16 = var14[var15]; // L: 169
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 171
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 172
								if (var21.length == var17.length) { // L: 173
									boolean var18 = true; // L: 174

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 175
										if (var21[var19] != var17[var19]) { // L: 176
											var18 = false; // L: 177
											break; // L: 178
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 181
										var2.methods[var3] = var16; // L: 182
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 189
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 136
					var6 = var0.readStringCp1252NullTerminated(); // L: 137
					var7 = 0; // L: 138
					if (var4 == 1) { // L: 139
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 140
					var2.intReplaceValues[var3] = var7; // L: 141
					if (class359.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 142
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class359.loadClassFromDescriptor(var5), var6); // L: 143
				}
			} catch (ClassNotFoundException var24) { // L: 192
				var2.creationErrors[var3] = -1; // L: 193
			} catch (SecurityException var25) { // L: 195
				var2.creationErrors[var3] = -2; // L: 196
			} catch (NullPointerException var26) { // L: 198
				var2.creationErrors[var3] = -3; // L: 199
			} catch (Exception var27) { // L: 201
				var2.creationErrors[var3] = -4; // L: 202
			} catch (Throwable var28) { // L: 204
				var2.creationErrors[var3] = -5; // L: 205
			}
		}

		class33.reflectionChecks.addFirst(var2); // L: 208
	} // L: 209

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1384641723"
	)
	static void method5232(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 67
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 68
				int var5 = 0; // L: 69
				if (var1 > var4.maxX) { // L: 70
					var5 += var1 - var4.maxX;
				} else if (var1 < var4.x) { // L: 71
					var5 += var4.x - var1;
				}

				if (var2 > var4.maxY) { // L: 72
					var5 += var2 - var4.maxY;
				} else if (var2 < var4.y) { // L: 73
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field813 && Interpreter.clientPreferences.method2286() != 0 && var0 == var4.plane) { // L: 74
					var5 -= 64; // L: 85
					if (var5 < 0) { // L: 86
						var5 = 0;
					}

					int var6 = (var4.field813 - var5) * Interpreter.clientPreferences.method2286() / var4.field813; // L: 87
					if (var4.stream1 == null) { // L: 88
						if (var4.soundEffectId >= 0) { // L: 89
							SoundEffect var7 = SoundEffect.readSoundEffect(MouseHandler.archive4, var4.soundEffectId, 0); // L: 90
							if (var7 != null) { // L: 91
								RawSound var8 = var7.toRawSound().resample(LoginScreenAnimation.decimator); // L: 92
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 93
								var9.setNumLoops(-1); // L: 94
								WorldMapIcon_1.pcmStreamMixer.addSubStream(var9); // L: 95
								var4.stream1 = var9; // L: 96
							}
						}
					} else {
						var4.stream1.method818(var6); // L: 100
					}

					if (var4.stream2 == null) { // L: 101
						if (var4.soundEffectIds != null && (var4.field821 -= var3) <= 0) { // L: 102
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 103
							SoundEffect var12 = SoundEffect.readSoundEffect(MouseHandler.archive4, var4.soundEffectIds[var11], 0); // L: 104
							if (var12 != null) { // L: 105
								RawSound var13 = var12.toRawSound().resample(LoginScreenAnimation.decimator); // L: 106
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 107
								var10.setNumLoops(0); // L: 108
								WorldMapIcon_1.pcmStreamMixer.addSubStream(var10); // L: 109
								var4.stream2 = var10; // L: 110
								var4.field821 = var4.field809 + (int)(Math.random() * (double)(var4.field819 - var4.field809)); // L: 111
							}
						}
					} else {
						var4.stream2.method818(var6); // L: 116
						if (!var4.stream2.hasNext()) { // L: 117
							var4.stream2 = null; // L: 118
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 75
						WorldMapIcon_1.pcmStreamMixer.removeSubStream(var4.stream1); // L: 76
						var4.stream1 = null; // L: 77
					}

					if (var4.stream2 != null) { // L: 79
						WorldMapIcon_1.pcmStreamMixer.removeSubStream(var4.stream2); // L: 80
						var4.stream2 = null; // L: 81
					}
				}
			}
		}

	} // L: 122

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-597064413"
	)
	public static boolean method5227(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field121[var0] : false; // L: 225 226
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIII)V",
		garbageValue = "1150273936"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3424 == null) { // L: 1012
			throw new RuntimeException(); // L: 1013
		} else {
			var0.field3424[var1] = var2; // L: 1015
			var0.field3425[var1] = var3; // L: 1016
		}
	} // L: 1017

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	static void method5228() {
		Client.menuOptionsCount = 0; // L: 8014
		Client.isMenuOpen = false; // L: 8015
	} // L: 8016
}
