import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("m")
	@Export("type")
	char type;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 745031589
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("o")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("g")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1027941323"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;S)V",
		garbageValue = "3920"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "310770628"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			byte var4 = var1.readByte();
			int var5 = var4 & 255;
			if (var5 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = class316.cp1252AsciiExtension[var5 - 128];
				if (var6 == 0) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			this.type = var3;
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "625331841"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lps;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Ljd;",
		garbageValue = "-1331542221"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class87.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1984835425"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "74"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			InterfaceParent.method2044(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1087 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}
