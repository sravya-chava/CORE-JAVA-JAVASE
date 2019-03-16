
public class WebUser<T> {
T login_id;
T password;
private Userstate state;

    public WebUser(T login_id, T password, Userstate state) {
        this.login_id = login_id;
        this.password = password;
        this.state = state;
    }

    public WebUser() {

    }

    public T getLogin_id() {
        return login_id;
    }

    public void setLogin_id(T login_id) {
        this.login_id = login_id;
    }

    public T getPassword() {
        return password;
    }

    public void setPassword(T password) {
        this.password = password;
    }

    public Userstate getState() {
        return state;
    }

    public void setState(Userstate state) {
        this.state = state;
    }

    public void displayClass()
    {
        System.out.println("\n"+"Iam a Web User");
    }
}

class StudentUser extends WebUser   {
    public StudentUser() {
        super();
    }

    public void displayClass(){
        System.out.println("I am a student user");
    }
}
class StaffUser extends WebUser   {
    public StaffUser() {
        super();
    }

    public void displayClass(){
        System.out.println("Iam a staff user");
    }
}