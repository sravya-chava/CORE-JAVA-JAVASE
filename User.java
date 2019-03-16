public class User <T extends WebUser>{
    private T objRef;
    public User(T obj){
        this.objRef = obj;
    }
    public void doRunTest(){
        this.objRef.displayClass();
    }
}

