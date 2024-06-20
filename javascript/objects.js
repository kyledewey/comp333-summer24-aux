// rectangle objects
// { 'width': 3, 'height': 4 }

// function makeRectangle(width, height) {
//     return { 'width': width,
// 	     'height': height };
// }

// function getArea() {
//     return this.width * this.height;
// }
// let rectanglePrototype = {};
// rectanglePrototype.getArea = getArea;

// let rectanglePrototype = {
//     'getArea': function () {
// 	return this.width * this.height;
//     }
// }

function Rectangle(width, height) {
    // this = {};
    // this.__proto__ = Rectangle.prototype;
    this.width = width;
    this.height = height;
    // this.__proto__ = rectanglePrototype;
    // this.getArea = function () {
    // 	return this.width * this.height;
    // };
    // return this;
}
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
}
Rectangle.prototype.getWidth = function () {
    return this.width;
}

function add(x, y) {
    return x + y;
}
