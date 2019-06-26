import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
@Implements("WorldMapIcon1")
public class WorldMapIcon1 extends AbstractWorldMapIcon {
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   static Widget __t_i;
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      signature = "Lit;"
   )
   @Export("indexCache3")
   static IndexCache indexCache3;
   @ObfuscatedName("ec")
   @Export("secureRandom")
   static SecureRandom secureRandom;
   @ObfuscatedName("hq")
   @ObfuscatedGetter(
      intValue = 490189491
   )
   @Export("cameraPitch")
   static int cameraPitch;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1722323621
   )
   final int __m;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Laj;"
   )
   @Export("label0")
   final WorldMapLabel label0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 364253793
   )
   final int __q;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -362031241
   )
   final int __w;

   @ObfuscatedSignature(
      signature = "(Lhu;Lhu;ILaj;)V"
   )
   WorldMapIcon1(TileLocation var1, TileLocation var2, int var3, WorldMapLabel var4) {
      super(var1, var2);
      this.__m = var3;
      this.label0 = var4;
      WorldMapElement var5 = ViewportMouse.getWorldMapElement(this.__m_15());
      Sprite var6 = var5.getSprite(false);
      if(var6 != null) {
         this.__q = var6.subWidth;
         this.__w = var6.subHeight;
      } else {
         this.__q = 0;
         this.__w = 0;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1990181988"
   )
   public int __m_15() {
      return this.__m;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Laj;",
      garbageValue = "1159446036"
   )
   WorldMapLabel __f_16() {
      return this.label0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "75"
   )
   int __q_17() {
      return this.__q;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1558233611"
   )
   int __w_18() {
      return this.__w;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-460290173"
   )
   static void method219(int var0, String var1, String var2) {
      GrandExchangeEvents.addChatMessage(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-252304353"
   )
   static final void method212() {
      for(int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
         --Client.queuedSoundEffectDelays[var0];
         if(Client.queuedSoundEffectDelays[var0] >= -10) {
            SoundEffect var9 = Client.soundEffects[var0];
            if(var9 == null) {
               Object var10000 = null;
               var9 = SoundEffect.readSoundEffect(class25.indexCache4, Client.soundEffectIds[var0], 0);
               if(var9 == null) {
                  continue;
               }

               Client.queuedSoundEffectDelays[var0] += var9.__q_174();
               Client.soundEffects[var0] = var9;
            }

            if(Client.queuedSoundEffectDelays[var0] < 0) {
               int var2;
               if(Client.soundLocations[var0] != 0) {
                  int var3 = (Client.soundLocations[var0] & 255) * 128;
                  int var4 = Client.soundLocations[var0] >> 16 & 255;
                  int var5 = var4 * 128 + 64 - Canvas.localPlayer.x;
                  if(var5 < 0) {
                     var5 = -var5;
                  }

                  int var6 = Client.soundLocations[var0] >> 8 & 255;
                  int var7 = var6 * 128 + 64 - Canvas.localPlayer.y;
                  if(var7 < 0) {
                     var7 = -var7;
                  }

                  int var8 = var5 + var7 - 128;
                  if(var8 > var3) {
                     Client.queuedSoundEffectDelays[var0] = -100;
                     continue;
                  }

                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var2 = (var3 - var8) * Client.__client_qc / var3;
               } else {
                  var2 = Client.soundEffectVolume;
               }

               if(var2 > 0) {
                  RawSound var10 = var9.toRawSound().resample(MilliClock.decimator);
                  RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var2);
                  var11.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
                  TaskHandler.pcmStreamMixer.addSubStream(var11);
               }

               Client.queuedSoundEffectDelays[var0] = -100;
            }
         } else {
            --Client.soundEffectCount;

            for(int var1 = var0; var1 < Client.soundEffectCount; ++var1) {
               Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1];
               Client.soundEffects[var1] = Client.soundEffects[var1 + 1];
               Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1];
               Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1];
               Client.soundLocations[var1] = Client.soundLocations[var1 + 1];
            }

            --var0;
         }
      }

      if(Client.__client_qq) {
         boolean var12;
         if(class214.__hf_o != 0) {
            var12 = true;
         } else {
            var12 = class214.midiPcmStream.isReady();
         }

         if(!var12) {
            if(Client.__client_qf != 0 && Client.__client_qy != -1) {
               Login.method2076(UserComparator3.indexCache6, Client.__client_qy, 0, Client.__client_qf, false);
            }

            Client.__client_qq = false;
         }
      }

   }
}
