import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameShell implements Usernamed {
   @ObfuscatedName("mm")
   @ObfuscatedGetter(
      intValue = -783816509
   )
   @Export("rootWidgetGroup")
   static int rootWidgetGroup;
   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   @Export("clickedWidget")
   static Widget clickedWidget;
   @ObfuscatedName("oo")
   @ObfuscatedGetter(
      intValue = 1348053843
   )
   static int field98;
   @ObfuscatedName("os")
   @ObfuscatedGetter(
      intValue = -546798303
   )
   @Export("rootWidgetCount")
   static int rootWidgetCount;
   @ObfuscatedName("oa")
   @ObfuscatedGetter(
      longValue = 8818983958751331899L
   )
   static long field99;
   @ObfuscatedName("od")
   static boolean[] field100;
   @ObfuscatedName("oq")
   static boolean[] field101;
   @ObfuscatedName("ot")
   static boolean[] field102;
   @ObfuscatedName("nt")
   static boolean field103;
   @ObfuscatedName("ng")
   @ObfuscatedGetter(
      intValue = -1379876433
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("or")
   @Export("isResizable")
   static boolean isResizable;
   @ObfuscatedName("ss")
   @ObfuscatedGetter(
      intValue = -451622431
   )
   public static int field104;
   @ObfuscatedName("na")
   @ObfuscatedGetter(
      intValue = -934082817
   )
   static int field105;
   @ObfuscatedName("nn")
   static boolean field106;
   @ObfuscatedName("qq")
   static boolean field107;
   @ObfuscatedName("mt")
   @ObfuscatedGetter(
      intValue = -1972775883
   )
   @Export("widgetClickX")
   static int widgetClickX;
   @ObfuscatedName("me")
   @ObfuscatedGetter(
      intValue = 1052276727
   )
   @Export("widgetClickY")
   static int widgetClickY;
   @ObfuscatedName("nw")
   @ObfuscatedGetter(
      intValue = -843739713
   )
   static int field108;
   @ObfuscatedName("mr")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   @Export("clickedWidgetParent")
   static Widget clickedWidgetParent;
   @ObfuscatedName("oj")
   @Export("rootWidgetWidths")
   static int[] rootWidgetWidths;
   @ObfuscatedName("mj")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   @Export("widgetGroupParents")
   static NodeHashTable widgetGroupParents;
   @ObfuscatedName("oy")
   @Export("rootWidgetXs")
   static int[] rootWidgetXs;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = 1939745821
   )
   static int field109;
   @ObfuscatedName("mx")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   @Export("viewportWidget")
   static Widget viewportWidget;
   @ObfuscatedName("oz")
   @ObfuscatedGetter(
      intValue = -12672775
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("ox")
   @Export("rootWidgetHeights")
   static int[] rootWidgetHeights;
   @ObfuscatedName("mw")
   @ObfuscatedGetter(
      intValue = 821563709
   )
   @Export("rights")
   static int rights;
   @ObfuscatedName("oi")
   @Export("rootWidgetYs")
   static int[] rootWidgetYs;
   @ObfuscatedName("qz")
   @Export("isCameraLocked")
   static boolean isCameraLocked;
   @ObfuscatedName("on")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   @Export("widgetClickMasks")
   static NodeHashTable widgetClickMasks;
   @ObfuscatedName("tb")
   @ObfuscatedSignature(
      signature = "Lbl;"
   )
   static final class65 field895;
   @ObfuscatedName("og")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   @Export("scriptEvents")
   static NodeDeque scriptEvents;
   @ObfuscatedName("nk")
   @ObfuscatedGetter(
      intValue = 1019025247
   )
   static int field110;
   @ObfuscatedName("np")
   @ObfuscatedGetter(
      intValue = 1881890525
   )
   static int field111;
   @ObfuscatedName("pd")
   @ObfuscatedGetter(
      intValue = -362336323
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("pk")
   @ObfuscatedGetter(
      intValue = 1298845031
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("qy")
   @ObfuscatedGetter(
      intValue = -34294211
   )
   static int field112;
   @ObfuscatedName("tp")
   static int[] field113;
   @ObfuscatedName("th")
   static int[] field114;
   @ObfuscatedName("ny")
   @Export("isDraggingWidget")
   static boolean isDraggingWidget;
   @ObfuscatedName("oe")
   @ObfuscatedGetter(
      intValue = -1628183831
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("mk")
   @Export("selectedSpellActionName")
   static String selectedSpellActionName;
   @ObfuscatedName("mi")
   @ObfuscatedGetter(
      intValue = 933910819
   )
   @Export("runEnergy")
   static int runEnergy;
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = 36001423
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("mu")
   @Export("selectedSpellName")
   static String selectedSpellName;
   @ObfuscatedName("qc")
   @ObfuscatedGetter(
      intValue = -818676431
   )
   static int field115;
   @ObfuscatedName("nz")
   static int[] field116;
   @ObfuscatedName("ns")
   @ObfuscatedGetter(
      intValue = 743073293
   )
   static int field117;
   @ObfuscatedName("sd")
   @ObfuscatedGetter(
      intValue = 944933439
   )
   static int field118;
   @ObfuscatedName("ru")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static PlayerAppearance field119;
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      intValue = -1481002083
   )
   @Export("soundEffectCount")
   static int soundEffectCount;
   @ObfuscatedName("sb")
   @ObfuscatedSignature(
      signature = "[Lx;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("qv")
   @Export("soundEffectIds")
   static int[] soundEffectIds;
   @ObfuscatedName("sy")
   @Export("indexCacheLoaders")
   static ArrayList indexCacheLoaders;
   @ObfuscatedName("sl")
   @ObfuscatedGetter(
      intValue = -1605855913
   )
   static int field120;
   @ObfuscatedName("md")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("sq")
   @ObfuscatedGetter(
      intValue = -1546210597
   )
   @Export("indexCacheLoaderIndex")
   static int indexCacheLoaderIndex;
   @ObfuscatedName("qn")
   @Export("queuedSoundEffectLoops")
   static int[] queuedSoundEffectLoops;
   @ObfuscatedName("qd")
   @Export("queuedSoundEffectDelays")
   static int[] queuedSoundEffectDelays;
   @ObfuscatedName("nr")
   static int[] field121;
   @ObfuscatedName("nv")
   @ObfuscatedGetter(
      intValue = -758575207
   )
   static int field122;
   @ObfuscatedName("nd")
   @ObfuscatedGetter(
      intValue = 760022015
   )
   static int field123;
   @ObfuscatedName("ni")
   @ObfuscatedGetter(
      intValue = 1990512261
   )
   static int field124;
   @ObfuscatedName("qe")
   @ObfuscatedSignature(
      signature = "[Lci;"
   )
   @Export("soundEffects")
   static SoundEffect[] soundEffects;
   @ObfuscatedName("qk")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = -137788125
   )
   @Export("minimapState")
   static int minimapState;
   @ObfuscatedName("ph")
   @ObfuscatedGetter(
      intValue = 587773171
   )
   static int field125;
   @ObfuscatedName("pp")
   @ObfuscatedGetter(
      longValue = -1704358328771670975L
   )
   static long field126;
   @ObfuscatedName("sk")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   @Export("platformInfoProvider")
   static PlatformInfoProvider platformInfoProvider;
   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   static Widget field127;
   @ObfuscatedName("qf")
   @ObfuscatedGetter(
      intValue = 1365951359
   )
   static int field128;
   @ObfuscatedName("nh")
   @ObfuscatedGetter(
      intValue = -278874973
   )
   static int field129;
   @ObfuscatedName("rw")
   static short field130;
   @ObfuscatedName("qp")
   @ObfuscatedGetter(
      intValue = -1352723865
   )
   @Export("soundEffectVolume")
   static int soundEffectVolume;
   @ObfuscatedName("rm")
   static short field131;
   @ObfuscatedName("rs")
   static short field132;
   @ObfuscatedName("rp")
   static short field133;
   @ObfuscatedName("ri")
   static short field134;
   @ObfuscatedName("pi")
   @ObfuscatedGetter(
      intValue = 864673321
   )
   @Export("mapIconCount")
   static int mapIconCount;
   @ObfuscatedName("rz")
   @ObfuscatedGetter(
      intValue = 541065633
   )
   @Export("viewportZoom")
   static int viewportZoom;
   @ObfuscatedName("rv")
   static short field135;
   @ObfuscatedName("ry")
   @ObfuscatedGetter(
      intValue = 2035623995
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("rx")
   @ObfuscatedGetter(
      intValue = -629885193
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("ps")
   @Export("mapIconXs")
   static int[] mapIconXs;
   @ObfuscatedName("pw")
   @Export("mapIconYs")
   static int[] mapIconYs;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      intValue = 247245677
   )
   @Export("chatEffects")
   static int chatEffects;
   @ObfuscatedName("po")
   @ObfuscatedSignature(
      signature = "[Lln;"
   )
   @Export("mapIcons")
   static Sprite[] mapIcons;
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = 1694810089
   )
   static int field136;
   @ObfuscatedName("rr")
   @ObfuscatedGetter(
      intValue = 386331251
   )
   @Export("viewportOffsetX")
   static int viewportOffsetX;
   @ObfuscatedName("rn")
   @ObfuscatedGetter(
      intValue = 992721193
   )
   @Export("viewportOffsetY")
   static int viewportOffsetY;
   @ObfuscatedName("pm")
   @ObfuscatedGetter(
      intValue = -460406997
   )
   static int field137;
   @ObfuscatedName("pl")
   @ObfuscatedGetter(
      intValue = -1362734353
   )
   static int field138;
   @ObfuscatedName("rh")
   static boolean[] field139;
   @ObfuscatedName("ml")
   @ObfuscatedGetter(
      intValue = 1602665191
   )
   @Export("followerIndex")
   static int followerIndex;
   @ObfuscatedName("pt")
   @ObfuscatedGetter(
      intValue = -1802494233
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("sx")
   @ObfuscatedGetter(
      intValue = 206275573
   )
   static int field140;
   @ObfuscatedName("rd")
   static int[] field141;
   @ObfuscatedName("rl")
   static int[] field142;
   @ObfuscatedName("rj")
   static int[] field143;
   @ObfuscatedName("rk")
   static int[] field144;
   @ObfuscatedName("pn")
   static int[] field145;
   @ObfuscatedName("pq")
   static int[] field146;
   @ObfuscatedName("oh")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   static NodeDeque field147;
   @ObfuscatedName("oc")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   static NodeDeque field148;
   @ObfuscatedName("rb")
   static short field149;
   @ObfuscatedName("re")
   static short field150;
   @ObfuscatedName("mf")
   @ObfuscatedGetter(
      intValue = -1715020411
   )
   static int field151;
   @ObfuscatedName("pu")
   static long[] field152;
   @ObfuscatedName("ms")
   @ObfuscatedGetter(
      intValue = 2128395635
   )
   static int field153;
   @ObfuscatedName("nc")
   @ObfuscatedGetter(
      intValue = 344308849
   )
   static int field154;
   @ObfuscatedName("nf")
   @Export("changedSkills")
   static int[] changedSkills;
   @ObfuscatedName("nx")
   @ObfuscatedGetter(
      intValue = 1132932607
   )
   @Export("changedSkillsCount")
   static int changedSkillsCount;
   @ObfuscatedName("mn")
   static boolean field155;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = 1230692157
   )
   static int field156;
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = 1467519791
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = 535219347
   )
   static int field157;
   @ObfuscatedName("pz")
   static String field158;
   @ObfuscatedName("sj")
   @ObfuscatedSignature(
      signature = "Lbj;"
   )
   static OwnWorldComparator field159;
   @ObfuscatedName("pv")
   static int[] field160;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lfy;"
   )
   @Export("collisionMaps")
   static CollisionMap[] collisionMaps;
   @ObfuscatedName("ai")
   static boolean field161;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1412639841
   )
   @Export("worldId")
   public static int worldId;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 352819683
   )
   @Export("worldProperties")
   static int worldProperties;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1186004739
   )
   @Export("gameBuild")
   static int gameBuild;
   @ObfuscatedName("bd")
   @Export("isMembersWorld")
   public static boolean isMembersWorld;
   @ObfuscatedName("bc")
   @Export("isLowDetail")
   static boolean isLowDetail;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 2068355509
   )
   @Export("language")
   static int language;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1678472241
   )
   @Export("clientType")
   static int clientType;
   @ObfuscatedName("bl")
   static boolean field162;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 244995961
   )
   @Export("gameState")
   static int gameState;
   @ObfuscatedName("cj")
   @Export("isLoading")
   static boolean isLoading;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 1909006131
   )
   @Export("cycle")
   static int cycle;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      longValue = 8445874050676184263L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -1731573291
   )
   static int field163;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1313705721
   )
   static int field164;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      longValue = -6574384275386813769L
   )
   static long field165;
   @ObfuscatedName("cw")
   static boolean field166;
   @ObfuscatedName("cg")
   @Export("displayFps")
   static boolean displayFps;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -1792536059
   )
   @Export("rebootTimer")
   static int rebootTimer;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = -871534943
   )
   @Export("hintArrowType")
   static int hintArrowType;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1485594821
   )
   @Export("hintArrowNpcIndex")
   static int hintArrowNpcIndex;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -1036874153
   )
   @Export("hintArrowPlayerIndex")
   static int hintArrowPlayerIndex;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -1757834373
   )
   @Export("hintArrowX")
   static int hintArrowX;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = -123748133
   )
   @Export("hintArrowY")
   static int hintArrowY;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -627650567
   )
   @Export("hintArrowHeight")
   static int hintArrowHeight;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 749254081
   )
   @Export("hintArrowSubX")
   static int hintArrowSubX;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = 1393270633
   )
   @Export("hintArrowSubY")
   static int hintArrowSubY;
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = -1520594673
   )
   @Export("titleLoadingStage")
   static int titleLoadingStage;
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      intValue = -1431050759
   )
   @Export("js5ConnectState")
   static int js5ConnectState;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 1154760205
   )
   static int field167;
   @ObfuscatedName("ek")
   @ObfuscatedGetter(
      intValue = 1791955261
   )
   @Export("js5Errors")
   static int js5Errors;
   @ObfuscatedName("ed")
   @ObfuscatedGetter(
      intValue = -163579343
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("ex")
   @ObfuscatedGetter(
      intValue = 755300107
   )
   static int field168;
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = -964416527
   )
   static int field169;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = 689094231
   )
   static int field170;
   @ObfuscatedName("en")
   @ObfuscatedSignature(
      signature = "Lfc;"
   )
   static class159 field658;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = -447055355
   )
   static int field171;
   @ObfuscatedName("ew")
   @Export("Login_isUsernameRemembered")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      signature = "Lcn;"
   )
   @Export("secureRandomFuture")
   static SecureRandomFuture secureRandomFuture;
   @ObfuscatedName("ev")
   static byte[] field172;
   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      signature = "[Lcv;"
   )
   @Export("npcs")
   static NPC[] npcs;
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      intValue = -1569269731
   )
   @Export("npcCount")
   static int npcCount;
   @ObfuscatedName("fq")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("fw")
   @ObfuscatedGetter(
      intValue = 516059665
   )
   static int field173;
   @ObfuscatedName("fg")
   static int[] field174;
   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   @Export("packetWriter")
   public static final PacketWriter packetWriter;
   @ObfuscatedName("fd")
   @ObfuscatedGetter(
      intValue = -1050480853
   )
   static int field175;
   @ObfuscatedName("fh")
   static boolean field176;
   @ObfuscatedName("fx")
   @Export("useBufferedSocket")
   static boolean useBufferedSocket;
   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "Ljo;"
   )
   @Export("timer")
   static Timer timer;
   @ObfuscatedName("ft")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("fe")
   @ObfuscatedGetter(
      intValue = 829228151
   )
   static int field177;
   @ObfuscatedName("fn")
   @ObfuscatedGetter(
      intValue = -597100741
   )
   static int field178;
   @ObfuscatedName("fk")
   @ObfuscatedGetter(
      intValue = 8470625
   )
   static int field179;
   @ObfuscatedName("gp")
   @ObfuscatedGetter(
      intValue = 685418907
   )
   static int field180;
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = -1456975367
   )
   static int field181;
   @ObfuscatedName("gg")
   @Export("isInInstance")
   static boolean isInInstance;
   @ObfuscatedName("gq")
   @Export("instanceChunkTemplates")
   static int[][][] instanceChunkTemplates;
   @ObfuscatedName("gd")
   static final int[] field182;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = -134014371
   )
   static int field183;
   @ObfuscatedName("hx")
   @ObfuscatedGetter(
      intValue = -1406125895
   )
   static int field184;
   @ObfuscatedName("hn")
   @ObfuscatedGetter(
      intValue = -516933613
   )
   static int field185;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = 1664350313
   )
   static int field186;
   @ObfuscatedName("hg")
   @ObfuscatedGetter(
      intValue = 1658018867
   )
   static int field187;
   @ObfuscatedName("hh")
   static boolean field188;
   @ObfuscatedName("hd")
   @ObfuscatedGetter(
      intValue = 438998245
   )
   static int field189;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = 410614005
   )
   @Export("cameraPitchTarget")
   static int cameraPitchTarget;
   @ObfuscatedName("hp")
   @ObfuscatedGetter(
      intValue = -1163038981
   )
   @Export("minimapOrientation")
   static int minimapOrientation;
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      intValue = 218086227
   )
   static int field190;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = -480633777
   )
   static int field191;
   @ObfuscatedName("hi")
   @ObfuscatedGetter(
      intValue = 402871301
   )
   static int field192;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 1502058429
   )
   static int field193;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = -1420078475
   )
   @Export("oculusOrbState")
   static int oculusOrbState;
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = 1005832199
   )
   @Export("cameraFollowHeight")
   static int cameraFollowHeight;
   @ObfuscatedName("hc")
   @ObfuscatedGetter(
      intValue = -441913785
   )
   static int field194;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = -1149138989
   )
   static int field195;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = -952172003
   )
   static int field196;
   @ObfuscatedName("ie")
   @ObfuscatedGetter(
      intValue = 236939601
   )
   @Export("oculusOrbNormalSpeed")
   static int oculusOrbNormalSpeed;
   @ObfuscatedName("in")
   @ObfuscatedGetter(
      intValue = 351193663
   )
   static int field197;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = -1063713523
   )
   public static int field198;
   @ObfuscatedName("ij")
   static boolean field199;
   @ObfuscatedName("iy")
   @ObfuscatedGetter(
      intValue = -1213062413
   )
   static int field200;
   @ObfuscatedName("is")
   static boolean field201;
   @ObfuscatedName("ik")
   @ObfuscatedGetter(
      intValue = 910983131
   )
   static int field202;
   @ObfuscatedName("ir")
   @ObfuscatedGetter(
      intValue = 616180377
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = 1889277277
   )
   @Export("overheadTextLimit")
   static int overheadTextLimit;
   @ObfuscatedName("it")
   @Export("selectedItemName")
   static String selectedItemName;
   @ObfuscatedName("iq")
   @Export("overheadTextXs")
   static int[] overheadTextXs;
   @ObfuscatedName("iu")
   @Export("overheadTextYs")
   static int[] overheadTextYs;
   @ObfuscatedName("ip")
   @Export("overheadTextAscents")
   static int[] overheadTextAscents;
   @ObfuscatedName("ib")
   @Export("overheadTextXOffsets")
   static int[] overheadTextXOffsets;
   @ObfuscatedName("ic")
   @Export("overheadTextColors")
   static int[] overheadTextColors;
   @ObfuscatedName("iw")
   @Export("overheadTextEffects")
   static int[] overheadTextEffects;
   @ObfuscatedName("io")
   @Export("overheadTextCyclesRemaining")
   static int[] overheadTextCyclesRemaining;
   @ObfuscatedName("ih")
   @Export("overheadText")
   static String[] overheadText;
   @ObfuscatedName("im")
   @Export("tileLastDrawnActor")
   static int[][] tileLastDrawnActor;
   @ObfuscatedName("ii")
   @ObfuscatedGetter(
      intValue = 289477221
   )
   @Export("viewportDrawCount")
   static int viewportDrawCount;
   @ObfuscatedName("ig")
   @ObfuscatedGetter(
      intValue = 424442889
   )
   @Export("viewportTempX")
   static int viewportTempX;
   @ObfuscatedName("ia")
   @ObfuscatedGetter(
      intValue = -81902865
   )
   @Export("viewportTempY")
   static int viewportTempY;
   @ObfuscatedName("jb")
   @ObfuscatedGetter(
      intValue = 202604997
   )
   @Export("mouseCrossX")
   static int mouseCrossX;
   @ObfuscatedName("jq")
   @ObfuscatedGetter(
      intValue = -1984048653
   )
   @Export("mouseCrossY")
   static int mouseCrossY;
   @ObfuscatedName("jw")
   @ObfuscatedGetter(
      intValue = -1302827103
   )
   @Export("mouseCrossState")
   static int mouseCrossState;
   @ObfuscatedName("jm")
   @ObfuscatedGetter(
      intValue = 233318639
   )
   @Export("mouseCrossColor")
   static int mouseCrossColor;
   @ObfuscatedName("jr")
   @Export("showMouseCross")
   static boolean showMouseCross;
   @ObfuscatedName("ju")
   @ObfuscatedGetter(
      intValue = 1691923909
   )
   static int field203;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = -1267243587
   )
   static int field204;
   @ObfuscatedName("jp")
   @ObfuscatedGetter(
      intValue = 485534011
   )
   @Export("dragItemSlotSource")
   static int dragItemSlotSource;
   @ObfuscatedName("ja")
   @ObfuscatedGetter(
      intValue = 813973829
   )
   static int field205;
   @ObfuscatedName("je")
   @ObfuscatedGetter(
      intValue = 1959822241
   )
   static int field206;
   @ObfuscatedName("jy")
   @ObfuscatedGetter(
      intValue = -836653679
   )
   @Export("dragItemSlotDestination")
   static int dragItemSlotDestination;
   @ObfuscatedName("jl")
   static boolean field207;
   @ObfuscatedName("jt")
   @ObfuscatedGetter(
      intValue = 1486366835
   )
   @Export("itemDragDuration")
   static int itemDragDuration;
   @ObfuscatedName("jc")
   @ObfuscatedGetter(
      intValue = 1084498299
   )
   static int field208;
   @ObfuscatedName("jj")
   @Export("showLoadingMessages")
   static boolean showLoadingMessages;
   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "[Lbr;"
   )
   @Export("players")
   static Player[] players;
   @ObfuscatedName("ji")
   @ObfuscatedGetter(
      intValue = -1869532553
   )
   @Export("localPlayerIndex")
   static int localPlayerIndex;
   @ObfuscatedName("jo")
   @ObfuscatedGetter(
      intValue = -836962805
   )
   static int field209;
   @ObfuscatedName("js")
   @Export("renderSelf")
   static boolean renderSelf;
   @ObfuscatedName("ke")
   @ObfuscatedGetter(
      intValue = -1208823721
   )
   static int field210;
   @ObfuscatedName("ky")
   @ObfuscatedGetter(
      intValue = -64320473
   )
   static int field211;
   @ObfuscatedName("kd")
   static int[] field212;
   @ObfuscatedName("kp")
   @Export("playerMenuOpcodes")
   static final int[] playerMenuOpcodes;
   @ObfuscatedName("kq")
   @Export("playerMenuActions")
   static String[] playerMenuActions;
   @ObfuscatedName("kv")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("kn")
   static int[] field213;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = -1309758309
   )
   @Export("combatTargetPlayerIndex")
   static int combatTargetPlayerIndex;
   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      signature = "[[[Lje;"
   )
   @Export("groundItems")
   static NodeDeque[][][] groundItems;
   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   static NodeDeque field214;
   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   @Export("projectiles")
   static NodeDeque projectiles;
   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   @Export("graphicsObjects")
   static NodeDeque graphicsObjects;
   @ObfuscatedName("ki")
   @Export("currentLevels")
   static int[] currentLevels;
   @ObfuscatedName("kr")
   @Export("levels")
   static int[] levels;
   @ObfuscatedName("kb")
   @Export("experience")
   static int[] experience;
   @ObfuscatedName("ku")
   @ObfuscatedGetter(
      intValue = -898263359
   )
   static int field215;
   @ObfuscatedName("kc")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("ll")
   @ObfuscatedGetter(
      intValue = -1749538901
   )
   @Export("menuOptionsCount")
   static int menuOptionsCount;
   @ObfuscatedName("ly")
   @Export("menuArguments1")
   static int[] menuArguments1;
   @ObfuscatedName("li")
   @Export("menuArguments2")
   static int[] menuArguments2;
   @ObfuscatedName("lh")
   @Export("menuOpcodes")
   static int[] menuOpcodes;
   @ObfuscatedName("lk")
   @Export("menuArguments0")
   static int[] menuArguments0;
   @ObfuscatedName("ld")
   @Export("menuActions")
   static String[] menuActions;
   @ObfuscatedName("la")
   @Export("menuTargetNames")
   static String[] menuTargetNames;
   @ObfuscatedName("lt")
   @Export("menuShiftClick")
   static boolean[] menuShiftClick;
   @ObfuscatedName("lw")
   @Export("followerOpsLowPriority")
   static boolean followerOpsLowPriority;
   @ObfuscatedName("lf")
   @Export("shiftClickDrop")
   static boolean shiftClickDrop;
   @ObfuscatedName("lp")
   @Export("tapToDrop")
   static boolean tapToDrop;
   @ObfuscatedName("lj")
   @Export("showMouseOverText")
   static boolean showMouseOverText;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 26099827
   )
   static int field216;
   @ObfuscatedName("ln")
   @ObfuscatedGetter(
      intValue = 885052255
   )
   static int field217;
   @ObfuscatedName("lb")
   @ObfuscatedGetter(
      intValue = 699084605
   )
   static int field218;
   @ObfuscatedName("ls")
   @ObfuscatedGetter(
      intValue = -274968037
   )
   static int field219;
   @ObfuscatedName("lz")
   @ObfuscatedGetter(
      intValue = 1630772923
   )
   @Export("isItemSelected")
   static int isItemSelected;
   @ObfuscatedName("lv")
   @Export("isSpellSelected")
   static boolean isSpellSelected;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = 196309625
   )
   static int field220;

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1773624745"
   )
   protected final void vmethod107() {
      field99 = class203.currentTimeMs() + 500L;
      this.method84();
      if (rootWidgetGroup != -1) {
         this.method87(true);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1297880469"
   )
   @Export("setUp")
   protected final void setUp() {
      WorldMapCacheName.method633(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      class2.port1 = gameBuild == 0 ? 43594 : worldId + 40000;
      WorldMapArea.port2 = gameBuild == 0 ? 443 : worldId + 50000;
      class203.port3 = class2.port1;
      PlayerAppearance.field726 = class226.field1132;
      class229.field1137 = class226.field1133;
      class227.field1136 = class226.field1134;
      IndexCacheLoader.field406 = class226.field1135;
      TriBool.urlRequester = new UrlRequester();
      this.setUpKeyboard();
      this.setUpMouse();
      class16.mouseWheel = this.mouseWheel();
      Fonts.indexStore255 = new IndexStore(255, class168.dat2File, class168.idx255File, 500000);
      ReflectionCheck.clientPreferences = class306.method5780();
      this.setUpClipboard();
      String var1 = Ignored.field402;
      class50.field1159 = this;
      if (var1 != null) {
         class50.field1160 = var1;
      }

      if (gameBuild != 0) {
         displayFps = true;
      }

      GroundItem.method2095(ReflectionCheck.clientPreferences.windowMode);
      WorldMapArea.friendSystem = new FriendSystem(KeyHandler.loginType);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1445885427"
   )
   protected final void vmethod112() {
      ++cycle;
      this.doCycleJs5();
      class3.method41();

      int var1;
      try {
         if (class214.field1129 == 1) {
            var1 = class214.midiPcmStream.method170();
            if (var1 > 0 && class214.midiPcmStream.isReady()) {
               var1 -= FaceNormal.field344;
               if (var1 < 0) {
                  var1 = 0;
               }

               class214.midiPcmStream.method169(var1);
            } else {
               class214.midiPcmStream.clear();
               class214.midiPcmStream.removeAll();
               if (class214.field1130 != null) {
                  class214.field1129 = 2;
               } else {
                  class214.field1129 = 0;
               }

               class13.musicTrack = null;
               class307.soundCache = null;
            }
         }
      } catch (Exception var54) {
         var54.printStackTrace();
         class214.midiPcmStream.clear();
         class214.field1129 = 0;
         class13.musicTrack = null;
         class307.soundCache = null;
         class214.field1130 = null;
      }

      class13.playPcmPlayers();
      class171.method3498();
      MouseHandler var2 = MouseHandler.MouseHandler_instance;
      synchronized(MouseHandler.MouseHandler_instance) {
         MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButton0;
         MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_x0;
         MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_y0;
         MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_millis0;
         MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButton0;
         MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedX0;
         MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedY0;
         MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis0;
         MouseHandler.MouseHandler_lastButton0 = 0;
      }

      if (class16.mouseWheel != null) {
         var1 = class16.mouseWheel.useRotation();
         mouseWheelRotation = var1;
      }

      if (gameState == 0) {
         class171.method3497();
         class11.method145();
      } else if (gameState == 5) {
         class54.method1092(this);
         class171.method3497();
         class11.method145();
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            class54.method1092(this);
            this.doCycleLoggedOut();
         } else if (gameState == 25) {
            UserComparator10.method3352(false);
            field177 = 0;
            boolean var3 = true;

            int var4;
            for (var4 = 0; var4 < class40.regionLandArchives.length; ++var4) {
               if (IndexCacheLoader.regionMapArchiveIds[var4] != -1 && class40.regionLandArchives[var4] == null) {
                  class40.regionLandArchives[var4] = SecureRandomFuture.indexCache5.takeRecord(IndexCacheLoader.regionMapArchiveIds[var4], 0);
                  if (class40.regionLandArchives[var4] == null) {
                     var3 = false;
                     ++field177;
                  }
               }

               if (MouseHandler.regionLandArchiveIds[var4] != -1 && HealthBarUpdate.regionMapArchives[var4] == null) {
                  HealthBarUpdate.regionMapArchives[var4] = SecureRandomFuture.indexCache5.takeRecordEncrypted(MouseHandler.regionLandArchiveIds[var4], 0, class190.xteaKeys[var4]);
                  if (HealthBarUpdate.regionMapArchives[var4] == null) {
                     var3 = false;
                     ++field177;
                  }
               }
            }

            if (!var3) {
               field181 = 1;
            } else {
               field179 = 0;
               var3 = true;

               int var5;
               int var6;
               for (var4 = 0; var4 < class40.regionLandArchives.length; ++var4) {
                  byte[] var7 = HealthBarUpdate.regionMapArchives[var4];
                  if (var7 != null) {
                     var5 = (class308.regions[var4] >> 8) * 64 - class50.baseX;
                     var6 = (class308.regions[var4] & 255) * 64 - GraphicsObject.baseY;
                     if (isInInstance) {
                        var5 = 10;
                        var6 = 10;
                     }

                     var3 &= TextureProvider.method2774(var7, var5, var6);
                  }
               }

               if (!var3) {
                  field181 = 2;
               } else {
                  if (field181 != 0) {
                     class68.drawLoadingMessage("Loading - please wait.<br> (100%)", true);
                  }

                  class13.playPcmPlayers();
                  class65.scene.clear();

                  for (var4 = 0; var4 < 4; ++var4) {
                     collisionMaps[var4].clear();
                  }

                  int var55;
                  for (var4 = 0; var4 < 4; ++var4) {
                     for (var55 = 0; var55 < 104; ++var55) {
                        for (var5 = 0; var5 < 104; ++var5) {
                           Tiles.Tiles_renderFlags[var4][var55][var5] = 0;
                        }
                     }
                  }

                  class13.playPcmPlayers();
                  Tiles.Tiles_minPlane = 99;
                  Tiles.field908 = new byte[4][104][104];
                  Fonts.field350 = new byte[4][104][104];
                  class32.field1157 = new byte[4][104][104];
                  class307.field1155 = new byte[4][104][104];
                  Tiles.field910 = new int[4][105][105];
                  Tiles.field909 = new byte[4][105][105];
                  Huffman.field398 = new int[105][105];
                  class13.field1112 = new int[104];
                  Formatting.field353 = new int[104];
                  class214.field1131 = new int[104];
                  WorldMapSectionType.field1104 = new int[104];
                  Message.field490 = new int[104];
                  var4 = class40.regionLandArchives.length;
                  SpriteMask.method4390();
                  UserComparator10.method3352(true);
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  int var20;
                  int var21;
                  if (!isInInstance) {
                     byte[] var22;
                     for (var55 = 0; var55 < var4; ++var55) {
                        var5 = (class308.regions[var55] >> 8) * 64 - class50.baseX;
                        var6 = (class308.regions[var55] & 255) * 64 - GraphicsObject.baseY;
                        var22 = class40.regionLandArchives[var55];
                        if (var22 != null) {
                           class13.playPcmPlayers();
                           Varcs.method2166(var22, var5, var6, GameObject.field359 * 8 - 48, WorldMapLabelSize.field1041 * 8 - 48, collisionMaps);
                        }
                     }

                     for (var55 = 0; var55 < var4; ++var55) {
                        var5 = (class308.regions[var55] >> 8) * 64 - class50.baseX;
                        var6 = (class308.regions[var55] & 255) * 64 - GraphicsObject.baseY;
                        var22 = class40.regionLandArchives[var55];
                        if (var22 == null && WorldMapLabelSize.field1041 < 800) {
                           class13.playPcmPlayers();
                           UserComparator6.method3390(var5, var6, 64, 64);
                        }
                     }

                     UserComparator10.method3352(true);

                     for (var55 = 0; var55 < var4; ++var55) {
                        byte[] var23 = HealthBarUpdate.regionMapArchives[var55];
                        if (var23 != null) {
                           var6 = (class308.regions[var55] >> 8) * 64 - class50.baseX;
                           var21 = (class308.regions[var55] & 255) * 64 - GraphicsObject.baseY;
                           class13.playPcmPlayers();
                           Scene var24 = class65.scene;
                           CollisionMap[] var25 = collisionMaps;
                           Buffer var26 = new Buffer(var23);
                           var8 = -1;

                           while (true) {
                              var9 = var26.method49();
                              if (var9 == 0) {
                                 break;
                              }

                              var8 += var9;
                              var10 = 0;

                              while (true) {
                                 var11 = var26.method48();
                                 if (var11 == 0) {
                                    break;
                                 }

                                 var10 += var11 - 1;
                                 var12 = var10 & 63;
                                 var13 = var10 >> 6 & 63;
                                 var14 = var10 >> 12;
                                 var15 = var26.readUnsignedByte();
                                 var16 = var15 >> 2;
                                 var17 = var15 & 3;
                                 var18 = var6 + var13;
                                 var19 = var12 + var21;
                                 if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                                    var20 = var14;
                                    if ((Tiles.Tiles_renderFlags[1][var18][var19] & 2) == 2) {
                                       var20 = var14 - 1;
                                    }

                                    CollisionMap var27 = null;
                                    if (var20 >= 0) {
                                       var27 = var25[var20];
                                    }

                                    class227.method4446(var14, var18, var19, var8, var17, var16, var24, var27);
                                 }
                              }
                           }
                        }
                     }
                  }

                  int var56;
                  int var57;
                  int var58;
                  if (isInInstance) {
                     var55 = 0;

                     label998:
                     while (true) {
                        if (var55 >= 4) {
                           for (var55 = 0; var55 < 13; ++var55) {
                              for (var5 = 0; var5 < 13; ++var5) {
                                 var6 = instanceChunkTemplates[0][var55][var5];
                                 if (var6 == -1) {
                                    UserComparator6.method3390(var55 * 8, var5 * 8, 8, 8);
                                 }
                              }
                           }

                           UserComparator10.method3352(true);
                           var55 = 0;

                           while (true) {
                              if (var55 >= 4) {
                                 break label998;
                              }

                              class13.playPcmPlayers();

                              for (var5 = 0; var5 < 13; ++var5) {
                                 for (var6 = 0; var6 < 13; ++var6) {
                                    var21 = instanceChunkTemplates[var55][var5][var6];
                                    if (var21 != -1) {
                                       var56 = var21 >> 24 & 3;
                                       var57 = var21 >> 1 & 3;
                                       var58 = var21 >> 14 & 1023;
                                       var8 = var21 >> 3 & 2047;
                                       var9 = (var58 / 8 << 8) + var8 / 8;

                                       for (var10 = 0; var10 < class308.regions.length; ++var10) {
                                          if (class308.regions[var10] == var9 && HealthBarUpdate.regionMapArchives[var10] != null) {
                                             ServerPacket.method3662(HealthBarUpdate.regionMapArchives[var10], var55, var5 * 8, var6 * 8, var56, (var58 & 7) * 8, (var8 & 7) * 8, var57, class65.scene, collisionMaps);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }

                              ++var55;
                           }
                        }

                        class13.playPcmPlayers();

                        for (var5 = 0; var5 < 13; ++var5) {
                           for (var6 = 0; var6 < 13; ++var6) {
                              boolean var59 = false;
                              var56 = instanceChunkTemplates[var55][var5][var6];
                              if (var56 != -1) {
                                 var57 = var56 >> 24 & 3;
                                 var58 = var56 >> 1 & 3;
                                 var8 = var56 >> 14 & 1023;
                                 var9 = var56 >> 3 & 2047;
                                 var10 = (var8 / 8 << 8) + var9 / 8;

                                 for (var11 = 0; var11 < class308.regions.length; ++var11) {
                                    if (class308.regions[var11] == var10 && class40.regionLandArchives[var11] != null) {
                                       class204.method4013(class40.regionLandArchives[var11], var55, var5 * 8, var6 * 8, var57, (var8 & 7) * 8, (var9 & 7) * 8, var58, collisionMaps);
                                       var59 = true;
                                       break;
                                    }
                                 }
                              }

                              if (!var59) {
                                 var57 = var55;
                                 var58 = var5 * 8;
                                 var8 = var6 * 8;

                                 for (var9 = 0; var9 < 8; ++var9) {
                                    for (var10 = 0; var10 < 8; ++var10) {
                                       Tiles.Tiles_heights[var57][var9 + var58][var10 + var8] = 0;
                                    }
                                 }

                                 if (var58 > 0) {
                                    for (var9 = 1; var9 < 8; ++var9) {
                                       Tiles.Tiles_heights[var57][var58][var8 + var9] = Tiles.Tiles_heights[var57][var58 - 1][var8 + var9];
                                    }
                                 }

                                 if (var8 > 0) {
                                    for (var9 = 1; var9 < 8; ++var9) {
                                       Tiles.Tiles_heights[var57][var58 + var9][var8] = Tiles.Tiles_heights[var57][var58 + var9][var8 - 1];
                                    }
                                 }

                                 if (var58 > 0 && Tiles.Tiles_heights[var57][var58 - 1][var8] != 0) {
                                    Tiles.Tiles_heights[var57][var58][var8] = Tiles.Tiles_heights[var57][var58 - 1][var8];
                                 } else if (var8 > 0 && Tiles.Tiles_heights[var57][var58][var8 - 1] != 0) {
                                    Tiles.Tiles_heights[var57][var58][var8] = Tiles.Tiles_heights[var57][var58][var8 - 1];
                                 } else if (var58 > 0 && var8 > 0 && Tiles.Tiles_heights[var57][var58 - 1][var8 - 1] != 0) {
                                    Tiles.Tiles_heights[var57][var58][var8] = Tiles.Tiles_heights[var57][var58 - 1][var8 - 1];
                                 }
                              }
                           }
                        }

                        ++var55;
                     }
                  }

                  UserComparator10.method3352(true);
                  class13.playPcmPlayers();
                  Scene var60 = class65.scene;
                  CollisionMap[] var61 = collisionMaps;

                  for (var6 = 0; var6 < 4; ++var6) {
                     for (var21 = 0; var21 < 104; ++var21) {
                        for (var56 = 0; var56 < 104; ++var56) {
                           if ((Tiles.Tiles_renderFlags[var6][var21][var56] & 1) == 1) {
                              var57 = var6;
                              if ((Tiles.Tiles_renderFlags[1][var21][var56] & 2) == 2) {
                                 var57 = var6 - 1;
                              }

                              if (var57 >= 0) {
                                 var61[var57].method92(var21, var56);
                              }
                           }
                        }
                     }
                  }

                  Tiles.field917 += (int)(Math.random() * 5.0D) - 2;
                  if (Tiles.field917 < -8) {
                     Tiles.field917 = -8;
                  }

                  if (Tiles.field917 > 8) {
                     Tiles.field917 = 8;
                  }

                  Tiles.field918 += (int)(Math.random() * 5.0D) - 2;
                  if (Tiles.field918 < -16) {
                     Tiles.field918 = -16;
                  }

                  if (Tiles.field918 > 16) {
                     Tiles.field918 = 16;
                  }

                  int[] var10000;
                  for (var6 = 0; var6 < 4; ++var6) {
                     byte[][] var62 = Tiles.field909[var6];
                     var10 = (int)Math.sqrt(5100.0D);
                     var11 = var10 * 768 >> 8;

                     int var28;
                     for (var12 = 1; var12 < 103; ++var12) {
                        for (var13 = 1; var13 < 103; ++var13) {
                           var14 = Tiles.Tiles_heights[var6][var13 + 1][var12] - Tiles.Tiles_heights[var6][var13 - 1][var12];
                           var15 = Tiles.Tiles_heights[var6][var13][var12 + 1] - Tiles.Tiles_heights[var6][var13][var12 - 1];
                           var16 = (int)Math.sqrt((double)(var15 * var15 + var14 * var14 + 65536));
                           var17 = (var14 << 8) / var16;
                           var18 = 65536 / var16;
                           var19 = (var15 << 8) / var16;
                           var20 = (var19 * -50 + var17 * -50 + var18 * -10) / var11 + 96;
                           var28 = (var62[var13 - 1][var12] >> 2) + (var62[var13][var12 - 1] >> 2) + (var62[var13 + 1][var12] >> 3) + (var62[var13][var12 + 1] >> 3) + (var62[var13][var12] >> 1);
                           Huffman.field398[var13][var12] = var20 - var28;
                        }
                     }

                     for (var12 = 0; var12 < 104; ++var12) {
                        class13.field1112[var12] = 0;
                        Formatting.field353[var12] = 0;
                        class214.field1131[var12] = 0;
                        WorldMapSectionType.field1104[var12] = 0;
                        Message.field490[var12] = 0;
                     }

                     for (var12 = -5; var12 < 109; ++var12) {
                        for (var13 = 0; var13 < 104; ++var13) {
                           var14 = var12 + 5;
                           int var10002;
                           UnderlayDefinition var29;
                           if (var14 >= 0 && var14 < 104) {
                              var15 = Tiles.field908[var6][var14][var13] & 255;
                              if (var15 > 0) {
                                 var29 = StudioGame.method4550(var15 - 1);
                                 var10000 = class13.field1112;
                                 var10000[var13] += var29.hue;
                                 var10000 = Formatting.field353;
                                 var10000[var13] += var29.saturation;
                                 var10000 = class214.field1131;
                                 var10000[var13] += var29.lightness;
                                 var10000 = WorldMapSectionType.field1104;
                                 var10000[var13] += var29.hueMultiplier;
                                 var10002 = Message.field490[var13]++;
                              }
                           }

                           var15 = var12 - 5;
                           if (var15 >= 0 && var15 < 104) {
                              var16 = Tiles.field908[var6][var15][var13] & 255;
                              if (var16 > 0) {
                                 var29 = StudioGame.method4550(var16 - 1);
                                 var10000 = class13.field1112;
                                 var10000[var13] -= var29.hue;
                                 var10000 = Formatting.field353;
                                 var10000[var13] -= var29.saturation;
                                 var10000 = class214.field1131;
                                 var10000[var13] -= var29.lightness;
                                 var10000 = WorldMapSectionType.field1104;
                                 var10000[var13] -= var29.hueMultiplier;
                                 var10002 = Message.field490[var13]--;
                              }
                           }
                        }

                        if (var12 >= 1 && var12 < 103) {
                           var13 = 0;
                           var14 = 0;
                           var15 = 0;
                           var16 = 0;
                           var17 = 0;

                           for (var18 = -5; var18 < 109; ++var18) {
                              var19 = var18 + 5;
                              if (var19 >= 0 && var19 < 104) {
                                 var13 += class13.field1112[var19];
                                 var14 += Formatting.field353[var19];
                                 var15 += class214.field1131[var19];
                                 var16 += WorldMapSectionType.field1104[var19];
                                 var17 += Message.field490[var19];
                              }

                              var20 = var18 - 5;
                              if (var20 >= 0 && var20 < 104) {
                                 var13 -= class13.field1112[var20];
                                 var14 -= Formatting.field353[var20];
                                 var15 -= class214.field1131[var20];
                                 var16 -= WorldMapSectionType.field1104[var20];
                                 var17 -= Message.field490[var20];
                              }

                              if (var18 >= 1 && var18 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var12][var18] & 2) != 0 || (Tiles.Tiles_renderFlags[var6][var12][var18] & 16) == 0)) {
                                 if (var6 < Tiles.Tiles_minPlane) {
                                    Tiles.Tiles_minPlane = var6;
                                 }

                                 var28 = Tiles.field908[var6][var12][var18] & 255;
                                 int var65 = Fonts.field350[var6][var12][var18] & 255;
                                 if (var28 > 0 || var65 > 0) {
                                    int var30 = Tiles.Tiles_heights[var6][var12][var18];
                                    int var31 = Tiles.Tiles_heights[var6][var12 + 1][var18];
                                    int var32 = Tiles.Tiles_heights[var6][var12 + 1][var18 + 1];
                                    int var33 = Tiles.Tiles_heights[var6][var12][var18 + 1];
                                    int var34 = Huffman.field398[var12][var18];
                                    int var35 = Huffman.field398[var12 + 1][var18];
                                    int var36 = Huffman.field398[var12 + 1][var18 + 1];
                                    int var37 = Huffman.field398[var12][var18 + 1];
                                    int var38 = -1;
                                    int var39 = -1;
                                    int var40;
                                    int var41;
                                    int var42;
                                    if (var28 > 0) {
                                       var40 = var13 * 256 / var16;
                                       var41 = var14 / var17;
                                       var42 = var15 / var17;
                                       var38 = WorldMapAreaData.method712(var40, var41, var42);
                                       var40 = var40 + Tiles.field917 & 255;
                                       var42 += Tiles.field918;
                                       if (var42 < 0) {
                                          var42 = 0;
                                       } else if (var42 > 255) {
                                          var42 = 255;
                                       }

                                       var39 = WorldMapAreaData.method712(var40, var41, var42);
                                    }

                                    OverlayDefinition var43;
                                    if (var6 > 0) {
                                       boolean var44 = true;
                                       if (var28 == 0 && class32.field1157[var6][var12][var18] != 0) {
                                          var44 = false;
                                       }

                                       if (var65 > 0) {
                                          var42 = var65 - 1;
                                          var43 = (OverlayDefinition)OverlayDefinition.field664.get((long)var42);
                                          OverlayDefinition var45;
                                          if (var43 != null) {
                                             var45 = var43;
                                          } else {
                                             byte[] var46 = OverlayDefinition.field663.takeRecord(4, var42);
                                             var43 = new OverlayDefinition();
                                             if (var46 != null) {
                                                var43.read(new Buffer(var46), var42);
                                             }

                                             var43.init();
                                             OverlayDefinition.field664.put(var43, (long)var42);
                                             var45 = var43;
                                          }

                                          if (!var45.field665) {
                                             var44 = false;
                                          }
                                       }

                                       if (var44 && var30 == var31 && var30 == var32 && var33 == var30) {
                                          var10000 = Tiles.field910[var6][var12];
                                          var10000[var18] |= 2340;
                                       }
                                    }

                                    var40 = 0;
                                    if (var39 != -1) {
                                       var40 = Rasterizer3D.Rasterizer3D_colorPalette[class15.method183(var39, 96)];
                                    }

                                    if (var65 == 0) {
                                       var60.addTile(var6, var12, var18, 0, 0, -1, var30, var31, var32, var33, class15.method183(var38, var34), class15.method183(var38, var35), class15.method183(var38, var36), class15.method183(var38, var37), 0, 0, 0, 0, var40, 0);
                                    } else {
                                       var41 = class32.field1157[var6][var12][var18] + 1;
                                       byte var66 = class307.field1155[var6][var12][var18];
                                       int var67 = var65 - 1;
                                       OverlayDefinition var68 = (OverlayDefinition)OverlayDefinition.field664.get((long)var67);
                                       if (var68 != null) {
                                          var43 = var68;
                                       } else {
                                          byte[] var47 = OverlayDefinition.field663.takeRecord(4, var67);
                                          var68 = new OverlayDefinition();
                                          if (var47 != null) {
                                             var68.read(new Buffer(var47), var67);
                                          }

                                          var68.init();
                                          OverlayDefinition.field664.put(var68, (long)var67);
                                          var43 = var68;
                                       }

                                       int var69 = var43.texture;
                                       int var48;
                                       int var49;
                                       int var50;
                                       int var51;
                                       if (var69 >= 0) {
                                          var49 = Rasterizer3D.Rasterizer3D_textureLoader.vmethod324(var69);
                                          var48 = -1;
                                       } else if (var43.rgb == 16711935) {
                                          var48 = -2;
                                          var69 = -1;
                                          var49 = -2;
                                       } else {
                                          var48 = WorldMapAreaData.method712(var43.hue, var43.saturation, var43.lightness);
                                          var50 = var43.hue + Tiles.field917 & 255;
                                          var51 = var43.lightness + Tiles.field918;
                                          if (var51 < 0) {
                                             var51 = 0;
                                          } else if (var51 > 255) {
                                             var51 = 255;
                                          }

                                          var49 = WorldMapAreaData.method712(var50, var43.saturation, var51);
                                       }

                                       var50 = 0;
                                       if (var49 != -2) {
                                          var50 = Rasterizer3D.Rasterizer3D_colorPalette[class25.method348(var49, 96)];
                                       }

                                       if (var43.rgb2 != -1) {
                                          var51 = var43.hue2 + Tiles.field917 & 255;
                                          int var52 = var43.lightness2 + Tiles.field918;
                                          if (var52 < 0) {
                                             var52 = 0;
                                          } else if (var52 > 255) {
                                             var52 = 255;
                                          }

                                          var49 = WorldMapAreaData.method712(var51, var43.saturation2, var52);
                                          var50 = Rasterizer3D.Rasterizer3D_colorPalette[class25.method348(var49, 96)];
                                       }

                                       var60.addTile(var6, var12, var18, var41, var66, var69, var30, var31, var32, var33, class15.method183(var38, var34), class15.method183(var38, var35), class15.method183(var38, var36), class15.method183(var38, var37), class25.method348(var48, var34), class25.method348(var48, var35), class25.method348(var48, var36), class25.method348(var48, var37), var40, var50);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     for (var12 = 1; var12 < 103; ++var12) {
                        for (var13 = 1; var13 < 103; ++var13) {
                           if ((Tiles.Tiles_renderFlags[var6][var13][var12] & 8) != 0) {
                              var18 = 0;
                           } else if (var6 > 0 && (Tiles.Tiles_renderFlags[1][var13][var12] & 2) != 0) {
                              var18 = var6 - 1;
                           } else {
                              var18 = var6;
                           }

                           var60.setTileMinPlane(var6, var13, var12, var18);
                        }
                     }

                     Tiles.field908[var6] = (byte[][])null;
                     Fonts.field350[var6] = (byte[][])null;
                     class32.field1157[var6] = (byte[][])null;
                     class307.field1155[var6] = (byte[][])null;
                     Tiles.field909[var6] = (byte[][])null;
                  }

                  var60.method293(-50, -10, -50);

                  for (var6 = 0; var6 < 104; ++var6) {
                     for (var21 = 0; var21 < 104; ++var21) {
                        if ((Tiles.Tiles_renderFlags[1][var6][var21] & 2) == 2) {
                           var60.setLinkBelow(var6, var21);
                        }
                     }
                  }

                  var6 = 1;
                  var21 = 2;
                  var56 = 4;

                  for (var57 = 0; var57 < 4; ++var57) {
                     if (var57 > 0) {
                        var6 <<= 3;
                        var21 <<= 3;
                        var56 <<= 3;
                     }

                     for (var58 = 0; var58 <= var57; ++var58) {
                        for (var8 = 0; var8 <= 104; ++var8) {
                           for (var9 = 0; var9 <= 104; ++var9) {
                              short var63;
                              if ((Tiles.field910[var58][var9][var8] & var6) != 0) {
                                 var10 = var8;
                                 var11 = var8;
                                 var12 = var58;

                                 for (var13 = var58; var10 > 0 && (Tiles.field910[var58][var9][var10 - 1] & var6) != 0; --var10) {
                                 }

                                 while (var11 < 104 && (Tiles.field910[var58][var9][var11 + 1] & var6) != 0) {
                                    ++var11;
                                 }

                                 label649:
                                 while (var12 > 0) {
                                    for (var14 = var10; var14 <= var11; ++var14) {
                                       if ((Tiles.field910[var12 - 1][var9][var14] & var6) == 0) {
                                          break label649;
                                       }
                                    }

                                    --var12;
                                 }

                                 label638:
                                 while (var13 < var57) {
                                    for (var14 = var10; var14 <= var11; ++var14) {
                                       if ((Tiles.field910[var13 + 1][var9][var14] & var6) == 0) {
                                          break label638;
                                       }
                                    }

                                    ++var13;
                                 }

                                 var14 = (var11 - var10 + 1) * (var13 + 1 - var12);
                                 if (var14 >= 8) {
                                    var63 = 240;
                                    var16 = Tiles.Tiles_heights[var13][var9][var10] - var63;
                                    var17 = Tiles.Tiles_heights[var12][var9][var10];
                                    Scene.Scene_addOccluder(var57, 1, var9 * 128, var9 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

                                    for (var18 = var12; var18 <= var13; ++var18) {
                                       for (var19 = var10; var19 <= var11; ++var19) {
                                          var10000 = Tiles.field910[var18][var9];
                                          var10000[var19] &= ~var6;
                                       }
                                    }
                                 }
                              }

                              if ((Tiles.field910[var58][var9][var8] & var21) != 0) {
                                 var10 = var9;
                                 var11 = var9;
                                 var12 = var58;

                                 for (var13 = var58; var10 > 0 && (Tiles.field910[var58][var10 - 1][var8] & var21) != 0; --var10) {
                                 }

                                 while (var11 < 104 && (Tiles.field910[var58][var11 + 1][var8] & var21) != 0) {
                                    ++var11;
                                 }

                                 label702:
                                 while (var12 > 0) {
                                    for (var14 = var10; var14 <= var11; ++var14) {
                                       if ((Tiles.field910[var12 - 1][var14][var8] & var21) == 0) {
                                          break label702;
                                       }
                                    }

                                    --var12;
                                 }

                                 label691:
                                 while (var13 < var57) {
                                    for (var14 = var10; var14 <= var11; ++var14) {
                                       if ((Tiles.field910[var13 + 1][var14][var8] & var21) == 0) {
                                          break label691;
                                       }
                                    }

                                    ++var13;
                                 }

                                 var14 = (var11 - var10 + 1) * (var13 + 1 - var12);
                                 if (var14 >= 8) {
                                    var63 = 240;
                                    var16 = Tiles.Tiles_heights[var13][var10][var8] - var63;
                                    var17 = Tiles.Tiles_heights[var12][var10][var8];
                                    Scene.Scene_addOccluder(var57, 2, var10 * 128, var11 * 128 + 128, var8 * 128, var8 * 128, var16, var17);

                                    for (var18 = var12; var18 <= var13; ++var18) {
                                       for (var19 = var10; var19 <= var11; ++var19) {
                                          var10000 = Tiles.field910[var18][var19];
                                          var10000[var8] &= ~var21;
                                       }
                                    }
                                 }
                              }

                              if ((Tiles.field910[var58][var9][var8] & var56) != 0) {
                                 var10 = var9;
                                 var11 = var9;
                                 var12 = var8;

                                 for (var13 = var8; var12 > 0 && (Tiles.field910[var58][var9][var12 - 1] & var56) != 0; --var12) {
                                 }

                                 while (var13 < 104 && (Tiles.field910[var58][var9][var13 + 1] & var56) != 0) {
                                    ++var13;
                                 }

                                 label755:
                                 while (var10 > 0) {
                                    for (var14 = var12; var14 <= var13; ++var14) {
                                       if ((Tiles.field910[var58][var10 - 1][var14] & var56) == 0) {
                                          break label755;
                                       }
                                    }

                                    --var10;
                                 }

                                 label744:
                                 while (var11 < 104) {
                                    for (var14 = var12; var14 <= var13; ++var14) {
                                       if ((Tiles.field910[var58][var11 + 1][var14] & var56) == 0) {
                                          break label744;
                                       }
                                    }

                                    ++var11;
                                 }

                                 if ((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
                                    var14 = Tiles.Tiles_heights[var58][var10][var12];
                                    Scene.Scene_addOccluder(var57, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);

                                    for (var15 = var10; var15 <= var11; ++var15) {
                                       for (var16 = var12; var16 <= var13; ++var16) {
                                          var10000 = Tiles.field910[var58][var15];
                                          var10000[var16] &= ~var56;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  UserComparator10.method3352(true);
                  var6 = Tiles.Tiles_minPlane;
                  if (var6 > SoundSystem.plane) {
                     var6 = SoundSystem.plane;
                  }

                  if (var6 < SoundSystem.plane - 1) {
                     var6 = SoundSystem.plane - 1;
                  }

                  if (isLowDetail) {
                     class65.scene.init(Tiles.Tiles_minPlane);
                  } else {
                     class65.scene.init(0);
                  }

                  for (var21 = 0; var21 < 104; ++var21) {
                     for (var56 = 0; var56 < 104; ++var56) {
                        TilePaint.updateItemPile(var21, var56);
                     }
                  }

                  class13.playPcmPlayers();
                  ScriptEvent.method1179();
                  ObjectDefinition.field641.clear();
                  PacketBufferNode var64;
                  if (TextureProvider.client.hasFrame()) {
                     var64 = Interpreter.method1915(ClientPacket.field231, packetWriter.isaacCipher);
                     var64.packetBuffer.writeInt(1057001181);
                     packetWriter.method241(var64);
                  }

                  if (!isInInstance) {
                     var21 = (GameObject.field359 - 6) / 8;
                     var56 = (GameObject.field359 + 6) / 8;
                     var57 = (WorldMapLabelSize.field1041 - 6) / 8;
                     var58 = (WorldMapLabelSize.field1041 + 6) / 8;

                     for (var8 = var21 - 1; var8 <= var56 + 1; ++var8) {
                        for (var9 = var57 - 1; var9 <= var58 + 1; ++var9) {
                           if (var8 < var21 || var8 > var56 || var9 < var57 || var9 > var58) {
                              SecureRandomFuture.indexCache5.method10("m" + var8 + "_" + var9);
                              SecureRandomFuture.indexCache5.method10("l" + var8 + "_" + var9);
                           }
                        }
                     }
                  }

                  GameShell.updateGameState(30);
                  class13.playPcmPlayers();
                  BufferedSink.method3603();
                  var64 = Interpreter.method1915(ClientPacket.field298, packetWriter.isaacCipher);
                  packetWriter.method241(var64);
                  class11.method145();
               }
            }
         }
      } else {
         class54.method1092(this);
      }

      if (gameState == 30) {
         this.doCycleLoggedIn();
      } else if (gameState == 40 || gameState == 45) {
         this.doCycleLoggedOut();
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "106302203"
   )
   @Export("methodDraw")
   protected final void methodDraw(boolean var1) {
      boolean var2;
      label139: {
         try {
            if (class214.field1129 == 2) {
               if (class13.musicTrack == null) {
                  class13.musicTrack = MusicTrack.readTrack(class214.field1130, class30.musicTrackArchiveId, GrandExchangeOffer.musicTrackFileId);
                  if (class13.musicTrack == null) {
                     var2 = false;
                     break label139;
                  }
               }

               if (class307.soundCache == null) {
                  class307.soundCache = new SoundCache(class214.field1128, class214.field1127);
               }

               if (class214.midiPcmStream.loadMusicTrack(class13.musicTrack, class1.field1105, class307.soundCache, 22050)) {
                  class214.midiPcmStream.clearAll();
                  class214.midiPcmStream.method169(WorldMapLabel.field1039);
                  class214.midiPcmStream.setMusicTrack(class13.musicTrack, RectangleMode.musicTrackBoolean);
                  class214.field1129 = 0;
                  class13.musicTrack = null;
                  class307.soundCache = null;
                  class214.field1130 = null;
                  var2 = true;
                  break label139;
               }
            }
         } catch (Exception var4) {
            var4.printStackTrace();
            class214.midiPcmStream.clear();
            class214.field1129 = 0;
            class13.musicTrack = null;
            class307.soundCache = null;
            class214.field1130 = null;
         }

         var2 = false;
      }

      if (var2 && field107 && WorldMapCacheName.pcmPlayer0 != null) {
         WorldMapCacheName.pcmPlayer0.tryDiscard();
      }

      if ((gameState == 10 || gameState == 20 || gameState == 30) && field99 != 0L && class203.currentTimeMs() > field99) {
         GroundItem.method2095(SpotAnimationDefinition.method4822());
      }

      int var3;
      if (var1) {
         for (var3 = 0; var3 < 100; ++var3) {
            field100[var3] = true;
         }
      }

      if (gameState == 0) {
         this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
      } else if (gameState == 5) {
         IndexCacheLoader.drawTitle(class2.fontBold12, ScriptEvent.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            IndexCacheLoader.drawTitle(class2.fontBold12, ScriptEvent.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
         } else if (gameState == 25) {
            if (field181 == 1) {
               if (field177 > field178) {
                  field178 = field177;
               }

               var3 = (field178 * 50 - field177 * 50) / field178;
               class68.drawLoadingMessage("Loading - please wait.<br> (" + var3 + "%)", false);
            } else if (field181 == 2) {
               if (field179 > field180) {
                  field180 = field179;
               }

               var3 = (field180 * 50 - field179 * 50) / field180 + 50;
               class68.drawLoadingMessage("Loading - please wait.<br> (" + var3 + "%)", false);
            } else {
               class68.drawLoadingMessage("Loading - please wait.", false);
            }
         } else if (gameState == 30) {
            this.drawLoggedIn();
         } else if (gameState == 40) {
            class68.drawLoadingMessage("Connection lost<br>Please wait - attempting to reestablish", false);
         } else if (gameState == 45) {
            class68.drawLoadingMessage("Please wait...", false);
         }
      } else {
         IndexCacheLoader.drawTitle(class2.fontBold12, ScriptEvent.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
      }

      if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
         for (var3 = 0; var3 < rootWidgetCount; ++var3) {
            if (field102[var3]) {
               class197.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
               field102[var3] = false;
            }
         }
      } else if (gameState > 0) {
         class197.rasterProvider.drawFull(0, 0);

         for (var3 = 0; var3 < rootWidgetCount; ++var3) {
            field102[var3] = false;
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1879956387"
   )
   @Export("kill0")
   protected final void kill0() {
      if (class196.varcs.hasUnwrittenChanges()) {
         class196.varcs.write();
      }

      if (Projectile.mouseRecorder != null) {
         Projectile.mouseRecorder.isRunning = false;
      }

      Projectile.mouseRecorder = null;
      packetWriter.close();
      if (KeyHandler.KeyHandler_instance != null) {
         KeyHandler var1 = KeyHandler.KeyHandler_instance;
         synchronized(KeyHandler.KeyHandler_instance) {
            KeyHandler.KeyHandler_instance = null;
         }
      }

      if (MouseHandler.MouseHandler_instance != null) {
         MouseHandler var8 = MouseHandler.MouseHandler_instance;
         synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_instance = null;
         }
      }

      class16.mouseWheel = null;
      if (WorldMapCacheName.pcmPlayer0 != null) {
         WorldMapCacheName.pcmPlayer0.shutdown();
      }

      if (AbstractIndexCache.pcmPlayer1 != null) {
         AbstractIndexCache.pcmPlayer1.shutdown();
      }

      if (NetCache.NetCache_socket != null) {
         NetCache.NetCache_socket.close();
      }

      RunException.method3431();
      if (TriBool.urlRequester != null) {
         TriBool.urlRequester.close();
         TriBool.urlRequester = null;
      }

      try {
         class168.dat2File.close();

         for (int var9 = 0; var9 < class168.idxCount; ++var9) {
            IndexStoreAction.idxFiles[var9].close();
         }

         class168.idx255File.close();
         class168.randomDat.close();
      } catch (Exception var7) {
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1860808291"
   )
   protected final void vmethod114() {
   }

   @ObfuscatedName("init")
   public final void vmethod117() {
      try {
         if (this.checkHost()) {
            ClientParameter[] var1 = class4.method47();
            int var3 = 0;

            while (true) {
               int var2;
               if (var3 >= var1.length) {
                  class237.method4539();
                  class50.worldHost = this.getCodeBase().getHost();
                  String var25 = class15.serverBuild.name;
                  byte var26 = 0;

                  try {
                     class168.idxCount = 21;
                     PacketBuffer.field667 = var26;

                     try {
                        class266.osName = System.getProperty("os.name");
                     } catch (Exception var20) {
                        class266.osName = "Unknown";
                     }

                     WorldMapSection3.osNameLowerCase = class266.osName.toLowerCase();

                     try {
                        WorldMapSection1.userHomeDirectory = System.getProperty("user.home");
                        if (WorldMapSection1.userHomeDirectory != null) {
                           WorldMapSection1.userHomeDirectory = WorldMapSection1.userHomeDirectory + "/";
                        }
                     } catch (Exception var19) {
                     }

                     try {
                        if (WorldMapSection3.osNameLowerCase.startsWith("win")) {
                           if (WorldMapSection1.userHomeDirectory == null) {
                              WorldMapSection1.userHomeDirectory = System.getenv("USERPROFILE");
                           }
                        } else if (WorldMapSection1.userHomeDirectory == null) {
                           WorldMapSection1.userHomeDirectory = System.getenv("HOME");
                        }

                        if (WorldMapSection1.userHomeDirectory != null) {
                           WorldMapSection1.userHomeDirectory = WorldMapSection1.userHomeDirectory + "/";
                        }
                     } catch (Exception var18) {
                     }

                     if (WorldMapSection1.userHomeDirectory == null) {
                        WorldMapSection1.userHomeDirectory = "~/";
                     }

                     WorldMapSection2.cacheDirectoryLocations = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", WorldMapSection1.userHomeDirectory, "/tmp/", ""};
                     Canvas.field94 = new String[]{".jagex_cache_" + PacketBuffer.field667, ".file_store_" + PacketBuffer.field667};
                     int var27 = 0;

                     label262:
                     while (var27 < 4) {
                        String var28 = var27 == 0 ? "" : "" + var27;
                        class337.clDat = new File(WorldMapSection1.userHomeDirectory, "jagex_cl_oldschool_" + var25 + var28 + ".dat");
                        String var30 = null;
                        String var31 = null;
                        boolean var32 = false;
                        int var14;
                        File var33;
                        if (class337.clDat.exists()) {
                           try {
                              AccessFile var11 = new AccessFile(class337.clDat, "rw", 10000L);

                              int var12;
                              Buffer var13;
                              for (var13 = new Buffer((int)var11.length()); var13.index < var13.array.length; var13.index += var12) {
                                 var12 = var11.read(var13.array, var13.index, var13.array.length - var13.index);
                                 if (var12 == -1) {
                                    throw new IOException();
                                 }
                              }

                              var13.index = 0;
                              var12 = var13.readUnsignedByte();
                              if (var12 < 1 || var12 > 3) {
                                 throw new IOException("" + var12);
                              }

                              var14 = 0;
                              if (var12 > 1) {
                                 var14 = var13.readUnsignedByte();
                              }

                              if (var12 <= 2) {
                                 var30 = var13.readStringCp1252NullCircumfixed();
                                 if (var14 == 1) {
                                    var31 = var13.readStringCp1252NullCircumfixed();
                                 }
                              } else {
                                 var30 = var13.method45();
                                 if (var14 == 1) {
                                    var31 = var13.method45();
                                 }
                              }

                              var11.close();
                           } catch (IOException var22) {
                              var22.printStackTrace();
                           }

                           if (var30 != null) {
                              var33 = new File(var30);
                              if (!var33.exists()) {
                                 var30 = null;
                              }
                           }

                           if (var30 != null) {
                              var33 = new File(var30, "test.dat");
                              if (!DevicePcmPlayerProvider.method847(var33, true)) {
                                 var30 = null;
                              }
                           }
                        }

                        if (var30 == null && var27 == 0) {
                           label237:
                           for (var2 = 0; var2 < Canvas.field94.length; ++var2) {
                              for (int var34 = 0; var34 < WorldMapSection2.cacheDirectoryLocations.length; ++var34) {
                                 File var37 = new File(WorldMapSection2.cacheDirectoryLocations[var34] + Canvas.field94[var2] + File.separatorChar + "oldschool" + File.separatorChar);
                                 if (var37.exists() && DevicePcmPlayerProvider.method847(new File(var37, "test.dat"), true)) {
                                    var30 = var37.toString();
                                    var32 = true;
                                    break label237;
                                 }
                              }
                           }
                        }

                        if (var30 == null) {
                           var30 = WorldMapSection1.userHomeDirectory + File.separatorChar + "jagexcache" + var28 + File.separatorChar + "oldschool" + File.separatorChar + var25 + File.separatorChar;
                           var32 = true;
                        }

                        File var15;
                        File var36;
                        File[] var38;
                        File[] var39;
                        if (var31 != null) {
                           var36 = new File(var31);
                           var33 = new File(var30);

                           try {
                              var38 = var36.listFiles();
                              var39 = var38;

                              for (var14 = 0; var14 < var39.length; ++var14) {
                                 var15 = var39[var14];
                                 File var16 = new File(var33, var15.getName());
                                 boolean var17 = var15.renameTo(var16);
                                 if (!var17) {
                                    throw new IOException();
                                 }
                              }
                           } catch (Exception var21) {
                              var21.printStackTrace();
                           }

                           var32 = true;
                        }

                        if (var32) {
                           class14.method167(new File(var30), (File)null);
                        }

                        var36 = new File(var30);
                        class168.field1115 = var36;
                        if (!class168.field1115.exists()) {
                           class168.field1115.mkdirs();
                        }

                        var38 = class168.field1115.listFiles();
                        if (var38 != null) {
                           var39 = var38;

                           for (var14 = 0; var14 < var39.length; ++var14) {
                              var15 = var39[var14];
                              if (!DevicePcmPlayerProvider.method847(var15, false)) {
                                 ++var27;
                                 continue label262;
                              }
                           }
                        }
                        break;
                     }

                     File var29 = class168.field1115;
                     class171.field1118 = var29;
                     if (!class171.field1118.exists()) {
                        throw new RuntimeException("");
                     }

                     class171.field1117 = true;
                     Interpreter.method1976();
                     class168.dat2File = new BufferedFile(new AccessFile(WorldMapIcon2.method315("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
                     class168.idx255File = new BufferedFile(new AccessFile(WorldMapIcon2.method315("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
                     IndexStoreAction.idxFiles = new BufferedFile[class168.idxCount];

                     for (int var35 = 0; var35 < class168.idxCount; ++var35) {
                        IndexStoreAction.idxFiles[var35] = new BufferedFile(new AccessFile(WorldMapIcon2.method315("main_file_cache.idx" + var35), "rw", 1048576L), 6000, 0);
                     }
                  } catch (Exception var23) {
                     NPCDefinition.sendStackTrace((String)null, var23);
                  }

                  TextureProvider.client = this;
                  RunException.field761 = clientType;
                  this.startThread(765, 503, 180);
                  break;
               }

               ClientParameter var4 = var1[var3];
               String var5 = this.getParameter(var4.id);
               if (var5 != null) {
                  switch(Integer.parseInt(var4.id)) {
                  case 1:
                     useBufferedSocket = Integer.parseInt(var5) != 0;
                  case 2:
                  case 11:
                  case 13:
                  case 16:
                  default:
                     break;
                  case 3:
                     if (var5.equalsIgnoreCase("true")) {
                        isMembersWorld = true;
                     } else {
                        isMembersWorld = false;
                     }
                     break;
                  case 4:
                     if (clientType == -1) {
                        clientType = Integer.parseInt(var5);
                     }
                     break;
                  case 5:
                     worldProperties = Integer.parseInt(var5);
                     break;
                  case 6:
                     language = Integer.parseInt(var5);
                     break;
                  case 7:
                     int var6 = Integer.parseInt(var5);
                     ServerBuild[] var7 = new ServerBuild[]{ServerBuild.field786, ServerBuild.field787, ServerBuild.field784, ServerBuild.field785};
                     ServerBuild[] var8 = var7;
                     var2 = 0;

                     ServerBuild var9;
                     while (true) {
                        if (var2 >= var8.length) {
                           var9 = null;
                           break;
                        }

                        ServerBuild var10 = var8[var2];
                        if (var6 == var10.id) {
                           var9 = var10;
                           break;
                        }

                        ++var2;
                     }

                     class15.serverBuild = var9;
                     break;
                  case 8:
                     if (var5.equalsIgnoreCase("true")) {
                     }
                     break;
                  case 9:
                     class21.field1123 = var5;
                     break;
                  case 10:
                     class22.studioGame = (StudioGame)ScriptFrame.findEnumerated(ClientPacket.method3664(), Integer.parseInt(var5));
                     if (class22.studioGame == StudioGame.field892) {
                        KeyHandler.loginType = LoginType.field479;
                     } else {
                        KeyHandler.loginType = LoginType.field487;
                     }
                     break;
                  case 12:
                     worldId = Integer.parseInt(var5);
                     break;
                  case 14:
                     AbstractIndexCache.field2 = Integer.parseInt(var5);
                     break;
                  case 15:
                     gameBuild = Integer.parseInt(var5);
                     break;
                  case 17:
                     ServerBuild.worldsUrl = var5;
                  }
               }

               ++var3;
            }
         }

      } catch (RuntimeException var24) {
         throw Players.method2120(var24, "client.init()");
      }
   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-78"
   )
   @Export("doCycleJs5")
   void doCycleJs5() {
      if (gameState != 1000) {
         long var1 = class203.currentTimeMs();
         int var3 = (int)(var1 - NetCache.field629);
         NetCache.field629 = var1;
         if (var3 > 200) {
            var3 = 200;
         }

         NetCache.field628 += var3;
         boolean var4;
         if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
            var4 = true;
         } else if (NetCache.NetCache_socket == null) {
            var4 = false;
         } else {
            try {
               label205: {
                  if (NetCache.field628 > 30000) {
                     throw new IOException();
                  }

                  NetFileRequest var5;
                  Buffer var6;
                  while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
                     var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                     var6 = new Buffer(4);
                     var6.writeByte(1);
                     var6.writeMedium((int)var5.key);
                     NetCache.NetCache_socket.write(var6.array, 0, 4);
                     NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
                     --NetCache.NetCache_pendingPriorityWritesCount;
                     ++NetCache.NetCache_pendingPriorityResponsesCount;
                  }

                  while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
                     var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.last();
                     var6 = new Buffer(4);
                     var6.writeByte(0);
                     var6.writeMedium((int)var5.key);
                     NetCache.NetCache_socket.write(var6.array, 0, 4);
                     var5.removeDual();
                     NetCache.NetCache_pendingResponses.put(var5, var5.key);
                     --NetCache.NetCache_pendingWritesCount;
                     ++NetCache.NetCache_pendingResponsesCount;
                  }

                  for (int var7 = 0; var7 < 100; ++var7) {
                     int var8 = NetCache.NetCache_socket.available();
                     if (var8 < 0) {
                        throw new IOException();
                     }

                     if (var8 == 0) {
                        break;
                     }

                     NetCache.field628 = 0;
                     byte var9 = 0;
                     if (ModelData0.NetCache_currentResponse == null) {
                        var9 = 8;
                     } else if (NetCache.field630 == 0) {
                        var9 = 1;
                     }

                     int var10;
                     int var11;
                     int var12;
                     int var13;
                     byte[] var10000;
                     int var10001;
                     Buffer var24;
                     if (var9 > 0) {
                        var10 = var9 - NetCache.NetCache_responseHeaderBuffer.index;
                        if (var10 > var8) {
                           var10 = var8;
                        }

                        NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.index, var10);
                        if (NetCache.field631 != 0) {
                           for (var11 = 0; var11 < var10; ++var11) {
                              var10000 = NetCache.NetCache_responseHeaderBuffer.array;
                              var10001 = NetCache.NetCache_responseHeaderBuffer.index + var11;
                              var10000[var10001] ^= NetCache.field631;
                           }
                        }

                        var24 = NetCache.NetCache_responseHeaderBuffer;
                        var24.index += var10;
                        if (NetCache.NetCache_responseHeaderBuffer.index < var9) {
                           break;
                        }

                        if (ModelData0.NetCache_currentResponse == null) {
                           NetCache.NetCache_responseHeaderBuffer.index = 0;
                           var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var12 = NetCache.NetCache_responseHeaderBuffer.method43();
                           int var14 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var13 = NetCache.NetCache_responseHeaderBuffer.readInt();
                           long var15 = (long)(var12 + (var11 << 16));
                           NetFileRequest var17 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var15);
                           WorldComparator.field988 = true;
                           if (var17 == null) {
                              var17 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var15);
                              WorldComparator.field988 = false;
                           }

                           if (var17 == null) {
                              throw new IOException();
                           }

                           int var18 = var14 == 0 ? 5 : 9;
                           ModelData0.NetCache_currentResponse = var17;
                           class22.NetCache_responseArchiveBuffer = new Buffer(var13 + var18 + ModelData0.NetCache_currentResponse.padding);
                           class22.NetCache_responseArchiveBuffer.writeByte(var14);
                           class22.NetCache_responseArchiveBuffer.writeInt(var13);
                           NetCache.field630 = 8;
                           NetCache.NetCache_responseHeaderBuffer.index = 0;
                        } else if (NetCache.field630 == 0) {
                           if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
                              NetCache.field630 = 1;
                              NetCache.NetCache_responseHeaderBuffer.index = 0;
                           } else {
                              ModelData0.NetCache_currentResponse = null;
                           }
                        }
                     } else {
                        var10 = class22.NetCache_responseArchiveBuffer.array.length - ModelData0.NetCache_currentResponse.padding;
                        var11 = 512 - NetCache.field630;
                        if (var11 > var10 - class22.NetCache_responseArchiveBuffer.index) {
                           var11 = var10 - class22.NetCache_responseArchiveBuffer.index;
                        }

                        if (var11 > var8) {
                           var11 = var8;
                        }

                        NetCache.NetCache_socket.read(class22.NetCache_responseArchiveBuffer.array, class22.NetCache_responseArchiveBuffer.index, var11);
                        if (NetCache.field631 != 0) {
                           for (var12 = 0; var12 < var11; ++var12) {
                              var10000 = class22.NetCache_responseArchiveBuffer.array;
                              var10001 = class22.NetCache_responseArchiveBuffer.index + var12;
                              var10000[var10001] ^= NetCache.field631;
                           }
                        }

                        var24 = class22.NetCache_responseArchiveBuffer;
                        var24.index += var11;
                        NetCache.field630 += var11;
                        if (var10 == class22.NetCache_responseArchiveBuffer.index) {
                           if (16711935L == ModelData0.NetCache_currentResponse.key) {
                              Players.NetCache_reference = class22.NetCache_responseArchiveBuffer;

                              for (var12 = 0; var12 < 256; ++var12) {
                                 IndexCache var22 = NetCache.NetCache_indexCaches[var12];
                                 if (var22 != null) {
                                    Players.NetCache_reference.index = var12 * 8 + 5;
                                    var13 = Players.NetCache_reference.readInt();
                                    int var23 = Players.NetCache_reference.readInt();
                                    var22.loadIndexReference(var13, var23);
                                 }
                              }
                           } else {
                              NetCache.NetCache_crc.reset();
                              NetCache.NetCache_crc.update(class22.NetCache_responseArchiveBuffer.array, 0, var10);
                              var12 = (int)NetCache.NetCache_crc.getValue();
                              if (var12 != ModelData0.NetCache_currentResponse.crc) {
                                 try {
                                    NetCache.NetCache_socket.close();
                                 } catch (Exception var20) {
                                 }

                                 ++NetCache.NetCache_crcMismatches;
                                 NetCache.NetCache_socket = null;
                                 NetCache.field631 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var4 = false;
                                 break label205;
                              }

                              NetCache.NetCache_crcMismatches = 0;
                              NetCache.NetCache_ioExceptions = 0;
                              ModelData0.NetCache_currentResponse.indexCache.write((int)(ModelData0.NetCache_currentResponse.key & 65535L), class22.NetCache_responseArchiveBuffer.array, 16711680L == (ModelData0.NetCache_currentResponse.key & 16711680L), WorldComparator.field988);
                           }

                           ModelData0.NetCache_currentResponse.remove();
                           if (WorldComparator.field988) {
                              --NetCache.NetCache_pendingPriorityResponsesCount;
                           } else {
                              --NetCache.NetCache_pendingResponsesCount;
                           }

                           NetCache.field630 = 0;
                           ModelData0.NetCache_currentResponse = null;
                           class22.NetCache_responseArchiveBuffer = null;
                        } else {
                           if (NetCache.field630 != 512) {
                              break;
                           }

                           NetCache.field630 = 0;
                        }
                     }
                  }

                  var4 = true;
               }
            } catch (IOException var21) {
               try {
                  NetCache.NetCache_socket.close();
               } catch (Exception var19) {
               }

               ++NetCache.NetCache_ioExceptions;
               NetCache.NetCache_socket = null;
               var4 = false;
            }
         }

         if (!var4) {
            this.doCycleJs5Connect();
         }
      }

   }

   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "111"
   )
   @Export("doCycleJs5Connect")
   void doCycleJs5Connect() {
      if (NetCache.NetCache_crcMismatches >= 4) {
         this.error("js5crc");
         gameState = 1000;
      } else {
         if (NetCache.NetCache_ioExceptions >= 4) {
            if (gameState <= 5) {
               this.error("js5io");
               gameState = 1000;
               return;
            }

            field167 = 3000;
            NetCache.NetCache_ioExceptions = 3;
         }

         if (--field167 + 1 <= 0) {
            try {
               if (js5ConnectState == 0) {
                  class210.js5SocketTask = GameShell.taskHandler.newSocketTask(class50.worldHost, class203.port3);
                  ++js5ConnectState;
               }

               if (js5ConnectState == 1) {
                  if (class210.js5SocketTask.status == 2) {
                     this.js5Error(-1);
                     return;
                  }

                  if (class210.js5SocketTask.status == 1) {
                     ++js5ConnectState;
                  }
               }

               if (js5ConnectState == 2) {
                  if (useBufferedSocket) {
                     DynamicObject.js5Socket = BufferedFile.method2719((Socket)class210.js5SocketTask.result, 40000, 5000);
                  } else {
                     DynamicObject.js5Socket = new NetSocket((Socket)class210.js5SocketTask.result, GameShell.taskHandler, 5000);
                  }

                  Buffer var1 = new Buffer(5);
                  var1.writeByte(15);
                  var1.writeInt(180);
                  DynamicObject.js5Socket.write(var1.array, 0, 5);
                  ++js5ConnectState;
                  GameObject.js5StartTimeMs = class203.currentTimeMs();
               }

               if (js5ConnectState == 3) {
                  if (DynamicObject.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
                     int var10 = DynamicObject.js5Socket.readUnsignedByte();
                     if (var10 != 0) {
                        this.js5Error(var10);
                        return;
                     }

                     ++js5ConnectState;
                  } else if (class203.currentTimeMs() - GameObject.js5StartTimeMs > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (js5ConnectState == 4) {
                  AbstractSocket var11 = DynamicObject.js5Socket;
                  boolean var2 = gameState > 20;
                  if (NetCache.NetCache_socket != null) {
                     try {
                        NetCache.NetCache_socket.close();
                     } catch (Exception var8) {
                     }

                     NetCache.NetCache_socket = null;
                  }

                  NetCache.NetCache_socket = var11;
                  UserComparator9.method3343(var2);
                  NetCache.NetCache_responseHeaderBuffer.index = 0;
                  ModelData0.NetCache_currentResponse = null;
                  class22.NetCache_responseArchiveBuffer = null;
                  NetCache.field630 = 0;

                  while (true) {
                     NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
                     if (var3 == null) {
                        while (true) {
                           var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
                           if (var3 == null) {
                              if (NetCache.field631 != 0) {
                                 try {
                                    Buffer var4 = new Buffer(4);
                                    var4.writeByte(4);
                                    var4.writeByte(NetCache.field631);
                                    var4.writeShort(0);
                                    NetCache.NetCache_socket.write(var4.array, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       NetCache.NetCache_socket.close();
                                    } catch (Exception var6) {
                                    }

                                    ++NetCache.NetCache_ioExceptions;
                                    NetCache.NetCache_socket = null;
                                 }
                              }

                              NetCache.field628 = 0;
                              NetCache.field629 = class203.currentTimeMs();
                              class210.js5SocketTask = null;
                              DynamicObject.js5Socket = null;
                              js5ConnectState = 0;
                              js5Errors = 0;
                              return;
                           }

                           NetCache.NetCache_pendingWritesQueue.addLast(var3);
                           NetCache.NetCache_pendingWrites.put(var3, var3.key);
                           ++NetCache.NetCache_pendingWritesCount;
                           --NetCache.NetCache_pendingResponsesCount;
                        }
                     }

                     NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key);
                     ++NetCache.NetCache_pendingPriorityWritesCount;
                     --NetCache.NetCache_pendingPriorityResponsesCount;
                  }
               }
            } catch (IOException var9) {
               this.js5Error(-3);
            }
         }
      }

   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "2348"
   )
   @Export("js5Error")
   void js5Error(int var1) {
      class210.js5SocketTask = null;
      DynamicObject.js5Socket = null;
      js5ConnectState = 0;
      if (class2.port1 == class203.port3) {
         class203.port3 = WorldMapArea.port2;
      } else {
         class203.port3 = class2.port1;
      }

      ++js5Errors;
      if (js5Errors < 2 || var1 != 7 && var1 != 9) {
         if (js5Errors >= 2 && var1 == 6) {
            this.error("js5connect_outofdate");
            gameState = 1000;
         } else if (js5Errors >= 4) {
            if (gameState <= 5) {
               this.error("js5connect");
               gameState = 1000;
            } else {
               field167 = 3000;
            }
         }
      } else if (gameState <= 5) {
         this.error("js5connect_full");
         gameState = 1000;
      } else {
         field167 = 3000;
      }

   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-110"
   )
   @Export("doCycleLoggedOut")
   final void doCycleLoggedOut() {
      Object var1 = packetWriter.getSocket();
      PacketBuffer var2 = packetWriter.packetBuffer;

      try {
         if (loginState == 0) {
            if (WorldMapIcon1.secureRandom == null && (secureRandomFuture.isDone() || field168 > 250)) {
               WorldMapIcon1.secureRandom = secureRandomFuture.get();
               secureRandomFuture.shutdown();
               secureRandomFuture = null;
            }

            if (WorldMapIcon1.secureRandom != null) {
               if (var1 != null) {
                  ((AbstractSocket)var1).close();
                  var1 = null;
               }

               UserComparator3.socketTask = null;
               field176 = false;
               field168 = 0;
               loginState = 1;
            }
         }

         if (loginState == 1) {
            if (UserComparator3.socketTask == null) {
               UserComparator3.socketTask = GameShell.taskHandler.newSocketTask(class50.worldHost, class203.port3);
            }

            if (UserComparator3.socketTask.status == 2) {
               throw new IOException();
            }

            if (UserComparator3.socketTask.status == 1) {
               if (useBufferedSocket) {
                  var1 = BufferedFile.method2719((Socket)UserComparator3.socketTask.result, 40000, 5000);
               } else {
                  var1 = new NetSocket((Socket)UserComparator3.socketTask.result, GameShell.taskHandler, 5000);
               }

               packetWriter.setSocket((AbstractSocket)var1);
               UserComparator3.socketTask = null;
               loginState = 2;
            }
         }

         if (loginState == 2) {
            packetWriter.method239();
            PacketBufferNode var3;
            if (PacketBufferNode.field668 == 0) {
               var3 = new PacketBufferNode();
            } else {
               var3 = PacketBufferNode.packetBufferNodes[--PacketBufferNode.field668];
            }

            var3.field669 = null;
            var3.field670 = 0;
            var3.packetBuffer = new PacketBuffer(5000);
            var3.packetBuffer.writeByte(LoginPacket.field473.id);
            packetWriter.method241(var3);
            packetWriter.method240();
            var2.index = 0;
            loginState = 3;
         }

         int var4;
         boolean var16;
         if (loginState == 3) {
            if (WorldMapCacheName.pcmPlayer0 != null) {
               WorldMapCacheName.pcmPlayer0.method242();
            }

            if (AbstractIndexCache.pcmPlayer1 != null) {
               AbstractIndexCache.pcmPlayer1.method242();
            }

            var16 = true;
            if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
               var16 = false;
            }

            if (var16) {
               var4 = ((AbstractSocket)var1).readUnsignedByte();
               if (WorldMapCacheName.pcmPlayer0 != null) {
                  WorldMapCacheName.pcmPlayer0.method242();
               }

               if (AbstractIndexCache.pcmPlayer1 != null) {
                  AbstractIndexCache.pcmPlayer1.method242();
               }

               if (var4 != 0) {
                  IsaacCipher.method4093(var4);
                  return;
               }

               var2.index = 0;
               loginState = 4;
            }
         }

         int var5;
         if (loginState == 4) {
            if (var2.index < 8) {
               var5 = ((AbstractSocket)var1).available();
               if (var5 > 8 - var2.index) {
                  var5 = 8 - var2.index;
               }

               if (var5 > 0) {
                  ((AbstractSocket)var1).read(var2.array, var2.index, var5);
                  var2.index += var5;
               }
            }

            if (var2.index == 8) {
               var2.index = 0;
               MusicPatchNode2.field592 = var2.readLong();
               loginState = 5;
            }
         }

         if (loginState == 5) {
            packetWriter.packetBuffer.index = 0;
            packetWriter.method239();
            PacketBuffer var6 = new PacketBuffer(500);
            int[] var7 = new int[]{WorldMapIcon1.secureRandom.nextInt(), WorldMapIcon1.secureRandom.nextInt(), WorldMapIcon1.secureRandom.nextInt(), WorldMapIcon1.secureRandom.nextInt()};
            var6.index = 0;
            var6.writeByte(1);
            var6.writeInt(var7[0]);
            var6.writeInt(var7[1]);
            var6.writeInt(var7[2]);
            var6.writeInt(var7[3]);
            var6.writeLong(MusicPatchNode2.field592);
            if (gameState == 40) {
               var6.writeInt(Skills.field875[0]);
               var6.writeInt(Skills.field875[1]);
               var6.writeInt(Skills.field875[2]);
               var6.writeInt(Skills.field875[3]);
            } else {
               var6.writeByte(field658.rsOrdinal());
               switch(field658.field1984) {
               case 0:
               case 3:
                  var6.writeMedium(class13.otpInt);
                  ++var6.index;
                  break;
               case 1:
                  var6.index += 4;
                  break;
               case 2:
                  var6.writeInt((Integer)ReflectionCheck.clientPreferences.parameters.get(class279.method5357(Login.Login_username)));
               }

               var6.writeByte(class313.field3834.rsOrdinal());
               var6.writeStringCp1252NullTerminated(Login.Login_password);
            }

            var6.encryptRsa(class83.field1165, class83.field1166);
            Skills.field875 = var7;
            PacketBufferNode var8;
            if (PacketBufferNode.field668 == 0) {
               var8 = new PacketBufferNode();
            } else {
               var8 = PacketBufferNode.packetBufferNodes[--PacketBufferNode.field668];
            }

            var8.field669 = null;
            var8.field670 = 0;
            var8.packetBuffer = new PacketBuffer(5000);
            var8.packetBuffer.index = 0;
            if (gameState == 40) {
               var8.packetBuffer.writeByte(LoginPacket.field476.id);
            } else {
               var8.packetBuffer.writeByte(LoginPacket.field475.id);
            }

            var8.packetBuffer.writeShort(0);
            int var9 = var8.packetBuffer.index;
            var8.packetBuffer.writeInt(180);
            var8.packetBuffer.writeInt(1);
            var8.packetBuffer.writeByte(clientType);
            var8.packetBuffer.method38(var6.array, 0, var6.index);
            int var10 = var8.packetBuffer.index;
            var8.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
            var8.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
            var8.packetBuffer.writeShort(SoundCache.canvasWidth);
            var8.packetBuffer.writeShort(Huffman.canvasHeight);
            Varps.method4400(var8.packetBuffer);
            var8.packetBuffer.writeStringCp1252NullTerminated(class21.field1123);
            var8.packetBuffer.writeInt(AbstractIndexCache.field2);
            Buffer var11 = new Buffer(WorldMapLabelSize.platformInfo.size());
            WorldMapLabelSize.platformInfo.write(var11);
            var8.packetBuffer.method38(var11.array, 0, var11.array.length);
            var8.packetBuffer.writeByte(clientType);
            var8.packetBuffer.writeInt(0);
            var8.packetBuffer.writeInt(AbstractIndexCache.indexCache0.hash);
            var8.packetBuffer.writeInt(Skeleton.indexCache1.hash);
            var8.packetBuffer.writeInt(ObjectSound.indexCache2.hash);
            var8.packetBuffer.writeInt(WorldMapIcon1.indexCache3.hash);
            var8.packetBuffer.writeInt(class25.indexCache4.hash);
            var8.packetBuffer.writeInt(SecureRandomFuture.indexCache5.hash);
            var8.packetBuffer.writeInt(UserComparator3.indexCache6.hash);
            var8.packetBuffer.writeInt(class40.indexCache7.hash);
            var8.packetBuffer.writeInt(WorldMapSection3.indexCache8.hash);
            var8.packetBuffer.writeInt(class238.indexCache9.hash);
            var8.packetBuffer.writeInt(class16.indexCache10.hash);
            var8.packetBuffer.writeInt(Login.indexCache11.hash);
            var8.packetBuffer.writeInt(Formatting.indexCache12.hash);
            var8.packetBuffer.writeInt(ByteArrayPool.indexCache13.hash);
            var8.packetBuffer.writeInt(class2.indexCache14.hash);
            var8.packetBuffer.writeInt(WorldMapSection1.indexCache15.hash);
            var8.packetBuffer.writeInt(0);
            var8.packetBuffer.writeInt(class22.indexCache16.hash);
            var8.packetBuffer.writeInt(WorldMapLabelSize.field1040.hash);
            var8.packetBuffer.writeInt(ItemContainer.field434.hash);
            var8.packetBuffer.writeInt(AbstractByteArrayCopier.field0.hash);
            var8.packetBuffer.xteaEncrypt(var7, var10, var8.packetBuffer.index);
            var8.packetBuffer.method40(var8.packetBuffer.index - var9);
            packetWriter.method241(var8);
            packetWriter.method240();
            packetWriter.isaacCipher = new IsaacCipher(var7);
            int[] var12 = new int[4];

            for (int var13 = 0; var13 < 4; ++var13) {
               var12[var13] = var7[var13] + 50;
            }

            var2.newIsaacCipher(var12);
            loginState = 6;
         }

         if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
            var5 = ((AbstractSocket)var1).readUnsignedByte();
            if (var5 == 21 && gameState == 20) {
               loginState = 9;
            } else if (var5 == 2) {
               loginState = 11;
            } else if (var5 == 15 && gameState == 40) {
               packetWriter.serverPacket0Length = -1;
               loginState = 16;
            } else if (var5 == 64) {
               loginState = 7;
            } else if (var5 == 23 && field169 < 1) {
               ++field169;
               loginState = 0;
            } else {
               if (var5 != 29) {
                  IsaacCipher.method4093(var5);
                  return;
               }

               loginState = 14;
            }
         }

         if (loginState == 7 && ((AbstractSocket)var1).available() > 0) {
            WorldMapSection1.field1071 = ((AbstractSocket)var1).readUnsignedByte();
            loginState = 8;
         }

         if (loginState == 8 && ((AbstractSocket)var1).available() >= WorldMapSection1.field1071) {
            ((AbstractSocket)var1).read(var2.array, 0, WorldMapSection1.field1071);
            var2.index = 0;
            loginState = 6;
         }

         if (loginState == 9 && ((AbstractSocket)var1).available() > 0) {
            field170 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
            loginState = 10;
         }

         if (loginState == 10) {
            field168 = 0;
            class54.method1089("You have only just left another world.", "Your profile will be transferred in:", field170 / 60 + " seconds.");
            if (--field170 <= 0) {
               loginState = 0;
            }
         } else {
            if (loginState == 11 && ((AbstractSocket)var1).available() >= 1) {
               field171 = ((AbstractSocket)var1).readUnsignedByte();
               loginState = 12;
            }

            if (loginState == 12 && ((AbstractSocket)var1).available() >= field171) {
               var16 = ((AbstractSocket)var1).readUnsignedByte() == 1;
               ((AbstractSocket)var1).read(var2.array, 0, 4);
               var2.index = 0;
               boolean var17 = false;
               if (var16) {
                  var4 = var2.readByteIsaac() << 24;
                  var4 |= var2.readByteIsaac() << 16;
                  var4 |= var2.readByteIsaac() << 8;
                  var4 |= var2.readByteIsaac();
                  int var20 = class279.method5357(Login.Login_username);
                  if (ReflectionCheck.clientPreferences.parameters.size() >= 10 && !ReflectionCheck.clientPreferences.parameters.containsKey(var20)) {
                     Iterator var23 = ReflectionCheck.clientPreferences.parameters.entrySet().iterator();
                     var23.next();
                     var23.remove();
                  }

                  ReflectionCheck.clientPreferences.parameters.put(var20, var4);
               }

               if (Login_isUsernameRemembered) {
                  ReflectionCheck.clientPreferences.rememberedUsername = Login.Login_username;
               } else {
                  ReflectionCheck.clientPreferences.rememberedUsername = null;
               }

               WorldMapSection0.savePreferences();
               rights = ((AbstractSocket)var1).readUnsignedByte();
               field155 = ((AbstractSocket)var1).readUnsignedByte() == 1;
               localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
               localPlayerIndex <<= 8;
               localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
               field209 = ((AbstractSocket)var1).readUnsignedByte();
               ((AbstractSocket)var1).read(var2.array, 0, 1);
               var2.index = 0;
               ServerPacket[] var21 = class27.method429();
               int var24 = var2.readSmartByteShortIsaac();
               if (var24 < 0 || var24 >= var21.length) {
                  throw new IOException(var24 + " " + var2.index);
               }

               packetWriter.serverPacket0 = var21[var24];
               packetWriter.serverPacket0Length = packetWriter.serverPacket0.length;
               ((AbstractSocket)var1).read(var2.array, 0, 2);
               var2.index = 0;
               packetWriter.serverPacket0Length = var2.method43();

               try {
                  Client var25 = TextureProvider.client;
                  JSObject.getWindow(var25).call("zap", (Object[])null);
               } catch (Throwable var14) {
               }

               loginState = 13;
            }

            if (loginState == 13) {
               if (((AbstractSocket)var1).available() >= packetWriter.serverPacket0Length) {
                  var2.index = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacket0Length);
                  timer.method332();
                  WorldMapSection1.method808();
                  class11.updatePlayer(var2);
                  GameObject.field359 = -1;
                  class50.loadRegions(false, var2);
                  packetWriter.serverPacket0 = null;
               }
            } else {
               if (loginState == 14 && ((AbstractSocket)var1).available() >= 2) {
                  var2.index = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, 2);
                  var2.index = 0;
                  IndexCacheLoader.field407 = var2.method43();
                  loginState = 15;
               }

               if (loginState == 15 && ((AbstractSocket)var1).available() >= IndexCacheLoader.field407) {
                  var2.index = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, IndexCacheLoader.field407);
                  var2.index = 0;
                  String var18 = var2.readStringCp1252NullTerminated();
                  String var22 = var2.readStringCp1252NullTerminated();
                  String var26 = var2.readStringCp1252NullTerminated();
                  class54.method1089(var18, var22, var26);
                  GameShell.updateGameState(10);
               }

               if (loginState != 16) {
                  ++field168;
                  if (field168 > 2000) {
                     if (field169 < 1) {
                        if (class203.port3 == class2.port1) {
                           class203.port3 = WorldMapArea.port2;
                        } else {
                           class203.port3 = class2.port1;
                        }

                        ++field169;
                        loginState = 0;
                     } else {
                        IsaacCipher.method4093(-3);
                     }
                  }
               } else {
                  if (packetWriter.serverPacket0Length == -1) {
                     if (((AbstractSocket)var1).available() < 2) {
                        return;
                     }

                     ((AbstractSocket)var1).read(var2.array, 0, 2);
                     var2.index = 0;
                     packetWriter.serverPacket0Length = var2.method43();
                  }

                  if (((AbstractSocket)var1).available() >= packetWriter.serverPacket0Length) {
                     ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacket0Length);
                     var2.index = 0;
                     var5 = packetWriter.serverPacket0Length;
                     timer.method334();
                     packetWriter.method239();
                     packetWriter.packetBuffer.index = 0;
                     packetWriter.serverPacket0 = null;
                     packetWriter.field676 = null;
                     packetWriter.field677 = null;
                     packetWriter.field678 = null;
                     packetWriter.serverPacket0Length = 0;
                     packetWriter.field674 = 0;
                     rebootTimer = 0;
                     menuOptionsCount = 0;
                     isMenuOpen = false;
                     minimapState = 0;
                     destinationX = 0;

                     for (var4 = 0; var4 < 2048; ++var4) {
                        players[var4] = null;
                     }

                     Canvas.localPlayer = null;

                     for (var4 = 0; var4 < npcs.length; ++var4) {
                        NPC var19 = npcs[var4];
                        if (var19 != null) {
                           var19.targetIndex = -1;
                           var19.false0 = false;
                        }
                     }

                     SpriteMask.method4389();
                     GameShell.updateGameState(30);

                     for (var4 = 0; var4 < 100; ++var4) {
                        field100[var4] = true;
                     }

                     AbstractByteArrayCopier.method4024();
                     class11.updatePlayer(var2);
                     if (var5 != var2.index) {
                        throw new RuntimeException();
                     }
                  }
               }
            }
         }
      } catch (IOException var15) {
         if (field169 < 1) {
            if (class2.port1 == class203.port3) {
               class203.port3 = WorldMapArea.port2;
            } else {
               class203.port3 = class2.port1;
            }

            ++field169;
            loginState = 0;
         } else {
            IsaacCipher.method4093(-2);
         }
      }

   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1646308927"
   )
   @Export("doCycleLoggedIn")
   final void doCycleLoggedIn() {
      if (rebootTimer > 1) {
         --rebootTimer;
      }

      if (field175 > 0) {
         --field175;
      }

      if (field176) {
         field176 = false;
         class48.method868();
      } else {
         if (!isMenuOpen) {
            class30.resetMenuEntries();
         }

         int var1;
         for (var1 = 0; var1 < 100 && this.method85(packetWriter); ++var1) {
         }

         if (gameState == 30) {
            while (true) {
               ReflectionCheck var2 = (ReflectionCheck)class322.reflectionChecks.last();
               boolean var3;
               if (var2 == null) {
                  var3 = false;
               } else {
                  var3 = true;
               }

               int var4;
               PacketBufferNode var5;
               if (!var3) {
                  PacketBufferNode var6;
                  int var7;
                  if (timer.field921) {
                     var6 = Interpreter.method1915(ClientPacket.field226, packetWriter.isaacCipher);
                     var6.packetBuffer.writeByte(0);
                     var7 = var6.packetBuffer.index;
                     timer.write(var6.packetBuffer);
                     var6.packetBuffer.method41(var6.packetBuffer.index - var7);
                     packetWriter.method241(var6);
                     timer.method333();
                  }

                  Object var8 = Projectile.mouseRecorder.lock;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  synchronized(Projectile.mouseRecorder.lock) {
                     if (!field161) {
                        Projectile.mouseRecorder.index = 0;
                     } else if (MouseHandler.MouseHandler_lastButton != 0 || Projectile.mouseRecorder.index >= 40) {
                        var5 = null;
                        var4 = 0;
                        var9 = 0;
                        var10 = 0;
                        var11 = 0;

                        for (var12 = 0; var12 < Projectile.mouseRecorder.index && (var5 == null || var5.packetBuffer.index - var4 < 246); ++var12) {
                           var9 = var12;
                           var13 = Projectile.mouseRecorder.ys[var12];
                           if (var13 < -1) {
                              var13 = -1;
                           } else if (var13 > 65534) {
                              var13 = 65534;
                           }

                           var14 = Projectile.mouseRecorder.xs[var12];
                           if (var14 < -1) {
                              var14 = -1;
                           } else if (var14 > 65534) {
                              var14 = 65534;
                           }

                           if (var14 != field163 || var13 != field164) {
                              if (var5 == null) {
                                 var5 = Interpreter.method1915(ClientPacket.field256, packetWriter.isaacCipher);
                                 var5.packetBuffer.writeByte(0);
                                 var4 = var5.packetBuffer.index;
                                 PacketBuffer var10000 = var5.packetBuffer;
                                 var10000.index += 2;
                                 var10 = 0;
                                 var11 = 0;
                              }

                              if (-1L != field165) {
                                 var15 = var14 - field163;
                                 var16 = var13 - field164;
                                 var17 = (int)((Projectile.mouseRecorder.millis[var12] - field165) / 20L);
                                 var10 = (int)((long)var10 + (Projectile.mouseRecorder.millis[var12] - field165) % 20L);
                              } else {
                                 var15 = var14;
                                 var16 = var13;
                                 var17 = Integer.MAX_VALUE;
                              }

                              field163 = var14;
                              field164 = var13;
                              if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                                 var15 += 32;
                                 var16 += 32;
                                 var5.packetBuffer.writeShort((var17 << 12) + var16 + (var15 << 6));
                              } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                                 var15 += 128;
                                 var16 += 128;
                                 var5.packetBuffer.writeByte(var17 + 128);
                                 var5.packetBuffer.writeShort(var16 + (var15 << 8));
                              } else if (var17 < 32) {
                                 var5.packetBuffer.writeByte(var17 + 192);
                                 if (var14 != -1 && var13 != -1) {
                                    var5.packetBuffer.writeInt(var14 | var13 << 16);
                                 } else {
                                    var5.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var5.packetBuffer.writeShort((var17 & 8191) + 57344);
                                 if (var14 != -1 && var13 != -1) {
                                    var5.packetBuffer.writeInt(var14 | var13 << 16);
                                 } else {
                                    var5.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              }

                              ++var11;
                              field165 = Projectile.mouseRecorder.millis[var12];
                           }
                        }

                        if (var5 != null) {
                           var5.packetBuffer.method41(var5.packetBuffer.index - var4);
                           var12 = var5.packetBuffer.index;
                           var5.packetBuffer.index = var4;
                           var5.packetBuffer.writeByte(var10 / var11);
                           var5.packetBuffer.writeByte(var10 % var11);
                           var5.packetBuffer.index = var12;
                           packetWriter.method241(var5);
                        }

                        if (var9 >= Projectile.mouseRecorder.index) {
                           Projectile.mouseRecorder.index = 0;
                        } else {
                           MouseRecorder var36 = Projectile.mouseRecorder;
                           var36.index -= var9;
                           System.arraycopy(Projectile.mouseRecorder.xs, var9, Projectile.mouseRecorder.xs, 0, Projectile.mouseRecorder.index);
                           System.arraycopy(Projectile.mouseRecorder.ys, var9, Projectile.mouseRecorder.ys, 0, Projectile.mouseRecorder.index);
                           System.arraycopy(Projectile.mouseRecorder.millis, var9, Projectile.mouseRecorder.millis, 0, Projectile.mouseRecorder.index);
                        }
                     }
                  }

                  PacketBufferNode var18;
                  long var19;
                  if (MouseHandler.MouseHandler_lastButton == 1 || !AbstractRasterProvider.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
                     var19 = (MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L) / 50L;
                     if (var19 > 4095L) {
                        var19 = 4095L;
                     }

                     mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
                     var4 = MouseHandler.MouseHandler_lastPressedY;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > Huffman.canvasHeight) {
                        var4 = Huffman.canvasHeight;
                     }

                     var9 = MouseHandler.MouseHandler_lastPressedX;
                     if (var9 < 0) {
                        var9 = 0;
                     } else if (var9 > SoundCache.canvasWidth) {
                        var9 = SoundCache.canvasWidth;
                     }

                     var10 = (int)var19;
                     var18 = Interpreter.method1915(ClientPacket.field263, packetWriter.isaacCipher);
                     var18.packetBuffer.writeShort((var10 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
                     var18.packetBuffer.writeShort(var9);
                     var18.packetBuffer.writeShort(var4);
                     packetWriter.method241(var18);
                  }

                  if (KeyHandler.field452 > 0) {
                     var6 = Interpreter.method1915(ClientPacket.field289, packetWriter.isaacCipher);
                     var6.packetBuffer.writeShort(0);
                     var7 = var6.packetBuffer.index;
                     var19 = class203.currentTimeMs();

                     for (var10 = 0; var10 < KeyHandler.field452; ++var10) {
                        long var21 = var19 - field126;
                        if (var21 > 16777215L) {
                           var21 = 16777215L;
                        }

                        field126 = var19;
                        var6.packetBuffer.method56(KeyHandler.field451[var10]);
                        var6.packetBuffer.writeMedium((int)var21);
                     }

                     var6.packetBuffer.method40(var6.packetBuffer.index - var7);
                     packetWriter.method241(var6);
                  }

                  if (field200 > 0) {
                     --field200;
                  }

                  if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
                     field201 = true;
                  }

                  if (field201 && field200 <= 0) {
                     field200 = 20;
                     field201 = false;
                     var6 = Interpreter.method1915(ClientPacket.field261, packetWriter.isaacCipher);
                     var6.packetBuffer.method64(cameraPitchTarget);
                     var6.packetBuffer.writeShortLE(minimapOrientation);
                     packetWriter.method241(var6);
                  }

                  if (class230.field1138 && !field166) {
                     field166 = true;
                     var6 = Interpreter.method1915(ClientPacket.field295, packetWriter.isaacCipher);
                     var6.packetBuffer.writeByte(1);
                     packetWriter.method241(var6);
                  }

                  if (!class230.field1138 && field166) {
                     field166 = false;
                     var6 = Interpreter.method1915(ClientPacket.field295, packetWriter.isaacCipher);
                     var6.packetBuffer.writeByte(0);
                     packetWriter.method241(var6);
                  }

                  if (class60.worldMap0 != null) {
                     class60.worldMap0.method360();
                  }

                  class266.method5120();
                  Message.method1228();
                  if (gameState != 30) {
                     return;
                  }

                  Canvas.method855();
                  WorldMapIcon1.method212();
                  ++packetWriter.field674;
                  if (packetWriter.field674 > 750) {
                     class48.method868();
                     return;
                  }

                  var1 = Players.Players_count;
                  int[] var30 = Players.Players_indices;

                  for (var4 = 0; var4 < var1; ++var4) {
                     Player var20 = players[var30[var4]];
                     if (var20 != null) {
                        class65.method1232(var20, 1);
                     }
                  }

                  for (var1 = 0; var1 < npcCount; ++var1) {
                     var7 = npcIndices[var1];
                     NPC var31 = npcs[var7];
                     if (var31 != null) {
                        class65.method1232(var31, var31.definition.size);
                     }
                  }

                  Buddy.processOverheadText();
                  ++field183;
                  if (mouseCrossColor != 0) {
                     mouseCrossState += 20;
                     if (mouseCrossState >= 400) {
                        mouseCrossColor = 0;
                     }
                  }

                  if (BoundaryObject.field40 != null) {
                     ++field203;
                     if (field203 >= 15) {
                        class22.method295(BoundaryObject.field40);
                        BoundaryObject.field40 = null;
                     }
                  }

                  Widget var32 = Clock.mousedOverWidgetIf1;
                  Widget var33 = AccessFile.field8;
                  Clock.mousedOverWidgetIf1 = null;
                  AccessFile.field8 = null;
                  draggedOnWidget = null;
                  field103 = false;
                  field106 = false;
                  field137 = 0;

                  while (Decimator.method2490() && field137 < 128) {
                     if (rights >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && IndexStoreAction.field411 == 66) {
                        String var22 = KeyHandler.method839();
                        TextureProvider.client.clipboardSetString(var22);
                     } else if (oculusOrbState != 1 || GzipDecompressor.field378 <= 0) {
                        field145[field137] = IndexStoreAction.field411;
                        field146[field137] = GzipDecompressor.field378;
                        ++field137;
                     }
                  }

                  if (FriendSystem.jmodCheck() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
                     var4 = Canvas.localPlayer.plane - mouseWheelRotation;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 3) {
                        var4 = 3;
                     }

                     if (var4 != Canvas.localPlayer.plane) {
                        var9 = Canvas.localPlayer.pathX[0] + class50.baseX;
                        var10 = Canvas.localPlayer.pathY[0] + GraphicsObject.baseY;
                        var18 = Interpreter.method1915(ClientPacket.field283, packetWriter.isaacCipher);
                        var18.packetBuffer.writeIntME(0);
                        var18.packetBuffer.writeShortLE(var10);
                        var18.packetBuffer.method56(var4);
                        var18.packetBuffer.writeShort(var9);
                        packetWriter.method241(var18);
                     }

                     mouseWheelRotation = 0;
                  }

                  if (rootWidgetGroup != -1) {
                     class231.method4517(rootWidgetGroup, 0, 0, SoundCache.canvasWidth, Huffman.canvasHeight, 0, 0);
                  }

                  ++cycleCntr;

                  while (true) {
                     Widget var23;
                     ScriptEvent var24;
                     Widget var34;
                     do {
                        var24 = (ScriptEvent)field147.removeLast();
                        if (var24 == null) {
                           while (true) {
                              do {
                                 var24 = (ScriptEvent)field148.removeLast();
                                 if (var24 == null) {
                                    while (true) {
                                       do {
                                          var24 = (ScriptEvent)scriptEvents.removeLast();
                                          if (var24 == null) {
                                             this.method86();
                                             WorldMapSectionType.method254();
                                             if (clickedWidget != null) {
                                                this.method88();
                                             }

                                             PacketBufferNode var25;
                                             if (DevicePcmPlayerProvider.dragInventoryWidget != null) {
                                                class22.method295(DevicePcmPlayerProvider.dragInventoryWidget);
                                                ++itemDragDuration;
                                                if (MouseHandler.MouseHandler_currentButton == 0) {
                                                   if (field207) {
                                                      if (UserComparator6.field937 == DevicePcmPlayerProvider.dragInventoryWidget && dragItemSlotSource != dragItemSlotDestination) {
                                                         Widget var26 = DevicePcmPlayerProvider.dragInventoryWidget;
                                                         byte var27 = 0;
                                                         if (field136 == 1 && var26.contentType == 206) {
                                                            var27 = 1;
                                                         }

                                                         if (var26.itemIds[dragItemSlotDestination] <= 0) {
                                                            var27 = 0;
                                                         }

                                                         if (class168.method3461(class1.getWidgetClickMask(var26))) {
                                                            var10 = dragItemSlotSource;
                                                            var11 = dragItemSlotDestination;
                                                            var26.itemIds[var11] = var26.itemIds[var10];
                                                            var26.itemQuantities[var11] = var26.itemQuantities[var10];
                                                            var26.itemIds[var10] = -1;
                                                            var26.itemQuantities[var10] = 0;
                                                         } else if (var27 == 1) {
                                                            var10 = dragItemSlotSource;
                                                            var11 = dragItemSlotDestination;

                                                            while (var10 != var11) {
                                                               if (var10 > var11) {
                                                                  var26.swapItems(var10 - 1, var10);
                                                                  --var10;
                                                               } else if (var10 < var11) {
                                                                  var26.swapItems(var10 + 1, var10);
                                                                  ++var10;
                                                               }
                                                            }
                                                         } else {
                                                            var26.swapItems(dragItemSlotDestination, dragItemSlotSource);
                                                         }

                                                         var25 = Interpreter.method1915(ClientPacket.field302, packetWriter.isaacCipher);
                                                         var25.packetBuffer.writeShort(dragItemSlotDestination);
                                                         var25.packetBuffer.writeShortLE(dragItemSlotSource);
                                                         var25.packetBuffer.writeInt(DevicePcmPlayerProvider.dragInventoryWidget.id);
                                                         var25.packetBuffer.method56(var27);
                                                         packetWriter.method241(var25);
                                                      }
                                                   } else if (this.shouldLeftClickOpenMenu()) {
                                                      this.openMenu(field205, field206);
                                                   } else if (menuOptionsCount > 0) {
                                                      var4 = field205;
                                                      var9 = field206;
                                                      class231.processTempMenuAction(UnitPriceComparator.tempMenuAction, var4, var9);
                                                      UnitPriceComparator.tempMenuAction = null;
                                                   }

                                                   field203 = 10;
                                                   MouseHandler.MouseHandler_lastButton = 0;
                                                   DevicePcmPlayerProvider.dragInventoryWidget = null;
                                                } else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > field205 + 5 || MouseHandler.MouseHandler_x < field205 - 5 || MouseHandler.MouseHandler_y > field206 + 5 || MouseHandler.MouseHandler_y < field206 - 5)) {
                                                   field207 = true;
                                                }
                                             }

                                             if (Scene.method3187()) {
                                                var4 = Scene.Scene_selectedX;
                                                var9 = Scene.Scene_selectedY;
                                                var25 = Interpreter.method1915(ClientPacket.field318, packetWriter.isaacCipher);
                                                var25.packetBuffer.writeByte(5);
                                                var25.packetBuffer.method63(var9 + GraphicsObject.baseY);
                                                var25.packetBuffer.method63(var4 + class50.baseX);
                                                var25.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
                                                packetWriter.method241(var25);
                                                Scene.method3103();
                                                mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
                                                mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
                                                mouseCrossColor = 1;
                                                mouseCrossState = 0;
                                                destinationX = var4;
                                                destinationY = var9;
                                             }

                                             if (var32 != Clock.mousedOverWidgetIf1) {
                                                if (var32 != null) {
                                                   class22.method295(var32);
                                                }

                                                if (Clock.mousedOverWidgetIf1 != null) {
                                                   class22.method295(Clock.mousedOverWidgetIf1);
                                                }
                                             }

                                             if (var33 != AccessFile.field8 && field218 == field219) {
                                                if (var33 != null) {
                                                   class22.method295(var33);
                                                }

                                                if (AccessFile.field8 != null) {
                                                   class22.method295(AccessFile.field8);
                                                }
                                             }

                                             if (AccessFile.field8 != null) {
                                                if (field218 < field219) {
                                                   ++field218;
                                                   if (field219 == field218) {
                                                      class22.method295(AccessFile.field8);
                                                   }
                                                }
                                             } else if (field218 > 0) {
                                                --field218;
                                             }

                                             class54.method1091();
                                             if (isCameraLocked) {
                                                var4 = class3.field1146 * 128 + 64;
                                                var9 = MusicPatchPcmStream.field602 * 128 + 64;
                                                var10 = class32.getTileHeight(var4, var9, SoundSystem.plane) - AbstractWorldMapIcon.field4;
                                                if (WorldMapSection1.cameraX < var4) {
                                                   WorldMapSection1.cameraX = (var4 - WorldMapSection1.cameraX) * class30.field1148 / 1000 + WorldMapSection1.cameraX + ClientPacket.field221;
                                                   if (WorldMapSection1.cameraX > var4) {
                                                      WorldMapSection1.cameraX = var4;
                                                   }
                                                }

                                                if (WorldMapSection1.cameraX > var4) {
                                                   WorldMapSection1.cameraX -= class30.field1148 * (WorldMapSection1.cameraX - var4) / 1000 + ClientPacket.field221;
                                                   if (WorldMapSection1.cameraX < var4) {
                                                      WorldMapSection1.cameraX = var4;
                                                   }
                                                }

                                                if (GrandExchangeEvents.cameraY < var10) {
                                                   GrandExchangeEvents.cameraY = (var10 - GrandExchangeEvents.cameraY) * class30.field1148 / 1000 + GrandExchangeEvents.cameraY + ClientPacket.field221;
                                                   if (GrandExchangeEvents.cameraY > var10) {
                                                      GrandExchangeEvents.cameraY = var10;
                                                   }
                                                }

                                                if (GrandExchangeEvents.cameraY > var10) {
                                                   GrandExchangeEvents.cameraY -= class30.field1148 * (GrandExchangeEvents.cameraY - var10) / 1000 + ClientPacket.field221;
                                                   if (GrandExchangeEvents.cameraY < var10) {
                                                      GrandExchangeEvents.cameraY = var10;
                                                   }
                                                }

                                                if (class11.cameraZ < var9) {
                                                   class11.cameraZ = (var9 - class11.cameraZ) * class30.field1148 / 1000 + class11.cameraZ + ClientPacket.field221;
                                                   if (class11.cameraZ > var9) {
                                                      class11.cameraZ = var9;
                                                   }
                                                }

                                                if (class11.cameraZ > var9) {
                                                   class11.cameraZ -= class30.field1148 * (class11.cameraZ - var9) / 1000 + ClientPacket.field221;
                                                   if (class11.cameraZ < var9) {
                                                      class11.cameraZ = var9;
                                                   }
                                                }

                                                var4 = GrandExchangeOffer.field376 * 128 + 64;
                                                var9 = KeyHandler.field445 * 128 + 64;
                                                var10 = class32.getTileHeight(var4, var9, SoundSystem.plane) - IndexStoreAction.field410;
                                                var11 = var4 - WorldMapSection1.cameraX;
                                                var12 = var10 - GrandExchangeEvents.cameraY;
                                                var13 = var9 - class11.cameraZ;
                                                var14 = (int)Math.sqrt((double)(var13 * var13 + var11 * var11));
                                                var15 = (int)(Math.atan2((double)var12, (double)var14) * 325.949D) & 2047;
                                                var16 = (int)(Math.atan2((double)var11, (double)var13) * -325.949D) & 2047;
                                                if (var15 < 128) {
                                                   var15 = 128;
                                                }

                                                if (var15 > 383) {
                                                   var15 = 383;
                                                }

                                                if (WorldMapIcon1.cameraPitch < var15) {
                                                   WorldMapIcon1.cameraPitch = (var15 - WorldMapIcon1.cameraPitch) * class171.field1116 / 1000 + WorldMapIcon1.cameraPitch + VertexNormal.field946;
                                                   if (WorldMapIcon1.cameraPitch > var15) {
                                                      WorldMapIcon1.cameraPitch = var15;
                                                   }
                                                }

                                                if (WorldMapIcon1.cameraPitch > var15) {
                                                   WorldMapIcon1.cameraPitch -= class171.field1116 * (WorldMapIcon1.cameraPitch - var15) / 1000 + VertexNormal.field946;
                                                   if (WorldMapIcon1.cameraPitch < var15) {
                                                      WorldMapIcon1.cameraPitch = var15;
                                                   }
                                                }

                                                var17 = var16 - MusicPatchNode.cameraYaw;
                                                if (var17 > 1024) {
                                                   var17 -= 2048;
                                                }

                                                if (var17 < -1024) {
                                                   var17 += 2048;
                                                }

                                                if (var17 > 0) {
                                                   MusicPatchNode.cameraYaw = MusicPatchNode.cameraYaw + VertexNormal.field946 + var17 * class171.field1116 / 1000;
                                                   MusicPatchNode.cameraYaw &= 2047;
                                                }

                                                if (var17 < 0) {
                                                   MusicPatchNode.cameraYaw -= VertexNormal.field946 + -var17 * class171.field1116 / 1000;
                                                   MusicPatchNode.cameraYaw &= 2047;
                                                }

                                                int var35 = var16 - MusicPatchNode.cameraYaw;
                                                if (var35 > 1024) {
                                                   var35 -= 2048;
                                                }

                                                if (var35 < -1024) {
                                                   var35 += 2048;
                                                }

                                                if (var35 < 0 && var17 > 0 || var35 > 0 && var17 < 0) {
                                                   MusicPatchNode.cameraYaw = var16;
                                                }
                                             }

                                             for (var4 = 0; var4 < 5; ++var4) {
                                                int var10002 = field144[var4]++;
                                             }

                                             class196.varcs.tryWrite();
                                             var4 = class22.method297();
                                             var9 = KeyHandler.KeyHandler_idleCycles;
                                             if (var4 > 15000 && var9 > 15000) {
                                                field175 = 250;
                                                MouseHandler.MouseHandler_idleCycles = 14500;
                                                var18 = Interpreter.method1915(ClientPacket.field271, packetWriter.isaacCipher);
                                                packetWriter.method241(var18);
                                             }

                                             WorldMapArea.friendSystem.method102();
                                             ++packetWriter.field675;
                                             if (packetWriter.field675 > 50) {
                                                var18 = Interpreter.method1915(ClientPacket.field244, packetWriter.isaacCipher);
                                                packetWriter.method241(var18);
                                             }

                                             try {
                                                packetWriter.method240();
                                             } catch (IOException var28) {
                                                class48.method868();
                                             }

                                             return;
                                          }

                                          var23 = var24.widget;
                                          if (var23.childIndex < 0) {
                                             break;
                                          }

                                          var34 = Huffman.getWidget(var23.parentId);
                                       } while(var34 == null || var34.children == null || var23.childIndex >= var34.children.length || var23 != var34.children[var23.childIndex]);

                                       AbstractIndexCache.runScript(var24);
                                    }
                                 }

                                 var23 = var24.widget;
                                 if (var23.childIndex < 0) {
                                    break;
                                 }

                                 var34 = Huffman.getWidget(var23.parentId);
                              } while(var34 == null || var34.children == null || var23.childIndex >= var34.children.length || var23 != var34.children[var23.childIndex]);

                              AbstractIndexCache.runScript(var24);
                           }
                        }

                        var23 = var24.widget;
                        if (var23.childIndex < 0) {
                           break;
                        }

                        var34 = Huffman.getWidget(var23.parentId);
                     } while(var34 == null || var34.children == null || var23.childIndex >= var34.children.length || var23 != var34.children[var23.childIndex]);

                     AbstractIndexCache.runScript(var24);
                  }
               }

               var5 = Interpreter.method1915(ClientPacket.field313, packetWriter.isaacCipher);
               var5.packetBuffer.writeByte(0);
               var4 = var5.packetBuffer.index;
               WorldMapLabel.method443(var5.packetBuffer);
               var5.packetBuffer.method41(var5.packetBuffer.index - var4);
               packetWriter.method241(var5);
            }
         }
      }

   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1792846917"
   )
   void method84() {
      int var1 = SoundCache.canvasWidth;
      int var2 = Huffman.canvasHeight;
      if (super.contentWidth < var1) {
         var1 = super.contentWidth;
      }

      if (super.contentHeight < var2) {
         var2 = super.contentHeight;
      }

      if (ReflectionCheck.clientPreferences != null) {
         try {
            Client var3 = TextureProvider.client;
            Object[] var4 = new Object[]{SpotAnimationDefinition.method4822()};
            JSObject.getWindow(var3).call("resize", var4);
         } catch (Throwable var5) {
         }
      }

   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1433182492"
   )
   @Export("drawLoggedIn")
   final void drawLoggedIn() {
      if (rootWidgetGroup != -1) {
         ClientPreferences.method1809(rootWidgetGroup);
      }

      int var1;
      for (var1 = 0; var1 < rootWidgetCount; ++var1) {
         if (field100[var1]) {
            field102[var1] = true;
         }

         field101[var1] = field100[var1];
         field100[var1] = false;
      }

      field98 = cycle;
      field216 = -1;
      field217 = -1;
      UserComparator6.field937 = null;
      if (rootWidgetGroup != -1) {
         rootWidgetCount = 0;
         Interpreter.drawWidgets(rootWidgetGroup, 0, 0, SoundCache.canvasWidth, Huffman.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (showMouseCross) {
         if (mouseCrossColor == 1) {
            KeyHandler.crossSprites[mouseCrossState / 100].drawAt2(mouseCrossX - 8, mouseCrossY - 8);
         }

         if (mouseCrossColor == 2) {
            KeyHandler.crossSprites[mouseCrossState / 100 + 4].drawAt2(mouseCrossX - 8, mouseCrossY - 8);
         }
      }

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if (!isMenuOpen) {
         if (field216 != -1) {
            class39.drawMenuActionTextAt(field216, field217);
         }
      } else {
         var1 = class25.menuX;
         var2 = GameShell.menuY;
         var3 = class214.menuWidth;
         var4 = AbstractWorldMapIcon.menuHeight;
         int var8 = 6116423;
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var8);
         Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         class2.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var8, -1);
         var5 = MouseHandler.MouseHandler_x;
         var6 = MouseHandler.MouseHandler_y;

         int var9;
         int var10;
         for (var7 = 0; var7 < menuOptionsCount; ++var7) {
            var9 = var2 + (menuOptionsCount - 1 - var7) * 15 + 31;
            var10 = 16777215;
            if (var5 > var1 && var5 < var3 + var1 && var6 > var9 - 13 && var6 < var9 + 3) {
               var10 = 16776960;
            }

            Font var11 = class2.fontBold12;
            String var12;
            if (var7 < 0) {
               var12 = "";
            } else if (menuTargetNames[var7].length() > 0) {
               var12 = menuActions[var7] + " " + menuTargetNames[var7];
            } else {
               var12 = menuActions[var7];
            }

            var11.draw(var12, var1 + 3, var9, var10, 0);
         }

         var7 = class25.menuX;
         var9 = GameShell.menuY;
         var10 = class214.menuWidth;
         int var15 = AbstractWorldMapIcon.menuHeight;

         for (int var18 = 0; var18 < rootWidgetCount; ++var18) {
            if (rootWidgetXs[var18] + rootWidgetWidths[var18] > var7 && rootWidgetXs[var18] < var7 + var10 && rootWidgetYs[var18] + rootWidgetHeights[var18] > var9 && rootWidgetYs[var18] < var9 + var15) {
               field102[var18] = true;
            }
         }
      }

      if (gameDrawingMode == 3) {
         for (var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field101[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
            } else if (field102[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
            }
         }
      }

      var1 = SoundSystem.plane;
      var2 = Canvas.localPlayer.x;
      var3 = Canvas.localPlayer.y;
      var4 = field183;

      for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var13.soundEffectId != -1 || var13.soundEffectIds != null) {
            var5 = 0;
            if (var2 > var13.field650) {
               var5 += var2 - var13.field650;
            } else if (var2 < var13.field648) {
               var5 += var13.field648 - var2;
            }

            if (var3 > var13.field651) {
               var5 += var3 - var13.field651;
            } else if (var3 < var13.field649) {
               var5 += var13.field649 - var3;
            }

            if (var5 - 64 <= var13.field652 && field115 != 0 && var1 == var13.field647) {
               var5 -= 64;
               if (var5 < 0) {
                  var5 = 0;
               }

               var6 = (var13.field652 - var5) * field115 / var13.field652;
               Object var14;
               SoundEffect var16;
               RawSound var17;
               RawPcmStream var19;
               if (var13.stream1 == null) {
                  if (var13.soundEffectId >= 0) {
                     var14 = null;
                     var16 = SoundEffect.readSoundEffect(class25.indexCache4, var13.soundEffectId, 0);
                     if (var16 != null) {
                        var17 = var16.toRawSound().resample(MilliClock.decimator);
                        var19 = RawPcmStream.createRawPcmStream(var17, 100, var6);
                        var19.setNumLoops(-1);
                        TaskHandler.pcmStreamMixer.addSubStream(var19);
                        var13.stream1 = var19;
                     }
                  }
               } else {
                  var13.stream1.method265(var6);
               }

               if (var13.stream2 == null) {
                  if (var13.soundEffectIds != null && (var13.field655 -= var4) <= 0) {
                     var7 = (int)(Math.random() * (double)var13.soundEffectIds.length);
                     var14 = null;
                     var16 = SoundEffect.readSoundEffect(class25.indexCache4, var13.soundEffectIds[var7], 0);
                     if (var16 != null) {
                        var17 = var16.toRawSound().resample(MilliClock.decimator);
                        var19 = RawPcmStream.createRawPcmStream(var17, 100, var6);
                        var19.setNumLoops(0);
                        TaskHandler.pcmStreamMixer.addSubStream(var19);
                        var13.stream2 = var19;
                        var13.field655 = var13.field653 + (int)(Math.random() * (double)(var13.field654 - var13.field653));
                     }
                  }
               } else {
                  var13.stream2.method265(var6);
                  if (!var13.stream2.hasNext()) {
                     var13.stream2 = null;
                  }
               }
            } else {
               if (var13.stream1 != null) {
                  TaskHandler.pcmStreamMixer.removeSubStream(var13.stream1);
                  var13.stream1 = null;
               }

               if (var13.stream2 != null) {
                  TaskHandler.pcmStreamMixer.removeSubStream(var13.stream2);
                  var13.stream2 = null;
               }
            }
         }
      }

      field183 = 0;
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(Lcl;I)Z",
      garbageValue = "1488446149"
   )
   final boolean method85(PacketWriter var1) {
      AbstractSocket var2 = var1.getSocket();
      PacketBuffer var3 = var1.packetBuffer;
      if (var2 == null) {
         return false;
      } else {
         String var4;
         int var5;
         try {
            int var6;
            if (var1.serverPacket0 == null) {
               if (var1.field673) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 0, 1);
                  var1.field674 = 0;
                  var1.field673 = false;
               }

               var3.index = 0;
               if (var3.method236()) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 1, 1);
                  var1.field674 = 0;
               }

               var1.field673 = true;
               ServerPacket[] var7 = class27.method429();
               var6 = var3.readSmartByteShortIsaac();
               if (var6 < 0 || var6 >= var7.length) {
                  throw new IOException(var6 + " " + var3.index);
               }

               var1.serverPacket0 = var7[var6];
               var1.serverPacket0Length = var1.serverPacket0.length;
            }

            if (var1.serverPacket0Length == -1) {
               if (!var2.isAvailable(1)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 1);
               var1.serverPacket0Length = var3.array[0] & 255;
            }

            if (var1.serverPacket0Length == -2) {
               if (!var2.isAvailable(2)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 2);
               var3.index = 0;
               var1.serverPacket0Length = var3.method43();
            }

            if (!var2.isAvailable(var1.serverPacket0Length)) {
               return false;
            }

            var3.index = 0;
            var2.read(var3.array, 0, var1.serverPacket0Length);
            var1.field674 = 0;
            timer.method329();
            var1.field678 = var1.field677;
            var1.field677 = var1.field676;
            var1.field676 = var1.serverPacket0;
            if (ServerPacket.field838 == var1.serverPacket0) {
               class16.method189(class190.field2344);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field864 == var1.serverPacket0) {
               isCameraLocked = true;
               class3.field1146 = var3.readUnsignedByte();
               MusicPatchPcmStream.field602 = var3.readUnsignedByte();
               AbstractWorldMapIcon.field4 = var3.method43();
               ClientPacket.field221 = var3.readUnsignedByte();
               class30.field1148 = var3.readUnsignedByte();
               if (class30.field1148 >= 100) {
                  WorldMapSection1.cameraX = class3.field1146 * 128 + 64;
                  class11.cameraZ = MusicPatchPcmStream.field602 * 128 + 64;
                  GrandExchangeEvents.cameraY = class32.getTileHeight(WorldMapSection1.cameraX, class11.cameraZ, SoundSystem.plane) - AbstractWorldMapIcon.field4;
               }

               var1.serverPacket0 = null;
               return true;
            }

            int var37;
            if (ServerPacket.field817 == var1.serverPacket0) {
               for (var37 = 0; var37 < players.length; ++var37) {
                  if (players[var37] != null) {
                     players[var37].sequence = -1;
                  }
               }

               for (var37 = 0; var37 < npcs.length; ++var37) {
                  if (npcs[var37] != null) {
                     npcs[var37].sequence = -1;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field806 == var1.serverPacket0) {
               Canvas.field95 = var3.method59();
               WorldMapSection3.field1089 = var3.readUnsignedByteNegate();

               while (var3.index < var1.serverPacket0Length) {
                  var37 = var3.readUnsignedByte();
                  class190 var38 = RunException.method3430()[var37];
                  class16.method189(var38);
               }

               var1.serverPacket0 = null;
               return true;
            }

            Widget var8;
            if (ServerPacket.field850 == var1.serverPacket0) {
               var37 = var3.method44();
               var6 = var3.method73();
               var8 = Huffman.getWidget(var6);
               if (var37 != var8.sequenceId || var37 == -1) {
                  var8.sequenceId = var37;
                  var8.modelFrame = 0;
                  var8.modelFrameCycle = 0;
                  class22.method295(var8);
               }

               var1.serverPacket0 = null;
               return true;
            }

            Widget var9;
            if (ServerPacket.field819 == var1.serverPacket0) {
               var37 = var3.method73();
               var9 = Huffman.getWidget(var37);
               var9.modelType = 3;
               var9.modelId = Canvas.localPlayer.appearance.getChatHeadId();
               class22.method295(var9);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field790 == var1.serverPacket0) {
               TextureProvider.method2773();
               var1.serverPacket0 = null;
               return false;
            }

            if (ServerPacket.field796 == var1.serverPacket0) {
               var37 = var3.method72();
               var9 = Huffman.getWidget(var37);

               for (var5 = 0; var5 < var9.itemIds.length; ++var5) {
                  var9.itemIds[var5] = -1;
                  var9.itemIds[var5] = 0;
               }

               class22.method295(var9);
               var1.serverPacket0 = null;
               return true;
            }

            int var10;
            int var11;
            int var12;
            int var13;
            if (ServerPacket.field859 == var1.serverPacket0) {
               var37 = var3.readInt();
               var6 = var3.method43();
               if (var37 < -70000) {
                  var6 += 32768;
               }

               if (var37 >= 0) {
                  var8 = Huffman.getWidget(var37);
               } else {
                  var8 = null;
               }

               if (var8 != null) {
                  for (var10 = 0; var10 < var8.itemIds.length; ++var10) {
                     var8.itemIds[var10] = 0;
                     var8.itemQuantities[var10] = 0;
                  }
               }

               PlayerType.clearItemContainer(var6);
               var10 = var3.method43();

               for (var11 = 0; var11 < var10; ++var11) {
                  var12 = var3.method43();
                  var13 = var3.readUnsignedByte();
                  if (var13 == 255) {
                     var13 = var3.method73();
                  }

                  if (var8 != null && var11 < var8.itemIds.length) {
                     var8.itemIds[var11] = var12;
                     var8.itemQuantities[var11] = var13;
                  }

                  WorldMapManager.itemContainerSetItem(var6, var11, var12 - 1, var13);
               }

               if (var8 != null) {
                  class22.method295(var8);
               }

               class12.method159();
               field116[++field117 - 1 & 31] = var6 & 32767;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field797 == var1.serverPacket0) {
               class16.method189(class190.field2341);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field842 == var1.serverPacket0) {
               UserComparator7.method3360(var3, var1.serverPacket0Length);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field853 == var1.serverPacket0) {
               WorldMapSection3.field1089 = var3.readUnsignedByteNegate();
               Canvas.field95 = var3.method59();
               var1.serverPacket0 = null;
               return true;
            }

            boolean var14;
            if (ServerPacket.field810 == var1.serverPacket0) {
               var37 = var3.readInt();
               var14 = var3.readUnsignedByte() == 1;
               var8 = Huffman.getWidget(var37);
               if (var14 != var8.isHidden) {
                  var8.isHidden = var14;
                  class22.method295(var8);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field852 == var1.serverPacket0) {
               byte var39 = var3.method60();
               var6 = var3.method66();
               Varps.Varps_temp[var6] = var39;
               if (Varps.Varps_main[var6] != var39) {
                  Varps.Varps_main[var6] = var39;
               }

               IndexCache.method4703(var6);
               field121[++field123 - 1 & 31] = var6;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field803 == var1.serverPacket0) {
               class16.method189(class190.field2347);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field844 == var1.serverPacket0) {
               var37 = var3.readUnsignedByte();
               if (var3.readUnsignedByte() == 0) {
                  grandExchangeOffers[var37] = new GrandExchangeOffer();
                  var3.index += 18;
               } else {
                  --var3.index;
                  grandExchangeOffers[var37] = new GrandExchangeOffer(var3, false);
               }

               field122 = cycleCntr;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field873 == var1.serverPacket0) {
               var37 = var3.method67();
               rootWidgetGroup = var37;
               this.method87(false);
               DevicePcmPlayerProvider.method845(var37);
               WorldMapSection3.runWidgetOnLoadListener(rootWidgetGroup);

               for (var6 = 0; var6 < 100; ++var6) {
                  field100[var6] = true;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field849 == var1.serverPacket0) {
               class12.method159();
               runEnergy = var3.readUnsignedByte();
               field124 = cycleCntr;
               var1.serverPacket0 = null;
               return true;
            }

            Widget var15;
            if (ServerPacket.field839 == var1.serverPacket0) {
               var37 = var3.method67();
               var6 = var3.method67();
               var5 = var3.method67();
               var10 = var3.method73();
               var15 = Huffman.getWidget(var10);
               if (var37 != var15.modelAngleX || var5 != var15.modelAngleY || var6 != var15.modelZoom) {
                  var15.modelAngleX = var37;
                  var15.modelAngleY = var5;
                  var15.modelZoom = var6;
                  class22.method295(var15);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field825 == var1.serverPacket0) {
               hintArrowType = var3.readUnsignedByte();
               if (hintArrowType == 1) {
                  hintArrowNpcIndex = var3.method43();
               }

               if (hintArrowType >= 2 && hintArrowType <= 6) {
                  if (hintArrowType == 2) {
                     hintArrowSubX = 64;
                     hintArrowSubY = 64;
                  }

                  if (hintArrowType == 3) {
                     hintArrowSubX = 0;
                     hintArrowSubY = 64;
                  }

                  if (hintArrowType == 4) {
                     hintArrowSubX = 128;
                     hintArrowSubY = 64;
                  }

                  if (hintArrowType == 5) {
                     hintArrowSubX = 64;
                     hintArrowSubY = 0;
                  }

                  if (hintArrowType == 6) {
                     hintArrowSubX = 64;
                     hintArrowSubY = 128;
                  }

                  hintArrowType = 2;
                  hintArrowX = var3.method43();
                  hintArrowY = var3.method43();
                  hintArrowHeight = var3.readUnsignedByte();
               }

               if (hintArrowType == 10) {
                  hintArrowPlayerIndex = var3.method43();
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field868 == var1.serverPacket0) {
               Skeleton.method3062(var3, var1.serverPacket0Length);
               ScriptFrame.method1138();
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field789 == var1.serverPacket0) {
               class50.loadRegions(false, var1.packetBuffer);
               var1.serverPacket0 = null;
               return true;
            }

            Widget var16;
            if (ServerPacket.field830 == var1.serverPacket0) {
               var37 = var3.method66();
               var6 = var3.method65();
               var5 = var3.method72();
               var16 = Huffman.getWidget(var5);
               var16.field963 = var37 + (var6 << 16);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field841 == var1.serverPacket0) {
               if (rootWidgetGroup != -1) {
                  GrandExchangeEvents.method74(rootWidgetGroup, 0);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field809 == var1.serverPacket0) {
               var37 = var3.readInt();
               var6 = var3.method43();
               if (var6 == 65535) {
                  var6 = -1;
               }

               var5 = var3.method73();
               var16 = Huffman.getWidget(var37);
               ItemDefinition var40;
               if (!var16.isIf3) {
                  if (var6 == -1) {
                     var16.modelType = 0;
                     var1.serverPacket0 = null;
                     return true;
                  }

                  var40 = Skills.getItemDefinition(var6);
                  var16.modelType = 4;
                  var16.modelId = var6;
                  var16.modelAngleX = var40.xan2d;
                  var16.modelAngleY = var40.yan2d;
                  var16.modelZoom = var40.zoom2d * 100 / var5;
                  class22.method295(var16);
               } else {
                  var16.itemId = var6;
                  var16.itemQuantity = var5;
                  var40 = Skills.getItemDefinition(var6);
                  var16.modelAngleX = var40.xan2d;
                  var16.modelAngleY = var40.yan2d;
                  var16.modelAngleZ = var40.zan2d;
                  var16.modelOffsetX = var40.offsetX2d;
                  var16.modelOffsetY = var40.offsetY2d;
                  var16.modelZoom = var40.zoom2d;
                  if (var40.isStackable == 1) {
                     var16.itemQuantityMode = 1;
                  } else {
                     var16.itemQuantityMode = 2;
                  }

                  if (var16.field962 > 0) {
                     var16.modelZoom = var16.modelZoom * 32 / var16.field962;
                  } else if (var16.rawWidth > 0) {
                     var16.modelZoom = var16.modelZoom * 32 / var16.rawWidth;
                  }

                  class22.method295(var16);
               }

               var1.serverPacket0 = null;
               return true;
            }

            String var17;
            boolean var18;
            if (ServerPacket.field792 == var1.serverPacket0) {
               var37 = var3.method48();
               var14 = var3.readUnsignedByte() == 1;
               var17 = "";
               var18 = false;
               if (var14) {
                  var17 = var3.readStringCp1252NullTerminated();
                  if (WorldMapArea.friendSystem.isIgnored(new Username(var17, KeyHandler.loginType))) {
                     var18 = true;
                  }
               }

               String var41 = var3.readStringCp1252NullTerminated();
               if (!var18) {
                  WorldMapIcon1.method219(var37, var17, var41);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field857 == var1.serverPacket0) {
               IndexCacheLoader.field512 = WorldMapElement.method4783(var3.readUnsignedByte());
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field801 == var1.serverPacket0) {
               class16.method189(class190.field2345);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field805 == var1.serverPacket0) {
               var18 = var3.readBoolean();
               if (var18) {
                  if (ClientParameter.field3645 == null) {
                     ClientParameter.field3645 = new class248();
                  }
               } else {
                  ClientParameter.field3645 = null;
               }

               var1.serverPacket0 = null;
               return true;
            }

            long var19;
            if (ServerPacket.field837 == var1.serverPacket0) {
               var37 = var3.method71();
               var6 = var3.method66();
               if (var6 == 65535) {
                  var6 = -1;
               }

               var5 = var3.method73();
               var10 = var3.method43();
               if (var10 == 65535) {
                  var10 = -1;
               }

               for (var11 = var10; var11 <= var6; ++var11) {
                  var19 = (long)var11 + ((long)var5 << 32);
                  Node var42 = widgetClickMasks.get(var19);
                  if (var42 != null) {
                     var42.remove();
                  }

                  widgetClickMasks.put(new IntegerNode(var37), var19);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field870 == var1.serverPacket0) {
               class3.updateNpcs(true, var3);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field834 == var1.serverPacket0) {
               if (PacketWriter.clanChat != null) {
                  PacketWriter.clanChat.method78(var3);
               }

               UserComparator8.method3349();
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field804 == var1.serverPacket0) {
               class16.method189(class190.field2346);
               var1.serverPacket0 = null;
               return true;
            }

            String var21;
            if (ServerPacket.field851 == var1.serverPacket0) {
               var21 = var3.readStringCp1252NullTerminated();
               Object[] var46 = new Object[var21.length() + 1];

               for (var5 = var21.length() - 1; var5 >= 0; --var5) {
                  if (var21.charAt(var5) == 's') {
                     var46[var5 + 1] = var3.readStringCp1252NullTerminated();
                  } else {
                     var46[var5 + 1] = new Integer(var3.readInt());
                  }
               }

               var46[0] = new Integer(var3.readInt());
               ScriptEvent var49 = new ScriptEvent();
               var49.args0 = var46;
               AbstractIndexCache.runScript(var49);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field815 == var1.serverPacket0) {
               class16.method189(class190.field2343);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field802 == var1.serverPacket0) {
               class16.method189(class190.field2350);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field856 == var1.serverPacket0) {
               destinationX = var3.readUnsignedByte();
               if (destinationX == 255) {
                  destinationX = 0;
               }

               destinationY = var3.readUnsignedByte();
               if (destinationY == 255) {
                  destinationY = 0;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field867 == var1.serverPacket0) {
               for (var37 = 0; var37 < VarpDefinition.field944; ++var37) {
                  VarpDefinition var44 = SecureRandomCallable.method1140(var37);
                  if (var44 != null) {
                     Varps.Varps_temp[var37] = 0;
                     Varps.Varps_main[var37] = 0;
                  }
               }

               class12.method159();
               field123 += 32;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field833 == var1.serverPacket0) {
               var37 = var3.readInt();
               var6 = var3.method43();
               if (var37 < -70000) {
                  var6 += 32768;
               }

               if (var37 >= 0) {
                  var8 = Huffman.getWidget(var37);
               } else {
                  var8 = null;
               }

               for (; var3.index < var1.serverPacket0Length; WorldMapManager.itemContainerSetItem(var6, var10, var11 - 1, var12)) {
                  var10 = var3.method48();
                  var11 = var3.method43();
                  var12 = 0;
                  if (var11 != 0) {
                     var12 = var3.readUnsignedByte();
                     if (var12 == 255) {
                        var12 = var3.readInt();
                     }
                  }

                  if (var8 != null && var10 >= 0 && var10 < var8.itemIds.length) {
                     var8.itemIds[var10] = var11;
                     var8.itemQuantities[var10] = var12;
                  }
               }

               if (var8 != null) {
                  class22.method295(var8);
               }

               class12.method159();
               field116[++field117 - 1 & 31] = var6 & 32767;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field854 == var1.serverPacket0) {
               var37 = var3.method43();
               var6 = var3.readUnsignedByte();
               var5 = var3.method43();
               Ignored.queueSoundEffect(var37, var6, var5);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field848 == var1.serverPacket0) {
               var37 = var3.method72();
               var6 = var3.method69();
               var5 = var3.method68();
               var16 = Huffman.getWidget(var37);
               if (var5 != var16.rawX || var6 != var16.rawY || var16.xAlignment != 0 || var16.yAlignment != 0) {
                  var16.rawX = var5;
                  var16.rawY = var6;
                  var16.xAlignment = 0;
                  var16.yAlignment = 0;
                  class22.method295(var16);
                  this.alignWidget(var16);
                  if (var16.type == 0) {
                     class39.revalidateWidgetScroll(Widget.widgets[var37 >> 16], var16, false);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field824 == var1.serverPacket0) {
               var37 = var3.method67();
               var6 = var3.method73();
               var8 = Huffman.getWidget(var6);
               if (var8.modelType != 2 || var37 != var8.modelId) {
                  var8.modelType = 2;
                  var8.modelId = var37;
                  class22.method295(var8);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field836 == var1.serverPacket0) {
               World var43 = new World();
               var43.host = var3.readStringCp1252NullTerminated();
               var43.id = var3.method43();
               var6 = var3.readInt();
               var43.properties = var6;
               GameShell.updateGameState(45);
               var2.close();
               var2 = null;
               class31.changeWorld(var43);
               var1.serverPacket0 = null;
               return false;
            }

            if (ServerPacket.field821 == var1.serverPacket0) {
               WorldMapArea.friendSystem.ignoreList.read(var3, var1.serverPacket0Length);
               class229.method4512();
               field105 = cycleCntr;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field822 == var1.serverPacket0) {
               class3.updateNpcs(false, var3);
               var1.serverPacket0 = null;
               return true;
            }

            WidgetGroupParent var22;
            if (ServerPacket.field871 == var1.serverPacket0) {
               var37 = var3.readInt();
               var6 = var3.readInt();
               WidgetGroupParent var48 = (WidgetGroupParent)widgetGroupParents.get((long)var6);
               var22 = (WidgetGroupParent)widgetGroupParents.get((long)var37);
               if (var22 != null) {
                  MenuAction.closeWidgetGroup(var22, var48 == null || var48.group != var22.group);
               }

               if (var48 != null) {
                  var48.remove();
                  widgetGroupParents.put(var48, (long)var37);
               }

               var15 = Huffman.getWidget(var6);
               if (var15 != null) {
                  class22.method295(var15);
               }

               var15 = Huffman.getWidget(var37);
               if (var15 != null) {
                  class22.method295(var15);
                  class39.revalidateWidgetScroll(Widget.widgets[var15.id >>> 16], var15, true);
               }

               if (rootWidgetGroup != -1) {
                  GrandExchangeEvents.method74(rootWidgetGroup, 1);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field813 == var1.serverPacket0) {
               var37 = var3.method72();
               var6 = var3.method66();
               var5 = var6 >> 10 & 31;
               var10 = var6 >> 5 & 31;
               var11 = var6 & 31;
               var12 = (var10 << 11) + (var5 << 19) + (var11 << 3);
               Widget var47 = Huffman.getWidget(var37);
               if (var12 != var47.color) {
                  var47.color = var12;
                  class22.method295(var47);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field828 == var1.serverPacket0) {
               var37 = var3.readUnsignedByte();
               var6 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var10 = var3.readUnsignedByte();
               field139[var37] = true;
               field141[var37] = var6;
               field142[var37] = var5;
               field143[var37] = var10;
               field144[var37] = 0;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field869 == var1.serverPacket0) {
               field138 = var3.readUnsignedByteNegate();
               publicChatMode = var3.readUnsignedByteNegate();
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field861 == var1.serverPacket0) {
               rebootTimer = var3.method43() * 30;
               field124 = cycleCntr;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field814 == var1.serverPacket0) {
               Canvas.field95 = var3.readUnsignedByteNegate();
               WorldMapSection3.field1089 = var3.readUnsignedByte();

               for (var37 = WorldMapSection3.field1089; var37 < WorldMapSection3.field1089 + 8; ++var37) {
                  for (var6 = Canvas.field95; var6 < Canvas.field95 + 8; ++var6) {
                     if (groundItems[SoundSystem.plane][var37][var6] != null) {
                        groundItems[SoundSystem.plane][var37][var6] = null;
                        TilePaint.updateItemPile(var37, var6);
                     }
                  }
               }

               for (class68 var45 = (class68)field214.last(); var45 != null; var45 = (class68)field214.previous()) {
                  if (var45.field913 >= WorldMapSection3.field1089 && var45.field913 < WorldMapSection3.field1089 + 8 && var45.field901 >= Canvas.field95 && var45.field901 < Canvas.field95 + 8 && var45.field911 == SoundSystem.plane) {
                     var45.field910 = 0;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field820 == var1.serverPacket0) {
               var37 = var3.method73();
               var6 = var3.method67();
               var8 = Huffman.getWidget(var37);
               if (var8.modelType != 1 || var6 != var8.modelId) {
                  var8.modelType = 1;
                  var8.modelId = var6;
                  class22.method295(var8);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field823 == var1.serverPacket0) {
               var37 = var3.readUnsignedByte();
               BufferedNetSocket.method3500(var37);
               var1.serverPacket0 = null;
               return true;
            }

            long var23;
            long var25;
            long var27;
            PlayerType var29;
            if (ServerPacket.field843 == var1.serverPacket0) {
               var21 = var3.readStringCp1252NullTerminated();
               var25 = var3.readLong();
               var27 = (long)var3.method43();
               var19 = (long)var3.readMedium();
               var29 = (PlayerType)ScriptFrame.findEnumerated(class48.method865(), var3.readUnsignedByte());
               var23 = (var27 << 32) + var19;
               boolean var53 = false;

               for (int var31 = 0; var31 < 100; ++var31) {
                  if (field152[var31] == var23) {
                     var53 = true;
                     break;
                  }
               }

               if (var29.isUser && WorldMapArea.friendSystem.isIgnored(new Username(var21, KeyHandler.loginType))) {
                  var53 = true;
               }

               if (!var53 && field208 == 0) {
                  field152[field156] = var23;
                  field156 = (field156 + 1) % 100;
                  String var55 = AbstractFont.escapeBrackets(class233.method4527(KitDefinition.method4866(var3)));
                  if (var29.modIcon != -1) {
                     GrandExchangeEvents.addChatMessage(9, ItemContainer.method1170(var29.modIcon) + var21, var55, Clock.method3534(var25));
                  } else {
                     GrandExchangeEvents.addChatMessage(9, var21, var55, Clock.method3534(var25));
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field831 == var1.serverPacket0) {
               class16.method189(class190.field2342);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field808 == var1.serverPacket0) {
               var37 = var3.readInt();
               var4 = var3.readStringCp1252NullTerminated();
               var8 = Huffman.getWidget(var37);
               if (!var4.equals(var8.text)) {
                  var8.text = var4;
                  class22.method295(var8);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field840 == var1.serverPacket0) {
               class50.loadRegions(true, var1.packetBuffer);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field791 == var1.serverPacket0) {
               isCameraLocked = false;

               for (var37 = 0; var37 < 5; ++var37) {
                  field139[var37] = false;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field872 == var1.serverPacket0) {
               isCameraLocked = true;
               GrandExchangeOffer.field376 = var3.readUnsignedByte();
               KeyHandler.field445 = var3.readUnsignedByte();
               IndexStoreAction.field410 = var3.method43();
               VertexNormal.field946 = var3.readUnsignedByte();
               class171.field1116 = var3.readUnsignedByte();
               if (class171.field1116 >= 100) {
                  var37 = GrandExchangeOffer.field376 * 128 + 64;
                  var6 = KeyHandler.field445 * 128 + 64;
                  var5 = class32.getTileHeight(var37, var6, SoundSystem.plane) - IndexStoreAction.field410;
                  var10 = var37 - WorldMapSection1.cameraX;
                  var11 = var5 - GrandExchangeEvents.cameraY;
                  var12 = var6 - class11.cameraZ;
                  var13 = (int)Math.sqrt((double)(var12 * var12 + var10 * var10));
                  WorldMapIcon1.cameraPitch = (int)(Math.atan2((double)var11, (double)var13) * 325.949D) & 2047;
                  MusicPatchNode.cameraYaw = (int)(Math.atan2((double)var10, (double)var12) * -325.949D) & 2047;
                  if (WorldMapIcon1.cameraPitch < 128) {
                     WorldMapIcon1.cameraPitch = 128;
                  }

                  if (WorldMapIcon1.cameraPitch > 383) {
                     WorldMapIcon1.cameraPitch = 383;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field865 == var1.serverPacket0) {
               var37 = var3.method73();
               var6 = var3.method67();
               var8 = Huffman.getWidget(var37);
               if (var8 != null && var8.type == 0) {
                  if (var6 > var8.scrollHeight - var8.height) {
                     var6 = var8.scrollHeight - var8.height;
                  }

                  if (var6 < 0) {
                     var6 = 0;
                  }

                  if (var6 != var8.scrollY) {
                     var8.scrollY = var6;
                     class22.method295(var8);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field835 == var1.serverPacket0) {
               var37 = var3.method65();
               Script.method2216(var37);
               field116[++field117 - 1 & 31] = var37 & 32767;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field846 == var1.serverPacket0) {
               var3.index += 28;
               if (var3.method54()) {
                  class234.method4535(var3, var3.index - 28);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field811 == var1.serverPacket0) {
               class12.method159();
               var37 = var3.method71();
               var6 = var3.readUnsignedByteNegate();
               var5 = var3.readUnsignedByte();
               experience[var6] = var37;
               currentLevels[var6] = var5;
               levels[var6] = 1;

               for (var10 = 0; var10 < 98; ++var10) {
                  if (var37 >= Skills.Skills_experienceTable[var10]) {
                     levels[var6] = var10 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var6;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field858 == var1.serverPacket0) {
               var37 = var3.readInt();
               var6 = var3.readInt();
               var5 = DynamicObject.method2222();
               PacketBufferNode var56 = Interpreter.method1915(ClientPacket.field233, packetWriter.isaacCipher);
               var56.packetBuffer.method56(var5);
               var56.packetBuffer.writeByte(GameShell.fps);
               var56.packetBuffer.writeIntME(var37);
               var56.packetBuffer.writeIntLE(var6);
               packetWriter.method241(var56);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field860 == var1.serverPacket0) {
               class12.method159();
               weight = var3.method44();
               field124 = cycleCntr;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field816 == var1.serverPacket0) {
               var18 = var3.readUnsignedByte() == 1;
               if (var18) {
                  class15.field1113 = class203.currentTimeMs() - var3.readLong();
                  FloorDecoration.grandExchangeEvents = new GrandExchangeEvents(var3, true);
               } else {
                  FloorDecoration.grandExchangeEvents = null;
               }

               field154 = cycleCntr;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field818 == var1.serverPacket0) {
               WorldMapArea.friendSystem.method100();
               field105 = cycleCntr;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field807 == var1.serverPacket0) {
               byte[] var54 = new byte[var1.serverPacket0Length];
               var3.method237(var54, 0, var54.length);
               Buffer var52 = new Buffer(var54);
               var17 = var52.readStringCp1252NullTerminated();
               WorldMapCacheName.method635(var17, true, false);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field800 == var1.serverPacket0) {
               class16.method189(class190.field2352);
               var1.serverPacket0 = null;
               return true;
            }

            WidgetGroupParent var50;
            if (ServerPacket.field845 == var1.serverPacket0) {
               var37 = var3.index + var1.serverPacket0Length;
               var6 = var3.method43();
               var5 = var3.method43();
               if (var6 != rootWidgetGroup) {
                  rootWidgetGroup = var6;
                  this.method87(false);
                  DevicePcmPlayerProvider.method845(rootWidgetGroup);
                  WorldMapSection3.runWidgetOnLoadListener(rootWidgetGroup);

                  for (var10 = 0; var10 < 100; ++var10) {
                     field100[var10] = true;
                  }
               }

               for (; var5-- > 0; var50.keep = true) {
                  var10 = var3.readInt();
                  var11 = var3.method43();
                  var12 = var3.readUnsignedByte();
                  var50 = (WidgetGroupParent)widgetGroupParents.get((long)var10);
                  if (var50 != null && var11 != var50.group) {
                     MenuAction.closeWidgetGroup(var50, true);
                     var50 = null;
                  }

                  if (var50 == null) {
                     var50 = SecureRandomCallable.method1143(var10, var11, var12);
                  }
               }

               for (var22 = (WidgetGroupParent)widgetGroupParents.first(); var22 != null; var22 = (WidgetGroupParent)widgetGroupParents.next()) {
                  if (var22.keep) {
                     var22.keep = false;
                  } else {
                     MenuAction.closeWidgetGroup(var22, true);
                  }
               }

               widgetClickMasks = new NodeHashTable(512);

               while (var3.index < var37) {
                  var10 = var3.readInt();
                  var11 = var3.method43();
                  var12 = var3.method43();
                  var13 = var3.readInt();

                  for (int var51 = var11; var51 <= var12; ++var51) {
                     var23 = (long)var51 + ((long)var10 << 32);
                     widgetClickMasks.put(new IntegerNode(var13), var23);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field855 == var1.serverPacket0) {
               var37 = var3.method58();
               var6 = var3.method58();
               var17 = var3.readStringCp1252NullTerminated();
               if (var6 >= 1 && var6 <= 8) {
                  if (var17.equalsIgnoreCase("null")) {
                     var17 = null;
                  }

                  playerMenuActions[var6 - 1] = var17;
                  playerOptionsPriorities[var6 - 1] = var37 == 0;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field826 == var1.serverPacket0) {
               Clock.method3533(var3.readStringCp1252NullTerminated());
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field832 == var1.serverPacket0) {
               if (var1.serverPacket0Length == 0) {
                  PacketWriter.clanChat = null;
               } else {
                  if (PacketWriter.clanChat == null) {
                     PacketWriter.clanChat = new ClanChat(KeyHandler.loginType, TextureProvider.client);
                  }

                  PacketWriter.clanChat.readUpdate(var3);
               }

               UserComparator8.method3349();
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field793 == var1.serverPacket0) {
               var37 = var3.method43();
               var6 = var3.readInt();
               Varps.Varps_temp[var37] = var6;
               if (Varps.Varps_main[var37] != var6) {
                  Varps.Varps_main[var37] = var6;
               }

               IndexCache.method4703(var37);
               field121[++field123 - 1 & 31] = var37;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field795 == var1.serverPacket0) {
               class16.method189(class190.field2349);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field798 == var1.serverPacket0) {
               var37 = var3.readInt();
               var50 = (WidgetGroupParent)widgetGroupParents.get((long)var37);
               if (var50 != null) {
                  MenuAction.closeWidgetGroup(var50, true);
               }

               if (field127 != null) {
                  class22.method295(field127);
                  field127 = null;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field862 == var1.serverPacket0) {
               for (var37 = 0; var37 < Varps.Varps_main.length; ++var37) {
                  if (Varps.Varps_temp[var37] != Varps.Varps_main[var37]) {
                     Varps.Varps_main[var37] = Varps.Varps_temp[var37];
                     IndexCache.method4703(var37);
                     field121[++field123 - 1 & 31] = var37;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field847 == var1.serverPacket0) {
               WorldMapArea.friendSystem.method101(var3, var1.serverPacket0Length);
               field105 = cycleCntr;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field812 == var1.serverPacket0) {
               var37 = var3.method67();
               if (var37 == 65535) {
                  var37 = -1;
               }

               AbstractUserComparator.method5437(var37);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field829 == var1.serverPacket0) {
               var37 = var3.method70();
               var6 = var3.method66();
               if (var6 == 65535) {
                  var6 = -1;
               }

               HealthBar.method1994(var6, var37);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field866 == var1.serverPacket0) {
               var37 = var3.method58();
               var6 = var3.method72();
               var5 = var3.method67();
               var22 = (WidgetGroupParent)widgetGroupParents.get((long)var6);
               if (var22 != null) {
                  MenuAction.closeWidgetGroup(var22, var5 != var22.group);
               }

               SecureRandomCallable.method1143(var6, var5, var37);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field799 == var1.serverPacket0) {
               var21 = var3.readStringCp1252NullTerminated();
               var25 = (long)var3.method43();
               var27 = (long)var3.readMedium();
               var29 = (PlayerType)ScriptFrame.findEnumerated(class48.method865(), var3.readUnsignedByte());
               long var30 = (var25 << 32) + var27;
               boolean var32 = false;

               for (int var33 = 0; var33 < 100; ++var33) {
                  if (var30 == field152[var33]) {
                     var32 = true;
                     break;
                  }
               }

               if (WorldMapArea.friendSystem.isIgnored(new Username(var21, KeyHandler.loginType))) {
                  var32 = true;
               }

               if (!var32 && field208 == 0) {
                  field152[field156] = var30;
                  field156 = (field156 + 1) % 100;
                  String var57 = AbstractFont.escapeBrackets(class233.method4527(KitDefinition.method4866(var3)));
                  byte var34;
                  if (var29.isPrivileged) {
                     var34 = 7;
                  } else {
                     var34 = 3;
                  }

                  if (var29.modIcon != -1) {
                     WorldMapIcon1.method219(var34, ItemContainer.method1170(var29.modIcon) + var21, var57);
                  } else {
                     WorldMapIcon1.method219(var34, var21, var57);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field794 == var1.serverPacket0) {
               var37 = var3.readInt();
               if (var37 != field198) {
                  field198 = var37;
                  WorldMapArea.method428();
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field863 == var1.serverPacket0) {
               minimapState = var3.readUnsignedByte();
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerPacket.field827 == var1.serverPacket0) {
               var21 = var3.readStringCp1252NullTerminated();
               var4 = AbstractFont.escapeBrackets(class233.method4527(KitDefinition.method4866(var3)));
               WorldMapIcon1.method219(6, var21, var4);
               var1.serverPacket0 = null;
               return true;
            }

            NPCDefinition.sendStackTrace("" + (var1.serverPacket0 != null ? var1.serverPacket0.id : -1) + "," + (var1.field677 != null ? var1.field677.id : -1) + "," + (var1.field678 != null ? var1.field678.id : -1) + "," + var1.serverPacket0Length, (Throwable)null);
            TextureProvider.method2773();
         } catch (IOException var35) {
            class48.method868();
         } catch (Exception var36) {
            var4 = "" + (var1.serverPacket0 != null ? var1.serverPacket0.id : -1) + "," + (var1.field677 != null ? var1.field677.id : -1) + "," + (var1.field678 != null ? var1.field678.id : -1) + "," + var1.serverPacket0Length + "," + (Canvas.localPlayer.pathX[0] + class50.baseX) + "," + (Canvas.localPlayer.pathY[0] + GraphicsObject.baseY) + ",";

            for (var5 = 0; var5 < var1.serverPacket0Length && var5 < 50; ++var5) {
               var4 = var4 + var3.array[var5] + ",";
            }

            NPCDefinition.sendStackTrace(var4, var36);
            TextureProvider.method2773();
         }

         return true;
      }
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-387903382"
   )
   final void method86() {
      boolean var1 = false;

      int var2;
      int var3;
      while (!var1) {
         var1 = true;

         for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
            if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
               String var4 = menuTargetNames[var2];
               menuTargetNames[var2] = menuTargetNames[var2 + 1];
               menuTargetNames[var2 + 1] = var4;
               String var5 = menuActions[var2];
               menuActions[var2] = menuActions[var2 + 1];
               menuActions[var2 + 1] = var5;
               var3 = menuOpcodes[var2];
               menuOpcodes[var2] = menuOpcodes[var2 + 1];
               menuOpcodes[var2 + 1] = var3;
               var3 = menuArguments1[var2];
               menuArguments1[var2] = menuArguments1[var2 + 1];
               menuArguments1[var2 + 1] = var3;
               var3 = menuArguments2[var2];
               menuArguments2[var2] = menuArguments2[var2 + 1];
               menuArguments2[var2 + 1] = var3;
               var3 = menuArguments0[var2];
               menuArguments0[var2] = menuArguments0[var2 + 1];
               menuArguments0[var2 + 1] = var3;
               boolean var6 = menuShiftClick[var2];
               menuShiftClick[var2] = menuShiftClick[var2 + 1];
               menuShiftClick[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if (DevicePcmPlayerProvider.dragInventoryWidget == null && clickedWidget == null) {
         int var12 = MouseHandler.MouseHandler_lastButton;
         int var7;
         int var11;
         int var13;
         if (isMenuOpen) {
            int var14;
            if (var12 != 1 && (AbstractRasterProvider.mouseCam || var12 != 4)) {
               var2 = MouseHandler.MouseHandler_x;
               var14 = MouseHandler.MouseHandler_y;
               if (var2 < class25.menuX - 10 || var2 > class25.menuX + class214.menuWidth + 10 || var14 < GameShell.menuY - 10 || var14 > AbstractWorldMapIcon.menuHeight + GameShell.menuY + 10) {
                  isMenuOpen = false;
                  Players.method2112(class25.menuX, GameShell.menuY, class214.menuWidth, AbstractWorldMapIcon.menuHeight);
               }
            }

            if (var12 == 1 || !AbstractRasterProvider.mouseCam && var12 == 4) {
               var2 = class25.menuX;
               var14 = GameShell.menuY;
               var7 = class214.menuWidth;
               var3 = MouseHandler.MouseHandler_lastPressedX;
               var11 = MouseHandler.MouseHandler_lastPressedY;
               int var15 = -1;

               for (int var16 = 0; var16 < menuOptionsCount; ++var16) {
                  var13 = (menuOptionsCount - 1 - var16) * 15 + var14 + 31;
                  if (var3 > var2 && var3 < var7 + var2 && var11 > var13 - 13 && var11 < var13 + 3) {
                     var15 = var16;
                  }
               }

               if (var15 != -1) {
                  WorldMapSection0.method245(var15);
               }

               isMenuOpen = false;
               Players.method2112(class25.menuX, GameShell.menuY, class214.menuWidth, AbstractWorldMapIcon.menuHeight);
            }
         } else {
            var2 = menuOptionsCount - 1;
            if ((var12 == 1 || !AbstractRasterProvider.mouseCam && var12 == 4) && var2 >= 0) {
               var7 = menuOpcodes[var2];
               if (var7 == 39 || var7 == 40 || var7 == 41 || var7 == 42 || var7 == 43 || var7 == 33 || var7 == 34 || var7 == 35 || var7 == 36 || var7 == 37 || var7 == 38 || var7 == 1005) {
                  label223: {
                     var3 = menuArguments1[var2];
                     var11 = menuArguments2[var2];
                     Widget var8 = Huffman.getWidget(var11);
                     var13 = class1.getWidgetClickMask(var8);
                     boolean var9 = (var13 >> 28 & 1) != 0;
                     if (!var9) {
                        Object var10 = null;
                        if (!class168.method3461(class1.getWidgetClickMask(var8))) {
                           break label223;
                        }
                     }

                     if (DevicePcmPlayerProvider.dragInventoryWidget != null && !field207 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
                        var12 = field205;
                        var13 = field206;
                        class231.processTempMenuAction(UnitPriceComparator.tempMenuAction, var12, var13);
                        UnitPriceComparator.tempMenuAction = null;
                     }

                     field207 = false;
                     itemDragDuration = 0;
                     if (DevicePcmPlayerProvider.dragInventoryWidget != null) {
                        class22.method295(DevicePcmPlayerProvider.dragInventoryWidget);
                     }

                     DevicePcmPlayerProvider.dragInventoryWidget = Huffman.getWidget(var11);
                     dragItemSlotSource = var3;
                     field205 = MouseHandler.MouseHandler_lastPressedX;
                     field206 = MouseHandler.MouseHandler_lastPressedY;
                     if (var2 >= 0) {
                        UnitPriceComparator.tempMenuAction = new MenuAction();
                        UnitPriceComparator.tempMenuAction.argument1 = menuArguments1[var2];
                        UnitPriceComparator.tempMenuAction.argument2 = menuArguments2[var2];
                        UnitPriceComparator.tempMenuAction.opcode = menuOpcodes[var2];
                        UnitPriceComparator.tempMenuAction.argument0 = menuArguments0[var2];
                        UnitPriceComparator.tempMenuAction.action = menuActions[var2];
                     }

                     class22.method295(DevicePcmPlayerProvider.dragInventoryWidget);
                     return;
                  }
               }
            }

            if ((var12 == 1 || !AbstractRasterProvider.mouseCam && var12 == 4) && this.shouldLeftClickOpenMenu()) {
               var12 = 2;
            }

            if ((var12 == 1 || !AbstractRasterProvider.mouseCam && var12 == 4) && menuOptionsCount > 0) {
               WorldMapSection0.method245(var2);
            }

            if (var12 == 2 && menuOptionsCount > 0) {
               this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
            }
         }

      }
   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "109"
   )
   @Export("shouldLeftClickOpenMenu")
   final boolean shouldLeftClickOpenMenu() {
      int var1 = menuOptionsCount - 1;
      return (field215 == 1 && menuOptionsCount > 2 || UserComparator7.method3364(var1)) && !menuShiftClick[var1];
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "1"
   )
   @Export("openMenu")
   final void openMenu(int var1, int var2) {
      int var3 = class2.fontBold12.stringWidth("Choose Option");

      int var4;
      for (var4 = 0; var4 < menuOptionsCount; ++var4) {
         Font var5 = class2.fontBold12;
         String var6;
         if (var4 < 0) {
            var6 = "";
         } else if (menuTargetNames[var4].length() > 0) {
            var6 = menuActions[var4] + " " + menuTargetNames[var4];
         } else {
            var6 = menuActions[var4];
         }

         int var7 = var5.stringWidth(var6);
         if (var7 > var3) {
            var3 = var7;
         }
      }

      var3 += 8;
      var4 = menuOptionsCount * 15 + 22;
      int var8 = var1 - var3 / 2;
      if (var3 + var8 > SoundCache.canvasWidth) {
         var8 = SoundCache.canvasWidth - var3;
      }

      if (var8 < 0) {
         var8 = 0;
      }

      int var9 = var2;
      if (var4 + var2 > Huffman.canvasHeight) {
         var9 = Huffman.canvasHeight - var4;
      }

      if (var9 < 0) {
         var9 = 0;
      }

      class25.menuX = var8;
      GameShell.menuY = var9;
      class214.menuWidth = var3;
      AbstractWorldMapIcon.menuHeight = menuOptionsCount * 15 + 22;
      class65.scene.menuOpen(SoundSystem.plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-271438207"
   )
   final void method87(boolean var1) {
      int var2 = rootWidgetGroup;
      int var3 = SoundCache.canvasWidth;
      int var4 = Huffman.canvasHeight;
      if (GroundItemPile.loadWidgetGroup(var2)) {
         WorldMapRegion.notRevalidateWidgetScroll(Widget.widgets[var2], -1, var3, var4, var1);
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(Lho;B)V",
      garbageValue = "0"
   )
   @Export("alignWidget")
   void alignWidget(Widget var1) {
      Widget var2 = var1.parentId == -1 ? null : Huffman.getWidget(var1.parentId);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = SoundCache.canvasWidth;
         var4 = Huffman.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      WorldMapSection3.alignWidgetSize(var1, var3, var4, false);
      OverlayDefinition.alignWidgetPosition(var1, var3, var4);
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "715978124"
   )
   final void method88() {
      class22.method295(clickedWidget);
      ++MouseRecorder.widgetDragDuration;
      if (field103 && field106) {
         int var1 = MouseHandler.MouseHandler_x;
         int var2 = MouseHandler.MouseHandler_y;
         var1 -= widgetClickX;
         var2 -= widgetClickY;
         if (var1 < field108) {
            var1 = field108;
         }

         if (var1 + clickedWidget.width > field108 + clickedWidgetParent.width) {
            var1 = field108 + clickedWidgetParent.width - clickedWidget.width;
         }

         if (var2 < field109) {
            var2 = field109;
         }

         if (var2 + clickedWidget.height > field109 + clickedWidgetParent.height) {
            var2 = field109 + clickedWidgetParent.height - clickedWidget.height;
         }

         int var3 = var1 - field110;
         int var4 = var2 - field111;
         int var5 = clickedWidget.dragZoneSize;
         if (MouseRecorder.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            isDraggingWidget = true;
         }

         int var6 = var1 - field108 + clickedWidgetParent.scrollX;
         int var7 = var2 - field109 + clickedWidgetParent.scrollY;
         ScriptEvent var8;
         if (clickedWidget.onDrag != null && isDraggingWidget) {
            var8 = new ScriptEvent();
            var8.widget = clickedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.args0 = clickedWidget.onDrag;
            AbstractIndexCache.runScript(var8);
         }

         if (MouseHandler.MouseHandler_currentButton == 0) {
            int var10;
            if (isDraggingWidget) {
               if (clickedWidget.onDragComplete != null) {
                  var8 = new ScriptEvent();
                  var8.widget = clickedWidget;
                  var8.mouseX = var6;
                  var8.mouseY = var7;
                  var8.dragTarget = draggedOnWidget;
                  var8.args0 = clickedWidget.onDragComplete;
                  AbstractIndexCache.runScript(var8);
               }

               if (draggedOnWidget != null) {
                  Widget var13 = clickedWidget;
                  var10 = WorldMapRegion.method568(class1.getWidgetClickMask(var13));
                  Widget var11;
                  if (var10 == 0) {
                     var11 = null;
                  } else {
                     label100: {
                        for (int var12 = 0; var12 < var10; ++var12) {
                           var13 = Huffman.getWidget(var13.parentId);
                           if (var13 == null) {
                              var11 = null;
                              break label100;
                           }
                        }

                        var11 = var13;
                     }
                  }

                  if (var11 != null) {
                     PacketBufferNode var14 = Interpreter.method1915(ClientPacket.field279, packetWriter.isaacCipher);
                     var14.packetBuffer.method63(clickedWidget.childIndex);
                     var14.packetBuffer.method63(draggedOnWidget.itemId);
                     var14.packetBuffer.writeShort(draggedOnWidget.childIndex);
                     var14.packetBuffer.writeIntLE(clickedWidget.id);
                     var14.packetBuffer.writeIntME(draggedOnWidget.id);
                     var14.packetBuffer.writeShort(clickedWidget.itemId);
                     packetWriter.method241(var14);
                  }
               }
            } else if (this.shouldLeftClickOpenMenu()) {
               this.openMenu(field110 + widgetClickX, field111 + widgetClickY);
            } else if (menuOptionsCount > 0) {
               int var9 = widgetClickX + field110;
               var10 = widgetClickY + field111;
               class231.processTempMenuAction(UnitPriceComparator.tempMenuAction, var9, var10);
               UnitPriceComparator.tempMenuAction = null;
            }

            clickedWidget = null;
         }
      } else if (MouseRecorder.widgetDragDuration > 1) {
         clickedWidget = null;
      }

   }

   @ObfuscatedName("kr")
   @ObfuscatedSignature(
      signature = "(B)Lkp;",
      garbageValue = "-87"
   )
   @Export("username")
   public Username username() {
      return Canvas.localPlayer != null ? Canvas.localPlayer.username : null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "-1464358697"
   )
   @Export("hashString")
   public static int hashString(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + HealthBar.charToByteCp1252(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)I",
      garbageValue = "0"
   )
   public static int method1692(String var0) {
      return var0.length() + 2;
   }

   static {
      field161 = true;
      worldId = 1;
      worldProperties = 0;
      gameBuild = 0;
      isMembersWorld = false;
      isLowDetail = false;
      language = 0;
      clientType = -1;
      field162 = false;
      gameState = 0;
      isLoading = true;
      cycle = 0;
      mouseLastLastPressedTimeMillis = 1L;
      field163 = -1;
      field164 = -1;
      field165 = -1L;
      field166 = true;
      displayFps = false;
      rebootTimer = 0;
      hintArrowType = 0;
      hintArrowNpcIndex = 0;
      hintArrowPlayerIndex = 0;
      hintArrowX = 0;
      hintArrowY = 0;
      hintArrowHeight = 0;
      hintArrowSubX = 0;
      hintArrowSubY = 0;
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      titleLoadingStage = 0;
      js5ConnectState = 0;
      field167 = 0;
      js5Errors = 0;
      loginState = 0;
      field168 = 0;
      field169 = 0;
      field170 = 0;
      field658 = class159.field1985;
      Login_isUsernameRemembered = false;
      secureRandomFuture = new SecureRandomFuture();
      field172 = null;
      npcs = new NPC[32768];
      npcCount = 0;
      npcIndices = new int[32768];
      field173 = 0;
      field174 = new int[250];
      packetWriter = new PacketWriter();
      field175 = 0;
      field176 = false;
      useBufferedSocket = true;
      timer = new Timer();
      fontsMap = new HashMap();
      field177 = 0;
      field178 = 1;
      field179 = 0;
      field180 = 1;
      field181 = 0;
      collisionMaps = new CollisionMap[4];
      isInInstance = false;
      instanceChunkTemplates = new int[4][13][13];
      field182 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field183 = 0;
      field184 = 2301979;
      field185 = 5063219;
      field186 = 3353893;
      field187 = 7759444;
      field188 = false;
      field189 = 0;
      cameraPitchTarget = 128;
      minimapOrientation = 0;
      field190 = 0;
      field191 = 0;
      field192 = 0;
      field193 = 0;
      oculusOrbState = 0;
      cameraFollowHeight = 50;
      field194 = 0;
      field195 = 0;
      field196 = 0;
      oculusOrbNormalSpeed = 12;
      field197 = 6;
      field198 = 0;
      field199 = false;
      field200 = 0;
      field201 = false;
      field202 = 0;
      overheadTextCount = 0;
      overheadTextLimit = 50;
      overheadTextXs = new int[overheadTextLimit];
      overheadTextYs = new int[overheadTextLimit];
      overheadTextAscents = new int[overheadTextLimit];
      overheadTextXOffsets = new int[overheadTextLimit];
      overheadTextColors = new int[overheadTextLimit];
      overheadTextEffects = new int[overheadTextLimit];
      overheadTextCyclesRemaining = new int[overheadTextLimit];
      overheadText = new String[overheadTextLimit];
      tileLastDrawnActor = new int[104][104];
      viewportDrawCount = 0;
      viewportTempX = -1;
      viewportTempY = -1;
      mouseCrossX = 0;
      mouseCrossY = 0;
      mouseCrossState = 0;
      mouseCrossColor = 0;
      showMouseCross = true;
      field203 = 0;
      field204 = 0;
      dragItemSlotSource = 0;
      field205 = 0;
      field206 = 0;
      dragItemSlotDestination = 0;
      field207 = false;
      itemDragDuration = 0;
      field208 = 0;
      showLoadingMessages = true;
      players = new Player[2048];
      localPlayerIndex = -1;
      field209 = 0;
      renderSelf = true;
      field210 = 0;
      field211 = 0;
      field212 = new int[1000];
      playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerMenuActions = new String[8];
      playerOptionsPriorities = new boolean[8];
      field213 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      combatTargetPlayerIndex = -1;
      groundItems = new NodeDeque[4][104][104];
      field214 = new NodeDeque();
      projectiles = new NodeDeque();
      graphicsObjects = new NodeDeque();
      currentLevels = new int[25];
      levels = new int[25];
      experience = new int[25];
      field215 = 0;
      isMenuOpen = false;
      menuOptionsCount = 0;
      menuArguments1 = new int[500];
      menuArguments2 = new int[500];
      menuOpcodes = new int[500];
      menuArguments0 = new int[500];
      menuActions = new String[500];
      menuTargetNames = new String[500];
      menuShiftClick = new boolean[500];
      followerOpsLowPriority = false;
      shiftClickDrop = false;
      tapToDrop = false;
      showMouseOverText = true;
      field216 = -1;
      field217 = -1;
      field218 = 0;
      field219 = 50;
      isItemSelected = 0;
      selectedItemName = null;
      isSpellSelected = false;
      field220 = -1;
      field157 = -1;
      selectedSpellActionName = null;
      selectedSpellName = null;
      rootWidgetGroup = -1;
      widgetGroupParents = new NodeHashTable(8);
      field151 = 0;
      field153 = -1;
      chatEffects = 0;
      field136 = 0;
      field127 = null;
      runEnergy = 0;
      weight = 0;
      rights = 0;
      followerIndex = -1;
      field155 = false;
      viewportWidget = null;
      clickedWidget = null;
      clickedWidgetParent = null;
      widgetClickX = 0;
      widgetClickY = 0;
      draggedOnWidget = null;
      field106 = false;
      field108 = -1;
      field109 = -1;
      field103 = false;
      field110 = -1;
      field111 = -1;
      isDraggingWidget = false;
      cycleCntr = 1;
      field121 = new int[32];
      field123 = 0;
      field116 = new int[32];
      field117 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      chatCycle = 0;
      field105 = 0;
      field129 = 0;
      field122 = 0;
      field154 = 0;
      field124 = 0;
      mouseWheelRotation = 0;
      scriptEvents = new NodeDeque();
      field147 = new NodeDeque();
      field148 = new NodeDeque();
      widgetClickMasks = new NodeHashTable(512);
      rootWidgetCount = 0;
      field98 = -2;
      field100 = new boolean[100];
      field102 = new boolean[100];
      field101 = new boolean[100];
      rootWidgetXs = new int[100];
      rootWidgetYs = new int[100];
      rootWidgetWidths = new int[100];
      rootWidgetHeights = new int[100];
      gameDrawingMode = 0;
      field99 = 0L;
      isResizable = true;
      field160 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      field138 = 0;
      field158 = "";
      field152 = new long[100];
      field156 = 0;
      field137 = 0;
      field146 = new int[128];
      field145 = new int[128];
      field126 = -1L;
      field125 = -1;
      mapIconCount = 0;
      mapIconXs = new int[1000];
      mapIconYs = new int[1000];
      mapIcons = new Sprite[1000];
      destinationX = 0;
      destinationY = 0;
      minimapState = 0;
      field128 = 255;
      field112 = -1;
      field107 = false;
      soundEffectVolume = 127;
      field115 = 127;
      soundEffectCount = 0;
      soundEffectIds = new int[50];
      queuedSoundEffectLoops = new int[50];
      queuedSoundEffectDelays = new int[50];
      soundLocations = new int[50];
      soundEffects = new SoundEffect[50];
      isCameraLocked = false;
      field139 = new boolean[5];
      field141 = new int[5];
      field142 = new int[5];
      field143 = new int[5];
      field144 = new int[5];
      field130 = 256;
      field131 = 205;
      field150 = 256;
      field149 = 320;
      field135 = 1;
      field134 = 32767;
      field132 = 1;
      field133 = 32767;
      viewportOffsetX = 0;
      viewportOffsetY = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      viewportZoom = 0;
      field119 = new PlayerAppearance();
      field118 = -1;
      field120 = -1;
      platformInfoProvider = new DesktopPlatformInfoProvider();
      grandExchangeOffers = new GrandExchangeOffer[8];
      field159 = new OwnWorldComparator();
      field104 = -1;
      indexCacheLoaders = new ArrayList(10);
      indexCacheLoaderIndex = 0;
      field140 = 0;
      field895 = new class65();
      field113 = new int[50];
      field114 = new int[50];
   }
}
