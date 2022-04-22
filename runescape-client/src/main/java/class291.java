import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class291 {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	UrlRequest field3295;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	SpritePixels field3293;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lck;)V"
	)
	class291(String var1, UrlRequester var2) {
		try {
			this.field3295 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3295 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Lcw;)V"
	)
	class291(UrlRequest var1) {
		this.field3295 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-159877432"
	)
	SpritePixels method5563() {
		if (this.field3293 == null && this.field3295 != null && this.field3295.isDone()) { // L: 28
			if (this.field3295.getResponse() != null) { // L: 29
				this.field3293 = Interpreter.method1889(this.field3295.getResponse()); // L: 30
			}

			this.field3295 = null; // L: 32
		}

		return this.field3293; // L: 34
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CLlo;B)C",
		garbageValue = "20"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 130
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lbe;",
		garbageValue = "-15672"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqe;",
		garbageValue = "-868128197"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4694, FillMode.field4695, FillMode.SOLID}; // L: 15
	}
}
