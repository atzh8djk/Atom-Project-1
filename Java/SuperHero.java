/**
 *
 * @author akira
 * ヒーローを継承してスーパーヒーロを作る
 */
public class SuperHero extends Hero {

	/**
	 * ヒーローの年と趣味
	 */
	private int age;
	private String hobby;

	public SuperHero() {
		this.age = 14;
		this.hobby= "Game_Play";

		//super(0, "ここう",25000,5, "夜");
	}

	public SuperHero(int age, String hobby) {
		this.age = age;
		this.hobby= hobby;

		//super(0, "ここう",25000,5, "夜");
	}
	/**
	 * ヒーローの年と趣味の取得
	 */
	public int getAge(){
		return this.age;
	}

	public String getHobby(){
		return this.hobby;
	}
}
