public class User {
    private String userName;
    private int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void doSomething (){
        System.out.println("Do something!");
    }

    @Override
    public String toString() {
        return "Name: " + this.userName + "  " + "Age: " + this.userAge;
    }

    public static void main(String[] args) {
        User user = new User("Alex", 28);
        System.out.println(user.toString());
        user.doSomething();
    }
}
