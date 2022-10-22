let w = 600;
let h = 300;
let diameter = 50;
let radius = diameter / 2;

function setup() {
    createCanvas(w, h)
    background("green");
}

function draw() {
    let counterX = 0;
    let counterY = 0;
    let offsetX = 0;
    let offsetY = 0;
    while (counterY < 10) {
        while (counterX < 10) {
            drawFlower(counterX + offsetX, counterY + offsetY, diameter);
            offsetX += diameter * 2;
            counterX++;
        }
        offsetY += diameter * 2;
        counterY++;
    }
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