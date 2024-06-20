function forEach(array, func) {
    for (let index = 0; index < array.length; index++) {
	let element = array[index];
	func(element);
    }
}

function printSome(array, predicate) {
    forEach(array,
	    function (e) {
		if (predicate(e)) {
		    console.log(e);
		}
	    });
}

// for (int index = 0; index < array.length; index++) {
//   int element = array[index];
//   if (...) {
//     // do something with element
//   }
// }

function sum(array) {
    return reduce(array, (a, e) => a + e, 0);
    // let retval = 0;
    // for (let index = 0; index < array.length; index++) {
    // 	let element = array[index];
    // 	retval = retval + element;
    // }
    // return retval;
}

function product(array) {
    return reduce(array, (a, e) => a * e, 1);
    // let retval = 1;
    // for (let index = 0; index < array.length; index++) {
    // 	let element = array[index];
    // 	retval = retval * element;
    // }
    // return retval;
}

// Running value: accumulator
// 
// Differences:
// - Initial value
// - Operation (a function):
//     - Takes the current accumulator
//     - Takes the current array element
//     - Returns the new accumulator
function reduce(array, operation, initialValue) {
    let accumulator = initialValue;
    for (let index = 0; index < array.length; index++) {
	let element = array[index];
	// accumulator = accumulator * element;
	accumulator = operation(accumulator, element);
    }
    return accumulator;
}
