class whatsapp {
    private String pswd="1";

    public void setpswd (String pswd){
        this.pswd=pswd;

    }
    public String getpswd(){
        return pswd;

    }

}

class MainClass_3{
    public static void main(String[] args) {
        whatsapp i = new whatsapp();
        System.out.println(i.getpswd());
        i.setpswd("2");
        System.out.println(i.getpswd());
    }
}