public class SearchBwd {
    static void Search(int s, int e, int x){
        for (int i = s; i >=e; i--) {
            if (i==x) {
                System.out.println("Exist");
                
            }
            
        }
    }   

    public static void main(String[] args) {
        Search(6, 1, 2);
    }
}
