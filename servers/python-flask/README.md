# Python Flask

## Setup
    pip install Flask
    pip install gunicorn

## Run
     # python benchmark.py
     gunicorn -w 4 benchmark:app
      
## Benchmark
    ./wrk -c 64 -d 30s http://localhost:5000/fib/10
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency    75.88ms   49.11ms 386.37ms   88.83%
        Req/Sec   229.94    162.86   797.00     75.08%
      13659 requests in 30.04s, 2.38MB read
    Requests/sec:    454.66
    Transfer/sec:     81.25KB
    
    ./wrk -c 64 -d 30s http://localhost:5000/file
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency   148.69ms   54.16ms 432.73ms   85.91%
        Req/Sec   159.49     79.33   353.00     64.50%
      9552 requests in 30.10s, 2.53GB read
    Requests/sec:    317.38
    Transfer/sec:     86.19MB
    
    ./wrk -c 64 -d 30s http://localhost:8000/file
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency   156.11ms   85.26ms 537.42ms   60.02%
        Req/Sec   192.00    146.23     1.24k    90.64%
      11468 requests in 30.02s, 3.04GB read
    Requests/sec:    382.02
    Transfer/sec:    103.67MB

