import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "[Lex;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 1674651291
	)
	public static int field779;
	@ObfuscatedName("ss")
	static boolean field746;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 599158567
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = -296270013
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = 1370188631
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -1262873417
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	static final ApproximateRouteStrategy field783;
	@ObfuscatedName("vy")
	static int[] field784;
	@ObfuscatedName("vj")
	static int[] field785;
	@ObfuscatedName("sa")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("tu")
	static boolean field754;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1572034959
	)
	static int field561;
	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 1679635193
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = -1673017289
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sq")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = 984000669
	)
	static int field775;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1124774391
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sc")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sm")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -1290712593
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("sy")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 362704857
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 223521103
	)
	static int field714;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		longValue = -2347175531478296847L
	)
	static long field585;
	@ObfuscatedName("uf")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("tx")
	static boolean[] field546;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 810173849
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -2104517495
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tk")
	static short field760;
	@ObfuscatedName("te")
	static short field761;
	@ObfuscatedName("tt")
	static short field766;
	@ObfuscatedName("rd")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tq")
	static short field666;
	@ObfuscatedName("tg")
	static short field765;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("tc")
	@ObfuscatedGetter(
		intValue = -985861069
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tw")
	static short field764;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = 115517713
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ri")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("th")
	static int[] field756;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tl")
	static int[] field636;
	@ObfuscatedName("tb")
	static int[] field674;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "[Lea;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tm")
	static int[] field600;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -2113477791
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = -319356623
	)
	static int field731;
	@ObfuscatedName("qt")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("ts")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("tr")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = 959543265
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("rn")
	static int[] field733;
	@ObfuscatedName("re")
	static int[] field732;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 75180695
	)
	static int field782;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "[Llh;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("qs")
	static String field728;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("aa")
	static boolean field490;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 125631107
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1205446505
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 648294645
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bh")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bf")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 302223075
	)
	static int field617;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1896865619
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 2077868883
	)
	static int field498;
	@ObfuscatedName("bk")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1430199997
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cd")
	static boolean field504;
	@ObfuscatedName("cw")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 395789251
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 4039727128502314979L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1271698921
	)
	static int field508;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -636439299
	)
	static int field509;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		longValue = -3400389721311801431L
	)
	static long field510;
	@ObfuscatedName("dp")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1948172533
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1059936819
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1326790571
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1613753799
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 678748679
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -484656195
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -2063879327
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 800403081
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 576607501
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1784085227
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -20961693
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 1976785561
	)
	static int field525;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 962124251
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 1954076743
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -1036916585
	)
	static int field528;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = -1101689681
	)
	static int field661;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 1469005087
	)
	static int field530;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static class124 field531;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static class441 field532;
	@ObfuscatedName("ft")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gs")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "[Lcy;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1354722257
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gt")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 349713523
	)
	static int field547;
	@ObfuscatedName("go")
	static int[] field548;
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -429421433
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gu")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gd")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gq")
	static boolean field553;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hz")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -2040429487
	)
	static int field747;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1657321755
	)
	static int field608;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 800034625
	)
	static int field558;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1284292665
	)
	static int field758;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -1957551061
	)
	static int field560;
	@ObfuscatedName("hf")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("hu")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hb")
	static final int[] field748;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -1481528837
	)
	static int field556;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 90219493
	)
	static int field566;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = 2041898935
	)
	static int field670;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 2062325883
	)
	static int field694;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -541139307
	)
	static int field740;
	@ObfuscatedName("iu")
	static boolean field570;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -5461521
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1628522517
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 275555387
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 170715045
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -1211766585
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 2051456837
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1066673885
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -1265757545
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 924147421
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -733089741
	)
	static int field581;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -145236613
	)
	static int field590;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -665527289
	)
	static int field489;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -210849807
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 868767683
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -416666023
	)
	static int field586;
	@ObfuscatedName("jn")
	static boolean field759;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 865687077
	)
	static int field588;
	@ObfuscatedName("jx")
	static boolean field589;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 158316317
	)
	static int field718;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -170106615
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1300592885
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("js")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kn")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ki")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kg")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ks")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kj")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kf")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kp")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kk")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 1107217747
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1551118407
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 1986228753
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 741952061
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1652587127
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 734553977
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1471175899
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kx")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 151117229
	)
	static int field610;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 1905969143
	)
	static int field611;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 771238189
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -1731633013
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 591102181
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 1965014457
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kz")
	static boolean field767;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 1504694891
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -961793091
	)
	static int field618;
	@ObfuscatedName("ln")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "[Lcz;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 911475385
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -525615991
	)
	static int field544;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		longValue = 4157369345681014175L
	)
	static long field623;
	@ObfuscatedName("lc")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -871115459
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1054913333
	)
	static int field626;
	@ObfuscatedName("lo")
	static int[] field627;
	@ObfuscatedName("lj")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("la")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ld")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("lt")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1885958183
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "[[[Lld;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mq")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mn")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("md")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -410278811
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("ma")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 121755793
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("my")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mj")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mu")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mf")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mi")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("mm")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mc")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mx")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("mg")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("mv")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mw")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -1210803439
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = 119579989
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -1368411589
	)
	static int field656;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -2015724673
	)
	static int field657;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 1419000661
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ng")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -1858579497
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -151006751
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("nx")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nd")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = 1632536739
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -90975371
	)
	static int field668;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = -1017961137
	)
	static int field628;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -1279214155
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 1543781551
	)
	static int field524;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -1063216989
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -749223927
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -1274512229
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1488347039
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oe")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -1977634921
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 933052317
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ot")
	static boolean field696;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -1107790009
	)
	static int field773;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -754925295
	)
	static int field686;
	@ObfuscatedName("ol")
	static boolean field687;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -1838827617
	)
	static int field688;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 1850811259
	)
	static int field757;
	@ObfuscatedName("oq")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 1092217725
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pu")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -334272855
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("po")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -478615495
	)
	static int field695;
	@ObfuscatedName("pp")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 2097836455
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pg")
	static int[] field698;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 1885131439
	)
	static int field699;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -1111710623
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 1773222505
	)
	static int field701;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -1118711907
	)
	static int field702;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 614772325
	)
	static int field703;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = -1232589287
	)
	static int field755;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -646988223
	)
	static int field705;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 776062487
	)
	static int field706;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -409433949
	)
	static int field707;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 96279785
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static NodeDeque field710;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static NodeDeque field711;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -988949017
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -398701791
	)
	static int field540;
	@ObfuscatedName("qd")
	static boolean[] field715;
	@ObfuscatedName("ql")
	static boolean[] field716;
	@ObfuscatedName("qu")
	static boolean[] field717;
	@ObfuscatedName("qe")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qq")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qi")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qy")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 1720526633
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		longValue = 669441914719297349L
	)
	static long field601;
	@ObfuscatedName("qa")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("qo")
	static int[] field725;
	@ObfuscatedName("fl")
	String field564;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	class14 field622;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	class19 field690;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester field536;
	@ObfuscatedName("fq")
	Future field599;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	Buffer field496;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	class7 field541;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		longValue = 1413967701067592279L
	)
	long field542;

	static {
		field490 = true; // L: 134
		worldId = 1; // L: 135
		worldProperties = 0; // L: 136
		gameBuild = 0; // L: 138
		isMembersWorld = false; // L: 141
		isLowDetail = false; // L: 142
		field617 = -1; // L: 147
		clientType = -1; // L: 148
		field498 = -1; // L: 149
		onMobile = false; // L: 150
		gameState = 0; // L: 162
		isLoading = true; // L: 185
		cycle = 0; // L: 186
		mouseLastLastPressedTimeMillis = -1L; // L: 187
		field508 = -1; // L: 189
		field509 = -1; // L: 190
		field510 = -1L; // L: 191
		hadFocus = true; // L: 192
		rebootTimer = 0; // L: 193
		hintArrowType = 0; // L: 194
		hintArrowNpcIndex = 0; // L: 195
		hintArrowPlayerIndex = 0; // L: 196
		hintArrowX = 0; // L: 197
		hintArrowY = 0; // L: 198
		hintArrowHeight = 0; // L: 199
		hintArrowSubX = 0; // L: 200
		hintArrowSubY = 0; // L: 201
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 203
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 204
		titleLoadingStage = 0; // L: 209
		js5ConnectState = 0; // L: 212
		field525 = 0; // L: 213
		js5Errors = 0; // L: 235
		loginState = 0; // L: 237
		field528 = 0; // L: 238
		field661 = 0; // L: 239
		field530 = 0; // L: 240
		field531 = class124.field1495; // L: 241
		field532 = class441.field4678; // L: 242
		Login_isUsernameRemembered = false; // L: 261
		secureRandomFuture = new SecureRandomFuture(); // L: 262
		randomDatData = null; // L: 269
		npcs = new NPC[32768]; // L: 273
		npcCount = 0; // L: 274
		npcIndices = new int[32768]; // L: 275
		field547 = 0; // L: 276
		field548 = new int[250]; // L: 277
		packetWriter = new PacketWriter(); // L: 280
		logoutTimer = 0; // L: 282
		hadNetworkError = false; // L: 283
		useBufferedSocket = true; // L: 284
		field553 = false; // L: 285
		timer = new Timer(); // L: 286
		fontsMap = new HashMap(); // L: 292
		field747 = 0; // L: 299
		field608 = 1; // L: 300
		field558 = 0; // L: 301
		field758 = 1; // L: 302
		field560 = 0; // L: 303
		collisionMaps = new CollisionMap[4]; // L: 311
		isInInstance = false; // L: 312
		instanceChunkTemplates = new int[4][13][13]; // L: 313
		field748 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 314
		field556 = 0; // L: 317
		field566 = 2301979; // L: 329
		field670 = 5063219; // L: 330
		field694 = 3353893; // L: 331
		field740 = 7759444; // L: 332
		field570 = false; // L: 333
		alternativeScrollbarWidth = 0; // L: 334
		camAngleX = 128; // L: 342
		camAngleY = 0; // L: 343
		camAngleDY = 0; // L: 344
		camAngleDX = 0; // L: 345
		mouseCamClickedX = 0; // L: 346
		mouseCamClickedY = 0; // L: 347
		oculusOrbState = 0; // L: 348
		camFollowHeight = 50; // L: 349
		field581 = 0; // L: 353
		field590 = 0; // L: 354
		field489 = 0; // L: 355
		oculusOrbNormalSpeed = 12; // L: 357
		oculusOrbSlowedSpeed = 6; // L: 358
		field586 = 0; // L: 359
		field759 = false; // L: 360
		field588 = 0; // L: 361
		field589 = false; // L: 362
		field718 = 0; // L: 363
		overheadTextCount = 0; // L: 364
		overheadTextLimit = 50; // L: 365
		overheadTextXs = new int[overheadTextLimit]; // L: 366
		overheadTextYs = new int[overheadTextLimit]; // L: 367
		overheadTextAscents = new int[overheadTextLimit]; // L: 368
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 369
		overheadTextColors = new int[overheadTextLimit]; // L: 370
		overheadTextEffects = new int[overheadTextLimit]; // L: 371
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 372
		overheadText = new String[overheadTextLimit]; // L: 373
		tileLastDrawnActor = new int[104][104]; // L: 374
		viewportDrawCount = 0; // L: 375
		viewportTempX = -1; // L: 376
		viewportTempY = -1; // L: 377
		mouseCrossX = 0; // L: 378
		mouseCrossY = 0; // L: 379
		mouseCrossState = 0; // L: 380
		mouseCrossColor = 0; // L: 381
		showMouseCross = true; // L: 382
		field610 = 0; // L: 384
		field611 = 0; // L: 385
		dragItemSlotSource = 0; // L: 388
		draggedWidgetX = 0; // L: 389
		draggedWidgetY = 0; // L: 390
		dragItemSlotDestination = 0; // L: 391
		field767 = false; // L: 392
		itemDragDuration = 0; // L: 393
		field618 = 0; // L: 394
		showLoadingMessages = true; // L: 396
		players = new Player[2048]; // L: 398
		localPlayerIndex = -1; // L: 400
		field544 = 0; // L: 401
		field623 = -1L; // L: 402
		renderSelf = true; // L: 404
		drawPlayerNames = 0; // L: 409
		field626 = 0; // L: 410
		field627 = new int[1000]; // L: 411
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 413
		playerMenuActions = new String[8]; // L: 414
		playerOptionsPriorities = new boolean[8]; // L: 415
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 416
		combatTargetPlayerIndex = -1; // L: 417
		groundItems = new NodeDeque[4][104][104]; // L: 418
		pendingSpawns = new NodeDeque(); // L: 419
		projectiles = new NodeDeque(); // L: 420
		graphicsObjects = new NodeDeque(); // L: 421
		currentLevels = new int[25]; // L: 422
		levels = new int[25]; // L: 423
		experience = new int[25]; // L: 424
		leftClickOpensMenu = 0; // L: 425
		isMenuOpen = false; // L: 426
		menuOptionsCount = 0; // L: 432
		menuArguments1 = new int[500]; // L: 433
		menuArguments2 = new int[500]; // L: 434
		menuOpcodes = new int[500]; // L: 435
		menuIdentifiers = new int[500]; // L: 436
		menuActions = new String[500]; // L: 437
		menuTargets = new String[500]; // L: 438
		menuShiftClick = new boolean[500]; // L: 439
		followerOpsLowPriority = false; // L: 440
		shiftClickDrop = false; // L: 442
		tapToDrop = false; // L: 443
		showMouseOverText = true; // L: 444
		viewportX = -1; // L: 445
		viewportY = -1; // L: 446
		field656 = 0; // L: 450
		field657 = 50; // L: 451
		isItemSelected = 0; // L: 452
		selectedItemName = null; // L: 456
		isSpellSelected = false; // L: 457
		selectedSpellChildIndex = -1; // L: 459
		selectedSpellItemId = -1; // L: 460
		selectedSpellActionName = null; // L: 462
		selectedSpellName = null; // L: 463
		rootInterface = -1; // L: 464
		interfaceParents = new NodeHashTable(8); // L: 465
		field668 = 0; // L: 470
		field628 = -1; // L: 471
		chatEffects = 0; // L: 472
		field524 = 0; // L: 473
		meslayerContinueWidget = null; // L: 474
		runEnergy = 0; // L: 475
		weight = 0; // L: 476
		staffModLevel = 0; // L: 477
		followerIndex = -1; // L: 478
		playerMod = false; // L: 479
		viewportWidget = null; // L: 480
		clickedWidget = null; // L: 481
		clickedWidgetParent = null; // L: 482
		widgetClickX = 0; // L: 483
		widgetClickY = 0; // L: 484
		draggedOnWidget = null; // L: 485
		field696 = false; // L: 486
		field773 = -1; // L: 487
		field686 = -1; // L: 488
		field687 = false; // L: 489
		field688 = -1; // L: 490
		field757 = -1; // L: 491
		isDraggingWidget = false; // L: 492
		cycleCntr = 1; // L: 497
		changedVarps = new int[32]; // L: 500
		changedVarpCount = 0; // L: 501
		changedItemContainers = new int[32]; // L: 502
		field695 = 0; // L: 503
		changedSkills = new int[32]; // L: 504
		changedSkillsCount = 0; // L: 505
		field698 = new int[32]; // L: 506
		field699 = 0; // L: 507
		chatCycle = 0; // L: 508
		field701 = 0; // L: 509
		field702 = 0; // L: 510
		field703 = 0; // L: 511
		field755 = 0; // L: 512
		field705 = 0; // L: 513
		field706 = 0; // L: 514
		field707 = 0; // L: 515
		mouseWheelRotation = 0; // L: 521
		scriptEvents = new NodeDeque(); // L: 522
		field710 = new NodeDeque(); // L: 523
		field711 = new NodeDeque(); // L: 524
		widgetFlags = new NodeHashTable(512); // L: 525
		rootWidgetCount = 0; // L: 527
		field540 = -2; // L: 528
		field715 = new boolean[100]; // L: 529
		field716 = new boolean[100]; // L: 530
		field717 = new boolean[100]; // L: 531
		rootWidgetXs = new int[100]; // L: 532
		rootWidgetYs = new int[100]; // L: 533
		rootWidgetWidths = new int[100]; // L: 534
		rootWidgetHeights = new int[100]; // L: 535
		gameDrawingMode = 0; // L: 536
		field601 = 0L; // L: 537
		isResizable = true; // L: 538
		field725 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 545
		publicChatMode = 0; // L: 546
		tradeChatMode = 0; // L: 548
		field728 = ""; // L: 549
		crossWorldMessageIds = new long[100]; // L: 551
		crossWorldMessageIdsIndex = 0; // L: 552
		field731 = 0; // L: 554
		field732 = new int[128]; // L: 555
		field733 = new int[128]; // L: 556
		field585 = -1L; // L: 557
		currentClanSettings = new ClanSettings[3]; // L: 561
		currentClanChannels = new ClanChannel[3]; // L: 563
		field714 = -1; // L: 565
		mapIconCount = 0; // L: 566
		mapIconXs = new int[1000]; // L: 567
		mapIconYs = new int[1000]; // L: 568
		mapIcons = new SpritePixels[1000]; // L: 569
		destinationX = 0; // L: 570
		destinationY = 0; // L: 571
		minimapState = 0; // L: 578
		currentTrackGroupId = -1; // L: 579
		field746 = false; // L: 580
		soundEffectCount = 0; // L: 586
		soundEffectIds = new int[50]; // L: 587
		queuedSoundEffectLoops = new int[50]; // L: 588
		queuedSoundEffectDelays = new int[50]; // L: 589
		soundLocations = new int[50]; // L: 590
		soundEffects = new SoundEffect[50]; // L: 591
		isCameraLocked = false; // L: 593
		field754 = false; // L: 604
		field546 = new boolean[5]; // L: 612
		field756 = new int[5]; // L: 613
		field636 = new int[5]; // L: 614
		field674 = new int[5]; // L: 615
		field600 = new int[5]; // L: 616
		field760 = 256; // L: 617
		field761 = 205; // L: 618
		zoomHeight = 256; // L: 619
		zoomWidth = 320; // L: 620
		field764 = 1; // L: 621
		field765 = 32767; // L: 622
		field766 = 1; // L: 623
		field666 = 32767; // L: 624
		viewportOffsetX = 0; // L: 625
		viewportOffsetY = 0; // L: 626
		viewportWidth = 0; // L: 627
		viewportHeight = 0; // L: 628
		viewportZoom = 0; // L: 629
		playerAppearance = new PlayerComposition(); // L: 631
		field561 = -1; // L: 632
		field775 = -1; // L: 633
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 635
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 637
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 640
		field779 = -1; // L: 647
		archiveLoaders = new ArrayList(10); // L: 648
		archiveLoadersDone = 0; // L: 649
		field782 = 0; // L: 650
		field783 = new ApproximateRouteStrategy(); // L: 659
		field784 = new int[50]; // L: 660
		field785 = new int[50]; // L: 661
	}

	public Client() {
		this.field542 = -1L; // L: 267
	} // L: 12725

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1462606142"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field601 = class136.method2931() + 500L; // L: 4285
		this.resizeJS(); // L: 4286
		if (rootInterface != -1) { // L: 4287
			this.resizeRoot(true);
		}

	} // L: 4288

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1665364684"
	)
	@Export("setUp")
	protected final void setUp() {
		ArchiveLoader.method2061(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 831
		SecureRandomFuture.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 832
		UserComparator9.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 833
		class329.currentPort = SecureRandomFuture.worldPort; // L: 834
		PlayerComposition.field3304 = class293.field3308; // L: 835
		class144.field1629 = class293.field3309; // L: 836
		WorldMapIcon_0.field2300 = class293.field3310; // L: 837
		WorldMapRectangle.field2356 = class293.field3312; // L: 838
		VerticalAlignment.urlRequester = new class101(); // L: 839
		this.setUpKeyboard(); // L: 840
		this.method428(); // L: 841
		MenuAction.mouseWheel = this.mouseWheel(); // L: 842
		class182.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 843
		class131.clientPreferences = AbstractWorldMapData.method4344(); // L: 844
		this.setUpClipboard(); // L: 845
		ModelData0.method5093(this, class193.field2189); // L: 846
		class131.setWindowedMode(class131.clientPreferences.method2251()); // L: 847
		Decimator.friendSystem = new FriendSystem(class122.loginType); // L: 848
		this.field622 = new class14("tokenRequest", 1, 1); // L: 849
	} // L: 850

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "612160698"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 853
		this.doCycleJs5(); // L: 854

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 858
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 859
			} // L: 860

			if (var1 == null) { // L: 861
				int var5;
				try {
					if (class273.musicPlayerStatus == 1) { // L: 867
						var5 = class273.midiPcmStream.method5264(); // L: 868
						if (var5 > 0 && class273.midiPcmStream.isReady()) { // L: 869
							var5 -= class273.pcmSampleLength; // L: 870
							if (var5 < 0) { // L: 871
								var5 = 0;
							}

							class273.midiPcmStream.setPcmStreamVolume(var5); // L: 872
						} else {
							class273.midiPcmStream.clear(); // L: 875
							class273.midiPcmStream.removeAll(); // L: 876
							if (class273.musicTrackArchive != null) { // L: 877
								class273.musicPlayerStatus = 2;
							} else {
								class273.musicPlayerStatus = 0; // L: 878
							}

							ArchiveDiskActionHandler.musicTrack = null; // L: 879
							class152.soundCache = null; // L: 880
						}
					}
				} catch (Exception var9) { // L: 883
					var9.printStackTrace(); // L: 884
					class273.midiPcmStream.clear(); // L: 885
					class273.musicPlayerStatus = 0; // L: 886
					ArchiveDiskActionHandler.musicTrack = null; // L: 887
					class152.soundCache = null; // L: 888
					class273.musicTrackArchive = null; // L: 889
				}

				class116.playPcmPlayers(); // L: 892
				synchronized(KeyHandler.KeyHandler_instance) { // L: 894
					++KeyHandler.KeyHandler_idleCycles; // L: 895
					KeyHandler.field141 = KeyHandler.field138; // L: 896
					KeyHandler.field118 = 0; // L: 897
					KeyHandler.field132 = 0; // L: 898
					Arrays.fill(KeyHandler.field140, false); // L: 899
					Arrays.fill(KeyHandler.field131, false); // L: 900
					if (KeyHandler.field128 < 0) { // L: 901
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 902
						KeyHandler.field128 = KeyHandler.field133; // L: 903
					} else {
						while (KeyHandler.field128 != KeyHandler.field133) { // L: 906
							int var6 = KeyHandler.field145[KeyHandler.field133]; // L: 907
							KeyHandler.field133 = KeyHandler.field133 + 1 & 127; // L: 908
							if (var6 < 0) { // L: 909
								var6 = ~var6; // L: 910
								if (KeyHandler.KeyHandler_pressedKeys[var6]) { // L: 911
									KeyHandler.KeyHandler_pressedKeys[var6] = false; // L: 912
									KeyHandler.field131[var6] = true; // L: 913
									KeyHandler.field139[KeyHandler.field132] = var6; // L: 914
									++KeyHandler.field132; // L: 915
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var6] && KeyHandler.field118 < KeyHandler.field143.length - 1) { // L: 919
									KeyHandler.field140[var6] = true; // L: 920
									KeyHandler.field143[++KeyHandler.field118 - 1] = var6; // L: 921
								}

								KeyHandler.KeyHandler_pressedKeys[var6] = true; // L: 923
							}
						}
					}

					if (KeyHandler.field118 > 0) { // L: 927
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field138 = KeyHandler.field142; // L: 928
				}

				HealthBarDefinition.method3473(); // L: 931
				if (MenuAction.mouseWheel != null) { // L: 932
					var5 = MenuAction.mouseWheel.useRotation(); // L: 933
					mouseWheelRotation = var5; // L: 934
				}

				if (gameState == 0) { // L: 936
					Archive.load(); // L: 937
					UserComparator9.method2619(); // L: 938
				} else if (gameState == 5) { // L: 940
					class360.loginScreen(this, class13.fontPlain12); // L: 941
					Archive.load(); // L: 942
					UserComparator9.method2619(); // L: 943
				} else if (gameState != 10 && gameState != 11) { // L: 945
					if (gameState == 20) { // L: 946
						class360.loginScreen(this, class13.fontPlain12); // L: 947
						this.doCycleLoggedOut(); // L: 948
					} else if (gameState == 50) { // L: 950
						class360.loginScreen(this, class13.fontPlain12); // L: 951
						this.doCycleLoggedOut(); // L: 952
					} else if (gameState == 25) { // L: 954
						FriendSystem.method1715();
					}
				} else {
					class360.loginScreen(this, class13.fontPlain12);
				}

				if (gameState == 30) { // L: 955
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 956
					this.doCycleLoggedOut();
				}

				return; // L: 957
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 862
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-8708"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label175: {
			try {
				if (class273.musicPlayerStatus == 2) { // L: 963
					if (ArchiveDiskActionHandler.musicTrack == null) { // L: 964
						ArchiveDiskActionHandler.musicTrack = MusicTrack.readTrack(class273.musicTrackArchive, AccessFile.musicTrackGroupId, class273.musicTrackFileId); // L: 965
						if (ArchiveDiskActionHandler.musicTrack == null) { // L: 966
							var2 = false; // L: 967
							break label175;
						}
					}

					if (class152.soundCache == null) { // L: 971
						class152.soundCache = new SoundCache(class273.soundEffectsArchive, class273.musicSamplesArchive);
					}

					if (class273.midiPcmStream.loadMusicTrack(ArchiveDiskActionHandler.musicTrack, class273.musicPatchesArchive, class152.soundCache, 22050)) { // L: 972
						class273.midiPcmStream.clearAll(); // L: 973
						class273.midiPcmStream.setPcmStreamVolume(class273.musicTrackVolume); // L: 974
						class273.midiPcmStream.setMusicTrack(ArchiveDiskActionHandler.musicTrack, class17.musicTrackBoolean); // L: 975
						class273.musicPlayerStatus = 0; // L: 976
						ArchiveDiskActionHandler.musicTrack = null; // L: 977
						class152.soundCache = null; // L: 978
						class273.musicTrackArchive = null; // L: 979
						var2 = true; // L: 980
						break label175;
					}
				}
			} catch (Exception var6) { // L: 985
				var6.printStackTrace(); // L: 986
				class273.midiPcmStream.clear(); // L: 987
				class273.musicPlayerStatus = 0; // L: 988
				ArchiveDiskActionHandler.musicTrack = null; // L: 989
				class152.soundCache = null; // L: 990
				class273.musicTrackArchive = null; // L: 991
			}

			var2 = false; // L: 993
		}

		if (var2 && field746 && KeyHandler.pcmPlayer0 != null) { // L: 996 997
			KeyHandler.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field601 != 0L && class136.method2931() > field601) { // L: 999 1000
			class131.setWindowedMode(getWindowedMode()); // L: 1001
		}

		int var4;
		if (var1) { // L: 1004
			for (var4 = 0; var4 < 100; ++var4) { // L: 1005
				field715[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1007
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1008
			class128.drawTitle(RouteStrategy.fontBold12, class113.fontPlain11, class13.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1009
			if (gameState == 20) { // L: 1010
				class128.drawTitle(RouteStrategy.fontBold12, class113.fontPlain11, class13.fontPlain12);
			} else if (gameState == 50) { // L: 1011
				class128.drawTitle(RouteStrategy.fontBold12, class113.fontPlain11, class13.fontPlain12);
			} else if (gameState == 25) { // L: 1012
				if (field560 == 1) { // L: 1013
					if (field747 > field608) { // L: 1014
						field608 = field747;
					}

					var4 = (field608 * 50 - field747 * 50) / field608; // L: 1015
					MusicPatch.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1016
				} else if (field560 == 2) { // L: 1018
					if (field558 > field758) { // L: 1019
						field758 = field558;
					}

					var4 = (field758 * 50 - field558 * 50) / field758 + 50; // L: 1020
					MusicPatch.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1021
				} else {
					MusicPatch.drawLoadingMessage("Loading - please wait.", false); // L: 1023
				}
			} else if (gameState == 30) { // L: 1025
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1026
				MusicPatch.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1027
				MusicPatch.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class128.drawTitle(RouteStrategy.fontBold12, class113.fontPlain11, class13.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1028
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1029
				if (field716[var4]) { // L: 1030
					FontName.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1031
					field716[var4] = false; // L: 1032
				}
			}
		} else if (gameState > 0) { // L: 1036
			FontName.rasterProvider.drawFull(0, 0); // L: 1037

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1038
				field716[var4] = false;
			}
		}

	} // L: 1040

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1364313232"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class160.varcs.hasUnwrittenChanges()) { // L: 1043
			class160.varcs.write();
		}

		if (class120.mouseRecorder != null) { // L: 1044
			class120.mouseRecorder.isRunning = false;
		}

		class120.mouseRecorder = null; // L: 1045
		packetWriter.close(); // L: 1046
		class205.method4256(); // L: 1047
		class116.method2705(); // L: 1048
		MenuAction.mouseWheel = null; // L: 1049
		if (KeyHandler.pcmPlayer0 != null) { // L: 1050
			KeyHandler.pcmPlayer0.shutdown();
		}

		if (ViewportMouse.pcmPlayer1 != null) { // L: 1051
			ViewportMouse.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1053
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1056
			if (ArchiveDiskActionHandler.field3945 != 0) { // L: 1057
				ArchiveDiskActionHandler.field3945 = 1; // L: 1058

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1060
				} catch (InterruptedException var4) { // L: 1062
				}
			}
		}

		if (VerticalAlignment.urlRequester != null) { // L: 1066
			VerticalAlignment.urlRequester.close(); // L: 1067
			VerticalAlignment.urlRequester = null; // L: 1068
		}

		FriendLoginUpdate.method6685(); // L: 1070
		this.field622.method167(); // L: 1071
	} // L: 1072

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "111435525"
	)
	protected final void vmethod1140() {
	} // L: 668

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "104545398"
	)
	boolean method1532() {
		return class360.field4209 != null && !class360.field4209.trim().isEmpty(); // L: 811
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "42"
	)
	boolean method1476() {
		return this.field536 != null; // L: 815
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "20"
	)
	void method1366(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(class113.field1372 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 819
		OtlTokenRequester var3 = this.field536; // L: 820
		if (var3 != null) { // L: 821
			this.field599 = var3.request(var2); // L: 822
		} else {
			class10 var4 = new class10(var2, class9.field37); // L: 825
			var4.method77("Authorization", "Bearer " + var1); // L: 826
			this.field690 = this.field622.method166(var4); // L: 827
		}
	} // L: 823 828

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2117459446"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1117
			long var2 = class136.method2931(); // L: 1120
			int var4 = (int)(var2 - NetCache.field3982); // L: 1121
			NetCache.field3982 = var2; // L: 1122
			if (var4 > 200) { // L: 1123
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1124
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1125
				var1 = true; // L: 1126
			} else if (NetCache.NetCache_socket == null) { // L: 1129
				var1 = false; // L: 1130
			} else {
				try {
					label243: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1134
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1135
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1136
							var6 = new Buffer(4); // L: 1137
							var6.writeByte(1); // L: 1138
							var6.writeMedium((int)var5.key); // L: 1139
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1140
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1141
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1142
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1143
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1145
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1146
							var6 = new Buffer(4); // L: 1147
							var6.writeByte(0); // L: 1148
							var6.writeMedium((int)var5.key); // L: 1149
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1150
							var5.removeDual(); // L: 1151
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1152
							--NetCache.NetCache_pendingWritesCount; // L: 1153
							++NetCache.NetCache_pendingResponsesCount; // L: 1154
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1156
							int var18 = NetCache.NetCache_socket.available(); // L: 1157
							if (var18 < 0) { // L: 1158
								throw new IOException();
							}

							if (var18 == 0) { // L: 1159
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1160
							byte var7 = 0; // L: 1161
							if (class271.NetCache_currentResponse == null) { // L: 1162
								var7 = 8;
							} else if (NetCache.field3995 == 0) { // L: 1163
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1164
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1165
								if (var8 > var18) { // L: 1166
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1167
								if (NetCache.field3998 != 0) { // L: 1168
									for (var9 = 0; var9 < var8; ++var9) { // L: 1169
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
										var10000[var10001] ^= NetCache.field3998;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1171
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1172
									break;
								}

								if (class271.NetCache_currentResponse == null) { // L: 1173
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1174
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1175
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1176
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1177
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1178
									long var13 = (long)(var10 + (var9 << 16)); // L: 1179
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1180
									Coord.field3289 = true; // L: 1181
									if (var15 == null) { // L: 1182
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1183
										Coord.field3289 = false; // L: 1184
									}

									if (var15 == null) { // L: 1186
										throw new IOException(); // L: 1187
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1189
									class271.NetCache_currentResponse = var15; // L: 1190
									class194.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + class271.NetCache_currentResponse.padding); // L: 1191
									class194.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1192
									class194.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1193
									NetCache.field3995 = 8; // L: 1194
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1195
								} else if (NetCache.field3995 == 0) { // L: 1198
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1199
										NetCache.field3995 = 1; // L: 1200
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1201
									} else {
										class271.NetCache_currentResponse = null; // L: 1205
									}
								}
							} else {
								var8 = class194.NetCache_responseArchiveBuffer.array.length - class271.NetCache_currentResponse.padding; // L: 1211
								var9 = 512 - NetCache.field3995; // L: 1212
								if (var9 > var8 - class194.NetCache_responseArchiveBuffer.offset) { // L: 1213
									var9 = var8 - class194.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1214
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class194.NetCache_responseArchiveBuffer.array, class194.NetCache_responseArchiveBuffer.offset, var9); // L: 1215
								if (NetCache.field3998 != 0) { // L: 1216
									for (var10 = 0; var10 < var9; ++var10) { // L: 1217
										var10000 = class194.NetCache_responseArchiveBuffer.array;
										var10001 = class194.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3998;
									}
								}

								var25 = class194.NetCache_responseArchiveBuffer; // L: 1219
								var25.offset += var9;
								NetCache.field3995 += var9; // L: 1220
								if (var8 == class194.NetCache_responseArchiveBuffer.offset) { // L: 1221
									if (16711935L == class271.NetCache_currentResponse.key) { // L: 1222
										Huffman.NetCache_reference = class194.NetCache_responseArchiveBuffer; // L: 1223

										for (var10 = 0; var10 < 256; ++var10) { // L: 1224
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1225
											if (var19 != null) { // L: 1226
												Huffman.NetCache_reference.offset = var10 * 8 + 5; // L: 1227
												var12 = Huffman.NetCache_reference.readInt(); // L: 1228
												int var20 = Huffman.NetCache_reference.readInt(); // L: 1229
												var19.loadIndex(var12, var20); // L: 1230
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1235
										NetCache.NetCache_crc.update(class194.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1236
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1237
										if (var10 != class271.NetCache_currentResponse.crc) { // L: 1238
											try {
												NetCache.NetCache_socket.close(); // L: 1240
											} catch (Exception var23) { // L: 1242
											}

											++NetCache.NetCache_crcMismatches; // L: 1243
											NetCache.NetCache_socket = null; // L: 1244
											NetCache.field3998 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1245
											var1 = false; // L: 1246
											break label243;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1249
										NetCache.NetCache_ioExceptions = 0; // L: 1250
										class271.NetCache_currentResponse.archive.write((int)(class271.NetCache_currentResponse.key & 65535L), class194.NetCache_responseArchiveBuffer.array, (class271.NetCache_currentResponse.key & 16711680L) == 16711680L, Coord.field3289); // L: 1251
									}

									class271.NetCache_currentResponse.remove(); // L: 1253
									if (Coord.field3289) { // L: 1254
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1255
									}

									NetCache.field3995 = 0; // L: 1256
									class271.NetCache_currentResponse = null; // L: 1257
									class194.NetCache_responseArchiveBuffer = null; // L: 1258
								} else {
									if (NetCache.field3995 != 512) { // L: 1260
										break;
									}

									NetCache.field3995 = 0;
								}
							}
						}

						var1 = true; // L: 1264
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1268
					} catch (Exception var22) { // L: 1270
					}

					++NetCache.NetCache_ioExceptions; // L: 1271
					NetCache.NetCache_socket = null; // L: 1272
					var1 = false; // L: 1273
				}
			}

			if (!var1) { // L: 1277
				this.doCycleJs5Connect();
			}

		}
	} // L: 1278

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-49490538"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1281
			this.error("js5crc"); // L: 1282
			Decimator.updateGameState(1000); // L: 1283
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1286
				if (gameState <= 5) { // L: 1287
					this.error("js5io"); // L: 1288
					Decimator.updateGameState(1000); // L: 1289
					return; // L: 1290
				}

				field525 = 3000; // L: 1293
				NetCache.NetCache_ioExceptions = 3; // L: 1294
			}

			if (--field525 + 1 <= 0) { // L: 1297
				try {
					if (js5ConnectState == 0) { // L: 1299
						VerticalAlignment.js5SocketTask = GameEngine.taskHandler.newSocketTask(class17.worldHost, class329.currentPort); // L: 1300
						++js5ConnectState; // L: 1301
					}

					if (js5ConnectState == 1) { // L: 1303
						if (VerticalAlignment.js5SocketTask.status == 2) { // L: 1304
							this.js5Error(-1); // L: 1305
							return; // L: 1306
						}

						if (VerticalAlignment.js5SocketTask.status == 1) { // L: 1308
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1310
						if (useBufferedSocket) { // L: 1311
							Socket var2 = (Socket)VerticalAlignment.js5SocketTask.result; // L: 1313
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1315
							Decimator.js5Socket = var1; // L: 1317
						} else {
							Decimator.js5Socket = new NetSocket((Socket)VerticalAlignment.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1320
						}

						Buffer var13 = new Buffer(5); // L: 1322
						var13.writeByte(15); // L: 1323
						var13.writeInt(204); // L: 1324
						Decimator.js5Socket.write(var13.array, 0, 5); // L: 1325
						++js5ConnectState; // L: 1326
						KeyHandler.field149 = class136.method2931(); // L: 1327
					}

					if (js5ConnectState == 3) { // L: 1329
						if (Decimator.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1330
							int var5 = Decimator.js5Socket.readUnsignedByte(); // L: 1331
							if (var5 != 0) { // L: 1332
								this.js5Error(var5); // L: 1333
								return; // L: 1334
							}

							++js5ConnectState; // L: 1336
						} else if (class136.method2931() - KeyHandler.field149 > 30000L) { // L: 1339
							this.js5Error(-2); // L: 1340
							return; // L: 1341
						}
					}

					if (js5ConnectState == 4) { // L: 1345
						AbstractSocket var14 = Decimator.js5Socket; // L: 1346
						boolean var6 = gameState > 20; // L: 1347
						if (NetCache.NetCache_socket != null) { // L: 1349
							try {
								NetCache.NetCache_socket.close(); // L: 1351
							} catch (Exception var11) { // L: 1353
							}

							NetCache.NetCache_socket = null; // L: 1354
						}

						NetCache.NetCache_socket = var14; // L: 1356
						Buffer var3;
						if (NetCache.NetCache_socket != null) { // L: 1358
							try {
								var3 = new Buffer(4); // L: 1360
								var3.writeByte(var6 ? 2 : 3); // L: 1361
								var3.writeMedium(0); // L: 1362
								NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1363
							} catch (IOException var10) {
								try {
									NetCache.NetCache_socket.close(); // L: 1367
								} catch (Exception var9) { // L: 1369
								}

								++NetCache.NetCache_ioExceptions; // L: 1370
								NetCache.NetCache_socket = null; // L: 1371
							}
						}

						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1374
						class271.NetCache_currentResponse = null; // L: 1375
						class194.NetCache_responseArchiveBuffer = null; // L: 1376
						NetCache.field3995 = 0; // L: 1377

						while (true) {
							NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1379
							if (var15 == null) { // L: 1380
								while (true) {
									var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1386
									if (var15 == null) { // L: 1387
										if (NetCache.field3998 != 0) { // L: 1393
											try {
												var3 = new Buffer(4); // L: 1395
												var3.writeByte(4); // L: 1396
												var3.writeByte(NetCache.field3998); // L: 1397
												var3.writeShort(0); // L: 1398
												NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1399
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1403
												} catch (Exception var7) { // L: 1405
												}

												++NetCache.NetCache_ioExceptions; // L: 1406
												NetCache.NetCache_socket = null; // L: 1407
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1410
										NetCache.field3982 = class136.method2931(); // L: 1411
										VerticalAlignment.js5SocketTask = null; // L: 1413
										Decimator.js5Socket = null; // L: 1414
										js5ConnectState = 0; // L: 1415
										js5Errors = 0; // L: 1416
										return; // L: 1422
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var15); // L: 1388
									NetCache.NetCache_pendingWrites.put(var15, var15.key); // L: 1389
									++NetCache.NetCache_pendingWritesCount; // L: 1390
									--NetCache.NetCache_pendingResponsesCount; // L: 1391
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var15, var15.key); // L: 1381
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1382
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1383
						}
					}
				} catch (IOException var12) { // L: 1419
					this.js5Error(-3); // L: 1420
				}

			}
		}
	} // L: 1284

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "66"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		VerticalAlignment.js5SocketTask = null; // L: 1425
		Decimator.js5Socket = null; // L: 1426
		js5ConnectState = 0; // L: 1427
		if (SecureRandomFuture.worldPort == class329.currentPort) { // L: 1428
			class329.currentPort = UserComparator9.js5Port;
		} else {
			class329.currentPort = SecureRandomFuture.worldPort; // L: 1429
		}

		++js5Errors; // L: 1430
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1431
			if (js5Errors >= 2 && var1 == 6) { // L: 1438
				this.error("js5connect_outofdate"); // L: 1439
				Decimator.updateGameState(1000); // L: 1440
			} else if (js5Errors >= 4) { // L: 1442
				if (gameState <= 5) { // L: 1443
					this.error("js5connect"); // L: 1444
					Decimator.updateGameState(1000); // L: 1445
				} else {
					field525 = 3000; // L: 1447
				}
			}
		} else if (gameState <= 5) { // L: 1432
			this.error("js5connect_full"); // L: 1433
			Decimator.updateGameState(1000); // L: 1434
		} else {
			field525 = 3000; // L: 1436
		}

	} // L: 1449

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1166216650"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1978
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1979

		try {
			if (loginState == 0) { // L: 1981
				if (class347.secureRandom == null && (secureRandomFuture.isDone() || field528 > 250)) { // L: 1982
					class347.secureRandom = secureRandomFuture.get(); // L: 1983
					secureRandomFuture.shutdown(); // L: 1984
					secureRandomFuture = null; // L: 1985
				}

				if (class347.secureRandom != null) { // L: 1987
					if (var1 != null) { // L: 1988
						((AbstractSocket)var1).close(); // L: 1989
						var1 = null; // L: 1990
					}

					DynamicObject.socketTask = null; // L: 1992
					hadNetworkError = false; // L: 1993
					field528 = 0; // L: 1994
					if (field532.method7928()) { // L: 1995
						try {
							this.method1366(class360.field4209); // L: 1997
							ModeWhere.method6099(20); // L: 1998
						} catch (Throwable var27) { // L: 2000
							Widget.RunException_sendStackTrace((String)null, var27); // L: 2001
							ScriptFrame.getLoginError(65); // L: 2002
							return; // L: 2003
						}
					} else {
						ModeWhere.method6099(1); // L: 2007
					}
				}
			}

			if (loginState == 20) { // L: 2011
				if (this.field599 != null) { // L: 2012
					if (!this.field599.isDone()) { // L: 2013
						return; // L: 2014
					}

					if (this.field599.isCancelled()) { // L: 2016
						ScriptFrame.getLoginError(65); // L: 2017
						this.field599 = null; // L: 2018
						return; // L: 2019
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.field599.get(); // L: 2022
						if (!var3.isSuccess()) { // L: 2023
							ScriptFrame.getLoginError(65); // L: 2024
							this.field599 = null; // L: 2025
							return; // L: 2026
						}

						this.field564 = var3.getToken(); // L: 2028
						this.field599 = null; // L: 2029
					} catch (Exception var26) { // L: 2031
						Widget.RunException_sendStackTrace((String)null, var26); // L: 2032
						ScriptFrame.getLoginError(65); // L: 2033
						this.field599 = null; // L: 2034
						return; // L: 2035
					}
				} else {
					if (this.field690 == null) { // L: 2038
						ScriptFrame.getLoginError(65); // L: 2059
						return; // L: 2060
					}

					if (!this.field690.method268()) { // L: 2039
						return; // L: 2040
					}

					if (this.field690.method283()) { // L: 2042
						Widget.RunException_sendStackTrace(this.field690.method271(), (Throwable)null); // L: 2043
						ScriptFrame.getLoginError(65); // L: 2044
						this.field690 = null; // L: 2045
						return; // L: 2046
					}

					class21 var30 = this.field690.method274(); // L: 2048
					if (var30.method299() != 200) { // L: 2049
						Widget.RunException_sendStackTrace("Response code: " + var30.method299() + "Response body: " + var30.method297(), (Throwable)null); // L: 2050
						ScriptFrame.getLoginError(65); // L: 2051
						this.field690 = null; // L: 2052
						return; // L: 2053
					}

					this.field564 = var30.method297(); // L: 2055
					this.field690 = null; // L: 2056
				}

				field528 = 0; // L: 2062
				ModeWhere.method6099(1); // L: 2063
			}

			if (loginState == 1) { // L: 2065
				if (DynamicObject.socketTask == null) { // L: 2066
					DynamicObject.socketTask = GameEngine.taskHandler.newSocketTask(class17.worldHost, class329.currentPort); // L: 2067
				}

				if (DynamicObject.socketTask.status == 2) { // L: 2069
					throw new IOException();
				}

				if (DynamicObject.socketTask.status == 1) { // L: 2070
					if (useBufferedSocket) { // L: 2071
						Socket var4 = (Socket)DynamicObject.socketTask.result; // L: 2073
						BufferedNetSocket var31 = new BufferedNetSocket(var4, 40000, 5000); // L: 2075
						var1 = var31; // L: 2077
					} else {
						var1 = new NetSocket((Socket)DynamicObject.socketTask.result, GameEngine.taskHandler, 5000); // L: 2080
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2082
					DynamicObject.socketTask = null; // L: 2083
					ModeWhere.method6099(2); // L: 2084
				}
			}

			PacketBufferNode var33;
			if (loginState == 2) { // L: 2087
				packetWriter.clearBuffer(); // L: 2088
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2093
					var33 = new PacketBufferNode(); // L: 2094
				} else {
					var33 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2097
				}

				var33.clientPacket = null; // L: 2100
				var33.clientPacketLength = 0; // L: 2101
				var33.packetBuffer = new PacketBuffer(5000); // L: 2102
				var33.packetBuffer.writeByte(LoginPacket.field3137.id); // L: 2106
				packetWriter.addNode(var33); // L: 2107
				packetWriter.flush(); // L: 2108
				var2.offset = 0; // L: 2109
				ModeWhere.method6099(3); // L: 2110
			}

			boolean var14;
			int var15;
			if (loginState == 3) { // L: 2112
				if (KeyHandler.pcmPlayer0 != null) { // L: 2113
					KeyHandler.pcmPlayer0.method690();
				}

				if (ViewportMouse.pcmPlayer1 != null) { // L: 2114
					ViewportMouse.pcmPlayer1.method690();
				}

				var14 = true; // L: 2115
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2116 2117
					var14 = false;
				}

				if (var14) { // L: 2119
					var15 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2120
					if (KeyHandler.pcmPlayer0 != null) { // L: 2121
						KeyHandler.pcmPlayer0.method690();
					}

					if (ViewportMouse.pcmPlayer1 != null) { // L: 2122
						ViewportMouse.pcmPlayer1.method690();
					}

					if (var15 != 0) { // L: 2123
						ScriptFrame.getLoginError(var15); // L: 2124
						return; // L: 2125
					}

					var2.offset = 0; // L: 2127
					ModeWhere.method6099(4); // L: 2128
				}
			}

			int var44;
			if (loginState == 4) { // L: 2131
				if (var2.offset < 8) { // L: 2132
					var44 = ((AbstractSocket)var1).available(); // L: 2133
					if (var44 > 8 - var2.offset) { // L: 2134
						var44 = 8 - var2.offset;
					}

					if (var44 > 0) { // L: 2135
						((AbstractSocket)var1).read(var2.array, var2.offset, var44); // L: 2136
						var2.offset += var44; // L: 2137
					}
				}

				if (var2.offset == 8) { // L: 2140
					var2.offset = 0; // L: 2141
					ServerPacket.field3129 = var2.readLong(); // L: 2142
					ModeWhere.method6099(5); // L: 2143
				}
			}

			int var7;
			int var9;
			int var17;
			if (loginState == 5) { // L: 2146
				packetWriter.packetBuffer.offset = 0; // L: 2147
				packetWriter.clearBuffer(); // L: 2148
				PacketBuffer var32 = new PacketBuffer(500); // L: 2149
				int[] var36 = new int[]{class347.secureRandom.nextInt(), class347.secureRandom.nextInt(), class347.secureRandom.nextInt(), class347.secureRandom.nextInt()}; // L: 2150 2151 2152 2153 2154
				var32.offset = 0; // L: 2155
				var32.writeByte(1); // L: 2156
				var32.writeInt(var36[0]); // L: 2157
				var32.writeInt(var36[1]); // L: 2158
				var32.writeInt(var36[2]); // L: 2159
				var32.writeInt(var36[3]); // L: 2160
				var32.writeLong(ServerPacket.field3129); // L: 2161
				if (gameState == 40) { // L: 2162
					var32.writeInt(VertexNormal.field2817[0]); // L: 2163
					var32.writeInt(VertexNormal.field2817[1]); // L: 2164
					var32.writeInt(VertexNormal.field2817[2]); // L: 2165
					var32.writeInt(VertexNormal.field2817[3]); // L: 2166
				} else {
					if (gameState == 50) { // L: 2169
						var32.writeByte(class124.field1497.rsOrdinal()); // L: 2170
						var32.writeInt(WorldMapSectionType.field2321); // L: 2171
					} else {
						var32.writeByte(field531.rsOrdinal()); // L: 2174
						switch(field531.field1493) { // L: 2175
						case 1:
							var32.offset += 4; // L: 2185
							break; // L: 2186
						case 2:
						case 3:
							var32.writeMedium(WorldMapID.field2386); // L: 2179
							++var32.offset; // L: 2180
							break; // L: 2181
						case 4:
							LinkedHashMap var6 = class131.clientPreferences.parameters; // L: 2191
							String var8 = Login.Login_username; // L: 2193
							var9 = var8.length(); // L: 2195
							int var10 = 0; // L: 2196

							for (int var11 = 0; var11 < var9; ++var11) { // L: 2197
								var10 = (var10 << 5) - var10 + var8.charAt(var11);
							}

							var32.writeInt((Integer)var6.get(var10)); // L: 2200
						}
					}

					if (field532.method7928()) { // L: 2205
						var32.writeByte(class441.field4671.rsOrdinal()); // L: 2206
						var32.writeStringCp1252NullTerminated(this.field564); // L: 2207
					} else {
						var32.writeByte(class441.field4678.rsOrdinal()); // L: 2210
						var32.writeStringCp1252NullTerminated(Login.Login_password); // L: 2211
					}
				}

				var32.encryptRsa(class67.field882, class67.field880); // L: 2214
				VertexNormal.field2817 = var36; // L: 2215
				PacketBufferNode var40;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2220
					var40 = new PacketBufferNode(); // L: 2221
				} else {
					var40 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2224
				}

				var40.clientPacket = null; // L: 2227
				var40.clientPacketLength = 0; // L: 2228
				var40.packetBuffer = new PacketBuffer(5000); // L: 2229
				var40.packetBuffer.offset = 0; // L: 2233
				if (gameState == 40) { // L: 2234
					var40.packetBuffer.writeByte(LoginPacket.field3133.id); // L: 2235
				} else {
					var40.packetBuffer.writeByte(LoginPacket.field3132.id); // L: 2238
				}

				var40.packetBuffer.writeShort(0); // L: 2240
				var7 = var40.packetBuffer.offset; // L: 2241
				var40.packetBuffer.writeInt(204); // L: 2242
				var40.packetBuffer.writeInt(1); // L: 2243
				var40.packetBuffer.writeByte(clientType); // L: 2244
				var40.packetBuffer.writeByte(field498); // L: 2245
				var40.packetBuffer.writeBytes(var32.array, 0, var32.offset); // L: 2246
				var17 = var40.packetBuffer.offset; // L: 2247
				var40.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2248
				var40.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2249
				var40.packetBuffer.writeShort(InvDefinition.canvasWidth); // L: 2250
				var40.packetBuffer.writeShort(class321.canvasHeight); // L: 2251
				PacketBuffer var18 = var40.packetBuffer; // L: 2252
				int var12;
				if (randomDatData != null) { // L: 2254
					var18.writeBytes(randomDatData, 0, randomDatData.length); // L: 2255
				} else {
					byte[] var19 = new byte[24]; // L: 2260

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 2262
						JagexCache.JagexCache_randomDat.readFully(var19); // L: 2263

						for (var12 = 0; var12 < 24 && var19[var12] == 0; ++var12) { // L: 2264 2265 2266
						}

						if (var12 >= 24) { // L: 2268
							throw new IOException();
						}
					} catch (Exception var28) {
						for (int var13 = 0; var13 < 24; ++var13) { // L: 2271
							var19[var13] = -1;
						}
					}

					var18.writeBytes(var19, 0, var19.length); // L: 2276
				}

				if (!class65.field868.endsWith(";A")) { // L: 2278
					class65.field868 = class65.field868 + ";A"; // L: 2279
				}

				var40.packetBuffer.writeStringCp1252NullTerminated(class65.field868); // L: 2281
				var40.packetBuffer.writeInt(GrandExchangeOfferOwnWorldComparator.field483); // L: 2282
				Buffer var21 = new Buffer(class263.platformInfo.size()); // L: 2283
				class263.platformInfo.write(var21); // L: 2284
				var40.packetBuffer.writeBytes(var21.array, 0, var21.array.length); // L: 2285
				var40.packetBuffer.writeByte(clientType); // L: 2286
				var40.packetBuffer.writeInt(0); // L: 2287
				var40.packetBuffer.writeInt(Message.archive11.hash); // L: 2288
				var40.packetBuffer.method7721(ApproximateRouteStrategy.archive20.hash); // L: 2289
				var40.packetBuffer.writeIntME(class291.archive14.hash); // L: 2290
				var40.packetBuffer.writeInt(class145.archive8.hash); // L: 2291
				var40.packetBuffer.writeIntME(class10.archive2.hash); // L: 2292
				var40.packetBuffer.writeIntME(ObjectSound.archive19.hash); // L: 2293
				var40.packetBuffer.method7721(0); // L: 2294
				var40.packetBuffer.method7723(class182.archive4.hash); // L: 2295
				var40.packetBuffer.writeInt(WorldMapDecorationType.archive9.hash); // L: 2296
				var40.packetBuffer.writeIntME(JagexCache.archive10.hash); // L: 2297
				var40.packetBuffer.writeInt(class166.archive13.hash); // L: 2298
				var40.packetBuffer.method7721(WorldMapRectangle.archive18.hash); // L: 2299
				var40.packetBuffer.method7721(class28.archive15.hash); // L: 2300
				var40.packetBuffer.method7723(LoginScreenAnimation.archive7.hash); // L: 2301
				var40.packetBuffer.method7723(class16.archive6.hash); // L: 2302
				var40.packetBuffer.writeInt(Players.archive5.hash); // L: 2303
				var40.packetBuffer.method7721(BufferedNetSocket.archive3.hash); // L: 2304
				var40.packetBuffer.method7723(UserComparator8.archive1.hash); // L: 2305
				var40.packetBuffer.method7721(class54.archive17.hash); // L: 2306
				var40.packetBuffer.writeIntME(KeyHandler.archive0.hash); // L: 2307
				var40.packetBuffer.writeInt(class152.archive12.hash); // L: 2308
				var40.packetBuffer.xteaEncrypt(var36, var17, var40.packetBuffer.offset); // L: 2309
				var40.packetBuffer.writeLengthShort(var40.packetBuffer.offset - var7); // L: 2310
				packetWriter.addNode(var40); // L: 2311
				packetWriter.flush(); // L: 2312
				packetWriter.isaacCipher = new IsaacCipher(var36); // L: 2313
				int[] var46 = new int[4]; // L: 2314

				for (var12 = 0; var12 < 4; ++var12) { // L: 2315
					var46[var12] = var36[var12] + 50;
				}

				var2.newIsaacCipher(var46); // L: 2316
				ModeWhere.method6099(6); // L: 2317
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2319 2320
				var44 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2321
				if (var44 == 61) { // L: 2322
					var15 = ((AbstractSocket)var1).available(); // L: 2323
					field504 = var15 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2324
					ModeWhere.method6099(5); // L: 2325
				}

				if (var44 == 21 && gameState == 20) { // L: 2327
					ModeWhere.method6099(12); // L: 2328
				} else if (var44 == 2) { // L: 2330
					ModeWhere.method6099(14); // L: 2331
				} else if (var44 == 15 && gameState == 40) { // L: 2333
					packetWriter.serverPacketLength = -1; // L: 2334
					ModeWhere.method6099(19); // L: 2335
				} else if (var44 == 64) { // L: 2337
					ModeWhere.method6099(10); // L: 2338
				} else if (var44 == 23 && field661 < 1) { // L: 2340
					++field661; // L: 2341
					ModeWhere.method6099(0); // L: 2342
				} else if (var44 == 29) { // L: 2344
					ModeWhere.method6099(17); // L: 2345
				} else {
					if (var44 != 69) { // L: 2347
						ScriptFrame.getLoginError(var44); // L: 2351
						return; // L: 2352
					}

					ModeWhere.method6099(7); // L: 2348
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2356 2357
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2358
				var2.offset = 0; // L: 2359
				VertexNormal.field2816 = var2.readUnsignedShort(); // L: 2360
				ModeWhere.method6099(8); // L: 2361
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= VertexNormal.field2816) { // L: 2364 2365
				var2.offset = 0; // L: 2366
				((AbstractSocket)var1).read(var2.array, var2.offset, VertexNormal.field2816); // L: 2367
				class6[] var34 = new class6[]{class6.field14}; // L: 2370
				class6 var38 = var34[var2.readUnsignedByte()]; // L: 2372

				try {
					switch(var38.field12) { // L: 2376
					case 0:
						class0 var5 = new class0(); // L: 2379
						this.field541 = new class7(var2, var5); // L: 2389
						ModeWhere.method6099(9); // L: 2390
						break;
					default:
						throw new IllegalArgumentException(); // L: 2384
					}
				} catch (Exception var25) { // L: 2392
					ScriptFrame.getLoginError(22); // L: 2393
					return; // L: 2394
				}
			}

			if (loginState == 9 && this.field541.method43()) { // L: 2398 2399
				this.field496 = this.field541.method45(); // L: 2400
				this.field541.method47(); // L: 2401
				this.field541 = null; // L: 2402
				if (this.field496 == null) { // L: 2403
					ScriptFrame.getLoginError(22); // L: 2404
					return; // L: 2405
				}

				packetWriter.clearBuffer(); // L: 2407
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2412
					var33 = new PacketBufferNode(); // L: 2413
				} else {
					var33 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2416
				}

				var33.clientPacket = null; // L: 2419
				var33.clientPacketLength = 0; // L: 2420
				var33.packetBuffer = new PacketBuffer(5000); // L: 2421
				var33.packetBuffer.writeByte(LoginPacket.field3134.id); // L: 2425
				var33.packetBuffer.writeShort(this.field496.offset); // L: 2426
				var33.packetBuffer.method7668(this.field496); // L: 2427
				packetWriter.addNode(var33); // L: 2428
				packetWriter.flush(); // L: 2429
				this.field496 = null; // L: 2430
				ModeWhere.method6099(6); // L: 2431
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2434 2435
				class11.field54 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2436
				ModeWhere.method6099(11); // L: 2437
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class11.field54) { // L: 2440 2441
				((AbstractSocket)var1).read(var2.array, 0, class11.field54); // L: 2442
				var2.offset = 0; // L: 2443
				ModeWhere.method6099(6); // L: 2444
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2447 2448
				field530 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2449
				ModeWhere.method6099(13); // L: 2450
			}

			if (loginState == 13) { // L: 2453
				field528 = 0; // L: 2454
				class4.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field530 / 60 + " seconds."); // L: 2455
				if (--field530 <= 0) { // L: 2456
					ModeWhere.method6099(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2459 2460
					class391.field4372 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2461
					ModeWhere.method6099(15); // L: 2462
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= class391.field4372) { // L: 2465 2466
					var14 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2467
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2468
					var2.offset = 0; // L: 2469
					boolean var45 = false; // L: 2470
					if (var14) { // L: 2471
						var15 = var2.readByteIsaac() << 24; // L: 2472
						var15 |= var2.readByteIsaac() << 16; // L: 2473
						var15 |= var2.readByteIsaac() << 8; // L: 2474
						var15 |= var2.readByteIsaac(); // L: 2475
						String var42 = Login.Login_username; // L: 2477
						var7 = var42.length(); // L: 2479
						var17 = 0; // L: 2480
						var9 = 0; // L: 2481

						while (true) {
							if (var9 >= var7) {
								if (class131.clientPreferences.parameters.size() >= 10 && !class131.clientPreferences.parameters.containsKey(var17)) { // L: 2485 2486
									Iterator var43 = class131.clientPreferences.parameters.entrySet().iterator(); // L: 2487
									var43.next(); // L: 2488
									var43.remove(); // L: 2489
								}

								class131.clientPreferences.parameters.put(var17, var15); // L: 2492
								break;
							}

							var17 = (var17 << 5) - var17 + var42.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2494
						class131.clientPreferences.method2286(Login.Login_username); // L: 2495
					} else {
						class131.clientPreferences.method2286((String)null); // L: 2498
					}

					GameEngine.savePreferences(); // L: 2500
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2501
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2502
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2503
					localPlayerIndex <<= 8; // L: 2504
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2505
					field544 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2506
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2507
					var2.offset = 0; // L: 2508
					this.field542 = var2.readLong(); // L: 2509
					if (class391.field4372 >= 29) { // L: 2510
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2511
						var2.offset = 0; // L: 2512
						field623 = var2.readLong(); // L: 2513
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2515
					var2.offset = 0; // L: 2516
					ServerPacket[] var37 = class82.ServerPacket_values(); // L: 2517
					int var23 = var2.readSmartByteShortIsaac(); // L: 2518
					if (var23 < 0 || var23 >= var37.length) { // L: 2519
						throw new IOException(var23 + " " + var2.offset);
					}

					packetWriter.serverPacket = var37[var23]; // L: 2520
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2521
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2522
					var2.offset = 0; // L: 2523
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2524

					try {
						class27.method383(class127.client, "zap"); // L: 2526
					} catch (Throwable var24) { // L: 2528
					}

					ModeWhere.method6099(16); // L: 2529
				}

				if (loginState == 16) { // L: 2532
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2533
						var2.offset = 0; // L: 2534
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2535
						timer.method6564(); // L: 2536
						Renderable.method4925(); // L: 2537
						Fonts.updatePlayer(var2); // L: 2538
						ScriptEvent.field1042 = -1; // L: 2539
						StudioGame.loadRegions(false, var2); // L: 2540
						packetWriter.serverPacket = null; // L: 2541
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2545 2546
						var2.offset = 0; // L: 2547
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2548
						var2.offset = 0; // L: 2549
						SceneTilePaint.field2826 = var2.readUnsignedShort(); // L: 2550
						ModeWhere.method6099(18); // L: 2551
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= SceneTilePaint.field2826) { // L: 2554 2555
						var2.offset = 0; // L: 2556
						((AbstractSocket)var1).read(var2.array, 0, SceneTilePaint.field2826); // L: 2557
						var2.offset = 0; // L: 2558
						String var35 = var2.readStringCp1252NullTerminated(); // L: 2559
						String var41 = var2.readStringCp1252NullTerminated(); // L: 2560
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2561
						class4.setLoginResponseString(var35, var41, var39); // L: 2562
						Decimator.updateGameState(10); // L: 2563
					}

					if (loginState == 19) { // L: 2566
						if (packetWriter.serverPacketLength == -1) { // L: 2567
							if (((AbstractSocket)var1).available() < 2) { // L: 2568
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2569
							var2.offset = 0; // L: 2570
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2571
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2573
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2574
							var2.offset = 0; // L: 2575
							var44 = packetWriter.serverPacketLength; // L: 2576
							timer.method6566(); // L: 2577
							ReflectionCheck.method1080(); // L: 2578
							Fonts.updatePlayer(var2); // L: 2579
							if (var44 != var2.offset) { // L: 2580
								throw new RuntimeException(); // L: 2581
							}
						}
					} else {
						++field528; // L: 2585
						if (field528 > 2000) { // L: 2586
							if (field661 < 1) { // L: 2587
								if (class329.currentPort == SecureRandomFuture.worldPort) { // L: 2588
									class329.currentPort = UserComparator9.js5Port;
								} else {
									class329.currentPort = SecureRandomFuture.worldPort; // L: 2589
								}

								++field661; // L: 2590
								ModeWhere.method6099(0); // L: 2591
							} else {
								ScriptFrame.getLoginError(-3); // L: 2594
							}
						}
					}
				}
			}
		} catch (IOException var29) { // L: 2598
			if (field661 < 1) { // L: 2599
				if (SecureRandomFuture.worldPort == class329.currentPort) { // L: 2600
					class329.currentPort = UserComparator9.js5Port;
				} else {
					class329.currentPort = SecureRandomFuture.worldPort; // L: 2601
				}

				++field661; // L: 2602
				ModeWhere.method6099(0); // L: 2603
			} else {
				ScriptFrame.getLoginError(-2); // L: 2606
			}
		}
	} // L: 2457 2543 2583 2592 2595 2604 2607 2609

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2996
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2997
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2998
			hadNetworkError = false; // L: 2999
			ClanChannelMember.method2868(); // L: 3000
		} else {
			if (!isMenuOpen) { // L: 3003
				ByteArrayPool.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1158(packetWriter); ++var1) { // L: 3004 3005
			}

			if (gameState == 30) { // L: 3007
				int var2;
				PacketBufferNode var14;
				while (WorldMapID.method4360()) { // L: 3008
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2963, packetWriter.isaacCipher); // L: 3009
					var14.packetBuffer.writeByte(0); // L: 3010
					var2 = var14.packetBuffer.offset; // L: 3011
					class151.performReflectionCheck(var14.packetBuffer); // L: 3012
					var14.packetBuffer.method7774(var14.packetBuffer.offset - var2); // L: 3013
					packetWriter.addNode(var14); // L: 3014
				}

				if (timer.field4179) { // L: 3016
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2935, packetWriter.isaacCipher); // L: 3018
					var14.packetBuffer.writeByte(0); // L: 3019
					var2 = var14.packetBuffer.offset; // L: 3020
					timer.write(var14.packetBuffer); // L: 3021
					var14.packetBuffer.method7774(var14.packetBuffer.offset - var2); // L: 3022
					packetWriter.addNode(var14); // L: 3023
					timer.method6580(); // L: 3024
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var10;
				int var11;
				synchronized(class120.mouseRecorder.lock) { // L: 3027
					if (!field490) { // L: 3028
						class120.mouseRecorder.index = 0; // L: 3114
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class120.mouseRecorder.index >= 40) { // L: 3029
						PacketBufferNode var15 = null; // L: 3031
						var3 = 0; // L: 3032
						var4 = 0; // L: 3033
						var5 = 0; // L: 3034
						var6 = 0; // L: 3035

						for (var7 = 0; var7 < class120.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3036 3037
							var4 = var7; // L: 3038
							int var8 = class120.mouseRecorder.ys[var7]; // L: 3039
							if (var8 < -1) { // L: 3040
								var8 = -1;
							} else if (var8 > 65534) { // L: 3041
								var8 = 65534;
							}

							int var9 = class120.mouseRecorder.xs[var7]; // L: 3042
							if (var9 < -1) { // L: 3043
								var9 = -1;
							} else if (var9 > 65534) { // L: 3044
								var9 = 65534;
							}

							if (var9 != field508 || var8 != field509) { // L: 3045
								if (var15 == null) { // L: 3048
									var15 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2965, packetWriter.isaacCipher); // L: 3049
									var15.packetBuffer.writeByte(0); // L: 3050
									var3 = var15.packetBuffer.offset; // L: 3051
									PacketBuffer var10000 = var15.packetBuffer; // L: 3052
									var10000.offset += 2;
									var5 = 0; // L: 3053
									var6 = 0; // L: 3054
								}

								int var12;
								if (field510 != -1L) { // L: 3059
									var10 = var9 - field508; // L: 3060
									var11 = var8 - field509; // L: 3061
									var12 = (int)((class120.mouseRecorder.millis[var7] - field510) / 20L); // L: 3062
									var5 = (int)((long)var5 + (class120.mouseRecorder.millis[var7] - field510) % 20L); // L: 3063
								} else {
									var10 = var9; // L: 3066
									var11 = var8; // L: 3067
									var12 = Integer.MAX_VALUE; // L: 3068
								}

								field508 = var9; // L: 3070
								field509 = var8; // L: 3071
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3072
									var10 += 32; // L: 3073
									var11 += 32; // L: 3074
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3075
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3077
									var10 += 128; // L: 3078
									var11 += 128; // L: 3079
									var15.packetBuffer.writeByte(var12 + 128); // L: 3080
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3081
								} else if (var12 < 32) { // L: 3083
									var15.packetBuffer.writeByte(var12 + 192); // L: 3084
									if (var9 != -1 && var8 != -1) { // L: 3085
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3086
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3089
									if (var9 != -1 && var8 != -1) { // L: 3090
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3091
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3093
								field510 = class120.mouseRecorder.millis[var7]; // L: 3094
							}
						}

						if (var15 != null) { // L: 3096
							var15.packetBuffer.method7774(var15.packetBuffer.offset - var3); // L: 3097
							var7 = var15.packetBuffer.offset; // L: 3098
							var15.packetBuffer.offset = var3; // L: 3099
							var15.packetBuffer.writeByte(var5 / var6); // L: 3100
							var15.packetBuffer.writeByte(var5 % var6); // L: 3101
							var15.packetBuffer.offset = var7; // L: 3102
							packetWriter.addNode(var15); // L: 3103
						}

						if (var4 >= class120.mouseRecorder.index) { // L: 3105
							class120.mouseRecorder.index = 0;
						} else {
							MouseRecorder var41 = class120.mouseRecorder; // L: 3107
							var41.index -= var4;
							System.arraycopy(class120.mouseRecorder.xs, var4, class120.mouseRecorder.xs, 0, class120.mouseRecorder.index); // L: 3108
							System.arraycopy(class120.mouseRecorder.ys, var4, class120.mouseRecorder.ys, 0, class120.mouseRecorder.index); // L: 3109
							System.arraycopy(class120.mouseRecorder.millis, var4, class120.mouseRecorder.millis, 0, class120.mouseRecorder.index); // L: 3110
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !GameBuild.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3116
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3117
					if (var16 > 32767L) { // L: 3118
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3119
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3120
					if (var3 < 0) { // L: 3121
						var3 = 0;
					} else if (var3 > class321.canvasHeight) { // L: 3122
						var3 = class321.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3123
					if (var4 < 0) { // L: 3124
						var4 = 0;
					} else if (var4 > InvDefinition.canvasWidth) { // L: 3125
						var4 = InvDefinition.canvasWidth;
					}

					var5 = (int)var16; // L: 3126
					var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2976, packetWriter.isaacCipher); // L: 3127
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3128
					var18.packetBuffer.writeShort(var4); // L: 3129
					var18.packetBuffer.writeShort(var3); // L: 3130
					packetWriter.addNode(var18); // L: 3131
				}

				if (KeyHandler.field118 > 0) { // L: 3133
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2899, packetWriter.isaacCipher); // L: 3134
					var14.packetBuffer.writeShort(0); // L: 3135
					var2 = var14.packetBuffer.offset; // L: 3136
					long var19 = class136.method2931(); // L: 3137

					for (var5 = 0; var5 < KeyHandler.field118; ++var5) { // L: 3138
						long var21 = var19 - field585; // L: 3139
						if (var21 > 16777215L) { // L: 3140
							var21 = 16777215L;
						}

						field585 = var19; // L: 3141
						var14.packetBuffer.writeByte(KeyHandler.field143[var5]); // L: 3142
						var14.packetBuffer.method7680((int)var21); // L: 3143
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3145
					packetWriter.addNode(var14); // L: 3146
				}

				if (field588 > 0) { // L: 3148
					--field588;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3149
					field589 = true;
				}

				if (field589 && field588 <= 0) { // L: 3150
					field588 = 20; // L: 3151
					field589 = false; // L: 3152
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2990, packetWriter.isaacCipher); // L: 3154
					var14.packetBuffer.method7711(camAngleY); // L: 3155
					var14.packetBuffer.writeShort(camAngleX); // L: 3156
					packetWriter.addNode(var14); // L: 3157
				}

				if (Varcs.hasFocus && !hadFocus) { // L: 3159
					hadFocus = true; // L: 3160
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2978, packetWriter.isaacCipher); // L: 3162
					var14.packetBuffer.writeByte(1); // L: 3163
					packetWriter.addNode(var14); // L: 3164
				}

				if (!Varcs.hasFocus && hadFocus) { // L: 3166
					hadFocus = false; // L: 3167
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2978, packetWriter.isaacCipher); // L: 3169
					var14.packetBuffer.writeByte(0); // L: 3170
					packetWriter.addNode(var14); // L: 3171
				}

				if (ScriptFrame.worldMap != null) { // L: 3174
					ScriptFrame.worldMap.method7215();
				}

				if (Interpreter.ClanChat_inClanChat) { // L: 3176
					if (ClientPacket.friendsChat != null) { // L: 3177
						ClientPacket.friendsChat.sort(); // L: 3178
					}

					ModeWhere.method6102(); // L: 3180
					Interpreter.ClanChat_inClanChat = false; // L: 3181
				}

				class19.method287(); // L: 3184
				if (field714 != class18.Client_plane) { // L: 3186
					field714 = class18.Client_plane; // L: 3187
					var1 = class18.Client_plane; // L: 3188
					int[] var33 = HealthBarUpdate.sceneMinimapSprite.pixels; // L: 3190
					var3 = var33.length; // L: 3191

					for (var4 = 0; var4 < var3; ++var4) { // L: 3192
						var33[var4] = 0;
					}

					for (var4 = 1; var4 < 103; ++var4) { // L: 3193
						var5 = (103 - var4) * 2048 + 24628; // L: 3194

						for (var6 = 1; var6 < 103; ++var6) { // L: 3195
							if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) { // L: 3196
								ArchiveLoader.scene.drawTileMinimap(var33, var5, 512, var1, var6, var4);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) { // L: 3197
								ArchiveLoader.scene.drawTileMinimap(var33, var5, 512, var1 + 1, var6, var4);
							}

							var5 += 4; // L: 3198
						}
					}

					var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3201
					var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3202
					HealthBarUpdate.sceneMinimapSprite.setRaster(); // L: 3203

					for (var6 = 1; var6 < 103; ++var6) { // L: 3204
						for (var7 = 1; var7 < 103; ++var7) { // L: 3205
							if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) { // L: 3206
								GrandExchangeOfferUnitPriceComparator.drawObject(var1, var7, var6, var4, var5);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) { // L: 3207
								GrandExchangeOfferUnitPriceComparator.drawObject(var1 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0; // L: 3210

					for (var6 = 0; var6 < 104; ++var6) { // L: 3211
						for (var7 = 0; var7 < 104; ++var7) { // L: 3212
							long var23 = ArchiveLoader.scene.getFloorDecorationTag(class18.Client_plane, var6, var7); // L: 3213
							if (0L != var23) { // L: 3214
								var10 = FileSystem.Entity_unpackID(var23); // L: 3215
								var11 = class146.getObjectDefinition(var10).mapIconId; // L: 3216
								if (var11 >= 0 && UserComparator7.WorldMapElement_get(var11).field1823) { // L: 3217 3218
									mapIcons[mapIconCount] = UserComparator7.WorldMapElement_get(var11).getSpriteBool(false); // L: 3221
									mapIconXs[mapIconCount] = var6; // L: 3222
									mapIconYs[mapIconCount] = var7; // L: 3223
									++mapIconCount; // L: 3224
								}
							}
						}
					}

					FontName.rasterProvider.apply(); // L: 3229
				}

				if (gameState == 30) { // L: 3233
					MenuAction.method1907(); // L: 3234
					class136.method2923(); // L: 3235
					++packetWriter.field1322; // L: 3236
					if (packetWriter.field1322 > 750) { // L: 3237
						ClanChannelMember.method2868(); // L: 3238
					} else {
						class92.method2362(); // L: 3241

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3243
							var2 = npcIndices[var1]; // L: 3244
							NPC var25 = npcs[var2]; // L: 3245
							if (var25 != null) { // L: 3246
								class149.updateActorSequence(var25, var25.definition.size); // L: 3247
							}
						}

						int[] var31 = Players.Players_indices; // L: 3252

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 3253
							Player var35 = players[var31[var2]]; // L: 3254
							if (var35 != null && var35.overheadTextCyclesRemaining > 0) { // L: 3255
								--var35.overheadTextCyclesRemaining; // L: 3256
								if (var35.overheadTextCyclesRemaining == 0) { // L: 3257
									var35.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 3260
							var3 = npcIndices[var2]; // L: 3261
							NPC var26 = npcs[var3]; // L: 3262
							if (var26 != null && var26.overheadTextCyclesRemaining > 0) { // L: 3263
								--var26.overheadTextCyclesRemaining; // L: 3264
								if (var26.overheadTextCyclesRemaining == 0) { // L: 3265
									var26.overheadText = null;
								}
							}
						}

						++field556; // L: 3269
						if (mouseCrossColor != 0) { // L: 3270
							mouseCrossState += 20; // L: 3271
							if (mouseCrossState >= 400) { // L: 3272
								mouseCrossColor = 0;
							}
						}

						if (GrandExchangeOfferAgeComparator.field4011 != null) { // L: 3274
							++field610; // L: 3275
							if (field610 >= 15) { // L: 3276
								class346.invalidateWidget(GrandExchangeOfferAgeComparator.field4011); // L: 3277
								GrandExchangeOfferAgeComparator.field4011 = null; // L: 3278
							}
						}

						Widget var32 = DevicePcmPlayerProvider.mousedOverWidgetIf1; // L: 3281
						Widget var34 = GrandExchangeOfferOwnWorldComparator.field486; // L: 3282
						DevicePcmPlayerProvider.mousedOverWidgetIf1 = null; // L: 3283
						GrandExchangeOfferOwnWorldComparator.field486 = null; // L: 3284
						draggedOnWidget = null; // L: 3285
						field687 = false; // L: 3286
						field696 = false; // L: 3287
						field731 = 0; // L: 3288

						while (SecureRandomCallable.isKeyDown() && field731 < 128) { // L: 3289
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && GameEngine.field218 == 66) { // L: 3290
								String var36 = TextureProvider.method4950(); // L: 3291
								class127.client.method452(var36); // L: 3292
							} else if (oculusOrbState != 1 || ItemComposition.field2121 <= 0) { // L: 3295
								field733[field731] = GameEngine.field218; // L: 3298
								field732[field731] = ItemComposition.field2121; // L: 3299
								++field731; // L: 3300
							}
						}

						if (class113.method2651() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3302
							var3 = GrandExchangeEvents.localPlayer.plane - mouseWheelRotation; // L: 3303
							if (var3 < 0) { // L: 3304
								var3 = 0;
							} else if (var3 > 3) { // L: 3305
								var3 = 3;
							}

							if (var3 != GrandExchangeEvents.localPlayer.plane) { // L: 3306
								StructComposition.method3619(GrandExchangeEvents.localPlayer.pathX[0] + GrandExchangeOfferOwnWorldComparator.baseX, GrandExchangeEvents.localPlayer.pathY[0] + VarcInt.baseY, var3, false); // L: 3307
							}

							mouseWheelRotation = 0; // L: 3309
						}

						if (rootInterface != -1) { // L: 3311
							Language.updateRootInterface(rootInterface, 0, 0, InvDefinition.canvasWidth, class321.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3312

						while (true) {
							Widget var27;
							ScriptEvent var37;
							Widget var38;
							do {
								var37 = (ScriptEvent)field710.removeLast(); // L: 3314
								if (var37 == null) { // L: 3315
									while (true) {
										do {
											var37 = (ScriptEvent)field711.removeLast(); // L: 3326
											if (var37 == null) { // L: 3327
												while (true) {
													do {
														var37 = (ScriptEvent)scriptEvents.removeLast(); // L: 3338
														if (var37 == null) { // L: 3339
															this.menu(); // L: 3349
															if (ScriptFrame.worldMap != null) { // L: 3351
																ScriptFrame.worldMap.method7327(class18.Client_plane, (GrandExchangeEvents.localPlayer.x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX, (GrandExchangeEvents.localPlayer.y >> 7) + VarcInt.baseY, false); // L: 3352
																ScriptFrame.worldMap.loadCache(); // L: 3353
															}

															if (clickedWidget != null) { // L: 3356
																this.method1164();
															}

															PacketBufferNode var40;
															if (class142.dragInventoryWidget != null) { // L: 3357
																class346.invalidateWidget(class142.dragInventoryWidget); // L: 3358
																++itemDragDuration; // L: 3359
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3360
																	if (field767) { // L: 3361
																		if (class142.dragInventoryWidget == GrandExchangeEvent.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3362
																			Widget var39 = class142.dragInventoryWidget; // L: 3363
																			byte var30 = 0; // L: 3364
																			if (field524 == 1 && var39.contentType == 206) { // L: 3365
																				var30 = 1;
																			}

																			if (var39.itemIds[dragItemSlotDestination] <= 0) { // L: 3366
																				var30 = 0;
																			}

																			if (ReflectionCheck.method1079(class326.getWidgetFlags(var39))) { // L: 3367
																				var5 = dragItemSlotSource; // L: 3368
																				var6 = dragItemSlotDestination; // L: 3369
																				var39.itemIds[var6] = var39.itemIds[var5]; // L: 3370
																				var39.itemQuantities[var6] = var39.itemQuantities[var5]; // L: 3371
																				var39.itemIds[var5] = -1; // L: 3372
																				var39.itemQuantities[var5] = 0; // L: 3373
																			} else if (var30 == 1) { // L: 3375
																				var5 = dragItemSlotSource; // L: 3376
																				var6 = dragItemSlotDestination; // L: 3377

																				while (var6 != var5) { // L: 3378
																					if (var5 > var6) { // L: 3379
																						var39.swapItems(var5 - 1, var5); // L: 3380
																						--var5; // L: 3381
																					} else if (var5 < var6) { // L: 3383
																						var39.swapItems(var5 + 1, var5); // L: 3384
																						++var5; // L: 3385
																					}
																				}
																			} else {
																				var39.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3390
																			}

																			var40 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2996, packetWriter.isaacCipher); // L: 3393
																			var40.packetBuffer.method7712(dragItemSlotDestination); // L: 3394
																			var40.packetBuffer.method7710(dragItemSlotSource); // L: 3395
																			var40.packetBuffer.method7721(class142.dragInventoryWidget.id); // L: 3396
																			var40.packetBuffer.method7804(var30); // L: 3397
																			packetWriter.addNode(var40); // L: 3398
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3402
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3403
																	} else if (menuOptionsCount > 0) { // L: 3405
																		UrlRequest.method2551(draggedWidgetX, draggedWidgetY); // L: 3406
																	}

																	field610 = 10; // L: 3409
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3410
																	class142.dragInventoryWidget = null; // L: 3411
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3414 3415
																	field767 = true; // L: 3416
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3421
																var3 = Scene.Scene_selectedX; // L: 3422
																var4 = Scene.Scene_selectedY; // L: 3423
																var40 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2911, packetWriter.isaacCipher); // L: 3425
																var40.packetBuffer.writeByte(5); // L: 3426
																var40.packetBuffer.method7710(var3 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 3427
																var40.packetBuffer.writeShort(var4 + VarcInt.baseY); // L: 3428
																var40.packetBuffer.method7703(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3429
																packetWriter.addNode(var40); // L: 3430
																Scene.method4771(); // L: 3431
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3432
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3433
																mouseCrossColor = 1; // L: 3434
																mouseCrossState = 0; // L: 3435
																destinationX = var3; // L: 3436
																destinationY = var4; // L: 3437
															}

															if (var32 != DevicePcmPlayerProvider.mousedOverWidgetIf1) { // L: 3439
																if (var32 != null) { // L: 3440
																	class346.invalidateWidget(var32);
																}

																if (DevicePcmPlayerProvider.mousedOverWidgetIf1 != null) { // L: 3441
																	class346.invalidateWidget(DevicePcmPlayerProvider.mousedOverWidgetIf1);
																}
															}

															if (var34 != GrandExchangeOfferOwnWorldComparator.field486 && field657 == field656) { // L: 3443
																if (var34 != null) { // L: 3444
																	class346.invalidateWidget(var34);
																}

																if (GrandExchangeOfferOwnWorldComparator.field486 != null) { // L: 3445
																	class346.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field486);
																}
															}

															if (GrandExchangeOfferOwnWorldComparator.field486 != null) { // L: 3447
																if (field656 < field657) { // L: 3448
																	++field656; // L: 3449
																	if (field656 == field657) { // L: 3450
																		class346.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field486);
																	}
																}
															} else if (field656 > 0) { // L: 3453
																--field656;
															}

															class135.method2920(); // L: 3454
															if (field754) { // L: 3455
																SpotAnimationDefinition.method3545();
															} else if (isCameraLocked) { // L: 3456
																GrandExchangeOfferOwnWorldComparator.method1128();
															}

															for (var3 = 0; var3 < 5; ++var3) { // L: 3457
																int var10002 = field600[var3]++;
															}

															class160.varcs.tryWrite(); // L: 3458
															var3 = World.method1677(); // L: 3459
															var4 = KeyHandler.KeyHandler_idleCycles; // L: 3462
															if (var3 > 15000 && var4 > 15000) { // L: 3465
																logoutTimer = 250; // L: 3466
																ClientPacket.method5176(14500); // L: 3467
																var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2979, packetWriter.isaacCipher); // L: 3469
																packetWriter.addNode(var18); // L: 3470
															}

															Decimator.friendSystem.processFriendUpdates(); // L: 3472
															++packetWriter.pendingWrites; // L: 3473
															if (packetWriter.pendingWrites > 50) { // L: 3474
																var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2950, packetWriter.isaacCipher); // L: 3476
																packetWriter.addNode(var18); // L: 3477
															}

															try {
																packetWriter.flush(); // L: 3480
															} catch (IOException var28) { // L: 3482
																ClanChannelMember.method2868(); // L: 3483
															}

															return; // L: 3485
														}

														var38 = var37.widget; // L: 3340
														if (var38.childIndex < 0) { // L: 3341
															break;
														}

														var27 = class127.getWidget(var38.parentId); // L: 3342
													} while(var27 == null || var27.children == null || var38.childIndex >= var27.children.length || var38 != var27.children[var38.childIndex]); // L: 3343

													ClanSettings.runScriptEvent(var37); // L: 3347
												}
											}

											var38 = var37.widget; // L: 3328
											if (var38.childIndex < 0) { // L: 3329
												break;
											}

											var27 = class127.getWidget(var38.parentId); // L: 3330
										} while(var27 == null || var27.children == null || var38.childIndex >= var27.children.length || var38 != var27.children[var38.childIndex]); // L: 3331

										ClanSettings.runScriptEvent(var37); // L: 3335
									}
								}

								var38 = var37.widget; // L: 3316
								if (var38.childIndex < 0) { // L: 3317
									break;
								}

								var27 = class127.getWidget(var38.parentId); // L: 3318
							} while(var27 == null || var27.children == null || var38.childIndex >= var27.children.length || var38 != var27.children[var38.childIndex]); // L: 3319

							ClanSettings.runScriptEvent(var37); // L: 3323
						}
					}
				}
			}
		}
	} // L: 3001 3239

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1620064665"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = InvDefinition.canvasWidth; // L: 4291
		int var2 = class321.canvasHeight; // L: 4292
		if (super.contentWidth < var1) { // L: 4293
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4294
		}

		if (class131.clientPreferences != null) { // L: 4295
			try {
				Client var3 = class127.client; // L: 4297
				Object[] var4 = new Object[]{getWindowedMode()}; // L: 4298
				JSObject.getWindow(var3).call("resize", var4); // L: 4301
			} catch (Throwable var5) { // L: 4304
			}
		}

	} // L: 4306

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-27115"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4309
			class115.method2680(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4310
			if (field715[var1]) { // L: 4311
				field716[var1] = true;
			}

			field717[var1] = field715[var1]; // L: 4312
			field715[var1] = false; // L: 4313
		}

		field540 = cycle; // L: 4315
		viewportX = -1; // L: 4316
		viewportY = -1; // L: 4317
		GrandExchangeEvent.hoveredItemContainer = null; // L: 4318
		if (rootInterface != -1) { // L: 4319
			rootWidgetCount = 0; // L: 4320
			class131.drawWidgets(rootInterface, 0, 0, InvDefinition.canvasWidth, class321.canvasHeight, 0, 0, -1); // L: 4321
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4323
		if (showMouseCross) { // L: 4324
			if (mouseCrossColor == 1) { // L: 4325
				class11.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4326
			}

			if (mouseCrossColor == 2) { // L: 4328
				class11.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4329
			}
		}

		if (!isMenuOpen) { // L: 4332
			if (viewportX != -1) { // L: 4333
				UrlRequester.method2537(viewportX, viewportY);
			}
		} else {
			Coord.method5531(); // L: 4335
		}

		if (gameDrawingMode == 3) { // L: 4336
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4337
				if (field717[var1]) { // L: 4338
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4339
				} else if (field716[var1]) { // L: 4341
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4342
				}
			}
		}

		var1 = class18.Client_plane; // L: 4346
		int var2 = GrandExchangeEvents.localPlayer.x; // L: 4347
		int var3 = GrandExchangeEvents.localPlayer.y; // L: 4348
		int var4 = field556; // L: 4349

		for (ObjectSound var5 = (ObjectSound)ObjectSound.objectSounds.last(); var5 != null; var5 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4351
			if (var5.soundEffectId != -1 || var5.soundEffectIds != null) { // L: 4352
				int var6 = 0; // L: 4353
				if (var2 > var5.maxX) { // L: 4354
					var6 += var2 - var5.maxX;
				} else if (var2 < var5.x) { // L: 4355
					var6 += var5.x - var2;
				}

				if (var3 > var5.maxY) { // L: 4356
					var6 += var3 - var5.maxY;
				} else if (var3 < var5.y) { // L: 4357
					var6 += var5.y - var3;
				}

				if (var6 - 64 <= var5.field814 && class131.clientPreferences.method2270() != 0 && var1 == var5.plane) { // L: 4358
					var6 -= 64; // L: 4369
					if (var6 < 0) { // L: 4370
						var6 = 0;
					}

					int var7 = (var5.field814 - var6) * class131.clientPreferences.method2270() / var5.field814; // L: 4371
					Object var10000;
					if (var5.stream1 == null) { // L: 4372
						if (var5.soundEffectId >= 0) { // L: 4373
							var10000 = null; // L: 4374
							SoundEffect var8 = SoundEffect.readSoundEffect(class182.archive4, var5.soundEffectId, 0);
							if (var8 != null) { // L: 4375
								RawSound var9 = var8.toRawSound().resample(WorldMapRectangle.decimator); // L: 4376
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7); // L: 4377
								var10.setNumLoops(-1); // L: 4378
								StructComposition.pcmStreamMixer.addSubStream(var10); // L: 4379
								var5.stream1 = var10; // L: 4380
							}
						}
					} else {
						var5.stream1.method929(var7); // L: 4384
					}

					if (var5.stream2 == null) { // L: 4385
						if (var5.soundEffectIds != null && (var5.field821 -= var4) <= 0) { // L: 4386
							int var12 = (int)(Math.random() * (double)var5.soundEffectIds.length); // L: 4387
							var10000 = null; // L: 4388
							SoundEffect var13 = SoundEffect.readSoundEffect(class182.archive4, var5.soundEffectIds[var12], 0);
							if (var13 != null) { // L: 4389
								RawSound var14 = var13.toRawSound().resample(WorldMapRectangle.decimator); // L: 4390
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7); // L: 4391
								var11.setNumLoops(0); // L: 4392
								StructComposition.pcmStreamMixer.addSubStream(var11); // L: 4393
								var5.stream2 = var11; // L: 4394
								var5.field821 = var5.field818 + (int)(Math.random() * (double)(var5.field810 - var5.field818)); // L: 4395
							}
						}
					} else {
						var5.stream2.method929(var7); // L: 4400
						if (!var5.stream2.hasNext()) { // L: 4401
							var5.stream2 = null; // L: 4402
						}
					}
				} else {
					if (var5.stream1 != null) { // L: 4359
						StructComposition.pcmStreamMixer.removeSubStream(var5.stream1); // L: 4360
						var5.stream1 = null; // L: 4361
					}

					if (var5.stream2 != null) { // L: 4363
						StructComposition.pcmStreamMixer.removeSubStream(var5.stream2); // L: 4364
						var5.stream2 = null; // L: 4365
					}
				}
			}
		}

		field556 = 0; // L: 4407
	} // L: 4408

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lcl;B)Z",
		garbageValue = "1"
	)
	final boolean method1158(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5999
		PacketBuffer var3 = var1.packetBuffer; // L: 6000
		if (var2 == null) { // L: 6001
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6003
					if (var1.field1317) { // L: 6004
						if (!var2.isAvailable(1)) { // L: 6005
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6006
						var1.field1322 = 0; // L: 6007
						var1.field1317 = false; // L: 6008
					}

					var3.offset = 0; // L: 6010
					if (var3.method7622()) { // L: 6011
						if (!var2.isAvailable(1)) { // L: 6012
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6013
						var1.field1322 = 0; // L: 6014
					}

					var1.field1317 = true; // L: 6016
					ServerPacket[] var4 = class82.ServerPacket_values(); // L: 6017
					var5 = var3.readSmartByteShortIsaac(); // L: 6018
					if (var5 < 0 || var5 >= var4.length) { // L: 6019
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6020
					var1.serverPacketLength = var1.serverPacket.length; // L: 6021
				}

				if (var1.serverPacketLength == -1) { // L: 6023
					if (!var2.isAvailable(1)) { // L: 6024
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6025
					var1.serverPacketLength = var3.array[0] & 255; // L: 6026
				}

				if (var1.serverPacketLength == -2) { // L: 6028
					if (!var2.isAvailable(2)) { // L: 6029
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6030
					var3.offset = 0; // L: 6031
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6032
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6034
					return false;
				}

				var3.offset = 0; // L: 6035
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6036
				var1.field1322 = 0; // L: 6037
				timer.method6574(); // L: 6038
				var1.field1313 = var1.field1325; // L: 6039
				var1.field1325 = var1.field1324; // L: 6040
				var1.field1324 = var1.serverPacket; // L: 6041
				if (ServerPacket.field3108 == var1.serverPacket) { // L: 6042
					ClanMate.method6700(class263.field3007); // L: 6043
					var1.serverPacket = null; // L: 6044
					return true; // L: 6045
				}

				if (ServerPacket.field3113 == var1.serverPacket) { // L: 6047
					class431.field4602 = true; // L: 6048
					WorldMapSection1.updateNpcs(false, var3); // L: 6049
					var1.serverPacket = null; // L: 6050
					return true; // L: 6051
				}

				int var20;
				if (ServerPacket.field3073 == var1.serverPacket) { // L: 6053
					for (var20 = 0; var20 < VarpDefinition.VarpDefinition_fileCount; ++var20) { // L: 6054
						VarpDefinition var84 = class134.VarpDefinition_get(var20); // L: 6055
						if (var84 != null) { // L: 6056
							Varps.Varps_temp[var20] = 0; // L: 6057
							Varps.Varps_main[var20] = 0; // L: 6058
						}
					}

					class143.method3072(); // L: 6061
					changedVarpCount += 32; // L: 6062
					var1.serverPacket = null; // L: 6063
					return true; // L: 6064
				}

				if (ServerPacket.field3120 == var1.serverPacket) { // L: 6066
					Decimator.friendSystem.method1726(); // L: 6067
					field701 = cycleCntr; // L: 6068
					var1.serverPacket = null; // L: 6069
					return true; // L: 6070
				}

				if (ServerPacket.field3040 == var1.serverPacket) { // L: 6072
					var20 = var3.readInt(); // L: 6073
					InterfaceParent var82 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6074
					if (var82 != null) { // L: 6075
						Script.closeInterface(var82, true);
					}

					if (meslayerContinueWidget != null) { // L: 6076
						class346.invalidateWidget(meslayerContinueWidget); // L: 6077
						meslayerContinueWidget = null; // L: 6078
					}

					var1.serverPacket = null; // L: 6080
					return true; // L: 6081
				}

				Widget var60;
				if (ServerPacket.field3071 == var1.serverPacket) { // L: 6083
					var20 = var3.method7714(); // L: 6084
					var5 = var3.method7715(); // L: 6085
					var6 = var3.method7827(); // L: 6086
					var60 = class127.getWidget(var6); // L: 6087
					var60.field3392 = var5 + (var20 << 16); // L: 6088
					var1.serverPacket = null; // L: 6089
					return true; // L: 6090
				}

				if (ServerPacket.field3090 == var1.serverPacket) { // L: 6092
					ClanMate.method6700(class263.field3011); // L: 6093
					var1.serverPacket = null; // L: 6094
					return true; // L: 6095
				}

				if (ServerPacket.field3055 == var1.serverPacket) { // L: 6097
					class29.field181 = var3.method7875(); // L: 6098
					PlayerComposition.field3307 = var3.method7742(); // L: 6099
					var1.serverPacket = null; // L: 6100
					return true; // L: 6101
				}

				if (ServerPacket.field3024 == var1.serverPacket) { // L: 6103
					var20 = var3.method7837(); // L: 6104
					var5 = var3.readShort(); // L: 6105
					var6 = var3.method7716(); // L: 6106
					var60 = class127.getWidget(var20); // L: 6107
					if (var5 != var60.rawX || var6 != var60.rawY || var60.xAlignment != 0 || var60.yAlignment != 0) { // L: 6108
						var60.rawX = var5; // L: 6109
						var60.rawY = var6; // L: 6110
						var60.xAlignment = 0; // L: 6111
						var60.yAlignment = 0; // L: 6112
						class346.invalidateWidget(var60); // L: 6113
						this.alignWidget(var60); // L: 6114
						if (var60.type == 0) { // L: 6115
							AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var20 >> 16], var60, false);
						}
					}

					var1.serverPacket = null; // L: 6117
					return true; // L: 6118
				}

				if (ServerPacket.field3104 == var1.serverPacket) { // L: 6120
					isCameraLocked = true; // L: 6121
					field754 = false; // L: 6122
					class286.field3274 = var3.readUnsignedByte(); // L: 6123
					class54.field447 = var3.readUnsignedByte(); // L: 6124
					BZip2State.field4662 = var3.readUnsignedShort(); // L: 6125
					Script.field955 = var3.readUnsignedByte(); // L: 6126
					ArchiveDisk.field4309 = var3.readUnsignedByte(); // L: 6127
					if (ArchiveDisk.field4309 >= 100) { // L: 6128
						WorldMapLabelSize.cameraX = class286.field3274 * 128 + 64; // L: 6129
						class154.cameraZ = class54.field447 * 128 + 64; // L: 6130
						ItemContainer.cameraY = WorldMapLabel.getTileHeight(WorldMapLabelSize.cameraX, class154.cameraZ, class18.Client_plane) - BZip2State.field4662; // L: 6131
					}

					var1.serverPacket = null; // L: 6133
					return true; // L: 6134
				}

				if (ServerPacket.field3066 == var1.serverPacket) { // L: 6136
					ClanMate.method6700(class263.field3009); // L: 6137
					var1.serverPacket = null; // L: 6138
					return true; // L: 6139
				}

				String var52;
				if (ServerPacket.field3030 == var1.serverPacket) { // L: 6141
					var52 = var3.readStringCp1252NullTerminated(); // L: 6142
					var21 = AbstractFont.escapeBrackets(MouseHandler.method584(class193.method3883(var3))); // L: 6143
					Actor.addGameMessage(6, var52, var21); // L: 6144
					var1.serverPacket = null; // L: 6145
					return true; // L: 6146
				}

				if (ServerPacket.field3114 == var1.serverPacket) { // L: 6148
					class29.field181 = var3.method7875(); // L: 6149
					PlayerComposition.field3307 = var3.readUnsignedByte(); // L: 6150

					for (var20 = PlayerComposition.field3307; var20 < PlayerComposition.field3307 + 8; ++var20) { // L: 6151
						for (var5 = class29.field181; var5 < class29.field181 + 8; ++var5) { // L: 6152
							if (groundItems[class18.Client_plane][var20][var5] != null) { // L: 6153
								groundItems[class18.Client_plane][var20][var5] = null; // L: 6154
								UserComparator3.updateItemPile(var20, var5); // L: 6155
							}
						}
					}

					for (PendingSpawn var54 = (PendingSpawn)pendingSpawns.last(); var54 != null; var54 = (PendingSpawn)pendingSpawns.previous()) { // L: 6159 6160 6162
						if (var54.x >= PlayerComposition.field3307 && var54.x < PlayerComposition.field3307 + 8 && var54.y >= class29.field181 && var54.y < class29.field181 + 8 && var54.plane == class18.Client_plane) { // L: 6161
							var54.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6164
					return true; // L: 6165
				}

				int var8;
				int var11;
				int var22;
				int var61;
				int var62;
				if (ServerPacket.field3123 == var1.serverPacket) { // L: 6167
					var6 = var3.method7752(); // L: 6176
					var20 = var6 >> 16; // L: 6177
					var5 = var6 >> 8 & 255; // L: 6178
					var22 = var20 + (var6 >> 4 & 7); // L: 6179
					var8 = var5 + (var6 & 7); // L: 6180
					var62 = var3.readUnsignedByte(); // L: 6181
					var11 = var3.readUnsignedShort(); // L: 6182
					var61 = var3.method7715(); // L: 6183
					if (var22 >= 0 && var8 >= 0 && var22 < 104 && var8 < 104) { // L: 6184
						var22 = var22 * 128 + 64; // L: 6185
						var8 = var8 * 128 + 64; // L: 6186
						GraphicsObject var64 = new GraphicsObject(var61, class18.Client_plane, var22, var8, WorldMapLabel.getTileHeight(var22, var8, class18.Client_plane) - var62, var11, cycle); // L: 6187
						graphicsObjects.addFirst(var64); // L: 6188
					}

					var1.serverPacket = null; // L: 6190
					return true; // L: 6191
				}

				Widget var74;
				if (ServerPacket.field3052 == var1.serverPacket) { // L: 6193
					var20 = var3.readInt(); // L: 6194
					var5 = var3.method7717(); // L: 6195
					var74 = class127.getWidget(var20); // L: 6196
					if (var5 != var74.sequenceId || var5 == -1) { // L: 6197
						var74.sequenceId = var5; // L: 6198
						var74.modelFrame = 0; // L: 6199
						var74.modelFrameCycle = 0; // L: 6200
						class346.invalidateWidget(var74); // L: 6201
					}

					var1.serverPacket = null; // L: 6203
					return true; // L: 6204
				}

				int var13;
				int var15;
				int var24;
				if (ServerPacket.field3122 == var1.serverPacket) { // L: 6206
					var6 = var3.method7752(); // L: 6217
					var20 = var6 >> 16; // L: 6218
					var5 = var6 >> 8 & 255; // L: 6219
					var22 = var20 + (var6 >> 4 & 7); // L: 6220
					var8 = var5 + (var6 & 7); // L: 6221
					var61 = var3.method7875(); // L: 6222
					var62 = var61 >> 2; // L: 6223
					var11 = var61 & 3; // L: 6224
					var24 = field748[var62]; // L: 6225
					var13 = var3.readUnsignedShort(); // L: 6226
					if (var22 >= 0 && var8 >= 0 && var22 < 103 && var8 < 103) { // L: 6227
						if (var24 == 0) { // L: 6228
							BoundaryObject var69 = ArchiveLoader.scene.method4754(class18.Client_plane, var22, var8); // L: 6229
							if (var69 != null) { // L: 6230
								var15 = FileSystem.Entity_unpackID(var69.tag); // L: 6231
								if (var62 == 2) { // L: 6232
									var69.renderable1 = new DynamicObject(var15, 2, var11 + 4, class18.Client_plane, var22, var8, var13, false, var69.renderable1); // L: 6233
									var69.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, class18.Client_plane, var22, var8, var13, false, var69.renderable2); // L: 6234
								} else {
									var69.renderable1 = new DynamicObject(var15, var62, var11, class18.Client_plane, var22, var8, var13, false, var69.renderable1); // L: 6236
								}
							}
						} else if (var24 == 1) { // L: 6239
							WallDecoration var68 = ArchiveLoader.scene.method4860(class18.Client_plane, var22, var8); // L: 6240
							if (var68 != null) { // L: 6241
								var15 = FileSystem.Entity_unpackID(var68.tag); // L: 6242
								if (var62 != 4 && var62 != 5) { // L: 6243
									if (var62 == 6) { // L: 6246
										var68.renderable1 = new DynamicObject(var15, 4, var11 + 4, class18.Client_plane, var22, var8, var13, false, var68.renderable1); // L: 6247
									} else if (var62 == 7) { // L: 6249
										var68.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class18.Client_plane, var22, var8, var13, false, var68.renderable1); // L: 6250
									} else if (var62 == 8) { // L: 6252
										var68.renderable1 = new DynamicObject(var15, 4, var11 + 4, class18.Client_plane, var22, var8, var13, false, var68.renderable1); // L: 6253
										var68.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class18.Client_plane, var22, var8, var13, false, var68.renderable2); // L: 6254
									}
								} else {
									var68.renderable1 = new DynamicObject(var15, 4, var11, class18.Client_plane, var22, var8, var13, false, var68.renderable1); // L: 6244
								}
							}
						} else if (var24 == 2) { // L: 6258
							GameObject var66 = ArchiveLoader.scene.getGameObject(class18.Client_plane, var22, var8); // L: 6259
							if (var62 == 11) { // L: 6260
								var62 = 10; // L: 6261
							}

							if (var66 != null) { // L: 6263
								var66.renderable = new DynamicObject(FileSystem.Entity_unpackID(var66.tag), var62, var11, class18.Client_plane, var22, var8, var13, false, var66.renderable); // L: 6264
							}
						} else if (var24 == 3) { // L: 6267
							FloorDecoration var67 = ArchiveLoader.scene.getFloorDecoration(class18.Client_plane, var22, var8); // L: 6268
							if (var67 != null) { // L: 6269
								var67.renderable = new DynamicObject(FileSystem.Entity_unpackID(var67.tag), 22, var11, class18.Client_plane, var22, var8, var13, false, var67.renderable); // L: 6270
							}
						}
					}

					var1.serverPacket = null; // L: 6274
					return true; // L: 6275
				}

				if (ServerPacket.field3119 == var1.serverPacket) { // L: 6277
					publicChatMode = var3.method7742(); // L: 6278
					tradeChatMode = var3.method7875(); // L: 6279
					var1.serverPacket = null; // L: 6280
					return true; // L: 6281
				}

				if (ServerPacket.field3101 == var1.serverPacket) { // L: 6283
					var20 = var3.readUnsignedByte(); // L: 6284
					Tile.method4603(var20); // L: 6285
					var1.serverPacket = null; // L: 6286
					return true; // L: 6287
				}

				if (ServerPacket.field3051 == var1.serverPacket) { // L: 6289
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6290
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) { // L: 6291
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6292
							WorldMapLabel.changeGameOptions(var20); // L: 6293
							changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6294
						}
					}

					var1.serverPacket = null; // L: 6297
					return true; // L: 6298
				}

				if (ServerPacket.field3048 == var1.serverPacket) { // L: 6300
					var20 = var3.method7715(); // L: 6301
					if (var20 == 65535) { // L: 6302
						var20 = -1;
					}

					SoundCache.playSong(var20); // L: 6303
					var1.serverPacket = null; // L: 6304
					return true; // L: 6305
				}

				if (ServerPacket.field3045 == var1.serverPacket) { // L: 6307
					var20 = var3.method7793(); // L: 6308
					var5 = var3.method7715(); // L: 6309
					if (var5 == 65535) { // L: 6310
						var5 = -1;
					}

					Players.method2419(var5, var20); // L: 6311
					var1.serverPacket = null; // L: 6312
					return true; // L: 6313
				}

				if (ServerPacket.field3094 == var1.serverPacket) { // L: 6315
					HorizontalAlignment.field1885 = null; // L: 6316
					var1.serverPacket = null; // L: 6317
					return true; // L: 6318
				}

				if (ServerPacket.field3031 == var1.serverPacket) { // L: 6320
					var20 = var3.method7827(); // L: 6321
					var5 = var3.readUnsignedShort(); // L: 6322
					Varps.Varps_temp[var5] = var20; // L: 6323
					if (Varps.Varps_main[var5] != var20) { // L: 6324
						Varps.Varps_main[var5] = var20; // L: 6325
					}

					WorldMapLabel.changeGameOptions(var5); // L: 6327
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6328
					var1.serverPacket = null; // L: 6329
					return true; // L: 6330
				}

				if (ServerPacket.field3080 == var1.serverPacket) { // L: 6332
					HorizontalAlignment.field1885 = new class391(DirectByteArrayCopier.HitSplatDefinition_cached); // L: 6333
					var1.serverPacket = null; // L: 6334
					return true; // L: 6335
				}

				if (ServerPacket.field3036 == var1.serverPacket) { // L: 6337
					ClanMate.method6700(class263.field3012); // L: 6338
					var1.serverPacket = null; // L: 6339
					return true; // L: 6340
				}

				if (ServerPacket.field3074 == var1.serverPacket) { // L: 6342
					var20 = var3.readInt(); // L: 6343
					var5 = var3.readUnsignedShort(); // L: 6344
					if (var20 < -70000) { // L: 6345
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6347
						var74 = class127.getWidget(var20);
					} else {
						var74 = null; // L: 6348
					}

					if (var74 != null) { // L: 6349
						for (var22 = 0; var22 < var74.itemIds.length; ++var22) { // L: 6350
							var74.itemIds[var22] = 0; // L: 6351
							var74.itemQuantities[var22] = 0; // L: 6352
						}
					}

					WorldMapSection1.clearItemContainer(var5); // L: 6355
					var22 = var3.readUnsignedShort(); // L: 6356

					for (var8 = 0; var8 < var22; ++var8) { // L: 6357
						var61 = var3.readUnsignedShort(); // L: 6358
						var62 = var3.method7875(); // L: 6359
						if (var62 == 255) { // L: 6360
							var62 = var3.readInt();
						}

						if (var74 != null && var8 < var74.itemIds.length) { // L: 6361 6362
							var74.itemIds[var8] = var61; // L: 6363
							var74.itemQuantities[var8] = var62; // L: 6364
						}

						ChatChannel.itemContainerSetItem(var5, var8, var61 - 1, var62); // L: 6367
					}

					if (var74 != null) { // L: 6369
						class346.invalidateWidget(var74);
					}

					class143.method3072(); // L: 6370
					changedItemContainers[++field695 - 1 & 31] = var5 & 32767; // L: 6371
					var1.serverPacket = null; // L: 6372
					return true; // L: 6373
				}

				if (ServerPacket.field3058 == var1.serverPacket) { // L: 6375
					var52 = var3.readStringCp1252NullTerminated(); // L: 6376
					Object[] var79 = new Object[var52.length() + 1]; // L: 6377

					for (var6 = var52.length() - 1; var6 >= 0; --var6) { // L: 6378
						if (var52.charAt(var6) == 's') { // L: 6379
							var79[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var79[var6 + 1] = new Integer(var3.readInt()); // L: 6380
						}
					}

					var79[0] = new Integer(var3.readInt()); // L: 6382
					ScriptEvent var88 = new ScriptEvent(); // L: 6383
					var88.args = var79; // L: 6384
					ClanSettings.runScriptEvent(var88); // L: 6385
					var1.serverPacket = null; // L: 6386
					return true; // L: 6387
				}

				if (ServerPacket.field3110 == var1.serverPacket) { // L: 6389
					var20 = var3.method7837(); // L: 6390
					var5 = var3.method7714(); // L: 6391
					var74 = class127.getWidget(var20); // L: 6392
					if (var74 != null && var74.type == 0) { // L: 6393
						if (var5 > var74.scrollHeight - var74.height) { // L: 6394
							var5 = var74.scrollHeight - var74.height;
						}

						if (var5 < 0) { // L: 6395
							var5 = 0;
						}

						if (var5 != var74.scrollY) { // L: 6396
							var74.scrollY = var5; // L: 6397
							class346.invalidateWidget(var74); // L: 6398
						}
					}

					var1.serverPacket = null; // L: 6401
					return true; // L: 6402
				}

				if (ServerPacket.field3091 == var1.serverPacket) { // L: 6404
					if (rootInterface != -1) { // L: 6405
						MouseRecorder.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6406
					return true; // L: 6407
				}

				if (ServerPacket.field3061 == var1.serverPacket) { // L: 6409
					class431.field4602 = true; // L: 6410
					WorldMapSection1.updateNpcs(true, var3); // L: 6411
					var1.serverPacket = null; // L: 6412
					return true; // L: 6413
				}

				if (ServerPacket.field3085 == var1.serverPacket) { // L: 6415
					isCameraLocked = false; // L: 6416

					for (var20 = 0; var20 < 5; ++var20) { // L: 6417
						field546[var20] = false;
					}

					var1.serverPacket = null; // L: 6418
					return true; // L: 6419
				}

				String var23;
				boolean var56;
				if (ServerPacket.field3062 == var1.serverPacket) { // L: 6421
					var20 = var3.readUShortSmart(); // L: 6422
					var56 = var3.readUnsignedByte() == 1; // L: 6423
					var23 = ""; // L: 6424
					boolean var85 = false; // L: 6425
					if (var56) { // L: 6426
						var23 = var3.readStringCp1252NullTerminated(); // L: 6427
						if (Decimator.friendSystem.isIgnored(new Username(var23, class122.loginType))) { // L: 6428
							var85 = true;
						}
					}

					String var86 = var3.readStringCp1252NullTerminated(); // L: 6430
					if (!var85) { // L: 6431
						Actor.addGameMessage(var20, var23, var86);
					}

					var1.serverPacket = null; // L: 6432
					return true; // L: 6433
				}

				if (ServerPacket.field3112 == var1.serverPacket) { // L: 6435
					class119.method2760(var3.readStringCp1252NullTerminated()); // L: 6436
					var1.serverPacket = null; // L: 6437
					return true; // L: 6438
				}

				if (ServerPacket.field3107 == var1.serverPacket) { // L: 6440
					if (var1.serverPacketLength == 0) { // L: 6441
						ClientPacket.friendsChat = null; // L: 6442
					} else {
						if (ClientPacket.friendsChat == null) { // L: 6445
							ClientPacket.friendsChat = new FriendsChat(class122.loginType, class127.client); // L: 6446
						}

						ClientPacket.friendsChat.readUpdate(var3); // L: 6448
					}

					SecureRandomCallable.method2050(); // L: 6450
					var1.serverPacket = null; // L: 6451
					return true; // L: 6452
				}

				if (ServerPacket.field3032 == var1.serverPacket) { // L: 6454
					ClanMate.method6700(class263.field3013); // L: 6455
					var1.serverPacket = null; // L: 6456
					return true; // L: 6457
				}

				if (ServerPacket.field3037 == var1.serverPacket) { // L: 6459
					var20 = var3.method7705(); // L: 6460
					var21 = var3.readStringCp1252NullTerminated(); // L: 6461
					var74 = class127.getWidget(var20); // L: 6462
					if (!var21.equals(var74.text)) { // L: 6463
						var74.text = var21; // L: 6464
						class346.invalidateWidget(var74); // L: 6465
					}

					var1.serverPacket = null; // L: 6467
					return true; // L: 6468
				}

				if (ServerPacket.field3128 == var1.serverPacket) { // L: 6470
					hintArrowType = var3.readUnsignedByte(); // L: 6471
					if (hintArrowType == 1) { // L: 6472
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6473
						if (hintArrowType == 2) { // L: 6474
							hintArrowSubX = 64; // L: 6475
							hintArrowSubY = 64; // L: 6476
						}

						if (hintArrowType == 3) { // L: 6478
							hintArrowSubX = 0; // L: 6479
							hintArrowSubY = 64; // L: 6480
						}

						if (hintArrowType == 4) { // L: 6482
							hintArrowSubX = 128; // L: 6483
							hintArrowSubY = 64; // L: 6484
						}

						if (hintArrowType == 5) { // L: 6486
							hintArrowSubX = 64; // L: 6487
							hintArrowSubY = 0; // L: 6488
						}

						if (hintArrowType == 6) { // L: 6490
							hintArrowSubX = 64; // L: 6491
							hintArrowSubY = 128; // L: 6492
						}

						hintArrowType = 2; // L: 6494
						hintArrowX = var3.readUnsignedShort(); // L: 6495
						hintArrowY = var3.readUnsignedShort(); // L: 6496
						hintArrowHeight = var3.readUnsignedByte(); // L: 6497
					}

					if (hintArrowType == 10) { // L: 6499
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6500
					return true; // L: 6501
				}

				if (ServerPacket.field3063 == var1.serverPacket) { // L: 6503
					ClanMate.method6700(class263.field3004); // L: 6504
					var1.serverPacket = null; // L: 6505
					return true; // L: 6506
				}

				if (ServerPacket.field3057 == var1.serverPacket) { // L: 6508
					World var53 = new World(); // L: 6509
					var53.host = var3.readStringCp1252NullTerminated(); // L: 6510
					var53.id = var3.readUnsignedShort(); // L: 6511
					var5 = var3.readInt(); // L: 6512
					var53.properties = var5; // L: 6513
					Decimator.updateGameState(45); // L: 6514
					var2.close(); // L: 6515
					var2 = null; // L: 6516
					PlatformInfo.changeWorld(var53); // L: 6517
					var1.serverPacket = null; // L: 6518
					return false; // L: 6519
				}

				if (ServerPacket.field3081 == var1.serverPacket) { // L: 6521
					minimapState = var3.readUnsignedByte(); // L: 6522
					var1.serverPacket = null; // L: 6523
					return true; // L: 6524
				}

				if (ServerPacket.field3077 == var1.serverPacket) { // L: 6526
					var20 = var3.readUnsignedByte(); // L: 6527
					var5 = var3.readUnsignedByte(); // L: 6528
					var6 = var3.readUnsignedByte(); // L: 6529
					var22 = var3.readUnsignedByte(); // L: 6530
					field546[var20] = true; // L: 6531
					field756[var20] = var5; // L: 6532
					field636[var20] = var6; // L: 6533
					field674[var20] = var22; // L: 6534
					field600[var20] = 0; // L: 6535
					var1.serverPacket = null; // L: 6536
					return true; // L: 6537
				}

				if (ServerPacket.field3075 == var1.serverPacket) { // L: 6539
					class143.method3072(); // L: 6540
					weight = var3.readShort(); // L: 6541
					field707 = cycleCntr; // L: 6542
					var1.serverPacket = null; // L: 6543
					return true; // L: 6544
				}

				byte var72;
				if (ServerPacket.field3043 == var1.serverPacket) { // L: 6546
					field755 = cycleCntr; // L: 6547
					var72 = var3.readByte(); // L: 6548
					class145 var77 = new class145(var3); // L: 6549
					ClanChannel var87;
					if (var72 >= 0) { // L: 6551
						var87 = currentClanChannels[var72];
					} else {
						var87 = class21.guestClanChannel; // L: 6552
					}

					var77.method3086(var87); // L: 6553
					var1.serverPacket = null; // L: 6554
					return true; // L: 6555
				}

				NPC var57;
				if (ServerPacket.field3121 == var1.serverPacket) { // L: 6557
					var6 = var3.method7773(); // L: 6561
					var20 = var3.method7715(); // L: 6562
					var5 = var3.method7714(); // L: 6563
					if (var5 == 65535) { // L: 6564
						var5 = -1; // L: 6565
					}

					var57 = npcs[var20]; // L: 6567
					if (var57 != null) { // L: 6568
						if (var5 == var57.sequence && var5 != -1) { // L: 6569
							var8 = class163.SequenceDefinition_get(var5).field2161; // L: 6570
							if (var8 == 1) { // L: 6571
								var57.sequenceFrame = 0; // L: 6572
								var57.sequenceFrameCycle = 0; // L: 6573
								var57.sequenceDelay = var6; // L: 6574
								var57.field1152 = 0; // L: 6575
							} else if (var8 == 2) { // L: 6577
								var57.field1152 = 0; // L: 6578
							}
						} else if (var5 == -1 || var57.sequence == -1 || class163.SequenceDefinition_get(var5).field2155 >= class163.SequenceDefinition_get(var57.sequence).field2155) { // L: 6581
							var57.sequence = var5; // L: 6582
							var57.sequenceFrame = 0; // L: 6583
							var57.sequenceFrameCycle = 0; // L: 6584
							var57.sequenceDelay = var6; // L: 6585
							var57.field1152 = 0; // L: 6586
							var57.field1170 = var57.pathLength; // L: 6587
						}
					}

					var1.serverPacket = null; // L: 6591
					return true; // L: 6592
				}

				if (ServerPacket.field3042 == var1.serverPacket) { // L: 6594
					class426.method7546(); // L: 6595
					var72 = var3.readByte(); // L: 6596
					class131 var75 = new class131(var3); // L: 6597
					ClanSettings var83;
					if (var72 >= 0) { // L: 6599
						var83 = currentClanSettings[var72];
					} else {
						var83 = class154.guestClanSettings; // L: 6600
					}

					var75.method2873(var83); // L: 6601
					var1.serverPacket = null; // L: 6602
					return true; // L: 6603
				}

				if (ServerPacket.field3083 == var1.serverPacket) { // L: 6605
					var20 = var3.readUnsignedByte(); // L: 6606
					var21 = var3.readStringCp1252NullTerminated(); // L: 6607
					var6 = var3.method7875(); // L: 6608
					if (var20 >= 1 && var20 <= 8) { // L: 6609
						if (var21.equalsIgnoreCase("null")) { // L: 6610
							var21 = null;
						}

						playerMenuActions[var20 - 1] = var21; // L: 6611
						playerOptionsPriorities[var20 - 1] = var6 == 0; // L: 6612
					}

					var1.serverPacket = null; // L: 6614
					return true; // L: 6615
				}

				if (ServerPacket.field3096 == var1.serverPacket) { // L: 6617
					ClanMate.method6700(class263.field3005); // L: 6618
					var1.serverPacket = null; // L: 6619
					return true; // L: 6620
				}

				long var26;
				long var28;
				long var30;
				String var32;
				int var33;
				if (ServerPacket.field3067 == var1.serverPacket) { // L: 6622
					var72 = var3.readByte(); // L: 6623
					var26 = (long)var3.readUnsignedShort(); // L: 6624
					var28 = (long)var3.readMedium(); // L: 6625
					var30 = (var26 << 32) + var28; // L: 6626
					boolean var63 = false; // L: 6627
					ClanChannel var12 = var72 >= 0 ? currentClanChannels[var72] : class21.guestClanChannel; // L: 6628
					if (var12 == null) { // L: 6629
						var63 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6631
							if (var30 == crossWorldMessageIds[var13]) { // L: 6632
								var63 = true; // L: 6633
								break; // L: 6634
							}
						}
					}

					if (!var63) { // L: 6638
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var30; // L: 6639
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6640
						var32 = class193.method3883(var3); // L: 6641
						var33 = var72 >= 0 ? 43 : 46; // L: 6642
						class301.addChatMessage(var33, "", var32, var12.name); // L: 6643
					}

					var1.serverPacket = null; // L: 6645
					return true; // L: 6646
				}

				InterfaceParent var7;
				long var35;
				if (ServerPacket.field3068 == var1.serverPacket) { // L: 6648
					var20 = var3.offset + var1.serverPacketLength; // L: 6649
					var5 = var3.readUnsignedShort(); // L: 6650
					var6 = var3.readUnsignedShort(); // L: 6651
					if (var5 != rootInterface) { // L: 6652
						rootInterface = var5; // L: 6653
						this.resizeRoot(false); // L: 6654
						class29.Widget_resetModelFrames(rootInterface); // L: 6655
						class145.runWidgetOnLoadListener(rootInterface); // L: 6656

						for (var22 = 0; var22 < 100; ++var22) { // L: 6657
							field715[var22] = true;
						}
					}

					InterfaceParent var91;
					for (; var6-- > 0; var91.field1028 = true) { // L: 6659 6669
						var22 = var3.readInt(); // L: 6660
						var8 = var3.readUnsignedShort(); // L: 6661
						var61 = var3.readUnsignedByte(); // L: 6662
						var91 = (InterfaceParent)interfaceParents.get((long)var22); // L: 6663
						if (var91 != null && var8 != var91.group) { // L: 6664
							Script.closeInterface(var91, true); // L: 6665
							var91 = null; // L: 6666
						}

						if (var91 == null) { // L: 6668
							var91 = class4.method16(var22, var8, var61);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) { // L: 6671
						if (var7.field1028) { // L: 6672
							var7.field1028 = false;
						} else {
							Script.closeInterface(var7, true); // L: 6674
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6677

					while (var3.offset < var20) { // L: 6678
						var22 = var3.readInt(); // L: 6679
						var8 = var3.readUnsignedShort(); // L: 6680
						var61 = var3.readUnsignedShort(); // L: 6681
						var62 = var3.readInt(); // L: 6682

						for (var11 = var8; var11 <= var61; ++var11) { // L: 6683
							var35 = (long)var11 + ((long)var22 << 32); // L: 6684
							widgetFlags.put(new IntegerNode(var62), var35); // L: 6685
						}
					}

					var1.serverPacket = null; // L: 6688
					return true; // L: 6689
				}

				if (ServerPacket.field3025 == var1.serverPacket) { // L: 6691
					GameEngine.privateChatMode = class166.method3343(var3.readUnsignedByte()); // L: 6692
					var1.serverPacket = null; // L: 6693
					return true; // L: 6694
				}

				if (ServerPacket.field3026 == var1.serverPacket) { // L: 6696
					WorldMapSection1.updateNpcs(true, var3); // L: 6697
					var1.serverPacket = null; // L: 6698
					return true; // L: 6699
				}

				Widget var25;
				if (ServerPacket.field3097 == var1.serverPacket) { // L: 6701
					var20 = var3.method7705(); // L: 6702
					var5 = var3.method7827(); // L: 6703
					InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6704
					var7 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6705
					if (var7 != null) { // L: 6706
						Script.closeInterface(var7, var81 == null || var7.group != var81.group);
					}

					if (var81 != null) { // L: 6707
						var81.remove(); // L: 6708
						interfaceParents.put(var81, (long)var5); // L: 6709
					}

					var25 = class127.getWidget(var20); // L: 6711
					if (var25 != null) { // L: 6712
						class346.invalidateWidget(var25);
					}

					var25 = class127.getWidget(var5); // L: 6713
					if (var25 != null) { // L: 6714
						class346.invalidateWidget(var25); // L: 6715
						AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var25.id >>> 16], var25, true); // L: 6716
					}

					if (rootInterface != -1) { // L: 6718
						MouseRecorder.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6719
					return true; // L: 6720
				}

				if (ServerPacket.field3093 == var1.serverPacket) { // L: 6722
					ClanMate.method6700(class263.field3015); // L: 6723
					var1.serverPacket = null; // L: 6724
					return true; // L: 6725
				}

				if (ServerPacket.field3116 == var1.serverPacket) { // L: 6727
					var20 = var3.readInt(); // L: 6728
					if (var20 != field586) { // L: 6729
						field586 = var20; // L: 6730
						ObjectSound.method1757(); // L: 6731
					}

					var1.serverPacket = null; // L: 6733
					return true; // L: 6734
				}

				if (ServerPacket.field3082 == var1.serverPacket) { // L: 6736
					AbstractWorldMapData.readReflectionCheck(var3, var1.serverPacketLength); // L: 6737
					var1.serverPacket = null; // L: 6738
					return true; // L: 6739
				}

				boolean var78;
				if (ServerPacket.field3027 == var1.serverPacket) { // L: 6741
					var78 = var3.readBoolean(); // L: 6742
					if (var78) { // L: 6743
						if (VarcInt.field1841 == null) { // L: 6744
							VarcInt.field1841 = new class326();
						}
					} else {
						VarcInt.field1841 = null; // L: 6746
					}

					var1.serverPacket = null; // L: 6747
					return true; // L: 6748
				}

				if (ServerPacket.field3054 == var1.serverPacket) { // L: 6750
					var20 = var3.method7713(); // L: 6751
					if (var20 == 65535) { // L: 6752
						var20 = -1;
					}

					var5 = var3.method7837(); // L: 6753
					var6 = var3.method7827(); // L: 6754
					var60 = class127.getWidget(var6); // L: 6755
					ItemComposition var80;
					if (!var60.isIf3) { // L: 6756
						if (var20 == -1) { // L: 6757
							var60.modelType = 0; // L: 6758
							var1.serverPacket = null; // L: 6759
							return true; // L: 6760
						}

						var80 = class19.ItemDefinition_get(var20); // L: 6762
						var60.modelType = 4; // L: 6763
						var60.modelId = var20; // L: 6764
						var60.modelAngleX = var80.xan2d; // L: 6765
						var60.modelAngleY = var80.yan2d; // L: 6766
						var60.modelZoom = var80.zoom2d * 100 / var5; // L: 6767
						class346.invalidateWidget(var60); // L: 6768
					} else {
						var60.itemId = var20; // L: 6771
						var60.itemQuantity = var5; // L: 6772
						var80 = class19.ItemDefinition_get(var20); // L: 6773
						var60.modelAngleX = var80.xan2d; // L: 6774
						var60.modelAngleY = var80.yan2d; // L: 6775
						var60.modelAngleZ = var80.zan2d; // L: 6776
						var60.modelOffsetX = var80.offsetX2d; // L: 6777
						var60.modelOffsetY = var80.offsetY2d; // L: 6778
						var60.modelZoom = var80.zoom2d; // L: 6779
						if (var80.isStackable == 1) { // L: 6780
							var60.itemQuantityMode = 1;
						} else {
							var60.itemQuantityMode = 2; // L: 6781
						}

						if (var60.field3467 > 0) { // L: 6782
							var60.modelZoom = var60.modelZoom * 32 / var60.field3467;
						} else if (var60.rawWidth > 0) { // L: 6783
							var60.modelZoom = var60.modelZoom * 32 / var60.rawWidth;
						}

						class346.invalidateWidget(var60); // L: 6784
					}

					var1.serverPacket = null; // L: 6786
					return true; // L: 6787
				}

				if (ServerPacket.field3102 == var1.serverPacket) { // L: 6789
					var20 = var3.readInt(); // L: 6790
					var5 = var3.readInt(); // L: 6791
					var6 = Tile.getGcDuration(); // L: 6792
					PacketBufferNode var59 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2983, packetWriter.isaacCipher); // L: 6794
					var59.packetBuffer.method7723(var20); // L: 6795
					var59.packetBuffer.method7721(var5); // L: 6796
					var59.packetBuffer.method7703(GameEngine.fps); // L: 6797
					var59.packetBuffer.method7703(var6); // L: 6798
					packetWriter.addNode(var59); // L: 6799
					var1.serverPacket = null; // L: 6800
					return true; // L: 6801
				}

				Widget var73;
				if (ServerPacket.field3086 == var1.serverPacket) { // L: 6803
					var20 = var3.method7837(); // L: 6804
					var73 = class127.getWidget(var20); // L: 6805

					for (var6 = 0; var6 < var73.itemIds.length; ++var6) { // L: 6806
						var73.itemIds[var6] = -1; // L: 6807
						var73.itemIds[var6] = 0; // L: 6808
					}

					class346.invalidateWidget(var73); // L: 6810
					var1.serverPacket = null; // L: 6811
					return true; // L: 6812
				}

				if (ServerPacket.field3044 == var1.serverPacket) { // L: 6814
					var20 = var3.readInt(); // L: 6815
					var5 = var3.readUnsignedShort(); // L: 6816
					if (var20 < -70000) { // L: 6817
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6819
						var74 = class127.getWidget(var20);
					} else {
						var74 = null; // L: 6820
					}

					for (; var3.offset < var1.serverPacketLength; ChatChannel.itemContainerSetItem(var5, var22, var8 - 1, var61)) { // L: 6821 6835
						var22 = var3.readUShortSmart(); // L: 6822
						var8 = var3.readUnsignedShort(); // L: 6823
						var61 = 0; // L: 6824
						if (var8 != 0) { // L: 6825
							var61 = var3.readUnsignedByte(); // L: 6826
							if (var61 == 255) { // L: 6827
								var61 = var3.readInt();
							}
						}

						if (var74 != null && var22 >= 0 && var22 < var74.itemIds.length) { // L: 6829 6830
							var74.itemIds[var22] = var8; // L: 6831
							var74.itemQuantities[var22] = var61; // L: 6832
						}
					}

					if (var74 != null) { // L: 6837
						class346.invalidateWidget(var74);
					}

					class143.method3072(); // L: 6838
					changedItemContainers[++field695 - 1 & 31] = var5 & 32767; // L: 6839
					var1.serverPacket = null; // L: 6840
					return true; // L: 6841
				}

				if (ServerPacket.field3095 == var1.serverPacket) { // L: 6843
					var20 = var3.method7837(); // L: 6844
					var73 = class127.getWidget(var20); // L: 6845
					var73.modelType = 3; // L: 6846
					var73.modelId = GrandExchangeEvents.localPlayer.appearance.getChatHeadId(); // L: 6847
					class346.invalidateWidget(var73); // L: 6848
					var1.serverPacket = null; // L: 6849
					return true; // L: 6850
				}

				if (ServerPacket.field3092 == var1.serverPacket) { // L: 6852
					var52 = var3.readStringCp1252NullTerminated(); // L: 6853
					var26 = (long)var3.readUnsignedShort(); // L: 6854
					var28 = (long)var3.readMedium(); // L: 6855
					PlayerType var37 = (PlayerType)MusicPatchPcmStream.findEnumerated(WorldMapManager.PlayerType_values(), var3.readUnsignedByte()); // L: 6856
					long var38 = (var26 << 32) + var28; // L: 6857
					boolean var76 = false; // L: 6858

					for (var13 = 0; var13 < 100; ++var13) { // L: 6859
						if (var38 == crossWorldMessageIds[var13]) { // L: 6860
							var76 = true; // L: 6861
							break; // L: 6862
						}
					}

					if (Decimator.friendSystem.isIgnored(new Username(var52, class122.loginType))) { // L: 6865
						var76 = true;
					}

					if (!var76 && field618 == 0) { // L: 6866
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38; // L: 6867
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6868
						var32 = AbstractFont.escapeBrackets(MouseHandler.method584(class193.method3883(var3))); // L: 6869
						byte var92;
						if (var37.isPrivileged) { // L: 6871
							var92 = 7;
						} else {
							var92 = 3; // L: 6872
						}

						if (var37.modIcon != -1) { // L: 6873
							Actor.addGameMessage(var92, Script.method1990(var37.modIcon) + var52, var32);
						} else {
							Actor.addGameMessage(var92, var52, var32); // L: 6874
						}
					}

					var1.serverPacket = null; // L: 6876
					return true; // L: 6877
				}

				if (ServerPacket.field3117 == var1.serverPacket) { // L: 6879
					var20 = var3.method7715(); // L: 6880
					var5 = var3.method7827(); // L: 6881
					var74 = class127.getWidget(var5); // L: 6882
					if (var74.modelType != 2 || var20 != var74.modelId) { // L: 6883
						var74.modelType = 2; // L: 6884
						var74.modelId = var20; // L: 6885
						class346.invalidateWidget(var74); // L: 6886
					}

					var1.serverPacket = null; // L: 6888
					return true; // L: 6889
				}

				if (ServerPacket.field3070 == var1.serverPacket) { // L: 6891
					var20 = var3.method7827(); // L: 6892
					var5 = var3.method7713(); // L: 6893
					if (var5 == 65535) { // L: 6894
						var5 = -1;
					}

					var6 = var3.method7715(); // L: 6895
					if (var6 == 65535) { // L: 6896
						var6 = -1;
					}

					var22 = var3.readInt(); // L: 6897

					for (var8 = var5; var8 <= var6; ++var8) { // L: 6898
						var30 = ((long)var22 << 32) + (long)var8; // L: 6899
						Node var93 = widgetFlags.get(var30); // L: 6900
						if (var93 != null) { // L: 6901
							var93.remove();
						}

						widgetFlags.put(new IntegerNode(var20), var30); // L: 6902
					}

					var1.serverPacket = null; // L: 6904
					return true; // L: 6905
				}

				if (ServerPacket.field3041 == var1.serverPacket) { // L: 6907
					class29.field181 = var3.method7875(); // L: 6908
					PlayerComposition.field3307 = var3.method7742(); // L: 6909

					while (var3.offset < var1.serverPacketLength) { // L: 6910
						var20 = var3.readUnsignedByte(); // L: 6911
						class263 var71 = class114.method2662()[var20]; // L: 6912
						ClanMate.method6700(var71); // L: 6913
					}

					var1.serverPacket = null; // L: 6915
					return true; // L: 6916
				}

				if (ServerPacket.field3109 == var1.serverPacket) { // L: 6918
					class426.method7546(); // L: 6919
					var72 = var3.readByte(); // L: 6920
					if (var1.serverPacketLength == 1) { // L: 6921
						if (var72 >= 0) { // L: 6922
							currentClanSettings[var72] = null;
						} else {
							class154.guestClanSettings = null; // L: 6923
						}

						var1.serverPacket = null; // L: 6924
						return true; // L: 6925
					}

					if (var72 >= 0) { // L: 6927
						currentClanSettings[var72] = new ClanSettings(var3); // L: 6928
					} else {
						class154.guestClanSettings = new ClanSettings(var3); // L: 6931
					}

					var1.serverPacket = null; // L: 6933
					return true; // L: 6934
				}

				if (ServerPacket.field3089 == var1.serverPacket) { // L: 6936
					if (ClientPacket.friendsChat != null) { // L: 6937
						ClientPacket.friendsChat.method6661(var3); // L: 6938
					}

					SecureRandomCallable.method2050(); // L: 6940
					var1.serverPacket = null; // L: 6941
					return true; // L: 6942
				}

				if (ServerPacket.field3046 == var1.serverPacket) { // L: 6944
					ClanMate.method6700(class263.field3008); // L: 6945
					var1.serverPacket = null; // L: 6946
					return true; // L: 6947
				}

				if (ServerPacket.field3069 == var1.serverPacket) { // L: 6949
					Decimator.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6950
					field701 = cycleCntr; // L: 6951
					var1.serverPacket = null; // L: 6952
					return true; // L: 6953
				}

				if (ServerPacket.field3098 == var1.serverPacket) { // L: 6955
					var20 = var3.method7837(); // L: 6956
					var5 = var3.readUnsignedShort(); // L: 6957
					var74 = class127.getWidget(var20); // L: 6958
					if (var74.modelType != 1 || var5 != var74.modelId) { // L: 6959
						var74.modelType = 1; // L: 6960
						var74.modelId = var5; // L: 6961
						class346.invalidateWidget(var74); // L: 6962
					}

					var1.serverPacket = null; // L: 6964
					return true; // L: 6965
				}

				if (ServerPacket.field3034 == var1.serverPacket) { // L: 6967
					var20 = var3.method7714(); // L: 6968
					rootInterface = var20; // L: 6969
					this.resizeRoot(false); // L: 6970
					class29.Widget_resetModelFrames(var20); // L: 6971
					class145.runWidgetOnLoadListener(rootInterface); // L: 6972

					for (var5 = 0; var5 < 100; ++var5) { // L: 6973
						field715[var5] = true;
					}

					var1.serverPacket = null; // L: 6974
					return true; // L: 6975
				}

				if (ServerPacket.field3060 == var1.serverPacket) { // L: 6977
					Projectile.updatePlayers(var3, var1.serverPacketLength); // L: 6978
					class115.method2684(); // L: 6979
					var1.serverPacket = null; // L: 6980
					return true; // L: 6981
				}

				String var41;
				if (ServerPacket.field3111 == var1.serverPacket) { // L: 6983
					var52 = var3.readStringCp1252NullTerminated(); // L: 6984
					var26 = var3.readLong(); // L: 6985
					var28 = (long)var3.readUnsignedShort(); // L: 6986
					var30 = (long)var3.readMedium(); // L: 6987
					PlayerType var40 = (PlayerType)MusicPatchPcmStream.findEnumerated(WorldMapManager.PlayerType_values(), var3.readUnsignedByte()); // L: 6988
					var35 = (var28 << 32) + var30; // L: 6989
					boolean var89 = false; // L: 6990

					for (var15 = 0; var15 < 100; ++var15) { // L: 6991
						if (crossWorldMessageIds[var15] == var35) { // L: 6992
							var89 = true; // L: 6993
							break; // L: 6994
						}
					}

					if (var40.isUser && Decimator.friendSystem.isIgnored(new Username(var52, class122.loginType))) { // L: 6997 6998
						var89 = true;
					}

					if (!var89 && field618 == 0) { // L: 7000
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var35; // L: 7001
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7002
						var41 = AbstractFont.escapeBrackets(MouseHandler.method584(class193.method3883(var3))); // L: 7003
						if (var40.modIcon != -1) { // L: 7004
							class301.addChatMessage(9, Script.method1990(var40.modIcon) + var52, var41, class82.base37DecodeLong(var26));
						} else {
							class301.addChatMessage(9, var52, var41, class82.base37DecodeLong(var26)); // L: 7005
						}
					}

					var1.serverPacket = null; // L: 7007
					return true; // L: 7008
				}

				if (ServerPacket.field3047 == var1.serverPacket) { // L: 7010
					var20 = var3.method7715(); // L: 7011
					var5 = var3.method7714(); // L: 7012
					var6 = var3.method7714(); // L: 7013
					var22 = var3.method7837(); // L: 7014
					var25 = class127.getWidget(var22); // L: 7015
					if (var6 != var25.modelAngleX || var5 != var25.modelAngleY || var20 != var25.modelZoom) { // L: 7016
						var25.modelAngleX = var6; // L: 7017
						var25.modelAngleY = var5; // L: 7018
						var25.modelZoom = var20; // L: 7019
						class346.invalidateWidget(var25); // L: 7020
					}

					var1.serverPacket = null; // L: 7022
					return true; // L: 7023
				}

				if (ServerPacket.field3050 == var1.serverPacket) { // L: 7025
					class143.method3072(); // L: 7026
					runEnergy = var3.readUnsignedByte(); // L: 7027
					field707 = cycleCntr; // L: 7028
					var1.serverPacket = null; // L: 7029
					return true; // L: 7030
				}

				if (ServerPacket.field3105 == var1.serverPacket) { // L: 7032
					for (var20 = 0; var20 < players.length; ++var20) { // L: 7033
						if (players[var20] != null) { // L: 7034
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 7036
						if (npcs[var20] != null) { // L: 7037
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7039
					return true; // L: 7040
				}

				if (ServerPacket.field3038 == var1.serverPacket) { // L: 7042
					rebootTimer = var3.readUnsignedShort() * 30; // L: 7043
					field707 = cycleCntr; // L: 7044
					var1.serverPacket = null; // L: 7045
					return true; // L: 7046
				}

				if (ServerPacket.field3023 == var1.serverPacket) { // L: 7048
					Decimator.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7049
					KitDefinition.FriendSystem_invalidateIgnoreds(); // L: 7050
					field701 = cycleCntr; // L: 7051
					var1.serverPacket = null; // L: 7052
					return true; // L: 7053
				}

				if (ServerPacket.field3078 == var1.serverPacket) { // L: 7055
					isCameraLocked = true; // L: 7056
					field754 = false; // L: 7057
					class154.field1691 = var3.readUnsignedByte(); // L: 7058
					class67.field881 = var3.readUnsignedByte(); // L: 7059
					DevicePcmPlayerProvider.field154 = var3.readUnsignedShort(); // L: 7060
					NetFileRequest.field3960 = var3.readUnsignedByte(); // L: 7061
					class386.field4337 = var3.readUnsignedByte(); // L: 7062
					if (class386.field4337 >= 100) { // L: 7063
						var20 = class154.field1691 * 128 + 64; // L: 7064
						var5 = class67.field881 * 128 + 64; // L: 7065
						var6 = WorldMapLabel.getTileHeight(var20, var5, class18.Client_plane) - DevicePcmPlayerProvider.field154; // L: 7066
						var22 = var20 - WorldMapLabelSize.cameraX; // L: 7067
						var8 = var6 - ItemContainer.cameraY; // L: 7068
						var61 = var5 - class154.cameraZ; // L: 7069
						var62 = (int)Math.sqrt((double)(var22 * var22 + var61 * var61)); // L: 7070
						class147.cameraPitch = (int)(Math.atan2((double)var8, (double)var62) * 325.9490051269531D) & 2047; // L: 7071
						class21.cameraYaw = (int)(Math.atan2((double)var22, (double)var61) * -325.9490051269531D) & 2047; // L: 7072
						if (class147.cameraPitch < 128) { // L: 7073
							class147.cameraPitch = 128;
						}

						if (class147.cameraPitch > 383) { // L: 7074
							class147.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7076
					return true; // L: 7077
				}

				if (ServerPacket.field3028 == var1.serverPacket) { // L: 7079
					var20 = var3.readUnsignedByte(); // L: 7080
					class16.forceDisconnect(var20); // L: 7081
					var1.serverPacket = null; // L: 7082
					return false; // L: 7083
				}

				if (ServerPacket.field3035 == var1.serverPacket) { // L: 7085
					var78 = var3.readUnsignedByte() == 1; // L: 7086
					if (var78) { // L: 7087
						WorldMapID.field2388 = class136.method2931() - var3.readLong(); // L: 7088
						class83.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7089
					} else {
						class83.grandExchangeEvents = null; // L: 7091
					}

					field706 = cycleCntr; // L: 7092
					var1.serverPacket = null; // L: 7093
					return true; // L: 7094
				}

				if (ServerPacket.field3033 == var1.serverPacket) { // L: 7096
					StudioGame.loadRegions(false, var1.packetBuffer); // L: 7097
					var1.serverPacket = null; // L: 7098
					return true; // L: 7099
				}

				if (ServerPacket.field3100 == var1.serverPacket) { // L: 7101
					var20 = var3.readUnsignedShort(); // L: 7102
					var5 = var3.readUnsignedByte(); // L: 7103
					var6 = var3.readUnsignedShort(); // L: 7104
					Actor.queueSoundEffect(var20, var5, var6); // L: 7105
					var1.serverPacket = null; // L: 7106
					return true; // L: 7107
				}

				if (ServerPacket.field3088 == var1.serverPacket) { // L: 7109
					var20 = var3.method7713(); // L: 7110
					var5 = var3.readInt(); // L: 7111
					var6 = var20 >> 10 & 31; // L: 7112
					var22 = var20 >> 5 & 31; // L: 7113
					var8 = var20 & 31; // L: 7114
					var61 = (var22 << 11) + (var6 << 19) + (var8 << 3); // L: 7115
					Widget var90 = class127.getWidget(var5); // L: 7116
					if (var61 != var90.color) { // L: 7117
						var90.color = var61; // L: 7118
						class346.invalidateWidget(var90); // L: 7119
					}

					var1.serverPacket = null; // L: 7121
					return true; // L: 7122
				}

				if (ServerPacket.field3076 == var1.serverPacket) { // L: 7124
					var20 = var3.readUnsignedByte(); // L: 7125
					if (var3.readUnsignedByte() == 0) { // L: 7126
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 7127
						var3.offset += 18; // L: 7128
					} else {
						--var3.offset; // L: 7131
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 7132
					}

					field705 = cycleCntr; // L: 7134
					var1.serverPacket = null; // L: 7135
					return true; // L: 7136
				}

				if (ServerPacket.field3079 == var1.serverPacket) { // L: 7138
					var20 = var3.readUnsignedShort(); // L: 7139
					class78.method2081(var20); // L: 7140
					changedItemContainers[++field695 - 1 & 31] = var20 & 32767; // L: 7141
					var1.serverPacket = null; // L: 7142
					return true; // L: 7143
				}

				if (ServerPacket.field3106 == var1.serverPacket) { // L: 7145
					var20 = var3.method7827(); // L: 7146
					var56 = var3.readUnsignedByte() == 1; // L: 7147
					var74 = class127.getWidget(var20); // L: 7148
					if (var56 != var74.isHidden) { // L: 7149
						var74.isHidden = var56; // L: 7150
						class346.invalidateWidget(var74); // L: 7151
					}

					var1.serverPacket = null; // L: 7153
					return true; // L: 7154
				}

				if (ServerPacket.field3064 == var1.serverPacket) { // L: 7156
					ClanMate.method6700(class263.field3006); // L: 7157
					var1.serverPacket = null; // L: 7158
					return true; // L: 7159
				}

				if (ServerPacket.field3087 == var1.serverPacket) { // L: 7161
					StudioGame.loadRegions(true, var1.packetBuffer); // L: 7162
					var1.serverPacket = null; // L: 7163
					return true; // L: 7164
				}

				if (ServerPacket.field3053 == var1.serverPacket) { // L: 7166
					byte[] var51 = new byte[var1.serverPacketLength]; // L: 7167
					var3.method7624(var51, 0, var51.length); // L: 7168
					Buffer var70 = new Buffer(var51); // L: 7169
					var23 = var70.readStringCp1252NullTerminated(); // L: 7170
					class391.openURL(var23, true, false); // L: 7171
					var1.serverPacket = null; // L: 7172
					return true; // L: 7173
				}

				if (ServerPacket.field3125 == var1.serverPacket) { // L: 7175
					var5 = var3.readUnsignedShort(); // L: 7180
					var6 = var3.method7705(); // L: 7181
					var20 = var3.readUnsignedShort(); // L: 7182
					Player var58;
					if (var20 == localPlayerIndex) { // L: 7183
						var58 = GrandExchangeEvents.localPlayer; // L: 7184
					} else {
						var58 = players[var20]; // L: 7187
					}

					if (var58 != null) { // L: 7189
						var58.spotAnimation = var5; // L: 7190
						var58.spotAnimationHeight = var6 >> 16; // L: 7191
						var58.field1134 = (var6 & 65535) + cycle; // L: 7192
						var58.spotAnimationFrame = 0; // L: 7193
						var58.spotAnimationFrameCycle = 0; // L: 7194
						if (var58.field1134 > cycle) { // L: 7195
							var58.spotAnimationFrame = -1; // L: 7196
						}

						if (var58.spotAnimation == 65535) { // L: 7198
							var58.spotAnimation = -1; // L: 7199
						}
					}

					var1.serverPacket = null; // L: 7202
					return true; // L: 7203
				}

				int var16;
				if (ServerPacket.field3039 == var1.serverPacket) { // L: 7205
					var72 = var3.readByte(); // L: 7206
					var21 = var3.readStringCp1252NullTerminated(); // L: 7207
					long var42 = (long)var3.readUnsignedShort(); // L: 7208
					long var44 = (long)var3.readMedium(); // L: 7209
					PlayerType var34 = (PlayerType)MusicPatchPcmStream.findEnumerated(WorldMapManager.PlayerType_values(), var3.readUnsignedByte()); // L: 7210
					long var46 = (var42 << 32) + var44; // L: 7211
					boolean var65 = false; // L: 7212
					ClanChannel var14 = null; // L: 7213
					var14 = var72 >= 0 ? currentClanChannels[var72] : class21.guestClanChannel; // L: 7215
					if (var14 == null) { // L: 7216
						var65 = true; // L: 7217
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var34.isUser && Decimator.friendSystem.isIgnored(new Username(var21, class122.loginType))) { // L: 7226 7227
									var65 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var46) { // L: 7221
								var65 = true; // L: 7222
								break; // L: 7223
							}

							++var15; // L: 7220
						}
					}

					if (!var65) { // L: 7230
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46; // L: 7231
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7232
						var41 = AbstractFont.escapeBrackets(class193.method3883(var3)); // L: 7233
						var16 = var72 >= 0 ? 41 : 44; // L: 7234
						if (var34.modIcon != -1) { // L: 7235
							class301.addChatMessage(var16, Script.method1990(var34.modIcon) + var21, var41, var14.name);
						} else {
							class301.addChatMessage(var16, var21, var41, var14.name); // L: 7236
						}
					}

					var1.serverPacket = null; // L: 7238
					return true; // L: 7239
				}

				if (ServerPacket.field3056 == var1.serverPacket) { // L: 7241
					ItemLayer.logOut(); // L: 7242
					var1.serverPacket = null; // L: 7243
					return false; // L: 7244
				}

				if (ServerPacket.field3029 == var1.serverPacket) { // L: 7246
					field755 = cycleCntr; // L: 7247
					var72 = var3.readByte(); // L: 7248
					if (var1.serverPacketLength == 1) { // L: 7249
						if (var72 >= 0) { // L: 7250
							currentClanChannels[var72] = null;
						} else {
							class21.guestClanChannel = null; // L: 7251
						}

						var1.serverPacket = null; // L: 7252
						return true; // L: 7253
					}

					if (var72 >= 0) { // L: 7255
						currentClanChannels[var72] = new ClanChannel(var3); // L: 7256
					} else {
						class21.guestClanChannel = new ClanChannel(var3); // L: 7259
					}

					var1.serverPacket = null; // L: 7261
					return true; // L: 7262
				}

				if (ServerPacket.field3049 == var1.serverPacket) { // L: 7264
					if (HorizontalAlignment.field1885 == null) { // L: 7265
						HorizontalAlignment.field1885 = new class391(DirectByteArrayCopier.HitSplatDefinition_cached);
					}

					class445 var50 = DirectByteArrayCopier.HitSplatDefinition_cached.method7115(var3); // L: 7266
					HorizontalAlignment.field1885.field4373.vmethod7464(var50.field4683, var50.field4681); // L: 7267
					field698[++field699 - 1 & 31] = var50.field4683; // L: 7268
					var1.serverPacket = null; // L: 7269
					return true; // L: 7270
				}

				if (ServerPacket.field3072 == var1.serverPacket) { // L: 7272
					var20 = var3.readUnsignedShort(); // L: 7273
					byte var55 = var3.method7707(); // L: 7274
					Varps.Varps_temp[var20] = var55; // L: 7275
					if (Varps.Varps_main[var20] != var55) { // L: 7276
						Varps.Varps_main[var20] = var55; // L: 7277
					}

					WorldMapLabel.changeGameOptions(var20); // L: 7279
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 7280
					var1.serverPacket = null; // L: 7281
					return true; // L: 7282
				}

				if (ServerPacket.field3124 == var1.serverPacket) { // L: 7284
					var5 = var3.method7827(); // L: 7289
					var6 = var3.method7714(); // L: 7290
					var20 = var3.method7713(); // L: 7291
					var57 = npcs[var20]; // L: 7292
					if (var57 != null) { // L: 7293
						var57.spotAnimation = var6; // L: 7294
						var57.spotAnimationHeight = var5 >> 16; // L: 7295
						var57.field1134 = (var5 & 65535) + cycle; // L: 7296
						var57.spotAnimationFrame = 0; // L: 7297
						var57.spotAnimationFrameCycle = 0; // L: 7298
						if (var57.field1134 > cycle) { // L: 7299
							var57.spotAnimationFrame = -1; // L: 7300
						}

						if (var57.spotAnimation == 65535) { // L: 7302
							var57.spotAnimation = -1; // L: 7303
						}
					}

					var1.serverPacket = null; // L: 7306
					return true; // L: 7307
				}

				if (ServerPacket.field3084 == var1.serverPacket) { // L: 7309
					var3.offset += 28; // L: 7310
					if (var3.checkCrc()) { // L: 7311
						DefaultsGroup.method6936(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7312
					return true; // L: 7313
				}

				if (ServerPacket.field3099 == var1.serverPacket) { // L: 7315
					WorldMapSection1.updateNpcs(false, var3); // L: 7316
					var1.serverPacket = null; // L: 7317
					return true; // L: 7318
				}

				if (ServerPacket.field3126 == var1.serverPacket) { // L: 7320
					int var18 = var3.readUnsignedByte(); // L: 7336
					var16 = var3.method7715(); // L: 7337
					var6 = var3.method7793(); // L: 7338
					var20 = var6 >> 16; // L: 7339
					var5 = var6 >> 8 & 255; // L: 7340
					var22 = var20 + (var6 >> 4 & 7); // L: 7341
					var8 = var5 + (var6 & 7); // L: 7342
					byte var9 = var3.readByte(); // L: 7343
					var24 = var3.method7715(); // L: 7344
					var13 = var3.method7875() * 4; // L: 7345
					byte var10 = var3.method7707(); // L: 7346
					var15 = var3.method7713(); // L: 7347
					int var17 = var3.readUnsignedByte(); // L: 7348
					var33 = var3.method7742() * 4; // L: 7349
					var11 = var3.method7716(); // L: 7350
					var61 = var9 + var22; // L: 7351
					var62 = var10 + var8; // L: 7352
					if (var22 >= 0 && var8 >= 0 && var22 < 104 && var8 < 104 && var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && var24 != 65535) { // L: 7353
						var22 = var22 * 128 + 64; // L: 7354
						var8 = var8 * 128 + 64; // L: 7355
						var61 = var61 * 128 + 64; // L: 7356
						var62 = var62 * 128 + 64; // L: 7357
						Projectile var19 = new Projectile(var24, class18.Client_plane, var22, var8, WorldMapLabel.getTileHeight(var22, var8, class18.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var33); // L: 7358
						var19.setDestination(var61, var62, WorldMapLabel.getTileHeight(var61, var62, class18.Client_plane) - var33, var15 + cycle); // L: 7359
						projectiles.addFirst(var19); // L: 7360
					}

					var1.serverPacket = null; // L: 7362
					return true; // L: 7363
				}

				if (ServerPacket.field3118 == var1.serverPacket) { // L: 7365
					class143.method3072(); // L: 7366
					var20 = var3.method7742(); // L: 7367
					var5 = var3.method7773(); // L: 7368
					var6 = var3.method7837(); // L: 7369
					experience[var5] = var6; // L: 7370
					currentLevels[var5] = var20; // L: 7371
					levels[var5] = 1; // L: 7372

					for (var22 = 0; var22 < 98; ++var22) { // L: 7373
						if (var6 >= Skills.Skills_experienceTable[var22]) {
							levels[var5] = var22 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 7374
					var1.serverPacket = null; // L: 7375
					return true; // L: 7376
				}

				if (ServerPacket.field3059 == var1.serverPacket && isCameraLocked) { // L: 7378 7379
					field754 = true; // L: 7380
					Script.field955 = var3.readUnsignedByte(); // L: 7381
					ArchiveDisk.field4309 = var3.readUnsignedByte(); // L: 7382
					NetFileRequest.field3960 = var3.readUnsignedByte(); // L: 7383
					class386.field4337 = var3.readUnsignedByte(); // L: 7384

					for (var20 = 0; var20 < 5; ++var20) { // L: 7385
						field546[var20] = false;
					}

					var1.serverPacket = null; // L: 7386
					return true; // L: 7387
				}

				if (ServerPacket.field3103 == var1.serverPacket) { // L: 7390
					var20 = var3.readUnsignedByte(); // L: 7391
					var5 = var3.readInt(); // L: 7392
					var6 = var3.method7715(); // L: 7393
					var7 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7394
					if (var7 != null) { // L: 7395
						Script.closeInterface(var7, var6 != var7.group);
					}

					class4.method16(var5, var6, var20); // L: 7396
					var1.serverPacket = null; // L: 7397
					return true; // L: 7398
				}

				if (ServerPacket.field3115 == var1.serverPacket) { // L: 7400
					destinationX = var3.readUnsignedByte(); // L: 7401
					if (destinationX == 255) { // L: 7402
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7403
					if (destinationY == 255) { // L: 7404
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7405
					return true; // L: 7406
				}

				Widget.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -1948146481 * 766304815 : -1) + "," + (var1.field1325 != null ? var1.field1325.id * -1948146481 * 766304815 : -1) + "," + (var1.field1313 != null ? var1.field1313.id * -1948146481 * 766304815 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7408
				ItemLayer.logOut(); // L: 7409
			} catch (IOException var48) { // L: 7411
				ClanChannelMember.method2868(); // L: 7412
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -1948146481 * 766304815 : -1) + "," + (var1.field1325 != null ? var1.field1325.id * -1948146481 * 766304815 : -1) + "," + (var1.field1313 != null ? var1.field1313.id * -1948146481 * 766304815 : -1) + "," + var1.serverPacketLength + "," + (GrandExchangeEvents.localPlayer.pathX[0] + GrandExchangeOfferOwnWorldComparator.baseX) + "," + (GrandExchangeEvents.localPlayer.pathY[0] + VarcInt.baseY) + ","; // L: 7415

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7416
					var21 = var21 + var3.array[var6] + ",";
				}

				Widget.RunException_sendStackTrace(var21, var49); // L: 7417
				ItemLayer.logOut(); // L: 7418
			}

			return true; // L: 7420
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	@Export("menu")
	final void menu() {
		GrandExchangeOfferTotalQuantityComparator.incrementMenuEntries(); // L: 8667
		if (class142.dragInventoryWidget == null) { // L: 8668
			if (clickedWidget == null) { // L: 8669
				int var1 = MouseHandler.MouseHandler_lastButton; // L: 8670
				int var2;
				int var3;
				int var4;
				int var5;
				int var14;
				if (isMenuOpen) { // L: 8671
					if (var1 != 1 && (GameBuild.mouseCam || var1 != 4)) { // L: 8672
						var2 = MouseHandler.MouseHandler_x; // L: 8673
						var3 = MouseHandler.MouseHandler_y; // L: 8674
						if (var2 < class138.menuX - 10 || var2 > class138.menuX + ItemComposition.menuWidth + 10 || var3 < class1.menuY - 10 || var3 > class1.menuY + ByteArrayPool.menuHeight + 10) { // L: 8675
							isMenuOpen = false; // L: 8676
							HealthBar.method2330(class138.menuX, class1.menuY, ItemComposition.menuWidth, ByteArrayPool.menuHeight); // L: 8677
						}
					}

					if (var1 == 1 || !GameBuild.mouseCam && var1 == 4) { // L: 8680
						var2 = class138.menuX; // L: 8681
						var3 = class1.menuY; // L: 8682
						var4 = ItemComposition.menuWidth; // L: 8683
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8684
						var14 = MouseHandler.MouseHandler_lastPressedY; // L: 8685
						int var15 = -1; // L: 8686

						int var9;
						int var16;
						for (var16 = 0; var16 < menuOptionsCount; ++var16) { // L: 8687
							var9 = (menuOptionsCount - 1 - var16) * 15 + var3 + 31; // L: 8688
							if (var5 > var2 && var5 < var4 + var2 && var14 > var9 - 13 && var14 < var9 + 3) { // L: 8689
								var15 = var16;
							}
						}

						if (var15 != -1 && var15 >= 0) { // L: 8691 8692
							var16 = menuArguments1[var15]; // L: 8693
							var9 = menuArguments2[var15]; // L: 8694
							int var10 = menuOpcodes[var15]; // L: 8695
							int var11 = menuIdentifiers[var15]; // L: 8696
							String var12 = menuActions[var15]; // L: 8697
							String var13 = menuTargets[var15]; // L: 8698
							class9.menuAction(var16, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8699
						}

						isMenuOpen = false; // L: 8701
						HealthBar.method2330(class138.menuX, class1.menuY, ItemComposition.menuWidth, ByteArrayPool.menuHeight); // L: 8702
					}
				} else {
					var2 = GameBuild.method5773(); // L: 8706
					if ((var1 == 1 || !GameBuild.mouseCam && var1 == 4) && var2 >= 0) { // L: 8707
						var3 = menuOpcodes[var2]; // L: 8708
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 8709
							var4 = menuArguments1[var2]; // L: 8710
							var5 = menuArguments2[var2]; // L: 8711
							Widget var6 = class127.getWidget(var5); // L: 8712
							if (FriendSystem.method1698(class326.getWidgetFlags(var6)) || ReflectionCheck.method1079(class326.getWidgetFlags(var6))) { // L: 8713
								if (class142.dragInventoryWidget != null && !field767 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8714 8715
									UrlRequest.method2551(draggedWidgetX, draggedWidgetY); // L: 8716
								}

								field767 = false; // L: 8719
								itemDragDuration = 0; // L: 8720
								if (class142.dragInventoryWidget != null) { // L: 8721
									class346.invalidateWidget(class142.dragInventoryWidget);
								}

								class142.dragInventoryWidget = class127.getWidget(var5); // L: 8722
								dragItemSlotSource = var4; // L: 8723
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8724
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8725
								if (var2 >= 0) { // L: 8726
									Interpreter.tempMenuAction = new MenuAction(); // L: 8727
									Interpreter.tempMenuAction.param0 = menuArguments1[var2]; // L: 8728
									Interpreter.tempMenuAction.param1 = menuArguments2[var2]; // L: 8729
									Interpreter.tempMenuAction.opcode = menuOpcodes[var2]; // L: 8730
									Interpreter.tempMenuAction.identifier = menuIdentifiers[var2]; // L: 8731
									Interpreter.tempMenuAction.action = menuActions[var2]; // L: 8732
								}

								class346.invalidateWidget(class142.dragInventoryWidget); // L: 8734
								return; // L: 8735
							}
						}
					}

					if ((var1 == 1 || !GameBuild.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8739 8740
						var1 = 2; // L: 8741
					}

					if ((var1 == 1 || !GameBuild.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8744 8746
						var3 = menuArguments1[var2]; // L: 8747
						var4 = menuArguments2[var2]; // L: 8748
						var5 = menuOpcodes[var2]; // L: 8749
						var14 = menuIdentifiers[var2]; // L: 8750
						String var7 = menuActions[var2]; // L: 8751
						String var8 = menuTargets[var2]; // L: 8752
						class9.menuAction(var3, var4, var5, var14, var7, var8, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8753
					}

					if (var1 == 2 && menuOptionsCount > 0) { // L: 8756
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 8758

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "26"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = GameBuild.method5773(); // L: 8761
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || SoundCache.method781(var1)) && !menuShiftClick[var1]; // L: 8762
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "39"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = RouteStrategy.fontBold12.stringWidth("Choose Option"); // L: 8767

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 8768
			var5 = RouteStrategy.fontBold12.stringWidth(AbstractUserComparator.method6736(var4)); // L: 8769
			if (var5 > var3) { // L: 8770
				var3 = var5;
			}
		}

		var3 += 8; // L: 8772
		var4 = menuOptionsCount * 15 + 22; // L: 8773
		var5 = var1 - var3 / 2; // L: 8774
		if (var5 + var3 > InvDefinition.canvasWidth) { // L: 8775
			var5 = InvDefinition.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 8776
			var5 = 0;
		}

		int var6 = var2; // L: 8777
		if (var4 + var2 > class321.canvasHeight) { // L: 8778
			var6 = class321.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 8779
			var6 = 0;
		}

		class138.menuX = var5; // L: 8780
		class1.menuY = var6; // L: 8781
		ItemComposition.menuWidth = var3; // L: 8782
		ByteArrayPool.menuHeight = menuOptionsCount * 15 + 22; // L: 8783
		var1 -= viewportOffsetX; // L: 8785
		var2 -= viewportOffsetY; // L: 8786
		ArchiveLoader.scene.menuOpen(class18.Client_plane, var1, var2, false); // L: 8787
		isMenuOpen = true; // L: 8788
	} // L: 8789

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "982244774"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10763
		int var3 = InvDefinition.canvasWidth; // L: 10764
		int var4 = class321.canvasHeight; // L: 10765
		if (class155.loadInterface(var2)) { // L: 10767
			ModelData0.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10768
		}

	} // L: 10770

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "-2147483648"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class127.getWidget(var1.parentId); // L: 10773
		int var3;
		int var4;
		if (var2 == null) { // L: 10776
			var3 = InvDefinition.canvasWidth; // L: 10777
			var4 = class321.canvasHeight; // L: 10778
		} else {
			var3 = var2.width; // L: 10781
			var4 = var2.height; // L: 10782
		}

		ApproximateRouteStrategy.alignWidgetSize(var1, var3, var4, false); // L: 10784
		HealthBarUpdate.alignWidgetPosition(var1, var3, var4); // L: 10785
	} // L: 10786

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	final void method1164() {
		class346.invalidateWidget(clickedWidget); // L: 11773
		++class124.widgetDragDuration; // L: 11774
		if (field687 && field696) { // L: 11775
			int var1 = MouseHandler.MouseHandler_x; // L: 11784
			int var2 = MouseHandler.MouseHandler_y; // L: 11785
			var1 -= widgetClickX; // L: 11786
			var2 -= widgetClickY; // L: 11787
			if (var1 < field773) { // L: 11788
				var1 = field773;
			}

			if (var1 + clickedWidget.width > field773 + clickedWidgetParent.width) { // L: 11789
				var1 = field773 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field686) { // L: 11790
				var2 = field686;
			}

			if (var2 + clickedWidget.height > field686 + clickedWidgetParent.height) { // L: 11791
				var2 = field686 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field688; // L: 11792
			int var4 = var2 - field757; // L: 11793
			int var5 = clickedWidget.dragZoneSize; // L: 11794
			if (class124.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11795 11796
				isDraggingWidget = true; // L: 11797
			}

			int var6 = var1 - field773 + clickedWidgetParent.scrollX; // L: 11800
			int var7 = var2 - field686 + clickedWidgetParent.scrollY; // L: 11801
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11802
				var8 = new ScriptEvent(); // L: 11803
				var8.widget = clickedWidget; // L: 11804
				var8.mouseX = var6; // L: 11805
				var8.mouseY = var7; // L: 11806
				var8.args = clickedWidget.onDrag; // L: 11807
				ClanSettings.runScriptEvent(var8); // L: 11808
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11810
				if (isDraggingWidget) { // L: 11811
					if (clickedWidget.onDragComplete != null) { // L: 11812
						var8 = new ScriptEvent(); // L: 11813
						var8.widget = clickedWidget; // L: 11814
						var8.mouseX = var6; // L: 11815
						var8.mouseY = var7; // L: 11816
						var8.dragTarget = draggedOnWidget; // L: 11817
						var8.args = clickedWidget.onDragComplete; // L: 11818
						ClanSettings.runScriptEvent(var8); // L: 11819
					}

					if (draggedOnWidget != null) { // L: 11821
						Widget var9 = clickedWidget; // L: 11823
						int var10 = Players.method2420(class326.getWidgetFlags(var9)); // L: 11825
						Widget var13;
						if (var10 == 0) { // L: 11826
							var13 = null; // L: 11827
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9; // L: 11837
									break;
								}

								var9 = class127.getWidget(var9.parentId); // L: 11831
								if (var9 == null) { // L: 11832
									var13 = null; // L: 11833
									break; // L: 11834
								}

								++var11; // L: 11830
							}
						}

						if (var13 != null) { // L: 11839
							PacketBufferNode var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2919, packetWriter.isaacCipher); // L: 11841
							var12.packetBuffer.method7723(clickedWidget.id); // L: 11842
							var12.packetBuffer.writeShort(clickedWidget.childIndex); // L: 11843
							var12.packetBuffer.method7711(clickedWidget.itemId); // L: 11844
							var12.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 11845
							var12.packetBuffer.method7712(draggedOnWidget.itemId); // L: 11846
							var12.packetBuffer.method7723(draggedOnWidget.id); // L: 11847
							packetWriter.addNode(var12); // L: 11848
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11853
					this.openMenu(widgetClickX + field688, widgetClickY + field757); // L: 11854
				} else if (menuOptionsCount > 0) { // L: 11856
					UrlRequest.method2551(widgetClickX + field688, widgetClickY + field757); // L: 11857
				}

				clickedWidget = null; // L: 11860
			}

		} else {
			if (class124.widgetDragDuration > 1) { // L: 11776
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11777
					UrlRequest.method2551(widgetClickX + field688, field757 + widgetClickY); // L: 11778
				}

				clickedWidget = null; // L: 11780
			}

		}
	} // L: 11782 11862

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)Lqb;",
		garbageValue = "529633925"
	)
	@Export("username")
	public Username username() {
		return GrandExchangeEvents.localPlayer != null ? GrandExchangeEvents.localPlayer.username : null; // L: 12585
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 674
				for (int var1 = 0; var1 <= 27; ++var1) { // L: 675
					String var2 = this.getParameter(Integer.toString(var1)); // L: 676
					if (var2 != null) { // L: 677
						switch(var1) { // L: 678
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 691
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 721
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 722
							}
							break;
						case 4:
							if (clientType == -1) { // L: 727
								clientType = Integer.parseInt(var2); // L: 728
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 757
							break; // L: 758
						case 6:
							Skills.clientLanguage = Language.method6077(Integer.parseInt(var2)); // L: 686
							break; // L: 687
						case 7:
							class301.field3545 = KeyHandler.method332(Integer.parseInt(var2)); // L: 711
							break; // L: 712
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 734
							}
							break;
						case 9:
							class65.field868 = var2; // L: 706
							break; // L: 707
						case 10:
							Messages.field1305 = (StudioGame)MusicPatchPcmStream.findEnumerated(Message.method1116(), Integer.parseInt(var2)); // L: 740
							if (StudioGame.oldscape == Messages.field1305) { // L: 741
								class122.loginType = LoginType.oldscape;
							} else {
								class122.loginType = LoginType.field4555; // L: 742
							}
							break;
						case 11:
							class113.field1372 = var2; // L: 716
							break; // L: 717
						case 12:
							worldId = Integer.parseInt(var2); // L: 681
							break; // L: 682
						case 14:
							GrandExchangeOfferOwnWorldComparator.field483 = Integer.parseInt(var2); // L: 752
							break; // L: 753
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 701
							break; // L: 702
						case 17:
							WorldMapElement.field1836 = var2; // L: 762
							break;
						case 21:
							field617 = Integer.parseInt(var2); // L: 747
							break; // L: 748
						case 22:
							field553 = Integer.parseInt(var2) != 0; // L: 696
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 769
				isLowDetail = false; // L: 770
				class17.worldHost = this.getCodeBase().getHost(); // L: 772
				String var4 = class301.field3545.name; // L: 773
				byte var5 = 0; // L: 774

				try {
					FloorOverlayDefinition.method3788("oldschool", var4, var5, 21); // L: 776
				} catch (Exception var6) { // L: 778
					Widget.RunException_sendStackTrace((String)null, var6); // L: 779
				}

				class127.client = this; // L: 781
				WorldMapRegion.clientType = clientType; // L: 782
				if (field498 == -1) { // L: 783
					field498 = 0; // L: 784
				}

				class360.field4209 = System.getenv("JX_ACCESS_TOKEN"); // L: 786
				System.getenv("JX_REFRESH_TOKEN"); // L: 787
				this.startThread(765, 503, 204); // L: 788
			}
		} catch (RuntimeException var7) {
			throw MilliClock.newRunException(var7, "client.init(" + ')');
		}
	} // L: 789

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 802
	}

	public long getAccountHash() {
		return this.field542; // L: 807
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 793
			this.field536 = var1; // L: 796
			Ignored.method6828(10); // L: 797
		}
	} // L: 794 798

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkr;",
		garbageValue = "1"
	)
	public static class309[] method1633() {
		return new class309[]{class309.field3913, class309.field3911, class309.field3914, class309.field3915}; // L: 15
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "37"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return isResizable ? 2 : 1; // L: 4259
	}
}
