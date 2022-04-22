import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("hp")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 920193097
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1286565411
	)
	@Export("type")
	int type;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -971153847
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 326052965
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1315093071
	)
	@Export("x")
	int x;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 255854397
	)
	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 896717489
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 131494325
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLix;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = class163.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2161 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method3844()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Liq;",
		garbageValue = "103"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method3844(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label79: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label79;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class146.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) {
			var12 = var12.transform(); // L: 81
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	static void method2003() {
		Login.Login_username = Login.Login_username.trim(); // L: 1152
		if (Login.Login_username.length() == 0) { // L: 1153
			class4.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1154
		} else {
			long var1 = World.method1678(); // L: 1158
			int var0;
			if (0L == var1) { // L: 1159
				var0 = 5;
			} else {
				var0 = WorldMapSectionType.method4312(var1, Login.Login_username); // L: 1160
			}

			switch(var0) { // L: 1161
			case 2:
				class4.setLoginResponseString(Strings.field3628, Strings.field3870, Strings.field3646); // L: 1169
				Ignored.method6828(6); // L: 1170
				break; // L: 1171
			case 3:
				class4.setLoginResponseString("", "Error connecting to server.", ""); // L: 1173
				break; // L: 1174
			case 4:
				class4.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1166
				break; // L: 1167
			case 5:
				class4.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1163
				break;
			case 6:
				class4.setLoginResponseString("", "Error connecting to server.", ""); // L: 1179
				break;
			case 7:
				class4.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1176
			}

		}
	} // L: 1155 1182
}
