package org.example;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloClient {

    public static HelloProvider getDefault(){
        ServiceLoader<HelloProvider> helloProviderLoader = ServiceLoader.load(HelloProvider.class);

        for (HelloProvider provider: helloProviderLoader){
            return provider;
        }
        throw new Error("Something wrong");
    }

    public static void main(String[] args) {
        HelloProvider helloProvider = HelloClient.getDefault();
        helloProvider.hello();
    }
}
