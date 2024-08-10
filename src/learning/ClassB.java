package learning;

public class ClassB extends ClassA{
    private ClassB classB;
    public ClassB() throws Exception {
        if(classB == null){
            classB = new ClassB();
        } else {
            throw new Exception("Class "+classB.getClass()+" cannot be instantiated more than once");
        }
    }

}
