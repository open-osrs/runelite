import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("c")
	static boolean field2084;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2061102361
	)
	int field2079;
	@ObfuscatedName("n")
	public Map field2075;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1465456923
	)
	int field2082;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1046662309
	)
	int field2083;
	@ObfuscatedName("v")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("d")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("h")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("g")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1755183367
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("a")
	int[] field2089;
	@ObfuscatedName("u")
	boolean[] field2081;
	@ObfuscatedName("k")
	public boolean field2091;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -68245833
	)
	public int field2092;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1710656193
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1298879717
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1981709083
	)
	public int field2095;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2129353131
	)
	public int field2096;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2113674843
	)
	public int field2097;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1259669941
	)
	public int field2078;

	static {
		field2084 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.field2079 = -1;
		this.field2082 = 0;
		this.field2083 = 0;
		this.frameCount = -1;
		this.field2091 = false;
		this.field2092 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2095 = 99;
		this.field2096 = -1;
		this.field2097 = -1;
		this.field2078 = 2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-31"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "122"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field2089 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2089[var4] = var1.readUnsignedByte();
			}

			this.field2089[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2091 = true;
		} else if (var2 == 5) {
			this.field2092 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2095 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2096 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2097 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2078 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) {
			this.field2079 = var1.readInt();
		} else if (var2 == 15) {
			var3 = var1.readUnsignedShort();
			this.field2075 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2075.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2082 = var1.readUnsignedShort();
			this.field2083 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2081 = new boolean[256];

			for (var3 = 0; var3 < this.field2081.length; ++var3) {
				this.field2081[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2081[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-68"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2096 == -1) {
			if (this.field2089 == null && this.field2081 == null) {
				this.field2096 = 0;
			} else {
				this.field2096 = 2;
			}
		}

		if (this.field2097 == -1) {
			if (this.field2089 == null && this.field2081 == null) {
				this.field2097 = 0;
			} else {
				this.field2097 = 2;
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lgo;IB)Lgo;",
		garbageValue = "-89"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.method3690()) {
			var2 = this.frameIds[var2];
			Frames var5 = ItemComposition.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class120 var3 = JagexCache.method3064(this.field2079);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2695());
				var4.method4271(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgo;IIB)Lgo;",
		garbageValue = "-127"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.method3690()) {
			var2 = this.frameIds[var2];
			Frames var6 = ItemComposition.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			class120 var4 = JagexCache.method3064(this.field2079);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2695());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method4271(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgo;II)Lgo;",
		garbageValue = "2108768382"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.method3690()) {
			var2 = this.frameIds[var2];
			Frames var5 = ItemComposition.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class120 var3 = JagexCache.method3064(this.field2079);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2695());
				var4.method4271(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgo;ILgn;IB)Lgo;",
		garbageValue = "8"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2084 && !this.method3690() && !var3.method3690()) {
			return this.method3674(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			class120 var8;
			if (this.method3690()) {
				var8 = this.method3648();
				if (var3.method3690() && this.field2081 == null) {
					var5.method4271(var8, var2);
					return var5;
				}

				var5.method4202(var8, var2, this.field2081, false);
			} else {
				var2 = this.frameIds[var2];
				var7 = ItemComposition.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.method3690() && (this.field2089 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2089 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.method3690();
				if (!var6) {
					var5.method4203(var7, var2, this.field2089, false);
				}
			}

			if (var3.method3690()) {
				var8 = var3.method3648();
				var5.method4202(var8, var4, this.field2081, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var9 = ItemComposition.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var9 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4203(var9, var4, this.field2089, true);
			}

			if (var6 && var7 != null) {
				var5.method4203(var7, var2, this.field2089, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgo;ILgn;II)Lgo;",
		garbageValue = "-2136022860"
	)
	Model method3674(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = ItemComposition.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = ItemComposition.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2089);
				return var7;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgo;II)Lgo;",
		garbageValue = "1131668881"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.method3690()) {
			int var3 = this.frameIds[var2];
			Frames var4 = ItemComposition.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = ItemComposition.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1401537933"
	)
	public boolean method3690() {
		return this.field2079 >= 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2132950979"
	)
	public int method3647() {
		return this.field2083 - this.field2082;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Ldb;",
		garbageValue = "0"
	)
	public class120 method3648() {
		return this.method3690() ? JagexCache.method3064(this.field2079) : null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)Ljava/lang/String;",
		garbageValue = "-18009"
	)
	public static String method3689(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class410.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = PendingSpawn.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-942937629"
	)
	static int method3640(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (GameEngine.friendSystem.field778 == 0) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -2;
			} else if (GameEngine.friendSystem.field778 == 1) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GameEngine.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (GameEngine.friendSystem.method1728() && var3 >= 0 && var3 < GameEngine.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)GameEngine.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (GameEngine.friendSystem.method1728() && var3 >= 0 && var3 < GameEngine.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((Buddy)GameEngine.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (GameEngine.friendSystem.method1728() && var3 >= 0 && var3 < GameEngine.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((Buddy)GameEngine.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					class113.method2618(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					GameEngine.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					GameEngine.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					GameEngine.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					GameEngine.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var5 = AbstractWorldMapData.method4791(var5);
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GameEngine.friendSystem.isFriended(new Username(var5, class194.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Players.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Players.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Players.friendsChat != null) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Players.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Players.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((Buddy)Players.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((Buddy)Players.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Players.friendsChat != null ? Players.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					class409.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Players.friendsChat != null ? Players.friendsChat.rank * -577246511 * -541938127 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					class141.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapIcon_1.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!GameEngine.friendSystem.method1728()) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GameEngine.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					if (GameEngine.friendSystem.method1728() && var3 >= 0 && var3 < GameEngine.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)GameEngine.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var5 = AbstractWorldMapData.method4791(var5);
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GameEngine.friendSystem.isIgnored(new Username(var5, class194.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize() && Players.friendsChat.get(var3).getUsername().equals(class340.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Players.friendsChat != null && Players.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Players.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize() && ((ClanMate)Players.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						GameEngine.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							GameEngine.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							GameEngine.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							GameEngine.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (Players.friendsChat != null) {
								Players.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (Players.friendsChat != null) {
								Players.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							GameEngine.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (Players.friendsChat != null) {
								Players.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize() && ((ClanMate)Players.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
