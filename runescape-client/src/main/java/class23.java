import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class23 extends class14 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1984998217
	)
	int field181;
	@ObfuscatedName("o")
	byte field177;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class23(class2 var1) {
		this.this$0 = var1;
		this.field181 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field181 = var1.readUnsignedShort(); // L: 134
		this.field177 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method151(this.field181, this.field177); // L: 139
	} // L: 140

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)[Lim;",
		garbageValue = "128"
	)
	static GameBuild[] method344() {
		return new GameBuild[]{GameBuild.RC, GameBuild.WIP, GameBuild.LIVE, GameBuild.BUILDLIVE};
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1702727810"
	)
	public static String method346(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 11
			return "";
		} else if (var2 == 1) { // L: 12
			CharSequence var10 = var0[var1]; // L: 13
			return var10 == null ? "null" : var10.toString(); // L: 14 15
		} else {
			int var3 = var2 + var1; // L: 17
			int var4 = 0; // L: 18

			for (int var5 = var1; var5 < var3; ++var5) { // L: 19
				CharSequence var9 = var0[var5]; // L: 20
				if (var9 == null) { // L: 21
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 22
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 24

			for (int var6 = var1; var6 < var3; ++var6) { // L: 25
				CharSequence var7 = var0[var6]; // L: 26
				if (var7 == null) { // L: 27
					var8.append("null");
				} else {
					var8.append(var7); // L: 28
				}
			}

			return var8.toString(); // L: 30
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lko;",
		garbageValue = "467891308"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 92
		if (var1 != null) { // L: 93
			return var1;
		} else {
			byte[] var2 = Widget.ItemDefinition_archive.takeFile(10, var0); // L: 94
			var1 = new ItemComposition(); // L: 95
			var1.id = var0; // L: 96
			if (var2 != null) { // L: 97
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 98
			if (var1.noteTemplate != -1) { // L: 99
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 100
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 101
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!class21.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 102
				var1.name = "Members object"; // L: 103
				var1.isTradable = false; // L: 104
				var1.groundActions = null; // L: 105
				var1.inventoryActions = null; // L: 106
				var1.shiftClickIndex = -1; // L: 107
				var1.team = 0; // L: 108
				if (var1.params != null) { // L: 109
					boolean var3 = false; // L: 110

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 111
						ParamComposition var5 = UserComparator3.getParamDefinition((int)var4.key); // L: 112
						if (var5.autoDisable) { // L: 113
							var4.remove();
						} else {
							var3 = true; // L: 114
						}
					}

					if (!var3) { // L: 116
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 119
			return var1; // L: 120
		}
	}

	@ObfuscatedName("o")
	static boolean method341(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L); // L: 50
		return var2 == 2; // L: 52
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1393325468"
	)
	static int method345() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1268
			int var0 = 0; // L: 1269

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1270
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1271
			}

			return var0 * 10000 / Client.field740; // L: 1273
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2340
		class16.method259(); // L: 2341
		WorldMapArea.scene.clear(); // L: 2342

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2343
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2344
		PacketWriter.method2368(2); // L: 2345
		Client.currentTrackGroupId = -1; // L: 2346
		Client.field842 = false; // L: 2347

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 2349
			if (var1.stream1 != null) { // L: 2350
				Huffman.pcmStreamMixer.removeSubStream(var1.stream1); // L: 2351
				var1.stream1 = null; // L: 2352
			}

			if (var1.stream2 != null) { // L: 2354
				Huffman.pcmStreamMixer.removeSubStream(var1.stream2); // L: 2355
				var1.stream2 = null; // L: 2356
			}
		}

		ObjectSound.objectSounds.clear(); // L: 2359
		class20.updateGameState(10); // L: 2361
	} // L: 2362
}
