public class Sheep implements Cloneable{
        //interface Cloneable used for classes that we want to clone
    private String name;
    private int age;

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
        //We do like this because it's protected
    }

    public static void main(String[] args) {
        try {
            Sheep dolly = new Sheep("Dolly", 12);
            Sheep dolly2 = (Sheep) dolly.clone(); //We're cloning dolly for new dolly2

            dolly2.setName("Kelly");//Cloning is very fast for creating new objects, that's why we use them. I gave my new object a name Kelly

            System.out.println(dolly.getName() + ", " + dolly.getAge());
            System.out.println(dolly2.getName() + ", " + dolly2.getAge());
        }catch (CloneNotSupportedException e){} //"try" and "catch" - for exceptions, we haven't learned this yet
    }
}
