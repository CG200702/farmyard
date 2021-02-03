
package farmyard;


public class animal {
    protected String name;
    protected String type;
    protected int age;
//can access it in the subclasses
    public animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String toString(){
        return name +", "+type+", "+age;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
