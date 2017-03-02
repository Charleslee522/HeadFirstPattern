package speakBehavior.콘크리트;

import speakBehavior.인터페이스.SpeakEnglishBehavior;

public class SpeakTankYou implements SpeakEnglishBehavior {

	@Override
	public void speakEnglish() {
		System.out.println("Tank You!!");
	}
	
}
