import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
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

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "[Ley;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = 1817797031
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		longValue = 930669406456533829L
	)
	static long field764;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = -1819525643
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("qe")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 854071175
	)
	public static int field777;
	@ObfuscatedName("rb")
	static boolean field744;
	@ObfuscatedName("qj")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -464505279
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("ql")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qx")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 374236091
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -678558309
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	static final ApproximateRouteStrategy field781;
	@ObfuscatedName("sd")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -1833483057
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("tl")
	static boolean[] field753;
	@ObfuscatedName("vn")
	static int[] field782;
	@ObfuscatedName("vt")
	static int[] field783;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 1826736357
	)
	static int field585;
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -854420355
	)
	static int field773;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 1994544265
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("se")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sf")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = 1465004509
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("sn")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("uw")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "[Lac;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -885821757
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sb")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -368225351
	)
	static int field735;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		longValue = 6843126589043801957L
	)
	static long field685;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("qs")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("tp")
	static short field775;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -622667913
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tb")
	static short field759;
	@ObfuscatedName("te")
	static short field656;
	@ObfuscatedName("tk")
	static short field514;
	@ObfuscatedName("rw")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tt")
	static short field763;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "[Leg;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -777516881
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tm")
	static short field762;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1740108721
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -843685037
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ra")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 833757541
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 1922614903
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "[Lpt;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = 967859563
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -76972905
	)
	static int field729;
	@ObfuscatedName("rd")
	static int[] field731;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = -1624970861
	)
	static int field698;
	@ObfuscatedName("qv")
	static int[] field684;
	@ObfuscatedName("sa")
	static boolean field755;
	@ObfuscatedName("ti")
	static int[] field733;
	@ObfuscatedName("th")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("tj")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("tc")
	static int[] field754;
	@ObfuscatedName("ts")
	static int[] field757;
	@ObfuscatedName("tq")
	static int[] field500;
	@ObfuscatedName("qg")
	static String field726;
	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("qu")
	static int[] field723;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("am")
	static boolean field592;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1297363365
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 116273241
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1405594741
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bg")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bm")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1418032453
	)
	static int field699;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -841132883
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -94908921
	)
	static int field502;
	@ObfuscatedName("bf")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -155932355
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ce")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 968083277
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		longValue = -8632979679249400797L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1600597029
	)
	static int field508;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -918082281
	)
	static int field509;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 639557550265501447L
	)
	static long field651;
	@ObfuscatedName("dq")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dj")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 241519551
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 2123774043
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -120672351
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1828156911
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1918050169
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -488629447
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 970200859
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1796978717
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 915460843
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dp")
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
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1539894515
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -420899701
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1569793661
	)
	static int field526;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = -204121931
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1828856517
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -333045029
	)
	static int field530;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -1243459083
	)
	static int field531;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -2144694239
	)
	static int field532;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static class122 field533;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static class424 field534;
	@ObfuscatedName("fe")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gi")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "[Lcy;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 1262640691
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("go")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -727189653
	)
	static int field548;
	@ObfuscatedName("ge")
	static int[] field549;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -442747785
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gp")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gk")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gu")
	static boolean field554;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("gj")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = -489222059
	)
	static int field498;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -1285944621
	)
	static int field558;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -616383345
	)
	static int field559;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 1091761069
	)
	static int field560;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -1427189465
	)
	static int field621;
	@ObfuscatedName("hf")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("hx")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hd")
	static final int[] field565;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1925962995
	)
	static int field566;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 87567199
	)
	static int field720;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 440485109
	)
	static int field568;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -1217300637
	)
	static int field569;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -1668657361
	)
	static int field562;
	@ObfuscatedName("ic")
	static boolean field571;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 1215152143
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 1295752691
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -380334693
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1909356475
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 13790011
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -252023461
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -2123914003
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -757227727
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -1261284505
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 2101579937
	)
	static int field581;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 998186131
	)
	static int field497;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1725171981
	)
	static int field583;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 1261221539
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 714395705
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1156105773
	)
	static int field513;
	@ObfuscatedName("jx")
	static boolean field587;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 1535638355
	)
	static int field677;
	@ObfuscatedName("jw")
	static boolean field589;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -1930198833
	)
	static int field590;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 1967330903
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 1420113129
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("jt")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("jo")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("jy")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("jz")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("kp")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kh")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ka")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kc")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 1639362925
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -226589049
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1735370989
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 1696879705
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -760976631
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -296603501
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -429254197
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kx")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 871537309
	)
	static int field610;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -129097821
	)
	static int field611;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 321052771
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -1915361223
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 579354749
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 509889901
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("ke")
	static boolean field616;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -400807797
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 1857190161
	)
	static int field658;
	@ObfuscatedName("la")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 2008160479
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -384934989
	)
	static int field772;
	@ObfuscatedName("lr")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1699040655
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 487107011
	)
	static int field625;
	@ObfuscatedName("lc")
	static int[] field683;
	@ObfuscatedName("lp")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ln")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("li")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("lv")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 835790275
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "[[[Lls;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("lh")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mh")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mt")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -1408069719
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("mf")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1947866801
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mb")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mi")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mp")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ma")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mu")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("mm")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("my")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mz")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("mo")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("md")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mc")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1089656559
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -540706391
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 578775537
	)
	static int field506;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 159931315
	)
	static int field734;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -1913085343
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nn")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 592729301
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 54529773
	)
	static int field536;
	@ObfuscatedName("nz")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nh")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -265984395
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -1285490963
	)
	static int field666;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = 823232333
	)
	static int field667;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = 954728993
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -585848403
	)
	static int field669;
	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -455693023
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -1477842933
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -1827490843
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -1736670385
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oe")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -637833021
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 385949319
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ox")
	static boolean field682;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 387137487
	)
	static int field606;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 111424275
	)
	static int field561;
	@ObfuscatedName("oj")
	static boolean field648;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 1928898267
	)
	static int field686;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 464909207
	)
	static int field687;
	@ObfuscatedName("ok")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 381969455
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("ow")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1944785463
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("oi")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -1824937689
	)
	static int field494;
	@ObfuscatedName("pm")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -68824309
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pe")
	static int[] field696;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -656100991
	)
	static int field697;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 1308042703
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -1072732201
	)
	static int field600;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 885192419
	)
	static int field664;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1816932351
	)
	static int field701;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1841758695
	)
	static int field503;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 748340115
	)
	static int field703;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 176429417
	)
	static int field652;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 70901175
	)
	static int field705;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -1339939483
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static NodeDeque field708;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static NodeDeque field709;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 1891130109
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 1671801663
	)
	static int field712;
	@ObfuscatedName("pb")
	static boolean[] field713;
	@ObfuscatedName("qo")
	static boolean[] field714;
	@ObfuscatedName("qq")
	static boolean[] field715;
	@ObfuscatedName("qy")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("fq")
	String field535;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	class14 field700;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	class19 field537;
	@ObfuscatedName("fo")
	OtlTokenRequester field510;
	@ObfuscatedName("fd")
	Future field539;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	Buffer field542;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	class7 field528;

	static {
		field592 = true; // L: 133
		worldId = 1; // L: 134
		worldProperties = 0; // L: 135
		gameBuild = 0; // L: 137
		isMembersWorld = false; // L: 140
		isLowDetail = false; // L: 141
		field699 = -1; // L: 146
		clientType = -1; // L: 147
		field502 = -1; // L: 148
		onMobile = false; // L: 149
		gameState = 0; // L: 161
		isLoading = true; // L: 184
		cycle = 0; // L: 185
		mouseLastLastPressedTimeMillis = -1L; // L: 186
		field508 = -1; // L: 188
		field509 = -1; // L: 189
		field651 = -1L; // L: 190
		hadFocus = true; // L: 191
		displayFps = false; // L: 192
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
		titleLoadingStage = 0; // L: 207
		js5ConnectState = 0; // L: 210
		field526 = 0; // L: 211
		js5Errors = 0; // L: 233
		loginState = 0; // L: 235
		field530 = 0; // L: 236
		field531 = 0; // L: 237
		field532 = 0; // L: 238
		field533 = class122.field1495; // L: 239
		field534 = class424.field4569; // L: 240
		Login_isUsernameRemembered = false; // L: 259
		secureRandomFuture = new SecureRandomFuture(); // L: 260
		randomDatData = null; // L: 265
		npcs = new NPC[32768]; // L: 269
		npcCount = 0; // L: 270
		npcIndices = new int[32768]; // L: 271
		field548 = 0; // L: 272
		field549 = new int[250]; // L: 273
		packetWriter = new PacketWriter(); // L: 276
		logoutTimer = 0; // L: 278
		hadNetworkError = false; // L: 279
		useBufferedSocket = true; // L: 280
		field554 = false; // L: 281
		timer = new Timer(); // L: 282
		fontsMap = new HashMap(); // L: 288
		field498 = 0; // L: 295
		field558 = 1; // L: 296
		field559 = 0; // L: 297
		field560 = 1; // L: 298
		field621 = 0; // L: 299
		collisionMaps = new CollisionMap[4]; // L: 307
		isInInstance = false; // L: 308
		instanceChunkTemplates = new int[4][13][13]; // L: 309
		field565 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 310
		field566 = 0; // L: 313
		field720 = 2301979; // L: 325
		field568 = 5063219; // L: 326
		field569 = 3353893; // L: 327
		field562 = 7759444; // L: 328
		field571 = false; // L: 329
		alternativeScrollbarWidth = 0; // L: 330
		camAngleX = 128; // L: 338
		camAngleY = 0; // L: 339
		camAngleDY = 0; // L: 340
		camAngleDX = 0; // L: 341
		mouseCamClickedX = 0; // L: 342
		mouseCamClickedY = 0; // L: 343
		oculusOrbState = 0; // L: 344
		camFollowHeight = 50; // L: 345
		field581 = 0; // L: 349
		field497 = 0; // L: 350
		field583 = 0; // L: 351
		oculusOrbNormalSpeed = 12; // L: 353
		oculusOrbSlowedSpeed = 6; // L: 354
		field513 = 0; // L: 355
		field587 = false; // L: 356
		field677 = 0; // L: 357
		field589 = false; // L: 358
		field590 = 0; // L: 359
		overheadTextCount = 0; // L: 360
		overheadTextLimit = 50; // L: 361
		overheadTextXs = new int[overheadTextLimit]; // L: 362
		overheadTextYs = new int[overheadTextLimit]; // L: 363
		overheadTextAscents = new int[overheadTextLimit]; // L: 364
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 365
		overheadTextColors = new int[overheadTextLimit]; // L: 366
		overheadTextEffects = new int[overheadTextLimit]; // L: 367
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 368
		overheadText = new String[overheadTextLimit]; // L: 369
		tileLastDrawnActor = new int[104][104]; // L: 370
		viewportDrawCount = 0; // L: 371
		viewportTempX = -1; // L: 372
		viewportTempY = -1; // L: 373
		mouseCrossX = 0; // L: 374
		mouseCrossY = 0; // L: 375
		mouseCrossState = 0; // L: 376
		mouseCrossColor = 0; // L: 377
		showMouseCross = true; // L: 378
		field610 = 0; // L: 380
		field611 = 0; // L: 381
		dragItemSlotSource = 0; // L: 384
		draggedWidgetX = 0; // L: 385
		draggedWidgetY = 0; // L: 386
		dragItemSlotDestination = 0; // L: 387
		field616 = false; // L: 388
		itemDragDuration = 0; // L: 389
		field658 = 0; // L: 390
		showLoadingMessages = true; // L: 392
		players = new Player[2048]; // L: 394
		localPlayerIndex = -1; // L: 396
		field772 = 0; // L: 397
		renderSelf = true; // L: 399
		drawPlayerNames = 0; // L: 404
		field625 = 0; // L: 405
		field683 = new int[1000]; // L: 406
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 408
		playerMenuActions = new String[8]; // L: 409
		playerOptionsPriorities = new boolean[8]; // L: 410
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 411
		combatTargetPlayerIndex = -1; // L: 412
		groundItems = new NodeDeque[4][104][104]; // L: 413
		pendingSpawns = new NodeDeque(); // L: 414
		projectiles = new NodeDeque(); // L: 415
		graphicsObjects = new NodeDeque(); // L: 416
		currentLevels = new int[25]; // L: 417
		levels = new int[25]; // L: 418
		experience = new int[25]; // L: 419
		leftClickOpensMenu = 0; // L: 420
		isMenuOpen = false; // L: 421
		menuOptionsCount = 0; // L: 427
		menuArguments1 = new int[500]; // L: 428
		menuArguments2 = new int[500]; // L: 429
		menuOpcodes = new int[500]; // L: 430
		menuIdentifiers = new int[500]; // L: 431
		menuActions = new String[500]; // L: 432
		menuTargets = new String[500]; // L: 433
		menuShiftClick = new boolean[500]; // L: 434
		followerOpsLowPriority = false; // L: 435
		shiftClickDrop = false; // L: 437
		tapToDrop = false; // L: 438
		showMouseOverText = true; // L: 439
		viewportX = -1; // L: 440
		viewportY = -1; // L: 441
		field506 = 0; // L: 445
		field734 = 50; // L: 446
		isItemSelected = 0; // L: 447
		selectedItemName = null; // L: 451
		isSpellSelected = false; // L: 452
		selectedSpellChildIndex = -1; // L: 454
		field536 = -1; // L: 455
		selectedSpellActionName = null; // L: 457
		selectedSpellName = null; // L: 458
		rootInterface = -1; // L: 459
		interfaceParents = new NodeHashTable(8); // L: 460
		field666 = 0; // L: 465
		field667 = -1; // L: 466
		chatEffects = 0; // L: 467
		field669 = 0; // L: 468
		meslayerContinueWidget = null; // L: 469
		runEnergy = 0; // L: 470
		weight = 0; // L: 471
		staffModLevel = 0; // L: 472
		followerIndex = -1; // L: 473
		playerMod = false; // L: 474
		viewportWidget = null; // L: 475
		clickedWidget = null; // L: 476
		clickedWidgetParent = null; // L: 477
		widgetClickX = 0; // L: 478
		widgetClickY = 0; // L: 479
		draggedOnWidget = null; // L: 480
		field682 = false; // L: 481
		field606 = -1; // L: 482
		field561 = -1; // L: 483
		field648 = false; // L: 484
		field686 = -1; // L: 485
		field687 = -1; // L: 486
		isDraggingWidget = false; // L: 487
		cycleCntr = 1; // L: 492
		changedVarps = new int[32]; // L: 495
		changedVarpCount = 0; // L: 496
		changedItemContainers = new int[32]; // L: 497
		field494 = 0; // L: 498
		changedSkills = new int[32]; // L: 499
		changedSkillsCount = 0; // L: 500
		field696 = new int[32]; // L: 501
		field697 = 0; // L: 502
		chatCycle = 0; // L: 503
		field600 = 0; // L: 504
		field664 = 0; // L: 505
		field701 = 0; // L: 506
		field503 = 0; // L: 507
		field703 = 0; // L: 508
		field652 = 0; // L: 509
		field705 = 0; // L: 510
		mouseWheelRotation = 0; // L: 516
		scriptEvents = new NodeDeque(); // L: 517
		field708 = new NodeDeque(); // L: 518
		field709 = new NodeDeque(); // L: 519
		widgetFlags = new NodeHashTable(512); // L: 520
		rootWidgetCount = 0; // L: 522
		field712 = -2; // L: 523
		field713 = new boolean[100]; // L: 524
		field714 = new boolean[100]; // L: 525
		field715 = new boolean[100]; // L: 526
		rootWidgetXs = new int[100]; // L: 527
		rootWidgetYs = new int[100]; // L: 528
		rootWidgetWidths = new int[100]; // L: 529
		rootWidgetHeights = new int[100]; // L: 530
		gameDrawingMode = 0; // L: 531
		field764 = 0L; // L: 532
		isResizable = true; // L: 533
		field723 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 540
		publicChatMode = 0; // L: 541
		tradeChatMode = 0; // L: 543
		field726 = ""; // L: 544
		crossWorldMessageIds = new long[100]; // L: 546
		crossWorldMessageIdsIndex = 0; // L: 547
		field729 = 0; // L: 549
		field684 = new int[128]; // L: 550
		field731 = new int[128]; // L: 551
		field685 = -1L; // L: 552
		currentClanSettings = new ClanSettings[2]; // L: 556
		currentClanChannels = new ClanChannel[2]; // L: 558
		field735 = -1; // L: 560
		mapIconCount = 0; // L: 561
		mapIconXs = new int[1000]; // L: 562
		mapIconYs = new int[1000]; // L: 563
		mapIcons = new SpritePixels[1000]; // L: 564
		destinationX = 0; // L: 565
		destinationY = 0; // L: 566
		minimapState = 0; // L: 573
		currentTrackGroupId = -1; // L: 574
		field744 = false; // L: 575
		soundEffectCount = 0; // L: 581
		soundEffectIds = new int[50]; // L: 582
		queuedSoundEffectLoops = new int[50]; // L: 583
		queuedSoundEffectDelays = new int[50]; // L: 584
		soundLocations = new int[50]; // L: 585
		soundEffects = new SoundEffect[50]; // L: 586
		isCameraLocked = false; // L: 588
		field755 = false; // L: 599
		field753 = new boolean[5]; // L: 607
		field754 = new int[5]; // L: 608
		field733 = new int[5]; // L: 609
		field500 = new int[5]; // L: 610
		field757 = new int[5]; // L: 611
		field775 = 256; // L: 612
		field759 = 205; // L: 613
		zoomHeight = 256; // L: 614
		zoomWidth = 320; // L: 615
		field762 = 1; // L: 616
		field763 = 32767; // L: 617
		field656 = 1; // L: 618
		field514 = 32767; // L: 619
		viewportOffsetX = 0; // L: 620
		viewportOffsetY = 0; // L: 621
		viewportWidth = 0; // L: 622
		viewportHeight = 0; // L: 623
		viewportZoom = 0; // L: 624
		playerAppearance = new PlayerComposition(); // L: 626
		field585 = -1; // L: 627
		field773 = -1; // L: 628
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 630
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 632
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 635
		field777 = -1; // L: 642
		archiveLoaders = new ArrayList(10); // L: 643
		archiveLoadersDone = 0; // L: 644
		field698 = 0; // L: 645
		field781 = new ApproximateRouteStrategy(); // L: 654
		field782 = new int[50]; // L: 655
		field783 = new int[50]; // L: 656
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1486103800"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field764 = DirectByteArrayCopier.method5318() + 500L; // L: 4161
		this.resizeJS(); // L: 4162
		if (rootInterface != -1) { // L: 4163
			this.resizeRoot(true);
		}

	} // L: 4164

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1919454515"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 856
		int[] var2 = new int[]{1000, 100, 500}; // L: 857
		if (var1 != null && var2 != null) { // L: 859
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1; // L: 866
			ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 867
			class113.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 868

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 869
				class113.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 870
				ByteArrayPool.field4083.add(var1[var3]); // L: 871
			}

			Collections.sort(ByteArrayPool.field4083); // L: 873
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null; // L: 860
			ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts = null; // L: 861
			class113.ByteArrayPool_arrays = null; // L: 862
			NetCache.method5677(); // L: 863
		}

		class346.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 875
		class297.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 876
		class274.currentPort = class346.worldPort; // L: 877
		PlayerComposition.field3236 = class284.field3250; // L: 878
		class1.field8 = class284.field3249; // L: 879
		class21.field120 = class284.field3248; // L: 880
		class7.field40 = class284.field3246; // L: 881
		class6.urlRequester = new UrlRequester(); // L: 882
		this.setUpKeyboard(); // L: 883
		this.method438(); // L: 884
		Widget.mouseWheel = this.mouseWheel(); // L: 885
		class16.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 886
		class424.clientPreferences = Interpreter.method1877(); // L: 887
		this.setUpClipboard(); // L: 888
		ChatChannel.method2003(this, ModelData0.field2547); // L: 889
		if (gameBuild != 0) { // L: 890
			displayFps = true;
		}

		WorldMapLabelSize.setWindowedMode(class424.clientPreferences.windowMode); // L: 891
		ClanSettings.friendSystem = new FriendSystem(VarcInt.loginType); // L: 892
		this.field700 = new class14("tokenRequest", 1, 1); // L: 893
	} // L: 894

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "512730998"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 898
		this.doCycleJs5(); // L: 899
		WorldMapAreaData.method4853(); // L: 900
		NetSocket.method3105(); // L: 901
		class122.playPcmPlayers(); // L: 902
		synchronized(KeyHandler.KeyHandler_instance) { // L: 904
			++KeyHandler.KeyHandler_idleCycles; // L: 905
			KeyHandler.field140 = KeyHandler.field144; // L: 906
			KeyHandler.field139 = 0; // L: 907
			KeyHandler.field141 = 0; // L: 908
			Arrays.fill(KeyHandler.field131, false); // L: 909
			Arrays.fill(KeyHandler.field138, false); // L: 910
			if (KeyHandler.field148 < 0) { // L: 911
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 912
				KeyHandler.field148 = KeyHandler.field145; // L: 913
			} else {
				while (KeyHandler.field145 != KeyHandler.field148) { // L: 916
					int var2 = KeyHandler.field133[KeyHandler.field145]; // L: 917
					KeyHandler.field145 = KeyHandler.field145 + 1 & 127; // L: 918
					if (var2 < 0) { // L: 919
						var2 = ~var2; // L: 920
						if (KeyHandler.KeyHandler_pressedKeys[var2]) { // L: 921
							KeyHandler.KeyHandler_pressedKeys[var2] = false; // L: 922
							KeyHandler.field138[var2] = true; // L: 923
							KeyHandler.field125[KeyHandler.field141] = var2; // L: 924
							++KeyHandler.field141; // L: 925
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field139 < KeyHandler.field135.length - 1) { // L: 929
							KeyHandler.field131[var2] = true; // L: 930
							KeyHandler.field135[++KeyHandler.field139 - 1] = var2; // L: 931
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true; // L: 933
					}
				}
			}

			if (KeyHandler.field139 > 0) { // L: 937
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field144 = KeyHandler.field146; // L: 938
		}

		ScriptFrame.method1075(); // L: 941
		if (Widget.mouseWheel != null) { // L: 942
			int var4 = Widget.mouseWheel.useRotation(); // L: 943
			mouseWheelRotation = var4; // L: 944
		}

		if (gameState == 0) { // L: 946
			Decimator.load(); // L: 947
			GrandExchangeOfferOwnWorldComparator.method1121(); // L: 948
		} else if (gameState == 5) { // L: 950
			UserComparator7.method2465(this, Players.fontPlain12); // L: 951
			Decimator.load(); // L: 952
			GrandExchangeOfferOwnWorldComparator.method1121(); // L: 953
		} else if (gameState != 10 && gameState != 11) { // L: 955
			if (gameState == 20) { // L: 956
				UserComparator7.method2465(this, Players.fontPlain12); // L: 957
				this.doCycleLoggedOut(); // L: 958
			} else if (gameState == 50) { // L: 960
				UserComparator7.method2465(this, Players.fontPlain12); // L: 961
				this.doCycleLoggedOut(); // L: 962
			} else if (gameState == 25) { // L: 964
				MouseHandler.method615();
			}
		} else {
			UserComparator7.method2465(this, Players.fontPlain12);
		}

		if (gameState == 30) { // L: 965
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 966
			this.doCycleLoggedOut();
		}

	} // L: 967

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1874168283"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label170: {
			try {
				if (class265.musicPlayerStatus == 2) { // L: 974
					if (class265.musicTrack == null) { // L: 975
						class265.musicTrack = MusicTrack.readTrack(class265.musicTrackArchive, class265.musicTrackGroupId, class140.musicTrackFileId); // L: 976
						if (class265.musicTrack == null) { // L: 977
							var2 = false; // L: 978
							break label170;
						}
					}

					if (FileSystem.soundCache == null) { // L: 982
						FileSystem.soundCache = new SoundCache(UserComparator8.soundEffectsArchive, class265.musicSamplesArchive);
					}

					if (class265.midiPcmStream.loadMusicTrack(class265.musicTrack, class265.musicPatchesArchive, FileSystem.soundCache, 22050)) { // L: 983
						class265.midiPcmStream.clearAll(); // L: 984
						class265.midiPcmStream.setPcmStreamVolume(class167.musicTrackVolume); // L: 985
						class265.midiPcmStream.setMusicTrack(class265.musicTrack, MusicPatch.musicTrackBoolean); // L: 986
						class265.musicPlayerStatus = 0; // L: 987
						class265.musicTrack = null; // L: 988
						FileSystem.soundCache = null; // L: 989
						class265.musicTrackArchive = null; // L: 990
						var2 = true; // L: 991
						break label170;
					}
				}
			} catch (Exception var6) { // L: 996
				var6.printStackTrace(); // L: 997
				class265.midiPcmStream.clear(); // L: 998
				class265.musicPlayerStatus = 0; // L: 999
				class265.musicTrack = null; // L: 1000
				FileSystem.soundCache = null; // L: 1001
				class265.musicTrackArchive = null; // L: 1002
			}

			var2 = false; // L: 1004
		}

		if (var2 && field744 && PacketBufferNode.pcmPlayer0 != null) { // L: 1007 1008
			PacketBufferNode.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field764 && DirectByteArrayCopier.method5318() > field764) { // L: 1010 1011
			WorldMapLabelSize.setWindowedMode(class339.getWindowedMode()); // L: 1012
		}

		int var4;
		if (var1) { // L: 1015
			for (var4 = 0; var4 < 100; ++var4) { // L: 1016
				field713[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1018
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1019
			ObjectSound.drawTitle(class408.fontBold12, class1.fontPlain11, Players.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1020
			if (gameState == 20) { // L: 1021
				ObjectSound.drawTitle(class408.fontBold12, class1.fontPlain11, Players.fontPlain12);
			} else if (gameState == 50) { // L: 1022
				ObjectSound.drawTitle(class408.fontBold12, class1.fontPlain11, Players.fontPlain12);
			} else if (gameState == 25) { // L: 1023
				if (field621 == 1) { // L: 1024
					if (field498 > field558) { // L: 1025
						field558 = field498;
					}

					var4 = (field558 * 50 - field498 * 50) / field558; // L: 1026
					Calendar.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1027
				} else if (field621 == 2) { // L: 1029
					if (field559 > field560) { // L: 1030
						field560 = field559;
					}

					var4 = (field560 * 50 - field559 * 50) / field560 + 50; // L: 1031
					Calendar.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1032
				} else {
					Calendar.drawLoadingMessage("Loading - please wait.", false); // L: 1034
				}
			} else if (gameState == 30) { // L: 1036
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1037
				Calendar.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1038
				Calendar.drawLoadingMessage("Please wait...", false);
			}
		} else {
			ObjectSound.drawTitle(class408.fontBold12, class1.fontPlain11, Players.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1039
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1040
				if (field714[var4]) { // L: 1041
					PcmPlayer.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1042
					field714[var4] = false; // L: 1043
				}
			}
		} else if (gameState > 0) { // L: 1047
			PcmPlayer.rasterProvider.drawFull(0, 0); // L: 1048

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1049
				field714[var4] = false;
			}
		}

	} // L: 1051

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-104"
	)
	@Export("kill0")
	protected final void kill0() {
		if (JagexCache.varcs.hasUnwrittenChanges()) { // L: 1054
			JagexCache.varcs.write();
		}

		if (PacketWriter.mouseRecorder != null) { // L: 1055
			PacketWriter.mouseRecorder.isRunning = false;
		}

		PacketWriter.mouseRecorder = null; // L: 1056
		packetWriter.close(); // L: 1057
		if (KeyHandler.KeyHandler_instance != null) { // L: 1059
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1060
				KeyHandler.KeyHandler_instance = null; // L: 1061
			} // L: 1062
		}

		if (MouseHandler.MouseHandler_instance != null) { // L: 1066
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1067
				MouseHandler.MouseHandler_instance = null; // L: 1068
			} // L: 1069
		}

		Widget.mouseWheel = null; // L: 1072
		if (PacketBufferNode.pcmPlayer0 != null) { // L: 1073
			PacketBufferNode.pcmPlayer0.shutdown();
		}

		if (MouseHandler.pcmPlayer1 != null) { // L: 1074
			MouseHandler.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1076
			NetCache.NetCache_socket.close();
		}

		class259.method4999(); // L: 1078
		if (class6.urlRequester != null) { // L: 1079
			class6.urlRequester.close(); // L: 1080
			class6.urlRequester = null; // L: 1081
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1085

			for (int var4 = 0; var4 < JagexCache.idxCount; ++var4) { // L: 1086
				VerticalAlignment.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1087
			JagexCache.JagexCache_randomDat.close(); // L: 1088
		} catch (Exception var7) { // L: 1090
		}

		this.field700.method169(); // L: 1092
	} // L: 1093

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1773309183"
	)
	protected final void vmethod1124() {
	} // L: 663

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-86390836"
	)
	boolean method1305() {
		return LoginScreenAnimation.field1200 != null && !LoginScreenAnimation.field1200.trim().isEmpty(); // L: 835
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-647319922"
	)
	boolean method1219() {
		return this.field510 != null; // L: 839
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1874688058"
	)
	void method1226(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(FileSystem.field1707 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 843
		OtlTokenRequester var3 = this.field510; // L: 844
		if (var3 != null) { // L: 845
			this.field539 = var3.request(var2); // L: 846
		} else {
			class10 var4 = new class10(var2, class9.field49); // L: 849
			var4.method85("Authorization", "Bearer " + var1); // L: 850
			this.field537 = this.field700.method174(var4); // L: 851
		}
	} // L: 847 852

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1924196492"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1138
			long var2 = DirectByteArrayCopier.method5318(); // L: 1141
			int var4 = (int)(var2 - NetCache.field3911); // L: 1142
			NetCache.field3911 = var2; // L: 1143
			if (var4 > 200) { // L: 1144
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1145
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1146
				var1 = true; // L: 1147
			} else if (NetCache.NetCache_socket == null) { // L: 1150
				var1 = false; // L: 1151
			} else {
				try {
					label241: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1155
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1156
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1157
							var6 = new Buffer(4); // L: 1158
							var6.writeByte(1); // L: 1159
							var6.writeMedium((int)var5.key); // L: 1160
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1161
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1162
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1163
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1164
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1166
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1167
							var6 = new Buffer(4); // L: 1168
							var6.writeByte(0); // L: 1169
							var6.writeMedium((int)var5.key); // L: 1170
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1171
							var5.removeDual(); // L: 1172
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1173
							--NetCache.NetCache_pendingWritesCount; // L: 1174
							++NetCache.NetCache_pendingResponsesCount; // L: 1175
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1177
							int var18 = NetCache.NetCache_socket.available(); // L: 1178
							if (var18 < 0) { // L: 1179
								throw new IOException();
							}

							if (var18 == 0) { // L: 1180
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1181
							byte var7 = 0; // L: 1182
							if (class19.NetCache_currentResponse == null) { // L: 1183
								var7 = 8;
							} else if (NetCache.field3926 == 0) { // L: 1184
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1185
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1186
								if (var8 > var18) { // L: 1187
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1188
								if (NetCache.field3929 != 0) { // L: 1189
									for (var9 = 0; var9 < var8; ++var9) { // L: 1190
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3929;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1192
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1193
									break;
								}

								if (class19.NetCache_currentResponse == null) { // L: 1194
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1195
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1196
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1197
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1198
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1199
									long var13 = (long)(var10 + (var9 << 16)); // L: 1200
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1201
									NetCache.field3922 = true; // L: 1202
									if (var15 == null) { // L: 1203
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1204
										NetCache.field3922 = false; // L: 1205
									}

									if (var15 == null) { // L: 1207
										throw new IOException(); // L: 1208
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1210
									class19.NetCache_currentResponse = var15; // L: 1211
									NetCache.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + class19.NetCache_currentResponse.padding); // L: 1212
									NetCache.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1213
									NetCache.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1214
									NetCache.field3926 = 8; // L: 1215
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1216
								} else if (NetCache.field3926 == 0) { // L: 1219
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1220
										NetCache.field3926 = 1; // L: 1221
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1222
									} else {
										class19.NetCache_currentResponse = null; // L: 1226
									}
								}
							} else {
								var8 = NetCache.NetCache_responseArchiveBuffer.array.length - class19.NetCache_currentResponse.padding; // L: 1232
								var9 = 512 - NetCache.field3926; // L: 1233
								if (var9 > var8 - NetCache.NetCache_responseArchiveBuffer.offset) { // L: 1234
									var9 = var8 - NetCache.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1235
									var9 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var9); // L: 1236
								if (NetCache.field3929 != 0) { // L: 1237
									for (var10 = 0; var10 < var9; ++var10) { // L: 1238
										var10000 = NetCache.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + NetCache.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field3929;
									}
								}

								var25 = NetCache.NetCache_responseArchiveBuffer; // L: 1240
								var25.offset += var9;
								NetCache.field3926 += var9; // L: 1241
								if (var8 == NetCache.NetCache_responseArchiveBuffer.offset) { // L: 1242
									if (class19.NetCache_currentResponse.key == 16711935L) { // L: 1243
										class346.NetCache_reference = NetCache.NetCache_responseArchiveBuffer; // L: 1244

										for (var10 = 0; var10 < 256; ++var10) { // L: 1245
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1246
											if (var19 != null) { // L: 1247
												class346.NetCache_reference.offset = var10 * 8 + 5; // L: 1248
												var12 = class346.NetCache_reference.readInt(); // L: 1249
												int var20 = class346.NetCache_reference.readInt(); // L: 1250
												var19.loadIndex(var12, var20); // L: 1251
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1256
										NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1257
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1258
										if (var10 != class19.NetCache_currentResponse.crc) { // L: 1259
											try {
												NetCache.NetCache_socket.close(); // L: 1261
											} catch (Exception var23) { // L: 1263
											}

											++NetCache.NetCache_crcMismatches; // L: 1264
											NetCache.NetCache_socket = null; // L: 1265
											NetCache.field3929 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1266
											var1 = false; // L: 1267
											break label241;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1270
										NetCache.NetCache_ioExceptions = 0; // L: 1271
										class19.NetCache_currentResponse.archive.write((int)(class19.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, 16711680L == (class19.NetCache_currentResponse.key & 16711680L), NetCache.field3922); // L: 1272
									}

									class19.NetCache_currentResponse.remove(); // L: 1274
									if (NetCache.field3922) { // L: 1275
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1276
									}

									NetCache.field3926 = 0; // L: 1277
									class19.NetCache_currentResponse = null; // L: 1278
									NetCache.NetCache_responseArchiveBuffer = null; // L: 1279
								} else {
									if (NetCache.field3926 != 512) { // L: 1281
										break;
									}

									NetCache.field3926 = 0;
								}
							}
						}

						var1 = true; // L: 1285
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1289
					} catch (Exception var22) { // L: 1291
					}

					++NetCache.NetCache_ioExceptions; // L: 1292
					NetCache.NetCache_socket = null; // L: 1293
					var1 = false; // L: 1294
				}
			}

			if (!var1) { // L: 1298
				this.doCycleJs5Connect();
			}

		}
	} // L: 1299

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "372818485"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1302
			this.error("js5crc"); // L: 1303
			class111.updateGameState(1000); // L: 1304
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1307
				if (gameState <= 5) { // L: 1308
					this.error("js5io"); // L: 1309
					class111.updateGameState(1000); // L: 1310
					return; // L: 1311
				}

				field526 = 3000; // L: 1314
				NetCache.NetCache_ioExceptions = 3; // L: 1315
			}

			if (--field526 + 1 <= 0) { // L: 1318
				try {
					if (js5ConnectState == 0) { // L: 1320
						FontName.js5SocketTask = GameEngine.taskHandler.newSocketTask(HealthBar.worldHost, class274.currentPort); // L: 1321
						++js5ConnectState; // L: 1322
					}

					if (js5ConnectState == 1) { // L: 1324
						if (FontName.js5SocketTask.status == 2) { // L: 1325
							this.js5Error(-1); // L: 1326
							return; // L: 1327
						}

						if (FontName.js5SocketTask.status == 1) { // L: 1329
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1331
						if (useBufferedSocket) { // L: 1332
							Socket var2 = (Socket)FontName.js5SocketTask.result; // L: 1334
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1336
							WorldMapCacheName.js5Socket = var1; // L: 1338
						} else {
							WorldMapCacheName.js5Socket = new NetSocket((Socket)FontName.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1341
						}

						Buffer var11 = new Buffer(5); // L: 1343
						var11.writeByte(15); // L: 1344
						var11.writeInt(203); // L: 1345
						WorldMapCacheName.js5Socket.write(var11.array, 0, 5); // L: 1346
						++js5ConnectState; // L: 1347
						UserComparator8.field1347 = DirectByteArrayCopier.method5318(); // L: 1348
					}

					if (js5ConnectState == 3) { // L: 1350
						if (WorldMapCacheName.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1351
							int var5 = WorldMapCacheName.js5Socket.readUnsignedByte(); // L: 1352
							if (var5 != 0) { // L: 1353
								this.js5Error(var5); // L: 1354
								return; // L: 1355
							}

							++js5ConnectState; // L: 1357
						} else if (DirectByteArrayCopier.method5318() - UserComparator8.field1347 > 30000L) { // L: 1360
							this.js5Error(-2); // L: 1361
							return; // L: 1362
						}
					}

					if (js5ConnectState == 4) { // L: 1366
						AbstractSocket var12 = WorldMapCacheName.js5Socket; // L: 1367
						boolean var6 = gameState > 20; // L: 1368
						if (NetCache.NetCache_socket != null) { // L: 1370
							try {
								NetCache.NetCache_socket.close(); // L: 1372
							} catch (Exception var9) { // L: 1374
							}

							NetCache.NetCache_socket = null; // L: 1375
						}

						NetCache.NetCache_socket = var12; // L: 1377
						UserComparator4.method2434(var6); // L: 1378
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1379
						class19.NetCache_currentResponse = null; // L: 1380
						NetCache.NetCache_responseArchiveBuffer = null; // L: 1381
						NetCache.field3926 = 0; // L: 1382

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1384
							if (var3 == null) { // L: 1385
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1391
									if (var3 == null) { // L: 1392
										if (NetCache.field3929 != 0) { // L: 1398
											try {
												Buffer var13 = new Buffer(4); // L: 1400
												var13.writeByte(4); // L: 1401
												var13.writeByte(NetCache.field3929); // L: 1402
												var13.writeShort(0); // L: 1403
												NetCache.NetCache_socket.write(var13.array, 0, 4); // L: 1404
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1408
												} catch (Exception var7) { // L: 1410
												}

												++NetCache.NetCache_ioExceptions; // L: 1411
												NetCache.NetCache_socket = null; // L: 1412
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1415
										NetCache.field3911 = DirectByteArrayCopier.method5318(); // L: 1416
										FontName.js5SocketTask = null; // L: 1418
										WorldMapCacheName.js5Socket = null; // L: 1419
										js5ConnectState = 0; // L: 1420
										js5Errors = 0; // L: 1421
										return; // L: 1427
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1393
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1394
									++NetCache.NetCache_pendingWritesCount; // L: 1395
									--NetCache.NetCache_pendingResponsesCount; // L: 1396
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1386
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1387
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1388
						}
					}
				} catch (IOException var10) { // L: 1424
					this.js5Error(-3); // L: 1425
				}

			}
		}
	} // L: 1305

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1065244976"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		FontName.js5SocketTask = null; // L: 1430
		WorldMapCacheName.js5Socket = null; // L: 1431
		js5ConnectState = 0; // L: 1432
		if (class346.worldPort == class274.currentPort) { // L: 1433
			class274.currentPort = class297.js5Port;
		} else {
			class274.currentPort = class346.worldPort; // L: 1434
		}

		++js5Errors; // L: 1435
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1436
			if (gameState <= 5) { // L: 1437
				this.error("js5connect_full"); // L: 1438
				class111.updateGameState(1000); // L: 1439
			} else {
				field526 = 3000; // L: 1441
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1443
			this.error("js5connect_outofdate"); // L: 1444
			class111.updateGameState(1000); // L: 1445
		} else if (js5Errors >= 4) { // L: 1447
			if (gameState <= 5) { // L: 1448
				this.error("js5connect"); // L: 1449
				class111.updateGameState(1000); // L: 1450
			} else {
				field526 = 3000; // L: 1452
			}
		}

	} // L: 1454

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-476296379"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1937
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1938

		try {
			if (loginState == 0) { // L: 1940
				if (class142.secureRandom == null && (secureRandomFuture.isDone() || field530 > 250)) { // L: 1941
					class142.secureRandom = secureRandomFuture.get(); // L: 1942
					secureRandomFuture.shutdown(); // L: 1943
					secureRandomFuture = null; // L: 1944
				}

				if (class142.secureRandom != null) { // L: 1946
					if (var1 != null) { // L: 1947
						((AbstractSocket)var1).close(); // L: 1948
						var1 = null; // L: 1949
					}

					NetFileRequest.socketTask = null; // L: 1951
					hadNetworkError = false; // L: 1952
					field530 = 0; // L: 1953
					if (field534.method7628()) { // L: 1954
						try {
							this.method1226(LoginScreenAnimation.field1200); // L: 1956
							WorldMapLabelSize.method4321(20); // L: 1957
						} catch (Throwable var25) { // L: 1959
							FloorDecoration.RunException_sendStackTrace((String)null, var25); // L: 1960
							class221.getLoginError(65); // L: 1961
							return; // L: 1962
						}
					} else {
						WorldMapLabelSize.method4321(1); // L: 1966
					}
				}
			}

			if (loginState == 20) { // L: 1970
				if (this.field539 != null) { // L: 1971
					if (!this.field539.isDone()) { // L: 1972
						return; // L: 1973
					}

					if (this.field539.isCancelled()) { // L: 1975
						class221.getLoginError(65); // L: 1976
						this.field539 = null; // L: 1977
						return; // L: 1978
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.field539.get(); // L: 1981
						if (!var3.isSuccess()) { // L: 1982
							class221.getLoginError(65); // L: 1983
							this.field539 = null; // L: 1984
							return; // L: 1985
						}

						this.field535 = var3.getToken(); // L: 1987
						this.field539 = null; // L: 1988
					} catch (Exception var24) { // L: 1990
						FloorDecoration.RunException_sendStackTrace((String)null, var24); // L: 1991
						class221.getLoginError(65); // L: 1992
						this.field539 = null; // L: 1993
						return; // L: 1994
					}
				} else {
					if (this.field537 == null) { // L: 1997
						class221.getLoginError(65); // L: 2018
						return; // L: 2019
					}

					if (!this.field537.method283()) { // L: 1998
						return; // L: 1999
					}

					if (this.field537.method273()) { // L: 2001
						FloorDecoration.RunException_sendStackTrace(this.field537.method272(), (Throwable)null); // L: 2002
						class221.getLoginError(65); // L: 2003
						this.field537 = null; // L: 2004
						return; // L: 2005
					}

					class21 var27 = this.field537.method274(); // L: 2007
					if (var27.method294() != 200) { // L: 2008
						FloorDecoration.RunException_sendStackTrace("Response code: " + var27.method294() + "Response body: " + var27.method295(), (Throwable)null); // L: 2009
						class221.getLoginError(65); // L: 2010
						this.field537 = null; // L: 2011
						return; // L: 2012
					}

					this.field535 = var27.method295(); // L: 2014
					this.field537 = null; // L: 2015
				}

				field530 = 0; // L: 2021
				WorldMapLabelSize.method4321(1); // L: 2022
			}

			if (loginState == 1) { // L: 2024
				if (NetFileRequest.socketTask == null) { // L: 2025
					NetFileRequest.socketTask = GameEngine.taskHandler.newSocketTask(HealthBar.worldHost, class274.currentPort); // L: 2026
				}

				if (NetFileRequest.socketTask.status == 2) { // L: 2028
					throw new IOException();
				}

				if (NetFileRequest.socketTask.status == 1) { // L: 2029
					if (useBufferedSocket) { // L: 2030
						Socket var4 = (Socket)NetFileRequest.socketTask.result; // L: 2032
						BufferedNetSocket var28 = new BufferedNetSocket(var4, 40000, 5000); // L: 2034
						var1 = var28; // L: 2036
					} else {
						var1 = new NetSocket((Socket)NetFileRequest.socketTask.result, GameEngine.taskHandler, 5000); // L: 2039
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2041
					NetFileRequest.socketTask = null; // L: 2042
					WorldMapLabelSize.method4321(2); // L: 2043
				}
			}

			PacketBufferNode var30;
			if (loginState == 2) { // L: 2046
				packetWriter.clearBuffer(); // L: 2047
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2052
					var30 = new PacketBufferNode(); // L: 2053
				} else {
					var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2056
				}

				var30.clientPacket = null; // L: 2059
				var30.clientPacketLength = 0; // L: 2060
				var30.packetBuffer = new PacketBuffer(5000); // L: 2061
				var30.packetBuffer.writeByte(LoginPacket.field3064.id); // L: 2065
				packetWriter.addNode(var30); // L: 2066
				packetWriter.flush(); // L: 2067
				var2.offset = 0; // L: 2068
				WorldMapLabelSize.method4321(3); // L: 2069
			}

			boolean var13;
			int var14;
			if (loginState == 3) { // L: 2071
				if (PacketBufferNode.pcmPlayer0 != null) { // L: 2072
					PacketBufferNode.pcmPlayer0.method710();
				}

				if (MouseHandler.pcmPlayer1 != null) { // L: 2073
					MouseHandler.pcmPlayer1.method710();
				}

				var13 = true; // L: 2074
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2075 2076
					var13 = false;
				}

				if (var13) { // L: 2078
					var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2079
					if (PacketBufferNode.pcmPlayer0 != null) { // L: 2080
						PacketBufferNode.pcmPlayer0.method710();
					}

					if (MouseHandler.pcmPlayer1 != null) { // L: 2081
						MouseHandler.pcmPlayer1.method710();
					}

					if (var14 != 0) { // L: 2082
						class221.getLoginError(var14); // L: 2083
						return; // L: 2084
					}

					var2.offset = 0; // L: 2086
					WorldMapLabelSize.method4321(4); // L: 2087
				}
			}

			int var42;
			if (loginState == 4) { // L: 2090
				if (var2.offset < 8) { // L: 2091
					var42 = ((AbstractSocket)var1).available(); // L: 2092
					if (var42 > 8 - var2.offset) { // L: 2093
						var42 = 8 - var2.offset;
					}

					if (var42 > 0) { // L: 2094
						((AbstractSocket)var1).read(var2.array, var2.offset, var42); // L: 2095
						var2.offset += var42; // L: 2096
					}
				}

				if (var2.offset == 8) { // L: 2099
					var2.offset = 0; // L: 2100
					Canvas.field159 = var2.readLong(); // L: 2101
					WorldMapLabelSize.method4321(5); // L: 2102
				}
			}

			int var7;
			int var9;
			int var16;
			if (loginState == 5) { // L: 2105
				packetWriter.packetBuffer.offset = 0; // L: 2106
				packetWriter.clearBuffer(); // L: 2107
				PacketBuffer var29 = new PacketBuffer(500); // L: 2108
				int[] var33 = new int[]{class142.secureRandom.nextInt(), class142.secureRandom.nextInt(), class142.secureRandom.nextInt(), class142.secureRandom.nextInt()}; // L: 2109 2110 2111 2112 2113
				var29.offset = 0; // L: 2114
				var29.writeByte(1); // L: 2115
				var29.writeInt(var33[0]); // L: 2116
				var29.writeInt(var33[1]); // L: 2117
				var29.writeInt(var33[2]); // L: 2118
				var29.writeInt(var33[3]); // L: 2119
				var29.writeLong(Canvas.field159); // L: 2120
				if (gameState == 40) { // L: 2121
					var29.writeInt(class213.field2597[0]); // L: 2122
					var29.writeInt(class213.field2597[1]); // L: 2123
					var29.writeInt(class213.field2597[2]); // L: 2124
					var29.writeInt(class213.field2597[3]); // L: 2125
				} else {
					if (gameState == 50) { // L: 2128
						var29.writeByte(class122.field1497.rsOrdinal()); // L: 2129
						var29.writeInt(Occluder.field2399); // L: 2130
					} else {
						var29.writeByte(field533.rsOrdinal()); // L: 2133
						switch(field533.field1493) { // L: 2134
						case 0:
							LinkedHashMap var6 = class424.clientPreferences.parameters; // L: 2150
							String var8 = Login.Login_username; // L: 2152
							var9 = var8.length(); // L: 2154
							int var10 = 0; // L: 2155

							for (int var11 = 0; var11 < var9; ++var11) { // L: 2156
								var10 = (var10 << 5) - var10 + var8.charAt(var11);
							}

							var29.writeInt((Integer)var6.get(var10)); // L: 2159
							break;
						case 1:
						case 3:
							var29.writeMedium(GameObject.field2588); // L: 2138
							++var29.offset; // L: 2139
						case 2:
						default:
							break;
						case 4:
							var29.offset += 4; // L: 2144
						}
					}

					if (field534.method7628()) { // L: 2164
						var29.writeByte(class424.field4561.rsOrdinal()); // L: 2165
						var29.writeStringCp1252NullTerminated(this.field535); // L: 2166
					} else {
						var29.writeByte(class424.field4569.rsOrdinal()); // L: 2169
						var29.writeStringCp1252NullTerminated(Login.Login_password); // L: 2170
					}
				}

				var29.encryptRsa(class67.field886, class67.field885); // L: 2173
				class213.field2597 = var33; // L: 2174
				PacketBufferNode var38;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2179
					var38 = new PacketBufferNode(); // L: 2180
				} else {
					var38 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2183
				}

				var38.clientPacket = null; // L: 2186
				var38.clientPacketLength = 0; // L: 2187
				var38.packetBuffer = new PacketBuffer(5000); // L: 2188
				var38.packetBuffer.offset = 0; // L: 2192
				if (gameState == 40) { // L: 2193
					var38.packetBuffer.writeByte(LoginPacket.field3065.id); // L: 2194
				} else {
					var38.packetBuffer.writeByte(LoginPacket.field3067.id); // L: 2197
				}

				var38.packetBuffer.writeShort(0); // L: 2199
				var7 = var38.packetBuffer.offset; // L: 2200
				var38.packetBuffer.writeInt(203); // L: 2201
				var38.packetBuffer.writeInt(1); // L: 2202
				var38.packetBuffer.writeByte(clientType); // L: 2203
				var38.packetBuffer.writeByte(field502); // L: 2204
				var38.packetBuffer.writeBytes(var29.array, 0, var29.offset); // L: 2205
				var16 = var38.packetBuffer.offset; // L: 2206
				var38.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2207
				var38.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2208
				var38.packetBuffer.writeShort(DirectByteArrayCopier.canvasWidth); // L: 2209
				var38.packetBuffer.writeShort(NPC.canvasHeight); // L: 2210
				PacketBuffer var17 = var38.packetBuffer; // L: 2211
				if (randomDatData != null) { // L: 2213
					var17.writeBytes(randomDatData, 0, randomDatData.length); // L: 2214
				} else {
					byte[] var18 = KeyHandler.method332(); // L: 2217
					var17.writeBytes(var18, 0, var18.length); // L: 2218
				}

				var38.packetBuffer.writeStringCp1252NullTerminated(ReflectionCheck.field256); // L: 2220
				var38.packetBuffer.writeInt(class87.field1218); // L: 2221
				Buffer var44 = new Buffer(MouseHandler.platformInfo.size()); // L: 2222
				MouseHandler.platformInfo.write(var44); // L: 2223
				var38.packetBuffer.writeBytes(var44.array, 0, var44.array.length); // L: 2224
				var38.packetBuffer.writeByte(clientType); // L: 2225
				var38.packetBuffer.writeInt(0); // L: 2226
				var38.packetBuffer.method7450(class252.archive11.hash); // L: 2227
				var38.packetBuffer.writeInt(SoundCache.archive14.hash); // L: 2228
				var38.packetBuffer.method7450(Clock.archive17.hash); // L: 2229
				var38.packetBuffer.method7450(FontName.archive15.hash); // L: 2230
				var38.packetBuffer.method7486(WorldMapRegion.archive19.hash); // L: 2231
				var38.packetBuffer.method7450(class7.archive0.hash); // L: 2232
				var38.packetBuffer.method7486(0); // L: 2233
				var38.packetBuffer.method7486(WorldMapLabelSize.archive6.hash); // L: 2234
				var38.packetBuffer.method7486(class403.archive4.hash); // L: 2235
				var38.packetBuffer.writeIntME(Tile.archive3.hash); // L: 2236
				var38.packetBuffer.method7450(WorldMapLabelSize.archive7.hash); // L: 2237
				var38.packetBuffer.method7486(archive5.hash); // L: 2238
				var38.packetBuffer.writeIntME(Message.archive8.hash); // L: 2239
				var38.packetBuffer.method7450(archive1.hash); // L: 2240
				var38.packetBuffer.writeInt(UrlRequest.archive18.hash); // L: 2241
				var38.packetBuffer.method7486(class148.archive12.hash); // L: 2242
				var38.packetBuffer.writeIntME(Varcs.archive20.hash); // L: 2243
				var38.packetBuffer.writeInt(KitDefinition.archive13.hash); // L: 2244
				var38.packetBuffer.writeInt(FriendLoginUpdate.archive2.hash); // L: 2245
				var38.packetBuffer.writeInt(Tile.archive10.hash); // L: 2246
				var38.packetBuffer.method7486(class9.archive9.hash); // L: 2247
				var38.packetBuffer.xteaEncrypt(var33, var16, var38.packetBuffer.offset); // L: 2248
				var38.packetBuffer.writeLengthShort(var38.packetBuffer.offset - var7); // L: 2249
				packetWriter.addNode(var38); // L: 2250
				packetWriter.flush(); // L: 2251
				packetWriter.isaacCipher = new IsaacCipher(var33); // L: 2252
				int[] var19 = new int[4]; // L: 2253

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2254
					var19[var12] = var33[var12] + 50;
				}

				var2.newIsaacCipher(var19); // L: 2255
				WorldMapLabelSize.method4321(6); // L: 2256
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2258 2259
				var42 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2260
				if (var42 == 61) { // L: 2261
					var14 = ((AbstractSocket)var1).available(); // L: 2262
					class261.field3085 = var14 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2263
					WorldMapLabelSize.method4321(5); // L: 2264
				}

				if (var42 == 21 && gameState == 20) { // L: 2266
					WorldMapLabelSize.method4321(12); // L: 2267
				} else if (var42 == 2) { // L: 2269
					WorldMapLabelSize.method4321(14); // L: 2270
				} else if (var42 == 15 && gameState == 40) { // L: 2272
					packetWriter.serverPacketLength = -1; // L: 2273
					WorldMapLabelSize.method4321(19); // L: 2274
				} else if (var42 == 64) { // L: 2276
					WorldMapLabelSize.method4321(10); // L: 2277
				} else if (var42 == 23 && field531 < 1) { // L: 2279
					++field531; // L: 2280
					WorldMapLabelSize.method4321(0); // L: 2281
				} else if (var42 == 29) { // L: 2283
					WorldMapLabelSize.method4321(17); // L: 2284
				} else {
					if (var42 != 69) { // L: 2286
						class221.getLoginError(var42); // L: 2290
						return; // L: 2291
					}

					WorldMapLabelSize.method4321(7); // L: 2287
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2295 2296
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2297
				var2.offset = 0; // L: 2298
				Projectile.field955 = var2.readUnsignedShort(); // L: 2299
				WorldMapLabelSize.method4321(8); // L: 2300
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= Projectile.field955) { // L: 2303 2304
				var2.offset = 0; // L: 2305
				((AbstractSocket)var1).read(var2.array, var2.offset, Projectile.field955); // L: 2306
				class6[] var31 = new class6[]{class6.field27}; // L: 2309
				class6 var35 = var31[var2.readUnsignedByte()]; // L: 2311

				try {
					class3 var5 = class134.method2824(var35); // L: 2313
					this.field528 = new class7(var2, var5); // L: 2314
					WorldMapLabelSize.method4321(9); // L: 2315
				} catch (Exception var23) { // L: 2317
					class221.getLoginError(22); // L: 2318
					return; // L: 2319
				}
			}

			if (loginState == 9 && this.field528.method43()) { // L: 2323 2324
				this.field542 = this.field528.method45(); // L: 2325
				this.field528.method44(); // L: 2326
				this.field528 = null; // L: 2327
				if (this.field542 == null) { // L: 2328
					class221.getLoginError(22); // L: 2329
					return; // L: 2330
				}

				packetWriter.clearBuffer(); // L: 2332
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2337
					var30 = new PacketBufferNode(); // L: 2338
				} else {
					var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2341
				}

				var30.clientPacket = null; // L: 2344
				var30.clientPacketLength = 0; // L: 2345
				var30.packetBuffer = new PacketBuffer(5000); // L: 2346
				var30.packetBuffer.writeByte(LoginPacket.field3066.id); // L: 2350
				var30.packetBuffer.writeShort(this.field542.offset); // L: 2351
				var30.packetBuffer.method7361(this.field542); // L: 2352
				packetWriter.addNode(var30); // L: 2353
				packetWriter.flush(); // L: 2354
				this.field542 = null; // L: 2355
				WorldMapLabelSize.method4321(6); // L: 2356
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2359 2360
				VertexNormal.field2534 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2361
				WorldMapLabelSize.method4321(11); // L: 2362
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= VertexNormal.field2534) { // L: 2365 2366
				((AbstractSocket)var1).read(var2.array, 0, VertexNormal.field2534); // L: 2367
				var2.offset = 0; // L: 2368
				WorldMapLabelSize.method4321(6); // L: 2369
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2372 2373
				field532 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2374
				WorldMapLabelSize.method4321(13); // L: 2375
			}

			if (loginState == 13) { // L: 2378
				field530 = 0; // L: 2379
				UserComparator7.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field532 / 60 + " seconds."); // L: 2380
				if (--field532 <= 0) { // L: 2381
					WorldMapLabelSize.method4321(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2384 2385
					class134.field1572 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2386
					WorldMapLabelSize.method4321(15); // L: 2387
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= class134.field1572) { // L: 2390 2391
					var13 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2392
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2393
					var2.offset = 0; // L: 2394
					boolean var43 = false; // L: 2395
					if (var13) { // L: 2396
						var14 = var2.readByteIsaac() << 24; // L: 2397
						var14 |= var2.readByteIsaac() << 16; // L: 2398
						var14 |= var2.readByteIsaac() << 8; // L: 2399
						var14 |= var2.readByteIsaac(); // L: 2400
						String var40 = Login.Login_username; // L: 2402
						var7 = var40.length(); // L: 2404
						var16 = 0; // L: 2405
						var9 = 0; // L: 2406

						while (true) {
							if (var9 >= var7) {
								if (class424.clientPreferences.parameters.size() >= 10 && !class424.clientPreferences.parameters.containsKey(var16)) { // L: 2410 2411
									Iterator var41 = class424.clientPreferences.parameters.entrySet().iterator(); // L: 2412
									var41.next(); // L: 2413
									var41.remove(); // L: 2414
								}

								class424.clientPreferences.parameters.put(var16, var14); // L: 2417
								break;
							}

							var16 = (var16 << 5) - var16 + var40.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2419
						class424.clientPreferences.rememberedUsername = Login.Login_username; // L: 2420
					} else {
						class424.clientPreferences.rememberedUsername = null; // L: 2423
					}

					GameEngine.savePreferences(); // L: 2425
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2426
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2427
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2428
					localPlayerIndex <<= 8; // L: 2429
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2430
					field772 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2431
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2432
					var2.offset = 0; // L: 2433
					ServerPacket[] var34 = CollisionMap.ServerPacket_values(); // L: 2434
					int var21 = var2.readSmartByteShortIsaac(); // L: 2435
					if (var21 < 0 || var21 >= var34.length) { // L: 2436
						throw new IOException(var21 + " " + var2.offset);
					}

					packetWriter.serverPacket = var34[var21]; // L: 2437
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2438
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2439
					var2.offset = 0; // L: 2440
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2441

					try {
						class27.method395(class414.client, "zap"); // L: 2443
					} catch (Throwable var22) { // L: 2445
					}

					WorldMapLabelSize.method4321(16); // L: 2446
				}

				if (loginState == 16) { // L: 2449
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2450
						var2.offset = 0; // L: 2451
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2452
						timer.method6240(); // L: 2453
						MusicPatch.method5233(); // L: 2454
						AbstractSocket.updatePlayer(var2); // L: 2455
						MouseHandler.field240 = -1; // L: 2456
						Decimator.loadRegions(false, var2); // L: 2457
						packetWriter.serverPacket = null; // L: 2458
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2462 2463
						var2.offset = 0; // L: 2464
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2465
						var2.offset = 0; // L: 2466
						GrandExchangeOfferAgeComparator.field3941 = var2.readUnsignedShort(); // L: 2467
						WorldMapLabelSize.method4321(18); // L: 2468
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= GrandExchangeOfferAgeComparator.field3941) { // L: 2471 2472
						var2.offset = 0; // L: 2473
						((AbstractSocket)var1).read(var2.array, 0, GrandExchangeOfferAgeComparator.field3941); // L: 2474
						var2.offset = 0; // L: 2475
						String var32 = var2.readStringCp1252NullTerminated(); // L: 2476
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2477
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2478
						UserComparator7.setLoginResponseString(var32, var39, var36); // L: 2479
						class111.updateGameState(10); // L: 2480
					}

					if (loginState != 19) { // L: 2483
						++field530; // L: 2530
						if (field530 > 2000) { // L: 2531
							if (field531 < 1) { // L: 2532
								if (class346.worldPort == class274.currentPort) { // L: 2533
									class274.currentPort = class297.js5Port;
								} else {
									class274.currentPort = class346.worldPort; // L: 2534
								}

								++field531; // L: 2535
								WorldMapLabelSize.method4321(0); // L: 2536
							} else {
								class221.getLoginError(-3); // L: 2539
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2484
							if (((AbstractSocket)var1).available() < 2) { // L: 2485
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2486
							var2.offset = 0; // L: 2487
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2488
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2490
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2491
							var2.offset = 0; // L: 2492
							var42 = packetWriter.serverPacketLength; // L: 2493
							timer.method6235(); // L: 2494
							packetWriter.clearBuffer(); // L: 2496
							packetWriter.packetBuffer.offset = 0; // L: 2497
							packetWriter.serverPacket = null; // L: 2498
							packetWriter.field1325 = null; // L: 2499
							packetWriter.field1326 = null; // L: 2500
							packetWriter.field1327 = null; // L: 2501
							packetWriter.serverPacketLength = 0; // L: 2502
							packetWriter.field1323 = 0; // L: 2503
							rebootTimer = 0; // L: 2504
							HitSplatDefinition.method3454(); // L: 2505
							minimapState = 0; // L: 2506
							destinationX = 0; // L: 2507

							for (var14 = 0; var14 < 2048; ++var14) { // L: 2508
								players[var14] = null;
							}

							WorldMapSprite.localPlayer = null; // L: 2509

							for (var14 = 0; var14 < npcs.length; ++var14) { // L: 2510
								NPC var37 = npcs[var14]; // L: 2511
								if (var37 != null) { // L: 2512
									var37.targetIndex = -1; // L: 2513
									var37.false0 = false; // L: 2514
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32); // L: 2518
							class111.updateGameState(30); // L: 2520

							for (var14 = 0; var14 < 100; ++var14) { // L: 2521
								field713[var14] = true;
							}

							DesktopPlatformInfoProvider.method6847(); // L: 2522
							AbstractSocket.updatePlayer(var2); // L: 2524
							if (var42 != var2.offset) { // L: 2525
								throw new RuntimeException(); // L: 2526
							}
						}
					}
				}
			}
		} catch (IOException var26) { // L: 2543
			if (field531 < 1) { // L: 2544
				if (class274.currentPort == class346.worldPort) { // L: 2545
					class274.currentPort = class297.js5Port;
				} else {
					class274.currentPort = class346.worldPort; // L: 2546
				}

				++field531; // L: 2547
				WorldMapLabelSize.method4321(0); // L: 2548
			} else {
				class221.getLoginError(-2); // L: 2551
			}
		}
	} // L: 2382 2460 2528 2537 2540 2549 2552 2554

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1188087780"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2853
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2854
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2855
			hadNetworkError = false; // L: 2856
			class17.method258(); // L: 2857
		} else {
			if (!isMenuOpen) { // L: 2860
				class87.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1145(packetWriter); ++var1) { // L: 2861 2862
			}

			if (gameState == 30) { // L: 2864
				int var2;
				PacketBufferNode var14;
				while (Language.method5810()) { // L: 2865
					var14 = class135.getPacketBufferNode(ClientPacket.field2896, packetWriter.isaacCipher); // L: 2866
					var14.packetBuffer.writeByte(0); // L: 2867
					var2 = var14.packetBuffer.offset; // L: 2868
					Coord.performReflectionCheck(var14.packetBuffer); // L: 2869
					var14.packetBuffer.method7504(var14.packetBuffer.offset - var2); // L: 2870
					packetWriter.addNode(var14); // L: 2871
				}

				if (timer.field4087) { // L: 2873
					var14 = class135.getPacketBufferNode(ClientPacket.field2915, packetWriter.isaacCipher); // L: 2875
					var14.packetBuffer.writeByte(0); // L: 2876
					var2 = var14.packetBuffer.offset; // L: 2877
					timer.write(var14.packetBuffer); // L: 2878
					var14.packetBuffer.method7504(var14.packetBuffer.offset - var2); // L: 2879
					packetWriter.addNode(var14); // L: 2880
					timer.method6234(); // L: 2881
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
				synchronized(PacketWriter.mouseRecorder.lock) { // L: 2884
					if (!field592) { // L: 2885
						PacketWriter.mouseRecorder.index = 0; // L: 2971
					} else if (MouseHandler.MouseHandler_lastButton != 0 || PacketWriter.mouseRecorder.index >= 40) { // L: 2886
						PacketBufferNode var15 = null; // L: 2888
						var3 = 0; // L: 2889
						var4 = 0; // L: 2890
						var5 = 0; // L: 2891
						var6 = 0; // L: 2892

						for (var7 = 0; var7 < PacketWriter.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 2893 2894
							var4 = var7; // L: 2895
							var8 = PacketWriter.mouseRecorder.ys[var7]; // L: 2896
							if (var8 < -1) { // L: 2897
								var8 = -1;
							} else if (var8 > 65534) { // L: 2898
								var8 = 65534;
							}

							var9 = PacketWriter.mouseRecorder.xs[var7]; // L: 2899
							if (var9 < -1) { // L: 2900
								var9 = -1;
							} else if (var9 > 65534) { // L: 2901
								var9 = 65534;
							}

							if (var9 != field508 || var8 != field509) { // L: 2902
								if (var15 == null) { // L: 2905
									var15 = class135.getPacketBufferNode(ClientPacket.field2838, packetWriter.isaacCipher); // L: 2906
									var15.packetBuffer.writeByte(0); // L: 2907
									var3 = var15.packetBuffer.offset; // L: 2908
									var10000 = var15.packetBuffer; // L: 2909
									var10000.offset += 2;
									var5 = 0; // L: 2910
									var6 = 0; // L: 2911
								}

								int var12;
								if (-1L != field651) { // L: 2916
									var10 = var9 - field508; // L: 2917
									var11 = var8 - field509; // L: 2918
									var12 = (int)((PacketWriter.mouseRecorder.millis[var7] - field651) / 20L); // L: 2919
									var5 = (int)((long)var5 + (PacketWriter.mouseRecorder.millis[var7] - field651) % 20L); // L: 2920
								} else {
									var10 = var9; // L: 2923
									var11 = var8; // L: 2924
									var12 = Integer.MAX_VALUE; // L: 2925
								}

								field508 = var9; // L: 2927
								field509 = var8; // L: 2928
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2929
									var10 += 32; // L: 2930
									var11 += 32; // L: 2931
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2932
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2934
									var10 += 128; // L: 2935
									var11 += 128; // L: 2936
									var15.packetBuffer.writeByte(var12 + 128); // L: 2937
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2938
								} else if (var12 < 32) { // L: 2940
									var15.packetBuffer.writeByte(var12 + 192); // L: 2941
									if (var9 != -1 && var8 != -1) { // L: 2942
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 2943
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 2946
									if (var9 != -1 && var8 != -1) { // L: 2947
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 2948
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 2950
								field651 = PacketWriter.mouseRecorder.millis[var7]; // L: 2951
							}
						}

						if (var15 != null) { // L: 2953
							var15.packetBuffer.method7504(var15.packetBuffer.offset - var3); // L: 2954
							var7 = var15.packetBuffer.offset; // L: 2955
							var15.packetBuffer.offset = var3; // L: 2956
							var15.packetBuffer.writeByte(var5 / var6); // L: 2957
							var15.packetBuffer.writeByte(var5 % var6); // L: 2958
							var15.packetBuffer.offset = var7; // L: 2959
							packetWriter.addNode(var15); // L: 2960
						}

						if (var4 >= PacketWriter.mouseRecorder.index) { // L: 2962
							PacketWriter.mouseRecorder.index = 0;
						} else {
							MouseRecorder var44 = PacketWriter.mouseRecorder; // L: 2964
							var44.index -= var4;
							System.arraycopy(PacketWriter.mouseRecorder.xs, var4, PacketWriter.mouseRecorder.xs, 0, PacketWriter.mouseRecorder.index); // L: 2965
							System.arraycopy(PacketWriter.mouseRecorder.ys, var4, PacketWriter.mouseRecorder.ys, 0, PacketWriter.mouseRecorder.index); // L: 2966
							System.arraycopy(PacketWriter.mouseRecorder.millis, var4, PacketWriter.mouseRecorder.millis, 0, PacketWriter.mouseRecorder.index); // L: 2967
						}
					}
				}

				if (MouseHandler.MouseHandler_lastButton == 1 || !class370.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 2973
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 2974
					if (var16 > 32767L) { // L: 2975
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 2976
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 2977
					if (var3 < 0) { // L: 2978
						var3 = 0;
					} else if (var3 > NPC.canvasHeight) { // L: 2979
						var3 = NPC.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 2980
					if (var4 < 0) { // L: 2981
						var4 = 0;
					} else if (var4 > DirectByteArrayCopier.canvasWidth) { // L: 2982
						var4 = DirectByteArrayCopier.canvasWidth;
					}

					var5 = (int)var16; // L: 2983
					PacketBufferNode var18 = class135.getPacketBufferNode(ClientPacket.field2908, packetWriter.isaacCipher); // L: 2984
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 2985
					var18.packetBuffer.writeShort(var4); // L: 2986
					var18.packetBuffer.writeShort(var3); // L: 2987
					packetWriter.addNode(var18); // L: 2988
				}

				if (KeyHandler.field139 > 0) { // L: 2990
					var14 = class135.getPacketBufferNode(ClientPacket.field2882, packetWriter.isaacCipher); // L: 2991
					var14.packetBuffer.writeShort(0); // L: 2992
					var2 = var14.packetBuffer.offset; // L: 2993
					long var19 = DirectByteArrayCopier.method5318(); // L: 2994

					for (var5 = 0; var5 < KeyHandler.field139; ++var5) { // L: 2995
						long var21 = var19 - field685; // L: 2996
						if (var21 > 16777215L) { // L: 2997
							var21 = 16777215L;
						}

						field685 = var19; // L: 2998
						var14.packetBuffer.method7458(KeyHandler.field135[var5]); // L: 2999
						var14.packetBuffer.writeMedium((int)var21); // L: 3000
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3002
					packetWriter.addNode(var14); // L: 3003
				}

				if (field677 > 0) { // L: 3005
					--field677;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3006
					field589 = true;
				}

				if (field589 && field677 <= 0) { // L: 3007
					field677 = 20; // L: 3008
					field589 = false; // L: 3009
					var14 = class135.getPacketBufferNode(ClientPacket.field2836, packetWriter.isaacCipher); // L: 3011
					var14.packetBuffer.method7394(camAngleX); // L: 3012
					var14.packetBuffer.method7405(camAngleY); // L: 3013
					packetWriter.addNode(var14); // L: 3014
				}

				if (class297.hasFocus && !hadFocus) { // L: 3016
					hadFocus = true; // L: 3017
					var14 = class135.getPacketBufferNode(ClientPacket.field2930, packetWriter.isaacCipher); // L: 3019
					var14.packetBuffer.writeByte(1); // L: 3020
					packetWriter.addNode(var14); // L: 3021
				}

				if (!class297.hasFocus && hadFocus) { // L: 3023
					hadFocus = false; // L: 3024
					var14 = class135.getPacketBufferNode(ClientPacket.field2930, packetWriter.isaacCipher); // L: 3026
					var14.packetBuffer.writeByte(0); // L: 3027
					packetWriter.addNode(var14); // L: 3028
				}

				if (Huffman.worldMap != null) { // L: 3031
					Huffman.worldMap.method6884();
				}

				WorldMapSectionType.method4725(); // L: 3032
				if (ClanChannelMember.field1528) { // L: 3034
					Actor.method2177(); // L: 3035
					ClanChannelMember.field1528 = false; // L: 3036
				}

				class118.method2657(); // L: 3039
				if (gameState == 30) { // L: 3040
					for (PendingSpawn var30 = (PendingSpawn)pendingSpawns.last(); var30 != null; var30 = (PendingSpawn)pendingSpawns.previous()) { // L: 3042 3043 3062
						if (var30.hitpoints > 0) { // L: 3044
							--var30.hitpoints;
						}

						if (var30.hitpoints == 0) { // L: 3045
							if (var30.objectId < 0 || WorldMapSectionType.method4717(var30.objectId, var30.field1100)) { // L: 3046
								FloorDecoration.addPendingSpawnToScene(var30.plane, var30.type, var30.x, var30.y, var30.objectId, var30.field1106, var30.field1100); // L: 3047
								var30.remove(); // L: 3048
							}
						} else {
							if (var30.delay > 0) { // L: 3052
								--var30.delay;
							}

							if (var30.delay == 0 && var30.x >= 1 && var30.y >= 1 && var30.x <= 102 && var30.y <= 102 && (var30.id < 0 || WorldMapSectionType.method4717(var30.id, var30.field1103))) { // L: 3053 3054
								FloorDecoration.addPendingSpawnToScene(var30.plane, var30.type, var30.x, var30.y, var30.id, var30.orientation, var30.field1103); // L: 3055
								var30.delay = -1; // L: 3056
								if (var30.objectId == var30.id && var30.objectId == -1) { // L: 3057
									var30.remove();
								} else if (var30.objectId == var30.id && var30.orientation == var30.field1106 && var30.field1100 == var30.field1103) { // L: 3058
									var30.remove();
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3066
						var10002 = queuedSoundEffectDelays[var1]--; // L: 3067
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 3068
							SoundEffect var32 = soundEffects[var1]; // L: 3080
							if (var32 == null) { // L: 3081
								var10000 = null; // L: 3082
								var32 = SoundEffect.readSoundEffect(class403.archive4, soundEffectIds[var1], 0);
								if (var32 == null) { // L: 3083
									continue;
								}

								int[] var45 = queuedSoundEffectDelays; // L: 3084
								var45[var1] += var32.calculateDelay();
								soundEffects[var1] = var32; // L: 3085
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 3091
								if (soundLocations[var1] != 0) { // L: 3093
									var4 = (soundLocations[var1] & 255) * 128; // L: 3094
									var5 = soundLocations[var1] >> 16 & 255; // L: 3095
									var6 = var5 * 128 + 64 - WorldMapSprite.localPlayer.x; // L: 3096
									if (var6 < 0) { // L: 3097
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255; // L: 3098
									var8 = var7 * 128 + 64 - WorldMapSprite.localPlayer.y; // L: 3099
									if (var8 < 0) { // L: 3100
										var8 = -var8;
									}

									var9 = var8 + var6 - 128; // L: 3101
									if (var9 > var4) { // L: 3102
										queuedSoundEffectDelays[var1] = -100; // L: 3103
										continue; // L: 3104
									}

									if (var9 < 0) { // L: 3106
										var9 = 0;
									}

									var3 = (var4 - var9) * class424.clientPreferences.areaSoundEffectsVolume / var4; // L: 3107
								} else {
									var3 = class424.clientPreferences.soundEffectsVolume; // L: 3109
								}

								if (var3 > 0) { // L: 3110
									RawSound var23 = var32.toRawSound().resample(class131.decimator); // L: 3111
									RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 3112
									var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3113
									class123.pcmStreamMixer.addSubStream(var24); // L: 3114
								}

								queuedSoundEffectDelays[var1] = -100; // L: 3116
							}
						} else {
							--soundEffectCount; // L: 3069

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 3070
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 3071
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 3072
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 3073
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 3074
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 3075
							}

							--var1; // L: 3077
						}
					}

					if (field744) { // L: 3119
						boolean var28;
						if (class265.musicPlayerStatus != 0) { // L: 3122
							var28 = true; // L: 3123
						} else {
							var28 = class265.midiPcmStream.isReady(); // L: 3126
						}

						if (!var28) { // L: 3128
							if (class424.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) { // L: 3129
								MenuAction.method1894(WorldMapLabelSize.archive6, currentTrackGroupId, 0, class424.clientPreferences.musicVolume, false);
							}

							field744 = false; // L: 3130
						}
					}

					++packetWriter.field1323; // L: 3134
					if (packetWriter.field1323 > 750) { // L: 3135
						class17.method258(); // L: 3136
					} else {
						var1 = Players.Players_count; // L: 3140
						int[] var34 = Players.Players_indices; // L: 3141

						for (var3 = 0; var3 < var1; ++var3) { // L: 3142
							Player var36 = players[var34[var3]]; // L: 3143
							if (var36 != null) { // L: 3144
								class334.updateActorSequence(var36, 1); // L: 3145
							}
						}

						UserComparator9.method2494(); // L: 3149
						int[] var31 = Players.Players_indices; // L: 3151

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 3152
							Player var25 = players[var31[var2]]; // L: 3153
							if (var25 != null && var25.overheadTextCyclesRemaining > 0) { // L: 3154
								--var25.overheadTextCyclesRemaining; // L: 3155
								if (var25.overheadTextCyclesRemaining == 0) { // L: 3156
									var25.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 3159
							var3 = npcIndices[var2]; // L: 3160
							NPC var37 = npcs[var3]; // L: 3161
							if (var37 != null && var37.overheadTextCyclesRemaining > 0) { // L: 3162
								--var37.overheadTextCyclesRemaining; // L: 3163
								if (var37.overheadTextCyclesRemaining == 0) { // L: 3164
									var37.overheadText = null;
								}
							}
						}

						++field566; // L: 3168
						if (mouseCrossColor != 0) { // L: 3169
							mouseCrossState += 20; // L: 3170
							if (mouseCrossState >= 400) { // L: 3171
								mouseCrossColor = 0;
							}
						}

						if (WorldMapSectionType.field2720 != null) { // L: 3173
							++field610; // L: 3174
							if (field610 >= 15) { // L: 3175
								class112.invalidateWidget(WorldMapSectionType.field2720); // L: 3176
								WorldMapSectionType.field2720 = null; // L: 3177
							}
						}

						Widget var33 = class242.mousedOverWidgetIf1; // L: 3180
						Widget var35 = class126.field1516; // L: 3181
						class242.mousedOverWidgetIf1 = null; // L: 3182
						class126.field1516 = null; // L: 3183
						draggedOnWidget = null; // L: 3184
						field648 = false; // L: 3185
						field682 = false; // L: 3186
						field729 = 0; // L: 3187

						while (class370.isKeyDown() && field729 < 128) { // L: 3188
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class160.field1749 == 66) { // L: 3189
								String var40 = ClanChannelMember.method2769(); // L: 3190
								class414.client.method448(var40); // L: 3191
							} else if (oculusOrbState != 1 || ClanSettings.field1610 <= 0) { // L: 3194
								field731[field729] = class160.field1749; // L: 3197
								field684[field729] = ClanSettings.field1610; // L: 3198
								++field729; // L: 3199
							}
						}

						if (class133.method2807() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3201
							var3 = WorldMapSprite.localPlayer.plane - mouseWheelRotation; // L: 3202
							if (var3 < 0) { // L: 3203
								var3 = 0;
							} else if (var3 > 3) { // L: 3204
								var3 = 3;
							}

							if (var3 != WorldMapSprite.localPlayer.plane) { // L: 3205
								DevicePcmPlayerProvider.method361(WorldMapSprite.localPlayer.pathX[0] + Canvas.baseX, WorldMapSprite.localPlayer.pathY[0] + class118.baseY, var3, false); // L: 3206
							}

							mouseWheelRotation = 0; // L: 3208
						}

						if (rootInterface != -1) { // L: 3210
							class123.updateRootInterface(rootInterface, 0, 0, DirectByteArrayCopier.canvasWidth, NPC.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3211

						while (true) {
							Widget var38;
							Widget var39;
							ScriptEvent var42;
							do {
								var42 = (ScriptEvent)field708.removeLast(); // L: 3213
								if (var42 == null) { // L: 3214
									while (true) {
										do {
											var42 = (ScriptEvent)field709.removeLast(); // L: 3225
											if (var42 == null) { // L: 3226
												while (true) {
													do {
														var42 = (ScriptEvent)scriptEvents.removeLast(); // L: 3237
														if (var42 == null) { // L: 3238
															this.menu(); // L: 3248
															if (Huffman.worldMap != null) { // L: 3250
																Huffman.worldMap.method6894(SoundSystem.Client_plane, (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX, (WorldMapSprite.localPlayer.y >> 7) + class118.baseY, false); // L: 3251
																Huffman.worldMap.loadCache(); // L: 3252
															}

															if (clickedWidget != null) { // L: 3255
																this.method1149();
															}

															PacketBufferNode var41;
															if (class20.dragInventoryWidget != null) { // L: 3256
																class112.invalidateWidget(class20.dragInventoryWidget); // L: 3257
																++itemDragDuration; // L: 3258
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3259
																	if (field616) { // L: 3260
																		if (NPC.hoveredItemContainer == class20.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) { // L: 3261
																			Widget var43 = class20.dragInventoryWidget; // L: 3262
																			byte var29 = 0; // L: 3263
																			if (field669 == 1 && var43.contentType == 206) { // L: 3264
																				var29 = 1;
																			}

																			if (var43.itemIds[dragItemSlotDestination] <= 0) { // L: 3265
																				var29 = 0;
																			}

																			if (HorizontalAlignment.method3275(Language.getWidgetFlags(var43))) { // L: 3266
																				var5 = dragItemSlotSource; // L: 3267
																				var6 = dragItemSlotDestination; // L: 3268
																				var43.itemIds[var6] = var43.itemIds[var5]; // L: 3269
																				var43.itemQuantities[var6] = var43.itemQuantities[var5]; // L: 3270
																				var43.itemIds[var5] = -1; // L: 3271
																				var43.itemQuantities[var5] = 0; // L: 3272
																			} else if (var29 == 1) { // L: 3274
																				var5 = dragItemSlotSource; // L: 3275
																				var6 = dragItemSlotDestination; // L: 3276

																				while (var5 != var6) { // L: 3277
																					if (var5 > var6) { // L: 3278
																						var43.swapItems(var5 - 1, var5); // L: 3279
																						--var5; // L: 3280
																					} else if (var5 < var6) { // L: 3282
																						var43.swapItems(var5 + 1, var5); // L: 3283
																						++var5; // L: 3284
																					}
																				}
																			} else {
																				var43.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3289
																			}

																			var41 = class135.getPacketBufferNode(ClientPacket.field2856, packetWriter.isaacCipher); // L: 3292
																			var41.packetBuffer.method7405(dragItemSlotDestination); // L: 3293
																			var41.packetBuffer.method7405(dragItemSlotSource); // L: 3294
																			var41.packetBuffer.writeInt(class20.dragInventoryWidget.id); // L: 3295
																			var41.packetBuffer.method7403(var29); // L: 3296
																			packetWriter.addNode(var41); // L: 3297
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3301
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3302
																	} else if (menuOptionsCount > 0) { // L: 3304
																		Tiles.method2054(draggedWidgetX, draggedWidgetY); // L: 3305
																	}

																	field610 = 10; // L: 3308
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3309
																	class20.dragInventoryWidget = null; // L: 3310
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3313 3314
																	field616 = true; // L: 3315
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3320
																var3 = Scene.Scene_selectedX; // L: 3321
																var4 = Scene.Scene_selectedY; // L: 3322
																var41 = class135.getPacketBufferNode(ClientPacket.field2861, packetWriter.isaacCipher); // L: 3324
																var41.packetBuffer.writeByte(5); // L: 3325
																var41.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3326
																var41.packetBuffer.method7555(var3 + Canvas.baseX); // L: 3327
																var41.packetBuffer.method7555(var4 + class118.baseY); // L: 3328
																packetWriter.addNode(var41); // L: 3329
																Scene.method3936(); // L: 3330
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3331
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3332
																mouseCrossColor = 1; // L: 3333
																mouseCrossState = 0; // L: 3334
																destinationX = var3; // L: 3335
																destinationY = var4; // L: 3336
															}

															if (var33 != class242.mousedOverWidgetIf1) { // L: 3338
																if (var33 != null) { // L: 3339
																	class112.invalidateWidget(var33);
																}

																if (class242.mousedOverWidgetIf1 != null) { // L: 3340
																	class112.invalidateWidget(class242.mousedOverWidgetIf1);
																}
															}

															if (var35 != class126.field1516 && field506 == field734) { // L: 3342
																if (var35 != null) { // L: 3343
																	class112.invalidateWidget(var35);
																}

																if (class126.field1516 != null) { // L: 3344
																	class112.invalidateWidget(class126.field1516);
																}
															}

															if (class126.field1516 != null) { // L: 3346
																if (field506 < field734) { // L: 3347
																	++field506; // L: 3348
																	if (field506 == field734) { // L: 3349
																		class112.invalidateWidget(class126.field1516);
																	}
																}
															} else if (field506 > 0) { // L: 3352
																--field506;
															}

															UserComparator4.method2443(); // L: 3353
															if (field755) { // L: 3354
																class291.method5478();
															} else if (isCameraLocked) { // L: 3355
																var3 = Message.field478 * 128 + 64; // L: 3356
																var4 = class12.field75 * 128 + 64; // L: 3357
																var5 = class92.getTileHeight(var3, var4, SoundSystem.Client_plane) - class121.field1492; // L: 3358
																SceneTilePaint.method4270(var3, var5, var4); // L: 3359
																var3 = class7.field33 * 128 + 64; // L: 3360
																var4 = class21.field119 * 128 + 64; // L: 3361
																var5 = class92.getTileHeight(var3, var4, SoundSystem.Client_plane) - class334.field4057; // L: 3362
																var6 = var3 - class414.cameraX; // L: 3363
																var7 = var5 - WorldMapDecoration.cameraY; // L: 3364
																var8 = var4 - GrandExchangeOfferOwnWorldComparator.cameraZ; // L: 3365
																var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8)); // L: 3366
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047; // L: 3367
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047; // L: 3368
																class260.method5000(var10, var11); // L: 3369
															}

															for (var3 = 0; var3 < 5; ++var3) { // L: 3371
																var10002 = field757[var3]++;
															}

															JagexCache.varcs.tryWrite(); // L: 3372
															var3 = class221.method4644(); // L: 3373
															var4 = class135.method2834(); // L: 3374
															if (var3 > 15000 && var4 > 15000) { // L: 3375
																logoutTimer = 250; // L: 3376
																Script.method1993(14500); // L: 3377
																var41 = class135.getPacketBufferNode(ClientPacket.field2903, packetWriter.isaacCipher); // L: 3379
																packetWriter.addNode(var41); // L: 3380
															}

															ClanSettings.friendSystem.processFriendUpdates(); // L: 3382
															++packetWriter.pendingWrites; // L: 3383
															if (packetWriter.pendingWrites > 50) { // L: 3384
																var41 = class135.getPacketBufferNode(ClientPacket.field2837, packetWriter.isaacCipher); // L: 3386
																packetWriter.addNode(var41); // L: 3387
															}

															try {
																packetWriter.flush(); // L: 3390
															} catch (IOException var26) { // L: 3392
																class17.method258(); // L: 3393
															}

															return; // L: 3395
														}

														var38 = var42.widget; // L: 3239
														if (var38.childIndex < 0) { // L: 3240
															break;
														}

														var39 = class130.getWidget(var38.parentId); // L: 3241
													} while(var39 == null || var39.children == null || var38.childIndex >= var39.children.length || var38 != var39.children[var38.childIndex]); // L: 3242

													class92.runScriptEvent(var42); // L: 3246
												}
											}

											var38 = var42.widget; // L: 3227
											if (var38.childIndex < 0) { // L: 3228
												break;
											}

											var39 = class130.getWidget(var38.parentId); // L: 3229
										} while(var39 == null || var39.children == null || var38.childIndex >= var39.children.length || var38 != var39.children[var38.childIndex]); // L: 3230

										class92.runScriptEvent(var42); // L: 3234
									}
								}

								var38 = var42.widget; // L: 3215
								if (var38.childIndex < 0) { // L: 3216
									break;
								}

								var39 = class130.getWidget(var38.parentId); // L: 3217
							} while(var39 == null || var39.children == null || var38.childIndex >= var39.children.length || var38 != var39.children[var38.childIndex]); // L: 3218

							class92.runScriptEvent(var42); // L: 3222
						}
					}
				}
			}
		}
	} // L: 2858 3137

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "531081400"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = DirectByteArrayCopier.canvasWidth; // L: 4167
		int var2 = NPC.canvasHeight; // L: 4168
		if (super.contentWidth < var1) { // L: 4169
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4170
		}

		if (class424.clientPreferences != null) { // L: 4171
			try {
				class27.method396(class414.client, "resize", new Object[]{class339.getWindowedMode()}); // L: 4173
			} catch (Throwable var4) { // L: 4175
			}
		}

	} // L: 4177

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1862887067"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4180
			var1 = rootInterface; // L: 4181
			if (class13.loadInterface(var1)) { // L: 4183
				Player.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1); // L: 4184
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4187
			if (field713[var1]) { // L: 4188
				field714[var1] = true;
			}

			field715[var1] = field713[var1]; // L: 4189
			field713[var1] = false; // L: 4190
		}

		field712 = cycle; // L: 4192
		viewportX = -1; // L: 4193
		viewportY = -1; // L: 4194
		NPC.hoveredItemContainer = null; // L: 4195
		if (rootInterface != -1) { // L: 4196
			rootWidgetCount = 0; // L: 4197
			UserComparator5.drawWidgets(rootInterface, 0, 0, DirectByteArrayCopier.canvasWidth, NPC.canvasHeight, 0, 0, -1); // L: 4198
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4200
		if (showMouseCross) { // L: 4201
			if (mouseCrossColor == 1) { // L: 4202
				WorldMapData_1.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4203
			}

			if (mouseCrossColor == 2) { // L: 4205
				WorldMapData_1.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4206
			}
		}

		if (!isMenuOpen) { // L: 4209
			if (viewportX != -1) { // L: 4210
				class87.method2221(viewportX, viewportY);
			}
		} else {
			var1 = Projectile.menuX; // L: 4213
			int var2 = ReflectionCheck.menuY; // L: 4214
			int var3 = Calendar.menuWidth; // L: 4215
			int var4 = ScriptFrame.menuHeight; // L: 4216
			int var5 = 6116423; // L: 4217
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4218
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4219
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4220
			class408.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4221
			int var6 = MouseHandler.MouseHandler_x; // L: 4222
			int var7 = MouseHandler.MouseHandler_y; // L: 4223

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4224
				int var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31; // L: 4225
				int var10 = 16777215; // L: 4226
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4227
					var10 = 16776960;
				}

				class408.fontBold12.draw(class144.method2969(var8), var1 + 3, var9, var10, 0); // L: 4228
			}

			class127.method2765(Projectile.menuX, ReflectionCheck.menuY, Calendar.menuWidth, ScriptFrame.menuHeight); // L: 4230
		}

		if (gameDrawingMode == 3) { // L: 4232
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4233
				if (field715[var1]) { // L: 4234
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4235
				} else if (field714[var1]) { // L: 4237
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4238
				}
			}
		}

		SoundCache.method800(SoundSystem.Client_plane, WorldMapSprite.localPlayer.x, WorldMapSprite.localPlayer.y, field566); // L: 4242
		field566 = 0; // L: 4243
	} // L: 4244

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)Z",
		garbageValue = "-826761503"
	)
	final boolean method1145(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5798
		PacketBuffer var3 = var1.packetBuffer; // L: 5799
		if (var2 == null) { // L: 5800
			return false;
		} else {
			int var6;
			String var18;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5802
					if (var1.field1322) { // L: 5803
						if (!var2.isAvailable(1)) { // L: 5804
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5805
						var1.field1323 = 0; // L: 5806
						var1.field1322 = false; // L: 5807
					}

					var3.offset = 0; // L: 5809
					if (var3.method7321()) { // L: 5810
						if (!var2.isAvailable(1)) { // L: 5811
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5812
						var1.field1323 = 0; // L: 5813
					}

					var1.field1322 = true; // L: 5815
					ServerPacket[] var4 = CollisionMap.ServerPacket_values(); // L: 5816
					var5 = var3.readSmartByteShortIsaac(); // L: 5817
					if (var5 < 0 || var5 >= var4.length) { // L: 5818
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5819
					var1.serverPacketLength = var1.serverPacket.length; // L: 5820
				}

				if (var1.serverPacketLength == -1) { // L: 5822
					if (!var2.isAvailable(1)) { // L: 5823
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5824
					var1.serverPacketLength = var3.array[0] & 255; // L: 5825
				}

				if (var1.serverPacketLength == -2) { // L: 5827
					if (!var2.isAvailable(2)) { // L: 5828
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5829
					var3.offset = 0; // L: 5830
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5831
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5833
					return false;
				}

				var3.offset = 0; // L: 5834
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5835
				var1.field1323 = 0; // L: 5836
				timer.method6230(); // L: 5837
				var1.field1327 = var1.field1326; // L: 5838
				var1.field1326 = var1.field1325; // L: 5839
				var1.field1325 = var1.serverPacket; // L: 5840
				int var17;
				if (ServerPacket.field2977 == var1.serverPacket) { // L: 5841
					var17 = var3.method7399(); // L: 5842
					var18 = var3.readStringCp1252NullTerminated(); // L: 5843
					var6 = var3.method7398(); // L: 5844
					if (var17 >= 1 && var17 <= 8) { // L: 5845
						if (var18.equalsIgnoreCase("null")) { // L: 5846
							var18 = null;
						}

						playerMenuActions[var17 - 1] = var18; // L: 5847
						playerOptionsPriorities[var17 - 1] = var6 == 0; // L: 5848
					}

					var1.serverPacket = null; // L: 5850
					return true; // L: 5851
				}

				Widget var53;
				if (ServerPacket.field3034 == var1.serverPacket) { // L: 5853
					var17 = var3.readInt(); // L: 5854
					var5 = var3.method7408(); // L: 5855
					var6 = var3.method7414(); // L: 5856
					var53 = class130.getWidget(var17); // L: 5857
					var53.field3320 = var5 + (var6 << 16); // L: 5858
					var1.serverPacket = null; // L: 5859
					return true; // L: 5860
				}

				if (ServerPacket.field3059 == var1.serverPacket) { // L: 5862
					class368.updateNpcs(false, var3); // L: 5863
					var1.serverPacket = null; // L: 5864
					return true; // L: 5865
				}

				if (ServerPacket.field2996 == var1.serverPacket) { // L: 5867
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) { // L: 5868
						if (Varps.Varps_main[var17] != Varps.Varps_temp[var17]) { // L: 5869
							Varps.Varps_main[var17] = Varps.Varps_temp[var17]; // L: 5870
							NetFileRequest.changeGameOptions(var17); // L: 5871
							changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 5872
						}
					}

					var1.serverPacket = null; // L: 5875
					return true; // L: 5876
				}

				if (ServerPacket.field2962 == var1.serverPacket) { // L: 5878
					UserComparator7.method2463(class255.field2948); // L: 5879
					var1.serverPacket = null; // L: 5880
					return true; // L: 5881
				}

				if (ServerPacket.field2975 == var1.serverPacket) { // L: 5883
					UserComparator7.method2463(class255.field2950); // L: 5884
					var1.serverPacket = null; // L: 5885
					return true; // L: 5886
				}

				if (ServerPacket.field3005 == var1.serverPacket) { // L: 5888
					isCameraLocked = false; // L: 5889

					for (var17 = 0; var17 < 5; ++var17) { // L: 5890
						field753[var17] = false;
					}

					var1.serverPacket = null; // L: 5891
					return true; // L: 5892
				}

				Widget var19;
				if (ServerPacket.field3026 == var1.serverPacket) { // L: 5894
					var17 = var3.method7417(); // L: 5895
					var5 = var3.method7408(); // L: 5896
					var19 = class130.getWidget(var17); // L: 5897
					if (var19.modelType != 1 || var5 != var19.modelId) { // L: 5898
						var19.modelType = 1; // L: 5899
						var19.modelId = var5; // L: 5900
						class112.invalidateWidget(var19); // L: 5901
					}

					var1.serverPacket = null; // L: 5903
					return true; // L: 5904
				}

				if (ServerPacket.field3015 == var1.serverPacket) { // L: 5906
					var17 = var3.readInt(); // L: 5907
					var5 = var3.method7408(); // L: 5908
					var19 = class130.getWidget(var17); // L: 5909
					if (var19 != null && var19.type == 0) { // L: 5910
						if (var5 > var19.scrollHeight - var19.height) { // L: 5911
							var5 = var19.scrollHeight - var19.height;
						}

						if (var5 < 0) { // L: 5912
							var5 = 0;
						}

						if (var5 != var19.scrollY) { // L: 5913
							var19.scrollY = var5; // L: 5914
							class112.invalidateWidget(var19); // L: 5915
						}
					}

					var1.serverPacket = null; // L: 5918
					return true; // L: 5919
				}

				if (ServerPacket.field3049 == var1.serverPacket) { // L: 5921
					UserComparator7.method2463(class255.field2949); // L: 5922
					var1.serverPacket = null; // L: 5923
					return true; // L: 5924
				}

				if (ServerPacket.field3033 == var1.serverPacket) { // L: 5926
					var17 = var3.readUnsignedByte(); // L: 5927
					ClientPacket.method4975(var17); // L: 5928
					var1.serverPacket = null; // L: 5929
					return true; // L: 5930
				}

				if (ServerPacket.field3011 == var1.serverPacket) { // L: 5932
					ClanSettings.friendSystem.method1704(); // L: 5933
					field600 = cycleCntr; // L: 5934
					var1.serverPacket = null; // L: 5935
					return true; // L: 5936
				}

				if (ServerPacket.field3056 == var1.serverPacket) { // L: 5938
					class221.field2680 = new class375(FloorOverlayDefinition.HitSplatDefinition_cached); // L: 5939
					var1.serverPacket = null; // L: 5940
					return true; // L: 5941
				}

				String var69;
				if (ServerPacket.field2995 == var1.serverPacket) { // L: 5943
					byte[] var51 = new byte[var1.serverPacketLength]; // L: 5944
					var3.method7317(var51, 0, var51.length); // L: 5945
					Buffer var68 = new Buffer(var51); // L: 5946
					var69 = var68.readStringCp1252NullTerminated(); // L: 5947
					MilliClock.openURL(var69, true, false); // L: 5948
					var1.serverPacket = null; // L: 5949
					return true; // L: 5950
				}

				if (ServerPacket.field2982 == var1.serverPacket) { // L: 5952
					class221.field2680 = null; // L: 5953
					var1.serverPacket = null; // L: 5954
					return true; // L: 5955
				}

				Widget var64;
				if (ServerPacket.field3018 == var1.serverPacket) { // L: 5957
					var17 = var3.method7418(); // L: 5958
					var64 = class130.getWidget(var17); // L: 5959
					var64.modelType = 3; // L: 5960
					var64.modelId = WorldMapSprite.localPlayer.appearance.getChatHeadId(); // L: 5961
					class112.invalidateWidget(var64); // L: 5962
					var1.serverPacket = null; // L: 5963
					return true; // L: 5964
				}

				int var13;
				long var20;
				long var22;
				String var24;
				String var48;
				if (ServerPacket.field3022 == var1.serverPacket) { // L: 5966
					var48 = var3.readStringCp1252NullTerminated(); // L: 5967
					var20 = (long)var3.readUnsignedShort(); // L: 5968
					var22 = (long)var3.readMedium(); // L: 5969
					PlayerType var9 = (PlayerType)class140.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte()); // L: 5970
					long var10 = var22 + (var20 << 32); // L: 5971
					boolean var12 = false; // L: 5972

					for (var13 = 0; var13 < 100; ++var13) { // L: 5973
						if (var10 == crossWorldMessageIds[var13]) { // L: 5974
							var12 = true; // L: 5975
							break; // L: 5976
						}
					}

					if (ClanSettings.friendSystem.isIgnored(new Username(var48, VarcInt.loginType))) { // L: 5979
						var12 = true;
					}

					if (!var12 && field658 == 0) { // L: 5980
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var10; // L: 5981
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 5982
						var24 = AbstractFont.escapeBrackets(ModelData0.method4273(GrandExchangeOfferUnitPriceComparator.method5755(var3))); // L: 5983
						byte var58;
						if (var9.isPrivileged) { // L: 5985
							var58 = 7;
						} else {
							var58 = 3; // L: 5986
						}

						if (var9.modIcon != -1) { // L: 5987
							LoginScreenAnimation.addGameMessage(var58, WorldMapSectionType.method4720(var9.modIcon) + var48, var24);
						} else {
							LoginScreenAnimation.addGameMessage(var58, var48, var24); // L: 5988
						}
					}

					var1.serverPacket = null; // L: 5990
					return true; // L: 5991
				}

				if (ServerPacket.field3027 == var1.serverPacket) { // L: 5993
					var17 = var3.readUnsignedShort(); // L: 5994
					var5 = var3.readUnsignedByte(); // L: 5995
					var6 = var3.readUnsignedShort(); // L: 5996
					ObjectComposition.queueSoundEffect(var17, var5, var6); // L: 5997
					var1.serverPacket = null; // L: 5998
					return true; // L: 5999
				}

				if (ServerPacket.field2978 == var1.serverPacket) { // L: 6001
					var48 = var3.readStringCp1252NullTerminated(); // L: 6002
					Object[] var67 = new Object[var48.length() + 1]; // L: 6003

					for (var6 = var48.length() - 1; var6 >= 0; --var6) { // L: 6004
						if (var48.charAt(var6) == 's') { // L: 6005
							var67[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var67[var6 + 1] = new Integer(var3.readInt()); // L: 6006
						}
					}

					var67[0] = new Integer(var3.readInt()); // L: 6008
					ScriptEvent var73 = new ScriptEvent(); // L: 6009
					var73.args = var67; // L: 6010
					class92.runScriptEvent(var73); // L: 6011
					var1.serverPacket = null; // L: 6012
					return true; // L: 6013
				}

				if (ServerPacket.field2963 == var1.serverPacket) { // L: 6015
					var17 = var3.readInt(); // L: 6016
					InterfaceParent var66 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6017
					if (var66 != null) { // L: 6018
						class127.closeInterface(var66, true);
					}

					if (meslayerContinueWidget != null) { // L: 6019
						class112.invalidateWidget(meslayerContinueWidget); // L: 6020
						meslayerContinueWidget = null; // L: 6021
					}

					var1.serverPacket = null; // L: 6023
					return true; // L: 6024
				}

				if (ServerPacket.field2998 == var1.serverPacket) { // L: 6026
					class33.field243 = var3.method7399(); // L: 6027
					Canvas.field157 = var3.readUnsignedByte(); // L: 6028

					while (var3.offset < var1.serverPacketLength) { // L: 6029
						var17 = var3.readUnsignedByte(); // L: 6030
						class255 var65 = VerticalAlignment.method3321()[var17]; // L: 6031
						UserComparator7.method2463(var65); // L: 6032
					}

					var1.serverPacket = null; // L: 6034
					return true; // L: 6035
				}

				if (ServerPacket.field3046 == var1.serverPacket) { // L: 6037
					hintArrowType = var3.readUnsignedByte(); // L: 6038
					if (hintArrowType == 1) { // L: 6039
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6040
						if (hintArrowType == 2) { // L: 6041
							hintArrowSubX = 64; // L: 6042
							hintArrowSubY = 64; // L: 6043
						}

						if (hintArrowType == 3) { // L: 6045
							hintArrowSubX = 0; // L: 6046
							hintArrowSubY = 64; // L: 6047
						}

						if (hintArrowType == 4) { // L: 6049
							hintArrowSubX = 128; // L: 6050
							hintArrowSubY = 64; // L: 6051
						}

						if (hintArrowType == 5) { // L: 6053
							hintArrowSubX = 64; // L: 6054
							hintArrowSubY = 0; // L: 6055
						}

						if (hintArrowType == 6) { // L: 6057
							hintArrowSubX = 64; // L: 6058
							hintArrowSubY = 128; // L: 6059
						}

						hintArrowType = 2; // L: 6061
						hintArrowX = var3.readUnsignedShort(); // L: 6062
						hintArrowY = var3.readUnsignedShort(); // L: 6063
						hintArrowHeight = var3.readUnsignedByte(); // L: 6064
					}

					if (hintArrowType == 10) { // L: 6066
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6067
					return true; // L: 6068
				}

				if (ServerPacket.field3060 == var1.serverPacket) { // L: 6070
					var17 = var3.method7408(); // L: 6071
					if (var17 == 65535) { // L: 6072
						var17 = -1;
					}

					WorldMapSection2.playSong(var17); // L: 6073
					var1.serverPacket = null; // L: 6074
					return true; // L: 6075
				}

				if (ServerPacket.field3032 == var1.serverPacket) { // L: 6077
					var17 = var3.method7412(); // L: 6078
					var5 = var3.method7414(); // L: 6079
					if (var5 == 65535) { // L: 6080
						var5 = -1;
					}

					class186.method3695(var5, var17); // L: 6081
					var1.serverPacket = null; // L: 6082
					return true; // L: 6083
				}

				if (ServerPacket.field3051 == var1.serverPacket) { // L: 6085
					var17 = var3.method7418(); // L: 6086
					var5 = var3.method7411(); // L: 6087
					var19 = class130.getWidget(var17); // L: 6088
					if (var5 != var19.sequenceId || var5 == -1) { // L: 6089
						var19.sequenceId = var5; // L: 6090
						var19.modelFrame = 0; // L: 6091
						var19.modelFrameCycle = 0; // L: 6092
						class112.invalidateWidget(var19); // L: 6093
					}

					var1.serverPacket = null; // L: 6095
					return true; // L: 6096
				}

				if (ServerPacket.field2964 == var1.serverPacket) { // L: 6098
					UserComparator7.method2463(class255.field2947); // L: 6099
					var1.serverPacket = null; // L: 6100
					return true; // L: 6101
				}

				if (ServerPacket.field3050 == var1.serverPacket) { // L: 6103
					var3.offset += 28; // L: 6104
					if (var3.checkCrc()) { // L: 6105
						Frames.method4098(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6106
					return true; // L: 6107
				}

				if (ServerPacket.field3012 == var1.serverPacket) { // L: 6109
					var17 = var3.readInt(); // L: 6110
					var64 = class130.getWidget(var17); // L: 6111

					for (var6 = 0; var6 < var64.itemIds.length; ++var6) { // L: 6112
						var64.itemIds[var6] = -1; // L: 6113
						var64.itemIds[var6] = 0; // L: 6114
					}

					class112.invalidateWidget(var64); // L: 6116
					var1.serverPacket = null; // L: 6117
					return true; // L: 6118
				}

				boolean var72;
				if (ServerPacket.field2970 == var1.serverPacket) { // L: 6120
					var72 = var3.readBoolean(); // L: 6121
					if (var72) { // L: 6122
						if (class9.field58 == null) { // L: 6123
							class9.field58 = new class317();
						}
					} else {
						class9.field58 = null; // L: 6125
					}

					var1.serverPacket = null; // L: 6126
					return true; // L: 6127
				}

				if (ServerPacket.field3054 == var1.serverPacket) { // L: 6129
					ClanSettings.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6130
					MouseRecorder.FriendSystem_invalidateIgnoreds(); // L: 6131
					field600 = cycleCntr; // L: 6132
					var1.serverPacket = null; // L: 6133
					return true; // L: 6134
				}

				if (ServerPacket.field3016 == var1.serverPacket) { // L: 6136
					PrivateChatMode.updatePlayers(var3, var1.serverPacketLength); // L: 6137
					class414.method7254(); // L: 6138
					var1.serverPacket = null; // L: 6139
					return true; // L: 6140
				}

				int var8;
				int var25;
				long var26;
				if (ServerPacket.field2967 == var1.serverPacket) { // L: 6142
					var17 = var3.method7416(); // L: 6143
					var5 = var3.method7418(); // L: 6144
					var6 = var3.method7408(); // L: 6145
					if (var6 == 65535) { // L: 6146
						var6 = -1;
					}

					var25 = var3.method7414(); // L: 6147
					if (var25 == 65535) { // L: 6148
						var25 = -1;
					}

					for (var8 = var6; var8 <= var25; ++var8) { // L: 6149
						var26 = (long)var8 + ((long)var17 << 32); // L: 6150
						Node var54 = widgetFlags.get(var26); // L: 6151
						if (var54 != null) { // L: 6152
							var54.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var26); // L: 6153
					}

					var1.serverPacket = null; // L: 6155
					return true; // L: 6156
				}

				if (ServerPacket.field3052 == var1.serverPacket) { // L: 6158
					WorldMapAreaData.method4855(); // L: 6159
					var17 = var3.method7399(); // L: 6160
					var5 = var3.method7467(); // L: 6161
					var6 = var3.readInt(); // L: 6162
					experience[var17] = var6; // L: 6163
					currentLevels[var17] = var5; // L: 6164
					levels[var17] = 1; // L: 6165

					for (var25 = 0; var25 < 98; ++var25) { // L: 6166
						if (var6 >= Skills.Skills_experienceTable[var25]) {
							levels[var17] = var25 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var17; // L: 6167
					var1.serverPacket = null; // L: 6168
					return true; // L: 6169
				}

				if (ServerPacket.field3024 == var1.serverPacket) { // L: 6171
					for (var17 = 0; var17 < VarpDefinition.VarpDefinition_fileCount; ++var17) { // L: 6172
						VarpDefinition var62 = PcmPlayer.VarpDefinition_get(var17); // L: 6173
						if (var62 != null) { // L: 6174
							Varps.Varps_temp[var17] = 0; // L: 6175
							Varps.Varps_main[var17] = 0; // L: 6176
						}
					}

					WorldMapAreaData.method4855(); // L: 6179
					changedVarpCount += 32; // L: 6180
					var1.serverPacket = null; // L: 6181
					return true; // L: 6182
				}

				if (ServerPacket.field3041 == var1.serverPacket) { // L: 6184
					var17 = var3.readUnsignedShort(); // L: 6185
					WorldMapLabelSize.method4324(var17); // L: 6186
					changedItemContainers[++field494 - 1 & 31] = var17 & 32767; // L: 6187
					var1.serverPacket = null; // L: 6188
					return true; // L: 6189
				}

				int var28;
				if (ServerPacket.field3045 == var1.serverPacket) { // L: 6191
					var17 = var3.method7562(); // L: 6192
					var5 = var3.method7416(); // L: 6193
					var6 = var17 >> 10 & 31; // L: 6194
					var25 = var17 >> 5 & 31; // L: 6195
					var8 = var17 & 31; // L: 6196
					var28 = (var25 << 11) + (var6 << 19) + (var8 << 3); // L: 6197
					Widget var76 = class130.getWidget(var5); // L: 6198
					if (var28 != var76.color) { // L: 6199
						var76.color = var28; // L: 6200
						class112.invalidateWidget(var76); // L: 6201
					}

					var1.serverPacket = null; // L: 6203
					return true; // L: 6204
				}

				if (ServerPacket.field3042 == var1.serverPacket) { // L: 6206
					var17 = var3.readUnsignedByte(); // L: 6207
					class282.forceDisconnect(var17); // L: 6208
					var1.serverPacket = null; // L: 6209
					return false; // L: 6210
				}

				byte var59;
				if (ServerPacket.field2969 == var1.serverPacket) { // L: 6212
					field503 = cycleCntr; // L: 6213
					var59 = var3.readByte(); // L: 6214
					class143 var61 = new class143(var3); // L: 6215
					ClanChannel var71;
					if (var59 >= 0) { // L: 6217
						var71 = currentClanChannels[var59];
					} else {
						var71 = InterfaceParent.guestClanChannel; // L: 6218
					}

					var61.method2957(var71); // L: 6219
					var1.serverPacket = null; // L: 6220
					return true; // L: 6221
				}

				if (ServerPacket.field3048 == var1.serverPacket) { // L: 6223
					var17 = var3.readInt(); // L: 6224
					var5 = var3.method7562(); // L: 6225
					var19 = class130.getWidget(var17); // L: 6226
					if (var19.modelType != 2 || var5 != var19.modelId) { // L: 6227
						var19.modelType = 2; // L: 6228
						var19.modelId = var5; // L: 6229
						class112.invalidateWidget(var19); // L: 6230
					}

					var1.serverPacket = null; // L: 6232
					return true; // L: 6233
				}

				if (ServerPacket.field3009 == var1.serverPacket) { // L: 6235
					var17 = var3.method7416(); // L: 6236
					var5 = var3.method7414(); // L: 6237
					if (var5 == 65535) { // L: 6238
						var5 = -1;
					}

					var6 = var3.method7418(); // L: 6239
					var53 = class130.getWidget(var6); // L: 6240
					ItemComposition var78;
					if (!var53.isIf3) { // L: 6241
						if (var5 == -1) { // L: 6242
							var53.modelType = 0; // L: 6243
							var1.serverPacket = null; // L: 6244
							return true; // L: 6245
						}

						var78 = ItemDefinition_get(var5); // L: 6247
						var53.modelType = 4; // L: 6248
						var53.modelId = var5; // L: 6249
						var53.modelAngleX = var78.xan2d; // L: 6250
						var53.modelAngleY = var78.yan2d; // L: 6251
						var53.modelZoom = var78.zoom2d * 100 / var17; // L: 6252
						class112.invalidateWidget(var53); // L: 6253
					} else {
						var53.itemId = var5; // L: 6256
						var53.itemQuantity = var17; // L: 6257
						var78 = ItemDefinition_get(var5); // L: 6258
						var53.modelAngleX = var78.xan2d; // L: 6259
						var53.modelAngleY = var78.yan2d; // L: 6260
						var53.modelAngleZ = var78.zan2d; // L: 6261
						var53.modelOffsetX = var78.offsetX2d; // L: 6262
						var53.modelOffsetY = var78.offsetY2d; // L: 6263
						var53.modelZoom = var78.zoom2d; // L: 6264
						if (var78.isStackable == 1) { // L: 6265
							var53.itemQuantityMode = 1;
						} else {
							var53.itemQuantityMode = 2; // L: 6266
						}

						if (var53.field3310 > 0) { // L: 6267
							var53.modelZoom = var53.modelZoom * 32 / var53.field3310;
						} else if (var53.rawWidth > 0) { // L: 6268
							var53.modelZoom = var53.modelZoom * 32 / var53.rawWidth;
						}

						class112.invalidateWidget(var53); // L: 6269
					}

					var1.serverPacket = null; // L: 6271
					return true; // L: 6272
				}

				if (ServerPacket.field2989 == var1.serverPacket) { // L: 6274
					if (rootInterface != -1) { // L: 6275
						DevicePcmPlayerProvider.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6276
					return true; // L: 6277
				}

				if (ServerPacket.field2976 == var1.serverPacket) { // L: 6279
					publicChatMode = var3.method7399(); // L: 6280
					tradeChatMode = var3.method7399(); // L: 6281
					var1.serverPacket = null; // L: 6282
					return true; // L: 6283
				}

				if (ServerPacket.field3038 == var1.serverPacket) { // L: 6285
					for (var17 = 0; var17 < players.length; ++var17) { // L: 6286
						if (players[var17] != null) { // L: 6287
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) { // L: 6289
						if (npcs[var17] != null) { // L: 6290
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6292
					return true; // L: 6293
				}

				if (ServerPacket.field2999 == var1.serverPacket) { // L: 6295
					var48 = var3.readStringCp1252NullTerminated(); // L: 6296
					var5 = var3.method7417(); // L: 6297
					var19 = class130.getWidget(var5); // L: 6298
					if (!var48.equals(var19.text)) { // L: 6299
						var19.text = var48; // L: 6300
						class112.invalidateWidget(var19); // L: 6301
					}

					var1.serverPacket = null; // L: 6303
					return true; // L: 6304
				}

				if (ServerPacket.field3019 == var1.serverPacket) { // L: 6306
					var48 = var3.readStringCp1252NullTerminated(); // L: 6307
					var18 = AbstractFont.escapeBrackets(ModelData0.method4273(GrandExchangeOfferUnitPriceComparator.method5755(var3))); // L: 6308
					LoginScreenAnimation.addGameMessage(6, var48, var18); // L: 6309
					var1.serverPacket = null; // L: 6310
					return true; // L: 6311
				}

				if (ServerPacket.field3025 == var1.serverPacket) { // L: 6313
					var72 = var3.readUnsignedByte() == 1; // L: 6314
					if (var72) { // L: 6315
						class140.field1626 = DirectByteArrayCopier.method5318() - var3.readLong(); // L: 6316
						class135.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6317
					} else {
						class135.grandExchangeEvents = null; // L: 6319
					}

					field652 = cycleCntr; // L: 6320
					var1.serverPacket = null; // L: 6321
					return true; // L: 6322
				}

				if (ServerPacket.field3029 == var1.serverPacket) { // L: 6324
					WorldMapSection2.method4360(); // L: 6325
					var59 = var3.readByte(); // L: 6326
					class129 var60 = new class129(var3); // L: 6327
					ClanSettings var70;
					if (var59 >= 0) { // L: 6329
						var70 = currentClanSettings[var59];
					} else {
						var70 = UserComparator7.guestClanSettings; // L: 6330
					}

					var60.method2775(var70); // L: 6331
					var1.serverPacket = null; // L: 6332
					return true; // L: 6333
				}

				boolean var55;
				if (ServerPacket.field2990 == var1.serverPacket) { // L: 6335
					var17 = var3.readUShortSmart(); // L: 6336
					var55 = var3.readUnsignedByte() == 1; // L: 6337
					var69 = ""; // L: 6338
					boolean var74 = false; // L: 6339
					if (var55) { // L: 6340
						var69 = var3.readStringCp1252NullTerminated(); // L: 6341
						if (ClanSettings.friendSystem.isIgnored(new Username(var69, VarcInt.loginType))) { // L: 6342
							var74 = true;
						}
					}

					String var77 = var3.readStringCp1252NullTerminated(); // L: 6344
					if (!var74) { // L: 6345
						LoginScreenAnimation.addGameMessage(var17, var69, var77);
					}

					var1.serverPacket = null; // L: 6346
					return true; // L: 6347
				}

				InterfaceParent var7;
				if (ServerPacket.field3004 == var1.serverPacket) { // L: 6349
					var17 = var3.readInt(); // L: 6350
					var5 = var3.readUnsignedShort(); // L: 6351
					var6 = var3.method7467(); // L: 6352
					var7 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6353
					if (var7 != null) { // L: 6354
						class127.closeInterface(var7, var5 != var7.group);
					}

					class233.method4772(var17, var5, var6); // L: 6355
					var1.serverPacket = null; // L: 6356
					return true; // L: 6357
				}

				if (ServerPacket.field3057 == var1.serverPacket) { // L: 6359
					Decimator.loadRegions(true, var1.packetBuffer); // L: 6360
					var1.serverPacket = null; // L: 6361
					return true; // L: 6362
				}

				int var15;
				String var38;
				if (ServerPacket.field2980 == var1.serverPacket) { // L: 6364
					var59 = var3.readByte(); // L: 6365
					var18 = var3.readStringCp1252NullTerminated(); // L: 6366
					long var31 = (long)var3.readUnsignedShort(); // L: 6367
					long var33 = (long)var3.readMedium(); // L: 6368
					PlayerType var75 = (PlayerType)class140.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte()); // L: 6369
					long var35 = (var31 << 32) + var33; // L: 6370
					boolean var56 = false; // L: 6371
					ClanChannel var37 = null; // L: 6372
					var37 = var59 >= 0 ? currentClanChannels[var59] : InterfaceParent.guestClanChannel; // L: 6374
					if (var37 == null) { // L: 6375
						var56 = true; // L: 6376
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var75.isUser && ClanSettings.friendSystem.isIgnored(new Username(var18, VarcInt.loginType))) { // L: 6385 6386
									var56 = true;
								}
								break;
							}

							if (var35 == crossWorldMessageIds[var15]) { // L: 6380
								var56 = true; // L: 6381
								break; // L: 6382
							}

							++var15; // L: 6379
						}
					}

					if (!var56) { // L: 6389
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var35; // L: 6390
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6391
						var38 = AbstractFont.escapeBrackets(GrandExchangeOfferUnitPriceComparator.method5755(var3)); // L: 6392
						int var16 = var59 >= 0 ? 41 : 44; // L: 6393
						if (var75.modIcon != -1) { // L: 6394
							GraphicsObject.addChatMessage(var16, WorldMapSectionType.method4720(var75.modIcon) + var18, var38, var37.name);
						} else {
							GraphicsObject.addChatMessage(var16, var18, var38, var37.name); // L: 6395
						}
					}

					var1.serverPacket = null; // L: 6397
					return true; // L: 6398
				}

				if (ServerPacket.field2968 == var1.serverPacket) { // L: 6400
					class33.field243 = var3.readUnsignedByte(); // L: 6401
					Canvas.field157 = var3.method7398(); // L: 6402

					for (var17 = class33.field243; var17 < class33.field243 + 8; ++var17) { // L: 6403
						for (var5 = Canvas.field157; var5 < Canvas.field157 + 8; ++var5) { // L: 6404
							if (groundItems[SoundSystem.Client_plane][var17][var5] != null) { // L: 6405
								groundItems[SoundSystem.Client_plane][var17][var5] = null; // L: 6406
								StudioGame.updateItemPile(var17, var5); // L: 6407
							}
						}
					}

					for (PendingSpawn var49 = (PendingSpawn)pendingSpawns.last(); var49 != null; var49 = (PendingSpawn)pendingSpawns.previous()) { // L: 6411 6412 6414
						if (var49.x >= class33.field243 && var49.x < class33.field243 + 8 && var49.y >= Canvas.field157 && var49.y < Canvas.field157 + 8 && var49.plane == SoundSystem.Client_plane) { // L: 6413
							var49.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6416
					return true; // L: 6417
				}

				if (ServerPacket.field2972 == var1.serverPacket) { // L: 6419
					HealthBarUpdate.field1178 = true; // L: 6420
					class368.updateNpcs(false, var3); // L: 6421
					var1.serverPacket = null; // L: 6422
					return true; // L: 6423
				}

				if (ServerPacket.field2993 == var1.serverPacket) { // L: 6425
					minimapState = var3.readUnsignedByte(); // L: 6426
					var1.serverPacket = null; // L: 6427
					return true; // L: 6428
				}

				if (ServerPacket.field2971 == var1.serverPacket) { // L: 6430
					class368.updateNpcs(true, var3); // L: 6431
					var1.serverPacket = null; // L: 6432
					return true; // L: 6433
				}

				if (ServerPacket.field3039 == var1.serverPacket) { // L: 6435
					destinationX = var3.readUnsignedByte(); // L: 6436
					if (destinationX == 255) { // L: 6437
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6438
					if (destinationY == 255) { // L: 6439
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6440
					return true; // L: 6441
				}

				if (ServerPacket.field3001 == var1.serverPacket) { // L: 6443
					class123.method2721(var3.readStringCp1252NullTerminated()); // L: 6444
					var1.serverPacket = null; // L: 6445
					return true; // L: 6446
				}

				int var39;
				if (ServerPacket.field3036 == var1.serverPacket) { // L: 6448
					isCameraLocked = true; // L: 6449
					field755 = false; // L: 6450
					class7.field33 = var3.readUnsignedByte(); // L: 6451
					class21.field119 = var3.readUnsignedByte(); // L: 6452
					class334.field4057 = var3.readUnsignedShort(); // L: 6453
					WorldMapSectionType.field2723 = var3.readUnsignedByte(); // L: 6454
					WallDecoration.field2573 = var3.readUnsignedByte(); // L: 6455
					if (WallDecoration.field2573 >= 100) { // L: 6456
						var17 = class7.field33 * 128 + 64; // L: 6457
						var5 = class21.field119 * 128 + 64; // L: 6458
						var6 = class92.getTileHeight(var17, var5, SoundSystem.Client_plane) - class334.field4057; // L: 6459
						var25 = var17 - class414.cameraX; // L: 6460
						var8 = var6 - WorldMapDecoration.cameraY; // L: 6461
						var28 = var5 - GrandExchangeOfferOwnWorldComparator.cameraZ; // L: 6462
						var39 = (int)Math.sqrt((double)(var28 * var28 + var25 * var25)); // L: 6463
						class7.cameraPitch = (int)(Math.atan2((double)var8, (double)var39) * 325.9490051269531D) & 2047; // L: 6464
						class7.cameraYaw = (int)(Math.atan2((double)var25, (double)var28) * -325.9490051269531D) & 2047; // L: 6465
						if (class7.cameraPitch < 128) { // L: 6466
							class7.cameraPitch = 128;
						}

						if (class7.cameraPitch > 383) { // L: 6467
							class7.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6469
					return true; // L: 6470
				}

				if (ServerPacket.field3047 == var1.serverPacket) { // L: 6472
					var17 = var3.readInt(); // L: 6473
					var55 = var3.method7467() == 1; // L: 6474
					var19 = class130.getWidget(var17); // L: 6475
					if (var55 != var19.isHidden) { // L: 6476
						var19.isHidden = var55; // L: 6477
						class112.invalidateWidget(var19); // L: 6478
					}

					var1.serverPacket = null; // L: 6480
					return true; // L: 6481
				}

				if (ServerPacket.field3010 == var1.serverPacket) { // L: 6483
					var17 = var3.method7485(); // L: 6484
					var5 = var3.method7409(); // L: 6485
					var6 = var3.method7418(); // L: 6486
					var53 = class130.getWidget(var6); // L: 6487
					if (var17 != var53.rawX || var5 != var53.rawY || var53.xAlignment != 0 || var53.yAlignment != 0) { // L: 6488
						var53.rawX = var17; // L: 6489
						var53.rawY = var5; // L: 6490
						var53.xAlignment = 0; // L: 6491
						var53.yAlignment = 0; // L: 6492
						class112.invalidateWidget(var53); // L: 6493
						this.alignWidget(var53); // L: 6494
						if (var53.type == 0) { // L: 6495
							PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var53, false);
						}
					}

					var1.serverPacket = null; // L: 6497
					return true; // L: 6498
				}

				if (ServerPacket.field2985 == var1.serverPacket) { // L: 6500
					Decimator.loadRegions(false, var1.packetBuffer); // L: 6501
					var1.serverPacket = null; // L: 6502
					return true; // L: 6503
				}

				if (ServerPacket.field2994 == var1.serverPacket) { // L: 6505
					UserComparator7.method2463(class255.field2945); // L: 6506
					var1.serverPacket = null; // L: 6507
					return true; // L: 6508
				}

				if (ServerPacket.field3021 == var1.serverPacket) { // L: 6510
					var17 = var3.readInt(); // L: 6511
					var5 = var3.readUnsignedShort(); // L: 6512
					if (var17 < -70000) { // L: 6513
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6515
						var19 = class130.getWidget(var17);
					} else {
						var19 = null; // L: 6516
					}

					for (; var3.offset < var1.serverPacketLength; WorldMapElement.itemContainerSetItem(var5, var25, var8 - 1, var28)) { // L: 6517 6531
						var25 = var3.readUShortSmart(); // L: 6518
						var8 = var3.readUnsignedShort(); // L: 6519
						var28 = 0; // L: 6520
						if (var8 != 0) { // L: 6521
							var28 = var3.readUnsignedByte(); // L: 6522
							if (var28 == 255) { // L: 6523
								var28 = var3.readInt();
							}
						}

						if (var19 != null && var25 >= 0 && var25 < var19.itemIds.length) { // L: 6525 6526
							var19.itemIds[var25] = var8; // L: 6527
							var19.itemQuantities[var25] = var28; // L: 6528
						}
					}

					if (var19 != null) { // L: 6533
						class112.invalidateWidget(var19);
					}

					WorldMapAreaData.method4855(); // L: 6534
					changedItemContainers[++field494 - 1 & 31] = var5 & 32767; // L: 6535
					var1.serverPacket = null; // L: 6536
					return true; // L: 6537
				}

				Widget var30;
				if (ServerPacket.field3008 == var1.serverPacket) { // L: 6539
					var17 = var3.readInt(); // L: 6540
					var5 = var3.method7417(); // L: 6541
					InterfaceParent var63 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6542
					var7 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6543
					if (var7 != null) { // L: 6544
						class127.closeInterface(var7, var63 == null || var7.group != var63.group);
					}

					if (var63 != null) { // L: 6545
						var63.remove(); // L: 6546
						interfaceParents.put(var63, (long)var5); // L: 6547
					}

					var30 = class130.getWidget(var17); // L: 6549
					if (var30 != null) { // L: 6550
						class112.invalidateWidget(var30);
					}

					var30 = class130.getWidget(var5); // L: 6551
					if (var30 != null) { // L: 6552
						class112.invalidateWidget(var30); // L: 6553
						PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var30.id >>> 16], var30, true); // L: 6554
					}

					if (rootInterface != -1) { // L: 6556
						DevicePcmPlayerProvider.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6557
					return true; // L: 6558
				}

				if (ServerPacket.field3040 == var1.serverPacket) { // L: 6560
					class65.privateChatMode = class231.method4764(var3.readUnsignedByte()); // L: 6561
					var1.serverPacket = null; // L: 6562
					return true; // L: 6563
				}

				if (ServerPacket.field3020 == var1.serverPacket) { // L: 6565
					if (class67.friendsChat != null) { // L: 6566
						class67.friendsChat.method6299(var3); // L: 6567
					}

					class131.method2793(); // L: 6569
					var1.serverPacket = null; // L: 6570
					return true; // L: 6571
				}

				if (ServerPacket.field2973 == var1.serverPacket) { // L: 6573
					var17 = var3.readInt(); // L: 6574
					var5 = var3.readUnsignedShort(); // L: 6575
					if (var17 < -70000) { // L: 6576
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6578
						var19 = class130.getWidget(var17);
					} else {
						var19 = null; // L: 6579
					}

					if (var19 != null) { // L: 6580
						for (var25 = 0; var25 < var19.itemIds.length; ++var25) { // L: 6581
							var19.itemIds[var25] = 0; // L: 6582
							var19.itemQuantities[var25] = 0; // L: 6583
						}
					}

					Ignored.clearItemContainer(var5); // L: 6586
					var25 = var3.readUnsignedShort(); // L: 6587

					for (var8 = 0; var8 < var25; ++var8) { // L: 6588
						var28 = var3.method7414(); // L: 6589
						var39 = var3.method7467(); // L: 6590
						if (var39 == 255) { // L: 6591
							var39 = var3.method7418();
						}

						if (var19 != null && var8 < var19.itemIds.length) { // L: 6592 6593
							var19.itemIds[var8] = var28; // L: 6594
							var19.itemQuantities[var8] = var39; // L: 6595
						}

						WorldMapElement.itemContainerSetItem(var5, var8, var28 - 1, var39); // L: 6598
					}

					if (var19 != null) { // L: 6600
						class112.invalidateWidget(var19);
					}

					WorldMapAreaData.method4855(); // L: 6601
					changedItemContainers[++field494 - 1 & 31] = var5 & 32767; // L: 6602
					var1.serverPacket = null; // L: 6603
					return true; // L: 6604
				}

				if (ServerPacket.field2997 == var1.serverPacket) { // L: 6606
					var17 = var3.readUnsignedByte(); // L: 6607
					if (var3.readUnsignedByte() == 0) { // L: 6608
						grandExchangeOffers[var17] = new GrandExchangeOffer(); // L: 6609
						var3.offset += 18; // L: 6610
					} else {
						--var3.offset; // L: 6613
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false); // L: 6614
					}

					field703 = cycleCntr; // L: 6616
					var1.serverPacket = null; // L: 6617
					return true; // L: 6618
				}

				if (ServerPacket.field2986 == var1.serverPacket) { // L: 6620
					UserComparator7.method2463(class255.field2941); // L: 6621
					var1.serverPacket = null; // L: 6622
					return true; // L: 6623
				}

				if (ServerPacket.field2974 == var1.serverPacket) { // L: 6625
					UserComparator7.method2463(class255.field2946); // L: 6626
					var1.serverPacket = null; // L: 6627
					return true; // L: 6628
				}

				if (ServerPacket.field3023 == var1.serverPacket) { // L: 6630
					var17 = var3.readInt(); // L: 6631
					var5 = var3.readInt(); // L: 6632
					var6 = BuddyRankComparator.getGcDuration(); // L: 6633
					PacketBufferNode var52 = class135.getPacketBufferNode(ClientPacket.field2890, packetWriter.isaacCipher); // L: 6635
					var52.packetBuffer.method7486(var17); // L: 6636
					var52.packetBuffer.method7486(var5); // L: 6637
					var52.packetBuffer.method7458(var6); // L: 6638
					var52.packetBuffer.method7370(GameEngine.fps); // L: 6639
					packetWriter.addNode(var52); // L: 6640
					var1.serverPacket = null; // L: 6641
					return true; // L: 6642
				}

				if (ServerPacket.field3013 == var1.serverPacket) { // L: 6644
					UserComparator7.method2463(class255.field2943); // L: 6645
					var1.serverPacket = null; // L: 6646
					return true; // L: 6647
				}

				if (ServerPacket.field3043 == var1.serverPacket) { // L: 6649
					class133.logOut(); // L: 6650
					var1.serverPacket = null; // L: 6651
					return false; // L: 6652
				}

				if (ServerPacket.field3014 == var1.serverPacket) { // L: 6654
					UserComparator7.method2463(class255.field2944); // L: 6655
					var1.serverPacket = null; // L: 6656
					return true; // L: 6657
				}

				if (ServerPacket.field3000 == var1.serverPacket) { // L: 6659
					ClanSettings.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6660
					field600 = cycleCntr; // L: 6661
					var1.serverPacket = null; // L: 6662
					return true; // L: 6663
				}

				if (ServerPacket.field2988 == var1.serverPacket) { // L: 6665
					WorldMapAreaData.method4855(); // L: 6666
					weight = var3.readShort(); // L: 6667
					field705 = cycleCntr; // L: 6668
					var1.serverPacket = null; // L: 6669
					return true; // L: 6670
				}

				if (ServerPacket.field3044 == var1.serverPacket) { // L: 6672
					WorldMapAreaData.method4855(); // L: 6673
					runEnergy = var3.readUnsignedByte(); // L: 6674
					field705 = cycleCntr; // L: 6675
					var1.serverPacket = null; // L: 6676
					return true; // L: 6677
				}

				if (ServerPacket.field2965 == var1.serverPacket) { // L: 6679
					var17 = var3.readUnsignedShort(); // L: 6680
					var5 = var3.method7417(); // L: 6681
					var6 = var3.readUnsignedShort(); // L: 6682
					var25 = var3.method7414(); // L: 6683
					var30 = class130.getWidget(var5); // L: 6684
					if (var25 != var30.modelAngleX || var17 != var30.modelAngleY || var6 != var30.modelZoom) { // L: 6685
						var30.modelAngleX = var25; // L: 6686
						var30.modelAngleY = var17; // L: 6687
						var30.modelZoom = var6; // L: 6688
						class112.invalidateWidget(var30); // L: 6689
					}

					var1.serverPacket = null; // L: 6691
					return true; // L: 6692
				}

				long var40;
				if (ServerPacket.field3055 == var1.serverPacket) { // L: 6694
					var48 = var3.readStringCp1252NullTerminated(); // L: 6695
					var20 = var3.readLong(); // L: 6696
					var22 = (long)var3.readUnsignedShort(); // L: 6697
					var26 = (long)var3.readMedium(); // L: 6698
					PlayerType var11 = (PlayerType)class140.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte()); // L: 6699
					var40 = var26 + (var22 << 32); // L: 6700
					boolean var57 = false; // L: 6701

					for (var15 = 0; var15 < 100; ++var15) { // L: 6702
						if (crossWorldMessageIds[var15] == var40) { // L: 6703
							var57 = true; // L: 6704
							break; // L: 6705
						}
					}

					if (var11.isUser && ClanSettings.friendSystem.isIgnored(new Username(var48, VarcInt.loginType))) { // L: 6708 6709
						var57 = true;
					}

					if (!var57 && field658 == 0) { // L: 6711
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var40; // L: 6712
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6713
						var38 = AbstractFont.escapeBrackets(ModelData0.method4273(GrandExchangeOfferUnitPriceComparator.method5755(var3))); // L: 6714
						if (var11.modIcon != -1) { // L: 6715
							GraphicsObject.addChatMessage(9, WorldMapSectionType.method4720(var11.modIcon) + var48, var38, class335.base37DecodeLong(var20));
						} else {
							GraphicsObject.addChatMessage(9, var48, var38, class335.base37DecodeLong(var20)); // L: 6716
						}
					}

					var1.serverPacket = null; // L: 6718
					return true; // L: 6719
				}

				if (ServerPacket.field2987 == var1.serverPacket) { // L: 6721
					if (var1.serverPacketLength == 0) { // L: 6722
						class67.friendsChat = null; // L: 6723
					} else {
						if (class67.friendsChat == null) { // L: 6726
							class67.friendsChat = new FriendsChat(VarcInt.loginType, class414.client); // L: 6727
						}

						class67.friendsChat.readUpdate(var3); // L: 6729
					}

					class131.method2793(); // L: 6731
					var1.serverPacket = null; // L: 6732
					return true; // L: 6733
				}

				if (ServerPacket.field3007 == var1.serverPacket) { // L: 6735
					if (class221.field2680 == null) { // L: 6736
						class221.field2680 = new class375(FloorOverlayDefinition.HitSplatDefinition_cached);
					}

					class428 var47 = FloorOverlayDefinition.HitSplatDefinition_cached.method6784(var3); // L: 6737
					class221.field2680.field4268.vmethod7140(var47.field4576, var47.field4575); // L: 6738
					field696[++field697 - 1 & 31] = var47.field4576; // L: 6739
					var1.serverPacket = null; // L: 6740
					return true; // L: 6741
				}

				if (ServerPacket.field3003 == var1.serverPacket) { // L: 6743
					var17 = var3.offset + var1.serverPacketLength; // L: 6744
					var5 = var3.readUnsignedShort(); // L: 6745
					var6 = var3.readUnsignedShort(); // L: 6746
					if (var5 != rootInterface) { // L: 6747
						rootInterface = var5; // L: 6748
						this.resizeRoot(false); // L: 6749
						class336.Widget_resetModelFrames(rootInterface); // L: 6750
						Occluder.runWidgetOnLoadListener(rootInterface); // L: 6751

						for (var25 = 0; var25 < 100; ++var25) { // L: 6752
							field713[var25] = true;
						}
					}

					InterfaceParent var29;
					for (; var6-- > 0; var29.field1040 = true) { // L: 6754 6764
						var25 = var3.readInt(); // L: 6755
						var8 = var3.readUnsignedShort(); // L: 6756
						var28 = var3.readUnsignedByte(); // L: 6757
						var29 = (InterfaceParent)interfaceParents.get((long)var25); // L: 6758
						if (var29 != null && var8 != var29.group) { // L: 6759
							class127.closeInterface(var29, true); // L: 6760
							var29 = null; // L: 6761
						}

						if (var29 == null) { // L: 6763
							var29 = class233.method4772(var25, var8, var28);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) { // L: 6766
						if (var7.field1040) { // L: 6767
							var7.field1040 = false;
						} else {
							class127.closeInterface(var7, true); // L: 6769
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6772

					while (var3.offset < var17) { // L: 6773
						var25 = var3.readInt(); // L: 6774
						var8 = var3.readUnsignedShort(); // L: 6775
						var28 = var3.readUnsignedShort(); // L: 6776
						var39 = var3.readInt(); // L: 6777

						for (int var79 = var8; var79 <= var28; ++var79) { // L: 6778
							var40 = ((long)var25 << 32) + (long)var79; // L: 6779
							widgetFlags.put(new IntegerNode(var39), var40); // L: 6780
						}
					}

					var1.serverPacket = null; // L: 6783
					return true; // L: 6784
				}

				if (ServerPacket.field3017 == var1.serverPacket) { // L: 6786
					HealthBarUpdate.field1178 = true; // L: 6787
					class368.updateNpcs(true, var3); // L: 6788
					var1.serverPacket = null; // L: 6789
					return true; // L: 6790
				}

				if (ServerPacket.field3030 == var1.serverPacket) { // L: 6792
					var59 = var3.readByte(); // L: 6793
					var20 = (long)var3.readUnsignedShort(); // L: 6794
					var22 = (long)var3.readMedium(); // L: 6795
					var26 = var22 + (var20 << 32); // L: 6796
					boolean var42 = false; // L: 6797
					ClanChannel var43 = var59 >= 0 ? currentClanChannels[var59] : InterfaceParent.guestClanChannel; // L: 6798
					if (var43 == null) { // L: 6799
						var42 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6801
							if (crossWorldMessageIds[var13] == var26) { // L: 6802
								var42 = true; // L: 6803
								break; // L: 6804
							}
						}
					}

					if (!var42) { // L: 6808
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var26; // L: 6809
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6810
						var24 = GrandExchangeOfferUnitPriceComparator.method5755(var3); // L: 6811
						int var14 = var59 >= 0 ? 43 : 46; // L: 6812
						GraphicsObject.addChatMessage(var14, "", var24, var43.name); // L: 6813
					}

					var1.serverPacket = null; // L: 6815
					return true; // L: 6816
				}

				if (ServerPacket.field2981 == var1.serverPacket) { // L: 6818
					var17 = var3.method7408(); // L: 6819
					rootInterface = var17; // L: 6820
					this.resizeRoot(false); // L: 6821
					class336.Widget_resetModelFrames(var17); // L: 6822
					Occluder.runWidgetOnLoadListener(rootInterface); // L: 6823

					for (var5 = 0; var5 < 100; ++var5) { // L: 6824
						field713[var5] = true;
					}

					var1.serverPacket = null; // L: 6825
					return true; // L: 6826
				}

				if (ServerPacket.field2992 == var1.serverPacket) { // L: 6828
					field503 = cycleCntr; // L: 6829
					var59 = var3.readByte(); // L: 6830
					if (var1.serverPacketLength == 1) { // L: 6831
						if (var59 >= 0) { // L: 6832
							currentClanChannels[var59] = null;
						} else {
							InterfaceParent.guestClanChannel = null; // L: 6833
						}

						var1.serverPacket = null; // L: 6834
						return true; // L: 6835
					}

					if (var59 >= 0) { // L: 6837
						currentClanChannels[var59] = new ClanChannel(var3); // L: 6838
					} else {
						InterfaceParent.guestClanChannel = new ClanChannel(var3); // L: 6841
					}

					var1.serverPacket = null; // L: 6843
					return true; // L: 6844
				}

				if (ServerPacket.field3053 == var1.serverPacket) { // L: 6846
					UserComparator7.method2463(class255.field2942); // L: 6847
					var1.serverPacket = null; // L: 6848
					return true; // L: 6849
				}

				if (ServerPacket.field2983 == var1.serverPacket) { // L: 6851
					RouteStrategy.readReflectionCheck(var3, var1.serverPacketLength); // L: 6852
					var1.serverPacket = null; // L: 6853
					return true; // L: 6854
				}

				if (ServerPacket.field3035 == var1.serverPacket) { // L: 6856
					isCameraLocked = true; // L: 6857
					field755 = false; // L: 6858
					Message.field478 = var3.readUnsignedByte(); // L: 6859
					class12.field75 = var3.readUnsignedByte(); // L: 6860
					class121.field1492 = var3.readUnsignedShort(); // L: 6861
					SceneTilePaint.field2543 = var3.readUnsignedByte(); // L: 6862
					class4.field17 = var3.readUnsignedByte(); // L: 6863
					if (class4.field17 >= 100) { // L: 6864
						class414.cameraX = Message.field478 * 128 + 64; // L: 6865
						GrandExchangeOfferOwnWorldComparator.cameraZ = class12.field75 * 128 + 64; // L: 6866
						WorldMapDecoration.cameraY = class92.getTileHeight(class414.cameraX, GrandExchangeOfferOwnWorldComparator.cameraZ, SoundSystem.Client_plane) - class121.field1492; // L: 6867
					}

					var1.serverPacket = null; // L: 6869
					return true; // L: 6870
				}

				if (ServerPacket.field2966 == var1.serverPacket) { // L: 6872
					World var46 = new World(); // L: 6873
					var46.host = var3.readStringCp1252NullTerminated(); // L: 6874
					var46.id = var3.readUnsignedShort(); // L: 6875
					var5 = var3.readInt(); // L: 6876
					var46.properties = var5; // L: 6877
					class111.updateGameState(45); // L: 6878
					var2.close(); // L: 6879
					var2 = null; // L: 6880
					InterfaceParent.changeWorld(var46); // L: 6881
					var1.serverPacket = null; // L: 6882
					return false; // L: 6883
				}

				if (ServerPacket.field3002 == var1.serverPacket && isCameraLocked) { // L: 6885 6886
					field755 = true; // L: 6887
					SceneTilePaint.field2543 = var3.readUnsignedByte(); // L: 6888
					class4.field17 = var3.readUnsignedByte(); // L: 6889
					WorldMapSectionType.field2723 = var3.readUnsignedByte(); // L: 6890
					WallDecoration.field2573 = var3.readUnsignedByte(); // L: 6891

					for (var17 = 0; var17 < 5; ++var17) { // L: 6892
						field753[var17] = false;
					}

					var1.serverPacket = null; // L: 6893
					return true; // L: 6894
				}

				if (ServerPacket.field2984 == var1.serverPacket) { // L: 6897
					WorldMapSection2.method4360(); // L: 6898
					var59 = var3.readByte(); // L: 6899
					if (var1.serverPacketLength == 1) { // L: 6900
						if (var59 >= 0) { // L: 6901
							currentClanSettings[var59] = null;
						} else {
							UserComparator7.guestClanSettings = null; // L: 6902
						}

						var1.serverPacket = null; // L: 6903
						return true; // L: 6904
					}

					if (var59 >= 0) { // L: 6906
						currentClanSettings[var59] = new ClanSettings(var3); // L: 6907
					} else {
						UserComparator7.guestClanSettings = new ClanSettings(var3); // L: 6910
					}

					var1.serverPacket = null; // L: 6912
					return true; // L: 6913
				}

				if (ServerPacket.field2979 == var1.serverPacket) { // L: 6915
					var17 = var3.method7418(); // L: 6916
					var5 = var3.method7408(); // L: 6917
					Varps.Varps_temp[var5] = var17; // L: 6918
					if (Varps.Varps_main[var5] != var17) { // L: 6919
						Varps.Varps_main[var5] = var17; // L: 6920
					}

					NetFileRequest.changeGameOptions(var5); // L: 6922
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6923
					var1.serverPacket = null; // L: 6924
					return true; // L: 6925
				}

				if (ServerPacket.field3058 == var1.serverPacket) { // L: 6927
					var17 = var3.readUnsignedShort(); // L: 6928
					byte var50 = var3.method7401(); // L: 6929
					Varps.Varps_temp[var17] = var50; // L: 6930
					if (Varps.Varps_main[var17] != var50) { // L: 6931
						Varps.Varps_main[var17] = var50; // L: 6932
					}

					NetFileRequest.changeGameOptions(var17); // L: 6934
					changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 6935
					var1.serverPacket = null; // L: 6936
					return true; // L: 6937
				}

				if (ServerPacket.field3031 == var1.serverPacket) { // L: 6939
					rebootTimer = var3.method7408() * 30; // L: 6940
					field705 = cycleCntr; // L: 6941
					var1.serverPacket = null; // L: 6942
					return true; // L: 6943
				}

				if (ServerPacket.field3006 == var1.serverPacket) { // L: 6945
					var17 = var3.readUnsignedByte(); // L: 6946
					var5 = var3.readUnsignedByte(); // L: 6947
					var6 = var3.readUnsignedByte(); // L: 6948
					var25 = var3.readUnsignedByte(); // L: 6949
					field753[var17] = true; // L: 6950
					field754[var17] = var5; // L: 6951
					field733[var17] = var6; // L: 6952
					field500[var17] = var25; // L: 6953
					field757[var17] = 0; // L: 6954
					var1.serverPacket = null; // L: 6955
					return true; // L: 6956
				}

				if (ServerPacket.field3037 == var1.serverPacket) { // L: 6958
					class33.field243 = var3.method7467(); // L: 6959
					Canvas.field157 = var3.method7399(); // L: 6960
					var1.serverPacket = null; // L: 6961
					return true; // L: 6962
				}

				if (ServerPacket.field2991 == var1.serverPacket) { // L: 6964
					var17 = var3.readInt(); // L: 6965
					if (var17 != field513) { // L: 6966
						field513 = var17; // L: 6967
						class290.method5477(); // L: 6968
					}

					var1.serverPacket = null; // L: 6970
					return true; // L: 6971
				}

				FloorDecoration.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 510830107 * 1275315219 : -1) + "," + (var1.field1326 != null ? var1.field1326.id * 510830107 * 1275315219 : -1) + "," + (var1.field1327 != null ? var1.field1327.id * 510830107 * 1275315219 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 6973
				class133.logOut(); // L: 6974
			} catch (IOException var44) { // L: 6976
				class17.method258(); // L: 6977
			} catch (Exception var45) {
				var18 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 510830107 * 1275315219 : -1) + "," + (var1.field1326 != null ? var1.field1326.id * 510830107 * 1275315219 : -1) + "," + (var1.field1327 != null ? var1.field1327.id * 510830107 * 1275315219 : -1) + "," + var1.serverPacketLength + "," + (WorldMapSprite.localPlayer.pathX[0] + Canvas.baseX) + "," + (WorldMapSprite.localPlayer.pathY[0] + class118.baseY) + ","; // L: 6980

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 6981
					var18 = var18 + var3.array[var6] + ",";
				}

				FloorDecoration.RunException_sendStackTrace(var18, var45); // L: 6982
				class133.logOut(); // L: 6983
			}

			return true; // L: 6985
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-215127232"
	)
	@Export("menu")
	final void menu() {
		GrandExchangeEvents.incrementMenuEntries(); // L: 8170
		if (class20.dragInventoryWidget == null) { // L: 8171
			if (clickedWidget == null) { // L: 8172
				int var1 = MouseHandler.MouseHandler_lastButton; // L: 8173
				int var2;
				int var4;
				int var5;
				int var6;
				int var9;
				int var14;
				if (isMenuOpen) { // L: 8174
					int var3;
					if (var1 != 1 && (class370.mouseCam || var1 != 4)) { // L: 8175
						var2 = MouseHandler.MouseHandler_x; // L: 8176
						var3 = MouseHandler.MouseHandler_y; // L: 8177
						if (var2 < Projectile.menuX - 10 || var2 > Calendar.menuWidth + Projectile.menuX + 10 || var3 < ReflectionCheck.menuY - 10 || var3 > ReflectionCheck.menuY + ScriptFrame.menuHeight + 10) { // L: 8178
							isMenuOpen = false; // L: 8179
							SceneTilePaint.method4268(Projectile.menuX, ReflectionCheck.menuY, Calendar.menuWidth, ScriptFrame.menuHeight); // L: 8180
						}
					}

					if (var1 == 1 || !class370.mouseCam && var1 == 4) { // L: 8183
						var2 = Projectile.menuX; // L: 8184
						var3 = ReflectionCheck.menuY; // L: 8185
						var4 = Calendar.menuWidth; // L: 8186
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8187
						var6 = MouseHandler.MouseHandler_lastPressedY; // L: 8188
						var14 = -1; // L: 8189

						int var17;
						for (var17 = 0; var17 < menuOptionsCount; ++var17) { // L: 8190
							var9 = var3 + (menuOptionsCount - 1 - var17) * 15 + 31; // L: 8191
							if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) { // L: 8192
								var14 = var17;
							}
						}

						if (var14 != -1 && var14 >= 0) { // L: 8194 8195
							var17 = menuArguments1[var14]; // L: 8196
							var9 = menuArguments2[var14]; // L: 8197
							int var10 = menuOpcodes[var14]; // L: 8198
							int var11 = menuIdentifiers[var14]; // L: 8199
							String var12 = menuActions[var14]; // L: 8200
							String var13 = menuTargets[var14]; // L: 8201
							class18.menuAction(var17, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8202
						}

						isMenuOpen = false; // L: 8204
						SceneTilePaint.method4268(Projectile.menuX, ReflectionCheck.menuY, Calendar.menuWidth, ScriptFrame.menuHeight); // L: 8205
					}
				} else {
					var2 = menuOptionsCount - 1; // L: 8211
					if ((var1 == 1 || !class370.mouseCam && var1 == 4) && var2 >= 0) { // L: 8214
						var4 = menuOpcodes[var2]; // L: 8215
						if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) { // L: 8216
							label238: {
								var5 = menuArguments1[var2]; // L: 8217
								var6 = menuArguments2[var2]; // L: 8218
								Widget var7 = class130.getWidget(var6); // L: 8219
								var9 = Language.getWidgetFlags(var7); // L: 8221
								boolean var8 = (var9 >> 28 & 1) != 0; // L: 8223
								if (!var8) { // L: 8225
									Object var10000 = null;
									if (!HorizontalAlignment.method3275(Language.getWidgetFlags(var7))) {
										break label238;
									}
								}

								if (class20.dragInventoryWidget != null && !field616 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8226 8227
									Tiles.method2054(draggedWidgetX, draggedWidgetY); // L: 8228
								}

								field616 = false; // L: 8231
								itemDragDuration = 0; // L: 8232
								if (class20.dragInventoryWidget != null) { // L: 8233
									class112.invalidateWidget(class20.dragInventoryWidget);
								}

								class20.dragInventoryWidget = class130.getWidget(var6); // L: 8234
								dragItemSlotSource = var5; // L: 8235
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8236
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8237
								if (var2 >= 0) { // L: 8238
									ScriptFrame.method1076(var2);
								}

								class112.invalidateWidget(class20.dragInventoryWidget); // L: 8239
								return; // L: 8240
							}
						}
					}

					if ((var1 == 1 || !class370.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8244 8245
						var1 = 2; // L: 8246
					}

					if ((var1 == 1 || !class370.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8249 8251
						var4 = menuArguments1[var2]; // L: 8252
						var5 = menuArguments2[var2]; // L: 8253
						var6 = menuOpcodes[var2]; // L: 8254
						var14 = menuIdentifiers[var2]; // L: 8255
						String var15 = menuActions[var2]; // L: 8256
						String var16 = menuTargets[var2]; // L: 8257
						class18.menuAction(var4, var5, var6, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8258
					}

					if (var1 == 2 && menuOptionsCount > 0) { // L: 8261
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 8263

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-100310681"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 8268
		boolean var3 = leftClickOpensMenu == 1 && menuOptionsCount > 2; // L: 8271
		if (!var3) { // L: 8272
			boolean var4;
			if (var1 < 0) { // L: 8275
				var4 = false; // L: 8276
			} else {
				int var5 = menuOpcodes[var1]; // L: 8279
				if (var5 >= 2000) {
					var5 -= 2000; // L: 8280
				}

				if (var5 == 1007) { // L: 8281
					var4 = true; // L: 8282
				} else {
					var4 = false; // L: 8285
				}
			}

			var3 = var4; // L: 8287
		}

		return var3 && !menuShiftClick[var1]; // L: 8289
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "337278524"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		Interpreter.method1875(var1, var2); // L: 8293
		var1 -= viewportOffsetX; // L: 8294
		var2 -= viewportOffsetY; // L: 8295
		Decimator.scene.menuOpen(SoundSystem.Client_plane, var1, var2, false); // L: 8296
		isMenuOpen = true; // L: 8297
	} // L: 8298

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "26"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10274
		int var3 = DirectByteArrayCopier.canvasWidth; // L: 10275
		int var4 = NPC.canvasHeight; // L: 10276
		if (class13.loadInterface(var2)) { // L: 10278
			class21.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10279
		}

	} // L: 10281

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I)V",
		garbageValue = "-1480251945"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class130.getWidget(var1.parentId); // L: 10284
		int var3;
		int var4;
		if (var2 == null) { // L: 10287
			var3 = DirectByteArrayCopier.canvasWidth; // L: 10288
			var4 = NPC.canvasHeight; // L: 10289
		} else {
			var3 = var2.width; // L: 10292
			var4 = var2.height; // L: 10293
		}

		class141.alignWidgetSize(var1, var3, var4, false); // L: 10295
		NetCache.alignWidgetPosition(var1, var3, var4); // L: 10296
	} // L: 10297

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1701477601"
	)
	final void method1149() {
		class112.invalidateWidget(clickedWidget); // L: 11332
		++ByteArrayPool.widgetDragDuration; // L: 11333
		if (field648 && field682) { // L: 11334
			int var1 = MouseHandler.MouseHandler_x; // L: 11340
			int var2 = MouseHandler.MouseHandler_y; // L: 11341
			var1 -= widgetClickX; // L: 11342
			var2 -= widgetClickY; // L: 11343
			if (var1 < field606) { // L: 11344
				var1 = field606;
			}

			if (var1 + clickedWidget.width > field606 + clickedWidgetParent.width) { // L: 11345
				var1 = field606 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field561) { // L: 11346
				var2 = field561;
			}

			if (var2 + clickedWidget.height > field561 + clickedWidgetParent.height) { // L: 11347
				var2 = field561 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field686; // L: 11348
			int var4 = var2 - field687; // L: 11349
			int var5 = clickedWidget.dragZoneSize; // L: 11350
			if (ByteArrayPool.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11351 11352
				isDraggingWidget = true; // L: 11353
			}

			int var6 = var1 - field606 + clickedWidgetParent.scrollX; // L: 11356
			int var7 = var2 - field561 + clickedWidgetParent.scrollY; // L: 11357
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11358
				var8 = new ScriptEvent(); // L: 11359
				var8.widget = clickedWidget; // L: 11360
				var8.mouseX = var6; // L: 11361
				var8.mouseY = var7; // L: 11362
				var8.args = clickedWidget.onDrag; // L: 11363
				class92.runScriptEvent(var8); // L: 11364
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11366
				if (isDraggingWidget) { // L: 11367
					if (clickedWidget.onDragComplete != null) { // L: 11368
						var8 = new ScriptEvent(); // L: 11369
						var8.widget = clickedWidget; // L: 11370
						var8.mouseX = var6; // L: 11371
						var8.mouseY = var7; // L: 11372
						var8.dragTarget = draggedOnWidget; // L: 11373
						var8.args = clickedWidget.onDragComplete; // L: 11374
						class92.runScriptEvent(var8); // L: 11375
					}

					if (draggedOnWidget != null) { // L: 11377
						Widget var9 = clickedWidget; // L: 11379
						int var10 = GrandExchangeOfferOwnWorldComparator.method1118(Language.getWidgetFlags(var9)); // L: 11381
						Widget var13;
						if (var10 == 0) { // L: 11382
							var13 = null; // L: 11383
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9; // L: 11393
									break;
								}

								var9 = class130.getWidget(var9.parentId); // L: 11387
								if (var9 == null) { // L: 11388
									var13 = null; // L: 11389
									break; // L: 11390
								}

								++var11; // L: 11386
							}
						}

						if (var13 != null) { // L: 11395
							PacketBufferNode var12 = class135.getPacketBufferNode(ClientPacket.field2847, packetWriter.isaacCipher); // L: 11397
							var12.packetBuffer.method7555(draggedOnWidget.childIndex); // L: 11398
							var12.packetBuffer.writeInt(clickedWidget.id); // L: 11399
							var12.packetBuffer.method7394(draggedOnWidget.itemId); // L: 11400
							var12.packetBuffer.method7555(clickedWidget.itemId); // L: 11401
							var12.packetBuffer.method7486(draggedOnWidget.id); // L: 11402
							var12.packetBuffer.writeShort(clickedWidget.childIndex); // L: 11403
							packetWriter.addNode(var12); // L: 11404
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11409
					this.openMenu(field686 + widgetClickX, field687 + widgetClickY); // L: 11410
				} else if (menuOptionsCount > 0) { // L: 11412
					Tiles.method2054(widgetClickX + field686, field687 + widgetClickY); // L: 11413
				}

				clickedWidget = null; // L: 11416
			}

		} else {
			if (ByteArrayPool.widgetDragDuration > 1) { // L: 11335
				clickedWidget = null; // L: 11336
			}

		}
	} // L: 11338 11418

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(B)Lpb;",
		garbageValue = "0"
	)
	@Export("username")
	public Username username() {
		return WorldMapSprite.localPlayer != null ? WorldMapSprite.localPlayer.username : null; // L: 12089
	}

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 831
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 669
				for (int var1 = 0; var1 <= 27; ++var1) { // L: 670
					String var2 = this.getParameter(Integer.toString(var1)); // L: 671
					if (var2 != null) { // L: 672
						int var4;
						switch(var1) { // L: 673
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 780
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 681
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 682
							}
							break;
						case 4:
							if (clientType == -1) { // L: 785
								clientType = Integer.parseInt(var2); // L: 786
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 706
							break; // L: 707
						case 6:
							var4 = Integer.parseInt(var2); // L: 688
							Language var13;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 690
								var13 = Language.Language_valuesOrdered[var4]; // L: 694
							} else {
								var13 = null; // L: 691
							}

							class122.clientLanguage = var13; // L: 696
							break; // L: 697
						case 7:
							var4 = Integer.parseInt(var2); // L: 712
							GameBuild[] var5 = new GameBuild[]{GameBuild.LIVE, GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.RC}; // L: 717
							GameBuild[] var6 = var5; // L: 719
							int var7 = 0;

							GameBuild var3;
							while (true) {
								if (var7 >= var6.length) {
									var3 = null; // L: 730
									break;
								}

								GameBuild var8 = var6[var7]; // L: 721
								if (var4 == var8.buildId) { // L: 723
									var3 = var8; // L: 724
									break; // L: 725
								}

								++var7; // L: 720
							}

							Language.field3990 = var3; // L: 732
							break; // L: 733
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 747
							}
							break;
						case 9:
							ReflectionCheck.field256 = var2; // L: 701
							break; // L: 702
						case 10:
							HorizontalAlignment.field1846 = (StudioGame)class140.findEnumerated(WorldMapAreaData.method4851(), Integer.parseInt(var2)); // L: 758
							if (StudioGame.oldscape == HorizontalAlignment.field1846) { // L: 759
								VarcInt.loginType = LoginType.oldscape;
							} else {
								VarcInt.loginType = LoginType.field4454; // L: 760
							}
							break;
						case 11:
							FileSystem.field1707 = var2; // L: 765
							break; // L: 766
						case 12:
							worldId = Integer.parseInt(var2); // L: 676
							break; // L: 677
						case 14:
							class87.field1218 = Integer.parseInt(var2); // L: 742
							break; // L: 743
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 775
							break; // L: 776
						case 17:
							ModelData0.field2546 = var2; // L: 770
							break; // L: 771
						case 21:
							field699 = Integer.parseInt(var2); // L: 737
							break; // L: 738
						case 22:
							field554 = Integer.parseInt(var2) != 0; // L: 753
						}
					}
				}

				AttackOption.method2293(); // L: 793
				HealthBar.worldHost = this.getCodeBase().getHost(); // L: 794
				String var9 = Language.field3990.name; // L: 795
				byte var10 = 0; // L: 796

				try {
					Interpreter.method1876("oldschool", var9, var10, 21); // L: 798
				} catch (Exception var11) { // L: 800
					FloorDecoration.RunException_sendStackTrace((String)null, var11); // L: 801
				}

				class414.client = this; // L: 803
				RunException.clientType = clientType; // L: 804
				if (field502 == -1) { // L: 805
					field502 = 0; // L: 806
				}

				LoginScreenAnimation.field1200 = System.getenv("JX_ACCESS_TOKEN"); // L: 808
				System.getenv("JX_REFRESH_TOKEN"); // L: 809
				this.startThread(765, 503, 203); // L: 810
			}
		} catch (RuntimeException var12) {
			throw ByteArrayPool.newRunException(var12, "client.init(" + ')');
		}
	} // L: 811

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 821
			this.field510 = var1; // L: 824
			Player.method2159(10); // L: 825
		}
	} // L: 822 826

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfn;",
		garbageValue = "1114292674"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 84
		if (var1 != null) { // L: 85
			return var1;
		} else {
			byte[] var2 = DefaultsGroup.ItemDefinition_archive.takeFile(10, var0); // L: 86
			var1 = new ItemComposition(); // L: 87
			var1.id = var0; // L: 88
			if (var2 != null) { // L: 89
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 90
			if (var1.noteTemplate != -1) { // L: 91
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 92
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 93
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!MilliClock.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 94
				var1.name = "Members object"; // L: 95
				var1.isTradable = false; // L: 96

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 97
					var1.groundActions[var3] = null; // L: 98
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 100
					if (var3 != 4) { // L: 101
						var1.inventoryActions[var3] = null; // L: 102
					}
				}

				var1.shiftClickIndex = -2; // L: 105
				var1.team = 0; // L: 106
				if (var1.params != null) { // L: 107
					boolean var6 = false; // L: 108

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 109
						ParamComposition var5 = HealthBarUpdate.getParamDefinition((int)var4.key); // L: 110
						if (var5.autoDisable) { // L: 111
							var4.remove();
						} else {
							var6 = true; // L: 112
						}
					}

					if (!var6) {
						var1.params = null; // L: 114
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 117
			return var1; // L: 118
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "79995270"
	)
	public static void method1632(String[] var0, short[] var1) {
		MusicPatch.sortItemsByName(var0, var1, 0, var0.length - 1); // L: 9
	} // L: 10

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "98"
	)
	static int method1630(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1829
			Interpreter.Interpreter_intStackSize -= 3; // L: 1830
			ObjectComposition.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 1831
			return 1; // L: 1832
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1834
			WorldMapSection2.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1835
			return 1; // L: 1836
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1838
			Interpreter.Interpreter_intStackSize -= 2; // L: 1839
			class186.method3695(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1840
			return 1; // L: 1841
		} else {
			int var3;
			int var4;
			if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1843
				if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 1879
					return var0 == 3211 ? 1 : 2; // L: 1913 1914 1916
				} else {
					var3 = 0; // L: 1880
					var4 = 0; // L: 1881
					if (var0 == 3210) { // L: 1882
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1883
					} else if (var0 == 3182) { // L: 1885
						var3 = 6; // L: 1886
					} else if (var0 == 3204) { // L: 1888
						var3 = 7; // L: 1889
					} else if (var0 == 3206) { // L: 1891
						var3 = 8; // L: 1892
					} else if (var0 == 3208) { // L: 1894
						var3 = 9; // L: 1895
					}

					if (var3 == 6) { // L: 1897
						float var5 = ((float)class424.clientPreferences.brightness - 0.5F) * 200.0F; // L: 1898
						var4 = 100 - Math.round(var5); // L: 1899
					} else if (var3 == 7) { // L: 1901
						var4 = Math.round((float)class424.clientPreferences.musicVolume / 2.55F); // L: 1902
					} else if (var3 == 8) { // L: 1904
						var4 = Math.round((float)class424.clientPreferences.soundEffectsVolume / 1.27F); // L: 1905
					} else if (var3 == 9) { // L: 1907
						var4 = Math.round((float)class424.clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1908
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 1910
					return 1; // L: 1911
				}
			} else {
				var3 = 0; // L: 1844
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1845
				if (var0 == 3209) { // L: 1846
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1847
				} else if (var0 == 3181) { // L: 1849
					var3 = 6; // L: 1850
				} else if (var0 == 3203) { // L: 1852
					var3 = 7; // L: 1853
				} else if (var0 == 3205) { // L: 1855
					var3 = 8; // L: 1856
				} else if (var0 == 3207) { // L: 1858
					var3 = 9; // L: 1859
				}

				if (var3 == 6) { // L: 1861
					var4 = 100 - Math.min(Math.max(var4, 0), 100); // L: 1862
					LoginType.method7149((double)((float)var4 / 200.0F + 0.5F)); // L: 1863
				} else if (var3 == 7) { // L: 1865
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1866
					class21.method299(Math.round(2.55F * (float)var4)); // L: 1867
				} else if (var3 == 8) { // L: 1869
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1870
					MouseHandler.updateSoundEffectVolume(Math.round(1.27F * (float)var4)); // L: 1871
				} else if (var3 == 9) { // L: 1873
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1874
					UrlRequest.method2424(Math.round(1.27F * (float)var4)); // L: 1875
				}

				return 1; // L: 1877
			}
		}
	}
}
