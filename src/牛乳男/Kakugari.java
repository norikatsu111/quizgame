package 牛乳男;

public class Kakugari extends M1_King{

	private String name;

	private int age;

	private int scene;

	private int talkTurn;

	private Input input;

	public Kakugari(String name) {
		this.name = name;
	}
	@Override
	public void comic(int scene,int talkTurn){


		switch(scene) {


		case 1://つかみ
			switch(talkTurn) {

			case 1://つかみ

				System.out.print("\n"+this.name+"「あー、ありがとうございます！」");
				input.anythingPush();
				break;
			case 2:

				System.out.print("\n"+this.name+"「\u001b[91m今、免許証のコピーを頂きました！\u001b[00m」");
				input.anythingPush();
				break;
			case 3:

				System.out.print("\n"+this.name+"「こんなん何枚あってもいいですからね」");
				input.anythingPush();
				break;
			}
			break;

		case 2://フリ

			switch(talkTurn) {

			case 1:

				System.out.print("\n"+this.name+"「なんですか？」");
				input.anythingPush();
				break;

			case 2:

				System.out.print("\n"+this.name+"「なにがわからんの？」");
				input.anythingPush();
				break;
			case 3:
				System.out.print("\n"+this.name+"「ほんなら、一緒に考えてあげるから、特徴を教えて！」");
				input.anythingPush();
				break;
			}

			break;

		case 3://導入文

			switch(talkTurn) {

			case 1:
				System.out.print("\n"+this.name+"「もうちょっと、特徴を教しえて！」");
				input.anythingPush();
				break;
			}

			break;
		case 4://回答

			switch(talkTurn) {

			case 1://回答１
				System.out.println("\n"+this.name+"「コーンフレークやないかい！」");

				System.out.print("\n"+this.name+"「簡単！すぐわかるよ！その特徴は完全にコーンフレークやろ！」");

				input.anythingPush();
				break;

			case 2://回答2

				System.out.println("\n"+this.name+"「人生の最後がコーンフレークでええわけないもんね」");

				System.out.print("\n"+this.name+"「\u001b[91mコーンフレークはまだ寿命に余裕があるから食べていられるのよ」\u001b[00m");
				input.anythingPush();
				break;

			case 3://回答3_1

				System.out.println("\n"+this.name+"「コーンフレークやないかい！」");

				System.out.println("\n"+this.name+"「パッケージに書いてある五角形めちゃくちゃでかいのよ！」");
				System.out.println("\n"+this.name+"「\u001b[91mでもおれは自分の得意な項目で勝負してると思うしよく見たら牛乳の栄養素も含まれた五角形になっとんのよ！」\u001b[00m");
				System.out.print("\n"+this.name+"「そんなん、コーンフレークや！」");
				input.anythingPush();
				break;


			case 4://回答3_2

				System.out.print("\n"+this.name+"「なにがわからへんの？」");
				input.anythingPush();
				break;

			case 5://回答4

				System.out.println("\n"+this.name+"カクガリ「ほなぁ、コーンフレークと違うか！」");
				System.out.println("\n"+this.name+"「コーンフレークは、ねえ、朝から楽して腹を満たしたいという\u001b[91m煩悩の塊\u001b[00mやねん！」");
				System.out.print("\n"+this.name+"「みんなあれは、煩悩に牛乳かけて食べとんねん！」");

				input.anythingPush();
				break;

			case 6://回答5

				System.out.println("\n"+this.name+"「コーンフレークやないかい！」");
				System.out.println("\n"+this.name+"「法律スレスレに入っとんのやから！」");
				System.out.print("\n"+this.name+"「\u001b[91m店側がもう一段増やそうとするならおれはうごくよ！\u001b[00m」");
				input.anythingPush();
				break;

			case 7://回答6

				System.out.println("\n"+this.name+"「コーンフレークやないかい！」");
				System.out.println("\n"+this.name+"「\u001b[91mただの薄い小麦のパンがトラブルでフレーク状になったもの\u001b[00m」");
				System.out.print("\n"+this.name+"「完全にコーンフレークやないか、オカン詳しいな！何者や！」");
				input.anythingPush();
				break;
			case 8://回答7

				System.out.println("\n"+this.name+"「それはエッグベネディクトやないか！」");
				System.out.println("\n"+this.name+"「\u001b[91m朝からなんちゅうオシャレなもの食べてねん！君の親はアメリカ人なん？\u001b[00m」");
				System.out.print("\n"+this.name+"「ますます分からんようになってきたわ！」");
				input.anythingPush();
				break;

			case 9://回答8

				System.out.println("\n"+this.name+"「コーンフレークやないかい！」");
				System.out.println("\n"+this.name+"「コーンフレークとミロとフルーチェは憧れたんやから！」");
				System.out.print("\n"+this.name+"「あと、トランシーバーも憧れましたよ！」");
				input.anythingPush();
				break;
			case 10://回答9

				System.out.println("\n"+this.name+"カクガリ「ほなぁ、コーンフレークと違うか！」");
				System.out.println("\n"+this.name+"「ジャンル、まったく分からんけど中華ではないねん！」");
				System.out.print("\n"+this.name+"「\u001b[91m回るテーブルの上にコーンフレーク置いたら回したとき全部飛び散るよ！\u001b[00m」");
				input.anythingPush();
				break;

			case 11://回答10

				System.out.println("\n"+this.name+"「コーンフレークやないかい！」");
				System.out.println("\n"+this.name+"「コーンフレークは食べているときに生産者の顔しか浮んでこんのよ！」");
				System.out.print("\n"+this.name+"「\u001b[91m浮かんでくるのは腕組んだ虎の顔だけやないか！\u001b[00m」");
				input.anythingPush();
				break;

			case 12://回答11

				System.out.println("\n"+this.name+"「オカンがコーンフレークではないといえばコーンフレークではないやないか！」");
				System.out.println("\n"+this.name+"「先に言えよ！」");
				System.out.print("\n"+this.name+"「\u001b[91m俺が虎の話しているときどう思ってたん！\u001b[00m」");
				input.anythingPush();
				break;
			}

			break;

		case 5://大オチ

			switch(talkTurn) {

			case 1:

				System.out.print("\n"+this.name+"「オトン！？」");
				input.anythingPush();
				break;

			case 2:

				System.out.println("\n"+this.name+"「・・・いや絶対ちゃうやろ、もうええわ！ありがとうございました。」");
				input.anythingPush();
				break;


			}

			break;
		}
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}
	public int getScene() {
		return scene;
	}
	public void setScene(int scene) {
		this.scene = scene;
	}
	public int getTalkTurn() {
		return talkTurn;
	}
	public void setTalkTurn(int talkTurn) {
		this.talkTurn = talkTurn;
	}
	public Input getInput() {
		return input;
	}
	public void setInput(Input input) {
		this.input = input;
	}


}
