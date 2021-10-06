import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("l")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("q")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("m")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("k")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2080769600"
	)
	@Export("close")
	public final void close() {
		synchronized(this) {
			this.isClosed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;S)Lep;",
		garbageValue = "3207"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lep;",
		garbageValue = "-1536302643"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lep;",
		garbageValue = "1508388325"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) {
						return;
					}

					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type;
				if (var5 == 1) {
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.objectArgument);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-117"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			GameBuild.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < BuddyRankComparator.method2458(); ++var8) {
			long var24 = WorldMapSection1.method3912(var8);
			if (var24 != var6) {
				var6 = var24;
				int var11 = UserComparator1.method7162(var8);
				int var12 = ItemComposition.method3327(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var13 = var12;
				long var16 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var15 = (int)(var16 >>> 14 & 3L);
				int var26 = InterfaceParent.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var17 = var26;
				if (var15 == 2 && PlayerComposition.scene.getObjectFlags(VertexNormal.Client_plane, var11, var12, var24) >= 0) {
					ObjectComposition var18 = class245.getObjectDefinition(var26);
					if (var18.transforms != null) {
						var18 = var18.transform();
					}

					if (var18 == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						GameBuild.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(65535) + var18.name, 1, var26, var11, var12);
					} else if (Client.isSpellSelected) {
						if ((ObjectComposition.selectedSpellFlags & 4) == 4) {
							GameBuild.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(65535) + var18.name, 2, var26, var11, var12);
						}
					} else {
						String[] var19 = var18.actions;
						if (var19 != null) {
							for (int var20 = 4; var20 >= 0; --var20) {
								if (var19[var20] != null) {
									short var21 = 0;
									if (var20 == 0) {
										var21 = 3;
									}

									if (var20 == 1) {
										var21 = 4;
									}

									if (var20 == 2) {
										var21 = 5;
									}

									if (var20 == 3) {
										var21 = 6;
									}

									if (var20 == 4) {
										var21 = 1001;
									}

									GameBuild.insertMenuItemNoShift(var19[var20], FloorUnderlayDefinition.colorStartTag(65535) + var18.name, var21, var17, var11, var13);
								}
							}
						}

						GameBuild.insertMenuItemNoShift("Examine", FloorUnderlayDefinition.colorStartTag(65535) + var18.name, 1002, var18.id, var11, var13);
					}
				}

				Player var22;
				int var27;
				NPC var28;
				int var35;
				int[] var36;
				if (var15 == 1) {
					NPC var31 = Client.npcs[var17];
					if (var31 == null) {
						continue;
					}

					if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) {
						for (var27 = 0; var27 < Client.npcCount; ++var27) {
							var28 = Client.npcs[Client.npcIndices[var27]];
							if (var28 != null && var31 != var28 && var28.definition.size == 1 && var31.x == var28.x && var31.y == var28.y) {
								class275.addNpcToMenu(var28.definition, Client.npcIndices[var27], var11, var13);
							}
						}

						var27 = Players.Players_count;
						var36 = Players.Players_indices;

						for (var35 = 0; var35 < var27; ++var35) {
							var22 = Client.players[var36[var35]];
							if (var22 != null && var31.x == var22.x && var22.y == var31.y) {
								ScriptFrame.addPlayerToMenu(var22, var36[var35], var11, var13);
							}
						}
					}

					class275.addNpcToMenu(var31.definition, var17, var11, var13);
				}

				if (var15 == 0) {
					Player var32 = Client.players[var17];
					if (var32 == null) {
						continue;
					}

					if ((var32.x & 127) == 64 && (var32.y & 127) == 64) {
						for (var27 = 0; var27 < Client.npcCount; ++var27) {
							var28 = Client.npcs[Client.npcIndices[var27]];
							if (var28 != null && var28.definition.size == 1 && var32.x == var28.x && var28.y == var32.y) {
								class275.addNpcToMenu(var28.definition, Client.npcIndices[var27], var11, var13);
							}
						}

						var27 = Players.Players_count;
						var36 = Players.Players_indices;

						for (var35 = 0; var35 < var27; ++var35) {
							var22 = Client.players[var36[var35]];
							if (var22 != null && var22 != var32 && var22.x == var32.x && var22.y == var32.y) {
								ScriptFrame.addPlayerToMenu(var22, var36[var35], var11, var13);
							}
						}
					}

					if (var17 != Client.combatTargetPlayerIndex) {
						ScriptFrame.addPlayerToMenu(var32, var17, var11, var13);
					} else {
						var4 = var24;
					}
				}

				if (var15 == 3) {
					NodeDeque var34 = Client.groundItems[VertexNormal.Client_plane][var11][var13];
					if (var34 != null) {
						for (TileItem var33 = (TileItem)var34.first(); var33 != null; var33 = (TileItem)var34.next()) {
							ItemComposition var37 = class87.ItemDefinition_get(var33.id);
							if (Client.isItemSelected == 1) {
								GameBuild.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(16748608) + var37.name, 16, var33.id, var11, var13);
							} else if (Client.isSpellSelected) {
								if ((ObjectComposition.selectedSpellFlags & 1) == 1) {
									GameBuild.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(16748608) + var37.name, 17, var33.id, var11, var13);
								}
							} else {
								String[] var29 = var37.groundActions;

								for (int var30 = 4; var30 >= 0; --var30) {
									if (var29 != null && var29[var30] != null) {
										byte var23 = 0;
										if (var30 == 0) {
											var23 = 18;
										}

										if (var30 == 1) {
											var23 = 19;
										}

										if (var30 == 2) {
											var23 = 20;
										}

										if (var30 == 3) {
											var23 = 21;
										}

										if (var30 == 4) {
											var23 = 22;
										}

										GameBuild.insertMenuItemNoShift(var29[var30], FloorUnderlayDefinition.colorStartTag(16748608) + var37.name, var23, var33.id, var11, var13);
									} else if (var30 == 2) {
										GameBuild.insertMenuItemNoShift("Take", FloorUnderlayDefinition.colorStartTag(16748608) + var37.name, 20, var33.id, var11, var13);
									}
								}

								GameBuild.insertMenuItemNoShift("Examine", FloorUnderlayDefinition.colorStartTag(16748608) + var37.name, 1004, var33.id, var11, var13);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = Widget.method5030(var4);
			int var9 = ItemComposition.method3327(var4);
			Player var10 = Client.players[Client.combatTargetPlayerIndex];
			ScriptFrame.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9);
		}

	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "([Ljt;Ljt;ZB)V",
		garbageValue = "8"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * -1993150083 * 873320405 : var1.width * -2019463933 * -351378005;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * 1068415699 * -118379173 : var1.height * 1232982299 * -1955651309;
		WorldMapSection1.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			WorldMapSection1.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			Canvas.method380(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
