var x = 10;
var z = 100;

var g = lambda (y, z) { return (lambda (y) { return x * y * z; }) (z); };

let x = 1000;
let z = 10000;

g(7, 17);
