package my.edu.univeristy;

public class Arithmetic {

    int a;
    int b;

    public Arithmetic(){
        System.out.println("Constructor()");
        a = 0;
        b = 0;
    }
    public Arithmetic(int a, int b){
        System.out.println("Constructor(int, int)");
        this.a = a;
        this.b = b;
    }


    public void sum(){
        int result = this.a + this.b;
        System.out.println("result = " + result);
    }

    public int sumWithReturn(){

        int result = this.a + this.b;
        return result;
    }

    public int sumWithArgs(int a, int b){
        this.a = a;
        this.b = b;
//        return this.a + this.b;
        return sumWithReturn();
    }

}
