package grammar.oop.enum1;

//抽象枚举
public enum B {
    X() {
        @Override
        public void go() {

        }
    }, Y("丁真") {
        @Override
        public void go() {
            System.out.println(getName());
        }
    };
    public abstract void go();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private B(String name) {
        this.name = name;
    }

    private B() {
    }

    
}
