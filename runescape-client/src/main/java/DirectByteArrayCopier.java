import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1246567365
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("e")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("n")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)[B",
		garbageValue = "147"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BS)V",
		garbageValue = "2048"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "641314973"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ParamComposition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class139.runScriptEvent(var5);
		}

		Client.field645 = var3;
		Client.isSpellSelected = true;
		WorldMapEvent.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		ScriptFrame.selectedSpellFlags = var2;
		Actor.invalidateWidget(var4);
	}
}
