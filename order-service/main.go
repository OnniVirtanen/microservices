package main

import (
	"fmt"
	"order-service/types/money"
    "order-service/types/order"
)

func main() {
    // Create a Money instance using the constSructor
    orderPrice := NewMoneyFromFloat(1234.56)

    // Create an Order instance
    order := Order{
        id:         "12345",
        customerId: "cust001",
        productIds: []string{"prod1", "prod2", "prod3"},
        price:      orderPrice,
        date:       "2023-06-08",
    }

    // Print the Order details
    fmt.Printf("Order ID: %s\n", order.id)
    fmt.Printf("Customer ID: %s\n", order.customerId)
    fmt.Printf("Product IDs: %v\n", order.productIds)
    fmt.Printf("Price: %s\n", order.price.ToString()) // Price formatted with two decimals
    fmt.Printf("Date: %s\n", order.date)
}