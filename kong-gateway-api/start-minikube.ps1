# Save this as start-minikube.ps1

# Check if running as Administrator
if (-Not ([Security.Principal.WindowsPrincipal] [Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator"))
{
    Write-Error "Please run this script as an administrator."
    exit
}

# deletes existing minikube
minikube delete

# starts minikube in hyperv
minikube start --driver=hyperv --cpus 2 --memory 8192
