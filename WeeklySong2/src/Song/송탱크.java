package Song;

import speakBehavior.��ũ��Ʈ.CantSpeakKorean;
import speakBehavior.��ũ��Ʈ.CantSpeakThai;
import speakBehavior.��ũ��Ʈ.SpeakTankYou;

public class ����ũ extends Song {
	public ����ũ() {
		description = "����ũ!";
		speakKorean_ = new CantSpeakKorean();
		speakEnglish_ = new SpeakTankYou();
		speakThai_ = new CantSpeakThai();
	}

	@Override
	public int �ŷ¹߻�() {
		return 50;
	}

}
