import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
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
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "[Lb;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 660476359
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 360388647
	)
	static int field830;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		longValue = -4989319872898383139L
	)
	static long field839;
	@ObfuscatedName("ov")
	static boolean[] field831;
	@ObfuscatedName("px")
	static boolean[] field833;
	@ObfuscatedName("oe")
	static boolean[] field712;
	@ObfuscatedName("pa")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1878723319
	)
	public static int field798;
	@ObfuscatedName("qd")
	static boolean field862;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pr")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pj")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1136245775
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("pf")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	static final ApproximateRouteStrategy field733;
	@ObfuscatedName("po")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1081070029
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 605086857
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tk")
	static int[] field739;
	@ObfuscatedName("ta")
	static int[] field631;
	@ObfuscatedName("rg")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("rx")
	static boolean[] field871;
	@ObfuscatedName("ry")
	static int[] field872;
	@ObfuscatedName("rc")
	static int[] field873;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 1152521
	)
	static int field890;
	@ObfuscatedName("rt")
	static int[] field867;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sa")
	static int[] field875;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "[Lju;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 1731824615
	)
	static int field902;
	@ObfuscatedName("pn")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 1839633675
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = -1711547959
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("rd")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tv")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1256134345
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 375081575
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("rs")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rk")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -85390661
	)
	static int field659;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "[Lax;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("rr")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		longValue = -3503174245678770383L
	)
	static long field850;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("sy")
	static short field876;
	@ObfuscatedName("sv")
	static short field877;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -1807179709
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("so")
	static short field881;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 1305420667
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("qs")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sn")
	static short field690;
	@ObfuscatedName("si")
	static short field864;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = 1279050647
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("sm")
	static short field880;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -1918427539
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("qc")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 743767761
	)
	static int field853;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1112444085
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -853632551
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -1851870409
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "[Ly;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sc")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("sl")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 392522533
	)
	static int field898;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -426545695
	)
	static int field847;
	@ObfuscatedName("ph")
	static int[] field786;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static NodeDeque field812;
	@ObfuscatedName("pb")
	static int[] field848;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static NodeDeque field860;
	@ObfuscatedName("pv")
	static int[] field725;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -2084785053
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1755958915
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("pq")
	static String field642;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfl;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static Bounds field903;
	@ObfuscatedName("af")
	static boolean field730;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -479860063
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1336794433
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1086569323
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bc")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("be")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1302427087
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1019445121
	)
	static int field625;
	@ObfuscatedName("bg")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -2033553753
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cg")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1506924847
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		longValue = -3330415476350692251L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 2057081131
	)
	static int field843;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1549041823
	)
	static int field633;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		longValue = -7081451214242002295L
	)
	static long field760;
	@ObfuscatedName("cs")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("co")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1450898569
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -884240111
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1021178359
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1821645449
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 986591039
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 359883245
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1742642487
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1066725013
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -939266577
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 645722257
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1743859217
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1425708355
	)
	static int field800;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1445831209
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1594897445
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -86832127
	)
	static int field811;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -775816439
	)
	static int field654;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1385967613
	)
	static int field655;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static class126 field656;
	@ObfuscatedName("eg")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ed")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fm")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "[Ldu;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -2000479971
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fg")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -22894005
	)
	static int field636;
	@ObfuscatedName("fs")
	static int[] field763;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 796481149
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fp")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("fi")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fd")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 1919520289
	)
	static int field618;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -1712660563
	)
	static int field789;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 852398613
	)
	static int field742;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = -1878164651
	)
	static int field677;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 143152059
	)
	static int field678;
	@ObfuscatedName("gp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gr")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gy")
	static final int[] field682;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -270595563
	)
	static int field683;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 173125819
	)
	static int field685;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 527282429
	)
	static int field686;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 713325161
	)
	static int field818;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -742100795
	)
	static int field688;
	@ObfuscatedName("hh")
	static boolean field689;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -126848597
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = 625342135
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 1330409253
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1581889061
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = 182124091
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -474499607
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -1521559245
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 399806555
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -210927579
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = 44183997
	)
	static int field699;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 1634750831
	)
	static int field676;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -2080387383
	)
	static int field857;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1614384069
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 930603185
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1986123723
	)
	public static int field704;
	@ObfuscatedName("iv")
	static boolean field705;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -572863563
	)
	static int field706;
	@ObfuscatedName("ii")
	static boolean field707;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 482365293
	)
	static int field708;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -1595418399
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -2069034471
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ik")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("is")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ij")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ig")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("im")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jc")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ji")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("js")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1472746363
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 646714111
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1866904061
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -1814244043
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1740953143
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -161820321
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1567280515
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jw")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -756322907
	)
	static int field869;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 198485255
	)
	static int field729;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1180846677
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 2098466217
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1854794411
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 1229722503
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jv")
	static boolean field734;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 433289591
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1284891995
	)
	static int field629;
	@ObfuscatedName("jx")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "[Lcj;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -990316241
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1153104715
	)
	static int field740;
	@ObfuscatedName("ka")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1689088739
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 506159691
	)
	static int field783;
	@ObfuscatedName("ks")
	static int[] field859;
	@ObfuscatedName("kr")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ko")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kw")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kt")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -263949421
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[[[Lkq;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("ki")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kv")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lg")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -1921591875
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("le")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 125901859
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lt")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lf")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lr")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ld")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lq")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ly")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("lu")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lc")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ll")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lx")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lv")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 1932466889
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -936888801
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -2134544589
	)
	static int field773;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 1407129087
	)
	static int field693;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -56477685
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ma")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -1880896879
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 239487695
	)
	static int field634;
	@ObfuscatedName("mm")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mh")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -65357441
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -397561133
	)
	static int field784;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -1298961303
	)
	static int field694;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1894201327
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 1703378305
	)
	static int field891;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -932901887
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 2078766509
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -91677995
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 1939957429
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("nv")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 123822307
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -1215830949
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("nq")
	static boolean field821;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 392956681
	)
	static int field801;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -207848961
	)
	static int field802;
	@ObfuscatedName("nk")
	static boolean field731;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -1026128313
	)
	static int field804;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 1520709181
	)
	static int field805;
	@ObfuscatedName("nl")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -627437657
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("no")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 1626383345
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("nr")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 942162965
	)
	static int field711;
	@ObfuscatedName("nd")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -887652095
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oo")
	static int[] field814;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -1384400453
	)
	static int field759;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 811091313
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -892031395
	)
	static int field817;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -2026013483
	)
	static int field882;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 976614793
	)
	static int field819;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 1591480271
	)
	static int field820;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1602383115
	)
	static int field827;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 1877231855
	)
	static int field822;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -451521007
	)
	static int field823;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 807145243
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	Buffer field660;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	class35 field661;

	static {
		field730 = true; // L: 194
		worldId = 1; // L: 195
		worldProperties = 0; // L: 196
		gameBuild = 0; // L: 198
		isMembersWorld = false; // L: 201
		isLowDetail = false; // L: 202
		clientType = -1; // L: 207
		field625 = -1; // L: 208
		onMobile = false; // L: 209
		gameState = 0; // L: 210
		isLoading = true; // L: 231
		cycle = 0; // L: 232
		mouseLastLastPressedTimeMillis = -1L; // L: 233
		field843 = -1; // L: 235
		field633 = -1; // L: 236
		field760 = -1L; // L: 237
		hadFocus = true; // L: 238
		displayFps = false; // L: 239
		rebootTimer = 0; // L: 240
		hintArrowType = 0; // L: 241
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0; // L: 244
		hintArrowY = 0; // L: 245
		hintArrowHeight = 0; // L: 246
		hintArrowSubX = 0; // L: 247
		hintArrowSubY = 0; // L: 248
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 250
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 251
		titleLoadingStage = 0; // L: 253
		js5ConnectState = 0; // L: 256
		field800 = 0; // L: 257
		js5Errors = 0; // L: 279
		loginState = 0; // L: 281
		field811 = 0; // L: 282
		field654 = 0; // L: 283
		field655 = 0; // L: 284
		field656 = class126.field1475; // L: 285
		Login_isUsernameRemembered = false; // L: 294
		secureRandomFuture = new SecureRandomFuture(); // L: 295
		randomDatData = null; // L: 300
		npcs = new NPC[32768]; // L: 304
		npcCount = 0; // L: 305
		npcIndices = new int[32768]; // L: 306
		field636 = 0; // L: 307
		field763 = new int[250]; // L: 308
		packetWriter = new PacketWriter(); // L: 311
		logoutTimer = 0; // L: 313
		hadNetworkError = false; // L: 314
		useBufferedSocket = true; // L: 315
		timer = new Timer(); // L: 316
		fontsMap = new HashMap(); // L: 322
		field618 = 0; // L: 329
		field789 = 1; // L: 330
		field742 = 0; // L: 331
		field677 = 1; // L: 332
		field678 = 0; // L: 333
		collisionMaps = new CollisionMap[4]; // L: 341
		isInInstance = false; // L: 342
		instanceChunkTemplates = new int[4][13][13]; // L: 343
		field682 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 344
		field683 = 0; // L: 347
		field685 = 2301979; // L: 359
		field686 = 5063219; // L: 360
		field818 = 3353893; // L: 361
		field688 = 7759444; // L: 362
		field689 = false; // L: 363
		alternativeScrollbarWidth = 0; // L: 364
		camAngleX = 128; // L: 372
		camAngleY = 0; // L: 373
		camAngleDY = 0; // L: 374
		camAngleDX = 0; // L: 375
		mouseCamClickedX = 0; // L: 376
		mouseCamClickedY = 0; // L: 377
		oculusOrbState = 0; // L: 378
		camFollowHeight = 50; // L: 379
		field699 = 0; // L: 383
		field676 = 0; // L: 384
		field857 = 0; // L: 385
		oculusOrbNormalSpeed = 12; // L: 387
		oculusOrbSlowedSpeed = 6; // L: 388
		field704 = 0; // L: 389
		field705 = false; // L: 390
		field706 = 0; // L: 391
		field707 = false; // L: 392
		field708 = 0; // L: 393
		overheadTextCount = 0; // L: 394
		overheadTextLimit = 50; // L: 395
		overheadTextXs = new int[overheadTextLimit]; // L: 396
		overheadTextYs = new int[overheadTextLimit]; // L: 397
		overheadTextAscents = new int[overheadTextLimit]; // L: 398
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 399
		overheadTextColors = new int[overheadTextLimit]; // L: 400
		overheadTextEffects = new int[overheadTextLimit]; // L: 401
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 402
		overheadText = new String[overheadTextLimit]; // L: 403
		tileLastDrawnActor = new int[104][104]; // L: 404
		viewportDrawCount = 0; // L: 405
		viewportTempX = -1; // L: 406
		viewportTempY = -1; // L: 407
		mouseCrossX = 0; // L: 408
		mouseCrossY = 0; // L: 409
		mouseCrossState = 0; // L: 410
		mouseCrossColor = 0; // L: 411
		showMouseCross = true; // L: 412
		field869 = 0; // L: 414
		field729 = 0; // L: 415
		dragItemSlotSource = 0; // L: 418
		draggedWidgetX = 0; // L: 419
		draggedWidgetY = 0; // L: 420
		dragItemSlotDestination = 0; // L: 421
		field734 = false; // L: 422
		itemDragDuration = 0; // L: 423
		field629 = 0; // L: 424
		showLoadingMessages = true; // L: 426
		players = new Player[2048]; // L: 428
		localPlayerIndex = -1; // L: 430
		field740 = 0; // L: 431
		renderSelf = true; // L: 433
		drawPlayerNames = 0; // L: 438
		field783 = 0; // L: 439
		field859 = new int[1000]; // L: 440
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 442
		playerMenuActions = new String[8]; // L: 443
		playerOptionsPriorities = new boolean[8]; // L: 444
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 445
		combatTargetPlayerIndex = -1; // L: 446
		groundItems = new NodeDeque[4][104][104]; // L: 447
		pendingSpawns = new NodeDeque(); // L: 448
		projectiles = new NodeDeque(); // L: 449
		graphicsObjects = new NodeDeque(); // L: 450
		currentLevels = new int[25]; // L: 451
		levels = new int[25]; // L: 452
		experience = new int[25]; // L: 453
		leftClickOpensMenu = 0; // L: 454
		isMenuOpen = false; // L: 455
		menuOptionsCount = 0; // L: 461
		menuArguments1 = new int[500]; // L: 462
		menuArguments2 = new int[500]; // L: 463
		menuOpcodes = new int[500]; // L: 464
		menuIdentifiers = new int[500]; // L: 465
		menuActions = new String[500]; // L: 466
		menuTargets = new String[500]; // L: 467
		menuShiftClick = new boolean[500]; // L: 468
		followerOpsLowPriority = false; // L: 469
		shiftClickDrop = false; // L: 471
		tapToDrop = false; // L: 472
		showMouseOverText = true; // L: 473
		viewportX = -1; // L: 474
		viewportY = -1; // L: 475
		field773 = 0; // L: 479
		field693 = 50; // L: 480
		isItemSelected = 0; // L: 481
		selectedItemName = null; // L: 485
		isSpellSelected = false; // L: 486
		selectedSpellChildIndex = -1; // L: 488
		field634 = -1; // L: 489
		selectedSpellActionName = null; // L: 491
		selectedSpellName = null; // L: 492
		rootInterface = -1; // L: 493
		interfaceParents = new NodeHashTable(8); // L: 494
		field784 = 0; // L: 499
		field694 = -1; // L: 500
		chatEffects = 0; // L: 501
		field891 = 0; // L: 502
		meslayerContinueWidget = null; // L: 503
		runEnergy = 0; // L: 504
		weight = 0; // L: 505
		staffModLevel = 0; // L: 506
		followerIndex = -1; // L: 507
		playerMod = false; // L: 508
		viewportWidget = null; // L: 509
		clickedWidget = null; // L: 510
		clickedWidgetParent = null; // L: 511
		widgetClickX = 0; // L: 512
		widgetClickY = 0; // L: 513
		draggedOnWidget = null; // L: 514
		field821 = false; // L: 515
		field801 = -1; // L: 516
		field802 = -1; // L: 517
		field731 = false; // L: 518
		field804 = -1; // L: 519
		field805 = -1; // L: 520
		isDraggingWidget = false; // L: 521
		cycleCntr = 1; // L: 526
		changedVarps = new int[32]; // L: 529
		changedVarpCount = 0; // L: 530
		changedItemContainers = new int[32]; // L: 531
		field711 = 0; // L: 532
		changedSkills = new int[32]; // L: 533
		changedSkillsCount = 0; // L: 534
		field814 = new int[32]; // L: 535
		field759 = 0; // L: 536
		chatCycle = 0; // L: 537
		field817 = 0; // L: 538
		field882 = 0; // L: 539
		field819 = 0; // L: 540
		field820 = 0; // L: 541
		field827 = 0; // L: 542
		field822 = 0; // L: 543
		field823 = 0; // L: 544
		mouseWheelRotation = 0; // L: 550
		scriptEvents = new NodeDeque(); // L: 551
		field812 = new NodeDeque(); // L: 552
		field860 = new NodeDeque(); // L: 553
		widgetFlags = new NodeHashTable(512); // L: 554
		rootWidgetCount = 0; // L: 556
		field830 = -2; // L: 557
		field831 = new boolean[100]; // L: 558
		field712 = new boolean[100]; // L: 559
		field833 = new boolean[100]; // L: 560
		rootWidgetXs = new int[100]; // L: 561
		rootWidgetYs = new int[100]; // L: 562
		rootWidgetWidths = new int[100]; // L: 563
		rootWidgetHeights = new int[100]; // L: 564
		gameDrawingMode = 0;
		field839 = 0L; // L: 566
		isResizable = true;
		field725 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field642 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field847 = 0; // L: 583
		field848 = new int[128];
		field786 = new int[128];
		field850 = -1L;
		currentClanSettings = new ClanSettings[1];
		currentClanChannels = new ClanChannel[1];
		field853 = -1; // L: 594
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0; // L: 600
		minimapState = 0;
		currentTrackGroupId = -1;
		field862 = false;
		soundEffectCount = 0; // L: 615
		soundEffectIds = new int[50]; // L: 616
		queuedSoundEffectLoops = new int[50]; // L: 617
		queuedSoundEffectDelays = new int[50]; // L: 618
		soundLocations = new int[50]; // L: 619
		soundEffects = new SoundEffect[50]; // L: 620
		isCameraLocked = false; // L: 622
		field871 = new boolean[5]; // L: 634
		field872 = new int[5]; // L: 635
		field873 = new int[5]; // L: 636
		field867 = new int[5]; // L: 637
		field875 = new int[5]; // L: 638
		field876 = 256; // L: 639
		field877 = 205; // L: 640
		zoomHeight = 256; // L: 641
		zoomWidth = 320; // L: 642
		field880 = 1; // L: 643
		field864 = 32767; // L: 644
		field881 = 1; // L: 645
		field690 = 32767; // L: 646
		viewportOffsetX = 0; // L: 647
		viewportOffsetY = 0; // L: 648
		viewportWidth = 0; // L: 649
		viewportHeight = 0; // L: 650
		viewportZoom = 0; // L: 651
		playerAppearance = new PlayerComposition(); // L: 653
		field890 = -1; // L: 654
		field902 = -1; // L: 655
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 657
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 659
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 662
		field798 = -1; // L: 669
		archiveLoaders = new ArrayList(10); // L: 670
		archiveLoadersDone = 0; // L: 671
		field898 = 0; // L: 672
		field733 = new ApproximateRouteStrategy(); // L: 681
		field739 = new int[50]; // L: 682
		field631 = new int[50]; // L: 683
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field839 = ClientPacket.currentTimeMillis() + 500L; // L: 4420
		this.resizeJS(); // L: 4421
		if (rootInterface != -1) { // L: 4422
			this.resizeRoot(true);
		}

	} // L: 4423

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1587549695"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 898
		int[] var2 = new int[]{1000, 100, 500}; // L: 899
		if (var1 != null && var2 != null) { // L: 901
			class372.ByteArrayPool_alternativeSizes = var1; // L: 907
			WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 908
			Tiles.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 909

			for (int var3 = 0; var3 < class372.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 910
				Tiles.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 911
			}
		} else {
			class372.ByteArrayPool_alternativeSizes = null; // L: 902
			WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts = null; // L: 903
			Tiles.ByteArrayPool_arrays = null; // L: 904
		}

		UserComparator7.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 914
		MouseRecorder.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 915
		UserComparator2.currentPort = UserComparator7.worldPort; // L: 916
		VarcInt.field1581 = class246.field2945; // L: 917
		class69.field568 = class246.field2944; // L: 918
		ModelData0.field2517 = class246.field2943; // L: 919
		Skills.field3175 = class246.field2946; // L: 920
		ArchiveDiskActionHandler.urlRequester = new UrlRequester(); // L: 921
		this.setUpKeyboard(); // L: 922
		this.setUpMouse(); // L: 923
		Projectile.mouseWheel = this.mouseWheel(); // L: 924
		WorldMapID.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 925
		class4.clientPreferences = VarpDefinition.method2715(); // L: 926
		this.setUpClipboard(); // L: 927
		UserComparator5.method2543(this, InvDefinition.null_string); // L: 928
		if (gameBuild != 0) { // L: 929
			displayFps = true;
		}

		WorldMapDecorationType.setWindowedMode(class4.clientPreferences.windowMode); // L: 930
		DevicePcmPlayerProvider.friendSystem = new FriendSystem(LoginScreenAnimation.loginType); // L: 931
	} // L: 932

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087654500"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 935
		this.doCycleJs5(); // L: 936
		class35.method422(); // L: 937
		Frames.method4257(); // L: 938
		class233.playPcmPlayers(); // L: 939
		int var2;
		synchronized(KeyHandler.KeyHandler_instance) { // L: 941
			++KeyHandler.KeyHandler_idleCycles; // L: 942
			KeyHandler.field276 = KeyHandler.field277; // L: 943
			KeyHandler.field271 = 0; // L: 944
			KeyHandler.field274 = 0; // L: 945
			Arrays.fill(KeyHandler.field264, false); // L: 946
			Arrays.fill(KeyHandler.field265, false); // L: 947
			if (KeyHandler.field268 < 0) { // L: 948
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 949
				KeyHandler.field268 = KeyHandler.field267; // L: 950
			} else {
				while (KeyHandler.field267 != KeyHandler.field268) { // L: 953
					var2 = KeyHandler.field283[KeyHandler.field267]; // L: 954
					KeyHandler.field267 = KeyHandler.field267 + 1 & 127; // L: 955
					if (var2 < 0) { // L: 956
						var2 = ~var2; // L: 957
						if (KeyHandler.KeyHandler_pressedKeys[var2]) { // L: 958
							KeyHandler.KeyHandler_pressedKeys[var2] = false; // L: 959
							KeyHandler.field265[var2] = true; // L: 960
							KeyHandler.field273[KeyHandler.field274] = var2; // L: 961
							++KeyHandler.field274; // L: 962
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field271 < KeyHandler.field257.length - 1) { // L: 966
							KeyHandler.field264[var2] = true; // L: 967
							KeyHandler.field257[++KeyHandler.field271 - 1] = var2; // L: 968
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true; // L: 970
					}
				}
			}

			if (KeyHandler.field271 > 0) { // L: 974
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field277 = KeyHandler.field255; // L: 975
		}

		class34.method406(); // L: 978
		if (Projectile.mouseWheel != null) { // L: 979
			int var24 = Projectile.mouseWheel.useRotation(); // L: 980
			mouseWheelRotation = var24; // L: 981
		}

		if (gameState == 0) { // L: 983
			class34.load(); // L: 984
			class26.method350(); // L: 985
		} else if (gameState == 5) { // L: 987
			class21.doCycleTitle(this); // L: 988
			class34.load(); // L: 989
			class26.method350(); // L: 990
		} else if (gameState != 10 && gameState != 11) { // L: 992
			if (gameState == 20) { // L: 993
				class21.doCycleTitle(this); // L: 994
				this.doCycleLoggedOut(); // L: 995
			} else if (gameState == 25) { // L: 997
				DynamicObject.method2099(false); // L: 998
				field618 = 0; // L: 999
				boolean var35 = true; // L: 1000

				for (var2 = 0; var2 < UrlRequest.regionLandArchives.length; ++var2) { // L: 1001
					if (UrlRequester.regionMapArchiveIds[var2] != -1 && UrlRequest.regionLandArchives[var2] == null) { // L: 1002 1003
						UrlRequest.regionLandArchives[var2] = class4.archive5.takeFile(UrlRequester.regionMapArchiveIds[var2], 0); // L: 1004
						if (UrlRequest.regionLandArchives[var2] == null) { // L: 1005
							var35 = false; // L: 1006
							++field618; // L: 1007
						}
					}

					if (class286.regionLandArchiveIds[var2] != -1 && WorldMapDecorationType.regionMapArchives[var2] == null) { // L: 1011 1012
						WorldMapDecorationType.regionMapArchives[var2] = class4.archive5.takeFileEncrypted(class286.regionLandArchiveIds[var2], 0, class7.xteaKeys[var2]); // L: 1013
						if (WorldMapDecorationType.regionMapArchives[var2] == null) { // L: 1014
							var35 = false; // L: 1015
							++field618; // L: 1016
						}
					}
				}

				if (!var35) { // L: 1021
					field678 = 1; // L: 1022
				} else {
					field742 = 0; // L: 1025
					var35 = true; // L: 1026

					int var4;
					int var5;
					for (var2 = 0; var2 < UrlRequest.regionLandArchives.length; ++var2) { // L: 1027
						byte[] var3 = WorldMapDecorationType.regionMapArchives[var2]; // L: 1028
						if (var3 != null) { // L: 1029
							var4 = (UserComparator4.regions[var2] >> 8) * 64 - class15.baseX; // L: 1030
							var5 = (UserComparator4.regions[var2] & 255) * 64 - WorldMapSprite.baseY; // L: 1031
							if (isInInstance) { // L: 1032
								var4 = 10; // L: 1033
								var5 = 10; // L: 1034
							}

							var35 &= class69.method1222(var3, var4, var5); // L: 1036
						}
					}

					if (!var35) { // L: 1039
						field678 = 2; // L: 1040
					} else {
						if (field678 != 0) { // L: 1043
							class143.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						class233.playPcmPlayers(); // L: 1044
						DevicePcmPlayerProvider.scene.clear(); // L: 1045

						for (var2 = 0; var2 < 4; ++var2) { // L: 1046
							collisionMaps[var2].clear();
						}

						int var25;
						for (var2 = 0; var2 < 4; ++var2) { // L: 1047
							for (var25 = 0; var25 < 104; ++var25) { // L: 1048
								for (var4 = 0; var4 < 104; ++var4) { // L: 1049
									Tiles.Tiles_renderFlags[var2][var25][var4] = 0; // L: 1050
								}
							}
						}

						class233.playPcmPlayers(); // L: 1054
						Tiles.Tiles_minPlane = 99; // L: 1056
						AccessFile.field4098 = new byte[4][104][104]; // L: 1057
						Tiles.field1111 = new byte[4][104][104]; // L: 1058
						class22.field186 = new byte[4][104][104]; // L: 1059
						class16.field132 = new byte[4][104][104]; // L: 1060
						Tiles.field1101 = new int[4][105][105]; // L: 1061
						class43.field307 = new byte[4][105][105]; // L: 1062
						NPC.field1328 = new int[105][105]; // L: 1063
						class230.Tiles_hue = new int[104]; // L: 1064
						Tiles.Tiles_saturation = new int[104]; // L: 1065
						AbstractByteArrayCopier.Tiles_lightness = new int[104]; // L: 1066
						WorldMapSectionType.Tiles_hueMultiplier = new int[104]; // L: 1067
						Tiles.field1095 = new int[104]; // L: 1068
						var2 = UrlRequest.regionLandArchives.length; // L: 1070

						for (ObjectSound var33 = (ObjectSound)ObjectSound.objectSounds.last(); var33 != null; var33 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 1072
							if (var33.stream1 != null) { // L: 1073
								UserComparator7.pcmStreamMixer.removeSubStream(var33.stream1); // L: 1074
								var33.stream1 = null; // L: 1075
							}

							if (var33.stream2 != null) { // L: 1077
								UserComparator7.pcmStreamMixer.removeSubStream(var33.stream2); // L: 1078
								var33.stream2 = null; // L: 1079
							}
						}

						ObjectSound.objectSounds.clear(); // L: 1082
						DynamicObject.method2099(true); // L: 1084
						int var7;
						int var8;
						int var10;
						int var11;
						int var12;
						int var13;
						int var28;
						if (!isInInstance) { // L: 1085
							var25 = 0;

							label579:
							while (true) {
								byte[] var6;
								if (var25 >= var2) {
									for (var25 = 0; var25 < var2; ++var25) { // L: 1114
										var4 = (UserComparator4.regions[var25] >> 8) * 64 - class15.baseX; // L: 1115
										var5 = (UserComparator4.regions[var25] & 255) * 64 - WorldMapSprite.baseY; // L: 1116
										var6 = UrlRequest.regionLandArchives[var25]; // L: 1117
										if (var6 == null && RouteStrategy.field1919 < 800) { // L: 1118
											class233.playPcmPlayers(); // L: 1119
											UrlRequest.method2520(var4, var5, 64, 64); // L: 1120
										}
									}

									DynamicObject.method2099(true); // L: 1123
									var25 = 0;

									while (true) {
										if (var25 >= var2) {
											break label579;
										}

										byte[] var27 = WorldMapDecorationType.regionMapArchives[var25]; // L: 1125
										if (var27 != null) { // L: 1126
											var5 = (UserComparator4.regions[var25] >> 8) * 64 - class15.baseX; // L: 1127
											var28 = (UserComparator4.regions[var25] & 255) * 64 - WorldMapSprite.baseY; // L: 1128
											class233.playPcmPlayers(); // L: 1129
											Scene var29 = DevicePcmPlayerProvider.scene; // L: 1130
											CollisionMap[] var30 = collisionMaps; // L: 1131
											Buffer var34 = new Buffer(var27); // L: 1133
											var10 = -1; // L: 1134

											while (true) {
												var11 = var34.method6628(); // L: 1136
												if (var11 == 0) { // L: 1137
													break;
												}

												var10 += var11; // L: 1138
												var12 = 0; // L: 1139

												while (true) {
													var13 = var34.readUShortSmart(); // L: 1141
													if (var13 == 0) { // L: 1142
														break;
													}

													var12 += var13 - 1; // L: 1143
													int var14 = var12 & 63; // L: 1144
													int var15 = var12 >> 6 & 63; // L: 1145
													int var16 = var12 >> 12; // L: 1146
													int var17 = var34.readUnsignedByte(); // L: 1147
													int var18 = var17 >> 2; // L: 1148
													int var19 = var17 & 3; // L: 1149
													int var20 = var5 + var15; // L: 1150
													int var21 = var14 + var28; // L: 1151
													if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) { // L: 1152
														int var22 = var16; // L: 1153
														if ((Tiles.Tiles_renderFlags[1][var20][var21] & 2) == 2) { // L: 1154
															var22 = var16 - 1;
														}

														CollisionMap var23 = null; // L: 1155
														if (var22 >= 0) { // L: 1156
															var23 = var30[var22];
														}

														Player.method2258(var16, var20, var21, var10, var19, var18, var29, var23); // L: 1157
													}
												}
											}
										}

										++var25; // L: 1124
									}
								}

								var4 = (UserComparator4.regions[var25] >> 8) * 64 - class15.baseX; // L: 1087
								var5 = (UserComparator4.regions[var25] & 255) * 64 - WorldMapSprite.baseY; // L: 1088
								var6 = UrlRequest.regionLandArchives[var25]; // L: 1089
								if (var6 != null) { // L: 1090
									class233.playPcmPlayers(); // L: 1091
									var7 = class12.field111 * 8 - 48; // L: 1092
									var8 = RouteStrategy.field1919 * 8 - 48; // L: 1093
									CollisionMap[] var9 = collisionMaps; // L: 1094
									var10 = 0;

									label576:
									while (true) {
										if (var10 >= 4) {
											Buffer var26 = new Buffer(var6); // L: 1103
											var11 = 0;

											while (true) {
												if (var11 >= 4) {
													break label576;
												}

												for (var12 = 0; var12 < 64; ++var12) { // L: 1105
													for (var13 = 0; var13 < 64; ++var13) { // L: 1106
														Huffman.loadTerrain(var26, var11, var4 + var12, var13 + var5, var7, var8, 0); // L: 1107
													}
												}

												++var11; // L: 1104
											}
										}

										for (var11 = 0; var11 < 64; ++var11) { // L: 1097
											for (var12 = 0; var12 < 64; ++var12) { // L: 1098
												if (var4 + var11 > 0 && var11 + var4 < 103 && var5 + var12 > 0 && var5 + var12 < 103) { // L: 1099
													int[] var10000 = var9[var10].flags[var4 + var11];
													var10000[var5 + var12] &= -16777217;
												}
											}
										}

										++var10; // L: 1096
									}
								}

								++var25; // L: 1086
							}
						}

						int var31;
						if (isInInstance) { // L: 1165
							var25 = 0;

							label512:
							while (true) {
								if (var25 >= 4) {
									for (var25 = 0; var25 < 13; ++var25) { // L: 1208
										for (var4 = 0; var4 < 13; ++var4) { // L: 1209
											var5 = instanceChunkTemplates[0][var25][var4]; // L: 1210
											if (var5 == -1) { // L: 1211
												UrlRequest.method2520(var25 * 8, var4 * 8, 8, 8); // L: 1212
											}
										}
									}

									DynamicObject.method2099(true); // L: 1216
									var25 = 0;

									while (true) {
										if (var25 >= 4) {
											break label512;
										}

										class233.playPcmPlayers(); // L: 1218

										for (var4 = 0; var4 < 13; ++var4) { // L: 1219
											for (var5 = 0; var5 < 13; ++var5) { // L: 1220
												var28 = instanceChunkTemplates[var25][var4][var5]; // L: 1221
												if (var28 != -1) { // L: 1222
													var7 = var28 >> 24 & 3; // L: 1223
													var8 = var28 >> 1 & 3; // L: 1224
													var31 = var28 >> 14 & 1023; // L: 1225
													var10 = var28 >> 3 & 2047; // L: 1226
													var11 = (var31 / 8 << 8) + var10 / 8; // L: 1227

													for (var12 = 0; var12 < UserComparator4.regions.length; ++var12) { // L: 1228
														if (UserComparator4.regions[var12] == var11 && WorldMapDecorationType.regionMapArchives[var12] != null) { // L: 1229
															class25.method337(WorldMapDecorationType.regionMapArchives[var12], var25, var4 * 8, var5 * 8, var7, (var31 & 7) * 8, (var10 & 7) * 8, var8, DevicePcmPlayerProvider.scene, collisionMaps); // L: 1230
															break; // L: 1231
														}
													}
												}
											}
										}

										++var25; // L: 1217
									}
								}

								class233.playPcmPlayers(); // L: 1167

								for (var4 = 0; var4 < 13; ++var4) { // L: 1168
									for (var5 = 0; var5 < 13; ++var5) { // L: 1169
										boolean var37 = false; // L: 1170
										var7 = instanceChunkTemplates[var25][var4][var5]; // L: 1171
										if (var7 != -1) { // L: 1172
											var8 = var7 >> 24 & 3; // L: 1173
											var31 = var7 >> 1 & 3; // L: 1174
											var10 = var7 >> 14 & 1023; // L: 1175
											var11 = var7 >> 3 & 2047; // L: 1176
											var12 = (var10 / 8 << 8) + var11 / 8; // L: 1177

											for (var13 = 0; var13 < UserComparator4.regions.length; ++var13) { // L: 1178
												if (UserComparator4.regions[var13] == var12 && UrlRequest.regionLandArchives[var13] != null) { // L: 1179
													UserComparator6.method2580(UrlRequest.regionLandArchives[var13], var25, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var31, collisionMaps); // L: 1180
													var37 = true; // L: 1181
													break; // L: 1182
												}
											}
										}

										if (!var37) { // L: 1186
											var8 = var25; // L: 1187
											var31 = var4 * 8; // L: 1188
											var10 = var5 * 8; // L: 1189

											for (var11 = 0; var11 < 8; ++var11) { // L: 1191
												for (var12 = 0; var12 < 8; ++var12) { // L: 1192
													Tiles.Tiles_heights[var8][var11 + var31][var10 + var12] = 0;
												}
											}

											if (var31 > 0) { // L: 1194
												for (var11 = 1; var11 < 8; ++var11) { // L: 1195
													Tiles.Tiles_heights[var8][var31][var11 + var10] = Tiles.Tiles_heights[var8][var31 - 1][var11 + var10];
												}
											}

											if (var10 > 0) { // L: 1197
												for (var11 = 1; var11 < 8; ++var11) { // L: 1198
													Tiles.Tiles_heights[var8][var11 + var31][var10] = Tiles.Tiles_heights[var8][var11 + var31][var10 - 1];
												}
											}

											if (var31 > 0 && Tiles.Tiles_heights[var8][var31 - 1][var10] != 0) { // L: 1200
												Tiles.Tiles_heights[var8][var31][var10] = Tiles.Tiles_heights[var8][var31 - 1][var10];
											} else if (var10 > 0 && Tiles.Tiles_heights[var8][var31][var10 - 1] != 0) { // L: 1201
												Tiles.Tiles_heights[var8][var31][var10] = Tiles.Tiles_heights[var8][var31][var10 - 1];
											} else if (var31 > 0 && var10 > 0 && Tiles.Tiles_heights[var8][var31 - 1][var10 - 1] != 0) { // L: 1202
												Tiles.Tiles_heights[var8][var31][var10] = Tiles.Tiles_heights[var8][var31 - 1][var10 - 1];
											}
										}
									}
								}

								++var25; // L: 1166
							}
						}

						DynamicObject.method2099(true); // L: 1239
						class233.playPcmPlayers(); // L: 1240
						class69.method1225(DevicePcmPlayerProvider.scene, collisionMaps); // L: 1241
						DynamicObject.method2099(true); // L: 1242
						var25 = Tiles.Tiles_minPlane; // L: 1243
						if (var25 > SoundSystem.Client_plane) { // L: 1244
							var25 = SoundSystem.Client_plane;
						}

						if (var25 < SoundSystem.Client_plane - 1) { // L: 1245
							var25 = SoundSystem.Client_plane - 1;
						}

						if (isLowDetail) { // L: 1246
							DevicePcmPlayerProvider.scene.init(Tiles.Tiles_minPlane);
						} else {
							DevicePcmPlayerProvider.scene.init(0); // L: 1247
						}

						for (var4 = 0; var4 < 104; ++var4) { // L: 1248
							for (var5 = 0; var5 < 104; ++var5) { // L: 1249
								class26.updateItemPile(var4, var5); // L: 1250
							}
						}

						class233.playPcmPlayers(); // L: 1253
						GraphicsObject.method2014(); // L: 1254
						ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 1255
						PacketBufferNode var36;
						if (class1.client.hasFrame()) { // L: 1256
							var36 = InterfaceParent.getPacketBufferNode(ClientPacket.field2574, packetWriter.isaacCipher); // L: 1258
							var36.packetBuffer.writeInt(1057001181); // L: 1259
							packetWriter.addNode(var36); // L: 1260
						}

						if (!isInInstance) { // L: 1262
							var4 = (class12.field111 - 6) / 8; // L: 1263
							var5 = (class12.field111 + 6) / 8; // L: 1264
							var28 = (RouteStrategy.field1919 - 6) / 8; // L: 1265
							var7 = (RouteStrategy.field1919 + 6) / 8; // L: 1266

							for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) { // L: 1267
								for (var31 = var28 - 1; var31 <= var7 + 1; ++var31) { // L: 1268
									if (var8 < var4 || var8 > var5 || var31 < var28 || var31 > var7) { // L: 1269
										class4.archive5.loadRegionFromName("m" + var8 + "_" + var31); // L: 1270
										class4.archive5.loadRegionFromName("l" + var8 + "_" + var31); // L: 1271
									}
								}
							}
						}

						Projectile.updateGameState(30); // L: 1275
						class233.playPcmPlayers(); // L: 1276
						AccessFile.field4098 = null; // L: 1278
						Tiles.field1111 = null; // L: 1279
						class22.field186 = null; // L: 1280
						class16.field132 = null; // L: 1281
						Tiles.field1101 = null; // L: 1282
						class43.field307 = null; // L: 1283
						NPC.field1328 = null; // L: 1284
						class230.Tiles_hue = null; // L: 1285
						Tiles.Tiles_saturation = null; // L: 1286
						AbstractByteArrayCopier.Tiles_lightness = null; // L: 1287
						WorldMapSectionType.Tiles_hueMultiplier = null; // L: 1288
						Tiles.field1095 = null; // L: 1289
						var36 = InterfaceParent.getPacketBufferNode(ClientPacket.field2585, packetWriter.isaacCipher); // L: 1291
						packetWriter.addNode(var36); // L: 1292
						class26.method350(); // L: 1293
					}
				}
			}
		} else {
			class21.doCycleTitle(this);
		}

		if (gameState == 30) { // L: 1295
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1296
			this.doCycleLoggedOut();
		}

	} // L: 1297

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "49"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = RouteStrategy.method3252(); // L: 1300
		if (var2 && field862 && SoundCache.pcmPlayer0 != null) { // L: 1301 1302
			SoundCache.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field839 && ClientPacket.currentTimeMillis() > field839) { // L: 1304 1305
			WorldMapDecorationType.setWindowedMode(class302.getWindowedMode()); // L: 1306
		}

		int var3;
		if (var1) { // L: 1309
			for (var3 = 0; var3 < 100; ++var3) { // L: 1310
				field831[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1312
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1313
			NetFileRequest.drawTitle(class309.fontBold12, UserComparator10.fontPlain11, AbstractSocket.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1314
			if (gameState == 20) { // L: 1315
				NetFileRequest.drawTitle(class309.fontBold12, UserComparator10.fontPlain11, AbstractSocket.fontPlain12);
			} else if (gameState == 25) { // L: 1316
				if (field678 == 1) { // L: 1317
					if (field618 > field789) { // L: 1318
						field789 = field618;
					}

					var3 = (field789 * 50 - field618 * 50) / field789; // L: 1319
					class143.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1320
				} else if (field678 == 2) { // L: 1322
					if (field742 > field677) { // L: 1323
						field677 = field742;
					}

					var3 = (field677 * 50 - field742 * 50) / field677 + 50; // L: 1324
					class143.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1325
				} else {
					class143.drawLoadingMessage("Loading - please wait.", false); // L: 1327
				}
			} else if (gameState == 30) { // L: 1329
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1330
				class143.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1331
				class143.drawLoadingMessage("Please wait...", false);
			}
		} else {
			NetFileRequest.drawTitle(class309.fontBold12, UserComparator10.fontPlain11, AbstractSocket.fontPlain12); // L: 1321
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1332
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1333
				if (field712[var3]) { // L: 1334
					AbstractWorldMapData.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1335
					field712[var3] = false; // L: 1336
				}
			}
		} else if (gameState > 0) { // L: 1340
			AbstractWorldMapData.rasterProvider.drawFull(0, 0); // L: 1341

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1342
				field712[var3] = false;
			}
		}

	} // L: 1344

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1785168903"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class20.varcs.hasUnwrittenChanges()) { // L: 1347
			class20.varcs.write();
		}

		if (UrlRequester.mouseRecorder != null) { // L: 1348
			UrlRequester.mouseRecorder.isRunning = false;
		}

		UrlRequester.mouseRecorder = null; // L: 1349
		packetWriter.close(); // L: 1350
		if (KeyHandler.KeyHandler_instance != null) { // L: 1352
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1353
				KeyHandler.KeyHandler_instance = null; // L: 1354
			} // L: 1355
		}

		if (MouseHandler.MouseHandler_instance != null) { // L: 1359
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1360
				MouseHandler.MouseHandler_instance = null; // L: 1361
			} // L: 1362
		}

		Projectile.mouseWheel = null; // L: 1365
		if (SoundCache.pcmPlayer0 != null) { // L: 1366
			SoundCache.pcmPlayer0.shutdown();
		}

		if (UrlRequester.pcmPlayer1 != null) { // L: 1367
			UrlRequester.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1369
			NetCache.NetCache_socket.close();
		}

		GameObject.method4431(); // L: 1371
		if (ArchiveDiskActionHandler.urlRequester != null) { // L: 1372
			ArchiveDiskActionHandler.urlRequester.close(); // L: 1373
			ArchiveDiskActionHandler.urlRequester = null; // L: 1374
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1378

			for (int var4 = 0; var4 < class24.idxCount; ++var4) { // L: 1379
				class369.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1380
			JagexCache.JagexCache_randomDat.close(); // L: 1381
		} catch (Exception var7) { // L: 1383
		}

	} // L: 1385

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1888551887"
	)
	protected final void vmethod1278() {
	} // L: 690

	public final void init() {
		try {
			if (this.checkHost()) { // L: 696
				for (int var1 = 0; var1 <= 20; ++var1) { // L: 697
					String var2 = this.getParameter(Integer.toString(var1)); // L: 698
					if (var2 != null) { // L: 699
						switch(var1) { // L: 700
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 703
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 772
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 773
							}
							break;
						case 4:
							if (clientType == -1) { // L: 749
								clientType = Integer.parseInt(var2); // L: 750
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 723
							break; // L: 724
						case 6:
							AbstractArchive.clientLanguage = Language.method5269(Integer.parseInt(var2)); // L: 708
							break; // L: 709
						case 7:
							WorldMapDecoration.field2084 = ReflectionCheck.method1228(Integer.parseInt(var2)); // L: 756
							break; // L: 757
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 761
							}
							break;
						case 9:
							Messages.field1397 = var2; // L: 718
							break; // L: 719
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.stellardawn, StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.game5, StudioGame.oldscape}; // L: 735
							class182.field2114 = (StudioGame)Clock.findEnumerated(var3, Integer.parseInt(var2)); // L: 737
							if (class182.field2114 == StudioGame.oldscape) { // L: 738
								LoginScreenAnimation.loginType = LoginType.oldscape;
							} else {
								LoginScreenAnimation.loginType = LoginType.field4089; // L: 739
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 744
							break; // L: 745
						case 14:
							class82.field999 = Integer.parseInt(var2); // L: 713
							break; // L: 714
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 767
							break; // L: 768
						case 17:
							class162.field1936 = var2; // L: 728
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 780
				isLowDetail = false; // L: 781
				worldHost = this.getCodeBase().getHost(); // L: 783
				String var11 = WorldMapDecoration.field2084.name; // L: 784
				byte var12 = 0; // L: 785

				try {
					class24.idxCount = 21; // L: 788
					ClanChannel.cacheGamebuild = var12; // L: 789

					try {
						class23.operatingSystemName = System.getProperty("os.name"); // L: 791
					} catch (Exception var20) { // L: 793
						class23.operatingSystemName = "Unknown"; // L: 794
					}

					GraphicsObject.formattedOperatingSystemName = class23.operatingSystemName.toLowerCase(); // L: 796

					try {
						JagexCache.userHomeDirectory = System.getProperty("user.home"); // L: 798
						if (JagexCache.userHomeDirectory != null) { // L: 799
							JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
						}
					} catch (Exception var19) { // L: 801
					}

					try {
						if (GraphicsObject.formattedOperatingSystemName.startsWith("win")) { // L: 803
							if (JagexCache.userHomeDirectory == null) { // L: 804
								JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (JagexCache.userHomeDirectory == null) { // L: 807
							JagexCache.userHomeDirectory = System.getenv("HOME");
						}

						if (JagexCache.userHomeDirectory != null) { // L: 809
							JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
						}
					} catch (Exception var18) { // L: 811
					}

					if (JagexCache.userHomeDirectory == null) { // L: 812
						JagexCache.userHomeDirectory = "~/";
					}

					ArchiveLoader.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""}; // L: 813
					JagexCache.cacheSubPaths = new String[]{".jagex_cache_" + ClanChannel.cacheGamebuild, ".file_store_" + ClanChannel.cacheGamebuild}; // L: 814

					int var13;
					label176:
					for (var13 = 0; var13 < 4; ++var13) { // L: 815
						WorldMapDecoration.cacheDir = Renderable.method4244("oldschool", var11, var13); // L: 816
						if (!WorldMapDecoration.cacheDir.exists()) { // L: 817
							WorldMapDecoration.cacheDir.mkdirs();
						}

						File[] var4 = WorldMapDecoration.cacheDir.listFiles(); // L: 818
						if (var4 == null) { // L: 819
							break;
						}

						File[] var5 = var4; // L: 821
						int var6 = 0;

						while (true) {
							if (var6 >= var5.length) {
								break label176;
							}

							File var7 = var5[var6]; // L: 823

							boolean var8;
							try {
								RandomAccessFile var9 = new RandomAccessFile(var7, "rw"); // L: 828
								int var10 = var9.read(); // L: 829
								var9.seek(0L); // L: 830
								var9.write(var10); // L: 831
								var9.seek(0L); // L: 832
								var9.close(); // L: 833
								var8 = true; // L: 835
							} catch (Exception var17) { // L: 837
								var8 = false; // L: 838
							}

							if (!var8) { // L: 841
								break;
							}

							++var6; // L: 822
						}
					}

					class26.method344(WorldMapDecoration.cacheDir); // L: 848

					try {
						File var24 = new File(JagexCache.userHomeDirectory, "random.dat"); // L: 851
						int var15;
						if (var24.exists()) { // L: 852
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var24, "rw", 25L), 24, 0); // L: 853
						} else {
							label155:
							for (int var14 = 0; var14 < JagexCache.cacheSubPaths.length; ++var14) { // L: 856
								for (var15 = 0; var15 < ArchiveLoader.cacheParentPaths.length; ++var15) { // L: 857
									File var16 = new File(ArchiveLoader.cacheParentPaths[var15] + JagexCache.cacheSubPaths[var14] + File.separatorChar + "random.dat"); // L: 858
									if (var16.exists()) { // L: 859
										JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var16, "rw", 25L), 24, 0); // L: 860
										break label155; // L: 861
									}
								}
							}
						}

						if (JagexCache.JagexCache_randomDat == null) { // L: 866
							RandomAccessFile var25 = new RandomAccessFile(var24, "rw"); // L: 867
							var15 = var25.read(); // L: 868
							var25.seek(0L); // L: 869
							var25.write(var15); // L: 870
							var25.seek(0L); // L: 871
							var25.close(); // L: 872
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var24, "rw", 25L), 24, 0); // L: 873
						}
					} catch (IOException var21) { // L: 876
					}

					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(FloorUnderlayDefinition.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 878
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(FloorUnderlayDefinition.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 879
					class369.JagexCache_idxFiles = new BufferedFile[class24.idxCount]; // L: 880

					for (var13 = 0; var13 < class24.idxCount; ++var13) { // L: 881
						class369.JagexCache_idxFiles[var13] = new BufferedFile(new AccessFile(FloorUnderlayDefinition.getFile("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0); // L: 882
					}
				} catch (Exception var22) { // L: 886
					FriendsChat.RunException_sendStackTrace((String)null, var22); // L: 887
				}

				class1.client = this; // L: 889
				GZipDecompressor.clientType = clientType; // L: 890
				if (field625 == -1) { // L: 891
					field625 = 0; // L: 892
				}

				this.startThread(765, 503, 197); // L: 894
			}
		} catch (RuntimeException var23) {
			throw Timer.newRunException(var23, "client.init(" + ')');
		}
	} // L: 895

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1444
			long var2 = ClientPacket.currentTimeMillis(); // L: 1447
			int var4 = (int)(var2 - NetCache.field3604); // L: 1448
			NetCache.field3604 = var2; // L: 1449
			if (var4 > 200) { // L: 1450
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1451
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1452
				var1 = true; // L: 1453
			} else if (NetCache.NetCache_socket == null) { // L: 1456
				var1 = false; // L: 1457
			} else {
				try {
					label241: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1461
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1462
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1463
							var6 = new Buffer(4); // L: 1464
							var6.writeByte(1); // L: 1465
							var6.writeMedium((int)var5.key); // L: 1466
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1467
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1468
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1469
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1470
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1472
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1473
							var6 = new Buffer(4); // L: 1474
							var6.writeByte(0); // L: 1475
							var6.writeMedium((int)var5.key); // L: 1476
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1477
							var5.removeDual(); // L: 1478
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1479
							--NetCache.NetCache_pendingWritesCount; // L: 1480
							++NetCache.NetCache_pendingResponsesCount; // L: 1481
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1483
							int var18 = NetCache.NetCache_socket.available(); // L: 1484
							if (var18 < 0) { // L: 1485
								throw new IOException();
							}

							if (var18 == 0) { // L: 1486
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1487
							byte var7 = 0; // L: 1488
							if (class34.NetCache_currentResponse == null) { // L: 1489
								var7 = 8;
							} else if (NetCache.field3615 == 0) { // L: 1490
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1491
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1492
								if (var8 > var18) { // L: 1493
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1494
								if (NetCache.field3618 != 0) { // L: 1495
									for (var9 = 0; var9 < var8; ++var9) { // L: 1496
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3618;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1498
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1499
									break;
								}

								if (class34.NetCache_currentResponse == null) { // L: 1500
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1501
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1502
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1503
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1504
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1505
									long var13 = (long)(var10 + (var9 << 16)); // L: 1506
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1507
									class266.field3222 = true; // L: 1508
									if (var15 == null) { // L: 1509
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1510
										class266.field3222 = false; // L: 1511
									}

									if (var15 == null) { // L: 1513
										throw new IOException(); // L: 1514
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1516
									class34.NetCache_currentResponse = var15; // L: 1517
									class254.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + class34.NetCache_currentResponse.padding); // L: 1518
									class254.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1519
									class254.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1520
									NetCache.field3615 = 8; // L: 1521
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1522
								} else if (NetCache.field3615 == 0) { // L: 1525
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1526
										NetCache.field3615 = 1; // L: 1527
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1528
									} else {
										class34.NetCache_currentResponse = null; // L: 1532
									}
								}
							} else {
								var8 = class254.NetCache_responseArchiveBuffer.array.length - class34.NetCache_currentResponse.padding; // L: 1538
								var9 = 512 - NetCache.field3615; // L: 1539
								if (var9 > var8 - class254.NetCache_responseArchiveBuffer.offset) { // L: 1540
									var9 = var8 - class254.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1541
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class254.NetCache_responseArchiveBuffer.array, class254.NetCache_responseArchiveBuffer.offset, var9); // L: 1542
								if (NetCache.field3618 != 0) { // L: 1543
									for (var10 = 0; var10 < var9; ++var10) { // L: 1544
										var10000 = class254.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + class254.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field3618;
									}
								}

								var25 = class254.NetCache_responseArchiveBuffer; // L: 1546
								var25.offset += var9;
								NetCache.field3615 += var9; // L: 1547
								if (var8 == class254.NetCache_responseArchiveBuffer.offset) { // L: 1548
									if (16711935L == class34.NetCache_currentResponse.key) { // L: 1549
										UserComparator6.NetCache_reference = class254.NetCache_responseArchiveBuffer; // L: 1550

										for (var10 = 0; var10 < 256; ++var10) { // L: 1551
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1552
											if (var19 != null) { // L: 1553
												UserComparator6.NetCache_reference.offset = var10 * 8 + 5; // L: 1554
												var12 = UserComparator6.NetCache_reference.readInt(); // L: 1555
												int var20 = UserComparator6.NetCache_reference.readInt(); // L: 1556
												var19.loadIndex(var12, var20); // L: 1557
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1562
										NetCache.NetCache_crc.update(class254.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1563
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1564
										if (var10 != class34.NetCache_currentResponse.crc) { // L: 1565
											try {
												NetCache.NetCache_socket.close(); // L: 1567
											} catch (Exception var23) { // L: 1569
											}

											++NetCache.NetCache_crcMismatches; // L: 1570
											NetCache.NetCache_socket = null; // L: 1571
											NetCache.field3618 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1572
											var1 = false; // L: 1573
											break label241;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1576
										NetCache.NetCache_ioExceptions = 0; // L: 1577
										class34.NetCache_currentResponse.archive.write((int)(class34.NetCache_currentResponse.key & 65535L), class254.NetCache_responseArchiveBuffer.array, (class34.NetCache_currentResponse.key & 16711680L) == 16711680L, class266.field3222); // L: 1578
									}

									class34.NetCache_currentResponse.remove(); // L: 1580
									if (class266.field3222) { // L: 1581
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1582
									}

									NetCache.field3615 = 0; // L: 1583
									class34.NetCache_currentResponse = null; // L: 1584
									class254.NetCache_responseArchiveBuffer = null; // L: 1585
								} else {
									if (NetCache.field3615 != 512) { // L: 1587
										break;
									}

									NetCache.field3615 = 0;
								}
							}
						}

						var1 = true; // L: 1591
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1595
					} catch (Exception var22) { // L: 1597
					}

					++NetCache.NetCache_ioExceptions; // L: 1598
					NetCache.NetCache_socket = null; // L: 1599
					var1 = false; // L: 1600
				}
			}

			if (!var1) { // L: 1604
				this.doCycleJs5Connect();
			}

		}
	} // L: 1605

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1568310172"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1608
			this.error("js5crc"); // L: 1609
			gameState = 1000; // L: 1610
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1613
				if (gameState <= 5) { // L: 1614
					this.error("js5io"); // L: 1615
					gameState = 1000; // L: 1616
					return; // L: 1617
				}

				field800 = 3000; // L: 1620
				NetCache.NetCache_ioExceptions = 3; // L: 1621
			}

			if (--field800 + 1 <= 0) { // L: 1624
				try {
					if (js5ConnectState == 0) { // L: 1626
						Buddy.js5SocketTask = GameEngine.taskHandler.newSocketTask(worldHost, UserComparator2.currentPort); // L: 1627
						++js5ConnectState; // L: 1628
					}

					if (js5ConnectState == 1) { // L: 1630
						if (Buddy.js5SocketTask.status == 2) { // L: 1631
							this.js5Error(-1); // L: 1632
							return; // L: 1633
						}

						if (Buddy.js5SocketTask.status == 1) { // L: 1635
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1637
						if (useBufferedSocket) { // L: 1638
							BoundaryObject.js5Socket = PcmPlayer.method897((Socket)Buddy.js5SocketTask.result, 40000, 5000); // L: 1639
						} else {
							BoundaryObject.js5Socket = new NetSocket((Socket)Buddy.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1642
						}

						Buffer var1 = new Buffer(5); // L: 1644
						var1.writeByte(15); // L: 1645
						var1.writeInt(197); // L: 1646
						BoundaryObject.js5Socket.write(var1.array, 0, 5); // L: 1647
						++js5ConnectState; // L: 1648
						VarcInt.field1586 = ClientPacket.currentTimeMillis(); // L: 1649
					}

					if (js5ConnectState == 3) { // L: 1651
						if (BoundaryObject.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1652
							int var2 = BoundaryObject.js5Socket.readUnsignedByte(); // L: 1653
							if (var2 != 0) { // L: 1654
								this.js5Error(var2); // L: 1655
								return; // L: 1656
							}

							++js5ConnectState; // L: 1658
						} else if (ClientPacket.currentTimeMillis() - VarcInt.field1586 > 30000L) { // L: 1661
							this.js5Error(-2); // L: 1662
							return; // L: 1663
						}
					}

					if (js5ConnectState == 4) { // L: 1667
						VarbitComposition.method2928(BoundaryObject.js5Socket, gameState > 20); // L: 1668
						Buddy.js5SocketTask = null; // L: 1669
						BoundaryObject.js5Socket = null; // L: 1670
						js5ConnectState = 0; // L: 1671
						js5Errors = 0; // L: 1672
					}
				} catch (IOException var3) { // L: 1675
					this.js5Error(-3); // L: 1676
				}

			}
		}
	} // L: 1611 1678

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "435825776"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		Buddy.js5SocketTask = null; // L: 1681
		BoundaryObject.js5Socket = null; // L: 1682
		js5ConnectState = 0; // L: 1683
		if (UserComparator2.currentPort == UserComparator7.worldPort) { // L: 1684
			UserComparator2.currentPort = MouseRecorder.js5Port;
		} else {
			UserComparator2.currentPort = UserComparator7.worldPort; // L: 1685
		}

		++js5Errors; // L: 1686
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1687
			if (gameState <= 5) { // L: 1688
				this.error("js5connect_full"); // L: 1689
				gameState = 1000; // L: 1690
			} else {
				field800 = 3000; // L: 1692
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1694
			this.error("js5connect_outofdate"); // L: 1695
			gameState = 1000; // L: 1696
		} else if (js5Errors >= 4) { // L: 1698
			if (gameState <= 5) { // L: 1699
				this.error("js5connect"); // L: 1700
				gameState = 1000; // L: 1701
			} else {
				field800 = 3000; // L: 1703
			}
		}

	} // L: 1705

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26284"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2425
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2426

		try {
			if (loginState == 0) { // L: 2428
				if (ClanSettings.secureRandom == null && (secureRandomFuture.isDone() || field811 > 250)) { // L: 2429
					ClanSettings.secureRandom = secureRandomFuture.get(); // L: 2430
					secureRandomFuture.shutdown(); // L: 2431
					secureRandomFuture = null; // L: 2432
				}

				if (ClanSettings.secureRandom != null) { // L: 2434
					if (var1 != null) { // L: 2435
						((AbstractSocket)var1).close(); // L: 2436
						var1 = null; // L: 2437
					}

					AbstractArchive.socketTask = null; // L: 2439
					hadNetworkError = false; // L: 2440
					field811 = 0; // L: 2441
					loginState = 1; // L: 2442
				}
			}

			if (loginState == 1) { // L: 2445
				if (AbstractArchive.socketTask == null) { // L: 2446
					AbstractArchive.socketTask = GameEngine.taskHandler.newSocketTask(worldHost, UserComparator2.currentPort); // L: 2447
				}

				if (AbstractArchive.socketTask.status == 2) { // L: 2449
					throw new IOException();
				}

				if (AbstractArchive.socketTask.status == 1) { // L: 2450
					if (useBufferedSocket) { // L: 2451
						var1 = PcmPlayer.method897((Socket)AbstractArchive.socketTask.result, 40000, 5000); // L: 2452
					} else {
						var1 = new NetSocket((Socket)AbstractArchive.socketTask.result, GameEngine.taskHandler, 5000); // L: 2455
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2457
					AbstractArchive.socketTask = null; // L: 2458
					loginState = 2; // L: 2459
				}
			}

			if (loginState == 2) { // L: 2462
				packetWriter.clearBuffer(); // L: 2463
				PacketBufferNode var4 = WorldMapData_1.method3583(); // L: 2466
				var4.clientPacket = null; // L: 2467
				var4.clientPacketLength = 0; // L: 2468
				var4.packetBuffer = new PacketBuffer(5000); // L: 2469
				var4.packetBuffer.writeByte(LoginPacket.field2806.id); // L: 2473
				packetWriter.addNode(var4); // L: 2474
				packetWriter.flush(); // L: 2475
				var2.offset = 0; // L: 2476
				loginState = 3; // L: 2477
			}

			boolean var13;
			int var14;
			if (loginState == 3) { // L: 2479
				if (SoundCache.pcmPlayer0 != null) { // L: 2480
					SoundCache.pcmPlayer0.method844();
				}

				if (UrlRequester.pcmPlayer1 != null) { // L: 2481
					UrlRequester.pcmPlayer1.method844();
				}

				var13 = true; // L: 2482
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2483 2484
					var13 = false;
				}

				if (var13) { // L: 2486
					var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2487
					if (SoundCache.pcmPlayer0 != null) { // L: 2488
						SoundCache.pcmPlayer0.method844();
					}

					if (UrlRequester.pcmPlayer1 != null) { // L: 2489
						UrlRequester.pcmPlayer1.method844();
					}

					if (var14 != 0) { // L: 2490
						WorldMapDecorationType.getLoginError(var14); // L: 2491
						return; // L: 2492
					}

					var2.offset = 0; // L: 2494
					loginState = 4; // L: 2495
				}
			}

			int var32;
			if (loginState == 4) { // L: 2498
				if (var2.offset < 8) { // L: 2499
					var32 = ((AbstractSocket)var1).available(); // L: 2500
					if (var32 > 8 - var2.offset) { // L: 2501
						var32 = 8 - var2.offset;
					}

					if (var32 > 0) { // L: 2502
						((AbstractSocket)var1).read(var2.array, var2.offset, var32); // L: 2503
						var2.offset += var32; // L: 2504
					}
				}

				if (var2.offset == 8) { // L: 2507
					var2.offset = 0; // L: 2508
					class160.field1929 = var2.readLong(); // L: 2509
					loginState = 5; // L: 2510
				}
			}

			if (loginState == 5) { // L: 2513
				packetWriter.packetBuffer.offset = 0; // L: 2514
				packetWriter.clearBuffer(); // L: 2515
				PacketBuffer var3 = new PacketBuffer(500); // L: 2516
				int[] var24 = new int[]{ClanSettings.secureRandom.nextInt(), ClanSettings.secureRandom.nextInt(), ClanSettings.secureRandom.nextInt(), ClanSettings.secureRandom.nextInt()}; // L: 2517 2518 2519 2520 2521
				var3.offset = 0; // L: 2522
				var3.writeByte(1); // L: 2523
				var3.writeInt(var24[0]); // L: 2524
				var3.writeInt(var24[1]); // L: 2525
				var3.writeInt(var24[2]); // L: 2526
				var3.writeInt(var24[3]); // L: 2527
				var3.writeLong(class160.field1929); // L: 2528
				if (gameState == 40) { // L: 2529
					var3.writeInt(SoundCache.field438[0]); // L: 2530
					var3.writeInt(SoundCache.field438[1]); // L: 2531
					var3.writeInt(SoundCache.field438[2]); // L: 2532
					var3.writeInt(SoundCache.field438[3]); // L: 2533
				} else {
					var3.writeByte(field656.rsOrdinal()); // L: 2536
					switch(field656.field1476) { // L: 2537
					case 0:
						var3.offset += 4; // L: 2540
						break; // L: 2541
					case 1:
					case 2:
						var3.writeMedium(class0.field2); // L: 2551
						++var3.offset; // L: 2552
						break;
					case 3:
						var3.writeInt((Integer)class4.clientPreferences.parameters.get(class125.method2586(Login.Login_username))); // L: 2545
					}

					var3.writeByte(class387.field4211.rsOrdinal()); // L: 2556
					var3.writeStringCp1252NullTerminated(Login.Login_password); // L: 2557
				}

				var3.encryptRsa(class82.field1000, class82.field996); // L: 2559
				SoundCache.field438 = var24; // L: 2560
				PacketBufferNode var6 = WorldMapData_1.method3583(); // L: 2563
				var6.clientPacket = null; // L: 2564
				var6.clientPacketLength = 0; // L: 2565
				var6.packetBuffer = new PacketBuffer(5000); // L: 2566
				var6.packetBuffer.offset = 0; // L: 2570
				if (gameState == 40) { // L: 2571
					var6.packetBuffer.writeByte(LoginPacket.field2803.id); // L: 2572
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field2802.id); // L: 2575
				}

				var6.packetBuffer.writeShort(0); // L: 2577
				int var7 = var6.packetBuffer.offset; // L: 2578
				var6.packetBuffer.writeInt(197); // L: 2579
				var6.packetBuffer.writeInt(1); // L: 2580
				var6.packetBuffer.writeByte(clientType); // L: 2581
				var6.packetBuffer.writeByte(field625); // L: 2582
				var6.packetBuffer.writeBytes(var3.array, 0, var3.offset); // L: 2583
				int var8 = var6.packetBuffer.offset; // L: 2584
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2585
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2586
				var6.packetBuffer.writeShort(AttackOption.canvasWidth); // L: 2587
				var6.packetBuffer.writeShort(class0.canvasHeight); // L: 2588
				PacketBuffer var9 = var6.packetBuffer; // L: 2589
				if (randomDatData != null) { // L: 2591
					var9.writeBytes(randomDatData, 0, randomDatData.length); // L: 2592
				} else {
					byte[] var10 = PlatformInfo.method6115(); // L: 2595
					var9.writeBytes(var10, 0, var10.length); // L: 2596
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(Messages.field1397); // L: 2598
				var6.packetBuffer.writeInt(class82.field999); // L: 2599
				Buffer var31 = new Buffer(ClanSettings.platformInfo.size()); // L: 2600
				ClanSettings.platformInfo.write(var31); // L: 2601
				var6.packetBuffer.writeBytes(var31.array, 0, var31.array.length); // L: 2602
				var6.packetBuffer.writeByte(clientType); // L: 2603
				var6.packetBuffer.writeInt(0); // L: 2604
				var6.packetBuffer.method6659(KitDefinition.archive1.hash); // L: 2605
				var6.packetBuffer.method6658(Varcs.archive12.hash); // L: 2606
				var6.packetBuffer.writeInt(class4.archive5.hash); // L: 2607
				var6.packetBuffer.method6658(0); // L: 2608
				var6.packetBuffer.writeIntME(class26.archive4.hash); // L: 2609
				var6.packetBuffer.method6658(PcmPlayer.archive7.hash); // L: 2610
				var6.packetBuffer.method6658(class160.archive11.hash); // L: 2611
				var6.packetBuffer.writeIntME(class18.archive3.hash); // L: 2612
				var6.packetBuffer.method6659(JagexCache.archive10.hash); // L: 2613
				var6.packetBuffer.writeInt(ClanChannel.archive0.hash); // L: 2614
				var6.packetBuffer.method6658(PacketWriter.archive14.hash); // L: 2615
				var6.packetBuffer.method6659(DynamicObject.archive6.hash); // L: 2616
				var6.packetBuffer.writeInt(SecureRandomFuture.archive2.hash); // L: 2617
				var6.packetBuffer.writeInt(WorldMapEvent.archive19.hash); // L: 2618
				var6.packetBuffer.writeInt(class6.archive18.hash); // L: 2619
				var6.packetBuffer.method6659(class10.archive17.hash); // L: 2620
				var6.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.archive13.hash); // L: 2621
				var6.packetBuffer.method6658(class16.archive9.hash); // L: 2622
				var6.packetBuffer.writeIntME(class306.archive15.hash); // L: 2623
				var6.packetBuffer.writeInt(ModeWhere.archive8.hash); // L: 2624
				var6.packetBuffer.method6659(WorldMapLabel.archive20.hash); // L: 2625
				var6.packetBuffer.xteaEncrypt(var24, var8, var6.packetBuffer.offset); // L: 2626
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7); // L: 2627
				packetWriter.addNode(var6); // L: 2628
				packetWriter.flush(); // L: 2629
				packetWriter.isaacCipher = new IsaacCipher(var24); // L: 2630
				int[] var11 = new int[4]; // L: 2631

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2632
					var11[var12] = var24[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2633
				loginState = 6; // L: 2634
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2636 2637
				var32 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2638
				if (var32 == 21 && gameState == 20) { // L: 2639
					loginState = 12; // L: 2640
				} else if (var32 == 2) { // L: 2642
					loginState = 14; // L: 2643
				} else if (var32 == 15 && gameState == 40) { // L: 2645
					packetWriter.serverPacketLength = -1; // L: 2646
					loginState = 19; // L: 2647
				} else if (var32 == 64) { // L: 2649
					loginState = 10; // L: 2650
				} else if (var32 == 23 && field654 < 1) { // L: 2652
					++field654; // L: 2653
					loginState = 0; // L: 2654
				} else if (var32 == 29) { // L: 2656
					loginState = 17; // L: 2657
				} else {
					if (var32 != 69) { // L: 2659
						WorldMapDecorationType.getLoginError(var32); // L: 2663
						return; // L: 2664
					}

					loginState = 7; // L: 2660
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2668 2669
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2670
				var2.offset = 0; // L: 2671
				ClanChannel.field30 = var2.readUnsignedShort(); // L: 2672
				loginState = 8; // L: 2673
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= ClanChannel.field30) { // L: 2676 2677
				var2.offset = 0; // L: 2678
				((AbstractSocket)var1).read(var2.array, var2.offset, ClanChannel.field30); // L: 2679
				class34[] var21 = new class34[]{class34.field232}; // L: 2682
				class34 var25 = var21[var2.readUnsignedByte()]; // L: 2684

				try {
					switch(var25.field233) { // L: 2688
					case 0:
						class28 var5 = new class28(); // L: 2691
						this.field661 = new class35(var2, var5); // L: 2701
						loginState = 9; // L: 2702
						break;
					default:
						throw new IllegalArgumentException(); // L: 2696
					}
				} catch (Exception var19) { // L: 2704
					WorldMapDecorationType.getLoginError(22); // L: 2705
					return; // L: 2706
				}
			}

			if (loginState == 9 && this.field661.method420()) { // L: 2710 2711
				this.field660 = this.field661.method416(); // L: 2712
				this.field661.method410(); // L: 2713
				this.field661 = null; // L: 2714
				if (this.field660 == null) { // L: 2715
					WorldMapDecorationType.getLoginError(22); // L: 2716
					return; // L: 2717
				}

				packetWriter.clearBuffer(); // L: 2719
				PacketBufferNode var22 = ArchiveLoader.method2162(); // L: 2720
				var22.packetBuffer.writeByte(LoginPacket.field2804.id); // L: 2721
				var22.packetBuffer.writeShort(this.field660.offset); // L: 2722
				var22.packetBuffer.method6607(this.field660); // L: 2723
				packetWriter.addNode(var22); // L: 2724
				packetWriter.flush(); // L: 2725
				this.field660 = null; // L: 2726
				loginState = 6; // L: 2727
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2730 2731
				WorldMapEvent.field2152 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2732
				loginState = 11; // L: 2733
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= WorldMapEvent.field2152) { // L: 2736 2737
				((AbstractSocket)var1).read(var2.array, 0, WorldMapEvent.field2152); // L: 2738
				var2.offset = 0; // L: 2739
				loginState = 6; // L: 2740
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2743 2744
				field655 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2745
				loginState = 13; // L: 2746
			}

			if (loginState == 13) { // L: 2749
				field811 = 0; // L: 2750
				CollisionMap.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field655 / 60 + " seconds."); // L: 2751
				if (--field655 <= 0) { // L: 2752
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2755 2756
					WorldMapSection0.field2038 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2757
					loginState = 15; // L: 2758
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= WorldMapSection0.field2038) { // L: 2761 2762
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2763
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2764
					var2.offset = 0; // L: 2765
					boolean var33 = false; // L: 2766
					if (var13) { // L: 2767
						var14 = var2.readByteIsaac() << 24; // L: 2768
						var14 |= var2.readByteIsaac() << 16; // L: 2769
						var14 |= var2.readByteIsaac() << 8; // L: 2770
						var14 |= var2.readByteIsaac(); // L: 2771
						int var15 = class125.method2586(Login.Login_username); // L: 2772
						if (class4.clientPreferences.parameters.size() >= 10 && !class4.clientPreferences.parameters.containsKey(var15)) { // L: 2773 2774
							Iterator var30 = class4.clientPreferences.parameters.entrySet().iterator(); // L: 2775
							var30.next(); // L: 2776
							var30.remove(); // L: 2777
						}

						class4.clientPreferences.parameters.put(var15, var14); // L: 2780
					}

					if (Login_isUsernameRemembered) { // L: 2782
						class4.clientPreferences.rememberedUsername = Login.Login_username; // L: 2783
					} else {
						class4.clientPreferences.rememberedUsername = null; // L: 2786
					}

					Actor.savePreferences(); // L: 2788
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2789
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2790
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2791
					localPlayerIndex <<= 8; // L: 2792
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2793
					field740 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2794
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2795
					var2.offset = 0; // L: 2796
					ServerPacket[] var27 = WorldMapIcon_0.ServerPacket_values(); // L: 2797
					int var16 = var2.readSmartByteShortIsaac(); // L: 2798
					if (var16 < 0 || var16 >= var27.length) { // L: 2799
						throw new IOException(var16 + " " + var2.offset);
					}

					packetWriter.serverPacket = var27[var16]; // L: 2800
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2801
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2802
					var2.offset = 0; // L: 2803
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2804

					try {
						class42.method521(class1.client, "zap"); // L: 2806
					} catch (Throwable var18) { // L: 2808
					}

					loginState = 16; // L: 2809
				}

				if (loginState == 16) { // L: 2812
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2813
						var2.offset = 0; // L: 2814
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2815
						timer.method5676(); // L: 2816
						PcmPlayer.method895(); // L: 2817
						class7.updatePlayer(var2); // L: 2818
						class12.field111 = -1; // L: 2819
						KeyHandler.loadRegions(false, var2); // L: 2820
						packetWriter.serverPacket = null; // L: 2821
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2825 2826
						var2.offset = 0; // L: 2827
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2828
						var2.offset = 0; // L: 2829
						class4.field38 = var2.readUnsignedShort(); // L: 2830
						loginState = 18; // L: 2831
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class4.field38) { // L: 2834 2835
						var2.offset = 0; // L: 2836
						((AbstractSocket)var1).read(var2.array, 0, class4.field38); // L: 2837
						var2.offset = 0; // L: 2838
						String var23 = var2.readStringCp1252NullTerminated(); // L: 2839
						String var26 = var2.readStringCp1252NullTerminated(); // L: 2840
						String var28 = var2.readStringCp1252NullTerminated(); // L: 2841
						CollisionMap.setLoginResponseString(var23, var26, var28); // L: 2842
						Projectile.updateGameState(10); // L: 2843
					}

					if (loginState != 19) { // L: 2846
						++field811; // L: 2893
						if (field811 > 2000) { // L: 2894
							if (field654 < 1) { // L: 2895
								if (UserComparator2.currentPort == UserComparator7.worldPort) { // L: 2896
									UserComparator2.currentPort = MouseRecorder.js5Port;
								} else {
									UserComparator2.currentPort = UserComparator7.worldPort; // L: 2897
								}

								++field654; // L: 2898
								loginState = 0; // L: 2899
							} else {
								WorldMapDecorationType.getLoginError(-3); // L: 2902
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2847
							if (((AbstractSocket)var1).available() < 2) { // L: 2848
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2849
							var2.offset = 0; // L: 2850
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2851
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2853
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2854
							var2.offset = 0; // L: 2855
							var32 = packetWriter.serverPacketLength; // L: 2856
							timer.method5678(); // L: 2857
							packetWriter.clearBuffer(); // L: 2859
							packetWriter.packetBuffer.offset = 0; // L: 2860
							packetWriter.serverPacket = null; // L: 2861
							packetWriter.field1410 = null; // L: 2862
							packetWriter.field1411 = null; // L: 2863
							packetWriter.field1399 = null; // L: 2864
							packetWriter.serverPacketLength = 0; // L: 2865
							packetWriter.field1408 = 0; // L: 2866
							rebootTimer = 0; // L: 2867
							class34.method407(); // L: 2868
							minimapState = 0; // L: 2869
							destinationX = 0; // L: 2870

							for (var14 = 0; var14 < 2048; ++var14) { // L: 2871
								players[var14] = null;
							}

							class262.localPlayer = null; // L: 2872

							for (var14 = 0; var14 < npcs.length; ++var14) { // L: 2873
								NPC var29 = npcs[var14]; // L: 2874
								if (var29 != null) { // L: 2875
									var29.targetIndex = -1; // L: 2876
									var29.false0 = false; // L: 2877
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32); // L: 2881
							Projectile.updateGameState(30); // L: 2883

							for (var14 = 0; var14 < 100; ++var14) { // L: 2884
								field831[var14] = true;
							}

							BufferedSink.method5992(); // L: 2885
							class7.updatePlayer(var2); // L: 2887
							if (var32 != var2.offset) { // L: 2888
								throw new RuntimeException(); // L: 2889
							}
						}
					}
				}
			}
		} catch (IOException var20) { // L: 2906
			if (field654 < 1) { // L: 2907
				if (UserComparator7.worldPort == UserComparator2.currentPort) { // L: 2908
					UserComparator2.currentPort = MouseRecorder.js5Port;
				} else {
					UserComparator2.currentPort = UserComparator7.worldPort; // L: 2909
				}

				++field654; // L: 2910
				loginState = 0; // L: 2911
			} else {
				WorldMapDecorationType.getLoginError(-2); // L: 2914
			}
		}
	} // L: 2753 2823 2891 2900 2903 2912 2915 2917

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1684472042"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3190
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3191
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3192
			hadNetworkError = false; // L: 3193
			ApproximateRouteStrategy.method1268(); // L: 3194
		} else {
			if (!isMenuOpen) { // L: 3197
				Script.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1655(packetWriter); ++var1) { // L: 3198 3199
			}

			if (gameState == 30) { // L: 3201
				int var2;
				PacketBufferNode var14;
				while (DynamicObject.method2103()) { // L: 3202
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2601, packetWriter.isaacCipher); // L: 3203
					var14.packetBuffer.writeByte(0); // L: 3204
					var2 = var14.packetBuffer.offset; // L: 3205
					MouseHandler.performReflectionCheck(var14.packetBuffer); // L: 3206
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 3207
					packetWriter.addNode(var14); // L: 3208
				}

				if (timer.field3772) { // L: 3210
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2661, packetWriter.isaacCipher); // L: 3212
					var14.packetBuffer.writeByte(0); // L: 3213
					var2 = var14.packetBuffer.offset; // L: 3214
					timer.write(var14.packetBuffer); // L: 3215
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 3216
					packetWriter.addNode(var14); // L: 3217
					timer.method5677(); // L: 3218
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
				PacketBuffer var10000;
				synchronized(UrlRequester.mouseRecorder.lock) { // L: 3221
					if (!field730) { // L: 3222
						UrlRequester.mouseRecorder.index = 0; // L: 3308
					} else if (MouseHandler.MouseHandler_lastButton != 0 || UrlRequester.mouseRecorder.index >= 40) { // L: 3223
						PacketBufferNode var15 = null; // L: 3225
						var3 = 0; // L: 3226
						var4 = 0; // L: 3227
						var5 = 0; // L: 3228
						var6 = 0; // L: 3229

						for (var7 = 0; var7 < UrlRequester.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3230 3231
							var4 = var7; // L: 3232
							var8 = UrlRequester.mouseRecorder.ys[var7]; // L: 3233
							if (var8 < -1) { // L: 3234
								var8 = -1;
							} else if (var8 > 65534) { // L: 3235
								var8 = 65534;
							}

							var9 = UrlRequester.mouseRecorder.xs[var7]; // L: 3236
							if (var9 < -1) { // L: 3237
								var9 = -1;
							} else if (var9 > 65534) { // L: 3238
								var9 = 65534;
							}

							if (var9 != field843 || var8 != field633) { // L: 3239
								if (var15 == null) { // L: 3242
									var15 = InterfaceParent.getPacketBufferNode(ClientPacket.field2655, packetWriter.isaacCipher); // L: 3243
									var15.packetBuffer.writeByte(0); // L: 3244
									var3 = var15.packetBuffer.offset; // L: 3245
									var10000 = var15.packetBuffer; // L: 3246
									var10000.offset += 2;
									var5 = 0; // L: 3247
									var6 = 0; // L: 3248
								}

								int var12;
								if (-1L != field760) { // L: 3253
									var10 = var9 - field843; // L: 3254
									var11 = var8 - field633; // L: 3255
									var12 = (int)((UrlRequester.mouseRecorder.millis[var7] - field760) / 20L); // L: 3256
									var5 = (int)((long)var5 + (UrlRequester.mouseRecorder.millis[var7] - field760) % 20L); // L: 3257
								} else {
									var10 = var9; // L: 3260
									var11 = var8; // L: 3261
									var12 = Integer.MAX_VALUE; // L: 3262
								}

								field843 = var9; // L: 3264
								field633 = var8; // L: 3265
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3266
									var10 += 32; // L: 3267
									var11 += 32; // L: 3268
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3269
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3271
									var10 += 128; // L: 3272
									var11 += 128; // L: 3273
									var15.packetBuffer.writeByte(var12 + 128); // L: 3274
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3275
								} else if (var12 < 32) { // L: 3277
									var15.packetBuffer.writeByte(var12 + 192); // L: 3278
									if (var9 != -1 && var8 != -1) { // L: 3279
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3280
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3283
									if (var9 != -1 && var8 != -1) { // L: 3284
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3285
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3287
								field760 = UrlRequester.mouseRecorder.millis[var7]; // L: 3288
							}
						}

						if (var15 != null) { // L: 3290
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3); // L: 3291
							var7 = var15.packetBuffer.offset; // L: 3292
							var15.packetBuffer.offset = var3; // L: 3293
							var15.packetBuffer.writeByte(var5 / var6); // L: 3294
							var15.packetBuffer.writeByte(var5 % var6); // L: 3295
							var15.packetBuffer.offset = var7; // L: 3296
							packetWriter.addNode(var15); // L: 3297
						}

						if (var4 >= UrlRequester.mouseRecorder.index) { // L: 3299
							UrlRequester.mouseRecorder.index = 0;
						} else {
							MouseRecorder var46 = UrlRequester.mouseRecorder; // L: 3301
							var46.index -= var4;
							System.arraycopy(UrlRequester.mouseRecorder.xs, var4, UrlRequester.mouseRecorder.xs, 0, UrlRequester.mouseRecorder.index); // L: 3302
							System.arraycopy(UrlRequester.mouseRecorder.ys, var4, UrlRequester.mouseRecorder.ys, 0, UrlRequester.mouseRecorder.index); // L: 3303
							System.arraycopy(UrlRequester.mouseRecorder.millis, var4, UrlRequester.mouseRecorder.millis, 0, UrlRequester.mouseRecorder.index); // L: 3304
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3310
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3311
					if (var16 > 32767L) { // L: 3312
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3313
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3314
					if (var3 < 0) { // L: 3315
						var3 = 0;
					} else if (var3 > class0.canvasHeight) { // L: 3316
						var3 = class0.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3317
					if (var4 < 0) { // L: 3318
						var4 = 0;
					} else if (var4 > AttackOption.canvasWidth) { // L: 3319
						var4 = AttackOption.canvasWidth;
					}

					var5 = (int)var16; // L: 3320
					var18 = InterfaceParent.getPacketBufferNode(ClientPacket.field2586, packetWriter.isaacCipher); // L: 3321
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3322
					var18.packetBuffer.writeShort(var4); // L: 3323
					var18.packetBuffer.writeShort(var3); // L: 3324
					packetWriter.addNode(var18); // L: 3325
				}

				if (KeyHandler.field271 > 0) { // L: 3327
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2594, packetWriter.isaacCipher); // L: 3328
					var14.packetBuffer.writeShort(0); // L: 3329
					var2 = var14.packetBuffer.offset; // L: 3330
					long var19 = ClientPacket.currentTimeMillis(); // L: 3331

					for (var5 = 0; var5 < KeyHandler.field271; ++var5) { // L: 3332
						long var21 = var19 - field850; // L: 3333
						if (var21 > 16777215L) { // L: 3334
							var21 = 16777215L;
						}

						field850 = var19; // L: 3335
						var14.packetBuffer.method6660((int)var21); // L: 3336
						var14.packetBuffer.method6639(KeyHandler.field257[var5]); // L: 3337
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3339
					packetWriter.addNode(var14); // L: 3340
				}

				if (field706 > 0) { // L: 3342
					--field706;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3343
					field707 = true;
				}

				if (field707 && field706 <= 0) { // L: 3344
					field706 = 20; // L: 3345
					field707 = false; // L: 3346
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2609, packetWriter.isaacCipher); // L: 3348
					var14.packetBuffer.writeShort(camAngleY); // L: 3349
					var14.packetBuffer.method6705(camAngleX); // L: 3350
					packetWriter.addNode(var14); // L: 3351
				}

				if (class397.hasFocus && !hadFocus) { // L: 3353
					hadFocus = true; // L: 3354
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2581, packetWriter.isaacCipher); // L: 3356
					var14.packetBuffer.writeByte(1); // L: 3357
					packetWriter.addNode(var14); // L: 3358
				}

				if (!class397.hasFocus && hadFocus) { // L: 3360
					hadFocus = false; // L: 3361
					var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2581, packetWriter.isaacCipher); // L: 3363
					var14.packetBuffer.writeByte(0); // L: 3364
					packetWriter.addNode(var14); // L: 3365
				}

				if (class80.worldMap != null) { // L: 3368
					class80.worldMap.method6239();
				}

				BuddyRankComparator.method2579(); // L: 3369
				if (class170.field2016) { // L: 3371
					CollisionMap.method3244(); // L: 3372
					class170.field2016 = false; // L: 3373
				}

				if (field853 != SoundSystem.Client_plane) { // L: 3377
					field853 = SoundSystem.Client_plane; // L: 3378
					var1 = SoundSystem.Client_plane; // L: 3379
					int[] var36 = class69.sceneMinimapSprite.pixels; // L: 3381
					var3 = var36.length; // L: 3382

					for (var4 = 0; var4 < var3; ++var4) { // L: 3383
						var36[var4] = 0;
					}

					for (var4 = 1; var4 < 103; ++var4) { // L: 3384
						var5 = (103 - var4) * 2048 + 24628; // L: 3385

						for (var6 = 1; var6 < 103; ++var6) { // L: 3386
							if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) { // L: 3387
								DevicePcmPlayerProvider.scene.drawTileMinimap(var36, var5, 512, var1, var6, var4);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) { // L: 3388
								DevicePcmPlayerProvider.scene.drawTileMinimap(var36, var5, 512, var1 + 1, var6, var4);
							}

							var5 += 4; // L: 3389
						}
					}

					var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3392
					var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3393
					class69.sceneMinimapSprite.setRaster(); // L: 3394

					for (var6 = 1; var6 < 103; ++var6) { // L: 3395
						for (var7 = 1; var7 < 103; ++var7) { // L: 3396
							if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) { // L: 3397
								WorldMapIcon_0.drawObject(var1, var7, var6, var4, var5);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) { // L: 3398
								WorldMapIcon_0.drawObject(var1 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0; // L: 3401

					for (var6 = 0; var6 < 104; ++var6) { // L: 3402
						for (var7 = 0; var7 < 104; ++var7) { // L: 3403
							long var23 = DevicePcmPlayerProvider.scene.getFloorDecorationTag(SoundSystem.Client_plane, var6, var7); // L: 3404
							if (0L != var23) { // L: 3405
								var10 = Message.Entity_unpackID(var23); // L: 3406
								var11 = Tiles.getObjectDefinition(var10).mapIconId; // L: 3407
								if (var11 >= 0 && Archive.WorldMapElement_get(var11).field1567) { // L: 3408 3409
									mapIcons[mapIconCount] = Archive.WorldMapElement_get(var11).getSpriteBool(false); // L: 3412
									mapIconXs[mapIconCount] = var6; // L: 3413
									mapIconYs[mapIconCount] = var7; // L: 3414
									++mapIconCount; // L: 3415
								}
							}
						}
					}

					AbstractWorldMapData.rasterProvider.apply(); // L: 3420
				}

				if (gameState == 30) { // L: 3424
					class17.method261(); // L: 3425

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3427
						var10002 = queuedSoundEffectDelays[var1]--; // L: 3428
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 3429
							SoundEffect var37 = soundEffects[var1]; // L: 3441
							if (var37 == null) { // L: 3442
								var10000 = null; // L: 3443
								var37 = SoundEffect.readSoundEffect(class26.archive4, soundEffectIds[var1], 0);
								if (var37 == null) { // L: 3444
									continue;
								}

								int[] var47 = queuedSoundEffectDelays; // L: 3445
								var47[var1] += var37.calculateDelay();
								soundEffects[var1] = var37; // L: 3446
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 3452
								if (soundLocations[var1] != 0) { // L: 3454
									var4 = (soundLocations[var1] & 255) * 128; // L: 3455
									var5 = soundLocations[var1] >> 16 & 255; // L: 3456
									var6 = var5 * 128 + 64 - class262.localPlayer.x; // L: 3457
									if (var6 < 0) { // L: 3458
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255; // L: 3459
									var8 = var7 * 128 + 64 - class262.localPlayer.y; // L: 3460
									if (var8 < 0) { // L: 3461
										var8 = -var8;
									}

									var9 = var8 + var6 - 128; // L: 3462
									if (var9 > var4) { // L: 3463
										queuedSoundEffectDelays[var1] = -100; // L: 3464
										continue; // L: 3465
									}

									if (var9 < 0) { // L: 3467
										var9 = 0;
									}

									var3 = (var4 - var9) * class4.clientPreferences.areaSoundEffectsVolume / var4; // L: 3468
								} else {
									var3 = class4.clientPreferences.soundEffectsVolume; // L: 3470
								}

								if (var3 > 0) { // L: 3471
									RawSound var25 = var37.toRawSound().resample(WorldMapAreaData.decimator); // L: 3472
									RawPcmStream var26 = RawPcmStream.createRawPcmStream(var25, 100, var3); // L: 3473
									var26.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3474
									UserComparator7.pcmStreamMixer.addSubStream(var26); // L: 3475
								}

								queuedSoundEffectDelays[var1] = -100; // L: 3477
							}
						} else {
							--soundEffectCount; // L: 3430

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 3431
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 3432
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 3433
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 3434
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 3435
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 3436
							}

							--var1; // L: 3438
						}
					}

					if (field862 && !ApproximateRouteStrategy.method1269()) { // L: 3480
						if (class4.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) { // L: 3481
							class105.method2357(DynamicObject.archive6, currentTrackGroupId, 0, class4.clientPreferences.musicVolume, false);
						}

						field862 = false; // L: 3482
					}

					++packetWriter.field1408; // L: 3485
					if (packetWriter.field1408 > 750) { // L: 3486
						ApproximateRouteStrategy.method1268(); // L: 3487
					} else {
						WorldMapLabelSize.method3274(); // L: 3490

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3492
							var2 = npcIndices[var1]; // L: 3493
							NPC var27 = npcs[var2]; // L: 3494
							if (var27 != null) { // L: 3495
								World.updateActorSequence(var27, var27.definition.size); // L: 3496
							}
						}

						WorldMapManager.method3557(); // L: 3500
						++field683; // L: 3501
						if (mouseCrossColor != 0) { // L: 3502
							mouseCrossState += 20; // L: 3503
							if (mouseCrossState >= 400) { // L: 3504
								mouseCrossColor = 0;
							}
						}

						if (Login.field1034 != null) { // L: 3506
							++field869; // L: 3507
							if (field869 >= 15) { // L: 3508
								Script.invalidateWidget(Login.field1034); // L: 3509
								Login.field1034 = null; // L: 3510
							}
						}

						Widget var35 = MusicPatchNode.mousedOverWidgetIf1; // L: 3513
						Widget var38 = class5.field42; // L: 3514
						MusicPatchNode.mousedOverWidgetIf1 = null; // L: 3515
						class5.field42 = null; // L: 3516
						draggedOnWidget = null; // L: 3517
						field731 = false; // L: 3518
						field821 = false; // L: 3519
						field847 = 0; // L: 3520

						while (SecureRandomCallable.isKeyDown() && field847 < 128) { // L: 3521
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && SoundCache.field446 == 66) { // L: 3522
								String var41 = ""; // L: 3525

								Message var39;
								for (Iterator var43 = Messages.Messages_hashTable.iterator(); var43.hasNext(); var41 = var41 + var39.sender + ':' + var39.text + '\n') { // L: 3526 3529
									var39 = (Message)var43.next(); // L: 3527
								}

								class1.client.clipboardSetString(var41); // L: 3535
							} else if (oculusOrbState != 1 || Timer.field3780 <= 0) { // L: 3538
								field786[field847] = SoundCache.field446; // L: 3541
								field848[field847] = Timer.field3780; // L: 3542
								++field847; // L: 3543
							}
						}

						boolean var32 = staffModLevel >= 2; // L: 3547
						PacketBufferNode var28;
						if (var32 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3549
							var4 = class262.localPlayer.plane - mouseWheelRotation; // L: 3550
							if (var4 < 0) { // L: 3551
								var4 = 0;
							} else if (var4 > 3) { // L: 3552
								var4 = 3;
							}

							if (var4 != class262.localPlayer.plane) { // L: 3553
								var5 = class262.localPlayer.pathX[0] + class15.baseX; // L: 3554
								var6 = class262.localPlayer.pathY[0] + WorldMapSprite.baseY; // L: 3555
								var28 = InterfaceParent.getPacketBufferNode(ClientPacket.field2596, packetWriter.isaacCipher); // L: 3558
								var28.packetBuffer.writeShort(var5); // L: 3559
								var28.packetBuffer.method6659(0); // L: 3560
								var28.packetBuffer.method6640(var4); // L: 3561
								var28.packetBuffer.method6648(var6); // L: 3562
								packetWriter.addNode(var28); // L: 3563
							}

							mouseWheelRotation = 0; // L: 3566
						}

						if (rootInterface != -1) { // L: 3568
							PacketWriter.updateRootInterface(rootInterface, 0, 0, AttackOption.canvasWidth, class0.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3569

						while (true) {
							Widget var40;
							ScriptEvent var42;
							Widget var44;
							do {
								var42 = (ScriptEvent)field812.removeLast(); // L: 3571
								if (var42 == null) { // L: 3572
									while (true) {
										do {
											var42 = (ScriptEvent)field860.removeLast(); // L: 3583
											if (var42 == null) { // L: 3584
												while (true) {
													do {
														var42 = (ScriptEvent)scriptEvents.removeLast(); // L: 3595
														if (var42 == null) { // L: 3596
															this.menu(); // L: 3606
															class19.method282(); // L: 3607
															if (clickedWidget != null) { // L: 3608
																this.method1298();
															}

															if (VerticalAlignment.dragInventoryWidget != null) { // L: 3609
																Script.invalidateWidget(VerticalAlignment.dragInventoryWidget); // L: 3610
																++itemDragDuration; // L: 3611
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3612
																	if (field734) { // L: 3613
																		if (VerticalAlignment.dragInventoryWidget == UserComparator2.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3614
																			Widget var45 = VerticalAlignment.dragInventoryWidget; // L: 3615
																			byte var33 = 0; // L: 3616
																			if (field891 == 1 && var45.contentType == 206) { // L: 3617
																				var33 = 1;
																			}

																			if (var45.itemIds[dragItemSlotDestination] <= 0) { // L: 3618
																				var33 = 0;
																			}

																			var7 = class22.getWidgetFlags(var45); // L: 3620
																			boolean var34 = (var7 >> 29 & 1) != 0; // L: 3622
																			if (var34) { // L: 3624
																				var8 = dragItemSlotSource; // L: 3625
																				var9 = dragItemSlotDestination; // L: 3626
																				var45.itemIds[var9] = var45.itemIds[var8]; // L: 3627
																				var45.itemQuantities[var9] = var45.itemQuantities[var8]; // L: 3628
																				var45.itemIds[var8] = -1; // L: 3629
																				var45.itemQuantities[var8] = 0; // L: 3630
																			} else if (var33 == 1) { // L: 3632
																				var8 = dragItemSlotSource; // L: 3633
																				var9 = dragItemSlotDestination; // L: 3634

																				while (var8 != var9) { // L: 3635
																					if (var8 > var9) { // L: 3636
																						var45.swapItems(var8 - 1, var8); // L: 3637
																						--var8; // L: 3638
																					} else if (var8 < var9) { // L: 3640
																						var45.swapItems(var8 + 1, var8); // L: 3641
																						++var8; // L: 3642
																					}
																				}
																			} else {
																				var45.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3647
																			}

																			PacketBufferNode var29 = InterfaceParent.getPacketBufferNode(ClientPacket.field2635, packetWriter.isaacCipher); // L: 3650
																			var29.packetBuffer.writeIntME(VerticalAlignment.dragInventoryWidget.id); // L: 3651
																			var29.packetBuffer.writeShort(dragItemSlotDestination); // L: 3652
																			var29.packetBuffer.writeShort(dragItemSlotSource); // L: 3653
																			var29.packetBuffer.method6639(var33); // L: 3654
																			packetWriter.addNode(var29); // L: 3655
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3659
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3660
																	} else if (menuOptionsCount > 0) { // L: 3662
																		var4 = draggedWidgetX; // L: 3663
																		var5 = draggedWidgetY; // L: 3664
																		TaskHandler.method2625(class29.tempMenuAction, var4, var5); // L: 3666
																		class29.tempMenuAction = null; // L: 3667
																	}

																	field869 = 10; // L: 3671
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3672
																	VerticalAlignment.dragInventoryWidget = null; // L: 3673
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3676 3677
																	field734 = true; // L: 3678
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3683
																var4 = Scene.Scene_selectedX; // L: 3684
																var5 = Scene.Scene_selectedY; // L: 3685
																var18 = InterfaceParent.getPacketBufferNode(ClientPacket.field2670, packetWriter.isaacCipher); // L: 3687
																var18.packetBuffer.writeByte(5); // L: 3688
																var18.packetBuffer.writeShort(var5 + WorldMapSprite.baseY); // L: 3689
																var18.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3690
																var18.packetBuffer.method6649(var4 + class15.baseX); // L: 3691
																packetWriter.addNode(var18); // L: 3692
																Scene.method4069(); // L: 3693
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3694
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3695
																mouseCrossColor = 1; // L: 3696
																mouseCrossState = 0; // L: 3697
																destinationX = var4; // L: 3698
																destinationY = var5; // L: 3699
															}

															if (var35 != MusicPatchNode.mousedOverWidgetIf1) { // L: 3701
																if (var35 != null) { // L: 3702
																	Script.invalidateWidget(var35);
																}

																if (MusicPatchNode.mousedOverWidgetIf1 != null) { // L: 3703
																	Script.invalidateWidget(MusicPatchNode.mousedOverWidgetIf1);
																}
															}

															if (var38 != class5.field42 && field693 == field773) { // L: 3705
																if (var38 != null) { // L: 3706
																	Script.invalidateWidget(var38);
																}

																if (class5.field42 != null) { // L: 3707
																	Script.invalidateWidget(class5.field42);
																}
															}

															if (class5.field42 != null) { // L: 3709
																if (field773 < field693) { // L: 3710
																	++field773; // L: 3711
																	if (field773 == field693) { // L: 3712
																		Script.invalidateWidget(class5.field42);
																	}
																}
															} else if (field773 > 0) { // L: 3715
																--field773;
															}

															Varps.method4783(); // L: 3716
															if (isCameraLocked) { // L: 3717
																Coord.method4790();
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 3718
																var10002 = field875[var4]++;
															}

															class20.varcs.tryWrite(); // L: 3719
															var4 = ClanSettings.method200(); // L: 3720
															var5 = KeyHandler.KeyHandler_idleCycles; // L: 3723
															if (var4 > 15000 && var5 > 15000) { // L: 3726
																logoutTimer = 250; // L: 3727
																MouseHandler.MouseHandler_idleCycles = 14500; // L: 3729
																var28 = InterfaceParent.getPacketBufferNode(ClientPacket.field2644, packetWriter.isaacCipher); // L: 3732
																packetWriter.addNode(var28); // L: 3733
															}

															DevicePcmPlayerProvider.friendSystem.processFriendUpdates(); // L: 3735
															++packetWriter.pendingWrites; // L: 3736
															if (packetWriter.pendingWrites > 50) { // L: 3737
																var28 = InterfaceParent.getPacketBufferNode(ClientPacket.field2647, packetWriter.isaacCipher); // L: 3739
																packetWriter.addNode(var28); // L: 3740
															}

															try {
																packetWriter.flush(); // L: 3743
															} catch (IOException var30) { // L: 3745
																ApproximateRouteStrategy.method1268(); // L: 3746
															}

															return; // L: 3748
														}

														var44 = var42.widget; // L: 3597
														if (var44.childIndex < 0) { // L: 3598
															break;
														}

														var40 = WorldMapData_1.getWidget(var44.parentId); // L: 3599
													} while(var40 == null || var40.children == null || var44.childIndex >= var40.children.length || var44 != var40.children[var44.childIndex]); // L: 3600

													WorldMapSection1.runScriptEvent(var42); // L: 3604
												}
											}

											var44 = var42.widget; // L: 3585
											if (var44.childIndex < 0) { // L: 3586
												break;
											}

											var40 = WorldMapData_1.getWidget(var44.parentId); // L: 3587
										} while(var40 == null || var40.children == null || var44.childIndex >= var40.children.length || var44 != var40.children[var44.childIndex]); // L: 3588

										WorldMapSection1.runScriptEvent(var42); // L: 3592
									}
								}

								var44 = var42.widget; // L: 3573
								if (var44.childIndex < 0) { // L: 3574
									break;
								}

								var40 = WorldMapData_1.getWidget(var44.parentId); // L: 3575
							} while(var40 == null || var40.children == null || var44.childIndex >= var40.children.length || var44 != var40.children[var44.childIndex]); // L: 3576

							WorldMapSection1.runScriptEvent(var42); // L: 3580
						}
					}
				}
			}
		}
	} // L: 3195 3488

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1382818150"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = AttackOption.canvasWidth; // L: 4426
		int var2 = class0.canvasHeight; // L: 4427
		if (super.contentWidth < var1) { // L: 4428
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4429
			var2 = super.contentHeight;
		}

		if (class4.clientPreferences != null) { // L: 4430
			try {
				Client var3 = class1.client; // L: 4432
				Object[] var4 = new Object[]{class302.getWindowedMode()}; // L: 4433
				JSObject.getWindow(var3).call("resize", var4); // L: 4436
			} catch (Throwable var5) { // L: 4439
			}
		}

	} // L: 4441

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4444
			class25.method330(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4445
			if (field831[var1]) { // L: 4446
				field712[var1] = true;
			}

			field833[var1] = field831[var1]; // L: 4447
			field831[var1] = false; // L: 4448
		}

		field830 = cycle; // L: 4450
		viewportX = -1; // L: 4451
		viewportY = -1; // L: 4452
		UserComparator2.hoveredItemContainer = null; // L: 4453
		if (rootInterface != -1) { // L: 4454
			rootWidgetCount = 0; // L: 4455
			SoundSystem.drawWidgets(rootInterface, 0, 0, AttackOption.canvasWidth, class0.canvasHeight, 0, 0, -1); // L: 4456
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4458
		if (showMouseCross) { // L: 4459
			if (mouseCrossColor == 1) { // L: 4460
				NPCComposition.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4461
			}

			if (mouseCrossColor == 2) { // L: 4463
				NPCComposition.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4464
			}
		}

		if (!isMenuOpen) { // L: 4467
			if (viewportX != -1) { // L: 4468
				class15.method241(viewportX, viewportY);
			}
		} else {
			var1 = StructComposition.menuX; // L: 4471
			int var2 = class143.menuY; // L: 4472
			int var3 = UserComparator3.menuWidth; // L: 4473
			int var4 = PendingSpawn.menuHeight; // L: 4474
			int var5 = 6116423; // L: 4475
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4476
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4477
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4478
			class309.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4479
			int var6 = MouseHandler.MouseHandler_x; // L: 4480
			int var7 = MouseHandler.MouseHandler_y; // L: 4481

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4482
				int var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31; // L: 4483
				int var10 = 16777215; // L: 4484
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4485
					var10 = 16776960;
				}

				class309.fontBold12.draw(class0.method1(var8), var1 + 3, var9, var10, 0); // L: 4486
			}

			ReflectionCheck.method1229(StructComposition.menuX, class143.menuY, UserComparator3.menuWidth, PendingSpawn.menuHeight); // L: 4488
		}

		if (gameDrawingMode == 3) { // L: 4490
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4491
				if (field833[var1]) { // L: 4492
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4493
				} else if (field712[var1]) { // L: 4495
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4496
				}
			}
		}

		UrlRequest.method2519(SoundSystem.Client_plane, class262.localPlayer.x, class262.localPlayer.y, field683); // L: 4500
		field683 = 0; // L: 4501
	} // L: 4502

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Ldq;I)Z",
		garbageValue = "-372201617"
	)
	final boolean method1655(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5859
		PacketBuffer var3 = var1.packetBuffer; // L: 5860
		if (var2 == null) { // L: 5861
			return false;
		} else {
			int var6;
			String var26;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5863
					if (var1.field1412) { // L: 5864
						if (!var2.isAvailable(1)) { // L: 5865
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5866
						var1.field1408 = 0; // L: 5867
						var1.field1412 = false; // L: 5868
					}

					var3.offset = 0; // L: 5870
					if (var3.method6569()) { // L: 5871
						if (!var2.isAvailable(1)) { // L: 5872
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5873
						var1.field1408 = 0; // L: 5874
					}

					var1.field1412 = true; // L: 5876
					ServerPacket[] var4 = WorldMapIcon_0.ServerPacket_values(); // L: 5877
					var5 = var3.readSmartByteShortIsaac(); // L: 5878
					if (var5 < 0 || var5 >= var4.length) { // L: 5879
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5880
					var1.serverPacketLength = var1.serverPacket.length; // L: 5881
				}

				if (var1.serverPacketLength == -1) { // L: 5883
					if (!var2.isAvailable(1)) { // L: 5884
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5885
					var1.serverPacketLength = var3.array[0] & 255; // L: 5886
				}

				if (var1.serverPacketLength == -2) { // L: 5888
					if (!var2.isAvailable(2)) { // L: 5889
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5890
					var3.offset = 0; // L: 5891
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5892
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5894
					return false;
				}

				var3.offset = 0; // L: 5895
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5896
				var1.field1408 = 0; // L: 5897
				timer.method5690(); // L: 5898
				var1.field1399 = var1.field1411; // L: 5899
				var1.field1411 = var1.field1410; // L: 5900
				var1.field1410 = var1.serverPacket; // L: 5901
				if (ServerPacket.field2776 == var1.serverPacket) { // L: 5902
					DevicePcmPlayerProvider.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 5903
					field817 = cycleCntr; // L: 5904
					var1.serverPacket = null; // L: 5905
					return true; // L: 5906
				}

				if (ServerPacket.field2704 == var1.serverPacket) { // L: 5908
					if (rootInterface != -1) { // L: 5909
						class8.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 5910
					return true; // L: 5911
				}

				int var7;
				int var17;
				if (ServerPacket.field2774 == var1.serverPacket) { // L: 5913
					WorldMapID.method3717(); // L: 5914
					var17 = var3.method6725(); // L: 5915
					var5 = var3.readUnsignedByte(); // L: 5916
					var6 = var3.method6642(); // L: 5917
					experience[var6] = var17; // L: 5918
					currentLevels[var6] = var5; // L: 5919
					levels[var6] = 1; // L: 5920

					for (var7 = 0; var7 < 98; ++var7) { // L: 5921
						if (var17 >= Skills.Skills_experienceTable[var7]) {
							levels[var6] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6; // L: 5922
					var1.serverPacket = null; // L: 5923
					return true; // L: 5924
				}

				long var18;
				long var20;
				String var22;
				String var48;
				int var54;
				if (ServerPacket.field2732 == var1.serverPacket) { // L: 5926
					var48 = var3.readStringCp1252NullTerminated(); // L: 5927
					var18 = (long)var3.readUnsignedShort(); // L: 5928
					var20 = (long)var3.readMedium(); // L: 5929
					PlayerType var9 = (PlayerType)Clock.findEnumerated(class106.PlayerType_values(), var3.readUnsignedByte()); // L: 5930
					long var10 = (var18 << 32) + var20; // L: 5931
					boolean var12 = false; // L: 5932

					for (var54 = 0; var54 < 100; ++var54) { // L: 5933
						if (var10 == crossWorldMessageIds[var54]) { // L: 5934
							var12 = true; // L: 5935
							break; // L: 5936
						}
					}

					if (DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var48, LoginScreenAnimation.loginType))) { // L: 5939
						var12 = true;
					}

					if (!var12 && field629 == 0) { // L: 5940
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var10; // L: 5941
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 5942
						var22 = AbstractFont.escapeBrackets(GrandExchangeEvents.method5182(WorldMapIcon_1.method3304(var3))); // L: 5943
						byte var56;
						if (var9.isPrivileged) { // L: 5945
							var56 = 7;
						} else {
							var56 = 3; // L: 5946
						}

						if (var9.modIcon != -1) { // L: 5947
							UserComparator10.addGameMessage(var56, MusicPatchPcmStream.method4743(var9.modIcon) + var48, var22);
						} else {
							UserComparator10.addGameMessage(var56, var48, var22); // L: 5948
						}
					}

					var1.serverPacket = null; // L: 5950
					return true; // L: 5951
				}

				if (ServerPacket.field2718 == var1.serverPacket) { // L: 5953
					UrlRequest.method2511(class226.field2686); // L: 5954
					var1.serverPacket = null; // L: 5955
					return true; // L: 5956
				}

				if (ServerPacket.field2758 == var1.serverPacket) { // L: 5958
					class10.field74 = new class340(class26.HitSplatDefinition_cachedSprites); // L: 5959
					var1.serverPacket = null; // L: 5960
					return true; // L: 5961
				}

				int var8;
				long var23;
				if (ServerPacket.field2736 == var1.serverPacket) { // L: 5963
					var17 = var3.readUnsignedShort(); // L: 5964
					if (var17 == 65535) { // L: 5965
						var17 = -1;
					}

					var5 = var3.readInt(); // L: 5966
					var6 = var3.method6725(); // L: 5967
					var7 = var3.method6653(); // L: 5968
					if (var7 == 65535) { // L: 5969
						var7 = -1;
					}

					for (var8 = var17; var8 <= var7; ++var8) { // L: 5970
						var23 = ((long)var5 << 32) + (long)var8; // L: 5971
						Node var53 = widgetFlags.get(var23); // L: 5972
						if (var53 != null) { // L: 5973
							var53.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var23); // L: 5974
					}

					var1.serverPacket = null; // L: 5976
					return true; // L: 5977
				}

				if (ServerPacket.field2766 == var1.serverPacket) { // L: 5979
					var3.offset += 28; // L: 5980
					if (var3.checkCrc()) { // L: 5981
						WorldMapRectangle.method3709(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 5982
					return true; // L: 5983
				}

				if (ServerPacket.field2724 == var1.serverPacket) { // L: 5985
					var17 = var3.readInt(); // L: 5986
					var5 = var3.readInt(); // L: 5987
					var6 = class29.getGcDuration(); // L: 5988
					PacketBufferNode var61 = InterfaceParent.getPacketBufferNode(ClientPacket.field2576, packetWriter.isaacCipher); // L: 5990
					var61.packetBuffer.method6641(GameEngine.fps); // L: 5991
					var61.packetBuffer.method6659(var17); // L: 5992
					var61.packetBuffer.method6658(var5); // L: 5993
					var61.packetBuffer.writeByte(var6); // L: 5994
					packetWriter.addNode(var61); // L: 5995
					var1.serverPacket = null; // L: 5996
					return true; // L: 5997
				}

				if (ServerPacket.field2705 == var1.serverPacket) { // L: 5999
					isCameraLocked = false; // L: 6000

					for (var17 = 0; var17 < 5; ++var17) { // L: 6001
						field871[var17] = false;
					}

					var1.serverPacket = null; // L: 6002
					return true; // L: 6003
				}

				Widget var68;
				if (ServerPacket.field2708 == var1.serverPacket) { // L: 6005
					var17 = var3.method6662(); // L: 6006
					var68 = WorldMapData_1.getWidget(var17); // L: 6007
					var68.modelType = 3; // L: 6008
					var68.modelId = class262.localPlayer.appearance.getChatHeadId(); // L: 6009
					Script.invalidateWidget(var68); // L: 6010
					var1.serverPacket = null; // L: 6011
					return true; // L: 6012
				}

				if (ServerPacket.field2771 == var1.serverPacket) { // L: 6014
					var17 = var3.readUnsignedByte(); // L: 6015
					var5 = var3.readUnsignedByte(); // L: 6016
					var6 = var3.readUnsignedByte(); // L: 6017
					var7 = var3.readUnsignedByte(); // L: 6018
					field871[var17] = true; // L: 6019
					field872[var17] = var5; // L: 6020
					field873[var17] = var6; // L: 6021
					field867[var17] = var7; // L: 6022
					field875[var17] = 0; // L: 6023
					var1.serverPacket = null; // L: 6024
					return true; // L: 6025
				}

				if (ServerPacket.field2765 == var1.serverPacket) { // L: 6027
					var48 = var3.readStringCp1252NullTerminated(); // L: 6028
					Object[] var72 = new Object[var48.length() + 1]; // L: 6029

					for (var6 = var48.length() - 1; var6 >= 0; --var6) { // L: 6030
						if (var48.charAt(var6) == 's') { // L: 6031
							var72[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var6 + 1] = new Integer(var3.readInt()); // L: 6032
						}
					}

					var72[0] = new Integer(var3.readInt()); // L: 6034
					ScriptEvent var79 = new ScriptEvent(); // L: 6035
					var79.args = var72; // L: 6036
					WorldMapSection1.runScriptEvent(var79); // L: 6037
					var1.serverPacket = null; // L: 6038
					return true; // L: 6039
				}

				if (ServerPacket.field2779 == var1.serverPacket) { // L: 6041
					var48 = var3.readStringCp1252NullTerminated(); // L: 6042
					var26 = AbstractFont.escapeBrackets(GrandExchangeEvents.method5182(WorldMapIcon_1.method3304(var3))); // L: 6043
					UserComparator10.addGameMessage(6, var48, var26); // L: 6044
					var1.serverPacket = null; // L: 6045
					return true; // L: 6046
				}

				byte var58;
				if (ServerPacket.field2795 == var1.serverPacket) { // L: 6048
					SecureRandomFuture.method2085(); // L: 6049
					var58 = var3.readByte(); // L: 6050
					if (var1.serverPacketLength == 1) { // L: 6051
						if (var58 >= 0) { // L: 6052
							currentClanSettings[var58] = null;
						} else {
							WorldMapManager.guestClanSettings = null; // L: 6053
						}

						var1.serverPacket = null; // L: 6054
						return true; // L: 6055
					}

					if (var58 >= 0) { // L: 6057
						currentClanSettings[var58] = new ClanSettings(var3); // L: 6058
					} else {
						WorldMapManager.guestClanSettings = new ClanSettings(var3); // L: 6061
					}

					var1.serverPacket = null; // L: 6063
					return true; // L: 6064
				}

				if (ServerPacket.field2753 == var1.serverPacket) { // L: 6066
					var17 = var3.readUnsignedByte(); // L: 6067
					if (var3.readUnsignedByte() == 0) { // L: 6068
						grandExchangeOffers[var17] = new GrandExchangeOffer(); // L: 6069
						var3.offset += 18; // L: 6070
					} else {
						--var3.offset; // L: 6073
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false); // L: 6074
					}

					field827 = cycleCntr; // L: 6076
					var1.serverPacket = null; // L: 6077
					return true; // L: 6078
				}

				if (ServerPacket.field2709 == var1.serverPacket) { // L: 6080
					WorldMapID.method3717(); // L: 6081
					weight = var3.readShort(); // L: 6082
					field823 = cycleCntr; // L: 6083
					var1.serverPacket = null; // L: 6084
					return true; // L: 6085
				}

				if (ServerPacket.field2762 == var1.serverPacket) { // L: 6087
					UrlRequest.method2511(class226.field2687); // L: 6088
					var1.serverPacket = null; // L: 6089
					return true; // L: 6090
				}

				if (ServerPacket.field2722 == var1.serverPacket) { // L: 6092
					class16.updateNpcs(true, var3); // L: 6093
					var1.serverPacket = null; // L: 6094
					return true; // L: 6095
				}

				Widget var59;
				if (ServerPacket.field2799 == var1.serverPacket) { // L: 6097
					var17 = var3.method6653(); // L: 6098
					if (var17 == 65535) { // L: 6099
						var17 = -1;
					}

					var5 = var3.method6662(); // L: 6100
					var6 = var3.method6725(); // L: 6101
					var59 = WorldMapData_1.getWidget(var5); // L: 6102
					ItemComposition var71;
					if (!var59.isIf3) { // L: 6103
						if (var17 == -1) { // L: 6104
							var59.modelType = 0; // L: 6105
							var1.serverPacket = null; // L: 6106
							return true; // L: 6107
						}

						var71 = class250.ItemDefinition_get(var17); // L: 6109
						var59.modelType = 4; // L: 6110
						var59.modelId = var17; // L: 6111
						var59.modelAngleX = var71.xan2d; // L: 6112
						var59.modelAngleY = var71.yan2d; // L: 6113
						var59.modelZoom = var71.zoom2d * 100 / var6; // L: 6114
						Script.invalidateWidget(var59); // L: 6115
					} else {
						var59.itemId = var17; // L: 6118
						var59.itemQuantity = var6; // L: 6119
						var71 = class250.ItemDefinition_get(var17); // L: 6120
						var59.modelAngleX = var71.xan2d; // L: 6121
						var59.modelAngleY = var71.yan2d; // L: 6122
						var59.modelAngleZ = var71.zan2d; // L: 6123
						var59.modelOffsetX = var71.offsetX2d; // L: 6124
						var59.modelOffsetY = var71.offsetY2d; // L: 6125
						var59.modelZoom = var71.zoom2d; // L: 6126
						if (var71.isStackable == 1) { // L: 6127
							var59.itemQuantityMode = 1;
						} else {
							var59.itemQuantityMode = 2; // L: 6128
						}

						if (var59.field3011 > 0) { // L: 6129
							var59.modelZoom = var59.modelZoom * 32 / var59.field3011;
						} else if (var59.rawWidth > 0) { // L: 6130
							var59.modelZoom = var59.modelZoom * 32 / var59.rawWidth;
						}

						Script.invalidateWidget(var59); // L: 6131
					}

					var1.serverPacket = null; // L: 6133
					return true; // L: 6134
				}

				if (ServerPacket.field2750 == var1.serverPacket) { // L: 6136
					SecureRandomFuture.method2085(); // L: 6137
					var58 = var3.readByte(); // L: 6138
					class2 var70 = new class2(var3); // L: 6139
					ClanSettings var78;
					if (var58 >= 0) { // L: 6141
						var78 = currentClanSettings[var58];
					} else {
						var78 = WorldMapManager.guestClanSettings; // L: 6142
					}

					var70.method24(var78); // L: 6143
					var1.serverPacket = null; // L: 6144
					return true; // L: 6145
				}

				boolean var63;
				if (ServerPacket.field2707 == var1.serverPacket) { // L: 6147
					var63 = var3.readUnsignedByte() == 1; // L: 6148
					if (var63) { // L: 6149
						WorldMapEvent.field2150 = ClientPacket.currentTimeMillis() - var3.readLong(); // L: 6150
						class267.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6151
					} else {
						class267.grandExchangeEvents = null; // L: 6153
					}

					field822 = cycleCntr; // L: 6154
					var1.serverPacket = null; // L: 6155
					return true; // L: 6156
				}

				if (ServerPacket.field2759 == var1.serverPacket) { // L: 6158
					isCameraLocked = true; // L: 6159
					SoundCache.field448 = var3.readUnsignedByte(); // L: 6160
					AttackOption.field1351 = var3.readUnsignedByte(); // L: 6161
					field659 = var3.readUnsignedShort(); // L: 6162
					Message.field602 = var3.readUnsignedByte(); // L: 6163
					FloorUnderlayDefinition.field1707 = var3.readUnsignedByte(); // L: 6164
					if (FloorUnderlayDefinition.field1707 >= 100) { // L: 6165
						ObjectSound.cameraX = SoundCache.field448 * 128 + 64; // L: 6166
						Canvas.cameraZ = AttackOption.field1351 * 128 + 64; // L: 6167
						class160.cameraY = ItemContainer.getTileHeight(ObjectSound.cameraX, Canvas.cameraZ, SoundSystem.Client_plane) - field659; // L: 6168
					}

					var1.serverPacket = null; // L: 6170
					return true; // L: 6171
				}

				if (ServerPacket.field2706 == var1.serverPacket) { // L: 6173
					UrlRequest.method2511(class226.field2693); // L: 6174
					var1.serverPacket = null; // L: 6175
					return true; // L: 6176
				}

				if (ServerPacket.field2746 == var1.serverPacket) { // L: 6178
					UrlRequest.method2511(class226.field2689); // L: 6179
					var1.serverPacket = null; // L: 6180
					return true; // L: 6181
				}

				if (ServerPacket.field2740 == var1.serverPacket) { // L: 6183
					World var50 = new World(); // L: 6184
					var50.host = var3.readStringCp1252NullTerminated(); // L: 6185
					var50.id = var3.readUnsignedShort(); // L: 6186
					var5 = var3.readInt(); // L: 6187
					var50.properties = var5; // L: 6188
					Projectile.updateGameState(45); // L: 6189
					var2.close(); // L: 6190
					var2 = null; // L: 6191
					GrandExchangeOfferAgeComparator.changeWorld(var50); // L: 6192
					var1.serverPacket = null; // L: 6193
					return false; // L: 6194
				}

				if (ServerPacket.field2792 == var1.serverPacket) { // L: 6196
					var17 = var3.readInt(); // L: 6197
					var5 = var3.method6757(); // L: 6198
					var6 = var3.method6654(); // L: 6199
					var59 = WorldMapData_1.getWidget(var17); // L: 6200
					if (var5 != var59.rawX || var6 != var59.rawY || var59.xAlignment != 0 || var59.yAlignment != 0) { // L: 6201
						var59.rawX = var5; // L: 6202
						var59.rawY = var6; // L: 6203
						var59.xAlignment = 0; // L: 6204
						var59.yAlignment = 0; // L: 6205
						Script.invalidateWidget(var59); // L: 6206
						this.alignWidget(var59); // L: 6207
						if (var59.type == 0) { // L: 6208
							WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var17 >> 16], var59, false);
						}
					}

					var1.serverPacket = null; // L: 6210
					return true; // L: 6211
				}

				if (ServerPacket.field2777 == var1.serverPacket) { // L: 6213
					UrlRequest.method2511(class226.field2690); // L: 6214
					var1.serverPacket = null; // L: 6215
					return true; // L: 6216
				}

				int var29;
				int var30;
				if (ServerPacket.field2743 == var1.serverPacket) { // L: 6218
					isCameraLocked = true; // L: 6219
					WorldMapIcon_0.field2029 = var3.readUnsignedByte(); // L: 6220
					class44.field315 = var3.readUnsignedByte(); // L: 6221
					FriendsChat.field3815 = var3.readUnsignedShort(); // L: 6222
					GrandExchangeOfferOwnWorldComparator.field607 = var3.readUnsignedByte(); // L: 6223
					class20.field166 = var3.readUnsignedByte(); // L: 6224
					if (class20.field166 >= 100) { // L: 6225
						var17 = WorldMapIcon_0.field2029 * 128 + 64; // L: 6226
						var5 = class44.field315 * 128 + 64; // L: 6227
						var6 = ItemContainer.getTileHeight(var17, var5, SoundSystem.Client_plane) - FriendsChat.field3815; // L: 6228
						var7 = var17 - ObjectSound.cameraX; // L: 6229
						var8 = var6 - class160.cameraY; // L: 6230
						var29 = var5 - Canvas.cameraZ; // L: 6231
						var30 = (int)Math.sqrt((double)(var7 * var7 + var29 * var29)); // L: 6232
						class69.cameraPitch = (int)(Math.atan2((double)var8, (double)var30) * 325.949D) & 2047; // L: 6233
						class32.cameraYaw = (int)(Math.atan2((double)var7, (double)var29) * -325.949D) & 2047; // L: 6234
						if (class69.cameraPitch < 128) { // L: 6235
							class69.cameraPitch = 128;
						}

						if (class69.cameraPitch > 383) { // L: 6236
							class69.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6238
					return true; // L: 6239
				}

				if (ServerPacket.field2726 == var1.serverPacket) { // L: 6241
					class126.readReflectionCheck(var3, var1.serverPacketLength); // L: 6242
					var1.serverPacket = null; // L: 6243
					return true; // L: 6244
				}

				if (ServerPacket.field2786 == var1.serverPacket) { // L: 6246
					PcmPlayer.logOut(); // L: 6247
					var1.serverPacket = null; // L: 6248
					return false; // L: 6249
				}

				if (ServerPacket.field2721 == var1.serverPacket) { // L: 6251
					DevicePcmPlayerProvider.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6252
					World.FriendSystem_invalidateIgnoreds(); // L: 6253
					field817 = cycleCntr; // L: 6254
					var1.serverPacket = null; // L: 6255
					return true; // L: 6256
				}

				if (ServerPacket.field2703 == var1.serverPacket) { // L: 6258
					var17 = var3.method6651(); // L: 6259
					byte var57 = var3.method6682(); // L: 6260
					Varps.Varps_temp[var17] = var57; // L: 6261
					if (Varps.Varps_main[var17] != var57) { // L: 6262
						Varps.Varps_main[var17] = var57; // L: 6263
					}

					class6.changeGameOptions(var17); // L: 6265
					changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 6266
					var1.serverPacket = null; // L: 6267
					return true; // L: 6268
				}

				if (ServerPacket.field2723 == var1.serverPacket) { // L: 6270
					var17 = var3.method6653(); // L: 6271
					var5 = var3.method6675(); // L: 6272
					Varps.Varps_temp[var17] = var5; // L: 6273
					if (Varps.Varps_main[var17] != var5) { // L: 6274
						Varps.Varps_main[var17] = var5; // L: 6275
					}

					class6.changeGameOptions(var17); // L: 6277
					changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 6278
					var1.serverPacket = null; // L: 6279
					return true; // L: 6280
				}

				InterfaceParent var25;
				if (ServerPacket.field2751 == var1.serverPacket) { // L: 6282
					var17 = var3.method6644(); // L: 6283
					var5 = var3.method6725(); // L: 6284
					var6 = var3.method6651(); // L: 6285
					var25 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6286
					if (var25 != null) { // L: 6287
						InvDefinition.closeInterface(var25, var6 != var25.group);
					}

					FriendSystem.method1867(var5, var6, var17); // L: 6288
					var1.serverPacket = null; // L: 6289
					return true; // L: 6290
				}

				if (ServerPacket.field2768 == var1.serverPacket) { // L: 6292
					var17 = var3.readUnsignedByte(); // L: 6293
					ViewportMouse.method4410(var17); // L: 6294
					var1.serverPacket = null; // L: 6295
					return true; // L: 6296
				}

				if (ServerPacket.field2757 == var1.serverPacket) { // L: 6298
					KeyHandler.loadRegions(false, var1.packetBuffer); // L: 6299
					var1.serverPacket = null; // L: 6300
					return true; // L: 6301
				}

				if (ServerPacket.field2791 == var1.serverPacket) { // L: 6303
					var17 = var3.method6662(); // L: 6304
					var68 = WorldMapData_1.getWidget(var17); // L: 6305

					for (var6 = 0; var6 < var68.itemIds.length; ++var6) { // L: 6306
						var68.itemIds[var6] = -1; // L: 6307
						var68.itemIds[var6] = 0; // L: 6308
					}

					Script.invalidateWidget(var68); // L: 6310
					var1.serverPacket = null; // L: 6311
					return true; // L: 6312
				}

				Widget var27;
				if (ServerPacket.field2775 == var1.serverPacket) { // L: 6314
					var17 = var3.method6654(); // L: 6315
					var5 = var3.method6675(); // L: 6316
					var27 = WorldMapData_1.getWidget(var5); // L: 6317
					if (var17 != var27.sequenceId || var17 == -1) { // L: 6318
						var27.sequenceId = var17; // L: 6319
						var27.modelFrame = 0; // L: 6320
						var27.modelFrameCycle = 0; // L: 6321
						Script.invalidateWidget(var27); // L: 6322
					}

					var1.serverPacket = null; // L: 6324
					return true; // L: 6325
				}

				if (ServerPacket.field2778 == var1.serverPacket) { // L: 6327
					class10.field74 = null; // L: 6328
					var1.serverPacket = null; // L: 6329
					return true; // L: 6330
				}

				if (ServerPacket.field2748 == var1.serverPacket) { // L: 6332
					var17 = var3.readUnsignedShort(); // L: 6333
					var5 = var3.readUnsignedByte(); // L: 6334
					var6 = var3.readUnsignedShort(); // L: 6335
					ClanSettings.queueSoundEffect(var17, var5, var6); // L: 6336
					var1.serverPacket = null; // L: 6337
					return true; // L: 6338
				}

				if (ServerPacket.field2783 == var1.serverPacket) { // L: 6340
					class15.field128 = var3.method6643(); // L: 6341
					WorldMapSection0.field2047 = var3.method6642(); // L: 6342
					var1.serverPacket = null; // L: 6343
					return true; // L: 6344
				}

				String var74;
				if (ServerPacket.field2710 == var1.serverPacket) { // L: 6346
					var17 = var3.method6643(); // L: 6347
					var5 = var3.readUnsignedByte(); // L: 6348
					var74 = var3.readStringCp1252NullTerminated(); // L: 6349
					if (var5 >= 1 && var5 <= 8) { // L: 6350
						if (var74.equalsIgnoreCase("null")) { // L: 6351
							var74 = null;
						}

						playerMenuActions[var5 - 1] = var74; // L: 6352
						playerOptionsPriorities[var5 - 1] = var17 == 0; // L: 6353
					}

					var1.serverPacket = null; // L: 6355
					return true; // L: 6356
				}

				if (ServerPacket.field2725 == var1.serverPacket) { // L: 6358
					hintArrowType = var3.readUnsignedByte(); // L: 6359
					if (hintArrowType == 1) { // L: 6360
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6361
						if (hintArrowType == 2) { // L: 6362
							hintArrowSubX = 64; // L: 6363
							hintArrowSubY = 64; // L: 6364
						}

						if (hintArrowType == 3) { // L: 6366
							hintArrowSubX = 0; // L: 6367
							hintArrowSubY = 64; // L: 6368
						}

						if (hintArrowType == 4) { // L: 6370
							hintArrowSubX = 128; // L: 6371
							hintArrowSubY = 64; // L: 6372
						}

						if (hintArrowType == 5) { // L: 6374
							hintArrowSubX = 64; // L: 6375
							hintArrowSubY = 0; // L: 6376
						}

						if (hintArrowType == 6) { // L: 6378
							hintArrowSubX = 64; // L: 6379
							hintArrowSubY = 128; // L: 6380
						}

						hintArrowType = 2; // L: 6382
						hintArrowX = var3.readUnsignedShort(); // L: 6383
						hintArrowY = var3.readUnsignedShort(); // L: 6384
						hintArrowHeight = var3.readUnsignedByte(); // L: 6385
					}

					if (hintArrowType == 10) { // L: 6387
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6388
					return true; // L: 6389
				}

				if (ServerPacket.field2782 == var1.serverPacket) { // L: 6391
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) { // L: 6392
						if (Varps.Varps_temp[var17] != Varps.Varps_main[var17]) { // L: 6393
							Varps.Varps_main[var17] = Varps.Varps_temp[var17]; // L: 6394
							class6.changeGameOptions(var17); // L: 6395
							changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 6396
						}
					}

					var1.serverPacket = null; // L: 6399
					return true; // L: 6400
				}

				Widget var28;
				if (ServerPacket.field2755 == var1.serverPacket) { // L: 6402
					var17 = var3.method6653(); // L: 6403
					var5 = var3.method6675(); // L: 6404
					var6 = var3.method6652(); // L: 6405
					var7 = var3.method6652(); // L: 6406
					var28 = WorldMapData_1.getWidget(var5); // L: 6407
					if (var17 != var28.modelAngleX || var6 != var28.modelAngleY || var7 != var28.modelZoom) { // L: 6408
						var28.modelAngleX = var17; // L: 6409
						var28.modelAngleY = var6; // L: 6410
						var28.modelZoom = var7; // L: 6411
						Script.invalidateWidget(var28); // L: 6412
					}

					var1.serverPacket = null; // L: 6414
					return true; // L: 6415
				}

				boolean var51;
				if (ServerPacket.field2737 == var1.serverPacket) { // L: 6417
					var17 = var3.readUShortSmart(); // L: 6418
					var51 = var3.readUnsignedByte() == 1; // L: 6419
					var74 = ""; // L: 6420
					boolean var52 = false; // L: 6421
					if (var51) { // L: 6422
						var74 = var3.readStringCp1252NullTerminated(); // L: 6423
						if (DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var74, LoginScreenAnimation.loginType))) { // L: 6424
							var52 = true;
						}
					}

					String var66 = var3.readStringCp1252NullTerminated(); // L: 6426
					if (!var52) { // L: 6427
						UserComparator10.addGameMessage(var17, var74, var66);
					}

					var1.serverPacket = null; // L: 6428
					return true; // L: 6429
				}

				if (ServerPacket.field2752 == var1.serverPacket) { // L: 6431
					field820 = cycleCntr; // L: 6432
					var58 = var3.readByte(); // L: 6433
					if (var1.serverPacketLength == 1) { // L: 6434
						if (var58 >= 0) { // L: 6435
							currentClanChannels[var58] = null;
						} else {
							AttackOption.guestClanChannel = null; // L: 6436
						}

						var1.serverPacket = null; // L: 6437
						return true; // L: 6438
					}

					if (var58 >= 0) { // L: 6440
						currentClanChannels[var58] = new ClanChannel(var3); // L: 6441
					} else {
						AttackOption.guestClanChannel = new ClanChannel(var3); // L: 6444
					}

					var1.serverPacket = null; // L: 6446
					return true; // L: 6447
				}

				if (ServerPacket.field2796 == var1.serverPacket) { // L: 6449
					var17 = var3.method6652(); // L: 6450
					var5 = var3.method6725(); // L: 6451
					var6 = var3.method6651(); // L: 6452
					var59 = WorldMapData_1.getWidget(var5); // L: 6453
					var59.field2981 = var17 + (var6 << 16); // L: 6454
					var1.serverPacket = null; // L: 6455
					return true; // L: 6456
				}

				if (ServerPacket.field2738 == var1.serverPacket) { // L: 6458
					var17 = var3.method6675(); // L: 6459
					var5 = var3.method6653(); // L: 6460
					var27 = WorldMapData_1.getWidget(var17); // L: 6461
					if (var27.modelType != 1 || var5 != var27.modelId) { // L: 6462
						var27.modelType = 1; // L: 6463
						var27.modelId = var5; // L: 6464
						Script.invalidateWidget(var27); // L: 6465
					}

					var1.serverPacket = null; // L: 6467
					return true; // L: 6468
				}

				if (ServerPacket.field2773 == var1.serverPacket) { // L: 6470
					WorldMapID.method3717(); // L: 6471
					runEnergy = var3.readUnsignedByte(); // L: 6472
					field823 = cycleCntr; // L: 6473
					var1.serverPacket = null; // L: 6474
					return true; // L: 6475
				}

				if (ServerPacket.field2767 == var1.serverPacket) { // L: 6477
					class16.updateNpcs(false, var3); // L: 6478
					var1.serverPacket = null; // L: 6479
					return true; // L: 6480
				}

				if (ServerPacket.field2789 == var1.serverPacket) { // L: 6482
					var63 = var3.readBoolean(); // L: 6483
					if (var63) { // L: 6484
						if (LoginPacket.field2800 == null) { // L: 6485
							LoginPacket.field2800 = new class286();
						}
					} else {
						LoginPacket.field2800 = null; // L: 6487
					}

					var1.serverPacket = null; // L: 6488
					return true; // L: 6489
				}

				if (ServerPacket.field2770 == var1.serverPacket) { // L: 6491
					var17 = var3.readInt(); // L: 6492
					var5 = var3.readUnsignedShort(); // L: 6493
					if (var17 < -70000) { // L: 6494
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6496
						var27 = WorldMapData_1.getWidget(var17);
					} else {
						var27 = null; // L: 6497
					}

					for (; var3.offset < var1.serverPacketLength; ByteArrayPool.itemContainerSetItem(var5, var7, var8 - 1, var29)) { // L: 6498 6512
						var7 = var3.readUShortSmart(); // L: 6499
						var8 = var3.readUnsignedShort(); // L: 6500
						var29 = 0; // L: 6501
						if (var8 != 0) { // L: 6502
							var29 = var3.readUnsignedByte(); // L: 6503
							if (var29 == 255) { // L: 6504
								var29 = var3.readInt();
							}
						}

						if (var27 != null && var7 >= 0 && var7 < var27.itemIds.length) { // L: 6506 6507
							var27.itemIds[var7] = var8; // L: 6508
							var27.itemQuantities[var7] = var29; // L: 6509
						}
					}

					if (var27 != null) { // L: 6514
						Script.invalidateWidget(var27);
					}

					WorldMapID.method3717(); // L: 6515
					changedItemContainers[++field711 - 1 & 31] = var5 & 32767; // L: 6516
					var1.serverPacket = null; // L: 6517
					return true; // L: 6518
				}

				if (ServerPacket.field2794 == var1.serverPacket) { // L: 6520
					UrlRequest.method2511(class226.field2691); // L: 6521
					var1.serverPacket = null; // L: 6522
					return true; // L: 6523
				}

				if (ServerPacket.field2745 == var1.serverPacket) { // L: 6525
					var17 = var3.method6662(); // L: 6526
					var5 = var3.method6652(); // L: 6527
					var27 = WorldMapData_1.getWidget(var17); // L: 6528
					if (var27 != null && var27.type == 0) { // L: 6529
						if (var5 > var27.scrollHeight - var27.height) { // L: 6530
							var5 = var27.scrollHeight - var27.height;
						}

						if (var5 < 0) { // L: 6531
							var5 = 0;
						}

						if (var5 != var27.scrollY) { // L: 6532
							var27.scrollY = var5; // L: 6533
							Script.invalidateWidget(var27); // L: 6534
						}
					}

					var1.serverPacket = null; // L: 6537
					return true; // L: 6538
				}

				if (ServerPacket.field2760 == var1.serverPacket) { // L: 6540
					DevicePcmPlayerProvider.friendSystem.method1817(); // L: 6541
					field817 = cycleCntr; // L: 6542
					var1.serverPacket = null; // L: 6543
					return true; // L: 6544
				}

				if (ServerPacket.field2797 == var1.serverPacket) { // L: 6546
					ClanChannel.privateChatMode = class244.method4812(var3.readUnsignedByte()); // L: 6547
					var1.serverPacket = null; // L: 6548
					return true; // L: 6549
				}

				if (ServerPacket.field2763 == var1.serverPacket) { // L: 6551
					var17 = var3.method6652(); // L: 6552
					MouseHandler.method750(var17); // L: 6553
					changedItemContainers[++field711 - 1 & 31] = var17 & 32767; // L: 6554
					var1.serverPacket = null; // L: 6555
					return true; // L: 6556
				}

				if (ServerPacket.field2728 == var1.serverPacket) { // L: 6558
					destinationX = var3.readUnsignedByte(); // L: 6559
					if (destinationX == 255) { // L: 6560
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6561
					if (destinationY == 255) { // L: 6562
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6563
					return true; // L: 6564
				}

				if (ServerPacket.field2784 == var1.serverPacket) { // L: 6566
					var17 = var3.readInt(); // L: 6567
					InterfaceParent var67 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6568
					if (var67 != null) { // L: 6569
						InvDefinition.closeInterface(var67, true);
					}

					if (meslayerContinueWidget != null) { // L: 6570
						Script.invalidateWidget(meslayerContinueWidget); // L: 6571
						meslayerContinueWidget = null; // L: 6572
					}

					var1.serverPacket = null; // L: 6574
					return true; // L: 6575
				}

				if (ServerPacket.field2719 == var1.serverPacket) { // L: 6577
					var17 = var3.method6651(); // L: 6578
					var5 = var3.method6662(); // L: 6579
					var6 = var17 >> 10 & 31; // L: 6580
					var7 = var17 >> 5 & 31; // L: 6581
					var8 = var17 & 31; // L: 6582
					var29 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 6583
					Widget var77 = WorldMapData_1.getWidget(var5); // L: 6584
					if (var29 != var77.color) { // L: 6585
						var77.color = var29; // L: 6586
						Script.invalidateWidget(var77); // L: 6587
					}

					var1.serverPacket = null; // L: 6589
					return true; // L: 6590
				}

				if (ServerPacket.field2747 == var1.serverPacket) { // L: 6592
					UrlRequest.method2511(class226.field2684); // L: 6593
					var1.serverPacket = null; // L: 6594
					return true; // L: 6595
				}

				if (ServerPacket.field2731 == var1.serverPacket) { // L: 6597
					if (class289.friendsChat != null) { // L: 6598
						class289.friendsChat.method5751(var3); // L: 6599
					}

					class248.method4916(); // L: 6601
					var1.serverPacket = null; // L: 6602
					return true; // L: 6603
				}

				if (ServerPacket.field2711 == var1.serverPacket) { // L: 6605
					class15.field128 = var3.method6644(); // L: 6606
					WorldMapSection0.field2047 = var3.method6643(); // L: 6607

					while (var3.offset < var1.serverPacketLength) { // L: 6608
						var17 = var3.readUnsignedByte(); // L: 6609
						class226 var65 = WorldMapData_1.method3582()[var17]; // L: 6610
						UrlRequest.method2511(var65); // L: 6611
					}

					var1.serverPacket = null; // L: 6613
					return true; // L: 6614
				}

				if (ServerPacket.field2790 == var1.serverPacket) { // L: 6616
					var58 = var3.readByte(); // L: 6617
					var18 = (long)var3.readUnsignedShort(); // L: 6618
					var20 = (long)var3.readMedium(); // L: 6619
					var23 = var20 + (var18 << 32); // L: 6620
					boolean var75 = false; // L: 6621
					ClanChannel var33 = var58 >= 0 ? currentClanChannels[var58] : AttackOption.guestClanChannel; // L: 6622
					if (var33 == null) { // L: 6623
						var75 = true;
					} else {
						for (var54 = 0; var54 < 100; ++var54) { // L: 6625
							if (var23 == crossWorldMessageIds[var54]) { // L: 6626
								var75 = true; // L: 6627
								break; // L: 6628
							}
						}
					}

					if (!var75) { // L: 6632
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var23; // L: 6633
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6634
						var22 = WorldMapIcon_1.method3304(var3); // L: 6635
						int var55 = var58 >= 0 ? 43 : 46; // L: 6636
						SecureRandomCallable.addChatMessage(var55, "", var22, var33.name); // L: 6637
					}

					var1.serverPacket = null; // L: 6639
					return true; // L: 6640
				}

				if (ServerPacket.field2749 == var1.serverPacket) { // L: 6642
					byte[] var49 = new byte[var1.serverPacketLength]; // L: 6643
					var3.method6561(var49, 0, var49.length); // L: 6644
					Buffer var64 = new Buffer(var49); // L: 6645
					var74 = var64.readStringCp1252NullTerminated(); // L: 6646
					AttackOption.openURL(var74, true, false); // L: 6647
					var1.serverPacket = null; // L: 6648
					return true; // L: 6649
				}

				if (ServerPacket.field2727 == var1.serverPacket) { // L: 6651
					TaskHandler.method2615(var3.readStringCp1252NullTerminated()); // L: 6652
					var1.serverPacket = null; // L: 6653
					return true; // L: 6654
				}

				if (ServerPacket.field2772 == var1.serverPacket) { // L: 6656
					UrlRequest.method2511(class226.field2683); // L: 6657
					var1.serverPacket = null; // L: 6658
					return true; // L: 6659
				}

				int var15;
				long var34;
				String var36;
				if (ServerPacket.field2793 == var1.serverPacket) { // L: 6661
					var48 = var3.readStringCp1252NullTerminated(); // L: 6662
					var18 = var3.readLong(); // L: 6663
					var20 = (long)var3.readUnsignedShort(); // L: 6664
					var23 = (long)var3.readMedium(); // L: 6665
					PlayerType var11 = (PlayerType)Clock.findEnumerated(class106.PlayerType_values(), var3.readUnsignedByte()); // L: 6666
					var34 = var23 + (var20 << 32); // L: 6667
					boolean var14 = false; // L: 6668

					for (var15 = 0; var15 < 100; ++var15) { // L: 6669
						if (crossWorldMessageIds[var15] == var34) { // L: 6670
							var14 = true; // L: 6671
							break; // L: 6672
						}
					}

					if (var11.isUser && DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var48, LoginScreenAnimation.loginType))) { // L: 6675 6676
						var14 = true;
					}

					if (!var14 && field629 == 0) { // L: 6678
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34; // L: 6679
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6680
						var36 = AbstractFont.escapeBrackets(GrandExchangeEvents.method5182(WorldMapIcon_1.method3304(var3))); // L: 6681
						if (var11.modIcon != -1) { // L: 6682
							SecureRandomCallable.addChatMessage(9, MusicPatchPcmStream.method4743(var11.modIcon) + var48, var36, class80.base37DecodeLong(var18));
						} else {
							SecureRandomCallable.addChatMessage(9, var48, var36, class80.base37DecodeLong(var18)); // L: 6683
						}
					}

					var1.serverPacket = null; // L: 6685
					return true; // L: 6686
				}

				if (ServerPacket.field2712 == var1.serverPacket) { // L: 6688
					minimapState = var3.readUnsignedByte(); // L: 6689
					var1.serverPacket = null; // L: 6690
					return true; // L: 6691
				}

				if (ServerPacket.field2735 == var1.serverPacket) { // L: 6693
					if (class10.field74 == null) { // L: 6694
						class10.field74 = new class340(class26.HitSplatDefinition_cachedSprites);
					}

					class391 var47 = class26.HitSplatDefinition_cachedSprites.method6052(var3); // L: 6695
					class10.field74.field3919.vmethod6398(var47.field4226, var47.field4227); // L: 6696
					field814[++field759 - 1 & 31] = var47.field4226; // L: 6697
					var1.serverPacket = null; // L: 6698
					return true; // L: 6699
				}

				if (ServerPacket.field2739 == var1.serverPacket) { // L: 6701
					var58 = var3.readByte(); // L: 6702
					var26 = var3.readStringCp1252NullTerminated(); // L: 6703
					long var37 = (long)var3.readUnsignedShort(); // L: 6704
					long var39 = (long)var3.readMedium(); // L: 6705
					PlayerType var76 = (PlayerType)Clock.findEnumerated(class106.PlayerType_values(), var3.readUnsignedByte()); // L: 6706
					long var41 = (var37 << 32) + var39; // L: 6707
					boolean var13 = false; // L: 6708
					ClanChannel var43 = null; // L: 6709
					var43 = var58 >= 0 ? currentClanChannels[var58] : AttackOption.guestClanChannel; // L: 6711
					if (var43 == null) { // L: 6712
						var13 = true; // L: 6713
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var76.isUser && DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var26, LoginScreenAnimation.loginType))) { // L: 6722 6723
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var41) { // L: 6717
								var13 = true; // L: 6718
								break; // L: 6719
							}

							++var15; // L: 6716
						}
					}

					if (!var13) { // L: 6726
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41; // L: 6727
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6728
						var36 = AbstractFont.escapeBrackets(WorldMapIcon_1.method3304(var3)); // L: 6729
						int var16 = var58 >= 0 ? 41 : 44; // L: 6730
						if (var76.modIcon != -1) { // L: 6731
							SecureRandomCallable.addChatMessage(var16, MusicPatchPcmStream.method4743(var76.modIcon) + var26, var36, var43.name);
						} else {
							SecureRandomCallable.addChatMessage(var16, var26, var36, var43.name); // L: 6732
						}
					}

					var1.serverPacket = null; // L: 6734
					return true; // L: 6735
				}

				if (ServerPacket.field2717 == var1.serverPacket) { // L: 6737
					var17 = var3.readInt(); // L: 6738
					var5 = var3.readInt(); // L: 6739
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6740
					var25 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6741
					if (var25 != null) { // L: 6742
						InvDefinition.closeInterface(var25, var73 == null || var25.group != var73.group);
					}

					if (var73 != null) { // L: 6743
						var73.remove(); // L: 6744
						interfaceParents.put(var73, (long)var17); // L: 6745
					}

					var28 = WorldMapData_1.getWidget(var5); // L: 6747
					if (var28 != null) { // L: 6748
						Script.invalidateWidget(var28);
					}

					var28 = WorldMapData_1.getWidget(var17); // L: 6749
					if (var28 != null) { // L: 6750
						Script.invalidateWidget(var28); // L: 6751
						WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var28.id >>> 16], var28, true); // L: 6752
					}

					if (rootInterface != -1) { // L: 6754
						class8.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6755
					return true; // L: 6756
				}

				if (ServerPacket.field2761 == var1.serverPacket) { // L: 6758
					var17 = var3.readUnsignedByte(); // L: 6759
					class2.forceDisconnect(var17); // L: 6760
					var1.serverPacket = null; // L: 6761
					return false; // L: 6762
				}

				if (ServerPacket.field2781 == var1.serverPacket) { // L: 6764
					UrlRequest.method2511(class226.field2692); // L: 6765
					var1.serverPacket = null; // L: 6766
					return true; // L: 6767
				}

				if (ServerPacket.field2720 == var1.serverPacket) { // L: 6769
					for (var17 = 0; var17 < players.length; ++var17) { // L: 6770
						if (players[var17] != null) { // L: 6771
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) { // L: 6773
						if (npcs[var17] != null) { // L: 6774
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6776
					return true; // L: 6777
				}

				if (ServerPacket.field2733 == var1.serverPacket) { // L: 6779
					field820 = cycleCntr; // L: 6780
					var58 = var3.readByte(); // L: 6781
					class19 var62 = new class19(var3); // L: 6782
					ClanChannel var69;
					if (var58 >= 0) { // L: 6784
						var69 = currentClanChannels[var58];
					} else {
						var69 = AttackOption.guestClanChannel; // L: 6785
					}

					var62.method278(var69); // L: 6786
					var1.serverPacket = null; // L: 6787
					return true; // L: 6788
				}

				if (ServerPacket.field2714 == var1.serverPacket) { // L: 6790
					WorldMapSection0.field2047 = var3.method6643(); // L: 6791
					class15.field128 = var3.method6642(); // L: 6792

					for (var17 = WorldMapSection0.field2047; var17 < WorldMapSection0.field2047 + 8; ++var17) { // L: 6793
						for (var5 = class15.field128; var5 < class15.field128 + 8; ++var5) { // L: 6794
							if (groundItems[SoundSystem.Client_plane][var17][var5] != null) { // L: 6795
								groundItems[SoundSystem.Client_plane][var17][var5] = null; // L: 6796
								class26.updateItemPile(var17, var5); // L: 6797
							}
						}
					}

					for (PendingSpawn var46 = (PendingSpawn)pendingSpawns.last(); var46 != null; var46 = (PendingSpawn)pendingSpawns.previous()) { // L: 6801 6802 6804
						if (var46.x >= WorldMapSection0.field2047 && var46.x < WorldMapSection0.field2047 + 8 && var46.y >= class15.field128 && var46.y < class15.field128 + 8 && var46.plane == SoundSystem.Client_plane) { // L: 6803
							var46.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6806
					return true; // L: 6807
				}

				if (ServerPacket.field2715 == var1.serverPacket) { // L: 6809
					UrlRequest.method2511(class226.field2688); // L: 6810
					var1.serverPacket = null; // L: 6811
					return true; // L: 6812
				}

				if (ServerPacket.field2713 == var1.serverPacket) { // L: 6814
					if (var1.serverPacketLength == 0) { // L: 6815
						class289.friendsChat = null; // L: 6816
					} else {
						if (class289.friendsChat == null) { // L: 6819
							class289.friendsChat = new FriendsChat(LoginScreenAnimation.loginType, class1.client); // L: 6820
						}

						class289.friendsChat.readUpdate(var3); // L: 6822
					}

					class248.method4916(); // L: 6824
					var1.serverPacket = null; // L: 6825
					return true; // L: 6826
				}

				if (ServerPacket.field2744 == var1.serverPacket) { // L: 6828
					var17 = var3.offset + var1.serverPacketLength; // L: 6829
					var5 = var3.readUnsignedShort(); // L: 6830
					var6 = var3.readUnsignedShort(); // L: 6831
					if (var5 != rootInterface) { // L: 6832
						rootInterface = var5; // L: 6833
						this.resizeRoot(false); // L: 6834
						TextureProvider.Widget_resetModelFrames(rootInterface); // L: 6835
						ScriptFrame.runWidgetOnLoadListener(rootInterface); // L: 6836

						for (var7 = 0; var7 < 100; ++var7) { // L: 6837
							field831[var7] = true;
						}
					}

					InterfaceParent var31;
					for (; var6-- > 0; var31.field1148 = true) { // L: 6839 6849
						var7 = var3.readInt(); // L: 6840
						var8 = var3.readUnsignedShort(); // L: 6841
						var29 = var3.readUnsignedByte(); // L: 6842
						var31 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6843
						if (var31 != null && var8 != var31.group) { // L: 6844
							InvDefinition.closeInterface(var31, true); // L: 6845
							var31 = null; // L: 6846
						}

						if (var31 == null) { // L: 6848
							var31 = FriendSystem.method1867(var7, var8, var29);
						}
					}

					for (var25 = (InterfaceParent)interfaceParents.first(); var25 != null; var25 = (InterfaceParent)interfaceParents.next()) { // L: 6851
						if (var25.field1148) { // L: 6852
							var25.field1148 = false;
						} else {
							InvDefinition.closeInterface(var25, true); // L: 6854
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6857

					while (var3.offset < var17) { // L: 6858
						var7 = var3.readInt(); // L: 6859
						var8 = var3.readUnsignedShort(); // L: 6860
						var29 = var3.readUnsignedShort(); // L: 6861
						var30 = var3.readInt(); // L: 6862

						for (int var32 = var8; var32 <= var29; ++var32) { // L: 6863
							var34 = ((long)var7 << 32) + (long)var32; // L: 6864
							widgetFlags.put(new IntegerNode(var30), var34); // L: 6865
						}
					}

					var1.serverPacket = null; // L: 6868
					return true; // L: 6869
				}

				if (ServerPacket.field2756 == var1.serverPacket) { // L: 6871
					rebootTimer = var3.readUnsignedShort() * 30; // L: 6872
					field823 = cycleCntr; // L: 6873
					var1.serverPacket = null; // L: 6874
					return true; // L: 6875
				}

				if (ServerPacket.field2734 == var1.serverPacket) { // L: 6877
					var17 = var3.readInt(); // L: 6878
					var5 = var3.readUnsignedShort(); // L: 6879
					if (var17 < -70000) { // L: 6880
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6882
						var27 = WorldMapData_1.getWidget(var17);
					} else {
						var27 = null; // L: 6883
					}

					if (var27 != null) { // L: 6884
						for (var7 = 0; var7 < var27.itemIds.length; ++var7) { // L: 6885
							var27.itemIds[var7] = 0; // L: 6886
							var27.itemQuantities[var7] = 0; // L: 6887
						}
					}

					class126.clearItemContainer(var5); // L: 6890
					var7 = var3.readUnsignedShort(); // L: 6891

					for (var8 = 0; var8 < var7; ++var8) { // L: 6892
						var29 = var3.method6642(); // L: 6893
						if (var29 == 255) { // L: 6894
							var29 = var3.method6675();
						}

						var30 = var3.method6652(); // L: 6895
						if (var27 != null && var8 < var27.itemIds.length) { // L: 6896 6897
							var27.itemIds[var8] = var30; // L: 6898
							var27.itemQuantities[var8] = var29; // L: 6899
						}

						ByteArrayPool.itemContainerSetItem(var5, var8, var30 - 1, var29); // L: 6902
					}

					if (var27 != null) { // L: 6904
						Script.invalidateWidget(var27);
					}

					WorldMapID.method3717(); // L: 6905
					changedItemContainers[++field711 - 1 & 31] = var5 & 32767; // L: 6906
					var1.serverPacket = null; // L: 6907
					return true; // L: 6908
				}

				if (ServerPacket.field2730 == var1.serverPacket) { // L: 6910
					KeyHandler.loadRegions(true, var1.packetBuffer); // L: 6911
					var1.serverPacket = null; // L: 6912
					return true; // L: 6913
				}

				if (ServerPacket.field2780 == var1.serverPacket) { // L: 6915
					var17 = var3.method6652(); // L: 6916
					if (var17 == 65535) { // L: 6917
						var17 = -1;
					}

					class6.playSong(var17); // L: 6918
					var1.serverPacket = null; // L: 6919
					return true; // L: 6920
				}

				if (ServerPacket.field2769 == var1.serverPacket) { // L: 6922
					var17 = var3.method6653(); // L: 6923
					if (var17 == 65535) { // L: 6924
						var17 = -1;
					}

					var5 = var3.readMedium(); // L: 6925
					ReflectionCheck.method1230(var17, var5); // L: 6926
					var1.serverPacket = null; // L: 6927
					return true; // L: 6928
				}

				if (ServerPacket.field2764 == var1.serverPacket) { // L: 6930
					UserComparator9.updatePlayers(var3, var1.serverPacketLength); // L: 6931
					EnumComposition.method2827(); // L: 6932
					var1.serverPacket = null; // L: 6933
					return true; // L: 6934
				}

				if (ServerPacket.field2785 == var1.serverPacket) { // L: 6936
					var17 = var3.readInt(); // L: 6937
					if (var17 != field704) { // L: 6938
						field704 = var17; // L: 6939
						FriendsChat.method5760(); // L: 6940
					}

					var1.serverPacket = null; // L: 6942
					return true; // L: 6943
				}

				if (ServerPacket.field2742 == var1.serverPacket) { // L: 6945
					var17 = var3.method6675(); // L: 6946
					var51 = var3.method6643() == 1; // L: 6947
					var27 = WorldMapData_1.getWidget(var17); // L: 6948
					if (var51 != var27.isHidden) { // L: 6949
						var27.isHidden = var51; // L: 6950
						Script.invalidateWidget(var27); // L: 6951
					}

					var1.serverPacket = null; // L: 6953
					return true; // L: 6954
				}

				if (ServerPacket.field2716 == var1.serverPacket) { // L: 6956
					for (var17 = 0; var17 < SoundSystem.VarpDefinition_fileCount; ++var17) { // L: 6957
						VarpDefinition var60 = class1.VarpDefinition_get(var17); // L: 6958
						if (var60 != null) { // L: 6959
							Varps.Varps_temp[var17] = 0; // L: 6960
							Varps.Varps_main[var17] = 0; // L: 6961
						}
					}

					WorldMapID.method3717(); // L: 6964
					changedVarpCount += 32; // L: 6965
					var1.serverPacket = null; // L: 6966
					return true; // L: 6967
				}

				if (ServerPacket.field2798 == var1.serverPacket) { // L: 6969
					var17 = var3.method6662(); // L: 6970
					var5 = var3.method6652(); // L: 6971
					var27 = WorldMapData_1.getWidget(var17); // L: 6972
					if (var27.modelType != 2 || var5 != var27.modelId) { // L: 6973
						var27.modelType = 2; // L: 6974
						var27.modelId = var5; // L: 6975
						Script.invalidateWidget(var27); // L: 6976
					}

					var1.serverPacket = null; // L: 6978
					return true; // L: 6979
				}

				if (ServerPacket.field2754 == var1.serverPacket) { // L: 6981
					tradeChatMode = var3.method6644(); // L: 6982
					publicChatMode = var3.method6644(); // L: 6983
					var1.serverPacket = null; // L: 6984
					return true; // L: 6985
				}

				if (ServerPacket.field2741 == var1.serverPacket) { // L: 6987
					var17 = var3.method6651(); // L: 6988
					rootInterface = var17; // L: 6989
					this.resizeRoot(false); // L: 6990
					TextureProvider.Widget_resetModelFrames(var17); // L: 6991
					ScriptFrame.runWidgetOnLoadListener(rootInterface); // L: 6992

					for (var5 = 0; var5 < 100; ++var5) { // L: 6993
						field831[var5] = true;
					}

					var1.serverPacket = null; // L: 6994
					return true; // L: 6995
				}

				if (ServerPacket.field2729 == var1.serverPacket) { // L: 6997
					var17 = var3.method6662(); // L: 6998
					var26 = var3.readStringCp1252NullTerminated(); // L: 6999
					var27 = WorldMapData_1.getWidget(var17); // L: 7000
					if (!var26.equals(var27.text)) { // L: 7001
						var27.text = var26; // L: 7002
						Script.invalidateWidget(var27); // L: 7003
					}

					var1.serverPacket = null; // L: 7005
					return true; // L: 7006
				}

				FriendsChat.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -678787115 * -1501005443 : -1) + "," + (var1.field1411 != null ? var1.field1411.id * -678787115 * -1501005443 : -1) + "," + (var1.field1399 != null ? var1.field1399.id * -678787115 * -1501005443 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7008
				PcmPlayer.logOut(); // L: 7009
			} catch (IOException var44) { // L: 7011
				ApproximateRouteStrategy.method1268(); // L: 7012
			} catch (Exception var45) {
				var26 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -678787115 * -1501005443 : -1) + "," + (var1.field1411 != null ? var1.field1411.id * -678787115 * -1501005443 : -1) + "," + (var1.field1399 != null ? var1.field1399.id * -678787115 * -1501005443 : -1) + "," + var1.serverPacketLength + "," + (class262.localPlayer.pathX[0] + class15.baseX) + "," + (class262.localPlayer.pathY[0] + WorldMapSprite.baseY) + ","; // L: 7015

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7016
					var26 = var26 + var3.array[var6] + ",";
				}

				FriendsChat.RunException_sendStackTrace(var26, var45); // L: 7017
				PcmPlayer.logOut(); // L: 7018
			}

			return true; // L: 7020
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2138631971"
	)
	@Export("menu")
	final void menu() {
		Skeleton.method4034(); // L: 7772
		if (VerticalAlignment.dragInventoryWidget == null) { // L: 7773
			if (clickedWidget == null) { // L: 7774
				int var1 = MouseHandler.MouseHandler_lastButton; // L: 7775
				int var2;
				int var3;
				int var4;
				int var5;
				int var8;
				int var10;
				int var14;
				int var18;
				if (isMenuOpen) { // L: 7776
					if (var1 != 1 && (UserComparator3.mouseCam || var1 != 4)) { // L: 7777
						var2 = MouseHandler.MouseHandler_x; // L: 7778
						var3 = MouseHandler.MouseHandler_y; // L: 7779
						if (var2 < StructComposition.menuX - 10 || var2 > StructComposition.menuX + UserComparator3.menuWidth + 10 || var3 < class143.menuY - 10 || var3 > class143.menuY + PendingSpawn.menuHeight + 10) { // L: 7780
							isMenuOpen = false; // L: 7781
							AccessFile.method6437(StructComposition.menuX, class143.menuY, UserComparator3.menuWidth, PendingSpawn.menuHeight); // L: 7782
						}
					}

					if (var1 == 1 || !UserComparator3.mouseCam && var1 == 4) { // L: 7785
						var2 = StructComposition.menuX; // L: 7786
						var3 = class143.menuY; // L: 7787
						var4 = UserComparator3.menuWidth; // L: 7788
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 7789
						var14 = MouseHandler.MouseHandler_lastPressedY; // L: 7790
						int var17 = -1; // L: 7791

						for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 7792
							var18 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 7793
							if (var5 > var2 && var5 < var2 + var4 && var14 > var18 - 13 && var14 < var18 + 3) { // L: 7794
								var17 = var8;
							}
						}

						if (var17 != -1 && var17 >= 0) { // L: 7796 7797
							var8 = menuArguments1[var17]; // L: 7798
							var18 = menuArguments2[var17]; // L: 7799
							var10 = menuOpcodes[var17]; // L: 7800
							int var11 = menuIdentifiers[var17]; // L: 7801
							String var12 = menuActions[var17]; // L: 7802
							String var13 = menuTargets[var17]; // L: 7803
							GameObject.menuAction(var8, var18, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7804
						}

						isMenuOpen = false; // L: 7806
						AccessFile.method6437(StructComposition.menuX, class143.menuY, UserComparator3.menuWidth, PendingSpawn.menuHeight); // L: 7807
					}
				} else {
					var2 = HealthBarUpdate.method2283(); // L: 7811
					if ((var1 == 1 || !UserComparator3.mouseCam && var1 == 4) && var2 >= 0) { // L: 7812
						var3 = menuOpcodes[var2]; // L: 7813
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 7814
							label246: {
								var4 = menuArguments1[var2]; // L: 7815
								var5 = menuArguments2[var2]; // L: 7816
								Widget var6 = WorldMapData_1.getWidget(var5); // L: 7817
								var8 = class22.getWidgetFlags(var6); // L: 7819
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 7821
								if (!var7) { // L: 7824
									var10 = class22.getWidgetFlags(var6); // L: 7826
									boolean var9 = (var10 >> 29 & 1) != 0; // L: 7828
									if (!var9) { // L: 7830
										break label246;
									}
								}

								if (VerticalAlignment.dragInventoryWidget != null && !field734 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 7832 7833
									var18 = draggedWidgetX; // L: 7834
									var10 = draggedWidgetY; // L: 7835
									TaskHandler.method2625(class29.tempMenuAction, var18, var10); // L: 7837
									class29.tempMenuAction = null; // L: 7838
								}

								field734 = false; // L: 7842
								itemDragDuration = 0; // L: 7843
								if (VerticalAlignment.dragInventoryWidget != null) { // L: 7844
									Script.invalidateWidget(VerticalAlignment.dragInventoryWidget);
								}

								VerticalAlignment.dragInventoryWidget = WorldMapData_1.getWidget(var5); // L: 7845
								dragItemSlotSource = var4; // L: 7846
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 7847
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 7848
								if (var2 >= 0) { // L: 7849
									WorldMapIcon_1.method3305(var2);
								}

								Script.invalidateWidget(VerticalAlignment.dragInventoryWidget); // L: 7850
								return; // L: 7851
							}
						}
					}

					if ((var1 == 1 || !UserComparator3.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 7855 7856
						var1 = 2; // L: 7857
					}

					if ((var1 == 1 || !UserComparator3.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 7860 7862
						var3 = menuArguments1[var2]; // L: 7863
						var4 = menuArguments2[var2]; // L: 7864
						var5 = menuOpcodes[var2]; // L: 7865
						var14 = menuIdentifiers[var2]; // L: 7866
						String var15 = menuActions[var2]; // L: 7867
						String var16 = menuTargets[var2]; // L: 7868
						GameObject.menuAction(var3, var4, var5, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7869
					}

					if (var1 == 2 && menuOptionsCount > 0) { // L: 7872
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 7874

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "87"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = HealthBarUpdate.method2283(); // L: 7877
		boolean var2 = leftClickOpensMenu == 1 && menuOptionsCount > 2; // L: 7878
		if (!var2) { // L: 7879
			boolean var3;
			if (var1 < 0) { // L: 7882
				var3 = false; // L: 7883
			} else {
				int var4 = menuOpcodes[var1]; // L: 7886
				if (var4 >= 2000) { // L: 7887
					var4 -= 2000;
				}

				if (var4 == 1007) { // L: 7888
					var3 = true; // L: 7889
				} else {
					var3 = false; // L: 7892
				}
			}

			var2 = var3; // L: 7894
		}

		return var2 && !menuShiftClick[var1]; // L: 7896
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1519538256"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		GrandExchangeEvent.method5222(var1, var2); // L: 7900
		DevicePcmPlayerProvider.scene.menuOpen(SoundSystem.Client_plane, var1, var2, false); // L: 7901
		isMenuOpen = true; // L: 7902
	} // L: 7903

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "574875607"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		JagexCache.method2637(rootInterface, AttackOption.canvasWidth, class0.canvasHeight, var1); // L: 9916
	} // L: 9917

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "1629073496"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : WorldMapData_1.getWidget(var1.parentId); // L: 9920
		int var3;
		int var4;
		if (var2 == null) { // L: 9923
			var3 = AttackOption.canvasWidth; // L: 9924
			var4 = class0.canvasHeight; // L: 9925
		} else {
			var3 = var2.width; // L: 9928
			var4 = var2.height; // L: 9929
		}

		FontName.alignWidgetSize(var1, var3, var4, false); // L: 9931
		class43.alignWidgetPosition(var1, var3, var4); // L: 9932
	} // L: 9933

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1390072147"
	)
	final void method1298() {
		Script.invalidateWidget(clickedWidget); // L: 10929
		++UserComparator7.widgetDragDuration; // L: 10930
		if (field731 && field821) { // L: 10931
			int var1 = MouseHandler.MouseHandler_x; // L: 10937
			int var2 = MouseHandler.MouseHandler_y; // L: 10938
			var1 -= widgetClickX; // L: 10939
			var2 -= widgetClickY; // L: 10940
			if (var1 < field801) { // L: 10941
				var1 = field801;
			}

			if (var1 + clickedWidget.width > field801 + clickedWidgetParent.width) { // L: 10942
				var1 = field801 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field802) { // L: 10943
				var2 = field802;
			}

			if (var2 + clickedWidget.height > field802 + clickedWidgetParent.height) { // L: 10944
				var2 = field802 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field804; // L: 10945
			int var4 = var2 - field805; // L: 10946
			int var5 = clickedWidget.dragZoneSize; // L: 10947
			if (UserComparator7.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 10948 10949
				isDraggingWidget = true; // L: 10950
			}

			int var6 = var1 - field801 + clickedWidgetParent.scrollX; // L: 10953
			int var7 = var2 - field802 + clickedWidgetParent.scrollY; // L: 10954
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 10955
				var8 = new ScriptEvent(); // L: 10956
				var8.widget = clickedWidget; // L: 10957
				var8.mouseX = var6; // L: 10958
				var8.mouseY = var7; // L: 10959
				var8.args = clickedWidget.onDrag; // L: 10960
				WorldMapSection1.runScriptEvent(var8); // L: 10961
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 10963
				if (isDraggingWidget) { // L: 10964
					if (clickedWidget.onDragComplete != null) { // L: 10965
						var8 = new ScriptEvent(); // L: 10966
						var8.widget = clickedWidget; // L: 10967
						var8.mouseX = var6; // L: 10968
						var8.mouseY = var7; // L: 10969
						var8.dragTarget = draggedOnWidget; // L: 10970
						var8.args = clickedWidget.onDragComplete; // L: 10971
						WorldMapSection1.runScriptEvent(var8); // L: 10972
					}

					if (draggedOnWidget != null && PlayerComposition.method4851(clickedWidget) != null) { // L: 10974
						PacketBufferNode var11 = InterfaceParent.getPacketBufferNode(ClientPacket.field2621, packetWriter.isaacCipher); // L: 10976
						var11.packetBuffer.method6659(draggedOnWidget.id); // L: 10977
						var11.packetBuffer.method6648(draggedOnWidget.childIndex); // L: 10978
						var11.packetBuffer.method6705(draggedOnWidget.itemId); // L: 10979
						var11.packetBuffer.method6658(clickedWidget.id); // L: 10980
						var11.packetBuffer.method6649(clickedWidget.itemId); // L: 10981
						var11.packetBuffer.method6705(clickedWidget.childIndex); // L: 10982
						packetWriter.addNode(var11); // L: 10983
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 10987
					this.openMenu(field804 + widgetClickX, field805 + widgetClickY); // L: 10988
				} else if (menuOptionsCount > 0) { // L: 10990
					int var10 = field804 + widgetClickX; // L: 10991
					int var9 = widgetClickY + field805; // L: 10992
					TaskHandler.method2625(class29.tempMenuAction, var10, var9); // L: 10994
					class29.tempMenuAction = null; // L: 10995
				}

				clickedWidget = null; // L: 10999
			}

		} else {
			if (UserComparator7.widgetDragDuration > 1) { // L: 10932
				clickedWidget = null; // L: 10933
			}

		}
	} // L: 10935 11001

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "-1312829614"
	)
	@Export("username")
	public Username username() {
		return class262.localPlayer != null ? class262.localPlayer.username : null; // L: 11665
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1708314526"
	)
	public static final boolean method1746(char var0) {
		if (Character.isISOControl(var0)) { // L: 28
			return false;
		} else if (DynamicObject.isAlphaNumeric(var0)) { // L: 29
			return true;
		} else {
			char[] var1 = class366.field4093; // L: 31

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 32
				var3 = var1[var2]; // L: 33
				if (var0 == var3) { // L: 34
					return true;
				}
			}

			var1 = class366.field4092; // L: 38

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 39
				var3 = var1[var2];
				if (var0 == var3) {
					return true; // L: 41
				}
			}

			return false; // L: 44
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Lbl;",
		garbageValue = "-1490732059"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Lbl;",
		garbageValue = "-1820664660"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "920839392"
	)
	static int method1745(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 565
		Widget var4;
		if (var0 >= 2000) { // L: 567
			var0 -= 1000; // L: 568
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 569
			var4 = WorldMapData_1.getWidget(var3); // L: 570
		} else {
			var4 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 572
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 573
			ChatChannel.Interpreter_intStackSize -= 4; // L: 574
			var4.rawX = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 575
			var4.rawY = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 576
			var4.xAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 577
			var4.yAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3]; // L: 578
			Script.invalidateWidget(var4); // L: 579
			class1.client.alignWidget(var4); // L: 580
			if (var3 != -1 && var4.type == 0) { // L: 581
				WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 582
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 584
			ChatChannel.Interpreter_intStackSize -= 4; // L: 585
			var4.rawWidth = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 586
			var4.rawHeight = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 587
			var4.widthAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 588
			var4.heightAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3]; // L: 589
			Script.invalidateWidget(var4); // L: 590
			class1.client.alignWidget(var4); // L: 591
			if (var3 != -1 && var4.type == 0) { // L: 592
				WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 593
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 595
			boolean var5 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 596
			if (var5 != var4.isHidden) { // L: 597
				var4.isHidden = var5; // L: 598
				Script.invalidateWidget(var4); // L: 599
			}

			return 1; // L: 601
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 603
			var4.noClickThrough = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 604
			return 1; // L: 605
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 607
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 608
			return 1; // L: 609
		} else {
			return 2; // L: 611
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lbk;",
		garbageValue = "9"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}
}
