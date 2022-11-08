let w = 600;
let h = 300;
let diameter = 50;
let radius = diameter / 2;
let currentX = diameter;
let delta = 5;

function setup() {
    createCanvas(w, h)
    background("green");
}

function draw() {
    frameRate(60);
    background("green");
    drawFlower(currentX, h / 2, diameter);
    if (currentX <= diameter) {
        delta = Math.abs(delta)
    } else if (currentX >= w - diameter) {
        delta *= -1
    }
    currentX += delta;
}

function drawFlower(x, y, d) {
    strokeWeight(4);
    stroke("black");
    fill("orange");
    circle(x - radius, y + radius, d)

    strokeWeight(4);
    stroke("black");
    fill("orange");
    circle(x + radius, y + radius, d)

    strokeWeight(4);
    stroke("black");
    fill("orange");
    circle(x - radius, y - radius, d)

    strokeWeight(4);
    stroke("black");
    fill("orange");
    circle(x + radius, y - radius, d)

    strokeWeight(4);
    stroke("black");
    fill("red");
    circle(x, y, diameter)
}