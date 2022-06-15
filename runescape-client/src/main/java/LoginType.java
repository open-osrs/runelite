import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4611;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4615;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4612;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4609;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4614;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4613;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4617;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	public static final LoginType field4620;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 217368977
	)
	final int field4618;
	@ObfuscatedName("s")
	final String field4619;

	static {
		oldscape = new LoginType(7, 0, "", ""); // L: 5
		field4611 = new LoginType(5, 1, "", ""); // L: 6
		field4615 = new LoginType(8, 2, "", ""); // L: 7
		field4612 = new LoginType(0, 3, "", ""); // L: 8
		field4609 = new LoginType(2, 4, "", ""); // L: 9
		field4614 = new LoginType(4, 5, "", ""); // L: 10
		field4613 = new LoginType(6, 6, "", ""); // L: 11
		field4617 = new LoginType(1, 7, "", ""); // L: 12
		field4620 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4611, field4615, field4609, field4612}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4618 = var1; // L: 18
		this.field4619 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lpe;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4618 = var1; // L: 23
		this.field4619 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4619; // L: 29
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnk;FFFI)F",
		garbageValue = "343733515"
	)
	static float method7453(class389 var0, float var1, float var2, float var3) {
		float var4 = FileSystem.method3281(var0.field4415, var0.field4414, var1); // L: 116
		if (Math.abs(var4) < class114.field1429) { // L: 117
			return var1;
		} else {
			float var5 = FileSystem.method3281(var0.field4415, var0.field4414, var2); // L: 118
			if (Math.abs(var5) < class114.field1429) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class114.field1432 * Math.abs(var2) + 0.5F * var3; // L: 147
					float var17 = 0.5F * (var6 - var2); // L: 148
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var6 == var1) { // L: 157
								var9 = 2.0F * var17 * var12; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = ((var10 - var11) * 2.0F * var17 * var10 - (var2 - var1) * (var11 - 1.0F)) * var12; // L: 164
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (2.0F * var9 < var10 * 3.0F * var17 - Math.abs(var16 * var10) && var9 < Math.abs(var10 * var12 * 0.5F)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = FileSystem.method3281(var0.field4415, var0.field4414, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}
}
