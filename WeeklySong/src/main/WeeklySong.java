package main;

import decorator.열매.EDG에메일보내기열매;
import decorator.열매.섬섬옥수열매;
import decorator.열매.오타치기열매;
import decoratror.Wearable.TShirts;
import decoratror.Wearable.정장;
import speakBehavior.SpeakTankYou;
import speakBehavior.Speak감사합니다;
import speakBehavior.Speak싸와디캅;
import Song.Song;
import Song.송타이;
import Song.송탱크;
import Song.송호길;

public class WeeklySong {

	public static void main(String[] args) {
		Song 순수송탱크 = new 송탱크();
		순수송탱크.speakKorean();
		순수송탱크.speakEnglish();
		순수송탱크.speakThai();
		
		Song 순수송타이 = new 송타이();
		순수송타이.speakAll();
		
		Song 송호길 = new 송호길();
		송호길.setSpeakEnglishBehavior(new SpeakTankYou());
		송호길.setSpeakKoreanBehavior(new Speak감사합니다());
		송호길.setSpeakThaiBehavior(new Speak싸와디캅());
		송호길.speakAll();
		
		Song 티셔츠를입은섬섬옥수송호길 = new 송호길();
		티셔츠를입은섬섬옥수송호길 = new 섬섬옥수열매(티셔츠를입은섬섬옥수송호길);
		티셔츠를입은섬섬옥수송호길 = new TShirts(티셔츠를입은섬섬옥수송호길);
		
		System.out.println(티셔츠를입은섬섬옥수송호길.getDescription());
		System.out.println("매력점수: " + 티셔츠를입은섬섬옥수송호길.매력발산() + "점");

		Song 정장입고EDG에메일보낸오타친송탱크 = new 송탱크();
		정장입고EDG에메일보낸오타친송탱크= new 오타치기열매(정장입고EDG에메일보낸오타친송탱크);
		정장입고EDG에메일보낸오타친송탱크 = new EDG에메일보내기열매(정장입고EDG에메일보낸오타친송탱크);
		정장입고EDG에메일보낸오타친송탱크 = new 정장(정장입고EDG에메일보낸오타친송탱크);

		System.out.println(정장입고EDG에메일보낸오타친송탱크.getDescription());
		System.out.println("매력점수: " + 정장입고EDG에메일보낸오타친송탱크.매력발산() + "점");
		정장입고EDG에메일보낸오타친송탱크.speakAll();
	}
}
