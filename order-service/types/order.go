package types

type Order struct {
	id string  `json:"id"`
	customerId string `json:"customerId"`
	productIds []string `json:"productsIds"`
	price Money `json:"price"`
	date string `json:"date"`
}