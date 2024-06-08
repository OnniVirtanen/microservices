package main

import (
	"example.com/order-service/rest"
	"github.com/gin-gonic/gin"
)

func main() {
	initRouter()
}

func initRouter() {
	router := gin.Default()
	rest.SetupOrderRouter(router)
	const serverPort = "8080"
	router.Run(":" + serverPort)
}
