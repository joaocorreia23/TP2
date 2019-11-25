import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private String name;
    private String user;

    private List<User>userList = new ArrayList<>();
    private List<Product>productList1 = new ArrayList<>();
    private List<Product>productList2 = new ArrayList<>();

    public ShoppingList(String name , String user , List<User>userList , List<Product>productList1, List<Product>productList2) {
        this.name = name;
        this.user = user;
        this.userList = userList;
        this.productList1 = productList1;
        this.productList2 = productList2;
    }

    //calcular soma dos valores dos carrinhos

    public int somaValores1(){

        int valor = 0;
        for(int i = 0 ; i < productList1.size(); i++) {
            valor = valor + productList1.get(i).getPrice();
        }
        return valor;
    }

    public int somaValores2(){

        int valor2 = 0;
        for(int i = 0 ; i < productList2.size(); i++) {
            valor2 = valor2 + productList2.get(i).getPrice();
        }
        return valor2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Product> getProductList1() {
        return productList1;
    }

    public void setProductList1(List<Product> productList1) {
        this.productList1 = productList1;
    }

    public List<Product> getProductList2() {
        return productList2;
    }

    public void setProductList2(List<Product> productList2) {
        this.productList2 = productList2;
    }
}


