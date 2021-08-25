import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class125 extends class116 {
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class386 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 478652981
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("n")
	String field1436;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class125(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1436 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.name = this.field1436;
	}
}
