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
	const serverPort = "3000"
	router.Run(":" + serverPort)
}
