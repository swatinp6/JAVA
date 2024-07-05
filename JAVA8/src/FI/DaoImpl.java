package FI;

@FunctionalInterface
interface DaoI{
    public abstract void login();
    //void logout();
}
class DaoImpl implements DaoI{
    public void login(){
        System.out.println("login success");
    }

    public static void main(String[] args) {
        DaoI dao=new DaoImpl();
        dao.login();
    }
}
