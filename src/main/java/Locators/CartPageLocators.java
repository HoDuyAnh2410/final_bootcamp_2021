package Locators;

import org.openqa.selenium.By;

public class CartPageLocators {
    //elements of shoppingCartIcon, removeButton, checkOutButton, continueShoppingButton
    public static By img_shoppingCartIcon(By by) {
        return By.xpath("//a[@class='shopping_cart_link']");
    }
}
