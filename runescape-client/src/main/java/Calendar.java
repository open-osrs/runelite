import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("v")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("c")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("i")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static ClanSettings field3269;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 8
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 18
		java.util.Calendar.getInstance(); // L: 22
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 23
	} // L: 24

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILgt;Lgv;I)Z",
		garbageValue = "-692039603"
	)
	public static final boolean method5507(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 111
		int var5 = var1; // L: 112
		byte var6 = 64; // L: 113
		byte var7 = 64; // L: 114
		int var8 = var0 - var6; // L: 115
		int var9 = var1 - var7; // L: 116
		class194.directions[var6][var7] = 99; // L: 117
		class194.distances[var6][var7] = 0; // L: 118
		byte var10 = 0; // L: 119
		int var11 = 0; // L: 120
		class194.bufferX[var10] = var0; // L: 121
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1; // L: 122
		int[][] var12 = var3.flags; // L: 123

		while (var18 != var11) { // L: 124
			var4 = class194.bufferX[var11]; // L: 125
			var5 = class194.bufferY[var11]; // L: 126
			var11 = var11 + 1 & 4095; // L: 127
			int var16 = var4 - var8; // L: 128
			int var17 = var5 - var9; // L: 129
			int var13 = var4 - var3.xInset; // L: 130
			int var14 = var5 - var3.yInset; // L: 131
			if (var2.hasArrived(2, var4, var5, var3)) { // L: 132
				HealthBarUpdate.field1189 = var4; // L: 133
				StructComposition.field1988 = var5; // L: 134
				return true; // L: 135
			}

			int var15 = class194.distances[var16][var17] + 1; // L: 137
			if (var16 > 0 && class194.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) { // L: 138 139 140 141
				class194.bufferX[var18] = var4 - 1; // L: 142
				class194.bufferY[var18] = var5; // L: 143
				var18 = var18 + 1 & 4095; // L: 144
				class194.directions[var16 - 1][var17] = 2; // L: 145
				class194.distances[var16 - 1][var17] = var15; // L: 146
			}

			if (var16 < 126 && class194.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) { // L: 148 149 150 151
				class194.bufferX[var18] = var4 + 1; // L: 152
				class194.bufferY[var18] = var5; // L: 153
				var18 = var18 + 1 & 4095; // L: 154
				class194.directions[var16 + 1][var17] = 8; // L: 155
				class194.distances[var16 + 1][var17] = var15; // L: 156
			}

			if (var17 > 0 && class194.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) { // L: 158 159 160 161
				class194.bufferX[var18] = var4; // L: 162
				class194.bufferY[var18] = var5 - 1; // L: 163
				var18 = var18 + 1 & 4095; // L: 164
				class194.directions[var16][var17 - 1] = 1; // L: 165
				class194.distances[var16][var17 - 1] = var15; // L: 166
			}

			if (var17 < 126 && class194.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) { // L: 168 169 170 171
				class194.bufferX[var18] = var4; // L: 172
				class194.bufferY[var18] = var5 + 1; // L: 173
				var18 = var18 + 1 & 4095; // L: 174
				class194.directions[var16][var17 + 1] = 4; // L: 175
				class194.distances[var16][var17 + 1] = var15; // L: 176
			}

			if (var16 > 0 && var17 > 0 && class194.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) { // L: 178 179 180 181 182
				class194.bufferX[var18] = var4 - 1; // L: 183
				class194.bufferY[var18] = var5 - 1; // L: 184
				var18 = var18 + 1 & 4095; // L: 185
				class194.directions[var16 - 1][var17 - 1] = 3; // L: 186
				class194.distances[var16 - 1][var17 - 1] = var15; // L: 187
			}

			if (var16 < 126 && var17 > 0 && class194.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) { // L: 189 190 191 192 193
				class194.bufferX[var18] = var4 + 1; // L: 194
				class194.bufferY[var18] = var5 - 1; // L: 195
				var18 = var18 + 1 & 4095; // L: 196
				class194.directions[var16 + 1][var17 - 1] = 9; // L: 197
				class194.distances[var16 + 1][var17 - 1] = var15; // L: 198
			}

			if (var16 > 0 && var17 < 126 && class194.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) { // L: 200 201 202 203 204
				class194.bufferX[var18] = var4 - 1; // L: 205
				class194.bufferY[var18] = var5 + 1; // L: 206
				var18 = var18 + 1 & 4095; // L: 207
				class194.directions[var16 - 1][var17 + 1] = 6; // L: 208
				class194.distances[var16 - 1][var17 + 1] = var15; // L: 209
			}

			if (var16 < 126 && var17 < 126 && class194.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) { // L: 211 212 213 214 215
				class194.bufferX[var18] = var4 + 1; // L: 216
				class194.bufferY[var18] = var5 + 1; // L: 217
				var18 = var18 + 1 & 4095; // L: 218
				class194.directions[var16 + 1][var17 + 1] = 12; // L: 219
				class194.distances[var16 + 1][var17 + 1] = var15; // L: 220
			}
		}

		HealthBarUpdate.field1189 = var4; // L: 223
		StructComposition.field1988 = var5; // L: 224
		return false; // L: 225
	}
}
