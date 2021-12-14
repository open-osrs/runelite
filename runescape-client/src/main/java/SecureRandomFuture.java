import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("c")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("b")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "392598921"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-786037347"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1927504024"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return WallDecoration.method4340();
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "205087229"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1413371821"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		LoginScreenAnimation.logOut();
		switch(var0) {
		case 1:
			PlayerType.method5521(24);
			class19.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			PlayerType.method5521(24);
			class19.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1736689537"
	)
	static final void method2025(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}

		if (var0 > 383) {
			var0 = 383;
		}

		if (UserComparator7.cameraPitch < var0) {
			UserComparator7.cameraPitch = (var0 - UserComparator7.cameraPitch) * ChatChannel.field956 / 1000 + UserComparator7.cameraPitch + WorldMapSection1.field2755;
			if (UserComparator7.cameraPitch > var0) {
				UserComparator7.cameraPitch = var0;
			}
		}

		if (UserComparator7.cameraPitch > var0) {
			UserComparator7.cameraPitch -= (UserComparator7.cameraPitch - var0) * ChatChannel.field956 / 1000 + WorldMapSection1.field2755;
			if (UserComparator7.cameraPitch < var0) {
				UserComparator7.cameraPitch = var0;
			}
		}

		int var2 = var1 - class379.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		}

		if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class379.cameraYaw = class379.cameraYaw + WorldMapSection1.field2755 + var2 * ChatChannel.field956 / 1000;
			class379.cameraYaw &= 2047;
		}

		if (var2 < 0) {
			class379.cameraYaw -= -var2 * ChatChannel.field956 / 1000 + WorldMapSection1.field2755;
			class379.cameraYaw &= 2047;
		}

		int var3 = var1 - class379.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		}

		if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class379.cameraYaw = var1;
		}

	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ljm;S)Ljava/lang/String;",
		garbageValue = "13301"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class404.Widget_unpackTargetMask(class363.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
