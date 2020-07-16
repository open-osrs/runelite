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
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -729224767
	)
	static int field877;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 1674098753
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		longValue = -5166210462225322257L
	)
	static long field886;
	@ObfuscatedName("oo")
	static boolean[] field813;
	@ObfuscatedName("oa")
	static boolean[] field880;
	@ObfuscatedName("od")
	static boolean[] field879;
	@ObfuscatedName("no")
	static boolean field854;
	@ObfuscatedName("ne")
	static boolean field692;
	@ObfuscatedName("on")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -1861718839
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = -1473502491
	)
	public static int field942;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 1884992439
	)
	static int field866;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 1534043965
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("qi")
	static boolean field743;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 1952446261
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 2126591519
	)
	static int field852;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("widgetClickMasks")
	static NodeHashTable widgetClickMasks;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 152745331
	)
	static int field853;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1013553507
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("om")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("oc")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -1442407177
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("rg")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("rp")
	static boolean[] field918;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = 1213638029
	)
	static int field855;
	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	static final ApproximateRouteStrategy field905;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = 924656773
	)
	static int field856;
	@ObfuscatedName("os")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ok")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 1791790939
	)
	static int field950;
	@ObfuscatedName("nu")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ta")
	static int[] field947;
	@ObfuscatedName("tr")
	static int[] field948;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 652578349
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1228693343
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1173095783
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("nh")
	static int[] field859;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -912002373
	)
	static int field860;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 858415781
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -1223703005
	)
	@Export("musicVolume")
	static int musicVolume;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = 1354700181
	)
	@Export("areaSoundEffectVolume")
	static int areaSoundEffectVolume;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -600377077
	)
	static int field870;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ph")
	static long[] field892;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -662177847
	)
	static int field868;
	@ObfuscatedName("sl")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("playerAppearance")
	static PlayerAppearance playerAppearance;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -1024127287
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 898610375
	)
	static int field938;
	@ObfuscatedName("nr")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -842750463
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1471739451
	)
	static int field730;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1073959107
	)
	static int field943;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -683211221
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -624260701
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "[Ld;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -57175271
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 1814530167
	)
	@Export("soundEffectVolume")
	static int soundEffectVolume;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 1920180329
	)
	static int field818;
	@ObfuscatedName("nj")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = -392982617
	)
	static int field878;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1126917969
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("qf")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ru")
	static int[] field919;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 1696970787
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("ql")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rb")
	static int[] field775;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1292017341
	)
	static int field838;
	@ObfuscatedName("ry")
	static int[] field778;
	@ObfuscatedName("qz")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rv")
	static short field727;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 1435648883
	)
	static int field937;
	@ObfuscatedName("rf")
	static int[] field922;
	@ObfuscatedName("rw")
	static short field924;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		longValue = 5234729741765487197L
	)
	static long field897;
	@ObfuscatedName("rt")
	static short field685;
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "[Ldr;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("rj")
	static short field861;
	@ObfuscatedName("qv")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("rx")
	static short field928;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1878607171
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("rh")
	static short field927;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = -1349755447
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1045549837
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 262227823
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("pj")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -700106021
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pi")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = 1721264053
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "[Llz;"
	)
	@Export("mapIcons")
	static Sprite[] mapIcons;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -2094601857
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("rl")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("rm")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = 1224473793
	)
	static int field945;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1755181415
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1773187299
	)
	static int field894;
	@ObfuscatedName("pq")
	static int[] field896;
	@ObfuscatedName("pf")
	static int[] field920;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 793298193
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -394353337
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("mx")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	static NodeDeque field891;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	static NodeDeque field691;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -1554074511
	)
	static int field869;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -947743503
	)
	static int field835;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 378113837
	)
	static int field671;
	@ObfuscatedName("pn")
	static int[] field888;
	@ObfuscatedName("pg")
	static String field755;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfz;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("aj")
	static boolean field669;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 2001872587
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 807704553
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -341861453
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bd")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bb")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bn")
	static String field871;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -419209615
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bp")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -176982947
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ck")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1130810935
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		longValue = -4780591351762996103L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1372131715
	)
	static int field683;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 330959641
	)
	static int field684;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		longValue = 6700383244029833147L
	)
	static long field738;
	@ObfuscatedName("ca")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cm")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -883512619
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1769866173
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1512277987
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1664926141
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1602606573
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -738703837
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 378352399
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -867258703
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -954844719
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1526205263
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1037086785
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 174147835
	)
	static int field815;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -331323577
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -972927187
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1222807213
	)
	static int field705;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1645904359
	)
	static int field706;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -92180293
	)
	static int field675;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static class169 field708;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1015918785
	)
	@Export("port2")
	static int port2;
	@ObfuscatedName("ep")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fe")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "[Lcv;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = 2041291171
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fp")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -1459583387
	)
	static int field718;
	@ObfuscatedName("fk")
	static int[] field719;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 2002648973
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fu")
	static boolean field722;
	@ObfuscatedName("ff")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fl")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 416832453
	)
	static int field822;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -1691657031
	)
	static int field759;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -386652489
	)
	static int field690;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -498328781
	)
	static int field729;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1249993183
	)
	static int field809;
	@ObfuscatedName("gg")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gh")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gz")
	static final int[] field734;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -103852435
	)
	static int field747;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 26866095
	)
	static int field736;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 683906157
	)
	static int field737;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = 1193836409
	)
	static int field694;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -678810071
	)
	static int field739;
	@ObfuscatedName("he")
	static boolean field740;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = -708523843
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -1899320339
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = 1115448517
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 217664287
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = -1231248307
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = 1991000361
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -56491575
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 952453857
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 899099377
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 1234153475
	)
	static int field717;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 2036163559
	)
	static int field751;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 1474588135
	)
	static int field752;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -968086637
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 312783465
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -1503339861
	)
	static int field836;
	@ObfuscatedName("ig")
	static boolean field756;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -855755453
	)
	static int field757;
	@ObfuscatedName("il")
	static boolean field758;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = 457429091
	)
	static int field881;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1649830223
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -1008916691
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ie")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("iw")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ir")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ik")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iv")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ii")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("je")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jr")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("js")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 113367579
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -1896450279
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1282867815
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 601900271
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 1179562767
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 125020733
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -1956058299
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jx")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 1621281143
	)
	static int field808;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -886925517
	)
	static int field668;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -668604129
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -793315667
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 1962512569
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -952269611
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jb")
	static boolean field785;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 1160990691
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -713831637
	)
	static int field787;
	@ObfuscatedName("jk")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -2104761709
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1712399345
	)
	static int field791;
	@ObfuscatedName("ki")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1574229217
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 1638972327
	)
	static int field687;
	@ObfuscatedName("kt")
	static int[] field907;
	@ObfuscatedName("kj")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ke")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kv")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kw")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -1537500949
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[[[Ljp;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kn")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kz")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("kh")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1733687711
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("ly")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 1259358681
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lm")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lq")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lx")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("la")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lt")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("lf")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ln")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("le")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("lr")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("ld")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lo")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1495458891
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1150774747
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 1221803191
	)
	static int field824;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -173401255
	)
	static int field825;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 698992553
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ml")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 1315575895
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 1111856905
	)
	static int field830;
	@ObfuscatedName("mi")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mo")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -1547224129
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	Buffer field929;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	class9 field851;

	static {
		field669 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field683 = -1;
		field684 = -1;
		field738 = -1L;
		hadFocus = true;
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
		field815 = 0;
		js5Errors = 0;
		loginState = 0;
		field705 = 0;
		field706 = 0;
		field675 = 0;
		field708 = class169.field2024;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field718 = 0;
		field719 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		field722 = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field822 = 0;
		field759 = 1;
		field690 = 0;
		field729 = 1;
		field809 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field734 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field747 = 0;
		field736 = 2301979;
		field737 = 5063219;
		field694 = 3353893;
		field739 = 7759444;
		field740 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field717 = 0;
		field751 = 0;
		field752 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field836 = 0;
		field756 = false;
		field757 = 0;
		field758 = false;
		field881 = 0;
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
		field808 = 0;
		field668 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field785 = false;
		itemDragDuration = 0;
		field787 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field791 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field687 = 0;
		field907 = new int[1000];
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
		field824 = 0;
		field825 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field830 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field835 = 0;
		field671 = -1;
		chatEffects = 0;
		field838 = 0;
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
		field692 = false;
		field852 = -1;
		field853 = -1;
		field854 = false;
		field855 = -1;
		field856 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		field859 = new int[32];
		field860 = 0;
		changedItemContainers = new int[32];
		field878 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		chatCycle = 0;
		field866 = 0;
		field943 = 0;
		field818 = 0;
		field869 = 0;
		field870 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field891 = new NodeDeque();
		field691 = new NodeDeque();
		widgetClickMasks = new NodeHashTable(512);
		rootWidgetCount = 0;
		field877 = -2;
		field813 = new boolean[100];
		field879 = new boolean[100];
		field880 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field886 = 0L;
		isResizable = true;
		field888 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field755 = "";
		field892 = new long[100];
		field730 = 0;
		field894 = 0;
		field920 = new int[128];
		field896 = new int[128];
		field897 = -1L;
		field937 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new Sprite[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		musicVolume = 255;
		currentTrackGroupId = -1;
		field743 = false;
		soundEffectVolume = 127;
		areaSoundEffectVolume = 127;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field918 = new boolean[5];
		field919 = new int[5];
		field775 = new int[5];
		field778 = new int[5];
		field922 = new int[5];
		field727 = 256;
		field924 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field927 = 1;
		field928 = 32767;
		field685 = 1;
		field861 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerAppearance();
		field868 = -1;
		field938 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field942 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field945 = 0;
		field905 = new ApproximateRouteStrategy();
		field947 = new int[50];
		field948 = new int[50];
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1805213007"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field886 = MilliClock.currentTimeMillis() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "108465933"
	)
	@Export("setUp")
	protected final void setUp() {
		class277.method5157(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		class90.port1 = gameBuild == 0 ? 43594 : worldId + 40000;
		port2 = gameBuild == 0 ? 443 : worldId + 50000;
		WorldMapLabel.port3 = class90.port1;
		PlayerAppearance.field2574 = class224.field2579;
		PlayerAppearance.field2575 = class224.field2580;
		PlayerAppearance.field2569 = class224.field2584;
		Messages.field1308 = class224.field2582;
		WorldMapLabelSize.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		class7.mouseWheel = this.mouseWheel();
		FloorUnderlayDefinition.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = GameShell.getPreferencesFile("", GrandExchangeOfferWorldComparator.field54.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		NetSocket.clientPreferences = var3;
		this.setUpClipboard();
		TaskHandler.method3606(this, TileItemPile.null_string);
		if (gameBuild != 0) {
			displayFps = true;
		}

		ScriptEvent.setWindowedMode(NetSocket.clientPreferences.windowMode);
		ModeWhere.friendSystem = new FriendSystem(class195.loginType);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "202919973"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class195.method3749();

		int var1;
		try {
			if (class206.field2439 == 1) {
				var1 = WorldMapSprite.midiPcmStream.method3837();
				if (var1 > 0 && WorldMapSprite.midiPcmStream.isReady()) {
					var1 -= class206.field2442;
					if (var1 < 0) {
						var1 = 0;
					}

					WorldMapSprite.midiPcmStream.setPcmStreamVolume(var1);
				} else {
					WorldMapSprite.midiPcmStream.clear();
					WorldMapSprite.midiPcmStream.removeAll();
					if (Huffman.musicTrackArchive != null) {
						class206.field2439 = 2;
					} else {
						class206.field2439 = 0;
					}

					DevicePcmPlayerProvider.musicTrack = null;
					Clock.soundCache = null;
				}
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			WorldMapSprite.midiPcmStream.clear();
			class206.field2439 = 0;
			DevicePcmPlayerProvider.musicTrack = null;
			Clock.soundCache = null;
			Huffman.musicTrackArchive = null;
		}

		Timer.playPcmPlayers();
		MidiPcmStream.method3918();
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}

		if (class7.mouseWheel != null) {
			var1 = class7.mouseWheel.useRotation();
			mouseWheelRotation = var1;
		}

		if (gameState == 0) {
			HealthBar.load();
			MidiPcmStream.method3905();
		} else if (gameState == 5) {
			GrandExchangeEvent.doCycleTitle(this);
			HealthBar.load();
			FriendLoginUpdate.clock.mark();

			for (var1 = 0; var1 < 32; ++var1) {
				GameShell.graphicsTickTimes[var1] = 0L;
			}

			for (var1 = 0; var1 < 32; ++var1) {
				GameShell.clientTickTimes[var1] = 0L;
			}

			GameShell.gameCyclesToDo = 0;
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				GrandExchangeEvent.doCycleTitle(this);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				class23.method229();
			}
		} else {
			GrandExchangeEvent.doCycleTitle(this);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "255"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label165: {
			try {
				if (class206.field2439 == 2) {
					if (DevicePcmPlayerProvider.musicTrack == null) {
						DevicePcmPlayerProvider.musicTrack = MusicTrack.readTrack(Huffman.musicTrackArchive, class206.musicTrackGroupId, MilliClock.musicTrackFileId);
						if (DevicePcmPlayerProvider.musicTrack == null) {
							var2 = false;
							break label165;
						}
					}

					if (Clock.soundCache == null) {
						Clock.soundCache = new SoundCache(class206.soundEffectsArchive, class206.musicSamplesArchive);
					}

					if (WorldMapSprite.midiPcmStream.loadMusicTrack(DevicePcmPlayerProvider.musicTrack, class206.musicPatchesArchive, Clock.soundCache, 22050)) {
						WorldMapSprite.midiPcmStream.clearAll();
						WorldMapSprite.midiPcmStream.setPcmStreamVolume(class206.musicTrackVolume);
						WorldMapSprite.midiPcmStream.setMusicTrack(DevicePcmPlayerProvider.musicTrack, class336.musicTrackBoolean);
						class206.field2439 = 0;
						DevicePcmPlayerProvider.musicTrack = null;
						Clock.soundCache = null;
						Huffman.musicTrackArchive = null;
						var2 = true;
						break label165;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				WorldMapSprite.midiPcmStream.clear();
				class206.field2439 = 0;
				DevicePcmPlayerProvider.musicTrack = null;
				Clock.soundCache = null;
				Huffman.musicTrackArchive = null;
			}

			var2 = false;
		}

		if (var2 && field743 && class2.pcmPlayer0 != null) {
			class2.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field886 && MilliClock.currentTimeMillis() > field886) {
			ScriptEvent.setWindowedMode(class58.getWindowedMode());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field813[var4] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			World.drawTitle(GrandExchangeOfferNameComparator.fontBold12, WorldMapLabel.fontPlain11, MusicPatchNode2.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				World.drawTitle(GrandExchangeOfferNameComparator.fontBold12, WorldMapLabel.fontPlain11, MusicPatchNode2.fontPlain12);
			} else if (gameState == 25) {
				if (field809 == 1) {
					if (field822 > field759) {
						field759 = field822;
					}

					var4 = (field759 * 50 - field822 * 50) / field759;
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else if (field809 == 2) {
					if (field690 > field729) {
						field729 = field690;
					}

					var4 = (field729 * 50 - field690 * 50) / field729 + 50;
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else {
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				ArchiveDiskActionHandler.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				ArchiveDiskActionHandler.drawLoadingMessage("Please wait...", false);
			}
		} else {
			World.drawTitle(GrandExchangeOfferNameComparator.fontBold12, WorldMapLabel.fontPlain11, MusicPatchNode2.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field879[var4]) {
					ArchiveLoader.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field879[var4] = false;
				}
			}
		} else if (gameState > 0) {
			ArchiveLoader.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field879[var4] = false;
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1432958229"
	)
	@Export("kill0")
	protected final void kill0() {
		if (AttackOption.varcs.hasUnwrittenChanges()) {
			AttackOption.varcs.write();
		}

		if (class219.mouseRecorder != null) {
			class219.mouseRecorder.isRunning = false;
		}

		class219.mouseRecorder = null;
		packetWriter.close();
		TilePaint.method3186();
		UserComparator9.method3509();
		class7.mouseWheel = null;
		if (class2.pcmPlayer0 != null) {
			class2.pcmPlayer0.shutdown();
		}

		if (class58.pcmPlayer1 != null) {
			class58.pcmPlayer1.shutdown();
		}

		WorldMapSectionType.method312();
		AbstractWorldMapIcon.method687();
		if (WorldMapLabelSize.urlRequester != null) {
			WorldMapLabelSize.urlRequester.close();
			WorldMapLabelSize.urlRequester = null;
		}

		SoundSystem.method2629();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-453140820"
	)
	protected final void vmethod1570() {
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 19; ++var1) {
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
							UserComparator9.clientLanguage = Language.Language_get(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.LIVE, GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.RC};
							GameBuild[] var6 = var5;
							int var7 = 0;

							GameBuild var3;
							while (true) {
								if (var7 >= var6.length) {
									var3 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var3 = var8;
									break;
								}

								++var7;
							}

							PlayerType.field3130 = var3;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							field871 = var2;
							break;
						case 10:
							GrandExchangeOfferWorldComparator.field54 = (StudioGame)FaceNormal.findEnumerated(Skills.method4272(), Integer.parseInt(var2));
							if (StudioGame.oldscape == GrandExchangeOfferWorldComparator.field54) {
								class195.loginType = LoginType.oldscape;
							} else {
								class195.loginType = LoginType.field4059;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							class228.field2754 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							HorizontalAlignment.worldListURL = var2;
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class169.worldHost = this.getCodeBase().getHost();
				String var9 = PlayerType.field3130.name;
				byte var10 = 0;

				try {
					HealthBar.method2137("oldschool", var9, var10, 21);
				} catch (Exception var11) {
					class197.RunException_sendStackTrace((String)null, var11);
				}

				WorldMapSectionType.client = this;
				RunException.clientType = clientType;
				this.startThread(765, 503, 190);
			}
		} catch (RuntimeException var12) {
			throw class1.newRunException(var12, "client.init(" + ')');
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = MilliClock.currentTimeMillis();
			int var4 = (int)(var2 - FriendSystem.field1093);
			FriendSystem.field1093 = var2;
			if (var4 > 200) {
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
				var1 = true;
			} else if (NetCache.NetCache_socket == null) {
				var1 = false;
			} else {
				try {
					label240: {
						if (NetCache.NetCache_loadTime > 30000) {
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
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
							var6 = new Buffer(4);
							var6.writeByte(0);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							var5.removeDual();
							NetCache.NetCache_pendingResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingWritesCount;
							++NetCache.NetCache_pendingResponsesCount;
						}

						for (int var17 = 0; var17 < 100; ++var17) {
							int var18 = NetCache.NetCache_socket.available();
							if (var18 < 0) {
								throw new IOException();
							}

							if (var18 == 0) {
								break;
							}

							NetCache.NetCache_loadTime = 0;
							byte var7 = 0;
							if (PlayerType.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3214 == 0) {
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field3213 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3213;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (PlayerType.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									NetCache.field3208 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										NetCache.field3208 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									PlayerType.NetCache_currentResponse = var15;
									CollisionMap.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + PlayerType.NetCache_currentResponse.padding);
									CollisionMap.NetCache_responseArchiveBuffer.writeByte(var11);
									CollisionMap.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3214 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3214 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field3214 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										PlayerType.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = CollisionMap.NetCache_responseArchiveBuffer.array.length - PlayerType.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3214;
								if (var9 > var8 - CollisionMap.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - CollisionMap.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(CollisionMap.NetCache_responseArchiveBuffer.array, CollisionMap.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3213 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = CollisionMap.NetCache_responseArchiveBuffer.array;
										var10001 = CollisionMap.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3213;
									}
								}

								var25 = CollisionMap.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field3214 += var9;
								if (var8 == CollisionMap.NetCache_responseArchiveBuffer.offset) {
									if (16711935L == PlayerType.NetCache_currentResponse.key) {
										UserComparator9.NetCache_reference = CollisionMap.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												UserComparator9.NetCache_reference.offset = var10 * 8 + 5;
												var12 = UserComparator9.NetCache_reference.readInt();
												int var20 = UserComparator9.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(CollisionMap.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != PlayerType.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3213 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label240;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										PlayerType.NetCache_currentResponse.archive.write((int)(PlayerType.NetCache_currentResponse.key & 65535L), CollisionMap.NetCache_responseArchiveBuffer.array, 16711680L == (PlayerType.NetCache_currentResponse.key & 16711680L), NetCache.field3208);
									}

									PlayerType.NetCache_currentResponse.remove();
									if (NetCache.field3208) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3214 = 0;
									PlayerType.NetCache_currentResponse = null;
									CollisionMap.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3214 != 512) {
										break;
									}

									NetCache.field3214 = 0;
								}
							}
						}

						var1 = true;
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var22) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
					var1 = false;
				}
			}

			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
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

				field815 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field815 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						js5SocketTask = GrandExchangeOfferAgeComparator.taskHandler.newSocketTask(class169.worldHost, WorldMapLabel.port3);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							GameObject.js5Socket = ClanChat.method5441((Socket)js5SocketTask.result, 40000, 5000);
						} else {
							GameObject.js5Socket = new NetSocket((Socket)js5SocketTask.result, GrandExchangeOfferAgeComparator.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(190);
						GameObject.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						WorldMapSprite.field261 = MilliClock.currentTimeMillis();
					}

					if (js5ConnectState == 3) {
						if (GameObject.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var5 = GameObject.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if (MilliClock.currentTimeMillis() - WorldMapSprite.field261 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var10 = GameObject.js5Socket;
						boolean var2 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var8) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var10;
						class41.method624(var2);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						PlayerType.NetCache_currentResponse = null;
						CollisionMap.NetCache_responseArchiveBuffer = null;
						NetCache.field3214 = 0;

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
							if (var3 == null) {
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
									if (var3 == null) {
										if (NetCache.field3213 != 0) {
											try {
												Buffer var11 = new Buffer(4);
												var11.writeByte(4);
												var11.writeByte(NetCache.field3213);
												var11.writeShort(0);
												NetCache.NetCache_socket.write(var11.array, 0, 4);
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close();
												} catch (Exception var6) {
												}

												++NetCache.NetCache_ioExceptions;
												NetCache.NetCache_socket = null;
											}
										}

										NetCache.NetCache_loadTime = 0;
										FriendSystem.field1093 = MilliClock.currentTimeMillis();
										js5SocketTask = null;
										GameObject.js5Socket = null;
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

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		js5SocketTask = null;
		GameObject.js5Socket = null;
		js5ConnectState = 0;
		if (WorldMapLabel.port3 == class90.port1) {
			WorldMapLabel.port3 = port2;
		} else {
			WorldMapLabel.port3 = class90.port1;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				gameState = 1000;
			} else {
				field815 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			gameState = 1000;
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				gameState = 1000;
			} else {
				field815 = 3000;
			}
		}

	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "599725078"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (ChatChannel.secureRandom == null && (secureRandomFuture.isDone() || field705 > 250)) {
					ChatChannel.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (ChatChannel.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					ArchiveLoader.socketTask = null;
					field722 = false;
					field705 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (ArchiveLoader.socketTask == null) {
					ArchiveLoader.socketTask = GrandExchangeOfferAgeComparator.taskHandler.newSocketTask(class169.worldHost, WorldMapLabel.port3);
				}

				if (ArchiveLoader.socketTask.status == 2) {
					throw new IOException();
				}

				if (ArchiveLoader.socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = ClanChat.method5441((Socket)ArchiveLoader.socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)ArchiveLoader.socketTask.result, GrandExchangeOfferAgeComparator.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					ArchiveLoader.socketTask = null;
					loginState = 2;
				}
			}

			PacketBufferNode var3;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var3 = Tile.method2990();
				var3.packetBuffer.writeByte(LoginPacket.field2352.id);
				packetWriter.addNode(var3);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			int var4;
			boolean var13;
			if (loginState == 3) {
				if (class2.pcmPlayer0 != null) {
					class2.pcmPlayer0.method2560();
				}

				if (class58.pcmPlayer1 != null) {
					class58.pcmPlayer1.method2560();
				}

				var13 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var13 = false;
				}

				if (var13) {
					var4 = ((AbstractSocket)var1).readUnsignedByte();
					if (class2.pcmPlayer0 != null) {
						class2.pcmPlayer0.method2560();
					}

					if (class58.pcmPlayer1 != null) {
						class58.pcmPlayer1.method2560();
					}

					if (var4 != 0) {
						class22.getLoginError(var4);
						return;
					}

					var2.offset = 0;
					loginState = 4;
				}
			}

			int var32;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var32 = ((AbstractSocket)var1).available();
					if (var32 > 8 - var2.offset) {
						var32 = 8 - var2.offset;
					}

					if (var32 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var32);
						var2.offset += var32;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					MilliClock.field2046 = var2.readLong();
					loginState = 5;
				}
			}

			int var6;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var23 = new PacketBuffer(500);
				int[] var14 = new int[]{ChatChannel.secureRandom.nextInt(), ChatChannel.secureRandom.nextInt(), ChatChannel.secureRandom.nextInt(), ChatChannel.secureRandom.nextInt()};
				var23.offset = 0;
				var23.writeByte(1);
				var23.writeInt(var14[0]);
				var23.writeInt(var14[1]);
				var23.writeInt(var14[2]);
				var23.writeInt(var14[3]);
				var23.writeLong(MilliClock.field2046);
				if (gameState == 40) {
					var23.writeInt(class7.field28[0]);
					var23.writeInt(class7.field28[1]);
					var23.writeInt(class7.field28[2]);
					var23.writeInt(class7.field28[3]);
				} else {
					var23.writeByte(field708.rsOrdinal());
					switch(field708.field2026) {
					case 0:
						var23.writeInt((Integer)NetSocket.clientPreferences.parameters.get(WorldMapAreaData.method759(Login.Login_username)));
						break;
					case 1:
					case 3:
						var23.writeMedium(WorldMapSprite.field264);
						++var23.offset;
						break;
					case 2:
						var23.offset += 4;
					}

					var23.writeByte(class322.field3841.rsOrdinal());
					var23.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var23.encryptRsa(class92.field1188, class92.field1189);
				class7.field28 = var14;
				PacketBufferNode var5 = Tile.method2990();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field2348.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2347.id);
				}

				var5.packetBuffer.writeShort(0);
				var6 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(190);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeBytes(var23.array, 0, var23.offset);
				int var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(Varcs.canvasWidth);
				var5.packetBuffer.writeShort(class52.canvasHeight);
				PacketBuffer var8 = var5.packetBuffer;
				int var11;
				if (randomDatData != null) {
					var8.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var10);

						for (var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
						}

						if (var11 >= 24) {
							throw new IOException();
						}
					} catch (Exception var21) {
						for (int var12 = 0; var12 < 24; ++var12) {
							var10[var12] = -1;
						}
					}

					var8.writeBytes(var10, 0, var10.length);
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(field871);
				var5.packetBuffer.writeInt(class228.field2754);
				Buffer var9 = new Buffer(class13.platformInfo.size());
				class13.platformInfo.write(var9);
				var5.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.method5764(UserComparator7.archive6.hash);
				var5.packetBuffer.method5762(Clock.archive2.hash);
				var5.packetBuffer.writeShortLE(WorldMapData_0.archive11.hash);
				var5.packetBuffer.method5764(Projectile.archive7.hash);
				var5.packetBuffer.writeShortLE(GrandExchangeEvent.archive8.hash);
				var5.packetBuffer.writeShortLE(Message.archive12.hash);
				var5.packetBuffer.method5764(WorldMapData_0.archive19.hash);
				var5.packetBuffer.method5762(GameBuild.archive13.hash);
				var5.packetBuffer.writeShortLE(VarcInt.archive18.hash);
				var5.packetBuffer.method5764(WorldMapIcon_1.archive14.hash);
				var5.packetBuffer.method5762(AbstractWorldMapIcon.archive17.hash);
				var5.packetBuffer.writeShortLE(Tile.archive9.hash);
				var5.packetBuffer.method5762(WorldMapRectangle.archive5.hash);
				var5.packetBuffer.writeShortLE(Message.archive1.hash);
				var5.packetBuffer.method5762(ClientPacket.archive20.hash);
				var5.packetBuffer.method5762(0);
				var5.packetBuffer.writeInt(WorldMapLabel.archive15.hash);
				var5.packetBuffer.method5762(GraphicsObject.archive10.hash);
				var5.packetBuffer.method5762(class105.archive3.hash);
				var5.packetBuffer.writeInt(GrandExchangeOffer.archive4.hash);
				var5.packetBuffer.method5762(MilliClock.archive0.hash);
				var5.packetBuffer.xteaEncrypt(var14, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var14);
				int[] var31 = new int[4];

				for (var11 = 0; var11 < 4; ++var11) {
					var31[var11] = var14[var11] + 50;
				}

				var2.newIsaacCipher(var31);
				loginState = 6;
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var32 = ((AbstractSocket)var1).readUnsignedByte();
				if (var32 == 21 && gameState == 20) {
					loginState = 12;
				} else if (var32 == 2) {
					loginState = 14;
				} else if (var32 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					loginState = 19;
				} else if (var32 == 64) {
					loginState = 10;
				} else if (var32 == 23 && field706 < 1) {
					++field706;
					loginState = 0;
				} else if (var32 == 29) {
					loginState = 17;
				} else {
					if (var32 != 69) {
						class22.getLoginError(var32);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				WorldMapSectionType.field174 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= WorldMapSectionType.field174) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, WorldMapSectionType.field174);
				class7 var24 = class3.method41()[var2.readUnsignedByte()];

				try {
					switch(var24.field26) {
					case 0:
						class5 var33 = new class5();
						this.field851 = new class9(var2, var33);
						loginState = 9;
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var20) {
					class22.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field851.method106()) {
				this.field929 = this.field851.method108();
				this.field851.method107();
				this.field851 = null;
				if (this.field929 == null) {
					class22.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var3 = Tile.method2990();
				var3.packetBuffer.writeByte(LoginPacket.field2345.id);
				var3.packetBuffer.writeShort(this.field929.offset);
				var3.packetBuffer.method5711(this.field929);
				packetWriter.addNode(var3);
				packetWriter.flush();
				this.field929 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				WorldMapDecoration.field238 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= WorldMapDecoration.field238) {
				((AbstractSocket)var1).read(var2.array, 0, WorldMapDecoration.field238);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field675 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field705 = 0;
				MusicPatchPcmStream.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field675 / 60 + " seconds.");
				if (--field675 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					WorldMapSprite.field254 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				int var16;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= WorldMapSprite.field254) {
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var25 = false;
					if (var13) {
						var4 = var2.readByteIsaac() << 24;
						var4 |= var2.readByteIsaac() << 16;
						var4 |= var2.readByteIsaac() << 8;
						var4 |= var2.readByteIsaac();
						var16 = WorldMapAreaData.method759(Login.Login_username);
						if (NetSocket.clientPreferences.parameters.size() >= 10 && !NetSocket.clientPreferences.parameters.containsKey(var16)) {
							Iterator var17 = NetSocket.clientPreferences.parameters.entrySet().iterator();
							var17.next();
							var17.remove();
						}

						NetSocket.clientPreferences.parameters.put(var16, var4);
					}

					if (Login_isUsernameRemembered) {
						NetSocket.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						NetSocket.clientPreferences.rememberedUsername = null;
					}

					SpriteMask.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field791 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var28 = StructDefinition.ServerPacket_values();
					var6 = var2.readSmartByteShortIsaac();
					if (var6 < 0 || var6 >= var28.length) {
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var28[var6];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var18 = WorldMapSectionType.client;
						JSObject.getWindow(var18).call("zap", (Object[])null);
					} catch (Throwable var19) {
					}

					loginState = 16;
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5178();
						mouseLastLastPressedTimeMillis = -1L;
						class219.mouseRecorder.index = 0;
						WorldMapArea.hasFocus = true;
						hadFocus = true;
						field897 = -1L;
						class90.method2164();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1350 = null;
						packetWriter.field1351 = null;
						packetWriter.field1342 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1348 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						menuOptionsCount = 0;
						isMenuOpen = false;
						MouseHandler.MouseHandler_idleCycles = 0;
						LoginScreenAnimation.method1906();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						class278.field3585 = null;
						minimapState = 0;
						field937 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						NPC.method2156();

						for (var32 = 0; var32 < 2048; ++var32) {
							players[var32] = null;
						}

						for (var32 = 0; var32 < 32768; ++var32) {
							npcs[var32] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var32 = 0; var32 < 4; ++var32) {
							for (var4 = 0; var4 < 104; ++var4) {
								for (var16 = 0; var16 < 104; ++var16) {
									groundItems[var32][var4][var16] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						ModeWhere.friendSystem.clear();

						for (var32 = 0; var32 < VarpDefinition.VarpDefinition_fileCount; ++var32) {
							VarpDefinition var36 = class219.VarpDefinition_get(var32);
							if (var36 != null) {
								Varps.Varps_temp[var32] = 0;
								Varps.Varps_main[var32] = 0;
							}
						}

						AttackOption.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							Tiles.method1200(rootInterface);
						}

						for (InterfaceParent var27 = (InterfaceParent)interfaceParents.first(); var27 != null; var27 = (InterfaceParent)interfaceParents.next()) {
							class41.closeInterface(var27, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						menuOptionsCount = 0;
						isMenuOpen = false;
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var32 = 0; var32 < 8; ++var32) {
							playerMenuActions[var32] = null;
							playerOptionsPriorities[var32] = false;
						}

						ItemContainer.itemContainers = new NodeHashTable(32);
						isLoading = true;

						for (var32 = 0; var32 < 100; ++var32) {
							field813[var32] = true;
						}

						var3 = UserComparator4.getPacketBufferNode(ClientPacket.field2279, packetWriter.isaacCipher);
						var3.packetBuffer.writeByte(class58.getWindowedMode());
						var3.packetBuffer.writeShort(Varcs.canvasWidth);
						var3.packetBuffer.writeShort(class52.canvasHeight);
						packetWriter.addNode(var3);
						ClientPreferences.clanChat = null;

						for (var32 = 0; var32 < 8; ++var32) {
							grandExchangeOffers[var32] = new GrandExchangeOffer();
						}

						WorldMapIcon_0.grandExchangeEvents = null;
						HitSplatDefinition.updatePlayer(var2);
						WorldMapCacheName.field328 = -1;
						class8.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						WorldMapLabelSize.field134 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= WorldMapLabelSize.field134) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, WorldMapLabelSize.field134);
						var2.offset = 0;
						String var26 = var2.readStringCp1252NullTerminated();
						String var34 = var2.readStringCp1252NullTerminated();
						String var29 = var2.readStringCp1252NullTerminated();
						MusicPatchPcmStream.setLoginResponseString(var26, var34, var29);
						ClientPreferences.updateGameState(10);
					}

					if (loginState != 19) {
						++field705;
						if (field705 > 2000) {
							if (field706 < 1) {
								if (WorldMapLabel.port3 == class90.port1) {
									WorldMapLabel.port3 = port2;
								} else {
									WorldMapLabel.port3 = class90.port1;
								}

								++field706;
								loginState = 0;
							} else {
								class22.getLoginError(-3);
							}
						}
					} else {
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
							var32 = packetWriter.serverPacketLength;
							timer.method5166();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1350 = null;
							packetWriter.field1351 = null;
							packetWriter.field1342 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1348 = 0;
							rebootTimer = 0;
							menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;

							for (var4 = 0; var4 < 2048; ++var4) {
								players[var4] = null;
							}

							class60.localPlayer = null;

							for (var4 = 0; var4 < npcs.length; ++var4) {
								NPC var30 = npcs[var4];
								if (var30 != null) {
									var30.targetIndex = -1;
									var30.false0 = false;
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32);
							ClientPreferences.updateGameState(30);

							for (var4 = 0; var4 < 100; ++var4) {
								field813[var4] = true;
							}

							PacketBufferNode var35 = UserComparator4.getPacketBufferNode(ClientPacket.field2279, packetWriter.isaacCipher);
							var35.packetBuffer.writeByte(class58.getWindowedMode());
							var35.packetBuffer.writeShort(Varcs.canvasWidth);
							var35.packetBuffer.writeShort(class52.canvasHeight);
							packetWriter.addNode(var35);
							HitSplatDefinition.updatePlayer(var2);
							if (var32 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var22) {
			if (field706 < 1) {
				if (WorldMapLabel.port3 == class90.port1) {
					WorldMapLabel.port3 = port2;
				} else {
					WorldMapLabel.port3 = class90.port1;
				}

				++field706;
				loginState = 0;
			} else {
				class22.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-873982601"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (field722) {
			field722 = false;
			CollisionMap.method3707();
		} else {
			if (!isMenuOpen) {
				FontName.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1768(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (MusicPatchNode.method3966()) {
					var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2286, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					TriBool.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (timer.field3618) {
					var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2310, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method5165();
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
				PacketBuffer var10000;
				synchronized(class219.mouseRecorder.lock) {
					if (!field669) {
						class219.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class219.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < class219.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = class219.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = class219.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field683 || var8 != field684) {
								if (var15 == null) {
									var15 = UserComparator4.getPacketBufferNode(ClientPacket.field2253, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (field738 != -1L) {
									var10 = var9 - field683;
									var11 = var8 - field684;
									var12 = (int)((class219.mouseRecorder.millis[var7] - field738) / 20L);
									var5 = (int)((long)var5 + (class219.mouseRecorder.millis[var7] - field738) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field683 = var9;
								field684 = var8;
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
									var15.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field738 = class219.mouseRecorder.millis[var7];
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

						if (var4 >= class219.mouseRecorder.index) {
							class219.mouseRecorder.index = 0;
						} else {
							MouseRecorder var44 = class219.mouseRecorder;
							var44.index -= var4;
							System.arraycopy(class219.mouseRecorder.xs, var4, class219.mouseRecorder.xs, 0, class219.mouseRecorder.index);
							System.arraycopy(class219.mouseRecorder.ys, var4, class219.mouseRecorder.ys, 0, class219.mouseRecorder.index);
							System.arraycopy(class219.mouseRecorder.millis, var4, class219.mouseRecorder.millis, 0, class219.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !ArchiveLoader.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class52.canvasHeight) {
						var3 = class52.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > Varcs.canvasWidth) {
						var4 = Varcs.canvasWidth;
					}

					var5 = (int)var16;
					var18 = UserComparator4.getPacketBufferNode(ClientPacket.field2244, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (KeyHandler.field425 > 0) {
					var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2330, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = MilliClock.currentTimeMillis();

					for (var5 = 0; var5 < KeyHandler.field425; ++var5) {
						long var21 = var19 - field897;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}

						field897 = var19;
						var14.packetBuffer.writeIntME(KeyHandler.field429[var5]);
						var14.packetBuffer.method5798((int)var21);
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (field757 > 0) {
					--field757;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field758 = true;
				}

				if (field758 && field757 <= 0) {
					field757 = 20;
					field758 = false;
					var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2258, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(camAngleY);
					var14.packetBuffer.writeShort(camAngleX);
					packetWriter.addNode(var14);
				}

				if (WorldMapArea.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2290, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}

				if (!WorldMapArea.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2290, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}

				if (class228.worldMap != null) {
					class228.worldMap.method6696();
				}

				if (class4.ClanChat_inClanChat) {
					if (ClientPreferences.clanChat != null) {
						ClientPreferences.clanChat.sort();
					}

					class7.FriendSystem_invalidateFriends();
					class4.ClanChat_inClanChat = false;
				}

				JagexCache.method3625();
				if (gameState == 30) {
					Frames.method3396();

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var35 = soundEffects[var1];
							if (var35 == null) {
								var10000 = null;
								var35 = SoundEffect.readSoundEffect(GrandExchangeOffer.archive4, soundEffectIds[var1], 0);
								if (var35 == null) {
									continue;
								}

								int[] var45 = queuedSoundEffectDelays;
								var45[var1] += var35.calculateDelay();
								soundEffects[var1] = var35;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = var5 * 128 + 64 - class60.localPlayer.x;
									if (var6 < 0) {
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255;
									var8 = var7 * 128 + 64 - class60.localPlayer.y;
									if (var8 < 0) {
										var8 = -var8;
									}

									var9 = var6 + var8 - 128;
									if (var9 > var4) {
										queuedSoundEffectDelays[var1] = -100;
										continue;
									}

									if (var9 < 0) {
										var9 = 0;
									}

									var3 = (var4 - var9) * areaSoundEffectVolume / var4;
								} else {
									var3 = soundEffectVolume;
								}

								if (var3 > 0) {
									RawSound var23 = var35.toRawSound().resample(class197.decimator);
									RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
									var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									class60.pcmStreamMixer.addSubStream(var24);
								}

								queuedSoundEffectDelays[var1] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var1; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
							}

							--var1;
						}
					}

					if (field743 && !WorldMapLabelSize.method251()) {
						if (musicVolume != 0 && currentTrackGroupId != -1) {
							UserComparator9.method3513(UserComparator7.archive6, currentTrackGroupId, 0, musicVolume, false);
						}

						field743 = false;
					}

					++packetWriter.field1348;
					if (packetWriter.field1348 > 750) {
						CollisionMap.method3707();
					} else {
						TileItem.method2260();
						class247.method4496();
						class3.method33();
						++field747;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (class194.field2356 != null) {
							++field808;
							if (field808 >= 15) {
								class234.invalidateWidget(class194.field2356);
								class194.field2356 = null;
							}
						}

						Widget var34 = WorldMapSection1.mousedOverWidgetIf1;
						Widget var36 = SecureRandomCallable.field542;
						WorldMapSection1.mousedOverWidgetIf1 = null;
						SecureRandomCallable.field542 = null;
						draggedOnWidget = null;
						field854 = false;
						field692 = false;
						field894 = 0;

						while (WorldMapManager.isKeyDown() && field894 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && SecureRandomCallable.field546 == 66) {
								String var39 = "";

								Message var37;
								for (Iterator var41 = Messages.Messages_hashTable.iterator(); var41.hasNext(); var39 = var39 + var37.sender + ':' + var37.text + '\n') {
									var37 = (Message)var41.next();
								}

								WorldMapSectionType.client.clipboardSetString(var39);
							} else if (oculusOrbState != 1 || class58.field442 <= 0) {
								field896[field894] = SecureRandomCallable.field546;
								field920[field894] = class58.field442;
								++field894;
							}
						}

						boolean var30 = staffModLevel >= 2;
						if (var30 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = class60.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class60.localPlayer.plane) {
								GrandExchangeOffer.method191(class60.localPlayer.pathX[0] + class182.baseX, class60.localPlayer.pathY[0] + SecureRandomFuture.baseY, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							MusicPatchNode.updateRootInterface(rootInterface, 0, 0, Varcs.canvasWidth, class52.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var38;
							ScriptEvent var40;
							Widget var42;
							do {
								var40 = (ScriptEvent)field891.removeLast();
								if (var40 == null) {
									while (true) {
										do {
											var40 = (ScriptEvent)field691.removeLast();
											if (var40 == null) {
												while (true) {
													do {
														var40 = (ScriptEvent)scriptEvents.removeLast();
														if (var40 == null) {
															this.menu();
															if (class228.worldMap != null) {
																class228.worldMap.method6532(TileItemPile.Client_plane, (class60.localPlayer.x >> 7) + class182.baseX, (class60.localPlayer.y >> 7) + SecureRandomFuture.baseY, false);
																class228.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1372();
															}

															if (KeyHandler.dragInventoryWidget != null) {
																class234.invalidateWidget(KeyHandler.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field785) {
																		if (KeyHandler.dragInventoryWidget == TaskHandler.field2066 && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var43 = KeyHandler.dragInventoryWidget;
																			byte var31 = 0;
																			if (field838 == 1 && var43.contentType == 206) {
																				var31 = 1;
																			}

																			if (var43.itemIds[dragItemSlotDestination] <= 0) {
																				var31 = 0;
																			}

																			if (Projectile.method2249(KeyHandler.getWidgetClickMask(var43))) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				var43.itemIds[var7] = var43.itemIds[var6];
																				var43.itemQuantities[var7] = var43.itemQuantities[var6];
																				var43.itemIds[var6] = -1;
																				var43.itemQuantities[var6] = 0;
																			} else if (var31 == 1) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;

																				while (var7 != var6) {
																					if (var6 > var7) {
																						var43.swapItems(var6 - 1, var6);
																						--var6;
																					} else if (var6 < var7) {
																						var43.swapItems(var6 + 1, var6);
																						++var6;
																					}
																				}
																			} else {
																				var43.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var18 = UserComparator4.getPacketBufferNode(ClientPacket.field2256, packetWriter.isaacCipher);
																			var18.packetBuffer.method5837(var31);
																			var18.packetBuffer.writeInt(KeyHandler.dragInventoryWidget.id);
																			var18.packetBuffer.method5898(dragItemSlotDestination);
																			var18.packetBuffer.method5898(dragItemSlotSource);
																			packetWriter.addNode(var18);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		GrandExchangeOffer.method189(draggedWidgetX, draggedWidgetY);
																	}

																	field808 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	KeyHandler.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field785 = true;
																}
															}

															if (Scene.method3230()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var18 = UserComparator4.getPacketBufferNode(ClientPacket.field2311, packetWriter.isaacCipher);
																var18.packetBuffer.writeByte(5);
																var18.packetBuffer.writeShort(var5 + SecureRandomFuture.baseY);
																var18.packetBuffer.writeShort(var4 + class182.baseX);
																var18.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																packetWriter.addNode(var18);
																Scene.method3346();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var34 != WorldMapSection1.mousedOverWidgetIf1) {
																if (var34 != null) {
																	class234.invalidateWidget(var34);
																}

																if (WorldMapSection1.mousedOverWidgetIf1 != null) {
																	class234.invalidateWidget(WorldMapSection1.mousedOverWidgetIf1);
																}
															}

															if (var36 != SecureRandomCallable.field542 && field825 == field824) {
																if (var36 != null) {
																	class234.invalidateWidget(var36);
																}

																if (SecureRandomCallable.field542 != null) {
																	class234.invalidateWidget(SecureRandomCallable.field542);
																}
															}

															if (SecureRandomCallable.field542 != null) {
																if (field824 < field825) {
																	++field824;
																	if (field825 == field824) {
																		class234.invalidateWidget(SecureRandomCallable.field542);
																	}
																}
															} else if (field824 > 0) {
																--field824;
															}

															if (oculusOrbState == 0) {
																var4 = class60.localPlayer.x;
																var5 = class60.localPlayer.y;
																if (class225.oculusOrbFocalPointX - var4 < -500 || class225.oculusOrbFocalPointX - var4 > 500 || HealthBarDefinition.oculusOrbFocalPointY - var5 < -500 || HealthBarDefinition.oculusOrbFocalPointY - var5 > 500) {
																	class225.oculusOrbFocalPointX = var4;
																	HealthBarDefinition.oculusOrbFocalPointY = var5;
																}

																if (var4 != class225.oculusOrbFocalPointX) {
																	class225.oculusOrbFocalPointX += (var4 - class225.oculusOrbFocalPointX) / 16;
																}

																if (var5 != HealthBarDefinition.oculusOrbFocalPointY) {
																	HealthBarDefinition.oculusOrbFocalPointY += (var5 - HealthBarDefinition.oculusOrbFocalPointY) / 16;
																}

																var6 = class225.oculusOrbFocalPointX >> 7;
																var7 = HealthBarDefinition.oculusOrbFocalPointY >> 7;
																var8 = Language.getTileHeight(class225.oculusOrbFocalPointX, HealthBarDefinition.oculusOrbFocalPointY, TileItemPile.Client_plane);
																var9 = 0;
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																			var12 = TileItemPile.Client_plane;
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																				++var12;
																			}

																			int var26 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																			if (var26 > var9) {
																				var9 = var26;
																			}
																		}
																	}
																}

																var10 = var9 * 192;
																if (var10 > 98048) {
																	var10 = 98048;
																}

																if (var10 < 32768) {
																	var10 = 32768;
																}

																if (var10 > field881) {
																	field881 += (var10 - field881) / 24;
																} else if (var10 < field881) {
																	field881 += (var10 - field881) / 80;
																}

																WorldMapDecoration.field234 = Language.getTileHeight(class60.localPlayer.x, class60.localPlayer.y, TileItemPile.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																NetSocket.method3674();
																short var32 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var32 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var32 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var32 == 0) {
																		var32 = 1792;
																	} else if (var32 == 1024) {
																		var32 = 1280;
																	} else {
																		var32 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var32 == 0) {
																		var32 = 256;
																	} else if (var32 == 1024) {
																		var32 = 768;
																	} else {
																		var32 = 512;
																	}
																}

																byte var33 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var33 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var33 = 1;
																}

																var6 = 0;
																if (var32 >= 0 || var33 != 0) {
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * 312783465 * 354155993 : oculusOrbNormalSpeed * -997807461 * -968086637;
																	var6 *= 16;
																	field751 = var32;
																	field752 = var33;
																}

																if (field717 < var6) {
																	field717 += var6 / 8;
																	if (field717 > var6) {
																		field717 = var6;
																	}
																} else if (field717 > var6) {
																	field717 = field717 * 9 / 10;
																}

																if (field717 > 0) {
																	var7 = field717 / 16;
																	if (field751 >= 0) {
																		var4 = field751 - Canvas.cameraYaw & 2047;
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																		class225.oculusOrbFocalPointX += var7 * var8 / 65536;
																		HealthBarDefinition.oculusOrbFocalPointY += var7 * var9 / 65536;
																	}

																	if (field752 != 0) {
																		WorldMapDecoration.field234 += var7 * field752;
																		if (WorldMapDecoration.field234 > 0) {
																			WorldMapDecoration.field234 = 0;
																		}
																	}
																} else {
																	field751 = -1;
																	field752 = -1;
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	GrandExchangeOfferNameComparator.method206();
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && ArchiveLoader.mouseCam) {
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var4 * 2;
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * -137685025 * -1383373793;
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var5 * 2;
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (MouseHandler.MouseHandler_x + mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x * -493092611 * -1040704427;
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
																WorldMapLabel.method488();
															}

															for (var4 = 0; var4 < 5; ++var4) {
																var10002 = field922[var4]++;
															}

															AttackOption.varcs.tryWrite();
															var4 = Skills.method4271();
															var5 = KeyHandler.KeyHandler_idleCycles;
															PacketBufferNode var27;
															if (var4 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var27 = UserComparator4.getPacketBufferNode(ClientPacket.field2243, packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}

															ModeWhere.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var27 = UserComparator4.getPacketBufferNode(ClientPacket.field2285, packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}

															try {
																packetWriter.flush();
															} catch (IOException var28) {
																CollisionMap.method3707();
															}

															return;
														}

														var42 = var40.widget;
														if (var42.childIndex < 0) {
															break;
														}

														var38 = WorldMapSprite.getWidget(var42.parentId);
													} while(var38 == null || var38.children == null || var42.childIndex >= var38.children.length || var42 != var38.children[var42.childIndex]);

													InterfaceParent.runScriptEvent(var40);
												}
											}

											var42 = var40.widget;
											if (var42.childIndex < 0) {
												break;
											}

											var38 = WorldMapSprite.getWidget(var42.parentId);
										} while(var38 == null || var38.children == null || var42.childIndex >= var38.children.length || var42 != var38.children[var42.childIndex]);

										InterfaceParent.runScriptEvent(var40);
									}
								}

								var42 = var40.widget;
								if (var42.childIndex < 0) {
									break;
								}

								var38 = WorldMapSprite.getWidget(var42.parentId);
							} while(var38 == null || var38.children == null || var42.childIndex >= var38.children.length || var42 != var38.children[var42.childIndex]);

							InterfaceParent.runScriptEvent(var40);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1501968527"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = Varcs.canvasWidth;
		int var2 = class52.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (NetSocket.clientPreferences != null) {
			try {
				Client var3 = WorldMapSectionType.client;
				Object[] var4 = new Object[]{class58.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1953660969"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (UserComparator4.loadInterface(var1)) {
				WorldMapDecoration.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field813[var1]) {
				field879[var1] = true;
			}

			field880[var1] = field813[var1];
			field813[var1] = false;
		}

		field877 = cycle;
		viewportX = -1;
		viewportY = -1;
		TaskHandler.field2066 = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			NetFileRequest.drawWidgets(rootInterface, 0, 0, Varcs.canvasWidth, class52.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				Timer.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				Timer.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				int var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					int var3 = UrlRequester.method3421();
					String var4;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var4 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var4 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var5;
						if (var3 < 0) {
							var5 = "";
						} else if (menuTargets[var3].length() > 0) {
							var5 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var5 = menuActions[var3];
						}

						var4 = var5;
					}

					if (menuOptionsCount > 2) {
						var4 = var4 + ItemContainer.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					GrandExchangeOfferNameComparator.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			WorldMapSection3.method841();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field880[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field879[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class1.method16(TileItemPile.Client_plane, class60.localPlayer.x, class60.localPlayer.y, field747);
		field747 = 0;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)Z",
		garbageValue = "-15"
	)
	final boolean method1768(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var20;
			int var21;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1347) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1348 = 0;
						var1.field1347 = false;
					}

					var3.offset = 0;
					if (var3.method5657()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1348 = 0;
					}

					var1.field1347 = true;
					ServerPacket[] var4 = StructDefinition.ServerPacket_values();
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
				var1.field1348 = 0;
				timer.method5162();
				var1.field1342 = var1.field1351;
				var1.field1351 = var1.field1350;
				var1.field1350 = var1.serverPacket;
				int var16;
				if (ServerPacket.field2163 == var1.serverPacket) {
					isCameraLocked = false;

					for (var16 = 0; var16 < 5; ++var16) {
						field918[var16] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2214 == var1.serverPacket) {
					ModeWhere.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field866 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var7;
				long var17;
				String var39;
				if (ServerPacket.field2200 == var1.serverPacket) {
					var39 = var3.readStringCp1252NullTerminated();
					var17 = (long)var3.readUnsignedShort();
					var7 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)FaceNormal.findEnumerated(VarbitDefinition.PlayerType_values(), var3.readUnsignedByte());
					long var10 = var7 + (var17 << 32);
					boolean var12 = false;

					for (int var13 = 0; var13 < 100; ++var13) {
						if (field892[var13] == var10) {
							var12 = true;
							break;
						}
					}

					if (ModeWhere.friendSystem.isIgnored(new Username(var39, class195.loginType))) {
						var12 = true;
					}

					if (!var12 && field787 == 0) {
						field892[field730] = var10;
						field730 = (field730 + 1) % 100;
						String var19 = AbstractFont.escapeBrackets(TileItemPile.method2903(NPC.method2157(var3)));
						byte var46;
						if (var9.isPrivileged) {
							var46 = 7;
						} else {
							var46 = 3;
						}

						if (var9.modIcon != -1) {
							ObjectSound.addGameMessage(var46, WorldMapRegion.method611(var9.modIcon) + var39, var19);
						} else {
							ObjectSound.addGameMessage(var46, var39, var19);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2153 == var1.serverPacket) {
					World.privateChatMode = ItemContainer.method1232(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2206 == var1.serverPacket) {
					for (var16 = 0; var16 < Varps.Varps_main.length; ++var16) {
						if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) {
							Varps.Varps_main[var16] = Varps.Varps_temp[var16];
							WorldMapSection0.changeGameOptions(var16);
							field859[++field860 - 1 & 31] = var16;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2160 == var1.serverPacket) {
					class2.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2235 == var1.serverPacket) {
					var39 = var3.readStringCp1252NullTerminated();
					var20 = AbstractFont.escapeBrackets(TileItemPile.method2903(NPC.method2157(var3)));
					ObjectSound.addGameMessage(6, var39, var20);
					var1.serverPacket = null;
					return true;
				}

				Widget var6;
				if (ServerPacket.field2193 == var1.serverPacket) {
					var16 = var3.method5766();
					var5 = var3.method5867();
					var6 = WorldMapSprite.getWidget(var16);
					if (var6.modelType != 2 || var5 != var6.modelId) {
						var6.modelType = 2;
						var6.modelId = var5;
						class234.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2157 == var1.serverPacket) {
					var39 = var3.readStringCp1252NullTerminated();
					Object[] var55 = new Object[var39.length() + 1];

					for (var21 = var39.length() - 1; var21 >= 0; --var21) {
						if (var39.charAt(var21) == 's') {
							var55[var21 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var55[var21 + 1] = new Integer(var3.readInt());
						}
					}

					var55[0] = new Integer(var3.readInt());
					ScriptEvent var45 = new ScriptEvent();
					var45.args = var55;
					InterfaceParent.runScriptEvent(var45);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2182 == var1.serverPacket) {
					ModeWhere.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					WorldMapSprite.FriendSystem_invalidateIgnoreds();
					field866 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2204 == var1.serverPacket) {
					var16 = var3.method5755();
					if (var16 == 65535) {
						var16 = -1;
					}

					UserComparator9.playSong(var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2171 == var1.serverPacket) {
					var16 = var3.method5757();
					if (var16 == 65535) {
						var16 = -1;
					}

					var5 = var3.method5761();
					MouseRecorder.playSoundJingle(var16, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2194 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					MidiPcmStream.forceDisconnect(var16);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2209 == var1.serverPacket) {
					for (var16 = 0; var16 < VarpDefinition.VarpDefinition_fileCount; ++var16) {
						VarpDefinition var54 = class219.VarpDefinition_get(var16);
						if (var54 != null) {
							Varps.Varps_temp[var16] = 0;
							Varps.Varps_main[var16] = 0;
						}
					}

					Buffer.method5950();
					field860 += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2180 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field870 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				int var22;
				if (ServerPacket.field2155 == var1.serverPacket) {
					Buffer.method5950();
					var16 = var3.method5748();
					var5 = var3.method5765();
					var21 = var3.method5936();
					experience[var21] = var5;
					currentLevels[var21] = var16;
					levels[var21] = 1;

					for (var22 = 0; var22 < 98; ++var22) {
						if (var5 >= Skills.Skills_experienceTable[var22]) {
							levels[var21] = var22 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2178 == var1.serverPacket) {
					MouseRecorder.logOut();
					var1.serverPacket = null;
					return false;
				}

				long var23;
				long var25;
				if (ServerPacket.field2217 == var1.serverPacket) {
					var39 = var3.readStringCp1252NullTerminated();
					var17 = var3.readLong();
					var7 = (long)var3.readUnsignedShort();
					var23 = (long)var3.readMedium();
					PlayerType var44 = (PlayerType)FaceNormal.findEnumerated(VarbitDefinition.PlayerType_values(), var3.readUnsignedByte());
					var25 = var23 + (var7 << 32);
					boolean var14 = false;

					for (int var15 = 0; var15 < 100; ++var15) {
						if (field892[var15] == var25) {
							var14 = true;
							break;
						}
					}

					if (var44.isUser && ModeWhere.friendSystem.isIgnored(new Username(var39, class195.loginType))) {
						var14 = true;
					}

					if (!var14 && field787 == 0) {
						field892[field730] = var25;
						field730 = (field730 + 1) % 100;
						String var27 = AbstractFont.escapeBrackets(TileItemPile.method2903(NPC.method2157(var3)));
						if (var44.modIcon != -1) {
							WorldMapID.addChatMessage(9, WorldMapRegion.method611(var44.modIcon) + var39, var27, WorldMapData_0.base37DecodeLong(var17));
						} else {
							WorldMapID.addChatMessage(9, var39, var27, WorldMapData_0.base37DecodeLong(var17));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2205 == var1.serverPacket) {
					class39.method616(class194.field2362);
					var1.serverPacket = null;
					return true;
				}

				Widget var58;
				if (ServerPacket.field2203 == var1.serverPacket) {
					var16 = var3.method5867();
					var5 = var3.method5766();
					var21 = var3.readUnsignedShort();
					var58 = WorldMapSprite.getWidget(var5);
					var58.field2658 = var16 + (var21 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2198 == var1.serverPacket) {
					World var38 = new World();
					var38.host = var3.readStringCp1252NullTerminated();
					var38.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var38.properties = var5;
					ClientPreferences.updateGameState(45);
					var2.close();
					var2 = null;
					Friend.changeWorld(var38);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2201 == var1.serverPacket) {
					var16 = var3.method5767();
					var5 = var3.readUnsignedShort();
					var6 = WorldMapSprite.getWidget(var16);
					if (var6 != null && var6.type == 0) {
						if (var5 > var6.scrollHeight - var6.height) {
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var6.scrollY) {
							var6.scrollY = var5;
							class234.invalidateWidget(var6);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2238 == var1.serverPacket) {
					if (ClientPreferences.clanChat != null) {
						ClientPreferences.clanChat.method5421(var3);
					}

					Frames.method3399();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2175 == var1.serverPacket) {
					Buffer.method5950();
					runEnergy = var3.readUnsignedByte();
					field870 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var28;
				if (ServerPacket.field2167 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					var5 = var3.method5867();
					var21 = var3.method5767();
					var28 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var28 != null) {
						class41.closeInterface(var28, var5 != var28.group);
					}

					WorldMapLabel.method486(var21, var5, var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2161 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var16] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false);
					}

					field818 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				String var41;
				if (ServerPacket.field2237 == var1.serverPacket) {
					var16 = var3.readUShortSmart();
					boolean var47 = var3.readUnsignedByte() == 1;
					var41 = "";
					boolean var56 = false;
					if (var47) {
						var41 = var3.readStringCp1252NullTerminated();
						if (ModeWhere.friendSystem.isIgnored(new Username(var41, class195.loginType))) {
							var56 = true;
						}
					}

					String var43 = var3.readStringCp1252NullTerminated();
					if (!var56) {
						ObjectSound.addGameMessage(var16, var41, var43);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2196 == var1.serverPacket) {
					var16 = var3.method5767();
					var5 = var3.method5757();
					Varps.Varps_temp[var5] = var16;
					if (Varps.Varps_main[var5] != var16) {
						Varps.Varps_main[var5] = var16;
					}

					WorldMapSection0.changeGameOptions(var5);
					field859[++field860 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2166 == var1.serverPacket) {
					var16 = var3.method5867();
					LoginScreenAnimation.method1908(var16);
					changedItemContainers[++field878 - 1 & 31] = var16 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2154 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					AbstractWorldMapIcon.queueSoundEffect(var16, var5, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2234 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var21 = var3.readUnsignedByte();
					var22 = var3.readUnsignedByte();
					field918[var16] = true;
					field919[var16] = var5;
					field775[var16] = var21;
					field778[var16] = var22;
					field922[var16] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2228 == var1.serverPacket) {
					var16 = var3.method5767();
					var5 = var3.method5755();
					var6 = WorldMapSprite.getWidget(var16);
					if (var6.modelType != 1 || var5 != var6.modelId) {
						var6.modelType = 1;
						var6.modelId = var5;
						class234.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2223 == var1.serverPacket) {
					class8.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				int var29;
				if (ServerPacket.field2232 == var1.serverPacket) {
					var16 = var3.method5766();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var21 = var3.method5755();
					if (var21 == 65535) {
						var21 = -1;
					}

					var22 = var3.method5765();

					for (var29 = var5; var29 <= var21; ++var29) {
						var23 = (long)var29 + ((long)var16 << 32);
						Node var11 = widgetClickMasks.get(var23);
						if (var11 != null) {
							var11.remove();
						}

						widgetClickMasks.put(new IntegerNode(var22), var23);
					}

					var1.serverPacket = null;
					return true;
				}

				int var30;
				int var31;
				if (ServerPacket.field2224 == var1.serverPacket) {
					isCameraLocked = true;
					DevicePcmPlayerProvider.field435 = var3.readUnsignedByte();
					class9.field42 = var3.readUnsignedByte();
					class206.field2446 = var3.readUnsignedShort();
					class329.field3867 = var3.readUnsignedByte();
					WorldMapCacheName.field329 = var3.readUnsignedByte();
					if (WorldMapCacheName.field329 >= 100) {
						var16 = DevicePcmPlayerProvider.field435 * 128 + 64;
						var5 = class9.field42 * 128 + 64;
						var21 = Language.getTileHeight(var16, var5, TileItemPile.Client_plane) - class206.field2446;
						var22 = var16 - MouseHandler.cameraX;
						var29 = var21 - WorldMapSection3.cameraY;
						var30 = var5 - ObjectSound.cameraZ;
						var31 = (int)Math.sqrt((double)(var22 * var22 + var30 * var30));
						TilePaint.cameraPitch = (int)(Math.atan2((double)var29, (double)var31) * 325.949D) & 2047;
						Canvas.cameraYaw = (int)(Math.atan2((double)var22, (double)var30) * -325.949D) & 2047;
						if (TilePaint.cameraPitch < 128) {
							TilePaint.cameraPitch = 128;
						}

						if (TilePaint.cameraPitch > 383) {
							TilePaint.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var48;
				if (ServerPacket.field2174 == var1.serverPacket) {
					var48 = var3.readBoolean();
					if (var48) {
						if (class278.field3585 == null) {
							class278.field3585 = new class247();
						}
					} else {
						class278.field3585 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2218 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.method5867();
					if (var5 == 65535) {
						var5 = -1;
					}

					var21 = var3.method5766();
					var58 = WorldMapSprite.getWidget(var16);
					ItemDefinition var42;
					if (!var58.isIf3) {
						if (var5 == -1) {
							var58.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var42 = KitDefinition.ItemDefinition_get(var5);
						var58.modelType = 4;
						var58.modelId = var5;
						var58.modelAngleX = var42.xan2d;
						var58.modelAngleY = var42.yan2d;
						var58.modelZoom = var42.zoom2d * 100 / var21;
						class234.invalidateWidget(var58);
					} else {
						var58.itemId = var5;
						var58.itemQuantity = var21;
						var42 = KitDefinition.ItemDefinition_get(var5);
						var58.modelAngleX = var42.xan2d;
						var58.modelAngleY = var42.yan2d;
						var58.modelAngleZ = var42.zan2d;
						var58.modelOffsetX = var42.offsetX2d;
						var58.modelOffsetY = var42.offsetY2d;
						var58.modelZoom = var42.zoom2d;
						if (var42.isStackable == 1) {
							var58.itemQuantityMode = 1;
						} else {
							var58.itemQuantityMode = 2;
						}

						if (var58.field2657 > 0) {
							var58.modelZoom = var58.modelZoom * 32 / var58.field2657;
						} else if (var58.rawWidth > 0) {
							var58.modelZoom = var58.modelZoom * 32 / var58.rawWidth;
						}

						class234.invalidateWidget(var58);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2179 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					var20 = var3.readStringCp1252NullTerminated();
					var21 = var3.readUnsignedByte();
					if (var21 >= 1 && var21 <= 8) {
						if (var20.equalsIgnoreCase("null")) {
							var20 = null;
						}

						playerMenuActions[var21 - 1] = var20;
						playerOptionsPriorities[var21 - 1] = var16 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2229 == var1.serverPacket) {
					var16 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						WorldMapSection3.Widget_resetModelFrames(rootInterface);
						UserComparator4.runWidgetOnLoadListener(rootInterface);

						for (var22 = 0; var22 < 100; ++var22) {
							field813[var22] = true;
						}
					}

					InterfaceParent var59;
					for (; var21-- > 0; var59.field587 = true) {
						var22 = var3.readInt();
						var29 = var3.readUnsignedShort();
						var30 = var3.readUnsignedByte();
						var59 = (InterfaceParent)interfaceParents.get((long)var22);
						if (var59 != null && var29 != var59.group) {
							class41.closeInterface(var59, true);
							var59 = null;
						}

						if (var59 == null) {
							var59 = WorldMapLabel.method486(var22, var29, var30);
						}
					}

					for (var28 = (InterfaceParent)interfaceParents.first(); var28 != null; var28 = (InterfaceParent)interfaceParents.next()) {
						if (var28.field587) {
							var28.field587 = false;
						} else {
							class41.closeInterface(var28, true);
						}
					}

					widgetClickMasks = new NodeHashTable(512);

					while (var3.offset < var16) {
						var22 = var3.readInt();
						var29 = var3.readUnsignedShort();
						var30 = var3.readUnsignedShort();
						var31 = var3.readInt();

						for (int var33 = var29; var33 <= var30; ++var33) {
							var25 = (long)var33 + ((long)var22 << 32);
							widgetClickMasks.put(new IntegerNode(var31), var25);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2158 == var1.serverPacket) {
					var16 = var3.method5765();
					var5 = var3.method5759();
					var21 = var3.method5758();
					var58 = WorldMapSprite.getWidget(var16);
					if (var5 != var58.rawX || var21 != var58.rawY || var58.xAlignment != 0 || var58.yAlignment != 0) {
						var58.rawX = var5;
						var58.rawY = var21;
						var58.xAlignment = 0;
						var58.yAlignment = 0;
						class234.invalidateWidget(var58);
						this.alignWidget(var58);
						if (var58.type == 0) {
							WorldMapIcon_0.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var16 >> 16], var58, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2168 == var1.serverPacket) {
					class39.method616(class194.field2361);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2220 == var1.serverPacket) {
					ModeWhere.friendSystem.method1981();
					field866 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2213 == var1.serverPacket) {
					class39.method616(class194.field2359);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2186 == var1.serverPacket) {
					var16 = var3.readInt();
					if (var16 != field836) {
						field836 = var16;
						WorldMapLabelSize.method247();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2216 == var1.serverPacket) {
					class39.method616(class194.field2354);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2172 == var1.serverPacket) {
					Buffer.method5950();
					weight = var3.readShort();
					field870 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2222 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readInt();
					var21 = VerticalAlignment.getGcDuration();
					PacketBufferNode var57 = UserComparator4.getPacketBufferNode(ClientPacket.field2323, packetWriter.isaacCipher);
					var57.packetBuffer.method5744(GameShell.fps);
					var57.packetBuffer.method5837(var21);
					var57.packetBuffer.method5762(var16);
					var57.packetBuffer.method5764(var5);
					packetWriter.addNode(var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2156 == var1.serverPacket) {
					class39.method616(class194.field2355);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2187 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var16 < -70000) {
						var5 += 32768;
					}

					if (var16 >= 0) {
						var6 = WorldMapSprite.getWidget(var16);
					} else {
						var6 = null;
					}

					if (var6 != null) {
						for (var22 = 0; var22 < var6.itemIds.length; ++var22) {
							var6.itemIds[var22] = 0;
							var6.itemQuantities[var22] = 0;
						}
					}

					SoundCache.clearItemContainer(var5);
					var22 = var3.readUnsignedShort();

					for (var29 = 0; var29 < var22; ++var29) {
						var30 = var3.readUnsignedByte();
						if (var30 == 255) {
							var30 = var3.method5765();
						}

						var31 = var3.method5755();
						if (var6 != null && var29 < var6.itemIds.length) {
							var6.itemIds[var29] = var31;
							var6.itemQuantities[var29] = var30;
						}

						WorldMapSprite.itemContainerSetItem(var5, var29, var31 - 1, var30);
					}

					if (var6 != null) {
						class234.invalidateWidget(var6);
					}

					Buffer.method5950();
					changedItemContainers[++field878 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2195 == var1.serverPacket) {
					byte[] var37 = new byte[var1.serverPacketLength];
					var3.method5680(var37, 0, var37.length);
					Buffer var53 = new Buffer(var37);
					var41 = var53.readStringCp1252NullTerminated();
					WorldMapSectionType.openURL(var41, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2162 == var1.serverPacket) {
					class39.method616(class194.field2358);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2181 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						ClientPreferences.clanChat = null;
					} else {
						if (ClientPreferences.clanChat == null) {
							ClientPreferences.clanChat = new ClanChat(class195.loginType, WorldMapSectionType.client);
						}

						ClientPreferences.clanChat.readUpdate(var3);
					}

					Frames.method3399();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2165 == var1.serverPacket) {
					Player.field638 = var3.method5748();
					class41.field302 = var3.method5748();

					for (var16 = Player.field638; var16 < Player.field638 + 8; ++var16) {
						for (var5 = class41.field302; var5 < class41.field302 + 8; ++var5) {
							if (groundItems[TileItemPile.Client_plane][var16][var5] != null) {
								groundItems[TileItemPile.Client_plane][var16][var5] = null;
								class41.updateItemPile(var16, var5);
							}
						}
					}

					for (PendingSpawn var36 = (PendingSpawn)pendingSpawns.last(); var36 != null; var36 = (PendingSpawn)pendingSpawns.previous()) {
						if (var36.x >= Player.field638 && var36.x < Player.field638 + 8 && var36.y >= class41.field302 && var36.y < class41.field302 + 8 && var36.plane == TileItemPile.Client_plane) {
							var36.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var50;
				if (ServerPacket.field2211 == var1.serverPacket) {
					var16 = var3.method5765();
					var50 = WorldMapSprite.getWidget(var16);

					for (var21 = 0; var21 < var50.itemIds.length; ++var21) {
						var50.itemIds[var21] = -1;
						var50.itemIds[var21] = 0;
					}

					class234.invalidateWidget(var50);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2212 == var1.serverPacket) {
					class60.updatePlayers(var3, var1.serverPacketLength);
					class303.method5525();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2240 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
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
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte();
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2230 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.method5755();
					var21 = var5 >> 10 & 31;
					var22 = var5 >> 5 & 31;
					var29 = var5 & 31;
					var30 = (var22 << 11) + (var21 << 19) + (var29 << 3);
					Widget var32 = WorldMapSprite.getWidget(var16);
					if (var30 != var32.color) {
						var32.color = var30;
						class234.invalidateWidget(var32);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var8;
				if (ServerPacket.field2215 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.method5765();
					InterfaceParent var40 = (InterfaceParent)interfaceParents.get((long)var5);
					var28 = (InterfaceParent)interfaceParents.get((long)var16);
					if (var28 != null) {
						class41.closeInterface(var28, var40 == null || var28.group != var40.group);
					}

					if (var40 != null) {
						var40.remove();
						interfaceParents.put(var40, (long)var16);
					}

					var8 = WorldMapSprite.getWidget(var5);
					if (var8 != null) {
						class234.invalidateWidget(var8);
					}

					var8 = WorldMapSprite.getWidget(var16);
					if (var8 != null) {
						class234.invalidateWidget(var8);
						WorldMapIcon_0.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var8.id >>> 16], var8, true);
					}

					if (rootInterface != -1) {
						Language.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2231 == var1.serverPacket) {
					class39.method616(class194.field2363);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2226 == var1.serverPacket) {
					var16 = var3.method5767();
					var5 = var3.readShort();
					var6 = WorldMapSprite.getWidget(var16);
					if (var5 != var6.sequenceId || var5 == -1) {
						var6.sequenceId = var5;
						var6.modelFrame = 0;
						var6.modelFrameCycle = 0;
						class234.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2190 == var1.serverPacket) {
					var16 = var3.readInt();
					InterfaceParent var52 = (InterfaceParent)interfaceParents.get((long)var16);
					if (var52 != null) {
						class41.closeInterface(var52, true);
					}

					if (meslayerContinueWidget != null) {
						class234.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2185 == var1.serverPacket) {
					byte var49 = var3.method5751();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var49;
					if (Varps.Varps_main[var5] != var49) {
						Varps.Varps_main[var5] = var49;
					}

					WorldMapSection0.changeGameOptions(var5);
					field859[++field860 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2219 == var1.serverPacket) {
					var16 = var3.method5757();
					rootInterface = var16;
					this.resizeRoot(false);
					WorldMapSection3.Widget_resetModelFrames(var16);
					UserComparator4.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field813[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2188 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					class25.method245(var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2169 == var1.serverPacket) {
					class41.field302 = var3.method5936();
					Player.field638 = var3.readUnsignedByte();

					while (var3.offset < var1.serverPacketLength) {
						var16 = var3.readUnsignedByte();
						class194 var51 = GameBuild.method4291()[var16];
						class39.method616(var51);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2173 == var1.serverPacket) {
					UserComparator2.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2199 == var1.serverPacket) {
					UserComparator10.method3522(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2184 == var1.serverPacket) {
					class39.method616(class194.field2357);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2221 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByte();
					tradeChatMode = var3.method5746();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2176 == var1.serverPacket) {
					class39.method616(class194.field2353);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2210 == var1.serverPacket) {
					var48 = var3.method5746() == 1;
					var5 = var3.method5765();
					var6 = WorldMapSprite.getWidget(var5);
					if (var48 != var6.isHidden) {
						var6.isHidden = var48;
						class234.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2159 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2164 == var1.serverPacket) {
					class39.method616(class194.field2360);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2227 == var1.serverPacket) {
					for (var16 = 0; var16 < players.length; ++var16) {
						if (players[var16] != null) {
							players[var16].sequence = -1;
						}
					}

					for (var16 = 0; var16 < npcs.length; ++var16) {
						if (npcs[var16] != null) {
							npcs[var16].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2191 == var1.serverPacket) {
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

				if (ServerPacket.field2225 == var1.serverPacket) {
					if (rootInterface != -1) {
						Language.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2183 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						GrandExchangeOfferNameComparator.method214(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2208 == var1.serverPacket) {
					var16 = var3.method5766();
					var20 = var3.readStringCp1252NullTerminated();
					var6 = WorldMapSprite.getWidget(var16);
					if (!var20.equals(var6.text)) {
						var6.text = var20;
						class234.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2207 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					var5 = var3.method5867();
					var21 = var3.method5867();
					var22 = var3.method5767();
					var8 = WorldMapSprite.getWidget(var22);
					if (var5 != var8.modelAngleX || var21 != var8.modelAngleY || var16 != var8.modelZoom) {
						var8.modelAngleX = var5;
						var8.modelAngleY = var21;
						var8.modelZoom = var16;
						class234.invalidateWidget(var8);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2233 == var1.serverPacket) {
					var48 = var3.readUnsignedByte() == 1;
					if (var48) {
						GraphicsObject.field1139 = MilliClock.currentTimeMillis() - var3.readLong();
						WorldMapIcon_0.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						WorldMapIcon_0.grandExchangeEvents = null;
					}

					field869 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2170 == var1.serverPacket) {
					Player.field638 = var3.method5936();
					class41.field302 = var3.method5746();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2236 == var1.serverPacket) {
					class2.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2202 == var1.serverPacket) {
					isCameraLocked = true;
					class204.field2420 = var3.readUnsignedByte();
					WorldMapManager.field348 = var3.readUnsignedByte();
					WorldMapLabel.field275 = var3.readUnsignedShort();
					class25.field122 = var3.readUnsignedByte();
					ScriptEvent.field604 = var3.readUnsignedByte();
					if (ScriptEvent.field604 >= 100) {
						MouseHandler.cameraX = class204.field2420 * 128 + 64;
						ObjectSound.cameraZ = WorldMapManager.field348 * 128 + 64;
						WorldMapSection3.cameraY = Language.getTileHeight(MouseHandler.cameraX, ObjectSound.cameraZ, TileItemPile.Client_plane) - WorldMapLabel.field275;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2197 == var1.serverPacket) {
					var16 = var3.method5766();
					var50 = WorldMapSprite.getWidget(var16);
					var50.modelType = 3;
					var50.modelId = class60.localPlayer.appearance.getChatHeadId();
					class234.invalidateWidget(var50);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2177 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var16 < -70000) {
						var5 += 32768;
					}

					if (var16 >= 0) {
						var6 = WorldMapSprite.getWidget(var16);
					} else {
						var6 = null;
					}

					for (; var3.offset < var1.serverPacketLength; WorldMapSprite.itemContainerSetItem(var5, var22, var29 - 1, var30)) {
						var22 = var3.readUShortSmart();
						var29 = var3.readUnsignedShort();
						var30 = 0;
						if (var29 != 0) {
							var30 = var3.readUnsignedByte();
							if (var30 == 255) {
								var30 = var3.readInt();
							}
						}

						if (var6 != null && var22 >= 0 && var22 < var6.itemIds.length) {
							var6.itemIds[var22] = var29;
							var6.itemQuantities[var22] = var30;
						}
					}

					if (var6 != null) {
						class234.invalidateWidget(var6);
					}

					Buffer.method5950();
					changedItemContainers[++field878 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2189 == var1.serverPacket) {
					class8.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				class197.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -343660333 * -1993969829 : -1) + "," + (var1.field1351 != null ? var1.field1351.id * -343660333 * -1993969829 : -1) + "," + (var1.field1342 != null ? var1.field1342.id * -343660333 * -1993969829 : -1) + "," + var1.serverPacketLength, (Throwable)null);
				MouseRecorder.logOut();
			} catch (IOException var34) {
				CollisionMap.method3707();
			} catch (Exception var35) {
				var20 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -343660333 * -1993969829 : -1) + "," + (var1.field1351 != null ? var1.field1351.id * -343660333 * -1993969829 : -1) + "," + (var1.field1342 != null ? var1.field1342.id * -343660333 * -1993969829 : -1) + "," + var1.serverPacketLength + "," + (class60.localPlayer.pathX[0] + class182.baseX) + "," + (class60.localPlayer.pathY[0] + SecureRandomFuture.baseY) + ",";

				for (var21 = 0; var21 < var1.serverPacketLength && var21 < 50; ++var21) {
					var20 = var20 + var3.array[var21] + ",";
				}

				class197.RunException_sendStackTrace(var20, var35);
				MouseRecorder.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-302072154"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var3 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var3;
					String var4 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var4;
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

		if (KeyHandler.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var14 = MouseHandler.MouseHandler_lastButton;
				int var8;
				int var9;
				int var11;
				int var12;
				if (isMenuOpen) {
					if (var14 != 1 && (ArchiveLoader.mouseCam || var14 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var11 = MouseHandler.MouseHandler_y;
						if (var2 < WorldMapRectangle.menuX - 10 || var2 > class69.menuWidth + WorldMapRectangle.menuX + 10 || var11 < Frames.menuY - 10 || var11 > Frames.menuY + ApproximateRouteStrategy.menuHeight + 10) {
							isMenuOpen = false;
							class1.method7(WorldMapRectangle.menuX, Frames.menuY, class69.menuWidth, ApproximateRouteStrategy.menuHeight);
						}
					}

					if (var14 == 1 || !ArchiveLoader.mouseCam && var14 == 4) {
						var2 = WorldMapRectangle.menuX;
						var11 = Frames.menuY;
						var12 = class69.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						int var15 = MouseHandler.MouseHandler_lastPressedY;
						int var16 = -1;

						for (var8 = 0; var8 < menuOptionsCount; ++var8) {
							var9 = (menuOptionsCount - 1 - var8) * 15 + var11 + 31;
							if (var5 > var2 && var5 < var12 + var2 && var15 > var9 - 13 && var15 < var9 + 3) {
								var16 = var8;
							}
						}

						if (var16 != -1) {
							GrandExchangeEvent.method155(var16);
						}

						isMenuOpen = false;
						class1.method7(WorldMapRectangle.menuX, Frames.menuY, class69.menuWidth, ApproximateRouteStrategy.menuHeight);
					}
				} else {
					label281: {
						var2 = UrlRequester.method3421();
						if ((var14 == 1 || !ArchiveLoader.mouseCam && var14 == 4) && var2 >= 0) {
							var11 = menuOpcodes[var2];
							if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
								var12 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var13 = WorldMapSprite.getWidget(var5);
								var8 = KeyHandler.getWidgetClickMask(var13);
								boolean var7 = (var8 >> 28 & 1) != 0;
								if (var7) {
									break label281;
								}

								Object var10000 = null;
								if (Projectile.method2249(KeyHandler.getWidgetClickMask(var13))) {
									break label281;
								}
							}
						}

						if ((var14 == 1 || !ArchiveLoader.mouseCam && var14 == 4) && this.shouldLeftClickOpenMenu()) {
							var14 = 2;
						}

						if ((var14 == 1 || !ArchiveLoader.mouseCam && var14 == 4) && menuOptionsCount > 0) {
							GrandExchangeEvent.method155(var2);
						}

						if (var14 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						return;
					}

					if (KeyHandler.dragInventoryWidget != null && !field785 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
						var9 = draggedWidgetX;
						int var10 = draggedWidgetY;
						SecureRandomCallable.method1205(class169.tempMenuAction, var9, var10);
						class169.tempMenuAction = null;
					}

					field785 = false;
					itemDragDuration = 0;
					if (KeyHandler.dragInventoryWidget != null) {
						class234.invalidateWidget(KeyHandler.dragInventoryWidget);
					}

					KeyHandler.dragInventoryWidget = WorldMapSprite.getWidget(var5);
					dragItemSlotSource = var12;
					draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
					draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
					if (var2 >= 0) {
						WorldMapSection1.method648(var2);
					}

					class234.invalidateWidget(KeyHandler.dragInventoryWidget);
					return;
				}

			}
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1243315480"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = UrlRequester.method3421();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || class7.method94(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "4"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		WorldMapEvent.method840(var1, var2);
		UserComparator3.scene.menuOpen(TileItemPile.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-558702165"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = Varcs.canvasWidth;
		int var4 = class52.canvasHeight;
		if (UserComparator4.loadInterface(var2)) {
			GrandExchangeOfferUnitPriceComparator.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lhd;I)V",
		garbageValue = "-985582804"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : WorldMapSprite.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = Varcs.canvasWidth;
			var4 = class52.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		UserComparator3.alignWidgetSize(var1, var3, var4, false);
		WorldMapLabel.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1745197570"
	)
	final void method1372() {
		class234.invalidateWidget(clickedWidget);
		++GrandExchangeOfferAgeComparator.widgetDragDuration;
		if (field854 && field692) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field852) {
				var1 = field852;
			}

			if (var1 + clickedWidget.width > field852 + clickedWidgetParent.width) {
				var1 = field852 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field853) {
				var2 = field853;
			}

			if (var2 + clickedWidget.height > field853 + clickedWidgetParent.height) {
				var2 = field853 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field855;
			int var4 = var2 - field856;
			int var5 = clickedWidget.dragZoneSize;
			if (GrandExchangeOfferAgeComparator.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field852 + clickedWidgetParent.scrollX;
			int var7 = var2 - field853 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				InterfaceParent.runScriptEvent(var8);
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
						InterfaceParent.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && FriendSystem.method1994(clickedWidget) != null) {
						PacketBufferNode var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(draggedOnWidget.itemId);
						var9.packetBuffer.method5753(draggedOnWidget.childIndex);
						var9.packetBuffer.method5898(clickedWidget.itemId);
						var9.packetBuffer.method5752(clickedWidget.childIndex);
						var9.packetBuffer.method5764(clickedWidget.id);
						var9.packetBuffer.writeShortLE(draggedOnWidget.id);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field855 + widgetClickX, field856 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					GrandExchangeOffer.method189(field855 + widgetClickX, field856 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (GrandExchangeOfferAgeComparator.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(B)Lkq;",
		garbageValue = "-76"
	)
	@Export("username")
	public Username username() {
		return class60.localPlayer != null ? class60.localPlayer.username : null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lih;",
		garbageValue = "1222368622"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < class257.WorldMapElement_cached.length && class257.WorldMapElement_cached[var0] != null ? class257.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1015952997"
	)
	static void method1803(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lbn;B)V",
		garbageValue = "2"
	)
	static void method1522(GameShell var0) {
		while (WorldMapManager.isKeyDown()) {
			if (SecureRandomCallable.field546 == 13) {
				WorldMapSection2.method398();
				return;
			}

			if (SecureRandomCallable.field546 == 96) {
				if (Login.worldSelectPage > 0 && class13.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (SecureRandomCallable.field546 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && ClientPreferences.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !ArchiveLoader.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var1 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				Player.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				Player.changeWorldSelectSorting(0, 1);
				return;
			}

			int var2 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				Player.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				Player.changeWorldSelectSorting(1, 1);
				return;
			}

			int var3 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				Player.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				Player.changeWorldSelectSorting(2, 1);
				return;
			}

			int var4 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				Player.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				Player.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				WorldMapSection2.method398();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var5 = class13.World_worlds[Login.hoveredWorldIndex];
				Friend.changeWorld(var5);
				WorldMapSection2.method398();
				return;
			}

			if (Login.worldSelectPage > 0 && class13.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class13.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class52.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class52.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && ClientPreferences.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= Varcs.canvasWidth - ClientPreferences.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= Varcs.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class52.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class52.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
