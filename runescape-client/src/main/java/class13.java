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
		this.this$1 = var1;
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (var1 == null) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this);
	}

	@ObfuscatedName("c")
	public static String method195(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ldn;[F[FI)V",
		garbageValue = "1644015096"
	)
	static void method202(class115 var0, float[] var1, float[] var2) {
		if (var0 != null) {
			float var3 = var1[3] - var1[0];
			if ((double)var3 != 0.0D) {
				float var4 = var1[1] - var1[0];
				float var5 = var1[2] - var1[0];
				Float var6 = var4 / var3;
				Float var7 = var5 / var3;
				var0.field1398 = var6 == 0.33333334F && var7 == 0.6666667F;
				float var8 = var6;
				float var9 = var7;
				if ((double)var6 < 0.0D) {
					var6 = 0.0F;
				}

				if ((double)var7 > 1.0D) {
					var7 = 1.0F;
				}

				if ((double)var6 > 1.0D || var7 < -1.0F) {
					Tile.method3844(var6, var7);
				}

				if (var6 != var8) {
					var1[1] = var1[0] + var6 * var3;
					if (0.0D != (double)var8) {
						var2[1] = var2[0] + (var2[1] - var2[0]) * var6 / var8;
					}
				}

				if (var7 != var9) {
					var1[2] = var1[0] + var7 * var3;
					if ((double)var9 != 1.0D) {
						var2[2] = (float)((double)var2[3] - (double)(var2[3] - var2[2]) * (1.0D - (double)var7) / (1.0D - (double)var9));
					}
				}

				var0.field1406 = var1[0];
				var0.field1394 = var1[3];
				float var10 = var6;
				float var11 = var7;
				float[] var12 = var0.field1401;
				float var13 = var10 - 0.0F;
				float var14 = var11 - var10;
				float var15 = 1.0F - var11;
				float var16 = var14 - var13;
				var12[3] = var15 - var14 - var16;
				var12[2] = var16 + var16 + var16;
				var12[1] = var13 + var13 + var13;
				var12[0] = 0.0F;
				var13 = var2[0];
				var14 = var2[1];
				var15 = var2[2];
				var16 = var2[3];
				float[] var17 = var0.field1402;
				float var18 = var14 - var13;
				float var19 = var15 - var14;
				float var20 = var16 - var15;
				float var21 = var19 - var18;
				var17[3] = var20 - var19 - var21;
				var17[2] = var21 + var21 + var21;
				var17[1] = var18 + var18 + var18;
				var17[0] = var13;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-18"
	)
	static int method201(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.method398(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = StructComposition.method3424(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class117.method2676(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "847874180"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class242.loadInterface(var0)) {
			FriendSystem.updateInterface(MouseRecorder.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
