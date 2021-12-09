import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
public final class Client extends GameEngine implements Usernamed, OAuthTokens {
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "[Lej;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		longValue = 380245954858485035L
	)
	static long field514;
	@ObfuscatedName("qd")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 594272369
	)
	public static int field559;
	@ObfuscatedName("rx")
	static boolean field743;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -1584933369
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qf")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	static final ApproximateRouteStrategy field754;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 633351775
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 962993013
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = 1358957623
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("so")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sj")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sk")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "[Lac;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uq")
	static int[] field755;
	@ObfuscatedName("uh")
	static int[] field756;
	@ObfuscatedName("sc")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 1358189471
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -769855681
	)
	static int field744;
	@ObfuscatedName("se")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sb")
	static boolean field724;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -129722411
	)
	static int field571;
	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "[Lei;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -1920478573
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("un")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("tu")
	static boolean[] field725;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1616263669
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("qy")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 375303139
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		longValue = -6601646598285595847L
	)
	static long field676;
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ti")
	static short field690;
	@ObfuscatedName("tz")
	static short field707;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 795865193
	)
	static int field570;
	@ObfuscatedName("tq")
	static short field736;
	@ObfuscatedName("tk")
	static short field737;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = 1614235025
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tx")
	static short field735;
	@ObfuscatedName("rb")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tc")
	@ObfuscatedGetter(
		intValue = -477293141
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("te")
	static short field619;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1712028747
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 648823865
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ry")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "[Lkb;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -677299157
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = -215790417
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("td")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("to")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -2053041951
	)
	static int field701;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 1186068583
	)
	static int field753;
	@ObfuscatedName("tv")
	static int[] field679;
	@ObfuscatedName("tn")
	static int[] field726;
	@ObfuscatedName("qb")
	static int[] field522;
	@ObfuscatedName("tf")
	static int[] field618;
	@ObfuscatedName("tl")
	static int[] field729;
	@ObfuscatedName("qz")
	static int[] field758;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 1425340839
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 494366655
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("qm")
	static int[] field749;
	@ObfuscatedName("qe")
	static String field645;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgf;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ad")
	static boolean field713;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1047026675
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -148495881
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 406374125
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bi")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bm")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 78796799
	)
	static int field473;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -275050283
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1450677759
	)
	static int field499;
	@ObfuscatedName("bc")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1847663853
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cf")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1674489649
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		longValue = -1983586746320389363L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -2087310985
	)
	static int field483;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1122347211
	)
	static int field746;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		longValue = 3088441328861095551L
	)
	static long field485;
	@ObfuscatedName("dv")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("do")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -808894481
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1504010063
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -789774913
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1385232855
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1355919591
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 686364275
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1327714015
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -521195687
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1689030643
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -799405801
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1227560011
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 856515511
	)
	static int field517;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -323349495
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 993112849
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1252225801
	)
	static int field545;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 670531889
	)
	static int field541;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 1972488979
	)
	static int field506;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static class122 field507;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static class422 field508;
	@ObfuscatedName("fl")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fm")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1929700921
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gj")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1848423267
	)
	static int field520;
	@ObfuscatedName("gw")
	static int[] field605;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 1696118819
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gp")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gq")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gi")
	static boolean field526;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("gc")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -628851273
	)
	static int field529;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = -747625611
	)
	static int field530;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -826572867
	)
	static int field617;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -1786172371
	)
	static int field532;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1982308495
	)
	static int field602;
	@ObfuscatedName("hy")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("hc")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hf")
	static final int[] field537;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = 374050087
	)
	static int field538;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 327781137
	)
	static int field693;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -331478875
	)
	static int field716;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -979832185
	)
	static int field509;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 321039709
	)
	static int field544;
	@ObfuscatedName("ik")
	static boolean field543;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -83589583
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = 2024018565
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 576864047
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 1332183157
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1090882813
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -229171215
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -939566641
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 964987821
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 579441507
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1740034233
	)
	static int field542;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 1436075295
	)
	static int field584;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = -890677005
	)
	static int field555;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -535945653
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1403293651
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1420477321
	)
	static int field607;
	@ObfuscatedName("jz")
	static boolean field612;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1475270389
	)
	static int field560;
	@ObfuscatedName("jr")
	static boolean field561;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -26905361
	)
	static int field562;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -773892707
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1644053899
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("jo")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("jb")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("jm")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("je")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ja")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jy")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("ji")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("js")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kf")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1916144699
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 840193893
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1886866651
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1160360799
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 1838440319
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1581021399
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1288921139
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kl")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 1920336167
	)
	static int field582;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -1813426121
	)
	static int field599;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 968662689
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 304129153
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 403550005
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 1141132311
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kh")
	static boolean field572;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 316645859
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1256248427
	)
	static int field590;
	@ObfuscatedName("kv")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Lck;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 74597849
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1592996163
	)
	static int field594;
	@ObfuscatedName("li")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1840251113
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1123511093
	)
	static int field597;
	@ObfuscatedName("lr")
	static int[] field598;
	@ObfuscatedName("lo")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ls")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("lx")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("lm")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -1073316529
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "[[[Llh;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("le")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("lb")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lj")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -2127848453
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lg")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 423776093
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mm")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mw")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mc")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ml")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mx")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("mv")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mn")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mo")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("mp")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("mu")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("md")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1753321203
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 1204843373
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -1381888941
	)
	static int field714;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 289077449
	)
	static int field628;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1313040449
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ns")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = -2020933549
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = 170882311
	)
	static int field633;
	@ObfuscatedName("nq")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nl")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = 1900367295
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 862490937
	)
	static int field638;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 957984195
	)
	static int field639;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1526655765
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 32014173
	)
	static int field641;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 2084747083
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 1192464333
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 1043298277
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -730109587
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("na")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -1392233693
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -1441412951
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("or")
	static boolean field531;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1396470941
	)
	static int field681;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1204222991
	)
	static int field659;
	@ObfuscatedName("oc")
	static boolean field657;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 446488355
	)
	static int field658;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 22597875
	)
	static int field660;
	@ObfuscatedName("ol")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -697121075
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("os")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -1549689841
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("oi")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 840565577
	)
	static int field665;
	@ObfuscatedName("ob")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1130299111
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oy")
	static int[] field695;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -441533413
	)
	static int field734;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -439883039
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 985856881
	)
	static int field671;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 1529981945
	)
	static int field672;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1376380489
	)
	static int field673;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -223800901
	)
	static int field583;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 1659284265
	)
	static int field675;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 1108839673
	)
	static int field669;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 45782605
	)
	static int field471;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 1320259871
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static NodeDeque field680;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static NodeDeque field579;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 1020186199
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -140051155
	)
	static int field684;
	@ObfuscatedName("pu")
	static boolean[] field504;
	@ObfuscatedName("pv")
	static boolean[] field686;
	@ObfuscatedName("po")
	static boolean[] field687;
	@ObfuscatedName("pm")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qg")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("fd")
	String field576;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	class14 field510;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	class19 field613;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	Buffer field710;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	class7 field515;

	static {
		field713 = true;
		worldId = 1; // L: 135
		worldProperties = 0; // L: 136
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field473 = -1;
		clientType = -1; // L: 148
		field499 = -1; // L: 149
		onMobile = false;
		gameState = 0;
		isLoading = true; // L: 183
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L; // L: 185
		field483 = -1; // L: 187
		field746 = -1; // L: 188
		field485 = -1L; // L: 189
		hadFocus = true; // L: 190
		displayFps = false; // L: 191
		rebootTimer = 0; // L: 192
		hintArrowType = 0; // L: 193
		hintArrowNpcIndex = 0; // L: 194
		hintArrowPlayerIndex = 0; // L: 195
		hintArrowX = 0; // L: 196
		hintArrowY = 0; // L: 197
		hintArrowHeight = 0; // L: 198
		hintArrowSubX = 0; // L: 199
		hintArrowSubY = 0; // L: 200
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 202
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 203
		titleLoadingStage = 0; // L: 206
		js5ConnectState = 0; // L: 209
		field517 = 0; // L: 210
		js5Errors = 0; // L: 232
		loginState = 0; // L: 234
		field545 = 0; // L: 235
		field541 = 0; // L: 236
		field506 = 0; // L: 237
		field507 = class122.field1473; // L: 238
		field508 = class422.field4523; // L: 239
		Login_isUsernameRemembered = false; // L: 256
		secureRandomFuture = new SecureRandomFuture(); // L: 257
		randomDatData = null; // L: 262
		npcs = new NPC[32768]; // L: 266
		npcCount = 0; // L: 267
		npcIndices = new int[32768]; // L: 268
		field520 = 0; // L: 269
		field605 = new int[250]; // L: 270
		packetWriter = new PacketWriter(); // L: 273
		logoutTimer = 0; // L: 275
		hadNetworkError = false; // L: 276
		useBufferedSocket = true; // L: 277
		field526 = false; // L: 278
		timer = new Timer(); // L: 279
		fontsMap = new HashMap(); // L: 285
		field529 = 0; // L: 292
		field530 = 1; // L: 293
		field617 = 0; // L: 294
		field532 = 1; // L: 295
		field602 = 0; // L: 296
		collisionMaps = new CollisionMap[4]; // L: 304
		isInInstance = false; // L: 305
		instanceChunkTemplates = new int[4][13][13]; // L: 306
		field537 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 307
		field538 = 0; // L: 310
		field693 = 2301979; // L: 322
		field716 = 5063219; // L: 323
		field509 = 3353893; // L: 324
		field544 = 7759444; // L: 325
		field543 = false; // L: 326
		alternativeScrollbarWidth = 0; // L: 327
		camAngleX = 128; // L: 335
		camAngleY = 0; // L: 336
		camAngleDY = 0; // L: 337
		camAngleDX = 0; // L: 338
		mouseCamClickedX = 0; // L: 339
		mouseCamClickedY = 0; // L: 340
		oculusOrbState = 0; // L: 341
		camFollowHeight = 50; // L: 342
		field542 = 0; // L: 346
		field584 = 0; // L: 347
		field555 = 0; // L: 348
		oculusOrbNormalSpeed = 12; // L: 350
		oculusOrbSlowedSpeed = 6; // L: 351
		field607 = 0; // L: 352
		field612 = false; // L: 353
		field560 = 0; // L: 354
		field561 = false; // L: 355
		field562 = 0; // L: 356
		overheadTextCount = 0; // L: 357
		overheadTextLimit = 50; // L: 358
		overheadTextXs = new int[overheadTextLimit]; // L: 359
		overheadTextYs = new int[overheadTextLimit]; // L: 360
		overheadTextAscents = new int[overheadTextLimit]; // L: 361
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 362
		overheadTextColors = new int[overheadTextLimit]; // L: 363
		overheadTextEffects = new int[overheadTextLimit]; // L: 364
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 365
		overheadText = new String[overheadTextLimit]; // L: 366
		tileLastDrawnActor = new int[104][104]; // L: 367
		viewportDrawCount = 0; // L: 368
		viewportTempX = -1; // L: 369
		viewportTempY = -1; // L: 370
		mouseCrossX = 0; // L: 371
		mouseCrossY = 0; // L: 372
		mouseCrossState = 0; // L: 373
		mouseCrossColor = 0; // L: 374
		showMouseCross = true; // L: 375
		field582 = 0; // L: 377
		field599 = 0; // L: 378
		dragItemSlotSource = 0; // L: 381
		draggedWidgetX = 0; // L: 382
		draggedWidgetY = 0; // L: 383
		dragItemSlotDestination = 0; // L: 384
		field572 = false; // L: 385
		itemDragDuration = 0; // L: 386
		field590 = 0; // L: 387
		showLoadingMessages = true; // L: 389
		players = new Player[2048]; // L: 391
		localPlayerIndex = -1; // L: 393
		field594 = 0; // L: 394
		renderSelf = true; // L: 396
		drawPlayerNames = 0; // L: 401
		field597 = 0; // L: 402
		field598 = new int[1000]; // L: 403
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 405
		playerMenuActions = new String[8]; // L: 406
		playerOptionsPriorities = new boolean[8]; // L: 407
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 408
		combatTargetPlayerIndex = -1; // L: 409
		groundItems = new NodeDeque[4][104][104]; // L: 410
		pendingSpawns = new NodeDeque(); // L: 411
		projectiles = new NodeDeque(); // L: 412
		graphicsObjects = new NodeDeque(); // L: 413
		currentLevels = new int[25]; // L: 414
		levels = new int[25]; // L: 415
		experience = new int[25]; // L: 416
		leftClickOpensMenu = 0; // L: 417
		isMenuOpen = false; // L: 418
		menuOptionsCount = 0; // L: 424
		menuArguments1 = new int[500]; // L: 425
		menuArguments2 = new int[500]; // L: 426
		menuOpcodes = new int[500]; // L: 427
		menuIdentifiers = new int[500]; // L: 428
		menuActions = new String[500]; // L: 429
		menuTargets = new String[500]; // L: 430
		menuShiftClick = new boolean[500]; // L: 431
		followerOpsLowPriority = false; // L: 432
		shiftClickDrop = false; // L: 434
		tapToDrop = false; // L: 435
		showMouseOverText = true; // L: 436
		viewportX = -1; // L: 437
		viewportY = -1; // L: 438
		field714 = 0; // L: 442
		field628 = 50; // L: 443
		isItemSelected = 0; // L: 444
		selectedItemName = null; // L: 448
		isSpellSelected = false; // L: 449
		selectedSpellChildIndex = -1; // L: 451
		field633 = -1; // L: 452
		selectedSpellActionName = null; // L: 454
		selectedSpellName = null; // L: 455
		rootInterface = -1; // L: 456
		interfaceParents = new NodeHashTable(8); // L: 457
		field638 = 0; // L: 462
		field639 = -1; // L: 463
		chatEffects = 0; // L: 464
		field641 = 0; // L: 465
		meslayerContinueWidget = null; // L: 466
		runEnergy = 0; // L: 467
		weight = 0; // L: 468
		staffModLevel = 0; // L: 469
		followerIndex = -1; // L: 470
		playerMod = false; // L: 471
		viewportWidget = null; // L: 472
		clickedWidget = null; // L: 473
		clickedWidgetParent = null; // L: 474
		widgetClickX = 0; // L: 475
		widgetClickY = 0; // L: 476
		draggedOnWidget = null; // L: 477
		field531 = false; // L: 478
		field681 = -1; // L: 479
		field659 = -1; // L: 480
		field657 = false; // L: 481
		field658 = -1; // L: 482
		field660 = -1; // L: 483
		isDraggingWidget = false; // L: 484
		cycleCntr = 1; // L: 489
		changedVarps = new int[32]; // L: 492
		changedVarpCount = 0; // L: 493
		changedItemContainers = new int[32]; // L: 494
		field665 = 0; // L: 495
		changedSkills = new int[32]; // L: 496
		changedSkillsCount = 0; // L: 497
		field695 = new int[32]; // L: 498
		field734 = 0; // L: 499
		chatCycle = 0; // L: 500
		field671 = 0; // L: 501
		field672 = 0; // L: 502
		field673 = 0; // L: 503
		field583 = 0; // L: 504
		field675 = 0; // L: 505
		field669 = 0; // L: 506
		field471 = 0; // L: 507
		mouseWheelRotation = 0; // L: 513
		scriptEvents = new NodeDeque(); // L: 514
		field680 = new NodeDeque(); // L: 515
		field579 = new NodeDeque(); // L: 516
		widgetFlags = new NodeHashTable(512); // L: 517
		rootWidgetCount = 0; // L: 519
		field684 = -2; // L: 520
		field504 = new boolean[100]; // L: 521
		field686 = new boolean[100]; // L: 522
		field687 = new boolean[100]; // L: 523
		rootWidgetXs = new int[100]; // L: 524
		rootWidgetYs = new int[100]; // L: 525
		rootWidgetWidths = new int[100]; // L: 526
		rootWidgetHeights = new int[100]; // L: 527
		gameDrawingMode = 0; // L: 528
		field514 = 0L; // L: 529
		isResizable = true; // L: 530
		field749 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 537
		publicChatMode = 0; // L: 538
		tradeChatMode = 0; // L: 540
		field645 = ""; // L: 541
		crossWorldMessageIds = new long[100]; // L: 543
		crossWorldMessageIdsIndex = 0; // L: 544
		field701 = 0; // L: 546
		field758 = new int[128]; // L: 547
		field522 = new int[128]; // L: 548
		field676 = -1L; // L: 549
		currentClanSettings = new ClanSettings[2]; // L: 553
		currentClanChannels = new ClanChannel[2]; // L: 555
		field570 = -1; // L: 557
		mapIconCount = 0; // L: 558
		mapIconXs = new int[1000]; // L: 559
		mapIconYs = new int[1000]; // L: 560
		mapIcons = new SpritePixels[1000]; // L: 561
		destinationX = 0; // L: 562
		destinationY = 0; // L: 563
		minimapState = 0; // L: 570
		currentTrackGroupId = -1; // L: 571
		field743 = false; // L: 572
		soundEffectCount = 0; // L: 578
		soundEffectIds = new int[50]; // L: 579
		queuedSoundEffectLoops = new int[50]; // L: 580
		queuedSoundEffectDelays = new int[50]; // L: 581
		soundLocations = new int[50]; // L: 582
		soundEffects = new SoundEffect[50]; // L: 583
		isCameraLocked = false; // L: 585
		field724 = false; // L: 596
		field725 = new boolean[5]; // L: 604
		field726 = new int[5]; // L: 605
		field679 = new int[5]; // L: 606
		field618 = new int[5]; // L: 607
		field729 = new int[5]; // L: 608
		field690 = 256; // L: 609
		field707 = 205; // L: 610
		zoomHeight = 256; // L: 611
		zoomWidth = 320; // L: 612
		field619 = 1; // L: 613
		field735 = 32767; // L: 614
		field736 = 1; // L: 615
		field737 = 32767; // L: 616
		viewportOffsetX = 0; // L: 617
		viewportOffsetY = 0; // L: 618
		viewportWidth = 0; // L: 619
		viewportHeight = 0; // L: 620
		viewportZoom = 0; // L: 621
		playerAppearance = new PlayerComposition(); // L: 623
		field744 = -1; // L: 624
		field571 = -1; // L: 625
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 627
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 629
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 632
		field559 = -1; // L: 639
		archiveLoaders = new ArrayList(10); // L: 640
		archiveLoadersDone = 0; // L: 641
		field753 = 0; // L: 642
		field754 = new ApproximateRouteStrategy(); // L: 651
		field755 = new int[50]; // L: 652
		field756 = new int[50]; // L: 653
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2122855875"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field514 = Ignored.method6459() + 500L; // L: 4994
		this.resizeJS(); // L: 4995
		if (rootInterface != -1) { // L: 4996
			this.resizeRoot(true);
		}

	} // L: 4997

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264122801"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 986
		int[] var2 = new int[]{1000, 100, 500}; // L: 987
		if (var1 != null && var2 != null) { // L: 989
			SoundCache.ByteArrayPool_alternativeSizes = var1; // L: 1002
			ApproximateRouteStrategy.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 1003
			World.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 1004

			for (int var3 = 0; var3 < SoundCache.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 1005
				World.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 1006
				ByteArrayPool.field4035.add(var1[var3]); // L: 1007
			}

			Collections.sort(ByteArrayPool.field4035); // L: 1009
		} else {
			SoundCache.ByteArrayPool_alternativeSizes = null; // L: 990
			ApproximateRouteStrategy.ByteArrayPool_altSizeArrayCounts = null; // L: 991
			World.ByteArrayPool_arrays = null; // L: 992
			ByteArrayPool.field4035.clear(); // L: 994
			ByteArrayPool.field4035.add(100); // L: 995
			ByteArrayPool.field4035.add(5000); // L: 996
			ByteArrayPool.field4035.add(10000); // L: 997
			ByteArrayPool.field4035.add(30000); // L: 998
		}

		GameObject.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1011
		class133.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1012
		class129.currentPort = GameObject.worldPort; // L: 1013
		PlayerComposition.field3197 = class279.field3209; // L: 1014
		class114.field1382 = class279.field3208; // L: 1015
		class132.field1540 = class279.field3211; // L: 1016
		PlayerComposition.field3203 = class279.field3210; // L: 1017
		WorldMapData_1.urlRequester = new UrlRequester(); // L: 1018
		this.setUpKeyboard(); // L: 1019
		this.method472(); // L: 1020
		WorldMapDecorationType.mouseWheel = this.mouseWheel(); // L: 1021
		ParamComposition.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1022
		AccessFile var4 = null; // L: 1025
		ClientPreferences var5 = new ClientPreferences(); // L: 1026

		try {
			var4 = class231.getPreferencesFile("", class338.field4054.name, false); // L: 1028
			byte[] var6 = new byte[(int)var4.length()]; // L: 1029

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) { // L: 1030 1031 1034
				var8 = var4.read(var6, var7, var6.length - var7); // L: 1032
				if (var8 == -1) { // L: 1033
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6)); // L: 1036
		} catch (Exception var11) { // L: 1038
		}

		try {
			if (var4 != null) { // L: 1040
				var4.close();
			}
		} catch (Exception var10) { // L: 1042
		}

		SecureRandomFuture.clientPreferences = var5; // L: 1045
		this.setUpClipboard(); // L: 1046
		String var12 = GrandExchangeOfferAgeComparator.field3882; // L: 1048
		class29.field172 = this; // L: 1050
		if (var12 != null) { // L: 1051
			class29.field177 = var12;
		}

		if (gameBuild != 0) { // L: 1053
			displayFps = true;
		}

		Occluder.setWindowedMode(SecureRandomFuture.clientPreferences.windowMode); // L: 1054
		GameEngine.friendSystem = new FriendSystem(class194.loginType); // L: 1055
		this.field510 = new class14("tokenRequest", 1, 1); // L: 1056
	} // L: 1057

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24240"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1061
		this.doCycleJs5(); // L: 1062

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 1066
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 1067
			} // L: 1068

			if (var1 == null) { // L: 1069
				class91.method2336(); // L: 1073
				class148.playPcmPlayers(); // L: 1074
				int var45;
				synchronized(KeyHandler.KeyHandler_instance) { // L: 1076
					++KeyHandler.KeyHandler_idleCycles; // L: 1077
					KeyHandler.field143 = KeyHandler.field145; // L: 1078
					KeyHandler.field140 = 0; // L: 1079
					KeyHandler.field142 = 0; // L: 1080
					Arrays.fill(KeyHandler.field132, false); // L: 1081
					Arrays.fill(KeyHandler.field130, false); // L: 1082
					if (KeyHandler.field120 < 0) { // L: 1083
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 1084
						KeyHandler.field120 = KeyHandler.field135; // L: 1085
					} else {
						while (KeyHandler.field120 != KeyHandler.field135) { // L: 1088
							var45 = KeyHandler.field134[KeyHandler.field135]; // L: 1089
							KeyHandler.field135 = KeyHandler.field135 + 1 & 127; // L: 1090
							if (var45 < 0) { // L: 1091
								var45 = ~var45; // L: 1092
								if (KeyHandler.KeyHandler_pressedKeys[var45]) { // L: 1093
									KeyHandler.KeyHandler_pressedKeys[var45] = false; // L: 1094
									KeyHandler.field130[var45] = true; // L: 1095
									KeyHandler.field141[KeyHandler.field142] = var45; // L: 1096
									++KeyHandler.field142; // L: 1097
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var45] && KeyHandler.field140 < KeyHandler.field139.length - 1) { // L: 1101
									KeyHandler.field132[var45] = true; // L: 1102
									KeyHandler.field139[++KeyHandler.field140 - 1] = var45; // L: 1103
								}

								KeyHandler.KeyHandler_pressedKeys[var45] = true; // L: 1105
							}
						}
					}

					if (KeyHandler.field140 > 0) { // L: 1109
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field145 = KeyHandler.field144; // L: 1110
				}

				MenuAction.method1961(); // L: 1113
				int var46;
				if (WorldMapDecorationType.mouseWheel != null) { // L: 1114
					var46 = WorldMapDecorationType.mouseWheel.useRotation(); // L: 1115
					mouseWheelRotation = var46; // L: 1116
				}

				if (gameState == 0) { // L: 1118
					UserComparator10.load(); // L: 1119
					class17.method292(); // L: 1120
				} else if (gameState == 5) { // L: 1122
					Skeleton.method3947(this, class114.fontPlain12); // L: 1123
					UserComparator10.load(); // L: 1124
					class91.clock.mark(); // L: 1126

					for (var46 = 0; var46 < 32; ++var46) { // L: 1127
						GameEngine.graphicsTickTimes[var46] = 0L;
					}

					for (var46 = 0; var46 < 32; ++var46) { // L: 1128
						GameEngine.clientTickTimes[var46] = 0L;
					}

					GameEngine.gameCyclesToDo = 0; // L: 1129
				} else if (gameState != 10 && gameState != 11) { // L: 1132
					if (gameState == 20) { // L: 1133
						Skeleton.method3947(this, class114.fontPlain12); // L: 1134
						this.doCycleLoggedOut(); // L: 1135
					} else if (gameState == 25) { // L: 1137
						ClientPacket.method5001(false); // L: 1138
						field529 = 0; // L: 1139
						boolean var77 = true; // L: 1140

						for (var45 = 0; var45 < TileItem.regionLandArchives.length; ++var45) { // L: 1141
							if (Tiles.regionMapArchiveIds[var45] != -1 && TileItem.regionLandArchives[var45] == null) { // L: 1142 1143
								TileItem.regionLandArchives[var45] = class140.archive5.takeFile(Tiles.regionMapArchiveIds[var45], 0); // L: 1144
								if (TileItem.regionLandArchives[var45] == null) { // L: 1145
									var77 = false; // L: 1146
									++field529; // L: 1147
								}
							}

							if (class10.regionLandArchiveIds[var45] != -1 && VarpDefinition.regionMapArchives[var45] == null) { // L: 1151 1152
								VarpDefinition.regionMapArchives[var45] = class140.archive5.takeFileEncrypted(class10.regionLandArchiveIds[var45], 0, WorldMapID.xteaKeys[var45]); // L: 1153
								if (VarpDefinition.regionMapArchives[var45] == null) { // L: 1154
									var77 = false; // L: 1155
									++field529; // L: 1156
								}
							}
						}

						if (!var77) { // L: 1161
							field602 = 1; // L: 1162
						} else {
							field617 = 0; // L: 1165
							var77 = true; // L: 1166

							int var5;
							boolean var8;
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
							int var47;
							for (var45 = 0; var45 < TileItem.regionLandArchives.length; ++var45) { // L: 1167
								byte[] var3 = VarpDefinition.regionMapArchives[var45]; // L: 1168
								if (var3 != null) { // L: 1169
									var47 = (class269.regions[var45] >> 8) * 64 - class131.baseX; // L: 1170
									var5 = (class269.regions[var45] & 255) * 64 - TileItem.baseY; // L: 1171
									if (isInInstance) { // L: 1172
										var47 = 10; // L: 1173
										var5 = 10; // L: 1174
									}

									var8 = true; // L: 1179
									var9 = new Buffer(var3); // L: 1180
									var10 = -1; // L: 1181

									label1403:
									while (true) {
										var11 = var9.method7378(); // L: 1183
										if (var11 == 0) { // L: 1184
											var77 &= var8; // L: 1217
											break;
										}

										var10 += var11; // L: 1185
										var12 = 0; // L: 1186
										boolean var13 = false; // L: 1187

										while (true) {
											while (!var13) { // L: 1189
												var14 = var9.readUShortSmart(); // L: 1195
												if (var14 == 0) { // L: 1196
													continue label1403;
												}

												var12 += var14 - 1; // L: 1197
												var15 = var12 & 63; // L: 1198
												var16 = var12 >> 6 & 63; // L: 1199
												var17 = var9.readUnsignedByte() >> 2; // L: 1200
												var18 = var16 + var47; // L: 1201
												var19 = var15 + var5; // L: 1202
												if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) { // L: 1203
													ObjectComposition var20 = class148.getObjectDefinition(var10); // L: 1204
													if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) { // L: 1205
														if (!var20.needsModelFiles()) { // L: 1206
															++field617; // L: 1207
															var8 = false; // L: 1208
														}

														var13 = true; // L: 1210
													}
												}
											}

											var14 = var9.readUShortSmart(); // L: 1190
											if (var14 == 0) { // L: 1191
												break;
											}

											var9.readUnsignedByte(); // L: 1192
										}
									}
								}
							}

							if (!var77) { // L: 1220
								field602 = 2; // L: 1221
							} else {
								if (field602 != 0) { // L: 1224
									ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
								}

								class148.playPcmPlayers(); // L: 1225
								class7.scene.clear(); // L: 1226

								for (var45 = 0; var45 < 4; ++var45) { // L: 1227
									collisionMaps[var45].clear();
								}

								int var48;
								for (var45 = 0; var45 < 4; ++var45) { // L: 1228
									for (var48 = 0; var48 < 104; ++var48) { // L: 1229
										for (var47 = 0; var47 < 104; ++var47) { // L: 1230
											Tiles.Tiles_renderFlags[var45][var48][var47] = 0; // L: 1231
										}
									}
								}

								class148.playPcmPlayers(); // L: 1235
								class118.method2686(); // L: 1236
								var45 = TileItem.regionLandArchives.length; // L: 1237
								GrandExchangeEvent.method5760(); // L: 1238
								ClientPacket.method5001(true); // L: 1239
								int var6;
								int var21;
								int var22;
								int var52;
								int var72;
								if (!isInInstance) { // L: 1240
									byte[] var49;
									for (var48 = 0; var48 < var45; ++var48) { // L: 1241
										var47 = (class269.regions[var48] >> 8) * 64 - class131.baseX; // L: 1242
										var5 = (class269.regions[var48] & 255) * 64 - TileItem.baseY; // L: 1243
										var49 = TileItem.regionLandArchives[var48]; // L: 1244
										if (var49 != null) { // L: 1245
											class148.playPcmPlayers(); // L: 1246
											class10.method119(var49, var47, var5, Messages.field1277 * 8 - 48, class4.field9 * 8 - 48, collisionMaps); // L: 1247
										}
									}

									for (var48 = 0; var48 < var45; ++var48) { // L: 1250
										var47 = (class269.regions[var48] >> 8) * 64 - class131.baseX; // L: 1251
										var5 = (class269.regions[var48] & 255) * 64 - TileItem.baseY; // L: 1252
										var49 = TileItem.regionLandArchives[var48]; // L: 1253
										if (var49 == null && class4.field9 < 800) { // L: 1254
											class148.playPcmPlayers(); // L: 1255
											class112.method2572(var47, var5, 64, 64); // L: 1256
										}
									}

									ClientPacket.method5001(true); // L: 1259

									for (var48 = 0; var48 < var45; ++var48) { // L: 1260
										byte[] var4 = VarpDefinition.regionMapArchives[var48]; // L: 1261
										if (var4 != null) { // L: 1262
											var5 = (class269.regions[var48] >> 8) * 64 - class131.baseX; // L: 1263
											var6 = (class269.regions[var48] & 255) * 64 - TileItem.baseY; // L: 1264
											class148.playPcmPlayers(); // L: 1265
											Scene var50 = class7.scene; // L: 1266
											CollisionMap[] var51 = collisionMaps; // L: 1267
											var9 = new Buffer(var4); // L: 1269
											var10 = -1; // L: 1270

											while (true) {
												var11 = var9.method7378(); // L: 1272
												if (var11 == 0) { // L: 1273
													break;
												}

												var10 += var11; // L: 1274
												var12 = 0; // L: 1275

												while (true) {
													var72 = var9.readUShortSmart(); // L: 1277
													if (var72 == 0) { // L: 1278
														break;
													}

													var12 += var72 - 1; // L: 1279
													var14 = var12 & 63; // L: 1280
													var15 = var12 >> 6 & 63; // L: 1281
													var16 = var12 >> 12; // L: 1282
													var17 = var9.readUnsignedByte(); // L: 1283
													var18 = var17 >> 2; // L: 1284
													var19 = var17 & 3; // L: 1285
													var52 = var5 + var15; // L: 1286
													var21 = var6 + var14; // L: 1287
													if (var52 > 0 && var21 > 0 && var52 < 103 && var21 < 103) { // L: 1288
														var22 = var16; // L: 1289
														if ((Tiles.Tiles_renderFlags[1][var52][var21] & 2) == 2) { // L: 1290
															var22 = var16 - 1;
														}

														CollisionMap var23 = null; // L: 1291
														if (var22 >= 0) { // L: 1292
															var23 = var51[var22];
														}

														ClanChannel.method2996(var16, var52, var21, var10, var19, var18, var50, var23); // L: 1293
													}
												}
											}
										}
									}
								}

								int var7;
								int[] var10000;
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
								int var53;
								int var56;
								int var59;
								int var69;
								if (isInInstance) { // L: 1301
									var48 = 0;

									label1308:
									while (true) {
										int var38;
										CollisionMap[] var55;
										Buffer var73;
										if (var48 >= 4) {
											for (var48 = 0; var48 < 13; ++var48) { // L: 1398
												for (var47 = 0; var47 < 13; ++var47) { // L: 1399
													var5 = instanceChunkTemplates[0][var48][var47]; // L: 1400
													if (var5 == -1) { // L: 1401
														class112.method2572(var48 * 8, var47 * 8, 8, 8); // L: 1402
													}
												}
											}

											ClientPacket.method5001(true); // L: 1406
											var48 = 0;

											while (true) {
												if (var48 >= 4) {
													break label1308;
												}

												class148.playPcmPlayers(); // L: 1408

												for (var47 = 0; var47 < 13; ++var47) { // L: 1409
													label1231:
													for (var5 = 0; var5 < 13; ++var5) { // L: 1410
														var6 = instanceChunkTemplates[var48][var47][var5]; // L: 1411
														if (var6 != -1) { // L: 1412
															var7 = var6 >> 24 & 3; // L: 1413
															var69 = var6 >> 1 & 3; // L: 1414
															var53 = var6 >> 14 & 1023; // L: 1415
															var10 = var6 >> 3 & 2047; // L: 1416
															var11 = (var53 / 8 << 8) + var10 / 8; // L: 1417

															for (var12 = 0; var12 < class269.regions.length; ++var12) { // L: 1418
																if (class269.regions[var12] == var11 && VarpDefinition.regionMapArchives[var12] != null) { // L: 1419
																	byte[] var57 = VarpDefinition.regionMapArchives[var12]; // L: 1420
																	var14 = var47 * 8; // L: 1421
																	var15 = var5 * 8; // L: 1422
																	var16 = (var53 & 7) * 8; // L: 1423
																	var17 = (var10 & 7) * 8; // L: 1424
																	Scene var58 = class7.scene; // L: 1425
																	var55 = collisionMaps; // L: 1426
																	var73 = new Buffer(var57); // L: 1428
																	var21 = -1; // L: 1429

																	while (true) {
																		var22 = var73.method7378(); // L: 1431
																		if (var22 == 0) { // L: 1432
																			continue label1231;
																		}

																		var21 += var22; // L: 1433
																		var56 = 0; // L: 1434

																		while (true) {
																			var59 = var73.readUShortSmart(); // L: 1436
																			if (var59 == 0) { // L: 1437
																				break;
																			}

																			var56 += var59 - 1; // L: 1438
																			var25 = var56 & 63; // L: 1439
																			var26 = var56 >> 6 & 63; // L: 1440
																			var27 = var56 >> 12; // L: 1441
																			var28 = var73.readUnsignedByte(); // L: 1442
																			var29 = var28 >> 2; // L: 1443
																			var30 = var28 & 3; // L: 1444
																			if (var27 == var7 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) { // L: 1445
																				ObjectComposition var31 = class148.getObjectDefinition(var21); // L: 1446
																				var34 = var26 & 7; // L: 1449
																				var35 = var25 & 7; // L: 1450
																				var37 = var31.sizeX; // L: 1452
																				var38 = var31.sizeY; // L: 1453
																				if ((var30 & 1) == 1) { // L: 1455
																					var39 = var37; // L: 1456
																					var37 = var38; // L: 1457
																					var38 = var39; // L: 1458
																				}

																				var36 = var69 & 3; // L: 1460
																				if (var36 == 0) { // L: 1461
																					var33 = var34; // L: 1462
																				} else if (var36 == 1) { // L: 1465
																					var33 = var35; // L: 1466
																				} else if (var36 == 2) { // L: 1469
																					var33 = 7 - var34 - (var37 - 1); // L: 1470
																				} else {
																					var33 = 7 - var35 - (var38 - 1); // L: 1473
																				}

																				var39 = var33 + var14; // L: 1475
																				Object var10001 = null; // L: 1476
																				var40 = var15 + Calendar.method5320(var26 & 7, var25 & 7, var69, var31.sizeX, var31.sizeY, var30);
																				if (var39 > 0 && var40 > 0 && var39 < 103 && var40 < 103) { // L: 1477
																					var41 = var48; // L: 1478
																					if ((Tiles.Tiles_renderFlags[1][var39][var40] & 2) == 2) { // L: 1479
																						var41 = var48 - 1;
																					}

																					CollisionMap var42 = null; // L: 1480
																					if (var41 >= 0) { // L: 1481
																						var42 = var55[var41];
																					}

																					ClanChannel.method2996(var48, var39, var40, var21, var69 + var30 & 3, var29, var58, var42); // L: 1482
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}

												++var48; // L: 1407
											}
										}

										class148.playPcmPlayers(); // L: 1303

										for (var47 = 0; var47 < 13; ++var47) { // L: 1304
											for (var5 = 0; var5 < 13; ++var5) { // L: 1305
												boolean var67 = false; // L: 1306
												var7 = instanceChunkTemplates[var48][var47][var5]; // L: 1307
												if (var7 != -1) { // L: 1308
													var69 = var7 >> 24 & 3; // L: 1309
													var53 = var7 >> 1 & 3; // L: 1310
													var10 = var7 >> 14 & 1023; // L: 1311
													var11 = var7 >> 3 & 2047; // L: 1312
													var12 = (var10 / 8 << 8) + var11 / 8; // L: 1313

													for (var72 = 0; var72 < class269.regions.length; ++var72) { // L: 1314
														if (class269.regions[var72] == var12 && TileItem.regionLandArchives[var72] != null) { // L: 1315
															byte[] var54 = TileItem.regionLandArchives[var72]; // L: 1316
															var15 = var47 * 8; // L: 1317
															var16 = var5 * 8; // L: 1318
															var17 = (var10 & 7) * 8; // L: 1319
															var18 = (var11 & 7) * 8; // L: 1320
															var55 = collisionMaps; // L: 1321

															for (var52 = 0; var52 < 8; ++var52) { // L: 1323
																for (var21 = 0; var21 < 8; ++var21) { // L: 1324
																	if (var52 + var15 > 0 && var15 + var52 < 103 && var16 + var21 > 0 && var16 + var21 < 103) { // L: 1325
																		var10000 = var55[var48].flags[var15 + var52];
																		var10000[var16 + var21] &= -16777217;
																	}
																}
															}

															var73 = new Buffer(var54); // L: 1328

															for (var21 = 0; var21 < 4; ++var21) { // L: 1329
																for (var22 = 0; var22 < 64; ++var22) { // L: 1330
																	for (var56 = 0; var56 < 64; ++var56) { // L: 1331
																		if (var69 == var21 && var22 >= var17 && var22 < var17 + 8 && var56 >= var18 && var56 < var18 + 8) { // L: 1332
																			var28 = var22 & 7; // L: 1337
																			var29 = var56 & 7; // L: 1338
																			var30 = var53 & 3; // L: 1341
																			if (var30 == 0) { // L: 1342
																				var27 = var28; // L: 1343
																			} else if (var30 == 1) { // L: 1346
																				var27 = var29; // L: 1347
																			} else if (var30 == 2) { // L: 1350
																				var27 = 7 - var28; // L: 1351
																			} else {
																				var27 = 7 - var29; // L: 1354
																			}

																			var33 = var15 + var27; // L: 1358
																			var36 = var22 & 7; // L: 1361
																			var37 = var56 & 7; // L: 1362
																			var38 = var53 & 3; // L: 1365
																			if (var38 == 0) { // L: 1366
																				var35 = var37; // L: 1367
																			} else if (var38 == 1) { // L: 1370
																				var35 = 7 - var36; // L: 1371
																			} else if (var38 == 2) { // L: 1374
																				var35 = 7 - var37; // L: 1375
																			} else {
																				var35 = var36; // L: 1378
																			}

																			ScriptFrame.loadTerrain(var73, var48, var33, var16 + var35, 0, 0, var53); // L: 1380
																		} else {
																			ScriptFrame.loadTerrain(var73, 0, -1, -1, 0, 0, 0); // L: 1382
																		}
																	}
																}
															}

															var67 = true; // L: 1387
															break; // L: 1388
														}
													}
												}

												if (!var67) { // L: 1392
													MenuAction.method1959(var48, var47 * 8, var5 * 8); // L: 1393
												}
											}
										}

										++var48; // L: 1302
									}
								}

								ClientPacket.method5001(true); // L: 1496
								class148.playPcmPlayers(); // L: 1497
								Scene var65 = class7.scene; // L: 1498
								CollisionMap[] var66 = collisionMaps; // L: 1499

								for (var5 = 0; var5 < 4; ++var5) { // L: 1501
									for (var6 = 0; var6 < 104; ++var6) { // L: 1502
										for (var7 = 0; var7 < 104; ++var7) { // L: 1503
											if ((Tiles.Tiles_renderFlags[var5][var6][var7] & 1) == 1) { // L: 1504
												var69 = var5; // L: 1505
												if ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 1506
													var69 = var5 - 1;
												}

												if (var69 >= 0) { // L: 1507
													var66[var69].setBlockedByFloor(var6, var7);
												}
											}
										}
									}
								}

								Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 1512
								if (Tiles.rndHue < -8) { // L: 1513
									Tiles.rndHue = -8;
								}

								if (Tiles.rndHue > 8) { // L: 1514
									Tiles.rndHue = 8;
								}

								Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 1515
								if (Tiles.rndLightness < -16) { // L: 1516
									Tiles.rndLightness = -16;
								}

								if (Tiles.rndLightness > 16) { // L: 1517
									Tiles.rndLightness = 16;
								}

								for (var5 = 0; var5 < 4; ++var5) { // L: 1518
									byte[][] var78 = SoundCache.field321[var5]; // L: 1519
									boolean var68 = true; // L: 1520
									var8 = true; // L: 1521
									boolean var81 = true; // L: 1522
									boolean var70 = true; // L: 1523
									boolean var71 = true; // L: 1524
									var12 = (int)Math.sqrt(5100.0D); // L: 1525
									var72 = var12 * 768 >> 8; // L: 1526

									for (var14 = 1; var14 < 103; ++var14) { // L: 1527
										for (var15 = 1; var15 < 103; ++var15) { // L: 1528
											var16 = Tiles.Tiles_heights[var5][var15 + 1][var14] - Tiles.Tiles_heights[var5][var15 - 1][var14]; // L: 1529
											var17 = Tiles.Tiles_heights[var5][var15][var14 + 1] - Tiles.Tiles_heights[var5][var15][var14 - 1]; // L: 1530
											var18 = (int)Math.sqrt((double)(var17 * var17 + var16 * var16 + 65536)); // L: 1531
											var19 = (var16 << 8) / var18; // L: 1532
											var52 = 65536 / var18; // L: 1533
											var21 = (var17 << 8) / var18; // L: 1534
											var22 = (var19 * -50 + var21 * -50 + var52 * -10) / var72 + 96; // L: 1535
											var56 = (var78[var15 - 1][var14] >> 2) + (var78[var15][var14 - 1] >> 2) + (var78[var15 + 1][var14] >> 3) + (var78[var15][var14 + 1] >> 3) + (var78[var15][var14] >> 1); // L: 1536
											class194.field2280[var15][var14] = var22 - var56; // L: 1537
										}
									}

									for (var14 = 0; var14 < 104; ++var14) { // L: 1540
										Tiles.Tiles_hue[var14] = 0; // L: 1541
										User.Tiles_saturation[var14] = 0; // L: 1542
										Tiles.Tiles_lightness[var14] = 0; // L: 1543
										UserComparator5.Tiles_hueMultiplier[var14] = 0; // L: 1544
										VerticalAlignment.field1874[var14] = 0; // L: 1545
									}

									for (var14 = -5; var14 < 109; ++var14) { // L: 1547
										for (var15 = 0; var15 < 104; ++var15) { // L: 1548
											var16 = var14 + 5; // L: 1549
											int var10002;
											if (var16 >= 0 && var16 < 104) { // L: 1550
												var17 = Tiles.Tiles_underlays[var5][var16][var15] & 255; // L: 1551
												if (var17 > 0) { // L: 1552
													FloorUnderlayDefinition var83 = InterfaceParent.method2144(var17 - 1); // L: 1553
													var10000 = Tiles.Tiles_hue; // L: 1554
													var10000[var15] += var83.hue;
													var10000 = User.Tiles_saturation; // L: 1555
													var10000[var15] += var83.saturation;
													var10000 = Tiles.Tiles_lightness; // L: 1556
													var10000[var15] += var83.lightness;
													var10000 = UserComparator5.Tiles_hueMultiplier; // L: 1557
													var10000[var15] += var83.hueMultiplier;
													var10002 = VerticalAlignment.field1874[var15]++; // L: 1558
												}
											}

											var17 = var14 - 5; // L: 1561
											if (var17 >= 0 && var17 < 104) { // L: 1562
												var18 = Tiles.Tiles_underlays[var5][var17][var15] & 255; // L: 1563
												if (var18 > 0) { // L: 1564
													FloorUnderlayDefinition var82 = InterfaceParent.method2144(var18 - 1); // L: 1565
													var10000 = Tiles.Tiles_hue; // L: 1566
													var10000[var15] -= var82.hue;
													var10000 = User.Tiles_saturation; // L: 1567
													var10000[var15] -= var82.saturation;
													var10000 = Tiles.Tiles_lightness; // L: 1568
													var10000[var15] -= var82.lightness;
													var10000 = UserComparator5.Tiles_hueMultiplier; // L: 1569
													var10000[var15] -= var82.hueMultiplier;
													var10002 = VerticalAlignment.field1874[var15]--; // L: 1570
												}
											}
										}

										if (var14 >= 1 && var14 < 103) { // L: 1574
											var15 = 0; // L: 1575
											var16 = 0; // L: 1576
											var17 = 0; // L: 1577
											var18 = 0; // L: 1578
											var19 = 0; // L: 1579

											for (var52 = -5; var52 < 109; ++var52) { // L: 1580
												var21 = var52 + 5; // L: 1581
												if (var21 >= 0 && var21 < 104) { // L: 1582
													var15 += Tiles.Tiles_hue[var21]; // L: 1583
													var16 += User.Tiles_saturation[var21]; // L: 1584
													var17 += Tiles.Tiles_lightness[var21]; // L: 1585
													var18 += UserComparator5.Tiles_hueMultiplier[var21]; // L: 1586
													var19 += VerticalAlignment.field1874[var21]; // L: 1587
												}

												var22 = var52 - 5; // L: 1589
												if (var22 >= 0 && var22 < 104) { // L: 1590
													var15 -= Tiles.Tiles_hue[var22]; // L: 1591
													var16 -= User.Tiles_saturation[var22]; // L: 1592
													var17 -= Tiles.Tiles_lightness[var22]; // L: 1593
													var18 -= UserComparator5.Tiles_hueMultiplier[var22]; // L: 1594
													var19 -= VerticalAlignment.field1874[var22]; // L: 1595
												}

												if (var52 >= 1 && var52 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var52] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var52] & 16) == 0)) { // L: 1597 1598 1599 1600
													if (var5 < Tiles.Tiles_minPlane) { // L: 1603
														Tiles.Tiles_minPlane = var5;
													}

													var56 = Tiles.Tiles_underlays[var5][var14][var52] & 255; // L: 1604
													var59 = Tiles.Tiles_overlays[var5][var14][var52] & 255; // L: 1605
													if (var56 > 0 || var59 > 0) { // L: 1606
														var25 = Tiles.Tiles_heights[var5][var14][var52]; // L: 1607
														var26 = Tiles.Tiles_heights[var5][var14 + 1][var52]; // L: 1608
														var27 = Tiles.Tiles_heights[var5][var14 + 1][var52 + 1]; // L: 1609
														var28 = Tiles.Tiles_heights[var5][var14][var52 + 1]; // L: 1610
														var29 = class194.field2280[var14][var52]; // L: 1611
														var30 = class194.field2280[var14 + 1][var52]; // L: 1612
														int var60 = class194.field2280[var14 + 1][var52 + 1]; // L: 1613
														int var32 = class194.field2280[var14][var52 + 1]; // L: 1614
														var33 = -1; // L: 1615
														var34 = -1; // L: 1616
														if (var56 > 0) { // L: 1617
															var35 = var15 * 256 / var18; // L: 1618
															var36 = var16 / var19; // L: 1619
															var37 = var17 / var19; // L: 1620
															var33 = MusicPatchNode2.hslToRgb(var35, var36, var37); // L: 1621
															var35 = var35 + Tiles.rndHue & 255; // L: 1622
															var37 += Tiles.rndLightness; // L: 1623
															if (var37 < 0) { // L: 1624
																var37 = 0;
															} else if (var37 > 255) { // L: 1625
																var37 = 255;
															}

															var34 = MusicPatchNode2.hslToRgb(var35, var36, var37); // L: 1626
														}

														if (var5 > 0) { // L: 1628
															boolean var75 = true; // L: 1629
															if (var56 == 0 && Tiles.Tiles_shapes[var5][var14][var52] != 0) { // L: 1630
																var75 = false;
															}

															if (var59 > 0 && !class18.method302(var59 - 1).hideUnderlay) { // L: 1631
																var75 = false;
															}

															if (var75 && var25 == var26 && var25 == var27 && var25 == var28) { // L: 1632 1633
																var10000 = ClanChannelMember.field1504[var5][var14];
																var10000[var52] |= 2340;
															}
														}

														var35 = 0; // L: 1636
														if (var34 != -1) { // L: 1637
															var35 = Rasterizer3D.Rasterizer3D_colorPalette[Login.method1995(var34, 96)];
														}

														if (var59 == 0) { // L: 1638
															var65.addTile(var5, var14, var52, 0, 0, -1, var25, var26, var27, var28, Login.method1995(var33, var29), Login.method1995(var33, var30), Login.method1995(var33, var60), Login.method1995(var33, var32), 0, 0, 0, 0, var35, 0); // L: 1639
														} else {
															var36 = Tiles.Tiles_shapes[var5][var14][var52] + 1; // L: 1642
															byte var76 = WorldMapLabelSize.field2580[var5][var14][var52]; // L: 1643
															FloorOverlayDefinition var61 = class18.method302(var59 - 1); // L: 1644
															var39 = var61.texture; // L: 1645
															int var43;
															int var62;
															if (var39 >= 0) { // L: 1648
																var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var39); // L: 1649
																var40 = -1; // L: 1650
															} else if (var61.primaryRgb == 16711935) { // L: 1653
																var40 = -2; // L: 1654
																var39 = -1; // L: 1655
																var41 = -2; // L: 1656
															} else {
																var40 = MusicPatchNode2.hslToRgb(var61.hue, var61.saturation, var61.lightness); // L: 1659
																var62 = var61.hue + Tiles.rndHue & 255; // L: 1660
																var43 = var61.lightness + Tiles.rndLightness; // L: 1661
																if (var43 < 0) { // L: 1662
																	var43 = 0;
																} else if (var43 > 255) { // L: 1663
																	var43 = 255;
																}

																var41 = MusicPatchNode2.hslToRgb(var62, var61.saturation, var43); // L: 1664
															}

															var62 = 0; // L: 1667
															if (var41 != -2) { // L: 1668
																var62 = Rasterizer3D.Rasterizer3D_colorPalette[PendingSpawn.method2223(var41, 96)];
															}

															if (var61.secondaryRgb != -1) { // L: 1669
																var43 = var61.secondaryHue + Tiles.rndHue & 255; // L: 1670
																int var44 = var61.secondaryLightness + Tiles.rndLightness; // L: 1671
																if (var44 < 0) { // L: 1672
																	var44 = 0;
																} else if (var44 > 255) { // L: 1673
																	var44 = 255;
																}

																var41 = MusicPatchNode2.hslToRgb(var43, var61.secondarySaturation, var44); // L: 1674
																var62 = Rasterizer3D.Rasterizer3D_colorPalette[PendingSpawn.method2223(var41, 96)]; // L: 1675
															}

															var65.addTile(var5, var14, var52, var36, var76, var39, var25, var26, var27, var28, Login.method1995(var33, var29), Login.method1995(var33, var30), Login.method1995(var33, var60), Login.method1995(var33, var32), PendingSpawn.method2223(var40, var29), PendingSpawn.method2223(var40, var30), PendingSpawn.method2223(var40, var60), PendingSpawn.method2223(var40, var32), var35, var62); // L: 1677
														}
													}
												}
											}
										}
									}

									for (var14 = 1; var14 < 103; ++var14) { // L: 1684
										for (var15 = 1; var15 < 103; ++var15) { // L: 1685
											var65.setTileMinPlane(var5, var15, var14, Login.method1993(var5, var15, var14)); // L: 1686
										}
									}

									Tiles.Tiles_underlays[var5] = null; // L: 1689
									Tiles.Tiles_overlays[var5] = null; // L: 1690
									Tiles.Tiles_shapes[var5] = null; // L: 1691
									WorldMapLabelSize.field2580[var5] = null; // L: 1692
									SoundCache.field321[var5] = null; // L: 1693
								}

								var65.method3981(-50, -10, -50); // L: 1695

								for (var5 = 0; var5 < 104; ++var5) { // L: 1696
									for (var6 = 0; var6 < 104; ++var6) { // L: 1697
										if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) { // L: 1698
											var65.setLinkBelow(var5, var6);
										}
									}
								}

								var5 = 1; // L: 1701
								var6 = 2; // L: 1702
								var7 = 4; // L: 1703

								for (var69 = 0; var69 < 4; ++var69) { // L: 1704
									if (var69 > 0) { // L: 1705
										var5 <<= 3; // L: 1706
										var6 <<= 3; // L: 1707
										var7 <<= 3; // L: 1708
									}

									for (var53 = 0; var53 <= var69; ++var53) { // L: 1710
										for (var10 = 0; var10 <= 104; ++var10) { // L: 1711
											for (var11 = 0; var11 <= 104; ++var11) { // L: 1712
												short var74;
												if ((ClanChannelMember.field1504[var53][var11][var10] & var5) != 0) { // L: 1713
													var12 = var10; // L: 1714
													var72 = var10; // L: 1715
													var14 = var53; // L: 1716

													for (var15 = var53; var12 > 0 && (ClanChannelMember.field1504[var53][var11][var12 - 1] & var5) != 0; --var12) { // L: 1717 1718
													}

													while (var72 < 104 && (ClanChannelMember.field1504[var53][var11][var72 + 1] & var5) != 0) { // L: 1719
														++var72;
													}

													label957:
													while (var14 > 0) { // L: 1720
														for (var16 = var12; var16 <= var72; ++var16) { // L: 1721
															if ((ClanChannelMember.field1504[var14 - 1][var11][var16] & var5) == 0) {
																break label957;
															}
														}

														--var14; // L: 1722
													}

													label946:
													while (var15 < var69) { // L: 1724
														for (var16 = var12; var16 <= var72; ++var16) { // L: 1725
															if ((ClanChannelMember.field1504[var15 + 1][var11][var16] & var5) == 0) {
																break label946;
															}
														}

														++var15; // L: 1726
													}

													var16 = (var15 + 1 - var14) * (var72 - var12 + 1); // L: 1728
													if (var16 >= 8) { // L: 1729
														var74 = 240; // L: 1730
														var18 = Tiles.Tiles_heights[var15][var11][var12] - var74; // L: 1731
														var19 = Tiles.Tiles_heights[var14][var11][var12]; // L: 1732
														Scene.Scene_addOccluder(var69, 1, var11 * 128, var11 * 128, var12 * 128, var72 * 128 + 128, var18, var19); // L: 1733

														for (var52 = var14; var52 <= var15; ++var52) { // L: 1734
															for (var21 = var12; var21 <= var72; ++var21) { // L: 1735
																var10000 = ClanChannelMember.field1504[var52][var11];
																var10000[var21] &= ~var5;
															}
														}
													}
												}

												if ((ClanChannelMember.field1504[var53][var11][var10] & var6) != 0) { // L: 1739
													var12 = var11; // L: 1740
													var72 = var11; // L: 1741
													var14 = var53; // L: 1742

													for (var15 = var53; var12 > 0 && (ClanChannelMember.field1504[var53][var12 - 1][var10] & var6) != 0; --var12) { // L: 1743 1744
													}

													while (var72 < 104 && (ClanChannelMember.field1504[var53][var72 + 1][var10] & var6) != 0) { // L: 1745
														++var72;
													}

													label1010:
													while (var14 > 0) { // L: 1746
														for (var16 = var12; var16 <= var72; ++var16) { // L: 1747
															if ((ClanChannelMember.field1504[var14 - 1][var16][var10] & var6) == 0) {
																break label1010;
															}
														}

														--var14; // L: 1748
													}

													label999:
													while (var15 < var69) { // L: 1750
														for (var16 = var12; var16 <= var72; ++var16) { // L: 1751
															if ((ClanChannelMember.field1504[var15 + 1][var16][var10] & var6) == 0) {
																break label999;
															}
														}

														++var15; // L: 1752
													}

													var16 = (var15 + 1 - var14) * (var72 - var12 + 1); // L: 1754
													if (var16 >= 8) { // L: 1755
														var74 = 240; // L: 1756
														var18 = Tiles.Tiles_heights[var15][var12][var10] - var74; // L: 1757
														var19 = Tiles.Tiles_heights[var14][var12][var10]; // L: 1758
														Scene.Scene_addOccluder(var69, 2, var12 * 128, var72 * 128 + 128, var10 * 128, var10 * 128, var18, var19); // L: 1759

														for (var52 = var14; var52 <= var15; ++var52) { // L: 1760
															for (var21 = var12; var21 <= var72; ++var21) { // L: 1761
																var10000 = ClanChannelMember.field1504[var52][var21];
																var10000[var10] &= ~var6;
															}
														}
													}
												}

												if ((ClanChannelMember.field1504[var53][var11][var10] & var7) != 0) { // L: 1765
													var12 = var11; // L: 1766
													var72 = var11; // L: 1767
													var14 = var10; // L: 1768

													for (var15 = var10; var14 > 0 && (ClanChannelMember.field1504[var53][var11][var14 - 1] & var7) != 0; --var14) { // L: 1769 1770
													}

													while (var15 < 104 && (ClanChannelMember.field1504[var53][var11][var15 + 1] & var7) != 0) { // L: 1771
														++var15;
													}

													label1063:
													while (var12 > 0) { // L: 1772
														for (var16 = var14; var16 <= var15; ++var16) { // L: 1773
															if ((ClanChannelMember.field1504[var53][var12 - 1][var16] & var7) == 0) {
																break label1063;
															}
														}

														--var12; // L: 1774
													}

													label1052:
													while (var72 < 104) { // L: 1776
														for (var16 = var14; var16 <= var15; ++var16) { // L: 1777
															if ((ClanChannelMember.field1504[var53][var72 + 1][var16] & var7) == 0) {
																break label1052;
															}
														}

														++var72; // L: 1778
													}

													if ((var72 - var12 + 1) * (var15 - var14 + 1) >= 4) { // L: 1780
														var16 = Tiles.Tiles_heights[var53][var12][var14]; // L: 1781
														Scene.Scene_addOccluder(var69, 4, var12 * 128, var72 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16); // L: 1782

														for (var17 = var12; var17 <= var72; ++var17) { // L: 1783
															for (var18 = var14; var18 <= var15; ++var18) { // L: 1784
																var10000 = ClanChannelMember.field1504[var53][var17];
																var10000[var18] &= ~var7;
															}
														}
													}
												}
											}
										}
									}
								}

								ClientPacket.method5001(true); // L: 1793
								var5 = Tiles.Tiles_minPlane; // L: 1794
								if (var5 > class20.Client_plane) { // L: 1795
									var5 = class20.Client_plane;
								}

								if (var5 < class20.Client_plane - 1) { // L: 1796
									var5 = class20.Client_plane - 1;
								}

								if (isLowDetail) { // L: 1797
									class7.scene.init(Tiles.Tiles_minPlane);
								} else {
									class7.scene.init(0); // L: 1798
								}

								for (var6 = 0; var6 < 104; ++var6) { // L: 1799
									for (var7 = 0; var7 < 104; ++var7) { // L: 1800
										MouseHandler.updateItemPile(var6, var7); // L: 1801
									}
								}

								class148.playPcmPlayers(); // L: 1804

								for (PendingSpawn var79 = (PendingSpawn)pendingSpawns.last(); var79 != null; var79 = (PendingSpawn)pendingSpawns.previous()) { // L: 1806 1807 1813
									if (var79.hitpoints == -1) { // L: 1808
										var79.delay = 0; // L: 1809
										class4.method26(var79); // L: 1810
									} else {
										var79.remove(); // L: 1812
									}
								}

								ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 1816
								PacketBufferNode var80;
								if (class295.client.hasFrame()) { // L: 1817
									var80 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2879, packetWriter.isaacCipher); // L: 1819
									var80.packetBuffer.writeInt(1057001181); // L: 1820
									packetWriter.addNode(var80); // L: 1821
								}

								if (!isInInstance) { // L: 1823
									var6 = (Messages.field1277 - 6) / 8; // L: 1824
									var7 = (Messages.field1277 + 6) / 8; // L: 1825
									var69 = (class4.field9 - 6) / 8; // L: 1826
									var53 = (class4.field9 + 6) / 8; // L: 1827

									for (var10 = var6 - 1; var10 <= var7 + 1; ++var10) { // L: 1828
										for (var11 = var69 - 1; var11 <= var53 + 1; ++var11) { // L: 1829
											if (var10 < var6 || var10 > var7 || var11 < var69 || var11 > var53) { // L: 1830
												class140.archive5.loadRegionFromName("m" + var10 + "_" + var11); // L: 1831
												class140.archive5.loadRegionFromName("l" + var10 + "_" + var11); // L: 1832
											}
										}
									}
								}

								VertexNormal.updateGameState(30); // L: 1836
								class148.playPcmPlayers(); // L: 1837
								class119.method2689(); // L: 1838
								var80 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2848, packetWriter.isaacCipher); // L: 1839
								packetWriter.addNode(var80); // L: 1840
								class17.method292(); // L: 1841
							}
						}
					}
				} else {
					Skeleton.method3947(this, class114.fontPlain12);
				}

				if (gameState == 30) { // L: 1843
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1844
					this.doCycleLoggedOut();
				}

				return; // L: 1845
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1070
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "549681271"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label168: {
			try {
				if (class260.musicPlayerStatus == 2) { // L: 1852
					if (class21.musicTrack == null) { // L: 1853
						class21.musicTrack = MusicTrack.readTrack(class124.musicTrackArchive, VarcInt.musicTrackGroupId, class260.musicTrackFileId); // L: 1854
						if (class21.musicTrack == null) { // L: 1855
							var2 = false; // L: 1856
							break label168;
						}
					}

					if (class257.soundCache == null) { // L: 1860
						class257.soundCache = new SoundCache(class260.soundEffectsArchive, class331.musicSamplesArchive);
					}

					if (class260.midiPcmStream.loadMusicTrack(class21.musicTrack, class260.musicPatchesArchive, class257.soundCache, 22050)) { // L: 1861
						class260.midiPcmStream.clearAll(); // L: 1862
						class260.midiPcmStream.setPcmStreamVolume(ChatChannel.musicTrackVolume); // L: 1863
						class260.midiPcmStream.setMusicTrack(class21.musicTrack, DynamicObject.musicTrackBoolean); // L: 1864
						class260.musicPlayerStatus = 0; // L: 1865
						class21.musicTrack = null; // L: 1866
						class257.soundCache = null; // L: 1867
						class124.musicTrackArchive = null; // L: 1868
						var2 = true; // L: 1869
						break label168;
					}
				}
			} catch (Exception var6) { // L: 1874
				var6.printStackTrace(); // L: 1875
				class260.midiPcmStream.clear(); // L: 1876
				class260.musicPlayerStatus = 0; // L: 1877
				class21.musicTrack = null; // L: 1878
				class257.soundCache = null; // L: 1879
				class124.musicTrackArchive = null; // L: 1880
			}

			var2 = false; // L: 1882
		}

		if (var2 && field743 && JagexCache.pcmPlayer0 != null) { // L: 1885 1886
			JagexCache.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field514 != 0L && Ignored.method6459() > field514) { // L: 1888 1889
			Occluder.setWindowedMode(class143.getWindowedMode()); // L: 1890
		}

		int var4;
		if (var1) { // L: 1893
			for (var4 = 0; var4 < 100; ++var4) { // L: 1894
				field504[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1896
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1897
			class253.drawTitle(class136.fontBold12, class307.fontPlain11, class114.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1898
			if (gameState == 20) { // L: 1899
				class253.drawTitle(class136.fontBold12, class307.fontPlain11, class114.fontPlain12);
			} else if (gameState == 25) { // L: 1900
				if (field602 == 1) { // L: 1901
					if (field529 > field530) { // L: 1902
						field530 = field529;
					}

					var4 = (field530 * 50 - field529 * 50) / field530; // L: 1903
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1904
				} else if (field602 == 2) { // L: 1906
					if (field617 > field532) { // L: 1907
						field532 = field617;
					}

					var4 = (field532 * 50 - field617 * 50) / field532 + 50; // L: 1908
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1909
				} else {
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait.", false); // L: 1911
				}
			} else if (gameState == 30) { // L: 1913
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1914
				ArchiveDiskActionHandler.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1915
				ArchiveDiskActionHandler.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class253.drawTitle(class136.fontBold12, class307.fontPlain11, class114.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1916
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1917
				if (field686[var4]) { // L: 1918
					class19.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1919
					field686[var4] = false; // L: 1920
				}
			}
		} else if (gameState > 0) { // L: 1924
			class19.rasterProvider.drawFull(0, 0); // L: 1925

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1926
				field686[var4] = false;
			}
		}

	} // L: 1928

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1665222357"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class339.varcs.hasUnwrittenChanges()) { // L: 1931
			class339.varcs.write();
		}

		if (mouseRecorder != null) { // L: 1932
			mouseRecorder.isRunning = false;
		}

		mouseRecorder = null; // L: 1933
		packetWriter.close(); // L: 1934
		GrandExchangeEvents.method5716(); // L: 1935
		Friend.method6294(); // L: 1936
		WorldMapDecorationType.mouseWheel = null; // L: 1937
		if (JagexCache.pcmPlayer0 != null) { // L: 1938
			JagexCache.pcmPlayer0.shutdown();
		}

		if (PacketWriter.pcmPlayer1 != null) { // L: 1939
			PacketWriter.pcmPlayer1.shutdown();
		}

		GraphicsObject.method1956(); // L: 1940
		class213.method4356(); // L: 1941
		if (WorldMapData_1.urlRequester != null) { // L: 1942
			WorldMapData_1.urlRequester.close(); // L: 1943
			WorldMapData_1.urlRequester = null; // L: 1944
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1948

			for (int var1 = 0; var1 < class143.idxCount; ++var1) { // L: 1949
				JagexCache.JagexCache_idxFiles[var1].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1950
			JagexCache.JagexCache_randomDat.close(); // L: 1951
		} catch (Exception var3) { // L: 1953
		}

		this.field510.method206(); // L: 1955
	} // L: 1956

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	protected final void vmethod1151() {
	} // L: 660

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1448065083"
	)
	boolean method1154() {
		return WorldMapAreaData.field2772 != null && !WorldMapAreaData.field2772.trim().isEmpty(); // L: 975
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-82"
	)
	void method1625(String var1) throws MalformedURLException, IOException {
		class10 var2 = new class10(new URL(class257.field3044 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class9.field36); // L: 979
		var2.method121("Authorization", "Bearer " + var1); // L: 980
		this.field613 = this.field510.method213(var2); // L: 981
	} // L: 982

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "139044598"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1997
			boolean var1 = class295.method5515(); // L: 1998
			if (!var1) { // L: 1999
				this.doCycleJs5Connect();
			}

		}
	} // L: 2000

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1295917828"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 2003
			this.error("js5crc"); // L: 2004
			VertexNormal.updateGameState(1000); // L: 2005
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 2008
				if (gameState <= 5) { // L: 2009
					this.error("js5io"); // L: 2010
					VertexNormal.updateGameState(1000); // L: 2011
					return; // L: 2012
				}

				field517 = 3000; // L: 2015
				NetCache.NetCache_ioExceptions = 3; // L: 2016
			}

			if (--field517 + 1 <= 0) { // L: 2019
				try {
					if (js5ConnectState == 0) { // L: 2021
						ScriptEvent.js5SocketTask = GameEngine.taskHandler.newSocketTask(class185.worldHost, class129.currentPort); // L: 2022
						++js5ConnectState; // L: 2023
					}

					if (js5ConnectState == 1) { // L: 2025
						if (ScriptEvent.js5SocketTask.status == 2) { // L: 2026
							this.js5Error(-1); // L: 2027
							return; // L: 2028
						}

						if (ScriptEvent.js5SocketTask.status == 1) { // L: 2030
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 2032
						if (useBufferedSocket) { // L: 2033
							FontName.js5Socket = Login.method1965((Socket)ScriptEvent.js5SocketTask.result, 40000, 5000); // L: 2034
						} else {
							FontName.js5Socket = new NetSocket((Socket)ScriptEvent.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 2037
						}

						Buffer var1 = new Buffer(5); // L: 2039
						var1.writeByte(15); // L: 2040
						var1.writeInt(202); // L: 2041
						FontName.js5Socket.write(var1.array, 0, 5); // L: 2042
						++js5ConnectState; // L: 2043
						class120.field1450 = Ignored.method6459(); // L: 2044
					}

					if (js5ConnectState == 3) { // L: 2046
						if (FontName.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 2047
							int var5 = FontName.js5Socket.readUnsignedByte(); // L: 2048
							if (var5 != 0) { // L: 2049
								this.js5Error(var5); // L: 2050
								return; // L: 2051
							}

							++js5ConnectState; // L: 2053
						} else if (Ignored.method6459() - class120.field1450 > 30000L) { // L: 2056
							this.js5Error(-2); // L: 2057
							return; // L: 2058
						}
					}

					if (js5ConnectState == 4) { // L: 2062
						AbstractSocket var10 = FontName.js5Socket; // L: 2063
						boolean var2 = gameState > 20; // L: 2064
						if (NetCache.NetCache_socket != null) { // L: 2066
							try {
								NetCache.NetCache_socket.close(); // L: 2068
							} catch (Exception var8) { // L: 2070
							}

							NetCache.NetCache_socket = null; // L: 2071
						}

						NetCache.NetCache_socket = var10; // L: 2073
						ClientPreferences.method2297(var2); // L: 2074
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 2075
						class279.NetCache_currentResponse = null; // L: 2076
						class149.NetCache_responseArchiveBuffer = null; // L: 2077
						NetCache.field3863 = 0; // L: 2078

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 2080
							if (var3 == null) { // L: 2081
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 2087
									if (var3 == null) { // L: 2088
										if (NetCache.field3866 != 0) { // L: 2094
											try {
												Buffer var11 = new Buffer(4); // L: 2096
												var11.writeByte(4); // L: 2097
												var11.writeByte(NetCache.field3866); // L: 2098
												var11.writeShort(0); // L: 2099
												NetCache.NetCache_socket.write(var11.array, 0, 4); // L: 2100
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close(); // L: 2104
												} catch (Exception var6) { // L: 2106
												}

												++NetCache.NetCache_ioExceptions; // L: 2107
												NetCache.NetCache_socket = null; // L: 2108
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 2111
										UserComparator7.field1319 = Ignored.method6459(); // L: 2112
										ScriptEvent.js5SocketTask = null; // L: 2114
										FontName.js5Socket = null; // L: 2115
										js5ConnectState = 0; // L: 2116
										js5Errors = 0; // L: 2117
										return; // L: 2123
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 2089
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 2090
									++NetCache.NetCache_pendingWritesCount; // L: 2091
									--NetCache.NetCache_pendingResponsesCount; // L: 2092
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 2082
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 2083
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 2084
						}
					}
				} catch (IOException var9) { // L: 2120
					this.js5Error(-3); // L: 2121
				}

			}
		}
	} // L: 2006

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "99"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		ScriptEvent.js5SocketTask = null; // L: 2126
		FontName.js5Socket = null; // L: 2127
		js5ConnectState = 0; // L: 2128
		if (GameObject.worldPort == class129.currentPort) { // L: 2129
			class129.currentPort = class133.js5Port;
		} else {
			class129.currentPort = GameObject.worldPort; // L: 2130
		}

		++js5Errors; // L: 2131
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 2132
			if (js5Errors >= 2 && var1 == 6) { // L: 2139
				this.error("js5connect_outofdate"); // L: 2140
				VertexNormal.updateGameState(1000); // L: 2141
			} else if (js5Errors >= 4) { // L: 2143
				if (gameState <= 5) { // L: 2144
					this.error("js5connect"); // L: 2145
					VertexNormal.updateGameState(1000); // L: 2146
				} else {
					field517 = 3000; // L: 2148
				}
			}
		} else if (gameState <= 5) { // L: 2133
			this.error("js5connect_full"); // L: 2134
			VertexNormal.updateGameState(1000); // L: 2135
		} else {
			field517 = 3000; // L: 2137
		}

	} // L: 2150

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2832
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2833

		try {
			if (loginState == 0) { // L: 2835
				if (class19.secureRandom == null && (secureRandomFuture.isDone() || field545 > 250)) { // L: 2836
					class19.secureRandom = secureRandomFuture.get(); // L: 2837
					secureRandomFuture.shutdown(); // L: 2838
					secureRandomFuture = null; // L: 2839
				}

				if (class19.secureRandom != null) { // L: 2841
					if (var1 != null) { // L: 2842
						((AbstractSocket)var1).close(); // L: 2843
						var1 = null; // L: 2844
					}

					class334.socketTask = null; // L: 2846
					hadNetworkError = false; // L: 2847
					field545 = 0; // L: 2848
					if (field508.method7605()) { // L: 2849
						try {
							this.method1625(WorldMapAreaData.field2772); // L: 2851
							PacketBufferNode.method5016(20); // L: 2852
						} catch (Throwable var21) { // L: 2854
							AccessFile.RunException_sendStackTrace((String)null, var21); // L: 2855
							class29.getLoginError(65); // L: 2856
							return; // L: 2857
						}
					} else {
						PacketBufferNode.method5016(1); // L: 2861
					}
				}
			}

			if (loginState == 20) { // L: 2865
				if (!this.field613.method309()) { // L: 2866
					return; // L: 2867
				}

				if (this.field613.method331()) { // L: 2869
					AccessFile.RunException_sendStackTrace(this.field613.method307(), (Throwable)null); // L: 2870
					class29.getLoginError(65); // L: 2871
					return; // L: 2872
				}

				class21 var3 = this.field613.method310(); // L: 2874
				if (var3.method338() != 200) { // L: 2875
					AccessFile.RunException_sendStackTrace("Response code: " + var3.method338() + "Response body: " + var3.method339(), (Throwable)null); // L: 2876
					class29.getLoginError(65); // L: 2877
					return; // L: 2878
				}

				field545 = 0; // L: 2880
				this.field576 = var3.method339(); // L: 2881
				PacketBufferNode.method5016(1); // L: 2882
			}

			if (loginState == 1) { // L: 2884
				if (class334.socketTask == null) { // L: 2885
					class334.socketTask = GameEngine.taskHandler.newSocketTask(class185.worldHost, class129.currentPort); // L: 2886
				}

				if (class334.socketTask.status == 2) { // L: 2888
					throw new IOException();
				}

				if (class334.socketTask.status == 1) { // L: 2889
					if (useBufferedSocket) { // L: 2890
						var1 = Login.method1965((Socket)class334.socketTask.result, 40000, 5000); // L: 2891
					} else {
						var1 = new NetSocket((Socket)class334.socketTask.result, GameEngine.taskHandler, 5000); // L: 2894
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2896
					class334.socketTask = null; // L: 2897
					PacketBufferNode.method5016(2); // L: 2898
				}
			}

			PacketBufferNode var23;
			if (loginState == 2) { // L: 2901
				packetWriter.clearBuffer(); // L: 2902
				var23 = class231.method4802(); // L: 2903
				var23.packetBuffer.writeByte(LoginPacket.field3032.id); // L: 2904
				packetWriter.addNode(var23); // L: 2905
				packetWriter.flush(); // L: 2906
				var2.offset = 0; // L: 2907
				PacketBufferNode.method5016(3); // L: 2908
			}

			int var4;
			boolean var12;
			if (loginState == 3) { // L: 2910
				if (JagexCache.pcmPlayer0 != null) { // L: 2911
					JagexCache.pcmPlayer0.method747();
				}

				if (PacketWriter.pcmPlayer1 != null) { // L: 2912
					PacketWriter.pcmPlayer1.method747();
				}

				var12 = true; // L: 2913
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2914 2915
					var12 = false;
				}

				if (var12) { // L: 2917
					var4 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2918
					if (JagexCache.pcmPlayer0 != null) { // L: 2919
						JagexCache.pcmPlayer0.method747();
					}

					if (PacketWriter.pcmPlayer1 != null) { // L: 2920
						PacketWriter.pcmPlayer1.method747();
					}

					if (var4 != 0) { // L: 2921
						class29.getLoginError(var4); // L: 2922
						return; // L: 2923
					}

					var2.offset = 0; // L: 2925
					PacketBufferNode.method5016(4); // L: 2926
				}
			}

			int var34;
			if (loginState == 4) { // L: 2929
				if (var2.offset < 8) { // L: 2930
					var34 = ((AbstractSocket)var1).available(); // L: 2931
					if (var34 > 8 - var2.offset) { // L: 2932
						var34 = 8 - var2.offset;
					}

					if (var34 > 0) { // L: 2933
						((AbstractSocket)var1).read(var2.array, var2.offset, var34); // L: 2934
						var2.offset += var34; // L: 2935
					}
				}

				if (var2.offset == 8) { // L: 2938
					var2.offset = 0; // L: 2939
					Messages.field1272 = var2.readLong(); // L: 2940
					PacketBufferNode.method5016(5); // L: 2941
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) { // L: 2944
				packetWriter.packetBuffer.offset = 0; // L: 2945
				packetWriter.clearBuffer(); // L: 2946
				PacketBuffer var24 = new PacketBuffer(500); // L: 2947
				int[] var13 = new int[]{class19.secureRandom.nextInt(), class19.secureRandom.nextInt(), class19.secureRandom.nextInt(), class19.secureRandom.nextInt()}; // L: 2948 2949 2950 2951 2952
				var24.offset = 0; // L: 2953
				var24.writeByte(1); // L: 2954
				var24.writeInt(var13[0]); // L: 2955
				var24.writeInt(var13[1]); // L: 2956
				var24.writeInt(var13[2]); // L: 2957
				var24.writeInt(var13[3]); // L: 2958
				var24.writeLong(Messages.field1272); // L: 2959
				int var10;
				if (gameState == 40) { // L: 2960
					var24.writeInt(ArchiveLoader.field984[0]); // L: 2961
					var24.writeInt(ArchiveLoader.field984[1]); // L: 2962
					var24.writeInt(ArchiveLoader.field984[2]); // L: 2963
					var24.writeInt(ArchiveLoader.field984[3]); // L: 2964
				} else {
					var24.writeByte(field507.rsOrdinal()); // L: 2967
					switch(field507.field1475) { // L: 2968
					case 0:
					case 3:
						var24.writeMedium(class148.field1651); // L: 2972
						++var24.offset; // L: 2973
						break; // L: 2974
					case 1:
						LinkedHashMap var6 = SecureRandomFuture.clientPreferences.parameters; // L: 2984
						String var8 = Login.Login_username; // L: 2986
						var9 = var8.length(); // L: 2988
						var10 = 0; // L: 2989

						for (int var11 = 0; var11 < var9; ++var11) { // L: 2990
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var24.writeInt((Integer)var6.get(var10)); // L: 2993
						break;
					case 2:
						var24.offset += 4; // L: 2978
					}

					if (field508.method7605()) { // L: 2997
						var24.writeByte(class422.field4524.rsOrdinal()); // L: 2998
						var24.writeStringCp1252NullTerminated(this.field576); // L: 2999
					} else {
						var24.writeByte(class422.field4523.rsOrdinal()); // L: 3002
						var24.writeStringCp1252NullTerminated(Login.Login_password); // L: 3003
					}
				}

				var24.encryptRsa(class67.field856, class67.field857); // L: 3006
				ArchiveLoader.field984 = var13; // L: 3007
				PacketBufferNode var5 = class231.method4802(); // L: 3008
				var5.packetBuffer.offset = 0; // L: 3009
				if (gameState == 40) { // L: 3010
					var5.packetBuffer.writeByte(LoginPacket.field3037.id); // L: 3011
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3038.id); // L: 3014
				}

				var5.packetBuffer.writeShort(0); // L: 3016
				var14 = var5.packetBuffer.offset; // L: 3017
				var5.packetBuffer.writeInt(202); // L: 3018
				var5.packetBuffer.writeInt(1); // L: 3019
				var5.packetBuffer.writeByte(clientType); // L: 3020
				var5.packetBuffer.writeByte(field499); // L: 3021
				var5.packetBuffer.writeBytes(var24.array, 0, var24.offset); // L: 3022
				var7 = var5.packetBuffer.offset; // L: 3023
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 3024
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 3025
				var5.packetBuffer.writeShort(class186.canvasWidth); // L: 3026
				var5.packetBuffer.writeShort(BoundaryObject.canvasHeight); // L: 3027
				Decimator.method1082(var5.packetBuffer); // L: 3028
				var5.packetBuffer.writeStringCp1252NullTerminated(class1.field3); // L: 3029
				var5.packetBuffer.writeInt(FriendLoginUpdate.field4096); // L: 3030
				Buffer var32 = new Buffer(Interpreter.platformInfo.size()); // L: 3031
				Interpreter.platformInfo.write(var32); // L: 3032
				var5.packetBuffer.writeBytes(var32.array, 0, var32.array.length); // L: 3033
				var5.packetBuffer.writeByte(clientType); // L: 3034
				var5.packetBuffer.writeInt(0); // L: 3035
				var5.packetBuffer.writeInt(0); // L: 3036
				var5.packetBuffer.method7407(WorldMapScaleHandler.archive6.hash); // L: 3037
				var5.packetBuffer.writeIntME(class9.archive3.hash); // L: 3038
				var5.packetBuffer.method7407(ChatChannel.archive14.hash); // L: 3039
				var5.packetBuffer.method7527(class1.archive13.hash); // L: 3040
				var5.packetBuffer.writeInt(TaskHandler.archive12.hash); // L: 3041
				var5.packetBuffer.writeInt(class148.archive19.hash); // L: 3042
				var5.packetBuffer.method7407(class133.archive15.hash); // L: 3043
				var5.packetBuffer.writeIntME(class19.archive4.hash); // L: 3044
				var5.packetBuffer.writeIntME(UserComparator6.archive8.hash); // L: 3045
				var5.packetBuffer.method7527(class126.archive17.hash); // L: 3046
				var5.packetBuffer.writeIntME(class115.archive7.hash); // L: 3047
				var5.packetBuffer.writeInt(Players.archive11.hash); // L: 3048
				var5.packetBuffer.method7407(VertexNormal.archive18.hash); // L: 3049
				var5.packetBuffer.writeInt(class140.archive5.hash); // L: 3050
				var5.packetBuffer.writeIntME(class131.archive2.hash); // L: 3051
				var5.packetBuffer.method7407(KeyHandler.field151.hash); // L: 3052
				var5.packetBuffer.writeIntME(NetSocket.archive9.hash); // L: 3053
				var5.packetBuffer.writeInt(class257.archive10.hash); // L: 3054
				var5.packetBuffer.method7407(HealthBarUpdate.archive20.hash); // L: 3055
				var5.packetBuffer.method7407(class115.archive1.hash); // L: 3056
				var5.packetBuffer.xteaEncrypt(var13, var7, var5.packetBuffer.offset); // L: 3057
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14); // L: 3058
				packetWriter.addNode(var5); // L: 3059
				packetWriter.flush(); // L: 3060
				packetWriter.isaacCipher = new IsaacCipher(var13); // L: 3061
				int[] var15 = new int[4]; // L: 3062

				for (var10 = 0; var10 < 4; ++var10) { // L: 3063
					var15[var10] = var13[var10] + 50;
				}

				var2.newIsaacCipher(var15); // L: 3064
				PacketBufferNode.method5016(6); // L: 3065
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 3067 3068
				var34 = ((AbstractSocket)var1).readUnsignedByte(); // L: 3069
				if (var34 == 21 && gameState == 20) { // L: 3070
					PacketBufferNode.method5016(12); // L: 3071
				} else if (var34 == 2) { // L: 3073
					PacketBufferNode.method5016(14); // L: 3074
				} else if (var34 == 15 && gameState == 40) { // L: 3076
					packetWriter.serverPacketLength = -1; // L: 3077
					PacketBufferNode.method5016(19); // L: 3078
				} else if (var34 == 64) { // L: 3080
					PacketBufferNode.method5016(10); // L: 3081
				} else if (var34 == 23 && field541 < 1) { // L: 3083
					++field541; // L: 3084
					PacketBufferNode.method5016(0); // L: 3085
				} else if (var34 == 29) { // L: 3087
					PacketBufferNode.method5016(17); // L: 3088
				} else {
					if (var34 != 69) { // L: 3090
						class29.getLoginError(var34); // L: 3094
						return; // L: 3095
					}

					PacketBufferNode.method5016(7); // L: 3091
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 3099 3100
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 3101
				var2.offset = 0; // L: 3102
				WorldMapSection2.field2601 = var2.readUnsignedShort(); // L: 3103
				PacketBufferNode.method5016(8); // L: 3104
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= WorldMapSection2.field2601) { // L: 3107 3108
				var2.offset = 0; // L: 3109
				((AbstractSocket)var1).read(var2.array, var2.offset, WorldMapSection2.field2601); // L: 3110
				class6 var25 = FontName.method7075()[var2.readUnsignedByte()]; // L: 3111

				try {
					class3 var35 = KitDefinition.method3238(var25); // L: 3113
					this.field515 = new class7(var2, var35); // L: 3114
					PacketBufferNode.method5016(9); // L: 3115
				} catch (Exception var20) { // L: 3117
					class29.getLoginError(22); // L: 3118
					return; // L: 3119
				}
			}

			if (loginState == 9 && this.field515.method61()) { // L: 3123 3124
				this.field710 = this.field515.method75(); // L: 3125
				this.field515.method65(); // L: 3126
				this.field515 = null; // L: 3127
				if (this.field710 == null) { // L: 3128
					class29.getLoginError(22); // L: 3129
					return; // L: 3130
				}

				packetWriter.clearBuffer(); // L: 3132
				var23 = class231.method4802(); // L: 3133
				var23.packetBuffer.writeByte(LoginPacket.field3034.id); // L: 3134
				var23.packetBuffer.writeShort(this.field710.offset); // L: 3135
				var23.packetBuffer.method7356(this.field710); // L: 3136
				packetWriter.addNode(var23); // L: 3137
				packetWriter.flush(); // L: 3138
				this.field710 = null; // L: 3139
				PacketBufferNode.method5016(6); // L: 3140
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 3143 3144
				class10.field59 = ((AbstractSocket)var1).readUnsignedByte(); // L: 3145
				PacketBufferNode.method5016(11); // L: 3146
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class10.field59) { // L: 3149 3150
				((AbstractSocket)var1).read(var2.array, 0, class10.field59); // L: 3151
				var2.offset = 0; // L: 3152
				PacketBufferNode.method5016(6); // L: 3153
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 3156 3157
				field506 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 3158
				PacketBufferNode.method5016(13); // L: 3159
			}

			if (loginState == 13) { // L: 3162
				field545 = 0; // L: 3163
				class19.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field506 / 60 + " seconds."); // L: 3164
				if (--field506 <= 0) { // L: 3165
					PacketBufferNode.method5016(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 3168 3169
					Canvas.field163 = ((AbstractSocket)var1).readUnsignedByte(); // L: 3170
					PacketBufferNode.method5016(15); // L: 3171
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= Canvas.field163) { // L: 3174 3175
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 3176
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 3177
					var2.offset = 0; // L: 3178
					boolean var26 = false; // L: 3179
					if (var12) { // L: 3180
						var4 = var2.readByteIsaac() << 24; // L: 3181
						var4 |= var2.readByteIsaac() << 16; // L: 3182
						var4 |= var2.readByteIsaac() << 8; // L: 3183
						var4 |= var2.readByteIsaac(); // L: 3184
						String var31 = Login.Login_username; // L: 3186
						var7 = var31.length(); // L: 3188
						int var16 = 0; // L: 3189
						var9 = 0; // L: 3190

						while (true) {
							if (var9 >= var7) {
								if (SecureRandomFuture.clientPreferences.parameters.size() >= 10 && !SecureRandomFuture.clientPreferences.parameters.containsKey(var16)) { // L: 3194 3195
									Iterator var33 = SecureRandomFuture.clientPreferences.parameters.entrySet().iterator(); // L: 3196
									var33.next(); // L: 3197
									var33.remove(); // L: 3198
								}

								SecureRandomFuture.clientPreferences.parameters.put(var16, var4); // L: 3201
								break;
							}

							var16 = (var16 << 5) - var16 + var31.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 3203
						SecureRandomFuture.clientPreferences.rememberedUsername = Login.Login_username; // L: 3204
					} else {
						SecureRandomFuture.clientPreferences.rememberedUsername = null; // L: 3207
					}

					class127.savePreferences(); // L: 3209
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 3210
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 3211
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 3212
					localPlayerIndex <<= 8; // L: 3213
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 3214
					field594 = ((AbstractSocket)var1).readUnsignedByte(); // L: 3215
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 3216
					var2.offset = 0; // L: 3217
					ServerPacket[] var28 = class129.ServerPacket_values(); // L: 3218
					var14 = var2.readSmartByteShortIsaac(); // L: 3219
					if (var14 < 0 || var14 >= var28.length) { // L: 3220
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var28[var14]; // L: 3221
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 3222
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 3223
					var2.offset = 0; // L: 3224
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 3225

					try {
						Client var18 = class295.client; // L: 3227
						JSObject.getWindow(var18).call("zap", (Object[])null); // L: 3230
					} catch (Throwable var19) { // L: 3233
					}

					PacketBufferNode.method5016(16); // L: 3234
				}

				if (loginState != 16) { // L: 3237
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 3350 3351
						var2.offset = 0; // L: 3352
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 3353
						var2.offset = 0; // L: 3354
						class126.field1497 = var2.readUnsignedShort(); // L: 3355
						PacketBufferNode.method5016(18); // L: 3356
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class126.field1497) { // L: 3359 3360
						var2.offset = 0; // L: 3361
						((AbstractSocket)var1).read(var2.array, 0, class126.field1497); // L: 3362
						var2.offset = 0; // L: 3363
						String var29 = var2.readStringCp1252NullTerminated(); // L: 3364
						String var37 = var2.readStringCp1252NullTerminated(); // L: 3365
						String var30 = var2.readStringCp1252NullTerminated(); // L: 3366
						class19.setLoginResponseString(var29, var37, var30); // L: 3367
						VertexNormal.updateGameState(10); // L: 3368
					}

					if (loginState == 19) { // L: 3371
						if (packetWriter.serverPacketLength == -1) { // L: 3372
							if (((AbstractSocket)var1).available() < 2) { // L: 3373
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 3374
							var2.offset = 0; // L: 3375
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 3376
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 3378
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 3379
							var2.offset = 0; // L: 3380
							var34 = packetWriter.serverPacketLength; // L: 3381
							timer.method6244(); // L: 3382
							class116.method2662(); // L: 3383
							HorizontalAlignment.updatePlayer(var2); // L: 3384
							if (var34 != var2.offset) { // L: 3385
								throw new RuntimeException(); // L: 3386
							}
						}
					} else {
						++field545; // L: 3390
						if (field545 > 2000) { // L: 3391
							if (field541 < 1) { // L: 3392
								if (GameObject.worldPort == class129.currentPort) { // L: 3393
									class129.currentPort = class133.js5Port;
								} else {
									class129.currentPort = GameObject.worldPort; // L: 3394
								}

								++field541; // L: 3395
								PacketBufferNode.method5016(0); // L: 3396
							} else {
								class29.getLoginError(-3); // L: 3399
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 3238
						var2.offset = 0; // L: 3239
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 3240
						timer.method6234(); // L: 3241
						mouseLastLastPressedTimeMillis = -1L; // L: 3244
						mouseRecorder.index = 0; // L: 3245
						World.hasFocus = true; // L: 3246
						hadFocus = true; // L: 3247
						field676 = -1L; // L: 3248
						class33.reflectionChecks = new IterableNodeDeque(); // L: 3250
						packetWriter.clearBuffer(); // L: 3252
						packetWriter.packetBuffer.offset = 0; // L: 3253
						packetWriter.serverPacket = null; // L: 3254
						packetWriter.field1289 = null; // L: 3255
						packetWriter.field1290 = null; // L: 3256
						packetWriter.field1291 = null; // L: 3257
						packetWriter.serverPacketLength = 0; // L: 3258
						packetWriter.field1287 = 0; // L: 3259
						rebootTimer = 0; // L: 3260
						logoutTimer = 0; // L: 3261
						hintArrowType = 0; // L: 3262
						UrlRequest.method2489(); // L: 3263
						class123.method2746(0); // L: 3264
						class123.method2745(); // L: 3265
						isItemSelected = 0; // L: 3266
						isSpellSelected = false; // L: 3267
						soundEffectCount = 0; // L: 3268
						camAngleY = 0; // L: 3269
						oculusOrbState = 0; // L: 3270
						Messages.field1273 = null; // L: 3271
						minimapState = 0; // L: 3272
						field570 = -1; // L: 3273
						destinationX = 0; // L: 3274
						destinationY = 0; // L: 3275
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 3276
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 3277
						npcCount = 0; // L: 3278
						Players.Players_count = 0; // L: 3280

						for (var34 = 0; var34 < 2048; ++var34) { // L: 3281
							Players.field1248[var34] = null; // L: 3282
							Players.field1246[var34] = class185.field2123; // L: 3283
						}

						for (var34 = 0; var34 < 2048; ++var34) { // L: 3286
							players[var34] = null;
						}

						for (var34 = 0; var34 < 32768; ++var34) { // L: 3287
							npcs[var34] = null;
						}

						combatTargetPlayerIndex = -1; // L: 3288
						projectiles.clear(); // L: 3289
						graphicsObjects.clear(); // L: 3290

						for (var34 = 0; var34 < 4; ++var34) { // L: 3291
							for (var4 = 0; var4 < 104; ++var4) { // L: 3292
								for (int var17 = 0; var17 < 104; ++var17) { // L: 3293
									groundItems[var34][var4][var17] = null; // L: 3294
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 3298
						GameEngine.friendSystem.clear(); // L: 3299

						for (var34 = 0; var34 < class433.VarpDefinition_fileCount; ++var34) { // L: 3300
							VarpDefinition var36 = SecureRandomCallable.VarpDefinition_get(var34); // L: 3301
							if (var36 != null) { // L: 3302
								Varps.Varps_temp[var34] = 0; // L: 3303
								Varps.Varps_main[var34] = 0; // L: 3304
							}
						}

						class339.varcs.clearTransient(); // L: 3307
						followerIndex = -1; // L: 3308
						if (rootInterface != -1) { // L: 3309
							class273.method5333(rootInterface);
						}

						for (InterfaceParent var27 = (InterfaceParent)interfaceParents.first(); var27 != null; var27 = (InterfaceParent)interfaceParents.next()) { // L: 3310
							class10.closeInterface(var27, true); // L: 3311
						}

						rootInterface = -1; // L: 3313
						interfaceParents = new NodeHashTable(8); // L: 3314
						meslayerContinueWidget = null; // L: 3315
						UrlRequest.method2489(); // L: 3316
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 3317

						for (var34 = 0; var34 < 8; ++var34) { // L: 3318
							playerMenuActions[var34] = null; // L: 3319
							playerOptionsPriorities[var34] = false; // L: 3320
						}

						ItemContainer.itemContainers = new NodeHashTable(32); // L: 3323
						isLoading = true; // L: 3325

						for (var34 = 0; var34 < 100; ++var34) { // L: 3326
							field504[var34] = true;
						}

						var23 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2824, packetWriter.isaacCipher); // L: 3329
						var23.packetBuffer.writeByte(class143.getWindowedMode()); // L: 3330
						var23.packetBuffer.writeShort(class186.canvasWidth); // L: 3331
						var23.packetBuffer.writeShort(BoundaryObject.canvasHeight); // L: 3332
						packetWriter.addNode(var23); // L: 3333
						Players.friendsChat = null; // L: 3335
						class222.guestClanSettings = null; // L: 3336
						Arrays.fill(currentClanSettings, (Object)null); // L: 3337
						UserComparator5.guestClanChannel = null; // L: 3338
						Arrays.fill(currentClanChannels, (Object)null); // L: 3339

						for (var34 = 0; var34 < 8; ++var34) { // L: 3340
							grandExchangeOffers[var34] = new GrandExchangeOffer();
						}

						grandExchangeEvents = null; // L: 3341
						HorizontalAlignment.updatePlayer(var2); // L: 3343
						Messages.field1277 = -1; // L: 3344
						DevicePcmPlayerProvider.loadRegions(false, var2); // L: 3345
						packetWriter.serverPacket = null; // L: 3346
					}

				}
			}
		} catch (IOException var22) { // L: 3403
			if (field541 < 1) { // L: 3404
				if (class129.currentPort == GameObject.worldPort) { // L: 3405
					class129.currentPort = class133.js5Port;
				} else {
					class129.currentPort = GameObject.worldPort; // L: 3406
				}

				++field541; // L: 3407
				PacketBufferNode.method5016(0); // L: 3408
			} else {
				class29.getLoginError(-2); // L: 3411
			}
		}
	} // L: 3166 3348 3388 3397 3400 3409 3412 3414

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1374404947"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3676
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3677
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3678
			hadNetworkError = false; // L: 3679
			Varcs.method2411(); // L: 3680
		} else {
			if (!isMenuOpen) { // L: 3683
				WorldMapElement.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1394(packetWriter); ++var1) { // L: 3684 3685
			}

			if (gameState == 30) { // L: 3687
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 3691
					boolean var30;
					if (var2 == null) { // L: 3692
						var30 = false; // L: 3693
					} else {
						var30 = true; // L: 3696
					}

					int var3;
					PacketBufferNode var31;
					if (!var30) { // L: 3698
						PacketBufferNode var14;
						int var15;
						if (timer.field4043) { // L: 3706
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2907, packetWriter.isaacCipher); // L: 3708
							var14.packetBuffer.writeByte(0); // L: 3709
							var15 = var14.packetBuffer.offset; // L: 3710
							timer.write(var14.packetBuffer); // L: 3711
							var14.packetBuffer.method7357(var14.packetBuffer.offset - var15); // L: 3712
							packetWriter.addNode(var14); // L: 3713
							timer.method6238(); // L: 3714
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
						synchronized(mouseRecorder.lock) { // L: 3717
							if (!field713) { // L: 3718
								mouseRecorder.index = 0; // L: 3804
							} else if (MouseHandler.MouseHandler_lastButton != 0 || mouseRecorder.index >= 40) { // L: 3719
								var31 = null; // L: 3721
								var3 = 0; // L: 3722
								var4 = 0; // L: 3723
								var5 = 0; // L: 3724
								var6 = 0; // L: 3725

								for (var7 = 0; var7 < mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) { // L: 3726 3727
									var4 = var7; // L: 3728
									var8 = mouseRecorder.ys[var7]; // L: 3729
									if (var8 < -1) { // L: 3730
										var8 = -1;
									} else if (var8 > 65534) { // L: 3731
										var8 = 65534;
									}

									var9 = mouseRecorder.xs[var7]; // L: 3732
									if (var9 < -1) { // L: 3733
										var9 = -1;
									} else if (var9 > 65534) { // L: 3734
										var9 = 65534;
									}

									if (var9 != field483 || var8 != field746) { // L: 3735
										if (var31 == null) { // L: 3738
											var31 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2889, packetWriter.isaacCipher); // L: 3739
											var31.packetBuffer.writeByte(0); // L: 3740
											var3 = var31.packetBuffer.offset; // L: 3741
											var10000 = var31.packetBuffer; // L: 3742
											var10000.offset += 2;
											var5 = 0; // L: 3743
											var6 = 0; // L: 3744
										}

										if (field485 != -1L) { // L: 3749
											var10 = var9 - field483; // L: 3750
											var11 = var8 - field746; // L: 3751
											var12 = (int)((mouseRecorder.millis[var7] - field485) / 20L); // L: 3752
											var5 = (int)((long)var5 + (mouseRecorder.millis[var7] - field485) % 20L); // L: 3753
										} else {
											var10 = var9; // L: 3756
											var11 = var8; // L: 3757
											var12 = Integer.MAX_VALUE; // L: 3758
										}

										field483 = var9; // L: 3760
										field746 = var8; // L: 3761
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3762
											var10 += 32; // L: 3763
											var11 += 32; // L: 3764
											var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3765
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3767
											var10 += 128; // L: 3768
											var11 += 128; // L: 3769
											var31.packetBuffer.writeByte(var12 + 128); // L: 3770
											var31.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3771
										} else if (var12 < 32) { // L: 3773
											var31.packetBuffer.writeByte(var12 + 192); // L: 3774
											if (var9 != -1 && var8 != -1) { // L: 3775
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 3776
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var31.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3779
											if (var9 != -1 && var8 != -1) { // L: 3780
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 3781
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3783
										field485 = mouseRecorder.millis[var7]; // L: 3784
									}
								}

								if (var31 != null) { // L: 3786
									var31.packetBuffer.method7357(var31.packetBuffer.offset - var3); // L: 3787
									var7 = var31.packetBuffer.offset; // L: 3788
									var31.packetBuffer.offset = var3; // L: 3789
									var31.packetBuffer.writeByte(var5 / var6); // L: 3790
									var31.packetBuffer.writeByte(var5 % var6); // L: 3791
									var31.packetBuffer.offset = var7; // L: 3792
									packetWriter.addNode(var31); // L: 3793
								}

								if (var4 >= mouseRecorder.index) { // L: 3795
									mouseRecorder.index = 0;
								} else {
									MouseRecorder var43 = mouseRecorder; // L: 3797
									var43.index -= var4;
									System.arraycopy(mouseRecorder.xs, var4, mouseRecorder.xs, 0, mouseRecorder.index); // L: 3798
									System.arraycopy(mouseRecorder.ys, var4, mouseRecorder.ys, 0, mouseRecorder.index); // L: 3799
									System.arraycopy(mouseRecorder.millis, var4, mouseRecorder.millis, 0, mouseRecorder.index); // L: 3800
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3806
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3807
							if (var16 > 32767L) { // L: 3808
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3809
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3810
							if (var3 < 0) { // L: 3811
								var3 = 0;
							} else if (var3 > BoundaryObject.canvasHeight) { // L: 3812
								var3 = BoundaryObject.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3813
							if (var4 < 0) { // L: 3814
								var4 = 0;
							} else if (var4 > class186.canvasWidth) { // L: 3815
								var4 = class186.canvasWidth;
							}

							var5 = (int)var16; // L: 3816
							var18 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2894, packetWriter.isaacCipher); // L: 3817
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3818
							var18.packetBuffer.writeShort(var4); // L: 3819
							var18.packetBuffer.writeShort(var3); // L: 3820
							packetWriter.addNode(var18); // L: 3821
						}

						if (KeyHandler.field140 > 0) { // L: 3823
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2899, packetWriter.isaacCipher); // L: 3824
							var14.packetBuffer.writeShort(0); // L: 3825
							var15 = var14.packetBuffer.offset; // L: 3826
							long var19 = Ignored.method6459(); // L: 3827

							for (var5 = 0; var5 < KeyHandler.field140; ++var5) { // L: 3828
								long var21 = var19 - field676; // L: 3829
								if (var21 > 16777215L) { // L: 3830
									var21 = 16777215L;
								}

								field676 = var19; // L: 3831
								var14.packetBuffer.writeMedium((int)var21); // L: 3832
								var14.packetBuffer.method7362(KeyHandler.field139[var5]); // L: 3833
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3835
							packetWriter.addNode(var14); // L: 3836
						}

						if (field560 > 0) { // L: 3838
							--field560;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3839
							field561 = true;
						}

						if (field561 && field560 <= 0) { // L: 3840
							field560 = 20; // L: 3841
							field561 = false; // L: 3842
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2869, packetWriter.isaacCipher); // L: 3844
							var14.packetBuffer.method7493(camAngleX); // L: 3845
							var14.packetBuffer.method7398(camAngleY); // L: 3846
							packetWriter.addNode(var14); // L: 3847
						}

						if (World.hasFocus && !hadFocus) { // L: 3849
							hadFocus = true; // L: 3850
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2861, packetWriter.isaacCipher); // L: 3852
							var14.packetBuffer.writeByte(1); // L: 3853
							packetWriter.addNode(var14); // L: 3854
						}

						if (!World.hasFocus && hadFocus) { // L: 3856
							hadFocus = false; // L: 3857
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2861, packetWriter.isaacCipher); // L: 3859
							var14.packetBuffer.writeByte(0); // L: 3860
							packetWriter.addNode(var14); // L: 3861
						}

						if (Varcs.worldMap != null) { // L: 3864
							Varcs.worldMap.method6902();
						}

						class65.method1958(); // L: 3865
						class117.method2682(); // L: 3866
						class145.method2985(); // L: 3867
						if (gameState != 30) { // L: 3868
							return;
						}

						AbstractArchive.method5693(); // L: 3869

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3871
							var10002 = queuedSoundEffectDelays[var1]--; // L: 3872
							if (queuedSoundEffectDelays[var1] >= -10) { // L: 3873
								SoundEffect var32 = soundEffects[var1]; // L: 3885
								if (var32 == null) { // L: 3886
									var10000 = null; // L: 3887
									var32 = SoundEffect.readSoundEffect(KeyHandler.field151, soundEffectIds[var1], 0);
									if (var32 == null) { // L: 3888
										continue;
									}

									int[] var44 = queuedSoundEffectDelays; // L: 3889
									var44[var1] += var32.calculateDelay();
									soundEffects[var1] = var32; // L: 3890
								}

								if (queuedSoundEffectDelays[var1] < 0) { // L: 3896
									if (soundLocations[var1] != 0) { // L: 3898
										var4 = (soundLocations[var1] & 255) * 128; // L: 3899
										var5 = soundLocations[var1] >> 16 & 255; // L: 3900
										var6 = var5 * 128 + 64 - class340.localPlayer.x; // L: 3901
										if (var6 < 0) { // L: 3902
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255; // L: 3903
										var8 = var7 * 128 + 64 - class340.localPlayer.y; // L: 3904
										if (var8 < 0) { // L: 3905
											var8 = -var8;
										}

										var9 = var8 + var6 - 128; // L: 3906
										if (var9 > var4) { // L: 3907
											queuedSoundEffectDelays[var1] = -100; // L: 3908
											continue; // L: 3909
										}

										if (var9 < 0) { // L: 3911
											var9 = 0;
										}

										var3 = (var4 - var9) * SecureRandomFuture.clientPreferences.areaSoundEffectsVolume / var4; // L: 3912
									} else {
										var3 = SecureRandomFuture.clientPreferences.soundEffectsVolume; // L: 3914
									}

									if (var3 > 0) { // L: 3915
										RawSound var23 = var32.toRawSound().resample(BoundaryObject.decimator); // L: 3916
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 3917
										var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3918
										class281.pcmStreamMixer.addSubStream(var24); // L: 3919
									}

									queuedSoundEffectDelays[var1] = -100; // L: 3921
								}
							} else {
								--soundEffectCount; // L: 3874

								for (var15 = var1; var15 < soundEffectCount; ++var15) { // L: 3875
									soundEffectIds[var15] = soundEffectIds[var15 + 1]; // L: 3876
									soundEffects[var15] = soundEffects[var15 + 1]; // L: 3877
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1]; // L: 3878
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1]; // L: 3879
									soundLocations[var15] = soundLocations[var15 + 1]; // L: 3880
								}

								--var1; // L: 3882
							}
						}

						if (field743 && !Projectile.method2008()) { // L: 3924
							if (SecureRandomFuture.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) { // L: 3925
								NetSocket.method3118(WorldMapScaleHandler.archive6, currentTrackGroupId, 0, SecureRandomFuture.clientPreferences.musicVolume, false);
							}

							field743 = false; // L: 3926
						}

						++packetWriter.field1287; // L: 3929
						if (packetWriter.field1287 > 750) { // L: 3930
							Varcs.method2411(); // L: 3931
							return; // L: 3932
						}

						class341.method6257(); // L: 3934
						Canvas.method406(); // L: 3935
						class91.method2337(); // L: 3936
						++field538; // L: 3937
						if (mouseCrossColor != 0) { // L: 3938
							mouseCrossState += 20; // L: 3939
							if (mouseCrossState >= 400) { // L: 3940
								mouseCrossColor = 0;
							}
						}

						if (WorldMapDecoration.field2722 != null) { // L: 3942
							++field582; // L: 3943
							if (field582 >= 15) { // L: 3944
								SecureRandomCallable.invalidateWidget(WorldMapDecoration.field2722); // L: 3945
								WorldMapDecoration.field2722 = null; // L: 3946
							}
						}

						Widget var38 = class4.mousedOverWidgetIf1; // L: 3949
						Widget var33 = class281.field3375; // L: 3950
						class4.mousedOverWidgetIf1 = null; // L: 3951
						class281.field3375 = null; // L: 3952
						draggedOnWidget = null; // L: 3953
						field657 = false; // L: 3954
						field531 = false; // L: 3955
						field701 = 0; // L: 3956

						while (NPCComposition.isKeyDown() && field701 < 128) { // L: 3957
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && Players.field1247 == 66) { // L: 3958
								String var25 = method1668(); // L: 3959
								class295.client.method492(var25); // L: 3960
							} else if (oculusOrbState != 1 || ModeWhere.field3954 <= 0) { // L: 3963
								field522[field701] = Players.field1247; // L: 3966
								field758[field701] = ModeWhere.field3954; // L: 3967
								++field701; // L: 3968
							}
						}

						boolean var34 = staffModLevel >= 2; // L: 3972
						if (var34 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3974
							var4 = class340.localPlayer.plane - mouseWheelRotation; // L: 3975
							if (var4 < 0) { // L: 3976
								var4 = 0;
							} else if (var4 > 3) { // L: 3977
								var4 = 3;
							}

							if (var4 != class340.localPlayer.plane) { // L: 3978
								BuddyRankComparator.method2547(class340.localPlayer.pathX[0] + class131.baseX, class340.localPlayer.pathY[0] + TileItem.baseY, var4, false); // L: 3979
							}

							mouseWheelRotation = 0; // L: 3981
						}

						if (rootInterface != -1) { // L: 3983
							class13.updateRootInterface(rootInterface, 0, 0, class186.canvasWidth, BoundaryObject.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3984

						while (true) {
							Widget var39;
							ScriptEvent var40;
							Widget var41;
							do {
								var40 = (ScriptEvent)field680.removeLast(); // L: 3986
								if (var40 == null) { // L: 3987
									while (true) {
										do {
											var40 = (ScriptEvent)field579.removeLast(); // L: 3998
											if (var40 == null) { // L: 3999
												while (true) {
													do {
														var40 = (ScriptEvent)scriptEvents.removeLast(); // L: 4010
														if (var40 == null) { // L: 4011
															this.menu(); // L: 4021
															WorldMapLabelSize.method4358(); // L: 4022
															if (clickedWidget != null) { // L: 4023
																this.method1174();
															}

															if (class143.dragInventoryWidget != null) { // L: 4024
																SecureRandomCallable.invalidateWidget(class143.dragInventoryWidget); // L: 4025
																++itemDragDuration; // L: 4026
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 4027
																	if (field572) { // L: 4028
																		if (class143.dragInventoryWidget == FloorOverlayDefinition.hoveredItemContainer && dragItemSlotDestination != dragItemSlotSource) { // L: 4029
																			Widget var42 = class143.dragInventoryWidget; // L: 4030
																			byte var35 = 0; // L: 4031
																			if (field641 == 1 && var42.contentType == 206) { // L: 4032
																				var35 = 1;
																			}

																			if (var42.itemIds[dragItemSlotDestination] <= 0) { // L: 4033
																				var35 = 0;
																			}

																			if (MouseHandler.method649(class363.getWidgetFlags(var42))) { // L: 4034
																				var6 = dragItemSlotSource; // L: 4035
																				var7 = dragItemSlotDestination; // L: 4036
																				var42.itemIds[var7] = var42.itemIds[var6]; // L: 4037
																				var42.itemQuantities[var7] = var42.itemQuantities[var6]; // L: 4038
																				var42.itemIds[var6] = -1; // L: 4039
																				var42.itemQuantities[var6] = 0; // L: 4040
																			} else if (var35 == 1) { // L: 4042
																				var6 = dragItemSlotSource; // L: 4043
																				var7 = dragItemSlotDestination; // L: 4044

																				while (var6 != var7) { // L: 4045
																					if (var6 > var7) { // L: 4046
																						var42.swapItems(var6 - 1, var6); // L: 4047
																						--var6; // L: 4048
																					} else if (var6 < var7) { // L: 4050
																						var42.swapItems(var6 + 1, var6); // L: 4051
																						++var6; // L: 4052
																					}
																				}
																			} else {
																				var42.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 4057
																			}

																			var18 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2811, packetWriter.isaacCipher); // L: 4060
																			var18.packetBuffer.method7398(dragItemSlotDestination); // L: 4061
																			var18.packetBuffer.method7362(var35); // L: 4062
																			var18.packetBuffer.method7407(class143.dragInventoryWidget.id); // L: 4063
																			var18.packetBuffer.method7493(dragItemSlotSource); // L: 4064
																			packetWriter.addNode(var18); // L: 4065
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 4069
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 4070
																	} else if (menuOptionsCount > 0) { // L: 4072
																		var4 = draggedWidgetX; // L: 4073
																		var5 = draggedWidgetY; // L: 4074
																		WorldMapIcon_1.method4385(class87.tempMenuAction, var4, var5); // L: 4076
																		class87.tempMenuAction = null; // L: 4077
																	}

																	field582 = 10; // L: 4081
																	MouseHandler.MouseHandler_lastButton = 0; // L: 4082
																	class143.dragInventoryWidget = null; // L: 4083
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 4086 4087
																	field572 = true; // L: 4088
																}
															}

															if (Scene.shouldSendWalk()) { // L: 4093
																var4 = Scene.Scene_selectedX; // L: 4094
																var5 = Scene.Scene_selectedY; // L: 4095
																var18 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2859, packetWriter.isaacCipher); // L: 4097
																var18.packetBuffer.writeByte(5); // L: 4098
																var18.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 4099
																var18.packetBuffer.method7493(var5 + TileItem.baseY); // L: 4100
																var18.packetBuffer.method7349(var4 + class131.baseX); // L: 4101
																packetWriter.addNode(var18); // L: 4102
																Scene.method3990(); // L: 4103
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 4104
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 4105
																mouseCrossColor = 1; // L: 4106
																mouseCrossState = 0; // L: 4107
																destinationX = var4; // L: 4108
																destinationY = var5; // L: 4109
															}

															if (var38 != class4.mousedOverWidgetIf1) { // L: 4111
																if (var38 != null) { // L: 4112
																	SecureRandomCallable.invalidateWidget(var38);
																}

																if (class4.mousedOverWidgetIf1 != null) { // L: 4113
																	SecureRandomCallable.invalidateWidget(class4.mousedOverWidgetIf1);
																}
															}

															if (var33 != class281.field3375 && field628 == field714) { // L: 4115
																if (var33 != null) { // L: 4116
																	SecureRandomCallable.invalidateWidget(var33);
																}

																if (class281.field3375 != null) { // L: 4117
																	SecureRandomCallable.invalidateWidget(class281.field3375);
																}
															}

															if (class281.field3375 != null) { // L: 4119
																if (field714 < field628) { // L: 4120
																	++field714; // L: 4121
																	if (field714 == field628) { // L: 4122
																		SecureRandomCallable.invalidateWidget(class281.field3375);
																	}
																}
															} else if (field714 > 0) { // L: 4125
																--field714;
															}

															if (oculusOrbState == 0) { // L: 4127
																var4 = class340.localPlayer.x; // L: 4128
																var5 = class340.localPlayer.y; // L: 4129
																if (class7.oculusOrbFocalPointX - var4 < -500 || class7.oculusOrbFocalPointX - var4 > 500 || Actor.oculusOrbFocalPointY - var5 < -500 || Actor.oculusOrbFocalPointY - var5 > 500) { // L: 4130
																	class7.oculusOrbFocalPointX = var4; // L: 4131
																	Actor.oculusOrbFocalPointY = var5; // L: 4132
																}

																if (var4 != class7.oculusOrbFocalPointX) { // L: 4134
																	class7.oculusOrbFocalPointX += (var4 - class7.oculusOrbFocalPointX) / 16;
																}

																if (var5 != Actor.oculusOrbFocalPointY) { // L: 4135
																	Actor.oculusOrbFocalPointY += (var5 - Actor.oculusOrbFocalPointY) / 16;
																}

																var6 = class7.oculusOrbFocalPointX >> 7; // L: 4136
																var7 = Actor.oculusOrbFocalPointY >> 7; // L: 4137
																var8 = FaceNormal.getTileHeight(class7.oculusOrbFocalPointX, Actor.oculusOrbFocalPointY, class20.Client_plane); // L: 4138
																var9 = 0; // L: 4139
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 4140
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 4141
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 4142
																			var12 = class20.Client_plane; // L: 4143
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 4144
																				++var12;
																			}

																			int var26 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 4145
																			if (var26 > var9) { // L: 4146
																				var9 = var26;
																			}
																		}
																	}
																}

																var10 = var9 * 192; // L: 4150
																if (var10 > 98048) { // L: 4151
																	var10 = 98048;
																}

																if (var10 < 32768) { // L: 4152
																	var10 = 32768;
																}

																if (var10 > field562) { // L: 4153
																	field562 += (var10 - field562) / 24;
																} else if (var10 < field562) { // L: 4154
																	field562 += (var10 - field562) / 80;
																}

																MouseHandler.field231 = FaceNormal.getTileHeight(class340.localPlayer.x, class340.localPlayer.y, class20.Client_plane) - camFollowHeight; // L: 4155
															} else if (oculusOrbState == 1) { // L: 4157
																if (field612 && class340.localPlayer != null) { // L: 4159
																	var4 = class340.localPlayer.pathX[0]; // L: 4160
																	var5 = class340.localPlayer.pathY[0]; // L: 4161
																	if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 4162
																		class7.oculusOrbFocalPointX = class340.localPlayer.x; // L: 4163
																		var6 = FaceNormal.getTileHeight(class340.localPlayer.x, class340.localPlayer.y, class20.Client_plane) - camFollowHeight; // L: 4164
																		if (var6 < MouseHandler.field231) { // L: 4165
																			MouseHandler.field231 = var6;
																		}

																		Actor.oculusOrbFocalPointY = class340.localPlayer.y; // L: 4166
																		field612 = false; // L: 4167
																	}
																}

																short var36 = -1; // L: 4170
																if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 4171
																	var36 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 4172
																	var36 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 4173
																	if (var36 == 0) { // L: 4174
																		var36 = 1792;
																	} else if (var36 == 1024) { // L: 4175
																		var36 = 1280;
																	} else {
																		var36 = 1536; // L: 4176
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 4178
																	if (var36 == 0) { // L: 4179
																		var36 = 256;
																	} else if (var36 == 1024) { // L: 4180
																		var36 = 768;
																	} else {
																		var36 = 512; // L: 4181
																	}
																}

																byte var37 = 0; // L: 4183
																if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 4184
																	var37 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 4185
																	var37 = 1;
																}

																var6 = 0; // L: 4186
																if (var36 >= 0 || var37 != 0) { // L: 4187
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * 1403293651 * 97493083 : oculusOrbNormalSpeed * -535945653 * -682804381; // L: 4188
																	var6 *= 16; // L: 4189
																	field584 = var36; // L: 4190
																	field555 = var37; // L: 4191
																}

																if (field542 < var6) { // L: 4193
																	field542 += var6 / 8; // L: 4194
																	if (field542 > var6) { // L: 4195
																		field542 = var6;
																	}
																} else if (field542 > var6) { // L: 4197
																	field542 = field542 * 9 / 10;
																}

																if (field542 > 0) { // L: 4198
																	var7 = field542 / 16; // L: 4199
																	if (field584 >= 0) { // L: 4200
																		var4 = field584 - class379.cameraYaw & 2047; // L: 4201
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 4202
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 4203
																		class7.oculusOrbFocalPointX += var8 * var7 / 65536; // L: 4204
																		Actor.oculusOrbFocalPointY += var7 * var9 / 65536; // L: 4205
																	}

																	if (field555 != 0) { // L: 4207
																		MouseHandler.field231 += var7 * field555; // L: 4208
																		if (MouseHandler.field231 > 0) { // L: 4209
																			MouseHandler.field231 = 0;
																		}
																	}
																} else {
																	field584 = -1; // L: 4213
																	field555 = -1; // L: 4214
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 4216
																	packetWriter.addNode(HitSplatDefinition.getPacketBufferNode(ClientPacket.field2867, packetWriter.isaacCipher)); // L: 4218
																	oculusOrbState = 0; // L: 4219
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && class150.mouseCam) { // L: 4223
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY; // L: 4224
																camAngleDX = var4 * 2; // L: 4225
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * 84217699 * -688068021; // L: 4226
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 4227
																camAngleDY = var5 * 2; // L: 4228
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * 635129293 * -971872507; // L: 4229
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 4232
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 4233
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2; // L: 4234
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 4235
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 4236
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2; // L: 4237
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 4238
																mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 4239
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047; // L: 4241
															camAngleX += camAngleDX / 2; // L: 4242
															if (camAngleX < 128) { // L: 4243
																camAngleX = 128;
															}

															if (camAngleX > 383) { // L: 4244
																camAngleX = 383;
															}

															if (field724) { // L: 4246
																GrandExchangeOfferOwnWorldComparator.method1148();
															} else if (isCameraLocked) { // L: 4247
																var4 = class167.field1811 * 128 + 64; // L: 4248
																var5 = VarpDefinition.field1748 * 128 + 64; // L: 4249
																var6 = FaceNormal.getTileHeight(var4, var5, class20.Client_plane) - UserComparator9.field1335; // L: 4250
																class1.method12(var4, var6, var5); // L: 4251
																var4 = PlayerComposition.field3193 * 128 + 64; // L: 4252
																var5 = MusicPatchNode.field3150 * 128 + 64; // L: 4253
																var6 = FaceNormal.getTileHeight(var4, var5, class20.Client_plane) - ModeWhere.field3951; // L: 4254
																var7 = var4 - UserComparator7.cameraX; // L: 4255
																var8 = var6 - AbstractByteArrayCopier.cameraY; // L: 4256
																var9 = var5 - UserComparator10.cameraZ; // L: 4257
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 4258
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 4259
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 4260
																SecureRandomFuture.method2025(var11, var12); // L: 4261
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 4263
																var10002 = field729[var4]++;
															}

															class339.varcs.tryWrite(); // L: 4264
															var4 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 4267
															var6 = KeyHandler.KeyHandler_idleCycles; // L: 4272
															PacketBufferNode var27;
															if (var4 > 15000 && var6 > 15000) { // L: 4275
																logoutTimer = 250; // L: 4276
																class123.method2746(14500); // L: 4277
																var27 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2837, packetWriter.isaacCipher); // L: 4279
																packetWriter.addNode(var27); // L: 4280
															}

															GameEngine.friendSystem.processFriendUpdates(); // L: 4282
															++packetWriter.pendingWrites; // L: 4283
															if (packetWriter.pendingWrites > 50) { // L: 4284
																var27 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2814, packetWriter.isaacCipher); // L: 4286
																packetWriter.addNode(var27); // L: 4287
															}

															try {
																packetWriter.flush(); // L: 4290
															} catch (IOException var28) { // L: 4292
																Varcs.method2411(); // L: 4293
															}

															return; // L: 4295
														}

														var41 = var40.widget; // L: 4012
														if (var41.childIndex < 0) { // L: 4013
															break;
														}

														var39 = ChatChannel.getWidget(var41.parentId); // L: 4014
													} while(var39 == null || var39.children == null || var41.childIndex >= var39.children.length || var41 != var39.children[var41.childIndex]); // L: 4015

													class285.runScriptEvent(var40); // L: 4019
												}
											}

											var41 = var40.widget; // L: 4000
											if (var41.childIndex < 0) { // L: 4001
												break;
											}

											var39 = ChatChannel.getWidget(var41.parentId); // L: 4002
										} while(var39 == null || var39.children == null || var41.childIndex >= var39.children.length || var41 != var39.children[var41.childIndex]); // L: 4003

										class285.runScriptEvent(var40); // L: 4007
									}
								}

								var41 = var40.widget; // L: 3988
								if (var41.childIndex < 0) { // L: 3989
									break;
								}

								var39 = ChatChannel.getWidget(var41.parentId); // L: 3990
							} while(var39 == null || var39.children == null || var41.childIndex >= var39.children.length || var41 != var39.children[var41.childIndex]); // L: 3991

							class285.runScriptEvent(var40); // L: 3995
						}
					}

					var31 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2852, packetWriter.isaacCipher); // L: 3699
					var31.packetBuffer.writeByte(0); // L: 3700
					var3 = var31.packetBuffer.offset; // L: 3701
					UserComparator3.performReflectionCheck(var31.packetBuffer); // L: 3702
					var31.packetBuffer.method7357(var31.packetBuffer.offset - var3); // L: 3703
					packetWriter.addNode(var31); // L: 3704
				}
			}
		}
	} // L: 3681

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class186.canvasWidth; // L: 5000
		int var2 = BoundaryObject.canvasHeight; // L: 5001
		if (super.contentWidth < var1) { // L: 5002
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 5003
			var2 = super.contentHeight;
		}

		if (SecureRandomFuture.clientPreferences != null) { // L: 5004
			try {
				Client var3 = class295.client; // L: 5006
				Object[] var4 = new Object[]{class143.getWindowedMode()}; // L: 5007
				JSObject.getWindow(var3).call("resize", var4); // L: 5010
			} catch (Throwable var5) { // L: 5013
			}
		}

	} // L: 5015

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2013418749"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 5018
			GraphicsObject.method1955(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 5019
			if (field504[var1]) { // L: 5020
				field686[var1] = true;
			}

			field687[var1] = field504[var1]; // L: 5021
			field504[var1] = false; // L: 5022
		}

		field684 = cycle; // L: 5024
		viewportX = -1; // L: 5025
		viewportY = -1; // L: 5026
		FloorOverlayDefinition.hoveredItemContainer = null; // L: 5027
		if (rootInterface != -1) { // L: 5028
			rootWidgetCount = 0; // L: 5029
			class12.drawWidgets(rootInterface, 0, 0, class186.canvasWidth, BoundaryObject.canvasHeight, 0, 0, -1); // L: 5030
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 5032
		if (showMouseCross) { // L: 5033
			if (mouseCrossColor == 1) { // L: 5034
				UserComparator5.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 5035
			}

			if (mouseCrossColor == 2) { // L: 5037
				UserComparator5.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 5038
			}
		}

		if (!isMenuOpen) { // L: 5041
			if (viewportX != -1) { // L: 5042
				Friend.method6288(viewportX, viewportY);
			}
		} else {
			class4.method25(); // L: 5044
		}

		if (gameDrawingMode == 3) { // L: 5045
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 5046
				if (field687[var1]) { // L: 5047
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 5048
				} else if (field686[var1]) { // L: 5050
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 5051
				}
			}
		}

		var1 = class20.Client_plane; // L: 5055
		int var2 = class340.localPlayer.x; // L: 5056
		int var3 = class340.localPlayer.y; // L: 5057
		int var4 = field538; // L: 5058

		for (ObjectSound var5 = (ObjectSound)ObjectSound.objectSounds.last(); var5 != null; var5 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 5060
			if (var5.soundEffectId != -1 || var5.soundEffectIds != null) { // L: 5061
				int var6 = 0; // L: 5062
				if (var2 > var5.maxX) { // L: 5063
					var6 += var2 - var5.maxX;
				} else if (var2 < var5.x) { // L: 5064
					var6 += var5.x - var2;
				}

				if (var3 > var5.maxY) { // L: 5065
					var6 += var3 - var5.maxY;
				} else if (var3 < var5.y) { // L: 5066
					var6 += var5.y - var3;
				}

				if (var6 - 64 <= var5.field793 && SecureRandomFuture.clientPreferences.areaSoundEffectsVolume != 0 && var1 == var5.plane) { // L: 5067
					var6 -= 64; // L: 5078
					if (var6 < 0) { // L: 5079
						var6 = 0;
					}

					int var7 = (var5.field793 - var6) * SecureRandomFuture.clientPreferences.areaSoundEffectsVolume / var5.field793; // L: 5080
					Object var10000;
					if (var5.stream1 == null) { // L: 5081
						if (var5.soundEffectId >= 0) { // L: 5082
							var10000 = null; // L: 5083
							SoundEffect var8 = SoundEffect.readSoundEffect(KeyHandler.field151, var5.soundEffectId, 0);
							if (var8 != null) { // L: 5084
								RawSound var9 = var8.toRawSound().resample(BoundaryObject.decimator); // L: 5085
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7); // L: 5086
								var10.setNumLoops(-1); // L: 5087
								class281.pcmStreamMixer.addSubStream(var10); // L: 5088
								var5.stream1 = var10; // L: 5089
							}
						}
					} else {
						var5.stream1.method843(var7); // L: 5093
					}

					if (var5.stream2 == null) { // L: 5094
						if (var5.soundEffectIds != null && (var5.field789 -= var4) <= 0) { // L: 5095
							int var12 = (int)(Math.random() * (double)var5.soundEffectIds.length); // L: 5096
							var10000 = null; // L: 5097
							SoundEffect var13 = SoundEffect.readSoundEffect(KeyHandler.field151, var5.soundEffectIds[var12], 0);
							if (var13 != null) { // L: 5098
								RawSound var14 = var13.toRawSound().resample(BoundaryObject.decimator); // L: 5099
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7); // L: 5100
								var11.setNumLoops(0); // L: 5101
								class281.pcmStreamMixer.addSubStream(var11); // L: 5102
								var5.stream2 = var11; // L: 5103
								var5.field789 = var5.field796 + (int)(Math.random() * (double)(var5.field797 - var5.field796)); // L: 5104
							}
						}
					} else {
						var5.stream2.method843(var7); // L: 5109
						if (!var5.stream2.hasNext()) { // L: 5110
							var5.stream2 = null; // L: 5111
						}
					}
				} else {
					if (var5.stream1 != null) { // L: 5068
						class281.pcmStreamMixer.removeSubStream(var5.stream1); // L: 5069
						var5.stream1 = null; // L: 5070
					}

					if (var5.stream2 != null) { // L: 5072
						class281.pcmStreamMixer.removeSubStream(var5.stream2); // L: 5073
						var5.stream2 = null; // L: 5074
					}
				}
			}
		}

		field538 = 0; // L: 5116
	} // L: 5117

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)Z",
		garbageValue = "-1371711107"
	)
	final boolean method1394(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6472
		PacketBuffer var3 = var1.packetBuffer; // L: 6473
		if (var2 == null) { // L: 6474
			return false;
		} else {
			int var6;
			String var19;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6476
					if (var1.field1278) { // L: 6477
						if (!var2.isAvailable(1)) { // L: 6478
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6479
						var1.field1287 = 0; // L: 6480
						var1.field1278 = false; // L: 6481
					}

					var3.offset = 0; // L: 6483
					if (var3.method7311()) { // L: 6484
						if (!var2.isAvailable(1)) { // L: 6485
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6486
						var1.field1287 = 0; // L: 6487
					}

					var1.field1278 = true; // L: 6489
					ServerPacket[] var4 = class129.ServerPacket_values(); // L: 6490
					var5 = var3.readSmartByteShortIsaac(); // L: 6491
					if (var5 < 0 || var5 >= var4.length) { // L: 6492
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6493
					var1.serverPacketLength = var1.serverPacket.length; // L: 6494
				}

				if (var1.serverPacketLength == -1) { // L: 6496
					if (!var2.isAvailable(1)) { // L: 6497
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6498
					var1.serverPacketLength = var3.array[0] & 255; // L: 6499
				}

				if (var1.serverPacketLength == -2) { // L: 6501
					if (!var2.isAvailable(2)) { // L: 6502
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6503
					var3.offset = 0; // L: 6504
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6505
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6507
					return false;
				}

				var3.offset = 0; // L: 6508
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6509
				var1.field1287 = 0; // L: 6510
				timer.method6253(); // L: 6511
				var1.field1291 = var1.field1290; // L: 6512
				var1.field1290 = var1.field1289; // L: 6513
				var1.field1289 = var1.serverPacket; // L: 6514
				int var7;
				int var17;
				Widget var52;
				if (ServerPacket.field2978 == var1.serverPacket) { // L: 6515
					var17 = var3.method7403(); // L: 6516
					var5 = var3.method7411(); // L: 6517
					var6 = var3.readUnsignedShort(); // L: 6518
					var7 = var3.method7403(); // L: 6519
					var52 = ChatChannel.getWidget(var5); // L: 6520
					if (var17 != var52.modelAngleX || var6 != var52.modelAngleY || var7 != var52.modelZoom) { // L: 6521
						var52.modelAngleX = var17; // L: 6522
						var52.modelAngleY = var6; // L: 6523
						var52.modelZoom = var7; // L: 6524
						SecureRandomCallable.invalidateWidget(var52); // L: 6525
					}

					var1.serverPacket = null; // L: 6527
					return true; // L: 6528
				}

				if (ServerPacket.field3011 == var1.serverPacket) { // L: 6530
					var17 = var3.readUnsignedShort(); // L: 6531
					var5 = var3.readUnsignedByte(); // L: 6532
					var6 = var3.readUnsignedShort(); // L: 6533
					LoginScreenAnimation.queueSoundEffect(var17, var5, var6); // L: 6534
					var1.serverPacket = null; // L: 6535
					return true; // L: 6536
				}

				Widget var18;
				if (ServerPacket.field2952 == var1.serverPacket) { // L: 6538
					var17 = var3.method7411(); // L: 6539
					var5 = var3.readShort(); // L: 6540
					var18 = ChatChannel.getWidget(var17); // L: 6541
					if (var5 != var18.sequenceId || var5 == -1) { // L: 6542
						var18.sequenceId = var5; // L: 6543
						var18.modelFrame = 0; // L: 6544
						var18.modelFrameCycle = 0; // L: 6545
						SecureRandomCallable.invalidateWidget(var18); // L: 6546
					}

					var1.serverPacket = null; // L: 6548
					return true; // L: 6549
				}

				if (ServerPacket.field2972 == var1.serverPacket) { // L: 6551
					DirectByteArrayCopier.method5328(class253.field2915); // L: 6552
					var1.serverPacket = null; // L: 6553
					return true; // L: 6554
				}

				if (ServerPacket.field3002 == var1.serverPacket) { // L: 6556
					if (BuddyRankComparator.field1342 == null) { // L: 6557
						BuddyRankComparator.field1342 = new class370(Ignored.HitSplatDefinition_cached);
					}

					class426 var49 = Ignored.HitSplatDefinition_cached.method6761(var3); // L: 6558
					BuddyRankComparator.field1342.field4221.vmethod7129(var49.field4539, var49.field4537); // L: 6559
					field695[++field734 - 1 & 31] = var49.field4539; // L: 6560
					var1.serverPacket = null; // L: 6561
					return true; // L: 6562
				}

				int var15;
				String var24;
				byte var68;
				if (ServerPacket.field3005 == var1.serverPacket) { // L: 6564
					var68 = var3.readByte(); // L: 6565
					var19 = var3.readStringCp1252NullTerminated(); // L: 6566
					long var20 = (long)var3.readUnsignedShort(); // L: 6567
					long var22 = (long)var3.readMedium(); // L: 6568
					PlayerType var55 = (PlayerType)class130.findEnumerated(SpotAnimationDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 6569
					long var11 = (var20 << 32) + var22; // L: 6570
					boolean var56 = false; // L: 6571
					ClanChannel var14 = null; // L: 6572
					var14 = var68 >= 0 ? currentClanChannels[var68] : UserComparator5.guestClanChannel; // L: 6574
					if (var14 == null) { // L: 6575
						var56 = true; // L: 6576
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var55.isUser && GameEngine.friendSystem.isIgnored(new Username(var19, class194.loginType))) { // L: 6585 6586
									var56 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var11) { // L: 6580
								var56 = true; // L: 6581
								break; // L: 6582
							}

							++var15; // L: 6579
						}
					}

					if (!var56) { // L: 6589
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11; // L: 6590
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6591
						var24 = AbstractFont.escapeBrackets(SequenceDefinition.method3689(var3)); // L: 6592
						int var16 = var68 >= 0 ? 41 : 44; // L: 6593
						if (var55.modIcon != -1) { // L: 6594
							DevicePcmPlayerProvider.addChatMessage(var16, class221.method4705(var55.modIcon) + var19, var24, var14.name);
						} else {
							DevicePcmPlayerProvider.addChatMessage(var16, var19, var24, var14.name); // L: 6595
						}
					}

					var1.serverPacket = null; // L: 6597
					return true; // L: 6598
				}

				String var45;
				if (ServerPacket.field3001 == var1.serverPacket) { // L: 6600
					var45 = var3.readStringCp1252NullTerminated(); // L: 6601
					Object[] var67 = new Object[var45.length() + 1]; // L: 6602

					for (var6 = var45.length() - 1; var6 >= 0; --var6) { // L: 6603
						if (var45.charAt(var6) == 's') { // L: 6604
							var67[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var67[var6 + 1] = new Integer(var3.readInt()); // L: 6605
						}
					}

					var67[0] = new Integer(var3.readInt()); // L: 6607
					ScriptEvent var72 = new ScriptEvent(); // L: 6608
					var72.args = var67; // L: 6609
					class285.runScriptEvent(var72); // L: 6610
					var1.serverPacket = null; // L: 6611
					return true; // L: 6612
				}

				if (ServerPacket.field2980 == var1.serverPacket) { // L: 6614
					UserComparator6.method2551(); // L: 6615
					weight = var3.readShort(); // L: 6616
					field471 = cycleCntr; // L: 6617
					var1.serverPacket = null; // L: 6618
					return true; // L: 6619
				}

				if (ServerPacket.field3023 == var1.serverPacket) { // L: 6621
					destinationX = var3.readUnsignedByte(); // L: 6622
					if (destinationX == 255) { // L: 6623
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6624
					if (destinationY == 255) { // L: 6625
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6626
					return true; // L: 6627
				}

				if (ServerPacket.field2930 == var1.serverPacket) { // L: 6629
					var17 = var3.readInt(); // L: 6630
					var5 = var3.readInt(); // L: 6631
					var6 = class143.getGcDuration(); // L: 6632
					PacketBufferNode var73 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2890, packetWriter.isaacCipher); // L: 6634
					var73.packetBuffer.writeByte(GameEngine.fps); // L: 6635
					var73.packetBuffer.method7343(var6); // L: 6636
					var73.packetBuffer.method7407(var17); // L: 6637
					var73.packetBuffer.writeIntME(var5); // L: 6638
					packetWriter.addNode(var73); // L: 6639
					var1.serverPacket = null; // L: 6640
					return true; // L: 6641
				}

				if (ServerPacket.field2955 == var1.serverPacket) { // L: 6643
					if (Players.friendsChat != null) { // L: 6644
						Players.friendsChat.method6305(var3); // L: 6645
					}

					class334.method6216(); // L: 6647
					var1.serverPacket = null; // L: 6648
					return true; // L: 6649
				}

				Widget var25;
				if (ServerPacket.field2960 == var1.serverPacket) { // L: 6651
					var17 = var3.readShort(); // L: 6652
					var5 = var3.readInt(); // L: 6653
					var6 = var3.method7405(); // L: 6654
					var25 = ChatChannel.getWidget(var5); // L: 6655
					if (var17 != var25.rawX || var6 != var25.rawY || var25.xAlignment != 0 || var25.yAlignment != 0) { // L: 6656
						var25.rawX = var17; // L: 6657
						var25.rawY = var6; // L: 6658
						var25.xAlignment = 0; // L: 6659
						var25.yAlignment = 0; // L: 6660
						SecureRandomCallable.invalidateWidget(var25); // L: 6661
						this.alignWidget(var25); // L: 6662
						if (var25.type == 0) { // L: 6663
							class115.revalidateWidgetScroll(MouseRecorder.Widget_interfaceComponents[var5 >> 16], var25, false);
						}
					}

					var1.serverPacket = null; // L: 6665
					return true; // L: 6666
				}

				if (ServerPacket.field2996 == var1.serverPacket) { // L: 6668
					DirectByteArrayCopier.method5328(class253.field2918); // L: 6669
					var1.serverPacket = null; // L: 6670
					return true; // L: 6671
				}

				if (ServerPacket.field2998 == var1.serverPacket) { // L: 6673
					BuddyRankComparator.field1342 = null; // L: 6674
					var1.serverPacket = null; // L: 6675
					return true; // L: 6676
				}

				int var9;
				long var12;
				int var26;
				int var27;
				InterfaceParent var71;
				if (ServerPacket.field3021 == var1.serverPacket) { // L: 6678
					var17 = var3.offset + var1.serverPacketLength; // L: 6679
					var5 = var3.readUnsignedShort(); // L: 6680
					var6 = var3.readUnsignedShort(); // L: 6681
					if (var5 != rootInterface) { // L: 6682
						rootInterface = var5; // L: 6683
						this.resizeRoot(false); // L: 6684
						class140.Widget_resetModelFrames(rootInterface); // L: 6685
						class33.runWidgetOnLoadListener(rootInterface); // L: 6686

						for (var7 = 0; var7 < 100; ++var7) { // L: 6687
							field504[var7] = true;
						}
					}

					InterfaceParent var54;
					for (; var6-- > 0; var54.field1014 = true) { // L: 6689 6699
						var7 = var3.readInt(); // L: 6690
						var26 = var3.readUnsignedShort(); // L: 6691
						var9 = var3.readUnsignedByte(); // L: 6692
						var54 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6693
						if (var54 != null && var26 != var54.group) { // L: 6694
							class10.closeInterface(var54, true); // L: 6695
							var54 = null; // L: 6696
						}

						if (var54 == null) { // L: 6698
							var54 = ChatChannel.method2058(var7, var26, var9);
						}
					}

					for (var71 = (InterfaceParent)interfaceParents.first(); var71 != null; var71 = (InterfaceParent)interfaceParents.next()) { // L: 6701
						if (var71.field1014) { // L: 6702
							var71.field1014 = false;
						} else {
							class10.closeInterface(var71, true); // L: 6704
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6707

					while (var3.offset < var17) { // L: 6708
						var7 = var3.readInt(); // L: 6709
						var26 = var3.readUnsignedShort(); // L: 6710
						var9 = var3.readUnsignedShort(); // L: 6711
						var27 = var3.readInt(); // L: 6712

						for (int var74 = var26; var74 <= var9; ++var74) { // L: 6713
							var12 = (long)var74 + ((long)var7 << 32); // L: 6714
							widgetFlags.put(new IntegerNode(var27), var12); // L: 6715
						}
					}

					var1.serverPacket = null; // L: 6718
					return true; // L: 6719
				}

				if (ServerPacket.field3018 == var1.serverPacket) { // L: 6721
					var17 = var3.readInt(); // L: 6722
					var5 = var3.readUnsignedShort(); // L: 6723
					if (var17 < -70000) { // L: 6724
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6726
						var18 = ChatChannel.getWidget(var17);
					} else {
						var18 = null; // L: 6727
					}

					if (var18 != null) { // L: 6728
						for (var7 = 0; var7 < var18.itemIds.length; ++var7) { // L: 6729
							var18.itemIds[var7] = 0; // L: 6730
							var18.itemQuantities[var7] = 0; // L: 6731
						}
					}

					class141.clearItemContainer(var5); // L: 6734
					var7 = var3.readUnsignedShort(); // L: 6735

					for (var26 = 0; var26 < var7; ++var26) { // L: 6736
						var9 = var3.method7392(); // L: 6737
						if (var9 == 255) { // L: 6738
							var9 = var3.readInt();
						}

						var27 = var3.method7401(); // L: 6739
						if (var18 != null && var26 < var18.itemIds.length) { // L: 6740 6741
							var18.itemIds[var26] = var27; // L: 6742
							var18.itemQuantities[var26] = var9; // L: 6743
						}

						GraphicsObject.itemContainerSetItem(var5, var26, var27 - 1, var9); // L: 6746
					}

					if (var18 != null) { // L: 6748
						SecureRandomCallable.invalidateWidget(var18);
					}

					UserComparator6.method2551(); // L: 6749
					changedItemContainers[++field665 - 1 & 31] = var5 & 32767; // L: 6750
					var1.serverPacket = null; // L: 6751
					return true; // L: 6752
				}

				if (ServerPacket.field2944 == var1.serverPacket) { // L: 6754
					var17 = var3.readUnsignedByte(); // L: 6755
					VarpDefinition.method3168(var17); // L: 6756
					var1.serverPacket = null; // L: 6757
					return true; // L: 6758
				}

				if (ServerPacket.field3027 == var1.serverPacket && isCameraLocked) { // L: 6760 6761
					field724 = true; // L: 6762
					Renderable.field2358 = var3.readUnsignedByte(); // L: 6763
					ItemComposition.field2012 = var3.readUnsignedByte(); // L: 6764
					WorldMapSection1.field2755 = var3.readUnsignedByte(); // L: 6765
					ChatChannel.field956 = var3.readUnsignedByte(); // L: 6766

					for (var17 = 0; var17 < 5; ++var17) { // L: 6767
						field725[var17] = false;
					}

					var1.serverPacket = null; // L: 6768
					return true; // L: 6769
				}

				if (ServerPacket.field2949 == var1.serverPacket) { // L: 6772
					World var48 = new World(); // L: 6773
					var48.host = var3.readStringCp1252NullTerminated(); // L: 6774
					var48.id = var3.readUnsignedShort(); // L: 6775
					var5 = var3.readInt(); // L: 6776
					var48.properties = var5; // L: 6777
					VertexNormal.updateGameState(45); // L: 6778
					var2.close(); // L: 6779
					var2 = null; // L: 6780
					BoundaryObject.changeWorld(var48); // L: 6781
					var1.serverPacket = null; // L: 6782
					return false; // L: 6783
				}

				if (ServerPacket.field2984 == var1.serverPacket) { // L: 6785
					DevicePcmPlayerProvider.loadRegions(false, var1.packetBuffer); // L: 6786
					var1.serverPacket = null; // L: 6787
					return true; // L: 6788
				}

				if (ServerPacket.field2940 == var1.serverPacket) { // L: 6790
					field583 = cycleCntr; // L: 6791
					var68 = var3.readByte(); // L: 6792
					class143 var65 = new class143(var3); // L: 6793
					ClanChannel var70;
					if (var68 >= 0) { // L: 6795
						var70 = currentClanChannels[var68];
					} else {
						var70 = UserComparator5.guestClanChannel; // L: 6796
					}

					var65.method2960(var70); // L: 6797
					var1.serverPacket = null; // L: 6798
					return true; // L: 6799
				}

				if (ServerPacket.field2938 == var1.serverPacket) { // L: 6801
					var17 = var3.readUnsignedShort(); // L: 6802
					rootInterface = var17; // L: 6803
					this.resizeRoot(false); // L: 6804
					class140.Widget_resetModelFrames(var17); // L: 6805
					class33.runWidgetOnLoadListener(rootInterface); // L: 6806

					for (var5 = 0; var5 < 100; ++var5) { // L: 6807
						field504[var5] = true;
					}

					var1.serverPacket = null; // L: 6808
					return true; // L: 6809
				}

				if (ServerPacket.field3029 == var1.serverPacket) { // L: 6811
					var17 = var3.readInt(); // L: 6812
					var5 = var3.readInt(); // L: 6813
					InterfaceParent var69 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6814
					var71 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6815
					if (var71 != null) { // L: 6816
						class10.closeInterface(var71, var69 == null || var71.group != var69.group);
					}

					if (var69 != null) { // L: 6817
						var69.remove(); // L: 6818
						interfaceParents.put(var69, (long)var5); // L: 6819
					}

					var52 = ChatChannel.getWidget(var17); // L: 6821
					if (var52 != null) { // L: 6822
						SecureRandomCallable.invalidateWidget(var52);
					}

					var52 = ChatChannel.getWidget(var5); // L: 6823
					if (var52 != null) { // L: 6824
						SecureRandomCallable.invalidateWidget(var52); // L: 6825
						class115.revalidateWidgetScroll(MouseRecorder.Widget_interfaceComponents[var52.id >>> 16], var52, true); // L: 6826
					}

					if (rootInterface != -1) { // L: 6828
						Message.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6829
					return true; // L: 6830
				}

				if (ServerPacket.field2937 == var1.serverPacket) { // L: 6832
					DirectByteArrayCopier.method5328(class253.field2919); // L: 6833
					var1.serverPacket = null; // L: 6834
					return true; // L: 6835
				}

				if (ServerPacket.field2934 == var1.serverPacket) { // L: 6837
					if (var1.serverPacketLength == 0) { // L: 6838
						Players.friendsChat = null; // L: 6839
					} else {
						if (Players.friendsChat == null) { // L: 6842
							Players.friendsChat = new FriendsChat(class194.loginType, class295.client); // L: 6843
						}

						Players.friendsChat.readUpdate(var3); // L: 6845
					}

					class334.method6216(); // L: 6847
					var1.serverPacket = null; // L: 6848
					return true; // L: 6849
				}

				if (ServerPacket.field2989 == var1.serverPacket) { // L: 6851
					UserComparator6.method2551(); // L: 6852
					runEnergy = var3.readUnsignedByte(); // L: 6853
					field471 = cycleCntr; // L: 6854
					var1.serverPacket = null; // L: 6855
					return true; // L: 6856
				}

				if (ServerPacket.field2961 == var1.serverPacket) { // L: 6858
					for (var17 = 0; var17 < class433.VarpDefinition_fileCount; ++var17) { // L: 6859
						VarpDefinition var64 = SecureRandomCallable.VarpDefinition_get(var17); // L: 6860
						if (var64 != null) { // L: 6861
							Varps.Varps_temp[var17] = 0; // L: 6862
							Varps.Varps_main[var17] = 0; // L: 6863
						}
					}

					UserComparator6.method2551(); // L: 6866
					changedVarpCount += 32; // L: 6867
					var1.serverPacket = null; // L: 6868
					return true; // L: 6869
				}

				if (ServerPacket.field2982 == var1.serverPacket) { // L: 6871
					DirectByteArrayCopier.method5328(class253.field2913); // L: 6872
					var1.serverPacket = null; // L: 6873
					return true; // L: 6874
				}

				if (ServerPacket.field3016 == var1.serverPacket) { // L: 6876
					class167.field1813 = var3.method7520(); // L: 6877
					class17.field90 = var3.readUnsignedByte(); // L: 6878

					while (var3.offset < var1.serverPacketLength) { // L: 6879
						var17 = var3.readUnsignedByte(); // L: 6880
						class253 var63 = Timer.method6230()[var17]; // L: 6881
						DirectByteArrayCopier.method5328(var63); // L: 6882
					}

					var1.serverPacket = null; // L: 6884
					return true; // L: 6885
				}

				if (ServerPacket.field2991 == var1.serverPacket) { // L: 6887
					DirectByteArrayCopier.method5328(class253.field2914); // L: 6888
					var1.serverPacket = null; // L: 6889
					return true; // L: 6890
				}

				long var29;
				long var31;
				long var33;
				if (ServerPacket.field2931 == var1.serverPacket) { // L: 6892
					var45 = var3.readStringCp1252NullTerminated(); // L: 6893
					var29 = var3.readLong(); // L: 6894
					var31 = (long)var3.readUnsignedShort(); // L: 6895
					var33 = (long)var3.readMedium(); // L: 6896
					PlayerType var75 = (PlayerType)class130.findEnumerated(SpotAnimationDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 6897
					var12 = var33 + (var31 << 32); // L: 6898
					boolean var77 = false; // L: 6899

					for (var15 = 0; var15 < 100; ++var15) { // L: 6900
						if (var12 == crossWorldMessageIds[var15]) { // L: 6901
							var77 = true; // L: 6902
							break; // L: 6903
						}
					}

					if (var75.isUser && GameEngine.friendSystem.isIgnored(new Username(var45, class194.loginType))) { // L: 6906 6907
						var77 = true;
					}

					if (!var77 && field590 == 0) { // L: 6909
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var12; // L: 6910
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6911
						var24 = AbstractFont.escapeBrackets(class412.method7287(SequenceDefinition.method3689(var3))); // L: 6912
						if (var75.modIcon != -1) { // L: 6913
							DevicePcmPlayerProvider.addChatMessage(9, class221.method4705(var75.modIcon) + var45, var24, GraphicsDefaults.base37DecodeLong(var29));
						} else {
							DevicePcmPlayerProvider.addChatMessage(9, var45, var24, GraphicsDefaults.base37DecodeLong(var29)); // L: 6914
						}
					}

					var1.serverPacket = null; // L: 6916
					return true; // L: 6917
				}

				boolean var66;
				if (ServerPacket.field3017 == var1.serverPacket) { // L: 6919
					var66 = var3.readUnsignedByte() == 1; // L: 6920
					var5 = var3.method7411(); // L: 6921
					var18 = ChatChannel.getWidget(var5); // L: 6922
					if (var66 != var18.isHidden) { // L: 6923
						var18.isHidden = var66; // L: 6924
						SecureRandomCallable.invalidateWidget(var18); // L: 6925
					}

					var1.serverPacket = null; // L: 6927
					return true; // L: 6928
				}

				if (ServerPacket.field2965 == var1.serverPacket) { // L: 6930
					isCameraLocked = false; // L: 6931

					for (var17 = 0; var17 < 5; ++var17) { // L: 6932
						field725[var17] = false;
					}

					var1.serverPacket = null; // L: 6933
					return true; // L: 6934
				}

				if (ServerPacket.field2986 == var1.serverPacket) { // L: 6936
					if (rootInterface != -1) { // L: 6937
						Message.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6938
					return true; // L: 6939
				}

				if (ServerPacket.field3000 == var1.serverPacket) { // L: 6941
					DirectByteArrayCopier.method5328(class253.field2912); // L: 6942
					var1.serverPacket = null; // L: 6943
					return true; // L: 6944
				}

				if (ServerPacket.field2948 == var1.serverPacket) { // L: 6946
					DirectByteArrayCopier.method5328(class253.field2916); // L: 6947
					var1.serverPacket = null; // L: 6948
					return true; // L: 6949
				}

				if (ServerPacket.field3004 == var1.serverPacket) { // L: 6951
					GrandExchangeOfferOwnWorldComparator.updateNpcs(false, var3); // L: 6952
					var1.serverPacket = null; // L: 6953
					return true; // L: 6954
				}

				if (ServerPacket.field2968 == var1.serverPacket) { // L: 6956
					GameEngine.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6957
					field671 = cycleCntr; // L: 6958
					var1.serverPacket = null; // L: 6959
					return true; // L: 6960
				}

				if (ServerPacket.field2957 == var1.serverPacket) { // L: 6962
					var17 = var3.method7401(); // L: 6963
					var5 = var3.method7411(); // L: 6964
					var18 = ChatChannel.getWidget(var5); // L: 6965
					if (var18 != null && var18.type == 0) { // L: 6966
						if (var17 > var18.scrollHeight - var18.height) { // L: 6967
							var17 = var18.scrollHeight - var18.height;
						}

						if (var17 < 0) { // L: 6968
							var17 = 0;
						}

						if (var17 != var18.scrollY) { // L: 6969
							var18.scrollY = var17; // L: 6970
							SecureRandomCallable.invalidateWidget(var18); // L: 6971
						}
					}

					var1.serverPacket = null; // L: 6974
					return true; // L: 6975
				}

				if (ServerPacket.field2994 == var1.serverPacket) { // L: 6977
					DirectByteArrayCopier.method5328(class253.field2920); // L: 6978
					var1.serverPacket = null; // L: 6979
					return true; // L: 6980
				}

				if (ServerPacket.field3026 == var1.serverPacket) { // L: 6982
					GameEngine.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6983
					Skeleton.FriendSystem_invalidateIgnoreds(); // L: 6984
					field671 = cycleCntr; // L: 6985
					var1.serverPacket = null; // L: 6986
					return true; // L: 6987
				}

				if (ServerPacket.field2970 == var1.serverPacket) { // L: 6989
					var17 = var3.readInt(); // L: 6990
					var5 = var3.readUnsignedShort(); // L: 6991
					if (var17 < -70000) { // L: 6992
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6994
						var18 = ChatChannel.getWidget(var17);
					} else {
						var18 = null; // L: 6995
					}

					for (; var3.offset < var1.serverPacketLength; GraphicsObject.itemContainerSetItem(var5, var7, var26 - 1, var9)) { // L: 6996 7010
						var7 = var3.readUShortSmart(); // L: 6997
						var26 = var3.readUnsignedShort(); // L: 6998
						var9 = 0; // L: 6999
						if (var26 != 0) { // L: 7000
							var9 = var3.readUnsignedByte(); // L: 7001
							if (var9 == 255) { // L: 7002
								var9 = var3.readInt();
							}
						}

						if (var18 != null && var7 >= 0 && var7 < var18.itemIds.length) { // L: 7004 7005
							var18.itemIds[var7] = var26; // L: 7006
							var18.itemQuantities[var7] = var9; // L: 7007
						}
					}

					if (var18 != null) { // L: 7012
						SecureRandomCallable.invalidateWidget(var18);
					}

					UserComparator6.method2551(); // L: 7013
					changedItemContainers[++field665 - 1 & 31] = var5 & 32767; // L: 7014
					var1.serverPacket = null; // L: 7015
					return true; // L: 7016
				}

				if (ServerPacket.field2942 == var1.serverPacket) { // L: 7018
					isCameraLocked = true; // L: 7019
					field724 = false; // L: 7020
					PlayerComposition.field3193 = var3.readUnsignedByte(); // L: 7021
					MusicPatchNode.field3150 = var3.readUnsignedByte(); // L: 7022
					ModeWhere.field3951 = var3.readUnsignedShort(); // L: 7023
					WorldMapSection1.field2755 = var3.readUnsignedByte(); // L: 7024
					ChatChannel.field956 = var3.readUnsignedByte(); // L: 7025
					if (ChatChannel.field956 >= 100) { // L: 7026
						var17 = PlayerComposition.field3193 * 128 + 64; // L: 7027
						var5 = MusicPatchNode.field3150 * 128 + 64; // L: 7028
						var6 = FaceNormal.getTileHeight(var17, var5, class20.Client_plane) - ModeWhere.field3951; // L: 7029
						var7 = var17 - UserComparator7.cameraX; // L: 7030
						var26 = var6 - AbstractByteArrayCopier.cameraY; // L: 7031
						var9 = var5 - UserComparator10.cameraZ; // L: 7032
						var27 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 7033
						UserComparator7.cameraPitch = (int)(Math.atan2((double)var26, (double)var27) * 325.9490051269531D) & 2047; // L: 7034
						class379.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 7035
						if (UserComparator7.cameraPitch < 128) { // L: 7036
							UserComparator7.cameraPitch = 128;
						}

						if (UserComparator7.cameraPitch > 383) { // L: 7037
							UserComparator7.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7039
					return true; // L: 7040
				}

				if (ServerPacket.field3007 == var1.serverPacket) { // L: 7042
					isCameraLocked = true; // L: 7043
					field724 = false; // L: 7044
					class167.field1811 = var3.readUnsignedByte(); // L: 7045
					VarpDefinition.field1748 = var3.readUnsignedByte(); // L: 7046
					UserComparator9.field1335 = var3.readUnsignedShort(); // L: 7047
					Renderable.field2358 = var3.readUnsignedByte(); // L: 7048
					ItemComposition.field2012 = var3.readUnsignedByte(); // L: 7049
					if (ItemComposition.field2012 >= 100) { // L: 7050
						UserComparator7.cameraX = class167.field1811 * 128 + 64; // L: 7051
						UserComparator10.cameraZ = VarpDefinition.field1748 * 128 + 64; // L: 7052
						AbstractByteArrayCopier.cameraY = FaceNormal.getTileHeight(UserComparator7.cameraX, UserComparator10.cameraZ, class20.Client_plane) - UserComparator9.field1335; // L: 7053
					}

					var1.serverPacket = null; // L: 7055
					return true; // L: 7056
				}

				if (ServerPacket.field2983 == var1.serverPacket) { // L: 7058
					var17 = var3.method7401(); // L: 7059
					var5 = var3.method7394(); // L: 7060
					var6 = var3.readInt(); // L: 7061
					var71 = (InterfaceParent)interfaceParents.get((long)var6); // L: 7062
					if (var71 != null) { // L: 7063
						class10.closeInterface(var71, var17 != var71.group);
					}

					ChatChannel.method2058(var6, var17, var5); // L: 7064
					var1.serverPacket = null; // L: 7065
					return true; // L: 7066
				}

				if (ServerPacket.field3020 == var1.serverPacket) { // L: 7068
					class12.field72 = true; // L: 7069
					GrandExchangeOfferOwnWorldComparator.updateNpcs(true, var3); // L: 7070
					var1.serverPacket = null; // L: 7071
					return true; // L: 7072
				}

				if (ServerPacket.field2990 == var1.serverPacket) { // L: 7074
					var17 = var3.readUnsignedByte(); // L: 7075
					if (var3.readUnsignedByte() == 0) { // L: 7076
						grandExchangeOffers[var17] = new GrandExchangeOffer(); // L: 7077
						var3.offset += 18; // L: 7078
					} else {
						--var3.offset; // L: 7081
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false); // L: 7082
					}

					field675 = cycleCntr; // L: 7084
					var1.serverPacket = null; // L: 7085
					return true; // L: 7086
				}

				if (ServerPacket.field2951 == var1.serverPacket) { // L: 7088
					Strings.method5509(); // L: 7089
					var68 = var3.readByte(); // L: 7090
					if (var1.serverPacketLength == 1) { // L: 7091
						if (var68 >= 0) { // L: 7092
							currentClanSettings[var68] = null;
						} else {
							class222.guestClanSettings = null; // L: 7093
						}

						var1.serverPacket = null; // L: 7094
						return true; // L: 7095
					}

					if (var68 >= 0) { // L: 7097
						currentClanSettings[var68] = new ClanSettings(var3); // L: 7098
					} else {
						class222.guestClanSettings = new ClanSettings(var3); // L: 7101
					}

					var1.serverPacket = null; // L: 7103
					return true; // L: 7104
				}

				if (ServerPacket.field2993 == var1.serverPacket) { // L: 7106
					Strings.method5509(); // L: 7107
					var68 = var3.readByte(); // L: 7108
					class129 var61 = new class129(var3); // L: 7109
					ClanSettings var62;
					if (var68 >= 0) { // L: 7111
						var62 = currentClanSettings[var68];
					} else {
						var62 = class222.guestClanSettings; // L: 7112
					}

					var61.method2781(var62); // L: 7113
					var1.serverPacket = null; // L: 7114
					return true; // L: 7115
				}

				if (ServerPacket.field2939 == var1.serverPacket) { // L: 7117
					class167.field1813 = var3.readUnsignedByte(); // L: 7118
					class17.field90 = var3.method7394(); // L: 7119
					var1.serverPacket = null; // L: 7120
					return true; // L: 7121
				}

				if (ServerPacket.field2973 == var1.serverPacket) { // L: 7123
					DevicePcmPlayerProvider.loadRegions(true, var1.packetBuffer); // L: 7124
					var1.serverPacket = null; // L: 7125
					return true; // L: 7126
				}

				if (ServerPacket.field2932 == var1.serverPacket) { // L: 7128
					hintArrowType = var3.readUnsignedByte(); // L: 7129
					if (hintArrowType == 1) { // L: 7130
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7131
						if (hintArrowType == 2) { // L: 7132
							hintArrowSubX = 64; // L: 7133
							hintArrowSubY = 64; // L: 7134
						}

						if (hintArrowType == 3) { // L: 7136
							hintArrowSubX = 0; // L: 7137
							hintArrowSubY = 64; // L: 7138
						}

						if (hintArrowType == 4) { // L: 7140
							hintArrowSubX = 128; // L: 7141
							hintArrowSubY = 64; // L: 7142
						}

						if (hintArrowType == 5) { // L: 7144
							hintArrowSubX = 64; // L: 7145
							hintArrowSubY = 0; // L: 7146
						}

						if (hintArrowType == 6) { // L: 7148
							hintArrowSubX = 64; // L: 7149
							hintArrowSubY = 128; // L: 7150
						}

						hintArrowType = 2; // L: 7152
						hintArrowX = var3.readUnsignedShort(); // L: 7153
						hintArrowY = var3.readUnsignedShort(); // L: 7154
						hintArrowHeight = var3.readUnsignedByte(); // L: 7155
					}

					if (hintArrowType == 10) { // L: 7157
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7158
					return true; // L: 7159
				}

				if (ServerPacket.field2935 == var1.serverPacket) { // L: 7161
					var17 = var3.method7412(); // L: 7162
					var5 = var3.method7411(); // L: 7163
					var6 = var3.method7401(); // L: 7164
					if (var6 == 65535) { // L: 7165
						var6 = -1;
					}

					var25 = ChatChannel.getWidget(var5); // L: 7166
					ItemComposition var51;
					if (!var25.isIf3) { // L: 7167
						if (var6 == -1) { // L: 7168
							var25.modelType = 0; // L: 7169
							var1.serverPacket = null; // L: 7170
							return true; // L: 7171
						}

						var51 = UserComparator6.ItemDefinition_get(var6); // L: 7173
						var25.modelType = 4; // L: 7174
						var25.modelId = var6; // L: 7175
						var25.modelAngleX = var51.xan2d; // L: 7176
						var25.modelAngleY = var51.yan2d; // L: 7177
						var25.modelZoom = var51.zoom2d * 100 / var17; // L: 7178
						SecureRandomCallable.invalidateWidget(var25); // L: 7179
					} else {
						var25.itemId = var6; // L: 7182
						var25.itemQuantity = var17; // L: 7183
						var51 = UserComparator6.ItemDefinition_get(var6); // L: 7184
						var25.modelAngleX = var51.xan2d; // L: 7185
						var25.modelAngleY = var51.yan2d; // L: 7186
						var25.modelAngleZ = var51.zan2d; // L: 7187
						var25.modelOffsetX = var51.offsetX2d; // L: 7188
						var25.modelOffsetY = var51.offsetY2d; // L: 7189
						var25.modelZoom = var51.zoom2d; // L: 7190
						if (var51.isStackable == 1) { // L: 7191
							var25.itemQuantityMode = 1;
						} else {
							var25.itemQuantityMode = 2; // L: 7192
						}

						if (var25.field3280 > 0) { // L: 7193
							var25.modelZoom = var25.modelZoom * 32 / var25.field3280;
						} else if (var25.rawWidth > 0) { // L: 7194
							var25.modelZoom = var25.modelZoom * 32 / var25.rawWidth;
						}

						SecureRandomCallable.invalidateWidget(var25); // L: 7195
					}

					var1.serverPacket = null; // L: 7197
					return true; // L: 7198
				}

				if (ServerPacket.field2988 == var1.serverPacket) { // L: 7200
					var17 = var3.method7412(); // L: 7201
					var5 = var3.method7401(); // L: 7202
					if (var5 == 65535) { // L: 7203
						var5 = -1;
					}

					var6 = var3.method7401(); // L: 7204
					if (var6 == 65535) { // L: 7205
						var6 = -1;
					}

					var7 = var3.readInt(); // L: 7206

					for (var26 = var5; var26 <= var6; ++var26) { // L: 7207
						var33 = ((long)var7 << 32) + (long)var26; // L: 7208
						Node var35 = widgetFlags.get(var33); // L: 7209
						if (var35 != null) { // L: 7210
							var35.remove();
						}

						widgetFlags.put(new IntegerNode(var17), var33); // L: 7211
					}

					var1.serverPacket = null; // L: 7213
					return true; // L: 7214
				}

				if (ServerPacket.field2967 == var1.serverPacket) { // L: 7216
					class12.field72 = true; // L: 7217
					GrandExchangeOfferOwnWorldComparator.updateNpcs(false, var3); // L: 7218
					var1.serverPacket = null; // L: 7219
					return true; // L: 7220
				}

				if (ServerPacket.field2943 == var1.serverPacket) { // L: 7222
					GameEngine.friendSystem.method1764(); // L: 7223
					field671 = cycleCntr; // L: 7224
					var1.serverPacket = null; // L: 7225
					return true; // L: 7226
				}

				if (ServerPacket.field2981 == var1.serverPacket) { // L: 7228
					BuddyRankComparator.field1342 = new class370(Ignored.HitSplatDefinition_cached); // L: 7229
					var1.serverPacket = null; // L: 7230
					return true; // L: 7231
				}

				if (ServerPacket.field2945 == var1.serverPacket) { // L: 7233
					rebootTimer = var3.readUnsignedShort() * 30; // L: 7234
					field471 = cycleCntr; // L: 7235
					var1.serverPacket = null; // L: 7236
					return true; // L: 7237
				}

				Widget var58;
				if (ServerPacket.field2985 == var1.serverPacket) { // L: 7239
					var17 = var3.method7412(); // L: 7240
					var58 = ChatChannel.getWidget(var17); // L: 7241

					for (var6 = 0; var6 < var58.itemIds.length; ++var6) { // L: 7242
						var58.itemIds[var6] = -1; // L: 7243
						var58.itemIds[var6] = 0; // L: 7244
					}

					SecureRandomCallable.invalidateWidget(var58); // L: 7246
					var1.serverPacket = null; // L: 7247
					return true; // L: 7248
				}

				if (ServerPacket.field3008 == var1.serverPacket) { // L: 7250
					var45 = var3.readStringCp1252NullTerminated(); // L: 7251
					var5 = var3.method7568(); // L: 7252
					var18 = ChatChannel.getWidget(var5); // L: 7253
					if (!var45.equals(var18.text)) { // L: 7254
						var18.text = var45; // L: 7255
						SecureRandomCallable.invalidateWidget(var18); // L: 7256
					}

					var1.serverPacket = null; // L: 7258
					return true; // L: 7259
				}

				if (ServerPacket.field2963 == var1.serverPacket) { // L: 7261
					var17 = var3.readUnsignedByte(); // L: 7262
					var5 = var3.readUnsignedByte(); // L: 7263
					var6 = var3.readUnsignedByte(); // L: 7264
					var7 = var3.readUnsignedByte(); // L: 7265
					field725[var17] = true; // L: 7266
					field726[var17] = var5; // L: 7267
					field679[var17] = var6; // L: 7268
					field618[var17] = var7; // L: 7269
					field729[var17] = 0; // L: 7270
					var1.serverPacket = null; // L: 7271
					return true; // L: 7272
				}

				if (ServerPacket.field2958 == var1.serverPacket) { // L: 7274
					for (var17 = 0; var17 < players.length; ++var17) { // L: 7275
						if (players[var17] != null) { // L: 7276
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) { // L: 7278
						if (npcs[var17] != null) { // L: 7279
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7281
					return true; // L: 7282
				}

				if (ServerPacket.field3015 == var1.serverPacket) { // L: 7284
					Projectile.privateChatMode = WorldMapData_0.method4353(var3.readUnsignedByte()); // L: 7285
					var1.serverPacket = null; // L: 7286
					return true; // L: 7287
				}

				if (ServerPacket.field2976 == var1.serverPacket) { // L: 7289
					var17 = var3.readInt(); // L: 7290
					if (var17 != field607) { // L: 7291
						field607 = var17; // L: 7292
						class291.method5502(); // L: 7293
					}

					var1.serverPacket = null; // L: 7295
					return true; // L: 7296
				}

				if (ServerPacket.field2969 == var1.serverPacket) { // L: 7298
					UserComparator4.method2499(var3.readStringCp1252NullTerminated()); // L: 7299
					var1.serverPacket = null; // L: 7300
					return true; // L: 7301
				}

				if (ServerPacket.field2962 == var1.serverPacket) { // L: 7303
					publicChatMode = var3.readUnsignedByte(); // L: 7304
					tradeChatMode = var3.method7520(); // L: 7305
					var1.serverPacket = null; // L: 7306
					return true; // L: 7307
				}

				String var57;
				if (ServerPacket.field2999 == var1.serverPacket) { // L: 7309
					var17 = var3.readUShortSmart(); // L: 7310
					boolean var53 = var3.readUnsignedByte() == 1; // L: 7311
					var57 = ""; // L: 7312
					boolean var50 = false; // L: 7313
					if (var53) { // L: 7314
						var57 = var3.readStringCp1252NullTerminated(); // L: 7315
						if (GameEngine.friendSystem.isIgnored(new Username(var57, class194.loginType))) { // L: 7316
							var50 = true;
						}
					}

					String var8 = var3.readStringCp1252NullTerminated(); // L: 7318
					if (!var50) { // L: 7319
						class194.addGameMessage(var17, var57, var8);
					}

					var1.serverPacket = null; // L: 7320
					return true; // L: 7321
				}

				if (ServerPacket.field3009 == var1.serverPacket) { // L: 7323
					var66 = var3.readBoolean(); // L: 7324
					if (var66) { // L: 7325
						if (Messages.field1273 == null) { // L: 7326
							Messages.field1273 = new class312();
						}
					} else {
						Messages.field1273 = null; // L: 7328
					}

					var1.serverPacket = null; // L: 7329
					return true; // L: 7330
				}

				if (ServerPacket.field2953 == var1.serverPacket) { // L: 7332
					var17 = var3.method7411(); // L: 7333
					var5 = var3.method7403(); // L: 7334
					var6 = var3.readUnsignedShort(); // L: 7335
					var25 = ChatChannel.getWidget(var17); // L: 7336
					var25.field3260 = var6 + (var5 << 16); // L: 7337
					var1.serverPacket = null; // L: 7338
					return true; // L: 7339
				}

				int var13;
				String var41;
				if (ServerPacket.field3012 == var1.serverPacket) { // L: 7341
					var45 = var3.readStringCp1252NullTerminated(); // L: 7342
					var29 = (long)var3.readUnsignedShort(); // L: 7343
					var31 = (long)var3.readMedium(); // L: 7344
					PlayerType var37 = (PlayerType)class130.findEnumerated(SpotAnimationDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 7345
					long var38 = (var29 << 32) + var31; // L: 7346
					boolean var40 = false; // L: 7347

					for (var13 = 0; var13 < 100; ++var13) { // L: 7348
						if (crossWorldMessageIds[var13] == var38) { // L: 7349
							var40 = true; // L: 7350
							break; // L: 7351
						}
					}

					if (GameEngine.friendSystem.isIgnored(new Username(var45, class194.loginType))) { // L: 7354
						var40 = true;
					}

					if (!var40 && field590 == 0) { // L: 7355
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38; // L: 7356
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7357
						var41 = AbstractFont.escapeBrackets(class412.method7287(SequenceDefinition.method3689(var3))); // L: 7358
						byte var76;
						if (var37.isPrivileged) { // L: 7360
							var76 = 7;
						} else {
							var76 = 3; // L: 7361
						}

						if (var37.modIcon != -1) { // L: 7362
							class194.addGameMessage(var76, class221.method4705(var37.modIcon) + var45, var41);
						} else {
							class194.addGameMessage(var76, var45, var41); // L: 7363
						}
					}

					var1.serverPacket = null; // L: 7365
					return true; // L: 7366
				}

				if (ServerPacket.field3025 == var1.serverPacket) { // L: 7368
					LoginScreenAnimation.logOut(); // L: 7369
					var1.serverPacket = null; // L: 7370
					return false; // L: 7371
				}

				if (ServerPacket.field3024 == var1.serverPacket) { // L: 7373
					var68 = var3.method7465(); // L: 7374
					var5 = var3.readUnsignedShort(); // L: 7375
					Varps.Varps_temp[var5] = var68; // L: 7376
					if (Varps.Varps_main[var5] != var68) { // L: 7377
						Varps.Varps_main[var5] = var68; // L: 7378
					}

					class281.changeGameOptions(var5); // L: 7380
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 7381
					var1.serverPacket = null; // L: 7382
					return true; // L: 7383
				}

				if (ServerPacket.field2971 == var1.serverPacket) { // L: 7385
					var17 = var3.method7392(); // L: 7386
					var5 = var3.method7392(); // L: 7387
					var57 = var3.readStringCp1252NullTerminated(); // L: 7388
					if (var5 >= 1 && var5 <= 8) { // L: 7389
						if (var57.equalsIgnoreCase("null")) { // L: 7390
							var57 = null;
						}

						playerMenuActions[var5 - 1] = var57; // L: 7391
						playerOptionsPriorities[var5 - 1] = var17 == 0; // L: 7392
					}

					var1.serverPacket = null; // L: 7394
					return true; // L: 7395
				}

				if (ServerPacket.field2979 == var1.serverPacket) { // L: 7397
					var68 = var3.readByte(); // L: 7398
					var29 = (long)var3.readUnsignedShort(); // L: 7399
					var31 = (long)var3.readMedium(); // L: 7400
					var33 = (var29 << 32) + var31; // L: 7401
					boolean var28 = false; // L: 7402
					ClanChannel var42 = var68 >= 0 ? currentClanChannels[var68] : UserComparator5.guestClanChannel; // L: 7403
					if (var42 == null) { // L: 7404
						var28 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7406
							if (var33 == crossWorldMessageIds[var13]) { // L: 7407
								var28 = true; // L: 7408
								break; // L: 7409
							}
						}
					}

					if (!var28) { // L: 7413
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var33; // L: 7414
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7415
						var41 = SequenceDefinition.method3689(var3); // L: 7416
						int var36 = var68 >= 0 ? 43 : 46; // L: 7417
						DevicePcmPlayerProvider.addChatMessage(var36, "", var41, var42.name); // L: 7418
					}

					var1.serverPacket = null; // L: 7420
					return true; // L: 7421
				}

				if (ServerPacket.field3014 == var1.serverPacket) { // L: 7423
					minimapState = var3.readUnsignedByte(); // L: 7424
					var1.serverPacket = null; // L: 7425
					return true; // L: 7426
				}

				if (ServerPacket.field2997 == var1.serverPacket) { // L: 7428
					GrandExchangeOfferOwnWorldComparator.updateNpcs(true, var3); // L: 7429
					var1.serverPacket = null; // L: 7430
					return true; // L: 7431
				}

				if (ServerPacket.field3022 == var1.serverPacket) { // L: 7433
					field583 = cycleCntr; // L: 7434
					var68 = var3.readByte(); // L: 7435
					if (var1.serverPacketLength == 1) { // L: 7436
						if (var68 >= 0) { // L: 7437
							currentClanChannels[var68] = null;
						} else {
							UserComparator5.guestClanChannel = null; // L: 7438
						}

						var1.serverPacket = null; // L: 7439
						return true; // L: 7440
					}

					if (var68 >= 0) { // L: 7442
						currentClanChannels[var68] = new ClanChannel(var3); // L: 7443
					} else {
						UserComparator5.guestClanChannel = new ClanChannel(var3); // L: 7446
					}

					var1.serverPacket = null; // L: 7448
					return true; // L: 7449
				}

				if (ServerPacket.field3013 == var1.serverPacket) { // L: 7451
					var17 = var3.method7411(); // L: 7452
					var5 = var3.method7403(); // L: 7453
					Varps.Varps_temp[var5] = var17; // L: 7454
					if (Varps.Varps_main[var5] != var17) { // L: 7455
						Varps.Varps_main[var5] = var17; // L: 7456
					}

					class281.changeGameOptions(var5); // L: 7458
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 7459
					var1.serverPacket = null; // L: 7460
					return true; // L: 7461
				}

				if (ServerPacket.field2933 == var1.serverPacket) { // L: 7463
					var66 = var3.readUnsignedByte() == 1; // L: 7464
					if (var66) { // L: 7465
						WorldMapSprite.field2727 = Ignored.method6459() - var3.readLong(); // L: 7466
						grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7467
					} else {
						grandExchangeEvents = null; // L: 7469
					}

					field669 = cycleCntr; // L: 7470
					var1.serverPacket = null; // L: 7471
					return true; // L: 7472
				}

				if (ServerPacket.field2946 == var1.serverPacket) { // L: 7474
					class17.field90 = var3.method7392(); // L: 7475
					class167.field1813 = var3.readUnsignedByte(); // L: 7476

					for (var17 = class17.field90; var17 < class17.field90 + 8; ++var17) { // L: 7477
						for (var5 = class167.field1813; var5 < class167.field1813 + 8; ++var5) { // L: 7478
							if (groundItems[class20.Client_plane][var17][var5] != null) { // L: 7479
								groundItems[class20.Client_plane][var17][var5] = null; // L: 7480
								MouseHandler.updateItemPile(var17, var5); // L: 7481
							}
						}
					}

					for (PendingSpawn var47 = (PendingSpawn)pendingSpawns.last(); var47 != null; var47 = (PendingSpawn)pendingSpawns.previous()) { // L: 7485 7486 7488
						if (var47.x >= class17.field90 && var47.x < class17.field90 + 8 && var47.y >= class167.field1813 && var47.y < class167.field1813 + 8 && var47.plane == class20.Client_plane) { // L: 7487
							var47.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7490
					return true; // L: 7491
				}

				if (ServerPacket.field3019 == var1.serverPacket) { // L: 7493
					DirectByteArrayCopier.method5328(class253.field2911); // L: 7494
					var1.serverPacket = null; // L: 7495
					return true; // L: 7496
				}

				if (ServerPacket.field3006 == var1.serverPacket) { // L: 7498
					var17 = var3.readInt(); // L: 7499
					InterfaceParent var60 = (InterfaceParent)interfaceParents.get((long)var17); // L: 7500
					if (var60 != null) { // L: 7501
						class10.closeInterface(var60, true);
					}

					if (meslayerContinueWidget != null) { // L: 7502
						SecureRandomCallable.invalidateWidget(meslayerContinueWidget); // L: 7503
						meslayerContinueWidget = null; // L: 7504
					}

					var1.serverPacket = null; // L: 7506
					return true; // L: 7507
				}

				if (ServerPacket.field2947 == var1.serverPacket) { // L: 7509
					byte[] var46 = new byte[var1.serverPacketLength]; // L: 7510
					var3.method7312(var46, 0, var46.length); // L: 7511
					Buffer var59 = new Buffer(var46); // L: 7512
					var57 = var59.readStringCp1252NullTerminated(); // L: 7513
					WorldMapSprite.openURL(var57, true, false); // L: 7514
					var1.serverPacket = null; // L: 7515
					return true; // L: 7516
				}

				if (ServerPacket.field2959 == var1.serverPacket) { // L: 7518
					var17 = var3.method7411(); // L: 7519
					var5 = var3.method7499(); // L: 7520
					var18 = ChatChannel.getWidget(var17); // L: 7521
					if (var18.modelType != 2 || var5 != var18.modelId) { // L: 7522
						var18.modelType = 2; // L: 7523
						var18.modelId = var5; // L: 7524
						SecureRandomCallable.invalidateWidget(var18); // L: 7525
					}

					var1.serverPacket = null; // L: 7527
					return true; // L: 7528
				}

				if (ServerPacket.field2936 == var1.serverPacket) { // L: 7530
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) { // L: 7531
						if (Varps.Varps_temp[var17] != Varps.Varps_main[var17]) { // L: 7532
							Varps.Varps_main[var17] = Varps.Varps_temp[var17]; // L: 7533
							class281.changeGameOptions(var17); // L: 7534
							changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 7535
						}
					}

					var1.serverPacket = null; // L: 7538
					return true; // L: 7539
				}

				if (ServerPacket.field2974 == var1.serverPacket) { // L: 7541
					var17 = var3.method7412(); // L: 7542
					var58 = ChatChannel.getWidget(var17); // L: 7543
					var58.modelType = 3; // L: 7544
					var58.modelId = class340.localPlayer.appearance.getChatHeadId(); // L: 7545
					SecureRandomCallable.invalidateWidget(var58); // L: 7546
					var1.serverPacket = null; // L: 7547
					return true; // L: 7548
				}

				if (ServerPacket.field3010 == var1.serverPacket) { // L: 7550
					updatePlayers(var3, var1.serverPacketLength); // L: 7551
					WorldMapLabelSize.method4373(); // L: 7552
					var1.serverPacket = null; // L: 7553
					return true; // L: 7554
				}

				if (ServerPacket.field2966 == var1.serverPacket) { // L: 7556
					ObjectSound.readReflectionCheck(var3, var1.serverPacketLength); // L: 7557
					var1.serverPacket = null; // L: 7558
					return true; // L: 7559
				}

				if (ServerPacket.field2964 == var1.serverPacket) { // L: 7561
					UserComparator6.method2551(); // L: 7562
					var17 = var3.readUnsignedByte(); // L: 7563
					var5 = var3.method7394(); // L: 7564
					var6 = var3.method7411(); // L: 7565
					experience[var5] = var6; // L: 7566
					currentLevels[var5] = var17; // L: 7567
					levels[var5] = 1; // L: 7568

					for (var7 = 0; var7 < 98; ++var7) { // L: 7569
						if (var6 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 7570
					var1.serverPacket = null; // L: 7571
					return true; // L: 7572
				}

				if (ServerPacket.field2995 == var1.serverPacket) { // L: 7574
					var3.offset += 28; // L: 7575
					if (var3.checkCrc()) { // L: 7576
						ObjectComposition.method3541(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7577
					return true; // L: 7578
				}

				if (ServerPacket.field2975 == var1.serverPacket) { // L: 7580
					var17 = var3.readUnsignedShort(); // L: 7581
					if (var17 == 65535) { // L: 7582
						var17 = -1;
					}

					class18.playSong(var17); // L: 7583
					var1.serverPacket = null; // L: 7584
					return true; // L: 7585
				}

				if (ServerPacket.field3003 == var1.serverPacket) { // L: 7587
					var17 = var3.method7508(); // L: 7588
					var5 = var3.method7401(); // L: 7589
					if (var5 == 65535) { // L: 7590
						var5 = -1;
					}

					class315.method5822(var5, var17); // L: 7591
					var1.serverPacket = null; // L: 7592
					return true; // L: 7593
				}

				if (ServerPacket.field2987 == var1.serverPacket) { // L: 7595
					var17 = var3.readUnsignedShort(); // L: 7596
					var5 = var3.method7411(); // L: 7597
					var18 = ChatChannel.getWidget(var5); // L: 7598
					if (var18.modelType != 1 || var17 != var18.modelId) { // L: 7599
						var18.modelType = 1; // L: 7600
						var18.modelId = var17; // L: 7601
						SecureRandomCallable.invalidateWidget(var18); // L: 7602
					}

					var1.serverPacket = null; // L: 7604
					return true; // L: 7605
				}

				if (ServerPacket.field2941 == var1.serverPacket) { // L: 7607
					var17 = var3.method7401(); // L: 7608
					ReflectionCheck.method662(var17); // L: 7609
					changedItemContainers[++field665 - 1 & 31] = var17 & 32767; // L: 7610
					var1.serverPacket = null; // L: 7611
					return true; // L: 7612
				}

				if (ServerPacket.field2950 == var1.serverPacket) { // L: 7614
					var17 = var3.readUnsignedByte(); // L: 7615
					SecureRandomFuture.forceDisconnect(var17); // L: 7616
					var1.serverPacket = null; // L: 7617
					return false; // L: 7618
				}

				if (ServerPacket.field2992 == var1.serverPacket) { // L: 7620
					var17 = var3.method7412(); // L: 7621
					var5 = var3.method7401(); // L: 7622
					var6 = var5 >> 10 & 31; // L: 7623
					var7 = var5 >> 5 & 31; // L: 7624
					var26 = var5 & 31; // L: 7625
					var9 = (var7 << 11) + (var6 << 19) + (var26 << 3); // L: 7626
					Widget var10 = ChatChannel.getWidget(var17); // L: 7627
					if (var9 != var10.color) { // L: 7628
						var10.color = var9; // L: 7629
						SecureRandomCallable.invalidateWidget(var10); // L: 7630
					}

					var1.serverPacket = null; // L: 7632
					return true; // L: 7633
				}

				if (ServerPacket.field2954 == var1.serverPacket) { // L: 7635
					var45 = var3.readStringCp1252NullTerminated(); // L: 7636
					var19 = AbstractFont.escapeBrackets(class412.method7287(SequenceDefinition.method3689(var3))); // L: 7637
					class194.addGameMessage(6, var45, var19); // L: 7638
					var1.serverPacket = null; // L: 7639
					return true; // L: 7640
				}

				if (ServerPacket.field2956 == var1.serverPacket) { // L: 7642
					DirectByteArrayCopier.method5328(class253.field2917); // L: 7643
					var1.serverPacket = null; // L: 7644
					return true; // L: 7645
				}

				AccessFile.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -836596687 * 884821201 : -1) + "," + (var1.field1290 != null ? var1.field1290.id * -836596687 * 884821201 : -1) + "," + (var1.field1291 != null ? var1.field1291.id * -836596687 * 884821201 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7647
				LoginScreenAnimation.logOut(); // L: 7648
			} catch (IOException var43) { // L: 7650
				Varcs.method2411(); // L: 7651
			} catch (Exception var44) {
				var19 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -836596687 * 884821201 : -1) + "," + (var1.field1290 != null ? var1.field1290.id * -836596687 * 884821201 : -1) + "," + (var1.field1291 != null ? var1.field1291.id * -836596687 * 884821201 : -1) + "," + var1.serverPacketLength + "," + (class340.localPlayer.pathX[0] + class131.baseX) + "," + (class340.localPlayer.pathY[0] + TileItem.baseY) + ","; // L: 7654

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7655
					var19 = var19 + var3.array[var6] + ",";
				}

				AccessFile.RunException_sendStackTrace(var19, var44); // L: 7656
				LoginScreenAnimation.logOut(); // L: 7657
			}

			return true; // L: 7659
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	@Export("menu")
	final void menu() {
		Message.method1115(); // L: 8867
		if (class143.dragInventoryWidget == null) { // L: 8868
			if (clickedWidget == null) { // L: 8869
				int var1 = MouseHandler.MouseHandler_lastButton; // L: 8870
				int var2;
				int var3;
				int var4;
				int var5;
				int var7;
				int var8;
				if (isMenuOpen) { // L: 8871
					if (var1 != 1 && (class150.mouseCam || var1 != 4)) { // L: 8872
						var2 = MouseHandler.MouseHandler_x; // L: 8873
						var3 = MouseHandler.MouseHandler_y; // L: 8874
						if (var2 < ModeWhere.menuX - 10 || var2 > GameObject.menuWidth + ModeWhere.menuX + 10 || var3 < BufferedSink.menuY - 10 || var3 > BufferedSink.menuY + UserComparator3.menuHeight + 10) { // L: 8875
							isMenuOpen = false; // L: 8876
							class10.method124(ModeWhere.menuX, BufferedSink.menuY, GameObject.menuWidth, UserComparator3.menuHeight); // L: 8877
						}
					}

					if (var1 == 1 || !class150.mouseCam && var1 == 4) { // L: 8880
						var2 = ModeWhere.menuX; // L: 8881
						var3 = BufferedSink.menuY; // L: 8882
						var4 = GameObject.menuWidth; // L: 8883
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8884
						int var10 = MouseHandler.MouseHandler_lastPressedY; // L: 8885
						var7 = -1; // L: 8886

						for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8887
							int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 8888
							if (var5 > var2 && var5 < var4 + var2 && var10 > var9 - 13 && var10 < var9 + 3) { // L: 8889
								var7 = var8;
							}
						}

						if (var7 != -1) { // L: 8891
							class17.method291(var7);
						}

						isMenuOpen = false; // L: 8892
						class10.method124(ModeWhere.menuX, BufferedSink.menuY, GameObject.menuWidth, UserComparator3.menuHeight); // L: 8893
					}
				} else {
					var2 = UserComparator10.method2543(); // L: 8897
					if ((var1 == 1 || !class150.mouseCam && var1 == 4) && var2 >= 0) { // L: 8898
						var3 = menuOpcodes[var2]; // L: 8899
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 8900
							var4 = menuArguments1[var2]; // L: 8901
							var5 = menuArguments2[var2]; // L: 8902
							Widget var6 = ChatChannel.getWidget(var5); // L: 8903
							if (class257.method5020(class363.getWidgetFlags(var6)) || MouseHandler.method649(class363.getWidgetFlags(var6))) { // L: 8904
								if (class143.dragInventoryWidget != null && !field572 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8905 8906
									var7 = draggedWidgetX; // L: 8907
									var8 = draggedWidgetY; // L: 8908
									WorldMapIcon_1.method4385(class87.tempMenuAction, var7, var8); // L: 8910
									class87.tempMenuAction = null; // L: 8911
								}

								field572 = false; // L: 8915
								itemDragDuration = 0; // L: 8916
								if (class143.dragInventoryWidget != null) { // L: 8917
									SecureRandomCallable.invalidateWidget(class143.dragInventoryWidget);
								}

								class143.dragInventoryWidget = ChatChannel.getWidget(var5); // L: 8918
								dragItemSlotSource = var4; // L: 8919
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8920
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8921
								if (var2 >= 0) { // L: 8922
									class16.method239(var2);
								}

								SecureRandomCallable.invalidateWidget(class143.dragInventoryWidget); // L: 8923
								return; // L: 8924
							}
						}
					}

					if ((var1 == 1 || !class150.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8928 8929
						var1 = 2; // L: 8930
					}

					if ((var1 == 1 || !class150.mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 8933
						class17.method291(var2); // L: 8934
					}

					if (var1 == 2 && menuOptionsCount > 0) { // L: 8936
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 8938

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2019357274"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = UserComparator10.method2543(); // L: 8941
		boolean var2 = leftClickOpensMenu == 1 && menuOptionsCount > 2; // L: 8942
		if (!var2) { // L: 8943
			boolean var3;
			if (var1 < 0) { // L: 8946
				var3 = false; // L: 8947
			} else {
				int var4 = menuOpcodes[var1]; // L: 8950
				if (var4 >= 2000) { // L: 8951
					var4 -= 2000;
				}

				if (var4 == 1007) { // L: 8952
					var3 = true; // L: 8953
				} else {
					var3 = false; // L: 8956
				}
			}

			var2 = var3; // L: 8958
		}

		return var2 && !menuShiftClick[var1]; // L: 8960
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-193534652"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		MouseHandler.method646(var1, var2); // L: 8964
		class7.scene.menuOpen(class20.Client_plane, var1, var2, false); // L: 8965
		isMenuOpen = true; // L: 8966
	} // L: 8967

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-48"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		class18.method297(rootInterface, class186.canvasWidth, BoundaryObject.canvasHeight, var1); // L: 10905
	} // L: 10906

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "-1768383258"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : ChatChannel.getWidget(var1.parentId); // L: 10909
		int var3;
		int var4;
		if (var2 == null) { // L: 10912
			var3 = class186.canvasWidth; // L: 10913
			var4 = BoundaryObject.canvasHeight; // L: 10914
		} else {
			var3 = var2.width; // L: 10917
			var4 = var2.height; // L: 10918
		}

		class29.alignWidgetSize(var1, var3, var4, false); // L: 10920
		MouseHandler.alignWidgetPosition(var1, var3, var4); // L: 10921
	} // L: 10922

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1117157787"
	)
	final void method1174() {
		SecureRandomCallable.invalidateWidget(clickedWidget); // L: 11948
		++class87.widgetDragDuration; // L: 11949
		if (field657 && field531) { // L: 11950
			int var1 = MouseHandler.MouseHandler_x; // L: 11956
			int var2 = MouseHandler.MouseHandler_y; // L: 11957
			var1 -= widgetClickX; // L: 11958
			var2 -= widgetClickY; // L: 11959
			if (var1 < field681) { // L: 11960
				var1 = field681;
			}

			if (var1 + clickedWidget.width > field681 + clickedWidgetParent.width) { // L: 11961
				var1 = field681 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field659) { // L: 11962
				var2 = field659;
			}

			if (var2 + clickedWidget.height > field659 + clickedWidgetParent.height) { // L: 11963
				var2 = field659 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field658; // L: 11964
			int var4 = var2 - field660; // L: 11965
			int var5 = clickedWidget.dragZoneSize; // L: 11966
			if (class87.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11967 11968
				isDraggingWidget = true; // L: 11969
			}

			int var6 = var1 - field681 + clickedWidgetParent.scrollX; // L: 11972
			int var7 = var2 - field659 + clickedWidgetParent.scrollY; // L: 11973
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11974
				var8 = new ScriptEvent(); // L: 11975
				var8.widget = clickedWidget; // L: 11976
				var8.mouseX = var6; // L: 11977
				var8.mouseY = var7; // L: 11978
				var8.args = clickedWidget.onDrag; // L: 11979
				class285.runScriptEvent(var8); // L: 11980
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11982
				if (isDraggingWidget) { // L: 11983
					if (clickedWidget.onDragComplete != null) { // L: 11984
						var8 = new ScriptEvent(); // L: 11985
						var8.widget = clickedWidget; // L: 11986
						var8.mouseX = var6; // L: 11987
						var8.mouseY = var7; // L: 11988
						var8.dragTarget = draggedOnWidget; // L: 11989
						var8.args = clickedWidget.onDragComplete; // L: 11990
						class285.runScriptEvent(var8); // L: 11991
					}

					if (draggedOnWidget != null && SpotAnimationDefinition.method3340(clickedWidget) != null) { // L: 11993
						PacketBufferNode var11 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2816, packetWriter.isaacCipher); // L: 11995
						var11.packetBuffer.method7407(draggedOnWidget.id); // L: 11996
						var11.packetBuffer.method7398(clickedWidget.childIndex); // L: 11997
						var11.packetBuffer.method7493(draggedOnWidget.itemId); // L: 11998
						var11.packetBuffer.method7493(draggedOnWidget.childIndex); // L: 11999
						var11.packetBuffer.writeShort(clickedWidget.itemId); // L: 12000
						var11.packetBuffer.writeInt(clickedWidget.id); // L: 12001
						packetWriter.addNode(var11); // L: 12002
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12006
					this.openMenu(field658 + widgetClickX, widgetClickY + field660); // L: 12007
				} else if (menuOptionsCount > 0) { // L: 12009
					int var10 = widgetClickX + field658; // L: 12010
					int var9 = widgetClickY + field660; // L: 12011
					WorldMapIcon_1.method4385(class87.tempMenuAction, var10, var9); // L: 12013
					class87.tempMenuAction = null; // L: 12014
				}

				clickedWidget = null; // L: 12018
			}

		} else {
			if (class87.widgetDragDuration > 1) { // L: 11951
				clickedWidget = null; // L: 11952
			}

		}
	} // L: 11954 12020

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)Lpo;",
		garbageValue = "-1191894118"
	)
	@Export("username")
	public Username username() {
		return class340.localPlayer != null ? class340.localPlayer.username : null; // L: 12670
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 666
				int var7;
				for (int var1 = 0; var1 <= 27; ++var1) { // L: 667
					String var2 = this.getParameter(Integer.toString(var1)); // L: 668
					if (var2 != null) { // L: 669
						switch(var1) { // L: 670
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 704
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 757
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 758
							}
							break;
						case 4:
							if (clientType == -1) { // L: 709
								clientType = Integer.parseInt(var2); // L: 710
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 752
							break; // L: 753
						case 6:
							ScriptFrame.clientLanguage = Language.method5826(Integer.parseInt(var2)); // L: 693
							break; // L: 694
						case 7:
							int var4 = Integer.parseInt(var2); // L: 722
							GameBuild[] var5 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.LIVE, GameBuild.WIP}; // L: 727
							GameBuild[] var6 = var5; // L: 729
							var7 = 0;

							GameBuild var3;
							while (true) {
								if (var7 >= var6.length) {
									var3 = null; // L: 740
									break;
								}

								GameBuild var8 = var6[var7]; // L: 731
								if (var4 == var8.buildId) { // L: 733
									var3 = var8; // L: 734
									break; // L: 735
								}

								++var7; // L: 730
							}

							StudioGame.field3456 = var3; // L: 742
							break; // L: 743
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 698
							}
							break;
						case 9:
							class1.field3 = var2; // L: 716
							break; // L: 717
						case 10:
							class338.field4054 = (StudioGame)class130.findEnumerated(WorldMapAreaData.method4894(), Integer.parseInt(var2)); // L: 763
							if (class338.field4054 == StudioGame.oldscape) { // L: 764
								class194.loginType = LoginType.oldscape;
							} else {
								class194.loginType = LoginType.field4405; // L: 765
							}
							break;
						case 11:
							class257.field3044 = var2; // L: 775
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 683
							break; // L: 684
						case 14:
							FriendLoginUpdate.field4096 = Integer.parseInt(var2); // L: 770
							break; // L: 771
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 688
							break; // L: 689
						case 17:
							AbstractWorldMapIcon.field2761 = var2; // L: 673
							break; // L: 674
						case 21:
							field473 = Integer.parseInt(var2); // L: 678
							break; // L: 679
						case 22:
							field526 = Integer.parseInt(var2) != 0; // L: 747
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 782
				isLowDetail = false; // L: 783
				class185.worldHost = this.getCodeBase().getHost(); // L: 785
				String var17 = StudioGame.field3456.name; // L: 786
				byte var18 = 0; // L: 787

				try {
					class143.idxCount = 21; // L: 790
					UserComparator3.cacheGamebuild = var18; // L: 791

					try {
						Coord.operatingSystemName = System.getProperty("os.name"); // L: 793
					} catch (Exception var32) { // L: 795
						Coord.operatingSystemName = "Unknown"; // L: 796
					}

					JagexCache.formattedOperatingSystemName = Coord.operatingSystemName.toLowerCase(); // L: 798

					try {
						class409.userHomeDirectory = System.getProperty("user.home"); // L: 800
						if (class409.userHomeDirectory != null) { // L: 801
							class409.userHomeDirectory = class409.userHomeDirectory + "/";
						}
					} catch (Exception var31) { // L: 803
					}

					try {
						if (JagexCache.formattedOperatingSystemName.startsWith("win")) { // L: 805
							if (class409.userHomeDirectory == null) { // L: 806
								class409.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (class409.userHomeDirectory == null) { // L: 809
							class409.userHomeDirectory = System.getenv("HOME");
						}

						if (class409.userHomeDirectory != null) { // L: 811
							class409.userHomeDirectory = class409.userHomeDirectory + "/";
						}
					} catch (Exception var30) { // L: 813
					}

					if (class409.userHomeDirectory == null) { // L: 814
						class409.userHomeDirectory = "~/";
					}

					UserComparator3.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class409.userHomeDirectory, "/tmp/", ""}; // L: 815
					BufferedSource.cacheSubPaths = new String[]{".jagex_cache_" + UserComparator3.cacheGamebuild, ".file_store_" + UserComparator3.cacheGamebuild}; // L: 816
					int var19 = 0;

					label275:
					while (var19 < 4) {
						String var37 = var19 == 0 ? "" : "" + var19; // L: 820
						Huffman.JagexCache_locationFile = new File(class409.userHomeDirectory, "jagex_cl_oldschool_" + var17 + var37 + ".dat"); // L: 821
						String var39 = null; // L: 822
						String var20 = null; // L: 823
						boolean var21 = false; // L: 824
						File var42;
						if (Huffman.JagexCache_locationFile.exists()) { // L: 825
							try {
								AccessFile var9 = new AccessFile(Huffman.JagexCache_locationFile, "rw", 10000L); // L: 828

								Buffer var10;
								int var11;
								for (var10 = new Buffer((int)var9.length()); var10.offset < var10.array.length; var10.offset += var11) { // L: 829 830 833
									var11 = var9.read(var10.array, var10.offset, var10.array.length - var10.offset); // L: 831
									if (var11 == -1) { // L: 832
										throw new IOException();
									}
								}

								var10.offset = 0; // L: 835
								var11 = var10.readUnsignedByte(); // L: 836
								if (var11 < 1 || var11 > 3) {
									throw new IOException("" + var11); // L: 837
								}

								int var12 = 0; // L: 838
								if (var11 > 1) { // L: 839
									var12 = var10.readUnsignedByte();
								}

								if (var11 <= 2) { // L: 840
									var39 = var10.readStringCp1252NullCircumfixed(); // L: 841
									if (var12 == 1) { // L: 842
										var20 = var10.readStringCp1252NullCircumfixed();
									}
								} else {
									var39 = var10.readCESU8(); // L: 845
									if (var12 == 1) { // L: 846
										var20 = var10.readCESU8();
									}
								}

								var9.close(); // L: 848
							} catch (IOException var34) { // L: 850
								var34.printStackTrace(); // L: 851
							}

							if (var39 != null) { // L: 853
								var42 = new File(var39); // L: 854
								if (!var42.exists()) { // L: 855
									var39 = null; // L: 856
								}
							}

							if (var39 != null) { // L: 859
								var42 = new File(var39, "test.dat"); // L: 860
								if (!BoundaryObject.method4321(var42, true)) { // L: 861
									var39 = null; // L: 862
								}
							}
						}

						if (var39 == null && var19 == 0) { // L: 866
							label250:
							for (int var22 = 0; var22 < BufferedSource.cacheSubPaths.length; ++var22) { // L: 867
								for (int var23 = 0; var23 < UserComparator3.cacheParentPaths.length; ++var23) { // L: 868
									File var24 = new File(UserComparator3.cacheParentPaths[var23] + BufferedSource.cacheSubPaths[var22] + File.separatorChar + "oldschool" + File.separatorChar); // L: 869
									if (var24.exists()) { // L: 870
										File var13 = new File(var24, "test.dat"); // L: 872

										boolean var44;
										try {
											RandomAccessFile var14 = new RandomAccessFile(var13, "rw"); // L: 875
											int var15 = var14.read(); // L: 876
											var14.seek(0L); // L: 877
											var14.write(var15); // L: 878
											var14.seek(0L); // L: 879
											var14.close(); // L: 880
											var13.delete(); // L: 881
											var44 = true; // L: 882
										} catch (Exception var29) { // L: 884
											var44 = false; // L: 885
										}

										if (var44) { // L: 888
											var39 = var24.toString(); // L: 889
											var21 = true; // L: 890
											break label250; // L: 891
										}
									}
								}
							}
						}

						if (var39 == null) { // L: 897
							var39 = class409.userHomeDirectory + File.separatorChar + "jagexcache" + var37 + File.separatorChar + "oldschool" + File.separatorChar + var17 + File.separatorChar; // L: 898
							var21 = true; // L: 899
						}

						if (var20 != null) { // L: 901
							File var41 = new File(var20); // L: 902
							var42 = new File(var39); // L: 903

							try {
								File[] var46 = var41.listFiles(); // L: 905
								File[] var25 = var46; // L: 907

								for (int var26 = 0; var26 < var25.length; ++var26) { // L: 908
									File var45 = var25[var26]; // L: 909
									File var27 = new File(var42, var45.getName()); // L: 911
									boolean var16 = var45.renameTo(var27); // L: 912
									if (!var16) { // L: 913
										throw new IOException();
									}
								}
							} catch (Exception var33) { // L: 918
								var33.printStackTrace(); // L: 919
							}

							var21 = true; // L: 921
						}

						if (var21) { // L: 923
							MusicPatchPcmStream.method5272(new File(var39), (File)null);
						}

						File var28 = new File(var39); // L: 924
						class13.cacheDir = var28; // L: 926
						if (!class13.cacheDir.exists()) { // L: 927
							class13.cacheDir.mkdirs();
						}

						File[] var38 = class13.cacheDir.listFiles(); // L: 928
						if (var38 != null) { // L: 929
							File[] var43 = var38; // L: 931

							for (var7 = 0; var7 < var43.length; ++var7) { // L: 932
								File var40 = var43[var7]; // L: 933
								if (!BoundaryObject.method4321(var40, false)) { // L: 935
									++var19; // L: 817
									continue label275;
								}
							}
						}
						break;
					}

					MusicPatchNode2.method5048(class13.cacheDir); // L: 942
					class368.method6744(); // L: 943
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 944
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 945
					JagexCache.JagexCache_idxFiles = new BufferedFile[class143.idxCount]; // L: 946

					for (var19 = 0; var19 < class143.idxCount; ++var19) { // L: 947
						JagexCache.JagexCache_idxFiles[var19] = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0); // L: 948
					}
				} catch (Exception var35) { // L: 952
					AccessFile.RunException_sendStackTrace((String)null, var35); // L: 953
				}

				class295.client = this; // L: 955
				class398.clientType = clientType; // L: 956
				if (field499 == -1) { // L: 957
					field499 = 0; // L: 958
				}

				WorldMapAreaData.field2772 = System.getenv("JX_ACCESS_TOKEN"); // L: 960
				System.getenv("JX_REFRESH_TOKEN"); // L: 961
				this.startThread(765, 503, 202); // L: 962
			}
		} catch (RuntimeException var36) {
			throw class139.newRunException(var36, "client.init(" + ')');
		}
	} // L: 963

	public void setOAuthTokens(String var1, String var2) {
		if (var1 != null && !var1.trim().isEmpty() && var2 != null && !var2.trim().isEmpty()) { // L: 967
			WorldMapAreaData.field2772 = var1; // L: 970
			PlayerType.method5521(10); // L: 971
		}
	} // L: 968 972

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "242484540"
	)
	static void method1623(int var0) {
		class366.field4192 = var0; // L: 21
		class366.field4191 = new class366[var0]; // L: 22
		class149.field1663 = 0; // L: 23
	} // L: 24

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpj;II)V",
		garbageValue = "-925897416"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var7 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1243[var7] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3;
					var10000 = Players.field1243;
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) { // L: 85
						var3 = class124.method2747(var0); // L: 86
						var10000 = Players.field1243;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						class231.readPlayerUpdate(var0, var7); // L: 90
					}
				}
			}
		}

		var0.exportIndex(); // L: 93
		if (var3 != 0) { // L: 94
			throw new RuntimeException(); // L: 95
		} else {
			var0.importIndex(); // L: 97

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 98
				var7 = Players.Players_indices[var4]; // L: 99
				if ((Players.field1243[var7] & 1) != 0) { // L: 100
					if (var3 > 0) { // L: 101
						--var3; // L: 102
						var10000 = Players.field1243; // L: 103
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1); // L: 106
						if (var6 == 0) { // L: 107
							var3 = class124.method2747(var0); // L: 108
							var10000 = Players.field1243; // L: 109
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							class231.readPlayerUpdate(var0, var7); // L: 112
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) { // L: 116
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 120
					var7 = Players.Players_emptyIndices[var4]; // L: 121
					if ((Players.field1243[var7] & 1) != 0) { // L: 122
						if (var3 > 0) { // L: 123
							--var3; // L: 124
							var10000 = Players.field1243; // L: 125
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1); // L: 128
							if (var6 == 0) { // L: 129
								var3 = class124.method2747(var0); // L: 130
								var10000 = Players.field1243; // L: 131
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (Decimator.updateExternalPlayer(var0, var7)) { // L: 134
								var10000 = Players.field1243;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 137
				if (var3 != 0) { // L: 138
					throw new RuntimeException(); // L: 139
				} else {
					var0.importIndex(); // L: 141

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 142
						var7 = Players.Players_emptyIndices[var4]; // L: 143
						if ((Players.field1243[var7] & 1) == 0) { // L: 144
							if (var3 > 0) { // L: 145
								--var3; // L: 146
								var10000 = Players.field1243; // L: 147
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1); // L: 150
								if (var6 == 0) { // L: 151
									var3 = class124.method2747(var0); // L: 152
									var10000 = Players.field1243; // L: 153
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (Decimator.updateExternalPlayer(var0, var7)) { // L: 156
									var10000 = Players.field1243;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 159
					if (var3 != 0) { // L: 160
						throw new RuntimeException(); // L: 161
					} else {
						Players.Players_count = 0; // L: 163
						Players.Players_emptyIdxCount = 0; // L: 164

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) { // L: 165
							var10000 = Players.field1243; // L: 166
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = players[var4]; // L: 167
							if (var5 != null) { // L: 168
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 169
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 173
							var4 = Players.Players_pendingUpdateIndices[var3]; // L: 174
							var5 = players[var4]; // L: 175
							var6 = var0.readUnsignedByte(); // L: 176
							if ((var6 & 16) != 0) { // L: 177
								var6 += var0.readUnsignedByte() << 8;
							}

							class65.method1957(var0, var4, var5, var6); // L: 178
						}

						if (var0.offset - var2 != var1) { // L: 181
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 182
						}
					}
				}
			}
		}
	} // L: 184

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1203328056"
	)
	static final void method1662(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 115
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		class194.addGameMessage(30, "", var1); // L: 117
	} // L: 119

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2037672270"
	)
	static String method1668() {
		String var0 = ""; // L: 80

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = var0 + var2.sender + ':' + var2.text + '\n') { // L: 81 84
			var2 = (Message)var1.next(); // L: 82
		}

		return var0; // L: 87
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-56"
	)
	static int method1667(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4301
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 4302
			return 1; // L: 4303
		} else if (var0 != 6801 && var0 != 6802) { // L: 4305
			if (var0 == 6850) { // L: 4309
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 4310
				return 1; // L: 4311
			} else if (var0 != 6851 && var0 != 6852) { // L: 4313
				if (var0 == 6853) { // L: 4317
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 4318
					return 1; // L: 4319
				} else {
					return 2; // L: 4321
				}
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4314
				return 1; // L: 4315
			}
		} else {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4306
			return 1; // L: 4307
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ljm;III)V",
		garbageValue = "-1503401807"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 11167
			class11.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 11168
		}

		String var3;
		if (var0.buttonType == 2 && !isSpellSelected) { // L: 11171
			var3 = SecureRandomFuture.Widget_getSpellActionName(var0); // L: 11172
			if (var3 != null) { // L: 11173
				class11.insertMenuItemNoShift(var3, UserComparator5.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 11174
			}
		}

		if (var0.buttonType == 3) { // L: 11178
			class11.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11179
		}

		if (var0.buttonType == 4) { // L: 11182
			class11.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 11183
		}

		if (var0.buttonType == 5) { // L: 11186
			class11.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 11187
		}

		if (var0.buttonType == 6 && meslayerContinueWidget == null) { // L: 11190
			class11.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 11191
		}

		int var4;
		int var19;
		if (var0.type == 2) { // L: 11194
			var19 = 0; // L: 11195

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 11196
				for (int var21 = 0; var21 < var0.width; ++var21) { // L: 11197
					int var22 = (var0.paddingX + 32) * var21; // L: 11198
					int var7 = (var0.paddingY + 32) * var4; // L: 11199
					if (var19 < 20) { // L: 11200
						var22 += var0.inventoryXOffsets[var19]; // L: 11201
						var7 += var0.inventoryYOffsets[var19]; // L: 11202
					}

					if (var1 >= var22 && var2 >= var7 && var1 < var22 + 32 && var2 < var7 + 32) { // L: 11204
						dragItemSlotDestination = var19; // L: 11205
						FloorOverlayDefinition.hoveredItemContainer = var0; // L: 11206
						if (var0.itemIds[var19] > 0) { // L: 11207
							label365: {
								ItemComposition var8 = UserComparator6.ItemDefinition_get(var0.itemIds[var19] - 1); // L: 11208
								boolean var9;
								int var10;
								if (isItemSelected == 1) { // L: 11210
									var10 = class363.getWidgetFlags(var0); // L: 11212
									var9 = (var10 >> 30 & 1) != 0; // L: 11214
									if (var9) { // L: 11216
										if (var0.id != MidiPcmStream.selectedItemWidget || var19 != Calendar.selectedItemSlot) { // L: 11217
											class11.insertMenuItemNoShift("Use", selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(16748608) + var8.name, 31, var8.id, var19, var0.id); // L: 11218
										}
										break label365;
									}
								}

								if (isSpellSelected) { // L: 11225
									var10 = class363.getWidgetFlags(var0); // L: 11227
									var9 = (var10 >> 30 & 1) != 0; // L: 11229
									if (var9) { // L: 11231
										if ((class91.selectedSpellFlags & 16) == 16) { // L: 11232
											class11.insertMenuItemNoShift(selectedSpellActionName, selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(16748608) + var8.name, 32, var8.id, var19, var0.id); // L: 11233
										}
										break label365;
									}
								}

								String[] var23 = var8.inventoryActions; // L: 11239
								var10 = -1; // L: 11240
								if (shiftClickDrop && ArchiveLoader.method2125()) { // L: 11241
									var10 = var8.getShiftClickIndex(); // L: 11242
								}

								int var12 = class363.getWidgetFlags(var0); // L: 11245
								boolean var11 = (var12 >> 30 & 1) != 0; // L: 11247
								if (var11) { // L: 11249
									for (int var13 = 4; var13 >= 3; --var13) { // L: 11250
										if (var13 != var10) { // L: 11251
											VarbitComposition.addWidgetItemMenuItem(var0, var8, var19, var13, false); // L: 11252
										}
									}
								}

								int var14 = class363.getWidgetFlags(var0); // L: 11256
								boolean var24 = (var14 >> 31 & 1) != 0; // L: 11258
								if (var24) { // L: 11260
									class11.insertMenuItemNoShift("Use", UserComparator5.colorStartTag(16748608) + var8.name, 38, var8.id, var19, var0.id); // L: 11261
								}

								int var16 = class363.getWidgetFlags(var0); // L: 11265
								boolean var15 = (var16 >> 30 & 1) != 0; // L: 11267
								int var17;
								if (var15) { // L: 11269
									for (var17 = 2; var17 >= 0; --var17) { // L: 11270
										if (var17 != var10) { // L: 11271
											VarbitComposition.addWidgetItemMenuItem(var0, var8, var19, var17, false); // L: 11272
										}
									}

									if (var10 >= 0) { // L: 11274
										VarbitComposition.addWidgetItemMenuItem(var0, var8, var19, var10, true); // L: 11275
									}
								}

								var23 = var0.itemActions; // L: 11278
								if (var23 != null) { // L: 11279
									for (var17 = 4; var17 >= 0; --var17) { // L: 11280
										if (var23[var17] != null) { // L: 11281
											byte var18 = 0; // L: 11282
											if (var17 == 0) { // L: 11283
												var18 = 39;
											}

											if (var17 == 1) { // L: 11284
												var18 = 40;
											}

											if (var17 == 2) { // L: 11285
												var18 = 41;
											}

											if (var17 == 3) { // L: 11286
												var18 = 42;
											}

											if (var17 == 4) { // L: 11287
												var18 = 43;
											}

											class11.insertMenuItemNoShift(var23[var17], UserComparator5.colorStartTag(16748608) + var8.name, var18, var8.id, var19, var0.id); // L: 11288
										}
									}
								}

								class11.insertMenuItemNoShift("Examine", UserComparator5.colorStartTag(16748608) + var8.name, 1005, var8.id, var19, var0.id); // L: 11293
							}
						}
					}

					++var19; // L: 11299
				}
			}
		}

		if (var0.isIf3) { // L: 11303
			if (isSpellSelected) { // L: 11304
				var4 = class363.getWidgetFlags(var0); // L: 11306
				boolean var25 = (var4 >> 21 & 1) != 0; // L: 11308
				if (var25 && (class91.selectedSpellFlags & 32) == 32) { // L: 11310
					class11.insertMenuItemNoShift(selectedSpellActionName, selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 11311
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) { // L: 11316
					String var20;
					if (!WorldMapCacheName.method4864(class363.getWidgetFlags(var0), var19) && var0.onOp == null) { // L: 11319
						var20 = null; // L: 11320
					} else if (var0.actions != null && var0.actions.length > var19 && var0.actions[var19] != null && var0.actions[var19].trim().length() != 0) { // L: 11323
						var20 = var0.actions[var19]; // L: 11327
					} else {
						var20 = null; // L: 11324
					}

					if (var20 != null) { // L: 11330
						class11.insertMenuItemNoShift(var20, var0.dataText, 1007, var19 + 1, var0.childIndex, var0.id); // L: 11331
					}
				}

				var3 = SecureRandomFuture.Widget_getSpellActionName(var0); // L: 11335
				if (var3 != null) { // L: 11336
					class11.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 11337
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 11340
					String var5;
					if (!WorldMapCacheName.method4864(class363.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 11343
						var5 = null; // L: 11344
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 11347
						var5 = var0.actions[var4]; // L: 11351
					} else {
						var5 = null; // L: 11348
					}

					if (var5 != null) { // L: 11354
						class21.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 11355
					}
				}

				if (class20.method332(class363.getWidgetFlags(var0))) { // L: 11359
					class11.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11360
				}
			}
		}

	} // L: 11365
}
