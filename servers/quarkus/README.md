# Java + Quarkus

## Setup
    ./mvnw compile quarkus:dev
     
## Benchmark
    cd /Users/pallen/Workspaces/main.benchmark/wrk/

    ./wrk -c 64 -d 30s http://localhost:8080/fib/10
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency    24.36ms   86.89ms   1.87s    98.98%
        Req/Sec     1.64k   205.61     2.00k    71.67%
      98126 requests in 30.01s, 10.11MB read
      Socket errors: connect 0, read 0, write 0, timeout 36
    Requests/sec:   3269.86
    Transfer/sec:    344.87KB

    
    ./wrk -c 64 -d 30s http://localhost:8080/file


