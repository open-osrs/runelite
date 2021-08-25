import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("n")
	@Export("args")
	Object[] args;
	@ObfuscatedName("c")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1052798577
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1252343399
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 384034427
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -250292993
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 708606643
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("e")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 858415665
	)
	int field1035;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -895151869
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1935974464"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-68"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lfq;",
		garbageValue = "-763198319"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)V",
		garbageValue = "1025358410"
	)
	public static void method2056(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljd;II)V",
		garbageValue = "851372469"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3100 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3188 == null) {
				var0.field3188 = new int[var0.field3100.length];
			}

			var0.field3188[var1] = Integer.MAX_VALUE;
		}
	}
}
