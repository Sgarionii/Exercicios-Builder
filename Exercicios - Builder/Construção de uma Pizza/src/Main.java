import entidades.Pizza;
import builders.PizzaBuilder;

public class Main {

    public static void main(String[] args) {
        executarPizza();
    }

    private static void executarPizza() {
        Pizza pizzaCalabresa = new PizzaBuilder().setMassa("Siciliana").setTamanho("Grande").setIngrediente("Calabresa").build();
        Pizza pizzaFrango = new PizzaBuilder().setMassa("Toscana").setTamanho("Grande").setIngrediente("Frango").build();

        System.out.println(pizzaCalabresa.toString());
        System.out.println(pizzaFrango.toString());
    }
}