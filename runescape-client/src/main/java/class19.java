import java.awt.Image;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("d")
public class class19 {
	@ObfuscatedName("at")
	static Image field89;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1107399791
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("i")
	Future field92;
	@ObfuscatedName("w")
	String field90;

	class19(Future var1) {
		this.field92 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method278(var1); // L: 14
	} // L: 15

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1091176174"
	)
	void method278(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field90 = var1; // L: 19
		if (this.field92 != null) { // L: 20
			this.field92.cancel(true);
			this.field92 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public final String method293() {
		return this.field90; // L: 27
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "390878741"
	)
	public boolean method276() {
		return this.field90 != null || this.field92 == null; // L: 31
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1402334300"
	)
	public final boolean method280() {
		return this.method276() ? true : this.field92.isDone(); // L: 35 36
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lm;",
		garbageValue = "-2099684088"
	)
	public final class21 method281() {
		if (this.method276()) { // L: 40
			return new class21(this.field90);
		} else if (!this.method280()) {
			return null; // L: 41
		} else {
			try {
				return (class21)this.field92.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method278(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-394554028"
	)
	public static boolean method279(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 21
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-444636057"
	)
	static int method290(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 805
			var0 -= 1000; // L: 806
			var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 807
		} else {
			var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 809
		}

		class184.invalidateWidget(var3); // L: 810
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 811
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 831
				var3.modelType = 2; // L: 832
				var3.modelId = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 833
				return 1; // L: 834
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 836
				var3.modelType = 3; // L: 837
				var3.modelId = HealthBarDefinition.localPlayer.appearance.getChatHeadId(); // L: 838
				return 1; // L: 839
			} else {
				return 2; // L: 841
			}
		} else {
			class14.Interpreter_intStackSize -= 2; // L: 812
			int var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 813
			int var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 814
			var3.itemId = var4; // L: 815
			var3.itemQuantity = var5; // L: 816
			ItemComposition var6 = TaskHandler.ItemDefinition_get(var4); // L: 817
			var3.modelAngleX = var6.xan2d; // L: 818
			var3.modelAngleY = var6.yan2d; // L: 819
			var3.modelAngleZ = var6.zan2d; // L: 820
			var3.modelOffsetX = var6.offsetX2d; // L: 821
			var3.modelOffsetY = var6.offsetY2d; // L: 822
			var3.modelZoom = var6.zoom2d; // L: 823
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 824
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 825
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 826
			}

			if (var3.field3106 > 0) { // L: 827
				var3.modelZoom = var3.modelZoom * 32 / var3.field3106;
			} else if (var3.rawWidth > 0) { // L: 828
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 829
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "69"
	)
	static final int method291(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 538
		int var4 = var0 & var2 - 1; // L: 539
		int var5 = var1 / var2; // L: 540
		int var6 = var1 & var2 - 1; // L: 541
		int var7 = DynamicObject.method2002(var3, var5); // L: 542
		int var8 = DynamicObject.method2002(var3 + 1, var5); // L: 543
		int var9 = DynamicObject.method2002(var3, var5 + 1); // L: 544
		int var10 = DynamicObject.method2002(var3 + 1, var5 + 1); // L: 545
		int var11 = Messages.method2376(var7, var8, var4, var2); // L: 546
		int var12 = Messages.method2376(var9, var10, var4, var2); // L: 547
		return Messages.method2376(var11, var12, var6, var2); // L: 548
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-165591138"
	)
	public static String method277(String var0) {
		int var1 = var0.length(); // L: 166
		char[] var2 = new char[var1]; // L: 167
		byte var3 = 2; // L: 168

		for (int var4 = 0; var4 < var1; ++var4) { // L: 169
			char var5 = var0.charAt(var4); // L: 170
			if (var3 == 0) { // L: 171
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 172
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 175
					var6 = Character.toTitleCase(var5); // L: 179
				} else {
					var6 = var5; // L: 176
				}

				var5 = var6; // L: 181
			}

			if (Character.isLetter(var5)) { // L: 183
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 184
				if (Character.isSpaceChar(var5)) { // L: 185
					if (var3 != 2) { // L: 186
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 188
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 189
		}

		return new String(var2); // L: 191
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1058992948"
	)
	static final void method289() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 3217
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 3220
		class87.method2223(); // L: 3222
		ArchiveDisk.method6322(); // L: 3223
		NPCComposition.NpcDefinition_cached.clear(); // L: 3225
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 3226
		CollisionMap.method3492(); // L: 3228
		class78.method2078(); // L: 3229
		ScriptFrame.method1117(); // L: 3230
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 3232
		VarpDefinition.VarpDefinition_cached.clear(); // L: 3235
		FileSystem.field1564.method6811(); // L: 3237
		class240.HitSplatDefinition_cachedSprites.method6811(); // L: 3238
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 3240
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 3241
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 3242
		FileSystem.method2908(); // L: 3244
		StructComposition.StructDefinition_cached.clear(); // L: 3246
		ParamComposition.ParamDefinition_cached.clear(); // L: 3249
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 3252
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 3255
		PacketWriter.method2401(); // L: 3257
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 3258
		Script.Script_cached.clear(); // L: 3259
		InvDefinition.archive0.clearFiles(); // L: 3260
		ApproximateRouteStrategy.archive1.clearFiles(); // L: 3261
		ParamComposition.archive3.clearFiles(); // L: 3262
		class12.archive4.clearFiles(); // L: 3263
		class11.archive5.clearFiles(); // L: 3264
		Messages.archive6.clearFiles(); // L: 3265
		HorizontalAlignment.archive7.clearFiles(); // L: 3266
		GrandExchangeOfferOwnWorldComparator.archive8.clearFiles(); // L: 3267
		SecureRandomFuture.archive9.clearFiles(); // L: 3268
		ChatChannel.archive10.clearFiles(); // L: 3269
		AbstractWorldMapIcon.archive11.clearFiles(); // L: 3270
		class14.archive12.clearFiles(); // L: 3271
	} // L: 3272
}
