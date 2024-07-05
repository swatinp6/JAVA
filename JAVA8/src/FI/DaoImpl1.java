package FI;
@FunctionalInterface
interface DaoI1{
    public abstract void login();

}
public class DaoImpl1 {
    public static void main(String[] args) {
        DaoI1 dao=()->{System.out.println("login successfull");};
        dao.login();

    }
}
