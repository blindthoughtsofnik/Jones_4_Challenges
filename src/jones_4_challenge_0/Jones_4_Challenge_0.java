package jones_4_challenge_0;
public class Jones_4_Challenge_0 {
    public static void main(String[] args) {
        for(int i = 1; i < 501; i++){
            if(isDavis(i)) {
                System.out.println(" Davis " +i);
            }
            if(isDavis(i) & isClaughton(i)) {
                System.out.println( " Chisme " +i);
            }
            if(isClaughton(i)) {
                System.out.println( " Claughton " +i);
            }
            if(isClaughton(i) & isVidal(i)) {
                System.out.println( " Old School " +i);
            }
            if(isVidal(i)) {
                System.out.println( " Vidal " +i);
            }
            if(isDavis(i) & isClaughton(i) & isVidal(i)) {
                System.out.println( " Team Building " +i);
            }
            if(isDavis(i) & isEleven(i)) {
                System.out.println( " Ninja " +i);
            }
            if(isClaughton(i) & isEleven(i)) {
                System.out.println( " Herr Direktor " +i);
            }
            if(isVidal(i) & isEleven(i)) {
                    System.out.println( " Animate This!  " +i);
            }
            
            
                            
        }
}
    static boolean isDavis (int x) {
        return(x % 2 == 0);
}
    static boolean isClaughton (int y) {
        return(y % 3 == 0);
}
    static boolean isVidal (int z) {
        return(z % 5 == 0);
}
    static boolean isEleven (int a) {
        return(a % 11 == 0 );
    }
}