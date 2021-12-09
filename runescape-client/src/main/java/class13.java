import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("h")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("t")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1540402679
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Ld;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 284
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 287
		if (var1 == null) { // L: 288
			var1 = new Hashtable(); // L: 289
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 291
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 292
		DataOutputStream var4 = new DataOutputStream(var3); // L: 293
		var4.writeShort(var2.length + 3); // L: 294
		var4.writeByte(0); // L: 295
		var4.writeShort(var2.length); // L: 296
		var4.write(var2); // L: 297
		var4.close(); // L: 298
		var1.put(0, var3.toByteArray()); // L: 299
		return var1; // L: 300
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 305
	}

	@ObfuscatedName("c")
	public static String method195(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 31
		int var2 = Calendar.Calendar_calendar.get(7); // L: 32
		int var3 = Calendar.Calendar_calendar.get(5); // L: 33
		int var4 = Calendar.Calendar_calendar.get(2); // L: 34
		int var5 = Calendar.Calendar_calendar.get(1); // L: 35
		int var6 = Calendar.Calendar_calendar.get(11); // L: 36
		int var7 = Calendar.Calendar_calendar.get(12); // L: 37
		int var8 = Calendar.Calendar_calendar.get(13); // L: 38
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 39
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ldn;[F[FI)V",
		garbageValue = "1644015096"
	)
	static void method202(class115 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 224
			float var3 = var1[3] - var1[0]; // L: 227
			if ((double)var3 != 0.0D) { // L: 228
				float var4 = var1[1] - var1[0]; // L: 231
				float var5 = var1[2] - var1[0]; // L: 232
				Float var6 = var4 / var3; // L: 233
				Float var7 = var5 / var3; // L: 234
				var0.field1398 = var6 == 0.33333334F && var7 == 0.6666667F; // L: 235
				float var8 = var6; // L: 236
				float var9 = var7; // L: 237
				if ((double)var6 < 0.0D) { // L: 238
					var6 = 0.0F;
				}

				if ((double)var7 > 1.0D) { // L: 239
					var7 = 1.0F;
				}

				if ((double)var6 > 1.0D || var7 < -1.0F) { // L: 240
					Tile.method3844(var6, var7); // L: 241
				}

				if (var6 != var8) { // L: 243
					var1[1] = var1[0] + var6 * var3; // L: 244
					if (0.0D != (double)var8) { // L: 245
						var2[1] = var2[0] + (var2[1] - var2[0]) * var6 / var8; // L: 246
					}
				}

				if (var7 != var9) { // L: 249
					var1[2] = var1[0] + var7 * var3; // L: 250
					if ((double)var9 != 1.0D) { // L: 251
						var2[2] = (float)((double)var2[3] - (double)(var2[3] - var2[2]) * (1.0D - (double)var7) / (1.0D - (double)var9)); // L: 252
					}
				}

				var0.field1406 = var1[0]; // L: 255
				var0.field1394 = var1[3]; // L: 256
				float var10 = var6; // L: 257
				float var11 = var7; // L: 258
				float[] var12 = var0.field1401; // L: 259
				float var13 = var10 - 0.0F; // L: 261
				float var14 = var11 - var10; // L: 262
				float var15 = 1.0F - var11; // L: 263
				float var16 = var14 - var13; // L: 264
				var12[3] = var15 - var14 - var16; // L: 265
				var12[2] = var16 + var16 + var16; // L: 266
				var12[1] = var13 + var13 + var13; // L: 267
				var12[0] = 0.0F; // L: 268
				var13 = var2[0]; // L: 270
				var14 = var2[1]; // L: 271
				var15 = var2[2]; // L: 272
				var16 = var2[3]; // L: 273
				float[] var17 = var0.field1402; // L: 274
				float var18 = var14 - var13; // L: 276
				float var19 = var15 - var14; // L: 277
				float var20 = var16 - var15; // L: 278
				float var21 = var19 - var18; // L: 279
				var17[3] = var20 - var19 - var21; // L: 280
				var17[2] = var21 + var21 + var21; // L: 281
				var17[1] = var18 + var18 + var18; // L: 282
				var17[0] = var13; // L: 283
			}
		}
	} // L: 225 229 285

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-18"
	)
	static int method201(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2111
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2112
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.method398(var3) ? 1 : 0; // L: 2113
			return 1; // L: 2114
		} else if (var0 == 3501) { // L: 2116
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2117
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = StructComposition.method3424(var3) ? 1 : 0; // L: 2118
			return 1; // L: 2119
		} else if (var0 == 3502) { // L: 2121
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2122
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class117.method2676(var3) ? 1 : 0; // L: 2123
			return 1; // L: 2124
		} else {
			return 2; // L: 2126
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "847874180"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class242.loadInterface(var0)) { // L: 11380
			FriendSystem.updateInterface(MouseRecorder.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11381
		}
	} // L: 11382
}
