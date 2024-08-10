package learning;

public class ClassA {
    private ClassA classA;
    public ClassA() throws Exception {
        if(classA == null){
            classA = new ClassA();
            
        } else {
            throw new Exception("Class "+classA.getClass()+" cannot be instantiated more than once");
        }
    }

}
