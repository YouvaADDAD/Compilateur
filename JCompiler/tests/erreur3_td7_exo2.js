function foo (x) {
    function fii (y) {
	return x + y;
    }

    var z = 100;

    return fii(5);
}

foo(4);
fii(5);
foo(4);
fii(5);

var z = 200;
z;
