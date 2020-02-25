# ent-tdd-shopping-cart BASIC

You have been hired as a developer at Ali Snobba - a snobby online store where customers purchase high-end merchandise like Louis Vuitton handbags and Rolex watches.

Your job is to implement a shopping cart that stores items while customers are in the process of ordering. Since Ali Snobba is a small company with only one server, you don't need to store the items in Redis or a database - you can keep them in memory.

You also don't need to worry about authentication or session tracking. You can assume that Ali Snobba's infrastructure will handle this for you.

## API specifications

A shopping cart `Item` should have the following model:

| Item   |            |
|--------|------------|
| name   | String     |
| price  | currency   |
| onSale | bool       |

The shopping `Cart` should have the following model:

| Cart               |           |
|--------------------|-----------|
| getItems()         | Item(s)   |
| addItem(Item, int) | void      |
| itemizedList()     | String(s) |
| itemQuantities()   | String(s) |
| onSaleItems()      | String(s) |

`addItem()` should take two parameters:

1. An `Item` Object
1. An integer `quantity`

`itemQuantities()` should return one String for each type of item in the cart in the following format:

```Java
{
    'Handbag - x2', 
    'Watch - x4'
}
``` 

`itemizedList()` should return one String for each item in the cart in the following format:

```Java
{
    'Handbag x1 - $500.00', 
    'Watch x2 - $40,000.00'
}
``` 

`onSaleItems()` should return one String for each item in the cart marked as `onSale` in the following format:

```Java
{
    'Handbag x1 - $250.00', 
    'Watch x2 - $20,000.00'
}
```

## TODO
Implement code to satisfy the acceptance criteria below.  There are tests for all requirements in the file CartTest.java 
in the test tree.  You can uncomment them, or, if you are more comfortable, you can test with the main method in App.java.

## User Story:

- As a shopper
- I want to have a shopping cart
- So that I can store items until I am ready to checkout

## Acceptance Criteria:

1. Given that I visit the site, when I begin shopping, then I expect my cart to be empty.
1. Given I have an empty cart, when I add an Item, then I expect to `getTotalPrice()` reflect the sum of all the Items in my cart.
1. Given I have an empty cart, when I add items, then I expect `itemizedList()` reflect the items I have added along with their price.
1. Given I have an empty cart, when I add more than one of an item, then I expect `getTotalPrice()` to reflect both the item price and quantity.
1. Given I have an empty cart, when I add more than one of an item, then I expect `itemQuantities()` to show the number of items I have added.
1. Given I have a cart with items that are not on sale, when I add items that are on sale, I expect `onSaleItems()` to include only the items on sale.

## Additional Resources
- [Working with Currency](http://vanillajava.blogspot.de/2011/08/double-your-money-again.html)
- [String.format](https://dzone.com/articles/java-string-format-examples)
 
