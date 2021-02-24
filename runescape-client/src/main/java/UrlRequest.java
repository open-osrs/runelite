import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("UrlRequest")
public class UrlRequest {
   @ObfuscatedName("n")
   @Export("url")
   final URL url;
   @ObfuscatedName("v")
   @Export("isDone0")
   volatile boolean isDone0;
   @ObfuscatedName("d")
   @Export("response0")
   volatile byte[] response0;

   UrlRequest(URL var1) {
      this.url = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1827433673"
   )
   @Export("isDone")
   public boolean isDone() {
      return this.isDone0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "124"
   )
   @Export("getResponse")
   public byte[] getResponse() {
      return this.response0;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(ZZI)Lly;",
      garbageValue = "-2105187304"
   )
   static IndexedSprite method3476(boolean var0, boolean var1) {
      return var0 ? (var1 ? WorldMapDecoration.field237 : Login.options_buttons_2Sprite) : (var1 ? UrlRequester.field1956 : class69.options_buttons_0Sprite);
   }
}
