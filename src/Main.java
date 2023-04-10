import Pokemon.CommonPokemon;
public class Main {
    public static void main(String[] args) {
        CommonPokemon niggachu = new CommonPokemon("Niggachu",100,"Water",30,20);
        CommonPokemon chad = new CommonPokemon("Chad",120,"Electric",20,10);
        niggachu.getAttacked(chad.getAttack());
        //niggachu.getAttackedByElement(chad.getType(), chad.getAttack());
        System.out.println(niggachu.getHP());
    }
}