

/**
 * ヒーロークラス
 * @author akira
 *
 */
public class Hero {
	public	HeroLocation heroLociton;
	private int hp;
	private String name;
	private int zoomLevel;
	private int rotation;
	private String colourValue;
	//private HeroLocation heroLocation;//ヒーローの立ち位置
	//private Sword sword;
	//private static int money;
	
	/*public Point getHeroLocation() {
		return this.heroLocation;
	}
	*/
	/*public HeroLocation getHeroLocation(){
		return this.heroLocation;
	}*/
	
	public String getName() {
		return this.name;
		}
	
	public String getColourValue() {
		return this.colourValue;
		}
	
	public int getHp() {
		return this.hp;
		}

	public int getZoomLevel() {
		return this.zoomLevel;
		}

	public int getRotation(){
		return this.rotation;
	}

	public void setZoomLevel(int zoomLevel){
		this.zoomLevel = zoomLevel;
		}

	public void setName(String name) {
		// 代入前に、代入しようとしている値が妥当かを検査する
		if (name == null) { // nullが設定されそうになった！
			throw new IllegalArgumentException("名前にnullが設定されそうになりました。処理を中断します。");
		}
		if (name.length() <= 1) { // 文字列長が異常（短すぎる）
			throw new IllegalArgumentException(
					"1文字以下の名前が設定されそうになりました。処理を中断します。");
		}
		if (name.length() >= 20) { // 文字列長が異常（長すぎる）
			throw new IllegalArgumentException(
					"8文字以上の名前が設定されそうになりました。処理を中断します。");
		}
		this.name = name; // 検査完了！代入しても大丈夫。
	}
	
	/**
	 * 下記の４つのフィールド<strong>全て</strong>指定もしくは指定なしを引数としてコンストラクターを起動できる
	 * DSIでは皆無、全部の２パターンを引数として設定している
	 *　this is a constructer 1
	 * @param name
	 * @param rotation
	 * @param zoomLevel
	 * @param colourValue
	 */
	Hero(HeroLocation heroLocation,int hp,String name,int zoomLevel,int rotation,String colourValue) {  //インスタンス化にも動的にフィールド値を指定できる//
	//this.heroLocation = heroLocation;
	//this.heroLocation = heroLocation;
	this.hp = hp; //これらは固定の初期値100でコンストの引数の有無にかかわらず100でインスタンス化する。コンストで指定しても無視される
	this.name = name;//コンスト引数が指定無ではnull、指定時はその引数がインスタンスのフィールドに格納
	this.zoomLevel = zoomLevel;
	this.rotation = rotation;
	this.colourValue = colourValue;
	}

	/**
	 *コメント　this is a constructer 2 for override
	 *引数の<strong>ない</strong>コンストの定義、DSIではわざわざ初期値を指定している
	 *コメントは関数の上に書くらしい。
	 */
	Hero() {
		//this.heroLocation = null;
		this.hp = 0; //これらは固定の初期値100でコンストの引数の有無にかかわらず100でインスタンス化する。コンストで指定しても無視される
		this.name = null;//コンスト引数が指定無ではnull、指定時はその引数がインスタンスのフィールドに格納
		this.zoomLevel = 0;
		this.rotation = 0;
		this.colourValue = "デフォルト";	
	}

	void bye() {
		System.out.println("勇者は別れを告げた");
	}

	/*private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}*/

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
}

/*
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("お化けキノコ" + m.suffix + "に" + sword.damage
				+ "ポイントのダメージを与えた");
		m.hp -= sword.damage;

		if (m.hp <= 0) {
			System.out.println("お化けキノコ" + m.suffix + "を倒した！");
		} else {
			System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
			this.hp -= 2;
			if (this.hp <= 0) {
				this.die();
			}
		}
	}

	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒すわった！");
		System.out.println("HPが" + sec + "ポイント回復した.");
	}

	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
		if (this.hp <= 0) {
			die();
		}
	}

	void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}
}
*/
