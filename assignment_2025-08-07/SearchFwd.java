public class SearchFwd {
    static void Search(int s, int e, int x){
        for (int i = s; i <=e; i++) {
            if (i==x) {
                System.out.println("Exist");
                
            }
            
        }
    }   

    public static void main(String[] args) {
        Search(1, 6, 4);
    }
}
