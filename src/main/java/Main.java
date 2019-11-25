import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        List<User> ul = new ArrayList<>();
        List<Product> pl = new ArrayList<>();
        List<Product> pl2 = new ArrayList<>();

        //User
        User user1 = new User("Joao", "joao@gmail.com", "joao", "joao123", "Rua do Exemplo");
        User user2 = new User("Milton", "milton@gmal.com", "milton", "milton123", "Rua do Exemplo2");
        ul.add(user1);
        ul.add(user2);

        //Category
        Category category1 = new Category("Laticinios", "derivados de leite", "Branco");
        Category category2 = new Category("Vegetais", "legumes", "Verde");
        Category category3 = new Category("Talho", "carnes", "Vermelho");

        //Product
        Product product1 = new Product("Bifes de Peru", "Carne de Peru", "fotodobife", category3, 5, "Kg");
        Product product2 = new Product("Bifes de Vaca", "Carne de Vaca", "fotodobife2", category3, 10, "Kg");
        Product product3 = new Product("Iogurte", "Iogurte Danone", "fotodoiogurte", category1, 1, "Un");
        Product product4 = new Product("Cenouras", "Cenoura Legume", "fotodacenoura", category2, 2, "Kg");
        Product product5 = new Product("Repolho", "Repolho Legume", "fotodorepolho", category2, 3, "Kg");
        Product product6 = new Product("Queijo", "Queijo Limiano", "fotodoqueijo", category1, 2, "Un");
        Product product7 = new Product("Frango", "Carne de Frango", "fotodofrango", category3, 3, "Kg");

        //Adicionar os produtos as listas
        pl.add(product1); // já no carrinho
        pl.add(product2); // já no carrinho
        pl2.add(product3); //ainda nao estao no carrinho
        pl2.add(product4); //ainda nao estao no carrinho
        pl2.add(product5); //ainda nao estao no carrinho
        pl2.add(product6); //ainda nao estao no carrinho
        pl2.add(product7); //ainda nao estao no carrinho

        //ShoppingList
        ShoppingList sl1 = new ShoppingList("Compras", "Joao", ul, pl, pl2);

        //Prints

        //Nome das pessoas com quem a lista está a ser partilhada separado
        System.out.println("Lista de Pessoas Partilhada:");
        for (int i = 0; i < sl1.getUserList().size(); i++) {
            System.out.println(sl1.getUserList().get(i).getName());
        }

        //Nº de produtos + total de preço dos produtos que se encontram no carrinho
        System.out.println("Produtos no Carrinho:");
        for (int x = 0; x < sl1.getProductList1().size(); x++) {
            System.out.println(sl1.getProductList1().get(x).getName());
        }
        System.out.println("Valor Carrinho:");
        System.out.println(sl1.somaValores1()+" euros");


        //Nº de produtos + total do preço dos protudos que estão ainda na lista
        System.out.println("Produtos que nao estao no carrinho:");
        for (int y = 0; y < sl1.getProductList2().size(); y++) {
            System.out.println(sl1.getProductList2().get(y).getName());
        }
        System.out.println("Valor dos produtos que nao estao no carrinho:");
        System.out.println(sl1.somaValores2()+" euros");

        //Percentagem de complete
        System.out.println("Percentagem de Complete:");
        double resultado;

        resultado = ((double) 2 / 7) * 100;
        System.out.printf("Percentagem = %.2f %n",  (resultado));

        //Imprimir categorias e os produtos referentes




    }
}

