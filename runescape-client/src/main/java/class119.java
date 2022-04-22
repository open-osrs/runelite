import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("dk")
public class class119 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1449;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1439;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1440;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1441;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1442;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1446;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1444;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1443;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1455;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1447;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1448;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1451;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1450;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1445;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1457;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1452;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class119 field1454;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1189647423
	)
	final int field1438;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 590424235
	)
	final int field1456;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1848047837
	)
	final int field1453;

	static {
		field1449 = new class119(0, 0, (String)null, -1, -1); // L: 51
		field1439 = new class119(1, 1, (String)null, 0, 2); // L: 52
		field1440 = new class119(2, 2, (String)null, 1, 2); // L: 53
		field1441 = new class119(3, 3, (String)null, 2, 2); // L: 54
		field1442 = new class119(4, 4, (String)null, 3, 1); // L: 55
		field1446 = new class119(5, 5, (String)null, 4, 1); // L: 56
		field1444 = new class119(6, 6, (String)null, 5, 1); // L: 57
		field1443 = new class119(7, 7, (String)null, 6, 3); // L: 58
		field1455 = new class119(8, 8, (String)null, 7, 3); // L: 59
		field1447 = new class119(9, 9, (String)null, 8, 3); // L: 60
		field1448 = new class119(10, 10, (String)null, 0, 7); // L: 61
		field1451 = new class119(11, 11, (String)null, 1, 7); // L: 62
		field1450 = new class119(12, 12, (String)null, 2, 7); // L: 63
		field1445 = new class119(13, 13, (String)null, 3, 7); // L: 64
		field1457 = new class119(14, 14, (String)null, 4, 7); // L: 65
		field1452 = new class119(15, 15, (String)null, 5, 7); // L: 66
		field1454 = new class119(16, 16, (String)null, 0, 5); // L: 67
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1438 = var1; // L: 77
		this.field1456 = var2; // L: 78
		this.field1453 = var4; // L: 79
	} // L: 80

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1456; // L: 83
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1943929497"
	)
	int method2751() {
		return this.field1453; // L: 87
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "([Lky;II)V",
		garbageValue = "-908944822"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11941
			Widget var3 = var0[var2]; // L: 11942
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class1.isComponentHidden(var3))) { // L: 11943 11944 11945
				if (var3.type == 0) { // L: 11946
					if (!var3.isIf3 && class1.isComponentHidden(var3) && var3 != DevicePcmPlayerProvider.mousedOverWidgetIf1) { // L: 11947
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11948
					if (var3.children != null) { // L: 11949
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11950
					if (var4 != null) { // L: 11951
						class115.method2680(var4.group);
					}
				}

				if (var3.type == 6) { // L: 11953
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11954
						boolean var7 = Skills.runCs1(var3); // L: 11955
						if (var7) { // L: 11957
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11958
						}

						if (var5 != -1) { // L: 11959
							SequenceDefinition var6 = class163.SequenceDefinition_get(var5); // L: 11960

							for (var3.modelFrameCycle += Client.field556; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class346.invalidateWidget(var3)) { // L: 11961 11962 11969
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11963
								++var3.modelFrame; // L: 11964
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11965
									var3.modelFrame -= var6.frameCount; // L: 11966
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11967
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3392 != 0 && !var3.isIf3) { // L: 11973
						int var8 = var3.field3392 >> 16; // L: 11974
						var5 = var3.field3392 << 16 >> 16; // L: 11975
						var8 *= Client.field556; // L: 11976
						var5 *= Client.field556; // L: 11977
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11978
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11979
						class346.invalidateWidget(var3); // L: 11980
					}
				}
			}
		}

	} // L: 11984

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1036888479"
	)
	static void method2760(String var0) {
		class65.field868 = var0; // L: 12501

		try {
			String var1 = class127.client.getParameter(Integer.toString(18)); // L: 12503
			String var2 = class127.client.getParameter(Integer.toString(13)); // L: 12504
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12505
			String var5;
			if (var0.length() == 0) { // L: 12506
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 12508
				long var6 = class136.method2931() + 94608000000L; // L: 12510
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 12512
				int var8 = Calendar.Calendar_calendar.get(7); // L: 12513
				int var9 = Calendar.Calendar_calendar.get(5); // L: 12514
				int var10 = Calendar.Calendar_calendar.get(2); // L: 12515
				int var11 = Calendar.Calendar_calendar.get(1); // L: 12516
				int var12 = Calendar.Calendar_calendar.get(11); // L: 12517
				int var13 = Calendar.Calendar_calendar.get(12); // L: 12518
				int var14 = Calendar.Calendar_calendar.get(13); // L: 12519
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 12520
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 12522
			}

			Client var16 = class127.client; // L: 12524
			var5 = "document.cookie=\"" + var3 + "\""; // L: 12525
			JSObject.getWindow(var16).eval(var5); // L: 12528
		} catch (Throwable var15) { // L: 12531
		}

	} // L: 12532
}
