import com.jagex.oldscape.pub.OAuthTokens;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
public final class Client extends GameEngine implements Usernamed, OAuthTokens {
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "[Ldm;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 1318637709
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -538262805
	)
	static int field678;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		longValue = 3974849306413912327L
	)
	static long field687;
	@ObfuscatedName("rg")
	static boolean field710;
	@ObfuscatedName("pf")
	static boolean[] field594;
	@ObfuscatedName("pc")
	static boolean[] field651;
	@ObfuscatedName("pn")
	static boolean[] field553;
	@ObfuscatedName("qe")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -1647730605
	)
	public static int field742;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qa")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pa")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -1255487241
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qq")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	static final ApproximateRouteStrategy field743;
	@ObfuscatedName("pt")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("su")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "[Lkh;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ug")
	static int[] field538;
	@ObfuscatedName("um")
	static int[] field748;
	@ObfuscatedName("sc")
	static boolean[] field718;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 211285431
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("sr")
	static int[] field719;
	@ObfuscatedName("sq")
	static int[] field598;
	@ObfuscatedName("so")
	static int[] field721;
	@ObfuscatedName("sh")
	static int[] field722;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -595533075
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = 2048545999
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 1780596505
	)
	static int field737;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "[Lea;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 2141771055
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1984953373
	)
	static int field581;
	@ObfuscatedName("uj")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1418203349
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1404229279
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1629793717
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("se")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sv")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sa")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "[Lat;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("sy")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qn")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -136098309
	)
	static int field701;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1315900691
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		longValue = 6414008887290405915L
	)
	static long field565;
	@ObfuscatedName("sw")
	static short field464;
	@ObfuscatedName("st")
	static short field550;
	@ObfuscatedName("to")
	static short field729;
	@ObfuscatedName("th")
	static short field730;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ti")
	static short field600;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -1202743261
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 1171128355
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tf")
	static short field727;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = -1988115801
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("rh")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rk")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -943486725
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 452108079
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 1749362703
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("tx")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("tn")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 1275977781
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = 1680846629
	)
	static int field745;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -1572669425
	)
	static int field695;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1785278473
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("qy")
	static int[] field697;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static NodeDeque field674;
	@ObfuscatedName("qp")
	static int[] field696;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static NodeDeque field675;
	@ObfuscatedName("qg")
	static int[] field689;
	@ObfuscatedName("qd")
	static String field692;
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfq;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ay")
	static boolean field497;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 351012489
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2034448565
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1913834087
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bs")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bh")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -168480125
	)
	static int field467;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1336183037
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1541445221
	)
	static int field469;
	@ObfuscatedName("bz")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 235091161
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cm")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1803490967
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		longValue = 4321776978045133027L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1993769567
	)
	static int field475;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1440855955
	)
	static int field476;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		longValue = -3998157933727729695L
	)
	static long field477;
	@ObfuscatedName("dw")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dn")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 524609557
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 207642979
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 704173975
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1671516751
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1956341453
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 747205027
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 825806311
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1204566063
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1072899901
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 974303941
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1817594467
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 622774087
	)
	static int field572;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 1010630599
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1726990903
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -957566801
	)
	static int field496;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -549727883
	)
	static int field685;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 921847519
	)
	static int field498;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	static class112 field693;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static class404 field500;
	@ObfuscatedName("fc")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fx")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "[Lcp;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1362315605
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("go")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -2135073429
	)
	static int field512;
	@ObfuscatedName("gn")
	static int[] field513;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 225699983
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ga")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gs")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gz")
	static boolean field619;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ge")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 2056665983
	)
	static int field521;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 25303697
	)
	static int field522;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 363989163
	)
	static int field523;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = -313172501
	)
	static int field524;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = 132761911
	)
	static int field485;
	@ObfuscatedName("hr")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("hp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("hg")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hc")
	static final int[] field530;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 1163249681
	)
	static int field531;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -2143676759
	)
	static int field628;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 170443145
	)
	static int field534;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -125520475
	)
	static int field535;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1324928345
	)
	static int field506;
	@ObfuscatedName("im")
	static boolean field465;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1325089479
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -613321371
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -999156139
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -567570165
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 503166845
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1038338863
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 851159249
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 682763337
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -953648473
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1959842021
	)
	static int field547;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -612526431
	)
	static int field520;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 1932679935
	)
	static int field549;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -567507933
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 2001475371
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -2052313535
	)
	static int field552;
	@ObfuscatedName("js")
	static boolean field511;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1449900521
	)
	static int field620;
	@ObfuscatedName("jg")
	static boolean field555;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1902791501
	)
	static int field556;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -384375877
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -367077625
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("jd")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("jo")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("jq")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ja")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("jr")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ju")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jb")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jc")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kg")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -538809643
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1177959045
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -1589309887
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -1580074049
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -1310849273
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1284537869
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -776648095
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kr")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1997052949
	)
	static int field576;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -1194890067
	)
	static int field577;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -1781843123
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1331142965
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -115957737
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 445396889
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kz")
	static boolean field667;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 2009355879
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -839662267
	)
	static int field539;
	@ObfuscatedName("kn")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lcx;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -296903929
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1537694345
	)
	static int field588;
	@ObfuscatedName("ls")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 484882315
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1643293445
	)
	static int field591;
	@ObfuscatedName("lx")
	static int[] field592;
	@ObfuscatedName("ln")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("lo")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("lu")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("lh")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 398938707
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "[[[Lkn;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("lz")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("lv")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lw")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -195460363
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("la")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -2068095649
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mw")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("me")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mb")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mr")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mq")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ms")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mo")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mc")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("md")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("ml")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mf")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -96034183
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 501918403
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1898641855
	)
	static int field621;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 786548003
	)
	static int field714;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1422128073
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nh")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 124054907
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 1744337675
	)
	static int field627;
	@ObfuscatedName("nj")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("np")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 562838955
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -1369344199
	)
	static int field479;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 467301507
	)
	static int field633;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1388268323
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -1981485819
	)
	static int field656;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -1598051109
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = 878706649
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -755396483
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 1189338431
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("no")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 641959691
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 902517461
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("oo")
	static boolean field648;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 1606030359
	)
	static int field649;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1355964353
	)
	static int field650;
	@ObfuscatedName("oi")
	static boolean field680;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -30477907
	)
	static int field652;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1581362061
	)
	static int field468;
	@ObfuscatedName("op")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 105350317
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("ov")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -346434099
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("od")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -1624807725
	)
	static int field659;
	@ObfuscatedName("oe")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 936825
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("ou")
	static int[] field662;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 101503795
	)
	static int field663;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 550781787
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 651234723
	)
	static int field679;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1548223605
	)
	static int field666;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -1373827689
	)
	static int field681;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 2096555667
	)
	static int field724;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -1852458019
	)
	static int field536;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -789131501
	)
	static int field670;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 863379247
	)
	static int field494;
	@ObfuscatedName("ft")
	String field501;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	class14 field491;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	class19 field537;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	Buffer field579;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	class7 field507;

	static {
		field497 = true; // L: 133
		worldId = 1; // L: 134
		worldProperties = 0; // L: 135
		gameBuild = 0; // L: 137
		isMembersWorld = false; // L: 140
		isLowDetail = false; // L: 141
		field467 = -1; // L: 146
		clientType = -1; // L: 147
		field469 = -1; // L: 148
		onMobile = false; // L: 149
		gameState = 0; // L: 160
		isLoading = true; // L: 182
		cycle = 0; // L: 183
		mouseLastLastPressedTimeMillis = -1L; // L: 184
		field475 = -1; // L: 186
		field476 = -1; // L: 187
		field477 = -1L; // L: 188
		hadFocus = true; // L: 189
		displayFps = false; // L: 190
		rebootTimer = 0; // L: 191
		hintArrowType = 0; // L: 192
		hintArrowNpcIndex = 0; // L: 193
		hintArrowPlayerIndex = 0; // L: 194
		hintArrowX = 0; // L: 195
		hintArrowY = 0; // L: 196
		hintArrowHeight = 0; // L: 197
		hintArrowSubX = 0; // L: 198
		hintArrowSubY = 0; // L: 199
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 201
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 202
		titleLoadingStage = 0; // L: 205
		js5ConnectState = 0; // L: 208
		field572 = 0; // L: 209
		js5Errors = 0; // L: 231
		loginState = 0; // L: 233
		field496 = 0; // L: 234
		field685 = 0; // L: 235
		field498 = 0; // L: 236
		field693 = class112.field1346; // L: 237
		field500 = class404.field4351; // L: 238
		Login_isUsernameRemembered = false; // L: 255
		secureRandomFuture = new SecureRandomFuture(); // L: 256
		randomDatData = null; // L: 261
		npcs = new NPC[32768]; // L: 265
		npcCount = 0; // L: 266
		npcIndices = new int[32768]; // L: 267
		field512 = 0; // L: 268
		field513 = new int[250]; // L: 269
		packetWriter = new PacketWriter(); // L: 272
		logoutTimer = 0; // L: 274
		hadNetworkError = false; // L: 275
		useBufferedSocket = true; // L: 276
		field619 = false; // L: 277
		timer = new Timer(); // L: 278
		fontsMap = new HashMap(); // L: 284
		field521 = 0; // L: 291
		field522 = 1; // L: 292
		field523 = 0; // L: 293
		field524 = 1; // L: 294
		field485 = 0; // L: 295
		collisionMaps = new CollisionMap[4]; // L: 303
		isInInstance = false; // L: 304
		instanceChunkTemplates = new int[4][13][13]; // L: 305
		field530 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 306
		field531 = 0; // L: 309
		field628 = 2301979; // L: 321
		field534 = 5063219; // L: 322
		field535 = 3353893; // L: 323
		field506 = 7759444; // L: 324
		field465 = false; // L: 325
		alternativeScrollbarWidth = 0; // L: 326
		camAngleX = 128; // L: 334
		camAngleY = 0; // L: 335
		camAngleDY = 0; // L: 336
		camAngleDX = 0; // L: 337
		mouseCamClickedX = 0; // L: 338
		mouseCamClickedY = 0; // L: 339
		oculusOrbState = 0; // L: 340
		camFollowHeight = 50; // L: 341
		field547 = 0; // L: 345
		field520 = 0; // L: 346
		field549 = 0; // L: 347
		oculusOrbNormalSpeed = 12; // L: 349
		oculusOrbSlowedSpeed = 6; // L: 350
		field552 = 0; // L: 351
		field511 = false; // L: 352
		field620 = 0; // L: 353
		field555 = false; // L: 354
		field556 = 0; // L: 355
		overheadTextCount = 0; // L: 356
		overheadTextLimit = 50; // L: 357
		overheadTextXs = new int[overheadTextLimit]; // L: 358
		overheadTextYs = new int[overheadTextLimit]; // L: 359
		overheadTextAscents = new int[overheadTextLimit]; // L: 360
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 361
		overheadTextColors = new int[overheadTextLimit]; // L: 362
		overheadTextEffects = new int[overheadTextLimit]; // L: 363
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 364
		overheadText = new String[overheadTextLimit]; // L: 365
		tileLastDrawnActor = new int[104][104]; // L: 366
		viewportDrawCount = 0; // L: 367
		viewportTempX = -1; // L: 368
		viewportTempY = -1; // L: 369
		mouseCrossX = 0; // L: 370
		mouseCrossY = 0; // L: 371
		mouseCrossState = 0; // L: 372
		mouseCrossColor = 0; // L: 373
		showMouseCross = true; // L: 374
		field576 = 0; // L: 376
		field577 = 0; // L: 377
		dragItemSlotSource = 0; // L: 380
		draggedWidgetX = 0; // L: 381
		draggedWidgetY = 0; // L: 382
		dragItemSlotDestination = 0; // L: 383
		field667 = false; // L: 384
		itemDragDuration = 0; // L: 385
		field539 = 0; // L: 386
		showLoadingMessages = true; // L: 388
		players = new Player[2048]; // L: 390
		localPlayerIndex = -1; // L: 392
		field588 = 0; // L: 393
		renderSelf = true; // L: 395
		drawPlayerNames = 0; // L: 400
		field591 = 0; // L: 401
		field592 = new int[1000]; // L: 402
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 404
		playerMenuActions = new String[8]; // L: 405
		playerOptionsPriorities = new boolean[8]; // L: 406
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 407
		combatTargetPlayerIndex = -1; // L: 408
		groundItems = new NodeDeque[4][104][104]; // L: 409
		pendingSpawns = new NodeDeque(); // L: 410
		projectiles = new NodeDeque(); // L: 411
		graphicsObjects = new NodeDeque(); // L: 412
		currentLevels = new int[25]; // L: 413
		levels = new int[25]; // L: 414
		experience = new int[25]; // L: 415
		leftClickOpensMenu = 0; // L: 416
		isMenuOpen = false; // L: 417
		menuOptionsCount = 0; // L: 423
		menuArguments1 = new int[500]; // L: 424
		menuArguments2 = new int[500]; // L: 425
		menuOpcodes = new int[500]; // L: 426
		menuIdentifiers = new int[500]; // L: 427
		menuActions = new String[500]; // L: 428
		menuTargets = new String[500]; // L: 429
		menuShiftClick = new boolean[500]; // L: 430
		followerOpsLowPriority = false; // L: 431
		shiftClickDrop = false; // L: 433
		tapToDrop = false; // L: 434
		showMouseOverText = true; // L: 435
		viewportX = -1; // L: 436
		viewportY = -1; // L: 437
		field621 = 0; // L: 441
		field714 = 50; // L: 442
		isItemSelected = 0; // L: 443
		selectedItemName = null; // L: 447
		isSpellSelected = false; // L: 448
		selectedSpellChildIndex = -1; // L: 450
		field627 = -1; // L: 451
		selectedSpellActionName = null; // L: 453
		selectedSpellName = null; // L: 454
		rootInterface = -1; // L: 455
		interfaceParents = new NodeHashTable(8); // L: 456
		field479 = 0; // L: 461
		field633 = -1; // L: 462
		chatEffects = 0; // L: 463
		field656 = 0; // L: 464
		meslayerContinueWidget = null; // L: 465
		runEnergy = 0; // L: 466
		weight = 0; // L: 467
		staffModLevel = 0; // L: 468
		followerIndex = -1; // L: 469
		playerMod = false; // L: 470
		viewportWidget = null; // L: 471
		clickedWidget = null; // L: 472
		clickedWidgetParent = null; // L: 473
		widgetClickX = 0; // L: 474
		widgetClickY = 0; // L: 475
		draggedOnWidget = null; // L: 476
		field648 = false; // L: 477
		field649 = -1; // L: 478
		field650 = -1; // L: 479
		field680 = false; // L: 480
		field652 = -1; // L: 481
		field468 = -1; // L: 482
		isDraggingWidget = false; // L: 483
		cycleCntr = 1; // L: 488
		changedVarps = new int[32]; // L: 491
		changedVarpCount = 0; // L: 492
		changedItemContainers = new int[32]; // L: 493
		field659 = 0; // L: 494
		changedSkills = new int[32]; // L: 495
		changedSkillsCount = 0; // L: 496
		field662 = new int[32]; // L: 497
		field663 = 0; // L: 498
		chatCycle = 0; // L: 499
		field679 = 0; // L: 500
		field666 = 0; // L: 501
		field681 = 0; // L: 502
		field724 = 0; // L: 503
		field536 = 0; // L: 504
		field670 = 0; // L: 505
		field494 = 0; // L: 506
		mouseWheelRotation = 0; // L: 512
		scriptEvents = new NodeDeque(); // L: 513
		field674 = new NodeDeque(); // L: 514
		field675 = new NodeDeque(); // L: 515
		widgetFlags = new NodeHashTable(512); // L: 516
		rootWidgetCount = 0; // L: 518
		field678 = -2; // L: 519
		field594 = new boolean[100]; // L: 520
		field553 = new boolean[100]; // L: 521
		field651 = new boolean[100]; // L: 522
		rootWidgetXs = new int[100]; // L: 523
		rootWidgetYs = new int[100]; // L: 524
		rootWidgetWidths = new int[100]; // L: 525
		rootWidgetHeights = new int[100]; // L: 526
		gameDrawingMode = 0; // L: 527
		field687 = 0L; // L: 528
		isResizable = true; // L: 529
		field689 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 536
		publicChatMode = 0; // L: 537
		tradeChatMode = 0; // L: 539
		field692 = ""; // L: 540
		crossWorldMessageIds = new long[100]; // L: 542
		crossWorldMessageIdsIndex = 0; // L: 543
		field695 = 0; // L: 545
		field696 = new int[128]; // L: 546
		field697 = new int[128]; // L: 547
		field565 = -1L; // L: 548
		currentClanSettings = new ClanSettings[2]; // L: 552
		currentClanChannels = new ClanChannel[2]; // L: 554
		field701 = -1; // L: 556
		mapIconCount = 0; // L: 557
		mapIconXs = new int[1000]; // L: 558
		mapIconYs = new int[1000]; // L: 559
		mapIcons = new SpritePixels[1000]; // L: 560
		destinationX = 0; // L: 561
		destinationY = 0; // L: 562
		minimapState = 0; // L: 569
		currentTrackGroupId = -1; // L: 570
		field710 = false; // L: 571
		soundEffectCount = 0; // L: 577
		soundEffectIds = new int[50]; // L: 578
		queuedSoundEffectLoops = new int[50]; // L: 579
		queuedSoundEffectDelays = new int[50]; // L: 580
		soundLocations = new int[50]; // L: 581
		soundEffects = new SoundEffect[50]; // L: 582
		isCameraLocked = false; // L: 584
		field718 = new boolean[5]; // L: 596
		field719 = new int[5]; // L: 597
		field598 = new int[5]; // L: 598
		field721 = new int[5]; // L: 599
		field722 = new int[5]; // L: 600
		field464 = 256; // L: 601
		field550 = 205; // L: 602
		zoomHeight = 256; // L: 603
		zoomWidth = 320; // L: 604
		field727 = 1; // L: 605
		field600 = 32767; // L: 606
		field729 = 1; // L: 607
		field730 = 32767; // L: 608
		viewportOffsetX = 0; // L: 609
		viewportOffsetY = 0; // L: 610
		viewportWidth = 0; // L: 611
		viewportHeight = 0; // L: 612
		viewportZoom = 0; // L: 613
		playerAppearance = new PlayerComposition(); // L: 615
		field737 = -1; // L: 616
		field581 = -1; // L: 617
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 619
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 621
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 624
		field742 = -1; // L: 631
		archiveLoaders = new ArrayList(10); // L: 632
		archiveLoadersDone = 0; // L: 633
		field745 = 0; // L: 634
		field743 = new ApproximateRouteStrategy(); // L: 643
		field538 = new int[50]; // L: 644
		field748 = new int[50]; // L: 645
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1701018417"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field687 = class111.method2516() + 500L; // L: 4578
		this.resizeJS(); // L: 4579
		if (rootInterface != -1) { // L: 4580
			this.resizeRoot(true);
		}

	} // L: 4581

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2071280922"
	)
	@Export("setUp")
	protected final void setUp() {
		ItemComposition.method3408(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 794
		ApproximateRouteStrategy.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 795
		ParamComposition.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 796
		ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort; // L: 797
		DesktopPlatformInfoProvider.field4081 = class260.field3035; // L: 798
		class137.field1519 = class260.field3039; // L: 799
		Varps.field3013 = class260.field3036; // L: 800
		ClanChannel.field1512 = class260.field3037; // L: 801
		class320.urlRequester = new UrlRequester(); // L: 802
		this.setUpKeyboard(); // L: 803
		this.method440(); // L: 804
		MouseHandler.mouseWheel = this.mouseWheel(); // L: 805
		WorldMapArea.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 806
		AccessFile var2 = null; // L: 809
		ClientPreferences var3 = new ClientPreferences(); // L: 810

		try {
			var2 = DevicePcmPlayerProvider.getPreferencesFile("", RouteStrategy.field1986.name, false); // L: 812
			byte[] var4 = new byte[(int)var2.length()]; // L: 813

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 814 815 818
				var6 = var2.read(var4, var5, var4.length - var5); // L: 816
				if (var6 == -1) { // L: 817
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 820
		} catch (Exception var8) { // L: 822
		}

		try {
			if (var2 != null) { // L: 824
				var2.close();
			}
		} catch (Exception var7) { // L: 826
		}

		class408.clientPreferences = var3; // L: 829
		this.setUpClipboard(); // L: 830
		GrandExchangeOfferWorldComparator.method5440(this, VarcInt.field1645); // L: 831
		if (gameBuild != 0) { // L: 832
			displayFps = true;
		}

		HorizontalAlignment.setWindowedMode(class408.clientPreferences.windowMode); // L: 833
		class112.friendSystem = new FriendSystem(GrandExchangeOfferUnitPriceComparator.loginType); // L: 834
		this.field491 = new class14("tokenRequest", 1, 1); // L: 835
	} // L: 836

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "466223513"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 839
		this.doCycleJs5(); // L: 840
		Coord.method5011(); // L: 841
		class131.method2753(); // L: 842
		class14.playPcmPlayers(); // L: 843
		int var2;
		synchronized(KeyHandler.KeyHandler_instance) { // L: 845
			++KeyHandler.KeyHandler_idleCycles; // L: 846
			KeyHandler.field107 = KeyHandler.field131; // L: 847
			KeyHandler.field110 = 0; // L: 848
			KeyHandler.field135 = 0; // L: 849
			Arrays.fill(KeyHandler.field118, false); // L: 850
			Arrays.fill(KeyHandler.field119, false); // L: 851
			if (KeyHandler.field122 < 0) { // L: 852
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 853
				KeyHandler.field122 = KeyHandler.field133; // L: 854
			} else {
				while (KeyHandler.field133 != KeyHandler.field122) { // L: 857
					var2 = KeyHandler.field120[KeyHandler.field133]; // L: 858
					KeyHandler.field133 = KeyHandler.field133 + 1 & 127; // L: 859
					if (var2 < 0) { // L: 860
						var2 = ~var2; // L: 861
						if (KeyHandler.KeyHandler_pressedKeys[var2]) { // L: 862
							KeyHandler.KeyHandler_pressedKeys[var2] = false; // L: 863
							KeyHandler.field119[var2] = true; // L: 864
							KeyHandler.field127[KeyHandler.field135] = var2; // L: 865
							++KeyHandler.field135; // L: 866
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field110 < KeyHandler.field125.length - 1) { // L: 870
							KeyHandler.field118[var2] = true; // L: 871
							KeyHandler.field125[++KeyHandler.field110 - 1] = var2; // L: 872
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true; // L: 874
					}
				}
			}

			if (KeyHandler.field110 > 0) { // L: 878
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field131 = KeyHandler.field130; // L: 879
		}

		ModeWhere.method5542(); // L: 882
		int var45;
		if (MouseHandler.mouseWheel != null) { // L: 883
			var45 = MouseHandler.mouseWheel.useRotation(); // L: 884
			mouseWheelRotation = var45; // L: 885
		}

		if (gameState == 0) { // L: 887
			NetSocket.load(); // L: 888
			Clock.clock.mark(); // L: 890

			for (var45 = 0; var45 < 32; ++var45) { // L: 891
				GameEngine.graphicsTickTimes[var45] = 0L;
			}

			for (var45 = 0; var45 < 32; ++var45) { // L: 892
				GameEngine.clientTickTimes[var45] = 0L;
			}

			class1.gameCyclesToDo = 0; // L: 893
		} else if (gameState == 5) { // L: 896
			class272.method5197(this, class6.fontPlain12); // L: 897
			NetSocket.load(); // L: 898
			Clock.clock.mark(); // L: 900

			for (var45 = 0; var45 < 32; ++var45) { // L: 901
				GameEngine.graphicsTickTimes[var45] = 0L;
			}

			for (var45 = 0; var45 < 32; ++var45) { // L: 902
				GameEngine.clientTickTimes[var45] = 0L;
			}

			class1.gameCyclesToDo = 0; // L: 903
		} else if (gameState != 10 && gameState != 11) { // L: 906
			if (gameState == 20) { // L: 907
				class272.method5197(this, class6.fontPlain12); // L: 908
				this.doCycleLoggedOut(); // L: 909
			} else if (gameState == 25) { // L: 911
				MenuAction.method1912(false); // L: 912
				field521 = 0; // L: 913
				boolean var70 = true; // L: 914

				for (var2 = 0; var2 < ModeWhere.regionLandArchives.length; ++var2) { // L: 915
					if (class119.regionMapArchiveIds[var2] != -1 && ModeWhere.regionLandArchives[var2] == null) { // L: 916 917
						ModeWhere.regionLandArchives[var2] = class11.archive5.takeFile(class119.regionMapArchiveIds[var2], 0); // L: 918
						if (ModeWhere.regionLandArchives[var2] == null) { // L: 919
							var70 = false; // L: 920
							++field521; // L: 921
						}
					}

					if (class21.regionLandArchiveIds[var2] != -1 && class184.regionMapArchives[var2] == null) { // L: 925 926
						class184.regionMapArchives[var2] = class11.archive5.takeFileEncrypted(class21.regionLandArchiveIds[var2], 0, xteaKeys[var2]); // L: 927
						if (class184.regionMapArchives[var2] == null) { // L: 928
							var70 = false; // L: 929
							++field521; // L: 930
						}
					}
				}

				if (!var70) { // L: 935
					field485 = 1; // L: 936
				} else {
					field523 = 0; // L: 939
					var70 = true; // L: 940

					int var4;
					int var5;
					for (var2 = 0; var2 < ModeWhere.regionLandArchives.length; ++var2) { // L: 941
						byte[] var3 = class184.regionMapArchives[var2]; // L: 942
						if (var3 != null) { // L: 943
							var4 = (LoginScreenAnimation.regions[var2] >> 8) * 64 - class19.baseX; // L: 944
							var5 = (LoginScreenAnimation.regions[var2] & 255) * 64 - DefaultsGroup.baseY; // L: 945
							if (isInInstance) { // L: 946
								var4 = 10; // L: 947
								var5 = 10; // L: 948
							}

							var70 &= class9.method69(var3, var4, var5); // L: 950
						}
					}

					if (!var70) { // L: 953
						field485 = 2; // L: 954
					} else {
						if (field485 != 0) { // L: 957
							class91.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						class14.playPcmPlayers(); // L: 958
						GameBuild.scene.clear(); // L: 959

						for (var2 = 0; var2 < 4; ++var2) { // L: 960
							collisionMaps[var2].clear();
						}

						int var46;
						for (var2 = 0; var2 < 4; ++var2) { // L: 961
							for (var46 = 0; var46 < 104; ++var46) { // L: 962
								for (var4 = 0; var4 < 104; ++var4) { // L: 963
									Tiles.Tiles_renderFlags[var2][var46][var4] = 0; // L: 964
								}
							}
						}

						class14.playPcmPlayers(); // L: 968
						Tiles.Tiles_minPlane = 99; // L: 970
						Tiles.Tiles_underlays = new byte[4][104][104]; // L: 971
						Tiles.Tiles_overlays = new byte[4][104][104]; // L: 972
						Tiles.Tiles_shapes = new byte[4][104][104]; // L: 973
						Tiles.field969 = new byte[4][104][104]; // L: 974
						Tiles.field962 = new int[4][105][105]; // L: 975
						class54.field419 = new byte[4][105][105]; // L: 976
						DirectByteArrayCopier.field3212 = new int[105][105]; // L: 977
						TileItem.Tiles_hue = new int[104]; // L: 978
						class397.Tiles_saturation = new int[104]; // L: 979
						Tiles.Tiles_lightness = new int[104]; // L: 980
						class1.Tiles_hueMultiplier = new int[104]; // L: 981
						MouseRecorder.field1039 = new int[104]; // L: 982
						var2 = ModeWhere.regionLandArchives.length; // L: 984

						for (ObjectSound var59 = (ObjectSound)ObjectSound.objectSounds.last(); var59 != null; var59 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 986
							if (var59.stream1 != null) { // L: 987
								BuddyRankComparator.pcmStreamMixer.removeSubStream(var59.stream1); // L: 988
								var59.stream1 = null; // L: 989
							}

							if (var59.stream2 != null) { // L: 991
								BuddyRankComparator.pcmStreamMixer.removeSubStream(var59.stream2); // L: 992
								var59.stream2 = null; // L: 993
							}
						}

						ObjectSound.objectSounds.clear(); // L: 996
						MenuAction.method1912(true); // L: 998
						int var48;
						if (!isInInstance) { // L: 999
							byte[] var6;
							for (var46 = 0; var46 < var2; ++var46) { // L: 1000
								var4 = (LoginScreenAnimation.regions[var46] >> 8) * 64 - class19.baseX; // L: 1001
								var5 = (LoginScreenAnimation.regions[var46] & 255) * 64 - DefaultsGroup.baseY; // L: 1002
								var6 = ModeWhere.regionLandArchives[var46]; // L: 1003
								if (var6 != null) { // L: 1004
									class14.playPcmPlayers(); // L: 1005
									FontName.method6688(var6, var4, var5, ItemLayer.field2243 * 8 - 48, WallDecoration.field2630 * 8 - 48, collisionMaps); // L: 1006
								}
							}

							for (var46 = 0; var46 < var2; ++var46) { // L: 1009
								var4 = (LoginScreenAnimation.regions[var46] >> 8) * 64 - class19.baseX; // L: 1010
								var5 = (LoginScreenAnimation.regions[var46] & 255) * 64 - DefaultsGroup.baseY; // L: 1011
								var6 = ModeWhere.regionLandArchives[var46]; // L: 1012
								if (var6 == null && WallDecoration.field2630 < 800) { // L: 1013
									class14.playPcmPlayers(); // L: 1014
									class247.method4751(var4, var5, 64, 64); // L: 1015
								}
							}

							MenuAction.method1912(true); // L: 1018

							for (var46 = 0; var46 < var2; ++var46) { // L: 1019
								byte[] var47 = class184.regionMapArchives[var46]; // L: 1020
								if (var47 != null) { // L: 1021
									var5 = (LoginScreenAnimation.regions[var46] >> 8) * 64 - class19.baseX; // L: 1022
									var48 = (LoginScreenAnimation.regions[var46] & 255) * 64 - DefaultsGroup.baseY; // L: 1023
									class14.playPcmPlayers(); // L: 1024
									PendingSpawn.method2162(var47, var5, var48, GameBuild.scene, collisionMaps); // L: 1025
								}
							}
						}

						int var7;
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
						int var21;
						int var22;
						int var23;
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
						if (isInInstance) { // L: 1029
							var46 = 0;

							label1259:
							while (true) {
								if (var46 >= 4) {
									for (var46 = 0; var46 < 13; ++var46) { // L: 1072
										for (var4 = 0; var4 < 13; ++var4) { // L: 1073
											var5 = instanceChunkTemplates[0][var46][var4]; // L: 1074
											if (var5 == -1) { // L: 1075
												class247.method4751(var46 * 8, var4 * 8, 8, 8); // L: 1076
											}
										}
									}

									MenuAction.method1912(true); // L: 1080
									var46 = 0;

									while (true) {
										if (var46 >= 4) {
											break label1259;
										}

										class14.playPcmPlayers(); // L: 1082

										for (var4 = 0; var4 < 13; ++var4) { // L: 1083
											label1182:
											for (var5 = 0; var5 < 13; ++var5) { // L: 1084
												var48 = instanceChunkTemplates[var46][var4][var5]; // L: 1085
												if (var48 != -1) { // L: 1086
													var7 = var48 >> 24 & 3; // L: 1087
													var8 = var48 >> 1 & 3; // L: 1088
													var9 = var48 >> 14 & 1023; // L: 1089
													var10 = var48 >> 3 & 2047; // L: 1090
													var11 = (var9 / 8 << 8) + var10 / 8; // L: 1091

													for (var12 = 0; var12 < LoginScreenAnimation.regions.length; ++var12) { // L: 1092
														if (LoginScreenAnimation.regions[var12] == var11 && class184.regionMapArchives[var12] != null) { // L: 1093
															byte[] var49 = class184.regionMapArchives[var12]; // L: 1094
															var14 = var4 * 8; // L: 1095
															var15 = var5 * 8; // L: 1096
															var16 = (var9 & 7) * 8; // L: 1097
															var17 = (var10 & 7) * 8; // L: 1098
															Scene var18 = GameBuild.scene; // L: 1099
															CollisionMap[] var19 = collisionMaps; // L: 1100
															Buffer var20 = new Buffer(var49); // L: 1102
															var21 = -1; // L: 1103

															while (true) {
																var22 = var20.method6981(); // L: 1105
																if (var22 == 0) { // L: 1106
																	continue label1182;
																}

																var21 += var22; // L: 1107
																var23 = 0; // L: 1108

																while (true) {
																	var24 = var20.readUShortSmart(); // L: 1110
																	if (var24 == 0) { // L: 1111
																		break;
																	}

																	var23 += var24 - 1; // L: 1112
																	var25 = var23 & 63; // L: 1113
																	var26 = var23 >> 6 & 63; // L: 1114
																	var27 = var23 >> 12; // L: 1115
																	var28 = var20.readUnsignedByte(); // L: 1116
																	var29 = var28 >> 2; // L: 1117
																	var30 = var28 & 3; // L: 1118
																	if (var27 == var7 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) { // L: 1119
																		ObjectComposition var31 = KitDefinition.getObjectDefinition(var21); // L: 1120
																		Object var10001 = null; // L: 1121
																		var32 = var14 + SoundSystem.method780(var26 & 7, var25 & 7, var8, var31.sizeX, var31.sizeY, var30);
																		var10001 = null; // L: 1122
																		var33 = var15 + WorldMapRectangle.method3960(var26 & 7, var25 & 7, var8, var31.sizeX, var31.sizeY, var30);
																		if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) { // L: 1123
																			var34 = var46; // L: 1124
																			if ((Tiles.Tiles_renderFlags[1][var32][var33] & 2) == 2) { // L: 1125
																				var34 = var46 - 1;
																			}

																			CollisionMap var35 = null; // L: 1126
																			if (var34 >= 0) { // L: 1127
																				var35 = var19[var34];
																			}

																			class92.method2276(var46, var32, var33, var21, var8 + var30 & 3, var29, var18, var35); // L: 1128
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var46; // L: 1081
									}
								}

								class14.playPcmPlayers(); // L: 1031

								for (var4 = 0; var4 < 13; ++var4) { // L: 1032
									for (var5 = 0; var5 < 13; ++var5) { // L: 1033
										boolean var71 = false; // L: 1034
										var7 = instanceChunkTemplates[var46][var4][var5]; // L: 1035
										if (var7 != -1) { // L: 1036
											var8 = var7 >> 24 & 3; // L: 1037
											var9 = var7 >> 1 & 3; // L: 1038
											var10 = var7 >> 14 & 1023; // L: 1039
											var11 = var7 >> 3 & 2047; // L: 1040
											var12 = (var10 / 8 << 8) + var11 / 8; // L: 1041

											for (var13 = 0; var13 < LoginScreenAnimation.regions.length; ++var13) { // L: 1042
												if (LoginScreenAnimation.regions[var13] == var12 && ModeWhere.regionLandArchives[var13] != null) { // L: 1043
													FloorOverlayDefinition.method3427(ModeWhere.regionLandArchives[var13], var46, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, collisionMaps); // L: 1044
													var71 = true; // L: 1045
													break; // L: 1046
												}
											}
										}

										if (!var71) { // L: 1050
											var8 = var46; // L: 1051
											var9 = var4 * 8; // L: 1052
											var10 = var5 * 8; // L: 1053

											for (var11 = 0; var11 < 8; ++var11) { // L: 1055
												for (var12 = 0; var12 < 8; ++var12) { // L: 1056
													Tiles.Tiles_heights[var8][var11 + var9][var10 + var12] = 0;
												}
											}

											if (var9 > 0) { // L: 1058
												for (var11 = 1; var11 < 8; ++var11) { // L: 1059
													Tiles.Tiles_heights[var8][var9][var10 + var11] = Tiles.Tiles_heights[var8][var9 - 1][var11 + var10];
												}
											}

											if (var10 > 0) { // L: 1061
												for (var11 = 1; var11 < 8; ++var11) { // L: 1062
													Tiles.Tiles_heights[var8][var9 + var11][var10] = Tiles.Tiles_heights[var8][var9 + var11][var10 - 1];
												}
											}

											if (var9 > 0 && Tiles.Tiles_heights[var8][var9 - 1][var10] != 0) { // L: 1064
												Tiles.Tiles_heights[var8][var9][var10] = Tiles.Tiles_heights[var8][var9 - 1][var10];
											} else if (var10 > 0 && Tiles.Tiles_heights[var8][var9][var10 - 1] != 0) { // L: 1065
												Tiles.Tiles_heights[var8][var9][var10] = Tiles.Tiles_heights[var8][var9][var10 - 1];
											} else if (var9 > 0 && var10 > 0 && Tiles.Tiles_heights[var8][var9 - 1][var10 - 1] != 0) { // L: 1066
												Tiles.Tiles_heights[var8][var9][var10] = Tiles.Tiles_heights[var8][var9 - 1][var10 - 1];
											}
										}
									}
								}

								++var46; // L: 1030
							}
						}

						MenuAction.method1912(true); // L: 1142
						class14.playPcmPlayers(); // L: 1143
						Scene var60 = GameBuild.scene; // L: 1144
						CollisionMap[] var69 = collisionMaps; // L: 1145

						for (var5 = 0; var5 < 4; ++var5) { // L: 1147
							for (var48 = 0; var48 < 104; ++var48) { // L: 1148
								for (var7 = 0; var7 < 104; ++var7) { // L: 1149
									if ((Tiles.Tiles_renderFlags[var5][var48][var7] & 1) == 1) { // L: 1150
										var8 = var5; // L: 1151
										if ((Tiles.Tiles_renderFlags[1][var48][var7] & 2) == 2) { // L: 1152
											var8 = var5 - 1;
										}

										if (var8 >= 0) { // L: 1153
											var69[var8].setBlockedByFloor(var48, var7);
										}
									}
								}
							}
						}

						Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 1158
						if (Tiles.rndHue < -8) { // L: 1159
							Tiles.rndHue = -8;
						}

						if (Tiles.rndHue > 8) { // L: 1160
							Tiles.rndHue = 8;
						}

						Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 1161
						if (Tiles.rndLightness < -16) { // L: 1162
							Tiles.rndLightness = -16;
						}

						if (Tiles.rndLightness > 16) { // L: 1163
							Tiles.rndLightness = 16;
						}

						int[] var10000;
						int var50;
						int var51;
						int var52;
						for (var5 = 0; var5 < 4; ++var5) { // L: 1164
							byte[][] var61 = class54.field419[var5]; // L: 1165
							var12 = (int)Math.sqrt(5100.0D); // L: 1171
							var13 = var12 * 768 >> 8; // L: 1172

							for (var14 = 1; var14 < 103; ++var14) { // L: 1173
								for (var15 = 1; var15 < 103; ++var15) { // L: 1174
									var16 = Tiles.Tiles_heights[var5][var15 + 1][var14] - Tiles.Tiles_heights[var5][var15 - 1][var14]; // L: 1175
									var17 = Tiles.Tiles_heights[var5][var15][var14 + 1] - Tiles.Tiles_heights[var5][var15][var14 - 1]; // L: 1176
									var50 = (int)Math.sqrt((double)(var16 * var16 + var17 * var17 + 65536)); // L: 1177
									var51 = (var16 << 8) / var50; // L: 1178
									var52 = 65536 / var50; // L: 1179
									var21 = (var17 << 8) / var50; // L: 1180
									var22 = (var51 * -50 + var21 * -50 + var52 * -10) / var13 + 96; // L: 1181
									var23 = (var61[var15][var14 + 1] >> 3) + (var61[var15 - 1][var14] >> 2) + (var61[var15][var14 - 1] >> 2) + (var61[var15 + 1][var14] >> 3) + (var61[var15][var14] >> 1); // L: 1182
									DirectByteArrayCopier.field3212[var15][var14] = var22 - var23; // L: 1183
								}
							}

							for (var14 = 0; var14 < 104; ++var14) { // L: 1186
								TileItem.Tiles_hue[var14] = 0; // L: 1187
								class397.Tiles_saturation[var14] = 0; // L: 1188
								Tiles.Tiles_lightness[var14] = 0; // L: 1189
								class1.Tiles_hueMultiplier[var14] = 0; // L: 1190
								MouseRecorder.field1039[var14] = 0; // L: 1191
							}

							for (var14 = -5; var14 < 109; ++var14) { // L: 1193
								for (var15 = 0; var15 < 104; ++var15) { // L: 1194
									var16 = var14 + 5; // L: 1195
									int var10002;
									if (var16 >= 0 && var16 < 104) { // L: 1196
										var17 = Tiles.Tiles_underlays[var5][var16][var15] & 255; // L: 1197
										if (var17 > 0) { // L: 1198
											var51 = var17 - 1; // L: 1200
											FloorUnderlayDefinition var67 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var51); // L: 1202
											FloorUnderlayDefinition var64;
											if (var67 != null) { // L: 1203
												var64 = var67; // L: 1204
											} else {
												byte[] var53 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var51); // L: 1207
												var67 = new FloorUnderlayDefinition(); // L: 1208
												if (var53 != null) { // L: 1209
													var67.decode(new Buffer(var53), var51);
												}

												var67.postDecode(); // L: 1210
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var67, (long)var51); // L: 1211
												var64 = var67; // L: 1212
											}

											var10000 = TileItem.Tiles_hue; // L: 1215
											var10000[var15] += var64.hue;
											var10000 = class397.Tiles_saturation; // L: 1216
											var10000[var15] += var64.saturation;
											var10000 = Tiles.Tiles_lightness; // L: 1217
											var10000[var15] += var64.lightness;
											var10000 = class1.Tiles_hueMultiplier; // L: 1218
											var10000[var15] += var64.hueMultiplier;
											var10002 = MouseRecorder.field1039[var15]++; // L: 1219
										}
									}

									var17 = var14 - 5; // L: 1222
									if (var17 >= 0 && var17 < 104) { // L: 1223
										var50 = Tiles.Tiles_underlays[var5][var17][var15] & 255; // L: 1224
										if (var50 > 0) { // L: 1225
											var52 = var50 - 1; // L: 1227
											FloorUnderlayDefinition var72 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var52); // L: 1229
											FloorUnderlayDefinition var65;
											if (var72 != null) { // L: 1230
												var65 = var72; // L: 1231
											} else {
												byte[] var54 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var52); // L: 1234
												var72 = new FloorUnderlayDefinition(); // L: 1235
												if (var54 != null) { // L: 1236
													var72.decode(new Buffer(var54), var52);
												}

												var72.postDecode(); // L: 1237
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var72, (long)var52); // L: 1238
												var65 = var72; // L: 1239
											}

											var10000 = TileItem.Tiles_hue; // L: 1242
											var10000[var15] -= var65.hue;
											var10000 = class397.Tiles_saturation; // L: 1243
											var10000[var15] -= var65.saturation;
											var10000 = Tiles.Tiles_lightness; // L: 1244
											var10000[var15] -= var65.lightness;
											var10000 = class1.Tiles_hueMultiplier; // L: 1245
											var10000[var15] -= var65.hueMultiplier;
											var10002 = MouseRecorder.field1039[var15]--; // L: 1246
										}
									}
								}

								if (var14 >= 1 && var14 < 103) { // L: 1250
									var15 = 0; // L: 1251
									var16 = 0; // L: 1252
									var17 = 0; // L: 1253
									var50 = 0; // L: 1254
									var51 = 0; // L: 1255

									for (var52 = -5; var52 < 109; ++var52) { // L: 1256
										var21 = var52 + 5; // L: 1257
										if (var21 >= 0 && var21 < 104) { // L: 1258
											var15 += TileItem.Tiles_hue[var21]; // L: 1259
											var16 += class397.Tiles_saturation[var21]; // L: 1260
											var17 += Tiles.Tiles_lightness[var21]; // L: 1261
											var50 += class1.Tiles_hueMultiplier[var21]; // L: 1262
											var51 += MouseRecorder.field1039[var21]; // L: 1263
										}

										var22 = var52 - 5; // L: 1265
										if (var22 >= 0 && var22 < 104) { // L: 1266
											var15 -= TileItem.Tiles_hue[var22]; // L: 1267
											var16 -= class397.Tiles_saturation[var22]; // L: 1268
											var17 -= Tiles.Tiles_lightness[var22]; // L: 1269
											var50 -= class1.Tiles_hueMultiplier[var22]; // L: 1270
											var51 -= MouseRecorder.field1039[var22]; // L: 1271
										}

										if (var52 >= 1 && var52 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var52] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var52] & 16) == 0)) { // L: 1273 1274 1275 1276
											if (var5 < Tiles.Tiles_minPlane) { // L: 1279
												Tiles.Tiles_minPlane = var5;
											}

											var23 = Tiles.Tiles_underlays[var5][var14][var52] & 255; // L: 1280
											var24 = Tiles.Tiles_overlays[var5][var14][var52] & 255; // L: 1281
											if (var23 > 0 || var24 > 0) { // L: 1282
												var25 = Tiles.Tiles_heights[var5][var14][var52]; // L: 1283
												var26 = Tiles.Tiles_heights[var5][var14 + 1][var52]; // L: 1284
												var27 = Tiles.Tiles_heights[var5][var14 + 1][var52 + 1]; // L: 1285
												var28 = Tiles.Tiles_heights[var5][var14][var52 + 1]; // L: 1286
												var29 = DirectByteArrayCopier.field3212[var14][var52]; // L: 1287
												var30 = DirectByteArrayCopier.field3212[var14 + 1][var52]; // L: 1288
												int var55 = DirectByteArrayCopier.field3212[var14 + 1][var52 + 1]; // L: 1289
												var32 = DirectByteArrayCopier.field3212[var14][var52 + 1]; // L: 1290
												var33 = -1; // L: 1291
												var34 = -1; // L: 1292
												int var36;
												int var56;
												if (var23 > 0) { // L: 1293
													var56 = var15 * 256 / var50; // L: 1294
													var36 = var16 / var51; // L: 1295
													int var37 = var17 / var51; // L: 1296
													var33 = class17.hslToRgb(var56, var36, var37); // L: 1297
													var56 = var56 + Tiles.rndHue & 255; // L: 1298
													var37 += Tiles.rndLightness; // L: 1299
													if (var37 < 0) { // L: 1300
														var37 = 0;
													} else if (var37 > 255) { // L: 1301
														var37 = 255;
													}

													var34 = class17.hslToRgb(var56, var36, var37); // L: 1302
												}

												if (var5 > 0) { // L: 1304
													boolean var73 = true; // L: 1305
													if (var23 == 0 && Tiles.Tiles_shapes[var5][var14][var52] != 0) { // L: 1306
														var73 = false;
													}

													if (var24 > 0 && !InvDefinition.method2987(var24 - 1).hideUnderlay) { // L: 1307
														var73 = false;
													}

													if (var73 && var26 == var25 && var25 == var27 && var25 == var28) { // L: 1308 1309
														var10000 = Tiles.field962[var5][var14];
														var10000[var52] |= 2340;
													}
												}

												var56 = 0; // L: 1312
												if (var34 != -1) { // L: 1313
													var56 = Rasterizer3D.Rasterizer3D_colorPalette[UserComparator8.method2456(var34, 96)];
												}

												if (var24 == 0) { // L: 1314
													var60.addTile(var5, var14, var52, 0, 0, -1, var25, var26, var27, var28, UserComparator8.method2456(var33, var29), UserComparator8.method2456(var33, var30), UserComparator8.method2456(var33, var55), UserComparator8.method2456(var33, var32), 0, 0, 0, 0, var56, 0); // L: 1315
												} else {
													var36 = Tiles.Tiles_shapes[var5][var14][var52] + 1; // L: 1318
													byte var68 = Tiles.field969[var5][var14][var52]; // L: 1319
													FloorOverlayDefinition var38 = InvDefinition.method2987(var24 - 1); // L: 1320
													int var39 = var38.texture; // L: 1321
													int var40;
													int var41;
													int var42;
													int var43;
													if (var39 >= 0) { // L: 1324
														var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var39); // L: 1325
														var40 = -1; // L: 1326
													} else if (var38.primaryRgb == 16711935) { // L: 1329
														var40 = -2; // L: 1330
														var39 = -1; // L: 1331
														var41 = -2; // L: 1332
													} else {
														var40 = class17.hslToRgb(var38.hue, var38.saturation, var38.lightness); // L: 1335
														var42 = var38.hue + Tiles.rndHue & 255; // L: 1336
														var43 = var38.lightness + Tiles.rndLightness; // L: 1337
														if (var43 < 0) { // L: 1338
															var43 = 0;
														} else if (var43 > 255) { // L: 1339
															var43 = 255;
														}

														var41 = class17.hslToRgb(var42, var38.saturation, var43); // L: 1340
													}

													var42 = 0; // L: 1343
													if (var41 != -2) { // L: 1344
														var42 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapIcon_0.method3885(var41, 96)];
													}

													if (var38.secondaryRgb != -1) { // L: 1345
														var43 = var38.secondaryHue + Tiles.rndHue & 255; // L: 1346
														int var44 = var38.secondaryLightness + Tiles.rndLightness; // L: 1347
														if (var44 < 0) { // L: 1348
															var44 = 0;
														} else if (var44 > 255) { // L: 1349
															var44 = 255;
														}

														var41 = class17.hslToRgb(var43, var38.secondarySaturation, var44); // L: 1350
														var42 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapIcon_0.method3885(var41, 96)]; // L: 1351
													}

													var60.addTile(var5, var14, var52, var36, var68, var39, var25, var26, var27, var28, UserComparator8.method2456(var33, var29), UserComparator8.method2456(var33, var30), UserComparator8.method2456(var33, var55), UserComparator8.method2456(var33, var32), WorldMapIcon_0.method3885(var40, var29), WorldMapIcon_0.method3885(var40, var30), WorldMapIcon_0.method3885(var40, var55), WorldMapIcon_0.method3885(var40, var32), var56, var42); // L: 1353
												}
											}
										}
									}
								}
							}

							for (var14 = 1; var14 < 103; ++var14) { // L: 1360
								for (var15 = 1; var15 < 103; ++var15) { // L: 1361
									if ((Tiles.Tiles_renderFlags[var5][var15][var14] & 8) != 0) { // L: 1368
										var52 = 0; // L: 1369
									} else if (var5 > 0 && (Tiles.Tiles_renderFlags[1][var15][var14] & 2) != 0) { // L: 1372
										var52 = var5 - 1; // L: 1373
									} else {
										var52 = var5; // L: 1376
									}

									var60.setTileMinPlane(var5, var15, var14, var52); // L: 1378
								}
							}

							Tiles.Tiles_underlays[var5] = null; // L: 1381
							Tiles.Tiles_overlays[var5] = null; // L: 1382
							Tiles.Tiles_shapes[var5] = null; // L: 1383
							Tiles.field969[var5] = null; // L: 1384
							class54.field419[var5] = null; // L: 1385
						}

						var60.method4310(-50, -10, -50); // L: 1387

						for (var5 = 0; var5 < 104; ++var5) { // L: 1388
							for (var48 = 0; var48 < 104; ++var48) { // L: 1389
								if ((Tiles.Tiles_renderFlags[1][var5][var48] & 2) == 2) { // L: 1390
									var60.setLinkBelow(var5, var48);
								}
							}
						}

						var5 = 1; // L: 1393
						var48 = 2; // L: 1394
						var7 = 4; // L: 1395

						for (var8 = 0; var8 < 4; ++var8) { // L: 1396
							if (var8 > 0) { // L: 1397
								var5 <<= 3; // L: 1398
								var48 <<= 3; // L: 1399
								var7 <<= 3; // L: 1400
							}

							for (var9 = 0; var9 <= var8; ++var9) { // L: 1402
								for (var10 = 0; var10 <= 104; ++var10) { // L: 1403
									for (var11 = 0; var11 <= 104; ++var11) { // L: 1404
										short var66;
										if ((Tiles.field962[var9][var11][var10] & var5) != 0) { // L: 1405
											var12 = var10; // L: 1406
											var13 = var10; // L: 1407
											var14 = var9; // L: 1408

											for (var15 = var9; var12 > 0 && (Tiles.field962[var9][var11][var12 - 1] & var5) != 0; --var12) { // L: 1409 1410
											}

											while (var13 < 104 && (Tiles.field962[var9][var11][var13 + 1] & var5) != 0) { // L: 1411
												++var13;
											}

											label901:
											while (var14 > 0) { // L: 1412
												for (var16 = var12; var16 <= var13; ++var16) { // L: 1413
													if ((Tiles.field962[var14 - 1][var11][var16] & var5) == 0) {
														break label901;
													}
												}

												--var14; // L: 1414
											}

											label890:
											while (var15 < var8) { // L: 1416
												for (var16 = var12; var16 <= var13; ++var16) { // L: 1417
													if ((Tiles.field962[var15 + 1][var11][var16] & var5) == 0) {
														break label890;
													}
												}

												++var15; // L: 1418
											}

											var16 = (var15 + 1 - var14) * (var13 - var12 + 1); // L: 1420
											if (var16 >= 8) { // L: 1421
												var66 = 240; // L: 1422
												var50 = Tiles.Tiles_heights[var15][var11][var12] - var66; // L: 1423
												var51 = Tiles.Tiles_heights[var14][var11][var12]; // L: 1424
												Scene.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var50, var51); // L: 1425

												for (var52 = var14; var52 <= var15; ++var52) { // L: 1426
													for (var21 = var12; var21 <= var13; ++var21) { // L: 1427
														var10000 = Tiles.field962[var52][var11];
														var10000[var21] &= ~var5;
													}
												}
											}
										}

										if ((Tiles.field962[var9][var11][var10] & var48) != 0) { // L: 1431
											var12 = var11; // L: 1432
											var13 = var11; // L: 1433
											var14 = var9; // L: 1434

											for (var15 = var9; var12 > 0 && (Tiles.field962[var9][var12 - 1][var10] & var48) != 0; --var12) { // L: 1435 1436
											}

											while (var13 < 104 && (Tiles.field962[var9][var13 + 1][var10] & var48) != 0) { // L: 1437
												++var13;
											}

											label954:
											while (var14 > 0) { // L: 1438
												for (var16 = var12; var16 <= var13; ++var16) { // L: 1439
													if ((Tiles.field962[var14 - 1][var16][var10] & var48) == 0) {
														break label954;
													}
												}

												--var14; // L: 1440
											}

											label943:
											while (var15 < var8) { // L: 1442
												for (var16 = var12; var16 <= var13; ++var16) { // L: 1443
													if ((Tiles.field962[var15 + 1][var16][var10] & var48) == 0) {
														break label943;
													}
												}

												++var15; // L: 1444
											}

											var16 = (var13 - var12 + 1) * (var15 + 1 - var14); // L: 1446
											if (var16 >= 8) { // L: 1447
												var66 = 240; // L: 1448
												var50 = Tiles.Tiles_heights[var15][var12][var10] - var66; // L: 1449
												var51 = Tiles.Tiles_heights[var14][var12][var10]; // L: 1450
												Scene.Scene_addOccluder(var8, 2, var12 * 128, var13 * 128 + 128, var10 * 128, var10 * 128, var50, var51); // L: 1451

												for (var52 = var14; var52 <= var15; ++var52) { // L: 1452
													for (var21 = var12; var21 <= var13; ++var21) { // L: 1453
														var10000 = Tiles.field962[var52][var21];
														var10000[var10] &= ~var48;
													}
												}
											}
										}

										if ((Tiles.field962[var9][var11][var10] & var7) != 0) { // L: 1457
											var12 = var11; // L: 1458
											var13 = var11; // L: 1459
											var14 = var10; // L: 1460

											for (var15 = var10; var14 > 0 && (Tiles.field962[var9][var11][var14 - 1] & var7) != 0; --var14) { // L: 1461 1462
											}

											while (var15 < 104 && (Tiles.field962[var9][var11][var15 + 1] & var7) != 0) { // L: 1463
												++var15;
											}

											label1007:
											while (var12 > 0) { // L: 1464
												for (var16 = var14; var16 <= var15; ++var16) { // L: 1465
													if ((Tiles.field962[var9][var12 - 1][var16] & var7) == 0) {
														break label1007;
													}
												}

												--var12; // L: 1466
											}

											label996:
											while (var13 < 104) { // L: 1468
												for (var16 = var14; var16 <= var15; ++var16) { // L: 1469
													if ((Tiles.field962[var9][var13 + 1][var16] & var7) == 0) {
														break label996;
													}
												}

												++var13; // L: 1470
											}

											if ((var13 - var12 + 1) * (var15 - var14 + 1) >= 4) { // L: 1472
												var16 = Tiles.Tiles_heights[var9][var12][var14]; // L: 1473
												Scene.Scene_addOccluder(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16); // L: 1474

												for (var17 = var12; var17 <= var13; ++var17) { // L: 1475
													for (var50 = var14; var50 <= var15; ++var50) { // L: 1476
														var10000 = Tiles.field962[var9][var17];
														var10000[var50] &= ~var7;
													}
												}
											}
										}
									}
								}
							}
						}

						MenuAction.method1912(true); // L: 1485
						var5 = Tiles.Tiles_minPlane; // L: 1486
						if (var5 > GrandExchangeOfferTotalQuantityComparator.Client_plane) { // L: 1487
							var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
						}

						if (var5 < GrandExchangeOfferTotalQuantityComparator.Client_plane - 1) { // L: 1488
							var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane - 1;
						}

						if (isLowDetail) { // L: 1489
							GameBuild.scene.init(Tiles.Tiles_minPlane);
						} else {
							GameBuild.scene.init(0); // L: 1490
						}

						for (var48 = 0; var48 < 104; ++var48) { // L: 1491
							for (var7 = 0; var7 < 104; ++var7) { // L: 1492
								WallDecoration.updateItemPile(var48, var7); // L: 1493
							}
						}

						class14.playPcmPlayers(); // L: 1496

						for (PendingSpawn var62 = (PendingSpawn)pendingSpawns.last(); var62 != null; var62 = (PendingSpawn)pendingSpawns.previous()) { // L: 1498 1499 1505
							if (var62.hitpoints == -1) { // L: 1500
								var62.delay = 0; // L: 1501
								class14.method180(var62); // L: 1502
							} else {
								var62.remove(); // L: 1504
							}
						}

						ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 1508
						PacketBufferNode var63;
						if (ArchiveLoader.client.hasFrame()) { // L: 1509
							var63 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2679, packetWriter.isaacCipher); // L: 1511
							var63.packetBuffer.writeInt(1057001181); // L: 1512
							packetWriter.addNode(var63); // L: 1513
						}

						if (!isInInstance) { // L: 1515
							var48 = (ItemLayer.field2243 - 6) / 8; // L: 1516
							var7 = (ItemLayer.field2243 + 6) / 8; // L: 1517
							var8 = (WallDecoration.field2630 - 6) / 8; // L: 1518
							var9 = (WallDecoration.field2630 + 6) / 8; // L: 1519

							for (var10 = var48 - 1; var10 <= var7 + 1; ++var10) { // L: 1520
								for (var11 = var8 - 1; var11 <= var9 + 1; ++var11) { // L: 1521
									if (var10 < var48 || var10 > var7 || var11 < var8 || var11 > var9) { // L: 1522
										class11.archive5.loadRegionFromName("m" + var10 + "_" + var11); // L: 1523
										class11.archive5.loadRegionFromName("l" + var10 + "_" + var11); // L: 1524
									}
								}
							}
						}

						WorldMapData_1.updateGameState(30); // L: 1528
						class14.playPcmPlayers(); // L: 1529
						class113.method2533(); // L: 1530
						var63 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2713, packetWriter.isaacCipher); // L: 1531
						packetWriter.addNode(var63); // L: 1532
						Clock.clock.mark(); // L: 1534

						for (var7 = 0; var7 < 32; ++var7) { // L: 1535
							GameEngine.graphicsTickTimes[var7] = 0L;
						}

						for (var7 = 0; var7 < 32; ++var7) { // L: 1536
							GameEngine.clientTickTimes[var7] = 0L;
						}

						class1.gameCyclesToDo = 0; // L: 1537
					}
				}
			}
		} else {
			class272.method5197(this, class6.fontPlain12);
		}

		if (gameState == 30) { // L: 1540
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1541
			this.doCycleLoggedOut();
		}

	} // L: 1542

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1302395481"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label166: {
			try {
				if (class247.musicPlayerStatus == 2) { // L: 1548
					if (class14.musicTrack == null) { // L: 1549
						class14.musicTrack = MusicTrack.readTrack(class128.musicTrackArchive, FillMode.musicTrackGroupId, ArchiveDiskActionHandler.musicTrackFileId); // L: 1550
						if (class14.musicTrack == null) { // L: 1551
							var2 = false; // L: 1552
							break label166;
						}
					}

					if (class247.soundCache == null) { // L: 1556
						class247.soundCache = new SoundCache(class408.soundEffectsArchive, class247.musicSamplesArchive);
					}

					if (class247.midiPcmStream.loadMusicTrack(class14.musicTrack, class247.musicPatchesArchive, class247.soundCache, 22050)) { // L: 1557
						class247.midiPcmStream.clearAll(); // L: 1558
						class247.midiPcmStream.setPcmStreamVolume(class247.musicTrackVolume); // L: 1559
						class247.midiPcmStream.setMusicTrack(class14.musicTrack, SecureRandomCallable.musicTrackBoolean); // L: 1560
						class247.musicPlayerStatus = 0; // L: 1561
						class14.musicTrack = null; // L: 1562
						class247.soundCache = null; // L: 1563
						class128.musicTrackArchive = null; // L: 1564
						var2 = true; // L: 1565
						break label166;
					}
				}
			} catch (Exception var6) { // L: 1570
				var6.printStackTrace(); // L: 1571
				class247.midiPcmStream.clear(); // L: 1572
				class247.musicPlayerStatus = 0; // L: 1573
				class14.musicTrack = null; // L: 1574
				class247.soundCache = null; // L: 1575
				class128.musicTrackArchive = null; // L: 1576
			}

			var2 = false; // L: 1578
		}

		if (var2 && field710 && HealthBar.pcmPlayer0 != null) { // L: 1581 1582
			HealthBar.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field687 && class111.method2516() > field687) { // L: 1584 1585
			HorizontalAlignment.setWindowedMode(class134.getWindowedMode()); // L: 1586
		}

		int var4;
		if (var1) { // L: 1589
			for (var4 = 0; var4 < 100; ++var4) { // L: 1590
				field594[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1592
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1593
			class12.drawTitle(Login.fontBold12, FriendLoginUpdate.fontPlain11, class6.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1594
			if (gameState == 20) { // L: 1595
				class12.drawTitle(Login.fontBold12, FriendLoginUpdate.fontPlain11, class6.fontPlain12);
			} else if (gameState == 25) { // L: 1596
				if (field485 == 1) { // L: 1597
					if (field521 > field522) { // L: 1598
						field522 = field521;
					}

					var4 = (field522 * 50 - field521 * 50) / field522; // L: 1599
					class91.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1600
				} else if (field485 == 2) { // L: 1602
					if (field523 > field524) { // L: 1603
						field524 = field523;
					}

					var4 = (field524 * 50 - field523 * 50) / field524 + 50; // L: 1604
					class91.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1605
				} else {
					class91.drawLoadingMessage("Loading - please wait.", false); // L: 1607
				}
			} else if (gameState == 30) { // L: 1609
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1610
				class91.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1611
				class91.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class12.drawTitle(Login.fontBold12, FriendLoginUpdate.fontPlain11, class6.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1612
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1613
				if (field553[var4]) { // L: 1614
					Canvas.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1615
					field553[var4] = false; // L: 1616
				}
			}
		} else if (gameState > 0) { // L: 1620
			Canvas.rasterProvider.drawFull(0, 0); // L: 1621

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1622
				field553[var4] = false;
			}
		}

	} // L: 1624

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9054"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Message.varcs.hasUnwrittenChanges()) { // L: 1627
			Message.varcs.write();
		}

		if (Interpreter.mouseRecorder != null) { // L: 1628
			Interpreter.mouseRecorder.isRunning = false;
		}

		Interpreter.mouseRecorder = null; // L: 1629
		packetWriter.close(); // L: 1630
		if (KeyHandler.KeyHandler_instance != null) { // L: 1632
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1633
				KeyHandler.KeyHandler_instance = null; // L: 1634
			} // L: 1635
		}

		NPC.method2248(); // L: 1638
		MouseHandler.mouseWheel = null; // L: 1639
		if (HealthBar.pcmPlayer0 != null) { // L: 1640
			HealthBar.pcmPlayer0.shutdown();
		}

		if (ScriptEvent.pcmPlayer1 != null) { // L: 1641
			ScriptEvent.pcmPlayer1.shutdown();
		}

		Script.method1989(); // L: 1642
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1644
			if (ArchiveDiskActionHandler.field3662 != 0) { // L: 1645
				ArchiveDiskActionHandler.field3662 = 1; // L: 1646

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1648
				} catch (InterruptedException var5) { // L: 1650
				}
			}
		}

		if (class320.urlRequester != null) { // L: 1654
			class320.urlRequester.close(); // L: 1655
			class320.urlRequester = null; // L: 1656
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1660

			for (int var4 = 0; var4 < ItemContainer.idxCount; ++var4) { // L: 1661
				WorldMapID.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1662
			JagexCache.JagexCache_randomDat.close(); // L: 1663
		} catch (Exception var7) { // L: 1665
		}

		this.field491.method181(); // L: 1667
	} // L: 1668

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	protected final void vmethod1164() {
	} // L: 652

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-863844580"
	)
	boolean method1166() {
		return JagexCache.field1560 != null && !JagexCache.field1560.trim().isEmpty(); // L: 784
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1299370997"
	)
	void method1453(String var1) throws MalformedURLException, IOException {
		class10 var2 = new class10(new URL(WorldMapSection1.field2203 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class9.field27); // L: 788
		var2.method86("Authorization", "Bearer " + var1); // L: 789
		this.field537 = this.field491.method187(var2); // L: 790
	} // L: 791

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "23725"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1713
			long var2 = class111.method2516(); // L: 1716
			int var4 = (int)(var2 - class423.field4436); // L: 1717
			class423.field4436 = var2; // L: 1718
			if (var4 > 200) { // L: 1719
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1720
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1721
				var1 = true; // L: 1722
			} else if (NetCache.NetCache_socket == null) { // L: 1725
				var1 = false; // L: 1726
			} else {
				try {
					label245: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1730
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1731
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1732
							var6 = new Buffer(4); // L: 1733
							var6.writeByte(1); // L: 1734
							var6.writeMedium((int)var5.key); // L: 1735
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1736
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1737
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1738
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1739
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1741
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1742
							var6 = new Buffer(4); // L: 1743
							var6.writeByte(0); // L: 1744
							var6.writeMedium((int)var5.key); // L: 1745
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1746
							var5.removeDual(); // L: 1747
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1748
							--NetCache.NetCache_pendingWritesCount; // L: 1749
							++NetCache.NetCache_pendingResponsesCount; // L: 1750
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1752
							int var18 = NetCache.NetCache_socket.available(); // L: 1753
							if (var18 < 0) { // L: 1754
								throw new IOException();
							}

							if (var18 == 0) { // L: 1755
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1756
							byte var7 = 0; // L: 1757
							if (class131.NetCache_currentResponse == null) { // L: 1758
								var7 = 8;
							} else if (NetCache.field3707 == 0) { // L: 1759
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1760
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1761
								if (var8 > var18) { // L: 1762
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1763
								if (NetCache.field3719 != 0) { // L: 1764
									for (var9 = 0; var9 < var8; ++var9) { // L: 1765
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3719;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1767
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1768
									break;
								}

								if (class131.NetCache_currentResponse == null) { // L: 1769
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1770
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1771
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1772
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1773
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1774
									long var13 = (long)(var10 + (var9 << 16)); // L: 1775
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1776
									class120.field1401 = true; // L: 1777
									if (var15 == null) { // L: 1778
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1779
										class120.field1401 = false; // L: 1780
									}

									if (var15 == null) { // L: 1782
										throw new IOException(); // L: 1783
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1785
									class131.NetCache_currentResponse = var15; // L: 1786
									class138.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + class131.NetCache_currentResponse.padding); // L: 1787
									class138.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1788
									class138.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1789
									NetCache.field3707 = 8; // L: 1790
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1791
								} else if (NetCache.field3707 == 0) { // L: 1794
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1795
										NetCache.field3707 = 1; // L: 1796
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1797
									} else {
										class131.NetCache_currentResponse = null; // L: 1801
									}
								}
							} else {
								var8 = class138.NetCache_responseArchiveBuffer.array.length - class131.NetCache_currentResponse.padding; // L: 1807
								var9 = 512 - NetCache.field3707; // L: 1808
								if (var9 > var8 - class138.NetCache_responseArchiveBuffer.offset) { // L: 1809
									var9 = var8 - class138.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1810
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class138.NetCache_responseArchiveBuffer.array, class138.NetCache_responseArchiveBuffer.offset, var9); // L: 1811
								if (NetCache.field3719 != 0) { // L: 1812
									for (var10 = 0; var10 < var9; ++var10) { // L: 1813
										var10000 = class138.NetCache_responseArchiveBuffer.array;
										var10001 = class138.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3719;
									}
								}

								var25 = class138.NetCache_responseArchiveBuffer; // L: 1815
								var25.offset += var9;
								NetCache.field3707 += var9; // L: 1816
								if (var8 == class138.NetCache_responseArchiveBuffer.offset) { // L: 1817
									if (class131.NetCache_currentResponse.key == 16711935L) { // L: 1818
										class139.NetCache_reference = class138.NetCache_responseArchiveBuffer; // L: 1819

										for (var10 = 0; var10 < 256; ++var10) { // L: 1820
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1821
											if (var19 != null) { // L: 1822
												class139.NetCache_reference.offset = var10 * 8 + 5; // L: 1823
												var12 = class139.NetCache_reference.readInt(); // L: 1824
												int var20 = class139.NetCache_reference.readInt(); // L: 1825
												var19.loadIndex(var12, var20); // L: 1826
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1831
										NetCache.NetCache_crc.update(class138.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1832
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1833
										if (var10 != class131.NetCache_currentResponse.crc) { // L: 1834
											try {
												NetCache.NetCache_socket.close(); // L: 1836
											} catch (Exception var23) { // L: 1838
											}

											++NetCache.NetCache_crcMismatches; // L: 1839
											NetCache.NetCache_socket = null; // L: 1840
											NetCache.field3719 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1841
											var1 = false; // L: 1842
											break label245;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1845
										NetCache.NetCache_ioExceptions = 0; // L: 1846
										class131.NetCache_currentResponse.archive.write((int)(class131.NetCache_currentResponse.key & 65535L), class138.NetCache_responseArchiveBuffer.array, 16711680L == (class131.NetCache_currentResponse.key & 16711680L), class120.field1401); // L: 1847
									}

									class131.NetCache_currentResponse.remove(); // L: 1849
									if (class120.field1401) { // L: 1850
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1851
									}

									NetCache.field3707 = 0; // L: 1852
									class131.NetCache_currentResponse = null; // L: 1853
									class138.NetCache_responseArchiveBuffer = null; // L: 1854
								} else {
									if (NetCache.field3707 != 512) { // L: 1856
										break;
									}

									NetCache.field3707 = 0;
								}
							}
						}

						var1 = true; // L: 1860
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1864
					} catch (Exception var22) { // L: 1866
					}

					++NetCache.NetCache_ioExceptions; // L: 1867
					NetCache.NetCache_socket = null; // L: 1868
					var1 = false; // L: 1869
				}
			}

			if (!var1) { // L: 1873
				this.doCycleJs5Connect();
			}

		}
	} // L: 1874

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1173138453"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1877
			this.error("js5crc"); // L: 1878
			WorldMapData_1.updateGameState(1000); // L: 1879
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1882
				if (gameState <= 5) { // L: 1883
					this.error("js5io"); // L: 1884
					WorldMapData_1.updateGameState(1000); // L: 1885
					return; // L: 1886
				}

				field572 = 3000; // L: 1889
				NetCache.NetCache_ioExceptions = 3; // L: 1890
			}

			if (--field572 + 1 <= 0) { // L: 1893
				try {
					if (js5ConnectState == 0) { // L: 1895
						class114.js5SocketTask = GameEngine.taskHandler.newSocketTask(WorldMapIcon_0.worldHost, ScriptEvent.currentPort); // L: 1896
						++js5ConnectState; // L: 1897
					}

					if (js5ConnectState == 1) { // L: 1899
						if (class114.js5SocketTask.status == 2) { // L: 1900
							this.js5Error(-1); // L: 1901
							return; // L: 1902
						}

						if (class114.js5SocketTask.status == 1) { // L: 1904
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1906
						if (useBufferedSocket) { // L: 1907
							ItemLayer.js5Socket = class132.method2767((Socket)class114.js5SocketTask.result, 40000, 5000); // L: 1908
						} else {
							ItemLayer.js5Socket = new NetSocket((Socket)class114.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1911
						}

						Buffer var1 = new Buffer(5); // L: 1913
						var1.writeByte(15); // L: 1914
						var1.writeInt(201); // L: 1915
						ItemLayer.js5Socket.write(var1.array, 0, 5); // L: 1916
						++js5ConnectState; // L: 1917
						Login.field889 = class111.method2516(); // L: 1918
					}

					if (js5ConnectState == 3) { // L: 1920
						if (ItemLayer.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1921
							int var2 = ItemLayer.js5Socket.readUnsignedByte(); // L: 1922
							if (var2 != 0) { // L: 1923
								this.js5Error(var2); // L: 1924
								return; // L: 1925
							}

							++js5ConnectState; // L: 1927
						} else if (class111.method2516() - Login.field889 > 30000L) { // L: 1930
							this.js5Error(-2); // L: 1931
							return; // L: 1932
						}
					}

					if (js5ConnectState == 4) { // L: 1936
						GameObject.method4647(ItemLayer.js5Socket, gameState > 20); // L: 1937
						class114.js5SocketTask = null; // L: 1938
						ItemLayer.js5Socket = null; // L: 1939
						js5ConnectState = 0; // L: 1940
						js5Errors = 0; // L: 1941
					}
				} catch (IOException var3) { // L: 1944
					this.js5Error(-3); // L: 1945
				}

			}
		}
	} // L: 1880 1947

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-88"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class114.js5SocketTask = null; // L: 1950
		ItemLayer.js5Socket = null; // L: 1951
		js5ConnectState = 0; // L: 1952
		if (ApproximateRouteStrategy.worldPort == ScriptEvent.currentPort) { // L: 1953
			ScriptEvent.currentPort = ParamComposition.js5Port;
		} else {
			ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort; // L: 1954
		}

		++js5Errors; // L: 1955
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1956
			if (js5Errors >= 2 && var1 == 6) { // L: 1963
				this.error("js5connect_outofdate"); // L: 1964
				WorldMapData_1.updateGameState(1000); // L: 1965
			} else if (js5Errors >= 4) { // L: 1967
				if (gameState <= 5) { // L: 1968
					this.error("js5connect"); // L: 1969
					WorldMapData_1.updateGameState(1000); // L: 1970
				} else {
					field572 = 3000; // L: 1972
				}
			}
		} else if (gameState <= 5) { // L: 1957
			this.error("js5connect_full"); // L: 1958
			WorldMapData_1.updateGameState(1000); // L: 1959
		} else {
			field572 = 3000; // L: 1961
		}

	} // L: 1974

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1167591664"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2424
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2425

		try {
			if (loginState == 0) { // L: 2427
				if (UserComparator4.secureRandom == null && (secureRandomFuture.isDone() || field496 > 250)) { // L: 2428
					UserComparator4.secureRandom = secureRandomFuture.get(); // L: 2429
					secureRandomFuture.shutdown(); // L: 2430
					secureRandomFuture = null; // L: 2431
				}

				if (UserComparator4.secureRandom != null) { // L: 2433
					if (var1 != null) { // L: 2434
						((AbstractSocket)var1).close(); // L: 2435
						var1 = null; // L: 2436
					}

					PcmPlayer.socketTask = null; // L: 2438
					hadNetworkError = false; // L: 2439
					field496 = 0; // L: 2440
					if (field500.method7220()) { // L: 2441
						try {
							this.method1453(JagexCache.field1560); // L: 2443
							UserComparator6.method2503(20); // L: 2444
						} catch (Throwable var20) { // L: 2446
							MilliClock.RunException_sendStackTrace((String)null, var20); // L: 2447
							SecureRandomFuture.getLoginError(65); // L: 2448
							return; // L: 2449
						}
					} else {
						UserComparator6.method2503(1); // L: 2453
					}
				}
			}

			if (loginState == 20) { // L: 2457
				if (!this.field537.method280()) { // L: 2458
					return; // L: 2459
				}

				if (this.field537.method276()) { // L: 2461
					MilliClock.RunException_sendStackTrace(this.field537.method293(), (Throwable)null); // L: 2462
					SecureRandomFuture.getLoginError(65); // L: 2463
					return; // L: 2464
				}

				class21 var3 = this.field537.method281(); // L: 2466
				if (var3.method310() != 200) { // L: 2467
					MilliClock.RunException_sendStackTrace("Response code: " + var3.method310() + "Response body: " + var3.method303(), (Throwable)null); // L: 2468
					SecureRandomFuture.getLoginError(65); // L: 2469
					return; // L: 2470
				}

				field496 = 0; // L: 2472
				this.field501 = var3.method303(); // L: 2473
				UserComparator6.method2503(1); // L: 2474
			}

			if (loginState == 1) { // L: 2476
				if (PcmPlayer.socketTask == null) { // L: 2477
					PcmPlayer.socketTask = GameEngine.taskHandler.newSocketTask(WorldMapIcon_0.worldHost, ScriptEvent.currentPort); // L: 2478
				}

				if (PcmPlayer.socketTask.status == 2) { // L: 2480
					throw new IOException();
				}

				if (PcmPlayer.socketTask.status == 1) { // L: 2481
					if (useBufferedSocket) { // L: 2482
						var1 = class132.method2767((Socket)PcmPlayer.socketTask.result, 40000, 5000); // L: 2483
					} else {
						var1 = new NetSocket((Socket)PcmPlayer.socketTask.result, GameEngine.taskHandler, 5000); // L: 2486
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2488
					PcmPlayer.socketTask = null; // L: 2489
					UserComparator6.method2503(2); // L: 2490
				}
			}

			PacketBufferNode var4;
			if (loginState == 2) { // L: 2493
				packetWriter.clearBuffer(); // L: 2494
				var4 = class92.method2296(); // L: 2497
				var4.clientPacket = null; // L: 2498
				var4.clientPacketLength = 0; // L: 2499
				var4.packetBuffer = new PacketBuffer(5000); // L: 2500
				var4.packetBuffer.writeByte(LoginPacket.field2901.id); // L: 2504
				packetWriter.addNode(var4); // L: 2505
				packetWriter.flush(); // L: 2506
				var2.offset = 0; // L: 2507
				UserComparator6.method2503(3); // L: 2508
			}

			boolean var13;
			int var14;
			if (loginState == 3) { // L: 2510
				if (HealthBar.pcmPlayer0 != null) { // L: 2511
					HealthBar.pcmPlayer0.method750();
				}

				if (ScriptEvent.pcmPlayer1 != null) { // L: 2512
					ScriptEvent.pcmPlayer1.method750();
				}

				var13 = true; // L: 2513
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2514 2515
					var13 = false;
				}

				if (var13) { // L: 2517
					var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2518
					if (HealthBar.pcmPlayer0 != null) { // L: 2519
						HealthBar.pcmPlayer0.method750();
					}

					if (ScriptEvent.pcmPlayer1 != null) { // L: 2520
						ScriptEvent.pcmPlayer1.method750();
					}

					if (var14 != 0) { // L: 2521
						SecureRandomFuture.getLoginError(var14); // L: 2522
						return; // L: 2523
					}

					var2.offset = 0; // L: 2525
					UserComparator6.method2503(4); // L: 2526
				}
			}

			int var33;
			if (loginState == 4) { // L: 2529
				if (var2.offset < 8) { // L: 2530
					var33 = ((AbstractSocket)var1).available(); // L: 2531
					if (var33 > 8 - var2.offset) { // L: 2532
						var33 = 8 - var2.offset;
					}

					if (var33 > 0) { // L: 2533
						((AbstractSocket)var1).read(var2.array, var2.offset, var33); // L: 2534
						var2.offset += var33; // L: 2535
					}
				}

				if (var2.offset == 8) { // L: 2538
					var2.offset = 0; // L: 2539
					ItemLayer.field2244 = var2.readLong(); // L: 2540
					UserComparator6.method2503(5); // L: 2541
				}
			}

			if (loginState == 5) { // L: 2544
				packetWriter.packetBuffer.offset = 0; // L: 2545
				packetWriter.clearBuffer(); // L: 2546
				PacketBuffer var22 = new PacketBuffer(500); // L: 2547
				int[] var25 = new int[]{UserComparator4.secureRandom.nextInt(), UserComparator4.secureRandom.nextInt(), UserComparator4.secureRandom.nextInt(), UserComparator4.secureRandom.nextInt()}; // L: 2548 2549 2550 2551 2552
				var22.offset = 0; // L: 2553
				var22.writeByte(1); // L: 2554
				var22.writeInt(var25[0]); // L: 2555
				var22.writeInt(var25[1]); // L: 2556
				var22.writeInt(var25[2]); // L: 2557
				var22.writeInt(var25[3]); // L: 2558
				var22.writeLong(ItemLayer.field2244); // L: 2559
				if (gameState == 40) { // L: 2560
					var22.writeInt(ServerPacket.field2893[0]); // L: 2561
					var22.writeInt(ServerPacket.field2893[1]); // L: 2562
					var22.writeInt(ServerPacket.field2893[2]); // L: 2563
					var22.writeInt(ServerPacket.field2893[3]); // L: 2564
				} else {
					var22.writeByte(field693.rsOrdinal()); // L: 2567
					switch(field693.field1344) { // L: 2568
					case 0:
					case 3:
						var22.writeMedium(ReflectionCheck.field429); // L: 2577
						++var22.offset; // L: 2578
						break; // L: 2579
					case 1:
						var22.writeInt((Integer)class408.clientPreferences.parameters.get(ClanChannel.method2824(Login.Login_username))); // L: 2583
						break;
					case 2:
						var22.offset += 4; // L: 2571
					}

					if (field500.method7220()) { // L: 2587
						var22.writeByte(class404.field4352.rsOrdinal()); // L: 2588
						var22.writeStringCp1252NullTerminated(this.field501); // L: 2589
					} else {
						var22.writeByte(class404.field4351.rsOrdinal()); // L: 2592
						var22.writeStringCp1252NullTerminated(Login.Login_password); // L: 2593
					}
				}

				var22.encryptRsa(class67.field840, class67.field843); // L: 2596
				ServerPacket.field2893 = var25; // L: 2597
				PacketBufferNode var6 = class92.method2296(); // L: 2600
				var6.clientPacket = null; // L: 2601
				var6.clientPacketLength = 0; // L: 2602
				var6.packetBuffer = new PacketBuffer(5000); // L: 2603
				var6.packetBuffer.offset = 0; // L: 2607
				if (gameState == 40) { // L: 2608
					var6.packetBuffer.writeByte(LoginPacket.field2894.id); // L: 2609
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field2896.id); // L: 2612
				}

				var6.packetBuffer.writeShort(0); // L: 2614
				int var7 = var6.packetBuffer.offset; // L: 2615
				var6.packetBuffer.writeInt(201); // L: 2616
				var6.packetBuffer.writeInt(1); // L: 2617
				var6.packetBuffer.writeByte(clientType); // L: 2618
				var6.packetBuffer.writeByte(field469); // L: 2619
				var6.packetBuffer.writeBytes(var22.array, 0, var22.offset); // L: 2620
				int var8 = var6.packetBuffer.offset; // L: 2621
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2622
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2623
				var6.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2624
				var6.packetBuffer.writeShort(KeyHandler.canvasHeight); // L: 2625
				PacketBuffer var9 = var6.packetBuffer; // L: 2626
				if (randomDatData != null) { // L: 2628
					var9.writeBytes(randomDatData, 0, randomDatData.length); // L: 2629
				} else {
					byte[] var10 = ObjectSound.method1771(); // L: 2632
					var9.writeBytes(var10, 0, var10.length); // L: 2633
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(UserComparator3.field1316); // L: 2635
				var6.packetBuffer.writeInt(TextureProvider.field2483); // L: 2636
				Buffer var32 = new Buffer(class54.platformInfo.size()); // L: 2637
				class54.platformInfo.write(var32); // L: 2638
				var6.packetBuffer.writeBytes(var32.array, 0, var32.array.length); // L: 2639
				var6.packetBuffer.writeByte(clientType); // L: 2640
				var6.packetBuffer.writeInt(0); // L: 2641
				var6.packetBuffer.method7010(Messages.archive6.hash); // L: 2642
				var6.packetBuffer.writeInt(Archive.archive15.hash); // L: 2643
				var6.packetBuffer.writeIntME(SecureRandomCallable.archive14.hash); // L: 2644
				var6.packetBuffer.method7126(HorizontalAlignment.archive7.hash); // L: 2645
				var6.packetBuffer.method7010(GrandExchangeOfferOwnWorldComparator.archive20.hash); // L: 2646
				var6.packetBuffer.writeIntME(Message.archive17.hash); // L: 2647
				var6.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.archive8.hash); // L: 2648
				var6.packetBuffer.method7010(Messages.archive18.hash); // L: 2649
				var6.packetBuffer.method7126(class1.archive2.hash); // L: 2650
				var6.packetBuffer.method7010(0); // L: 2651
				var6.packetBuffer.method7010(class14.archive12.hash); // L: 2652
				var6.packetBuffer.method7010(SecureRandomFuture.archive9.hash); // L: 2653
				var6.packetBuffer.writeInt(ApproximateRouteStrategy.archive1.hash); // L: 2654
				var6.packetBuffer.writeInt(InvDefinition.archive0.hash); // L: 2655
				var6.packetBuffer.method7010(ChatChannel.archive10.hash); // L: 2656
				var6.packetBuffer.writeInt(class11.archive5.hash); // L: 2657
				var6.packetBuffer.writeIntME(class111.archive19.hash); // L: 2658
				var6.packetBuffer.writeIntME(class12.archive4.hash); // L: 2659
				var6.packetBuffer.writeIntME(ParamComposition.archive3.hash); // L: 2660
				var6.packetBuffer.writeInt(LoginScreenAnimation.archive13.hash); // L: 2661
				var6.packetBuffer.writeInt(AbstractWorldMapIcon.archive11.hash); // L: 2662
				var6.packetBuffer.xteaEncrypt(var25, var8, var6.packetBuffer.offset); // L: 2663
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7); // L: 2664
				packetWriter.addNode(var6); // L: 2665
				packetWriter.flush(); // L: 2666
				packetWriter.isaacCipher = new IsaacCipher(var25); // L: 2667
				int[] var11 = new int[4]; // L: 2668

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2669
					var11[var12] = var25[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2670
				UserComparator6.method2503(6); // L: 2671
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2673 2674
				var33 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2675
				if (var33 == 21 && gameState == 20) { // L: 2676
					UserComparator6.method2503(12); // L: 2677
				} else if (var33 == 2) { // L: 2679
					UserComparator6.method2503(14); // L: 2680
				} else if (var33 == 15 && gameState == 40) { // L: 2682
					packetWriter.serverPacketLength = -1; // L: 2683
					UserComparator6.method2503(19); // L: 2684
				} else if (var33 == 64) { // L: 2686
					UserComparator6.method2503(10); // L: 2687
				} else if (var33 == 23 && field685 < 1) { // L: 2689
					++field685; // L: 2690
					UserComparator6.method2503(0); // L: 2691
				} else if (var33 == 29) { // L: 2693
					UserComparator6.method2503(17); // L: 2694
				} else {
					if (var33 != 69) { // L: 2696
						SecureRandomFuture.getLoginError(var33); // L: 2700
						return; // L: 2701
					}

					UserComparator6.method2503(7); // L: 2697
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2705 2706
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2707
				var2.offset = 0; // L: 2708
				class320.field3868 = var2.readUnsignedShort(); // L: 2709
				UserComparator6.method2503(8); // L: 2710
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class320.field3868) { // L: 2713 2714
				var2.offset = 0; // L: 2715
				((AbstractSocket)var1).read(var2.array, var2.offset, class320.field3868); // L: 2716
				class6 var23 = class135.method2797()[var2.readUnsignedByte()]; // L: 2717

				try {
					switch(var23.field12) { // L: 2721
					case 0:
						class0 var26 = new class0(); // L: 2728
						this.field507 = new class7(var2, var26); // L: 2734
						UserComparator6.method2503(9); // L: 2735
						break;
					default:
						throw new IllegalArgumentException(); // L: 2724
					}
				} catch (Exception var19) { // L: 2737
					SecureRandomFuture.getLoginError(22); // L: 2738
					return; // L: 2739
				}
			}

			if (loginState == 9 && this.field507.method46()) { // L: 2743 2744
				this.field579 = this.field507.method48(); // L: 2745
				this.field507.method47(); // L: 2746
				this.field507 = null; // L: 2747
				if (this.field579 == null) { // L: 2748
					SecureRandomFuture.getLoginError(22); // L: 2749
					return; // L: 2750
				}

				packetWriter.clearBuffer(); // L: 2752
				var4 = class92.method2296(); // L: 2755
				var4.clientPacket = null; // L: 2756
				var4.clientPacketLength = 0; // L: 2757
				var4.packetBuffer = new PacketBuffer(5000); // L: 2758
				var4.packetBuffer.writeByte(LoginPacket.field2900.id); // L: 2762
				var4.packetBuffer.writeShort(this.field579.offset); // L: 2763
				var4.packetBuffer.method6960(this.field579); // L: 2764
				packetWriter.addNode(var4); // L: 2765
				packetWriter.flush(); // L: 2766
				this.field579 = null; // L: 2767
				UserComparator6.method2503(6); // L: 2768
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2771 2772
				VarbitComposition.field1775 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2773
				UserComparator6.method2503(11); // L: 2774
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= VarbitComposition.field1775) { // L: 2777 2778
				((AbstractSocket)var1).read(var2.array, 0, VarbitComposition.field1775); // L: 2779
				var2.offset = 0; // L: 2780
				UserComparator6.method2503(6); // L: 2781
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2784 2785
				field498 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2786
				UserComparator6.method2503(13); // L: 2787
			}

			if (loginState == 13) { // L: 2790
				field496 = 0; // L: 2791
				class1.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field498 / 60 + " seconds."); // L: 2792
				if (--field498 <= 0) { // L: 2793
					UserComparator6.method2503(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2796 2797
					TextureProvider.field2485 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2798
					UserComparator6.method2503(15); // L: 2799
				}

				int var15;
				boolean var34;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= TextureProvider.field2485) { // L: 2802 2803
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2804
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2805
					var2.offset = 0; // L: 2806
					var34 = false; // L: 2807
					if (var13) { // L: 2808
						var14 = var2.readByteIsaac() << 24; // L: 2809
						var14 |= var2.readByteIsaac() << 16; // L: 2810
						var14 |= var2.readByteIsaac() << 8; // L: 2811
						var14 |= var2.readByteIsaac(); // L: 2812
						var15 = ClanChannel.method2824(Login.Login_username); // L: 2813
						if (class408.clientPreferences.parameters.size() >= 10 && !class408.clientPreferences.parameters.containsKey(var15)) { // L: 2814 2815
							Iterator var31 = class408.clientPreferences.parameters.entrySet().iterator(); // L: 2816
							var31.next(); // L: 2817
							var31.remove(); // L: 2818
						}

						class408.clientPreferences.parameters.put(var15, var14); // L: 2821
					}

					if (Login_isUsernameRemembered) { // L: 2823
						class408.clientPreferences.rememberedUsername = Login.Login_username; // L: 2824
					} else {
						class408.clientPreferences.rememberedUsername = null; // L: 2827
					}

					Login.savePreferences(); // L: 2829
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2830
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2831
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2832
					localPlayerIndex <<= 8; // L: 2833
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2834
					field588 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2835
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2836
					var2.offset = 0; // L: 2837
					ServerPacket[] var5 = class128.ServerPacket_values(); // L: 2838
					int var16 = var2.readSmartByteShortIsaac(); // L: 2839
					if (var16 < 0 || var16 >= var5.length) { // L: 2840
						throw new IOException(var16 + " " + var2.offset);
					}

					packetWriter.serverPacket = var5[var16]; // L: 2841
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2842
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2843
					var2.offset = 0; // L: 2844
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2845

					try {
						Client var17 = ArchiveLoader.client; // L: 2847
						JSObject.getWindow(var17).call("zap", (Object[])null); // L: 2850
					} catch (Throwable var18) { // L: 2853
					}

					UserComparator6.method2503(16); // L: 2854
				}

				if (loginState != 16) { // L: 2857
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2976 2977
						var2.offset = 0; // L: 2978
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2979
						var2.offset = 0; // L: 2980
						class122.field1420 = var2.readUnsignedShort(); // L: 2981
						UserComparator6.method2503(18); // L: 2982
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class122.field1420) { // L: 2985 2986
						var2.offset = 0; // L: 2987
						((AbstractSocket)var1).read(var2.array, 0, class122.field1420); // L: 2988
						var2.offset = 0; // L: 2989
						String var27 = var2.readStringCp1252NullTerminated(); // L: 2990
						String var30 = var2.readStringCp1252NullTerminated(); // L: 2991
						String var28 = var2.readStringCp1252NullTerminated(); // L: 2992
						class1.setLoginResponseString(var27, var30, var28); // L: 2993
						WorldMapData_1.updateGameState(10); // L: 2994
					}

					if (loginState == 19) { // L: 2997
						if (packetWriter.serverPacketLength == -1) { // L: 2998
							if (((AbstractSocket)var1).available() < 2) { // L: 2999
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 3000
							var2.offset = 0; // L: 3001
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 3002
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 3004
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 3005
							var2.offset = 0; // L: 3006
							var33 = packetWriter.serverPacketLength; // L: 3007
							timer.method5970(); // L: 3008
							Bounds.method6370(); // L: 3009
							LoginScreenAnimation.updatePlayer(var2); // L: 3010
							if (var33 != var2.offset) { // L: 3011
								throw new RuntimeException(); // L: 3012
							}
						}
					} else {
						++field496; // L: 3016
						if (field496 > 2000) { // L: 3017
							if (field685 < 1) { // L: 3018
								if (ScriptEvent.currentPort == ApproximateRouteStrategy.worldPort) { // L: 3019
									ScriptEvent.currentPort = ParamComposition.js5Port;
								} else {
									ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort; // L: 3020
								}

								++field685; // L: 3021
								UserComparator6.method2503(0); // L: 3022
							} else {
								SecureRandomFuture.getLoginError(-3); // L: 3025
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2858
						var2.offset = 0; // L: 2859
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2860
						timer.method5974(); // L: 2861
						mouseLastLastPressedTimeMillis = -1L; // L: 2864
						Interpreter.mouseRecorder.index = 0; // L: 2865
						WorldMapSectionType.hasFocus = true; // L: 2866
						hadFocus = true; // L: 2867
						field565 = -1L; // L: 2868
						class125.method2637(); // L: 2869
						packetWriter.clearBuffer(); // L: 2870
						packetWriter.packetBuffer.offset = 0; // L: 2871
						packetWriter.serverPacket = null; // L: 2872
						packetWriter.field1277 = null; // L: 2873
						packetWriter.field1284 = null; // L: 2874
						packetWriter.field1285 = null; // L: 2875
						packetWriter.serverPacketLength = 0; // L: 2876
						packetWriter.field1275 = 0; // L: 2877
						rebootTimer = 0; // L: 2878
						logoutTimer = 0; // L: 2879
						hintArrowType = 0; // L: 2880
						KeyHandler.method343(); // L: 2881
						ClanSettings.method2703(0); // L: 2882
						Strings.method5220(); // L: 2883
						isItemSelected = 0; // L: 2884
						isSpellSelected = false; // L: 2885
						soundEffectCount = 0; // L: 2886
						camAngleY = 0; // L: 2887
						oculusOrbState = 0; // L: 2888
						ClanSettings.field1440 = null; // L: 2889
						minimapState = 0; // L: 2890
						field701 = -1; // L: 2891
						destinationX = 0; // L: 2892
						destinationY = 0; // L: 2893
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2894
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2895
						npcCount = 0; // L: 2896
						Players.Players_count = 0; // L: 2898

						for (var33 = 0; var33 < 2048; ++var33) { // L: 2899
							Players.field1242[var33] = null; // L: 2900
							Players.field1241[var33] = 1; // L: 2901
						}

						for (var33 = 0; var33 < 2048; ++var33) { // L: 2904
							players[var33] = null;
						}

						for (var33 = 0; var33 < 32768; ++var33) { // L: 2905
							npcs[var33] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2906
						projectiles.clear(); // L: 2907
						graphicsObjects.clear(); // L: 2908

						for (var33 = 0; var33 < 4; ++var33) { // L: 2909
							for (var14 = 0; var14 < 104; ++var14) { // L: 2910
								for (var15 = 0; var15 < 104; ++var15) { // L: 2911
									groundItems[var33][var14][var15] = null; // L: 2912
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2916
						class112.friendSystem.clear(); // L: 2917

						for (var33 = 0; var33 < VarpDefinition.VarpDefinition_fileCount; ++var33) { // L: 2918
							VarpDefinition var29 = ArchiveLoader.VarpDefinition_get(var33); // L: 2919
							if (var29 != null) { // L: 2920
								Varps.Varps_temp[var33] = 0; // L: 2921
								Varps.Varps_main[var33] = 0; // L: 2922
							}
						}

						Message.varcs.clearTransient(); // L: 2925
						followerIndex = -1; // L: 2926
						if (rootInterface != -1) { // L: 2927
							var33 = rootInterface; // L: 2928
							if (var33 != -1 && class132.Widget_loadedInterfaces[var33]) { // L: 2930 2931
								class283.Widget_archive.clearFilesGroup(var33); // L: 2932
								if (WorldMapSection1.Widget_interfaceComponents[var33] != null) { // L: 2933
									var34 = true; // L: 2934

									for (var15 = 0; var15 < WorldMapSection1.Widget_interfaceComponents[var33].length; ++var15) { // L: 2935
										if (WorldMapSection1.Widget_interfaceComponents[var33][var15] != null) { // L: 2936
											if (WorldMapSection1.Widget_interfaceComponents[var33][var15].type != 2) { // L: 2937
												WorldMapSection1.Widget_interfaceComponents[var33][var15] = null;
											} else {
												var34 = false; // L: 2938
											}
										}
									}

									if (var34) { // L: 2941
										WorldMapSection1.Widget_interfaceComponents[var33] = null;
									}

									class132.Widget_loadedInterfaces[var33] = false; // L: 2942
								}
							}
						}

						for (InterfaceParent var24 = (InterfaceParent)interfaceParents.first(); var24 != null; var24 = (InterfaceParent)interfaceParents.next()) { // L: 2945
							Players.closeInterface(var24, true); // L: 2946
						}

						rootInterface = -1; // L: 2948
						interfaceParents = new NodeHashTable(8); // L: 2949
						meslayerContinueWidget = null; // L: 2950
						KeyHandler.method343(); // L: 2951
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2952

						for (var33 = 0; var33 < 8; ++var33) { // L: 2953
							playerMenuActions[var33] = null; // L: 2954
							playerOptionsPriorities[var33] = false; // L: 2955
						}

						GrandExchangeOfferUnitPriceComparator.method5485(); // L: 2957
						isLoading = true; // L: 2958

						for (var33 = 0; var33 < 100; ++var33) { // L: 2959
							field594[var33] = true;
						}

						Frames.method4481(); // L: 2960
						AbstractArchive.friendsChat = null; // L: 2961
						class67.guestClanSettings = null; // L: 2962
						Arrays.fill(currentClanSettings, (Object)null); // L: 2963
						class115.guestClanChannel = null; // L: 2964
						Arrays.fill(currentClanChannels, (Object)null); // L: 2965

						for (var33 = 0; var33 < 8; ++var33) { // L: 2966
							grandExchangeOffers[var33] = new GrandExchangeOffer();
						}

						JagexCache.grandExchangeEvents = null; // L: 2967
						LoginScreenAnimation.updatePlayer(var2); // L: 2969
						ItemLayer.field2243 = -1; // L: 2970
						Canvas.loadRegions(false, var2); // L: 2971
						packetWriter.serverPacket = null; // L: 2972
					}

				}
			}
		} catch (IOException var21) { // L: 3029
			if (field685 < 1) { // L: 3030
				if (ApproximateRouteStrategy.worldPort == ScriptEvent.currentPort) { // L: 3031
					ScriptEvent.currentPort = ParamComposition.js5Port;
				} else {
					ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort; // L: 3032
				}

				++field685; // L: 3033
				UserComparator6.method2503(0); // L: 3034
			} else {
				SecureRandomFuture.getLoginError(-2); // L: 3037
			}
		}
	} // L: 2794 2974 3014 3023 3026 3035 3038 3040

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-681213511"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3295
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3296
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3297
			hadNetworkError = false; // L: 3298
			Clock.method2960(); // L: 3299
		} else {
			if (!isMenuOpen) { // L: 3302
				FriendSystem.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1180(packetWriter); ++var1) { // L: 3303 3304
			}

			if (gameState == 30) { // L: 3306
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class54.reflectionChecks.last(); // L: 3310
					boolean var32;
					if (var2 == null) { // L: 3311
						var32 = false; // L: 3312
					} else {
						var32 = true; // L: 3315
					}

					int var3;
					PacketBufferNode var33;
					if (!var32) { // L: 3317
						PacketBufferNode var14;
						int var15;
						if (timer.field3900) { // L: 3325
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2666, packetWriter.isaacCipher); // L: 3327
							var14.packetBuffer.writeByte(0); // L: 3328
							var15 = var14.packetBuffer.offset; // L: 3329
							timer.write(var14.packetBuffer); // L: 3330
							var14.packetBuffer.method6963(var14.packetBuffer.offset - var15); // L: 3331
							packetWriter.addNode(var14); // L: 3332
							timer.method5975(); // L: 3333
						}

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
						synchronized(Interpreter.mouseRecorder.lock) { // L: 3336
							if (!field497) { // L: 3337
								Interpreter.mouseRecorder.index = 0; // L: 3423
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Interpreter.mouseRecorder.index >= 40) { // L: 3338
								var33 = null; // L: 3340
								var3 = 0; // L: 3341
								var4 = 0; // L: 3342
								var5 = 0; // L: 3343
								var6 = 0; // L: 3344

								for (var7 = 0; var7 < Interpreter.mouseRecorder.index && (var33 == null || var33.packetBuffer.offset - var3 < 246); ++var7) { // L: 3345 3346
									var4 = var7; // L: 3347
									var8 = Interpreter.mouseRecorder.ys[var7]; // L: 3348
									if (var8 < -1) { // L: 3349
										var8 = -1;
									} else if (var8 > 65534) { // L: 3350
										var8 = 65534;
									}

									var9 = Interpreter.mouseRecorder.xs[var7]; // L: 3351
									if (var9 < -1) { // L: 3352
										var9 = -1;
									} else if (var9 > 65534) { // L: 3353
										var9 = 65534;
									}

									if (var9 != field475 || var8 != field476) { // L: 3354
										if (var33 == null) { // L: 3357
											var33 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2704, packetWriter.isaacCipher); // L: 3358
											var33.packetBuffer.writeByte(0); // L: 3359
											var3 = var33.packetBuffer.offset; // L: 3360
											var10000 = var33.packetBuffer; // L: 3361
											var10000.offset += 2;
											var5 = 0; // L: 3362
											var6 = 0; // L: 3363
										}

										if (field477 != -1L) { // L: 3368
											var10 = var9 - field475; // L: 3369
											var11 = var8 - field476; // L: 3370
											var12 = (int)((Interpreter.mouseRecorder.millis[var7] - field477) / 20L); // L: 3371
											var5 = (int)((long)var5 + (Interpreter.mouseRecorder.millis[var7] - field477) % 20L); // L: 3372
										} else {
											var10 = var9; // L: 3375
											var11 = var8; // L: 3376
											var12 = Integer.MAX_VALUE; // L: 3377
										}

										field475 = var9; // L: 3379
										field476 = var8; // L: 3380
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3381
											var10 += 32; // L: 3382
											var11 += 32; // L: 3383
											var33.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3384
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3386
											var10 += 128; // L: 3387
											var11 += 128; // L: 3388
											var33.packetBuffer.writeByte(var12 + 128); // L: 3389
											var33.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3390
										} else if (var12 < 32) { // L: 3392
											var33.packetBuffer.writeByte(var12 + 192); // L: 3393
											if (var9 != -1 && var8 != -1) { // L: 3394
												var33.packetBuffer.writeInt(var9 | var8 << 16); // L: 3395
											} else {
												var33.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var33.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3398
											if (var9 != -1 && var8 != -1) { // L: 3399
												var33.packetBuffer.writeInt(var9 | var8 << 16); // L: 3400
											} else {
												var33.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3402
										field477 = Interpreter.mouseRecorder.millis[var7]; // L: 3403
									}
								}

								if (var33 != null) { // L: 3405
									var33.packetBuffer.method6963(var33.packetBuffer.offset - var3); // L: 3406
									var7 = var33.packetBuffer.offset; // L: 3407
									var33.packetBuffer.offset = var3; // L: 3408
									var33.packetBuffer.writeByte(var5 / var6); // L: 3409
									var33.packetBuffer.writeByte(var5 % var6); // L: 3410
									var33.packetBuffer.offset = var7; // L: 3411
									packetWriter.addNode(var33); // L: 3412
								}

								if (var4 >= Interpreter.mouseRecorder.index) { // L: 3414
									Interpreter.mouseRecorder.index = 0;
								} else {
									MouseRecorder var55 = Interpreter.mouseRecorder; // L: 3416
									var55.index -= var4;
									System.arraycopy(Interpreter.mouseRecorder.xs, var4, Interpreter.mouseRecorder.xs, 0, Interpreter.mouseRecorder.index); // L: 3417
									System.arraycopy(Interpreter.mouseRecorder.ys, var4, Interpreter.mouseRecorder.ys, 0, Interpreter.mouseRecorder.index); // L: 3418
									System.arraycopy(Interpreter.mouseRecorder.millis, var4, Interpreter.mouseRecorder.millis, 0, Interpreter.mouseRecorder.index); // L: 3419
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3425
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3426
							if (var16 > 32767L) { // L: 3427
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3428
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3429
							if (var3 < 0) { // L: 3430
								var3 = 0;
							} else if (var3 > KeyHandler.canvasHeight) { // L: 3431
								var3 = KeyHandler.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3432
							if (var4 < 0) { // L: 3433
								var4 = 0;
							} else if (var4 > GameEngine.canvasWidth) { // L: 3434
								var4 = GameEngine.canvasWidth;
							}

							var5 = (int)var16; // L: 3435
							var18 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2725, packetWriter.isaacCipher); // L: 3436
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3437
							var18.packetBuffer.writeShort(var4); // L: 3438
							var18.packetBuffer.writeShort(var3); // L: 3439
							packetWriter.addNode(var18); // L: 3440
						}

						if (KeyHandler.field110 > 0) { // L: 3442
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2716, packetWriter.isaacCipher); // L: 3443
							var14.packetBuffer.writeShort(0); // L: 3444
							var15 = var14.packetBuffer.offset; // L: 3445
							long var19 = class111.method2516(); // L: 3446

							for (var5 = 0; var5 < KeyHandler.field110; ++var5) { // L: 3447
								long var21 = var19 - field565; // L: 3448
								if (var21 > 16777215L) { // L: 3449
									var21 = 16777215L;
								}

								field565 = var19; // L: 3450
								var14.packetBuffer.method7009((int)var21); // L: 3451
								var14.packetBuffer.method6947(KeyHandler.field125[var5]); // L: 3452
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3454
							packetWriter.addNode(var14); // L: 3455
						}

						if (field620 > 0) { // L: 3457
							--field620;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3458
							field555 = true;
						}

						if (field555 && field620 <= 0) { // L: 3459
							field620 = 20; // L: 3460
							field555 = false; // L: 3461
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2699, packetWriter.isaacCipher); // L: 3463
							var14.packetBuffer.method7001(camAngleX); // L: 3464
							var14.packetBuffer.method7003(camAngleY); // L: 3465
							packetWriter.addNode(var14); // L: 3466
						}

						if (WorldMapSectionType.hasFocus && !hadFocus) { // L: 3468
							hadFocus = true; // L: 3469
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2743, packetWriter.isaacCipher); // L: 3471
							var14.packetBuffer.writeByte(1); // L: 3472
							packetWriter.addNode(var14); // L: 3473
						}

						if (!WorldMapSectionType.hasFocus && hadFocus) { // L: 3475
							hadFocus = false; // L: 3476
							var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2743, packetWriter.isaacCipher); // L: 3478
							var14.packetBuffer.writeByte(0); // L: 3479
							packetWriter.addNode(var14); // L: 3480
						}

						if (class133.worldMap != null) { // L: 3483
							class133.worldMap.method6487();
						}

						if (class6.ClanChat_inClanChat) { // L: 3485
							if (AbstractArchive.friendsChat != null) { // L: 3486
								AbstractArchive.friendsChat.sort(); // L: 3487
							}

							TileItem.method2315(); // L: 3489
							class6.ClanChat_inClanChat = false; // L: 3490
						}

						if (class29.field162) { // L: 3494
							UserComparator10.method2494(); // L: 3495
							class29.field162 = false; // L: 3496
						}

						if (GrandExchangeOfferTotalQuantityComparator.Client_plane != field701) { // L: 3500
							field701 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 3501
							var1 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 3502
							int[] var34 = class10.sceneMinimapSprite.pixels; // L: 3504
							var3 = var34.length; // L: 3505

							for (var4 = 0; var4 < var3; ++var4) { // L: 3506
								var34[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) { // L: 3507
								var5 = (103 - var4) * 2048 + 24628; // L: 3508

								for (var6 = 1; var6 < 103; ++var6) { // L: 3509
									if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) { // L: 3510
										GameBuild.scene.drawTileMinimap(var34, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) { // L: 3511
										GameBuild.scene.drawTileMinimap(var34, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4; // L: 3512
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3515
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3516
							class10.sceneMinimapSprite.setRaster(); // L: 3517

							for (var6 = 1; var6 < 103; ++var6) { // L: 3518
								for (var7 = 1; var7 < 103; ++var7) { // L: 3519
									if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) { // L: 3520
										class111.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) { // L: 3521
										class111.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0; // L: 3524

							for (var6 = 0; var6 < 104; ++var6) { // L: 3525
								for (var7 = 0; var7 < 104; ++var7) { // L: 3526
									long var23 = GameBuild.scene.getFloorDecorationTag(GrandExchangeOfferTotalQuantityComparator.Client_plane, var6, var7); // L: 3527
									if (var23 != 0L) { // L: 3528
										var10 = class21.Entity_unpackID(var23); // L: 3529
										var11 = KitDefinition.getObjectDefinition(var10).mapIconId; // L: 3530
										if (var11 >= 0 && ItemComposition.WorldMapElement_get(var11).field1629) { // L: 3531 3532
											mapIcons[mapIconCount] = ItemComposition.WorldMapElement_get(var11).getSpriteBool(false); // L: 3535
											mapIconXs[mapIconCount] = var6; // L: 3536
											mapIconYs[mapIconCount] = var7; // L: 3537
											++mapIconCount; // L: 3538
										}
									}
								}
							}

							Canvas.rasterProvider.apply(); // L: 3543
						}

						if (gameState != 30) { // L: 3547
							return;
						}

						for (PendingSpawn var42 = (PendingSpawn)pendingSpawns.last(); var42 != null; var42 = (PendingSpawn)pendingSpawns.previous()) { // L: 3549 3550 3569
							if (var42.hitpoints > 0) { // L: 3551
								--var42.hitpoints;
							}

							if (var42.hitpoints == 0) { // L: 3552
								if (var42.objectId < 0 || NPC.method2265(var42.objectId, var42.field1076)) { // L: 3553
									MusicPatchNode2.addPendingSpawnToScene(var42.plane, var42.type, var42.x, var42.y, var42.objectId, var42.field1075, var42.field1076); // L: 3554
									var42.remove(); // L: 3555
								}
							} else {
								if (var42.delay > 0) { // L: 3559
									--var42.delay;
								}

								if (var42.delay == 0 && var42.x >= 1 && var42.y >= 1 && var42.x <= 102 && var42.y <= 102 && (var42.id < 0 || NPC.method2265(var42.id, var42.field1082))) { // L: 3560 3561
									MusicPatchNode2.addPendingSpawnToScene(var42.plane, var42.type, var42.x, var42.y, var42.id, var42.orientation, var42.field1082); // L: 3562
									var42.delay = -1; // L: 3563
									if (var42.id == var42.objectId && var42.objectId == -1) { // L: 3564
										var42.remove();
									} else if (var42.objectId == var42.id && var42.field1075 == var42.orientation && var42.field1076 == var42.field1082) { // L: 3565
										var42.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3573
							var10002 = queuedSoundEffectDelays[var1]--; // L: 3574
							if (queuedSoundEffectDelays[var1] >= -10) { // L: 3575
								SoundEffect var35 = soundEffects[var1]; // L: 3587
								if (var35 == null) { // L: 3588
									var10000 = null; // L: 3589
									var35 = SoundEffect.readSoundEffect(class12.archive4, soundEffectIds[var1], 0);
									if (var35 == null) { // L: 3590
										continue;
									}

									int[] var56 = queuedSoundEffectDelays; // L: 3591
									var56[var1] += var35.calculateDelay();
									soundEffects[var1] = var35; // L: 3592
								}

								if (queuedSoundEffectDelays[var1] < 0) { // L: 3598
									if (soundLocations[var1] != 0) { // L: 3600
										var4 = (soundLocations[var1] & 255) * 128; // L: 3601
										var5 = soundLocations[var1] >> 16 & 255; // L: 3602
										var6 = var5 * 128 + 64 - HealthBarDefinition.localPlayer.x; // L: 3603
										if (var6 < 0) { // L: 3604
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255; // L: 3605
										var8 = var7 * 128 + 64 - HealthBarDefinition.localPlayer.y; // L: 3606
										if (var8 < 0) { // L: 3607
											var8 = -var8;
										}

										var9 = var8 + var6 - 128; // L: 3608
										if (var9 > var4) { // L: 3609
											queuedSoundEffectDelays[var1] = -100; // L: 3610
											continue; // L: 3611
										}

										if (var9 < 0) { // L: 3613
											var9 = 0;
										}

										var3 = (var4 - var9) * class408.clientPreferences.areaSoundEffectsVolume / var4; // L: 3614
									} else {
										var3 = class408.clientPreferences.soundEffectsVolume; // L: 3616
									}

									if (var3 > 0) { // L: 3617
										RawSound var25 = var35.toRawSound().resample(FontName.decimator); // L: 3618
										RawPcmStream var26 = RawPcmStream.createRawPcmStream(var25, 100, var3); // L: 3619
										var26.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3620
										BuddyRankComparator.pcmStreamMixer.addSubStream(var26); // L: 3621
									}

									queuedSoundEffectDelays[var1] = -100; // L: 3623
								}
							} else {
								--soundEffectCount; // L: 3576

								for (var15 = var1; var15 < soundEffectCount; ++var15) { // L: 3577
									soundEffectIds[var15] = soundEffectIds[var15 + 1]; // L: 3578
									soundEffects[var15] = soundEffects[var15 + 1]; // L: 3579
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1]; // L: 3580
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1]; // L: 3581
									soundLocations[var15] = soundLocations[var15 + 1]; // L: 3582
								}

								--var1; // L: 3584
							}
						}

						if (field710) { // L: 3626
							if (class247.musicPlayerStatus != 0) { // L: 3629
								var32 = true; // L: 3630
							} else {
								var32 = class247.midiPcmStream.isReady(); // L: 3633
							}

							if (!var32) { // L: 3635
								if (class408.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) { // L: 3636
									Archive var36 = Messages.archive6; // L: 3637
									var3 = currentTrackGroupId; // L: 3638
									var4 = class408.clientPreferences.musicVolume; // L: 3639
									class247.musicPlayerStatus = 1; // L: 3641
									class128.musicTrackArchive = var36; // L: 3642
									FillMode.musicTrackGroupId = var3; // L: 3643
									ArchiveDiskActionHandler.musicTrackFileId = 0; // L: 3644
									class247.musicTrackVolume = var4; // L: 3645
									SecureRandomCallable.musicTrackBoolean = false; // L: 3646
									class247.pcmSampleLength = 10000; // L: 3647
								}

								field710 = false; // L: 3650
							}
						}

						++packetWriter.field1275; // L: 3654
						if (packetWriter.field1275 > 750) { // L: 3655
							Clock.method2960(); // L: 3656
							return; // L: 3657
						}

						VerticalAlignment.method3159(); // L: 3659

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3661
							var15 = npcIndices[var1]; // L: 3662
							NPC var27 = npcs[var15]; // L: 3663
							if (var27 != null) { // L: 3664
								class135.updateActorSequence(var27, var27.definition.size); // L: 3665
							}
						}

						int[] var43 = Players.Players_indices; // L: 3670

						for (var15 = 0; var15 < Players.Players_count; ++var15) { // L: 3671
							Player var53 = players[var43[var15]]; // L: 3672
							if (var53 != null && var53.overheadTextCyclesRemaining > 0) { // L: 3673
								--var53.overheadTextCyclesRemaining; // L: 3674
								if (var53.overheadTextCyclesRemaining == 0) { // L: 3675
									var53.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) { // L: 3678
							var3 = npcIndices[var15]; // L: 3679
							NPC var48 = npcs[var3]; // L: 3680
							if (var48 != null && var48.overheadTextCyclesRemaining > 0) { // L: 3681
								--var48.overheadTextCyclesRemaining; // L: 3682
								if (var48.overheadTextCyclesRemaining == 0) { // L: 3683
									var48.overheadText = null;
								}
							}
						}

						++field531; // L: 3687
						if (mouseCrossColor != 0) { // L: 3688
							mouseCrossState += 20; // L: 3689
							if (mouseCrossState >= 400) { // L: 3690
								mouseCrossColor = 0;
							}
						}

						if (WorldMapSection2.field2037 != null) { // L: 3692
							++field576; // L: 3693
							if (field576 >= 15) { // L: 3694
								class184.invalidateWidget(WorldMapSection2.field2037); // L: 3695
								WorldMapSection2.field2037 = null; // L: 3696
							}
						}

						Widget var44 = WorldMapData_0.mousedOverWidgetIf1; // L: 3699
						Widget var37 = Skills.field3247; // L: 3700
						WorldMapData_0.mousedOverWidgetIf1 = null; // L: 3701
						Skills.field3247 = null; // L: 3702
						draggedOnWidget = null; // L: 3703
						field680 = false; // L: 3704
						field648 = false; // L: 3705
						field695 = 0; // L: 3706

						while (WorldMapElement.isKeyDown() && field695 < 128) { // L: 3707
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class12.field55 == 66) { // L: 3708
								String var49 = ""; // L: 3711

								Message var45;
								for (Iterator var50 = Messages.Messages_hashTable.iterator(); var50.hasNext(); var49 = var49 + var45.sender + ':' + var45.text + '\n') { // L: 3712 3715
									var45 = (Message)var50.next(); // L: 3713
								}

								ArchiveLoader.client.method484(var49); // L: 3721
							} else if (oculusOrbState != 1 || class319.field3858 <= 0) { // L: 3724
								field697[field695] = class12.field55; // L: 3727
								field696[field695] = class319.field3858; // L: 3728
								++field695; // L: 3729
							}
						}

						boolean var38 = staffModLevel >= 2; // L: 3733
						if (var38 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3735
							var4 = HealthBarDefinition.localPlayer.plane - mouseWheelRotation; // L: 3736
							if (var4 < 0) { // L: 3737
								var4 = 0;
							} else if (var4 > 3) { // L: 3738
								var4 = 3;
							}

							if (var4 != HealthBarDefinition.localPlayer.plane) { // L: 3739
								InvDefinition.method2986(HealthBarDefinition.localPlayer.pathX[0] + class19.baseX, HealthBarDefinition.localPlayer.pathY[0] + DefaultsGroup.baseY, var4, false); // L: 3740
							}

							mouseWheelRotation = 0; // L: 3742
						}

						if (rootInterface != -1) { // L: 3744
							Messages.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, KeyHandler.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3745

						while (true) {
							Widget var46;
							ScriptEvent var51;
							Widget var52;
							do {
								var51 = (ScriptEvent)field674.removeLast(); // L: 3747
								if (var51 == null) { // L: 3748
									while (true) {
										do {
											var51 = (ScriptEvent)field675.removeLast(); // L: 3759
											if (var51 == null) { // L: 3760
												while (true) {
													do {
														var51 = (ScriptEvent)scriptEvents.removeLast(); // L: 3771
														if (var51 == null) { // L: 3772
															this.menu(); // L: 3782
															if (class133.worldMap != null) { // L: 3784
																class133.worldMap.method6497(GrandExchangeOfferTotalQuantityComparator.Client_plane, (HealthBarDefinition.localPlayer.x >> 7) + class19.baseX, (HealthBarDefinition.localPlayer.y >> 7) + DefaultsGroup.baseY, false); // L: 3785
																class133.worldMap.loadCache(); // L: 3786
															}

															if (clickedWidget != null) { // L: 3789
																this.method1186();
															}

															if (class247.dragInventoryWidget != null) { // L: 3790
																class184.invalidateWidget(class247.dragInventoryWidget); // L: 3791
																++itemDragDuration; // L: 3792
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3793
																	if (field667) { // L: 3794
																		if (class274.hoveredItemContainer == class247.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) { // L: 3795
																			Widget var54 = class247.dragInventoryWidget; // L: 3796
																			byte var39 = 0; // L: 3797
																			if (field656 == 1 && var54.contentType == 206) { // L: 3798
																				var39 = 1;
																			}

																			if (var54.itemIds[dragItemSlotDestination] <= 0) { // L: 3799
																				var39 = 0;
																			}

																			if (TileItem.method2316(PendingSpawn.getWidgetFlags(var54))) { // L: 3800
																				var6 = dragItemSlotSource; // L: 3801
																				var7 = dragItemSlotDestination; // L: 3802
																				var54.itemIds[var7] = var54.itemIds[var6]; // L: 3803
																				var54.itemQuantities[var7] = var54.itemQuantities[var6]; // L: 3804
																				var54.itemIds[var6] = -1; // L: 3805
																				var54.itemQuantities[var6] = 0; // L: 3806
																			} else if (var39 == 1) { // L: 3808
																				var6 = dragItemSlotSource; // L: 3809
																				var7 = dragItemSlotDestination; // L: 3810

																				while (var7 != var6) { // L: 3811
																					if (var6 > var7) { // L: 3812
																						var54.swapItems(var6 - 1, var6); // L: 3813
																						--var6; // L: 3814
																					} else if (var6 < var7) { // L: 3816
																						var54.swapItems(var6 + 1, var6); // L: 3817
																						++var6; // L: 3818
																					}
																				}
																			} else {
																				var54.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3823
																			}

																			var18 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2669, packetWriter.isaacCipher); // L: 3826
																			var18.packetBuffer.method7001(dragItemSlotDestination); // L: 3827
																			var18.packetBuffer.method7003(dragItemSlotSource); // L: 3828
																			var18.packetBuffer.method6993(var39); // L: 3829
																			var18.packetBuffer.method7010(class247.dragInventoryWidget.id); // L: 3830
																			packetWriter.addNode(var18); // L: 3831
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3835
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3836
																	} else if (menuOptionsCount > 0) { // L: 3838
																		var4 = draggedWidgetX; // L: 3839
																		var5 = draggedWidgetY; // L: 3840
																		MenuAction var47 = class274.tempMenuAction; // L: 3842
																		class14.menuAction(var47.param0, var47.param1, var47.opcode, var47.identifier, var47.action, var47.action, var4, var5); // L: 3844
																		class274.tempMenuAction = null; // L: 3846
																	}

																	field576 = 10; // L: 3850
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3851
																	class247.dragInventoryWidget = null; // L: 3852
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3855 3856
																	field667 = true; // L: 3857
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3862
																var4 = Scene.Scene_selectedX; // L: 3863
																var5 = Scene.Scene_selectedY; // L: 3864
																var18 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2703, packetWriter.isaacCipher); // L: 3866
																var18.packetBuffer.writeByte(5); // L: 3867
																var18.packetBuffer.method6962(var4 + class19.baseX); // L: 3868
																var18.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3869
																var18.packetBuffer.method7003(var5 + DefaultsGroup.baseY); // L: 3870
																packetWriter.addNode(var18); // L: 3871
																Scene.method4451(); // L: 3872
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3873
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3874
																mouseCrossColor = 1; // L: 3875
																mouseCrossState = 0; // L: 3876
																destinationX = var4; // L: 3877
																destinationY = var5; // L: 3878
															}

															if (var44 != WorldMapData_0.mousedOverWidgetIf1) { // L: 3880
																if (var44 != null) { // L: 3881
																	class184.invalidateWidget(var44);
																}

																if (WorldMapData_0.mousedOverWidgetIf1 != null) { // L: 3882
																	class184.invalidateWidget(WorldMapData_0.mousedOverWidgetIf1);
																}
															}

															if (var37 != Skills.field3247 && field714 == field621) { // L: 3884
																if (var37 != null) { // L: 3885
																	class184.invalidateWidget(var37);
																}

																if (Skills.field3247 != null) { // L: 3886
																	class184.invalidateWidget(Skills.field3247);
																}
															}

															if (Skills.field3247 != null) { // L: 3888
																if (field621 < field714) { // L: 3889
																	++field621; // L: 3890
																	if (field621 == field714) { // L: 3891
																		class184.invalidateWidget(Skills.field3247);
																	}
																}
															} else if (field621 > 0) { // L: 3894
																--field621;
															}

															if (oculusOrbState == 0) { // L: 3896
																var4 = HealthBarDefinition.localPlayer.x; // L: 3897
																var5 = HealthBarDefinition.localPlayer.y; // L: 3898
																if (class320.oculusOrbFocalPointX - var4 < -500 || class320.oculusOrbFocalPointX - var4 > 500 || class18.oculusOrbFocalPointY - var5 < -500 || class18.oculusOrbFocalPointY - var5 > 500) { // L: 3899
																	class320.oculusOrbFocalPointX = var4; // L: 3900
																	class18.oculusOrbFocalPointY = var5; // L: 3901
																}

																if (var4 != class320.oculusOrbFocalPointX) { // L: 3903
																	class320.oculusOrbFocalPointX += (var4 - class320.oculusOrbFocalPointX) / 16;
																}

																if (var5 != class18.oculusOrbFocalPointY) { // L: 3904
																	class18.oculusOrbFocalPointY += (var5 - class18.oculusOrbFocalPointY) / 16;
																}

																var6 = class320.oculusOrbFocalPointX >> 7; // L: 3905
																var7 = class18.oculusOrbFocalPointY >> 7; // L: 3906
																var8 = class392.getTileHeight(class320.oculusOrbFocalPointX, class18.oculusOrbFocalPointY, GrandExchangeOfferTotalQuantityComparator.Client_plane); // L: 3907
																var9 = 0; // L: 3908
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3909
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3910
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3911
																			var12 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 3912
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3913
																				++var12;
																			}

																			int var28 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3914
																			if (var28 > var9) { // L: 3915
																				var9 = var28;
																			}
																		}
																	}
																}

																var10 = var9 * 192; // L: 3919
																if (var10 > 98048) { // L: 3920
																	var10 = 98048;
																}

																if (var10 < 32768) { // L: 3921
																	var10 = 32768;
																}

																if (var10 > field556) { // L: 3922
																	field556 += (var10 - field556) / 24;
																} else if (var10 < field556) { // L: 3923
																	field556 += (var10 - field556) / 80;
																}

																DynamicObject.field942 = class392.getTileHeight(HealthBarDefinition.localPlayer.x, HealthBarDefinition.localPlayer.y, GrandExchangeOfferTotalQuantityComparator.Client_plane) - camFollowHeight; // L: 3924
															} else if (oculusOrbState == 1) { // L: 3926
																if (field511 && HealthBarDefinition.localPlayer != null) { // L: 3928
																	var4 = HealthBarDefinition.localPlayer.pathX[0]; // L: 3929
																	var5 = HealthBarDefinition.localPlayer.pathY[0]; // L: 3930
																	if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 3931
																		class320.oculusOrbFocalPointX = HealthBarDefinition.localPlayer.x; // L: 3932
																		var6 = class392.getTileHeight(HealthBarDefinition.localPlayer.x, HealthBarDefinition.localPlayer.y, GrandExchangeOfferTotalQuantityComparator.Client_plane) - camFollowHeight; // L: 3933
																		if (var6 < DynamicObject.field942) { // L: 3934
																			DynamicObject.field942 = var6;
																		}

																		class18.oculusOrbFocalPointY = HealthBarDefinition.localPlayer.y; // L: 3935
																		field511 = false; // L: 3936
																	}
																}

																short var40 = -1; // L: 3939
																if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3940
																	var40 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3941
																	var40 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3942
																	if (var40 == 0) { // L: 3943
																		var40 = 1792;
																	} else if (var40 == 1024) { // L: 3944
																		var40 = 1280;
																	} else {
																		var40 = 1536; // L: 3945
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3947
																	if (var40 == 0) { // L: 3948
																		var40 = 256;
																	} else if (var40 == 1024) { // L: 3949
																		var40 = 768;
																	} else {
																		var40 = 512; // L: 3950
																	}
																}

																byte var41 = 0; // L: 3952
																if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3953
																	var41 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3954
																	var41 = 1;
																}

																var6 = 0; // L: 3955
																if (var40 >= 0 || var41 != 0) { // L: 3956
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * -1748111485 * 2001475371 : oculusOrbNormalSpeed * -347452533 * -567507933; // L: 3957
																	var6 *= 16; // L: 3958
																	field520 = var40; // L: 3959
																	field549 = var41; // L: 3960
																}

																if (field547 < var6) { // L: 3962
																	field547 += var6 / 8; // L: 3963
																	if (field547 > var6) { // L: 3964
																		field547 = var6;
																	}
																} else if (field547 > var6) { // L: 3966
																	field547 = field547 * 9 / 10;
																}

																if (field547 > 0) { // L: 3967
																	var7 = field547 / 16; // L: 3968
																	if (field520 >= 0) { // L: 3969
																		var4 = field520 - WorldMapRegion.cameraYaw & 2047; // L: 3970
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3971
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3972
																		class320.oculusOrbFocalPointX += var8 * var7 / 65536; // L: 3973
																		class18.oculusOrbFocalPointY += var7 * var9 / 65536; // L: 3974
																	}

																	if (field549 != 0) { // L: 3976
																		DynamicObject.field942 += var7 * field549; // L: 3977
																		if (DynamicObject.field942 > 0) { // L: 3978
																			DynamicObject.field942 = 0;
																		}
																	}
																} else {
																	field520 = -1; // L: 3982
																	field549 = -1; // L: 3983
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3985
																	class29.method413(); // L: 3986
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && ApproximateRouteStrategy.mouseCam) { // L: 3989
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY; // L: 3990
																camAngleDX = var4 * 2; // L: 3991
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * 111270843 * -1137004173; // L: 3992
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3993
																camAngleDY = var5 * 2; // L: 3994
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * -1783686409 * 1769064135; // L: 3995
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3998
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3999
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2; // L: 4000
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 4001
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 4002
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2; // L: 4003
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 4004
																mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 4005
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047; // L: 4007
															camAngleX += camAngleDX / 2; // L: 4008
															if (camAngleX < 128) { // L: 4009
																camAngleX = 128;
															}

															if (camAngleX > 383) { // L: 4010
																camAngleX = 383;
															}

															if (isCameraLocked) { // L: 4012
																class123.method2621();
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 4013
																var10002 = field722[var4]++;
															}

															Message.varcs.tryWrite(); // L: 4014
															var4 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 4017
															var6 = GameEngine.method584(); // L: 4020
															PacketBufferNode var29;
															if (var4 > 15000 && var6 > 15000) { // L: 4021
																logoutTimer = 250; // L: 4022
																ClanSettings.method2703(14500); // L: 4023
																var29 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2719, packetWriter.isaacCipher); // L: 4025
																packetWriter.addNode(var29); // L: 4026
															}

															class112.friendSystem.processFriendUpdates(); // L: 4028
															++packetWriter.pendingWrites; // L: 4029
															if (packetWriter.pendingWrites > 50) { // L: 4030
																var29 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2726, packetWriter.isaacCipher); // L: 4032
																packetWriter.addNode(var29); // L: 4033
															}

															try {
																packetWriter.flush(); // L: 4036
															} catch (IOException var30) { // L: 4038
																Clock.method2960(); // L: 4039
															}

															return; // L: 4041
														}

														var52 = var51.widget; // L: 3773
														if (var52.childIndex < 0) { // L: 3774
															break;
														}

														var46 = UserComparator9.getWidget(var52.parentId); // L: 3775
													} while(var46 == null || var46.children == null || var52.childIndex >= var46.children.length || var52 != var46.children[var52.childIndex]); // L: 3776

													Tile.runScriptEvent(var51); // L: 3780
												}
											}

											var52 = var51.widget; // L: 3761
											if (var52.childIndex < 0) { // L: 3762
												break;
											}

											var46 = UserComparator9.getWidget(var52.parentId); // L: 3763
										} while(var46 == null || var46.children == null || var52.childIndex >= var46.children.length || var52 != var46.children[var52.childIndex]); // L: 3764

										Tile.runScriptEvent(var51); // L: 3768
									}
								}

								var52 = var51.widget; // L: 3749
								if (var52.childIndex < 0) { // L: 3750
									break;
								}

								var46 = UserComparator9.getWidget(var52.parentId); // L: 3751
							} while(var46 == null || var46.children == null || var52.childIndex >= var46.children.length || var52 != var46.children[var52.childIndex]); // L: 3752

							Tile.runScriptEvent(var51); // L: 3756
						}
					}

					var33 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2676, packetWriter.isaacCipher); // L: 3318
					var33.packetBuffer.writeByte(0); // L: 3319
					var3 = var33.packetBuffer.offset; // L: 3320
					class16.performReflectionCheck(var33.packetBuffer); // L: 3321
					var33.packetBuffer.method6963(var33.packetBuffer.offset - var3); // L: 3322
					packetWriter.addNode(var33); // L: 3323
				}
			}
		}
	} // L: 3300

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "43"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth; // L: 4584
		int var2 = KeyHandler.canvasHeight; // L: 4585
		if (super.contentWidth < var1) { // L: 4586
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4587
		}

		if (class408.clientPreferences != null) { // L: 4588
			try {
				class27.method394(ArchiveLoader.client, "resize", new Object[]{class134.getWindowedMode()}); // L: 4590
			} catch (Throwable var4) { // L: 4592
			}
		}

	} // L: 4594

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-693987024"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4597
			DirectByteArrayCopier.method5179(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4598
			if (field594[var1]) { // L: 4599
				field553[var1] = true;
			}

			field651[var1] = field594[var1]; // L: 4600
			field594[var1] = false; // L: 4601
		}

		field678 = cycle; // L: 4603
		viewportX = -1; // L: 4604
		viewportY = -1; // L: 4605
		class274.hoveredItemContainer = null; // L: 4606
		if (rootInterface != -1) { // L: 4607
			rootWidgetCount = 0; // L: 4608
			HorizontalAlignment.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, KeyHandler.canvasHeight, 0, 0, -1); // L: 4609
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4611
		if (showMouseCross) { // L: 4612
			if (mouseCrossColor == 1) { // L: 4613
				UserComparator10.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4614
			}

			if (mouseCrossColor == 2) { // L: 4616
				UserComparator10.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4617
			}
		}

		if (!isMenuOpen) { // L: 4620
			if (viewportX != -1) { // L: 4621
				SecureRandomFuture.method1979(viewportX, viewportY);
			}
		} else {
			Message.method1146(); // L: 4623
		}

		if (gameDrawingMode == 3) { // L: 4624
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4625
				if (field651[var1]) { // L: 4626
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4627
				} else if (field553[var1]) { // L: 4629
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4630
				}
			}
		}

		class130.method2746(GrandExchangeOfferTotalQuantityComparator.Client_plane, HealthBarDefinition.localPlayer.x, HealthBarDefinition.localPlayer.y, field531); // L: 4634
		field531 = 0; // L: 4635
	} // L: 4636

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Z",
		garbageValue = "-1849354153"
	)
	final boolean method1180(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6027
		PacketBuffer var3 = var1.packetBuffer; // L: 6028
		if (var2 == null) { // L: 6029
			return false;
		} else {
			int var18;
			String var19;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6031
					if (var1.field1280) { // L: 6032
						if (!var2.isAvailable(1)) { // L: 6033
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6034
						var1.field1275 = 0; // L: 6035
						var1.field1280 = false; // L: 6036
					}

					var3.offset = 0; // L: 6038
					if (var3.method6912()) { // L: 6039
						if (!var2.isAvailable(1)) { // L: 6040
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6041
						var1.field1275 = 0; // L: 6042
					}

					var1.field1280 = true; // L: 6044
					ServerPacket[] var4 = class128.ServerPacket_values(); // L: 6045
					var5 = var3.readSmartByteShortIsaac(); // L: 6046
					if (var5 < 0 || var5 >= var4.length) { // L: 6047
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6048
					var1.serverPacketLength = var1.serverPacket.length; // L: 6049
				}

				if (var1.serverPacketLength == -1) { // L: 6051
					if (!var2.isAvailable(1)) { // L: 6052
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6053
					var1.serverPacketLength = var3.array[0] & 255; // L: 6054
				}

				if (var1.serverPacketLength == -2) { // L: 6056
					if (!var2.isAvailable(2)) { // L: 6057
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6058
					var3.offset = 0; // L: 6059
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6060
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6062
					return false;
				}

				var3.offset = 0; // L: 6063
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6064
				var1.field1275 = 0; // L: 6065
				timer.method5972(); // L: 6066
				var1.field1285 = var1.field1284; // L: 6067
				var1.field1284 = var1.field1277; // L: 6068
				var1.field1277 = var1.serverPacket; // L: 6069
				int var17;
				String var53;
				if (ServerPacket.field2865 == var1.serverPacket) { // L: 6070
					var17 = var3.method6997(); // L: 6071
					var5 = var3.method6996(); // L: 6072
					var53 = var3.readStringCp1252NullTerminated(); // L: 6073
					if (var17 >= 1 && var17 <= 8) { // L: 6074
						if (var53.equalsIgnoreCase("null")) { // L: 6075
							var53 = null;
						}

						playerMenuActions[var17 - 1] = var53; // L: 6076
						playerOptionsPriorities[var17 - 1] = var5 == 0; // L: 6077
					}

					var1.serverPacket = null; // L: 6079
					return true; // L: 6080
				}

				int var7;
				int var8;
				int var9;
				int var10;
				if (ServerPacket.field2806 == var1.serverPacket) { // L: 6082
					isCameraLocked = true; // L: 6083
					UrlRequest.field1298 = var3.readUnsignedByte(); // L: 6084
					SoundSystem.field288 = var3.readUnsignedByte(); // L: 6085
					ArchiveLoader.field985 = var3.readUnsignedShort(); // L: 6086
					class269.field3221 = var3.readUnsignedByte(); // L: 6087
					TextureProvider.field2484 = var3.readUnsignedByte(); // L: 6088
					if (TextureProvider.field2484 >= 100) { // L: 6089
						var17 = UrlRequest.field1298 * 128 + 64; // L: 6090
						var5 = SoundSystem.field288 * 128 + 64; // L: 6091
						var18 = class392.getTileHeight(var17, var5, GrandExchangeOfferTotalQuantityComparator.Client_plane) - ArchiveLoader.field985; // L: 6092
						var7 = var17 - WorldMapSectionType.cameraX; // L: 6093
						var8 = var18 - class174.cameraY; // L: 6094
						var9 = var5 - class65.cameraZ; // L: 6095
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7)); // L: 6096
						class121.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047; // L: 6097
						WorldMapRegion.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047; // L: 6098
						if (class121.cameraPitch < 128) { // L: 6099
							class121.cameraPitch = 128;
						}

						if (class121.cameraPitch > 383) { // L: 6100
							class121.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6102
					return true; // L: 6103
				}

				if (ServerPacket.field2805 == var1.serverPacket) { // L: 6105
					ItemComposition.method3406(); // L: 6106
					weight = var3.readShort(); // L: 6107
					field494 = cycleCntr; // L: 6108
					var1.serverPacket = null; // L: 6109
					return true; // L: 6110
				}

				if (ServerPacket.field2890 == var1.serverPacket) { // L: 6112
					var17 = var3.readUnsignedByte(); // L: 6113
					if (var3.readUnsignedByte() == 0) { // L: 6114
						grandExchangeOffers[var17] = new GrandExchangeOffer(); // L: 6115
						var3.offset += 18; // L: 6116
					} else {
						--var3.offset; // L: 6119
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false); // L: 6120
					}

					field536 = cycleCntr; // L: 6122
					var1.serverPacket = null; // L: 6123
					return true; // L: 6124
				}

				if (ServerPacket.field2804 == var1.serverPacket) { // L: 6126
					class21.method309(class240.field2772); // L: 6127
					var1.serverPacket = null; // L: 6128
					return true; // L: 6129
				}

				byte var61;
				if (ServerPacket.field2802 == var1.serverPacket) { // L: 6131
					var61 = var3.readByte(); // L: 6132
					var5 = var3.method7120(); // L: 6133
					Varps.Varps_temp[var5] = var61; // L: 6134
					if (Varps.Varps_main[var5] != var61) { // L: 6135
						Varps.Varps_main[var5] = var61; // L: 6136
					}

					WorldMapLabelSize.changeGameOptions(var5); // L: 6138
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6139
					var1.serverPacket = null; // L: 6140
					return true; // L: 6141
				}

				if (ServerPacket.field2824 == var1.serverPacket) { // L: 6143
					class21.method309(class240.field2780); // L: 6144
					var1.serverPacket = null; // L: 6145
					return true; // L: 6146
				}

				if (ServerPacket.field2858 == var1.serverPacket) { // L: 6148
					var17 = var3.readUnsignedByte(); // L: 6149
					var5 = var3.readUnsignedByte(); // L: 6150
					var18 = var3.readUnsignedByte(); // L: 6151
					var7 = var3.readUnsignedByte(); // L: 6152
					field718[var17] = true; // L: 6153
					field719[var17] = var5; // L: 6154
					field598[var17] = var18; // L: 6155
					field721[var17] = var7; // L: 6156
					field722[var17] = 0; // L: 6157
					var1.serverPacket = null; // L: 6158
					return true; // L: 6159
				}

				int var15;
				String var25;
				if (ServerPacket.field2878 == var1.serverPacket) { // L: 6161
					var61 = var3.readByte(); // L: 6162
					var19 = var3.readStringCp1252NullTerminated(); // L: 6163
					long var20 = (long)var3.readUnsignedShort(); // L: 6164
					long var22 = (long)var3.readMedium(); // L: 6165
					PlayerType var70 = (PlayerType)UserComparator4.findEnumerated(VarbitComposition.PlayerType_values(), var3.readUnsignedByte()); // L: 6166
					long var11 = var22 + (var20 << 32); // L: 6167
					boolean var58 = false; // L: 6168
					ClanChannel var14 = null; // L: 6169
					var14 = var61 >= 0 ? currentClanChannels[var61] : class115.guestClanChannel; // L: 6171
					if (var14 == null) { // L: 6172
						var58 = true; // L: 6173
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var70.isUser && class112.friendSystem.isIgnored(new Username(var19, GrandExchangeOfferUnitPriceComparator.loginType))) { // L: 6182 6183
									var58 = true;
								}
								break;
							}

							if (var11 == crossWorldMessageIds[var15]) { // L: 6177
								var58 = true; // L: 6178
								break; // L: 6179
							}

							++var15; // L: 6176
						}
					}

					if (!var58) { // L: 6186
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11; // L: 6187
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6188
						var25 = AbstractFont.escapeBrackets(MilliClock.method2955(var3)); // L: 6189
						int var16 = var61 >= 0 ? 41 : 44; // L: 6190
						if (var70.modIcon != -1) { // L: 6191
							class269.addChatMessage(var16, SpriteMask.method4998(var70.modIcon) + var19, var25, var14.name);
						} else {
							class269.addChatMessage(var16, var19, var25, var14.name); // L: 6192
						}
					}

					var1.serverPacket = null; // L: 6194
					return true; // L: 6195
				}

				if (ServerPacket.field2864 == var1.serverPacket) { // L: 6197
					if (rootInterface != -1) { // L: 6198
						ItemComposition.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6199
					return true; // L: 6200
				}

				if (ServerPacket.field2849 == var1.serverPacket) { // L: 6202
					class21.method309(class240.field2773); // L: 6203
					var1.serverPacket = null; // L: 6204
					return true; // L: 6205
				}

				if (ServerPacket.field2883 == var1.serverPacket) { // L: 6207
					var17 = var3.method7004(); // L: 6208
					ClanSettings.method2714(var17); // L: 6209
					changedItemContainers[++field659 - 1 & 31] = var17 & 32767; // L: 6210
					var1.serverPacket = null; // L: 6211
					return true; // L: 6212
				}

				int var13;
				long var26;
				long var28;
				String var33;
				String var47;
				if (ServerPacket.field2838 == var1.serverPacket) { // L: 6214
					var47 = var3.readStringCp1252NullTerminated(); // L: 6215
					var26 = (long)var3.readUnsignedShort(); // L: 6216
					var28 = (long)var3.readMedium(); // L: 6217
					PlayerType var30 = (PlayerType)UserComparator4.findEnumerated(VarbitComposition.PlayerType_values(), var3.readUnsignedByte()); // L: 6218
					long var31 = (var26 << 32) + var28; // L: 6219
					boolean var12 = false; // L: 6220

					for (var13 = 0; var13 < 100; ++var13) { // L: 6221
						if (crossWorldMessageIds[var13] == var31) { // L: 6222
							var12 = true; // L: 6223
							break; // L: 6224
						}
					}

					if (class112.friendSystem.isIgnored(new Username(var47, GrandExchangeOfferUnitPriceComparator.loginType))) { // L: 6227
						var12 = true;
					}

					if (!var12 && field539 == 0) { // L: 6228
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var31; // L: 6229
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6230
						var33 = AbstractFont.escapeBrackets(class19.method277(MilliClock.method2955(var3))); // L: 6231
						byte var72;
						if (var30.isPrivileged) { // L: 6233
							var72 = 7;
						} else {
							var72 = 3; // L: 6234
						}

						if (var30.modIcon != -1) { // L: 6235
							class397.addGameMessage(var72, SpriteMask.method4998(var30.modIcon) + var47, var33);
						} else {
							class397.addGameMessage(var72, var47, var33); // L: 6236
						}
					}

					var1.serverPacket = null; // L: 6238
					return true; // L: 6239
				}

				if (ServerPacket.field2884 == var1.serverPacket) { // L: 6241
					field724 = cycleCntr; // L: 6242
					var61 = var3.readByte(); // L: 6243
					class133 var67 = new class133(var3); // L: 6244
					ClanChannel var57;
					if (var61 >= 0) { // L: 6246
						var57 = currentClanChannels[var61];
					} else {
						var57 = class115.guestClanChannel; // L: 6247
					}

					var67.method2777(var57); // L: 6248
					var1.serverPacket = null; // L: 6249
					return true; // L: 6250
				}

				if (ServerPacket.field2888 == var1.serverPacket) { // L: 6252
					Players.field1254 = true; // L: 6253
					class16.updateNpcs(true, var3); // L: 6254
					var1.serverPacket = null; // L: 6255
					return true; // L: 6256
				}

				if (ServerPacket.field2811 == var1.serverPacket) { // L: 6258
					class16.updateNpcs(false, var3); // L: 6259
					var1.serverPacket = null; // L: 6260
					return true; // L: 6261
				}

				Widget var52;
				if (ServerPacket.field2818 == var1.serverPacket) { // L: 6263
					var17 = var3.readInt(); // L: 6264
					var5 = var3.readUnsignedShort(); // L: 6265
					var52 = UserComparator9.getWidget(var17); // L: 6266
					if (var52.modelType != 2 || var5 != var52.modelId) { // L: 6267
						var52.modelType = 2; // L: 6268
						var52.modelId = var5; // L: 6269
						class184.invalidateWidget(var52); // L: 6270
					}

					var1.serverPacket = null; // L: 6272
					return true; // L: 6273
				}

				if (ServerPacket.field2803 == var1.serverPacket) { // L: 6275
					var17 = var3.readInt(); // L: 6276
					var5 = var3.readUnsignedShort(); // L: 6277
					if (var17 < -70000) { // L: 6278
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6280
						var52 = UserComparator9.getWidget(var17);
					} else {
						var52 = null; // L: 6281
					}

					for (; var3.offset < var1.serverPacketLength; DynamicObject.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 6282 6296
						var7 = var3.readUShortSmart(); // L: 6283
						var8 = var3.readUnsignedShort(); // L: 6284
						var9 = 0; // L: 6285
						if (var8 != 0) { // L: 6286
							var9 = var3.readUnsignedByte(); // L: 6287
							if (var9 == 255) { // L: 6288
								var9 = var3.readInt();
							}
						}

						if (var52 != null && var7 >= 0 && var7 < var52.itemIds.length) { // L: 6290 6291
							var52.itemIds[var7] = var8; // L: 6292
							var52.itemQuantities[var7] = var9; // L: 6293
						}
					}

					if (var52 != null) { // L: 6298
						class184.invalidateWidget(var52);
					}

					ItemComposition.method3406(); // L: 6299
					changedItemContainers[++field659 - 1 & 31] = var5 & 32767; // L: 6300
					var1.serverPacket = null; // L: 6301
					return true; // L: 6302
				}

				if (ServerPacket.field2843 == var1.serverPacket) { // L: 6304
					var17 = var3.method7044(); // L: 6305
					var5 = var3.method7006(); // L: 6306
					var18 = var5 >> 10 & 31; // L: 6307
					var7 = var5 >> 5 & 31; // L: 6308
					var8 = var5 & 31; // L: 6309
					var9 = (var7 << 11) + (var18 << 19) + (var8 << 3); // L: 6310
					Widget var69 = UserComparator9.getWidget(var17); // L: 6311
					if (var9 != var69.color) { // L: 6312
						var69.color = var9; // L: 6313
						class184.invalidateWidget(var69); // L: 6314
					}

					var1.serverPacket = null; // L: 6316
					return true; // L: 6317
				}

				if (ServerPacket.field2892 == var1.serverPacket) { // L: 6319
					Players.field1254 = true; // L: 6320
					class16.updateNpcs(false, var3); // L: 6321
					var1.serverPacket = null; // L: 6322
					return true; // L: 6323
				}

				if (ServerPacket.field2859 == var1.serverPacket) { // L: 6325
					byte[] var50 = new byte[var1.serverPacketLength]; // L: 6326
					var3.method6939(var50, 0, var50.length); // L: 6327
					Buffer var66 = new Buffer(var50); // L: 6328
					var53 = var66.readStringCp1252NullTerminated(); // L: 6329
					class91.openURL(var53, true, false); // L: 6330
					var1.serverPacket = null; // L: 6331
					return true; // L: 6332
				}

				if (ServerPacket.field2833 == var1.serverPacket) { // L: 6334
					isCameraLocked = true; // L: 6335
					SpotAnimationDefinition.field1761 = var3.readUnsignedByte(); // L: 6336
					BuddyRankComparator.field1333 = var3.readUnsignedByte(); // L: 6337
					Renderable.field2442 = var3.readUnsignedShort(); // L: 6338
					UserComparator8.field1305 = var3.readUnsignedByte(); // L: 6339
					Login.field888 = var3.readUnsignedByte(); // L: 6340
					if (Login.field888 >= 100) { // L: 6341
						WorldMapSectionType.cameraX = SpotAnimationDefinition.field1761 * 128 + 64; // L: 6342
						class65.cameraZ = BuddyRankComparator.field1333 * 128 + 64; // L: 6343
						class174.cameraY = class392.getTileHeight(WorldMapSectionType.cameraX, class65.cameraZ, GrandExchangeOfferTotalQuantityComparator.Client_plane) - Renderable.field2442; // L: 6344
					}

					var1.serverPacket = null; // L: 6346
					return true; // L: 6347
				}

				if (ServerPacket.field2826 == var1.serverPacket) { // L: 6349
					var17 = var3.method7015(); // L: 6350
					var5 = var3.method7004(); // L: 6351
					var52 = UserComparator9.getWidget(var17); // L: 6352
					if (var52 != null && var52.type == 0) { // L: 6353
						if (var5 > var52.scrollHeight - var52.height) { // L: 6354
							var5 = var52.scrollHeight - var52.height;
						}

						if (var5 < 0) { // L: 6355
							var5 = 0;
						}

						if (var5 != var52.scrollY) { // L: 6356
							var52.scrollY = var5; // L: 6357
							class184.invalidateWidget(var52); // L: 6358
						}
					}

					var1.serverPacket = null; // L: 6361
					return true; // L: 6362
				}

				if (ServerPacket.field2797 == var1.serverPacket) { // L: 6364
					var17 = var3.readUnsignedByte(); // L: 6365
					CollisionMap.forceDisconnect(var17); // L: 6366
					var1.serverPacket = null; // L: 6367
					return false; // L: 6368
				}

				if (ServerPacket.field2841 == var1.serverPacket) { // L: 6370
					ItemComposition.method3406(); // L: 6371
					runEnergy = var3.readUnsignedByte(); // L: 6372
					field494 = cycleCntr; // L: 6373
					var1.serverPacket = null; // L: 6374
					return true; // L: 6375
				}

				if (ServerPacket.field2875 == var1.serverPacket) { // L: 6377
					ApproximateRouteStrategy.privateChatMode = FloorDecoration.method4189(var3.readUnsignedByte()); // L: 6378
					var1.serverPacket = null; // L: 6379
					return true; // L: 6380
				}

				if (ServerPacket.field2845 == var1.serverPacket) { // L: 6382
					var47 = var3.readStringCp1252NullTerminated(); // L: 6383
					var5 = var3.method7021(); // L: 6384
					var52 = UserComparator9.getWidget(var5); // L: 6385
					if (!var47.equals(var52.text)) { // L: 6386
						var52.text = var47; // L: 6387
						class184.invalidateWidget(var52); // L: 6388
					}

					var1.serverPacket = null; // L: 6390
					return true; // L: 6391
				}

				if (ServerPacket.field2874 == var1.serverPacket) { // L: 6393
					Canvas.loadRegions(true, var1.packetBuffer); // L: 6394
					var1.serverPacket = null; // L: 6395
					return true; // L: 6396
				}

				if (ServerPacket.field2861 == var1.serverPacket) { // L: 6398
					rebootTimer = var3.method7120() * 30; // L: 6399
					field494 = cycleCntr; // L: 6400
					var1.serverPacket = null; // L: 6401
					return true; // L: 6402
				}

				if (ServerPacket.field2813 == var1.serverPacket) { // L: 6404
					var3.offset += 28; // L: 6405
					if (var3.checkCrc()) { // L: 6406
						class274.method5198(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6407
					return true; // L: 6408
				}

				if (ServerPacket.field2853 == var1.serverPacket) { // L: 6410
					CollisionMap.readReflectionCheck(var3, var1.serverPacketLength); // L: 6411
					var1.serverPacket = null; // L: 6412
					return true; // L: 6413
				}

				if (ServerPacket.field2820 == var1.serverPacket) { // L: 6415
					var47 = var3.readStringCp1252NullTerminated(); // L: 6416
					Object[] var65 = new Object[var47.length() + 1]; // L: 6417

					for (var18 = var47.length() - 1; var18 >= 0; --var18) { // L: 6418
						if (var47.charAt(var18) == 's') { // L: 6419
							var65[var18 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var65[var18 + 1] = new Integer(var3.readInt()); // L: 6420
						}
					}

					var65[0] = new Integer(var3.readInt()); // L: 6422
					ScriptEvent var54 = new ScriptEvent(); // L: 6423
					var54.args = var65; // L: 6424
					Tile.runScriptEvent(var54); // L: 6425
					var1.serverPacket = null; // L: 6426
					return true; // L: 6427
				}

				boolean var56;
				if (ServerPacket.field2854 == var1.serverPacket) { // L: 6429
					var17 = var3.method7044(); // L: 6430
					var56 = var3.readUnsignedByte() == 1; // L: 6431
					var52 = UserComparator9.getWidget(var17); // L: 6432
					if (var56 != var52.isHidden) { // L: 6433
						var52.isHidden = var56; // L: 6434
						class184.invalidateWidget(var52); // L: 6435
					}

					var1.serverPacket = null; // L: 6437
					return true; // L: 6438
				}

				if (ServerPacket.field2852 == var1.serverPacket) { // L: 6440
					var17 = var3.readInt(); // L: 6441
					var5 = var3.method7004(); // L: 6442
					var52 = UserComparator9.getWidget(var17); // L: 6443
					if (var52.modelType != 1 || var5 != var52.modelId) { // L: 6444
						var52.modelType = 1; // L: 6445
						var52.modelId = var5; // L: 6446
						class184.invalidateWidget(var52); // L: 6447
					}

					var1.serverPacket = null; // L: 6449
					return true; // L: 6450
				}

				if (ServerPacket.field2836 == var1.serverPacket) { // L: 6452
					Actor.field1146 = var3.method6995(); // L: 6453
					ItemComposition.field1931 = var3.readUnsignedByte(); // L: 6454

					for (var17 = ItemComposition.field1931; var17 < ItemComposition.field1931 + 8; ++var17) { // L: 6455
						for (var5 = Actor.field1146; var5 < Actor.field1146 + 8; ++var5) { // L: 6456
							if (groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var17][var5] != null) { // L: 6457
								groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var17][var5] = null; // L: 6458
								WallDecoration.updateItemPile(var17, var5); // L: 6459
							}
						}
					}

					for (PendingSpawn var49 = (PendingSpawn)pendingSpawns.last(); var49 != null; var49 = (PendingSpawn)pendingSpawns.previous()) { // L: 6463 6464 6466
						if (var49.x >= ItemComposition.field1931 && var49.x < ItemComposition.field1931 + 8 && var49.y >= Actor.field1146 && var49.y < Actor.field1146 + 8 && var49.plane == GrandExchangeOfferTotalQuantityComparator.Client_plane) { // L: 6465
							var49.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6468
					return true; // L: 6469
				}

				if (ServerPacket.field2870 == var1.serverPacket) { // L: 6471
					SequenceDefinition.logOut(); // L: 6472
					var1.serverPacket = null; // L: 6473
					return false; // L: 6474
				}

				if (ServerPacket.field2856 == var1.serverPacket) { // L: 6476
					class112.friendSystem.method1746(); // L: 6477
					field679 = cycleCntr; // L: 6478
					var1.serverPacket = null; // L: 6479
					return true; // L: 6480
				}

				if (ServerPacket.field2871 == var1.serverPacket) { // L: 6482
					var17 = var3.readUnsignedShort(); // L: 6483
					var5 = var3.readUnsignedByte(); // L: 6484
					var18 = var3.readUnsignedShort(); // L: 6485
					class128.queueSoundEffect(var17, var5, var18); // L: 6486
					var1.serverPacket = null; // L: 6487
					return true; // L: 6488
				}

				if (ServerPacket.field2793 == var1.serverPacket) { // L: 6490
					isCameraLocked = false; // L: 6491

					for (var17 = 0; var17 < 5; ++var17) { // L: 6492
						field718[var17] = false;
					}

					var1.serverPacket = null; // L: 6493
					return true; // L: 6494
				}

				if (ServerPacket.field2844 == var1.serverPacket) { // L: 6496
					for (var17 = 0; var17 < VarpDefinition.VarpDefinition_fileCount; ++var17) { // L: 6497
						VarpDefinition var64 = ArchiveLoader.VarpDefinition_get(var17); // L: 6498
						if (var64 != null) { // L: 6499
							Varps.Varps_temp[var17] = 0; // L: 6500
							Varps.Varps_main[var17] = 0; // L: 6501
						}
					}

					ItemComposition.method3406(); // L: 6504
					changedVarpCount += 32; // L: 6505
					var1.serverPacket = null; // L: 6506
					return true; // L: 6507
				}

				InterfaceParent var35;
				if (ServerPacket.field2809 == var1.serverPacket) { // L: 6509
					var17 = var3.method7006(); // L: 6510
					var5 = var3.method7015(); // L: 6511
					var18 = var3.method6995(); // L: 6512
					var35 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6513
					if (var35 != null) { // L: 6514
						Players.closeInterface(var35, var17 != var35.group);
					}

					DynamicObject.method1997(var5, var17, var18); // L: 6515
					var1.serverPacket = null; // L: 6516
					return true; // L: 6517
				}

				if (ServerPacket.field2847 == var1.serverPacket) { // L: 6519
					class21.method309(class240.field2781); // L: 6520
					var1.serverPacket = null; // L: 6521
					return true; // L: 6522
				}

				if (ServerPacket.field2846 == var1.serverPacket) { // L: 6524
					var17 = var3.readInt(); // L: 6525
					var5 = var3.readUnsignedShort(); // L: 6526
					if (var17 < -70000) { // L: 6527
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6529
						var52 = UserComparator9.getWidget(var17);
					} else {
						var52 = null; // L: 6530
					}

					if (var52 != null) { // L: 6531
						for (var7 = 0; var7 < var52.itemIds.length; ++var7) { // L: 6532
							var52.itemIds[var7] = 0; // L: 6533
							var52.itemQuantities[var7] = 0; // L: 6534
						}
					}

					class20.clearItemContainer(var5); // L: 6537
					var7 = var3.readUnsignedShort(); // L: 6538

					for (var8 = 0; var8 < var7; ++var8) { // L: 6539
						var9 = var3.method6996(); // L: 6540
						if (var9 == 255) { // L: 6541
							var9 = var3.method7015();
						}

						var10 = var3.method7004(); // L: 6542
						if (var52 != null && var8 < var52.itemIds.length) { // L: 6543 6544
							var52.itemIds[var8] = var10; // L: 6545
							var52.itemQuantities[var8] = var9; // L: 6546
						}

						DynamicObject.itemContainerSetItem(var5, var8, var10 - 1, var9); // L: 6549
					}

					if (var52 != null) { // L: 6551
						class184.invalidateWidget(var52);
					}

					ItemComposition.method3406(); // L: 6552
					changedItemContainers[++field659 - 1 & 31] = var5 & 32767; // L: 6553
					var1.serverPacket = null; // L: 6554
					return true; // L: 6555
				}

				if (ServerPacket.field2860 == var1.serverPacket) { // L: 6557
					var17 = var3.readUShortSmart(); // L: 6558
					var56 = var3.readUnsignedByte() == 1; // L: 6559
					var53 = ""; // L: 6560
					boolean var55 = false; // L: 6561
					if (var56) { // L: 6562
						var53 = var3.readStringCp1252NullTerminated(); // L: 6563
						if (class112.friendSystem.isIgnored(new Username(var53, GrandExchangeOfferUnitPriceComparator.loginType))) { // L: 6564
							var55 = true;
						}
					}

					String var76 = var3.readStringCp1252NullTerminated(); // L: 6566
					if (!var55) { // L: 6567
						class397.addGameMessage(var17, var53, var76);
					}

					var1.serverPacket = null; // L: 6568
					return true; // L: 6569
				}

				if (ServerPacket.field2839 == var1.serverPacket) { // L: 6571
					Canvas.loadRegions(false, var1.packetBuffer); // L: 6572
					var1.serverPacket = null; // L: 6573
					return true; // L: 6574
				}

				if (ServerPacket.field2885 == var1.serverPacket) { // L: 6576
					ItemComposition.field1931 = var3.method6995(); // L: 6577
					Actor.field1146 = var3.readUnsignedByte(); // L: 6578

					while (var3.offset < var1.serverPacketLength) { // L: 6579
						var17 = var3.readUnsignedByte(); // L: 6580
						class240 var63 = class130.method2748()[var17]; // L: 6581
						class21.method309(var63); // L: 6582
					}

					var1.serverPacket = null; // L: 6584
					return true; // L: 6585
				}

				if (ServerPacket.field2796 == var1.serverPacket) { // L: 6587
					class128.method2728(var3.readStringCp1252NullTerminated()); // L: 6588
					var1.serverPacket = null; // L: 6589
					return true; // L: 6590
				}

				if (ServerPacket.field2812 == var1.serverPacket) { // L: 6592
					class21.method309(class240.field2782); // L: 6593
					var1.serverPacket = null; // L: 6594
					return true; // L: 6595
				}

				Widget var73;
				if (ServerPacket.field2842 == var1.serverPacket) { // L: 6597
					var17 = var3.method7120(); // L: 6598
					var5 = var3.method7004(); // L: 6599
					var18 = var3.method7021(); // L: 6600
					var73 = UserComparator9.getWidget(var18); // L: 6601
					var73.field3165 = var5 + (var17 << 16); // L: 6602
					var1.serverPacket = null; // L: 6603
					return true; // L: 6604
				}

				if (ServerPacket.field2834 == var1.serverPacket) { // L: 6606
					var17 = var3.readInt(); // L: 6607
					var5 = var3.readInt(); // L: 6608
					var18 = Occluder.getGcDuration(); // L: 6609
					PacketBufferNode var75 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2680, packetWriter.isaacCipher); // L: 6611
					var75.packetBuffer.writeByte(GameEngine.fps); // L: 6612
					var75.packetBuffer.method7126(var17); // L: 6613
					var75.packetBuffer.method7126(var5); // L: 6614
					var75.packetBuffer.method6947(var18); // L: 6615
					packetWriter.addNode(var75); // L: 6616
					var1.serverPacket = null; // L: 6617
					return true; // L: 6618
				}

				boolean var68;
				if (ServerPacket.field2821 == var1.serverPacket) { // L: 6620
					var68 = var3.readUnsignedByte() == 1; // L: 6621
					if (var68) { // L: 6622
						GrandExchangeOfferUnitPriceComparator.field3758 = class111.method2516() - var3.readLong(); // L: 6623
						JagexCache.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6624
					} else {
						JagexCache.grandExchangeEvents = null; // L: 6626
					}

					field670 = cycleCntr; // L: 6627
					var1.serverPacket = null; // L: 6628
					return true; // L: 6629
				}

				if (ServerPacket.field2850 == var1.serverPacket) { // L: 6631
					var17 = var3.method7008(); // L: 6632
					var5 = var3.method7044(); // L: 6633
					var52 = UserComparator9.getWidget(var5); // L: 6634
					if (var17 != var52.sequenceId || var17 == -1) { // L: 6635
						var52.sequenceId = var17; // L: 6636
						var52.modelFrame = 0; // L: 6637
						var52.modelFrameCycle = 0; // L: 6638
						class184.invalidateWidget(var52); // L: 6639
					}

					var1.serverPacket = null; // L: 6641
					return true; // L: 6642
				}

				long var37;
				if (ServerPacket.field2827 == var1.serverPacket) { // L: 6644
					var61 = var3.readByte(); // L: 6645
					var26 = (long)var3.readUnsignedShort(); // L: 6646
					var28 = (long)var3.readMedium(); // L: 6647
					var37 = var28 + (var26 << 32); // L: 6648
					boolean var77 = false; // L: 6649
					ClanChannel var40 = var61 >= 0 ? currentClanChannels[var61] : class115.guestClanChannel; // L: 6650
					if (var40 == null) { // L: 6651
						var77 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6653
							if (crossWorldMessageIds[var13] == var37) { // L: 6654
								var77 = true; // L: 6655
								break; // L: 6656
							}
						}
					}

					if (!var77) { // L: 6660
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var37; // L: 6661
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6662
						var33 = MilliClock.method2955(var3); // L: 6663
						int var71 = var61 >= 0 ? 43 : 46; // L: 6664
						class269.addChatMessage(var71, "", var33, var40.name); // L: 6665
					}

					var1.serverPacket = null; // L: 6667
					return true; // L: 6668
				}

				if (ServerPacket.field2868 == var1.serverPacket) { // L: 6670
					for (var17 = 0; var17 < players.length; ++var17) { // L: 6671
						if (players[var17] != null) { // L: 6672
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) { // L: 6674
						if (npcs[var17] != null) { // L: 6675
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6677
					return true; // L: 6678
				}

				Widget var36;
				if (ServerPacket.field2828 == var1.serverPacket) { // L: 6680
					var17 = var3.method7044(); // L: 6681
					var5 = var3.method7044(); // L: 6682
					InterfaceParent var51 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6683
					var35 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6684
					if (var35 != null) { // L: 6685
						Players.closeInterface(var35, var51 == null || var51.group != var35.group);
					}

					if (var51 != null) { // L: 6686
						var51.remove(); // L: 6687
						interfaceParents.put(var51, (long)var5); // L: 6688
					}

					var36 = UserComparator9.getWidget(var17); // L: 6690
					if (var36 != null) { // L: 6691
						class184.invalidateWidget(var36);
					}

					var36 = UserComparator9.getWidget(var5); // L: 6692
					if (var36 != null) { // L: 6693
						class184.invalidateWidget(var36); // L: 6694
						MouseRecorder.revalidateWidgetScroll(WorldMapSection1.Widget_interfaceComponents[var36.id >>> 16], var36, true); // L: 6695
					}

					if (rootInterface != -1) { // L: 6697
						ItemComposition.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6698
					return true; // L: 6699
				}

				if (ServerPacket.field2822 == var1.serverPacket) { // L: 6701
					publicChatMode = var3.method6996(); // L: 6702
					tradeChatMode = var3.method6997(); // L: 6703
					var1.serverPacket = null; // L: 6704
					return true; // L: 6705
				}

				if (ServerPacket.field2887 == var1.serverPacket) { // L: 6707
					destinationX = var3.readUnsignedByte(); // L: 6708
					if (destinationX == 255) { // L: 6709
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6710
					if (destinationY == 255) { // L: 6711
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6712
					return true; // L: 6713
				}

				if (ServerPacket.field2815 == var1.serverPacket) { // L: 6715
					ItemComposition.method3406(); // L: 6716
					var17 = var3.method6997(); // L: 6717
					var5 = var3.method7015(); // L: 6718
					var18 = var3.method6995(); // L: 6719
					experience[var17] = var5; // L: 6720
					currentLevels[var17] = var18; // L: 6721
					levels[var17] = 1; // L: 6722

					for (var7 = 0; var7 < 98; ++var7) { // L: 6723
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var17] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var17; // L: 6724
					var1.serverPacket = null; // L: 6725
					return true; // L: 6726
				}

				if (ServerPacket.field2807 == var1.serverPacket) { // L: 6728
					UserComparator6.method2509(); // L: 6729
					var61 = var3.readByte(); // L: 6730
					class119 var62 = new class119(var3); // L: 6731
					ClanSettings var6;
					if (var61 >= 0) { // L: 6733
						var6 = currentClanSettings[var61];
					} else {
						var6 = class67.guestClanSettings; // L: 6734
					}

					var62.method2577(var6); // L: 6735
					var1.serverPacket = null; // L: 6736
					return true; // L: 6737
				}

				if (ServerPacket.field2877 == var1.serverPacket) { // L: 6739
					var17 = var3.method7021(); // L: 6740
					var5 = var3.readInt(); // L: 6741
					var18 = var3.readUnsignedShort(); // L: 6742
					if (var18 == 65535) { // L: 6743
						var18 = -1;
					}

					var7 = var3.method7120(); // L: 6744
					if (var7 == 65535) { // L: 6745
						var7 = -1;
					}

					for (var8 = var7; var8 <= var18; ++var8) { // L: 6746
						var37 = (long)var8 + ((long)var5 << 32); // L: 6747
						Node var78 = widgetFlags.get(var37); // L: 6748
						if (var78 != null) { // L: 6749
							var78.remove();
						}

						widgetFlags.put(new IntegerNode(var17), var37); // L: 6750
					}

					var1.serverPacket = null; // L: 6752
					return true; // L: 6753
				}

				if (ServerPacket.field2800 == var1.serverPacket) { // L: 6755
					UserComparator6.method2509(); // L: 6756
					var61 = var3.readByte(); // L: 6757
					if (var1.serverPacketLength == 1) { // L: 6758
						if (var61 >= 0) { // L: 6759
							currentClanSettings[var61] = null;
						} else {
							class67.guestClanSettings = null; // L: 6760
						}

						var1.serverPacket = null; // L: 6761
						return true; // L: 6762
					}

					if (var61 >= 0) { // L: 6764
						currentClanSettings[var61] = new ClanSettings(var3); // L: 6765
					} else {
						class67.guestClanSettings = new ClanSettings(var3); // L: 6768
					}

					var1.serverPacket = null; // L: 6770
					return true; // L: 6771
				}

				if (ServerPacket.field2798 == var1.serverPacket) { // L: 6773
					var17 = var3.method7006(); // L: 6774
					rootInterface = var17; // L: 6775
					this.resizeRoot(false); // L: 6776
					Player.Widget_resetModelFrames(var17); // L: 6777
					class54.runWidgetOnLoadListener(rootInterface); // L: 6778

					for (var5 = 0; var5 < 100; ++var5) { // L: 6779
						field594[var5] = true;
					}

					var1.serverPacket = null; // L: 6780
					return true; // L: 6781
				}

				Widget var59;
				if (ServerPacket.field2794 == var1.serverPacket) { // L: 6783
					var17 = var3.method7021(); // L: 6784
					var59 = UserComparator9.getWidget(var17); // L: 6785
					var59.modelType = 3; // L: 6786
					var59.modelId = HealthBarDefinition.localPlayer.appearance.getChatHeadId(); // L: 6787
					class184.invalidateWidget(var59); // L: 6788
					var1.serverPacket = null; // L: 6789
					return true; // L: 6790
				}

				if (ServerPacket.field2808 == var1.serverPacket) { // L: 6792
					var17 = var3.readInt(); // L: 6793
					InterfaceParent var60 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6794
					if (var60 != null) { // L: 6795
						Players.closeInterface(var60, true);
					}

					if (meslayerContinueWidget != null) { // L: 6796
						class184.invalidateWidget(meslayerContinueWidget); // L: 6797
						meslayerContinueWidget = null; // L: 6798
					}

					var1.serverPacket = null; // L: 6800
					return true; // L: 6801
				}

				if (ServerPacket.field2873 == var1.serverPacket) { // L: 6803
					class21.method309(class240.field2778); // L: 6804
					var1.serverPacket = null; // L: 6805
					return true; // L: 6806
				}

				if (ServerPacket.field2857 == var1.serverPacket) { // L: 6808
					class112.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6809
					field679 = cycleCntr; // L: 6810
					var1.serverPacket = null; // L: 6811
					return true; // L: 6812
				}

				if (ServerPacket.field2832 == var1.serverPacket) { // L: 6814
					minimapState = var3.readUnsignedByte(); // L: 6815
					var1.serverPacket = null; // L: 6816
					return true; // L: 6817
				}

				if (ServerPacket.field2863 == var1.serverPacket) { // L: 6819
					var47 = var3.readStringCp1252NullTerminated(); // L: 6820
					var19 = AbstractFont.escapeBrackets(class19.method277(MilliClock.method2955(var3))); // L: 6821
					class397.addGameMessage(6, var47, var19); // L: 6822
					var1.serverPacket = null; // L: 6823
					return true; // L: 6824
				}

				if (ServerPacket.field2855 == var1.serverPacket) { // L: 6826
					class21.method309(class240.field2774); // L: 6827
					var1.serverPacket = null; // L: 6828
					return true; // L: 6829
				}

				if (ServerPacket.field2816 == var1.serverPacket) { // L: 6831
					World var48 = new World(); // L: 6832
					var48.host = var3.readStringCp1252NullTerminated(); // L: 6833
					var48.id = var3.readUnsignedShort(); // L: 6834
					var5 = var3.readInt(); // L: 6835
					var48.properties = var5; // L: 6836
					WorldMapData_1.updateGameState(45); // L: 6837
					var2.close(); // L: 6838
					var2 = null; // L: 6839
					MidiPcmStream.changeWorld(var48); // L: 6840
					var1.serverPacket = null; // L: 6841
					return false; // L: 6842
				}

				if (ServerPacket.field2814 == var1.serverPacket) { // L: 6844
					var68 = var3.readBoolean(); // L: 6845
					if (var68) { // L: 6846
						if (ClanSettings.field1440 == null) { // L: 6847
							ClanSettings.field1440 = new class300();
						}
					} else {
						ClanSettings.field1440 = null; // L: 6849
					}

					var1.serverPacket = null; // L: 6850
					return true; // L: 6851
				}

				if (ServerPacket.field2823 == var1.serverPacket) { // L: 6853
					class21.method309(class240.field2775); // L: 6854
					var1.serverPacket = null; // L: 6855
					return true; // L: 6856
				}

				if (ServerPacket.field2869 == var1.serverPacket) { // L: 6858
					class21.method309(class240.field2777); // L: 6859
					var1.serverPacket = null; // L: 6860
					return true; // L: 6861
				}

				if (ServerPacket.field2825 == var1.serverPacket) { // L: 6863
					var17 = var3.method7006(); // L: 6864
					if (var17 == 65535) { // L: 6865
						var17 = -1;
					}

					var5 = var3.readInt(); // L: 6866
					var18 = var3.method7015(); // L: 6867
					var73 = UserComparator9.getWidget(var5); // L: 6868
					ItemComposition var74;
					if (!var73.isIf3) { // L: 6869
						if (var17 == -1) { // L: 6870
							var73.modelType = 0; // L: 6871
							var1.serverPacket = null; // L: 6872
							return true; // L: 6873
						}

						var74 = TaskHandler.ItemDefinition_get(var17); // L: 6875
						var73.modelType = 4; // L: 6876
						var73.modelId = var17; // L: 6877
						var73.modelAngleX = var74.xan2d; // L: 6878
						var73.modelAngleY = var74.yan2d; // L: 6879
						var73.modelZoom = var74.zoom2d * 100 / var18; // L: 6880
						class184.invalidateWidget(var73); // L: 6881
					} else {
						var73.itemId = var17; // L: 6884
						var73.itemQuantity = var18; // L: 6885
						var74 = TaskHandler.ItemDefinition_get(var17); // L: 6886
						var73.modelAngleX = var74.xan2d; // L: 6887
						var73.modelAngleY = var74.yan2d; // L: 6888
						var73.modelAngleZ = var74.zan2d; // L: 6889
						var73.modelOffsetX = var74.offsetX2d; // L: 6890
						var73.modelOffsetY = var74.offsetY2d; // L: 6891
						var73.modelZoom = var74.zoom2d; // L: 6892
						if (var74.isStackable == 1) { // L: 6893
							var73.itemQuantityMode = 1;
						} else {
							var73.itemQuantityMode = 2; // L: 6894
						}

						if (var73.field3106 > 0) { // L: 6895
							var73.modelZoom = var73.modelZoom * 32 / var73.field3106;
						} else if (var73.rawWidth > 0) { // L: 6896
							var73.modelZoom = var73.modelZoom * 32 / var73.rawWidth;
						}

						class184.invalidateWidget(var73); // L: 6897
					}

					var1.serverPacket = null; // L: 6899
					return true; // L: 6900
				}

				if (ServerPacket.field2880 == var1.serverPacket) { // L: 6902
					var17 = var3.method7044(); // L: 6903
					var5 = var3.readUnsignedShort(); // L: 6904
					Varps.Varps_temp[var5] = var17; // L: 6905
					if (Varps.Varps_main[var5] != var17) { // L: 6906
						Varps.Varps_main[var5] = var17; // L: 6907
					}

					WorldMapLabelSize.changeGameOptions(var5); // L: 6909
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6910
					var1.serverPacket = null; // L: 6911
					return true; // L: 6912
				}

				if (ServerPacket.field2876 == var1.serverPacket) { // L: 6914
					class21.method309(class240.field2779); // L: 6915
					var1.serverPacket = null; // L: 6916
					return true; // L: 6917
				}

				if (ServerPacket.field2872 == var1.serverPacket) { // L: 6919
					var17 = var3.readInt(); // L: 6920
					if (var17 != field552) { // L: 6921
						field552 = var17; // L: 6922
						class126.method2646(); // L: 6923
					}

					var1.serverPacket = null; // L: 6925
					return true; // L: 6926
				}

				if (ServerPacket.field2837 == var1.serverPacket) { // L: 6928
					field724 = cycleCntr; // L: 6929
					var61 = var3.readByte(); // L: 6930
					if (var1.serverPacketLength == 1) { // L: 6931
						if (var61 >= 0) { // L: 6932
							currentClanChannels[var61] = null;
						} else {
							class115.guestClanChannel = null; // L: 6933
						}

						var1.serverPacket = null; // L: 6934
						return true; // L: 6935
					}

					if (var61 >= 0) { // L: 6937
						currentClanChannels[var61] = new ClanChannel(var3); // L: 6938
					} else {
						class115.guestClanChannel = new ClanChannel(var3); // L: 6941
					}

					var1.serverPacket = null; // L: 6943
					return true; // L: 6944
				}

				long var42;
				if (ServerPacket.field2829 == var1.serverPacket) { // L: 6946
					var47 = var3.readStringCp1252NullTerminated(); // L: 6947
					var26 = var3.readLong(); // L: 6948
					var28 = (long)var3.readUnsignedShort(); // L: 6949
					var37 = (long)var3.readMedium(); // L: 6950
					PlayerType var41 = (PlayerType)UserComparator4.findEnumerated(VarbitComposition.PlayerType_values(), var3.readUnsignedByte()); // L: 6951
					var42 = var37 + (var28 << 32); // L: 6952
					boolean var34 = false; // L: 6953

					for (var15 = 0; var15 < 100; ++var15) { // L: 6954
						if (var42 == crossWorldMessageIds[var15]) { // L: 6955
							var34 = true; // L: 6956
							break; // L: 6957
						}
					}

					if (var41.isUser && class112.friendSystem.isIgnored(new Username(var47, GrandExchangeOfferUnitPriceComparator.loginType))) { // L: 6960 6961
						var34 = true;
					}

					if (!var34 && field539 == 0) { // L: 6963
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var42; // L: 6964
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6965
						var25 = AbstractFont.escapeBrackets(class19.method277(MilliClock.method2955(var3))); // L: 6966
						if (var41.modIcon != -1) { // L: 6967
							class269.addChatMessage(9, SpriteMask.method4998(var41.modIcon) + var47, var25, FontName.base37DecodeLong(var26));
						} else {
							class269.addChatMessage(9, var47, var25, FontName.base37DecodeLong(var26)); // L: 6968
						}
					}

					var1.serverPacket = null; // L: 6970
					return true; // L: 6971
				}

				if (ServerPacket.field2801 == var1.serverPacket) { // L: 6973
					if (NPC.field1210 == null) { // L: 6974
						NPC.field1210 = new class353(class240.HitSplatDefinition_cachedSprites);
					}

					class408 var46 = class240.HitSplatDefinition_cachedSprites.method6391(var3); // L: 6975
					NPC.field1210.field4033.vmethod6736(var46.field4363, var46.field4361); // L: 6976
					field662[++field663 - 1 & 31] = var46.field4363; // L: 6977
					var1.serverPacket = null; // L: 6978
					return true; // L: 6979
				}

				if (ServerPacket.field2886 == var1.serverPacket) { // L: 6981
					var17 = var3.method7015(); // L: 6982
					var5 = var3.method7007(); // L: 6983
					var18 = var3.method7007(); // L: 6984
					var73 = UserComparator9.getWidget(var17); // L: 6985
					if (var5 != var73.rawX || var18 != var73.rawY || var73.xAlignment != 0 || var73.yAlignment != 0) { // L: 6986
						var73.rawX = var5; // L: 6987
						var73.rawY = var18; // L: 6988
						var73.xAlignment = 0; // L: 6989
						var73.yAlignment = 0; // L: 6990
						class184.invalidateWidget(var73); // L: 6991
						this.alignWidget(var73); // L: 6992
						if (var73.type == 0) { // L: 6993
							MouseRecorder.revalidateWidgetScroll(WorldMapSection1.Widget_interfaceComponents[var17 >> 16], var73, false);
						}
					}

					var1.serverPacket = null; // L: 6995
					return true; // L: 6996
				}

				if (ServerPacket.field2851 == var1.serverPacket) { // L: 6998
					var17 = var3.offset + var1.serverPacketLength; // L: 6999
					var5 = var3.readUnsignedShort(); // L: 7000
					var18 = var3.readUnsignedShort(); // L: 7001
					if (var5 != rootInterface) { // L: 7002
						rootInterface = var5; // L: 7003
						this.resizeRoot(false); // L: 7004
						Player.Widget_resetModelFrames(rootInterface); // L: 7005
						class54.runWidgetOnLoadListener(rootInterface); // L: 7006

						for (var7 = 0; var7 < 100; ++var7) { // L: 7007
							field594[var7] = true;
						}
					}

					InterfaceParent var24;
					for (; var18-- > 0; var24.field1011 = true) { // L: 7009 7019
						var7 = var3.readInt(); // L: 7010
						var8 = var3.readUnsignedShort(); // L: 7011
						var9 = var3.readUnsignedByte(); // L: 7012
						var24 = (InterfaceParent)interfaceParents.get((long)var7); // L: 7013
						if (var24 != null && var8 != var24.group) { // L: 7014
							Players.closeInterface(var24, true); // L: 7015
							var24 = null; // L: 7016
						}

						if (var24 == null) { // L: 7018
							var24 = DynamicObject.method1997(var7, var8, var9);
						}
					}

					for (var35 = (InterfaceParent)interfaceParents.first(); var35 != null; var35 = (InterfaceParent)interfaceParents.next()) { // L: 7021
						if (var35.field1011) { // L: 7022
							var35.field1011 = false;
						} else {
							Players.closeInterface(var35, true); // L: 7024
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7027

					while (var3.offset < var17) { // L: 7028
						var7 = var3.readInt(); // L: 7029
						var8 = var3.readUnsignedShort(); // L: 7030
						var9 = var3.readUnsignedShort(); // L: 7031
						var10 = var3.readInt(); // L: 7032

						for (int var39 = var8; var39 <= var9; ++var39) { // L: 7033
							var42 = (long)var39 + ((long)var7 << 32); // L: 7034
							widgetFlags.put(new IntegerNode(var10), var42); // L: 7035
						}
					}

					var1.serverPacket = null; // L: 7038
					return true; // L: 7039
				}

				if (ServerPacket.field2792 == var1.serverPacket) { // L: 7041
					class16.updateNpcs(true, var3); // L: 7042
					var1.serverPacket = null; // L: 7043
					return true; // L: 7044
				}

				if (ServerPacket.field2810 == var1.serverPacket) { // L: 7046
					var17 = var3.method7120(); // L: 7047
					if (var17 == 65535) { // L: 7048
						var17 = -1;
					}

					ModeWhere.playSong(var17); // L: 7049
					var1.serverPacket = null; // L: 7050
					return true; // L: 7051
				}

				if (ServerPacket.field2862 == var1.serverPacket) { // L: 7053
					var17 = var3.readMedium(); // L: 7054
					var5 = var3.readUnsignedShort(); // L: 7055
					if (var5 == 65535) { // L: 7056
						var5 = -1;
					}

					Friend.method6057(var5, var17); // L: 7057
					var1.serverPacket = null; // L: 7058
					return true; // L: 7059
				}

				if (ServerPacket.field2881 == var1.serverPacket) { // L: 7061
					if (var1.serverPacketLength == 0) { // L: 7062
						AbstractArchive.friendsChat = null; // L: 7063
					} else {
						if (AbstractArchive.friendsChat == null) { // L: 7066
							AbstractArchive.friendsChat = new FriendsChat(GrandExchangeOfferUnitPriceComparator.loginType, ArchiveLoader.client); // L: 7067
						}

						AbstractArchive.friendsChat.readUpdate(var3); // L: 7069
					}

					ReflectionCheck.method1114(); // L: 7071
					var1.serverPacket = null; // L: 7072
					return true; // L: 7073
				}

				if (ServerPacket.field2867 == var1.serverPacket) { // L: 7075
					var17 = var3.readUnsignedByte(); // L: 7076
					ArchiveLoader.method2056(var17); // L: 7077
					var1.serverPacket = null; // L: 7078
					return true; // L: 7079
				}

				if (ServerPacket.field2819 == var1.serverPacket) { // L: 7081
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) { // L: 7082
						if (Varps.Varps_temp[var17] != Varps.Varps_main[var17]) { // L: 7083
							Varps.Varps_main[var17] = Varps.Varps_temp[var17]; // L: 7084
							WorldMapLabelSize.changeGameOptions(var17); // L: 7085
							changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 7086
						}
					}

					var1.serverPacket = null; // L: 7089
					return true; // L: 7090
				}

				if (ServerPacket.field2817 == var1.serverPacket) { // L: 7092
					class112.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7093
					TextureProvider.FriendSystem_invalidateIgnoreds(); // L: 7094
					field679 = cycleCntr; // L: 7095
					var1.serverPacket = null; // L: 7096
					return true; // L: 7097
				}

				if (ServerPacket.field2882 == var1.serverPacket) { // L: 7099
					NPC.field1210 = null; // L: 7100
					var1.serverPacket = null; // L: 7101
					return true; // L: 7102
				}

				if (ServerPacket.field2835 == var1.serverPacket) { // L: 7104
					var17 = var3.method7015(); // L: 7105
					var59 = UserComparator9.getWidget(var17); // L: 7106

					for (var18 = 0; var18 < var59.itemIds.length; ++var18) { // L: 7107
						var59.itemIds[var18] = -1; // L: 7108
						var59.itemIds[var18] = 0; // L: 7109
					}

					class184.invalidateWidget(var59); // L: 7111
					var1.serverPacket = null; // L: 7112
					return true; // L: 7113
				}

				if (ServerPacket.field2840 == var1.serverPacket) { // L: 7115
					ItemComposition.field1931 = var3.readUnsignedByte(); // L: 7116
					Actor.field1146 = var3.method6996(); // L: 7117
					var1.serverPacket = null; // L: 7118
					return true; // L: 7119
				}

				if (ServerPacket.field2830 == var1.serverPacket) { // L: 7121
					GameBuild.updatePlayers(var3, var1.serverPacketLength); // L: 7122
					class279.method5216(); // L: 7123
					var1.serverPacket = null; // L: 7124
					return true; // L: 7125
				}

				if (ServerPacket.field2879 == var1.serverPacket) { // L: 7127
					NPC.field1210 = new class353(class240.HitSplatDefinition_cachedSprites); // L: 7128
					var1.serverPacket = null; // L: 7129
					return true; // L: 7130
				}

				if (ServerPacket.field2795 == var1.serverPacket) { // L: 7132
					var17 = var3.readUnsignedShort(); // L: 7133
					var5 = var3.readUnsignedShort(); // L: 7134
					var18 = var3.readUnsignedShort(); // L: 7135
					var7 = var3.method7015(); // L: 7136
					var36 = UserComparator9.getWidget(var7); // L: 7137
					if (var17 != var36.modelAngleX || var5 != var36.modelAngleY || var18 != var36.modelZoom) { // L: 7138
						var36.modelAngleX = var17; // L: 7139
						var36.modelAngleY = var5; // L: 7140
						var36.modelZoom = var18; // L: 7141
						class184.invalidateWidget(var36); // L: 7142
					}

					var1.serverPacket = null; // L: 7144
					return true; // L: 7145
				}

				if (ServerPacket.field2831 == var1.serverPacket) { // L: 7147
					hintArrowType = var3.readUnsignedByte(); // L: 7148
					if (hintArrowType == 1) { // L: 7149
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7150
						if (hintArrowType == 2) { // L: 7151
							hintArrowSubX = 64; // L: 7152
							hintArrowSubY = 64; // L: 7153
						}

						if (hintArrowType == 3) { // L: 7155
							hintArrowSubX = 0; // L: 7156
							hintArrowSubY = 64; // L: 7157
						}

						if (hintArrowType == 4) { // L: 7159
							hintArrowSubX = 128; // L: 7160
							hintArrowSubY = 64; // L: 7161
						}

						if (hintArrowType == 5) { // L: 7163
							hintArrowSubX = 64; // L: 7164
							hintArrowSubY = 0; // L: 7165
						}

						if (hintArrowType == 6) { // L: 7167
							hintArrowSubX = 64; // L: 7168
							hintArrowSubY = 128; // L: 7169
						}

						hintArrowType = 2; // L: 7171
						hintArrowX = var3.readUnsignedShort(); // L: 7172
						hintArrowY = var3.readUnsignedShort(); // L: 7173
						hintArrowHeight = var3.readUnsignedByte(); // L: 7174
					}

					if (hintArrowType == 10) { // L: 7176
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7177
					return true; // L: 7178
				}

				if (ServerPacket.field2799 == var1.serverPacket) { // L: 7180
					if (AbstractArchive.friendsChat != null) { // L: 7181
						AbstractArchive.friendsChat.method6040(var3); // L: 7182
					}

					ReflectionCheck.method1114(); // L: 7184
					var1.serverPacket = null; // L: 7185
					return true; // L: 7186
				}

				MilliClock.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1996281945 * -662376471 : -1) + "," + (var1.field1284 != null ? var1.field1284.id * 1996281945 * -662376471 : -1) + "," + (var1.field1285 != null ? var1.field1285.id * 1996281945 * -662376471 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7188
				SequenceDefinition.logOut(); // L: 7189
			} catch (IOException var44) { // L: 7191
				Clock.method2960(); // L: 7192
			} catch (Exception var45) {
				var19 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1996281945 * -662376471 : -1) + "," + (var1.field1284 != null ? var1.field1284.id * 1996281945 * -662376471 : -1) + "," + (var1.field1285 != null ? var1.field1285.id * 1996281945 * -662376471 : -1) + "," + var1.serverPacketLength + "," + (HealthBarDefinition.localPlayer.pathX[0] + class19.baseX) + "," + (HealthBarDefinition.localPlayer.pathY[0] + DefaultsGroup.baseY) + ","; // L: 7195

				for (var18 = 0; var18 < var1.serverPacketLength && var18 < 50; ++var18) { // L: 7196
					var19 = var19 + var3.array[var18] + ",";
				}

				MilliClock.RunException_sendStackTrace(var19, var45); // L: 7197
				SequenceDefinition.logOut(); // L: 7198
			}

			return true; // L: 7200
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "46102630"
	)
	@Export("menu")
	final void menu() {
		class29.method414(); // L: 8115
		if (class247.dragInventoryWidget == null) { // L: 8116
			if (clickedWidget == null) { // L: 8117
				int var1 = MouseHandler.MouseHandler_lastButton; // L: 8118
				int var2;
				int var4;
				int var5;
				int var6;
				int var8;
				int var9;
				if (isMenuOpen) { // L: 8119
					int var3;
					int var13;
					if (var1 != 1 && (ApproximateRouteStrategy.mouseCam || var1 != 4)) { // L: 8120
						var2 = MouseHandler.MouseHandler_x; // L: 8121
						var3 = MouseHandler.MouseHandler_y; // L: 8122
						if (var2 < SecureRandomCallable.menuX - 10 || var2 > SecureRandomCallable.menuX + ObjectComposition.menuWidth + 10 || var3 < Frames.menuY - 10 || var3 > StudioGame.menuHeight + Frames.menuY + 10) { // L: 8123
							isMenuOpen = false; // L: 8124
							var4 = SecureRandomCallable.menuX; // L: 8125
							var5 = Frames.menuY; // L: 8126
							var6 = ObjectComposition.menuWidth; // L: 8127
							var13 = StudioGame.menuHeight; // L: 8128

							for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 8130
								if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var6 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var13) { // L: 8131
									field594[var8] = true;
								}
							}
						}
					}

					if (var1 == 1 || !ApproximateRouteStrategy.mouseCam && var1 == 4) { // L: 8136
						var2 = SecureRandomCallable.menuX; // L: 8137
						var3 = Frames.menuY; // L: 8138
						var4 = ObjectComposition.menuWidth; // L: 8139
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8140
						var6 = MouseHandler.MouseHandler_lastPressedY; // L: 8141
						var13 = -1; // L: 8142

						for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8143
							var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 8144
							if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) { // L: 8145
								var13 = var8;
							}
						}

						if (var13 != -1) { // L: 8147
							class67.method1913(var13);
						}

						isMenuOpen = false; // L: 8148
						var8 = SecureRandomCallable.menuX; // L: 8149
						var9 = Frames.menuY; // L: 8150
						int var14 = ObjectComposition.menuWidth; // L: 8151
						int var11 = StudioGame.menuHeight; // L: 8152

						for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 8154
							if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var14 + var8 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var11 + var9) { // L: 8155
								field594[var12] = true;
							}
						}
					}
				} else {
					var2 = menuOptionsCount - 1; // L: 8163
					if ((var1 == 1 || !ApproximateRouteStrategy.mouseCam && var1 == 4) && var2 >= 0) { // L: 8166
						var4 = menuOpcodes[var2]; // L: 8167
						if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) { // L: 8168
							var5 = menuArguments1[var2]; // L: 8169
							var6 = menuArguments2[var2]; // L: 8170
							Widget var7 = UserComparator9.getWidget(var6); // L: 8171
							if (HorizontalAlignment.method3114(PendingSpawn.getWidgetFlags(var7)) || TileItem.method2316(PendingSpawn.getWidgetFlags(var7))) { // L: 8172
								if (class247.dragInventoryWidget != null && !field667 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8173 8174
									var8 = draggedWidgetX; // L: 8175
									var9 = draggedWidgetY; // L: 8176
									MenuAction var10 = class274.tempMenuAction; // L: 8178
									class14.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var8, var9); // L: 8180
									class274.tempMenuAction = null; // L: 8182
								}

								field667 = false; // L: 8186
								itemDragDuration = 0; // L: 8187
								if (class247.dragInventoryWidget != null) { // L: 8188
									class184.invalidateWidget(class247.dragInventoryWidget);
								}

								class247.dragInventoryWidget = UserComparator9.getWidget(var6); // L: 8189
								dragItemSlotSource = var5; // L: 8190
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8191
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8192
								if (var2 >= 0) { // L: 8193
									class12.method170(var2);
								}

								class184.invalidateWidget(class247.dragInventoryWidget); // L: 8194
								return; // L: 8195
							}
						}
					}

					if ((var1 == 1 || !ApproximateRouteStrategy.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8199 8200
						var1 = 2; // L: 8201
					}

					if ((var1 == 1 || !ApproximateRouteStrategy.mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 8204
						class67.method1913(var2); // L: 8205
					}

					if (var1 == 2 && menuOptionsCount > 0) { // L: 8207
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 8209

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-296322242"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 8214
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || UrlRequest.method2446(var1)) && !menuShiftClick[var1]; // L: 8217
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class392.method6871(var1, var2); // L: 8221
		GameBuild.scene.menuOpen(GrandExchangeOfferTotalQuantityComparator.Client_plane, var1, var2, false); // L: 8222
		isMenuOpen = true; // L: 8223
	} // L: 8224

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-586334153"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		SecureRandomCallable.method2051(rootInterface, GameEngine.canvasWidth, KeyHandler.canvasHeight, var1); // L: 10209
	} // L: 10210

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "925917033"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : UserComparator9.getWidget(var1.parentId); // L: 10213
		int var3;
		int var4;
		if (var2 == null) { // L: 10216
			var3 = GameEngine.canvasWidth; // L: 10217
			var4 = KeyHandler.canvasHeight; // L: 10218
		} else {
			var3 = var2.width; // L: 10221
			var4 = var2.height; // L: 10222
		}

		WorldMapScaleHandler.alignWidgetSize(var1, var3, var4, false); // L: 10224
		LoginPacket.alignWidgetPosition(var1, var3, var4); // L: 10225
	} // L: 10226

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "407876174"
	)
	final void method1186() {
		class184.invalidateWidget(clickedWidget); // L: 11190
		++class134.widgetDragDuration; // L: 11191
		if (field680 && field648) { // L: 11192
			int var1 = MouseHandler.MouseHandler_x; // L: 11198
			int var2 = MouseHandler.MouseHandler_y; // L: 11199
			var1 -= widgetClickX; // L: 11200
			var2 -= widgetClickY; // L: 11201
			if (var1 < field649) { // L: 11202
				var1 = field649;
			}

			if (var1 + clickedWidget.width > field649 + clickedWidgetParent.width) { // L: 11203
				var1 = field649 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field650) { // L: 11204
				var2 = field650;
			}

			if (var2 + clickedWidget.height > field650 + clickedWidgetParent.height) { // L: 11205
				var2 = field650 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field652; // L: 11206
			int var4 = var2 - field468; // L: 11207
			int var5 = clickedWidget.dragZoneSize; // L: 11208
			if (class134.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11209 11210
				isDraggingWidget = true; // L: 11211
			}

			int var6 = var1 - field649 + clickedWidgetParent.scrollX; // L: 11214
			int var7 = var2 - field650 + clickedWidgetParent.scrollY; // L: 11215
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11216
				var8 = new ScriptEvent(); // L: 11217
				var8.widget = clickedWidget; // L: 11218
				var8.mouseX = var6; // L: 11219
				var8.mouseY = var7; // L: 11220
				var8.args = clickedWidget.onDrag; // L: 11221
				Tile.runScriptEvent(var8); // L: 11222
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11224
				if (isDraggingWidget) { // L: 11225
					if (clickedWidget.onDragComplete != null) { // L: 11226
						var8 = new ScriptEvent(); // L: 11227
						var8.widget = clickedWidget; // L: 11228
						var8.mouseX = var6; // L: 11229
						var8.mouseY = var7; // L: 11230
						var8.dragTarget = draggedOnWidget; // L: 11231
						var8.args = clickedWidget.onDragComplete; // L: 11232
						Tile.runScriptEvent(var8); // L: 11233
					}

					if (draggedOnWidget != null && BuddyRankComparator.method2501(clickedWidget) != null) { // L: 11235
						PacketBufferNode var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2727, packetWriter.isaacCipher); // L: 11237
						var12.packetBuffer.method7001(draggedOnWidget.itemId); // L: 11238
						var12.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 11239
						var12.packetBuffer.method7001(clickedWidget.childIndex); // L: 11240
						var12.packetBuffer.method7126(draggedOnWidget.id); // L: 11241
						var12.packetBuffer.method7001(clickedWidget.itemId); // L: 11242
						var12.packetBuffer.writeIntME(clickedWidget.id); // L: 11243
						packetWriter.addNode(var12); // L: 11244
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11248
					this.openMenu(field652 + widgetClickX, widgetClickY + field468); // L: 11249
				} else if (menuOptionsCount > 0) { // L: 11251
					int var11 = widgetClickX + field652; // L: 11252
					int var9 = widgetClickY + field468; // L: 11253
					MenuAction var10 = class274.tempMenuAction; // L: 11255
					class14.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var11, var9); // L: 11257
					class274.tempMenuAction = null; // L: 11259
				}

				clickedWidget = null; // L: 11263
			}

		} else {
			if (class134.widgetDragDuration > 1) { // L: 11193
				clickedWidget = null; // L: 11194
			}

		}
	} // L: 11196 11265

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "-1245448697"
	)
	@Export("username")
	public Username username() {
		return HealthBarDefinition.localPlayer != null ? HealthBarDefinition.localPlayer.username : null; // L: 11998
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 658
				for (int var1 = 0; var1 <= 27; ++var1) { // L: 659
					String var2 = this.getParameter(Integer.toString(var1)); // L: 660
					if (var2 != null) { // L: 661
						switch(var1) { // L: 662
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 746
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 717
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 718
							}
							break;
						case 4:
							if (clientType == -1) { // L: 734
								clientType = Integer.parseInt(var2); // L: 735
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 712
							break; // L: 713
						case 6:
							MouseHandler.clientLanguage = Language.method5519(Integer.parseInt(var2)); // L: 729
							break; // L: 730
						case 7:
							ArchiveLoader.field984 = WorldMapIcon_0.method3890(Integer.parseInt(var2)); // L: 707
							break; // L: 708
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 723
							}
							break;
						case 9:
							UserComparator3.field1316 = var2; // L: 682
							break; // L: 683
						case 10:
							RouteStrategy.field1986 = (StudioGame)UserComparator4.findEnumerated(class157.method3084(), Integer.parseInt(var2)); // L: 665
							if (StudioGame.oldscape == RouteStrategy.field1986) { // L: 666
								GrandExchangeOfferUnitPriceComparator.loginType = LoginType.oldscape;
							} else {
								GrandExchangeOfferUnitPriceComparator.loginType = LoginType.field4231; // L: 667
							}
							break;
						case 11:
							WorldMapSection1.field2203 = var2; // L: 672
							break; // L: 673
						case 12:
							worldId = Integer.parseInt(var2); // L: 692
							break; // L: 693
						case 14:
							TextureProvider.field2483 = Integer.parseInt(var2); // L: 687
							break; // L: 688
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 697
							break; // L: 698
						case 17:
							BoundaryObject.field2618 = var2; // L: 702
							break; // L: 703
						case 21:
							field467 = Integer.parseInt(var2); // L: 677
							break; // L: 678
						case 22:
							field619 = Integer.parseInt(var2) != 0; // L: 741
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 753
				isLowDetail = false; // L: 754
				WorldMapIcon_0.worldHost = this.getCodeBase().getHost(); // L: 756
				String var4 = ArchiveLoader.field984.name; // L: 757
				byte var5 = 0; // L: 758

				try {
					class300.method5507("oldschool", var4, var5, 21); // L: 760
				} catch (Exception var6) { // L: 762
					MilliClock.RunException_sendStackTrace((String)null, var6); // L: 763
				}

				ArchiveLoader.client = this; // L: 765
				RunException.clientType = clientType; // L: 766
				if (field469 == -1) { // L: 767
					field469 = 0; // L: 768
				}

				JagexCache.field1560 = System.getenv("JX_ACCESS_TOKEN"); // L: 770
				System.getenv("JX_REFRESH_TOKEN"); // L: 771
				this.startThread(765, 503, 201); // L: 772
			}
		} catch (RuntimeException var7) {
			throw MouseHandler.newRunException(var7, "client.init(" + ')');
		}
	} // L: 773

	public void setOAuthTokens(String var1, String var2) {
		if (var1 != null && !var1.trim().isEmpty() && var2 != null && !var2.trim().isEmpty()) { // L: 776
			JagexCache.field1560 = var1; // L: 779
			class275.method5201(10); // L: 780
		}
	} // L: 777 781

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "-6598"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 130
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1972300304"
	)
	static boolean method1643() {
		if (archiveLoaders != null && archiveLoadersDone < archiveLoaders.size()) { // L: 1983
			while (archiveLoadersDone < archiveLoaders.size()) { // L: 1984
				ArchiveLoader var0 = (ArchiveLoader)archiveLoaders.get(archiveLoadersDone); // L: 1985
				if (!var0.isLoaded()) { // L: 1986
					return false;
				}

				++archiveLoadersDone; // L: 1987
			}

			return true; // L: 1989
		} else {
			return true; // L: 1988
		}
	}
}
