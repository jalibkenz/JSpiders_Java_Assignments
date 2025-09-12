class snapchat {
    private String pswd="1";

    public void setpswd (String pswd){
        this.pswd=pswd;

    }
    public String getpswd(){
        return pswd;

    }

}

class MainClass_2{
    public static void main(String[] args) {
        snapchat i = new snapchat();
        System.out.println(i.getpswd());
        i.setpswd("2");
        System.out.println(i.getpswd());
    }
}