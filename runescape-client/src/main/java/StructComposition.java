import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gi")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("fl")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "749475992"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "56"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return; // L: 41
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "1584006933"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = LoginScreenAnimation.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "80"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class124.method2818(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-581400473"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 54
		String var3;
		if (var4 == null) { // L: 56
			var3 = var2; // L: 57
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 60
			if (var5 == null) { // L: 61
				var3 = var2; // L: 62
			} else {
				var3 = (String)var5.obj; // L: 65
			}
		}

		return var3; // L: 67
	}

	@ObfuscatedName("c")
	public static final int method3616(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) { // L: 24
				var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var14 + var0 * (var12 - var14) * 6.0D;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = var14 + 6.0D * (var12 - var14) * var20;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = 6.0D * (var12 - var14) * (0.6666666666666666D - var20) + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZS)I",
		garbageValue = "-18766"
	)
	static int method3617(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 828
			var0 -= 1000; // L: 829
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 830
		} else {
			var3 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 832
		}

		ChatChannel.invalidateWidget(var3); // L: 833
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 834
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 854
				var3.modelType = 2; // L: 855
				var3.modelId = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 856
				return 1; // L: 857
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 859
				var3.modelType = 3; // L: 860
				var3.modelId = class101.localPlayer.appearance.getChatHeadId(); // L: 861
				return 1; // L: 862
			} else {
				return 2; // L: 864
			}
		} else {
			class446.Interpreter_intStackSize -= 2; // L: 835
			int var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 836
			int var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 837
			var3.itemId = var4; // L: 838
			var3.itemQuantity = var5; // L: 839
			ItemComposition var6 = EnumComposition.ItemDefinition_get(var4); // L: 840
			var3.modelAngleX = var6.xan2d; // L: 841
			var3.modelAngleY = var6.yan2d; // L: 842
			var3.modelAngleZ = var6.zan2d; // L: 843
			var3.modelOffsetX = var6.offsetX2d; // L: 844
			var3.modelOffsetY = var6.offsetY2d; // L: 845
			var3.modelZoom = var6.zoom2d; // L: 846
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 847
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 848
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 849
			}

			if (var3.field3424 > 0) { // L: 850
				var3.modelZoom = var3.modelZoom * 32 / var3.field3424;
			} else if (var3.rawWidth > 0) { // L: 851
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 852
		}
	}
}
