package com.pixel.j8samples;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> doubledFuture = future.thenApplyAsync(result -> result * 2);

        // Use join() to wait for the result and print it
        int result = doubledFuture.join();
        System.out.println("Result: " + result);
    }
}
