# Golang gorilla-pat

## Setup
    go get github.com/gorilla/mux
    
## Run
    go run benchmark.go
    
## Benchmark
    cd /Users/pallen/Workspaces/main.benchmark/wrk/

    ./wrk -c 64 -d 30s http://localhost:6060/10
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     0.88ms  198.92us   5.75ms   80.05%
        Req/Sec    35.60k     3.39k   45.86k    62.79%
      2131949 requests in 30.10s, 292.78MB read
    Requests/sec:  70826.60
    Transfer/sec:      9.73MB
    
    ./wrk -c 64 -d 30s http://localhost:6060/file
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     6.12ms    3.00ms 107.03ms   87.57%
        Req/Sec     4.20k     1.02k    6.13k    65.27%
      250634 requests in 30.07s, 66.39GB read
    Requests/sec:   8334.26
    Transfer/sec:      2.21GB

