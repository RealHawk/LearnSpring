package ru.realhawk;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){

    }

    public  static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Do classical music init");
    }
    public  void doMyDestroy(){
        System.out.println("Do classical destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
