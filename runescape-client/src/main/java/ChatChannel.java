import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("by")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2004549905
	)
	static int field973;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	static Bounds field976;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	static Bounds field977;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lbo;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -247324107
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 72
	} // L: 75

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbo;",
		garbageValue = "54"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 78

		for (int var6 = this.count; var6 > 0; --var6) { // L: 79
			if (var6 != 100) { // L: 80
				this.messages[var6] = this.messages[var6 - 1]; // L: 81
			}
		}

		if (var5 == null) { // L: 83
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 85
			var5.removeDual(); // L: 86
			var5.set(var1, var2, var4, var3); // L: 87
		}

		this.messages[0] = var5; // L: 89
		if (this.count < 100) { // L: 90
			++this.count;
		}

		return var5; // L: 91
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lbo;",
		garbageValue = "-345084723"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 95 96
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2082093822"
	)
	@Export("size")
	int size() {
		return this.count; // L: 100
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-17"
	)
	public static boolean method1968(int var0) {
		return var0 >= WorldMapDecorationType.field3562.id && var0 <= WorldMapDecorationType.field3577.id; // L: 47
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "-1029057430"
	)
	static float[] method1965(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 279

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 281
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 282
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 283
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 284
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 285
		} catch (JSONException var4) { // L: 287
			var2[0] = 0.0F; // L: 288
			var2[1] = 0.0F; // L: 289
			var2[2] = 1.0F; // L: 290
			var2[3] = 1.0F; // L: 291
		}

		return var2; // L: 293
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lki;III)V",
		garbageValue = "-1619686813"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10816
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10817
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10818
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10819
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10820
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10821
		}

		if (var0.yAlignment == 0) { // L: 10822
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10823
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10824
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10825
		} else if (var0.yAlignment == 4) { // L: 10826
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10827
		}

	} // L: 10828
}
