import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("bz")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1128926491
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -655443333
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1430356399
	)
	@Export("y")
	int y;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1572120169
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1560179665
	)
	int field796;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1764781377
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 947571377
	)
	int field793;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 209394291
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 739694569
	)
	int field797;
	@ObfuscatedName("d")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -785584779
	)
	int field789;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field793 = var2.int7 * 128; // L: 54
			this.field796 = var2.int5; // L: 55
			this.field797 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field793 = 0; // L: 61
			this.field796 = 0; // L: 62
			this.field797 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			class281.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;B)V",
		garbageValue = "-45"
	)
	public static void method1803(AbstractArchive var0, AbstractArchive var1) {
		GrandExchangeOfferAgeComparator.HealthBarDefinition_archive = var0; // L: 32
		HealthBarDefinition.field1802 = var1; // L: 33
	} // L: 34

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-88245414"
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
							var21[var12] = class4.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class4.loadClassFromDescriptor(var20); // L: 163
						if (class4.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 164
							throw new SecurityException();
						}

						Method[] var13 = class4.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 165
						Method[] var14 = var13; // L: 167

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 168
							Method var16 = var14[var15]; // L: 169
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 171
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 172
								if (var17.length == var21.length) { // L: 173
									boolean var18 = true; // L: 174

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 175
										if (var17[var19] != var21[var19]) { // L: 176
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
					if (class4.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 142
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class4.loadClassFromDescriptor(var5), var6); // L: 143
				}
			} catch (ClassNotFoundException var24) { // L: 192
				var2.creationErrors[var3] = -1; // L: 193
			} catch (SecurityException var25) { // L: 195
				var2.creationErrors[var3] = -2; // L: 196
			} catch (NullPointerException var26) { // L: 198
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) { // L: 204
				var2.creationErrors[var3] = -5; // L: 205
			}
		}

		class33.reflectionChecks.addFirst(var2); // L: 208
	} // L: 209

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "30466"
	)
	public static void method1796() {
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 199
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 200
		HitSplatDefinition.HealthBarDefinition_cached.clear(); // L: 201
	} // L: 202
}
