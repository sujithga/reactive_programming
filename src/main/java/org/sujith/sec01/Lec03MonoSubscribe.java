package org.sujith.sec01;

import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {

    public static void main(String[] args){
        Mono<Integer> mono = Mono.just(2);
        mono.subscribe(c -> System.out.printf("Received  %d",c));
        System.out.println("Hello");

    }
}
