
public class Test1 {
    public static void main(String[] args) {
        Test A = new Test("I love MIREA!!!");
        System.out.println(A.getString());
        System.out.println("Последний символ строки: "+A.getString().charAt(A.BackIndex()));
        System.out.println("Строка заканчивается на !!!: "+A.getString().endsWith("!!!"));
        System.out.println("Строка начинается с I love: "+A.getString().startsWith("I love"));
        A.setString("I love MIREA!!!");
        System.out.println("Строка содержит Java: "+A.getString().contains("Java"));
        System.out.println("Позиция подстроки MIREA в строке: "+A.getString().indexOf("MIREA"));
        A.setString(A.getString().replace("I", "*"));
        System.out.println("Заменить в строке все I на *: "+A.getString());
        A.setString(A.getString().toUpperCase());
        System.out.println("Преобразование к верхнему регистру: "+A.getString());
        A.setString(A.getString().toLowerCase());
        System.out.println("Преобразование к нижнему регистру: "+A.getString());
        A.setString("I love MIREA!!!");
        Test B = new Test(A.getString().substring(A.getString().indexOf("MIREA"), A.getString().indexOf("MIREA") + 5));
        System.out.println("Вырезать строку MIREA: "+B.getString());
    }
}