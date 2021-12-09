import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("c")
	@Export("url")
	final URL url;
	@ObfuscatedName("b")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("p")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 97
	} // L: 98

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-11682805"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 101
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "309471456"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 105
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1703812589"
	)
	static final void method2496() {
		class364.method6623(); // L: 3587
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 3589
		ScriptFrame.method1110(); // L: 3591
		UserComparator5.method2524(); // L: 3592
		NPCComposition.NpcDefinition_cached.clear(); // L: 3594
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 3595
		ItemComposition.ItemDefinition_cached.clear(); // L: 3598
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 3599
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 3600
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 3603
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 3604
		SequenceDefinition.field2086.clear(); // L: 3605
		InterfaceParent.method2143(); // L: 3607
		class1.method8(); // L: 3608
		VarpDefinition.VarpDefinition_cached.clear(); // L: 3610
		AbstractSocket.HitSplatDefinition_cachedSprites.method7216(); // L: 3612
		Ignored.HitSplatDefinition_cached.method7216(); // L: 3613
		ObjectSound.method1796(); // L: 3614
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 3616
		HealthBarDefinition.field1795.clear(); // L: 3617
		ObjectComposition.method3542(); // L: 3619
		ParamComposition.ParamDefinition_cached.clear(); // L: 3621
		WorldMapElement.PlayerAppearance_cachedModels.clear(); // L: 3624
		PlayerComposition.Widget_cachedSprites.clear(); // L: 3627
		WorldMapSection2.method4417(); // L: 3629
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 3630
		Script.Script_cached.clear(); // L: 3631
		class115.archive1.clearFiles(); // L: 3632
		class9.archive3.clearFiles(); // L: 3633
		class19.archive4.clearFiles(); // L: 3634
		KeyHandler.field151.clearFiles(); // L: 3635
		class140.archive5.clearFiles(); // L: 3636
		WorldMapScaleHandler.archive6.clearFiles(); // L: 3637
		class115.archive7.clearFiles(); // L: 3638
		UserComparator6.archive8.clearFiles(); // L: 3639
		NetSocket.archive9.clearFiles(); // L: 3640
		class257.archive10.clearFiles(); // L: 3641
		Players.archive11.clearFiles(); // L: 3642
		TaskHandler.archive12.clearFiles(); // L: 3643
	} // L: 3644

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1546953811"
	)
	static void method2489() {
		Client.menuOptionsCount = 0; // L: 8781
		Client.isMenuOpen = false; // L: 8782
	} // L: 8783

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-101999626"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class126.getWidgetChild(var0, var1); // L: 9865
		if (var4 != null && var4.onTargetEnter != null) { // L: 9866
			ScriptEvent var5 = new ScriptEvent(); // L: 9867
			var5.widget = var4; // L: 9868
			var5.args = var4.onTargetEnter; // L: 9869
			class285.runScriptEvent(var5); // L: 9870
		}

		Client.field633 = var3; // L: 9872
		Client.isSpellSelected = true; // L: 9873
		class20.selectedSpellWidget = var0; // L: 9874
		Client.selectedSpellChildIndex = var1; // L: 9875
		class91.selectedSpellFlags = var2; // L: 9876
		SecureRandomCallable.invalidateWidget(var4); // L: 9877
	} // L: 9878
}
