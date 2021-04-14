import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("o")
public class class1 extends class14 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1229554835
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1803634055
	)
	int field11;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1796954451
	)
	int field9;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1821011721
	)
	int field14;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -193244971
	)
	int field10;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class1(class2 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field11 = var1.readInt(); // L: 292
		this.field10 = var1.readInt(); // L: 293
		this.field9 = var1.readUnsignedByte(); // L: 294
		this.field14 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method156(this.field11, this.field10, this.field9, this.field14); // L: 299
	} // L: 300

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "1928874463"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 129
		var2.size = var0.readUnsignedByte(); // L: 130
		var2.id = var0.readInt(); // L: 131
		var2.operations = new int[var2.size]; // L: 132
		var2.creationErrors = new int[var2.size]; // L: 133
		var2.fields = new Field[var2.size]; // L: 134
		var2.intReplaceValues = new int[var2.size]; // L: 135
		var2.methods = new Method[var2.size]; // L: 136
		var2.arguments = new byte[var2.size][][]; // L: 137

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 138
			try {
				int var4 = var0.readUnsignedByte(); // L: 140
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 141
					if (var4 == 3 || var4 == 4) { // L: 151
						var5 = var0.readStringCp1252NullTerminated(); // L: 152
						var6 = var0.readStringCp1252NullTerminated(); // L: 153
						var7 = var0.readUnsignedByte(); // L: 154
						String[] var8 = new String[var7]; // L: 155

						for (int var9 = 0; var9 < var7; ++var9) { // L: 156
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 157
						byte[][] var10 = new byte[var7][]; // L: 158
						int var12;
						if (var4 == 3) { // L: 159
							for (int var11 = 0; var11 < var7; ++var11) { // L: 160
								var12 = var0.readInt(); // L: 161
								var10[var11] = new byte[var12]; // L: 162
								var0.readBytes(var10[var11], 0, var12); // L: 163
							}
						}

						var2.operations[var3] = var4; // L: 166
						Class[] var21 = new Class[var7]; // L: 167

						for (var12 = 0; var12 < var7; ++var12) { // L: 168
							var21[var12] = FileSystem.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = FileSystem.loadClassFromDescriptor(var20); // L: 169
						if (FileSystem.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 170
							throw new SecurityException();
						}

						Method[] var13 = FileSystem.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 171
						Method[] var14 = var13; // L: 173

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 174
							Method var16 = var14[var15]; // L: 175
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 177
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 178
								if (var17.length == var21.length) { // L: 179
									boolean var18 = true; // L: 180

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 181
										if (var17[var19] != var21[var19]) { // L: 182
											var18 = false; // L: 183
											break; // L: 184
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 187
										var2.methods[var3] = var16; // L: 188
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 195
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 142
					var6 = var0.readStringCp1252NullTerminated(); // L: 143
					var7 = 0; // L: 144
					if (var4 == 1) { // L: 145
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 146
					var2.intReplaceValues[var3] = var7; // L: 147
					if (FileSystem.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 148
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(FileSystem.loadClassFromDescriptor(var5), var6); // L: 149
				}
			} catch (ClassNotFoundException var24) { // L: 198
				var2.creationErrors[var3] = -1; // L: 199
			} catch (SecurityException var25) { // L: 201
				var2.creationErrors[var3] = -2; // L: 202
			} catch (NullPointerException var26) { // L: 204
				var2.creationErrors[var3] = -3; // L: 205
			} catch (Exception var27) { // L: 207
				var2.creationErrors[var3] = -4; // L: 208
			} catch (Throwable var28) { // L: 210
				var2.creationErrors[var3] = -5; // L: 211
			}
		}

		class69.reflectionChecks.addFirst(var2); // L: 214
	} // L: 215

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1851920597"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 11485

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 11486
			var1.clearIsFromIgnored(); // L: 11488
		}

		if (InterfaceParent.clanChat != null) { // L: 11492
			InterfaceParent.clanChat.invalidateIgnoreds(); // L: 11493
		}

	} // L: 11495

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1189472309"
	)
	static String method24(String var0) {
		PlayerType[] var1 = WallDecoration.PlayerType_values(); // L: 11720

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11721
			PlayerType var3 = var1[var2]; // L: 11722
			if (var3.modIcon != -1 && var0.startsWith(class337.method5986(var3.modIcon))) { // L: 11724 11725
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 11726
				break;
			}
		}

		return var0; // L: 11733
	}
}
