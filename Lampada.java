public class Lampada {

    Boolean ligada = false;
    int contador = 0;

    public void interruptorLampada(){
        if(ligada == false){
            ligada = true;
            contador++;
        }
        else{
            ligada = false;
        }
    }
    public int contadorLampada(){
        return contador;
    }

    public boolean statusLAmpada(){
        return ligada;
    }
}
