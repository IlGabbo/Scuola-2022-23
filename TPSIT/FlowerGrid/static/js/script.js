let w = 600;
let h = 300;
let diameter = 50;
let radius = diameter / 2;

function setup() {
    createCanvas(w, h)
    background("green");
    for (let i = diameter; i < (w / diameter) * diameter; i += diameter * 2) {
        for (let j = diameter; j < (h / diameter) * diameter; j += diameter * 2) {
            drawFlower(i, j, diameter)
        }
    }
}

function draw() {

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