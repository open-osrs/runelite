import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1197166297
	)
	int field4103;
	@ObfuscatedName("ao")
	boolean field4096;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1040893309
	)
	int field4097;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1392249455
	)
	int field4098;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1075806637
	)
	int field4109;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -530796901
	)
	int field4100;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1276768227
	)
	int field4101;
	@ObfuscatedName("ac")
	boolean field4107;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2099427815
	)
	int field4099;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1412007133
	)
	int field4104;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -309561397
	)
	int field4105;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 401410233
	)
	int field4106;
	@ObfuscatedName("aj")
	String field4110;
	@ObfuscatedName("am")
	String field4084;
	@ObfuscatedName("aw")
	String field4094;
	@ObfuscatedName("az")
	String field4095;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 646549057
	)
	int field4090;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1327131373
	)
	int field4118;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1421225597
	)
	int field4112;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -988523473
	)
	int field4114;
	@ObfuscatedName("bt")
	String field4115;
	@ObfuscatedName("bg")
	String field4113;
	@ObfuscatedName("bf")
	int[] field4108;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1802718035
	)
	int field4117;
	@ObfuscatedName("bo")
	String field4119;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4108 = new int[3];
		this.field4103 = var1;
		this.field4096 = var2;
		this.field4097 = var3;
		this.field4098 = var4;
		this.field4109 = var5;
		this.field4100 = var6;
		this.field4101 = var7;
		this.field4107 = var8;
		this.field4099 = var9;
		this.field4104 = var10;
		this.field4105 = var11;
		this.field4106 = var12;
		this.field4110 = var13;
		this.field4084 = var14;
		this.field4094 = var15;
		this.field4095 = var16;
		this.field4090 = var17;
		this.field4118 = var18;
		this.field4112 = var19;
		this.field4114 = var20;
		this.field4115 = var21;
		this.field4113 = var22;
		this.field4108 = var23;
		this.field4117 = var24;
		this.field4119 = var25;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "92"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field4103);
		var1.writeByte(this.field4096 ? 1 : 0);
		var1.writeShort(this.field4097);
		var1.writeByte(this.field4098);
		var1.writeByte(this.field4109);
		var1.writeByte(this.field4100);
		var1.writeByte(this.field4101);
		var1.writeByte(this.field4107 ? 1 : 0);
		var1.writeShort(this.field4099);
		var1.writeByte(this.field4104);
		var1.writeMedium(this.field4105);
		var1.writeShort(this.field4106);
		var1.writeStringCp1252NullCircumfixed(this.field4110);
		var1.writeStringCp1252NullCircumfixed(this.field4084);
		var1.writeStringCp1252NullCircumfixed(this.field4094);
		var1.writeStringCp1252NullCircumfixed(this.field4095);
		var1.writeByte(this.field4118);
		var1.writeShort(this.field4090);
		var1.writeStringCp1252NullCircumfixed(this.field4115);
		var1.writeStringCp1252NullCircumfixed(this.field4113);
		var1.writeByte(this.field4112);
		var1.writeByte(this.field4114);

		for (int var2 = 0; var2 < this.field4108.length; ++var2) {
			var1.writeInt(this.field4108[var2]);
		}

		var1.writeInt(this.field4117);
		var1.writeStringCp1252NullCircumfixed(this.field4119);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-695384014"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class28.method414(this.field4110);
		var2 += class28.method414(this.field4084);
		var2 += class28.method414(this.field4094);
		var2 += class28.method414(this.field4095);
		var2 += class28.method414(this.field4115);
		var2 += class28.method414(this.field4113);
		var2 += class28.method414(this.field4119);
		return var2;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "2"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2763, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7029(var3);
			var8.packetBuffer.method7029(PacketBufferNode.selectedItemId);
			var8.packetBuffer.method7066(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6930(PlayerComposition.baseY + var1);
			var8.packetBuffer.writeShort(var0 + WorldMapSectionType.baseX);
			var8.packetBuffer.writeIntME(UserComparator6.selectedItemWidget);
			var8.packetBuffer.writeShort(ArchiveDiskAction.selectedItemSlot);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2728, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6931(Client.field647);
			var8.packetBuffer.method6942(ModelData0.selectedSpellWidget);
			var8.packetBuffer.method6931(var0 + WorldMapSectionType.baseX);
			var8.packetBuffer.method6930(PlayerComposition.baseY + var1);
			var8.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method7029(Client.selectedSpellChildIndex);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2762, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7029(var3);
			var8.packetBuffer.method7026(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7029(PlayerComposition.baseY + var1);
			var8.packetBuffer.method7029(var0 + WorldMapSectionType.baseX);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2708, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7029(PlayerComposition.baseY + var1);
			var8.packetBuffer.method6931(var0 + WorldMapSectionType.baseX);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6931(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2712, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6930(PlayerComposition.baseY + var1);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7029(var0 + WorldMapSectionType.baseX);
			var8.packetBuffer.method6931(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2700, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6931(PlayerComposition.baseY + var1);
			var8.packetBuffer.method6931(var0 + WorldMapSectionType.baseX);
			var8.packetBuffer.method7026(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7029(var3);
			Client.packetWriter.addNode(var8);
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2717, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6942(UserComparator6.selectedItemWidget);
					var9.packetBuffer.method6931(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6930(PacketBufferNode.selectedItemId);
					var9.packetBuffer.method6930(ArchiveDiskAction.selectedItemSlot);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2747, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6930(Client.selectedSpellChildIndex);
					var9.packetBuffer.method7029(var3);
					var9.packetBuffer.method6940(ModelData0.selectedSpellWidget);
					var9.packetBuffer.method7066(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(Client.field647);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2729, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2721, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7066(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6931(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2711, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6930(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2691, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2733, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6931(var3);
					var9.packetBuffer.method7026(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2753, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6931(ArchiveDiskAction.selectedItemSlot);
						var9.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6940(UserComparator6.selectedItemWidget);
						var9.packetBuffer.method7029(PacketBufferNode.selectedItemId);
						var9.packetBuffer.method6931(var3);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2764, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6942(ModelData0.selectedSpellWidget);
						var9.packetBuffer.method6931(var3);
						var9.packetBuffer.method6931(Client.field647);
						var9.packetBuffer.method6931(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2681, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6931(var3);
					var8.packetBuffer.writeShort(PacketBufferNode.selectedItemId);
					var8.packetBuffer.writeInt(UserComparator6.selectedItemWidget);
					var8.packetBuffer.method7029(PlayerComposition.baseY + var1);
					var8.packetBuffer.method6930(ArchiveDiskAction.selectedItemSlot);
					var8.packetBuffer.method6931(var0 + WorldMapSectionType.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2672, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6930(PlayerComposition.baseY + var1);
					var8.packetBuffer.method6930(var3);
					var8.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var8.packetBuffer.method7029(Client.field647);
					var8.packetBuffer.method6931(var0 + WorldMapSectionType.baseX);
					var8.packetBuffer.method6942(ModelData0.selectedSpellWidget);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2683, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6930(PlayerComposition.baseY + var1);
					var8.packetBuffer.writeShort(var0 + WorldMapSectionType.baseX);
					var8.packetBuffer.method6931(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2692, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method7029(var0 + WorldMapSectionType.baseX);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6931(PlayerComposition.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2707, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6930(PlayerComposition.baseY + var1);
					var8.packetBuffer.writeShort(var0 + WorldMapSectionType.baseX);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7029(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2663, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7029(var3);
					var8.packetBuffer.method7026(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6931(var0 + WorldMapSectionType.baseX);
					var8.packetBuffer.method7029(PlayerComposition.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2736, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7026(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(var0 + WorldMapSectionType.baseX);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method7029(PlayerComposition.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						PlayerComposition.scene.setViewportWalking();
					} else {
						PlayerComposition.scene.menuOpen(VertexNormal.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = HealthBarUpdate.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = class244.method4661(var16);
						}

						if (var12) {
							var11 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher);
							var11.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var11);
						}
					} else {
						if (var2 == 25) {
							var16 = ViewportMouse.getWidgetChild(var1, var0);
							if (var16 != null) {
								class258.Widget_runOnTargetLeave();
								ArchiveDiskAction.selectSpell(var1, var0, Interpreter.Widget_unpackTargetMask(WorldMapRegion.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = GameEngine.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + FloorUnderlayDefinition.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = FloorUnderlayDefinition.colorStartTag(65280) + var16.spellName + FloorUnderlayDefinition.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							WorldMapLabelSize.method3445();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = HealthBarUpdate.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									NetSocket.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = HealthBarUpdate.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										NetSocket.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									Decimator.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ViewportMouse.getWidgetChild(var1, var0);
									class16.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2716, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(PacketBufferNode.selectedItemId);
								var8.packetBuffer.method6940(var1);
								var8.packetBuffer.writeShort(ArchiveDiskAction.selectedItemSlot);
								var8.packetBuffer.method7029(var0);
								var8.packetBuffer.method7029(var3);
								var8.packetBuffer.writeIntME(UserComparator6.selectedItemWidget);
								Client.packetWriter.addNode(var8);
								Client.field620 = 0;
								class7.field31 = HealthBarUpdate.getWidget(var1);
								Client.field597 = var0;
							} else if (var2 == 32) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2719, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
								var8.packetBuffer.method7029(var0);
								var8.packetBuffer.method7029(var3);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.writeIntME(ModelData0.selectedSpellWidget);
								Client.packetWriter.addNode(var8);
								Client.field620 = 0;
								class7.field31 = HealthBarUpdate.getWidget(var1);
								Client.field597 = var0;
							} else if (var2 == 33) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6940(var1);
								var8.packetBuffer.method6930(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field620 = 0;
								class7.field31 = HealthBarUpdate.getWidget(var1);
								Client.field597 = var0;
							} else if (var2 == 34) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2731, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7029(var0);
								var8.packetBuffer.method6930(var3);
								var8.packetBuffer.writeIntME(var1);
								Client.packetWriter.addNode(var8);
								Client.field620 = 0;
								class7.field31 = HealthBarUpdate.getWidget(var1);
								Client.field597 = var0;
							} else if (var2 == 35) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2714, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6931(var3);
								var8.packetBuffer.method6940(var1);
								var8.packetBuffer.method6931(var0);
								Client.packetWriter.addNode(var8);
								Client.field620 = 0;
								class7.field31 = HealthBarUpdate.getWidget(var1);
								Client.field597 = var0;
							} else if (var2 == 36) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2685, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6931(var0);
								var8.packetBuffer.method7029(var3);
								var8.packetBuffer.method6942(var1);
								Client.packetWriter.addNode(var8);
								Client.field620 = 0;
								class7.field31 = HealthBarUpdate.getWidget(var1);
								Client.field597 = var0;
							} else if (var2 == 37) {
								var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2659, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6930(var3);
								var8.packetBuffer.method6942(var1);
								var8.packetBuffer.writeShort(var0);
								Client.packetWriter.addNode(var8);
								Client.field620 = 0;
								class7.field31 = HealthBarUpdate.getWidget(var1);
								Client.field597 = var0;
							} else {
								if (var2 == 38) {
									class258.Widget_runOnTargetLeave();
									var16 = HealthBarUpdate.getWidget(var1);
									Client.isItemSelected = 1;
									ArchiveDiskAction.selectedItemSlot = var0;
									UserComparator6.selectedItemWidget = var1;
									PacketBufferNode.selectedItemId = var3;
									class16.invalidateWidget(var16);
									Client.selectedItemName = FloorUnderlayDefinition.colorStartTag(16748608) + class87.ItemDefinition_get(var3).name + FloorUnderlayDefinition.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2726, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6942(var1);
									var8.packetBuffer.method6931(var3);
									var8.packetBuffer.method6930(var0);
									Client.packetWriter.addNode(var8);
									Client.field620 = 0;
									class7.field31 = HealthBarUpdate.getWidget(var1);
									Client.field597 = var0;
								} else if (var2 == 40) {
									var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6931(var3);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var8);
									Client.field620 = 0;
									class7.field31 = HealthBarUpdate.getWidget(var1);
									Client.field597 = var0;
								} else if (var2 == 41) {
									var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2699, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.method6930(var0);
									var8.packetBuffer.writeShort(var3);
									Client.packetWriter.addNode(var8);
									Client.field620 = 0;
									class7.field31 = HealthBarUpdate.getWidget(var1);
									Client.field597 = var0;
								} else if (var2 == 42) {
									var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2722, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6940(var1);
									var8.packetBuffer.method7029(var3);
									var8.packetBuffer.method6931(var0);
									Client.packetWriter.addNode(var8);
									Client.field620 = 0;
									class7.field31 = HealthBarUpdate.getWidget(var1);
									Client.field597 = var0;
								} else if (var2 == 43) {
									var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2689, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7029(var3);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field620 = 0;
									class7.field31 = HealthBarUpdate.getWidget(var1);
									Client.field597 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2740, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6930(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2761, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6931(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6931(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2682, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6931(var3);
										var9.packetBuffer.method7066(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2678, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6930(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2695, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7066(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6930(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2709, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7029(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2662, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7029(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label638: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ViewportMouse.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6942(ModelData0.selectedSpellWidget);
													var9.packetBuffer.method6942(var1);
													var9.packetBuffer.method6931(var16.itemId);
													var9.packetBuffer.method6930(Client.field647);
													var9.packetBuffer.method6930(var0);
													var9.packetBuffer.method7029(Client.selectedSpellChildIndex);
													Client.packetWriter.addNode(var9);
												}
												break label638;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2701, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6930(var3);
												var8.packetBuffer.method6930(PlayerComposition.baseY + var1);
												var8.packetBuffer.method6930(var0 + WorldMapSectionType.baseX);
												var8.packetBuffer.method7066(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												Client.packetWriter.addNode(var8);
												break label638;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2693, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method7029(var3);
												Client.packetWriter.addNode(var8);
												break label638;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var13 = Client.npcs[var3];
												if (var13 != null) {
													NPCComposition var17 = var13.definition;
													if (var17.transforms != null) {
														var17 = var17.transform();
													}

													if (var17 != null) {
														var11 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2759, Client.packetWriter.isaacCipher);
														var11.packetBuffer.method6931(var17.id);
														Client.packetWriter.addNode(var11);
													}
												}
												break label638;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2751, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6930(var3);
												Client.packetWriter.addNode(var8);
												break label638;
											}

											if (var2 == 1005) {
												var16 = HealthBarUpdate.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													GraphicsDefaults.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class87.ItemDefinition_get(var3).name);
												} else {
													var9 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2751, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6930(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field620 = 0;
												class7.field31 = HealthBarUpdate.getWidget(var1);
												Client.field597 = var0;
												break label638;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1011 || var2 == 1008 || var2 == 1012 || var2 == 1010) {
													TileItem.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label638;
											}
										}

										var16 = ViewportMouse.getWidgetChild(var1, var0);
										if (var16 != null) {
											ReflectionCheck.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) {
			Client.isItemSelected = 0;
			class16.invalidateWidget(HealthBarUpdate.getWidget(UserComparator6.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			class258.Widget_runOnTargetLeave();
		}

		if (class7.field31 != null && Client.field620 == 0) {
			class16.invalidateWidget(class7.field31);
		}

	}
}
