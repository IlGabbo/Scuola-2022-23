let w = 600;
let h = 300;
let diameter = 110;
let radius = diameter / 2;

function setup() {
    createCanvas(w, h)
    background("green");
}

function draw() {
    drawFlower(0);
    drawFlower(w / 2);
    drawFlower(w);
}

function drawFlower(x) {
    strokeWeight(4);
    stroke("black");
    fill("orange");
    circle(x - radius, h / 2 + radius, diameter)

    strokeWeight(4);
    stroke("black");
    fill("orange");
    circle(x + radius, h / 2 + radius, diameter)

    strokeWeight(4);
    stroke("black");
    fill("orange");
    circle(x - radius, h / 2 - radius, diameter)

    strokeWeight(4);
    stroke("black");
    fill("orange");
    circle(x + radius, h / 2 - radius, diameter)

    strokeWeight(4);
    stroke("black");
    fill("red");
    circle(x, h / 2, diameter)
}