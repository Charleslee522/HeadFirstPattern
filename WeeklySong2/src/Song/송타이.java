package Song;

import speakBehavior.��ũ��Ʈ.CantSpeakEnglish;
import speakBehavior.��ũ��Ʈ.Speak�����մϴ�;
import speakBehavior.��ũ��Ʈ.Speak�ο͵�İ;

public class ��Ÿ�� extends Song {
	public ��Ÿ��() {
		description = "��Ÿ��!";
		speakEnglish_ = new CantSpeakEnglish();
		speakKorean_ = new Speak�����մϴ�();
		speakThai_ = new Speak�ο͵�İ();
	}

	@Override
	public int �ŷ¹߻�() {
		return 10;
	}
	
}
