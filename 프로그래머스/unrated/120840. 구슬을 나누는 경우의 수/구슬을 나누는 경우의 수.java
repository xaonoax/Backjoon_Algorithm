import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger n = BigInteger.ONE;
        BigInteger x = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;

        for(int i=balls; i>0; i--) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        for(int i=balls-share; i>0; i--) {
            x = x.multiply(BigInteger.valueOf(i));
        }
        for(int i=share; i>0; i--) {
            m = m.multiply(BigInteger.valueOf(i));
        }

        BigInteger answer = n.divide(x.multiply(m));

        return answer.intValue();
    }
}