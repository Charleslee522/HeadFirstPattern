package speakBehavior;

public class CantSpeakThai implements SpeakThaiBehavior {

	@Override
	public void speakThai() {
		System.out.println("태국말은 진짜 못해용...");
	}

}
