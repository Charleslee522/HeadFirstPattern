package Song;

import speakBehavior.能农府飘.CantSpeakKorean;
import speakBehavior.能农府飘.CantSpeakThai;
import speakBehavior.能农府飘.SpeakTankYou;

public class 价攀农 extends Song {
	public 价攀农() {
		description = "价攀农!";
		speakKorean_ = new CantSpeakKorean();
		speakEnglish_ = new SpeakTankYou();
		speakThai_ = new CantSpeakThai();
	}

	@Override
	public int 概仿惯魂() {
		return 50;
	}

}
