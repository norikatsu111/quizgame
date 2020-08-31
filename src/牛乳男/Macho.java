package 牛乳男;

public class Macho extends M1_King{

	private String name ;

	private int age;

	private int scene;

	private int talkTurn;

	private Input input;


	public Macho(String name){
		this.name = name ;
	}
	@Override
	public void comic(int scene,int talkTurn){

		switch(scene) {

		case 1://つかみ

			switch(talkTurn) {

				case 1:

					System.out.print("\n"+this.name+"「ありがとうございます！」");
					input.anythingPush();
					break;

				}
			break;
		case 2:	//フリ

			switch(talkTurn) {

				case 1:

					System.out.print("\n"+this.name+"「ちょっと、突然ですが相談がありまして」");
					input.anythingPush();
					break;

				case 2:

					System.out.println("\n"+this.name+"「うちの\u001b[91mオカンが、好きな朝ごはんの名前\u001b[00mを忘れてしまったらしいんよ」");
					break;
				case 3:
					System.out.print("\n"+this.name+"「色々聞いたんやけど分からんのよ」");
					input.anythingPush();
					break;
				}
			break;

		case 3:	//導入文

			switch(talkTurn) {

				case 1:
					System.out.print("\n"+this.name+"「おれもそう思ったやけどなぁ、オカンがゆうには」");

					input.anythingPush();
					break;
				}
			break;
		case 4:	//クイズ

				switch(talkTurn) {

					case 1:

						System.out.println("\n"+this.name+"\u001b[92m「どうやらなぁ、甘くてカリカリしてて牛乳かけて食べるやつらしいよな」\u001b[00m");

						break;
					case 2:

						System.out.println("\n"+this.name+"\u001b[92m「死ぬ前の最後のご飯もそれでいい、てゆうねんなぁ」\u001b[00m");

						break;

					case 3:

						System.out.println("\n"+this.name+"\u001b[92m「なんであんなに栄養バランスの五角形大きいのかわからんらしいよ」\u001b[00m");

						break;

					case 4:

						System.out.print("\n"+this.name+"「でもわからへんのよ！」");
						input.anythingPush();
						break;

					case 5:

						System.out.println("\n"+this.name+"\u001b[92m「お坊さんが修行のときも食べるらしいねん」\u001b[00m");

						break;

					case 6:

						System.out.println("\n"+this.name+"\u001b[92m「パフェのかさましに使われているらしい」\u001b[00m");

						break;

					case 7:

						System.out.println("\n"+this.name+"\u001b[92m「ただの薄いパンのらしい」\u001b[00m");

						break;

					case 8:

						System.out.println("\n"+this.name+"\u001b[92m「どうやら1894年にウォルドルフホテルではじめて作られたらしい」\u001b[00m");

						break;

					case 9:
						System.out.println("\n"+this.name+"\u001b[92m「子供の頃、なぜかみんな憧れたらしい」\u001b[00m");

						break;

					case 10:
						System.out.println("\n"+this.name+"\u001b[92m「ジャンルでいったら中華らしい」\u001b[00m");

						break;

					case 11:
						System.out.println("\n"+this.name+"\u001b[92m「食べているときに誰に感謝したらいいのかわからないらしい」\u001b[00m");

						break;

					case 12:

						System.out.println("\n"+this.name+"\u001b[92m「コーンフレークではない」\u001b[00m");

						break;
					}
				break;
			case 5:	//大オチ

					switch(talkTurn) {

					case 1:

						System.out.println("\n"+this.name+"「でもオトンが言うには」");

						break;

					case 2:

						System.out.print("\n"+this.name+"「\u001b[91mサバの塩焼き\u001b[00mちゃうか！」");
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
