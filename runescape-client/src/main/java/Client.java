import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "[Ll;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 257317803
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1275777925
	)
	static int field849;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		longValue = 6326177537901632971L
	)
	static long field858;
	@ObfuscatedName("ov")
	static boolean[] field719;
	@ObfuscatedName("pc")
	static boolean[] field860;
	@ObfuscatedName("or")
	static boolean[] field780;
	@ObfuscatedName("pb")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -106098945
	)
	public static int field717;
	@ObfuscatedName("qr")
	static boolean field881;
	@ObfuscatedName("pv")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pz")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 568772133
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("pl")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("pa")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("tu")
	static int[] field689;
	@ObfuscatedName("tt")
	static int[] field851;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	static final ApproximateRouteStrategy field785;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -1714532039
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "[Lju;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1810222737
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 1005623717
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rg")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -1084759211
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("rb")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 909671199
	)
	static int field908;
	@ObfuscatedName("rt")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("rq")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 15595769
	)
	static int field752;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[Laa;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("rx")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("to")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -1953954605
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -771809921
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 565415243
	)
	static int field872;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("sg")
	static short field894;
	@ObfuscatedName("sp")
	static short field895;
	@ObfuscatedName("sa")
	static short field900;
	@ObfuscatedName("su")
	static short field901;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -1674931291
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 2076100495
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("sm")
	static short field828;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 755828989
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("sk")
	static short field909;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -592780465
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("qu")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("qp")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1806233111
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = -2020111655
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 407581195
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("pe")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		longValue = 1950859972192234267L
	)
	static long field809;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 2087031963
	)
	static int field806;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -2103302667
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = 112640073
	)
	static int field916;
	@ObfuscatedName("rs")
	static boolean[] field693;
	@ObfuscatedName("ph")
	static int[] field868;
	@ObfuscatedName("rd")
	static int[] field891;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "[Ly;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("pi")
	static int[] field867;
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static NodeDeque field652;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static NodeDeque field846;
	@ObfuscatedName("rv")
	static int[] field890;
	@ObfuscatedName("si")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("so")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -639645947
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sb")
	static int[] field893;
	@ObfuscatedName("rh")
	static int[] field892;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = -1863932723
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("py")
	static int[] field877;
	@ObfuscatedName("pp")
	static String field863;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfz;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("an")
	static boolean field889;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1396273817
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1088533541
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 60643507
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bm")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1731105959
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1523027191
	)
	static int field643;
	@ObfuscatedName("bj")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -888167097
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cs")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1702273423
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		longValue = 8707347461681450731L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1975403091
	)
	static int field651;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 424553417
	)
	static int field812;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		longValue = 8694062253931131003L
	)
	static long field653;
	@ObfuscatedName("cz")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cb")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -414435005
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1764619255
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1564576307
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1851530429
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -659326571
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 122660467
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1213777129
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -213439381
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 2031424669
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dj")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1127540073
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 534657201
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -587760519
	)
	static int field670;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -515874317
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1024706269
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1134111881
	)
	static int field673;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -2135696499
	)
	static int field845;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1200580919
	)
	static int field675;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static class125 field676;
	@ObfuscatedName("ei")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fz")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "[Ldb;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1300723479
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fe")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 1045404765
	)
	static int field685;
	@ObfuscatedName("fo")
	static int[] field686;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static AbstractSocket field688;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -688107431
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fi")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("fy")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fn")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -1548218417
	)
	static int field694;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 834526125
	)
	static int field695;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1282334079
	)
	static int field696;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1781171757
	)
	static int field697;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -189422017
	)
	static int field698;
	@ObfuscatedName("gl")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gk")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gd")
	static final int[] field702;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 613265553
	)
	static int field913;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -119839221
	)
	static int field704;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1576725955
	)
	static int field705;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 1820360451
	)
	static int field706;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -944863209
	)
	static int field707;
	@ObfuscatedName("hc")
	static boolean field708;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -2035208823
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -2031705619
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -574530013
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -308632201
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -1928381453
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -1017968913
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1156171963
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -400479567
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 334319879
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -859124845
	)
	static int field718;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -1624140925
	)
	static int field732;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 286253175
	)
	static int field720;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -503425261
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 918404705
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -315190483
	)
	static int field723;
	@ObfuscatedName("id")
	static boolean field724;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -1396591603
	)
	static int field725;
	@ObfuscatedName("im")
	static boolean field726;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 627480141
	)
	static int field727;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = 964514413
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1347852179
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ij")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("iw")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("iv")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("iy")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ib")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ji")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jw")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jk")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jd")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -213028925
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1057202329
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -1775322899
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 2140784851
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1518689867
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1932536521
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 993621687
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -1890193251
	)
	static int field747;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -657236193
	)
	static int field841;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -65004085
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 823942939
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -732224895
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -1148388107
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jj")
	static boolean field848;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = -599181589
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -267997189
	)
	static int field755;
	@ObfuscatedName("je")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "[Lce;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 929092845
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1721569989
	)
	static int field759;
	@ObfuscatedName("ka")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -1493328845
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1717996379
	)
	static int field762;
	@ObfuscatedName("kt")
	static int[] field771;
	@ObfuscatedName("kz")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("kd")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kp")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kw")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 845336023
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[[[Lkx;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kn")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ks")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lr")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 161491329
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lo")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 673512273
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lx")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ln")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lj")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("la")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lv")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("lu")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ly")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ls")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("lw")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("le")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lh")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1449324429
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -406218029
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -1946501383
	)
	static int field792;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 625904081
	)
	static int field833;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -438265211
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ml")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 1683168531
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1424616685
	)
	static int field788;
	@ObfuscatedName("mk")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mn")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 1338880923
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -907665653
	)
	static int field803;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1274187443
	)
	static int field805;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -234914901
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -1287342199
	)
	static int field912;
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 1008679671
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -612986977
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -816484905
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1092871253
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("nc")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -653830947
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1055501491
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("no")
	static boolean field819;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = 1941546241
	)
	static int field740;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -356014141
	)
	static int field821;
	@ObfuscatedName("np")
	static boolean field822;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -227792449
	)
	static int field854;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 662563071
	)
	static int field804;
	@ObfuscatedName("nz")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 1675804533
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("nn")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 1149971569
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("ns")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 102304557
	)
	static int field830;
	@ObfuscatedName("ne")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 28091927
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oi")
	static int[] field911;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 1843609775
	)
	static int field852;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1908476521
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 56143531
	)
	static int field836;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1400025619
	)
	static int field844;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1827987357
	)
	static int field654;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -31959039
	)
	static int field839;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 77736245
	)
	static int field840;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -194606347
	)
	static int field748;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 1047300925
	)
	static int field659;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	Buffer field679;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	class35 field680;

	static {
		field889 = true; // L: 194
		worldId = 1; // L: 195
		worldProperties = 0; // L: 196
		gameBuild = 0; // L: 198
		isMembersWorld = false; // L: 201
		isLowDetail = false; // L: 202
		clientType = -1; // L: 207
		field643 = -1; // L: 208
		onMobile = false; // L: 209
		gameState = 0; // L: 210
		isLoading = true; // L: 231
		cycle = 0; // L: 232
		mouseLastLastPressedTimeMillis = -1L; // L: 233
		field651 = -1; // L: 235
		field812 = -1; // L: 236
		field653 = -1L; // L: 237
		hadFocus = true; // L: 238
		displayFps = false; // L: 239
		rebootTimer = 0; // L: 240
		hintArrowType = 0; // L: 241
		hintArrowNpcIndex = 0; // L: 242
		hintArrowPlayerIndex = 0; // L: 243
		hintArrowX = 0; // L: 244
		hintArrowY = 0; // L: 245
		hintArrowHeight = 0; // L: 246
		hintArrowSubX = 0; // L: 247
		hintArrowSubY = 0; // L: 248
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 250
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 251
		titleLoadingStage = 0; // L: 253
		js5ConnectState = 0; // L: 256
		field670 = 0; // L: 257
		js5Errors = 0; // L: 279
		loginState = 0; // L: 281
		field673 = 0; // L: 282
		field845 = 0; // L: 283
		field675 = 0; // L: 284
		field676 = class125.field1468; // L: 285
		Login_isUsernameRemembered = false; // L: 294
		secureRandomFuture = new SecureRandomFuture(); // L: 295
		randomDatData = null; // L: 300
		npcs = new NPC[32768]; // L: 304
		npcCount = 0; // L: 305
		npcIndices = new int[32768]; // L: 306
		field685 = 0; // L: 307
		field686 = new int[250]; // L: 308
		packetWriter = new PacketWriter(); // L: 311
		logoutTimer = 0; // L: 313
		hadNetworkError = false; // L: 314
		useBufferedSocket = true; // L: 315
		timer = new Timer(); // L: 316
		fontsMap = new HashMap(); // L: 322
		field694 = 0; // L: 329
		field695 = 1; // L: 330
		field696 = 0; // L: 331
		field697 = 1; // L: 332
		field698 = 0; // L: 333
		collisionMaps = new CollisionMap[4]; // L: 341
		isInInstance = false; // L: 342
		instanceChunkTemplates = new int[4][13][13]; // L: 343
		field702 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 344
		field913 = 0; // L: 347
		field704 = 2301979; // L: 359
		field705 = 5063219; // L: 360
		field706 = 3353893; // L: 361
		field707 = 7759444; // L: 362
		field708 = false; // L: 363
		alternativeScrollbarWidth = 0; // L: 364
		camAngleX = 128; // L: 372
		camAngleY = 0; // L: 373
		camAngleDY = 0; // L: 374
		camAngleDX = 0; // L: 375
		mouseCamClickedX = 0; // L: 376
		mouseCamClickedY = 0; // L: 377
		oculusOrbState = 0; // L: 378
		camFollowHeight = 50; // L: 379
		field718 = 0; // L: 383
		field732 = 0; // L: 384
		field720 = 0; // L: 385
		oculusOrbNormalSpeed = 12; // L: 387
		oculusOrbSlowedSpeed = 6; // L: 388
		field723 = 0; // L: 389
		field724 = false; // L: 390
		field725 = 0; // L: 391
		field726 = false; // L: 392
		field727 = 0; // L: 393
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
		field747 = 0; // L: 414
		field841 = 0; // L: 415
		dragItemSlotSource = 0; // L: 418
		draggedWidgetX = 0; // L: 419
		draggedWidgetY = 0; // L: 420
		dragItemSlotDestination = 0; // L: 421
		field848 = false; // L: 422
		itemDragDuration = 0; // L: 423
		field755 = 0; // L: 424
		showLoadingMessages = true; // L: 426
		players = new Player[2048]; // L: 428
		localPlayerIndex = -1; // L: 430
		field759 = 0; // L: 431
		renderSelf = true; // L: 433
		drawPlayerNames = 0; // L: 438
		field762 = 0; // L: 439
		field771 = new int[1000]; // L: 440
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
		field792 = 0; // L: 479
		field833 = 50; // L: 480
		isItemSelected = 0; // L: 481
		selectedItemName = null; // L: 485
		isSpellSelected = false; // L: 486
		selectedSpellChildIndex = -1; // L: 488
		field788 = -1; // L: 489
		selectedSpellActionName = null; // L: 491
		selectedSpellName = null; // L: 492
		rootInterface = -1; // L: 493
		interfaceParents = new NodeHashTable(8); // L: 494
		field803 = 0; // L: 499
		field805 = -1; // L: 500
		chatEffects = 0; // L: 501
		field912 = 0; // L: 502
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
		field819 = false; // L: 515
		field740 = -1; // L: 516
		field821 = -1; // L: 517
		field822 = false; // L: 518
		field854 = -1; // L: 519
		field804 = -1; // L: 520
		isDraggingWidget = false; // L: 521
		cycleCntr = 1; // L: 526
		changedVarps = new int[32]; // L: 529
		changedVarpCount = 0; // L: 530
		changedItemContainers = new int[32]; // L: 531
		field830 = 0; // L: 532
		changedSkills = new int[32]; // L: 533
		changedSkillsCount = 0; // L: 534
		field911 = new int[32]; // L: 535
		field852 = 0; // L: 536
		chatCycle = 0; // L: 537
		field836 = 0; // L: 538
		field844 = 0; // L: 539
		field654 = 0; // L: 540
		field839 = 0; // L: 541
		field840 = 0; // L: 542
		field748 = 0; // L: 543
		field659 = 0; // L: 544
		mouseWheelRotation = 0; // L: 550
		scriptEvents = new NodeDeque(); // L: 551
		field652 = new NodeDeque(); // L: 552
		field846 = new NodeDeque(); // L: 553
		widgetFlags = new NodeHashTable(512); // L: 554
		rootWidgetCount = 0; // L: 556
		field849 = -2; // L: 557
		field719 = new boolean[100]; // L: 558
		field780 = new boolean[100]; // L: 559
		field860 = new boolean[100]; // L: 560
		rootWidgetXs = new int[100]; // L: 561
		rootWidgetYs = new int[100]; // L: 562
		rootWidgetWidths = new int[100]; // L: 563
		rootWidgetHeights = new int[100]; // L: 564
		gameDrawingMode = 0; // L: 565
		field858 = 0L; // L: 566
		isResizable = true; // L: 567
		field877 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 574
		publicChatMode = 0; // L: 575
		tradeChatMode = 0; // L: 577
		field863 = ""; // L: 578
		crossWorldMessageIds = new long[100]; // L: 580
		crossWorldMessageIdsIndex = 0; // L: 581
		field806 = 0; // L: 583
		field867 = new int[128]; // L: 584
		field868 = new int[128]; // L: 585
		field809 = -1L; // L: 586
		currentClanSettings = new ClanSettings[1]; // L: 590
		currentClanChannels = new ClanChannel[1]; // L: 592
		field872 = -1; // L: 594
		mapIconCount = 0; // L: 595
		mapIconXs = new int[1000]; // L: 596
		mapIconYs = new int[1000]; // L: 597
		mapIcons = new SpritePixels[1000]; // L: 598
		destinationX = 0; // L: 599
		destinationY = 0; // L: 600
		minimapState = 0; // L: 607
		currentTrackGroupId = -1; // L: 608
		field881 = false; // L: 609
		soundEffectCount = 0; // L: 615
		soundEffectIds = new int[50]; // L: 616
		queuedSoundEffectLoops = new int[50]; // L: 617
		queuedSoundEffectDelays = new int[50]; // L: 618
		soundLocations = new int[50]; // L: 619
		soundEffects = new SoundEffect[50]; // L: 620
		isCameraLocked = false; // L: 622
		field693 = new boolean[5]; // L: 634
		field890 = new int[5]; // L: 635
		field891 = new int[5]; // L: 636
		field892 = new int[5]; // L: 637
		field893 = new int[5]; // L: 638
		field894 = 256; // L: 639
		field895 = 205; // L: 640
		zoomHeight = 256; // L: 641
		zoomWidth = 320; // L: 642
		field909 = 1; // L: 643
		field828 = 32767; // L: 644
		field900 = 1; // L: 645
		field901 = 32767; // L: 646
		viewportOffsetX = 0; // L: 647
		viewportOffsetY = 0; // L: 648
		viewportWidth = 0; // L: 649
		viewportHeight = 0; // L: 650
		viewportZoom = 0; // L: 651
		playerAppearance = new PlayerComposition(); // L: 653
		field908 = -1; // L: 654
		field752 = -1; // L: 655
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 657
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 659
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 662
		field717 = -1; // L: 669
		archiveLoaders = new ArrayList(10); // L: 670
		archiveLoadersDone = 0; // L: 671
		field916 = 0; // L: 672
		field785 = new ApproximateRouteStrategy(); // L: 681
		field689 = new int[50]; // L: 682
		field851 = new int[50]; // L: 683
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field858 = ObjectComposition.currentTimeMillis() + 500L; // L: 3933
		this.resizeJS(); // L: 3934
		if (rootInterface != -1) { // L: 3935
			this.resizeRoot(true);
		}

	} // L: 3936

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232069568"
	)
	@Export("setUp")
	protected final void setUp() {
		SecureRandomFuture.method1981(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 880
		WorldMapLabelSize.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 881
		GrandExchangeOfferTotalQuantityComparator.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 882
		DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort; // L: 883
		class29.field233 = class245.field2944; // L: 884
		class15.field137 = class245.field2940; // L: 885
		UserComparator5.field1442 = class245.field2941; // L: 886
		VarbitComposition.field1708 = class245.field2942; // L: 887
		ServerPacket.urlRequester = new UrlRequester(); // L: 888
		this.setUpKeyboard(); // L: 889
		this.setUpMouse(); // L: 890
		MidiPcmStream.mouseWheel = this.mouseWheel(); // L: 891
		class43.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 892
		AccessFile var2 = null; // L: 895
		ClientPreferences var3 = new ClientPreferences(); // L: 896

		try {
			var2 = class82.getPreferencesFile("", SoundSystem.field461.name, false); // L: 898
			byte[] var4 = new byte[(int)var2.length()]; // L: 899

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 900 901 904
				var6 = var2.read(var4, var5, var4.length - var5); // L: 902
				if (var6 == -1) { // L: 903
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 906
		} catch (Exception var8) { // L: 908
		}

		try {
			if (var2 != null) { // L: 910
				var2.close();
			}
		} catch (Exception var7) { // L: 912
		}

		ObjectComposition.clientPreferences = var3; // L: 915
		this.setUpClipboard(); // L: 916
		String var9 = PacketWriter.null_string; // L: 918
		class44.applet = this; // L: 920
		if (var9 != null) { // L: 921
			class44.field318 = var9;
		}

		if (gameBuild != 0) { // L: 923
			displayFps = true;
		}

		CollisionMap.setWindowedMode(ObjectComposition.clientPreferences.windowMode); // L: 924
		NetSocket.friendSystem = new FriendSystem(WorldMapSection0.loginType); // L: 925
	} // L: 926

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 929
		this.doCycleJs5(); // L: 930

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 934
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 935
			} // L: 936

			if (var1 == null) { // L: 937
				Interpreter.method1870(); // L: 941
				HealthBarUpdate.playPcmPlayers(); // L: 942
				synchronized(KeyHandler.KeyHandler_instance) { // L: 944
					++KeyHandler.KeyHandler_idleCycles; // L: 945
					KeyHandler.field293 = KeyHandler.field295; // L: 946
					KeyHandler.field292 = 0; // L: 947
					int var5;
					if (KeyHandler.field288 >= 0) { // L: 948
						while (KeyHandler.field296 != KeyHandler.field288) { // L: 953
							var5 = KeyHandler.field287[KeyHandler.field296]; // L: 954
							KeyHandler.field296 = KeyHandler.field296 + 1 & 127; // L: 955
							if (var5 < 0) { // L: 956
								KeyHandler.KeyHandler_pressedKeys[~var5] = false;
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var5] && KeyHandler.field292 < KeyHandler.field274.length - 1) { // L: 958
									KeyHandler.field274[++KeyHandler.field292 - 1] = var5; // L: 959
								}

								KeyHandler.KeyHandler_pressedKeys[var5] = true; // L: 961
							}
						}
					} else {
						for (var5 = 0; var5 < 112; ++var5) { // L: 949
							KeyHandler.KeyHandler_pressedKeys[var5] = false;
						}

						KeyHandler.field288 = KeyHandler.field296; // L: 950
					}

					if (KeyHandler.field292 > 0) { // L: 965
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field295 = KeyHandler.field294; // L: 966
				}

				Player.method2166(); // L: 969
				int var6;
				if (MidiPcmStream.mouseWheel != null) { // L: 970
					var6 = MidiPcmStream.mouseWheel.useRotation(); // L: 971
					mouseWheelRotation = var6; // L: 972
				}

				if (gameState == 0) { // L: 974
					MilliClock.load(); // L: 975
					GameEngine.clock.mark(); // L: 977

					for (var6 = 0; var6 < 32; ++var6) { // L: 978
						GameEngine.graphicsTickTimes[var6] = 0L;
					}

					for (var6 = 0; var6 < 32; ++var6) { // L: 979
						GameEngine.clientTickTimes[var6] = 0L;
					}

					class260.gameCyclesToDo = 0; // L: 980
				} else if (gameState == 5) { // L: 983
					WorldMapManager.doCycleTitle(this); // L: 984
					MilliClock.load(); // L: 985
					GameEngine.clock.mark(); // L: 987

					for (var6 = 0; var6 < 32; ++var6) { // L: 988
						GameEngine.graphicsTickTimes[var6] = 0L;
					}

					for (var6 = 0; var6 < 32; ++var6) { // L: 989
						GameEngine.clientTickTimes[var6] = 0L;
					}

					class260.gameCyclesToDo = 0; // L: 990
				} else if (gameState != 10 && gameState != 11) { // L: 993
					if (gameState == 20) { // L: 994
						WorldMapManager.doCycleTitle(this); // L: 995
						this.doCycleLoggedOut(); // L: 996
					} else if (gameState == 25) { // L: 998
						WorldMapAreaData.method3708();
					}
				} else {
					WorldMapManager.doCycleTitle(this);
				}

				if (gameState == 30) { // L: 999
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1000
					this.doCycleLoggedOut();
				}

				return; // L: 1001
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 938
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "9311"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label168: {
			try {
				if (class232.musicPlayerStatus == 2) { // L: 1007
					if (class2.musicTrack == null) { // L: 1008
						class2.musicTrack = MusicTrack.readTrack(ModelData0.musicTrackArchive, class32.musicTrackGroupId, class18.musicTrackFileId); // L: 1009
						if (class2.musicTrack == null) { // L: 1010
							var2 = false; // L: 1011
							break label168;
						}
					}

					if (Messages.soundCache == null) { // L: 1015
						Messages.soundCache = new SoundCache(WorldMapElement.soundEffectsArchive, class232.musicSamplesArchive);
					}

					if (class124.midiPcmStream.loadMusicTrack(class2.musicTrack, class232.musicPatchesArchive, Messages.soundCache, 22050)) { // L: 1016
						class124.midiPcmStream.clearAll(); // L: 1017
						class124.midiPcmStream.setPcmStreamVolume(class232.musicTrackVolume); // L: 1018
						class124.midiPcmStream.setMusicTrack(class2.musicTrack, class232.musicTrackBoolean); // L: 1019
						class232.musicPlayerStatus = 0; // L: 1020
						class2.musicTrack = null; // L: 1021
						Messages.soundCache = null; // L: 1022
						ModelData0.musicTrackArchive = null; // L: 1023
						var2 = true; // L: 1024
						break label168;
					}
				}
			} catch (Exception var6) { // L: 1029
				var6.printStackTrace(); // L: 1030
				class124.midiPcmStream.clear(); // L: 1031
				class232.musicPlayerStatus = 0; // L: 1032
				class2.musicTrack = null; // L: 1033
				Messages.soundCache = null; // L: 1034
				ModelData0.musicTrackArchive = null; // L: 1035
			}

			var2 = false; // L: 1037
		}

		if (var2 && field881 && DesktopPlatformInfoProvider.pcmPlayer0 != null) { // L: 1040 1041
			DesktopPlatformInfoProvider.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field858 != 0L && ObjectComposition.currentTimeMillis() > field858) { // L: 1043 1044
			CollisionMap.setWindowedMode(SpotAnimationDefinition.getWindowedMode()); // L: 1045
		}

		int var4;
		if (var1) { // L: 1048
			for (var4 = 0; var4 < 100; ++var4) { // L: 1049
				field719[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1051
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1052
			FriendSystem.drawTitle(Widget.fontBold12, Actor.fontPlain11, UserComparator3.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1053
			if (gameState == 20) { // L: 1054
				FriendSystem.drawTitle(Widget.fontBold12, Actor.fontPlain11, UserComparator3.fontPlain12);
			} else if (gameState == 25) { // L: 1055
				if (field698 == 1) { // L: 1056
					if (field694 > field695) { // L: 1057
						field695 = field694;
					}

					var4 = (field695 * 50 - field694 * 50) / field695; // L: 1058
					DirectByteArrayCopier.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1059
				} else if (field698 == 2) { // L: 1061
					if (field696 > field697) { // L: 1062
						field697 = field696;
					}

					var4 = (field697 * 50 - field696 * 50) / field697 + 50; // L: 1063
					DirectByteArrayCopier.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1064
				} else {
					DirectByteArrayCopier.drawLoadingMessage("Loading - please wait.", false); // L: 1066
				}
			} else if (gameState == 30) { // L: 1068
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1069
				DirectByteArrayCopier.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1070
				DirectByteArrayCopier.drawLoadingMessage("Please wait...", false);
			}
		} else {
			FriendSystem.drawTitle(Widget.fontBold12, Actor.fontPlain11, UserComparator3.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1071
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1072
				if (field780[var4]) { // L: 1073
					class26.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1074
					field780[var4] = false; // L: 1075
				}
			}
		} else if (gameState > 0) { // L: 1079
			class26.rasterProvider.drawFull(0, 0); // L: 1080

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1081
				field780[var4] = false;
			}
		}

	} // L: 1083

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "561275520"
	)
	@Export("kill0")
	protected final void kill0() {
		if (GrandExchangeOfferOwnWorldComparator.varcs.hasUnwrittenChanges()) { // L: 1086
			GrandExchangeOfferOwnWorldComparator.varcs.write();
		}

		if (Skills.mouseRecorder != null) { // L: 1087
			Skills.mouseRecorder.isRunning = false;
		}

		Skills.mouseRecorder = null; // L: 1088
		packetWriter.close(); // L: 1089
		if (KeyHandler.KeyHandler_instance != null) { // L: 1091
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1092
				KeyHandler.KeyHandler_instance = null; // L: 1093
			} // L: 1094
		}

		if (MouseHandler.MouseHandler_instance != null) { // L: 1098
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1099
				MouseHandler.MouseHandler_instance = null; // L: 1100
			} // L: 1101
		}

		MidiPcmStream.mouseWheel = null; // L: 1104
		if (DesktopPlatformInfoProvider.pcmPlayer0 != null) { // L: 1105
			DesktopPlatformInfoProvider.pcmPlayer0.shutdown();
		}

		if (MouseRecorder.pcmPlayer1 != null) { // L: 1106
			MouseRecorder.pcmPlayer1.shutdown();
		}

		VarcInt.method2673(); // L: 1107
		Widget.method4759(); // L: 1108
		if (ServerPacket.urlRequester != null) { // L: 1109
			ServerPacket.urlRequester.close(); // L: 1110
			ServerPacket.urlRequester = null; // L: 1111
		}

		FriendSystem.method1746(); // L: 1113
	} // L: 1114

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-992375266"
	)
	protected final void vmethod1471() {
	} // L: 690

	public final void init() {
		try {
			if (this.checkHost()) { // L: 696
				int var4;
				for (int var1 = 0; var1 <= 20; ++var1) { // L: 697
					String var2 = this.getParameter(Integer.toString(var1)); // L: 698
					if (var2 != null) { // L: 699
						switch(var1) { // L: 700
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 755
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 786
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 787
							}
							break;
						case 4:
							if (clientType == -1) { // L: 792
								clientType = Integer.parseInt(var2); // L: 793
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 771
							break; // L: 772
						case 6:
							class378.clientLanguage = Language.method5151(Integer.parseInt(var2)); // L: 745
							break; // L: 746
						case 7:
							var4 = Integer.parseInt(var2); // L: 704
							GameBuild[] var5 = new GameBuild[]{GameBuild.WIP, GameBuild.LIVE, GameBuild.RC, GameBuild.BUILDLIVE}; // L: 709
							GameBuild[] var6 = var5; // L: 711
							int var7 = 0;

							GameBuild var20;
							while (true) {
								if (var7 >= var6.length) {
									var20 = null; // L: 722
									break;
								}

								GameBuild var8 = var6[var7]; // L: 713
								if (var4 == var8.buildId) { // L: 715
									var20 = var8; // L: 716
									break; // L: 717
								}

								++var7; // L: 712
							}

							FaceNormal.field2365 = var20; // L: 724
							break; // L: 725
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 765
							}
							break;
						case 9:
							class363.field4079 = var2; // L: 776
							break; // L: 777
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.oldscape, StudioGame.game3, StudioGame.game4}; // L: 736
							SoundSystem.field461 = (StudioGame)Messages.findEnumerated(var3, Integer.parseInt(var2)); // L: 738
							if (StudioGame.oldscape == SoundSystem.field461) { // L: 739
								WorldMapSection0.loginType = LoginType.oldscape;
							} else {
								WorldMapSection0.loginType = LoginType.field4091; // L: 740
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 729
							break; // L: 730
						case 14:
							Script.field1094 = Integer.parseInt(var2); // L: 750
							break; // L: 751
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 781
							break; // L: 782
						case 17:
							class6.field58 = var2; // L: 760
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 801
				isLowDetail = false; // L: 802
				class80.worldHost = this.getCodeBase().getHost(); // L: 804
				String var9 = FaceNormal.field2365.name; // L: 805
				byte var10 = 0; // L: 806

				try {
					SoundCache.idxCount = 21; // L: 809
					UserComparator10.cacheGamebuild = var10; // L: 810

					try {
						class35.operatingSystemName = System.getProperty("os.name"); // L: 812
					} catch (Exception var17) { // L: 814
						class35.operatingSystemName = "Unknown"; // L: 815
					}

					UserComparator5.formattedOperatingSystemName = class35.operatingSystemName.toLowerCase(); // L: 817

					try {
						class22.userHomeDirectory = System.getProperty("user.home"); // L: 819
						if (class22.userHomeDirectory != null) { // L: 820
							class22.userHomeDirectory = class22.userHomeDirectory + "/";
						}
					} catch (Exception var16) { // L: 822
					}

					try {
						if (UserComparator5.formattedOperatingSystemName.startsWith("win")) { // L: 824
							if (class22.userHomeDirectory == null) { // L: 825
								class22.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (class22.userHomeDirectory == null) { // L: 828
							class22.userHomeDirectory = System.getenv("HOME");
						}

						if (class22.userHomeDirectory != null) { // L: 830
							class22.userHomeDirectory = class22.userHomeDirectory + "/";
						}
					} catch (Exception var15) { // L: 832
					}

					if (class22.userHomeDirectory == null) { // L: 833
						class22.userHomeDirectory = "~/";
					}

					InterfaceParent.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class22.userHomeDirectory, "/tmp/", ""}; // L: 834
					PlayerType.cacheSubPaths = new String[]{".jagex_cache_" + UserComparator10.cacheGamebuild, ".file_store_" + UserComparator10.cacheGamebuild}; // L: 835

					label137:
					for (int var11 = 0; var11 < 4; ++var11) { // L: 836
						class12.cacheDir = Canvas.method393("oldschool", var9, var11); // L: 837
						if (!class12.cacheDir.exists()) { // L: 838
							class12.cacheDir.mkdirs();
						}

						File[] var12 = class12.cacheDir.listFiles(); // L: 839
						if (var12 == null) { // L: 840
							break;
						}

						File[] var22 = var12; // L: 842
						int var13 = 0;

						while (true) {
							if (var13 >= var22.length) {
								break label137;
							}

							File var14 = var22[var13]; // L: 844
							if (!FaceNormal.isWriteable(var14, false)) { // L: 846
								break;
							}

							++var13; // L: 843
						}
					}

					File var21 = class12.cacheDir; // L: 853
					FileSystem.FileSystem_cacheDir = var21; // L: 855
					if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 856
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true; // L: 857
					SoundCache.method830(); // L: 859
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(ScriptFrame.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 860
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(ScriptFrame.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 861
					class93.JagexCache_idxFiles = new BufferedFile[SoundCache.idxCount]; // L: 862

					for (var4 = 0; var4 < SoundCache.idxCount; ++var4) { // L: 863
						class93.JagexCache_idxFiles[var4] = new BufferedFile(new AccessFile(ScriptFrame.getFile("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0); // L: 864
					}
				} catch (Exception var18) { // L: 868
					class266.RunException_sendStackTrace((String)null, var18); // L: 869
				}

				class23.client = this; // L: 871
				RunException.clientType = clientType; // L: 872
				if (field643 == -1) { // L: 873
					field643 = 0; // L: 874
				}

				this.startThread(765, 503, 196); // L: 876
			}
		} catch (RuntimeException var19) {
			throw WorldMapDecoration.newRunException(var19, "client.init(" + ')');
		}
	} // L: 877

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1243838219"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1173
			long var2 = ObjectComposition.currentTimeMillis(); // L: 1176
			int var4 = (int)(var2 - class18.field159); // L: 1177
			class18.field159 = var2; // L: 1178
			if (var4 > 200) { // L: 1179
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1180
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1181
				var1 = true; // L: 1182
			} else if (NetCache.NetCache_socket == null) { // L: 1185
				var1 = false; // L: 1186
			} else {
				try {
					label238: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1190
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1191
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1192
							var6 = new Buffer(4); // L: 1193
							var6.writeByte(1); // L: 1194
							var6.writeMedium((int)var5.key); // L: 1195
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1196
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1197
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1198
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1199
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1201
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1202
							var6 = new Buffer(4); // L: 1203
							var6.writeByte(0); // L: 1204
							var6.writeMedium((int)var5.key); // L: 1205
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1206
							var5.removeDual(); // L: 1207
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1208
							--NetCache.NetCache_pendingWritesCount; // L: 1209
							++NetCache.NetCache_pendingResponsesCount; // L: 1210
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1212
							int var18 = NetCache.NetCache_socket.available(); // L: 1213
							if (var18 < 0) { // L: 1214
								throw new IOException();
							}

							if (var18 == 0) { // L: 1215
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1216
							byte var7 = 0; // L: 1217
							if (BuddyRankComparator.NetCache_currentResponse == null) { // L: 1218
								var7 = 8;
							} else if (NetCache.field3612 == 0) { // L: 1219
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1220
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1221
								if (var8 > var18) { // L: 1222
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1223
								if (NetCache.field3607 != 0) { // L: 1224
									for (var9 = 0; var9 < var8; ++var9) { // L: 1225
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3607;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1227
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1228
									break;
								}

								if (BuddyRankComparator.NetCache_currentResponse == null) { // L: 1229
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1230
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1231
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1232
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1233
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1234
									long var13 = (long)(var10 + (var9 << 16)); // L: 1235
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1236
									class8.field75 = true; // L: 1237
									if (var15 == null) { // L: 1238
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1239
										class8.field75 = false; // L: 1240
									}

									if (var15 == null) { // L: 1242
										throw new IOException(); // L: 1243
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1245
									BuddyRankComparator.NetCache_currentResponse = var15; // L: 1246
									SoundSystem.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + BuddyRankComparator.NetCache_currentResponse.padding); // L: 1247
									SoundSystem.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1248
									SoundSystem.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1249
									NetCache.field3612 = 8; // L: 1250
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1251
								} else if (NetCache.field3612 == 0) { // L: 1254
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1255
										NetCache.field3612 = 1; // L: 1256
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1257
									} else {
										BuddyRankComparator.NetCache_currentResponse = null; // L: 1261
									}
								}
							} else {
								var8 = SoundSystem.NetCache_responseArchiveBuffer.array.length - BuddyRankComparator.NetCache_currentResponse.padding; // L: 1267
								var9 = 512 - NetCache.field3612; // L: 1268
								if (var9 > var8 - SoundSystem.NetCache_responseArchiveBuffer.offset) { // L: 1269
									var9 = var8 - SoundSystem.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1270
									var9 = var18;
								}

								NetCache.NetCache_socket.read(SoundSystem.NetCache_responseArchiveBuffer.array, SoundSystem.NetCache_responseArchiveBuffer.offset, var9); // L: 1271
								if (NetCache.field3607 != 0) { // L: 1272
									for (var10 = 0; var10 < var9; ++var10) { // L: 1273
										var10000 = SoundSystem.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + SoundSystem.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field3607;
									}
								}

								var25 = SoundSystem.NetCache_responseArchiveBuffer; // L: 1275
								var25.offset += var9;
								NetCache.field3612 += var9; // L: 1276
								if (var8 == SoundSystem.NetCache_responseArchiveBuffer.offset) { // L: 1277
									if (BuddyRankComparator.NetCache_currentResponse.key == 16711935L) { // L: 1278
										class125.NetCache_reference = SoundSystem.NetCache_responseArchiveBuffer; // L: 1279

										for (var10 = 0; var10 < 256; ++var10) { // L: 1280
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1281
											if (var19 != null) { // L: 1282
												class125.NetCache_reference.offset = var10 * 8 + 5; // L: 1283
												var12 = class125.NetCache_reference.readInt(); // L: 1284
												int var20 = class125.NetCache_reference.readInt(); // L: 1285
												var19.loadIndex(var12, var20); // L: 1286
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1291
										NetCache.NetCache_crc.update(SoundSystem.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1292
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1293
										if (var10 != BuddyRankComparator.NetCache_currentResponse.crc) { // L: 1294
											try {
												NetCache.NetCache_socket.close(); // L: 1296
											} catch (Exception var23) { // L: 1298
											}

											++NetCache.NetCache_crcMismatches; // L: 1299
											NetCache.NetCache_socket = null; // L: 1300
											NetCache.field3607 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1301
											var1 = false; // L: 1302
											break label238;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1305
										NetCache.NetCache_ioExceptions = 0; // L: 1306
										BuddyRankComparator.NetCache_currentResponse.archive.write((int)(BuddyRankComparator.NetCache_currentResponse.key & 65535L), SoundSystem.NetCache_responseArchiveBuffer.array, (BuddyRankComparator.NetCache_currentResponse.key & 16711680L) == 16711680L, class8.field75); // L: 1307
									}

									BuddyRankComparator.NetCache_currentResponse.remove(); // L: 1309
									if (class8.field75) { // L: 1310
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1311
									}

									NetCache.field3612 = 0; // L: 1312
									BuddyRankComparator.NetCache_currentResponse = null; // L: 1313
									SoundSystem.NetCache_responseArchiveBuffer = null; // L: 1314
								} else {
									if (NetCache.field3612 != 512) { // L: 1316
										break;
									}

									NetCache.field3612 = 0;
								}
							}
						}

						var1 = true; // L: 1320
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1324
					} catch (Exception var22) { // L: 1326
					}

					++NetCache.NetCache_ioExceptions; // L: 1327
					NetCache.NetCache_socket = null; // L: 1328
					var1 = false; // L: 1329
				}
			}

			if (!var1) { // L: 1333
				this.doCycleJs5Connect();
			}

		}
	} // L: 1334

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1090327888"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1337
			this.error("js5crc"); // L: 1338
			gameState = 1000; // L: 1339
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1342
				if (gameState <= 5) { // L: 1343
					this.error("js5io"); // L: 1344
					gameState = 1000; // L: 1345
					return; // L: 1346
				}

				field670 = 3000; // L: 1349
				NetCache.NetCache_ioExceptions = 3; // L: 1350
			}

			if (--field670 + 1 <= 0) { // L: 1353
				try {
					if (js5ConnectState == 0) { // L: 1355
						class159.js5SocketTask = GameEngine.taskHandler.newSocketTask(class80.worldHost, DesktopPlatformInfoProvider.currentPort); // L: 1356
						++js5ConnectState; // L: 1357
					}

					if (js5ConnectState == 1) { // L: 1359
						if (class159.js5SocketTask.status == 2) { // L: 1360
							this.js5Error(-1); // L: 1361
							return; // L: 1362
						}

						if (class159.js5SocketTask.status == 1) { // L: 1364
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1366
						if (useBufferedSocket) { // L: 1367
							Socket var2 = (Socket)class159.js5SocketTask.result; // L: 1369
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1371
							WorldMapID.js5Socket = var1; // L: 1373
						} else {
							WorldMapID.js5Socket = new NetSocket((Socket)class159.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1376
						}

						Buffer var11 = new Buffer(5); // L: 1378
						var11.writeByte(15); // L: 1379
						var11.writeInt(196); // L: 1380
						WorldMapID.js5Socket.write(var11.array, 0, 5); // L: 1381
						++js5ConnectState; // L: 1382
						ArchiveDiskAction.field3556 = ObjectComposition.currentTimeMillis(); // L: 1383
					}

					if (js5ConnectState == 3) { // L: 1385
						if (WorldMapID.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1386
							int var5 = WorldMapID.js5Socket.readUnsignedByte(); // L: 1387
							if (var5 != 0) { // L: 1388
								this.js5Error(var5); // L: 1389
								return; // L: 1390
							}

							++js5ConnectState; // L: 1392
						} else if (ObjectComposition.currentTimeMillis() - ArchiveDiskAction.field3556 > 30000L) { // L: 1395
							this.js5Error(-2); // L: 1396
							return; // L: 1397
						}
					}

					if (js5ConnectState == 4) { // L: 1401
						AbstractSocket var12 = WorldMapID.js5Socket; // L: 1402
						boolean var6 = gameState > 20; // L: 1403
						if (NetCache.NetCache_socket != null) { // L: 1405
							try {
								NetCache.NetCache_socket.close(); // L: 1407
							} catch (Exception var9) { // L: 1409
							}

							NetCache.NetCache_socket = null; // L: 1410
						}

						NetCache.NetCache_socket = var12; // L: 1412
						StudioGame.method4847(var6); // L: 1413
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1414
						BuddyRankComparator.NetCache_currentResponse = null; // L: 1415
						SoundSystem.NetCache_responseArchiveBuffer = null; // L: 1416
						NetCache.field3612 = 0; // L: 1417

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1419
							if (var3 == null) { // L: 1420
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1426
									if (var3 == null) { // L: 1427
										if (NetCache.field3607 != 0) { // L: 1433
											try {
												Buffer var13 = new Buffer(4); // L: 1435
												var13.writeByte(4); // L: 1436
												var13.writeByte(NetCache.field3607); // L: 1437
												var13.writeShort(0); // L: 1438
												NetCache.NetCache_socket.write(var13.array, 0, 4); // L: 1439
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1443
												} catch (Exception var7) { // L: 1445
												}

												++NetCache.NetCache_ioExceptions; // L: 1446
												NetCache.NetCache_socket = null; // L: 1447
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1450
										class18.field159 = ObjectComposition.currentTimeMillis(); // L: 1451
										class159.js5SocketTask = null; // L: 1453
										WorldMapID.js5Socket = null; // L: 1454
										js5ConnectState = 0; // L: 1455
										js5Errors = 0; // L: 1456
										return; // L: 1462
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1428
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1429
									++NetCache.NetCache_pendingWritesCount; // L: 1430
									--NetCache.NetCache_pendingResponsesCount; // L: 1431
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1421
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1422
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1423
						}
					}
				} catch (IOException var10) { // L: 1459
					this.js5Error(-3); // L: 1460
				}

			}
		}
	} // L: 1340

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1995142761"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class159.js5SocketTask = null; // L: 1465
		WorldMapID.js5Socket = null; // L: 1466
		js5ConnectState = 0; // L: 1467
		if (WorldMapLabelSize.worldPort == DesktopPlatformInfoProvider.currentPort) { // L: 1468
			DesktopPlatformInfoProvider.currentPort = GrandExchangeOfferTotalQuantityComparator.js5Port;
		} else {
			DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort; // L: 1469
		}

		++js5Errors; // L: 1470
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1471
			if (gameState <= 5) { // L: 1472
				this.error("js5connect_full"); // L: 1473
				gameState = 1000; // L: 1474
			} else {
				field670 = 3000; // L: 1476
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1478
			this.error("js5connect_outofdate"); // L: 1479
			gameState = 1000; // L: 1480
		} else if (js5Errors >= 4) { // L: 1482
			if (gameState <= 5) { // L: 1483
				this.error("js5connect"); // L: 1484
				gameState = 1000; // L: 1485
			} else {
				field670 = 3000; // L: 1487
			}
		}

	} // L: 1489

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-607645058"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1923
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1924

		try {
			if (loginState == 0) { // L: 1926
				if (ClientPreferences.secureRandom == null && (secureRandomFuture.isDone() || field673 > 250)) { // L: 1927
					ClientPreferences.secureRandom = secureRandomFuture.get(); // L: 1928
					secureRandomFuture.shutdown(); // L: 1929
					secureRandomFuture = null; // L: 1930
				}

				if (ClientPreferences.secureRandom != null) { // L: 1932
					if (var1 != null) { // L: 1933
						((AbstractSocket)var1).close(); // L: 1934
						var1 = null; // L: 1935
					}

					UserComparator9.socketTask = null; // L: 1937
					hadNetworkError = false; // L: 1938
					field673 = 0; // L: 1939
					loginState = 1; // L: 1940
				}
			}

			if (loginState == 1) { // L: 1943
				if (UserComparator9.socketTask == null) { // L: 1944
					UserComparator9.socketTask = GameEngine.taskHandler.newSocketTask(class80.worldHost, DesktopPlatformInfoProvider.currentPort); // L: 1945
				}

				if (UserComparator9.socketTask.status == 2) { // L: 1947
					throw new IOException();
				}

				if (UserComparator9.socketTask.status == 1) { // L: 1948
					if (useBufferedSocket) { // L: 1949
						Socket var4 = (Socket)UserComparator9.socketTask.result; // L: 1951
						BufferedNetSocket var3 = new BufferedNetSocket(var4, 40000, 5000); // L: 1953
						var1 = var3; // L: 1955
					} else {
						var1 = new NetSocket((Socket)UserComparator9.socketTask.result, GameEngine.taskHandler, 5000); // L: 1958
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 1960
					UserComparator9.socketTask = null; // L: 1961
					loginState = 2; // L: 1962
				}
			}

			PacketBufferNode var26;
			if (loginState == 2) { // L: 1965
				packetWriter.clearBuffer(); // L: 1966
				var26 = class22.method247(); // L: 1967
				var26.packetBuffer.writeByte(LoginPacket.field2806.id); // L: 1968
				packetWriter.addNode(var26); // L: 1969
				packetWriter.flush(); // L: 1970
				var2.offset = 0; // L: 1971
				loginState = 3; // L: 1972
			}

			boolean var13;
			int var14;
			if (loginState == 3) { // L: 1974
				if (DesktopPlatformInfoProvider.pcmPlayer0 != null) { // L: 1975
					DesktopPlatformInfoProvider.pcmPlayer0.method733();
				}

				if (MouseRecorder.pcmPlayer1 != null) { // L: 1976
					MouseRecorder.pcmPlayer1.method733();
				}

				var13 = true; // L: 1977
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 1978 1979
					var13 = false;
				}

				if (var13) { // L: 1981
					var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 1982
					if (DesktopPlatformInfoProvider.pcmPlayer0 != null) { // L: 1983
						DesktopPlatformInfoProvider.pcmPlayer0.method733();
					}

					if (MouseRecorder.pcmPlayer1 != null) { // L: 1984
						MouseRecorder.pcmPlayer1.method733();
					}

					if (var14 != 0) { // L: 1985
						MouseHandler.getLoginError(var14); // L: 1986
						return; // L: 1987
					}

					var2.offset = 0; // L: 1989
					loginState = 4; // L: 1990
				}
			}

			int var41;
			if (loginState == 4) { // L: 1993
				if (var2.offset < 8) { // L: 1994
					var41 = ((AbstractSocket)var1).available(); // L: 1995
					if (var41 > 8 - var2.offset) { // L: 1996
						var41 = 8 - var2.offset;
					}

					if (var41 > 0) { // L: 1997
						((AbstractSocket)var1).read(var2.array, var2.offset, var41); // L: 1998
						var2.offset += var41; // L: 1999
					}
				}

				if (var2.offset == 8) { // L: 2002
					var2.offset = 0; // L: 2003
					GrandExchangeOfferAgeComparator.field3634 = var2.readLong(); // L: 2004
					loginState = 5; // L: 2005
				}
			}

			int var7;
			int var9;
			int var15;
			if (loginState == 5) { // L: 2008
				packetWriter.packetBuffer.offset = 0; // L: 2009
				packetWriter.clearBuffer(); // L: 2010
				PacketBuffer var27 = new PacketBuffer(500); // L: 2011
				int[] var29 = new int[]{ClientPreferences.secureRandom.nextInt(), ClientPreferences.secureRandom.nextInt(), ClientPreferences.secureRandom.nextInt(), ClientPreferences.secureRandom.nextInt()}; // L: 2012 2013 2014 2015 2016
				var27.offset = 0; // L: 2017
				var27.writeByte(1); // L: 2018
				var27.writeInt(var29[0]); // L: 2019
				var27.writeInt(var29[1]); // L: 2020
				var27.writeInt(var29[2]); // L: 2021
				var27.writeInt(var29[3]); // L: 2022
				var27.writeLong(GrandExchangeOfferAgeComparator.field3634); // L: 2023
				int var11;
				if (gameState == 40) { // L: 2024
					var27.writeInt(HealthBarDefinition.field1603[0]); // L: 2025
					var27.writeInt(HealthBarDefinition.field1603[1]); // L: 2026
					var27.writeInt(HealthBarDefinition.field1603[2]); // L: 2027
					var27.writeInt(HealthBarDefinition.field1603[3]); // L: 2028
				} else {
					var27.writeByte(field676.rsOrdinal()); // L: 2031
					switch(field676.field1472) { // L: 2032
					case 0:
						var27.offset += 4; // L: 2057
						break;
					case 1:
					case 3:
						var27.writeMedium(class5.field53); // L: 2051
						++var27.offset; // L: 2052
						break; // L: 2053
					case 2:
						LinkedHashMap var6 = ObjectComposition.clientPreferences.parameters; // L: 2036
						String var8 = Login.Login_username; // L: 2038
						var9 = var8.length(); // L: 2040
						int var10 = 0; // L: 2041

						for (var11 = 0; var11 < var9; ++var11) { // L: 2042
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var27.writeInt((Integer)var6.get(var10)); // L: 2045
					}

					var27.writeByte(class386.field4210.rsOrdinal()); // L: 2061
					var27.writeStringCp1252NullTerminated(Login.Login_password); // L: 2062
				}

				var27.encryptRsa(class82.field1018, class82.field1017); // L: 2064
				HealthBarDefinition.field1603 = var29; // L: 2065
				PacketBufferNode var5 = class22.method247(); // L: 2066
				var5.packetBuffer.offset = 0; // L: 2067
				if (gameState == 40) { // L: 2068
					var5.packetBuffer.writeByte(LoginPacket.field2799.id); // L: 2069
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2802.id); // L: 2072
				}

				var5.packetBuffer.writeShort(0); // L: 2074
				var15 = var5.packetBuffer.offset; // L: 2075
				var5.packetBuffer.writeInt(196); // L: 2076
				var5.packetBuffer.writeInt(1); // L: 2077
				var5.packetBuffer.writeByte(clientType); // L: 2078
				var5.packetBuffer.writeByte(field643); // L: 2079
				var5.packetBuffer.writeBytes(var27.array, 0, var27.offset); // L: 2080
				var7 = var5.packetBuffer.offset; // L: 2081
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2082
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2083
				var5.packetBuffer.writeShort(class32.canvasWidth); // L: 2084
				var5.packetBuffer.writeShort(ReflectionCheck.canvasHeight); // L: 2085
				PacketBuffer var39 = var5.packetBuffer; // L: 2086
				if (randomDatData != null) { // L: 2088
					var39.writeBytes(randomDatData, 0, randomDatData.length); // L: 2089
				} else {
					byte[] var16 = new byte[24]; // L: 2094

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 2096
						JagexCache.JagexCache_randomDat.readFully(var16); // L: 2097

						for (var11 = 0; var11 < 24 && var16[var11] == 0; ++var11) { // L: 2098 2099 2100
						}

						if (var11 >= 24) { // L: 2102
							throw new IOException();
						}
					} catch (Exception var24) {
						for (int var12 = 0; var12 < 24; ++var12) { // L: 2105
							var16[var12] = -1;
						}
					}

					var39.writeBytes(var16, 0, var16.length); // L: 2110
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(class363.field4079); // L: 2112
				var5.packetBuffer.writeInt(Script.field1094); // L: 2113
				Buffer var18 = new Buffer(class10.platformInfo.size()); // L: 2114
				class10.platformInfo.write(var18); // L: 2115
				var5.packetBuffer.writeBytes(var18.array, 0, var18.array.length); // L: 2116
				var5.packetBuffer.writeByte(clientType); // L: 2117
				var5.packetBuffer.writeInt(0); // L: 2118
				var5.packetBuffer.writeInt(UrlRequest.archive6.hash); // L: 2119
				var5.packetBuffer.method6612(0); // L: 2120
				var5.packetBuffer.method6612(class8.archive17.hash); // L: 2121
				var5.packetBuffer.writeIntME(class27.archive1.hash); // L: 2122
				var5.packetBuffer.method6612(ClanChannel.archive3.hash); // L: 2123
				var5.packetBuffer.writeIntME(class5.archive20.hash); // L: 2124
				var5.packetBuffer.writeInt(class179.archive19.hash); // L: 2125
				var5.packetBuffer.method6611(NetCache.archive0.hash); // L: 2126
				var5.packetBuffer.writeInt(ClanMate.archive15.hash); // L: 2127
				var5.packetBuffer.writeInt(SoundCache.archive10.hash); // L: 2128
				var5.packetBuffer.writeInt(class8.archive2.hash); // L: 2129
				var5.packetBuffer.method6611(WorldMapManager.archive11.hash); // L: 2130
				var5.packetBuffer.writeIntME(class32.archive4.hash); // L: 2131
				var5.packetBuffer.writeInt(Decimator.archive13.hash); // L: 2132
				var5.packetBuffer.writeIntME(class125.archive14.hash); // L: 2133
				var5.packetBuffer.method6612(CollisionMap.archive9.hash); // L: 2134
				var5.packetBuffer.method6611(UserComparator5.archive12.hash); // L: 2135
				var5.packetBuffer.writeIntME(FontName.archive18.hash); // L: 2136
				var5.packetBuffer.method6611(class247.archive5.hash); // L: 2137
				var5.packetBuffer.writeInt(Decimator.archive7.hash); // L: 2138
				var5.packetBuffer.writeInt(GrandExchangeOfferAgeComparator.archive8.hash); // L: 2139
				var5.packetBuffer.xteaEncrypt(var29, var7, var5.packetBuffer.offset); // L: 2140
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var15); // L: 2141
				packetWriter.addNode(var5); // L: 2142
				packetWriter.flush(); // L: 2143
				packetWriter.isaacCipher = new IsaacCipher(var29); // L: 2144
				int[] var43 = new int[4]; // L: 2145

				for (var11 = 0; var11 < 4; ++var11) { // L: 2146
					var43[var11] = var29[var11] + 50;
				}

				var2.newIsaacCipher(var43); // L: 2147
				loginState = 6; // L: 2148
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2150 2151
				var41 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2152
				if (var41 == 21 && gameState == 20) { // L: 2153
					loginState = 12; // L: 2154
				} else if (var41 == 2) { // L: 2156
					loginState = 14; // L: 2157
				} else if (var41 == 15 && gameState == 40) { // L: 2159
					packetWriter.serverPacketLength = -1; // L: 2160
					loginState = 19; // L: 2161
				} else if (var41 == 64) { // L: 2163
					loginState = 10; // L: 2164
				} else if (var41 == 23 && field845 < 1) { // L: 2166
					++field845; // L: 2167
					loginState = 0; // L: 2168
				} else if (var41 == 29) { // L: 2170
					loginState = 17; // L: 2171
				} else {
					if (var41 != 69) { // L: 2173
						MouseHandler.getLoginError(var41); // L: 2177
						return; // L: 2178
					}

					loginState = 7; // L: 2174
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2182 2183
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2184
				var2.offset = 0; // L: 2185
				class27.field231 = var2.readUnsignedShort(); // L: 2186
				loginState = 8; // L: 2187
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class27.field231) { // L: 2190 2191
				var2.offset = 0; // L: 2192
				((AbstractSocket)var1).read(var2.array, var2.offset, class27.field231); // L: 2193
				class34[] var28 = new class34[]{class34.field256}; // L: 2196
				class34 var30 = var28[var2.readUnsignedByte()]; // L: 2198

				try {
					class31 var33 = class374.method6477(var30); // L: 2200
					this.field680 = new class35(var2, var33); // L: 2201
					loginState = 9; // L: 2202
				} catch (Exception var23) { // L: 2204
					MouseHandler.getLoginError(22); // L: 2205
					return; // L: 2206
				}
			}

			if (loginState == 9 && this.field680.method342()) { // L: 2210 2211
				this.field679 = this.field680.method331(); // L: 2212
				this.field680.method332(); // L: 2213
				this.field680 = null; // L: 2214
				if (this.field679 == null) { // L: 2215
					MouseHandler.getLoginError(22); // L: 2216
					return; // L: 2217
				}

				packetWriter.clearBuffer(); // L: 2219
				var26 = class22.method247(); // L: 2220
				var26.packetBuffer.writeByte(LoginPacket.field2803.id); // L: 2221
				var26.packetBuffer.writeShort(this.field679.offset); // L: 2222
				var26.packetBuffer.method6768(this.field679); // L: 2223
				packetWriter.addNode(var26); // L: 2224
				packetWriter.flush(); // L: 2225
				this.field679 = null; // L: 2226
				loginState = 6; // L: 2227
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2230 2231
				ChatChannel.field1110 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2232
				loginState = 11; // L: 2233
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= ChatChannel.field1110) { // L: 2236 2237
				((AbstractSocket)var1).read(var2.array, 0, ChatChannel.field1110); // L: 2238
				var2.offset = 0; // L: 2239
				loginState = 6; // L: 2240
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2243 2244
				field675 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2245
				loginState = 13; // L: 2246
			}

			if (loginState == 13) { // L: 2249
				field673 = 0; // L: 2250
				class260.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field675 / 60 + " seconds."); // L: 2251
				if (--field675 <= 0) { // L: 2252
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2255 2256
					class20.field184 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2257
					loginState = 15; // L: 2258
				}

				boolean var42;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= class20.field184) { // L: 2261 2262
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2263
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2264
					var2.offset = 0; // L: 2265
					var42 = false; // L: 2266
					if (var13) { // L: 2267
						var14 = var2.readByteIsaac() << 24; // L: 2268
						var14 |= var2.readByteIsaac() << 16; // L: 2269
						var14 |= var2.readByteIsaac() << 8; // L: 2270
						var14 |= var2.readByteIsaac(); // L: 2271
						String var38 = Login.Login_username; // L: 2273
						var7 = var38.length(); // L: 2275
						int var19 = 0; // L: 2276
						var9 = 0; // L: 2277

						while (true) {
							if (var9 >= var7) {
								if (ObjectComposition.clientPreferences.parameters.size() >= 10 && !ObjectComposition.clientPreferences.parameters.containsKey(var19)) { // L: 2281 2282
									Iterator var40 = ObjectComposition.clientPreferences.parameters.entrySet().iterator(); // L: 2283
									var40.next(); // L: 2284
									var40.remove(); // L: 2285
								}

								ObjectComposition.clientPreferences.parameters.put(var19, var14); // L: 2288
								break;
							}

							var19 = (var19 << 5) - var19 + var38.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2290
						ObjectComposition.clientPreferences.rememberedUsername = Login.Login_username; // L: 2291
					} else {
						ObjectComposition.clientPreferences.rememberedUsername = null; // L: 2294
					}

					TileItem.savePreferences(); // L: 2296
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2297
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2298
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2299
					localPlayerIndex <<= 8; // L: 2300
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2301
					field759 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2302
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2303
					var2.offset = 0; // L: 2304
					ServerPacket[] var35 = class24.ServerPacket_values(); // L: 2305
					var15 = var2.readSmartByteShortIsaac(); // L: 2306
					if (var15 < 0 || var15 >= var35.length) { // L: 2307
						throw new IOException(var15 + " " + var2.offset);
					}

					packetWriter.serverPacket = var35[var15]; // L: 2308
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2309
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2310
					var2.offset = 0; // L: 2311
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2312

					try {
						class42.method421(class23.client, "zap"); // L: 2314
					} catch (Throwable var22) { // L: 2316
					}

					loginState = 16; // L: 2317
				}

				if (loginState != 16) { // L: 2320
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2440 2441
						var2.offset = 0; // L: 2442
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2443
						var2.offset = 0; // L: 2444
						WorldMapData_1.field2008 = var2.readUnsignedShort(); // L: 2445
						loginState = 18; // L: 2446
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= WorldMapData_1.field2008) { // L: 2449 2450
						var2.offset = 0; // L: 2451
						((AbstractSocket)var1).read(var2.array, 0, WorldMapData_1.field2008); // L: 2452
						var2.offset = 0; // L: 2453
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2454
						String var34 = var2.readStringCp1252NullTerminated(); // L: 2455
						String var37 = var2.readStringCp1252NullTerminated(); // L: 2456
						class260.setLoginResponseString(var36, var34, var37); // L: 2457
						class12.updateGameState(10); // L: 2458
					}

					if (loginState == 19) { // L: 2461
						if (packetWriter.serverPacketLength == -1) { // L: 2462
							if (((AbstractSocket)var1).available() < 2) { // L: 2463
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2464
							var2.offset = 0; // L: 2465
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2466
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2468
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2469
							var2.offset = 0; // L: 2470
							var41 = packetWriter.serverPacketLength; // L: 2471
							timer.method5594(); // L: 2472
							WorldMapSectionType.method3594(); // L: 2473
							Coord.updatePlayer(var2); // L: 2474
							if (var41 != var2.offset) { // L: 2475
								throw new RuntimeException(); // L: 2476
							}
						}
					} else {
						++field673; // L: 2480
						if (field673 > 2000) { // L: 2481
							if (field845 < 1) { // L: 2482
								if (DesktopPlatformInfoProvider.currentPort == WorldMapLabelSize.worldPort) { // L: 2483
									DesktopPlatformInfoProvider.currentPort = GrandExchangeOfferTotalQuantityComparator.js5Port;
								} else {
									DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort; // L: 2484
								}

								++field845; // L: 2485
								loginState = 0; // L: 2486
							} else {
								MouseHandler.getLoginError(-3); // L: 2489
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2321
						var2.offset = 0; // L: 2322
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2323
						timer.method5592(); // L: 2324
						mouseLastLastPressedTimeMillis = -1L; // L: 2327
						Skills.mouseRecorder.index = 0; // L: 2328
						WorldMapSection1.hasFocus = true; // L: 2329
						hadFocus = true; // L: 2330
						field809 = -1L; // L: 2331
						SoundCache.method811(); // L: 2332
						packetWriter.clearBuffer(); // L: 2333
						packetWriter.packetBuffer.offset = 0; // L: 2334
						packetWriter.serverPacket = null; // L: 2335
						packetWriter.field1411 = null; // L: 2336
						packetWriter.field1412 = null; // L: 2337
						packetWriter.field1400 = null; // L: 2338
						packetWriter.serverPacketLength = 0; // L: 2339
						packetWriter.field1409 = 0; // L: 2340
						rebootTimer = 0; // L: 2341
						logoutTimer = 0; // L: 2342
						hintArrowType = 0; // L: 2343
						class1.method11(); // L: 2344
						ArchiveDiskActionHandler.method4867(0); // L: 2345
						class43.method437(); // L: 2346
						isItemSelected = 0; // L: 2347
						isSpellSelected = false; // L: 2348
						soundEffectCount = 0; // L: 2349
						camAngleY = 0; // L: 2350
						oculusOrbState = 0; // L: 2351
						UserComparator3.field1444 = null; // L: 2352
						minimapState = 0; // L: 2353
						field872 = -1; // L: 2354
						destinationX = 0; // L: 2355
						destinationY = 0; // L: 2356
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2357
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2358
						npcCount = 0; // L: 2359
						Player.method2110(); // L: 2360

						for (var41 = 0; var41 < 2048; ++var41) { // L: 2361
							players[var41] = null;
						}

						for (var41 = 0; var41 < 32768; ++var41) { // L: 2362
							npcs[var41] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2363
						projectiles.clear(); // L: 2364
						graphicsObjects.clear(); // L: 2365

						int var20;
						for (var41 = 0; var41 < 4; ++var41) { // L: 2366
							for (var14 = 0; var14 < 104; ++var14) { // L: 2367
								for (var20 = 0; var20 < 104; ++var20) { // L: 2368
									groundItems[var41][var14][var20] = null; // L: 2369
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2373
						NetSocket.friendSystem.clear(); // L: 2374

						for (var41 = 0; var41 < VarpDefinition.VarpDefinition_fileCount; ++var41) { // L: 2375
							VarpDefinition var32 = ClanSettings.VarpDefinition_get(var41); // L: 2376
							if (var32 != null) { // L: 2377
								Varps.Varps_temp[var41] = 0; // L: 2378
								Varps.Varps_main[var41] = 0; // L: 2379
							}
						}

						GrandExchangeOfferOwnWorldComparator.varcs.clearTransient(); // L: 2382
						followerIndex = -1; // L: 2383
						if (rootInterface != -1) { // L: 2384
							var41 = rootInterface; // L: 2385
							if (var41 != -1 && Widget.Widget_loadedInterfaces[var41]) { // L: 2387 2388
								HealthBarUpdate.Widget_archive.clearFilesGroup(var41); // L: 2389
								if (Widget.Widget_interfaceComponents[var41] != null) { // L: 2390
									var42 = true; // L: 2391

									for (var20 = 0; var20 < Widget.Widget_interfaceComponents[var41].length; ++var20) { // L: 2392
										if (Widget.Widget_interfaceComponents[var41][var20] != null) { // L: 2393
											if (Widget.Widget_interfaceComponents[var41][var20].type != 2) { // L: 2394
												Widget.Widget_interfaceComponents[var41][var20] = null;
											} else {
												var42 = false; // L: 2395
											}
										}
									}

									if (var42) { // L: 2398
										Widget.Widget_interfaceComponents[var41] = null;
									}

									Widget.Widget_loadedInterfaces[var41] = false; // L: 2399
								}
							}
						}

						for (InterfaceParent var31 = (InterfaceParent)interfaceParents.first(); var31 != null; var31 = (InterfaceParent)interfaceParents.next()) { // L: 2402
							class43.closeInterface(var31, true); // L: 2403
						}

						rootInterface = -1; // L: 2405
						interfaceParents = new NodeHashTable(8); // L: 2406
						meslayerContinueWidget = null; // L: 2407
						class1.method11(); // L: 2408
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2409

						for (var41 = 0; var41 < 8; ++var41) { // L: 2410
							playerMenuActions[var41] = null; // L: 2411
							playerOptionsPriorities[var41] = false; // L: 2412
						}

						Skeleton.method3921(); // L: 2414
						isLoading = true; // L: 2415

						for (var41 = 0; var41 < 100; ++var41) { // L: 2416
							field719[var41] = true;
						}

						var26 = class21.getPacketBufferNode(ClientPacket.field2662, packetWriter.isaacCipher); // L: 2419
						var26.packetBuffer.writeByte(SpotAnimationDefinition.getWindowedMode()); // L: 2420
						var26.packetBuffer.writeShort(class32.canvasWidth); // L: 2421
						var26.packetBuffer.writeShort(ReflectionCheck.canvasHeight); // L: 2422
						packetWriter.addNode(var26); // L: 2423
						WorldMapRegion.friendsChat = null; // L: 2425
						NPCComposition.guestClanSettings = null; // L: 2426
						Arrays.fill(currentClanSettings, (Object)null); // L: 2427
						ApproximateRouteStrategy.guestClanChannel = null; // L: 2428
						Arrays.fill(currentClanChannels, (Object)null); // L: 2429

						for (var41 = 0; var41 < 8; ++var41) { // L: 2430
							grandExchangeOffers[var41] = new GrandExchangeOffer();
						}

						BuddyRankComparator.grandExchangeEvents = null; // L: 2431
						Coord.updatePlayer(var2); // L: 2433
						GrandExchangeOfferOwnWorldComparator.field632 = -1; // L: 2434
						class339.loadRegions(false, var2); // L: 2435
						packetWriter.serverPacket = null; // L: 2436
					}

				}
			}
		} catch (IOException var25) { // L: 2493
			if (field845 < 1) { // L: 2494
				if (DesktopPlatformInfoProvider.currentPort == WorldMapLabelSize.worldPort) { // L: 2495
					DesktopPlatformInfoProvider.currentPort = GrandExchangeOfferTotalQuantityComparator.js5Port;
				} else {
					DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort; // L: 2496
				}

				++field845; // L: 2497
				loginState = 0; // L: 2498
			} else {
				MouseHandler.getLoginError(-2); // L: 2501
			}
		}
	} // L: 2253 2438 2478 2487 2490 2499 2502 2504

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1496762169"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2716
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2717
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2718
			hadNetworkError = false; // L: 2719
			NetFileRequest.method4912(); // L: 2720
		} else {
			if (!isMenuOpen) { // L: 2723
				NetSocket.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1192(packetWriter); ++var1) { // L: 2724 2725
			}

			if (gameState == 30) { // L: 2727
				int var2;
				PacketBufferNode var14;
				while (class20.method231()) { // L: 2728
					var14 = class21.getPacketBufferNode(ClientPacket.field2584, packetWriter.isaacCipher); // L: 2729
					var14.packetBuffer.writeByte(0); // L: 2730
					var2 = var14.packetBuffer.offset; // L: 2731
					UserComparator3.performReflectionCheck(var14.packetBuffer); // L: 2732
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 2733
					packetWriter.addNode(var14); // L: 2734
				}

				if (timer.field3769) { // L: 2736
					var14 = class21.getPacketBufferNode(ClientPacket.field2645, packetWriter.isaacCipher); // L: 2738
					var14.packetBuffer.writeByte(0); // L: 2739
					var2 = var14.packetBuffer.offset; // L: 2740
					timer.write(var14.packetBuffer); // L: 2741
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 2742
					packetWriter.addNode(var14); // L: 2743
					timer.method5593(); // L: 2744
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
				synchronized(Skills.mouseRecorder.lock) { // L: 2747
					if (!field889) { // L: 2748
						Skills.mouseRecorder.index = 0; // L: 2834
					} else if (MouseHandler.MouseHandler_lastButton != 0 || Skills.mouseRecorder.index >= 40) { // L: 2749
						PacketBufferNode var15 = null; // L: 2751
						var3 = 0; // L: 2752
						var4 = 0; // L: 2753
						var5 = 0; // L: 2754
						var6 = 0; // L: 2755

						for (var7 = 0; var7 < Skills.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 2756 2757
							var4 = var7; // L: 2758
							var8 = Skills.mouseRecorder.ys[var7]; // L: 2759
							if (var8 < -1) { // L: 2760
								var8 = -1;
							} else if (var8 > 65534) { // L: 2761
								var8 = 65534;
							}

							var9 = Skills.mouseRecorder.xs[var7]; // L: 2762
							if (var9 < -1) { // L: 2763
								var9 = -1;
							} else if (var9 > 65534) { // L: 2764
								var9 = 65534;
							}

							if (var9 != field651 || var8 != field812) { // L: 2765
								if (var15 == null) { // L: 2768
									var15 = class21.getPacketBufferNode(ClientPacket.field2628, packetWriter.isaacCipher); // L: 2769
									var15.packetBuffer.writeByte(0); // L: 2770
									var3 = var15.packetBuffer.offset; // L: 2771
									var10000 = var15.packetBuffer; // L: 2772
									var10000.offset += 2;
									var5 = 0; // L: 2773
									var6 = 0; // L: 2774
								}

								if (-1L != field653) { // L: 2779
									var10 = var9 - field651; // L: 2780
									var11 = var8 - field812; // L: 2781
									var12 = (int)((Skills.mouseRecorder.millis[var7] - field653) / 20L); // L: 2782
									var5 = (int)((long)var5 + (Skills.mouseRecorder.millis[var7] - field653) % 20L); // L: 2783
								} else {
									var10 = var9; // L: 2786
									var11 = var8; // L: 2787
									var12 = Integer.MAX_VALUE; // L: 2788
								}

								field651 = var9; // L: 2790
								field812 = var8; // L: 2791
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2792
									var10 += 32; // L: 2793
									var11 += 32; // L: 2794
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2795
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2797
									var10 += 128; // L: 2798
									var11 += 128; // L: 2799
									var15.packetBuffer.writeByte(var12 + 128); // L: 2800
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2801
								} else if (var12 < 32) { // L: 2803
									var15.packetBuffer.writeByte(var12 + 192); // L: 2804
									if (var9 != -1 && var8 != -1) { // L: 2805
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 2806
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 2809
									if (var9 != -1 && var8 != -1) { // L: 2810
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 2811
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 2813
								field653 = Skills.mouseRecorder.millis[var7]; // L: 2814
							}
						}

						if (var15 != null) { // L: 2816
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3); // L: 2817
							var7 = var15.packetBuffer.offset; // L: 2818
							var15.packetBuffer.offset = var3; // L: 2819
							var15.packetBuffer.writeByte(var5 / var6); // L: 2820
							var15.packetBuffer.writeByte(var5 % var6); // L: 2821
							var15.packetBuffer.offset = var7; // L: 2822
							packetWriter.addNode(var15); // L: 2823
						}

						if (var4 >= Skills.mouseRecorder.index) { // L: 2825
							Skills.mouseRecorder.index = 0;
						} else {
							MouseRecorder var48 = Skills.mouseRecorder; // L: 2827
							var48.index -= var4;
							System.arraycopy(Skills.mouseRecorder.xs, var4, Skills.mouseRecorder.xs, 0, Skills.mouseRecorder.index); // L: 2828
							System.arraycopy(Skills.mouseRecorder.ys, var4, Skills.mouseRecorder.ys, 0, Skills.mouseRecorder.index); // L: 2829
							System.arraycopy(Skills.mouseRecorder.millis, var4, Skills.mouseRecorder.millis, 0, Skills.mouseRecorder.index); // L: 2830
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 2836
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 2837
					if (var16 > 32767L) { // L: 2838
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 2839
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 2840
					if (var3 < 0) { // L: 2841
						var3 = 0;
					} else if (var3 > ReflectionCheck.canvasHeight) { // L: 2842
						var3 = ReflectionCheck.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 2843
					if (var4 < 0) { // L: 2844
						var4 = 0;
					} else if (var4 > class32.canvasWidth) { // L: 2845
						var4 = class32.canvasWidth;
					}

					var5 = (int)var16; // L: 2846
					var18 = class21.getPacketBufferNode(ClientPacket.field2663, packetWriter.isaacCipher); // L: 2847
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 2848
					var18.packetBuffer.writeShort(var4); // L: 2849
					var18.packetBuffer.writeShort(var3); // L: 2850
					packetWriter.addNode(var18); // L: 2851
				}

				if (KeyHandler.field292 > 0) { // L: 2853
					var14 = class21.getPacketBufferNode(ClientPacket.field2573, packetWriter.isaacCipher); // L: 2854
					var14.packetBuffer.writeShort(0); // L: 2855
					var2 = var14.packetBuffer.offset; // L: 2856
					long var19 = ObjectComposition.currentTimeMillis(); // L: 2857

					for (var5 = 0; var5 < KeyHandler.field292; ++var5) { // L: 2858
						long var21 = var19 - field809; // L: 2859
						if (var21 > 16777215L) { // L: 2860
							var21 = 16777215L;
						}

						field809 = var19; // L: 2861
						var14.packetBuffer.method6594(KeyHandler.field274[var5]); // L: 2862
						var14.packetBuffer.method6758((int)var21); // L: 2863
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 2865
					packetWriter.addNode(var14); // L: 2866
				}

				if (field725 > 0) { // L: 2868
					--field725;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 2869
					field726 = true;
				}

				if (field726 && field725 <= 0) { // L: 2870
					field725 = 20; // L: 2871
					field726 = false; // L: 2872
					var14 = class21.getPacketBufferNode(ClientPacket.field2630, packetWriter.isaacCipher); // L: 2874
					var14.packetBuffer.method6619(camAngleX); // L: 2875
					var14.packetBuffer.writeShort(camAngleY); // L: 2876
					packetWriter.addNode(var14); // L: 2877
				}

				if (WorldMapSection1.hasFocus && !hadFocus) { // L: 2879
					hadFocus = true; // L: 2880
					var14 = class21.getPacketBufferNode(ClientPacket.field2580, packetWriter.isaacCipher); // L: 2882
					var14.packetBuffer.writeByte(1); // L: 2883
					packetWriter.addNode(var14); // L: 2884
				}

				if (!WorldMapSection1.hasFocus && hadFocus) { // L: 2886
					hadFocus = false; // L: 2887
					var14 = class21.getPacketBufferNode(ClientPacket.field2580, packetWriter.isaacCipher); // L: 2889
					var14.packetBuffer.writeByte(0); // L: 2890
					packetWriter.addNode(var14); // L: 2891
				}

				if (class243.worldMap != null) { // L: 2894
					class243.worldMap.method6100();
				}

				if (MusicPatch.ClanChat_inClanChat) { // L: 2896
					if (WorldMapRegion.friendsChat != null) { // L: 2897
						WorldMapRegion.friendsChat.sort(); // L: 2898
					}

					ClanChannelMember.method85(); // L: 2900
					MusicPatch.ClanChat_inClanChat = false; // L: 2901
				}

				VarbitComposition.method2846(); // L: 2904
				if (class22.Client_plane != field872) { // L: 2906
					field872 = class22.Client_plane; // L: 2907
					GraphicsObject.createMinimapSprite(class22.Client_plane); // L: 2908
				}

				if (gameState == 30) { // L: 2911
					for (PendingSpawn var32 = (PendingSpawn)pendingSpawns.last(); var32 != null; var32 = (PendingSpawn)pendingSpawns.previous()) { // L: 2913 2914 2957
						if (var32.hitpoints > 0) { // L: 2915
							--var32.hitpoints;
						}

						ObjectComposition var23;
						boolean var30;
						if (var32.hitpoints == 0) { // L: 2916
							if (var32.objectId >= 0) { // L: 2918
								var3 = var32.objectId; // L: 2920
								var4 = var32.field1229; // L: 2921
								var23 = class23.getObjectDefinition(var3); // L: 2923
								if (var4 == 11) { // L: 2924
									var4 = 10;
								}

								if (var4 >= 5 && var4 <= 8) { // L: 2925
									var4 = 4;
								}

								var30 = var23.method2956(var4); // L: 2926
								if (!var30) { // L: 2928
									continue;
								}
							}

							class247.addPendingSpawnToScene(var32.plane, var32.type, var32.x, var32.y, var32.objectId, var32.field1225, var32.field1229); // L: 2930
							var32.remove(); // L: 2931
						} else {
							if (var32.delay > 0) { // L: 2935
								--var32.delay;
							}

							if (var32.delay == 0 && var32.x >= 1 && var32.y >= 1 && var32.x <= 102 && var32.y <= 102) { // L: 2936
								if (var32.id >= 0) { // L: 2938
									var3 = var32.id; // L: 2940
									var4 = var32.field1232; // L: 2941
									var23 = class23.getObjectDefinition(var3); // L: 2943
									if (var4 == 11) { // L: 2944
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) { // L: 2945
										var4 = 4;
									}

									var30 = var23.method2956(var4); // L: 2946
									if (!var30) { // L: 2948
										continue;
									}
								}

								class247.addPendingSpawnToScene(var32.plane, var32.type, var32.x, var32.y, var32.id, var32.orientation, var32.field1232); // L: 2950
								var32.delay = -1; // L: 2951
								if (var32.objectId == var32.id && var32.objectId == -1) { // L: 2952
									var32.remove();
								} else if (var32.id == var32.objectId && var32.orientation == var32.field1225 && var32.field1229 == var32.field1232) { // L: 2953
									var32.remove();
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 2961
						var10002 = queuedSoundEffectDelays[var1]--; // L: 2962
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 2963
							SoundEffect var34 = soundEffects[var1]; // L: 2975
							if (var34 == null) { // L: 2976
								var10000 = null; // L: 2977
								var34 = SoundEffect.readSoundEffect(class32.archive4, soundEffectIds[var1], 0);
								if (var34 == null) { // L: 2978
									continue;
								}

								int[] var49 = queuedSoundEffectDelays; // L: 2979
								var49[var1] += var34.calculateDelay();
								soundEffects[var1] = var34; // L: 2980
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 2986
								if (soundLocations[var1] != 0) { // L: 2988
									var4 = (soundLocations[var1] & 255) * 128; // L: 2989
									var5 = soundLocations[var1] >> 16 & 255; // L: 2990
									var6 = var5 * 128 + 64 - class93.localPlayer.x; // L: 2991
									if (var6 < 0) { // L: 2992
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255; // L: 2993
									var8 = var7 * 128 + 64 - class93.localPlayer.y; // L: 2994
									if (var8 < 0) { // L: 2995
										var8 = -var8;
									}

									var9 = var6 + var8 - 128; // L: 2996
									if (var9 > var4) { // L: 2997
										queuedSoundEffectDelays[var1] = -100; // L: 2998
										continue; // L: 2999
									}

									if (var9 < 0) { // L: 3001
										var9 = 0;
									}

									var3 = (var4 - var9) * ObjectComposition.clientPreferences.areaSoundEffectsVolume / var4; // L: 3002
								} else {
									var3 = ObjectComposition.clientPreferences.soundEffectsVolume; // L: 3004
								}

								if (var3 > 0) { // L: 3005
									RawSound var24 = var34.toRawSound().resample(TileItem.decimator); // L: 3006
									RawPcmStream var38 = RawPcmStream.createRawPcmStream(var24, 100, var3); // L: 3007
									var38.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3008
									class308.pcmStreamMixer.addSubStream(var38); // L: 3009
								}

								queuedSoundEffectDelays[var1] = -100; // L: 3011
							}
						} else {
							--soundEffectCount; // L: 2964

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 2965
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 2966
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 2967
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 2968
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 2969
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 2970
							}

							--var1; // L: 2972
						}
					}

					if (field881) { // L: 3014
						boolean var29;
						if (class232.musicPlayerStatus != 0) { // L: 3017
							var29 = true; // L: 3018
						} else {
							var29 = class124.midiPcmStream.isReady(); // L: 3021
						}

						if (!var29) { // L: 3023
							if (ObjectComposition.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) { // L: 3024
								LoginScreenAnimation.method2219(UrlRequest.archive6, currentTrackGroupId, 0, ObjectComposition.clientPreferences.musicVolume, false);
							}

							field881 = false; // L: 3025
						}
					}

					++packetWriter.field1409; // L: 3029
					if (packetWriter.field1409 > 750) { // L: 3030
						NetFileRequest.method4912(); // L: 3031
					} else {
						var1 = Players.Players_count; // L: 3035
						int[] var35 = Players.Players_indices; // L: 3036

						for (var3 = 0; var3 < var1; ++var3) { // L: 3037
							Player var40 = players[var35[var3]]; // L: 3038
							if (var40 != null) { // L: 3039
								class7.updateActorSequence(var40, 1); // L: 3040
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3045
							var2 = npcIndices[var1]; // L: 3046
							NPC var25 = npcs[var2]; // L: 3047
							if (var25 != null) { // L: 3048
								class7.updateActorSequence(var25, var25.definition.size); // L: 3049
							}
						}

						ClanSettings.method165(); // L: 3053
						++field913; // L: 3054
						if (mouseCrossColor != 0) { // L: 3055
							mouseCrossState += 20; // L: 3056
							if (mouseCrossState >= 400) { // L: 3057
								mouseCrossColor = 0;
							}
						}

						if (GrandExchangeEvents.field3626 != null) { // L: 3059
							++field747; // L: 3060
							if (field747 >= 15) { // L: 3061
								WorldMapCacheName.invalidateWidget(GrandExchangeEvents.field3626); // L: 3062
								GrandExchangeEvents.field3626 = null; // L: 3063
							}
						}

						Widget var33 = World.mousedOverWidgetIf1; // L: 3066
						Widget var36 = ReflectionCheck.field609; // L: 3067
						World.mousedOverWidgetIf1 = null; // L: 3068
						ReflectionCheck.field609 = null; // L: 3069
						draggedOnWidget = null; // L: 3070
						field822 = false; // L: 3071
						field819 = false; // L: 3072
						field806 = 0; // L: 3073

						while (ClanChannelMember.isKeyDown() && field806 < 128) { // L: 3074
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && ItemComposition.field1859 == 66) { // L: 3075
								String var42 = ""; // L: 3078

								Message var37;
								for (Iterator var39 = Messages.Messages_hashTable.iterator(); var39.hasNext(); var42 = var42 + var37.sender + ':' + var37.text + '\n') { // L: 3079 3082
									var37 = (Message)var39.next(); // L: 3080
								}

								class23.client.clipboardSetString(var42); // L: 3088
							} else if (oculusOrbState != 1 || class249.field3116 <= 0) { // L: 3091
								field868[field806] = ItemComposition.field1859; // L: 3094
								field867[field806] = class249.field3116; // L: 3095
								++field806; // L: 3096
							}
						}

						if (FontName.method6297() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3098
							var3 = class93.localPlayer.plane - mouseWheelRotation; // L: 3099
							if (var3 < 0) { // L: 3100
								var3 = 0;
							} else if (var3 > 3) { // L: 3101
								var3 = 3;
							}

							if (var3 != class93.localPlayer.plane) { // L: 3102
								class4.method50(class93.localPlayer.pathX[0] + VertexNormal.baseX, class93.localPlayer.pathY[0] + SoundSystem.baseY, var3, false); // L: 3103
							}

							mouseWheelRotation = 0; // L: 3105
						}

						if (rootInterface != -1) { // L: 3107
							class32.updateRootInterface(rootInterface, 0, 0, class32.canvasWidth, ReflectionCheck.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3108

						while (true) {
							Widget var41;
							ScriptEvent var43;
							Widget var44;
							do {
								var43 = (ScriptEvent)field652.removeLast(); // L: 3110
								if (var43 == null) { // L: 3111
									while (true) {
										do {
											var43 = (ScriptEvent)field846.removeLast(); // L: 3122
											if (var43 == null) { // L: 3123
												while (true) {
													do {
														var43 = (ScriptEvent)scriptEvents.removeLast(); // L: 3134
														if (var43 == null) { // L: 3135
															this.menu(); // L: 3145
															if (class243.worldMap != null) { // L: 3147
																class243.worldMap.method6110(class22.Client_plane, (class93.localPlayer.x >> 7) + VertexNormal.baseX, (class93.localPlayer.y >> 7) + SoundSystem.baseY, false); // L: 3148
																class243.worldMap.loadCache(); // L: 3149
															}

															if (clickedWidget != null) { // L: 3152
																this.method1198();
															}

															PacketBufferNode var46;
															if (Script.dragInventoryWidget != null) { // L: 3153
																WorldMapCacheName.invalidateWidget(Script.dragInventoryWidget); // L: 3154
																++itemDragDuration; // L: 3155
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3156
																	if (field848) { // L: 3157
																		if (Script.dragInventoryWidget == class18.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3158
																			Widget var47 = Script.dragInventoryWidget; // L: 3159
																			byte var31 = 0; // L: 3160
																			if (field912 == 1 && var47.contentType == 206) { // L: 3161
																				var31 = 1;
																			}

																			if (var47.itemIds[dragItemSlotDestination] <= 0) { // L: 3162
																				var31 = 0;
																			}

																			if (Canvas.method394(class21.getWidgetFlags(var47))) { // L: 3163
																				var5 = dragItemSlotSource; // L: 3164
																				var6 = dragItemSlotDestination; // L: 3165
																				var47.itemIds[var6] = var47.itemIds[var5]; // L: 3166
																				var47.itemQuantities[var6] = var47.itemQuantities[var5]; // L: 3167
																				var47.itemIds[var5] = -1; // L: 3168
																				var47.itemQuantities[var5] = 0; // L: 3169
																			} else if (var31 == 1) { // L: 3171
																				var5 = dragItemSlotSource; // L: 3172
																				var6 = dragItemSlotDestination; // L: 3173

																				while (var5 != var6) { // L: 3174
																					if (var5 > var6) { // L: 3175
																						var47.swapItems(var5 - 1, var5); // L: 3176
																						--var5; // L: 3177
																					} else if (var5 < var6) { // L: 3179
																						var47.swapItems(var5 + 1, var5); // L: 3180
																						++var5; // L: 3181
																					}
																				}
																			} else {
																				var47.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3186
																			}

																			var46 = class21.getPacketBufferNode(ClientPacket.field2658, packetWriter.isaacCipher); // L: 3189
																			var46.packetBuffer.method6612(Script.dragInventoryWidget.id); // L: 3190
																			var46.packetBuffer.method6594(var31); // L: 3191
																			var46.packetBuffer.method6602(dragItemSlotSource); // L: 3192
																			var46.packetBuffer.writeShort(dragItemSlotDestination); // L: 3193
																			packetWriter.addNode(var46); // L: 3194
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3198
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3199
																	} else if (menuOptionsCount > 0) { // L: 3201
																		var3 = draggedWidgetX; // L: 3202
																		var4 = draggedWidgetY; // L: 3203
																		MenuAction var45 = ReflectionCheck.tempMenuAction; // L: 3205
																		Script.menuAction(var45.param0, var45.param1, var45.opcode, var45.identifier, var45.action, var45.action, var3, var4); // L: 3207
																		ReflectionCheck.tempMenuAction = null; // L: 3209
																	}

																	field747 = 10; // L: 3213
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3214
																	Script.dragInventoryWidget = null; // L: 3215
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3218 3219
																	field848 = true; // L: 3220
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3225
																var3 = Scene.Scene_selectedX; // L: 3226
																var4 = Scene.Scene_selectedY; // L: 3227
																var46 = class21.getPacketBufferNode(ClientPacket.field2642, packetWriter.isaacCipher); // L: 3229
																var46.packetBuffer.writeByte(5); // L: 3230
																var46.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3231
																var46.packetBuffer.writeShort(var4 + SoundSystem.baseY); // L: 3232
																var46.packetBuffer.writeShort(var3 + VertexNormal.baseX); // L: 3233
																packetWriter.addNode(var46); // L: 3234
																Scene.method4047(); // L: 3235
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3236
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3237
																mouseCrossColor = 1; // L: 3238
																mouseCrossState = 0; // L: 3239
																destinationX = var3; // L: 3240
																destinationY = var4; // L: 3241
															}

															if (var33 != World.mousedOverWidgetIf1) { // L: 3243
																if (var33 != null) { // L: 3244
																	WorldMapCacheName.invalidateWidget(var33);
																}

																if (World.mousedOverWidgetIf1 != null) { // L: 3245
																	WorldMapCacheName.invalidateWidget(World.mousedOverWidgetIf1);
																}
															}

															if (var36 != ReflectionCheck.field609 && field833 == field792) { // L: 3247
																if (var36 != null) { // L: 3248
																	WorldMapCacheName.invalidateWidget(var36);
																}

																if (ReflectionCheck.field609 != null) { // L: 3249
																	WorldMapCacheName.invalidateWidget(ReflectionCheck.field609);
																}
															}

															if (ReflectionCheck.field609 != null) { // L: 3251
																if (field792 < field833) { // L: 3252
																	++field792; // L: 3253
																	if (field833 == field792) { // L: 3254
																		WorldMapCacheName.invalidateWidget(ReflectionCheck.field609);
																	}
																}
															} else if (field792 > 0) { // L: 3257
																--field792;
															}

															FloorOverlayDefinition.method3104(); // L: 3258
															if (isCameraLocked) { // L: 3259
																var3 = VarpDefinition.field1544 * 128 + 64; // L: 3260
																var4 = Ignored.field3847 * 128 + 64; // L: 3261
																var5 = class105.getTileHeight(var3, var4, class22.Client_plane) - AbstractByteArrayCopier.field3119; // L: 3262
																if (MouseHandler.cameraX < var3) { // L: 3263
																	MouseHandler.cameraX = (var3 - MouseHandler.cameraX) * class18.field156 / 1000 + MouseHandler.cameraX + class35.field264; // L: 3264
																	if (MouseHandler.cameraX > var3) { // L: 3265
																		MouseHandler.cameraX = var3;
																	}
																}

																if (MouseHandler.cameraX > var3) { // L: 3267
																	MouseHandler.cameraX -= class18.field156 * (MouseHandler.cameraX - var3) / 1000 + class35.field264; // L: 3268
																	if (MouseHandler.cameraX < var3) { // L: 3269
																		MouseHandler.cameraX = var3;
																	}
																}

																if (SecureRandomCallable.cameraY < var5) { // L: 3271
																	SecureRandomCallable.cameraY = (var5 - SecureRandomCallable.cameraY) * class18.field156 / 1000 + SecureRandomCallable.cameraY + class35.field264; // L: 3272
																	if (SecureRandomCallable.cameraY > var5) { // L: 3273
																		SecureRandomCallable.cameraY = var5;
																	}
																}

																if (SecureRandomCallable.cameraY > var5) { // L: 3275
																	SecureRandomCallable.cameraY -= class18.field156 * (SecureRandomCallable.cameraY - var5) / 1000 + class35.field264; // L: 3276
																	if (SecureRandomCallable.cameraY < var5) { // L: 3277
																		SecureRandomCallable.cameraY = var5;
																	}
																}

																if (class105.cameraZ < var4) { // L: 3279
																	class105.cameraZ = (var4 - class105.cameraZ) * class18.field156 / 1000 + class105.cameraZ + class35.field264; // L: 3280
																	if (class105.cameraZ > var4) { // L: 3281
																		class105.cameraZ = var4;
																	}
																}

																if (class105.cameraZ > var4) { // L: 3283
																	class105.cameraZ -= class18.field156 * (class105.cameraZ - var4) / 1000 + class35.field264; // L: 3284
																	if (class105.cameraZ < var4) { // L: 3285
																		class105.cameraZ = var4;
																	}
																}

																var3 = ArchiveDisk.field3886 * 128 + 64; // L: 3287
																var4 = class4.field47 * 128 + 64; // L: 3288
																var5 = class105.getTileHeight(var3, var4, class22.Client_plane) - class18.field153; // L: 3289
																var6 = var3 - MouseHandler.cameraX; // L: 3290
																var7 = var5 - SecureRandomCallable.cameraY; // L: 3291
																var8 = var4 - class105.cameraZ; // L: 3292
																var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8)); // L: 3293
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047; // L: 3294
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047; // L: 3295
																if (var10 < 128) { // L: 3296
																	var10 = 128;
																}

																if (var10 > 383) { // L: 3297
																	var10 = 383;
																}

																if (SpotAnimationDefinition.cameraPitch < var10) { // L: 3298
																	SpotAnimationDefinition.cameraPitch = (var10 - SpotAnimationDefinition.cameraPitch) * SoundCache.field468 / 1000 + SpotAnimationDefinition.cameraPitch + FriendsList.field3812; // L: 3299
																	if (SpotAnimationDefinition.cameraPitch > var10) { // L: 3300
																		SpotAnimationDefinition.cameraPitch = var10;
																	}
																}

																if (SpotAnimationDefinition.cameraPitch > var10) { // L: 3302
																	SpotAnimationDefinition.cameraPitch -= SoundCache.field468 * (SpotAnimationDefinition.cameraPitch - var10) / 1000 + FriendsList.field3812; // L: 3303
																	if (SpotAnimationDefinition.cameraPitch < var10) { // L: 3304
																		SpotAnimationDefinition.cameraPitch = var10;
																	}
																}

																var12 = var11 - class376.cameraYaw; // L: 3306
																if (var12 > 1024) { // L: 3307
																	var12 -= 2048;
																}

																if (var12 < -1024) { // L: 3308
																	var12 += 2048;
																}

																if (var12 > 0) { // L: 3309
																	class376.cameraYaw = var12 * SoundCache.field468 / 1000 + class376.cameraYaw + FriendsList.field3812; // L: 3310
																	class376.cameraYaw &= 2047; // L: 3311
																}

																if (var12 < 0) { // L: 3313
																	class376.cameraYaw -= -var12 * SoundCache.field468 / 1000 + FriendsList.field3812; // L: 3314
																	class376.cameraYaw &= 2047; // L: 3315
																}

																int var26 = var11 - class376.cameraYaw; // L: 3317
																if (var26 > 1024) { // L: 3318
																	var26 -= 2048;
																}

																if (var26 < -1024) { // L: 3319
																	var26 += 2048;
																}

																if (var26 < 0 && var12 > 0 || var26 > 0 && var12 < 0) { // L: 3320
																	class376.cameraYaw = var11;
																}
															}

															for (var3 = 0; var3 < 5; ++var3) { // L: 3322
																var10002 = field893[var3]++;
															}

															GrandExchangeOfferOwnWorldComparator.varcs.tryWrite(); // L: 3323
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3326
															var5 = WorldMapLabelSize.method3206(); // L: 3329
															if (var3 > 15000 && var5 > 15000) { // L: 3330
																logoutTimer = 250; // L: 3331
																ArchiveDiskActionHandler.method4867(14500); // L: 3332
																var18 = class21.getPacketBufferNode(ClientPacket.field2644, packetWriter.isaacCipher); // L: 3334
																packetWriter.addNode(var18); // L: 3335
															}

															NetSocket.friendSystem.processFriendUpdates(); // L: 3337
															++packetWriter.pendingWrites; // L: 3338
															if (packetWriter.pendingWrites > 50) { // L: 3339
																var18 = class21.getPacketBufferNode(ClientPacket.field2590, packetWriter.isaacCipher); // L: 3341
																packetWriter.addNode(var18); // L: 3342
															}

															try {
																packetWriter.flush(); // L: 3345
															} catch (IOException var27) { // L: 3347
																NetFileRequest.method4912(); // L: 3348
															}

															return; // L: 3350
														}

														var44 = var43.widget; // L: 3136
														if (var44.childIndex < 0) { // L: 3137
															break;
														}

														var41 = Frames.getWidget(var44.parentId); // L: 3138
													} while(var41 == null || var41.children == null || var44.childIndex >= var41.children.length || var44 != var41.children[var44.childIndex]); // L: 3139

													PacketWriter.runScriptEvent(var43); // L: 3143
												}
											}

											var44 = var43.widget; // L: 3124
											if (var44.childIndex < 0) { // L: 3125
												break;
											}

											var41 = Frames.getWidget(var44.parentId); // L: 3126
										} while(var41 == null || var41.children == null || var44.childIndex >= var41.children.length || var44 != var41.children[var44.childIndex]); // L: 3127

										PacketWriter.runScriptEvent(var43); // L: 3131
									}
								}

								var44 = var43.widget; // L: 3112
								if (var44.childIndex < 0) { // L: 3113
									break;
								}

								var41 = Frames.getWidget(var44.parentId); // L: 3114
							} while(var41 == null || var41.children == null || var44.childIndex >= var41.children.length || var44 != var41.children[var44.childIndex]); // L: 3115

							PacketWriter.runScriptEvent(var43); // L: 3119
						}
					}
				}
			}
		}
	} // L: 2721 3032

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65280"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class32.canvasWidth; // L: 3939
		int var2 = ReflectionCheck.canvasHeight; // L: 3940
		if (super.contentWidth < var1) { // L: 3941
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 3942
		}

		if (ObjectComposition.clientPreferences != null) { // L: 3943
			try {
				class42.method422(class23.client, "resize", new Object[]{SpotAnimationDefinition.getWindowedMode()}); // L: 3945
			} catch (Throwable var4) { // L: 3947
			}
		}

	} // L: 3949

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1520673658"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 3952
			var1 = rootInterface; // L: 3953
			if (Clock.loadInterface(var1)) { // L: 3955
				Canvas.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1); // L: 3956
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 3959
			if (field719[var1]) { // L: 3960
				field780[var1] = true;
			}

			field860[var1] = field719[var1]; // L: 3961
			field719[var1] = false; // L: 3962
		}

		field849 = cycle; // L: 3964
		viewportX = -1; // L: 3965
		viewportY = -1; // L: 3966
		class18.hoveredItemContainer = null; // L: 3967
		if (rootInterface != -1) { // L: 3968
			rootWidgetCount = 0; // L: 3969
			class225.drawWidgets(rootInterface, 0, 0, class32.canvasWidth, ReflectionCheck.canvasHeight, 0, 0, -1); // L: 3970
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 3972
		if (showMouseCross) { // L: 3973
			if (mouseCrossColor == 1) { // L: 3974
				ArchiveLoader.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3975
			}

			if (mouseCrossColor == 2) { // L: 3977
				ArchiveLoader.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3978
			}
		}

		if (!isMenuOpen) { // L: 3981
			if (viewportX != -1) { // L: 3982
				FileSystem.method2547(viewportX, viewportY);
			}
		} else {
			var1 = class14.menuX; // L: 3985
			int var2 = class243.menuY; // L: 3986
			int var3 = class29.menuWidth; // L: 3987
			int var4 = class24.menuHeight; // L: 3988
			int var5 = 6116423; // L: 3989
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 3990
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 3991
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 3992
			Widget.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 3993
			int var6 = MouseHandler.MouseHandler_x; // L: 3994
			int var7 = MouseHandler.MouseHandler_y; // L: 3995

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 3996
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 3997
				int var10 = 16777215; // L: 3998
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 3999
					var10 = 16776960;
				}

				Widget.fontBold12.draw(MouseRecorder.method2098(var8), var1 + 3, var9, var10, 0); // L: 4000
			}

			PcmPlayer.method786(class14.menuX, class243.menuY, class29.menuWidth, class24.menuHeight); // L: 4002
		}

		if (gameDrawingMode == 3) { // L: 4004
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4005
				if (field860[var1]) { // L: 4006
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4007
				} else if (field780[var1]) { // L: 4009
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4010
				}
			}
		}

		class169.method3549(class22.Client_plane, class93.localPlayer.x, class93.localPlayer.y, field913); // L: 4014
		field913 = 0; // L: 4015
	} // L: 4016

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)Z",
		garbageValue = "-2018950508"
	)
	final boolean method1192(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5767
		PacketBuffer var3 = var1.packetBuffer; // L: 5768
		if (var2 == null) { // L: 5769
			return false;
		} else {
			int var6;
			String var18;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5771
					if (var1.field1408) { // L: 5772
						if (!var2.isAvailable(1)) { // L: 5773
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5774
						var1.field1409 = 0; // L: 5775
						var1.field1408 = false; // L: 5776
					}

					var3.offset = 0; // L: 5778
					if (var3.method6529()) { // L: 5779
						if (!var2.isAvailable(1)) { // L: 5780
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5781
						var1.field1409 = 0; // L: 5782
					}

					var1.field1408 = true; // L: 5784
					ServerPacket[] var4 = class24.ServerPacket_values(); // L: 5785
					var5 = var3.readSmartByteShortIsaac(); // L: 5786
					if (var5 < 0 || var5 >= var4.length) { // L: 5787
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5788
					var1.serverPacketLength = var1.serverPacket.length; // L: 5789
				}

				if (var1.serverPacketLength == -1) { // L: 5791
					if (!var2.isAvailable(1)) { // L: 5792
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5793
					var1.serverPacketLength = var3.array[0] & 255; // L: 5794
				}

				if (var1.serverPacketLength == -2) { // L: 5796
					if (!var2.isAvailable(2)) { // L: 5797
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5798
					var3.offset = 0; // L: 5799
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5800
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5802
					return false;
				}

				var3.offset = 0; // L: 5803
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5804
				var1.field1409 = 0; // L: 5805
				timer.method5602(); // L: 5806
				var1.field1400 = var1.field1412; // L: 5807
				var1.field1412 = var1.field1411; // L: 5808
				var1.field1411 = var1.serverPacket; // L: 5809
				int var7;
				int var8;
				int var9;
				int var60;
				if (ServerPacket.field2732 == var1.serverPacket) { // L: 5810
					var60 = var3.readUnsignedShort(); // L: 5811
					var5 = var3.readInt(); // L: 5812
					var6 = var60 >> 10 & 31; // L: 5813
					var7 = var60 >> 5 & 31; // L: 5814
					var8 = var60 & 31; // L: 5815
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 5816
					Widget var55 = Frames.getWidget(var5); // L: 5817
					if (var9 != var55.color) { // L: 5818
						var55.color = var9; // L: 5819
						WorldMapCacheName.invalidateWidget(var55); // L: 5820
					}

					var1.serverPacket = null; // L: 5822
					return true; // L: 5823
				}

				boolean var78;
				if (ServerPacket.field2734 == var1.serverPacket) { // L: 5825
					var78 = var3.readBoolean(); // L: 5826
					if (var78) { // L: 5827
						if (UserComparator3.field1444 == null) { // L: 5828
							UserComparator3.field1444 = new class285();
						}
					} else {
						UserComparator3.field1444 = null; // L: 5830
					}

					var1.serverPacket = null; // L: 5831
					return true; // L: 5832
				}

				if (ServerPacket.field2757 == var1.serverPacket) { // L: 5834
					class69.field596 = var3.readUnsignedByte(); // L: 5835
					Occluder.field2387 = var3.readUnsignedByte(); // L: 5836

					while (var3.offset < var1.serverPacketLength) { // L: 5837
						var60 = var3.readUnsignedByte(); // L: 5838
						class225 var71 = PlayerComposition.method4705()[var60]; // L: 5839
						Tile.method3843(var71); // L: 5840
					}

					var1.serverPacket = null; // L: 5842
					return true; // L: 5843
				}

				if (ServerPacket.field2750 == var1.serverPacket) { // L: 5845
					Tile.method3843(class225.field2687); // L: 5846
					var1.serverPacket = null; // L: 5847
					return true; // L: 5848
				}

				String var46;
				if (ServerPacket.field2781 == var1.serverPacket) { // L: 5850
					var46 = var3.readStringCp1252NullTerminated(); // L: 5851
					Object[] var70 = new Object[var46.length() + 1]; // L: 5852

					for (var6 = var46.length() - 1; var6 >= 0; --var6) { // L: 5853
						if (var46.charAt(var6) == 's') { // L: 5854
							var70[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var70[var6 + 1] = new Integer(var3.readInt()); // L: 5855
						}
					}

					var70[0] = new Integer(var3.readInt()); // L: 5857
					ScriptEvent var77 = new ScriptEvent(); // L: 5858
					var77.args = var70; // L: 5859
					PacketWriter.runScriptEvent(var77); // L: 5860
					var1.serverPacket = null; // L: 5861
					return true; // L: 5862
				}

				if (ServerPacket.field2759 == var1.serverPacket) { // L: 5864
					hintArrowType = var3.readUnsignedByte(); // L: 5865
					if (hintArrowType == 1) { // L: 5866
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 5867
						if (hintArrowType == 2) { // L: 5868
							hintArrowSubX = 64; // L: 5869
							hintArrowSubY = 64; // L: 5870
						}

						if (hintArrowType == 3) { // L: 5872
							hintArrowSubX = 0; // L: 5873
							hintArrowSubY = 64; // L: 5874
						}

						if (hintArrowType == 4) { // L: 5876
							hintArrowSubX = 128; // L: 5877
							hintArrowSubY = 64; // L: 5878
						}

						if (hintArrowType == 5) { // L: 5880
							hintArrowSubX = 64; // L: 5881
							hintArrowSubY = 0; // L: 5882
						}

						if (hintArrowType == 6) { // L: 5884
							hintArrowSubX = 64; // L: 5885
							hintArrowSubY = 128; // L: 5886
						}

						hintArrowType = 2; // L: 5888
						hintArrowX = var3.readUnsignedShort(); // L: 5889
						hintArrowY = var3.readUnsignedShort(); // L: 5890
						hintArrowHeight = var3.readUnsignedByte(); // L: 5891
					}

					if (hintArrowType == 10) { // L: 5893
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 5894
					return true; // L: 5895
				}

				if (ServerPacket.field2711 == var1.serverPacket) { // L: 5897
					Tile.method3843(class225.field2683); // L: 5898
					var1.serverPacket = null; // L: 5899
					return true; // L: 5900
				}

				if (ServerPacket.field2730 == var1.serverPacket) { // L: 5902
					class34.field254 = new class339(ViewportMouse.HitSplatDefinition_cachedSprites); // L: 5903
					var1.serverPacket = null; // L: 5904
					return true; // L: 5905
				}

				if (ServerPacket.field2777 == var1.serverPacket) { // L: 5907
					var60 = var3.readUnsignedByte(); // L: 5908
					class15.forceDisconnect(var60); // L: 5909
					var1.serverPacket = null; // L: 5910
					return false; // L: 5911
				}

				if (ServerPacket.field2752 == var1.serverPacket) { // L: 5913
					var60 = var3.readUnsignedByte(); // L: 5914
					if (var3.readUnsignedByte() == 0) { // L: 5915
						grandExchangeOffers[var60] = new GrandExchangeOffer(); // L: 5916
						var3.offset += 18; // L: 5917
					} else {
						--var3.offset; // L: 5920
						grandExchangeOffers[var60] = new GrandExchangeOffer(var3, false); // L: 5921
					}

					field840 = cycleCntr; // L: 5923
					var1.serverPacket = null; // L: 5924
					return true; // L: 5925
				}

				if (ServerPacket.field2741 == var1.serverPacket) { // L: 5927
					ScriptEvent.privateChatMode = class124.method2498(var3.readUnsignedByte()); // L: 5928
					var1.serverPacket = null; // L: 5929
					return true; // L: 5930
				}

				if (ServerPacket.field2746 == var1.serverPacket) { // L: 5932
					Tile.method3843(class225.field2681); // L: 5933
					var1.serverPacket = null; // L: 5934
					return true; // L: 5935
				}

				if (ServerPacket.field2704 == var1.serverPacket) { // L: 5937
					var60 = var3.readUnsignedShort(); // L: 5938
					var5 = var3.readUnsignedByte(); // L: 5939
					var6 = var3.readUnsignedShort(); // L: 5940
					BufferedSource.queueSoundEffect(var60, var5, var6); // L: 5941
					var1.serverPacket = null; // L: 5942
					return true; // L: 5943
				}

				Widget var67;
				if (ServerPacket.field2717 == var1.serverPacket) { // L: 5945
					var60 = var3.readInt(); // L: 5946
					var5 = var3.readUnsignedShort(); // L: 5947
					var67 = Frames.getWidget(var60); // L: 5948
					if (var67.modelType != 2 || var5 != var67.modelId) { // L: 5949
						var67.modelType = 2; // L: 5950
						var67.modelId = var5; // L: 5951
						WorldMapCacheName.invalidateWidget(var67); // L: 5952
					}

					var1.serverPacket = null; // L: 5954
					return true; // L: 5955
				}

				int var20;
				if (ServerPacket.field2788 == var1.serverPacket) { // L: 5957
					isCameraLocked = true; // L: 5958
					ArchiveDisk.field3886 = var3.readUnsignedByte(); // L: 5959
					class4.field47 = var3.readUnsignedByte(); // L: 5960
					class18.field153 = var3.readUnsignedShort(); // L: 5961
					FriendsList.field3812 = var3.readUnsignedByte(); // L: 5962
					SoundCache.field468 = var3.readUnsignedByte(); // L: 5963
					if (SoundCache.field468 >= 100) { // L: 5964
						var60 = ArchiveDisk.field3886 * 128 + 64; // L: 5965
						var5 = class4.field47 * 128 + 64; // L: 5966
						var6 = class105.getTileHeight(var60, var5, class22.Client_plane) - class18.field153; // L: 5967
						var7 = var60 - MouseHandler.cameraX; // L: 5968
						var8 = var6 - SecureRandomCallable.cameraY; // L: 5969
						var9 = var5 - class105.cameraZ; // L: 5970
						var20 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 5971
						SpotAnimationDefinition.cameraPitch = (int)(Math.atan2((double)var8, (double)var20) * 325.949D) & 2047; // L: 5972
						class376.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047; // L: 5973
						if (SpotAnimationDefinition.cameraPitch < 128) { // L: 5974
							SpotAnimationDefinition.cameraPitch = 128;
						}

						if (SpotAnimationDefinition.cameraPitch > 383) { // L: 5975
							SpotAnimationDefinition.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 5977
					return true; // L: 5978
				}

				if (ServerPacket.field2776 == var1.serverPacket) { // L: 5980
					var60 = var3.method6613(); // L: 5981
					var5 = var3.method6726(); // L: 5982
					var67 = Frames.getWidget(var60); // L: 5983
					if (var5 != var67.sequenceId || var5 == -1) { // L: 5984
						var67.sequenceId = var5; // L: 5985
						var67.modelFrame = 0; // L: 5986
						var67.modelFrameCycle = 0; // L: 5987
						WorldMapCacheName.invalidateWidget(var67); // L: 5988
					}

					var1.serverPacket = null; // L: 5990
					return true; // L: 5991
				}

				if (ServerPacket.field2721 == var1.serverPacket) { // L: 5993
					Tile.method3843(class225.field2689); // L: 5994
					var1.serverPacket = null; // L: 5995
					return true; // L: 5996
				}

				if (ServerPacket.field2709 == var1.serverPacket) { // L: 5998
					Tile.method3843(class225.field2686); // L: 5999
					var1.serverPacket = null; // L: 6000
					return true; // L: 6001
				}

				if (ServerPacket.field2714 == var1.serverPacket) { // L: 6003
					var60 = var3.readUnsignedByte(); // L: 6004
					ClanSettings.method163(var60); // L: 6005
					var1.serverPacket = null; // L: 6006
					return true; // L: 6007
				}

				if (ServerPacket.field2738 == var1.serverPacket) { // L: 6009
					if (class34.field254 == null) { // L: 6010
						class34.field254 = new class339(ViewportMouse.HitSplatDefinition_cachedSprites);
					}

					class390 var51 = ViewportMouse.HitSplatDefinition_cachedSprites.method6021(var3); // L: 6011
					class34.field254.field3921.vmethod6364(var51.field4219, var51.field4218); // L: 6012
					field911[++field852 - 1 & 31] = var51.field4219; // L: 6013
					var1.serverPacket = null; // L: 6014
					return true; // L: 6015
				}

				if (ServerPacket.field2735 == var1.serverPacket) { // L: 6017
					NetSocket.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6018
					field836 = cycleCntr; // L: 6019
					var1.serverPacket = null; // L: 6020
					return true; // L: 6021
				}

				if (ServerPacket.field2701 == var1.serverPacket) { // L: 6023
					isCameraLocked = true; // L: 6024
					VarpDefinition.field1544 = var3.readUnsignedByte(); // L: 6025
					Ignored.field3847 = var3.readUnsignedByte(); // L: 6026
					AbstractByteArrayCopier.field3119 = var3.readUnsignedShort(); // L: 6027
					class35.field264 = var3.readUnsignedByte(); // L: 6028
					class18.field156 = var3.readUnsignedByte(); // L: 6029
					if (class18.field156 >= 100) { // L: 6030
						MouseHandler.cameraX = VarpDefinition.field1544 * 128 + 64; // L: 6031
						class105.cameraZ = Ignored.field3847 * 128 + 64; // L: 6032
						SecureRandomCallable.cameraY = class105.getTileHeight(MouseHandler.cameraX, class105.cameraZ, class22.Client_plane) - AbstractByteArrayCopier.field3119; // L: 6033
					}

					var1.serverPacket = null; // L: 6035
					return true; // L: 6036
				}

				if (ServerPacket.field2767 == var1.serverPacket) { // L: 6038
					SoundSystem.updateNpcs(true, var3); // L: 6039
					var1.serverPacket = null; // L: 6040
					return true; // L: 6041
				}

				if (ServerPacket.field2772 == var1.serverPacket) { // L: 6043
					destinationX = var3.readUnsignedByte(); // L: 6044
					if (destinationX == 255) { // L: 6045
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6046
					if (destinationY == 255) { // L: 6047
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6048
					return true; // L: 6049
				}

				InterfaceParent var21;
				Widget var74;
				if (ServerPacket.field2743 == var1.serverPacket) { // L: 6051
					var60 = var3.method6614(); // L: 6052
					var5 = var3.method6614(); // L: 6053
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6054
					var21 = (InterfaceParent)interfaceParents.get((long)var60); // L: 6055
					if (var21 != null) { // L: 6056
						class43.closeInterface(var21, var76 == null || var21.group != var76.group);
					}

					if (var76 != null) { // L: 6057
						var76.remove(); // L: 6058
						interfaceParents.put(var76, (long)var60); // L: 6059
					}

					var74 = Frames.getWidget(var5); // L: 6061
					if (var74 != null) { // L: 6062
						WorldMapCacheName.invalidateWidget(var74);
					}

					var74 = Frames.getWidget(var60); // L: 6063
					if (var74 != null) { // L: 6064
						WorldMapCacheName.invalidateWidget(var74); // L: 6065
						class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var74.id >>> 16], var74, true); // L: 6066
					}

					if (rootInterface != -1) { // L: 6068
						Login.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6069
					return true; // L: 6070
				}

				if (ServerPacket.field2729 == var1.serverPacket) { // L: 6072
					FriendLoginUpdate.method5690(var3.readStringCp1252NullTerminated()); // L: 6073
					var1.serverPacket = null; // L: 6074
					return true; // L: 6075
				}

				if (ServerPacket.field2736 == var1.serverPacket) { // L: 6077
					var60 = var3.readInt(); // L: 6078
					InterfaceParent var68 = (InterfaceParent)interfaceParents.get((long)var60); // L: 6079
					if (var68 != null) { // L: 6080
						class43.closeInterface(var68, true);
					}

					if (meslayerContinueWidget != null) { // L: 6081
						WorldMapCacheName.invalidateWidget(meslayerContinueWidget); // L: 6082
						meslayerContinueWidget = null; // L: 6083
					}

					var1.serverPacket = null; // L: 6085
					return true; // L: 6086
				}

				if (ServerPacket.field2722 == var1.serverPacket) { // L: 6088
					if (rootInterface != -1) { // L: 6089
						Login.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6090
					return true; // L: 6091
				}

				long var12;
				if (ServerPacket.field2775 == var1.serverPacket) { // L: 6093
					var60 = var3.offset + var1.serverPacketLength; // L: 6094
					var5 = var3.readUnsignedShort(); // L: 6095
					var6 = var3.readUnsignedShort(); // L: 6096
					if (var5 != rootInterface) { // L: 6097
						rootInterface = var5; // L: 6098
						this.resizeRoot(false); // L: 6099
						class21.Widget_resetModelFrames(rootInterface); // L: 6100
						FloorDecoration.runWidgetOnLoadListener(rootInterface); // L: 6101

						for (var7 = 0; var7 < 100; ++var7) { // L: 6102
							field719[var7] = true;
						}
					}

					InterfaceParent var53;
					for (; var6-- > 0; var53.field1165 = true) { // L: 6104 6114
						var7 = var3.readInt(); // L: 6105
						var8 = var3.readUnsignedShort(); // L: 6106
						var9 = var3.readUnsignedByte(); // L: 6107
						var53 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6108
						if (var53 != null && var8 != var53.group) { // L: 6109
							class43.closeInterface(var53, true); // L: 6110
							var53 = null; // L: 6111
						}

						if (var53 == null) { // L: 6113
							var53 = class17.method208(var7, var8, var9);
						}
					}

					for (var21 = (InterfaceParent)interfaceParents.first(); var21 != null; var21 = (InterfaceParent)interfaceParents.next()) { // L: 6116
						if (var21.field1165) { // L: 6117
							var21.field1165 = false;
						} else {
							class43.closeInterface(var21, true); // L: 6119
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6122

					while (var3.offset < var60) { // L: 6123
						var7 = var3.readInt(); // L: 6124
						var8 = var3.readUnsignedShort(); // L: 6125
						var9 = var3.readUnsignedShort(); // L: 6126
						var20 = var3.readInt(); // L: 6127

						for (int var56 = var8; var56 <= var9; ++var56) { // L: 6128
							var12 = ((long)var7 << 32) + (long)var56; // L: 6129
							widgetFlags.put(new IntegerNode(var20), var12); // L: 6130
						}
					}

					var1.serverPacket = null; // L: 6133
					return true; // L: 6134
				}

				if (ServerPacket.field2705 == var1.serverPacket) { // L: 6136
					var78 = var3.method6549() == 1; // L: 6137
					var5 = var3.method6598(); // L: 6138
					var67 = Frames.getWidget(var5); // L: 6139
					if (var78 != var67.isHidden) { // L: 6140
						var67.isHidden = var78; // L: 6141
						WorldMapCacheName.invalidateWidget(var67); // L: 6142
					}

					var1.serverPacket = null; // L: 6144
					return true; // L: 6145
				}

				if (ServerPacket.field2751 == var1.serverPacket) { // L: 6147
					class34.field254 = null; // L: 6148
					var1.serverPacket = null; // L: 6149
					return true; // L: 6150
				}

				int var15;
				long var23;
				long var25;
				long var27;
				String var30;
				if (ServerPacket.field2785 == var1.serverPacket) { // L: 6152
					var46 = var3.readStringCp1252NullTerminated(); // L: 6153
					var23 = var3.readLong(); // L: 6154
					var25 = (long)var3.readUnsignedShort(); // L: 6155
					var27 = (long)var3.readMedium(); // L: 6156
					PlayerType var79 = (PlayerType)Messages.findEnumerated(class372.PlayerType_values(), var3.readUnsignedByte()); // L: 6157
					var12 = var27 + (var25 << 32); // L: 6158
					boolean var59 = false; // L: 6159

					for (var15 = 0; var15 < 100; ++var15) { // L: 6160
						if (var12 == crossWorldMessageIds[var15]) { // L: 6161
							var59 = true; // L: 6162
							break; // L: 6163
						}
					}

					if (var79.isUser && NetSocket.friendSystem.isIgnored(new Username(var46, WorldMapSection0.loginType))) { // L: 6166 6167
						var59 = true;
					}

					if (!var59 && field755 == 0) { // L: 6169
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var12; // L: 6170
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6171
						var30 = AbstractFont.escapeBrackets(class43.method433(MusicPatch.method4592(var3))); // L: 6172
						if (var79.modIcon != -1) { // L: 6173
							class5.addChatMessage(9, SecureRandomFuture.method1982(var79.modIcon) + var46, var30, class258.base37DecodeLong(var23));
						} else {
							class5.addChatMessage(9, var46, var30, class258.base37DecodeLong(var23)); // L: 6174
						}
					}

					var1.serverPacket = null; // L: 6176
					return true; // L: 6177
				}

				if (ServerPacket.field2770 == var1.serverPacket) { // L: 6179
					Tile.method3843(class225.field2685); // L: 6180
					var1.serverPacket = null; // L: 6181
					return true; // L: 6182
				}

				if (ServerPacket.field2779 == var1.serverPacket) { // L: 6184
					var46 = var3.readStringCp1252NullTerminated(); // L: 6185
					var5 = var3.method6614(); // L: 6186
					var67 = Frames.getWidget(var5); // L: 6187
					if (!var46.equals(var67.text)) { // L: 6188
						var67.text = var46; // L: 6189
						WorldMapCacheName.invalidateWidget(var67); // L: 6190
					}

					var1.serverPacket = null; // L: 6192
					return true; // L: 6193
				}

				if (ServerPacket.field2787 == var1.serverPacket) { // L: 6195
					var60 = var3.method6603(); // L: 6196
					var5 = var3.method6598(); // L: 6197
					var67 = Frames.getWidget(var5); // L: 6198
					if (var67.modelType != 1 || var60 != var67.modelId) { // L: 6199
						var67.modelType = 1; // L: 6200
						var67.modelId = var60; // L: 6201
						WorldMapCacheName.invalidateWidget(var67); // L: 6202
					}

					var1.serverPacket = null; // L: 6204
					return true; // L: 6205
				}

				if (ServerPacket.field2706 == var1.serverPacket) { // L: 6207
					var60 = var3.readInt(); // L: 6208
					if (var60 != field723) { // L: 6209
						field723 = var60; // L: 6210
						Script.method1999(); // L: 6211
					}

					var1.serverPacket = null; // L: 6213
					return true; // L: 6214
				}

				if (ServerPacket.field2778 == var1.serverPacket) { // L: 6216
					class7.logOut(); // L: 6217
					var1.serverPacket = null; // L: 6218
					return false; // L: 6219
				}

				if (ServerPacket.field2737 == var1.serverPacket) { // L: 6221
					World var50 = new World(); // L: 6222
					var50.host = var3.readStringCp1252NullTerminated(); // L: 6223
					var50.id = var3.readUnsignedShort(); // L: 6224
					var5 = var3.readInt(); // L: 6225
					var50.properties = var5; // L: 6226
					class12.updateGameState(45); // L: 6227
					var2.close(); // L: 6228
					var2 = null; // L: 6229
					class0.changeWorld(var50); // L: 6230
					var1.serverPacket = null; // L: 6231
					return false; // L: 6232
				}

				if (ServerPacket.field2728 == var1.serverPacket) { // L: 6234
					rebootTimer = var3.readUnsignedShort() * 30; // L: 6235
					field659 = cycleCntr; // L: 6236
					var1.serverPacket = null; // L: 6237
					return true; // L: 6238
				}

				String var72;
				if (ServerPacket.field2765 == var1.serverPacket) { // L: 6240
					byte[] var48 = new byte[var1.serverPacketLength]; // L: 6241
					var3.method6521(var48, 0, var48.length); // L: 6242
					Buffer var66 = new Buffer(var48); // L: 6243
					var72 = var66.readStringCp1252NullTerminated(); // L: 6244
					Players.openURL(var72, true, false); // L: 6245
					var1.serverPacket = null; // L: 6246
					return true; // L: 6247
				}

				byte var17;
				if (ServerPacket.field2739 == var1.serverPacket) { // L: 6249
					class124.method2496(); // L: 6250
					var17 = var3.readByte(); // L: 6251
					if (var1.serverPacketLength == 1) { // L: 6252
						if (var17 >= 0) { // L: 6253
							currentClanSettings[var17] = null;
						} else {
							NPCComposition.guestClanSettings = null; // L: 6254
						}

						var1.serverPacket = null; // L: 6255
						return true; // L: 6256
					}

					if (var17 >= 0) { // L: 6258
						currentClanSettings[var17] = new ClanSettings(var3); // L: 6259
					} else {
						NPCComposition.guestClanSettings = new ClanSettings(var3); // L: 6262
					}

					var1.serverPacket = null; // L: 6264
					return true; // L: 6265
				}

				if (ServerPacket.field2724 == var1.serverPacket) { // L: 6267
					var60 = var3.method6598(); // L: 6268
					var5 = var3.method6603(); // L: 6269
					var67 = Frames.getWidget(var60); // L: 6270
					if (var67 != null && var67.type == 0) { // L: 6271
						if (var5 > var67.scrollHeight - var67.height) { // L: 6272
							var5 = var67.scrollHeight - var67.height;
						}

						if (var5 < 0) { // L: 6273
							var5 = 0;
						}

						if (var5 != var67.scrollY) { // L: 6274
							var67.scrollY = var5; // L: 6275
							WorldMapCacheName.invalidateWidget(var67); // L: 6276
						}
					}

					var1.serverPacket = null; // L: 6279
					return true; // L: 6280
				}

				if (ServerPacket.field2790 == var1.serverPacket) { // L: 6282
					for (var60 = 0; var60 < Varps.Varps_main.length; ++var60) { // L: 6283
						if (Varps.Varps_main[var60] != Varps.Varps_temp[var60]) { // L: 6284
							Varps.Varps_main[var60] = Varps.Varps_temp[var60]; // L: 6285
							ApproximateRouteStrategy.changeGameOptions(var60); // L: 6286
							changedVarps[++changedVarpCount - 1 & 31] = var60; // L: 6287
						}
					}

					var1.serverPacket = null; // L: 6290
					return true; // L: 6291
				}

				if (ServerPacket.field2710 == var1.serverPacket) { // L: 6293
					PlayerComposition.readReflectionCheck(var3, var1.serverPacketLength); // L: 6294
					var1.serverPacket = null; // L: 6295
					return true; // L: 6296
				}

				if (ServerPacket.field2792 == var1.serverPacket) { // L: 6298
					var60 = var3.readInt(); // L: 6299
					var5 = var3.readUnsignedShort(); // L: 6300
					if (var60 < -70000) { // L: 6301
						var5 += 32768;
					}

					if (var60 >= 0) { // L: 6303
						var67 = Frames.getWidget(var60);
					} else {
						var67 = null; // L: 6304
					}

					for (; var3.offset < var1.serverPacketLength; class4.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 6305 6319
						var7 = var3.readUShortSmart(); // L: 6306
						var8 = var3.readUnsignedShort(); // L: 6307
						var9 = 0; // L: 6308
						if (var8 != 0) { // L: 6309
							var9 = var3.readUnsignedByte(); // L: 6310
							if (var9 == 255) { // L: 6311
								var9 = var3.readInt();
							}
						}

						if (var67 != null && var7 >= 0 && var7 < var67.itemIds.length) { // L: 6313 6314
							var67.itemIds[var7] = var8; // L: 6315
							var67.itemQuantities[var7] = var9; // L: 6316
						}
					}

					if (var67 != null) { // L: 6321
						WorldMapCacheName.invalidateWidget(var67);
					}

					class170.method3554(); // L: 6322
					changedItemContainers[++field830 - 1 & 31] = var5 & 32767; // L: 6323
					var1.serverPacket = null; // L: 6324
					return true; // L: 6325
				}

				if (ServerPacket.field2780 == var1.serverPacket) { // L: 6327
					class339.loadRegions(false, var1.packetBuffer); // L: 6328
					var1.serverPacket = null; // L: 6329
					return true; // L: 6330
				}

				if (ServerPacket.field2726 == var1.serverPacket) { // L: 6332
					FriendSystem.updatePlayers(var3, var1.serverPacketLength); // L: 6333
					ObjectSound.method1761(); // L: 6334
					var1.serverPacket = null; // L: 6335
					return true; // L: 6336
				}

				if (ServerPacket.field2769 == var1.serverPacket) { // L: 6338
					Tile.method3843(class225.field2680); // L: 6339
					var1.serverPacket = null; // L: 6340
					return true; // L: 6341
				}

				if (ServerPacket.field2760 == var1.serverPacket) { // L: 6343
					class170.method3554(); // L: 6344
					runEnergy = var3.readUnsignedByte(); // L: 6345
					field659 = cycleCntr; // L: 6346
					var1.serverPacket = null; // L: 6347
					return true; // L: 6348
				}

				if (ServerPacket.field2718 == var1.serverPacket) { // L: 6350
					var60 = var3.readUnsignedShort(); // L: 6351
					if (var60 == 65535) { // L: 6352
						var60 = -1;
					}

					var5 = var3.method6613(); // L: 6353
					var6 = var3.method6605(); // L: 6354
					if (var6 == 65535) { // L: 6355
						var6 = -1;
					}

					var7 = var3.method6598(); // L: 6356

					for (var8 = var60; var8 <= var6; ++var8) { // L: 6357
						var27 = ((long)var7 << 32) + (long)var8; // L: 6358
						Node var29 = widgetFlags.get(var27); // L: 6359
						if (var29 != null) { // L: 6360
							var29.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var27); // L: 6361
					}

					var1.serverPacket = null; // L: 6363
					return true; // L: 6364
				}

				if (ServerPacket.field2764 == var1.serverPacket) { // L: 6366
					var60 = var3.readInt(); // L: 6367
					var5 = var3.readInt(); // L: 6368
					var6 = class43.getGcDuration(); // L: 6369
					PacketBufferNode var73 = class21.getPacketBufferNode(ClientPacket.field2634, packetWriter.isaacCipher); // L: 6371
					var73.packetBuffer.method6611(var60); // L: 6372
					var73.packetBuffer.writeInt(var5); // L: 6373
					var73.packetBuffer.method6581(GameEngine.fps); // L: 6374
					var73.packetBuffer.method6584(var6); // L: 6375
					packetWriter.addNode(var73); // L: 6376
					var1.serverPacket = null; // L: 6377
					return true; // L: 6378
				}

				if (ServerPacket.field2786 == var1.serverPacket) { // L: 6380
					class339.loadRegions(true, var1.packetBuffer); // L: 6381
					var1.serverPacket = null; // L: 6382
					return true; // L: 6383
				}

				if (ServerPacket.field2712 == var1.serverPacket) { // L: 6385
					Tile.method3843(class225.field2682); // L: 6386
					var1.serverPacket = null; // L: 6387
					return true; // L: 6388
				}

				if (ServerPacket.field2727 == var1.serverPacket) { // L: 6390
					var78 = var3.readUnsignedByte() == 1; // L: 6391
					if (var78) { // L: 6392
						Widget.field3099 = ObjectComposition.currentTimeMillis() - var3.readLong(); // L: 6393
						BuddyRankComparator.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6394
					} else {
						BuddyRankComparator.grandExchangeEvents = null; // L: 6396
					}

					field748 = cycleCntr; // L: 6397
					var1.serverPacket = null; // L: 6398
					return true; // L: 6399
				}

				if (ServerPacket.field2789 == var1.serverPacket) { // L: 6401
					isCameraLocked = false; // L: 6402

					for (var60 = 0; var60 < 5; ++var60) { // L: 6403
						field693[var60] = false;
					}

					var1.serverPacket = null; // L: 6404
					return true; // L: 6405
				}

				Widget var69;
				if (ServerPacket.field2753 == var1.serverPacket) { // L: 6407
					var60 = var3.method6598(); // L: 6408
					var5 = var3.method6614(); // L: 6409
					var6 = var3.method6604(); // L: 6410
					if (var6 == 65535) { // L: 6411
						var6 = -1;
					}

					var69 = Frames.getWidget(var5); // L: 6412
					ItemComposition var75;
					if (!var69.isIf3) { // L: 6413
						if (var6 == -1) { // L: 6414
							var69.modelType = 0; // L: 6415
							var1.serverPacket = null; // L: 6416
							return true; // L: 6417
						}

						var75 = class260.ItemDefinition_get(var6); // L: 6419
						var69.modelType = 4; // L: 6420
						var69.modelId = var6; // L: 6421
						var69.modelAngleX = var75.xan2d; // L: 6422
						var69.modelAngleY = var75.yan2d; // L: 6423
						var69.modelZoom = var75.zoom2d * 100 / var60; // L: 6424
						WorldMapCacheName.invalidateWidget(var69); // L: 6425
					} else {
						var69.itemId = var6; // L: 6428
						var69.itemQuantity = var60; // L: 6429
						var75 = class260.ItemDefinition_get(var6); // L: 6430
						var69.modelAngleX = var75.xan2d; // L: 6431
						var69.modelAngleY = var75.yan2d; // L: 6432
						var69.modelAngleZ = var75.zan2d; // L: 6433
						var69.modelOffsetX = var75.offsetX2d; // L: 6434
						var69.modelOffsetY = var75.offsetY2d; // L: 6435
						var69.modelZoom = var75.zoom2d; // L: 6436
						if (var75.isStackable == 1) { // L: 6437
							var69.itemQuantityMode = 1;
						} else {
							var69.itemQuantityMode = 2; // L: 6438
						}

						if (var69.field3013 > 0) { // L: 6439
							var69.modelZoom = var69.modelZoom * 32 / var69.field3013;
						} else if (var69.rawWidth > 0) { // L: 6440
							var69.modelZoom = var69.modelZoom * 32 / var69.rawWidth;
						}

						WorldMapCacheName.invalidateWidget(var69); // L: 6441
					}

					var1.serverPacket = null; // L: 6443
					return true; // L: 6444
				}

				if (ServerPacket.field2794 == var1.serverPacket) { // L: 6446
					minimapState = var3.readUnsignedByte(); // L: 6447
					var1.serverPacket = null; // L: 6448
					return true; // L: 6449
				}

				if (ServerPacket.field2745 == var1.serverPacket) { // L: 6451
					var46 = var3.readStringCp1252NullTerminated(); // L: 6452
					var18 = AbstractFont.escapeBrackets(class43.method433(MusicPatch.method4592(var3))); // L: 6453
					World.addGameMessage(6, var46, var18); // L: 6454
					var1.serverPacket = null; // L: 6455
					return true; // L: 6456
				}

				String var32;
				int var57;
				if (ServerPacket.field2719 == var1.serverPacket) { // L: 6458
					var17 = var3.readByte(); // L: 6459
					var23 = (long)var3.readUnsignedShort(); // L: 6460
					var25 = (long)var3.readMedium(); // L: 6461
					var27 = var25 + (var23 << 32); // L: 6462
					boolean var11 = false; // L: 6463
					ClanChannel var31 = var17 >= 0 ? currentClanChannels[var17] : ApproximateRouteStrategy.guestClanChannel; // L: 6464
					if (var31 == null) { // L: 6465
						var11 = true;
					} else {
						for (var57 = 0; var57 < 100; ++var57) { // L: 6467
							if (var27 == crossWorldMessageIds[var57]) { // L: 6468
								var11 = true; // L: 6469
								break; // L: 6470
							}
						}
					}

					if (!var11) { // L: 6474
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var27; // L: 6475
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6476
						var32 = MusicPatch.method4592(var3); // L: 6477
						int var58 = var17 >= 0 ? 43 : 46; // L: 6478
						class5.addChatMessage(var58, "", var32, var31.name); // L: 6479
					}

					var1.serverPacket = null; // L: 6481
					return true; // L: 6482
				}

				if (ServerPacket.field2708 == var1.serverPacket) { // L: 6484
					Occluder.field2387 = var3.method6595(); // L: 6485
					class69.field596 = var3.method6549(); // L: 6486
					var1.serverPacket = null; // L: 6487
					return true; // L: 6488
				}

				if (ServerPacket.field2762 == var1.serverPacket) { // L: 6490
					var60 = var3.method6603(); // L: 6491
					var5 = var3.method6605(); // L: 6492
					var6 = var3.method6604(); // L: 6493
					var7 = var3.method6598(); // L: 6494
					var74 = Frames.getWidget(var7); // L: 6495
					if (var60 != var74.modelAngleX || var5 != var74.modelAngleY || var6 != var74.modelZoom) { // L: 6496
						var74.modelAngleX = var60; // L: 6497
						var74.modelAngleY = var5; // L: 6498
						var74.modelZoom = var6; // L: 6499
						WorldMapCacheName.invalidateWidget(var74); // L: 6500
					}

					var1.serverPacket = null; // L: 6502
					return true; // L: 6503
				}

				Widget var64;
				if (ServerPacket.field2761 == var1.serverPacket) { // L: 6505
					var60 = var3.method6614(); // L: 6506
					var64 = Frames.getWidget(var60); // L: 6507
					var64.modelType = 3; // L: 6508
					var64.modelId = class93.localPlayer.appearance.getChatHeadId(); // L: 6509
					WorldMapCacheName.invalidateWidget(var64); // L: 6510
					var1.serverPacket = null; // L: 6511
					return true; // L: 6512
				}

				if (ServerPacket.field2763 == var1.serverPacket) { // L: 6514
					var60 = var3.readUShortSmart(); // L: 6515
					boolean var54 = var3.readUnsignedByte() == 1; // L: 6516
					var72 = ""; // L: 6517
					boolean var52 = false; // L: 6518
					if (var54) { // L: 6519
						var72 = var3.readStringCp1252NullTerminated(); // L: 6520
						if (NetSocket.friendSystem.isIgnored(new Username(var72, WorldMapSection0.loginType))) { // L: 6521
							var52 = true;
						}
					}

					String var22 = var3.readStringCp1252NullTerminated(); // L: 6523
					if (!var52) { // L: 6524
						World.addGameMessage(var60, var72, var22);
					}

					var1.serverPacket = null; // L: 6525
					return true; // L: 6526
				}

				if (ServerPacket.field2793 == var1.serverPacket) { // L: 6528
					class170.method3554(); // L: 6529
					weight = var3.readShort(); // L: 6530
					field659 = cycleCntr; // L: 6531
					var1.serverPacket = null; // L: 6532
					return true; // L: 6533
				}

				if (ServerPacket.field2791 == var1.serverPacket) { // L: 6535
					publicChatMode = var3.readUnsignedByte(); // L: 6536
					tradeChatMode = var3.method6549(); // L: 6537
					var1.serverPacket = null; // L: 6538
					return true; // L: 6539
				}

				if (ServerPacket.field2784 == var1.serverPacket) { // L: 6541
					var3.offset += 28; // L: 6542
					if (var3.checkCrc()) { // L: 6543
						class245.method4714(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6544
					return true; // L: 6545
				}

				if (ServerPacket.field2740 == var1.serverPacket) { // L: 6547
					var60 = var3.readUnsignedShort(); // L: 6548
					if (var60 == 65535) { // L: 6549
						var60 = -1;
					}

					class27.playSong(var60); // L: 6550
					var1.serverPacket = null; // L: 6551
					return true; // L: 6552
				}

				if (ServerPacket.field2725 == var1.serverPacket) { // L: 6554
					var60 = var3.method6604(); // L: 6555
					if (var60 == 65535) { // L: 6556
						var60 = -1;
					}

					var5 = var3.method6610(); // L: 6557
					GrandExchangeOfferNameComparator.method5059(var60, var5); // L: 6558
					var1.serverPacket = null; // L: 6559
					return true; // L: 6560
				}

				if (ServerPacket.field2754 == var1.serverPacket) { // L: 6562
					var46 = var3.readStringCp1252NullTerminated(); // L: 6563
					var5 = var3.method6549(); // L: 6564
					var6 = var3.method6671(); // L: 6565
					if (var5 >= 1 && var5 <= 8) { // L: 6566
						if (var46.equalsIgnoreCase("null")) { // L: 6567
							var46 = null;
						}

						playerMenuActions[var5 - 1] = var46; // L: 6568
						playerOptionsPriorities[var5 - 1] = var6 == 0; // L: 6569
					}

					var1.serverPacket = null; // L: 6571
					return true; // L: 6572
				}

				if (ServerPacket.field2748 == var1.serverPacket) { // L: 6574
					var60 = var3.readUnsignedByte(); // L: 6575
					var5 = var3.readUnsignedByte(); // L: 6576
					var6 = var3.readUnsignedByte(); // L: 6577
					var7 = var3.readUnsignedByte(); // L: 6578
					field693[var60] = true; // L: 6579
					field890[var60] = var5; // L: 6580
					field891[var60] = var6; // L: 6581
					field892[var60] = var7; // L: 6582
					field893[var60] = 0; // L: 6583
					var1.serverPacket = null; // L: 6584
					return true; // L: 6585
				}

				if (ServerPacket.field2783 == var1.serverPacket) { // L: 6587
					class69.field596 = var3.readUnsignedByte(); // L: 6588
					Occluder.field2387 = var3.readUnsignedByte(); // L: 6589

					for (var60 = Occluder.field2387; var60 < Occluder.field2387 + 8; ++var60) { // L: 6590
						for (var5 = class69.field596; var5 < class69.field596 + 8; ++var5) { // L: 6591
							if (groundItems[class22.Client_plane][var60][var5] != null) { // L: 6592
								groundItems[class22.Client_plane][var60][var5] = null; // L: 6593
								ClanSettings.updateItemPile(var60, var5); // L: 6594
							}
						}
					}

					for (PendingSpawn var47 = (PendingSpawn)pendingSpawns.last(); var47 != null; var47 = (PendingSpawn)pendingSpawns.previous()) { // L: 6598 6599 6601
						if (var47.x >= Occluder.field2387 && var47.x < Occluder.field2387 + 8 && var47.y >= class69.field596 && var47.y < class69.field596 + 8 && var47.plane == class22.Client_plane) { // L: 6600
							var47.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6603
					return true; // L: 6604
				}

				if (ServerPacket.field2723 == var1.serverPacket) { // L: 6606
					for (var60 = 0; var60 < players.length; ++var60) { // L: 6607
						if (players[var60] != null) { // L: 6608
							players[var60].sequence = -1;
						}
					}

					for (var60 = 0; var60 < npcs.length; ++var60) { // L: 6610
						if (npcs[var60] != null) { // L: 6611
							npcs[var60].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6613
					return true; // L: 6614
				}

				if (ServerPacket.field2715 == var1.serverPacket) { // L: 6616
					var60 = var3.method6613(); // L: 6617
					var64 = Frames.getWidget(var60); // L: 6618

					for (var6 = 0; var6 < var64.itemIds.length; ++var6) { // L: 6619
						var64.itemIds[var6] = -1; // L: 6620
						var64.itemIds[var6] = 0; // L: 6621
					}

					WorldMapCacheName.invalidateWidget(var64); // L: 6623
					var1.serverPacket = null; // L: 6624
					return true; // L: 6625
				}

				if (ServerPacket.field2774 == var1.serverPacket) { // L: 6627
					class170.method3554(); // L: 6628
					var60 = var3.method6595(); // L: 6629
					var5 = var3.method6549(); // L: 6630
					var6 = var3.method6614(); // L: 6631
					experience[var5] = var6; // L: 6632
					currentLevels[var5] = var60; // L: 6633
					levels[var5] = 1; // L: 6634

					for (var7 = 0; var7 < 98; ++var7) { // L: 6635
						if (var6 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 6636
					var1.serverPacket = null; // L: 6637
					return true; // L: 6638
				}

				if (ServerPacket.field2782 == var1.serverPacket) { // L: 6640
					NetSocket.friendSystem.method1698(); // L: 6641
					field836 = cycleCntr; // L: 6642
					var1.serverPacket = null; // L: 6643
					return true; // L: 6644
				}

				if (ServerPacket.field2747 == var1.serverPacket) { // L: 6646
					var60 = var3.method6614(); // L: 6647
					var5 = var3.method6605(); // L: 6648
					var6 = var3.method6605(); // L: 6649
					var69 = Frames.getWidget(var60); // L: 6650
					var69.field3014 = var6 + (var5 << 16); // L: 6651
					var1.serverPacket = null; // L: 6652
					return true; // L: 6653
				}

				if (ServerPacket.field2731 == var1.serverPacket) { // L: 6655
					var60 = var3.method6614(); // L: 6656
					var5 = var3.readUnsignedShort(); // L: 6657
					Varps.Varps_temp[var5] = var60; // L: 6658
					if (Varps.Varps_main[var5] != var60) { // L: 6659
						Varps.Varps_main[var5] = var60; // L: 6660
					}

					ApproximateRouteStrategy.changeGameOptions(var5); // L: 6662
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6663
					var1.serverPacket = null; // L: 6664
					return true; // L: 6665
				}

				if (ServerPacket.field2771 == var1.serverPacket) { // L: 6667
					var60 = var3.readInt(); // L: 6668
					var5 = var3.readUnsignedShort(); // L: 6669
					if (var60 < -70000) { // L: 6670
						var5 += 32768;
					}

					if (var60 >= 0) { // L: 6672
						var67 = Frames.getWidget(var60);
					} else {
						var67 = null; // L: 6673
					}

					if (var67 != null) { // L: 6674
						for (var7 = 0; var7 < var67.itemIds.length; ++var7) { // L: 6675
							var67.itemIds[var7] = 0; // L: 6676
							var67.itemQuantities[var7] = 0; // L: 6677
						}
					}

					GrandExchangeOfferOwnWorldComparator.clearItemContainer(var5); // L: 6680
					var7 = var3.readUnsignedShort(); // L: 6681

					for (var8 = 0; var8 < var7; ++var8) { // L: 6682
						var9 = var3.method6604(); // L: 6683
						var20 = var3.method6595(); // L: 6684
						if (var20 == 255) { // L: 6685
							var20 = var3.method6613();
						}

						if (var67 != null && var8 < var67.itemIds.length) { // L: 6686 6687
							var67.itemIds[var8] = var9; // L: 6688
							var67.itemQuantities[var8] = var20; // L: 6689
						}

						class4.itemContainerSetItem(var5, var8, var9 - 1, var20); // L: 6692
					}

					if (var67 != null) { // L: 6694
						WorldMapCacheName.invalidateWidget(var67);
					}

					class170.method3554(); // L: 6695
					changedItemContainers[++field830 - 1 & 31] = var5 & 32767; // L: 6696
					var1.serverPacket = null; // L: 6697
					return true; // L: 6698
				}

				if (ServerPacket.field2756 == var1.serverPacket) { // L: 6700
					var60 = var3.method6604(); // L: 6701
					Login.method1941(var60); // L: 6702
					changedItemContainers[++field830 - 1 & 31] = var60 & 32767; // L: 6703
					var1.serverPacket = null; // L: 6704
					return true; // L: 6705
				}

				if (ServerPacket.field2720 == var1.serverPacket) { // L: 6707
					if (WorldMapRegion.friendsChat != null) { // L: 6708
						WorldMapRegion.friendsChat.method5659(var3); // L: 6709
					}

					CollisionMap.method3155(); // L: 6711
					var1.serverPacket = null; // L: 6712
					return true; // L: 6713
				}

				if (ServerPacket.field2755 == var1.serverPacket) { // L: 6715
					for (var60 = 0; var60 < VarpDefinition.VarpDefinition_fileCount; ++var60) { // L: 6716
						VarpDefinition var63 = ClanSettings.VarpDefinition_get(var60); // L: 6717
						if (var63 != null) { // L: 6718
							Varps.Varps_temp[var60] = 0; // L: 6719
							Varps.Varps_main[var60] = 0; // L: 6720
						}
					}

					class170.method3554(); // L: 6723
					changedVarpCount += 32; // L: 6724
					var1.serverPacket = null; // L: 6725
					return true; // L: 6726
				}

				if (ServerPacket.field2707 == var1.serverPacket) { // L: 6728
					SoundSystem.updateNpcs(false, var3); // L: 6729
					var1.serverPacket = null; // L: 6730
					return true; // L: 6731
				}

				if (ServerPacket.field2702 == var1.serverPacket) { // L: 6733
					var60 = var3.readUnsignedShort(); // L: 6734
					byte var49 = var3.readByte(); // L: 6735
					Varps.Varps_temp[var60] = var49; // L: 6736
					if (Varps.Varps_main[var60] != var49) { // L: 6737
						Varps.Varps_main[var60] = var49; // L: 6738
					}

					ApproximateRouteStrategy.changeGameOptions(var60); // L: 6740
					changedVarps[++changedVarpCount - 1 & 31] = var60; // L: 6741
					var1.serverPacket = null; // L: 6742
					return true; // L: 6743
				}

				if (ServerPacket.field2768 == var1.serverPacket) { // L: 6745
					NetSocket.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6746
					MouseRecorder.FriendSystem_invalidateIgnoreds(); // L: 6747
					field836 = cycleCntr; // L: 6748
					var1.serverPacket = null; // L: 6749
					return true; // L: 6750
				}

				if (ServerPacket.field2744 == var1.serverPacket) { // L: 6752
					Tile.method3843(class225.field2684); // L: 6753
					var1.serverPacket = null; // L: 6754
					return true; // L: 6755
				}

				if (ServerPacket.field2713 == var1.serverPacket) { // L: 6757
					var46 = var3.readStringCp1252NullTerminated(); // L: 6758
					var23 = (long)var3.readUnsignedShort(); // L: 6759
					var25 = (long)var3.readMedium(); // L: 6760
					PlayerType var33 = (PlayerType)Messages.findEnumerated(class372.PlayerType_values(), var3.readUnsignedByte()); // L: 6761
					long var34 = var25 + (var23 << 32); // L: 6762
					boolean var36 = false; // L: 6763

					for (var57 = 0; var57 < 100; ++var57) { // L: 6764
						if (crossWorldMessageIds[var57] == var34) { // L: 6765
							var36 = true; // L: 6766
							break; // L: 6767
						}
					}

					if (NetSocket.friendSystem.isIgnored(new Username(var46, WorldMapSection0.loginType))) { // L: 6770
						var36 = true;
					}

					if (!var36 && field755 == 0) { // L: 6771
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34; // L: 6772
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6773
						var32 = AbstractFont.escapeBrackets(class43.method433(MusicPatch.method4592(var3))); // L: 6774
						byte var14;
						if (var33.isPrivileged) { // L: 6776
							var14 = 7;
						} else {
							var14 = 3; // L: 6777
						}

						if (var33.modIcon != -1) { // L: 6778
							World.addGameMessage(var14, SecureRandomFuture.method1982(var33.modIcon) + var46, var32);
						} else {
							World.addGameMessage(var14, var46, var32); // L: 6779
						}
					}

					var1.serverPacket = null; // L: 6781
					return true; // L: 6782
				}

				if (ServerPacket.field2742 == var1.serverPacket) { // L: 6784
					var17 = var3.readByte(); // L: 6785
					var18 = var3.readStringCp1252NullTerminated(); // L: 6786
					long var37 = (long)var3.readUnsignedShort(); // L: 6787
					long var39 = (long)var3.readMedium(); // L: 6788
					PlayerType var10 = (PlayerType)Messages.findEnumerated(class372.PlayerType_values(), var3.readUnsignedByte()); // L: 6789
					long var41 = (var37 << 32) + var39; // L: 6790
					boolean var13 = false; // L: 6791
					ClanChannel var43 = null; // L: 6792
					var43 = var17 >= 0 ? currentClanChannels[var17] : ApproximateRouteStrategy.guestClanChannel; // L: 6794
					if (var43 == null) { // L: 6795
						var13 = true; // L: 6796
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var10.isUser && NetSocket.friendSystem.isIgnored(new Username(var18, WorldMapSection0.loginType))) { // L: 6805 6806
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var41) { // L: 6800
								var13 = true; // L: 6801
								break; // L: 6802
							}

							++var15; // L: 6799
						}
					}

					if (!var13) { // L: 6809
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41; // L: 6810
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6811
						var30 = AbstractFont.escapeBrackets(MusicPatch.method4592(var3)); // L: 6812
						int var16 = var17 >= 0 ? 41 : 44; // L: 6813
						if (var10.modIcon != -1) { // L: 6814
							class5.addChatMessage(var16, SecureRandomFuture.method1982(var10.modIcon) + var18, var30, var43.name);
						} else {
							class5.addChatMessage(var16, var18, var30, var43.name); // L: 6815
						}
					}

					var1.serverPacket = null; // L: 6817
					return true; // L: 6818
				}

				if (ServerPacket.field2716 == var1.serverPacket) { // L: 6820
					field839 = cycleCntr; // L: 6821
					var17 = var3.readByte(); // L: 6822
					class19 var62 = new class19(var3); // L: 6823
					ClanChannel var65;
					if (var17 >= 0) { // L: 6825
						var65 = currentClanChannels[var17];
					} else {
						var65 = ApproximateRouteStrategy.guestClanChannel; // L: 6826
					}

					var62.method218(var65); // L: 6827
					var1.serverPacket = null; // L: 6828
					return true; // L: 6829
				}

				if (ServerPacket.field2798 == var1.serverPacket) { // L: 6831
					class124.method2496(); // L: 6832
					var17 = var3.readByte(); // L: 6833
					class2 var61 = new class2(var3); // L: 6834
					ClanSettings var19;
					if (var17 >= 0) { // L: 6836
						var19 = currentClanSettings[var17];
					} else {
						var19 = NPCComposition.guestClanSettings; // L: 6837
					}

					var61.method16(var19); // L: 6838
					var1.serverPacket = null; // L: 6839
					return true; // L: 6840
				}

				if (ServerPacket.field2703 == var1.serverPacket) { // L: 6842
					var60 = var3.method6661(); // L: 6843
					var5 = var3.method6598(); // L: 6844
					var6 = var3.method6621(); // L: 6845
					var69 = Frames.getWidget(var5); // L: 6846
					if (var6 != var69.rawX || var60 != var69.rawY || var69.xAlignment != 0 || var69.yAlignment != 0) { // L: 6847
						var69.rawX = var6; // L: 6848
						var69.rawY = var60; // L: 6849
						var69.xAlignment = 0; // L: 6850
						var69.yAlignment = 0; // L: 6851
						WorldMapCacheName.invalidateWidget(var69); // L: 6852
						this.alignWidget(var69); // L: 6853
						if (var69.type == 0) { // L: 6854
							class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var5 >> 16], var69, false);
						}
					}

					var1.serverPacket = null; // L: 6856
					return true; // L: 6857
				}

				if (ServerPacket.field2773 == var1.serverPacket) { // L: 6859
					var60 = var3.readUnsignedByte(); // L: 6860
					var5 = var3.method6605(); // L: 6861
					var6 = var3.method6613(); // L: 6862
					var21 = (InterfaceParent)interfaceParents.get((long)var6); // L: 6863
					if (var21 != null) {
						class43.closeInterface(var21, var5 != var21.group); // L: 6864
					}

					class17.method208(var6, var5, var60); // L: 6865
					var1.serverPacket = null; // L: 6866
					return true; // L: 6867
				}

				if (ServerPacket.field2700 == var1.serverPacket) { // L: 6869
					var60 = var3.method6603(); // L: 6870
					rootInterface = var60; // L: 6871
					this.resizeRoot(false); // L: 6872
					class21.Widget_resetModelFrames(var60); // L: 6873
					FloorDecoration.runWidgetOnLoadListener(rootInterface); // L: 6874

					for (var5 = 0; var5 < 100; ++var5) { // L: 6875
						field719[var5] = true;
					}

					var1.serverPacket = null; // L: 6876
					return true; // L: 6877
				}

				if (ServerPacket.field2749 == var1.serverPacket) { // L: 6879
					if (var1.serverPacketLength == 0) { // L: 6880
						WorldMapRegion.friendsChat = null; // L: 6881
					} else {
						if (WorldMapRegion.friendsChat == null) { // L: 6884
							WorldMapRegion.friendsChat = new FriendsChat(WorldMapSection0.loginType, class23.client); // L: 6885
						}

						WorldMapRegion.friendsChat.readUpdate(var3); // L: 6887
					}

					CollisionMap.method3155(); // L: 6889
					var1.serverPacket = null; // L: 6890
					return true; // L: 6891
				}

				if (ServerPacket.field2795 == var1.serverPacket) { // L: 6893
					Tile.method3843(class225.field2688); // L: 6894
					var1.serverPacket = null; // L: 6895
					return true; // L: 6896
				}

				if (ServerPacket.field2766 == var1.serverPacket) { // L: 6898
					field839 = cycleCntr; // L: 6899
					var17 = var3.readByte(); // L: 6900
					if (var1.serverPacketLength == 1) { // L: 6901
						if (var17 >= 0) { // L: 6902
							currentClanChannels[var17] = null;
						} else {
							ApproximateRouteStrategy.guestClanChannel = null; // L: 6903
						}

						var1.serverPacket = null; // L: 6904
						return true; // L: 6905
					}

					if (var17 >= 0) { // L: 6907
						currentClanChannels[var17] = new ClanChannel(var3); // L: 6908
					} else {
						ApproximateRouteStrategy.guestClanChannel = new ClanChannel(var3); // L: 6911
					}

					var1.serverPacket = null; // L: 6913
					return true; // L: 6914
				}

				class266.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -1581409905 * 1593533807 : -1) + "," + (var1.field1412 != null ? var1.field1412.id * -1581409905 * 1593533807 : -1) + "," + (var1.field1400 != null ? var1.field1400.id * -1581409905 * 1593533807 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 6916
				class7.logOut(); // L: 6917
			} catch (IOException var44) { // L: 6919
				NetFileRequest.method4912(); // L: 6920
			} catch (Exception var45) {
				var18 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -1581409905 * 1593533807 : -1) + "," + (var1.field1412 != null ? var1.field1412.id * -1581409905 * 1593533807 : -1) + "," + (var1.field1400 != null ? var1.field1400.id * -1581409905 * 1593533807 : -1) + "," + var1.serverPacketLength + "," + (class93.localPlayer.pathX[0] + VertexNormal.baseX) + "," + (class93.localPlayer.pathY[0] + SoundSystem.baseY) + ","; // L: 6923

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 6924
					var18 = var18 + var3.array[var6] + ",";
				}

				class266.RunException_sendStackTrace(var18, var45); // L: 6925
				class7.logOut(); // L: 6926
			}

			return true; // L: 6928
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("menu")
	final void menu() {
		class377.method6509(); // L: 7624
		if (Script.dragInventoryWidget == null) { // L: 7625
			if (clickedWidget == null) { // L: 7626
				int var2;
				int var4;
				int var5;
				int var9;
				int var10;
				label272: {
					int var1 = MouseHandler.MouseHandler_lastButton; // L: 7627
					int var3;
					int var8;
					if (isMenuOpen) { // L: 7628
						int var13;
						int var15;
						if (var1 != 1 && (mouseCam || var1 != 4)) { // L: 7629
							var2 = MouseHandler.MouseHandler_x; // L: 7630
							var3 = MouseHandler.MouseHandler_y; // L: 7631
							if (var2 < class14.menuX - 10 || var2 > class14.menuX + class29.menuWidth + 10 || var3 < class243.menuY - 10 || var3 > class243.menuY + class24.menuHeight + 10) { // L: 7632
								isMenuOpen = false; // L: 7633
								var4 = class14.menuX; // L: 7634
								var5 = class243.menuY; // L: 7635
								var13 = class29.menuWidth; // L: 7636
								var15 = class24.menuHeight; // L: 7637

								for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 7639
									if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var13 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var15) { // L: 7640
										field719[var8] = true;
									}
								}
							}
						}

						if (var1 == 1 || !mouseCam && var1 == 4) { // L: 7645
							var2 = class14.menuX; // L: 7646
							var3 = class243.menuY; // L: 7647
							var4 = class29.menuWidth; // L: 7648
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 7649
							var13 = MouseHandler.MouseHandler_lastPressedY; // L: 7650
							var15 = -1; // L: 7651

							for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 7652
								var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 7653
								if (var5 > var2 && var5 < var2 + var4 && var13 > var9 - 13 && var13 < var9 + 3) { // L: 7654
									var15 = var8;
								}
							}

							if (var15 != -1) { // L: 7656
								Interpreter.method1888(var15);
							}

							isMenuOpen = false; // L: 7657
							var8 = class14.menuX; // L: 7658
							var9 = class243.menuY; // L: 7659
							var10 = class29.menuWidth; // L: 7660
							int var14 = class24.menuHeight; // L: 7661

							for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 7663
								if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var14) { // L: 7664
									field719[var12] = true;
								}
							}
						}
					} else {
						var2 = MilliClock.method2588(); // L: 7670
						if ((var1 == 1 || !mouseCam && var1 == 4) && var2 >= 0) { // L: 7671
							var3 = menuOpcodes[var2]; // L: 7672
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 7673
								var4 = menuArguments1[var2]; // L: 7674
								var5 = menuArguments2[var2]; // L: 7675
								Widget var6 = Frames.getWidget(var5); // L: 7676
								var8 = class21.getWidgetFlags(var6); // L: 7678
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 7680
								if (var7) { // L: 7682
									break label272;
								}

								Object var10000 = null;
								if (Canvas.method394(class21.getWidgetFlags(var6))) {
									break label272;
								}
							}
						}

						if ((var1 == 1 || !mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 7716 7717
							var1 = 2; // L: 7718
						}

						if ((var1 == 1 || !mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 7721
							Interpreter.method1888(var2); // L: 7722
						}

						if (var1 == 2 && menuOptionsCount > 0) { // L: 7724
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 7726
				}

				if (Script.dragInventoryWidget != null && !field848 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 7683 7684
					var9 = draggedWidgetX; // L: 7685
					var10 = draggedWidgetY; // L: 7686
					MenuAction var11 = ReflectionCheck.tempMenuAction; // L: 7688
					Script.menuAction(var11.param0, var11.param1, var11.opcode, var11.identifier, var11.action, var11.action, var9, var10); // L: 7690
					ReflectionCheck.tempMenuAction = null; // L: 7692
				}

				field848 = false; // L: 7696
				itemDragDuration = 0; // L: 7697
				if (Script.dragInventoryWidget != null) { // L: 7698
					WorldMapCacheName.invalidateWidget(Script.dragInventoryWidget);
				}

				Script.dragInventoryWidget = Frames.getWidget(var5); // L: 7699
				dragItemSlotSource = var4; // L: 7700
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 7701
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 7702
				if (var2 >= 0) { // L: 7703
					ReflectionCheck.tempMenuAction = new MenuAction(); // L: 7704
					ReflectionCheck.tempMenuAction.param0 = menuArguments1[var2]; // L: 7705
					ReflectionCheck.tempMenuAction.param1 = menuArguments2[var2]; // L: 7706
					ReflectionCheck.tempMenuAction.opcode = menuOpcodes[var2]; // L: 7707
					ReflectionCheck.tempMenuAction.identifier = menuIdentifiers[var2]; // L: 7708
					ReflectionCheck.tempMenuAction.action = menuActions[var2]; // L: 7709
				}

				WorldMapCacheName.invalidateWidget(Script.dragInventoryWidget); // L: 7711
			}
		}
	} // L: 7712

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1407075512"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = MilliClock.method2588(); // L: 7729
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || class5.method51(var1)) && !menuShiftClick[var1]; // L: 7730
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1521465353"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		ReflectionCheck.method1126(var1, var2); // L: 7734
		AbstractSocket.scene.menuOpen(class22.Client_plane, var1, var2, false); // L: 7735
		isMenuOpen = true; // L: 7736
	} // L: 7737

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2038823416"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		PlayerType.method4857(rootInterface, class32.canvasWidth, ReflectionCheck.canvasHeight, var1); // L: 9736
	} // L: 9737

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V",
		garbageValue = "2012935641"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : Frames.getWidget(var1.parentId); // L: 9740
		int var3;
		int var4;
		if (var2 == null) { // L: 9743
			var3 = class32.canvasWidth; // L: 9744
			var4 = ReflectionCheck.canvasHeight; // L: 9745
		} else {
			var3 = var2.width; // L: 9748
			var4 = var2.height; // L: 9749
		}

		Clock.alignWidgetSize(var1, var3, var4, false); // L: 9751
		class24.alignWidgetPosition(var1, var3, var4); // L: 9752
	} // L: 9753

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	final void method1198() {
		WorldMapCacheName.invalidateWidget(clickedWidget); // L: 10714
		++Actor.widgetDragDuration; // L: 10715
		if (field822 && field819) { // L: 10716
			int var1 = MouseHandler.MouseHandler_x; // L: 10722
			int var2 = MouseHandler.MouseHandler_y; // L: 10723
			var1 -= widgetClickX; // L: 10724
			var2 -= widgetClickY; // L: 10725
			if (var1 < field740) { // L: 10726
				var1 = field740;
			}

			if (var1 + clickedWidget.width > field740 + clickedWidgetParent.width) { // L: 10727
				var1 = field740 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field821) { // L: 10728
				var2 = field821;
			}

			if (var2 + clickedWidget.height > field821 + clickedWidgetParent.height) { // L: 10729
				var2 = field821 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field854; // L: 10730
			int var4 = var2 - field804; // L: 10731
			int var5 = clickedWidget.dragZoneSize; // L: 10732
			if (Actor.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 10733 10734
				isDraggingWidget = true; // L: 10735
			}

			int var6 = var1 - field740 + clickedWidgetParent.scrollX; // L: 10738
			int var7 = var2 - field821 + clickedWidgetParent.scrollY; // L: 10739
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 10740
				var8 = new ScriptEvent(); // L: 10741
				var8.widget = clickedWidget; // L: 10742
				var8.mouseX = var6; // L: 10743
				var8.mouseY = var7; // L: 10744
				var8.args = clickedWidget.onDrag; // L: 10745
				PacketWriter.runScriptEvent(var8); // L: 10746
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 10748
				if (isDraggingWidget) { // L: 10749
					if (clickedWidget.onDragComplete != null) { // L: 10750
						var8 = new ScriptEvent(); // L: 10751
						var8.widget = clickedWidget; // L: 10752
						var8.mouseX = var6; // L: 10753
						var8.mouseY = var7; // L: 10754
						var8.dragTarget = draggedOnWidget; // L: 10755
						var8.args = clickedWidget.onDragComplete; // L: 10756
						PacketWriter.runScriptEvent(var8); // L: 10757
					}

					if (draggedOnWidget != null && StructComposition.method2892(clickedWidget) != null) { // L: 10759
						PacketBufferNode var12 = class21.getPacketBufferNode(ClientPacket.field2586, packetWriter.isaacCipher); // L: 10761
						var12.packetBuffer.method6611(draggedOnWidget.id); // L: 10762
						var12.packetBuffer.method6602(clickedWidget.itemId); // L: 10763
						var12.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 10764
						var12.packetBuffer.writeInt(clickedWidget.id); // L: 10765
						var12.packetBuffer.writeShort(draggedOnWidget.itemId); // L: 10766
						var12.packetBuffer.method6602(clickedWidget.childIndex); // L: 10767
						packetWriter.addNode(var12); // L: 10768
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 10772
					this.openMenu(field854 + widgetClickX, widgetClickY + field804); // L: 10773
				} else if (menuOptionsCount > 0) { // L: 10775
					int var11 = field854 + widgetClickX; // L: 10776
					int var9 = widgetClickY + field804; // L: 10777
					MenuAction var10 = ReflectionCheck.tempMenuAction; // L: 10779
					Script.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var11, var9); // L: 10781
					ReflectionCheck.tempMenuAction = null; // L: 10783
				}

				clickedWidget = null; // L: 10787
			}

		} else {
			if (Actor.widgetDragDuration > 1) { // L: 10717
				clickedWidget = null; // L: 10718
			}

		}
	} // L: 10720 10789

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)Lly;",
		garbageValue = "-1180229355"
	)
	@Export("username")
	public Username username() {
		return class93.localPlayer != null ? class93.localPlayer.username : null; // L: 11477
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2028963456"
	)
	static boolean method1514() {
		return (drawPlayerNames & 4) != 0; // L: 4422
	}
}
