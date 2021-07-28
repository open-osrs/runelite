import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1994254709
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	static StudioGame field975;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -2054144083
	)
	static int field976;
	@ObfuscatedName("s")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("t")
	@Export("lock")
	Object lock;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -385453715
	)
	@Export("index")
	int index;
	@ObfuscatedName("j")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("l")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("n")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; SceneTilePaint.method4322(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-190219841"
	)
	static int method1811(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}
}
