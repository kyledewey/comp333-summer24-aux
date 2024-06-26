function AddThis(x) {
    this.x = x;
}
AddThis.prototype.add = function(y) {
    return this.x + y;
}
AddThis.prototype.sub = function(y) {
    return y - this.x;
}

// FOR NEXT TIME: finish up 2.e and 2.f
// let newObj = new AddThis();
// delete newObj.x;
// newObj.mul = function (y) {
//     return this.x * y;
// };
// AddThis.prototype = newObj;

// let newObj = {};
// newObj.__proto__ = AddThis.prototype;
// newObj.mul = function (y) {
//     return this.x * y;
// }

let newObj = {
    '__proto__': AddThis.prototype,
    'mul': function (y) {
	return this.x * y;
    }
};
AddThis.prototype = newObj;

// let mult = new AddThis(x);
// AddThis.prototype = mult.__proto__;
// mult.mul = function (y) { this.x * y; }

// function multiply(x) {
//     this.x = x;
// }
// multiply.prototype = AddThis;

// AddThis.prototype = {
//     'add': function (y) { return this.x + y; },
//     'sub': function (y) { return y - this.x; },
//     'mul': function (y) { return this.x * y; }
// }

// function multiply(x) {
//     this.x = x;
// }
// multiply.prototype = new AddThis();
// multiply.prototype.mul = function(y) {
//     return this.x * y;
// }

let withOne = new AddThis(1);
let withFive = new AddThis(5);
console.log(withOne.add(1));  // 2
console.log(withFive.add(2)); // 7

