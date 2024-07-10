package StaticMethod;
interface DaoI{
    public static void greet(){
        System.out.println("Hello World");
    }
}
public interface StaticEx {
        public static void main(String[] args) {
        System.out.println("GOOD MORNING");
        DaoI.greet();
        DaoI.greet();
    }
}

