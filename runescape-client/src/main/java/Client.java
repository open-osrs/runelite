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
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameShell implements Usernamed {
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -967608343
	)
	static int field748;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -159421781
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		longValue = 3335751163548503689L
	)
	static long field879;
	@ObfuscatedName("ou")
	static boolean[] field834;
	@ObfuscatedName("ot")
	static boolean[] field745;
	@ObfuscatedName("oj")
	static boolean[] field758;
	@ObfuscatedName("nl")
	static boolean field705;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -1723544013
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pz")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 954341551
	)
	public static int field950;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1826821479
	)
	static int field874;
	@ObfuscatedName("nx")
	static boolean field859;
	@ObfuscatedName("qq")
	static boolean field916;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -115501903
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -1615551305
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 897589711
	)
	static int field860;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ob")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("ol")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -1965324355
	)
	static int field861;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -1215664047
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("on")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 1050326365
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("oh")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	static final ApproximateRouteStrategy field877;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -532029863
	)
	static int field931;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -467484497
	)
	static int field868;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -400221737
	)
	static int field701;
	@ObfuscatedName("rj")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 2067578655
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -1857927441
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("tl")
	static int[] field695;
	@ObfuscatedName("tj")
	static int[] field956;
	@ObfuscatedName("np")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 1446456861
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 1875055983
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 12933011
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 373944835
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 1660756197
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("rg")
	static boolean[] field926;
	@ObfuscatedName("rw")
	static int[] field927;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = -905823515
	)
	static int field945;
	@ObfuscatedName("ro")
	static int[] field928;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("playerAppearance")
	static PlayerAppearance playerAppearance;
	@ObfuscatedName("ru")
	static int[] field898;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 1478190693
	)
	@Export("areaSoundEffectVolume")
	static int areaSoundEffectVolume;
	@ObfuscatedName("sb")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("rp")
	static int[] field918;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 1105285413
	)
	static int field895;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 2064359385
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -361533157
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("pb")
	static long[] field900;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "[Lj;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 845536339
	)
	static int field901;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 1746826411
	)
	static int field885;
	@ObfuscatedName("nk")
	static int[] field867;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 1183562103
	)
	static int field878;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -770002343
	)
	static int field875;
	@ObfuscatedName("na")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1931074951
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		longValue = 7054518271740632067L
	)
	static long field905;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 743392311
	)
	static int field906;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1587883567
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -1411709539
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -1821649225
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 637100393
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("nv")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1001910639
	)
	static int field941;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = -696027355
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("qw")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("qv")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("qf")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 1888830449
	)
	@Export("musicVolume")
	static int musicVolume;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "[Ldq;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = -481995573
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 977040321
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("py")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("qg")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1728090839
	)
	@Export("soundEffectVolume")
	static int soundEffectVolume;
	@ObfuscatedName("pd")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("rt")
	static short field873;
	@ObfuscatedName("rc")
	static short field932;
	@ObfuscatedName("rd")
	static short field937;
	@ObfuscatedName("rz")
	static short field935;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "[Llc;"
	)
	@Export("mapIcons")
	static Sprite[] mapIcons;
	@ObfuscatedName("ra")
	static short field753;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -840703781
	)
	static int field852;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = -462473275
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("rs")
	static short field865;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 476049569
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 996380993
	)
	static int field953;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 1006230257
	)
	static int field846;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 1182698243
	)
	static int field902;
	@ObfuscatedName("rm")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("ry")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1815216699
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pm")
	static int[] field904;
	@ObfuscatedName("pu")
	static int[] field903;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static NodeDeque field881;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static NodeDeque field939;
	@ObfuscatedName("ns")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 1489885445
	)
	static int field843;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -1530697045
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 1279066227
	)
	static int field844;
	@ObfuscatedName("ps")
	static String field710;
	@ObfuscatedName("pq")
	static int[] field896;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("s")
	static String[] field957;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfh;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ad")
	static boolean field772;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1952252433
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1836293151
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1500455873
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bl")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bn")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 530446497
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1817623855
	)
	static int field686;
	@ObfuscatedName("by")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1008452177
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ca")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1633145881
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		longValue = -7364036271402416249L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -345670979
	)
	static int field719;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 711078459
	)
	static int field693;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		longValue = 6513468436641987539L
	)
	static long field694;
	@ObfuscatedName("cm")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cb")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1097232173
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 663263241
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1168701183
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1852952069
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1012584603
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 285496787
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -679069747
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 286843445
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 551746543
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -772944549
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -207137197
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -910834387
	)
	static int field794;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		longValue = 1178443596221129289L
	)
	static long field696;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -85937083
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 474300455
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 506244731
	)
	static int field947;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 1618145807
	)
	static int field715;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 764009473
	)
	static int field716;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static class169 field717;
	@ObfuscatedName("el")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fw")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "[Lca;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -2146265857
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ff")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = -1153230115
	)
	static int field726;
	@ObfuscatedName("fv")
	static int[] field727;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = 416640201
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fe")
	static boolean field730;
	@ObfuscatedName("fx")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ft")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 955711481
	)
	static int field734;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 926514475
	)
	static int field735;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 1079386381
	)
	static int field848;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 28672383
	)
	static int field737;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1298064441
	)
	static int field722;
	@ObfuscatedName("gu")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gb")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gj")
	static final int[] field954;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -1423039985
	)
	static int field743;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 2098595987
	)
	static int field925;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -1305614333
	)
	static int field765;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1632535067
	)
	static int field746;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 845386571
	)
	static int field747;
	@ObfuscatedName("hp")
	static boolean field690;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -504309469
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 694250825
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -1414005751
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = -1795969885
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -56354123
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 2135930637
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = -77775685
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -1649155215
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 39732577
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1110148459
	)
	static int field692;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -2023417181
	)
	static int field759;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 2143690291
	)
	static int field760;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -1776720113
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -285231223
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1473843199
	)
	static int field763;
	@ObfuscatedName("ib")
	static boolean field725;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 1886979431
	)
	static int field882;
	@ObfuscatedName("ir")
	static boolean field750;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 300729757
	)
	static int field810;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -735595377
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -251508065
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ie")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ia")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ii")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("iu")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iy")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ju")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jo")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jd")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jx")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1171972661
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1986908281
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 1344112683
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1678392525
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 379363511
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 2115175527
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1792879987
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("js")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 1659427899
	)
	static int field828;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -1858381215
	)
	static int field788;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1955491125
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 2107596607
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1255636543
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1843538815
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jw")
	static boolean field830;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 1543846117
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1665596697
	)
	static int field795;
	@ObfuscatedName("jz")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 1876036055
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -651069671
	)
	static int field799;
	@ObfuscatedName("kd")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 1408541917
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 725006111
	)
	static int field802;
	@ObfuscatedName("kf")
	static int[] field803;
	@ObfuscatedName("kr")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ko")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kn")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kc")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -1515987941
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "[[[Lja;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kb")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kh")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("ln")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 1331910575
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lg")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -315201447
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lk")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lo")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lh")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lr")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("la")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ll")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ls")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lp")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("lf")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lm")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ly")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -689178451
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -1951728151
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 812853429
	)
	static int field832;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -2049020101
	)
	static int field833;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 1700020883
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ma")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -718961001
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 2082291921
	)
	static int field838;
	@ObfuscatedName("mo")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mc")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -906778899
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	Buffer field720;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	class9 field721;

	static {
		field772 = true; // L: 183
		worldId = 1; // L: 184
		worldProperties = 0; // L: 185
		gameBuild = 0; // L: 187
		isMembersWorld = false; // L: 190
		isLowDetail = false; // L: 191
		clientType = -1; // L: 196
		field686 = -1; // L: 197
		onMobile = false; // L: 198
		gameState = 0; // L: 199
		isLoading = true; // L: 220
		cycle = 0; // L: 221
		mouseLastLastPressedTimeMillis = -1L; // L: 222
		field719 = -1; // L: 224
		field693 = -1; // L: 225
		field694 = -1L; // L: 226
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
		field794 = 0; // L: 246
		js5Errors = 0; // L: 268
		loginState = 0; // L: 270
		field947 = 0; // L: 271
		field715 = 0; // L: 272
		field716 = 0; // L: 273
		field717 = class169.field2028; // L: 274
		Login_isUsernameRemembered = false; // L: 283
		secureRandomFuture = new SecureRandomFuture(); // L: 284
		randomDatData = null; // L: 289
		npcs = new NPC[32768]; // L: 293
		npcCount = 0; // L: 294
		npcIndices = new int[32768]; // L: 295
		field726 = 0; // L: 296
		field727 = new int[250]; // L: 297
		packetWriter = new PacketWriter(); // L: 300
		logoutTimer = 0; // L: 302
		field730 = false; // L: 303
		useBufferedSocket = true; // L: 304
		timer = new Timer(); // L: 305
		fontsMap = new HashMap(); // L: 311
		field734 = 0; // L: 318
		field735 = 1; // L: 319
		field848 = 0; // L: 320
		field737 = 1; // L: 321
		field722 = 0; // L: 322
		collisionMaps = new CollisionMap[4]; // L: 330
		isInInstance = false; // L: 331
		instanceChunkTemplates = new int[4][13][13]; // L: 332
		field954 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 333
		field743 = 0; // L: 336
		field925 = 2301979; // L: 348
		field765 = 5063219; // L: 349
		field746 = 3353893; // L: 350
		field747 = 7759444; // L: 351
		field690 = false; // L: 352
		alternativeScrollbarWidth = 0; // L: 353
		camAngleX = 128; // L: 361
		camAngleY = 0; // L: 362
		camAngleDY = 0; // L: 363
		camAngleDX = 0; // L: 364
		mouseCamClickedX = 0; // L: 365
		mouseCamClickedY = 0; // L: 366
		oculusOrbState = 0; // L: 367
		camFollowHeight = 50; // L: 368
		field692 = 0; // L: 372
		field759 = 0; // L: 373
		field760 = 0; // L: 374
		oculusOrbNormalSpeed = 12; // L: 376
		oculusOrbSlowedSpeed = 6; // L: 377
		field763 = 0; // L: 378
		field725 = false; // L: 379
		field882 = 0; // L: 380
		field750 = false; // L: 381
		field810 = 0; // L: 382
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
		field828 = 0; // L: 403
		field788 = 0; // L: 404
		dragItemSlotSource = 0; // L: 407
		draggedWidgetX = 0; // L: 408
		draggedWidgetY = 0; // L: 409
		dragItemSlotDestination = 0; // L: 410
		field830 = false; // L: 411
		itemDragDuration = 0; // L: 412
		field795 = 0; // L: 413
		showLoadingMessages = true; // L: 415
		players = new Player[2048]; // L: 417
		localPlayerIndex = -1; // L: 419
		field799 = 0; // L: 420
		renderSelf = true; // L: 422
		drawPlayerNames = 0; // L: 427
		field802 = 0; // L: 428
		field803 = new int[1000]; // L: 429
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
		field832 = 0; // L: 468
		field833 = 50; // L: 469
		isItemSelected = 0; // L: 470
		selectedItemName = null; // L: 474
		isSpellSelected = false; // L: 475
		selectedSpellChildIndex = -1; // L: 477
		field838 = -1; // L: 478
		selectedSpellActionName = null; // L: 480
		selectedSpellName = null; // L: 481
		rootInterface = -1; // L: 482
		interfaceParents = new NodeHashTable(8); // L: 483
		field843 = 0; // L: 488
		field844 = -1; // L: 489
		chatEffects = 0; // L: 490
		field846 = 0; // L: 491
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
		field859 = false; // L: 504
		field860 = -1; // L: 505
		field861 = -1; // L: 506
		field705 = false; // L: 507
		field931 = -1; // L: 508
		field701 = -1; // L: 509
		isDraggingWidget = false; // L: 510
		cycleCntr = 1; // L: 515
		field867 = new int[32]; // L: 518
		field868 = 0; // L: 519
		changedItemContainers = new int[32]; // L: 520
		field941 = 0; // L: 521
		changedSkills = new int[32]; // L: 522
		changedSkillsCount = 0; // L: 523
		chatCycle = 0; // L: 524
		field874 = 0; // L: 525
		field875 = 0; // L: 526
		field885 = 0; // L: 527
		field852 = 0; // L: 528
		field878 = 0; // L: 529
		mouseWheelRotation = 0; // L: 532
		scriptEvents = new NodeDeque(); // L: 533
		field881 = new NodeDeque(); // L: 534
		field939 = new NodeDeque(); // L: 535
		widgetFlags = new NodeHashTable(512); // L: 536
		rootWidgetCount = 0; // L: 538
		field748 = -2; // L: 539
		field834 = new boolean[100]; // L: 540
		field758 = new boolean[100]; // L: 541
		field745 = new boolean[100]; // L: 542
		rootWidgetXs = new int[100]; // L: 543
		rootWidgetYs = new int[100]; // L: 544
		rootWidgetWidths = new int[100]; // L: 545
		rootWidgetHeights = new int[100]; // L: 546
		gameDrawingMode = 0; // L: 547
		field879 = 0L; // L: 548
		isResizable = true; // L: 549
		field896 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 556
		publicChatMode = 0; // L: 557
		tradeChatMode = 0; // L: 559
		field710 = ""; // L: 560
		field900 = new long[100]; // L: 562
		field901 = 0; // L: 563
		field902 = 0; // L: 565
		field903 = new int[128]; // L: 566
		field904 = new int[128]; // L: 567
		field905 = -1L; // L: 568
		field906 = -1; // L: 571
		mapIconCount = 0; // L: 572
		mapIconXs = new int[1000]; // L: 573
		mapIconYs = new int[1000]; // L: 574
		mapIcons = new Sprite[1000]; // L: 575
		destinationX = 0; // L: 576
		destinationY = 0; // L: 577
		minimapState = 0; // L: 584
		musicVolume = 255; // L: 585
		currentTrackGroupId = -1; // L: 586
		field916 = false; // L: 587
		soundEffectVolume = 127; // L: 589
		areaSoundEffectVolume = 127; // L: 590
		soundEffectCount = 0; // L: 595
		soundEffectIds = new int[50]; // L: 596
		queuedSoundEffectLoops = new int[50]; // L: 597
		queuedSoundEffectDelays = new int[50]; // L: 598
		soundLocations = new int[50]; // L: 599
		soundEffects = new SoundEffect[50]; // L: 600
		isCameraLocked = false; // L: 602
		field926 = new boolean[5]; // L: 614
		field927 = new int[5]; // L: 615
		field928 = new int[5]; // L: 616
		field898 = new int[5]; // L: 617
		field918 = new int[5]; // L: 618
		field873 = 256; // L: 619
		field932 = 205; // L: 620
		zoomHeight = 256; // L: 621
		zoomWidth = 320; // L: 622
		field865 = 1; // L: 623
		field753 = 32767; // L: 624
		field937 = 1; // L: 625
		field935 = 32767; // L: 626
		viewportOffsetX = 0; // L: 627
		viewportOffsetY = 0; // L: 628
		viewportWidth = 0; // L: 629
		viewportHeight = 0; // L: 630
		viewportZoom = 0; // L: 631
		playerAppearance = new PlayerAppearance(); // L: 633
		field945 = -1; // L: 634
		field895 = -1; // L: 635
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 637
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 639
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 642
		field950 = -1; // L: 649
		archiveLoaders = new ArrayList(10); // L: 650
		archiveLoadersDone = 0; // L: 651
		field953 = 0; // L: 652
		field877 = new ApproximateRouteStrategy(); // L: 661
		field695 = new int[50]; // L: 662
		field956 = new int[50]; // L: 663
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1977357922"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field879 = User.currentTimeMillis() + 500L; // L: 4226
		this.resizeJS(); // L: 4227
		if (rootInterface != -1) { // L: 4228
			this.resizeRoot(true);
		}

	} // L: 4229

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1060461771"
	)
	@Export("setUp")
	protected final void setUp() {
		FaceNormal.method3392(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 798
		Coord.port1 = gameBuild == 0 ? 43594 : worldId + 40000; // L: 799
		Coord.port2 = gameBuild == 0 ? 443 : worldId + 50000; // L: 800
		class41.port3 = Coord.port1; // L: 801
		PlayerAppearance.field2559 = class224.field2570; // L: 802
		MouseRecorder.field628 = class224.field2573; // L: 803
		FriendLoginUpdate.field3671 = class224.field2571; // L: 804
		MusicPatchPcmStream.field2516 = class224.field2572; // L: 805
		class52.urlRequester = new UrlRequester(); // L: 806
		this.setUpKeyboard(); // L: 807
		this.setUpMouse(); // L: 808
		class8.mouseWheel = this.mouseWheel(); // L: 809
		GrandExchangeOfferWorldComparator.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 810
		AccessFile var2 = null; // L: 813
		ClientPreferences var3 = new ClientPreferences(); // L: 814

		try {
			var2 = WorldMapID.getPreferencesFile("", GrandExchangeOfferWorldComparator.field58.name, false); // L: 816
			byte[] var4 = new byte[(int)var2.length()]; // L: 817

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 818 819 822
				var6 = var2.read(var4, var5, var4.length - var5); // L: 820
				if (var6 == -1) { // L: 821
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 824
		} catch (Exception var8) { // L: 826
		}

		try {
			if (var2 != null) { // L: 828
				var2.close();
			}
		} catch (Exception var7) { // L: 830
		}

		GrandExchangeOfferAgeComparator.clientPreferences = var3; // L: 833
		this.setUpClipboard(); // L: 834
		String var9 = PendingSpawn.null_string; // L: 836
		class60.applet = this; // L: 838
		if (var9 != null) { // L: 839
			class60.field453 = var9;
		}

		if (gameBuild != 0) { // L: 841
			displayFps = true;
		}

		class277.setWindowedMode(GrandExchangeOfferAgeComparator.clientPreferences.windowMode); // L: 842
		WorldMapLabelSize.friendSystem = new FriendSystem(UserComparator4.loginType); // L: 843
	} // L: 844

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1100660042"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 847
		this.doCycleJs5(); // L: 848

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 852
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 853
			} // L: 854

			if (var1 == null) { // L: 855
				int var45;
				try {
					if (class206.musicPlayerStatus == 1) { // L: 861
						var45 = class13.midiPcmStream.method3856(); // L: 862
						if (var45 > 0 && class13.midiPcmStream.isReady()) { // L: 863
							var45 -= MusicPatch.pcmSampleLength; // L: 864
							if (var45 < 0) { // L: 865
								var45 = 0;
							}

							class13.midiPcmStream.setPcmStreamVolume(var45); // L: 866
						} else {
							class13.midiPcmStream.clear(); // L: 869
							class13.midiPcmStream.removeAll(); // L: 870
							if (class23.musicTrackArchive != null) { // L: 871
								class206.musicPlayerStatus = 2;
							} else {
								class206.musicPlayerStatus = 0; // L: 872
							}

							InterfaceParent.musicTrack = null; // L: 873
							LoginType.soundCache = null; // L: 874
						}
					}
				} catch (Exception var64) { // L: 877
					var64.printStackTrace(); // L: 878
					class13.midiPcmStream.clear(); // L: 879
					class206.musicPlayerStatus = 0; // L: 880
					InterfaceParent.musicTrack = null; // L: 881
					LoginType.soundCache = null; // L: 882
					class23.musicTrackArchive = null; // L: 883
				}

				FriendSystem.playPcmPlayers(); // L: 886
				FriendSystem.method2017(); // L: 887
				synchronized(MouseHandler.MouseHandler_instance) { // L: 889
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 890
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 891
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 892
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 893
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 894
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 895
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 896
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 897
					MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 898
				} // L: 899

				if (class8.mouseWheel != null) { // L: 901
					var45 = class8.mouseWheel.useRotation(); // L: 902
					mouseWheelRotation = var45; // L: 903
				}

				if (gameState == 0) { // L: 905
					class336.load(); // L: 906
					WorldMapLabel.method519(); // L: 907
				} else if (gameState == 5) { // L: 909
					Canvas.doCycleTitle(this); // L: 910
					class336.load(); // L: 911
					WorldMapLabel.method519(); // L: 912
				} else if (gameState != 10 && gameState != 11) { // L: 914
					if (gameState == 20) { // L: 915
						Canvas.doCycleTitle(this); // L: 916
						this.doCycleLoggedOut(); // L: 917
					} else if (gameState == 25) { // L: 919
						GrandExchangeOfferAgeComparator.method243(false); // L: 920
						field734 = 0; // L: 921
						boolean var75 = true; // L: 922

						int var46;
						for (var46 = 0; var46 < GrandExchangeOffer.regionLandArchives.length; ++var46) { // L: 923
							if (class22.regionMapArchiveIds[var46] != -1 && GrandExchangeOffer.regionLandArchives[var46] == null) { // L: 924 925
								GrandExchangeOffer.regionLandArchives[var46] = Varcs.archive5.takeFile(class22.regionMapArchiveIds[var46], 0); // L: 926
								if (GrandExchangeOffer.regionLandArchives[var46] == null) { // L: 927
									var75 = false; // L: 928
									++field734; // L: 929
								}
							}

							if (WallDecoration.regionLandArchiveIds[var46] != -1 && GameShell.regionMapArchives[var46] == null) { // L: 933 934
								GameShell.regionMapArchives[var46] = Varcs.archive5.takeFileEncrypted(WallDecoration.regionLandArchiveIds[var46], 0, WorldMapEvent.xteaKeys[var46]); // L: 935
								if (GameShell.regionMapArchives[var46] == null) { // L: 936
									var75 = false; // L: 937
									++field734; // L: 938
								}
							}
						}

						if (!var75) { // L: 943
							field722 = 1; // L: 944
						} else {
							field848 = 0; // L: 947
							var75 = true; // L: 948

							int var5;
							Buffer var9;
							int var10;
							int var11;
							int var12;
							int var14;
							int var15;
							int var16;
							int var17;
							int var18;
							int var19;
							int var47;
							for (var46 = 0; var46 < GrandExchangeOffer.regionLandArchives.length; ++var46) { // L: 949
								byte[] var3 = GameShell.regionMapArchives[var46]; // L: 950
								if (var3 != null) { // L: 951
									var47 = (class52.regions[var46] >> 8) * 64 - FloorDecoration.baseX; // L: 952
									var5 = (class52.regions[var46] & 255) * 64 - WorldMapData_0.baseY; // L: 953
									if (isInInstance) { // L: 954
										var47 = 10; // L: 955
										var5 = 10; // L: 956
									}

									boolean var8 = true; // L: 961
									var9 = new Buffer(var3); // L: 962
									var10 = -1; // L: 963

									label1377:
									while (true) {
										var11 = var9.method5743(); // L: 965
										if (var11 == 0) { // L: 966
											var75 &= var8; // L: 999
											break;
										}

										var10 += var11; // L: 967
										var12 = 0; // L: 968
										boolean var13 = false; // L: 969

										while (true) {
											while (!var13) { // L: 971
												var14 = var9.readUShortSmart(); // L: 977
												if (var14 == 0) { // L: 978
													continue label1377;
												}

												var12 += var14 - 1; // L: 979
												var15 = var12 & 63; // L: 980
												var16 = var12 >> 6 & 63; // L: 981
												var17 = var9.readUnsignedByte() >> 2; // L: 982
												var18 = var47 + var16; // L: 983
												var19 = var15 + var5; // L: 984
												if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) { // L: 985
													ObjectDefinition var20 = ScriptEvent.getObjectDefinition(var10); // L: 986
													if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) { // L: 987
														if (!var20.needsModelFiles()) { // L: 988
															++field848; // L: 989
															var8 = false; // L: 990
														}

														var13 = true; // L: 992
													}
												}
											}

											var14 = var9.readUShortSmart(); // L: 972
											if (var14 == 0) { // L: 973
												break;
											}

											var9.readUnsignedByte(); // L: 974
										}
									}
								}
							}

							if (!var75) { // L: 1002
								field722 = 2; // L: 1003
							} else {
								if (field722 != 0) { // L: 1006
									AbstractWorldMapData.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
								}

								FriendSystem.playPcmPlayers(); // L: 1007
								ModeWhere.scene.clear(); // L: 1008

								for (var46 = 0; var46 < 4; ++var46) { // L: 1009
									collisionMaps[var46].clear();
								}

								int var48;
								for (var46 = 0; var46 < 4; ++var46) { // L: 1010
									for (var48 = 0; var48 < 104; ++var48) { // L: 1011
										for (var47 = 0; var47 < 104; ++var47) { // L: 1012
											Tiles.Tiles_renderFlags[var46][var48][var47] = 0; // L: 1013
										}
									}
								}

								FriendSystem.playPcmPlayers(); // L: 1017
								AbstractArchive.method4397(); // L: 1018
								var46 = GrandExchangeOffer.regionLandArchives.length; // L: 1019

								for (ObjectSound var65 = (ObjectSound)ObjectSound.objectSounds.last(); var65 != null; var65 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 1021
									if (var65.stream1 != null) { // L: 1022
										GrandExchangeEvents.pcmStreamMixer.removeSubStream(var65.stream1); // L: 1023
										var65.stream1 = null; // L: 1024
									}

									if (var65.stream2 != null) { // L: 1026
										GrandExchangeEvents.pcmStreamMixer.removeSubStream(var65.stream2); // L: 1027
										var65.stream2 = null; // L: 1028
									}
								}

								ObjectSound.objectSounds.clear(); // L: 1031
								GrandExchangeOfferAgeComparator.method243(true); // L: 1033
								int var6;
								int var7;
								int[] var10000;
								int var21;
								int var22;
								int var53;
								int var69;
								int var71;
								if (!isInInstance) { // L: 1034
									var48 = 0;

									label1309:
									while (true) {
										byte[] var49;
										if (var48 >= var46) {
											for (var48 = 0; var48 < var46; ++var48) { // L: 1063
												var47 = (class52.regions[var48] >> 8) * 64 - FloorDecoration.baseX; // L: 1064
												var5 = (class52.regions[var48] & 255) * 64 - WorldMapData_0.baseY; // L: 1065
												var49 = GrandExchangeOffer.regionLandArchives[var48]; // L: 1066
												if (var49 == null && AbstractWorldMapData.field198 < 800) { // L: 1067
													FriendSystem.playPcmPlayers(); // L: 1068
													method1838(var47, var5, 64, 64); // L: 1069
												}
											}

											GrandExchangeOfferAgeComparator.method243(true); // L: 1072
											var48 = 0;

											while (true) {
												if (var48 >= var46) {
													break label1309;
												}

												byte[] var4 = GameShell.regionMapArchives[var48]; // L: 1074
												if (var4 != null) { // L: 1075
													var5 = (class52.regions[var48] >> 8) * 64 - FloorDecoration.baseX; // L: 1076
													var6 = (class52.regions[var48] & 255) * 64 - WorldMapData_0.baseY; // L: 1077
													FriendSystem.playPcmPlayers(); // L: 1078
													Scene var51 = ModeWhere.scene; // L: 1079
													CollisionMap[] var52 = collisionMaps; // L: 1080
													var9 = new Buffer(var4); // L: 1082
													var10 = -1; // L: 1083

													while (true) {
														var11 = var9.method5743(); // L: 1085
														if (var11 == 0) { // L: 1086
															break;
														}

														var10 += var11; // L: 1087
														var12 = 0; // L: 1088

														while (true) {
															var71 = var9.readUShortSmart(); // L: 1090
															if (var71 == 0) { // L: 1091
																break;
															}

															var12 += var71 - 1; // L: 1092
															var14 = var12 & 63; // L: 1093
															var15 = var12 >> 6 & 63; // L: 1094
															var16 = var12 >> 12; // L: 1095
															var17 = var9.readUnsignedByte(); // L: 1096
															var18 = var17 >> 2; // L: 1097
															var19 = var17 & 3; // L: 1098
															var53 = var5 + var15; // L: 1099
															var21 = var14 + var6; // L: 1100
															if (var53 > 0 && var21 > 0 && var53 < 103 && var21 < 103) { // L: 1101
																var22 = var16; // L: 1102
																if ((Tiles.Tiles_renderFlags[1][var53][var21] & 2) == 2) { // L: 1103
																	var22 = var16 - 1;
																}

																CollisionMap var23 = null; // L: 1104
																if (var22 >= 0) { // L: 1105
																	var23 = var52[var22];
																}

																NPC.method2160(var16, var53, var21, var10, var19, var18, var51, var23); // L: 1106
															}
														}
													}
												}

												++var48; // L: 1073
											}
										}

										var47 = (class52.regions[var48] >> 8) * 64 - FloorDecoration.baseX; // L: 1036
										var5 = (class52.regions[var48] & 255) * 64 - WorldMapData_0.baseY; // L: 1037
										var49 = GrandExchangeOffer.regionLandArchives[var48]; // L: 1038
										if (var49 != null) { // L: 1039
											FriendSystem.playPcmPlayers(); // L: 1040
											var7 = GrandExchangeEvent.field78 * 8 - 48; // L: 1041
											var69 = AbstractWorldMapData.field198 * 8 - 48; // L: 1042
											CollisionMap[] var70 = collisionMaps; // L: 1043
											var10 = 0;

											label1306:
											while (true) {
												if (var10 >= 4) {
													Buffer var50 = new Buffer(var49); // L: 1052
													var11 = 0;

													while (true) {
														if (var11 >= 4) {
															break label1306;
														}

														for (var12 = 0; var12 < 64; ++var12) { // L: 1054
															for (var71 = 0; var71 < 64; ++var71) { // L: 1055
																HealthBarUpdate.loadTerrain(var50, var11, var47 + var12, var5 + var71, var7, var69, 0); // L: 1056
															}
														}

														++var11; // L: 1053
													}
												}

												for (var11 = 0; var11 < 64; ++var11) { // L: 1046
													for (var12 = 0; var12 < 64; ++var12) { // L: 1047
														if (var11 + var47 > 0 && var47 + var11 < 103 && var12 + var5 > 0 && var5 + var12 < 103) { // L: 1048
															var10000 = var70[var10].flags[var11 + var47];
															var10000[var5 + var12] &= -16777217;
														}
													}
												}

												++var10; // L: 1045
											}
										}

										++var48; // L: 1035
									}
								}

								int var24;
								int var25;
								int var26;
								int var27;
								int var28;
								int var29;
								int var30;
								int var32;
								int var33;
								int var34;
								int var54;
								int var58;
								if (isInInstance) { // L: 1114
									var48 = 0;

									label1242:
									while (true) {
										if (var48 >= 4) {
											for (var48 = 0; var48 < 13; ++var48) { // L: 1141
												for (var47 = 0; var47 < 13; ++var47) { // L: 1142
													var5 = instanceChunkTemplates[0][var48][var47]; // L: 1143
													if (var5 == -1) { // L: 1144
														method1838(var48 * 8, var47 * 8, 8, 8); // L: 1145
													}
												}
											}

											GrandExchangeOfferAgeComparator.method243(true); // L: 1149
											var48 = 0;

											while (true) {
												if (var48 >= 4) {
													break label1242;
												}

												FriendSystem.playPcmPlayers(); // L: 1151

												for (var47 = 0; var47 < 13; ++var47) { // L: 1152
													label1199:
													for (var5 = 0; var5 < 13; ++var5) { // L: 1153
														var6 = instanceChunkTemplates[var48][var47][var5]; // L: 1154
														if (var6 != -1) { // L: 1155
															var7 = var6 >> 24 & 3; // L: 1156
															var69 = var6 >> 1 & 3; // L: 1157
															var54 = var6 >> 14 & 1023; // L: 1158
															var10 = var6 >> 3 & 2047; // L: 1159
															var11 = (var54 / 8 << 8) + var10 / 8; // L: 1160

															for (var12 = 0; var12 < class52.regions.length; ++var12) { // L: 1161
																if (class52.regions[var12] == var11 && GameShell.regionMapArchives[var12] != null) { // L: 1162
																	byte[] var55 = GameShell.regionMapArchives[var12]; // L: 1163
																	var14 = var47 * 8; // L: 1164
																	var15 = var5 * 8; // L: 1165
																	var16 = (var54 & 7) * 8; // L: 1166
																	var17 = (var10 & 7) * 8; // L: 1167
																	Scene var56 = ModeWhere.scene; // L: 1168
																	CollisionMap[] var57 = collisionMaps; // L: 1169
																	Buffer var72 = new Buffer(var55); // L: 1171
																	var21 = -1; // L: 1172

																	while (true) {
																		var22 = var72.method5743(); // L: 1174
																		if (var22 == 0) { // L: 1175
																			continue label1199;
																		}

																		var21 += var22; // L: 1176
																		var58 = 0; // L: 1177

																		while (true) {
																			var24 = var72.readUShortSmart(); // L: 1179
																			if (var24 == 0) { // L: 1180
																				break;
																			}

																			var58 += var24 - 1; // L: 1181
																			var25 = var58 & 63; // L: 1182
																			var26 = var58 >> 6 & 63; // L: 1183
																			var27 = var58 >> 12; // L: 1184
																			var28 = var72.readUnsignedByte(); // L: 1185
																			var29 = var28 >> 2; // L: 1186
																			var30 = var28 & 3; // L: 1187
																			if (var7 == var27 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) { // L: 1188
																				ObjectDefinition var31 = ScriptEvent.getObjectDefinition(var21); // L: 1189
																				var32 = var14 + TextureProvider.method2906(var26 & 7, var25 & 7, var69, var31.sizeX, var31.sizeY, var30); // L: 1190
																				var33 = var15 + InterfaceParent.method1272(var26 & 7, var25 & 7, var69, var31.sizeX, var31.sizeY, var30); // L: 1191
																				if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) { // L: 1192
																					var34 = var48; // L: 1193
																					if ((Tiles.Tiles_renderFlags[1][var32][var33] & 2) == 2) { // L: 1194
																						var34 = var48 - 1;
																					}

																					CollisionMap var35 = null; // L: 1195
																					if (var34 >= 0) { // L: 1196
																						var35 = var57[var34];
																					}

																					NPC.method2160(var48, var32, var33, var21, var69 + var30 & 3, var29, var56, var35); // L: 1197
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}

												++var48; // L: 1150
											}
										}

										FriendSystem.playPcmPlayers(); // L: 1116

										for (var47 = 0; var47 < 13; ++var47) { // L: 1117
											for (var5 = 0; var5 < 13; ++var5) { // L: 1118
												boolean var68 = false; // L: 1119
												var7 = instanceChunkTemplates[var48][var47][var5]; // L: 1120
												if (var7 != -1) { // L: 1121
													var69 = var7 >> 24 & 3; // L: 1122
													var54 = var7 >> 1 & 3; // L: 1123
													var10 = var7 >> 14 & 1023; // L: 1124
													var11 = var7 >> 3 & 2047; // L: 1125
													var12 = (var10 / 8 << 8) + var11 / 8; // L: 1126

													for (var71 = 0; var71 < class52.regions.length; ++var71) { // L: 1127
														if (class52.regions[var71] == var12 && GrandExchangeOffer.regionLandArchives[var71] != null) { // L: 1128
															MouseHandler.method1174(GrandExchangeOffer.regionLandArchives[var71], var48, var47 * 8, var5 * 8, var69, (var10 & 7) * 8, (var11 & 7) * 8, var54, collisionMaps); // L: 1129
															var68 = true; // L: 1130
															break; // L: 1131
														}
													}
												}

												if (!var68) { // L: 1135
													NetFileRequest.method4293(var48, var47 * 8, var5 * 8); // L: 1136
												}
											}
										}

										++var48; // L: 1115
									}
								}

								GrandExchangeOfferAgeComparator.method243(true); // L: 1211
								FriendSystem.playPcmPlayers(); // L: 1212
								Scene var66 = ModeWhere.scene; // L: 1213
								CollisionMap[] var67 = collisionMaps; // L: 1214

								for (var5 = 0; var5 < 4; ++var5) { // L: 1216
									for (var6 = 0; var6 < 104; ++var6) { // L: 1217
										for (var7 = 0; var7 < 104; ++var7) { // L: 1218
											if ((Tiles.Tiles_renderFlags[var5][var6][var7] & 1) == 1) { // L: 1219
												var69 = var5; // L: 1220
												if ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 1221
													var69 = var5 - 1;
												}

												if (var69 >= 0) { // L: 1222
													var67[var69].setBlockedByFloor(var6, var7);
												}
											}
										}
									}
								}

								Tiles.field539 += (int)(Math.random() * 5.0D) - 2; // L: 1227
								if (Tiles.field539 < -8) { // L: 1228
									Tiles.field539 = -8;
								}

								if (Tiles.field539 > 8) { // L: 1229
									Tiles.field539 = 8;
								}

								Tiles.field540 += (int)(Math.random() * 5.0D) - 2; // L: 1230
								if (Tiles.field540 < -16) { // L: 1231
									Tiles.field540 = -16;
								}

								if (Tiles.field540 > 16) { // L: 1232
									Tiles.field540 = 16;
								}

								for (var5 = 0; var5 < 4; ++var5) { // L: 1233
									byte[][] var76 = class299.field3679[var5]; // L: 1234
									var12 = (int)Math.sqrt(5100.0D); // L: 1240
									var71 = var12 * 768 >> 8; // L: 1241

									for (var14 = 1; var14 < 103; ++var14) { // L: 1242
										for (var15 = 1; var15 < 103; ++var15) { // L: 1243
											var16 = Tiles.Tiles_heights[var5][var15 + 1][var14] - Tiles.Tiles_heights[var5][var15 - 1][var14]; // L: 1244
											var17 = Tiles.Tiles_heights[var5][var15][var14 + 1] - Tiles.Tiles_heights[var5][var15][var14 - 1]; // L: 1245
											var18 = (int)Math.sqrt((double)(var16 * var16 + var17 * var17 + 65536)); // L: 1246
											var19 = (var16 << 8) / var18; // L: 1247
											var53 = 65536 / var18; // L: 1248
											var21 = (var17 << 8) / var18; // L: 1249
											var22 = (var19 * -50 + var21 * -50 + var53 * -10) / var71 + 96; // L: 1250
											var58 = (var76[var15 - 1][var14] >> 2) + (var76[var15][var14 - 1] >> 2) + (var76[var15 + 1][var14] >> 3) + (var76[var15][var14 + 1] >> 3) + (var76[var15][var14] >> 1); // L: 1251
											UserComparator10.field1999[var15][var14] = var22 - var58; // L: 1252
										}
									}

									for (var14 = 0; var14 < 104; ++var14) { // L: 1255
										GrandExchangeOfferOwnWorldComparator.Tiles_hue[var14] = 0; // L: 1256
										class238.Tiles_saturation[var14] = 0; // L: 1257
										TileItemPile.Tiles_lightness[var14] = 0; // L: 1258
										class248.Tiles_hueMultiplier[var14] = 0; // L: 1259
										class1.field1[var14] = 0; // L: 1260
									}

									for (var14 = -5; var14 < 109; ++var14) { // L: 1262
										for (var15 = 0; var15 < 104; ++var15) { // L: 1263
											var16 = var14 + 5; // L: 1264
											int var10002;
											if (var16 >= 0 && var16 < 104) { // L: 1265
												var17 = TileItem.field1273[var5][var16][var15] & 255; // L: 1266
												if (var17 > 0) { // L: 1267
													FloorUnderlayDefinition var79 = class234.method4260(var17 - 1); // L: 1268
													var10000 = GrandExchangeOfferOwnWorldComparator.Tiles_hue; // L: 1269
													var10000[var15] += var79.hue;
													var10000 = class238.Tiles_saturation; // L: 1270
													var10000[var15] += var79.saturation;
													var10000 = TileItemPile.Tiles_lightness; // L: 1271
													var10000[var15] += var79.lightness;
													var10000 = class248.Tiles_hueMultiplier; // L: 1272
													var10000[var15] += var79.hueMultiplier;
													var10002 = class1.field1[var15]++; // L: 1273
												}
											}

											var17 = var14 - 5; // L: 1276
											if (var17 >= 0 && var17 < 104) { // L: 1277
												var18 = TileItem.field1273[var5][var17][var15] & 255; // L: 1278
												if (var18 > 0) { // L: 1279
													FloorUnderlayDefinition var80 = class234.method4260(var18 - 1); // L: 1280
													var10000 = GrandExchangeOfferOwnWorldComparator.Tiles_hue; // L: 1281
													var10000[var15] -= var80.hue;
													var10000 = class238.Tiles_saturation; // L: 1282
													var10000[var15] -= var80.saturation;
													var10000 = TileItemPile.Tiles_lightness; // L: 1283
													var10000[var15] -= var80.lightness;
													var10000 = class248.Tiles_hueMultiplier; // L: 1284
													var10000[var15] -= var80.hueMultiplier;
													var10002 = class1.field1[var15]--; // L: 1285
												}
											}
										}

										if (var14 >= 1 && var14 < 103) { // L: 1289
											var15 = 0; // L: 1290
											var16 = 0; // L: 1291
											var17 = 0; // L: 1292
											var18 = 0; // L: 1293
											var19 = 0; // L: 1294

											for (var53 = -5; var53 < 109; ++var53) { // L: 1295
												var21 = var53 + 5; // L: 1296
												if (var21 >= 0 && var21 < 104) { // L: 1297
													var15 += GrandExchangeOfferOwnWorldComparator.Tiles_hue[var21]; // L: 1298
													var16 += class238.Tiles_saturation[var21]; // L: 1299
													var17 += TileItemPile.Tiles_lightness[var21]; // L: 1300
													var18 += class248.Tiles_hueMultiplier[var21]; // L: 1301
													var19 += class1.field1[var21]; // L: 1302
												}

												var22 = var53 - 5; // L: 1304
												if (var22 >= 0 && var22 < 104) { // L: 1305
													var15 -= GrandExchangeOfferOwnWorldComparator.Tiles_hue[var22]; // L: 1306
													var16 -= class238.Tiles_saturation[var22]; // L: 1307
													var17 -= TileItemPile.Tiles_lightness[var22]; // L: 1308
													var18 -= class248.Tiles_hueMultiplier[var22]; // L: 1309
													var19 -= class1.field1[var22]; // L: 1310
												}

												if (var53 >= 1 && var53 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var53] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var53] & 16) == 0)) { // L: 1312 1313 1314 1315
													if (var5 < Tiles.Tiles_minPlane) { // L: 1318
														Tiles.Tiles_minPlane = var5;
													}

													var58 = TileItem.field1273[var5][var14][var53] & 255; // L: 1319
													var24 = NPC.field1161[var5][var14][var53] & 255; // L: 1320
													if (var58 > 0 || var24 > 0) { // L: 1321
														var25 = Tiles.Tiles_heights[var5][var14][var53]; // L: 1322
														var26 = Tiles.Tiles_heights[var5][var14 + 1][var53]; // L: 1323
														var27 = Tiles.Tiles_heights[var5][var14 + 1][var53 + 1]; // L: 1324
														var28 = Tiles.Tiles_heights[var5][var14][var53 + 1]; // L: 1325
														var29 = UserComparator10.field1999[var14][var53]; // L: 1326
														var30 = UserComparator10.field1999[var14 + 1][var53]; // L: 1327
														int var59 = UserComparator10.field1999[var14 + 1][var53 + 1]; // L: 1328
														var32 = UserComparator10.field1999[var14][var53 + 1]; // L: 1329
														var33 = -1; // L: 1330
														var34 = -1; // L: 1331
														int var36;
														int var60;
														if (var58 > 0) { // L: 1332
															var60 = var15 * 256 / var18; // L: 1333
															var36 = var16 / var19; // L: 1334
															int var37 = var17 / var19; // L: 1335
															var33 = WorldMapEvent.hslToRgb(var60, var36, var37); // L: 1336
															var60 = var60 + Tiles.field539 & 255; // L: 1337
															var37 += Tiles.field540; // L: 1338
															if (var37 < 0) { // L: 1339
																var37 = 0;
															} else if (var37 > 255) { // L: 1340
																var37 = 255;
															}

															var34 = WorldMapEvent.hslToRgb(var60, var36, var37); // L: 1341
														}

														if (var5 > 0) { // L: 1343
															boolean var81 = true; // L: 1344
															if (var58 == 0 && Tiles.field531[var5][var14][var53] != 0) { // L: 1345
																var81 = false;
															}

															if (var24 > 0 && !PendingSpawn.method1839(var24 - 1).hideUnderlay) { // L: 1346
																var81 = false;
															}

															if (var81 && var26 == var25 && var25 == var27 && var25 == var28) { // L: 1347 1348
																var10000 = UserComparator10.field2000[var5][var14];
																var10000[var53] |= 2340;
															}
														}

														var60 = 0; // L: 1351
														if (var34 != -1) { // L: 1352
															var60 = Rasterizer3D.Rasterizer3D_colorPalette[VarcInt.method4555(var34, 96)];
														}

														if (var24 == 0) { // L: 1353
															var66.addTile(var5, var14, var53, 0, 0, -1, var25, var26, var27, var28, VarcInt.method4555(var33, var29), VarcInt.method4555(var33, var30), VarcInt.method4555(var33, var59), VarcInt.method4555(var33, var32), 0, 0, 0, 0, var60, 0); // L: 1354
														} else {
															var36 = Tiles.field531[var5][var14][var53] + 1; // L: 1357
															byte var74 = UserComparator2.field3859[var5][var14][var53]; // L: 1358
															FloorOverlayDefinition var38 = PendingSpawn.method1839(var24 - 1); // L: 1359
															int var39 = var38.texture; // L: 1360
															int var40;
															int var41;
															int var42;
															int var43;
															if (var39 >= 0) { // L: 1363
																var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var39); // L: 1364
																var40 = -1; // L: 1365
															} else if (var38.primaryRgb == 16711935) { // L: 1368
																var40 = -2; // L: 1369
																var39 = -1; // L: 1370
																var41 = -2; // L: 1371
															} else {
																var40 = WorldMapEvent.hslToRgb(var38.hue, var38.saturation, var38.lightness); // L: 1374
																var42 = var38.hue + Tiles.field539 & 255; // L: 1375
																var43 = var38.lightness + Tiles.field540; // L: 1376
																if (var43 < 0) { // L: 1377
																	var43 = 0;
																} else if (var43 > 255) { // L: 1378
																	var43 = 255;
																}

																var41 = WorldMapEvent.hslToRgb(var42, var38.saturation, var43); // L: 1379
															}

															var42 = 0; // L: 1382
															if (var41 != -2) { // L: 1383
																var42 = Rasterizer3D.Rasterizer3D_colorPalette[class1.method20(var41, 96)];
															}

															if (var38.secondaryRgb != -1) { // L: 1384
																var43 = var38.secondaryHue + Tiles.field539 & 255; // L: 1385
																int var44 = var38.secondaryLightness + Tiles.field540; // L: 1386
																if (var44 < 0) { // L: 1387
																	var44 = 0;
																} else if (var44 > 255) { // L: 1388
																	var44 = 255;
																}

																var41 = WorldMapEvent.hslToRgb(var43, var38.secondarySaturation, var44); // L: 1389
																var42 = Rasterizer3D.Rasterizer3D_colorPalette[class1.method20(var41, 96)]; // L: 1390
															}

															var66.addTile(var5, var14, var53, var36, var74, var39, var25, var26, var27, var28, VarcInt.method4555(var33, var29), VarcInt.method4555(var33, var30), VarcInt.method4555(var33, var59), VarcInt.method4555(var33, var32), class1.method20(var40, var29), class1.method20(var40, var30), class1.method20(var40, var59), class1.method20(var40, var32), var60, var42); // L: 1392
														}
													}
												}
											}
										}
									}

									for (var14 = 1; var14 < 103; ++var14) { // L: 1399
										for (var15 = 1; var15 < 103; ++var15) { // L: 1400
											if ((Tiles.Tiles_renderFlags[var5][var15][var14] & 8) != 0) { // L: 1407
												var53 = 0; // L: 1408
											} else if (var5 > 0 && (Tiles.Tiles_renderFlags[1][var15][var14] & 2) != 0) { // L: 1411
												var53 = var5 - 1; // L: 1412
											} else {
												var53 = var5; // L: 1415
											}

											var66.setTileMinPlane(var5, var15, var14, var53); // L: 1417
										}
									}

									TileItem.field1273[var5] = null; // L: 1420
									NPC.field1161[var5] = null; // L: 1421
									Tiles.field531[var5] = null; // L: 1422
									UserComparator2.field3859[var5] = null; // L: 1423
									class299.field3679[var5] = null; // L: 1424
								}

								var66.method3248(-50, -10, -50); // L: 1426

								for (var5 = 0; var5 < 104; ++var5) { // L: 1427
									for (var6 = 0; var6 < 104; ++var6) { // L: 1428
										if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) { // L: 1429
											var66.setLinkBelow(var5, var6);
										}
									}
								}

								var5 = 1; // L: 1432
								var6 = 2; // L: 1433
								var7 = 4; // L: 1434

								for (var69 = 0; var69 < 4; ++var69) { // L: 1435
									if (var69 > 0) { // L: 1436
										var5 <<= 3; // L: 1437
										var6 <<= 3; // L: 1438
										var7 <<= 3; // L: 1439
									}

									for (var54 = 0; var54 <= var69; ++var54) { // L: 1441
										for (var10 = 0; var10 <= 104; ++var10) { // L: 1442
											for (var11 = 0; var11 <= 104; ++var11) { // L: 1443
												short var73;
												if ((UserComparator10.field2000[var54][var11][var10] & var5) != 0) { // L: 1444
													var12 = var10; // L: 1445
													var71 = var10; // L: 1446
													var14 = var54; // L: 1447

													for (var15 = var54; var12 > 0 && (UserComparator10.field2000[var54][var11][var12 - 1] & var5) != 0; --var12) { // L: 1448 1449
													}

													while (var71 < 104 && (UserComparator10.field2000[var54][var11][var71 + 1] & var5) != 0) { // L: 1450
														++var71;
													}

													label918:
													while (var14 > 0) { // L: 1451
														for (var16 = var12; var16 <= var71; ++var16) { // L: 1452
															if ((UserComparator10.field2000[var14 - 1][var11][var16] & var5) == 0) {
																break label918;
															}
														}

														--var14; // L: 1453
													}

													label907:
													while (var15 < var69) { // L: 1455
														for (var16 = var12; var16 <= var71; ++var16) { // L: 1456
															if ((UserComparator10.field2000[var15 + 1][var11][var16] & var5) == 0) {
																break label907;
															}
														}

														++var15; // L: 1457
													}

													var16 = (var71 - var12 + 1) * (var15 + 1 - var14); // L: 1459
													if (var16 >= 8) { // L: 1460
														var73 = 240; // L: 1461
														var18 = Tiles.Tiles_heights[var15][var11][var12] - var73; // L: 1462
														var19 = Tiles.Tiles_heights[var14][var11][var12]; // L: 1463
														Scene.Scene_addOccluder(var69, 1, var11 * 128, var11 * 128, var12 * 128, var71 * 128 + 128, var18, var19); // L: 1464

														for (var53 = var14; var53 <= var15; ++var53) { // L: 1465
															for (var21 = var12; var21 <= var71; ++var21) { // L: 1466
																var10000 = UserComparator10.field2000[var53][var11];
																var10000[var21] &= ~var5;
															}
														}
													}
												}

												if ((UserComparator10.field2000[var54][var11][var10] & var6) != 0) { // L: 1470
													var12 = var11; // L: 1471
													var71 = var11; // L: 1472
													var14 = var54; // L: 1473

													for (var15 = var54; var12 > 0 && (UserComparator10.field2000[var54][var12 - 1][var10] & var6) != 0; --var12) { // L: 1474 1475
													}

													while (var71 < 104 && (UserComparator10.field2000[var54][var71 + 1][var10] & var6) != 0) { // L: 1476
														++var71;
													}

													label971:
													while (var14 > 0) { // L: 1477
														for (var16 = var12; var16 <= var71; ++var16) { // L: 1478
															if ((UserComparator10.field2000[var14 - 1][var16][var10] & var6) == 0) {
																break label971;
															}
														}

														--var14; // L: 1479
													}

													label960:
													while (var15 < var69) { // L: 1481
														for (var16 = var12; var16 <= var71; ++var16) { // L: 1482
															if ((UserComparator10.field2000[var15 + 1][var16][var10] & var6) == 0) {
																break label960;
															}
														}

														++var15; // L: 1483
													}

													var16 = (var71 - var12 + 1) * (var15 + 1 - var14); // L: 1485
													if (var16 >= 8) { // L: 1486
														var73 = 240; // L: 1487
														var18 = Tiles.Tiles_heights[var15][var12][var10] - var73; // L: 1488
														var19 = Tiles.Tiles_heights[var14][var12][var10]; // L: 1489
														Scene.Scene_addOccluder(var69, 2, var12 * 128, var71 * 128 + 128, var10 * 128, var10 * 128, var18, var19); // L: 1490

														for (var53 = var14; var53 <= var15; ++var53) { // L: 1491
															for (var21 = var12; var21 <= var71; ++var21) { // L: 1492
																var10000 = UserComparator10.field2000[var53][var21];
																var10000[var10] &= ~var6;
															}
														}
													}
												}

												if ((UserComparator10.field2000[var54][var11][var10] & var7) != 0) { // L: 1496
													var12 = var11; // L: 1497
													var71 = var11; // L: 1498
													var14 = var10; // L: 1499

													for (var15 = var10; var14 > 0 && (UserComparator10.field2000[var54][var11][var14 - 1] & var7) != 0; --var14) { // L: 1500 1501
													}

													while (var15 < 104 && (UserComparator10.field2000[var54][var11][var15 + 1] & var7) != 0) { // L: 1502
														++var15;
													}

													label1024:
													while (var12 > 0) { // L: 1503
														for (var16 = var14; var16 <= var15; ++var16) { // L: 1504
															if ((UserComparator10.field2000[var54][var12 - 1][var16] & var7) == 0) {
																break label1024;
															}
														}

														--var12; // L: 1505
													}

													label1013:
													while (var71 < 104) { // L: 1507
														for (var16 = var14; var16 <= var15; ++var16) { // L: 1508
															if ((UserComparator10.field2000[var54][var71 + 1][var16] & var7) == 0) {
																break label1013;
															}
														}

														++var71; // L: 1509
													}

													if ((var71 - var12 + 1) * (var15 - var14 + 1) >= 4) { // L: 1511
														var16 = Tiles.Tiles_heights[var54][var12][var14]; // L: 1512
														Scene.Scene_addOccluder(var69, 4, var12 * 128, var71 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16); // L: 1513

														for (var17 = var12; var17 <= var71; ++var17) { // L: 1514
															for (var18 = var14; var18 <= var15; ++var18) { // L: 1515
																var10000 = UserComparator10.field2000[var54][var17];
																var10000[var18] &= ~var7;
															}
														}
													}
												}
											}
										}
									}
								}

								GrandExchangeOfferAgeComparator.method243(true); // L: 1524
								var5 = Tiles.Tiles_minPlane; // L: 1525
								if (var5 > GrandExchangeOfferUnitPriceComparator.Client_plane) { // L: 1526
									var5 = GrandExchangeOfferUnitPriceComparator.Client_plane;
								}

								if (var5 < GrandExchangeOfferUnitPriceComparator.Client_plane - 1) { // L: 1527
									var5 = GrandExchangeOfferUnitPriceComparator.Client_plane - 1;
								}

								if (isLowDetail) { // L: 1528
									ModeWhere.scene.init(Tiles.Tiles_minPlane);
								} else {
									ModeWhere.scene.init(0); // L: 1529
								}

								for (var6 = 0; var6 < 104; ++var6) { // L: 1530
									for (var7 = 0; var7 < 104; ++var7) { // L: 1531
										class41.updateItemPile(var6, var7); // L: 1532
									}
								}

								FriendSystem.playPcmPlayers(); // L: 1535

								for (PendingSpawn var77 = (PendingSpawn)pendingSpawns.last(); var77 != null; var77 = (PendingSpawn)pendingSpawns.previous()) { // L: 1537 1538 1544
									if (var77.hitpoints == -1) { // L: 1539
										var77.delay = 0; // L: 1540
										JagexCache.method3619(var77); // L: 1541
									} else {
										var77.remove(); // L: 1543
									}
								}

								ObjectDefinition.ObjectDefinition_cachedModelData.clear(); // L: 1547
								PacketBufferNode var78;
								if (ByteArrayPool.client.hasFrame()) { // L: 1548
									var78 = class4.getPacketBufferNode(ClientPacket.field2330, packetWriter.isaacCipher); // L: 1550
									var78.packetBuffer.writeInt(1057001181); // L: 1551
									packetWriter.addNode(var78); // L: 1552
								}

								if (!isInInstance) { // L: 1554
									var6 = (GrandExchangeEvent.field78 - 6) / 8; // L: 1555
									var7 = (GrandExchangeEvent.field78 + 6) / 8; // L: 1556
									var69 = (AbstractWorldMapData.field198 - 6) / 8; // L: 1557
									var54 = (AbstractWorldMapData.field198 + 6) / 8; // L: 1558

									for (var10 = var6 - 1; var10 <= var7 + 1; ++var10) { // L: 1559
										for (var11 = var69 - 1; var11 <= var54 + 1; ++var11) { // L: 1560
											if (var10 < var6 || var10 > var7 || var11 < var69 || var11 > var54) { // L: 1561
												Varcs.archive5.loadRegionFromName("m" + var10 + "_" + var11); // L: 1562
												Varcs.archive5.loadRegionFromName("l" + var10 + "_" + var11); // L: 1563
											}
										}
									}
								}

								BuddyRankComparator.updateGameState(30); // L: 1567
								FriendSystem.playPcmPlayers(); // L: 1568
								TileItem.field1273 = null; // L: 1570
								NPC.field1161 = null; // L: 1571
								Tiles.field531 = null; // L: 1572
								UserComparator2.field3859 = null; // L: 1573
								UserComparator10.field2000 = null; // L: 1574
								class299.field3679 = null; // L: 1575
								UserComparator10.field1999 = null; // L: 1576
								GrandExchangeOfferOwnWorldComparator.Tiles_hue = null; // L: 1577
								class238.Tiles_saturation = null; // L: 1578
								TileItemPile.Tiles_lightness = null; // L: 1579
								class248.Tiles_hueMultiplier = null; // L: 1580
								class1.field1 = null; // L: 1581
								var78 = class4.getPacketBufferNode(ClientPacket.field2319, packetWriter.isaacCipher); // L: 1583
								packetWriter.addNode(var78); // L: 1584
								WorldMapLabel.method519(); // L: 1585
							}
						}
					}
				} else {
					Canvas.doCycleTitle(this);
				}

				if (gameState == 30) { // L: 1587
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1588
					this.doCycleLoggedOut();
				}

				return; // L: 1589
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 856
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1812204618"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = GrandExchangeOfferTotalQuantityComparator.method174(); // L: 1592
		if (var2 && field916 && class195.pcmPlayer0 != null) { // L: 1593 1594
			class195.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field879 != 0L && User.currentTimeMillis() > field879) { // L: 1596 1597
			class277.setWindowedMode(UrlRequester.getWindowedMode()); // L: 1598
		}

		int var3;
		if (var1) { // L: 1601
			for (var3 = 0; var3 < 100; ++var3) { // L: 1602
				field834[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1604
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1605
			class60.drawTitle(ReflectionCheck.fontBold12, DevicePcmPlayerProvider.fontPlain11, WorldMapCacheName.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1606
			if (gameState == 20) { // L: 1607
				class60.drawTitle(ReflectionCheck.fontBold12, DevicePcmPlayerProvider.fontPlain11, WorldMapCacheName.fontPlain12);
			} else if (gameState == 25) { // L: 1608
				if (field722 == 1) { // L: 1609
					if (field734 > field735) { // L: 1610
						field735 = field734;
					}

					var3 = (field735 * 50 - field734 * 50) / field735; // L: 1611
					AbstractWorldMapData.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1612
				} else if (field722 == 2) { // L: 1614
					if (field848 > field737) { // L: 1615
						field737 = field848;
					}

					var3 = (field737 * 50 - field848 * 50) / field737 + 50; // L: 1616
					AbstractWorldMapData.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1617
				} else {
					AbstractWorldMapData.drawLoadingMessage("Loading - please wait.", false); // L: 1619
				}
			} else if (gameState == 30) { // L: 1621
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1622
				AbstractWorldMapData.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1623
				AbstractWorldMapData.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class60.drawTitle(ReflectionCheck.fontBold12, DevicePcmPlayerProvider.fontPlain11, WorldMapCacheName.fontPlain12); // L: 1613
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1624
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1625
				if (field758[var3]) { // L: 1626
					class22.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1627
					field758[var3] = false; // L: 1628
				}
			}
		} else if (gameState > 0) { // L: 1632
			class22.rasterProvider.drawFull(0, 0); // L: 1633

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1634
				field758[var3] = false;
			}
		}

	} // L: 1636

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	@Export("kill0")
	protected final void kill0() {
		if (FriendSystem.varcs.hasUnwrittenChanges()) { // L: 1639
			FriendSystem.varcs.write();
		}

		if (class204.mouseRecorder != null) { // L: 1640
			class204.mouseRecorder.isRunning = false;
		}

		class204.mouseRecorder = null; // L: 1641
		packetWriter.close(); // L: 1642
		if (KeyHandler.KeyHandler_instance != null) { // L: 1644
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1645
				KeyHandler.KeyHandler_instance = null; // L: 1646
			} // L: 1647
		}

		NPC.method2146(); // L: 1650
		class8.mouseWheel = null; // L: 1651
		if (class195.pcmPlayer0 != null) { // L: 1652
			class195.pcmPlayer0.shutdown();
		}

		if (class23.pcmPlayer1 != null) { // L: 1653
			class23.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1655
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1658
			if (ArchiveDiskActionHandler.field3176 != 0) { // L: 1659
				ArchiveDiskActionHandler.field3176 = 1; // L: 1660

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1662
				} catch (InterruptedException var4) { // L: 1664
				}
			}
		}

		if (class52.urlRequester != null) { // L: 1668
			class52.urlRequester.close(); // L: 1669
			class52.urlRequester = null; // L: 1670
		}

		InterfaceParent.method1270(); // L: 1672
	} // L: 1673

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	protected final void vmethod1384() {
	} // L: 670

	public final void init() {
		try {
			if (this.checkHost()) { // L: 676
				for (int var1 = 0; var1 <= 20; ++var1) { // L: 677
					String var2 = this.getParameter(Integer.toString(var1)); // L: 678
					if (var2 != null) { // L: 679
						switch(var1) { // L: 680
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 765
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 688
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 689
							}
							break;
						case 4:
							if (clientType == -1) { // L: 751
								clientType = Integer.parseInt(var2); // L: 752
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 770
							break;
						case 6:
							FontName.clientLanguage = Language.method3800(Integer.parseInt(var2)); // L: 694
							break; // L: 695
						case 7:
							int var4 = Integer.parseInt(var2); // L: 726
							GameBuild[] var5 = new GameBuild[]{GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.WIP}; // L: 731
							GameBuild[] var6 = var5; // L: 733
							int var7 = 0;

							GameBuild var3;
							while (true) {
								if (var7 >= var6.length) {
									var3 = null; // L: 744
									break;
								}

								GameBuild var8 = var6[var7]; // L: 735
								if (var4 == var8.buildId) { // L: 737
									var3 = var8; // L: 738
									break; // L: 739
								}

								++var7; // L: 734
							}

							ChatChannel.field1334 = var3; // L: 746
							break; // L: 747
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 704
							}
							break;
						case 9:
							WorldMapRegion.field281 = var2; // L: 715
							break; // L: 716
						case 10:
							GrandExchangeOfferWorldComparator.field58 = (StudioGame)class195.findEnumerated(TileItem.method2237(), Integer.parseInt(var2)); // L: 758
							if (StudioGame.oldscape == GrandExchangeOfferWorldComparator.field58) { // L: 759
								UserComparator4.loginType = LoginType.oldscape;
							} else {
								UserComparator4.loginType = LoginType.field4061; // L: 760
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 710
							break; // L: 711
						case 14:
							TextureProvider.field1561 = Integer.parseInt(var2); // L: 720
							break; // L: 721
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 699
							break; // L: 700
						case 17:
							PcmPlayer.worldListURL = var2; // L: 683
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 777
				isLowDetail = false; // L: 778
				UserComparator6.worldHost = this.getCodeBase().getHost(); // L: 780
				String var9 = ChatChannel.field1334.name; // L: 781
				byte var10 = 0; // L: 782

				try {
					MusicPatchPcmStream.method4041("oldschool", var9, var10, 21); // L: 784
				} catch (Exception var11) { // L: 786
					PacketWriter.RunException_sendStackTrace((String)null, var11); // L: 787
				}

				ByteArrayPool.client = this; // L: 789
				NetFileRequest.clientType = clientType; // L: 790
				if (field686 == -1) { // L: 791
					field686 = 0; // L: 792
				}

				this.startThread(765, 503, 192); // L: 794
			}
		} catch (RuntimeException var12) {
			throw Login.newRunException(var12, "client.init(" + ')');
		}
	} // L: 795

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "627377805"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1732
			boolean var1 = Occluder.method3411(); // L: 1733
			if (!var1) { // L: 1734
				this.doCycleJs5Connect();
			}

		}
	} // L: 1735

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1738
			this.error("js5crc"); // L: 1739
			gameState = 1000; // L: 1740
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1743
				if (gameState <= 5) { // L: 1744
					this.error("js5io"); // L: 1745
					gameState = 1000; // L: 1746
					return; // L: 1747
				}

				field794 = 3000; // L: 1750
				NetCache.NetCache_ioExceptions = 3; // L: 1751
			}

			if (--field794 + 1 <= 0) { // L: 1754
				try {
					if (js5ConnectState == 0) { // L: 1756
						UserComparator10.js5SocketTask = GameShell.taskHandler.newSocketTask(UserComparator6.worldHost, class41.port3); // L: 1757
						++js5ConnectState; // L: 1758
					}

					if (js5ConnectState == 1) { // L: 1760
						if (UserComparator10.js5SocketTask.status == 2) { // L: 1761
							this.js5Error(-1); // L: 1762
							return; // L: 1763
						}

						if (UserComparator10.js5SocketTask.status == 1) { // L: 1765
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1767
						if (useBufferedSocket) { // L: 1768
							Socket var2 = (Socket)UserComparator10.js5SocketTask.result; // L: 1770
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1772
							KeyHandler.js5Socket = var1; // L: 1774
						} else {
							KeyHandler.js5Socket = new NetSocket((Socket)UserComparator10.js5SocketTask.result, GameShell.taskHandler, 5000); // L: 1777
						}

						Buffer var11 = new Buffer(5); // L: 1779
						var11.writeByte(15); // L: 1780
						var11.writeInt(192); // L: 1781
						KeyHandler.js5Socket.write(var11.array, 0, 5); // L: 1782
						++js5ConnectState; // L: 1783
						field696 = User.currentTimeMillis(); // L: 1784
					}

					if (js5ConnectState == 3) { // L: 1786
						if (KeyHandler.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1787
							int var5 = KeyHandler.js5Socket.readUnsignedByte(); // L: 1788
							if (var5 != 0) { // L: 1789
								this.js5Error(var5); // L: 1790
								return; // L: 1791
							}

							++js5ConnectState; // L: 1793
						} else if (User.currentTimeMillis() - field696 > 30000L) { // L: 1796
							this.js5Error(-2); // L: 1797
							return; // L: 1798
						}
					}

					if (js5ConnectState == 4) { // L: 1802
						AbstractSocket var12 = KeyHandler.js5Socket; // L: 1803
						boolean var6 = gameState > 20; // L: 1804
						if (NetCache.NetCache_socket != null) { // L: 1806
							try {
								NetCache.NetCache_socket.close(); // L: 1808
							} catch (Exception var9) { // L: 1810
							}

							NetCache.NetCache_socket = null; // L: 1811
						}

						NetCache.NetCache_socket = var12; // L: 1813
						WorldMapSection0.method323(var6); // L: 1814
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1815
						NetCache.NetCache_currentResponse = null; // L: 1816
						NetCache.NetCache_responseArchiveBuffer = null; // L: 1817
						NetCache.field3190 = 0; // L: 1818

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1820
							if (var3 == null) { // L: 1821
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1827
									if (var3 == null) { // L: 1828
										if (NetCache.field3207 != 0) { // L: 1834
											try {
												Buffer var13 = new Buffer(4); // L: 1836
												var13.writeByte(4); // L: 1837
												var13.writeByte(NetCache.field3207); // L: 1838
												var13.writeShort(0); // L: 1839
												NetCache.NetCache_socket.write(var13.array, 0, 4); // L: 1840
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1844
												} catch (Exception var7) { // L: 1846
												}

												++NetCache.NetCache_ioExceptions; // L: 1847
												NetCache.NetCache_socket = null; // L: 1848
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1851
										JagexCache.field2081 = User.currentTimeMillis(); // L: 1852
										UserComparator10.js5SocketTask = null; // L: 1854
										KeyHandler.js5Socket = null; // L: 1855
										js5ConnectState = 0; // L: 1856
										js5Errors = 0; // L: 1857
										return; // L: 1863
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1829
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1830
									++NetCache.NetCache_pendingWritesCount; // L: 1831
									--NetCache.NetCache_pendingResponsesCount; // L: 1832
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1822
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1823
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1824
						}
					}
				} catch (IOException var10) { // L: 1860
					this.js5Error(-3); // L: 1861
				}

			}
		}
	} // L: 1741

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1036771448"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		UserComparator10.js5SocketTask = null; // L: 1866
		KeyHandler.js5Socket = null; // L: 1867
		js5ConnectState = 0; // L: 1868
		if (Coord.port1 == class41.port3) { // L: 1869
			class41.port3 = Coord.port2;
		} else {
			class41.port3 = Coord.port1; // L: 1870
		}

		++js5Errors; // L: 1871
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1872
			if (js5Errors >= 2 && var1 == 6) { // L: 1879
				this.error("js5connect_outofdate"); // L: 1880
				gameState = 1000; // L: 1881
			} else if (js5Errors >= 4) { // L: 1883
				if (gameState <= 5) { // L: 1884
					this.error("js5connect"); // L: 1885
					gameState = 1000; // L: 1886
				} else {
					field794 = 3000; // L: 1888
				}
			}
		} else if (gameState <= 5) { // L: 1873
			this.error("js5connect_full"); // L: 1874
			gameState = 1000; // L: 1875
		} else {
			field794 = 3000; // L: 1877
		}

	} // L: 1890

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-89707600"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2303
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2304

		try {
			if (loginState == 0) { // L: 2306
				if (class195.secureRandom == null && (secureRandomFuture.isDone() || field947 > 250)) { // L: 2307
					class195.secureRandom = secureRandomFuture.get(); // L: 2308
					secureRandomFuture.shutdown(); // L: 2309
					secureRandomFuture = null; // L: 2310
				}

				if (class195.secureRandom != null) { // L: 2312
					if (var1 != null) { // L: 2313
						((AbstractSocket)var1).close(); // L: 2314
						var1 = null; // L: 2315
					}

					UserComparator5.socketTask = null; // L: 2317
					field730 = false; // L: 2318
					field947 = 0; // L: 2319
					loginState = 1; // L: 2320
				}
			}

			if (loginState == 1) { // L: 2323
				if (UserComparator5.socketTask == null) { // L: 2324
					UserComparator5.socketTask = GameShell.taskHandler.newSocketTask(UserComparator6.worldHost, class41.port3); // L: 2325
				}

				if (UserComparator5.socketTask.status == 2) { // L: 2327
					throw new IOException();
				}

				if (UserComparator5.socketTask.status == 1) { // L: 2328
					if (useBufferedSocket) { // L: 2329
						Socket var4 = (Socket)UserComparator5.socketTask.result; // L: 2331
						BufferedNetSocket var3 = new BufferedNetSocket(var4, 40000, 5000); // L: 2333
						var1 = var3; // L: 2335
					} else {
						var1 = new NetSocket((Socket)UserComparator5.socketTask.result, GameShell.taskHandler, 5000); // L: 2338
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2340
					UserComparator5.socketTask = null; // L: 2341
					loginState = 2; // L: 2342
				}
			}

			PacketBufferNode var22;
			if (loginState == 2) { // L: 2345
				packetWriter.clearBuffer(); // L: 2346
				var22 = class206.method3853(); // L: 2347
				var22.packetBuffer.writeByte(LoginPacket.field2340.id); // L: 2348
				packetWriter.addNode(var22); // L: 2349
				packetWriter.flush(); // L: 2350
				var2.offset = 0; // L: 2351
				loginState = 3; // L: 2352
			}

			boolean var12;
			int var13;
			if (loginState == 3) { // L: 2354
				if (class195.pcmPlayer0 != null) { // L: 2355
					class195.pcmPlayer0.method2562();
				}

				if (class23.pcmPlayer1 != null) { // L: 2356
					class23.pcmPlayer1.method2562();
				}

				var12 = true; // L: 2357
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2358 2359
					var12 = false;
				}

				if (var12) { // L: 2361
					var13 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2362
					if (class195.pcmPlayer0 != null) { // L: 2363
						class195.pcmPlayer0.method2562();
					}

					if (class23.pcmPlayer1 != null) { // L: 2364
						class23.pcmPlayer1.method2562();
					}

					if (var13 != 0) { // L: 2365
						WorldMapData_0.getLoginError(var13); // L: 2366
						return; // L: 2367
					}

					var2.offset = 0; // L: 2369
					loginState = 4; // L: 2370
				}
			}

			int var37;
			if (loginState == 4) { // L: 2373
				if (var2.offset < 8) { // L: 2374
					var37 = ((AbstractSocket)var1).available(); // L: 2375
					if (var37 > 8 - var2.offset) { // L: 2376
						var37 = 8 - var2.offset;
					}

					if (var37 > 0) { // L: 2377
						((AbstractSocket)var1).read(var2.array, var2.offset, var37); // L: 2378
						var2.offset += var37; // L: 2379
					}
				}

				if (var2.offset == 8) { // L: 2382
					var2.offset = 0; // L: 2383
					VerticalAlignment.field3222 = var2.readLong(); // L: 2384
					loginState = 5; // L: 2385
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) { // L: 2388
				packetWriter.packetBuffer.offset = 0; // L: 2389
				packetWriter.clearBuffer(); // L: 2390
				PacketBuffer var23 = new PacketBuffer(500); // L: 2391
				int[] var25 = new int[]{class195.secureRandom.nextInt(), class195.secureRandom.nextInt(), class195.secureRandom.nextInt(), class195.secureRandom.nextInt()}; // L: 2392 2393 2394 2395 2396
				var23.offset = 0; // L: 2397
				var23.writeByte(1); // L: 2398
				var23.writeInt(var25[0]); // L: 2399
				var23.writeInt(var25[1]); // L: 2400
				var23.writeInt(var25[2]); // L: 2401
				var23.writeInt(var25[3]); // L: 2402
				var23.writeLong(VerticalAlignment.field3222); // L: 2403
				int var10;
				if (gameState == 40) { // L: 2404
					var23.writeInt(GrandExchangeEvent.field77[0]); // L: 2405
					var23.writeInt(GrandExchangeEvent.field77[1]); // L: 2406
					var23.writeInt(GrandExchangeEvent.field77[2]); // L: 2407
					var23.writeInt(GrandExchangeEvent.field77[3]); // L: 2408
				} else {
					var23.writeByte(field717.rsOrdinal()); // L: 2411
					switch(field717.field2032) { // L: 2412
					case 0:
					case 3:
						var23.writeMedium(class169.field2035); // L: 2421
						++var23.offset; // L: 2422
						break; // L: 2423
					case 1:
						var23.offset += 4; // L: 2415
						break; // L: 2416
					case 2:
						LinkedHashMap var6 = GrandExchangeOfferAgeComparator.clientPreferences.parameters; // L: 2428
						String var8 = Login.Login_username; // L: 2430
						var9 = var8.length(); // L: 2432
						var10 = 0; // L: 2433

						for (int var11 = 0; var11 < var9; ++var11) { // L: 2434
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var23.writeInt((Integer)var6.get(var10)); // L: 2437
					}

					var23.writeByte(class323.field3849.rsOrdinal()); // L: 2441
					var23.writeStringCp1252NullTerminated(Login.Login_password); // L: 2442
				}

				var23.encryptRsa(class92.field1198, class92.field1197); // L: 2444
				GrandExchangeEvent.field77 = var25; // L: 2445
				PacketBufferNode var5 = class206.method3853(); // L: 2446
				var5.packetBuffer.offset = 0; // L: 2447
				if (gameState == 40) { // L: 2448
					var5.packetBuffer.writeByte(LoginPacket.field2341.id); // L: 2449
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2339.id); // L: 2452
				}

				var5.packetBuffer.writeShort(0); // L: 2454
				var14 = var5.packetBuffer.offset; // L: 2455
				var5.packetBuffer.writeInt(192); // L: 2456
				var5.packetBuffer.writeInt(1); // L: 2457
				var5.packetBuffer.writeByte(clientType); // L: 2458
				var5.packetBuffer.writeByte(field686); // L: 2459
				var5.packetBuffer.writeBytes(var23.array, 0, var23.offset); // L: 2460
				var7 = var5.packetBuffer.offset; // L: 2461
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2462
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2463
				var5.packetBuffer.writeShort(ItemContainer.canvasWidth); // L: 2464
				var5.packetBuffer.writeShort(HealthBar.canvasHeight); // L: 2465
				Language.method3801(var5.packetBuffer); // L: 2466
				var5.packetBuffer.writeStringCp1252NullTerminated(WorldMapRegion.field281); // L: 2467
				var5.packetBuffer.writeInt(TextureProvider.field1561); // L: 2468
				Buffer var35 = new Buffer(Skills.platformInfo.size()); // L: 2469
				Skills.platformInfo.write(var35); // L: 2470
				var5.packetBuffer.writeBytes(var35.array, 0, var35.array.length); // L: 2471
				var5.packetBuffer.writeByte(clientType); // L: 2472
				var5.packetBuffer.writeInt(0); // L: 2473
				var5.packetBuffer.writeInt(Username.archive4.hash); // L: 2474
				var5.packetBuffer.writeInt(class1.archive15.hash); // L: 2475
				var5.packetBuffer.writeInt(FaceNormal.archive3.hash); // L: 2476
				var5.packetBuffer.method5684(Tiles.archive20.hash); // L: 2477
				var5.packetBuffer.writeInt(class281.archive10.hash); // L: 2478
				var5.packetBuffer.method5684(MenuAction.archive0.hash); // L: 2479
				var5.packetBuffer.method5682(class236.archive7.hash); // L: 2480
				var5.packetBuffer.method5683(AbstractByteArrayCopier.archive11.hash); // L: 2481
				var5.packetBuffer.method5682(AbstractByteArrayCopier.archive14.hash); // L: 2482
				var5.packetBuffer.method5682(GrandExchangeOffer.archive8.hash); // L: 2483
				var5.packetBuffer.method5683(ViewportMouse.archive12.hash); // L: 2484
				var5.packetBuffer.method5683(ModelData0.archive18.hash); // L: 2485
				var5.packetBuffer.method5682(class8.archive13.hash); // L: 2486
				var5.packetBuffer.writeInt(ApproximateRouteStrategy.archive6.hash); // L: 2487
				var5.packetBuffer.writeInt(class60.archive19.hash); // L: 2488
				var5.packetBuffer.writeInt(class23.archive17.hash); // L: 2489
				var5.packetBuffer.method5683(WorldMapManager.archive1.hash); // L: 2490
				var5.packetBuffer.method5682(0); // L: 2491
				var5.packetBuffer.writeInt(WorldMapSection3.archive2.hash); // L: 2492
				var5.packetBuffer.method5682(WorldMapData_1.archive9.hash); // L: 2493
				var5.packetBuffer.method5684(Varcs.archive5.hash); // L: 2494
				var5.packetBuffer.xteaEncrypt(var25, var7, var5.packetBuffer.offset); // L: 2495
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14); // L: 2496
				packetWriter.addNode(var5); // L: 2497
				packetWriter.flush(); // L: 2498
				packetWriter.isaacCipher = new IsaacCipher(var25); // L: 2499
				int[] var15 = new int[4]; // L: 2500

				for (var10 = 0; var10 < 4; ++var10) { // L: 2501
					var15[var10] = var25[var10] + 50;
				}

				var2.newIsaacCipher(var15); // L: 2502
				loginState = 6; // L: 2503
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2505 2506
				var37 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2507
				if (var37 == 21 && gameState == 20) { // L: 2508
					loginState = 12; // L: 2509
				} else if (var37 == 2) { // L: 2511
					loginState = 14; // L: 2512
				} else if (var37 == 15 && gameState == 40) { // L: 2514
					packetWriter.serverPacketLength = -1; // L: 2515
					loginState = 19; // L: 2516
				} else if (var37 == 64) { // L: 2518
					loginState = 10; // L: 2519
				} else if (var37 == 23 && field715 < 1) { // L: 2521
					++field715; // L: 2522
					loginState = 0; // L: 2523
				} else if (var37 == 29) { // L: 2525
					loginState = 17; // L: 2526
				} else {
					if (var37 != 69) { // L: 2528
						WorldMapData_0.getLoginError(var37); // L: 2532
						return; // L: 2533
					}

					loginState = 7; // L: 2529
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2537 2538
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2539
				var2.offset = 0; // L: 2540
				class58.field445 = var2.readUnsignedShort(); // L: 2541
				loginState = 8; // L: 2542
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class58.field445) { // L: 2545 2546
				var2.offset = 0; // L: 2547
				((AbstractSocket)var1).read(var2.array, var2.offset, class58.field445); // L: 2548
				class7[] var24 = new class7[]{class7.field26}; // L: 2551
				class7 var26 = var24[var2.readUnsignedByte()]; // L: 2553

				try {
					class12 var29 = ServerPacket.method3742(var26); // L: 2555
					this.field721 = new class9(var2, var29); // L: 2556
					loginState = 9; // L: 2557
				} catch (Exception var20) { // L: 2559
					WorldMapData_0.getLoginError(22); // L: 2560
					return; // L: 2561
				}
			}

			if (loginState == 9 && this.field721.method120()) { // L: 2565 2566
				this.field720 = this.field721.method122(); // L: 2567
				this.field721.method121(); // L: 2568
				this.field721 = null; // L: 2569
				if (this.field720 == null) { // L: 2570
					WorldMapData_0.getLoginError(22); // L: 2571
					return; // L: 2572
				}

				packetWriter.clearBuffer(); // L: 2574
				var22 = class206.method3853(); // L: 2575
				var22.packetBuffer.writeByte(LoginPacket.field2342.id); // L: 2576
				var22.packetBuffer.writeShort(this.field720.offset); // L: 2577
				var22.packetBuffer.method5713(this.field720); // L: 2578
				packetWriter.addNode(var22); // L: 2579
				packetWriter.flush(); // L: 2580
				this.field720 = null; // L: 2581
				loginState = 6; // L: 2582
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2585 2586
				ScriptFrame.field552 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2587
				loginState = 11; // L: 2588
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= ScriptFrame.field552) { // L: 2591 2592
				((AbstractSocket)var1).read(var2.array, 0, ScriptFrame.field552); // L: 2593
				var2.offset = 0; // L: 2594
				loginState = 6; // L: 2595
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2598 2599
				field716 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2600
				loginState = 13; // L: 2601
			}

			if (loginState == 13) { // L: 2604
				field947 = 0; // L: 2605
				GrandExchangeOfferNameComparator.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field716 / 60 + " seconds."); // L: 2606
				if (--field716 <= 0) { // L: 2607
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2610 2611
					SpotAnimationDefinition.field3282 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2612
					loginState = 15; // L: 2613
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= SpotAnimationDefinition.field3282) { // L: 2616 2617
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2618
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2619
					var2.offset = 0; // L: 2620
					boolean var38 = false; // L: 2621
					if (var12) { // L: 2622
						var13 = var2.readByteIsaac() << 24; // L: 2623
						var13 |= var2.readByteIsaac() << 16; // L: 2624
						var13 |= var2.readByteIsaac() << 8; // L: 2625
						var13 |= var2.readByteIsaac(); // L: 2626
						String var34 = Login.Login_username; // L: 2628
						var7 = var34.length(); // L: 2630
						int var16 = 0; // L: 2631
						var9 = 0; // L: 2632

						while (true) {
							if (var9 >= var7) {
								if (GrandExchangeOfferAgeComparator.clientPreferences.parameters.size() >= 10 && !GrandExchangeOfferAgeComparator.clientPreferences.parameters.containsKey(var16)) { // L: 2636 2637
									Iterator var36 = GrandExchangeOfferAgeComparator.clientPreferences.parameters.entrySet().iterator(); // L: 2638
									var36.next(); // L: 2639
									var36.remove(); // L: 2640
								}

								GrandExchangeOfferAgeComparator.clientPreferences.parameters.put(var16, var13); // L: 2643
								break;
							}

							var16 = (var16 << 5) - var16 + var34.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2645
						GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = Login.Login_username; // L: 2646
					} else {
						GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = null; // L: 2649
					}

					Tile.savePreferences(); // L: 2651
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2652
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2653
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2654
					localPlayerIndex <<= 8; // L: 2655
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2656
					field799 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2657
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2658
					var2.offset = 0; // L: 2659
					ServerPacket[] var32 = ArchiveDiskActionHandler.ServerPacket_values(); // L: 2660
					var14 = var2.readSmartByteShortIsaac(); // L: 2661
					if (var14 < 0 || var14 >= var32.length) { // L: 2662
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var32[var14]; // L: 2663
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2664
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2665
					var2.offset = 0; // L: 2666
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2667

					try {
						Client var18 = ByteArrayPool.client; // L: 2669
						JSObject.getWindow(var18).call("zap", (Object[])null); // L: 2672
					} catch (Throwable var19) { // L: 2675
					}

					loginState = 16; // L: 2676
				}

				if (loginState != 16) { // L: 2679
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2773 2774
						var2.offset = 0; // L: 2775
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2776
						var2.offset = 0; // L: 2777
						KitDefinition.field3297 = var2.readUnsignedShort(); // L: 2778
						loginState = 18; // L: 2779
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= KitDefinition.field3297) { // L: 2782 2783
						var2.offset = 0; // L: 2784
						((AbstractSocket)var1).read(var2.array, 0, KitDefinition.field3297); // L: 2785
						var2.offset = 0; // L: 2786
						String var30 = var2.readStringCp1252NullTerminated(); // L: 2787
						String var31 = var2.readStringCp1252NullTerminated(); // L: 2788
						String var33 = var2.readStringCp1252NullTerminated(); // L: 2789
						GrandExchangeOfferNameComparator.setLoginResponseString(var30, var31, var33); // L: 2790
						BuddyRankComparator.updateGameState(10); // L: 2791
					}

					if (loginState == 19) { // L: 2794
						if (packetWriter.serverPacketLength == -1) { // L: 2795
							if (((AbstractSocket)var1).available() < 2) { // L: 2796
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2797
							var2.offset = 0; // L: 2798
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2799
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2801
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2802
							var2.offset = 0; // L: 2803
							var37 = packetWriter.serverPacketLength; // L: 2804
							timer.method5139(); // L: 2805
							Language.method3791(); // L: 2806
							TileItem.updatePlayer(var2); // L: 2807
							if (var37 != var2.offset) { // L: 2808
								throw new RuntimeException(); // L: 2809
							}
						}
					} else {
						++field947; // L: 2813
						if (field947 > 2000) { // L: 2814
							if (field715 < 1) { // L: 2815
								if (Coord.port1 == class41.port3) { // L: 2816
									class41.port3 = Coord.port2;
								} else {
									class41.port3 = Coord.port1; // L: 2817
								}

								++field715; // L: 2818
								loginState = 0; // L: 2819
							} else {
								WorldMapData_0.getLoginError(-3); // L: 2822
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2680
						var2.offset = 0; // L: 2681
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2682
						timer.method5137(); // L: 2683
						mouseLastLastPressedTimeMillis = -1L; // L: 2686
						class204.mouseRecorder.index = 0; // L: 2687
						class8.hasFocus = true; // L: 2688
						hadFocus = true; // L: 2689
						field905 = -1L; // L: 2690
						class105.reflectionChecks = new IterableNodeDeque(); // L: 2692
						packetWriter.clearBuffer(); // L: 2694
						packetWriter.packetBuffer.offset = 0; // L: 2695
						packetWriter.serverPacket = null; // L: 2696
						packetWriter.field1348 = null; // L: 2697
						packetWriter.field1339 = null; // L: 2698
						packetWriter.field1350 = null; // L: 2699
						packetWriter.serverPacketLength = 0; // L: 2700
						packetWriter.field1337 = 0; // L: 2701
						rebootTimer = 0; // L: 2702
						logoutTimer = 0; // L: 2703
						hintArrowType = 0; // L: 2704
						AbstractWorldMapData.method375(); // L: 2705
						class228.method4246(0); // L: 2706
						UrlRequest.method3436(); // L: 2707
						isItemSelected = 0; // L: 2708
						isSpellSelected = false; // L: 2709
						soundEffectCount = 0; // L: 2710
						camAngleY = 0; // L: 2711
						oculusOrbState = 0; // L: 2712
						ModelData0.field1895 = null; // L: 2713
						minimapState = 0; // L: 2714
						field906 = -1; // L: 2715
						destinationX = 0; // L: 2716
						destinationY = 0; // L: 2717
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2718
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2719
						npcCount = 0; // L: 2720
						class89.method2163(); // L: 2721

						for (var37 = 0; var37 < 2048; ++var37) { // L: 2722
							players[var37] = null;
						}

						for (var37 = 0; var37 < 32768; ++var37) { // L: 2723
							npcs[var37] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2724
						projectiles.clear(); // L: 2725
						graphicsObjects.clear(); // L: 2726

						for (var37 = 0; var37 < 4; ++var37) { // L: 2727
							for (var13 = 0; var13 < 104; ++var13) { // L: 2728
								for (int var17 = 0; var17 < 104; ++var17) { // L: 2729
									groundItems[var37][var13][var17] = null; // L: 2730
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2734
						WorldMapLabelSize.friendSystem.clear(); // L: 2735

						for (var37 = 0; var37 < VarpDefinition.VarpDefinition_fileCount; ++var37) { // L: 2736
							VarpDefinition var28 = PendingSpawn.VarpDefinition_get(var37); // L: 2737
							if (var28 != null) { // L: 2738
								Varps.Varps_temp[var37] = 0; // L: 2739
								Varps.Varps_main[var37] = 0; // L: 2740
							}
						}

						FriendSystem.varcs.clearTransient(); // L: 2743
						followerIndex = -1; // L: 2744
						if (rootInterface != -1) { // L: 2745
							class206.method3852(rootInterface);
						}

						for (InterfaceParent var27 = (InterfaceParent)interfaceParents.first(); var27 != null; var27 = (InterfaceParent)interfaceParents.next()) { // L: 2746
							Player.closeInterface(var27, true); // L: 2747
						}

						rootInterface = -1; // L: 2749
						interfaceParents = new NodeHashTable(8); // L: 2750
						meslayerContinueWidget = null; // L: 2751
						AbstractWorldMapData.method375(); // L: 2752
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2753

						for (var37 = 0; var37 < 8; ++var37) { // L: 2754
							playerMenuActions[var37] = null; // L: 2755
							playerOptionsPriorities[var37] = false; // L: 2756
						}

						class4.method78(); // L: 2758
						isLoading = true; // L: 2759

						for (var37 = 0; var37 < 100; ++var37) { // L: 2760
							field834[var37] = true;
						}

						Actor.method1855(); // L: 2761
						DevicePcmPlayerProvider.clanChat = null; // L: 2762

						for (var37 = 0; var37 < 8; ++var37) { // L: 2763
							grandExchangeOffers[var37] = new GrandExchangeOffer();
						}

						WorldMapDecoration.grandExchangeEvents = null; // L: 2764
						TileItem.updatePlayer(var2); // L: 2766
						GrandExchangeEvent.field78 = -1; // L: 2767
						PacketWriter.loadRegions(false, var2); // L: 2768
						packetWriter.serverPacket = null; // L: 2769
					}

				}
			}
		} catch (IOException var21) { // L: 2826
			if (field715 < 1) { // L: 2827
				if (class41.port3 == Coord.port1) { // L: 2828
					class41.port3 = Coord.port2;
				} else {
					class41.port3 = Coord.port1; // L: 2829
				}

				++field715; // L: 2830
				loginState = 0; // L: 2831
			} else {
				WorldMapData_0.getLoginError(-2); // L: 2834
			}
		}
	} // L: 2608 2771 2811 2820 2823 2832 2835 2837

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-769999345"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3055
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3056
			--logoutTimer;
		}

		if (field730) { // L: 3057
			field730 = false; // L: 3058
			FloorDecoration.method2986(); // L: 3059
		} else {
			if (!isMenuOpen) { // L: 3062
				WorldMapSection2.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1616(packetWriter); ++var1) { // L: 3063 3064
			}

			if (gameState == 30) { // L: 3066
				int var2;
				PacketBufferNode var14;
				while (class206.method3851()) { // L: 3067
					var14 = class4.getPacketBufferNode(ClientPacket.field2303, packetWriter.isaacCipher); // L: 3068
					var14.packetBuffer.writeByte(0); // L: 3069
					var2 = var14.packetBuffer.offset; // L: 3070
					TileItemPile.performReflectionCheck(var14.packetBuffer); // L: 3071
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 3072
					packetWriter.addNode(var14); // L: 3073
				}

				if (timer.field3606) { // L: 3075
					var14 = class4.getPacketBufferNode(ClientPacket.field2287, packetWriter.isaacCipher); // L: 3077
					var14.packetBuffer.writeByte(0); // L: 3078
					var2 = var14.packetBuffer.offset; // L: 3079
					timer.write(var14.packetBuffer); // L: 3080
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 3081
					packetWriter.addNode(var14); // L: 3082
					timer.method5142(); // L: 3083
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				synchronized(class204.mouseRecorder.lock) { // L: 3086
					if (!field772) { // L: 3087
						class204.mouseRecorder.index = 0; // L: 3173
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class204.mouseRecorder.index >= 40) { // L: 3088
						PacketBufferNode var15 = null; // L: 3090
						var3 = 0; // L: 3091
						var4 = 0; // L: 3092
						var5 = 0; // L: 3093
						var6 = 0; // L: 3094

						for (var7 = 0; var7 < class204.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3095 3096
							var4 = var7; // L: 3097
							var8 = class204.mouseRecorder.ys[var7]; // L: 3098
							if (var8 < -1) { // L: 3099
								var8 = -1;
							} else if (var8 > 65534) { // L: 3100
								var8 = 65534;
							}

							int var9 = class204.mouseRecorder.xs[var7]; // L: 3101
							if (var9 < -1) { // L: 3102
								var9 = -1;
							} else if (var9 > 65534) { // L: 3103
								var9 = 65534;
							}

							if (var9 != field719 || var8 != field693) { // L: 3104
								if (var15 == null) { // L: 3107
									var15 = class4.getPacketBufferNode(ClientPacket.field2314, packetWriter.isaacCipher); // L: 3108
									var15.packetBuffer.writeByte(0); // L: 3109
									var3 = var15.packetBuffer.offset; // L: 3110
									PacketBuffer var10000 = var15.packetBuffer; // L: 3111
									var10000.offset += 2;
									var5 = 0; // L: 3112
									var6 = 0; // L: 3113
								}

								int var10;
								int var11;
								int var12;
								if (-1L != field694) { // L: 3118
									var10 = var9 - field719; // L: 3119
									var11 = var8 - field693; // L: 3120
									var12 = (int)((class204.mouseRecorder.millis[var7] - field694) / 20L); // L: 3121
									var5 = (int)((long)var5 + (class204.mouseRecorder.millis[var7] - field694) % 20L); // L: 3122
								} else {
									var10 = var9; // L: 3125
									var11 = var8; // L: 3126
									var12 = Integer.MAX_VALUE; // L: 3127
								}

								field719 = var9; // L: 3129
								field693 = var8; // L: 3130
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3131
									var10 += 32; // L: 3132
									var11 += 32; // L: 3133
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3134
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3136
									var10 += 128; // L: 3137
									var11 += 128; // L: 3138
									var15.packetBuffer.writeByte(var12 + 128); // L: 3139
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3140
								} else if (var12 < 32) { // L: 3142
									var15.packetBuffer.writeByte(var12 + 192); // L: 3143
									if (var9 != -1 && var8 != -1) { // L: 3144
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3145
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3148
									if (var9 != -1 && var8 != -1) { // L: 3149
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3150
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3152
								field694 = class204.mouseRecorder.millis[var7]; // L: 3153
							}
						}

						if (var15 != null) { // L: 3155
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3); // L: 3156
							var7 = var15.packetBuffer.offset; // L: 3157
							var15.packetBuffer.offset = var3; // L: 3158
							var15.packetBuffer.writeByte(var5 / var6); // L: 3159
							var15.packetBuffer.writeByte(var5 % var6); // L: 3160
							var15.packetBuffer.offset = var7; // L: 3161
							packetWriter.addNode(var15); // L: 3162
						}

						if (var4 >= class204.mouseRecorder.index) { // L: 3164
							class204.mouseRecorder.index = 0;
						} else {
							MouseRecorder var38 = class204.mouseRecorder; // L: 3166
							var38.index -= var4;
							System.arraycopy(class204.mouseRecorder.xs, var4, class204.mouseRecorder.xs, 0, class204.mouseRecorder.index); // L: 3167
							System.arraycopy(class204.mouseRecorder.ys, var4, class204.mouseRecorder.ys, 0, class204.mouseRecorder.index); // L: 3168
							System.arraycopy(class204.mouseRecorder.millis, var4, class204.mouseRecorder.millis, 0, class204.mouseRecorder.index); // L: 3169
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3175
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3176
					if (var16 > 32767L) { // L: 3177
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3178
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3179
					if (var3 < 0) { // L: 3180
						var3 = 0;
					} else if (var3 > HealthBar.canvasHeight) { // L: 3181
						var3 = HealthBar.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3182
					if (var4 < 0) { // L: 3183
						var4 = 0;
					} else if (var4 > ItemContainer.canvasWidth) { // L: 3184
						var4 = ItemContainer.canvasWidth;
					}

					var5 = (int)var16; // L: 3185
					var18 = class4.getPacketBufferNode(ClientPacket.field2322, packetWriter.isaacCipher); // L: 3186
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3187
					var18.packetBuffer.writeShort(var4); // L: 3188
					var18.packetBuffer.writeShort(var3); // L: 3189
					packetWriter.addNode(var18); // L: 3190
				}

				if (KeyHandler.field427 > 0) { // L: 3192
					var14 = class4.getPacketBufferNode(ClientPacket.field2255, packetWriter.isaacCipher); // L: 3193
					var14.packetBuffer.writeShort(0); // L: 3194
					var2 = var14.packetBuffer.offset; // L: 3195
					long var19 = User.currentTimeMillis(); // L: 3196

					for (var5 = 0; var5 < KeyHandler.field427; ++var5) { // L: 3197
						long var21 = var19 - field905; // L: 3198
						if (var21 > 16777215L) { // L: 3199
							var21 = 16777215L;
						}

						field905 = var19; // L: 3200
						var14.packetBuffer.method5680((int)var21); // L: 3201
						var14.packetBuffer.method5664(KeyHandler.field430[var5]); // L: 3202
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3204
					packetWriter.addNode(var14); // L: 3205
				}

				if (field882 > 0) { // L: 3207
					--field882;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3208
					field750 = true;
				}

				if (field750 && field882 <= 0) { // L: 3209
					field882 = 20; // L: 3210
					field750 = false; // L: 3211
					var14 = class4.getPacketBufferNode(ClientPacket.field2321, packetWriter.isaacCipher); // L: 3213
					var14.packetBuffer.method5674(camAngleX); // L: 3214
					var14.packetBuffer.method5673(camAngleY); // L: 3215
					packetWriter.addNode(var14); // L: 3216
				}

				if (class8.hasFocus && !hadFocus) { // L: 3218
					hadFocus = true; // L: 3219
					var14 = class4.getPacketBufferNode(ClientPacket.field2312, packetWriter.isaacCipher); // L: 3221
					var14.packetBuffer.writeByte(1); // L: 3222
					packetWriter.addNode(var14); // L: 3223
				}

				if (!class8.hasFocus && hadFocus) { // L: 3225
					hadFocus = false; // L: 3226
					var14 = class4.getPacketBufferNode(ClientPacket.field2312, packetWriter.isaacCipher); // L: 3228
					var14.packetBuffer.writeByte(0); // L: 3229
					packetWriter.addNode(var14); // L: 3230
				}

				if (KeyHandler.worldMap != null) { // L: 3233
					KeyHandler.worldMap.method6454();
				}

				class2.method30(); // L: 3234
				if (field906 != GrandExchangeOfferUnitPriceComparator.Client_plane) { // L: 3236
					field906 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 3237
					SoundCache.method2646(GrandExchangeOfferUnitPriceComparator.Client_plane); // L: 3238
				}

				if (gameState == 30) { // L: 3241
					FloorDecoration.method2988(); // L: 3242
					ChatChannel.method2381(); // L: 3243
					++packetWriter.field1337; // L: 3244
					if (packetWriter.field1337 > 750) { // L: 3245
						FloorDecoration.method2986(); // L: 3246
					} else {
						class2.method41(); // L: 3249

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3251
							var2 = npcIndices[var1]; // L: 3252
							NPC var23 = npcs[var2]; // L: 3253
							if (var23 != null) { // L: 3254
								class13.updateActorSequence(var23, var23.definition.size); // L: 3255
							}
						}

						ApproximateRouteStrategy.method1317(); // L: 3259
						++field743; // L: 3260
						if (mouseCrossColor != 0) { // L: 3261
							mouseCrossState += 20; // L: 3262
							if (mouseCrossState >= 400) { // L: 3263
								mouseCrossColor = 0;
							}
						}

						if (MouseHandler.field525 != null) { // L: 3265
							++field828; // L: 3266
							if (field828 >= 15) { // L: 3267
								GrandExchangeOfferOwnWorldComparator.invalidateWidget(MouseHandler.field525); // L: 3268
								MouseHandler.field525 = null; // L: 3269
							}
						}

						Widget var31 = GrandExchangeEvent.mousedOverWidgetIf1; // L: 3272
						Widget var32 = GrandExchangeOfferOwnWorldComparator.field677; // L: 3273
						GrandExchangeEvent.mousedOverWidgetIf1 = null; // L: 3274
						GrandExchangeOfferOwnWorldComparator.field677 = null; // L: 3275
						draggedOnWidget = null; // L: 3276
						field705 = false; // L: 3277
						field859 = false; // L: 3278
						field902 = 0; // L: 3279

						while (Clock.isKeyDown() && field902 < 128) { // L: 3280
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && SecureRandomCallable.field555 == 66) { // L: 3281
								String var33 = class234.method4262(); // L: 3282
								ByteArrayPool.client.clipboardSetString(var33); // L: 3283
							} else if (oculusOrbState != 1 || WorldMapManager.field335 <= 0) { // L: 3286
								field904[field902] = SecureRandomCallable.field555; // L: 3289
								field903[field902] = WorldMapManager.field335; // L: 3290
								++field902; // L: 3291
							}
						}

						if (MilliClock.method3590() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3293
							var3 = PlayerType.localPlayer.plane - mouseWheelRotation; // L: 3294
							if (var3 < 0) { // L: 3295
								var3 = 0;
							} else if (var3 > 3) { // L: 3296
								var3 = 3;
							}

							if (var3 != PlayerType.localPlayer.plane) { // L: 3297
								class2.method42(PlayerType.localPlayer.pathX[0] + FloorDecoration.baseX, PlayerType.localPlayer.pathY[0] + WorldMapData_0.baseY, var3, false); // L: 3298
							}

							mouseWheelRotation = 0; // L: 3300
						}

						if (rootInterface != -1) { // L: 3302
							DynamicObject.updateRootInterface(rootInterface, 0, 0, ItemContainer.canvasWidth, HealthBar.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3303

						while (true) {
							Widget var24;
							Widget var25;
							ScriptEvent var34;
							do {
								var34 = (ScriptEvent)field881.removeLast(); // L: 3305
								if (var34 == null) { // L: 3306
									while (true) {
										do {
											var34 = (ScriptEvent)field939.removeLast(); // L: 3317
											if (var34 == null) { // L: 3318
												while (true) {
													do {
														var34 = (ScriptEvent)scriptEvents.removeLast(); // L: 3329
														if (var34 == null) { // L: 3330
															this.menu(); // L: 3340
															if (KeyHandler.worldMap != null) { // L: 3342
																KeyHandler.worldMap.method6464(GrandExchangeOfferUnitPriceComparator.Client_plane, (PlayerType.localPlayer.x >> 7) + FloorDecoration.baseX, (PlayerType.localPlayer.y >> 7) + WorldMapData_0.baseY, false); // L: 3343
																KeyHandler.worldMap.loadCache(); // L: 3344
															}

															if (clickedWidget != null) { // L: 3347
																this.method1405();
															}

															if (GameBuild.dragInventoryWidget != null) { // L: 3348
																GrandExchangeOfferOwnWorldComparator.invalidateWidget(GameBuild.dragInventoryWidget); // L: 3349
																++itemDragDuration; // L: 3350
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3351
																	if (field830) { // L: 3352
																		if (GameBuild.dragInventoryWidget == class217.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3353
																			Widget var35 = GameBuild.dragInventoryWidget; // L: 3354
																			byte var29 = 0; // L: 3355
																			if (field846 == 1 && var35.contentType == 206) { // L: 3356
																				var29 = 1;
																			}

																			if (var35.itemIds[dragItemSlotDestination] <= 0) { // L: 3357
																				var29 = 0;
																			}

																			var6 = WorldMapData_0.getWidgetFlags(var35); // L: 3359
																			boolean var30 = (var6 >> 29 & 1) != 0; // L: 3361
																			if (var30) { // L: 3363
																				var7 = dragItemSlotSource; // L: 3364
																				var8 = dragItemSlotDestination; // L: 3365
																				var35.itemIds[var8] = var35.itemIds[var7]; // L: 3366
																				var35.itemQuantities[var8] = var35.itemQuantities[var7]; // L: 3367
																				var35.itemIds[var7] = -1; // L: 3368
																				var35.itemQuantities[var7] = 0; // L: 3369
																			} else if (var29 == 1) { // L: 3371
																				var7 = dragItemSlotSource; // L: 3372
																				var8 = dragItemSlotDestination; // L: 3373

																				while (var8 != var7) { // L: 3374
																					if (var7 > var8) { // L: 3375
																						var35.swapItems(var7 - 1, var7); // L: 3376
																						--var7; // L: 3377
																					} else if (var7 < var8) { // L: 3379
																						var35.swapItems(var7 + 1, var7); // L: 3380
																						++var7; // L: 3381
																					}
																				}
																			} else {
																				var35.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3386
																			}

																			PacketBufferNode var26 = class4.getPacketBufferNode(ClientPacket.field2267, packetWriter.isaacCipher); // L: 3389
																			var26.packetBuffer.writeShort(dragItemSlotDestination); // L: 3390
																			var26.packetBuffer.method5674(dragItemSlotSource); // L: 3391
																			var26.packetBuffer.writeByte(var29); // L: 3392
																			var26.packetBuffer.method5683(GameBuild.dragInventoryWidget.id); // L: 3393
																			packetWriter.addNode(var26); // L: 3394
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3398
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3399
																	} else if (menuOptionsCount > 0) { // L: 3401
																		var3 = draggedWidgetX; // L: 3402
																		var4 = draggedWidgetY; // L: 3403
																		MenuAction var36 = GrandExchangeOffer.tempMenuAction; // L: 3405
																		Calendar.menuAction(var36.param0, var36.param1, var36.opcode, var36.identifier, var36.action, var36.action, var3, var4); // L: 3407
																		GrandExchangeOffer.tempMenuAction = null; // L: 3409
																	}

																	field828 = 10; // L: 3413
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3414
																	GameBuild.dragInventoryWidget = null; // L: 3415
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3418 3419
																	field830 = true; // L: 3420
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3425
																var3 = Scene.Scene_selectedX; // L: 3426
																var4 = Scene.Scene_selectedY; // L: 3427
																PacketBufferNode var37 = class4.getPacketBufferNode(ClientPacket.field2260, packetWriter.isaacCipher); // L: 3429
																var37.packetBuffer.writeByte(5); // L: 3430
																var37.packetBuffer.method5674(var3 + FloorDecoration.baseX); // L: 3431
																var37.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3432
																var37.packetBuffer.writeShortLE(var4 + WorldMapData_0.baseY); // L: 3433
																packetWriter.addNode(var37); // L: 3434
																Scene.method3253(); // L: 3435
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3436
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3437
																mouseCrossColor = 1; // L: 3438
																mouseCrossState = 0; // L: 3439
																destinationX = var3; // L: 3440
																destinationY = var4; // L: 3441
															}

															if (var31 != GrandExchangeEvent.mousedOverWidgetIf1) { // L: 3443
																if (var31 != null) { // L: 3444
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(var31);
																}

																if (GrandExchangeEvent.mousedOverWidgetIf1 != null) { // L: 3445
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(GrandExchangeEvent.mousedOverWidgetIf1);
																}
															}

															if (var32 != GrandExchangeOfferOwnWorldComparator.field677 && field833 == field832) { // L: 3447
																if (var32 != null) { // L: 3448
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(var32);
																}

																if (GrandExchangeOfferOwnWorldComparator.field677 != null) { // L: 3449
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field677);
																}
															}

															if (GrandExchangeOfferOwnWorldComparator.field677 != null) { // L: 3451
																if (field832 < field833) { // L: 3452
																	++field832; // L: 3453
																	if (field833 == field832) { // L: 3454
																		GrandExchangeOfferOwnWorldComparator.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field677);
																	}
																}
															} else if (field832 > 0) { // L: 3457
																--field832;
															}

															InterfaceParent.method1269(); // L: 3458
															if (isCameraLocked) { // L: 3459
																WorldMapIcon_1.method392();
															}

															for (var3 = 0; var3 < 5; ++var3) { // L: 3460
																int var10002 = field918[var3]++;
															}

															FriendSystem.varcs.tryWrite(); // L: 3461
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3464
															var5 = class236.method4264(); // L: 3467
															if (var3 > 15000 && var5 > 15000) { // L: 3468
																logoutTimer = 250; // L: 3469
																class228.method4246(14500); // L: 3470
																var18 = class4.getPacketBufferNode(ClientPacket.field2271, packetWriter.isaacCipher); // L: 3472
																packetWriter.addNode(var18); // L: 3473
															}

															WorldMapLabelSize.friendSystem.processFriendUpdates(); // L: 3475
															++packetWriter.pendingWrites; // L: 3476
															if (packetWriter.pendingWrites > 50) { // L: 3477
																var18 = class4.getPacketBufferNode(ClientPacket.field2247, packetWriter.isaacCipher); // L: 3479
																packetWriter.addNode(var18); // L: 3480
															}

															try {
																packetWriter.flush(); // L: 3483
															} catch (IOException var27) { // L: 3485
																FloorDecoration.method2986(); // L: 3486
															}

															return; // L: 3488
														}

														var24 = var34.widget; // L: 3331
														if (var24.childIndex < 0) { // L: 3332
															break;
														}

														var25 = UserComparator4.getWidget(var24.parentId); // L: 3333
													} while(var25 == null || var25.children == null || var24.childIndex >= var25.children.length || var24 != var25.children[var24.childIndex]); // L: 3334

													Entity.runScriptEvent(var34); // L: 3338
												}
											}

											var24 = var34.widget; // L: 3319
											if (var24.childIndex < 0) { // L: 3320
												break;
											}

											var25 = UserComparator4.getWidget(var24.parentId); // L: 3321
										} while(var25 == null || var25.children == null || var24.childIndex >= var25.children.length || var24 != var25.children[var24.childIndex]); // L: 3322

										Entity.runScriptEvent(var34); // L: 3326
									}
								}

								var24 = var34.widget; // L: 3307
								if (var24.childIndex < 0) { // L: 3308
									break;
								}

								var25 = UserComparator4.getWidget(var24.parentId); // L: 3309
							} while(var25 == null || var25.children == null || var24.childIndex >= var25.children.length || var24 != var25.children[var24.childIndex]); // L: 3310

							Entity.runScriptEvent(var34); // L: 3314
						}
					}
				}
			}
		}
	} // L: 3060 3247

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-68"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = ItemContainer.canvasWidth; // L: 4232
		int var2 = HealthBar.canvasHeight; // L: 4233
		if (super.contentWidth < var1) { // L: 4234
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4235
		}

		if (GrandExchangeOfferAgeComparator.clientPreferences != null) { // L: 4236
			try {
				class56.method944(ByteArrayPool.client, "resize", new Object[]{UrlRequester.getWindowedMode()}); // L: 4238
			} catch (Throwable var4) { // L: 4240
			}
		}

	} // L: 4242

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1208840742"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4245
			var1 = rootInterface; // L: 4246
			if (ScriptFrame.loadInterface(var1)) { // L: 4248
				Frames.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1); // L: 4249
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4252
			if (field834[var1]) { // L: 4253
				field758[var1] = true;
			}

			field745[var1] = field834[var1]; // L: 4254
			field834[var1] = false; // L: 4255
		}

		field748 = cycle; // L: 4257
		viewportX = -1; // L: 4258
		viewportY = -1; // L: 4259
		class217.hoveredItemContainer = null; // L: 4260
		if (rootInterface != -1) { // L: 4261
			rootWidgetCount = 0; // L: 4262
			ClanChat.drawWidgets(rootInterface, 0, 0, ItemContainer.canvasWidth, HealthBar.canvasHeight, 0, 0, -1); // L: 4263
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4265
		if (showMouseCross) { // L: 4266
			if (mouseCrossColor == 1) { // L: 4267
				class60.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4268
			}

			if (mouseCrossColor == 2) { // L: 4270
				class60.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4271
			}
		}

		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		if (!isMenuOpen) { // L: 4274
			if (viewportX != -1) { // L: 4275
				var1 = viewportX; // L: 4276
				var2 = viewportY; // L: 4277
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4279 4280
					var3 = FileSystem.method3638(); // L: 4281
					String var15;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4283
						var15 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4284
						var15 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var16;
						if (var3 < 0) { // L: 4288
							var16 = ""; // L: 4289
						} else if (menuTargets[var3].length() > 0) { // L: 4292
							var16 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var16 = menuActions[var3]; // L: 4293
						}

						var15 = var16; // L: 4295
					}

					if (menuOptionsCount > 2) { // L: 4297
						var15 = var15 + colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					ReflectionCheck.fontBold12.drawRandomAlphaAndSpacing(var15, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4298
				}
			}
		} else {
			var1 = Coord.menuX; // L: 4303
			var2 = WorldMapArea.menuY; // L: 4304
			var3 = KeyHandler.menuWidth; // L: 4305
			var4 = ServerPacket.menuHeight; // L: 4306
			int var5 = 6116423; // L: 4307
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4308
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4309
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4310
			ReflectionCheck.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4311
			var6 = MouseHandler.MouseHandler_x; // L: 4312
			var7 = MouseHandler.MouseHandler_y; // L: 4313

			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4314
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31; // L: 4315
				var10 = 16777215; // L: 4316
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4317
					var10 = 16776960;
				}

				Font var13 = ReflectionCheck.fontBold12; // L: 4318
				String var14;
				if (var8 < 0) { // L: 4321
					var14 = ""; // L: 4322
				} else if (menuTargets[var8].length() > 0) { // L: 4325
					var14 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var14 = menuActions[var8]; // L: 4326
				}

				var13.draw(var14, var1 + 3, var9, var10, 0); // L: 4328
			}

			var8 = Coord.menuX; // L: 4330
			var9 = WorldMapArea.menuY; // L: 4331
			var10 = KeyHandler.menuWidth; // L: 4332
			int var11 = ServerPacket.menuHeight; // L: 4333

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 4335
				if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var9 + var11) { // L: 4336
					field758[var12] = true;
				}
			}
		}

		if (gameDrawingMode == 3) { // L: 4340
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4341
				if (field745[var1]) { // L: 4342
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4343
				} else if (field758[var1]) { // L: 4345
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4346
				}
			}
		}

		var1 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 4350
		var2 = PlayerType.localPlayer.x; // L: 4351
		var3 = PlayerType.localPlayer.y; // L: 4352
		var4 = field743; // L: 4353

		for (ObjectSound var21 = (ObjectSound)ObjectSound.objectSounds.last(); var21 != null; var21 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4355
			if (var21.soundEffectId != -1 || var21.soundEffectIds != null) { // L: 4356
				var6 = 0; // L: 4357
				if (var2 > var21.field1103) { // L: 4358
					var6 += var2 - var21.field1103;
				} else if (var2 < var21.x) { // L: 4359
					var6 += var21.x - var2;
				}

				if (var3 > var21.field1112) { // L: 4360
					var6 += var3 - var21.field1112;
				} else if (var3 < var21.y) { // L: 4361
					var6 += var21.y - var3;
				}

				if (var6 - 64 <= var21.field1104 && areaSoundEffectVolume != 0 && var1 == var21.plane) { // L: 4362
					var6 -= 64; // L: 4373
					if (var6 < 0) { // L: 4374
						var6 = 0;
					}

					var7 = (var21.field1104 - var6) * areaSoundEffectVolume / var21.field1104; // L: 4375
					Object var10000;
					if (var21.stream1 == null) { // L: 4376
						if (var21.soundEffectId >= 0) { // L: 4377
							var10000 = null; // L: 4378
							SoundEffect var17 = SoundEffect.readSoundEffect(Username.archive4, var21.soundEffectId, 0);
							if (var17 != null) { // L: 4379
								RawSound var18 = var17.toRawSound().resample(NetSocket.decimator); // L: 4380
								RawPcmStream var19 = RawPcmStream.createRawPcmStream(var18, 100, var7); // L: 4381
								var19.setNumLoops(-1); // L: 4382
								GrandExchangeEvents.pcmStreamMixer.addSubStream(var19); // L: 4383
								var21.stream1 = var19; // L: 4384
							}
						}
					} else {
						var21.stream1.method2677(var7); // L: 4388
					}

					if (var21.stream2 == null) { // L: 4389
						if (var21.soundEffectIds != null && (var21.field1108 -= var4) <= 0) { // L: 4390
							var8 = (int)(Math.random() * (double)var21.soundEffectIds.length); // L: 4391
							var10000 = null; // L: 4392
							SoundEffect var22 = SoundEffect.readSoundEffect(Username.archive4, var21.soundEffectIds[var8], 0);
							if (var22 != null) { // L: 4393
								RawSound var23 = var22.toRawSound().resample(NetSocket.decimator); // L: 4394
								RawPcmStream var20 = RawPcmStream.createRawPcmStream(var23, 100, var7); // L: 4395
								var20.setNumLoops(0); // L: 4396
								GrandExchangeEvents.pcmStreamMixer.addSubStream(var20); // L: 4397
								var21.stream2 = var20; // L: 4398
								var21.field1108 = var21.field1107 + (int)(Math.random() * (double)(var21.field1109 - var21.field1107)); // L: 4399
							}
						}
					} else {
						var21.stream2.method2677(var7); // L: 4404
						if (!var21.stream2.hasNext()) { // L: 4405
							var21.stream2 = null; // L: 4406
						}
					}
				} else {
					if (var21.stream1 != null) { // L: 4363
						GrandExchangeEvents.pcmStreamMixer.removeSubStream(var21.stream1); // L: 4364
						var21.stream1 = null; // L: 4365
					}

					if (var21.stream2 != null) { // L: 4367
						GrandExchangeEvents.pcmStreamMixer.removeSubStream(var21.stream2); // L: 4368
						var21.stream2 = null; // L: 4369
					}
				}
			}
		}

		field743 = 0; // L: 4411
	} // L: 4412

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Ldg;I)Z",
		garbageValue = "-1472094898"
	)
	final boolean method1616(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5848
		PacketBuffer var3 = var1.packetBuffer; // L: 5849
		if (var2 == null) { // L: 5850
			return false;
		} else {
			int var6;
			String var17;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5852
					if (var1.field1340) { // L: 5853
						if (!var2.isAvailable(1)) { // L: 5854
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5855
						var1.field1337 = 0; // L: 5856
						var1.field1340 = false; // L: 5857
					}

					var3.offset = 0; // L: 5859
					if (var3.method5582()) { // L: 5860
						if (!var2.isAvailable(1)) { // L: 5861
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5862
						var1.field1337 = 0; // L: 5863
					}

					var1.field1340 = true; // L: 5865
					ServerPacket[] var4 = ArchiveDiskActionHandler.ServerPacket_values(); // L: 5866
					var5 = var3.readSmartByteShortIsaac(); // L: 5867
					if (var5 < 0 || var5 >= var4.length) { // L: 5868
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5869
					var1.serverPacketLength = var1.serverPacket.length; // L: 5870
				}

				if (var1.serverPacketLength == -1) { // L: 5872
					if (!var2.isAvailable(1)) { // L: 5873
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5874
					var1.serverPacketLength = var3.array[0] & 255; // L: 5875
				}

				if (var1.serverPacketLength == -2) { // L: 5877
					if (!var2.isAvailable(2)) { // L: 5878
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5879
					var3.offset = 0; // L: 5880
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5881
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5883
					return false;
				}

				var3.offset = 0; // L: 5884
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5885
				var1.field1337 = 0; // L: 5886
				timer.method5135(); // L: 5887
				var1.field1350 = var1.field1339; // L: 5888
				var1.field1339 = var1.field1348; // L: 5889
				var1.field1348 = var1.serverPacket; // L: 5890
				int var16;
				InterfaceParent var41;
				if (ServerPacket.field2207 == var1.serverPacket) { // L: 5891
					var16 = var3.method5687(); // L: 5892
					var5 = var3.readUnsignedShort(); // L: 5893
					var6 = var3.method5650(); // L: 5894
					var41 = (InterfaceParent)interfaceParents.get((long)var16); // L: 5895
					if (var41 != null) { // L: 5896
						Player.closeInterface(var41, var5 != var41.group);
					}

					ModelData0.method3381(var16, var5, var6); // L: 5897
					var1.serverPacket = null; // L: 5898
					return true; // L: 5899
				}

				if (ServerPacket.field2202 == var1.serverPacket) { // L: 5901
					for (var16 = 0; var16 < VarpDefinition.VarpDefinition_fileCount; ++var16) { // L: 5902
						VarpDefinition var51 = PendingSpawn.VarpDefinition_get(var16); // L: 5903
						if (var51 != null) { // L: 5904
							Varps.Varps_temp[var16] = 0; // L: 5905
							Varps.Varps_main[var16] = 0; // L: 5906
						}
					}

					ItemDefinition.method4874(); // L: 5909
					field868 += 32; // L: 5910
					var1.serverPacket = null; // L: 5911
					return true; // L: 5912
				}

				String var38;
				if (ServerPacket.field2157 == var1.serverPacket) { // L: 5914
					var38 = var3.readStringCp1252NullTerminated(); // L: 5915
					var5 = var3.method5650(); // L: 5916
					var6 = var3.method5650(); // L: 5917
					if (var5 >= 1 && var5 <= 8) { // L: 5918
						if (var38.equalsIgnoreCase("null")) { // L: 5919
							var38 = null;
						}

						playerMenuActions[var5 - 1] = var38; // L: 5920
						playerOptionsPriorities[var5 - 1] = var6 == 0; // L: 5921
					}

					var1.serverPacket = null; // L: 5923
					return true; // L: 5924
				}

				long var18;
				long var20;
				if (ServerPacket.field2224 == var1.serverPacket) { // L: 5926
					var38 = var3.readStringCp1252NullTerminated(); // L: 5927
					var18 = (long)var3.readUnsignedShort(); // L: 5928
					var20 = (long)var3.readMedium(); // L: 5929
					PlayerType var9 = (PlayerType)class195.findEnumerated(WorldMapLabelSize.PlayerType_values(), var3.readUnsignedByte()); // L: 5930
					long var10 = var20 + (var18 << 32); // L: 5931
					boolean var12 = false; // L: 5932

					for (int var13 = 0; var13 < 100; ++var13) { // L: 5933
						if (var10 == field900[var13]) { // L: 5934
							var12 = true; // L: 5935
							break; // L: 5936
						}
					}

					if (WorldMapLabelSize.friendSystem.isIgnored(new Username(var38, UserComparator4.loginType))) { // L: 5939
						var12 = true;
					}

					if (!var12 && field795 == 0) { // L: 5940
						field900[field901] = var10; // L: 5941
						field901 = (field901 + 1) % 100; // L: 5942
						String var22 = AbstractFont.escapeBrackets(WorldMapSection0.method328(Tile.method3004(var3))); // L: 5943
						byte var44;
						if (var9.isPrivileged) { // L: 5945
							var44 = 7;
						} else {
							var44 = 3; // L: 5946
						}

						if (var9.modIcon != -1) { // L: 5947
							DevicePcmPlayerProvider.addGameMessage(var44, PrivateChatMode.method6034(var9.modIcon) + var38, var22);
						} else {
							DevicePcmPlayerProvider.addGameMessage(var44, var38, var22); // L: 5948
						}
					}

					var1.serverPacket = null; // L: 5950
					return true; // L: 5951
				}

				int var8;
				int var24;
				int var25;
				int var52;
				if (ServerPacket.field2165 == var1.serverPacket) { // L: 5953
					isCameraLocked = true; // L: 5954
					MilliClock.field2048 = var3.readUnsignedByte(); // L: 5955
					PcmPlayer.field1449 = var3.readUnsignedByte(); // L: 5956
					AbstractRasterProvider.field3890 = var3.readUnsignedShort(); // L: 5957
					WorldMapCacheName.field326 = var3.readUnsignedByte(); // L: 5958
					class60.field452 = var3.readUnsignedByte(); // L: 5959
					if (class60.field452 >= 100) { // L: 5960
						var16 = MilliClock.field2048 * 128 + 64; // L: 5961
						var5 = PcmPlayer.field1449 * 128 + 64; // L: 5962
						var6 = GrandExchangeOfferWorldComparator.getTileHeight(var16, var5, GrandExchangeOfferUnitPriceComparator.Client_plane) - AbstractRasterProvider.field3890; // L: 5963
						var52 = var16 - ItemContainer.cameraX; // L: 5964
						var8 = var6 - ChatChannel.cameraY; // L: 5965
						var24 = var5 - WorldMapManager.cameraZ; // L: 5966
						var25 = (int)Math.sqrt((double)(var52 * var52 + var24 * var24)); // L: 5967
						World.cameraPitch = (int)(Math.atan2((double)var8, (double)var25) * 325.949D) & 2047; // L: 5968
						ViewportMouse.cameraYaw = (int)(Math.atan2((double)var52, (double)var24) * -325.949D) & 2047; // L: 5969
						if (World.cameraPitch < 128) { // L: 5970
							World.cameraPitch = 128;
						}

						if (World.cameraPitch > 383) { // L: 5971
							World.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 5973
					return true; // L: 5974
				}

				if (ServerPacket.field2194 == var1.serverPacket) { // L: 5976
					publicChatMode = var3.method5619(); // L: 5977
					tradeChatMode = var3.readUnsignedByte(); // L: 5978
					var1.serverPacket = null; // L: 5979
					return true; // L: 5980
				}

				if (ServerPacket.field2153 == var1.serverPacket) { // L: 5982
					WorldMapAreaData.method790(var3.readStringCp1252NullTerminated()); // L: 5983
					var1.serverPacket = null; // L: 5984
					return true; // L: 5985
				}

				if (ServerPacket.field2145 == var1.serverPacket) { // L: 5987
					class39.privateChatMode = MouseRecorder.method1287(var3.readUnsignedByte()); // L: 5988
					var1.serverPacket = null; // L: 5989
					return true; // L: 5990
				}

				if (ServerPacket.field2220 == var1.serverPacket) { // L: 5992
					var16 = var3.readInt(); // L: 5993
					InterfaceParent var50 = (InterfaceParent)interfaceParents.get((long)var16); // L: 5994
					if (var50 != null) { // L: 5995
						Player.closeInterface(var50, true);
					}

					if (meslayerContinueWidget != null) { // L: 5996
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(meslayerContinueWidget); // L: 5997
						meslayerContinueWidget = null; // L: 5998
					}

					var1.serverPacket = null; // L: 6000
					return true; // L: 6001
				}

				Widget var47;
				if (ServerPacket.field2172 == var1.serverPacket) { // L: 6003
					var16 = var3.method5686(); // L: 6004
					var47 = UserComparator4.getWidget(var16); // L: 6005

					for (var6 = 0; var6 < var47.itemIds.length; ++var6) { // L: 6006
						var47.itemIds[var6] = -1; // L: 6007
						var47.itemIds[var6] = 0; // L: 6008
					}

					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var47); // L: 6010
					var1.serverPacket = null; // L: 6011
					return true; // L: 6012
				}

				Widget var7;
				if (ServerPacket.field2188 == var1.serverPacket) { // L: 6014
					var16 = var3.method5797(); // L: 6015
					if (var16 == 65535) { // L: 6016
						var16 = -1;
					}

					var5 = var3.method5685(); // L: 6017
					var6 = var3.readInt(); // L: 6018
					var7 = UserComparator4.getWidget(var6); // L: 6019
					ItemDefinition var54;
					if (!var7.isIf3) { // L: 6020
						if (var16 == -1) { // L: 6021
							var7.modelType = 0; // L: 6022
							var1.serverPacket = null; // L: 6023
							return true; // L: 6024
						}

						var54 = AbstractWorldMapData.ItemDefinition_get(var16); // L: 6026
						var7.modelType = 4; // L: 6027
						var7.modelId = var16; // L: 6028
						var7.modelAngleX = var54.xan2d; // L: 6029
						var7.modelAngleY = var54.yan2d; // L: 6030
						var7.modelZoom = var54.zoom2d * 100 / var5; // L: 6031
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var7); // L: 6032
					} else {
						var7.itemId = var16; // L: 6035
						var7.itemQuantity = var5; // L: 6036
						var54 = AbstractWorldMapData.ItemDefinition_get(var16); // L: 6037
						var7.modelAngleX = var54.xan2d; // L: 6038
						var7.modelAngleY = var54.yan2d; // L: 6039
						var7.modelAngleZ = var54.zan2d; // L: 6040
						var7.modelOffsetX = var54.offsetX2d; // L: 6041
						var7.modelOffsetY = var54.offsetY2d; // L: 6042
						var7.modelZoom = var54.zoom2d; // L: 6043
						if (var54.isStackable == 1) { // L: 6044
							var7.itemQuantityMode = 1;
						} else {
							var7.itemQuantityMode = 2; // L: 6045
						}

						if (var7.field2678 > 0) { // L: 6046
							var7.modelZoom = var7.modelZoom * 32 / var7.field2678;
						} else if (var7.rawWidth > 0) { // L: 6047
							var7.modelZoom = var7.modelZoom * 32 / var7.rawWidth;
						}

						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var7); // L: 6048
					}

					var1.serverPacket = null; // L: 6050
					return true; // L: 6051
				}

				if (ServerPacket.field2166 == var1.serverPacket) { // L: 6053
					if (rootInterface != -1) { // L: 6054
						WorldMapAreaData.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6055
					return true; // L: 6056
				}

				if (ServerPacket.field2218 == var1.serverPacket) { // L: 6058
					var16 = var3.readUnsignedByte(); // L: 6059
					var5 = var3.readUnsignedByte(); // L: 6060
					var6 = var3.readUnsignedByte(); // L: 6061
					var52 = var3.readUnsignedByte(); // L: 6062
					field926[var16] = true; // L: 6063
					field927[var16] = var5; // L: 6064
					field928[var16] = var6; // L: 6065
					field898[var16] = var52; // L: 6066
					field918[var16] = 0; // L: 6067
					var1.serverPacket = null; // L: 6068
					return true; // L: 6069
				}

				if (ServerPacket.field2162 == var1.serverPacket) { // L: 6071
					var16 = var3.readInt(); // L: 6072
					var5 = var3.readInt(); // L: 6073
					var6 = class238.getGcDuration(); // L: 6074
					PacketBufferNode var43 = class4.getPacketBufferNode(ClientPacket.field2296, packetWriter.isaacCipher); // L: 6076
					var43.packetBuffer.writeByte(var6); // L: 6077
					var43.packetBuffer.method5665(GameShell.fps); // L: 6078
					var43.packetBuffer.method5684(var16); // L: 6079
					var43.packetBuffer.writeInt(var5); // L: 6080
					packetWriter.addNode(var43); // L: 6081
					var1.serverPacket = null; // L: 6082
					return true; // L: 6083
				}

				Widget var27;
				if (ServerPacket.field2185 == var1.serverPacket) { // L: 6085
					var16 = var3.method5685(); // L: 6086
					var17 = var3.readStringCp1252NullTerminated(); // L: 6087
					var27 = UserComparator4.getWidget(var16); // L: 6088
					if (!var17.equals(var27.text)) { // L: 6089
						var27.text = var17; // L: 6090
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27); // L: 6091
					}

					var1.serverPacket = null; // L: 6093
					return true; // L: 6094
				}

				if (ServerPacket.field2204 == var1.serverPacket) { // L: 6096
					WorldMapLabelSize.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6097
					class52.FriendSystem_invalidateIgnoreds(); // L: 6098
					field874 = cycleCntr; // L: 6099
					var1.serverPacket = null; // L: 6100
					return true; // L: 6101
				}

				if (ServerPacket.field2184 == var1.serverPacket) { // L: 6103
					WorldMapEvent.method865(class194.field2351); // L: 6104
					var1.serverPacket = null; // L: 6105
					return true; // L: 6106
				}

				if (ServerPacket.field2216 == var1.serverPacket) { // L: 6108
					minimapState = var3.readUnsignedByte(); // L: 6109
					var1.serverPacket = null; // L: 6110
					return true; // L: 6111
				}

				long var29;
				if (ServerPacket.field2195 == var1.serverPacket) { // L: 6113
					var16 = var3.offset + var1.serverPacketLength; // L: 6114
					var5 = var3.readUnsignedShort(); // L: 6115
					var6 = var3.readUnsignedShort(); // L: 6116
					if (var5 != rootInterface) { // L: 6117
						rootInterface = var5; // L: 6118
						this.resizeRoot(false); // L: 6119
						FontName.Widget_resetModelFrames(rootInterface); // L: 6120
						ScriptFrame.runWidgetOnLoadListener(rootInterface); // L: 6121

						for (var52 = 0; var52 < 100; ++var52) { // L: 6122
							field834[var52] = true;
						}
					}

					InterfaceParent var57;
					for (; var6-- > 0; var57.field596 = true) { // L: 6124 6134
						var52 = var3.readInt(); // L: 6125
						var8 = var3.readUnsignedShort(); // L: 6126
						var24 = var3.readUnsignedByte(); // L: 6127
						var57 = (InterfaceParent)interfaceParents.get((long)var52); // L: 6128
						if (var57 != null && var8 != var57.group) { // L: 6129
							Player.closeInterface(var57, true); // L: 6130
							var57 = null; // L: 6131
						}

						if (var57 == null) { // L: 6133
							var57 = ModelData0.method3381(var52, var8, var24);
						}
					}

					for (var41 = (InterfaceParent)interfaceParents.first(); var41 != null; var41 = (InterfaceParent)interfaceParents.next()) { // L: 6136
						if (var41.field596) { // L: 6137
							var41.field596 = false;
						} else {
							Player.closeInterface(var41, true); // L: 6139
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6142

					while (var3.offset < var16) { // L: 6143
						var52 = var3.readInt(); // L: 6144
						var8 = var3.readUnsignedShort(); // L: 6145
						var24 = var3.readUnsignedShort(); // L: 6146
						var25 = var3.readInt(); // L: 6147

						for (int var11 = var8; var11 <= var24; ++var11) { // L: 6148
							var29 = (long)var11 + ((long)var52 << 32); // L: 6149
							widgetFlags.put(new IntegerNode(var25), var29); // L: 6150
						}
					}

					var1.serverPacket = null; // L: 6153
					return true; // L: 6154
				}

				if (ServerPacket.field2144 == var1.serverPacket) { // L: 6156
					var16 = var3.readUnsignedByte(); // L: 6157
					if (var3.readUnsignedByte() == 0) { // L: 6158
						grandExchangeOffers[var16] = new GrandExchangeOffer(); // L: 6159
						var3.offset += 18; // L: 6160
					} else {
						--var3.offset; // L: 6163
						grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false); // L: 6164
					}

					field885 = cycleCntr; // L: 6166
					var1.serverPacket = null; // L: 6167
					return true; // L: 6168
				}

				if (ServerPacket.field2221 == var1.serverPacket) { // L: 6170
					var16 = var3.readUnsignedShort(); // L: 6171
					byte var45 = var3.method5669(); // L: 6172
					Varps.Varps_temp[var16] = var45; // L: 6173
					if (Varps.Varps_main[var16] != var45) { // L: 6174
						Varps.Varps_main[var16] = var45; // L: 6175
					}

					class23.changeGameOptions(var16); // L: 6177
					field867[++field868 - 1 & 31] = var16; // L: 6178
					var1.serverPacket = null; // L: 6179
					return true; // L: 6180
				}

				if (ServerPacket.field2182 == var1.serverPacket) { // L: 6182
					class39.updatePlayers(var3, var1.serverPacketLength); // L: 6183
					class197.method3783(); // L: 6184
					var1.serverPacket = null; // L: 6185
					return true; // L: 6186
				}

				if (ServerPacket.field2179 == var1.serverPacket) { // L: 6188
					ItemDefinition.method4874(); // L: 6189
					var16 = var3.readUnsignedByte(); // L: 6190
					var5 = var3.method5650(); // L: 6191
					var6 = var3.readInt(); // L: 6192
					experience[var5] = var6; // L: 6193
					currentLevels[var5] = var16; // L: 6194
					levels[var5] = 1; // L: 6195

					for (var52 = 0; var52 < 98; ++var52) { // L: 6196
						if (var6 >= Skills.Skills_experienceTable[var52]) {
							levels[var5] = var52 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 6197
					var1.serverPacket = null; // L: 6198
					return true; // L: 6199
				}

				long var31;
				if (ServerPacket.field2196 == var1.serverPacket) { // L: 6201
					var16 = var3.readInt(); // L: 6202
					var5 = var3.readUnsignedShort(); // L: 6203
					if (var5 == 65535) { // L: 6204
						var5 = -1;
					}

					var6 = var3.method5675(); // L: 6205
					if (var6 == 65535) { // L: 6206
						var6 = -1;
					}

					var52 = var3.readInt(); // L: 6207

					for (var8 = var6; var8 <= var5; ++var8) { // L: 6208
						var31 = ((long)var52 << 32) + (long)var8; // L: 6209
						Node var60 = widgetFlags.get(var31); // L: 6210
						if (var60 != null) { // L: 6211
							var60.remove();
						}

						widgetFlags.put(new IntegerNode(var16), var31); // L: 6212
					}

					var1.serverPacket = null; // L: 6214
					return true; // L: 6215
				}

				if (ServerPacket.field2167 == var1.serverPacket) { // L: 6217
					ItemDefinition.method4874(); // L: 6218
					runEnergy = var3.readUnsignedByte(); // L: 6219
					field878 = cycleCntr; // L: 6220
					var1.serverPacket = null; // L: 6221
					return true; // L: 6222
				}

				if (ServerPacket.field2150 == var1.serverPacket) { // L: 6224
					isCameraLocked = true; // L: 6225
					WorldMapSection2.field225 = var3.readUnsignedByte(); // L: 6226
					WorldMapLabelSize.field152 = var3.readUnsignedByte(); // L: 6227
					SpriteMask.field2542 = var3.readUnsignedShort(); // L: 6228
					Player.field674 = var3.readUnsignedByte(); // L: 6229
					ReflectionCheck.field1364 = var3.readUnsignedByte(); // L: 6230
					if (ReflectionCheck.field1364 >= 100) { // L: 6231
						ItemContainer.cameraX = WorldMapSection2.field225 * 128 + 64; // L: 6232
						WorldMapManager.cameraZ = WorldMapLabelSize.field152 * 128 + 64; // L: 6233
						ChatChannel.cameraY = GrandExchangeOfferWorldComparator.getTileHeight(ItemContainer.cameraX, WorldMapManager.cameraZ, GrandExchangeOfferUnitPriceComparator.Client_plane) - SpriteMask.field2542; // L: 6234
					}

					var1.serverPacket = null; // L: 6236
					return true; // L: 6237
				}

				if (ServerPacket.field2189 == var1.serverPacket) { // L: 6239
					if (DevicePcmPlayerProvider.clanChat != null) { // L: 6240
						DevicePcmPlayerProvider.clanChat.method5371(var3); // L: 6241
					}

					ClientPacket.method3744(); // L: 6243
					var1.serverPacket = null; // L: 6244
					return true; // L: 6245
				}

				if (ServerPacket.field2168 == var1.serverPacket) { // L: 6247
					GrandExchangeEvents.field64 = var3.readUnsignedByte(); // L: 6248
					GameShell.field466 = var3.method5650(); // L: 6249

					while (var3.offset < var1.serverPacketLength) { // L: 6250
						var16 = var3.readUnsignedByte(); // L: 6251
						class194 var49 = GrandExchangeOffer.method208()[var16]; // L: 6252
						WorldMapEvent.method865(var49); // L: 6253
					}

					var1.serverPacket = null; // L: 6255
					return true; // L: 6256
				}

				if (ServerPacket.field2177 == var1.serverPacket) { // L: 6258
					var16 = var3.readInt(); // L: 6259
					var5 = var3.readUnsignedShort(); // L: 6260
					if (var16 < -70000) { // L: 6261
						var5 += 32768;
					}

					if (var16 >= 0) { // L: 6263
						var27 = UserComparator4.getWidget(var16);
					} else {
						var27 = null; // L: 6264
					}

					for (; var3.offset < var1.serverPacketLength; GrandExchangeEvents.itemContainerSetItem(var5, var52, var8 - 1, var24)) { // L: 6265 6279
						var52 = var3.readUShortSmart(); // L: 6266
						var8 = var3.readUnsignedShort(); // L: 6267
						var24 = 0; // L: 6268
						if (var8 != 0) { // L: 6269
							var24 = var3.readUnsignedByte(); // L: 6270
							if (var24 == 255) { // L: 6271
								var24 = var3.readInt();
							}
						}

						if (var27 != null && var52 >= 0 && var52 < var27.itemIds.length) { // L: 6273 6274
							var27.itemIds[var52] = var8; // L: 6275
							var27.itemQuantities[var52] = var24; // L: 6276
						}
					}

					if (var27 != null) { // L: 6281
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					ItemDefinition.method4874(); // L: 6282
					changedItemContainers[++field941 - 1 & 31] = var5 & 32767; // L: 6283
					var1.serverPacket = null; // L: 6284
					return true; // L: 6285
				}

				Widget var53;
				if (ServerPacket.field2219 == var1.serverPacket) { // L: 6287
					var16 = var3.method5797(); // L: 6288
					var5 = var3.method5686(); // L: 6289
					var6 = var3.method5659(); // L: 6290
					var52 = var3.method5797(); // L: 6291
					var53 = UserComparator4.getWidget(var5); // L: 6292
					if (var6 != var53.modelAngleX || var16 != var53.modelAngleY || var52 != var53.modelZoom) { // L: 6293
						var53.modelAngleX = var6; // L: 6294
						var53.modelAngleY = var16; // L: 6295
						var53.modelZoom = var52; // L: 6296
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var53); // L: 6297
					}

					var1.serverPacket = null; // L: 6299
					return true; // L: 6300
				}

				if (ServerPacket.field2227 == var1.serverPacket) { // L: 6302
					WorldMapEvent.method865(class194.field2348); // L: 6303
					var1.serverPacket = null; // L: 6304
					return true; // L: 6305
				}

				if (ServerPacket.field2193 == var1.serverPacket) { // L: 6307
					ItemDefinition.method4874(); // L: 6308
					weight = var3.readShort(); // L: 6309
					field878 = cycleCntr; // L: 6310
					var1.serverPacket = null; // L: 6311
					return true; // L: 6312
				}

				if (ServerPacket.field2143 == var1.serverPacket) { // L: 6314
					var16 = var3.method5797(); // L: 6315
					var5 = var3.readInt(); // L: 6316
					var6 = var16 >> 10 & 31; // L: 6317
					var52 = var16 >> 5 & 31; // L: 6318
					var8 = var16 & 31; // L: 6319
					var24 = (var52 << 11) + (var6 << 19) + (var8 << 3); // L: 6320
					Widget var28 = UserComparator4.getWidget(var5); // L: 6321
					if (var24 != var28.color) { // L: 6322
						var28.color = var24; // L: 6323
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var28); // L: 6324
					}

					var1.serverPacket = null; // L: 6326
					return true; // L: 6327
				}

				if (ServerPacket.field2158 == var1.serverPacket) { // L: 6329
					PacketWriter.loadRegions(false, var1.packetBuffer); // L: 6330
					var1.serverPacket = null; // L: 6331
					return true; // L: 6332
				}

				if (ServerPacket.field2159 == var1.serverPacket) { // L: 6334
					GrandExchangeEvents.field64 = var3.method5668(); // L: 6335
					GameShell.field466 = var3.method5650(); // L: 6336
					var1.serverPacket = null; // L: 6337
					return true; // L: 6338
				}

				boolean var55;
				if (ServerPacket.field2170 == var1.serverPacket) { // L: 6340
					var55 = var3.readUnsignedByte() == 1; // L: 6341
					var5 = var3.method5685(); // L: 6342
					var27 = UserComparator4.getWidget(var5); // L: 6343
					if (var55 != var27.isHidden) { // L: 6344
						var27.isHidden = var55; // L: 6345
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27); // L: 6346
					}

					var1.serverPacket = null; // L: 6348
					return true; // L: 6349
				}

				if (ServerPacket.field2214 == var1.serverPacket) { // L: 6351
					var38 = var3.readStringCp1252NullTerminated(); // L: 6352
					var18 = var3.readLong(); // L: 6353
					var20 = (long)var3.readUnsignedShort(); // L: 6354
					var31 = (long)var3.readMedium(); // L: 6355
					PlayerType var33 = (PlayerType)class195.findEnumerated(WorldMapLabelSize.PlayerType_values(), var3.readUnsignedByte()); // L: 6356
					var29 = (var20 << 32) + var31; // L: 6357
					boolean var14 = false; // L: 6358

					for (int var15 = 0; var15 < 100; ++var15) { // L: 6359
						if (field900[var15] == var29) { // L: 6360
							var14 = true; // L: 6361
							break; // L: 6362
						}
					}

					if (var33.isUser && WorldMapLabelSize.friendSystem.isIgnored(new Username(var38, UserComparator4.loginType))) { // L: 6365 6366
						var14 = true;
					}

					if (!var14 && field795 == 0) { // L: 6368
						field900[field901] = var29; // L: 6369
						field901 = (field901 + 1) % 100; // L: 6370
						String var34 = AbstractFont.escapeBrackets(WorldMapSection0.method328(Tile.method3004(var3))); // L: 6371
						if (var33.modIcon != -1) { // L: 6372
							class3.addChatMessage(9, PrivateChatMode.method6034(var33.modIcon) + var38, var34, class69.base37DecodeLong(var18));
						} else {
							class3.addChatMessage(9, var38, var34, class69.base37DecodeLong(var18)); // L: 6373
						}
					}

					var1.serverPacket = null; // L: 6375
					return true; // L: 6376
				}

				if (ServerPacket.field2210 == var1.serverPacket) { // L: 6378
					class89.logOut(); // L: 6379
					var1.serverPacket = null; // L: 6380
					return false; // L: 6381
				}

				if (ServerPacket.field2156 == var1.serverPacket) { // L: 6383
					var55 = var3.readBoolean(); // L: 6384
					if (var55) { // L: 6385
						if (ModelData0.field1895 == null) { // L: 6386
							ModelData0.field1895 = new class248();
						}
					} else {
						ModelData0.field1895 = null; // L: 6388
					}

					var1.serverPacket = null; // L: 6389
					return true; // L: 6390
				}

				if (ServerPacket.field2171 == var1.serverPacket) { // L: 6392
					var16 = var3.method5659(); // L: 6393
					var5 = var3.method5685(); // L: 6394
					Varps.Varps_temp[var16] = var5; // L: 6395
					if (Varps.Varps_main[var16] != var5) { // L: 6396
						Varps.Varps_main[var16] = var5; // L: 6397
					}

					class23.changeGameOptions(var16); // L: 6399
					field867[++field868 - 1 & 31] = var16; // L: 6400
					var1.serverPacket = null; // L: 6401
					return true; // L: 6402
				}

				if (ServerPacket.field2190 == var1.serverPacket) { // L: 6404
					var16 = var3.method5686(); // L: 6405
					var5 = var3.method5679(); // L: 6406
					var27 = UserComparator4.getWidget(var16); // L: 6407
					if (var5 != var27.sequenceId || var5 == -1) { // L: 6408
						var27.sequenceId = var5; // L: 6409
						var27.modelFrame = 0; // L: 6410
						var27.modelFrameCycle = 0; // L: 6411
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27); // L: 6412
					}

					var1.serverPacket = null; // L: 6414
					return true; // L: 6415
				}

				if (ServerPacket.field2180 == var1.serverPacket) { // L: 6417
					MusicPatch.updateNpcs(true, var3); // L: 6418
					var1.serverPacket = null; // L: 6419
					return true; // L: 6420
				}

				if (ServerPacket.field2183 == var1.serverPacket) { // L: 6422
					var55 = var3.readUnsignedByte() == 1; // L: 6423
					if (var55) { // L: 6424
						class58.field444 = User.currentTimeMillis() - var3.readLong(); // L: 6425
						WorldMapDecoration.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6426
					} else {
						WorldMapDecoration.grandExchangeEvents = null; // L: 6428
					}

					field852 = cycleCntr; // L: 6429
					var1.serverPacket = null; // L: 6430
					return true; // L: 6431
				}

				if (ServerPacket.field2222 == var1.serverPacket) { // L: 6433
					var38 = var3.readStringCp1252NullTerminated(); // L: 6434
					Object[] var48 = new Object[var38.length() + 1]; // L: 6435

					for (var6 = var38.length() - 1; var6 >= 0; --var6) { // L: 6436
						if (var38.charAt(var6) == 's') { // L: 6437
							var48[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var48[var6 + 1] = new Integer(var3.readInt()); // L: 6438
						}
					}

					var48[0] = new Integer(var3.readInt()); // L: 6440
					ScriptEvent var59 = new ScriptEvent(); // L: 6441
					var59.args = var48; // L: 6442
					Entity.runScriptEvent(var59); // L: 6443
					var1.serverPacket = null; // L: 6444
					return true; // L: 6445
				}

				if (ServerPacket.field2142 == var1.serverPacket) { // L: 6447
					var16 = var3.method5685(); // L: 6448
					var47 = UserComparator4.getWidget(var16); // L: 6449
					var47.modelType = 3; // L: 6450
					var47.modelId = PlayerType.localPlayer.appearance.getChatHeadId(); // L: 6451
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var47); // L: 6452
					var1.serverPacket = null; // L: 6453
					return true; // L: 6454
				}

				if (ServerPacket.field2175 == var1.serverPacket) { // L: 6456
					WorldMapEvent.method865(class194.field2355); // L: 6457
					var1.serverPacket = null; // L: 6458
					return true; // L: 6459
				}

				String var56;
				if (ServerPacket.field2164 == var1.serverPacket) { // L: 6461
					byte[] var40 = new byte[var1.serverPacketLength]; // L: 6462
					var3.method5584(var40, 0, var40.length); // L: 6463
					Buffer var46 = new Buffer(var40); // L: 6464
					var56 = var46.readStringCp1252NullTerminated(); // L: 6465
					Skeleton.openURL(var56, true, false); // L: 6466
					var1.serverPacket = null; // L: 6467
					return true; // L: 6468
				}

				if (ServerPacket.field2176 == var1.serverPacket) { // L: 6470
					var16 = var3.readInt(); // L: 6471
					var5 = var3.readUnsignedShort(); // L: 6472
					if (var16 < -70000) { // L: 6473
						var5 += 32768;
					}

					if (var16 >= 0) { // L: 6475
						var27 = UserComparator4.getWidget(var16);
					} else {
						var27 = null; // L: 6476
					}

					if (var27 != null) { // L: 6477
						for (var52 = 0; var52 < var27.itemIds.length; ++var52) { // L: 6478
							var27.itemIds[var52] = 0; // L: 6479
							var27.itemQuantities[var52] = 0; // L: 6480
						}
					}

					class3.clearItemContainer(var5); // L: 6483
					var52 = var3.readUnsignedShort(); // L: 6484

					for (var8 = 0; var8 < var52; ++var8) { // L: 6485
						var24 = var3.method5650(); // L: 6486
						if (var24 == 255) { // L: 6487
							var24 = var3.readInt();
						}

						var25 = var3.readUnsignedShort(); // L: 6488
						if (var27 != null && var8 < var27.itemIds.length) { // L: 6489 6490
							var27.itemIds[var8] = var25; // L: 6491
							var27.itemQuantities[var8] = var24; // L: 6492
						}

						GrandExchangeEvents.itemContainerSetItem(var5, var8, var25 - 1, var24); // L: 6495
					}

					if (var27 != null) { // L: 6497
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27);
					}

					ItemDefinition.method4874(); // L: 6498
					changedItemContainers[++field941 - 1 & 31] = var5 & 32767; // L: 6499
					var1.serverPacket = null; // L: 6500
					return true; // L: 6501
				}

				if (ServerPacket.field2223 == var1.serverPacket) { // L: 6503
					hintArrowType = var3.readUnsignedByte(); // L: 6504
					if (hintArrowType == 1) { // L: 6505
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6506
						if (hintArrowType == 2) { // L: 6507
							hintArrowSubX = 64; // L: 6508
							hintArrowSubY = 64; // L: 6509
						}

						if (hintArrowType == 3) { // L: 6511
							hintArrowSubX = 0; // L: 6512
							hintArrowSubY = 64; // L: 6513
						}

						if (hintArrowType == 4) { // L: 6515
							hintArrowSubX = 128; // L: 6516
							hintArrowSubY = 64; // L: 6517
						}

						if (hintArrowType == 5) { // L: 6519
							hintArrowSubX = 64; // L: 6520
							hintArrowSubY = 0; // L: 6521
						}

						if (hintArrowType == 6) { // L: 6523
							hintArrowSubX = 64; // L: 6524
							hintArrowSubY = 128; // L: 6525
						}

						hintArrowType = 2; // L: 6527
						hintArrowX = var3.readUnsignedShort(); // L: 6528
						hintArrowY = var3.readUnsignedShort(); // L: 6529
						hintArrowHeight = var3.readUnsignedByte(); // L: 6530
					}

					if (hintArrowType == 10) { // L: 6532
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6533
					return true; // L: 6534
				}

				if (ServerPacket.field2230 == var1.serverPacket) { // L: 6536
					WorldMapEvent.method865(class194.field2349); // L: 6537
					var1.serverPacket = null; // L: 6538
					return true; // L: 6539
				}

				if (ServerPacket.field2152 == var1.serverPacket) { // L: 6541
					var16 = var3.method5675(); // L: 6542
					if (var16 == 65535) { // L: 6543
						var16 = -1;
					}

					Messages.playSong(var16); // L: 6544
					var1.serverPacket = null; // L: 6545
					return true; // L: 6546
				}

				if (ServerPacket.field2178 == var1.serverPacket) { // L: 6548
					var16 = var3.method5675(); // L: 6549
					if (var16 == 65535) { // L: 6550
						var16 = -1;
					}

					var5 = var3.method5852(); // L: 6551
					Projectile.playSoundJingle(var16, var5); // L: 6552
					var1.serverPacket = null; // L: 6553
					return true; // L: 6554
				}

				if (ServerPacket.field2206 == var1.serverPacket) { // L: 6556
					var16 = var3.method5686(); // L: 6557
					var5 = var3.method5685(); // L: 6558
					InterfaceParent var58 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6559
					var41 = (InterfaceParent)interfaceParents.get((long)var16); // L: 6560
					if (var41 != null) { // L: 6561
						Player.closeInterface(var41, var58 == null || var41.group != var58.group);
					}

					if (var58 != null) { // L: 6562
						var58.remove(); // L: 6563
						interfaceParents.put(var58, (long)var16); // L: 6564
					}

					var53 = UserComparator4.getWidget(var5); // L: 6566
					if (var53 != null) { // L: 6567
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var53);
					}

					var53 = UserComparator4.getWidget(var16); // L: 6568
					if (var53 != null) { // L: 6569
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var53); // L: 6570
						UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var53.id >>> 16], var53, true); // L: 6571
					}

					if (rootInterface != -1) { // L: 6573
						WorldMapAreaData.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6574
					return true; // L: 6575
				}

				if (ServerPacket.field2211 == var1.serverPacket) { // L: 6577
					var16 = var3.readUnsignedShort(); // L: 6578
					rootInterface = var16; // L: 6579
					this.resizeRoot(false); // L: 6580
					FontName.Widget_resetModelFrames(var16); // L: 6581
					ScriptFrame.runWidgetOnLoadListener(rootInterface); // L: 6582

					for (var5 = 0; var5 < 100; ++var5) { // L: 6583
						field834[var5] = true;
					}

					var1.serverPacket = null; // L: 6584
					return true; // L: 6585
				}

				if (ServerPacket.field2199 == var1.serverPacket) { // L: 6587
					var3.offset += 28; // L: 6588
					if (var3.checkCrc()) { // L: 6589
						UserComparator6.method3565(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6590
					return true; // L: 6591
				}

				if (ServerPacket.field2174 == var1.serverPacket) { // L: 6593
					WorldMapEvent.method865(class194.field2356); // L: 6594
					var1.serverPacket = null; // L: 6595
					return true; // L: 6596
				}

				if (ServerPacket.field2191 == var1.serverPacket) { // L: 6598
					WorldMapEvent.method865(class194.field2352); // L: 6599
					var1.serverPacket = null; // L: 6600
					return true; // L: 6601
				}

				if (ServerPacket.field2181 == var1.serverPacket) { // L: 6603
					var16 = var3.readUShortSmart(); // L: 6604
					boolean var42 = var3.readUnsignedByte() == 1; // L: 6605
					var56 = ""; // L: 6606
					boolean var23 = false; // L: 6607
					if (var42) { // L: 6608
						var56 = var3.readStringCp1252NullTerminated(); // L: 6609
						if (WorldMapLabelSize.friendSystem.isIgnored(new Username(var56, UserComparator4.loginType))) { // L: 6610
							var23 = true;
						}
					}

					String var26 = var3.readStringCp1252NullTerminated(); // L: 6612
					if (!var23) { // L: 6613
						DevicePcmPlayerProvider.addGameMessage(var16, var56, var26);
					}

					var1.serverPacket = null; // L: 6614
					return true; // L: 6615
				}

				if (ServerPacket.field2217 == var1.serverPacket) { // L: 6617
					WorldMapEvent.method865(class194.field2357); // L: 6618
					var1.serverPacket = null; // L: 6619
					return true; // L: 6620
				}

				if (ServerPacket.field2225 == var1.serverPacket) { // L: 6622
					var16 = var3.readInt(); // L: 6623
					var5 = var3.method5797(); // L: 6624
					var27 = UserComparator4.getWidget(var16); // L: 6625
					if (var27.modelType != 1 || var5 != var27.modelId) { // L: 6626
						var27.modelType = 1; // L: 6627
						var27.modelId = var5; // L: 6628
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27); // L: 6629
					}

					var1.serverPacket = null; // L: 6631
					return true; // L: 6632
				}

				if (ServerPacket.field2154 == var1.serverPacket) { // L: 6634
					for (var16 = 0; var16 < Varps.Varps_main.length; ++var16) { // L: 6635
						if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) { // L: 6636
							Varps.Varps_main[var16] = Varps.Varps_temp[var16]; // L: 6637
							class23.changeGameOptions(var16); // L: 6638
							field867[++field868 - 1 & 31] = var16; // L: 6639
						}
					}

					var1.serverPacket = null; // L: 6642
					return true; // L: 6643
				}

				if (ServerPacket.field2203 == var1.serverPacket) { // L: 6645
					WorldMapEvent.method865(class194.field2359); // L: 6646
					var1.serverPacket = null; // L: 6647
					return true; // L: 6648
				}

				if (ServerPacket.field2163 == var1.serverPacket) { // L: 6650
					if (var1.serverPacketLength == 0) { // L: 6651
						DevicePcmPlayerProvider.clanChat = null; // L: 6652
					} else {
						if (DevicePcmPlayerProvider.clanChat == null) { // L: 6655
							DevicePcmPlayerProvider.clanChat = new ClanChat(UserComparator4.loginType, ByteArrayPool.client); // L: 6656
						}

						DevicePcmPlayerProvider.clanChat.readUpdate(var3); // L: 6658
					}

					ClientPacket.method3744(); // L: 6660
					var1.serverPacket = null; // L: 6661
					return true; // L: 6662
				}

				if (ServerPacket.field2160 == var1.serverPacket) { // L: 6664
					rebootTimer = var3.method5659() * 30; // L: 6665
					field878 = cycleCntr; // L: 6666
					var1.serverPacket = null; // L: 6667
					return true; // L: 6668
				}

				if (ServerPacket.field2205 == var1.serverPacket) { // L: 6670
					WorldMapEvent.method865(class194.field2353); // L: 6671
					var1.serverPacket = null; // L: 6672
					return true; // L: 6673
				}

				if (ServerPacket.field2213 == var1.serverPacket) { // L: 6675
					var16 = var3.readInt(); // L: 6676
					if (var16 != field763) { // L: 6677
						field763 = var16; // L: 6678
						ScriptEvent.method1282(); // L: 6679
					}

					var1.serverPacket = null; // L: 6681
					return true; // L: 6682
				}

				if (ServerPacket.field2197 == var1.serverPacket) { // L: 6684
					var16 = var3.method5659(); // L: 6685
					var5 = var3.readInt(); // L: 6686
					var6 = var3.method5659(); // L: 6687
					var7 = UserComparator4.getWidget(var5); // L: 6688
					var7.field2734 = var16 + (var6 << 16); // L: 6689
					var1.serverPacket = null; // L: 6690
					return true; // L: 6691
				}

				if (ServerPacket.field2200 == var1.serverPacket) { // L: 6693
					World var39 = new World(); // L: 6694
					var39.host = var3.readStringCp1252NullTerminated(); // L: 6695
					var39.id = var3.readUnsignedShort(); // L: 6696
					var5 = var3.readInt(); // L: 6697
					var39.properties = var5; // L: 6698
					BuddyRankComparator.updateGameState(45); // L: 6699
					var2.close(); // L: 6700
					var2 = null; // L: 6701
					AbstractByteArrayCopier.changeWorld(var39); // L: 6702
					var1.serverPacket = null; // L: 6703
					return false; // L: 6704
				}

				if (ServerPacket.field2212 == var1.serverPacket) { // L: 6706
					var38 = var3.readStringCp1252NullTerminated(); // L: 6707
					var17 = AbstractFont.escapeBrackets(WorldMapSection0.method328(Tile.method3004(var3))); // L: 6708
					DevicePcmPlayerProvider.addGameMessage(6, var38, var17); // L: 6709
					var1.serverPacket = null; // L: 6710
					return true; // L: 6711
				}

				if (ServerPacket.field2151 == var1.serverPacket) { // L: 6713
					WorldMapLabelSize.friendSystem.method1957(); // L: 6714
					field874 = cycleCntr; // L: 6715
					var1.serverPacket = null; // L: 6716
					return true; // L: 6717
				}

				if (ServerPacket.field2209 == var1.serverPacket) { // L: 6719
					PacketWriter.loadRegions(true, var1.packetBuffer); // L: 6720
					var1.serverPacket = null; // L: 6721
					return true; // L: 6722
				}

				if (ServerPacket.field2161 == var1.serverPacket) { // L: 6724
					isCameraLocked = false; // L: 6725

					for (var16 = 0; var16 < 5; ++var16) { // L: 6726
						field926[var16] = false;
					}

					var1.serverPacket = null; // L: 6727
					return true; // L: 6728
				}

				if (ServerPacket.field2201 == var1.serverPacket) { // L: 6730
					var16 = var3.method5678(); // L: 6731
					var5 = var3.readShort(); // L: 6732
					var6 = var3.method5685(); // L: 6733
					var7 = UserComparator4.getWidget(var6); // L: 6734
					if (var16 != var7.rawX || var5 != var7.rawY || var7.xAlignment != 0 || var7.yAlignment != 0) { // L: 6735
						var7.rawX = var16; // L: 6736
						var7.rawY = var5; // L: 6737
						var7.xAlignment = 0; // L: 6738
						var7.yAlignment = 0; // L: 6739
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var7); // L: 6740
						this.alignWidget(var7); // L: 6741
						if (var7.type == 0) { // L: 6742
							UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var7, false);
						}
					}

					var1.serverPacket = null; // L: 6744
					return true; // L: 6745
				}

				if (ServerPacket.field2173 == var1.serverPacket) { // L: 6747
					WorldMapLabelSize.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6748
					field874 = cycleCntr; // L: 6749
					var1.serverPacket = null; // L: 6750
					return true; // L: 6751
				}

				if (ServerPacket.field2198 == var1.serverPacket) { // L: 6753
					for (var16 = 0; var16 < players.length; ++var16) { // L: 6754
						if (players[var16] != null) { // L: 6755
							players[var16].sequence = -1;
						}
					}

					for (var16 = 0; var16 < npcs.length; ++var16) { // L: 6757
						if (npcs[var16] != null) { // L: 6758
							npcs[var16].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6760
					return true; // L: 6761
				}

				if (ServerPacket.field2187 == var1.serverPacket) { // L: 6763
					var16 = var3.readUnsignedByte(); // L: 6764
					WorldMapArea.forceDisconnect(var16); // L: 6765
					var1.serverPacket = null; // L: 6766
					return false; // L: 6767
				}

				if (ServerPacket.field2148 == var1.serverPacket) { // L: 6769
					WorldMapData_1.readReflectionCheck(var3, var1.serverPacketLength); // L: 6770
					var1.serverPacket = null; // L: 6771
					return true; // L: 6772
				}

				if (ServerPacket.field2149 == var1.serverPacket) { // L: 6774
					WorldMapEvent.method865(class194.field2354); // L: 6775
					var1.serverPacket = null; // L: 6776
					return true; // L: 6777
				}

				if (ServerPacket.field2169 == var1.serverPacket) { // L: 6779
					MusicPatch.updateNpcs(false, var3); // L: 6780
					var1.serverPacket = null; // L: 6781
					return true; // L: 6782
				}

				if (ServerPacket.field2186 == var1.serverPacket) { // L: 6784
					destinationX = var3.readUnsignedByte(); // L: 6785
					if (destinationX == 255) { // L: 6786
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6787
					if (destinationY == 255) { // L: 6788
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6789
					return true; // L: 6790
				}

				if (ServerPacket.field2215 == var1.serverPacket) { // L: 6792
					var16 = var3.readUnsignedShort(); // L: 6793
					var5 = var3.readUnsignedByte(); // L: 6794
					var6 = var3.readUnsignedShort(); // L: 6795
					KitDefinition.queueSoundEffect(var16, var5, var6); // L: 6796
					var1.serverPacket = null; // L: 6797
					return true; // L: 6798
				}

				if (ServerPacket.field2226 == var1.serverPacket) { // L: 6800
					var16 = var3.method5675(); // L: 6801
					WorldMapData_1.method817(var16); // L: 6802
					changedItemContainers[++field941 - 1 & 31] = var16 & 32767; // L: 6803
					var1.serverPacket = null; // L: 6804
					return true; // L: 6805
				}

				if (ServerPacket.field2192 == var1.serverPacket) { // L: 6807
					var16 = var3.readUnsignedByte(); // L: 6808
					Decimator.method2668(var16); // L: 6809
					var1.serverPacket = null; // L: 6810
					return true; // L: 6811
				}

				if (ServerPacket.field2155 == var1.serverPacket) { // L: 6813
					GameShell.field466 = var3.method5650(); // L: 6814
					GrandExchangeEvents.field64 = var3.readUnsignedByte(); // L: 6815

					for (var16 = GameShell.field466; var16 < GameShell.field466 + 8; ++var16) { // L: 6816
						for (var5 = GrandExchangeEvents.field64; var5 < GrandExchangeEvents.field64 + 8; ++var5) { // L: 6817
							if (groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var16][var5] != null) { // L: 6818
								groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var16][var5] = null; // L: 6819
								class41.updateItemPile(var16, var5); // L: 6820
							}
						}
					}

					for (PendingSpawn var37 = (PendingSpawn)pendingSpawns.last(); var37 != null; var37 = (PendingSpawn)pendingSpawns.previous()) { // L: 6824 6825 6827
						if (var37.x >= GameShell.field466 && var37.x < GameShell.field466 + 8 && var37.y >= GrandExchangeEvents.field64 && var37.y < GrandExchangeEvents.field64 + 8 && var37.plane == GrandExchangeOfferUnitPriceComparator.Client_plane) { // L: 6826
							var37.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6829
					return true; // L: 6830
				}

				if (ServerPacket.field2146 == var1.serverPacket) { // L: 6832
					var16 = var3.readUnsignedShort(); // L: 6833
					var5 = var3.method5686(); // L: 6834
					var27 = UserComparator4.getWidget(var5); // L: 6835
					if (var27 != null && var27.type == 0) { // L: 6836
						if (var16 > var27.scrollHeight - var27.height) { // L: 6837
							var16 = var27.scrollHeight - var27.height;
						}

						if (var16 < 0) { // L: 6838
							var16 = 0;
						}

						if (var16 != var27.scrollY) { // L: 6839
							var27.scrollY = var16; // L: 6840
							GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27); // L: 6841
						}
					}

					var1.serverPacket = null; // L: 6844
					return true; // L: 6845
				}

				if (ServerPacket.field2147 == var1.serverPacket) { // L: 6847
					var16 = var3.readUnsignedShort(); // L: 6848
					var5 = var3.readInt(); // L: 6849
					var27 = UserComparator4.getWidget(var5); // L: 6850
					if (var27.modelType != 2 || var16 != var27.modelId) { // L: 6851
						var27.modelType = 2; // L: 6852
						var27.modelId = var16; // L: 6853
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var27); // L: 6854
					}

					var1.serverPacket = null; // L: 6856
					return true; // L: 6857
				}

				PacketWriter.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1044340673 * 1695854657 : -1) + "," + (var1.field1339 != null ? var1.field1339.id * 1044340673 * 1695854657 : -1) + "," + (var1.field1350 != null ? var1.field1350.id * 1044340673 * 1695854657 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 6859
				class89.logOut(); // L: 6860
			} catch (IOException var35) { // L: 6862
				FloorDecoration.method2986(); // L: 6863
			} catch (Exception var36) {
				var17 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1044340673 * 1695854657 : -1) + "," + (var1.field1339 != null ? var1.field1339.id * 1044340673 * 1695854657 : -1) + "," + (var1.field1350 != null ? var1.field1350.id * 1044340673 * 1695854657 : -1) + "," + var1.serverPacketLength + "," + (PlayerType.localPlayer.pathX[0] + FloorDecoration.baseX) + "," + (PlayerType.localPlayer.pathY[0] + WorldMapData_0.baseY) + ","; // L: 6866

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 6867
					var17 = var17 + var3.array[var6] + ",";
				}

				PacketWriter.RunException_sendStackTrace(var17, var36); // L: 6868
				class89.logOut(); // L: 6869
			}

			return true; // L: 6871
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1619365796"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 7744

		int var2;
		int var5;
		while (!var1) { // L: 7745
			var1 = true; // L: 7746

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 7747
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 7748
					String var15 = menuTargets[var2]; // L: 7749
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 7750
					menuTargets[var2 + 1] = var15; // L: 7751
					String var16 = menuActions[var2]; // L: 7752
					menuActions[var2] = menuActions[var2 + 1]; // L: 7753
					menuActions[var2 + 1] = var16; // L: 7754
					var5 = menuOpcodes[var2]; // L: 7755
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 7756
					menuOpcodes[var2 + 1] = var5; // L: 7757
					var5 = menuArguments1[var2]; // L: 7758
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 7759
					menuArguments1[var2 + 1] = var5; // L: 7760
					var5 = menuArguments2[var2]; // L: 7761
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 7762
					menuArguments2[var2 + 1] = var5; // L: 7763
					var5 = menuIdentifiers[var2]; // L: 7764
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 7765
					menuIdentifiers[var2 + 1] = var5; // L: 7766
					boolean var13 = menuShiftClick[var2]; // L: 7767
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 7768
					menuShiftClick[var2 + 1] = var13; // L: 7769
					var1 = false; // L: 7770
				}
			}
		}

		if (GameBuild.dragInventoryWidget == null) { // L: 7775
			if (clickedWidget == null) { // L: 7776
				int var4;
				int var10;
				int var19;
				label296: {
					int var17 = MouseHandler.MouseHandler_lastButton; // L: 7777
					int var3;
					int var8;
					if (isMenuOpen) { // L: 7778
						int var18;
						int var20;
						if (var17 != 1 && (MusicPatchNode.mouseCam || var17 != 4)) { // L: 7779
							var2 = MouseHandler.MouseHandler_x; // L: 7780
							var3 = MouseHandler.MouseHandler_y; // L: 7781
							if (var2 < Coord.menuX - 10 || var2 > KeyHandler.menuWidth + Coord.menuX + 10 || var3 < WorldMapArea.menuY - 10 || var3 > ServerPacket.menuHeight + WorldMapArea.menuY + 10) { // L: 7782
								isMenuOpen = false; // L: 7783
								var4 = Coord.menuX; // L: 7784
								var5 = WorldMapArea.menuY; // L: 7785
								var20 = KeyHandler.menuWidth; // L: 7786
								var18 = ServerPacket.menuHeight; // L: 7787

								for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 7789
									if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var20 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var18) { // L: 7790
										field834[var8] = true;
									}
								}
							}
						}

						if (var17 == 1 || !MusicPatchNode.mouseCam && var17 == 4) { // L: 7795
							var2 = Coord.menuX; // L: 7796
							var3 = WorldMapArea.menuY; // L: 7797
							var4 = KeyHandler.menuWidth; // L: 7798
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 7799
							var20 = MouseHandler.MouseHandler_lastPressedY; // L: 7800
							var18 = -1; // L: 7801

							for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 7802
								var19 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 7803
								if (var5 > var2 && var5 < var4 + var2 && var20 > var19 - 13 && var20 < var19 + 3) { // L: 7804
									var18 = var8;
								}
							}

							if (var18 != -1) { // L: 7806
								EnumDefinition.method4721(var18);
							}

							isMenuOpen = false; // L: 7807
							var8 = Coord.menuX; // L: 7808
							var19 = WorldMapArea.menuY; // L: 7809
							var10 = KeyHandler.menuWidth; // L: 7810
							int var14 = ServerPacket.menuHeight; // L: 7811

							for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 7813
								if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var19 && rootWidgetYs[var12] < var14 + var19) { // L: 7814
									field834[var12] = true;
								}
							}
						}
					} else {
						var2 = FileSystem.method3638(); // L: 7820
						if ((var17 == 1 || !MusicPatchNode.mouseCam && var17 == 4) && var2 >= 0) { // L: 7821
							var3 = menuOpcodes[var2]; // L: 7822
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 7823
								var4 = menuArguments1[var2]; // L: 7824
								var5 = menuArguments2[var2]; // L: 7825
								Widget var6 = UserComparator4.getWidget(var5); // L: 7826
								var8 = WorldMapData_0.getWidgetFlags(var6); // L: 7828
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 7830
								if (var7) { // L: 7833
									break label296;
								}

								var10 = WorldMapData_0.getWidgetFlags(var6); // L: 7835
								boolean var9 = (var10 >> 29 & 1) != 0; // L: 7837
								if (var9) { // L: 7839
									break label296;
								}
							}
						}

						if ((var17 == 1 || !MusicPatchNode.mouseCam && var17 == 4) && this.shouldLeftClickOpenMenu()) { // L: 7867 7868
							var17 = 2; // L: 7869
						}

						if ((var17 == 1 || !MusicPatchNode.mouseCam && var17 == 4) && menuOptionsCount > 0) { // L: 7872
							EnumDefinition.method4721(var2); // L: 7873
						}

						if (var17 == 2 && menuOptionsCount > 0) { // L: 7875
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 7877
				}

				if (GameBuild.dragInventoryWidget != null && !field830 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 7841 7842
					var19 = draggedWidgetX; // L: 7843
					var10 = draggedWidgetY; // L: 7844
					MenuAction var11 = GrandExchangeOffer.tempMenuAction; // L: 7846
					Calendar.menuAction(var11.param0, var11.param1, var11.opcode, var11.identifier, var11.action, var11.action, var19, var10); // L: 7848
					GrandExchangeOffer.tempMenuAction = null; // L: 7850
				}

				field830 = false; // L: 7854
				itemDragDuration = 0; // L: 7855
				if (GameBuild.dragInventoryWidget != null) { // L: 7856
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(GameBuild.dragInventoryWidget);
				}

				GameBuild.dragInventoryWidget = UserComparator4.getWidget(var5); // L: 7857
				dragItemSlotSource = var4; // L: 7858
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 7859
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 7860
				if (var2 >= 0) { // L: 7861
					AbstractByteArrayCopier.method4087(var2);
				}

				GrandExchangeOfferOwnWorldComparator.invalidateWidget(GameBuild.dragInventoryWidget); // L: 7862
			}
		}
	} // L: 7863

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "279427498"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = FileSystem.method3638(); // L: 7880
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || WorldMapSectionType.method336(var1)) && !menuShiftClick[var1]; // L: 7881
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-4"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		KitDefinition.method4634(var1, var2); // L: 7885
		ModeWhere.scene.menuOpen(GrandExchangeOfferUnitPriceComparator.Client_plane, var1, var2, false); // L: 7886
		isMenuOpen = true; // L: 7887
	} // L: 7888

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		Fonts.method5463(rootInterface, ItemContainer.canvasWidth, HealthBar.canvasHeight, var1); // L: 9855
	} // L: 9856

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)V",
		garbageValue = "121"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : UserComparator4.getWidget(var1.parentId); // L: 9859
		int var3;
		int var4;
		if (var2 == null) { // L: 9862
			var3 = ItemContainer.canvasWidth; // L: 9863
			var4 = HealthBar.canvasHeight; // L: 9864
		} else {
			var3 = var2.width; // L: 9867
			var4 = var2.height; // L: 9868
		}

		WorldMapIcon_0.alignWidgetSize(var1, var3, var4, false); // L: 9870
		FileSystem.alignWidgetPosition(var1, var3, var4); // L: 9871
	} // L: 9872

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1835347071"
	)
	final void method1405() {
		GrandExchangeOfferOwnWorldComparator.invalidateWidget(clickedWidget); // L: 10918
		++GrandExchangeEvent.widgetDragDuration; // L: 10919
		if (field705 && field859) { // L: 10920
			int var1 = MouseHandler.MouseHandler_x; // L: 10926
			int var2 = MouseHandler.MouseHandler_y; // L: 10927
			var1 -= widgetClickX; // L: 10928
			var2 -= widgetClickY; // L: 10929
			if (var1 < field860) { // L: 10930
				var1 = field860;
			}

			if (var1 + clickedWidget.width > field860 + clickedWidgetParent.width) { // L: 10931
				var1 = field860 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field861) { // L: 10932
				var2 = field861;
			}

			if (var2 + clickedWidget.height > field861 + clickedWidgetParent.height) { // L: 10933
				var2 = field861 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field931; // L: 10934
			int var4 = var2 - field701; // L: 10935
			int var5 = clickedWidget.dragZoneSize; // L: 10936
			if (GrandExchangeEvent.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 10937 10938
				isDraggingWidget = true; // L: 10939
			}

			int var6 = var1 - field860 + clickedWidgetParent.scrollX; // L: 10942
			int var7 = var2 - field861 + clickedWidgetParent.scrollY; // L: 10943
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 10944
				var8 = new ScriptEvent(); // L: 10945
				var8.widget = clickedWidget; // L: 10946
				var8.mouseX = var6; // L: 10947
				var8.mouseY = var7; // L: 10948
				var8.args = clickedWidget.onDrag; // L: 10949
				Entity.runScriptEvent(var8); // L: 10950
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 10952
				if (isDraggingWidget) { // L: 10953
					if (clickedWidget.onDragComplete != null) { // L: 10954
						var8 = new ScriptEvent(); // L: 10955
						var8.widget = clickedWidget; // L: 10956
						var8.mouseX = var6; // L: 10957
						var8.mouseY = var7; // L: 10958
						var8.dragTarget = draggedOnWidget; // L: 10959
						var8.args = clickedWidget.onDragComplete; // L: 10960
						Entity.runScriptEvent(var8); // L: 10961
					}

					if (draggedOnWidget != null) { // L: 10963
						Widget var15 = clickedWidget; // L: 10965
						int var11 = WorldMapData_0.getWidgetFlags(var15); // L: 10968
						int var16 = var11 >> 17 & 7; // L: 10970
						int var12 = var16; // L: 10972
						Widget var17;
						if (var16 == 0) { // L: 10973
							var17 = null; // L: 10974
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var17 = var15; // L: 10984
									break;
								}

								var15 = UserComparator4.getWidget(var15.parentId); // L: 10978
								if (var15 == null) { // L: 10979
									var17 = null; // L: 10980
									break; // L: 10981
								}

								++var13; // L: 10977
							}
						}

						if (var17 != null) { // L: 10986
							PacketBufferNode var18 = class4.getPacketBufferNode(ClientPacket.field2315, packetWriter.isaacCipher); // L: 10988
							var18.packetBuffer.method5682(draggedOnWidget.id); // L: 10989
							var18.packetBuffer.writeShort(draggedOnWidget.itemId); // L: 10990
							var18.packetBuffer.method5673(clickedWidget.itemId); // L: 10991
							var18.packetBuffer.method5673(clickedWidget.childIndex); // L: 10992
							var18.packetBuffer.method5674(draggedOnWidget.childIndex); // L: 10993
							var18.packetBuffer.method5684(clickedWidget.id); // L: 10994
							packetWriter.addNode(var18); // L: 10995
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11000
					this.openMenu(widgetClickX + field931, field701 + widgetClickY); // L: 11001
				} else if (menuOptionsCount > 0) { // L: 11003
					int var14 = widgetClickX + field931; // L: 11004
					int var9 = widgetClickY + field701; // L: 11005
					MenuAction var10 = GrandExchangeOffer.tempMenuAction; // L: 11007
					Calendar.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var14, var9); // L: 11009
					GrandExchangeOffer.tempMenuAction = null; // L: 11011
				}

				clickedWidget = null; // L: 11015
			}

		} else {
			if (GrandExchangeEvent.widgetDragDuration > 1) { // L: 10921
				clickedWidget = null; // L: 10922
			}

		}
	} // L: 10924 11017

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(B)Lkm;",
		garbageValue = "104"
	)
	@Export("username")
	public Username username() {
		return PlayerType.localPlayer != null ? PlayerType.localPlayer.username : null; // L: 11642
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "89"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "3"
	)
	static final void method1838(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 64
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 65
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 66
					class299.field3679[0][var5][var4] = 127; // L: 67
					if (var0 == var5 && var5 > 0) { // L: 68
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 69
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 70
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 71
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 75

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "964773449"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 259
		if (var0.sound != null) { // L: 260
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 261
		}

	} // L: 262
}
