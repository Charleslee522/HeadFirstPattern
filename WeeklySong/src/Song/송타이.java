package Song;

import speakBehavior.CantSpeakEnglish;
import speakBehavior.Speak�����մϴ�;
import speakBehavior.Speak�ο͵�İ;

public class ��Ÿ�� extends Song {
	public ��Ÿ��() {
		description = "��Ÿ��!";
		System.out.println("��Ÿ���Դϴ� ȣȣ");
		speakEnglish_ = new CantSpeakEnglish();
		speakKorean_ = new Speak�����մϴ�();
		speakThai_ = new Speak�ο͵�İ();
	}

	@Override
	public int �ŷ¹߻�() {
		return 10;
	}
	
}
