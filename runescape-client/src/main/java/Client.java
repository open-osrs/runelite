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
	static PlayerComposition playerAppearance;
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
	static boolean field863;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1878956735
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 839347685
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1170422349
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bx")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bc")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1136397929
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -2016510315
	)
	static int field667;
	@ObfuscatedName("bg")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -196452763
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ca")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1348493889
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		longValue = -1640105390398986909L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 855740267
	)
	static int field675;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1934473741
	)
	static int field687;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		longValue = 7781100239728416583L
	)
	static long field853;
	@ObfuscatedName("cm")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cc")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -685772431
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -482349871
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1334665879
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1077114245
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 635139827
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -2046511493
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1644283943
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1136931287
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 15096337
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
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
		intValue = -448019029
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
		field863 = true; // L: 183
		worldId = 1; // L: 184
		worldProperties = 0; // L: 185
		gameBuild = 0; // L: 187
		isMembersWorld = false; // L: 190
		isLowDetail = false; // L: 191
		clientType = -1; // L: 196
		field667 = -1; // L: 197
		onMobile = false; // L: 198
		gameState = 0; // L: 199
		isLoading = true; // L: 220
		cycle = 0; // L: 221
		mouseLastLastPressedTimeMillis = -1L; // L: 222
		field675 = -1; // L: 224
		field687 = -1; // L: 225
		field853 = -1L; // L: 226
		hadFocus = true; // L: 227
		displayFps = false; // L: 228
		rebootTimer = 0; // L: 229
		hintArrowType = 0; // L: 230
		hintArrowNpcIndex = 0; // L: 231
		hintArrowPlayerIndex = 0; // L: 232
		hintArrowX = 0; // L: 233
		hintArrowY = 0; // L: 234
		hintArrowHeight = 0; // L: 235
		hintArrowSubX = 0; // L: 236
		hintArrowSubY = 0; // L: 237
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 239
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 240
		titleLoadingStage = 0; // L: 242
		js5ConnectState = 0; // L: 245
		field761 = 0; // L: 246
		js5Errors = 0; // L: 268
		loginState = 0; // L: 270
		field696 = 0; // L: 271
		field786 = 0; // L: 272
		field701 = 0; // L: 273
		field661 = class169.field2012; // L: 274
		Login_isUsernameRemembered = false; // L: 283
		secureRandomFuture = new SecureRandomFuture(); // L: 284
		randomDatData = null; // L: 289
		npcs = new NPC[32768]; // L: 293
		npcCount = 0; // L: 294
		npcIndices = new int[32768]; // L: 295
		field725 = 0; // L: 296
		field697 = new int[250]; // L: 297
		packetWriter = new PacketWriter(); // L: 300
		logoutTimer = 0; // L: 302
		field712 = false; // L: 303
		useBufferedSocket = true; // L: 304
		timer = new Timer(); // L: 305
		fontsMap = new HashMap(); // L: 311
		field785 = 0; // L: 318
		field717 = 1; // L: 319
		field718 = 0; // L: 320
		field719 = 1; // L: 321
		field720 = 0; // L: 322
		collisionMaps = new CollisionMap[4]; // L: 330
		isInInstance = false; // L: 331
		instanceChunkTemplates = new int[4][13][13]; // L: 332
		field724 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 333
		field808 = 0; // L: 336
		field727 = 2301979; // L: 348
		field777 = 5063219; // L: 349
		field729 = 3353893; // L: 350
		field730 = 7759444; // L: 351
		field731 = false; // L: 352
		alternativeScrollbarWidth = 0; // L: 353
		camAngleX = 128; // L: 361
		camAngleY = 0; // L: 362
		camAngleDY = 0; // L: 363
		camAngleDX = 0; // L: 364
		mouseCamClickedX = 0; // L: 365
		mouseCamClickedY = 0; // L: 366
		oculusOrbState = 0; // L: 367
		camFollowHeight = 50; // L: 368
		field818 = 0; // L: 372
		field742 = 0; // L: 373
		field743 = 0; // L: 374
		oculusOrbNormalSpeed = 12; // L: 376
		oculusOrbSlowedSpeed = 6; // L: 377
		field746 = 0; // L: 378
		field747 = false; // L: 379
		field926 = 0; // L: 380
		field678 = false; // L: 381
		field880 = 0; // L: 382
		overheadTextCount = 0; // L: 383
		overheadTextLimit = 50; // L: 384
		overheadTextXs = new int[overheadTextLimit]; // L: 385
		overheadTextYs = new int[overheadTextLimit]; // L: 386
		overheadTextAscents = new int[overheadTextLimit]; // L: 387
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 388
		overheadTextColors = new int[overheadTextLimit]; // L: 389
		overheadTextEffects = new int[overheadTextLimit]; // L: 390
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 391
		overheadText = new String[overheadTextLimit]; // L: 392
		tileLastDrawnActor = new int[104][104]; // L: 393
		viewportDrawCount = 0; // L: 394
		viewportTempX = -1; // L: 395
		viewportTempY = -1; // L: 396
		mouseCrossX = 0; // L: 397
		mouseCrossY = 0; // L: 398
		mouseCrossState = 0; // L: 399
		mouseCrossColor = 0; // L: 400
		showMouseCross = true; // L: 401
		field770 = 0; // L: 403
		field931 = 0; // L: 404
		dragItemSlotSource = 0; // L: 407
		draggedWidgetX = 0; // L: 408
		draggedWidgetY = 0; // L: 409
		dragItemSlotDestination = 0; // L: 410
		field776 = false; // L: 411
		itemDragDuration = 0; // L: 412
		field778 = 0; // L: 413
		showLoadingMessages = true; // L: 415
		players = new Player[2048]; // L: 417
		localPlayerIndex = -1; // L: 419
		field673 = 0; // L: 420
		renderSelf = true; // L: 422
		drawPlayerNames = 0; // L: 427
		field851 = 0; // L: 428
		field845 = new int[1000]; // L: 429
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 431
		playerMenuActions = new String[8]; // L: 432
		playerOptionsPriorities = new boolean[8]; // L: 433
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 434
		combatTargetPlayerIndex = -1; // L: 435
		groundItems = new NodeDeque[4][104][104]; // L: 436
		pendingSpawns = new NodeDeque(); // L: 437
		projectiles = new NodeDeque(); // L: 438
		graphicsObjects = new NodeDeque(); // L: 439
		currentLevels = new int[25]; // L: 440
		levels = new int[25]; // L: 441
		experience = new int[25]; // L: 442
		leftClickOpensMenu = 0; // L: 443
		isMenuOpen = false; // L: 444
		menuOptionsCount = 0; // L: 450
		menuArguments1 = new int[500]; // L: 451
		menuArguments2 = new int[500]; // L: 452
		menuOpcodes = new int[500]; // L: 453
		menuIdentifiers = new int[500]; // L: 454
		menuActions = new String[500]; // L: 455
		menuTargets = new String[500]; // L: 456
		menuShiftClick = new boolean[500]; // L: 457
		followerOpsLowPriority = false; // L: 458
		shiftClickDrop = false; // L: 460
		tapToDrop = false; // L: 461
		showMouseOverText = true; // L: 462
		viewportX = -1; // L: 463
		viewportY = -1; // L: 464
		field815 = 0; // L: 468
		field925 = 50; // L: 469
		isItemSelected = 0; // L: 470
		selectedItemName = null; // L: 474
		isSpellSelected = false; // L: 475
		selectedSpellChildIndex = -1; // L: 477
		field821 = -1; // L: 478
		selectedSpellActionName = null; // L: 480
		selectedSpellName = null; // L: 481
		rootInterface = -1; // L: 482
		interfaceParents = new NodeHashTable(8); // L: 483
		field705 = 0; // L: 488
		field699 = -1; // L: 489
		chatEffects = 0; // L: 490
		field829 = 0; // L: 491
		meslayerContinueWidget = null; // L: 492
		runEnergy = 0; // L: 493
		weight = 0; // L: 494
		staffModLevel = 0; // L: 495
		followerIndex = -1; // L: 496
		playerMod = false; // L: 497
		viewportWidget = null; // L: 498
		clickedWidget = null; // L: 499
		clickedWidgetParent = null; // L: 500
		widgetClickX = 0; // L: 501
		widgetClickY = 0; // L: 502
		draggedOnWidget = null; // L: 503
		field912 = false; // L: 504
		field714 = -1; // L: 505
		field844 = -1; // L: 506
		field754 = false; // L: 507
		field784 = -1; // L: 508
		field847 = -1; // L: 509
		isDraggingWidget = false; // L: 510
		cycleCntr = 1; // L: 515
		changedVarps = new int[32]; // L: 518
		changedVarpCount = 0; // L: 519
		changedItemContainers = new int[32]; // L: 520
		field870 = 0; // L: 521
		changedSkills = new int[32]; // L: 522
		changedSkillsCount = 0; // L: 523
		chatCycle = 0; // L: 524
		field857 = 0; // L: 525
		field858 = 0; // L: 526
		field710 = 0; // L: 527
		field860 = 0; // L: 528
		field861 = 0; // L: 529
		mouseWheelRotation = 0; // L: 532
		scriptEvents = new NodeDeque(); // L: 533
		field660 = new NodeDeque(); // L: 534
		field865 = new NodeDeque(); // L: 535
		widgetFlags = new NodeHashTable(512); // L: 536
		rootWidgetCount = 0; // L: 538
		field868 = -2; // L: 539
		field816 = new boolean[100]; // L: 540
		field827 = new boolean[100]; // L: 541
		field871 = new boolean[100]; // L: 542
		rootWidgetXs = new int[100]; // L: 543
		rootWidgetYs = new int[100]; // L: 544
		rootWidgetWidths = new int[100]; // L: 545
		rootWidgetHeights = new int[100]; // L: 546
		gameDrawingMode = 0; // L: 547
		field938 = 0L; // L: 548
		isResizable = true; // L: 549
		field879 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 556
		publicChatMode = 0; // L: 557
		tradeChatMode = 0; // L: 559
		field882 = ""; // L: 560
		field883 = new long[100]; // L: 562
		field884 = 0; // L: 563
		field885 = 0; // L: 565
		field886 = new int[128]; // L: 566
		field738 = new int[128]; // L: 567
		field888 = -1L; // L: 568
		field889 = -1; // L: 571
		mapIconCount = 0; // L: 572
		mapIconXs = new int[1000]; // L: 573
		mapIconYs = new int[1000]; // L: 574
		mapIcons = new SpritePixels[1000]; // L: 575
		destinationX = 0; // L: 576
		destinationY = 0; // L: 577
		minimapState = 0; // L: 584
		currentTrackGroupId = -1; // L: 585
		field899 = false; // L: 586
		soundEffectCount = 0; // L: 592
		soundEffectIds = new int[50]; // L: 593
		queuedSoundEffectLoops = new int[50]; // L: 594
		queuedSoundEffectDelays = new int[50]; // L: 595
		soundLocations = new int[50]; // L: 596
		soundEffects = new SoundEffect[50]; // L: 597
		isCameraLocked = false; // L: 599
		field907 = new boolean[5]; // L: 611
		field908 = new int[5]; // L: 612
		field909 = new int[5]; // L: 613
		field799 = new int[5]; // L: 614
		field911 = new int[5]; // L: 615
		field779 = 256; // L: 616
		field913 = 205; // L: 617
		zoomHeight = 256; // L: 618
		zoomWidth = 320; // L: 619
		field916 = 1; // L: 620
		field690 = 32767; // L: 621
		field918 = 1; // L: 622
		field846 = 32767; // L: 623
		viewportOffsetX = 0; // L: 624
		viewportOffsetY = 0; // L: 625
		viewportWidth = 0; // L: 626
		viewportHeight = 0; // L: 627
		viewportZoom = 0; // L: 628
		playerAppearance = new PlayerComposition(); // L: 630
		field850 = -1; // L: 631
		field927 = -1; // L: 632
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 634
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 636
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 639
		field674 = -1; // L: 646
		archiveLoaders = new ArrayList(10); // L: 647
		archiveLoadersDone = 0; // L: 648
		field934 = 0; // L: 649
		field935 = new ApproximateRouteStrategy(); // L: 658
		field708 = new int[50]; // L: 659
		field859 = new int[50]; // L: 660
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-226650241"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field938 = Tiles.currentTimeMillis() + 500L; // L: 3831
		this.resizeJS(); // L: 3832
		if (rootInterface != -1) { // L: 3833
			this.resizeRoot(true);
		}

	} // L: 3834

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-337269105"
	)
	@Export("setUp")
	protected final void setUp() {
		Strings.method4329(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 791
		MouseRecorder.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 792
		FrameProvider.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 793
		DynamicObject.currentPort = MouseRecorder.worldPort; // L: 794
		PlayerComposition.field2565 = MinimapRenderer.field2577; // L: 795
		class105.field1339 = MinimapRenderer.field2573; // L: 796
		HealthBar.field1143 = MinimapRenderer.field2575; // L: 797
		WorldMapSprite.field259 = MinimapRenderer.field2574; // L: 798
		ScriptFrame.urlRequester = new UrlRequester(); // L: 799
		this.setUpKeyboard(); // L: 800
		this.setUpMouse(); // L: 801
		PlayerType.mouseWheel = this.mouseWheel(); // L: 802
		WorldMapScaleHandler.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 803
		AccessFile var2 = null; // L: 806
		ClientPreferences var3 = new ClientPreferences(); // L: 807

		try {
			var2 = WorldMapRectangle.getPreferencesFile("", FontName.field3699.name, false); // L: 809
			byte[] var4 = new byte[(int)var2.length()]; // L: 810

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 811 812 815
				var6 = var2.read(var4, var5, var4.length - var5); // L: 813
				if (var6 == -1) { // L: 814
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 817
		} catch (Exception var8) { // L: 819
		}

		try {
			if (var2 != null) { // L: 821
				var2.close();
			}
		} catch (Exception var7) { // L: 823
		}

		WorldMapSectionType.clientPreferences = var3; // L: 826
		this.setUpClipboard(); // L: 827
		KeyHandler.method912(this, WorldMapData_1.null_string); // L: 828
		if (gameBuild != 0) { // L: 829
			displayFps = true;
		}

		GameBuild.setWindowedMode(WorldMapSectionType.clientPreferences.windowMode); // L: 830
		InterfaceParent.friendSystem = new FriendSystem(Message.loginType); // L: 831
	} // L: 832

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-123"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 835
		this.doCycleJs5(); // L: 836

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 840
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 841
			} // L: 842

			if (var1 == null) { // L: 843
				LoginPacket.method3815(); // L: 847
				UserComparator5.playPcmPlayers(); // L: 848
				synchronized(KeyHandler.KeyHandler_instance) { // L: 850
					++KeyHandler.KeyHandler_idleCycles; // L: 851
					KeyHandler.field418 = KeyHandler.field424; // L: 852
					KeyHandler.field421 = 0; // L: 853
					int var5;
					if (KeyHandler.field417 >= 0) { // L: 854
						while (KeyHandler.field417 != KeyHandler.field416) { // L: 859
							var5 = KeyHandler.field407[KeyHandler.field416]; // L: 860
							KeyHandler.field416 = KeyHandler.field416 + 1 & 127; // L: 861
							if (var5 < 0) { // L: 862
								KeyHandler.KeyHandler_pressedKeys[~var5] = false;
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var5] && KeyHandler.field421 < KeyHandler.field420.length - 1) { // L: 864
									KeyHandler.field420[++KeyHandler.field421 - 1] = var5; // L: 865
								}

								KeyHandler.KeyHandler_pressedKeys[var5] = true; // L: 867
							}
						}
					} else {
						for (var5 = 0; var5 < 112; ++var5) { // L: 855
							KeyHandler.KeyHandler_pressedKeys[var5] = false;
						}

						KeyHandler.field417 = KeyHandler.field416; // L: 856
					}

					if (KeyHandler.field421 > 0) { // L: 871
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field424 = KeyHandler.field423; // L: 872
				}

				class60.method967(); // L: 875
				int var6;
				if (PlayerType.mouseWheel != null) { // L: 876
					var6 = PlayerType.mouseWheel.useRotation(); // L: 877
					mouseWheelRotation = var6; // L: 878
				}

				if (gameState == 0) { // L: 880
					GameEngine.load(); // L: 881
					WorldMapSprite.clock.mark(); // L: 883

					for (var6 = 0; var6 < 32; ++var6) { // L: 884
						GameEngine.graphicsTickTimes[var6] = 0L;
					}

					for (var6 = 0; var6 < 32; ++var6) { // L: 885
						GameEngine.clientTickTimes[var6] = 0L;
					}

					VertexNormal.gameCyclesToDo = 0; // L: 886
				} else if (gameState == 5) { // L: 889
					class9.doCycleTitle(this); // L: 890
					GameEngine.load(); // L: 891
					WorldMapSprite.clock.mark(); // L: 893

					for (var6 = 0; var6 < 32; ++var6) { // L: 894
						GameEngine.graphicsTickTimes[var6] = 0L;
					}

					for (var6 = 0; var6 < 32; ++var6) { // L: 895
						GameEngine.clientTickTimes[var6] = 0L;
					}

					VertexNormal.gameCyclesToDo = 0; // L: 896
				} else if (gameState != 10 && gameState != 11) { // L: 899
					if (gameState == 20) { // L: 900
						class9.doCycleTitle(this); // L: 901
						this.doCycleLoggedOut(); // L: 902
					} else if (gameState == 25) { // L: 904
						WorldMapIcon_1.method375();
					}
				} else {
					class9.doCycleTitle(this);
				}

				if (gameState == 30) { // L: 905
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 906
					this.doCycleLoggedOut();
				}

				return; // L: 907
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 844
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
				if (class206.musicPlayerStatus == 2) { // L: 913
					if (class204.musicTrack == null) { // L: 914
						class204.musicTrack = MusicTrack.readTrack(class206.musicTrackArchive, class206.musicTrackGroupId, SoundSystem.musicTrackFileId); // L: 915
						if (class204.musicTrack == null) { // L: 916
							var2 = false; // L: 917
							break label173;
						}
					}

					if (class182.soundCache == null) { // L: 921
						class182.soundCache = new SoundCache(class206.soundEffectsArchive, class206.musicSamplesArchive);
					}

					if (VertexNormal.midiPcmStream.loadMusicTrack(class204.musicTrack, class206.musicPatchesArchive, class182.soundCache, 22050)) { // L: 922
						VertexNormal.midiPcmStream.clearAll(); // L: 923
						VertexNormal.midiPcmStream.setPcmStreamVolume(DevicePcmPlayerProvider.musicTrackVolume); // L: 924
						VertexNormal.midiPcmStream.setMusicTrack(class204.musicTrack, class206.musicTrackBoolean); // L: 925
						class206.musicPlayerStatus = 0; // L: 926
						class204.musicTrack = null; // L: 927
						class182.soundCache = null; // L: 928
						class206.musicTrackArchive = null; // L: 929
						var2 = true; // L: 930
						break label173;
					}
				}
			} catch (Exception var6) { // L: 935
				var6.printStackTrace(); // L: 936
				VertexNormal.midiPcmStream.clear(); // L: 937
				class206.musicPlayerStatus = 0; // L: 938
				class204.musicTrack = null; // L: 939
				class182.soundCache = null; // L: 940
				class206.musicTrackArchive = null; // L: 941
			}

			var2 = false; // L: 943
		}

		if (var2 && field899 && class197.pcmPlayer0 != null) { // L: 946 947
			class197.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field938 && Tiles.currentTimeMillis() > field938) { // L: 949 950
			GameBuild.setWindowedMode(BoundaryObject.getWindowedMode()); // L: 951
		}

		int var4;
		if (var1) { // L: 954
			for (var4 = 0; var4 < 100; ++var4) { // L: 955
				field816[var4] = true;
			}
		}

		if (gameState == 0) { // L: 957
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 958
			MilliClock.drawTitle(ScriptEvent.fontBold12, SecureRandomCallable.fontPlain11, Login.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 959
			if (gameState == 20) { // L: 960
				MilliClock.drawTitle(ScriptEvent.fontBold12, SecureRandomCallable.fontPlain11, Login.fontPlain12);
			} else if (gameState == 25) { // L: 961
				if (field720 == 1) { // L: 962
					if (field785 > field717) { // L: 963
						field717 = field785;
					}

					var4 = (field717 * 50 - field785 * 50) / field717; // L: 964
					WorldMapIcon_1.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 965
				} else if (field720 == 2) { // L: 967
					if (field718 > field719) { // L: 968
						field719 = field718;
					}

					var4 = (field719 * 50 - field718 * 50) / field719 + 50; // L: 969
					WorldMapIcon_1.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 970
				} else {
					WorldMapIcon_1.drawLoadingMessage("Loading - please wait.", false); // L: 972
				}
			} else if (gameState == 30) { // L: 974
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 975
				WorldMapIcon_1.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 976
				WorldMapIcon_1.drawLoadingMessage("Please wait...", false);
			}
		} else {
			MilliClock.drawTitle(ScriptEvent.fontBold12, SecureRandomCallable.fontPlain11, Login.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 977
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 978
				if (field827[var4]) { // L: 979
					FileSystem.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 980
					field827[var4] = false; // L: 981
				}
			}
		} else if (gameState > 0) { // L: 985
			FileSystem.rasterProvider.drawFull(0, 0); // L: 986

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 987
				field827[var4] = false;
			}
		}

	} // L: 989

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1925350941"
	)
	@Export("kill0")
	protected final void kill0() {
		if (GrandExchangeOffer.varcs.hasUnwrittenChanges()) { // L: 992
			GrandExchangeOffer.varcs.write();
		}

		if (Friend.mouseRecorder != null) { // L: 993
			Friend.mouseRecorder.isRunning = false;
		}

		Friend.mouseRecorder = null; // L: 994
		packetWriter.close(); // L: 995
		if (KeyHandler.KeyHandler_instance != null) { // L: 997
			synchronized(KeyHandler.KeyHandler_instance) { // L: 998
				KeyHandler.KeyHandler_instance = null; // L: 999
			} // L: 1000
		}

		if (MouseHandler.MouseHandler_instance != null) { // L: 1004
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1005
				MouseHandler.MouseHandler_instance = null; // L: 1006
			} // L: 1007
		}

		PlayerType.mouseWheel = null; // L: 1010
		if (class197.pcmPlayer0 != null) { // L: 1011
			class197.pcmPlayer0.shutdown();
		}

		if (WorldMapDecorationType.pcmPlayer1 != null) { // L: 1012
			WorldMapDecorationType.pcmPlayer1.shutdown();
		}

		WorldMapAreaData.method782(); // L: 1013
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1015
			if (ArchiveDiskActionHandler.field3187 != 0) { // L: 1016
				ArchiveDiskActionHandler.field3187 = 1; // L: 1017

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1019
				} catch (InterruptedException var5) { // L: 1021
				}
			}
		}

		if (ScriptFrame.urlRequester != null) { // L: 1025
			ScriptFrame.urlRequester.close(); // L: 1026
			ScriptFrame.urlRequester = null; // L: 1027
		}

		WorldMapSection2.method387(); // L: 1029
	} // L: 1030

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "103"
	)
	protected final void vmethod1423() {
	} // L: 667

	public final void init() {
		try {
			if (this.checkHost()) { // L: 673
				for (int var1 = 0; var1 <= 20; ++var1) { // L: 674
					String var2 = this.getParameter(Integer.toString(var1)); // L: 675
					if (var2 != null) { // L: 676
						switch(var1) { // L: 677
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 726
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 713
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 714
							}
							break;
						case 4:
							if (clientType == -1) { // L: 719
								clientType = Integer.parseInt(var2); // L: 720
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 696
							break; // L: 697
						case 6:
							NPCComposition.clientLanguage = Language.method3854(Integer.parseInt(var2)); // L: 758
							break; // L: 759
						case 7:
							int var4 = Integer.parseInt(var2); // L: 737
							GameBuild[] var5 = class1.method16(); // L: 740
							int var6 = 0;

							GameBuild var3;
							while (true) {
								if (var6 >= var5.length) {
									var3 = null; // L: 751
									break;
								}

								GameBuild var7 = var5[var6]; // L: 742
								if (var4 == var7.buildId) { // L: 744
									var3 = var7; // L: 745
									break; // L: 746
								}

								++var6; // L: 741
							}

							Skills.field2774 = var3; // L: 753
							break; // L: 754
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 685
							}
							break;
						case 9:
							AccessFile.field4100 = var2; // L: 708
							break; // L: 709
						case 10:
							FontName.field3699 = (StudioGame)InterfaceParent.findEnumerated(DesktopPlatformInfoProvider.method6478(), Integer.parseInt(var2)); // L: 701
							if (FontName.field3699 == StudioGame.oldscape) { // L: 702
								Message.loginType = LoginType.oldscape;
							} else {
								Message.loginType = LoginType.field4072; // L: 703
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 691
							break; // L: 692
						case 14:
							ItemLayer.field1562 = Integer.parseInt(var2); // L: 731
							break; // L: 732
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 763
							break;
						case 17:
							Projectile.field1254 = var2; // L: 680
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 770
				isLowDetail = false; // L: 771
				MusicPatchNode.worldHost = this.getCodeBase().getHost(); // L: 773
				String var8 = Skills.field2774.name; // L: 774
				byte var9 = 0; // L: 775

				try {
					Projectile.findAndLoadCache("oldschool", var8, var9, 21); // L: 777
				} catch (Exception var10) { // L: 779
					SequenceDefinition.RunException_sendStackTrace((String)null, var10); // L: 780
				}

				class1.client = this; // L: 782
				class217.clientType = clientType; // L: 783
				if (field667 == -1) { // L: 784
					field667 = 0; // L: 785
				}

				this.startThread(765, 503, 194); // L: 787
			}
		} catch (RuntimeException var11) {
			throw class298.newRunException(var11, "client.init(" + ')');
		}
	} // L: 788

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1069
			long var2 = Tiles.currentTimeMillis(); // L: 1072
			int var4 = (int)(var2 - NetCache.field3222); // L: 1073
			NetCache.field3222 = var2; // L: 1074
			if (var4 > 200) { // L: 1075
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1076
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1077
				var1 = true; // L: 1078
			} else if (class297.NetCache_socket == null) { // L: 1081
				var1 = false; // L: 1082
			} else {
				try {
					label243: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1086
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1087
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1088
							var6 = new Buffer(4); // L: 1089
							var6.writeByte(1); // L: 1090
							var6.writeMedium((int)var5.key); // L: 1091
							class297.NetCache_socket.write(var6.array, 0, 4); // L: 1092
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1093
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1094
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1095
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1097
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1098
							var6 = new Buffer(4); // L: 1099
							var6.writeByte(0); // L: 1100
							var6.writeMedium((int)var5.key); // L: 1101
							class297.NetCache_socket.write(var6.array, 0, 4); // L: 1102
							var5.removeDual(); // L: 1103
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1104
							--NetCache.NetCache_pendingWritesCount; // L: 1105
							++NetCache.NetCache_pendingResponsesCount; // L: 1106
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1108
							int var18 = class297.NetCache_socket.available(); // L: 1109
							if (var18 < 0) { // L: 1110
								throw new IOException();
							}

							if (var18 == 0) { // L: 1111
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1112
							byte var7 = 0; // L: 1113
							if (SecureRandomCallable.NetCache_currentResponse == null) { // L: 1114
								var7 = 8;
							} else if (NetCache.field3219 == 0) { // L: 1115
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1116
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1117
								if (var8 > var18) { // L: 1118
									var8 = var18;
								}

								class297.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1119
								if (NetCache.field3213 != 0) { // L: 1120
									for (var9 = 0; var9 < var8; ++var9) { // L: 1121
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3213;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1123
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1124
									break;
								}

								if (SecureRandomCallable.NetCache_currentResponse == null) { // L: 1125
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1126
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1127
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1128
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1129
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1130
									long var13 = (long)(var10 + (var9 << 16)); // L: 1131
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1132
									PlayerType.field3137 = true; // L: 1133
									if (var15 == null) { // L: 1134
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1135
										PlayerType.field3137 = false; // L: 1136
									}

									if (var15 == null) { // L: 1138
										throw new IOException(); // L: 1139
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1141
									SecureRandomCallable.NetCache_currentResponse = var15; // L: 1142
									NetCache.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + SecureRandomCallable.NetCache_currentResponse.padding); // L: 1143
									NetCache.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1144
									NetCache.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1145
									NetCache.field3219 = 8; // L: 1146
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1147
								} else if (NetCache.field3219 == 0) { // L: 1150
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1151
										NetCache.field3219 = 1; // L: 1152
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1153
									} else {
										SecureRandomCallable.NetCache_currentResponse = null; // L: 1157
									}
								}
							} else {
								var8 = NetCache.NetCache_responseArchiveBuffer.array.length - SecureRandomCallable.NetCache_currentResponse.padding; // L: 1163
								var9 = 512 - NetCache.field3219; // L: 1164
								if (var9 > var8 - NetCache.NetCache_responseArchiveBuffer.offset) { // L: 1165
									var9 = var8 - NetCache.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1166
									var9 = var18;
								}

								class297.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var9); // L: 1167
								if (NetCache.field3213 != 0) { // L: 1168
									for (var10 = 0; var10 < var9; ++var10) { // L: 1169
										var10000 = NetCache.NetCache_responseArchiveBuffer.array;
										var10001 = NetCache.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3213;
									}
								}

								var25 = NetCache.NetCache_responseArchiveBuffer; // L: 1171
								var25.offset += var9;
								NetCache.field3219 += var9; // L: 1172
								if (var8 == NetCache.NetCache_responseArchiveBuffer.offset) { // L: 1173
									if (SecureRandomCallable.NetCache_currentResponse.key == 16711935L) { // L: 1174
										SoundSystem.NetCache_reference = NetCache.NetCache_responseArchiveBuffer; // L: 1175

										for (var10 = 0; var10 < 256; ++var10) { // L: 1176
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1177
											if (var19 != null) { // L: 1178
												SoundSystem.NetCache_reference.offset = var10 * 8 + 5; // L: 1179
												var12 = SoundSystem.NetCache_reference.readInt(); // L: 1180
												int var20 = SoundSystem.NetCache_reference.readInt(); // L: 1181
												var19.loadIndex(var12, var20); // L: 1182
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1187
										NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1188
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1189
										if (var10 != SecureRandomCallable.NetCache_currentResponse.crc) { // L: 1190
											try {
												class297.NetCache_socket.close(); // L: 1192
											} catch (Exception var23) { // L: 1194
											}

											++NetCache.NetCache_crcMismatches; // L: 1195
											class297.NetCache_socket = null; // L: 1196
											NetCache.field3213 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1197
											var1 = false; // L: 1198
											break label243;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1201
										NetCache.NetCache_ioExceptions = 0; // L: 1202
										SecureRandomCallable.NetCache_currentResponse.archive.write((int)(SecureRandomCallable.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, 16711680L == (SecureRandomCallable.NetCache_currentResponse.key & 16711680L), PlayerType.field3137); // L: 1203
									}

									SecureRandomCallable.NetCache_currentResponse.remove(); // L: 1205
									if (PlayerType.field3137) { // L: 1206
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1207
									}

									NetCache.field3219 = 0; // L: 1208
									SecureRandomCallable.NetCache_currentResponse = null; // L: 1209
									NetCache.NetCache_responseArchiveBuffer = null; // L: 1210
								} else {
									if (NetCache.field3219 != 512) { // L: 1212
										break;
									}

									NetCache.field3219 = 0;
								}
							}
						}

						var1 = true; // L: 1216
					}
				} catch (IOException var24) {
					try {
						class297.NetCache_socket.close(); // L: 1220
					} catch (Exception var22) { // L: 1222
					}

					++NetCache.NetCache_ioExceptions; // L: 1223
					class297.NetCache_socket = null; // L: 1224
					var1 = false; // L: 1225
				}
			}

			if (!var1) { // L: 1229
				this.doCycleJs5Connect();
			}

		}
	} // L: 1230

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1394260996"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1233
			this.error("js5crc"); // L: 1234
			gameState = 1000; // L: 1235
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1238
				if (gameState <= 5) { // L: 1239
					this.error("js5io"); // L: 1240
					gameState = 1000; // L: 1241
					return; // L: 1242
				}

				field761 = 3000; // L: 1245
				NetCache.NetCache_ioExceptions = 3; // L: 1246
			}

			if (--field761 + 1 <= 0) { // L: 1249
				try {
					if (js5ConnectState == 0) { // L: 1251
						TaskHandler.js5SocketTask = GameEngine.taskHandler.newSocketTask(MusicPatchNode.worldHost, DynamicObject.currentPort); // L: 1252
						++js5ConnectState; // L: 1253
					}

					if (js5ConnectState == 1) { // L: 1255
						if (TaskHandler.js5SocketTask.status == 2) { // L: 1256
							this.js5Error(-1); // L: 1257
							return; // L: 1258
						}

						if (TaskHandler.js5SocketTask.status == 1) { // L: 1260
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1262
						if (useBufferedSocket) { // L: 1263
							WorldMapArea.js5Socket = method1841((Socket)TaskHandler.js5SocketTask.result, 40000, 5000); // L: 1264
						} else {
							WorldMapArea.js5Socket = new NetSocket((Socket)TaskHandler.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1267
						}

						Buffer var1 = new Buffer(5); // L: 1269
						var1.writeByte(15); // L: 1270
						var1.writeInt(194); // L: 1271
						WorldMapArea.js5Socket.write(var1.array, 0, 5); // L: 1272
						++js5ConnectState; // L: 1273
						World.field1036 = Tiles.currentTimeMillis(); // L: 1274
					}

					if (js5ConnectState == 3) { // L: 1276
						if (WorldMapArea.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1277
							int var5 = WorldMapArea.js5Socket.readUnsignedByte(); // L: 1278
							if (var5 != 0) { // L: 1279
								this.js5Error(var5); // L: 1280
								return; // L: 1281
							}

							++js5ConnectState; // L: 1283
						} else if (Tiles.currentTimeMillis() - World.field1036 > 30000L) { // L: 1286
							this.js5Error(-2); // L: 1287
							return; // L: 1288
						}
					}

					if (js5ConnectState == 4) { // L: 1292
						AbstractSocket var10 = WorldMapArea.js5Socket; // L: 1293
						boolean var2 = gameState > 20; // L: 1294
						if (class297.NetCache_socket != null) { // L: 1296
							try {
								class297.NetCache_socket.close(); // L: 1298
							} catch (Exception var8) { // L: 1300
							}

							class297.NetCache_socket = null; // L: 1301
						}

						class297.NetCache_socket = var10; // L: 1303
						Actor.method1867(var2); // L: 1304
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1305
						SecureRandomCallable.NetCache_currentResponse = null; // L: 1306
						NetCache.NetCache_responseArchiveBuffer = null; // L: 1307
						NetCache.field3219 = 0; // L: 1308

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1310
							if (var3 == null) { // L: 1311
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1317
									if (var3 == null) { // L: 1318
										if (NetCache.field3213 != 0) { // L: 1324
											try {
												Buffer var11 = new Buffer(4); // L: 1326
												var11.writeByte(4); // L: 1327
												var11.writeByte(NetCache.field3213); // L: 1328
												var11.writeShort(0); // L: 1329
												class297.NetCache_socket.write(var11.array, 0, 4); // L: 1330
											} catch (IOException var7) {
												try {
													class297.NetCache_socket.close(); // L: 1334
												} catch (Exception var6) { // L: 1336
												}

												++NetCache.NetCache_ioExceptions; // L: 1337
												class297.NetCache_socket = null; // L: 1338
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1341
										NetCache.field3222 = Tiles.currentTimeMillis(); // L: 1342
										TaskHandler.js5SocketTask = null; // L: 1344
										WorldMapArea.js5Socket = null; // L: 1345
										js5ConnectState = 0; // L: 1346
										js5Errors = 0; // L: 1347
										return; // L: 1353
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1319
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1320
									++NetCache.NetCache_pendingWritesCount; // L: 1321
									--NetCache.NetCache_pendingResponsesCount; // L: 1322
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1312
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1313
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1314
						}
					}
				} catch (IOException var9) { // L: 1350
					this.js5Error(-3); // L: 1351
				}

			}
		}
	} // L: 1236

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "78"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		TaskHandler.js5SocketTask = null; // L: 1356
		WorldMapArea.js5Socket = null; // L: 1357
		js5ConnectState = 0; // L: 1358
		if (DynamicObject.currentPort == MouseRecorder.worldPort) { // L: 1359
			DynamicObject.currentPort = FrameProvider.js5Port;
		} else {
			DynamicObject.currentPort = MouseRecorder.worldPort; // L: 1360
		}

		++js5Errors; // L: 1361
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1362
			if (gameState <= 5) { // L: 1363
				this.error("js5connect_full"); // L: 1364
				gameState = 1000; // L: 1365
			} else {
				field761 = 3000; // L: 1367
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1369
			this.error("js5connect_outofdate"); // L: 1370
			gameState = 1000; // L: 1371
		} else if (js5Errors >= 4) { // L: 1373
			if (gameState <= 5) { // L: 1374
				this.error("js5connect"); // L: 1375
				gameState = 1000; // L: 1376
			} else {
				field761 = 3000; // L: 1378
			}
		}

	} // L: 1380

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1483271988"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1795
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1796

		try {
			if (loginState == 0) { // L: 1798
				if (WorldMapManager.secureRandom == null && (secureRandomFuture.isDone() || field696 > 250)) { // L: 1799
					WorldMapManager.secureRandom = secureRandomFuture.get(); // L: 1800
					secureRandomFuture.shutdown(); // L: 1801
					secureRandomFuture = null; // L: 1802
				}

				if (WorldMapManager.secureRandom != null) { // L: 1804
					if (var1 != null) { // L: 1805
						((AbstractSocket)var1).close(); // L: 1806
						var1 = null; // L: 1807
					}

					NetSocket.socketTask = null; // L: 1809
					field712 = false; // L: 1810
					field696 = 0; // L: 1811
					loginState = 1; // L: 1812
				}
			}

			if (loginState == 1) { // L: 1815
				if (NetSocket.socketTask == null) { // L: 1816
					NetSocket.socketTask = GameEngine.taskHandler.newSocketTask(MusicPatchNode.worldHost, DynamicObject.currentPort); // L: 1817
				}

				if (NetSocket.socketTask.status == 2) { // L: 1819
					throw new IOException();
				}

				if (NetSocket.socketTask.status == 1) { // L: 1820
					if (useBufferedSocket) { // L: 1821
						var1 = method1841((Socket)NetSocket.socketTask.result, 40000, 5000); // L: 1822
					} else {
						var1 = new NetSocket((Socket)NetSocket.socketTask.result, GameEngine.taskHandler, 5000); // L: 1825
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 1827
					NetSocket.socketTask = null; // L: 1828
					loginState = 2; // L: 1829
				}
			}

			PacketBufferNode var4;
			if (loginState == 2) { // L: 1832
				packetWriter.clearBuffer(); // L: 1833
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 1838
					var4 = new PacketBufferNode(); // L: 1839
				} else {
					var4 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 1842
				}

				var4.clientPacket = null; // L: 1845
				var4.clientPacketLength = 0; // L: 1846
				var4.packetBuffer = new PacketBuffer(5000); // L: 1847
				var4.packetBuffer.writeByte(LoginPacket.field2342.id); // L: 1851
				packetWriter.addNode(var4); // L: 1852
				packetWriter.flush(); // L: 1853
				var2.offset = 0; // L: 1854
				loginState = 3; // L: 1855
			}

			boolean var12;
			int var13;
			if (loginState == 3) { // L: 1857
				if (class197.pcmPlayer0 != null) { // L: 1858
					class197.pcmPlayer0.method2612();
				}

				if (WorldMapDecorationType.pcmPlayer1 != null) { // L: 1859
					WorldMapDecorationType.pcmPlayer1.method2612();
				}

				var12 = true; // L: 1860
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 1861 1862
					var12 = false;
				}

				if (var12) { // L: 1864
					var13 = ((AbstractSocket)var1).readUnsignedByte(); // L: 1865
					if (class197.pcmPlayer0 != null) { // L: 1866
						class197.pcmPlayer0.method2612();
					}

					if (WorldMapDecorationType.pcmPlayer1 != null) { // L: 1867
						WorldMapDecorationType.pcmPlayer1.method2612();
					}

					if (var13 != 0) { // L: 1868
						class52.getLoginError(var13); // L: 1869
						return; // L: 1870
					}

					var2.offset = 0; // L: 1872
					loginState = 4; // L: 1873
				}
			}

			int var35;
			if (loginState == 4) { // L: 1876
				if (var2.offset < 8) { // L: 1877
					var35 = ((AbstractSocket)var1).available(); // L: 1878
					if (var35 > 8 - var2.offset) { // L: 1879
						var35 = 8 - var2.offset;
					}

					if (var35 > 0) { // L: 1880
						((AbstractSocket)var1).read(var2.array, var2.offset, var35); // L: 1881
						var2.offset += var35; // L: 1882
					}
				}

				if (var2.offset == 8) { // L: 1885
					var2.offset = 0; // L: 1886
					class236.field3108 = var2.readLong(); // L: 1887
					loginState = 5; // L: 1888
				}
			}

			int var7;
			int var9;
			int var15;
			if (loginState == 5) { // L: 1891
				packetWriter.packetBuffer.offset = 0; // L: 1892
				packetWriter.clearBuffer(); // L: 1893
				PacketBuffer var3 = new PacketBuffer(500); // L: 1894
				int[] var27 = new int[]{WorldMapManager.secureRandom.nextInt(), WorldMapManager.secureRandom.nextInt(), WorldMapManager.secureRandom.nextInt(), WorldMapManager.secureRandom.nextInt()}; // L: 1895 1896 1897 1898 1899
				var3.offset = 0; // L: 1900
				var3.writeByte(1); // L: 1901
				var3.writeInt(var27[0]); // L: 1902
				var3.writeInt(var27[1]); // L: 1903
				var3.writeInt(var27[2]); // L: 1904
				var3.writeInt(var27[3]); // L: 1905
				var3.writeLong(class236.field3108); // L: 1906
				int var11;
				if (gameState == 40) { // L: 1907
					var3.writeInt(class1.field5[0]); // L: 1908
					var3.writeInt(class1.field5[1]); // L: 1909
					var3.writeInt(class1.field5[2]); // L: 1910
					var3.writeInt(class1.field5[3]); // L: 1911
				} else {
					var3.writeByte(field661.rsOrdinal()); // L: 1914
					switch(field661.field2014) { // L: 1915
					case 0:
					case 2:
						var3.writeMedium(Canvas.field439); // L: 1939
						++var3.offset; // L: 1940
						break;
					case 1:
						var3.offset += 4; // L: 1918
						break; // L: 1919
					case 3:
						LinkedHashMap var6 = WorldMapSectionType.clientPreferences.parameters; // L: 1924
						String var8 = Login.Login_username; // L: 1926
						var9 = var8.length(); // L: 1928
						int var10 = 0; // L: 1929

						for (var11 = 0; var11 < var9; ++var11) { // L: 1930
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var3.writeInt((Integer)var6.get(var10)); // L: 1933
					}

					var3.writeByte(class323.field3852.rsOrdinal()); // L: 1944
					var3.writeStringCp1252NullTerminated(Login.Login_password); // L: 1945
				}

				var3.encryptRsa(class92.field1184, class92.field1177); // L: 1947
				class1.field5 = var27; // L: 1948
				PacketBufferNode var30;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 1953
					var30 = new PacketBufferNode(); // L: 1954
				} else {
					var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 1957
				}

				var30.clientPacket = null; // L: 1960
				var30.clientPacketLength = 0; // L: 1961
				var30.packetBuffer = new PacketBuffer(5000); // L: 1962
				var30.packetBuffer.offset = 0; // L: 1966
				if (gameState == 40) { // L: 1967
					var30.packetBuffer.writeByte(LoginPacket.field2338.id); // L: 1968
				} else {
					var30.packetBuffer.writeByte(LoginPacket.field2336.id); // L: 1971
				}

				var30.packetBuffer.writeShort(0); // L: 1973
				var7 = var30.packetBuffer.offset; // L: 1974
				var30.packetBuffer.writeInt(194); // L: 1975
				var30.packetBuffer.writeInt(1); // L: 1976
				var30.packetBuffer.writeByte(clientType); // L: 1977
				var30.packetBuffer.writeByte(field667); // L: 1978
				var30.packetBuffer.writeBytes(var3.array, 0, var3.offset); // L: 1979
				var15 = var30.packetBuffer.offset; // L: 1980
				var30.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 1981
				var30.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 1982
				var30.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth); // L: 1983
				var30.packetBuffer.writeShort(class25.canvasHeight); // L: 1984
				GrandExchangeOfferOwnWorldComparator.method1378(var30.packetBuffer); // L: 1985
				var30.packetBuffer.writeStringCp1252NullTerminated(AccessFile.field4100); // L: 1986
				var30.packetBuffer.writeInt(ItemLayer.field1562); // L: 1987
				Buffer var16 = new Buffer(GrandExchangeOfferUnitPriceComparator.platformInfo.size()); // L: 1988
				GrandExchangeOfferUnitPriceComparator.platformInfo.write(var16); // L: 1989
				var30.packetBuffer.writeBytes(var16.array, 0, var16.array.length); // L: 1990
				var30.packetBuffer.writeByte(clientType); // L: 1991
				var30.packetBuffer.writeInt(0); // L: 1992
				var30.packetBuffer.method5876(class8.archive5.hash); // L: 1993
				var30.packetBuffer.method5781(UrlRequester.archive6.hash); // L: 1994
				var30.packetBuffer.method5781(WorldMapData_0.archive7.hash); // L: 1995
				var30.packetBuffer.method5736(WorldMapManager.archive11.hash); // L: 1996
				var30.packetBuffer.method5736(ModeWhere.archive8.hash); // L: 1997
				var30.packetBuffer.method5736(WorldMapSection0.archive12.hash); // L: 1998
				var30.packetBuffer.method5736(PlayerComposition.archive3.hash); // L: 1999
				var30.packetBuffer.method5781(CollisionMap.archive13.hash); // L: 2000
				var30.packetBuffer.writeInt(Login.archive20.hash); // L: 2001
				var30.packetBuffer.writeInt(class25.archive18.hash); // L: 2002
				var30.packetBuffer.writeInt(ViewportMouse.archive9.hash); // L: 2003
				var30.packetBuffer.writeInt(Tiles.archive14.hash); // L: 2004
				var30.packetBuffer.writeInt(LoginScreenAnimation.archive10.hash); // L: 2005
				var30.packetBuffer.method5781(ArchiveLoader.archive19.hash); // L: 2006
				var30.packetBuffer.method5876(WorldMapIcon_0.archive2.hash); // L: 2007
				var30.packetBuffer.writeInt(ItemComposition.archive17.hash); // L: 2008
				var30.packetBuffer.method5781(class52.archive0.hash); // L: 2009
				var30.packetBuffer.method5781(0); // L: 2010
				var30.packetBuffer.writeInt(WorldMapCacheName.archive4.hash); // L: 2011
				var30.packetBuffer.method5876(SpriteMask.archive15.hash); // L: 2012
				var30.packetBuffer.method5876(SpriteMask.archive1.hash); // L: 2013
				var30.packetBuffer.xteaEncrypt(var27, var15, var30.packetBuffer.offset); // L: 2014
				var30.packetBuffer.writeLengthShort(var30.packetBuffer.offset - var7); // L: 2015
				packetWriter.addNode(var30); // L: 2016
				packetWriter.flush(); // L: 2017
				packetWriter.isaacCipher = new IsaacCipher(var27); // L: 2018
				int[] var17 = new int[4]; // L: 2019

				for (var11 = 0; var11 < 4; ++var11) { // L: 2020
					var17[var11] = var27[var11] + 50;
				}

				var2.newIsaacCipher(var17); // L: 2021
				loginState = 6; // L: 2022
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2024 2025
				var35 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2026
				if (var35 == 21 && gameState == 20) { // L: 2027
					loginState = 12; // L: 2028
				} else if (var35 == 2) { // L: 2030
					loginState = 14; // L: 2031
				} else if (var35 == 15 && gameState == 40) { // L: 2033
					packetWriter.serverPacketLength = -1; // L: 2034
					loginState = 19; // L: 2035
				} else if (var35 == 64) { // L: 2037
					loginState = 10; // L: 2038
				} else if (var35 == 23 && field786 < 1) { // L: 2040
					++field786; // L: 2041
					loginState = 0; // L: 2042
				} else if (var35 == 29) { // L: 2044
					loginState = 17; // L: 2045
				} else {
					if (var35 != 69) { // L: 2047
						class52.getLoginError(var35); // L: 2051
						return; // L: 2052
					}

					loginState = 7; // L: 2048
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2056 2057
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2058
				var2.offset = 0; // L: 2059
				Decimator.field1480 = var2.readUnsignedShort(); // L: 2060
				loginState = 8; // L: 2061
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= Decimator.field1480) { // L: 2064 2065
				var2.offset = 0; // L: 2066
				((AbstractSocket)var1).read(var2.array, var2.offset, Decimator.field1480); // L: 2067
				class7 var23 = WorldMapIcon_1.method376()[var2.readUnsignedByte()]; // L: 2068

				try {
					switch(var23.field36) { // L: 2072
					case 0:
						class5 var28 = new class5(); // L: 2075
						this.field782 = new class9(var2, var28); // L: 2085
						loginState = 9; // L: 2086
						break;
					default:
						throw new IllegalArgumentException(); // L: 2080
					}
				} catch (Exception var21) { // L: 2088
					class52.getLoginError(22); // L: 2089
					return; // L: 2090
				}
			}

			if (loginState == 9 && this.field782.method108()) { // L: 2094 2095
				this.field702 = this.field782.method94(); // L: 2096
				this.field782.method93(); // L: 2097
				this.field782 = null; // L: 2098
				if (this.field702 == null) { // L: 2099
					class52.getLoginError(22); // L: 2100
					return; // L: 2101
				}

				packetWriter.clearBuffer(); // L: 2103
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2108
					var4 = new PacketBufferNode(); // L: 2109
				} else {
					var4 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2112
				}

				var4.clientPacket = null; // L: 2115
				var4.clientPacketLength = 0; // L: 2116
				var4.packetBuffer = new PacketBuffer(5000); // L: 2117
				var4.packetBuffer.writeByte(LoginPacket.field2337.id); // L: 2121
				var4.packetBuffer.writeShort(this.field702.offset); // L: 2122
				var4.packetBuffer.method5683(this.field702); // L: 2123
				packetWriter.addNode(var4); // L: 2124
				packetWriter.flush(); // L: 2125
				this.field702 = null; // L: 2126
				loginState = 6; // L: 2127
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2130 2131
				MilliClock.field2032 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2132
				loginState = 11; // L: 2133
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= MilliClock.field2032) { // L: 2136 2137
				((AbstractSocket)var1).read(var2.array, 0, MilliClock.field2032); // L: 2138
				var2.offset = 0; // L: 2139
				loginState = 6; // L: 2140
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2143 2144
				field701 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2145
				loginState = 13; // L: 2146
			}

			if (loginState == 13) { // L: 2149
				field696 = 0; // L: 2150
				InvDefinition.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field701 / 60 + " seconds."); // L: 2151
				if (--field701 <= 0) { // L: 2152
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2155 2156
					UserComparator7.field1999 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2157
					loginState = 15; // L: 2158
				}

				boolean var36;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= UserComparator7.field1999) { // L: 2161 2162
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2163
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2164
					var2.offset = 0; // L: 2165
					var36 = false; // L: 2166
					if (var12) { // L: 2167
						var13 = var2.readByteIsaac() << 24; // L: 2168
						var13 |= var2.readByteIsaac() << 16; // L: 2169
						var13 |= var2.readByteIsaac() << 8; // L: 2170
						var13 |= var2.readByteIsaac(); // L: 2171
						String var33 = Login.Login_username; // L: 2173
						var7 = var33.length(); // L: 2175
						var15 = 0; // L: 2176
						var9 = 0; // L: 2177

						while (true) {
							if (var9 >= var7) {
								if (WorldMapSectionType.clientPreferences.parameters.size() >= 10 && !WorldMapSectionType.clientPreferences.parameters.containsKey(var15)) { // L: 2181 2182
									Iterator var34 = WorldMapSectionType.clientPreferences.parameters.entrySet().iterator(); // L: 2183
									var34.next(); // L: 2184
									var34.remove(); // L: 2185
								}

								WorldMapSectionType.clientPreferences.parameters.put(var15, var13); // L: 2188
								break;
							}

							var15 = (var15 << 5) - var15 + var33.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2190
						WorldMapSectionType.clientPreferences.rememberedUsername = Login.Login_username; // L: 2191
					} else {
						WorldMapSectionType.clientPreferences.rememberedUsername = null; // L: 2194
					}

					class23.savePreferences(); // L: 2196
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2197
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2198
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2199
					localPlayerIndex <<= 8; // L: 2200
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2201
					field673 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2202
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2203
					var2.offset = 0; // L: 2204
					ServerPacket[] var5 = WorldMapRegion.ServerPacket_values(); // L: 2205
					int var19 = var2.readSmartByteShortIsaac(); // L: 2206
					if (var19 < 0 || var19 >= var5.length) { // L: 2207
						throw new IOException(var19 + " " + var2.offset);
					}

					packetWriter.serverPacket = var5[var19]; // L: 2208
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2209
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2210
					var2.offset = 0; // L: 2211
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2212

					try {
						Client var14 = class1.client; // L: 2214
						JSObject.getWindow(var14).call("zap", (Object[])null); // L: 2217
					} catch (Throwable var20) { // L: 2220
					}

					loginState = 16; // L: 2221
				}

				if (loginState != 16) { // L: 2224
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2355 2356
						var2.offset = 0; // L: 2357
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2358
						var2.offset = 0; // L: 2359
						Interpreter.field1116 = var2.readUnsignedShort(); // L: 2360
						loginState = 18; // L: 2361
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= Interpreter.field1116) { // L: 2364 2365
						var2.offset = 0; // L: 2366
						((AbstractSocket)var1).read(var2.array, 0, Interpreter.field1116); // L: 2367
						var2.offset = 0; // L: 2368
						String var26 = var2.readStringCp1252NullTerminated(); // L: 2369
						String var32 = var2.readStringCp1252NullTerminated(); // L: 2370
						String var29 = var2.readStringCp1252NullTerminated(); // L: 2371
						InvDefinition.setLoginResponseString(var26, var32, var29); // L: 2372
						ItemContainer.updateGameState(10); // L: 2373
					}

					if (loginState == 19) { // L: 2376
						if (packetWriter.serverPacketLength == -1) { // L: 2377
							if (((AbstractSocket)var1).available() < 2) { // L: 2378
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2379
							var2.offset = 0; // L: 2380
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2381
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2383
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2384
							var2.offset = 0; // L: 2385
							var35 = packetWriter.serverPacketLength; // L: 2386
							timer.method5200(); // L: 2387
							class232.method4323(); // L: 2388
							class234.updatePlayer(var2); // L: 2389
							if (var35 != var2.offset) { // L: 2390
								throw new RuntimeException(); // L: 2391
							}
						}
					} else {
						++field696; // L: 2395
						if (field696 > 2000) { // L: 2396
							if (field786 < 1) { // L: 2397
								if (MouseRecorder.worldPort == DynamicObject.currentPort) { // L: 2398
									DynamicObject.currentPort = FrameProvider.js5Port;
								} else {
									DynamicObject.currentPort = MouseRecorder.worldPort; // L: 2399
								}

								++field786; // L: 2400
								loginState = 0; // L: 2401
							} else {
								class52.getLoginError(-3); // L: 2404
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2225
						var2.offset = 0; // L: 2226
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2227
						timer.method5198(); // L: 2228
						mouseLastLastPressedTimeMillis = -1L; // L: 2231
						Friend.mouseRecorder.index = 0; // L: 2232
						PcmPlayer.hasFocus = true; // L: 2233
						hadFocus = true; // L: 2234
						field888 = -1L; // L: 2235
						ScriptEvent.method1271(); // L: 2236
						packetWriter.clearBuffer(); // L: 2237
						packetWriter.packetBuffer.offset = 0; // L: 2238
						packetWriter.serverPacket = null; // L: 2239
						packetWriter.field1331 = null; // L: 2240
						packetWriter.field1333 = null; // L: 2241
						packetWriter.field1334 = null; // L: 2242
						packetWriter.serverPacketLength = 0; // L: 2243
						packetWriter.field1330 = 0; // L: 2244
						rebootTimer = 0; // L: 2245
						logoutTimer = 0; // L: 2246
						hintArrowType = 0; // L: 2247
						menuOptionsCount = 0; // L: 2249
						isMenuOpen = false; // L: 2250
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2253
						Messages.Messages_channels.clear(); // L: 2256
						Messages.Messages_hashTable.clear(); // L: 2257
						Messages.Messages_queue.clear(); // L: 2258
						Messages.Messages_count = 0; // L: 2259
						isItemSelected = 0; // L: 2261
						isSpellSelected = false; // L: 2262
						soundEffectCount = 0; // L: 2263
						camAngleY = 0; // L: 2264
						oculusOrbState = 0; // L: 2265
						HealthBarUpdate.field1016 = null; // L: 2266
						minimapState = 0; // L: 2267
						field889 = -1; // L: 2268
						destinationX = 0; // L: 2269
						destinationY = 0; // L: 2270
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2271
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2272
						npcCount = 0; // L: 2273
						class90.method2191(); // L: 2274

						for (var35 = 0; var35 < 2048; ++var35) { // L: 2275
							players[var35] = null;
						}

						for (var35 = 0; var35 < 32768; ++var35) { // L: 2276
							npcs[var35] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2277
						projectiles.clear(); // L: 2278
						graphicsObjects.clear(); // L: 2279

						int var18;
						for (var35 = 0; var35 < 4; ++var35) { // L: 2280
							for (var13 = 0; var13 < 104; ++var13) { // L: 2281
								for (var18 = 0; var18 < 104; ++var18) { // L: 2282
									groundItems[var35][var13][var18] = null; // L: 2283
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2287
						InterfaceParent.friendSystem.clear(); // L: 2288

						for (var35 = 0; var35 < class58.VarpDefinition_fileCount; ++var35) { // L: 2289
							VarpDefinition var31 = class204.VarpDefinition_get(var35); // L: 2290
							if (var31 != null) { // L: 2291
								Varps.Varps_temp[var35] = 0; // L: 2292
								Varps.Varps_main[var35] = 0; // L: 2293
							}
						}

						GrandExchangeOffer.varcs.clearTransient(); // L: 2296
						followerIndex = -1; // L: 2297
						if (rootInterface != -1) { // L: 2298
							var35 = rootInterface; // L: 2299
							if (var35 != -1 && Widget.Widget_loadedInterfaces[var35]) { // L: 2301 2302
								FontName.Widget_archive.clearFilesGroup(var35); // L: 2303
								if (DefaultsGroup.Widget_interfaceComponents[var35] != null) { // L: 2304
									var36 = true; // L: 2305

									for (var18 = 0; var18 < DefaultsGroup.Widget_interfaceComponents[var35].length; ++var18) { // L: 2306
										if (DefaultsGroup.Widget_interfaceComponents[var35][var18] != null) { // L: 2307
											if (DefaultsGroup.Widget_interfaceComponents[var35][var18].type != 2) { // L: 2308
												DefaultsGroup.Widget_interfaceComponents[var35][var18] = null;
											} else {
												var36 = false; // L: 2309
											}
										}
									}

									if (var36) { // L: 2312
										DefaultsGroup.Widget_interfaceComponents[var35] = null;
									}

									Widget.Widget_loadedInterfaces[var35] = false; // L: 2313
								}
							}
						}

						for (InterfaceParent var24 = (InterfaceParent)interfaceParents.first(); var24 != null; var24 = (InterfaceParent)interfaceParents.next()) { // L: 2316
							GrandExchangeOffer.closeInterface(var24, true); // L: 2317
						}

						rootInterface = -1; // L: 2319
						interfaceParents = new NodeHashTable(8); // L: 2320
						meslayerContinueWidget = null; // L: 2321
						menuOptionsCount = 0; // L: 2323
						isMenuOpen = false; // L: 2324
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2326

						for (var35 = 0; var35 < 8; ++var35) { // L: 2327
							playerMenuActions[var35] = null; // L: 2328
							playerOptionsPriorities[var35] = false; // L: 2329
						}

						ItemContainer.itemContainers = new NodeHashTable(32); // L: 2332
						isLoading = true; // L: 2334

						for (var35 = 0; var35 < 100; ++var35) { // L: 2335
							field816[var35] = true;
						}

						PacketBufferNode var25 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2290, packetWriter.isaacCipher); // L: 2338
						var25.packetBuffer.writeByte(BoundaryObject.getWindowedMode()); // L: 2339
						var25.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth); // L: 2340
						var25.packetBuffer.writeShort(class25.canvasHeight); // L: 2341
						packetWriter.addNode(var25); // L: 2342
						WorldMapID.clanChat = null; // L: 2344

						for (var35 = 0; var35 < 8; ++var35) { // L: 2345
							grandExchangeOffers[var35] = new GrandExchangeOffer();
						}

						WorldMapSectionType.grandExchangeEvents = null; // L: 2346
						class234.updatePlayer(var2); // L: 2348
						class3.field24 = -1; // L: 2349
						class105.loadRegions(false, var2); // L: 2350
						packetWriter.serverPacket = null; // L: 2351
					}

				}
			}
		} catch (IOException var22) { // L: 2408
			if (field786 < 1) { // L: 2409
				if (MouseRecorder.worldPort == DynamicObject.currentPort) { // L: 2410
					DynamicObject.currentPort = FrameProvider.js5Port;
				} else {
					DynamicObject.currentPort = MouseRecorder.worldPort; // L: 2411
				}

				++field786; // L: 2412
				loginState = 0; // L: 2413
			} else {
				class52.getLoginError(-2); // L: 2416
			}
		}
	} // L: 2153 2353 2393 2402 2405 2414 2417 2419

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1783037227"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2668
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2669
			--logoutTimer;
		}

		if (field712) { // L: 2670
			field712 = false; // L: 2671
			class8.method90(); // L: 2672
		} else {
			if (!isMenuOpen) { // L: 2675
				Player.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1701(packetWriter); ++var1) { // L: 2676 2677
			}

			if (gameState == 30) { // L: 2679
				int var2;
				PacketBufferNode var14;
				while (GrandExchangeOfferOwnWorldComparator.method1366()) { // L: 2680
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2315, packetWriter.isaacCipher); // L: 2681
					var14.packetBuffer.writeByte(0); // L: 2682
					var2 = var14.packetBuffer.offset; // L: 2683
					AbstractWorldMapData.performReflectionCheck(var14.packetBuffer); // L: 2684
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 2685
					packetWriter.addNode(var14); // L: 2686
				}

				if (timer.field3616) { // L: 2688
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2301, packetWriter.isaacCipher); // L: 2690
					var14.packetBuffer.writeByte(0); // L: 2691
					var2 = var14.packetBuffer.offset; // L: 2692
					timer.write(var14.packetBuffer); // L: 2693
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 2694
					packetWriter.addNode(var14); // L: 2695
					timer.method5199(); // L: 2696
				}

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
				synchronized(Friend.mouseRecorder.lock) { // L: 2699
					if (!field863) { // L: 2700
						Friend.mouseRecorder.index = 0; // L: 2786
					} else if (MouseHandler.MouseHandler_lastButton != 0 || Friend.mouseRecorder.index >= 40) { // L: 2701
						PacketBufferNode var15 = null; // L: 2703
						var3 = 0; // L: 2704
						var4 = 0; // L: 2705
						var5 = 0; // L: 2706
						var6 = 0; // L: 2707

						for (var7 = 0; var7 < Friend.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 2708 2709
							var4 = var7; // L: 2710
							var8 = Friend.mouseRecorder.ys[var7]; // L: 2711
							if (var8 < -1) { // L: 2712
								var8 = -1;
							} else if (var8 > 65534) { // L: 2713
								var8 = 65534;
							}

							var9 = Friend.mouseRecorder.xs[var7]; // L: 2714
							if (var9 < -1) { // L: 2715
								var9 = -1;
							} else if (var9 > 65534) { // L: 2716
								var9 = 65534;
							}

							if (var9 != field675 || var8 != field687) { // L: 2717
								if (var15 == null) { // L: 2720
									var15 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2240, packetWriter.isaacCipher); // L: 2721
									var15.packetBuffer.writeByte(0); // L: 2722
									var3 = var15.packetBuffer.offset; // L: 2723
									PacketBuffer var10000 = var15.packetBuffer; // L: 2724
									var10000.offset += 2;
									var5 = 0; // L: 2725
									var6 = 0; // L: 2726
								}

								if (-1L != field853) { // L: 2731
									var10 = var9 - field675; // L: 2732
									var11 = var8 - field687; // L: 2733
									var12 = (int)((Friend.mouseRecorder.millis[var7] - field853) / 20L); // L: 2734
									var5 = (int)((long)var5 + (Friend.mouseRecorder.millis[var7] - field853) % 20L); // L: 2735
								} else {
									var10 = var9; // L: 2738
									var11 = var8; // L: 2739
									var12 = Integer.MAX_VALUE; // L: 2740
								}

								field675 = var9; // L: 2742
								field687 = var8; // L: 2743
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2744
									var10 += 32; // L: 2745
									var11 += 32; // L: 2746
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2747
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2749
									var10 += 128; // L: 2750
									var11 += 128; // L: 2751
									var15.packetBuffer.writeByte(var12 + 128); // L: 2752
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2753
								} else if (var12 < 32) { // L: 2755
									var15.packetBuffer.writeByte(var12 + 192); // L: 2756
									if (var9 != -1 && var8 != -1) { // L: 2757
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 2758
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 2761
									if (var9 != -1 && var8 != -1) { // L: 2762
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 2763
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 2765
								field853 = Friend.mouseRecorder.millis[var7]; // L: 2766
							}
						}

						if (var15 != null) { // L: 2768
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3); // L: 2769
							var7 = var15.packetBuffer.offset; // L: 2770
							var15.packetBuffer.offset = var3; // L: 2771
							var15.packetBuffer.writeByte(var5 / var6); // L: 2772
							var15.packetBuffer.writeByte(var5 % var6); // L: 2773
							var15.packetBuffer.offset = var7; // L: 2774
							packetWriter.addNode(var15); // L: 2775
						}

						if (var4 >= Friend.mouseRecorder.index) { // L: 2777
							Friend.mouseRecorder.index = 0;
						} else {
							MouseRecorder var42 = Friend.mouseRecorder; // L: 2779
							var42.index -= var4;
							System.arraycopy(Friend.mouseRecorder.xs, var4, Friend.mouseRecorder.xs, 0, Friend.mouseRecorder.index); // L: 2780
							System.arraycopy(Friend.mouseRecorder.ys, var4, Friend.mouseRecorder.ys, 0, Friend.mouseRecorder.index); // L: 2781
							System.arraycopy(Friend.mouseRecorder.millis, var4, Friend.mouseRecorder.millis, 0, Friend.mouseRecorder.index); // L: 2782
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 2788
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 2789
					if (var16 > 32767L) { // L: 2790
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 2791
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 2792
					if (var3 < 0) { // L: 2793
						var3 = 0;
					} else if (var3 > class25.canvasHeight) { // L: 2794
						var3 = class25.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 2795
					if (var4 < 0) { // L: 2796
						var4 = 0;
					} else if (var4 > GrandExchangeOfferTotalQuantityComparator.canvasWidth) { // L: 2797
						var4 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
					}

					var5 = (int)var16; // L: 2798
					var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2276, packetWriter.isaacCipher); // L: 2799
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 2800
					var18.packetBuffer.writeShort(var4); // L: 2801
					var18.packetBuffer.writeShort(var3); // L: 2802
					packetWriter.addNode(var18); // L: 2803
				}

				if (KeyHandler.field421 > 0) { // L: 2805
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher); // L: 2806
					var14.packetBuffer.writeShort(0); // L: 2807
					var2 = var14.packetBuffer.offset; // L: 2808
					long var19 = Tiles.currentTimeMillis(); // L: 2809

					for (var5 = 0; var5 < KeyHandler.field421; ++var5) { // L: 2810
						long var21 = var19 - field888; // L: 2811
						if (var21 > 16777215L) { // L: 2812
							var21 = 16777215L;
						}

						field888 = var19; // L: 2813
						var14.packetBuffer.method5732((int)var21); // L: 2814
						var14.packetBuffer.method5883(KeyHandler.field420[var5]); // L: 2815
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 2817
					packetWriter.addNode(var14); // L: 2818
				}

				if (field926 > 0) { // L: 2820
					--field926;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 2821
					field678 = true;
				}

				if (field678 && field926 <= 0) { // L: 2822
					field926 = 20; // L: 2823
					field678 = false; // L: 2824
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2334, packetWriter.isaacCipher); // L: 2826
					var14.packetBuffer.writeShortLE(camAngleY); // L: 2827
					var14.packetBuffer.writeIntME(camAngleX); // L: 2828
					packetWriter.addNode(var14); // L: 2829
				}

				if (PcmPlayer.hasFocus && !hadFocus) { // L: 2831
					hadFocus = true; // L: 2832
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2234, packetWriter.isaacCipher); // L: 2834
					var14.packetBuffer.writeByte(1); // L: 2835
					packetWriter.addNode(var14); // L: 2836
				}

				if (!PcmPlayer.hasFocus && hadFocus) { // L: 2838
					hadFocus = false; // L: 2839
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2234, packetWriter.isaacCipher); // L: 2841
					var14.packetBuffer.writeByte(0); // L: 2842
					packetWriter.addNode(var14); // L: 2843
				}

				if (SoundSystem.worldMap != null) { // L: 2846
					SoundSystem.worldMap.method6584();
				}

				if (KeyHandler.ClanChat_inClanChat) { // L: 2848
					if (WorldMapID.clanChat != null) { // L: 2849
						WorldMapID.clanChat.sort(); // L: 2850
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 2853
						Player var34 = players[Players.Players_indices[var1]]; // L: 2854
						var34.clearIsInClanChat(); // L: 2855
					}

					KeyHandler.ClanChat_inClanChat = false; // L: 2858
				}

				Renderable.method3417(); // L: 2861
				if (gameState == 30) { // L: 2862
					WorldMapSectionType.method319(); // L: 2863
					WorldMapLabel.method502(); // L: 2864
					++packetWriter.field1330; // L: 2865
					if (packetWriter.field1330 > 750) { // L: 2866
						class8.method90(); // L: 2867
					} else {
						WorldMapRectangle.method354(); // L: 2870

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 2872
							var2 = npcIndices[var1]; // L: 2873
							NPC var23 = npcs[var2]; // L: 2874
							if (var23 != null) { // L: 2875
								FrameProvider.updateActorSequence(var23, var23.definition.size); // L: 2876
							}
						}

						Actor.method1868(); // L: 2880
						++field808; // L: 2881
						if (mouseCrossColor != 0) { // L: 2882
							mouseCrossState += 20; // L: 2883
							if (mouseCrossState >= 400) { // L: 2884
								mouseCrossColor = 0;
							}
						}

						if (WorldMapSprite.field260 != null) { // L: 2886
							++field770; // L: 2887
							if (field770 >= 15) { // L: 2888
								IsaacCipher.invalidateWidget(WorldMapSprite.field260); // L: 2889
								WorldMapSprite.field260 = null; // L: 2890
							}
						}

						Widget var33 = Canvas.mousedOverWidgetIf1; // L: 2893
						Widget var35 = GrandExchangeOffer.field100; // L: 2894
						Canvas.mousedOverWidgetIf1 = null; // L: 2895
						GrandExchangeOffer.field100 = null; // L: 2896
						draggedOnWidget = null; // L: 2897
						field754 = false; // L: 2898
						field912 = false; // L: 2899
						field885 = 0; // L: 2900

						while (Varcs.isKeyDown() && field885 < 128) { // L: 2901
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && ModeWhere.field2417 == 66) { // L: 2902
								String var24 = ""; // L: 2905

								Message var36;
								for (Iterator var25 = Messages.Messages_hashTable.iterator(); var25.hasNext(); var24 = var24 + var36.sender + ':' + var36.text + '\n') { // L: 2906 2909
									var36 = (Message)var25.next(); // L: 2907
								}

								class1.client.clipboardSetString(var24); // L: 2915
							} else if (oculusOrbState != 1 || WorldMapID.field299 <= 0) { // L: 2918
								field738[field885] = ModeWhere.field2417; // L: 2921
								field886[field885] = WorldMapID.field299; // L: 2922
								++field885; // L: 2923
							}
						}

						if (TriBool.method5372() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 2925
							var3 = UserComparator9.localPlayer.plane - mouseWheelRotation; // L: 2926
							if (var3 < 0) { // L: 2927
								var3 = 0;
							} else if (var3 > 3) { // L: 2928
								var3 = 3;
							}

							if (var3 != UserComparator9.localPlayer.plane) { // L: 2929
								var4 = UserComparator9.localPlayer.pathX[0] + GrandExchangeOfferNameComparator.baseX; // L: 2930
								var5 = UserComparator9.localPlayer.pathY[0] + NetCache.baseY; // L: 2931
								var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2230, packetWriter.isaacCipher); // L: 2934
								var18.packetBuffer.writeShortLE(var5); // L: 2935
								var18.packetBuffer.method5883(var3); // L: 2936
								var18.packetBuffer.method5736(0); // L: 2937
								var18.packetBuffer.writeIntME(var4); // L: 2938
								packetWriter.addNode(var18); // L: 2939
							}

							mouseWheelRotation = 0; // L: 2942
						}

						if (rootInterface != -1) { // L: 2944
							class22.updateRootInterface(rootInterface, 0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 2945

						while (true) {
							ScriptEvent var37;
							Widget var39;
							Widget var40;
							do {
								var37 = (ScriptEvent)field660.removeLast(); // L: 2947
								if (var37 == null) { // L: 2948
									while (true) {
										do {
											var37 = (ScriptEvent)field865.removeLast(); // L: 2959
											if (var37 == null) { // L: 2960
												while (true) {
													do {
														var37 = (ScriptEvent)scriptEvents.removeLast(); // L: 2971
														if (var37 == null) { // L: 2972
															this.menu(); // L: 2982
															class2.method27(); // L: 2983
															if (clickedWidget != null) { // L: 2984
																this.method1403();
															}

															PacketBufferNode var41;
															if (JagexCache.dragInventoryWidget != null) { // L: 2985
																IsaacCipher.invalidateWidget(JagexCache.dragInventoryWidget); // L: 2986
																++itemDragDuration; // L: 2987
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 2988
																	if (field776) { // L: 2989
																		if (JagexCache.dragInventoryWidget == HorizontalAlignment.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 2990
																			Widget var38 = JagexCache.dragInventoryWidget; // L: 2991
																			byte var30 = 0; // L: 2992
																			if (field829 == 1 && var38.contentType == 206) { // L: 2993
																				var30 = 1;
																			}

																			if (var38.itemIds[dragItemSlotDestination] <= 0) { // L: 2994
																				var30 = 0;
																			}

																			if (ModeWhere.method3867(class60.getWidgetFlags(var38))) { // L: 2995
																				var5 = dragItemSlotSource; // L: 2996
																				var6 = dragItemSlotDestination; // L: 2997
																				var38.itemIds[var6] = var38.itemIds[var5]; // L: 2998
																				var38.itemQuantities[var6] = var38.itemQuantities[var5]; // L: 2999
																				var38.itemIds[var5] = -1; // L: 3000
																				var38.itemQuantities[var5] = 0; // L: 3001
																			} else if (var30 == 1) { // L: 3003
																				var5 = dragItemSlotSource; // L: 3004
																				var6 = dragItemSlotDestination; // L: 3005

																				while (var5 != var6) { // L: 3006
																					if (var5 > var6) { // L: 3007
																						var38.swapItems(var5 - 1, var5); // L: 3008
																						--var5; // L: 3009
																					} else if (var5 < var6) { // L: 3011
																						var38.swapItems(var5 + 1, var5); // L: 3012
																						++var5; // L: 3013
																					}
																				}
																			} else {
																				var38.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3018
																			}

																			var41 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2243, packetWriter.isaacCipher); // L: 3021
																			var41.packetBuffer.method5725(dragItemSlotSource); // L: 3022
																			var41.packetBuffer.method5876(JagexCache.dragInventoryWidget.id); // L: 3023
																			var41.packetBuffer.writeShortLE(dragItemSlotDestination); // L: 3024
																			var41.packetBuffer.writeByte(var30); // L: 3025
																			packetWriter.addNode(var41); // L: 3026
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3030
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3031
																	} else if (menuOptionsCount > 0) { // L: 3033
																		LoginPacket.method3812(draggedWidgetX, draggedWidgetY); // L: 3034
																	}

																	field770 = 10; // L: 3037
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3038
																	JagexCache.dragInventoryWidget = null; // L: 3039
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3042 3043
																	field776 = true; // L: 3044
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3049
																var3 = Scene.Scene_selectedX; // L: 3050
																var4 = Scene.Scene_selectedY; // L: 3051
																var41 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2263, packetWriter.isaacCipher); // L: 3053
																var41.packetBuffer.writeByte(5); // L: 3054
																var41.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3055
																var41.packetBuffer.writeIntME(var4 + NetCache.baseY); // L: 3056
																var41.packetBuffer.writeShort(var3 + GrandExchangeOfferNameComparator.baseX); // L: 3057
																packetWriter.addNode(var41); // L: 3058
																Scene.method3281(); // L: 3059
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3060
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3061
																mouseCrossColor = 1; // L: 3062
																mouseCrossState = 0; // L: 3063
																destinationX = var3; // L: 3064
																destinationY = var4; // L: 3065
															}

															if (var33 != Canvas.mousedOverWidgetIf1) { // L: 3067
																if (var33 != null) { // L: 3068
																	IsaacCipher.invalidateWidget(var33);
																}

																if (Canvas.mousedOverWidgetIf1 != null) { // L: 3069
																	IsaacCipher.invalidateWidget(Canvas.mousedOverWidgetIf1);
																}
															}

															if (var35 != GrandExchangeOffer.field100 && field925 == field815) { // L: 3071
																if (var35 != null) { // L: 3072
																	IsaacCipher.invalidateWidget(var35);
																}

																if (GrandExchangeOffer.field100 != null) { // L: 3073
																	IsaacCipher.invalidateWidget(GrandExchangeOffer.field100);
																}
															}

															if (GrandExchangeOffer.field100 != null) { // L: 3075
																if (field815 < field925) { // L: 3076
																	++field815; // L: 3077
																	if (field815 == field925) { // L: 3078
																		IsaacCipher.invalidateWidget(GrandExchangeOffer.field100);
																	}
																}
															} else if (field815 > 0) { // L: 3081
																--field815;
															}

															if (oculusOrbState == 0) { // L: 3083
																var3 = UserComparator9.localPlayer.x; // L: 3084
																var4 = UserComparator9.localPlayer.y; // L: 3085
																if (HealthBarUpdate.oculusOrbFocalPointX - var3 < -500 || HealthBarUpdate.oculusOrbFocalPointX - var3 > 500 || ApproximateRouteStrategy.oculusOrbFocalPointY - var4 < -500 || ApproximateRouteStrategy.oculusOrbFocalPointY - var4 > 500) { // L: 3086
																	HealthBarUpdate.oculusOrbFocalPointX = var3; // L: 3087
																	ApproximateRouteStrategy.oculusOrbFocalPointY = var4; // L: 3088
																}

																if (var3 != HealthBarUpdate.oculusOrbFocalPointX) { // L: 3090
																	HealthBarUpdate.oculusOrbFocalPointX += (var3 - HealthBarUpdate.oculusOrbFocalPointX) / 16;
																}

																if (var4 != ApproximateRouteStrategy.oculusOrbFocalPointY) { // L: 3091
																	ApproximateRouteStrategy.oculusOrbFocalPointY += (var4 - ApproximateRouteStrategy.oculusOrbFocalPointY) / 16;
																}

																var5 = HealthBarUpdate.oculusOrbFocalPointX >> 7; // L: 3092
																var6 = ApproximateRouteStrategy.oculusOrbFocalPointY >> 7; // L: 3093
																var7 = WorldMapRegion.getTileHeight(HealthBarUpdate.oculusOrbFocalPointX, ApproximateRouteStrategy.oculusOrbFocalPointY, class90.Client_plane); // L: 3094
																var8 = 0; // L: 3095
																if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) { // L: 3096
																	for (var9 = var5 - 4; var9 <= var5 + 4; ++var9) { // L: 3097
																		for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3098
																			var11 = class90.Client_plane; // L: 3099
																			if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) { // L: 3100
																				++var11;
																			}

																			var12 = var7 - Tiles.Tiles_heights[var11][var9][var10]; // L: 3101
																			if (var12 > var8) { // L: 3102
																				var8 = var12;
																			}
																		}
																	}
																}

																var9 = var8 * 192; // L: 3106
																if (var9 > 98048) { // L: 3107
																	var9 = 98048;
																}

																if (var9 < 32768) { // L: 3108
																	var9 = 32768;
																}

																if (var9 > field880) { // L: 3109
																	field880 += (var9 - field880) / 24;
																} else if (var9 < field880) { // L: 3110
																	field880 += (var9 - field880) / 80;
																}

																ModelData0.field1882 = WorldMapRegion.getTileHeight(UserComparator9.localPlayer.x, UserComparator9.localPlayer.y, class90.Client_plane) - camFollowHeight; // L: 3111
															} else if (oculusOrbState == 1) { // L: 3113
																class13.method122(); // L: 3114
																short var31 = -1; // L: 3115
																if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3116
																	var31 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3117
																	var31 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3118
																	if (var31 == 0) { // L: 3119
																		var31 = 1792;
																	} else if (var31 == 1024) { // L: 3120
																		var31 = 1280;
																	} else {
																		var31 = 1536; // L: 3121
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3123
																	if (var31 == 0) { // L: 3124
																		var31 = 256;
																	} else if (var31 == 1024) { // L: 3125
																		var31 = 768;
																	} else {
																		var31 = 512; // L: 3126
																	}
																}

																byte var32 = 0; // L: 3128
																if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3129
																	var32 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3130
																	var32 = 1;
																}

																var5 = 0; // L: 3131
																if (var31 >= 0 || var32 != 0) { // L: 3132
																	var5 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * -1685287515 * 537367085 : oculusOrbNormalSpeed * 27020565 * -1600677315; // L: 3133
																	var5 *= 16; // L: 3134
																	field742 = var31; // L: 3135
																	field743 = var32; // L: 3136
																}

																if (field818 < var5) { // L: 3138
																	field818 += var5 / 8; // L: 3139
																	if (field818 > var5) { // L: 3140
																		field818 = var5;
																	}
																} else if (field818 > var5) { // L: 3142
																	field818 = field818 * 9 / 10;
																}

																if (field818 > 0) { // L: 3143
																	var6 = field818 / 16; // L: 3144
																	if (field742 >= 0) { // L: 3145
																		var3 = field742 - class39.cameraYaw & 2047; // L: 3146
																		var7 = Rasterizer3D.Rasterizer3D_sine[var3]; // L: 3147
																		var8 = Rasterizer3D.Rasterizer3D_cosine[var3]; // L: 3148
																		HealthBarUpdate.oculusOrbFocalPointX += var7 * var6 / 65536; // L: 3149
																		ApproximateRouteStrategy.oculusOrbFocalPointY += var8 * var6 / 65536; // L: 3150
																	}

																	if (field743 != 0) { // L: 3152
																		ModelData0.field1882 += var6 * field743; // L: 3153
																		if (ModelData0.field1882 > 0) { // L: 3154
																			ModelData0.field1882 = 0;
																		}
																	}
																} else {
																	field742 = -1; // L: 3158
																	field743 = -1; // L: 3159
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3161
																	packetWriter.addNode(WorldMapSprite.getPacketBufferNode(ClientPacket.field2296, packetWriter.isaacCipher)); // L: 3163
																	oculusOrbState = 0; // L: 3164
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && class8.mouseCam) { // L: 3168
																var3 = MouseHandler.MouseHandler_y - mouseCamClickedY; // L: 3169
																camAngleDX = var3 * 2; // L: 3170
																mouseCamClickedY = var3 != -1 && var3 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * 1096028309 * 586562237; // L: 3171
																var4 = mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3172
																camAngleDY = var4 * 2; // L: 3173
																mouseCamClickedX = var4 != -1 && var4 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * -1256373849 * -414755305; // L: 3174
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3177
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3178
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2; // L: 3179
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3180
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3181
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2; // L: 3182
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3183
																mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3184
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047; // L: 3186
															camAngleX += camAngleDX / 2; // L: 3187
															if (camAngleX < 128) { // L: 3188
																camAngleX = 128;
															}

															if (camAngleX > 383) { // L: 3189
																camAngleX = 383;
															}

															if (isCameraLocked) { // L: 3191
																var3 = WorldMapManager.field345 * 128 + 64; // L: 3192
																var4 = Decimator.field1475 * 128 + 64; // L: 3193
																var5 = WorldMapRegion.getTileHeight(var3, var4, class90.Client_plane) - Clock.field2079; // L: 3194
																if (SecureRandomFuture.cameraX < var3) { // L: 3195
																	SecureRandomFuture.cameraX = (var3 - SecureRandomFuture.cameraX) * class228.field2740 / 1000 + SecureRandomFuture.cameraX + JagexCache.field2056; // L: 3196
																	if (SecureRandomFuture.cameraX > var3) { // L: 3197
																		SecureRandomFuture.cameraX = var3;
																	}
																}

																if (SecureRandomFuture.cameraX > var3) { // L: 3199
																	SecureRandomFuture.cameraX -= class228.field2740 * (SecureRandomFuture.cameraX - var3) / 1000 + JagexCache.field2056; // L: 3200
																	if (SecureRandomFuture.cameraX < var3) { // L: 3201
																		SecureRandomFuture.cameraX = var3;
																	}
																}

																if (ArchiveLoader.cameraY < var5) { // L: 3203
																	ArchiveLoader.cameraY = (var5 - ArchiveLoader.cameraY) * class228.field2740 / 1000 + ArchiveLoader.cameraY + JagexCache.field2056; // L: 3204
																	if (ArchiveLoader.cameraY > var5) { // L: 3205
																		ArchiveLoader.cameraY = var5;
																	}
																}

																if (ArchiveLoader.cameraY > var5) { // L: 3207
																	ArchiveLoader.cameraY -= class228.field2740 * (ArchiveLoader.cameraY - var5) / 1000 + JagexCache.field2056; // L: 3208
																	if (ArchiveLoader.cameraY < var5) { // L: 3209
																		ArchiveLoader.cameraY = var5;
																	}
																}

																if (ObjectSound.cameraZ < var4) { // L: 3211
																	ObjectSound.cameraZ = (var4 - ObjectSound.cameraZ) * class228.field2740 / 1000 + ObjectSound.cameraZ + JagexCache.field2056; // L: 3212
																	if (ObjectSound.cameraZ > var4) { // L: 3213
																		ObjectSound.cameraZ = var4;
																	}
																}

																if (ObjectSound.cameraZ > var4) { // L: 3215
																	ObjectSound.cameraZ -= class228.field2740 * (ObjectSound.cameraZ - var4) / 1000 + JagexCache.field2056; // L: 3216
																	if (ObjectSound.cameraZ < var4) { // L: 3217
																		ObjectSound.cameraZ = var4;
																	}
																}

																var3 = class25.field138 * 128 + 64; // L: 3219
																var4 = GrandExchangeOfferUnitPriceComparator.field102 * 128 + 64; // L: 3220
																var5 = WorldMapRegion.getTileHeight(var3, var4, class90.Client_plane) - Skeleton.field1809; // L: 3221
																var6 = var3 - SecureRandomFuture.cameraX; // L: 3222
																var7 = var5 - ArchiveLoader.cameraY; // L: 3223
																var8 = var4 - ObjectSound.cameraZ; // L: 3224
																var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8)); // L: 3225
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047; // L: 3226
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047; // L: 3227
																if (var10 < 128) { // L: 3228
																	var10 = 128;
																}

																if (var10 > 383) { // L: 3229
																	var10 = 383;
																}

																if (KeyHandler.cameraPitch < var10) { // L: 3230
																	KeyHandler.cameraPitch = (var10 - KeyHandler.cameraPitch) * JagexCache.field2070 / 1000 + KeyHandler.cameraPitch + WorldMapEvent.field380; // L: 3231
																	if (KeyHandler.cameraPitch > var10) { // L: 3232
																		KeyHandler.cameraPitch = var10;
																	}
																}

																if (KeyHandler.cameraPitch > var10) { // L: 3234
																	KeyHandler.cameraPitch -= JagexCache.field2070 * (KeyHandler.cameraPitch - var10) / 1000 + WorldMapEvent.field380; // L: 3235
																	if (KeyHandler.cameraPitch < var10) { // L: 3236
																		KeyHandler.cameraPitch = var10;
																	}
																}

																var12 = var11 - class39.cameraYaw; // L: 3238
																if (var12 > 1024) { // L: 3239
																	var12 -= 2048;
																}

																if (var12 < -1024) { // L: 3240
																	var12 += 2048;
																}

																if (var12 > 0) { // L: 3241
																	class39.cameraYaw = class39.cameraYaw + WorldMapEvent.field380 + var12 * JagexCache.field2070 / 1000; // L: 3242
																	class39.cameraYaw &= 2047; // L: 3243
																}

																if (var12 < 0) { // L: 3245
																	class39.cameraYaw -= -var12 * JagexCache.field2070 / 1000 + WorldMapEvent.field380; // L: 3246
																	class39.cameraYaw &= 2047; // L: 3247
																}

																int var26 = var11 - class39.cameraYaw; // L: 3249
																if (var26 > 1024) { // L: 3250
																	var26 -= 2048;
																}

																if (var26 < -1024) { // L: 3251
																	var26 += 2048;
																}

																if (var26 < 0 && var12 > 0 || var26 > 0 && var12 < 0) { // L: 3252
																	class39.cameraYaw = var11;
																}
															}

															for (var3 = 0; var3 < 5; ++var3) { // L: 3254
																int var10002 = field911[var3]++;
															}

															GrandExchangeOffer.varcs.tryWrite(); // L: 3255
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3258
															var5 = KeyHandler.KeyHandler_idleCycles; // L: 3263
															PacketBufferNode var27;
															if (var3 > 15000 && var5 > 15000) { // L: 3266
																logoutTimer = 250; // L: 3267
																MouseHandler.MouseHandler_idleCycles = 14500; // L: 3269
																var27 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2298, packetWriter.isaacCipher); // L: 3272
																packetWriter.addNode(var27); // L: 3273
															}

															InterfaceParent.friendSystem.processFriendUpdates(); // L: 3275
															++packetWriter.pendingWrites; // L: 3276
															if (packetWriter.pendingWrites > 50) { // L: 3277
																var27 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2305, packetWriter.isaacCipher); // L: 3279
																packetWriter.addNode(var27); // L: 3280
															}

															try {
																packetWriter.flush(); // L: 3283
															} catch (IOException var28) { // L: 3285
																class8.method90(); // L: 3286
															}

															return; // L: 3288
														}

														var39 = var37.widget; // L: 2973
														if (var39.childIndex < 0) { // L: 2974
															break;
														}

														var40 = class237.getWidget(var39.parentId); // L: 2975
													} while(var40 == null || var40.children == null || var39.childIndex >= var40.children.length || var39 != var40.children[var39.childIndex]); // L: 2976

													PacketWriter.runScriptEvent(var37); // L: 2980
												}
											}

											var39 = var37.widget; // L: 2961
											if (var39.childIndex < 0) { // L: 2962
												break;
											}

											var40 = class237.getWidget(var39.parentId); // L: 2963
										} while(var40 == null || var40.children == null || var39.childIndex >= var40.children.length || var39 != var40.children[var39.childIndex]); // L: 2964

										PacketWriter.runScriptEvent(var37); // L: 2968
									}
								}

								var39 = var37.widget; // L: 2949
								if (var39.childIndex < 0) { // L: 2950
									break;
								}

								var40 = class237.getWidget(var39.parentId); // L: 2951
							} while(var40 == null || var40.children == null || var39.childIndex >= var40.children.length || var39 != var40.children[var39.childIndex]); // L: 2952

							PacketWriter.runScriptEvent(var37); // L: 2956
						}
					}
				}
			}
		}
	} // L: 2673 2868

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "647800205"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 3837
		int var2 = class25.canvasHeight; // L: 3838
		if (super.contentWidth < var1) { // L: 3839
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 3840
		}

		if (WorldMapSectionType.clientPreferences != null) { // L: 3841
			try {
				class56.method923(class1.client, "resize", new Object[]{BoundaryObject.getWindowedMode()}); // L: 3843
			} catch (Throwable var4) { // L: 3845
			}
		}

	} // L: 3847

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1573382643"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 3850
			var1 = rootInterface; // L: 3851
			if (WorldMapCacheName.loadInterface(var1)) { // L: 3853
				ApproximateRouteStrategy.drawModelComponents(DefaultsGroup.Widget_interfaceComponents[var1], -1); // L: 3854
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 3857
			if (field816[var1]) { // L: 3858
				field827[var1] = true;
			}

			field871[var1] = field816[var1]; // L: 3859
			field816[var1] = false; // L: 3860
		}

		field868 = cycle; // L: 3862
		viewportX = -1; // L: 3863
		viewportY = -1; // L: 3864
		HorizontalAlignment.hoveredItemContainer = null; // L: 3865
		if (rootInterface != -1) { // L: 3866
			rootWidgetCount = 0; // L: 3867
			ViewportMouse.drawWidgets(rootInterface, 0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight, 0, 0, -1); // L: 3868
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 3870
		if (showMouseCross) { // L: 3871
			if (mouseCrossColor == 1) { // L: 3872
				Frames.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3873
			}

			if (mouseCrossColor == 2) { // L: 3875
				Frames.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3876
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) { // L: 3879
			if (viewportX != -1) { // L: 3880
				var1 = viewportX; // L: 3881
				var2 = viewportY; // L: 3882
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 3884 3885
					var3 = menuOptionsCount - 1; // L: 3888
					String var13;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 3892
						var13 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 3893
						var13 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var13 = WorldMapLabel.method504(var3); // L: 3894
					}

					if (menuOptionsCount > 2) { // L: 3895
						var13 = var13 + FileSystem.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					ScriptEvent.fontBold12.drawRandomAlphaAndSpacing(var13, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 3896
				}
			}
		} else {
			var1 = ApproximateRouteStrategy.menuX; // L: 3901
			var2 = AbstractUserComparator.menuY; // L: 3902
			var3 = CollisionMap.menuWidth; // L: 3903
			int var4 = GrandExchangeOfferTotalQuantityComparator.menuHeight; // L: 3904
			int var5 = 6116423; // L: 3905
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 3906
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 3907
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 3908
			ScriptEvent.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 3909
			int var6 = MouseHandler.MouseHandler_x; // L: 3910
			int var7 = MouseHandler.MouseHandler_y; // L: 3911

			int var8;
			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 3912
				var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 3913
				var10 = 16777215; // L: 3914
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 3915
					var10 = 16776960;
				}

				ScriptEvent.fontBold12.draw(WorldMapLabel.method504(var8), var1 + 3, var9, var10, 0); // L: 3916
			}

			var8 = ApproximateRouteStrategy.menuX; // L: 3918
			var9 = AbstractUserComparator.menuY; // L: 3919
			var10 = CollisionMap.menuWidth; // L: 3920
			int var11 = GrandExchangeOfferTotalQuantityComparator.menuHeight; // L: 3921

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 3923
				if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var11) { // L: 3924
					field827[var12] = true;
				}
			}
		}

		if (gameDrawingMode == 3) { // L: 3928
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 3929
				if (field871[var1]) { // L: 3930
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 3931
				} else if (field827[var1]) { // L: 3933
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 3934
				}
			}
		}

		WorldMapSection0.method308(class90.Client_plane, UserComparator9.localPlayer.x, UserComparator9.localPlayer.y, field808); // L: 3938
		field808 = 0; // L: 3939
	} // L: 3940

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)Z",
		garbageValue = "9"
	)
	final boolean method1701(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5949
		PacketBuffer var3 = var1.packetBuffer; // L: 5950
		if (var2 == null) { // L: 5951
			return false;
		} else {
			int var6;
			String var20;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5953
					if (var1.field1327) { // L: 5954
						if (!var2.isAvailable(1)) { // L: 5955
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5956
						var1.field1330 = 0; // L: 5957
						var1.field1327 = false; // L: 5958
					}

					var3.offset = 0; // L: 5960
					if (var3.method5634()) { // L: 5961
						if (!var2.isAvailable(1)) { // L: 5962
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5963
						var1.field1330 = 0; // L: 5964
					}

					var1.field1327 = true; // L: 5966
					ServerPacket[] var4 = WorldMapRegion.ServerPacket_values(); // L: 5967
					var5 = var3.readSmartByteShortIsaac(); // L: 5968
					if (var5 < 0 || var5 >= var4.length) { // L: 5969
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5970
					var1.serverPacketLength = var1.serverPacket.length; // L: 5971
				}

				if (var1.serverPacketLength == -1) { // L: 5973
					if (!var2.isAvailable(1)) { // L: 5974
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5975
					var1.serverPacketLength = var3.array[0] & 255; // L: 5976
				}

				if (var1.serverPacketLength == -2) { // L: 5978
					if (!var2.isAvailable(2)) { // L: 5979
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5980
					var3.offset = 0; // L: 5981
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5982
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5984
					return false;
				}

				var3.offset = 0; // L: 5985
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5986
				var1.field1330 = 0; // L: 5987
				timer.method5212(); // L: 5988
				var1.field1334 = var1.field1333; // L: 5989
				var1.field1333 = var1.field1331; // L: 5990
				var1.field1331 = var1.serverPacket; // L: 5991
				int var16;
				if (ServerPacket.field2164 == var1.serverPacket) { // L: 5992
					var16 = var3.readInt(); // L: 5993
					var5 = var3.method5727(); // L: 5994
					Varps.Varps_temp[var5] = var16; // L: 5995
					if (Varps.Varps_main[var5] != var16) { // L: 5996
						Varps.Varps_main[var5] = var16; // L: 5997
					}

					AbstractWorldMapIcon.changeGameOptions(var5); // L: 5999
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6000
					var1.serverPacket = null; // L: 6001
					return true; // L: 6002
				}

				if (ServerPacket.field2213 == var1.serverPacket) { // L: 6004
					PacketWriter.method2429(class194.field2350); // L: 6005
					var1.serverPacket = null; // L: 6006
					return true; // L: 6007
				}

				if (ServerPacket.field2214 == var1.serverPacket) { // L: 6009
					ClientPacket.method3811(var3.readStringCp1252NullTerminated()); // L: 6010
					var1.serverPacket = null; // L: 6011
					return true; // L: 6012
				}

				if (ServerPacket.field2183 == var1.serverPacket) { // L: 6014
					PacketWriter.method2429(class194.field2346); // L: 6015
					var1.serverPacket = null; // L: 6016
					return true; // L: 6017
				}

				if (ServerPacket.field2160 == var1.serverPacket) { // L: 6019
					InterfaceParent.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6020
					field857 = cycleCntr; // L: 6021
					var1.serverPacket = null; // L: 6022
					return true; // L: 6023
				}

				int var7;
				int var8;
				int var9;
				int var10;
				if (ServerPacket.field2205 == var1.serverPacket) { // L: 6025
					isCameraLocked = true; // L: 6026
					class25.field138 = var3.readUnsignedByte(); // L: 6027
					GrandExchangeOfferUnitPriceComparator.field102 = var3.readUnsignedByte(); // L: 6028
					Skeleton.field1809 = var3.readUnsignedShort(); // L: 6029
					WorldMapEvent.field380 = var3.readUnsignedByte(); // L: 6030
					JagexCache.field2070 = var3.readUnsignedByte(); // L: 6031
					if (JagexCache.field2070 >= 100) { // L: 6032
						var16 = class25.field138 * 128 + 64; // L: 6033
						var5 = GrandExchangeOfferUnitPriceComparator.field102 * 128 + 64; // L: 6034
						var6 = WorldMapRegion.getTileHeight(var16, var5, class90.Client_plane) - Skeleton.field1809; // L: 6035
						var7 = var16 - SecureRandomFuture.cameraX; // L: 6036
						var8 = var6 - ArchiveLoader.cameraY; // L: 6037
						var9 = var5 - ObjectSound.cameraZ; // L: 6038
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 6039
						KeyHandler.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047; // L: 6040
						class39.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047; // L: 6041
						if (KeyHandler.cameraPitch < 128) { // L: 6042
							KeyHandler.cameraPitch = 128;
						}

						if (KeyHandler.cameraPitch > 383) { // L: 6043
							KeyHandler.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6045
					return true; // L: 6046
				}

				if (ServerPacket.field2206 == var1.serverPacket) { // L: 6048
					var16 = var3.readUnsignedShort(); // L: 6049
					var5 = var3.readUnsignedByte(); // L: 6050
					var6 = var3.readUnsignedShort(); // L: 6051
					class58.queueSoundEffect(var16, var5, var6); // L: 6052
					var1.serverPacket = null; // L: 6053
					return true; // L: 6054
				}

				Widget var17;
				if (ServerPacket.field2170 == var1.serverPacket) { // L: 6056
					var16 = var3.method5729(); // L: 6057
					if (var16 == 65535) { // L: 6058
						var16 = -1;
					}

					var5 = var3.method5895(); // L: 6059
					var6 = var3.readInt(); // L: 6060
					var17 = class237.getWidget(var6); // L: 6061
					ItemComposition var48;
					if (!var17.isIf3) { // L: 6062
						if (var16 == -1) { // L: 6063
							var17.modelType = 0; // L: 6064
							var1.serverPacket = null; // L: 6065
							return true; // L: 6066
						}

						var48 = class281.ItemDefinition_get(var16); // L: 6068
						var17.modelType = 4; // L: 6069
						var17.modelId = var16; // L: 6070
						var17.modelAngleX = var48.xan2d; // L: 6071
						var17.modelAngleY = var48.yan2d; // L: 6072
						var17.modelZoom = var48.zoom2d * 100 / var5; // L: 6073
						IsaacCipher.invalidateWidget(var17); // L: 6074
					} else {
						var17.itemId = var16; // L: 6077
						var17.itemQuantity = var5; // L: 6078
						var48 = class281.ItemDefinition_get(var16); // L: 6079
						var17.modelAngleX = var48.xan2d; // L: 6080
						var17.modelAngleY = var48.yan2d; // L: 6081
						var17.modelAngleZ = var48.zan2d; // L: 6082
						var17.modelOffsetX = var48.offsetX2d; // L: 6083
						var17.modelOffsetY = var48.offsetY2d; // L: 6084
						var17.modelZoom = var48.zoom2d; // L: 6085
						if (var48.isStackable == 1) { // L: 6086
							var17.itemQuantityMode = 1;
						} else {
							var17.itemQuantityMode = 2; // L: 6087
						}

						if (var17.field2648 > 0) { // L: 6088
							var17.modelZoom = var17.modelZoom * 32 / var17.field2648;
						} else if (var17.rawWidth > 0) { // L: 6089
							var17.modelZoom = var17.modelZoom * 32 / var17.rawWidth;
						}

						IsaacCipher.invalidateWidget(var17); // L: 6090
					}

					var1.serverPacket = null; // L: 6092
					return true; // L: 6093
				}

				Widget var19;
				boolean var44;
				if (ServerPacket.field2153 == var1.serverPacket) { // L: 6095
					var44 = var3.method5720() == 1; // L: 6096
					var5 = var3.readInt(); // L: 6097
					var19 = class237.getWidget(var5); // L: 6098
					if (var44 != var19.isHidden) { // L: 6099
						var19.isHidden = var44; // L: 6100
						IsaacCipher.invalidateWidget(var19); // L: 6101
					}

					var1.serverPacket = null; // L: 6103
					return true; // L: 6104
				}

				Widget var18;
				if (ServerPacket.field2149 == var1.serverPacket) { // L: 6106
					var16 = var3.method5728(); // L: 6107
					var5 = var3.method5727(); // L: 6108
					var6 = var3.method5727(); // L: 6109
					var7 = var3.method5895(); // L: 6110
					var18 = class237.getWidget(var7); // L: 6111
					if (var5 != var18.modelAngleX || var6 != var18.modelAngleY || var16 != var18.modelZoom) { // L: 6112
						var18.modelAngleX = var5; // L: 6113
						var18.modelAngleY = var6; // L: 6114
						var18.modelZoom = var16; // L: 6115
						IsaacCipher.invalidateWidget(var18); // L: 6116
					}

					var1.serverPacket = null; // L: 6118
					return true; // L: 6119
				}

				if (ServerPacket.field2158 == var1.serverPacket) { // L: 6121
					PacketWriter.method2429(class194.field2351); // L: 6122
					var1.serverPacket = null; // L: 6123
					return true; // L: 6124
				}

				if (ServerPacket.field2210 == var1.serverPacket) { // L: 6126
					var16 = var3.readShort(); // L: 6127
					var5 = var3.method5730(); // L: 6128
					var6 = var3.readInt(); // L: 6129
					var17 = class237.getWidget(var6); // L: 6130
					if (var5 != var17.rawX || var16 != var17.rawY || var17.xAlignment != 0 || var17.yAlignment != 0) { // L: 6131
						var17.rawX = var5; // L: 6132
						var17.rawY = var16; // L: 6133
						var17.xAlignment = 0; // L: 6134
						var17.yAlignment = 0; // L: 6135
						IsaacCipher.invalidateWidget(var17); // L: 6136
						this.alignWidget(var17); // L: 6137
						if (var17.type == 0) { // L: 6138
							class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var6 >> 16], var17, false);
						}
					}

					var1.serverPacket = null; // L: 6140
					return true; // L: 6141
				}

				InterfaceParent var45;
				if (ServerPacket.field2175 == var1.serverPacket) { // L: 6143
					var16 = var3.readUnsignedShort(); // L: 6144
					var5 = var3.method5739(); // L: 6145
					var6 = var3.readUnsignedByte(); // L: 6146
					var45 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6147
					if (var45 != null) { // L: 6148
						GrandExchangeOffer.closeInterface(var45, var16 != var45.group);
					}

					class219.method4172(var5, var16, var6); // L: 6149
					var1.serverPacket = null; // L: 6150
					return true; // L: 6151
				}

				if (ServerPacket.field2221 == var1.serverPacket) { // L: 6153
					class105.loadRegions(true, var1.packetBuffer); // L: 6154
					var1.serverPacket = null; // L: 6155
					return true; // L: 6156
				}

				String var37;
				if (ServerPacket.field2181 == var1.serverPacket) { // L: 6158
					var37 = var3.readStringCp1252NullTerminated(); // L: 6159
					var20 = AbstractFont.escapeBrackets(UrlRequester.method3467(JagexCache.method3683(var3))); // L: 6160
					AbstractWorldMapData.addGameMessage(6, var37, var20); // L: 6161
					var1.serverPacket = null; // L: 6162
					return true; // L: 6163
				}

				String var54;
				if (ServerPacket.field2171 == var1.serverPacket) { // L: 6165
					var16 = var3.readUShortSmart(); // L: 6166
					boolean var43 = var3.readUnsignedByte() == 1; // L: 6167
					var54 = ""; // L: 6168
					boolean var41 = false; // L: 6169
					if (var43) { // L: 6170
						var54 = var3.readStringCp1252NullTerminated(); // L: 6171
						if (InterfaceParent.friendSystem.isIgnored(new Username(var54, Message.loginType))) { // L: 6172
							var41 = true;
						}
					}

					String var47 = var3.readStringCp1252NullTerminated(); // L: 6174
					if (!var41) { // L: 6175
						AbstractWorldMapData.addGameMessage(var16, var54, var47);
					}

					var1.serverPacket = null; // L: 6176
					return true; // L: 6177
				}

				if (ServerPacket.field2196 == var1.serverPacket) { // L: 6179
					World var40 = new World(); // L: 6180
					var40.host = var3.readStringCp1252NullTerminated(); // L: 6181
					var40.id = var3.readUnsignedShort(); // L: 6182
					var5 = var3.readInt(); // L: 6183
					var40.properties = var5; // L: 6184
					ItemContainer.updateGameState(45); // L: 6185
					var2.close(); // L: 6186
					var2 = null; // L: 6187
					ChatChannel.changeWorld(var40); // L: 6188
					var1.serverPacket = null; // L: 6189
					return false; // L: 6190
				}

				if (ServerPacket.field2198 == var1.serverPacket) { // L: 6192
					var16 = var3.readUnsignedByte(); // L: 6193
					var5 = var3.readUnsignedByte(); // L: 6194
					var6 = var3.readUnsignedByte(); // L: 6195
					var7 = var3.readUnsignedByte(); // L: 6196
					field907[var16] = true; // L: 6197
					field908[var16] = var5; // L: 6198
					field909[var16] = var6; // L: 6199
					field799[var16] = var7; // L: 6200
					field911[var16] = 0; // L: 6201
					var1.serverPacket = null; // L: 6202
					return true; // L: 6203
				}

				if (ServerPacket.field2144 == var1.serverPacket) { // L: 6205
					for (var16 = 0; var16 < class58.VarpDefinition_fileCount; ++var16) { // L: 6206
						VarpDefinition var58 = class204.VarpDefinition_get(var16); // L: 6207
						if (var58 != null) { // L: 6208
							Varps.Varps_temp[var16] = 0; // L: 6209
							Varps.Varps_main[var16] = 0; // L: 6210
						}
					}

					class219.method4171(); // L: 6213
					changedVarpCount += 32; // L: 6214
					var1.serverPacket = null; // L: 6215
					return true; // L: 6216
				}

				if (ServerPacket.field2224 == var1.serverPacket) { // L: 6218
					PacketWriter.method2429(class194.field2355); // L: 6219
					var1.serverPacket = null; // L: 6220
					return true; // L: 6221
				}

				if (ServerPacket.field2180 == var1.serverPacket) { // L: 6223
					GrandExchangeEvent.field82 = var3.readUnsignedByte(); // L: 6224
					GrandExchangeOfferUnitPriceComparator.field103 = var3.method5717(); // L: 6225
					var1.serverPacket = null; // L: 6226
					return true; // L: 6227
				}

				if (ServerPacket.field2219 == var1.serverPacket) { // L: 6229
					destinationX = var3.readUnsignedByte(); // L: 6230
					if (destinationX == 255) { // L: 6231
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6232
					if (destinationY == 255) { // L: 6233
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6234
					return true; // L: 6235
				}

				if (ServerPacket.field2141 == var1.serverPacket) { // L: 6237
					var16 = var3.method5895(); // L: 6238
					var5 = var3.method5729(); // L: 6239
					var6 = var5 >> 10 & 31; // L: 6240
					var7 = var5 >> 5 & 31; // L: 6241
					var8 = var5 & 31; // L: 6242
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 6243
					Widget var56 = class237.getWidget(var16); // L: 6244
					if (var9 != var56.color) { // L: 6245
						var56.color = var9; // L: 6246
						IsaacCipher.invalidateWidget(var56); // L: 6247
					}

					var1.serverPacket = null; // L: 6249
					return true; // L: 6250
				}

				long var12;
				if (ServerPacket.field2195 == var1.serverPacket) { // L: 6252
					var16 = var3.offset + var1.serverPacketLength; // L: 6253
					var5 = var3.readUnsignedShort(); // L: 6254
					var6 = var3.readUnsignedShort(); // L: 6255
					if (var5 != rootInterface) { // L: 6256
						rootInterface = var5; // L: 6257
						this.resizeRoot(false); // L: 6258
						GrandExchangeEvent.Widget_resetModelFrames(rootInterface); // L: 6259
						SoundSystem.runWidgetOnLoadListener(rootInterface); // L: 6260

						for (var7 = 0; var7 < 100; ++var7) { // L: 6261
							field816[var7] = true;
						}
					}

					InterfaceParent var21;
					for (; var6-- > 0; var21.field575 = true) { // L: 6263 6273
						var7 = var3.readInt(); // L: 6264
						var8 = var3.readUnsignedShort(); // L: 6265
						var9 = var3.readUnsignedByte(); // L: 6266
						var21 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6267
						if (var21 != null && var8 != var21.group) { // L: 6268
							GrandExchangeOffer.closeInterface(var21, true); // L: 6269
							var21 = null; // L: 6270
						}

						if (var21 == null) { // L: 6272
							var21 = class219.method4172(var7, var8, var9);
						}
					}

					for (var45 = (InterfaceParent)interfaceParents.first(); var45 != null; var45 = (InterfaceParent)interfaceParents.next()) { // L: 6275
						if (var45.field575) { // L: 6276
							var45.field575 = false;
						} else {
							GrandExchangeOffer.closeInterface(var45, true); // L: 6278
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6281

					while (var3.offset < var16) { // L: 6282
						var7 = var3.readInt(); // L: 6283
						var8 = var3.readUnsignedShort(); // L: 6284
						var9 = var3.readUnsignedShort(); // L: 6285
						var10 = var3.readInt(); // L: 6286

						for (int var11 = var8; var11 <= var9; ++var11) { // L: 6287
							var12 = (long)var11 + ((long)var7 << 32); // L: 6288
							widgetFlags.put(new IntegerNode(var10), var12); // L: 6289
						}
					}

					var1.serverPacket = null; // L: 6292
					return true; // L: 6293
				}

				if (ServerPacket.field2179 == var1.serverPacket) { // L: 6295
					GrandExchangeEvent.field82 = var3.method5776(); // L: 6296
					GrandExchangeOfferUnitPriceComparator.field103 = var3.readUnsignedByte(); // L: 6297

					while (var3.offset < var1.serverPacketLength) { // L: 6298
						var16 = var3.readUnsignedByte(); // L: 6299
						class194 var57 = class7.method85()[var16]; // L: 6300
						PacketWriter.method2429(var57); // L: 6301
					}

					var1.serverPacket = null; // L: 6303
					return true; // L: 6304
				}

				if (ServerPacket.field2217 == var1.serverPacket) { // L: 6306
					var16 = var3.readInt(); // L: 6307
					InterfaceParent var55 = (InterfaceParent)interfaceParents.get((long)var16); // L: 6308
					if (var55 != null) { // L: 6309
						GrandExchangeOffer.closeInterface(var55, true);
					}

					if (meslayerContinueWidget != null) { // L: 6310
						IsaacCipher.invalidateWidget(meslayerContinueWidget); // L: 6311
						meslayerContinueWidget = null; // L: 6312
					}

					var1.serverPacket = null; // L: 6314
					return true; // L: 6315
				}

				if (ServerPacket.field2201 == var1.serverPacket) { // L: 6317
					var16 = var3.readUnsignedByte(); // L: 6318
					WorldMapSprite.method496(var16); // L: 6319
					var1.serverPacket = null; // L: 6320
					return true; // L: 6321
				}

				if (ServerPacket.field2211 == var1.serverPacket) { // L: 6323
					SecureRandomCallable.logOut(); // L: 6324
					var1.serverPacket = null; // L: 6325
					return false; // L: 6326
				}

				if (ServerPacket.field2223 == var1.serverPacket) { // L: 6328
					minimapState = var3.readUnsignedByte(); // L: 6329
					var1.serverPacket = null; // L: 6330
					return true; // L: 6331
				}

				if (ServerPacket.field2151 == var1.serverPacket) { // L: 6333
					for (var16 = 0; var16 < Varps.Varps_main.length; ++var16) { // L: 6334
						if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) { // L: 6335
							Varps.Varps_main[var16] = Varps.Varps_temp[var16]; // L: 6336
							AbstractWorldMapIcon.changeGameOptions(var16); // L: 6337
							changedVarps[++changedVarpCount - 1 & 31] = var16; // L: 6338
						}
					}

					var1.serverPacket = null; // L: 6341
					return true; // L: 6342
				}

				if (ServerPacket.field2182 == var1.serverPacket) { // L: 6344
					GrandExchangeEvent.field82 = var3.method5717(); // L: 6345
					GrandExchangeOfferUnitPriceComparator.field103 = var3.method5720(); // L: 6346

					for (var16 = GrandExchangeEvent.field82; var16 < GrandExchangeEvent.field82 + 8; ++var16) { // L: 6347
						for (var5 = GrandExchangeOfferUnitPriceComparator.field103; var5 < GrandExchangeOfferUnitPriceComparator.field103 + 8; ++var5) { // L: 6348
							if (groundItems[class90.Client_plane][var16][var5] != null) { // L: 6349
								groundItems[class90.Client_plane][var16][var5] = null; // L: 6350
								HitSplatDefinition.updateItemPile(var16, var5); // L: 6351
							}
						}
					}

					for (PendingSpawn var39 = (PendingSpawn)pendingSpawns.last(); var39 != null; var39 = (PendingSpawn)pendingSpawns.previous()) { // L: 6355 6356 6358
						if (var39.x >= GrandExchangeEvent.field82 && var39.x < GrandExchangeEvent.field82 + 8 && var39.y >= GrandExchangeOfferUnitPriceComparator.field103 && var39.y < GrandExchangeOfferUnitPriceComparator.field103 + 8 && var39.plane == class90.Client_plane) { // L: 6357
							var39.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6360
					return true; // L: 6361
				}

				if (ServerPacket.field2178 == var1.serverPacket) { // L: 6363
					if (rootInterface != -1) { // L: 6364
						class228.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6365
					return true; // L: 6366
				}

				if (ServerPacket.field2176 == var1.serverPacket) { // L: 6368
					var16 = var3.readInt(); // L: 6369
					var5 = var3.readUnsignedShort(); // L: 6370
					if (var16 < -70000) { // L: 6371
						var5 += 32768;
					}

					if (var16 >= 0) { // L: 6373
						var19 = class237.getWidget(var16);
					} else {
						var19 = null; // L: 6374
					}

					for (; var3.offset < var1.serverPacketLength; WorldMapLabel.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 6375 6389
						var7 = var3.readUShortSmart(); // L: 6376
						var8 = var3.readUnsignedShort(); // L: 6377
						var9 = 0; // L: 6378
						if (var8 != 0) { // L: 6379
							var9 = var3.readUnsignedByte(); // L: 6380
							if (var9 == 255) { // L: 6381
								var9 = var3.readInt();
							}
						}

						if (var19 != null && var7 >= 0 && var7 < var19.itemIds.length) { // L: 6383 6384
							var19.itemIds[var7] = var8; // L: 6385
							var19.itemQuantities[var7] = var9; // L: 6386
						}
					}

					if (var19 != null) { // L: 6391
						IsaacCipher.invalidateWidget(var19);
					}

					class219.method4171(); // L: 6392
					changedItemContainers[++field870 - 1 & 31] = var5 & 32767; // L: 6393
					var1.serverPacket = null; // L: 6394
					return true; // L: 6395
				}

				if (ServerPacket.field2193 == var1.serverPacket) { // L: 6397
					class219.method4171(); // L: 6398
					runEnergy = var3.readUnsignedByte(); // L: 6399
					field861 = cycleCntr; // L: 6400
					var1.serverPacket = null; // L: 6401
					return true; // L: 6402
				}

				if (ServerPacket.field2146 == var1.serverPacket) { // L: 6404
					class182.updateNpcs(true, var3); // L: 6405
					var1.serverPacket = null; // L: 6406
					return true; // L: 6407
				}

				if (ServerPacket.field2155 == var1.serverPacket) { // L: 6409
					var16 = var3.method5895(); // L: 6410
					var5 = var3.method5731(); // L: 6411
					var19 = class237.getWidget(var16); // L: 6412
					if (var5 != var19.sequenceId || var5 == -1) { // L: 6413
						var19.sequenceId = var5; // L: 6414
						var19.modelFrame = 0; // L: 6415
						var19.modelFrameCycle = 0; // L: 6416
						IsaacCipher.invalidateWidget(var19); // L: 6417
					}

					var1.serverPacket = null; // L: 6419
					return true; // L: 6420
				}

				if (ServerPacket.field2226 == var1.serverPacket) { // L: 6422
					byte[] var38 = new byte[var1.serverPacketLength]; // L: 6423
					var3.method5642(var38, 0, var38.length); // L: 6424
					Buffer var53 = new Buffer(var38); // L: 6425
					var54 = var53.readStringCp1252NullTerminated(); // L: 6426
					WorldMapRectangle.openURL(var54, true, false); // L: 6427
					var1.serverPacket = null; // L: 6428
					return true; // L: 6429
				}

				if (ServerPacket.field2225 == var1.serverPacket) { // L: 6431
					var16 = var3.readUnsignedShort(); // L: 6432
					if (var16 == 65535) { // L: 6433
						var16 = -1;
					}

					AbstractSocket.playSong(var16); // L: 6434
					var1.serverPacket = null; // L: 6435
					return true; // L: 6436
				}

				if (ServerPacket.field2167 == var1.serverPacket) { // L: 6438
					var16 = var3.method5788(); // L: 6439
					var5 = var3.method5728(); // L: 6440
					if (var5 == 65535) { // L: 6441
						var5 = -1;
					}

					NPC.method2180(var5, var16); // L: 6442
					var1.serverPacket = null; // L: 6443
					return true; // L: 6444
				}

				if (ServerPacket.field2148 == var1.serverPacket) { // L: 6446
					rebootTimer = var3.method5729() * 30; // L: 6447
					field861 = cycleCntr; // L: 6448
					var1.serverPacket = null; // L: 6449
					return true; // L: 6450
				}

				if (ServerPacket.field2218 == var1.serverPacket) { // L: 6452
					PacketWriter.method2429(class194.field2352); // L: 6453
					var1.serverPacket = null; // L: 6454
					return true; // L: 6455
				}

				long var22;
				if (ServerPacket.field2209 == var1.serverPacket) { // L: 6457
					var16 = var3.method5895(); // L: 6458
					var5 = var3.method5727(); // L: 6459
					if (var5 == 65535) { // L: 6460
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 6461
					if (var6 == 65535) { // L: 6462
						var6 = -1;
					}

					var7 = var3.method5738(); // L: 6463

					for (var8 = var6; var8 <= var5; ++var8) { // L: 6464
						var22 = (long)var8 + ((long)var7 << 32); // L: 6465
						Node var60 = widgetFlags.get(var22); // L: 6466
						if (var60 != null) { // L: 6467
							var60.remove();
						}

						widgetFlags.put(new IntegerNode(var16), var22); // L: 6468
					}

					var1.serverPacket = null; // L: 6470
					return true; // L: 6471
				}

				if (ServerPacket.field2172 == var1.serverPacket) { // L: 6473
					PacketWriter.method2429(class194.field2348); // L: 6474
					var1.serverPacket = null; // L: 6475
					return true; // L: 6476
				}

				if (ServerPacket.field2220 == var1.serverPacket) { // L: 6478
					PacketWriter.method2429(class194.field2354); // L: 6479
					var1.serverPacket = null; // L: 6480
					return true; // L: 6481
				}

				if (ServerPacket.field2184 == var1.serverPacket) { // L: 6483
					var3.offset += 28; // L: 6484
					if (var3.checkCrc()) { // L: 6485
						ServerPacket.method3809(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6486
					return true; // L: 6487
				}

				long var25;
				long var27;
				if (ServerPacket.field2156 == var1.serverPacket) { // L: 6489
					var37 = var3.readStringCp1252NullTerminated(); // L: 6490
					var25 = (long)var3.readUnsignedShort(); // L: 6491
					var27 = (long)var3.readMedium(); // L: 6492
					PlayerType var29 = (PlayerType)InterfaceParent.findEnumerated(class69.PlayerType_values(), var3.readUnsignedByte()); // L: 6493
					long var30 = var27 + (var25 << 32); // L: 6494
					boolean var32 = false; // L: 6495

					for (int var13 = 0; var13 < 100; ++var13) { // L: 6496
						if (var30 == field883[var13]) { // L: 6497
							var32 = true; // L: 6498
							break; // L: 6499
						}
					}

					if (InterfaceParent.friendSystem.isIgnored(new Username(var37, Message.loginType))) { // L: 6502
						var32 = true;
					}

					if (!var32 && field778 == 0) { // L: 6503
						field883[field884] = var30; // L: 6504
						field884 = (field884 + 1) % 100; // L: 6505
						String var33 = AbstractFont.escapeBrackets(UrlRequester.method3467(JagexCache.method3683(var3))); // L: 6506
						byte var42;
						if (var29.isPrivileged) { // L: 6508
							var42 = 7;
						} else {
							var42 = 3; // L: 6509
						}

						if (var29.modIcon != -1) { // L: 6510
							AbstractWorldMapData.addGameMessage(var42, UserComparator10.method3580(var29.modIcon) + var37, var33);
						} else {
							AbstractWorldMapData.addGameMessage(var42, var37, var33); // L: 6511
						}
					}

					var1.serverPacket = null; // L: 6513
					return true; // L: 6514
				}

				if (ServerPacket.field2200 == var1.serverPacket) { // L: 6516
					class182.updateNpcs(false, var3); // L: 6517
					var1.serverPacket = null; // L: 6518
					return true; // L: 6519
				}

				if (ServerPacket.field2202 == var1.serverPacket) { // L: 6521
					var16 = var3.readInt(); // L: 6522
					var5 = var3.readInt(); // L: 6523
					var6 = GrandExchangeOffer.getGcDuration(); // L: 6524
					PacketBufferNode var46 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2241, packetWriter.isaacCipher); // L: 6526
					var46.packetBuffer.method5883(GameEngine.fps); // L: 6527
					var46.packetBuffer.method5736(var16); // L: 6528
					var46.packetBuffer.method5781(var5); // L: 6529
					var46.packetBuffer.method5883(var6); // L: 6530
					packetWriter.addNode(var46); // L: 6531
					var1.serverPacket = null; // L: 6532
					return true; // L: 6533
				}

				if (ServerPacket.field2162 == var1.serverPacket) { // L: 6535
					var37 = var3.readStringCp1252NullTerminated(); // L: 6536
					var5 = var3.method5717(); // L: 6537
					var6 = var3.method5717(); // L: 6538
					if (var5 >= 1 && var5 <= 8) { // L: 6539
						if (var37.equalsIgnoreCase("null")) { // L: 6540
							var37 = null;
						}

						playerMenuActions[var5 - 1] = var37; // L: 6541
						playerOptionsPriorities[var5 - 1] = var6 == 0; // L: 6542
					}

					var1.serverPacket = null; // L: 6544
					return true; // L: 6545
				}

				if (ServerPacket.field2152 == var1.serverPacket) { // L: 6547
					var16 = var3.readUnsignedByte(); // L: 6548
					WorldMapSection2.forceDisconnect(var16); // L: 6549
					var1.serverPacket = null; // L: 6550
					return false; // L: 6551
				}

				if (ServerPacket.field2157 == var1.serverPacket) { // L: 6553
					hintArrowType = var3.readUnsignedByte(); // L: 6554
					if (hintArrowType == 1) { // L: 6555
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6556
						if (hintArrowType == 2) { // L: 6557
							hintArrowSubX = 64; // L: 6558
							hintArrowSubY = 64; // L: 6559
						}

						if (hintArrowType == 3) { // L: 6561
							hintArrowSubX = 0; // L: 6562
							hintArrowSubY = 64; // L: 6563
						}

						if (hintArrowType == 4) { // L: 6565
							hintArrowSubX = 128; // L: 6566
							hintArrowSubY = 64; // L: 6567
						}

						if (hintArrowType == 5) { // L: 6569
							hintArrowSubX = 64; // L: 6570
							hintArrowSubY = 0; // L: 6571
						}

						if (hintArrowType == 6) { // L: 6573
							hintArrowSubX = 64; // L: 6574
							hintArrowSubY = 128; // L: 6575
						}

						hintArrowType = 2; // L: 6577
						hintArrowX = var3.readUnsignedShort(); // L: 6578
						hintArrowY = var3.readUnsignedShort(); // L: 6579
						hintArrowHeight = var3.readUnsignedByte(); // L: 6580
					}

					if (hintArrowType == 10) { // L: 6582
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6583
					return true; // L: 6584
				}

				if (ServerPacket.field2168 == var1.serverPacket) { // L: 6586
					class219.method4171(); // L: 6587
					weight = var3.readShort(); // L: 6588
					field861 = cycleCntr; // L: 6589
					var1.serverPacket = null; // L: 6590
					return true; // L: 6591
				}

				if (ServerPacket.field2192 == var1.serverPacket) { // L: 6593
					var16 = var3.readInt(); // L: 6594
					if (var16 != field746) { // L: 6595
						field746 = var16; // L: 6596
						WorldMapCacheName.method715(); // L: 6597
					}

					var1.serverPacket = null; // L: 6599
					return true; // L: 6600
				}

				Widget var51;
				if (ServerPacket.field2174 == var1.serverPacket) { // L: 6602
					var16 = var3.method5739(); // L: 6603
					var51 = class237.getWidget(var16); // L: 6604
					var51.modelType = 3; // L: 6605
					var51.modelId = UserComparator9.localPlayer.appearance.getChatHeadId(); // L: 6606
					IsaacCipher.invalidateWidget(var51); // L: 6607
					var1.serverPacket = null; // L: 6608
					return true; // L: 6609
				}

				if (ServerPacket.field2203 == var1.serverPacket) { // L: 6611
					var16 = var3.method5729(); // L: 6612
					WorldMapLabel.method501(var16); // L: 6613
					changedItemContainers[++field870 - 1 & 31] = var16 & 32767; // L: 6614
					var1.serverPacket = null; // L: 6615
					return true; // L: 6616
				}

				if (ServerPacket.field2142 == var1.serverPacket) { // L: 6618
					var16 = var3.readInt(); // L: 6619
					var5 = var3.readUnsignedShort(); // L: 6620
					if (var16 < -70000) { // L: 6621
						var5 += 32768;
					}

					if (var16 >= 0) { // L: 6623
						var19 = class237.getWidget(var16);
					} else {
						var19 = null; // L: 6624
					}

					if (var19 != null) { // L: 6625
						for (var7 = 0; var7 < var19.itemIds.length; ++var7) { // L: 6626
							var19.itemIds[var7] = 0; // L: 6627
							var19.itemQuantities[var7] = 0; // L: 6628
						}
					}

					WorldMapID.clearItemContainer(var5); // L: 6631
					var7 = var3.readUnsignedShort(); // L: 6632

					for (var8 = 0; var8 < var7; ++var8) { // L: 6633
						var9 = var3.readUnsignedByte(); // L: 6634
						if (var9 == 255) { // L: 6635
							var9 = var3.method5739();
						}

						var10 = var3.method5729(); // L: 6636
						if (var19 != null && var8 < var19.itemIds.length) { // L: 6637 6638
							var19.itemIds[var8] = var10; // L: 6639
							var19.itemQuantities[var8] = var9; // L: 6640
						}

						WorldMapLabel.itemContainerSetItem(var5, var8, var10 - 1, var9); // L: 6643
					}

					if (var19 != null) { // L: 6645
						IsaacCipher.invalidateWidget(var19);
					}

					class219.method4171(); // L: 6646
					changedItemContainers[++field870 - 1 & 31] = var5 & 32767; // L: 6647
					var1.serverPacket = null; // L: 6648
					return true; // L: 6649
				}

				if (ServerPacket.field2166 == var1.serverPacket) { // L: 6651
					var16 = var3.method5738(); // L: 6652
					var5 = var3.method5895(); // L: 6653
					InterfaceParent var50 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6654
					var45 = (InterfaceParent)interfaceParents.get((long)var16); // L: 6655
					if (var45 != null) { // L: 6656
						GrandExchangeOffer.closeInterface(var45, var50 == null || var50.group != var45.group);
					}

					if (var50 != null) { // L: 6657
						var50.remove(); // L: 6658
						interfaceParents.put(var50, (long)var16); // L: 6659
					}

					var18 = class237.getWidget(var5); // L: 6661
					if (var18 != null) { // L: 6662
						IsaacCipher.invalidateWidget(var18);
					}

					var18 = class237.getWidget(var16); // L: 6663
					if (var18 != null) { // L: 6664
						IsaacCipher.invalidateWidget(var18); // L: 6665
						class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var18.id >>> 16], var18, true); // L: 6666
					}

					if (rootInterface != -1) { // L: 6668
						class228.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6669
					return true; // L: 6670
				}

				if (ServerPacket.field2222 == var1.serverPacket) { // L: 6672
					byte var59 = var3.method5721(); // L: 6673
					var5 = var3.readUnsignedShort(); // L: 6674
					Varps.Varps_temp[var5] = var59; // L: 6675
					if (Varps.Varps_main[var5] != var59) { // L: 6676
						Varps.Varps_main[var5] = var59; // L: 6677
					}

					AbstractWorldMapIcon.changeGameOptions(var5); // L: 6679
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6680
					var1.serverPacket = null; // L: 6681
					return true; // L: 6682
				}

				if (ServerPacket.field2199 == var1.serverPacket) { // L: 6684
					var37 = var3.readStringCp1252NullTerminated(); // L: 6685
					Object[] var52 = new Object[var37.length() + 1]; // L: 6686

					for (var6 = var37.length() - 1; var6 >= 0; --var6) { // L: 6687
						if (var37.charAt(var6) == 's') { // L: 6688
							var52[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var52[var6 + 1] = new Integer(var3.readInt()); // L: 6689
						}
					}

					var52[0] = new Integer(var3.readInt()); // L: 6691
					ScriptEvent var49 = new ScriptEvent(); // L: 6692
					var49.args = var52; // L: 6693
					PacketWriter.runScriptEvent(var49); // L: 6694
					var1.serverPacket = null; // L: 6695
					return true; // L: 6696
				}

				if (ServerPacket.field2186 == var1.serverPacket) { // L: 6698
					for (var16 = 0; var16 < players.length; ++var16) { // L: 6699
						if (players[var16] != null) { // L: 6700
							players[var16].sequence = -1;
						}
					}

					for (var16 = 0; var16 < npcs.length; ++var16) { // L: 6702
						if (npcs[var16] != null) { // L: 6703
							npcs[var16].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6705
					return true; // L: 6706
				}

				if (ServerPacket.field2150 == var1.serverPacket) { // L: 6708
					var16 = var3.method5895(); // L: 6709
					var51 = class237.getWidget(var16); // L: 6710

					for (var6 = 0; var6 < var51.itemIds.length; ++var6) { // L: 6711
						var51.itemIds[var6] = -1; // L: 6712
						var51.itemIds[var6] = 0; // L: 6713
					}

					IsaacCipher.invalidateWidget(var51); // L: 6715
					var1.serverPacket = null; // L: 6716
					return true; // L: 6717
				}

				if (ServerPacket.field2207 == var1.serverPacket) { // L: 6719
					var16 = var3.method5729(); // L: 6720
					var5 = var3.method5895(); // L: 6721
					var19 = class237.getWidget(var5); // L: 6722
					if (var19 != null && var19.type == 0) { // L: 6723
						if (var16 > var19.scrollHeight - var19.height) { // L: 6724
							var16 = var19.scrollHeight - var19.height;
						}

						if (var16 < 0) { // L: 6725
							var16 = 0;
						}

						if (var16 != var19.scrollY) { // L: 6726
							var19.scrollY = var16; // L: 6727
							IsaacCipher.invalidateWidget(var19); // L: 6728
						}
					}

					var1.serverPacket = null; // L: 6731
					return true; // L: 6732
				}

				if (ServerPacket.field2173 == var1.serverPacket) { // L: 6734
					if (var1.serverPacketLength == 0) { // L: 6735
						WorldMapID.clanChat = null; // L: 6736
					} else {
						if (WorldMapID.clanChat == null) { // L: 6739
							WorldMapID.clanChat = new ClanChat(Message.loginType, class1.client); // L: 6740
						}

						WorldMapID.clanChat.readUpdate(var3); // L: 6742
					}

					KeyHandler.method911(); // L: 6744
					var1.serverPacket = null; // L: 6745
					return true; // L: 6746
				}

				if (ServerPacket.field2159 == var1.serverPacket) { // L: 6748
					class105.loadRegions(false, var1.packetBuffer); // L: 6749
					var1.serverPacket = null; // L: 6750
					return true; // L: 6751
				}

				if (ServerPacket.field2216 == var1.serverPacket) { // L: 6753
					var16 = var3.method5738(); // L: 6754
					var5 = var3.method5727(); // L: 6755
					var6 = var3.method5727(); // L: 6756
					var17 = class237.getWidget(var16); // L: 6757
					var17.field2649 = var6 + (var5 << 16); // L: 6758
					var1.serverPacket = null; // L: 6759
					return true; // L: 6760
				}

				if (ServerPacket.field2177 == var1.serverPacket) { // L: 6762
					PacketWriter.method2429(class194.field2353); // L: 6763
					var1.serverPacket = null; // L: 6764
					return true; // L: 6765
				}

				if (ServerPacket.field2145 == var1.serverPacket) { // L: 6767
					var44 = var3.readBoolean(); // L: 6768
					if (var44) { // L: 6769
						if (HealthBarUpdate.field1016 == null) { // L: 6770
							HealthBarUpdate.field1016 = new class248();
						}
					} else {
						HealthBarUpdate.field1016 = null; // L: 6772
					}

					var1.serverPacket = null; // L: 6773
					return true; // L: 6774
				}

				if (ServerPacket.field2185 == var1.serverPacket) { // L: 6776
					tradeChatMode = var3.method5720(); // L: 6777
					publicChatMode = var3.method5776(); // L: 6778
					var1.serverPacket = null; // L: 6779
					return true; // L: 6780
				}

				if (ServerPacket.field2215 == var1.serverPacket) { // L: 6782
					ModelData0.updatePlayers(var3, var1.serverPacketLength); // L: 6783
					FriendsList.method5386(); // L: 6784
					var1.serverPacket = null; // L: 6785
					return true; // L: 6786
				}

				if (ServerPacket.field2161 == var1.serverPacket) { // L: 6788
					ArchiveLoader.privateChatMode = UserComparator5.method3604(var3.readUnsignedByte()); // L: 6789
					var1.serverPacket = null; // L: 6790
					return true; // L: 6791
				}

				if (ServerPacket.field2212 == var1.serverPacket) { // L: 6793
					var16 = var3.method5728(); // L: 6794
					var5 = var3.method5739(); // L: 6795
					var19 = class237.getWidget(var5); // L: 6796
					if (var19.modelType != 2 || var16 != var19.modelId) { // L: 6797
						var19.modelType = 2; // L: 6798
						var19.modelId = var16; // L: 6799
						IsaacCipher.invalidateWidget(var19); // L: 6800
					}

					var1.serverPacket = null; // L: 6802
					return true; // L: 6803
				}

				if (ServerPacket.field2189 == var1.serverPacket) { // L: 6805
					var16 = var3.readUnsignedShort(); // L: 6806
					rootInterface = var16; // L: 6807
					this.resizeRoot(false); // L: 6808
					GrandExchangeEvent.Widget_resetModelFrames(var16); // L: 6809
					SoundSystem.runWidgetOnLoadListener(rootInterface); // L: 6810

					for (var5 = 0; var5 < 100; ++var5) { // L: 6811
						field816[var5] = true;
					}

					var1.serverPacket = null; // L: 6812
					return true; // L: 6813
				}

				if (ServerPacket.field2197 == var1.serverPacket) { // L: 6815
					var16 = var3.readUnsignedByte(); // L: 6816
					if (var3.readUnsignedByte() == 0) { // L: 6817
						grandExchangeOffers[var16] = new GrandExchangeOffer(); // L: 6818
						var3.offset += 18; // L: 6819
					} else {
						--var3.offset; // L: 6822
						grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false); // L: 6823
					}

					field710 = cycleCntr; // L: 6825
					var1.serverPacket = null; // L: 6826
					return true; // L: 6827
				}

				if (ServerPacket.field2194 == var1.serverPacket) { // L: 6829
					InterfaceParent.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6830
					class51.FriendSystem_invalidateIgnoreds(); // L: 6831
					field857 = cycleCntr; // L: 6832
					var1.serverPacket = null; // L: 6833
					return true; // L: 6834
				}

				if (ServerPacket.field2208 == var1.serverPacket) { // L: 6836
					isCameraLocked = false; // L: 6837

					for (var16 = 0; var16 < 5; ++var16) { // L: 6838
						field907[var16] = false;
					}

					var1.serverPacket = null; // L: 6839
					return true; // L: 6840
				}

				if (ServerPacket.field2204 == var1.serverPacket) { // L: 6842
					class308.readReflectionCheck(var3, var1.serverPacketLength); // L: 6843
					var1.serverPacket = null; // L: 6844
					return true; // L: 6845
				}

				if (ServerPacket.field2169 == var1.serverPacket) { // L: 6847
					class219.method4171(); // L: 6848
					var16 = var3.method5895(); // L: 6849
					var5 = var3.method5717(); // L: 6850
					var6 = var3.readUnsignedByte(); // L: 6851
					experience[var6] = var16; // L: 6852
					currentLevels[var6] = var5; // L: 6853
					levels[var6] = 1; // L: 6854

					for (var7 = 0; var7 < 98; ++var7) { // L: 6855
						if (var16 >= Skills.Skills_experienceTable[var7]) {
							levels[var6] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6; // L: 6856
					var1.serverPacket = null; // L: 6857
					return true; // L: 6858
				}

				if (ServerPacket.field2165 == var1.serverPacket) { // L: 6860
					isCameraLocked = true; // L: 6861
					WorldMapManager.field345 = var3.readUnsignedByte(); // L: 6862
					Decimator.field1475 = var3.readUnsignedByte(); // L: 6863
					Clock.field2079 = var3.readUnsignedShort(); // L: 6864
					JagexCache.field2056 = var3.readUnsignedByte(); // L: 6865
					class228.field2740 = var3.readUnsignedByte(); // L: 6866
					if (class228.field2740 >= 100) { // L: 6867
						SecureRandomFuture.cameraX = WorldMapManager.field345 * 128 + 64; // L: 6868
						ObjectSound.cameraZ = Decimator.field1475 * 128 + 64; // L: 6869
						ArchiveLoader.cameraY = WorldMapRegion.getTileHeight(SecureRandomFuture.cameraX, ObjectSound.cameraZ, class90.Client_plane) - Clock.field2079; // L: 6870
					}

					var1.serverPacket = null; // L: 6872
					return true; // L: 6873
				}

				if (ServerPacket.field2188 == var1.serverPacket) { // L: 6875
					InterfaceParent.friendSystem.method1975(); // L: 6876
					field857 = cycleCntr; // L: 6877
					var1.serverPacket = null; // L: 6878
					return true; // L: 6879
				}

				if (ServerPacket.field2143 == var1.serverPacket) { // L: 6881
					var44 = var3.readUnsignedByte() == 1; // L: 6882
					if (var44) { // L: 6883
						class9.field57 = Tiles.currentTimeMillis() - var3.readLong(); // L: 6884
						WorldMapSectionType.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6885
					} else {
						WorldMapSectionType.grandExchangeEvents = null; // L: 6887
					}

					field860 = cycleCntr; // L: 6888
					var1.serverPacket = null; // L: 6889
					return true; // L: 6890
				}

				if (ServerPacket.field2154 == var1.serverPacket) { // L: 6892
					var16 = var3.method5739(); // L: 6893
					var20 = var3.readStringCp1252NullTerminated(); // L: 6894
					var19 = class237.getWidget(var16); // L: 6895
					if (!var20.equals(var19.text)) { // L: 6896
						var19.text = var20; // L: 6897
						IsaacCipher.invalidateWidget(var19); // L: 6898
					}

					var1.serverPacket = null; // L: 6900
					return true; // L: 6901
				}

				if (ServerPacket.field2191 == var1.serverPacket) { // L: 6903
					if (WorldMapID.clanChat != null) { // L: 6904
						WorldMapID.clanChat.method5428(var3); // L: 6905
					}

					KeyHandler.method911(); // L: 6907
					var1.serverPacket = null; // L: 6908
					return true; // L: 6909
				}

				if (ServerPacket.field2147 == var1.serverPacket) { // L: 6911
					PacketWriter.method2429(class194.field2347); // L: 6912
					var1.serverPacket = null; // L: 6913
					return true; // L: 6914
				}

				if (ServerPacket.field2190 == var1.serverPacket) { // L: 6916
					var16 = var3.method5895(); // L: 6917
					var5 = var3.method5727(); // L: 6918
					var19 = class237.getWidget(var16); // L: 6919
					if (var19.modelType != 1 || var5 != var19.modelId) { // L: 6920
						var19.modelType = 1; // L: 6921
						var19.modelId = var5; // L: 6922
						IsaacCipher.invalidateWidget(var19); // L: 6923
					}

					var1.serverPacket = null; // L: 6925
					return true; // L: 6926
				}

				if (ServerPacket.field2163 == var1.serverPacket) { // L: 6928
					PacketWriter.method2429(class194.field2356); // L: 6929
					var1.serverPacket = null; // L: 6930
					return true; // L: 6931
				}

				if (ServerPacket.field2187 == var1.serverPacket) { // L: 6933
					var37 = var3.readStringCp1252NullTerminated(); // L: 6934
					var25 = var3.readLong(); // L: 6935
					var27 = (long)var3.readUnsignedShort(); // L: 6936
					var22 = (long)var3.readMedium(); // L: 6937
					PlayerType var24 = (PlayerType)InterfaceParent.findEnumerated(class69.PlayerType_values(), var3.readUnsignedByte()); // L: 6938
					var12 = var22 + (var27 << 32); // L: 6939
					boolean var14 = false; // L: 6940

					for (int var15 = 0; var15 < 100; ++var15) { // L: 6941
						if (var12 == field883[var15]) { // L: 6942
							var14 = true; // L: 6943
							break; // L: 6944
						}
					}

					if (var24.isUser && InterfaceParent.friendSystem.isIgnored(new Username(var37, Message.loginType))) { // L: 6947 6948
						var14 = true;
					}

					if (!var14 && field778 == 0) { // L: 6950
						field883[field884] = var12; // L: 6951
						field884 = (field884 + 1) % 100; // L: 6952
						String var34 = AbstractFont.escapeBrackets(UrlRequester.method3467(JagexCache.method3683(var3))); // L: 6953
						if (var24.modIcon != -1) { // L: 6954
							PlatformInfo.addChatMessage(9, UserComparator10.method3580(var24.modIcon) + var37, var34, Messages.base37DecodeLong(var25));
						} else {
							PlatformInfo.addChatMessage(9, var37, var34, Messages.base37DecodeLong(var25)); // L: 6955
						}
					}

					var1.serverPacket = null; // L: 6957
					return true; // L: 6958
				}

				SequenceDefinition.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 2010770863 * 763595087 : -1) + "," + (var1.field1333 != null ? var1.field1333.id * 2010770863 * 763595087 : -1) + "," + (var1.field1334 != null ? var1.field1334.id * 2010770863 * 763595087 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 6960
				SecureRandomCallable.logOut(); // L: 6961
			} catch (IOException var35) { // L: 6963
				class8.method90(); // L: 6964
			} catch (Exception var36) {
				var20 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 2010770863 * 763595087 : -1) + "," + (var1.field1333 != null ? var1.field1333.id * 2010770863 * 763595087 : -1) + "," + (var1.field1334 != null ? var1.field1334.id * 2010770863 * 763595087 : -1) + "," + var1.serverPacketLength + "," + (UserComparator9.localPlayer.pathX[0] + GrandExchangeOfferNameComparator.baseX) + "," + (UserComparator9.localPlayer.pathY[0] + NetCache.baseY) + ","; // L: 6967

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 6968
					var20 = var20 + var3.array[var6] + ",";
				}

				SequenceDefinition.RunException_sendStackTrace(var20, var36); // L: 6969
				SecureRandomCallable.logOut(); // L: 6970
			}

			return true; // L: 6972
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 7833

		int var2;
		int var5;
		while (!var1) { // L: 7834
			var1 = true; // L: 7835

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 7836
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 7837
					String var17 = menuTargets[var2]; // L: 7838
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 7839
					menuTargets[var2 + 1] = var17; // L: 7840
					String var18 = menuActions[var2]; // L: 7841
					menuActions[var2] = menuActions[var2 + 1]; // L: 7842
					menuActions[var2 + 1] = var18; // L: 7843
					var5 = menuOpcodes[var2]; // L: 7844
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 7845
					menuOpcodes[var2 + 1] = var5; // L: 7846
					var5 = menuArguments1[var2]; // L: 7847
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 7848
					menuArguments1[var2 + 1] = var5; // L: 7849
					var5 = menuArguments2[var2]; // L: 7850
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 7851
					menuArguments2[var2 + 1] = var5; // L: 7852
					var5 = menuIdentifiers[var2]; // L: 7853
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 7854
					menuIdentifiers[var2 + 1] = var5; // L: 7855
					boolean var6 = menuShiftClick[var2]; // L: 7856
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 7857
					menuShiftClick[var2 + 1] = var6; // L: 7858
					var1 = false; // L: 7859
				}
			}
		}

		if (JagexCache.dragInventoryWidget == null) { // L: 7864
			if (clickedWidget == null) { // L: 7865
				int var19 = MouseHandler.MouseHandler_lastButton; // L: 7866
				int var4;
				int var9;
				int var14;
				int var20;
				if (isMenuOpen) { // L: 7867
					int var3;
					if (var19 != 1 && (class8.mouseCam || var19 != 4)) { // L: 7868
						var2 = MouseHandler.MouseHandler_x; // L: 7869
						var3 = MouseHandler.MouseHandler_y; // L: 7870
						if (var2 < ApproximateRouteStrategy.menuX - 10 || var2 > ApproximateRouteStrategy.menuX + CollisionMap.menuWidth + 10 || var3 < AbstractUserComparator.menuY - 10 || var3 > GrandExchangeOfferTotalQuantityComparator.menuHeight + AbstractUserComparator.menuY + 10) { // L: 7871
							isMenuOpen = false; // L: 7872
							Projectile.method2262(ApproximateRouteStrategy.menuX, AbstractUserComparator.menuY, CollisionMap.menuWidth, GrandExchangeOfferTotalQuantityComparator.menuHeight); // L: 7873
						}
					}

					if (var19 == 1 || !class8.mouseCam && var19 == 4) { // L: 7876
						var2 = ApproximateRouteStrategy.menuX; // L: 7877
						var3 = AbstractUserComparator.menuY; // L: 7878
						var4 = CollisionMap.menuWidth; // L: 7879
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 7880
						var20 = MouseHandler.MouseHandler_lastPressedY; // L: 7881
						var14 = -1; // L: 7882

						int var21;
						for (var21 = 0; var21 < menuOptionsCount; ++var21) { // L: 7883
							var9 = var3 + (menuOptionsCount - 1 - var21) * 15 + 31; // L: 7884
							if (var5 > var2 && var5 < var4 + var2 && var20 > var9 - 13 && var20 < var9 + 3) { // L: 7885
								var14 = var21;
							}
						}

						if (var14 != -1 && var14 >= 0) { // L: 7887 7888
							var21 = menuArguments1[var14]; // L: 7889
							var9 = menuArguments2[var14]; // L: 7890
							int var10 = menuOpcodes[var14]; // L: 7891
							int var11 = menuIdentifiers[var14]; // L: 7892
							String var12 = menuActions[var14]; // L: 7893
							String var13 = menuTargets[var14]; // L: 7894
							AbstractWorldMapIcon.menuAction(var21, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7895
						}

						isMenuOpen = false; // L: 7897
						Projectile.method2262(ApproximateRouteStrategy.menuX, AbstractUserComparator.menuY, CollisionMap.menuWidth, GrandExchangeOfferTotalQuantityComparator.menuHeight); // L: 7898
					}
				} else {
					var2 = menuOptionsCount - 1; // L: 7904
					if ((var19 == 1 || !class8.mouseCam && var19 == 4) && var2 >= 0) { // L: 7907
						var4 = menuOpcodes[var2]; // L: 7908
						if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) { // L: 7909
							label260: {
								var5 = menuArguments1[var2]; // L: 7910
								var20 = menuArguments2[var2]; // L: 7911
								Widget var7 = class237.getWidget(var20); // L: 7912
								var9 = class60.getWidgetFlags(var7); // L: 7914
								boolean var8 = (var9 >> 28 & 1) != 0; // L: 7916
								if (!var8) { // L: 7918
									Object var10000 = null;
									if (!ModeWhere.method3867(class60.getWidgetFlags(var7))) {
										break label260;
									}
								}

								if (JagexCache.dragInventoryWidget != null && !field776 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 7919 7920
									LoginPacket.method3812(draggedWidgetX, draggedWidgetY); // L: 7921
								}

								field776 = false; // L: 7924
								itemDragDuration = 0; // L: 7925
								if (JagexCache.dragInventoryWidget != null) { // L: 7926
									IsaacCipher.invalidateWidget(JagexCache.dragInventoryWidget);
								}

								JagexCache.dragInventoryWidget = class237.getWidget(var20); // L: 7927
								dragItemSlotSource = var5; // L: 7928
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 7929
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 7930
								if (var2 >= 0) { // L: 7931
									class195.tempMenuAction = new MenuAction(); // L: 7932
									class195.tempMenuAction.param0 = menuArguments1[var2]; // L: 7933
									class195.tempMenuAction.param1 = menuArguments2[var2]; // L: 7934
									class195.tempMenuAction.opcode = menuOpcodes[var2]; // L: 7935
									class195.tempMenuAction.identifier = menuIdentifiers[var2]; // L: 7936
									class195.tempMenuAction.action = menuActions[var2]; // L: 7937
								}

								IsaacCipher.invalidateWidget(JagexCache.dragInventoryWidget); // L: 7939
								return; // L: 7940
							}
						}
					}

					if ((var19 == 1 || !class8.mouseCam && var19 == 4) && this.shouldLeftClickOpenMenu()) { // L: 7944 7945
						var19 = 2; // L: 7946
					}

					if ((var19 == 1 || !class8.mouseCam && var19 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 7949 7951
						var4 = menuArguments1[var2]; // L: 7952
						var5 = menuArguments2[var2]; // L: 7953
						var20 = menuOpcodes[var2]; // L: 7954
						var14 = menuIdentifiers[var2]; // L: 7955
						String var15 = menuActions[var2]; // L: 7956
						String var16 = menuTargets[var2]; // L: 7957
						AbstractWorldMapIcon.menuAction(var4, var5, var20, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7958
					}

					if (var19 == 2 && menuOptionsCount > 0) { // L: 7961
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 7963

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1283053066"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 7968
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || HealthBarDefinition.method4677(var1)) && !menuShiftClick[var1]; // L: 7971
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1717736851"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		GrandExchangeOfferTotalQuantityComparator.method162(var1, var2); // L: 7975
		MilliClock.scene.menuOpen(class90.Client_plane, var1, var2, false); // L: 7976
		isMenuOpen = true; // L: 7977
	} // L: 7978

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "1112"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 9914
		int var3 = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 9915
		int var4 = class25.canvasHeight; // L: 9916
		if (WorldMapCacheName.loadInterface(var2)) { // L: 9918
			ObjectSound.resizeInterface(DefaultsGroup.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 9919
		}

	} // L: 9921

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lhz;S)V",
		garbageValue = "-12534"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class237.getWidget(var1.parentId); // L: 9924
		int var3;
		int var4;
		if (var2 == null) { // L: 9927
			var3 = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 9928
			var4 = class25.canvasHeight; // L: 9929
		} else {
			var3 = var2.width; // L: 9932
			var4 = var2.height; // L: 9933
		}

		WorldMapManager.alignWidgetSize(var1, var3, var4, false); // L: 9935
		ClientPreferences.alignWidgetPosition(var1, var3, var4); // L: 9936
	} // L: 9937

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "645040649"
	)
	final void method1403() {
		IsaacCipher.invalidateWidget(clickedWidget); // L: 10916
		++PlayerComposition.widgetDragDuration; // L: 10917
		if (field754 && field912) { // L: 10918
			int var1 = MouseHandler.MouseHandler_x; // L: 10924
			int var2 = MouseHandler.MouseHandler_y; // L: 10925
			var1 -= widgetClickX; // L: 10926
			var2 -= widgetClickY; // L: 10927
			if (var1 < field714) { // L: 10928
				var1 = field714;
			}

			if (var1 + clickedWidget.width > field714 + clickedWidgetParent.width) { // L: 10929
				var1 = field714 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field844) { // L: 10930
				var2 = field844;
			}

			if (var2 + clickedWidget.height > field844 + clickedWidgetParent.height) { // L: 10931
				var2 = field844 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field784; // L: 10932
			int var4 = var2 - field847; // L: 10933
			int var5 = clickedWidget.dragZoneSize; // L: 10934
			if (PlayerComposition.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 10935 10936
				isDraggingWidget = true; // L: 10937
			}

			int var6 = var1 - field714 + clickedWidgetParent.scrollX; // L: 10940
			int var7 = var2 - field844 + clickedWidgetParent.scrollY; // L: 10941
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 10942
				var8 = new ScriptEvent(); // L: 10943
				var8.widget = clickedWidget; // L: 10944
				var8.mouseX = var6; // L: 10945
				var8.mouseY = var7; // L: 10946
				var8.args = clickedWidget.onDrag; // L: 10947
				PacketWriter.runScriptEvent(var8); // L: 10948
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 10950
				if (isDraggingWidget) { // L: 10951
					if (clickedWidget.onDragComplete != null) { // L: 10952
						var8 = new ScriptEvent(); // L: 10953
						var8.widget = clickedWidget; // L: 10954
						var8.mouseX = var6; // L: 10955
						var8.mouseY = var7; // L: 10956
						var8.dragTarget = draggedOnWidget; // L: 10957
						var8.args = clickedWidget.onDragComplete; // L: 10958
						PacketWriter.runScriptEvent(var8); // L: 10959
					}

					if (draggedOnWidget != null && Strings.method4325(clickedWidget) != null) { // L: 10961
						PacketBufferNode var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2272, packetWriter.isaacCipher); // L: 10963
						var9.packetBuffer.method5736(draggedOnWidget.id); // L: 10964
						var9.packetBuffer.writeShort(clickedWidget.childIndex); // L: 10965
						var9.packetBuffer.writeIntME(clickedWidget.itemId); // L: 10966
						var9.packetBuffer.method5725(draggedOnWidget.childIndex); // L: 10967
						var9.packetBuffer.method5725(draggedOnWidget.itemId); // L: 10968
						var9.packetBuffer.method5736(clickedWidget.id); // L: 10969
						packetWriter.addNode(var9); // L: 10970
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 10974
					this.openMenu(field784 + widgetClickX, widgetClickY + field847); // L: 10975
				} else if (menuOptionsCount > 0) { // L: 10977
					LoginPacket.method3812(field784 + widgetClickX, field847 + widgetClickY); // L: 10978
				}

				clickedWidget = null; // L: 10981
			}

		} else {
			if (PlayerComposition.widgetDragDuration > 1) { // L: 10919
				clickedWidget = null; // L: 10920
			}

		}
	} // L: 10922 10983

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)Lkk;",
		garbageValue = "75"
	)
	@Export("username")
	public Username username() {
		return UserComparator9.localPlayer != null ? UserComparator9.localPlayer.username : null; // L: 11612
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-1847774417"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 33
		if (var1 != null) { // L: 34
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 35
			var1 = new KitDefinition(); // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Lls;",
		garbageValue = "1"
	)
	public static AbstractSocket method1841(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZS)I",
		garbageValue = "-2260"
	)
	static int method1839(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3353
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_0.loadWorlds() ? 1 : 0; // L: 3354
			return 1; // L: 3355
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3357
				var9 = Occluder.worldListStart(); // L: 3358
				if (var9 != null) { // L: 3359
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3360
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3361
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3362
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3363
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3364
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3365
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3368
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3369
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3370
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3371
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3372
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3373
				}

				return 1; // L: 3375
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3377
				var9 = Player.getNextWorldListWorld(); // L: 3378
				if (var9 != null) { // L: 3379
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3380
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3381
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3382
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3383
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3384
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3385
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3388
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3389
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3390
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3391
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3392
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3393
				}

				return 1; // L: 3395
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3397
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3398
					var7 = null; // L: 3399

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3400
						if (var3 == World.World_worlds[var8].id) { // L: 3401
							var7 = World.World_worlds[var8]; // L: 3402
							break;
						}
					}

					if (var7 != null) { // L: 3406
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3407
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3408
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3409
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3410
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3411
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3412
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3415
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3416
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3417
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3418
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3419
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3420
					}

					return 1; // L: 3422
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3424
					Interpreter.Interpreter_intStackSize -= 4; // L: 3425
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3426
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3427
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3428
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 3429
					Varps.sortWorldList(var3, var10, var8, var6); // L: 3430
					return 1; // L: 3431
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) { // L: 3433
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3454
						followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3455
						return 1; // L: 3456
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3458
							Interpreter.Interpreter_intStackSize -= 2; // L: 3459
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3460
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3461
							var5 = AbstractArchive.getParamDefinition(var4); // L: 3462
							if (var5.isString()) { // L: 3463
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class90.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3464
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class90.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3467
							}

							return 1; // L: 3469
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3471
							Interpreter.Interpreter_intStackSize -= 2; // L: 3472
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3473
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3474
							var5 = AbstractArchive.getParamDefinition(var4); // L: 3475
							if (var5.isString()) { // L: 3476
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapAreaData.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3477
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapAreaData.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3480
							}

							return 1; // L: 3482
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3484
							Interpreter.Interpreter_intStackSize -= 2; // L: 3485
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3486
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3487
							var5 = AbstractArchive.getParamDefinition(var4); // L: 3488
							if (var5.isString()) { // L: 3489
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3490
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class281.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3493
							}

							return 1; // L: 3495
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3497
							Interpreter.Interpreter_intStackSize -= 2; // L: 3498
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3499
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3500
							var5 = AbstractArchive.getParamDefinition(var4); // L: 3501
							if (var5.isString()) { // L: 3502
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = FloorUnderlayDefinition.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3503
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FloorUnderlayDefinition.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3506
							}

							return 1; // L: 3508
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3510
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = onMobile ? 1 : 0; // L: 3511
							return 1; // L: 3512
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3514
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = clientType & 3; // L: 3515
							return 1; // L: 3516
						} else if (var0 == 6520) { // L: 3518
							return 1; // L: 3519
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3521
							return 1; // L: 3522
						} else if (var0 == 6522) { // L: 3524
							--Interpreter.Interpreter_stringStackSize; // L: 3525
							--Interpreter.Interpreter_intStackSize; // L: 3526
							return 1; // L: 3527
						} else if (var0 == 6523) { // L: 3529
							--Interpreter.Interpreter_stringStackSize; // L: 3530
							--Interpreter.Interpreter_intStackSize; // L: 3531
							return 1; // L: 3532
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) { // L: 3534
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3535
							return 1; // L: 3536
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) { // L: 3538
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3539
							return 1; // L: 3540
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) { // L: 3542
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3543
							return 1; // L: 3544
						} else if (var0 == 6527) { // L: 3546
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = field667; // L: 3547
							return 1; // L: 3548
						} else {
							return 2; // L: 3550
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3434
					if (var3 >= 0 && var3 < World.World_count) { // L: 3435
						var7 = World.World_worlds[var3]; // L: 3436
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3437
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3438
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3439
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3440
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3441
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3442
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3445
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3446
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3447
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3448
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3449
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3450
					}

					return 1; // L: 3452
				}
			}
		}
	}
}