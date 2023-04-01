package org.example;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloClient {
    public static void main( String[] args )
    {
        ServiceLoader<HelloProvider> helloProviderLoader = ServiceLoader.load(HelloProvider.class);
        Optional<HelloProvider> findFirst = helloProviderLoader.findFirst();
        HelloProvider helloProvider = findFirst.orElseThrow();
        helloProvider.hello();
    }

}
