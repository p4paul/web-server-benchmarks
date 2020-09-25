package main

import (
    "fmt"
    "github.com/gorilla/mux"
    "net/http"
    "strconv"
)

// fib returns a function that returns
// successive Fibonacci numbers.
func fib(n int) int {
    if n == 0 {
        return 0
    }
    if n == 1 {
        return 1
    }
    return fib(n-1) + fib(n-2)
}

func IndexHandler(w http.ResponseWriter, r *http.Request) {
    string_number := r.URL.Query().Get(":number")
    number, _ := strconv.Atoi(string_number)
    fmt.Fprintf(w, "_____Golang+mux: fib(%v) = %v", number, fib(number))
}

func FileHandler(w http.ResponseWriter, r *http.Request) {
    fp := "../sample/commons-lang-2.6.jar"
    http.ServeFile(w, r, fp)
    //fmt.Fprint(w, fp)
}


func main() {
    //runtime.GOMAXPROCS(runtime.NumCPU()-1)
    r := mux.NewRouter()
    r.HandleFunc("/fib/{number:[0-9]+}", IndexHandler)
    http.Handle("/fib/", r)


    r.HandleFunc("/file", FileHandler)
    http.Handle("/file", r)

    http.ListenAndServe(":6060", r)
}