package recursion;

public class ReverseString {
    public static void print(String name,int index){
        if(index==name.length()){
            return;
        }
        print(name,index+1);

        System.out.print(name.charAt(index)+" ");
    }

    public static void main(String[] args) {
        print("vipin",0);

    }
}
