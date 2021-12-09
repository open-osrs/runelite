import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("v")
class class11 implements TlsAuthentication {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("pcmPlayerProvider")
	static class47 pcmPlayerProvider;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lh;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 305
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 309
			LinkedList var3 = new LinkedList(); // L: 310
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 312

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 313
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 314
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 316
			}

			this.this$2.this$1.field67 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 320
		} catch (CertificateException var7) { // L: 322
			throw new IOException(var7); // L: 323
		}
	} // L: 325

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 329
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1179058549"
	)
	static int method125(int var0, Script var1, boolean var2) {
		Widget var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1388
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1389
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class404.Widget_unpackTargetMask(class363.getWidgetFlags(var3)); // L: 1390
			return 1; // L: 1391
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1393
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1400
				if (var3.dataText == null) { // L: 1401
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1402
				}

				return 1; // L: 1403
			} else {
				return 2; // L: 1405
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1394
			--var4; // L: 1395
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1396
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1397
			} else {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1398
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-380667098"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class21.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 10041
	} // L: 10042
}
