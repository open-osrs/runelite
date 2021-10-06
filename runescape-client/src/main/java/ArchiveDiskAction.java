import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -900370285
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1004921481
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1831916314"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ViewportMouse.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			ViewportMouse.runScriptEvent(var5);
		}

		Client.field647 = var3;
		Client.isSpellSelected = true;
		ModelData0.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		ObjectComposition.selectedSpellFlags = var2;
		class16.invalidateWidget(var4);
	}
}
