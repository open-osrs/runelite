import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lek;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1856527829
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -334819521
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1578997885
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1711364077
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("r")
	@Export("name")
	public String name;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1034605975
	)
	public int field1563;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1720690587
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("b")
	public boolean field1569;
	@ObfuscatedName("i")
	public boolean field1567;
	@ObfuscatedName("k")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("g")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("t")
	int[] field1570;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1625174781
	)
	int field1573;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 796441921
	)
	int field1566;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 110963729
	)
	int field1571;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1540991657
	)
	int field1556;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("n")
	int[] field1577;
	@ObfuscatedName("l")
	byte[] field1578;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 477871251
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1569 = true; // L: 24
		this.field1567 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1573 = Integer.MAX_VALUE; // L: 29
		this.field1566 = Integer.MAX_VALUE; // L: 30
		this.field1571 = Integer.MIN_VALUE; // L: 31
		this.field1556 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;S)V",
		garbageValue = "28368"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) { // L: 53
				return;
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "1992527916"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6630();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6630();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1563 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium(); // L: 64
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				if ((var3 & 1) == 0) { // L: 69
					this.field1569 = false;
				}

				if ((var3 & 2) == 2) { // L: 70
					this.field1567 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var3 = var1.readUnsignedByte(); // L: 77
				this.field1570 = new int[var3 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) { // L: 79
					this.field1570[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1577 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1577.length; ++var5) { // L: 83
					this.field1577[var5] = var1.readInt();
				}

				this.field1578 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) { // L: 85
					this.field1578[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method6630(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte();
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.method6630();
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)Clock.findEnumerated(MouseHandler.method726(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					this.verticalAlignment = (VerticalAlignment)Clock.findEnumerated(class106.method2373(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	public void method2724() {
		if (this.field1570 != null) { // L: 124
			for (int var1 = 0; var1 < this.field1570.length; var1 += 2) { // L: 125
				if (this.field1570[var1] < this.field1573) { // L: 126
					this.field1573 = this.field1570[var1];
				} else if (this.field1570[var1] > this.field1571) {
					this.field1571 = this.field1570[var1]; // L: 127
				}

				if (this.field1570[var1 + 1] < this.field1566) { // L: 128
					this.field1566 = this.field1570[var1 + 1];
				} else if (this.field1570[var1 + 1] > this.field1556) {
					this.field1556 = this.field1570[var1 + 1]; // L: 129
				}
			}
		}

	} // L: 132

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZB)Loa;",
		garbageValue = "1"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 135
		return this.getSprite(var2); // L: 136
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Loa;",
		garbageValue = "112"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 140
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 141
			if (var2 != null) { // L: 142
				return var2;
			} else {
				var2 = Tile.SpriteBuffer_getSprite(class244.WorldMapElement_archive, var1, 0); // L: 143
				if (var2 != null) { // L: 144
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 145
				}

				return var2; // L: 147
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 151
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1243419683"
	)
	static long method2721() {
		try {
			URL var0 = new URL(class19.method283("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L;
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lmo;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1387320814"
	)
	static String method2742(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : (String)var3.obj; // L: 35 36
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1458799604"
	)
	public static char method2732(char var0) {
		switch(var0) { // L: 52
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 107
		case '#':
		case '[':
		case ']':
			return var0; // L: 88
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 84
		case 'Ç':
		case 'ç':
			return 'c'; // L: 91
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 118
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 73
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 66
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 63
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 102
		case 'ß':
			return 'b'; // L: 93
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 121
		default:
			return Character.toLowerCase(var0); // L: 109
		}
	}
}
