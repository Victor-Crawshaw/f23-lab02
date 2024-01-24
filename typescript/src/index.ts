import { newRenderer } from "./renderer.js"
import { Shape } from "./shapes/shape.js";
import { square } from "./shapes/square.js";
import { circle } from "./shapes/circle.js";
import { newRectangle } from "./shapes/rectangle.js";

const my_rectangle: Shape = newRectangle(2, 3);
const my_square: Shape = square(4);
const my_circle: Shape = circle(5);

const renderer1 = newRenderer(my_rectangle);
const renderer2 = newRenderer(my_square);
const renderer3 = newRenderer(my_circle);

renderer1.draw();
renderer2.draw();
renderer3.draw(); 