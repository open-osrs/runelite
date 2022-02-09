import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("c")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("l")
	@Export("lock")
	Object lock;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 28944215
	)
	@Export("index")
	int index;
	@ObfuscatedName("e")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("r")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("o")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; Language.method5813(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-122"
	)
	public static void method2100() {
		StructComposition.StructDefinition_cached.clear(); // L: 57
	} // L: 58

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1953012058"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 11885

		while (var0.hasNext()) { // L: 11890
			Message var1 = (Message)var0.next(); // L: 11886
			var1.clearIsFromIgnored(); // L: 11888
		}

		if (class67.friendsChat != null) { // L: 11892
			class67.friendsChat.invalidateIgnoreds(); // L: 11893
		}

	} // L: 11895
}
