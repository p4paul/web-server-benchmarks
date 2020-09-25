# Java + Spark

## Setup
    ./gradlew clean build

## Run
     java -jar build/libs/sparkjava.jar
     
## Benchmark
    cd /Users/pallen/Workspaces/main.benchmark/wrk/

    ./wrk -c 64 -d 30s http://localhost:4567/fib/10
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     1.24ms    2.89ms 138.92ms   99.18%
        Req/Sec    30.18k     3.20k   38.02k    84.39%
      1808086 requests in 30.10s, 334.52MB read
    Requests/sec:  60061.35
    Transfer/sec:     11.11MB
    
    ./wrk -c 64 -d 30s http://localhost:4567/file
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     6.40ms    7.63ms 258.41ms   98.28%
        Req/Sec     4.60k     1.03k    6.11k    77.76%
      274835 requests in 30.03s, 72.80GB read
    Requests/sec:   9150.59
    Transfer/sec:      2.42GB

