public class Animal {

    String especie;
    int age;
    int noise;

    public Animal(String especie, int age, int noise) {
        this.especie = especie;
        this.age = 0;
        this.noise = noise;
    }

    public String toString(){
        return "{" + especie + "}:" + "{" + age + "}:" + "{" + noise + "}";
    }

    public void ageby(){
        if(age>= 4){
            System.out.println("warning: {" + especie + "} morreu");
        }
        age++;
    }

    public void fzerBarulho(){
        if(age == 0){
            System.out.println("-");
        }
        else if(age >= 4){
            System.out.println("RIP");
        }
    }

    
}
