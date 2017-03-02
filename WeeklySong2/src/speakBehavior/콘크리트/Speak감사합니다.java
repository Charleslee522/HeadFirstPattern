package speakBehavior.콘크리트;

import speakBehavior.인터페이스.SpeakKoreanBehavior;

public class Speak감사합니다 implements SpeakKoreanBehavior{

	@Override
	public void speakKorean() {
		System.out.println("감사합니다!");
	}
	
}
