# Java + Javelin

## Setup
    ./gradlew clean build

## Run
     java -jar build/libs/javelin.jar
     
## Benchmark
    cd /Users/pallen/Workspaces/main.benchmark/wrk/

    ./wrk -c 64 -d 30s http://localhost:7000/fib/10
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     2.21ms    9.19ms 161.87ms   96.79%
        Req/Sec    35.44k     7.17k   46.29k    83.61%
      2110365 requests in 30.04s, 297.86MB read
      Socket errors: connect 0, read 24, write 0, timeout 0
    Requests/sec:  70249.22
    Transfer/sec:      9.92MB
    
    ./wrk -c 64 -d 30s http://localhost:7000/file
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency    93.74ms   58.74ms 751.77ms   79.08%
        Req/Sec   362.43     71.50   535.00     71.50%
      21430 requests in 30.03s, 5.68GB read
    Requests/sec:    713.61
    Transfer/sec:    193.84MB



