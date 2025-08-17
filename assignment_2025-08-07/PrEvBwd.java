public class PrEvBwd {

    static int calc(int a){
        return (a*a);
    }

    static void printer(int s, int e){
        for (int i = s; i >=e; i--) {
            if (i%2==0) {
                System.out.print(calc(i)+" ");
                
            }
            
        }
    }

    public static void main(String[] args) {
        printer(6, 1);
        
    }
    
}
