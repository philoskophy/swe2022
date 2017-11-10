package lesson7;

import java.util.Random;

public class LocalClassTest {
    static public void main(String[] arg){
        IntSequence seq = randomInts(3, 5);
        System.out.println(seq.next());
        System.out.println(seq.next());
        System.out.println(seq.next());
    }
    private static Random generator = new Random();
    public static IntSequence randomInts(int low, int high){
        /*내부클래스
        class RandomSquence implements IntSequence{
            @Override
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }
        }
        return new RandomSquence();
        */
        /*익명클래스
        return new IntSequence(){
            @Override
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }
        };
        */
        //람다 수준
        return ()->low + generator.nextInt(high - low + 1);

    }
}
