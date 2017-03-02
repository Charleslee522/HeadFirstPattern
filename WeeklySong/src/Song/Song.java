package Song;

import speakBehavior.SpeakEnglishBehavior;
import speakBehavior.SpeakKoreanBehavior;
import speakBehavior.SpeakThaiBehavior;

abstract public class Song extends NickName {

	protected SpeakKoreanBehavior speakKorean_;
	protected SpeakEnglishBehavior speakEnglish_;
	protected SpeakThaiBehavior speakThai_;

	public Song() {
		System.out.println("---------------주간 송호길---------------");
	}

	public void setSpeakKoreanBehavior(SpeakKoreanBehavior behavior) {
		speakKorean_ = behavior;
	}

	public void setSpeakEnglishBehavior(SpeakEnglishBehavior behavior) {
		speakEnglish_ = behavior;
	}

	public void setSpeakThaiBehavior(SpeakThaiBehavior behavior) {
		speakThai_ = behavior;
	}

	public void speakKorean() {
		speakKorean_.speakKorean();
	}

	public void speakEnglish() {
		speakEnglish_.speakEnglish();
	}

	public void speakThai() {
		speakThai_.speakThai();
	}

	public void speakAll() {
		this.speakKorean();
		this.speakEnglish();
		this.speakThai();
	}
	
	public String getDescription() {
		return description;
	}

}
