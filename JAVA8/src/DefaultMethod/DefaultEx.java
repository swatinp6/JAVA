package DefaultMethod;
interface DaoI{
    public abstract void login();
    public abstract void logout();
    public default void updateProfile(){
        System.out.println("updated Successfully");
    }
    public static void deleteProfile(){
        System.out.println("deleted Successfully");
    }
}
public class DefaultEx implements DaoI{
    public void login(){
        System.out.println("Login succesfull");
    }
    public void logout(){
        System.out.println("Logout succesfull");
    }

    public static void main(String[] args) {
        DefaultEx obj = new DefaultEx();
        obj.login();
        obj.logout();
        obj.updateProfile();
        DaoI.deleteProfile();
    }

}
