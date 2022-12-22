public class Test2 {
    public static void main(String[] args) {
        Person A = new Person("Максимов");
        System.out.println(A.toString());
        Person B = new Person("Тимошенко","Андрей");
        System.out.println(B.toString());
        Person C = new Person("Селезнев", "Максим", "Семенович");
        System.out.println(C.toString());
    }
}