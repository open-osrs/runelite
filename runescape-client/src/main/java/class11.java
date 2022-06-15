import java.awt.FontMetrics;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("t")
class class11 implements TlsAuthentication {
	@ObfuscatedName("s")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("ab")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lr;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 306
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 310
			LinkedList var3 = new LinkedList(); // L: 311
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 313

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 314
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 315
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 317
			}

			this.this$2.this$1.field63 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 321
		} catch (CertificateException var7) { // L: 323
			throw new IOException(var7); // L: 324
		}
	} // L: 326

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 330
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1603427189"
	)
	static final void method98(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					UserComparator6.field1415[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILkb;IIIII[FI)Lkb;",
		garbageValue = "1978245093"
	)
	static Widget method97(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 920
		var8.type = var0; // L: 921
		var8.parentId = var1.id; // L: 922
		var8.childIndex = var2; // L: 923
		var8.isIf3 = true; // L: 924
		var8.xAlignment = var3; // L: 925
		var8.yAlignment = var4; // L: 926
		var8.widthAlignment = var5; // L: 927
		var8.heightAlignment = var6; // L: 928
		var8.rawX = (int)(var7[0] * (float)var1.width); // L: 929
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 930
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 931
		var8.rawHeight = (int)(var7[3] * (float)var1.height); // L: 932
		return var8; // L: 933
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "-27"
	)
	static int method96(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4602
			++class446.Interpreter_intStackSize; // L: 4603
			return 1; // L: 4604
		} else if (var0 == 7101) { // L: 4606
			Interpreter.Interpreter_stringStackSize += 2; // L: 4607
			return 1; // L: 4608
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4610
			if (var0 == 7106) { // L: 4614
				++class446.Interpreter_intStackSize; // L: 4615
				return 1; // L: 4616
			} else if (var0 == 7107) { // L: 4618
				++class446.Interpreter_intStackSize; // L: 4619
				return 1; // L: 4620
			} else if (var0 == 7108) { // L: 4622
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class18.method234() ? 1 : 0; // L: 4623
				return 1; // L: 4624
			} else if (var0 == 7110) { // L: 4626
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4627
				return 1; // L: 4628
			} else if (var0 == 7120) { // L: 4630
				--class446.Interpreter_intStackSize; // L: 4631
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4632
				return 1; // L: 4633
			} else if (var0 == 7121) { // L: 4635
				class446.Interpreter_intStackSize -= 2; // L: 4636
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4637
				return 1; // L: 4638
			} else if (var0 == 7122) { // L: 4640
				class446.Interpreter_intStackSize -= 2; // L: 4641
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4642
				return 1; // L: 4643
			} else {
				return 2; // L: 4645
			}
		} else {
			++class446.Interpreter_intStackSize; // L: 4611
			return 1; // L: 4612
		}
	}
}
