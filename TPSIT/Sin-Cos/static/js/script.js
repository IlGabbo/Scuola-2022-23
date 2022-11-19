let angle = 0;
let amplitude = 100;
let phase = 0;
let frequency = 1;

function setup() {
    createCanvas(window.innerWidth, 400);
    background(220);
    angleMode(DEGREES);
    line(0, 200, window.innerWidth, 200);
}

function draw() {
    strokeWeight(3);
    stroke(0, 0, 255);
    let y2 = amplitude * cos(frequency * angle + phase);
    point(angle, y2 + 200);
    strokeWeight(3);
    stroke(255, 0, 0);
    let y = amplitude * sin(frequency * angle + phase);
    point(angle, y + 200);
    angle += 1;
    if (angle > window.innerWidth)
        resetDrawing();
}

function resetDrawing() {
    background(220);
    strokeWeight(1);
    stroke("black");
    line(0, 200, window.innerWidth, 200);
    angle = 0;
}