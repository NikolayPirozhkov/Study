
/*
    реализуйте метод int min(int a, int b, int c),
    находящий минимальный из трех аргументов
 */
public class Main {
    int min(int a, int b, int c){

        //return a > b ? (a > c ? a : c) : b;
        return Math.max(Math.max(a, b), c);
    }
    public static void main(String[] args) {

    }
}
