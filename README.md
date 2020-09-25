# Benchmark

Inspired by the Medium post: https://medium.com/@BijanRahnema/express-vs-flask-vs-go-acc0879c2122

## HTTP Benchmarking tool 

From https://github.com/wg/wrk with a forked copy to https://github.com/p4paul/wrk

Build as per the docs and use the `wrk` binary as described in each `servers/` directory.

## Benchmarks

### Fibonacci calculation

Using a recursive call to calculate Fibonacci through 10 iterations, returning the result 55 as a string.

My benchmarks a farily close to the original article, but I use a `/fib/:number` endpoint.

### Serve a JAR file from my local file system

Uses a hard coded path to a JAR in my maven `.m2/` cache.
