import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("z")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("k")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("s")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList(); // L: 15
		this.thread = new Thread(this); // L: 18
		this.thread.setPriority(1); // L: 19
		this.thread.start(); // L: 20
	} // L: 21

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lei;",
		garbageValue = "-8401642"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 71
		synchronized(this) { // L: 72
			this.requests.add(var2); // L: 73
			this.notify(); // L: 74
			return var2; // L: 76
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-210243346"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 80

		try {
			synchronized(this) { // L: 82
				this.notify(); // L: 83
			} // L: 84

			this.thread.join(); // L: 85
		} catch (InterruptedException var4) { // L: 87
		}

	} // L: 88

	public void run() {
		while (!this.isClosed) { // L: 24
			try {
				UrlRequest var1;
				synchronized(this) { // L: 27
					var1 = (UrlRequest)this.requests.poll(); // L: 28
					if (var1 == null) { // L: 29
						try {
							this.wait(); // L: 31
						} catch (InterruptedException var13) { // L: 33
						}
						continue;
					}
				}

				DataInputStream var2 = null; // L: 37
				URLConnection var3 = null; // L: 38

				try {
					var3 = var1.url.openConnection(); // L: 40
					var3.setConnectTimeout(5000); // L: 41
					var3.setReadTimeout(5000); // L: 42
					var3.setUseCaches(false); // L: 43
					var3.setRequestProperty("Connection", "close"); // L: 44
					int var7 = var3.getContentLength(); // L: 45
					if (var7 >= 0) { // L: 46
						byte[] var5 = new byte[var7]; // L: 47
						var2 = new DataInputStream(var3.getInputStream()); // L: 48
						var2.readFully(var5); // L: 49
						var1.response0 = var5; // L: 50
					}

					var1.isDone0 = true; // L: 52
				} catch (IOException var14) { // L: 54
					var1.isDone0 = true; // L: 55
				} finally {
					if (var2 != null) { // L: 58
						var2.close();
					}

					if (var3 != null && var3 instanceof HttpURLConnection) { // L: 59
						((HttpURLConnection)var3).disconnect(); // L: 60
					}

				}
			} catch (Exception var17) { // L: 64
				Decimator.RunException_sendStackTrace((String)null, var17); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-516919063"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1456
		Login.Login_response2 = var1; // L: 1457
		Login.Login_response3 = var2; // L: 1458
	} // L: 1459

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "1482184938"
	)
	static int method3419(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 772
		Widget var4;
		if (var0 >= 2000) { // L: 774
			var0 -= 1000; // L: 775
			var4 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 776
			var3 = false; // L: 777
		} else {
			var4 = var2 ? Canvas.field438 : class3.field12; // L: 779
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 780
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 781
			if (var11 >= 0 && var11 <= 9) { // L: 782
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]); // L: 786
				return 1; // L: 787
			} else {
				--Varps.Interpreter_stringStackSize; // L: 783
				return 1; // L: 784
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 789
				Interpreter.Interpreter_intStackSize -= 2; // L: 790
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 791
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 792
				var4.parent = SecureRandomCallable.getWidgetChild(var11, var6); // L: 793
				return 1; // L: 794
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 796
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 797
				return 1; // L: 798
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 800
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 801
				return 1; // L: 802
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 804
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 805
				return 1; // L: 806
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 808
				var4.dataText = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 809
				return 1; // L: 810
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 812
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 813
				return 1; // L: 814
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 816
				var4.actions = null; // L: 817
				return 1; // L: 818
			} else if (var0 == 1308) { // L: 820
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 821
				return 1; // L: 822
			} else if (var0 == 1309) { // L: 824
				--Interpreter.Interpreter_intStackSize; // L: 825
				return 1; // L: 826
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 828
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 858
						Interpreter.Interpreter_intStackSize -= 2; // L: 859
						var5 = 10; // L: 860
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 861
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 862
						NetSocket.Widget_setKey(var4, var5, var8, var9); // L: 863
						return 1; // L: 864
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 866
						Interpreter.Interpreter_intStackSize -= 3; // L: 867
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 868
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 869
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 870
						if (var11 >= 0 && var11 <= 9) { // L: 871
							MouseHandler.Widget_setKeyRate(var4, var11, var6, var7); // L: 874
							return 1; // L: 875
						} else {
							throw new RuntimeException(); // L: 872
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 877
						var5 = 10; // L: 878
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 879
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 880
						MouseHandler.Widget_setKeyRate(var4, var5, var6, var7); // L: 881
						return 1; // L: 882
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 884
						--Interpreter.Interpreter_intStackSize; // L: 885
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 886
						if (var11 >= 0 && var11 <= 9) { // L: 887
							class60.Widget_setKeyIgnoreHeld(var4, var11); // L: 890
							return 1; // L: 891
						} else {
							throw new RuntimeException(); // L: 888
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 893
						var5 = 10; // L: 894
						class60.Widget_setKeyIgnoreHeld(var4, var5); // L: 895
						return 1; // L: 896
					} else {
						return 2; // L: 898
					}
				} else {
					byte[] var10 = null; // L: 829
					var8 = null; // L: 830
					if (var3) { // L: 831
						Interpreter.Interpreter_intStackSize -= 10; // L: 832

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 834 835
						}

						if (var7 > 0) { // L: 837
							var10 = new byte[var7 / 2]; // L: 838
							var8 = new byte[var7 / 2]; // L: 839

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 840
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 841
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 842
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 847
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 848
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 849
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 851
					if (var7 >= 0 && var7 <= 9) { // L: 852
						NetSocket.Widget_setKey(var4, var7, var10, var8); // L: 855
						return 1; // L: 856
					} else {
						throw new RuntimeException(); // L: 853
					}
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lef;",
		garbageValue = "-1165420128"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 181
		if (var1 != null) { // L: 182
			return var1;
		} else {
			var1 = ArchiveDiskActionHandler.method4337(SequenceDefinition.SequenceDefinition_animationsArchive, GrandExchangeOfferAgeComparator.SequenceDefinition_skeletonsArchive, var0, false); // L: 183
			if (var1 != null) { // L: 184
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 185
		}
	}
}
