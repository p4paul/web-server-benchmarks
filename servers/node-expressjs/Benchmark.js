var express = require("express");
const fs = require('fs');

var app = express();

var fib = function (n) {
    if (n === 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        return fib(n - 1) + fib(n - 2)
    }
};

app.get("/fib/:number", function (req, res) {
    var number = req.param("number");
    var result = fib(number);
    res.send("___Node+Express: fib(" + number + ") = " + result);
});

app.get("/file", function (req, res) {
    const path = '../sample/commons-lang-2.6.jar'
    //res.sendFile(path)
    const src = fs.createReadStream(path);
    src.pipe(res);
})

app.listen(3000);