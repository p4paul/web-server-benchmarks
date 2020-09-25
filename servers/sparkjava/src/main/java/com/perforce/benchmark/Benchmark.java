package com.perforce.benchmark;

import spark.Spark;

public class Benchmark {

	public static void main(String[] args) {
		Spark.get("/fib/:number", (req, res) -> {
			int number = Integer.parseInt(req.params(":number"));
			return "______Sparkjava: fib(" + number + ") = " + fib(number);
		});

		Spark.get("/file", StaticFileUtil::file);
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
