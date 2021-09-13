import com.jagex.oldscape.pub.OAuthTokens;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
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
	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "[Ldi;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = -1502166781
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1159577377
	)
	static int field696;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		longValue = -5529471275658625843L
	)
	static long field705;
	@ObfuscatedName("rv")
	static boolean field728;
	@ObfuscatedName("pi")
	static boolean[] field697;
	@ObfuscatedName("pu")
	static boolean[] field687;
	@ObfuscatedName("pm")
	static boolean[] field766;
	@ObfuscatedName("qc")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = 1629294251
	)
	public static int field760;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -136985491
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pf")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pr")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pw")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qs")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	static final ApproximateRouteStrategy field765;
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 1440661425
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1277209671
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("uo")
	static int[] field514;
	@ObfuscatedName("uq")
	static int[] field767;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = -1315995035
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 1347950167
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 1925764631
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = 1334725941
	)
	static int field755;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -152978977
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = -381217061
	)
	static int field756;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 1830373527
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("sm")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sk")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("si")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -1670067255
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("se")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uu")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = 1463103177
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "[Leb;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("qn")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 2056199965
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("st")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -1767039691
	)
	static int field719;
	@ObfuscatedName("sw")
	static boolean[] field736;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		longValue = 7251701289015568381L
	)
	static long field716;
	@ObfuscatedName("su")
	static int[] field484;
	@ObfuscatedName("sn")
	static int[] field738;
	@ObfuscatedName("sp")
	static int[] field686;
	@ObfuscatedName("sj")
	static int[] field740;
	@ObfuscatedName("sr")
	static short field723;
	@ObfuscatedName("sd")
	static short field742;
	@ObfuscatedName("tm")
	static short field711;
	@ObfuscatedName("tu")
	static short field748;
	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("to")
	static short field746;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -1664867833
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = 770370497
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tg")
	static short field642;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 632006503
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("rb")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rx")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "[Loc;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -1078545723
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 2049402333
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = 1291619735
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -1814616365
	)
	static int field713;
	@ObfuscatedName("tx")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("sl")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("qq")
	static int[] field595;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = 132225329
	)
	static int field763;
	@ObfuscatedName("qk")
	static int[] field714;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static NodeDeque field745;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static NodeDeque field693;
	@ObfuscatedName("qa")
	static int[] field707;
	@ObfuscatedName("qx")
	static String field647;
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfk;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ax")
	static boolean field659;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -161321205
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1318606403
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1124653611
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("br")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bw")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -857630623
	)
	static int field485;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 315368685
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 292962467
	)
	static int field487;
	@ObfuscatedName("bm")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -2089106389
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cj")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 12559439
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		longValue = -433147915463775909L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1327623191
	)
	static int field494;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -404339809
	)
	static int field675;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		longValue = -3858358018324836759L
	)
	static long field496;
	@ObfuscatedName("df")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("db")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1613310513
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 629282381
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 936842369
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1578164193
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -251112059
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -84407875
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1460490415
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1031141295
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1578450373
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -887858119
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1483631971
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -857787961
	)
	static int field512;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = -1837083259
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -768167923
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 89682979
	)
	static int field546;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 1955360825
	)
	static int field516;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -1445444765
	)
	static int field517;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static class112 field518;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	static class403 field519;
	@ObfuscatedName("fl")
	static String field520;
	@ObfuscatedName("fk")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fh")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 1945408703
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gt")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 853284993
	)
	static int field560;
	@ObfuscatedName("gn")
	static int[] field533;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 1544012175
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ga")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gz")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gq")
	static boolean field538;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("gh")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = 284319285
	)
	static int field639;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -1264950889
	)
	static int field656;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = -500782197
	)
	static int field641;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1183305117
	)
	static int field544;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -1923762161
	)
	static int field545;
	@ObfuscatedName("hk")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("hc")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hw")
	static final int[] field549;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 324743823
	)
	static int field764;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -1474727833
	)
	static int field551;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -1552520763
	)
	static int field552;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -354722705
	)
	static int field603;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = 993718639
	)
	static int field600;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ie")
	static boolean field555;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -2039158441
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 370668467
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -520197213
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 299599437
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -1028525999
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -490020359
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 1729737161
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -1137422519
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = -509788291
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -444985715
	)
	static int field565;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1174034645
	)
	static int field566;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 516207977
	)
	static int field567;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 2061027769
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = 972759825
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -1605750321
	)
	public static int field570;
	@ObfuscatedName("jl")
	static boolean field741;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 1514333031
	)
	static int field572;
	@ObfuscatedName("jt")
	static boolean field573;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 1766056555
	)
	static int field483;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -431765033
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -1047897529
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("jw")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ju")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ji")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("jk")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("jo")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jf")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jz")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jx")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jq")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 2031565073
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 483959673
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -45338133
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -1867073259
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 331732865
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 1154123781
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1376995193
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ku")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 501205941
	)
	static int field727;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = 1393158353
	)
	static int field593;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -503443311
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1221064633
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 280045387
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 708762881
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kt")
	static boolean field668;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -1968980689
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 69082609
	)
	static int field602;
	@ObfuscatedName("kg")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1370080405
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -1224578851
	)
	static int field608;
	@ObfuscatedName("lu")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -1161740481
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 2111456203
	)
	static int field495;
	@ObfuscatedName("ly")
	static int[] field610;
	@ObfuscatedName("li")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("lh")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("lf")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ln")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1971520031
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "[[[Lkn;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("lt")
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
	@ObfuscatedName("ls")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("la")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lx")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1357806369
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("le")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 2115834337
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mr")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mw")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mj")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ms")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mh")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("mp")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mt")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mo")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("mb")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("me")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mf")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 764299201
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -2102226031
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -982825125
	)
	static int field583;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 920774567
	)
	static int field640;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -155667391
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nw")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = 1890577267
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -1561877611
	)
	static int field645;
	@ObfuscatedName("nq")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nh")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 1156082253
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1541222897
	)
	static int field650;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 453026875
	)
	static int field543;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = 549435403
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -2124523247
	)
	static int field609;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -1504668177
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 1093671261
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 1451625247
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 998536869
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("ni")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 263368687
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 506075963
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("on")
	static boolean field666;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -2067171883
	)
	static int field623;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -925480379
	)
	static int field658;
	@ObfuscatedName("ou")
	static boolean field669;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -214392951
	)
	static int field739;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 173271023
	)
	static int field671;
	@ObfuscatedName("ot")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 1293527401
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("og")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -909406265
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("or")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 2125569939
	)
	static int field677;
	@ObfuscatedName("oi")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = -546672755
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("ob")
	static int[] field680;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 2137131125
	)
	static int field715;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 2084676315
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 866500147
	)
	static int field683;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -652383277
	)
	static int field630;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1547168983
	)
	static int field664;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1683296527
	)
	static int field672;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -1462466613
	)
	static int field703;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -246199425
	)
	static int field688;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 55712201
	)
	static int field695;
	@ObfuscatedName("fn")
	String field521;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	class14 field522;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	class19 field556;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	Buffer field526;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	class7 field527;

	static {
		field659 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field485 = -1;
		clientType = -1;
		field487 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field494 = -1;
		field675 = -1;
		field496 = -1L;
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
		field512 = 0;
		js5Errors = 0;
		loginState = 0;
		field546 = 0;
		field516 = 0;
		field517 = 0;
		field518 = class112.field1357;
		field519 = class403.field4332;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field560 = 0;
		field533 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		useBufferedSocket = true;
		field538 = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field639 = 0;
		field656 = 1;
		field641 = 0;
		field544 = 1;
		field545 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field549 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field764 = 0;
		field551 = 2301979;
		field552 = 5063219;
		field603 = 3353893;
		field600 = 7759444;
		field555 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field565 = 0;
		field566 = 0;
		field567 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field570 = 0;
		field741 = false;
		field572 = 0;
		field573 = false;
		field483 = 0;
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
		field727 = 0;
		field593 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field668 = false;
		itemDragDuration = 0;
		field602 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field608 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field495 = 0;
		field610 = new int[1000];
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
		field583 = 0;
		field640 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field645 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field650 = 0;
		field543 = -1;
		chatEffects = 0;
		field609 = 0;
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
		field666 = false;
		field623 = -1;
		field658 = -1;
		field669 = false;
		field739 = -1;
		field671 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field677 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field680 = new int[32];
		field715 = 0;
		chatCycle = 0;
		field683 = 0;
		field630 = 0;
		field664 = 0;
		field672 = 0;
		field703 = 0;
		field688 = 0;
		field695 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field745 = new NodeDeque();
		field693 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field696 = -2;
		field697 = new boolean[100];
		field766 = new boolean[100];
		field687 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field705 = 0L;
		isResizable = true;
		field707 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field647 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field713 = 0;
		field714 = new int[128];
		field595 = new int[128];
		field716 = -1L;
		currentClanSettings = new ClanSettings[1];
		currentClanChannels = new ClanChannel[1];
		field719 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field728 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field736 = new boolean[5];
		field484 = new int[5];
		field738 = new int[5];
		field686 = new int[5];
		field740 = new int[5];
		field723 = 256;
		field742 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field642 = 1;
		field746 = 32767;
		field711 = 1;
		field748 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field755 = -1;
		field756 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field760 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field763 = 0;
		field765 = new ApproximateRouteStrategy();
		field514 = new int[50];
		field767 = new int[50];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "104493179"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field705 = Occluder.method4335() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1;
			TileItem.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) {
				ByteArrayPool.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
			}
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null;
			TileItem.ByteArrayPool_altSizeArrayCounts = null;
			ByteArrayPool.ByteArrayPool_arrays = null;
		}

		GameBuild.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		AbstractWorldMapIcon.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		ClientPreferences.currentPort = GameBuild.worldPort;
		User.field3948 = class260.field3030;
		class11.field54 = class260.field3024;
		class28.field167 = class260.field3026;
		UserComparator9.field1330 = class260.field3027;
		class262.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		class135.mouseWheel = this.mouseWheel();
		ApproximateRouteStrategy.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		VarbitComposition.clientPreferences = Interpreter.method1861();
		this.setUpClipboard();
		String var4 = PcmPlayer.null_string;
		class29.applet = this;
		if (var4 != null) {
			class29.field172 = var4;
		}

		if (gameBuild != 0) {
			displayFps = true;
		}

		ReflectionCheck.setWindowedMode(VarbitComposition.clientPreferences.windowMode);
		class20.friendSystem = new FriendSystem(SoundCache.loginType);
		this.field522 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1304769230"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				WorldMapIcon_0.method3730();
				class1.playPcmPlayers();
				int var50;
				synchronized(KeyHandler.KeyHandler_instance) {
					++KeyHandler.KeyHandler_idleCycles;
					KeyHandler.field135 = KeyHandler.field137;
					KeyHandler.field114 = 0;
					KeyHandler.field132 = 0;
					Arrays.fill(KeyHandler.field124, false);
					Arrays.fill(KeyHandler.field125, false);
					if (KeyHandler.field128 < 0) {
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
						KeyHandler.field128 = KeyHandler.field143;
					} else {
						while (KeyHandler.field128 != KeyHandler.field143) {
							var50 = KeyHandler.field126[KeyHandler.field143];
							KeyHandler.field143 = KeyHandler.field143 + 1 & 127;
							if (var50 < 0) {
								var50 = ~var50;
								if (KeyHandler.KeyHandler_pressedKeys[var50]) {
									KeyHandler.KeyHandler_pressedKeys[var50] = false;
									KeyHandler.field125[var50] = true;
									KeyHandler.field139[KeyHandler.field132] = var50;
									++KeyHandler.field132;
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var50] && KeyHandler.field114 < KeyHandler.field131.length - 1) {
									KeyHandler.field124[var50] = true;
									KeyHandler.field131[++KeyHandler.field114 - 1] = var50;
								}

								KeyHandler.KeyHandler_pressedKeys[var50] = true;
							}
						}
					}

					if (KeyHandler.field114 > 0) {
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field137 = KeyHandler.field136;
				}

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

				int var51;
				if (class135.mouseWheel != null) {
					var51 = class135.mouseWheel.useRotation();
					mouseWheelRotation = var51;
				}

				if (gameState == 0) {
					Fonts.load();
					class122.clock.mark();

					for (var51 = 0; var51 < 32; ++var51) {
						GameEngine.graphicsTickTimes[var51] = 0L;
					}

					for (var51 = 0; var51 < 32; ++var51) {
						GameEngine.clientTickTimes[var51] = 0L;
					}

					GameEngine.gameCyclesToDo = 0;
				} else if (gameState == 5) {
					DevicePcmPlayerProvider.method366(this, class129.fontPlain12);
					Fonts.load();
					class122.clock.mark();

					for (var51 = 0; var51 < 32; ++var51) {
						GameEngine.graphicsTickTimes[var51] = 0L;
					}

					for (var51 = 0; var51 < 32; ++var51) {
						GameEngine.clientTickTimes[var51] = 0L;
					}

					GameEngine.gameCyclesToDo = 0;
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						DevicePcmPlayerProvider.method366(this, class129.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						NPC.method2221(false);
						field639 = 0;
						boolean var81 = true;

						for (var50 = 0; var50 < WorldMapData_0.regionLandArchives.length; ++var50) {
							if (class262.regionMapArchiveIds[var50] != -1 && WorldMapData_0.regionLandArchives[var50] == null) {
								WorldMapData_0.regionLandArchives[var50] = ObjectComposition.archive5.takeFile(class262.regionMapArchiveIds[var50], 0);
								if (WorldMapData_0.regionLandArchives[var50] == null) {
									var81 = false;
									++field639;
								}
							}

							if (UserComparator6.regionLandArchiveIds[var50] != -1 && class16.regionMapArchives[var50] == null) {
								class16.regionMapArchives[var50] = ObjectComposition.archive5.takeFileEncrypted(UserComparator6.regionLandArchiveIds[var50], 0, class244.xteaKeys[var50]);
								if (class16.regionMapArchives[var50] == null) {
									var81 = false;
									++field639;
								}
							}
						}

						if (!var81) {
							field545 = 1;
						} else {
							field641 = 0;
							var81 = true;

							int var52;
							int var53;
							for (var50 = 0; var50 < WorldMapData_0.regionLandArchives.length; ++var50) {
								byte[] var3 = class16.regionMapArchives[var50];
								if (var3 != null) {
									var52 = (class87.regions[var50] >> 8) * 64 - FloorOverlayDefinition.baseX;
									var53 = (class87.regions[var50] & 255) * 64 - class320.baseY;
									if (isInInstance) {
										var52 = 10;
										var53 = 10;
									}

									var81 &= class1.method16(var3, var52, var53);
								}
							}

							if (!var81) {
								field545 = 2;
							} else {
								if (field545 != 0) {
									WorldMapData_1.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
								}

								class1.playPcmPlayers();
								CollisionMap.scene.clear();

								for (var50 = 0; var50 < 4; ++var50) {
									collisionMaps[var50].clear();
								}

								int var54;
								for (var50 = 0; var50 < 4; ++var50) {
									for (var54 = 0; var54 < 104; ++var54) {
										for (var52 = 0; var52 < 104; ++var52) {
											Tiles.Tiles_renderFlags[var50][var54][var52] = 0;
										}
									}
								}

								class1.playPcmPlayers();
								Tiles.Tiles_minPlane = 99;
								class6.Tiles_underlays = new byte[4][104][104];
								Tiles.Tiles_overlays = new byte[4][104][104];
								Tiles.Tiles_shapes = new byte[4][104][104];
								Tiles.field977 = new byte[4][104][104];
								class113.field1367 = new int[4][105][105];
								FloorUnderlayDefinition.field1769 = new byte[4][105][105];
								class28.field169 = new int[105][105];
								DirectByteArrayCopier.Tiles_hue = new int[104];
								WorldMapSprite.Tiles_saturation = new int[104];
								Tiles.Tiles_lightness = new int[104];
								Tiles.Tiles_hueMultiplier = new int[104];
								RunException.field4410 = new int[104];
								var50 = WorldMapData_0.regionLandArchives.length;

								for (ObjectSound var71 = (ObjectSound)ObjectSound.objectSounds.last(); var71 != null; var71 = (ObjectSound)ObjectSound.objectSounds.previous()) {
									if (var71.stream1 != null) {
										MusicPatchPcmStream.pcmStreamMixer.removeSubStream(var71.stream1);
										var71.stream1 = null;
									}

									if (var71.stream2 != null) {
										MusicPatchPcmStream.pcmStreamMixer.removeSubStream(var71.stream2);
										var71.stream2 = null;
									}
								}

								ObjectSound.objectSounds.clear();
								NPC.method2221(true);
								int var7;
								int var8;
								int var10;
								int var11;
								int var12;
								int var13;
								int[] var10000;
								int var56;
								if (!isInInstance) {
									var54 = 0;

									label1372:
									while (true) {
										byte[] var6;
										if (var54 >= var50) {
											for (var54 = 0; var54 < var50; ++var54) {
												var52 = (class87.regions[var54] >> 8) * 64 - FloorOverlayDefinition.baseX;
												var53 = (class87.regions[var54] & 255) * 64 - class320.baseY;
												var6 = WorldMapData_0.regionLandArchives[var54];
												if (var6 == null && class7.field26 < 800) {
													class1.playPcmPlayers();
													GameBuild.method5068(var52, var53, 64, 64);
												}
											}

											NPC.method2221(true);
											var54 = 0;

											while (true) {
												if (var54 >= var50) {
													break label1372;
												}

												byte[] var4 = class16.regionMapArchives[var54];
												if (var4 != null) {
													var53 = (class87.regions[var54] >> 8) * 64 - FloorOverlayDefinition.baseX;
													var56 = (class87.regions[var54] & 255) * 64 - class320.baseY;
													class1.playPcmPlayers();
													class13.method180(var4, var53, var56, CollisionMap.scene, collisionMaps);
												}

												++var54;
											}
										}

										var52 = (class87.regions[var54] >> 8) * 64 - FloorOverlayDefinition.baseX;
										var53 = (class87.regions[var54] & 255) * 64 - class320.baseY;
										var6 = WorldMapData_0.regionLandArchives[var54];
										if (var6 != null) {
											class1.playPcmPlayers();
											var7 = class325.field3891 * 8 - 48;
											var8 = class7.field26 * 8 - 48;
											CollisionMap[] var9 = collisionMaps;
											var10 = 0;

											label1369:
											while (true) {
												if (var10 >= 4) {
													Buffer var55 = new Buffer(var6);
													var11 = 0;

													while (true) {
														if (var11 >= 4) {
															break label1369;
														}

														for (var12 = 0; var12 < 64; ++var12) {
															for (var13 = 0; var13 < 64; ++var13) {
																StructComposition.loadTerrain(var55, var11, var52 + var12, var13 + var53, var7, var8, 0);
															}
														}

														++var11;
													}
												}

												for (var11 = 0; var11 < 64; ++var11) {
													for (var12 = 0; var12 < 64; ++var12) {
														if (var11 + var52 > 0 && var11 + var52 < 103 && var53 + var12 > 0 && var12 + var53 < 103) {
															var10000 = var9[var10].flags[var11 + var52];
															var10000[var53 + var12] &= -16777217;
														}
													}
												}

												++var10;
											}
										}

										++var54;
									}
								}

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
								int var33;
								int var34;
								int var35;
								int var36;
								int var37;
								int var39;
								int var41;
								int var42;
								int var43;
								int var44;
								int var45;
								int var46;
								int var57;
								if (isInInstance) {
									var54 = 0;

									label1318:
									while (true) {
										if (var54 >= 4) {
											for (var54 = 0; var54 < 13; ++var54) {
												for (var52 = 0; var52 < 13; ++var52) {
													var53 = instanceChunkTemplates[0][var54][var52];
													if (var53 == -1) {
														GameBuild.method5068(var54 * 8, var52 * 8, 8, 8);
													}
												}
											}

											NPC.method2221(true);
											var54 = 0;

											while (true) {
												if (var54 >= 4) {
													break label1318;
												}

												class1.playPcmPlayers();

												for (var52 = 0; var52 < 13; ++var52) {
													label1241:
													for (var53 = 0; var53 < 13; ++var53) {
														var56 = instanceChunkTemplates[var54][var52][var53];
														if (var56 != -1) {
															var7 = var56 >> 24 & 3;
															var8 = var56 >> 1 & 3;
															var57 = var56 >> 14 & 1023;
															var10 = var56 >> 3 & 2047;
															var11 = (var57 / 8 << 8) + var10 / 8;

															for (var12 = 0; var12 < class87.regions.length; ++var12) {
																if (class87.regions[var12] == var11 && class16.regionMapArchives[var12] != null) {
																	byte[] var58 = class16.regionMapArchives[var12];
																	var14 = var52 * 8;
																	var15 = var53 * 8;
																	var16 = (var57 & 7) * 8;
																	var17 = (var10 & 7) * 8;
																	Scene var18 = CollisionMap.scene;
																	CollisionMap[] var19 = collisionMaps;
																	Buffer var20 = new Buffer(var58);
																	var21 = -1;

																	while (true) {
																		var22 = var20.method7009();
																		if (var22 == 0) {
																			continue label1241;
																		}

																		var21 += var22;
																		var23 = 0;

																		while (true) {
																			var24 = var20.readUShortSmart();
																			if (var24 == 0) {
																				break;
																			}

																			var23 += var24 - 1;
																			var25 = var23 & 63;
																			var26 = var23 >> 6 & 63;
																			var27 = var23 >> 12;
																			var28 = var20.readUnsignedByte();
																			var29 = var28 >> 2;
																			var30 = var28 & 3;
																			if (var7 == var27 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
																				ObjectComposition var31 = HitSplatDefinition.getObjectDefinition(var21);
																				var34 = var26 & 7;
																				var35 = var25 & 7;
																				var37 = var31.sizeX;
																				int var38 = var31.sizeY;
																				if ((var30 & 1) == 1) {
																					var39 = var37;
																					var37 = var38;
																					var38 = var39;
																				}

																				var36 = var8 & 3;
																				if (var36 == 0) {
																					var33 = var34;
																				} else if (var36 == 1) {
																					var33 = var35;
																				} else if (var36 == 2) {
																					var33 = 7 - var34 - (var37 - 1);
																				} else {
																					var33 = 7 - var35 - (var38 - 1);
																				}

																				var39 = var14 + var33;
																				var42 = var26 & 7;
																				var43 = var25 & 7;
																				var45 = var31.sizeX;
																				var46 = var31.sizeY;
																				int var47;
																				if ((var30 & 1) == 1) {
																					var47 = var45;
																					var45 = var46;
																					var46 = var47;
																				}

																				var44 = var8 & 3;
																				if (var44 == 0) {
																					var41 = var43;
																				} else if (var44 == 1) {
																					var41 = 7 - var42 - (var45 - 1);
																				} else if (var44 == 2) {
																					var41 = 7 - var43 - (var46 - 1);
																				} else {
																					var41 = var42;
																				}

																				var47 = var41 + var15;
																				if (var39 > 0 && var47 > 0 && var39 < 103 && var47 < 103) {
																					int var48 = var54;
																					if ((Tiles.Tiles_renderFlags[1][var39][var47] & 2) == 2) {
																						var48 = var54 - 1;
																					}

																					CollisionMap var49 = null;
																					if (var48 >= 0) {
																						var49 = var19[var48];
																					}

																					class140.method2715(var54, var39, var47, var21, var30 + var8 & 3, var29, var18, var49);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}

												++var54;
											}
										}

										class1.playPcmPlayers();

										for (var52 = 0; var52 < 13; ++var52) {
											for (var53 = 0; var53 < 13; ++var53) {
												boolean var82 = false;
												var7 = instanceChunkTemplates[var54][var52][var53];
												if (var7 != -1) {
													var8 = var7 >> 24 & 3;
													var57 = var7 >> 1 & 3;
													var10 = var7 >> 14 & 1023;
													var11 = var7 >> 3 & 2047;
													var12 = (var10 / 8 << 8) + var11 / 8;

													for (var13 = 0; var13 < class87.regions.length; ++var13) {
														if (class87.regions[var13] == var12 && WorldMapData_0.regionLandArchives[var13] != null) {
															class134.method2665(WorldMapData_0.regionLandArchives[var13], var54, var52 * 8, var53 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var57, collisionMaps);
															var82 = true;
															break;
														}
													}
												}

												if (!var82) {
													var8 = var54;
													var57 = var52 * 8;
													var10 = var53 * 8;

													for (var11 = 0; var11 < 8; ++var11) {
														for (var12 = 0; var12 < 8; ++var12) {
															Tiles.Tiles_heights[var8][var11 + var57][var12 + var10] = 0;
														}
													}

													if (var57 > 0) {
														for (var11 = 1; var11 < 8; ++var11) {
															Tiles.Tiles_heights[var8][var57][var11 + var10] = Tiles.Tiles_heights[var8][var57 - 1][var10 + var11];
														}
													}

													if (var10 > 0) {
														for (var11 = 1; var11 < 8; ++var11) {
															Tiles.Tiles_heights[var8][var57 + var11][var10] = Tiles.Tiles_heights[var8][var11 + var57][var10 - 1];
														}
													}

													if (var57 > 0 && Tiles.Tiles_heights[var8][var57 - 1][var10] != 0) {
														Tiles.Tiles_heights[var8][var57][var10] = Tiles.Tiles_heights[var8][var57 - 1][var10];
													} else if (var10 > 0 && Tiles.Tiles_heights[var8][var57][var10 - 1] != 0) {
														Tiles.Tiles_heights[var8][var57][var10] = Tiles.Tiles_heights[var8][var57][var10 - 1];
													} else if (var57 > 0 && var10 > 0 && Tiles.Tiles_heights[var8][var57 - 1][var10 - 1] != 0) {
														Tiles.Tiles_heights[var8][var57][var10] = Tiles.Tiles_heights[var8][var57 - 1][var10 - 1];
													}
												}
											}
										}

										++var54;
									}
								}

								NPC.method2221(true);
								class1.playPcmPlayers();
								Scene var72 = CollisionMap.scene;
								CollisionMap[] var73 = collisionMaps;

								for (var53 = 0; var53 < 4; ++var53) {
									for (var56 = 0; var56 < 104; ++var56) {
										for (var7 = 0; var7 < 104; ++var7) {
											if ((Tiles.Tiles_renderFlags[var53][var56][var7] & 1) == 1) {
												var8 = var53;
												if ((Tiles.Tiles_renderFlags[1][var56][var7] & 2) == 2) {
													var8 = var53 - 1;
												}

												if (var8 >= 0) {
													var73[var8].setBlockedByFloor(var56, var7);
												}
											}
										}
									}
								}

								Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
								if (Tiles.rndHue < -8) {
									Tiles.rndHue = -8;
								}

								if (Tiles.rndHue > 8) {
									Tiles.rndHue = 8;
								}

								Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
								if (Tiles.rndLightness < -16) {
									Tiles.rndLightness = -16;
								}

								if (Tiles.rndLightness > 16) {
									Tiles.rndLightness = 16;
								}

								int var59;
								int var60;
								int var61;
								for (var53 = 0; var53 < 4; ++var53) {
									byte[][] var74 = FloorUnderlayDefinition.field1769[var53];
									var12 = (int)Math.sqrt(5100.0D);
									var13 = var12 * 768 >> 8;

									for (var14 = 1; var14 < 103; ++var14) {
										for (var15 = 1; var15 < 103; ++var15) {
											var16 = Tiles.Tiles_heights[var53][var15 + 1][var14] - Tiles.Tiles_heights[var53][var15 - 1][var14];
											var17 = Tiles.Tiles_heights[var53][var15][var14 + 1] - Tiles.Tiles_heights[var53][var15][var14 - 1];
											var59 = (int)Math.sqrt((double)(var16 * var16 + var17 * var17 + 65536));
											var60 = (var16 << 8) / var59;
											var61 = 65536 / var59;
											var21 = (var17 << 8) / var59;
											var22 = (var21 * -50 + var60 * -50 + var61 * -10) / var13 + 96;
											var23 = (var74[var15 - 1][var14] >> 2) + (var74[var15][var14 - 1] >> 2) + (var74[var15 + 1][var14] >> 3) + (var74[var15][var14 + 1] >> 3) + (var74[var15][var14] >> 1);
											class28.field169[var15][var14] = var22 - var23;
										}
									}

									for (var14 = 0; var14 < 104; ++var14) {
										DirectByteArrayCopier.Tiles_hue[var14] = 0;
										WorldMapSprite.Tiles_saturation[var14] = 0;
										Tiles.Tiles_lightness[var14] = 0;
										Tiles.Tiles_hueMultiplier[var14] = 0;
										RunException.field4410[var14] = 0;
									}

									for (var14 = -5; var14 < 109; ++var14) {
										for (var15 = 0; var15 < 104; ++var15) {
											var16 = var14 + 5;
											int var10002;
											if (var16 >= 0 && var16 < 104) {
												var17 = class6.Tiles_underlays[var53][var16][var15] & 255;
												if (var17 > 0) {
													FloorUnderlayDefinition var76 = TaskHandler.method2740(var17 - 1);
													var10000 = DirectByteArrayCopier.Tiles_hue;
													var10000[var15] += var76.hue;
													var10000 = WorldMapSprite.Tiles_saturation;
													var10000[var15] += var76.saturation;
													var10000 = Tiles.Tiles_lightness;
													var10000[var15] += var76.lightness;
													var10000 = Tiles.Tiles_hueMultiplier;
													var10000[var15] += var76.hueMultiplier;
													var10002 = RunException.field4410[var15]++;
												}
											}

											var17 = var14 - 5;
											if (var17 >= 0 && var17 < 104) {
												var59 = class6.Tiles_underlays[var53][var17][var15] & 255;
												if (var59 > 0) {
													FloorUnderlayDefinition var77 = TaskHandler.method2740(var59 - 1);
													var10000 = DirectByteArrayCopier.Tiles_hue;
													var10000[var15] -= var77.hue;
													var10000 = WorldMapSprite.Tiles_saturation;
													var10000[var15] -= var77.saturation;
													var10000 = Tiles.Tiles_lightness;
													var10000[var15] -= var77.lightness;
													var10000 = Tiles.Tiles_hueMultiplier;
													var10000[var15] -= var77.hueMultiplier;
													var10002 = RunException.field4410[var15]--;
												}
											}
										}

										if (var14 >= 1 && var14 < 103) {
											var15 = 0;
											var16 = 0;
											var17 = 0;
											var59 = 0;
											var60 = 0;

											for (var61 = -5; var61 < 109; ++var61) {
												var21 = var61 + 5;
												if (var21 >= 0 && var21 < 104) {
													var15 += DirectByteArrayCopier.Tiles_hue[var21];
													var16 += WorldMapSprite.Tiles_saturation[var21];
													var17 += Tiles.Tiles_lightness[var21];
													var59 += Tiles.Tiles_hueMultiplier[var21];
													var60 += RunException.field4410[var21];
												}

												var22 = var61 - 5;
												if (var22 >= 0 && var22 < 104) {
													var15 -= DirectByteArrayCopier.Tiles_hue[var22];
													var16 -= WorldMapSprite.Tiles_saturation[var22];
													var17 -= Tiles.Tiles_lightness[var22];
													var59 -= Tiles.Tiles_hueMultiplier[var22];
													var60 -= RunException.field4410[var22];
												}

												if (var61 >= 1 && var61 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var61] & 2) != 0 || (Tiles.Tiles_renderFlags[var53][var14][var61] & 16) == 0)) {
													if (var53 < Tiles.Tiles_minPlane) {
														Tiles.Tiles_minPlane = var53;
													}

													var23 = class6.Tiles_underlays[var53][var14][var61] & 255;
													var24 = Tiles.Tiles_overlays[var53][var14][var61] & 255;
													if (var23 > 0 || var24 > 0) {
														var25 = Tiles.Tiles_heights[var53][var14][var61];
														var26 = Tiles.Tiles_heights[var53][var14 + 1][var61];
														var27 = Tiles.Tiles_heights[var53][var14 + 1][var61 + 1];
														var28 = Tiles.Tiles_heights[var53][var14][var61 + 1];
														var29 = class28.field169[var14][var61];
														var30 = class28.field169[var14 + 1][var61];
														int var62 = class28.field169[var14 + 1][var61 + 1];
														int var32 = class28.field169[var14][var61 + 1];
														var33 = -1;
														var34 = -1;
														if (var23 > 0) {
															var35 = var15 * 256 / var59;
															var36 = var16 / var60;
															var37 = var17 / var60;
															var33 = PlatformInfo.hslToRgb(var35, var36, var37);
															var35 = var35 + Tiles.rndHue & 255;
															var37 += Tiles.rndLightness;
															if (var37 < 0) {
																var37 = 0;
															} else if (var37 > 255) {
																var37 = 255;
															}

															var34 = PlatformInfo.hslToRgb(var35, var36, var37);
														}

														FloorOverlayDefinition var63;
														if (var53 > 0) {
															boolean var79 = true;
															if (var23 == 0 && Tiles.Tiles_shapes[var53][var14][var61] != 0) {
																var79 = false;
															}

															if (var24 > 0) {
																var37 = var24 - 1;
																var63 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37);
																FloorOverlayDefinition var64;
																if (var63 != null) {
																	var64 = var63;
																} else {
																	byte[] var65 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37);
																	var63 = new FloorOverlayDefinition();
																	if (var65 != null) {
																		var63.decode(new Buffer(var65), var37);
																	}

																	var63.postDecode();
																	FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var63, (long)var37);
																	var64 = var63;
																}

																if (!var64.hideUnderlay) {
																	var79 = false;
																}
															}

															if (var79 && var25 == var26 && var25 == var27 && var28 == var25) {
																var10000 = class113.field1367[var53][var14];
																var10000[var61] |= 2340;
															}
														}

														var35 = 0;
														if (var34 != -1) {
															var35 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapCacheName.method3873(var34, 96)];
														}

														if (var24 == 0) {
															var72.addTile(var53, var14, var61, 0, 0, -1, var25, var26, var27, var28, WorldMapCacheName.method3873(var33, var29), WorldMapCacheName.method3873(var33, var30), WorldMapCacheName.method3873(var33, var62), WorldMapCacheName.method3873(var33, var32), 0, 0, 0, 0, var35, 0);
														} else {
															var36 = Tiles.Tiles_shapes[var53][var14][var61] + 1;
															byte var80 = Tiles.field977[var53][var14][var61];
															var39 = var24 - 1;
															FloorOverlayDefinition var66 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var39);
															if (var66 != null) {
																var63 = var66;
															} else {
																byte[] var67 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var39);
																var66 = new FloorOverlayDefinition();
																if (var67 != null) {
																	var66.decode(new Buffer(var67), var39);
																}

																var66.postDecode();
																FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var66, (long)var39);
																var63 = var66;
															}

															var41 = var63.texture;
															if (var41 >= 0) {
																var43 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var41);
																var42 = -1;
															} else if (var63.primaryRgb == 16711935) {
																var42 = -2;
																var41 = -1;
																var43 = -2;
															} else {
																var42 = PlatformInfo.hslToRgb(var63.hue, var63.saturation, var63.lightness);
																var44 = var63.hue + Tiles.rndHue & 255;
																var45 = var63.lightness + Tiles.rndLightness;
																if (var45 < 0) {
																	var45 = 0;
																} else if (var45 > 255) {
																	var45 = 255;
																}

																var43 = PlatformInfo.hslToRgb(var44, var63.saturation, var45);
															}

															var44 = 0;
															if (var43 != -2) {
																var44 = Rasterizer3D.Rasterizer3D_colorPalette[Language.method5397(var43, 96)];
															}

															if (var63.secondaryRgb != -1) {
																var45 = var63.secondaryHue + Tiles.rndHue & 255;
																var46 = var63.secondaryLightness + Tiles.rndLightness;
																if (var46 < 0) {
																	var46 = 0;
																} else if (var46 > 255) {
																	var46 = 255;
																}

																var43 = PlatformInfo.hslToRgb(var45, var63.secondarySaturation, var46);
																var44 = Rasterizer3D.Rasterizer3D_colorPalette[Language.method5397(var43, 96)];
															}

															var72.addTile(var53, var14, var61, var36, var80, var41, var25, var26, var27, var28, WorldMapCacheName.method3873(var33, var29), WorldMapCacheName.method3873(var33, var30), WorldMapCacheName.method3873(var33, var62), WorldMapCacheName.method3873(var33, var32), Language.method5397(var42, var29), Language.method5397(var42, var30), Language.method5397(var42, var62), Language.method5397(var42, var32), var35, var44);
														}
													}
												}
											}
										}
									}

									for (var14 = 1; var14 < 103; ++var14) {
										for (var15 = 1; var15 < 103; ++var15) {
											var72.setTileMinPlane(var53, var15, var14, SecureRandomCallable.method2010(var53, var15, var14));
										}
									}

									class6.Tiles_underlays[var53] = null;
									Tiles.Tiles_overlays[var53] = null;
									Tiles.Tiles_shapes[var53] = null;
									Tiles.field977[var53] = null;
									FloorUnderlayDefinition.field1769[var53] = null;
								}

								var72.method4290(-50, -10, -50);

								for (var53 = 0; var53 < 104; ++var53) {
									for (var56 = 0; var56 < 104; ++var56) {
										if ((Tiles.Tiles_renderFlags[1][var53][var56] & 2) == 2) {
											var72.setLinkBelow(var53, var56);
										}
									}
								}

								var53 = 1;
								var56 = 2;
								var7 = 4;

								for (var8 = 0; var8 < 4; ++var8) {
									if (var8 > 0) {
										var53 <<= 3;
										var56 <<= 3;
										var7 <<= 3;
									}

									for (var57 = 0; var57 <= var8; ++var57) {
										for (var10 = 0; var10 <= 104; ++var10) {
											for (var11 = 0; var11 <= 104; ++var11) {
												short var78;
												if ((class113.field1367[var57][var11][var10] & var53) != 0) {
													var12 = var10;
													var13 = var10;
													var14 = var57;

													for (var15 = var57; var12 > 0 && (class113.field1367[var57][var11][var12 - 1] & var53) != 0; --var12) {
													}

													while (var13 < 104 && (class113.field1367[var57][var11][var13 + 1] & var53) != 0) {
														++var13;
													}

													label967:
													while (var14 > 0) {
														for (var16 = var12; var16 <= var13; ++var16) {
															if ((class113.field1367[var14 - 1][var11][var16] & var53) == 0) {
																break label967;
															}
														}

														--var14;
													}

													label956:
													while (var15 < var8) {
														for (var16 = var12; var16 <= var13; ++var16) {
															if ((class113.field1367[var15 + 1][var11][var16] & var53) == 0) {
																break label956;
															}
														}

														++var15;
													}

													var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
													if (var16 >= 8) {
														var78 = 240;
														var59 = Tiles.Tiles_heights[var15][var11][var12] - var78;
														var60 = Tiles.Tiles_heights[var14][var11][var12];
														Scene.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var59, var60);

														for (var61 = var14; var61 <= var15; ++var61) {
															for (var21 = var12; var21 <= var13; ++var21) {
																var10000 = class113.field1367[var61][var11];
																var10000[var21] &= ~var53;
															}
														}
													}
												}

												if ((class113.field1367[var57][var11][var10] & var56) != 0) {
													var12 = var11;
													var13 = var11;
													var14 = var57;

													for (var15 = var57; var12 > 0 && (class113.field1367[var57][var12 - 1][var10] & var56) != 0; --var12) {
													}

													while (var13 < 104 && (class113.field1367[var57][var13 + 1][var10] & var56) != 0) {
														++var13;
													}

													label1020:
													while (var14 > 0) {
														for (var16 = var12; var16 <= var13; ++var16) {
															if ((class113.field1367[var14 - 1][var16][var10] & var56) == 0) {
																break label1020;
															}
														}

														--var14;
													}

													label1009:
													while (var15 < var8) {
														for (var16 = var12; var16 <= var13; ++var16) {
															if ((class113.field1367[var15 + 1][var16][var10] & var56) == 0) {
																break label1009;
															}
														}

														++var15;
													}

													var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
													if (var16 >= 8) {
														var78 = 240;
														var59 = Tiles.Tiles_heights[var15][var12][var10] - var78;
														var60 = Tiles.Tiles_heights[var14][var12][var10];
														Scene.Scene_addOccluder(var8, 2, var12 * 128, var13 * 128 + 128, var10 * 128, var10 * 128, var59, var60);

														for (var61 = var14; var61 <= var15; ++var61) {
															for (var21 = var12; var21 <= var13; ++var21) {
																var10000 = class113.field1367[var61][var21];
																var10000[var10] &= ~var56;
															}
														}
													}
												}

												if ((class113.field1367[var57][var11][var10] & var7) != 0) {
													var12 = var11;
													var13 = var11;
													var14 = var10;

													for (var15 = var10; var14 > 0 && (class113.field1367[var57][var11][var14 - 1] & var7) != 0; --var14) {
													}

													while (var15 < 104 && (class113.field1367[var57][var11][var15 + 1] & var7) != 0) {
														++var15;
													}

													label1073:
													while (var12 > 0) {
														for (var16 = var14; var16 <= var15; ++var16) {
															if ((class113.field1367[var57][var12 - 1][var16] & var7) == 0) {
																break label1073;
															}
														}

														--var12;
													}

													label1062:
													while (var13 < 104) {
														for (var16 = var14; var16 <= var15; ++var16) {
															if ((class113.field1367[var57][var13 + 1][var16] & var7) == 0) {
																break label1062;
															}
														}

														++var13;
													}

													if ((var15 - var14 + 1) * (var13 - var12 + 1) >= 4) {
														var16 = Tiles.Tiles_heights[var57][var12][var14];
														Scene.Scene_addOccluder(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

														for (var17 = var12; var17 <= var13; ++var17) {
															for (var59 = var14; var59 <= var15; ++var59) {
																var10000 = class113.field1367[var57][var17];
																var10000[var59] &= ~var7;
															}
														}
													}
												}
											}
										}
									}
								}

								NPC.method2221(true);
								var53 = Tiles.Tiles_minPlane;
								if (var53 > class391.Client_plane) {
									var53 = class391.Client_plane;
								}

								if (var53 < class391.Client_plane - 1) {
									var53 = class391.Client_plane - 1;
								}

								if (isLowDetail) {
									CollisionMap.scene.init(Tiles.Tiles_minPlane);
								} else {
									CollisionMap.scene.init(0);
								}

								for (var56 = 0; var56 < 104; ++var56) {
									for (var7 = 0; var7 < 104; ++var7) {
										SoundSystem.updateItemPile(var56, var7);
									}
								}

								class1.playPcmPlayers();
								class113.method2478();
								ObjectComposition.ObjectDefinition_cachedModelData.clear();
								PacketBufferNode var75;
								if (ArchiveDiskActionHandler.client.hasFrame()) {
									var75 = FriendSystem.getPacketBufferNode(ClientPacket.field2688, packetWriter.isaacCipher);
									var75.packetBuffer.writeInt(1057001181);
									packetWriter.addNode(var75);
								}

								if (!isInInstance) {
									var56 = (class325.field3891 - 6) / 8;
									var7 = (class325.field3891 + 6) / 8;
									var8 = (class7.field26 - 6) / 8;
									var57 = (class7.field26 + 6) / 8;

									for (var10 = var56 - 1; var10 <= var7 + 1; ++var10) {
										for (var11 = var8 - 1; var11 <= var57 + 1; ++var11) {
											if (var10 < var56 || var10 > var7 || var11 < var8 || var11 > var57) {
												ObjectComposition.archive5.loadRegionFromName("m" + var10 + "_" + var11);
												ObjectComposition.archive5.loadRegionFromName("l" + var10 + "_" + var11);
											}
										}
									}
								}

								HealthBarUpdate.updateGameState(30);
								class1.playPcmPlayers();
								class6.Tiles_underlays = null;
								Tiles.Tiles_overlays = null;
								Tiles.Tiles_shapes = null;
								Tiles.field977 = null;
								class113.field1367 = null;
								FloorUnderlayDefinition.field1769 = null;
								class28.field169 = null;
								DirectByteArrayCopier.Tiles_hue = null;
								WorldMapSprite.Tiles_saturation = null;
								Tiles.Tiles_lightness = null;
								Tiles.Tiles_hueMultiplier = null;
								RunException.field4410 = null;
								var75 = FriendSystem.getPacketBufferNode(ClientPacket.field2719, packetWriter.isaacCipher);
								packetWriter.addNode(var75);
								class122.clock.mark();

								for (var7 = 0; var7 < 32; ++var7) {
									GameEngine.graphicsTickTimes[var7] = 0L;
								}

								for (var7 = 0; var7 < 32; ++var7) {
									GameEngine.clientTickTimes[var7] = 0L;
								}

								GameEngine.gameCyclesToDo = 0;
							}
						}
					}
				} else {
					DevicePcmPlayerProvider.method366(this, class129.fontPlain12);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1834579741"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = WorldMapRegion.method3595();
		if (var2 && field728 && UserComparator10.pcmPlayer0 != null) {
			UserComparator10.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field705 != 0L && Occluder.method4335() > field705) {
			ReflectionCheck.setWindowedMode(class12.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field697[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			ApproximateRouteStrategy.drawTitle(class11.fontBold12, class87.fontPlain11, class129.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				ApproximateRouteStrategy.drawTitle(class11.fontBold12, class87.fontPlain11, class129.fontPlain12);
			} else if (gameState == 25) {
				if (field545 == 1) {
					if (field639 > field656) {
						field656 = field639;
					}

					var3 = (field656 * 50 - field639 * 50) / field656;
					WorldMapData_1.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field545 == 2) {
					if (field641 > field544) {
						field544 = field641;
					}

					var3 = (field544 * 50 - field641 * 50) / field544 + 50;
					WorldMapData_1.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					WorldMapData_1.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				WorldMapData_1.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				WorldMapData_1.drawLoadingMessage("Please wait...", false);
			}
		} else {
			ApproximateRouteStrategy.drawTitle(class11.fontBold12, class87.fontPlain11, class129.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field766[var3]) {
					class11.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field766[var3] = false;
				}
			}
		} else if (gameState > 0) {
			class11.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field766[var3] = false;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("kill0")
	protected final void kill0() {
		if (GrandExchangeEvent.varcs.hasUnwrittenChanges()) {
			GrandExchangeEvent.varcs.write();
		}

		if (class184.mouseRecorder != null) {
			class184.mouseRecorder.isRunning = false;
		}

		class184.mouseRecorder = null;
		packetWriter.close();
		HitSplatDefinition.method3115();
		class116.method2492();
		class135.mouseWheel = null;
		if (UserComparator10.pcmPlayer0 != null) {
			UserComparator10.pcmPlayer0.shutdown();
		}

		if (FriendsChat.pcmPlayer1 != null) {
			FriendsChat.pcmPlayer1.shutdown();
		}

		WallDecoration.method4494();
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3676 != 0) {
				ArchiveDiskActionHandler.field3676 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		if (class262.urlRequester != null) {
			class262.urlRequester.close();
			class262.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var4 = 0; var4 < JagexCache.idxCount; ++var4) {
				JagexCache.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var6) {
		}

		this.field522.method191();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1327639479"
	)
	protected final void vmethod1443() {
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-636078656"
	)
	boolean method1139() {
		return field520 != null && !field520.trim().isEmpty();
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1825227949"
	)
	void method1474(String var1) throws MalformedURLException, IOException {
		class10 var2 = new class10(new URL(class16.field84 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class9.field34);
		var2.method104("Authorization", "Bearer " + var1);
		this.field556 = this.field522.method186(var2);
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-390413724"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = Player.method2117();
			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-363959310"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			HealthBarUpdate.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					HealthBarUpdate.updateGameState(1000);
					return;
				}

				field512 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field512 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						HealthBar.js5SocketTask = GameEngine.taskHandler.newSocketTask(class279.worldHost, ClientPreferences.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (HealthBar.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (HealthBar.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							class1.js5Socket = UserComparator4.method2379((Socket)HealthBar.js5SocketTask.result, 40000, 5000);
						} else {
							class1.js5Socket = new NetSocket((Socket)HealthBar.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(199);
						class1.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						JagexCache.field1558 = Occluder.method4335();
					}

					if (js5ConnectState == 3) {
						if (class1.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var5 = class1.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if (Occluder.method4335() - JagexCache.field1558 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var12 = class1.js5Socket;
						boolean var2 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var10) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var12;
						Buffer var3;
						if (NetCache.NetCache_socket != null) {
							try {
								var3 = new Buffer(4);
								var3.writeByte(var2 ? 2 : 3);
								var3.writeMedium(0);
								NetCache.NetCache_socket.write(var3.array, 0, 4);
							} catch (IOException var9) {
								try {
									NetCache.NetCache_socket.close();
								} catch (Exception var8) {
								}

								++NetCache.NetCache_ioExceptions;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						Coord.NetCache_currentResponse = null;
						class138.NetCache_responseArchiveBuffer = null;
						NetCache.field3736 = 0;

						while (true) {
							NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
							if (var13 == null) {
								while (true) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
									if (var13 == null) {
										if (NetCache.field3735 != 0) {
											try {
												var3 = new Buffer(4);
												var3.writeByte(4);
												var3.writeByte(NetCache.field3735);
												var3.writeShort(0);
												NetCache.NetCache_socket.write(var3.array, 0, 4);
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
										KeyHandler.field149 = Occluder.method4335();
										HealthBar.js5SocketTask = null;
										class1.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var13);
									NetCache.NetCache_pendingWrites.put(var13, var13.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var13, var13.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						}
					}
				} catch (IOException var11) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-266990437"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		HealthBar.js5SocketTask = null;
		class1.js5Socket = null;
		js5ConnectState = 0;
		if (ClientPreferences.currentPort == GameBuild.worldPort) {
			ClientPreferences.currentPort = AbstractWorldMapIcon.js5Port;
		} else {
			ClientPreferences.currentPort = GameBuild.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				HealthBarUpdate.updateGameState(1000);
			} else {
				field512 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			HealthBarUpdate.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				HealthBarUpdate.updateGameState(1000);
			} else {
				field512 = 3000;
			}
		}

	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1584365045"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (UserComparator9.secureRandom == null && (secureRandomFuture.isDone() || field546 > 250)) {
					UserComparator9.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (UserComparator9.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					class65.socketTask = null;
					hadNetworkError = false;
					field546 = 0;
					if (field519.method7084()) {
						try {
							this.method1474(field520);
							class135.method2672(20);
						} catch (Throwable var18) {
							class4.RunException_sendStackTrace((String)null, var18);
							Message.getLoginError(65);
							return;
						}
					} else {
						class135.method2672(1);
					}
				}
			}

			if (loginState == 20) {
				if (!this.field556.method306()) {
					return;
				}

				if (this.field556.method292()) {
					class4.RunException_sendStackTrace(this.field556.method291(), (Throwable)null);
					Message.getLoginError(65);
					return;
				}

				class21 var3 = this.field556.method294();
				if (var3.method317() != 200) {
					class4.RunException_sendStackTrace("Response code: " + var3.method317() + "Response body: " + var3.method316(), (Throwable)null);
					Message.getLoginError(65);
					return;
				}

				field546 = 0;
				this.field521 = var3.method316();
				class135.method2672(1);
			}

			if (loginState == 1) {
				if (class65.socketTask == null) {
					class65.socketTask = GameEngine.taskHandler.newSocketTask(class279.worldHost, ClientPreferences.currentPort);
				}

				if (class65.socketTask.status == 2) {
					throw new IOException();
				}

				if (class65.socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = UserComparator4.method2379((Socket)class65.socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)class65.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					class65.socketTask = null;
					class135.method2672(2);
				}
			}

			PacketBufferNode var20;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var20 = WorldMapScaleHandler.method3906();
				var20.packetBuffer.writeByte(LoginPacket.field2873.id);
				packetWriter.addNode(var20);
				packetWriter.flush();
				var2.offset = 0;
				class135.method2672(3);
			}

			int var4;
			boolean var11;
			if (loginState == 3) {
				if (UserComparator10.pcmPlayer0 != null) {
					UserComparator10.pcmPlayer0.method710();
				}

				if (FriendsChat.pcmPlayer1 != null) {
					FriendsChat.pcmPlayer1.method710();
				}

				var11 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var11 = false;
				}

				if (var11) {
					var4 = ((AbstractSocket)var1).readUnsignedByte();
					if (UserComparator10.pcmPlayer0 != null) {
						UserComparator10.pcmPlayer0.method710();
					}

					if (FriendsChat.pcmPlayer1 != null) {
						FriendsChat.pcmPlayer1.method710();
					}

					if (var4 != 0) {
						Message.getLoginError(var4);
						return;
					}

					var2.offset = 0;
					class135.method2672(4);
				}
			}

			int var27;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var27 = ((AbstractSocket)var1).available();
					if (var27 > 8 - var2.offset) {
						var27 = 8 - var2.offset;
					}

					if (var27 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var27);
						var2.offset += var27;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					HealthBarDefinition.field1681 = var2.readLong();
					class135.method2672(5);
				}
			}

			int var6;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var21 = new PacketBuffer(500);
				int[] var12 = new int[]{UserComparator9.secureRandom.nextInt(), UserComparator9.secureRandom.nextInt(), UserComparator9.secureRandom.nextInt(), UserComparator9.secureRandom.nextInt()};
				var21.offset = 0;
				var21.writeByte(1);
				var21.writeInt(var12[0]);
				var21.writeInt(var12[1]);
				var21.writeInt(var12[2]);
				var21.writeInt(var12[3]);
				var21.writeLong(HealthBarDefinition.field1681);
				if (gameState == 40) {
					var21.writeInt(TaskHandler.field1546[0]);
					var21.writeInt(TaskHandler.field1546[1]);
					var21.writeInt(TaskHandler.field1546[2]);
					var21.writeInt(TaskHandler.field1546[3]);
				} else {
					var21.writeByte(field518.rsOrdinal());
					switch(field518.field1360) {
					case 0:
						var21.offset += 4;
						break;
					case 1:
					case 3:
						var21.writeMedium(class274.field3274);
						++var21.offset;
						break;
					case 2:
						var21.writeInt((Integer)VarbitComposition.clientPreferences.parameters.get(GameBuild.method5072(Login.Login_username)));
					}

					if (field519.method7084()) {
						var21.writeByte(class403.field4323.rsOrdinal());
						var21.writeStringCp1252NullTerminated(this.field521);
					} else {
						var21.writeByte(class403.field4332.rsOrdinal());
						var21.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var21.encryptRsa(class67.field867, class67.field868);
				TaskHandler.field1546 = var12;
				PacketBufferNode var5 = WorldMapScaleHandler.method3906();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field2871.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2868.id);
				}

				var5.packetBuffer.writeShort(0);
				var6 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(199);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field487);
				var5.packetBuffer.writeBytes(var21.array, 0, var21.offset);
				int var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(InvDefinition.canvasWidth);
				var5.packetBuffer.writeShort(GameEngine.canvasHeight);
				ClientPreferences.method2195(var5.packetBuffer);
				var5.packetBuffer.writeStringCp1252NullTerminated(WorldMapIcon_0.field2104);
				var5.packetBuffer.writeInt(KeyHandler.field145);
				Buffer var8 = new Buffer(ParamComposition.platformInfo.size());
				ParamComposition.platformInfo.write(var8);
				var5.packetBuffer.writeBytes(var8.array, 0, var8.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.writeIntME(MouseRecorder.archive10.hash);
				var5.packetBuffer.method6860(WorldMapRectangle.archive0.hash);
				var5.packetBuffer.method6860(class260.archive3.hash);
				var5.packetBuffer.writeIntME(ReflectionCheck.archive4.hash);
				var5.packetBuffer.method6860(0);
				var5.packetBuffer.writeInt(World.archive8.hash);
				var5.packetBuffer.writeInt(ApproximateRouteStrategy.archive14.hash);
				var5.packetBuffer.writeInt(WorldMapSection0.archive15.hash);
				var5.packetBuffer.method6861(class276.archive6.hash);
				var5.packetBuffer.method6860(class115.archive2.hash);
				var5.packetBuffer.writeIntME(ObjectComposition.archive5.hash);
				var5.packetBuffer.method6861(class28.archive20.hash);
				var5.packetBuffer.method6861(class391.archive13.hash);
				var5.packetBuffer.method6861(MenuAction.archive1.hash);
				var5.packetBuffer.method6860(class318.archive11.hash);
				var5.packetBuffer.method6861(class120.archive17.hash);
				var5.packetBuffer.writeIntME(class135.archive7.hash);
				var5.packetBuffer.method6860(class120.archive18.hash);
				var5.packetBuffer.method6860(VarcInt.archive9.hash);
				var5.packetBuffer.method6860(Interpreter.archive19.hash);
				var5.packetBuffer.writeInt(SecureRandomCallable.archive12.hash);
				var5.packetBuffer.xteaEncrypt(var12, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var12);
				int[] var9 = new int[4];

				for (int var10 = 0; var10 < 4; ++var10) {
					var9[var10] = var12[var10] + 50;
				}

				var2.newIsaacCipher(var9);
				class135.method2672(6);
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var27 = ((AbstractSocket)var1).readUnsignedByte();
				if (var27 == 21 && gameState == 20) {
					class135.method2672(12);
				} else if (var27 == 2) {
					class135.method2672(14);
				} else if (var27 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class135.method2672(19);
				} else if (var27 == 64) {
					class135.method2672(10);
				} else if (var27 == 23 && field516 < 1) {
					++field516;
					class135.method2672(0);
				} else if (var27 == 29) {
					class135.method2672(17);
				} else {
					if (var27 != 69) {
						Message.getLoginError(var27);
						return;
					}

					class135.method2672(7);
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class128.field1477 = var2.readUnsignedShort();
				class135.method2672(8);
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class128.field1477) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class128.field1477);
				class6 var22 = Tile.method4042()[var2.readUnsignedByte()];

				try {
					switch(var22.field12) {
					case 0:
						class0 var28 = new class0();
						this.field527 = new class7(var2, var28);
						class135.method2672(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var17) {
					Message.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field527.method53()) {
				this.field526 = this.field527.method61();
				this.field527.method54();
				this.field527 = null;
				if (this.field526 == null) {
					Message.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var20 = WorldMapScaleHandler.method3906();
				var20.packetBuffer.writeByte(LoginPacket.field2870.id);
				var20.packetBuffer.writeShort(this.field526.offset);
				var20.packetBuffer.method6809(this.field526);
				packetWriter.addNode(var20);
				packetWriter.flush();
				this.field526 = null;
				class135.method2672(6);
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				WorldMapLabelSize.field2012 = ((AbstractSocket)var1).readUnsignedByte();
				class135.method2672(11);
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= WorldMapLabelSize.field2012) {
				((AbstractSocket)var1).read(var2.array, 0, WorldMapLabelSize.field2012);
				var2.offset = 0;
				class135.method2672(6);
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field517 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				class135.method2672(13);
			}

			if (loginState == 13) {
				field546 = 0;
				PlatformInfo.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field517 / 60 + " seconds.");
				if (--field517 <= 0) {
					class135.method2672(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					ModeWhere.field3814 = ((AbstractSocket)var1).readUnsignedByte();
					class135.method2672(15);
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= ModeWhere.field3814) {
					var11 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var23 = false;
					if (var11) {
						var4 = var2.readByteIsaac() << 24;
						var4 |= var2.readByteIsaac() << 16;
						var4 |= var2.readByteIsaac() << 8;
						var4 |= var2.readByteIsaac();
						int var13 = GameBuild.method5072(Login.Login_username);
						if (VarbitComposition.clientPreferences.parameters.size() >= 10 && !VarbitComposition.clientPreferences.parameters.containsKey(var13)) {
							Iterator var14 = VarbitComposition.clientPreferences.parameters.entrySet().iterator();
							var14.next();
							var14.remove();
						}

						VarbitComposition.clientPreferences.parameters.put(var13, var4);
					}

					if (Login_isUsernameRemembered) {
						VarbitComposition.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						VarbitComposition.clientPreferences.rememberedUsername = null;
					}

					DevicePcmPlayerProvider.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field608 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var25 = WorldMapIcon_1.ServerPacket_values();
					var6 = var2.readSmartByteShortIsaac();
					if (var6 < 0 || var6 >= var25.length) {
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var25[var6];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class27.method398(ArchiveDiskActionHandler.client, "zap");
					} catch (Throwable var16) {
					}

					class135.method2672(16);
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5824();
						MouseHandler.method607();
						class319.updatePlayer(var2);
						class325.field3891 = -1;
						class274.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						ObjectSound.field811 = var2.readUnsignedShort();
						class135.method2672(18);
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= ObjectSound.field811) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, ObjectSound.field811);
						var2.offset = 0;
						String var24 = var2.readStringCp1252NullTerminated();
						String var29 = var2.readStringCp1252NullTerminated();
						String var26 = var2.readStringCp1252NullTerminated();
						PlatformInfo.setLoginResponseString(var24, var29, var26);
						HealthBarUpdate.updateGameState(10);
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
							var27 = packetWriter.serverPacketLength;
							timer.method5826();
							DynamicObject.method1956();
							class319.updatePlayer(var2);
							if (var27 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field546;
						if (field546 > 2000) {
							if (field516 < 1) {
								if (ClientPreferences.currentPort == GameBuild.worldPort) {
									ClientPreferences.currentPort = AbstractWorldMapIcon.js5Port;
								} else {
									ClientPreferences.currentPort = GameBuild.worldPort;
								}

								++field516;
								class135.method2672(0);
							} else {
								Message.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var19) {
			if (field516 < 1) {
				if (ClientPreferences.currentPort == GameBuild.worldPort) {
					ClientPreferences.currentPort = AbstractWorldMapIcon.js5Port;
				} else {
					ClientPreferences.currentPort = GameBuild.worldPort;
				}

				++field516;
				class135.method2672(0);
			} else {
				Message.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1813315889"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			class245.method4590();
		} else {
			if (!isMenuOpen) {
				Canvas.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1228(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class54.reflectionChecks.last();
					boolean var31;
					if (var2 == null) {
						var31 = false;
					} else {
						var31 = true;
					}

					int var3;
					PacketBufferNode var32;
					if (!var31) {
						PacketBufferNode var14;
						int var15;
						if (timer.field3889) {
							var14 = FriendSystem.getPacketBufferNode(ClientPacket.field2669, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.method6812(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method5825();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						PacketBuffer var10000;
						synchronized(class184.mouseRecorder.lock) {
							if (!field659) {
								class184.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class184.mouseRecorder.index >= 40) {
								var32 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class184.mouseRecorder.index && (var32 == null || var32.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class184.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = class184.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field494 || var8 != field675) {
										if (var32 == null) {
											var32 = FriendSystem.getPacketBufferNode(ClientPacket.field2726, packetWriter.isaacCipher);
											var32.packetBuffer.writeByte(0);
											var3 = var32.packetBuffer.offset;
											var10000 = var32.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										int var12;
										if (field496 != -1L) {
											var10 = var9 - field494;
											var11 = var8 - field675;
											var12 = (int)((class184.mouseRecorder.millis[var7] - field496) / 20L);
											var5 = (int)((long)var5 + (class184.mouseRecorder.millis[var7] - field496) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field494 = var9;
										field675 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var32.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var32.packetBuffer.writeByte(var12 + 128);
											var32.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var32.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var32.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var32.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var32.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var32.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var32.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field496 = class184.mouseRecorder.millis[var7];
									}
								}

								if (var32 != null) {
									var32.packetBuffer.method6812(var32.packetBuffer.offset - var3);
									var7 = var32.packetBuffer.offset;
									var32.packetBuffer.offset = var3;
									var32.packetBuffer.writeByte(var5 / var6);
									var32.packetBuffer.writeByte(var5 % var6);
									var32.packetBuffer.offset = var7;
									packetWriter.addNode(var32);
								}

								if (var4 >= class184.mouseRecorder.index) {
									class184.mouseRecorder.index = 0;
								} else {
									MouseRecorder var46 = class184.mouseRecorder;
									var46.index -= var4;
									System.arraycopy(class184.mouseRecorder.xs, var4, class184.mouseRecorder.xs, 0, class184.mouseRecorder.index);
									System.arraycopy(class184.mouseRecorder.ys, var4, class184.mouseRecorder.ys, 0, class184.mouseRecorder.index);
									System.arraycopy(class184.mouseRecorder.millis, var4, class184.mouseRecorder.millis, 0, class184.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !Script.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > GameEngine.canvasHeight) {
								var3 = GameEngine.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > InvDefinition.canvasWidth) {
								var4 = InvDefinition.canvasWidth;
							}

							var5 = (int)var16;
							var18 = FriendSystem.getPacketBufferNode(ClientPacket.field2742, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field114 > 0) {
							var14 = FriendSystem.getPacketBufferNode(ClientPacket.field2730, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = Occluder.method4335();

							for (var5 = 0; var5 < KeyHandler.field114; ++var5) {
								long var21 = var19 - field716;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field716 = var19;
								var14.packetBuffer.method6858((int)var21);
								var14.packetBuffer.writeByte(KeyHandler.field131[var5]);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field572 > 0) {
							--field572;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field573 = true;
						}

						if (field573 && field572 <= 0) {
							field572 = 20;
							field573 = false;
							var14 = FriendSystem.getPacketBufferNode(ClientPacket.field2647, packetWriter.isaacCipher);
							var14.packetBuffer.method6851(camAngleX);
							var14.packetBuffer.method6951(camAngleY);
							packetWriter.addNode(var14);
						}

						if (Archive.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = FriendSystem.getPacketBufferNode(ClientPacket.field2701, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!Archive.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = FriendSystem.getPacketBufferNode(ClientPacket.field2701, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (class65.worldMap != null) {
							class65.worldMap.method6351();
						}

						if (PlatformInfo.ClanChat_inClanChat) {
							if (class78.friendsChat != null) {
								class78.friendsChat.sort();
							}

							class11.method115();
							PlatformInfo.ClanChat_inClanChat = false;
						}

						Decimator.method1038();
						if (field719 != class391.Client_plane) {
							field719 = class391.Client_plane;
							var1 = class391.Client_plane;
							int[] var33 = class113.sceneMinimapSprite.pixels;
							var3 = var33.length;

							for (var4 = 0; var4 < var3; ++var4) {
								var33[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) {
								var5 = (103 - var4) * 2048 + 24628;

								for (var6 = 1; var6 < 103; ++var6) {
									if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
										CollisionMap.scene.drawTileMinimap(var33, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
										CollisionMap.scene.drawTileMinimap(var33, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4;
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							class113.sceneMinimapSprite.setRaster();

							for (var6 = 1; var6 < 103; ++var6) {
								for (var7 = 1; var7 < 103; ++var7) {
									if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
										class327.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) {
										class327.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var23 = CollisionMap.scene.getFloorDecorationTag(class391.Client_plane, var6, var7);
									if (var23 != 0L) {
										var10 = HealthBarDefinition.Entity_unpackID(var23);
										var11 = HitSplatDefinition.getObjectDefinition(var10).mapIconId;
										if (var11 >= 0 && class54.WorldMapElement_get(var11).field1629) {
											mapIcons[mapIconCount] = class54.WorldMapElement_get(var11).getSpriteBool(false);
											mapIconXs[mapIconCount] = var6;
											mapIconYs[mapIconCount] = var7;
											++mapIconCount;
										}
									}
								}
							}

							class11.rasterProvider.apply();
						}

						if (gameState != 30) {
							return;
						}

						class6.method44();

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= -10) {
								SoundEffect var34 = soundEffects[var1];
								if (var34 == null) {
									var10000 = null;
									var34 = SoundEffect.readSoundEffect(ReflectionCheck.archive4, soundEffectIds[var1], 0);
									if (var34 == null) {
										continue;
									}

									int[] var47 = queuedSoundEffectDelays;
									var47[var1] += var34.calculateDelay();
									soundEffects[var1] = var34;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = soundLocations[var1] >> 16 & 255;
										var6 = var5 * 128 + 64 - class129.localPlayer.x;
										if (var6 < 0) {
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255;
										var8 = var7 * 128 + 64 - class129.localPlayer.y;
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

										var3 = (var4 - var9) * VarbitComposition.clientPreferences.areaSoundEffectsVolume / var4;
									} else {
										var3 = VarbitComposition.clientPreferences.soundEffectsVolume;
									}

									if (var3 > 0) {
										RawSound var25 = var34.toRawSound().resample(Language.decimator);
										RawPcmStream var26 = RawPcmStream.createRawPcmStream(var25, 100, var3);
										var26.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										MusicPatchPcmStream.pcmStreamMixer.addSubStream(var26);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var15 = var1; var15 < soundEffectCount; ++var15) {
									soundEffectIds[var15] = soundEffectIds[var15 + 1];
									soundEffects[var15] = soundEffects[var15 + 1];
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
									soundLocations[var15] = soundLocations[var15 + 1];
								}

								--var1;
							}
						}

						if (field728 && !FriendSystem.method1727()) {
							if (VarbitComposition.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) {
								Decimator.method1051(class276.archive6, currentTrackGroupId, 0, VarbitComposition.clientPreferences.musicVolume, false);
							}

							field728 = false;
						}

						++packetWriter.field1279;
						if (packetWriter.field1279 > 750) {
							class245.method4590();
							return;
						}

						class361.method6283();

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var27 = npcs[var15];
							if (var27 != null) {
								SceneTilePaint.updateActorSequence(var27, var27.definition.size);
							}
						}

						ItemComposition.method3211();
						++field764;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (FriendsChat.field3934 != null) {
							++field727;
							if (field727 >= 15) {
								Actor.invalidateWidget(FriendsChat.field3934);
								FriendsChat.field3934 = null;
							}
						}

						Widget var38 = class301.mousedOverWidgetIf1;
						Widget var35 = BufferedFile.field4227;
						class301.mousedOverWidgetIf1 = null;
						BufferedFile.field4227 = null;
						draggedOnWidget = null;
						field669 = false;
						field666 = false;
						field713 = 0;

						while (KitDefinition.isKeyDown() && field713 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && SpriteMask.field2994 == 66) {
								String var41 = class10.method112();
								ArchiveDiskActionHandler.client.method443(var41);
							} else if (oculusOrbState != 1 || class78.field1010 <= 0) {
								field595[field713] = SpriteMask.field2994;
								field714[field713] = class78.field1010;
								++field713;
							}
						}

						if (Player.method2094() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var3 = class129.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != class129.localPlayer.plane) {
								var4 = class129.localPlayer.pathX[0] + FloorOverlayDefinition.baseX;
								var5 = class129.localPlayer.pathY[0] + class320.baseY;
								var18 = FriendSystem.getPacketBufferNode(ClientPacket.field2707, packetWriter.isaacCipher);
								var18.packetBuffer.writeShort(var5);
								var18.packetBuffer.method6861(0);
								var18.packetBuffer.method6841(var3);
								var18.packetBuffer.method6851(var4);
								packetWriter.addNode(var18);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class18.updateRootInterface(rootInterface, 0, 0, InvDefinition.canvasWidth, GameEngine.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var39;
							Widget var40;
							ScriptEvent var43;
							do {
								var43 = (ScriptEvent)field745.removeLast();
								if (var43 == null) {
									while (true) {
										do {
											var43 = (ScriptEvent)field693.removeLast();
											if (var43 == null) {
												while (true) {
													do {
														var43 = (ScriptEvent)scriptEvents.removeLast();
														if (var43 == null) {
															this.menu();
															if (class65.worldMap != null) {
																class65.worldMap.method6361(class391.Client_plane, (class129.localPlayer.x >> 7) + FloorOverlayDefinition.baseX, (class129.localPlayer.y >> 7) + class320.baseY, false);
																class65.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1159();
															}

															if (Decimator.dragInventoryWidget != null) {
																Actor.invalidateWidget(Decimator.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field668) {
																		if (GameBuild.hoveredItemContainer == Decimator.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) {
																			Widget var45 = Decimator.dragInventoryWidget;
																			byte var36 = 0;
																			if (field609 == 1 && var45.contentType == 206) {
																				var36 = 1;
																			}

																			if (var45.itemIds[dragItemSlotDestination] <= 0) {
																				var36 = 0;
																			}

																			var6 = Decimator.getWidgetFlags(var45);
																			boolean var37 = (var6 >> 29 & 1) != 0;
																			if (var37) {
																				var7 = dragItemSlotSource;
																				var8 = dragItemSlotDestination;
																				var45.itemIds[var8] = var45.itemIds[var7];
																				var45.itemQuantities[var8] = var45.itemQuantities[var7];
																				var45.itemIds[var7] = -1;
																				var45.itemQuantities[var7] = 0;
																			} else if (var36 == 1) {
																				var7 = dragItemSlotSource;
																				var8 = dragItemSlotDestination;

																				while (var7 != var8) {
																					if (var7 > var8) {
																						var45.swapItems(var7 - 1, var7);
																						--var7;
																					} else if (var7 < var8) {
																						var45.swapItems(var7 + 1, var7);
																						++var7;
																					}
																				}
																			} else {
																				var45.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			PacketBufferNode var28 = FriendSystem.getPacketBufferNode(ClientPacket.field2678, packetWriter.isaacCipher);
																			var28.packetBuffer.writeIntME(Decimator.dragInventoryWidget.id);
																			var28.packetBuffer.method6951(dragItemSlotSource);
																			var28.packetBuffer.method6819(var36);
																			var28.packetBuffer.method6851(dragItemSlotDestination);
																			packetWriter.addNode(var28);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var3 = draggedWidgetX;
																		var4 = draggedWidgetY;
																		MenuAction var42 = ArchiveDiskAction.tempMenuAction;
																		IgnoreList.menuAction(var42.param0, var42.param1, var42.opcode, var42.identifier, var42.action, var42.action, var3, var4);
																		ArchiveDiskAction.tempMenuAction = null;
																	}

																	field727 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	Decimator.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field668 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var3 = Scene.Scene_selectedX;
																var4 = Scene.Scene_selectedY;
																PacketBufferNode var44 = FriendSystem.getPacketBufferNode(ClientPacket.field2722, packetWriter.isaacCipher);
																var44.packetBuffer.writeByte(5);
																var44.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var44.packetBuffer.method6951(var3 + FloorOverlayDefinition.baseX);
																var44.packetBuffer.method6852(var4 + class320.baseY);
																packetWriter.addNode(var44);
																Scene.method4193();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var3;
																destinationY = var4;
															}

															if (var38 != class301.mousedOverWidgetIf1) {
																if (var38 != null) {
																	Actor.invalidateWidget(var38);
																}

																if (class301.mousedOverWidgetIf1 != null) {
																	Actor.invalidateWidget(class301.mousedOverWidgetIf1);
																}
															}

															if (var35 != BufferedFile.field4227 && field583 == field640) {
																if (var35 != null) {
																	Actor.invalidateWidget(var35);
																}

																if (BufferedFile.field4227 != null) {
																	Actor.invalidateWidget(BufferedFile.field4227);
																}
															}

															if (BufferedFile.field4227 != null) {
																if (field583 < field640) {
																	++field583;
																	if (field640 == field583) {
																		Actor.invalidateWidget(BufferedFile.field4227);
																	}
																}
															} else if (field583 > 0) {
																--field583;
															}

															class275.method5067();
															if (isCameraLocked) {
																class17.method231();
															}

															for (var3 = 0; var3 < 5; ++var3) {
																var10002 = field740[var3]++;
															}

															GrandExchangeEvent.varcs.tryWrite();
															var3 = SoundSystem.method780();
															var4 = KeyHandler.KeyHandler_idleCycles;
															if (var3 > 15000 && var4 > 15000) {
																logoutTimer = 250;
																MenuAction.method1875(14500);
																var18 = FriendSystem.getPacketBufferNode(ClientPacket.field2696, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															class20.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var18 = FriendSystem.getPacketBufferNode(ClientPacket.field2704, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															try {
																packetWriter.flush();
															} catch (IOException var29) {
																class245.method4590();
															}

															return;
														}

														var39 = var43.widget;
														if (var39.childIndex < 0) {
															break;
														}

														var40 = class87.getWidget(var39.parentId);
													} while(var40 == null || var40.children == null || var39.childIndex >= var40.children.length || var39 != var40.children[var39.childIndex]);

													class139.runScriptEvent(var43);
												}
											}

											var39 = var43.widget;
											if (var39.childIndex < 0) {
												break;
											}

											var40 = class87.getWidget(var39.parentId);
										} while(var40 == null || var40.children == null || var39.childIndex >= var40.children.length || var39 != var40.children[var39.childIndex]);

										class139.runScriptEvent(var43);
									}
								}

								var39 = var43.widget;
								if (var39.childIndex < 0) {
									break;
								}

								var40 = class87.getWidget(var39.parentId);
							} while(var40 == null || var40.children == null || var39.childIndex >= var40.children.length || var39 != var40.children[var39.childIndex]);

							class139.runScriptEvent(var43);
						}
					}

					var32 = FriendSystem.getPacketBufferNode(ClientPacket.field2737, packetWriter.isaacCipher);
					var32.packetBuffer.writeByte(0);
					var3 = var32.packetBuffer.offset;
					class139.performReflectionCheck(var32.packetBuffer);
					var32.packetBuffer.method6812(var32.packetBuffer.offset - var3);
					packetWriter.addNode(var32);
				}
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = InvDefinition.canvasWidth;
		int var2 = GameEngine.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (VarbitComposition.clientPreferences != null) {
			try {
				Client var3 = ArchiveDiskActionHandler.client;
				Object[] var4 = new Object[]{class12.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1201756774"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (class317.loadInterface(var1)) {
				class113.drawModelComponents(class139.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field697[var1]) {
				field766[var1] = true;
			}

			field687[var1] = field697[var1];
			field697[var1] = false;
		}

		field696 = cycle;
		viewportX = -1;
		viewportY = -1;
		GameBuild.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class28.drawWidgets(rootInterface, 0, 0, InvDefinition.canvasWidth, GameEngine.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class13.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class13.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = class28.method410();
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
						var4 = var4 + class54.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class11.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			class394.method6737();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field687[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field766[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class391.Client_plane;
		var2 = class129.localPlayer.x;
		var3 = class129.localPlayer.y;
		int var12 = field764;

		for (ObjectSound var14 = (ObjectSound)ObjectSound.objectSounds.last(); var14 != null; var14 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var14.soundEffectId != -1 || var14.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var14.field806) {
					var6 += var2 - var14.field806;
				} else if (var2 < var14.x) {
					var6 += var14.x - var2;
				}

				if (var3 > var14.field801) {
					var6 += var3 - var14.field801;
				} else if (var3 < var14.y) {
					var6 += var14.y - var3;
				}

				if (var6 - 64 <= var14.field804 && VarbitComposition.clientPreferences.areaSoundEffectsVolume != 0 && var1 == var14.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = (var14.field804 - var6) * VarbitComposition.clientPreferences.areaSoundEffectsVolume / var14.field804;
					Object var10000;
					if (var14.stream1 == null) {
						if (var14.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var8 = SoundEffect.readSoundEffect(ReflectionCheck.archive4, var14.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(Language.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								MusicPatchPcmStream.pcmStreamMixer.addSubStream(var10);
								var14.stream1 = var10;
							}
						}
					} else {
						var14.stream1.method801(var7);
					}

					if (var14.stream2 == null) {
						if (var14.soundEffectIds != null && (var14.field808 -= var12) <= 0) {
							int var13 = (int)(Math.random() * (double)var14.soundEffectIds.length);
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(ReflectionCheck.archive4, var14.soundEffectIds[var13], 0);
							if (var15 != null) {
								RawSound var16 = var15.toRawSound().resample(Language.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var16, 100, var7);
								var11.setNumLoops(0);
								MusicPatchPcmStream.pcmStreamMixer.addSubStream(var11);
								var14.stream2 = var11;
								var14.field808 = var14.field805 + (int)(Math.random() * (double)(var14.field800 - var14.field805));
							}
						}
					} else {
						var14.stream2.method801(var7);
						if (!var14.stream2.hasNext()) {
							var14.stream2 = null;
						}
					}
				} else {
					if (var14.stream1 != null) {
						MusicPatchPcmStream.pcmStreamMixer.removeSubStream(var14.stream1);
						var14.stream1 = null;
					}

					if (var14.stream2 != null) {
						MusicPatchPcmStream.pcmStreamMixer.removeSubStream(var14.stream2);
						var14.stream2 = null;
					}
				}
			}
		}

		field764 = 0;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)Z",
		garbageValue = "-45338133"
	)
	final boolean method1228(PacketWriter var1) {
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
					if (var1.field1285) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1279 = 0;
						var1.field1285 = false;
					}

					var3.offset = 0;
					if (var3.method6763()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1279 = 0;
					}

					var1.field1285 = true;
					ServerPacket[] var4 = WorldMapIcon_1.ServerPacket_values();
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
				var1.field1279 = 0;
				timer.method5821();
				var1.field1290 = var1.field1289;
				var1.field1289 = var1.field1288;
				var1.field1288 = var1.serverPacket;
				if (ServerPacket.field2795 == var1.serverPacket) {
					class67.method1877();
					weight = var3.readShort();
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2810 == var1.serverPacket) {
					class134.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2791 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2751);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2802 == var1.serverPacket) {
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

				if (ServerPacket.field2788 == var1.serverPacket) {
					tradeChatMode = var3.method6844();
					publicChatMode = var3.method7007();
					var1.serverPacket = null;
					return true;
				}

				int var17;
				Widget var53;
				if (ServerPacket.field2780 == var1.serverPacket) {
					var17 = var3.method6953();
					var5 = var3.method6826();
					var6 = var3.method6853();
					if (var6 == 65535) {
						var6 = -1;
					}

					var53 = class87.getWidget(var17);
					ItemComposition var55;
					if (!var53.isIf3) {
						if (var6 == -1) {
							var53.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var55 = class65.ItemDefinition_get(var6);
						var53.modelType = 4;
						var53.modelId = var6;
						var53.modelAngleX = var55.xan2d;
						var53.modelAngleY = var55.yan2d;
						var53.modelZoom = var55.zoom2d * 100 / var5;
						Actor.invalidateWidget(var53);
					} else {
						var53.itemId = var6;
						var53.itemQuantity = var5;
						var55 = class65.ItemDefinition_get(var6);
						var53.modelAngleX = var55.xan2d;
						var53.modelAngleY = var55.yan2d;
						var53.modelAngleZ = var55.zan2d;
						var53.modelOffsetX = var55.offsetX2d;
						var53.modelOffsetY = var55.offsetY2d;
						var53.modelZoom = var55.zoom2d;
						if (var55.isStackable == 1) {
							var53.itemQuantityMode = 1;
						} else {
							var53.itemQuantityMode = 2;
						}

						if (var53.field3089 > 0) {
							var53.modelZoom = var53.modelZoom * 32 / var53.field3089;
						} else if (var53.rawWidth > 0) {
							var53.modelZoom = var53.modelZoom * 32 / var53.rawWidth;
						}

						Actor.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2831 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					rootInterface = var17;
					this.resizeRoot(false);
					class18.Widget_resetModelFrames(var17);
					UserComparator7.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field697[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				String var72;
				if (ServerPacket.field2835 == var1.serverPacket) {
					var17 = var3.readUShortSmart();
					boolean var60 = var3.readUnsignedByte() == 1;
					var72 = "";
					boolean var74 = false;
					if (var60) {
						var72 = var3.readStringCp1252NullTerminated();
						if (class20.friendSystem.isIgnored(new Username(var72, SoundCache.loginType))) {
							var74 = true;
						}
					}

					String var54 = var3.readStringCp1252NullTerminated();
					if (!var74) {
						SecureRandomCallable.addGameMessage(var17, var72, var54);
					}

					var1.serverPacket = null;
					return true;
				}

				int var15;
				String var25;
				byte var67;
				if (ServerPacket.field2856 == var1.serverPacket) {
					var67 = var3.readByte();
					var20 = var3.readStringCp1252NullTerminated();
					long var21 = (long)var3.readUnsignedShort();
					long var23 = (long)var3.readMedium();
					PlayerType var57 = (PlayerType)class260.findEnumerated(StructComposition.PlayerType_values(), var3.readUnsignedByte());
					long var11 = (var21 << 32) + var23;
					boolean var58 = false;
					ClanChannel var14 = null;
					var14 = var67 >= 0 ? currentClanChannels[var67] : WorldMapSectionType.guestClanChannel;
					if (var14 == null) {
						var58 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var57.isUser && class20.friendSystem.isIgnored(new Username(var20, SoundCache.loginType))) {
									var58 = true;
								}
								break;
							}

							if (var11 == crossWorldMessageIds[var15]) {
								var58 = true;
								break;
							}

							++var15;
						}
					}

					if (!var58) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var25 = AbstractFont.escapeBrackets(FloorDecoration.method4029(var3));
						int var16 = var67 >= 0 ? 41 : 44;
						if (var57.modIcon != -1) {
							FriendSystem.addChatMessage(var16, ApproximateRouteStrategy.method1122(var57.modIcon) + var20, var25, var14.name);
						} else {
							FriendSystem.addChatMessage(var16, var20, var25, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2837 == var1.serverPacket) {
					JagexCache.field1559 = var3.method6849();
					WorldMapEvent.field2216 = var3.method6849();
					var1.serverPacket = null;
					return true;
				}

				int var13;
				long var26;
				long var28;
				String var32;
				String var46;
				if (ServerPacket.field2790 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var26 = (long)var3.readUnsignedShort();
					var28 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)class260.findEnumerated(StructComposition.PlayerType_values(), var3.readUnsignedByte());
					long var30 = var28 + (var26 << 32);
					boolean var12 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (crossWorldMessageIds[var13] == var30) {
							var12 = true;
							break;
						}
					}

					if (class20.friendSystem.isIgnored(new Username(var46, SoundCache.loginType))) {
						var12 = true;
					}

					if (!var12 && field602 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var30;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = AbstractFont.escapeBrackets(class113.method2480(FloorDecoration.method4029(var3)));
						byte var77;
						if (var9.isPrivileged) {
							var77 = 7;
						} else {
							var77 = 3;
						}

						if (var9.modIcon != -1) {
							SecureRandomCallable.addGameMessage(var77, ApproximateRouteStrategy.method1122(var9.modIcon) + var46, var32);
						} else {
							SecureRandomCallable.addGameMessage(var77, var46, var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2806 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2749);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2833 == var1.serverPacket) {
					for (var17 = 0; var17 < players.length; ++var17) {
						if (players[var17] != null) {
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) {
						if (npcs[var17] != null) {
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				long var34;
				long var37;
				if (ServerPacket.field2840 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var26 = var3.readLong();
					var28 = (long)var3.readUnsignedShort();
					var34 = (long)var3.readMedium();
					PlayerType var78 = (PlayerType)class260.findEnumerated(StructComposition.PlayerType_values(), var3.readUnsignedByte());
					var37 = (var28 << 32) + var34;
					boolean var76 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var37) {
							var76 = true;
							break;
						}
					}

					if (var78.isUser && class20.friendSystem.isIgnored(new Username(var46, SoundCache.loginType))) {
						var76 = true;
					}

					if (!var76 && field602 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var37;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var25 = AbstractFont.escapeBrackets(class113.method2480(FloorDecoration.method4029(var3)));
						if (var78.modIcon != -1) {
							FriendSystem.addChatMessage(9, ApproximateRouteStrategy.method1122(var78.modIcon) + var46, var25, UserComparator8.base37DecodeLong(var26));
						} else {
							FriendSystem.addChatMessage(9, var46, var25, UserComparator8.base37DecodeLong(var26));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2809 == var1.serverPacket) {
					if (class117.field1388 == null) {
						class117.field1388 = new class352(class125.HitSplatDefinition_cachedSprites);
					}

					class407 var51 = class125.HitSplatDefinition_cachedSprites.method6250(var3);
					class117.field1388.field4023.vmethod6606(var51.field4339, var51.field4340);
					field680[++field715 - 1 & 31] = var51.field4339;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2861 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					Object[] var71 = new Object[var46.length() + 1];

					for (var6 = var46.length() - 1; var6 >= 0; --var6) {
						if (var46.charAt(var6) == 's') {
							var71[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var71[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var71[0] = new Integer(var3.readInt());
					ScriptEvent var75 = new ScriptEvent();
					var75.args = var71;
					class139.runScriptEvent(var75);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2821 == var1.serverPacket) {
					Frames.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2849 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2760);
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var7;
				if (ServerPacket.field2822 == var1.serverPacket) {
					var17 = var3.method6940();
					var5 = var3.readInt();
					var6 = var3.method6849();
					var7 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var7 != null) {
						WorldMapID.closeInterface(var7, var17 != var7.group);
					}

					VertexNormal.method4475(var5, var17, var6);
					var1.serverPacket = null;
					return true;
				}

				Widget var18;
				if (ServerPacket.field2832 == var1.serverPacket) {
					var17 = var3.readShort();
					var5 = var3.method6953();
					var18 = class87.getWidget(var5);
					if (var17 != var18.sequenceId || var17 == -1) {
						var18.sequenceId = var17;
						var18.modelFrame = 0;
						var18.modelFrameCycle = 0;
						Actor.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2796 == var1.serverPacket) {
					Actor.method2132(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2839 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class262.method4999(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2808 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.method6855();
					var6 = var3.readUnsignedShort();
					var53 = class87.getWidget(var17);
					var53.field3101 = var6 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2799 == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					HealthBarUpdate.updateGameState(45);
					var2.close();
					var2 = null;
					ScriptFrame.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				Widget var70;
				if (ServerPacket.field2864 == var1.serverPacket) {
					var17 = var3.method6826();
					var70 = class87.getWidget(var17);

					for (var6 = 0; var6 < var70.itemIds.length; ++var6) {
						var70.itemIds[var6] = -1;
						var70.itemIds[var6] = 0;
					}

					Actor.invalidateWidget(var70);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2798 == var1.serverPacket) {
					class67.method1877();
					runEnergy = var3.readUnsignedByte();
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2803 == var1.serverPacket) {
					var17 = var3.readShort();
					var5 = var3.method6857();
					var6 = var3.readInt();
					var53 = class87.getWidget(var6);
					if (var17 != var53.rawX || var5 != var53.rawY || var53.xAlignment != 0 || var53.yAlignment != 0) {
						var53.rawX = var17;
						var53.rawY = var5;
						var53.xAlignment = 0;
						var53.yAlignment = 0;
						Actor.invalidateWidget(var53);
						this.alignWidget(var53);
						if (var53.type == 0) {
							VerticalAlignment.revalidateWidgetScroll(class139.Widget_interfaceComponents[var6 >> 16], var53, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2781 == var1.serverPacket) {
					isCameraLocked = false;

					for (var17 = 0; var17 < 5; ++var17) {
						field736[var17] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				int var19;
				if (ServerPacket.field2851 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var19 = var3.readUnsignedByte();
					field736[var17] = true;
					field484[var17] = var5;
					field738[var17] = var6;
					field686[var17] = var19;
					field740[var17] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2858 == var1.serverPacket) {
					class117.field1388 = new class352(class125.HitSplatDefinition_cachedSprites);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2784 == var1.serverPacket) {
					class67.method1877();
					var17 = var3.method7007();
					var5 = var3.method6826();
					var6 = var3.method7007();
					experience[var6] = var5;
					currentLevels[var6] = var17;
					levels[var6] = 1;

					for (var19 = 0; var19 < 98; ++var19) {
						if (var5 >= Skills.Skills_experienceTable[var19]) {
							levels[var6] = var19 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2804 == var1.serverPacket) {
					Varcs.method2302();
					var67 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var67 >= 0) {
							currentClanSettings[var67] = null;
						} else {
							AttackOption.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var67 >= 0) {
						currentClanSettings[var67] = new ClanSettings(var3);
					} else {
						AttackOption.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2843 == var1.serverPacket) {
					var17 = var3.method6953();
					var5 = var3.method6940();
					var18 = class87.getWidget(var17);
					if (var18.modelType != 1 || var5 != var18.modelId) {
						var18.modelType = 1;
						var18.modelId = var5;
						Actor.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2828 == var1.serverPacket) {
					field672 = cycleCntr;
					var67 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var67 >= 0) {
							currentClanChannels[var67] = null;
						} else {
							WorldMapSectionType.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var67 >= 0) {
						currentClanChannels[var67] = new ClanChannel(var3);
					} else {
						WorldMapSectionType.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2852 == var1.serverPacket) {
					var17 = var3.method6940();
					if (var17 == 65535) {
						var17 = -1;
					}

					FriendSystem.playSong(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2817 == var1.serverPacket) {
					var17 = var3.method6859();
					var5 = var3.method6855();
					if (var5 == 65535) {
						var5 = -1;
					}

					class196.method3819(var5, var17);
					var1.serverPacket = null;
					return true;
				}

				int var39;
				int var40;
				if (ServerPacket.field2785 == var1.serverPacket) {
					var17 = var3.method6953();
					var5 = var3.method6940();
					var6 = var5 >> 10 & 31;
					var19 = var5 >> 5 & 31;
					var39 = var5 & 31;
					var40 = (var19 << 11) + (var6 << 19) + (var39 << 3);
					Widget var56 = class87.getWidget(var17);
					if (var40 != var56.color) {
						var56.color = var40;
						Actor.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2846 == var1.serverPacket) {
					var17 = var3.method6917();
					var70 = class87.getWidget(var17);
					var70.modelType = 3;
					var70.modelId = class129.localPlayer.appearance.getChatHeadId();
					Actor.invalidateWidget(var70);
					var1.serverPacket = null;
					return true;
				}

				Widget var8;
				if (ServerPacket.field2814 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var5);
					var7 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var7 != null) {
						WorldMapID.closeInterface(var7, var73 == null || var73.group != var7.group);
					}

					if (var73 != null) {
						var73.remove();
						interfaceParents.put(var73, (long)var17);
					}

					var8 = class87.getWidget(var5);
					if (var8 != null) {
						Actor.invalidateWidget(var8);
					}

					var8 = class87.getWidget(var17);
					if (var8 != null) {
						Actor.invalidateWidget(var8);
						VerticalAlignment.revalidateWidgetScroll(class139.Widget_interfaceComponents[var8.id >>> 16], var8, true);
					}

					if (rootInterface != -1) {
						class13.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2787 == var1.serverPacket) {
					JagexCache.field1559 = var3.readUnsignedByte();
					WorldMapEvent.field2216 = var3.method7007();

					while (var3.offset < var1.serverPacketLength) {
						var17 = var3.readUnsignedByte();
						class240 var69 = HealthBarDefinition.method2890()[var17];
						ScriptFrame.method1086(var69);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2801 == var1.serverPacket) {
					class274.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2857 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2755);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2779 == var1.serverPacket) {
					WorldMapEvent.field2216 = var3.method6844();
					JagexCache.field1559 = var3.method7007();

					for (var17 = JagexCache.field1559; var17 < JagexCache.field1559 + 8; ++var17) {
						for (var5 = WorldMapEvent.field2216; var5 < WorldMapEvent.field2216 + 8; ++var5) {
							if (groundItems[class391.Client_plane][var17][var5] != null) {
								groundItems[class391.Client_plane][var17][var5] = null;
								SoundSystem.updateItemPile(var17, var5);
							}
						}
					}

					for (PendingSpawn var49 = (PendingSpawn)pendingSpawns.last(); var49 != null; var49 = (PendingSpawn)pendingSpawns.previous()) {
						if (var49.x >= JagexCache.field1559 && var49.x < JagexCache.field1559 + 8 && var49.y >= WorldMapEvent.field2216 && var49.y < WorldMapEvent.field2216 + 8 && var49.plane == class391.Client_plane) {
							var49.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2794 == var1.serverPacket) {
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

				if (ServerPacket.field2827 == var1.serverPacket) {
					byte[] var48 = new byte[var1.serverPacketLength];
					var3.method6767(var48, 0, var48.length);
					Buffer var68 = new Buffer(var48);
					var72 = var68.readStringCp1252NullTerminated();
					Interpreter.openURL(var72, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2862 == var1.serverPacket) {
					class117.field1388 = null;
					var1.serverPacket = null;
					return true;
				}

				int var41;
				if (ServerPacket.field2819 == var1.serverPacket) {
					isCameraLocked = true;
					class114.field1376 = var3.readUnsignedByte();
					class229.field2624 = var3.readUnsignedByte();
					class28.field170 = var3.readUnsignedShort();
					IgnoreList.field3918 = var3.readUnsignedByte();
					Projectile.field923 = var3.readUnsignedByte();
					if (Projectile.field923 >= 100) {
						var17 = class114.field1376 * 128 + 64;
						var5 = class229.field2624 * 128 + 64;
						var6 = GraphicsObject.getTileHeight(var17, var5, class391.Client_plane) - class28.field170;
						var19 = var17 - WorldMapSection2.cameraX;
						var39 = var6 - SpotAnimationDefinition.cameraY;
						var40 = var5 - DevicePcmPlayerProvider.cameraZ;
						var41 = (int)Math.sqrt((double)(var40 * var40 + var19 * var19));
						ApproximateRouteStrategy.cameraPitch = (int)(Math.atan2((double)var39, (double)var41) * 325.949D) & 2047;
						Fonts.cameraYaw = (int)(Math.atan2((double)var19, (double)var40) * -325.949D) & 2047;
						if (ApproximateRouteStrategy.cameraPitch < 128) {
							ApproximateRouteStrategy.cameraPitch = 128;
						}

						if (ApproximateRouteStrategy.cameraPitch > 383) {
							ApproximateRouteStrategy.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2786 == var1.serverPacket) {
					class20.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field683 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2782 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var18 = class87.getWidget(var17);
					} else {
						var18 = null;
					}

					if (var18 != null) {
						for (var19 = 0; var19 < var18.itemIds.length; ++var19) {
							var18.itemIds[var19] = 0;
							var18.itemQuantities[var19] = 0;
						}
					}

					UserComparator4.clearItemContainer(var5);
					var19 = var3.readUnsignedShort();

					for (var39 = 0; var39 < var19; ++var39) {
						var40 = var3.method6849();
						if (var40 == 255) {
							var40 = var3.method6917();
						}

						var41 = var3.method6940();
						if (var18 != null && var39 < var18.itemIds.length) {
							var18.itemIds[var39] = var41;
							var18.itemQuantities[var39] = var40;
						}

						Script.itemContainerSetItem(var5, var39, var41 - 1, var40);
					}

					if (var18 != null) {
						Actor.invalidateWidget(var18);
					}

					class67.method1877();
					changedItemContainers[++field677 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2815 == var1.serverPacket) {
					isCameraLocked = true;
					class114.field1372 = var3.readUnsignedByte();
					ScriptFrame.field447 = var3.readUnsignedByte();
					KeyHandler.field123 = var3.readUnsignedShort();
					class176.field2001 = var3.readUnsignedByte();
					class112.field1361 = var3.readUnsignedByte();
					if (class112.field1361 >= 100) {
						WorldMapSection2.cameraX = class114.field1372 * 128 + 64;
						DevicePcmPlayerProvider.cameraZ = ScriptFrame.field447 * 128 + 64;
						SpotAnimationDefinition.cameraY = GraphicsObject.getTileHeight(WorldMapSection2.cameraX, DevicePcmPlayerProvider.cameraZ, class391.Client_plane) - KeyHandler.field123;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2834 == var1.serverPacket) {
					field672 = cycleCntr;
					var67 = var3.readByte();
					class133 var66 = new class133(var3);
					ClanChannel var64;
					if (var67 >= 0) {
						var64 = currentClanChannels[var67];
					} else {
						var64 = WorldMapSectionType.guestClanChannel;
					}

					var66.method2655(var64);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2771 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					if (var6 >= 1 && var6 <= 8) {
						if (var46.equalsIgnoreCase("null")) {
							var46 = null;
						}

						playerMenuActions[var6 - 1] = var46;
						playerOptionsPriorities[var6 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2844 == var1.serverPacket) {
					var17 = var3.readInt();
					if (var17 != field570) {
						field570 = var17;
						Login.method1915();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2847 == var1.serverPacket) {
					var17 = var3.readInt();
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var65 != null) {
						WorldMapID.closeInterface(var65, true);
					}

					if (meslayerContinueWidget != null) {
						Actor.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2823 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var17] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false);
					}

					field703 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2859 == var1.serverPacket) {
					for (var17 = 0; var17 < VarpDefinition.VarpDefinition_fileCount; ++var17) {
						VarpDefinition var63 = UserComparator7.VarpDefinition_get(var17);
						if (var63 != null) {
							Varps.Varps_temp[var17] = 0;
							Varps.Varps_main[var17] = 0;
						}
					}

					class67.method1877();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2845 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				boolean var59;
				if (ServerPacket.field2777 == var1.serverPacket) {
					var59 = var3.method6849() == 1;
					var5 = var3.readInt();
					var18 = class87.getWidget(var5);
					if (var59 != var18.isHidden) {
						var18.isHidden = var59;
						Actor.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2816 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						class78.friendsChat = null;
					} else {
						if (class78.friendsChat == null) {
							class78.friendsChat = new FriendsChat(SoundCache.loginType, ArchiveDiskActionHandler.client);
						}

						class78.friendsChat.readUpdate(var3);
					}

					class116.method2497();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2853 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					class54.method1078(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2774 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					var6 = class260.getGcDuration();
					PacketBufferNode var52 = FriendSystem.getPacketBufferNode(ClientPacket.field2716, packetWriter.isaacCipher);
					var52.packetBuffer.method6841(GameEngine.fps);
					var52.packetBuffer.method6841(var6);
					var52.packetBuffer.method6860(var17);
					var52.packetBuffer.method6861(var5);
					packetWriter.addNode(var52);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2789 == var1.serverPacket) {
					rebootTimer = var3.method6855() * 30;
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2807 == var1.serverPacket) {
					var67 = var3.readByte();
					var26 = (long)var3.readUnsignedShort();
					var28 = (long)var3.readMedium();
					var34 = var28 + (var26 << 32);
					boolean var79 = false;
					ClanChannel var43 = var67 >= 0 ? currentClanChannels[var67] : WorldMapSectionType.guestClanChannel;
					if (var43 == null) {
						var79 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var34) {
								var79 = true;
								break;
							}
						}
					}

					if (!var79) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = FloorDecoration.method4029(var3);
						int var33 = var67 >= 0 ? 43 : 46;
						FriendSystem.addChatMessage(var33, "", var32, var43.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2836 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2750);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2829 == var1.serverPacket) {
					Varcs.method2302();
					var67 = var3.readByte();
					class119 var62 = new class119(var3);
					ClanSettings var61;
					if (var67 >= 0) {
						var61 = currentClanSettings[var67];
					} else {
						var61 = AttackOption.guestClanSettings;
					}

					var62.method2509(var61);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2783 == var1.serverPacket) {
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) {
						if (Varps.Varps_temp[var17] != Varps.Varps_main[var17]) {
							Varps.Varps_main[var17] = Varps.Varps_temp[var17];
							InvDefinition.changeGameOptions(var17);
							changedVarps[++changedVarpCount - 1 & 31] = var17;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2830 == var1.serverPacket) {
					class16.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2850 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					PcmPlayer.queueSoundEffect(var17, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2824 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2757);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2811 == var1.serverPacket) {
					if (rootInterface != -1) {
						class13.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2838 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var18 = class87.getWidget(var17);
					} else {
						var18 = null;
					}

					for (; var3.offset < var1.serverPacketLength; Script.itemContainerSetItem(var5, var19, var39 - 1, var40)) {
						var19 = var3.readUShortSmart();
						var39 = var3.readUnsignedShort();
						var40 = 0;
						if (var39 != 0) {
							var40 = var3.readUnsignedByte();
							if (var40 == 255) {
								var40 = var3.readInt();
							}
						}

						if (var18 != null && var19 >= 0 && var19 < var18.itemIds.length) {
							var18.itemIds[var19] = var39;
							var18.itemQuantities[var19] = var40;
						}
					}

					if (var18 != null) {
						Actor.invalidateWidget(var18);
					}

					class67.method1877();
					changedItemContainers[++field677 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2820 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2758);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2855 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2752);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2792 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var18 = class87.getWidget(var5);
					if (!var46.equals(var18.text)) {
						var18.text = var46;
						Actor.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2797 == var1.serverPacket) {
					class20.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					WorldMapCacheName.FriendSystem_invalidateIgnoreds();
					field683 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2854 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.method6855();
					var18 = class87.getWidget(var17);
					if (var18.modelType != 2 || var5 != var18.modelId) {
						var18.modelType = 2;
						var18.modelId = var5;
						Actor.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2775 == var1.serverPacket) {
					NetSocket.updatePlayers(var3, var1.serverPacketLength);
					method1611();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2848 == var1.serverPacket) {
					class274.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2772 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2756);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2841 == var1.serverPacket) {
					var17 = var3.method6826();
					var5 = var3.method6940();
					var18 = class87.getWidget(var17);
					if (var18 != null && var18.type == 0) {
						if (var5 > var18.scrollHeight - var18.height) {
							var5 = var18.scrollHeight - var18.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var18.scrollY) {
							var18.scrollY = var5;
							Actor.invalidateWidget(var18);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2805 == var1.serverPacket) {
					var17 = var3.method6853();
					var5 = var3.method6940();
					var6 = var3.method6917();
					var19 = var3.method6853();
					var8 = class87.getWidget(var6);
					if (var17 != var8.modelAngleX || var5 != var8.modelAngleY || var19 != var8.modelZoom) {
						var8.modelAngleX = var17;
						var8.modelAngleY = var5;
						var8.modelZoom = var19;
						Actor.invalidateWidget(var8);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2812 == var1.serverPacket) {
					class134.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2826 == var1.serverPacket) {
					if (class78.friendsChat != null) {
						class78.friendsChat.method5877(var3);
					}

					class116.method2497();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2818 == var1.serverPacket) {
					var17 = var3.method6855();
					JagexCache.method2744(var17);
					changedItemContainers[++field677 - 1 & 31] = var17 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2769 == var1.serverPacket) {
					class20.friendSystem.method1664();
					field683 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2860 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.method6917();
					var6 = var3.method6853();
					if (var6 == 65535) {
						var6 = -1;
					}

					var19 = var3.method6855();
					if (var19 == 65535) {
						var19 = -1;
					}

					for (var39 = var19; var39 <= var6; ++var39) {
						var34 = ((long)var17 << 32) + (long)var39;
						Node var36 = widgetFlags.get(var34);
						if (var36 != null) {
							var36.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var34);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2793 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					class247.forceDisconnect(var17);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2778 == var1.serverPacket) {
					var59 = var3.readUnsignedByte() == 1;
					if (var59) {
						MenuAction.field861 = Occluder.method4335() - var3.readLong();
						class117.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class117.grandExchangeEvents = null;
					}

					field688 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2825 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var20 = AbstractFont.escapeBrackets(class113.method2480(FloorDecoration.method4029(var3)));
					SecureRandomCallable.addGameMessage(6, var46, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2863 == var1.serverPacket) {
					var17 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class18.Widget_resetModelFrames(rootInterface);
						UserComparator7.runWidgetOnLoadListener(rootInterface);

						for (var19 = 0; var19 < 100; ++var19) {
							field697[var19] = true;
						}
					}

					InterfaceParent var10;
					for (; var6-- > 0; var10.field1020 = true) {
						var19 = var3.readInt();
						var39 = var3.readUnsignedShort();
						var40 = var3.readUnsignedByte();
						var10 = (InterfaceParent)interfaceParents.get((long)var19);
						if (var10 != null && var39 != var10.group) {
							WorldMapID.closeInterface(var10, true);
							var10 = null;
						}

						if (var10 == null) {
							var10 = VertexNormal.method4475(var19, var39, var40);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) {
						if (var7.field1020) {
							var7.field1020 = false;
						} else {
							WorldMapID.closeInterface(var7, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var17) {
						var19 = var3.readInt();
						var39 = var3.readUnsignedShort();
						var40 = var3.readUnsignedShort();
						var41 = var3.readInt();

						for (int var42 = var39; var42 <= var40; ++var42) {
							var37 = (long)var42 + ((long)var19 << 32);
							widgetFlags.put(new IntegerNode(var41), var37);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2770 == var1.serverPacket) {
					class18.privateChatMode = FloorUnderlayDefinition.method3025(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2842 == var1.serverPacket) {
					var59 = var3.readBoolean();
					if (var59) {
						if (class16.field82 == null) {
							class16.field82 = new class300();
						}
					} else {
						class16.field82 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2773 == var1.serverPacket) {
					ScriptFrame.method1086(class240.field2753);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2813 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					byte var47 = var3.method6848();
					Varps.Varps_temp[var17] = var47;
					if (Varps.Varps_main[var17] != var47) {
						Varps.Varps_main[var17] = var47;
					}

					InvDefinition.changeGameOptions(var17);
					changedVarps[++changedVarpCount - 1 & 31] = var17;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2800 == var1.serverPacket) {
					var17 = var3.method6855();
					var5 = var3.method6917();
					Varps.Varps_temp[var17] = var5;
					if (Varps.Varps_main[var17] != var5) {
						Varps.Varps_main[var17] = var5;
					}

					InvDefinition.changeGameOptions(var17);
					changedVarps[++changedVarpCount - 1 & 31] = var17;
					var1.serverPacket = null;
					return true;
				}

				class4.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -1102397675 * 2060228669 : -1) + "," + (var1.field1289 != null ? var1.field1289.id * -1102397675 * 2060228669 : -1) + "," + (var1.field1290 != null ? var1.field1290.id * -1102397675 * 2060228669 : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class16.logOut();
			} catch (IOException var44) {
				class245.method4590();
			} catch (Exception var45) {
				var20 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -1102397675 * 2060228669 : -1) + "," + (var1.field1289 != null ? var1.field1289.id * -1102397675 * 2060228669 : -1) + "," + (var1.field1290 != null ? var1.field1290.id * -1102397675 * 2060228669 : -1) + "," + var1.serverPacketLength + "," + (class129.localPlayer.pathX[0] + FloorOverlayDefinition.baseX) + "," + (class129.localPlayer.pathY[0] + class320.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var20 = var20 + var3.array[var6] + ",";
				}

				class4.RunException_sendStackTrace(var20, var45);
				class16.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
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
					String var19 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var19;
					String var20 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var20;
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
					boolean var14 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var14;
					var1 = false;
				}
			}
		}

		if (Decimator.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var21 = MouseHandler.MouseHandler_lastButton;
				int var3;
				int var4;
				int var8;
				int var22;
				int var23;
				if (isMenuOpen) {
					if (var21 != 1 && (Script.mouseCam || var21 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var3 = MouseHandler.MouseHandler_y;
						if (var2 < WorldMapRegion.menuX - 10 || var2 > VarcInt.menuWidth + WorldMapRegion.menuX + 10 || var3 < ApproximateRouteStrategy.menuY - 10 || var3 > WorldMapLabelSize.menuHeight + ApproximateRouteStrategy.menuY + 10) {
							isMenuOpen = false;
							var4 = WorldMapRegion.menuX;
							var5 = ApproximateRouteStrategy.menuY;
							var23 = VarcInt.menuWidth;
							var22 = WorldMapLabelSize.menuHeight;

							for (var8 = 0; var8 < rootWidgetCount; ++var8) {
								if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var23 + var4 && rootWidgetYs[var8] + rootWidgetHeights[var8] > var5 && rootWidgetYs[var8] < var22 + var5) {
									field697[var8] = true;
								}
							}
						}
					}

					if (var21 == 1 || !Script.mouseCam && var21 == 4) {
						var2 = WorldMapRegion.menuX;
						var3 = ApproximateRouteStrategy.menuY;
						var4 = VarcInt.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						var23 = MouseHandler.MouseHandler_lastPressedY;
						var22 = -1;

						int var17;
						for (var8 = 0; var8 < menuOptionsCount; ++var8) {
							var17 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
							if (var5 > var2 && var5 < var4 + var2 && var23 > var17 - 13 && var23 < var17 + 3) {
								var22 = var8;
							}
						}

						int var10;
						int var11;
						if (var22 != -1 && var22 >= 0) {
							var8 = menuArguments1[var22];
							var17 = menuArguments2[var22];
							var10 = menuOpcodes[var22];
							var11 = menuIdentifiers[var22];
							String var12 = menuActions[var22];
							String var13 = menuTargets[var22];
							IgnoreList.menuAction(var8, var17, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						isMenuOpen = false;
						var8 = WorldMapRegion.menuX;
						var17 = ApproximateRouteStrategy.menuY;
						var10 = VarcInt.menuWidth;
						var11 = WorldMapLabelSize.menuHeight;

						for (int var18 = 0; var18 < rootWidgetCount; ++var18) {
							if (rootWidgetWidths[var18] + rootWidgetXs[var18] > var8 && rootWidgetXs[var18] < var8 + var10 && rootWidgetHeights[var18] + rootWidgetYs[var18] > var17 && rootWidgetYs[var18] < var11 + var17) {
								field697[var18] = true;
							}
						}
					}
				} else {
					var2 = class28.method410();
					if ((var21 == 1 || !Script.mouseCam && var21 == 4) && var2 >= 0) {
						var3 = menuOpcodes[var2];
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
							label308: {
								var4 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var6 = class87.getWidget(var5);
								if (!WorldMapID.method3811(Decimator.getWidgetFlags(var6))) {
									var8 = Decimator.getWidgetFlags(var6);
									boolean var7 = (var8 >> 29 & 1) != 0;
									if (!var7) {
										break label308;
									}
								}

								if (Decimator.dragInventoryWidget != null && !field668 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
									var22 = draggedWidgetX;
									var8 = draggedWidgetY;
									MenuAction var9 = ArchiveDiskAction.tempMenuAction;
									IgnoreList.menuAction(var9.param0, var9.param1, var9.opcode, var9.identifier, var9.action, var9.action, var22, var8);
									ArchiveDiskAction.tempMenuAction = null;
								}

								field668 = false;
								itemDragDuration = 0;
								if (Decimator.dragInventoryWidget != null) {
									Actor.invalidateWidget(Decimator.dragInventoryWidget);
								}

								Decimator.dragInventoryWidget = class87.getWidget(var5);
								dragItemSlotSource = var4;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									ArchiveDiskAction.tempMenuAction = new MenuAction();
									ArchiveDiskAction.tempMenuAction.param0 = menuArguments1[var2];
									ArchiveDiskAction.tempMenuAction.param1 = menuArguments2[var2];
									ArchiveDiskAction.tempMenuAction.opcode = menuOpcodes[var2];
									ArchiveDiskAction.tempMenuAction.identifier = menuIdentifiers[var2];
									ArchiveDiskAction.tempMenuAction.action = menuActions[var2];
								}

								Actor.invalidateWidget(Decimator.dragInventoryWidget);
								return;
							}
						}
					}

					if ((var21 == 1 || !Script.mouseCam && var21 == 4) && this.shouldLeftClickOpenMenu()) {
						var21 = 2;
					}

					if ((var21 == 1 || !Script.mouseCam && var21 == 4) && menuOptionsCount > 0 && var2 >= 0) {
						var3 = menuArguments1[var2];
						var4 = menuArguments2[var2];
						var5 = menuOpcodes[var2];
						var23 = menuIdentifiers[var2];
						String var15 = menuActions[var2];
						String var16 = menuTargets[var2];
						IgnoreList.menuAction(var3, var4, var5, var23, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					if (var21 == 2 && menuOptionsCount > 0) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2025457017"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class28.method410();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || GrandExchangeOfferOwnWorldComparator.method1132(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-512239185"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		NPC.method2214(var1, var2);
		CollisionMap.scene.menuOpen(class391.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = InvDefinition.canvasWidth;
		int var4 = GameEngine.canvasHeight;
		if (class317.loadInterface(var2)) {
			Coord.resizeInterface(class139.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)V",
		garbageValue = "-1891102601"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class87.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = InvDefinition.canvasWidth;
			var4 = GameEngine.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		UrlRequest.alignWidgetSize(var1, var3, var4, false);
		class128.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-74"
	)
	final void method1159() {
		Actor.invalidateWidget(clickedWidget);
		++class125.widgetDragDuration;
		if (field669 && field666) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field623) {
				var1 = field623;
			}

			if (var1 + clickedWidget.width > field623 + clickedWidgetParent.width) {
				var1 = field623 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field658) {
				var2 = field658;
			}

			if (var2 + clickedWidget.height > field658 + clickedWidgetParent.height) {
				var2 = field658 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field739;
			int var4 = var2 - field671;
			int var5 = clickedWidget.dragZoneSize;
			if (class125.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field623 + clickedWidgetParent.scrollX;
			int var7 = var2 - field658 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class139.runScriptEvent(var8);
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
						class139.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && Message.method1099(clickedWidget) != null) {
						PacketBufferNode var12 = FriendSystem.getPacketBufferNode(ClientPacket.field2698, packetWriter.isaacCipher);
						var12.packetBuffer.method6861(clickedWidget.id);
						var12.packetBuffer.method6951(draggedOnWidget.childIndex);
						var12.packetBuffer.method6852(clickedWidget.childIndex);
						var12.packetBuffer.method6852(draggedOnWidget.itemId);
						var12.packetBuffer.method6852(clickedWidget.itemId);
						var12.packetBuffer.method6860(draggedOnWidget.id);
						packetWriter.addNode(var12);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field739 + widgetClickX, field671 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					int var11 = field739 + widgetClickX;
					int var9 = widgetClickY + field671;
					MenuAction var10 = ArchiveDiskAction.tempMenuAction;
					IgnoreList.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var11, var9);
					ArchiveDiskAction.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (class125.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(I)Lpp;",
		garbageValue = "-2077546643"
	)
	@Export("username")
	public Username username() {
		return class129.localPlayer != null ? class129.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				int var4;
				for (int var1 = 0; var1 <= 22; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0;
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
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
							var4 = Integer.parseInt(var2);
							Language var3;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var3 = Language.Language_valuesOrdered[var4];
							} else {
								var3 = null;
							}

							class323.clientLanguage = var3;
							break;
						case 7:
							WorldMapSection2.field2031 = class124.method2543(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							WorldMapIcon_0.field2104 = var2;
							break;
						case 10:
							class16.field83 = (StudioGame)class260.findEnumerated(DesktopPlatformInfoProvider.method6307(), Integer.parseInt(var2));
							if (class16.field83 == StudioGame.oldscape) {
								SoundCache.loginType = LoginType.oldscape;
							} else {
								SoundCache.loginType = LoginType.field4199;
							}
							break;
						case 11:
							class16.field84 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							KeyHandler.field145 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class328.field3915 = var2;
							break;
						case 21:
							field485 = Integer.parseInt(var2);
							break;
						case 22:
							field538 = Integer.parseInt(var2) != 0;
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class279.worldHost = this.getCodeBase().getHost();
				String var17 = WorldMapSection2.field2031.name;
				byte var18 = 0;

				try {
					JagexCache.idxCount = 21;
					class397.cacheGamebuild = var18;

					try {
						SoundSystem.operatingSystemName = System.getProperty("os.name");
					} catch (Exception var35) {
						SoundSystem.operatingSystemName = "Unknown";
					}

					class137.formattedOperatingSystemName = SoundSystem.operatingSystemName.toLowerCase();

					try {
						ItemContainer.userHomeDirectory = System.getProperty("user.home");
						if (ItemContainer.userHomeDirectory != null) {
							ItemContainer.userHomeDirectory = ItemContainer.userHomeDirectory + "/";
						}
					} catch (Exception var34) {
					}

					try {
						if (class137.formattedOperatingSystemName.startsWith("win")) {
							if (ItemContainer.userHomeDirectory == null) {
								ItemContainer.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (ItemContainer.userHomeDirectory == null) {
							ItemContainer.userHomeDirectory = System.getenv("HOME");
						}

						if (ItemContainer.userHomeDirectory != null) {
							ItemContainer.userHomeDirectory = ItemContainer.userHomeDirectory + "/";
						}
					} catch (Exception var33) {
					}

					if (ItemContainer.userHomeDirectory == null) {
						ItemContainer.userHomeDirectory = "~/";
					}

					Varcs.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ItemContainer.userHomeDirectory, "/tmp/", ""};
					ChatChannel.cacheSubPaths = new String[]{".jagex_cache_" + class397.cacheGamebuild, ".file_store_" + class397.cacheGamebuild};
					int var19 = 0;

					label303:
					while (var19 < 4) {
						String var5 = var19 == 0 ? "" : "" + var19;
						GrandExchangeOfferAgeComparator.JagexCache_locationFile = new File(ItemContainer.userHomeDirectory, "jagex_cl_oldschool_" + var17 + var5 + ".dat");
						String var6 = null;
						String var7 = null;
						boolean var8 = false;
						Buffer var10;
						int var11;
						int var13;
						File var43;
						if (GrandExchangeOfferAgeComparator.JagexCache_locationFile.exists()) {
							try {
								AccessFile var9 = new AccessFile(GrandExchangeOfferAgeComparator.JagexCache_locationFile, "rw", 10000L);

								for (var10 = new Buffer((int)var9.length()); var10.offset < var10.array.length; var10.offset += var11) {
									var11 = var9.read(var10.array, var10.offset, var10.array.length - var10.offset);
									if (var11 == -1) {
										throw new IOException();
									}
								}

								var10.offset = 0;
								var11 = var10.readUnsignedByte();
								if (var11 < 1 || var11 > 3) {
									throw new IOException("" + var11);
								}

								int var12 = 0;
								if (var11 > 1) {
									var12 = var10.readUnsignedByte();
								}

								if (var11 <= 2) {
									var6 = var10.readStringCp1252NullCircumfixed();
									if (var12 == 1) {
										var7 = var10.readStringCp1252NullCircumfixed();
									}
								} else {
									var6 = var10.readCESU8();
									if (var12 == 1) {
										var7 = var10.readCESU8();
									}
								}

								var9.close();
							} catch (IOException var37) {
								var37.printStackTrace();
							}

							if (var6 != null) {
								var43 = new File(var6);
								if (!var43.exists()) {
									var6 = null;
								}
							}

							if (var6 != null) {
								var43 = new File(var6, "test.dat");

								boolean var45;
								try {
									RandomAccessFile var20 = new RandomAccessFile(var43, "rw");
									var13 = var20.read();
									var20.seek(0L);
									var20.write(var13);
									var20.seek(0L);
									var20.close();
									var43.delete();
									var45 = true;
								} catch (Exception var32) {
									var45 = false;
								}

								if (!var45) {
									var6 = null;
								}
							}
						}

						if (var6 == null && var19 == 0) {
							label279:
							for (int var21 = 0; var21 < ChatChannel.cacheSubPaths.length; ++var21) {
								for (int var22 = 0; var22 < Varcs.cacheParentPaths.length; ++var22) {
									File var23 = new File(Varcs.cacheParentPaths[var22] + ChatChannel.cacheSubPaths[var21] + File.separatorChar + "oldschool" + File.separatorChar);
									if (var23.exists()) {
										File var24 = new File(var23, "test.dat");

										boolean var47;
										try {
											RandomAccessFile var14 = new RandomAccessFile(var24, "rw");
											int var15 = var14.read();
											var14.seek(0L);
											var14.write(var15);
											var14.seek(0L);
											var14.close();
											var24.delete();
											var47 = true;
										} catch (Exception var31) {
											var47 = false;
										}

										if (var47) {
											var6 = var23.toString();
											var8 = true;
											break label279;
										}
									}
								}
							}
						}

						if (var6 == null) {
							var6 = ItemContainer.userHomeDirectory + File.separatorChar + "jagexcache" + var5 + File.separatorChar + "oldschool" + File.separatorChar + var17 + File.separatorChar;
							var8 = true;
						}

						File var42;
						if (var7 != null) {
							var42 = new File(var7);
							var43 = new File(var6);

							try {
								File[] var52 = var42.listFiles();
								File[] var49 = var52;

								for (var13 = 0; var13 < var49.length; ++var13) {
									File var48 = var49[var13];
									File var25 = new File(var43, var48.getName());
									boolean var16 = var48.renameTo(var25);
									if (!var16) {
										throw new IOException();
									}
								}
							} catch (Exception var36) {
								var36.printStackTrace();
							}

							var8 = true;
						}

						if (var8) {
							var42 = new File(var6);
							var10 = null;

							try {
								AccessFile var53 = new AccessFile(GrandExchangeOfferAgeComparator.JagexCache_locationFile, "rw", 10000L);
								Buffer var50 = new Buffer(500);
								var50.writeByte(3);
								var50.writeByte(var10 != null ? 1 : 0);
								var50.writeCESU8(var42.getPath());
								if (var10 != null) {
									var50.writeCESU8("");
								}

								var53.write(var50.array, 0, var50.offset);
								var53.close();
							} catch (IOException var30) {
								var30.printStackTrace();
							}
						}

						File var26 = new File(var6);
						JagexCache.cacheDir = var26;
						if (!JagexCache.cacheDir.exists()) {
							JagexCache.cacheDir.mkdirs();
						}

						File[] var41 = JagexCache.cacheDir.listFiles();
						if (var41 == null) {
							break;
						}

						File[] var44 = var41;
						int var27 = 0;

						while (true) {
							if (var27 >= var44.length) {
								break label303;
							}

							File var28 = var44[var27];

							boolean var51;
							try {
								RandomAccessFile var46 = new RandomAccessFile(var28, "rw");
								var11 = var46.read();
								var46.seek(0L);
								var46.write(var11);
								var46.seek(0L);
								var46.close();
								var51 = true;
							} catch (Exception var29) {
								var51 = false;
							}

							if (!var51) {
								++var19;
								break;
							}

							++var27;
						}
					}

					File var40 = JagexCache.cacheDir;
					FileSystem.FileSystem_cacheDir = var40;
					if (!FileSystem.FileSystem_cacheDir.exists()) {
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true;
					AbstractUserComparator.method5977();
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class91.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class91.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
					JagexCache.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

					for (var4 = 0; var4 < JagexCache.idxCount; ++var4) {
						JagexCache.JagexCache_idxFiles[var4] = new BufferedFile(new AccessFile(class91.getFile("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0);
					}
				} catch (Exception var38) {
					class4.RunException_sendStackTrace((String)null, var38);
				}

				ArchiveDiskActionHandler.client = this;
				RunException.clientType = clientType;
				if (field487 == -1) {
					field487 = 0;
				}

				field520 = System.getenv("JX_ACCESS_TOKEN");
				System.getenv("JX_REFRESH_TOKEN");
				this.startThread(765, 503, 199);
			}
		} catch (RuntimeException var39) {
			throw ParamComposition.newRunException(var39, "client.init(" + ')');
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "123"
	)
	public static void method1330() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "552673422"
	)
	static int method1609(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1278315237"
	)
	static void method1611() {
		if (class16.field82 != null) {
			field760 = cycle;
			class16.field82.method5365();

			for (int var0 = 0; var0 < players.length; ++var0) {
				if (players[var0] != null) {
					class16.field82.method5364((players[var0].x >> 7) + FloorOverlayDefinition.baseX, (players[var0].y >> 7) + class320.baseY);
				}
			}
		}

	}
}
