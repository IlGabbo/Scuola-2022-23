let accelY = 0;
let accelX = 0;
let x = -25;
let y;
let diameter = 50;
let radius = diameter / 2;
let velX = 0;
let velY = 0;
let w = 400;
let h = 400;
y = h / 2;

function setup() {
    createCanvas(w, h);
    background(220);
}

function draw() {
    background(220);
    circle(x, y, radius);
    velY += accelY;
    y -= velY;
    velX += accelX;
    x += velX;
    if (x > w + radius) {
        x = -radius;
    }
    if (x < -radius) {
        x = w + radius;
    }
    if (y < -radius) {
        y = h + radius;
    }
    if (y > h + radius) {
        y = -radius;
        console.log("f ds")
    }
}

function resetDrawing() {

}