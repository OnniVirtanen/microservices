#!/bin/bash

# Install the Gateway API CRDs before installing Kong Ingress Controller.
kubectl apply -f https://github.com/kubernetes-sigs/gateway-api/releases/download/v1.0.0/standard-install.yaml

# Create a Gateway and GatewayClass instance to use.
kubectl apply -f ./kong-gateway.yaml
kubectl apply -f ./kong-gateway-class.yaml

# add the kong helm charts
helm repo add kong https://charts.konghq.com
helm repo update

# install kong ingress controller and kong gateway with helm
helm install kong kong/ingress -n kong --create-namespace --set gateway.image.repository=kong --set gateway.image.tag="3.7.0"