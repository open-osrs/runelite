import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class21 {
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("k")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2092446837
	)
	final int field114;
	@ObfuscatedName("q")
	final String field115;

	class21(String var1) {
		this.field114 = 400; // L: 32
		this.field115 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field114 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field114 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close(); // L: 26
		}

		this.field115 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	public int method271() {
		return this.field114; // L: 37
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-11"
	)
	public String method276() {
		return this.field115; // L: 41
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lfi;",
		garbageValue = "2110417878"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1346094411"
	)
	static void method280() {
		Login.Login_username = Login.Login_username.trim(); // L: 1107
		if (Login.Login_username.length() == 0) { // L: 1108
			class345.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1109
		} else {
			long var1;
			try {
				URL var3 = new URL(WorldMapData_1.method4707("services", false) + "m=accountappeal/login.ws"); // L: 1116
				URLConnection var4 = var3.openConnection(); // L: 1117
				var4.setRequestProperty("connection", "close"); // L: 1118
				var4.setDoInput(true); // L: 1119
				var4.setDoOutput(true); // L: 1120
				var4.setConnectTimeout(5000); // L: 1121
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 1122
				var5.write("data1=req"); // L: 1123
				var5.flush(); // L: 1124
				InputStream var6 = var4.getInputStream(); // L: 1125
				Buffer var7 = new Buffer(new byte[1000]); // L: 1126

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 1128
					if (var8 == -1) { // L: 1129
						var7.offset = 0; // L: 1136
						long var10 = var7.readLong(); // L: 1137
						var1 = var10; // L: 1138
						break;
					}

					var7.offset += var8; // L: 1130
					if (var7.offset >= 1000) { // L: 1131
						var1 = 0L; // L: 1132
						break;
					}
				}
			} catch (Exception var14) { // L: 1140
				var1 = 0L; // L: 1141
			}

			int var0;
			if (var1 == 0L) { // L: 1145
				var0 = 5;
			} else {
				var0 = class143.method2972(var1, Login.Login_username); // L: 1146
			}

			switch(var0) { // L: 1147
			case 2:
				class345.setLoginResponseString(Strings.field3712, Strings.field3929, Strings.field3706); // L: 1164
				class126.method2799(6); // L: 1165
				break;
			case 3:
				class345.setLoginResponseString("", "Error connecting to server.", ""); // L: 1158
				break; // L: 1159
			case 4:
				class345.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1155
				break; // L: 1156
			case 5:
				class345.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1152
				break; // L: 1153
			case 6:
				class345.setLoginResponseString("", "Error connecting to server.", ""); // L: 1149
				break; // L: 1150
			case 7:
				class345.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1161
			}

		}
	} // L: 1110 1168

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1312519782"
	)
	static int method278(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field837 - 7.0D) * 256.0D); // L: 3841
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "322943268"
	)
	static boolean method274() {
		return (Client.drawPlayerNames & 8) != 0; // L: 5016
	}
}
