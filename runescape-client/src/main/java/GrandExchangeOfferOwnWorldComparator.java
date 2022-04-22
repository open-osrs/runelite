import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1956561099
	)
	static int field483;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -525655717
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	static Widget field486;
	@ObfuscatedName("v")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12705

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;B)I",
		garbageValue = "1"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12708
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12709
				if (Client.worldId == var1.world) { // L: 12710
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12711
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12713
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12717
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12721
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2123450792"
	)
	public static boolean method1130(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field140[var0] : false; // L: 236 237
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-121"
	)
	public static boolean method1138(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field131[var0] : false; // L: 246 247
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1843908381"
	)
	static final void method1128() {
		int var0 = class286.field3274 * 128 + 64; // L: 3784
		int var1 = class54.field447 * 128 + 64; // L: 3785
		int var2 = WorldMapLabel.getTileHeight(var0, var1, class18.Client_plane) - BZip2State.field4662; // L: 3786
		class13.method163(var0, var2, var1); // L: 3787
		var0 = class154.field1691 * 128 + 64; // L: 3788
		var1 = class67.field881 * 128 + 64; // L: 3789
		var2 = WorldMapLabel.getTileHeight(var0, var1, class18.Client_plane) - DevicePcmPlayerProvider.field154; // L: 3790
		int var3 = var0 - WorldMapLabelSize.cameraX; // L: 3791
		int var4 = var2 - ItemContainer.cameraY; // L: 3792
		int var5 = var1 - class154.cameraZ; // L: 3793
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5)); // L: 3794
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 3795
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 3796
		WorldMapSectionType.method4308(var7, var8); // L: 3797
	} // L: 3798

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lcz;III)V",
		garbageValue = "1679635193"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4236
			int var3 = class163.SequenceDefinition_get(var1).field2161; // L: 4237
			if (var3 == 1) { // L: 4238
				var0.sequenceFrame = 0; // L: 4239
				var0.sequenceFrameCycle = 0; // L: 4240
				var0.sequenceDelay = var2; // L: 4241
				var0.field1152 = 0; // L: 4242
			}

			if (var3 == 2) { // L: 4244
				var0.field1152 = 0; // L: 4245
			}
		} else if (var1 == -1 || var0.sequence == -1 || class163.SequenceDefinition_get(var1).field2155 >= class163.SequenceDefinition_get(var0.sequence).field2155) { // L: 4248
			var0.sequence = var1; // L: 4249
			var0.sequenceFrame = 0; // L: 4250
			var0.sequenceFrameCycle = 0; // L: 4251
			var0.sequenceDelay = var2; // L: 4252
			var0.field1152 = 0; // L: 4253
			var0.field1170 = var0.pathLength; // L: 4254
		}

	} // L: 4256
}
