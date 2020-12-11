import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1380465553
	)
	int field3657;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lmu;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 17
		this.field3657 = 1; // L: 13
		this.friendLoginUpdates = new LinkDeque(); // L: 14
		this.loginType = var1; // L: 18
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lju;",
		garbageValue = "-99"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Lju;",
		garbageValue = "-1524839332"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 26
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lki;ZB)Z",
		garbageValue = "-6"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 30
		if (var3 == null) { // L: 31
			return false;
		} else {
			return !var2 || var3.world != 0; // L: 32
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "-1122558022"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 37
				boolean var3 = var1.readUnsignedByte() == 1; // L: 38
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 39
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 40
				int var6 = var1.readUnsignedShort(); // L: 41
				int var7 = var1.readUnsignedByte(); // L: 42
				int var8 = var1.readUnsignedByte(); // L: 43
				boolean var9 = (var8 & 2) != 0; // L: 44
				boolean var10 = (var8 & 1) != 0; // L: 45
				if (var6 > 0) { // L: 46
					var1.readStringCp1252NullTerminated(); // L: 47
					var1.readUnsignedByte(); // L: 48
					var1.readInt(); // L: 49
				}

				var1.readStringCp1252NullTerminated(); // L: 51
				if (var4 != null && var4.hasCleanName()) { // L: 52
					Friend var11 = (Friend)this.getByCurrentUsername(var4);
					if (var3) {
						Friend var12 = (Friend)this.getByCurrentUsername(var5);
						if (var12 != null && var12 != var11) {
							if (var11 != null) {
								this.remove(var12);
							} else {
								var11 = var12;
							}
						}
					}

					if (var11 != null) {
						this.changeName(var11, var4, var5);
						if (var6 != var11.world) {
							boolean var14 = true; // L: 68

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 69
								if (var13.username.equals(var4)) { // L: 70
									if (var6 != 0 && var13.world == 0) {
										var13.remove();
										var14 = false;
									} else if (var6 == 0 && var13.world != 0) {
										var13.remove();
										var14 = false;
									}
								}
							}

							if (var14) {
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 84
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 85
					}

					if (var6 != var11.world) {
						var11.int2 = ++this.field3657 - 1;
						if (var11.world == -1 && var6 == 0) {
							var11.int2 = -(var11.int2 * -579950033) * 503110863;
						}

						var11.world = var6;
					}

					var11.rank = var7;
					var11.field3666 = var9;
					var11.field3667 = var10;
					continue;
				}

				throw new IllegalStateException();
			}

			this.sort();
			return; // L: 98
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "754468419"
	)
	static void method5222(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 53
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 54
				int var5 = 0; // L: 55
				if (var1 > var4.field1073) { // L: 56
					var5 += var1 - var4.field1073;
				} else if (var1 < var4.x) { // L: 57
					var5 += var4.x - var1;
				}

				if (var2 > var4.field1078) { // L: 58
					var5 += var2 - var4.field1078;
				} else if (var2 < var4.y) { // L: 59
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field1086 && Timer.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) { // L: 60
					var5 -= 64; // L: 71
					if (var5 < 0) { // L: 72
						var5 = 0;
					}

					int var6 = (var4.field1086 - var5) * Timer.clientPreferences.areaSoundEffectsVolume / var4.field1086; // L: 73
					if (var4.stream1 == null) { // L: 74
						if (var4.soundEffectId >= 0) { // L: 75
							SoundEffect var7 = SoundEffect.readSoundEffect(class227.archive4, var4.soundEffectId, 0); // L: 76
							if (var7 != null) { // L: 77
								RawSound var8 = var7.toRawSound().resample(TileItemPile.decimator); // L: 78
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 79
								var9.setNumLoops(-1); // L: 80
								WorldMapManager.pcmStreamMixer.addSubStream(var9); // L: 81
								var4.stream1 = var9; // L: 82
							}
						}
					} else {
						var4.stream1.method2610(var6); // L: 86
					}

					if (var4.stream2 == null) { // L: 87
						if (var4.soundEffectIds != null && (var4.field1081 -= var3) <= 0) { // L: 88
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 89
							SoundEffect var12 = SoundEffect.readSoundEffect(class227.archive4, var4.soundEffectIds[var11], 0); // L: 90
							if (var12 != null) { // L: 91
								RawSound var13 = var12.toRawSound().resample(TileItemPile.decimator); // L: 92
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 93
								var10.setNumLoops(0); // L: 94
								WorldMapManager.pcmStreamMixer.addSubStream(var10); // L: 95
								var4.stream2 = var10; // L: 96
								var4.field1081 = var4.field1085 + (int)(Math.random() * (double)(var4.field1083 - var4.field1085)); // L: 97
							}
						}
					} else {
						var4.stream2.method2610(var6); // L: 102
						if (!var4.stream2.hasNext()) { // L: 103
							var4.stream2 = null; // L: 104
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 61
						WorldMapManager.pcmStreamMixer.removeSubStream(var4.stream1); // L: 62
						var4.stream1 = null; // L: 63
					}

					if (var4.stream2 != null) { // L: 65
						WorldMapManager.pcmStreamMixer.removeSubStream(var4.stream2); // L: 66
						var4.stream2 = null; // L: 67
					}
				}
			}
		}

	} // L: 108
}
