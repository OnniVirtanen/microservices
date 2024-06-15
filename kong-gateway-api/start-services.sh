#!/bin/bash

# services and deployments
# postgres
kubectl apply -f ../postgres/postgres-deployment.yaml  
kubectl apply -f ../postgres/postgres-service.yaml 

# order
kubectl apply -f ../order-service/order-deployment.yaml
kubectl apply -f ../order-service/order-service.yaml

# catalog
kubectl apply -f ../catalog-service/catalog-deployment.yaml
kubectl apply -f ../catalog-service/catalog-service.yaml 