package speakBehavior.콘크리트;

import speakBehavior.인터페이스.SpeakKoreanBehavior;

public class CantSpeakKorean implements SpeakKoreanBehavior {

	@Override
	public void speakKorean() {
		System.out.println("한국말 못해용...");
	}
	
}
