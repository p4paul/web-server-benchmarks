# Node + Express

## Setup 
    npm install express
    
## Run
    node Benchmark.js
    
## Benchmark
    cd /Users/pallen/Workspaces/main.benchmark/wrk/
        
    ./wrk -c 64 -d 30s http://localhost:3000/fib/10
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     5.71ms  825.29us  31.55ms   95.11%
        Req/Sec     5.64k   470.97     6.00k    95.02%
      337963 requests in 30.10s, 75.42MB read
    Requests/sec:  11226.99
    Transfer/sec:      2.51MB
    
    ./wrk -c 64 -d 30s http://localhost:3000/file
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency    15.68ms    6.10ms  87.67ms   88.82%
        Req/Sec     2.09k   524.51     2.66k    78.17%
      124528 requests in 30.00s, 33.00GB read
    Requests/sec:   4150.25
    Transfer/sec:      1.10GB

    ./wrk -c 64 -d 30s http://localhost:3000/file
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency    14.36ms    2.97ms  81.11ms   92.23%
        Req/Sec     2.25k   253.07     2.55k    77.50%
      134275 requests in 30.00s, 35.57GB read
    Requests/sec:   4475.29
    Transfer/sec:      1.19GB
