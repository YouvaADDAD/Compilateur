function f (x) {
     let g = lambda (y) { return x * y + z; };

     return g;
}

let z = 3;
let g = f(z);

g(1);
