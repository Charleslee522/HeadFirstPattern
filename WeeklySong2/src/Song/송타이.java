package Song;

import speakBehavior.콘크리트.CantSpeakEnglish;
import speakBehavior.콘크리트.Speak감사합니다;
import speakBehavior.콘크리트.Speak싸와디캅;

public class 송타이 extends Song {
	public 송타이() {
		description = "송타이!";
		speakEnglish_ = new CantSpeakEnglish();
		speakKorean_ = new Speak감사합니다();
		speakThai_ = new Speak싸와디캅();
	}

	@Override
	public int 매력발산() {
		return 10;
	}
	
}
