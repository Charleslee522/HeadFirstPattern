package speakBehavior;

public class CantSpeakKorean implements SpeakKoreanBehavior {

	@Override
	public void speakKorean() {
		System.out.println("한국말 못해용...");
	}
	
}
