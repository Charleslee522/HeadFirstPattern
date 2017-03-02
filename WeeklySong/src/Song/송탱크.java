package Song;

import speakBehavior.CantSpeakKorean;
import speakBehavior.CantSpeakThai;
import speakBehavior.SpeakTankYou;

public class 价攀农 extends Song {
	public 价攀农() {
		description = "价攀农^^!";
		System.out.println("价攀农俊侩!!");
		speakEnglish_ = new SpeakTankYou();
		speakKorean_ = new CantSpeakKorean();
		speakThai_ = new CantSpeakThai();
	}

	@Override
	public int 概仿惯魂() {
		return 50;
	}
}
