public class Main {
    public static void main(String[] args) {

        ComputerBuilder builder=new GamingComputerBuilder();
        ComputerDirector director=new ComputerDirector(builder);
        Computer gamingPc=director.constructGamingComputer();


        System.out.println(gamingPc);
        Computer officePc=director.constructOfficeComputer();

        System.out.println(officePc);



    }
}