import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "[Leh;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = 1668730285
	)
	public static int field764;
	@ObfuscatedName("se")
	static boolean field731;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -910392373
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -741785837
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 1225239435
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = -1994078091
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	static final ApproximateRouteStrategy field477;
	@ObfuscatedName("sv")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("vf")
	static int[] field743;
	@ObfuscatedName("tv")
	static boolean field739;
	@ObfuscatedName("vp")
	static int[] field670;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = -626586819
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1394688195
	)
	static int field759;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("tt")
	static boolean[] field740;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -1186847035
	)
	static int field738;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = -511056461
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ts")
	static int[] field482;
	@ObfuscatedName("uy")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("tq")
	static int[] field549;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -19127139
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("tp")
	static int[] field766;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -948451773
	)
	static int field721;
	@ObfuscatedName("tr")
	static int[] field744;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		longValue = 36479923069350349L
	)
	static long field718;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 1597289503
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("sk")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sl")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ss")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "[Lad;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("qq")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("so")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 802039019
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = 392085463
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("rd")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rh")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tc")
	static short field745;
	@ObfuscatedName("tf")
	static short field706;
	@ObfuscatedName("to")
	static short field751;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("te")
	static short field752;
	@ObfuscatedName("tz")
	static short field750;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = 1682209625
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tg")
	static short field562;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = 1039364719
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = 611890173
	)
	static int field713;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "[Ley;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = -1076722529
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("rk")
	static int[] field568;
	@ObfuscatedName("ty")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("tl")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1688103811
	)
	static int field767;
	@ObfuscatedName("ru")
	static int[] field716;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -89242055
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -1997550173
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("qw")
	static String field712;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgf;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("ai")
	static boolean field536;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1384475225
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1403980901
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static GameBuild field509;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1486899745
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bg")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 908315739
	)
	static int field484;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 936245025
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -306665125
	)
	static int field486;
	@ObfuscatedName("bb")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -82914107
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ct")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -334140379
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		longValue = -1788546083079634723L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -100074845
	)
	static int field493;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 629104417
	)
	static int field494;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		longValue = 1321924427680064723L
	)
	static long field495;
	@ObfuscatedName("dk")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1351490809
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1663625947
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 192342013
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1937230559
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1944327797
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1483438593
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 625837163
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -238897213
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1241852729
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1509781755
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 825267883
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 440824439
	)
	static int field510;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1319621541
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = 873675793
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 1202903661
	)
	static int field513;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = 595512899
	)
	static int field742;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = -1543261187
	)
	static int field490;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	static class124 field516;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static class441 field517;
	@ObfuscatedName("fj")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gj")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "[Lcx;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 821728721
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ge")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1172632999
	)
	static int field609;
	@ObfuscatedName("ga")
	static int[] field533;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -1448088797
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gy")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gr")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gl")
	static boolean field753;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hm")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -1925693523
	)
	static int field541;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -1659706153
	)
	static int field558;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = 321841455
	)
	static int field543;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 221917147
	)
	static int field679;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 1969712165
	)
	static int field545;
	@ObfuscatedName("hk")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ho")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hq")
	static final int[] field711;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -801639369
	)
	static int field550;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 1321495201
	)
	static int field619;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -1490389591
	)
	static int field684;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -1195780917
	)
	static int field554;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -1210560909
	)
	static int field514;
	@ObfuscatedName("if")
	static boolean field556;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -1437744235
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -1351920695
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 216266331
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -1258752111
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1533362551
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -455239761
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -1065676509
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 201796585
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -227218527
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 2135438815
	)
	static int field566;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 344639155
	)
	static int field567;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -341747801
	)
	static int field696;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -1286782535
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -881862903
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1761289457
	)
	static int field571;
	@ObfuscatedName("ju")
	static boolean field602;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -1962424793
	)
	static int field542;
	@ObfuscatedName("jp")
	static boolean field616;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 1036039517
	)
	static int field756;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -1554495705
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -1616639625
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("jc")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kc")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("kw")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kd")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ko")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kt")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kf")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kq")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kg")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -2025340953
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -861538357
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 41145337
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1179160659
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -1155625427
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -986269893
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1318362113
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ku")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -1221596075
	)
	static int field595;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 16392841
	)
	static int field741;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -859747187
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 1957419163
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1932614367
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 276455063
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kv")
	static boolean field601;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -1359218603
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -763217451
	)
	static int field603;
	@ObfuscatedName("lq")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 439770895
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1383096841
	)
	static int field607;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		longValue = 6514604348113006825L
	)
	static long field608;
	@ObfuscatedName("lm")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 171593155
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -754880113
	)
	static int field634;
	@ObfuscatedName("lp")
	static int[] field612;
	@ObfuscatedName("lw")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("lv")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("le")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("li")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 942532963
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "[[[Lle;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("md")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mj")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mr")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 1375313987
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("mx")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -695569243
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("me")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mb")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mk")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mw")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("ma")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("mu")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mg")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mh")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ms")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("mv")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mm")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -1871086395
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = -1530402969
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 2027210895
	)
	static int field641;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -238451065
	)
	static int field642;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -320489825
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ng")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -419489305
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 913012823
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ny")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nh")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 1841301513
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 709549119
	)
	static int field652;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 773813339
	)
	static int field653;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -726450495
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -2056870609
	)
	static int field655;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 1511589879
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 114871879
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 245777471
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -1876332251
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oe")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -113793529
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -2043651089
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ol")
	static boolean field668;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -1143835253
	)
	static int field669;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 22061565
	)
	static int field628;
	@ObfuscatedName("oq")
	static boolean field671;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 903753461
	)
	static int field596;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1998416981
	)
	static int field673;
	@ObfuscatedName("oz")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1738168199
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pg")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = -1421271391
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("po")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 1404029533
	)
	static int field746;
	@ObfuscatedName("pf")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 2109604157
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pe")
	static int[] field682;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 2129941941
	)
	static int field683;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 1046213047
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -80976053
	)
	static int field685;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -96614403
	)
	static int field726;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1238069005
	)
	static int field687;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -405028691
	)
	static int field749;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -1795985535
	)
	static int field689;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 514531863
	)
	static int field572;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -2000287459
	)
	static int field762;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 762274993
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static NodeDeque field694;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static NodeDeque field695;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -1183396979
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 365020005
	)
	static int field698;
	@ObfuscatedName("qk")
	static boolean[] field564;
	@ObfuscatedName("qm")
	static boolean[] field651;
	@ObfuscatedName("qh")
	static boolean[] field576;
	@ObfuscatedName("qs")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qx")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ql")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qb")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -2080658517
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		longValue = 4892386005405626473L
	)
	static long field529;
	@ObfuscatedName("qv")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("qe")
	static int[] field709;
	@ObfuscatedName("fd")
	String field518;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	class14 field519;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	class19 field618;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester field544;
	@ObfuscatedName("fi")
	Future field522;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	Buffer field525;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	class7 field526;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		longValue = -4252506564993549717L
	)
	long field658;

	static {
		field536 = true; // L: 134
		worldId = 1; // L: 135
		worldProperties = 0; // L: 136
		gameBuild = 0; // L: 138
		isMembersWorld = false; // L: 141
		isLowDetail = false; // L: 142
		field484 = -1; // L: 147
		clientType = -1; // L: 148
		field486 = -1; // L: 149
		onMobile = false; // L: 150
		gameState = 0; // L: 162
		isLoading = true; // L: 185
		cycle = 0; // L: 186
		mouseLastLastPressedTimeMillis = -1L; // L: 187
		field493 = -1; // L: 189
		field494 = -1; // L: 190
		field495 = -1L; // L: 191
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
		field510 = 0; // L: 213
		js5Errors = 0; // L: 235
		loginState = 0; // L: 237
		field513 = 0; // L: 238
		field742 = 0; // L: 239
		field490 = 0; // L: 240
		field516 = class124.field1510; // L: 241
		field517 = class441.field4672; // L: 242
		Login_isUsernameRemembered = false; // L: 261
		secureRandomFuture = new SecureRandomFuture(); // L: 262
		randomDatData = null; // L: 269
		npcs = new NPC[32768]; // L: 273
		npcCount = 0; // L: 274
		npcIndices = new int[32768]; // L: 275
		field609 = 0; // L: 276
		field533 = new int[250]; // L: 277
		packetWriter = new PacketWriter(); // L: 280
		logoutTimer = 0; // L: 282
		hadNetworkError = false; // L: 283
		useBufferedSocket = true; // L: 284
		field753 = false; // L: 285
		timer = new Timer(); // L: 286
		fontsMap = new HashMap(); // L: 292
		field541 = 0; // L: 299
		field558 = 1; // L: 300
		field543 = 0; // L: 301
		field679 = 1; // L: 302
		field545 = 0; // L: 303
		collisionMaps = new CollisionMap[4]; // L: 311
		isInInstance = false; // L: 312
		instanceChunkTemplates = new int[4][13][13]; // L: 313
		field711 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 314
		field550 = 0; // L: 317
		field619 = 2301979; // L: 329
		field684 = 5063219; // L: 330
		field554 = 3353893; // L: 331
		field514 = 7759444; // L: 332
		field556 = false; // L: 333
		alternativeScrollbarWidth = 0; // L: 334
		camAngleX = 128; // L: 342
		camAngleY = 0; // L: 343
		camAngleDY = 0; // L: 344
		camAngleDX = 0; // L: 345
		mouseCamClickedX = 0; // L: 346
		mouseCamClickedY = 0; // L: 347
		oculusOrbState = 0; // L: 348
		camFollowHeight = 50; // L: 349
		field566 = 0; // L: 353
		field567 = 0; // L: 354
		field696 = 0; // L: 355
		oculusOrbNormalSpeed = 12; // L: 357
		oculusOrbSlowedSpeed = 6; // L: 358
		field571 = 0; // L: 359
		field602 = false; // L: 360
		field542 = 0; // L: 361
		field616 = false; // L: 362
		field756 = 0; // L: 363
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
		field595 = 0; // L: 384
		field741 = 0; // L: 385
		dragItemSlotSource = 0; // L: 388
		draggedWidgetX = 0; // L: 389
		draggedWidgetY = 0; // L: 390
		dragItemSlotDestination = 0; // L: 391
		field601 = false; // L: 392
		itemDragDuration = 0; // L: 393
		field603 = 0; // L: 394
		showLoadingMessages = true; // L: 396
		players = new Player[2048]; // L: 398
		localPlayerIndex = -1; // L: 400
		field607 = 0; // L: 401
		field608 = -1L; // L: 402
		renderSelf = true; // L: 404
		drawPlayerNames = 0; // L: 409
		field634 = 0; // L: 410
		field612 = new int[1000]; // L: 411
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
		field641 = 0; // L: 450
		field642 = 50; // L: 451
		isItemSelected = 0; // L: 452
		selectedItemName = null; // L: 456
		isSpellSelected = false; // L: 457
		selectedSpellChildIndex = -1; // L: 459
		selectedSpellItemId = -1; // L: 460
		selectedSpellActionName = null; // L: 462
		selectedSpellName = null; // L: 463
		rootInterface = -1; // L: 464
		interfaceParents = new NodeHashTable(8); // L: 465
		field652 = 0; // L: 470
		field653 = -1; // L: 471
		chatEffects = 0; // L: 472
		field655 = 0; // L: 473
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
		field668 = false; // L: 486
		field669 = -1; // L: 487
		field628 = -1; // L: 488
		field671 = false; // L: 489
		field596 = -1; // L: 490
		field673 = -1; // L: 491
		isDraggingWidget = false; // L: 492
		cycleCntr = 1; // L: 497
		changedVarps = new int[32]; // L: 500
		changedVarpCount = 0; // L: 501
		changedItemContainers = new int[32]; // L: 502
		field746 = 0; // L: 503
		changedSkills = new int[32]; // L: 504
		changedSkillsCount = 0; // L: 505
		field682 = new int[32]; // L: 506
		field683 = 0; // L: 507
		chatCycle = 0; // L: 508
		field685 = 0; // L: 509
		field726 = 0; // L: 510
		field687 = 0; // L: 511
		field749 = 0; // L: 512
		field689 = 0; // L: 513
		field572 = 0; // L: 514
		field762 = 0; // L: 515
		mouseWheelRotation = 0; // L: 521
		scriptEvents = new NodeDeque(); // L: 522
		field694 = new NodeDeque(); // L: 523
		field695 = new NodeDeque(); // L: 524
		widgetFlags = new NodeHashTable(512); // L: 525
		rootWidgetCount = 0; // L: 527
		field698 = -2; // L: 528
		field564 = new boolean[100]; // L: 529
		field651 = new boolean[100]; // L: 530
		field576 = new boolean[100]; // L: 531
		rootWidgetXs = new int[100]; // L: 532
		rootWidgetYs = new int[100]; // L: 533
		rootWidgetWidths = new int[100]; // L: 534
		rootWidgetHeights = new int[100]; // L: 535
		gameDrawingMode = 0; // L: 536
		field529 = 0L; // L: 537
		isResizable = true; // L: 538
		field709 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 545
		publicChatMode = 0; // L: 546
		tradeChatMode = 0; // L: 548
		field712 = ""; // L: 549
		crossWorldMessageIds = new long[100]; // L: 551
		crossWorldMessageIdsIndex = 0; // L: 552
		field713 = 0; // L: 554
		field716 = new int[128]; // L: 555
		field568 = new int[128]; // L: 556
		field718 = -1L; // L: 557
		currentClanSettings = new ClanSettings[3]; // L: 561
		currentClanChannels = new ClanChannel[3]; // L: 563
		field721 = -1; // L: 565
		mapIconCount = 0; // L: 566
		mapIconXs = new int[1000]; // L: 567
		mapIconYs = new int[1000]; // L: 568
		mapIcons = new SpritePixels[1000]; // L: 569
		destinationX = 0; // L: 570
		destinationY = 0; // L: 571
		minimapState = 0; // L: 578
		currentTrackGroupId = -1; // L: 579
		field731 = false; // L: 580
		soundEffectCount = 0; // L: 586
		soundEffectIds = new int[50]; // L: 587
		queuedSoundEffectLoops = new int[50]; // L: 588
		queuedSoundEffectDelays = new int[50]; // L: 589
		soundLocations = new int[50]; // L: 590
		soundEffects = new SoundEffect[50]; // L: 591
		isCameraLocked = false; // L: 593
		field739 = false; // L: 604
		field740 = new boolean[5]; // L: 612
		field482 = new int[5]; // L: 613
		field549 = new int[5]; // L: 614
		field766 = new int[5]; // L: 615
		field744 = new int[5]; // L: 616
		field745 = 256; // L: 617
		field706 = 205; // L: 618
		zoomHeight = 256; // L: 619
		zoomWidth = 320; // L: 620
		field562 = 1; // L: 621
		field750 = 32767; // L: 622
		field751 = 1; // L: 623
		field752 = 32767; // L: 624
		viewportOffsetX = 0; // L: 625
		viewportOffsetY = 0; // L: 626
		viewportWidth = 0; // L: 627
		viewportHeight = 0; // L: 628
		viewportZoom = 0; // L: 629
		playerAppearance = new PlayerComposition(); // L: 631
		field759 = -1; // L: 632
		field738 = -1; // L: 633
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 635
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 637
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 640
		field764 = -1; // L: 647
		archiveLoaders = new ArrayList(10); // L: 648
		archiveLoadersDone = 0; // L: 649
		field767 = 0; // L: 650
		field477 = new ApproximateRouteStrategy(); // L: 659
		field743 = new int[50]; // L: 660
		field670 = new int[50]; // L: 661
	}

	public Client() {
		this.field658 = -1L; // L: 267
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field529 = WorldMapSprite.method4989() + 500L; // L: 3947
		this.resizeJS(); // L: 3948
		if (rootInterface != -1) { // L: 3949
			this.resizeRoot(true);
		}

	} // L: 3950

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 924
		int[] var2 = new int[]{1000, 100, 500}; // L: 925
		if (var1 != null && var2 != null) { // L: 927
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1; // L: 940
			GameObject.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 941
			ScriptEvent.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 942

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 943
				ScriptEvent.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 944
				ByteArrayPool.field4173.add(var1[var3]); // L: 945
			}

			Collections.sort(ByteArrayPool.field4173); // L: 947
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null; // L: 928
			GameObject.ByteArrayPool_altSizeArrayCounts = null; // L: 929
			ScriptEvent.ByteArrayPool_arrays = null; // L: 930
			ByteArrayPool.field4173.clear(); // L: 932
			ByteArrayPool.field4173.add(100); // L: 933
			ByteArrayPool.field4173.add(5000); // L: 934
			ByteArrayPool.field4173.add(10000); // L: 935
			ByteArrayPool.field4173.add(30000); // L: 936
		}

		class101.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 949
		BuddyRankComparator.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 950
		ItemContainer.currentPort = class101.worldPort; // L: 951
		TileItem.field1281 = class293.field3323; // L: 952
		class20.field102 = class293.field3321; // L: 953
		VerticalAlignment.field1950 = class293.field3320; // L: 954
		class160.field1747 = class293.field3326; // L: 955
		UserComparator9.urlRequester = new class101(); // L: 956
		this.setUpKeyboard(); // L: 957
		this.method534(); // L: 958
		class18.mouseWheel = this.mouseWheel(); // L: 959
		PcmPlayer.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 960
		Interpreter.clientPreferences = class349.method6537(); // L: 961
		this.setUpClipboard(); // L: 962
		String var4 = ModeWhere.field4087; // L: 964
		class29.field168 = this; // L: 966
		if (var4 != null) { // L: 967
			class29.field169 = var4;
		}

		UserComparator6.setWindowedMode(Interpreter.clientPreferences.method2317()); // L: 969
		class155.friendSystem = new FriendSystem(class83.loginType); // L: 970
		this.field519 = new class14("tokenRequest", 1, 1); // L: 971
	} // L: 972

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 976
		this.doCycleJs5(); // L: 977
		Canvas.method391(); // L: 978
		class126.method2819(); // L: 979
		MouseHandler.playPcmPlayers(); // L: 980
		synchronized(KeyHandler.KeyHandler_instance) { // L: 982
			++KeyHandler.KeyHandler_idleCycles; // L: 983
			KeyHandler.field135 = KeyHandler.field137; // L: 984
			KeyHandler.field132 = 0; // L: 985
			KeyHandler.field134 = 0; // L: 986
			Arrays.fill(KeyHandler.field121, false); // L: 987
			Arrays.fill(KeyHandler.field125, false); // L: 988
			if (KeyHandler.field124 < 0) { // L: 989
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 990
				KeyHandler.field124 = KeyHandler.field138; // L: 991
			} else {
				while (KeyHandler.field138 != KeyHandler.field124) { // L: 994
					int var2 = KeyHandler.field129[KeyHandler.field138]; // L: 995
					KeyHandler.field138 = KeyHandler.field138 + 1 & 127; // L: 996
					if (var2 < 0) { // L: 997
						var2 = ~var2; // L: 998
						if (KeyHandler.KeyHandler_pressedKeys[var2]) { // L: 999
							KeyHandler.KeyHandler_pressedKeys[var2] = false; // L: 1000
							KeyHandler.field125[var2] = true; // L: 1001
							KeyHandler.field133[KeyHandler.field134] = var2; // L: 1002
							++KeyHandler.field134; // L: 1003
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field132 < KeyHandler.field139.length - 1) { // L: 1007
							KeyHandler.field121[var2] = true; // L: 1008
							KeyHandler.field139[++KeyHandler.field132 - 1] = var2; // L: 1009
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true; // L: 1011
					}
				}
			}

			if (KeyHandler.field132 > 0) { // L: 1015
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field137 = KeyHandler.field136; // L: 1016
		}

		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1022
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1025
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1028
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1029
		} // L: 1030

		if (class18.mouseWheel != null) { // L: 1032
			int var5 = class18.mouseWheel.useRotation(); // L: 1033
			mouseWheelRotation = var5; // L: 1034
		}

		if (gameState == 0) { // L: 1036
			HorizontalAlignment.load(); // L: 1037
			class78.method2098(); // L: 1038
		} else if (gameState == 5) { // L: 1040
			class194.method3894(this, ViewportMouse.fontPlain12); // L: 1041
			HorizontalAlignment.load(); // L: 1042
			class78.method2098(); // L: 1043
		} else if (gameState != 10 && gameState != 11) { // L: 1045
			if (gameState == 20) { // L: 1046
				class194.method3894(this, ViewportMouse.fontPlain12); // L: 1047
				this.doCycleLoggedOut(); // L: 1048
			} else if (gameState == 50) { // L: 1050
				class194.method3894(this, ViewportMouse.fontPlain12); // L: 1051
				this.doCycleLoggedOut(); // L: 1052
			} else if (gameState == 25) { // L: 1054
				DirectByteArrayCopier.method5546();
			}
		} else {
			class194.method3894(this, ViewportMouse.fontPlain12);
		}

		if (gameState == 30) { // L: 1055
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1056
			this.doCycleLoggedOut();
		}

	} // L: 1057

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1683905481"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = class356.method6621(); // L: 1061
		if (var2 && field731 && class290.pcmPlayer0 != null) { // L: 1062 1063
			class290.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field529 != 0L && WorldMapSprite.method4989() > field529) { // L: 1065 1066
			UserComparator6.setWindowedMode(ReflectionCheck.getWindowedMode()); // L: 1067
		}

		int var3;
		if (var1) { // L: 1070
			for (var3 = 0; var3 < 100; ++var3) { // L: 1071
				field564[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1073
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1074
			class132.drawTitle(FloorOverlayDefinition.fontBold12, TextureProvider.fontPlain11, ViewportMouse.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1075
			if (gameState == 20) { // L: 1076
				class132.drawTitle(FloorOverlayDefinition.fontBold12, TextureProvider.fontPlain11, ViewportMouse.fontPlain12);
			} else if (gameState == 50) { // L: 1077
				class132.drawTitle(FloorOverlayDefinition.fontBold12, TextureProvider.fontPlain11, ViewportMouse.fontPlain12);
			} else if (gameState == 25) { // L: 1078
				if (field545 == 1) { // L: 1079
					if (field541 > field558) { // L: 1080
						field558 = field541;
					}

					var3 = (field558 * 50 - field541 * 50) / field558; // L: 1081
					class119.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1082
				} else if (field545 == 2) { // L: 1084
					if (field543 > field679) { // L: 1085
						field679 = field543;
					}

					var3 = (field679 * 50 - field543 * 50) / field679 + 50; // L: 1086
					class119.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1087
				} else {
					class119.drawLoadingMessage("Loading - please wait.", false); // L: 1089
				}
			} else if (gameState == 30) { // L: 1091
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1092
				class119.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1093
				class119.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class132.drawTitle(FloorOverlayDefinition.fontBold12, TextureProvider.fontPlain11, ViewportMouse.fontPlain12); // L: 1083
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1094
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1095
				if (field651[var3]) { // L: 1096
					SpotAnimationDefinition.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1097
					field651[var3] = false; // L: 1098
				}
			}
		} else if (gameState > 0) { // L: 1102
			SpotAnimationDefinition.rasterProvider.drawFull(0, 0); // L: 1103

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1104
				field651[var3] = false;
			}
		}

	} // L: 1106

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2114912088"
	)
	@Export("kill0")
	protected final void kill0() {
		if (JagexCache.varcs.hasUnwrittenChanges()) { // L: 1109
			JagexCache.varcs.write();
		}

		if (BuddyRankComparator.mouseRecorder != null) { // L: 1110
			BuddyRankComparator.mouseRecorder.isRunning = false;
		}

		BuddyRankComparator.mouseRecorder = null; // L: 1111
		packetWriter.close(); // L: 1112
		if (KeyHandler.KeyHandler_instance != null) { // L: 1114
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1115
				KeyHandler.KeyHandler_instance = null; // L: 1116
			} // L: 1117
		}

		class160.method3237(); // L: 1120
		class18.mouseWheel = null; // L: 1121
		if (class290.pcmPlayer0 != null) { // L: 1122
			class290.pcmPlayer0.shutdown();
		}

		if (class182.pcmPlayer1 != null) { // L: 1123
			class182.pcmPlayer1.shutdown();
		}

		class309.method5804(); // L: 1124
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1126
			if (ArchiveDiskActionHandler.field3940 != 0) { // L: 1127
				ArchiveDiskActionHandler.field3940 = 1; // L: 1128

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1130
				} catch (InterruptedException var4) { // L: 1132
				}
			}
		}

		if (UserComparator9.urlRequester != null) { // L: 1136
			UserComparator9.urlRequester.close(); // L: 1137
			UserComparator9.urlRequester = null; // L: 1138
		}

		World.method1655(); // L: 1140
		this.field519.method178(); // L: 1141
	} // L: 1142

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	protected final void vmethod1135() {
	} // L: 668

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1620120590"
	)
	boolean method1138() {
		return AbstractWorldMapData.field2796 != null && !AbstractWorldMapData.field2796.trim().isEmpty(); // L: 903
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "34"
	)
	boolean method1139() {
		return this.field544 != null; // L: 907
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "70"
	)
	void method1146(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(class124.field1518 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 911
		OtlTokenRequester var3 = this.field544; // L: 912
		if (var3 != null) { // L: 913
			this.field522 = var3.request(var2); // L: 914
		} else {
			class10 var4 = new class10(var2, class9.field44); // L: 917
			var4.method87("Authorization", "Bearer " + var1); // L: 918
			this.field618 = this.field519.method180(var4); // L: 919
		}
	} // L: 915 920

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1743294306"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1191
			boolean var1 = class65.method1875(); // L: 1192
			if (!var1) { // L: 1193
				this.doCycleJs5Connect();
			}

		}
	} // L: 1194

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1720635301"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1197
			this.error("js5crc"); // L: 1198
			InterfaceParent.updateGameState(1000); // L: 1199
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1202
				if (gameState <= 5) { // L: 1203
					this.error("js5io"); // L: 1204
					InterfaceParent.updateGameState(1000); // L: 1205
					return; // L: 1206
				}

				field510 = 3000; // L: 1209
				NetCache.NetCache_ioExceptions = 3; // L: 1210
			}

			if (--field510 + 1 <= 0) { // L: 1213
				try {
					if (js5ConnectState == 0) { // L: 1215
						class194.js5SocketTask = class434.taskHandler.newSocketTask(GrandExchangeOfferOwnWorldComparator.worldHost, ItemContainer.currentPort); // L: 1216
						++js5ConnectState; // L: 1217
					}

					if (js5ConnectState == 1) { // L: 1219
						if (class194.js5SocketTask.status == 2) { // L: 1220
							this.js5Error(-1); // L: 1221
							return; // L: 1222
						}

						if (class194.js5SocketTask.status == 1) { // L: 1224
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1226
						if (useBufferedSocket) { // L: 1227
							Socket var2 = (Socket)class194.js5SocketTask.result; // L: 1229
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1231
							ApproximateRouteStrategy.js5Socket = var1; // L: 1233
						} else {
							ApproximateRouteStrategy.js5Socket = new NetSocket((Socket)class194.js5SocketTask.result, class434.taskHandler, 5000); // L: 1236
						}

						Buffer var11 = new Buffer(5); // L: 1238
						var11.writeByte(15); // L: 1239
						var11.writeInt(204); // L: 1240
						ApproximateRouteStrategy.js5Socket.write(var11.array, 0, 5); // L: 1241
						++js5ConnectState; // L: 1242
						class29.field165 = WorldMapSprite.method4989(); // L: 1243
					}

					if (js5ConnectState == 3) { // L: 1245
						if (ApproximateRouteStrategy.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1246
							int var5 = ApproximateRouteStrategy.js5Socket.readUnsignedByte(); // L: 1247
							if (var5 != 0) { // L: 1248
								this.js5Error(var5); // L: 1249
								return; // L: 1250
							}

							++js5ConnectState; // L: 1252
						} else if (WorldMapSprite.method4989() - class29.field165 > 30000L) { // L: 1255
							this.js5Error(-2); // L: 1256
							return; // L: 1257
						}
					}

					if (js5ConnectState == 4) { // L: 1261
						AbstractSocket var12 = ApproximateRouteStrategy.js5Socket; // L: 1262
						boolean var6 = gameState > 20; // L: 1263
						if (NetCache.NetCache_socket != null) { // L: 1265
							try {
								NetCache.NetCache_socket.close(); // L: 1267
							} catch (Exception var9) { // L: 1269
							}

							NetCache.NetCache_socket = null; // L: 1270
						}

						NetCache.NetCache_socket = var12; // L: 1272
						NPC.method2366(var6); // L: 1273
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1274
						NetCache.NetCache_currentResponse = null; // L: 1275
						class291.NetCache_responseArchiveBuffer = null; // L: 1276
						NetCache.field3990 = 0; // L: 1277

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1279
							if (var3 == null) { // L: 1280
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1286
									if (var3 == null) { // L: 1287
										if (NetCache.field3999 != 0) { // L: 1293
											try {
												Buffer var13 = new Buffer(4); // L: 1295
												var13.writeByte(4); // L: 1296
												var13.writeByte(NetCache.field3999); // L: 1297
												var13.writeShort(0); // L: 1298
												NetCache.NetCache_socket.write(var13.array, 0, 4); // L: 1299
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1303
												} catch (Exception var7) { // L: 1305
												}

												++NetCache.NetCache_ioExceptions; // L: 1306
												NetCache.NetCache_socket = null; // L: 1307
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1310
										NetCache.field3976 = WorldMapSprite.method4989(); // L: 1311
										class194.js5SocketTask = null; // L: 1313
										ApproximateRouteStrategy.js5Socket = null; // L: 1314
										js5ConnectState = 0; // L: 1315
										js5Errors = 0; // L: 1316
										return; // L: 1322
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1288
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1289
									++NetCache.NetCache_pendingWritesCount; // L: 1290
									--NetCache.NetCache_pendingResponsesCount; // L: 1291
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1281
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1282
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1283
						}
					}
				} catch (IOException var10) { // L: 1319
					this.js5Error(-3); // L: 1320
				}

			}
		}
	} // L: 1200

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1597130616"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class194.js5SocketTask = null; // L: 1325
		ApproximateRouteStrategy.js5Socket = null; // L: 1326
		js5ConnectState = 0; // L: 1327
		if (ItemContainer.currentPort == class101.worldPort) { // L: 1328
			ItemContainer.currentPort = BuddyRankComparator.js5Port;
		} else {
			ItemContainer.currentPort = class101.worldPort; // L: 1329
		}

		++js5Errors; // L: 1330
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1331
			if (gameState <= 5) { // L: 1332
				this.error("js5connect_full"); // L: 1333
				InterfaceParent.updateGameState(1000); // L: 1334
			} else {
				field510 = 3000; // L: 1336
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1338
			this.error("js5connect_outofdate"); // L: 1339
			InterfaceParent.updateGameState(1000); // L: 1340
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				InterfaceParent.updateGameState(1000); // L: 1345
			} else {
				field510 = 3000;
			}
		}

	} // L: 1349

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1515563233"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1770
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1771

		try {
			if (loginState == 0) { // L: 1773
				if (class260.secureRandom == null && (secureRandomFuture.isDone() || field513 > 250)) { // L: 1774
					class260.secureRandom = secureRandomFuture.get(); // L: 1775
					secureRandomFuture.shutdown(); // L: 1776
					secureRandomFuture = null; // L: 1777
				}

				if (class260.secureRandom != null) { // L: 1779
					if (var1 != null) { // L: 1780
						((AbstractSocket)var1).close(); // L: 1781
						var1 = null; // L: 1782
					}

					WorldMapEvent.socketTask = null; // L: 1784
					hadNetworkError = false; // L: 1785
					field513 = 0; // L: 1786
					if (field517.method8013()) { // L: 1787
						try {
							this.method1146(AbstractWorldMapData.field2796); // L: 1789
							UrlRequester.method2533(20); // L: 1790
						} catch (Throwable var23) { // L: 1792
							class301.RunException_sendStackTrace((String)null, var23); // L: 1793
							class150.getLoginError(65); // L: 1794
							return; // L: 1795
						}
					} else {
						UrlRequester.method2533(1); // L: 1799
					}
				}
			}

			if (loginState == 20) { // L: 1803
				if (this.field522 != null) { // L: 1804
					if (!this.field522.isDone()) { // L: 1805
						return; // L: 1806
					}

					if (this.field522.isCancelled()) { // L: 1808
						class150.getLoginError(65); // L: 1809
						this.field522 = null; // L: 1810
						return; // L: 1811
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.field522.get(); // L: 1814
						if (!var3.isSuccess()) { // L: 1815
							class150.getLoginError(65); // L: 1816
							this.field522 = null; // L: 1817
							return; // L: 1818
						}

						this.field518 = var3.getToken(); // L: 1820
						this.field522 = null; // L: 1821
					} catch (Exception var22) { // L: 1823
						class301.RunException_sendStackTrace((String)null, var22); // L: 1824
						class150.getLoginError(65); // L: 1825
						this.field522 = null; // L: 1826
						return; // L: 1827
					}
				} else {
					if (this.field618 == null) { // L: 1830
						class150.getLoginError(65); // L: 1851
						return; // L: 1852
					}

					if (!this.field618.method303()) { // L: 1831
						return; // L: 1832
					}

					if (this.field618.method316()) { // L: 1834
						class301.RunException_sendStackTrace(this.field618.method299(), (Throwable)null); // L: 1835
						class150.getLoginError(65); // L: 1836
						this.field618 = null; // L: 1837
						return; // L: 1838
					}

					class21 var25 = this.field618.method301(); // L: 1840
					if (var25.method328() != 200) { // L: 1841
						class301.RunException_sendStackTrace("Response code: " + var25.method328() + "Response body: " + var25.method330(), (Throwable)null); // L: 1842
						class150.getLoginError(65); // L: 1843
						this.field618 = null; // L: 1844
						return; // L: 1845
					}

					this.field518 = var25.method330(); // L: 1847
					this.field618 = null; // L: 1848
				}

				field513 = 0; // L: 1854
				UrlRequester.method2533(1); // L: 1855
			}

			if (loginState == 1) { // L: 1857
				if (WorldMapEvent.socketTask == null) { // L: 1858
					WorldMapEvent.socketTask = class434.taskHandler.newSocketTask(GrandExchangeOfferOwnWorldComparator.worldHost, ItemContainer.currentPort); // L: 1859
				}

				if (WorldMapEvent.socketTask.status == 2) { // L: 1861
					throw new IOException();
				}

				if (WorldMapEvent.socketTask.status == 1) { // L: 1862
					if (useBufferedSocket) { // L: 1863
						Socket var4 = (Socket)WorldMapEvent.socketTask.result; // L: 1865
						BufferedNetSocket var26 = new BufferedNetSocket(var4, 40000, 5000); // L: 1867
						var1 = var26; // L: 1869
					} else {
						var1 = new NetSocket((Socket)WorldMapEvent.socketTask.result, class434.taskHandler, 5000); // L: 1872
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 1874
					WorldMapEvent.socketTask = null; // L: 1875
					UrlRequester.method2533(2); // L: 1876
				}
			}

			PacketBufferNode var27;
			if (loginState == 2) { // L: 1879
				packetWriter.clearBuffer(); // L: 1880
				var27 = FriendSystem.method1723(); // L: 1881
				var27.packetBuffer.writeByte(LoginPacket.field3135.id); // L: 1882
				packetWriter.addNode(var27); // L: 1883
				packetWriter.flush(); // L: 1884
				var2.offset = 0; // L: 1885
				UrlRequester.method2533(3); // L: 1886
			}

			boolean var12;
			int var13;
			if (loginState == 3) { // L: 1888
				if (class290.pcmPlayer0 != null) { // L: 1889
					class290.pcmPlayer0.method722();
				}

				if (class182.pcmPlayer1 != null) { // L: 1890
					class182.pcmPlayer1.method722();
				}

				var12 = true; // L: 1891
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 1892 1893
					var12 = false;
				}

				if (var12) { // L: 1895
					var13 = ((AbstractSocket)var1).readUnsignedByte(); // L: 1896
					if (class290.pcmPlayer0 != null) { // L: 1897
						class290.pcmPlayer0.method722();
					}

					if (class182.pcmPlayer1 != null) { // L: 1898
						class182.pcmPlayer1.method722();
					}

					if (var13 != 0) { // L: 1899
						class150.getLoginError(var13); // L: 1900
						return; // L: 1901
					}

					var2.offset = 0; // L: 1903
					UrlRequester.method2533(4); // L: 1904
				}
			}

			int var40;
			if (loginState == 4) { // L: 1907
				if (var2.offset < 8) { // L: 1908
					var40 = ((AbstractSocket)var1).available(); // L: 1909
					if (var40 > 8 - var2.offset) { // L: 1910
						var40 = 8 - var2.offset;
					}

					if (var40 > 0) { // L: 1911
						((AbstractSocket)var1).read(var2.array, var2.offset, var40); // L: 1912
						var2.offset += var40; // L: 1913
					}
				}

				if (var2.offset == 8) { // L: 1916
					var2.offset = 0; // L: 1917
					class121.field1479 = var2.readLong(); // L: 1918
					UrlRequester.method2533(5); // L: 1919
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) { // L: 1922
				packetWriter.packetBuffer.offset = 0; // L: 1923
				packetWriter.clearBuffer(); // L: 1924
				PacketBuffer var28 = new PacketBuffer(500); // L: 1925
				int[] var29 = new int[]{class260.secureRandom.nextInt(), class260.secureRandom.nextInt(), class260.secureRandom.nextInt(), class260.secureRandom.nextInt()}; // L: 1926 1927 1928 1929 1930
				var28.offset = 0; // L: 1931
				var28.writeByte(1); // L: 1932
				var28.writeInt(var29[0]); // L: 1933
				var28.writeInt(var29[1]); // L: 1934
				var28.writeInt(var29[2]); // L: 1935
				var28.writeInt(var29[3]); // L: 1936
				var28.writeLong(class121.field1479); // L: 1937
				int var11;
				if (gameState == 40) { // L: 1938
					var28.writeInt(NPCComposition.field1918[0]); // L: 1939
					var28.writeInt(NPCComposition.field1918[1]); // L: 1940
					var28.writeInt(NPCComposition.field1918[2]); // L: 1941
					var28.writeInt(NPCComposition.field1918[3]); // L: 1942
				} else {
					if (gameState == 50) { // L: 1945
						var28.writeByte(class124.field1512.rsOrdinal()); // L: 1946
						var28.writeInt(class9.field35); // L: 1947
					} else {
						var28.writeByte(field516.rsOrdinal()); // L: 1950
						switch(field516.field1513) { // L: 1951
						case 0:
						case 3:
							var28.writeMedium(UrlRequest.field1346); // L: 1975
							++var28.offset; // L: 1976
							break;
						case 1:
							LinkedHashMap var6 = Interpreter.clientPreferences.parameters; // L: 1955
							String var8 = Login.Login_username; // L: 1957
							var9 = var8.length(); // L: 1959
							int var10 = 0; // L: 1960

							for (var11 = 0; var11 < var9; ++var11) { // L: 1961
								var10 = (var10 << 5) - var10 + var8.charAt(var11);
							}

							var28.writeInt((Integer)var6.get(var10)); // L: 1964
							break; // L: 1965
						case 2:
							var28.offset += 4; // L: 1969
						}
					}

					if (field517.method8013()) { // L: 1981
						var28.writeByte(class441.field4667.rsOrdinal()); // L: 1982
						var28.writeStringCp1252NullTerminated(this.field518); // L: 1983
					} else {
						var28.writeByte(class441.field4672.rsOrdinal()); // L: 1986
						var28.writeStringCp1252NullTerminated(Login.Login_password); // L: 1987
					}
				}

				var28.encryptRsa(class67.field875, class67.field878); // L: 1990
				NPCComposition.field1918 = var29; // L: 1991
				PacketBufferNode var5 = FriendSystem.method1723(); // L: 1992
				var5.packetBuffer.offset = 0; // L: 1993
				if (gameState == 40) { // L: 1994
					var5.packetBuffer.writeByte(LoginPacket.field3134.id); // L: 1995
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3133.id); // L: 1998
				}

				var5.packetBuffer.writeShort(0); // L: 2000
				var14 = var5.packetBuffer.offset; // L: 2001
				var5.packetBuffer.writeInt(204); // L: 2002
				var5.packetBuffer.writeInt(1); // L: 2003
				var5.packetBuffer.writeByte(clientType); // L: 2004
				var5.packetBuffer.writeByte(field486); // L: 2005
				var5.packetBuffer.writeBytes(var28.array, 0, var28.offset); // L: 2006
				var7 = var5.packetBuffer.offset; // L: 2007
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2008
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2009
				var5.packetBuffer.writeShort(class4.canvasWidth); // L: 2010
				var5.packetBuffer.writeShort(class309.canvasHeight); // L: 2011
				PacketBuffer var38 = var5.packetBuffer; // L: 2012
				if (randomDatData != null) { // L: 2014
					var38.writeBytes(randomDatData, 0, randomDatData.length); // L: 2015
				} else {
					byte[] var15 = class67.method1878(); // L: 2018
					var38.writeBytes(var15, 0, var15.length); // L: 2019
				}

				if (!class429.field4593.endsWith(";A")) { // L: 2021
					class429.field4593 = class429.field4593 + ";A"; // L: 2022
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(class429.field4593); // L: 2024
				var5.packetBuffer.writeInt(class7.field27); // L: 2025
				Buffer var42 = new Buffer(UserComparator2.platformInfo.size()); // L: 2026
				UserComparator2.platformInfo.write(var42); // L: 2027
				var5.packetBuffer.writeBytes(var42.array, 0, var42.array.length); // L: 2028
				var5.packetBuffer.writeByte(clientType); // L: 2029
				var5.packetBuffer.writeInt(0); // L: 2030
				var5.packetBuffer.writeInt(class268.archive11.hash); // L: 2031
				var5.packetBuffer.method7806(ReflectionCheck.archive20.hash); // L: 2032
				var5.packetBuffer.writeIntME(DevicePcmPlayerProvider.archive14.hash); // L: 2033
				var5.packetBuffer.writeInt(WorldMapData_1.archive8.hash); // L: 2034
				var5.packetBuffer.writeIntME(FloorOverlayDefinition.archive2.hash); // L: 2035
				var5.packetBuffer.writeIntME(class202.archive19.hash); // L: 2036
				var5.packetBuffer.method7806(0); // L: 2037
				var5.packetBuffer.method7746(MouseHandler.archive4.hash); // L: 2038
				var5.packetBuffer.writeInt(class132.archive9.hash); // L: 2039
				var5.packetBuffer.writeIntME(World.archive10.hash); // L: 2040
				var5.packetBuffer.writeInt(class4.archive13.hash); // L: 2041
				var5.packetBuffer.method7806(JagexCache.archive18.hash); // L: 2042
				var5.packetBuffer.method7806(ViewportMouse.archive15.hash); // L: 2043
				var5.packetBuffer.method7746(class145.archive7.hash); // L: 2044
				var5.packetBuffer.method7746(ArchiveLoader.archive6.hash); // L: 2045
				var5.packetBuffer.writeInt(class302.archive5.hash); // L: 2046
				var5.packetBuffer.method7806(class121.archive3.hash); // L: 2047
				var5.packetBuffer.method7746(class321.archive1.hash); // L: 2048
				var5.packetBuffer.method7806(ArchiveLoader.archive17.hash); // L: 2049
				var5.packetBuffer.writeIntME(TileItem.archive0.hash); // L: 2050
				var5.packetBuffer.writeInt(class135.archive12.hash); // L: 2051
				var5.packetBuffer.xteaEncrypt(var29, var7, var5.packetBuffer.offset); // L: 2052
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14); // L: 2053
				packetWriter.addNode(var5); // L: 2054
				packetWriter.flush(); // L: 2055
				packetWriter.isaacCipher = new IsaacCipher(var29); // L: 2056
				int[] var16 = new int[4]; // L: 2057

				for (var11 = 0; var11 < 4; ++var11) { // L: 2058
					var16[var11] = var29[var11] + 50;
				}

				var2.newIsaacCipher(var16); // L: 2059
				UrlRequester.method2533(6); // L: 2060
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2062 2063
				var40 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2064
				if (var40 == 61) { // L: 2065
					var13 = ((AbstractSocket)var1).available(); // L: 2066
					class260.field2888 = var13 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2067
					UrlRequester.method2533(5); // L: 2068
				}

				if (var40 == 21 && gameState == 20) { // L: 2070
					UrlRequester.method2533(12); // L: 2071
				} else if (var40 == 2) { // L: 2073
					UrlRequester.method2533(14); // L: 2074
				} else if (var40 == 15 && gameState == 40) { // L: 2076
					packetWriter.serverPacketLength = -1; // L: 2077
					UrlRequester.method2533(19); // L: 2078
				} else if (var40 == 64) { // L: 2080
					UrlRequester.method2533(10); // L: 2081
				} else if (var40 == 23 && field742 < 1) { // L: 2083
					++field742; // L: 2084
					UrlRequester.method2533(0); // L: 2085
				} else if (var40 == 29) { // L: 2087
					UrlRequester.method2533(17); // L: 2088
				} else {
					if (var40 != 69) { // L: 2090
						class150.getLoginError(var40); // L: 2094
						return; // L: 2095
					}

					UrlRequester.method2533(7); // L: 2091
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2099 2100
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2101
				var2.offset = 0; // L: 2102
				class116.field1418 = var2.readUnsignedShort(); // L: 2103
				UrlRequester.method2533(8); // L: 2104
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class116.field1418) { // L: 2107 2108
				var2.offset = 0; // L: 2109
				((AbstractSocket)var1).read(var2.array, var2.offset, class116.field1418); // L: 2110
				class6 var30 = JagexCache.method3224()[var2.readUnsignedByte()]; // L: 2111

				try {
					class3 var31 = class385.method7027(var30); // L: 2113
					this.field526 = new class7(var2, var31); // L: 2114
					UrlRequester.method2533(9); // L: 2115
				} catch (Exception var21) { // L: 2117
					class150.getLoginError(22); // L: 2118
					return; // L: 2119
				}
			}

			if (loginState == 9 && this.field526.method42()) { // L: 2123 2124
				this.field525 = this.field526.method44(); // L: 2125
				this.field526.method43(); // L: 2126
				this.field526 = null; // L: 2127
				if (this.field525 == null) { // L: 2128
					class150.getLoginError(22); // L: 2129
					return; // L: 2130
				}

				packetWriter.clearBuffer(); // L: 2132
				var27 = FriendSystem.method1723(); // L: 2133
				var27.packetBuffer.writeByte(LoginPacket.field3137.id); // L: 2134
				var27.packetBuffer.writeShort(this.field525.offset); // L: 2135
				var27.packetBuffer.method7818(this.field525); // L: 2136
				packetWriter.addNode(var27); // L: 2137
				packetWriter.flush(); // L: 2138
				this.field525 = null; // L: 2139
				UrlRequester.method2533(6); // L: 2140
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2143 2144
				WorldMapSectionType.field2768 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2145
				UrlRequester.method2533(11); // L: 2146
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= WorldMapSectionType.field2768) { // L: 2149 2150
				((AbstractSocket)var1).read(var2.array, 0, WorldMapSectionType.field2768); // L: 2151
				var2.offset = 0; // L: 2152
				UrlRequester.method2533(6); // L: 2153
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2156 2157
				field490 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2158
				UrlRequester.method2533(13); // L: 2159
			}

			if (loginState == 13) { // L: 2162
				field513 = 0; // L: 2163
				GrandExchangeEvent.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field490 / 60 + " seconds."); // L: 2164
				if (--field490 <= 0) { // L: 2165
					UrlRequester.method2533(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2168 2169
					class124.field1514 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2170
					UrlRequester.method2533(15); // L: 2171
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= class124.field1514) { // L: 2174 2175
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2176
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2177
					var2.offset = 0; // L: 2178
					boolean var41 = false; // L: 2179
					if (var12) { // L: 2180
						var13 = var2.readByteIsaac() << 24; // L: 2181
						var13 |= var2.readByteIsaac() << 16; // L: 2182
						var13 |= var2.readByteIsaac() << 8; // L: 2183
						var13 |= var2.readByteIsaac(); // L: 2184
						String var37 = Login.Login_username; // L: 2186
						var7 = var37.length(); // L: 2188
						int var17 = 0; // L: 2189
						var9 = 0; // L: 2190

						while (true) {
							if (var9 >= var7) {
								if (Interpreter.clientPreferences.parameters.size() >= 10 && !Interpreter.clientPreferences.parameters.containsKey(var17)) { // L: 2194 2195
									Iterator var39 = Interpreter.clientPreferences.parameters.entrySet().iterator(); // L: 2196
									var39.next(); // L: 2197
									var39.remove(); // L: 2198
								}

								Interpreter.clientPreferences.parameters.put(var17, var13); // L: 2201
								break;
							}

							var17 = (var17 << 5) - var17 + var37.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2203
						Interpreter.clientPreferences.method2316(Login.Login_username); // L: 2204
					} else {
						Interpreter.clientPreferences.method2316((String)null); // L: 2207
					}

					class307.savePreferences(); // L: 2209
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2210
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2211
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2212
					localPlayerIndex <<= 8; // L: 2213
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2214
					field607 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2215
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2216
					var2.offset = 0; // L: 2217
					this.field658 = var2.readLong(); // L: 2218
					if (class124.field1514 >= 29) { // L: 2219
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2220
						var2.offset = 0; // L: 2221
						field608 = var2.readLong(); // L: 2222
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2224
					var2.offset = 0; // L: 2225
					ServerPacket[] var34 = class230.ServerPacket_values(); // L: 2226
					var14 = var2.readSmartByteShortIsaac(); // L: 2227
					if (var14 < 0 || var14 >= var34.length) { // L: 2228
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var34[var14]; // L: 2229
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2230
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2231
					var2.offset = 0; // L: 2232
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2233

					try {
						Client var19 = UserComparator10.client; // L: 2235
						JSObject.getWindow(var19).call("zap", (Object[])null); // L: 2238
					} catch (Throwable var20) { // L: 2241
					}

					UrlRequester.method2533(16); // L: 2242
				}

				if (loginState == 16) { // L: 2245
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2246
						var2.offset = 0; // L: 2247
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2248
						timer.method6597(); // L: 2249
						PacketWriter.method2489(); // L: 2250
						Strings.updatePlayer(var2); // L: 2251
						class193.field2197 = -1; // L: 2252
						class146.loadRegions(false, var2); // L: 2253
						packetWriter.serverPacket = null; // L: 2254
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2258 2259
						var2.offset = 0; // L: 2260
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2261
						var2.offset = 0; // L: 2262
						class142.field1634 = var2.readUnsignedShort(); // L: 2263
						UrlRequester.method2533(18); // L: 2264
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class142.field1634) { // L: 2267 2268
						var2.offset = 0; // L: 2269
						((AbstractSocket)var1).read(var2.array, 0, class142.field1634); // L: 2270
						var2.offset = 0; // L: 2271
						String var33 = var2.readStringCp1252NullTerminated(); // L: 2272
						String var32 = var2.readStringCp1252NullTerminated(); // L: 2273
						String var35 = var2.readStringCp1252NullTerminated(); // L: 2274
						GrandExchangeEvent.setLoginResponseString(var33, var32, var35); // L: 2275
						InterfaceParent.updateGameState(10); // L: 2276
					}

					if (loginState != 19) { // L: 2279
						++field513; // L: 2326
						if (field513 > 2000) { // L: 2327
							if (field742 < 1) { // L: 2328
								if (ItemContainer.currentPort == class101.worldPort) { // L: 2329
									ItemContainer.currentPort = BuddyRankComparator.js5Port;
								} else {
									ItemContainer.currentPort = class101.worldPort; // L: 2330
								}

								++field742; // L: 2331
								UrlRequester.method2533(0); // L: 2332
							} else {
								class150.getLoginError(-3); // L: 2335
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2280
							if (((AbstractSocket)var1).available() < 2) { // L: 2281
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2282
							var2.offset = 0; // L: 2283
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2284
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2286
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2287
							var2.offset = 0; // L: 2288
							var40 = packetWriter.serverPacketLength; // L: 2289
							timer.method6598(); // L: 2290
							packetWriter.clearBuffer(); // L: 2292
							packetWriter.packetBuffer.offset = 0; // L: 2293
							packetWriter.serverPacket = null; // L: 2294
							packetWriter.field1320 = null; // L: 2295
							packetWriter.field1329 = null; // L: 2296
							packetWriter.field1331 = null; // L: 2297
							packetWriter.serverPacketLength = 0; // L: 2298
							packetWriter.field1326 = 0; // L: 2299
							rebootTimer = 0; // L: 2300
							class268.method5228(); // L: 2301
							minimapState = 0; // L: 2302
							destinationX = 0; // L: 2303

							for (var13 = 0; var13 < 2048; ++var13) { // L: 2304
								players[var13] = null;
							}

							class19.localPlayer = null; // L: 2305

							for (var13 = 0; var13 < npcs.length; ++var13) { // L: 2306
								NPC var36 = npcs[var13]; // L: 2307
								if (var36 != null) { // L: 2308
									var36.targetIndex = -1; // L: 2309
									var36.false0 = false; // L: 2310
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32); // L: 2314
							InterfaceParent.updateGameState(30); // L: 2316

							for (var13 = 0; var13 < 100; ++var13) { // L: 2317
								field564[var13] = true;
							}

							class17.method228(); // L: 2318
							Strings.updatePlayer(var2); // L: 2320
							if (var40 != var2.offset) { // L: 2321
								throw new RuntimeException(); // L: 2322
							}
						}
					}
				}
			}
		} catch (IOException var24) { // L: 2339
			if (field742 < 1) { // L: 2340
				if (ItemContainer.currentPort == class101.worldPort) { // L: 2341
					ItemContainer.currentPort = BuddyRankComparator.js5Port;
				} else {
					ItemContainer.currentPort = class101.worldPort; // L: 2342
				}

				++field742; // L: 2343
				UrlRequester.method2533(0); // L: 2344
			} else {
				class150.getLoginError(-2); // L: 2347
			}
		}
	} // L: 2166 2256 2324 2333 2336 2345 2348 2350

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2093046778"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2678
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2679
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2680
			hadNetworkError = false; // L: 2681
			class9.method64(); // L: 2682
		} else {
			if (!isMenuOpen) { // L: 2685
				VarpDefinition.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1153(packetWriter); ++var1) { // L: 2686 2687
			}

			if (gameState == 30) { // L: 2689
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 2693
					boolean var30;
					if (var2 == null) { // L: 2694
						var30 = false; // L: 2695
					} else {
						var30 = true; // L: 2698
					}

					int var3;
					PacketBufferNode var31;
					if (!var30) { // L: 2700
						PacketBufferNode var14;
						int var15;
						if (timer.field4182) { // L: 2708
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2935, packetWriter.isaacCipher); // L: 2710
							var14.packetBuffer.writeByte(0); // L: 2711
							var15 = var14.packetBuffer.offset; // L: 2712
							timer.write(var14.packetBuffer); // L: 2713
							var14.packetBuffer.method7756(var14.packetBuffer.offset - var15); // L: 2714
							packetWriter.addNode(var14); // L: 2715
							timer.method6593(); // L: 2716
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
						synchronized(BuddyRankComparator.mouseRecorder.lock) { // L: 2719
							if (!field536) { // L: 2720
								BuddyRankComparator.mouseRecorder.index = 0; // L: 2806
							} else if (MouseHandler.MouseHandler_lastButton != 0 || BuddyRankComparator.mouseRecorder.index >= 40) { // L: 2721
								var31 = null; // L: 2723
								var3 = 0; // L: 2724
								var4 = 0; // L: 2725
								var5 = 0; // L: 2726
								var6 = 0; // L: 2727

								for (var7 = 0; var7 < BuddyRankComparator.mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) { // L: 2728 2729
									var4 = var7; // L: 2730
									var8 = BuddyRankComparator.mouseRecorder.ys[var7]; // L: 2731
									if (var8 < -1) { // L: 2732
										var8 = -1;
									} else if (var8 > 65534) { // L: 2733
										var8 = 65534;
									}

									var9 = BuddyRankComparator.mouseRecorder.xs[var7]; // L: 2734
									if (var9 < -1) { // L: 2735
										var9 = -1;
									} else if (var9 > 65534) { // L: 2736
										var9 = 65534;
									}

									if (var9 != field493 || var8 != field494) { // L: 2737
										if (var31 == null) { // L: 2740
											var31 = ItemContainer.getPacketBufferNode(ClientPacket.field2965, packetWriter.isaacCipher); // L: 2741
											var31.packetBuffer.writeByte(0); // L: 2742
											var3 = var31.packetBuffer.offset; // L: 2743
											var10000 = var31.packetBuffer; // L: 2744
											var10000.offset += 2;
											var5 = 0; // L: 2745
											var6 = 0; // L: 2746
										}

										if (-1L != field495) { // L: 2751
											var10 = var9 - field493; // L: 2752
											var11 = var8 - field494; // L: 2753
											var12 = (int)((BuddyRankComparator.mouseRecorder.millis[var7] - field495) / 20L); // L: 2754
											var5 = (int)((long)var5 + (BuddyRankComparator.mouseRecorder.millis[var7] - field495) % 20L); // L: 2755
										} else {
											var10 = var9; // L: 2758
											var11 = var8; // L: 2759
											var12 = Integer.MAX_VALUE; // L: 2760
										}

										field493 = var9; // L: 2762
										field494 = var8; // L: 2763
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2764
											var10 += 32; // L: 2765
											var11 += 32; // L: 2766
											var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2767
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2769
											var10 += 128; // L: 2770
											var11 += 128; // L: 2771
											var31.packetBuffer.writeByte(var12 + 128); // L: 2772
											var31.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2773
										} else if (var12 < 32) { // L: 2775
											var31.packetBuffer.writeByte(var12 + 192); // L: 2776
											if (var9 != -1 && var8 != -1) { // L: 2777
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 2778
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var31.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 2781
											if (var9 != -1 && var8 != -1) { // L: 2782
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 2783
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 2785
										field495 = BuddyRankComparator.mouseRecorder.millis[var7]; // L: 2786
									}
								}

								if (var31 != null) { // L: 2788
									var31.packetBuffer.method7756(var31.packetBuffer.offset - var3); // L: 2789
									var7 = var31.packetBuffer.offset; // L: 2790
									var31.packetBuffer.offset = var3; // L: 2791
									var31.packetBuffer.writeByte(var5 / var6); // L: 2792
									var31.packetBuffer.writeByte(var5 % var6); // L: 2793
									var31.packetBuffer.offset = var7; // L: 2794
									packetWriter.addNode(var31); // L: 2795
								}

								if (var4 >= BuddyRankComparator.mouseRecorder.index) { // L: 2797
									BuddyRankComparator.mouseRecorder.index = 0;
								} else {
									MouseRecorder var49 = BuddyRankComparator.mouseRecorder; // L: 2799
									var49.index -= var4;
									System.arraycopy(BuddyRankComparator.mouseRecorder.xs, var4, BuddyRankComparator.mouseRecorder.xs, 0, BuddyRankComparator.mouseRecorder.index); // L: 2800
									System.arraycopy(BuddyRankComparator.mouseRecorder.ys, var4, BuddyRankComparator.mouseRecorder.ys, 0, BuddyRankComparator.mouseRecorder.index); // L: 2801
									System.arraycopy(BuddyRankComparator.mouseRecorder.millis, var4, BuddyRankComparator.mouseRecorder.millis, 0, BuddyRankComparator.mouseRecorder.index); // L: 2802
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator5.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 2808
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 2809
							if (var16 > 32767L) { // L: 2810
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 2811
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 2812
							if (var3 < 0) { // L: 2813
								var3 = 0;
							} else if (var3 > class309.canvasHeight) { // L: 2814
								var3 = class309.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 2815
							if (var4 < 0) { // L: 2816
								var4 = 0;
							} else if (var4 > class4.canvasWidth) { // L: 2817
								var4 = class4.canvasWidth;
							}

							var5 = (int)var16; // L: 2818
							var18 = ItemContainer.getPacketBufferNode(ClientPacket.field2955, packetWriter.isaacCipher); // L: 2819
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 2820
							var18.packetBuffer.writeShort(var4); // L: 2821
							var18.packetBuffer.writeShort(var3); // L: 2822
							packetWriter.addNode(var18); // L: 2823
						}

						if (KeyHandler.field132 > 0) { // L: 2825
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2899, packetWriter.isaacCipher); // L: 2826
							var14.packetBuffer.writeShort(0); // L: 2827
							var15 = var14.packetBuffer.offset; // L: 2828
							long var19 = WorldMapSprite.method4989(); // L: 2829

							for (var5 = 0; var5 < KeyHandler.field132; ++var5) { // L: 2830
								long var21 = var19 - field718; // L: 2831
								if (var21 > 16777215L) { // L: 2832
									var21 = 16777215L;
								}

								field718 = var19; // L: 2833
								var14.packetBuffer.writeByte(KeyHandler.field139[var5]); // L: 2834
								var14.packetBuffer.method7803((int)var21); // L: 2835
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 2837
							packetWriter.addNode(var14); // L: 2838
						}

						if (field542 > 0) { // L: 2840
							--field542;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 2841
							field616 = true;
						}

						if (field616 && field542 <= 0) { // L: 2842
							field542 = 20; // L: 2843
							field616 = false; // L: 2844
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2975, packetWriter.isaacCipher); // L: 2846
							var14.packetBuffer.method7796(camAngleY); // L: 2847
							var14.packetBuffer.writeShort(camAngleX); // L: 2848
							packetWriter.addNode(var14); // L: 2849
						}

						if (Varps.hasFocus && !hadFocus) { // L: 2851
							hadFocus = true; // L: 2852
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2897, packetWriter.isaacCipher); // L: 2854
							var14.packetBuffer.writeByte(1); // L: 2855
							packetWriter.addNode(var14); // L: 2856
						}

						if (!Varps.hasFocus && hadFocus) { // L: 2858
							hadFocus = false; // L: 2859
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2897, packetWriter.isaacCipher); // L: 2861
							var14.packetBuffer.writeByte(0); // L: 2862
							packetWriter.addNode(var14); // L: 2863
						}

						if (ClanChannel.worldMap != null) { // L: 2866
							ClanChannel.worldMap.method7303();
						}

						UserComparator7.method2577(); // L: 2867
						if (class82.field1070) { // L: 2869
							SecureRandomFuture.method1968(); // L: 2870
							class82.field1070 = false; // L: 2871
						}

						WorldMapSectionType.method4945(); // L: 2874
						if (gameState != 30) { // L: 2875
							return;
						}

						class286.method5549(); // L: 2876

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 2878
							var10002 = queuedSoundEffectDelays[var1]--; // L: 2879
							if (queuedSoundEffectDelays[var1] >= -10) { // L: 2880
								SoundEffect var32 = soundEffects[var1]; // L: 2892
								if (var32 == null) { // L: 2893
									var10000 = null; // L: 2894
									var32 = SoundEffect.readSoundEffect(MouseHandler.archive4, soundEffectIds[var1], 0);
									if (var32 == null) { // L: 2895
										continue;
									}

									int[] var50 = queuedSoundEffectDelays; // L: 2896
									var50[var1] += var32.calculateDelay();
									soundEffects[var1] = var32; // L: 2897
								}

								if (queuedSoundEffectDelays[var1] < 0) { // L: 2903
									if (soundLocations[var1] != 0) { // L: 2905
										var4 = (soundLocations[var1] & 255) * 128; // L: 2906
										var5 = soundLocations[var1] >> 16 & 255; // L: 2907
										var6 = var5 * 128 + 64 - class19.localPlayer.x; // L: 2908
										if (var6 < 0) { // L: 2909
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255; // L: 2910
										var8 = var7 * 128 + 64 - class19.localPlayer.y; // L: 2911
										if (var8 < 0) { // L: 2912
											var8 = -var8;
										}

										var9 = var8 + var6 - 128; // L: 2913
										if (var9 > var4) { // L: 2914
											queuedSoundEffectDelays[var1] = -100; // L: 2915
											continue; // L: 2916
										}

										if (var9 < 0) { // L: 2918
											var9 = 0;
										}

										var3 = (var4 - var9) * Interpreter.clientPreferences.method2286() / var4; // L: 2919
									} else {
										var3 = Interpreter.clientPreferences.method2269(); // L: 2921
									}

									if (var3 > 0) { // L: 2922
										RawSound var23 = var32.toRawSound().resample(LoginScreenAnimation.decimator); // L: 2923
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 2924
										var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 2925
										WorldMapIcon_1.pcmStreamMixer.addSubStream(var24); // L: 2926
									}

									queuedSoundEffectDelays[var1] = -100; // L: 2928
								}
							} else {
								--soundEffectCount; // L: 2881

								for (var15 = var1; var15 < soundEffectCount; ++var15) { // L: 2882
									soundEffectIds[var15] = soundEffectIds[var15 + 1]; // L: 2883
									soundEffects[var15] = soundEffects[var15 + 1]; // L: 2884
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1]; // L: 2885
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1]; // L: 2886
									soundLocations[var15] = soundLocations[var15 + 1]; // L: 2887
								}

								--var1; // L: 2889
							}
						}

						if (field731 && !KeyHandler.method376()) { // L: 2931
							if (Interpreter.clientPreferences.method2288() != 0 && currentTrackGroupId != -1) { // L: 2932
								WorldMapSection2.method4561(ArchiveLoader.archive6, currentTrackGroupId, 0, Interpreter.clientPreferences.method2288(), false);
							}

							field731 = false; // L: 2933
						}

						++packetWriter.field1326; // L: 2936
						if (packetWriter.field1326 > 750) { // L: 2937
							class9.method64(); // L: 2938
							return; // L: 2939
						}

						var1 = Players.Players_count; // L: 2942
						int[] var33 = Players.Players_indices; // L: 2943

						for (var3 = 0; var3 < var1; ++var3) { // L: 2944
							Player var42 = players[var33[var3]]; // L: 2945
							if (var42 != null) { // L: 2946
								BuddyRankComparator.updateActorSequence(var42, 1); // L: 2947
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 2952
							var15 = npcIndices[var1]; // L: 2953
							NPC var25 = npcs[var15]; // L: 2954
							if (var25 != null) { // L: 2955
								BuddyRankComparator.updateActorSequence(var25, var25.definition.size); // L: 2956
							}
						}

						VarpDefinition.method3345(); // L: 2960
						++field550; // L: 2961
						if (mouseCrossColor != 0) { // L: 2962
							mouseCrossState += 20; // L: 2963
							if (mouseCrossState >= 400) { // L: 2964
								mouseCrossColor = 0;
							}
						}

						if (class12.field64 != null) { // L: 2966
							++field595; // L: 2967
							if (field595 >= 15) { // L: 2968
								class290.invalidateWidget(class12.field64); // L: 2969
								class12.field64 = null; // L: 2970
							}
						}

						Widget var39 = Player.mousedOverWidgetIf1; // L: 2973
						Widget var34 = class160.field1750; // L: 2974
						Player.mousedOverWidgetIf1 = null; // L: 2975
						class160.field1750 = null; // L: 2976
						draggedOnWidget = null; // L: 2977
						field671 = false; // L: 2978
						field668 = false; // L: 2979
						field713 = 0; // L: 2980

						while (class16.isKeyDown() && field713 < 128) { // L: 2981
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class241.field2833 == 66) { // L: 2982
								StringBuilder var43 = new StringBuilder(); // L: 2985

								Message var40;
								for (Iterator var45 = Messages.Messages_hashTable.iterator(); var45.hasNext(); var43.append(var40.text).append('\n')) { // L: 2986 2992
									var40 = (Message)var45.next(); // L: 2987
									if (var40.sender != null && !var40.sender.isEmpty()) { // L: 2989
										var43.append(var40.sender).append(':'); // L: 2990
									}
								}

								String var48 = var43.toString(); // L: 2995
								UserComparator10.client.method535(var48); // L: 2998
							} else if (oculusOrbState != 1 || class1.field3 <= 0) { // L: 3001
								field568[field713] = class241.field2833; // L: 3004
								field716[field713] = class1.field3; // L: 3005
								++field713; // L: 3006
							}
						}

						boolean var35 = staffModLevel >= 2; // L: 3010
						if (var35 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3012
							var4 = class19.localPlayer.plane - mouseWheelRotation; // L: 3013
							if (var4 < 0) { // L: 3014
								var4 = 0;
							} else if (var4 > 3) { // L: 3015
								var4 = 3;
							}

							if (var4 != class19.localPlayer.plane) { // L: 3016
								class392.method7191(class19.localPlayer.pathX[0] + ApproximateRouteStrategy.baseX, class19.localPlayer.pathY[0] + class250.baseY, var4, false); // L: 3017
							}

							mouseWheelRotation = 0; // L: 3019
						}

						if (rootInterface != -1) { // L: 3021
							ItemComposition.updateRootInterface(rootInterface, 0, 0, class4.canvasWidth, class309.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3022

						while (true) {
							Widget var41;
							ScriptEvent var44;
							Widget var46;
							do {
								var44 = (ScriptEvent)field694.removeLast(); // L: 3024
								if (var44 == null) { // L: 3025
									while (true) {
										do {
											var44 = (ScriptEvent)field695.removeLast(); // L: 3036
											if (var44 == null) { // L: 3037
												while (true) {
													do {
														var44 = (ScriptEvent)scriptEvents.removeLast(); // L: 3048
														if (var44 == null) { // L: 3049
															this.menu(); // L: 3059
															class154.method3127(); // L: 3060
															if (clickedWidget != null) { // L: 3061
																this.method1159();
															}

															if (FloorDecoration.dragInventoryWidget != null) { // L: 3062
																class290.invalidateWidget(FloorDecoration.dragInventoryWidget); // L: 3063
																++itemDragDuration; // L: 3064
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3065
																	if (field601) { // L: 3066
																		if (FloorDecoration.dragInventoryWidget == GrandExchangeEvent.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3067
																			Widget var47 = FloorDecoration.dragInventoryWidget; // L: 3068
																			byte var36 = 0; // L: 3069
																			if (field655 == 1 && var47.contentType == 206) { // L: 3070
																				var36 = 1;
																			}

																			if (var47.itemIds[dragItemSlotDestination] <= 0) { // L: 3071
																				var36 = 0;
																			}

																			if (class239.method4998(WorldMapSection2.getWidgetFlags(var47))) { // L: 3072
																				var6 = dragItemSlotSource; // L: 3073
																				var7 = dragItemSlotDestination; // L: 3074
																				var47.itemIds[var7] = var47.itemIds[var6]; // L: 3075
																				var47.itemQuantities[var7] = var47.itemQuantities[var6]; // L: 3076
																				var47.itemIds[var6] = -1; // L: 3077
																				var47.itemQuantities[var6] = 0; // L: 3078
																			} else if (var36 == 1) { // L: 3080
																				var6 = dragItemSlotSource; // L: 3081
																				var7 = dragItemSlotDestination; // L: 3082

																				while (var7 != var6) { // L: 3083
																					if (var6 > var7) { // L: 3084
																						var47.swapItems(var6 - 1, var6); // L: 3085
																						--var6; // L: 3086
																					} else if (var6 < var7) { // L: 3088
																						var47.swapItems(var6 + 1, var6); // L: 3089
																						++var6; // L: 3090
																					}
																				}
																			} else {
																				var47.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3095
																			}

																			var18 = ItemContainer.getPacketBufferNode(ClientPacket.field2996, packetWriter.isaacCipher); // L: 3098
																			var18.packetBuffer.method7791(dragItemSlotDestination); // L: 3099
																			var18.packetBuffer.method7795(dragItemSlotSource); // L: 3100
																			var18.packetBuffer.method7806(FloorDecoration.dragInventoryWidget.id); // L: 3101
																			var18.packetBuffer.method7787(var36); // L: 3102
																			packetWriter.addNode(var18); // L: 3103
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3107
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3108
																	} else if (menuOptionsCount > 0) { // L: 3110
																		UserComparator8.method2576(draggedWidgetX, draggedWidgetY); // L: 3111
																	}

																	field595 = 10; // L: 3114
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3115
																	FloorDecoration.dragInventoryWidget = null; // L: 3116
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3119 3120
																	field601 = true; // L: 3121
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3126
																var4 = Scene.Scene_selectedX; // L: 3127
																var5 = Scene.Scene_selectedY; // L: 3128
																var18 = ItemContainer.getPacketBufferNode(ClientPacket.field2911, packetWriter.isaacCipher); // L: 3130
																var18.packetBuffer.writeByte(5); // L: 3131
																var18.packetBuffer.method7795(var4 + ApproximateRouteStrategy.baseX); // L: 3132
																var18.packetBuffer.writeShort(var5 + class250.baseY); // L: 3133
																var18.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3134
																packetWriter.addNode(var18); // L: 3135
																Scene.method4167(); // L: 3136
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3137
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3138
																mouseCrossColor = 1; // L: 3139
																mouseCrossState = 0; // L: 3140
																destinationX = var4; // L: 3141
																destinationY = var5; // L: 3142
															}

															if (var39 != Player.mousedOverWidgetIf1) { // L: 3144
																if (var39 != null) { // L: 3145
																	class290.invalidateWidget(var39);
																}

																if (Player.mousedOverWidgetIf1 != null) { // L: 3146
																	class290.invalidateWidget(Player.mousedOverWidgetIf1);
																}
															}

															if (var34 != class160.field1750 && field641 == field642) { // L: 3148
																if (var34 != null) { // L: 3149
																	class290.invalidateWidget(var34);
																}

																if (class160.field1750 != null) { // L: 3150
																	class290.invalidateWidget(class160.field1750);
																}
															}

															if (class160.field1750 != null) { // L: 3152
																if (field641 < field642) { // L: 3153
																	++field641; // L: 3154
																	if (field642 == field641) { // L: 3155
																		class290.invalidateWidget(class160.field1750);
																	}
																}
															} else if (field641 > 0) { // L: 3158
																--field641;
															}

															if (oculusOrbState == 0) { // L: 3160
																var4 = class19.localPlayer.x; // L: 3161
																var5 = class19.localPlayer.y; // L: 3162
																if (Messages.oculusOrbFocalPointX - var4 < -500 || Messages.oculusOrbFocalPointX - var4 > 500 || class115.oculusOrbFocalPointY - var5 < -500 || class115.oculusOrbFocalPointY - var5 > 500) { // L: 3163
																	Messages.oculusOrbFocalPointX = var4; // L: 3164
																	class115.oculusOrbFocalPointY = var5; // L: 3165
																}

																if (var4 != Messages.oculusOrbFocalPointX) { // L: 3167
																	Messages.oculusOrbFocalPointX += (var4 - Messages.oculusOrbFocalPointX) / 16;
																}

																if (var5 != class115.oculusOrbFocalPointY) { // L: 3168
																	class115.oculusOrbFocalPointY += (var5 - class115.oculusOrbFocalPointY) / 16;
																}

																var6 = Messages.oculusOrbFocalPointX >> 7; // L: 3169
																var7 = class115.oculusOrbFocalPointY >> 7; // L: 3170
																var8 = Archive.getTileHeight(Messages.oculusOrbFocalPointX, class115.oculusOrbFocalPointY, class160.Client_plane); // L: 3171
																var9 = 0; // L: 3172
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3173
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3174
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3175
																			var12 = class160.Client_plane; // L: 3176
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3177
																				++var12;
																			}

																			int var26 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3178
																			if (var26 > var9) { // L: 3179
																				var9 = var26;
																			}
																		}
																	}
																}

																var10 = var9 * 192; // L: 3183
																if (var10 > 98048) { // L: 3184
																	var10 = 98048;
																}

																if (var10 < 32768) { // L: 3185
																	var10 = 32768;
																}

																if (var10 > field756) { // L: 3186
																	field756 += (var10 - field756) / 24;
																} else if (var10 < field756) { // L: 3187
																	field756 += (var10 - field756) / 80;
																}

																FloorOverlayDefinition.field2136 = Archive.getTileHeight(class19.localPlayer.x, class19.localPlayer.y, class160.Client_plane) - camFollowHeight; // L: 3188
															} else if (oculusOrbState == 1) { // L: 3190
																class391.method7169(); // L: 3191
																short var37 = -1; // L: 3192
																if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3193
																	var37 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3194
																	var37 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3195
																	if (var37 == 0) { // L: 3196
																		var37 = 1792;
																	} else if (var37 == 1024) { // L: 3197
																		var37 = 1280;
																	} else {
																		var37 = 1536; // L: 3198
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3200
																	if (var37 == 0) { // L: 3201
																		var37 = 256;
																	} else if (var37 == 1024) { // L: 3202
																		var37 = 768;
																	} else {
																		var37 = 512; // L: 3203
																	}
																}

																byte var38 = 0; // L: 3205
																if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3206
																	var38 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3207
																	var38 = 1;
																}

																var6 = 0; // L: 3208
																if (var37 >= 0 || var38 != 0) { // L: 3209
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * -881862903 * 881911609 : oculusOrbNormalSpeed * -1286782535 * -924814199; // L: 3210
																	var6 *= 16; // L: 3211
																	field567 = var37; // L: 3212
																	field696 = var38; // L: 3213
																}

																if (field566 < var6) { // L: 3215
																	field566 += var6 / 8; // L: 3216
																	if (field566 > var6) { // L: 3217
																		field566 = var6;
																	}
																} else if (field566 > var6) { // L: 3219
																	field566 = field566 * 9 / 10;
																}

																if (field566 > 0) { // L: 3220
																	var7 = field566 / 16; // L: 3221
																	if (field567 >= 0) { // L: 3222
																		var4 = field567 - MusicPatchNode2.cameraYaw & 2047; // L: 3223
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3224
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3225
																		Messages.oculusOrbFocalPointX += var7 * var8 / 65536; // L: 3226
																		class115.oculusOrbFocalPointY += var7 * var9 / 65536; // L: 3227
																	}

																	if (field696 != 0) { // L: 3229
																		FloorOverlayDefinition.field2136 += var7 * field696; // L: 3230
																		if (FloorOverlayDefinition.field2136 > 0) { // L: 3231
																			FloorOverlayDefinition.field2136 = 0;
																		}
																	}
																} else {
																	field567 = -1; // L: 3235
																	field696 = -1; // L: 3236
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3238
																	class291.method5589(); // L: 3239
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && UserComparator5.mouseCam) { // L: 3242
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY; // L: 3243
																camAngleDX = var4 * 2; // L: 3244
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * -501791789 * -601944997; // L: 3245
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3246
																camAngleDY = var5 * 2; // L: 3247
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * 1113383001 * -833329175; // L: 3248
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3251
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3252
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2; // L: 3253
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3254
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3255
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2; // L: 3256
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3257
																mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3258
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047; // L: 3260
															camAngleX += camAngleDX / 2; // L: 3261
															if (camAngleX < 128) { // L: 3262
																camAngleX = 128;
															}

															if (camAngleX > 383) { // L: 3263
																camAngleX = 383;
															}

															if (field739) { // L: 3265
																class291.method5587();
															} else if (isCameraLocked) { // L: 3266
																class147.method3052();
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 3267
																var10002 = field744[var4]++;
															}

															JagexCache.varcs.tryWrite(); // L: 3268
															var4 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3271
															var6 = class18.method294(); // L: 3274
															PacketBufferNode var27;
															if (var4 > 15000 && var6 > 15000) { // L: 3275
																logoutTimer = 250; // L: 3276
																ItemComposition.method3764(14500); // L: 3277
																var27 = ItemContainer.getPacketBufferNode(ClientPacket.field2979, packetWriter.isaacCipher); // L: 3279
																packetWriter.addNode(var27); // L: 3280
															}

															class155.friendSystem.processFriendUpdates(); // L: 3282
															++packetWriter.pendingWrites; // L: 3283
															if (packetWriter.pendingWrites > 50) { // L: 3284
																var27 = ItemContainer.getPacketBufferNode(ClientPacket.field2950, packetWriter.isaacCipher); // L: 3286
																packetWriter.addNode(var27); // L: 3287
															}

															try {
																packetWriter.flush(); // L: 3290
															} catch (IOException var28) { // L: 3292
																class9.method64(); // L: 3293
															}

															return; // L: 3295
														}

														var46 = var44.widget; // L: 3050
														if (var46.childIndex < 0) { // L: 3051
															break;
														}

														var41 = HorizontalAlignment.getWidget(var46.parentId); // L: 3052
													} while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]); // L: 3053

													class1.runScriptEvent(var44); // L: 3057
												}
											}

											var46 = var44.widget; // L: 3038
											if (var46.childIndex < 0) { // L: 3039
												break;
											}

											var41 = HorizontalAlignment.getWidget(var46.parentId); // L: 3040
										} while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]); // L: 3041

										class1.runScriptEvent(var44); // L: 3045
									}
								}

								var46 = var44.widget; // L: 3026
								if (var46.childIndex < 0) { // L: 3027
									break;
								}

								var41 = HorizontalAlignment.getWidget(var46.parentId); // L: 3028
							} while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]); // L: 3029

							class1.runScriptEvent(var44); // L: 3033
						}
					}

					var31 = ItemContainer.getPacketBufferNode(ClientPacket.field2914, packetWriter.isaacCipher); // L: 2701
					var31.packetBuffer.writeByte(0); // L: 2702
					var3 = var31.packetBuffer.offset; // L: 2703
					WorldMapAreaData.performReflectionCheck(var31.packetBuffer); // L: 2704
					var31.packetBuffer.method7756(var31.packetBuffer.offset - var3); // L: 2705
					packetWriter.addNode(var31); // L: 2706
				}
			}
		}
	} // L: 2683

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-70275720"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class4.canvasWidth; // L: 3953
		int var2 = class309.canvasHeight; // L: 3954
		if (super.contentWidth < var1) { // L: 3955
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 3956
		}

		if (Interpreter.clientPreferences != null) { // L: 3957
			try {
				class27.method412(UserComparator10.client, "resize", new Object[]{ReflectionCheck.getWindowedMode()}); // L: 3959
			} catch (Throwable var4) { // L: 3961
			}
		}

	} // L: 3963

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1155883709"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 3966
			var1 = rootInterface; // L: 3967
			if (MusicPatchNode2.loadInterface(var1)) { // L: 3969
				ItemComposition.drawModelComponents(EnumComposition.Widget_interfaceComponents[var1], -1); // L: 3970
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 3973
			if (field564[var1]) { // L: 3974
				field651[var1] = true;
			}

			field576[var1] = field564[var1]; // L: 3975
			field564[var1] = false; // L: 3976
		}

		field698 = cycle; // L: 3978
		viewportX = -1; // L: 3979
		viewportY = -1; // L: 3980
		GrandExchangeEvent.hoveredItemContainer = null; // L: 3981
		if (rootInterface != -1) { // L: 3982
			rootWidgetCount = 0; // L: 3983
			class11.drawWidgets(rootInterface, 0, 0, class4.canvasWidth, class309.canvasHeight, 0, 0, -1); // L: 3984
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 3986
		if (showMouseCross) { // L: 3987
			if (mouseCrossColor == 1) { // L: 3988
				crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3989
			}

			if (mouseCrossColor == 2) { // L: 3991
				crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3992
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) { // L: 3995
			if (viewportX != -1) { // L: 3996
				var1 = viewportX; // L: 3997
				var2 = viewportY; // L: 3998
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4000 4001
					var3 = class168.method3324(); // L: 4002
					String var11;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4004
						var11 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4005
						var11 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var11 = ReflectionCheck.method637(var3); // L: 4006
					}

					if (menuOptionsCount > 2) { // L: 4007
						var11 = var11 + ChatChannel.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					FloorOverlayDefinition.fontBold12.drawRandomAlphaAndSpacing(var11, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4008
				}
			}
		} else {
			var1 = class307.menuX; // L: 4013
			var2 = ArchiveDiskActionHandler.menuY; // L: 4014
			var3 = class11.menuWidth; // L: 4015
			int var4 = UrlRequester.menuHeight; // L: 4016
			int var5 = 6116423; // L: 4017
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4018
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4019
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4020
			FloorOverlayDefinition.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4021
			int var6 = MouseHandler.MouseHandler_x; // L: 4022
			int var7 = MouseHandler.MouseHandler_y; // L: 4023

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4024
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 4025
				int var10 = 16777215; // L: 4026
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4027
					var10 = 16776960;
				}

				FloorOverlayDefinition.fontBold12.draw(ReflectionCheck.method637(var8), var1 + 3, var9, var10, 0); // L: 4028
			}

			LoginScreenAnimation.method2240(class307.menuX, ArchiveDiskActionHandler.menuY, class11.menuWidth, UrlRequester.menuHeight); // L: 4030
		}

		if (gameDrawingMode == 3) { // L: 4032
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4033
				if (field576[var1]) { // L: 4034
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4035
				} else if (field651[var1]) { // L: 4037
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4038
				}
			}
		}

		class268.method5232(class160.Client_plane, class19.localPlayer.x, class19.localPlayer.y, field550); // L: 4042
		field550 = 0; // L: 4043
	} // L: 4044

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)Z",
		garbageValue = "911154934"
	)
	final boolean method1153(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5641
		PacketBuffer var3 = var1.packetBuffer; // L: 5642
		if (var2 == null) { // L: 5643
			return false;
		} else {
			String var21;
			int var22;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5645
					if (var1.field1328) { // L: 5646
						if (!var2.isAvailable(1)) { // L: 5647
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5648
						var1.field1326 = 0; // L: 5649
						var1.field1328 = false; // L: 5650
					}

					var3.offset = 0; // L: 5652
					if (var3.method7701()) { // L: 5653
						if (!var2.isAvailable(1)) { // L: 5654
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5655
						var1.field1326 = 0; // L: 5656
					}

					var1.field1328 = true; // L: 5658
					ServerPacket[] var4 = class230.ServerPacket_values(); // L: 5659
					var5 = var3.readSmartByteShortIsaac(); // L: 5660
					if (var5 < 0 || var5 >= var4.length) { // L: 5661
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5662
					var1.serverPacketLength = var1.serverPacket.length; // L: 5663
				}

				if (var1.serverPacketLength == -1) { // L: 5665
					if (!var2.isAvailable(1)) { // L: 5666
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5667
					var1.serverPacketLength = var3.array[0] & 255; // L: 5668
				}

				if (var1.serverPacketLength == -2) { // L: 5670
					if (!var2.isAvailable(2)) { // L: 5671
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5672
					var3.offset = 0; // L: 5673
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5674
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5676
					return false;
				}

				var3.offset = 0; // L: 5677
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5678
				var1.field1326 = 0; // L: 5679
				timer.method6594(); // L: 5680
				var1.field1331 = var1.field1329; // L: 5681
				var1.field1329 = var1.field1320; // L: 5682
				var1.field1320 = var1.serverPacket; // L: 5683
				byte var70;
				if (ServerPacket.field3043 == var1.serverPacket) { // L: 5684
					RouteStrategy.method3875(); // L: 5685
					var70 = var3.readByte(); // L: 5686
					class131 var83 = new class131(var3); // L: 5687
					ClanSettings var65;
					if (var70 >= 0) { // L: 5689
						var65 = currentClanSettings[var70];
					} else {
						var65 = class134.guestClanSettings; // L: 5690
					}

					var83.method2851(var65); // L: 5691
					var1.serverPacket = null; // L: 5692
					return true; // L: 5693
				}

				int var7;
				int var20;
				Widget var56;
				if (ServerPacket.field3052 == var1.serverPacket) { // L: 5695
					var20 = var3.method7971(); // L: 5696
					var5 = var3.method7935(); // L: 5697
					var22 = var3.method7935(); // L: 5698
					var7 = var3.method7797(); // L: 5699
					var56 = HorizontalAlignment.getWidget(var7); // L: 5700
					if (var22 != var56.modelAngleX || var5 != var56.modelAngleY || var20 != var56.modelZoom) { // L: 5701
						var56.modelAngleX = var22; // L: 5702
						var56.modelAngleY = var5; // L: 5703
						var56.modelZoom = var20; // L: 5704
						class290.invalidateWidget(var56); // L: 5705
					}

					var1.serverPacket = null; // L: 5707
					return true; // L: 5708
				}

				if (ServerPacket.field3061 == var1.serverPacket) { // L: 5710
					class83.updatePlayers(var3, var1.serverPacketLength); // L: 5711
					class4.method19(); // L: 5712
					var1.serverPacket = null; // L: 5713
					return true; // L: 5714
				}

				Widget var6;
				boolean var71;
				if (ServerPacket.field3107 == var1.serverPacket) { // L: 5716
					var20 = var3.method7810(); // L: 5717
					var71 = var3.readUnsignedByte() == 1; // L: 5718
					var6 = HorizontalAlignment.getWidget(var20); // L: 5719
					if (var71 != var6.isHidden) { // L: 5720
						var6.isHidden = var71; // L: 5721
						class290.invalidateWidget(var6); // L: 5722
					}

					var1.serverPacket = null; // L: 5724
					return true; // L: 5725
				}

				if (ServerPacket.field3034 == var1.serverPacket) { // L: 5727
					var20 = var3.readUnsignedShort(); // L: 5728
					byte var72 = var3.method7792(); // L: 5729
					Varps.Varps_temp[var20] = var72; // L: 5730
					if (Varps.Varps_main[var20] != var72) { // L: 5731
						Varps.Varps_main[var20] = var72; // L: 5732
					}

					class78.changeGameOptions(var20); // L: 5734
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 5735
					var1.serverPacket = null; // L: 5736
					return true; // L: 5737
				}

				String var59;
				if (ServerPacket.field3032 == var1.serverPacket) { // L: 5739
					var20 = var3.readUShortSmart(); // L: 5740
					var71 = var3.readUnsignedByte() == 1; // L: 5741
					var59 = ""; // L: 5742
					boolean var66 = false; // L: 5743
					if (var71) { // L: 5744
						var59 = var3.readStringCp1252NullTerminated(); // L: 5745
						if (class155.friendSystem.isIgnored(new Username(var59, class83.loginType))) { // L: 5746
							var66 = true;
						}
					}

					String var58 = var3.readStringCp1252NullTerminated(); // L: 5748
					if (!var66) { // L: 5749
						Login.addGameMessage(var20, var59, var58);
					}

					var1.serverPacket = null; // L: 5750
					return true; // L: 5751
				}

				if (ServerPacket.field3058 == var1.serverPacket) { // L: 5753
					var20 = var3.method7810(); // L: 5754
					var5 = var3.readUnsignedShort(); // L: 5755
					Varps.Varps_temp[var5] = var20; // L: 5756
					if (Varps.Varps_main[var5] != var20) { // L: 5757
						Varps.Varps_main[var5] = var20; // L: 5758
					}

					class78.changeGameOptions(var5); // L: 5760
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 5761
					var1.serverPacket = null; // L: 5762
					return true; // L: 5763
				}

				if (ServerPacket.field3038 == var1.serverPacket) { // L: 5765
					var20 = var3.method7889(); // L: 5766
					var21 = var3.readStringCp1252NullTerminated(); // L: 5767
					var6 = HorizontalAlignment.getWidget(var20); // L: 5768
					if (!var21.equals(var6.text)) { // L: 5769
						var6.text = var21; // L: 5770
						class290.invalidateWidget(var6); // L: 5771
					}

					var1.serverPacket = null; // L: 5773
					return true; // L: 5774
				}

				int var9;
				int var10;
				int var23;
				if (ServerPacket.field3079 == var1.serverPacket) { // L: 5776
					isCameraLocked = true; // L: 5777
					field739 = false; // L: 5778
					class12.field62 = var3.readUnsignedByte(); // L: 5779
					WorldMapSectionType.field2778 = var3.readUnsignedByte(); // L: 5780
					class351.field4157 = var3.readUnsignedShort(); // L: 5781
					ClanChannel.field1660 = var3.readUnsignedByte(); // L: 5782
					JagexCache.field1737 = var3.readUnsignedByte(); // L: 5783
					if (JagexCache.field1737 >= 100) { // L: 5784
						var20 = class12.field62 * 128 + 64; // L: 5785
						var5 = WorldMapSectionType.field2778 * 128 + 64; // L: 5786
						var22 = Archive.getTileHeight(var20, var5, class160.Client_plane) - class351.field4157; // L: 5787
						var7 = var20 - EnumComposition.cameraX; // L: 5788
						var23 = var22 - FriendSystem.cameraY; // L: 5789
						var9 = var5 - CollisionMap.cameraZ; // L: 5790
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7)); // L: 5791
						Language.cameraPitch = (int)(Math.atan2((double)var23, (double)var10) * 325.9490051269531D) & 2047; // L: 5792
						MusicPatchNode2.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 5793
						if (Language.cameraPitch < 128) { // L: 5794
							Language.cameraPitch = 128;
						}

						if (Language.cameraPitch > 383) { // L: 5795
							Language.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 5797
					return true; // L: 5798
				}

				if (ServerPacket.field3103 == var1.serverPacket) { // L: 5800
					var20 = var3.readInt(); // L: 5801
					var5 = var3.readInt(); // L: 5802
					var22 = NetCache.getGcDuration(); // L: 5803
					PacketBufferNode var84 = ItemContainer.getPacketBufferNode(ClientPacket.field2983, packetWriter.isaacCipher); // L: 5805
					var84.packetBuffer.method7746(var20); // L: 5806
					var84.packetBuffer.method7806(var5); // L: 5807
					var84.packetBuffer.method7788(GameEngine.fps); // L: 5808
					var84.packetBuffer.method7788(var22); // L: 5809
					packetWriter.addNode(var84); // L: 5810
					var1.serverPacket = null; // L: 5811
					return true; // L: 5812
				}

				if (ServerPacket.field3042 == var1.serverPacket) { // L: 5814
					class9.field34 = var3.method7789(); // L: 5815
					FriendSystem.field803 = var3.method7927(); // L: 5816

					while (var3.offset < var1.serverPacketLength) { // L: 5817
						var20 = var3.readUnsignedByte(); // L: 5818
						class263 var81 = Language.method6134()[var20]; // L: 5819
						class221.method4531(var81); // L: 5820
					}

					var1.serverPacket = null; // L: 5822
					return true; // L: 5823
				}

				if (ServerPacket.field3095 == var1.serverPacket) { // L: 5825
					GameEngine.field205 = null; // L: 5826
					var1.serverPacket = null; // L: 5827
					return true; // L: 5828
				}

				if (ServerPacket.field3040 == var1.serverPacket) { // L: 5830
					class9.field34 = var3.method7789(); // L: 5831
					FriendSystem.field803 = var3.readUnsignedByte(); // L: 5832

					for (var20 = FriendSystem.field803; var20 < FriendSystem.field803 + 8; ++var20) { // L: 5833
						for (var5 = class9.field34; var5 < class9.field34 + 8; ++var5) { // L: 5834
							if (groundItems[class160.Client_plane][var20][var5] != null) { // L: 5835
								groundItems[class160.Client_plane][var20][var5] = null; // L: 5836
								class162.updateItemPile(var20, var5); // L: 5837
							}
						}
					}

					for (PendingSpawn var54 = (PendingSpawn)pendingSpawns.last(); var54 != null; var54 = (PendingSpawn)pendingSpawns.previous()) { // L: 5841 5842 5844
						if (var54.x >= FriendSystem.field803 && var54.x < FriendSystem.field803 + 8 && var54.y >= class9.field34 && var54.y < class9.field34 + 8 && var54.plane == class160.Client_plane) { // L: 5843
							var54.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 5846
					return true; // L: 5847
				}

				if (ServerPacket.field3114 == var1.serverPacket) { // L: 5849
					class221.method4531(class263.field3012); // L: 5850
					var1.serverPacket = null; // L: 5851
					return true; // L: 5852
				}

				long var25;
				long var27;
				String var32;
				String var50;
				int var68;
				if (ServerPacket.field3048 == var1.serverPacket) { // L: 5854
					var50 = var3.readStringCp1252NullTerminated(); // L: 5855
					var25 = (long)var3.readUnsignedShort(); // L: 5856
					var27 = (long)var3.readMedium(); // L: 5857
					PlayerType var29 = (PlayerType)ChatChannel.findEnumerated(HitSplatDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 5858
					long var30 = var27 + (var25 << 32); // L: 5859
					boolean var62 = false; // L: 5860

					for (var68 = 0; var68 < 100; ++var68) { // L: 5861
						if (var30 == crossWorldMessageIds[var68]) { // L: 5862
							var62 = true; // L: 5863
							break; // L: 5864
						}
					}

					if (class155.friendSystem.isIgnored(new Username(var50, class83.loginType))) { // L: 5867
						var62 = true;
					}

					if (!var62 && field603 == 0) { // L: 5868
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var30; // L: 5869
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 5870
						var32 = AbstractFont.escapeBrackets(AbstractByteArrayCopier.method5528(class118.method2737(var3))); // L: 5871
						byte var69;
						if (var29.isPrivileged) { // L: 5873
							var69 = 7;
						} else {
							var69 = 3; // L: 5874
						}

						if (var29.modIcon != -1) { // L: 5875
							Login.addGameMessage(var69, class351.method6579(var29.modIcon) + var50, var32);
						} else {
							Login.addGameMessage(var69, var50, var32); // L: 5876
						}
					}

					var1.serverPacket = null; // L: 5878
					return true; // L: 5879
				}

				int var12;
				int var14;
				int var15;
				int var16;
				int var61;
				if (ServerPacket.field3090 == var1.serverPacket) { // L: 5881
					int var18 = var3.readUnsignedByte(); // L: 5897
					var16 = var3.method7971(); // L: 5898
					var22 = var3.method7805(); // L: 5899
					var20 = var22 >> 16; // L: 5900
					var5 = var22 >> 8 & 255; // L: 5901
					var7 = var20 + (var22 >> 4 & 7); // L: 5902
					var23 = var5 + (var22 & 7); // L: 5903
					byte var63 = var3.readByte(); // L: 5904
					var12 = var3.method7971(); // L: 5905
					var68 = var3.method7789() * 4; // L: 5906
					byte var64 = var3.method7792(); // L: 5907
					var15 = var3.method7798(); // L: 5908
					int var17 = var3.readUnsignedByte(); // L: 5909
					var14 = var3.method7927() * 4; // L: 5910
					var61 = var3.method7769(); // L: 5911
					var9 = var63 + var7; // L: 5912
					var10 = var64 + var23; // L: 5913
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) { // L: 5914
						var7 = var7 * 128 + 64; // L: 5915
						var23 = var23 * 128 + 64; // L: 5916
						var9 = var9 * 128 + 64; // L: 5917
						var10 = var10 * 128 + 64; // L: 5918
						Projectile var19 = new Projectile(var12, class160.Client_plane, var7, var23, Archive.getTileHeight(var7, var23, class160.Client_plane) - var68, var15 + cycle, var16 + cycle, var17, var18, var61, var14); // L: 5919
						var19.setDestination(var9, var10, Archive.getTileHeight(var9, var10, class160.Client_plane) - var14, var15 + cycle); // L: 5920
						projectiles.addFirst(var19); // L: 5921
					}

					var1.serverPacket = null; // L: 5923
					return true; // L: 5924
				}

				if (ServerPacket.field3051 == var1.serverPacket) { // L: 5926
					isCameraLocked = false; // L: 5927

					for (var20 = 0; var20 < 5; ++var20) { // L: 5928
						field740[var20] = false;
					}

					var1.serverPacket = null; // L: 5929
					return true; // L: 5930
				}

				if (ServerPacket.field3117 == var1.serverPacket) { // L: 5932
					if (class230.friendsChat != null) { // L: 5933
						class230.friendsChat.method6718(var3); // L: 5934
					}

					Strings.method5798(); // L: 5936
					var1.serverPacket = null; // L: 5937
					return true; // L: 5938
				}

				InterfaceParent var82;
				if (ServerPacket.field3044 == var1.serverPacket) { // L: 5940
					var20 = var3.method7889(); // L: 5941
					var5 = var3.method7810(); // L: 5942
					InterfaceParent var60 = (InterfaceParent)interfaceParents.get((long)var20); // L: 5943
					var82 = (InterfaceParent)interfaceParents.get((long)var5); // L: 5944
					if (var82 != null) { // L: 5945
						class20.closeInterface(var82, var60 == null || var82.group != var60.group);
					}

					if (var60 != null) { // L: 5946
						var60.remove(); // L: 5947
						interfaceParents.put(var60, (long)var5); // L: 5948
					}

					var56 = HorizontalAlignment.getWidget(var20); // L: 5950
					if (var56 != null) { // L: 5951
						class290.invalidateWidget(var56);
					}

					var56 = HorizontalAlignment.getWidget(var5); // L: 5952
					if (var56 != null) { // L: 5953
						class290.invalidateWidget(var56); // L: 5954
						GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var56.id >>> 16], var56, true); // L: 5955
					}

					if (rootInterface != -1) { // L: 5957
						MouseHandler.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 5958
					return true; // L: 5959
				}

				if (ServerPacket.field3100 == var1.serverPacket && isCameraLocked) { // L: 5961 5962
					field739 = true; // L: 5963
					Tiles.field996 = var3.readUnsignedByte(); // L: 5964
					class33.field231 = var3.readUnsignedByte(); // L: 5965
					ClanChannel.field1660 = var3.readUnsignedByte(); // L: 5966
					JagexCache.field1737 = var3.readUnsignedByte(); // L: 5967

					for (var20 = 0; var20 < 5; ++var20) { // L: 5968
						field740[var20] = false;
					}

					var1.serverPacket = null; // L: 5969
					return true; // L: 5970
				}

				if (ServerPacket.field3030 == var1.serverPacket) { // L: 5973
					DynamicObject.updateNpcs(false, var3); // L: 5974
					var1.serverPacket = null; // L: 5975
					return true; // L: 5976
				}

				boolean var87;
				if (ServerPacket.field3036 == var1.serverPacket) { // L: 5978
					var87 = var3.readUnsignedByte() == 1; // L: 5979
					if (var87) { // L: 5980
						Varps.field3287 = WorldMapSprite.method4989() - var3.readLong(); // L: 5981
						ReflectionCheck.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 5982
					} else {
						ReflectionCheck.grandExchangeEvents = null; // L: 5984
					}

					field572 = cycleCntr; // L: 5985
					var1.serverPacket = null; // L: 5986
					return true; // L: 5987
				}

				if (ServerPacket.field3065 == var1.serverPacket) { // L: 5989
					class221.method4531(class263.field3010); // L: 5990
					var1.serverPacket = null; // L: 5991
					return true; // L: 5992
				}

				if (ServerPacket.field3116 == var1.serverPacket) { // L: 5994
					var20 = var3.readUnsignedByte(); // L: 5995
					var5 = var3.readUnsignedByte(); // L: 5996
					var22 = var3.readUnsignedByte(); // L: 5997
					var7 = var3.readUnsignedByte(); // L: 5998
					field740[var20] = true; // L: 5999
					field482[var20] = var5; // L: 6000
					field549[var20] = var22; // L: 6001
					field766[var20] = var7; // L: 6002
					field744[var20] = 0; // L: 6003
					var1.serverPacket = null; // L: 6004
					return true; // L: 6005
				}

				Widget var80;
				if (ServerPacket.field3072 == var1.serverPacket) { // L: 6007
					var20 = var3.method7935(); // L: 6008
					var5 = var3.method7971(); // L: 6009
					var22 = var3.method7810(); // L: 6010
					var80 = HorizontalAlignment.getWidget(var22); // L: 6011
					var80.field3399 = var5 + (var20 << 16); // L: 6012
					var1.serverPacket = null; // L: 6013
					return true; // L: 6014
				}

				if (ServerPacket.field3110 == var1.serverPacket) { // L: 6016
					World var53 = new World(); // L: 6017
					var53.host = var3.readStringCp1252NullTerminated(); // L: 6018
					var53.id = var3.readUnsignedShort(); // L: 6019
					var5 = var3.readInt(); // L: 6020
					var53.properties = var5; // L: 6021
					InterfaceParent.updateGameState(45); // L: 6022
					var2.close(); // L: 6023
					var2 = null; // L: 6024
					ItemContainer.changeWorld(var53); // L: 6025
					var1.serverPacket = null; // L: 6026
					return false; // L: 6027
				}

				if (ServerPacket.field3085 == var1.serverPacket) { // L: 6029
					var3.offset += 28; // L: 6030
					if (var3.checkCrc()) { // L: 6031
						WorldMapRegion.method4798(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6032
					return true; // L: 6033
				}

				if (ServerPacket.field3041 == var1.serverPacket) { // L: 6035
					var20 = var3.method7797(); // L: 6036
					var5 = var3.readShort(); // L: 6037
					var22 = var3.method7769(); // L: 6038
					var80 = HorizontalAlignment.getWidget(var20); // L: 6039
					if (var5 != var80.rawX || var22 != var80.rawY || var80.xAlignment != 0 || var80.yAlignment != 0) { // L: 6040
						var80.rawX = var5; // L: 6041
						var80.rawY = var22; // L: 6042
						var80.xAlignment = 0; // L: 6043
						var80.yAlignment = 0; // L: 6044
						class290.invalidateWidget(var80); // L: 6045
						this.alignWidget(var80); // L: 6046
						if (var80.type == 0) { // L: 6047
							GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var20 >> 16], var80, false);
						}
					}

					var1.serverPacket = null; // L: 6049
					return true; // L: 6050
				}

				if (ServerPacket.field3033 == var1.serverPacket) { // L: 6052
					var87 = var3.readBoolean(); // L: 6053
					if (var87) { // L: 6054
						if (class340.field4109 == null) { // L: 6055
							class340.field4109 = new class326();
						}
					} else {
						class340.field4109 = null; // L: 6057
					}

					var1.serverPacket = null; // L: 6058
					return true; // L: 6059
				}

				if (ServerPacket.field3105 == var1.serverPacket) { // L: 6061
					var20 = var3.readUnsignedByte(); // L: 6062
					var5 = var3.readInt(); // L: 6063
					var22 = var3.method7971(); // L: 6064
					var82 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6065
					if (var82 != null) { // L: 6066
						class20.closeInterface(var82, var22 != var82.group);
					}

					ServerPacket.method5222(var5, var22, var20); // L: 6067
					var1.serverPacket = null; // L: 6068
					return true; // L: 6069
				}

				if (ServerPacket.field3057 == var1.serverPacket) { // L: 6071
					GameObject.logOut(); // L: 6072
					var1.serverPacket = null; // L: 6073
					return false; // L: 6074
				}

				if (ServerPacket.field3088 == var1.serverPacket) { // L: 6076
					class146.loadRegions(true, var1.packetBuffer); // L: 6077
					var1.serverPacket = null; // L: 6078
					return true; // L: 6079
				}

				if (ServerPacket.field3027 == var1.serverPacket) { // L: 6081
					class221.method4531(class263.field3006); // L: 6082
					var1.serverPacket = null; // L: 6083
					return true; // L: 6084
				}

				if (ServerPacket.field3060 == var1.serverPacket) { // L: 6086
					Varps.privateChatMode = class83.method2124(var3.readUnsignedByte()); // L: 6087
					var1.serverPacket = null; // L: 6088
					return true; // L: 6089
				}

				if (ServerPacket.field3091 == var1.serverPacket) { // L: 6091
					class221.method4531(class263.field3013); // L: 6092
					var1.serverPacket = null; // L: 6093
					return true; // L: 6094
				}

				if (ServerPacket.field3126 == var1.serverPacket) { // L: 6096
					var20 = var3.method7798(); // L: 6097
					var5 = var3.readInt(); // L: 6098
					var22 = var20 >> 10 & 31; // L: 6099
					var7 = var20 >> 5 & 31; // L: 6100
					var23 = var20 & 31; // L: 6101
					var9 = (var7 << 11) + (var22 << 19) + (var23 << 3); // L: 6102
					Widget var86 = HorizontalAlignment.getWidget(var5); // L: 6103
					if (var9 != var86.color) { // L: 6104
						var86.color = var9; // L: 6105
						class290.invalidateWidget(var86); // L: 6106
					}

					var1.serverPacket = null; // L: 6108
					return true; // L: 6109
				}

				long var34;
				if (ServerPacket.field3071 == var1.serverPacket) { // L: 6111
					var20 = var3.method7810(); // L: 6112
					var5 = var3.method7798(); // L: 6113
					if (var5 == 65535) { // L: 6114
						var5 = -1;
					}

					var22 = var3.method7971(); // L: 6115
					if (var22 == 65535) { // L: 6116
						var22 = -1;
					}

					var7 = var3.readInt(); // L: 6117

					for (var23 = var5; var23 <= var22; ++var23) { // L: 6118
						var34 = (long)var23 + ((long)var7 << 32); // L: 6119
						Node var88 = widgetFlags.get(var34); // L: 6120
						if (var88 != null) { // L: 6121
							var88.remove();
						}

						widgetFlags.put(new IntegerNode(var20), var34); // L: 6122
					}

					var1.serverPacket = null; // L: 6124
					return true; // L: 6125
				}

				if (ServerPacket.field3078 == var1.serverPacket) { // L: 6127
					DynamicObject.updateNpcs(true, var3); // L: 6128
					var1.serverPacket = null; // L: 6129
					return true; // L: 6130
				}

				if (ServerPacket.field3124 == var1.serverPacket) { // L: 6132
					var20 = var3.readInt(); // L: 6133
					var5 = var3.readUnsignedShort(); // L: 6134
					if (var20 < -70000) { // L: 6135
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6137
						var6 = HorizontalAlignment.getWidget(var20);
					} else {
						var6 = null; // L: 6138
					}

					if (var6 != null) { // L: 6139
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) { // L: 6140
							var6.itemIds[var7] = 0; // L: 6141
							var6.itemQuantities[var7] = 0; // L: 6142
						}
					}

					TileItem.clearItemContainer(var5); // L: 6145
					var7 = var3.readUnsignedShort(); // L: 6146

					for (var23 = 0; var23 < var7; ++var23) { // L: 6147
						var9 = var3.readUnsignedShort(); // L: 6148
						var10 = var3.method7789(); // L: 6149
						if (var10 == 255) { // L: 6150
							var10 = var3.readInt();
						}

						if (var6 != null && var23 < var6.itemIds.length) { // L: 6151 6152
							var6.itemIds[var23] = var9; // L: 6153
							var6.itemQuantities[var23] = var10; // L: 6154
						}

						class29.itemContainerSetItem(var5, var23, var9 - 1, var10); // L: 6157
					}

					if (var6 != null) { // L: 6159
						class290.invalidateWidget(var6);
					}

					SceneTilePaint.method4499(); // L: 6160
					changedItemContainers[++field746 - 1 & 31] = var5 & 32767; // L: 6161
					var1.serverPacket = null; // L: 6162
					return true; // L: 6163
				}

				if (ServerPacket.field3086 == var1.serverPacket) { // L: 6165
					var22 = var3.method7877(); // L: 6174
					var20 = var22 >> 16; // L: 6175
					var5 = var22 >> 8 & 255; // L: 6176
					var7 = var20 + (var22 >> 4 & 7); // L: 6177
					var23 = var5 + (var22 & 7); // L: 6178
					var10 = var3.readUnsignedByte(); // L: 6179
					var61 = var3.readUnsignedShort(); // L: 6180
					var9 = var3.method7971(); // L: 6181
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104) { // L: 6182
						var7 = var7 * 128 + 64; // L: 6183
						var23 = var23 * 128 + 64; // L: 6184
						GraphicsObject var89 = new GraphicsObject(var9, class160.Client_plane, var7, var23, Archive.getTileHeight(var7, var23, class160.Client_plane) - var10, var61, cycle); // L: 6185
						graphicsObjects.addFirst(var89); // L: 6186
					}

					var1.serverPacket = null; // L: 6188
					return true; // L: 6189
				}

				if (ServerPacket.field3129 == var1.serverPacket) { // L: 6191
					var20 = var3.readInt(); // L: 6192
					if (var20 != field571) { // L: 6193
						field571 = var20; // L: 6194
						class11.method115(); // L: 6195
					}

					var1.serverPacket = null; // L: 6197
					return true; // L: 6198
				}

				if (ServerPacket.field3064 == var1.serverPacket) { // L: 6200
					class221.method4531(class263.field3009); // L: 6201
					var1.serverPacket = null; // L: 6202
					return true; // L: 6203
				}

				if (ServerPacket.field3025 == var1.serverPacket) { // L: 6205
					byte[] var52 = new byte[var1.serverPacketLength]; // L: 6206
					var3.method7708(var52, 0, var52.length); // L: 6207
					Buffer var79 = new Buffer(var52); // L: 6208
					var59 = var79.readStringCp1252NullTerminated(); // L: 6209
					class11.openURL(var59, true, false); // L: 6210
					var1.serverPacket = null; // L: 6211
					return true; // L: 6212
				}

				Widget var74;
				if (ServerPacket.field3035 == var1.serverPacket) { // L: 6214
					var20 = var3.method7797(); // L: 6215
					var74 = HorizontalAlignment.getWidget(var20); // L: 6216
					var74.modelType = 3; // L: 6217
					var74.modelId = class19.localPlayer.appearance.getChatHeadId(); // L: 6218
					class290.invalidateWidget(var74); // L: 6219
					var1.serverPacket = null; // L: 6220
					return true; // L: 6221
				}

				if (ServerPacket.field3099 == var1.serverPacket) { // L: 6223
					var20 = var3.readInt(); // L: 6224
					InterfaceParent var78 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6225
					if (var78 != null) { // L: 6226
						class20.closeInterface(var78, true);
					}

					if (meslayerContinueWidget != null) { // L: 6227
						class290.invalidateWidget(meslayerContinueWidget); // L: 6228
						meslayerContinueWidget = null; // L: 6229
					}

					var1.serverPacket = null; // L: 6231
					return true; // L: 6232
				}

				if (ServerPacket.field3076 == var1.serverPacket) { // L: 6234
					field749 = cycleCntr; // L: 6235
					var70 = var3.readByte(); // L: 6236
					class145 var76 = new class145(var3); // L: 6237
					ClanChannel var57;
					if (var70 >= 0) { // L: 6239
						var57 = currentClanChannels[var70];
					} else {
						var57 = class83.guestClanChannel; // L: 6240
					}

					var76.method3030(var57); // L: 6241
					var1.serverPacket = null; // L: 6242
					return true; // L: 6243
				}

				if (ServerPacket.field3054 == var1.serverPacket) { // L: 6245
					field749 = cycleCntr; // L: 6246
					var70 = var3.readByte(); // L: 6247
					if (var1.serverPacketLength == 1) { // L: 6248
						if (var70 >= 0) { // L: 6249
							currentClanChannels[var70] = null;
						} else {
							class83.guestClanChannel = null; // L: 6250
						}

						var1.serverPacket = null; // L: 6251
						return true; // L: 6252
					}

					if (var70 >= 0) { // L: 6254
						currentClanChannels[var70] = new ClanChannel(var3); // L: 6255
					} else {
						class83.guestClanChannel = new ClanChannel(var3); // L: 6258
					}

					var1.serverPacket = null; // L: 6260
					return true; // L: 6261
				}

				if (ServerPacket.field3096 == var1.serverPacket) { // L: 6263
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6264
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 6265
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6266
							class78.changeGameOptions(var20); // L: 6267
							changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6268
						}
					}

					var1.serverPacket = null; // L: 6271
					return true; // L: 6272
				}

				if (ServerPacket.field3045 == var1.serverPacket) { // L: 6274
					RouteStrategy.method3875(); // L: 6275
					var70 = var3.readByte(); // L: 6276
					if (var1.serverPacketLength == 1) { // L: 6277
						if (var70 >= 0) { // L: 6278
							currentClanSettings[var70] = null;
						} else {
							class134.guestClanSettings = null; // L: 6279
						}

						var1.serverPacket = null; // L: 6280
						return true; // L: 6281
					}

					if (var70 >= 0) { // L: 6283
						currentClanSettings[var70] = new ClanSettings(var3); // L: 6284
					} else {
						class134.guestClanSettings = new ClanSettings(var3); // L: 6287
					}

					var1.serverPacket = null; // L: 6289
					return true; // L: 6290
				}

				if (ServerPacket.field3028 == var1.serverPacket) { // L: 6292
					rebootTimer = var3.readUnsignedShort() * 30; // L: 6293
					field762 = cycleCntr; // L: 6294
					var1.serverPacket = null; // L: 6295
					return true; // L: 6296
				}

				if (ServerPacket.field3118 == var1.serverPacket) { // L: 6298
					var20 = var3.method7971(); // L: 6299
					var5 = var3.method7810(); // L: 6300
					var6 = HorizontalAlignment.getWidget(var5); // L: 6301
					if (var6.modelType != 2 || var20 != var6.modelId) { // L: 6302
						var6.modelType = 2; // L: 6303
						var6.modelId = var20; // L: 6304
						class290.invalidateWidget(var6); // L: 6305
					}

					var1.serverPacket = null; // L: 6307
					return true; // L: 6308
				}

				if (ServerPacket.field3121 == var1.serverPacket) { // L: 6310
					var20 = var3.method7797(); // L: 6311
					var5 = var3.readUnsignedShort(); // L: 6312
					var6 = HorizontalAlignment.getWidget(var20); // L: 6313
					if (var6.modelType != 1 || var5 != var6.modelId) { // L: 6314
						var6.modelType = 1; // L: 6315
						var6.modelId = var5; // L: 6316
						class290.invalidateWidget(var6); // L: 6317
					}

					var1.serverPacket = null; // L: 6319
					return true; // L: 6320
				}

				if (ServerPacket.field3024 == var1.serverPacket) { // L: 6322
					minimapState = var3.readUnsignedByte(); // L: 6323
					var1.serverPacket = null; // L: 6324
					return true; // L: 6325
				}

				if (ServerPacket.field3075 == var1.serverPacket) { // L: 6327
					var20 = var3.readUnsignedShort(); // L: 6328
					Language.method6136(var20); // L: 6329
					changedItemContainers[++field746 - 1 & 31] = var20 & 32767; // L: 6330
					var1.serverPacket = null; // L: 6331
					return true; // L: 6332
				}

				if (ServerPacket.field3101 == var1.serverPacket) { // L: 6334
					var20 = var3.readUnsignedShort(); // L: 6335
					var5 = var3.readUnsignedByte(); // L: 6336
					var22 = var3.readUnsignedShort(); // L: 6337
					KitDefinition.queueSoundEffect(var20, var5, var22); // L: 6338
					var1.serverPacket = null; // L: 6339
					return true; // L: 6340
				}

				if (ServerPacket.field3098 == var1.serverPacket) { // L: 6342
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6343
						if (players[var20] != null) { // L: 6344
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6346
						if (npcs[var20] != null) { // L: 6347
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6349
					return true; // L: 6350
				}

				if (ServerPacket.field3102 == var1.serverPacket) { // L: 6352
					var20 = var3.method7935(); // L: 6353
					rootInterface = var20; // L: 6354
					this.resizeRoot(false); // L: 6355
					class127.Widget_resetModelFrames(var20); // L: 6356
					class358.runWidgetOnLoadListener(rootInterface); // L: 6357

					for (var5 = 0; var5 < 100; ++var5) { // L: 6358
						field564[var5] = true;
					}

					var1.serverPacket = null; // L: 6359
					return true; // L: 6360
				}

				if (ServerPacket.field3119 == var1.serverPacket) { // L: 6362
					SceneTilePaint.method4499(); // L: 6363
					var20 = var3.method7927(); // L: 6364
					var5 = var3.method7790(); // L: 6365
					var22 = var3.method7797(); // L: 6366
					experience[var5] = var22; // L: 6367
					currentLevels[var5] = var20; // L: 6368
					levels[var5] = 1; // L: 6369

					for (var7 = 0; var7 < 98; ++var7) { // L: 6370
						if (var22 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 6371
					var1.serverPacket = null; // L: 6372
					return true; // L: 6373
				}

				if (ServerPacket.field3104 == var1.serverPacket) { // L: 6375
					publicChatMode = var3.method7927(); // L: 6376
					tradeChatMode = var3.method7789(); // L: 6377
					var1.serverPacket = null; // L: 6378
					return true; // L: 6379
				}

				if (ServerPacket.field3092 == var1.serverPacket) { // L: 6381
					if (rootInterface != -1) { // L: 6382
						MouseHandler.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6383
					return true; // L: 6384
				}

				if (ServerPacket.field3106 == var1.serverPacket) { // L: 6386
					SceneTilePaint.method4499(); // L: 6387
					weight = var3.readShort(); // L: 6388
					field762 = cycleCntr; // L: 6389
					var1.serverPacket = null; // L: 6390
					return true; // L: 6391
				}

				long var38;
				if (ServerPacket.field3069 == var1.serverPacket) { // L: 6393
					var20 = var3.offset + var1.serverPacketLength; // L: 6394
					var5 = var3.readUnsignedShort(); // L: 6395
					var22 = var3.readUnsignedShort(); // L: 6396
					if (var5 != rootInterface) { // L: 6397
						rootInterface = var5; // L: 6398
						this.resizeRoot(false); // L: 6399
						class127.Widget_resetModelFrames(rootInterface); // L: 6400
						class358.runWidgetOnLoadListener(rootInterface); // L: 6401

						for (var7 = 0; var7 < 100; ++var7) { // L: 6402
							field564[var7] = true;
						}
					}

					InterfaceParent var85;
					for (; var22-- > 0; var85.field1039 = true) { // L: 6404 6414
						var7 = var3.readInt(); // L: 6405
						var23 = var3.readUnsignedShort(); // L: 6406
						var9 = var3.readUnsignedByte(); // L: 6407
						var85 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6408
						if (var85 != null && var23 != var85.group) { // L: 6409
							class20.closeInterface(var85, true); // L: 6410
							var85 = null; // L: 6411
						}

						if (var85 == null) { // L: 6413
							var85 = ServerPacket.method5222(var7, var23, var9);
						}
					}

					for (var82 = (InterfaceParent)interfaceParents.first(); var82 != null; var82 = (InterfaceParent)interfaceParents.next()) { // L: 6416
						if (var82.field1039) { // L: 6417
							var82.field1039 = false;
						} else {
							class20.closeInterface(var82, true); // L: 6419
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6422

					while (var3.offset < var20) { // L: 6423
						var7 = var3.readInt(); // L: 6424
						var23 = var3.readUnsignedShort(); // L: 6425
						var9 = var3.readUnsignedShort(); // L: 6426
						var10 = var3.readInt(); // L: 6427

						for (var61 = var23; var61 <= var9; ++var61) { // L: 6428
							var38 = ((long)var7 << 32) + (long)var61; // L: 6429
							widgetFlags.put(new IntegerNode(var10), var38); // L: 6430
						}
					}

					var1.serverPacket = null; // L: 6433
					return true; // L: 6434
				}

				if (ServerPacket.field3031 == var1.serverPacket) { // L: 6436
					var50 = var3.readStringCp1252NullTerminated(); // L: 6437
					var21 = AbstractFont.escapeBrackets(AbstractByteArrayCopier.method5528(class118.method2737(var3))); // L: 6438
					Login.addGameMessage(6, var50, var21); // L: 6439
					var1.serverPacket = null; // L: 6440
					return true; // L: 6441
				}

				if (ServerPacket.field3050 == var1.serverPacket) { // L: 6443
					if (GameEngine.field205 == null) { // L: 6444
						GameEngine.field205 = new class391(FontName.HitSplatDefinition_cached);
					}

					class445 var51 = FontName.HitSplatDefinition_cached.method7173(var3); // L: 6445
					GameEngine.field205.field4376.vmethod7561(var51.field4680, var51.field4681); // L: 6446
					field682[++field683 - 1 & 31] = var51.field4680; // L: 6447
					var1.serverPacket = null; // L: 6448
					return true; // L: 6449
				}

				if (ServerPacket.field3112 == var1.serverPacket) { // L: 6451
					class9.field34 = var3.method7789(); // L: 6452
					FriendSystem.field803 = var3.method7927(); // L: 6453
					var1.serverPacket = null; // L: 6454
					return true; // L: 6455
				}

				if (ServerPacket.field3074 == var1.serverPacket) { // L: 6457
					for (var20 = 0; var20 < VarpDefinition.VarpDefinition_fileCount; ++var20) { // L: 6458
						VarpDefinition var75 = SoundCache.VarpDefinition_get(var20); // L: 6459
						if (var75 != null) { // L: 6460
							Varps.Varps_temp[var20] = 0; // L: 6461
							Varps.Varps_main[var20] = 0; // L: 6462
						}
					}

					SceneTilePaint.method4499(); // L: 6465
					changedVarpCount += 32; // L: 6466
					var1.serverPacket = null; // L: 6467
					return true; // L: 6468
				}

				String var40;
				if (ServerPacket.field3082 == var1.serverPacket) { // L: 6470
					var50 = var3.readStringCp1252NullTerminated(); // L: 6471
					var25 = var3.readLong(); // L: 6472
					var27 = (long)var3.readUnsignedShort(); // L: 6473
					var34 = (long)var3.readMedium(); // L: 6474
					PlayerType var36 = (PlayerType)ChatChannel.findEnumerated(HitSplatDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 6475
					var38 = (var27 << 32) + var34; // L: 6476
					boolean var67 = false; // L: 6477

					for (var15 = 0; var15 < 100; ++var15) { // L: 6478
						if (crossWorldMessageIds[var15] == var38) { // L: 6479
							var67 = true; // L: 6480
							break; // L: 6481
						}
					}

					if (var36.isUser && class155.friendSystem.isIgnored(new Username(var50, class83.loginType))) { // L: 6484 6485
						var67 = true;
					}

					if (!var67 && field603 == 0) { // L: 6487
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38; // L: 6488
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6489
						var40 = AbstractFont.escapeBrackets(AbstractByteArrayCopier.method5528(class118.method2737(var3))); // L: 6490
						if (var36.modIcon != -1) { // L: 6491
							class6.addChatMessage(9, class351.method6579(var36.modIcon) + var50, var40, UserComparator7.base37DecodeLong(var25));
						} else {
							class6.addChatMessage(9, var50, var40, UserComparator7.base37DecodeLong(var25)); // L: 6492
						}
					}

					var1.serverPacket = null; // L: 6494
					return true; // L: 6495
				}

				if (ServerPacket.field3047 == var1.serverPacket) { // L: 6497
					class155.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6498
					field685 = cycleCntr; // L: 6499
					var1.serverPacket = null; // L: 6500
					return true; // L: 6501
				}

				if (ServerPacket.field3122 == var1.serverPacket) { // L: 6503
					SceneTilePaint.method4499(); // L: 6504
					runEnergy = var3.readUnsignedByte(); // L: 6505
					field762 = cycleCntr; // L: 6506
					var1.serverPacket = null; // L: 6507
					return true; // L: 6508
				}

				if (ServerPacket.field3084 == var1.serverPacket) { // L: 6510
					var20 = var3.readUnsignedByte(); // L: 6511
					var21 = var3.readStringCp1252NullTerminated(); // L: 6512
					var22 = var3.method7789(); // L: 6513
					if (var20 >= 1 && var20 <= 8) { // L: 6514
						if (var21.equalsIgnoreCase("null")) { // L: 6515
							var21 = null;
						}

						playerMenuActions[var20 - 1] = var21; // L: 6516
						playerOptionsPriorities[var20 - 1] = var22 == 0; // L: 6517
					}

					var1.serverPacket = null; // L: 6519
					return true; // L: 6520
				}

				if (ServerPacket.field3123 == var1.serverPacket) { // L: 6522
					var22 = var3.method7877(); // L: 6533
					var20 = var22 >> 16; // L: 6534
					var5 = var22 >> 8 & 255; // L: 6535
					var7 = var20 + (var22 >> 4 & 7); // L: 6536
					var23 = var5 + (var22 & 7); // L: 6537
					var9 = var3.method7789(); // L: 6538
					var10 = var9 >> 2; // L: 6539
					var61 = var9 & 3; // L: 6540
					var12 = field711[var10]; // L: 6541
					var68 = var3.readUnsignedShort(); // L: 6542
					if (var7 >= 0 && var23 >= 0 && var7 < 103 && var23 < 103) { // L: 6543
						if (var12 == 0) { // L: 6544
							BoundaryObject var93 = FriendSystem.scene.method4150(class160.Client_plane, var7, var23); // L: 6545
							if (var93 != null) { // L: 6546
								var15 = class121.Entity_unpackID(var93.tag); // L: 6547
								if (var10 == 2) { // L: 6548
									var93.renderable1 = new DynamicObject(var15, 2, var61 + 4, class160.Client_plane, var7, var23, var68, false, var93.renderable1); // L: 6549
									var93.renderable2 = new DynamicObject(var15, 2, var61 + 1 & 3, class160.Client_plane, var7, var23, var68, false, var93.renderable2); // L: 6550
								} else {
									var93.renderable1 = new DynamicObject(var15, var10, var61, class160.Client_plane, var7, var23, var68, false, var93.renderable1); // L: 6552
								}
							}
						} else if (var12 == 1) { // L: 6555
							WallDecoration var92 = FriendSystem.scene.method4224(class160.Client_plane, var7, var23); // L: 6556
							if (var92 != null) { // L: 6557
								var15 = class121.Entity_unpackID(var92.tag); // L: 6558
								if (var10 != 4 && var10 != 5) { // L: 6559
									if (var10 == 6) { // L: 6562
										var92.renderable1 = new DynamicObject(var15, 4, var61 + 4, class160.Client_plane, var7, var23, var68, false, var92.renderable1); // L: 6563
									} else if (var10 == 7) { // L: 6565
										var92.renderable1 = new DynamicObject(var15, 4, (var61 + 2 & 3) + 4, class160.Client_plane, var7, var23, var68, false, var92.renderable1); // L: 6566
									} else if (var10 == 8) { // L: 6568
										var92.renderable1 = new DynamicObject(var15, 4, var61 + 4, class160.Client_plane, var7, var23, var68, false, var92.renderable1); // L: 6569
										var92.renderable2 = new DynamicObject(var15, 4, (var61 + 2 & 3) + 4, class160.Client_plane, var7, var23, var68, false, var92.renderable2); // L: 6570
									}
								} else {
									var92.renderable1 = new DynamicObject(var15, 4, var61, class160.Client_plane, var7, var23, var68, false, var92.renderable1); // L: 6560
								}
							}
						} else if (var12 == 2) { // L: 6574
							GameObject var90 = FriendSystem.scene.getGameObject(class160.Client_plane, var7, var23); // L: 6575
							if (var10 == 11) { // L: 6576
								var10 = 10; // L: 6577
							}

							if (var90 != null) { // L: 6579
								var90.renderable = new DynamicObject(class121.Entity_unpackID(var90.tag), var10, var61, class160.Client_plane, var7, var23, var68, false, var90.renderable); // L: 6580
							}
						} else if (var12 == 3) { // L: 6583
							FloorDecoration var91 = FriendSystem.scene.getFloorDecoration(class160.Client_plane, var7, var23); // L: 6584
							if (var91 != null) { // L: 6585
								var91.renderable = new DynamicObject(class121.Entity_unpackID(var91.tag), 22, var61, class160.Client_plane, var7, var23, var68, false, var91.renderable); // L: 6586
							}
						}
					}

					var1.serverPacket = null; // L: 6590
					return true; // L: 6591
				}

				if (ServerPacket.field3046 == var1.serverPacket) { // L: 6593
					var20 = var3.method7797(); // L: 6594
					var74 = HorizontalAlignment.getWidget(var20); // L: 6595

					for (var22 = 0; var22 < var74.itemIds.length; ++var22) { // L: 6596
						var74.itemIds[var22] = -1; // L: 6597
						var74.itemIds[var22] = 0; // L: 6598
					}

					class290.invalidateWidget(var74); // L: 6600
					var1.serverPacket = null; // L: 6601
					return true; // L: 6602
				}

				if (ServerPacket.field3068 == var1.serverPacket) { // L: 6604
					var70 = var3.readByte(); // L: 6605
					var25 = (long)var3.readUnsignedShort(); // L: 6606
					var27 = (long)var3.readMedium(); // L: 6607
					var34 = (var25 << 32) + var27; // L: 6608
					boolean var11 = false; // L: 6609
					ClanChannel var37 = var70 >= 0 ? currentClanChannels[var70] : class83.guestClanChannel; // L: 6610
					if (var37 == null) { // L: 6611
						var11 = true;
					} else {
						for (var68 = 0; var68 < 100; ++var68) { // L: 6613
							if (crossWorldMessageIds[var68] == var34) { // L: 6614
								var11 = true; // L: 6615
								break; // L: 6616
							}
						}
					}

					if (!var11) { // L: 6620
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34; // L: 6621
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6622
						var32 = class118.method2737(var3); // L: 6623
						var14 = var70 >= 0 ? 43 : 46; // L: 6624
						class6.addChatMessage(var14, "", var32, var37.name); // L: 6625
					}

					var1.serverPacket = null; // L: 6627
					return true; // L: 6628
				}

				if (ServerPacket.field3029 == var1.serverPacket) { // L: 6630
					var20 = var3.readUnsignedByte(); // L: 6631
					class19.forceDisconnect(var20); // L: 6632
					var1.serverPacket = null; // L: 6633
					return false; // L: 6634
				}

				if (ServerPacket.field3081 == var1.serverPacket) { // L: 6636
					GameEngine.field205 = new class391(FontName.HitSplatDefinition_cached); // L: 6637
					var1.serverPacket = null; // L: 6638
					return true; // L: 6639
				}

				if (ServerPacket.field3083 == var1.serverPacket) { // L: 6641
					destinationX = var3.readUnsignedByte(); // L: 6642
					if (destinationX == 255) { // L: 6643
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6644
					if (destinationY == 255) { // L: 6645
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6646
					return true; // L: 6647
				}

				if (ServerPacket.field3039 == var1.serverPacket) { // L: 6649
					hintArrowType = var3.readUnsignedByte(); // L: 6650
					if (hintArrowType == 1) { // L: 6651
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6652
						if (hintArrowType == 2) { // L: 6653
							hintArrowSubX = 64; // L: 6654
							hintArrowSubY = 64; // L: 6655
						}

						if (hintArrowType == 3) { // L: 6657
							hintArrowSubX = 0; // L: 6658
							hintArrowSubY = 64; // L: 6659
						}

						if (hintArrowType == 4) { // L: 6661
							hintArrowSubX = 128; // L: 6662
							hintArrowSubY = 64; // L: 6663
						}

						if (hintArrowType == 5) { // L: 6665
							hintArrowSubX = 64; // L: 6666
							hintArrowSubY = 0; // L: 6667
						}

						if (hintArrowType == 6) { // L: 6669
							hintArrowSubX = 64; // L: 6670
							hintArrowSubY = 128; // L: 6671
						}

						hintArrowType = 2; // L: 6673
						hintArrowX = var3.readUnsignedShort(); // L: 6674
						hintArrowY = var3.readUnsignedShort(); // L: 6675
						hintArrowHeight = var3.readUnsignedByte(); // L: 6676
					}

					if (hintArrowType == 10) { // L: 6678
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6679
					return true; // L: 6680
				}

				if (ServerPacket.field3120 == var1.serverPacket) { // L: 6682
					class268.readReflectionCheck(var3, var1.serverPacketLength); // L: 6683
					var1.serverPacket = null; // L: 6684
					return true; // L: 6685
				}

				if (ServerPacket.field3125 == var1.serverPacket) { // L: 6687
					class162.field1768 = true; // L: 6688
					DynamicObject.updateNpcs(false, var3); // L: 6689
					var1.serverPacket = null; // L: 6690
					return true; // L: 6691
				}

				NPC var24;
				if (ServerPacket.field3063 == var1.serverPacket) { // L: 6693
					var5 = var3.method7810(); // L: 6698
					var22 = var3.method7935(); // L: 6699
					var20 = var3.method7798(); // L: 6700
					var24 = npcs[var20]; // L: 6701
					if (var24 != null) { // L: 6702
						var24.spotAnimation = var22; // L: 6703
						var24.spotAnimationHeight = var5 >> 16; // L: 6704
						var24.field1173 = (var5 & 65535) + cycle; // L: 6705
						var24.spotAnimationFrame = 0; // L: 6706
						var24.spotAnimationFrameCycle = 0; // L: 6707
						if (var24.field1173 > cycle) { // L: 6708
							var24.spotAnimationFrame = -1; // L: 6709
						}

						if (var24.spotAnimation == 65535) { // L: 6711
							var24.spotAnimation = -1; // L: 6712
						}
					}

					var1.serverPacket = null; // L: 6715
					return true; // L: 6716
				}

				if (ServerPacket.field3053 == var1.serverPacket) { // L: 6718
					var20 = var3.readInt(); // L: 6719
					var5 = var3.method7802(); // L: 6720
					var6 = HorizontalAlignment.getWidget(var20); // L: 6721
					if (var5 != var6.sequenceId || var5 == -1) { // L: 6722
						var6.sequenceId = var5; // L: 6723
						var6.modelFrame = 0; // L: 6724
						var6.modelFrameCycle = 0; // L: 6725
						class290.invalidateWidget(var6); // L: 6726
					}

					var1.serverPacket = null; // L: 6728
					return true; // L: 6729
				}

				if (ServerPacket.field3094 == var1.serverPacket) { // L: 6731
					class221.method4531(class263.field3005); // L: 6732
					var1.serverPacket = null; // L: 6733
					return true; // L: 6734
				}

				if (ServerPacket.field3067 == var1.serverPacket) { // L: 6736
					class221.method4531(class263.field3008); // L: 6737
					var1.serverPacket = null; // L: 6738
					return true; // L: 6739
				}

				if (ServerPacket.field3062 == var1.serverPacket) { // L: 6741
					var20 = var3.method7798(); // L: 6742
					if (var20 == 65535) { // L: 6743
						var20 = -1;
					}

					var5 = var3.method7797(); // L: 6744
					var22 = var3.method7810(); // L: 6745
					var80 = HorizontalAlignment.getWidget(var22); // L: 6746
					ItemComposition var8;
					if (!var80.isIf3) { // L: 6747
						if (var20 == -1) { // L: 6748
							var80.modelType = 0; // L: 6749
							var1.serverPacket = null; // L: 6750
							return true; // L: 6751
						}

						var8 = class67.ItemDefinition_get(var20); // L: 6753
						var80.modelType = 4; // L: 6754
						var80.modelId = var20; // L: 6755
						var80.modelAngleX = var8.xan2d; // L: 6756
						var80.modelAngleY = var8.yan2d; // L: 6757
						var80.modelZoom = var8.zoom2d * 100 / var5; // L: 6758
						class290.invalidateWidget(var80); // L: 6759
					} else {
						var80.itemId = var20; // L: 6762
						var80.itemQuantity = var5; // L: 6763
						var8 = class67.ItemDefinition_get(var20); // L: 6764
						var80.modelAngleX = var8.xan2d; // L: 6765
						var80.modelAngleY = var8.yan2d; // L: 6766
						var80.modelAngleZ = var8.zan2d; // L: 6767
						var80.modelOffsetX = var8.offsetX2d; // L: 6768
						var80.modelOffsetY = var8.offsetY2d; // L: 6769
						var80.modelZoom = var8.zoom2d; // L: 6770
						if (var8.isStackable == 1) { // L: 6771
							var80.itemQuantityMode = 1;
						} else {
							var80.itemQuantityMode = 2; // L: 6772
						}

						if (var80.field3398 > 0) { // L: 6773
							var80.modelZoom = var80.modelZoom * 32 / var80.field3398;
						} else if (var80.rawWidth > 0) { // L: 6774
							var80.modelZoom = var80.modelZoom * 32 / var80.rawWidth;
						}

						class290.invalidateWidget(var80); // L: 6775
					}

					var1.serverPacket = null; // L: 6777
					return true; // L: 6778
				}

				if (ServerPacket.field3111 == var1.serverPacket) { // L: 6780
					var20 = var3.method7797(); // L: 6781
					var5 = var3.method7935(); // L: 6782
					var6 = HorizontalAlignment.getWidget(var20); // L: 6783
					if (var6 != null && var6.type == 0) { // L: 6784
						if (var5 > var6.scrollHeight - var6.height) { // L: 6785
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) { // L: 6786
							var5 = 0;
						}

						if (var5 != var6.scrollY) { // L: 6787
							var6.scrollY = var5; // L: 6788
							class290.invalidateWidget(var6); // L: 6789
						}
					}

					var1.serverPacket = null; // L: 6792
					return true; // L: 6793
				}

				if (ServerPacket.field3109 == var1.serverPacket) { // L: 6795
					var5 = var3.readUnsignedShort(); // L: 6800
					var22 = var3.method7889(); // L: 6801
					var20 = var3.readUnsignedShort(); // L: 6802
					Player var77;
					if (var20 == localPlayerIndex) { // L: 6803
						var77 = class19.localPlayer; // L: 6804
					} else {
						var77 = players[var20]; // L: 6807
					}

					if (var77 != null) { // L: 6809
						var77.spotAnimation = var5; // L: 6810
						var77.spotAnimationHeight = var22 >> 16; // L: 6811
						var77.field1173 = (var22 & 65535) + cycle; // L: 6812
						var77.spotAnimationFrame = 0; // L: 6813
						var77.spotAnimationFrameCycle = 0; // L: 6814
						if (var77.field1173 > cycle) { // L: 6815
							var77.spotAnimationFrame = -1; // L: 6816
						}

						if (var77.spotAnimation == 65535) { // L: 6818
							var77.spotAnimation = -1; // L: 6819
						}
					}

					var1.serverPacket = null; // L: 6822
					return true; // L: 6823
				}

				if (ServerPacket.field3089 == var1.serverPacket) { // L: 6825
					var50 = var3.readStringCp1252NullTerminated(); // L: 6826
					Object[] var73 = new Object[var50.length() + 1]; // L: 6827

					for (var22 = var50.length() - 1; var22 >= 0; --var22) { // L: 6828
						if (var50.charAt(var22) == 's') { // L: 6829
							var73[var22 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var73[var22 + 1] = new Integer(var3.readInt()); // L: 6830
						}
					}

					var73[0] = new Integer(var3.readInt()); // L: 6832
					ScriptEvent var55 = new ScriptEvent(); // L: 6833
					var55.args = var73; // L: 6834
					class1.runScriptEvent(var55); // L: 6835
					var1.serverPacket = null; // L: 6836
					return true; // L: 6837
				}

				if (ServerPacket.field3066 == var1.serverPacket) { // L: 6839
					var20 = var3.readUnsignedByte(); // L: 6840
					class82.method2123(var20); // L: 6841
					var1.serverPacket = null; // L: 6842
					return true; // L: 6843
				}

				if (ServerPacket.field3097 == var1.serverPacket) { // L: 6845
					isCameraLocked = true; // L: 6846
					field739 = false; // L: 6847
					PcmPlayer.field302 = var3.readUnsignedByte(); // L: 6848
					DevicePcmPlayerProvider.field146 = var3.readUnsignedByte(); // L: 6849
					ClanSettings.field1608 = var3.readUnsignedShort(); // L: 6850
					Tiles.field996 = var3.readUnsignedByte(); // L: 6851
					class33.field231 = var3.readUnsignedByte(); // L: 6852
					if (class33.field231 >= 100) { // L: 6853
						EnumComposition.cameraX = PcmPlayer.field302 * 128 + 64; // L: 6854
						CollisionMap.cameraZ = DevicePcmPlayerProvider.field146 * 128 + 64; // L: 6855
						FriendSystem.cameraY = Archive.getTileHeight(EnumComposition.cameraX, CollisionMap.cameraZ, class160.Client_plane) - ClanSettings.field1608; // L: 6856
					}

					var1.serverPacket = null; // L: 6858
					return true; // L: 6859
				}

				if (ServerPacket.field3037 == var1.serverPacket) { // L: 6861
					class221.method4531(class263.field3011); // L: 6862
					var1.serverPacket = null; // L: 6863
					return true; // L: 6864
				}

				if (ServerPacket.field3059 == var1.serverPacket) { // L: 6866
					var22 = var3.method7790(); // L: 6870
					var20 = var3.method7971(); // L: 6871
					var5 = var3.method7935(); // L: 6872
					if (var5 == 65535) { // L: 6873
						var5 = -1; // L: 6874
					}

					var24 = npcs[var20]; // L: 6876
					if (var24 != null) { // L: 6877
						if (var5 == var24.sequence && var5 != -1) { // L: 6878
							var23 = ItemContainer.SequenceDefinition_get(var5).field2172; // L: 6879
							if (var23 == 1) { // L: 6880
								var24.sequenceFrame = 0; // L: 6881
								var24.sequenceFrameCycle = 0; // L: 6882
								var24.sequenceDelay = var22; // L: 6883
								var24.field1169 = 0; // L: 6884
							} else if (var23 == 2) { // L: 6886
								var24.field1169 = 0; // L: 6887
							}
						} else if (var5 == -1 || var24.sequence == -1 || ItemContainer.SequenceDefinition_get(var5).field2166 >= ItemContainer.SequenceDefinition_get(var24.sequence).field2166) { // L: 6890
							var24.sequence = var5; // L: 6891
							var24.sequenceFrame = 0; // L: 6892
							var24.sequenceFrameCycle = 0; // L: 6893
							var24.sequenceDelay = var22; // L: 6894
							var24.field1169 = 0; // L: 6895
							var24.field1134 = var24.pathLength; // L: 6896
						}
					}

					var1.serverPacket = null; // L: 6900
					return true; // L: 6901
				}

				if (ServerPacket.field3070 == var1.serverPacket) { // L: 6903
					class221.method4531(class263.field3007); // L: 6904
					var1.serverPacket = null; // L: 6905
					return true; // L: 6906
				}

				if (ServerPacket.field3080 == var1.serverPacket) { // L: 6908
					var20 = var3.readInt(); // L: 6909
					var5 = var3.readUnsignedShort(); // L: 6910
					if (var20 < -70000) { // L: 6911
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6913
						var6 = HorizontalAlignment.getWidget(var20);
					} else {
						var6 = null; // L: 6914
					}

					for (; var3.offset < var1.serverPacketLength; class29.itemContainerSetItem(var5, var7, var23 - 1, var9)) { // L: 6915 6929
						var7 = var3.readUShortSmart(); // L: 6916
						var23 = var3.readUnsignedShort(); // L: 6917
						var9 = 0; // L: 6918
						if (var23 != 0) { // L: 6919
							var9 = var3.readUnsignedByte(); // L: 6920
							if (var9 == 255) { // L: 6921
								var9 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) { // L: 6923 6924
							var6.itemIds[var7] = var23; // L: 6925
							var6.itemQuantities[var7] = var9; // L: 6926
						}
					}

					if (var6 != null) { // L: 6931
						class290.invalidateWidget(var6);
					}

					SceneTilePaint.method4499(); // L: 6932
					changedItemContainers[++field746 - 1 & 31] = var5 & 32767; // L: 6933
					var1.serverPacket = null; // L: 6934
					return true; // L: 6935
				}

				if (ServerPacket.field3049 == var1.serverPacket) { // L: 6937
					var20 = var3.method7971(); // L: 6938
					if (var20 == 65535) { // L: 6939
						var20 = -1;
					}

					class401.playSong(var20); // L: 6940
					var1.serverPacket = null; // L: 6941
					return true; // L: 6942
				}

				if (ServerPacket.field3093 == var1.serverPacket) { // L: 6944
					var20 = var3.method7805(); // L: 6945
					var5 = var3.method7971(); // L: 6946
					if (var5 == 65535) { // L: 6947
						var5 = -1;
					}

					class145.method3032(var5, var20); // L: 6948
					var1.serverPacket = null; // L: 6949
					return true; // L: 6950
				}

				if (ServerPacket.field3113 == var1.serverPacket) { // L: 6952
					FillMode.method8155(var3.readStringCp1252NullTerminated()); // L: 6953
					var1.serverPacket = null; // L: 6954
					return true; // L: 6955
				}

				if (ServerPacket.field3026 == var1.serverPacket) { // L: 6957
					class221.method4531(class263.field3004); // L: 6958
					var1.serverPacket = null; // L: 6959
					return true; // L: 6960
				}

				if (ServerPacket.field3127 == var1.serverPacket) { // L: 6962
					class146.loadRegions(false, var1.packetBuffer); // L: 6963
					var1.serverPacket = null; // L: 6964
					return true; // L: 6965
				}

				if (ServerPacket.field3055 == var1.serverPacket) { // L: 6967
					class155.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6968
					ObjectComposition.FriendSystem_invalidateIgnoreds(); // L: 6969
					field685 = cycleCntr; // L: 6970
					var1.serverPacket = null; // L: 6971
					return true; // L: 6972
				}

				if (ServerPacket.field3087 == var1.serverPacket) { // L: 6974
					class162.field1768 = true; // L: 6975
					DynamicObject.updateNpcs(true, var3); // L: 6976
					var1.serverPacket = null; // L: 6977
					return true; // L: 6978
				}

				if (ServerPacket.field3073 == var1.serverPacket) { // L: 6980
					class155.friendSystem.method1687(); // L: 6981
					field685 = cycleCntr; // L: 6982
					var1.serverPacket = null; // L: 6983
					return true; // L: 6984
				}

				if (ServerPacket.field3108 == var1.serverPacket) { // L: 6986
					if (var1.serverPacketLength == 0) { // L: 6987
						class230.friendsChat = null; // L: 6988
					} else {
						if (class230.friendsChat == null) { // L: 6991
							class230.friendsChat = new FriendsChat(class83.loginType, UserComparator10.client); // L: 6992
						}

						class230.friendsChat.readUpdate(var3); // L: 6994
					}

					Strings.method5798(); // L: 6996
					var1.serverPacket = null; // L: 6997
					return true; // L: 6998
				}

				if (ServerPacket.field3115 == var1.serverPacket) { // L: 7000
					var70 = var3.readByte(); // L: 7001
					var21 = var3.readStringCp1252NullTerminated(); // L: 7002
					long var42 = (long)var3.readUnsignedShort(); // L: 7003
					long var44 = (long)var3.readMedium(); // L: 7004
					PlayerType var33 = (PlayerType)ChatChannel.findEnumerated(HitSplatDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 7005
					long var46 = (var42 << 32) + var44; // L: 7006
					boolean var13 = false; // L: 7007
					ClanChannel var41 = null; // L: 7008
					var41 = var70 >= 0 ? currentClanChannels[var70] : class83.guestClanChannel; // L: 7010
					if (var41 == null) { // L: 7011
						var13 = true; // L: 7012
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var33.isUser && class155.friendSystem.isIgnored(new Username(var21, class83.loginType))) { // L: 7021 7022
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var46) { // L: 7016
								var13 = true; // L: 7017
								break; // L: 7018
							}

							++var15; // L: 7015
						}
					}

					if (!var13) { // L: 7025
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46; // L: 7026
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7027
						var40 = AbstractFont.escapeBrackets(class118.method2737(var3)); // L: 7028
						var16 = var70 >= 0 ? 41 : 44; // L: 7029
						if (var33.modIcon != -1) { // L: 7030
							class6.addChatMessage(var16, class351.method6579(var33.modIcon) + var21, var40, var41.name);
						} else {
							class6.addChatMessage(var16, var21, var40, var41.name); // L: 7031
						}
					}

					var1.serverPacket = null; // L: 7033
					return true; // L: 7034
				}

				if (ServerPacket.field3077 == var1.serverPacket) { // L: 7036
					var20 = var3.readUnsignedByte(); // L: 7037
					if (var3.readUnsignedByte() == 0) { // L: 7038
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 7039
						var3.offset += 18; // L: 7040
					} else {
						--var3.offset; // L: 7043
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 7044
					}

					field689 = cycleCntr; // L: 7046
					var1.serverPacket = null; // L: 7047
					return true; // L: 7048
				}

				class301.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -805983233 * -998616065 : -1) + "," + (var1.field1329 != null ? var1.field1329.id * -805983233 * -998616065 : -1) + "," + (var1.field1331 != null ? var1.field1331.id * -805983233 * -998616065 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7050
				GameObject.logOut(); // L: 7051
			} catch (IOException var48) { // L: 7053
				class9.method64(); // L: 7054
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -805983233 * -998616065 : -1) + "," + (var1.field1329 != null ? var1.field1329.id * -805983233 * -998616065 : -1) + "," + (var1.field1331 != null ? var1.field1331.id * -805983233 * -998616065 : -1) + "," + var1.serverPacketLength + "," + (class19.localPlayer.pathX[0] + ApproximateRouteStrategy.baseX) + "," + (class19.localPlayer.pathY[0] + class250.baseY) + ","; // L: 7057

				for (var22 = 0; var22 < var1.serverPacketLength && var22 < 50; ++var22) { // L: 7058
					var21 = var21 + var3.array[var22] + ",";
				}

				class301.RunException_sendStackTrace(var21, var49); // L: 7059
				GameObject.logOut(); // L: 7060
			}

			return true; // L: 7062
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("menu")
	final void menu() {
		class21.incrementMenuEntries(); // L: 8038
		if (FloorDecoration.dragInventoryWidget == null) { // L: 8039
			if (clickedWidget == null) { // L: 8040
				int var2;
				int var4;
				int var5;
				label281: {
					int var1 = MouseHandler.MouseHandler_lastButton; // L: 8041
					int var3;
					int var8;
					int var14;
					if (isMenuOpen) { // L: 8042
						int var18;
						if (var1 != 1 && (UserComparator5.mouseCam || var1 != 4)) { // L: 8043
							var2 = MouseHandler.MouseHandler_x; // L: 8044
							var3 = MouseHandler.MouseHandler_y; // L: 8045
							if (var2 < class307.menuX - 10 || var2 > class307.menuX + class11.menuWidth + 10 || var3 < ArchiveDiskActionHandler.menuY - 10 || var3 > ArchiveDiskActionHandler.menuY + UrlRequester.menuHeight + 10) { // L: 8046
								isMenuOpen = false; // L: 8047
								var4 = class307.menuX; // L: 8048
								var5 = ArchiveDiskActionHandler.menuY; // L: 8049
								var14 = class11.menuWidth; // L: 8050
								var18 = UrlRequester.menuHeight; // L: 8051

								for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 8053
									if (rootWidgetXs[var8] + rootWidgetWidths[var8] > var4 && rootWidgetXs[var8] < var14 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var18 + var5) { // L: 8054
										field564[var8] = true;
									}
								}
							}
						}

						if (var1 == 1 || !UserComparator5.mouseCam && var1 == 4) { // L: 8059
							var2 = class307.menuX; // L: 8060
							var3 = ArchiveDiskActionHandler.menuY; // L: 8061
							var4 = class11.menuWidth; // L: 8062
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8063
							var14 = MouseHandler.MouseHandler_lastPressedY; // L: 8064
							var18 = -1; // L: 8065

							int var9;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8066
								var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 8067
								if (var5 > var2 && var5 < var4 + var2 && var14 > var9 - 13 && var14 < var9 + 3) { // L: 8068
									var18 = var8;
								}
							}

							int var10;
							int var11;
							if (var18 != -1 && var18 >= 0) { // L: 8070 8071
								var8 = menuArguments1[var18]; // L: 8072
								var9 = menuArguments2[var18]; // L: 8073
								var10 = menuOpcodes[var18]; // L: 8074
								var11 = menuIdentifiers[var18]; // L: 8075
								String var12 = menuActions[var18]; // L: 8076
								String var13 = menuTargets[var18]; // L: 8077
								SoundCache.menuAction(var8, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8078
							}

							isMenuOpen = false; // L: 8080
							var8 = class307.menuX; // L: 8081
							var9 = ArchiveDiskActionHandler.menuY; // L: 8082
							var10 = class11.menuWidth; // L: 8083
							var11 = UrlRequester.menuHeight; // L: 8084

							for (int var17 = 0; var17 < rootWidgetCount; ++var17) { // L: 8086
								if (rootWidgetXs[var17] + rootWidgetWidths[var17] > var8 && rootWidgetXs[var17] < var8 + var10 && rootWidgetYs[var17] + rootWidgetHeights[var17] > var9 && rootWidgetYs[var17] < var11 + var9) { // L: 8087
									field564[var17] = true;
								}
							}
						}
					} else {
						var2 = class168.method3324(); // L: 8093
						if ((var1 == 1 || !UserComparator5.mouseCam && var1 == 4) && var2 >= 0) { // L: 8094
							var3 = menuOpcodes[var2]; // L: 8095
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 8096
								var4 = menuArguments1[var2]; // L: 8097
								var5 = menuArguments2[var2]; // L: 8098
								Widget var6 = HorizontalAlignment.getWidget(var5); // L: 8099
								var8 = WorldMapSection2.getWidgetFlags(var6); // L: 8101
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 8103
								if (var7) { // L: 8105
									break label281;
								}

								Object var10000 = null;
								if (class239.method4998(WorldMapSection2.getWidgetFlags(var6))) {
									break label281;
								}
							}
						}

						if ((var1 == 1 || !UserComparator5.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8131 8132
							var1 = 2; // L: 8133
						}

						if ((var1 == 1 || !UserComparator5.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8136 8138
							var3 = menuArguments1[var2]; // L: 8139
							var4 = menuArguments2[var2]; // L: 8140
							var5 = menuOpcodes[var2]; // L: 8141
							var14 = menuIdentifiers[var2]; // L: 8142
							String var15 = menuActions[var2]; // L: 8143
							String var16 = menuTargets[var2]; // L: 8144
							SoundCache.menuAction(var3, var4, var5, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8145
						}

						if (var1 == 2 && menuOptionsCount > 0) { // L: 8148
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 8150
				}

				if (FloorDecoration.dragInventoryWidget != null && !field601 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8106 8107
					UserComparator8.method2576(draggedWidgetX, draggedWidgetY); // L: 8108
				}

				field601 = false; // L: 8111
				itemDragDuration = 0; // L: 8112
				if (FloorDecoration.dragInventoryWidget != null) { // L: 8113
					class290.invalidateWidget(FloorDecoration.dragInventoryWidget);
				}

				FloorDecoration.dragInventoryWidget = HorizontalAlignment.getWidget(var5); // L: 8114
				dragItemSlotSource = var4; // L: 8115
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8116
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8117
				if (var2 >= 0) { // L: 8118
					PacketWriter.tempMenuAction = new MenuAction(); // L: 8119
					PacketWriter.tempMenuAction.param0 = menuArguments1[var2]; // L: 8120
					PacketWriter.tempMenuAction.param1 = menuArguments2[var2]; // L: 8121
					PacketWriter.tempMenuAction.opcode = menuOpcodes[var2]; // L: 8122
					PacketWriter.tempMenuAction.identifier = menuIdentifiers[var2]; // L: 8123
					PacketWriter.tempMenuAction.action = menuActions[var2]; // L: 8124
				}

				class290.invalidateWidget(FloorDecoration.dragInventoryWidget); // L: 8126
			}
		}
	} // L: 8127

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1137783125"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class168.method3324(); // L: 8153
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || ArchiveLoader.method2071(var1)) && !menuShiftClick[var1]; // L: 8154
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1232643092"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = FloorOverlayDefinition.fontBold12.stringWidth("Choose Option"); // L: 8159

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 8160
			var5 = FloorOverlayDefinition.fontBold12.stringWidth(ReflectionCheck.method637(var4)); // L: 8161
			if (var5 > var3) { // L: 8162
				var3 = var5;
			}
		}

		var3 += 8; // L: 8164
		var4 = menuOptionsCount * 15 + 22; // L: 8165
		var5 = var1 - var3 / 2; // L: 8166
		if (var3 + var5 > class4.canvasWidth) { // L: 8167
			var5 = class4.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 8168
			var5 = 0;
		}

		int var6 = var2; // L: 8169
		if (var4 + var2 > class309.canvasHeight) { // L: 8170
			var6 = class309.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 8171
			var6 = 0;
		}

		class307.menuX = var5; // L: 8172
		ArchiveDiskActionHandler.menuY = var6; // L: 8173
		class11.menuWidth = var3; // L: 8174
		UrlRequester.menuHeight = menuOptionsCount * 15 + 22; // L: 8175
		var1 -= viewportOffsetX; // L: 8177
		var2 -= viewportOffsetY; // L: 8178
		FriendSystem.scene.menuOpen(class160.Client_plane, var1, var2, false); // L: 8179
		isMenuOpen = true; // L: 8180
	} // L: 8181

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "112"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		DynamicObject.method1982(rootInterface, class4.canvasWidth, class309.canvasHeight, var1); // L: 10129
	} // L: 10130

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "-1069729591"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : HorizontalAlignment.getWidget(var1.parentId); // L: 10133
		int var3;
		int var4;
		if (var2 == null) { // L: 10136
			var3 = class4.canvasWidth; // L: 10137
			var4 = class309.canvasHeight; // L: 10138
		} else {
			var3 = var2.width; // L: 10141
			var4 = var2.height; // L: 10142
		}

		class116.alignWidgetSize(var1, var3, var4, false); // L: 10144
		class162.alignWidgetPosition(var1, var3, var4); // L: 10145
	} // L: 10146

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "976912886"
	)
	final void method1159() {
		class290.invalidateWidget(clickedWidget); // L: 11169
		++class136.widgetDragDuration; // L: 11170
		if (field671 && field668) { // L: 11171
			int var1 = MouseHandler.MouseHandler_x; // L: 11177
			int var2 = MouseHandler.MouseHandler_y; // L: 11178
			var1 -= widgetClickX; // L: 11179
			var2 -= widgetClickY; // L: 11180
			if (var1 < field669) { // L: 11181
				var1 = field669;
			}

			if (var1 + clickedWidget.width > field669 + clickedWidgetParent.width) { // L: 11182
				var1 = field669 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field628) { // L: 11183
				var2 = field628;
			}

			if (var2 + clickedWidget.height > field628 + clickedWidgetParent.height) { // L: 11184
				var2 = field628 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field596; // L: 11185
			int var4 = var2 - field673; // L: 11186
			int var5 = clickedWidget.dragZoneSize; // L: 11187
			if (class136.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11188 11189
				isDraggingWidget = true; // L: 11190
			}

			int var6 = var1 - field669 + clickedWidgetParent.scrollX; // L: 11193
			int var7 = var2 - field628 + clickedWidgetParent.scrollY; // L: 11194
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11195
				var8 = new ScriptEvent(); // L: 11196
				var8.widget = clickedWidget; // L: 11197
				var8.mouseX = var6; // L: 11198
				var8.mouseY = var7; // L: 11199
				var8.args = clickedWidget.onDrag; // L: 11200
				class1.runScriptEvent(var8); // L: 11201
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11203
				if (isDraggingWidget) { // L: 11204
					if (clickedWidget.onDragComplete != null) { // L: 11205
						var8 = new ScriptEvent(); // L: 11206
						var8.widget = clickedWidget; // L: 11207
						var8.mouseX = var6; // L: 11208
						var8.mouseY = var7; // L: 11209
						var8.dragTarget = draggedOnWidget; // L: 11210
						var8.args = clickedWidget.onDragComplete; // L: 11211
						class1.runScriptEvent(var8); // L: 11212
					}

					if (draggedOnWidget != null && UserComparator3.method2601(clickedWidget) != null) { // L: 11214
						PacketBufferNode var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2919, packetWriter.isaacCipher); // L: 11216
						var9.packetBuffer.method7746(clickedWidget.id); // L: 11217
						var9.packetBuffer.writeShort(clickedWidget.childIndex); // L: 11218
						var9.packetBuffer.method7796(clickedWidget.itemId); // L: 11219
						var9.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 11220
						var9.packetBuffer.method7791(draggedOnWidget.itemId); // L: 11221
						var9.packetBuffer.method7746(draggedOnWidget.id); // L: 11222
						packetWriter.addNode(var9); // L: 11223
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11227
					this.openMenu(widgetClickX + field596, widgetClickY + field673); // L: 11228
				} else if (menuOptionsCount > 0) { // L: 11230
					UserComparator8.method2576(field596 + widgetClickX, widgetClickY + field673); // L: 11231
				}

				clickedWidget = null; // L: 11234
			}

		} else {
			if (class136.widgetDragDuration > 1) { // L: 11172
				clickedWidget = null; // L: 11173
			}

		}
	} // L: 11175 11236

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(B)Lqy;",
		garbageValue = "4"
	)
	@Export("username")
	public Username username() {
		return class19.localPlayer != null ? class19.localPlayer.username : null; // L: 11888
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 884
			this.field544 = var1; // L: 887
			class150.method3089(10); // L: 888
		}
	} // L: 885 889

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 894
	}

	public long getAccountHash() {
		return this.field658; // L: 899
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 674
				int var4;
				for (int var1 = 0; var1 <= 27; ++var1) { // L: 675
					String var2 = this.getParameter(Integer.toString(var1)); // L: 676
					if (var2 != null) { // L: 677
						switch(var1) { // L: 678
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 744
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 763
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 764
							}
							break;
						case 4:
							if (clientType == -1) { // L: 691
								clientType = Integer.parseInt(var2); // L: 692
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 681
							break; // L: 682
						case 6:
							var4 = Integer.parseInt(var2); // L: 750
							Language var20;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 752
								var20 = Language.Language_valuesOrdered[var4]; // L: 756
							} else {
								var20 = null; // L: 753
							}

							FriendSystem.clientLanguage = var20; // L: 758
							break; // L: 759
						case 7:
							var4 = Integer.parseInt(var2); // L: 704
							GameBuild[] var5 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP, GameBuild.LIVE}; // L: 709
							GameBuild[] var6 = var5; // L: 711
							int var7 = 0;

							GameBuild var3;
							while (true) {
								if (var7 >= var6.length) {
									var3 = null; // L: 722
									break;
								}

								GameBuild var8 = var6[var7]; // L: 713
								if (var4 == var8.buildId) { // L: 715
									var3 = var8; // L: 716
									break; // L: 717
								}

								++var7; // L: 712
							}

							field509 = var3; // L: 724
							break; // L: 725
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 791
							}
							break;
						case 9:
							class429.field4593 = var2; // L: 686
							break; // L: 687
						case 10:
							Login.field917 = (StudioGame)ChatChannel.findEnumerated(ArchiveLoader.method2076(), Integer.parseInt(var2)); // L: 774
							if (StudioGame.oldscape == Login.field917) { // L: 775
								class83.loginType = LoginType.oldscape;
							} else {
								class83.loginType = LoginType.field4559; // L: 776
							}
							break;
						case 11:
							class124.field1518 = var2; // L: 734
							break; // L: 735
						case 12:
							worldId = Integer.parseInt(var2); // L: 786
							break; // L: 787
						case 14:
							class7.field27 = Integer.parseInt(var2); // L: 698
							break; // L: 699
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 729
							break; // L: 730
						case 17:
							class152.field1686 = var2; // L: 739
							break; // L: 740
						case 21:
							field484 = Integer.parseInt(var2); // L: 781
							break; // L: 782
						case 22:
							field753 = Integer.parseInt(var2) != 0; // L: 769
						}
					}
				}

				class299.method5767(); // L: 798
				GrandExchangeOfferOwnWorldComparator.worldHost = this.getCodeBase().getHost(); // L: 799
				String var9 = field509.name; // L: 800
				byte var10 = 0; // L: 801

				try {
					JagexCache.idxCount = 21; // L: 804
					SecureRandomFuture.cacheGamebuild = var10; // L: 805

					try {
						ReflectionCheck.operatingSystemName = System.getProperty("os.name"); // L: 807
					} catch (Exception var17) { // L: 809
						ReflectionCheck.operatingSystemName = "Unknown"; // L: 810
					}

					Buffer.formattedOperatingSystemName = ReflectionCheck.operatingSystemName.toLowerCase(); // L: 812

					try {
						class230.userHomeDirectory = System.getProperty("user.home"); // L: 814
						if (class230.userHomeDirectory != null) { // L: 815
							class230.userHomeDirectory = class230.userHomeDirectory + "/";
						}
					} catch (Exception var16) { // L: 817
					}

					try {
						if (Buffer.formattedOperatingSystemName.startsWith("win")) { // L: 819
							if (class230.userHomeDirectory == null) { // L: 820
								class230.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (class230.userHomeDirectory == null) { // L: 823
							class230.userHomeDirectory = System.getenv("HOME");
						}

						if (class230.userHomeDirectory != null) { // L: 825
							class230.userHomeDirectory = class230.userHomeDirectory + "/";
						}
					} catch (Exception var15) { // L: 827
					}

					if (class230.userHomeDirectory == null) { // L: 828
						class230.userHomeDirectory = "~/";
					}

					PendingSpawn.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class230.userHomeDirectory, "/tmp/", ""}; // L: 829
					WorldMapSection1.cacheSubPaths = new String[]{".jagex_cache_" + SecureRandomFuture.cacheGamebuild, ".file_store_" + SecureRandomFuture.cacheGamebuild}; // L: 830

					label148:
					for (int var11 = 0; var11 < 4; ++var11) { // L: 831
						VertexNormal.cacheDir = class29.method431("oldschool", var9, var11); // L: 832
						if (!VertexNormal.cacheDir.exists()) { // L: 833
							VertexNormal.cacheDir.mkdirs();
						}

						File[] var12 = VertexNormal.cacheDir.listFiles(); // L: 834
						if (var12 == null) { // L: 835
							break;
						}

						File[] var22 = var12; // L: 837
						int var13 = 0;

						while (true) {
							if (var13 >= var22.length) {
								break label148;
							}

							File var14 = var22[var13]; // L: 839
							if (!SecureRandomCallable.method2069(var14, false)) { // L: 841
								break;
							}

							++var13; // L: 838
						}
					}

					File var21 = VertexNormal.cacheDir; // L: 848
					class17.FileSystem_cacheDir = var21; // L: 850
					if (!class17.FileSystem_cacheDir.exists()) { // L: 851
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true; // L: 852
					ClanChannel.method3068(); // L: 854
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(Varcs.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 855
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(Varcs.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 856
					class194.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 857

					for (var4 = 0; var4 < JagexCache.idxCount; ++var4) { // L: 858
						class194.JagexCache_idxFiles[var4] = new BufferedFile(new AccessFile(Varcs.getFile("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0); // L: 859
					}
				} catch (Exception var18) { // L: 863
					class301.RunException_sendStackTrace((String)null, var18); // L: 864
				}

				UserComparator10.client = this; // L: 866
				RunException.clientType = clientType; // L: 867
				if (field486 == -1) { // L: 868
					field486 = 0; // L: 869
				}

				AbstractWorldMapData.field2796 = System.getenv("JX_ACCESS_TOKEN"); // L: 871
				System.getenv("JX_REFRESH_TOKEN"); // L: 872
				this.startThread(765, 503, 204); // L: 873
			}
		} catch (RuntimeException var19) {
			throw KitDefinition.newRunException(var19, "client.init(" + ')');
		}
	} // L: 874

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	static final boolean method1198() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 91
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)V",
		garbageValue = "1767968807"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3422 == null) { // L: 1020
			throw new RuntimeException(); // L: 1021
		} else {
			if (var0.field3406 == null) { // L: 1023
				var0.field3406 = new int[var0.field3422.length]; // L: 1024
			}

			var0.field3406[var1] = Integer.MAX_VALUE; // L: 1026
		}
	} // L: 1027

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "16"
	)
	static int method1606(int var0, Script var1, boolean var2) {
		Widget var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1341
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1342
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1343
			return 1; // L: 1344
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1346
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1347
			return 1; // L: 1348
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1350
			Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.text; // L: 1351
			return 1; // L: 1352
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1354
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1355
			return 1; // L: 1356
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1358
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1359
			return 1; // L: 1360
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1362
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1363
			return 1; // L: 1364
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1366
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1367
			return 1; // L: 1368
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1370
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1371
			return 1; // L: 1372
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1374
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1375
			return 1; // L: 1376
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1378
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1379
			return 1; // L: 1380
		} else if (var0 == 2610) { // L: 1382
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1383
			return 1; // L: 1384
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1386
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.color; // L: 1387
			return 1; // L: 1388
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1390
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.color2; // L: 1391
			return 1; // L: 1392
		} else if (var0 == 2613) { // L: 1394
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1395
			return 1; // L: 1396
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1398
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1399
			return 1; // L: 1400
		} else if (var0 != 2615 && var0 != 2616) { // L: 1402
			return 2; // L: 1406
		} else {
			++class295.Interpreter_intStackSize; // L: 1403
			return 1; // L: 1404
		}
	}
}
