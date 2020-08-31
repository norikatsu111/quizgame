package 牛乳男;

public class Input {

	private String input = "";

	private String tuxtukomi;

	public void anythingPush(){

		while(true){
			System.out.print("⏎ >");
			String scanner = new java.util.Scanner(System.in).nextLine();

//			if(scanner.equals(this.input)) {

				break;

//			}else {
//				System.out.println("\n"+"☠☠入力が違います。もう一度入れてください！☠☠");
//			}
		}
	}
	public boolean quizQuestions() {

		while(true){
			System.out.println("\n"+"①："+"「コーンフレークやないかい！」");

			System.out.println("\n"+"➁："+"「ほなぁ、コーンフレークと違うか！」");

			System.out.print("\n"+"\u001b[94m☬☬半角英数字で1か2のどちらかを選んでください！＞\u001b[00m");

			tuxtukomi = new java.util.Scanner(System.in).nextLine();


			if(tuxtukomi.equals("1")){
				
				return false;

			}else if(tuxtukomi.equals("2")){

				return true;

			}else{

				System.out.println("\n"+"☠☠入力が違います！もう１度入れてください！☠☠");
			}
		}

	}
	public boolean isquizQuestions() {

		while(true){
			System.out.println("\n"+"①："+"「コーンフレークやないかい！」");

			System.out.println("\n"+"➁："+"「ほなぁ、コーンフレークと違うか！」");

			System.out.print("\n"+"\u001b[94m☬☬半角英数字で1か2のどちらかを選んでください！＞\u001b[00m");

			tuxtukomi = new java.util.Scanner(System.in).nextLine();


			if(tuxtukomi.equals("1")){

				return true;

			}else if(tuxtukomi.equals("2")){

				return false;

			}else{

				System.out.println("\n"+"☠☠入力が違います！もう１度入れてください！☠☠");
			}
		}

	}


	public String getInput() {return input;}

	public void setInput(String input) {this.input = input;}

	public String getTuxtukomi() {return tuxtukomi;}

	public void setTuxtukomi(String tuxtukomi) {this.tuxtukomi = tuxtukomi;}

}

//メソッドで回答も使う