//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Computer gaminPc=new Computer.Builder("Intel i9",32)
                .gpu("RTX 4090")
                .disc(512)
                .hasBluetooth(true)
                .build();

        System.out.println(gaminPc);

    }
}