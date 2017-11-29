/*
package lesson9;

public class EnumTest {
    public static class Tshirt{
        public enum Size {SMALL, MEDIUM, LARGE} // 사람마다 이상한 싸이즈를 만들어 쓰는게 아니라, 정해진 싸이즈만 사용할 수 있게 클래시가 아닌 enum으로 만든다.

        private final Size size;

        public Tshirt(Size $size){
            final Size size = $size;
            this.size = size;
        }
//$를 이쁘게? 하려고 붙이는건데 아직 확실하게 잘 모르겠음
        public boolean isFit(Person target){
            final int base = target.height/2 ;
            switch(this.size){
                case SMALL : return base < 50 ;
                case MEDIUM: return base < 70 ;
            }
        }
    }
}
*/
