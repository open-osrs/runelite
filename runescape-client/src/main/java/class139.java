import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ea")
public class class139 extends class132 {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1632895923
	)
	static int field1537;
	@ObfuscatedName("l")
	String field1536;
	@ObfuscatedName("q")
	byte field1533;
	@ObfuscatedName("f")
	byte field1534;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class139(class133 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "35"
	)
	void vmethod2760(Buffer var1) {
		this.field1536 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1536 != null) {
			var1.readUnsignedByte();
			this.field1533 = var1.readByte();
			this.field1534 = var1.readByte();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "1634989707"
	)
	void vmethod2759(ClanChannel var1) {
		var1.name = this.field1536;
		if (this.field1536 != null) {
			var1.field1517 = this.field1533;
			var1.field1512 = this.field1534;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1485295086"
	)
	static boolean method2763(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field165.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class27.method406(class29.field168, var2, new Object[]{(new URL(class29.field168.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class29.field168.getAppletContext().showDocument(new URL(class29.field168.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class29.field168;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				class29.field168.getAppletContext().showDocument(new URL(class29.field168.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
