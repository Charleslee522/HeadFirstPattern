package Song;

import speakBehavior.CantSpeakEnglish;
import speakBehavior.Speak감사합니다;
import speakBehavior.Speak싸와디캅;

public class 송타이 extends Song {
	public 송타이() {
		description = "송타이!";
		System.out.println("송타이입니다 호호");
		speakEnglish_ = new CantSpeakEnglish();
		speakKorean_ = new Speak감사합니다();
		speakThai_ = new Speak싸와디캅();
	}

	@Override
	public int 매력발산() {
		return 10;
	}
	
}
