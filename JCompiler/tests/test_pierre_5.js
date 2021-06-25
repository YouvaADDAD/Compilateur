var f = lambda(x) {
  return lambda (y) { return x + y; };
};

var g = f(2);
var h = f(100);

g(3);
