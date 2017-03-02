package speakBehavior.콘크리트;

import speakBehavior.인터페이스.SpeakThaiBehavior;

public class CantSpeakThai implements SpeakThaiBehavior {

	@Override
	public void speakThai() {
		System.out.println("태국말은 진짜 못해용...");
	}

}
