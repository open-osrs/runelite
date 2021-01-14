package com.openosrs.api.widgets;

public class WidgetID extends net.runelite.api.widgets.WidgetID
{
	public static final int BANK_PIN_GROUP_ID = 213;
	public static final int PLAYER_TRADE_CONFIRM_GROUP_ID = 334;
	public static final int PEST_CONTROL_EXCHANGE_WINDOW_GROUP_ID = 243;
	public static final int DIALOG_MINIGAME_GROUP_ID = 229;
	public static final int BA_HORN_OF_GLORY = 484;
	public static final int MOTHERLODE_MINE_FULL_INVENTORY_GROUP_ID = 229;
	public static final int DIALOG_PLAYER_GROUP_ID = 217;
	public static final int DIALOG_NOTIFICATION_GROUP_ID = 229;
	public static final int FOSSIL_ISLAND_MUSHROOM_TELE_GROUP_ID = 608;
	public static final int PERFORMERS_FOR_THE_THEATRE_GROUPS_GROUP_ID = 364;
	public static final int PERFORMERS_FOR_THE_THEATRE_PLAYERS_GROUP_ID = 50;
	public static final int DIALOG_SPRITE2_ID = 11;
	public static final int EQUIPMENT_PAGE_GROUP_ID = 84;
	public static final int QUESTTAB_GROUP_ID = 629;
	public static final int MUSICTAB_GROUP_ID = 239;
	public static final int JEWELLERY_BOX_GROUP_ID = 590;
	public static final int OPTIONS_GROUP_ID = 261;
	public static final int MULTISKILL_MENU_GROUP_ID = 270;
	public static final int THEATRE_OF_BLOOD_PARTY_GROUP_ID = 28;
	public static final int GWD_KC_GROUP_ID = 406;
	public static final int GAUNTLET_MAP_GROUP_ID = 638;

	public static final int SETTINGS_SIDE_GROUP_ID = 116;
	public static final int SETTINGS_GROUP_ID = 134;

	static class SettingsSide
	{
		static final int CAMERA_ZOOM_SLIDER_TRACK = 59;
		static final int MUSIC_SLIDER = 13;
		static final int SOUND_EFFECT_SLIDER = 17;
		static final int AREA_SOUND_SLIDER = 21;
	}

	static class Settings
	{
		static final int INIT = 1;
	}

	static class DialogPlayer
	{
		static final int HEAD_MODEL = 1;
		static final int NAME = 2;
		static final int CONTINUE = 3;
		static final int TEXT = 4;
	}

	static class DialogNotification
	{
		static final int TEXT = 0;
		static final int CONTINUE = 1;
	}

	static class DialogOption
	{
		static final int TEXT = 0;
		static final int OPTION1 = 1;
		static final int OPTION2 = 2;
		static final int OPTION3 = 3;
		static final int OPTION4 = 4;
		static final int OPTION5 = 5;
	}

	static class PestControlBoat
	{
		static final int INFO = 3;

		static final int NEXT_DEPARTURE = 4;
		static final int PLAYERS_READY = 5;
		static final int POINTS = 6;
	}

	static class PestControlExchangeWindow
	{
		static final int ITEM_LIST = 2;
		static final int BOTTOM = 5;
		static final int POINTS = 8;
		static final int CONFIRM_BUTTON = 6;
	}

	static class MinigameDialog
	{
		static final int TEXT = 1;
		static final int CONTINUE = 2;
	}

	static class PestControl
	{
		static final int INFO = 3;

		static final int TIME = 6;

		static final int ACTIVITY_BAR = 12;
		static final int ACTIVITY_PROGRESS = 14;

		static final int PURPLE_SHIELD = 15;
		static final int BLUE_SHIELD = 16;
		static final int YELLOW_SHIELD = 17;
		static final int RED_SHIELD = 18;

		static final int PURPLE_ICON = 19;
		static final int BLUE_ICON = 20;
		static final int YELLOW_ICON = 21;
		static final int RED_ICON = 22;

		static final int PURPLE_HEALTH = 23;
		static final int BLUE_HEALTH = 24;
		static final int YELLOW_HEALTH = 25;
		static final int RED_HEALTH = 26;
	}

	static class Bank
	{
		static final int BANK_CONTAINER = 1;
		static final int INVENTORY_ITEM_CONTAINER = 3;
		static final int BANK_TITLE_BAR = 3;
		static final int TUTORIAL_BUTTON = 4;
		static final int ITEM_COUNT_TOP = 5;
		static final int ITEM_COUNT_BAR = 6;
		static final int ITEM_COUNT_BOTTOM = 7;
		static final int CONTENT_CONTAINER = 9;
		static final int TAB_CONTAINER = 10;
		static final int ITEM_CONTAINER = 12;
		static final int SCROLLBAR = 13;
		static final int UNNOTED_BUTTON = 21;
		static final int NOTED_BUTTON = 23;
		static final int SEARCH_BUTTON_BACKGROUND = 39;
		static final int DEPOSIT_INVENTORY = 41;
		static final int DEPOSIT_EQUIPMENT = 43;
		static final int INCINERATOR = 45;
		static final int INCINERATOR_CONFIRM = 46;
		static final int EQUIPMENT_CONTENT_CONTAINER = 68;
		static final int SETTINGS_BUTTON = 111;
		static final int EQUIPMENT_BUTTON = 112;
	}

	static class GrandExchange
	{
		static final int WINDOW_CONTAINER = 0;
		static final int WINDOW_BORDERS = 2;
		static final int HISTORY_BUTTON = 3;
		static final int BACK_BUTTON = 4;
		static final int OFFER1 = 7;
		static final int OFFER2 = 8;
		static final int OFFER3 = 9;
		static final int OFFER4 = 10;
		static final int OFFER5 = 11;
		static final int OFFER6 = 12;
		static final int OFFER7 = 13;
		static final int OFFER8 = 14;
		static final int OFFER_CONTAINER = 24;
		static final int OFFER_DESCRIPTION = 25;
		static final int OFFER_PRICE = 26;
		static final int OFFER_CONFIRM_BUTTON = 27;
	}

	static class Shop
	{
		static final int ITEMS_CONTAINER = 2;
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Smithing
	{
		static final int INVENTORY_ITEM_CONTAINER = 0;

		static final int QTY_1 = 3;
		static final int QTY_5 = 4;
		static final int QTY_10 = 5;
		static final int QTY_X = 6;
		static final int QTY_ALL = 7;

		static final int DAGGER = 9;
		static final int SWORD = 10;
		static final int SCIMITAR = 11;
		static final int LONG_SWORD = 12;
		static final int TWO_H_SWORD = 13;
		static final int AXE = 14;
		static final int MACE = 15;
		static final int WARHAMMER = 16;
		static final int BATTLE_AXE = 17;
		static final int CLAWS = 18;
		static final int CHAIN_BODY = 19;
		static final int PLATE_LEGS = 20;
		static final int PLATE_SKIRT = 21;
		static final int PLATE_BODY = 22;
		static final int NAILS = 23;
		static final int MED_HELM = 24;
		static final int FULL_HELM = 25;
		static final int SQ_SHIELD = 26;
		static final int KITE_SHIELD = 27;
		static final int EXCLUSIVE1 = 28;
		static final int DART_TIPS = 29;
		static final int ARROW_HEADS = 30;
		static final int KNIVES = 31;
		static final int EXCLUSIVE2 = 32;
		static final int JAVELIN_HEADS = 33;
		static final int BOLTS = 34;
		static final int LIMBS = 35;
	}

	static class Equipment
	{
		static final int HELMET = 14;
		static final int CAPE = 15;
		static final int AMULET = 16;
		static final int WEAPON = 17;
		static final int BODY = 18;
		static final int SHIELD = 19;
		static final int LEGS = 20;
		static final int GLOVES = 21;
		static final int BOOTS = 22;
		static final int RING = 23;
		static final int AMMO = 24;
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Minimap
	{
		static final int XP_ORB = 1;
		static final int HEALTH_ORB = 2;
		static final int PRAYER_ORB = 12;
		static final int QUICK_PRAYER_ORB = 14; // Has the "Quick-prayers" name
		static final int PRAYER_ORB_TEXT = 15;
		static final int RUN_ORB = 20;
		static final int TOGGLE_RUN_ORB = 22; // Has the "Toggle run" name
		static final int RUN_ORB_TEXT = 23;
		static final int SPEC_ORB = 28;
		static final int SPEC_CLICKBOX = 30;
		static final int WORLDMAP_ORB = 41;
		static final int WIKI_BANNER = 43;
	}

	static class Combat
	{
		static final int WEAPON_NAME = 1;
		static final int LEVEL = 3;
		static final int STYLE_ONE = 4;
		static final int STYLE_TWO = 8;
		static final int STYLE_THREE = 12;
		static final int STYLE_FOUR = 16;
		static final int SPELLS = 20;
		static final int DEFENSIVE_SPELL_BOX = 21;
		static final int DEFENSIVE_SPELL_ICON = 23;
		static final int DEFENSIVE_SPELL_SHIELD = 24;
		static final int DEFENSIVE_SPELL_TEXT = 25;
		static final int SPELL_BOX = 26;
		static final int SPELL_ICON = 28;
		static final int SPELL_TEXT = 29;
		static final int AUTO_RETALIATE = 30;
		static final int SPECIAL_ATTACK_BAR = 34;
		static final int SPECIAL_ATTACK_CLICKBOX = 36;
		static final int TOOLTIP = 41;
	}

	static class BarbarianAssault
	{
		static class ATK
		{
			static final int LISTEN_TOP = 7;
			static final int LISTEN_BOTTOM = 8;
			static final int TO_CALL_WIDGET = 9;
			static final int TO_CALL = 10;
			static final int ROLE_SPRITE = 11;
			static final int ROLE = 12;
		}
		static class HLR
		{
			static final int TEAMMATE1 = 18;
			static final int TEAMMATE2 = 22;
			static final int TEAMMATE3 = 26;
			static final int TEAMMATE4 = 30;
		}
		static class HORN_GLORY
		{
			static final int ATTACKER = 5;
			static final int DEFENDER = 6;
			static final int COLLECTOR = 7;
			static final int HEALER = 8;
		}
		static class REWARD_VALUES
		{
			static final int RUNNERS_PASSED = 14;
			static final int HITPOINTS_REPLENISHED = 19;
			static final int WRONG_POISON_PACKS_USED = 20;
			static final int EGGS_COLLECTED = 21;
			static final int FAILED_ATTACKER_ATTACKS = 22;
			static final int RUNNERS_PASSED_POINTS = 24;
			static final int RANGERS_KILLED = 25;
			static final int FIGHTERS_KILLED = 26;
			static final int HEALERS_KILLED = 27;
			static final int RUNNERS_KILLED = 28;
			static final int HITPOINTS_REPLENISHED_POINTS = 29;
			static final int WRONG_POISON_PACKS_USED_POINTS = 30;
			static final int EGGS_COLLECTED_POINTS = 31;
			static final int FAILED_ATTACKER_ATTACKS_POINTS = 32;
			static final int BASE_POINTS = 33;
			static final int HONOUR_POINTS_REWARD = 49;
		}
		static final int CORRECT_STYLE = 3;
		static final int GAME_WIDGET = 3;
		static final int CURRENT_WAVE_WIDGET = 4;
		static final int CURRENT_WAVE = 5;
		static final int LISTEN_WIDGET = 6;
		static final int LISTEN = 7;
		static final int TO_CALL_WIDGET = 8;
		static final int TO_CALL = 9;
		static final int ROLE_SPRITE = 10;
		static final int ROLE = 11;
		static final int REWARD_TEXT = 57;
	}

	static class LevelUp
	{
		static final int SKILL = 1;
		static final int LEVEL = 2;
		static final int CONTINUE = 3;
	}

	static class TheatreOfBlood
	{
		static final int RAIDING_PARTY = 9;
		static final int ORB_BOX = 10;
		static final int BOSS_HEALTH_BAR = 35;
	}

	static class TheatreOfBloodParty
	{
		static final int CONTAINER = 10;
	}

	static class LightBox
	{
		static final int LIGHT_BOX = 1;
		static final int LIGHT_BOX_WINDOW = 2;
		static final int LIGHT_BULB_CONTAINER = 3;
		static final int LIGHT_BOX_BUTTON_CONTAINER = 6;
		static final int BUTTON_A = 8;
		static final int BUTTON_B = 9;
		static final int BUTTON_C = 10;
		static final int BUTTON_D = 11;
		static final int BUTTON_E = 12;
		static final int BUTTON_F = 13;
		static final int BUTTON_G = 14;
		static final int BUTTON_H = 15;
	}

	static class EquipmentWidgetIdentifiers
	{
		static final int EQUIP_YOUR_CHARACTER = 3;
		static final int STAB_ATTACK_BONUS = 24;
		static final int SLASH_ATTACK_BONUS = 25;
		static final int CRUSH_ATTACK_BONUS = 26;
		static final int MAGIC_ATTACK_BONUS = 27;
		static final int RANGED_ATTACK_BONUS = 28;
		static final int STAB_DEFENCE_BONUS = 30;
		static final int SLASH_DEFENCE_BONUS = 31;
		static final int CRUSH_DEFENCE_BONUS = 32;
		static final int MAGIC_DEFENCE_BONUS = 33;
		static final int RANGED_DEFENCE_BONUS = 34;
		static final int MELEE_STRENGTH = 36;
		static final int RANGED_STRENGTH = 37;
		static final int MAGIC_DAMAGE = 38;
		static final int PRAYER_BONUS = 39;
		static final int UNDEAD_DAMAGE_BONUS = 41;
		static final int SLAYER_DAMAGE_BONUS = 42;
		static final int WEIGHT = 49;
	}

	static class WorldSwitcher
	{
		static final int CONTAINER = 1;
		static final int WORLD_LIST = 16;
		static final int LOGOUT_BUTTON = 23;
	}

	static class FossilMushroomTeleport
	{
		static final int ROOT = 2;
		static final int HOUSE_ON_HILL = 4;
		static final int VERDANT_VALLEY = 8;
		static final int SWAMP = 12;
		static final int MUSHROOM_MEADOW = 16;
	}

	static class SpellBook
	{
		static final int FILTERED_SPELLS_BOUNDS = 3;
		static final int TOOLTIP = 189;

		// NORMAL SPELLS
		static final int LUMBRIDGE_HOME_TELEPORT = 5;
		static final int WIND_STRIKE = 6;
		static final int CONFUSE = 7;
		static final int ENCHANT_CROSSBOW_BOLT = 8;
		static final int WATER_STRIKE = 9;
		static final int LVL_1_ENCHANT = 10;
		static final int EARTH_STRIKE = 11;
		static final int WEAKEN = 12;
		static final int FIRE_STRIKE = 13;
		static final int BONES_TO_BANANAS = 14;
		static final int WIND_BOLT = 15;
		static final int CURSE = 16;
		static final int BIND = 17;
		static final int LOW_LEVEL_ALCHEMY = 18;
		static final int WATER_BOLT = 19;
		static final int VARROCK_TELEPORT = 20;
		static final int LVL_2_ENCHANT = 21;
		static final int EARTH_BOLT = 22;
		static final int LUMBRIDGE_TELEPORT = 23;
		static final int TELEKINETIC_GRAB = 24;
		static final int FIRE_BOLT = 25;
		static final int FALADOR_TELEPORT = 26;
		static final int CRUMBLE_UNDEAD = 27;
		static final int TELEPORT_TO_HOUSE = 28;
		static final int WIND_BLAST = 29;
		static final int SUPERHEAT_ITEM = 30;
		static final int CAMELOT_TELEPORT = 31;
		static final int WATER_BLAST = 32;
		static final int LVL_3_ENCHANT = 33;
		static final int IBAN_BLAST = 34;
		static final int SNARE = 35;
		static final int MAGIC_DART = 36;
		static final int ARDOUGNE_TELEPORT = 37;
		static final int EARTH_BLAST = 38;
		static final int HIGH_LEVEL_ALCHEMY = 39;
		static final int CHARGE_WATER_ORB = 40;
		static final int LVL_4_ENCHANT = 41;
		static final int WATCHTOWER_TELEPORT = 42;
		static final int FIRE_BLAST = 43;
		static final int CHARGE_EARTH_ORB = 44;
		static final int BONES_TO_PEACHES = 45;
		static final int SARADOMIN_STRIKE = 46;
		static final int CLAWS_OF_GUTHIX = 47;
		static final int FLAMES_OF_ZAMORAK = 48;
		static final int TROLLHEIM_TELEPORT = 49;
		static final int WIND_WAVE = 50;
		static final int CHARGE_FIRE_ORB = 51;
		static final int TELEPORT_TO_APE_ATOLL = 52;
		static final int WATER_WAVE = 53;
		static final int CHARGE_AIR_ORB = 54;
		static final int VULNERABILITY = 55;
		static final int LVL_5_ENCHANT = 56;
		static final int TELEPORT_TO_KOUREND = 57;
		static final int EARTH_WAVE = 58;
		static final int ENFEEBLE = 59;
		static final int TELEOTHER_LUMBRIDGE = 60;
		static final int FIRE_WAVE = 61;
		static final int ENTANGLE = 62;
		static final int STUN = 63;
		static final int CHARGE = 64;
		static final int WIND_SURGE = 65;
		static final int TELEOTHER_FALADOR = 66;
		static final int WATER_SURGE = 67;
		static final int TELE_BLOCK = 68;
		static final int BOUNTY_TARGET_TELEPORT = 69;
		static final int LVL_6_ENCHANT = 70;
		static final int TELEOTHER_CAMELOT = 71;
		static final int EARTH_SURGE = 72;
		static final int LVL_7_ENCHANT = 73;
		static final int FIRE_SURGE = 74;

		// ANCIENT SPELLS
		static final int ICE_RUSH = 75;
		static final int ICE_BLITZ = 76;
		static final int ICE_BURST = 77;
		static final int ICE_BARRAGE = 78;
		static final int BLOOD_RUSH = 79;
		static final int BLOOD_BLITZ = 80;
		static final int BLOOD_BURST = 81;
		static final int BLOOD_BARRAGE = 82;
		static final int SMOKE_RUSH = 83;
		static final int SMOKE_BLITZ = 84;
		static final int SMOKE_BURST = 85;
		static final int SMOKE_BARRAGE = 86;
		static final int SHADOW_RUSH = 87;
		static final int SHADOW_BLITZ = 88;
		static final int SHADOW_BURST = 89;
		static final int SHADOW_BARRAGE = 90;
		static final int PADDEWWA_TELEPORT = 91;
		static final int SENNTISTEN_TELEPORT = 92;
		static final int KHARYRLL_TELEPORT = 93;
		static final int LASSAR_TELEPORT = 94;
		static final int DAREEYAK_TELEPORT = 95;
		static final int CARRALLANGER_TELEPORT = 96;
		static final int ANNAKARL_TELEPORT = 97;
		static final int GHORROCK_TELEPORT = 98;
		static final int EDGEVILLE_HOME_TELEPORT = 99;

		// LUNAR SPELLS
		static final int LUNAR_HOME_TELEPORT = 100;
		static final int BAKE_PIE = 101;
		static final int CURE_PLANT = 102;
		static final int MONSTER_EXAMINE = 103;
		static final int NPC_CONTACT = 104;
		static final int CURE_OTHER = 105;
		static final int HUMIDIFY = 106;
		static final int MOONCLAN_TELEPORT = 107;
		static final int TELE_GROUP_MOONCLAN = 108;
		static final int CURE_ME = 109;
		static final int HUNTER_KIT = 110;
		static final int WATERBIRTH_TELEPORT = 111;
		static final int TELE_GROUP_WATERBIRTH = 112;
		static final int CURE_GROUP = 113;
		static final int STAT_SPY = 114;
		static final int BARBARIAN_TELEPORT = 115;
		static final int TELE_GROUP_BARBARIAN = 116;
		static final int SUPERGLASS_MAKE = 117;
		static final int TAN_LEATHER = 118;
		static final int KHAZARD_TELEPORT = 119;
		static final int TELE_GROUP_KHAZARD = 120;
		static final int DREAM = 121;
		static final int STRING_JEWELLERY = 122;
		static final int STAT_RESTORE_POT_SHARE = 123;
		static final int MAGIC_IMBUE = 124;
		static final int FERTILE_SOIL = 125;
		static final int BOOST_POTION_SHARE = 126;
		static final int FISHING_GUILD_TELEPORT = 127;
		static final int TELE_GROUP_FISHING_GUILD = 128;
		static final int PLANK_MAKE = 129;
		static final int CATHERBY_TELEPORT = 130;
		static final int TELE_GROUP_CATHERBY = 131;
		static final int RECHARGE_DRAGONSTONE = 132;
		static final int ICE_PLATEAU_TELEPORT = 133;
		static final int TELE_GROUP_ICE_PLATEAU = 134;
		static final int ENERGY_TRANSFER = 135;
		static final int HEAL_OTHER = 136;
		static final int VENGEANCE_OTHER = 137;
		static final int VENGEANCE = 138;
		static final int HEAL_GROUP = 139;
		static final int SPELLBOOK_SWAP = 140;
		static final int GEOMANCY = 141;
		static final int SPIN_FLAX = 142;
		static final int OURANIA_TELEPORT = 143;

		// ARCEUUS SPELLS
		static final int ARCEUUS_HOME_TELEPORT = 144;
		static final int BATTLEFRONT_TELEPORT = 179;
		// HEADS
		static final int REANIMATE_GOBLIN = 145;
		static final int REANIMATE_MONKEY = 147;
		static final int REANIMATE_IMP = 148;
		static final int REANIMATE_MINOTAUR = 149;
		static final int REANIMATE_SCORPION = 151;
		static final int REANIMATE_BEAR = 152;
		static final int REANIMATE_UNICORN = 153;
		static final int REANIMATE_DOG = 154;
		static final int REANIMATE_CHAOS_DRUID = 156;
		static final int REANIMATE_GIANT = 158;
		static final int REANIMATE_OGRE = 160;
		static final int REANIMATE_ELF = 161;
		static final int REANIMATE_TROLL = 162;
		static final int REANIMATE_HORROR = 164;
		static final int REANIMATE_KALPHITE = 165;
		static final int REANIMATE_DAGANNOTH = 167;
		static final int REANIMATE_BLOODVELD = 168;
		static final int REANIMATE_TZHAAR = 170;
		static final int REANIMATE_DEMON = 172;
		static final int REANIMATE_AVIANSIE = 173;
		static final int REANIMATE_ABYSSAL = 176;
		static final int REANIMATE_DRAGON = 178;

	}

	static class Pvp
	{
		static final int FOG_OVERLAY = 1;
		static final int PVP_WIDGET_CONTAINER = 54;  // OUTDATED?
		static final int SKULL = 56;  // OUTDATED?
		static final int ATTACK_RANGE = 59;  // OUTDATED?
		static final int BOUNTY_HUNTER_INFO = 6;
		static final int KILLDEATH_RATIO = 28;
		static final int SKULL_CONTAINER = 48;
		static final int SAFE_ZONE = 50;
		static final int WILDERNESS_LEVEL = 53; // this can also be the Deadman Mode "Protection" text
	}

	static class DialogSprite2
	{
		static final int SPRITE1 = 1;
		static final int TEXT = 2;
		static final int SPRITE2 = 3;
		static final int CONTINUE = 4;
	}

	static class QuestTab
	{
		static final int QUEST_TAB = 3;
	}

	public static class TradeScreen
	{
		public static final int FIRST_TRADING_WITH = 31;
		public static final int SECOND_ACCEPT_FUNC = 13;
		public static final int SECOND_DECLINE_FUNC = 14;
		public static final int SECOND_MY_OFFER = 23;
		public static final int SECOND_THEIR_OFFER = 24;
		public static final int SECOND_ACCEPT_TEXT = 25;
		public static final int SECOND_DECLINE_TEXT = 26;
		public static final int SECOND_MY_ITEMS = 28;
		public static final int SECOND_THEIR_ITEMS = 29;
		public static final int SECOND_TRADING_WITH = 30;
	}

	public static class DuelConfig
	{
		public static final int CONFIG_GROUP_IP = 482;
		public static final int TITLE = 35;
		public static final int OPPONENT_ATT = 9;
		public static final int OPPONENT_STR = 13;
		public static final int OPPONENT_DEF = 17;
		public static final int OPPONENT_HP = 21;
	}

	public static class DuelResult
	{
		public static final int RESULT_GROUP_ID = 372;
		public static final int TITLE = 16;
		public static final int TOTAL_STAKED = 32;
		public static final int TOTAL_TAX = 39;
		public static final int WINNINGS = 40;
	}

	// Also used for many other interfaces!
	static class BankPin
	{
		static final int CONTAINER = 0;
		static final int TOP_LEFT_TEXT = 2;
		static final int FIRST_ENTERED = 3;
		static final int SECOND_ENTERED = 4;
		static final int THIRD_ENTERED = 5;
		static final int FOURTH_ENTERED = 6;
		static final int INSTRUCTION_TEXT = 10;
		static final int EXIT_BUTTON = 13;
		static final int FORGOT_BUTTON = 15;
		static final int BUTTON_1 = 16;
		static final int BUTTON_2 = 18;
		static final int BUTTON_3 = 20;
		static final int BUTTON_4 = 22;
		static final int BUTTON_5 = 24;
		static final int BUTTON_6 = 26;
		static final int BUTTON_7 = 28;
		static final int BUTTON_8 = 30;
		static final int BUTTON_9 = 32;
		static final int BUTTON_10 = 34;
	}

	static class JewelBox
	{
		static final int DUEL_RING = 2;
		static final int GAME_NECK = 3;
		static final int COMB_BRAC = 4;
		static final int SKIL_NECK = 5;
		static final int RING_OFGP = 6;
		static final int AMUL_GLOR = 7; // yes
	}

	static class Options
	{
		static final int CAMERA_ZOOM_SLIDER_HANDLE = 15;
		static final int MUSIC_SLIDER = 37;
		static final int SOUND_EFFECT_SLIDER = 43;
		static final int AREA_SOUND_SLIDER = 49;
	}

	static class GauntletMap
	{
		static final int CONTAINER = 4;
	}
}
