import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("l")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("q")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("f")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("j")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("t")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 64228111
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1225005773
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("i")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1364680617
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 562282025
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lew;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false;
		this.outLength = 0;
		this.outOffset = 0;
		this.exceptionWriting = false;
		this.taskHandler = var2;
		this.socket = var1;
		this.bufferLength = var3;
		this.maxPacketLength = var3 - 100;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) {
			synchronized(this) {
				this.isClosed = true;
				this.notifyAll();
			}

			if (this.task != null) {
				while (this.task.status == 0) {
					class121.method2542(1L);
				}

				if (this.task.status == 1) {
					try {
						((Thread)this.task.result).join();
					} catch (InterruptedException var3) {
					}
				}
			}

			this.task = null;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1780579727"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-973037380"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1444896063"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) {
			return false;
		} else {
			return this.inputStream.available() >= var1;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-95"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) {
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) {
				var5 = this.inputStream.read(var1, var2, var3);
				if (var5 <= 0) {
					throw new EOFException();
				}

				var2 += var5;
			}

			return var4;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-595308050"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) {
			if (this.exceptionWriting) {
				this.exceptionWriting = false;
				throw new IOException();
			} else {
				if (this.outBuffer == null) {
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						this.outBuffer[this.outOffset] = var1[var5 + var2];
						this.outOffset = (this.outOffset + 1) % this.bufferLength;
						if ((this.maxPacketLength + this.outLength) % this.bufferLength == this.outOffset) {
							throw new IOException();
						}
					}

					if (this.task == null) {
						this.task = this.taskHandler.newThreadTask(this, 3);
					}

					this.notifyAll();
				}
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "34744814"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3);
	}

	protected void finalize() {
		this.close();
	}

	public void run() {
		try {
			while (true) {
				label84: {
					int var1;
					int var2;
					synchronized(this) {
						if (this.outOffset == this.outLength) {
							if (this.isClosed) {
								break label84;
							}

							try {
								this.wait();
							} catch (InterruptedException var10) {
							}
						}

						var2 = this.outLength;
						if (this.outOffset >= this.outLength) {
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength;
						}
					}

					if (var1 <= 0) {
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1);
					} catch (IOException var9) {
						this.exceptionWriting = true;
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength;

					try {
						if (this.outOffset == this.outLength) {
							this.outputStream.flush();
						}
					} catch (IOException var8) {
						this.exceptionWriting = true;
					}
					continue;
				}

				try {
					if (this.inputStream != null) {
						this.inputStream.close();
					}

					if (this.outputStream != null) {
						this.outputStream.close();
					}

					if (this.socket != null) {
						this.socket.close();
					}
				} catch (IOException var7) {
				}

				this.outBuffer = null;
				break;
			}
		} catch (Exception var12) {
			Timer.RunException_sendStackTrace((String)null, var12);
		}

	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "([Ljt;IIIIIIII)V",
		garbageValue = "-1869805542"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || WorldMapRegion.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (ObjectSound.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != VarpDefinition.mousedOverWidgetIf1 && ObjectSound.isComponentHidden(var9)) {
					continue;
				}

				int var10 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					if (var9.type == 9) {
						var16 = var10;
						var17 = var11;
						var18 = var10 + var9.width;
						int var19 = var11 + var9.height;
						if (var18 < var10) {
							var16 = var18;
							var18 = var10;
						}

						if (var19 < var11) {
							var17 = var19;
							var19 = var11;
						}

						++var18;
						++var19;
						var12 = var16 > var2 ? var16 : var2;
						var13 = var17 > var3 ? var17 : var3;
						var14 = var18 < var4 ? var18 : var4;
						var15 = var19 < var5 ? var19 : var5;
					} else {
						var16 = var10 + var9.width;
						var17 = var11 + var9.height;
						var12 = var10 > var2 ? var10 : var2;
						var13 = var11 > var3 ? var11 : var3;
						var14 = var16 < var4 ? var16 : var4;
						var15 = var17 < var5 ? var17 : var5;
					}
				}

				if (var9 == Client.clickedWidget) {
					Client.field671 = true;
					Client.field672 = var10;
					Client.field608 = var11;
				}

				boolean var33 = false;
				if (var9.field3121) {
					switch(Client.field509) {
					case 0:
						var33 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field673 == var9.id >>> 16) {
							var33 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field673) {
							var33 = true;
						}
					}
				}

				if (var33 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var26;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var26.isMouseInputEvent) {
										var26.remove();
										var26.widget.containsMouse = false;
									}
								}

								if (MouseHandler.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									class174.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) {
									var26.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var34 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var34) {
							TaskHandler.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class92.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							TileItem.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var34) {
							if (var9.contentType == 1400) {
								TileItem.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								SoundSystem.Widget_addToMenu(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var33) {
							for (int var20 = 0; var20 < var9.field3115.length; ++var20) {
								var21 = false;
								boolean var27 = false;
								if (!var21 && var9.field3115[var20] != null) {
									for (var23 = 0; var23 < var9.field3115[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3190 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3115[var20][var23]];
										}

										if (ModeWhere.method5483(var9.field3115[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3190 != null && var9.field3190[var20] > Client.cycle) {
												break;
											}

											byte var32 = var9.field3123[var20][var23];
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var27 = true;
												break;
											}
										}
									}
								}

								if (var27) {
									if (var20 < 10) {
										ReflectionCheck.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class258.Widget_runOnTargetLeave();
										ArchiveDiskAction.selectSpell(var9.id, var9.childIndex, Interpreter.Widget_unpackTargetMask(WorldMapRegion.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = GameEngine.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + FloorUnderlayDefinition.colorStartTag(16777215);
									}

									var23 = var9.field3147[var20];
									if (var9.field3190 == null) {
										var9.field3190 = new int[var9.field3115.length];
									}

									if (var9.field3066 == null) {
										var9.field3066 = new int[var9.field3115.length];
									}

									if (var23 != 0) {
										if (var9.field3190[var20] == 0) {
											var9.field3190[var20] = var23 + Client.cycle + var9.field3066[var20];
										} else {
											var9.field3190[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3190[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3190 != null) {
									var9.field3190[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var34 = true;
							} else {
								var34 = false;
							}

							boolean var35 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !VarbitComposition.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) {
								var35 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !VarbitComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								GrandExchangeEvents.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								TileItem.worldMap.method6603(var17, var18, var34 & var35, var34 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && GrandExchangeOfferTotalQuantityComparator.method5360(WorldMapRegion.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field595 = true;
								Client.field669 = var10;
								Client.field670 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var34 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || GameEngine.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var35 = false;
									var34 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.isClicked && var35 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.isClicked && !var35) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field695.addFirst(var22);
									}
								}

								if (var35 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.containsMouse && var34) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.containsMouse && var34 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.containsMouse && !var34) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field695.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field731.addFirst(var22);
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3185) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3185 <= 32) {
										label814:
										for (var37 = var9.field3185; var37 < Client.changedVarpCount; ++var37) {
											var23 = Client.changedVarps[var37 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label814;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3185 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field679 > var9.field3186) {
									if (var9.invTransmitTriggers != null && Client.field679 - var9.field3186 <= 32) {
										label790:
										for (var37 = var9.field3186; var37 < Client.field679; ++var37) {
											var23 = Client.changedItemContainers[var37 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label790;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3186 = Client.field679;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3187) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3187 <= 32) {
										label766:
										for (var37 = var9.field3187; var37 < Client.changedSkillsCount; ++var37) {
											var23 = Client.changedSkills[var37 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label766;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3187 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3064 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field685 > var9.field3064 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field686 > var9.field3064 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field687 > var9.field3064 && var9.field3161 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3161;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field594 > var9.field3064 && var9.field3163 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3163;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field577 > var9.field3064 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field489 > var9.field3064 && var9.field3168 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3168;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field691 > var9.field3064 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3064 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var37 = 0; var37 < Client.field726; ++var37) {
										ScriptEvent var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = Client.field718[var37];
										var31.keyPressed = Client.field532[var37];
										var31.args = var9.onKey;
										Client.scriptEvents.addFirst(var31);
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3157 != null) {
									var38 = ByteArrayPool.method5897();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3157;
										Client.scriptEvents.addFirst(var30);
									}
								}

								if (var9.field3158 != null) {
									var38 = Tile.method4116();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3158;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || GameEngine.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									VarpDefinition.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									VarpDefinition.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								PlayerType.field3661 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								ViewportMouse.method4559(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var28 != null) {
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var29.isMouseInputEvent) {
											var29.remove();
											var29.widget.containsMouse = false;
										}
									}

									if (MouseHandler.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										class174.addCancelMenuEntry();
									}
								}

								class87.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "27"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class120.method2530();
		ViewportMouse.method4556();
		int var1 = ApproximateRouteStrategy.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					class268.method5105(0.9D);
				}

				if (var2 == 2) {
					class268.method5105(0.8D);
				}

				if (var2 == 3) {
					class268.method5105(0.7D);
				}

				if (var2 == 4) {
					class268.method5105(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class29.method430(255);
				}

				if (var2 == 1) {
					class29.method430(192);
				}

				if (var2 == 2) {
					class29.method430(128);
				}

				if (var2 == 3) {
					class29.method430(64);
				}

				if (var2 == 4) {
					class29.method430(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					class129.updateSoundEffectVolume(127);
				}

				if (var2 == 1) {
					class129.updateSoundEffectVolume(96);
				}

				if (var2 == 2) {
					class129.updateSoundEffectVolume(64);
				}

				if (var2 == 3) {
					class129.updateSoundEffectVolume(32);
				}

				if (var2 == 4) {
					class129.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field655 = var2;
			}

			if (var1 == 10) {
				if (var2 == 0) {
					GrandExchangeOfferOwnWorldComparator.method1104(127);
				}

				if (var2 == 1) {
					GrandExchangeOfferOwnWorldComparator.method1104(96);
				}

				if (var2 == 2) {
					GrandExchangeOfferOwnWorldComparator.method1104(64);
				}

				if (var2 == 3) {
					GrandExchangeOfferOwnWorldComparator.method1104(32);
				}

				if (var2 == 4) {
					GrandExchangeOfferOwnWorldComparator.method1104(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var1 == 18) {
				var3 = new AttackOption[]{AttackOption.field1234, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.field1237};
				Client.playerAttackOption = (AttackOption)class128.findEnumerated(var3, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				var3 = new AttackOption[]{AttackOption.field1234, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.field1237};
				Client.npcAttackOption = (AttackOption)class128.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
