import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class14 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -691857245
	)
	final int field80;
	@ObfuscatedName("b")
	final String field79;
	@ObfuscatedName("p")
	final ThreadFactory field81;
	@ObfuscatedName("m")
	final ThreadPoolExecutor field82;

	public class14(String var1, int var2, int var3) {
		this.field79 = var1;
		this.field80 = var2;
		this.field81 = new class16(this);
		this.field82 = this.method203(var3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-1684515517"
	)
	final ThreadPoolExecutor method203(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field80), this.field81);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lo;I)Lf;",
		garbageValue = "-977382928"
	)
	public class19 method213(class10 var1) {
		if (this.field82.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field82.getCorePoolSize() + " Queue capacity " + this.field80);
			return new class19("Queue full");
		} else {
			class19 var2 = new class19(this.field82.submit(new class20(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1972637620"
	)
	public final void method206() {
		try {
			this.field82.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldn;FB)F",
		garbageValue = "1"
	)
	static float method210(class115 var0, float var1) {
		if (var0 != null && var0.method2637() != 0) {
			if (var1 < (float)var0.field1393[0].field1359) {
				return var0.field1410 == class114.field1390 ? var0.field1393[0].field1349 : class213.method4354(var0, var1, true);
			} else if (var1 > (float)var0.field1393[var0.method2637() - 1].field1359) {
				return var0.field1396 == class114.field1390 ? var0.field1393[var0.method2637() - 1].field1349 : class213.method4354(var0, var1, false);
			} else if (var0.field1408) {
				return var0.field1393[0].field1349;
			} else {
				class111 var2 = var0.method2631(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (0.0D == (double)var2.field1352 && (double)var2.field1357 == 0.0D) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1352 && var2.field1357 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1354 != null) {
						if (var0.field1403) {
							float[] var5 = new float[4];
							float[] var6 = new float[4];
							var5[0] = (float)var2.field1359;
							var6[0] = var2.field1349;
							var5[1] = var5[0] + var2.field1352 * 0.33333334F;
							var6[1] = var6[0] + 0.33333334F * var2.field1357;
							var5[3] = (float)var2.field1354.field1359;
							var6[3] = var2.field1354.field1349;
							var5[2] = var5[3] - var2.field1354.field1350 * 0.33333334F;
							var6[2] = var6[3] - var2.field1354.field1351 * 0.33333334F;
							if (var0.field1397) {
								class13.method202(var0, var5, var6);
							} else {
								UserComparator4.method2504(var0, var5, var6);
							}

							var0.field1403 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1349;
					} else if (var4) {
						return (float)var2.field1359 != var1 && var2.field1354 != null ? var2.field1354.field1349 : var2.field1349;
					} else {
						float var11;
						float var12;
						if (var0.field1397) {
							if (var0 == null) {
								var12 = 0.0F;
							} else {
								if (var1 == var0.field1406) {
									var11 = 0.0F;
								} else if (var1 == var0.field1394) {
									var11 = 1.0F;
								} else {
									var11 = (var1 - var0.field1406) / (var0.field1394 - var0.field1406);
								}

								float var7;
								if (var0.field1398) {
									var7 = var11;
								} else {
									float[] var8 = new float[]{var0.field1401[0] - var11, var0.field1401[1], var0.field1401[2], var0.field1401[3]};
									float[] var9 = new float[5];
									int var10 = class144.method2971(var8, 3, 0.0F, true, 1.0F, true, var9);
									if (var10 == 1) {
										var7 = var9[0];
									} else {
										var7 = 0.0F;
									}
								}

								var12 = var0.field1402[0] + var7 * (var0.field1402[1] + var7 * (var0.field1402[2] + var7 * var0.field1402[3]));
							}

							return var12;
						} else {
							if (var0 == null) {
								var12 = 0.0F;
							} else {
								var11 = var1 - var0.field1406;
								var12 = (var11 * (var11 * var0.field1401[0] + var0.field1401[1]) + var0.field1401[2]) * var11 + var0.field1401[3];
							}

							return var12;
						}
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-1522814517"
	)
	public static int method214(boolean var0, boolean var1) {
		byte var2 = 0;
		int var3 = var2 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount;
		return var3;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "724384814"
	)
	static final boolean method204() {
		return Client.isMenuOpen;
	}
}
