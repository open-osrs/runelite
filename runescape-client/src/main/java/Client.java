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
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "[Lx;"
	)
	static class11[] field678;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1788518295
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -113595795
	)
	static int field824;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		longValue = 5266993254335523925L
	)
	static long field833;
	@ObfuscatedName("qc")
	static boolean field866;
	@ObfuscatedName("oi")
	static boolean[] field825;
	@ObfuscatedName("pb")
	static boolean[] field636;
	@ObfuscatedName("oe")
	static boolean[] field826;
	@ObfuscatedName("pq")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = -1549606513
	)
	public static int field687;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pr")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pf")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 262990251
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("px")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	static final ApproximateRouteStrategy field894;
	@ObfuscatedName("pj")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 1483097923
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -40329921
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 616687799
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("tt")
	static int[] field828;
	@ObfuscatedName("th")
	static int[] field896;
	@ObfuscatedName("tr")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 1233962749
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = -735836521
	)
	static int field630;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -85732501
	)
	static int field631;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "[Lg;"
	)
	static class3[] field847;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 850098079
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -236108179
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -1291952621
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ro")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("rl")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rh")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "[Lah;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 789202625
	)
	static int field848;
	@ObfuscatedName("rc")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		longValue = -3798909112925654061L
	)
	static long field799;
	@ObfuscatedName("ri")
	static boolean[] field846;
	@ObfuscatedName("rn")
	static int[] field744;
	@ObfuscatedName("sr")
	static short field820;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = 628214371
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("re")
	static int[] field868;
	@ObfuscatedName("sh")
	static short field872;
	@ObfuscatedName("sf")
	static short field877;
	@ObfuscatedName("rs")
	static int[] field869;
	@ObfuscatedName("ss")
	static short field878;
	@ObfuscatedName("sd")
	static int[] field870;
	@ObfuscatedName("qm")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sl")
	static short field738;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -210947507
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("si")
	static short field875;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = -1100911913
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("qp")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = 1410279679
	)
	static int field893;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ra")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -924623343
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1145926541
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -1876245101
	)
	static int field842;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = -1350718359
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("su")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("sj")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -202544545
	)
	static int field696;
	@ObfuscatedName("po")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("pv")
	static int[] field844;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static NodeDeque field865;
	@ObfuscatedName("pz")
	static int[] field746;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static NodeDeque field821;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1716898751
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "[Ljm;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -1775028253
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 2144397203
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("pk")
	static int[] field651;
	@ObfuscatedName("pw")
	static String field843;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfa;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("an")
	static boolean field767;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -692981731
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1329265657
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2041787237
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bt")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("by")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1908341387
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -437666989
	)
	static int field621;
	@ObfuscatedName("bi")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2142578293
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cq")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 991600141
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		longValue = -7684819836719052823L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1325156765
	)
	static int field627;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -72303975
	)
	static int field837;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		longValue = 2473810867611188183L
	)
	static long field629;
	@ObfuscatedName("cp")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cr")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1479862317
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -225259253
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1520579627
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 163411299
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1197232959
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 878242253
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -728381759
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 219564971
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 620991381
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 210105277
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 216100051
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 2041285997
	)
	static int field646;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 1231560959
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1387097531
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -340243899
	)
	static int field649;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -512490615
	)
	static int field749;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 153516227
	)
	static int field673;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static class125 field652;
	@ObfuscatedName("eb")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fa")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "[Lds;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 1541459935
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fo")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 1005735511
	)
	static int field661;
	@ObfuscatedName("fe")
	static int[] field662;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1365433979
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fk")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("fc")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fd")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 844995417
	)
	static int field669;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 242618933
	)
	static int field670;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 914071231
	)
	static int field671;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -347228261
	)
	static int field672;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1685518623
	)
	static int field790;
	@ObfuscatedName("ge")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gt")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gi")
	static final int[] field677;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -1396894627
	)
	static int field768;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -148347713
	)
	static int field679;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -2098931785
	)
	static int field680;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 10479103
	)
	static int field681;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -1139086205
	)
	static int field658;
	@ObfuscatedName("hg")
	static boolean field683;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1528783631
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -1461862337
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = 844977603
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 1815922645
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = 1379421729
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 2142968919
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 541743917
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -618034625
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1408776823
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 363746617
	)
	static int field693;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -763624637
	)
	static int field694;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -1603870419
	)
	static int field695;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -832411863
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -217353197
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = 102452491
	)
	static int field839;
	@ObfuscatedName("io")
	static boolean field699;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -941791215
	)
	static int field700;
	@ObfuscatedName("ih")
	static boolean field701;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1674344591
	)
	static int field702;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1530805403
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 1202936959
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("iu")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("id")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ig")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ib")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iy")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jk")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jq")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jh")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jr")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = -853391295
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -1874267305
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 963772291
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 41238441
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 109132029
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 790228439
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1356198849
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 265343843
	)
	static int field817;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 349995619
	)
	static int field633;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 1346918943
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 1136970621
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 631327227
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 1883127447
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jl")
	static boolean field728;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 776678463
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -932914447
	)
	static int field727;
	@ObfuscatedName("jn")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lcg;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1354032689
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1658998443
	)
	static int field734;
	@ObfuscatedName("kz")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1751716757
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -533269303
	)
	static int field737;
	@ObfuscatedName("kc")
	static int[] field614;
	@ObfuscatedName("kh")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("kq")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kv")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ks")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -566095449
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "[[[Lka;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kf")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kg")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lv")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 1571858545
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lj")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 505897793
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lm")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lr")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lf")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lo")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lq")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ls")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("la")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lc")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ld")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("ly")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lw")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 603205383
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 601388073
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1882009083
	)
	static int field741;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 1654565793
	)
	static int field811;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1660999759
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("mi")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -740413975
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = 1336991211
	)
	static int field773;
	@ObfuscatedName("ml")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ma")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = -357201731
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -354031881
	)
	static int field778;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 45793283
	)
	static int field779;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -517702931
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 2005264199
	)
	static int field781;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1243890845
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 104863933
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -850293393
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -597963117
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("nj")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 667205137
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -1660810691
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("nh")
	static boolean field794;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -2004615367
	)
	static int field795;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -699615005
	)
	static int field785;
	@ObfuscatedName("nz")
	static boolean field797;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1453699169
	)
	static int field871;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = 116122765
	)
	static int field798;
	@ObfuscatedName("nn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 367486059
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("nd")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -1280387963
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("ns")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -657143437
	)
	static int field805;
	@ObfuscatedName("nf")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1210343069
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("op")
	static int[] field808;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 1273627685
	)
	static int field809;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -499616417
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -1349767563
	)
	static int field801;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 1371918319
	)
	static int field698;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -781333479
	)
	static int field822;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 151143003
	)
	static int field814;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -90279163
	)
	static int field815;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -195161785
	)
	static int field816;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 690686753
	)
	static int field731;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	Buffer field655;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	class35 field656;

	static {
		field767 = true; // L: 194
		worldId = 1; // L: 195
		worldProperties = 0; // L: 196
		gameBuild = 0; // L: 198
		isMembersWorld = false; // L: 201
		isLowDetail = false; // L: 202
		clientType = -1; // L: 207
		field621 = -1; // L: 208
		onMobile = false; // L: 209
		gameState = 0; // L: 210
		isLoading = true; // L: 231
		cycle = 0; // L: 232
		mouseLastLastPressedTimeMillis = -1L; // L: 233
		field627 = -1; // L: 235
		field837 = -1; // L: 236
		field629 = -1L; // L: 237
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
		field646 = 0; // L: 257
		js5Errors = 0; // L: 279
		loginState = 0; // L: 281
		field649 = 0; // L: 282
		field749 = 0; // L: 283
		field673 = 0; // L: 284
		field652 = class125.field1449; // L: 285
		Login_isUsernameRemembered = false; // L: 294
		secureRandomFuture = new SecureRandomFuture(); // L: 295
		randomDatData = null; // L: 300
		npcs = new NPC[32768]; // L: 304
		npcCount = 0; // L: 305
		npcIndices = new int[32768]; // L: 306
		field661 = 0; // L: 307
		field662 = new int[250]; // L: 308
		packetWriter = new PacketWriter(); // L: 311
		logoutTimer = 0; // L: 313
		hadNetworkError = false; // L: 314
		useBufferedSocket = true; // L: 315
		timer = new Timer(); // L: 316
		fontsMap = new HashMap(); // L: 322
		field669 = 0; // L: 329
		field670 = 1; // L: 330
		field671 = 0; // L: 331
		field672 = 1; // L: 332
		field790 = 0; // L: 333
		collisionMaps = new CollisionMap[4]; // L: 341
		isInInstance = false; // L: 342
		instanceChunkTemplates = new int[4][13][13]; // L: 343
		field677 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 344
		field768 = 0; // L: 347
		field679 = 2301979; // L: 359
		field680 = 5063219; // L: 360
		field681 = 3353893; // L: 361
		field658 = 7759444; // L: 362
		field683 = false; // L: 363
		alternativeScrollbarWidth = 0; // L: 364
		camAngleX = 128; // L: 372
		camAngleY = 0; // L: 373
		camAngleDY = 0; // L: 374
		camAngleDX = 0; // L: 375
		mouseCamClickedX = 0; // L: 376
		mouseCamClickedY = 0; // L: 377
		oculusOrbState = 0; // L: 378
		camFollowHeight = 50; // L: 379
		field693 = 0; // L: 383
		field694 = 0; // L: 384
		field695 = 0; // L: 385
		oculusOrbNormalSpeed = 12; // L: 387
		oculusOrbSlowedSpeed = 6; // L: 388
		field839 = 0; // L: 389
		field699 = false; // L: 390
		field700 = 0; // L: 391
		field701 = false; // L: 392
		field702 = 0; // L: 393
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
		field817 = 0; // L: 414
		field633 = 0; // L: 415
		dragItemSlotSource = 0; // L: 418
		draggedWidgetX = 0; // L: 419
		draggedWidgetY = 0; // L: 420
		dragItemSlotDestination = 0; // L: 421
		field728 = false; // L: 422
		itemDragDuration = 0; // L: 423
		field727 = 0; // L: 424
		showLoadingMessages = true; // L: 426
		players = new Player[2048]; // L: 428
		localPlayerIndex = -1; // L: 430
		field734 = 0; // L: 431
		renderSelf = true; // L: 433
		drawPlayerNames = 0; // L: 438
		field737 = 0; // L: 439
		field614 = new int[1000]; // L: 440
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
		field741 = 0; // L: 479
		field811 = 50; // L: 480
		isItemSelected = 0; // L: 481
		selectedItemName = null; // L: 485
		isSpellSelected = false; // L: 486
		selectedSpellChildIndex = -1; // L: 488
		field773 = -1; // L: 489
		selectedSpellActionName = null; // L: 491
		selectedSpellName = null; // L: 492
		rootInterface = -1; // L: 493
		interfaceParents = new NodeHashTable(8); // L: 494
		field778 = 0; // L: 499
		field779 = -1; // L: 500
		chatEffects = 0; // L: 501
		field781 = 0; // L: 502
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
		field794 = false; // L: 515
		field795 = -1; // L: 516
		field785 = -1; // L: 517
		field797 = false; // L: 518
		field871 = -1; // L: 519
		field798 = -1; // L: 520
		isDraggingWidget = false; // L: 521
		cycleCntr = 1; // L: 526
		changedVarps = new int[32]; // L: 529
		changedVarpCount = 0; // L: 530
		changedItemContainers = new int[32]; // L: 531
		field805 = 0; // L: 532
		changedSkills = new int[32]; // L: 533
		changedSkillsCount = 0; // L: 534
		field808 = new int[32]; // L: 535
		field809 = 0; // L: 536
		chatCycle = 0; // L: 537
		field801 = 0; // L: 538
		field698 = 0; // L: 539
		field822 = 0; // L: 540
		field814 = 0; // L: 541
		field815 = 0; // L: 542
		field816 = 0; // L: 543
		field731 = 0; // L: 544
		mouseWheelRotation = 0; // L: 550
		scriptEvents = new NodeDeque(); // L: 551
		field865 = new NodeDeque(); // L: 552
		field821 = new NodeDeque(); // L: 553
		widgetFlags = new NodeHashTable(512); // L: 554
		rootWidgetCount = 0; // L: 556
		field824 = -2; // L: 557
		field825 = new boolean[100]; // L: 558
		field826 = new boolean[100]; // L: 559
		field636 = new boolean[100]; // L: 560
		rootWidgetXs = new int[100]; // L: 561
		rootWidgetYs = new int[100]; // L: 562
		rootWidgetWidths = new int[100]; // L: 563
		rootWidgetHeights = new int[100]; // L: 564
		gameDrawingMode = 0; // L: 565
		field833 = 0L; // L: 566
		isResizable = true; // L: 567
		field651 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 574
		publicChatMode = 0; // L: 575
		tradeChatMode = 0; // L: 577
		field843 = ""; // L: 578
		crossWorldMessageIds = new long[100]; // L: 580
		crossWorldMessageIdsIndex = 0; // L: 581
		field842 = 0; // L: 583
		field746 = new int[128]; // L: 584
		field844 = new int[128]; // L: 585
		field799 = -1L; // L: 586
		field678 = new class11[1]; // L: 590
		field847 = new class3[1]; // L: 592
		field848 = -1; // L: 594
		mapIconCount = 0; // L: 595
		mapIconXs = new int[1000]; // L: 596
		mapIconYs = new int[1000]; // L: 597
		mapIcons = new SpritePixels[1000]; // L: 598
		destinationX = 0; // L: 599
		destinationY = 0; // L: 600
		minimapState = 0; // L: 607
		currentTrackGroupId = -1; // L: 608
		field866 = false; // L: 609
		soundEffectCount = 0; // L: 615
		soundEffectIds = new int[50]; // L: 616
		queuedSoundEffectLoops = new int[50]; // L: 617
		queuedSoundEffectDelays = new int[50]; // L: 618
		soundLocations = new int[50]; // L: 619
		soundEffects = new SoundEffect[50]; // L: 620
		isCameraLocked = false; // L: 622
		field846 = new boolean[5]; // L: 634
		field744 = new int[5]; // L: 635
		field868 = new int[5]; // L: 636
		field869 = new int[5]; // L: 637
		field870 = new int[5]; // L: 638
		field820 = 256; // L: 639
		field872 = 205; // L: 640
		zoomHeight = 256; // L: 641
		zoomWidth = 320; // L: 642
		field875 = 1; // L: 643
		field738 = 32767; // L: 644
		field877 = 1; // L: 645
		field878 = 32767; // L: 646
		viewportOffsetX = 0; // L: 647
		viewportOffsetY = 0; // L: 648
		viewportWidth = 0; // L: 649
		viewportHeight = 0; // L: 650
		viewportZoom = 0; // L: 651
		playerAppearance = new PlayerComposition(); // L: 653
		field630 = -1; // L: 654
		field631 = -1; // L: 655
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 657
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 659
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 662
		field687 = -1; // L: 669
		archiveLoaders = new ArrayList(10); // L: 670
		archiveLoadersDone = 0; // L: 671
		field893 = 0; // L: 672
		field894 = new ApproximateRouteStrategy(); // L: 681
		field828 = new int[50]; // L: 682
		field896 = new int[50]; // L: 683
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-997141942"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field833 = Archive.currentTimeMillis() + 500L; // L: 4360
		this.resizeJS(); // L: 4361
		if (rootInterface != -1) { // L: 4362
			this.resizeRoot(true);
		}

	} // L: 4363

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254682788"
	)
	@Export("setUp")
	protected final void setUp() {
		Players.method2312(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 812
		class69.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 813
		class24.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 814
		BoundaryObject.currentPort = class69.worldPort; // L: 815
		PlayerComposition.field2934 = class245.field2949; // L: 816
		Canvas.field295 = class245.field2948; // L: 817
		Script.field1064 = class245.field2950; // L: 818
		PlayerComposition.field2937 = class245.field2951; // L: 819
		class19.urlRequester = new UrlRequester(); // L: 820
		this.setUpKeyboard(); // L: 821
		this.setUpMouse(); // L: 822
		class2.mouseWheel = this.mouseWheel(); // L: 823
		class1.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 824
		AccessFile var2 = null; // L: 827
		ClientPreferences var3 = new ClientPreferences(); // L: 828

		try {
			var2 = Buddy.getPreferencesFile("", NetSocket.field1492.name, false); // L: 830
			byte[] var4 = new byte[(int)var2.length()]; // L: 831

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 832 833 836
				var6 = var2.read(var4, var5, var4.length - var5); // L: 834
				if (var6 == -1) { // L: 835
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 838
		} catch (Exception var8) { // L: 840
		}

		try {
			if (var2 != null) { // L: 842
				var2.close();
			}
		} catch (Exception var7) { // L: 844
		}

		class12.clientPreferences = var3; // L: 847
		this.setUpClipboard(); // L: 848
		String var9 = ModeWhere.null_string; // L: 850
		class44.applet = this; // L: 852
		if (var9 != null) { // L: 853
			class44.field305 = var9;
		}

		if (gameBuild != 0) { // L: 855
			displayFps = true;
		}

		class374.setWindowedMode(class12.clientPreferences.windowMode); // L: 856
		GrandExchangeOfferUnitPriceComparator.friendSystem = new FriendSystem(ModeWhere.loginType); // L: 857
	} // L: 858

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "302617031"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 861
		this.doCycleJs5(); // L: 862
		class10.method109(); // L: 863
		class371.method6333(); // L: 864
		WorldMapIcon_1.playPcmPlayers(); // L: 865
		Players.method2311(); // L: 866
		synchronized(MouseHandler.MouseHandler_instance) { // L: 868
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 869
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 870
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 871
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 872
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 873
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 874
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 875
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 876
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 877
		} // L: 878

		int var45;
		if (class2.mouseWheel != null) { // L: 880
			var45 = class2.mouseWheel.useRotation(); // L: 881
			mouseWheelRotation = var45; // L: 882
		}

		if (gameState == 0) { // L: 884
			UrlRequest.load(); // L: 885
			WorldMapRectangle.clock.mark(); // L: 887

			for (var45 = 0; var45 < 32; ++var45) { // L: 888
				GameEngine.graphicsTickTimes[var45] = 0L;
			}

			for (var45 = 0; var45 < 32; ++var45) { // L: 889
				GameEngine.clientTickTimes[var45] = 0L;
			}

			GameEngine.gameCyclesToDo = 0; // L: 890
		} else if (gameState == 5) { // L: 893
			class179.doCycleTitle(this); // L: 894
			UrlRequest.load(); // L: 895
			WorldMapRectangle.clock.mark(); // L: 897

			for (var45 = 0; var45 < 32; ++var45) { // L: 898
				GameEngine.graphicsTickTimes[var45] = 0L;
			}

			for (var45 = 0; var45 < 32; ++var45) { // L: 899
				GameEngine.clientTickTimes[var45] = 0L;
			}

			GameEngine.gameCyclesToDo = 0; // L: 900
		} else if (gameState != 10 && gameState != 11) { // L: 903
			if (gameState == 20) { // L: 904
				class179.doCycleTitle(this); // L: 905
				this.doCycleLoggedOut(); // L: 906
			} else if (gameState == 25) { // L: 908
				class9.method97(false); // L: 909
				field669 = 0; // L: 910
				boolean var77 = true; // L: 911

				int var46;
				for (var46 = 0; var46 < Messages.regionLandArchives.length; ++var46) { // L: 912
					if (class264.regionMapArchiveIds[var46] != -1 && Messages.regionLandArchives[var46] == null) { // L: 913 914
						Messages.regionLandArchives[var46] = WorldMapSection0.archive5.takeFile(class264.regionMapArchiveIds[var46], 0); // L: 915
						if (Messages.regionLandArchives[var46] == null) { // L: 916
							var77 = false; // L: 917
							++field669; // L: 918
						}
					}

					if (class15.regionLandArchiveIds[var46] != -1 && class159.regionMapArchives[var46] == null) { // L: 922 923
						class159.regionMapArchives[var46] = WorldMapSection0.archive5.takeFileEncrypted(class15.regionLandArchiveIds[var46], 0, FriendsList.xteaKeys[var46]); // L: 924
						if (class159.regionMapArchives[var46] == null) { // L: 925
							var77 = false; // L: 926
							++field669; // L: 927
						}
					}
				}

				if (!var77) { // L: 932
					field790 = 1; // L: 933
				} else {
					field671 = 0; // L: 936
					var77 = true; // L: 937

					int var4;
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
					for (var46 = 0; var46 < Messages.regionLandArchives.length; ++var46) { // L: 938
						byte[] var3 = class159.regionMapArchives[var46]; // L: 939
						if (var3 != null) { // L: 940
							var4 = (HealthBar.regions[var46] >> 8) * 64 - JagexCache.baseX; // L: 941
							var5 = (HealthBar.regions[var46] & 255) * 64 - Messages.baseY; // L: 942
							if (isInInstance) { // L: 943
								var4 = 10; // L: 944
								var5 = 10; // L: 945
							}

							boolean var8 = true; // L: 950
							var9 = new Buffer(var3); // L: 951
							var10 = -1; // L: 952

							label1497:
							while (true) {
								var11 = var9.method6462(); // L: 954
								if (var11 == 0) { // L: 955
									var77 &= var8; // L: 988
									break;
								}

								var10 += var11; // L: 956
								var12 = 0; // L: 957
								boolean var13 = false; // L: 958

								while (true) {
									while (!var13) { // L: 960
										var14 = var9.readUShortSmart(); // L: 966
										if (var14 == 0) { // L: 967
											continue label1497;
										}

										var12 += var14 - 1; // L: 968
										var15 = var12 & 63; // L: 969
										var16 = var12 >> 6 & 63; // L: 970
										var17 = var9.readUnsignedByte() >> 2; // L: 971
										var18 = var4 + var16; // L: 972
										var19 = var5 + var15; // L: 973
										if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) { // L: 974
											ObjectComposition var20 = AttackOption.getObjectDefinition(var10); // L: 975
											if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) { // L: 976
												if (!var20.needsModelFiles()) { // L: 977
													++field671; // L: 978
													var8 = false; // L: 979
												}

												var13 = true; // L: 981
											}
										}
									}

									var14 = var9.readUShortSmart(); // L: 961
									if (var14 == 0) { // L: 962
										break;
									}

									var9.readUnsignedByte(); // L: 963
								}
							}
						}
					}

					if (!var77) { // L: 991
						field790 = 2; // L: 992
					} else {
						if (field790 != 0) { // L: 995
							class7.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						WorldMapIcon_1.playPcmPlayers(); // L: 996
						class5.scene.clear(); // L: 997

						for (var46 = 0; var46 < 4; ++var46) { // L: 998
							collisionMaps[var46].clear();
						}

						int var47;
						for (var46 = 0; var46 < 4; ++var46) { // L: 999
							for (var47 = 0; var47 < 104; ++var47) { // L: 1000
								for (var4 = 0; var4 < 104; ++var4) { // L: 1001
									Tiles.Tiles_renderFlags[var46][var47][var4] = 0; // L: 1002
								}
							}
						}

						WorldMapIcon_1.playPcmPlayers(); // L: 1006
						Tiles.Tiles_minPlane = 99; // L: 1008
						Tiles.field1097 = new byte[4][104][104]; // L: 1009
						class9.field71 = new byte[4][104][104]; // L: 1010
						Tiles.field1088 = new byte[4][104][104]; // L: 1011
						Tiles.field1086 = new byte[4][104][104]; // L: 1012
						Tiles.field1105 = new int[4][105][105]; // L: 1013
						Tiles.field1090 = new byte[4][105][105]; // L: 1014
						StructComposition.field1730 = new int[105][105]; // L: 1015
						Tiles.Tiles_hue = new int[104]; // L: 1016
						class280.Tiles_saturation = new int[104]; // L: 1017
						Tiles.Tiles_lightness = new int[104]; // L: 1018
						class20.Tiles_hueMultiplier = new int[104]; // L: 1019
						AbstractByteArrayCopier.field3115 = new int[104]; // L: 1020
						var46 = Messages.regionLandArchives.length; // L: 1022

						for (ObjectSound var66 = (ObjectSound)ObjectSound.objectSounds.last(); var66 != null; var66 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 1024
							if (var66.stream1 != null) { // L: 1025
								FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var66.stream1); // L: 1026
								var66.stream1 = null; // L: 1027
							}

							if (var66.stream2 != null) { // L: 1029
								FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var66.stream2); // L: 1030
								var66.stream2 = null; // L: 1031
							}
						}

						ObjectSound.objectSounds.clear(); // L: 1034
						class9.method97(true); // L: 1036
						int var6;
						int var7;
						int[] var10000;
						int var21;
						int var22;
						int var53;
						int var69;
						int var71;
						if (!isInInstance) { // L: 1037
							var47 = 0;

							label1429:
							while (true) {
								byte[] var48;
								if (var47 >= var46) {
									for (var47 = 0; var47 < var46; ++var47) { // L: 1066
										var4 = (HealthBar.regions[var47] >> 8) * 64 - JagexCache.baseX; // L: 1067
										var5 = (HealthBar.regions[var47] & 255) * 64 - Messages.baseY; // L: 1068
										var48 = Messages.regionLandArchives[var47]; // L: 1069
										if (var48 == null && class11.field112 < 800) { // L: 1070
											WorldMapIcon_1.playPcmPlayers(); // L: 1071
											FileSystem.method2542(var4, var5, 64, 64); // L: 1072
										}
									}

									class9.method97(true); // L: 1075
									var47 = 0;

									while (true) {
										if (var47 >= var46) {
											break label1429;
										}

										byte[] var50 = class159.regionMapArchives[var47]; // L: 1077
										if (var50 != null) { // L: 1078
											var5 = (HealthBar.regions[var47] >> 8) * 64 - JagexCache.baseX; // L: 1079
											var6 = (HealthBar.regions[var47] & 255) * 64 - Messages.baseY; // L: 1080
											WorldMapIcon_1.playPcmPlayers(); // L: 1081
											Scene var51 = class5.scene; // L: 1082
											CollisionMap[] var52 = collisionMaps; // L: 1083
											var9 = new Buffer(var50); // L: 1085
											var10 = -1; // L: 1086

											while (true) {
												var11 = var9.method6462(); // L: 1088
												if (var11 == 0) { // L: 1089
													break;
												}

												var10 += var11; // L: 1090
												var12 = 0; // L: 1091

												while (true) {
													var71 = var9.readUShortSmart(); // L: 1093
													if (var71 == 0) { // L: 1094
														break;
													}

													var12 += var71 - 1; // L: 1095
													var14 = var12 & 63; // L: 1096
													var15 = var12 >> 6 & 63; // L: 1097
													var16 = var12 >> 12; // L: 1098
													var17 = var9.readUnsignedByte(); // L: 1099
													var18 = var17 >> 2; // L: 1100
													var19 = var17 & 3; // L: 1101
													var53 = var5 + var15; // L: 1102
													var21 = var14 + var6; // L: 1103
													if (var53 > 0 && var21 > 0 && var53 < 103 && var21 < 103) { // L: 1104
														var22 = var16; // L: 1105
														if ((Tiles.Tiles_renderFlags[1][var53][var21] & 2) == 2) { // L: 1106
															var22 = var16 - 1;
														}

														CollisionMap var23 = null; // L: 1107
														if (var22 >= 0) { // L: 1108
															var23 = var52[var22];
														}

														ClanChat.method5541(var16, var53, var21, var10, var19, var18, var51, var23); // L: 1109
													}
												}
											}
										}

										++var47; // L: 1076
									}
								}

								var4 = (HealthBar.regions[var47] >> 8) * 64 - JagexCache.baseX; // L: 1039
								var5 = (HealthBar.regions[var47] & 255) * 64 - Messages.baseY; // L: 1040
								var48 = Messages.regionLandArchives[var47]; // L: 1041
								if (var48 != null) { // L: 1042
									WorldMapIcon_1.playPcmPlayers(); // L: 1043
									var7 = MusicPatchNode2.field2827 * 8 - 48; // L: 1044
									var69 = class11.field112 * 8 - 48; // L: 1045
									CollisionMap[] var70 = collisionMaps; // L: 1046
									var10 = 0;

									label1426:
									while (true) {
										if (var10 >= 4) {
											Buffer var49 = new Buffer(var48); // L: 1055
											var11 = 0;

											while (true) {
												if (var11 >= 4) {
													break label1426;
												}

												for (var12 = 0; var12 < 64; ++var12) { // L: 1057
													for (var71 = 0; var71 < 64; ++var71) { // L: 1058
														AbstractWorldMapData.loadTerrain(var49, var11, var4 + var12, var5 + var71, var7, var69, 0); // L: 1059
													}
												}

												++var11; // L: 1056
											}
										}

										for (var11 = 0; var11 < 64; ++var11) { // L: 1049
											for (var12 = 0; var12 < 64; ++var12) { // L: 1050
												if (var11 + var4 > 0 && var4 + var11 < 103 && var12 + var5 > 0 && var5 + var12 < 103) { // L: 1051
													var10000 = var70[var10].flags[var11 + var4];
													var10000[var5 + var12] &= -16777217;
												}
											}
										}

										++var10; // L: 1048
									}
								}

								++var47; // L: 1038
							}
						}

						int var24;
						int var25;
						int var26;
						int var27;
						int var28;
						int var29;
						int var30;
						int var33;
						int var34;
						int var35;
						int var36;
						int var37;
						int var39;
						int var40;
						int var41;
						int var54;
						int var58;
						if (isInInstance) { // L: 1117
							var47 = 0;

							label1362:
							while (true) {
								if (var47 >= 4) {
									for (var47 = 0; var47 < 13; ++var47) { // L: 1160
										for (var4 = 0; var4 < 13; ++var4) { // L: 1161
											var5 = instanceChunkTemplates[0][var47][var4]; // L: 1162
											if (var5 == -1) { // L: 1163
												FileSystem.method2542(var47 * 8, var4 * 8, 8, 8); // L: 1164
											}
										}
									}

									class9.method97(true); // L: 1168
									var47 = 0;

									while (true) {
										if (var47 >= 4) {
											break label1362;
										}

										WorldMapIcon_1.playPcmPlayers(); // L: 1170

										for (var4 = 0; var4 < 13; ++var4) { // L: 1171
											label1285:
											for (var5 = 0; var5 < 13; ++var5) { // L: 1172
												var6 = instanceChunkTemplates[var47][var4][var5]; // L: 1173
												if (var6 != -1) { // L: 1174
													var7 = var6 >> 24 & 3; // L: 1175
													var69 = var6 >> 1 & 3; // L: 1176
													var54 = var6 >> 14 & 1023; // L: 1177
													var10 = var6 >> 3 & 2047; // L: 1178
													var11 = (var54 / 8 << 8) + var10 / 8; // L: 1179

													for (var12 = 0; var12 < HealthBar.regions.length; ++var12) { // L: 1180
														if (HealthBar.regions[var12] == var11 && class159.regionMapArchives[var12] != null) { // L: 1181
															byte[] var55 = class159.regionMapArchives[var12]; // L: 1182
															var14 = var4 * 8; // L: 1183
															var15 = var5 * 8; // L: 1184
															var16 = (var54 & 7) * 8; // L: 1185
															var17 = (var10 & 7) * 8; // L: 1186
															Scene var56 = class5.scene; // L: 1187
															CollisionMap[] var57 = collisionMaps; // L: 1188
															Buffer var72 = new Buffer(var55); // L: 1190
															var21 = -1; // L: 1191

															while (true) {
																var22 = var72.method6462(); // L: 1193
																if (var22 == 0) { // L: 1194
																	continue label1285;
																}

																var21 += var22; // L: 1195
																var58 = 0; // L: 1196

																while (true) {
																	var24 = var72.readUShortSmart(); // L: 1198
																	if (var24 == 0) { // L: 1199
																		break;
																	}

																	var58 += var24 - 1; // L: 1200
																	var25 = var58 & 63; // L: 1201
																	var26 = var58 >> 6 & 63; // L: 1202
																	var27 = var58 >> 12; // L: 1203
																	var28 = var72.readUnsignedByte(); // L: 1204
																	var29 = var28 >> 2; // L: 1205
																	var30 = var28 & 3; // L: 1206
																	if (var27 == var7 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) { // L: 1207
																		ObjectComposition var31 = AttackOption.getObjectDefinition(var21); // L: 1208
																		var34 = var26 & 7; // L: 1211
																		var35 = var25 & 7; // L: 1212
																		var37 = var31.sizeX; // L: 1214
																		int var38 = var31.sizeY; // L: 1215
																		if ((var30 & 1) == 1) { // L: 1217
																			var39 = var37; // L: 1218
																			var37 = var38; // L: 1219
																			var38 = var39; // L: 1220
																		}

																		var36 = var69 & 3; // L: 1222
																		if (var36 == 0) { // L: 1223
																			var33 = var34; // L: 1224
																		} else if (var36 == 1) { // L: 1227
																			var33 = var35; // L: 1228
																		} else if (var36 == 2) { // L: 1231
																			var33 = 7 - var34 - (var37 - 1); // L: 1232
																		} else {
																			var33 = 7 - var35 - (var38 - 1); // L: 1235
																		}

																		var39 = var14 + var33; // L: 1237
																		var40 = var15 + GameEngine.method674(var26 & 7, var25 & 7, var69, var31.sizeX, var31.sizeY, var30); // L: 1238
																		if (var39 > 0 && var40 > 0 && var39 < 103 && var40 < 103) { // L: 1239
																			var41 = var47; // L: 1240
																			if ((Tiles.Tiles_renderFlags[1][var39][var40] & 2) == 2) { // L: 1241
																				var41 = var47 - 1;
																			}

																			CollisionMap var42 = null; // L: 1242
																			if (var41 >= 0) { // L: 1243
																				var42 = var57[var41];
																			}

																			ClanChat.method5541(var47, var39, var40, var21, var69 + var30 & 3, var29, var56, var42); // L: 1244
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var47; // L: 1169
									}
								}

								WorldMapIcon_1.playPcmPlayers(); // L: 1119

								for (var4 = 0; var4 < 13; ++var4) { // L: 1120
									for (var5 = 0; var5 < 13; ++var5) { // L: 1121
										boolean var68 = false; // L: 1122
										var7 = instanceChunkTemplates[var47][var4][var5]; // L: 1123
										if (var7 != -1) { // L: 1124
											var69 = var7 >> 24 & 3; // L: 1125
											var54 = var7 >> 1 & 3; // L: 1126
											var10 = var7 >> 14 & 1023; // L: 1127
											var11 = var7 >> 3 & 2047; // L: 1128
											var12 = (var10 / 8 << 8) + var11 / 8; // L: 1129

											for (var71 = 0; var71 < HealthBar.regions.length; ++var71) { // L: 1130
												if (HealthBar.regions[var71] == var12 && Messages.regionLandArchives[var71] != null) { // L: 1131
													class29.method355(Messages.regionLandArchives[var71], var47, var4 * 8, var5 * 8, var69, (var10 & 7) * 8, (var11 & 7) * 8, var54, collisionMaps); // L: 1132
													var68 = true; // L: 1133
													break; // L: 1134
												}
											}
										}

										if (!var68) { // L: 1138
											var69 = var47; // L: 1139
											var54 = var4 * 8; // L: 1140
											var10 = var5 * 8; // L: 1141

											for (var11 = 0; var11 < 8; ++var11) { // L: 1143
												for (var12 = 0; var12 < 8; ++var12) { // L: 1144
													Tiles.Tiles_heights[var69][var11 + var54][var10 + var12] = 0;
												}
											}

											if (var54 > 0) { // L: 1146
												for (var11 = 1; var11 < 8; ++var11) { // L: 1147
													Tiles.Tiles_heights[var69][var54][var11 + var10] = Tiles.Tiles_heights[var69][var54 - 1][var11 + var10];
												}
											}

											if (var10 > 0) { // L: 1149
												for (var11 = 1; var11 < 8; ++var11) { // L: 1150
													Tiles.Tiles_heights[var69][var11 + var54][var10] = Tiles.Tiles_heights[var69][var54 + var11][var10 - 1];
												}
											}

											if (var54 > 0 && Tiles.Tiles_heights[var69][var54 - 1][var10] != 0) { // L: 1152
												Tiles.Tiles_heights[var69][var54][var10] = Tiles.Tiles_heights[var69][var54 - 1][var10];
											} else if (var10 > 0 && Tiles.Tiles_heights[var69][var54][var10 - 1] != 0) { // L: 1153
												Tiles.Tiles_heights[var69][var54][var10] = Tiles.Tiles_heights[var69][var54][var10 - 1];
											} else if (var54 > 0 && var10 > 0 && Tiles.Tiles_heights[var69][var54 - 1][var10 - 1] != 0) { // L: 1154
												Tiles.Tiles_heights[var69][var54][var10] = Tiles.Tiles_heights[var69][var54 - 1][var10 - 1];
											}
										}
									}
								}

								++var47; // L: 1118
							}
						}

						class9.method97(true); // L: 1258
						WorldMapIcon_1.playPcmPlayers(); // L: 1259
						Scene var67 = class5.scene; // L: 1260
						CollisionMap[] var81 = collisionMaps; // L: 1261

						for (var5 = 0; var5 < 4; ++var5) { // L: 1263
							for (var6 = 0; var6 < 104; ++var6) { // L: 1264
								for (var7 = 0; var7 < 104; ++var7) { // L: 1265
									if ((Tiles.Tiles_renderFlags[var5][var6][var7] & 1) == 1) { // L: 1266
										var69 = var5; // L: 1267
										if ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 1268
											var69 = var5 - 1;
										}

										if (var69 >= 0) { // L: 1269
											var81[var69].setBlockedByFloor(var6, var7);
										}
									}
								}
							}
						}

						Tiles.field1092 += (int)(Math.random() * 5.0D) - 2; // L: 1274
						if (Tiles.field1092 < -8) { // L: 1275
							Tiles.field1092 = -8;
						}

						if (Tiles.field1092 > 8) { // L: 1276
							Tiles.field1092 = 8;
						}

						Tiles.field1101 += (int)(Math.random() * 5.0D) - 2; // L: 1277
						if (Tiles.field1101 < -16) { // L: 1278
							Tiles.field1101 = -16;
						}

						if (Tiles.field1101 > 16) { // L: 1279
							Tiles.field1101 = 16;
						}

						for (var5 = 0; var5 < 4; ++var5) { // L: 1280
							byte[][] var78 = Tiles.field1090[var5]; // L: 1281
							var12 = (int)Math.sqrt(5100.0D); // L: 1287
							var71 = var12 * 768 >> 8; // L: 1288

							for (var14 = 1; var14 < 103; ++var14) { // L: 1289
								for (var15 = 1; var15 < 103; ++var15) { // L: 1290
									var16 = Tiles.Tiles_heights[var5][var15 + 1][var14] - Tiles.Tiles_heights[var5][var15 - 1][var14]; // L: 1291
									var17 = Tiles.Tiles_heights[var5][var15][var14 + 1] - Tiles.Tiles_heights[var5][var15][var14 - 1]; // L: 1292
									var18 = (int)Math.sqrt((double)(var16 * var16 + var17 * var17 + 65536)); // L: 1293
									var19 = (var16 << 8) / var18; // L: 1294
									var53 = 65536 / var18; // L: 1295
									var21 = (var17 << 8) / var18; // L: 1296
									var22 = (var19 * -50 + var21 * -50 + var53 * -10) / var71 + 96; // L: 1297
									var58 = (var78[var15][var14 + 1] >> 3) + (var78[var15 - 1][var14] >> 2) + (var78[var15][var14 - 1] >> 2) + (var78[var15 + 1][var14] >> 3) + (var78[var15][var14] >> 1); // L: 1298
									StructComposition.field1730[var15][var14] = var22 - var58; // L: 1299
								}
							}

							for (var14 = 0; var14 < 104; ++var14) { // L: 1302
								Tiles.Tiles_hue[var14] = 0; // L: 1303
								class280.Tiles_saturation[var14] = 0; // L: 1304
								Tiles.Tiles_lightness[var14] = 0; // L: 1305
								class20.Tiles_hueMultiplier[var14] = 0; // L: 1306
								AbstractByteArrayCopier.field3115[var14] = 0; // L: 1307
							}

							for (var14 = -5; var14 < 109; ++var14) { // L: 1309
								for (var15 = 0; var15 < 104; ++var15) { // L: 1310
									var16 = var14 + 5; // L: 1311
									int var10002;
									if (var16 >= 0 && var16 < 104) { // L: 1312
										var17 = Tiles.field1097[var5][var16][var15] & 255; // L: 1313
										if (var17 > 0) { // L: 1314
											var19 = var17 - 1; // L: 1316
											FloorUnderlayDefinition var73 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var19); // L: 1318
											FloorUnderlayDefinition var82;
											if (var73 != null) { // L: 1319
												var82 = var73; // L: 1320
											} else {
												byte[] var59 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var19); // L: 1323
												var73 = new FloorUnderlayDefinition(); // L: 1324
												if (var59 != null) { // L: 1325
													var73.decode(new Buffer(var59), var19);
												}

												var73.postDecode(); // L: 1326
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var73, (long)var19); // L: 1327
												var82 = var73; // L: 1328
											}

											var10000 = Tiles.Tiles_hue; // L: 1331
											var10000[var15] += var82.hue;
											var10000 = class280.Tiles_saturation; // L: 1332
											var10000[var15] += var82.saturation;
											var10000 = Tiles.Tiles_lightness; // L: 1333
											var10000[var15] += var82.lightness;
											var10000 = class20.Tiles_hueMultiplier; // L: 1334
											var10000[var15] += var82.hueMultiplier;
											var10002 = AbstractByteArrayCopier.field3115[var15]++; // L: 1335
										}
									}

									var17 = var14 - 5; // L: 1338
									if (var17 >= 0 && var17 < 104) { // L: 1339
										var18 = Tiles.field1097[var5][var17][var15] & 255; // L: 1340
										if (var18 > 0) { // L: 1341
											var53 = var18 - 1; // L: 1343
											FloorUnderlayDefinition var84 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var53); // L: 1345
											FloorUnderlayDefinition var83;
											if (var84 != null) { // L: 1346
												var83 = var84; // L: 1347
											} else {
												byte[] var60 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var53); // L: 1350
												var84 = new FloorUnderlayDefinition(); // L: 1351
												if (var60 != null) { // L: 1352
													var84.decode(new Buffer(var60), var53);
												}

												var84.postDecode(); // L: 1353
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var84, (long)var53); // L: 1354
												var83 = var84; // L: 1355
											}

											var10000 = Tiles.Tiles_hue; // L: 1358
											var10000[var15] -= var83.hue;
											var10000 = class280.Tiles_saturation; // L: 1359
											var10000[var15] -= var83.saturation;
											var10000 = Tiles.Tiles_lightness; // L: 1360
											var10000[var15] -= var83.lightness;
											var10000 = class20.Tiles_hueMultiplier; // L: 1361
											var10000[var15] -= var83.hueMultiplier;
											var10002 = AbstractByteArrayCopier.field3115[var15]--; // L: 1362
										}
									}
								}

								if (var14 >= 1 && var14 < 103) { // L: 1366
									var15 = 0; // L: 1367
									var16 = 0; // L: 1368
									var17 = 0; // L: 1369
									var18 = 0; // L: 1370
									var19 = 0; // L: 1371

									for (var53 = -5; var53 < 109; ++var53) { // L: 1372
										var21 = var53 + 5; // L: 1373
										if (var21 >= 0 && var21 < 104) { // L: 1374
											var15 += Tiles.Tiles_hue[var21]; // L: 1375
											var16 += class280.Tiles_saturation[var21]; // L: 1376
											var17 += Tiles.Tiles_lightness[var21]; // L: 1377
											var18 += class20.Tiles_hueMultiplier[var21]; // L: 1378
											var19 += AbstractByteArrayCopier.field3115[var21]; // L: 1379
										}

										var22 = var53 - 5; // L: 1381
										if (var22 >= 0 && var22 < 104) { // L: 1382
											var15 -= Tiles.Tiles_hue[var22]; // L: 1383
											var16 -= class280.Tiles_saturation[var22]; // L: 1384
											var17 -= Tiles.Tiles_lightness[var22]; // L: 1385
											var18 -= class20.Tiles_hueMultiplier[var22]; // L: 1386
											var19 -= AbstractByteArrayCopier.field3115[var22]; // L: 1387
										}

										if (var53 >= 1 && var53 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var53] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var53] & 16) == 0)) { // L: 1389 1390 1391 1392
											if (var5 < Tiles.Tiles_minPlane) { // L: 1395
												Tiles.Tiles_minPlane = var5;
											}

											var58 = Tiles.field1097[var5][var14][var53] & 255; // L: 1396
											var24 = class9.field71[var5][var14][var53] & 255; // L: 1397
											if (var58 > 0 || var24 > 0) { // L: 1398
												var25 = Tiles.Tiles_heights[var5][var14][var53]; // L: 1399
												var26 = Tiles.Tiles_heights[var5][var14 + 1][var53]; // L: 1400
												var27 = Tiles.Tiles_heights[var5][var14 + 1][var53 + 1]; // L: 1401
												var28 = Tiles.Tiles_heights[var5][var14][var53 + 1]; // L: 1402
												var29 = StructComposition.field1730[var14][var53]; // L: 1403
												var30 = StructComposition.field1730[var14 + 1][var53]; // L: 1404
												int var61 = StructComposition.field1730[var14 + 1][var53 + 1]; // L: 1405
												int var32 = StructComposition.field1730[var14][var53 + 1]; // L: 1406
												var33 = -1; // L: 1407
												var34 = -1; // L: 1408
												if (var58 > 0) { // L: 1409
													var35 = var15 * 256 / var18; // L: 1410
													var36 = var16 / var19; // L: 1411
													var37 = var17 / var19; // L: 1412
													var33 = Message.hslToRgb(var35, var36, var37); // L: 1413
													var35 = var35 + Tiles.field1092 & 255; // L: 1414
													var37 += Tiles.field1101; // L: 1415
													if (var37 < 0) { // L: 1416
														var37 = 0;
													} else if (var37 > 255) { // L: 1417
														var37 = 255;
													}

													var34 = Message.hslToRgb(var35, var36, var37); // L: 1418
												}

												if (var5 > 0) { // L: 1420
													boolean var75 = true; // L: 1421
													if (var58 == 0 && Tiles.field1088[var5][var14][var53] != 0) { // L: 1422
														var75 = false;
													}

													if (var24 > 0 && !WorldMapSection0.method3534(var24 - 1).hideUnderlay) { // L: 1423
														var75 = false;
													}

													if (var75 && var26 == var25 && var25 == var27 && var28 == var25) { // L: 1424 1425
														var10000 = Tiles.field1105[var5][var14];
														var10000[var53] |= 2340;
													}
												}

												var35 = 0; // L: 1428
												if (var34 != -1) { // L: 1429
													var35 = Rasterizer3D.Rasterizer3D_colorPalette[GrandExchangeOfferNameComparator.method4986(var34, 96)];
												}

												if (var24 == 0) { // L: 1430
													var67.addTile(var5, var14, var53, 0, 0, -1, var25, var26, var27, var28, GrandExchangeOfferNameComparator.method4986(var33, var29), GrandExchangeOfferNameComparator.method4986(var33, var30), GrandExchangeOfferNameComparator.method4986(var33, var61), GrandExchangeOfferNameComparator.method4986(var33, var32), 0, 0, 0, 0, var35, 0); // L: 1431
												} else {
													var36 = Tiles.field1088[var5][var14][var53] + 1; // L: 1434
													byte var76 = Tiles.field1086[var5][var14][var53]; // L: 1435
													FloorOverlayDefinition var62 = WorldMapSection0.method3534(var24 - 1); // L: 1436
													var39 = var62.texture; // L: 1437
													int var43;
													int var63;
													if (var39 >= 0) { // L: 1440
														var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var39); // L: 1441
														var40 = -1; // L: 1442
													} else if (var62.primaryRgb == 16711935) { // L: 1445
														var40 = -2; // L: 1446
														var39 = -1; // L: 1447
														var41 = -2; // L: 1448
													} else {
														var40 = Message.hslToRgb(var62.hue, var62.saturation, var62.lightness); // L: 1451
														var63 = var62.hue + Tiles.field1092 & 255; // L: 1452
														var43 = var62.lightness + Tiles.field1101; // L: 1453
														if (var43 < 0) { // L: 1454
															var43 = 0;
														} else if (var43 > 255) { // L: 1455
															var43 = 255;
														}

														var41 = Message.hslToRgb(var63, var62.saturation, var43); // L: 1456
													}

													var63 = 0; // L: 1459
													if (var41 != -2) { // L: 1460
														var63 = Rasterizer3D.Rasterizer3D_colorPalette[class43.method487(var41, 96)];
													}

													if (var62.secondaryRgb != -1) { // L: 1461
														var43 = var62.secondaryHue + Tiles.field1092 & 255; // L: 1462
														int var44 = var62.secondaryLightness + Tiles.field1101; // L: 1463
														if (var44 < 0) { // L: 1464
															var44 = 0;
														} else if (var44 > 255) { // L: 1465
															var44 = 255;
														}

														var41 = Message.hslToRgb(var43, var62.secondarySaturation, var44); // L: 1466
														var63 = Rasterizer3D.Rasterizer3D_colorPalette[class43.method487(var41, 96)]; // L: 1467
													}

													var67.addTile(var5, var14, var53, var36, var76, var39, var25, var26, var27, var28, GrandExchangeOfferNameComparator.method4986(var33, var29), GrandExchangeOfferNameComparator.method4986(var33, var30), GrandExchangeOfferNameComparator.method4986(var33, var61), GrandExchangeOfferNameComparator.method4986(var33, var32), class43.method487(var40, var29), class43.method487(var40, var30), class43.method487(var40, var61), class43.method487(var40, var32), var35, var63); // L: 1469
												}
											}
										}
									}
								}
							}

							for (var14 = 1; var14 < 103; ++var14) { // L: 1476
								for (var15 = 1; var15 < 103; ++var15) { // L: 1477
									if ((Tiles.Tiles_renderFlags[var5][var15][var14] & 8) != 0) { // L: 1484
										var53 = 0; // L: 1485
									} else if (var5 > 0 && (Tiles.Tiles_renderFlags[1][var15][var14] & 2) != 0) { // L: 1488
										var53 = var5 - 1; // L: 1489
									} else {
										var53 = var5; // L: 1492
									}

									var67.setTileMinPlane(var5, var15, var14, var53); // L: 1494
								}
							}

							Tiles.field1097[var5] = null; // L: 1497
							class9.field71[var5] = null; // L: 1498
							Tiles.field1088[var5] = null; // L: 1499
							Tiles.field1086[var5] = null; // L: 1500
							Tiles.field1090[var5] = null; // L: 1501
						}

						var67.method3932(-50, -10, -50); // L: 1503

						for (var5 = 0; var5 < 104; ++var5) { // L: 1504
							for (var6 = 0; var6 < 104; ++var6) { // L: 1505
								if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) { // L: 1506
									var67.setLinkBelow(var5, var6);
								}
							}
						}

						var5 = 1; // L: 1509
						var6 = 2; // L: 1510
						var7 = 4; // L: 1511

						for (var69 = 0; var69 < 4; ++var69) { // L: 1512
							if (var69 > 0) { // L: 1513
								var5 <<= 3; // L: 1514
								var6 <<= 3; // L: 1515
								var7 <<= 3; // L: 1516
							}

							for (var54 = 0; var54 <= var69; ++var54) { // L: 1518
								for (var10 = 0; var10 <= 104; ++var10) { // L: 1519
									for (var11 = 0; var11 <= 104; ++var11) { // L: 1520
										short var74;
										if ((Tiles.field1105[var54][var11][var10] & var5) != 0) { // L: 1521
											var12 = var10; // L: 1522
											var71 = var10; // L: 1523
											var14 = var54; // L: 1524

											for (var15 = var54; var12 > 0 && (Tiles.field1105[var54][var11][var12 - 1] & var5) != 0; --var12) { // L: 1525 1526
											}

											while (var71 < 104 && (Tiles.field1105[var54][var11][var71 + 1] & var5) != 0) { // L: 1527
												++var71;
											}

											label1004:
											while (var14 > 0) { // L: 1528
												for (var16 = var12; var16 <= var71; ++var16) { // L: 1529
													if ((Tiles.field1105[var14 - 1][var11][var16] & var5) == 0) {
														break label1004;
													}
												}

												--var14; // L: 1530
											}

											label993:
											while (var15 < var69) { // L: 1532
												for (var16 = var12; var16 <= var71; ++var16) { // L: 1533
													if ((Tiles.field1105[var15 + 1][var11][var16] & var5) == 0) {
														break label993;
													}
												}

												++var15; // L: 1534
											}

											var16 = (var15 + 1 - var14) * (var71 - var12 + 1); // L: 1536
											if (var16 >= 8) { // L: 1537
												var74 = 240; // L: 1538
												var18 = Tiles.Tiles_heights[var15][var11][var12] - var74; // L: 1539
												var19 = Tiles.Tiles_heights[var14][var11][var12]; // L: 1540
												Scene.Scene_addOccluder(var69, 1, var11 * 128, var11 * 128, var12 * 128, var71 * 128 + 128, var18, var19); // L: 1541

												for (var53 = var14; var53 <= var15; ++var53) { // L: 1542
													for (var21 = var12; var21 <= var71; ++var21) { // L: 1543
														var10000 = Tiles.field1105[var53][var11];
														var10000[var21] &= ~var5;
													}
												}
											}
										}

										if ((Tiles.field1105[var54][var11][var10] & var6) != 0) { // L: 1547
											var12 = var11; // L: 1548
											var71 = var11; // L: 1549
											var14 = var54; // L: 1550

											for (var15 = var54; var12 > 0 && (Tiles.field1105[var54][var12 - 1][var10] & var6) != 0; --var12) { // L: 1551 1552
											}

											while (var71 < 104 && (Tiles.field1105[var54][var71 + 1][var10] & var6) != 0) { // L: 1553
												++var71;
											}

											label1057:
											while (var14 > 0) { // L: 1554
												for (var16 = var12; var16 <= var71; ++var16) { // L: 1555
													if ((Tiles.field1105[var14 - 1][var16][var10] & var6) == 0) {
														break label1057;
													}
												}

												--var14; // L: 1556
											}

											label1046:
											while (var15 < var69) { // L: 1558
												for (var16 = var12; var16 <= var71; ++var16) { // L: 1559
													if ((Tiles.field1105[var15 + 1][var16][var10] & var6) == 0) {
														break label1046;
													}
												}

												++var15; // L: 1560
											}

											var16 = (var71 - var12 + 1) * (var15 + 1 - var14); // L: 1562
											if (var16 >= 8) { // L: 1563
												var74 = 240; // L: 1564
												var18 = Tiles.Tiles_heights[var15][var12][var10] - var74; // L: 1565
												var19 = Tiles.Tiles_heights[var14][var12][var10]; // L: 1566
												Scene.Scene_addOccluder(var69, 2, var12 * 128, var71 * 128 + 128, var10 * 128, var10 * 128, var18, var19); // L: 1567

												for (var53 = var14; var53 <= var15; ++var53) { // L: 1568
													for (var21 = var12; var21 <= var71; ++var21) { // L: 1569
														var10000 = Tiles.field1105[var53][var21];
														var10000[var10] &= ~var6;
													}
												}
											}
										}

										if ((Tiles.field1105[var54][var11][var10] & var7) != 0) { // L: 1573
											var12 = var11; // L: 1574
											var71 = var11; // L: 1575
											var14 = var10; // L: 1576

											for (var15 = var10; var14 > 0 && (Tiles.field1105[var54][var11][var14 - 1] & var7) != 0; --var14) { // L: 1577 1578
											}

											while (var15 < 104 && (Tiles.field1105[var54][var11][var15 + 1] & var7) != 0) { // L: 1579
												++var15;
											}

											label1110:
											while (var12 > 0) { // L: 1580
												for (var16 = var14; var16 <= var15; ++var16) { // L: 1581
													if ((Tiles.field1105[var54][var12 - 1][var16] & var7) == 0) {
														break label1110;
													}
												}

												--var12; // L: 1582
											}

											label1099:
											while (var71 < 104) { // L: 1584
												for (var16 = var14; var16 <= var15; ++var16) { // L: 1585
													if ((Tiles.field1105[var54][var71 + 1][var16] & var7) == 0) {
														break label1099;
													}
												}

												++var71; // L: 1586
											}

											if ((var15 - var14 + 1) * (var71 - var12 + 1) >= 4) { // L: 1588
												var16 = Tiles.Tiles_heights[var54][var12][var14]; // L: 1589
												Scene.Scene_addOccluder(var69, 4, var12 * 128, var71 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16); // L: 1590

												for (var17 = var12; var17 <= var71; ++var17) { // L: 1591
													for (var18 = var14; var18 <= var15; ++var18) { // L: 1592
														var10000 = Tiles.field1105[var54][var17];
														var10000[var18] &= ~var7;
													}
												}
											}
										}
									}
								}
							}
						}

						class9.method97(true); // L: 1601
						var5 = Tiles.Tiles_minPlane; // L: 1602
						if (var5 > ParamComposition.Client_plane) { // L: 1603
							var5 = ParamComposition.Client_plane;
						}

						if (var5 < ParamComposition.Client_plane - 1) { // L: 1604
							var5 = ParamComposition.Client_plane - 1;
						}

						if (isLowDetail) { // L: 1605
							class5.scene.init(Tiles.Tiles_minPlane);
						} else {
							class5.scene.init(0); // L: 1606
						}

						for (var6 = 0; var6 < 104; ++var6) { // L: 1607
							for (var7 = 0; var7 < 104; ++var7) { // L: 1608
								Varcs.updateItemPile(var6, var7); // L: 1609
							}
						}

						WorldMapIcon_1.playPcmPlayers(); // L: 1612

						for (PendingSpawn var79 = (PendingSpawn)pendingSpawns.last(); var79 != null; var79 = (PendingSpawn)pendingSpawns.previous()) { // L: 1614 1615 1621
							if (var79.hitpoints == -1) { // L: 1616
								var79.delay = 0; // L: 1617
								WorldMapData_0.method3145(var79); // L: 1618
							} else {
								var79.remove(); // L: 1620
							}
						}

						ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 1624
						PacketBufferNode var80;
						if (class303.client.hasFrame()) { // L: 1625
							var80 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2637, packetWriter.isaacCipher); // L: 1627
							var80.packetBuffer.writeInt(1057001181); // L: 1628
							packetWriter.addNode(var80); // L: 1629
						}

						if (!isInInstance) { // L: 1631
							var6 = (MusicPatchNode2.field2827 - 6) / 8; // L: 1632
							var7 = (MusicPatchNode2.field2827 + 6) / 8; // L: 1633
							var69 = (class11.field112 - 6) / 8; // L: 1634
							var54 = (class11.field112 + 6) / 8; // L: 1635

							for (var10 = var6 - 1; var10 <= var7 + 1; ++var10) { // L: 1636
								for (var11 = var69 - 1; var11 <= var54 + 1; ++var11) { // L: 1637
									if (var10 < var6 || var10 > var7 || var11 < var69 || var11 > var54) { // L: 1638
										WorldMapSection0.archive5.loadRegionFromName("m" + var10 + "_" + var11); // L: 1639
										WorldMapSection0.archive5.loadRegionFromName("l" + var10 + "_" + var11); // L: 1640
									}
								}
							}
						}

						updateGameState(30); // L: 1644
						WorldMapIcon_1.playPcmPlayers(); // L: 1645
						class14.method224(); // L: 1646
						var80 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2662, packetWriter.isaacCipher); // L: 1647
						packetWriter.addNode(var80); // L: 1648
						WorldMapRectangle.clock.mark(); // L: 1650

						for (var7 = 0; var7 < 32; ++var7) { // L: 1651
							GameEngine.graphicsTickTimes[var7] = 0L;
						}

						for (var7 = 0; var7 < 32; ++var7) { // L: 1652
							GameEngine.clientTickTimes[var7] = 0L;
						}

						GameEngine.gameCyclesToDo = 0; // L: 1653
					}
				}
			}
		} else {
			class179.doCycleTitle(this);
		}

		if (gameState == 30) { // L: 1656
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1657
			this.doCycleLoggedOut();
		}

	} // L: 1658

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1176468254"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = WorldMapID.method3587(); // L: 1661
		if (var2 && field866 && WorldMapAreaData.pcmPlayer0 != null) { // L: 1662 1663
			WorldMapAreaData.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field833 != 0L && Archive.currentTimeMillis() > field833) { // L: 1665 1666
			class374.setWindowedMode(HitSplatDefinition.getWindowedMode()); // L: 1667
		}

		int var3;
		if (var1) { // L: 1670
			for (var3 = 0; var3 < 100; ++var3) { // L: 1671
				field825[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1673
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1674
			class23.drawTitle(WorldMapArea.fontBold12, class11.fontPlain11, Message.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1675
			if (gameState == 20) { // L: 1676
				class23.drawTitle(WorldMapArea.fontBold12, class11.fontPlain11, Message.fontPlain12);
			} else if (gameState == 25) { // L: 1677
				if (field790 == 1) { // L: 1678
					if (field669 > field670) { // L: 1679
						field670 = field669;
					}

					var3 = (field670 * 50 - field669 * 50) / field670; // L: 1680
					class7.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1681
				} else if (field790 == 2) { // L: 1683
					if (field671 > field672) { // L: 1684
						field672 = field671;
					}

					var3 = (field672 * 50 - field671 * 50) / field672 + 50; // L: 1685
					class7.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1686
				} else {
					class7.drawLoadingMessage("Loading - please wait.", false); // L: 1688
				}
			} else if (gameState == 30) { // L: 1690
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1691
				class7.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1692
				class7.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class23.drawTitle(WorldMapArea.fontBold12, class11.fontPlain11, Message.fontPlain12); // L: 1682
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1693
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1694
				if (field826[var3]) { // L: 1695
					WorldMapDecorationType.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1696
					field826[var3] = false; // L: 1697
				}
			}
		} else if (gameState > 0) { // L: 1701
			WorldMapDecorationType.rasterProvider.drawFull(0, 0); // L: 1702

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1703
				field826[var3] = false;
			}
		}

	} // L: 1705

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2107475994"
	)
	@Export("kill0")
	protected final void kill0() {
		if (varcs.hasUnwrittenChanges()) { // L: 1708
			varcs.write();
		}

		if (class69.mouseRecorder != null) { // L: 1709
			class69.mouseRecorder.isRunning = false;
		}

		class69.mouseRecorder = null; // L: 1710
		packetWriter.close(); // L: 1711
		class29.method354(); // L: 1712
		if (MouseHandler.MouseHandler_instance != null) { // L: 1714
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1715
				MouseHandler.MouseHandler_instance = null; // L: 1716
			} // L: 1717
		}

		class2.mouseWheel = null; // L: 1720
		if (WorldMapAreaData.pcmPlayer0 != null) { // L: 1721
			WorldMapAreaData.pcmPlayer0.shutdown();
		}

		if (class93.pcmPlayer1 != null) { // L: 1722
			class93.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1724
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1727
			if (ArchiveDiskActionHandler.field3574 != 0) { // L: 1728
				ArchiveDiskActionHandler.field3574 = 1; // L: 1729

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1731
				} catch (InterruptedException var5) { // L: 1733
				}
			}
		}

		if (class19.urlRequester != null) { // L: 1737
			class19.urlRequester.close(); // L: 1738
			class19.urlRequester = null; // L: 1739
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1743

			for (int var4 = 0; var4 < class124.idxCount; ++var4) { // L: 1744
				class21.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1745
			JagexCache.JagexCache_randomDat.close(); // L: 1746
		} catch (Exception var7) { // L: 1748
		}

	} // L: 1750

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1701648283"
	)
	protected final void vmethod1216() {
	} // L: 690

	public final void init() {
		try {
			if (this.checkHost()) { // L: 696
				for (int var1 = 0; var1 <= 20; ++var1) { // L: 697
					String var2 = this.getParameter(Integer.toString(var1)); // L: 698
					if (var2 != null) { // L: 699
						switch(var1) { // L: 700
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 720
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 745
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 746
							}
							break;
						case 4:
							if (clientType == -1) { // L: 713
								clientType = Integer.parseInt(var2); // L: 714
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 735
							break; // L: 736
						case 6:
							int var4 = Integer.parseInt(var2); // L: 752
							Language var9;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 754
								var9 = Language.Language_valuesOrdered[var4]; // L: 758
							} else {
								var9 = null; // L: 755
							}

							class7.clientLanguage = var9; // L: 760
							break; // L: 761
						case 7:
							Fonts.field4063 = class181.method3592(Integer.parseInt(var2)); // L: 740
							break; // L: 741
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 776
							}
							break;
						case 9:
							class253.field3136 = var2; // L: 725
							break; // L: 726
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.oldscape, StudioGame.game3, StudioGame.runescape, StudioGame.game5, StudioGame.game4, StudioGame.stellardawn}; // L: 767
							NetSocket.field1492 = (StudioGame)UserComparator4.findEnumerated(var3, Integer.parseInt(var2)); // L: 769
							if (NetSocket.field1492 == StudioGame.oldscape) { // L: 770
								ModeWhere.loginType = LoginType.oldscape;
							} else {
								ModeWhere.loginType = LoginType.field4101; // L: 771
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 730
							break; // L: 731
						case 14:
							class44.field310 = Integer.parseInt(var2); // L: 782
							break;
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 703
							break; // L: 704
						case 17:
							Canvas.field291 = var2; // L: 708
						}
					}
				}

				class13.method214(); // L: 788
				class26.worldHost = this.getCodeBase().getHost(); // L: 789
				String var5 = Fonts.field4063.name; // L: 790
				byte var6 = 0; // L: 791

				try {
					UserComparator5.findAndLoadCache("oldschool", var5, var6, 21); // L: 793
				} catch (Exception var7) { // L: 795
					class27.RunException_sendStackTrace((String)null, var7); // L: 796
				}

				class303.client = this; // L: 798
				RunException.clientType = clientType; // L: 799
				if (field621 == -1) { // L: 800
					field621 = 0; // L: 801
				}

				this.startThread(765, 503, 196); // L: 803
			}
		} catch (RuntimeException var8) {
			throw class20.newRunException(var8, "client.init(" + ')');
		}
	} // L: 804

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1825
			boolean var1 = HitSplatDefinition.method2896(); // L: 1826
			if (!var1) { // L: 1827
				this.doCycleJs5Connect();
			}

		}
	} // L: 1828

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917770828"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1831
			this.error("js5crc"); // L: 1832
			gameState = 1000; // L: 1833
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1836
				if (gameState <= 5) { // L: 1837
					this.error("js5io"); // L: 1838
					gameState = 1000; // L: 1839
					return; // L: 1840
				}

				field646 = 3000; // L: 1843
				NetCache.NetCache_ioExceptions = 3; // L: 1844
			}

			if (--field646 + 1 <= 0) { // L: 1847
				try {
					if (js5ConnectState == 0) { // L: 1849
						js5SocketTask = GameEngine.taskHandler.newSocketTask(class26.worldHost, BoundaryObject.currentPort); // L: 1850
						++js5ConnectState; // L: 1851
					}

					if (js5ConnectState == 1) { // L: 1853
						if (js5SocketTask.status == 2) { // L: 1854
							this.js5Error(-1); // L: 1855
							return; // L: 1856
						}

						if (js5SocketTask.status == 1) { // L: 1858
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1860
						if (useBufferedSocket) { // L: 1861
							ArchiveDiskAction.js5Socket = Varps.method4585((Socket)js5SocketTask.result, 40000, 5000); // L: 1862
						} else {
							ArchiveDiskAction.js5Socket = new NetSocket((Socket)js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1865
						}

						Buffer var1 = new Buffer(5); // L: 1867
						var1.writeByte(15); // L: 1868
						var1.writeInt(196); // L: 1869
						ArchiveDiskAction.js5Socket.write(var1.array, 0, 5); // L: 1870
						++js5ConnectState; // L: 1871
						class43.field302 = Archive.currentTimeMillis(); // L: 1872
					}

					if (js5ConnectState == 3) { // L: 1874
						if (ArchiveDiskAction.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1875
							int var2 = ArchiveDiskAction.js5Socket.readUnsignedByte(); // L: 1876
							if (var2 != 0) { // L: 1877
								this.js5Error(var2); // L: 1878
								return; // L: 1879
							}

							++js5ConnectState; // L: 1881
						} else if (Archive.currentTimeMillis() - class43.field302 > 30000L) { // L: 1884
							this.js5Error(-2); // L: 1885
							return; // L: 1886
						}
					}

					if (js5ConnectState == 4) { // L: 1890
						FaceNormal.method4081(ArchiveDiskAction.js5Socket, gameState > 20); // L: 1891
						js5SocketTask = null; // L: 1892
						ArchiveDiskAction.js5Socket = null; // L: 1893
						js5ConnectState = 0; // L: 1894
						js5Errors = 0; // L: 1895
					}
				} catch (IOException var3) { // L: 1898
					this.js5Error(-3); // L: 1899
				}

			}
		}
	} // L: 1834 1901

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1439234587"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		js5SocketTask = null; // L: 1904
		ArchiveDiskAction.js5Socket = null; // L: 1905
		js5ConnectState = 0; // L: 1906
		if (BoundaryObject.currentPort == class69.worldPort) { // L: 1907
			BoundaryObject.currentPort = class24.js5Port;
		} else {
			BoundaryObject.currentPort = class69.worldPort; // L: 1908
		}

		++js5Errors; // L: 1909
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1910
			if (gameState <= 5) { // L: 1911
				this.error("js5connect_full"); // L: 1912
				gameState = 1000; // L: 1913
			} else {
				field646 = 3000; // L: 1915
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1917
			this.error("js5connect_outofdate"); // L: 1918
			gameState = 1000; // L: 1919
		} else if (js5Errors >= 4) { // L: 1921
			if (gameState <= 5) { // L: 1922
				this.error("js5connect"); // L: 1923
				gameState = 1000; // L: 1924
			} else {
				field646 = 3000; // L: 1926
			}
		}

	} // L: 1928

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "36948173"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2333
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2334

		try {
			if (loginState == 0) { // L: 2336
				if (class1.secureRandom == null && (secureRandomFuture.isDone() || field649 > 250)) { // L: 2337
					class1.secureRandom = secureRandomFuture.get(); // L: 2338
					secureRandomFuture.shutdown(); // L: 2339
					secureRandomFuture = null; // L: 2340
				}

				if (class1.secureRandom != null) { // L: 2342
					if (var1 != null) { // L: 2343
						((AbstractSocket)var1).close(); // L: 2344
						var1 = null; // L: 2345
					}

					Archive.socketTask = null; // L: 2347
					hadNetworkError = false; // L: 2348
					field649 = 0; // L: 2349
					loginState = 1; // L: 2350
				}
			}

			if (loginState == 1) { // L: 2353
				if (Archive.socketTask == null) { // L: 2354
					Archive.socketTask = GameEngine.taskHandler.newSocketTask(class26.worldHost, BoundaryObject.currentPort); // L: 2355
				}

				if (Archive.socketTask.status == 2) { // L: 2357
					throw new IOException();
				}

				if (Archive.socketTask.status == 1) { // L: 2358
					if (useBufferedSocket) { // L: 2359
						var1 = Varps.method4585((Socket)Archive.socketTask.result, 40000, 5000); // L: 2360
					} else {
						var1 = new NetSocket((Socket)Archive.socketTask.result, GameEngine.taskHandler, 5000); // L: 2363
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2365
					Archive.socketTask = null; // L: 2366
					loginState = 2; // L: 2367
				}
			}

			PacketBufferNode var4;
			if (loginState == 2) { // L: 2370
				packetWriter.clearBuffer(); // L: 2371
				var4 = Clock.method2590(); // L: 2374
				var4.clientPacket = null; // L: 2375
				var4.clientPacketLength = 0; // L: 2376
				var4.packetBuffer = new PacketBuffer(5000); // L: 2377
				var4.packetBuffer.writeByte(LoginPacket.field2803.id); // L: 2381
				packetWriter.addNode(var4); // L: 2382
				packetWriter.flush(); // L: 2383
				var2.offset = 0; // L: 2384
				loginState = 3; // L: 2385
			}

			boolean var13;
			int var14;
			if (loginState == 3) { // L: 2387
				if (WorldMapAreaData.pcmPlayer0 != null) { // L: 2388
					WorldMapAreaData.pcmPlayer0.method794();
				}

				if (class93.pcmPlayer1 != null) { // L: 2389
					class93.pcmPlayer1.method794();
				}

				var13 = true; // L: 2390
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2391 2392
					var13 = false;
				}

				if (var13) { // L: 2394
					var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2395
					if (WorldMapAreaData.pcmPlayer0 != null) { // L: 2396
						WorldMapAreaData.pcmPlayer0.method794();
					}

					if (class93.pcmPlayer1 != null) { // L: 2397
						class93.pcmPlayer1.method794();
					}

					if (var14 != 0) { // L: 2398
						class22.getLoginError(var14); // L: 2399
						return; // L: 2400
					}

					var2.offset = 0; // L: 2402
					loginState = 4; // L: 2403
				}
			}

			int var36;
			if (loginState == 4) { // L: 2406
				if (var2.offset < 8) { // L: 2407
					var36 = ((AbstractSocket)var1).available(); // L: 2408
					if (var36 > 8 - var2.offset) { // L: 2409
						var36 = 8 - var2.offset;
					}

					if (var36 > 0) { // L: 2410
						((AbstractSocket)var1).read(var2.array, var2.offset, var36); // L: 2411
						var2.offset += var36; // L: 2412
					}
				}

				if (var2.offset == 8) { // L: 2415
					var2.offset = 0; // L: 2416
					FileSystem.field1486 = var2.readLong(); // L: 2417
					loginState = 5; // L: 2418
				}
			}

			int var7;
			int var9;
			int var15;
			if (loginState == 5) { // L: 2421
				packetWriter.packetBuffer.offset = 0; // L: 2422
				packetWriter.clearBuffer(); // L: 2423
				PacketBuffer var3 = new PacketBuffer(500); // L: 2424
				int[] var27 = new int[]{class1.secureRandom.nextInt(), class1.secureRandom.nextInt(), class1.secureRandom.nextInt(), class1.secureRandom.nextInt()}; // L: 2425 2426 2427 2428 2429
				var3.offset = 0; // L: 2430
				var3.writeByte(1); // L: 2431
				var3.writeInt(var27[0]); // L: 2432
				var3.writeInt(var27[1]); // L: 2433
				var3.writeInt(var27[2]); // L: 2434
				var3.writeInt(var27[3]); // L: 2435
				var3.writeLong(FileSystem.field1486); // L: 2436
				if (gameState == 40) { // L: 2437
					var3.writeInt(SoundSystem.field432[0]); // L: 2438
					var3.writeInt(SoundSystem.field432[1]); // L: 2439
					var3.writeInt(SoundSystem.field432[2]); // L: 2440
					var3.writeInt(SoundSystem.field432[3]); // L: 2441
				} else {
					var3.writeByte(field652.rsOrdinal()); // L: 2444
					switch(field652.field1453) { // L: 2445
					case 0:
						LinkedHashMap var6 = class12.clientPreferences.parameters; // L: 2449
						String var8 = Login.Login_username; // L: 2451
						var9 = var8.length(); // L: 2453
						int var10 = 0; // L: 2454

						for (int var11 = 0; var11 < var9; ++var11) { // L: 2455
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var3.writeInt((Integer)var6.get(var10)); // L: 2458
						break; // L: 2459
					case 1:
					case 2:
						var3.writeMedium(PendingSpawn.field1204); // L: 2464
						++var3.offset; // L: 2465
						break; // L: 2466
					case 3:
						var3.offset += 4; // L: 2470
					}

					var3.writeByte(class386.field4213.rsOrdinal()); // L: 2474
					var3.writeStringCp1252NullTerminated(Login.Login_password); // L: 2475
				}

				var3.encryptRsa(class82.field986, class82.field987); // L: 2477
				SoundSystem.field432 = var27; // L: 2478
				PacketBufferNode var33 = Clock.method2590(); // L: 2481
				var33.clientPacket = null; // L: 2482
				var33.clientPacketLength = 0; // L: 2483
				var33.packetBuffer = new PacketBuffer(5000); // L: 2484
				var33.packetBuffer.offset = 0; // L: 2488
				if (gameState == 40) { // L: 2489
					var33.packetBuffer.writeByte(LoginPacket.field2799.id); // L: 2490
				} else {
					var33.packetBuffer.writeByte(LoginPacket.field2798.id); // L: 2493
				}

				var33.packetBuffer.writeShort(0); // L: 2495
				var7 = var33.packetBuffer.offset; // L: 2496
				var33.packetBuffer.writeInt(196); // L: 2497
				var33.packetBuffer.writeInt(1); // L: 2498
				var33.packetBuffer.writeByte(clientType); // L: 2499
				var33.packetBuffer.writeByte(field621); // L: 2500
				var33.packetBuffer.writeBytes(var3.array, 0, var3.offset); // L: 2501
				var15 = var33.packetBuffer.offset; // L: 2502
				var33.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2503
				var33.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2504
				var33.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2505
				var33.packetBuffer.writeShort(HealthBarDefinition.canvasHeight); // L: 2506
				PacketBuffer var16 = var33.packetBuffer; // L: 2507
				if (randomDatData != null) { // L: 2509
					var16.writeBytes(randomDatData, 0, randomDatData.length); // L: 2510
				} else {
					byte[] var17 = DynamicObject.method2030(); // L: 2513
					var16.writeBytes(var17, 0, var17.length); // L: 2514
				}

				var33.packetBuffer.writeStringCp1252NullTerminated(class253.field3136); // L: 2516
				var33.packetBuffer.writeInt(class44.field310); // L: 2517
				Buffer var38 = new Buffer(GameObject.platformInfo.size()); // L: 2518
				GameObject.platformInfo.write(var38); // L: 2519
				var33.packetBuffer.writeBytes(var38.array, 0, var38.array.length); // L: 2520
				var33.packetBuffer.writeByte(clientType); // L: 2521
				var33.packetBuffer.writeInt(0); // L: 2522
				var33.packetBuffer.writeInt(class29.archive6.hash); // L: 2523
				var33.packetBuffer.method6445(0); // L: 2524
				var33.packetBuffer.method6445(Actor.archive17.hash); // L: 2525
				var33.packetBuffer.writeIntME(class0.archive1.hash); // L: 2526
				var33.packetBuffer.method6445(EnumComposition.archive3.hash); // L: 2527
				var33.packetBuffer.writeIntME(class9.archive20.hash); // L: 2528
				var33.packetBuffer.writeInt(class232.archive19.hash); // L: 2529
				var33.packetBuffer.method6493(MilliClock.archive0.hash); // L: 2530
				var33.packetBuffer.writeInt(class16.archive15.hash); // L: 2531
				var33.packetBuffer.writeInt(PendingSpawn.archive10.hash); // L: 2532
				var33.packetBuffer.writeInt(KitDefinition.archive2.hash); // L: 2533
				var33.packetBuffer.method6493(KeyHandler.archive11.hash); // L: 2534
				var33.packetBuffer.writeIntME(class14.archive4.hash); // L: 2535
				var33.packetBuffer.writeInt(class18.archive13.hash); // L: 2536
				var33.packetBuffer.writeIntME(Huffman.archive14.hash); // L: 2537
				var33.packetBuffer.method6445(GameBuild.archive9.hash); // L: 2538
				var33.packetBuffer.method6493(class22.archive12.hash); // L: 2539
				var33.packetBuffer.writeIntME(WorldMapAreaData.archive18.hash); // L: 2540
				var33.packetBuffer.method6493(WorldMapSection0.archive5.hash); // L: 2541
				var33.packetBuffer.writeInt(class260.archive7.hash); // L: 2542
				var33.packetBuffer.writeInt(class43.archive8.hash); // L: 2543
				var33.packetBuffer.xteaEncrypt(var27, var15, var33.packetBuffer.offset); // L: 2544
				var33.packetBuffer.writeLengthShort(var33.packetBuffer.offset - var7); // L: 2545
				packetWriter.addNode(var33); // L: 2546
				packetWriter.flush(); // L: 2547
				packetWriter.isaacCipher = new IsaacCipher(var27); // L: 2548
				int[] var18 = new int[4]; // L: 2549

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2550
					var18[var12] = var27[var12] + 50;
				}

				var2.newIsaacCipher(var18); // L: 2551
				loginState = 6; // L: 2552
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2554 2555
				var36 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2556
				if (var36 == 21 && gameState == 20) { // L: 2557
					loginState = 12; // L: 2558
				} else if (var36 == 2) { // L: 2560
					loginState = 14; // L: 2561
				} else if (var36 == 15 && gameState == 40) { // L: 2563
					packetWriter.serverPacketLength = -1; // L: 2564
					loginState = 19; // L: 2565
				} else if (var36 == 64) { // L: 2567
					loginState = 10; // L: 2568
				} else if (var36 == 23 && field749 < 1) { // L: 2570
					++field749; // L: 2571
					loginState = 0; // L: 2572
				} else if (var36 == 29) { // L: 2574
					loginState = 17; // L: 2575
				} else {
					if (var36 != 69) { // L: 2577
						class22.getLoginError(var36); // L: 2581
						return; // L: 2582
					}

					loginState = 7; // L: 2578
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2586 2587
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2588
				var2.offset = 0; // L: 2589
				Clock.field1522 = var2.readUnsignedShort(); // L: 2590
				loginState = 8; // L: 2591
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= Clock.field1522) { // L: 2594 2595
				var2.offset = 0; // L: 2596
				((AbstractSocket)var1).read(var2.array, var2.offset, Clock.field1522); // L: 2597
				class34[] var25 = new class34[]{class34.field243}; // L: 2600
				class34 var28 = var25[var2.readUnsignedByte()]; // L: 2602

				try {
					class31 var5 = MenuAction.method1944(var28); // L: 2604
					this.field656 = new class35(var2, var5); // L: 2605
					loginState = 9; // L: 2606
				} catch (Exception var23) { // L: 2608
					class22.getLoginError(22); // L: 2609
					return; // L: 2610
				}
			}

			if (loginState == 9 && this.field656.method409()) { // L: 2614 2615
				this.field655 = this.field656.method408(); // L: 2616
				this.field656.method397(); // L: 2617
				this.field656 = null; // L: 2618
				if (this.field655 == null) { // L: 2619
					class22.getLoginError(22); // L: 2620
					return; // L: 2621
				}

				packetWriter.clearBuffer(); // L: 2623
				var4 = Clock.method2590(); // L: 2626
				var4.clientPacket = null; // L: 2627
				var4.clientPacketLength = 0; // L: 2628
				var4.packetBuffer = new PacketBuffer(5000); // L: 2629
				var4.packetBuffer.writeByte(LoginPacket.field2800.id); // L: 2633
				var4.packetBuffer.writeShort(this.field655.offset); // L: 2634
				var4.packetBuffer.method6441(this.field655); // L: 2635
				packetWriter.addNode(var4); // L: 2636
				packetWriter.flush(); // L: 2637
				this.field655 = null; // L: 2638
				loginState = 6; // L: 2639
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2642 2643
				class225.field2676 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2644
				loginState = 11; // L: 2645
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class225.field2676) { // L: 2648 2649
				((AbstractSocket)var1).read(var2.array, 0, class225.field2676); // L: 2650
				var2.offset = 0; // L: 2651
				loginState = 6; // L: 2652
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2655 2656
				field673 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2657
				loginState = 13; // L: 2658
			}

			if (loginState == 13) { // L: 2661
				field649 = 0; // L: 2662
				class44.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field673 / 60 + " seconds."); // L: 2663
				if (--field673 <= 0) { // L: 2664
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2667 2668
					UserComparator9.field1426 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2669
					loginState = 15; // L: 2670
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= UserComparator9.field1426) { // L: 2673 2674
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2675
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2676
					var2.offset = 0; // L: 2677
					boolean var37 = false; // L: 2678
					if (var13) { // L: 2679
						var14 = var2.readByteIsaac() << 24; // L: 2680
						var14 |= var2.readByteIsaac() << 16; // L: 2681
						var14 |= var2.readByteIsaac() << 8; // L: 2682
						var14 |= var2.readByteIsaac(); // L: 2683
						String var34 = Login.Login_username; // L: 2685
						var7 = var34.length(); // L: 2687
						var15 = 0; // L: 2688
						var9 = 0; // L: 2689

						while (true) {
							if (var9 >= var7) {
								if (class12.clientPreferences.parameters.size() >= 10 && !class12.clientPreferences.parameters.containsKey(var15)) { // L: 2693 2694
									Iterator var35 = class12.clientPreferences.parameters.entrySet().iterator(); // L: 2695
									var35.next(); // L: 2696
									var35.remove(); // L: 2697
								}

								class12.clientPreferences.parameters.put(var15, var14); // L: 2700
								break;
							}

							var15 = (var15 << 5) - var15 + var34.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2702
						class12.clientPreferences.rememberedUsername = Login.Login_username; // L: 2703
					} else {
						class12.clientPreferences.rememberedUsername = null; // L: 2706
					}

					KeyHandler.savePreferences(); // L: 2708
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2709
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2710
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2711
					localPlayerIndex <<= 8; // L: 2712
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2713
					field734 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2714
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2715
					var2.offset = 0; // L: 2716
					ServerPacket[] var29 = ModeWhere.ServerPacket_values(); // L: 2717
					int var20 = var2.readSmartByteShortIsaac(); // L: 2718
					if (var20 < 0 || var20 >= var29.length) { // L: 2719
						throw new IOException(var20 + " " + var2.offset);
					}

					packetWriter.serverPacket = var29[var20]; // L: 2720
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2721
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2722
					var2.offset = 0; // L: 2723
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2724

					try {
						Client var21 = class303.client; // L: 2726
						JSObject.getWindow(var21).call("zap", (Object[])null); // L: 2729
					} catch (Throwable var22) { // L: 2732
					}

					loginState = 16; // L: 2733
				}

				if (loginState == 16) { // L: 2736
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2737
						var2.offset = 0; // L: 2738
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2739
						timer.method5466(); // L: 2740
						class25.method321(); // L: 2741
						KeyHandler.updatePlayer(var2); // L: 2742
						MusicPatchNode2.field2827 = -1; // L: 2743
						ClientPreferences.loadRegions(false, var2); // L: 2744
						packetWriter.serverPacket = null; // L: 2745
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2749 2750
						var2.offset = 0; // L: 2751
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2752
						var2.offset = 0; // L: 2753
						class15.field133 = var2.readUnsignedShort(); // L: 2754
						loginState = 18; // L: 2755
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class15.field133) { // L: 2758 2759
						var2.offset = 0; // L: 2760
						((AbstractSocket)var1).read(var2.array, 0, class15.field133); // L: 2761
						var2.offset = 0; // L: 2762
						String var26 = var2.readStringCp1252NullTerminated(); // L: 2763
						String var30 = var2.readStringCp1252NullTerminated(); // L: 2764
						String var31 = var2.readStringCp1252NullTerminated(); // L: 2765
						class44.setLoginResponseString(var26, var30, var31); // L: 2766
						updateGameState(10); // L: 2767
					}

					if (loginState != 19) { // L: 2770
						++field649; // L: 2822
						if (field649 > 2000) { // L: 2823
							if (field749 < 1) { // L: 2824
								if (BoundaryObject.currentPort == class69.worldPort) { // L: 2825
									BoundaryObject.currentPort = class24.js5Port;
								} else {
									BoundaryObject.currentPort = class69.worldPort; // L: 2826
								}

								++field749; // L: 2827
								loginState = 0; // L: 2828
							} else {
								class22.getLoginError(-3); // L: 2831
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2771
							if (((AbstractSocket)var1).available() < 2) { // L: 2772
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2773
							var2.offset = 0; // L: 2774
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2775
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2777
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2778
							var2.offset = 0; // L: 2779
							var36 = packetWriter.serverPacketLength; // L: 2780
							timer.method5477(); // L: 2781
							packetWriter.clearBuffer(); // L: 2783
							packetWriter.packetBuffer.offset = 0; // L: 2784
							packetWriter.serverPacket = null; // L: 2785
							packetWriter.field1386 = null; // L: 2786
							packetWriter.field1387 = null; // L: 2787
							packetWriter.field1391 = null; // L: 2788
							packetWriter.serverPacketLength = 0; // L: 2789
							packetWriter.field1384 = 0; // L: 2790
							rebootTimer = 0; // L: 2791
							Occluder.method4090(); // L: 2792
							minimapState = 0; // L: 2793
							destinationX = 0; // L: 2794

							for (var14 = 0; var14 < 2048; ++var14) { // L: 2795
								players[var14] = null;
							}

							class35.localPlayer = null; // L: 2796

							for (var14 = 0; var14 < npcs.length; ++var14) { // L: 2797
								NPC var32 = npcs[var14]; // L: 2798
								if (var32 != null) { // L: 2799
									var32.targetIndex = -1; // L: 2800
									var32.false0 = false; // L: 2801
								}
							}

							class285.method5055(); // L: 2804
							updateGameState(30); // L: 2805

							for (var14 = 0; var14 < 100; ++var14) { // L: 2806
								field825[var14] = true;
							}

							var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2655, packetWriter.isaacCipher); // L: 2809
							var4.packetBuffer.writeByte(HitSplatDefinition.getWindowedMode()); // L: 2810
							var4.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2811
							var4.packetBuffer.writeShort(HealthBarDefinition.canvasHeight); // L: 2812
							packetWriter.addNode(var4); // L: 2813
							KeyHandler.updatePlayer(var2); // L: 2816
							if (var36 != var2.offset) { // L: 2817
								throw new RuntimeException(); // L: 2818
							}
						}
					}
				}
			}
		} catch (IOException var24) { // L: 2835
			if (field749 < 1) { // L: 2836
				if (BoundaryObject.currentPort == class69.worldPort) { // L: 2837
					BoundaryObject.currentPort = class24.js5Port;
				} else {
					BoundaryObject.currentPort = class69.worldPort; // L: 2838
				}

				++field749; // L: 2839
				loginState = 0; // L: 2840
			} else {
				class22.getLoginError(-2); // L: 2843
			}
		}
	} // L: 2665 2747 2820 2829 2832 2841 2844 2846

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-784204391"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3128
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3129
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3130
			hadNetworkError = false; // L: 3131
			BuddyRankComparator.method2492(); // L: 3132
		} else {
			if (!isMenuOpen) { // L: 3135
				WorldMapEvent.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1230(packetWriter); ++var1) { // L: 3136 3137
			}

			if (gameState == 30) { // L: 3139
				int var2;
				PacketBufferNode var15;
				while (StructComposition.method2846()) { // L: 3140
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2666, packetWriter.isaacCipher); // L: 3141
					var15.packetBuffer.writeByte(0); // L: 3142
					var2 = var15.packetBuffer.offset; // L: 3143
					class2.performReflectionCheck(var15.packetBuffer); // L: 3144
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2); // L: 3145
					packetWriter.addNode(var15); // L: 3146
				}

				if (timer.field3791) { // L: 3148
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2638, packetWriter.isaacCipher); // L: 3150
					var15.packetBuffer.writeByte(0); // L: 3151
					var2 = var15.packetBuffer.offset; // L: 3152
					timer.write(var15.packetBuffer); // L: 3153
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2); // L: 3154
					packetWriter.addNode(var15); // L: 3155
					timer.method5467(); // L: 3156
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
				synchronized(class69.mouseRecorder.lock) { // L: 3159
					if (!field767) { // L: 3160
						class69.mouseRecorder.index = 0; // L: 3246
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class69.mouseRecorder.index >= 40) { // L: 3161
						PacketBufferNode var16 = null; // L: 3163
						var3 = 0; // L: 3164
						var4 = 0; // L: 3165
						var5 = 0; // L: 3166
						var6 = 0; // L: 3167

						for (var7 = 0; var7 < class69.mouseRecorder.index && (var16 == null || var16.packetBuffer.offset - var3 < 246); ++var7) { // L: 3168 3169
							var4 = var7; // L: 3170
							var8 = class69.mouseRecorder.ys[var7]; // L: 3171
							if (var8 < -1) { // L: 3172
								var8 = -1;
							} else if (var8 > 65534) { // L: 3173
								var8 = 65534;
							}

							var9 = class69.mouseRecorder.xs[var7]; // L: 3174
							if (var9 < -1) { // L: 3175
								var9 = -1;
							} else if (var9 > 65534) { // L: 3176
								var9 = 65534;
							}

							if (var9 != field627 || var8 != field837) { // L: 3177
								if (var16 == null) { // L: 3180
									var16 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2646, packetWriter.isaacCipher); // L: 3181
									var16.packetBuffer.writeByte(0); // L: 3182
									var3 = var16.packetBuffer.offset; // L: 3183
									PacketBuffer var10000 = var16.packetBuffer; // L: 3184
									var10000.offset += 2;
									var5 = 0; // L: 3185
									var6 = 0; // L: 3186
								}

								if (-1L != field629) { // L: 3191
									var10 = var9 - field627; // L: 3192
									var11 = var8 - field837; // L: 3193
									var12 = (int)((class69.mouseRecorder.millis[var7] - field629) / 20L); // L: 3194
									var5 = (int)((long)var5 + (class69.mouseRecorder.millis[var7] - field629) % 20L); // L: 3195
								} else {
									var10 = var9; // L: 3198
									var11 = var8; // L: 3199
									var12 = Integer.MAX_VALUE; // L: 3200
								}

								field627 = var9; // L: 3202
								field837 = var8; // L: 3203
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3204
									var10 += 32; // L: 3205
									var11 += 32; // L: 3206
									var16.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3207
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3209
									var10 += 128; // L: 3210
									var11 += 128; // L: 3211
									var16.packetBuffer.writeByte(var12 + 128); // L: 3212
									var16.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3213
								} else if (var12 < 32) { // L: 3215
									var16.packetBuffer.writeByte(var12 + 192); // L: 3216
									if (var9 != -1 && var8 != -1) { // L: 3217
										var16.packetBuffer.writeInt(var9 | var8 << 16); // L: 3218
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var16.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3221
									if (var9 != -1 && var8 != -1) { // L: 3222
										var16.packetBuffer.writeInt(var9 | var8 << 16); // L: 3223
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3225
								field629 = class69.mouseRecorder.millis[var7]; // L: 3226
							}
						}

						if (var16 != null) { // L: 3228
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var3); // L: 3229
							var7 = var16.packetBuffer.offset; // L: 3230
							var16.packetBuffer.offset = var3; // L: 3231
							var16.packetBuffer.writeByte(var5 / var6); // L: 3232
							var16.packetBuffer.writeByte(var5 % var6); // L: 3233
							var16.packetBuffer.offset = var7; // L: 3234
							packetWriter.addNode(var16); // L: 3235
						}

						if (var4 >= class69.mouseRecorder.index) { // L: 3237
							class69.mouseRecorder.index = 0;
						} else {
							MouseRecorder var43 = class69.mouseRecorder; // L: 3239
							var43.index -= var4;
							System.arraycopy(class69.mouseRecorder.xs, var4, class69.mouseRecorder.xs, 0, class69.mouseRecorder.index); // L: 3240
							System.arraycopy(class69.mouseRecorder.ys, var4, class69.mouseRecorder.ys, 0, class69.mouseRecorder.index); // L: 3241
							System.arraycopy(class69.mouseRecorder.millis, var4, class69.mouseRecorder.millis, 0, class69.mouseRecorder.index); // L: 3242
						}
					}
				}

				PacketBufferNode var19;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3248
					long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3249
					if (var17 > 32767L) { // L: 3250
						var17 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3251
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3252
					if (var3 < 0) { // L: 3253
						var3 = 0;
					} else if (var3 > HealthBarDefinition.canvasHeight) { // L: 3254
						var3 = HealthBarDefinition.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3255
					if (var4 < 0) { // L: 3256
						var4 = 0;
					} else if (var4 > GameEngine.canvasWidth) { // L: 3257
						var4 = GameEngine.canvasWidth;
					}

					var5 = (int)var17; // L: 3258
					var19 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2578, packetWriter.isaacCipher); // L: 3259
					var19.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3260
					var19.packetBuffer.writeShort(var4); // L: 3261
					var19.packetBuffer.writeShort(var3); // L: 3262
					packetWriter.addNode(var19); // L: 3263
				}

				if (KeyHandler.field276 > 0) { // L: 3265
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2566, packetWriter.isaacCipher); // L: 3266
					var15.packetBuffer.writeShort(0); // L: 3267
					var2 = var15.packetBuffer.offset; // L: 3268
					long var20 = Archive.currentTimeMillis(); // L: 3269

					for (var5 = 0; var5 < KeyHandler.field276; ++var5) { // L: 3270
						long var22 = var20 - field799; // L: 3271
						if (var22 > 16777215L) { // L: 3272
							var22 = 16777215L;
						}

						field799 = var20; // L: 3273
						var15.packetBuffer.method6475(KeyHandler.field275[var5]); // L: 3274
						var15.packetBuffer.method6491((int)var22); // L: 3275
					}

					var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset - var2); // L: 3277
					packetWriter.addNode(var15); // L: 3278
				}

				if (field700 > 0) { // L: 3280
					--field700;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3281
					field701 = true;
				}

				if (field701 && field700 <= 0) { // L: 3282
					field700 = 20; // L: 3283
					field701 = false; // L: 3284
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2623, packetWriter.isaacCipher); // L: 3286
					var15.packetBuffer.method6483(camAngleX); // L: 3287
					var15.packetBuffer.writeShort(camAngleY); // L: 3288
					packetWriter.addNode(var15); // L: 3289
				}

				if (class124.hasFocus && !hadFocus) { // L: 3291
					hadFocus = true; // L: 3292
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2576, packetWriter.isaacCipher); // L: 3294
					var15.packetBuffer.writeByte(1); // L: 3295
					packetWriter.addNode(var15); // L: 3296
				}

				if (!class124.hasFocus && hadFocus) { // L: 3298
					hadFocus = false; // L: 3299
					var15 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2576, packetWriter.isaacCipher); // L: 3301
					var15.packetBuffer.writeByte(0); // L: 3302
					packetWriter.addNode(var15); // L: 3303
				}

				if (NetSocket.worldMap != null) { // L: 3306
					NetSocket.worldMap.method6124();
				}

				if (FloorOverlayDefinition.ClanChat_inClanChat) { // L: 3308
					if (class25.clanChat != null) { // L: 3309
						class25.clanChat.sort(); // L: 3310
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3313
						Player var38 = players[Players.Players_indices[var1]]; // L: 3314
						var38.clearIsInClanChat(); // L: 3315
					}

					FloorOverlayDefinition.ClanChat_inClanChat = false; // L: 3318
				}

				Buffer.method6602(); // L: 3321
				if (field848 != ParamComposition.Client_plane) { // L: 3323
					field848 = ParamComposition.Client_plane; // L: 3324
					KeyHandler.createMinimapSprite(ParamComposition.Client_plane); // L: 3325
				}

				if (gameState == 30) { // L: 3328
					for (PendingSpawn var36 = (PendingSpawn)pendingSpawns.last(); var36 != null; var36 = (PendingSpawn)pendingSpawns.previous()) { // L: 3330 3331 3374
						if (var36.hitpoints > 0) { // L: 3332
							--var36.hitpoints;
						}

						ObjectComposition var24;
						boolean var32;
						if (var36.hitpoints == 0) { // L: 3333
							if (var36.objectId >= 0) { // L: 3335
								var3 = var36.objectId; // L: 3337
								var4 = var36.field1203; // L: 3338
								var24 = AttackOption.getObjectDefinition(var3); // L: 3340
								if (var4 == 11) { // L: 3341
									var4 = 10;
								}

								if (var4 >= 5 && var4 <= 8) { // L: 3342
									var4 = 4;
								}

								var32 = var24.method2916(var4); // L: 3343
								if (!var32) { // L: 3345
									continue;
								}
							}

							Message.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.objectId, var36.field1199, var36.field1203); // L: 3347
							var36.remove(); // L: 3348
						} else {
							if (var36.delay > 0) { // L: 3352
								--var36.delay;
							}

							if (var36.delay == 0 && var36.x >= 1 && var36.y >= 1 && var36.x <= 102 && var36.y <= 102) { // L: 3353
								if (var36.id >= 0) { // L: 3355
									var3 = var36.id; // L: 3357
									var4 = var36.field1196; // L: 3358
									var24 = AttackOption.getObjectDefinition(var3); // L: 3360
									if (var4 == 11) { // L: 3361
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) { // L: 3362
										var4 = 4;
									}

									var32 = var24.method2916(var4); // L: 3363
									if (!var32) { // L: 3365
										continue;
									}
								}

								Message.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.id, var36.orientation, var36.field1196); // L: 3367
								var36.delay = -1; // L: 3368
								if (var36.id == var36.objectId && var36.objectId == -1) { // L: 3369
									var36.remove();
								} else if (var36.id == var36.objectId && var36.orientation == var36.field1199 && var36.field1196 == var36.field1203) { // L: 3370
									var36.remove();
								}
							}
						}
					}

					class15.method228(); // L: 3377
					++packetWriter.field1384; // L: 3378
					if (packetWriter.field1384 > 750) { // L: 3379
						BuddyRankComparator.method2492(); // L: 3380
					} else {
						ItemComposition.method3006(); // L: 3383
						MouseHandler.method686(); // L: 3384
						HorizontalAlignment.method2733(); // L: 3385
						++field768; // L: 3386
						if (mouseCrossColor != 0) { // L: 3387
							mouseCrossState += 20; // L: 3388
							if (mouseCrossState >= 400) { // L: 3389
								mouseCrossColor = 0;
							}
						}

						if (Projectile.field1039 != null) { // L: 3391
							++field817; // L: 3392
							if (field817 >= 15) { // L: 3393
								VerticalAlignment.invalidateWidget(Projectile.field1039); // L: 3394
								Projectile.field1039 = null; // L: 3395
							}
						}

						Widget var37 = SpriteMask.mousedOverWidgetIf1; // L: 3398
						Widget var39 = class34.field241; // L: 3399
						SpriteMask.mousedOverWidgetIf1 = null; // L: 3400
						class34.field241 = null; // L: 3401
						draggedOnWidget = null; // L: 3402
						field797 = false; // L: 3403
						field794 = false; // L: 3404
						field842 = 0; // L: 3405

						while (class17.isKeyDown() && field842 < 128) { // L: 3406
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && MenuAction.field982 == 66) { // L: 3407
								String var25 = Login.method1986(); // L: 3408
								class303.client.clipboardSetString(var25); // L: 3409
							} else if (oculusOrbState != 1 || class25.field207 <= 0) { // L: 3412
								field844[field842] = MenuAction.field982; // L: 3415
								field746[field842] = class25.field207; // L: 3416
								++field842; // L: 3417
							}
						}

						boolean var33 = staffModLevel >= 2; // L: 3421
						if (var33 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3423
							var4 = class35.localPlayer.plane - mouseWheelRotation; // L: 3424
							if (var4 < 0) { // L: 3425
								var4 = 0;
							} else if (var4 > 3) { // L: 3426
								var4 = 3;
							}

							if (var4 != class35.localPlayer.plane) { // L: 3427
								ClientPreferences.method2239(class35.localPlayer.pathX[0] + JagexCache.baseX, class35.localPlayer.pathY[0] + Messages.baseY, var4, false); // L: 3428
							}

							mouseWheelRotation = 0; // L: 3430
						}

						if (rootInterface != -1) { // L: 3432
							Clock.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, HealthBarDefinition.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3433

						while (true) {
							ScriptEvent var26;
							Widget var40;
							Widget var41;
							do {
								var26 = (ScriptEvent)field865.removeLast(); // L: 3435
								if (var26 == null) { // L: 3436
									while (true) {
										do {
											var26 = (ScriptEvent)field821.removeLast(); // L: 3447
											if (var26 == null) { // L: 3448
												while (true) {
													do {
														var26 = (ScriptEvent)scriptEvents.removeLast(); // L: 3459
														if (var26 == null) { // L: 3460
															this.menu(); // L: 3470
															if (NetSocket.worldMap != null) { // L: 3472
																NetSocket.worldMap.method5961(ParamComposition.Client_plane, (class35.localPlayer.x >> 7) + JagexCache.baseX, (class35.localPlayer.y >> 7) + Messages.baseY, false); // L: 3473
																NetSocket.worldMap.loadCache(); // L: 3474
															}

															if (clickedWidget != null) { // L: 3477
																this.method1236();
															}

															if (class34.dragInventoryWidget != null) { // L: 3478
																VerticalAlignment.invalidateWidget(class34.dragInventoryWidget); // L: 3479
																++itemDragDuration; // L: 3480
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3481
																	if (field728) { // L: 3482
																		if (NPCComposition.hoveredItemContainer == class34.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) { // L: 3483
																			Widget var42 = class34.dragInventoryWidget; // L: 3484
																			byte var34 = 0; // L: 3485
																			if (field781 == 1 && var42.contentType == 206) { // L: 3486
																				var34 = 1;
																			}

																			if (var42.itemIds[dragItemSlotDestination] <= 0) { // L: 3487
																				var34 = 0;
																			}

																			var7 = class26.getWidgetFlags(var42); // L: 3489
																			boolean var35 = (var7 >> 29 & 1) != 0; // L: 3491
																			if (var35) { // L: 3493
																				var8 = dragItemSlotSource; // L: 3494
																				var9 = dragItemSlotDestination; // L: 3495
																				var42.itemIds[var9] = var42.itemIds[var8]; // L: 3496
																				var42.itemQuantities[var9] = var42.itemQuantities[var8]; // L: 3497
																				var42.itemIds[var8] = -1; // L: 3498
																				var42.itemQuantities[var8] = 0; // L: 3499
																			} else if (var34 == 1) { // L: 3501
																				var8 = dragItemSlotSource; // L: 3502
																				var9 = dragItemSlotDestination; // L: 3503

																				while (var8 != var9) { // L: 3504
																					if (var8 > var9) { // L: 3505
																						var42.swapItems(var8 - 1, var8); // L: 3506
																						--var8; // L: 3507
																					} else if (var8 < var9) { // L: 3509
																						var42.swapItems(var8 + 1, var8); // L: 3510
																						++var8; // L: 3511
																					}
																				}
																			} else {
																				var42.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3516
																			}

																			PacketBufferNode var27 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2628, packetWriter.isaacCipher); // L: 3519
																			var27.packetBuffer.method6445(class34.dragInventoryWidget.id); // L: 3520
																			var27.packetBuffer.method6475(var34); // L: 3521
																			var27.packetBuffer.method6484(dragItemSlotSource); // L: 3522
																			var27.packetBuffer.writeShort(dragItemSlotDestination); // L: 3523
																			packetWriter.addNode(var27); // L: 3524
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3528
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3529
																	} else if (menuOptionsCount > 0) { // L: 3531
																		ItemLayer.method3715(draggedWidgetX, draggedWidgetY); // L: 3532
																	}

																	field817 = 10; // L: 3535
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3536
																	class34.dragInventoryWidget = null; // L: 3537
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3540 3541
																	field728 = true; // L: 3542
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3547
																var4 = Scene.Scene_selectedX; // L: 3548
																var5 = Scene.Scene_selectedY; // L: 3549
																var19 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2611, packetWriter.isaacCipher); // L: 3551
																var19.packetBuffer.writeByte(5); // L: 3552
																var19.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3553
																var19.packetBuffer.writeShort(var5 + Messages.baseY); // L: 3554
																var19.packetBuffer.writeShort(var4 + JagexCache.baseX); // L: 3555
																packetWriter.addNode(var19); // L: 3556
																Scene.method3941(); // L: 3557
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3558
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3559
																mouseCrossColor = 1; // L: 3560
																mouseCrossState = 0; // L: 3561
																destinationX = var4; // L: 3562
																destinationY = var5; // L: 3563
															}

															if (var37 != SpriteMask.mousedOverWidgetIf1) { // L: 3565
																if (var37 != null) { // L: 3566
																	VerticalAlignment.invalidateWidget(var37);
																}

																if (SpriteMask.mousedOverWidgetIf1 != null) { // L: 3567
																	VerticalAlignment.invalidateWidget(SpriteMask.mousedOverWidgetIf1);
																}
															}

															if (var39 != class34.field241 && field741 == field811) { // L: 3569
																if (var39 != null) { // L: 3570
																	VerticalAlignment.invalidateWidget(var39);
																}

																if (class34.field241 != null) { // L: 3571
																	VerticalAlignment.invalidateWidget(class34.field241);
																}
															}

															if (class34.field241 != null) { // L: 3573
																if (field741 < field811) { // L: 3574
																	++field741; // L: 3575
																	if (field741 == field811) { // L: 3576
																		VerticalAlignment.invalidateWidget(class34.field241);
																	}
																}
															} else if (field741 > 0) { // L: 3579
																--field741;
															}

															WorldMapManager.method3439(); // L: 3580
															if (isCameraLocked) { // L: 3581
																var4 = field696 * 128 + 64; // L: 3582
																var5 = class18.field157 * 128 + 64; // L: 3583
																var6 = SceneTilePaint.getTileHeight(var4, var5, ParamComposition.Client_plane) - class0.field5; // L: 3584
																if (class20.cameraX < var4) { // L: 3585
																	class20.cameraX = (var4 - class20.cameraX) * SoundSystem.field436 / 1000 + class20.cameraX + UserComparator4.field1403; // L: 3586
																	if (class20.cameraX > var4) { // L: 3587
																		class20.cameraX = var4;
																	}
																}

																if (class20.cameraX > var4) { // L: 3589
																	class20.cameraX -= SoundSystem.field436 * (class20.cameraX - var4) / 1000 + UserComparator4.field1403; // L: 3590
																	if (class20.cameraX < var4) { // L: 3591
																		class20.cameraX = var4;
																	}
																}

																if (Skeleton.cameraY < var6) { // L: 3593
																	Skeleton.cameraY = (var6 - Skeleton.cameraY) * SoundSystem.field436 / 1000 + Skeleton.cameraY + UserComparator4.field1403; // L: 3594
																	if (Skeleton.cameraY > var6) { // L: 3595
																		Skeleton.cameraY = var6;
																	}
																}

																if (Skeleton.cameraY > var6) { // L: 3597
																	Skeleton.cameraY -= SoundSystem.field436 * (Skeleton.cameraY - var6) / 1000 + UserComparator4.field1403; // L: 3598
																	if (Skeleton.cameraY < var6) { // L: 3599
																		Skeleton.cameraY = var6;
																	}
																}

																if (WorldMapDecoration.cameraZ < var5) { // L: 3601
																	WorldMapDecoration.cameraZ = (var5 - WorldMapDecoration.cameraZ) * SoundSystem.field436 / 1000 + WorldMapDecoration.cameraZ + UserComparator4.field1403; // L: 3602
																	if (WorldMapDecoration.cameraZ > var5) { // L: 3603
																		WorldMapDecoration.cameraZ = var5;
																	}
																}

																if (WorldMapDecoration.cameraZ > var5) { // L: 3605
																	WorldMapDecoration.cameraZ -= SoundSystem.field436 * (WorldMapDecoration.cameraZ - var5) / 1000 + UserComparator4.field1403; // L: 3606
																	if (WorldMapDecoration.cameraZ < var5) { // L: 3607
																		WorldMapDecoration.cameraZ = var5;
																	}
																}

																var4 = Language.field3704 * 128 + 64; // L: 3609
																var5 = Interpreter.field947 * 128 + 64; // L: 3610
																var6 = SceneTilePaint.getTileHeight(var4, var5, ParamComposition.Client_plane) - KitDefinition.field1592; // L: 3611
																var7 = var4 - class20.cameraX; // L: 3612
																var8 = var6 - Skeleton.cameraY; // L: 3613
																var9 = var5 - WorldMapDecoration.cameraZ; // L: 3614
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 3615
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047; // L: 3616
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047; // L: 3617
																if (var11 < 128) { // L: 3618
																	var11 = 128;
																}

																if (var11 > 383) { // L: 3619
																	var11 = 383;
																}

																if (class1.cameraPitch < var11) { // L: 3620
																	class1.cameraPitch = (var11 - class1.cameraPitch) * ReflectionCheck.field580 / 1000 + class1.cameraPitch + class2.field18; // L: 3621
																	if (class1.cameraPitch > var11) { // L: 3622
																		class1.cameraPitch = var11;
																	}
																}

																if (class1.cameraPitch > var11) { // L: 3624
																	class1.cameraPitch -= ReflectionCheck.field580 * (class1.cameraPitch - var11) / 1000 + class2.field18; // L: 3625
																	if (class1.cameraPitch < var11) { // L: 3626
																		class1.cameraPitch = var11;
																	}
																}

																int var28 = var12 - HealthBarDefinition.cameraYaw; // L: 3628
																if (var28 > 1024) { // L: 3629
																	var28 -= 2048;
																}

																if (var28 < -1024) { // L: 3630
																	var28 += 2048;
																}

																if (var28 > 0) { // L: 3631
																	HealthBarDefinition.cameraYaw = HealthBarDefinition.cameraYaw + class2.field18 + var28 * ReflectionCheck.field580 / 1000; // L: 3632
																	HealthBarDefinition.cameraYaw &= 2047; // L: 3633
																}

																if (var28 < 0) { // L: 3635
																	HealthBarDefinition.cameraYaw -= -var28 * ReflectionCheck.field580 / 1000 + class2.field18; // L: 3636
																	HealthBarDefinition.cameraYaw &= 2047; // L: 3637
																}

																int var14 = var12 - HealthBarDefinition.cameraYaw; // L: 3639
																if (var14 > 1024) { // L: 3640
																	var14 -= 2048;
																}

																if (var14 < -1024) { // L: 3641
																	var14 += 2048;
																}

																if (var14 < 0 && var28 > 0 || var14 > 0 && var28 < 0) { // L: 3642
																	HealthBarDefinition.cameraYaw = var12;
																}
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 3644
																int var10002 = field870[var4]++;
															}

															varcs.tryWrite(); // L: 3645
															var4 = class301.method5371(); // L: 3646
															var5 = KeyHandler.KeyHandler_idleCycles; // L: 3649
															PacketBufferNode var29;
															if (var4 > 15000 && var5 > 15000) { // L: 3652
																logoutTimer = 250; // L: 3653
																MouseHandler.MouseHandler_idleCycles = 14500; // L: 3655
																var29 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2657, packetWriter.isaacCipher); // L: 3658
																packetWriter.addNode(var29); // L: 3659
															}

															GrandExchangeOfferUnitPriceComparator.friendSystem.processFriendUpdates(); // L: 3661
															++packetWriter.pendingWrites; // L: 3662
															if (packetWriter.pendingWrites > 50) { // L: 3663
																var29 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2583, packetWriter.isaacCipher); // L: 3665
																packetWriter.addNode(var29); // L: 3666
															}

															try {
																packetWriter.flush(); // L: 3669
															} catch (IOException var30) { // L: 3671
																BuddyRankComparator.method2492(); // L: 3672
															}

															return; // L: 3674
														}

														var41 = var26.widget; // L: 3461
														if (var41.childIndex < 0) { // L: 3462
															break;
														}

														var40 = DevicePcmPlayerProvider.getWidget(var41.parentId); // L: 3463
													} while(var40 == null || var40.children == null || var41.childIndex >= var40.children.length || var41 != var40.children[var41.childIndex]); // L: 3464

													class259.runScriptEvent(var26); // L: 3468
												}
											}

											var41 = var26.widget; // L: 3449
											if (var41.childIndex < 0) { // L: 3450
												break;
											}

											var40 = DevicePcmPlayerProvider.getWidget(var41.parentId); // L: 3451
										} while(var40 == null || var40.children == null || var41.childIndex >= var40.children.length || var41 != var40.children[var41.childIndex]); // L: 3452

										class259.runScriptEvent(var26); // L: 3456
									}
								}

								var41 = var26.widget; // L: 3437
								if (var41.childIndex < 0) { // L: 3438
									break;
								}

								var40 = DevicePcmPlayerProvider.getWidget(var41.parentId); // L: 3439
							} while(var40 == null || var40.children == null || var41.childIndex >= var40.children.length || var41 != var40.children[var41.childIndex]); // L: 3440

							class259.runScriptEvent(var26); // L: 3444
						}
					}
				}
			}
		}
	} // L: 3133 3381

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-252374005"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth; // L: 4366
		int var2 = HealthBarDefinition.canvasHeight; // L: 4367
		if (super.contentWidth < var1) { // L: 4368
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4369
		}

		if (class12.clientPreferences != null) { // L: 4370
			try {
				Client var3 = class303.client; // L: 4372
				Object[] var4 = new Object[]{HitSplatDefinition.getWindowedMode()}; // L: 4373
				JSObject.getWindow(var3).call("resize", var4); // L: 4376
			} catch (Throwable var5) { // L: 4379
			}
		}

	} // L: 4381

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-638945661"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4384
			Messages.method2357(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4385
			if (field825[var1]) { // L: 4386
				field826[var1] = true;
			}

			field636[var1] = field825[var1]; // L: 4387
			field825[var1] = false; // L: 4388
		}

		field824 = cycle; // L: 4390
		viewportX = -1; // L: 4391
		viewportY = -1; // L: 4392
		NPCComposition.hoveredItemContainer = null; // L: 4393
		if (rootInterface != -1) { // L: 4394
			rootWidgetCount = 0; // L: 4395
			ModeWhere.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, HealthBarDefinition.canvasHeight, 0, 0, -1); // L: 4396
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4398
		if (showMouseCross) { // L: 4399
			if (mouseCrossColor == 1) { // L: 4400
				MouseHandler.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4401
			}

			if (mouseCrossColor == 2) { // L: 4403
				MouseHandler.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4404
			}
		}

		if (!isMenuOpen) { // L: 4407
			if (viewportX != -1) { // L: 4408
				class0.method0(viewportX, viewportY);
			}
		} else {
			ScriptFrame.method1161(); // L: 4410
		}

		if (gameDrawingMode == 3) { // L: 4411
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4412
				if (field636[var1]) { // L: 4413
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4414
				} else if (field826[var1]) { // L: 4416
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4417
				}
			}
		}

		World.method1728(ParamComposition.Client_plane, class35.localPlayer.x, class35.localPlayer.y, field768); // L: 4421
		field768 = 0; // L: 4422
	} // L: 4423

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)Z",
		garbageValue = "1161587969"
	)
	final boolean method1230(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5845
		PacketBuffer var3 = var1.packetBuffer; // L: 5846
		if (var2 == null) { // L: 5847
			return false;
		} else {
			int var6;
			String var19;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5849
					if (var1.field1383) { // L: 5850
						if (!var2.isAvailable(1)) { // L: 5851
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5852
						var1.field1384 = 0; // L: 5853
						var1.field1383 = false; // L: 5854
					}

					var3.offset = 0; // L: 5856
					if (var3.method6395()) { // L: 5857
						if (!var2.isAvailable(1)) { // L: 5858
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5859
						var1.field1384 = 0; // L: 5860
					}

					var1.field1383 = true; // L: 5862
					ServerPacket[] var4 = ModeWhere.ServerPacket_values(); // L: 5863
					var5 = var3.readSmartByteShortIsaac(); // L: 5864
					if (var5 < 0 || var5 >= var4.length) { // L: 5865
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5866
					var1.serverPacketLength = var1.serverPacket.length; // L: 5867
				}

				if (var1.serverPacketLength == -1) { // L: 5869
					if (!var2.isAvailable(1)) { // L: 5870
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5871
					var1.serverPacketLength = var3.array[0] & 255; // L: 5872
				}

				if (var1.serverPacketLength == -2) { // L: 5874
					if (!var2.isAvailable(2)) { // L: 5875
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5876
					var3.offset = 0; // L: 5877
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5878
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5880
					return false;
				}

				var3.offset = 0; // L: 5881
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5882
				var1.field1384 = 0; // L: 5883
				timer.method5463(); // L: 5884
				var1.field1391 = var1.field1387; // L: 5885
				var1.field1387 = var1.field1386; // L: 5886
				var1.field1386 = var1.serverPacket; // L: 5887
				int var7;
				int var8;
				int var9;
				int var17;
				if (ServerPacket.field2772 == var1.serverPacket) { // L: 5888
					var17 = var3.readUnsignedShort(); // L: 5889
					var5 = var3.readInt(); // L: 5890
					var6 = var17 >> 10 & 31; // L: 5891
					var7 = var17 >> 5 & 31; // L: 5892
					var8 = var17 & 31; // L: 5893
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 5894
					Widget var53 = DevicePcmPlayerProvider.getWidget(var5); // L: 5895
					if (var9 != var53.color) { // L: 5896
						var53.color = var9; // L: 5897
						VerticalAlignment.invalidateWidget(var53); // L: 5898
					}

					var1.serverPacket = null; // L: 5900
					return true; // L: 5901
				}

				if (ServerPacket.field2734 == var1.serverPacket) { // L: 5903
					if (var1.serverPacketLength == 0) { // L: 5904
						class25.clanChat = null; // L: 5905
					} else {
						if (class25.clanChat == null) { // L: 5908
							class25.clanChat = new ClanChat(ModeWhere.loginType, class303.client); // L: 5909
						}

						class25.clanChat.readUpdate(var3); // L: 5911
					}

					ItemContainer.method2108(); // L: 5913
					var1.serverPacket = null; // L: 5914
					return true; // L: 5915
				}

				if (ServerPacket.field2777 == var1.serverPacket) { // L: 5917
					FileSystem.logOut(); // L: 5918
					var1.serverPacket = null; // L: 5919
					return false; // L: 5920
				}

				Widget var18;
				if (ServerPacket.field2775 == var1.serverPacket) { // L: 5922
					var17 = var3.method6481(); // L: 5923
					var5 = var3.method6490(); // L: 5924
					var18 = DevicePcmPlayerProvider.getWidget(var17); // L: 5925
					if (var5 != var18.sequenceId || var5 == -1) { // L: 5926
						var18.sequenceId = var5; // L: 5927
						var18.modelFrame = 0; // L: 5928
						var18.modelFrameCycle = 0; // L: 5929
						VerticalAlignment.invalidateWidget(var18); // L: 5930
					}

					var1.serverPacket = null; // L: 5932
					return true; // L: 5933
				}

				if (ServerPacket.field2754 == var1.serverPacket) { // L: 5935
					for (var17 = 0; var17 < class403.VarpDefinition_fileCount; ++var17) { // L: 5936
						VarpDefinition var73 = MusicPatchNode.VarpDefinition_get(var17); // L: 5937
						if (var73 != null) { // L: 5938
							Varps.Varps_temp[var17] = 0; // L: 5939
							Varps.Varps_main[var17] = 0; // L: 5940
						}
					}

					Script.method2014(); // L: 5943
					changedVarpCount += 32; // L: 5944
					var1.serverPacket = null; // L: 5945
					return true; // L: 5946
				}

				Widget var20;
				if (ServerPacket.field2711 == var1.serverPacket) { // L: 5948
					var17 = var3.method6489(); // L: 5949
					var5 = var3.method6428(); // L: 5950
					var6 = var3.method6488(); // L: 5951
					var20 = DevicePcmPlayerProvider.getWidget(var5); // L: 5952
					if (var6 != var20.rawX || var17 != var20.rawY || var20.xAlignment != 0 || var20.yAlignment != 0) { // L: 5953
						var20.rawX = var6; // L: 5954
						var20.rawY = var17; // L: 5955
						var20.xAlignment = 0; // L: 5956
						var20.yAlignment = 0; // L: 5957
						VerticalAlignment.invalidateWidget(var20); // L: 5958
						this.alignWidget(var20); // L: 5959
						if (var20.type == 0) { // L: 5960
							ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var5 >> 16], var20, false);
						}
					}

					var1.serverPacket = null; // L: 5962
					return true; // L: 5963
				}

				if (ServerPacket.field2720 == var1.serverPacket) { // L: 5965
					class19.method267(class225.field2682); // L: 5966
					var1.serverPacket = null; // L: 5967
					return true; // L: 5968
				}

				String var46;
				if (ServerPacket.field2760 == var1.serverPacket) { // L: 5970
					var46 = var3.readStringCp1252NullTerminated(); // L: 5971
					Object[] var72 = new Object[var46.length() + 1]; // L: 5972

					for (var6 = var46.length() - 1; var6 >= 0; --var6) { // L: 5973
						if (var46.charAt(var6) == 's') { // L: 5974
							var72[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var6 + 1] = new Integer(var3.readInt()); // L: 5975
						}
					}

					var72[0] = new Integer(var3.readInt()); // L: 5977
					ScriptEvent var77 = new ScriptEvent(); // L: 5978
					var77.args = var72; // L: 5979
					class259.runScriptEvent(var77); // L: 5980
					var1.serverPacket = null; // L: 5981
					return true; // L: 5982
				}

				if (ServerPacket.field2737 == var1.serverPacket) { // L: 5984
					GrandExchangeOfferUnitPriceComparator.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 5985
					field801 = cycleCntr; // L: 5986
					var1.serverPacket = null; // L: 5987
					return true; // L: 5988
				}

				if (ServerPacket.field2784 == var1.serverPacket) { // L: 5990
					rebootTimer = var3.readUnsignedShort() * 30; // L: 5991
					field731 = cycleCntr; // L: 5992
					var1.serverPacket = null; // L: 5993
					return true; // L: 5994
				}

				if (ServerPacket.field2767 == var1.serverPacket) { // L: 5996
					class19.method267(class225.field2679); // L: 5997
					var1.serverPacket = null; // L: 5998
					return true; // L: 5999
				}

				Widget var66;
				if (ServerPacket.field2763 == var1.serverPacket) { // L: 6001
					var17 = var3.method6497(); // L: 6002
					var66 = DevicePcmPlayerProvider.getWidget(var17); // L: 6003
					var66.modelType = 3; // L: 6004
					var66.modelId = class35.localPlayer.appearance.getChatHeadId(); // L: 6005
					VerticalAlignment.invalidateWidget(var66); // L: 6006
					var1.serverPacket = null; // L: 6007
					return true; // L: 6008
				}

				if (ServerPacket.field2782 == var1.serverPacket) { // L: 6010
					VarpDefinition.field1542 = var3.readUnsignedByte(); // L: 6011
					class7.field66 = var3.readUnsignedByte(); // L: 6012

					for (var17 = class7.field66; var17 < class7.field66 + 8; ++var17) { // L: 6013
						for (var5 = VarpDefinition.field1542; var5 < VarpDefinition.field1542 + 8; ++var5) { // L: 6014
							if (groundItems[ParamComposition.Client_plane][var17][var5] != null) { // L: 6015
								groundItems[ParamComposition.Client_plane][var17][var5] = null; // L: 6016
								Varcs.updateItemPile(var17, var5); // L: 6017
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) { // L: 6021 6022 6024
						if (var50.x >= class7.field66 && var50.x < class7.field66 + 8 && var50.y >= VarpDefinition.field1542 && var50.y < VarpDefinition.field1542 + 8 && var50.plane == ParamComposition.Client_plane) { // L: 6023
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6026
					return true; // L: 6027
				}

				if (ServerPacket.field2725 == var1.serverPacket) { // L: 6029
					if (rootInterface != -1) { // L: 6030
						LoginType.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6031
					return true; // L: 6032
				}

				if (ServerPacket.field2729 == var1.serverPacket) { // L: 6034
					class19.method267(class225.field2675); // L: 6035
					var1.serverPacket = null; // L: 6036
					return true; // L: 6037
				}

				if (ServerPacket.field2766 == var1.serverPacket) { // L: 6039
					class3.updateNpcs(true, var3); // L: 6040
					var1.serverPacket = null; // L: 6041
					return true; // L: 6042
				}

				if (ServerPacket.field2774 == var1.serverPacket) { // L: 6044
					ClientPreferences.loadRegions(false, var1.packetBuffer); // L: 6045
					var1.serverPacket = null; // L: 6046
					return true; // L: 6047
				}

				if (ServerPacket.field2700 == var1.serverPacket) { // L: 6049
					var17 = var3.readInt(); // L: 6050
					var5 = var3.readInt(); // L: 6051
					var6 = SpotAnimationDefinition.getGcDuration(); // L: 6052
					PacketBufferNode var69 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2649, packetWriter.isaacCipher); // L: 6054
					var69.packetBuffer.method6493(var17); // L: 6055
					var69.packetBuffer.writeInt(var5); // L: 6056
					var69.packetBuffer.method6449(GameEngine.fps); // L: 6057
					var69.packetBuffer.method6610(var6); // L: 6058
					packetWriter.addNode(var69); // L: 6059
					var1.serverPacket = null; // L: 6060
					return true; // L: 6061
				}

				byte var60;
				if (ServerPacket.field2788 == var1.serverPacket) { // L: 6063
					field814 = cycleCntr; // L: 6064
					var60 = var3.readByte(); // L: 6065
					if (var1.serverPacketLength == 1) { // L: 6066
						if (var60 >= 0) { // L: 6067
							field847[var60] = null;
						} else {
							Players.field1358 = null; // L: 6068
						}

						var1.serverPacket = null; // L: 6069
						return true; // L: 6070
					}

					if (var60 >= 0) { // L: 6072
						field847[var60] = new class3(var3); // L: 6073
					} else {
						Players.field1358 = new class3(var3); // L: 6076
					}

					var1.serverPacket = null; // L: 6078
					return true; // L: 6079
				}

				if (ServerPacket.field2713 == var1.serverPacket) { // L: 6081
					var17 = var3.readUnsignedByte(); // L: 6082
					class9.method95(var17); // L: 6083
					var1.serverPacket = null; // L: 6084
					return true; // L: 6085
				}

				if (ServerPacket.field2739 == var1.serverPacket) { // L: 6087
					var17 = var3.readUnsignedShort(); // L: 6088
					if (var17 == 65535) { // L: 6089
						var17 = -1;
					}

					FontName.playSong(var17); // L: 6090
					var1.serverPacket = null; // L: 6091
					return true; // L: 6092
				}

				if (ServerPacket.field2724 == var1.serverPacket) { // L: 6094
					var17 = var3.method6486(); // L: 6095
					if (var17 == 65535) { // L: 6096
						var17 = -1;
					}

					var5 = var3.method6492(); // L: 6097
					class311.method5486(var17, var5); // L: 6098
					var1.serverPacket = null; // L: 6099
					return true; // L: 6100
				}

				if (ServerPacket.field2768 == var1.serverPacket) { // L: 6102
					class19.method267(class225.field2674); // L: 6103
					var1.serverPacket = null; // L: 6104
					return true; // L: 6105
				}

				if (ServerPacket.field2749 == var1.serverPacket) { // L: 6107
					class19.method267(class225.field2677); // L: 6108
					var1.serverPacket = null; // L: 6109
					return true; // L: 6110
				}

				if (ServerPacket.field2699 == var1.serverPacket) { // L: 6112
					for (var17 = 0; var17 < players.length; ++var17) { // L: 6113
						if (players[var17] != null) { // L: 6114
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) { // L: 6116
						if (npcs[var17] != null) { // L: 6117
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6119
					return true; // L: 6120
				}

				long var12;
				int var21;
				InterfaceParent var63;
				if (ServerPacket.field2726 == var1.serverPacket) { // L: 6122
					var17 = var3.offset + var1.serverPacketLength; // L: 6123
					var5 = var3.readUnsignedShort(); // L: 6124
					var6 = var3.readUnsignedShort(); // L: 6125
					if (var5 != rootInterface) { // L: 6126
						rootInterface = var5; // L: 6127
						this.resizeRoot(false); // L: 6128
						ApproximateRouteStrategy.Widget_resetModelFrames(rootInterface); // L: 6129
						HealthBar.runWidgetOnLoadListener(rootInterface); // L: 6130

						for (var7 = 0; var7 < 100; ++var7) { // L: 6131
							field825[var7] = true;
						}
					}

					InterfaceParent var52;
					for (; var6-- > 0; var52.field1136 = true) { // L: 6133 6143
						var7 = var3.readInt(); // L: 6134
						var8 = var3.readUnsignedShort(); // L: 6135
						var9 = var3.readUnsignedByte(); // L: 6136
						var52 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6137
						if (var52 != null && var8 != var52.group) { // L: 6138
							class18.closeInterface(var52, true); // L: 6139
							var52 = null; // L: 6140
						}

						if (var52 == null) { // L: 6142
							var52 = GrandExchangeOfferWorldComparator.method5010(var7, var8, var9);
						}
					}

					for (var63 = (InterfaceParent)interfaceParents.first(); var63 != null; var63 = (InterfaceParent)interfaceParents.next()) { // L: 6145
						if (var63.field1136) { // L: 6146
							var63.field1136 = false;
						} else {
							class18.closeInterface(var63, true); // L: 6148
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6151

					while (var3.offset < var17) { // L: 6152
						var7 = var3.readInt(); // L: 6153
						var8 = var3.readUnsignedShort(); // L: 6154
						var9 = var3.readUnsignedShort(); // L: 6155
						var21 = var3.readInt(); // L: 6156

						for (int var54 = var8; var54 <= var9; ++var54) { // L: 6157
							var12 = ((long)var7 << 32) + (long)var54; // L: 6158
							widgetFlags.put(new IntegerNode(var21), var12); // L: 6159
						}
					}

					var1.serverPacket = null; // L: 6162
					return true; // L: 6163
				}

				if (ServerPacket.field2731 == var1.serverPacket) { // L: 6165
					class19.method267(class225.field2673); // L: 6166
					var1.serverPacket = null; // L: 6167
					return true; // L: 6168
				}

				if (ServerPacket.field2716 == var1.serverPacket) { // L: 6170
					var17 = var3.readInt(); // L: 6171
					var5 = var3.readUnsignedShort(); // L: 6172
					var18 = DevicePcmPlayerProvider.getWidget(var17); // L: 6173
					if (var18.modelType != 2 || var5 != var18.modelId) { // L: 6174
						var18.modelType = 2; // L: 6175
						var18.modelId = var5; // L: 6176
						VerticalAlignment.invalidateWidget(var18); // L: 6177
					}

					var1.serverPacket = null; // L: 6179
					return true; // L: 6180
				}

				if (ServerPacket.field2769 == var1.serverPacket) { // L: 6182
					GameObject.readReflectionCheck(var3, var1.serverPacketLength); // L: 6183
					var1.serverPacket = null; // L: 6184
					return true; // L: 6185
				}

				if (ServerPacket.field2757 == var1.serverPacket) { // L: 6187
					class22.method297(); // L: 6188
					var60 = var3.readByte(); // L: 6189
					if (var1.serverPacketLength == 1) { // L: 6190
						if (var60 >= 0) { // L: 6191
							field678[var60] = null;
						} else {
							class105.field1328 = null; // L: 6192
						}

						var1.serverPacket = null; // L: 6193
						return true; // L: 6194
					}

					if (var60 >= 0) { // L: 6196
						field678[var60] = new class11(var3); // L: 6197
					} else {
						class105.field1328 = new class11(var3); // L: 6200
					}

					var1.serverPacket = null; // L: 6202
					return true; // L: 6203
				}

				boolean var76;
				if (ServerPacket.field2722 == var1.serverPacket) { // L: 6205
					var76 = var3.readBoolean(); // L: 6206
					if (var76) { // L: 6207
						if (class18.field154 == null) { // L: 6208
							class18.field154 = new class285();
						}
					} else {
						class18.field154 = null; // L: 6210
					}

					var1.serverPacket = null; // L: 6211
					return true; // L: 6212
				}

				if (ServerPacket.field2779 == var1.serverPacket) { // L: 6214
					minimapState = var3.readUnsignedByte(); // L: 6215
					var1.serverPacket = null; // L: 6216
					return true; // L: 6217
				}

				if (ServerPacket.field2759 == var1.serverPacket) { // L: 6219
					Script.method2014(); // L: 6220
					weight = var3.readShort(); // L: 6221
					field731 = cycleCntr; // L: 6222
					var1.serverPacket = null; // L: 6223
					return true; // L: 6224
				}

				if (ServerPacket.field2755 == var1.serverPacket) { // L: 6226
					VarpDefinition.field1542 = var3.readUnsignedByte(); // L: 6227
					class7.field66 = var3.readUnsignedByte(); // L: 6228

					while (var3.offset < var1.serverPacketLength) { // L: 6229
						var17 = var3.readUnsignedByte(); // L: 6230
						class225 var70 = class124.method2501()[var17]; // L: 6231
						class19.method267(var70); // L: 6232
					}

					var1.serverPacket = null; // L: 6234
					return true; // L: 6235
				}

				if (ServerPacket.field2742 == var1.serverPacket) { // L: 6237
					var17 = var3.readUnsignedByte(); // L: 6238
					var5 = var3.readUnsignedByte(); // L: 6239
					var6 = var3.readUnsignedByte(); // L: 6240
					var7 = var3.readUnsignedByte(); // L: 6241
					field846[var17] = true; // L: 6242
					field744[var17] = var5; // L: 6243
					field868[var17] = var6; // L: 6244
					field869[var17] = var7; // L: 6245
					field870[var17] = 0; // L: 6246
					var1.serverPacket = null; // L: 6247
					return true; // L: 6248
				}

				long var22;
				if (ServerPacket.field2780 == var1.serverPacket) { // L: 6250
					var17 = var3.readUnsignedShort(); // L: 6251
					if (var17 == 65535) { // L: 6252
						var17 = -1;
					}

					var5 = var3.method6481(); // L: 6253
					var6 = var3.method6648(); // L: 6254
					if (var6 == 65535) { // L: 6255
						var6 = -1;
					}

					var7 = var3.method6428(); // L: 6256

					for (var8 = var17; var8 <= var6; ++var8) { // L: 6257
						var22 = (long)var8 + ((long)var7 << 32); // L: 6258
						Node var75 = widgetFlags.get(var22); // L: 6259
						if (var75 != null) { // L: 6260
							var75.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var22); // L: 6261
					}

					var1.serverPacket = null; // L: 6263
					return true; // L: 6264
				}

				if (ServerPacket.field2735 == var1.serverPacket) { // L: 6266
					var17 = var3.method6620(); // L: 6267
					rootInterface = var17; // L: 6268
					this.resizeRoot(false); // L: 6269
					ApproximateRouteStrategy.Widget_resetModelFrames(var17); // L: 6270
					HealthBar.runWidgetOnLoadListener(rootInterface); // L: 6271

					for (var5 = 0; var5 < 100; ++var5) { // L: 6272
						field825[var5] = true;
					}

					var1.serverPacket = null; // L: 6273
					return true; // L: 6274
				}

				if (ServerPacket.field2758 == var1.serverPacket) { // L: 6276
					hintArrowType = var3.readUnsignedByte(); // L: 6277
					if (hintArrowType == 1) { // L: 6278
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6279
						if (hintArrowType == 2) { // L: 6280
							hintArrowSubX = 64; // L: 6281
							hintArrowSubY = 64; // L: 6282
						}

						if (hintArrowType == 3) { // L: 6284
							hintArrowSubX = 0; // L: 6285
							hintArrowSubY = 64; // L: 6286
						}

						if (hintArrowType == 4) { // L: 6288
							hintArrowSubX = 128; // L: 6289
							hintArrowSubY = 64; // L: 6290
						}

						if (hintArrowType == 5) { // L: 6292
							hintArrowSubX = 64; // L: 6293
							hintArrowSubY = 0; // L: 6294
						}

						if (hintArrowType == 6) { // L: 6296
							hintArrowSubX = 64; // L: 6297
							hintArrowSubY = 128; // L: 6298
						}

						hintArrowType = 2; // L: 6300
						hintArrowX = var3.readUnsignedShort(); // L: 6301
						hintArrowY = var3.readUnsignedShort(); // L: 6302
						hintArrowHeight = var3.readUnsignedByte(); // L: 6303
					}

					if (hintArrowType == 10) { // L: 6305
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6306
					return true; // L: 6307
				}

				String var74;
				if (ServerPacket.field2764 == var1.serverPacket) { // L: 6309
					byte[] var49 = new byte[var1.serverPacketLength]; // L: 6310
					var3.method6397(var49, 0, var49.length); // L: 6311
					Buffer var67 = new Buffer(var49); // L: 6312
					var74 = var67.readStringCp1252NullTerminated(); // L: 6313
					Interpreter.openURL(var74, true, false); // L: 6314
					var1.serverPacket = null; // L: 6315
					return true; // L: 6316
				}

				long var25;
				long var27;
				String var33;
				int var58;
				if (ServerPacket.field2712 == var1.serverPacket) { // L: 6318
					var46 = var3.readStringCp1252NullTerminated(); // L: 6319
					var25 = (long)var3.readUnsignedShort(); // L: 6320
					var27 = (long)var3.readMedium(); // L: 6321
					PlayerType var29 = (PlayerType)UserComparator4.findEnumerated(class249.PlayerType_values(), var3.readUnsignedByte()); // L: 6322
					long var30 = (var25 << 32) + var27; // L: 6323
					boolean var32 = false; // L: 6324

					for (var58 = 0; var58 < 100; ++var58) { // L: 6325
						if (crossWorldMessageIds[var58] == var30) { // L: 6326
							var32 = true; // L: 6327
							break; // L: 6328
						}
					}

					if (GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var46, ModeWhere.loginType))) { // L: 6331
						var32 = true;
					}

					if (!var32 && field727 == 0) { // L: 6332
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var30; // L: 6333
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6334
						var33 = AbstractFont.escapeBrackets(Clock.method2592(class22.method299(var3))); // L: 6335
						byte var59;
						if (var29.isPrivileged) { // L: 6337
							var59 = 7;
						} else {
							var59 = 3; // L: 6338
						}

						if (var29.modIcon != -1) { // L: 6339
							WorldMapScaleHandler.addGameMessage(var59, class169.method3495(var29.modIcon) + var46, var33);
						} else {
							WorldMapScaleHandler.addGameMessage(var59, var46, var33); // L: 6340
						}
					}

					var1.serverPacket = null; // L: 6342
					return true; // L: 6343
				}

				Widget var34;
				if (ServerPacket.field2761 == var1.serverPacket) { // L: 6345
					var17 = var3.method6620(); // L: 6346
					var5 = var3.method6648(); // L: 6347
					var6 = var3.method6486(); // L: 6348
					var7 = var3.method6428(); // L: 6349
					var34 = DevicePcmPlayerProvider.getWidget(var7); // L: 6350
					if (var17 != var34.modelAngleX || var5 != var34.modelAngleY || var6 != var34.modelZoom) { // L: 6351
						var34.modelAngleX = var17; // L: 6352
						var34.modelAngleY = var5; // L: 6353
						var34.modelZoom = var6; // L: 6354
						VerticalAlignment.invalidateWidget(var34); // L: 6355
					}

					var1.serverPacket = null; // L: 6357
					return true; // L: 6358
				}

				if (ServerPacket.field2771 == var1.serverPacket) { // L: 6360
					HealthBar.updatePlayers(var3, var1.serverPacketLength); // L: 6361
					Clock.method2583(); // L: 6362
					var1.serverPacket = null; // L: 6363
					return true; // L: 6364
				}

				if (ServerPacket.field2728 == var1.serverPacket) { // L: 6366
					class19.method267(class225.field2687); // L: 6367
					var1.serverPacket = null; // L: 6368
					return true; // L: 6369
				}

				if (ServerPacket.field2738 == var1.serverPacket) { // L: 6371
					var17 = var3.readInt(); // L: 6372
					if (var17 != field839) { // L: 6373
						field839 = var17; // L: 6374
						FriendSystem.method1732(); // L: 6375
					}

					var1.serverPacket = null; // L: 6377
					return true; // L: 6378
				}

				if (ServerPacket.field2718 == var1.serverPacket) { // L: 6380
					var17 = var3.readUShortSmart(); // L: 6381
					boolean var56 = var3.readUnsignedByte() == 1; // L: 6382
					var74 = ""; // L: 6383
					boolean var51 = false; // L: 6384
					if (var56) { // L: 6385
						var74 = var3.readStringCp1252NullTerminated(); // L: 6386
						if (GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var74, ModeWhere.loginType))) { // L: 6387
							var51 = true;
						}
					}

					String var79 = var3.readStringCp1252NullTerminated(); // L: 6389
					if (!var51) { // L: 6390
						WorldMapScaleHandler.addGameMessage(var17, var74, var79);
					}

					var1.serverPacket = null; // L: 6391
					return true; // L: 6392
				}

				if (ServerPacket.field2751 == var1.serverPacket) { // L: 6394
					isCameraLocked = true; // L: 6395
					Language.field3704 = var3.readUnsignedByte(); // L: 6396
					Interpreter.field947 = var3.readUnsignedByte(); // L: 6397
					KitDefinition.field1592 = var3.readUnsignedShort(); // L: 6398
					class2.field18 = var3.readUnsignedByte(); // L: 6399
					ReflectionCheck.field580 = var3.readUnsignedByte(); // L: 6400
					if (ReflectionCheck.field580 >= 100) { // L: 6401
						var17 = Language.field3704 * 128 + 64; // L: 6402
						var5 = Interpreter.field947 * 128 + 64; // L: 6403
						var6 = SceneTilePaint.getTileHeight(var17, var5, ParamComposition.Client_plane) - KitDefinition.field1592; // L: 6404
						var7 = var17 - class20.cameraX; // L: 6405
						var8 = var6 - Skeleton.cameraY; // L: 6406
						var9 = var5 - WorldMapDecoration.cameraZ; // L: 6407
						var21 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 6408
						class1.cameraPitch = (int)(Math.atan2((double)var8, (double)var21) * 325.949D) & 2047; // L: 6409
						HealthBarDefinition.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047; // L: 6410
						if (class1.cameraPitch < 128) { // L: 6411
							class1.cameraPitch = 128;
						}

						if (class1.cameraPitch > 383) { // L: 6412
							class1.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6414
					return true; // L: 6415
				}

				if (ServerPacket.field2747 == var1.serverPacket) { // L: 6417
					var17 = var3.readUnsignedByte(); // L: 6418
					var5 = var3.method6648(); // L: 6419
					var6 = var3.method6481(); // L: 6420
					var63 = (InterfaceParent)interfaceParents.get((long)var6); // L: 6421
					if (var63 != null) { // L: 6422
						class18.closeInterface(var63, var5 != var63.group);
					}

					GrandExchangeOfferWorldComparator.method5010(var6, var5, var17); // L: 6423
					var1.serverPacket = null; // L: 6424
					return true; // L: 6425
				}

				if (ServerPacket.field2704 == var1.serverPacket) { // L: 6427
					var76 = var3.method6478() == 1; // L: 6428
					var5 = var3.method6428(); // L: 6429
					var18 = DevicePcmPlayerProvider.getWidget(var5); // L: 6430
					if (var76 != var18.isHidden) { // L: 6431
						var18.isHidden = var76; // L: 6432
						VerticalAlignment.invalidateWidget(var18); // L: 6433
					}

					var1.serverPacket = null; // L: 6435
					return true; // L: 6436
				}

				if (ServerPacket.field2778 == var1.serverPacket) { // L: 6438
					var46 = var3.readStringCp1252NullTerminated(); // L: 6439
					var5 = var3.method6497(); // L: 6440
					var18 = DevicePcmPlayerProvider.getWidget(var5); // L: 6441
					if (!var46.equals(var18.text)) { // L: 6442
						var18.text = var46; // L: 6443
						VerticalAlignment.invalidateWidget(var18); // L: 6444
					}

					var1.serverPacket = null; // L: 6446
					return true; // L: 6447
				}

				if (ServerPacket.field2744 == var1.serverPacket) { // L: 6449
					var17 = var3.readUnsignedShort(); // L: 6450
					byte var55 = var3.readByte(); // L: 6451
					Varps.Varps_temp[var17] = var55; // L: 6452
					if (Varps.Varps_main[var17] != var55) { // L: 6453
						Varps.Varps_main[var17] = var55; // L: 6454
					}

					WorldMapData_0.changeGameOptions(var17); // L: 6456
					changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 6457
					var1.serverPacket = null; // L: 6458
					return true; // L: 6459
				}

				if (ServerPacket.field2786 == var1.serverPacket) { // L: 6461
					class3.updateNpcs(false, var3); // L: 6462
					var1.serverPacket = null; // L: 6463
					return true; // L: 6464
				}

				if (ServerPacket.field2710 == var1.serverPacket) { // L: 6466
					class19.method267(class225.field2678); // L: 6467
					var1.serverPacket = null; // L: 6468
					return true; // L: 6469
				}

				if (ServerPacket.field2773 == var1.serverPacket) { // L: 6471
					isCameraLocked = true; // L: 6472
					field696 = var3.readUnsignedByte(); // L: 6473
					class18.field157 = var3.readUnsignedByte(); // L: 6474
					class0.field5 = var3.readUnsignedShort(); // L: 6475
					UserComparator4.field1403 = var3.readUnsignedByte(); // L: 6476
					SoundSystem.field436 = var3.readUnsignedByte(); // L: 6477
					if (SoundSystem.field436 >= 100) { // L: 6478
						class20.cameraX = field696 * 128 + 64; // L: 6479
						WorldMapDecoration.cameraZ = class18.field157 * 128 + 64; // L: 6480
						Skeleton.cameraY = SceneTilePaint.getTileHeight(class20.cameraX, WorldMapDecoration.cameraZ, ParamComposition.Client_plane) - class0.field5; // L: 6481
					}

					var1.serverPacket = null; // L: 6483
					return true; // L: 6484
				}

				if (ServerPacket.field2743 == var1.serverPacket) { // L: 6486
					class19.method267(class225.field2680); // L: 6487
					var1.serverPacket = null; // L: 6488
					return true; // L: 6489
				}

				if (ServerPacket.field2752 == var1.serverPacket) { // L: 6491
					var17 = var3.method6620(); // L: 6492
					var5 = var3.method6428(); // L: 6493
					var18 = DevicePcmPlayerProvider.getWidget(var5); // L: 6494
					if (var18.modelType != 1 || var17 != var18.modelId) { // L: 6495
						var18.modelType = 1; // L: 6496
						var18.modelId = var17; // L: 6497
						VerticalAlignment.invalidateWidget(var18); // L: 6498
					}

					var1.serverPacket = null; // L: 6500
					return true; // L: 6501
				}

				if (ServerPacket.field2750 == var1.serverPacket) { // L: 6503
					ObjectSound.field935 = null; // L: 6504
					var1.serverPacket = null; // L: 6505
					return true; // L: 6506
				}

				if (ServerPacket.field2783 == var1.serverPacket) { // L: 6508
					var76 = var3.readUnsignedByte() == 1; // L: 6509
					if (var76) { // L: 6510
						ChatChannel.field1081 = Archive.currentTimeMillis() - var3.readLong(); // L: 6511
						class29.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6512
					} else {
						class29.grandExchangeEvents = null; // L: 6514
					}

					field816 = cycleCntr; // L: 6515
					var1.serverPacket = null; // L: 6516
					return true; // L: 6517
				}

				if (ServerPacket.field2719 == var1.serverPacket) { // L: 6519
					var17 = var3.method6428(); // L: 6520
					var5 = var3.method6497(); // L: 6521
					var6 = var3.method6486(); // L: 6522
					if (var6 == 65535) { // L: 6523
						var6 = -1;
					}

					var20 = DevicePcmPlayerProvider.getWidget(var5); // L: 6524
					ItemComposition var78;
					if (!var20.isIf3) { // L: 6525
						if (var6 == -1) { // L: 6526
							var20.modelType = 0; // L: 6527
							var1.serverPacket = null; // L: 6528
							return true; // L: 6529
						}

						var78 = Strings.ItemDefinition_get(var6); // L: 6531
						var20.modelType = 4; // L: 6532
						var20.modelId = var6; // L: 6533
						var20.modelAngleX = var78.xan2d; // L: 6534
						var20.modelAngleY = var78.yan2d; // L: 6535
						var20.modelZoom = var78.zoom2d * 100 / var17; // L: 6536
						VerticalAlignment.invalidateWidget(var20); // L: 6537
					} else {
						var20.itemId = var6; // L: 6540
						var20.itemQuantity = var17; // L: 6541
						var78 = Strings.ItemDefinition_get(var6); // L: 6542
						var20.modelAngleX = var78.xan2d; // L: 6543
						var20.modelAngleY = var78.yan2d; // L: 6544
						var20.modelAngleZ = var78.zan2d; // L: 6545
						var20.modelOffsetX = var78.offsetX2d; // L: 6546
						var20.modelOffsetY = var78.offsetY2d; // L: 6547
						var20.modelZoom = var78.zoom2d; // L: 6548
						if (var78.isStackable == 1) { // L: 6549
							var20.itemQuantityMode = 1;
						} else {
							var20.itemQuantityMode = 2; // L: 6550
						}

						if (var20.field3019 > 0) { // L: 6551
							var20.modelZoom = var20.modelZoom * 32 / var20.field3019;
						} else if (var20.rawWidth > 0) { // L: 6552
							var20.modelZoom = var20.modelZoom * 32 / var20.rawWidth;
						}

						VerticalAlignment.invalidateWidget(var20); // L: 6553
					}

					var1.serverPacket = null; // L: 6555
					return true; // L: 6556
				}

				if (ServerPacket.field2701 == var1.serverPacket) { // L: 6558
					ObjectSound.field935 = new class339(ModeWhere.HitSplatDefinition_cachedSprites); // L: 6559
					var1.serverPacket = null; // L: 6560
					return true; // L: 6561
				}

				if (ServerPacket.field2702 == var1.serverPacket) { // L: 6563
					var46 = var3.readStringCp1252NullTerminated(); // L: 6564
					var19 = AbstractFont.escapeBrackets(Clock.method2592(class22.method299(var3))); // L: 6565
					WorldMapScaleHandler.addGameMessage(6, var46, var19); // L: 6566
					var1.serverPacket = null; // L: 6567
					return true; // L: 6568
				}

				if (ServerPacket.field2703 == var1.serverPacket) { // L: 6570
					var17 = var3.readUnsignedShort(); // L: 6571
					var5 = var3.readUnsignedByte(); // L: 6572
					var6 = var3.readUnsignedShort(); // L: 6573
					class69.queueSoundEffect(var17, var5, var6); // L: 6574
					var1.serverPacket = null; // L: 6575
					return true; // L: 6576
				}

				if (ServerPacket.field2709 == var1.serverPacket) { // L: 6578
					class5.method64(var3.readStringCp1252NullTerminated()); // L: 6579
					var1.serverPacket = null; // L: 6580
					return true; // L: 6581
				}

				int var15;
				String var35;
				if (ServerPacket.field2708 == var1.serverPacket) { // L: 6583
					var46 = var3.readStringCp1252NullTerminated(); // L: 6584
					var25 = var3.readLong(); // L: 6585
					var27 = (long)var3.readUnsignedShort(); // L: 6586
					var22 = (long)var3.readMedium(); // L: 6587
					PlayerType var24 = (PlayerType)UserComparator4.findEnumerated(class249.PlayerType_values(), var3.readUnsignedByte()); // L: 6588
					var12 = (var27 << 32) + var22; // L: 6589
					boolean var57 = false; // L: 6590

					for (var15 = 0; var15 < 100; ++var15) { // L: 6591
						if (crossWorldMessageIds[var15] == var12) { // L: 6592
							var57 = true; // L: 6593
							break; // L: 6594
						}
					}

					if (var24.isUser && GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var46, ModeWhere.loginType))) { // L: 6597 6598
						var57 = true;
					}

					if (!var57 && field727 == 0) { // L: 6600
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var12; // L: 6601
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6602
						var35 = AbstractFont.escapeBrackets(Clock.method2592(class22.method299(var3))); // L: 6603
						if (var24.modIcon != -1) { // L: 6604
							class69.addChatMessage(9, class169.method3495(var24.modIcon) + var46, var35, MilliClock.base37DecodeLong(var25));
						} else {
							class69.addChatMessage(9, var46, var35, MilliClock.base37DecodeLong(var25)); // L: 6605
						}
					}

					var1.serverPacket = null; // L: 6607
					return true; // L: 6608
				}

				if (ServerPacket.field2721 == var1.serverPacket) { // L: 6610
					var17 = var3.method6481(); // L: 6611
					var66 = DevicePcmPlayerProvider.getWidget(var17); // L: 6612

					for (var6 = 0; var6 < var66.itemIds.length; ++var6) { // L: 6613
						var66.itemIds[var6] = -1; // L: 6614
						var66.itemIds[var6] = 0; // L: 6615
					}

					VerticalAlignment.invalidateWidget(var66); // L: 6617
					var1.serverPacket = null; // L: 6618
					return true; // L: 6619
				}

				if (ServerPacket.field2762 == var1.serverPacket) { // L: 6621
					class22.method297(); // L: 6622
					var60 = var3.readByte(); // L: 6623
					class2 var64 = new class2(var3); // L: 6624
					class11 var71;
					if (var60 >= 0) { // L: 6626
						var71 = field678[var60];
					} else {
						var71 = class105.field1328; // L: 6627
					}

					var64.method25(var71); // L: 6628
					var1.serverPacket = null; // L: 6629
					return true; // L: 6630
				}

				if (ServerPacket.field2730 == var1.serverPacket) { // L: 6632
					var17 = var3.method6497(); // L: 6633
					var5 = var3.readUnsignedShort(); // L: 6634
					Varps.Varps_temp[var5] = var17; // L: 6635
					if (Varps.Varps_main[var5] != var17) { // L: 6636
						Varps.Varps_main[var5] = var17; // L: 6637
					}

					WorldMapData_0.changeGameOptions(var5); // L: 6639
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6640
					var1.serverPacket = null; // L: 6641
					return true; // L: 6642
				}

				if (ServerPacket.field2732 == var1.serverPacket) { // L: 6644
					class19.method267(class225.field2681); // L: 6645
					var1.serverPacket = null; // L: 6646
					return true; // L: 6647
				}

				if (ServerPacket.field2787 == var1.serverPacket) { // L: 6649
					var60 = var3.readByte(); // L: 6650
					var25 = (long)var3.readUnsignedShort(); // L: 6651
					var27 = (long)var3.readMedium(); // L: 6652
					var22 = (var25 << 32) + var27; // L: 6653
					boolean var11 = false; // L: 6654
					class3 var36 = var60 >= 0 ? field847[var60] : Players.field1358; // L: 6655
					if (var36 == null) { // L: 6656
						var11 = true;
					} else {
						for (var58 = 0; var58 < 100; ++var58) { // L: 6658
							if (crossWorldMessageIds[var58] == var22) { // L: 6659
								var11 = true; // L: 6660
								break; // L: 6661
							}
						}
					}

					if (!var11) { // L: 6665
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var22; // L: 6666
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6667
						var33 = class22.method299(var3); // L: 6668
						int var14 = var60 >= 0 ? 43 : 46; // L: 6669
						class69.addChatMessage(var14, "", var33, var36.field38); // L: 6670
					}

					var1.serverPacket = null; // L: 6672
					return true; // L: 6673
				}

				if (ServerPacket.field2733 == var1.serverPacket) { // L: 6675
					var17 = var3.readUnsignedByte(); // L: 6676
					if (var3.readUnsignedByte() == 0) { // L: 6677
						grandExchangeOffers[var17] = new GrandExchangeOffer(); // L: 6678
						var3.offset += 18; // L: 6679
					} else {
						--var3.offset; // L: 6682
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false); // L: 6683
					}

					field815 = cycleCntr; // L: 6685
					var1.serverPacket = null; // L: 6686
					return true; // L: 6687
				}

				if (ServerPacket.field2785 == var1.serverPacket) { // L: 6689
					ClientPreferences.loadRegions(true, var1.packetBuffer); // L: 6690
					var1.serverPacket = null; // L: 6691
					return true; // L: 6692
				}

				if (ServerPacket.field2795 == var1.serverPacket) { // L: 6694
					destinationX = var3.readUnsignedByte(); // L: 6695
					if (destinationX == 255) { // L: 6696
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6697
					if (destinationY == 255) { // L: 6698
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6699
					return true; // L: 6700
				}

				if (ServerPacket.field2745 == var1.serverPacket) { // L: 6702
					Script.method2014(); // L: 6703
					var17 = var3.method6476(); // L: 6704
					var5 = var3.method6478(); // L: 6705
					var6 = var3.method6497(); // L: 6706
					experience[var5] = var6; // L: 6707
					currentLevels[var5] = var17; // L: 6708
					levels[var5] = 1; // L: 6709

					for (var7 = 0; var7 < 98; ++var7) { // L: 6710
						if (var6 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 6711
					var1.serverPacket = null; // L: 6712
					return true; // L: 6713
				}

				if (ServerPacket.field2781 == var1.serverPacket) { // L: 6715
					var17 = var3.method6497(); // L: 6716
					var5 = var3.method6497(); // L: 6717
					InterfaceParent var68 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6718
					var63 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6719
					if (var63 != null) { // L: 6720
						class18.closeInterface(var63, var68 == null || var63.group != var68.group);
					}

					if (var68 != null) { // L: 6721
						var68.remove(); // L: 6722
						interfaceParents.put(var68, (long)var17); // L: 6723
					}

					var34 = DevicePcmPlayerProvider.getWidget(var5); // L: 6725
					if (var34 != null) { // L: 6726
						VerticalAlignment.invalidateWidget(var34);
					}

					var34 = DevicePcmPlayerProvider.getWidget(var17); // L: 6727
					if (var34 != null) { // L: 6728
						VerticalAlignment.invalidateWidget(var34); // L: 6729
						ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var34.id >>> 16], var34, true); // L: 6730
					}

					if (rootInterface != -1) { // L: 6732
						LoginType.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6733
					return true; // L: 6734
				}

				if (ServerPacket.field2746 == var1.serverPacket) { // L: 6736
					var17 = var3.method6497(); // L: 6737
					var5 = var3.method6648(); // L: 6738
					var6 = var3.method6648(); // L: 6739
					var20 = DevicePcmPlayerProvider.getWidget(var17); // L: 6740
					var20.field3020 = var6 + (var5 << 16); // L: 6741
					var1.serverPacket = null; // L: 6742
					return true; // L: 6743
				}

				if (ServerPacket.field2741 == var1.serverPacket) { // L: 6745
					AbstractArchive.privateChatMode = EnumComposition.method2727(var3.readUnsignedByte()); // L: 6746
					var1.serverPacket = null; // L: 6747
					return true; // L: 6748
				}

				if (ServerPacket.field2794 == var1.serverPacket) { // L: 6750
					GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6751
					class181.FriendSystem_invalidateIgnoreds(); // L: 6752
					field801 = cycleCntr; // L: 6753
					var1.serverPacket = null; // L: 6754
					return true; // L: 6755
				}

				if (ServerPacket.field2756 == var1.serverPacket) { // L: 6757
					isCameraLocked = false; // L: 6758

					for (var17 = 0; var17 < 5; ++var17) { // L: 6759
						field846[var17] = false;
					}

					var1.serverPacket = null; // L: 6760
					return true; // L: 6761
				}

				if (ServerPacket.field2714 == var1.serverPacket) { // L: 6763
					Script.method2014(); // L: 6764
					runEnergy = var3.readUnsignedByte(); // L: 6765
					field731 = cycleCntr; // L: 6766
					var1.serverPacket = null; // L: 6767
					return true; // L: 6768
				}

				if (ServerPacket.field2740 == var1.serverPacket) { // L: 6770
					var60 = var3.readByte(); // L: 6771
					var19 = var3.readStringCp1252NullTerminated(); // L: 6772
					long var37 = (long)var3.readUnsignedShort(); // L: 6773
					long var39 = (long)var3.readMedium(); // L: 6774
					PlayerType var10 = (PlayerType)UserComparator4.findEnumerated(class249.PlayerType_values(), var3.readUnsignedByte()); // L: 6775
					long var41 = (var37 << 32) + var39; // L: 6776
					boolean var13 = false; // L: 6777
					class3 var43 = null; // L: 6778
					var43 = var60 >= 0 ? field847[var60] : Players.field1358; // L: 6780
					if (var43 == null) { // L: 6781
						var13 = true; // L: 6782
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var10.isUser && GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var19, ModeWhere.loginType))) { // L: 6791 6792
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var41) { // L: 6786
								var13 = true; // L: 6787
								break; // L: 6788
							}

							++var15; // L: 6785
						}
					}

					if (!var13) { // L: 6795
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41; // L: 6796
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6797
						var35 = AbstractFont.escapeBrackets(class22.method299(var3)); // L: 6798
						int var16 = var60 >= 0 ? 41 : 44; // L: 6799
						if (var10.modIcon != -1) { // L: 6800
							class69.addChatMessage(var16, class169.method3495(var10.modIcon) + var19, var35, var43.field38);
						} else {
							class69.addChatMessage(var16, var19, var35, var43.field38); // L: 6801
						}
					}

					var1.serverPacket = null; // L: 6803
					return true; // L: 6804
				}

				if (ServerPacket.field2727 == var1.serverPacket) { // L: 6806
					var17 = var3.method6486(); // L: 6807
					FriendSystem.method1782(var17); // L: 6808
					changedItemContainers[++field805 - 1 & 31] = var17 & 32767; // L: 6809
					var1.serverPacket = null; // L: 6810
					return true; // L: 6811
				}

				if (ServerPacket.field2707 == var1.serverPacket) { // L: 6813
					class7.field66 = var3.method6476(); // L: 6814
					VarpDefinition.field1542 = var3.method6478(); // L: 6815
					var1.serverPacket = null; // L: 6816
					return true; // L: 6817
				}

				if (ServerPacket.field2715 == var1.serverPacket) { // L: 6819
					field814 = cycleCntr; // L: 6820
					var60 = var3.readByte(); // L: 6821
					class19 var62 = new class19(var3); // L: 6822
					class3 var65;
					if (var60 >= 0) { // L: 6824
						var65 = field847[var60];
					} else {
						var65 = Players.field1358; // L: 6825
					}

					var62.method263(var65); // L: 6826
					var1.serverPacket = null; // L: 6827
					return true; // L: 6828
				}

				if (ServerPacket.field2705 == var1.serverPacket) { // L: 6830
					GrandExchangeOfferUnitPriceComparator.friendSystem.method1734(); // L: 6831
					field801 = cycleCntr; // L: 6832
					var1.serverPacket = null; // L: 6833
					return true; // L: 6834
				}

				if (ServerPacket.field2792 == var1.serverPacket) { // L: 6836
					if (class25.clanChat != null) { // L: 6837
						class25.clanChat.method5519(var3); // L: 6838
					}

					ItemContainer.method2108(); // L: 6840
					var1.serverPacket = null; // L: 6841
					return true; // L: 6842
				}

				if (ServerPacket.field2789 == var1.serverPacket) { // L: 6844
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) { // L: 6845
						if (Varps.Varps_main[var17] != Varps.Varps_temp[var17]) { // L: 6846
							Varps.Varps_main[var17] = Varps.Varps_temp[var17]; // L: 6847
							WorldMapData_0.changeGameOptions(var17); // L: 6848
							changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 6849
						}
					}

					var1.serverPacket = null; // L: 6852
					return true; // L: 6853
				}

				if (ServerPacket.field2748 == var1.serverPacket) { // L: 6855
					if (ObjectSound.field935 == null) { // L: 6856
						ObjectSound.field935 = new class339(ModeWhere.HitSplatDefinition_cachedSprites);
					}

					class390 var48 = ModeWhere.HitSplatDefinition_cachedSprites.method5873(var3); // L: 6857
					ObjectSound.field935.field3930.vmethod6221(var48.field4222, var48.field4221); // L: 6858
					field808[++field809 - 1 & 31] = var48.field4222; // L: 6859
					var1.serverPacket = null; // L: 6860
					return true; // L: 6861
				}

				if (ServerPacket.field2736 == var1.serverPacket) { // L: 6863
					World var47 = new World(); // L: 6864
					var47.host = var3.readStringCp1252NullTerminated(); // L: 6865
					var47.id = var3.readUnsignedShort(); // L: 6866
					var5 = var3.readInt(); // L: 6867
					var47.properties = var5; // L: 6868
					updateGameState(45); // L: 6869
					var2.close(); // L: 6870
					var2 = null; // L: 6871
					PlatformInfo.changeWorld(var47); // L: 6872
					var1.serverPacket = null; // L: 6873
					return false; // L: 6874
				}

				if (ServerPacket.field2765 == var1.serverPacket) { // L: 6876
					var3.offset += 28; // L: 6877
					if (var3.checkCrc()) { // L: 6878
						RouteStrategy.method3134(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6879
					return true; // L: 6880
				}

				if (ServerPacket.field2793 == var1.serverPacket) { // L: 6882
					var17 = var3.readInt(); // L: 6883
					InterfaceParent var61 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6884
					if (var61 != null) { // L: 6885
						class18.closeInterface(var61, true);
					}

					if (meslayerContinueWidget != null) { // L: 6886
						VerticalAlignment.invalidateWidget(meslayerContinueWidget); // L: 6887
						meslayerContinueWidget = null; // L: 6888
					}

					var1.serverPacket = null; // L: 6890
					return true; // L: 6891
				}

				if (ServerPacket.field2753 == var1.serverPacket) { // L: 6893
					var46 = var3.readStringCp1252NullTerminated(); // L: 6894
					var5 = var3.method6478(); // L: 6895
					var6 = var3.method6477(); // L: 6896
					if (var5 >= 1 && var5 <= 8) { // L: 6897
						if (var46.equalsIgnoreCase("null")) { // L: 6898
							var46 = null;
						}

						playerMenuActions[var5 - 1] = var46; // L: 6899
						playerOptionsPriorities[var5 - 1] = var6 == 0; // L: 6900
					}

					var1.serverPacket = null; // L: 6902
					return true; // L: 6903
				}

				if (ServerPacket.field2791 == var1.serverPacket) { // L: 6905
					var17 = var3.readInt(); // L: 6906
					var5 = var3.readUnsignedShort(); // L: 6907
					if (var17 < -70000) { // L: 6908
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6910
						var18 = DevicePcmPlayerProvider.getWidget(var17);
					} else {
						var18 = null; // L: 6911
					}

					for (; var3.offset < var1.serverPacketLength; BufferedNetSocket.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 6912 6926
						var7 = var3.readUShortSmart(); // L: 6913
						var8 = var3.readUnsignedShort(); // L: 6914
						var9 = 0; // L: 6915
						if (var8 != 0) { // L: 6916
							var9 = var3.readUnsignedByte(); // L: 6917
							if (var9 == 255) { // L: 6918
								var9 = var3.readInt();
							}
						}

						if (var18 != null && var7 >= 0 && var7 < var18.itemIds.length) { // L: 6920 6921
							var18.itemIds[var7] = var8; // L: 6922
							var18.itemQuantities[var7] = var9; // L: 6923
						}
					}

					if (var18 != null) { // L: 6928
						VerticalAlignment.invalidateWidget(var18);
					}

					Script.method2014(); // L: 6929
					changedItemContainers[++field805 - 1 & 31] = var5 & 32767; // L: 6930
					var1.serverPacket = null; // L: 6931
					return true; // L: 6932
				}

				if (ServerPacket.field2776 == var1.serverPacket) { // L: 6934
					var17 = var3.readUnsignedByte(); // L: 6935
					class25.forceDisconnect(var17); // L: 6936
					var1.serverPacket = null; // L: 6937
					return false; // L: 6938
				}

				if (ServerPacket.field2723 == var1.serverPacket) { // L: 6940
					var17 = var3.method6428(); // L: 6941
					var5 = var3.method6620(); // L: 6942
					var18 = DevicePcmPlayerProvider.getWidget(var17); // L: 6943
					if (var18 != null && var18.type == 0) { // L: 6944
						if (var5 > var18.scrollHeight - var18.height) { // L: 6945
							var5 = var18.scrollHeight - var18.height;
						}

						if (var5 < 0) { // L: 6946
							var5 = 0;
						}

						if (var5 != var18.scrollY) { // L: 6947
							var18.scrollY = var5; // L: 6948
							VerticalAlignment.invalidateWidget(var18); // L: 6949
						}
					}

					var1.serverPacket = null; // L: 6952
					return true; // L: 6953
				}

				if (ServerPacket.field2790 == var1.serverPacket) { // L: 6955
					publicChatMode = var3.readUnsignedByte(); // L: 6956
					tradeChatMode = var3.method6478(); // L: 6957
					var1.serverPacket = null; // L: 6958
					return true; // L: 6959
				}

				if (ServerPacket.field2770 == var1.serverPacket) { // L: 6961
					var17 = var3.readInt(); // L: 6962
					var5 = var3.readUnsignedShort(); // L: 6963
					if (var17 < -70000) { // L: 6964
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6966
						var18 = DevicePcmPlayerProvider.getWidget(var17);
					} else {
						var18 = null; // L: 6967
					}

					if (var18 != null) { // L: 6968
						for (var7 = 0; var7 < var18.itemIds.length; ++var7) { // L: 6969
							var18.itemIds[var7] = 0; // L: 6970
							var18.itemQuantities[var7] = 0; // L: 6971
						}
					}

					Skills.clearItemContainer(var5); // L: 6974
					var7 = var3.readUnsignedShort(); // L: 6975

					for (var8 = 0; var8 < var7; ++var8) { // L: 6976
						var9 = var3.method6486(); // L: 6977
						var21 = var3.method6476(); // L: 6978
						if (var21 == 255) { // L: 6979
							var21 = var3.method6481();
						}

						if (var18 != null && var8 < var18.itemIds.length) { // L: 6980 6981
							var18.itemIds[var8] = var9; // L: 6982
							var18.itemQuantities[var8] = var21; // L: 6983
						}

						BufferedNetSocket.itemContainerSetItem(var5, var8, var9 - 1, var21); // L: 6986
					}

					if (var18 != null) { // L: 6988
						VerticalAlignment.invalidateWidget(var18);
					}

					Script.method2014(); // L: 6989
					changedItemContainers[++field805 - 1 & 31] = var5 & 32767; // L: 6990
					var1.serverPacket = null; // L: 6991
					return true; // L: 6992
				}

				class27.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -1354398359 * -1217176871 : -1) + "," + (var1.field1387 != null ? var1.field1387.id * -1354398359 * -1217176871 : -1) + "," + (var1.field1391 != null ? var1.field1391.id * -1354398359 * -1217176871 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 6994
				FileSystem.logOut(); // L: 6995
			} catch (IOException var44) { // L: 6997
				BuddyRankComparator.method2492(); // L: 6998
			} catch (Exception var45) {
				var19 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -1354398359 * -1217176871 : -1) + "," + (var1.field1387 != null ? var1.field1387.id * -1354398359 * -1217176871 : -1) + "," + (var1.field1391 != null ? var1.field1391.id * -1354398359 * -1217176871 : -1) + "," + var1.serverPacketLength + "," + (class35.localPlayer.pathX[0] + JagexCache.baseX) + "," + (class35.localPlayer.pathY[0] + Messages.baseY) + ","; // L: 7001

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7002
					var19 = var19 + var3.array[var6] + ",";
				}

				class27.RunException_sendStackTrace(var19, var45); // L: 7003
				FileSystem.logOut(); // L: 7004
			}

			return true; // L: 7006
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	@Export("menu")
	final void menu() {
		ViewportMouse.method4194(); // L: 7908
		if (class34.dragInventoryWidget == null) { // L: 7909
			if (clickedWidget == null) { // L: 7910
				int var2;
				int var4;
				int var5;
				label262: {
					int var1 = MouseHandler.MouseHandler_lastButton; // L: 7911
					int var3;
					int var8;
					int var10;
					int var14;
					if (isMenuOpen) { // L: 7912
						if (var1 != 1 && (class229.mouseCam || var1 != 4)) { // L: 7913
							var2 = MouseHandler.MouseHandler_x; // L: 7914
							var3 = MouseHandler.MouseHandler_y; // L: 7915
							if (var2 < AbstractByteArrayCopier.menuX - 10 || var2 > AbstractByteArrayCopier.menuX + SoundCache.menuWidth + 10 || var3 < HitSplatDefinition.menuY - 10 || var3 > GrandExchangeOfferOwnWorldComparator.menuHeight + HitSplatDefinition.menuY + 10) { // L: 7916
								isMenuOpen = false; // L: 7917
								class179.method3586(AbstractByteArrayCopier.menuX, HitSplatDefinition.menuY, SoundCache.menuWidth, GrandExchangeOfferOwnWorldComparator.menuHeight); // L: 7918
							}
						}

						if (var1 == 1 || !class229.mouseCam && var1 == 4) { // L: 7921
							var2 = AbstractByteArrayCopier.menuX; // L: 7922
							var3 = HitSplatDefinition.menuY; // L: 7923
							var4 = SoundCache.menuWidth; // L: 7924
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 7925
							var14 = MouseHandler.MouseHandler_lastPressedY; // L: 7926
							int var18 = -1; // L: 7927

							int var19;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 7928
								var19 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 7929
								if (var5 > var2 && var5 < var4 + var2 && var14 > var19 - 13 && var14 < var19 + 3) { // L: 7930
									var18 = var8;
								}
							}

							int var11;
							if (var18 != -1 && var18 >= 0) { // L: 7932 7933
								var8 = menuArguments1[var18]; // L: 7934
								var19 = menuArguments2[var18]; // L: 7935
								var10 = menuOpcodes[var18]; // L: 7936
								var11 = menuIdentifiers[var18]; // L: 7937
								String var12 = menuActions[var18]; // L: 7938
								String var13 = menuTargets[var18]; // L: 7939
								HorizontalAlignment.menuAction(var8, var19, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7940
							}

							isMenuOpen = false; // L: 7942
							var8 = AbstractByteArrayCopier.menuX; // L: 7943
							var19 = HitSplatDefinition.menuY; // L: 7944
							var10 = SoundCache.menuWidth; // L: 7945
							var11 = GrandExchangeOfferOwnWorldComparator.menuHeight; // L: 7946

							for (int var17 = 0; var17 < rootWidgetCount; ++var17) { // L: 7948
								if (rootWidgetXs[var17] + rootWidgetWidths[var17] > var8 && rootWidgetXs[var17] < var10 + var8 && rootWidgetHeights[var17] + rootWidgetYs[var17] > var19 && rootWidgetYs[var17] < var11 + var19) { // L: 7949
									field825[var17] = true;
								}
							}
						}
					} else {
						var2 = AttackOption.method2285(); // L: 7955
						if ((var1 == 1 || !class229.mouseCam && var1 == 4) && var2 >= 0) { // L: 7956
							var3 = menuOpcodes[var2]; // L: 7957
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 7958
								var4 = menuArguments1[var2]; // L: 7959
								var5 = menuArguments2[var2]; // L: 7960
								Widget var6 = DevicePcmPlayerProvider.getWidget(var5); // L: 7961
								var8 = class26.getWidgetFlags(var6); // L: 7963
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 7965
								if (var7) { // L: 7968
									break label262;
								}

								var10 = class26.getWidgetFlags(var6); // L: 7970
								boolean var9 = (var10 >> 29 & 1) != 0; // L: 7972
								if (var9) { // L: 7974
									break label262;
								}
							}
						}

						if ((var1 == 1 || !class229.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 7994 7995
							var1 = 2; // L: 7996
						}

						if ((var1 == 1 || !class229.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 7999 8001
							var3 = menuArguments1[var2]; // L: 8002
							var4 = menuArguments2[var2]; // L: 8003
							var5 = menuOpcodes[var2]; // L: 8004
							var14 = menuIdentifiers[var2]; // L: 8005
							String var15 = menuActions[var2]; // L: 8006
							String var16 = menuTargets[var2]; // L: 8007
							HorizontalAlignment.menuAction(var3, var4, var5, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8008
						}

						if (var1 == 2 && menuOptionsCount > 0) { // L: 8011
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 8013
				}

				if (class34.dragInventoryWidget != null && !field728 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 7976 7977
					ItemLayer.method3715(draggedWidgetX, draggedWidgetY); // L: 7978
				}

				field728 = false; // L: 7981
				itemDragDuration = 0; // L: 7982
				if (class34.dragInventoryWidget != null) { // L: 7983
					VerticalAlignment.invalidateWidget(class34.dragInventoryWidget);
				}

				class34.dragInventoryWidget = DevicePcmPlayerProvider.getWidget(var5); // L: 7984
				dragItemSlotSource = var4; // L: 7985
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 7986
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 7987
				if (var2 >= 0) { // L: 7988
					GrandExchangeOfferAgeComparator.method4989(var2);
				}

				VerticalAlignment.invalidateWidget(class34.dragInventoryWidget); // L: 7989
			}
		}
	} // L: 7990

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = AttackOption.method2285(); // L: 8016
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || LoginPacket.method4319(var1)) && !menuShiftClick[var1]; // L: 8017
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		WorldMapRegion.method3317(var1, var2); // L: 8021
		class5.scene.menuOpen(ParamComposition.Client_plane, var1, var2, false); // L: 8022
		isMenuOpen = true; // L: 8023
	} // L: 8024

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		Strings.method4801(rootInterface, GameEngine.canvasWidth, HealthBarDefinition.canvasHeight, var1); // L: 10021
	} // L: 10022

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "724279909"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : DevicePcmPlayerProvider.getWidget(var1.parentId); // L: 10025
		int var3;
		int var4;
		if (var2 == null) { // L: 10028
			var3 = GameEngine.canvasWidth; // L: 10029
			var4 = HealthBarDefinition.canvasHeight; // L: 10030
		} else {
			var3 = var2.width; // L: 10033
			var4 = var2.height; // L: 10034
		}

		class17.alignWidgetSize(var1, var3, var4, false); // L: 10036
		UserComparator3.alignWidgetPosition(var1, var3, var4); // L: 10037
	} // L: 10038

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1158614340"
	)
	final void method1236() {
		VerticalAlignment.invalidateWidget(clickedWidget); // L: 10990
		++class288.widgetDragDuration; // L: 10991
		if (field797 && field794) { // L: 10992
			int var1 = MouseHandler.MouseHandler_x; // L: 10998
			int var2 = MouseHandler.MouseHandler_y; // L: 10999
			var1 -= widgetClickX; // L: 11000
			var2 -= widgetClickY; // L: 11001
			if (var1 < field795) { // L: 11002
				var1 = field795;
			}

			if (var1 + clickedWidget.width > field795 + clickedWidgetParent.width) { // L: 11003
				var1 = field795 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field785) { // L: 11004
				var2 = field785;
			}

			if (var2 + clickedWidget.height > field785 + clickedWidgetParent.height) { // L: 11005
				var2 = field785 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field871; // L: 11006
			int var4 = var2 - field798; // L: 11007
			int var5 = clickedWidget.dragZoneSize; // L: 11008
			if (class288.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11009 11010
				isDraggingWidget = true; // L: 11011
			}

			int var6 = var1 - field795 + clickedWidgetParent.scrollX; // L: 11014
			int var7 = var2 - field785 + clickedWidgetParent.scrollY; // L: 11015
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11016
				var8 = new ScriptEvent(); // L: 11017
				var8.widget = clickedWidget; // L: 11018
				var8.mouseX = var6; // L: 11019
				var8.mouseY = var7; // L: 11020
				var8.args = clickedWidget.onDrag; // L: 11021
				class259.runScriptEvent(var8); // L: 11022
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11024
				if (isDraggingWidget) { // L: 11025
					if (clickedWidget.onDragComplete != null) { // L: 11026
						var8 = new ScriptEvent(); // L: 11027
						var8.widget = clickedWidget; // L: 11028
						var8.mouseX = var6; // L: 11029
						var8.mouseY = var7; // L: 11030
						var8.dragTarget = draggedOnWidget; // L: 11031
						var8.args = clickedWidget.onDragComplete; // L: 11032
						class259.runScriptEvent(var8); // L: 11033
					}

					if (draggedOnWidget != null && HorizontalAlignment.method2731(clickedWidget) != null) { // L: 11035
						PacketBufferNode var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2568, packetWriter.isaacCipher); // L: 11037
						var9.packetBuffer.method6493(draggedOnWidget.id); // L: 11038
						var9.packetBuffer.method6484(clickedWidget.itemId); // L: 11039
						var9.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 11040
						var9.packetBuffer.writeInt(clickedWidget.id); // L: 11041
						var9.packetBuffer.writeShort(draggedOnWidget.itemId); // L: 11042
						var9.packetBuffer.method6484(clickedWidget.childIndex); // L: 11043
						packetWriter.addNode(var9); // L: 11044
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11048
					this.openMenu(field871 + widgetClickX, widgetClickY + field798); // L: 11049
				} else if (menuOptionsCount > 0) { // L: 11051
					ItemLayer.method3715(field871 + widgetClickX, widgetClickY + field798); // L: 11052
				}

				clickedWidget = null; // L: 11055
			}

		} else {
			if (class288.widgetDragDuration > 1) { // L: 10993
				clickedWidget = null; // L: 10994
			}

		}
	} // L: 10996 11057

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(B)Lla;",
		garbageValue = "98"
	)
	@Export("username")
	public Username username() {
		return class35.localPlayer != null ? class35.localPlayer.username : null; // L: 11732
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-101"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != gameState) { // L: 1753
			if (gameState == 0) { // L: 1754
				class303.client.method548();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1755
				loginState = 0; // L: 1756
				field649 = 0; // L: 1757
				field749 = 0; // L: 1758
				timer.method5465(var0); // L: 1759
				if (var0 != 20) { // L: 1760
					HealthBarUpdate.method2204(false);
				}
			}

			if (var0 != 20 && var0 != 40 && TriBool.field3866 != null) { // L: 1762 1763
				TriBool.field3866.close(); // L: 1764
				TriBool.field3866 = null; // L: 1765
			}

			if (gameState == 25) { // L: 1768
				field790 = 0; // L: 1769
				field669 = 0; // L: 1770
				field670 = 1; // L: 1771
				field671 = 0; // L: 1772
				field672 = 1; // L: 1773
			}

			if (var0 != 5 && var0 != 10) { // L: 1775
				if (var0 == 20) { // L: 1778
					class169.method3494(PendingSpawn.archive10, class43.archive8, true, gameState == 11 ? 4 : 0); // L: 1779
				} else if (var0 == 11) { // L: 1781
					class169.method3494(PendingSpawn.archive10, class43.archive8, false, 4); // L: 1782
				} else if (Login.clearLoginScreen) { // L: 1785
					ItemContainer.titleboxSprite = null; // L: 1786
					Login.titlebuttonSprite = null; // L: 1787
					Login.runesSprite = null; // L: 1788
					Canvas.leftTitleSprite = null; // L: 1789
					class12.rightTitleSprite = null; // L: 1790
					FontName.logoSprite = null; // L: 1791
					FontName.title_muteSprite = null; // L: 1792
					GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite = null; // L: 1793
					GrandExchangeEvent.options_buttons_2Sprite = null; // L: 1794
					Login.worldSelectBackSprites = null; // L: 1795
					UserComparator5.worldSelectFlagSprites = null; // L: 1796
					Login.worldSelectArrows = null; // L: 1797
					AbstractWorldMapIcon.worldSelectStars = null; // L: 1798
					class288.field3691 = null; // L: 1799
					AttackOption.loginScreenRunesAnimation.method2207(); // L: 1800
					class390.method6744(2); // L: 1801
					if (NetCache.NetCache_socket != null) { // L: 1803
						try {
							Buffer var1 = new Buffer(4); // L: 1805
							var1.writeByte(2); // L: 1806
							var1.writeMedium(0); // L: 1807
							NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 1808
						} catch (IOException var4) {
							try {
								NetCache.NetCache_socket.close(); // L: 1812
							} catch (Exception var3) { // L: 1814
							}

							++NetCache.NetCache_ioExceptions; // L: 1815
							NetCache.NetCache_socket = null; // L: 1816
						}
					}

					Login.clearLoginScreen = false; // L: 1819
				}
			} else {
				class169.method3494(PendingSpawn.archive10, class43.archive8, true, 0); // L: 1776
			}

			gameState = var0; // L: 1821
		}
	} // L: 1822
}
