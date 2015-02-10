package edu.sysvp.program;

import tig058.handin01.member.Member;
import java.util.Comparator;

public class MemberIdComparator implements Comparator <Member> {
	public int compare(Member fst, Member snd){
		
			int fstId = fst.getId();
			int sndId = snd.getId();
			return fstId.compareTo(sndId);
		
		//return fst.getId().compareTo(snd.getId());
	}
}
