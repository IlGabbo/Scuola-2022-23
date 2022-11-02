let w = window.innerWidth;
let h = window.innerHeight;
let diameter = 50;
let radius = diameter / 2;

function setup() {
    createCanvas(w, h)
    background("green");
    /*
     (let i = diameter; i < (w / diameter) * diameter; i += diameter * 2) {
        for (let j = diameter; j < (h / diameter) * diameter; j += diameter * 2) {
            drawFlower(i, j, diameter)
        }
    }
    */
}

let i = diameter;
let j = diameter;

function draw() {
    frameRate(5);
    if (i < (w / diameter) * diameter) {
        drawFlower(i, j, diameter);
        i += diameter * 2;
    } else {
        i = diameter;
        j += diameter * 2;
    }
    if (j > (h / diameter) * diameter) {
        noLoop();
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