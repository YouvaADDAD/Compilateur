var f = lambda(x) {
    return lambda (y) {
	return x + y;
    };
};

var g = f(2);

g(3);     /* ==> 5 */

function h(x) {
    return lambda (y) {
	return x + y;
    };
};

var k = f(2);

k(3);     /* ==> 5 */
