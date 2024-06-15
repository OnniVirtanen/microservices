#!/bin/bash

kubectl apply -f ./catalog-route.yml

kubectl apply -f ./order-route.yml
