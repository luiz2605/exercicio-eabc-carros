public class MainLampada {
    
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.interruptorLampada();
        l1.interruptorLampada();
        l1.interruptorLampada();

        System.out.println(l1.statusLAmpada());
        System.out.println(l1.contadorLampada());
    }
}