import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
   @ObfuscatedName("nj")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("clickedWidget")
   static Widget clickedWidget;
   @ObfuscatedName("oy")
   @ObfuscatedGetter(
      intValue = -2130667967
   )
   static int field868;
   @ObfuscatedName("of")
   @ObfuscatedGetter(
      intValue = 1098573147
   )
   @Export("rootWidgetCount")
   static int rootWidgetCount;
   @ObfuscatedName("ot")
   @ObfuscatedGetter(
      longValue = 2641813586690994541L
   )
   static long field938;
   @ObfuscatedName("ok")
   static boolean[] field816;
   @ObfuscatedName("oq")
   static boolean[] field871;
   @ObfuscatedName("ou")
   static boolean[] field827;
   @ObfuscatedName("no")
   static boolean field754;
   @ObfuscatedName("na")
   @ObfuscatedGetter(
      intValue = -1143946983
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("pz")
   @Export("isResizable")
   static boolean isResizable;
   @ObfuscatedName("ob")
   @ObfuscatedGetter(
      intValue = -1002353487
   )
   static int field857;
   @ObfuscatedName("sw")
   @ObfuscatedGetter(
      intValue = 1717158947
   )
   public static int field674;
   @ObfuscatedName("nf")
   static boolean field912;
   @ObfuscatedName("qy")
   static boolean field899;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -1921114135
   )
   @Export("widgetClickX")
   static int widgetClickX;
   @ObfuscatedName("ni")
   @ObfuscatedGetter(
      intValue = -1056488497
   )
   @Export("widgetClickY")
   static int widgetClickY;
   @ObfuscatedName("nx")
   @ObfuscatedGetter(
      intValue = -1709629427
   )
   static int field714;
   @ObfuscatedName("oh")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("widgetFlags")
   static NodeHashTable widgetFlags;
   @ObfuscatedName("nc")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("clickedWidgetParent")
   static Widget clickedWidgetParent;
   @ObfuscatedName("oz")
   @Export("rootWidgetXs")
   static int[] rootWidgetXs;
   @ObfuscatedName("ox")
   @Export("rootWidgetWidths")
   static int[] rootWidgetWidths;
   @ObfuscatedName("nb")
   @ObfuscatedGetter(
      intValue = 1241551415
   )
   static int field844;
   @ObfuscatedName("nk")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("viewportWidget")
   static Widget viewportWidget;
   @ObfuscatedName("oo")
   @ObfuscatedGetter(
      intValue = -129717857
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("on")
   @Export("rootWidgetHeights")
   static int[] rootWidgetHeights;
   @ObfuscatedName("mz")
   @ObfuscatedGetter(
      intValue = -852505975
   )
   @Export("staffModLevel")
   static int staffModLevel;
   @ObfuscatedName("oj")
   @Export("rootWidgetYs")
   static int[] rootWidgetYs;
   @ObfuscatedName("to")
   static int[] field708;
   @ObfuscatedName("tl")
   static int[] field859;
   @ObfuscatedName("tz")
   @ObfuscatedSignature(
      descriptor = "Lba;"
   )
   static final ApproximateRouteStrategy field935;
   @ObfuscatedName("oi")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("scriptEvents")
   static NodeDeque scriptEvents;
   @ObfuscatedName("nr")
   @ObfuscatedGetter(
      intValue = 2048797241
   )
   static int field784;
   @ObfuscatedName("ns")
   @ObfuscatedGetter(
      intValue = -1047647049
   )
   static int field847;
   @ObfuscatedName("ql")
   @Export("isCameraLocked")
   static boolean isCameraLocked;
   @ObfuscatedName("nh")
   @Export("changedVarps")
   static int[] changedVarps;
   @ObfuscatedName("np")
   @ObfuscatedGetter(
      intValue = -982241293
   )
   @Export("changedVarpCount")
   static int changedVarpCount;
   @ObfuscatedName("nq")
   @Export("isDraggingWidget")
   static boolean isDraggingWidget;
   @ObfuscatedName("qb")
   @ObfuscatedGetter(
      intValue = -1138448215
   )
   @Export("soundEffectCount")
   static int soundEffectCount;
   @ObfuscatedName("qz")
   @Export("soundEffectIds")
   static int[] soundEffectIds;
   @ObfuscatedName("mx")
   @ObfuscatedGetter(
      intValue = 1334358693
   )
   @Export("runEnergy")
   static int runEnergy;
   @ObfuscatedName("my")
   @ObfuscatedGetter(
      intValue = 395200187
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("qg")
   @Export("queuedSoundEffectLoops")
   static int[] queuedSoundEffectLoops;
   @ObfuscatedName("qt")
   @Export("queuedSoundEffectDelays")
   static int[] queuedSoundEffectDelays;
   @ObfuscatedName("qh")
   @ObfuscatedSignature(
      descriptor = "[Ldb;"
   )
   @Export("soundEffects")
   static SoundEffect[] soundEffects;
   @ObfuscatedName("ow")
   @ObfuscatedGetter(
      intValue = -1484403107
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("qa")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("sn")
   @ObfuscatedGetter(
      intValue = 1721716287
   )
   static int field850;
   @ObfuscatedName("sq")
   @ObfuscatedSignature(
      descriptor = "Lhu;"
   )
   @Export("playerAppearance")
   static PlayerComposition playerComposition;
   @ObfuscatedName("sp")
   @ObfuscatedGetter(
      intValue = 1981759353
   )
   static int field927;
   @ObfuscatedName("nv")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("rj")
   static boolean[] field907;
   @ObfuscatedName("rp")
   static int[] field908;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = 219093963
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("re")
   static int[] field909;
   @ObfuscatedName("qc")
   @ObfuscatedGetter(
      intValue = 398494491
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("sd")
   @Export("archiveLoaders")
   static ArrayList archiveLoaders;
   @ObfuscatedName("mh")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("meslayerContinueWidget")
   static Widget meslayerContinueWidget;
   @ObfuscatedName("rm")
   static int[] field799;
   @ObfuscatedName("ss")
   @ObfuscatedGetter(
      intValue = -1667351587
   )
   @Export("archiveLoadersDone")
   static int archiveLoadersDone;
   @ObfuscatedName("rc")
   static int[] field911;
   @ObfuscatedName("qx")
   @ObfuscatedGetter(
      intValue = 427449579
   )
   @Export("minimapState")
   static int minimapState;
   @ObfuscatedName("ms")
   @ObfuscatedGetter(
      intValue = 1924848015
   )
   @Export("chatEffects")
   static int chatEffects;
   @ObfuscatedName("mq")
   @ObfuscatedGetter(
      intValue = 588534727
   )
   static int field829;
   @ObfuscatedName("pf")
   @ObfuscatedGetter(
      intValue = -1767216407
   )
   static int field889;
   @ObfuscatedName("pj")
   @ObfuscatedGetter(
      longValue = -941531037774167647L
   )
   static long field888;
   @ObfuscatedName("mo")
   @ObfuscatedGetter(
      intValue = -316896937
   )
   @Export("followerIndex")
   static int followerIndex;
   @ObfuscatedName("sj")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   @Export("platformInfoProvider")
   static PlatformInfoProvider platformInfoProvider;
   @ObfuscatedName("ov")
   @ObfuscatedGetter(
      intValue = -245289527
   )
   static int field861;
   @ObfuscatedName("nm")
   @Export("changedItemContainers")
   static int[] changedItemContainers;
   @ObfuscatedName("ps")
   @ObfuscatedGetter(
      intValue = -1917805707
   )
   @Export("mapIconCount")
   static int mapIconCount;
   @ObfuscatedName("nu")
   @ObfuscatedGetter(
      intValue = -1661094869
   )
   static int field870;
   @ObfuscatedName("ra")
   static short field779;
   @ObfuscatedName("ru")
   static short field913;
   @ObfuscatedName("rn")
   static short field918;
   @ObfuscatedName("qd")
   @ObfuscatedGetter(
      intValue = -1030278911
   )
   @Export("currentTrackGroupId")
   static int currentTrackGroupId;
   @ObfuscatedName("ry")
   static short field846;
   @ObfuscatedName("pn")
   @Export("mapIconXs")
   static int[] mapIconXs;
   @ObfuscatedName("rt")
   static short field690;
   @ObfuscatedName("sa")
   @ObfuscatedGetter(
      intValue = -2031812647
   )
   @Export("viewportZoom")
   static int viewportZoom;
   @ObfuscatedName("rf")
   static short field916;
   @ObfuscatedName("ro")
   @ObfuscatedGetter(
      intValue = -841535669
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("so")
   @ObfuscatedGetter(
      intValue = 1712073895
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("pd")
   @Export("mapIconYs")
   static int[] mapIconYs;
   @ObfuscatedName("qi")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("mapIcons")
   static SpritePixels[] mapIcons;
   @ObfuscatedName("rx")
   @ObfuscatedGetter(
      intValue = 817591115
   )
   @Export("viewportOffsetX")
   static int viewportOffsetX;
   @ObfuscatedName("rr")
   @ObfuscatedGetter(
      intValue = -748247727
   )
   @Export("viewportOffsetY")
   static int viewportOffsetY;
   @ObfuscatedName("rs")
   @Export("zoomHeight")
   static short zoomHeight;
   @ObfuscatedName("rw")
   @Export("zoomWidth")
   static short zoomWidth;
   @ObfuscatedName("pr")
   @ObfuscatedGetter(
      intValue = 1987074699
   )
   static int field885;
   @ObfuscatedName("sk")
   @ObfuscatedGetter(
      intValue = -321864807
   )
   static int field934;
   @ObfuscatedName("py")
   static long[] field883;
   @ObfuscatedName("pb")
   static int[] field738;
   @ObfuscatedName("pk")
   static int[] field886;
   @ObfuscatedName("om")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   static NodeDeque field660;
   @ObfuscatedName("or")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   static NodeDeque field865;
   @ObfuscatedName("os")
   @ObfuscatedGetter(
      intValue = 337640139
   )
   static int field858;
   @ObfuscatedName("pa")
   @ObfuscatedGetter(
      intValue = 1218379241
   )
   static int field884;
   @ObfuscatedName("pg")
   @ObfuscatedGetter(
      intValue = 654875049
   )
   @Export("tradeChatMode")
   static int tradeChatMode;
   @ObfuscatedName("pp")
   @ObfuscatedGetter(
      intValue = -455870279
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("ne")
   @Export("playerMod")
   static boolean playerMod;
   @ObfuscatedName("mm")
   @ObfuscatedGetter(
      intValue = 2010628921
   )
   static int field705;
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = -852143357
   )
   static int field699;
   @ObfuscatedName("sb")
   @ObfuscatedSignature(
      descriptor = "[Lg;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("od")
   @ObfuscatedGetter(
      intValue = 612039895
   )
   static int field710;
   @ObfuscatedName("oc")
   @ObfuscatedGetter(
      intValue = -1152257297
   )
   static int field860;
   @ObfuscatedName("ng")
   @Export("changedSkills")
   static int[] changedSkills;
   @ObfuscatedName("ol")
   @ObfuscatedGetter(
      intValue = 575315923
   )
   @Export("changedSkillsCount")
   static int changedSkillsCount;
   @ObfuscatedName("pi")
   static int[] field879;
   @ObfuscatedName("pe")
   static String field882;
   @ObfuscatedName("sz")
   @ObfuscatedSignature(
      descriptor = "Lbu;"
   )
   @Export("GrandExchangeEvents_worldComparator")
   static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
   @ObfuscatedName("oe")
   @ObfuscatedGetter(
      intValue = -687275157
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[Lfe;"
   )
   @Export("collisionMaps")
   static CollisionMap[] collisionMaps;
   @ObfuscatedName("ao")
   static boolean field863 = true;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1878956735
   )
   @Export("worldId")
   public static int worldId = 1;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 839347685
   )
   @Export("worldProperties")
   static int worldProperties = 0;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -1170422349
   )
   @Export("gameBuild")
   static int gameBuild = 0;
   @ObfuscatedName("bx")
   @Export("isMembersWorld")
   public static boolean isMembersWorld = false;
   @ObfuscatedName("bc")
   @Export("isLowDetail")
   static boolean isLowDetail = false;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -1136397929
   )
   @Export("clientType")
   static int clientType = -1;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -2016510315
   )
   static int field667 = -1;
   @ObfuscatedName("bg")
   @Export("onMobile")
   static boolean onMobile = false;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -196452763
   )
   @Export("gameState")
   static int gameState = 0;
   @ObfuscatedName("ca")
   @Export("isLoading")
   static boolean isLoading = true;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -1348493889
   )
   @Export("cycle")
   static int cycle = 0;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      longValue = -1640105390398986909L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis = -1L;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 855740267
   )
   static int field675 = -1;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -1934473741
   )
   static int field687 = -1;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      longValue = 7781100239728416583L
   )
   static long field853 = -1L;
   @ObfuscatedName("cm")
   @Export("hadFocus")
   static boolean hadFocus = true;
   @ObfuscatedName("cc")
   @Export("displayFps")
   static boolean displayFps = false;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -685772431
   )
   @Export("rebootTimer")
   static int rebootTimer = 0;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -482349871
   )
   @Export("hintArrowType")
   static int hintArrowType = 0;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 1334665879
   )
   @Export("hintArrowNpcIndex")
   static int hintArrowNpcIndex = 0;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -1077114245
   )
   @Export("hintArrowPlayerIndex")
   static int hintArrowPlayerIndex = 0;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 635139827
   )
   @Export("hintArrowX")
   static int hintArrowX = 0;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -2046511493
   )
   @Export("hintArrowY")
   static int hintArrowY = 0;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -1006399410
   )
   @Export("hintArrowHeight")
   static int hintArrowHeight = 0;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = -1136931287
   )
   @Export("hintArrowSubX")
   static int hintArrowSubX = 0;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = 966165568
   )
   @Export("hintArrowSubY")
   static int hintArrowSubY = 0;
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "Lci;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Lci;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 1514300673
   )
   @Export("titleLoadingStage")
   static int titleLoadingStage;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = 1809473469
   )
   @Export("js5ConnectState")
   static int js5ConnectState;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 1130532293
   )
   static int field761;
   @ObfuscatedName("ef")
   @ObfuscatedGetter(
      intValue = -1552699267
   )
   @Export("js5Errors")
   static int js5Errors;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = 1808495023
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("et")
   @ObfuscatedGetter(
      intValue = -1051745421
   )
   static int field696;
   @ObfuscatedName("ec")
   @ObfuscatedGetter(
      intValue = -1576620503
   )
   static int field786;
   @ObfuscatedName("ev")
   @ObfuscatedGetter(
      intValue = -1472029095
   )
   static int field701;
   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   static class169 field661;
   @ObfuscatedName("ej")
   @Export("Login_isUsernameRemembered")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      descriptor = "Lco;"
   )
   @Export("secureRandomFuture")
   static SecureRandomFuture secureRandomFuture;
   @ObfuscatedName("fa")
   @Export("randomDatData")
   static byte[] randomDatData;
   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      descriptor = "[Lca;"
   )
   @Export("npcs")
   static NPC[] npcs;
   @ObfuscatedName("fq")
   @ObfuscatedGetter(
      intValue = 765821471
   )
   @Export("npcCount")
   static int npcCount;
   @ObfuscatedName("fn")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("fc")
   @ObfuscatedGetter(
      intValue = 263389361
   )
   static int field725;
   @ObfuscatedName("fg")
   static int[] field697;
   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      descriptor = "Ldx;"
   )
   @Export("packetWriter")
   public static final PacketWriter packetWriter;
   @ObfuscatedName("ff")
   @ObfuscatedGetter(
      intValue = 1659773339
   )
   @Export("logoutTimer")
   static int logoutTimer;
   @ObfuscatedName("fd")
   static boolean field712;
   @ObfuscatedName("fx")
   @Export("useBufferedSocket")
   static boolean useBufferedSocket;
   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      descriptor = "Ljr;"
   )
   @Export("timer")
   static Timer timer;
   @ObfuscatedName("fm")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("gt")
   @ObfuscatedGetter(
      intValue = 464242229
   )
   static int field785;
   @ObfuscatedName("gm")
   @ObfuscatedGetter(
      intValue = -2030893429
   )
   static int field717;
   @ObfuscatedName("gq")
   @ObfuscatedGetter(
      intValue = 987395951
   )
   static int field718;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -642405077
   )
   static int field719;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = -176064215
   )
   static int field720;
   @ObfuscatedName("gi")
   @Export("isInInstance")
   static boolean isInInstance;
   @ObfuscatedName("gp")
   @Export("instanceChunkTemplates")
   static int[][][] instanceChunkTemplates;
   @ObfuscatedName("gx")
   static final int[] field724;
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = 189676939
   )
   static int field808;
   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("headIconPkSprites")
   static SpritePixels[] headIconPkSprites;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = -64215021
   )
   static int field727;
   @ObfuscatedName("hc")
   @ObfuscatedGetter(
      intValue = -37136637
   )
   static int field777;
   @ObfuscatedName("hg")
   @ObfuscatedGetter(
      intValue = -466609539
   )
   static int field729;
   @ObfuscatedName("hp")
   @ObfuscatedGetter(
      intValue = -468186107
   )
   static int field730;
   @ObfuscatedName("hh")
   static boolean field731;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 1576514889
   )
   @Export("alternativeScrollbarWidth")
   static int alternativeScrollbarWidth;
   @ObfuscatedName("hx")
   @ObfuscatedGetter(
      intValue = -795362289
   )
   @Export("camAngleX")
   static int camAngleX;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = -1632840885
   )
   @Export("camAngleY")
   static int camAngleY;
   @ObfuscatedName("hl")
   @ObfuscatedGetter(
      intValue = -1844659849
   )
   @Export("camAngleDY")
   static int camAngleDY;
   @ObfuscatedName("hy")
   @ObfuscatedGetter(
      intValue = -1777101035
   )
   @Export("camAngleDX")
   static int camAngleDX;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = 1769284115
   )
   @Export("mouseCamClickedX")
   static int mouseCamClickedX;
   @ObfuscatedName("hi")
   @ObfuscatedGetter(
      intValue = 371434131
   )
   @Export("mouseCamClickedY")
   static int mouseCamClickedY;
   @ObfuscatedName("iq")
   @ObfuscatedGetter(
      intValue = -1483884331
   )
   @Export("oculusOrbState")
   static int oculusOrbState;
   @ObfuscatedName("ir")
   @ObfuscatedGetter(
      intValue = -132229373
   )
   @Export("camFollowHeight")
   static int camFollowHeight;
   @ObfuscatedName("iu")
   @ObfuscatedGetter(
      intValue = -1057458103
   )
   static int field818;
   @ObfuscatedName("im")
   @ObfuscatedGetter(
      intValue = 1233966987
   )
   static int field742;
   @ObfuscatedName("ik")
   @ObfuscatedGetter(
      intValue = -244545381
   )
   static int field743;
   @ObfuscatedName("ig")
   @ObfuscatedGetter(
      intValue = -1600677315
   )
   @Export("oculusOrbNormalSpeed")
   static int oculusOrbNormalSpeed;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = 537367085
   )
   @Export("oculusOrbSlowedSpeed")
   static int oculusOrbSlowedSpeed;
   @ObfuscatedName("iy")
   @ObfuscatedGetter(
      intValue = 549063475
   )
   public static int field746;
   @ObfuscatedName("ii")
   static boolean field747;
   @ObfuscatedName("io")
   @ObfuscatedGetter(
      intValue = -1997671203
   )
   static int field926;
   @ObfuscatedName("ie")
   static boolean field678;
   @ObfuscatedName("ij")
   @ObfuscatedGetter(
      intValue = 1851941979
   )
   static int field880;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = -1008480153
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("ic")
   @ObfuscatedGetter(
      intValue = 1307283333
   )
   @Export("overheadTextLimit")
   static int overheadTextLimit;
   @ObfuscatedName("ia")
   @Export("overheadTextXs")
   static int[] overheadTextXs;
   @ObfuscatedName("is")
   @Export("overheadTextYs")
   static int[] overheadTextYs;
   @ObfuscatedName("iw")
   @Export("overheadTextAscents")
   static int[] overheadTextAscents;
   @ObfuscatedName("it")
   @Export("selectedItemName")
   static String selectedItemName;
   @ObfuscatedName("in")
   @Export("overheadTextXOffsets")
   static int[] overheadTextXOffsets;
   @ObfuscatedName("ih")
   @Export("overheadTextColors")
   static int[] overheadTextColors;
   @ObfuscatedName("jl")
   @Export("overheadTextEffects")
   static int[] overheadTextEffects;
   @ObfuscatedName("jp")
   @Export("overheadTextCyclesRemaining")
   static int[] overheadTextCyclesRemaining;
   @ObfuscatedName("jx")
   @Export("overheadText")
   static String[] overheadText;
   @ObfuscatedName("jz")
   @Export("tileLastDrawnActor")
   static int[][] tileLastDrawnActor;
   @ObfuscatedName("jg")
   @ObfuscatedGetter(
      intValue = -1014580553
   )
   @Export("viewportDrawCount")
   static int viewportDrawCount;
   @ObfuscatedName("jj")
   @ObfuscatedGetter(
      intValue = 946594095
   )
   @Export("viewportTempX")
   static int viewportTempX;
   @ObfuscatedName("je")
   @ObfuscatedGetter(
      intValue = -1625567767
   )
   @Export("viewportTempY")
   static int viewportTempY;
   @ObfuscatedName("jy")
   @ObfuscatedGetter(
      intValue = -2133468865
   )
   @Export("mouseCrossX")
   static int mouseCrossX;
   @ObfuscatedName("jo")
   @ObfuscatedGetter(
      intValue = 950961469
   )
   @Export("mouseCrossY")
   static int mouseCrossY;
   @ObfuscatedName("js")
   @ObfuscatedGetter(
      intValue = -370445988
   )
   @Export("mouseCrossState")
   static int mouseCrossState;
   @ObfuscatedName("jd")
   @ObfuscatedGetter(
      intValue = 291298579
   )
   @Export("mouseCrossColor")
   static int mouseCrossColor;
   @ObfuscatedName("jv")
   @Export("showMouseCross")
   static boolean showMouseCross;
   @ObfuscatedName("jw")
   @ObfuscatedGetter(
      intValue = 1260827455
   )
   static int field770;
   @ObfuscatedName("ju")
   @ObfuscatedGetter(
      intValue = -939205371
   )
   static int field931;
   @ObfuscatedName("jm")
   @ObfuscatedGetter(
      intValue = -925019431
   )
   @Export("dragItemSlotSource")
   static int dragItemSlotSource;
   @ObfuscatedName("jt")
   @ObfuscatedGetter(
      intValue = -1325030875
   )
   @Export("draggedWidgetX")
   static int draggedWidgetX;
   @ObfuscatedName("jk")
   @ObfuscatedGetter(
      intValue = 1709049139
   )
   @Export("draggedWidgetY")
   static int draggedWidgetY;
   @ObfuscatedName("jc")
   @ObfuscatedGetter(
      intValue = 971800427
   )
   @Export("dragItemSlotDestination")
   static int dragItemSlotDestination;
   @ObfuscatedName("jq")
   static boolean field776;
   @ObfuscatedName("jr")
   @ObfuscatedGetter(
      intValue = 1248603435
   )
   @Export("itemDragDuration")
   static int itemDragDuration;
   @ObfuscatedName("jb")
   @ObfuscatedGetter(
      intValue = 1309202573
   )
   static int field778;
   @ObfuscatedName("jh")
   @Export("showLoadingMessages")
   static boolean showLoadingMessages;
   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "[Lbk;"
   )
   @Export("players")
   static Player[] players;
   @ObfuscatedName("ky")
   @ObfuscatedGetter(
      intValue = -728300783
   )
   @Export("localPlayerIndex")
   static int localPlayerIndex;
   @ObfuscatedName("kg")
   @ObfuscatedGetter(
      intValue = -1425770135
   )
   static int field673;
   @ObfuscatedName("km")
   @Export("renderSelf")
   static boolean renderSelf;
   @ObfuscatedName("kw")
   @ObfuscatedGetter(
      intValue = -1928759915
   )
   @Export("drawPlayerNames")
   static int drawPlayerNames;
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = 2056872733
   )
   static int field851;
   @ObfuscatedName("kf")
   static int[] field845;
   @ObfuscatedName("kz")
   @Export("playerMenuOpcodes")
   static final int[] playerMenuOpcodes;
   @ObfuscatedName("kq")
   @Export("playerMenuActions")
   static String[] playerMenuActions;
   @ObfuscatedName("ki")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("kn")
   @Export("defaultRotations")
   static int[] defaultRotations;
   @ObfuscatedName("kl")
   @ObfuscatedGetter(
      intValue = -904891653
   )
   @Export("combatTargetPlayerIndex")
   static int combatTargetPlayerIndex;
   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      descriptor = "[[[Lji;"
   )
   @Export("groundItems")
   static NodeDeque[][][] groundItems;
   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("pendingSpawns")
   static NodeDeque pendingSpawns;
   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("projectiles")
   static NodeDeque projectiles;
   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("graphicsObjects")
   static NodeDeque graphicsObjects;
   @ObfuscatedName("kx")
   @Export("currentLevels")
   static int[] currentLevels;
   @ObfuscatedName("kv")
   @Export("levels")
   static int[] levels;
   @ObfuscatedName("lk")
   @Export("experience")
   static int[] experience;
   @ObfuscatedName("lx")
   @ObfuscatedGetter(
      intValue = -1636059503
   )
   @Export("leftClickOpensMenu")
   static int leftClickOpensMenu;
   @ObfuscatedName("lh")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("ld")
   @ObfuscatedGetter(
      intValue = -1929557275
   )
   @Export("menuOptionsCount")
   static int menuOptionsCount;
   @ObfuscatedName("lw")
   @Export("menuArguments1")
   static int[] menuArguments1;
   @ObfuscatedName("lv")
   @Export("menuArguments2")
   static int[] menuArguments2;
   @ObfuscatedName("ln")
   @Export("menuOpcodes")
   static int[] menuOpcodes;
   @ObfuscatedName("la")
   @Export("menuIdentifiers")
   static int[] menuIdentifiers;
   @ObfuscatedName("lr")
   @Export("menuActions")
   static String[] menuActions;
   @ObfuscatedName("lg")
   @Export("menuTargets")
   static String[] menuTargets;
   @ObfuscatedName("lj")
   @Export("menuShiftClick")
   static boolean[] menuShiftClick;
   @ObfuscatedName("lq")
   @Export("followerOpsLowPriority")
   static boolean followerOpsLowPriority;
   @ObfuscatedName("lb")
   @Export("shiftClickDrop")
   static boolean shiftClickDrop;
   @ObfuscatedName("lo")
   @Export("tapToDrop")
   static boolean tapToDrop;
   @ObfuscatedName("lc")
   @Export("showMouseOverText")
   static boolean showMouseOverText;
   @ObfuscatedName("lp")
   @ObfuscatedGetter(
      intValue = -2061703801
   )
   @Export("viewportX")
   static int viewportX;
   @ObfuscatedName("ly")
   @ObfuscatedGetter(
      intValue = 505475035
   )
   @Export("viewportY")
   static int viewportY;
   @ObfuscatedName("mw")
   @ObfuscatedGetter(
      intValue = 1736446689
   )
   static int field815;
   @ObfuscatedName("mi")
   @ObfuscatedGetter(
      intValue = 244031685
   )
   static int field925;
   @ObfuscatedName("md")
   @ObfuscatedGetter(
      intValue = -155496829
   )
   @Export("isItemSelected")
   static int isItemSelected;
   @ObfuscatedName("mj")
   @Export("isSpellSelected")
   static boolean isSpellSelected;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      intValue = 1221280359
   )
   @Export("selectedSpellChildIndex")
   static int selectedSpellChildIndex;
   @ObfuscatedName("ma")
   @ObfuscatedGetter(
      intValue = -1666449457
   )
   static int field821;
   @ObfuscatedName("mk")
   @Export("selectedSpellActionName")
   static String selectedSpellActionName;
   @ObfuscatedName("ml")
   @Export("selectedSpellName")
   static String selectedSpellName;
   @ObfuscatedName("mp")
   @ObfuscatedGetter(
      intValue = -803137889
   )
   @Export("rootInterface")
   static int rootInterface;
   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("interfaceParents")
   static NodeHashTable interfaceParents;
   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      descriptor = "Lkx;"
   )
   Buffer field702;
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      descriptor = "Ll;"
   )
   class9 field782;

   static {
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      titleLoadingStage = 0;
      js5ConnectState = 0;
      field761 = 0;
      js5Errors = 0;
      loginState = 0;
      field696 = 0;
      field786 = 0;
      field701 = 0;
      field661 = class169.field2012;
      Login_isUsernameRemembered = false;
      secureRandomFuture = new SecureRandomFuture();
      randomDatData = null;
      npcs = new NPC['耀'];
      npcCount = 0;
      npcIndices = new int['耀'];
      field725 = 0;
      field697 = new int[250];
      packetWriter = new PacketWriter();
      logoutTimer = 0;
      field712 = false;
      useBufferedSocket = true;
      timer = new Timer();
      fontsMap = new HashMap();
      field785 = 0;
      field717 = 1;
      field718 = 0;
      field719 = 1;
      field720 = 0;
      collisionMaps = new CollisionMap[4];
      isInInstance = false;
      instanceChunkTemplates = new int[4][13][13];
      field724 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field808 = 0;
      field727 = 2301979;
      field777 = 5063219;
      field729 = 3353893;
      field730 = 7759444;
      field731 = false;
      alternativeScrollbarWidth = 0;
      camAngleX = 128;
      camAngleY = 0;
      camAngleDY = 0;
      camAngleDX = 0;
      mouseCamClickedX = 0;
      mouseCamClickedY = 0;
      oculusOrbState = 0;
      camFollowHeight = 50;
      field818 = 0;
      field742 = 0;
      field743 = 0;
      oculusOrbNormalSpeed = 12;
      oculusOrbSlowedSpeed = 6;
      field746 = 0;
      field747 = false;
      field926 = 0;
      field678 = false;
      field880 = 0;
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
      field770 = 0;
      field931 = 0;
      dragItemSlotSource = 0;
      draggedWidgetX = 0;
      draggedWidgetY = 0;
      dragItemSlotDestination = 0;
      field776 = false;
      itemDragDuration = 0;
      field778 = 0;
      showLoadingMessages = true;
      players = new Player[2048];
      localPlayerIndex = -1;
      field673 = 0;
      renderSelf = true;
      drawPlayerNames = 0;
      field851 = 0;
      field845 = new int[1000];
      playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerMenuActions = new String[8];
      playerOptionsPriorities = new boolean[8];
      defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      combatTargetPlayerIndex = -1;
      groundItems = new NodeDeque[4][104][104];
      pendingSpawns = new NodeDeque();
      projectiles = new NodeDeque();
      graphicsObjects = new NodeDeque();
      currentLevels = new int[25];
      levels = new int[25];
      experience = new int[25];
      leftClickOpensMenu = 0;
      isMenuOpen = false;
      menuOptionsCount = 0;
      menuArguments1 = new int[500];
      menuArguments2 = new int[500];
      menuOpcodes = new int[500];
      menuIdentifiers = new int[500];
      menuActions = new String[500];
      menuTargets = new String[500];
      menuShiftClick = new boolean[500];
      followerOpsLowPriority = false;
      shiftClickDrop = false;
      tapToDrop = false;
      showMouseOverText = true;
      viewportX = -1;
      viewportY = -1;
      field815 = 0;
      field925 = 50;
      isItemSelected = 0;
      selectedItemName = null;
      isSpellSelected = false;
      selectedSpellChildIndex = -1;
      field821 = -1;
      selectedSpellActionName = null;
      selectedSpellName = null;
      rootInterface = -1;
      interfaceParents = new NodeHashTable(8);
      field705 = 0;
      field699 = -1;
      chatEffects = 0;
      field829 = 0;
      meslayerContinueWidget = null;
      runEnergy = 0;
      weight = 0;
      staffModLevel = 0;
      followerIndex = -1;
      playerMod = false;
      viewportWidget = null;
      clickedWidget = null;
      clickedWidgetParent = null;
      widgetClickX = 0;
      widgetClickY = 0;
      draggedOnWidget = null;
      field912 = false;
      field714 = -1;
      field844 = -1;
      field754 = false;
      field784 = -1;
      field847 = -1;
      isDraggingWidget = false;
      cycleCntr = 1;
      changedVarps = new int[32];
      changedVarpCount = 0;
      changedItemContainers = new int[32];
      field870 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      chatCycle = 0;
      field857 = 0;
      field858 = 0;
      field710 = 0;
      field860 = 0;
      field861 = 0;
      mouseWheelRotation = 0;
      scriptEvents = new NodeDeque();
      field660 = new NodeDeque();
      field865 = new NodeDeque();
      widgetFlags = new NodeHashTable(512);
      rootWidgetCount = 0;
      field868 = -2;
      field816 = new boolean[100];
      field827 = new boolean[100];
      field871 = new boolean[100];
      rootWidgetXs = new int[100];
      rootWidgetYs = new int[100];
      rootWidgetWidths = new int[100];
      rootWidgetHeights = new int[100];
      gameDrawingMode = 0;
      field938 = 0L;
      isResizable = true;
      field879 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      tradeChatMode = 0;
      field882 = "";
      field883 = new long[100];
      field884 = 0;
      field885 = 0;
      field886 = new int[128];
      field738 = new int[128];
      field888 = -1L;
      field889 = -1;
      mapIconCount = 0;
      mapIconXs = new int[1000];
      mapIconYs = new int[1000];
      mapIcons = new SpritePixels[1000];
      destinationX = 0;
      destinationY = 0;
      minimapState = 0;
      currentTrackGroupId = -1;
      field899 = false;
      soundEffectCount = 0;
      soundEffectIds = new int[50];
      queuedSoundEffectLoops = new int[50];
      queuedSoundEffectDelays = new int[50];
      soundLocations = new int[50];
      soundEffects = new SoundEffect[50];
      isCameraLocked = false;
      field907 = new boolean[5];
      field908 = new int[5];
      field909 = new int[5];
      field799 = new int[5];
      field911 = new int[5];
      field779 = 256;
      field913 = 205;
      zoomHeight = 256;
      zoomWidth = 320;
      field916 = 1;
      field690 = 32767;
      field918 = 1;
      field846 = 32767;
      viewportOffsetX = 0;
      viewportOffsetY = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      viewportZoom = 0;
      playerComposition = new PlayerComposition();
      field850 = -1;
      field927 = -1;
      platformInfoProvider = new DesktopPlatformInfoProvider();
      grandExchangeOffers = new GrandExchangeOffer[8];
      GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
      field674 = -1;
      archiveLoaders = new ArrayList(10);
      archiveLoadersDone = 0;
      field934 = 0;
      field935 = new ApproximateRouteStrategy();
      field708 = new int[50];
      field859 = new int[50];
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-226650241"
   )
   @Export("resizeGame")
   protected final void resizeGame() {
      field938 = Tiles.currentTimeMillis() + 500L;
      this.resizeJS();
      if (rootInterface != -1) {
         this.resizeRoot(true);
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-337269105"
   )
   @Export("setUp")
   protected final void setUp() {
      Strings.method4329(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      MouseRecorder.port1 = gameBuild == 0 ? 'ꩊ' : worldId + '鱀';
      class171.port2 = gameBuild == 0 ? 443 : worldId + '썐';
      DynamicObject.port3 = MouseRecorder.port1;
      PlayerComposition.field2565 = class224.field2577;
      class105.field1339 = class224.field2573;
      HealthBar.field1143 = class224.field2575;
      WorldMapSprite.field259 = class224.field2574;
      ScriptFrame.urlRequester = new UrlRequester();
      this.setUpKeyboard();
      this.setUpMouse();
      PlayerType.mouseWheel = this.mouseWheel();
      WorldMapScaleHandler.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
      AccessFile var2 = null;
      ClientPreferences var3 = new ClientPreferences();

      try {
         var2 = WorldMapRectangle.getPreferencesFile("", FontName.field3699.name, false);
         byte[] var4 = new byte[(int)var2.length()];

         int var6;
         for(int var5 = 0; var5 < var4.length; var5 += var6) {
            var6 = var2.read(var4, var5, var4.length - var5);
            if (var6 == -1) {
               throw new IOException();
            }
         }

         var3 = new ClientPreferences(new Buffer(var4));
      } catch (Exception var8) {
         ;
      }

      try {
         if (var2 != null) {
            var2.close();
         }
      } catch (Exception var7) {
         ;
      }

      WorldMapSectionType.clientPreferences = var3;
      this.setUpClipboard();
      KeyHandler.method912(this, WorldMapData_1.null_string);
      if (gameBuild != 0) {
         displayFps = true;
      }

      GameBuild.setWindowedMode(WorldMapSectionType.clientPreferences.windowMode);
      InterfaceParent.friendSystem = new FriendSystem(Message.loginType);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-123"
   )
   @Export("doCycle")
   protected final void doCycle() {
      ++cycle;
      this.doCycleJs5();

      while(true) {
         NodeDeque var2 = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
         ArchiveDiskAction var1;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
         }

         if (var1 == null) {
            LoginPacket.method3815();
            UserComparator5.playPcmPlayers();
            KeyHandler var9 = KeyHandler.KeyHandler_instance;
            synchronized(KeyHandler.KeyHandler_instance) {
               ++KeyHandler.KeyHandler_idleCycles;
               KeyHandler.field418 = KeyHandler.field424;
               KeyHandler.field421 = 0;
               int var5;
               if (KeyHandler.field417 >= 0) {
                  while(KeyHandler.field417 != KeyHandler.field416) {
                     var5 = KeyHandler.field407[KeyHandler.field416];
                     KeyHandler.field416 = KeyHandler.field416 + 1 & 127;
                     if (var5 < 0) {
                        KeyHandler.KeyHandler_pressedKeys[~var5] = false;
                     } else {
                        if (!KeyHandler.KeyHandler_pressedKeys[var5] && KeyHandler.field421 < KeyHandler.field420.length - 1) {
                           KeyHandler.field420[++KeyHandler.field421 - 1] = var5;
                        }

                        KeyHandler.KeyHandler_pressedKeys[var5] = true;
                     }
                  }
               } else {
                  for(var5 = 0; var5 < 112; ++var5) {
                     KeyHandler.KeyHandler_pressedKeys[var5] = false;
                  }

                  KeyHandler.field417 = KeyHandler.field416;
               }

               if (KeyHandler.field421 > 0) {
                  KeyHandler.KeyHandler_idleCycles = 0;
               }

               KeyHandler.field424 = KeyHandler.field423;
            }

            class60.method967();
            int var6;
            if (PlayerType.mouseWheel != null) {
               var6 = PlayerType.mouseWheel.useRotation();
               mouseWheelRotation = var6;
            }

            if (gameState == 0) {
               GameEngine.load();
               WorldMapSprite.clock.mark();

               for(var6 = 0; var6 < 32; ++var6) {
                  GameEngine.graphicsTickTimes[var6] = 0L;
               }

               for(var6 = 0; var6 < 32; ++var6) {
                  GameEngine.clientTickTimes[var6] = 0L;
               }

               VertexNormal.gameCyclesToDo = 0;
            } else if (gameState == 5) {
               class9.doCycleTitle(this);
               GameEngine.load();
               WorldMapSprite.clock.mark();

               for(var6 = 0; var6 < 32; ++var6) {
                  GameEngine.graphicsTickTimes[var6] = 0L;
               }

               for(var6 = 0; var6 < 32; ++var6) {
                  GameEngine.clientTickTimes[var6] = 0L;
               }

               VertexNormal.gameCyclesToDo = 0;
            } else if (gameState != 10 && gameState != 11) {
               if (gameState == 20) {
                  class9.doCycleTitle(this);
                  this.doCycleLoggedOut();
               } else if (gameState == 25) {
                  WorldMapIcon_1.method375();
               }
            } else {
               class9.doCycleTitle(this);
            }

            if (gameState == 30) {
               this.doCycleLoggedIn();
            } else if (gameState == 40 || gameState == 45) {
               this.doCycleLoggedOut();
            }

            return;
         }

         var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1888023388"
   )
   @Export("draw")
   protected final void draw(boolean var1) {
      boolean var2;
      label173: {
         try {
            if (class206.musicPlayerStatus == 2) {
               if (class204.musicTrack == null) {
                  class204.musicTrack = MusicTrack.readTrack(class206.musicTrackArchive, class206.musicTrackGroupId, SoundSystem.musicTrackFileId);
                  if (class204.musicTrack == null) {
                     var2 = false;
                     break label173;
                  }
               }

               if (class182.soundCache == null) {
                  class182.soundCache = new SoundCache(class206.soundEffectsArchive, class206.musicSamplesArchive);
               }

               if (VertexNormal.midiPcmStream.loadMusicTrack(class204.musicTrack, class206.musicPatchesArchive, class182.soundCache, 22050)) {
                  VertexNormal.midiPcmStream.clearAll();
                  VertexNormal.midiPcmStream.setPcmStreamVolume(DevicePcmPlayerProvider.musicTrackVolume);
                  VertexNormal.midiPcmStream.setMusicTrack(class204.musicTrack, class206.musicTrackBoolean);
                  class206.musicPlayerStatus = 0;
                  class204.musicTrack = null;
                  class182.soundCache = null;
                  class206.musicTrackArchive = null;
                  var2 = true;
                  break label173;
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            VertexNormal.midiPcmStream.clear();
            class206.musicPlayerStatus = 0;
            class204.musicTrack = null;
            class182.soundCache = null;
            class206.musicTrackArchive = null;
         }

         var2 = false;
      }

      if (var2 && field899 && class197.pcmPlayer0 != null) {
         class197.pcmPlayer0.tryDiscard();
      }

      if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field938 && Tiles.currentTimeMillis() > field938) {
         GameBuild.setWindowedMode(BoundaryObject.getWindowedMode());
      }

      int var4;
      if (var1) {
         for(var4 = 0; var4 < 100; ++var4) {
            field816[var4] = true;
         }
      }

      if (gameState == 0) {
         this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
      } else if (gameState == 5) {
         MilliClock.drawTitle(ScriptEvent.fontBold12, SecureRandomCallable.fontPlain11, Login.fontPlain12);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            MilliClock.drawTitle(ScriptEvent.fontBold12, SecureRandomCallable.fontPlain11, Login.fontPlain12);
         } else if (gameState == 25) {
            if (field720 == 1) {
               if (field785 > field717) {
                  field717 = field785;
               }

               var4 = (field717 * 50 - field785 * 50) / field717;
               WorldMapIcon_1.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else if (field720 == 2) {
               if (field718 > field719) {
                  field719 = field718;
               }

               var4 = (field719 * 50 - field718 * 50) / field719 + 50;
               WorldMapIcon_1.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else {
               WorldMapIcon_1.drawLoadingMessage("Loading - please wait.", false);
            }
         } else if (gameState == 30) {
            this.drawLoggedIn();
         } else if (gameState == 40) {
            WorldMapIcon_1.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (gameState == 45) {
            WorldMapIcon_1.drawLoadingMessage("Please wait...", false);
         }
      } else {
         MilliClock.drawTitle(ScriptEvent.fontBold12, SecureRandomCallable.fontPlain11, Login.fontPlain12);
      }

      if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
         for(var4 = 0; var4 < rootWidgetCount; ++var4) {
            if (field827[var4]) {
               FileSystem.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
               field827[var4] = false;
            }
         }
      } else if (gameState > 0) {
         FileSystem.rasterProvider.drawFull(0, 0);

         for(var4 = 0; var4 < rootWidgetCount; ++var4) {
            field827[var4] = false;
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1925350941"
   )
   @Export("kill0")
   protected final void kill0() {
      if (GrandExchangeOffer.varcs.hasUnwrittenChanges()) {
         GrandExchangeOffer.varcs.write();
      }

      if (Friend.mouseRecorder != null) {
         Friend.mouseRecorder.isRunning = false;
      }

      Friend.mouseRecorder = null;
      packetWriter.close();
      if (KeyHandler.KeyHandler_instance != null) {
         KeyHandler var1 = KeyHandler.KeyHandler_instance;
         synchronized(KeyHandler.KeyHandler_instance) {
            KeyHandler.KeyHandler_instance = null;
         }
      }

      if (MouseHandler.MouseHandler_instance != null) {
         MouseHandler var9 = MouseHandler.MouseHandler_instance;
         synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_instance = null;
         }
      }

      PlayerType.mouseWheel = null;
      if (class197.pcmPlayer0 != null) {
         class197.pcmPlayer0.shutdown();
      }

      if (WorldMapDecorationType.pcmPlayer1 != null) {
         WorldMapDecorationType.pcmPlayer1.shutdown();
      }

      WorldMapAreaData.method782();
      Object var10 = ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field3187 != 0) {
            ArchiveDiskActionHandler.field3187 = 1;

            try {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
            } catch (InterruptedException var5) {
               ;
            }
         }
      }

      if (ScriptFrame.urlRequester != null) {
         ScriptFrame.urlRequester.close();
         ScriptFrame.urlRequester = null;
      }

      WorldMapSection2.method387();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "103"
   )
   protected final void vmethod1423() {
   }

   public final void init() {
      try {
         if (this.checkHost()) {
            for(int var1 = 0; var1 <= 20; ++var1) {
               String var2 = this.getParameter(Integer.toString(var1));
               if (var2 != null) {
                  switch(var1) {
                  case 1:
                     useBufferedSocket = Integer.parseInt(var2) != 0;
                  case 2:
                  case 11:
                  case 13:
                  case 16:
                  default:
                     break;
                  case 3:
                     if (var2.equalsIgnoreCase("true")) {
                        isMembersWorld = true;
                     } else {
                        isMembersWorld = false;
                     }
                     break;
                  case 4:
                     if (clientType == -1) {
                        clientType = Integer.parseInt(var2);
                     }
                     break;
                  case 5:
                     worldProperties = Integer.parseInt(var2);
                     break;
                  case 6:
                     NPCComposition.clientLanguage = Language.method3854(Integer.parseInt(var2));
                     break;
                  case 7:
                     int var4 = Integer.parseInt(var2);
                     GameBuild[] var5 = class1.method16();
                     int var6 = 0;

                     GameBuild var3;
                     while(true) {
                        if (var6 >= var5.length) {
                           var3 = null;
                           break;
                        }

                        GameBuild var7 = var5[var6];
                        if (var4 == var7.buildId) {
                           var3 = var7;
                           break;
                        }

                        ++var6;
                     }

                     Skills.field2774 = var3;
                     break;
                  case 8:
                     if (var2.equalsIgnoreCase("true")) {
                        ;
                     }
                     break;
                  case 9:
                     AccessFile.field4100 = var2;
                     break;
                  case 10:
                     FontName.field3699 = (StudioGame)InterfaceParent.findEnumerated(DesktopPlatformInfoProvider.method6478(), Integer.parseInt(var2));
                     if (FontName.field3699 == StudioGame.oldscape) {
                        Message.loginType = LoginType.oldscape;
                     } else {
                        Message.loginType = LoginType.field4072;
                     }
                     break;
                  case 12:
                     worldId = Integer.parseInt(var2);
                     break;
                  case 14:
                     ItemLayer.field1562 = Integer.parseInt(var2);
                     break;
                  case 15:
                     gameBuild = Integer.parseInt(var2);
                     break;
                  case 17:
                     Projectile.field1254 = var2;
                  }
               }
            }

            Scene.Scene_isLowDetail = false;
            isLowDetail = false;
            MusicPatchNode.worldHost = this.getCodeBase().getHost();
            String var8 = Skills.field2774.name;
            byte var9 = 0;

            try {
               Projectile.method2255("oldschool", var8, var9, 21);
            } catch (Exception var10) {
               SequenceDefinition.RunException_sendStackTrace((String)null, var10);
            }

            class1.client = this;
            class217.clientType = clientType;
            if (field667 == -1) {
               field667 = 0;
            }

            this.startThread(765, 503, 194);
         }
      } catch (RuntimeException var11) {
         throw class298.newRunException(var11, "client.init(" + ')');
      }
   }

   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("doCycleJs5")
   void doCycleJs5() {
      if (gameState != 1000) {
         long var2 = Tiles.currentTimeMillis();
         int var4 = (int)(var2 - NetCache.field3222);
         NetCache.field3222 = var2;
         if (var4 > 200) {
            var4 = 200;
         }

         NetCache.NetCache_loadTime += var4;
         boolean var1;
         if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
            var1 = true;
         } else if (class297.NetCache_socket == null) {
            var1 = false;
         } else {
            try {
               label243: {
                  if (NetCache.NetCache_loadTime > 30000) {
                     throw new IOException();
                  }

                  NetFileRequest var5;
                  Buffer var6;
                  while(NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
                     var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                     var6 = new Buffer(4);
                     var6.writeByte(1);
                     var6.writeMedium((int)var5.key);
                     class297.NetCache_socket.write(var6.array, 0, 4);
                     NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
                     --NetCache.NetCache_pendingPriorityWritesCount;
                     ++NetCache.NetCache_pendingPriorityResponsesCount;
                  }

                  while(NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
                     var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                     var6 = new Buffer(4);
                     var6.writeByte(0);
                     var6.writeMedium((int)var5.key);
                     class297.NetCache_socket.write(var6.array, 0, 4);
                     var5.removeDual();
                     NetCache.NetCache_pendingResponses.put(var5, var5.key);
                     --NetCache.NetCache_pendingWritesCount;
                     ++NetCache.NetCache_pendingResponsesCount;
                  }

                  for(int var17 = 0; var17 < 100; ++var17) {
                     int var18 = class297.NetCache_socket.available();
                     if (var18 < 0) {
                        throw new IOException();
                     }

                     if (var18 == 0) {
                        break;
                     }

                     NetCache.NetCache_loadTime = 0;
                     byte var7 = 0;
                     if (SecureRandomCallable.NetCache_currentResponse == null) {
                        var7 = 8;
                     } else if (NetCache.field3219 == 0) {
                        var7 = 1;
                     }

                     int var8;
                     int var9;
                     int var10;
                     int var12;
                     if (var7 > 0) {
                        var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
                        if (var8 > var18) {
                           var8 = var18;
                        }

                        class297.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
                        if (NetCache.field3213 != 0) {
                           for(var9 = 0; var9 < var8; ++var9) {
                              NetCache.NetCache_responseHeaderBuffer.array[var9 + NetCache.NetCache_responseHeaderBuffer.offset] ^= NetCache.field3213;
                           }
                        }

                        NetCache.NetCache_responseHeaderBuffer.offset += var8;
                        if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
                           break;
                        }

                        if (SecureRandomCallable.NetCache_currentResponse == null) {
                           NetCache.NetCache_responseHeaderBuffer.offset = 0;
                           var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
                           int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
                           long var13 = (long)(var10 + (var9 << 16));
                           NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
                           PlayerType.field3137 = true;
                           if (var15 == null) {
                              var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
                              PlayerType.field3137 = false;
                           }

                           if (var15 == null) {
                              throw new IOException();
                           }

                           int var16 = var11 == 0 ? 5 : 9;
                           SecureRandomCallable.NetCache_currentResponse = var15;
                           NetCache.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + SecureRandomCallable.NetCache_currentResponse.padding);
                           NetCache.NetCache_responseArchiveBuffer.writeByte(var11);
                           NetCache.NetCache_responseArchiveBuffer.writeInt(var12);
                           NetCache.field3219 = 8;
                           NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        } else if (NetCache.field3219 == 0) {
                           if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
                              NetCache.field3219 = 1;
                              NetCache.NetCache_responseHeaderBuffer.offset = 0;
                           } else {
                              SecureRandomCallable.NetCache_currentResponse = null;
                           }
                        }
                     } else {
                        var8 = NetCache.NetCache_responseArchiveBuffer.array.length - SecureRandomCallable.NetCache_currentResponse.padding;
                        var9 = 512 - NetCache.field3219;
                        if (var9 > var8 - NetCache.NetCache_responseArchiveBuffer.offset) {
                           var9 = var8 - NetCache.NetCache_responseArchiveBuffer.offset;
                        }

                        if (var9 > var18) {
                           var9 = var18;
                        }

                        class297.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var9);
                        if (NetCache.field3213 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              NetCache.NetCache_responseArchiveBuffer.array[NetCache.NetCache_responseArchiveBuffer.offset + var10] ^= NetCache.field3213;
                           }
                        }

                        NetCache.NetCache_responseArchiveBuffer.offset += var9;
                        NetCache.field3219 += var9;
                        if (var8 == NetCache.NetCache_responseArchiveBuffer.offset) {
                           if (SecureRandomCallable.NetCache_currentResponse.key == 16711935L) {
                              SoundSystem.NetCache_reference = NetCache.NetCache_responseArchiveBuffer;

                              for(var10 = 0; var10 < 256; ++var10) {
                                 Archive var19 = NetCache.NetCache_archives[var10];
                                 if (var19 != null) {
                                    SoundSystem.NetCache_reference.offset = var10 * 8 + 5;
                                    var12 = SoundSystem.NetCache_reference.readInt();
                                    int var20 = SoundSystem.NetCache_reference.readInt();
                                    var19.loadIndex(var12, var20);
                                 }
                              }
                           } else {
                              NetCache.NetCache_crc.reset();
                              NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var8);
                              var10 = (int)NetCache.NetCache_crc.getValue();
                              if (var10 != SecureRandomCallable.NetCache_currentResponse.crc) {
                                 try {
                                    class297.NetCache_socket.close();
                                 } catch (Exception var23) {
                                    ;
                                 }

                                 ++NetCache.NetCache_crcMismatches;
                                 class297.NetCache_socket = null;
                                 NetCache.field3213 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var1 = false;
                                 break label243;
                              }

                              NetCache.NetCache_crcMismatches = 0;
                              NetCache.NetCache_ioExceptions = 0;
                              SecureRandomCallable.NetCache_currentResponse.archive.write((int)(SecureRandomCallable.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, 16711680L == (SecureRandomCallable.NetCache_currentResponse.key & 16711680L), PlayerType.field3137);
                           }

                           SecureRandomCallable.NetCache_currentResponse.remove();
                           if (PlayerType.field3137) {
                              --NetCache.NetCache_pendingPriorityResponsesCount;
                           } else {
                              --NetCache.NetCache_pendingResponsesCount;
                           }

                           NetCache.field3219 = 0;
                           SecureRandomCallable.NetCache_currentResponse = null;
                           NetCache.NetCache_responseArchiveBuffer = null;
                        } else {
                           if (NetCache.field3219 != 512) {
                              break;
                           }

                           NetCache.field3219 = 0;
                        }
                     }
                  }

                  var1 = true;
               }
            } catch (IOException var24) {
               try {
                  class297.NetCache_socket.close();
               } catch (Exception var22) {
                  ;
               }

               ++NetCache.NetCache_ioExceptions;
               class297.NetCache_socket = null;
               var1 = false;
            }
         }

         if (!var1) {
            this.doCycleJs5Connect();
         }

      }
   }

   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1394260996"
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

            field761 = 3000;
            NetCache.NetCache_ioExceptions = 3;
         }

         if (--field761 + 1 <= 0) {
            try {
               if (js5ConnectState == 0) {
                  TaskHandler.js5SocketTask = GameEngine.taskHandler.newSocketTask(MusicPatchNode.worldHost, DynamicObject.port3);
                  ++js5ConnectState;
               }

               if (js5ConnectState == 1) {
                  if (TaskHandler.js5SocketTask.status == 2) {
                     this.js5Error(-1);
                     return;
                  }

                  if (TaskHandler.js5SocketTask.status == 1) {
                     ++js5ConnectState;
                  }
               }

               if (js5ConnectState == 2) {
                  if (useBufferedSocket) {
                     WorldMapArea.js5Socket = method1841((Socket)TaskHandler.js5SocketTask.result, 40000, 5000);
                  } else {
                     WorldMapArea.js5Socket = new NetSocket((Socket)TaskHandler.js5SocketTask.result, GameEngine.taskHandler, 5000);
                  }

                  Buffer var1 = new Buffer(5);
                  var1.writeByte(15);
                  var1.writeInt(194);
                  WorldMapArea.js5Socket.write(var1.array, 0, 5);
                  ++js5ConnectState;
                  World.field1036 = Tiles.currentTimeMillis();
               }

               if (js5ConnectState == 3) {
                  if (WorldMapArea.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
                     int var5 = WorldMapArea.js5Socket.readUnsignedByte();
                     if (var5 != 0) {
                        this.js5Error(var5);
                        return;
                     }

                     ++js5ConnectState;
                  } else if (Tiles.currentTimeMillis() - World.field1036 > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (js5ConnectState == 4) {
                  AbstractSocket var10 = WorldMapArea.js5Socket;
                  boolean var2 = gameState > 20;
                  if (class297.NetCache_socket != null) {
                     try {
                        class297.NetCache_socket.close();
                     } catch (Exception var8) {
                        ;
                     }

                     class297.NetCache_socket = null;
                  }

                  class297.NetCache_socket = var10;
                  Actor.method1867(var2);
                  NetCache.NetCache_responseHeaderBuffer.offset = 0;
                  SecureRandomCallable.NetCache_currentResponse = null;
                  NetCache.NetCache_responseArchiveBuffer = null;
                  NetCache.field3219 = 0;

                  while(true) {
                     NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
                     if (var3 == null) {
                        while(true) {
                           var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
                           if (var3 == null) {
                              if (NetCache.field3213 != 0) {
                                 try {
                                    Buffer var11 = new Buffer(4);
                                    var11.writeByte(4);
                                    var11.writeByte(NetCache.field3213);
                                    var11.writeShort(0);
                                    class297.NetCache_socket.write(var11.array, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       class297.NetCache_socket.close();
                                    } catch (Exception var6) {
                                       ;
                                    }

                                    ++NetCache.NetCache_ioExceptions;
                                    class297.NetCache_socket = null;
                                 }
                              }

                              NetCache.NetCache_loadTime = 0;
                              NetCache.field3222 = Tiles.currentTimeMillis();
                              TaskHandler.js5SocketTask = null;
                              WorldMapArea.js5Socket = null;
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

   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "78"
   )
   @Export("js5Error")
   void js5Error(int var1) {
      TaskHandler.js5SocketTask = null;
      WorldMapArea.js5Socket = null;
      js5ConnectState = 0;
      if (DynamicObject.port3 == MouseRecorder.port1) {
         DynamicObject.port3 = class171.port2;
      } else {
         DynamicObject.port3 = MouseRecorder.port1;
      }

      ++js5Errors;
      if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
         if (gameState <= 5) {
            this.error("js5connect_full");
            gameState = 1000;
         } else {
            field761 = 3000;
         }
      } else if (js5Errors >= 2 && var1 == 6) {
         this.error("js5connect_outofdate");
         gameState = 1000;
      } else if (js5Errors >= 4) {
         if (gameState <= 5) {
            this.error("js5connect");
            gameState = 1000;
         } else {
            field761 = 3000;
         }
      }

   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1483271988"
   )
   @Export("doCycleLoggedOut")
   final void doCycleLoggedOut() {
      Object var1 = packetWriter.getSocket();
      PacketBuffer var2 = packetWriter.packetBuffer;

      try {
         if (loginState == 0) {
            if (WorldMapManager.secureRandom == null && (secureRandomFuture.isDone() || field696 > 250)) {
               WorldMapManager.secureRandom = secureRandomFuture.get();
               secureRandomFuture.shutdown();
               secureRandomFuture = null;
            }

            if (WorldMapManager.secureRandom != null) {
               if (var1 != null) {
                  ((AbstractSocket)var1).close();
                  var1 = null;
               }

               NetSocket.socketTask = null;
               field712 = false;
               field696 = 0;
               loginState = 1;
            }
         }

         if (loginState == 1) {
            if (NetSocket.socketTask == null) {
               NetSocket.socketTask = GameEngine.taskHandler.newSocketTask(MusicPatchNode.worldHost, DynamicObject.port3);
            }

            if (NetSocket.socketTask.status == 2) {
               throw new IOException();
            }

            if (NetSocket.socketTask.status == 1) {
               if (useBufferedSocket) {
                  var1 = method1841((Socket)NetSocket.socketTask.result, 40000, 5000);
               } else {
                  var1 = new NetSocket((Socket)NetSocket.socketTask.result, GameEngine.taskHandler, 5000);
               }

               packetWriter.setSocket((AbstractSocket)var1);
               NetSocket.socketTask = null;
               loginState = 2;
            }
         }

         PacketBufferNode var4;
         if (loginState == 2) {
            packetWriter.clearBuffer();
            if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
               var4 = new PacketBufferNode();
            } else {
               var4 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
            }

            var4.clientPacket = null;
            var4.clientPacketLength = 0;
            var4.packetBuffer = new PacketBuffer(5000);
            var4.packetBuffer.writeByte(LoginPacket.field2342.id);
            packetWriter.addNode(var4);
            packetWriter.flush();
            var2.offset = 0;
            loginState = 3;
         }

         boolean var12;
         int var13;
         if (loginState == 3) {
            if (class197.pcmPlayer0 != null) {
               class197.pcmPlayer0.method2612();
            }

            if (WorldMapDecorationType.pcmPlayer1 != null) {
               WorldMapDecorationType.pcmPlayer1.method2612();
            }

            var12 = true;
            if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
               var12 = false;
            }

            if (var12) {
               var13 = ((AbstractSocket)var1).readUnsignedByte();
               if (class197.pcmPlayer0 != null) {
                  class197.pcmPlayer0.method2612();
               }

               if (WorldMapDecorationType.pcmPlayer1 != null) {
                  WorldMapDecorationType.pcmPlayer1.method2612();
               }

               if (var13 != 0) {
                  class52.getLoginError(var13);
                  return;
               }

               var2.offset = 0;
               loginState = 4;
            }
         }

         int var35;
         if (loginState == 4) {
            if (var2.offset < 8) {
               var35 = ((AbstractSocket)var1).available();
               if (var35 > 8 - var2.offset) {
                  var35 = 8 - var2.offset;
               }

               if (var35 > 0) {
                  ((AbstractSocket)var1).read(var2.array, var2.offset, var35);
                  var2.offset += var35;
               }
            }

            if (var2.offset == 8) {
               var2.offset = 0;
               class236.field3108 = var2.readLong();
               loginState = 5;
            }
         }

         int var7;
         int var9;
         int var15;
         if (loginState == 5) {
            packetWriter.packetBuffer.offset = 0;
            packetWriter.clearBuffer();
            PacketBuffer var3 = new PacketBuffer(500);
            int[] var27 = new int[]{WorldMapManager.secureRandom.nextInt(), WorldMapManager.secureRandom.nextInt(), WorldMapManager.secureRandom.nextInt(), WorldMapManager.secureRandom.nextInt()};
            var3.offset = 0;
            var3.writeByte(1);
            var3.writeInt(var27[0]);
            var3.writeInt(var27[1]);
            var3.writeInt(var27[2]);
            var3.writeInt(var27[3]);
            var3.writeLong(class236.field3108);
            int var11;
            if (gameState == 40) {
               var3.writeInt(class1.field5[0]);
               var3.writeInt(class1.field5[1]);
               var3.writeInt(class1.field5[2]);
               var3.writeInt(class1.field5[3]);
            } else {
               var3.writeByte(field661.rsOrdinal());
               switch(field661.field2014) {
               case 0:
               case 2:
                  var3.writeMedium(Canvas.field439);
                  ++var3.offset;
                  break;
               case 1:
                  var3.offset += 4;
                  break;
               case 3:
                  LinkedHashMap var6 = WorldMapSectionType.clientPreferences.parameters;
                  String var8 = Login.Login_username;
                  var9 = var8.length();
                  int var10 = 0;

                  for(var11 = 0; var11 < var9; ++var11) {
                     var10 = (var10 << 5) - var10 + var8.charAt(var11);
                  }

                  var3.writeInt((Integer)var6.get(var10));
               }

               var3.writeByte(class323.field3852.rsOrdinal());
               var3.writeStringCp1252NullTerminated(Login.Login_password);
            }

            var3.encryptRsa(class92.field1184, class92.field1177);
            class1.field5 = var27;
            PacketBufferNode var30;
            if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
               var30 = new PacketBufferNode();
            } else {
               var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
            }

            var30.clientPacket = null;
            var30.clientPacketLength = 0;
            var30.packetBuffer = new PacketBuffer(5000);
            var30.packetBuffer.offset = 0;
            if (gameState == 40) {
               var30.packetBuffer.writeByte(LoginPacket.field2338.id);
            } else {
               var30.packetBuffer.writeByte(LoginPacket.field2336.id);
            }

            var30.packetBuffer.writeShort(0);
            var7 = var30.packetBuffer.offset;
            var30.packetBuffer.writeInt(194);
            var30.packetBuffer.writeInt(1);
            var30.packetBuffer.writeByte(clientType);
            var30.packetBuffer.writeByte(field667);
            var30.packetBuffer.writeBytes(var3.array, 0, var3.offset);
            var15 = var30.packetBuffer.offset;
            var30.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
            var30.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
            var30.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth);
            var30.packetBuffer.writeShort(class25.canvasHeight);
            GrandExchangeOfferOwnWorldComparator.method1378(var30.packetBuffer);
            var30.packetBuffer.writeStringCp1252NullTerminated(AccessFile.field4100);
            var30.packetBuffer.writeInt(ItemLayer.field1562);
            Buffer var16 = new Buffer(GrandExchangeOfferUnitPriceComparator.platformInfo.size());
            GrandExchangeOfferUnitPriceComparator.platformInfo.write(var16);
            var30.packetBuffer.writeBytes(var16.array, 0, var16.array.length);
            var30.packetBuffer.writeByte(clientType);
            var30.packetBuffer.writeInt(0);
            var30.packetBuffer.method5876(class8.archive5.hash);
            var30.packetBuffer.method5781(UrlRequester.archive6.hash);
            var30.packetBuffer.method5781(WorldMapData_0.archive7.hash);
            var30.packetBuffer.method5736(WorldMapManager.archive11.hash);
            var30.packetBuffer.method5736(ModeWhere.archive8.hash);
            var30.packetBuffer.method5736(WorldMapSection0.archive12.hash);
            var30.packetBuffer.method5736(PlayerComposition.archive3.hash);
            var30.packetBuffer.method5781(CollisionMap.archive13.hash);
            var30.packetBuffer.writeInt(Login.archive20.hash);
            var30.packetBuffer.writeInt(class25.archive18.hash);
            var30.packetBuffer.writeInt(ViewportMouse.archive9.hash);
            var30.packetBuffer.writeInt(Tiles.archive14.hash);
            var30.packetBuffer.writeInt(LoginScreenAnimation.archive10.hash);
            var30.packetBuffer.method5781(ArchiveLoader.archive19.hash);
            var30.packetBuffer.method5876(WorldMapIcon_0.archive2.hash);
            var30.packetBuffer.writeInt(ItemComposition.archive17.hash);
            var30.packetBuffer.method5781(class52.archive0.hash);
            var30.packetBuffer.method5781(0);
            var30.packetBuffer.writeInt(WorldMapCacheName.archive4.hash);
            var30.packetBuffer.method5876(SpriteMask.archive15.hash);
            var30.packetBuffer.method5876(SpriteMask.archive1.hash);
            var30.packetBuffer.xteaEncrypt(var27, var15, var30.packetBuffer.offset);
            var30.packetBuffer.writeLengthShort(var30.packetBuffer.offset - var7);
            packetWriter.addNode(var30);
            packetWriter.flush();
            packetWriter.isaacCipher = new IsaacCipher(var27);
            int[] var17 = new int[4];

            for(var11 = 0; var11 < 4; ++var11) {
               var17[var11] = var27[var11] + 50;
            }

            var2.newIsaacCipher(var17);
            loginState = 6;
         }

         if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
            var35 = ((AbstractSocket)var1).readUnsignedByte();
            if (var35 == 21 && gameState == 20) {
               loginState = 12;
            } else if (var35 == 2) {
               loginState = 14;
            } else if (var35 == 15 && gameState == 40) {
               packetWriter.serverPacketLength = -1;
               loginState = 19;
            } else if (var35 == 64) {
               loginState = 10;
            } else if (var35 == 23 && field786 < 1) {
               ++field786;
               loginState = 0;
            } else if (var35 == 29) {
               loginState = 17;
            } else {
               if (var35 != 69) {
                  class52.getLoginError(var35);
                  return;
               }

               loginState = 7;
            }
         }

         if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
            ((AbstractSocket)var1).read(var2.array, 0, 2);
            var2.offset = 0;
            Decimator.field1480 = var2.readUnsignedShort();
            loginState = 8;
         }

         if (loginState == 8 && ((AbstractSocket)var1).available() >= Decimator.field1480) {
            var2.offset = 0;
            ((AbstractSocket)var1).read(var2.array, var2.offset, Decimator.field1480);
            class7 var23 = WorldMapIcon_1.method376()[var2.readUnsignedByte()];

            try {
               switch(var23.field36) {
               case 0:
                  class5 var28 = new class5();
                  this.field782 = new class9(var2, var28);
                  loginState = 9;
                  break;
               default:
                  throw new IllegalArgumentException();
               }
            } catch (Exception var21) {
               class52.getLoginError(22);
               return;
            }
         }

         if (loginState == 9 && this.field782.method108()) {
            this.field702 = this.field782.method94();
            this.field782.method93();
            this.field782 = null;
            if (this.field702 == null) {
               class52.getLoginError(22);
               return;
            }

            packetWriter.clearBuffer();
            if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
               var4 = new PacketBufferNode();
            } else {
               var4 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
            }

            var4.clientPacket = null;
            var4.clientPacketLength = 0;
            var4.packetBuffer = new PacketBuffer(5000);
            var4.packetBuffer.writeByte(LoginPacket.field2337.id);
            var4.packetBuffer.writeShort(this.field702.offset);
            var4.packetBuffer.method5683(this.field702);
            packetWriter.addNode(var4);
            packetWriter.flush();
            this.field702 = null;
            loginState = 6;
         }

         if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
            MilliClock.field2032 = ((AbstractSocket)var1).readUnsignedByte();
            loginState = 11;
         }

         if (loginState == 11 && ((AbstractSocket)var1).available() >= MilliClock.field2032) {
            ((AbstractSocket)var1).read(var2.array, 0, MilliClock.field2032);
            var2.offset = 0;
            loginState = 6;
         }

         if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
            field701 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
            loginState = 13;
         }

         if (loginState == 13) {
            field696 = 0;
            InvDefinition.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field701 / 60 + " seconds.");
            if (--field701 <= 0) {
               loginState = 0;
            }

         } else {
            if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
               UserComparator7.field1999 = ((AbstractSocket)var1).readUnsignedByte();
               loginState = 15;
            }

            boolean var36;
            if (loginState == 15 && ((AbstractSocket)var1).available() >= UserComparator7.field1999) {
               var12 = ((AbstractSocket)var1).readUnsignedByte() == 1;
               ((AbstractSocket)var1).read(var2.array, 0, 4);
               var2.offset = 0;
               var36 = false;
               if (var12) {
                  var13 = var2.readByteIsaac() << 24;
                  var13 |= var2.readByteIsaac() << 16;
                  var13 |= var2.readByteIsaac() << 8;
                  var13 |= var2.readByteIsaac();
                  String var33 = Login.Login_username;
                  var7 = var33.length();
                  var15 = 0;
                  var9 = 0;

                  while(true) {
                     if (var9 >= var7) {
                        if (WorldMapSectionType.clientPreferences.parameters.size() >= 10 && !WorldMapSectionType.clientPreferences.parameters.containsKey(var15)) {
                           Iterator var34 = WorldMapSectionType.clientPreferences.parameters.entrySet().iterator();
                           var34.next();
                           var34.remove();
                        }

                        WorldMapSectionType.clientPreferences.parameters.put(var15, var13);
                        break;
                     }

                     var15 = (var15 << 5) - var15 + var33.charAt(var9);
                     ++var9;
                  }
               }

               if (Login_isUsernameRemembered) {
                  WorldMapSectionType.clientPreferences.rememberedUsername = Login.Login_username;
               } else {
                  WorldMapSectionType.clientPreferences.rememberedUsername = null;
               }

               class23.savePreferences();
               staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
               playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
               localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
               localPlayerIndex <<= 8;
               localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
               field673 = ((AbstractSocket)var1).readUnsignedByte();
               ((AbstractSocket)var1).read(var2.array, 0, 1);
               var2.offset = 0;
               ServerPacket[] var5 = WorldMapRegion.ServerPacket_values();
               int var19 = var2.readSmartByteShortIsaac();
               if (var19 < 0 || var19 >= var5.length) {
                  throw new IOException(var19 + " " + var2.offset);
               }

               packetWriter.serverPacket = var5[var19];
               packetWriter.serverPacketLength = packetWriter.serverPacket.length;
               ((AbstractSocket)var1).read(var2.array, 0, 2);
               var2.offset = 0;
               packetWriter.serverPacketLength = var2.readUnsignedShort();

               try {
                  Client var14 = class1.client;
                  JSObject.getWindow(var14).call("zap", (Object[])null);
               } catch (Throwable var20) {
                  ;
               }

               loginState = 16;
            }

            if (loginState != 16) {
               if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, 2);
                  var2.offset = 0;
                  Interpreter.field1116 = var2.readUnsignedShort();
                  loginState = 18;
               }

               if (loginState == 18 && ((AbstractSocket)var1).available() >= Interpreter.field1116) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, Interpreter.field1116);
                  var2.offset = 0;
                  String var26 = var2.readStringCp1252NullTerminated();
                  String var32 = var2.readStringCp1252NullTerminated();
                  String var29 = var2.readStringCp1252NullTerminated();
                  InvDefinition.setLoginResponseString(var26, var32, var29);
                  ItemContainer.updateGameState(10);
               }

               if (loginState == 19) {
                  if (packetWriter.serverPacketLength == -1) {
                     if (((AbstractSocket)var1).available() < 2) {
                        return;
                     }

                     ((AbstractSocket)var1).read(var2.array, 0, 2);
                     var2.offset = 0;
                     packetWriter.serverPacketLength = var2.readUnsignedShort();
                  }

                  if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
                     ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
                     var2.offset = 0;
                     var35 = packetWriter.serverPacketLength;
                     timer.method5200();
                     class232.method4323();
                     class234.updatePlayer(var2);
                     if (var35 != var2.offset) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field696;
                  if (field696 > 2000) {
                     if (field786 < 1) {
                        if (MouseRecorder.port1 == DynamicObject.port3) {
                           DynamicObject.port3 = class171.port2;
                        } else {
                           DynamicObject.port3 = MouseRecorder.port1;
                        }

                        ++field786;
                        loginState = 0;
                     } else {
                        class52.getLoginError(-3);
                     }
                  }
               }
            } else {
               if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
                  timer.method5198();
                  mouseLastLastPressedTimeMillis = -1L;
                  Friend.mouseRecorder.index = 0;
                  PcmPlayer.hasFocus = true;
                  hadFocus = true;
                  field888 = -1L;
                  ScriptEvent.method1271();
                  packetWriter.clearBuffer();
                  packetWriter.packetBuffer.offset = 0;
                  packetWriter.serverPacket = null;
                  packetWriter.field1331 = null;
                  packetWriter.field1333 = null;
                  packetWriter.field1334 = null;
                  packetWriter.serverPacketLength = 0;
                  packetWriter.field1330 = 0;
                  rebootTimer = 0;
                  logoutTimer = 0;
                  hintArrowType = 0;
                  menuOptionsCount = 0;
                  isMenuOpen = false;
                  MouseHandler.MouseHandler_idleCycles = 0;
                  Messages.Messages_channels.clear();
                  Messages.Messages_hashTable.clear();
                  Messages.Messages_queue.clear();
                  Messages.Messages_count = 0;
                  isItemSelected = 0;
                  isSpellSelected = false;
                  soundEffectCount = 0;
                  camAngleY = 0;
                  oculusOrbState = 0;
                  HealthBarUpdate.field1016 = null;
                  minimapState = 0;
                  field889 = -1;
                  destinationX = 0;
                  destinationY = 0;
                  playerAttackOption = AttackOption.AttackOption_hidden;
                  npcAttackOption = AttackOption.AttackOption_hidden;
                  npcCount = 0;
                  class90.method2191();

                  for(var35 = 0; var35 < 2048; ++var35) {
                     players[var35] = null;
                  }

                  for(var35 = 0; var35 < 32768; ++var35) {
                     npcs[var35] = null;
                  }

                  combatTargetPlayerIndex = -1;
                  projectiles.clear();
                  graphicsObjects.clear();

                  int var18;
                  for(var35 = 0; var35 < 4; ++var35) {
                     for(var13 = 0; var13 < 104; ++var13) {
                        for(var18 = 0; var18 < 104; ++var18) {
                           groundItems[var35][var13][var18] = null;
                        }
                     }
                  }

                  pendingSpawns = new NodeDeque();
                  InterfaceParent.friendSystem.clear();

                  for(var35 = 0; var35 < class58.VarpDefinition_fileCount; ++var35) {
                     VarpDefinition var31 = class204.VarpDefinition_get(var35);
                     if (var31 != null) {
                        Varps.Varps_temp[var35] = 0;
                        Varps.Varps_main[var35] = 0;
                     }
                  }

                  GrandExchangeOffer.varcs.clearTransient();
                  followerIndex = -1;
                  if (rootInterface != -1) {
                     var35 = rootInterface;
                     if (var35 != -1 && Widget.Widget_loadedInterfaces[var35]) {
                        FontName.Widget_archive.clearFilesGroup(var35);
                        if (DefaultsGroup.Widget_interfaceComponents[var35] != null) {
                           var36 = true;

                           for(var18 = 0; var18 < DefaultsGroup.Widget_interfaceComponents[var35].length; ++var18) {
                              if (DefaultsGroup.Widget_interfaceComponents[var35][var18] != null) {
                                 if (DefaultsGroup.Widget_interfaceComponents[var35][var18].type != 2) {
                                    DefaultsGroup.Widget_interfaceComponents[var35][var18] = null;
                                 } else {
                                    var36 = false;
                                 }
                              }
                           }

                           if (var36) {
                              DefaultsGroup.Widget_interfaceComponents[var35] = null;
                           }

                           Widget.Widget_loadedInterfaces[var35] = false;
                        }
                     }
                  }

                  for(InterfaceParent var24 = (InterfaceParent)interfaceParents.first(); var24 != null; var24 = (InterfaceParent)interfaceParents.next()) {
                     GrandExchangeOffer.closeInterface(var24, true);
                  }

                  rootInterface = -1;
                  interfaceParents = new NodeHashTable(8);
                  meslayerContinueWidget = null;
                  menuOptionsCount = 0;
                  isMenuOpen = false;
                  playerComposition.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

                  for(var35 = 0; var35 < 8; ++var35) {
                     playerMenuActions[var35] = null;
                     playerOptionsPriorities[var35] = false;
                  }

                  ItemContainer.itemContainers = new NodeHashTable(32);
                  isLoading = true;

                  for(var35 = 0; var35 < 100; ++var35) {
                     field816[var35] = true;
                  }

                  PacketBufferNode var25 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2290, packetWriter.isaacCipher);
                  var25.packetBuffer.writeByte(BoundaryObject.getWindowedMode());
                  var25.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth);
                  var25.packetBuffer.writeShort(class25.canvasHeight);
                  packetWriter.addNode(var25);
                  WorldMapID.clanChat = null;

                  for(var35 = 0; var35 < 8; ++var35) {
                     grandExchangeOffers[var35] = new GrandExchangeOffer();
                  }

                  WorldMapSectionType.grandExchangeEvents = null;
                  class234.updatePlayer(var2);
                  class3.field24 = -1;
                  class105.loadRegions(false, var2);
                  packetWriter.serverPacket = null;
               }

            }
         }
      } catch (IOException var22) {
         if (field786 < 1) {
            if (MouseRecorder.port1 == DynamicObject.port3) {
               DynamicObject.port3 = class171.port2;
            } else {
               DynamicObject.port3 = MouseRecorder.port1;
            }

            ++field786;
            loginState = 0;
         } else {
            class52.getLoginError(-2);
         }
      }
   }

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1783037227"
   )
   @Export("doCycleLoggedIn")
   final void doCycleLoggedIn() {
      if (rebootTimer > 1) {
         --rebootTimer;
      }

      if (logoutTimer > 0) {
         --logoutTimer;
      }

      if (field712) {
         field712 = false;
         class8.method90();
      } else {
         if (!isMenuOpen) {
            Player.addCancelMenuEntry();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1701(packetWriter); ++var1) {
            ;
         }

         if (gameState == 30) {
            int var2;
            PacketBufferNode var14;
            while(GrandExchangeOfferOwnWorldComparator.method1366()) {
               var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2315, packetWriter.isaacCipher);
               var14.packetBuffer.writeByte(0);
               var2 = var14.packetBuffer.offset;
               AbstractWorldMapData.performReflectionCheck(var14.packetBuffer);
               var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
               packetWriter.addNode(var14);
            }

            if (timer.field3616) {
               var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2301, packetWriter.isaacCipher);
               var14.packetBuffer.writeByte(0);
               var2 = var14.packetBuffer.offset;
               timer.write(var14.packetBuffer);
               var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
               packetWriter.addNode(var14);
               timer.method5199();
            }

            Object var33 = Friend.mouseRecorder.lock;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            synchronized(Friend.mouseRecorder.lock) {
               if (!field863) {
                  Friend.mouseRecorder.index = 0;
               } else if (MouseHandler.MouseHandler_lastButton != 0 || Friend.mouseRecorder.index >= 40) {
                  PacketBufferNode var15 = null;
                  var3 = 0;
                  var4 = 0;
                  var5 = 0;
                  var6 = 0;

                  for(var7 = 0; var7 < Friend.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
                     var4 = var7;
                     var8 = Friend.mouseRecorder.ys[var7];
                     if (var8 < -1) {
                        var8 = -1;
                     } else if (var8 > 65534) {
                        var8 = 65534;
                     }

                     var9 = Friend.mouseRecorder.xs[var7];
                     if (var9 < -1) {
                        var9 = -1;
                     } else if (var9 > 65534) {
                        var9 = 65534;
                     }

                     if (var9 != field675 || var8 != field687) {
                        if (var15 == null) {
                           var15 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2240, packetWriter.isaacCipher);
                           var15.packetBuffer.writeByte(0);
                           var3 = var15.packetBuffer.offset;
                           var15.packetBuffer.offset += 2;
                           var5 = 0;
                           var6 = 0;
                        }

                        if (-1L != field853) {
                           var10 = var9 - field675;
                           var11 = var8 - field687;
                           var12 = (int)((Friend.mouseRecorder.millis[var7] - field853) / 20L);
                           var5 = (int)((long)var5 + (Friend.mouseRecorder.millis[var7] - field853) % 20L);
                        } else {
                           var10 = var9;
                           var11 = var8;
                           var12 = Integer.MAX_VALUE;
                        }

                        field675 = var9;
                        field687 = var8;
                        if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                           var10 += 32;
                           var11 += 32;
                           var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
                        } else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                           var10 += 128;
                           var11 += 128;
                           var15.packetBuffer.writeByte(var12 + 128);
                           var15.packetBuffer.writeShort(var11 + (var10 << 8));
                        } else if (var12 < 32) {
                           var15.packetBuffer.writeByte(var12 + 192);
                           if (var9 != -1 && var8 != -1) {
                              var15.packetBuffer.writeInt(var9 | var8 << 16);
                           } else {
                              var15.packetBuffer.writeInt(Integer.MIN_VALUE);
                           }
                        } else {
                           var15.packetBuffer.writeShort((var12 & 8191) + '\ue000');
                           if (var9 != -1 && var8 != -1) {
                              var15.packetBuffer.writeInt(var9 | var8 << 16);
                           } else {
                              var15.packetBuffer.writeInt(Integer.MIN_VALUE);
                           }
                        }

                        ++var6;
                        field853 = Friend.mouseRecorder.millis[var7];
                     }
                  }

                  if (var15 != null) {
                     var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3);
                     var7 = var15.packetBuffer.offset;
                     var15.packetBuffer.offset = var3;
                     var15.packetBuffer.writeByte(var5 / var6);
                     var15.packetBuffer.writeByte(var5 % var6);
                     var15.packetBuffer.offset = var7;
                     packetWriter.addNode(var15);
                  }

                  if (var4 >= Friend.mouseRecorder.index) {
                     Friend.mouseRecorder.index = 0;
                  } else {
                     Friend.mouseRecorder.index -= var4;
                     System.arraycopy(Friend.mouseRecorder.xs, var4, Friend.mouseRecorder.xs, 0, Friend.mouseRecorder.index);
                     System.arraycopy(Friend.mouseRecorder.ys, var4, Friend.mouseRecorder.ys, 0, Friend.mouseRecorder.index);
                     System.arraycopy(Friend.mouseRecorder.millis, var4, Friend.mouseRecorder.millis, 0, Friend.mouseRecorder.index);
                  }
               }
            }

            PacketBufferNode var18;
            if (MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
               long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
               if (var16 > 32767L) {
                  var16 = 32767L;
               }

               mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
               var3 = MouseHandler.MouseHandler_lastPressedY;
               if (var3 < 0) {
                  var3 = 0;
               } else if (var3 > class25.canvasHeight) {
                  var3 = class25.canvasHeight;
               }

               var4 = MouseHandler.MouseHandler_lastPressedX;
               if (var4 < 0) {
                  var4 = 0;
               } else if (var4 > GrandExchangeOfferTotalQuantityComparator.canvasWidth) {
                  var4 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
               }

               var5 = (int)var16;
               var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2276, packetWriter.isaacCipher);
               var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
               var18.packetBuffer.writeShort(var4);
               var18.packetBuffer.writeShort(var3);
               packetWriter.addNode(var18);
            }

            if (KeyHandler.field421 > 0) {
               var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher);
               var14.packetBuffer.writeShort(0);
               var2 = var14.packetBuffer.offset;
               long var19 = Tiles.currentTimeMillis();

               for(var5 = 0; var5 < KeyHandler.field421; ++var5) {
                  long var21 = var19 - field888;
                  if (var21 > 16777215L) {
                     var21 = 16777215L;
                  }

                  field888 = var19;
                  var14.packetBuffer.method5732((int)var21);
                  var14.packetBuffer.method5883(KeyHandler.field420[var5]);
               }

               var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
               packetWriter.addNode(var14);
            }

            if (field926 > 0) {
               --field926;
            }

            if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
               field678 = true;
            }

            if (field678 && field926 <= 0) {
               field926 = 20;
               field678 = false;
               var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2334, packetWriter.isaacCipher);
               var14.packetBuffer.writeShortLE(camAngleY);
               var14.packetBuffer.writeIntME(camAngleX);
               packetWriter.addNode(var14);
            }

            if (PcmPlayer.hasFocus && !hadFocus) {
               hadFocus = true;
               var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2234, packetWriter.isaacCipher);
               var14.packetBuffer.writeByte(1);
               packetWriter.addNode(var14);
            }

            if (!PcmPlayer.hasFocus && hadFocus) {
               hadFocus = false;
               var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2234, packetWriter.isaacCipher);
               var14.packetBuffer.writeByte(0);
               packetWriter.addNode(var14);
            }

            if (SoundSystem.worldMap != null) {
               SoundSystem.worldMap.method6584();
            }

            if (KeyHandler.ClanChat_inClanChat) {
               if (WorldMapID.clanChat != null) {
                  WorldMapID.clanChat.sort();
               }

               for(var1 = 0; var1 < Players.Players_count; ++var1) {
                  Player var35 = players[Players.Players_indices[var1]];
                  var35.clearIsInClanChat();
               }

               KeyHandler.ClanChat_inClanChat = false;
            }

            Renderable.method3417();
            if (gameState == 30) {
               WorldMapSectionType.method319();
               WorldMapLabel.method502();
               ++packetWriter.field1330;
               if (packetWriter.field1330 > 750) {
                  class8.method90();
               } else {
                  WorldMapRectangle.method354();

                  for(var1 = 0; var1 < npcCount; ++var1) {
                     var2 = npcIndices[var1];
                     NPC var23 = npcs[var2];
                     if (var23 != null) {
                        class171.updateActorSequence(var23, var23.definition.size);
                     }
                  }

                  Actor.method1868();
                  ++field808;
                  if (mouseCrossColor != 0) {
                     mouseCrossState = mouseCrossState * 400 + 400;
                     if (mouseCrossState * 20 >= 400) {
                        mouseCrossColor = 0;
                     }
                  }

                  if (WorldMapSprite.field260 != null) {
                     ++field770;
                     if (field770 >= 15) {
                        IsaacCipher.invalidateWidget(WorldMapSprite.field260);
                        WorldMapSprite.field260 = null;
                     }
                  }

                  Widget var34 = Canvas.mousedOverWidgetIf1;
                  Widget var36 = GrandExchangeOffer.field100;
                  Canvas.mousedOverWidgetIf1 = null;
                  GrandExchangeOffer.field100 = null;
                  draggedOnWidget = null;
                  field754 = false;
                  field912 = false;
                  field885 = 0;

                  while(Varcs.isKeyDown() && field885 < 128) {
                     if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && ModeWhere.field2417 == 66) {
                        String var24 = "";

                        Message var37;
                        for(Iterator var25 = Messages.Messages_hashTable.iterator(); var25.hasNext(); var24 = var24 + var37.sender + ':' + var37.text + '\n') {
                           var37 = (Message)var25.next();
                        }

                        class1.client.clipboardSetString(var24);
                     } else if (oculusOrbState != 1 || WorldMapID.field299 <= 0) {
                        field738[field885] = ModeWhere.field2417;
                        field886[field885] = WorldMapID.field299;
                        ++field885;
                     }
                  }

                  if (TriBool.method5372() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
                     var3 = UserComparator9.localPlayer.plane - mouseWheelRotation;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > 3) {
                        var3 = 3;
                     }

                     if (var3 != UserComparator9.localPlayer.plane) {
                        var4 = UserComparator9.localPlayer.pathX[0] + GrandExchangeOfferNameComparator.baseX * 64;
                        var5 = UserComparator9.localPlayer.pathY[0] + NetCache.baseY * 64;
                        var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2230, packetWriter.isaacCipher);
                        var18.packetBuffer.writeShortLE(var5);
                        var18.packetBuffer.method5883(var3);
                        var18.packetBuffer.method5736(0);
                        var18.packetBuffer.writeIntME(var4);
                        packetWriter.addNode(var18);
                     }

                     mouseWheelRotation = 0;
                  }

                  if (rootInterface != -1) {
                     class22.updateRootInterface(rootInterface, 0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight, 0, 0);
                  }

                  ++cycleCntr;

                  while(true) {
                     ScriptEvent var38;
                     Widget var40;
                     Widget var41;
                     do {
                        var38 = (ScriptEvent)field660.removeLast();
                        if (var38 == null) {
                           while(true) {
                              do {
                                 var38 = (ScriptEvent)field865.removeLast();
                                 if (var38 == null) {
                                    while(true) {
                                       do {
                                          var38 = (ScriptEvent)scriptEvents.removeLast();
                                          if (var38 == null) {
                                             this.menu();
                                             class2.method27();
                                             if (clickedWidget != null) {
                                                this.method1403();
                                             }

                                             PacketBufferNode var42;
                                             if (JagexCache.dragInventoryWidget != null) {
                                                IsaacCipher.invalidateWidget(JagexCache.dragInventoryWidget);
                                                ++itemDragDuration;
                                                if (MouseHandler.MouseHandler_currentButton == 0) {
                                                   if (field776) {
                                                      if (JagexCache.dragInventoryWidget == HorizontalAlignment.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) {
                                                         Widget var39 = JagexCache.dragInventoryWidget;
                                                         byte var30 = 0;
                                                         if (field829 == 1 && var39.contentType == 206) {
                                                            var30 = 1;
                                                         }

                                                         if (var39.itemIds[dragItemSlotDestination] <= 0) {
                                                            var30 = 0;
                                                         }

                                                         if (ModeWhere.method3867(class60.getWidgetFlags(var39))) {
                                                            var5 = dragItemSlotSource;
                                                            var6 = dragItemSlotDestination;
                                                            var39.itemIds[var6] = var39.itemIds[var5];
                                                            var39.itemQuantities[var6] = var39.itemQuantities[var5];
                                                            var39.itemIds[var5] = -1;
                                                            var39.itemQuantities[var5] = 0;
                                                         } else if (var30 == 1) {
                                                            var5 = dragItemSlotSource;
                                                            var6 = dragItemSlotDestination;

                                                            while(var5 != var6) {
                                                               if (var5 > var6) {
                                                                  var39.swapItems(var5 - 1, var5);
                                                                  --var5;
                                                               } else if (var5 < var6) {
                                                                  var39.swapItems(var5 + 1, var5);
                                                                  ++var5;
                                                               }
                                                            }
                                                         } else {
                                                            var39.swapItems(dragItemSlotDestination, dragItemSlotSource);
                                                         }

                                                         var42 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2243, packetWriter.isaacCipher);
                                                         var42.packetBuffer.method5725(dragItemSlotSource);
                                                         var42.packetBuffer.method5876(JagexCache.dragInventoryWidget.id);
                                                         var42.packetBuffer.writeShortLE(dragItemSlotDestination);
                                                         var42.packetBuffer.writeByte(var30);
                                                         packetWriter.addNode(var42);
                                                      }
                                                   } else if (this.shouldLeftClickOpenMenu()) {
                                                      this.openMenu(draggedWidgetX, draggedWidgetY);
                                                   } else if (menuOptionsCount > 0) {
                                                      LoginPacket.method3812(draggedWidgetX, draggedWidgetY);
                                                   }

                                                   field770 = 10;
                                                   MouseHandler.MouseHandler_lastButton = 0;
                                                   JagexCache.dragInventoryWidget = null;
                                                } else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
                                                   field776 = true;
                                                }
                                             }

                                             if (Scene.shouldSendWalk()) {
                                                var3 = Scene.Scene_selectedX;
                                                var4 = Scene.Scene_selectedY;
                                                var42 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2263, packetWriter.isaacCipher);
                                                var42.packetBuffer.writeByte(5);
                                                var42.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
                                                var42.packetBuffer.writeIntME(NetCache.baseY * 64 + var4);
                                                var42.packetBuffer.writeShort(GrandExchangeOfferNameComparator.baseX * 64 + var3);
                                                packetWriter.addNode(var42);
                                                Scene.method3281();
                                                mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
                                                mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
                                                mouseCrossColor = 1;
                                                mouseCrossState = 0;
                                                destinationX = var3;
                                                destinationY = var4;
                                             }

                                             if (var34 != Canvas.mousedOverWidgetIf1) {
                                                if (var34 != null) {
                                                   IsaacCipher.invalidateWidget(var34);
                                                }

                                                if (Canvas.mousedOverWidgetIf1 != null) {
                                                   IsaacCipher.invalidateWidget(Canvas.mousedOverWidgetIf1);
                                                }
                                             }

                                             if (var36 != GrandExchangeOffer.field100 && field925 == field815) {
                                                if (var36 != null) {
                                                   IsaacCipher.invalidateWidget(var36);
                                                }

                                                if (GrandExchangeOffer.field100 != null) {
                                                   IsaacCipher.invalidateWidget(GrandExchangeOffer.field100);
                                                }
                                             }

                                             if (GrandExchangeOffer.field100 != null) {
                                                if (field815 < field925) {
                                                   ++field815;
                                                   if (field815 == field925) {
                                                      IsaacCipher.invalidateWidget(GrandExchangeOffer.field100);
                                                   }
                                                }
                                             } else if (field815 > 0) {
                                                --field815;
                                             }

                                             if (oculusOrbState == 0) {
                                                var3 = UserComparator9.localPlayer.x;
                                                var4 = UserComparator9.localPlayer.y;
                                                if (HealthBarUpdate.oculusOrbFocalPointX - var3 < -500 || HealthBarUpdate.oculusOrbFocalPointX - var3 > 500 || ApproximateRouteStrategy.oculusOrbFocalPointY - var4 < -500 || ApproximateRouteStrategy.oculusOrbFocalPointY - var4 > 500) {
                                                   HealthBarUpdate.oculusOrbFocalPointX = var3;
                                                   ApproximateRouteStrategy.oculusOrbFocalPointY = var4;
                                                }

                                                if (var3 != HealthBarUpdate.oculusOrbFocalPointX) {
                                                   HealthBarUpdate.oculusOrbFocalPointX += (var3 - HealthBarUpdate.oculusOrbFocalPointX) / 16;
                                                }

                                                if (var4 != ApproximateRouteStrategy.oculusOrbFocalPointY) {
                                                   ApproximateRouteStrategy.oculusOrbFocalPointY += (var4 - ApproximateRouteStrategy.oculusOrbFocalPointY) / 16;
                                                }

                                                var5 = HealthBarUpdate.oculusOrbFocalPointX >> 7;
                                                var6 = ApproximateRouteStrategy.oculusOrbFocalPointY >> 7;
                                                var7 = WorldMapRegion.getTileHeight(HealthBarUpdate.oculusOrbFocalPointX, ApproximateRouteStrategy.oculusOrbFocalPointY, class90.Client_plane);
                                                var8 = 0;
                                                if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                                                   for(var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                                                      for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                         var11 = class90.Client_plane;
                                                         if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) {
                                                            ++var11;
                                                         }

                                                         var12 = var7 - Tiles.Tiles_heights[var11][var9][var10];
                                                         if (var12 > var8) {
                                                            var8 = var12;
                                                         }
                                                      }
                                                   }
                                                }

                                                var9 = var8 * 192;
                                                if (var9 > 98048) {
                                                   var9 = 98048;
                                                }

                                                if (var9 < 32768) {
                                                   var9 = 32768;
                                                }

                                                if (var9 > field880) {
                                                   field880 += (var9 - field880) / 24;
                                                } else if (var9 < field880) {
                                                   field880 += (var9 - field880) / 80;
                                                }

                                                ModelData0.field1882 = WorldMapRegion.getTileHeight(UserComparator9.localPlayer.x, UserComparator9.localPlayer.y, class90.Client_plane) - camFollowHeight;
                                             } else if (oculusOrbState == 1) {
                                                class13.method122();
                                                short var31 = -1;
                                                if (KeyHandler.KeyHandler_pressedKeys[33]) {
                                                   var31 = 0;
                                                } else if (KeyHandler.KeyHandler_pressedKeys[49]) {
                                                   var31 = 1024;
                                                }

                                                if (KeyHandler.KeyHandler_pressedKeys[48]) {
                                                   if (var31 == 0) {
                                                      var31 = 1792;
                                                   } else if (var31 == 1024) {
                                                      var31 = 1280;
                                                   } else {
                                                      var31 = 1536;
                                                   }
                                                } else if (KeyHandler.KeyHandler_pressedKeys[50]) {
                                                   if (var31 == 0) {
                                                      var31 = 256;
                                                   } else if (var31 == 1024) {
                                                      var31 = 768;
                                                   } else {
                                                      var31 = 512;
                                                   }
                                                }

                                                byte var32 = 0;
                                                if (KeyHandler.KeyHandler_pressedKeys[35]) {
                                                   var32 = -1;
                                                } else if (KeyHandler.KeyHandler_pressedKeys[51]) {
                                                   var32 = 1;
                                                }

                                                var5 = 0;
                                                if (var31 >= 0 || var32 != 0) {
                                                   var5 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
                                                   var5 *= 16;
                                                   field742 = var31;
                                                   field743 = var32;
                                                }

                                                if (field818 < var5) {
                                                   field818 += var5 / 8;
                                                   if (field818 > var5) {
                                                      field818 = var5;
                                                   }
                                                } else if (field818 > var5) {
                                                   field818 = field818 * 9 / 10;
                                                }

                                                if (field818 > 0) {
                                                   var6 = field818 / 16;
                                                   if (field742 >= 0) {
                                                      var3 = field742 - class39.cameraYaw & 2047;
                                                      var7 = Rasterizer3D.Rasterizer3D_sine[var3];
                                                      var8 = Rasterizer3D.Rasterizer3D_cosine[var3];
                                                      HealthBarUpdate.oculusOrbFocalPointX += var7 * var6 / 65536;
                                                      ApproximateRouteStrategy.oculusOrbFocalPointY += var8 * var6 / 65536;
                                                   }

                                                   if (field743 != 0) {
                                                      ModelData0.field1882 += var6 * field743;
                                                      if (ModelData0.field1882 > 0) {
                                                         ModelData0.field1882 = 0;
                                                      }
                                                   }
                                                } else {
                                                   field742 = -1;
                                                   field743 = -1;
                                                }

                                                if (KeyHandler.KeyHandler_pressedKeys[13]) {
                                                   packetWriter.addNode(WorldMapSprite.getPacketBufferNode(ClientPacket.field2296, packetWriter.isaacCipher));
                                                   oculusOrbState = 0;
                                                }
                                             }

                                             if (MouseHandler.MouseHandler_currentButton == 4 && class8.mouseCam) {
                                                var3 = MouseHandler.MouseHandler_y - mouseCamClickedY;
                                                camAngleDX = var3 * 2;
                                                mouseCamClickedY = var3 != -1 && var3 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
                                                var4 = mouseCamClickedX - MouseHandler.MouseHandler_x;
                                                camAngleDY = var4 * 2;
                                                mouseCamClickedX = var4 != -1 && var4 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
                                             } else {
                                                if (KeyHandler.KeyHandler_pressedKeys[96]) {
                                                   camAngleDY += (-24 - camAngleDY) / 2;
                                                } else if (KeyHandler.KeyHandler_pressedKeys[97]) {
                                                   camAngleDY += (24 - camAngleDY) / 2;
                                                } else {
                                                   camAngleDY /= 2;
                                                }

                                                if (KeyHandler.KeyHandler_pressedKeys[98]) {
                                                   camAngleDX += (12 - camAngleDX) / 2;
                                                } else if (KeyHandler.KeyHandler_pressedKeys[99]) {
                                                   camAngleDX += (-12 - camAngleDX) / 2;
                                                } else {
                                                   camAngleDX /= 2;
                                                }

                                                mouseCamClickedY = MouseHandler.MouseHandler_y;
                                                mouseCamClickedX = MouseHandler.MouseHandler_x;
                                             }

                                             camAngleY = camAngleDY / 2 + camAngleY & 2047;
                                             camAngleX += camAngleDX / 2;
                                             if (camAngleX < 128) {
                                                camAngleX = 128;
                                             }

                                             if (camAngleX > 383) {
                                                camAngleX = 383;
                                             }

                                             if (isCameraLocked) {
                                                var3 = WorldMapManager.field345 * 16384 + 64;
                                                var4 = Decimator.field1475 * 16384 + 64;
                                                var5 = WorldMapRegion.getTileHeight(var3, var4, class90.Client_plane) - Clock.field2079;
                                                if (SecureRandomFuture.cameraX < var3) {
                                                   SecureRandomFuture.cameraX = (var3 - SecureRandomFuture.cameraX) * class228.field2740 / 1000 + SecureRandomFuture.cameraX + JagexCache.field2056;
                                                   if (SecureRandomFuture.cameraX > var3) {
                                                      SecureRandomFuture.cameraX = var3;
                                                   }
                                                }

                                                if (SecureRandomFuture.cameraX > var3) {
                                                   SecureRandomFuture.cameraX -= class228.field2740 * (SecureRandomFuture.cameraX - var3) / 1000 + JagexCache.field2056;
                                                   if (SecureRandomFuture.cameraX < var3) {
                                                      SecureRandomFuture.cameraX = var3;
                                                   }
                                                }

                                                if (ArchiveLoader.cameraY < var5) {
                                                   ArchiveLoader.cameraY = (var5 - ArchiveLoader.cameraY) * class228.field2740 / 1000 + ArchiveLoader.cameraY + JagexCache.field2056;
                                                   if (ArchiveLoader.cameraY > var5) {
                                                      ArchiveLoader.cameraY = var5;
                                                   }
                                                }

                                                if (ArchiveLoader.cameraY > var5) {
                                                   ArchiveLoader.cameraY -= class228.field2740 * (ArchiveLoader.cameraY - var5) / 1000 + JagexCache.field2056;
                                                   if (ArchiveLoader.cameraY < var5) {
                                                      ArchiveLoader.cameraY = var5;
                                                   }
                                                }

                                                if (ObjectSound.cameraZ < var4) {
                                                   ObjectSound.cameraZ = (var4 - ObjectSound.cameraZ) * class228.field2740 / 1000 + ObjectSound.cameraZ + JagexCache.field2056;
                                                   if (ObjectSound.cameraZ > var4) {
                                                      ObjectSound.cameraZ = var4;
                                                   }
                                                }

                                                if (ObjectSound.cameraZ > var4) {
                                                   ObjectSound.cameraZ -= class228.field2740 * (ObjectSound.cameraZ - var4) / 1000 + JagexCache.field2056;
                                                   if (ObjectSound.cameraZ < var4) {
                                                      ObjectSound.cameraZ = var4;
                                                   }
                                                }

                                                var3 = class25.field138 * 16384 + 64;
                                                var4 = GrandExchangeOfferUnitPriceComparator.field102 * 16384 + 64;
                                                var5 = WorldMapRegion.getTileHeight(var3, var4, class90.Client_plane) - Skeleton.field1809;
                                                var6 = var3 - SecureRandomFuture.cameraX;
                                                var7 = var5 - ArchiveLoader.cameraY;
                                                var8 = var4 - ObjectSound.cameraZ;
                                                var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8));
                                                var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047;
                                                var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047;
                                                if (var10 < 128) {
                                                   var10 = 128;
                                                }

                                                if (var10 > 383) {
                                                   var10 = 383;
                                                }

                                                if (KeyHandler.cameraPitch < var10) {
                                                   KeyHandler.cameraPitch = (var10 - KeyHandler.cameraPitch) * JagexCache.field2070 / 1000 + KeyHandler.cameraPitch + WorldMapEvent.field380;
                                                   if (KeyHandler.cameraPitch > var10) {
                                                      KeyHandler.cameraPitch = var10;
                                                   }
                                                }

                                                if (KeyHandler.cameraPitch > var10) {
                                                   KeyHandler.cameraPitch -= JagexCache.field2070 * (KeyHandler.cameraPitch - var10) / 1000 + WorldMapEvent.field380;
                                                   if (KeyHandler.cameraPitch < var10) {
                                                      KeyHandler.cameraPitch = var10;
                                                   }
                                                }

                                                var12 = var11 - class39.cameraYaw;
                                                if (var12 > 1024) {
                                                   var12 -= 2048;
                                                }

                                                if (var12 < -1024) {
                                                   var12 += 2048;
                                                }

                                                if (var12 > 0) {
                                                   class39.cameraYaw = class39.cameraYaw + WorldMapEvent.field380 + var12 * JagexCache.field2070 / 1000;
                                                   class39.cameraYaw &= 2047;
                                                }

                                                if (var12 < 0) {
                                                   class39.cameraYaw -= -var12 * JagexCache.field2070 / 1000 + WorldMapEvent.field380;
                                                   class39.cameraYaw &= 2047;
                                                }

                                                int var26 = var11 - class39.cameraYaw;
                                                if (var26 > 1024) {
                                                   var26 -= 2048;
                                                }

                                                if (var26 < -1024) {
                                                   var26 += 2048;
                                                }

                                                if (var26 < 0 && var12 > 0 || var26 > 0 && var12 < 0) {
                                                   class39.cameraYaw = var11;
                                                }
                                             }

                                             for(var3 = 0; var3 < 5; ++var3) {
                                                ++field911[var3];
                                             }

                                             GrandExchangeOffer.varcs.tryWrite();
                                             var3 = ++MouseHandler.MouseHandler_idleCycles - 1;
                                             var5 = KeyHandler.KeyHandler_idleCycles;
                                             PacketBufferNode var27;
                                             if (var3 > 15000 && var5 > 15000) {
                                                logoutTimer = 250;
                                                MouseHandler.MouseHandler_idleCycles = 14500;
                                                var27 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2298, packetWriter.isaacCipher);
                                                packetWriter.addNode(var27);
                                             }

                                             InterfaceParent.friendSystem.processFriendUpdates();
                                             ++packetWriter.pendingWrites;
                                             if (packetWriter.pendingWrites > 50) {
                                                var27 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2305, packetWriter.isaacCipher);
                                                packetWriter.addNode(var27);
                                             }

                                             try {
                                                packetWriter.flush();
                                             } catch (IOException var28) {
                                                class8.method90();
                                             }

                                             return;
                                          }

                                          var40 = var38.widget;
                                          if (var40.childIndex < 0) {
                                             break;
                                          }

                                          var41 = class237.getWidget(var40.parentId);
                                       } while(var41 == null || var41.children == null || var40.childIndex >= var41.children.length || var40 != var41.children[var40.childIndex]);

                                       PacketWriter.runScriptEvent(var38);
                                    }
                                 }

                                 var40 = var38.widget;
                                 if (var40.childIndex < 0) {
                                    break;
                                 }

                                 var41 = class237.getWidget(var40.parentId);
                              } while(var41 == null || var41.children == null || var40.childIndex >= var41.children.length || var40 != var41.children[var40.childIndex]);

                              PacketWriter.runScriptEvent(var38);
                           }
                        }

                        var40 = var38.widget;
                        if (var40.childIndex < 0) {
                           break;
                        }

                        var41 = class237.getWidget(var40.parentId);
                     } while(var41 == null || var41.children == null || var40.childIndex >= var41.children.length || var40 != var41.children[var40.childIndex]);

                     PacketWriter.runScriptEvent(var38);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "647800205"
   )
   @Export("resizeJS")
   void resizeJS() {
      int var1 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
      int var2 = class25.canvasHeight;
      if (super.contentWidth < var1) {
         var1 = super.contentWidth;
      }

      if (super.contentHeight < var2) {
         var2 = super.contentHeight;
      }

      if (WorldMapSectionType.clientPreferences != null) {
         try {
            class56.method923(class1.client, "resize", new Object[]{BoundaryObject.getWindowedMode()});
         } catch (Throwable var4) {
            ;
         }
      }

   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1573382643"
   )
   @Export("drawLoggedIn")
   final void drawLoggedIn() {
      int var1;
      if (rootInterface != -1) {
         var1 = rootInterface;
         if (WorldMapCacheName.loadInterface(var1)) {
            ApproximateRouteStrategy.drawModelComponents(DefaultsGroup.Widget_interfaceComponents[var1], -1);
         }
      }

      for(var1 = 0; var1 < rootWidgetCount; ++var1) {
         if (field816[var1]) {
            field827[var1] = true;
         }

         field871[var1] = field816[var1];
         field816[var1] = false;
      }

      field868 = cycle;
      viewportX = -1;
      viewportY = -1;
      HorizontalAlignment.hoveredItemContainer = null;
      if (rootInterface != -1) {
         rootWidgetCount = 0;
         ViewportMouse.drawWidgets(rootInterface, 0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (showMouseCross) {
         if (mouseCrossColor == 1) {
            Frames.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }

         if (mouseCrossColor == 2) {
            Frames.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }
      }

      int var2;
      int var3;
      if (!isMenuOpen) {
         if (viewportX != -1) {
            var1 = viewportX;
            var2 = viewportY;
            if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
               var3 = menuOptionsCount - 1;
               String var13;
               if (isItemSelected == 1 && menuOptionsCount < 2) {
                  var13 = "Use" + " " + selectedItemName + " " + "->";
               } else if (isSpellSelected && menuOptionsCount < 2) {
                  var13 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
               } else {
                  var13 = WorldMapLabel.method504(var3);
               }

               if (menuOptionsCount > 2) {
                  var13 = var13 + FileSystem.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
               }

               ScriptEvent.fontBold12.drawRandomAlphaAndSpacing(var13, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
            }
         }
      } else {
         var1 = ApproximateRouteStrategy.menuX;
         var2 = AbstractUserComparator.menuY;
         var3 = CollisionMap.menuWidth;
         int var4 = GrandExchangeOfferTotalQuantityComparator.menuHeight;
         int var5 = 6116423;
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
         Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         ScriptEvent.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
         int var6 = MouseHandler.MouseHandler_x;
         int var7 = MouseHandler.MouseHandler_y;

         int var8;
         int var9;
         int var10;
         for(var8 = 0; var8 < menuOptionsCount; ++var8) {
            var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31;
            var10 = 16777215;
            if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
               var10 = 16776960;
            }

            ScriptEvent.fontBold12.draw(WorldMapLabel.method504(var8), var1 + 3, var9, var10, 0);
         }

         var8 = ApproximateRouteStrategy.menuX;
         var9 = AbstractUserComparator.menuY;
         var10 = CollisionMap.menuWidth;
         int var11 = GrandExchangeOfferTotalQuantityComparator.menuHeight;

         for(int var12 = 0; var12 < rootWidgetCount; ++var12) {
            if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var11) {
               field827[var12] = true;
            }
         }
      }

      if (gameDrawingMode == 3) {
         for(var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field871[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
            } else if (field827[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
            }
         }
      }

      WorldMapSection0.method308(class90.Client_plane, UserComparator9.localPlayer.x, UserComparator9.localPlayer.y, field808);
      field808 = 0;
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      descriptor = "(Ldx;B)Z",
      garbageValue = "9"
   )
   final boolean method1701(PacketWriter var1) {
      AbstractSocket var2 = var1.getSocket();
      PacketBuffer var3 = var1.packetBuffer;
      if (var2 == null) {
         return false;
      } else {
         int var6;
         String var20;
         try {
            int var5;
            if (var1.serverPacket == null) {
               if (var1.field1327) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 0, 1);
                  var1.field1330 = 0;
                  var1.field1327 = false;
               }

               var3.offset = 0;
               if (var3.method5634()) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 1, 1);
                  var1.field1330 = 0;
               }

               var1.field1327 = true;
               ServerPacket[] var4 = WorldMapRegion.ServerPacket_values();
               var5 = var3.readSmartByteShortIsaac();
               if (var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.offset);
               }

               var1.serverPacket = var4[var5];
               var1.serverPacketLength = var1.serverPacket.length;
            }

            if (var1.serverPacketLength == -1) {
               if (!var2.isAvailable(1)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 1);
               var1.serverPacketLength = var3.array[0] & 255;
            }

            if (var1.serverPacketLength == -2) {
               if (!var2.isAvailable(2)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 2);
               var3.offset = 0;
               var1.serverPacketLength = var3.readUnsignedShort();
            }

            if (!var2.isAvailable(var1.serverPacketLength)) {
               return false;
            }

            var3.offset = 0;
            var2.read(var3.array, 0, var1.serverPacketLength);
            var1.field1330 = 0;
            timer.method5212();
            var1.field1334 = var1.field1333;
            var1.field1333 = var1.field1331;
            var1.field1331 = var1.serverPacket;
            int var16;
            if (ServerPacket.field2164 == var1.serverPacket) {
               var16 = var3.readInt();
               var5 = var3.method5727();
               Varps.Varps_temp[var5] = var16;
               if (Varps.Varps_main[var5] != var16) {
                  Varps.Varps_main[var5] = var16;
               }

               AbstractWorldMapIcon.changeGameOptions(var5);
               changedVarps[++changedVarpCount - 1 & 31] = var5;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2213 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2350);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2214 == var1.serverPacket) {
               ClientPacket.method3811(var3.readStringCp1252NullTerminated());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2183 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2346);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2160 == var1.serverPacket) {
               InterfaceParent.friendSystem.readUpdate(var3, var1.serverPacketLength);
               field857 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            if (ServerPacket.field2205 == var1.serverPacket) {
               isCameraLocked = true;
               class25.field138 = var3.readUnsignedByte() * 128;
               GrandExchangeOfferUnitPriceComparator.field102 = var3.readUnsignedByte() * 128;
               Skeleton.field1809 = var3.readUnsignedShort();
               WorldMapEvent.field380 = var3.readUnsignedByte();
               JagexCache.field2070 = var3.readUnsignedByte();
               if (JagexCache.field2070 >= 100) {
                  var16 = class25.field138 * 16384 + 64;
                  var5 = GrandExchangeOfferUnitPriceComparator.field102 * 16384 + 64;
                  var6 = WorldMapRegion.getTileHeight(var16, var5, class90.Client_plane) - Skeleton.field1809;
                  var7 = var16 - SecureRandomFuture.cameraX;
                  var8 = var6 - ArchiveLoader.cameraY;
                  var9 = var5 - ObjectSound.cameraZ;
                  var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
                  KeyHandler.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047;
                  class39.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
                  if (KeyHandler.cameraPitch < 128) {
                     KeyHandler.cameraPitch = 128;
                  }

                  if (KeyHandler.cameraPitch > 383) {
                     KeyHandler.cameraPitch = 383;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2206 == var1.serverPacket) {
               var16 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var6 = var3.readUnsignedShort();
               class58.queueSoundEffect(var16, var5, var6);
               var1.serverPacket = null;
               return true;
            }

            Widget var17;
            if (ServerPacket.field2170 == var1.serverPacket) {
               var16 = var3.method5729();
               if (var16 == 65535) {
                  var16 = -1;
               }

               var5 = var3.method5895();
               var6 = var3.readInt();
               var17 = class237.getWidget(var6);
               ItemComposition var48;
               if (!var17.isIf3) {
                  if (var16 == -1) {
                     var17.modelType = 0;
                     var1.serverPacket = null;
                     return true;
                  }

                  var48 = class281.ItemDefinition_get(var16);
                  var17.modelType = 4;
                  var17.modelId = var16;
                  var17.modelAngleX = var48.xan2d;
                  var17.modelAngleY = var48.yan2d;
                  var17.modelZoom = var48.zoom2d * 100 / var5;
                  IsaacCipher.invalidateWidget(var17);
               } else {
                  var17.itemId = var16;
                  var17.itemQuantity = var5;
                  var48 = class281.ItemDefinition_get(var16);
                  var17.modelAngleX = var48.xan2d;
                  var17.modelAngleY = var48.yan2d;
                  var17.modelAngleZ = var48.zan2d;
                  var17.modelOffsetX = var48.offsetX2d;
                  var17.modelOffsetY = var48.offsetY2d;
                  var17.modelZoom = var48.zoom2d;
                  if (var48.isStackable == 1) {
                     var17.itemQuantityMode = 1;
                  } else {
                     var17.itemQuantityMode = 2;
                  }

                  if (var17.field2648 > 0) {
                     var17.modelZoom = var17.modelZoom * 32 / var17.field2648;
                  } else if (var17.rawWidth > 0) {
                     var17.modelZoom = var17.modelZoom * 32 / var17.rawWidth;
                  }

                  IsaacCipher.invalidateWidget(var17);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var19;
            boolean var44;
            if (ServerPacket.field2153 == var1.serverPacket) {
               var44 = var3.method5720() == 1;
               var5 = var3.readInt();
               var19 = class237.getWidget(var5);
               if (var44 != var19.isHidden) {
                  var19.isHidden = var44;
                  IsaacCipher.invalidateWidget(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var18;
            if (ServerPacket.field2149 == var1.serverPacket) {
               var16 = var3.method5728();
               var5 = var3.method5727();
               var6 = var3.method5727();
               var7 = var3.method5895();
               var18 = class237.getWidget(var7);
               if (var5 != var18.modelAngleX || var6 != var18.modelAngleY || var16 != var18.modelZoom) {
                  var18.modelAngleX = var5;
                  var18.modelAngleY = var6;
                  var18.modelZoom = var16;
                  IsaacCipher.invalidateWidget(var18);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2158 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2351);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2210 == var1.serverPacket) {
               var16 = var3.readShort();
               var5 = var3.method5730();
               var6 = var3.readInt();
               var17 = class237.getWidget(var6);
               if (var5 != var17.rawX || var16 != var17.rawY || var17.xAlignment != 0 || var17.yAlignment != 0) {
                  var17.rawX = var5;
                  var17.rawY = var16;
                  var17.xAlignment = 0;
                  var17.yAlignment = 0;
                  IsaacCipher.invalidateWidget(var17);
                  this.alignWidget(var17);
                  if (var17.type == 0) {
                     class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var6 >> 16], var17, false);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            InterfaceParent var45;
            if (ServerPacket.field2175 == var1.serverPacket) {
               var16 = var3.readUnsignedShort();
               var5 = var3.method5739();
               var6 = var3.readUnsignedByte();
               var45 = (InterfaceParent)interfaceParents.get((long)var5);
               if (var45 != null) {
                  GrandExchangeOffer.closeInterface(var45, var16 != var45.group);
               }

               class219.method4172(var5, var16, var6);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2221 == var1.serverPacket) {
               class105.loadRegions(true, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            String var37;
            if (ServerPacket.field2181 == var1.serverPacket) {
               var37 = var3.readStringCp1252NullTerminated();
               var20 = AbstractFont.escapeBrackets(UrlRequester.method3467(JagexCache.method3683(var3)));
               AbstractWorldMapData.addGameMessage(6, var37, var20);
               var1.serverPacket = null;
               return true;
            }

            String var54;
            if (ServerPacket.field2171 == var1.serverPacket) {
               var16 = var3.readUShortSmart();
               boolean var43 = var3.readUnsignedByte() == 1;
               var54 = "";
               boolean var41 = false;
               if (var43) {
                  var54 = var3.readStringCp1252NullTerminated();
                  if (InterfaceParent.friendSystem.isIgnored(new Username(var54, Message.loginType))) {
                     var41 = true;
                  }
               }

               String var47 = var3.readStringCp1252NullTerminated();
               if (!var41) {
                  AbstractWorldMapData.addGameMessage(var16, var54, var47);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2196 == var1.serverPacket) {
               World var40 = new World();
               var40.host = var3.readStringCp1252NullTerminated();
               var40.id = var3.readUnsignedShort();
               var5 = var3.readInt();
               var40.properties = var5;
               ItemContainer.updateGameState(45);
               var2.close();
               var2 = null;
               ChatChannel.changeWorld(var40);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field2198 == var1.serverPacket) {
               var16 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var6 = var3.readUnsignedByte();
               var7 = var3.readUnsignedByte();
               field907[var16] = true;
               field908[var16] = var5;
               field909[var16] = var6;
               field799[var16] = var7;
               field911[var16] = 0;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2144 == var1.serverPacket) {
               for(var16 = 0; var16 < class58.VarpDefinition_fileCount; ++var16) {
                  VarpDefinition var58 = class204.VarpDefinition_get(var16);
                  if (var58 != null) {
                     Varps.Varps_temp[var16] = 0;
                     Varps.Varps_main[var16] = 0;
                  }
               }

               class219.method4171();
               changedVarpCount += 32;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2224 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2355);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2180 == var1.serverPacket) {
               GrandExchangeEvent.field82 = var3.readUnsignedByte();
               GrandExchangeOfferUnitPriceComparator.field103 = var3.method5717();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2219 == var1.serverPacket) {
               destinationX = var3.readUnsignedByte();
               if (destinationX == 255) {
                  destinationX = 0;
               }

               destinationY = var3.readUnsignedByte();
               if (destinationY == 255) {
                  destinationY = 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2141 == var1.serverPacket) {
               var16 = var3.method5895();
               var5 = var3.method5729();
               var6 = var5 >> 10 & 31;
               var7 = var5 >> 5 & 31;
               var8 = var5 & 31;
               var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
               Widget var56 = class237.getWidget(var16);
               if (var9 != var56.color) {
                  var56.color = var9;
                  IsaacCipher.invalidateWidget(var56);
               }

               var1.serverPacket = null;
               return true;
            }

            long var12;
            if (ServerPacket.field2195 == var1.serverPacket) {
               var16 = var3.offset + var1.serverPacketLength;
               var5 = var3.readUnsignedShort();
               var6 = var3.readUnsignedShort();
               if (var5 != rootInterface) {
                  rootInterface = var5;
                  this.resizeRoot(false);
                  GrandExchangeEvent.Widget_resetModelFrames(rootInterface);
                  SoundSystem.runWidgetOnLoadListener(rootInterface);

                  for(var7 = 0; var7 < 100; ++var7) {
                     field816[var7] = true;
                  }
               }

               InterfaceParent var21;
               for(; var6-- > 0; var21.field575 = true) {
                  var7 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedByte();
                  var21 = (InterfaceParent)interfaceParents.get((long)var7);
                  if (var21 != null && var8 != var21.group) {
                     GrandExchangeOffer.closeInterface(var21, true);
                     var21 = null;
                  }

                  if (var21 == null) {
                     var21 = class219.method4172(var7, var8, var9);
                  }
               }

               for(var45 = (InterfaceParent)interfaceParents.first(); var45 != null; var45 = (InterfaceParent)interfaceParents.next()) {
                  if (var45.field575) {
                     var45.field575 = false;
                  } else {
                     GrandExchangeOffer.closeInterface(var45, true);
                  }
               }

               widgetFlags = new NodeHashTable(512);

               while(var3.offset < var16) {
                  var7 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedShort();
                  var10 = var3.readInt();

                  for(int var11 = var8; var11 <= var9; ++var11) {
                     var12 = (long)var11 + ((long)var7 << 32);
                     widgetFlags.put(new IntegerNode(var10), var12);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2179 == var1.serverPacket) {
               GrandExchangeEvent.field82 = var3.method5776();
               GrandExchangeOfferUnitPriceComparator.field103 = var3.readUnsignedByte();

               while(var3.offset < var1.serverPacketLength) {
                  var16 = var3.readUnsignedByte();
                  class194 var57 = class7.method85()[var16];
                  PacketWriter.method2429(var57);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2217 == var1.serverPacket) {
               var16 = var3.readInt();
               InterfaceParent var55 = (InterfaceParent)interfaceParents.get((long)var16);
               if (var55 != null) {
                  GrandExchangeOffer.closeInterface(var55, true);
               }

               if (meslayerContinueWidget != null) {
                  IsaacCipher.invalidateWidget(meslayerContinueWidget);
                  meslayerContinueWidget = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2201 == var1.serverPacket) {
               var16 = var3.readUnsignedByte();
               WorldMapSprite.method496(var16);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2211 == var1.serverPacket) {
               SecureRandomCallable.logOut();
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field2223 == var1.serverPacket) {
               minimapState = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2151 == var1.serverPacket) {
               for(var16 = 0; var16 < Varps.Varps_main.length; ++var16) {
                  if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) {
                     Varps.Varps_main[var16] = Varps.Varps_temp[var16];
                     AbstractWorldMapIcon.changeGameOptions(var16);
                     changedVarps[++changedVarpCount - 1 & 31] = var16;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2182 == var1.serverPacket) {
               GrandExchangeEvent.field82 = var3.method5717();
               GrandExchangeOfferUnitPriceComparator.field103 = var3.method5720();

               for(var16 = GrandExchangeEvent.field82; var16 < GrandExchangeEvent.field82 + 8; ++var16) {
                  for(var5 = GrandExchangeOfferUnitPriceComparator.field103; var5 < GrandExchangeOfferUnitPriceComparator.field103 + 8; ++var5) {
                     if (groundItems[class90.Client_plane][var16][var5] != null) {
                        groundItems[class90.Client_plane][var16][var5] = null;
                        HitSplatDefinition.updateItemPile(var16, var5);
                     }
                  }
               }

               for(PendingSpawn var39 = (PendingSpawn)pendingSpawns.last(); var39 != null; var39 = (PendingSpawn)pendingSpawns.previous()) {
                  if (var39.x >= GrandExchangeEvent.field82 && var39.x < GrandExchangeEvent.field82 + 8 && var39.y >= GrandExchangeOfferUnitPriceComparator.field103 && var39.y < GrandExchangeOfferUnitPriceComparator.field103 + 8 && var39.plane == class90.Client_plane) {
                     var39.hitpoints = 0;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2178 == var1.serverPacket) {
               if (rootInterface != -1) {
                  class228.runIntfCloseListeners(rootInterface, 0);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2176 == var1.serverPacket) {
               var16 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var16 < -70000) {
                  var5 += 32768;
               }

               if (var16 >= 0) {
                  var19 = class237.getWidget(var16);
               } else {
                  var19 = null;
               }

               for(; var3.offset < var1.serverPacketLength; WorldMapLabel.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
                  var7 = var3.readUShortSmart();
                  var8 = var3.readUnsignedShort();
                  var9 = 0;
                  if (var8 != 0) {
                     var9 = var3.readUnsignedByte();
                     if (var9 == 255) {
                        var9 = var3.readInt();
                     }
                  }

                  if (var19 != null && var7 >= 0 && var7 < var19.itemIds.length) {
                     var19.itemIds[var7] = var8;
                     var19.itemQuantities[var7] = var9;
                  }
               }

               if (var19 != null) {
                  IsaacCipher.invalidateWidget(var19);
               }

               class219.method4171();
               changedItemContainers[++field870 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2193 == var1.serverPacket) {
               class219.method4171();
               runEnergy = var3.readUnsignedByte();
               field861 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2146 == var1.serverPacket) {
               class182.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2155 == var1.serverPacket) {
               var16 = var3.method5895();
               var5 = var3.method5731();
               var19 = class237.getWidget(var16);
               if (var5 != var19.sequenceId || var5 == -1) {
                  var19.sequenceId = var5;
                  var19.modelFrame = 0;
                  var19.modelFrameCycle = 0;
                  IsaacCipher.invalidateWidget(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2226 == var1.serverPacket) {
               byte[] var38 = new byte[var1.serverPacketLength];
               var3.method5642(var38, 0, var38.length);
               Buffer var53 = new Buffer(var38);
               var54 = var53.readStringCp1252NullTerminated();
               WorldMapRectangle.openURL(var54, true, false);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2225 == var1.serverPacket) {
               var16 = var3.readUnsignedShort();
               if (var16 == 65535) {
                  var16 = -1;
               }

               AbstractSocket.playSong(var16);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2167 == var1.serverPacket) {
               var16 = var3.method5788();
               var5 = var3.method5728();
               if (var5 == 65535) {
                  var5 = -1;
               }

               NPC.method2180(var5, var16);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2148 == var1.serverPacket) {
               rebootTimer = var3.method5729() * 30;
               field861 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2218 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2352);
               var1.serverPacket = null;
               return true;
            }

            long var22;
            if (ServerPacket.field2209 == var1.serverPacket) {
               var16 = var3.method5895();
               var5 = var3.method5727();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var6 = var3.readUnsignedShort();
               if (var6 == 65535) {
                  var6 = -1;
               }

               var7 = var3.method5738();

               for(var8 = var6; var8 <= var5; ++var8) {
                  var22 = (long)var8 + ((long)var7 << 32);
                  Node var60 = widgetFlags.get(var22);
                  if (var60 != null) {
                     var60.remove();
                  }

                  widgetFlags.put(new IntegerNode(var16), var22);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2172 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2348);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2220 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2354);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2184 == var1.serverPacket) {
               var3.offset += 28;
               if (var3.checkCrc()) {
                  ServerPacket.method3809(var3, var3.offset - 28);
               }

               var1.serverPacket = null;
               return true;
            }

            long var25;
            long var27;
            if (ServerPacket.field2156 == var1.serverPacket) {
               var37 = var3.readStringCp1252NullTerminated();
               var25 = (long)var3.readUnsignedShort();
               var27 = (long)var3.readMedium();
               PlayerType var29 = (PlayerType)InterfaceParent.findEnumerated(class69.PlayerType_values(), var3.readUnsignedByte());
               long var30 = var27 + (var25 << 32);
               boolean var32 = false;

               for(int var13 = 0; var13 < 100; ++var13) {
                  if (var30 == field883[var13]) {
                     var32 = true;
                     break;
                  }
               }

               if (InterfaceParent.friendSystem.isIgnored(new Username(var37, Message.loginType))) {
                  var32 = true;
               }

               if (!var32 && field778 == 0) {
                  field883[field884] = var30;
                  field884 = (field884 + 1) % 100;
                  String var33 = AbstractFont.escapeBrackets(UrlRequester.method3467(JagexCache.method3683(var3)));
                  byte var42;
                  if (var29.isPrivileged) {
                     var42 = 7;
                  } else {
                     var42 = 3;
                  }

                  if (var29.modIcon != -1) {
                     AbstractWorldMapData.addGameMessage(var42, UserComparator10.method3580(var29.modIcon) + var37, var33);
                  } else {
                     AbstractWorldMapData.addGameMessage(var42, var37, var33);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2200 == var1.serverPacket) {
               class182.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2202 == var1.serverPacket) {
               var16 = var3.readInt();
               var5 = var3.readInt();
               var6 = GrandExchangeOffer.getGcDuration();
               PacketBufferNode var46 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2241, packetWriter.isaacCipher);
               var46.packetBuffer.method5883(GameEngine.fps);
               var46.packetBuffer.method5736(var16);
               var46.packetBuffer.method5781(var5);
               var46.packetBuffer.method5883(var6);
               packetWriter.addNode(var46);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2162 == var1.serverPacket) {
               var37 = var3.readStringCp1252NullTerminated();
               var5 = var3.method5717();
               var6 = var3.method5717();
               if (var5 >= 1 && var5 <= 8) {
                  if (var37.equalsIgnoreCase("null")) {
                     var37 = null;
                  }

                  playerMenuActions[var5 - 1] = var37;
                  playerOptionsPriorities[var5 - 1] = var6 == 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2152 == var1.serverPacket) {
               var16 = var3.readUnsignedByte();
               WorldMapSection2.forceDisconnect(var16);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field2157 == var1.serverPacket) {
               hintArrowType = var3.readUnsignedByte();
               if (hintArrowType == 1) {
                  hintArrowNpcIndex = var3.readUnsignedShort();
               }

               if (hintArrowType >= 2 && hintArrowType <= 6) {
                  if (hintArrowType == 2) {
                     hintArrowSubX = 64;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 3) {
                     hintArrowSubX = 0;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 4) {
                     hintArrowSubX = 128;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 5) {
                     hintArrowSubX = 64;
                     hintArrowSubY = 0;
                  }

                  if (hintArrowType == 6) {
                     hintArrowSubX = 64;
                     hintArrowSubY = 8192;
                  }

                  hintArrowType = 2;
                  hintArrowX = var3.readUnsignedShort();
                  hintArrowY = var3.readUnsignedShort();
                  hintArrowHeight = var3.readUnsignedByte() * 2;
               }

               if (hintArrowType == 10) {
                  hintArrowPlayerIndex = var3.readUnsignedShort();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2168 == var1.serverPacket) {
               class219.method4171();
               weight = var3.readShort();
               field861 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2192 == var1.serverPacket) {
               var16 = var3.readInt();
               if (var16 != field746) {
                  field746 = var16;
                  WorldMapCacheName.method715();
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var51;
            if (ServerPacket.field2174 == var1.serverPacket) {
               var16 = var3.method5739();
               var51 = class237.getWidget(var16);
               var51.modelType = 3;
               var51.modelId = UserComparator9.localPlayer.appearance.getChatHeadId();
               IsaacCipher.invalidateWidget(var51);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2203 == var1.serverPacket) {
               var16 = var3.method5729();
               WorldMapLabel.method501(var16);
               changedItemContainers[++field870 - 1 & 31] = var16 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2142 == var1.serverPacket) {
               var16 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var16 < -70000) {
                  var5 += 32768;
               }

               if (var16 >= 0) {
                  var19 = class237.getWidget(var16);
               } else {
                  var19 = null;
               }

               if (var19 != null) {
                  for(var7 = 0; var7 < var19.itemIds.length; ++var7) {
                     var19.itemIds[var7] = 0;
                     var19.itemQuantities[var7] = 0;
                  }
               }

               WorldMapID.clearItemContainer(var5);
               var7 = var3.readUnsignedShort();

               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var3.readUnsignedByte();
                  if (var9 == 255) {
                     var9 = var3.method5739();
                  }

                  var10 = var3.method5729();
                  if (var19 != null && var8 < var19.itemIds.length) {
                     var19.itemIds[var8] = var10;
                     var19.itemQuantities[var8] = var9;
                  }

                  WorldMapLabel.itemContainerSetItem(var5, var8, var10 - 1, var9);
               }

               if (var19 != null) {
                  IsaacCipher.invalidateWidget(var19);
               }

               class219.method4171();
               changedItemContainers[++field870 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2166 == var1.serverPacket) {
               var16 = var3.method5738();
               var5 = var3.method5895();
               InterfaceParent var50 = (InterfaceParent)interfaceParents.get((long)var5);
               var45 = (InterfaceParent)interfaceParents.get((long)var16);
               if (var45 != null) {
                  GrandExchangeOffer.closeInterface(var45, var50 == null || var50.group != var45.group);
               }

               if (var50 != null) {
                  var50.remove();
                  interfaceParents.put(var50, (long)var16);
               }

               var18 = class237.getWidget(var5);
               if (var18 != null) {
                  IsaacCipher.invalidateWidget(var18);
               }

               var18 = class237.getWidget(var16);
               if (var18 != null) {
                  IsaacCipher.invalidateWidget(var18);
                  class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var18.id >>> 16], var18, true);
               }

               if (rootInterface != -1) {
                  class228.runIntfCloseListeners(rootInterface, 1);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2222 == var1.serverPacket) {
               byte var59 = var3.method5721();
               var5 = var3.readUnsignedShort();
               Varps.Varps_temp[var5] = var59;
               if (Varps.Varps_main[var5] != var59) {
                  Varps.Varps_main[var5] = var59;
               }

               AbstractWorldMapIcon.changeGameOptions(var5);
               changedVarps[++changedVarpCount - 1 & 31] = var5;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2199 == var1.serverPacket) {
               var37 = var3.readStringCp1252NullTerminated();
               Object[] var52 = new Object[var37.length() + 1];

               for(var6 = var37.length() - 1; var6 >= 0; --var6) {
                  if (var37.charAt(var6) == 's') {
                     var52[var6 + 1] = var3.readStringCp1252NullTerminated();
                  } else {
                     var52[var6 + 1] = new Integer(var3.readInt());
                  }
               }

               var52[0] = new Integer(var3.readInt());
               ScriptEvent var49 = new ScriptEvent();
               var49.args = var52;
               PacketWriter.runScriptEvent(var49);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2186 == var1.serverPacket) {
               for(var16 = 0; var16 < players.length; ++var16) {
                  if (players[var16] != null) {
                     players[var16].sequence = -1;
                  }
               }

               for(var16 = 0; var16 < npcs.length; ++var16) {
                  if (npcs[var16] != null) {
                     npcs[var16].sequence = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2150 == var1.serverPacket) {
               var16 = var3.method5895();
               var51 = class237.getWidget(var16);

               for(var6 = 0; var6 < var51.itemIds.length; ++var6) {
                  var51.itemIds[var6] = -1;
                  var51.itemIds[var6] = 0;
               }

               IsaacCipher.invalidateWidget(var51);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2207 == var1.serverPacket) {
               var16 = var3.method5729();
               var5 = var3.method5895();
               var19 = class237.getWidget(var5);
               if (var19 != null && var19.type == 0) {
                  if (var16 > var19.scrollHeight - var19.height) {
                     var16 = var19.scrollHeight - var19.height;
                  }

                  if (var16 < 0) {
                     var16 = 0;
                  }

                  if (var16 != var19.scrollY) {
                     var19.scrollY = var16;
                     IsaacCipher.invalidateWidget(var19);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2173 == var1.serverPacket) {
               if (var1.serverPacketLength == 0) {
                  WorldMapID.clanChat = null;
               } else {
                  if (WorldMapID.clanChat == null) {
                     WorldMapID.clanChat = new ClanChat(Message.loginType, class1.client);
                  }

                  WorldMapID.clanChat.readUpdate(var3);
               }

               KeyHandler.method911();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2159 == var1.serverPacket) {
               class105.loadRegions(false, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2216 == var1.serverPacket) {
               var16 = var3.method5738();
               var5 = var3.method5727();
               var6 = var3.method5727();
               var17 = class237.getWidget(var16);
               var17.field2649 = var6 + (var5 << 16);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2177 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2353);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2145 == var1.serverPacket) {
               var44 = var3.readBoolean();
               if (var44) {
                  if (HealthBarUpdate.field1016 == null) {
                     HealthBarUpdate.field1016 = new class248();
                  }
               } else {
                  HealthBarUpdate.field1016 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2185 == var1.serverPacket) {
               tradeChatMode = var3.method5720();
               publicChatMode = var3.method5776();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2215 == var1.serverPacket) {
               ModelData0.updatePlayers(var3, var1.serverPacketLength);
               FriendsList.method5386();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2161 == var1.serverPacket) {
               ArchiveLoader.privateChatMode = UserComparator5.method3604(var3.readUnsignedByte());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2212 == var1.serverPacket) {
               var16 = var3.method5728();
               var5 = var3.method5739();
               var19 = class237.getWidget(var5);
               if (var19.modelType != 2 || var16 != var19.modelId) {
                  var19.modelType = 2;
                  var19.modelId = var16;
                  IsaacCipher.invalidateWidget(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2189 == var1.serverPacket) {
               var16 = var3.readUnsignedShort();
               rootInterface = var16;
               this.resizeRoot(false);
               GrandExchangeEvent.Widget_resetModelFrames(var16);
               SoundSystem.runWidgetOnLoadListener(rootInterface);

               for(var5 = 0; var5 < 100; ++var5) {
                  field816[var5] = true;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2197 == var1.serverPacket) {
               var16 = var3.readUnsignedByte();
               if (var3.readUnsignedByte() == 0) {
                  grandExchangeOffers[var16] = new GrandExchangeOffer();
                  var3.offset += 18;
               } else {
                  --var3.offset;
                  grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false);
               }

               field710 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2194 == var1.serverPacket) {
               InterfaceParent.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
               class51.FriendSystem_invalidateIgnoreds();
               field857 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2208 == var1.serverPacket) {
               isCameraLocked = false;

               for(var16 = 0; var16 < 5; ++var16) {
                  field907[var16] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2204 == var1.serverPacket) {
               class308.readReflectionCheck(var3, var1.serverPacketLength);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2169 == var1.serverPacket) {
               class219.method4171();
               var16 = var3.method5895();
               var5 = var3.method5717();
               var6 = var3.readUnsignedByte();
               experience[var6] = var16;
               currentLevels[var6] = var5;
               levels[var6] = 1;

               for(var7 = 0; var7 < 98; ++var7) {
                  if (var16 >= Skills.Skills_experienceTable[var7]) {
                     levels[var6] = var7 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var6;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2165 == var1.serverPacket) {
               isCameraLocked = true;
               WorldMapManager.field345 = var3.readUnsignedByte() * 128;
               Decimator.field1475 = var3.readUnsignedByte() * 128;
               Clock.field2079 = var3.readUnsignedShort();
               JagexCache.field2056 = var3.readUnsignedByte();
               class228.field2740 = var3.readUnsignedByte();
               if (class228.field2740 >= 100) {
                  SecureRandomFuture.cameraX = WorldMapManager.field345 * 16384 + 64;
                  ObjectSound.cameraZ = Decimator.field1475 * 16384 + 64;
                  ArchiveLoader.cameraY = WorldMapRegion.getTileHeight(SecureRandomFuture.cameraX, ObjectSound.cameraZ, class90.Client_plane) - Clock.field2079;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2188 == var1.serverPacket) {
               InterfaceParent.friendSystem.method1975();
               field857 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2143 == var1.serverPacket) {
               var44 = var3.readUnsignedByte() == 1;
               if (var44) {
                  class9.field57 = Tiles.currentTimeMillis() - var3.readLong();
                  WorldMapSectionType.grandExchangeEvents = new GrandExchangeEvents(var3, true);
               } else {
                  WorldMapSectionType.grandExchangeEvents = null;
               }

               field860 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2154 == var1.serverPacket) {
               var16 = var3.method5739();
               var20 = var3.readStringCp1252NullTerminated();
               var19 = class237.getWidget(var16);
               if (!var20.equals(var19.text)) {
                  var19.text = var20;
                  IsaacCipher.invalidateWidget(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2191 == var1.serverPacket) {
               if (WorldMapID.clanChat != null) {
                  WorldMapID.clanChat.method5428(var3);
               }

               KeyHandler.method911();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2147 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2347);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2190 == var1.serverPacket) {
               var16 = var3.method5895();
               var5 = var3.method5727();
               var19 = class237.getWidget(var16);
               if (var19.modelType != 1 || var5 != var19.modelId) {
                  var19.modelType = 1;
                  var19.modelId = var5;
                  IsaacCipher.invalidateWidget(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2163 == var1.serverPacket) {
               PacketWriter.method2429(class194.field2356);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field2187 == var1.serverPacket) {
               var37 = var3.readStringCp1252NullTerminated();
               var25 = var3.readLong();
               var27 = (long)var3.readUnsignedShort();
               var22 = (long)var3.readMedium();
               PlayerType var24 = (PlayerType)InterfaceParent.findEnumerated(class69.PlayerType_values(), var3.readUnsignedByte());
               var12 = var22 + (var27 << 32);
               boolean var14 = false;

               for(int var15 = 0; var15 < 100; ++var15) {
                  if (var12 == field883[var15]) {
                     var14 = true;
                     break;
                  }
               }

               if (var24.isUser && InterfaceParent.friendSystem.isIgnored(new Username(var37, Message.loginType))) {
                  var14 = true;
               }

               if (!var14 && field778 == 0) {
                  field883[field884] = var12;
                  field884 = (field884 + 1) % 100;
                  String var34 = AbstractFont.escapeBrackets(UrlRequester.method3467(JagexCache.method3683(var3)));
                  if (var24.modIcon != -1) {
                     PlatformInfo.addChatMessage(9, UserComparator10.method3580(var24.modIcon) + var37, var34, Messages.base37DecodeLong(var25));
                  } else {
                     PlatformInfo.addChatMessage(9, var37, var34, Messages.base37DecodeLong(var25));
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            SequenceDefinition.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1333 != null ? var1.field1333.id : -1) + "," + (var1.field1334 != null ? var1.field1334.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
            SecureRandomCallable.logOut();
         } catch (IOException var35) {
            class8.method90();
         } catch (Exception var36) {
            var20 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1333 != null ? var1.field1333.id : -1) + "," + (var1.field1334 != null ? var1.field1334.id : -1) + "," + var1.serverPacketLength + "," + (UserComparator9.localPlayer.pathX[0] + GrandExchangeOfferNameComparator.baseX * 64) + "," + (UserComparator9.localPlayer.pathY[0] + NetCache.baseY * 64) + ",";

            for(var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
               var20 = var20 + var3.array[var6] + ",";
            }

            SequenceDefinition.RunException_sendStackTrace(var20, var36);
            SecureRandomCallable.logOut();
         }

         return true;
      }
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-85"
   )
   @Export("menu")
   final void menu() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
            if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
               String var17 = menuTargets[var2];
               menuTargets[var2] = menuTargets[var2 + 1];
               menuTargets[var2 + 1] = var17;
               String var18 = menuActions[var2];
               menuActions[var2] = menuActions[var2 + 1];
               menuActions[var2 + 1] = var18;
               var5 = menuOpcodes[var2];
               menuOpcodes[var2] = menuOpcodes[var2 + 1];
               menuOpcodes[var2 + 1] = var5;
               var5 = menuArguments1[var2];
               menuArguments1[var2] = menuArguments1[var2 + 1];
               menuArguments1[var2 + 1] = var5;
               var5 = menuArguments2[var2];
               menuArguments2[var2] = menuArguments2[var2 + 1];
               menuArguments2[var2 + 1] = var5;
               var5 = menuIdentifiers[var2];
               menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
               menuIdentifiers[var2 + 1] = var5;
               boolean var6 = menuShiftClick[var2];
               menuShiftClick[var2] = menuShiftClick[var2 + 1];
               menuShiftClick[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if (JagexCache.dragInventoryWidget == null) {
         if (clickedWidget == null) {
            int var19 = MouseHandler.MouseHandler_lastButton;
            int var4;
            int var9;
            int var14;
            int var20;
            if (isMenuOpen) {
               int var3;
               if (var19 != 1 && (class8.mouseCam || var19 != 4)) {
                  var2 = MouseHandler.MouseHandler_x;
                  var3 = MouseHandler.MouseHandler_y;
                  if (var2 < ApproximateRouteStrategy.menuX - 10 || var2 > ApproximateRouteStrategy.menuX + CollisionMap.menuWidth + 10 || var3 < AbstractUserComparator.menuY - 10 || var3 > GrandExchangeOfferTotalQuantityComparator.menuHeight + AbstractUserComparator.menuY + 10) {
                     isMenuOpen = false;
                     Projectile.method2262(ApproximateRouteStrategy.menuX, AbstractUserComparator.menuY, CollisionMap.menuWidth, GrandExchangeOfferTotalQuantityComparator.menuHeight);
                  }
               }

               if (var19 == 1 || !class8.mouseCam && var19 == 4) {
                  var2 = ApproximateRouteStrategy.menuX;
                  var3 = AbstractUserComparator.menuY;
                  var4 = CollisionMap.menuWidth;
                  var5 = MouseHandler.MouseHandler_lastPressedX;
                  var20 = MouseHandler.MouseHandler_lastPressedY;
                  var14 = -1;

                  int var21;
                  for(var21 = 0; var21 < menuOptionsCount; ++var21) {
                     var9 = var3 + (menuOptionsCount - 1 - var21) * 15 + 31;
                     if (var5 > var2 && var5 < var4 + var2 && var20 > var9 - 13 && var20 < var9 + 3) {
                        var14 = var21;
                     }
                  }

                  if (var14 != -1 && var14 >= 0) {
                     var21 = menuArguments1[var14];
                     var9 = menuArguments2[var14];
                     int var10 = menuOpcodes[var14];
                     int var11 = menuIdentifiers[var14];
                     String var12 = menuActions[var14];
                     String var13 = menuTargets[var14];
                     AbstractWorldMapIcon.menuAction(var21, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                  }

                  isMenuOpen = false;
                  Projectile.method2262(ApproximateRouteStrategy.menuX, AbstractUserComparator.menuY, CollisionMap.menuWidth, GrandExchangeOfferTotalQuantityComparator.menuHeight);
               }
            } else {
               var2 = menuOptionsCount - 1;
               if ((var19 == 1 || !class8.mouseCam && var19 == 4) && var2 >= 0) {
                  var4 = menuOpcodes[var2];
                  if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
                     label260: {
                        var5 = menuArguments1[var2];
                        var20 = menuArguments2[var2];
                        Widget var7 = class237.getWidget(var20);
                        var9 = class60.getWidgetFlags(var7);
                        boolean var8 = (var9 >> 28 & 1) != 0;
                        if (!var8) {
                           Object var10000 = null;
                           if (!ModeWhere.method3867(class60.getWidgetFlags(var7))) {
                              break label260;
                           }
                        }

                        if (JagexCache.dragInventoryWidget != null && !field776 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
                           LoginPacket.method3812(draggedWidgetX, draggedWidgetY);
                        }

                        field776 = false;
                        itemDragDuration = 0;
                        if (JagexCache.dragInventoryWidget != null) {
                           IsaacCipher.invalidateWidget(JagexCache.dragInventoryWidget);
                        }

                        JagexCache.dragInventoryWidget = class237.getWidget(var20);
                        dragItemSlotSource = var5;
                        draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
                        draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
                        if (var2 >= 0) {
                           class195.tempMenuAction = new MenuAction();
                           class195.tempMenuAction.param0 = menuArguments1[var2];
                           class195.tempMenuAction.param1 = menuArguments2[var2];
                           class195.tempMenuAction.opcode = menuOpcodes[var2];
                           class195.tempMenuAction.identifier = menuIdentifiers[var2];
                           class195.tempMenuAction.action = menuActions[var2];
                        }

                        IsaacCipher.invalidateWidget(JagexCache.dragInventoryWidget);
                        return;
                     }
                  }
               }

               if ((var19 == 1 || !class8.mouseCam && var19 == 4) && this.shouldLeftClickOpenMenu()) {
                  var19 = 2;
               }

               if ((var19 == 1 || !class8.mouseCam && var19 == 4) && menuOptionsCount > 0 && var2 >= 0) {
                  var4 = menuArguments1[var2];
                  var5 = menuArguments2[var2];
                  var20 = menuOpcodes[var2];
                  var14 = menuIdentifiers[var2];
                  String var15 = menuActions[var2];
                  String var16 = menuTargets[var2];
                  AbstractWorldMapIcon.menuAction(var4, var5, var20, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
               }

               if (var19 == 2 && menuOptionsCount > 0) {
                  this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
               }
            }

         }
      }
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1283053066"
   )
   @Export("shouldLeftClickOpenMenu")
   final boolean shouldLeftClickOpenMenu() {
      int var1 = menuOptionsCount - 1;
      return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || HealthBarDefinition.method4677(var1)) && !menuShiftClick[var1];
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1717736851"
   )
   @Export("openMenu")
   final void openMenu(int var1, int var2) {
      GrandExchangeOfferTotalQuantityComparator.method162(var1, var2);
      MilliClock.scene.menuOpen(class90.Client_plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "1112"
   )
   @Export("resizeRoot")
   final void resizeRoot(boolean var1) {
      int var2 = rootInterface;
      int var3 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
      int var4 = class25.canvasHeight;
      if (WorldMapCacheName.loadInterface(var2)) {
         ObjectSound.resizeInterface(DefaultsGroup.Widget_interfaceComponents[var2], -1, var3, var4, var1);
      }

   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "(Lhz;S)V",
      garbageValue = "-12534"
   )
   @Export("alignWidget")
   void alignWidget(Widget var1) {
      Widget var2 = var1.parentId == -1 ? null : class237.getWidget(var1.parentId);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
         var4 = class25.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      WorldMapManager.alignWidgetSize(var1, var3, var4, false);
      ClientPreferences.alignWidgetPosition(var1, var3, var4);
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "645040649"
   )
   final void method1403() {
      IsaacCipher.invalidateWidget(clickedWidget);
      ++PlayerComposition.widgetDragDuration;
      if (field754 && field912) {
         int var1 = MouseHandler.MouseHandler_x;
         int var2 = MouseHandler.MouseHandler_y;
         var1 -= widgetClickX;
         var2 -= widgetClickY;
         if (var1 < field714) {
            var1 = field714;
         }

         if (var1 + clickedWidget.width > field714 + clickedWidgetParent.width) {
            var1 = field714 + clickedWidgetParent.width - clickedWidget.width;
         }

         if (var2 < field844) {
            var2 = field844;
         }

         if (var2 + clickedWidget.height > field844 + clickedWidgetParent.height) {
            var2 = field844 + clickedWidgetParent.height - clickedWidget.height;
         }

         int var3 = var1 - field784;
         int var4 = var2 - field847;
         int var5 = clickedWidget.dragZoneSize;
         if (PlayerComposition.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            isDraggingWidget = true;
         }

         int var6 = var1 - field714 + clickedWidgetParent.scrollX;
         int var7 = var2 - field844 + clickedWidgetParent.scrollY;
         ScriptEvent var8;
         if (clickedWidget.onDrag != null && isDraggingWidget) {
            var8 = new ScriptEvent();
            var8.widget = clickedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.args = clickedWidget.onDrag;
            PacketWriter.runScriptEvent(var8);
         }

         if (MouseHandler.MouseHandler_currentButton == 0) {
            if (isDraggingWidget) {
               if (clickedWidget.onDragComplete != null) {
                  var8 = new ScriptEvent();
                  var8.widget = clickedWidget;
                  var8.mouseX = var6;
                  var8.mouseY = var7;
                  var8.dragTarget = draggedOnWidget;
                  var8.args = clickedWidget.onDragComplete;
                  PacketWriter.runScriptEvent(var8);
               }

               if (draggedOnWidget != null && Strings.method4325(clickedWidget) != null) {
                  PacketBufferNode var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2272, packetWriter.isaacCipher);
                  var9.packetBuffer.method5736(draggedOnWidget.id);
                  var9.packetBuffer.writeShort(clickedWidget.childIndex);
                  var9.packetBuffer.writeIntME(clickedWidget.itemId);
                  var9.packetBuffer.method5725(draggedOnWidget.childIndex);
                  var9.packetBuffer.method5725(draggedOnWidget.itemId);
                  var9.packetBuffer.method5736(clickedWidget.id);
                  packetWriter.addNode(var9);
               }
            } else if (this.shouldLeftClickOpenMenu()) {
               this.openMenu(field784 + widgetClickX, widgetClickY + field847);
            } else if (menuOptionsCount > 0) {
               LoginPacket.method3812(field784 + widgetClickX, field847 + widgetClickY);
            }

            clickedWidget = null;
         }

      } else {
         if (PlayerComposition.widgetDragDuration > 1) {
            clickedWidget = null;
         }

      }
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      descriptor = "(B)Lkk;",
      garbageValue = "75"
   )
   @Export("username")
   public Username username() {
      return UserComparator9.localPlayer != null ? UserComparator9.localPlayer.username : null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Lit;",
      garbageValue = "-1847774417"
   )
   @Export("KitDefinition_get")
   public static KitDefinition KitDefinition_get(int var0) {
      KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
         var1 = new KitDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         KitDefinition.KitDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/Socket;IIB)Lls;",
      garbageValue = "1"
   )
   public static AbstractSocket method1841(Socket var0, int var1, int var2) throws IOException {
      return new BufferedNetSocket(var0, var1, var2);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZS)I",
      garbageValue = "-2260"
   )
   static int method1839(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_0.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var9;
         if (var0 == ScriptOpcodes.WORLDLIST_START) {
            var9 = Occluder.worldListStart();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
            var9 = Player.getNextWorldListWorld();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else {
            int var3;
            World var7;
            int var8;
            if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var7 = null;

               for(var8 = 0; var8 < World.World_count; ++var8) {
                  if (var3 == World.World_worlds[var8].id) {
                     var7 = World.World_worlds[var8];
                     break;
                  }
               }

               if (var7 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
               Interpreter.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
               var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
               Varps.sortWorldList(var3, var10, var8, var6);
               return 1;
            } else if (var0 != ScriptOpcodes.GETWORLDINFO) {
               if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                  followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else {
                  int var4;
                  ParamComposition var5;
                  if (var0 == ScriptOpcodes.NC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = AbstractArchive.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class90.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class90.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.LC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = AbstractArchive.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapAreaData.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapAreaData.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.OC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = AbstractArchive.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class281.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = AbstractArchive.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = FloorUnderlayDefinition.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FloorUnderlayDefinition.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ON_MOBILE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = onMobile ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CLIENTTYPE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = clientType & 3;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                     return 1;
                  } else if (var0 == 6522) {
                     --Interpreter.Interpreter_stringStackSize;
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 6523) {
                     --Interpreter.Interpreter_stringStackSize;
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = field667;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (var3 >= 0 && var3 < World.World_count) {
                  var7 = World.World_worlds[var3];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
