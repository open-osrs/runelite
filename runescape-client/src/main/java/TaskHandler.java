import java.applet.Applet;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("m")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("o")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		signature = "Lhd;"
	)
	static Widget field2066;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lfa;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lfa;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("p")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("g")
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "622783218"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIILjava/lang/Object;I)Lfa;",
		garbageValue = "962190485"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;II)Lfa;",
		garbageValue = "746026781"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Runnable;II)Lfa;",
		garbageValue = "2089571271"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-1144544095"
	)
	public static void method3606(Applet var0, String var1) {
		class60.applet = var0;
		if (var1 != null) {
			class60.field450 = var1;
		}

	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		signature = "(Lcc;IB)V",
		garbageValue = "-73"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		SequenceDefinition var11;
		if (var0.field966 >= Client.cycle) {
			var2 = Math.max(1, var0.field966 - Client.cycle);
			var3 = var0.field967 * 64 + var0.field995 * 128;
			var4 = var0.field967 * 64 + var0.field1008 * 128;
			var0.x += (var3 - var0.x) / var2;
			var0.y += (var4 - var0.y) / var2;
			var0.field1022 = 0;
			var0.orientation = var0.field1006;
		} else {
			int var5;
			int var7;
			if (var0.field1011 >= Client.cycle) {
				if (var0.field1011 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > NetSocket.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
					var2 = var0.field1011 - var0.field966;
					var3 = Client.cycle - var0.field966;
					var4 = var0.field967 * 64 + var0.field995 * 128;
					var5 = var0.field967 * 64 + var0.field1008 * 128;
					int var6 = var0.field967 * 64 + var0.field1007 * 128;
					var7 = var0.field967 * 64 + var0.field1009 * 128;
					var0.x = (var6 * var3 + var4 * (var2 - var3)) / var2;
					var0.y = (var7 * var3 + var5 * (var2 - var3)) / var2;
				}

				var0.field1022 = 0;
				var0.orientation = var0.field1006;
				var0.rotation = var0.orientation;
			} else {
				var0.movementSequence = var0.idleSequence;
				if (var0.pathLength == 0) {
					var0.field1022 = 0;
				} else {
					label550: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) {
							var11 = NetSocket.SequenceDefinition_get(var0.sequence);
							if (var0.field1023 > 0 && var11.field3559 == 0) {
								++var0.field1022;
								break label550;
							}

							if (var0.field1023 <= 0 && var11.field3560 == 0) {
								++var0.field1022;
								break label550;
							}
						}

						var2 = var0.x;
						var3 = var0.y;
						var4 = var0.field967 * 64 + var0.pathX[var0.pathLength - 1] * 128;
						var5 = var0.field967 * 64 + var0.pathY[var0.pathLength - 1] * 128;
						if (var2 < var4) {
							if (var3 < var5) {
								var0.orientation = 1280;
							} else if (var3 > var5) {
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536;
							}
						} else if (var2 > var4) {
							if (var3 < var5) {
								var0.orientation = 768;
							} else if (var3 > var5) {
								var0.orientation = 256;
							} else {
								var0.orientation = 512;
							}
						} else if (var3 < var5) {
							var0.orientation = 1024;
						} else if (var3 > var5) {
							var0.orientation = 0;
						}

						byte var14 = var0.pathTraversed[var0.pathLength - 1];
						if (var4 - var2 <= 256 && var4 - var2 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
							var7 = var0.orientation - var0.rotation & 2047;
							if (var7 > 1024) {
								var7 -= 2048;
							}

							int var8 = var0.walkBackSequence;
							if (var7 >= -256 && var7 <= 256) {
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) {
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) {
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) {
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8;
							int var9 = 4;
							boolean var10 = true;
							if (var0 instanceof NPC) {
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) {
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1017 != 0) {
									var9 = 2;
								}

								if (var0.pathLength > 2) {
									var9 = 6;
								}

								if (var0.pathLength > 3) {
									var9 = 8;
								}

								if (var0.field1022 > 0 && var0.pathLength > 1) {
									var9 = 8;
									--var0.field1022;
								}
							} else {
								if (var0.pathLength > 1) {
									var9 = 6;
								}

								if (var0.pathLength > 2) {
									var9 = 8;
								}

								if (var0.field1022 > 0 && var0.pathLength > 1) {
									var9 = 8;
									--var0.field1022;
								}
							}

							if (var14 == 2) {
								var9 <<= 1;
							}

							if (var9 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
								var0.movementSequence = var0.runSequence;
							}

							if (var4 != var2 || var3 != var5) {
								if (var2 < var4) {
									var0.x += var9;
									if (var0.x > var4) {
										var0.x = var4;
									}
								} else if (var2 > var4) {
									var0.x -= var9;
									if (var0.x < var4) {
										var0.x = var4;
									}
								}

								if (var3 < var5) {
									var0.y += var9;
									if (var0.y > var5) {
										var0.y = var5;
									}
								} else if (var3 > var5) {
									var0.y -= var9;
									if (var0.y < var5) {
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) {
								--var0.pathLength;
								if (var0.field1023 > 0) {
									--var0.field1023;
								}
							}
						} else {
							var0.x = var4;
							var0.y = var5;
							--var0.pathLength;
							if (var0.field1023 > 0) {
								--var0.field1023;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field966 = 0;
			var0.field1011 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field967 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field967 * 64;
			var0.method1810();
		}

		if (class60.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field966 = 0;
			var0.field1011 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field967 * 64;
			var0.y = var0.field967 * 64 + var0.pathY[0] * 128;
			var0.method1810();
		}

		if (var0.field1017 != 0) {
			if (var0.targetIndex != -1) {
				Object var15 = null;
				if (var0.targetIndex < 32768) {
					var15 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var15 = Client.players[var0.targetIndex - 32768];
				}

				if (var15 != null) {
					var3 = var0.x - ((Actor)var15).x;
					var4 = var0.y - ((Actor)var15).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field992 != -1 && (var0.pathLength == 0 || var0.field1022 > 0)) {
				var0.orientation = var0.field992;
				var0.field992 = -1;
			}

			var2 = var0.orientation - var0.rotation & 2047;
			if (var2 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var2 != 0) {
				++var0.field1016;
				boolean var13;
				if (var2 > 1024) {
					var0.rotation -= var0.field1017;
					var13 = true;
					if (var2 < var0.field1017 || var2 > 2048 - var0.field1017) {
						var0.rotation = var0.orientation;
						var13 = false;
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1016 > 25 || var13)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1017;
					var13 = true;
					if (var2 < var0.field1017 || var2 > 2048 - var0.field1017) {
						var0.rotation = var0.orientation;
						var13 = false;
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1016 > 25 || var13)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1016 = 0;
			}
		}

		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			var11 = NetSocket.SequenceDefinition_get(var0.movementSequence);
			if (var11 != null && var11.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var11.frameIds.length && var0.movementFrameCycle > var11.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					GrandExchangeOfferOwnWorldComparator.addSequenceSoundEffect(var11, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var11.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					GrandExchangeOfferOwnWorldComparator.addSequenceSoundEffect(var11, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field987) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			var2 = class4.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var2 != -1) {
				SequenceDefinition var12 = NetSocket.SequenceDefinition_get(var2);
				if (var12 != null && var12.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						GrandExchangeOfferOwnWorldComparator.addSequenceSoundEffect(var12, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var11 = NetSocket.SequenceDefinition_get(var0.sequence);
			if (var11.field3559 == 1 && var0.field1023 > 0 && var0.field966 <= Client.cycle && var0.field1011 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var11 = NetSocket.SequenceDefinition_get(var0.sequence);
			if (var11 != null && var11.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var11.frameIds.length && var0.sequenceFrameCycle > var11.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					GrandExchangeOfferOwnWorldComparator.addSequenceSoundEffect(var11, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var11.frameIds.length) {
					var0.sequenceFrame -= var11.frameCount;
					++var0.field1000;
					if (var0.field1000 >= var11.field3562) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var11.frameIds.length) {
						GrandExchangeOfferOwnWorldComparator.addSequenceSoundEffect(var11, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var11.field3558;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}
}
