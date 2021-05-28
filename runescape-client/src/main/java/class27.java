import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class27 extends class14 {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 2057684511
	)
	static int field231;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 718732187
	)
	int field227;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class27(class2 var1) {
		this.this$0 = var1;
		this.field227 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field227 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method109(this.field227); // L: 153
	} // L: 154

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I)V",
		garbageValue = "-1597980436"
	)
	public static void method277(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1927970682"
	)
	static int method280(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4158
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4163
				if (var0 == 6750) { // L: 4167
					++Interpreter.Interpreter_stringStackSize; // L: 4168
					return 1; // L: 4169
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4171
					if (var0 == 6754) { // L: 4175
						int var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4176
						NPCComposition var4 = StructComposition.getNpcDefinition(var3); // L: 4177
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4178
						return 1; // L: 4179
					} else {
						return 2; // L: 4181
					}
				} else {
					++class44.Interpreter_intStackSize; // L: 4172
					return 1; // L: 4173
				}
			} else {
				--class44.Interpreter_intStackSize; // L: 4164
				return 1; // L: 4165
			}
		} else {
			class44.Interpreter_intStackSize -= 2; // L: 4159
			--Interpreter.Interpreter_stringStackSize; // L: 4160
			return 1; // L: 4161
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-43"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field881) { // L: 3387
			class124.midiPcmStream.clear(); // L: 3389
			class232.musicPlayerStatus = 1; // L: 3390
			ModelData0.musicTrackArchive = null; // L: 3391
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && ObjectComposition.clientPreferences.musicVolume != 0 && !Client.field881) { // L: 3394
			Canvas.method395(2, UrlRequest.archive6, var0, 0, ObjectComposition.clientPreferences.musicVolume, false); // L: 3395
		}

		Client.currentTrackGroupId = var0; // L: 3397
	} // L: 3398

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-630332055"
	)
	static final void method283(int var0, int var1, int var2, int var3) {
		Client.field755 = 0; // L: 4987
		int var4 = (class93.localPlayer.x >> 7) + VertexNormal.baseX; // L: 4988
		int var5 = (class93.localPlayer.y >> 7) + SoundSystem.baseY; // L: 4989
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 4990
			Client.field755 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) { // L: 4991
			Client.field755 = 1;
		}

		if (Client.field755 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 4992
			Client.field755 = 0;
		}

	} // L: 4994

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "([Lio;IIIZI)V",
		garbageValue = "2021358420"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 9771
			Widget var6 = var0[var5]; // L: 9772
			if (var6 != null && var6.parentId == var1) { // L: 9773 9774
				Clock.alignWidgetSize(var6, var2, var3, var4); // L: 9775
				class24.alignWidgetPosition(var6, var2, var3); // L: 9776
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 9777
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 9778
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 9779
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 9780
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 9781
					class313.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 9783
}
