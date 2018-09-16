package prototype.base;

import single.Singleton;

public class ClassRoom {

    private String name;
    private String type;
    private Singleton singleton;

    public ClassRoom() {
    }

    public ClassRoom(String name, String type,Singleton singleton) {
        this.name = name;
        this.type = type;
        this.singleton = singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Singleton getSingleton() {
        return singleton;
    }

    public void setSingleton(Singleton singleton) {
        this.singleton = singleton;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", singleton=" + singleton +
                '}';
    }
}
