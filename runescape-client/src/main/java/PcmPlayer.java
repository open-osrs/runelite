import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("n")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 601053317
	)
	static int field181;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1026690965
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = -1867053569
	)
	static int field191;
	@ObfuscatedName("k")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -573586937
	)
	int field194;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = -7895856253910445283L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -297032647
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1767470059
	)
	int field180;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1732931535
	)
	int field188;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 8043569396608000723L
	)
	long field199;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2116258749
	)
	int field190;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1650298129
	)
	int field187;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1792598755
	)
	int field192;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 2388755460855453223L
	)
	long field193;
	@ObfuscatedName("g")
	boolean field197;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1290496951
	)
	int field195;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Laq;"
	)
	PcmStream[] field196;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Laq;"
	)
	PcmStream[] field189;

	protected PcmPlayer() {
		this.field194 = 32;
		this.timeMs = UrlRequester.method2125();
		this.field199 = 0L;
		this.field190 = 0;
		this.field187 = 0;
		this.field192 = 0;
		this.field193 = 0L;
		this.field197 = true;
		this.field195 = 0;
		this.field196 = new PcmStream[8];
		this.field189 = new PcmStream[8];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1805977814"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("j")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "168869451"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1574083924"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Laq;B)V",
		garbageValue = "91"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1727517788"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = UrlRequester.method2125();

			try {
				if (this.field199 != 0L) {
					if (var1 < this.field199) {
						return;
					}

					this.open(this.capacity);
					this.field199 = 0L;
					this.field197 = true;
				}

				int var3 = this.position();
				if (this.field192 - var3 > this.field190) {
					this.field190 = this.field192 - var3;
				}

				int var4 = this.field180 + this.field188;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field197 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field188 = var4 - this.field180;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field193) {
					if (!this.field197) {
						if (this.field190 == 0 && this.field187 == 0) {
							this.close();
							this.field199 = var1 + 2000L;
							return;
						}

						this.field188 = Math.min(this.field187, this.field190);
						this.field187 = this.field190;
					} else {
						this.field197 = false;
					}

					this.field190 = 0;
					this.field193 = 2000L + var1;
				}

				this.field192 = var3;
			} catch (Exception var7) {
				this.close();
				this.field199 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / GrandExchangeOfferAgeComparator.field3633);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1587146219"
	)
	public final void method479() {
		this.field197 = true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field197 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field199 = UrlRequester.method2125() + 2000L;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-440601518"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (BoundaryObject.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == BoundaryObject.soundSystem.players[var2]) {
					BoundaryObject.soundSystem.players[var2] = null;
				}

				if (BoundaryObject.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				ArchiveDisk.soundSystemExecutor.shutdownNow();
				ArchiveDisk.soundSystemExecutor = null;
				BoundaryObject.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-942351277"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field195 -= var1;
		if (this.field195 < 0) {
			this.field195 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("al")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class308.clearIntArray(var1, 0, var3);
		this.field195 -= var2;
		if (this.stream != null && this.field195 <= 0) {
			this.field195 += GrandExchangeOfferAgeComparator.field3633 >> 4;
			Canvas.PcmStream_disable(this.stream);
			this.method449(this.stream, this.stream.vmethod716());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label110:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field196[var7];

						label104:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label104;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod4662();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field194) {
										break label110;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field253; var14 != null; var14 = var11.nextSubStream()) {
											this.method449(var14, var15 * var14.vmethod716() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field196[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field189[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field196[var6];
				PcmStream[] var17 = this.field196;
				this.field189[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field195 < 0) {
			this.field195 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = UrlRequester.method2125();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Laq;II)V",
		garbageValue = "-1568864681"
	)
	final void method449(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field189[var3];
		if (var4 == null) {
			this.field196[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field189[var3] = var1;
		var1.field253 = var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Lew;",
		garbageValue = "-890968255"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "-1523482929"
	)
	static boolean method510(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lbp;",
		garbageValue = "1179967993"
	)
	static ClientPreferences method497() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = NPC.getPreferencesFile("", MouseRecorder.field975.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "1205757782"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1403206758"
	)
	static final void method506() {
		PacketBufferNode var0 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2656, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class161.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			AttackOption.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Ljava/lang/String;",
		garbageValue = "-2063390888"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class103.Widget_unpackTargetMask(MusicPatchNode.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
