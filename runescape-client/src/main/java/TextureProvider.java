import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("du")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("y")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "[Leo;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljp;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1950202761
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 742782017
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("p")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1900729685
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		signature = "(Lic;Lic;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque();
		this.remaining = 0;
		this.brightness = 1.0D;
		this.textureSize = 128;
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		int var8 = var7.length;
		this.textures = new Texture[var1.getGroupFileCount(0)];

		for (int var9 = 0; var9 < var8; ++var9) {
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
			this.textures[var7[var9]] = new Texture(var10);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1846975444"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0;
		int var2 = 0;
		Texture[] var3 = this.textures;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			Texture var5 = var3[var4];
			if (var5 != null && var5.fileIds != null) {
				var1 += var5.fileIds.length;
				int[] var6 = var5.fileIds;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					int var8 = var6[var7];
					if (this.archive.method4359(var8)) {
						++var2;
					}
				}
			}
		}

		if (var1 == 0) {
			return 0;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("o")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)[I",
		garbageValue = "1948753683"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining;
				}

				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}

		return null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1038437362"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "54"
	)
	public boolean vmethod3404(int var1) {
		return this.textures[var1].field1650;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "18"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-426854674"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "245586965"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "1729691421"
	)
	static int method2888(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = KitDefinition.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemDefinition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				UrlRequester.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
				var5 = KitDefinition.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				UrlRequester.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
				var5 = KitDefinition.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = KitDefinition.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = KitDefinition.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemDefinition var6;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					var6 = KitDefinition.ItemDefinition_get(var3);
					if (var6.noteTemplate == -1 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					var6 = KitDefinition.ItemDefinition_get(var3);
					if (var6.noteTemplate >= 0 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = KitDefinition.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					var6 = KitDefinition.ItemDefinition_get(var3);
					if (var6.placeholderTemplate == -1 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					var6 = KitDefinition.ItemDefinition_get(var3);
					if (var6.placeholderTemplate >= 0 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					SpriteMask.findItemDefinitions(var7, var4 == 1);
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = TileItemPile.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						ArchiveLoader.foundItemIndex = 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (WorldMapScaleHandler.foundItemIds != null && ArchiveLoader.foundItemIndex < TileItemPile.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapScaleHandler.foundItemIds[++ArchiveLoader.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)I",
		garbageValue = "1974416966"
	)
	public static int method2873(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		signature = "(IIZB)V",
		garbageValue = "-64"
	)
	static final void method2900(int var0, int var1, boolean var2) {
		if (!var2 || var0 != WorldMapCacheName.field328 || class22.field104 != var1) {
			WorldMapCacheName.field328 = var0;
			class22.field104 = var1;
			ClientPreferences.updateGameState(25);
			ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class182.baseX;
			int var4 = SecureRandomFuture.baseY;
			class182.baseX = (var0 - 6) * 8;
			SecureRandomFuture.baseY = (var1 - 6) * 8;
			int var5 = class182.baseX - var3;
			int var6 = SecureRandomFuture.baseY - var4;
			var3 = class182.baseX;
			var4 = SecureRandomFuture.baseY;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var8 = Client.npcs[var7];
				if (var8 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var8.pathX;
						var10000[var9] -= var5;
						var10000 = var8.pathY;
						var10000[var9] -= var6;
					}

					var8.x -= var5 * 128;
					var8.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var21 = Client.players[var7];
				if (var21 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var21.pathX;
						var10000[var9] -= var5;
						var10000 = var21.pathY;
						var10000[var9] -= var6;
					}

					var21.x -= var5 * 128;
					var21.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var18 = 104;
			byte var22 = 1;
			if (var5 < 0) {
				var20 = 103;
				var18 = -1;
				var22 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var18 != var13; var13 += var22) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.last(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var19.x -= var5;
				var19.y -= var6;
				if (var19.x < 0 || var19.y < 0 || var19.x >= 104 || var19.y >= 104) {
					var19.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			MouseHandler.cameraX -= var5 << 7;
			ObjectSound.cameraZ -= var6 << 7;
			class225.oculusOrbFocalPointX -= var5 << 7;
			HealthBarDefinition.oculusOrbFocalPointY -= var6 << 7;
			Client.field937 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}
}
