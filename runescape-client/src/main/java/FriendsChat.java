import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	@Export("owner")
	public String owner;
	@ObfuscatedName("k")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1806063027
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -432444385
	)
	int field3939;

	@ObfuscatedSignature(
		descriptor = "(Lny;Lld;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3939 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;",
		garbageValue = "396333118"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Llu;",
		garbageValue = "1129798936"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "711201950"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = FloorDecoration.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1349944727"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (var5 % 37L == 0L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = FloorDecoration.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "-11"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		long var5 = var2;
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) {
			if (0L == var2 % 37L) {
				var4 = null;
			} else {
				var7 = 0;

				for (long var8 = var2; var8 != 0L; var8 /= 37L) {
					++var7;
				}

				StringBuilder var10 = new StringBuilder(var7);

				while (var5 != 0L) {
					long var11 = var5;
					var5 /= 37L;
					var10.append(class320.base37Table[(int)(var11 - 37L * var5)]);
				}

				var4 = var10.reverse().toString();
			}
		} else {
			var4 = null;
		}

		this.readName(var4);
		this.minKick = var1.readByte();
		var7 = var1.readUnsignedByte();
		if (var7 != 255) {
			this.clear();

			for (int var13 = 0; var13 < var7; ++var13) {
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var14 = var1.readUnsignedShort();
				var9.set(var14, ++this.field3939 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "1745125855"
	)
	public final void method5971(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		ClanMate var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field3939 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1003784885"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1785573756"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llj;I)V",
		garbageValue = "-1946811966"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	static final void method5993() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (var0.plane == VertexNormal.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					if (var0.targetIndex > 0) {
						NPC var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, MidiPcmStream.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) {
						int var2 = -var0.targetIndex - 1;
						Player var3;
						if (var2 == Client.localPlayerIndex) {
							var3 = class67.localPlayer;
						} else {
							var3 = Client.players[var2];
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, MidiPcmStream.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					var0.advance(Client.field536);
					PlayerComposition.scene.drawEntity(VertexNormal.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljt;II)I",
		garbageValue = "-1200106583"
	)
	static final int method5992(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = HealthBarUpdate.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class87.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class67.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = HealthBarUpdate.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class87.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = Varcs.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (class67.localPlayer.x >> 7) + WorldMapSectionType.baseX;
					}

					if (var6 == 19) {
						var7 = (class67.localPlayer.y >> 7) + PlayerComposition.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
