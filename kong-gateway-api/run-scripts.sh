#!/bin/bash

# Define the directory of the current script
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# List the scripts in the order you want to run them
scripts=(
    "start-services.sh"
    "start-kong-gateway.sh"
    "apply-routes.sh"
)

# Iterate over the scripts and run each one
for script in "${scripts[@]}"; do
    script_path="$SCRIPT_DIR/$script"
    if [[ -f "$script_path" ]]; then
        echo "Running script: $script_path"
        bash "$script_path"
    else
        echo "Script $script_path not found!"
    fi
done