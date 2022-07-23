public class WhileLoopA {
public static void main(String[] args) {
    int i = 0;
    counter(i); // a method that counts to 9
}

public static void counter(int i){
    System.out.println("BEGIN");
    while(i < 10){
        System.out.println(i);
        i++;
    }
    System.out.println("END");
}



}
