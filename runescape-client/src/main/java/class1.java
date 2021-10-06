import java.awt.Image;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class1 implements Callable {
	@ObfuscatedName("au")
	static Image field3;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	final Buffer field1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class3 field4;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(La;Lot;Lj;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field4 = var3;
	}

	public Object call() {
		return this.field4.vmethod15(this.field1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbe;",
		garbageValue = "-96"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = UserComparator6.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = GrandExchangeOfferOwnWorldComparator.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1037014776"
	)
	static void method13() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "182768173"
	)
	static void method14() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class17.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(HitSplatDefinition.method3168("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var10 = var7.readLong();
						var1 = var10;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var14) {
				var1 = 0L;
			}

			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = UserComparator8.method2413(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				class17.setLoginResponseString(Strings.field3604, Strings.field3351, Strings.field3606);
				class112.method2474(6);
				break;
			case 3:
				class17.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class17.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class17.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class17.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class17.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
