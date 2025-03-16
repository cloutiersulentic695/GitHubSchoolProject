import java.util.Random;
class RandomCode{
    public static void main(String[] args){
        int n=10;
        StringBuffer str = new StringBuffer();
        for(int i=0;i<n;i++){
            int c=(char) (((int)'a')+rand.nextInt(26));
            str.append((char)c);
        }
        System.out.println("Random string: "+str);
    }
}