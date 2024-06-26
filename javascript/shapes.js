//    Shape
//    /   \
// Circle  Rectangle

function Shape() {}
Shape.prototype.isShape = function() {
    return true;
}

Rectangle.prototype = new Shape();
// Rectangle.prototype = { '__proto__': Shape.prototype };
// Rectangle.prototype.__proto__ = Shape.prototype;
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
}
Rectangle.prototype.getWidth = function () {
    return this.width;
}
function Rectangle(width, height) {
    this.width = width;
    this.height = height;
}

Circle.prototype = new Shape();
Circle.prototype.getRadius = function() {
    return this.radius;
}
function Circle(radius) {
    this.radius = radius;
}
