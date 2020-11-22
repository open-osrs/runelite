import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dr")
@Implements("TileItemPile")
public final class TileItemPile {
	@ObfuscatedName("o")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1480957507
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2145467321
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1424662537
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("second")
	Entity second;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("first")
	Entity first;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("third")
	Entity third;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 4099834780630391479L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -350155061
	)
	@Export("height")
	int height;

	TileItemPile() {
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;Liw;Lgv;I)Z",
		garbageValue = "-1153797307"
	)
	public static boolean method2909(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class206.musicPatchesArchive = var0; // L: 26
		class206.musicSamplesArchive = var1; // L: 27
		class206.soundEffectsArchive = var2; // L: 28
		class13.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "-669198743"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class105.reflectionChecks.last(); // L: 31
		if (var1 != null) { // L: 32
			int var2 = var0.offset; // L: 33
			var0.writeInt(var1.id); // L: 34

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 35
				if (var1.creationErrors[var3] != 0) { // L: 36
					var0.writeByte(var1.creationErrors[var3]); // L: 37
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 41
						Field var5;
						int var6;
						if (var4 == 0) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							var6 = Reflection.getInt(var5, (Object)null); // L: 44
							var0.writeByte(0); // L: 45
							var0.writeInt(var6); // L: 46
						} else if (var4 == 1) { // L: 48
							var5 = var1.fields[var3]; // L: 49
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 50
							var0.writeByte(0); // L: 51
						} else if (var4 == 2) { // L: 53
							var5 = var1.fields[var3]; // L: 54
							var6 = var5.getModifiers(); // L: 55
							var0.writeByte(0); // L: 56
							var0.writeInt(var6); // L: 57
						}

						Method var25;
						if (var4 != 3) { // L: 59
							if (var4 == 4) { // L: 79
								var25 = var1.methods[var3]; // L: 80
								var6 = var25.getModifiers(); // L: 81
								var0.writeByte(0); // L: 82
								var0.writeInt(var6); // L: 83
							}
						} else {
							var25 = var1.methods[var3]; // L: 60
							byte[][] var10 = var1.arguments[var3]; // L: 61
							Object[] var7 = new Object[var10.length]; // L: 62

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 63
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 64
								var7[var8] = var9.readObject(); // L: 65
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 67
							if (var11 == null) { // L: 68
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 69
								var0.writeByte(1); // L: 70
								var0.writeLong(((Number)var11).longValue()); // L: 71
							} else if (var11 instanceof String) { // L: 73
								var0.writeByte(2); // L: 74
								var0.writeStringCp1252NullTerminated((String)var11); // L: 75
							} else {
								var0.writeByte(4); // L: 77
							}
						}
					} catch (ClassNotFoundException var13) { // L: 86
						var0.writeByte(-10); // L: 87
					} catch (InvalidClassException var14) { // L: 89
						var0.writeByte(-11); // L: 90
					} catch (StreamCorruptedException var15) { // L: 92
						var0.writeByte(-12); // L: 93
					} catch (OptionalDataException var16) { // L: 95
						var0.writeByte(-13); // L: 96
					} catch (IllegalAccessException var17) { // L: 98
						var0.writeByte(-14); // L: 99
					} catch (IllegalArgumentException var18) { // L: 101
						var0.writeByte(-15); // L: 102
					} catch (InvocationTargetException var19) { // L: 104
						var0.writeByte(-16); // L: 105
					} catch (SecurityException var20) { // L: 107
						var0.writeByte(-17); // L: 108
					} catch (IOException var21) { // L: 110
						var0.writeByte(-18); // L: 111
					} catch (NullPointerException var22) { // L: 113
						var0.writeByte(-19); // L: 114
					} catch (Exception var23) { // L: 116
						var0.writeByte(-20); // L: 117
					} catch (Throwable var24) { // L: 119
						var0.writeByte(-21); // L: 120
					}
				}
			}

			var0.writeCrc(var2); // L: 123
			var1.remove(); // L: 124
		}
	} // L: 125

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-47736046"
	)
	static void method2908() {
		KitDefinition.method4634(KeyHandler.menuWidth / 2 + Coord.menuX, WorldMapArea.menuY); // L: 7891
	} // L: 7892
}
