import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;

public class RuneLiteClanMember implements ClanMember
{
	public final int idx;
	public final ClanSettings clanSettings;

	public RuneLiteClanMember(ClanSettings clanSettings, int idx) {
		this.clanSettings = clanSettings;
		this.idx = idx;
	}

	public ClanRank getRank() {
		return getClanRank(this.clanSettings.memberRanks[this.idx]);
	}

	public String getName() {
		return this.clanSettings.memberNames[this.idx];
	}
	
	public ClanRank getClanRank(int rank)
	{
		switch (rank)
		{
			case -1:
				return ClanRank.GUEST;
			case 10:
				return ClanRank.CLAN_RANK_2;
			case 20:
				return ClanRank.CLAN_RANK_3;
			case 30:
				return ClanRank.CLAN_RANK_4;
			case 40:
				return ClanRank.CLAN_RANK_5;
			case 50:
				return ClanRank.CLAN_RANK_6;
			case 60:
				return ClanRank.CLAN_RANK_7;
			case 70:
				return ClanRank.CLAN_RANK_8;
			case 80:
				return ClanRank.CLAN_RANK_9;
			case 90:
				return ClanRank.CLAN_RANK_10;
			case 100:
				return ClanRank.ADMINISTRATOR;
			case 105:
				return ClanRank.CLAN_RANK_11;
			case 110:
				return ClanRank.CLAN_RANK_12;
			case 115:
				return ClanRank.CLAN_RANK_13;
			case 120:
				return ClanRank.CLAN_RANK_14;
			case 125:
				return ClanRank.DEPUTY_OWNER;
			case 126:
				return ClanRank.OWNER;
			case 127:
				return ClanRank.JMOD;
			default:
				return ClanRank.CLAN_RANK_1;
		}
	}

	public boolean instanceOf(Object o) {
		return o instanceof RuneLiteClanMember;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof RuneLiteClanMember)) {
			return false;
		} else {
			RuneLiteClanMember clanMember = (RuneLiteClanMember)o;
			if (!clanMember.instanceOf(this)) {
				return false;
			} else {
				String thisName = this.getName();
				String objName = clanMember.getName();
				
				if (thisName == null) {
					if (objName != null) {
						return false;
					}
				} else if (!thisName.equals(objName)) {
					return false;
				}

				ClanRank thisRank = this.getRank();
				ClanRank objRank = clanMember.getRank();
				
				if (thisRank == null) {
					if (objRank != null) {
						return false;
					}
				} else if (!thisRank.equals(objRank)) {
					return false;
				}

				return true;
			}
		}
	}

	@Override
	public int hashCode() {
		byte b = 1;
		
		String name = this.getName();
		int hash = b * 59 + (name == null ? 43 : name.hashCode());
		ClanRank rank = this.getRank();
		hash = hash * 59 + (rank == null ? 43 : rank.hashCode());
		
		return hash;
	}

	public String toString() {
		return "ClanMemberImpl(getName=" + this.getName() + ", getRank=" + this.getRank() + ")";
	}
}
