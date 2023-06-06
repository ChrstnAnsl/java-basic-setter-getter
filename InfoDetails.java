public class InfoDetails {
    String name;
    int age;

    public static void main(String[] args) {
        InfoDetails info = new InfoDetails();

        info.setName("Chrstnnsl");
        info.setAge((24));
        info.showDetails();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void showDetails() {
        System.out.println(getName() + ", " + getAge());
    }
}