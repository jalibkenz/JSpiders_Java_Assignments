public class MainClass1 {
    
    int mobileCost;
    String mobileName;
    String mobileColour;


    MainClass1(int mobileCost, String mobileName, String mobileColour){
        this.mobileCost=mobileCost;
        this.mobileName=mobileName;
        this.mobileColour=mobileColour;
    }

    public boolean equals(Object obj){
       MainClass1 m1=(MainClass1)obj;
       return this.mobileCost==m1.mobileCost;
    }
    
    public static void main(String[] args) {
        MainClass1 m1=new MainClass1(20000,"Samsung","Black");
        MainClass1 m2=new MainClass1(20000,"Iphone","White");

        if(m1.equals(m2)){
            System.out.println("Both mobiles are of same cost");
        }else{
            System.out.println("Both mobiles are of different cost");
        }
        

    }
}
