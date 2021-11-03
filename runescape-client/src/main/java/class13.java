import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("t")
class class13 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lk;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 229
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 231
		if (var1 == null) { // L: 232
			var1 = new Hashtable(); // L: 233
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 235
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 236
		DataOutputStream var4 = new DataOutputStream(var3); // L: 237
		var4.writeShort(var2.length + 3); // L: 238
		var4.writeByte(0); // L: 239
		var4.writeShort(var2.length); // L: 240
		var4.write(var2); // L: 241
		var4.close(); // L: 242
		var1.put(0, var3.toByteArray()); // L: 243
		return var1; // L: 244
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 248
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;Lnf;I)Lnf;",
		garbageValue = "261617264"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			int var4 = var2 - 1; // L: 21
			var4 |= var4 >>> 1; // L: 22
			var4 |= var4 >>> 2; // L: 23
			var4 |= var4 >>> 4; // L: 24
			var4 |= var4 >>> 8; // L: 25
			var4 |= var4 >>> 16; // L: 26
			var3 = var4 + 1; // L: 27
			var1 = new IterableNodeHashTable(var3); // L: 30
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 32
			boolean var7 = var0.readUnsignedByte() == 1; // L: 33
			int var5 = var0.readMedium(); // L: 34
			Object var6;
			if (var7) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 36
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 37
			}

			var1.put((Node)var6, (long)var5); // L: 38
		}

		return var1; // L: 40
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "719840218"
	)
	static int method173(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 1391
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1392
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var3)); // L: 1393
			return 1; // L: 1394
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1396
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1403
				if (var3.dataText == null) { // L: 1404
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1405
				}

				return 1; // L: 1406
			} else {
				return 2; // L: 1408
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1397
			--var4; // L: 1398
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1399
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1400
			} else {
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1401
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIIIII)V",
		garbageValue = "909796147"
	)
	static final void method177(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field465) { // L: 10294
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10295
		}

		Client.field465 = false; // L: 10296
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10297
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10298
				var0.scrollY -= 4; // L: 10299
				class184.invalidateWidget(var0); // L: 10300
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10302
				var0.scrollY += 4; // L: 10303
				class184.invalidateWidget(var0); // L: 10304
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10306
				var7 = var3 * (var3 - 32) / var4; // L: 10307
				if (var7 < 8) { // L: 10308
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10309
				int var9 = var3 - 32 - var7; // L: 10310
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10311
				class184.invalidateWidget(var0); // L: 10312
				Client.field465 = true; // L: 10313
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10316
			var7 = var0.width; // L: 10317
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10318
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10319
				class184.invalidateWidget(var0); // L: 10320
			}
		}

	} // L: 10323
}
