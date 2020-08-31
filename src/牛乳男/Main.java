package 牛乳男;

public class Main {

	public static void main(String[] args) {

		Kakugari k = new Kakugari("カクガリ");
		Macho m = new Macho("マッチョ");

		Input i = new Input();
		k.setInput(i);
		m.setInput(i);


		Judgment j = new Judgment();
		j.setInput(i);
		int count =0;

		System.out.println("タイトル\u001b[95m【††それはコーンフレークじゃないんじゃないかゲーム††】\u001b[00m");
		System.out.print("\n"+"スタート！");

		i.anythingPush();//メソッド名
//		k.comic(1,1);
//		k.comic(1,2);
//		m.comic(1,1);
//		k.comic(1,3);
//
//		m.comic(2,1);
//		k.comic(2,1);
//		m.comic(2,2);
//		m.comic(2,3);
//		k.comic(2,2);
//		k.comic(2,3);
//
//		k.comic(3,1);
//
//		m.comic(4,1);
//		if(i.quizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//
//			k.comic(4,1);
//
//			m.comic(3,1);
//		}
//
//		m.comic(4,2);
//		if(i.isquizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//
//			k.comic(4,2);
//			k.comic(3,1);
//
//		}
//		m.comic(4,3);
//		if(i.quizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//
//			k.comic(4,3);
//			m.comic(4,4);
//			k.comic(4,4);
//
//			m.comic(3,1);
//
//		}
//		m.comic(4,5);
//		if(i.isquizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//			k.comic(4,5);
//
//			k.comic(3,1);
//		}
//
//		m.comic(4,6);
//		if(i.quizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//			k.comic(4,6);
//
//			m.comic(3,1);
//		}
//
//		m.comic(4,7);
//		if(i.quizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//			k.comic(4,7);
//
//			k.comic(3,1);
//		}
//
//		m.comic(4,8);
//		if(i.isquizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//			k.comic(4,8);
//
//			k.comic(3,1);
//		}
//
//		m.comic(4,9);
//		if(i.quizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//			k.comic(4,9);
//
//			k.comic(3,1);
//		}
//
//		m.comic(4,10);
//		if(i.isquizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//			k.comic(4,10);
//
//			m.comic(3,1);
//		}
//
//		m.comic(4,11);
//		if(i.quizQuestions()==true) {
//			j.Judgment_comment(count);
//
//			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");
//
//			System.exit(0);
//		}else {
//
//			count++;
//			k.comic(4,11);
//
//			k.comic(3,1);
//		}

		m.comic(4,12);
		if(i.isquizQuestions()==true) {
			j.Judgment_comment(count);

			System.out.println("\n"+"クイズゲーム終了です！お疲れ様でした。");

			System.exit(0);
		}else {

			count++;
			k.comic(4,12);

		}
		m.comic(5,1);
		k.comic(5,1);
		m.comic(5,2);
		k.comic(5,2);


		j.Judgment_comment(count);

				System.out.println("\n"+"❀❀クイズゲーム終了です！お疲れ様でした。❀❀");
				System.exit(0);

	}

}
