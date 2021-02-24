import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("Buffer")
public class Buffer extends Node {
   @ObfuscatedName("e")
   @Export("crc32Table")
   static int[] crc32Table = new int[256];
   @ObfuscatedName("l")
   @Export("crc64Table")
   static long[] crc64Table;
   @ObfuscatedName("h")
   @Export("array")
   public byte[] array;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1025364431
   )
   @Export("offset")
   public int offset;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var4 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var4 & 1) == 1) {
               var4 = var4 >>> 1 ^ -306674912;
            } else {
               var4 >>>= 1;
            }
         }

         crc32Table[var1] = var4;
      }

      crc64Table = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var0 & 1L) == 1L) {
               var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
               var0 >>>= 1;
            }
         }

         crc64Table[var2] = var0;
      }

   }

   public Buffer(int var1) {
      this.array = class23.ByteArrayPool_getArray(var1);
      this.offset = 0;
   }

   public Buffer(byte[] var1) {
      this.array = var1;
      this.offset = 0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1006665451"
   )
   @Export("releaseArray")
   public void releaseArray() {
      if (this.array != null) {
         GrandExchangeOfferWorldComparator.ByteArrayPool_release(this.array);
      }

      this.array = null;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-725228990"
   )
   @Export("writeByte")
   public void writeByte(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-631854152"
   )
   @Export("writeShort")
   public void writeShort(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1328174191"
   )
   @Export("writeMedium")
   public void writeMedium(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1001765065"
   )
   @Export("writeInt")
   public void writeInt(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bj")
   @Export("writeLongMedium")
   public void writeLongMedium(long var1) {
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.array[++this.offset - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("bn")
   @Export("writeLong")
   public void writeLong(long var1) {
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 56));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 48));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.array[++this.offset - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "73"
   )
   @Export("writeBoolean")
   public void writeBoolean(boolean var1) {
      this.writeByte(var1 ? 1 : 0);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1281175721"
   )
   @Export("writeStringCp1252NullTerminated")
   public void writeStringCp1252NullTerminated(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset += ObjectComposition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
         this.array[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-2045020739"
   )
   @Export("writeStringCp1252NullCircumfixed")
   public void writeStringCp1252NullCircumfixed(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.array[++this.offset - 1] = 0;
         this.offset += ObjectComposition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
         this.array[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)V",
      garbageValue = "-507866074"
   )
   @Export("writeCESU8")
   public void writeCESU8(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 <= 127) {
            ++var4;
         } else if (var6 <= 2047) {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.array[++this.offset - 1] = 0;
      this.writeVarInt(var4);
      this.offset += class277.method5192(this.array, this.offset, var1);
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-491759097"
   )
   @Export("writeBytes")
   public void writeBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.array[++this.offset - 1] = var1[var4];
      }

   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "-891045829"
   )
   public void method5683(Buffer var1) {
      this.writeBytes(var1.array, 0, var1.offset);
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1107107708"
   )
   @Export("writeLengthInt")
   public void writeLengthInt(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.array[this.offset - var1 - 4] = (byte)(var1 >> 24);
         this.array[this.offset - var1 - 3] = (byte)(var1 >> 16);
         this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.array[this.offset - var1 - 1] = (byte)var1;
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1934189526"
   )
   @Export("writeLengthShort")
   public void writeLengthShort(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.array[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2132929022"
   )
   @Export("writeLengthByte")
   public void writeLengthByte(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.array[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-415253670"
   )
   @Export("writeSmartByteShort")
   public void writeSmartByteShort(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.writeShort(var1 + '耀');
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "7069"
   )
   @Export("writeVarInt")
   public void writeVarInt(int var1) {
      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1432126117"
   )
   @Export("readUnsignedByte")
   public int readUnsignedByte() {
      return this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(B)B",
      garbageValue = "-16"
   )
   @Export("readByte")
   public byte readByte() {
      return this.array[++this.offset - 1];
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "225678000"
   )
   @Export("readUnsignedShort")
   public int readUnsignedShort() {
      this.offset += 2;
      return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "912230375"
   )
   @Export("readShort")
   public int readShort() {
      this.offset += 2;
      int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-105"
   )
   @Export("readMedium")
   public int readMedium() {
      this.offset += 3;
      return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "95"
   )
   @Export("readInt")
   public int readInt() {
      this.offset += 4;
      return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "68"
   )
   @Export("readLong")
   public long readLong() {
      long var1 = (long)this.readInt() & 4294967295L;
      long var3 = (long)this.readInt() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1996547816"
   )
   @Export("readBoolean")
   public boolean readBoolean() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "2074077507"
   )
   @Export("readStringCp1252NullTerminatedOrNull")
   public String readStringCp1252NullTerminatedOrNull() {
      if (this.array[this.offset] == 0) {
         ++this.offset;
         return null;
      } else {
         return this.readStringCp1252NullTerminated();
      }
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "2017763528"
   )
   @Export("readStringCp1252NullTerminated")
   public String readStringCp1252NullTerminated() {
      int var1 = this.offset;

      while(this.array[++this.offset - 1] != 0) {
         ;
      }

      int var2 = this.offset - var1 - 1;
      return var2 == 0 ? "" : VertexNormal.decodeStringCp1252(this.array, var1, var2);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "586537561"
   )
   @Export("readStringCp1252NullCircumfixed")
   public String readStringCp1252NullCircumfixed() {
      byte var1 = this.array[++this.offset - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.offset;

         while(this.array[++this.offset - 1] != 0) {
            ;
         }

         int var3 = this.offset - var2 - 1;
         return var3 == 0 ? "" : VertexNormal.decodeStringCp1252(this.array, var2, var3);
      }
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/lang/String;",
      garbageValue = "8221"
   )
   @Export("readCESU8")
   public String readCESU8() {
      byte var1 = this.array[++this.offset - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.readVarInt();
         String var3 = Strings.method4327(this.array, this.offset, var2);
         this.offset += var2;
         return var3;
      }
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-199927912"
   )
   @Export("readBytes")
   public void readBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.array[++this.offset - 1];
      }

   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1063921109"
   )
   @Export("readShortSmart")
   public int readShortSmart() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '쀀';
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "342141969"
   )
   @Export("readUShortSmart")
   public int readUShortSmart() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - '耀';
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1617877263"
   )
   public int method5704() {
      int var1 = 0;

      int var2;
      for(var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "87"
   )
   public int method5705() {
      return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1318332981"
   )
   public int method5833() {
      if (this.array[this.offset] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var1 = this.readUnsignedShort();
         return var1 == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2047096049"
   )
   @Export("readVarInt")
   public int readVarInt() {
      byte var1 = this.array[++this.offset - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "-105213348"
   )
   @Export("xteaEncryptAll")
   public void xteaEncryptAll(int[] var1) {
      int var2 = this.offset / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.offset -= 8;
         this.writeInt(var4);
         this.writeInt(var5);
      }

   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "2106116366"
   )
   @Export("xteaDecryptAll")
   public void xteaDecryptAll(int[] var1) {
      int var2 = this.offset / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.offset -= 8;
         this.writeInt(var4);
         this.writeInt(var5);
      }

   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "([IIIB)V",
      garbageValue = "6"
   )
   @Export("xteaEncrypt")
   public void xteaEncrypt(int[] var1, int var2, int var3) {
      int var4 = this.offset;
      this.offset = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.readInt();
         int var8 = this.readInt();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.offset -= 8;
         this.writeInt(var7);
         this.writeInt(var8);
      }

      this.offset = var4;
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "([IIII)V",
      garbageValue = "-1639907144"
   )
   @Export("xteaDecrypt")
   public void xteaDecrypt(int[] var1, int var2, int var3) {
      int var4 = this.offset;
      this.offset = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.readInt();
         int var8 = this.readInt();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.offset -= 8;
         this.writeInt(var7);
         this.writeInt(var8);
      }

      this.offset = var4;
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "-1400886376"
   )
   @Export("encryptRsa")
   public void encryptRsa(BigInteger var1, BigInteger var2) {
      int var3 = this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.readBytes(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.writeShort(var7.length);
      this.writeBytes(var7, 0, var7.length);
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1855873704"
   )
   @Export("writeCrc")
   public int writeCrc(int var1) {
      int var2 = Player.method1317(this.array, var1, this.offset);
      this.writeInt(var2);
      return var2;
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "483943428"
   )
   @Export("checkCrc")
   public boolean checkCrc() {
      this.offset -= 4;
      int var1 = Player.method1317(this.array, 0, this.offset);
      int var2 = this.readInt();
      return var2 == var1;
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "110714256"
   )
   public void method5883(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1893210682"
   )
   public void method5778(int var1) {
      this.array[++this.offset - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-72732516"
   )
   public void method5931(int var1) {
      this.array[++this.offset - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-35"
   )
   public int method5776() {
      return this.array[++this.offset - 1] - 128 & 255;
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1293461120"
   )
   public int method5717() {
      return 0 - this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1006009212"
   )
   public int method5720() {
      return 128 - this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-2124530748"
   )
   public byte method5721() {
      return (byte)(this.array[++this.offset - 1] - 128);
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "1450651314"
   )
   public byte method5722() {
      return (byte)(0 - this.array[++this.offset - 1]);
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-362009311"
   )
   public byte method5747() {
      return (byte)(128 - this.array[++this.offset - 1]);
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1910800344"
   )
   @Export("writeShortLE")
   public void writeShortLE(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1801053391"
   )
   public void method5725(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   @Export("writeIntME")
   public void writeIntME(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 + 128);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2146834071"
   )
   public int method5727() {
      this.offset += 2;
      return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
   }

   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-211808457"
   )
   public int method5728() {
      this.offset += 2;
      return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-25877"
   )
   public int method5729() {
      this.offset += 2;
      return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
   }

   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "114"
   )
   public int method5730() {
      this.offset += 2;
      int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "38246618"
   )
   public int method5731() {
      this.offset += 2;
      int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "166926488"
   )
   public void method5732(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-25"
   )
   public int method5788() {
      this.offset += 3;
      return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "115"
   )
   public void method5781(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "99"
   )
   public void method5876(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2087038458"
   )
   public void method5736(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1781461165"
   )
   public int method5895() {
      this.offset += 4;
      return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
   }

   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1616505089"
   )
   public int method5738() {
      this.offset += 4;
      return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "331427137"
   )
   public int method5739() {
      this.offset += 4;
      return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
   }

   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "2003375492"
   )
   public void method5740(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = this.array[++this.offset - 1];
      }

   }
}
