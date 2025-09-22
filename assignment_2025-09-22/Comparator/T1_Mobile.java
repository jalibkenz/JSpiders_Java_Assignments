import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mobile{
    int mCost;
    String mModel;
    String mColor;

    Mobile(int mCost,String mModel, String mColor){
        this.mCost=mCost;
        this.mModel=mModel;
        this.mColor=mColor;
    }

    public String toString(){
        return "Mobile->"+ "Cost: "+mCost+" | Model: "+mModel+" | Colour: "+mColor+"\n";
    }

}

class SortByCost implements Comparator<Mobile>{
    public int compare(Mobile o1, Mobile o2){
        if(o1.mCost>o2.mCost){return +1;}
        else if (o1.mCost<o2.mCost){return -1;}
        else return 0;
    }
}

class SortByModel implements Comparator<Mobile>{
    public int compare(Mobile o1, Mobile o2){
        return o1.mModel.compareToIgnoreCase(o2.mModel);
    }
}

class T1_Mobile{
    public static void main(String[] args){
        ArrayList<Mobile> al= new ArrayList<Mobile>();
        al.add(new Mobile(50000,"Sony","Black"));
        al.add(new Mobile(10000,"Samsung","Black"));
        al.add(new Mobile(30000,"Apple","Silver"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByCost()");
        Collections.sort(al, new SortByCost());
        System.out.println(al);
        System.out.println("After SortByModel()");
        Collections.sort(al, new SortByModel());
        System.out.println(al);

    }
}

