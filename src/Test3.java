public class Test3 {
    public static void main(String[] args)
    {
        Address A = new Address();
        A.setAddress1("Россия, Москва, Москва, Стасовой, 14, 1");
        System.out.println(A.toString());
        Address B = new Address();
        B.setAddress2("Россия, Москва. Москва; Стасовой, 14. 1");
        System.out.println(A.toString());
    }
}