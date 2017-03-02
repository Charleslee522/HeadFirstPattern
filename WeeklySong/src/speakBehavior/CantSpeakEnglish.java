package speakBehavior;

public class CantSpeakEnglish implements SpeakEnglishBehavior {

	@Override
	public void speakEnglish() {
		System.out.println("I can't speak English well...");
	}

}
