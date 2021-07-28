import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 138557297
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1728287491
	)
	static int field615;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		longValue = -6969143244749711857L
	)
	static long field624;
	@ObfuscatedName("qn")
	static boolean field647;
	@ObfuscatedName("or")
	static boolean[] field616;
	@ObfuscatedName("pi")
	static boolean[] field508;
	@ObfuscatedName("oy")
	static boolean[] field617;
	@ObfuscatedName("pm")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = -1250618151
	)
	public static int field679;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pg")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("py")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 1502186609
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("po")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	static final ApproximateRouteStrategy field493;
	@ObfuscatedName("ph")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1744255253
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("tw")
	static int[] field683;
	@ObfuscatedName("tc")
	static int[] field665;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1203313561
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("ra")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 444188501
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -637209269
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = 1818996957
	)
	static int field674;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -295917775
	)
	static int field675;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -1148049251
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "[Ldt;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("pe")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -1053615907
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -287650673
	)
	static int field638;
	@ObfuscatedName("rx")
	static boolean[] field655;
	@ObfuscatedName("ta")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -2105691439
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		longValue = -9002074771495257221L
	)
	static long field635;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -360861981
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("rl")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rh")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "[Lb;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("rr")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -1701721089
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("rn")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("se")
	static short field660;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 1287305637
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sw")
	static short field631;
	@ObfuscatedName("sl")
	static short field666;
	@ObfuscatedName("sz")
	static short field667;
	@ObfuscatedName("so")
	static short field542;
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "[Ljk;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -128465765
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("sk")
	static short field472;
	@ObfuscatedName("qp")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 963837245
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("qx")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "[Lom;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ri")
	static int[] field436;
	@ObfuscatedName("rm")
	static int[] field608;
	@ObfuscatedName("rc")
	static int[] field658;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 77591977
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sg")
	static int[] field659;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 1377347849
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 1927137713
	)
	static int field450;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = -369610581
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("sh")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("sx")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("px")
	static int[] field430;
	@ObfuscatedName("pk")
	static int[] field633;
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static NodeDeque field685;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 1651684607
	)
	static int field682;
	@ObfuscatedName("pb")
	static int[] field626;
	@ObfuscatedName("pa")
	static String field629;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfy;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1146960599
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("aw")
	static boolean field634;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -618186627
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -796271005
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1038318995
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bd")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bg")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2136967557
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1455306297
	)
	static int field473;
	@ObfuscatedName("bj")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -499921951
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("co")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 276312687
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		longValue = 4454969657610940183L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1497109865
	)
	static int field417;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1623628257
	)
	static int field418;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		longValue = -174042217715999029L
	)
	static long field419;
	@ObfuscatedName("cv")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cg")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 160203917
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 950873687
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1989008663
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1868694333
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -59179799
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 907683737
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1339421573
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1682551987
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1080934523
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 2033278785
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -877397965
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1246129331
	)
	static int field435;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 1723016173
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -232844285
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -1064043753
	)
	static int field438;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1974351783
	)
	static int field439;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 174587345
	)
	static int field589;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	static class99 field447;
	@ObfuscatedName("ec")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fw")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "[Lbe;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -704631899
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fc")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 1834645421
	)
	static int field500;
	@ObfuscatedName("fq")
	static int[] field474;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static AbstractSocket field644;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 571016731
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fe")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("fm")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fn")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -148375477
	)
	static int field459;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1070131091
	)
	static int field460;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 977689969
	)
	static int field461;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -199762195
	)
	static int field549;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -962922831
	)
	static int field463;
	@ObfuscatedName("gj")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gw")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gy")
	static final int[] field467;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 331203949
	)
	static int field555;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = 1432005099
	)
	static int field469;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 401829025
	)
	static int field470;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = -929158491
	)
	static int field471;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = 915268525
	)
	static int field632;
	@ObfuscatedName("hn")
	static boolean field454;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -895093955
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 227907043
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -487444267
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = -411288935
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = -1602720051
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 5126133
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -1378766607
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 473232837
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 528661717
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 1101365977
	)
	static int field433;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -132493299
	)
	static int field440;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -801597475
	)
	static int field485;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 196485799
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -410802453
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -2076624933
	)
	static int field488;
	@ObfuscatedName("io")
	static boolean field489;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 209734121
	)
	static int field607;
	@ObfuscatedName("ie")
	static boolean field491;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 914135433
	)
	static int field492;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -978591303
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1032547075
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("is")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ib")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ip")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("im")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iw")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jc")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("je")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jv")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jn")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 1782757071
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -1314905743
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 2142259699
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 142542337
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 494303077
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -2045010903
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 2136266145
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jh")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -1925679665
	)
	static int field512;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1781842297
	)
	static int field513;
	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = 746274853
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1047802367
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -2102287843
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1388419777
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("ju")
	static boolean field519;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 141193379
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -1324164713
	)
	static int field521;
	@ObfuscatedName("jk")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 596751267
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -2017006231
	)
	static int field525;
	@ObfuscatedName("kj")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -744623911
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -1237716335
	)
	static int field528;
	@ObfuscatedName("kh")
	static int[] field627;
	@ObfuscatedName("kt")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("kb")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ky")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kx")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1480337925
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[[[Lke;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kg")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kv")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lz")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -1446285345
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("ll")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 738499013
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("lc")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lg")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lm")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ly")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lw")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("lt")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("lr")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("li")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("lx")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lv")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("le")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -1200379427
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 442230877
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 121611181
	)
	static int field648;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 1200367257
	)
	static int field559;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 1335908565
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("md")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 1670625679
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 595119311
	)
	static int field564;
	@ObfuscatedName("mf")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mw")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -2061357043
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1016143639
	)
	static int field569;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 489017873
	)
	static int field483;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 879960477
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -1721222091
	)
	static int field654;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 1475888503
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -500247697
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 379410301
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -1976785681
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("ng")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = 301645629
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -324581627
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ns")
	static boolean field585;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 1983815961
	)
	static int field586;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -2014289365
	)
	static int field587;
	@ObfuscatedName("nz")
	static boolean field588;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -480314281
	)
	static int field678;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 735331709
	)
	static int field676;
	@ObfuscatedName("ny")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -1160885167
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("nn")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 778255509
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("nr")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -1367836643
	)
	static int field574;
	@ObfuscatedName("ne")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 448907571
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("ob")
	static int[] field599;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 664811355
	)
	static int field600;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 417630941
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -310829091
	)
	static int field609;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1290477955
	)
	static int field603;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -1094195131
	)
	static int field604;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -2123876731
	)
	static int field605;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 723306013
	)
	static int field606;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 994228311
	)
	static int field479;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -1300891353
	)
	static int field516;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 1322932151
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static NodeDeque field611;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	Buffer field595;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	class7 field445;

	static {
		field634 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		field473 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field417 = -1;
		field418 = -1;
		field419 = -1L;
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
		field435 = 0;
		js5Errors = 0;
		loginState = 0;
		field438 = 0;
		field439 = 0;
		field589 = 0;
		field447 = class99.field1267;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field500 = 0;
		field474 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field459 = 0;
		field460 = 1;
		field461 = 0;
		field549 = 1;
		field463 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field467 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field555 = 0;
		field469 = 2301979;
		field470 = 5063219;
		field471 = 3353893;
		field632 = 7759444;
		field454 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field433 = 0;
		field440 = 0;
		field485 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field488 = 0;
		field489 = false;
		field607 = 0;
		field491 = false;
		field492 = 0;
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
		field512 = 0;
		field513 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field519 = false;
		itemDragDuration = 0;
		field521 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field525 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field528 = 0;
		field627 = new int[1000];
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
		field648 = 0;
		field559 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field564 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field569 = 0;
		field483 = -1;
		chatEffects = 0;
		field654 = 0;
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
		field585 = false;
		field586 = -1;
		field587 = -1;
		field588 = false;
		field678 = -1;
		field676 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field574 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field599 = new int[32];
		field600 = 0;
		chatCycle = 0;
		field609 = 0;
		field603 = 0;
		field604 = 0;
		field605 = 0;
		field606 = 0;
		field479 = 0;
		field516 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field611 = new NodeDeque();
		field685 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field615 = -2;
		field616 = new boolean[100];
		field617 = new boolean[100];
		field508 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field624 = 0L;
		isResizable = true;
		field626 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field629 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field450 = 0;
		field633 = new int[128];
		field430 = new int[128];
		field635 = -1L;
		currentClanSettings = new ClanSettings[1];
		currentClanChannels = new ClanChannel[1];
		field638 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field647 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field655 = new boolean[5];
		field436 = new int[5];
		field608 = new int[5];
		field658 = new int[5];
		field659 = new int[5];
		field660 = 256;
		field631 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field472 = 1;
		field542 = 32767;
		field666 = 1;
		field667 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field674 = -1;
		field675 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field679 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field682 = 0;
		field493 = new ApproximateRouteStrategy();
		field683 = new int[50];
		field665 = new int[50];
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field624 = UrlRequester.method2125() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1;
			class127.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) {
				ByteArrayPool.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
			}
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null;
			class127.ByteArrayPool_altSizeArrayCounts = null;
			ByteArrayPool.ByteArrayPool_arrays = null;
		}

		WorldMapManager.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class4.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class290.currentPort = WorldMapManager.worldPort;
		class282.field3634 = class247.field2941;
		Varps.field2914 = class247.field2943;
		class7.field25 = class247.field2940;
		VertexNormal.field2498 = class247.field2942;
		WorldMapManager.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		Canvas.mouseWheel = this.mouseWheel();
		class307.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		Decimator.clientPreferences = PcmPlayer.method497();
		this.setUpClipboard();
		class65.method1796(this, UserComparator10.null_string);
		if (gameBuild != 0) {
			displayFps = true;
		}

		WorldMapLabelSize.setWindowedMode(Decimator.clientPreferences.windowMode);
		Canvas.friendSystem = new FriendSystem(GraphicsObject.loginType);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1217845372"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class268.method4925();

		int var1;
		try {
			if (class234.musicPlayerStatus == 1) {
				var1 = class234.midiPcmStream.method4474();
				if (var1 > 0 && class234.midiPcmStream.isReady()) {
					var1 -= ClanChannel.pcmSampleLength;
					if (var1 < 0) {
						var1 = 0;
					}

					class234.midiPcmStream.setPcmStreamVolume(var1);
				} else {
					class234.midiPcmStream.clear();
					class234.midiPcmStream.removeAll();
					if (class234.musicTrackArchive != null) {
						class234.musicPlayerStatus = 2;
					} else {
						class234.musicPlayerStatus = 0;
					}

					WorldMapLabel.musicTrack = null;
					KitDefinition.soundCache = null;
				}
			}
		} catch (Exception var66) {
			var66.printStackTrace();
			class234.midiPcmStream.clear();
			class234.musicPlayerStatus = 0;
			WorldMapLabel.musicTrack = null;
			KitDefinition.soundCache = null;
			class234.musicTrackArchive = null;
		}

		class262.playPcmPlayers();
		int var2;
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field57 = KeyHandler.field59;
			KeyHandler.field35 = 0;
			KeyHandler.field64 = 0;
			Arrays.fill(KeyHandler.field46, false);
			Arrays.fill(KeyHandler.field38, false);
			if (KeyHandler.field50 < 0) {
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
				KeyHandler.field50 = KeyHandler.field49;
			} else {
				while (KeyHandler.field50 != KeyHandler.field49) {
					var2 = KeyHandler.field48[KeyHandler.field49];
					KeyHandler.field49 = KeyHandler.field49 + 1 & 127;
					if (var2 < 0) {
						var2 = ~var2;
						if (KeyHandler.KeyHandler_pressedKeys[var2]) {
							KeyHandler.KeyHandler_pressedKeys[var2] = false;
							KeyHandler.field38[var2] = true;
							KeyHandler.field55[KeyHandler.field64] = var2;
							++KeyHandler.field64;
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field35 < KeyHandler.field53.length - 1) {
							KeyHandler.field46[var2] = true;
							KeyHandler.field53[++KeyHandler.field35 - 1] = var2;
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true;
					}
				}
			}

			if (KeyHandler.field35 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field59 = KeyHandler.field52;
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

		if (Canvas.mouseWheel != null) {
			var1 = Canvas.mouseWheel.useRotation();
			mouseWheelRotation = var1;
		}

		if (gameState == 0) {
			AbstractWorldMapIcon.load();
			Messages.clock.mark();

			for (var1 = 0; var1 < 32; ++var1) {
				GameEngine.graphicsTickTimes[var1] = 0L;
			}

			for (var1 = 0; var1 < 32; ++var1) {
				GameEngine.clientTickTimes[var1] = 0L;
			}

			Skills.gameCyclesToDo = 0;
		} else if (gameState == 5) {
			ObjectComposition.doCycleTitle(this);
			AbstractWorldMapIcon.load();
			Messages.clock.mark();

			for (var1 = 0; var1 < 32; ++var1) {
				GameEngine.graphicsTickTimes[var1] = 0L;
			}

			for (var1 = 0; var1 < 32; ++var1) {
				GameEngine.clientTickTimes[var1] = 0L;
			}

			Skills.gameCyclesToDo = 0;
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				ObjectComposition.doCycleTitle(this);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				class231.method4431(false);
				field459 = 0;
				boolean var70 = true;

				for (var2 = 0; var2 < ClientPacket.regionLandArchives.length; ++var2) {
					if (Huffman.regionMapArchiveIds[var2] != -1 && ClientPacket.regionLandArchives[var2] == null) {
						ClientPacket.regionLandArchives[var2] = Skeleton.archive5.takeFile(Huffman.regionMapArchiveIds[var2], 0);
						if (ClientPacket.regionLandArchives[var2] == null) {
							var70 = false;
							++field459;
						}
					}

					if (UserComparator6.regionLandArchiveIds[var2] != -1 && PlatformInfo.regionMapArchives[var2] == null) {
						PlatformInfo.regionMapArchives[var2] = Skeleton.archive5.takeFileEncrypted(UserComparator6.regionLandArchiveIds[var2], 0, ScriptFrame.xteaKeys[var2]);
						if (PlatformInfo.regionMapArchives[var2] == null) {
							var70 = false;
							++field459;
						}
					}
				}

				if (!var70) {
					field463 = 1;
				} else {
					field461 = 0;
					var70 = true;

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
					int var48;
					for (var2 = 0; var2 < ClientPacket.regionLandArchives.length; ++var2) {
						byte[] var3 = PlatformInfo.regionMapArchives[var2];
						if (var3 != null) {
							var48 = (class234.regions[var2] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX;
							var5 = (class234.regions[var2] & 255) * 64 - NPC.baseY;
							if (isInInstance) {
								var48 = 10;
								var5 = 10;
							}

							boolean var8 = true;
							var9 = new Buffer(var3);
							var10 = -1;

							label1339:
							while (true) {
								var11 = var9.method6880();
								if (var11 == 0) {
									var70 &= var8;
									break;
								}

								var10 += var11;
								var12 = 0;
								boolean var13 = false;

								while (true) {
									while (!var13) {
										var14 = var9.readUShortSmart();
										if (var14 == 0) {
											continue label1339;
										}

										var12 += var14 - 1;
										var15 = var12 & 63;
										var16 = var12 >> 6 & 63;
										var17 = var9.readUnsignedByte() >> 2;
										var18 = var16 + var48;
										var19 = var15 + var5;
										if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
											ObjectComposition var20 = ClanChannel.getObjectDefinition(var10);
											if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) {
												if (!var20.needsModelFiles()) {
													++field461;
													var8 = false;
												}

												var13 = true;
											}
										}
									}

									var14 = var9.readUShortSmart();
									if (var14 == 0) {
										break;
									}

									var9.readUnsignedByte();
								}
							}
						}
					}

					if (!var70) {
						field463 = 2;
					} else {
						if (field463 != 0) {
							DevicePcmPlayerProvider.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						class262.playPcmPlayers();
						WorldMapIcon_1.scene.clear();

						for (var2 = 0; var2 < 4; ++var2) {
							collisionMaps[var2].clear();
						}

						int var49;
						for (var2 = 0; var2 < 4; ++var2) {
							for (var49 = 0; var49 < 104; ++var49) {
								for (var48 = 0; var48 < 104; ++var48) {
									Tiles.Tiles_renderFlags[var2][var49][var48] = 0;
								}
							}
						}

						class262.playPcmPlayers();
						Tiles.Tiles_minPlane = 99;
						class339.field3936 = new byte[4][104][104];
						ChatChannel.field894 = new byte[4][104][104];
						Tiles.field915 = new byte[4][104][104];
						Tiles.field909 = new byte[4][104][104];
						class163.field1914 = new int[4][105][105];
						Huffman.field3113 = new byte[4][105][105];
						Tiles.field904 = new int[105][105];
						MenuAction.Tiles_hue = new int[104];
						Tiles.Tiles_saturation = new int[104];
						class256.Tiles_lightness = new int[104];
						class337.Tiles_hueMultiplier = new int[104];
						AttackOption.field1161 = new int[104];
						var2 = ClientPacket.regionLandArchives.length;

						for (ObjectSound var67 = (ObjectSound)ObjectSound.objectSounds.last(); var67 != null; var67 = (ObjectSound)ObjectSound.objectSounds.previous()) {
							if (var67.stream1 != null) {
								TileItem.pcmStreamMixer.removeSubStream(var67.stream1);
								var67.stream1 = null;
							}

							if (var67.stream2 != null) {
								TileItem.pcmStreamMixer.removeSubStream(var67.stream2);
								var67.stream2 = null;
							}
						}

						ObjectSound.objectSounds.clear();
						class231.method4431(true);
						int var6;
						int var21;
						int var22;
						int var53;
						int var73;
						if (!isInInstance) {
							byte[] var50;
							for (var49 = 0; var49 < var2; ++var49) {
								var48 = (class234.regions[var49] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX;
								var5 = (class234.regions[var49] & 255) * 64 - NPC.baseY;
								var50 = ClientPacket.regionLandArchives[var49];
								if (var50 != null) {
									class262.playPcmPlayers();
									Projectile.method1700(var50, var48, var5, MouseHandler.field136 * 8 - 48, class7.field26 * 8 - 48, collisionMaps);
								}
							}

							for (var49 = 0; var49 < var2; ++var49) {
								var48 = (class234.regions[var49] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX;
								var5 = (class234.regions[var49] & 255) * 64 - NPC.baseY;
								var50 = ClientPacket.regionLandArchives[var49];
								if (var50 == null && class7.field26 < 800) {
									class262.playPcmPlayers();
									WorldMapIcon_1.method3260(var48, var5, 64, 64);
								}
							}

							class231.method4431(true);

							for (var49 = 0; var49 < var2; ++var49) {
								byte[] var4 = PlatformInfo.regionMapArchives[var49];
								if (var4 != null) {
									var5 = (class234.regions[var49] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX;
									var6 = (class234.regions[var49] & 255) * 64 - NPC.baseY;
									class262.playPcmPlayers();
									Scene var51 = WorldMapIcon_1.scene;
									CollisionMap[] var52 = collisionMaps;
									var9 = new Buffer(var4);
									var10 = -1;

									while (true) {
										var11 = var9.method6880();
										if (var11 == 0) {
											break;
										}

										var10 += var11;
										var12 = 0;

										while (true) {
											var73 = var9.readUShortSmart();
											if (var73 == 0) {
												break;
											}

											var12 += var73 - 1;
											var14 = var12 & 63;
											var15 = var12 >> 6 & 63;
											var16 = var12 >> 12;
											var17 = var9.readUnsignedByte();
											var18 = var17 >> 2;
											var19 = var17 & 3;
											var53 = var15 + var5;
											var21 = var14 + var6;
											if (var53 > 0 && var21 > 0 && var53 < 103 && var21 < 103) {
												var22 = var16;
												if ((Tiles.Tiles_renderFlags[1][var53][var21] & 2) == 2) {
													var22 = var16 - 1;
												}

												CollisionMap var23 = null;
												if (var22 >= 0) {
													var23 = var52[var22];
												}

												method1382(var16, var53, var21, var10, var19, var18, var51, var23);
											}
										}
									}
								}
							}
						}

						int var7;
						int var54;
						int var72;
						if (isInInstance) {
							var49 = 0;

							label1238:
							while (true) {
								if (var49 >= 4) {
									for (var49 = 0; var49 < 13; ++var49) {
										for (var48 = 0; var48 < 13; ++var48) {
											var5 = instanceChunkTemplates[0][var49][var48];
											if (var5 == -1) {
												WorldMapIcon_1.method3260(var49 * 8, var48 * 8, 8, 8);
											}
										}
									}

									class231.method4431(true);
									var49 = 0;

									while (true) {
										if (var49 >= 4) {
											break label1238;
										}

										class262.playPcmPlayers();

										for (var48 = 0; var48 < 13; ++var48) {
											for (var5 = 0; var5 < 13; ++var5) {
												var6 = instanceChunkTemplates[var49][var48][var5];
												if (var6 != -1) {
													var7 = var6 >> 24 & 3;
													var72 = var6 >> 1 & 3;
													var54 = var6 >> 14 & 1023;
													var10 = var6 >> 3 & 2047;
													var11 = (var54 / 8 << 8) + var10 / 8;

													for (var12 = 0; var12 < class234.regions.length; ++var12) {
														if (class234.regions[var12] == var11 && PlatformInfo.regionMapArchives[var12] != null) {
															class137.method2684(PlatformInfo.regionMapArchives[var12], var49, var48 * 8, var5 * 8, var7, (var54 & 7) * 8, (var10 & 7) * 8, var72, WorldMapIcon_1.scene, collisionMaps);
															break;
														}
													}
												}
											}
										}

										++var49;
									}
								}

								class262.playPcmPlayers();

								for (var48 = 0; var48 < 13; ++var48) {
									for (var5 = 0; var5 < 13; ++var5) {
										boolean var71 = false;
										var7 = instanceChunkTemplates[var49][var48][var5];
										if (var7 != -1) {
											var72 = var7 >> 24 & 3;
											var54 = var7 >> 1 & 3;
											var10 = var7 >> 14 & 1023;
											var11 = var7 >> 3 & 2047;
											var12 = (var10 / 8 << 8) + var11 / 8;

											for (var73 = 0; var73 < class234.regions.length; ++var73) {
												if (class234.regions[var73] == var12 && ClientPacket.regionLandArchives[var73] != null) {
													WorldMapRegion.method3469(ClientPacket.regionLandArchives[var73], var49, var48 * 8, var5 * 8, var72, (var10 & 7) * 8, (var11 & 7) * 8, var54, collisionMaps);
													var71 = true;
													break;
												}
											}
										}

										if (!var71) {
											Language.method5236(var49, var48 * 8, var5 * 8);
										}
									}
								}

								++var49;
							}
						}

						class231.method4431(true);
						class262.playPcmPlayers();
						Scene var68 = WorldMapIcon_1.scene;
						CollisionMap[] var69 = collisionMaps;

						for (var5 = 0; var5 < 4; ++var5) {
							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									if ((Tiles.Tiles_renderFlags[var5][var6][var7] & 1) == 1) {
										var72 = var5;
										if ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
											var72 = var5 - 1;
										}

										if (var72 >= 0) {
											var69[var72].setBlockedByFloor(var6, var7);
										}
									}
								}
							}
						}

						Tiles.field913 += (int)(Math.random() * 5.0D) - 2;
						if (Tiles.field913 < -8) {
							Tiles.field913 = -8;
						}

						if (Tiles.field913 > 8) {
							Tiles.field913 = 8;
						}

						Tiles.field899 += (int)(Math.random() * 5.0D) - 2;
						if (Tiles.field899 < -16) {
							Tiles.field899 = -16;
						}

						if (Tiles.field899 > 16) {
							Tiles.field899 = 16;
						}

						int[] var10000;
						for (var5 = 0; var5 < 4; ++var5) {
							byte[][] var78 = Huffman.field3113[var5];
							var12 = (int)Math.sqrt(5100.0D);
							var73 = var12 * 768 >> 8;

							int var55;
							for (var14 = 1; var14 < 103; ++var14) {
								for (var15 = 1; var15 < 103; ++var15) {
									var16 = Tiles.Tiles_heights[var5][var15 + 1][var14] - Tiles.Tiles_heights[var5][var15 - 1][var14];
									var17 = Tiles.Tiles_heights[var5][var15][var14 + 1] - Tiles.Tiles_heights[var5][var15][var14 - 1];
									var18 = (int)Math.sqrt((double)(var17 * var17 + var16 * var16 + 65536));
									var19 = (var16 << 8) / var18;
									var53 = 65536 / var18;
									var21 = (var17 << 8) / var18;
									var22 = (var21 * -50 + var19 * -50 + var53 * -10) / var73 + 96;
									var55 = (var78[var15 - 1][var14] >> 2) + (var78[var15][var14 - 1] >> 2) + (var78[var15 + 1][var14] >> 3) + (var78[var15][var14 + 1] >> 3) + (var78[var15][var14] >> 1);
									Tiles.field904[var15][var14] = var22 - var55;
								}
							}

							for (var14 = 0; var14 < 104; ++var14) {
								MenuAction.Tiles_hue[var14] = 0;
								Tiles.Tiles_saturation[var14] = 0;
								class256.Tiles_lightness[var14] = 0;
								class337.Tiles_hueMultiplier[var14] = 0;
								AttackOption.field1161[var14] = 0;
							}

							for (var14 = -5; var14 < 109; ++var14) {
								for (var15 = 0; var15 < 104; ++var15) {
									var16 = var14 + 5;
									int var10002;
									if (var16 >= 0 && var16 < 104) {
										var17 = class339.field3936[var5][var16][var15] & 255;
										if (var17 > 0) {
											var19 = var17 - 1;
											FloorUnderlayDefinition var74 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var19);
											FloorUnderlayDefinition var56;
											if (var74 != null) {
												var56 = var74;
											} else {
												byte[] var57 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var19);
												var74 = new FloorUnderlayDefinition();
												if (var57 != null) {
													var74.decode(new Buffer(var57), var19);
												}

												var74.postDecode();
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var74, (long)var19);
												var56 = var74;
											}

											var10000 = MenuAction.Tiles_hue;
											var10000[var15] += var56.hue;
											var10000 = Tiles.Tiles_saturation;
											var10000[var15] += var56.saturation;
											var10000 = class256.Tiles_lightness;
											var10000[var15] += var56.lightness;
											var10000 = class337.Tiles_hueMultiplier;
											var10000[var15] += var56.hueMultiplier;
											var10002 = AttackOption.field1161[var15]++;
										}
									}

									var17 = var14 - 5;
									if (var17 >= 0 && var17 < 104) {
										var18 = class339.field3936[var5][var17][var15] & 255;
										if (var18 > 0) {
											var53 = var18 - 1;
											FloorUnderlayDefinition var80 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var53);
											FloorUnderlayDefinition var58;
											if (var80 != null) {
												var58 = var80;
											} else {
												byte[] var59 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var53);
												var80 = new FloorUnderlayDefinition();
												if (var59 != null) {
													var80.decode(new Buffer(var59), var53);
												}

												var80.postDecode();
												FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var80, (long)var53);
												var58 = var80;
											}

											var10000 = MenuAction.Tiles_hue;
											var10000[var15] -= var58.hue;
											var10000 = Tiles.Tiles_saturation;
											var10000[var15] -= var58.saturation;
											var10000 = class256.Tiles_lightness;
											var10000[var15] -= var58.lightness;
											var10000 = class337.Tiles_hueMultiplier;
											var10000[var15] -= var58.hueMultiplier;
											var10002 = AttackOption.field1161[var15]--;
										}
									}
								}

								if (var14 >= 1 && var14 < 103) {
									var15 = 0;
									var16 = 0;
									var17 = 0;
									var18 = 0;
									var19 = 0;

									for (var53 = -5; var53 < 109; ++var53) {
										var21 = var53 + 5;
										if (var21 >= 0 && var21 < 104) {
											var15 += MenuAction.Tiles_hue[var21];
											var16 += Tiles.Tiles_saturation[var21];
											var17 += class256.Tiles_lightness[var21];
											var18 += class337.Tiles_hueMultiplier[var21];
											var19 += AttackOption.field1161[var21];
										}

										var22 = var53 - 5;
										if (var22 >= 0 && var22 < 104) {
											var15 -= MenuAction.Tiles_hue[var22];
											var16 -= Tiles.Tiles_saturation[var22];
											var17 -= class256.Tiles_lightness[var22];
											var18 -= class337.Tiles_hueMultiplier[var22];
											var19 -= AttackOption.field1161[var22];
										}

										if (var53 >= 1 && var53 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var53] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var53] & 16) == 0)) {
											if (var5 < Tiles.Tiles_minPlane) {
												Tiles.Tiles_minPlane = var5;
											}

											var55 = class339.field3936[var5][var14][var53] & 255;
											int var24 = ChatChannel.field894[var5][var14][var53] & 255;
											if (var55 > 0 || var24 > 0) {
												int var25 = Tiles.Tiles_heights[var5][var14][var53];
												int var26 = Tiles.Tiles_heights[var5][var14 + 1][var53];
												int var27 = Tiles.Tiles_heights[var5][var14 + 1][var53 + 1];
												int var28 = Tiles.Tiles_heights[var5][var14][var53 + 1];
												int var29 = Tiles.field904[var14][var53];
												int var30 = Tiles.field904[var14 + 1][var53];
												int var31 = Tiles.field904[var14 + 1][var53 + 1];
												int var32 = Tiles.field904[var14][var53 + 1];
												int var33 = -1;
												int var34 = -1;
												int var35;
												int var36;
												int var37;
												if (var55 > 0) {
													var35 = var15 * 256 / var18;
													var36 = var16 / var19;
													var37 = var17 / var19;
													var33 = SecureRandomCallable.hslToRgb(var35, var36, var37);
													var35 = var35 + Tiles.field913 & 255;
													var37 += Tiles.field899;
													if (var37 < 0) {
														var37 = 0;
													} else if (var37 > 255) {
														var37 = 255;
													}

													var34 = SecureRandomCallable.hslToRgb(var35, var36, var37);
												}

												FloorOverlayDefinition var38;
												if (var5 > 0) {
													boolean var76 = true;
													if (var55 == 0 && Tiles.field915[var5][var14][var53] != 0) {
														var76 = false;
													}

													if (var24 > 0) {
														var37 = var24 - 1;
														var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37);
														FloorOverlayDefinition var60;
														if (var38 != null) {
															var60 = var38;
														} else {
															byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37);
															var38 = new FloorOverlayDefinition();
															if (var39 != null) {
																var38.decode(new Buffer(var39), var37);
															}

															var38.postDecode();
															FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37);
															var60 = var38;
														}

														if (!var60.hideUnderlay) {
															var76 = false;
														}
													}

													if (var76 && var26 == var25 && var27 == var25 && var28 == var25) {
														var10000 = class163.field1914[var5][var14];
														var10000[var53] |= 2340;
													}
												}

												var35 = 0;
												if (var34 != -1) {
													var35 = Rasterizer3D.Rasterizer3D_colorPalette[class52.method1652(var34, 96)];
												}

												if (var24 == 0) {
													var68.addTile(var5, var14, var53, 0, 0, -1, var25, var26, var27, var28, class52.method1652(var33, var29), class52.method1652(var33, var30), class52.method1652(var33, var31), class52.method1652(var33, var32), 0, 0, 0, 0, var35, 0);
												} else {
													var36 = Tiles.field915[var5][var14][var53] + 1;
													byte var77 = Tiles.field909[var5][var14][var53];
													int var61 = var24 - 1;
													FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var61);
													if (var40 != null) {
														var38 = var40;
													} else {
														byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var61);
														var40 = new FloorOverlayDefinition();
														if (var41 != null) {
															var40.decode(new Buffer(var41), var61);
														}

														var40.postDecode();
														FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var61);
														var38 = var40;
													}

													int var62 = var38.texture;
													int var42;
													int var43;
													int var44;
													int var45;
													if (var62 >= 0) {
														var43 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var62);
														var42 = -1;
													} else if (var38.primaryRgb == 16711935) {
														var42 = -2;
														var62 = -1;
														var43 = -2;
													} else {
														var42 = SecureRandomCallable.hslToRgb(var38.hue, var38.saturation, var38.lightness);
														var44 = var38.hue + Tiles.field913 & 255;
														var45 = var38.lightness + Tiles.field899;
														if (var45 < 0) {
															var45 = 0;
														} else if (var45 > 255) {
															var45 = 255;
														}

														var43 = SecureRandomCallable.hslToRgb(var44, var38.saturation, var45);
													}

													var44 = 0;
													if (var43 != -2) {
														var44 = Rasterizer3D.Rasterizer3D_colorPalette[GraphicsObject.method1638(var43, 96)];
													}

													if (var38.secondaryRgb != -1) {
														var45 = var38.secondaryHue + Tiles.field913 & 255;
														int var46 = var38.secondaryLightness + Tiles.field899;
														if (var46 < 0) {
															var46 = 0;
														} else if (var46 > 255) {
															var46 = 255;
														}

														var43 = SecureRandomCallable.hslToRgb(var45, var38.secondarySaturation, var46);
														var44 = Rasterizer3D.Rasterizer3D_colorPalette[GraphicsObject.method1638(var43, 96)];
													}

													var68.addTile(var5, var14, var53, var36, var77, var62, var25, var26, var27, var28, class52.method1652(var33, var29), class52.method1652(var33, var30), class52.method1652(var33, var31), class52.method1652(var33, var32), GraphicsObject.method1638(var42, var29), GraphicsObject.method1638(var42, var30), GraphicsObject.method1638(var42, var31), GraphicsObject.method1638(var42, var32), var35, var44);
												}
											}
										}
									}
								}
							}

							for (var14 = 1; var14 < 103; ++var14) {
								for (var15 = 1; var15 < 103; ++var15) {
									if ((Tiles.Tiles_renderFlags[var5][var15][var14] & 8) != 0) {
										var53 = 0;
									} else if (var5 > 0 && (Tiles.Tiles_renderFlags[1][var15][var14] & 2) != 0) {
										var53 = var5 - 1;
									} else {
										var53 = var5;
									}

									var68.setTileMinPlane(var5, var15, var14, var53);
								}
							}

							class339.field3936[var5] = null;
							ChatChannel.field894[var5] = null;
							Tiles.field915[var5] = null;
							Tiles.field909[var5] = null;
							Huffman.field3113[var5] = null;
						}

						var68.method4005(-50, -10, -50);

						for (var5 = 0; var5 < 104; ++var5) {
							for (var6 = 0; var6 < 104; ++var6) {
								if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) {
									var68.setLinkBelow(var5, var6);
								}
							}
						}

						var5 = 1;
						var6 = 2;
						var7 = 4;

						for (var72 = 0; var72 < 4; ++var72) {
							if (var72 > 0) {
								var5 <<= 3;
								var6 <<= 3;
								var7 <<= 3;
							}

							for (var54 = 0; var54 <= var72; ++var54) {
								for (var10 = 0; var10 <= 104; ++var10) {
									for (var11 = 0; var11 <= 104; ++var11) {
										short var75;
										if ((class163.field1914[var54][var11][var10] & var5) != 0) {
											var12 = var10;
											var73 = var10;
											var14 = var54;

											for (var15 = var54; var12 > 0 && (class163.field1914[var54][var11][var12 - 1] & var5) != 0; --var12) {
											}

											while (var73 < 104 && (class163.field1914[var54][var11][var73 + 1] & var5) != 0) {
												++var73;
											}

											label923:
											while (var14 > 0) {
												for (var16 = var12; var16 <= var73; ++var16) {
													if ((class163.field1914[var14 - 1][var11][var16] & var5) == 0) {
														break label923;
													}
												}

												--var14;
											}

											label912:
											while (var15 < var72) {
												for (var16 = var12; var16 <= var73; ++var16) {
													if ((class163.field1914[var15 + 1][var11][var16] & var5) == 0) {
														break label912;
													}
												}

												++var15;
											}

											var16 = (var73 - var12 + 1) * (var15 + 1 - var14);
											if (var16 >= 8) {
												var75 = 240;
												var18 = Tiles.Tiles_heights[var15][var11][var12] - var75;
												var19 = Tiles.Tiles_heights[var14][var11][var12];
												Scene.Scene_addOccluder(var72, 1, var11 * 128, var11 * 128, var12 * 128, var73 * 128 + 128, var18, var19);

												for (var53 = var14; var53 <= var15; ++var53) {
													for (var21 = var12; var21 <= var73; ++var21) {
														var10000 = class163.field1914[var53][var11];
														var10000[var21] &= ~var5;
													}
												}
											}
										}

										if ((class163.field1914[var54][var11][var10] & var6) != 0) {
											var12 = var11;
											var73 = var11;
											var14 = var54;

											for (var15 = var54; var12 > 0 && (class163.field1914[var54][var12 - 1][var10] & var6) != 0; --var12) {
											}

											while (var73 < 104 && (class163.field1914[var54][var73 + 1][var10] & var6) != 0) {
												++var73;
											}

											label976:
											while (var14 > 0) {
												for (var16 = var12; var16 <= var73; ++var16) {
													if ((class163.field1914[var14 - 1][var16][var10] & var6) == 0) {
														break label976;
													}
												}

												--var14;
											}

											label965:
											while (var15 < var72) {
												for (var16 = var12; var16 <= var73; ++var16) {
													if ((class163.field1914[var15 + 1][var16][var10] & var6) == 0) {
														break label965;
													}
												}

												++var15;
											}

											var16 = (var15 + 1 - var14) * (var73 - var12 + 1);
											if (var16 >= 8) {
												var75 = 240;
												var18 = Tiles.Tiles_heights[var15][var12][var10] - var75;
												var19 = Tiles.Tiles_heights[var14][var12][var10];
												Scene.Scene_addOccluder(var72, 2, var12 * 128, var73 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

												for (var53 = var14; var53 <= var15; ++var53) {
													for (var21 = var12; var21 <= var73; ++var21) {
														var10000 = class163.field1914[var53][var21];
														var10000[var10] &= ~var6;
													}
												}
											}
										}

										if ((class163.field1914[var54][var11][var10] & var7) != 0) {
											var12 = var11;
											var73 = var11;
											var14 = var10;

											for (var15 = var10; var14 > 0 && (class163.field1914[var54][var11][var14 - 1] & var7) != 0; --var14) {
											}

											while (var15 < 104 && (class163.field1914[var54][var11][var15 + 1] & var7) != 0) {
												++var15;
											}

											label1029:
											while (var12 > 0) {
												for (var16 = var14; var16 <= var15; ++var16) {
													if ((class163.field1914[var54][var12 - 1][var16] & var7) == 0) {
														break label1029;
													}
												}

												--var12;
											}

											label1018:
											while (var73 < 104) {
												for (var16 = var14; var16 <= var15; ++var16) {
													if ((class163.field1914[var54][var73 + 1][var16] & var7) == 0) {
														break label1018;
													}
												}

												++var73;
											}

											if ((var73 - var12 + 1) * (var15 - var14 + 1) >= 4) {
												var16 = Tiles.Tiles_heights[var54][var12][var14];
												Scene.Scene_addOccluder(var72, 4, var12 * 128, var73 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

												for (var17 = var12; var17 <= var73; ++var17) {
													for (var18 = var14; var18 <= var15; ++var18) {
														var10000 = class163.field1914[var54][var17];
														var10000[var18] &= ~var7;
													}
												}
											}
										}
									}
								}
							}
						}

						class231.method4431(true);
						var5 = Tiles.Tiles_minPlane;
						if (var5 > GrandExchangeEvent.Client_plane) {
							var5 = GrandExchangeEvent.Client_plane;
						}

						if (var5 < GrandExchangeEvent.Client_plane - 1) {
							var5 = GrandExchangeEvent.Client_plane - 1;
						}

						if (isLowDetail) {
							WorldMapIcon_1.scene.init(Tiles.Tiles_minPlane);
						} else {
							WorldMapIcon_1.scene.init(0);
						}

						for (var6 = 0; var6 < 104; ++var6) {
							for (var7 = 0; var7 < 104; ++var7) {
								FriendSystem.updateItemPile(var6, var7);
							}
						}

						class262.playPcmPlayers();
						class161.method3210();
						ObjectComposition.ObjectDefinition_cachedModelData.clear();
						PacketBufferNode var79;
						if (Script.client.hasFrame()) {
							var79 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2621, packetWriter.isaacCipher);
							var79.packetBuffer.writeInt(1057001181);
							packetWriter.addNode(var79);
						}

						if (!isInInstance) {
							var6 = (MouseHandler.field136 - 6) / 8;
							var7 = (MouseHandler.field136 + 6) / 8;
							var72 = (class7.field26 - 6) / 8;
							var54 = (class7.field26 + 6) / 8;

							for (var10 = var6 - 1; var10 <= var7 + 1; ++var10) {
								for (var11 = var72 - 1; var11 <= var54 + 1; ++var11) {
									if (var10 < var6 || var10 > var7 || var11 < var72 || var11 > var54) {
										Skeleton.archive5.loadRegionFromName("m" + var10 + "_" + var11);
										Skeleton.archive5.loadRegionFromName("l" + var10 + "_" + var11);
									}
								}
							}
						}

						class16.updateGameState(30);
						class262.playPcmPlayers();
						class339.field3936 = null;
						ChatChannel.field894 = null;
						Tiles.field915 = null;
						Tiles.field909 = null;
						class163.field1914 = null;
						Huffman.field3113 = null;
						Tiles.field904 = null;
						MenuAction.Tiles_hue = null;
						Tiles.Tiles_saturation = null;
						class256.Tiles_lightness = null;
						class337.Tiles_hueMultiplier = null;
						AttackOption.field1161 = null;
						var79 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2576, packetWriter.isaacCipher);
						packetWriter.addNode(var79);
						Messages.clock.mark();

						for (var7 = 0; var7 < 32; ++var7) {
							GameEngine.graphicsTickTimes[var7] = 0L;
						}

						for (var7 = 0; var7 < 32; ++var7) {
							GameEngine.clientTickTimes[var7] = 0L;
						}

						Skills.gameCyclesToDo = 0;
					}
				}
			}
		} else {
			ObjectComposition.doCycleTitle(this);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1475528453"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = GameEngine.method345();
		if (var2 && field647 && WorldMapDecoration.pcmPlayer0 != null) {
			WorldMapDecoration.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field624 && UrlRequester.method2125() > field624) {
			WorldMapLabelSize.setWindowedMode(MusicPatch.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field616[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			ModeWhere.drawTitle(TaskHandler.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, WorldMapDecorationType.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				ModeWhere.drawTitle(TaskHandler.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, WorldMapDecorationType.fontPlain12);
			} else if (gameState == 25) {
				if (field463 == 1) {
					if (field459 > field460) {
						field460 = field459;
					}

					var3 = (field460 * 50 - field459 * 50) / field460;
					DevicePcmPlayerProvider.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field463 == 2) {
					if (field461 > field549) {
						field549 = field461;
					}

					var3 = (field549 * 50 - field461 * 50) / field549 + 50;
					DevicePcmPlayerProvider.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					DevicePcmPlayerProvider.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				DevicePcmPlayerProvider.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				DevicePcmPlayerProvider.drawLoadingMessage("Please wait...", false);
			}
		} else {
			ModeWhere.drawTitle(TaskHandler.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, WorldMapDecorationType.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field617[var3]) {
					class263.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field617[var3] = false;
				}
			}
		} else if (gameState > 0) {
			class263.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field617[var3] = false;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Decimator.varcs.hasUnwrittenChanges()) {
			Decimator.varcs.write();
		}

		if (class6.mouseRecorder != null) {
			class6.mouseRecorder.isRunning = false;
		}

		class6.mouseRecorder = null;
		packetWriter.close();
		ClientPacket.method4407();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		Canvas.mouseWheel = null;
		if (WorldMapDecoration.pcmPlayer0 != null) {
			WorldMapDecoration.pcmPlayer0.shutdown();
		}

		if (VarcInt.pcmPlayer1 != null) {
			VarcInt.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		Widget.method4799();
		if (WorldMapManager.urlRequester != null) {
			WorldMapManager.urlRequester.close();
			WorldMapManager.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var3 = 0; var3 < DevicePcmPlayerProvider.idxCount; ++var3) {
				FriendsChat.JagexCache_idxFiles[var3].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var5) {
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	protected final void vmethod899() {
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 20; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0;
						case 2:
						case 11:
						case 13:
						case 16:
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
							GrandExchangeOfferWorldComparator.clientLanguage = Language.method5215(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = Tiles.method1769();
							int var6 = 0;

							GameBuild var3;
							while (true) {
								if (var6 >= var5.length) {
									var3 = null;
									break;
								}

								GameBuild var7 = var5[var6];
								if (var4 == var7.buildId) {
									var3 = var7;
									break;
								}

								++var6;
							}

							FaceNormal.field2349 = var3;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							SpotAnimationDefinition.field1660 = var2;
							break;
						case 10:
							MouseRecorder.field975 = (StudioGame)Huffman.findEnumerated(ViewportMouse.method4318(), Integer.parseInt(var2));
							if (MouseRecorder.field975 == StudioGame.oldscape) {
								GraphicsObject.loginType = LoginType.oldscape;
							} else {
								GraphicsObject.loginType = LoginType.field4121;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							class407.field4313 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							ByteArrayPool.field3775 = var2;
						}
					}
				}

				Huffman.method4834();
				Varps.worldHost = this.getCodeBase().getHost();
				String var8 = FaceNormal.field2349.name;
				byte var9 = 0;

				try {
					WallDecoration.method4338("oldschool", var8, var9, 21);
				} catch (Exception var10) {
					BufferedSink.RunException_sendStackTrace((String)null, var10);
				}

				Script.client = this;
				UserComparator6.clientType = clientType;
				if (field473 == -1) {
					field473 = 0;
				}

				this.startThread(765, 503, 198);
			}
		} catch (RuntimeException var11) {
			throw class377.newRunException(var11, "client.init(" + ')');
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = UrlRequester.method2125();
			int var4 = (int)(var2 - NetCache.field3596);
			NetCache.field3596 = var2;
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
					label242: {
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
							if (NetCache.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3608 == 0) {
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
								if (NetCache.field3612 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
										var10000[var10001] ^= NetCache.field3612;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (NetCache.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									Script.field877 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										Script.field877 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									NetCache.NetCache_currentResponse = var15;
									UserComparator9.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + NetCache.NetCache_currentResponse.padding);
									UserComparator9.NetCache_responseArchiveBuffer.writeByte(var11);
									UserComparator9.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3608 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3608 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field3608 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										NetCache.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = UserComparator9.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3608;
								if (var9 > var8 - UserComparator9.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - UserComparator9.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(UserComparator9.NetCache_responseArchiveBuffer.array, UserComparator9.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3612 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = UserComparator9.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + UserComparator9.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field3612;
									}
								}

								var25 = UserComparator9.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field3608 += var9;
								if (var8 == UserComparator9.NetCache_responseArchiveBuffer.offset) {
									if (NetCache.NetCache_currentResponse.key == 16711935L) {
										NetCache.NetCache_reference = UserComparator9.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												NetCache.NetCache_reference.offset = var10 * 8 + 5;
												var12 = NetCache.NetCache_reference.readInt();
												int var20 = NetCache.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(UserComparator9.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != NetCache.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3612 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label242;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										NetCache.NetCache_currentResponse.archive.write((int)(NetCache.NetCache_currentResponse.key & 65535L), UserComparator9.NetCache_responseArchiveBuffer.array, (NetCache.NetCache_currentResponse.key & 16711680L) == 16711680L, Script.field877);
									}

									NetCache.NetCache_currentResponse.remove();
									if (Script.field877) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3608 = 0;
									NetCache.NetCache_currentResponse = null;
									UserComparator9.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3608 != 512) {
										break;
									}

									NetCache.field3608 = 0;
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

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			gameState = 1000;
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					gameState = 1000;
					return;
				}

				field435 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field435 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						MusicPatchPcmStream.js5SocketTask = GameEngine.taskHandler.newSocketTask(Varps.worldHost, class290.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (MusicPatchPcmStream.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (MusicPatchPcmStream.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							Socket var2 = (Socket)MusicPatchPcmStream.js5SocketTask.result;
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
							Messages.js5Socket = var1;
						} else {
							Messages.js5Socket = new NetSocket((Socket)MusicPatchPcmStream.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var5 = new Buffer(5);
						var5.writeByte(15);
						var5.writeInt(198);
						Messages.js5Socket.write(var5.array, 0, 5);
						++js5ConnectState;
						HorizontalAlignment.field1609 = UrlRequester.method2125();
					}

					if (js5ConnectState == 3) {
						if (Messages.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var3 = Messages.js5Socket.readUnsignedByte();
							if (var3 != 0) {
								this.js5Error(var3);
								return;
							}

							++js5ConnectState;
						} else if (UrlRequester.method2125() - HorizontalAlignment.field1609 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class124.method2538(Messages.js5Socket, gameState > 20);
						MusicPatchPcmStream.js5SocketTask = null;
						Messages.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var4) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1296949295"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		MusicPatchPcmStream.js5SocketTask = null;
		Messages.js5Socket = null;
		js5ConnectState = 0;
		if (WorldMapManager.worldPort == class290.currentPort) {
			class290.currentPort = class4.js5Port;
		} else {
			class290.currentPort = WorldMapManager.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				gameState = 1000;
			} else {
				field435 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			gameState = 1000;
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				gameState = 1000;
			} else {
				field435 = 3000;
			}
		}

	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "59479828"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (class98.secureRandom == null && (secureRandomFuture.isDone() || field438 > 250)) {
					class98.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class98.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					StudioGame.socketTask = null;
					hadNetworkError = false;
					field438 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (StudioGame.socketTask == null) {
					StudioGame.socketTask = GameEngine.taskHandler.newSocketTask(Varps.worldHost, class290.currentPort);
				}

				if (StudioGame.socketTask.status == 2) {
					throw new IOException();
				}

				if (StudioGame.socketTask.status == 1) {
					if (useBufferedSocket) {
						Socket var4 = (Socket)StudioGame.socketTask.result;
						BufferedNetSocket var3 = new BufferedNetSocket(var4, 40000, 5000);
						var1 = var3;
					} else {
						var1 = new NetSocket((Socket)StudioGame.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					StudioGame.socketTask = null;
					loginState = 2;
				}
			}

			if (loginState == 2) {
				packetWriter.clearBuffer();
				PacketBufferNode var22 = ArchiveLoader.method1779();
				var22.packetBuffer.writeByte(LoginPacket.field2791.id);
				packetWriter.addNode(var22);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			boolean var12;
			int var13;
			if (loginState == 3) {
				if (WorldMapDecoration.pcmPlayer0 != null) {
					WorldMapDecoration.pcmPlayer0.method479();
				}

				if (VarcInt.pcmPlayer1 != null) {
					VarcInt.pcmPlayer1.method479();
				}

				var12 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var12 = false;
				}

				if (var12) {
					var13 = ((AbstractSocket)var1).readUnsignedByte();
					if (WorldMapDecoration.pcmPlayer0 != null) {
						WorldMapDecoration.pcmPlayer0.method479();
					}

					if (VarcInt.pcmPlayer1 != null) {
						VarcInt.pcmPlayer1.method479();
					}

					if (var13 != 0) {
						StudioGame.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					loginState = 4;
				}
			}

			int var33;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var33 = ((AbstractSocket)var1).available();
					if (var33 > 8 - var2.offset) {
						var33 = 8 - var2.offset;
					}

					if (var33 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var33);
						var2.offset += var33;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					WorldMapCacheName.field2119 = var2.readLong();
					loginState = 5;
				}
			}

			int var7;
			int var8;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var23 = new PacketBuffer(500);
				int[] var25 = new int[]{class98.secureRandom.nextInt(), class98.secureRandom.nextInt(), class98.secureRandom.nextInt(), class98.secureRandom.nextInt()};
				var23.offset = 0;
				var23.writeByte(1);
				var23.writeInt(var25[0]);
				var23.writeInt(var25[1]);
				var23.writeInt(var25[2]);
				var23.writeInt(var25[3]);
				var23.writeLong(WorldMapCacheName.field2119);
				if (gameState == 40) {
					var23.writeInt(class41.field356[0]);
					var23.writeInt(class41.field356[1]);
					var23.writeInt(class41.field356[2]);
					var23.writeInt(class41.field356[3]);
				} else {
					var23.writeByte(field447.rsOrdinal());
					switch(field447.field1269) {
					case 0:
					case 1:
						var23.writeMedium(class282.field3639);
						++var23.offset;
						break;
					case 2:
						var23.offset += 4;
						break;
					case 3:
						var23.writeInt((Integer)Decimator.clientPreferences.parameters.get(WorldMapIcon_1.method3265(Login.Login_username)));
					}

					var23.writeByte(class388.field4230.rsOrdinal());
					var23.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var23.encryptRsa(class54.field792, class54.field791);
				class41.field356 = var25;
				PacketBufferNode var6 = CollisionMap.method3205();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(LoginPacket.field2792.id);
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field2789.id);
				}

				var6.packetBuffer.writeShort(0);
				var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(198);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field473);
				var6.packetBuffer.writeBytes(var23.array, 0, var23.offset);
				var8 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(MouseRecorder.canvasWidth);
				var6.packetBuffer.writeShort(canvasHeight);
				class144.method2803(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(SpotAnimationDefinition.field1660);
				var6.packetBuffer.writeInt(class407.field4313);
				Buffer var9 = new Buffer(ServerPacket.platformInfo.size());
				ServerPacket.platformInfo.write(var9);
				var6.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.method6703(class339.archive11.hash);
				var6.packetBuffer.method6701(GameEngine.archive17.hash);
				var6.packetBuffer.writeInt(Decimator.archive3.hash);
				var6.packetBuffer.writeIntME(Tiles.archive15.hash);
				var6.packetBuffer.method6703(ClanChannel.archive13.hash);
				var6.packetBuffer.method6703(class126.archive9.hash);
				var6.packetBuffer.method6703(InvDefinition.archive4.hash);
				var6.packetBuffer.method6703(Skeleton.archive5.hash);
				var6.packetBuffer.writeIntME(ClanChannelMember.archive10.hash);
				var6.packetBuffer.writeIntME(class74.archive7.hash);
				var6.packetBuffer.writeIntME(Language.archive1.hash);
				var6.packetBuffer.method6701(class270.archive8.hash);
				var6.packetBuffer.method6701(Decimator.archive19.hash);
				var6.packetBuffer.writeInt(ApproximateRouteStrategy.archive12.hash);
				var6.packetBuffer.method6701(0);
				var6.packetBuffer.method6701(ClanMate.archive20.hash);
				var6.packetBuffer.method6701(ItemLayer.archive14.hash);
				var6.packetBuffer.method6701(class108.archive6.hash);
				var6.packetBuffer.writeIntME(class15.archive18.hash);
				var6.packetBuffer.writeIntME(ItemLayer.archive2.hash);
				var6.packetBuffer.writeInt(class120.archive0.hash);
				var6.packetBuffer.xteaEncrypt(var25, var8, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var25);
				int[] var10 = new int[4];

				for (int var11 = 0; var11 < 4; ++var11) {
					var10[var11] = var25[var11] + 50;
				}

				var2.newIsaacCipher(var10);
				loginState = 6;
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var33 = ((AbstractSocket)var1).readUnsignedByte();
				if (var33 == 21 && gameState == 20) {
					loginState = 12;
				} else if (var33 == 2) {
					loginState = 14;
				} else if (var33 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					loginState = 19;
				} else if (var33 == 64) {
					loginState = 10;
				} else if (var33 == 23 && field439 < 1) {
					++field439;
					loginState = 0;
				} else if (var33 == 29) {
					loginState = 17;
				} else {
					if (var33 != 69) {
						StudioGame.getLoginError(var33);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class122.field1425 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class122.field1425) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class122.field1425);
				class6[] var24 = new class6[]{class6.field16};
				class6 var27 = var24[var2.readUnsignedByte()];

				try {
					switch(var27.field10) {
					case 0:
						class0 var5 = new class0();
						this.field445 = new class7(var2, var5);
						loginState = 9;
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var20) {
					StudioGame.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field445.method46()) {
				this.field595 = this.field445.method57();
				this.field445.method49();
				this.field445 = null;
				if (this.field595 == null) {
					StudioGame.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				PacketBufferNode var28 = CollisionMap.method3205();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(LoginPacket.field2793.id);
				var28.packetBuffer.writeShort(this.field595.offset);
				var28.packetBuffer.method6651(this.field595);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field595 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				class216.field2548 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class216.field2548) {
				((AbstractSocket)var1).read(var2.array, 0, class216.field2548);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field589 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field438 = 0;
				setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field589 / 60 + " seconds.");
				if (--field589 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					ModeWhere.field3713 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= ModeWhere.field3713) {
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var34 = false;
					if (var12) {
						var13 = var2.readByteIsaac() << 24;
						var13 |= var2.readByteIsaac() << 16;
						var13 |= var2.readByteIsaac() << 8;
						var13 |= var2.readByteIsaac();
						String var32 = Login.Login_username;
						var7 = var32.length();
						var8 = 0;
						int var14 = 0;

						while (true) {
							if (var14 >= var7) {
								if (Decimator.clientPreferences.parameters.size() >= 10 && !Decimator.clientPreferences.parameters.containsKey(var8)) {
									Iterator var16 = Decimator.clientPreferences.parameters.entrySet().iterator();
									var16.next();
									var16.remove();
								}

								Decimator.clientPreferences.parameters.put(var8, var13);
								break;
							}

							var8 = (var8 << 5) - var8 + var32.charAt(var14);
							++var14;
						}
					}

					if (Login_isUsernameRemembered) {
						Decimator.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						Decimator.clientPreferences.rememberedUsername = null;
					}

					MilliClock.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field525 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var29 = WorldMapAreaData.ServerPacket_values();
					int var17 = var2.readSmartByteShortIsaac();
					if (var17 < 0 || var17 >= var29.length) {
						throw new IOException(var17 + " " + var2.offset);
					}

					packetWriter.serverPacket = var29[var17];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class14.method148(Script.client, "zap");
					} catch (Throwable var19) {
					}

					loginState = 16;
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5677();
						class119.method2471();
						ScriptFrame.updatePlayer(var2);
						MouseHandler.field136 = -1;
						MusicPatchPcmStream.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						Buddy.field3869 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= Buddy.field3869) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, Buddy.field3869);
						var2.offset = 0;
						String var26 = var2.readStringCp1252NullTerminated();
						String var30 = var2.readStringCp1252NullTerminated();
						String var31 = var2.readStringCp1252NullTerminated();
						setLoginResponseString(var26, var30, var31);
						class16.updateGameState(10);
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
							var33 = packetWriter.serverPacketLength;
							timer.method5666();
							class288.method5202();
							ScriptFrame.updatePlayer(var2);
							if (var33 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field438;
						if (field438 > 2000) {
							if (field439 < 1) {
								if (WorldMapManager.worldPort == class290.currentPort) {
									class290.currentPort = class4.js5Port;
								} else {
									class290.currentPort = WorldMapManager.worldPort;
								}

								++field439;
								loginState = 0;
							} else {
								StudioGame.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var21) {
			if (field439 < 1) {
				if (class290.currentPort == WorldMapManager.worldPort) {
					class290.currentPort = class4.js5Port;
				} else {
					class290.currentPort = WorldMapManager.worldPort;
				}

				++field439;
				loginState = 0;
			} else {
				StudioGame.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1917564901"
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
			WorldMapSection0.method3580();
		} else {
			if (!isMenuOpen) {
				KeyHandler.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method914(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class41.reflectionChecks.last();
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
						if (timer.field3781) {
							var14 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2575, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method5661();
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
						synchronized(class6.mouseRecorder.lock) {
							if (!field634) {
								class6.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class6.mouseRecorder.index >= 40) {
								var32 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class6.mouseRecorder.index && (var32 == null || var32.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class6.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = class6.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field417 || var8 != field418) {
										if (var32 == null) {
											var32 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2625, packetWriter.isaacCipher);
											var32.packetBuffer.writeByte(0);
											var3 = var32.packetBuffer.offset;
											PacketBuffer var10000 = var32.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (field419 != -1L) {
											var10 = var9 - field417;
											var11 = var8 - field418;
											var12 = (int)((class6.mouseRecorder.millis[var7] - field419) / 20L);
											var5 = (int)((long)var5 + (class6.mouseRecorder.millis[var7] - field419) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field417 = var9;
										field418 = var8;
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
										field419 = class6.mouseRecorder.millis[var7];
									}
								}

								if (var32 != null) {
									var32.packetBuffer.writeLengthByte(var32.packetBuffer.offset - var3);
									var7 = var32.packetBuffer.offset;
									var32.packetBuffer.offset = var3;
									var32.packetBuffer.writeByte(var5 / var6);
									var32.packetBuffer.writeByte(var5 % var6);
									var32.packetBuffer.offset = var7;
									packetWriter.addNode(var32);
								}

								if (var4 >= class6.mouseRecorder.index) {
									class6.mouseRecorder.index = 0;
								} else {
									MouseRecorder var46 = class6.mouseRecorder;
									var46.index -= var4;
									System.arraycopy(class6.mouseRecorder.xs, var4, class6.mouseRecorder.xs, 0, class6.mouseRecorder.index);
									System.arraycopy(class6.mouseRecorder.ys, var4, class6.mouseRecorder.ys, 0, class6.mouseRecorder.index);
									System.arraycopy(class6.mouseRecorder.millis, var4, class6.mouseRecorder.millis, 0, class6.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class310.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > canvasHeight) {
								var3 = canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > MouseRecorder.canvasWidth) {
								var4 = MouseRecorder.canvasWidth;
							}

							var5 = (int)var16;
							var18 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2579, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field35 > 0) {
							var14 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2563, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = UrlRequester.method2125();

							for (var5 = 0; var5 < KeyHandler.field35; ++var5) {
								long var21 = var19 - field635;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field635 = var19;
								var14.packetBuffer.writeMedium((int)var21);
								var14.packetBuffer.writeByte(KeyHandler.field53[var5]);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field607 > 0) {
							--field607;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field491 = true;
						}

						if (field491 && field607 <= 0) {
							field607 = 20;
							field491 = false;
							var14 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2641, packetWriter.isaacCipher);
							var14.packetBuffer.method6692(camAngleY);
							var14.packetBuffer.method6786(camAngleX);
							packetWriter.addNode(var14);
						}

						if (class255.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2598, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!class255.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2598, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (PcmPlayer.worldMap != null) {
							PcmPlayer.worldMap.method6324();
						}

						ChatChannel.method1734();
						MusicPatchPcmStream.method4644();
						int[] var33;
						if (field638 != GrandExchangeEvent.Client_plane) {
							field638 = GrandExchangeEvent.Client_plane;
							var1 = GrandExchangeEvent.Client_plane;
							var33 = class376.sceneMinimapSprite.pixels;
							var3 = var33.length;

							for (var4 = 0; var4 < var3; ++var4) {
								var33[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) {
								var5 = (103 - var4) * 2048 + 24628;

								for (var6 = 1; var6 < 103; ++var6) {
									if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
										WorldMapIcon_1.scene.drawTileMinimap(var33, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
										WorldMapIcon_1.scene.drawTileMinimap(var33, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4;
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							class376.sceneMinimapSprite.setRaster();

							for (var6 = 1; var6 < 103; ++var6) {
								for (var7 = 1; var7 < 103; ++var7) {
									if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
										Fonts.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) {
										Fonts.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var23 = WorldMapIcon_1.scene.getFloorDecorationTag(GrandExchangeEvent.Client_plane, var6, var7);
									if (0L != var23) {
										var10 = class78.Entity_unpackID(var23);
										var11 = ClanChannel.getObjectDefinition(var10).mapIconId;
										if (var11 >= 0 && HealthBarUpdate.WorldMapElement_get(var11).field1541) {
											mapIcons[mapIconCount] = HealthBarUpdate.WorldMapElement_get(var11).getSpriteBool(false);
											mapIconXs[mapIconCount] = var6;
											mapIconYs[mapIconCount] = var7;
											++mapIconCount;
										}
									}
								}
							}

							class263.rasterProvider.apply();
						}

						if (gameState != 30) {
							return;
						}

						AbstractByteArrayCopier.method4858();
						FloorDecoration.method3877();
						++packetWriter.field1209;
						if (packetWriter.field1209 > 750) {
							WorldMapSection0.method3580();
							return;
						}

						var1 = Players.Players_count;
						var33 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var25 = players[var33[var3]];
							if (var25 != null) {
								class16.updateActorSequence(var25, 1);
							}
						}

						NetSocket.method2629();
						class107.method2290();
						++field555;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (Canvas.field77 != null) {
							++field512;
							if (field512 >= 15) {
								AttackOption.invalidateWidget(Canvas.field77);
								Canvas.field77 = null;
							}
						}

						Widget var39 = Coord.mousedOverWidgetIf1;
						Widget var34 = ModeWhere.field3698;
						Coord.mousedOverWidgetIf1 = null;
						ModeWhere.field3698 = null;
						draggedOnWidget = null;
						field588 = false;
						field585 = false;
						field450 = 0;

						while (IgnoreList.isKeyDown() && field450 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class120.field1417 == 66) {
								String var41 = "";

								Message var40;
								for (Iterator var26 = Messages.Messages_hashTable.iterator(); var26.hasNext(); var41 = var41 + var40.sender + ':' + var40.text + '\n') {
									var40 = (Message)var26.next();
								}

								Script.client.clipboardSetString(var41);
							} else if (oculusOrbState != 1 || class126.field1449 <= 0) {
								field430[field450] = class120.field1417;
								field633[field450] = class126.field1449;
								++field450;
							}
						}

						if (KitDefinition.method2779() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var3 = MouseHandler.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != MouseHandler.localPlayer.plane) {
								var4 = MouseHandler.localPlayer.pathX[0] + GrandExchangeOfferNameComparator.baseX;
								var5 = MouseHandler.localPlayer.pathY[0] + NPC.baseY;
								var18 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2634, packetWriter.isaacCipher);
								var18.packetBuffer.writeByte(var3);
								var18.packetBuffer.writeShort(var5);
								var18.packetBuffer.method6786(var4);
								var18.packetBuffer.writeInt(0);
								packetWriter.addNode(var18);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class245.updateRootInterface(rootInterface, 0, 0, MouseRecorder.canvasWidth, canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							ScriptEvent var27;
							Widget var42;
							Widget var43;
							do {
								var27 = (ScriptEvent)field611.removeLast();
								if (var27 == null) {
									while (true) {
										do {
											var27 = (ScriptEvent)field685.removeLast();
											if (var27 == null) {
												while (true) {
													do {
														var27 = (ScriptEvent)scriptEvents.removeLast();
														if (var27 == null) {
															this.menu();
															if (PcmPlayer.worldMap != null) {
																PcmPlayer.worldMap.method6162(GrandExchangeEvent.Client_plane, (MouseHandler.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX, (MouseHandler.localPlayer.y >> 7) + NPC.baseY, false);
																PcmPlayer.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method920();
															}

															PacketBufferNode var28;
															if (dragInventoryWidget != null) {
																AttackOption.invalidateWidget(dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field519) {
																		if (hoveredItemContainer == dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) {
																			Widget var45 = dragInventoryWidget;
																			byte var35 = 0;
																			if (field654 == 1 && var45.contentType == 206) {
																				var35 = 1;
																			}

																			if (var45.itemIds[dragItemSlotDestination] <= 0) {
																				var35 = 0;
																			}

																			var6 = MusicPatchNode.getWidgetFlags(var45);
																			boolean var36 = (var6 >> 29 & 1) != 0;
																			if (var36) {
																				var7 = dragItemSlotSource;
																				var8 = dragItemSlotDestination;
																				var45.itemIds[var8] = var45.itemIds[var7];
																				var45.itemQuantities[var8] = var45.itemQuantities[var7];
																				var45.itemIds[var7] = -1;
																				var45.itemQuantities[var7] = 0;
																			} else if (var35 == 1) {
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

																			var28 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2577, packetWriter.isaacCipher);
																			var28.packetBuffer.writeIntME(dragInventoryWidget.id);
																			var28.packetBuffer.method6786(dragItemSlotSource);
																			var28.packetBuffer.method6692(dragItemSlotDestination);
																			var28.packetBuffer.writeByte(var35);
																			packetWriter.addNode(var28);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var3 = draggedWidgetX;
																		var4 = draggedWidgetY;
																		SoundCache.method542(ClanChannelMember.tempMenuAction, var3, var4);
																		ClanChannelMember.tempMenuAction = null;
																	}

																	field512 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field519 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var3 = Scene.Scene_selectedX;
																var4 = Scene.Scene_selectedY;
																PacketBufferNode var44 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2612, packetWriter.isaacCipher);
																var44.packetBuffer.writeByte(5);
																var44.packetBuffer.method6786(var3 + GrandExchangeOfferNameComparator.baseX);
																var44.packetBuffer.writeShort(var4 + NPC.baseY);
																var44.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																packetWriter.addNode(var44);
																Scene.method4014();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var3;
																destinationY = var4;
															}

															if (var39 != Coord.mousedOverWidgetIf1) {
																if (var39 != null) {
																	AttackOption.invalidateWidget(var39);
																}

																if (Coord.mousedOverWidgetIf1 != null) {
																	AttackOption.invalidateWidget(Coord.mousedOverWidgetIf1);
																}
															}

															if (var34 != ModeWhere.field3698 && field648 == field559) {
																if (var34 != null) {
																	AttackOption.invalidateWidget(var34);
																}

																if (ModeWhere.field3698 != null) {
																	AttackOption.invalidateWidget(ModeWhere.field3698);
																}
															}

															if (ModeWhere.field3698 != null) {
																if (field648 < field559) {
																	++field648;
																	if (field648 == field559) {
																		AttackOption.invalidateWidget(ModeWhere.field3698);
																	}
																}
															} else if (field648 > 0) {
																--field648;
															}

															if (oculusOrbState == 0) {
																var3 = MouseHandler.localPlayer.x;
																var4 = MouseHandler.localPlayer.y;
																if (KeyHandler.oculusOrbFocalPointX - var3 < -500 || KeyHandler.oculusOrbFocalPointX - var3 > 500 || ArchiveDiskAction.oculusOrbFocalPointY - var4 < -500 || ArchiveDiskAction.oculusOrbFocalPointY - var4 > 500) {
																	KeyHandler.oculusOrbFocalPointX = var3;
																	ArchiveDiskAction.oculusOrbFocalPointY = var4;
																}

																if (var3 != KeyHandler.oculusOrbFocalPointX) {
																	KeyHandler.oculusOrbFocalPointX += (var3 - KeyHandler.oculusOrbFocalPointX) / 16;
																}

																if (var4 != ArchiveDiskAction.oculusOrbFocalPointY) {
																	ArchiveDiskAction.oculusOrbFocalPointY += (var4 - ArchiveDiskAction.oculusOrbFocalPointY) / 16;
																}

																var5 = KeyHandler.oculusOrbFocalPointX >> 7;
																var6 = ArchiveDiskAction.oculusOrbFocalPointY >> 7;
																var7 = class122.getTileHeight(KeyHandler.oculusOrbFocalPointX, ArchiveDiskAction.oculusOrbFocalPointY, GrandExchangeEvent.Client_plane);
																var8 = 0;
																if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
																	for (var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
																		for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																			var11 = GrandExchangeEvent.Client_plane;
																			if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) {
																				++var11;
																			}

																			var12 = var7 - Tiles.Tiles_heights[var11][var9][var10];
																			if (var12 > var8) {
																				var8 = var12;
																			}
																		}
																	}
																}

																var9 = var8 * 192;
																if (var9 > 98048) {
																	var9 = 98048;
																}

																if (var9 < 32768) {
																	var9 = 32768;
																}

																if (var9 > field492) {
																	field492 += (var9 - field492) / 24;
																} else if (var9 < field492) {
																	field492 += (var9 - field492) / 80;
																}

																class270.field3532 = class122.getTileHeight(MouseHandler.localPlayer.x, MouseHandler.localPlayer.y, GrandExchangeEvent.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																class108.method2294();
																short var37 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var37 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var37 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var37 == 0) {
																		var37 = 1792;
																	} else if (var37 == 1024) {
																		var37 = 1280;
																	} else {
																		var37 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var37 == 0) {
																		var37 = 256;
																	} else if (var37 == 1024) {
																		var37 = 768;
																	} else {
																		var37 = 512;
																	}
																}

																byte var38 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var38 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var38 = 1;
																}

																var5 = 0;
																if (var37 >= 0 || var38 != 0) {
																	var5 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * -410802453 * 701944259 : oculusOrbNormalSpeed * -2093914857 * 196485799;
																	var5 *= 16;
																	field440 = var37;
																	field485 = var38;
																}

																if (field433 < var5) {
																	field433 += var5 / 8;
																	if (field433 > var5) {
																		field433 = var5;
																	}
																} else if (field433 > var5) {
																	field433 = field433 * 9 / 10;
																}

																if (field433 > 0) {
																	var6 = field433 / 16;
																	if (field440 >= 0) {
																		var3 = field440 - class117.cameraYaw & 2047;
																		var7 = Rasterizer3D.Rasterizer3D_sine[var3];
																		var8 = Rasterizer3D.Rasterizer3D_cosine[var3];
																		KeyHandler.oculusOrbFocalPointX += var6 * var7 / 65536;
																		ArchiveDiskAction.oculusOrbFocalPointY += var6 * var8 / 65536;
																	}

																	if (field485 != 0) {
																		class270.field3532 += var6 * field485;
																		if (class270.field3532 > 0) {
																			class270.field3532 = 0;
																		}
																	}
																} else {
																	field440 = -1;
																	field485 = -1;
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	packetWriter.addNode(VerticalAlignment.getPacketBufferNode(ClientPacket.field2633, packetWriter.isaacCipher));
																	oculusOrbState = 0;
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && class310.mouseCam) {
																var3 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var3 * 2;
																mouseCamClickedY = var3 != -1 && var3 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * 722992051 * 1434528635;
																var4 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var4 * 2;
																mouseCamClickedX = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_x + mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x * 1500047367 * 674629047;
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
																class161.method3211();
															}

															for (var3 = 0; var3 < 5; ++var3) {
																int var10002 = field659[var3]++;
															}

															Decimator.varcs.tryWrite();
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1;
															var5 = KeyHandler.KeyHandler_idleCycles;
															if (var3 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var28 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2663, packetWriter.isaacCipher);
																packetWriter.addNode(var28);
															}

															Canvas.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var28 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2573, packetWriter.isaacCipher);
																packetWriter.addNode(var28);
															}

															try {
																packetWriter.flush();
															} catch (IOException var29) {
																WorldMapSection0.method3580();
															}

															return;
														}

														var42 = var27.widget;
														if (var42.childIndex < 0) {
															break;
														}

														var43 = UrlRequester.getWidget(var42.parentId);
													} while(var43 == null || var43.children == null || var42.childIndex >= var43.children.length || var42 != var43.children[var42.childIndex]);

													UserComparator10.runScriptEvent(var27);
												}
											}

											var42 = var27.widget;
											if (var42.childIndex < 0) {
												break;
											}

											var43 = UrlRequester.getWidget(var42.parentId);
										} while(var43 == null || var43.children == null || var42.childIndex >= var43.children.length || var42 != var43.children[var42.childIndex]);

										UserComparator10.runScriptEvent(var27);
									}
								}

								var42 = var27.widget;
								if (var42.childIndex < 0) {
									break;
								}

								var43 = UrlRequester.getWidget(var42.parentId);
							} while(var43 == null || var43.children == null || var42.childIndex >= var43.children.length || var42 != var43.children[var42.childIndex]);

							UserComparator10.runScriptEvent(var27);
						}
					}

					var32 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2590, packetWriter.isaacCipher);
					var32.packetBuffer.writeByte(0);
					var3 = var32.packetBuffer.offset;
					PendingSpawn.performReflectionCheck(var32.packetBuffer);
					var32.packetBuffer.writeLengthByte(var32.packetBuffer.offset - var3);
					packetWriter.addNode(var32);
				}
			}
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-684261743"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = MouseRecorder.canvasWidth;
		int var2 = canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (Decimator.clientPreferences != null) {
			try {
				class14.method155(Script.client, "resize", new Object[]{MusicPatch.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2084613464"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (Huffman.loadInterface(var1)) {
				VarcInt.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field616[var1]) {
				field617[var1] = true;
			}

			field508[var1] = field616[var1];
			field616[var1] = false;
		}

		field615 = cycle;
		viewportX = -1;
		viewportY = -1;
		hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class41.drawWidgets(rootInterface, 0, 0, MouseRecorder.canvasWidth, canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				Varcs.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				Varcs.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = CollisionMap.method3204();
					String var13;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var13 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var13 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var14;
						if (var3 < 0) {
							var14 = "";
						} else if (menuTargets[var3].length() > 0) {
							var14 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var14 = menuActions[var3];
						}

						var13 = var14;
					}

					if (menuOptionsCount > 2) {
						var13 = var13 + ScriptFrame.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					TaskHandler.fontBold12.drawRandomAlphaAndSpacing(var13, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			var1 = SpotAnimationDefinition.menuX;
			var2 = DefaultsGroup.menuY;
			var3 = DevicePcmPlayerProvider.menuWidth;
			int var4 = GraphicsObject.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			TaskHandler.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
				int var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31;
				int var10 = 16777215;
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				Font var11 = TaskHandler.fontBold12;
				String var12;
				if (var8 < 0) {
					var12 = "";
				} else if (menuTargets[var8].length() > 0) {
					var12 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var12 = menuActions[var8];
				}

				var11.draw(var12, var1 + 3, var9, var10, 0);
			}

			NPCComposition.method2830(SpotAnimationDefinition.menuX, DefaultsGroup.menuY, DevicePcmPlayerProvider.menuWidth, GraphicsObject.menuHeight);
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field508[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field617[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		World.method1427(GrandExchangeEvent.Client_plane, MouseHandler.localPlayer.x, MouseHandler.localPlayer.y, field555);
		field555 = 0;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lcj;B)Z",
		garbageValue = "28"
	)
	final boolean method914(PacketWriter var1) {
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
					if (var1.field1210) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1209 = 0;
						var1.field1210 = false;
					}

					var3.offset = 0;
					if (var3.method6598()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1209 = 0;
					}

					var1.field1210 = true;
					ServerPacket[] var4 = WorldMapAreaData.ServerPacket_values();
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
				var1.field1209 = 0;
				timer.method5657();
				var1.field1212 = var1.field1213;
				var1.field1213 = var1.field1211;
				var1.field1211 = var1.serverPacket;
				boolean var68;
				if (ServerPacket.field2720 == var1.serverPacket) {
					var68 = var3.readBoolean();
					if (var68) {
						if (class367.field4127 == null) {
							class367.field4127 = new class287();
						}
					} else {
						class367.field4127 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2708 == var1.serverPacket) {
					if (rootInterface != -1) {
						WorldMapData_0.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				int var58;
				Widget var67;
				if (ServerPacket.field2731 == var1.serverPacket) {
					var58 = var3.method6704();
					var67 = UrlRequester.getWidget(var58);

					for (var6 = 0; var6 < var67.itemIds.length; ++var6) {
						var67.itemIds[var6] = -1;
						var67.itemIds[var6] = 0;
					}

					AttackOption.invalidateWidget(var67);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2729 == var1.serverPacket) {
					class79.updatePlayers(var3, var1.serverPacketLength);
					HitSplatDefinition.method2981();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2781 == var1.serverPacket) {
					publicChatMode = var3.method6873();
					tradeChatMode = var3.method6688();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2719 == var1.serverPacket) {
					for (var58 = 0; var58 < players.length; ++var58) {
						if (players[var58] != null) {
							players[var58].sequence = -1;
						}
					}

					for (var58 = 0; var58 < npcs.length; ++var58) {
						if (npcs[var58] != null) {
							npcs[var58].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var57;
				String var71;
				if (ServerPacket.field2740 == var1.serverPacket) {
					var58 = var3.readUShortSmart();
					var57 = var3.readUnsignedByte() == 1;
					var71 = "";
					boolean var54 = false;
					if (var57) {
						var71 = var3.readStringCp1252NullTerminated();
						if (Canvas.friendSystem.isIgnored(new Username(var71, GraphicsObject.loginType))) {
							var54 = true;
						}
					}

					String var52 = var3.readStringCp1252NullTerminated();
					if (!var54) {
						class120.addGameMessage(var58, var71, var52);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2770 == var1.serverPacket) {
					var58 = var3.method6706();
					var67 = UrlRequester.getWidget(var58);
					var67.modelType = 3;
					var67.modelId = MouseHandler.localPlayer.appearance.getChatHeadId();
					AttackOption.invalidateWidget(var67);
					var1.serverPacket = null;
					return true;
				}

				int var15;
				byte var17;
				String var24;
				if (ServerPacket.field2725 == var1.serverPacket) {
					var17 = var3.readByte();
					var18 = var3.readStringCp1252NullTerminated();
					long var20 = (long)var3.readUnsignedShort();
					long var22 = (long)var3.readMedium();
					PlayerType var55 = (PlayerType)Huffman.findEnumerated(Messages.PlayerType_values(), var3.readUnsignedByte());
					long var11 = (var20 << 32) + var22;
					boolean var56 = false;
					ClanChannel var14 = null;
					var14 = var17 >= 0 ? currentClanChannels[var17] : FriendLoginUpdate.guestClanChannel;
					if (var14 == null) {
						var56 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var55.isUser && Canvas.friendSystem.isIgnored(new Username(var18, GraphicsObject.loginType))) {
									var56 = true;
								}
								break;
							}

							if (var11 == crossWorldMessageIds[var15]) {
								var56 = true;
								break;
							}

							++var15;
						}
					}

					if (!var56) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var24 = AbstractFont.escapeBrackets(WorldMapSectionType.method3608(var3));
						int var16 = var17 >= 0 ? 41 : 44;
						if (var55.modIcon != -1) {
							TaskHandler.addChatMessage(var16, HealthBar.method1945(var55.modIcon) + var18, var24, var14.name);
						} else {
							TaskHandler.addChatMessage(var16, var18, var24, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var9;
				int var25;
				int var26;
				if (ServerPacket.field2775 == var1.serverPacket) {
					isCameraLocked = true;
					class376.field4165 = var3.readUnsignedByte();
					ItemLayer.field2147 = var3.readUnsignedByte();
					AbstractSocket.field3874 = var3.readUnsignedShort();
					KitDefinition.field1577 = var3.readUnsignedByte();
					Strings.field3397 = var3.readUnsignedByte();
					if (Strings.field3397 >= 100) {
						var58 = class376.field4165 * 128 + 64;
						var5 = ItemLayer.field2147 * 128 + 64;
						var6 = class122.getTileHeight(var58, var5, GrandExchangeEvent.Client_plane) - AbstractSocket.field3874;
						var7 = var58 - ItemContainer.cameraX;
						var25 = var6 - Bounds.cameraY;
						var9 = var5 - WorldMapArchiveLoader.cameraZ;
						var26 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						class116.cameraPitch = (int)(Math.atan2((double)var25, (double)var26) * 325.949D) & 2047;
						class117.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
						if (class116.cameraPitch < 128) {
							class116.cameraPitch = 128;
						}

						if (class116.cameraPitch > 383) {
							class116.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var13;
				long var27;
				long var29;
				String var34;
				String var48;
				if (ServerPacket.field2737 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					PlayerType var31 = (PlayerType)Huffman.findEnumerated(Messages.PlayerType_values(), var3.readUnsignedByte());
					long var32 = (var27 << 32) + var29;
					boolean var12 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var32 == crossWorldMessageIds[var13]) {
							var12 = true;
							break;
						}
					}

					if (Canvas.friendSystem.isIgnored(new Username(var48, GraphicsObject.loginType))) {
						var12 = true;
					}

					if (!var12 && field521 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var32;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = AbstractFont.escapeBrackets(GrandExchangeOffer.method5167(WorldMapSectionType.method3608(var3)));
						byte var75;
						if (var31.isPrivileged) {
							var75 = 7;
						} else {
							var75 = 3;
						}

						if (var31.modIcon != -1) {
							class120.addGameMessage(var75, HealthBar.method1945(var31.modIcon) + var48, var34);
						} else {
							class120.addGameMessage(var75, var48, var34);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2762 == var1.serverPacket) {
					class124.privateChatMode = FloorOverlayDefinition.method3134(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2701 == var1.serverPacket) {
					Canvas.method114(class227.field2680);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2745 == var1.serverPacket) {
					Canvas.method114(class227.field2676);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2699 == var1.serverPacket) {
					Canvas.method114(class227.field2678);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2777 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var5 = var3.method6686();
					var6 = var3.method6686();
					if (var6 >= 1 && var6 <= 8) {
						if (var48.equalsIgnoreCase("null")) {
							var48 = null;
						}

						playerMenuActions[var6 - 1] = var48;
						playerOptionsPriorities[var6 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2748 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var18 = AbstractFont.escapeBrackets(GrandExchangeOffer.method5167(WorldMapSectionType.method3608(var3)));
					class120.addGameMessage(6, var48, var18);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2744 == var1.serverPacket) {
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

				if (ServerPacket.field2782 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					Object[] var66 = new Object[var48.length() + 1];

					for (var6 = var48.length() - 1; var6 >= 0; --var6) {
						if (var48.charAt(var6) == 's') {
							var66[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var66[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var66[0] = new Integer(var3.readInt());
					ScriptEvent var72 = new ScriptEvent();
					var72.args = var66;
					UserComparator10.runScriptEvent(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2760 == var1.serverPacket) {
					var17 = var3.method6690();
					var5 = var3.method6785();
					Varps.Varps_temp[var5] = var17;
					if (Varps.Varps_main[var5] != var17) {
						Varps.Varps_main[var5] = var17;
					}

					ApproximateRouteStrategy.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2783 == var1.serverPacket) {
					SecureRandomFuture.field858 = var3.readUnsignedByte();
					Language.field3694 = var3.method6688();

					for (var58 = Language.field3694; var58 < Language.field3694 + 8; ++var58) {
						for (var5 = SecureRandomFuture.field858; var5 < SecureRandomFuture.field858 + 8; ++var5) {
							if (groundItems[GrandExchangeEvent.Client_plane][var58][var5] != null) {
								groundItems[GrandExchangeEvent.Client_plane][var58][var5] = null;
								FriendSystem.updateItemPile(var58, var5);
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
						if (var50.x >= Language.field3694 && var50.x < Language.field3694 + 8 && var50.y >= SecureRandomFuture.field858 && var50.y < SecureRandomFuture.field858 + 8 && var50.plane == GrandExchangeEvent.Client_plane) {
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2750 == var1.serverPacket) {
					var58 = var3.readInt();
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var58);
					if (var65 != null) {
						class161.closeInterface(var65, true);
					}

					if (meslayerContinueWidget != null) {
						AttackOption.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var63;
				if (ServerPacket.field2763 == var1.serverPacket) {
					var58 = var3.method6672();
					var5 = var3.method6699();
					var63 = UrlRequester.getWidget(var58);
					if (var5 != var63.sequenceId || var5 == -1) {
						var63.sequenceId = var5;
						var63.modelFrame = 0;
						var63.modelFrameCycle = 0;
						AttackOption.invalidateWidget(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2773 == var1.serverPacket) {
					byte[] var49 = new byte[var1.serverPacketLength];
					var3.method6600(var49, 0, var49.length);
					Buffer var64 = new Buffer(var49);
					var71 = var64.readStringCp1252NullTerminated();
					InvDefinition.openURL(var71, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2718 == var1.serverPacket) {
					class107.method2291();
					runEnergy = var3.readUnsignedByte();
					field516 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2754 == var1.serverPacket) {
					for (var58 = 0; var58 < Varps.Varps_main.length; ++var58) {
						if (Varps.Varps_main[var58] != Varps.Varps_temp[var58]) {
							Varps.Varps_main[var58] = Varps.Varps_temp[var58];
							ApproximateRouteStrategy.changeGameOptions(var58);
							changedVarps[++changedVarpCount - 1 & 31] = var58;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2735 == var1.serverPacket) {
					isCameraLocked = false;

					for (var58 = 0; var58 < 5; ++var58) {
						field655[var58] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2749 == var1.serverPacket) {
					var58 = var3.method6706();
					var57 = var3.method6873() == 1;
					var63 = UrlRequester.getWidget(var58);
					if (var57 != var63.isHidden) {
						var63.isHidden = var57;
						AttackOption.invalidateWidget(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2736 == var1.serverPacket) {
					var58 = var3.method6704();
					var5 = var3.method6785();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var25 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var25 << 3);
					Widget var53 = UrlRequester.getWidget(var58);
					if (var9 != var53.color) {
						var53.color = var9;
						AttackOption.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2702 == var1.serverPacket) {
					if (MouseRecorder.friendsChat != null) {
						MouseRecorder.friendsChat.method5724(var3);
					}

					GameEngine.method343();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2767 == var1.serverPacket) {
					Canvas.method114(class227.field2677);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2705 == var1.serverPacket) {
					Language.field3694 = var3.method6686();
					SecureRandomFuture.field858 = var3.method6688();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2706 == var1.serverPacket) {
					Canvas.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field609 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2695 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				Widget var74;
				if (ServerPacket.field2723 == var1.serverPacket) {
					var58 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var6 = var3.method6697();
					var74 = UrlRequester.getWidget(var58);
					var74.field3013 = var5 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2752 == var1.serverPacket) {
					var58 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var58 < -70000) {
						var5 += 32768;
					}

					if (var58 >= 0) {
						var63 = UrlRequester.getWidget(var58);
					} else {
						var63 = null;
					}

					if (var63 != null) {
						for (var7 = 0; var7 < var63.itemIds.length; ++var7) {
							var63.itemIds[var7] = 0;
							var63.itemQuantities[var7] = 0;
						}
					}

					class104.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var25 = 0; var25 < var7; ++var25) {
						var9 = var3.method6696();
						var26 = var3.readUnsignedByte();
						if (var26 == 255) {
							var26 = var3.method6706();
						}

						if (var63 != null && var25 < var63.itemIds.length) {
							var63.itemIds[var25] = var9;
							var63.itemQuantities[var25] = var26;
						}

						VarpDefinition.itemContainerSetItem(var5, var25, var9 - 1, var26);
					}

					if (var63 != null) {
						AttackOption.invalidateWidget(var63);
					}

					class107.method2291();
					changedItemContainers[++field574 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				Widget var51;
				if (ServerPacket.field2747 == var1.serverPacket) {
					var58 = var3.readUnsignedShort();
					var5 = var3.method6697();
					var6 = var3.method6696();
					var7 = var3.method6706();
					var51 = UrlRequester.getWidget(var7);
					if (var5 != var51.modelAngleX || var6 != var51.modelAngleY || var58 != var51.modelZoom) {
						var51.modelAngleX = var5;
						var51.modelAngleY = var6;
						var51.modelZoom = var58;
						AttackOption.invalidateWidget(var51);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2712 == var1.serverPacket) {
					var58 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var58] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var58] = new GrandExchangeOffer(var3, false);
					}

					field606 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2721 == var1.serverPacket) {
					class107.method2291();
					var58 = var3.readUnsignedByte();
					var5 = var3.method6704();
					var6 = var3.method6688();
					experience[var58] = var5;
					currentLevels[var58] = var6;
					levels[var58] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var58] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var58;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2757 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						MouseRecorder.friendsChat = null;
					} else {
						if (MouseRecorder.friendsChat == null) {
							MouseRecorder.friendsChat = new FriendsChat(GraphicsObject.loginType, Script.client);
						}

						MouseRecorder.friendsChat.readUpdate(var3);
					}

					GameEngine.method343();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2766 == var1.serverPacket) {
					var58 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var63 = UrlRequester.getWidget(var58);
					if (var63.modelType != 1 || var5 != var63.modelId) {
						var63.modelType = 1;
						var63.modelId = var5;
						AttackOption.invalidateWidget(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2716 == var1.serverPacket) {
					var58 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field655[var58] = true;
					field436[var58] = var5;
					field608[var58] = var6;
					field658[var58] = var7;
					field659[var58] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2707 == var1.serverPacket) {
					var58 = var3.readInt();
					if (var58 != field488) {
						field488 = var58;
						class339.method6057();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2780 == var1.serverPacket) {
					Interpreter.method1635();
					var17 = var3.readByte();
					class106 var62 = new class106(var3);
					ClanSettings var70;
					if (var17 >= 0) {
						var70 = currentClanSettings[var17];
					} else {
						var70 = class41.guestClanSettings;
					}

					var62.method2273(var70);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2778 == var1.serverPacket) {
					var58 = var3.readUnsignedShort();
					rootInterface = var58;
					this.resizeRoot(false);
					Timer.Widget_resetModelFrames(var58);
					class112.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field616[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2755 == var1.serverPacket) {
					var58 = var3.method6697();
					if (var58 == 65535) {
						var58 = -1;
					}

					class41.playSong(var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2697 == var1.serverPacket) {
					var58 = var3.method6697();
					if (var58 == 65535) {
						var58 = -1;
					}

					var5 = var3.method6700();
					UrlRequest.method2136(var58, var5);
					var1.serverPacket = null;
					return true;
				}

				long var38;
				InterfaceParent var76;
				if (ServerPacket.field2746 == var1.serverPacket) {
					var58 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						Timer.Widget_resetModelFrames(rootInterface);
						class112.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field616[var7] = true;
						}
					}

					InterfaceParent var10;
					for (; var6-- > 0; var10.field947 = true) {
						var7 = var3.readInt();
						var25 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var10 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var10 != null && var25 != var10.group) {
							class161.closeInterface(var10, true);
							var10 = null;
						}

						if (var10 == null) {
							var10 = class106.method2275(var7, var25, var9);
						}
					}

					for (var76 = (InterfaceParent)interfaceParents.first(); var76 != null; var76 = (InterfaceParent)interfaceParents.next()) {
						if (var76.field947) {
							var76.field947 = false;
						} else {
							class161.closeInterface(var76, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var58) {
						var7 = var3.readInt();
						var25 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var26 = var3.readInt();

						for (int var77 = var25; var77 <= var9; ++var77) {
							var38 = (long)var77 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var26), var38);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2765 == var1.serverPacket) {
					Message.method879(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2751 == var1.serverPacket) {
					var58 = var3.method6706();
					var5 = var3.readInt();
					InterfaceParent var69 = (InterfaceParent)interfaceParents.get((long)var58);
					var76 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var76 != null) {
						class161.closeInterface(var76, var69 == null || var69.group != var76.group);
					}

					if (var69 != null) {
						var69.remove();
						interfaceParents.put(var69, (long)var5);
					}

					var51 = UrlRequester.getWidget(var58);
					if (var51 != null) {
						AttackOption.invalidateWidget(var51);
					}

					var51 = UrlRequester.getWidget(var5);
					if (var51 != null) {
						AttackOption.invalidateWidget(var51);
						AttackOption.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var51.id >>> 16], var51, true);
					}

					if (rootInterface != -1) {
						WorldMapData_0.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2756 == var1.serverPacket) {
					ParamComposition.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2691 == var1.serverPacket) {
					var58 = var3.method6686();
					var5 = var3.method6696();
					var6 = var3.readInt();
					var76 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var76 != null) {
						class161.closeInterface(var76, var5 != var76.group);
					}

					class106.method2275(var6, var5, var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2733 == var1.serverPacket) {
					var58 = var3.method6706();
					var18 = var3.readStringCp1252NullTerminated();
					var63 = UrlRequester.getWidget(var58);
					if (!var18.equals(var63.text)) {
						var63.text = var18;
						AttackOption.invalidateWidget(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2732 == var1.serverPacket) {
					class118.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2694 == var1.serverPacket) {
					Language.field3694 = var3.method6873();
					SecureRandomFuture.field858 = var3.method6873();

					while (var3.offset < var1.serverPacketLength) {
						var58 = var3.readUnsignedByte();
						class227 var61 = GameObject.method4342()[var58];
						Canvas.method114(var61);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2726 == var1.serverPacket) {
					Interpreter.method1635();
					var17 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var17 >= 0) {
							currentClanSettings[var17] = null;
						} else {
							class41.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var17 >= 0) {
						currentClanSettings[var17] = new ClanSettings(var3);
					} else {
						class41.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2772 == var1.serverPacket) {
					var58 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class127.queueSoundEffect(var58, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2727 == var1.serverPacket) {
					for (var58 = 0; var58 < GrandExchangeOfferAgeComparator.VarpDefinition_fileCount; ++var58) {
						VarpDefinition var60 = FriendSystem.VarpDefinition_get(var58);
						if (var60 != null) {
							Varps.Varps_temp[var58] = 0;
							Varps.Varps_main[var58] = 0;
						}
					}

					class107.method2291();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2743 == var1.serverPacket) {
					ParamComposition.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2717 == var1.serverPacket) {
					Canvas.friendSystem.method1440();
					field609 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2768 == var1.serverPacket) {
					ScriptFrame.field371 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2734 == var1.serverPacket) {
					Canvas.method114(class227.field2679);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2693 == var1.serverPacket) {
					MusicPatchPcmStream.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2776 == var1.serverPacket) {
					var58 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var58 < -70000) {
						var5 += 32768;
					}

					if (var58 >= 0) {
						var63 = UrlRequester.getWidget(var58);
					} else {
						var63 = null;
					}

					for (; var3.offset < var1.serverPacketLength; VarpDefinition.itemContainerSetItem(var5, var7, var25 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var25 = var3.readUnsignedShort();
						var9 = 0;
						if (var25 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var63 != null && var7 >= 0 && var7 < var63.itemIds.length) {
							var63.itemIds[var7] = var25;
							var63.itemQuantities[var7] = var9;
						}
					}

					if (var63 != null) {
						AttackOption.invalidateWidget(var63);
					}

					class107.method2291();
					changedItemContainers[++field574 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2764 == var1.serverPacket) {
					var68 = var3.readUnsignedByte() == 1;
					if (var68) {
						WorldMapRectangle.field2066 = UrlRequester.method2125() - var3.readLong();
						ModeWhere.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						ModeWhere.grandExchangeEvents = null;
					}

					field479 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var40;
				if (ServerPacket.field2784 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var27 = var3.readLong();
					var29 = (long)var3.readUnsignedShort();
					var40 = (long)var3.readMedium();
					PlayerType var78 = (PlayerType)Huffman.findEnumerated(Messages.PlayerType_values(), var3.readUnsignedByte());
					var38 = (var29 << 32) + var40;
					boolean var73 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var38) {
							var73 = true;
							break;
						}
					}

					if (var78.isUser && Canvas.friendSystem.isIgnored(new Username(var48, GraphicsObject.loginType))) {
						var73 = true;
					}

					if (!var73 && field521 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var24 = AbstractFont.escapeBrackets(GrandExchangeOffer.method5167(WorldMapSectionType.method3608(var3)));
						if (var78.modIcon != -1) {
							TaskHandler.addChatMessage(9, HealthBar.method1945(var78.modIcon) + var48, var24, Varcs.base37DecodeLong(var27));
						} else {
							TaskHandler.addChatMessage(9, var48, var24, Varcs.base37DecodeLong(var27));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2758 == var1.serverPacket) {
					rebootTimer = var3.method6785() * 30;
					field516 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2741 == var1.serverPacket) {
					var58 = var3.readUnsignedByte();
					WorldMapRectangle.method3646(var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2715 == var1.serverPacket) {
					field605 = cycleCntr;
					var17 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var17 >= 0) {
							currentClanChannels[var17] = null;
						} else {
							FriendLoginUpdate.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var17 >= 0) {
						currentClanChannels[var17] = new ClanChannel(var3);
					} else {
						FriendLoginUpdate.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2711 == var1.serverPacket) {
					Canvas.method114(class227.field2683);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2704 == var1.serverPacket) {
					var58 = var3.method6696();
					if (var58 == 65535) {
						var58 = -1;
					}

					var5 = var3.readInt();
					var6 = var3.method6697();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var3.method6706();

					for (var25 = var58; var25 <= var6; ++var25) {
						var40 = ((long)var7 << 32) + (long)var25;
						Node var42 = widgetFlags.get(var40);
						if (var42 != null) {
							var42.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var40);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2728 == var1.serverPacket) {
					Canvas.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					AbstractByteArrayCopier.FriendSystem_invalidateIgnoreds();
					field609 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2692 == var1.serverPacket) {
					class144.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2738 == var1.serverPacket) {
					var58 = var3.method6704();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.method6704();
					var74 = UrlRequester.getWidget(var6);
					ItemComposition var8;
					if (!var74.isIf3) {
						if (var5 == -1) {
							var74.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var8 = KeyHandler.ItemDefinition_get(var5);
						var74.modelType = 4;
						var74.modelId = var5;
						var74.modelAngleX = var8.xan2d;
						var74.modelAngleY = var8.yan2d;
						var74.modelZoom = var8.zoom2d * 100 / var58;
						AttackOption.invalidateWidget(var74);
					} else {
						var74.itemId = var5;
						var74.itemQuantity = var58;
						var8 = KeyHandler.ItemDefinition_get(var5);
						var74.modelAngleX = var8.xan2d;
						var74.modelAngleY = var8.yan2d;
						var74.modelAngleZ = var8.zan2d;
						var74.modelOffsetX = var8.offsetX2d;
						var74.modelOffsetY = var8.offsetY2d;
						var74.modelZoom = var8.zoom2d;
						if (var8.isStackable == 1) {
							var74.itemQuantityMode = 1;
						} else {
							var74.itemQuantityMode = 2;
						}

						if (var74.field3012 > 0) {
							var74.modelZoom = var74.modelZoom * 32 / var74.field3012;
						} else if (var74.rawWidth > 0) {
							var74.modelZoom = var74.modelZoom * 32 / var74.rawWidth;
						}

						AttackOption.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2700 == var1.serverPacket) {
					var58 = var3.readShort();
					var5 = var3.method6698();
					var6 = var3.method6704();
					var74 = UrlRequester.getWidget(var6);
					if (var5 != var74.rawX || var58 != var74.rawY || var74.xAlignment != 0 || var74.yAlignment != 0) {
						var74.rawX = var5;
						var74.rawY = var58;
						var74.xAlignment = 0;
						var74.yAlignment = 0;
						AttackOption.invalidateWidget(var74);
						this.alignWidget(var74);
						if (var74.type == 0) {
							AttackOption.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var74, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2761 == var1.serverPacket) {
					var58 = var3.readUnsignedShort();
					var5 = var3.method6704();
					Varps.Varps_temp[var58] = var5;
					if (Varps.Varps_main[var58] != var5) {
						Varps.Varps_main[var58] = var5;
					}

					ApproximateRouteStrategy.changeGameOptions(var58);
					changedVarps[++changedVarpCount - 1 & 31] = var58;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2703 == var1.serverPacket) {
					isCameraLocked = true;
					class107.field1323 = var3.readUnsignedByte();
					HitSplatDefinition.field1713 = var3.readUnsignedByte();
					class6.field14 = var3.readUnsignedShort();
					UserComparator6.field1265 = var3.readUnsignedByte();
					class216.field2545 = var3.readUnsignedByte();
					if (class216.field2545 >= 100) {
						ItemContainer.cameraX = class107.field1323 * 128 + 64;
						WorldMapArchiveLoader.cameraZ = HitSplatDefinition.field1713 * 128 + 64;
						Bounds.cameraY = class122.getTileHeight(ItemContainer.cameraX, WorldMapArchiveLoader.cameraZ, GrandExchangeEvent.Client_plane) - class6.field14;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2779 == var1.serverPacket) {
					Canvas.method114(class227.field2674);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2724 == var1.serverPacket) {
					var58 = var3.readInt();
					var5 = var3.readInt();
					var6 = class263.getGcDuration();
					PacketBufferNode var36 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2595, packetWriter.isaacCipher);
					var36.packetBuffer.method6685(GameEngine.fps);
					var36.packetBuffer.method6776(var6);
					var36.packetBuffer.method6703(var58);
					var36.packetBuffer.writeIntME(var5);
					packetWriter.addNode(var36);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2714 == var1.serverPacket) {
					var58 = var3.readUnsignedShort();
					Frames.method4169(var58);
					changedItemContainers[++field574 - 1 & 31] = var58 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2710 == var1.serverPacket) {
					if (ScriptFrame.field371 == null) {
						ScriptFrame.field371 = new class339(GrandExchangeOfferUnitPriceComparator.HitSplatDefinition_cachedSprites);
					}

					class392 var47 = GrandExchangeOfferUnitPriceComparator.HitSplatDefinition_cachedSprites.method6074(var3);
					ScriptFrame.field371.field3935.vmethod6430(var47.field4240, var47.field4241);
					field599[++field600 - 1 & 31] = var47.field4240;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2771 == var1.serverPacket) {
					Canvas.method114(class227.field2675);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2698 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						SecureRandomCallable.method1776(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2696 == var1.serverPacket) {
					MusicPatchPcmStream.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2759 == var1.serverPacket) {
					var58 = var3.method6706();
					var5 = var3.method6785();
					var63 = UrlRequester.getWidget(var58);
					if (var63 != null && var63.type == 0) {
						if (var5 > var63.scrollHeight - var63.height) {
							var5 = var63.scrollHeight - var63.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var63.scrollY) {
							var63.scrollY = var5;
							AttackOption.invalidateWidget(var63);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2709 == var1.serverPacket) {
					class107.method2291();
					weight = var3.readShort();
					field516 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2769 == var1.serverPacket) {
					Canvas.method114(class227.field2681);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2753 == var1.serverPacket) {
					var58 = var3.method6785();
					var5 = var3.method6706();
					var63 = UrlRequester.getWidget(var5);
					if (var63.modelType != 2 || var58 != var63.modelId) {
						var63.modelType = 2;
						var63.modelId = var58;
						AttackOption.invalidateWidget(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2713 == var1.serverPacket) {
					World var46 = new World();
					var46.host = var3.readStringCp1252NullTerminated();
					var46.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var46.properties = var5;
					class16.updateGameState(45);
					var2.close();
					var2 = null;
					ItemComposition.changeWorld(var46);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2774 == var1.serverPacket) {
					Canvas.method114(class227.field2682);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2730 == var1.serverPacket) {
					var58 = var3.readUnsignedByte();
					class249.forceDisconnect(var58);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2785 == var1.serverPacket) {
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

				if (ServerPacket.field2742 == var1.serverPacket) {
					ScriptFrame.field371 = new class339(GrandExchangeOfferUnitPriceComparator.HitSplatDefinition_cachedSprites);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2787 == var1.serverPacket) {
					field605 = cycleCntr;
					var17 = var3.readByte();
					class120 var59 = new class120(var3);
					ClanChannel var19;
					if (var17 >= 0) {
						var19 = currentClanChannels[var17];
					} else {
						var19 = FriendLoginUpdate.guestClanChannel;
					}

					var59.method2475(var19);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2722 == var1.serverPacket) {
					var17 = var3.readByte();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					var40 = var29 + (var27 << 32);
					boolean var37 = false;
					ClanChannel var43 = var17 >= 0 ? currentClanChannels[var17] : FriendLoginUpdate.guestClanChannel;
					if (var43 == null) {
						var37 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var40) {
								var37 = true;
								break;
							}
						}
					}

					if (!var37) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var40;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = WorldMapSectionType.method3608(var3);
						int var35 = var17 >= 0 ? 43 : 46;
						TaskHandler.addChatMessage(var35, "", var34, var43.name);
					}

					var1.serverPacket = null;
					return true;
				}

				BufferedSink.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1005948575 * -820114081 : -1) + "," + (var1.field1213 != null ? var1.field1213.id * 1005948575 * -820114081 : -1) + "," + (var1.field1212 != null ? var1.field1212.id * 1005948575 * -820114081 : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class144.logOut();
			} catch (IOException var44) {
				WorldMapSection0.method3580();
			} catch (Exception var45) {
				var18 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1005948575 * -820114081 : -1) + "," + (var1.field1213 != null ? var1.field1213.id * 1005948575 * -820114081 : -1) + "," + (var1.field1212 != null ? var1.field1212.id * 1005948575 * -820114081 : -1) + "," + var1.serverPacketLength + "," + (MouseHandler.localPlayer.pathX[0] + GrandExchangeOfferNameComparator.baseX) + "," + (MouseHandler.localPlayer.pathY[0] + NPC.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var18 = var18 + var3.array[var6] + ",";
				}

				BufferedSink.RunException_sendStackTrace(var18, var45);
				class144.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("menu")
	final void menu() {
		SceneTilePaint.method4321();
		if (dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var2;
				int var4;
				int var5;
				int var8;
				int var18;
				label278: {
					int var1 = MouseHandler.MouseHandler_lastButton;
					int var3;
					int var14;
					if (isMenuOpen) {
						if (var1 != 1 && (class310.mouseCam || var1 != 4)) {
							var2 = MouseHandler.MouseHandler_x;
							var3 = MouseHandler.MouseHandler_y;
							if (var2 < SpotAnimationDefinition.menuX - 10 || var2 > SpotAnimationDefinition.menuX + DevicePcmPlayerProvider.menuWidth + 10 || var3 < DefaultsGroup.menuY - 10 || var3 > GraphicsObject.menuHeight + DefaultsGroup.menuY + 10) {
								isMenuOpen = false;
								var4 = SpotAnimationDefinition.menuX;
								var5 = DefaultsGroup.menuY;
								var14 = DevicePcmPlayerProvider.menuWidth;
								var18 = GraphicsObject.menuHeight;

								for (var8 = 0; var8 < rootWidgetCount; ++var8) {
									if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var14 + var4 && rootWidgetYs[var8] + rootWidgetHeights[var8] > var5 && rootWidgetYs[var8] < var18 + var5) {
										field616[var8] = true;
									}
								}
							}
						}

						if (var1 == 1 || !class310.mouseCam && var1 == 4) {
							var2 = SpotAnimationDefinition.menuX;
							var3 = DefaultsGroup.menuY;
							var4 = DevicePcmPlayerProvider.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var14 = MouseHandler.MouseHandler_lastPressedY;
							var18 = -1;

							int var9;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) {
								var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
								if (var5 > var2 && var5 < var4 + var2 && var14 > var9 - 13 && var14 < var9 + 3) {
									var18 = var8;
								}
							}

							int var10;
							int var11;
							if (var18 != -1 && var18 >= 0) {
								var8 = menuArguments1[var18];
								var9 = menuArguments2[var18];
								var10 = menuOpcodes[var18];
								var11 = menuIdentifiers[var18];
								String var12 = menuActions[var18];
								String var13 = menuTargets[var18];
								class121.menuAction(var8, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
							}

							isMenuOpen = false;
							var8 = SpotAnimationDefinition.menuX;
							var9 = DefaultsGroup.menuY;
							var10 = DevicePcmPlayerProvider.menuWidth;
							var11 = GraphicsObject.menuHeight;

							for (int var17 = 0; var17 < rootWidgetCount; ++var17) {
								if (rootWidgetWidths[var17] + rootWidgetXs[var17] > var8 && rootWidgetXs[var17] < var8 + var10 && rootWidgetHeights[var17] + rootWidgetYs[var17] > var9 && rootWidgetYs[var17] < var9 + var11) {
									field616[var17] = true;
								}
							}
						}
					} else {
						var2 = CollisionMap.method3204();
						if ((var1 == 1 || !class310.mouseCam && var1 == 4) && var2 >= 0) {
							var3 = menuOpcodes[var2];
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
								var4 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var6 = UrlRequester.getWidget(var5);
								if (HorizontalAlignment.method2816(MusicPatchNode.getWidgetFlags(var6))) {
									break label278;
								}

								var8 = MusicPatchNode.getWidgetFlags(var6);
								boolean var7 = (var8 >> 29 & 1) != 0;
								if (var7) {
									break label278;
								}
							}
						}

						if ((var1 == 1 || !class310.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
							var1 = 2;
						}

						if ((var1 == 1 || !class310.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) {
							var3 = menuArguments1[var2];
							var4 = menuArguments2[var2];
							var5 = menuOpcodes[var2];
							var14 = menuIdentifiers[var2];
							String var15 = menuActions[var2];
							String var16 = menuTargets[var2];
							class121.menuAction(var3, var4, var5, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						if (var1 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return;
				}

				if (dragInventoryWidget != null && !field519 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
					var18 = draggedWidgetX;
					var8 = draggedWidgetY;
					SoundCache.method542(ClanChannelMember.tempMenuAction, var18, var8);
					ClanChannelMember.tempMenuAction = null;
				}

				field519 = false;
				itemDragDuration = 0;
				if (dragInventoryWidget != null) {
					AttackOption.invalidateWidget(dragInventoryWidget);
				}

				dragInventoryWidget = UrlRequester.getWidget(var5);
				dragItemSlotSource = var4;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					ClanChannelMember.tempMenuAction = new MenuAction();
					ClanChannelMember.tempMenuAction.param0 = menuArguments1[var2];
					ClanChannelMember.tempMenuAction.param1 = menuArguments2[var2];
					ClanChannelMember.tempMenuAction.opcode = menuOpcodes[var2];
					ClanChannelMember.tempMenuAction.identifier = menuIdentifiers[var2];
					ClanChannelMember.tempMenuAction.action = menuActions[var2];
				}

				AttackOption.invalidateWidget(dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1660409590"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = CollisionMap.method3204();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || class74.method1931(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1160972007"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		FloorUnderlayDefinition.method2884(var1, var2);
		WorldMapIcon_1.scene.menuOpen(GrandExchangeEvent.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1213171411"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = MouseRecorder.canvasWidth;
		int var4 = canvasHeight;
		if (Huffman.loadInterface(var2)) {
			FaceNormal.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V",
		garbageValue = "-616450131"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : UrlRequester.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = MouseRecorder.canvasWidth;
			var4 = canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		GrandExchangeOfferUnitPriceComparator.alignWidgetSize(var1, var3, var4, false);
		SoundCache.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	final void method920() {
		AttackOption.invalidateWidget(clickedWidget);
		++class106.widgetDragDuration;
		if (field588 && field585) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field586) {
				var1 = field586;
			}

			if (var1 + clickedWidget.width > field586 + clickedWidgetParent.width) {
				var1 = field586 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field587) {
				var2 = field587;
			}

			if (var2 + clickedWidget.height > field587 + clickedWidgetParent.height) {
				var2 = field587 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field678;
			int var4 = var2 - field676;
			int var5 = clickedWidget.dragZoneSize;
			if (class106.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field586 + clickedWidgetParent.scrollX;
			int var7 = var2 - field587 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				UserComparator10.runScriptEvent(var8);
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
						UserComparator10.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class122.method2505(clickedWidget) != null) {
						PacketBufferNode var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2661, packetWriter.isaacCipher);
						var11.packetBuffer.method6703(clickedWidget.id);
						var11.packetBuffer.method6693(draggedOnWidget.childIndex);
						var11.packetBuffer.method6786(clickedWidget.itemId);
						var11.packetBuffer.method6786(draggedOnWidget.itemId);
						var11.packetBuffer.method6693(clickedWidget.childIndex);
						var11.packetBuffer.writeInt(draggedOnWidget.id);
						packetWriter.addNode(var11);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field678 + widgetClickX, widgetClickY + field676);
				} else if (menuOptionsCount > 0) {
					int var10 = widgetClickX + field678;
					int var9 = field676 + widgetClickY;
					SoundCache.method542(ClanChannelMember.tempMenuAction, var10, var9);
					ClanChannelMember.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (class106.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(B)Loh;",
		garbageValue = "-6"
	)
	@Export("username")
	public Username username() {
		return MouseHandler.localPlayer != null ? MouseHandler.localPlayer.username : null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)I",
		garbageValue = "8"
	)
	static final int method1381(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class52.field775, class52.field772);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		class144.method2803(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class52.field775, class52.field772);
		var7 = GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		byte[] var11 = var9.array;
		int var13 = var11.length;
		StringBuilder var14 = new StringBuilder();

		int var17;
		for (int var15 = 0; var15 < var13 + 0; var15 += 3) {
			int var16 = var11[var15] & 255;
			var14.append(class304.field3755[var16 >>> 2]);
			if (var15 < var13 - 1) {
				var17 = var11[var15 + 1] & 255;
				var14.append(class304.field3755[(var16 & 3) << 4 | var17 >>> 4]);
				if (var15 < var13 - 2) {
					int var18 = var11[var15 + 2] & 255;
					var14.append(class304.field3755[(var17 & 15) << 2 | var18 >>> 6]).append(class304.field3755[var18 & 63]);
				} else {
					var14.append(class304.field3755[(var17 & 15) << 2]).append("=");
				}
			} else {
				var14.append(class304.field3755[(var16 & 3) << 4]).append("==");
			}
		}

		String var12 = var14.toString();
		var12 = var12;

		try {
			URL var20 = new URL(UserComparator5.method2167("services", false) + "m=accountappeal/login.ws");
			URLConnection var26 = var20.openConnection();
			var26.setDoInput(true);
			var26.setDoOutput(true);
			var26.setConnectTimeout(5000);
			OutputStreamWriter var21 = new OutputStreamWriter(var26.getOutputStream());
			var21.write("data2=" + Clock.method2680(var12) + "&dest=" + Clock.method2680("passwordchoice.ws"));
			var21.flush();
			InputStream var22 = var26.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				var17 = var22.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var17 == -1) {
					var21.close();
					var22.close();
					String var23 = new String(var9.array);
					if (var23.startsWith("OFFLINE")) {
						return 4;
					} else if (var23.startsWith("WRONG")) {
						return 7;
					} else if (var23.startsWith("RELOAD")) {
						return 3;
					} else if (var23.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var23 = new String(var9.array, 0, var9.offset);
						boolean var27;
						if (var23 == null) {
							var27 = false;
						} else {
							label99: {
								try {
									new URL(var23);
								} catch (MalformedURLException var24) {
									var27 = false;
									break label99;
								}

								var27 = true;
							}
						}

						if (var27) {
							InvDefinition.openURL(var23, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var17;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var25) {
			var25.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgw;Lfy;I)V",
		garbageValue = "-394441258"
	)
	static final void method1382(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = ClanChannel.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = class171.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				WorldMapArea.method3358(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) {
				if (!isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
						}

						var6.method3984(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = class163.field1914[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field907[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								Huffman.field3113[var0][var1][var2] = 50;
								Huffman.field3113[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class163.field1914[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								Huffman.field3113[var0][var1][var2 + 1] = 50;
								Huffman.field3113[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class163.field1914[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								Huffman.field3113[var0][var1 + 1][var2] = 50;
								Huffman.field3113[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class163.field1914[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								Huffman.field3113[var0][var1][var2] = 50;
								Huffman.field3113[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class163.field1914[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3171(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3990(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field908[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								Huffman.field3113[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								Huffman.field3113[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								Huffman.field3113[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								Huffman.field3113[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3171(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) {
							var22 = var4 + 1 & 3;
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field907[var4], Tiles.field907[var22], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = class163.field1914[var0][var1];
									var10000[var2] |= 585;
									var10000 = class163.field1914[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = class163.field1914[var0][var1];
									var10000[1 + var2] |= 1170;
									var10000 = class163.field1914[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class163.field1914[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class163.field1914[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class163.field1914[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class163.field1914[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3171(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method3990(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field908[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									Huffman.field3113[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									Huffman.field3113[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									Huffman.field3113[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									Huffman.field3113[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3171(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
							}

							var6.method3984(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method3990(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field907[var4], 0, 0, 0, var19, var21);
						} else {
							long var23;
							Object var25;
							if (var5 == 5) {
								var22 = 16;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = ClanChannel.getObjectDefinition(class78.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field907[var4], 0, var22 * Tiles.field905[var4], var22 * Tiles.field912[var4], var19, var21);
							} else if (var5 == 6) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = ClanChannel.getObjectDefinition(class78.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field903[var4], var22 * Tiles.field914[var4], var19, var21);
							} else if (var5 == 7) {
								var28 = var4 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var23) {
									var22 = ClanChannel.getObjectDefinition(class78.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3;
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field903[var4], var22 * Tiles.field914[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field1733, (Renderable)null);
					}

					if (var29 != null && var6.method3984(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var28 = 15;
						if (var29 instanceof Model) {
							var28 = ((Model)var29).method4212() / 4;
							if (var28 > 30) {
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) {
							for (int var32 = 0; var32 <= var10; ++var32) {
								if (var28 > Huffman.field3113[var0][var31 + var1][var32 + var2]) {
									Huffman.field3113[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1765853576"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
