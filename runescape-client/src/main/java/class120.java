import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class120 {
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1039431283
	)
	public static int field1417;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -5578461861884698391L
	)
	long field1418;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 8528346205656473465L
	)
	long field1412;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	IterableNodeDeque field1410;

	@ObfuscatedSignature(
		descriptor = "(Lnv;)V"
	)
	public class120(Buffer var1) {
		this.field1412 = -1L;
		this.field1410 = new IterableNodeDeque();
		this.method2483(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "1"
	)
	void method2483(Buffer var1) {
		this.field1418 = var1.readLong();
		this.field1412 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class115(this);
			} else if (var2 == 4) {
				var3 = new class126(this);
			} else if (var2 == 3) {
				var3 = new class111(this);
			} else if (var2 == 2) {
				var3 = new class109(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class116(this);
			}

			((class119)var3).vmethod2558(var1);
			this.field1410.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "1046798651"
	)
	public void method2475(ClanChannel var1) {
		if (var1.key == this.field1418 && var1.field1433 == this.field1412) {
			for (class119 var2 = (class119)this.field1410.last(); var2 != null; var2 = (class119)this.field1410.previous()) {
				var2.vmethod2555(var1);
			}

			++var1.field1433;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "2"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		TaskHandler.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1217280037"
	)
	public static boolean method2484(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field38[var0] : false;
	}
}
