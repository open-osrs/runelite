import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class112 extends class103 {
	@ObfuscatedName("s")
	String field1352;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class112(class106 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1352 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.name = this.field1352;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lag;",
		garbageValue = "-1781321199"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class15.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "74"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (Huffman.loadInterface(var0)) {
				Widget[] var1 = Widget.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class78.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
