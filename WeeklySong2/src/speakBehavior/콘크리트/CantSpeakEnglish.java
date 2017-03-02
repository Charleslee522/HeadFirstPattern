package speakBehavior.콘크리트;

import speakBehavior.인터페이스.SpeakEnglishBehavior;

public class CantSpeakEnglish implements SpeakEnglishBehavior {

	@Override
	public void speakEnglish() {
		System.out.println("I can't speak English well...");
	}

}
