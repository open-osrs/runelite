import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("z")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;

	ApproximateRouteStrategy() {
	} // L: 11841

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILfa;B)Z",
		garbageValue = "2"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 11844
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "450286187"
	)
	public static void method1203(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lbc;Lbc;IZI)I",
		garbageValue = "-205185455"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1686() ? (var1.method1686() ? 0 : 1) : (var1.method1686() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1722() ? (var1.method1722() ? 0 : 1) : (var1.method1722() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "([Liv;Liv;ZI)V",
		garbageValue = "1379988095"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * -734718787 * 1765836437 : var1.width * 1953969927 * -1078557001; // L: 10041
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -58177491 * -1965471835 : var1.height * 962798585 * 761540169; // L: 10042
		Login.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10043
		if (var1.children != null) { // L: 10044
			Login.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10045
		if (var5 != null) {
			Strings.method4801(var5.group, var3, var4, var2); // L: 10046
		}

		if (var1.contentType == 1337) { // L: 10047
		}

	} // L: 10048

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "436780499"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (UserComparator8.loadInterface(var0)) { // L: 11110
			Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 11111

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11112
				Widget var3 = var1[var2]; // L: 11113
				if (var3 != null) { // L: 11114
					var3.modelFrame = 0; // L: 11115
					var3.modelFrameCycle = 0; // L: 11116
				}
			}

		}
	} // L: 11118
}
