import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 4604634088855325369L
	)
	long field3911;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -7952727671198332901L
	)
	long field3904;
	@ObfuscatedName("f")
	public boolean field3905;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -5361475612700650265L
	)
	long field3909;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 2894173313934874305L
	)
	long field3907;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -7914269396143437043L
	)
	long field3914;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1222390905
	)
	int field3908;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1927973715
	)
	int field3910;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1169062673
	)
	int field3906;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1836346517
	)
	int field3912;

	public Timer() {
		this.field3911 = -1L;
		this.field3904 = -1L;
		this.field3905 = false;
		this.field3909 = 0L;
		this.field3907 = 0L;
		this.field3914 = 0L;
		this.field3908 = 0;
		this.field3910 = 0;
		this.field3906 = 0;
		this.field3912 = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "114"
	)
	public void method5903() {
		this.field3911 = UserComparator4.method2406();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-75"
	)
	public void method5904() {
		if (-1L != this.field3911) {
			this.field3907 = UserComparator4.method2406() - this.field3911;
			this.field3911 = -1L;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "18294445"
	)
	public void method5905(int var1) {
		this.field3904 = UserComparator4.method2406();
		this.field3908 = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "87"
	)
	public void method5906() {
		if (this.field3904 != -1L) {
			this.field3909 = UserComparator4.method2406() - this.field3904;
			this.field3904 = -1L;
		}

		++this.field3906;
		this.field3905 = true;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1510248408"
	)
	public void method5907() {
		this.field3905 = false;
		this.field3910 = 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2132857745"
	)
	public void method5908() {
		this.method5906();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-205261930"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3907;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field3909;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field3914;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field3908);
		var1.writeShort(this.field3910);
		var1.writeShort(this.field3906);
		var1.writeShort(this.field3912);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "225667152"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = GameBuild.method5123(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}
}
