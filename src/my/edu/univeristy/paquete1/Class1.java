package my.edu.univeristy.paquete1;

 class Class1 {

    private String privateAttribute = "Protected Attribute Value";




    private Class1(){
        System.out.println("Protected Constructor.");
    }


    public Class1(String str){
        this();
        System.out.println("Public Constructor.");
    }



    protected void publicMethod(){
        System.out.println("Public Method");
    }


}
