import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class79 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -169818247
	)
	int field1147;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 219249737
	)
	int field1149;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -182694261
	)
	int field1148;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1052969373
	)
	int field1146;

	class79(int var1, int var2, int var3, int var4) {
		this.field1147 = var1;
		this.field1149 = var2;
		this.field1148 = var3;
		this.field1146 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	int method1989() {
		return this.field1147;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1303151140"
	)
	int method1976() {
		return this.field1149;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	int method1980() {
		return this.field1148;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "641578821"
	)
	int method1983() {
		return this.field1146;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "1868470928"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		Tiles.method1747(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 32) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			WorldMapSection2.method3289(var0, var4, var5, var6);
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "1"
	)
	static int method1977(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class255.method4875(var0, var1, var2);
		} else if (var0 < 1100) {
			return ModeWhere.method5243(var0, var1, var2);
		} else if (var0 < 1200) {
			return Varcs.method2037(var0, var1, var2);
		} else if (var0 < 1300) {
			return ItemContainer.method1785(var0, var1, var2);
		} else if (var0 < 1400) {
			return FontName.method6376(var0, var1, var2);
		} else if (var0 < 1500) {
			return InvDefinition.method2691(var0, var1, var2);
		} else if (var0 < 1600) {
			return AttackOption.method1994(var0, var1, var2);
		} else if (var0 < 1700) {
			return class6.method38(var0, var1, var2);
		} else if (var0 < 1800) {
			return class267.method4924(var0, var1, var2);
		} else if (var0 < 1900) {
			return WallDecoration.method4337(var0, var1, var2);
		} else if (var0 < 2000) {
			return GameObject.method4341(var0, var1, var2);
		} else if (var0 < 2100) {
			return ModeWhere.method5243(var0, var1, var2);
		} else if (var0 < 2200) {
			return Varcs.method2037(var0, var1, var2);
		} else if (var0 < 2300) {
			return ItemContainer.method1785(var0, var1, var2);
		} else if (var0 < 2400) {
			return FontName.method6376(var0, var1, var2);
		} else if (var0 < 2500) {
			return InvDefinition.method2691(var0, var1, var2);
		} else if (var0 < 2600) {
			return NPCComposition.method2841(var0, var1, var2);
		} else if (var0 < 2700) {
			return ArchiveDiskAction.method4944(var0, var1, var2);
		} else if (var0 < 2800) {
			return Buddy.method5914(var0, var1, var2);
		} else if (var0 < 2900) {
			return FontName.method6375(var0, var1, var2);
		} else if (var0 < 3000) {
			return GameObject.method4341(var0, var1, var2);
		} else if (var0 < 3200) {
			return Actor.method1887(var0, var1, var2);
		} else if (var0 < 3300) {
			return class122.method2507(var0, var1, var2);
		} else if (var0 < 3400) {
			return Canvas.method124(var0, var1, var2);
		} else if (var0 < 3500) {
			return PlayerComposition.method4755(var0, var1, var2);
		} else if (var0 < 3600) {
			return HealthBarDefinition.method2798(var0, var1, var2);
		} else if (var0 < 3700) {
			return GrandExchangeEvent.method5148(var0, var1, var2);
		} else if (var0 < 3800) {
			return class7.method52(var0, var1, var2);
		} else if (var0 < 3900) {
			return class98.method2207(var0, var1, var2);
		} else if (var0 < 4000) {
			return SequenceDefinition.method3165(var0, var1, var2);
		} else if (var0 < 4100) {
			return class234.method4463(var0, var1, var2);
		} else if (var0 < 4200) {
			return class119.method2472(var0, var1, var2);
		} else if (var0 < 4300) {
			return SceneTilePaint.method4323(var0, var1, var2);
		} else if (var0 < 5100) {
			return class125.method2550(var0, var1, var2);
		} else if (var0 < 5400) {
			return World.method1404(var0, var1, var2);
		} else if (var0 < 5600) {
			return Fonts.method6367(var0, var1, var2);
		} else if (var0 < 5700) {
			return MenuAction.method1656(var0, var1, var2);
		} else if (var0 < 6300) {
			return ItemComposition.method3095(var0, var1, var2);
		} else if (var0 < 6600) {
			return World.method1420(var0, var1, var2);
		} else if (var0 < 6700) {
			return WorldMapSection2.method3276(var0, var1, var2);
		} else if (var0 < 6800) {
			return class110.method2324(var0, var1, var2);
		} else if (var0 < 6900) {
			return GraphicsDefaults.method6024(var0, var1, var2);
		} else if (var0 < 7000) {
			return MouseRecorder.method1811(var0, var1, var2);
		} else if (var0 < 7100) {
			return FileSystem.method2621(var0, var1, var2);
		} else if (var0 < 7200) {
			return WorldMapRectangle.method3645(var0, var1, var2);
		} else {
			return var0 < 7300 ? WorldMapData_0.method3227(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("n")
	public static int method1990(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "796044449"
	)
	static boolean method1979() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
	}
}
