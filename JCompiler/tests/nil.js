var maliste = cons(14,cons(1, cons(2, cons(4, nil)))) ; 
function length(l) {if (l == nil) {return 0;} else {return (1 + (length(cdr(l))));}}
length(maliste) ;
print(maliste);
var add = lambda(a, b) {
            return a + b;
          };
var mult = lambda(a, b) {
        return a * b;
    };
var div = lambda(a, b) {
        return a / b;
    };
print(add);
var[a,b]=cons(2,4);
let [c,d]=cons(8,16);
var e=mult(add(a,b),div(d,c));
print(e);
var f=readInt();
print(e*f);
