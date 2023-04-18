

public class Hello {

    public static void main(String[] args){
        System.out.println(1 + 1);
        System.out.println('1'+'1');
        PrintHello h = new PrintHello();
        h.print();
        PrintBye h2 = new PrintBye();
        h2.print();
    }
}

