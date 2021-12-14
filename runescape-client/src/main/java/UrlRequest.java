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
		this.url = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-11682805"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "309471456"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1703812589"
	)
	static final void method2496() {
		class364.method6623();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		ScriptFrame.method1110();
		UserComparator5.method2524();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		InterfaceParent.method2143();
		class1.method8();
		VarpDefinition.VarpDefinition_cached.clear();
		AbstractSocket.HitSplatDefinition_cachedSprites.method7216();
		Ignored.HitSplatDefinition_cached.method7216();
		ObjectSound.method1796();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		ObjectComposition.method3542();
		ParamComposition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		WorldMapSection2.method4417();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		class115.archive0.clearFiles();
		class9.archive1.clearFiles();
		class19.archive3.clearFiles();
		KeyHandler.archive4.clearFiles();
		class140.archive5.clearFiles();
		WorldMapScaleHandler.archive6.clearFiles();
		class115.archive7.clearFiles();
		UserComparator6.archive8.clearFiles();
		NetSocket.archive9.clearFiles();
		class257.archive10.clearFiles();
		Players.archive11.clearFiles();
		TaskHandler.archive12.clearFiles();
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1546953811"
	)
	static void method2489() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-101999626"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class126.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class285.runScriptEvent(var5);
		}

		Client.field633 = var3;
		Client.isSpellSelected = true;
		class20.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class91.selectedSpellFlags = var2;
		SecureRandomCallable.invalidateWidget(var4);
	}
}
