import com.jagex.oldscape.pub.OAuthTokens;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		descriptor = "[Ldk;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -375150113
	)
	static int field699;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 658821549
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		longValue = 8672650031376335607L
	)
	static long field708;
	@ObfuscatedName("pd")
	static boolean[] field710;
	@ObfuscatedName("pl")
	static boolean[] field525;
	@ObfuscatedName("pi")
	static boolean[] field701;
	@ObfuscatedName("qz")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 1652688663
	)
	public static int field763;
	@ObfuscatedName("ra")
	static boolean field663;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pf")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pg")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -2049999317
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("pu")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	static final ApproximateRouteStrategy field649;
	@ObfuscatedName("qi")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "[Leb;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("uh")
	static int[] field668;
	@ObfuscatedName("ui")
	static int[] field491;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -637088723
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = 2125770367
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = 1753796131
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = -1053103983
	)
	static int field758;
	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -298323055
	)
	static int field759;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 142845295
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 1136310005
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("se")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("sw")
	static boolean[] field739;
	@ObfuscatedName("uf")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -263735291
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		longValue = 8595970348071073099L
	)
	static long field719;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = -1871733035
	)
	static int field722;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -1582886561
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = -409614591
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("qk")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("si")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -980892169
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -1067117511
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("sy")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -678405889
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sr")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "[Lau;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("sl")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("sq")
	static short field744;
	@ObfuscatedName("sb")
	static short field747;
	@ObfuscatedName("tv")
	static short field750;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -1268631863
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("tk")
	static short field501;
	@ObfuscatedName("tb")
	static short field749;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -717512689
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("ta")
	static short field748;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = 1460584323
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("rx")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ry")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -1912998745
	)
	static int field726;
	@ObfuscatedName("sv")
	static int[] field741;
	@ObfuscatedName("sk")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("tw")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("sa")
	static int[] field740;
	@ObfuscatedName("sx")
	static int[] field743;
	@ObfuscatedName("sp")
	static int[] field742;
	@ObfuscatedName("qd")
	static int[] field718;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static NodeDeque field731;
	@ObfuscatedName("qj")
	static int[] field532;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static NodeDeque field695;
	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "[Lkp;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 632323647
	)
	static int field521;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1532586045
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("qg")
	static int[] field554;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -1804888553
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("ql")
	static String field550;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfy;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("g")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("af")
	static boolean field684;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 512033263
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 988736307
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -127514409
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bx")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bu")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 979848567
	)
	static int field524;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -372020577
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 386953519
	)
	static int field681;
	@ObfuscatedName("bh")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static IndexedSprite field563;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -446123719
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("co")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1925844067
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		longValue = -3232131472632765751L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 811493421
	)
	static int field495;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -373046411
	)
	static int field496;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		longValue = 4198601607293137673L
	)
	static long field650;
	@ObfuscatedName("dp")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dq")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1713117061
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -311239939
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -687927463
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 738191303
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1730965
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -184366361
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1857497037
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1806632551
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1199522407
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 88174603
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1228529663
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 434552597
	)
	static int field513;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -543080313
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 541263159
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -278054881
	)
	static int field516;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -135680147
	)
	static int field680;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 99674011
	)
	static int field539;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static class112 field519;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static class404 field520;
	@ObfuscatedName("fy")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fv")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1449803711
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gu")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -181273181
	)
	static int field713;
	@ObfuscatedName("gb")
	static int[] field535;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1080604705
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gw")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ga")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gr")
	static boolean field540;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("gx")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = 429642241
	)
	static int field764;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -2047349491
	)
	static int field544;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 7955115
	)
	static int field545;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 1758878319
	)
	static int field546;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = 776809837
	)
	static int field534;
	@ObfuscatedName("hr")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("hq")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ha")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hm")
	static final int[] field690;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 62911743
	)
	static int field536;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = 918156389
	)
	static int field553;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1728658311
	)
	static int field514;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -1457029895
	)
	static int field555;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 839369183
	)
	static int field697;
	@ObfuscatedName("ip")
	static boolean field551;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -669095929
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1491632285
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 365891595
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 903011995
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -242387739
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1304297933
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -517728459
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -1645388963
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 650404899
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -1300279595
	)
	static int field567;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -1313239981
	)
	static int field727;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -1802973869
	)
	static int field661;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1229982081
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1796605093
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1959883561
	)
	static int field572;
	@ObfuscatedName("jb")
	static boolean field573;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -1418768187
	)
	static int field574;
	@ObfuscatedName("jg")
	static boolean field575;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -616234769
	)
	static int field565;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1042076149
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1840257993
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ji")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("jz")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("jw")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("jj")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("js")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jy")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jm")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jd")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jx")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1896228975
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -2020922955
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1448085957
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1456477803
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1624201253
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 2032961995
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 1021032213
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kq")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -1860756085
	)
	static int field620;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -870124891
	)
	static int field597;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1873119605
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -1697444733
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 804166773
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1951958309
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kv")
	static boolean field602;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1412990731
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -605440881
	)
	static int field559;
	@ObfuscatedName("kz")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Lci;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -356697653
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 556755365
	)
	static int field630;
	@ObfuscatedName("lt")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 662672375
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 963863569
	)
	static int field611;
	@ObfuscatedName("lv")
	static int[] field612;
	@ObfuscatedName("lr")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("lw")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("lb")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("lo")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 26459347
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "[[[Lkf;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("lp")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("lz")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lg")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -656086715
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lj")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1352565651
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mk")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mn")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mf")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mz")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mm")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ms")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mr")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("me")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("md")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("mt")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mu")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -424522549
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -106836395
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -891724889
	)
	static int field557;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -2060316951
	)
	static int field642;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -1211673873
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nu")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 1960701091
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -882140087
	)
	static int field647;
	@ObfuscatedName("nv")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nm")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = 38935301
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -508691007
	)
	static int field509;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 790876457
	)
	static int field673;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -1532573151
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = 337838357
	)
	static int field655;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -883247427
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = 788246481
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 1942504279
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1722694677
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("no")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -2051161493
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -799572455
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("os")
	static boolean field595;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 1828492715
	)
	static int field669;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -382731895
	)
	static int field670;
	@ObfuscatedName("oc")
	static boolean field671;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -1406735933
	)
	static int field672;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1787006661
	)
	static int field608;
	@ObfuscatedName("oy")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -1259941325
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("oa")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1032665603
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("oo")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -1437858425
	)
	static int field679;
	@ObfuscatedName("ob")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 2041153631
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("on")
	static int[] field682;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -187547255
	)
	static int field683;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -660834771
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 355698679
	)
	static int field685;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = -22605919
	)
	static int field686;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -997249107
	)
	static int field687;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 1875355069
	)
	static int field594;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -907092363
	)
	static int field577;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 1660311595
	)
	static int field489;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 674723093
	)
	static int field691;
	@ObfuscatedName("ff")
	String field547;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	class14 field522;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	class19 field523;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	Buffer field527;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	class7 field528;

	static {
		field684 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field524 = -1;
		clientType = -1;
		field681 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field495 = -1;
		field496 = -1;
		field650 = -1L;
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
		field513 = 0;
		js5Errors = 0;
		loginState = 0;
		field516 = 0;
		field680 = 0;
		field539 = 0;
		field519 = class112.field1359;
		field520 = class404.field4344;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field713 = 0;
		field535 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		useBufferedSocket = true;
		field540 = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field764 = 0;
		field544 = 1;
		field545 = 0;
		field546 = 1;
		field534 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field690 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field536 = 0;
		field553 = 2301979;
		field514 = 5063219;
		field555 = 3353893;
		field697 = 7759444;
		field551 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field567 = 0;
		field727 = 0;
		field661 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field572 = 0;
		field573 = false;
		field574 = 0;
		field575 = false;
		field565 = 0;
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
		field620 = 0;
		field597 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field602 = false;
		itemDragDuration = 0;
		field559 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field630 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field611 = 0;
		field612 = new int[1000];
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
		field557 = 0;
		field642 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field647 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field509 = 0;
		field673 = -1;
		chatEffects = 0;
		field655 = 0;
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
		field595 = false;
		field669 = -1;
		field670 = -1;
		field671 = false;
		field672 = -1;
		field608 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field679 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field682 = new int[32];
		field683 = 0;
		chatCycle = 0;
		field685 = 0;
		field686 = 0;
		field687 = 0;
		field594 = 0;
		field577 = 0;
		field489 = 0;
		field691 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field731 = new NodeDeque();
		field695 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field699 = -2;
		field710 = new boolean[100];
		field701 = new boolean[100];
		field525 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field708 = 0L;
		isResizable = true;
		field554 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field550 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field726 = 0;
		field532 = new int[128];
		field718 = new int[128];
		field719 = -1L;
		currentClanSettings = new ClanSettings[2];
		currentClanChannels = new ClanChannel[2];
		field722 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field663 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field739 = new boolean[5];
		field740 = new int[5];
		field741 = new int[5];
		field742 = new int[5];
		field743 = new int[5];
		field744 = 256;
		field747 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field748 = 1;
		field749 = 32767;
		field750 = 1;
		field501 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field758 = -1;
		field759 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field763 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field521 = 0;
		field649 = new ApproximateRouteStrategy();
		field668 = new int[50];
		field491 = new int[50];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1526531599"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field708 = UserComparator4.method2406() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "940201361"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			GrandExchangeOfferUnitPriceComparator.ByteArrayPool_alternativeSizes = var1;
			Message.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			class117.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < GrandExchangeOfferUnitPriceComparator.ByteArrayPool_alternativeSizes.length; ++var3) {
				class117.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field3893.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field3893);
		} else {
			GrandExchangeOfferUnitPriceComparator.ByteArrayPool_alternativeSizes = null;
			Message.ByteArrayPool_altSizeArrayCounts = null;
			class117.ByteArrayPool_arrays = null;
			ByteArrayPool.field3893.clear();
			ByteArrayPool.field3893.add(100);
			ByteArrayPool.field3893.add(5000);
			ByteArrayPool.field3893.add(10000);
			ByteArrayPool.field3893.add(30000);
		}

		WorldMapLabelSize.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		UserList.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		RouteStrategy.currentPort = WorldMapLabelSize.worldPort;
		PlayerComposition.field3023 = class260.field3034;
		class185.field2101 = class260.field3030;
		SceneTilePaint.field2600 = class260.field3033;
		WorldMapLabel.field2180 = class260.field3031;
		WorldMapSection0.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.method452();
		AccessFile.mouseWheel = this.mouseWheel();
		HealthBarUpdate.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		WorldMapDecorationType.clientPreferences = class67.method1887();
		this.setUpClipboard();
		GZipDecompressor.method7450(this, UrlRequester.field1303);
		if (gameBuild != 0) {
			displayFps = true;
		}

		class392.setWindowedMode(WorldMapDecorationType.clientPreferences.windowMode);
		Message.friendSystem = new FriendSystem(WorldMapSectionType.loginType);
		this.field522 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1675225894"
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
				int var5;
				try {
					if (class247.musicPlayerStatus == 1) {
						var5 = class247.midiPcmStream.method4705();
						if (var5 > 0 && class247.midiPcmStream.isReady()) {
							var5 -= class247.pcmSampleLength;
							if (var5 < 0) {
								var5 = 0;
							}

							class247.midiPcmStream.setPcmStreamVolume(var5);
						} else {
							class247.midiPcmStream.clear();
							class247.midiPcmStream.removeAll();
							if (class113.musicTrackArchive != null) {
								class247.musicPlayerStatus = 2;
							} else {
								class247.musicPlayerStatus = 0;
							}

							BuddyRankComparator.musicTrack = null;
							class247.soundCache = null;
						}
					}
				} catch (Exception var9) {
					var9.printStackTrace();
					class247.midiPcmStream.clear();
					class247.musicPlayerStatus = 0;
					BuddyRankComparator.musicTrack = null;
					class247.soundCache = null;
					class113.musicTrackArchive = null;
				}

				class356.playPcmPlayers();
				synchronized(KeyHandler.KeyHandler_instance) {
					++KeyHandler.KeyHandler_idleCycles;
					KeyHandler.field139 = KeyHandler.field126;
					KeyHandler.field136 = 0;
					KeyHandler.field140 = 0;
					Arrays.fill(KeyHandler.field128, false);
					Arrays.fill(KeyHandler.field129, false);
					if (KeyHandler.field123 < 0) {
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
						KeyHandler.field123 = KeyHandler.field144;
					} else {
						while (KeyHandler.field144 != KeyHandler.field123) {
							int var6 = KeyHandler.field130[KeyHandler.field144];
							KeyHandler.field144 = KeyHandler.field144 + 1 & 127;
							if (var6 < 0) {
								var6 = ~var6;
								if (KeyHandler.KeyHandler_pressedKeys[var6]) {
									KeyHandler.KeyHandler_pressedKeys[var6] = false;
									KeyHandler.field129[var6] = true;
									KeyHandler.field137[KeyHandler.field140] = var6;
									++KeyHandler.field140;
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var6] && KeyHandler.field136 < KeyHandler.field135.length - 1) {
									KeyHandler.field128[var6] = true;
									KeyHandler.field135[++KeyHandler.field136 - 1] = var6;
								}

								KeyHandler.KeyHandler_pressedKeys[var6] = true;
							}
						}
					}

					if (KeyHandler.field136 > 0) {
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field126 = KeyHandler.field127;
				}

				KeyHandler.method364();
				if (AccessFile.mouseWheel != null) {
					var5 = AccessFile.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					class11.load();
					LoginPacket.clock.mark();

					for (var5 = 0; var5 < 32; ++var5) {
						GameEngine.graphicsTickTimes[var5] = 0L;
					}

					for (var5 = 0; var5 < 32; ++var5) {
						GameEngine.clientTickTimes[var5] = 0L;
					}

					GameEngine.gameCyclesToDo = 0;
				} else if (gameState == 5) {
					class87.method2196(this, class262.fontPlain12);
					class11.load();
					ObjectSound.method1719();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class87.method2196(this, class262.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						WorldMapLabelSize.method3448();
					}
				} else {
					class87.method2196(this, class262.fontPlain12);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-296185885"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label167: {
			try {
				if (class247.musicPlayerStatus == 2) {
					if (BuddyRankComparator.musicTrack == null) {
						BuddyRankComparator.musicTrack = MusicTrack.readTrack(class113.musicTrackArchive, Skills.musicTrackGroupId, class137.musicTrackFileId);
						if (BuddyRankComparator.musicTrack == null) {
							var2 = false;
							break label167;
						}
					}

					if (class247.soundCache == null) {
						class247.soundCache = new SoundCache(class247.soundEffectsArchive, GrandExchangeOfferWorldComparator.musicSamplesArchive);
					}

					if (class247.midiPcmStream.loadMusicTrack(BuddyRankComparator.musicTrack, class247.musicPatchesArchive, class247.soundCache, 22050)) {
						class247.midiPcmStream.clearAll();
						class247.midiPcmStream.setPcmStreamVolume(class247.musicTrackVolume);
						class247.midiPcmStream.setMusicTrack(BuddyRankComparator.musicTrack, class247.musicTrackBoolean);
						class247.musicPlayerStatus = 0;
						BuddyRankComparator.musicTrack = null;
						class247.soundCache = null;
						class113.musicTrackArchive = null;
						var2 = true;
						break label167;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				class247.midiPcmStream.clear();
				class247.musicPlayerStatus = 0;
				BuddyRankComparator.musicTrack = null;
				class247.soundCache = null;
				class113.musicTrackArchive = null;
			}

			var2 = false;
		}

		if (var2 && field663 && class126.pcmPlayer0 != null) {
			class126.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field708 && UserComparator4.method2406() > field708) {
			class392.setWindowedMode(class12.getWindowedMode());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field710[var4] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			Player.drawTitle(Interpreter.fontBold12, UserComparator8.fontPlain11, class262.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				Player.drawTitle(Interpreter.fontBold12, UserComparator8.fontPlain11, class262.fontPlain12);
			} else if (gameState == 25) {
				if (field534 == 1) {
					if (field764 > field544) {
						field544 = field764;
					}

					var4 = (field544 * 50 - field764 * 50) / field544;
					ScriptFrame.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else if (field534 == 2) {
					if (field545 > field546) {
						field546 = field545;
					}

					var4 = (field546 * 50 - field545 * 50) / field546 + 50;
					ScriptFrame.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else {
					ScriptFrame.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				ScriptFrame.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				ScriptFrame.drawLoadingMessage("Please wait...", false);
			}
		} else {
			Player.drawTitle(Interpreter.fontBold12, UserComparator8.fontPlain11, class262.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field701[var4]) {
					class244.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field701[var4] = false;
				}
			}
		} else if (gameState > 0) {
			class244.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field701[var4] = false;
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Tile.varcs.hasUnwrittenChanges()) {
			Tile.varcs.write();
		}

		if (ClientPreferences.mouseRecorder != null) {
			ClientPreferences.mouseRecorder.isRunning = false;
		}

		ClientPreferences.mouseRecorder = null;
		packetWriter.close();
		HealthBarUpdate.method2161();
		Language.method5469();
		AccessFile.mouseWheel = null;
		if (class126.pcmPlayer0 != null) {
			class126.pcmPlayer0.shutdown();
		}

		if (class116.pcmPlayer1 != null) {
			class116.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3671 != 0) {
				ArchiveDiskActionHandler.field3671 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		if (WorldMapSection0.urlRequester != null) {
			WorldMapSection0.urlRequester.close();
			WorldMapSection0.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var4 = 0; var4 < Bounds.idxCount; ++var4) {
				JagexCache.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var6) {
		}

		this.field522.method172();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1826906753"
	)
	protected final void vmethod1165() {
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-28"
	)
	boolean method1338() {
		return WorldMapSectionType.field2140 != null && !WorldMapSectionType.field2140.trim().isEmpty();
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-52448415"
	)
	void method1110(String var1) throws MalformedURLException, IOException {
		class10 var2 = new class10(new URL(Varcs.field1264 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class9.field43);
		var2.method91("Authorization", "Bearer " + var1);
		this.field523 = this.field522.method178(var2);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = UserComparator4.method2406();
			int var4 = (int)(var2 - NetCache.field3715);
			NetCache.field3715 = var2;
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
					label238: {
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
							if (ClanChannel.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3726 == 0) {
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
								if (NetCache.field3724 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3724;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (ClanChannel.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									UrlRequester.field1301 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										UrlRequester.field1301 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									ClanChannel.NetCache_currentResponse = var15;
									StudioGame.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + ClanChannel.NetCache_currentResponse.padding);
									StudioGame.NetCache_responseArchiveBuffer.writeByte(var11);
									StudioGame.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3726 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3726 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field3726 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										ClanChannel.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = StudioGame.NetCache_responseArchiveBuffer.array.length - ClanChannel.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3726;
								if (var9 > var8 - StudioGame.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - StudioGame.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(StudioGame.NetCache_responseArchiveBuffer.array, StudioGame.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3724 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = StudioGame.NetCache_responseArchiveBuffer.array;
										var10001 = StudioGame.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3724;
									}
								}

								var25 = StudioGame.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field3726 += var9;
								if (var8 == StudioGame.NetCache_responseArchiveBuffer.offset) {
									if (ClanChannel.NetCache_currentResponse.key == 16711935L) {
										TriBool.NetCache_reference = StudioGame.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												TriBool.NetCache_reference.offset = var10 * 8 + 5;
												var12 = TriBool.NetCache_reference.readInt();
												int var20 = TriBool.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(StudioGame.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != ClanChannel.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3724 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label238;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										ClanChannel.NetCache_currentResponse.archive.write((int)(ClanChannel.NetCache_currentResponse.key & 65535L), StudioGame.NetCache_responseArchiveBuffer.array, (ClanChannel.NetCache_currentResponse.key & 16711680L) == 16711680L, UrlRequester.field1301);
									}

									ClanChannel.NetCache_currentResponse.remove();
									if (UrlRequester.field1301) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3726 = 0;
									ClanChannel.NetCache_currentResponse = null;
									StudioGame.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3726 != 512) {
										break;
									}

									NetCache.field3726 = 0;
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

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2091398005"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			UserList.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					UserList.updateGameState(1000);
					return;
				}

				field513 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field513 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class19.js5SocketTask = GameEngine.taskHandler.newSocketTask(EnumComposition.worldHost, RouteStrategy.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class19.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class19.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							Socket var2 = (Socket)class19.js5SocketTask.result;
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
							class78.js5Socket = var1;
						} else {
							class78.js5Socket = new NetSocket((Socket)class19.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var5 = new Buffer(5);
						var5.writeByte(15);
						var5.writeInt(200);
						class78.js5Socket.write(var5.array, 0, 5);
						++js5ConnectState;
						class229.field2643 = UserComparator4.method2406();
					}

					if (js5ConnectState == 3) {
						if (class78.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var3 = class78.js5Socket.readUnsignedByte();
							if (var3 != 0) {
								this.js5Error(var3);
								return;
							}

							++js5ConnectState;
						} else if (UserComparator4.method2406() - class229.field2643 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class132.method2698(class78.js5Socket, gameState > 20);
						class19.js5SocketTask = null;
						class78.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var4) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1846558213"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class19.js5SocketTask = null;
		class78.js5Socket = null;
		js5ConnectState = 0;
		if (RouteStrategy.currentPort == WorldMapLabelSize.worldPort) {
			RouteStrategy.currentPort = UserList.js5Port;
		} else {
			RouteStrategy.currentPort = WorldMapLabelSize.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				UserList.updateGameState(1000);
			} else {
				field513 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			UserList.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				UserList.updateGameState(1000);
			} else {
				field513 = 3000;
			}
		}

	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (Tile.secureRandom == null && (secureRandomFuture.isDone() || field516 > 250)) {
					Tile.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (Tile.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					UrlRequester.socketTask = null;
					hadNetworkError = false;
					field516 = 0;
					if (field520.method7148()) {
						try {
							this.method1110(WorldMapSectionType.field2140);
							CollisionMap.method3418(20);
						} catch (Throwable var22) {
							Timer.RunException_sendStackTrace((String)null, var22);
							World.getLoginError(65);
							return;
						}
					} else {
						CollisionMap.method3418(1);
					}
				}
			}

			if (loginState == 20) {
				if (!this.field523.method286()) {
					return;
				}

				if (this.field523.method285()) {
					Timer.RunException_sendStackTrace(this.field523.method295(), (Throwable)null);
					World.getLoginError(65);
					return;
				}

				class21 var3 = this.field523.method287();
				if (var3.method317() != 200) {
					Timer.RunException_sendStackTrace("Response code: " + var3.method317() + "Response body: " + var3.method312(), (Throwable)null);
					World.getLoginError(65);
					return;
				}

				field516 = 0;
				this.field547 = var3.method312();
				CollisionMap.method3418(1);
			}

			if (loginState == 1) {
				if (UrlRequester.socketTask == null) {
					UrlRequester.socketTask = GameEngine.taskHandler.newSocketTask(EnumComposition.worldHost, RouteStrategy.currentPort);
				}

				if (UrlRequester.socketTask.status == 2) {
					throw new IOException();
				}

				if (UrlRequester.socketTask.status == 1) {
					if (useBufferedSocket) {
						Socket var4 = (Socket)UrlRequester.socketTask.result;
						BufferedNetSocket var25 = new BufferedNetSocket(var4, 40000, 5000);
						var1 = var25;
					} else {
						var1 = new NetSocket((Socket)UrlRequester.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					UrlRequester.socketTask = null;
					CollisionMap.method3418(2);
				}
			}

			PacketBufferNode var28;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var28 = Tile.method4117();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(LoginPacket.field2885.id);
				packetWriter.addNode(var28);
				packetWriter.flush();
				var2.offset = 0;
				CollisionMap.method3418(3);
			}

			boolean var14;
			int var15;
			if (loginState == 3) {
				if (class126.pcmPlayer0 != null) {
					class126.pcmPlayer0.method696();
				}

				if (class116.pcmPlayer1 != null) {
					class116.pcmPlayer1.method696();
				}

				var14 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var14 = false;
				}

				if (var14) {
					var15 = ((AbstractSocket)var1).readUnsignedByte();
					if (class126.pcmPlayer0 != null) {
						class126.pcmPlayer0.method696();
					}

					if (class116.pcmPlayer1 != null) {
						class116.pcmPlayer1.method696();
					}

					if (var15 != 0) {
						World.getLoginError(var15);
						return;
					}

					var2.offset = 0;
					CollisionMap.method3418(4);
				}
			}

			int var40;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var40 = ((AbstractSocket)var1).available();
					if (var40 > 8 - var2.offset) {
						var40 = 8 - var2.offset;
					}

					if (var40 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var40);
						var2.offset += var40;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					Language.field3800 = var2.readLong();
					CollisionMap.method3418(5);
				}
			}

			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var26 = new PacketBuffer(500);
				int[] var30 = new int[]{Tile.secureRandom.nextInt(), Tile.secureRandom.nextInt(), Tile.secureRandom.nextInt(), Tile.secureRandom.nextInt()};
				var26.offset = 0;
				var26.writeByte(1);
				var26.writeInt(var30[0]);
				var26.writeInt(var30[1]);
				var26.writeInt(var30[2]);
				var26.writeInt(var30[3]);
				var26.writeLong(Language.field3800);
				if (gameState == 40) {
					var26.writeInt(class78.field1016[0]);
					var26.writeInt(class78.field1016[1]);
					var26.writeInt(class78.field1016[2]);
					var26.writeInt(class78.field1016[3]);
				} else {
					var26.writeByte(field519.rsOrdinal());
					switch(field519.field1361) {
					case 0:
						var26.writeInt((Integer)WorldMapDecorationType.clientPreferences.parameters.get(SoundCache.method771(Login.Login_username)));
						break;
					case 1:
					case 2:
						var26.writeMedium(MouseHandler.field236);
						++var26.offset;
						break;
					case 3:
						var26.offset += 4;
					}

					if (field520.method7148()) {
						var26.writeByte(class404.field4348.rsOrdinal());
						var26.writeStringCp1252NullTerminated(this.field547);
					} else {
						var26.writeByte(class404.field4344.rsOrdinal());
						var26.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var26.encryptRsa(class67.field864, class67.field866);
				class78.field1016 = var30;
				PacketBufferNode var6 = Tile.method4117();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(LoginPacket.field2886.id);
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field2891.id);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(200);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field681);
				var6.packetBuffer.writeBytes(var26.array, 0, var26.offset);
				int var8 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(Huffman.canvasWidth);
				var6.packetBuffer.writeShort(MouseRecorder.canvasHeight);
				PacketBuffer var9 = var6.packetBuffer;
				int var12;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var11 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var11);

						for (var12 = 0; var12 < 24 && var11[var12] == 0; ++var12) {
						}

						if (var12 >= 24) {
							throw new IOException();
						}
					} catch (Exception var23) {
						for (int var13 = 0; var13 < 24; ++var13) {
							var11[var13] = -1;
						}
					}

					var9.writeBytes(var11, 0, var11.length);
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(ItemContainer.field1009);
				var6.packetBuffer.writeInt(KeyHandler.field142);
				Buffer var10 = new Buffer(MenuAction.platformInfo.size());
				MenuAction.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.writeIntME(UserComparator8.archive10.hash);
				var6.packetBuffer.writeInt(Tiles.archive6.hash);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.writeIntME(class54.archive20.hash);
				var6.packetBuffer.method6940(RouteStrategy.archive2.hash);
				var6.packetBuffer.method6942(ClanChannel.archive0.hash);
				var6.packetBuffer.method6942(class150.archive3.hash);
				var6.packetBuffer.writeIntME(class12.archive15.hash);
				var6.packetBuffer.writeIntME(ItemContainer.archive17.hash);
				var6.packetBuffer.writeIntME(Interpreter.archive9.hash);
				var6.packetBuffer.writeInt(Skeleton.archive7.hash);
				var6.packetBuffer.method6940(class260.archive4.hash);
				var6.packetBuffer.writeIntME(ApproximateRouteStrategy.archive5.hash);
				var6.packetBuffer.method6942(class176.archive8.hash);
				var6.packetBuffer.method6940(UserComparator6.archive12.hash);
				var6.packetBuffer.method6940(TextureProvider.archive18.hash);
				var6.packetBuffer.method6940(class54.archive13.hash);
				var6.packetBuffer.writeInt(MouseRecorder.archive1.hash);
				var6.packetBuffer.writeIntME(ViewportMouse.archive19.hash);
				var6.packetBuffer.writeIntME(class4.archive11.hash);
				var6.packetBuffer.method6940(class28.archive14.hash);
				var6.packetBuffer.xteaEncrypt(var30, var8, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var30);
				int[] var39 = new int[4];

				for (var12 = 0; var12 < 4; ++var12) {
					var39[var12] = var30[var12] + 50;
				}

				var2.newIsaacCipher(var39);
				CollisionMap.method3418(6);
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var40 = ((AbstractSocket)var1).readUnsignedByte();
				if (var40 == 21 && gameState == 20) {
					CollisionMap.method3418(12);
				} else if (var40 == 2) {
					CollisionMap.method3418(14);
				} else if (var40 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					CollisionMap.method3418(19);
				} else if (var40 == 64) {
					CollisionMap.method3418(10);
				} else if (var40 == 23 && field680 < 1) {
					++field680;
					CollisionMap.method3418(0);
				} else if (var40 == 29) {
					CollisionMap.method3418(17);
				} else {
					if (var40 != 69) {
						World.getLoginError(var40);
						return;
					}

					CollisionMap.method3418(7);
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class381.field4217 = var2.readUnsignedShort();
				CollisionMap.method3418(8);
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class381.field4217) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class381.field4217);
				class6[] var27 = new class6[]{class6.field17};
				class6 var31 = var27[var2.readUnsignedByte()];

				try {
					class3 var5 = HorizontalAlignment.method3014(var31);
					this.field528 = new class7(var2, var5);
					CollisionMap.method3418(9);
				} catch (Exception var21) {
					World.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field528.method47()) {
				this.field527 = this.field528.method49();
				this.field528.method48();
				this.field528 = null;
				if (this.field527 == null) {
					World.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var28 = Tile.method4117();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(LoginPacket.field2888.id);
				var28.packetBuffer.writeShort(this.field527.offset);
				var28.packetBuffer.method6890(this.field527);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field527 = null;
				CollisionMap.method3418(6);
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				ModeWhere.field3818 = ((AbstractSocket)var1).readUnsignedByte();
				CollisionMap.method3418(11);
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= ModeWhere.field3818) {
				((AbstractSocket)var1).read(var2.array, 0, ModeWhere.field3818);
				var2.offset = 0;
				CollisionMap.method3418(6);
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field539 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				CollisionMap.method3418(13);
			}

			if (loginState == 13) {
				field516 = 0;
				class17.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field539 / 60 + " seconds.");
				if (--field539 <= 0) {
					CollisionMap.method3418(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					WorldMapLabel.field2176 = ((AbstractSocket)var1).readUnsignedByte();
					CollisionMap.method3418(15);
				}

				int var17;
				boolean var41;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= WorldMapLabel.field2176) {
					var14 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					var41 = false;
					if (var14) {
						var15 = var2.readByteIsaac() << 24;
						var15 |= var2.readByteIsaac() << 16;
						var15 |= var2.readByteIsaac() << 8;
						var15 |= var2.readByteIsaac();
						var17 = SoundCache.method771(Login.Login_username);
						if (WorldMapDecorationType.clientPreferences.parameters.size() >= 10 && !WorldMapDecorationType.clientPreferences.parameters.containsKey(var17)) {
							Iterator var38 = WorldMapDecorationType.clientPreferences.parameters.entrySet().iterator();
							var38.next();
							var38.remove();
						}

						WorldMapDecorationType.clientPreferences.parameters.put(var17, var15);
					}

					if (Login_isUsernameRemembered) {
						WorldMapDecorationType.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						WorldMapDecorationType.clientPreferences.rememberedUsername = null;
					}

					ScriptFrame.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field630 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var33 = WallDecoration.ServerPacket_values();
					int var18 = var2.readSmartByteShortIsaac();
					if (var18 < 0 || var18 >= var33.length) {
						throw new IOException(var18 + " " + var2.offset);
					}

					packetWriter.serverPacket = var33[var18];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var19 = class21.client;
						JSObject.getWindow(var19).call("zap", (Object[])null);
					} catch (Throwable var20) {
					}

					CollisionMap.method3418(16);
				}

				if (loginState != 16) {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class113.field1364 = var2.readUnsignedShort();
						CollisionMap.method3418(18);
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class113.field1364) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class113.field1364);
						var2.offset = 0;
						String var34 = var2.readStringCp1252NullTerminated();
						String var37 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						class17.setLoginResponseString(var34, var37, var35);
						UserList.updateGameState(10);
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
							var40 = packetWriter.serverPacketLength;
							timer.method5908();
							NPC.method2235();
							ArchiveDiskActionHandler.updatePlayer(var2);
							if (var40 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field516;
						if (field516 > 2000) {
							if (field680 < 1) {
								if (WorldMapLabelSize.worldPort == RouteStrategy.currentPort) {
									RouteStrategy.currentPort = UserList.js5Port;
								} else {
									RouteStrategy.currentPort = WorldMapLabelSize.worldPort;
								}

								++field680;
								CollisionMap.method3418(0);
							} else {
								World.getLoginError(-3);
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5906();
						mouseLastLastPressedTimeMillis = -1L;
						ClientPreferences.mouseRecorder.index = 0;
						KitDefinition.hasFocus = true;
						hadFocus = true;
						field719 = -1L;
						class6.method45();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1281 = null;
						packetWriter.field1293 = null;
						packetWriter.field1288 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1290 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						class7.method46();
						class130.method2677(0);
						class1.method13();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						Widget.field3165 = null;
						minimapState = 0;
						field722 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						Players.Players_count = 0;

						for (var40 = 0; var40 < 2048; ++var40) {
							Players.field1248[var40] = null;
							Players.field1245[var40] = 1;
						}

						for (var40 = 0; var40 < 2048; ++var40) {
							players[var40] = null;
						}

						for (var40 = 0; var40 < 32768; ++var40) {
							npcs[var40] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var40 = 0; var40 < 4; ++var40) {
							for (var15 = 0; var15 < 104; ++var15) {
								for (var17 = 0; var17 < 104; ++var17) {
									groundItems[var40][var15][var17] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						Message.friendSystem.clear();

						for (var40 = 0; var40 < VarpDefinition.VarpDefinition_fileCount; ++var40) {
							VarpDefinition var36 = ApproximateRouteStrategy.VarpDefinition_get(var40);
							if (var36 != null) {
								Varps.Varps_temp[var40] = 0;
								Varps.Varps_main[var40] = 0;
							}
						}

						Tile.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							var40 = rootInterface;
							if (var40 != -1 && class157.Widget_loadedInterfaces[var40]) {
								Widget.Widget_archive.clearFilesGroup(var40);
								if (Widget.Widget_interfaceComponents[var40] != null) {
									var41 = true;

									for (var17 = 0; var17 < Widget.Widget_interfaceComponents[var40].length; ++var17) {
										if (Widget.Widget_interfaceComponents[var40][var17] != null) {
											if (Widget.Widget_interfaceComponents[var40][var17].type != 2) {
												Widget.Widget_interfaceComponents[var40][var17] = null;
											} else {
												var41 = false;
											}
										}
									}

									if (var41) {
										Widget.Widget_interfaceComponents[var40] = null;
									}

									class157.Widget_loadedInterfaces[var40] = false;
								}
							}
						}

						for (InterfaceParent var29 = (InterfaceParent)interfaceParents.first(); var29 != null; var29 = (InterfaceParent)interfaceParents.next()) {
							WorldMapLabelSize.closeInterface(var29, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						menuOptionsCount = 0;
						isMenuOpen = false;
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var40 = 0; var40 < 8; ++var40) {
							playerMenuActions[var40] = null;
							playerOptionsPriorities[var40] = false;
						}

						ItemContainer.itemContainers = new NodeHashTable(32);
						isLoading = true;

						for (var40 = 0; var40 < 100; ++var40) {
							field710[var40] = true;
						}

						PacketBufferNode var32 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2718, packetWriter.isaacCipher);
						var32.packetBuffer.writeByte(class12.getWindowedMode());
						var32.packetBuffer.writeShort(Huffman.canvasWidth);
						var32.packetBuffer.writeShort(MouseRecorder.canvasHeight);
						packetWriter.addNode(var32);
						class264.friendsChat = null;
						class114.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object)null);
						GrandExchangeOfferNameComparator.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object)null);

						for (var40 = 0; var40 < 8; ++var40) {
							grandExchangeOffers[var40] = new GrandExchangeOffer();
						}

						class6.grandExchangeEvents = null;
						ArchiveDiskActionHandler.updatePlayer(var2);
						HealthBarDefinition.field1671 = -1;
						WorldMapArea.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var24) {
			if (field680 < 1) {
				if (RouteStrategy.currentPort == WorldMapLabelSize.worldPort) {
					RouteStrategy.currentPort = UserList.js5Port;
				} else {
					RouteStrategy.currentPort = WorldMapLabelSize.worldPort;
				}

				++field680;
				CollisionMap.method3418(0);
			} else {
				World.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1935915349"
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
			class20.method302();
		} else {
			if (!isMenuOpen) {
				class174.addCancelMenuEntry();
			}

			for (int var1 = 0; var1 < 100 && this.method1307(packetWriter); ++var1) {
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
						PacketBufferNode var15;
						int var16;
						if (timer.field3905) {
							var15 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2724, packetWriter.isaacCipher);
							var15.packetBuffer.writeByte(0);
							var16 = var15.packetBuffer.offset;
							timer.write(var15.packetBuffer);
							var15.packetBuffer.method6918(var15.packetBuffer.offset - var16);
							packetWriter.addNode(var15);
							timer.method5907();
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
						synchronized(ClientPreferences.mouseRecorder.lock) {
							if (!field684) {
								ClientPreferences.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || ClientPreferences.mouseRecorder.index >= 40) {
								var32 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < ClientPreferences.mouseRecorder.index && (var32 == null || var32.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = ClientPreferences.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = ClientPreferences.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field495 || var8 != field496) {
										if (var32 == null) {
											var32 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2686, packetWriter.isaacCipher);
											var32.packetBuffer.writeByte(0);
											var3 = var32.packetBuffer.offset;
											PacketBuffer var10000 = var32.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (-1L != field650) {
											var10 = var9 - field495;
											var11 = var8 - field496;
											var12 = (int)((ClientPreferences.mouseRecorder.millis[var7] - field650) / 20L);
											var5 = (int)((long)var5 + (ClientPreferences.mouseRecorder.millis[var7] - field650) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field495 = var9;
										field496 = var8;
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
										field650 = ClientPreferences.mouseRecorder.millis[var7];
									}
								}

								if (var32 != null) {
									var32.packetBuffer.method6918(var32.packetBuffer.offset - var3);
									var7 = var32.packetBuffer.offset;
									var32.packetBuffer.offset = var3;
									var32.packetBuffer.writeByte(var5 / var6);
									var32.packetBuffer.writeByte(var5 % var6);
									var32.packetBuffer.offset = var7;
									packetWriter.addNode(var32);
								}

								if (var4 >= ClientPreferences.mouseRecorder.index) {
									ClientPreferences.mouseRecorder.index = 0;
								} else {
									MouseRecorder var44 = ClientPreferences.mouseRecorder;
									var44.index -= var4;
									System.arraycopy(ClientPreferences.mouseRecorder.xs, var4, ClientPreferences.mouseRecorder.xs, 0, ClientPreferences.mouseRecorder.index);
									System.arraycopy(ClientPreferences.mouseRecorder.ys, var4, ClientPreferences.mouseRecorder.ys, 0, ClientPreferences.mouseRecorder.index);
									System.arraycopy(ClientPreferences.mouseRecorder.millis, var4, ClientPreferences.mouseRecorder.millis, 0, ClientPreferences.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var19;
						if (MouseHandler.MouseHandler_lastButton == 1 || !VarbitComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var17 > 32767L) {
								var17 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > MouseRecorder.canvasHeight) {
								var3 = MouseRecorder.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > Huffman.canvasWidth) {
								var4 = Huffman.canvasWidth;
							}

							var5 = (int)var17;
							var19 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2710, packetWriter.isaacCipher);
							var19.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var19.packetBuffer.writeShort(var4);
							var19.packetBuffer.writeShort(var3);
							packetWriter.addNode(var19);
						}

						if (KeyHandler.field136 > 0) {
							var15 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2667, packetWriter.isaacCipher);
							var15.packetBuffer.writeShort(0);
							var16 = var15.packetBuffer.offset;
							long var20 = UserComparator4.method2406();

							for (var5 = 0; var5 < KeyHandler.field136; ++var5) {
								long var22 = var20 - field719;
								if (var22 > 16777215L) {
									var22 = 16777215L;
								}

								field719 = var20;
								var15.packetBuffer.method7117(KeyHandler.field135[var5]);
								var15.packetBuffer.method6938((int)var22);
							}

							var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset - var16);
							packetWriter.addNode(var15);
						}

						if (field574 > 0) {
							--field574;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field575 = true;
						}

						if (field575 && field574 <= 0) {
							field574 = 20;
							field575 = false;
							var15 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2720, packetWriter.isaacCipher);
							var15.packetBuffer.method6931(camAngleY);
							var15.packetBuffer.writeShort(camAngleX);
							packetWriter.addNode(var15);
						}

						if (KitDefinition.hasFocus && !hadFocus) {
							hadFocus = true;
							var15 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2690, packetWriter.isaacCipher);
							var15.packetBuffer.writeByte(1);
							packetWriter.addNode(var15);
						}

						if (!KitDefinition.hasFocus && hadFocus) {
							hadFocus = false;
							var15 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2690, packetWriter.isaacCipher);
							var15.packetBuffer.writeByte(0);
							packetWriter.addNode(var15);
						}

						if (TileItem.worldMap != null) {
							TileItem.worldMap.method6417();
						}

						PacketWriter.method2354();
						SoundCache.method768();
						ModeWhere.method5487();
						if (gameState != 30) {
							return;
						}

						HorizontalAlignment.method3008();
						WorldMapData_0.method3441();
						++packetWriter.field1290;
						if (packetWriter.field1290 > 750) {
							class20.method302();
							return;
						}

						MouseHandler.method611();
						ChatChannel.method1985();
						int[] var38 = Players.Players_indices;

						for (var16 = 0; var16 < Players.Players_count; ++var16) {
							Player var24 = players[var38[var16]];
							if (var24 != null && var24.overheadTextCyclesRemaining > 0) {
								--var24.overheadTextCyclesRemaining;
								if (var24.overheadTextCyclesRemaining == 0) {
									var24.overheadText = null;
								}
							}
						}

						for (var16 = 0; var16 < npcCount; ++var16) {
							var3 = npcIndices[var16];
							NPC var25 = npcs[var3];
							if (var25 != null && var25.overheadTextCyclesRemaining > 0) {
								--var25.overheadTextCyclesRemaining;
								if (var25.overheadTextCyclesRemaining == 0) {
									var25.overheadText = null;
								}
							}
						}

						++field536;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (class7.field31 != null) {
							++field620;
							if (field620 >= 15) {
								class16.invalidateWidget(class7.field31);
								class7.field31 = null;
							}
						}

						Widget var39 = VarpDefinition.mousedOverWidgetIf1;
						Widget var33 = PlayerType.field3661;
						VarpDefinition.mousedOverWidgetIf1 = null;
						PlayerType.field3661 = null;
						draggedOnWidget = null;
						field671 = false;
						field595 = false;
						field726 = 0;

						while (CollisionMap.isKeyDown() && field726 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class4.field13 == 66) {
								String var41 = class78.method2062();
								class21.client.method450(var41);
							} else if (oculusOrbState != 1 || Skeleton.field2376 <= 0) {
								field718[field726] = class4.field13;
								field532[field726] = Skeleton.field2376;
								++field726;
							}
						}

						boolean var34 = staffModLevel >= 2;
						if (var34 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = class67.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class67.localPlayer.plane) {
								UrlRequest.method2386(class67.localPlayer.pathX[0] + WorldMapSectionType.baseX, class67.localPlayer.pathY[0] + PlayerComposition.baseY, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class87.updateRootInterface(rootInterface, 0, 0, Huffman.canvasWidth, MouseRecorder.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var26;
							Widget var40;
							ScriptEvent var42;
							do {
								var42 = (ScriptEvent)field731.removeLast();
								if (var42 == null) {
									while (true) {
										do {
											var42 = (ScriptEvent)field695.removeLast();
											if (var42 == null) {
												while (true) {
													do {
														var42 = (ScriptEvent)scriptEvents.removeLast();
														if (var42 == null) {
															this.menu();
															SequenceDefinition.method3381();
															if (clickedWidget != null) {
																this.method1349();
															}

															if (GameEngine.dragInventoryWidget != null) {
																class16.invalidateWidget(GameEngine.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field602) {
																		if (Projectile.hoveredItemContainer == GameEngine.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) {
																			Widget var43 = GameEngine.dragInventoryWidget;
																			byte var35 = 0;
																			if (field655 == 1 && var43.contentType == 206) {
																				var35 = 1;
																			}

																			if (var43.itemIds[dragItemSlotDestination] <= 0) {
																				var35 = 0;
																			}

																			if (class114.method2493(WorldMapRegion.getWidgetFlags(var43))) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				var43.itemIds[var7] = var43.itemIds[var6];
																				var43.itemQuantities[var7] = var43.itemQuantities[var6];
																				var43.itemIds[var6] = -1;
																				var43.itemQuantities[var6] = 0;
																			} else if (var35 == 1) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;

																				while (var6 != var7) {
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

																			var19 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2755, packetWriter.isaacCipher);
																			var19.packetBuffer.method7117(var35);
																			var19.packetBuffer.method7029(dragItemSlotSource);
																			var19.packetBuffer.method7029(dragItemSlotDestination);
																			var19.packetBuffer.writeInt(GameEngine.dragInventoryWidget.id);
																			packetWriter.addNode(var19);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		Renderable.method4395(draggedWidgetX, draggedWidgetY);
																	}

																	field620 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	GameEngine.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field602 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var19 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2703, packetWriter.isaacCipher);
																var19.packetBuffer.writeByte(5);
																var19.packetBuffer.method7029(var4 + WorldMapSectionType.baseX);
																var19.packetBuffer.method6931(var5 + PlayerComposition.baseY);
																var19.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																packetWriter.addNode(var19);
																Scene.method4243();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var39 != VarpDefinition.mousedOverWidgetIf1) {
																if (var39 != null) {
																	class16.invalidateWidget(var39);
																}

																if (VarpDefinition.mousedOverWidgetIf1 != null) {
																	class16.invalidateWidget(VarpDefinition.mousedOverWidgetIf1);
																}
															}

															if (var33 != PlayerType.field3661 && field642 == field557) {
																if (var33 != null) {
																	class16.invalidateWidget(var33);
																}

																if (PlayerType.field3661 != null) {
																	class16.invalidateWidget(PlayerType.field3661);
																}
															}

															if (PlayerType.field3661 != null) {
																if (field557 < field642) {
																	++field557;
																	if (field557 == field642) {
																		class16.invalidateWidget(PlayerType.field3661);
																	}
																}
															} else if (field557 > 0) {
																--field557;
															}

															int var27;
															if (oculusOrbState == 0) {
																var4 = class67.localPlayer.x;
																var5 = class67.localPlayer.y;
																if (class132.oculusOrbFocalPointX - var4 < -500 || class132.oculusOrbFocalPointX - var4 > 500 || LoginScreenAnimation.oculusOrbFocalPointY - var5 < -500 || LoginScreenAnimation.oculusOrbFocalPointY - var5 > 500) {
																	class132.oculusOrbFocalPointX = var4;
																	LoginScreenAnimation.oculusOrbFocalPointY = var5;
																}

																if (var4 != class132.oculusOrbFocalPointX) {
																	class132.oculusOrbFocalPointX += (var4 - class132.oculusOrbFocalPointX) / 16;
																}

																if (var5 != LoginScreenAnimation.oculusOrbFocalPointY) {
																	LoginScreenAnimation.oculusOrbFocalPointY += (var5 - LoginScreenAnimation.oculusOrbFocalPointY) / 16;
																}

																var6 = class132.oculusOrbFocalPointX >> 7;
																var7 = LoginScreenAnimation.oculusOrbFocalPointY >> 7;
																var8 = MidiPcmStream.getTileHeight(class132.oculusOrbFocalPointX, LoginScreenAnimation.oculusOrbFocalPointY, VertexNormal.Client_plane);
																var9 = 0;
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																			var12 = VertexNormal.Client_plane;
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																				++var12;
																			}

																			var27 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																			if (var27 > var9) {
																				var9 = var27;
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

																if (var10 > field565) {
																	field565 += (var10 - field565) / 24;
																} else if (var10 < field565) {
																	field565 += (var10 - field565) / 80;
																}

																class194.field2186 = MidiPcmStream.getTileHeight(class67.localPlayer.x, class67.localPlayer.y, VertexNormal.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																GrandExchangeOffer.method5422();
																short var36 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var36 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var36 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var36 == 0) {
																		var36 = 1792;
																	} else if (var36 == 1024) {
																		var36 = 1280;
																	} else {
																		var36 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var36 == 0) {
																		var36 = 256;
																	} else if (var36 == 1024) {
																		var36 = 768;
																	} else {
																		var36 = 512;
																	}
																}

																byte var37 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var37 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var37 = 1;
																}

																var6 = 0;
																if (var36 >= 0 || var37 != 0) {
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * 1796605093 * -601734355 : oculusOrbNormalSpeed * -1229982081 * -1571436161;
																	var6 *= 16;
																	field727 = var36;
																	field661 = var37;
																}

																if (field567 < var6) {
																	field567 += var6 / 8;
																	if (field567 > var6) {
																		field567 = var6;
																	}
																} else if (field567 > var6) {
																	field567 = field567 * 9 / 10;
																}

																if (field567 > 0) {
																	var7 = field567 / 16;
																	if (field727 >= 0) {
																		var4 = field727 - HealthBarUpdate.cameraYaw & 2047;
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																		class132.oculusOrbFocalPointX += var8 * var7 / 65536;
																		LoginScreenAnimation.oculusOrbFocalPointY += var9 * var7 / 65536;
																	}

																	if (field661 != 0) {
																		class194.field2186 += var7 * field661;
																		if (class194.field2186 > 0) {
																			class194.field2186 = 0;
																		}
																	}
																} else {
																	field727 = -1;
																	field661 = -1;
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	KitDefinition.method2956();
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && VarbitComposition.mouseCam) {
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var4 * 2;
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * -618093599 * 2082398241;
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var5 * 2;
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * 1104277309 * -782573547;
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
																var4 = PcmPlayer.field284 * 128 + 64;
																var5 = class120.field1408 * 128 + 64;
																var6 = MidiPcmStream.getTileHeight(var4, var5, VertexNormal.Client_plane) - PacketBufferNode.field2786;
																if (Canvas.cameraX < var4) {
																	Canvas.cameraX = (var4 - Canvas.cameraX) * class281.field3324 / 1000 + Canvas.cameraX + Login.field906;
																	if (Canvas.cameraX > var4) {
																		Canvas.cameraX = var4;
																	}
																}

																if (Canvas.cameraX > var4) {
																	Canvas.cameraX -= class281.field3324 * (Canvas.cameraX - var4) / 1000 + Login.field906;
																	if (Canvas.cameraX < var4) {
																		Canvas.cameraX = var4;
																	}
																}

																if (class14.cameraY < var6) {
																	class14.cameraY = (var6 - class14.cameraY) * class281.field3324 / 1000 + class14.cameraY + Login.field906;
																	if (class14.cameraY > var6) {
																		class14.cameraY = var6;
																	}
																}

																if (class14.cameraY > var6) {
																	class14.cameraY -= class281.field3324 * (class14.cameraY - var6) / 1000 + Login.field906;
																	if (class14.cameraY < var6) {
																		class14.cameraY = var6;
																	}
																}

																if (VarpDefinition.cameraZ < var5) {
																	VarpDefinition.cameraZ = (var5 - VarpDefinition.cameraZ) * class281.field3324 / 1000 + VarpDefinition.cameraZ + Login.field906;
																	if (VarpDefinition.cameraZ > var5) {
																		VarpDefinition.cameraZ = var5;
																	}
																}

																if (VarpDefinition.cameraZ > var5) {
																	VarpDefinition.cameraZ -= class281.field3324 * (VarpDefinition.cameraZ - var5) / 1000 + Login.field906;
																	if (VarpDefinition.cameraZ < var5) {
																		VarpDefinition.cameraZ = var5;
																	}
																}

																var4 = Varcs.field1272 * 128 + 64;
																var5 = World.field774 * 128 + 64;
																var6 = MidiPcmStream.getTileHeight(var4, var5, VertexNormal.Client_plane) - class9.field44;
																var7 = var4 - Canvas.cameraX;
																var8 = var6 - class14.cameraY;
																var9 = var5 - VarpDefinition.cameraZ;
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047;
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
																if (var11 < 128) {
																	var11 = 128;
																}

																if (var11 > 383) {
																	var11 = 383;
																}

																if (WorldMapIcon_1.cameraPitch < var11) {
																	WorldMapIcon_1.cameraPitch = (var11 - WorldMapIcon_1.cameraPitch) * AbstractArchive.field3712 / 1000 + WorldMapIcon_1.cameraPitch + SequenceDefinition.field1954;
																	if (WorldMapIcon_1.cameraPitch > var11) {
																		WorldMapIcon_1.cameraPitch = var11;
																	}
																}

																if (WorldMapIcon_1.cameraPitch > var11) {
																	WorldMapIcon_1.cameraPitch -= AbstractArchive.field3712 * (WorldMapIcon_1.cameraPitch - var11) / 1000 + SequenceDefinition.field1954;
																	if (WorldMapIcon_1.cameraPitch < var11) {
																		WorldMapIcon_1.cameraPitch = var11;
																	}
																}

																var27 = var12 - HealthBarUpdate.cameraYaw;
																if (var27 > 1024) {
																	var27 -= 2048;
																}

																if (var27 < -1024) {
																	var27 += 2048;
																}

																if (var27 > 0) {
																	HealthBarUpdate.cameraYaw = HealthBarUpdate.cameraYaw + SequenceDefinition.field1954 + var27 * AbstractArchive.field3712 / 1000;
																	HealthBarUpdate.cameraYaw &= 2047;
																}

																if (var27 < 0) {
																	HealthBarUpdate.cameraYaw -= -var27 * AbstractArchive.field3712 / 1000 + SequenceDefinition.field1954;
																	HealthBarUpdate.cameraYaw &= 2047;
																}

																int var14 = var12 - HealthBarUpdate.cameraYaw;
																if (var14 > 1024) {
																	var14 -= 2048;
																}

																if (var14 < -1024) {
																	var14 += 2048;
																}

																if (var14 < 0 && var27 > 0 || var14 > 0 && var27 < 0) {
																	HealthBarUpdate.cameraYaw = var12;
																}
															}

															for (var4 = 0; var4 < 5; ++var4) {
																int var10002 = field743[var4]++;
															}

															Tile.varcs.tryWrite();
															var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
															var6 = JagexCache.method2815();
															PacketBufferNode var28;
															if (var4 > 15000 && var6 > 15000) {
																logoutTimer = 250;
																class130.method2677(14500);
																var28 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2727, packetWriter.isaacCipher);
																packetWriter.addNode(var28);
															}

															Message.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var28 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2706, packetWriter.isaacCipher);
																packetWriter.addNode(var28);
															}

															try {
																packetWriter.flush();
															} catch (IOException var29) {
																class20.method302();
															}

															return;
														}

														var26 = var42.widget;
														if (var26.childIndex < 0) {
															break;
														}

														var40 = HealthBarUpdate.getWidget(var26.parentId);
													} while(var40 == null || var40.children == null || var26.childIndex >= var40.children.length || var26 != var40.children[var26.childIndex]);

													ViewportMouse.runScriptEvent(var42);
												}
											}

											var26 = var42.widget;
											if (var26.childIndex < 0) {
												break;
											}

											var40 = HealthBarUpdate.getWidget(var26.parentId);
										} while(var40 == null || var40.children == null || var26.childIndex >= var40.children.length || var26 != var40.children[var26.childIndex]);

										ViewportMouse.runScriptEvent(var42);
									}
								}

								var26 = var42.widget;
								if (var26.childIndex < 0) {
									break;
								}

								var40 = HealthBarUpdate.getWidget(var26.parentId);
							} while(var40 == null || var40.children == null || var26.childIndex >= var40.children.length || var26 != var40.children[var26.childIndex]);

							ViewportMouse.runScriptEvent(var42);
						}
					}

					var32 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2704, packetWriter.isaacCipher);
					var32.packetBuffer.writeByte(0);
					var3 = var32.packetBuffer.offset;
					KitDefinition.performReflectionCheck(var32.packetBuffer);
					var32.packetBuffer.method6918(var32.packetBuffer.offset - var3);
					packetWriter.addNode(var32);
				}
			}
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "295331823"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = Huffman.canvasWidth;
		int var2 = MouseRecorder.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (WorldMapDecorationType.clientPreferences != null) {
			try {
				class27.method406(class21.client, "resize", new Object[]{class12.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1818223582"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (GrandExchangeOfferTotalQuantityComparator.loadInterface(var1)) {
				class9.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field710[var1]) {
				field701[var1] = true;
			}

			field525[var1] = field710[var1];
			field710[var1] = false;
		}

		field699 = cycle;
		viewportX = -1;
		viewportY = -1;
		Projectile.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Canvas.drawWidgets(rootInterface, 0, 0, Huffman.canvasWidth, MouseRecorder.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				SecureRandomFuture.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				SecureRandomFuture.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				int var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					int var3 = menuOptionsCount - 1;
					String var5;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var5 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var6;
						if (var3 < 0) {
							var6 = "";
						} else if (menuTargets[var3].length() > 0) {
							var6 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var6 = menuActions[var3];
						}

						var5 = var6;
					}

					if (menuOptionsCount > 2) {
						var5 = var5 + FloorUnderlayDefinition.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					Interpreter.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			SecureRandomCallable.method2035();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field525[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field701[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class194.method3875(VertexNormal.Client_plane, class67.localPlayer.x, class67.localPlayer.y, field536);
		field536 = 0;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lcc;I)Z",
		garbageValue = "-382316023"
	)
	final boolean method1307(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var18;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1289) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1290 = 0;
						var1.field1289 = false;
					}

					var3.offset = 0;
					if (var3.method6848()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1290 = 0;
					}

					var1.field1289 = true;
					ServerPacket[] var4 = WallDecoration.ServerPacket_values();
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
				var1.field1290 = 0;
				timer.method5903();
				var1.field1288 = var1.field1293;
				var1.field1293 = var1.field1281;
				var1.field1281 = var1.serverPacket;
				int var17;
				Widget var63;
				if (ServerPacket.field2862 == var1.serverPacket) {
					var17 = var3.method6944();
					var63 = HealthBarUpdate.getWidget(var17);

					for (var6 = 0; var6 < var63.itemIds.length; ++var6) {
						var63.itemIds[var6] = -1;
						var63.itemIds[var6] = 0;
					}

					class16.invalidateWidget(var63);
					var1.serverPacket = null;
					return true;
				}

				byte var68;
				if (ServerPacket.field2809 == var1.serverPacket) {
					AbstractArchive.method5325();
					var68 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var68 >= 0) {
							currentClanSettings[var68] = null;
						} else {
							class114.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var68 >= 0) {
						currentClanSettings[var68] = new ClanSettings(var3);
					} else {
						class114.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2881 == var1.serverPacket) {
					field594 = cycleCntr;
					var68 = var3.readByte();
					class133 var73 = new class133(var3);
					ClanChannel var77;
					if (var68 >= 0) {
						var77 = currentClanChannels[var68];
					} else {
						var77 = GrandExchangeOfferNameComparator.guestClanChannel;
					}

					var73.method2701(var77);
					var1.serverPacket = null;
					return true;
				}

				boolean var64;
				if (ServerPacket.field2847 == var1.serverPacket) {
					var64 = var3.readUnsignedByte() == 1;
					if (var64) {
						class119.field1395 = UserComparator4.method2406() - var3.readLong();
						class6.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class6.grandExchangeEvents = null;
					}

					field489 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var9;
				if (ServerPacket.field2844 == var1.serverPacket) {
					var17 = var3.method6933();
					var5 = var3.method6945();
					var6 = var17 >> 10 & 31;
					var7 = var17 >> 5 & 31;
					var8 = var17 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var54 = HealthBarUpdate.getWidget(var5);
					if (var9 != var54.color) {
						var54.color = var9;
						class16.invalidateWidget(var54);
					}

					var1.serverPacket = null;
					return true;
				}

				String var76;
				if (ServerPacket.field2861 == var1.serverPacket) {
					byte[] var50 = new byte[var1.serverPacketLength];
					var3.method6853(var50, 0, var50.length);
					Buffer var71 = new Buffer(var50);
					var76 = var71.readStringCp1252NullTerminated();
					LoginScreenAnimation.openURL(var76, true, false);
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var20;
				if (ServerPacket.field2820 == var1.serverPacket) {
					var17 = var3.method7059();
					var5 = var3.method6927();
					var6 = var3.method6876();
					var20 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var20 != null) {
						WorldMapLabelSize.closeInterface(var20, var17 != var20.group);
					}

					class4.method23(var6, var17, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2802 == var1.serverPacket) {
					class295.method5382(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				Widget var21;
				if (ServerPacket.field2794 == var1.serverPacket) {
					var17 = var3.method6945();
					var5 = var3.method6933();
					var6 = var3.readUnsignedShort();
					var7 = var3.method7059();
					var21 = HealthBarUpdate.getWidget(var17);
					if (var7 != var21.modelAngleX || var6 != var21.modelAngleY || var5 != var21.modelZoom) {
						var21.modelAngleX = var7;
						var21.modelAngleY = var6;
						var21.modelZoom = var5;
						class16.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var69;
				if (ServerPacket.field2865 == var1.serverPacket) {
					var17 = var3.method6945();
					var5 = var3.method6937();
					var6 = var3.method6936();
					var69 = HealthBarUpdate.getWidget(var17);
					if (var6 != var69.rawX || var5 != var69.rawY || var69.xAlignment != 0 || var69.yAlignment != 0) {
						var69.rawX = var6;
						var69.rawY = var5;
						var69.xAlignment = 0;
						var69.yAlignment = 0;
						class16.invalidateWidget(var69);
						this.alignWidget(var69);
						if (var69.type == 0) {
							TaskHandler.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var17 >> 16], var69, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2853 == var1.serverPacket) {
					class120.method2530();
					var17 = var3.method6927();
					var5 = var3.method6926();
					var6 = var3.method6876();
					experience[var17] = var6;
					currentLevels[var17] = var5;
					levels[var17] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var6 >= Skills.Skills_experienceTable[var7]) {
							levels[var17] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var17;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2815 == var1.serverPacket) {
					WorldMapArea.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2828 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						class264.friendsChat = null;
					} else {
						if (class264.friendsChat == null) {
							class264.friendsChat = new FriendsChat(WorldMapSectionType.loginType, class21.client);
						}

						class264.friendsChat.readUpdate(var3);
					}

					Archive.method5187();
					var1.serverPacket = null;
					return true;
				}

				long var12;
				int var15;
				long var22;
				long var24;
				long var26;
				String var28;
				String var46;
				if (ServerPacket.field2864 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var22 = var3.readLong();
					var24 = (long)var3.readUnsignedShort();
					var26 = (long)var3.readMedium();
					PlayerType var51 = (PlayerType)class128.findEnumerated(class19.PlayerType_values(), var3.readUnsignedByte());
					var12 = var26 + (var24 << 32);
					boolean var57 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var12) {
							var57 = true;
							break;
						}
					}

					if (var51.isUser && Message.friendSystem.isIgnored(new Username(var46, WorldMapSectionType.loginType))) {
						var57 = true;
					}

					if (!var57 && field559 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var12;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var28 = AbstractFont.escapeBrackets(Tiles.method2025(SecureRandomFuture.method1951(var3)));
						if (var51.modIcon != -1) {
							Players.addChatMessage(9, ReflectionCheck.method1064(var51.modIcon) + var46, var28, FloorDecoration.base37DecodeLong(var22));
						} else {
							Players.addChatMessage(9, var46, var28, FloorDecoration.base37DecodeLong(var22));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2845 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2773);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2824 == var1.serverPacket) {
					var64 = var3.readBoolean();
					if (var64) {
						if (Widget.field3165 == null) {
							Widget.field3165 = new class300();
						}
					} else {
						Widget.field3165 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var19;
				if (ServerPacket.field2799 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var19 = HealthBarUpdate.getWidget(var5);
					if (!var46.equals(var19.text)) {
						var19.text = var46;
						class16.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2810 == var1.serverPacket) {
					Coord.field3013 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2839 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var18 = AbstractFont.escapeBrackets(Tiles.method2025(SecureRandomFuture.method1951(var3)));
					GraphicsDefaults.addGameMessage(6, var46, var18);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2841 == var1.serverPacket) {
					UrlRequest.field1313 = var3.method6927();
					WorldMapElement.field1622 = var3.method6926();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2859 == var1.serverPacket) {
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) {
						if (Varps.Varps_temp[var17] != Varps.Varps_main[var17]) {
							Varps.Varps_main[var17] = Varps.Varps_temp[var17];
							NetSocket.changeGameOptions(var17);
							changedVarps[++changedVarpCount - 1 & 31] = var17;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2852 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2772);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2829 == var1.serverPacket) {
					if (class264.friendsChat != null) {
						class264.friendsChat.method5971(var3);
					}

					Archive.method5187();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2787 == var1.serverPacket) {
					UrlRequest.field1313 = var3.method6926();
					WorldMapElement.field1622 = var3.readUnsignedByte();

					for (var17 = UrlRequest.field1313; var17 < UrlRequest.field1313 + 8; ++var17) {
						for (var5 = WorldMapElement.field1622; var5 < WorldMapElement.field1622 + 8; ++var5) {
							if (groundItems[VertexNormal.Client_plane][var17][var5] != null) {
								groundItems[VertexNormal.Client_plane][var17][var5] = null;
								HealthBarUpdate.updateItemPile(var17, var5);
							}
						}
					}

					for (PendingSpawn var49 = (PendingSpawn)pendingSpawns.last(); var49 != null; var49 = (PendingSpawn)pendingSpawns.previous()) {
						if (var49.x >= UrlRequest.field1313 && var49.x < UrlRequest.field1313 + 8 && var49.y >= WorldMapElement.field1622 && var49.y < WorldMapElement.field1622 + 8 && var49.plane == VertexNormal.Client_plane) {
							var49.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2866 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class120.method2533(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2797 == var1.serverPacket) {
					var17 = var3.method6934();
					rootInterface = var17;
					this.resizeRoot(false);
					class17.Widget_resetModelFrames(var17);
					WorldMapScaleHandler.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field710[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2813 == var1.serverPacket) {
					isCameraLocked = false;

					for (var17 = 0; var17 < 5; ++var17) {
						field739[var17] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2879 == var1.serverPacket) {
					var17 = var3.readUShortSmart();
					boolean var58 = var3.readUnsignedByte() == 1;
					var76 = "";
					boolean var52 = false;
					if (var58) {
						var76 = var3.readStringCp1252NullTerminated();
						if (Message.friendSystem.isIgnored(new Username(var76, WorldMapSectionType.loginType))) {
							var52 = true;
						}
					}

					String var75 = var3.readStringCp1252NullTerminated();
					if (!var52) {
						GraphicsDefaults.addGameMessage(var17, var76, var75);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2869 == var1.serverPacket) {
					Message.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					SceneTilePaint.FriendSystem_invalidateIgnoreds();
					field685 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2873 == var1.serverPacket) {
					World var48 = new World();
					var48.host = var3.readStringCp1252NullTerminated();
					var48.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var48.properties = var5;
					UserList.updateGameState(45);
					var2.close();
					var2 = null;
					World.changeWorld(var48);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2801 == var1.serverPacket) {
					Message.friendSystem.method1651();
					field685 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2835 == var1.serverPacket) {
					var68 = var3.readByte();
					var5 = var3.method6933();
					Varps.Varps_temp[var5] = var68;
					if (Varps.Varps_main[var5] != var68) {
						Varps.Varps_main[var5] = var68;
					}

					NetSocket.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2877 == var1.serverPacket) {
					AbstractByteArrayCopier.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2874 == var1.serverPacket) {
					AttackOption.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2882 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2767);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2830 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2768);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2876 == var1.serverPacket) {
					rebootTimer = var3.method6933() * 30;
					field691 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				int var29;
				if (ServerPacket.field2814 == var1.serverPacket) {
					isCameraLocked = true;
					Varcs.field1272 = var3.readUnsignedByte();
					World.field774 = var3.readUnsignedByte();
					class9.field44 = var3.readUnsignedShort();
					SequenceDefinition.field1954 = var3.readUnsignedByte();
					AbstractArchive.field3712 = var3.readUnsignedByte();
					if (AbstractArchive.field3712 >= 100) {
						var17 = Varcs.field1272 * 128 + 64;
						var5 = World.field774 * 128 + 64;
						var6 = MidiPcmStream.getTileHeight(var17, var5, VertexNormal.Client_plane) - class9.field44;
						var7 = var17 - Canvas.cameraX;
						var8 = var6 - class14.cameraY;
						var9 = var5 - VarpDefinition.cameraZ;
						var29 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
						WorldMapIcon_1.cameraPitch = (int)(Math.atan2((double)var8, (double)var29) * 325.949D) & 2047;
						HealthBarUpdate.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
						if (WorldMapIcon_1.cameraPitch < 128) {
							WorldMapIcon_1.cameraPitch = 128;
						}

						if (WorldMapIcon_1.cameraPitch > 383) {
							WorldMapIcon_1.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2867 == var1.serverPacket) {
					var17 = var3.method7059();
					var5 = var3.readInt();
					var19 = HealthBarUpdate.getWidget(var5);
					if (var19.modelType != 1 || var17 != var19.modelId) {
						var19.modelType = 1;
						var19.modelId = var17;
						class16.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2849 == var1.serverPacket) {
					WorldMapArea.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2791 == var1.serverPacket) {
					Coord.field3013 = new class353(WorldMapIcon_1.HitSplatDefinition_cachedSprites);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2875 == var1.serverPacket) {
					class120.method2530();
					runEnergy = var3.readUnsignedByte();
					field691 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2804 == var1.serverPacket) {
					var17 = var3.method6945();
					var5 = var3.method6944();
					var6 = var3.readUnsignedShort();
					if (var6 == 65535) {
						var6 = -1;
					}

					var69 = HealthBarUpdate.getWidget(var5);
					ItemComposition var74;
					if (!var69.isIf3) {
						if (var6 == -1) {
							var69.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var74 = class87.ItemDefinition_get(var6);
						var69.modelType = 4;
						var69.modelId = var6;
						var69.modelAngleX = var74.xan2d;
						var69.modelAngleY = var74.yan2d;
						var69.modelZoom = var74.zoom2d * 100 / var17;
						class16.invalidateWidget(var69);
					} else {
						var69.itemId = var6;
						var69.itemQuantity = var17;
						var74 = class87.ItemDefinition_get(var6);
						var69.modelAngleX = var74.xan2d;
						var69.modelAngleY = var74.yan2d;
						var69.modelAngleZ = var74.zan2d;
						var69.modelOffsetX = var74.offsetX2d;
						var69.modelOffsetY = var74.offsetY2d;
						var69.modelZoom = var74.zoom2d;
						if (var74.isStackable == 1) {
							var69.itemQuantityMode = 1;
						} else {
							var69.itemQuantityMode = 2;
						}

						if (var69.field3102 > 0) {
							var69.modelZoom = var69.modelZoom * 32 / var69.field3102;
						} else if (var69.rawWidth > 0) {
							var69.modelZoom = var69.modelZoom * 32 / var69.rawWidth;
						}

						class16.invalidateWidget(var69);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2834 == var1.serverPacket) {
					var17 = var3.readInt();
					InterfaceParent var67 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var67 != null) {
						WorldMapLabelSize.closeInterface(var67, true);
					}

					if (meslayerContinueWidget != null) {
						class16.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2872 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2775);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2806 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var19 = HealthBarUpdate.getWidget(var17);
					} else {
						var19 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class65.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var19 != null && var7 >= 0 && var7 < var19.itemIds.length) {
							var19.itemIds[var7] = var8;
							var19.itemQuantities[var7] = var9;
						}
					}

					if (var19 != null) {
						class16.invalidateWidget(var19);
					}

					class120.method2530();
					changedItemContainers[++field679 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2798 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2771);
					var1.serverPacket = null;
					return true;
				}

				String var34;
				int var56;
				if (ServerPacket.field2846 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					var22 = (long)var3.readUnsignedShort();
					var24 = (long)var3.readMedium();
					PlayerType var30 = (PlayerType)class128.findEnumerated(class19.PlayerType_values(), var3.readUnsignedByte());
					long var31 = (var22 << 32) + var24;
					boolean var33 = false;

					for (var56 = 0; var56 < 100; ++var56) {
						if (var31 == crossWorldMessageIds[var56]) {
							var33 = true;
							break;
						}
					}

					if (Message.friendSystem.isIgnored(new Username(var46, WorldMapSectionType.loginType))) {
						var33 = true;
					}

					if (!var33 && field559 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var31;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = AbstractFont.escapeBrackets(Tiles.method2025(SecureRandomFuture.method1951(var3)));
						byte var55;
						if (var30.isPrivileged) {
							var55 = 7;
						} else {
							var55 = 3;
						}

						if (var30.modIcon != -1) {
							GraphicsDefaults.addGameMessage(var55, ReflectionCheck.method1064(var30.modIcon) + var46, var34);
						} else {
							GraphicsDefaults.addGameMessage(var55, var46, var34);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2833 == var1.serverPacket) {
					var68 = var3.readByte();
					var22 = (long)var3.readUnsignedShort();
					var24 = (long)var3.readMedium();
					var26 = (var22 << 32) + var24;
					boolean var78 = false;
					ClanChannel var36 = var68 >= 0 ? currentClanChannels[var68] : GrandExchangeOfferNameComparator.guestClanChannel;
					if (var36 == null) {
						var78 = true;
					} else {
						for (var56 = 0; var56 < 100; ++var56) {
							if (var26 == crossWorldMessageIds[var56]) {
								var78 = true;
								break;
							}
						}
					}

					if (!var78) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var26;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = SecureRandomFuture.method1951(var3);
						int var14 = var68 >= 0 ? 43 : 46;
						Players.addChatMessage(var14, "", var34, var36.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2792 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					var6 = Frames.getGcDuration();
					PacketBufferNode var72 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2732, packetWriter.isaacCipher);
					var72.packetBuffer.method7117(var6);
					var72.packetBuffer.method7066(GameEngine.fps);
					var72.packetBuffer.writeIntME(var17);
					var72.packetBuffer.method6940(var5);
					packetWriter.addNode(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2837 == var1.serverPacket) {
					if (Coord.field3013 == null) {
						Coord.field3013 = new class353(WorldMapIcon_1.HitSplatDefinition_cachedSprites);
					}

					class408 var47 = WorldMapIcon_1.HitSplatDefinition_cachedSprites.method6309(var3);
					Coord.field3013.field4042.vmethod6669(var47.field4354, var47.field4353);
					field682[++field683 - 1 & 31] = var47.field4354;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2818 == var1.serverPacket) {
					class120.method2530();
					weight = var3.readShort();
					field691 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2860 == var1.serverPacket) {
					class14.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2823 == var1.serverPacket) {
					if (rootInterface != -1) {
						ItemContainer.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2843 == var1.serverPacket) {
					var17 = var3.method6945();
					var5 = var3.method6934();
					var19 = HealthBarUpdate.getWidget(var17);
					if (var19 != null && var19.type == 0) {
						if (var5 > var19.scrollHeight - var19.height) {
							var5 = var19.scrollHeight - var19.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var19.scrollY) {
							var19.scrollY = var5;
							class16.invalidateWidget(var19);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2805 == var1.serverPacket) {
					Message.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field685 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2819 == var1.serverPacket) {
					var68 = var3.readByte();
					var18 = var3.readStringCp1252NullTerminated();
					long var37 = (long)var3.readUnsignedShort();
					long var39 = (long)var3.readMedium();
					PlayerType var53 = (PlayerType)class128.findEnumerated(class19.PlayerType_values(), var3.readUnsignedByte());
					long var41 = (var37 << 32) + var39;
					boolean var13 = false;
					ClanChannel var43 = null;
					var43 = var68 >= 0 ? currentClanChannels[var68] : GrandExchangeOfferNameComparator.guestClanChannel;
					if (var43 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var53.isUser && Message.friendSystem.isIgnored(new Username(var18, WorldMapSectionType.loginType))) {
									var13 = true;
								}
								break;
							}

							if (var41 == crossWorldMessageIds[var15]) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var28 = AbstractFont.escapeBrackets(SecureRandomFuture.method1951(var3));
						int var16 = var68 >= 0 ? 41 : 44;
						if (var53.modIcon != -1) {
							Players.addChatMessage(var16, ReflectionCheck.method1064(var53.modIcon) + var18, var28, var43.name);
						} else {
							Players.addChatMessage(var16, var18, var28, var43.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2790 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var17] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false);
					}

					field577 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2816 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2826 == var1.serverPacket) {
					var17 = var3.method6934();
					if (var17 == 65535) {
						var17 = -1;
					}

					WorldMapSprite.playSong(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2811 == var1.serverPacket) {
					var17 = var3.method6934();
					if (var17 == 65535) {
						var17 = -1;
					}

					var5 = var3.method6939();
					PcmPlayer.method741(var17, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2840 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var76 = var3.readStringCp1252NullTerminated();
					if (var17 >= 1 && var17 <= 8) {
						if (var76.equalsIgnoreCase("null")) {
							var76 = null;
						}

						playerMenuActions[var17 - 1] = var76;
						playerOptionsPriorities[var17 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2827 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2770);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2831 == var1.serverPacket) {
					var17 = var3.method6933();
					PacketBufferNode.method4653(var17);
					changedItemContainers[++field679 - 1 & 31] = var17 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2880 == var1.serverPacket) {
					field594 = cycleCntr;
					var68 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var68 >= 0) {
							currentClanChannels[var68] = null;
						} else {
							GrandExchangeOfferNameComparator.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var68 >= 0) {
						currentClanChannels[var68] = new ClanChannel(var3);
					} else {
						GrandExchangeOfferNameComparator.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2789 == var1.serverPacket) {
					var17 = var3.method6944();
					var63 = HealthBarUpdate.getWidget(var17);
					var63.modelType = 3;
					var63.modelId = class67.localPlayer.appearance.getChatHeadId();
					class16.invalidateWidget(var63);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2858 == var1.serverPacket) {
					var17 = var3.readInt();
					if (var17 != field572) {
						field572 = var17;
						HealthBar.method2221();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2795 == var1.serverPacket) {
					ClientPreferences.updatePlayers(var3, var1.serverPacketLength);
					class17.method266();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2854 == var1.serverPacket) {
					for (var17 = 0; var17 < VarpDefinition.VarpDefinition_fileCount; ++var17) {
						VarpDefinition var62 = ApproximateRouteStrategy.VarpDefinition_get(var17);
						if (var62 != null) {
							Varps.Varps_temp[var17] = 0;
							Varps.Varps_main[var17] = 0;
						}
					}

					class120.method2530();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2850 == var1.serverPacket) {
					var17 = var3.method6937();
					var5 = var3.method6944();
					var19 = HealthBarUpdate.getWidget(var5);
					if (var17 != var19.sequenceId || var17 == -1) {
						var19.sequenceId = var17;
						var19.modelFrame = 0;
						var19.modelFrameCycle = 0;
						class16.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2808 == var1.serverPacket) {
					class14.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2832 == var1.serverPacket) {
					var17 = var3.method6933();
					var5 = var3.method6944();
					var19 = HealthBarUpdate.getWidget(var5);
					if (var19.modelType != 2 || var17 != var19.modelId) {
						var19.modelType = 2;
						var19.modelId = var17;
						class16.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2855 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2769);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2868 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class184.queueSoundEffect(var17, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2793 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2776);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2863 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.method6933();
					var6 = var3.method6876();
					var69 = HealthBarUpdate.getWidget(var6);
					var69.field3038 = var17 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2838 == var1.serverPacket) {
					publicChatMode = var3.method6927();
					tradeChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2817 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					class322.method5894(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2848 == var1.serverPacket) {
					var17 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class17.Widget_resetModelFrames(rootInterface);
						WorldMapScaleHandler.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field710[var7] = true;
						}
					}

					InterfaceParent var10;
					for (; var6-- > 0; var10.field1031 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var10 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var10 != null && var8 != var10.group) {
							WorldMapLabelSize.closeInterface(var10, true);
							var10 = null;
						}

						if (var10 == null) {
							var10 = class4.method23(var7, var8, var9);
						}
					}

					for (var20 = (InterfaceParent)interfaceParents.first(); var20 != null; var20 = (InterfaceParent)interfaceParents.next()) {
						if (var20.field1031) {
							var20.field1031 = false;
						} else {
							WorldMapLabelSize.closeInterface(var20, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var17) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var29 = var3.readInt();

						for (int var35 = var8; var35 <= var9; ++var35) {
							var12 = ((long)var7 << 32) + (long)var35;
							widgetFlags.put(new IntegerNode(var29), var12);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2856 == var1.serverPacket) {
					var17 = var3.method6876();
					var5 = var3.method6934();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readInt();
					var7 = var3.method6933();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var8 = var5; var8 <= var7; ++var8) {
						var26 = ((long)var6 << 32) + (long)var8;
						Node var11 = widgetFlags.get(var26);
						if (var11 != null) {
							var11.remove();
						}

						widgetFlags.put(new IntegerNode(var17), var26);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2800 == var1.serverPacket) {
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

				if (ServerPacket.field2857 == var1.serverPacket) {
					AbstractArchive.method5325();
					var68 = var3.readByte();
					class119 var61 = new class119(var3);
					ClanSettings var70;
					if (var68 >= 0) {
						var70 = currentClanSettings[var68];
					} else {
						var70 = class114.guestClanSettings;
					}

					var61.method2522(var70);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2812 == var1.serverPacket) {
					WorldMapElement.field1622 = var3.method6926();
					UrlRequest.field1313 = var3.method6927();

					while (var3.offset < var1.serverPacketLength) {
						var17 = var3.readUnsignedByte();
						class240 var60 = ClientPreferences.method2209()[var17];
						HealthBarDefinition.method2981(var60);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2796 == var1.serverPacket) {
					var64 = var3.method6926() == 1;
					var5 = var3.method6944();
					var19 = HealthBarUpdate.getWidget(var5);
					if (var64 != var19.isHidden) {
						var19.isHidden = var64;
						class16.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2803 == var1.serverPacket) {
					var46 = var3.readStringCp1252NullTerminated();
					Object[] var59 = new Object[var46.length() + 1];

					for (var6 = var46.length() - 1; var6 >= 0; --var6) {
						if (var46.charAt(var6) == 's') {
							var59[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var59[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var59[0] = new Integer(var3.readInt());
					ScriptEvent var66 = new ScriptEvent();
					var66.args = var59;
					ViewportMouse.runScriptEvent(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2878 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field739[var17] = true;
					field740[var17] = var5;
					field741[var17] = var6;
					field742[var17] = var7;
					field743[var17] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2822 == var1.serverPacket) {
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

				if (ServerPacket.field2788 == var1.serverPacket) {
					HealthBarDefinition.method2981(class240.field2774);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2871 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.method6876();
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var17);
					var20 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var20 != null) {
						WorldMapLabelSize.closeInterface(var20, var65 == null || var20.group != var65.group);
					}

					if (var65 != null) {
						var65.remove();
						interfaceParents.put(var65, (long)var5);
					}

					var21 = HealthBarUpdate.getWidget(var17);
					if (var21 != null) {
						class16.invalidateWidget(var21);
					}

					var21 = HealthBarUpdate.getWidget(var5);
					if (var21 != null) {
						class16.invalidateWidget(var21);
						TaskHandler.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var21.id >>> 16], var21, true);
					}

					if (rootInterface != -1) {
						ItemContainer.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2842 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var19 = HealthBarUpdate.getWidget(var17);
					} else {
						var19 = null;
					}

					if (var19 != null) {
						for (var7 = 0; var7 < var19.itemIds.length; ++var7) {
							var19.itemIds[var7] = 0;
							var19.itemQuantities[var7] = 0;
						}
					}

					Language.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.method6925();
						if (var9 == 255) {
							var9 = var3.method6945();
						}

						var29 = var3.method7059();
						if (var19 != null && var8 < var19.itemIds.length) {
							var19.itemIds[var8] = var29;
							var19.itemQuantities[var8] = var9;
						}

						class65.itemContainerSetItem(var5, var8, var29 - 1, var9);
					}

					if (var19 != null) {
						class16.invalidateWidget(var19);
					}

					class120.method2530();
					changedItemContainers[++field679 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2870 == var1.serverPacket) {
					MusicPatchNode2.privateChatMode = class129.method2671(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2836 == var1.serverPacket) {
					isCameraLocked = true;
					PcmPlayer.field284 = var3.readUnsignedByte();
					class120.field1408 = var3.readUnsignedByte();
					PacketBufferNode.field2786 = var3.readUnsignedShort();
					Login.field906 = var3.readUnsignedByte();
					class281.field3324 = var3.readUnsignedByte();
					if (class281.field3324 >= 100) {
						Canvas.cameraX = PcmPlayer.field284 * 128 + 64;
						VarpDefinition.cameraZ = class120.field1408 * 128 + 64;
						class14.cameraY = MidiPcmStream.getTileHeight(Canvas.cameraX, VarpDefinition.cameraZ, VertexNormal.Client_plane) - PacketBufferNode.field2786;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2851 == var1.serverPacket) {
					var17 = var3.method6945();
					var5 = var3.method6933();
					Varps.Varps_temp[var5] = var17;
					if (Varps.Varps_main[var5] != var17) {
						Varps.Varps_main[var5] = var17;
					}

					NetSocket.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2807 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					Script.forceDisconnect(var17);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2821 == var1.serverPacket) {
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

				Timer.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -215332077 * -971819237 : -1) + "," + (var1.field1293 != null ? var1.field1293.id * -215332077 * -971819237 : -1) + "," + (var1.field1288 != null ? var1.field1288.id * -215332077 * -971819237 : -1) + "," + var1.serverPacketLength, (Throwable)null);
				AttackOption.logOut();
			} catch (IOException var44) {
				class20.method302();
			} catch (Exception var45) {
				var18 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -215332077 * -971819237 : -1) + "," + (var1.field1293 != null ? var1.field1293.id * -215332077 * -971819237 : -1) + "," + (var1.field1288 != null ? var1.field1288.id * -215332077 * -971819237 : -1) + "," + var1.serverPacketLength + "," + (class67.localPlayer.pathX[0] + WorldMapSectionType.baseX) + "," + (class67.localPlayer.pathY[0] + PlayerComposition.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var18 = var18 + var3.array[var6] + ",";
				}

				Timer.RunException_sendStackTrace(var18, var45);
				AttackOption.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
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
					String var18 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var18;
					String var19 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var19;
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

		if (GameEngine.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var21;
				label302: {
					int var20 = MouseHandler.MouseHandler_lastButton;
					int var4;
					int var9;
					int var14;
					if (isMenuOpen) {
						int var3;
						int var22;
						if (var20 != 1 && (VarbitComposition.mouseCam || var20 != 4)) {
							var2 = MouseHandler.MouseHandler_x;
							var3 = MouseHandler.MouseHandler_y;
							if (var2 < LoginScreenAnimation.menuX - 10 || var2 > LoginScreenAnimation.menuX + UserComparator7.menuWidth + 10 || var3 < class392.menuY - 10 || var3 > class392.menuY + ApproximateRouteStrategy.menuHeight + 10) {
								isMenuOpen = false;
								var4 = LoginScreenAnimation.menuX;
								var5 = class392.menuY;
								var21 = UserComparator7.menuWidth;
								var14 = ApproximateRouteStrategy.menuHeight;

								for (var22 = 0; var22 < rootWidgetCount; ++var22) {
									if (rootWidgetWidths[var22] + rootWidgetXs[var22] > var4 && rootWidgetXs[var22] < var21 + var4 && rootWidgetYs[var22] + rootWidgetHeights[var22] > var5 && rootWidgetYs[var22] < var5 + var14) {
										field710[var22] = true;
									}
								}
							}
						}

						if (var20 == 1 || !VarbitComposition.mouseCam && var20 == 4) {
							var2 = LoginScreenAnimation.menuX;
							var3 = class392.menuY;
							var4 = UserComparator7.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var21 = MouseHandler.MouseHandler_lastPressedY;
							var14 = -1;

							for (var22 = 0; var22 < menuOptionsCount; ++var22) {
								var9 = var3 + (menuOptionsCount - 1 - var22) * 15 + 31;
								if (var5 > var2 && var5 < var4 + var2 && var21 > var9 - 13 && var21 < var9 + 3) {
									var14 = var22;
								}
							}

							int var10;
							int var11;
							if (var14 != -1 && var14 >= 0) {
								var22 = menuArguments1[var14];
								var9 = menuArguments2[var14];
								var10 = menuOpcodes[var14];
								var11 = menuIdentifiers[var14];
								String var12 = menuActions[var14];
								String var13 = menuTargets[var14];
								PlatformInfo.menuAction(var22, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
							}

							isMenuOpen = false;
							var22 = LoginScreenAnimation.menuX;
							var9 = class392.menuY;
							var10 = UserComparator7.menuWidth;
							var11 = ApproximateRouteStrategy.menuHeight;

							for (int var17 = 0; var17 < rootWidgetCount; ++var17) {
								if (rootWidgetXs[var17] + rootWidgetWidths[var17] > var22 && rootWidgetXs[var17] < var22 + var10 && rootWidgetYs[var17] + rootWidgetHeights[var17] > var9 && rootWidgetYs[var17] < var11 + var9) {
									field710[var17] = true;
								}
							}
						}
					} else {
						var2 = menuOptionsCount - 1;
						if ((var20 == 1 || !VarbitComposition.mouseCam && var20 == 4) && var2 >= 0) {
							var4 = menuOpcodes[var2];
							if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
								var5 = menuArguments1[var2];
								var21 = menuArguments2[var2];
								Widget var7 = HealthBarUpdate.getWidget(var21);
								var9 = WorldMapRegion.getWidgetFlags(var7);
								boolean var8 = (var9 >> 28 & 1) != 0;
								if (var8) {
									break label302;
								}

								Object var10000 = null;
								if (class114.method2493(WorldMapRegion.getWidgetFlags(var7))) {
									break label302;
								}
							}
						}

						if ((var20 == 1 || !VarbitComposition.mouseCam && var20 == 4) && this.shouldLeftClickOpenMenu()) {
							var20 = 2;
						}

						if ((var20 == 1 || !VarbitComposition.mouseCam && var20 == 4) && menuOptionsCount > 0 && var2 >= 0) {
							var4 = menuArguments1[var2];
							var5 = menuArguments2[var2];
							var21 = menuOpcodes[var2];
							var14 = menuIdentifiers[var2];
							String var15 = menuActions[var2];
							String var16 = menuTargets[var2];
							PlatformInfo.menuAction(var4, var5, var21, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						if (var20 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return;
				}

				if (GameEngine.dragInventoryWidget != null && !field602 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
					Renderable.method4395(draggedWidgetX, draggedWidgetY);
				}

				field602 = false;
				itemDragDuration = 0;
				if (GameEngine.dragInventoryWidget != null) {
					class16.invalidateWidget(GameEngine.dragInventoryWidget);
				}

				GameEngine.dragInventoryWidget = HealthBarUpdate.getWidget(var21);
				dragItemSlotSource = var5;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					NetFileRequest.method5216(var2);
				}

				class16.invalidateWidget(GameEngine.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1799994804"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1;
		boolean var3 = leftClickOpensMenu == 1 && menuOptionsCount > 2;
		if (!var3) {
			boolean var4;
			if (var1 < 0) {
				var4 = false;
			} else {
				int var5 = menuOpcodes[var1];
				if (var5 >= 2000) {
					var5 -= 2000;
				}

				if (var5 == 1007) {
					var4 = true;
				} else {
					var4 = false;
				}
			}

			var3 = var4;
		}

		return var3 && !menuShiftClick[var1];
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1352837868"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		Widget.method4997(var1, var2);
		PlayerComposition.scene.menuOpen(VertexNormal.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-406971088"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		Canvas.method380(rootInterface, Huffman.canvasWidth, MouseRecorder.canvasHeight, var1);
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I)V",
		garbageValue = "2032857847"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : HealthBarUpdate.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = Huffman.canvasWidth;
			var4 = MouseRecorder.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		WorldMapEvent.alignWidgetSize(var1, var3, var4, false);
		HorizontalAlignment.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1536"
	)
	final void method1349() {
		class16.invalidateWidget(clickedWidget);
		++MouseHandler.widgetDragDuration;
		if (field671 && field595) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field669) {
				var1 = field669;
			}

			if (var1 + clickedWidget.width > field669 + clickedWidgetParent.width) {
				var1 = field669 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field670) {
				var2 = field670;
			}

			if (var2 + clickedWidget.height > field670 + clickedWidgetParent.height) {
				var2 = field670 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field672;
			int var4 = var2 - field608;
			int var5 = clickedWidget.dragZoneSize;
			if (MouseHandler.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field669 + clickedWidgetParent.scrollX;
			int var7 = var2 - field670 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				ViewportMouse.runScriptEvent(var8);
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
						ViewportMouse.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var10 = Friend.method6003(WorldMapRegion.getWidgetFlags(var9));
						Widget var13;
						if (var10 == 0) {
							var13 = null;
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9;
									break;
								}

								var9 = HealthBarUpdate.getWidget(var9.parentId);
								if (var9 == null) {
									var13 = null;
									break;
								}

								++var11;
							}
						}

						if (var13 != null) {
							PacketBufferNode var12 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2684, packetWriter.isaacCipher);
							var12.packetBuffer.method6942(clickedWidget.id);
							var12.packetBuffer.method7029(clickedWidget.childIndex);
							var12.packetBuffer.method6930(draggedOnWidget.childIndex);
							var12.packetBuffer.writeShort(draggedOnWidget.itemId);
							var12.packetBuffer.method6931(clickedWidget.itemId);
							var12.packetBuffer.method6940(draggedOnWidget.id);
							packetWriter.addNode(var12);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field672 + widgetClickX, widgetClickY + field608);
				} else if (menuOptionsCount > 0) {
					Renderable.method4395(widgetClickX + field672, field608 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (MouseHandler.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(B)Lpm;",
		garbageValue = "-28"
	)
	@Export("username")
	public Username username() {
		return class67.localPlayer != null ? class67.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 27; ++var1) {
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
							int var4 = Integer.parseInt(var2);
							Language var9;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var9 = Language.Language_valuesOrdered[var4];
							} else {
								var9 = null;
							}

							ReflectionCheck.clientLanguage = var9;
							break;
						case 7:
							class29.field171 = class114.method2494(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							ItemContainer.field1009 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.oldscape, StudioGame.runescape, StudioGame.game3, StudioGame.game4, StudioGame.stellardawn, StudioGame.game5};
							class392.field4267 = (StudioGame)class128.findEnumerated(var3, Integer.parseInt(var2));
							if (class392.field4267 == StudioGame.oldscape) {
								WorldMapSectionType.loginType = LoginType.oldscape;
							} else {
								WorldMapSectionType.loginType = LoginType.field4227;
							}
							break;
						case 11:
							Varcs.field1264 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							KeyHandler.field142 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							Messages.field1273 = var2;
							break;
						case 21:
							field524 = Integer.parseInt(var2);
							break;
						case 22:
							field540 = Integer.parseInt(var2) != 0;
						}
					}
				}

				class391.method6795();
				EnumComposition.worldHost = this.getCodeBase().getHost();
				String var5 = class29.field171.name;
				byte var6 = 0;

				try {
					class114.method2485("oldschool", var5, var6, 21);
				} catch (Exception var7) {
					Timer.RunException_sendStackTrace((String)null, var7);
				}

				class21.client = this;
				RunException.clientType = clientType;
				if (field681 == -1) {
					field681 = 0;
				}

				WorldMapSectionType.field2140 = System.getenv("JX_ACCESS_TOKEN");
				System.getenv("JX_REFRESH_TOKEN");
				this.startThread(765, 503, 200);
			}
		} catch (RuntimeException var8) {
			throw class91.newRunException(var8, "client.init(" + ')');
		}
	}

	public void setOAuthTokens(String var1, String var2) {
		if (var1 != null && !var1.trim().isEmpty() && var2 != null && !var2.trim().isEmpty()) {
			WorldMapSectionType.field2140 = var1;
			class112.method2474(10);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1649359847"
	)
	static int method1588(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "-1157644084"
	)
	static final void method1589(Actor var0) {
		if (var0.field1165 == cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > KitDefinition.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
			int var1 = var0.field1165 - var0.field1145;
			int var2 = cycle - var0.field1145;
			int var3 = var0.field1109 * 64 + var0.field1148 * 128;
			int var4 = var0.field1109 * 64 + var0.field1126 * 128;
			int var5 = var0.field1109 * 64 + var0.field1149 * 128;
			int var6 = var0.field1109 * 64 + var0.field1125 * 128;
			var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1;
			var0.y = (var6 * var2 + var4 * (var1 - var2)) / var1;
		}

		var0.field1164 = 0;
		var0.orientation = var0.field1151;
		var0.rotation = var0.orientation;
	}
}
