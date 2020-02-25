package com.galvanize.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

//     @Test
//     public void ShouldGetInitializedWithoutItemsOrTotalPrice() {
//         Cart cart = new Cart();
//
//         assertEquals(cart.getItems(), new ArrayList<Item>());
//         assertEquals(cart.getTotalPrice(), 0, 0);
//     }

//     @Test
//     public void ShouldAllowAddingItemsToCart() {
//         Cart cart = new Cart();
//
//         Item item1 = new Item("Fruit", 4.50);
//         Item item2 = new Item("Ice Cream", 5.50);
//
//         cart.AddItem(item1);
//         assertEquals(4.50, cart.getTotalPrice());
//
//         cart.AddItem(item2);
//         assertEquals(10.00, cart.getTotalPrice());
//     }

//     @Test
//     public void ShouldDisplayItemizedList() {
//       Cart cart = new Cart();
//       assertEquals(cart.ItemizedList(), new ArrayList<String>());
//
//       Item item1 = new Item("Coffee", 2.5);
//       Item item2 = new Item("Donuts", 4.5);
//       cart.AddItem(item1);
//       cart.AddItem(item2);
//       assertEquals(new ArrayList<String>(Arrays.asList("Coffee - $2.5", "Donuts - $4.5")), cart.ItemizedList());
//     }

//     @Test
//     public void ShouldAllowAddingMoreThanOneOfAGivenItemToTheCart() {
//       Cart cart = new Cart();
//
//       Item item1 = new Item("Fruit", 4.50);
//       Item item2 = new Item("Ice Cream", 5.50);
//
//       cart.AddItem(item1, 2);
//       assertEquals(9.0, cart.getTotalPrice());
//
//       cart.AddItem(item2, 4);
//       assertEquals(31.00, cart.getTotalPrice());
//     }

//     @Test
//     public void ShouldAllowYouToSeeHowManyOfEachItemIsInTheCart() {
//       Cart cart = new Cart();
//
//       Item coffee = new Item("Coffee", 1.50);
//       Item cream = new Item("Cream", 0.50);
//
//       assertEquals(new ArrayList<String>(), cart.ItemQuantities());
//
//       cart.AddItem(coffee, 2);
//       assertEquals( new ArrayList<String>(Arrays.asList("Coffee - 2")), cart.ItemQuantities());
//
//       cart.AddItem(cream, 4);
//       assertEquals(new ArrayList<String>(Arrays.asList("Coffee - 2", "Cream - 4")), cart.ItemQuantities());
//     }

//     @Test
//     public void ShouldDisplayTheNamesAndPricesOfItemsOnSale() {
//       Cart cart = new Cart();
//
//       Item item1 = new Item("Pie", 5.5, false);
//       Item item2 = new Item("Coffee", 2.5, true);
//       Item item3 = new Item("Donuts", 4.5, true);
//
//       cart.AddItem(item1);
//       assertEquals(new ArrayList<String>(), cart.OnSaleItems());
//
//       cart.AddItem(item2);
//       assertEquals(new ArrayList<String>(Arrays.asList("Coffee - $2.5")), cart.OnSaleItems());
//
//       cart.AddItem(item3);
//       assertEquals(new ArrayList<String>(Arrays.asList("Coffee - $2.5", "Donuts - $4.5")), cart.OnSaleItems());
//     }

}
