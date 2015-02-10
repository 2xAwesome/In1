package edu.sysvp.program;

import tig058.handin01.member.Member;
import java.util.Comparator;
public class MemberTeamComparator implements Comparator<Member>{
	public int compare(Member fst, Member snd){
		/*
			String fstTeam = fst.getTeam();
			String sndTeam = snd.getTeam();
			return fstTeam.compareTo(sndTeam);
		*/
		return fst.getTeam().compareTo(snd.getTeam());
	}
}