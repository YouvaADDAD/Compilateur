var maliste = cons(14,cons(1, cons(2, cons(4, nil)))) ; 
function length(l) {if (l == nil) {return 0;} else {return (1 + (length(cdr(l))));}}
length(maliste) ;