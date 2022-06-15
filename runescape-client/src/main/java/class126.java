import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class126 extends class128 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -8228182624755456153L
	)
	long field1562;
	@ObfuscatedName("v")
	String field1559;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class126(class131 var1) {
		this.this$0 = var1;
		this.field1562 = -1L; // L: 74
		this.field1559 = null; // L: 75
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1562 = var1.readLong(); // L: 82
		}

		this.field1559 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method2956(this.field1562, this.field1559, 0); // L: 88
	} // L: 89

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "78"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 12195

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 12196
			var1.clearIsFromIgnored(); // L: 12198
		}

		if (Huffman.friendsChat != null) { // L: 12202
			Huffman.friendsChat.invalidateIgnoreds(); // L: 12203
		}

	} // L: 12205
}
