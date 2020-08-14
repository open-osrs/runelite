import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("ClanChat")
public class ClanChat extends UserList {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("z")
	@Export("name")
	public String name;
	@ObfuscatedName("w")
	@Export("owner")
	public String owner;
	@ObfuscatedName("y")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1947222095
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1869619471
	)
	int field3663;

	@ObfuscatedSignature(
		descriptor = "(Lmo;Lkp;)V"
	)
	public ClanChat(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3663 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "551595115"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljf;",
		garbageValue = "1959965595"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-85"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = WorldMapData_0.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1810188467"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = WorldMapData_0.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "585042716"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.readName(Frames.method3398(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readUnsignedByte();
		if (var4 != 255) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field3663 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "-100"
	)
	public final void method5421(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		ClanMate var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field3663 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lji;I)V",
		garbageValue = "244481619"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Llj;",
		garbageValue = "-1116942702"
	)
	public static AbstractSocket method5441(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(B)Lma;",
		garbageValue = "-90"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class228.worldMap;
	}
}
