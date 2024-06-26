package org.sujith.sec01;

import reactor.core.publisher.Mono;

import java.util.function.Supplier;

public class Lec03MonoSubscribe {

    public static void main(String[] args){
        Mono<Integer> mono = Mono.just(2);
        mono.subscribe(c -> System.out.printf("Received  %d",c));
        System.out.println("Hello");


        Mono<String> mono2 = Mono.fromSupplier(() -> { return "hi";});
        mono2.subscribe(c -> System.out.printf("Received  %s",c));


        Supplier supplier;

    }

    static String getStr(){
        return "hi";
    }
}
