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
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field793 = var2.int7 * 128;
			this.field796 = var2.int5;
			this.field797 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field793 = 0;
			this.field796 = 0;
			this.field797 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class281.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;B)V",
		garbageValue = "-45"
	)
	public static void method1803(AbstractArchive var0, AbstractArchive var1) {
		GrandExchangeOfferAgeComparator.HealthBarDefinition_archive = var0;
		HealthBarDefinition.field1802 = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-88245414"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = class4.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class4.loadClassFromDescriptor(var20);
						if (class4.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = class4.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (class4.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class4.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class33.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "30466"
	)
	public static void method1796() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}
}
