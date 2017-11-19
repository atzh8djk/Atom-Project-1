/**
 * ヒーローの現在位置を定義するクラス
 * @author akira
 *
 */

public class HeroLocation {
	        public int value;
	        public int unit;
					public int hp;

	        public HeroLocation(int value, int unit) {
	            this.value = value;
	            this.unit = unit;
	        }

	        public HeroLocation() {
	            this.value = 12;
	            this.unit = 16;
	        }

	        public int getValue() {
	            return value;
	        }

	        public int getUnit() {
	            return unit;
	        }
		}
