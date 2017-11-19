import java.awt.Point;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		//Hero h2 = new Hero(0, "ここう",25000,5, "夜");
		Point p = new Point(998,887);
		SuperHero sh =new SuperHero(14,"akira");
		HeroLocation heroLocation = new HeroLocation(151438,1375);
		
		//h.setName("akira kato");		// 長さ0文字の名前をセットしようとする
		System.out.println("ヒーロークラスが引数なしでインスタンス化された");
		//System.out.println("勇者の居場所は" + h.getHeroLocation());
		System.out.println("勇者の名前は" + h.getName());
		System.out.println("現在の地図の色は" + h.getColourValue() + "です");
		System.out.println("現在のHPは" + h.getHp());
		System.out.println("ズームレベルは" + h.getZoomLevel());
		System.out.println("磁方位は" + h.getRotation() + "です" );
		h.setZoomLevel(12500);
		System.out.println("変更後のズームレベルは" + h.getZoomLevel());
		System.out.println("             ");
		System.out.println("ヒーロークラスが引数有りでインスタンス化された");
		//System.out.println("勇者の居場所は" + h2.getHeroLocation());
		/*
		System.out.println("勇者2 名前は" + h2.getName());
		System.out.println("勇者2 現在の地図の色は" + h2.getColourValue() + "です");
		System.out.println("勇者2 現在のHPは" + h2.getHp());
		System.out.println("勇者2 ズームレベルは" + h2.getZoomLevel());
		System.out.println("勇者2 磁方位は" + h2.getRotation() + "です" );
		*/
		System.out.println("SHクラスが引数なしでインスタンス化された");
		//System.out.println("SHの居場所は" + sh.getHeroLocation());
		System.out.println("SHの名前は" + sh.getName());
		System.out.println("現在の地図の色は" + sh.getColourValue() + "です");
		System.out.println("現在のHPは" + sh.getHp());
		System.out.println("ズームレベルは" + sh.getZoomLevel());
		System.out.println("磁方位は" + sh.getRotation() + "です" );
		System.out.println("趣味は" + sh.getHobby() + "です");
		System.out.println("年は" + sh.getAge() + "歳です" );
		System.out.println("Hero's location is (" + heroLocation.getValue() +"," + heroLocation.getUnit() + ")です" );
		System.out.println("The Value of Hero's location is " + heroLocation.getValue() + "です" );
		System.out.println("The Unit of Hero's location is " + heroLocation.getUnit() + "です" );
		System.out.println("The X coordinate of Hero's location is " + p.getX() + "です" );
		//System.out.println("Hero's location called by Hero's method is " + h.getHeroLocation() + "です" );
		System.out.println("Hero's location called by Hero's method is " + h.heroLociton + "です" );
//		System.out.println("地図向きは" + h.getRoatation());
//		System.out.println("色設定は" + h.colourValue());
	}
}
