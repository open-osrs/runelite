import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -41163463
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		longValue = -6195405350753601003L
	)
	static long field2046;
	@ObfuscatedName("m")
	long[] field2041;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1698832719
	)
	int field2044;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 402474679
	)
	int field2040;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -6603351747931687267L
	)
	long field2042;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 830495451
	)
	int field2038;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -819539781
	)
	int field2043;

	public MilliClock() {
		this.field2041 = new long[10];
		this.field2044 = 256;
		this.field2040 = 1;
		this.field2038 = 0;
		this.field2042 = currentTimeMillis();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2041[var1] = this.field2042;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1017447827"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2041[var1] = 0L;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1786752641"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2044;
		int var4 = this.field2040;
		this.field2044 = 300;
		this.field2040 = 1;
		this.field2042 = currentTimeMillis();
		if (this.field2041[this.field2043] == 0L) {
			this.field2044 = var3;
			this.field2040 = var4;
		} else if (this.field2042 > this.field2041[this.field2043]) {
			this.field2044 = (int)((long)(var1 * 2560) / (this.field2042 - this.field2041[this.field2043]));
		}

		if (this.field2044 < 25) {
			this.field2044 = 25;
		}

		if (this.field2044 > 256) {
			this.field2044 = 256;
			this.field2040 = (int)((long)var1 - (this.field2042 - this.field2041[this.field2043]) / 10L);
		}

		if (this.field2040 > var1) {
			this.field2040 = var1;
		}

		this.field2041[this.field2043] = this.field2042;
		this.field2043 = (this.field2043 + 1) % 10;
		if (this.field2040 > 1) {
			for (int var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field2041[var5]) {
					this.field2041[var5] += (long)this.field2040;
				}
			}
		}

		if (this.field2040 < var2) {
			this.field2040 = var2;
		}

		long var8 = (long)this.field2040;
		if (var8 > 0L) {
			if (var8 % 10L == 0L) {
				SpriteMask.sleepExact(var8 - 1L);
				SpriteMask.sleepExact(1L);
			} else {
				SpriteMask.sleepExact(var8);
			}
		}

		int var7;
		for (var7 = 0; this.field2038 < 256; this.field2038 += this.field2044) {
			++var7;
		}

		this.field2038 &= 255;
		return var7;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "301883572"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis();
		if (var0 < class306.field3723) {
			class306.field3726 += class306.field3723 - var0;
		}

		class306.field3723 = var0;
		return var0 + class306.field3726;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lhd;S)Z",
		garbageValue = "442"
	)
	static final boolean method3586(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method4139(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = UserComparator4.getPacketBufferNode(ClientPacket.field2283, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
