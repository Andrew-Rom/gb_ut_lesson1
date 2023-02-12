package seminars.first.hw;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.setProducts(getTestProducts());
        //checkingSortingMethod(shop.getSortedListProducts());
        checkingSearchingMaxMethod(shop.getMostExpensiveProduct());
    }

    public static List<Product> getTestProducts() {
        List<Product> products = new ArrayList<>();
        String[] productTitle = {"bread", "water", "wine", "potato", "milk", "apple"};
        int[] productCost = {59, 40, 1200, 150, 110, 60};
        for (int i = 0; i < productTitle.length; i++) {
            products.add(new Product(productTitle[i], productCost[i]));
        }
        return products;
    }




    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */

    public static void checkingSortingMethod(List<Product> products) {
        assertThat(products).isNotEmpty();
        assertThat(products.size()).isEqualTo(6);
        assertThat(products.get(0).getTitle()).isEqualTo("water");
        assertThat(products.get(0).getCost()).isEqualTo(40);
        assertThat(products.toArray()).containsSequence("apple", "milk", "potato");
        assertThat(products.toArray()).endsWith(1200);
    }

    public static void checkingSearchingMaxMethod(Product expensiveProduct) {
        assertThat(expensiveProduct.getTitle()).isEqualTo("wine");
        assertThat(expensiveProduct.getCost()).isEqualTo(1200);

    }

//    public static void checkingHero(Hero hero) {
//        assertThat(hero.getName()).isEqualTo("Emmett");
//        assertThat(hero.getArmorStrength()).isEqualTo(50);
//        assertThat(hero.getWeapon()).isEqualTo("sword");
//        assertThat(hero.getBag())
//                .isNotEmpty()
//                .hasSize(3)
//                .contains("Bow", "Axe", "Gold");
//        assert hero.isHuman();
//    }
//
//}
}




