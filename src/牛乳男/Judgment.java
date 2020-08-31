package 牛乳男;

public class Judgment {

	private Input input;

	public  void Judgment_comment(int count) {
		System.out.println("\n"+"お疲れ様でした！");

		System.out.print("\n"+"\u001b[94m☤☤判定させて頂きます！☤☤\u001b[00m");
		input.anythingPush();

		System.out.print("\n"+"あなたの正解数は・・・・");
		input.anythingPush();

		System.out.println("\n"+"\u001b[91m"+count+"/11問でした。\u001b[00m");

		System.out.print("\n"+"評価は・・・・");
		input.anythingPush();

		switch(count) {

		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("\n"+"\u001b[91mコーンフレークなめんな！\u001b[00m");
			break;

		case 5:
		case 6:
			System.out.println("\n"+"\u001b[91mあなたは日頃、コーンフレークのことをどのくらい考えていますか？\u001b[00m");
			System.out.println("\n"+"\u001b[91mコーンフレークには賞味期限があります。永遠ではありません！\u001b[00m");
			System.out.println("\n"+"\u001b[91mもっと、真剣にコーンフレークと向き合いましょう\u001b[00m");
			break;

		case 7:
		case 8:
		case 9:
			System.out.println("\n"+"\u001b[91mあなたは・・・コーンフレークとシリアルを間違えています！\u001b[00m");
			System.out.println("\n"+"\u001b[91mシリアルは麦で、コーンフレークはトウモロコシです\u001b[00m");
			System.out.println("\n"+"\u001b[91m間違えないよう、まずは朝昼晩、365日ご飯のかわりにたべるところから始めてみましょう！\u001b[00m");

			break;

		case 10:
		case 11:
			System.out.println("\n"+"\u001b[91mあなたは・・・コーンフレークのことを愛し、コーンフレークに愛された人です！");
			System.out.println("\n"+"その変わらないコーンフレーク愛とミルクをこれからもたっぷりかけてあげてください！\u001b[m");

			break;

		}

	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}
}


