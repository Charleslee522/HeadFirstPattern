package Song;

import speakBehavior.CantSpeakKorean;
import speakBehavior.CantSpeakThai;
import speakBehavior.SpeakTankYou;

public class ����ũ extends Song {
	public ����ũ() {
		description = "����ũ^^!";
		System.out.println("����ũ����!!");
		speakEnglish_ = new SpeakTankYou();
		speakKorean_ = new CantSpeakKorean();
		speakThai_ = new CantSpeakThai();
	}

	@Override
	public int �ŷ¹߻�() {
		return 50;
	}
}
