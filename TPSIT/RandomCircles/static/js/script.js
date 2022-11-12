let w = 600;
let h = 600;
let diameter;

function setup() {
    createCanvas(w, h);
    background(255, 255, 255);
}

function draw() {
    if (frameCount % 1000 === 0) {
        background(255, 255, 255);
    }
    fill(random(255), random(255), random(255), random(255))
    noStroke();
    circle(random(600), random(600), random(30, 90))
}