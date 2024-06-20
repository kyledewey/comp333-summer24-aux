// predicate: function that takes an element
//            returns a boolean.  True means
//            print the element, else don't print
function printSome(array, predicate) {
    for (let index = 0; index < array.length; index++) {
	let element = array[index];
	if (predicate(element)) {
	    console.log(element);
	}
    }
}

function printAll(array) {
    // (e) => {
    //   console.log("hi");
    //   return true;
    // }
    printSome(array, (e) => true);
    // for (let index = 0; index < array.length; index++) {
    // 	let element = array[index];
    // 	if (true) {
    // 	    console.log(element);
    // 	}
    // }
}

// what about <=, ==
// what about % 3 == 0?
// function printAllComparison(array, isLessThan, amount) {
//     for (let index = 0; index < array.length; index++) {
// 	let element = array[index];
// 	if (isLessThan) {
// 	    if (element < amount) {
// 		console.log(element);
// 	    }
// 	} else {
// 	    if (element > amount) {
// 		console.log(element);
// 	    }
// 	}
//     }
// }

function printAllLessThan(array, amount) {
    printSome(array,
	      // closure - closes over amount
	      // (saves amount)
	      function (elem) {
		  return elem < amount;
	      });
    // for (let index = 0; index < array.length; index++) {
    // 	let element = array[index];
    // 	if (element < amount) {
    // 	    console.log(element);
    // 	}
    // }
}

function printAllGreaterThan(array, amount) {
    printSome(array, (e) => e > amount);
    //               function (e) {
    //                 return e > amount;
    //               }
    
    // for (let index = 0; index < array.length; index++) {
    // 	let element = array[index];
    // 	if (element > amount) {
    // 	    console.log(element);
    // 	}
    // }
}

function printAllLessThanFive(array) {
    return printAllLessThan(array, 5);
}

function printAllLessThanThree(array) {
    return printAllLessThan(array, 3);
}
    
function callMe(foo) {
    foo();
}

function indirectIf(boolVal, isT, isF) {
    if (boolVal) {
	isT();
    } else {
	isF();
    }
}

function indirectWhile(bool, nothing) {
    if (bool()) {
	nothing();
	indirectWhile(bool, nothing);
    }
}

function indirectAdd(x) {
    return function (y) {
	return x + y;
    };
}

// Haskell: multThree x y z = x * y * z
function multThree(x, y, z) {
    return x * y * z;
}

// currying
function indirectMultThree(x) {
    return function (y) {
	return function (z) {
	    return x * y * z;
	}
    }
}

function returnParam(param) { return param; }

// def wrapAdd(func: (Int) => Int, integer: Int): (Int) => Int
function wrapAdd(func, integer) {
    // return func;
    return function (param) {
	let plus = param + integer;
	return func(plus);
    };
}

// wrapAdd:
//   -Takes a function
//     -Takes one parameter
//     -Returns something
//   -Takes an integer
//   -Returns a function
//     -Takes one parameter
//     -Returns something
//
// let f = wrapAdd(returnParam, 5);
// let x = f(2); // x = 7
// let y = f(3); // y = 8

function min(x, y) {
    if (x < y) {
	return x;
    } else {
	return y;
    }
}
